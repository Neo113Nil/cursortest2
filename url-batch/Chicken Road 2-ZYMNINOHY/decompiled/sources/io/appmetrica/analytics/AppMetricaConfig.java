package io.appmetrica.analytics;

import android.location.Location;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.AbstractC0779lo;
import io.appmetrica.analytics.impl.C0652h0;
import io.appmetrica.analytics.impl.C0812n5;
import io.appmetrica.analytics.impl.C7;
import io.appmetrica.analytics.impl.En;
import io.appmetrica.analytics.impl.G3;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AppMetricaConfig {
    public final Map<String, Object> additionalConfig;
    public final Boolean advIdentifiersTracking;
    public final Boolean anrMonitoring;
    public final Integer anrMonitoringTimeout;
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
        private static final En f9337D = new En(new C0652h0());

        /* renamed from: A, reason: collision with root package name */
        private Integer f9338A;

        /* renamed from: B, reason: collision with root package name */
        private List f9339B;

        /* renamed from: C, reason: collision with root package name */
        private final HashMap f9340C;

        /* renamed from: a, reason: collision with root package name */
        private final C0812n5 f9341a;

        /* renamed from: b, reason: collision with root package name */
        private final String f9342b;

        /* renamed from: c, reason: collision with root package name */
        private String f9343c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f9344d;

        /* renamed from: e, reason: collision with root package name */
        private Boolean f9345e;

        /* renamed from: f, reason: collision with root package name */
        private Boolean f9346f;

        /* renamed from: g, reason: collision with root package name */
        private Location f9347g;

        /* renamed from: h, reason: collision with root package name */
        private Boolean f9348h;

        /* renamed from: i, reason: collision with root package name */
        private Boolean f9349i;

        /* renamed from: j, reason: collision with root package name */
        private Boolean f9350j;

        /* renamed from: k, reason: collision with root package name */
        private PreloadInfo f9351k;

        /* renamed from: l, reason: collision with root package name */
        private Boolean f9352l;

        /* renamed from: m, reason: collision with root package name */
        private Boolean f9353m;
        private Integer n;
        private final LinkedHashMap o;

        /* renamed from: p, reason: collision with root package name */
        private String f9354p;

        /* renamed from: q, reason: collision with root package name */
        private Boolean f9355q;

        /* renamed from: r, reason: collision with root package name */
        private Boolean f9356r;

        /* renamed from: s, reason: collision with root package name */
        private Boolean f9357s;

        /* renamed from: t, reason: collision with root package name */
        private String f9358t;

        /* renamed from: u, reason: collision with root package name */
        private Integer f9359u;
        private Integer v;

        /* renamed from: w, reason: collision with root package name */
        private Integer f9360w;

        /* renamed from: x, reason: collision with root package name */
        private final LinkedHashMap f9361x;

        /* renamed from: y, reason: collision with root package name */
        private ICrashTransformer f9362y;
        private Boolean z;

        public /* synthetic */ Builder(String str, int i4) {
            this(str);
        }

        public AppMetricaConfig build() {
            return new AppMetricaConfig(this, 0);
        }

        public Builder handleFirstActivationAsUpdate(boolean z) {
            this.f9352l = Boolean.valueOf(z);
            return this;
        }

        public Builder withAdditionalConfig(String str, Object obj) {
            this.f9340C.put(str, obj);
            return this;
        }

        public Builder withAdvIdentifiersTracking(boolean z) {
            this.f9349i = Boolean.valueOf(z);
            return this;
        }

        public Builder withAnrMonitoring(boolean z) {
            this.z = Boolean.valueOf(z);
            return this;
        }

        public Builder withAnrMonitoringTimeout(int i4) {
            this.f9338A = Integer.valueOf(i4);
            return this;
        }

        public Builder withAppBuildNumber(int i4) {
            if (i4 < 0) {
                throw new IllegalArgumentException(String.format(Locale.US, "Invalid %1$s. %1$s should be positive.", "App Build Number"));
            }
            this.f9359u = Integer.valueOf(i4);
            return this;
        }

        public Builder withAppEnvironmentValue(String str, String str2) {
            this.f9361x.put(str, str2);
            return this;
        }

        public Builder withAppOpenTrackingEnabled(boolean z) {
            this.f9357s = Boolean.valueOf(z);
            return this;
        }

        public Builder withAppVersion(String str) {
            this.f9343c = str;
            return this;
        }

        public Builder withCrashReporting(boolean z) {
            this.f9345e = Boolean.valueOf(z);
            return this;
        }

        public Builder withCrashTransformer(ICrashTransformer iCrashTransformer) {
            this.f9362y = iCrashTransformer;
            return this;
        }

        public Builder withCustomHosts(List<String> list) {
            this.f9339B = CollectionUtils.unmodifiableListCopy(list);
            return this;
        }

        public Builder withDataSendingEnabled(boolean z) {
            this.f9353m = Boolean.valueOf(z);
            return this;
        }

        public Builder withDeviceType(String str) {
            this.f9358t = str;
            if (!PredefinedDeviceTypes.ALL_VALUES.contains(str)) {
                PublicLogger.getAnonymousInstance().info("PredefinedDeviceTypes does not contain value for `deviceType = %s`. It may cause events to not appear in AppMetrica reports.", str);
            }
            return this;
        }

        public Builder withDispatchPeriodSeconds(int i4) {
            this.v = Integer.valueOf(i4);
            return this;
        }

        public Builder withErrorEnvironmentValue(String str, String str2) {
            this.o.put(str, str2);
            return this;
        }

        public Builder withLocation(Location location) {
            this.f9347g = location;
            return this;
        }

        public Builder withLocationTracking(boolean z) {
            this.f9348h = Boolean.valueOf(z);
            return this;
        }

        public Builder withLogs() {
            this.f9350j = Boolean.TRUE;
            return this;
        }

        public Builder withMaxReportsCount(int i4) {
            this.f9360w = Integer.valueOf(i4);
            return this;
        }

        public Builder withMaxReportsInDatabaseCount(int i4) {
            this.n = Integer.valueOf(this.f9341a.a(i4));
            return this;
        }

        public Builder withNativeCrashReporting(boolean z) {
            this.f9346f = Boolean.valueOf(z);
            return this;
        }

        public Builder withPreloadInfo(PreloadInfo preloadInfo) {
            this.f9351k = preloadInfo;
            return this;
        }

        public Builder withRevenueAutoTrackingEnabled(boolean z) {
            this.f9355q = Boolean.valueOf(z);
            return this;
        }

        public Builder withSessionTimeout(int i4) {
            this.f9344d = Integer.valueOf(i4);
            return this;
        }

        public Builder withSessionsAutoTrackingEnabled(boolean z) {
            this.f9356r = Boolean.valueOf(z);
            return this;
        }

        public Builder withUserProfileID(String str) {
            this.f9354p = str;
            return this;
        }

        private Builder(String str) {
            this.o = new LinkedHashMap();
            this.f9361x = new LinkedHashMap();
            this.f9340C = new HashMap();
            f9337D.a(str);
            this.f9341a = new C0812n5(str);
            this.f9342b = str;
        }
    }

    public /* synthetic */ AppMetricaConfig(Builder builder, int i4) {
        this(builder);
    }

    public static AppMetricaConfig fromJson(String str) {
        Builder a3 = new G3().a(str);
        if (a3 == null) {
            return null;
        }
        return a3.build();
    }

    public static Builder newConfigBuilder(String str) {
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
        new C7();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("apikey", this.apiKey);
            jSONObject2.put("app_version", this.appVersion);
            jSONObject2.put("session_timeout", this.sessionTimeout);
            jSONObject2.put("location", G3.a(this.location));
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
                    if (!AbstractC0779lo.a((Collection) list)) {
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
        this.apiKey = builder.f9342b;
        this.appVersion = builder.f9343c;
        this.sessionTimeout = builder.f9344d;
        this.crashReporting = builder.f9345e;
        this.nativeCrashReporting = builder.f9346f;
        this.location = builder.f9347g;
        this.locationTracking = builder.f9348h;
        this.advIdentifiersTracking = builder.f9349i;
        this.logs = builder.f9350j;
        this.preloadInfo = builder.f9351k;
        this.firstActivationAsUpdate = builder.f9352l;
        this.dataSendingEnabled = builder.f9353m;
        this.maxReportsInDatabaseCount = builder.n;
        this.errorEnvironment = CollectionUtils.unmodifiableSameOrderMapCopy(builder.o);
        this.userProfileID = builder.f9354p;
        this.revenueAutoTrackingEnabled = builder.f9355q;
        this.sessionsAutoTrackingEnabled = builder.f9356r;
        this.appOpenTrackingEnabled = builder.f9357s;
        this.deviceType = builder.f9358t;
        this.appBuildNumber = builder.f9359u;
        this.dispatchPeriodSeconds = builder.v;
        this.maxReportsCount = builder.f9360w;
        this.appEnvironment = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f9361x);
        this.crashTransformer = builder.f9362y;
        this.anrMonitoring = builder.z;
        this.anrMonitoringTimeout = builder.f9338A;
        this.customHosts = builder.f9339B;
        this.additionalConfig = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f9340C);
    }

    public AppMetricaConfig(AppMetricaConfig appMetricaConfig) {
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
