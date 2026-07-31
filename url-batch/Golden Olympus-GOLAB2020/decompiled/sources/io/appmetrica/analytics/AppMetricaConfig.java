package io.appmetrica.analytics;

import android.location.Location;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.AbstractC2535c4;
import io.appmetrica.analytics.impl.AbstractC2713io;
import io.appmetrica.analytics.impl.Bb;
import io.appmetrica.analytics.impl.Bn;
import io.appmetrica.analytics.impl.C2611f0;
import io.appmetrica.analytics.impl.I5;
import io.appmetrica.analytics.impl.Y7;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class AppMetricaConfig {

    @NonNull
    public final Map<String, Object> additionalConfig;
    public final Boolean advIdentifiersTracking;
    public final Boolean anrMonitoring;
    public final Integer anrMonitoringTimeout;

    @NonNull
    public final String apiKey;
    public final Integer appBuildNumber;
    public final Map<String, String> appEnvironment;
    public final Boolean appOpenTrackingEnabled;
    public final String appVersion;
    public final Boolean crashReporting;
    public final ICrashTransformer crashTransformer;
    public final List<String> customHosts;
    public final Boolean dataSendingEnabled;
    public final String deviceType;
    public final Integer dispatchPeriodSeconds;
    public final Map<String, String> errorEnvironment;
    public final Boolean firstActivationAsUpdate;
    public final Location location;
    public final Boolean locationTracking;
    public final Boolean logs;
    public final Integer maxReportsCount;
    public final Integer maxReportsInDatabaseCount;
    public final Boolean nativeCrashReporting;
    public final PreloadInfo preloadInfo;
    public final Boolean revenueAutoTrackingEnabled;
    public final Integer sessionTimeout;
    public final Boolean sessionsAutoTrackingEnabled;
    public final String userProfileID;

    public static class Builder {

        /* renamed from: D, reason: collision with root package name */
        private static final Bn f36782D = new Bn(new C2611f0());

        /* renamed from: A, reason: collision with root package name */
        private Integer f36783A;

        /* renamed from: B, reason: collision with root package name */
        private List f36784B;

        /* renamed from: C, reason: collision with root package name */
        private final HashMap f36785C;

        /* renamed from: a, reason: collision with root package name */
        private final I5 f36786a;

        /* renamed from: b, reason: collision with root package name */
        private final String f36787b;

        /* renamed from: c, reason: collision with root package name */
        private String f36788c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f36789d;

        /* renamed from: e, reason: collision with root package name */
        private Boolean f36790e;

        /* renamed from: f, reason: collision with root package name */
        private Boolean f36791f;

        /* renamed from: g, reason: collision with root package name */
        private Location f36792g;

        /* renamed from: h, reason: collision with root package name */
        private Boolean f36793h;

        /* renamed from: i, reason: collision with root package name */
        private Boolean f36794i;

        /* renamed from: j, reason: collision with root package name */
        private Boolean f36795j;

        /* renamed from: k, reason: collision with root package name */
        private PreloadInfo f36796k;

        /* renamed from: l, reason: collision with root package name */
        private Boolean f36797l;

        /* renamed from: m, reason: collision with root package name */
        private Boolean f36798m;

        /* renamed from: n, reason: collision with root package name */
        private Integer f36799n;

        /* renamed from: o, reason: collision with root package name */
        private final LinkedHashMap f36800o;

        /* renamed from: p, reason: collision with root package name */
        private String f36801p;

        /* renamed from: q, reason: collision with root package name */
        private Boolean f36802q;

        /* renamed from: r, reason: collision with root package name */
        private Boolean f36803r;

        /* renamed from: s, reason: collision with root package name */
        private Boolean f36804s;

        /* renamed from: t, reason: collision with root package name */
        private String f36805t;

        /* renamed from: u, reason: collision with root package name */
        private Integer f36806u;

        /* renamed from: v, reason: collision with root package name */
        private Integer f36807v;

        /* renamed from: w, reason: collision with root package name */
        private Integer f36808w;

        /* renamed from: x, reason: collision with root package name */
        private final LinkedHashMap f36809x;

        /* renamed from: y, reason: collision with root package name */
        private ICrashTransformer f36810y;

        /* renamed from: z, reason: collision with root package name */
        private Boolean f36811z;

        /* synthetic */ Builder(String str, int i4) {
            this(str);
        }

        @NonNull
        public AppMetricaConfig build() {
            return new AppMetricaConfig(this, 0);
        }

        @NonNull
        public Builder handleFirstActivationAsUpdate(boolean z4) {
            this.f36797l = Boolean.valueOf(z4);
            return this;
        }

        @NonNull
        public Builder withAdditionalConfig(@NonNull String str, Object obj) {
            this.f36785C.put(str, obj);
            return this;
        }

        @NonNull
        public Builder withAdvIdentifiersTracking(boolean z4) {
            this.f36794i = Boolean.valueOf(z4);
            return this;
        }

        @NonNull
        public Builder withAnrMonitoring(boolean z4) {
            this.f36811z = Boolean.valueOf(z4);
            return this;
        }

        @NonNull
        public Builder withAnrMonitoringTimeout(int i4) {
            this.f36783A = Integer.valueOf(i4);
            return this;
        }

        @NonNull
        public Builder withAppBuildNumber(int i4) {
            if (i4 < 0) {
                throw new IllegalArgumentException(String.format(Locale.US, "Invalid %1$s. %1$s should be positive.", "App Build Number"));
            }
            this.f36806u = Integer.valueOf(i4);
            return this;
        }

        @NonNull
        public Builder withAppEnvironmentValue(@NonNull String str, String str2) {
            this.f36809x.put(str, str2);
            return this;
        }

        @NonNull
        public Builder withAppOpenTrackingEnabled(boolean z4) {
            this.f36804s = Boolean.valueOf(z4);
            return this;
        }

        @NonNull
        public Builder withAppVersion(String str) {
            this.f36788c = str;
            return this;
        }

        @NonNull
        public Builder withCrashReporting(boolean z4) {
            this.f36790e = Boolean.valueOf(z4);
            return this;
        }

        @NonNull
        public Builder withCrashTransformer(ICrashTransformer iCrashTransformer) {
            this.f36810y = iCrashTransformer;
            return this;
        }

        @NonNull
        public Builder withCustomHosts(@NonNull List<String> list) {
            this.f36784B = CollectionUtils.unmodifiableListCopy(list);
            return this;
        }

        @NonNull
        public Builder withDataSendingEnabled(boolean z4) {
            this.f36798m = Boolean.valueOf(z4);
            return this;
        }

        @NonNull
        public Builder withDeviceType(String str) {
            this.f36805t = str;
            return this;
        }

        @NonNull
        public Builder withDispatchPeriodSeconds(int i4) {
            this.f36807v = Integer.valueOf(i4);
            return this;
        }

        @NonNull
        public Builder withErrorEnvironmentValue(@NonNull String str, String str2) {
            this.f36800o.put(str, str2);
            return this;
        }

        @NonNull
        public Builder withLocation(Location location) {
            this.f36792g = location;
            return this;
        }

        @NonNull
        public Builder withLocationTracking(boolean z4) {
            this.f36793h = Boolean.valueOf(z4);
            return this;
        }

        @NonNull
        public Builder withLogs() {
            this.f36795j = Boolean.TRUE;
            return this;
        }

        @NonNull
        public Builder withMaxReportsCount(int i4) {
            this.f36808w = Integer.valueOf(i4);
            return this;
        }

        @NonNull
        public Builder withMaxReportsInDatabaseCount(int i4) {
            this.f36799n = Integer.valueOf(this.f36786a.a(i4));
            return this;
        }

        @NonNull
        public Builder withNativeCrashReporting(boolean z4) {
            this.f36791f = Boolean.valueOf(z4);
            return this;
        }

        @NonNull
        public Builder withPreloadInfo(PreloadInfo preloadInfo) {
            this.f36796k = preloadInfo;
            return this;
        }

        @NonNull
        public Builder withRevenueAutoTrackingEnabled(boolean z4) {
            this.f36802q = Boolean.valueOf(z4);
            return this;
        }

        @NonNull
        public Builder withSessionTimeout(int i4) {
            this.f36789d = Integer.valueOf(i4);
            return this;
        }

        @NonNull
        public Builder withSessionsAutoTrackingEnabled(boolean z4) {
            this.f36803r = Boolean.valueOf(z4);
            return this;
        }

        @NonNull
        public Builder withUserProfileID(String str) {
            this.f36801p = str;
            return this;
        }

        private Builder(String str) {
            this.f36800o = new LinkedHashMap();
            this.f36809x = new LinkedHashMap();
            this.f36785C = new HashMap();
            f36782D.a(str);
            this.f36786a = new I5(str);
            this.f36787b = str;
        }
    }

    /* synthetic */ AppMetricaConfig(Builder builder, int i4) {
        this(builder);
    }

    public static AppMetricaConfig fromJson(String str) {
        HashMap c4;
        HashMap c5;
        new Y7();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Builder newConfigBuilder = newConfigBuilder(jSONObject.getString("apikey"));
            if (jSONObject.has("app_version")) {
                newConfigBuilder.withAppVersion(jSONObject.optString("app_version"));
            }
            if (jSONObject.has("session_timeout")) {
                newConfigBuilder.withSessionTimeout(jSONObject.getInt("session_timeout"));
            }
            newConfigBuilder.withLocation(AbstractC2535c4.a(jSONObject.optString(FirebaseAnalytics.Param.LOCATION)));
            newConfigBuilder.withPreloadInfo(AbstractC2535c4.b(jSONObject.optString("preload_info")));
            if (jSONObject.has("logs") && jSONObject.optBoolean("logs")) {
                newConfigBuilder.withLogs();
            }
            if (jSONObject.has("crash_enabled")) {
                newConfigBuilder.withCrashReporting(jSONObject.optBoolean("crash_enabled"));
            }
            if (jSONObject.has("crash_native_enabled")) {
                newConfigBuilder.withNativeCrashReporting(jSONObject.optBoolean("crash_native_enabled"));
            }
            if (jSONObject.has("location_enabled")) {
                newConfigBuilder.withLocationTracking(jSONObject.optBoolean("location_enabled"));
            }
            if (jSONObject.has("adv_identifiers_tracking")) {
                newConfigBuilder.withAdvIdentifiersTracking(jSONObject.optBoolean("adv_identifiers_tracking", true));
            }
            if (jSONObject.has("max_reports_in_db_count")) {
                newConfigBuilder.withMaxReportsInDatabaseCount(jSONObject.optInt("max_reports_in_db_count"));
            }
            if (jSONObject.has("error_environment") && (c5 = Bb.c(jSONObject.optString("error_environment"))) != null) {
                for (Map.Entry entry : c5.entrySet()) {
                    newConfigBuilder.withErrorEnvironmentValue((String) entry.getKey(), (String) entry.getValue());
                }
            }
            if (jSONObject.has("first_activation_as_update")) {
                newConfigBuilder.handleFirstActivationAsUpdate(jSONObject.optBoolean("first_activation_as_update"));
            }
            if (jSONObject.has("data_sending_enabled")) {
                newConfigBuilder.withDataSendingEnabled(jSONObject.optBoolean("data_sending_enabled"));
            }
            if (jSONObject.has("user_profile_id")) {
                newConfigBuilder.withUserProfileID(jSONObject.optString("user_profile_id", null));
            }
            if (jSONObject.has("revenue_auto_tracking_enabled")) {
                newConfigBuilder.withRevenueAutoTrackingEnabled(jSONObject.optBoolean("revenue_auto_tracking_enabled"));
            }
            if (jSONObject.has("sessions_auto_tracking_enabled")) {
                newConfigBuilder.withSessionsAutoTrackingEnabled(jSONObject.optBoolean("sessions_auto_tracking_enabled"));
            }
            if (jSONObject.has("app_open_tracking_enabled")) {
                newConfigBuilder.withAppOpenTrackingEnabled(jSONObject.optBoolean("app_open_tracking_enabled"));
            }
            if (jSONObject.has(CommonUrlParts.DEVICE_TYPE)) {
                newConfigBuilder.withDeviceType(jSONObject.optString(CommonUrlParts.DEVICE_TYPE));
            }
            if (jSONObject.has(CommonUrlParts.APP_VERSION_CODE)) {
                newConfigBuilder.withAppBuildNumber(jSONObject.optInt(CommonUrlParts.APP_VERSION_CODE));
            }
            if (jSONObject.has("dispatch_period_seconds")) {
                newConfigBuilder.withDispatchPeriodSeconds(jSONObject.optInt("dispatch_period_seconds"));
            }
            if (jSONObject.has("max_reports_count")) {
                newConfigBuilder.withMaxReportsCount(jSONObject.optInt("max_reports_count"));
            }
            if (jSONObject.has("app_environment") && (c4 = Bb.c(jSONObject.optString("app_environment"))) != null) {
                for (Map.Entry entry2 : c4.entrySet()) {
                    newConfigBuilder.withAppEnvironmentValue((String) entry2.getKey(), (String) entry2.getValue());
                }
            }
            if (jSONObject.has("anr_monitoring")) {
                newConfigBuilder.withAnrMonitoring(jSONObject.optBoolean("anr_monitoring"));
            }
            if (jSONObject.has("anr_monitoring_timeout")) {
                newConfigBuilder.withAnrMonitoringTimeout(jSONObject.optInt("anr_monitoring_timeout"));
            }
            if (jSONObject.has("customHosts")) {
                newConfigBuilder.withCustomHosts(Bb.a(jSONObject.optJSONArray("customHosts")));
            }
            if (jSONObject.has("additional_config")) {
                jSONObject.optJSONObject("additional_config");
            }
            return newConfigBuilder.build();
        } catch (Throwable unused) {
            return null;
        }
    }

    @NonNull
    public static Builder newConfigBuilder(@NonNull String str) {
        return new Builder(str, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00fd A[Catch: all -> 0x011d, TryCatch #1 {all -> 0x011d, blocks: (B:3:0x0005, B:7:0x0058, B:10:0x0092, B:13:0x00e8, B:15:0x00fd, B:18:0x010b, B:19:0x0106, B:20:0x010e, B:24:0x00e3, B:25:0x008d), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e3 A[Catch: all -> 0x011d, TryCatch #1 {all -> 0x011d, blocks: (B:3:0x0005, B:7:0x0058, B:10:0x0092, B:13:0x00e8, B:15:0x00fd, B:18:0x010b, B:19:0x0106, B:20:0x010e, B:24:0x00e3, B:25:0x008d), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008d A[Catch: all -> 0x011d, TryCatch #1 {all -> 0x011d, blocks: (B:3:0x0005, B:7:0x0058, B:10:0x0092, B:13:0x00e8, B:15:0x00fd, B:18:0x010b, B:19:0x0106, B:20:0x010e, B:24:0x00e3, B:25:0x008d), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toJson() {
        String jSONObject;
        List<String> list;
        new Y7();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("apikey", this.apiKey);
            jSONObject2.put("app_version", this.appVersion);
            jSONObject2.put("session_timeout", this.sessionTimeout);
            jSONObject2.put(FirebaseAnalytics.Param.LOCATION, AbstractC2535c4.a(this.location));
            PreloadInfo preloadInfo = this.preloadInfo;
            JSONArray jSONArray = null;
            if (preloadInfo != null) {
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("trackid", preloadInfo.getTrackingId());
                    Map<String, String> additionalParams = preloadInfo.getAdditionalParams();
                    jSONObject3.put("params", additionalParams == null ? null : new JSONObject(additionalParams));
                    jSONObject = jSONObject3.toString();
                } catch (Throwable unused) {
                }
                jSONObject2.put("preload_info", jSONObject);
                jSONObject2.put("logs", this.logs);
                jSONObject2.put("crash_enabled", this.crashReporting);
                jSONObject2.put("crash_native_enabled", this.nativeCrashReporting);
                jSONObject2.put("location_enabled", this.locationTracking);
                jSONObject2.put("adv_identifiers_tracking", this.advIdentifiersTracking);
                jSONObject2.put("max_reports_in_db_count", this.maxReportsInDatabaseCount);
                Map<String, String> map = this.errorEnvironment;
                jSONObject2.put("error_environment", map != null ? null : new JSONObject(map));
                jSONObject2.put("first_activation_as_update", this.firstActivationAsUpdate);
                jSONObject2.put("data_sending_enabled", this.dataSendingEnabled);
                jSONObject2.put("user_profile_id", this.userProfileID);
                jSONObject2.put("revenue_auto_tracking_enabled", this.revenueAutoTrackingEnabled);
                jSONObject2.put("sessions_auto_tracking_enabled", this.sessionsAutoTrackingEnabled);
                jSONObject2.put("app_open_tracking_enabled", this.appOpenTrackingEnabled);
                jSONObject2.put(CommonUrlParts.DEVICE_TYPE, this.deviceType);
                jSONObject2.put(CommonUrlParts.APP_VERSION_CODE, this.appBuildNumber);
                jSONObject2.put("dispatch_period_seconds", this.dispatchPeriodSeconds);
                jSONObject2.put("max_reports_count", this.maxReportsCount);
                Map<String, String> map2 = this.appEnvironment;
                jSONObject2.put("app_environment", map2 != null ? null : new JSONObject(map2));
                jSONObject2.put("anr_monitoring", this.anrMonitoring);
                jSONObject2.put("anr_monitoring_timeout", this.anrMonitoringTimeout);
                list = this.customHosts;
                if (list != null) {
                    if (!AbstractC2713io.a((Collection) list)) {
                        jSONArray = new JSONArray((Collection) list);
                    }
                    jSONObject2.put("customHosts", jSONArray);
                }
                jSONObject2.put("additional_config", new JSONObject());
                return jSONObject2.toString();
            }
            jSONObject = null;
            jSONObject2.put("preload_info", jSONObject);
            jSONObject2.put("logs", this.logs);
            jSONObject2.put("crash_enabled", this.crashReporting);
            jSONObject2.put("crash_native_enabled", this.nativeCrashReporting);
            jSONObject2.put("location_enabled", this.locationTracking);
            jSONObject2.put("adv_identifiers_tracking", this.advIdentifiersTracking);
            jSONObject2.put("max_reports_in_db_count", this.maxReportsInDatabaseCount);
            Map<String, String> map3 = this.errorEnvironment;
            jSONObject2.put("error_environment", map3 != null ? null : new JSONObject(map3));
            jSONObject2.put("first_activation_as_update", this.firstActivationAsUpdate);
            jSONObject2.put("data_sending_enabled", this.dataSendingEnabled);
            jSONObject2.put("user_profile_id", this.userProfileID);
            jSONObject2.put("revenue_auto_tracking_enabled", this.revenueAutoTrackingEnabled);
            jSONObject2.put("sessions_auto_tracking_enabled", this.sessionsAutoTrackingEnabled);
            jSONObject2.put("app_open_tracking_enabled", this.appOpenTrackingEnabled);
            jSONObject2.put(CommonUrlParts.DEVICE_TYPE, this.deviceType);
            jSONObject2.put(CommonUrlParts.APP_VERSION_CODE, this.appBuildNumber);
            jSONObject2.put("dispatch_period_seconds", this.dispatchPeriodSeconds);
            jSONObject2.put("max_reports_count", this.maxReportsCount);
            Map<String, String> map22 = this.appEnvironment;
            jSONObject2.put("app_environment", map22 != null ? null : new JSONObject(map22));
            jSONObject2.put("anr_monitoring", this.anrMonitoring);
            jSONObject2.put("anr_monitoring_timeout", this.anrMonitoringTimeout);
            list = this.customHosts;
            if (list != null) {
            }
            jSONObject2.put("additional_config", new JSONObject());
            return jSONObject2.toString();
        } catch (Throwable unused2) {
            return "";
        }
    }

    private AppMetricaConfig(Builder builder) {
        this.apiKey = builder.f36787b;
        this.appVersion = builder.f36788c;
        this.sessionTimeout = builder.f36789d;
        this.crashReporting = builder.f36790e;
        this.nativeCrashReporting = builder.f36791f;
        this.location = builder.f36792g;
        this.locationTracking = builder.f36793h;
        this.advIdentifiersTracking = builder.f36794i;
        this.logs = builder.f36795j;
        this.preloadInfo = builder.f36796k;
        this.firstActivationAsUpdate = builder.f36797l;
        this.dataSendingEnabled = builder.f36798m;
        this.maxReportsInDatabaseCount = builder.f36799n;
        this.errorEnvironment = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f36800o);
        this.userProfileID = builder.f36801p;
        this.revenueAutoTrackingEnabled = builder.f36802q;
        this.sessionsAutoTrackingEnabled = builder.f36803r;
        this.appOpenTrackingEnabled = builder.f36804s;
        this.deviceType = builder.f36805t;
        this.appBuildNumber = builder.f36806u;
        this.dispatchPeriodSeconds = builder.f36807v;
        this.maxReportsCount = builder.f36808w;
        this.appEnvironment = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f36809x);
        this.crashTransformer = builder.f36810y;
        this.anrMonitoring = builder.f36811z;
        this.anrMonitoringTimeout = builder.f36783A;
        this.customHosts = builder.f36784B;
        this.additionalConfig = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f36785C);
    }

    protected AppMetricaConfig(@NonNull AppMetricaConfig appMetricaConfig) {
        this.apiKey = appMetricaConfig.apiKey;
        this.appVersion = appMetricaConfig.appVersion;
        this.sessionTimeout = appMetricaConfig.sessionTimeout;
        this.crashReporting = appMetricaConfig.crashReporting;
        this.nativeCrashReporting = appMetricaConfig.nativeCrashReporting;
        this.location = appMetricaConfig.location;
        this.locationTracking = appMetricaConfig.locationTracking;
        this.advIdentifiersTracking = appMetricaConfig.advIdentifiersTracking;
        this.logs = appMetricaConfig.logs;
        this.preloadInfo = appMetricaConfig.preloadInfo;
        this.firstActivationAsUpdate = appMetricaConfig.firstActivationAsUpdate;
        this.dataSendingEnabled = appMetricaConfig.dataSendingEnabled;
        this.maxReportsInDatabaseCount = appMetricaConfig.maxReportsInDatabaseCount;
        this.errorEnvironment = appMetricaConfig.errorEnvironment;
        this.userProfileID = appMetricaConfig.userProfileID;
        this.revenueAutoTrackingEnabled = appMetricaConfig.revenueAutoTrackingEnabled;
        this.sessionsAutoTrackingEnabled = appMetricaConfig.sessionsAutoTrackingEnabled;
        this.appOpenTrackingEnabled = appMetricaConfig.appOpenTrackingEnabled;
        this.deviceType = appMetricaConfig.deviceType;
        this.appBuildNumber = appMetricaConfig.appBuildNumber;
        this.dispatchPeriodSeconds = appMetricaConfig.dispatchPeriodSeconds;
        this.maxReportsCount = appMetricaConfig.maxReportsCount;
        this.appEnvironment = appMetricaConfig.appEnvironment;
        this.crashTransformer = appMetricaConfig.crashTransformer;
        this.anrMonitoring = appMetricaConfig.anrMonitoring;
        this.anrMonitoringTimeout = appMetricaConfig.anrMonitoringTimeout;
        this.customHosts = appMetricaConfig.customHosts;
        this.additionalConfig = appMetricaConfig.additionalConfig;
    }
}
