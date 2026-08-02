package okhttp3.internal.connection;

import android.security.NetworkSecurityPolicy;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.moshi.Moshi;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import okhttp3.Address;
import okhttp3.ConnectionPool;
import okhttp3.ConnectionSpec;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.ResponseBody;
import okhttp3.ResponseBody$Companion$asResponseBody$1;
import okhttp3.Route;
import okhttp3.internal._HostnamesCommonKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.platform.Android10Platform;
import okhttp3.internal.platform.Platform;
import okio.Path$$ExternalSyntheticBUOutline0;
import papa.AppUpdateData;

/* loaded from: classes3.dex */
public final class RealRoutePlanner {
    public final Address address;
    public final RealCall call;
    public final RealConnectionPool connectionPool;
    public final ArrayDeque deferredPlans;
    public final boolean doExtensiveHealthChecks;
    public final boolean fastFallback;
    public Route nextRouteToTry;
    public final int pingIntervalMillis;
    public final int readTimeoutMillis;
    public final boolean retryOnConnectionFailure;
    public final ConnectionPool routeDatabase;
    public Moshi.Builder routeSelection;
    public RouteSelector routeSelector;
    public final int socketConnectTimeoutMillis;
    public final int socketReadTimeoutMillis;
    public final TaskRunner taskRunner;
    public final int writeTimeoutMillis;

    public RealRoutePlanner(TaskRunner taskRunner, RealConnectionPool realConnectionPool, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, Address address, ConnectionPool connectionPool, RealCall realCall, Request request) {
        taskRunner.getClass();
        realConnectionPool.getClass();
        connectionPool.getClass();
        this.taskRunner = taskRunner;
        this.connectionPool = realConnectionPool;
        this.readTimeoutMillis = i;
        this.writeTimeoutMillis = i2;
        this.socketConnectTimeoutMillis = i3;
        this.socketReadTimeoutMillis = i4;
        this.pingIntervalMillis = i5;
        this.retryOnConnectionFailure = z;
        this.fastFallback = z2;
        this.address = address;
        this.routeDatabase = connectionPool;
        this.call = realCall;
        this.doExtensiveHealthChecks = !Intrinsics.areEqual(request.method, "GET");
        this.deferredPlans = new ArrayDeque();
    }

