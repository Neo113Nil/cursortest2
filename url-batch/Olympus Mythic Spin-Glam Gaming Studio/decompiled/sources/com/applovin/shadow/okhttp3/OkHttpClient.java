package com.applovin.shadow.okhttp3;

import com.applovin.shadow.okhttp3.Call;
import com.applovin.shadow.okhttp3.EventListener;
import com.applovin.shadow.okhttp3.Interceptor;
import com.applovin.shadow.okhttp3.WebSocket;
import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okhttp3.internal.concurrent.TaskRunner;
import com.applovin.shadow.okhttp3.internal.connection.RealCall;
import com.applovin.shadow.okhttp3.internal.connection.RouteDatabase;
import com.applovin.shadow.okhttp3.internal.platform.Platform;
import com.applovin.shadow.okhttp3.internal.proxy.NullProxySelector;
import com.applovin.shadow.okhttp3.internal.tls.CertificateChainCleaner;
import com.applovin.shadow.okhttp3.internal.tls.OkHostnameVerifier;
import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.net.Proxy;
import java.net.ProxySelector;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: OkHttpClient.kt */
@Metadata(d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 y2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002xyB\u0007\b\u0016¢\u0006\u0002\u0010\u0004B\u000f\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\r\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\bSJ\u000f\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0002\bTJ\r\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\bUJ\r\u0010\u0014\u001a\u00020\u0015H\u0007¢\u0006\u0002\bVJ\r\u0010\u0017\u001a\u00020\u000fH\u0007¢\u0006\u0002\bWJ\r\u0010\u0018\u001a\u00020\u0019H\u0007¢\u0006\u0002\bXJ\u0013\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0007¢\u0006\u0002\bYJ\r\u0010\u001f\u001a\u00020 H\u0007¢\u0006\u0002\bZJ\r\u0010\"\u001a\u00020#H\u0007¢\u0006\u0002\b[J\r\u0010%\u001a\u00020&H\u0007¢\u0006\u0002\b\\J\r\u0010(\u001a\u00020)H\u0007¢\u0006\u0002\b]J\r\u0010+\u001a\u00020,H\u0007¢\u0006\u0002\b^J\r\u0010.\u001a\u00020,H\u0007¢\u0006\u0002\b_J\r\u0010/\u001a\u000200H\u0007¢\u0006\u0002\b`J\u0013\u00102\u001a\b\u0012\u0004\u0012\u0002030\u001cH\u0007¢\u0006\u0002\baJ\u0013\u00107\u001a\b\u0012\u0004\u0012\u0002030\u001cH\u0007¢\u0006\u0002\bbJ\b\u0010c\u001a\u00020\u0006H\u0016J\u0010\u0010d\u001a\u00020e2\u0006\u0010f\u001a\u00020gH\u0016J\u0018\u0010h\u001a\u00020i2\u0006\u0010f\u001a\u00020g2\u0006\u0010j\u001a\u00020kH\u0016J\r\u00108\u001a\u00020\u000fH\u0007¢\u0006\u0002\blJ\u0013\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u001cH\u0007¢\u0006\u0002\bmJ\u000f\u0010;\u001a\u0004\u0018\u00010<H\u0007¢\u0006\u0002\bnJ\r\u0010>\u001a\u00020\tH\u0007¢\u0006\u0002\boJ\r\u0010?\u001a\u00020@H\u0007¢\u0006\u0002\bpJ\r\u0010B\u001a\u00020\u000fH\u0007¢\u0006\u0002\bqJ\r\u0010C\u001a\u00020,H\u0007¢\u0006\u0002\brJ\r\u0010H\u001a\u00020IH\u0007¢\u0006\u0002\bsJ\r\u0010K\u001a\u00020LH\u0007¢\u0006\u0002\btJ\b\u0010u\u001a\u00020vH\u0002J\r\u0010O\u001a\u00020\u000fH\u0007¢\u0006\u0002\bwR\u0013\u0010\b\u001a\u00020\t8G¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\nR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f8G¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\rR\u0013\u0010\u000e\u001a\u00020\u000f8G¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0010R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u00128G¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0013R\u0013\u0010\u0014\u001a\u00020\u00158G¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0016R\u0013\u0010\u0017\u001a\u00020\u000f8G¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0013\u0010\u0018\u001a\u00020\u00198G¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u001aR\u0019\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8G¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001eR\u0013\u0010\u001f\u001a\u00020 8G¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010!R\u0013\u0010\"\u001a\u00020#8G¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010$R\u0013\u0010%\u001a\u00020&8G¢\u0006\b\n\u0000\u001a\u0004\b%\u0010'R\u0013\u0010(\u001a\u00020)8G¢\u0006\b\n\u0000\u001a\u0004\b(\u0010*R\u0013\u0010+\u001a\u00020,8G¢\u0006\b\n\u0000\u001a\u0004\b+\u0010-R\u0013\u0010.\u001a\u00020,8G¢\u0006\b\n\u0000\u001a\u0004\b.\u0010-R\u0013\u0010/\u001a\u0002008G¢\u0006\b\n\u0000\u001a\u0004\b/\u00101R\u0019\u00102\u001a\b\u0012\u0004\u0012\u0002030\u001c8G¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001eR\u0013\u00104\u001a\u0002058G¢\u0006\b\n\u0000\u001a\u0004\b4\u00106R\u0019\u00107\u001a\b\u0012\u0004\u0012\u0002030\u001c8G¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u001eR\u0013\u00108\u001a\u00020\u000f8G¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\u0010R\u0019\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u001c8G¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\u001eR\u0015\u0010;\u001a\u0004\u0018\u00010<8G¢\u0006\b\n\u0000\u001a\u0004\b;\u0010=R\u0013\u0010>\u001a\u00020\t8G¢\u0006\b\n\u0000\u001a\u0004\b>\u0010\nR\u0013\u0010?\u001a\u00020@8G¢\u0006\b\n\u0000\u001a\u0004\b?\u0010AR\u0013\u0010B\u001a\u00020\u000f8G¢\u0006\b\n\u0000\u001a\u0004\bB\u0010\u0010R\u0013\u0010C\u001a\u00020,8G¢\u0006\b\n\u0000\u001a\u0004\bC\u0010-R\u0011\u0010D\u001a\u00020E¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0013\u0010H\u001a\u00020I8G¢\u0006\b\n\u0000\u001a\u0004\bH\u0010JR\u0011\u0010K\u001a\u00020L8G¢\u0006\u0006\u001a\u0004\bK\u0010MR\u0010\u0010N\u001a\u0004\u0018\u00010LX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010O\u001a\u00020\u000f8G¢\u0006\b\n\u0000\u001a\u0004\bO\u0010\u0010R\u0015\u0010P\u001a\u0004\u0018\u00010Q8G¢\u0006\b\n\u0000\u001a\u0004\bP\u0010R¨\u0006z"}, d2 = {"Lcom/applovin/shadow/okhttp3/OkHttpClient;", "", "Lcom/applovin/shadow/okhttp3/Call$Factory;", "Lcom/applovin/shadow/okhttp3/WebSocket$Factory;", "()V", "builder", "Lcom/applovin/shadow/okhttp3/OkHttpClient$Builder;", "(Lokhttp3/OkHttpClient$Builder;)V", "authenticator", "Lcom/applovin/shadow/okhttp3/Authenticator;", "()Lokhttp3/Authenticator;", "cache", "Lcom/applovin/shadow/okhttp3/Cache;", "()Lokhttp3/Cache;", "callTimeoutMillis", "", "()I", "certificateChainCleaner", "Lcom/applovin/shadow/okhttp3/internal/tls/CertificateChainCleaner;", "()Lokhttp3/internal/tls/CertificateChainCleaner;", "certificatePinner", "Lcom/applovin/shadow/okhttp3/CertificatePinner;", "()Lokhttp3/CertificatePinner;", "connectTimeoutMillis", "connectionPool", "Lcom/applovin/shadow/okhttp3/ConnectionPool;", "()Lokhttp3/ConnectionPool;", "connectionSpecs", "", "Lcom/applovin/shadow/okhttp3/ConnectionSpec;", "()Ljava/util/List;", "cookieJar", "Lcom/applovin/shadow/okhttp3/CookieJar;", "()Lokhttp3/CookieJar;", "dispatcher", "Lcom/applovin/shadow/okhttp3/Dispatcher;", "()Lokhttp3/Dispatcher;", "dns", "Lcom/applovin/shadow/okhttp3/Dns;", "()Lokhttp3/Dns;", "eventListenerFactory", "Lcom/applovin/shadow/okhttp3/EventListener$Factory;", "()Lokhttp3/EventListener$Factory;", "followRedirects", "", "()Z", "followSslRedirects", "hostnameVerifier", "Ljavax/net/ssl/HostnameVerifier;", "()Ljavax/net/ssl/HostnameVerifier;", "interceptors", "Lcom/applovin/shadow/okhttp3/Interceptor;", "minWebSocketMessageToCompress", "", "()J", "networkInterceptors", "pingIntervalMillis", "protocols", "Lcom/applovin/shadow/okhttp3/Protocol;", "proxy", "Ljava/net/Proxy;", "()Ljava/net/Proxy;", "proxyAuthenticator", "proxySelector", "Ljava/net/ProxySelector;", "()Ljava/net/ProxySelector;", "readTimeoutMillis", "retryOnConnectionFailure", "routeDatabase", "Lcom/applovin/shadow/okhttp3/internal/connection/RouteDatabase;", "getRouteDatabase", "()Lokhttp3/internal/connection/RouteDatabase;", "socketFactory", "Ljavax/net/SocketFactory;", "()Ljavax/net/SocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "()Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactoryOrNull", "writeTimeoutMillis", "x509TrustManager", "Ljavax/net/ssl/X509TrustManager;", "()Ljavax/net/ssl/X509TrustManager;", "-deprecated_authenticator", "-deprecated_cache", "-deprecated_callTimeoutMillis", "-deprecated_certificatePinner", "-deprecated_connectTimeoutMillis", "-deprecated_connectionPool", "-deprecated_connectionSpecs", "-deprecated_cookieJar", "-deprecated_dispatcher", "-deprecated_dns", "-deprecated_eventListenerFactory", "-deprecated_followRedirects", "-deprecated_followSslRedirects", "-deprecated_hostnameVerifier", "-deprecated_interceptors", "-deprecated_networkInterceptors", "newBuilder", "newCall", "Lcom/applovin/shadow/okhttp3/Call;", "request", "Lcom/applovin/shadow/okhttp3/Request;", "newWebSocket", "Lcom/applovin/shadow/okhttp3/WebSocket;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/applovin/shadow/okhttp3/WebSocketListener;", "-deprecated_pingIntervalMillis", "-deprecated_protocols", "-deprecated_proxy", "-deprecated_proxyAuthenticator", "-deprecated_proxySelector", "-deprecated_readTimeoutMillis", "-deprecated_retryOnConnectionFailure", "-deprecated_socketFactory", "-deprecated_sslSocketFactory", "verifyClientState", "", "-deprecated_writeTimeoutMillis", "Builder", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public class OkHttpClient implements Cloneable, Call.Factory, WebSocket.Factory {

    @NotNull
    private final Authenticator authenticator;

    @Nullable
    private final Cache cache;
    private final int callTimeoutMillis;

    @Nullable
    private final CertificateChainCleaner certificateChainCleaner;

    @NotNull
    private final CertificatePinner certificatePinner;
    private final int connectTimeoutMillis;

    @NotNull
    private final ConnectionPool connectionPool;

    @NotNull
    private final List<ConnectionSpec> connectionSpecs;

    @NotNull
    private final CookieJar cookieJar;

    @NotNull
    private final Dispatcher dispatcher;

    @NotNull
    private final Dns dns;

    @NotNull
    private final EventListener.Factory eventListenerFactory;
    private final boolean followRedirects;
    private final boolean followSslRedirects;

    @NotNull
    private final HostnameVerifier hostnameVerifier;

    @NotNull
    private final List<Interceptor> interceptors;
    private final long minWebSocketMessageToCompress;

    @NotNull
    private final List<Interceptor> networkInterceptors;
    private final int pingIntervalMillis;

    @NotNull
    private final List<Protocol> protocols;

    @Nullable
    private final Proxy proxy;

    @NotNull
    private final Authenticator proxyAuthenticator;

    @NotNull
    private final ProxySelector proxySelector;
    private final int readTimeoutMillis;
    private final boolean retryOnConnectionFailure;

    @NotNull
    private final RouteDatabase routeDatabase;

    @NotNull
    private final SocketFactory socketFactory;

    @Nullable
    private final SSLSocketFactory sslSocketFactoryOrNull;
    private final int writeTimeoutMillis;

    @Nullable
    private final X509TrustManager x509TrustManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final List<Protocol> DEFAULT_PROTOCOLS = Util.immutableListOf(Protocol.HTTP_2, Protocol.HTTP_1_1);

    @NotNull
    private static final List<ConnectionSpec> DEFAULT_CONNECTION_SPECS = Util.immutableListOf(ConnectionSpec.MODERN_TLS, ConnectionSpec.CLEARTEXT);

    public OkHttpClient(@NotNull Builder builder) {
        ProxySelector proxySelector;
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.dispatcher = builder.getDispatcher();
        this.connectionPool = builder.getConnectionPool();
        this.interceptors = Util.toImmutableList(builder.getInterceptors$okhttp());
        this.networkInterceptors = Util.toImmutableList(builder.getNetworkInterceptors$okhttp());
        this.eventListenerFactory = builder.getEventListenerFactory();
        this.retryOnConnectionFailure = builder.getRetryOnConnectionFailure();
        this.authenticator = builder.getAuthenticator();
        this.followRedirects = builder.getFollowRedirects();
        this.followSslRedirects = builder.getFollowSslRedirects();
        this.cookieJar = builder.getCookieJar();
        this.cache = builder.getCache();
        this.dns = builder.getDns();
        this.proxy = builder.getProxy();
        if (builder.getProxy() != null) {
            proxySelector = NullProxySelector.INSTANCE;
        } else {
            proxySelector = builder.getProxySelector();
            proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
            if (proxySelector == null) {
                proxySelector = NullProxySelector.INSTANCE;
            }
        }
        this.proxySelector = proxySelector;
        this.proxyAuthenticator = builder.getProxyAuthenticator();
        this.socketFactory = builder.getSocketFactory();
        List<ConnectionSpec> connectionSpecs$okhttp = builder.getConnectionSpecs$okhttp();
        this.connectionSpecs = connectionSpecs$okhttp;
        this.protocols = builder.getProtocols$okhttp();
        this.hostnameVerifier = builder.getHostnameVerifier();
        this.callTimeoutMillis = builder.getCallTimeout();
        this.connectTimeoutMillis = builder.getConnectTimeout();
        this.readTimeoutMillis = builder.getReadTimeout();
        this.writeTimeoutMillis = builder.getWriteTimeout();
        this.pingIntervalMillis = builder.getPingInterval();
        this.minWebSocketMessageToCompress = builder.getMinWebSocketMessageToCompress();
        RouteDatabase routeDatabase = builder.getRouteDatabase();
        this.routeDatabase = routeDatabase == null ? new RouteDatabase() : routeDatabase;
        List<ConnectionSpec> list = connectionSpecs$okhttp;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((ConnectionSpec) it.next()).getIsTls()) {
                    if (builder.getSslSocketFactoryOrNull() != null) {
                        this.sslSocketFactoryOrNull = builder.getSslSocketFactoryOrNull();
                        CertificateChainCleaner certificateChainCleaner = builder.getCertificateChainCleaner();
                        Intrinsics.checkNotNull(certificateChainCleaner);
                        this.certificateChainCleaner = certificateChainCleaner;
                        X509TrustManager x509TrustManagerOrNull = builder.getX509TrustManagerOrNull();
                        Intrinsics.checkNotNull(x509TrustManagerOrNull);
                        this.x509TrustManager = x509TrustManagerOrNull;
                        CertificatePinner certificatePinner = builder.getCertificatePinner();
                        Intrinsics.checkNotNull(certificateChainCleaner);
                        this.certificatePinner = certificatePinner.withCertificateChainCleaner$okhttp(certificateChainCleaner);
                    } else {
                        Platform.Companion companion = Platform.INSTANCE;
                        X509TrustManager platformTrustManager = companion.get().platformTrustManager();
                        this.x509TrustManager = platformTrustManager;
                        Platform platform = companion.get();
                        Intrinsics.checkNotNull(platformTrustManager);
                        this.sslSocketFactoryOrNull = platform.newSslSocketFactory(platformTrustManager);
                        CertificateChainCleaner.Companion companion2 = CertificateChainCleaner.INSTANCE;
                        Intrinsics.checkNotNull(platformTrustManager);
                        CertificateChainCleaner certificateChainCleaner2 = companion2.get(platformTrustManager);
                        this.certificateChainCleaner = certificateChainCleaner2;
                        CertificatePinner certificatePinner2 = builder.getCertificatePinner();
                        Intrinsics.checkNotNull(certificateChainCleaner2);
                        this.certificatePinner = certificatePinner2.withCertificateChainCleaner$okhttp(certificateChainCleaner2);
                    }
                    verifyClientState();
                }
            }
        }
        this.sslSocketFactoryOrNull = null;
        this.certificateChainCleaner = null;
        this.x509TrustManager = null;
        this.certificatePinner = CertificatePinner.DEFAULT;
        verifyClientState();
    }

    @NotNull
    public Object clone() {
        return super.clone();
    }

    @NotNull
    public final Dispatcher dispatcher() {
        return this.dispatcher;
    }

    @NotNull
    public final ConnectionPool connectionPool() {
        return this.connectionPool;
    }

    @NotNull
    public final List<Interceptor> interceptors() {
        return this.interceptors;
    }

    @NotNull
    public final List<Interceptor> networkInterceptors() {
        return this.networkInterceptors;
    }

    @NotNull
    public final EventListener.Factory eventListenerFactory() {
        return this.eventListenerFactory;
    }

    public final boolean retryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }

    @NotNull
    public final Authenticator authenticator() {
        return this.authenticator;
    }

    public final boolean followRedirects() {
        return this.followRedirects;
    }

    public final boolean followSslRedirects() {
        return this.followSslRedirects;
    }

    @NotNull
    public final CookieJar cookieJar() {
        return this.cookieJar;
    }

    @Nullable
    public final Cache cache() {
        return this.cache;
    }

    @NotNull
    public final Dns dns() {
        return this.dns;
    }

    @Nullable
    public final Proxy proxy() {
        return this.proxy;
    }

    @NotNull
    public final ProxySelector proxySelector() {
        return this.proxySelector;
    }

    @NotNull
    public final Authenticator proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    @NotNull
    public final SocketFactory socketFactory() {
        return this.socketFactory;
    }

    @NotNull
    public final SSLSocketFactory sslSocketFactory() {
        SSLSocketFactory sSLSocketFactory = this.sslSocketFactoryOrNull;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    @Nullable
    /* renamed from: x509TrustManager, reason: from getter */
    public final X509TrustManager getX509TrustManager() {
        return this.x509TrustManager;
    }

    @NotNull
    public final List<ConnectionSpec> connectionSpecs() {
        return this.connectionSpecs;
    }

    @NotNull
    public final List<Protocol> protocols() {
        return this.protocols;
    }

    @NotNull
    public final HostnameVerifier hostnameVerifier() {
        return this.hostnameVerifier;
    }

    @NotNull
    public final CertificatePinner certificatePinner() {
        return this.certificatePinner;
    }

    @Nullable
    /* renamed from: certificateChainCleaner, reason: from getter */
    public final CertificateChainCleaner getCertificateChainCleaner() {
        return this.certificateChainCleaner;
    }

    public final int callTimeoutMillis() {
        return this.callTimeoutMillis;
    }

    public final int connectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    public final int readTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    public final int writeTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    public final int pingIntervalMillis() {
        return this.pingIntervalMillis;
    }

    /* renamed from: minWebSocketMessageToCompress, reason: from getter */
    public final long getMinWebSocketMessageToCompress() {
        return this.minWebSocketMessageToCompress;
    }

    @NotNull
    public final RouteDatabase getRouteDatabase() {
        return this.routeDatabase;
    }

    public OkHttpClient() {
        this(new Builder());
    }

    private final void verifyClientState() {
        List<Interceptor> list = this.interceptors;
        Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + this.interceptors).toString());
        }
        List<Interceptor> list2 = this.networkInterceptors;
        Intrinsics.checkNotNull(list2, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list2.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + this.networkInterceptors).toString());
        }
        List<ConnectionSpec> list3 = this.connectionSpecs;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                if (((ConnectionSpec) it.next()).getIsTls()) {
                    if (this.sslSocketFactoryOrNull == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (this.certificateChainCleaner == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (this.x509TrustManager == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (this.sslSocketFactoryOrNull != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.certificateChainCleaner != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.x509TrustManager != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!Intrinsics.areEqual(this.certificatePinner, CertificatePinner.DEFAULT)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    @Override // com.applovin.shadow.okhttp3.Call.Factory
    @NotNull
    public Call newCall(@NotNull Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new RealCall(this, request, false);
    }

    @Override // com.applovin.shadow.okhttp3.WebSocket.Factory
    @NotNull
    public WebSocket newWebSocket(@NotNull Request request, @NotNull WebSocketListener listener) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(listener, "listener");
        RealWebSocket realWebSocket = new RealWebSocket(TaskRunner.INSTANCE, request, listener, new Random(), this.pingIntervalMillis, null, this.minWebSocketMessageToCompress);
        realWebSocket.connect(this);
        return realWebSocket;
    }

    @NotNull
    public Builder newBuilder() {
        return new Builder(this);
    }

    @Deprecated
    @NotNull
    /* renamed from: -deprecated_dispatcher, reason: not valid java name and from getter */
    public final Dispatcher getDispatcher() {
        return this.dispatcher;
    }

    @Deprecated
    @NotNull
    /* renamed from: -deprecated_connectionPool, reason: not valid java name and from getter */
    public final ConnectionPool getConnectionPool() {
        return this.connectionPool;
    }

    @Deprecated
    @NotNull
    /* renamed from: -deprecated_interceptors, reason: not valid java name */
    public final List<Interceptor> m3155deprecated_interceptors() {
        return this.interceptors;
    }

    @Deprecated
    @NotNull
    /* renamed from: -deprecated_networkInterceptors, reason: not valid java name */
    public final List<Interceptor> m3156deprecated_networkInterceptors() {
        return this.networkInterceptors;
    }

    @Deprecated
    @NotNull
    /* renamed from: -deprecated_eventListenerFactory, reason: not valid java name and from getter */
    public final EventListener.Factory getEventListenerFactory() {
        return this.eventListenerFactory;
    }

    @Deprecated
    /* renamed from: -deprecated_retryOnConnectionFailure, reason: not valid java name and from getter */
    public final boolean getRetryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }

    @Deprecated
    @NotNull
    /* renamed from: -deprecated_authenticator, reason: not valid java name and from getter */
    public final Authenticator getAuthenticator() {
        return this.authenticator;
    }

    @Deprecated
    /* renamed from: -deprecated_followRedirects, reason: not valid java name and from getter */
    public final boolean getFollowRedirects() {
        return this.followRedirects;
    }

    @Deprecated
    /* renamed from: -deprecated_followSslRedirects, reason: not valid java name and from getter */
    public final boolean getFollowSslRedirects() {
        return this.followSslRedirects;
    }

    @Deprecated
    @NotNull
    /* renamed from: -deprecated_cookieJar, reason: not valid java name and from getter */
    public final CookieJar getCookieJar() {
        return this.cookieJar;
    }

    @Deprecated
    @Nullable
    /* renamed from: -deprecated_cache, reason: not valid java name and from getter */
    public final Cache getCache() {
        return this.cache;
    }

    @Deprecated
    @NotNull
    /* renamed from: -deprecated_dns, reason: not valid java name and from getter */
    public final Dns getDns() {
        return this.dns;
    }

    @Deprecated
    @Nullable
    /* renamed from: -deprecated_proxy, reason: not valid java name and from getter */
    public final Proxy getProxy() {
        return this.proxy;
    }

    @Deprecated
    @NotNull
    /* renamed from: -deprecated_proxySelector, reason: not valid java name and from getter */
    public final ProxySelector getProxySelector() {
        return this.proxySelector;
    }

    @Deprecated
    @NotNull
    /* renamed from: -deprecated_proxyAuthenticator, reason: not valid java name and from getter */
    public final Authenticator getProxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    @Deprecated
    @NotNull
    /* renamed from: -deprecated_socketFactory, reason: not valid java name and from getter */
    public final SocketFactory getSocketFactory() {
        return this.socketFactory;
    }

    @Deprecated
    @NotNull
    /* renamed from: -deprecated_sslSocketFactory, reason: not valid java name */
    public final SSLSocketFactory m3165deprecated_sslSocketFactory() {
        return sslSocketFactory();
    }

    @Deprecated
    @NotNull
    /* renamed from: -deprecated_connectionSpecs, reason: not valid java name */
    public final List<ConnectionSpec> m3147deprecated_connectionSpecs() {
        return this.connectionSpecs;
    }

    @Deprecated
    @NotNull
    /* renamed from: -deprecated_protocols, reason: not valid java name */
    public final List<Protocol> m3158deprecated_protocols() {
        return this.protocols;
    }

    @Deprecated
    @NotNull
    /* renamed from: -deprecated_hostnameVerifier, reason: not valid java name and from getter */
    public final HostnameVerifier getHostnameVerifier() {
        return this.hostnameVerifier;
    }

    @Deprecated
    @NotNull
    /* renamed from: -deprecated_certificatePinner, reason: not valid java name and from getter */
    public final CertificatePinner getCertificatePinner() {
        return this.certificatePinner;
    }

    @Deprecated
    /* renamed from: -deprecated_callTimeoutMillis, reason: not valid java name and from getter */
    public final int getCallTimeoutMillis() {
        return this.callTimeoutMillis;
    }

    @Deprecated
    /* renamed from: -deprecated_connectTimeoutMillis, reason: not valid java name and from getter */
    public final int getConnectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    @Deprecated
    /* renamed from: -deprecated_readTimeoutMillis, reason: not valid java name and from getter */
    public final int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    @Deprecated
    /* renamed from: -deprecated_writeTimeoutMillis, reason: not valid java name and from getter */
    public final int getWriteTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    @Deprecated
    /* renamed from: -deprecated_pingIntervalMillis, reason: not valid java name and from getter */
    public final int getPingIntervalMillis() {
        return this.pingIntervalMillis;
    }

    /* compiled from: OkHttpClient.kt */
    @Metadata(d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bg\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0007¢\u0006\u0004\b\u0004\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0012\u001a\u00020\u00002\u0014\b\u0004\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u001a\u0010\u0010J\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u001b\u0010\u0013J)\u0010\u001b\u001a\u00020\u00002\u0014\b\u0004\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0019J\u0015\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u00020\u00002\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020\u00002\u0006\u0010)\u001a\u00020#¢\u0006\u0004\b)\u0010%J\u0015\u0010+\u001a\u00020\u00002\u0006\u0010*\u001a\u00020#¢\u0006\u0004\b+\u0010%J\u0015\u0010-\u001a\u00020\u00002\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\u00002\b\u00100\u001a\u0004\u0018\u00010/¢\u0006\u0004\b0\u00101J\u0015\u00103\u001a\u00020\u00002\u0006\u00103\u001a\u000202¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\u00002\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\b6\u00107J\u0015\u00109\u001a\u00020\u00002\u0006\u00109\u001a\u000208¢\u0006\u0004\b9\u0010:J\u0015\u0010;\u001a\u00020\u00002\u0006\u0010;\u001a\u00020&¢\u0006\u0004\b;\u0010(J\u0015\u0010=\u001a\u00020\u00002\u0006\u0010=\u001a\u00020<¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020\u00002\u0006\u0010@\u001a\u00020?H\u0007¢\u0006\u0004\b@\u0010AJ\u001d\u0010@\u001a\u00020\u00002\u0006\u0010@\u001a\u00020?2\u0006\u0010C\u001a\u00020B¢\u0006\u0004\b@\u0010DJ\u001b\u0010G\u001a\u00020\u00002\f\u0010G\u001a\b\u0012\u0004\u0012\u00020F0E¢\u0006\u0004\bG\u0010HJ\u001b\u0010J\u001a\u00020\u00002\f\u0010J\u001a\b\u0012\u0004\u0012\u00020I0E¢\u0006\u0004\bJ\u0010HJ\u0015\u0010L\u001a\u00020\u00002\u0006\u0010L\u001a\u00020K¢\u0006\u0004\bL\u0010MJ\u0015\u0010O\u001a\u00020\u00002\u0006\u0010O\u001a\u00020N¢\u0006\u0004\bO\u0010PJ\u001d\u0010U\u001a\u00020\u00002\u0006\u0010R\u001a\u00020Q2\u0006\u0010T\u001a\u00020S¢\u0006\u0004\bU\u0010VJ\u0017\u0010U\u001a\u00020\u00002\u0006\u0010X\u001a\u00020WH\u0007¢\u0006\u0004\bU\u0010YJ\u001d\u0010Z\u001a\u00020\u00002\u0006\u0010R\u001a\u00020Q2\u0006\u0010T\u001a\u00020S¢\u0006\u0004\bZ\u0010VJ\u0017\u0010Z\u001a\u00020\u00002\u0006\u0010X\u001a\u00020WH\u0007¢\u0006\u0004\bZ\u0010YJ\u001d\u0010[\u001a\u00020\u00002\u0006\u0010R\u001a\u00020Q2\u0006\u0010T\u001a\u00020S¢\u0006\u0004\b[\u0010VJ\u0017\u0010[\u001a\u00020\u00002\u0006\u0010X\u001a\u00020WH\u0007¢\u0006\u0004\b[\u0010YJ\u001d\u0010\\\u001a\u00020\u00002\u0006\u0010R\u001a\u00020Q2\u0006\u0010T\u001a\u00020S¢\u0006\u0004\b\\\u0010VJ\u0017\u0010\\\u001a\u00020\u00002\u0006\u0010X\u001a\u00020WH\u0007¢\u0006\u0004\b\\\u0010YJ\u001d\u0010^\u001a\u00020\u00002\u0006\u0010]\u001a\u00020Q2\u0006\u0010T\u001a\u00020S¢\u0006\u0004\b^\u0010VJ\u0017\u0010^\u001a\u00020\u00002\u0006\u0010X\u001a\u00020WH\u0007¢\u0006\u0004\b^\u0010YJ\u0015\u0010`\u001a\u00020\u00002\u0006\u0010_\u001a\u00020Q¢\u0006\u0004\b`\u0010aJ\r\u0010b\u001a\u00020\u0002¢\u0006\u0004\bb\u0010cR\"\u0010\b\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\"\u0010\u000b\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010n\u001a\u0004\bo\u0010\u0010R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010n\u001a\u0004\bp\u0010\u0010R\"\u0010!\u001a\u00020 8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\"\u0010$\u001a\u00020#8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR\"\u0010'\u001a\u00020&8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR$\u0010)\u001a\u00020#8\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b)\u0010v\u001a\u0005\b\u0080\u0001\u0010x\"\u0005\b\u0081\u0001\u0010zR$\u0010+\u001a\u00020#8\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b+\u0010v\u001a\u0005\b\u0082\u0001\u0010x\"\u0005\b\u0083\u0001\u0010zR'\u0010-\u001a\u00020,8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b-\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R)\u00100\u001a\u0004\u0018\u00010/8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b0\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R'\u00103\u001a\u0002028\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b3\u0010\u008e\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u0006\b\u0091\u0001\u0010\u0092\u0001R)\u00106\u001a\u0004\u0018\u0001058\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b6\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R)\u00109\u001a\u0004\u0018\u0001088\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b9\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001\"\u0006\b\u009b\u0001\u0010\u009c\u0001R$\u0010;\u001a\u00020&8\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b;\u0010{\u001a\u0005\b\u009d\u0001\u0010}\"\u0005\b\u009e\u0001\u0010\u007fR'\u0010=\u001a\u00020<8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b=\u0010\u009f\u0001\u001a\u0006\b \u0001\u0010¡\u0001\"\u0006\b¢\u0001\u0010£\u0001R+\u0010¤\u0001\u001a\u0004\u0018\u00010?8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¤\u0001\u0010¥\u0001\u001a\u0006\b¦\u0001\u0010§\u0001\"\u0006\b¨\u0001\u0010©\u0001R+\u0010ª\u0001\u001a\u0004\u0018\u00010B8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bª\u0001\u0010«\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001\"\u0006\b®\u0001\u0010¯\u0001R+\u0010G\u001a\b\u0012\u0004\u0012\u00020F0E8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\bG\u0010n\u001a\u0005\b°\u0001\u0010\u0010\"\u0006\b±\u0001\u0010²\u0001R+\u0010J\u001a\b\u0012\u0004\u0012\u00020I0E8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\bJ\u0010n\u001a\u0005\b³\u0001\u0010\u0010\"\u0006\b´\u0001\u0010²\u0001R'\u0010L\u001a\u00020K8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bL\u0010µ\u0001\u001a\u0006\b¶\u0001\u0010·\u0001\"\u0006\b¸\u0001\u0010¹\u0001R'\u0010O\u001a\u00020N8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bO\u0010º\u0001\u001a\u0006\b»\u0001\u0010¼\u0001\"\u0006\b½\u0001\u0010¾\u0001R,\u0010À\u0001\u001a\u0005\u0018\u00010¿\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÀ\u0001\u0010Á\u0001\u001a\u0006\bÂ\u0001\u0010Ã\u0001\"\u0006\bÄ\u0001\u0010Å\u0001R(\u0010U\u001a\u00030Æ\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bU\u0010Ç\u0001\u001a\u0006\bÈ\u0001\u0010É\u0001\"\u0006\bÊ\u0001\u0010Ë\u0001R(\u0010Z\u001a\u00030Æ\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bZ\u0010Ç\u0001\u001a\u0006\bÌ\u0001\u0010É\u0001\"\u0006\bÍ\u0001\u0010Ë\u0001R(\u0010[\u001a\u00030Æ\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b[\u0010Ç\u0001\u001a\u0006\bÎ\u0001\u0010É\u0001\"\u0006\bÏ\u0001\u0010Ë\u0001R(\u0010\\\u001a\u00030Æ\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b\\\u0010Ç\u0001\u001a\u0006\bÐ\u0001\u0010É\u0001\"\u0006\bÑ\u0001\u0010Ë\u0001R(\u0010^\u001a\u00030Æ\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b^\u0010Ç\u0001\u001a\u0006\bÒ\u0001\u0010É\u0001\"\u0006\bÓ\u0001\u0010Ë\u0001R'\u0010`\u001a\u00020Q8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b`\u0010Ô\u0001\u001a\u0006\bÕ\u0001\u0010Ö\u0001\"\u0006\b×\u0001\u0010Ø\u0001R,\u0010Ú\u0001\u001a\u0005\u0018\u00010Ù\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÚ\u0001\u0010Û\u0001\u001a\u0006\bÜ\u0001\u0010Ý\u0001\"\u0006\bÞ\u0001\u0010ß\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006à\u0001"}, d2 = {"Lcom/applovin/shadow/okhttp3/OkHttpClient$Builder;", "", "Lcom/applovin/shadow/okhttp3/OkHttpClient;", "okHttpClient", "<init>", "(Lokhttp3/OkHttpClient;)V", "()V", "Lcom/applovin/shadow/okhttp3/Dispatcher;", "dispatcher", "(Lcom/applovin/shadow/okhttp3/Dispatcher;)Lcom/applovin/shadow/okhttp3/OkHttpClient$Builder;", "Lcom/applovin/shadow/okhttp3/ConnectionPool;", "connectionPool", "(Lcom/applovin/shadow/okhttp3/ConnectionPool;)Lcom/applovin/shadow/okhttp3/OkHttpClient$Builder;", "", "Lcom/applovin/shadow/okhttp3/Interceptor;", "interceptors", "()Ljava/util/List;", "interceptor", "addInterceptor", "(Lcom/applovin/shadow/okhttp3/Interceptor;)Lcom/applovin/shadow/okhttp3/OkHttpClient$Builder;", "Lkotlin/Function1;", "Lcom/applovin/shadow/okhttp3/Interceptor$Chain;", "Lcom/applovin/shadow/okhttp3/Response;", "block", "-addInterceptor", "(Lkotlin/jvm/functions/Function1;)Lcom/applovin/shadow/okhttp3/OkHttpClient$Builder;", "networkInterceptors", "addNetworkInterceptor", "-addNetworkInterceptor", "Lcom/applovin/shadow/okhttp3/EventListener;", "eventListener", "(Lcom/applovin/shadow/okhttp3/EventListener;)Lcom/applovin/shadow/okhttp3/OkHttpClient$Builder;", "Lcom/applovin/shadow/okhttp3/EventListener$Factory;", "eventListenerFactory", "(Lcom/applovin/shadow/okhttp3/EventListener$Factory;)Lcom/applovin/shadow/okhttp3/OkHttpClient$Builder;", "", "retryOnConnectionFailure", "(Z)Lcom/applovin/shadow/okhttp3/OkHttpClient$Builder;", "Lcom/applovin/shadow/okhttp3/Authenticator;", "authenticator", "(Lcom/applovin/shadow/okhttp3/Authenticator;)Lcom/applovin/shadow/okhttp3/OkHttpClient$Builder;", "followRedirects", "followProtocolRedirects", "followSslRedirects", "Lcom/applovin/shadow/okhttp3/CookieJar;", "cookieJar", "(Lcom/applovin/shadow/okhttp3/CookieJar;)Lcom/applovin/shadow/okhttp3/OkHttpClient$Builder;", "Lcom/applovin/shadow/okhttp3/Cache;", "cache", "(Lcom/applovin/shadow/okhttp3/Cache;)Lcom/applovin/shadow/okhttp3/OkHttpClient$Builder;", "Lcom/applovin/shadow/okhttp3/Dns;", "dns", "(Lcom/applovin/shadow/okhttp3/Dns;)Lcom/applovin/shadow/okhttp3/OkHttpClient$Builder;", "Ljava/net/Proxy;", "proxy", "(Ljava/net/Proxy;)Lcom/applovin/shadow/okhttp3/OkHttpClient$Builder;", "Ljava/net/ProxySelector;", "proxySelector", "(Ljava/net/ProxySelector;)Lcom/applovin/shadow/okhttp3/OkHttpClient$Builder;", "proxyAuthenticator", "Ljavax/net/SocketFactory;", "socketFactory", "(Ljavax/net/SocketFactory;)Lcom/applovin/shadow/okhttp3/OkHttpClient$Builder;", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "(Ljavax/net/ssl/SSLSocketFactory;)Lcom/applovin/shadow/okhttp3/OkHttpClient$Builder;", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "(Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;)Lcom/applovin/shadow/okhttp3/OkHttpClient$Builder;", "", "Lcom/applovin/shadow/okhttp3/ConnectionSpec;", "connectionSpecs", "(Ljava/util/List;)Lcom/applovin/shadow/okhttp3/OkHttpClient$Builder;", "Lcom/applovin/shadow/okhttp3/Protocol;", "protocols", "Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "(Ljavax/net/ssl/HostnameVerifier;)Lcom/applovin/shadow/okhttp3/OkHttpClient$Builder;", "Lcom/applovin/shadow/okhttp3/CertificatePinner;", "certificatePinner", "(Lcom/applovin/shadow/okhttp3/CertificatePinner;)Lcom/applovin/shadow/okhttp3/OkHttpClient$Builder;", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "callTimeout", "(JLjava/util/concurrent/TimeUnit;)Lcom/applovin/shadow/okhttp3/OkHttpClient$Builder;", "Ljava/time/Duration;", IronSourceConstants.EVENTS_DURATION, "(Ljava/time/Duration;)Lcom/applovin/shadow/okhttp3/OkHttpClient$Builder;", "connectTimeout", "readTimeout", "writeTimeout", "interval", "pingInterval", "bytes", "minWebSocketMessageToCompress", "(J)Lcom/applovin/shadow/okhttp3/OkHttpClient$Builder;", "build", "()Lcom/applovin/shadow/okhttp3/OkHttpClient;", "Lcom/applovin/shadow/okhttp3/Dispatcher;", "getDispatcher$okhttp", "()Lokhttp3/Dispatcher;", "setDispatcher$okhttp", "(Lokhttp3/Dispatcher;)V", "Lcom/applovin/shadow/okhttp3/ConnectionPool;", "getConnectionPool$okhttp", "()Lokhttp3/ConnectionPool;", "setConnectionPool$okhttp", "(Lokhttp3/ConnectionPool;)V", "Ljava/util/List;", "getInterceptors$okhttp", "getNetworkInterceptors$okhttp", "Lcom/applovin/shadow/okhttp3/EventListener$Factory;", "getEventListenerFactory$okhttp", "()Lokhttp3/EventListener$Factory;", "setEventListenerFactory$okhttp", "(Lokhttp3/EventListener$Factory;)V", "Z", "getRetryOnConnectionFailure$okhttp", "()Z", "setRetryOnConnectionFailure$okhttp", "(Z)V", "Lcom/applovin/shadow/okhttp3/Authenticator;", "getAuthenticator$okhttp", "()Lokhttp3/Authenticator;", "setAuthenticator$okhttp", "(Lokhttp3/Authenticator;)V", "getFollowRedirects$okhttp", "setFollowRedirects$okhttp", "getFollowSslRedirects$okhttp", "setFollowSslRedirects$okhttp", "Lcom/applovin/shadow/okhttp3/CookieJar;", "getCookieJar$okhttp", "()Lokhttp3/CookieJar;", "setCookieJar$okhttp", "(Lokhttp3/CookieJar;)V", "Lcom/applovin/shadow/okhttp3/Cache;", "getCache$okhttp", "()Lokhttp3/Cache;", "setCache$okhttp", "(Lokhttp3/Cache;)V", "Lcom/applovin/shadow/okhttp3/Dns;", "getDns$okhttp", "()Lokhttp3/Dns;", "setDns$okhttp", "(Lokhttp3/Dns;)V", "Ljava/net/Proxy;", "getProxy$okhttp", "()Ljava/net/Proxy;", "setProxy$okhttp", "(Ljava/net/Proxy;)V", "Ljava/net/ProxySelector;", "getProxySelector$okhttp", "()Ljava/net/ProxySelector;", "setProxySelector$okhttp", "(Ljava/net/ProxySelector;)V", "getProxyAuthenticator$okhttp", "setProxyAuthenticator$okhttp", "Ljavax/net/SocketFactory;", "getSocketFactory$okhttp", "()Ljavax/net/SocketFactory;", "setSocketFactory$okhttp", "(Ljavax/net/SocketFactory;)V", "sslSocketFactoryOrNull", "Ljavax/net/ssl/SSLSocketFactory;", "getSslSocketFactoryOrNull$okhttp", "()Ljavax/net/ssl/SSLSocketFactory;", "setSslSocketFactoryOrNull$okhttp", "(Ljavax/net/ssl/SSLSocketFactory;)V", "x509TrustManagerOrNull", "Ljavax/net/ssl/X509TrustManager;", "getX509TrustManagerOrNull$okhttp", "()Ljavax/net/ssl/X509TrustManager;", "setX509TrustManagerOrNull$okhttp", "(Ljavax/net/ssl/X509TrustManager;)V", "getConnectionSpecs$okhttp", "setConnectionSpecs$okhttp", "(Ljava/util/List;)V", "getProtocols$okhttp", "setProtocols$okhttp", "Ljavax/net/ssl/HostnameVerifier;", "getHostnameVerifier$okhttp", "()Ljavax/net/ssl/HostnameVerifier;", "setHostnameVerifier$okhttp", "(Ljavax/net/ssl/HostnameVerifier;)V", "Lcom/applovin/shadow/okhttp3/CertificatePinner;", "getCertificatePinner$okhttp", "()Lokhttp3/CertificatePinner;", "setCertificatePinner$okhttp", "(Lokhttp3/CertificatePinner;)V", "Lcom/applovin/shadow/okhttp3/internal/tls/CertificateChainCleaner;", "certificateChainCleaner", "Lcom/applovin/shadow/okhttp3/internal/tls/CertificateChainCleaner;", "getCertificateChainCleaner$okhttp", "()Lokhttp3/internal/tls/CertificateChainCleaner;", "setCertificateChainCleaner$okhttp", "(Lokhttp3/internal/tls/CertificateChainCleaner;)V", "", "I", "getCallTimeout$okhttp", "()I", "setCallTimeout$okhttp", "(I)V", "getConnectTimeout$okhttp", "setConnectTimeout$okhttp", "getReadTimeout$okhttp", "setReadTimeout$okhttp", "getWriteTimeout$okhttp", "setWriteTimeout$okhttp", "getPingInterval$okhttp", "setPingInterval$okhttp", "J", "getMinWebSocketMessageToCompress$okhttp", "()J", "setMinWebSocketMessageToCompress$okhttp", "(J)V", "Lcom/applovin/shadow/okhttp3/internal/connection/RouteDatabase;", "routeDatabase", "Lcom/applovin/shadow/okhttp3/internal/connection/RouteDatabase;", "getRouteDatabase$okhttp", "()Lokhttp3/internal/connection/RouteDatabase;", "setRouteDatabase$okhttp", "(Lokhttp3/internal/connection/RouteDatabase;)V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {

        @NotNull
        private Authenticator authenticator;

        @Nullable
        private Cache cache;
        private int callTimeout;

        @Nullable
        private CertificateChainCleaner certificateChainCleaner;

        @NotNull
        private CertificatePinner certificatePinner;
        private int connectTimeout;

        @NotNull
        private ConnectionPool connectionPool;

        @NotNull
        private List<ConnectionSpec> connectionSpecs;

        @NotNull
        private CookieJar cookieJar;

        @NotNull
        private Dispatcher dispatcher;

        @NotNull
        private Dns dns;

        @NotNull
        private EventListener.Factory eventListenerFactory;
        private boolean followRedirects;
        private boolean followSslRedirects;

        @NotNull
        private HostnameVerifier hostnameVerifier;

        @NotNull
        private final List<Interceptor> interceptors;
        private long minWebSocketMessageToCompress;

        @NotNull
        private final List<Interceptor> networkInterceptors;
        private int pingInterval;

        @NotNull
        private List<? extends Protocol> protocols;

        @Nullable
        private Proxy proxy;

        @NotNull
        private Authenticator proxyAuthenticator;

        @Nullable
        private ProxySelector proxySelector;
        private int readTimeout;
        private boolean retryOnConnectionFailure;

        @Nullable
        private RouteDatabase routeDatabase;

        @NotNull
        private SocketFactory socketFactory;

        @Nullable
        private SSLSocketFactory sslSocketFactoryOrNull;
        private int writeTimeout;

        @Nullable
        private X509TrustManager x509TrustManagerOrNull;

        public Builder() {
            this.dispatcher = new Dispatcher();
            this.connectionPool = new ConnectionPool();
            this.interceptors = new ArrayList();
            this.networkInterceptors = new ArrayList();
            this.eventListenerFactory = Util.asFactory(EventListener.NONE);
            this.retryOnConnectionFailure = true;
            Authenticator authenticator = Authenticator.NONE;
            this.authenticator = authenticator;
            this.followRedirects = true;
            this.followSslRedirects = true;
            this.cookieJar = CookieJar.NO_COOKIES;
            this.dns = Dns.SYSTEM;
            this.proxyAuthenticator = authenticator;
            SocketFactory socketFactory = SocketFactory.getDefault();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "getDefault()");
            this.socketFactory = socketFactory;
            Companion companion = OkHttpClient.INSTANCE;
            this.connectionSpecs = companion.getDEFAULT_CONNECTION_SPECS$okhttp();
            this.protocols = companion.getDEFAULT_PROTOCOLS$okhttp();
            this.hostnameVerifier = OkHostnameVerifier.INSTANCE;
            this.certificatePinner = CertificatePinner.DEFAULT;
            this.connectTimeout = 10000;
            this.readTimeout = 10000;
            this.writeTimeout = 10000;
            this.minWebSocketMessageToCompress = 1024L;
        }

        @NotNull
        /* renamed from: getDispatcher$okhttp, reason: from getter */
        public final Dispatcher getDispatcher() {
            return this.dispatcher;
        }

        public final void setDispatcher$okhttp(@NotNull Dispatcher dispatcher) {
            Intrinsics.checkNotNullParameter(dispatcher, "<set-?>");
            this.dispatcher = dispatcher;
        }

        @NotNull
        /* renamed from: getConnectionPool$okhttp, reason: from getter */
        public final ConnectionPool getConnectionPool() {
            return this.connectionPool;
        }

        public final void setConnectionPool$okhttp(@NotNull ConnectionPool connectionPool) {
            Intrinsics.checkNotNullParameter(connectionPool, "<set-?>");
            this.connectionPool = connectionPool;
        }

        @NotNull
        public final List<Interceptor> getInterceptors$okhttp() {
            return this.interceptors;
        }

        @NotNull
        public final List<Interceptor> getNetworkInterceptors$okhttp() {
            return this.networkInterceptors;
        }

        @NotNull
        /* renamed from: getEventListenerFactory$okhttp, reason: from getter */
        public final EventListener.Factory getEventListenerFactory() {
            return this.eventListenerFactory;
        }

        public final void setEventListenerFactory$okhttp(@NotNull EventListener.Factory factory) {
            Intrinsics.checkNotNullParameter(factory, "<set-?>");
            this.eventListenerFactory = factory;
        }

        /* renamed from: getRetryOnConnectionFailure$okhttp, reason: from getter */
        public final boolean getRetryOnConnectionFailure() {
            return this.retryOnConnectionFailure;
        }

        public final void setRetryOnConnectionFailure$okhttp(boolean z) {
            this.retryOnConnectionFailure = z;
        }

        @NotNull
        /* renamed from: getAuthenticator$okhttp, reason: from getter */
        public final Authenticator getAuthenticator() {
            return this.authenticator;
        }

        public final void setAuthenticator$okhttp(@NotNull Authenticator authenticator) {
            Intrinsics.checkNotNullParameter(authenticator, "<set-?>");
            this.authenticator = authenticator;
        }

        /* renamed from: getFollowRedirects$okhttp, reason: from getter */
        public final boolean getFollowRedirects() {
            return this.followRedirects;
        }

        public final void setFollowRedirects$okhttp(boolean z) {
            this.followRedirects = z;
        }

        /* renamed from: getFollowSslRedirects$okhttp, reason: from getter */
        public final boolean getFollowSslRedirects() {
            return this.followSslRedirects;
        }

        public final void setFollowSslRedirects$okhttp(boolean z) {
            this.followSslRedirects = z;
        }

        @NotNull
        /* renamed from: getCookieJar$okhttp, reason: from getter */
        public final CookieJar getCookieJar() {
            return this.cookieJar;
        }

        public final void setCookieJar$okhttp(@NotNull CookieJar cookieJar) {
            Intrinsics.checkNotNullParameter(cookieJar, "<set-?>");
            this.cookieJar = cookieJar;
        }

        @Nullable
        /* renamed from: getCache$okhttp, reason: from getter */
        public final Cache getCache() {
            return this.cache;
        }

        public final void setCache$okhttp(@Nullable Cache cache) {
            this.cache = cache;
        }

        @NotNull
        /* renamed from: getDns$okhttp, reason: from getter */
        public final Dns getDns() {
            return this.dns;
        }

        public final void setDns$okhttp(@NotNull Dns dns) {
            Intrinsics.checkNotNullParameter(dns, "<set-?>");
            this.dns = dns;
        }

        @Nullable
        /* renamed from: getProxy$okhttp, reason: from getter */
        public final Proxy getProxy() {
            return this.proxy;
        }

        public final void setProxy$okhttp(@Nullable Proxy proxy) {
            this.proxy = proxy;
        }

        @Nullable
        /* renamed from: getProxySelector$okhttp, reason: from getter */
        public final ProxySelector getProxySelector() {
            return this.proxySelector;
        }

        public final void setProxySelector$okhttp(@Nullable ProxySelector proxySelector) {
            this.proxySelector = proxySelector;
        }

        @NotNull
        /* renamed from: getProxyAuthenticator$okhttp, reason: from getter */
        public final Authenticator getProxyAuthenticator() {
            return this.proxyAuthenticator;
        }

        public final void setProxyAuthenticator$okhttp(@NotNull Authenticator authenticator) {
            Intrinsics.checkNotNullParameter(authenticator, "<set-?>");
            this.proxyAuthenticator = authenticator;
        }

        @NotNull
        /* renamed from: getSocketFactory$okhttp, reason: from getter */
        public final SocketFactory getSocketFactory() {
            return this.socketFactory;
        }

        public final void setSocketFactory$okhttp(@NotNull SocketFactory socketFactory) {
            Intrinsics.checkNotNullParameter(socketFactory, "<set-?>");
            this.socketFactory = socketFactory;
        }

        @Nullable
        /* renamed from: getSslSocketFactoryOrNull$okhttp, reason: from getter */
        public final SSLSocketFactory getSslSocketFactoryOrNull() {
            return this.sslSocketFactoryOrNull;
        }

        public final void setSslSocketFactoryOrNull$okhttp(@Nullable SSLSocketFactory sSLSocketFactory) {
            this.sslSocketFactoryOrNull = sSLSocketFactory;
        }

        @Nullable
        /* renamed from: getX509TrustManagerOrNull$okhttp, reason: from getter */
        public final X509TrustManager getX509TrustManagerOrNull() {
            return this.x509TrustManagerOrNull;
        }

        public final void setX509TrustManagerOrNull$okhttp(@Nullable X509TrustManager x509TrustManager) {
            this.x509TrustManagerOrNull = x509TrustManager;
        }

        @NotNull
        public final List<ConnectionSpec> getConnectionSpecs$okhttp() {
            return this.connectionSpecs;
        }

        public final void setConnectionSpecs$okhttp(@NotNull List<ConnectionSpec> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.connectionSpecs = list;
        }

        @NotNull
        public final List<Protocol> getProtocols$okhttp() {
            return this.protocols;
        }

        public final void setProtocols$okhttp(@NotNull List<? extends Protocol> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.protocols = list;
        }

        @NotNull
        /* renamed from: getHostnameVerifier$okhttp, reason: from getter */
        public final HostnameVerifier getHostnameVerifier() {
            return this.hostnameVerifier;
        }

        public final void setHostnameVerifier$okhttp(@NotNull HostnameVerifier hostnameVerifier) {
            Intrinsics.checkNotNullParameter(hostnameVerifier, "<set-?>");
            this.hostnameVerifier = hostnameVerifier;
        }

        @NotNull
        /* renamed from: getCertificatePinner$okhttp, reason: from getter */
        public final CertificatePinner getCertificatePinner() {
            return this.certificatePinner;
        }

        public final void setCertificatePinner$okhttp(@NotNull CertificatePinner certificatePinner) {
            Intrinsics.checkNotNullParameter(certificatePinner, "<set-?>");
            this.certificatePinner = certificatePinner;
        }

        @Nullable
        /* renamed from: getCertificateChainCleaner$okhttp, reason: from getter */
        public final CertificateChainCleaner getCertificateChainCleaner() {
            return this.certificateChainCleaner;
        }

        public final void setCertificateChainCleaner$okhttp(@Nullable CertificateChainCleaner certificateChainCleaner) {
            this.certificateChainCleaner = certificateChainCleaner;
        }

        /* renamed from: getCallTimeout$okhttp, reason: from getter */
        public final int getCallTimeout() {
            return this.callTimeout;
        }

        public final void setCallTimeout$okhttp(int i) {
            this.callTimeout = i;
        }

        /* renamed from: getConnectTimeout$okhttp, reason: from getter */
        public final int getConnectTimeout() {
            return this.connectTimeout;
        }

        public final void setConnectTimeout$okhttp(int i) {
            this.connectTimeout = i;
        }

        /* renamed from: getReadTimeout$okhttp, reason: from getter */
        public final int getReadTimeout() {
            return this.readTimeout;
        }

        public final void setReadTimeout$okhttp(int i) {
            this.readTimeout = i;
        }

        /* renamed from: getWriteTimeout$okhttp, reason: from getter */
        public final int getWriteTimeout() {
            return this.writeTimeout;
        }

        public final void setWriteTimeout$okhttp(int i) {
            this.writeTimeout = i;
        }

        /* renamed from: getPingInterval$okhttp, reason: from getter */
        public final int getPingInterval() {
            return this.pingInterval;
        }

        public final void setPingInterval$okhttp(int i) {
            this.pingInterval = i;
        }

        /* renamed from: getMinWebSocketMessageToCompress$okhttp, reason: from getter */
        public final long getMinWebSocketMessageToCompress() {
            return this.minWebSocketMessageToCompress;
        }

        public final void setMinWebSocketMessageToCompress$okhttp(long j) {
            this.minWebSocketMessageToCompress = j;
        }

        @Nullable
        /* renamed from: getRouteDatabase$okhttp, reason: from getter */
        public final RouteDatabase getRouteDatabase() {
            return this.routeDatabase;
        }

        public final void setRouteDatabase$okhttp(@Nullable RouteDatabase routeDatabase) {
            this.routeDatabase = routeDatabase;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull OkHttpClient okHttpClient) {
            this();
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            this.dispatcher = okHttpClient.dispatcher();
            this.connectionPool = okHttpClient.connectionPool();
            CollectionsKt.addAll(this.interceptors, okHttpClient.interceptors());
            CollectionsKt.addAll(this.networkInterceptors, okHttpClient.networkInterceptors());
            this.eventListenerFactory = okHttpClient.eventListenerFactory();
            this.retryOnConnectionFailure = okHttpClient.retryOnConnectionFailure();
            this.authenticator = okHttpClient.authenticator();
            this.followRedirects = okHttpClient.followRedirects();
            this.followSslRedirects = okHttpClient.followSslRedirects();
            this.cookieJar = okHttpClient.cookieJar();
            this.cache = okHttpClient.cache();
            this.dns = okHttpClient.dns();
            this.proxy = okHttpClient.proxy();
            this.proxySelector = okHttpClient.proxySelector();
            this.proxyAuthenticator = okHttpClient.proxyAuthenticator();
            this.socketFactory = okHttpClient.socketFactory();
            this.sslSocketFactoryOrNull = okHttpClient.sslSocketFactoryOrNull;
            this.x509TrustManagerOrNull = okHttpClient.getX509TrustManager();
            this.connectionSpecs = okHttpClient.connectionSpecs();
            this.protocols = okHttpClient.protocols();
            this.hostnameVerifier = okHttpClient.hostnameVerifier();
            this.certificatePinner = okHttpClient.certificatePinner();
            this.certificateChainCleaner = okHttpClient.getCertificateChainCleaner();
            this.callTimeout = okHttpClient.callTimeoutMillis();
            this.connectTimeout = okHttpClient.connectTimeoutMillis();
            this.readTimeout = okHttpClient.readTimeoutMillis();
            this.writeTimeout = okHttpClient.writeTimeoutMillis();
            this.pingInterval = okHttpClient.pingIntervalMillis();
            this.minWebSocketMessageToCompress = okHttpClient.getMinWebSocketMessageToCompress();
            this.routeDatabase = okHttpClient.getRouteDatabase();
        }

        @NotNull
        public final Builder dispatcher(@NotNull Dispatcher dispatcher) {
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            this.dispatcher = dispatcher;
            return this;
        }

        @NotNull
        public final Builder connectionPool(@NotNull ConnectionPool connectionPool) {
            Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
            this.connectionPool = connectionPool;
            return this;
        }

        @NotNull
        public final List<Interceptor> interceptors() {
            return this.interceptors;
        }

        @NotNull
        public final Builder addInterceptor(@NotNull Interceptor interceptor) {
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            this.interceptors.add(interceptor);
            return this;
        }

        @NotNull
        /* renamed from: -addInterceptor, reason: not valid java name */
        public final Builder m3167addInterceptor(@NotNull final Function1 block) {
            Intrinsics.checkNotNullParameter(block, "block");
            return addInterceptor(new Interceptor() { // from class: com.applovin.shadow.okhttp3.OkHttpClient$Builder$addInterceptor$2
                @Override // com.applovin.shadow.okhttp3.Interceptor
                @NotNull
                public final Response intercept(@NotNull Interceptor.Chain chain) {
                    Intrinsics.checkNotNullParameter(chain, "chain");
                    return (Response) Function1.this.invoke(chain);
                }
            });
        }

        @NotNull
        public final List<Interceptor> networkInterceptors() {
            return this.networkInterceptors;
        }

        @NotNull
        public final Builder addNetworkInterceptor(@NotNull Interceptor interceptor) {
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            this.networkInterceptors.add(interceptor);
            return this;
        }

        @NotNull
        /* renamed from: -addNetworkInterceptor, reason: not valid java name */
        public final Builder m3168addNetworkInterceptor(@NotNull final Function1 block) {
            Intrinsics.checkNotNullParameter(block, "block");
            return addNetworkInterceptor(new Interceptor() { // from class: com.applovin.shadow.okhttp3.OkHttpClient$Builder$addNetworkInterceptor$2
                @Override // com.applovin.shadow.okhttp3.Interceptor
                @NotNull
                public final Response intercept(@NotNull Interceptor.Chain chain) {
                    Intrinsics.checkNotNullParameter(chain, "chain");
                    return (Response) Function1.this.invoke(chain);
                }
            });
        }

        @NotNull
        public final Builder eventListener(@NotNull EventListener eventListener) {
            Intrinsics.checkNotNullParameter(eventListener, "eventListener");
            this.eventListenerFactory = Util.asFactory(eventListener);
            return this;
        }

        @NotNull
        public final Builder eventListenerFactory(@NotNull EventListener.Factory eventListenerFactory) {
            Intrinsics.checkNotNullParameter(eventListenerFactory, "eventListenerFactory");
            this.eventListenerFactory = eventListenerFactory;
            return this;
        }

        @NotNull
        public final Builder retryOnConnectionFailure(boolean retryOnConnectionFailure) {
            this.retryOnConnectionFailure = retryOnConnectionFailure;
            return this;
        }

        @NotNull
        public final Builder authenticator(@NotNull Authenticator authenticator) {
            Intrinsics.checkNotNullParameter(authenticator, "authenticator");
            this.authenticator = authenticator;
            return this;
        }

        @NotNull
        public final Builder followRedirects(boolean followRedirects) {
            this.followRedirects = followRedirects;
            return this;
        }

        @NotNull
        public final Builder followSslRedirects(boolean followProtocolRedirects) {
            this.followSslRedirects = followProtocolRedirects;
            return this;
        }

        @NotNull
        public final Builder cookieJar(@NotNull CookieJar cookieJar) {
            Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
            this.cookieJar = cookieJar;
            return this;
        }

        @NotNull
        public final Builder cache(@Nullable Cache cache) {
            this.cache = cache;
            return this;
        }

        @NotNull
        public final Builder dns(@NotNull Dns dns) {
            Intrinsics.checkNotNullParameter(dns, "dns");
            if (!Intrinsics.areEqual(dns, this.dns)) {
                this.routeDatabase = null;
            }
            this.dns = dns;
            return this;
        }

        @NotNull
        public final Builder proxy(@Nullable Proxy proxy) {
            if (!Intrinsics.areEqual(proxy, this.proxy)) {
                this.routeDatabase = null;
            }
            this.proxy = proxy;
            return this;
        }

        @NotNull
        public final Builder proxySelector(@NotNull ProxySelector proxySelector) {
            Intrinsics.checkNotNullParameter(proxySelector, "proxySelector");
            if (!Intrinsics.areEqual(proxySelector, this.proxySelector)) {
                this.routeDatabase = null;
            }
            this.proxySelector = proxySelector;
            return this;
        }

        @NotNull
        public final Builder proxyAuthenticator(@NotNull Authenticator proxyAuthenticator) {
            Intrinsics.checkNotNullParameter(proxyAuthenticator, "proxyAuthenticator");
            if (!Intrinsics.areEqual(proxyAuthenticator, this.proxyAuthenticator)) {
                this.routeDatabase = null;
            }
            this.proxyAuthenticator = proxyAuthenticator;
            return this;
        }

        @NotNull
        public final Builder socketFactory(@NotNull SocketFactory socketFactory) {
            Intrinsics.checkNotNullParameter(socketFactory, "socketFactory");
            if (socketFactory instanceof SSLSocketFactory) {
                throw new IllegalArgumentException("socketFactory instanceof SSLSocketFactory");
            }
            if (!Intrinsics.areEqual(socketFactory, this.socketFactory)) {
                this.routeDatabase = null;
            }
            this.socketFactory = socketFactory;
            return this;
        }

        @Deprecated
        @NotNull
        public final Builder sslSocketFactory(@NotNull SSLSocketFactory sslSocketFactory) {
            Intrinsics.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
            if (!Intrinsics.areEqual(sslSocketFactory, this.sslSocketFactoryOrNull)) {
                this.routeDatabase = null;
            }
            this.sslSocketFactoryOrNull = sslSocketFactory;
            Platform.Companion companion = Platform.INSTANCE;
            X509TrustManager trustManager = companion.get().trustManager(sslSocketFactory);
            if (trustManager == null) {
                throw new IllegalStateException("Unable to extract the trust manager on " + companion.get() + ", sslSocketFactory is " + sslSocketFactory.getClass());
            }
            this.x509TrustManagerOrNull = trustManager;
            Platform platform = companion.get();
            X509TrustManager x509TrustManager = this.x509TrustManagerOrNull;
            Intrinsics.checkNotNull(x509TrustManager);
            this.certificateChainCleaner = platform.buildCertificateChainCleaner(x509TrustManager);
            return this;
        }

        @NotNull
        public final Builder sslSocketFactory(@NotNull SSLSocketFactory sslSocketFactory, @NotNull X509TrustManager trustManager) {
            Intrinsics.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            if (!Intrinsics.areEqual(sslSocketFactory, this.sslSocketFactoryOrNull) || !Intrinsics.areEqual(trustManager, this.x509TrustManagerOrNull)) {
                this.routeDatabase = null;
            }
            this.sslSocketFactoryOrNull = sslSocketFactory;
            this.certificateChainCleaner = CertificateChainCleaner.INSTANCE.get(trustManager);
            this.x509TrustManagerOrNull = trustManager;
            return this;
        }

        @NotNull
        public final Builder connectionSpecs(@NotNull List<ConnectionSpec> connectionSpecs) {
            Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
            if (!Intrinsics.areEqual(connectionSpecs, this.connectionSpecs)) {
                this.routeDatabase = null;
            }
            this.connectionSpecs = Util.toImmutableList(connectionSpecs);
            return this;
        }

        @NotNull
        public final Builder protocols(@NotNull List<? extends Protocol> protocols) {
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            List mutableList = CollectionsKt.toMutableList((Collection) protocols);
            Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            if (!mutableList.contains(protocol) && !mutableList.contains(Protocol.HTTP_1_1)) {
                throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + mutableList).toString());
            }
            if (mutableList.contains(protocol) && mutableList.size() > 1) {
                throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + mutableList).toString());
            }
            if (mutableList.contains(Protocol.HTTP_1_0)) {
                throw new IllegalArgumentException(("protocols must not contain http/1.0: " + mutableList).toString());
            }
            Intrinsics.checkNotNull(mutableList, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Protocol?>");
            if (mutableList.contains(null)) {
                throw new IllegalArgumentException("protocols must not contain null");
            }
            mutableList.remove(Protocol.SPDY_3);
            if (!Intrinsics.areEqual(mutableList, this.protocols)) {
                this.routeDatabase = null;
            }
            List<? extends Protocol> unmodifiableList = Collections.unmodifiableList(mutableList);
            Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(protocolsCopy)");
            this.protocols = unmodifiableList;
            return this;
        }

        @NotNull
        public final Builder hostnameVerifier(@NotNull HostnameVerifier hostnameVerifier) {
            Intrinsics.checkNotNullParameter(hostnameVerifier, "hostnameVerifier");
            if (!Intrinsics.areEqual(hostnameVerifier, this.hostnameVerifier)) {
                this.routeDatabase = null;
            }
            this.hostnameVerifier = hostnameVerifier;
            return this;
        }

        @NotNull
        public final Builder certificatePinner(@NotNull CertificatePinner certificatePinner) {
            Intrinsics.checkNotNullParameter(certificatePinner, "certificatePinner");
            if (!Intrinsics.areEqual(certificatePinner, this.certificatePinner)) {
                this.routeDatabase = null;
            }
            this.certificatePinner = certificatePinner;
            return this;
        }

        @NotNull
        public final Builder callTimeout(long timeout, @NotNull TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.callTimeout = Util.checkDuration("timeout", timeout, unit);
            return this;
        }

        @IgnoreJRERequirement
        @NotNull
        public final Builder callTimeout(@NotNull Duration duration) {
            long millis;
            Intrinsics.checkNotNullParameter(duration, "duration");
            millis = duration.toMillis();
            callTimeout(millis, TimeUnit.MILLISECONDS);
            return this;
        }

        @NotNull
        public final Builder connectTimeout(long timeout, @NotNull TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.connectTimeout = Util.checkDuration("timeout", timeout, unit);
            return this;
        }

        @IgnoreJRERequirement
        @NotNull
        public final Builder connectTimeout(@NotNull Duration duration) {
            long millis;
            Intrinsics.checkNotNullParameter(duration, "duration");
            millis = duration.toMillis();
            connectTimeout(millis, TimeUnit.MILLISECONDS);
            return this;
        }

        @NotNull
        public final Builder readTimeout(long timeout, @NotNull TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.readTimeout = Util.checkDuration("timeout", timeout, unit);
            return this;
        }

        @IgnoreJRERequirement
        @NotNull
        public final Builder readTimeout(@NotNull Duration duration) {
            long millis;
            Intrinsics.checkNotNullParameter(duration, "duration");
            millis = duration.toMillis();
            readTimeout(millis, TimeUnit.MILLISECONDS);
            return this;
        }

        @NotNull
        public final Builder writeTimeout(long timeout, @NotNull TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.writeTimeout = Util.checkDuration("timeout", timeout, unit);
            return this;
        }

        @IgnoreJRERequirement
        @NotNull
        public final Builder writeTimeout(@NotNull Duration duration) {
            long millis;
            Intrinsics.checkNotNullParameter(duration, "duration");
            millis = duration.toMillis();
            writeTimeout(millis, TimeUnit.MILLISECONDS);
            return this;
        }

        @NotNull
        public final Builder pingInterval(long interval, @NotNull TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.pingInterval = Util.checkDuration("interval", interval, unit);
            return this;
        }

        @IgnoreJRERequirement
        @NotNull
        public final Builder pingInterval(@NotNull Duration duration) {
            long millis;
            Intrinsics.checkNotNullParameter(duration, "duration");
            millis = duration.toMillis();
            pingInterval(millis, TimeUnit.MILLISECONDS);
            return this;
        }

        @NotNull
        public final Builder minWebSocketMessageToCompress(long bytes) {
            if (bytes < 0) {
                throw new IllegalArgumentException(("minWebSocketMessageToCompress must be positive: " + bytes).toString());
            }
            this.minWebSocketMessageToCompress = bytes;
            return this;
        }

        @NotNull
        public final OkHttpClient build() {
            return new OkHttpClient(this);
        }
    }

    /* compiled from: OkHttpClient.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/applovin/shadow/okhttp3/OkHttpClient$Companion;", "", "()V", "DEFAULT_CONNECTION_SPECS", "", "Lcom/applovin/shadow/okhttp3/ConnectionSpec;", "getDEFAULT_CONNECTION_SPECS$okhttp", "()Ljava/util/List;", "DEFAULT_PROTOCOLS", "Lcom/applovin/shadow/okhttp3/Protocol;", "getDEFAULT_PROTOCOLS$okhttp", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final List<Protocol> getDEFAULT_PROTOCOLS$okhttp() {
            return OkHttpClient.DEFAULT_PROTOCOLS;
        }

        @NotNull
        public final List<ConnectionSpec> getDEFAULT_CONNECTION_SPECS$okhttp() {
            return OkHttpClient.DEFAULT_CONNECTION_SPECS;
        }
    }
}
