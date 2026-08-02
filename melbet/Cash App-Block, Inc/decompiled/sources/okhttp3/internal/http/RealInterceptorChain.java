package okhttp3.internal.http;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.net.ProxySelector;
import java.util.ArrayList;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.UnsignedKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Cache;
import okhttp3.CertificatePinner;
import okhttp3.ConnectionPool;
import okhttp3.CookieJar;
import okhttp3.Dns;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.ExchangeFinder;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealRoutePlanner;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class RealInterceptorChain implements Interceptor.Chain {
    public final HttpUrl.Companion authenticator;
    public final Cache cache;
    public final RealCall call;
    public int calls;
    public final UnsignedKt certificateChainCleaner;
    public final CertificatePinner certificatePinner;
    public final int connectTimeoutMillis;
    public final ConnectionPool connectionPool;
    public final CookieJar cookieJar;
    public final Dns dns;
    public final Exchange exchange;
    public final HostnameVerifier hostnameVerifier;
    public final int index;
    public final ArrayList interceptors;
    public final HttpUrl.Companion proxyAuthenticator;
    public final ProxySelector proxySelector;
    public final int readTimeoutMillis;
    public final Request request;
    public final boolean retryOnConnectionFailure;
    public final SocketFactory socketFactory;
    public final SSLSocketFactory sslSocketFactoryOrNull;
    public final int writeTimeoutMillis;
    public final X509TrustManager x509TrustManagerOrNull;

    public RealInterceptorChain(RealCall realCall, ArrayList arrayList, int i, Exchange exchange, Request request, int i2, int i3, int i4, HttpUrl.Companion companion, Cache cache, CertificatePinner certificatePinner, ConnectionPool connectionPool, CookieJar cookieJar, Dns dns, HostnameVerifier hostnameVerifier, HttpUrl.Companion companion2, ProxySelector proxySelector, boolean z, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager, UnsignedKt unsignedKt) {
        request.getClass();
        companion.getClass();
        certificatePinner.getClass();
        connectionPool.getClass();
        cookieJar.getClass();
        dns.getClass();
        hostnameVerifier.getClass();
        companion2.getClass();
        proxySelector.getClass();
        socketFactory.getClass();
        this.call = realCall;
        this.interceptors = arrayList;
        this.index = i;
        this.exchange = exchange;
        this.request = request;
        this.connectTimeoutMillis = i2;
        this.readTimeoutMillis = i3;
        this.writeTimeoutMillis = i4;
        this.authenticator = companion;
        this.cache = cache;
        this.certificatePinner = certificatePinner;
        this.connectionPool = connectionPool;
        this.cookieJar = cookieJar;
        this.dns = dns;
        this.hostnameVerifier = hostnameVerifier;
        this.proxyAuthenticator = companion2;
        this.proxySelector = proxySelector;
        this.retryOnConnectionFailure = z;
        this.socketFactory = socketFactory;
        this.sslSocketFactoryOrNull = sSLSocketFactory;
        this.x509TrustManagerOrNull = x509TrustManager;
        this.certificateChainCleaner = unsignedKt;
    }

    public static RealInterceptorChain copy$okhttp$default(RealInterceptorChain realInterceptorChain, int i, Exchange exchange, Request request, int i2, int i3) {
        int i4 = (i3 & 1) != 0 ? realInterceptorChain.index : i;
        Exchange exchange2 = (i3 & 2) != 0 ? realInterceptorChain.exchange : exchange;
        Request request2 = (i3 & 4) != 0 ? realInterceptorChain.request : request;
        int i5 = realInterceptorChain.connectTimeoutMillis;
        int i6 = (i3 & 16) != 0 ? realInterceptorChain.readTimeoutMillis : i2;
        int i7 = realInterceptorChain.writeTimeoutMillis;
        HttpUrl.Companion companion = realInterceptorChain.authenticator;
        Cache cache = realInterceptorChain.cache;
        CertificatePinner certificatePinner = realInterceptorChain.certificatePinner;
        ConnectionPool connectionPool = realInterceptorChain.connectionPool;
        CookieJar cookieJar = realInterceptorChain.cookieJar;
        Dns dns = realInterceptorChain.dns;
        HostnameVerifier hostnameVerifier = realInterceptorChain.hostnameVerifier;
        HttpUrl.Companion companion2 = realInterceptorChain.proxyAuthenticator;
        ProxySelector proxySelector = realInterceptorChain.proxySelector;
        boolean z = realInterceptorChain.retryOnConnectionFailure;
        SocketFactory socketFactory = realInterceptorChain.socketFactory;
        SSLSocketFactory sSLSocketFactory = realInterceptorChain.sslSocketFactoryOrNull;
        X509TrustManager x509TrustManager = realInterceptorChain.x509TrustManagerOrNull;
        UnsignedKt unsignedKt = realInterceptorChain.certificateChainCleaner;
        request2.getClass();
        companion.getClass();
        certificatePinner.getClass();
        connectionPool.getClass();
        cookieJar.getClass();
        dns.getClass();
        hostnameVerifier.getClass();
        companion2.getClass();
        proxySelector.getClass();
        socketFactory.getClass();
        return new RealInterceptorChain(realInterceptorChain.call, realInterceptorChain.interceptors, i4, exchange2, request2, i5, i6, i7, companion, cache, certificatePinner, connectionPool, cookieJar, dns, hostnameVerifier, companion2, proxySelector, z, socketFactory, sSLSocketFactory, x509TrustManager, unsignedKt);
    }

    @Override // okhttp3.Interceptor.Chain
    public final Response proceed(Request request) {
        request.getClass();
        ArrayList arrayList = this.interceptors;
        int size = arrayList.size();
        int i = this.index;
        if (i >= size) {
            a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
            return null;
        }
        this.calls++;
        Exchange exchange = this.exchange;
        if (exchange != null) {
            RealRoutePlanner routePlanner = ((ExchangeFinder) exchange.finder).getRoutePlanner();
            HttpUrl httpUrl = request.url;
            routePlanner.getClass();
            httpUrl.getClass();
            HttpUrl httpUrl2 = routePlanner.address.url;
            if (httpUrl.port != httpUrl2.port || !Intrinsics.areEqual(httpUrl.host, httpUrl2.host)) {
                Handlers$$ExternalSyntheticBUOutline0.m("network interceptor ", arrayList.get(i - 1), " must retain the same host and port");
                return null;
            }
            if (this.calls != 1) {
                Handlers$$ExternalSyntheticBUOutline0.m("network interceptor ", arrayList.get(i - 1), " must call proceed() exactly once");
                return null;
            }
        }
        int i2 = i + 1;
        RealInterceptorChain copy$okhttp$default = copy$okhttp$default(this, i2, null, request, 0, 2097146);
        Interceptor interceptor = (Interceptor) arrayList.get(i);
        Response intercept = interceptor.intercept(copy$okhttp$default);
        if (intercept == null) {
            throw new NullPointerException("interceptor " + interceptor + " returned null");
        }
        if (exchange == null || i2 >= arrayList.size() || copy$okhttp$default.calls == 1) {
            return intercept;
        }
        Handlers$$ExternalSyntheticBUOutline0.m("network interceptor ", interceptor, " must call proceed() exactly once");
        return null;
    }

    @Override // okhttp3.Interceptor.Chain
    public final Request request() {
        return this.request;
    }
}
