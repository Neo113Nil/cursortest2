package com.yanzhenjie.kalle;

import com.yanzhenjie.kalle.m;
import java.net.Proxy;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes4.dex */
public final class l {
    private final com.yanzhenjie.kalle.simple.cache.a mCacheStore;
    private final Charset mCharset;
    private final com.yanzhenjie.kalle.connect.a mConnectFactory;
    private final int mConnectTimeout;
    private final com.yanzhenjie.kalle.simple.e mConverter;
    private final com.yanzhenjie.kalle.cookie.b mCookieStore;
    private final i mHeaders;
    private final HostnameVerifier mHostnameVerifier;
    private final List<com.yanzhenjie.kalle.connect.c> mInterceptors;
    private final Executor mMainExecutor;
    private final com.yanzhenjie.kalle.connect.d mNetwork;
    private final m mParams;
    private final Proxy mProxy;
    private final int mReadTimeout;
    private final SSLSocketFactory mSSLSocketFactory;
    private final Executor mWorkExecutor;

    public static final class b {
        private com.yanzhenjie.kalle.simple.cache.a mCacheStore;
        private Charset mCharset;
        private com.yanzhenjie.kalle.connect.a mConnectFactory;
        private int mConnectTimeout;
        private com.yanzhenjie.kalle.simple.e mConverter;
        private com.yanzhenjie.kalle.cookie.b mCookieStore;
        private i mHeaders;
        private HostnameVerifier mHostnameVerifier;
        private List<com.yanzhenjie.kalle.connect.c> mInterceptors;
        private Executor mMainExecutor;
        private com.yanzhenjie.kalle.connect.d mNetwork;
        private m.b mParams;
        private Proxy mProxy;
        private int mReadTimeout;
        private SSLSocketFactory mSSLSocketFactory;
        private Executor mWorkExecutor;

        public b addHeader(String str, String str2) {
            this.mHeaders.add(str, str2);
            return this;
        }

        public b addInterceptor(com.yanzhenjie.kalle.connect.c cVar) {
            this.mInterceptors.add(cVar);
            return this;
        }

        public b addInterceptors(List<com.yanzhenjie.kalle.connect.c> list) {
            this.mInterceptors.addAll(list);
            return this;
        }

        public b addParam(String str, String str2) {
            this.mParams.add(str, (CharSequence) str2);
            return this;
        }

        public l build() {
            return new l(this);
        }

        public b cacheStore(com.yanzhenjie.kalle.simple.cache.a aVar) {
            this.mCacheStore = aVar;
            return this;
        }

        public b charset(Charset charset) {
            this.mCharset = charset;
            return this;
        }

        public b connectFactory(com.yanzhenjie.kalle.connect.a aVar) {
            this.mConnectFactory = aVar;
            return this;
        }

        public b connectionTimeout(int i8, TimeUnit timeUnit) {
            this.mConnectTimeout = (int) Math.min(timeUnit.toMillis(i8), 2147483647L);
            return this;
        }

        public b converter(com.yanzhenjie.kalle.simple.e eVar) {
            this.mConverter = eVar;
            return this;
        }

        public b cookieStore(com.yanzhenjie.kalle.cookie.b bVar) {
            this.mCookieStore = bVar;
            return this;
        }

        public b hostnameVerifier(HostnameVerifier hostnameVerifier) {
            this.mHostnameVerifier = hostnameVerifier;
            return this;
        }

        public b mainThreadExecutor(Executor executor) {
            this.mMainExecutor = executor;
            return this;
        }

        public b network(com.yanzhenjie.kalle.connect.d dVar) {
            this.mNetwork = dVar;
            return this;
        }

        public b proxy(Proxy proxy) {
            this.mProxy = proxy;
            return this;
        }

        public b readTimeout(int i8, TimeUnit timeUnit) {
            this.mReadTimeout = (int) Math.min(timeUnit.toMillis(i8), 2147483647L);
            return this;
        }

        public b setHeader(String str, String str2) {
            this.mHeaders.set(str, str2);
            return this;
        }

        public b sslSocketFactory(SSLSocketFactory sSLSocketFactory) {
            this.mSSLSocketFactory = sSLSocketFactory;
            return this;
        }

        public b workThreadExecutor(Executor executor) {
            this.mWorkExecutor = executor;
            return this;
        }

