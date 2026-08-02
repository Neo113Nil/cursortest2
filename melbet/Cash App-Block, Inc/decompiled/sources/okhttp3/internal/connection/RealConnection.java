package okhttp3.internal.connection;

import androidx.compose.ui.node.RulerTrackingMap;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Address;
import okhttp3.CertificatePinner;
import okhttp3.Connection;
import okhttp3.ConnectionPool;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Route;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.FlowControlListener$None;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.Http2Writer;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.internal.tls.OkHostnameVerifier;
import okio.RealBufferedSource;
import papa.internal.LaunchTracker;

/* loaded from: classes3.dex */
public final class RealConnection extends Http2Connection.Listener implements Connection, ExchangeCodec.Carrier {
    public int allocationLimit;
    public final ArrayList calls;
    public final Handshake handshake;
    public Http2Connection http2Connection;
    public long idleAtNs;
    public final Socket javaNetSocket;
    public boolean noCoalescedConnections;
    public boolean noNewExchanges;
    public final int pingIntervalMillis;
    public final Protocol protocol;
    public final Socket rawSocket;
    public int refusedStreamCount;
    public final Route route;
    public int routeFailureCount;
    public final LaunchTracker socket;
    public int successCount;
    public final TaskRunner taskRunner;

    public RealConnection(TaskRunner taskRunner, RealConnectionPool realConnectionPool, Route route, Socket socket, Socket socket2, Handshake handshake, Protocol protocol, LaunchTracker launchTracker, int i) {
        taskRunner.getClass();
        realConnectionPool.getClass();
        route.getClass();
        socket.getClass();
        socket2.getClass();
        protocol.getClass();
        launchTracker.getClass();
        this.taskRunner = taskRunner;
        this.route = route;
        this.rawSocket = socket;
        this.javaNetSocket = socket2;
        this.handshake = handshake;
        this.protocol = protocol;
        this.socket = launchTracker;
        this.pingIntervalMillis = i;
        this.allocationLimit = 1;
        this.calls = new ArrayList();
        this.idleAtNs = Long.MAX_VALUE;
    }

