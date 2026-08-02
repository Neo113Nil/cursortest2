package okhttp3;

import android.os.StrictMode;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.UnsignedKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal._UtilJvmKt$$ExternalSyntheticLambda0;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.platform.Android10Platform;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.proxy.NullProxySelector;
import okhttp3.internal.tls.OkHostnameVerifier;
import okhttp3.internal.ws.RealWebSocket;
import okio.Path$$ExternalSyntheticBUOutline0;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class OkHttpClient implements Call.Factory {
    public final HttpUrl.Companion authenticator;
    public final Cache cache;
    public final int callTimeoutMillis;
    public final UnsignedKt certificateChainCleaner;
    public final CertificatePinner certificatePinner;
    public final int connectTimeoutMillis;
    public final ConnectionPool connectionPool;
    public final List connectionSpecs;
    public final CookieJar cookieJar;
    public final Dispatcher dispatcher;
    public final Dns dns;
    public final EventListener.Factory eventListenerFactory;
    public final boolean fastFallback;
    public final boolean followRedirects;
    public final boolean followSslRedirects;
    public final OkHostnameVerifier hostnameVerifier;
    public final List interceptors;
    public final long minWebSocketMessageToCompress;
    public final List networkInterceptors;
    public final int pingIntervalMillis;
    public final List protocols;
    public final HttpUrl.Companion proxyAuthenticator;
    public final ProxySelector proxySelector;
    public final int readTimeoutMillis;
    public final boolean retryOnConnectionFailure;
    public final ConnectionPool routeDatabase;
    public final SocketFactory socketFactory;
    public final SSLSocketFactory sslSocketFactoryOrNull;
    public final TaskRunner taskRunner;
    public final int webSocketCloseTimeout;
    public final int writeTimeoutMillis;
    public final X509TrustManager x509TrustManager;
    public static final List DEFAULT_PROTOCOLS = _UtilJvmKt.toImmutableList(new Protocol[]{Protocol.HTTP_2, Protocol.HTTP_1_1});
    public static final List DEFAULT_CONNECTION_SPECS = _UtilJvmKt.toImmutableList(new ConnectionSpec[]{ConnectionSpec.MODERN_TLS, ConnectionSpec.CLEARTEXT});

    public final class Builder {
        public HttpUrl.Companion authenticator;
        public Cache cache;
        public int callTimeout;
        public UnsignedKt certificateChainCleaner;
        public CertificatePinner certificatePinner;
        public int connectTimeout;
        public ConnectionPool connectionPool;
        public List connectionSpecs;
        public CookieJar cookieJar;
        public Dns dns;
        public EventListener.Factory eventListenerFactory;
        public boolean fastFallback;
        public boolean followRedirects;
        public boolean followSslRedirects;
        public OkHostnameVerifier hostnameVerifier;
        public long minWebSocketMessageToCompress;
        public int pingInterval;
        public List protocols;
        public HttpUrl.Companion proxyAuthenticator;
        public ProxySelector proxySelector;
        public int readTimeout;
        public boolean retryOnConnectionFailure;
        public ConnectionPool routeDatabase;
        public SocketFactory socketFactory;
        public SSLSocketFactory sslSocketFactoryOrNull;
        public TaskRunner taskRunner;
        public int webSocketCloseTimeout;
        public int writeTimeout;
        public X509TrustManager x509TrustManagerOrNull;
        public Dispatcher dispatcher = new Dispatcher();
        public final ArrayList interceptors = new ArrayList();
        public final ArrayList networkInterceptors = new ArrayList();

        public Builder() {
            EventListener eventListener = EventListener.NONE;
            TimeZone timeZone = _UtilJvmKt.UTC;
            eventListener.getClass();
            this.eventListenerFactory = new _UtilJvmKt$$ExternalSyntheticLambda0(eventListener);
            this.retryOnConnectionFailure = true;
            this.fastFallback = true;
            HttpUrl.Companion companion = HttpUrl.Companion.NONE;
            this.authenticator = companion;
            this.followRedirects = true;
            this.followSslRedirects = true;
            this.cookieJar = CookieJar.NO_COOKIES;
            this.dns = Dns.SYSTEM;
            this.proxyAuthenticator = companion;
            SocketFactory socketFactory = SocketFactory.getDefault();
            socketFactory.getClass();
            this.socketFactory = socketFactory;
            this.connectionSpecs = OkHttpClient.DEFAULT_CONNECTION_SPECS;
            this.protocols = OkHttpClient.DEFAULT_PROTOCOLS;
            this.hostnameVerifier = OkHostnameVerifier.INSTANCE;
            this.certificatePinner = CertificatePinner.DEFAULT;
            this.connectTimeout = 10000;
            this.readTimeout = 10000;
            this.writeTimeout = 10000;
            this.webSocketCloseTimeout = 60000;
            this.minWebSocketMessageToCompress = 1024L;
        }

        public final void protocols(List list) {
            list.getClass();
            ArrayList arrayList = new ArrayList(list);
            Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            if (!arrayList.contains(protocol) && !arrayList.contains(Protocol.HTTP_1_1)) {
                Path$$ExternalSyntheticBUOutline0.m$3(arrayList, "protocols must contain h2_prior_knowledge or http/1.1: ");
                return;
            }
            if (arrayList.contains(protocol) && arrayList.size() > 1) {
                Path$$ExternalSyntheticBUOutline0.m$3(arrayList, "protocols containing h2_prior_knowledge cannot use other protocols: ");
                return;
            }
            if (arrayList.contains(Protocol.HTTP_1_0)) {
                Path$$ExternalSyntheticBUOutline0.m$3(arrayList, "protocols must not contain http/1.0: ");
                return;
            }
            if (arrayList.contains(null)) {
                a$$ExternalSyntheticBUOutline0.m$3("protocols must not contain null");
                return;
            }
            arrayList.remove(Protocol.SPDY_3);
            if (!arrayList.equals(this.protocols)) {
                this.routeDatabase = null;
            }
            List unmodifiableList = Collections.unmodifiableList(arrayList);
            unmodifiableList.getClass();
            this.protocols = unmodifiableList;
        }

        public final void readTimeout(long j, TimeUnit timeUnit) {
            timeUnit.getClass();
            this.readTimeout = _UtilJvmKt.checkDuration("timeout", j, timeUnit);
        }

        public final void sslSocketFactory(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
            x509TrustManager.getClass();
            if (!sSLSocketFactory.equals(this.sslSocketFactoryOrNull) || !x509TrustManager.equals(this.x509TrustManagerOrNull)) {
                this.routeDatabase = null;
            }
            this.sslSocketFactoryOrNull = sSLSocketFactory;
            Android10Platform android10Platform = Platform.platform;
            this.certificateChainCleaner = Platform.platform.buildCertificateChainCleaner(x509TrustManager);
            this.x509TrustManagerOrNull = x509TrustManager;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0212  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OkHttpClient(Builder builder) {
        List list;
        this.dispatcher = builder.dispatcher;
        this.interceptors = _UtilJvmKt.toImmutableList(builder.interceptors);
        this.networkInterceptors = _UtilJvmKt.toImmutableList(builder.networkInterceptors);
        this.eventListenerFactory = builder.eventListenerFactory;
        this.retryOnConnectionFailure = builder.retryOnConnectionFailure;
        this.fastFallback = builder.fastFallback;
        this.authenticator = builder.authenticator;
        this.followRedirects = builder.followRedirects;
        this.followSslRedirects = builder.followSslRedirects;
        this.cookieJar = builder.cookieJar;
        this.cache = builder.cache;
        this.dns = builder.dns;
        ProxySelector proxySelector = builder.proxySelector;
        if (proxySelector == null && (proxySelector = ProxySelector.getDefault()) == null) {
            proxySelector = NullProxySelector.INSTANCE;
        }
        this.proxySelector = proxySelector;
        this.proxyAuthenticator = builder.proxyAuthenticator;
        this.socketFactory = builder.socketFactory;
        List list2 = builder.connectionSpecs;
        this.connectionSpecs = list2;
        this.protocols = builder.protocols;
        this.hostnameVerifier = builder.hostnameVerifier;
        this.callTimeoutMillis = builder.callTimeout;
        this.connectTimeoutMillis = builder.connectTimeout;
        this.readTimeoutMillis = builder.readTimeout;
        this.writeTimeoutMillis = builder.writeTimeout;
        this.pingIntervalMillis = builder.pingInterval;
        this.webSocketCloseTimeout = builder.webSocketCloseTimeout;
        this.minWebSocketMessageToCompress = builder.minWebSocketMessageToCompress;
        ConnectionPool connectionPool = builder.routeDatabase;
        this.routeDatabase = connectionPool == null ? new ConnectionPool(28, false) : connectionPool;
        TaskRunner taskRunner = builder.taskRunner;
        this.taskRunner = taskRunner == null ? TaskRunner.INSTANCE : taskRunner;
        ConnectionPool connectionPool2 = builder.connectionPool;
        if (connectionPool2 == null) {
            connectionPool2 = new ConnectionPool(0, false);
            builder.connectionPool = connectionPool2;
        }
        this.connectionPool = connectionPool2;
        List list3 = list2;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                if (((ConnectionSpec) it.next()).isTls) {
                    SSLSocketFactory sSLSocketFactory = builder.sslSocketFactoryOrNull;
                    if (sSLSocketFactory == null) {
                        Android10Platform android10Platform = Platform.platform;
                        Platform.platform.getClass();
                        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                        trustManagerFactory.init((KeyStore) null);
                        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                        trustManagers.getClass();
                        if (trustManagers.length == 1) {
                            TrustManager trustManager = trustManagers[0];
                            if (trustManager instanceof X509TrustManager) {
                                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                                this.x509TrustManager = x509TrustManager;
                                Platform.platform.getClass();
                                try {
                                    StrictMode.noteSlowCall("newSSLContext");
                                    SSLContext sSLContext = SSLContext.getInstance("TLS");
                                    sSLContext.getClass();
                                    sSLContext.init(null, new TrustManager[]{x509TrustManager}, null);
                                    SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
                                    socketFactory.getClass();
                                    this.sslSocketFactoryOrNull = socketFactory;
                                    UnsignedKt buildCertificateChainCleaner = Platform.platform.buildCertificateChainCleaner(x509TrustManager);
                                    this.certificateChainCleaner = buildCertificateChainCleaner;
                                    CertificatePinner certificatePinner = builder.certificatePinner;
                                    certificatePinner.getClass();
                                    this.certificatePinner = Intrinsics.areEqual(certificatePinner.certificateChainCleaner, buildCertificateChainCleaner) ? certificatePinner : new CertificatePinner(certificatePinner.pins, buildCertificateChainCleaner);
                                } catch (GeneralSecurityException e) {
                                    throw new AssertionError("No System TLS: " + e, e);
                                }
                            }
                        }
                        String arrays = Arrays.toString(trustManagers);
                        arrays.getClass();
                        Path$$ExternalSyntheticBUOutline0.m((Object) "Unexpected default trust managers: ".concat(arrays));
                        throw null;
                    }
                    this.sslSocketFactoryOrNull = sSLSocketFactory;
                    UnsignedKt unsignedKt = builder.certificateChainCleaner;
                    unsignedKt.getClass();
                    this.certificateChainCleaner = unsignedKt;
                    X509TrustManager x509TrustManager2 = builder.x509TrustManagerOrNull;
                    x509TrustManager2.getClass();
                    this.x509TrustManager = x509TrustManager2;
                    CertificatePinner certificatePinner2 = builder.certificatePinner;
                    certificatePinner2.getClass();
                    this.certificatePinner = Intrinsics.areEqual(certificatePinner2.certificateChainCleaner, unsignedKt) ? certificatePinner2 : new CertificatePinner(certificatePinner2.pins, unsignedKt);
                    X509TrustManager x509TrustManager3 = this.x509TrustManager;
                    UnsignedKt unsignedKt2 = this.certificateChainCleaner;
                    SSLSocketFactory sSLSocketFactory2 = this.sslSocketFactoryOrNull;
                    List list4 = this.networkInterceptors;
                    list = this.interceptors;
                    list.getClass();
                    if (!list.contains(null)) {
                        Handlers$$ExternalSyntheticBUOutline0.m(list, "Null interceptor: ");
                        throw null;
                    }
                    list4.getClass();
                    if (list4.contains(null)) {
                        Handlers$$ExternalSyntheticBUOutline0.m(list4, "Null network interceptor: ");
                        throw null;
                    }
                    List list5 = this.connectionSpecs;
                    if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                        Iterator it2 = list5.iterator();
                        while (it2.hasNext()) {
                            if (((ConnectionSpec) it2.next()).isTls) {
                                if (sSLSocketFactory2 == null) {
                                    a$$ExternalSyntheticBUOutline0.m$1("sslSocketFactory == null");
                                    throw null;
                                }
                                if (unsignedKt2 == null) {
                                    a$$ExternalSyntheticBUOutline0.m$1("certificateChainCleaner == null");
                                    throw null;
                                }
                                if (x509TrustManager3 != null) {
                                    return;
                                }
                                a$$ExternalSyntheticBUOutline0.m$1("x509TrustManager == null");
                                throw null;
                            }
                        }
                    }
                    if (sSLSocketFactory2 != null) {
                        a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                        throw null;
                    }
                    if (unsignedKt2 != null) {
                        a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                        throw null;
                    }
                    if (x509TrustManager3 != null) {
                        a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                        throw null;
                    }
                    if (Intrinsics.areEqual(this.certificatePinner, CertificatePinner.DEFAULT)) {
                        return;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                    throw null;
                }
            }
        }
        this.sslSocketFactoryOrNull = null;
        this.certificateChainCleaner = null;
        this.x509TrustManager = null;
        this.certificatePinner = CertificatePinner.DEFAULT;
        X509TrustManager x509TrustManager32 = this.x509TrustManager;
        UnsignedKt unsignedKt22 = this.certificateChainCleaner;
        SSLSocketFactory sSLSocketFactory22 = this.sslSocketFactoryOrNull;
        List list42 = this.networkInterceptors;
        list = this.interceptors;
        list.getClass();
        if (!list.contains(null)) {
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.dispatcher = this.dispatcher;
        builder.connectionPool = this.connectionPool;
        CollectionsKt__MutableCollectionsKt.addAll(this.interceptors, builder.interceptors);
        CollectionsKt__MutableCollectionsKt.addAll(this.networkInterceptors, builder.networkInterceptors);
        builder.eventListenerFactory = this.eventListenerFactory;
        builder.retryOnConnectionFailure = this.retryOnConnectionFailure;
        builder.fastFallback = this.fastFallback;
        builder.authenticator = this.authenticator;
        builder.followRedirects = this.followRedirects;
        builder.followSslRedirects = this.followSslRedirects;
        builder.cookieJar = this.cookieJar;
        builder.cache = this.cache;
        builder.dns = this.dns;
        builder.proxySelector = this.proxySelector;
        builder.proxyAuthenticator = this.proxyAuthenticator;
        builder.socketFactory = this.socketFactory;
        builder.sslSocketFactoryOrNull = this.sslSocketFactoryOrNull;
        builder.x509TrustManagerOrNull = this.x509TrustManager;
        builder.connectionSpecs = this.connectionSpecs;
        builder.protocols = this.protocols;
        builder.hostnameVerifier = this.hostnameVerifier;
        builder.certificatePinner = this.certificatePinner;
        builder.certificateChainCleaner = this.certificateChainCleaner;
        builder.callTimeout = this.callTimeoutMillis;
        builder.connectTimeout = this.connectTimeoutMillis;
        builder.readTimeout = this.readTimeoutMillis;
        builder.writeTimeout = this.writeTimeoutMillis;
        builder.pingInterval = this.pingIntervalMillis;
        builder.webSocketCloseTimeout = this.webSocketCloseTimeout;
        builder.minWebSocketMessageToCompress = this.minWebSocketMessageToCompress;
        builder.routeDatabase = this.routeDatabase;
        builder.taskRunner = this.taskRunner;
        return builder;
    }

    @Override // okhttp3.Call.Factory
    public final Call newCall(Request request) {
        request.getClass();
        return new RealCall(this, request, false);
    }

    public final RealWebSocket newWebSocket(Request request, WebSocketListener webSocketListener) {
        request.getClass();
        RealWebSocket realWebSocket = new RealWebSocket(this.taskRunner, request, webSocketListener, new Random(), this.pingIntervalMillis, this.minWebSocketMessageToCompress, this.webSocketCloseTimeout);
        realWebSocket.connect(this);
        return realWebSocket;
    }

    public OkHttpClient() {
        this(new Builder());
    }
}
