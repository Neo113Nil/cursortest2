package com.yanzhenjie.kalle;

import java.net.Proxy;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes4.dex */
public abstract class o {
    private final int mConnectTimeout;
    private final i mHeaders;
    private final HostnameVerifier mHostnameVerifier;
    private final RequestMethod mMethod;
    private final Proxy mProxy;
    private final int mReadTimeout;
    private final SSLSocketFactory mSSLSocketFactory;
    private final Object mTag;

    public static abstract class a {
        private int mConnectTimeout;
        private final i mHeaders;
        private HostnameVerifier mHostnameVerifier;
        private final RequestMethod mMethod;
        private Proxy mProxy;
        private int mReadTimeout;
        private SSLSocketFactory mSSLSocketFactory;
        private Object mTag;

        protected a(RequestMethod requestMethod) {
            i iVar = new i();
            this.mHeaders = iVar;
            this.mProxy = k.getConfig().getProxy();
            this.mSSLSocketFactory = k.getConfig().getSSLSocketFactory();
            this.mHostnameVerifier = k.getConfig().getHostnameVerifier();
            this.mConnectTimeout = k.getConfig().getConnectTimeout();
            this.mReadTimeout = k.getConfig().getReadTimeout();
            this.mMethod = requestMethod;
            iVar.add(k.getConfig().getHeaders());
        }

        public a addHeader(String str, String str2) {
            this.mHeaders.add(str, str2);
            return this;
        }

        public a clearHeaders() {
            this.mHeaders.clear();
            return this;
        }

        public abstract a clearParams();

        public a connectTimeout(int i8, TimeUnit timeUnit) {
            this.mConnectTimeout = (int) Math.min(timeUnit.toMillis(i8), 2147483647L);
            return this;
        }

        public a hostnameVerifier(HostnameVerifier hostnameVerifier) {
            this.mHostnameVerifier = hostnameVerifier;
            return this;
        }

        public abstract a param(String str, char c8);

        public abstract a param(String str, double d8);

        public abstract a param(String str, float f8);

        public abstract a param(String str, int i8);

        public abstract a param(String str, long j8);

        public abstract a param(String str, String str2);

        public abstract a param(String str, List<String> list);

        public abstract a param(String str, short s7);

        public abstract a param(String str, boolean z7);

        public abstract a path(char c8);

        public abstract a path(double d8);

        public abstract a path(float f8);

        public abstract a path(int i8);

        public abstract a path(long j8);

        public abstract a path(String str);

        public abstract a path(boolean z7);

        public a proxy(Proxy proxy) {
            this.mProxy = proxy;
            return this;
        }

        public a readTimeout(int i8, TimeUnit timeUnit) {
            this.mReadTimeout = (int) Math.min(timeUnit.toMillis(i8), 2147483647L);
            return this;
        }

        public a removeHeader(String str) {
            this.mHeaders.remove(str);
            return this;
        }

        public abstract a removeParam(String str);

        public a setHeader(String str, String str2) {
            this.mHeaders.set(str, str2);
            return this;
        }

        public a setHeaders(i iVar) {
            this.mHeaders.set(iVar);
            return this;
        }

        public a sslSocketFactory(SSLSocketFactory sSLSocketFactory) {
            this.mSSLSocketFactory = sSLSocketFactory;
            return this;
        }

        public a tag(Object obj) {
            this.mTag = obj;
            return this;
        }
    }

    protected <T extends a> o(a aVar) {
        this.mMethod = aVar.mMethod;
        this.mHeaders = aVar.mHeaders;
        this.mProxy = aVar.mProxy;
        this.mSSLSocketFactory = aVar.mSSLSocketFactory;
        this.mHostnameVerifier = aVar.mHostnameVerifier;
        this.mConnectTimeout = aVar.mConnectTimeout;
        this.mReadTimeout = aVar.mReadTimeout;
        this.mTag = aVar.mTag;
    }

    public abstract p body();

    public int connectTimeout() {
        return this.mConnectTimeout;
    }

    public abstract m copyParams();

    public i headers() {
        return this.mHeaders;
    }

    public HostnameVerifier hostnameVerifier() {
        return this.mHostnameVerifier;
    }

    public RequestMethod method() {
        return this.mMethod;
    }

    public Proxy proxy() {
        return this.mProxy;
    }

    public int readTimeout() {
        return this.mReadTimeout;
    }

    public SSLSocketFactory sslSocketFactory() {
        return this.mSSLSocketFactory;
    }

    public Object tag() {
        return this.mTag;
    }

    public abstract t url();
}