    public static void connectFailed$okhttp(OkHttpClient okHttpClient, Route route, IOException iOException) {
        okHttpClient.getClass();
        route.getClass();
        iOException.getClass();
        if (route.proxy.type() != Proxy.Type.DIRECT) {
            Address address = route.address;
            address.proxySelector.connectFailed(address.url.uri(), route.proxy.address(), iOException);
        }
        ConnectionPool connectionPool = okHttpClient.routeDatabase;
        synchronized (connectionPool) {
            ((LinkedHashSet) connectionPool.delegate).add(route);
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public final void cancel() {
        _UtilJvmKt.closeQuietly(this.rawSocket);
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public final Route getRoute() {
        return this.route;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b5, code lost:
    
        if (okhttp3.internal.tls.OkHostnameVerifier.verify(r5, (java.security.cert.X509Certificate) r9) != false) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isEligible$okhttp(Address address, List list) {
        TimeZone timeZone = _UtilJvmKt.UTC;
        if (this.calls.size() < this.allocationLimit && !this.noNewExchanges) {
            Route route = this.route;
            Address address2 = route.address;
            Address address3 = route.address;
            boolean equalsNonHost$okhttp = address2.equalsNonHost$okhttp(address);
            HttpUrl httpUrl = address.url;
            if (equalsNonHost$okhttp) {
                String str = httpUrl.host;
                String str2 = httpUrl.host;
                if (Intrinsics.areEqual(str, address3.url.host)) {
                    return true;
                }
                if (this.http2Connection != null && list != null) {
                    List list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it = list2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Route route2 = (Route) it.next();
                            Proxy.Type type2 = route2.proxy.type();
                            Proxy.Type type3 = Proxy.Type.DIRECT;
                            if (type2 == type3 && route.proxy.type() == type3 && Intrinsics.areEqual(route.socketAddress, route2.socketAddress)) {
                                if (address.hostnameVerifier == OkHostnameVerifier.INSTANCE) {
                                    TimeZone timeZone2 = _UtilJvmKt.UTC;
                                    HttpUrl httpUrl2 = address3.url;
                                    if (httpUrl.port == httpUrl2.port) {
                                        boolean areEqual = Intrinsics.areEqual(str2, httpUrl2.host);
                                        Handshake handshake = this.handshake;
                                        if (!areEqual) {
                                            if (!this.noCoalescedConnections && handshake != null) {
                                                List peerCertificates = handshake.peerCertificates();
                                                if (!peerCertificates.isEmpty()) {
                                                    Object obj = peerCertificates.get(0);
                                                    obj.getClass();
                                                }
                                            }
                                        }
                                        try {
                                            CertificatePinner certificatePinner = address.certificatePinner;
                                            certificatePinner.getClass();
                                            handshake.getClass();
                                            List peerCertificates2 = handshake.peerCertificates();
                                            str2.getClass();
                                            peerCertificates2.getClass();
                                            Set set = certificatePinner.pins;
                                            EmptyList emptyList = EmptyList.INSTANCE;
                                            Iterator it2 = set.iterator();
                                            if (it2.hasNext()) {
                                                JsonLogicResult$Success$$ExternalSyntheticOutline0.m4m(it2.next());
                                                throw null;
                                            }
                                            emptyList.getClass();
                                            return true;
                                        } catch (SSLPeerUnverifiedException unused) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean isHealthy(boolean z) {
        long j;
        TimeZone timeZone = _UtilJvmKt.UTC;
        long nanoTime = System.nanoTime();
        if (this.rawSocket.isClosed() || this.javaNetSocket.isClosed() || this.javaNetSocket.isInputShutdown() || this.javaNetSocket.isOutputShutdown()) {
            return false;
        }
        Http2Connection http2Connection = this.http2Connection;
        if (http2Connection != null) {
            synchronized (http2Connection) {
                if (http2Connection.isShutdown) {
                    return false;
                }
                if (http2Connection.degradedPongsReceived < http2Connection.degradedPingsSent) {
                    if (nanoTime >= http2Connection.degradedPongDeadlineNs) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j = nanoTime - this.idleAtNs;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        Socket socket = this.javaNetSocket;
        RealBufferedSource realBufferedSource = (RealBufferedSource) this.socket.lastAppBecameInvisibleRealtimeMillis;
        socket.getClass();
        realBufferedSource.getClass();
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !realBufferedSource.exhausted();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public final void noNewExchanges() {
        synchronized (this) {
            this.noNewExchanges = true;
        }
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public final void onSettings(Http2Connection http2Connection, Settings settings) {
        settings.getClass();
        synchronized (this) {
            this.allocationLimit = (settings.set & 8) != 0 ? settings.values[3] : Integer.MAX_VALUE;
        }
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public final void onStream(Http2Stream http2Stream) {
        http2Stream.close(ErrorCode.REFUSED_STREAM, null);
    }

    public final void start() {
        this.idleAtNs = System.nanoTime();
        Protocol protocol = this.protocol;
        if (protocol == Protocol.HTTP_2 || protocol == Protocol.H2_PRIOR_KNOWLEDGE) {
            this.javaNetSocket.setSoTimeout(0);
            FlowControlListener$None flowControlListener$None = FlowControlListener$None.INSTANCE;
            TaskRunner taskRunner = this.taskRunner;
            taskRunner.getClass();
            RulerTrackingMap rulerTrackingMap = new RulerTrackingMap();
            rulerTrackingMap.rulers = taskRunner;
            rulerTrackingMap.layoutNodes = Http2Connection.Listener.REFUSE_INCOMING_STREAMS;
            rulerTrackingMap.newRulers = FlowControlListener$None.INSTANCE;
            LaunchTracker launchTracker = this.socket;
            String str = this.route.address.url.host;
            launchTracker.getClass();
            str.getClass();
            rulerTrackingMap.values = launchTracker;
            rulerTrackingMap.accessFlags = _UtilJvmKt.okHttpName + ' ' + str;
            rulerTrackingMap.layoutNodes = this;
            rulerTrackingMap.size = this.pingIntervalMillis;
            rulerTrackingMap.newRulers = flowControlListener$None;
            Http2Connection http2Connection = new Http2Connection(rulerTrackingMap);
            this.http2Connection = http2Connection;
            Settings settings = Http2Connection.DEFAULT_SETTINGS;
            this.allocationLimit = (settings.set & 8) != 0 ? settings.values[3] : Integer.MAX_VALUE;
            Http2Writer http2Writer = http2Connection.writer;
            synchronized (http2Writer) {
                try {
                    if (http2Writer.closed) {
                        throw new IOException("closed");
                    }
                    Logger logger = Http2Writer.logger;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(_UtilJvmKt.format(">> CONNECTION " + Http2.CONNECTION_PREFACE.hex(), new Object[0]));
                    }
                    http2Writer.sink.write(Http2.CONNECTION_PREFACE);
                    http2Writer.sink.flush();
                } catch (Throwable th) {
                    throw th;
                }
            }
            Http2Writer http2Writer2 = http2Connection.writer;
            Settings settings2 = http2Connection.okHttpSettings;
            http2Writer2.getClass();
            settings2.getClass();
            synchronized (http2Writer2) {
                try {
                    if (http2Writer2.closed) {
                        throw new IOException("closed");
                    }
                    http2Writer2.frameHeader(0, Integer.bitCount(settings2.set) * 6, 4, 0);
                    for (int i = 0; i < 10; i++) {
                        boolean z = true;
                        if (((1 << i) & settings2.set) == 0) {
                            z = false;
                        }
                        if (z) {
                            http2Writer2.sink.writeShort(i);
                            http2Writer2.sink.writeInt(settings2.values[i]);
                        }
                    }
                    http2Writer2.sink.flush();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (http2Connection.okHttpSettings.getInitialWindowSize() != 65535) {
                http2Connection.writer.windowUpdate(0, r7 - 65535);
            }
            TaskQueue.execute$default(http2Connection.taskRunner.newQueue(), http2Connection.connectionName, 0L, http2Connection.readerRunnable, 6);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        Route route = this.route;
        sb.append(route.address.url.host);
        sb.append(':');
        sb.append(route.address.url.port);
        sb.append(", proxy=");
        sb.append(route.proxy);
        sb.append(" hostAddress=");
        sb.append(route.socketAddress);
        sb.append(" cipherSuite=");
        Handshake handshake = this.handshake;
        sb.append(handshake != null ? handshake.cipherSuite : "none");
        sb.append(" protocol=");
        sb.append(this.protocol);
        sb.append('}');
        return sb.toString();
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public final void trackFailure(RealCall realCall, IOException iOException) {
        synchronized (this) {
            try {
                if (!(iOException instanceof StreamResetException)) {
                    if (!(this.http2Connection != null) || (iOException instanceof ConnectionShutdownException)) {
                        this.noNewExchanges = true;
                        if (this.successCount == 0) {
                            if (iOException != null) {
                                connectFailed$okhttp(realCall.client, this.route, iOException);
                            }
                            this.routeFailureCount++;
                        }
                    }
                } else if (((StreamResetException) iOException).errorCode == ErrorCode.REFUSED_STREAM) {
                    int i = this.refusedStreamCount + 1;
                    this.refusedStreamCount = i;
                    if (i > 1) {
                        this.noNewExchanges = true;
                        this.routeFailureCount++;
                    }
                } else if (((StreamResetException) iOException).errorCode != ErrorCode.CANCEL || !realCall.canceled) {
                    this.noNewExchanges = true;
                    this.routeFailureCount++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
