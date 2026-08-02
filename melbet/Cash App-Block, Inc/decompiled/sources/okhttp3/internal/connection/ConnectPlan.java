package okhttp3.internal.connection;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.comparisons.NaturalOrderComparator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__IndentKt;
import okhttp3.Address;
import okhttp3.CertificatePinner;
import okhttp3.CipherSuite;
import okhttp3.ConnectionPool;
import okhttp3.ConnectionSpec;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.cache.DiskLruCache$cleanupTask$1;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http1.Http1ExchangeCodec;
import okhttp3.internal.platform.Android10Platform;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.platform.android.SocketAdapter;
import okhttp3.internal.tls.OkHostnameVerifier;
import okio.ByteString;
import okio.RealBufferedSink;
import okio.RealBufferedSource;
import okio.Timeout;
import okio.internal.DefaultSocket;
import papa.SafeTrace;
import papa.internal.LaunchTracker;
import papa.internal.LaunchTracker$$ExternalSyntheticLambda0;

/* loaded from: classes3.dex */
public final class ConnectPlan implements RoutePlanner$Plan, ExchangeCodec.Carrier {
    public final RealCall call;
    public volatile boolean canceled;
    public RealConnection connection;
    public final RealConnectionPool connectionPool;
    public final int connectionSpecIndex;
    public Handshake handshake;
    public final boolean isTlsFallback;
    public Socket javaNetSocket;
    public final int pingIntervalMillis;
    public Protocol protocol;
    public Socket rawSocket;
    public final int readTimeoutMillis;
    public final boolean retryOnConnectionFailure;
    public final Route route;
    public final RealRoutePlanner routePlanner;
    public final List routes;
    public LaunchTracker socket;
    public final int socketConnectTimeoutMillis;
    public final int socketReadTimeoutMillis;
    public final TaskRunner taskRunner;
    public final Request tunnelRequest;
    public final int writeTimeoutMillis;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ConnectPlan(TaskRunner taskRunner, RealConnectionPool realConnectionPool, int i, int i2, int i3, int i4, int i5, boolean z, RealCall realCall, RealRoutePlanner realRoutePlanner, Route route, List list, Request request, int i6, boolean z2) {
        taskRunner.getClass();
        realConnectionPool.getClass();
        route.getClass();
        this.taskRunner = taskRunner;
        this.connectionPool = realConnectionPool;
        this.readTimeoutMillis = i;
        this.writeTimeoutMillis = i2;
        this.socketConnectTimeoutMillis = i3;
        this.socketReadTimeoutMillis = i4;
        this.pingIntervalMillis = i5;
        this.retryOnConnectionFailure = z;
        this.call = realCall;
        this.routePlanner = realRoutePlanner;
        this.route = route;
        this.routes = list;
        this.tunnelRequest = request;
        this.connectionSpecIndex = i6;
        this.isTlsFallback = z2;
    }

    @Override // okhttp3.internal.connection.RoutePlanner$Plan, okhttp3.internal.http.ExchangeCodec.Carrier
    public final void cancel() {
        this.canceled = true;
        Socket socket = this.rawSocket;
        if (socket != null) {
            _UtilJvmKt.closeQuietly(socket);
        }
    }

