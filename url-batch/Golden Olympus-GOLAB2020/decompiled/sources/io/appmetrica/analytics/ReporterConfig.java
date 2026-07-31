package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.Bn;
import io.appmetrica.analytics.impl.C2611f0;
import io.appmetrica.analytics.impl.I5;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class ReporterConfig {

    @NonNull
    public final Map<String, Object> additionalConfig;

    @NonNull
    public final String apiKey;
    public final Map<String, String> appEnvironment;
    public final Boolean dataSendingEnabled;
    public final Integer dispatchPeriodSeconds;
    public final Boolean logs;
    public final Integer maxReportsCount;
    public final Integer maxReportsInDatabaseCount;
    public final Integer sessionTimeout;
    public final String userProfileID;

    public static class Builder {

        /* renamed from: l, reason: collision with root package name */
        private static final Bn f36840l = new Bn(new C2611f0());

        /* renamed from: a, reason: collision with root package name */
        private final I5 f36841a;

        /* renamed from: b, reason: collision with root package name */
        private final String f36842b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f36843c;

        /* renamed from: d, reason: collision with root package name */
        private Boolean f36844d;

        /* renamed from: e, reason: collision with root package name */
        private Boolean f36845e;

        /* renamed from: f, reason: collision with root package name */
        private Integer f36846f;

        /* renamed from: g, reason: collision with root package name */
        private String f36847g;

        /* renamed from: h, reason: collision with root package name */
        private Integer f36848h;

        /* renamed from: i, reason: collision with root package name */
        private Integer f36849i;

        /* renamed from: j, reason: collision with root package name */
        private final HashMap f36850j;

        /* renamed from: k, reason: collision with root package name */
        private final HashMap f36851k;

        /* synthetic */ Builder(String str, int i4) {
            this(str);
        }

        @NonNull
        public ReporterConfig build() {
            return new ReporterConfig(this, 0);
        }

        @NonNull
        public Builder withAdditionalConfig(@NonNull String str, Object obj) {
            this.f36851k.put(str, obj);
            return this;
        }

        @NonNull
        public Builder withAppEnvironmentValue(String str, String str2) {
            this.f36850j.put(str, str2);
            return this;
        }

        @NonNull
        public Builder withDataSendingEnabled(boolean z4) {
            this.f36845e = Boolean.valueOf(z4);
            return this;
        }

        @NonNull
        public Builder withDispatchPeriodSeconds(int i4) {
            this.f36848h = Integer.valueOf(i4);
            return this;
        }

        @NonNull
        public Builder withLogs() {
            this.f36844d = Boolean.TRUE;
            return this;
        }

        @NonNull
        public Builder withMaxReportsCount(int i4) {
            this.f36849i = Integer.valueOf(i4);
            return this;
        }

        @NonNull
        public Builder withMaxReportsInDatabaseCount(int i4) {
            this.f36846f = Integer.valueOf(this.f36841a.a(i4));
            return this;
        }

        @NonNull
        public Builder withSessionTimeout(int i4) {
            this.f36843c = Integer.valueOf(i4);
            return this;
        }

        @NonNull
        public Builder withUserProfileID(String str) {
            this.f36847g = str;
            return this;
        }

        private Builder(String str) {
            this.f36850j = new HashMap();
            this.f36851k = new HashMap();
            f36840l.a(str);
            this.f36841a = new I5(str);
            this.f36842b = str;
        }
    }

    /* synthetic */ ReporterConfig(Builder builder, int i4) {
        this(builder);
    }

    @NonNull
    public static Builder newConfigBuilder(@NonNull String str) {
        return new Builder(str, 0);
    }

    private ReporterConfig(Builder builder) {
        this.apiKey = builder.f36842b;
        this.sessionTimeout = builder.f36843c;
        this.logs = builder.f36844d;
        this.dataSendingEnabled = builder.f36845e;
        this.maxReportsInDatabaseCount = builder.f36846f;
        this.userProfileID = builder.f36847g;
        this.dispatchPeriodSeconds = builder.f36848h;
        this.maxReportsCount = builder.f36849i;
        this.appEnvironment = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f36850j);
        this.additionalConfig = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f36851k);
    }
}
