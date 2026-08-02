package io.appmetrica.analytics.networkapi;

import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.e;

/* loaded from: classes.dex */
public final class NetworkClientSettings {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f13245a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f13246b;

    /* renamed from: c, reason: collision with root package name */
    private final SSLSocketFactory f13247c;

    /* renamed from: d, reason: collision with root package name */
    private final Boolean f13248d;

    /* renamed from: e, reason: collision with root package name */
    private final Boolean f13249e;

    /* renamed from: f, reason: collision with root package name */
    private final int f13250f;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private Integer f13251a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f13252b;

        /* renamed from: c, reason: collision with root package name */
        private SSLSocketFactory f13253c;

        /* renamed from: d, reason: collision with root package name */
        private Boolean f13254d;

        /* renamed from: e, reason: collision with root package name */
        private Boolean f13255e;

        /* renamed from: f, reason: collision with root package name */
        private int f13256f = Integer.MAX_VALUE;

        public final NetworkClientSettings build() {
            return new NetworkClientSettings(this.f13251a, this.f13252b, this.f13253c, this.f13254d, this.f13255e, this.f13256f, null);
        }

        public final Builder withConnectTimeout(int i4) {
            this.f13251a = Integer.valueOf(i4);
            return this;
        }

        public final Builder withInstanceFollowRedirects(boolean z) {
            this.f13255e = Boolean.valueOf(z);
            return this;
        }

        public final Builder withMaxResponseSize(int i4) {
            this.f13256f = i4;
            return this;
        }

        public final Builder withReadTimeout(int i4) {
            this.f13252b = Integer.valueOf(i4);
            return this;
        }

        public final Builder withSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
            this.f13253c = sSLSocketFactory;
            return this;
        }

        public final Builder withUseCaches(boolean z) {
            this.f13254d = Boolean.valueOf(z);
            return this;
        }
    }

    public /* synthetic */ NetworkClientSettings(Integer num, Integer num2, SSLSocketFactory sSLSocketFactory, Boolean bool, Boolean bool2, int i4, e eVar) {
        this(num, num2, sSLSocketFactory, bool, bool2, i4);
    }

    public final Integer getConnectTimeout() {
        return this.f13245a;
    }

    public final Boolean getInstanceFollowRedirects() {
        return this.f13249e;
    }

    public final int getMaxResponseSize() {
        return this.f13250f;
    }

    public final Integer getReadTimeout() {
        return this.f13246b;
    }

    public final SSLSocketFactory getSslSocketFactory() {
        return this.f13247c;
    }

    public final Boolean getUseCaches() {
        return this.f13248d;
    }

    public String toString() {
        return "NetworkClientSettings(connectTimeout=" + this.f13245a + ", readTimeout=" + this.f13246b + ", sslSocketFactory=" + this.f13247c + ", useCaches=" + this.f13248d + ", instanceFollowRedirects=" + this.f13249e + ", maxResponseSize=" + this.f13250f + ')';
    }

    private NetworkClientSettings(Integer num, Integer num2, SSLSocketFactory sSLSocketFactory, Boolean bool, Boolean bool2, int i4) {
        this.f13245a = num;
        this.f13246b = num2;
        this.f13247c = sSLSocketFactory;
        this.f13248d = bool;
        this.f13249e = bool2;
        this.f13250f = i4;
    }
}