    public final void connectSocket() {
        Socket createSocket;
        Proxy.Type type2 = this.route.proxy.type();
        int i = type2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
        if (i == 1 || i == 2) {
            createSocket = this.route.address.socketFactory.createSocket();
            createSocket.getClass();
        } else {
            createSocket = new Socket(this.route.proxy);
        }
        this.rawSocket = createSocket;
        if (this.canceled) {
            a$$ExternalSyntheticBUOutline0.m$4("canceled");
            return;
        }
        createSocket.setSoTimeout(this.socketReadTimeoutMillis);
        try {
            Android10Platform android10Platform = Platform.platform;
            Android10Platform android10Platform2 = Platform.platform;
            InetSocketAddress inetSocketAddress = this.route.socketAddress;
            int i2 = this.socketConnectTimeoutMillis;
            android10Platform2.getClass();
            inetSocketAddress.getClass();
            createSocket.connect(inetSocketAddress, i2);
            try {
                this.socket = new LaunchTracker(new DefaultSocket(createSocket));
            } catch (NullPointerException e) {
                if (Intrinsics.areEqual(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.route.socketAddress);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    @Override // okhttp3.internal.connection.RoutePlanner$Plan
    public final RoutePlanner$ConnectResult connectTcp() {
        Socket socket;
        Socket socket2;
        if (this.rawSocket != null) {
            a$$ExternalSyntheticBUOutline0.m$1("TCP already connected");
            return null;
        }
        this.call.plansToCancel.add(this);
        boolean z = false;
        try {
            try {
                EventListener eventListener = this.call.eventListener;
                RealCall realCall = this.call;
                Route route = this.route;
                eventListener.connectStart(realCall, route.socketAddress, route.proxy);
                this.connectionPool.getClass();
                this.route.getClass();
                connectSocket();
                z = true;
                RoutePlanner$ConnectResult routePlanner$ConnectResult = new RoutePlanner$ConnectResult(this, (Throwable) null, 6);
                this.call.plansToCancel.remove(this);
                return routePlanner$ConnectResult;
            } catch (IOException e) {
                Route route2 = this.route;
                Address address = route2.address;
                if (route2.proxy.type() != Proxy.Type.DIRECT) {
                    Address address2 = this.route.address;
                    address2.proxySelector.connectFailed(address2.url.uri(), this.route.proxy.address(), e);
                }
                EventListener eventListener2 = this.call.eventListener;
                RealCall realCall2 = this.call;
                Route route3 = this.route;
                eventListener2.connectFailed(realCall2, route3.socketAddress, route3.proxy, null, e);
                this.connectionPool.getClass();
                this.route.getClass();
                RoutePlanner$ConnectResult routePlanner$ConnectResult2 = new RoutePlanner$ConnectResult(this, e, 2);
                this.call.plansToCancel.remove(this);
                if (!z && (socket2 = this.rawSocket) != null) {
                    _UtilJvmKt.closeQuietly(socket2);
                }
                return routePlanner$ConnectResult2;
            }
        } catch (Throwable th) {
            this.call.plansToCancel.remove(this);
            if (!z && (socket = this.rawSocket) != null) {
                _UtilJvmKt.closeQuietly(socket);
            }
            throw th;
        }
    }

    public final void connectTls(SSLSocket sSLSocket, ConnectionSpec connectionSpec) {
        Protocol protocol;
        Object obj;
        Object obj2;
        Address address = this.route.address;
        try {
            String str = null;
            if (connectionSpec.supportsTlsExtensions) {
                Android10Platform android10Platform = Platform.platform;
                Android10Platform android10Platform2 = Platform.platform;
                String str2 = address.url.host;
                List list = address.protocols;
                android10Platform2.getClass();
                list.getClass();
                Iterator it = android10Platform2.socketAdapters.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = it.next();
                        if (((SocketAdapter) obj2).matchesSocket(sSLSocket)) {
                            break;
                        }
                    }
                }
                SocketAdapter socketAdapter = (SocketAdapter) obj2;
                if (socketAdapter != null) {
                    socketAdapter.configureTlsExtensions(sSLSocket, str2, list);
                }
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            session.getClass();
            Handshake handshake = SafeTrace.get(session);
            HostnameVerifier hostnameVerifier = address.hostnameVerifier;
            hostnameVerifier.getClass();
            boolean verify = hostnameVerifier.verify(address.url.host, session);
            int i = 7;
            if (!verify) {
                List peerCertificates = handshake.peerCertificates();
                if (peerCertificates.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + address.url.host + " not verified (no certificates)");
                }
                Object obj3 = peerCertificates.get(0);
                obj3.getClass();
                X509Certificate x509Certificate = (X509Certificate) obj3;
                StringBuilder sb = new StringBuilder();
                sb.append("\n            |Hostname ");
                sb.append(address.url.host);
                sb.append(" not verified:\n            |    certificate: ");
                CertificatePinner certificatePinner = CertificatePinner.DEFAULT;
                StringBuilder sb2 = new StringBuilder("sha256/");
                ByteString.Companion companion = ByteString.Companion;
                byte[] encoded = x509Certificate.getPublicKey().getEncoded();
                encoded.getClass();
                sb2.append(ByteString.Companion.of$default(encoded).digest$okio("SHA-256").base64());
                sb.append(sb2.toString());
                sb.append("\n            |    DN: ");
                sb.append(x509Certificate.getSubjectDN().getName());
                sb.append("\n            |    subjectAltNames: ");
                sb.append(CollectionsKt.plus((Iterable) OkHostnameVerifier.getSubjectAltNames(x509Certificate, 2), (Collection) OkHostnameVerifier.getSubjectAltNames(x509Certificate, 7)));
                sb.append("\n            ");
                throw new SSLPeerUnverifiedException(StringsKt__IndentKt.trimMargin$default(sb.toString()));
            }
            CertificatePinner certificatePinner2 = address.certificatePinner;
            certificatePinner2.getClass();
            this.handshake = new Handshake(handshake.tlsVersion, handshake.cipherSuite, handshake.localCertificates, new LaunchTracker$$ExternalSyntheticLambda0(i, certificatePinner2, handshake, address));
            address.url.host.getClass();
            Set set = certificatePinner2.pins;
            EmptyList emptyList = EmptyList.INSTANCE;
            Iterator it2 = set.iterator();
            if (it2.hasNext()) {
                JsonLogicResult$Success$$ExternalSyntheticOutline0.m4m(it2.next());
                throw null;
            }
            emptyList.getClass();
            if (connectionSpec.supportsTlsExtensions) {
                Android10Platform android10Platform3 = Platform.platform;
                Android10Platform android10Platform4 = Platform.platform;
                android10Platform4.getClass();
                Iterator it3 = android10Platform4.socketAdapters.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it3.next();
                        if (((SocketAdapter) obj).matchesSocket(sSLSocket)) {
                            break;
                        }
                    }
                }
                SocketAdapter socketAdapter2 = (SocketAdapter) obj;
                if (socketAdapter2 != null) {
                    str = socketAdapter2.getSelectedProtocol(sSLSocket);
                }
            }
            this.javaNetSocket = sSLSocket;
            this.socket = new LaunchTracker(new DefaultSocket(sSLSocket));
            if (str != null) {
                Protocol.Companion.getClass();
                protocol = HttpUrl.Companion.get(str);
            } else {
                protocol = Protocol.HTTP_1_1;
            }
            this.protocol = protocol;
            Android10Platform android10Platform5 = Platform.platform;
            Platform.platform.getClass();
        } catch (Throwable th) {
            Android10Platform android10Platform6 = Platform.platform;
            Platform.platform.getClass();
            _UtilJvmKt.closeQuietly(sSLSocket);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x016b  */
    @Override // okhttp3.internal.connection.RoutePlanner$Plan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final RoutePlanner$ConnectResult connectTlsEtc() {
        IOException iOException;
        ConnectPlan connectPlan;
        ConnectPlan connectPlan2;
        Socket socket = this.rawSocket;
        ConnectPlan connectPlan3 = null;
        if (socket == null) {
            a$$ExternalSyntheticBUOutline0.m$3("TCP not connected");
            return null;
        }
        if (isReady()) {
            a$$ExternalSyntheticBUOutline0.m$1("already connected");
            return null;
        }
        List list = this.route.address.connectionSpecs;
        this.call.plansToCancel.add(this);
        boolean z = false;
        try {
            try {
                if (this.tunnelRequest != null) {
                    RoutePlanner$ConnectResult connectTunnel$okhttp = connectTunnel$okhttp();
                    if (connectTunnel$okhttp.throwable != null) {
                        this.call.plansToCancel.remove(this);
                        Socket socket2 = this.javaNetSocket;
                        if (socket2 != null) {
                            _UtilJvmKt.closeQuietly(socket2);
                        }
                        _UtilJvmKt.closeQuietly(socket);
                        return connectTunnel$okhttp;
                    }
                }
                Address address = this.route.address;
                if (address.sslSocketFactory != null) {
                    LaunchTracker launchTracker = this.socket;
                    if (launchTracker == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("socket");
                        throw null;
                    }
                    if (((RealBufferedSource) launchTracker.lastAppBecameInvisibleRealtimeMillis).bufferField.exhausted()) {
                        LaunchTracker launchTracker2 = this.socket;
                        if (launchTracker2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("socket");
                            throw null;
                        }
                        if (((RealBufferedSink) launchTracker2.launchInProgress).bufferField.exhausted()) {
                            this.call.eventListener.secureConnectStart(this.call);
                            Address address2 = this.route.address;
                            SSLSocketFactory sSLSocketFactory = address2.sslSocketFactory;
                            HttpUrl httpUrl = address2.url;
                            Socket createSocket = sSLSocketFactory.createSocket(socket, httpUrl.host, httpUrl.port, true);
                            createSocket.getClass();
                            SSLSocket sSLSocket = (SSLSocket) createSocket;
                            ConnectPlan planWithCurrentOrInitialConnectionSpec$okhttp = planWithCurrentOrInitialConnectionSpec$okhttp(list, sSLSocket);
                            ConnectionSpec connectionSpec = (ConnectionSpec) list.get(planWithCurrentOrInitialConnectionSpec$okhttp.connectionSpecIndex);
                            connectPlan = planWithCurrentOrInitialConnectionSpec$okhttp.nextConnectionSpec$okhttp(list, sSLSocket);
                            try {
                                connectionSpec.apply$okhttp(sSLSocket, planWithCurrentOrInitialConnectionSpec$okhttp.isTlsFallback);
                                connectTls(sSLSocket, connectionSpec);
                                this.call.eventListener.secureConnectEnd(this.call, this.handshake);
                                connectPlan2 = connectPlan;
                            } catch (IOException e) {
                                iOException = e;
                                EventListener eventListener = this.call.eventListener;
                                RealCall realCall = this.call;
                                Route route = this.route;
                                eventListener.connectFailed(realCall, route.socketAddress, route.proxy, null, iOException);
                                IOException iOException2 = iOException;
                                this.connectionPool.getClass();
                                this.route.getClass();
                                if (this.retryOnConnectionFailure && RetryTlsHandshakeKt.retryTlsHandshake(iOException2)) {
                                    connectPlan3 = connectPlan;
                                }
                                RoutePlanner$ConnectResult routePlanner$ConnectResult = new RoutePlanner$ConnectResult(this, connectPlan3, iOException2);
                                this.call.plansToCancel.remove(this);
                                if (!z) {
                                    Socket socket3 = this.javaNetSocket;
                                    if (socket3 != null) {
                                        _UtilJvmKt.closeQuietly(socket3);
                                    }
                                    _UtilJvmKt.closeQuietly(socket);
                                }
                                return routePlanner$ConnectResult;
                            }
                        }
                    }
                    throw new IOException("TLS tunnel buffered too many bytes!");
                }
                this.javaNetSocket = socket;
                List list2 = address.protocols;
                Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
                if (!list2.contains(protocol)) {
                    protocol = Protocol.HTTP_1_1;
                }
                this.protocol = protocol;
                connectPlan2 = null;
                try {
                    TaskRunner taskRunner = this.taskRunner;
                    RealConnectionPool realConnectionPool = this.connectionPool;
                    Route route2 = this.route;
                    Socket socket4 = this.javaNetSocket;
                    socket4.getClass();
                    Handshake handshake = this.handshake;
                    Protocol protocol2 = this.protocol;
                    protocol2.getClass();
                    LaunchTracker launchTracker3 = this.socket;
                    if (launchTracker3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("socket");
                        throw null;
                    }
                    int i = this.pingIntervalMillis;
                    this.connectionPool.getClass();
                    RealConnection realConnection = new RealConnection(taskRunner, realConnectionPool, route2, socket, socket4, handshake, protocol2, launchTracker3, i);
                    this.connection = realConnection;
                    realConnection.start();
                    EventListener eventListener2 = this.call.eventListener;
                    RealCall realCall2 = this.call;
                    Route route3 = this.route;
                    eventListener2.connectEnd(realCall2, route3.socketAddress, route3.proxy, this.protocol);
                    try {
                        RoutePlanner$ConnectResult routePlanner$ConnectResult2 = new RoutePlanner$ConnectResult(this, (Throwable) null, 6);
                        this.call.plansToCancel.remove(this);
                        return routePlanner$ConnectResult2;
                    } catch (IOException e2) {
                        iOException = e2;
                        z = true;
                        connectPlan = connectPlan2;
                        EventListener eventListener3 = this.call.eventListener;
                        RealCall realCall3 = this.call;
                        Route route4 = this.route;
                        eventListener3.connectFailed(realCall3, route4.socketAddress, route4.proxy, null, iOException);
                        IOException iOException22 = iOException;
                        this.connectionPool.getClass();
                        this.route.getClass();
                        if (this.retryOnConnectionFailure) {
                            connectPlan3 = connectPlan;
                        }
                        RoutePlanner$ConnectResult routePlanner$ConnectResult3 = new RoutePlanner$ConnectResult(this, connectPlan3, iOException22);
                        this.call.plansToCancel.remove(this);
                        if (!z) {
                        }
                        return routePlanner$ConnectResult3;
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        this.call.plansToCancel.remove(this);
                        if (!z) {
                            Socket socket5 = this.javaNetSocket;
                            if (socket5 != null) {
                                _UtilJvmKt.closeQuietly(socket5);
                            }
                            _UtilJvmKt.closeQuietly(socket);
                        }
                        throw th;
                    }
                } catch (IOException e3) {
                    iOException = e3;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e4) {
            iOException = e4;
            connectPlan = null;
        }
    }

    public final RoutePlanner$ConnectResult connectTunnel$okhttp() {
        Request request = this.tunnelRequest;
        request.getClass();
        Route route = this.route;
        String str = "CONNECT " + _UtilJvmKt.toHostHeader(route.address.url, true) + " HTTP/1.1";
        LaunchTracker launchTracker = this.socket;
        if (launchTracker == null) {
            Intrinsics.throwUninitializedPropertyAccessException("socket");
            throw null;
        }
        Http1ExchangeCodec http1ExchangeCodec = new Http1ExchangeCodec(null, this, launchTracker);
        LaunchTracker launchTracker2 = this.socket;
        if (launchTracker2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("socket");
            throw null;
        }
        Timeout timeout = ((RealBufferedSource) launchTracker2.lastAppBecameInvisibleRealtimeMillis).source.timeout();
        long j = this.readTimeoutMillis;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeout.timeout(j, timeUnit);
        LaunchTracker launchTracker3 = this.socket;
        if (launchTracker3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("socket");
            throw null;
        }
        ((RealBufferedSink) launchTracker3.launchInProgress).sink.timeout().timeout(this.writeTimeoutMillis, timeUnit);
        http1ExchangeCodec.writeRequest(request.headers, str);
        http1ExchangeCodec.finishRequest();
        Response.Builder readResponseHeaders = http1ExchangeCodec.readResponseHeaders(false);
        readResponseHeaders.getClass();
        readResponseHeaders.request = request;
        Response build = readResponseHeaders.build();
        int i = build.code;
        http1ExchangeCodec.skipConnectBody(build);
        if (i == 200) {
            return new RoutePlanner$ConnectResult(this, (Throwable) null, 6);
        }
        if (i != 407) {
            a$$ExternalSyntheticBUOutline0.m$4(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Unexpected response code for CONNECT: "));
            return null;
        }
        route.address.proxyAuthenticator.getClass();
        a$$ExternalSyntheticBUOutline0.m$4("Failed to authenticate with proxy");
        return null;
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public final Route getRoute() {
        return this.route;
    }

    @Override // okhttp3.internal.connection.RoutePlanner$Plan
    public final RealConnection handleSuccess() {
        ConnectionPool connectionPool = this.call.client.routeDatabase;
        Route route = this.route;
        synchronized (connectionPool) {
            route.getClass();
            ((LinkedHashSet) connectionPool.delegate).remove(route);
        }
        RealConnection realConnection = this.connection;
        realConnection.getClass();
        this.route.getClass();
        ReusePlan planReusePooledConnection$okhttp = this.routePlanner.planReusePooledConnection$okhttp(this, this.routes);
        if (planReusePooledConnection$okhttp != null) {
            return planReusePooledConnection$okhttp.connection;
        }
        synchronized (realConnection) {
            RealConnectionPool realConnectionPool = this.connectionPool;
            realConnectionPool.getClass();
            TimeZone timeZone = _UtilJvmKt.UTC;
            ((ConcurrentLinkedQueue) realConnectionPool.connections).add(realConnection);
            ((TaskQueue) realConnectionPool.cleanupQueue).schedule((DiskLruCache$cleanupTask$1) realConnectionPool.cleanupTask, 0L);
            this.call.acquireConnectionNoEvents(realConnection);
        }
        this.call.eventListener.connectionAcquired(this.call, realConnection);
        return realConnection;
    }

    @Override // okhttp3.internal.connection.RoutePlanner$Plan
    public final boolean isReady() {
        return this.protocol != null;
    }

    public final ConnectPlan nextConnectionSpec$okhttp(List list, SSLSocket sSLSocket) {
        list.getClass();
        int i = this.connectionSpecIndex;
        int size = list.size();
        for (int i2 = i + 1; i2 < size; i2++) {
            ConnectionSpec connectionSpec = (ConnectionSpec) list.get(i2);
            connectionSpec.getClass();
            if (connectionSpec.isTls) {
                String[] strArr = connectionSpec.tlsVersionsAsString;
                if (strArr != null) {
                    String[] enabledProtocols = sSLSocket.getEnabledProtocols();
                    NaturalOrderComparator naturalOrderComparator = NaturalOrderComparator.INSTANCE;
                    naturalOrderComparator.getClass();
                    if (!_UtilCommonKt.hasIntersection(strArr, enabledProtocols, naturalOrderComparator)) {
                        continue;
                    }
                }
                String[] strArr2 = connectionSpec.cipherSuitesAsString;
                if (strArr2 == null || _UtilCommonKt.hasIntersection(strArr2, sSLSocket.getEnabledCipherSuites(), CipherSuite.ORDER_BY_NAME)) {
                    return new ConnectPlan(this.taskRunner, this.connectionPool, this.readTimeoutMillis, this.writeTimeoutMillis, this.socketConnectTimeoutMillis, this.socketReadTimeoutMillis, this.pingIntervalMillis, this.retryOnConnectionFailure, this.call, this.routePlanner, this.route, this.routes, this.tunnelRequest, i2, i != -1);
                }
            }
        }
        return null;
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public final void noNewExchanges() {
    }

    public final ConnectPlan planWithCurrentOrInitialConnectionSpec$okhttp(List list, SSLSocket sSLSocket) {
        list.getClass();
        if (this.connectionSpecIndex != -1) {
            return this;
        }
        ConnectPlan nextConnectionSpec$okhttp = nextConnectionSpec$okhttp(list, sSLSocket);
        if (nextConnectionSpec$okhttp != null) {
            return nextConnectionSpec$okhttp;
        }
        StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.isTlsFallback);
        sb.append(", modes=");
        sb.append(list);
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        enabledProtocols.getClass();
        String arrays = Arrays.toString(enabledProtocols);
        arrays.getClass();
        sb.append(", supported protocols=");
        sb.append(arrays);
        throw new UnknownServiceException(sb.toString());
    }

    @Override // okhttp3.internal.connection.RoutePlanner$Plan
    public final RoutePlanner$Plan retry() {
        return new ConnectPlan(this.taskRunner, this.connectionPool, this.readTimeoutMillis, this.writeTimeoutMillis, this.socketConnectTimeoutMillis, this.socketReadTimeoutMillis, this.pingIntervalMillis, this.retryOnConnectionFailure, this.call, this.routePlanner, this.route, this.routes, this.tunnelRequest, this.connectionSpecIndex, this.isTlsFallback);
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public final void trackFailure(RealCall realCall, IOException iOException) {
    }
}
