package io.appmetrica.analytics.network.internal;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.network.impl.c;
import io.appmetrica.analytics.network.impl.d;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes3.dex */
public class NetworkClient {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f40548a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f40549b;

    /* renamed from: c, reason: collision with root package name */
    private final SSLSocketFactory f40550c;

    /* renamed from: d, reason: collision with root package name */
    private final Boolean f40551d;

    /* renamed from: e, reason: collision with root package name */
    private final Boolean f40552e;

    /* renamed from: f, reason: collision with root package name */
    private final int f40553f;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private Integer f40554a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f40555b;

        /* renamed from: c, reason: collision with root package name */
        private SSLSocketFactory f40556c;

        /* renamed from: d, reason: collision with root package name */
        private Boolean f40557d;

        /* renamed from: e, reason: collision with root package name */
        private Boolean f40558e;

        /* renamed from: f, reason: collision with root package name */
        private Integer f40559f;

        @NonNull
        public NetworkClient build() {
            return new NetworkClient(this.f40554a, this.f40555b, this.f40556c, this.f40557d, this.f40558e, this.f40559f, 0);
        }

        @NonNull
        public Builder withConnectTimeout(int i4) {
            this.f40554a = Integer.valueOf(i4);
            return this;
        }

        @NonNull
        public Builder withInstanceFollowRedirects(boolean z4) {
            this.f40558e = Boolean.valueOf(z4);
            return this;
        }

        @NonNull
        public Builder withMaxResponseSize(int i4) {
            this.f40559f = Integer.valueOf(i4);
            return this;
        }

        @NonNull
        public Builder withReadTimeout(int i4) {
            this.f40555b = Integer.valueOf(i4);
            return this;
        }

        @NonNull
        public Builder withSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
            this.f40556c = sSLSocketFactory;
            return this;
        }

        @NonNull
        public Builder withUseCaches(boolean z4) {
            this.f40557d = Boolean.valueOf(z4);
            return this;
        }
    }

    /* synthetic */ NetworkClient(Integer num, Integer num2, SSLSocketFactory sSLSocketFactory, Boolean bool, Boolean bool2, Integer num3, int i4) {
        this(num, num2, sSLSocketFactory, bool, bool2, num3);
    }

    public Integer getConnectTimeout() {
        return this.f40548a;
    }

    public Boolean getInstanceFollowRedirects() {
        return this.f40552e;
    }

    public int getMaxResponseSize() {
        return this.f40553f;
    }

    public Integer getReadTimeout() {
        return this.f40549b;
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.f40550c;
    }

    public Boolean getUseCaches() {
        return this.f40551d;
    }

    @NonNull
    public Call newCall(@NonNull Request request) {
        return new c(this, request, new d());
    }

    public String toString() {
        return "NetworkClient{connectTimeout=" + this.f40548a + ", readTimeout=" + this.f40549b + ", sslSocketFactory=" + this.f40550c + ", useCaches=" + this.f40551d + ", instanceFollowRedirects=" + this.f40552e + ", maxResponseSize=" + this.f40553f + '}';
    }

    private NetworkClient(Integer num, Integer num2, SSLSocketFactory sSLSocketFactory, Boolean bool, Boolean bool2, Integer num3) {
        this.f40548a = num;
        this.f40549b = num2;
        this.f40550c = sSLSocketFactory;
        this.f40551d = bool;
        this.f40552e = bool2;
        this.f40553f = num3 == null ? Integer.MAX_VALUE : num3.intValue();
    }
}
