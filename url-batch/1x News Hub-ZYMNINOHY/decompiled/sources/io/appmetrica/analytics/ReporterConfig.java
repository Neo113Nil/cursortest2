package io.appmetrica.analytics;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.C0530h0;
import io.appmetrica.analytics.impl.C0871u5;
import io.appmetrica.analytics.impl.Gn;
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
        private static final Gn f5158l = new Gn(new C0530h0());

        /* renamed from: a, reason: collision with root package name */
        private final C0871u5 f5159a;

        /* renamed from: b, reason: collision with root package name */
        private final String f5160b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f5161c;

        /* renamed from: d, reason: collision with root package name */
        private Boolean f5162d;

        /* renamed from: e, reason: collision with root package name */
        private Boolean f5163e;
        private Integer f;

        /* renamed from: g, reason: collision with root package name */
        private String f5164g;

        /* renamed from: h, reason: collision with root package name */
        private Integer f5165h;

        /* renamed from: i, reason: collision with root package name */
        private Integer f5166i;

        /* renamed from: j, reason: collision with root package name */
        private final HashMap f5167j;

        /* renamed from: k, reason: collision with root package name */
        private final HashMap f5168k;

        public /* synthetic */ Builder(String str, int i3) {
            this(str);
        }

        public ReporterConfig build() {
            return new ReporterConfig(this, 0);
        }

        public Builder withAdditionalConfig(String str, Object obj) {
            this.f5168k.put(str, obj);
            return this;
        }

        public Builder withAppEnvironmentValue(String str, String str2) {
            this.f5167j.put(str, str2);
            return this;
        }

        public Builder withDataSendingEnabled(boolean z) {
            this.f5163e = Boolean.valueOf(z);
            return this;
        }

        public Builder withDispatchPeriodSeconds(int i3) {
            this.f5165h = Integer.valueOf(i3);
            return this;
        }

        public Builder withLogs() {
            this.f5162d = Boolean.TRUE;
            return this;
        }

        public Builder withMaxReportsCount(int i3) {
            this.f5166i = Integer.valueOf(i3);
            return this;
        }

        public Builder withMaxReportsInDatabaseCount(int i3) {
            this.f = Integer.valueOf(this.f5159a.a(i3));
            return this;
        }

        public Builder withSessionTimeout(int i3) {
            this.f5161c = Integer.valueOf(i3);
            return this;
        }

        public Builder withUserProfileID(String str) {
            this.f5164g = str;
            return this;
        }

        private Builder(String str) {
            this.f5167j = new HashMap();
            this.f5168k = new HashMap();
            f5158l.a(str);
            this.f5159a = new C0871u5(str);
            this.f5160b = str;
        }
    }

    public /* synthetic */ ReporterConfig(Builder builder, int i3) {
        this(builder);
    }

    public static Builder newConfigBuilder(String str) {
        return new Builder(str, 0);
    }

    private ReporterConfig(Builder builder) {
        this.apiKey = builder.f5160b;
        this.sessionTimeout = builder.f5161c;
        this.logs = builder.f5162d;
        this.dataSendingEnabled = builder.f5163e;
        this.maxReportsInDatabaseCount = builder.f;
        this.userProfileID = builder.f5164g;
        this.dispatchPeriodSeconds = builder.f5165h;
        this.maxReportsCount = builder.f5166i;
        this.appEnvironment = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f5167j);
        this.additionalConfig = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f5168k);
    }
}
