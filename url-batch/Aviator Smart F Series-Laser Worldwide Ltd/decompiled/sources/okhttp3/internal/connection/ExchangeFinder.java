package okhttp3.internal.connection;

import com.baidu.mapapi.http.wrapper.HttpManager;
import java.io.IOException;
import java.net.Socket;
import java.util.List;
import kotlin.jvm.internal.s;
import okhttp3.Address;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RouteSelector;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import y5.w;

/* loaded from: classes5.dex */
public final class ExchangeFinder {
    private final Address address;
    private final RealCall call;
    private final RealConnectionPool connectionPool;
    private int connectionShutdownCount;
    private final EventListener eventListener;
    private Route nextRouteToTry;
    private int otherFailureCount;
    private int refusedStreamCount;
    private RouteSelector.Selection routeSelection;
    private RouteSelector routeSelector;

    public ExchangeFinder(RealConnectionPool connectionPool, Address address, RealCall call, EventListener eventListener) {
        s.checkNotNullParameter(connectionPool, "connectionPool");
        s.checkNotNullParameter(address, "address");
        s.checkNotNullParameter(call, "call");
        s.checkNotNullParameter(eventListener, "eventListener");
        this.connectionPool = connectionPool;
        this.address = address;
        this.call = call;
        this.eventListener = eventListener;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final RealConnection findConnection(int i8, int i9, int i10, int i11, boolean z7) {
        List<Route> routes;
        Socket releaseConnectionNoEvents$okhttp;
        if (this.call.isCanceled()) {
            throw new IOException("Canceled");
        }
        RealConnection connection = this.call.getConnection();
        if (connection != null) {
            synchronized (connection) {
                try {
                    if (!connection.getNoNewExchanges() && sameHostAndPort(connection.route().address().url())) {
                        releaseConnectionNoEvents$okhttp = null;
                        w wVar = w.INSTANCE;
                    }
                    releaseConnectionNoEvents$okhttp = this.call.releaseConnectionNoEvents$okhttp();
                    w wVar2 = w.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.call.getConnection() != null) {
                if (releaseConnectionNoEvents$okhttp == null) {
                    return connection;
                }
                throw new IllegalStateException("Check failed.".toString());
            }
            if (releaseConnectionNoEvents$okhttp != null) {
                Util.closeQuietly(releaseConnectionNoEvents$okhttp);
            }
            this.eventListener.connectionReleased(this.call, connection);
        }
        this.refusedStreamCount = 0;
        this.connectionShutdownCount = 0;
        this.otherFailureCount = 0;
        if (this.connectionPool.callAcquirePooledConnection(this.address, this.call, null, false)) {
            RealConnection connection2 = this.call.getConnection();
            s.checkNotNull(connection2);
            this.eventListener.connectionAcquired(this.call, connection2);
            return connection2;
        }
        Route route = this.nextRouteToTry;
        try {
            if (route == null) {
                RouteSelector.Selection selection = this.routeSelection;
                if (selection != null) {
                    s.checkNotNull(selection);
                    if (selection.hasNext()) {
                        RouteSelector.Selection selection2 = this.routeSelection;
                        s.checkNotNull(selection2);
                        route = selection2.next();
                    }
                }
                RouteSelector routeSelector = this.routeSelector;
                if (routeSelector == null) {
                    routeSelector = new RouteSelector(this.address, this.call.getClient().getRouteDatabase(), this.call, this.eventListener);
                    this.routeSelector = routeSelector;
                }
                RouteSelector.Selection next = routeSelector.next();
                this.routeSelection = next;
                routes = next.getRoutes();
                if (this.call.isCanceled()) {
                    throw new IOException("Canceled");
                }
                if (this.connectionPool.callAcquirePooledConnection(this.address, this.call, routes, false)) {
                    RealConnection connection3 = this.call.getConnection();
                    s.checkNotNull(connection3);
                    this.eventListener.connectionAcquired(this.call, connection3);
                    return connection3;
                }
                route = next.next();
                RealConnection realConnection = new RealConnection(this.connectionPool, route);
                this.call.setConnectionToCancel(realConnection);
                realConnection.connect(i8, i9, i10, i11, z7, this.call, this.eventListener);
                this.call.setConnectionToCancel(null);
                this.call.getClient().getRouteDatabase().connected(realConnection.route());
                if (this.connectionPool.callAcquirePooledConnection(this.address, this.call, routes, true)) {
                    synchronized (realConnection) {
                        this.connectionPool.put(realConnection);
                        this.call.acquireConnectionNoEvents(realConnection);
                        w wVar3 = w.INSTANCE;
                    }
                    this.eventListener.connectionAcquired(this.call, realConnection);
                    return realConnection;
                }
                RealConnection connection4 = this.call.getConnection();
                s.checkNotNull(connection4);
                this.nextRouteToTry = route;
                Util.closeQuietly(realConnection.socket());
                this.eventListener.connectionAcquired(this.call, connection4);
                return connection4;
            }
            s.checkNotNull(route);
            this.nextRouteToTry = null;
            realConnection.connect(i8, i9, i10, i11, z7, this.call, this.eventListener);
            this.call.setConnectionToCancel(null);
            this.call.getClient().getRouteDatabase().connected(realConnection.route());
            if (this.connectionPool.callAcquirePooledConnection(this.address, this.call, routes, true)) {
            }
        } catch (Throwable th2) {
            this.call.setConnectionToCancel(null);
            throw th2;
        }
        routes = null;
        RealConnection realConnection2 = new RealConnection(this.connectionPool, route);
        this.call.setConnectionToCancel(realConnection2);
    }

    private final RealConnection findHealthyConnection(int i8, int i9, int i10, int i11, boolean z7, boolean z8) {
        RouteSelector.Selection selection;
        RouteSelector routeSelector;
        while (true) {
            RealConnection findConnection = findConnection(i8, i9, i10, i11, z7);
            if (findConnection.isHealthy(z8)) {
                return findConnection;
            }
            findConnection.noNewExchanges$okhttp();
            if (this.nextRouteToTry == null && (selection = this.routeSelection) != null && !selection.hasNext() && (routeSelector = this.routeSelector) != null && !routeSelector.hasNext()) {
                throw new IOException("exhausted all routes");
            }
        }
    }

    private final Route retryRoute() {
        RealConnection connection;
        if (this.refusedStreamCount > 1 || this.connectionShutdownCount > 1 || this.otherFailureCount > 0 || (connection = this.call.getConnection()) == null) {
            return null;
        }
        synchronized (connection) {
            if (connection.getRouteFailureCount$okhttp() != 0) {
                return null;
            }
            if (Util.canReuseConnectionFor(connection.route().address().url(), getAddress$okhttp().url())) {
                return connection.route();
            }
            return null;
        }
    }

    public final ExchangeCodec find(OkHttpClient client, RealInterceptorChain chain) {
        s.checkNotNullParameter(client, "client");
        s.checkNotNullParameter(chain, "chain");
        try {
            return findHealthyConnection(chain.getConnectTimeoutMillis$okhttp(), chain.getReadTimeoutMillis$okhttp(), chain.getWriteTimeoutMillis$okhttp(), client.pingIntervalMillis(), client.retryOnConnectionFailure(), !s.areEqual(chain.getRequest$okhttp().method(), HttpManager.HTTP_GET)).newCodec$okhttp(client, chain);
        } catch (IOException e8) {
            trackFailure(e8);
            throw new RouteException(e8);
        } catch (RouteException e9) {
            trackFailure(e9.getLastConnectException());
            throw e9;
        }
    }

    public final Address getAddress$okhttp() {
        return this.address;
    }

    public final boolean retryAfterFailure() {
        RouteSelector routeSelector;
        if (this.refusedStreamCount == 0 && this.connectionShutdownCount == 0 && this.otherFailureCount == 0) {
            return false;
        }
        if (this.nextRouteToTry != null) {
            return true;
        }
        Route retryRoute = retryRoute();
        if (retryRoute != null) {
            this.nextRouteToTry = retryRoute;
            return true;
        }
        RouteSelector.Selection selection = this.routeSelection;
        if ((selection != null && selection.hasNext()) || (routeSelector = this.routeSelector) == null) {
            return true;
        }
        return routeSelector.hasNext();
    }

    public final boolean sameHostAndPort(HttpUrl url) {
        s.checkNotNullParameter(url, "url");
        HttpUrl url2 = this.address.url();
        return url.port() == url2.port() && s.areEqual(url.host(), url2.host());
    }

    public final void trackFailure(IOException e8) {
        s.checkNotNullParameter(e8, "e");
        this.nextRouteToTry = null;
        if ((e8 instanceof StreamResetException) && ((StreamResetException) e8).errorCode == ErrorCode.REFUSED_STREAM) {
            this.refusedStreamCount++;
        } else if (e8 instanceof ConnectionShutdownException) {
            this.connectionShutdownCount++;
        } else {
            this.otherFailureCount++;
        }
    }
}
