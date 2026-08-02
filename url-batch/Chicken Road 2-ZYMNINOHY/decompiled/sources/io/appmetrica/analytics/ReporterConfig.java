package io.appmetrica.analytics;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.C0652h0;
import io.appmetrica.analytics.impl.C0812n5;
import io.appmetrica.analytics.impl.En;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class ReporterConfig {
    public final Map<String, Object> additionalConfig;
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
        private static final En f9391l = new En(new C0652h0());

        /* renamed from: a, reason: collision with root package name */
        private final C0812n5 f9392a;

        /* renamed from: b, reason: collision with root package name */
        private final String f9393b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f9394c;

        /* renamed from: d, reason: collision with root package name */
        private Boolean f9395d;

        /* renamed from: e, reason: collision with root package name */
        private Boolean f9396e;

        /* renamed from: f, reason: collision with root package name */
        private Integer f9397f;

        /* renamed from: g, reason: collision with root package name */
        private String f9398g;

        /* renamed from: h, reason: collision with root package name */
        private Integer f9399h;

        /* renamed from: i, reason: collision with root package name */
        private Integer f9400i;

        /* renamed from: j, reason: collision with root package name */
        private final HashMap f9401j;

        /* renamed from: k, reason: collision with root package name */
        private final HashMap f9402k;

        public /* synthetic */ Builder(String str, int i4) {
            this(str);
        }

        public ReporterConfig build() {
            return new ReporterConfig(this, 0);
        }

        public Builder withAdditionalConfig(String str, Object obj) {
            this.f9402k.put(str, obj);
            return this;
        }

        public Builder withAppEnvironmentValue(String str, String str2) {
            this.f9401j.put(str, str2);
            return this;
        }

        public Builder withDataSendingEnabled(boolean z) {
            this.f9396e = Boolean.valueOf(z);
            return this;
        }

        public Builder withDispatchPeriodSeconds(int i4) {
            this.f9399h = Integer.valueOf(i4);
            return this;
        }

        public Builder withLogs() {
            this.f9395d = Boolean.TRUE;
            return this;
        }

        public Builder withMaxReportsCount(int i4) {
            this.f9400i = Integer.valueOf(i4);
            return this;
        }

        public Builder withMaxReportsInDatabaseCount(int i4) {
            this.f9397f = Integer.valueOf(this.f9392a.a(i4));
            return this;
        }

        public Builder withSessionTimeout(int i4) {
            this.f9394c = Integer.valueOf(i4);
            return this;
        }

        public Builder withUserProfileID(String str) {
            this.f9398g = str;
            return this;
        }

        private Builder(String str) {
            this.f9401j = new HashMap();
            this.f9402k = new HashMap();
            f9391l.a(str);
            this.f9392a = new C0812n5(str);
            this.f9393b = str;
        }
    }

    public /* synthetic */ ReporterConfig(Builder builder, int i4) {
        this(builder);
    }

    public static Builder newConfigBuilder(String str) {
        return new Builder(str, 0);
    }

    private ReporterConfig(Builder builder) {
        this.apiKey = builder.f9393b;
        this.sessionTimeout = builder.f9394c;
        this.logs = builder.f9395d;
        this.dataSendingEnabled = builder.f9396e;
        this.maxReportsInDatabaseCount = builder.f9397f;
        this.userProfileID = builder.f9398g;
        this.dispatchPeriodSeconds = builder.f9399h;
        this.maxReportsCount = builder.f9400i;
        this.appEnvironment = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f9401j);
        this.additionalConfig = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f9402k);
    }
}
