package io.appmetrica.analytics.network.internal;

import io.appmetrica.analytics.network.impl.c;
import io.appmetrica.analytics.network.impl.d;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public class NetworkClient {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f8845a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f8846b;

    /* renamed from: c, reason: collision with root package name */
    private final SSLSocketFactory f8847c;

    /* renamed from: d, reason: collision with root package name */
    private final Boolean f8848d;

    /* renamed from: e, reason: collision with root package name */
    private final Boolean f8849e;
    private final int f;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private Integer f8850a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f8851b;

        /* renamed from: c, reason: collision with root package name */
        private SSLSocketFactory f8852c;

        /* renamed from: d, reason: collision with root package name */
        private Boolean f8853d;

        /* renamed from: e, reason: collision with root package name */
        private Boolean f8854e;
        private Integer f;

        public NetworkClient build() {
            return new NetworkClient(this.f8850a, this.f8851b, this.f8852c, this.f8853d, this.f8854e, this.f, 0);
        }

        public Builder withConnectTimeout(int i3) {
            this.f8850a = Integer.valueOf(i3);
            return this;
        }

        public Builder withInstanceFollowRedirects(boolean z) {
            this.f8854e = Boolean.valueOf(z);
            return this;
        }

        public Builder withMaxResponseSize(int i3) {
            this.f = Integer.valueOf(i3);
            return this;
        }

        public Builder withReadTimeout(int i3) {
            this.f8851b = Integer.valueOf(i3);
            return this;
        }

        public Builder withSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
            this.f8852c = sSLSocketFactory;
            return this;
        }

        public Builder withUseCaches(boolean z) {
            this.f8853d = Boolean.valueOf(z);
            return this;
        }
    }

    public /* synthetic */ NetworkClient(Integer num, Integer num2, SSLSocketFactory sSLSocketFactory, Boolean bool, Boolean bool2, Integer num3, int i3) {
        this(num, num2, sSLSocketFactory, bool, bool2, num3);
    }

    public Integer getConnectTimeout() {
        return this.f8845a;
    }

    public Boolean getInstanceFollowRedirects() {
        return this.f8849e;
    }

    public int getMaxResponseSize() {
        return this.f;
    }

    public Integer getReadTimeout() {
        return this.f8846b;
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.f8847c;
    }

    public Boolean getUseCaches() {
        return this.f8848d;
    }

    public Call newCall(Request request) {
        return new c(this, request, new d());
    }

    public String toString() {
        return "NetworkClient{connectTimeout=" + this.f8845a + ", readTimeout=" + this.f8846b + ", sslSocketFactory=" + this.f8847c + ", useCaches=" + this.f8848d + ", instanceFollowRedirects=" + this.f8849e + ", maxResponseSize=" + this.f + '}';
    }

    private NetworkClient(Integer num, Integer num2, SSLSocketFactory sSLSocketFactory, Boolean bool, Boolean bool2, Integer num3) {
        this.f8845a = num;
        this.f8846b = num2;
        this.f8847c = sSLSocketFactory;
        this.f8848d = bool;
        this.f8849e = bool2;
        this.f = num3 == null ? Integer.MAX_VALUE : num3.intValue();
    }
}