        private b() {
            this.mHeaders = new i();
            this.mParams = m.newBuilder();
            this.mInterceptors = new ArrayList();
            this.mHeaders.set("Accept", i.VALUE_ACCEPT_ALL);
            this.mHeaders.set("Accept-Encoding", i.VALUE_ACCEPT_ENCODING);
            this.mHeaders.set("Content-Type", i.VALUE_APPLICATION_URLENCODED);
            this.mHeaders.set("Connection", i.VALUE_KEEP_ALIVE);
            this.mHeaders.set("User-Agent", i.VALUE_USER_AGENT);
            this.mHeaders.set("Accept-Language", i.VALUE_ACCEPT_LANGUAGE);
        }
    }

    public static b newBuilder() {
        return new b();
    }

    public com.yanzhenjie.kalle.simple.cache.a getCacheStore() {
        return this.mCacheStore;
    }

    public Charset getCharset() {
        return this.mCharset;
    }

    public com.yanzhenjie.kalle.connect.a getConnectFactory() {
        return this.mConnectFactory;
    }

    public int getConnectTimeout() {
        return this.mConnectTimeout;
    }

    public com.yanzhenjie.kalle.simple.e getConverter() {
        return this.mConverter;
    }

    public com.yanzhenjie.kalle.cookie.b getCookieStore() {
        return this.mCookieStore;
    }

    public i getHeaders() {
        return this.mHeaders;
    }

    public HostnameVerifier getHostnameVerifier() {
        return this.mHostnameVerifier;
    }

    public List<com.yanzhenjie.kalle.connect.c> getInterceptor() {
        return this.mInterceptors;
    }

    public Executor getMainExecutor() {
        return this.mMainExecutor;
    }

    public com.yanzhenjie.kalle.connect.d getNetwork() {
        return this.mNetwork;
    }

    public m getParams() {
        return this.mParams;
    }

    public Proxy getProxy() {
        return this.mProxy;
    }

    public int getReadTimeout() {
        return this.mReadTimeout;
    }

    public SSLSocketFactory getSSLSocketFactory() {
        return this.mSSLSocketFactory;
    }

    public Executor getWorkExecutor() {
        return this.mWorkExecutor;
    }

    private l(b bVar) {
        this.mWorkExecutor = bVar.mWorkExecutor == null ? new com.yanzhenjie.kalle.util.f() : bVar.mWorkExecutor;
        this.mMainExecutor = bVar.mMainExecutor == null ? new com.yanzhenjie.kalle.util.d() : bVar.mMainExecutor;
        this.mCharset = bVar.mCharset == null ? Charset.defaultCharset() : bVar.mCharset;
        this.mHeaders = bVar.mHeaders;
        this.mProxy = bVar.mProxy;
        this.mSSLSocketFactory = bVar.mSSLSocketFactory == null ? com.yanzhenjie.kalle.ssl.a.SSL_SOCKET_FACTORY : bVar.mSSLSocketFactory;
        this.mHostnameVerifier = bVar.mHostnameVerifier == null ? com.yanzhenjie.kalle.ssl.a.HOSTNAME_VERIFIER : bVar.mHostnameVerifier;
        this.mConnectTimeout = bVar.mConnectTimeout <= 0 ? 10000 : bVar.mConnectTimeout;
        this.mReadTimeout = bVar.mReadTimeout > 0 ? bVar.mReadTimeout : 10000;
        this.mParams = bVar.mParams.build();
        this.mCacheStore = bVar.mCacheStore == null ? com.yanzhenjie.kalle.simple.cache.a.DEFAULT : bVar.mCacheStore;
        this.mNetwork = bVar.mNetwork == null ? com.yanzhenjie.kalle.connect.d.DEFAULT : bVar.mNetwork;
        this.mConnectFactory = bVar.mConnectFactory == null ? com.yanzhenjie.kalle.urlconnect.b.newBuilder().build() : bVar.mConnectFactory;
        this.mCookieStore = bVar.mCookieStore == null ? com.yanzhenjie.kalle.cookie.b.DEFAULT : bVar.mCookieStore;
        this.mInterceptors = Collections.unmodifiableList(bVar.mInterceptors);
        this.mConverter = bVar.mConverter == null ? com.yanzhenjie.kalle.simple.e.DEFAULT : bVar.mConverter;
    }
}