    public final boolean hasNext(RealConnection realConnection) {
        RouteSelector routeSelector;
        Route route;
        if (this.deferredPlans.isEmpty() && this.nextRouteToTry == null) {
            if (realConnection != null) {
                synchronized (realConnection) {
                    route = null;
                    if (realConnection.routeFailureCount == 0 && realConnection.noNewExchanges && _UtilJvmKt.canReuseConnectionFor(realConnection.route.address.url, this.address.url)) {
                        route = realConnection.route;
                    }
                }
                if (route != null) {
                    this.nextRouteToTry = route;
                    return true;
                }
            }
            Moshi.Builder builder = this.routeSelection;
            if ((builder == null || builder.lastOffset >= builder.factories.size()) && (routeSelector = this.routeSelector) != null) {
                return routeSelector.hasNext();
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final RoutePlanner$Plan plan() {
        Socket releaseConnectionNoEvents$okhttp;
        ReusePlan reusePlan;
        ConnectPlan planConnectToRoute$okhttp;
        String str;
        int i;
        List<InetAddress> lookup;
        boolean contains;
        RealConnection realConnection = this.call.connection;
        if (realConnection != null) {
            boolean isHealthy = realConnection.isHealthy(this.doExtensiveHealthChecks);
            synchronized (realConnection) {
                boolean z = realConnection.noNewExchanges;
                try {
                    if (isHealthy) {
                        if (!z) {
                            HttpUrl httpUrl = realConnection.route.address.url;
                            httpUrl.getClass();
                            HttpUrl httpUrl2 = this.address.url;
                            if (httpUrl.port == httpUrl2.port && Intrinsics.areEqual(httpUrl.host, httpUrl2.host)) {
                                releaseConnectionNoEvents$okhttp = null;
                            }
                        }
                        releaseConnectionNoEvents$okhttp = this.call.releaseConnectionNoEvents$okhttp();
                    } else {
                        realConnection.noNewExchanges = true;
                        releaseConnectionNoEvents$okhttp = this.call.releaseConnectionNoEvents$okhttp();
                    }
                } finally {
                }
            }
            if (this.call.connection != null) {
                if (releaseConnectionNoEvents$okhttp != null) {
                    a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                    return null;
                }
                reusePlan = new ReusePlan(realConnection);
                if (reusePlan == null) {
                    return reusePlan;
                }
                ReusePlan planReusePooledConnection$okhttp = planReusePooledConnection$okhttp(null, null);
                if (planReusePooledConnection$okhttp != null) {
                    return planReusePooledConnection$okhttp;
                }
                if (!this.deferredPlans.isEmpty()) {
                    return (RoutePlanner$Plan) this.deferredPlans.removeFirst();
                }
                Route route = this.nextRouteToTry;
                if (route != null) {
                    this.nextRouteToTry = null;
                    planConnectToRoute$okhttp = planConnectToRoute$okhttp(route, null);
                } else {
                    Moshi.Builder builder = this.routeSelection;
                    if (builder == null || builder.lastOffset >= builder.factories.size()) {
                        RouteSelector routeSelector = this.routeSelector;
                        if (routeSelector == null) {
                            routeSelector = new RouteSelector(this.address, this.routeDatabase, this.call, this.fastFallback);
                            this.routeSelector = routeSelector;
                        }
                        if (!routeSelector.hasNext()) {
                            a$$ExternalSyntheticBUOutline0.m$4("exhausted all routes");
                            return null;
                        }
                        if (!routeSelector.hasNext()) {
                            a$$ExternalSyntheticBUOutline0.m();
                            return null;
                        }
                        ArrayList arrayList = new ArrayList();
                        while (routeSelector.nextProxyIndex < routeSelector.proxies.size()) {
                            if (routeSelector.nextProxyIndex >= routeSelector.proxies.size()) {
                                throw new SocketException("No route to " + routeSelector.address.url.host + "; exhausted proxy configurations: " + routeSelector.proxies);
                            }
                            List list = routeSelector.proxies;
                            int i2 = routeSelector.nextProxyIndex;
                            routeSelector.nextProxyIndex = i2 + 1;
                            Proxy proxy = (Proxy) list.get(i2);
                            ArrayList arrayList2 = new ArrayList();
                            routeSelector.inetSocketAddresses = arrayList2;
                            if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                HttpUrl httpUrl3 = routeSelector.address.url;
                                str = httpUrl3.host;
                                i = httpUrl3.port;
                            } else {
                                SocketAddress address = proxy.address();
                                if (!(address instanceof InetSocketAddress)) {
                                    Path$$ExternalSyntheticBUOutline0.m$3(address.getClass(), "Proxy.address() is not an InetSocketAddress: ");
                                    return null;
                                }
                                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                                InetAddress address2 = inetSocketAddress.getAddress();
                                if (address2 == null) {
                                    str = inetSocketAddress.getHostName();
                                    str.getClass();
                                } else {
                                    str = address2.getHostAddress();
                                    str.getClass();
                                }
                                i = inetSocketAddress.getPort();
                            }
                            if (1 > i || i >= 65536) {
                                throw new SocketException("No route to " + str + ':' + i + "; port is out of range");
                            }
                            if (proxy.type() == Proxy.Type.SOCKS) {
                                arrayList2.add(InetSocketAddress.createUnresolved(str, i));
                            } else {
                                Regex regex = _HostnamesCommonKt.VERIFY_AS_IP_ADDRESS;
                                str.getClass();
                                if (_HostnamesCommonKt.VERIFY_AS_IP_ADDRESS.matches(str)) {
                                    lookup = CollectionsKt__CollectionsJVMKt.listOf(InetAddress.getByName(str));
                                } else {
                                    routeSelector.call.eventListener.dnsStart(routeSelector.call, str);
                                    lookup = routeSelector.address.dns.lookup(str);
                                    if (lookup.isEmpty()) {
                                        throw new UnknownHostException(routeSelector.address.dns + " returned no addresses for " + str);
                                    }
                                    routeSelector.call.eventListener.dnsEnd(routeSelector.call, str, lookup);
                                }
                                if (routeSelector.fastFallback) {
                                    lookup.getClass();
                                    if (lookup.size() >= 2) {
                                        ArrayList arrayList3 = new ArrayList();
                                        ArrayList arrayList4 = new ArrayList();
                                        for (Object obj : lookup) {
                                            if (((InetAddress) obj) instanceof Inet6Address) {
                                                arrayList3.add(obj);
                                            } else {
                                                arrayList4.add(obj);
                                            }
                                        }
                                        if (!arrayList3.isEmpty() && !arrayList4.isEmpty()) {
                                            byte[] bArr = _UtilCommonKt.EMPTY_BYTE_ARRAY;
                                            Iterator it = arrayList3.iterator();
                                            Iterator it2 = arrayList4.iterator();
                                            ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                                            while (true) {
                                                if (!it.hasNext() && !it2.hasNext()) {
                                                    break;
                                                }
                                                if (it.hasNext()) {
                                                    createListBuilder.add(it.next());
                                                }
                                                if (it2.hasNext()) {
                                                    createListBuilder.add(it2.next());
                                                }
                                            }
                                            lookup = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
                                        }
                                    }
                                }
                                Iterator<InetAddress> it3 = lookup.iterator();
                                while (it3.hasNext()) {
                                    arrayList2.add(new InetSocketAddress(it3.next(), i));
                                }
                            }
                            Iterator it4 = routeSelector.inetSocketAddresses.iterator();
                            while (it4.hasNext()) {
                                Route route2 = new Route(routeSelector.address, proxy, (InetSocketAddress) it4.next());
                                ConnectionPool connectionPool = routeSelector.routeDatabase;
                                synchronized (connectionPool) {
                                    contains = ((LinkedHashSet) connectionPool.delegate).contains(route2);
                                }
                                if (contains) {
                                    routeSelector.postponedRoutes.add(route2);
                                } else {
                                    arrayList.add(route2);
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                break;
                            }
                        }
                        if (arrayList.isEmpty()) {
                            CollectionsKt__MutableCollectionsKt.addAll(routeSelector.postponedRoutes, arrayList);
                            routeSelector.postponedRoutes.clear();
                        }
                        Moshi.Builder builder2 = new Moshi.Builder(arrayList);
                        this.routeSelection = builder2;
                        if (this.call.canceled) {
                            a$$ExternalSyntheticBUOutline0.m$4("Canceled");
                            return null;
                        }
                        if (builder2.lastOffset >= arrayList.size()) {
                            a$$ExternalSyntheticBUOutline0.m();
                            return null;
                        }
                        int i3 = builder2.lastOffset;
                        builder2.lastOffset = i3 + 1;
                        planConnectToRoute$okhttp = planConnectToRoute$okhttp((Route) arrayList.get(i3), arrayList);
                    } else {
                        int i4 = builder.lastOffset;
                        ArrayList arrayList5 = builder.factories;
                        if (i4 >= arrayList5.size()) {
                            a$$ExternalSyntheticBUOutline0.m();
                            return null;
                        }
                        int i5 = builder.lastOffset;
                        builder.lastOffset = i5 + 1;
                        planConnectToRoute$okhttp = planConnectToRoute$okhttp((Route) arrayList5.get(i5), null);
                    }
                }
                ReusePlan planReusePooledConnection$okhttp2 = planReusePooledConnection$okhttp(planConnectToRoute$okhttp, planConnectToRoute$okhttp.routes);
                return planReusePooledConnection$okhttp2 != null ? planReusePooledConnection$okhttp2 : planConnectToRoute$okhttp;
            }
            if (releaseConnectionNoEvents$okhttp != null) {
                _UtilJvmKt.closeQuietly(releaseConnectionNoEvents$okhttp);
            }
            this.call.eventListener.connectionReleased(this.call, realConnection);
        }
        reusePlan = null;
        if (reusePlan == null) {
        }
    }

    public final ConnectPlan planConnectToRoute$okhttp(Route route, ArrayList arrayList) {
        route.getClass();
        Address address = route.address;
        if (address.sslSocketFactory == null) {
            if (!address.connectionSpecs.contains(ConnectionSpec.CLEARTEXT)) {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
            String str = route.address.url.host;
            Android10Platform android10Platform = Platform.platform;
            Platform.platform.getClass();
            str.getClass();
            if (!NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str)) {
                throw new UnknownServiceException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CLEARTEXT communication to ", str, " not permitted by network security policy"));
            }
        } else if (address.protocols.contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        Request request = null;
        if (route.proxy.type() == Proxy.Type.HTTP) {
            Address address2 = route.address;
            if (address2.sslSocketFactory != null || address2.protocols.contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
                Request.Builder builder = new Request.Builder();
                HttpUrl httpUrl = route.address.url;
                httpUrl.getClass();
                builder.url = httpUrl;
                builder.method("CONNECT", null);
                Address address3 = route.address;
                builder.header("Host", _UtilJvmKt.toHostHeader(address3.url, true));
                builder.header("Proxy-Connection", "Keep-Alive");
                builder.header("User-Agent", "okhttp/5.4.0");
                request = new Request(builder);
                ResponseBody$Companion$asResponseBody$1 responseBody$Companion$asResponseBody$1 = ResponseBody.EMPTY;
                Headers.Builder builder2 = new Headers.Builder();
                HttpUrl.Companion companion = Protocol.Companion;
                AppUpdateData.headersCheckName("Proxy-Authenticate");
                AppUpdateData.headersCheckValue("OkHttp-Preemptive", "Proxy-Authenticate");
                builder2.removeAll("Proxy-Authenticate");
                AppUpdateData.commonAddLenient(builder2, "Proxy-Authenticate", "OkHttp-Preemptive");
                builder2.build();
                responseBody$Companion$asResponseBody$1.getClass();
                address3.proxyAuthenticator.getClass();
            }
        }
        return new ConnectPlan(this.taskRunner, this.connectionPool, this.readTimeoutMillis, this.writeTimeoutMillis, this.socketConnectTimeoutMillis, this.socketReadTimeoutMillis, this.pingIntervalMillis, this.retryOnConnectionFailure, this.call, this, route, arrayList, request, -1, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x003d, code lost:
    
        if ((r7.http2Connection != null) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ReusePlan planReusePooledConnection$okhttp(ConnectPlan connectPlan, List list) {
        RealConnection realConnection;
        boolean z;
        Socket releaseConnectionNoEvents$okhttp;
        RealConnectionPool realConnectionPool = this.connectionPool;
        boolean z2 = this.doExtensiveHealthChecks;
        Address address = this.address;
        RealCall realCall = this.call;
        boolean z3 = connectPlan != null && connectPlan.isReady();
        realConnectionPool.getClass();
        Iterator it = ((ConcurrentLinkedQueue) realConnectionPool.connections).iterator();
        it.getClass();
        while (true) {
            if (!it.hasNext()) {
                realConnection = null;
                break;
            }
            realConnection = (RealConnection) it.next();
            realConnection.getClass();
            synchronized (realConnection) {
                if (z3) {
                    try {
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (realConnection.isEligible$okhttp(address, list)) {
                    realCall.acquireConnectionNoEvents(realConnection);
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                if (realConnection.isHealthy(z2)) {
                    break;
                }
                synchronized (realConnection) {
                    realConnection.noNewExchanges = true;
                    releaseConnectionNoEvents$okhttp = realCall.releaseConnectionNoEvents$okhttp();
                }
                if (releaseConnectionNoEvents$okhttp != null) {
                    _UtilJvmKt.closeQuietly(releaseConnectionNoEvents$okhttp);
                }
            }
        }
        if (realConnection == null) {
            return null;
        }
        if (connectPlan != null) {
            this.nextRouteToTry = connectPlan.route;
            Socket socket = connectPlan.javaNetSocket;
            if (socket != null) {
                _UtilJvmKt.closeQuietly(socket);
            }
        }
        this.call.eventListener.connectionAcquired(this.call, realConnection);
        return new ReusePlan(realConnection);
    }
}
