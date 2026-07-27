package io.appmetrica.analytics;

import android.location.Location;
import com.onesignal.inAppMessages.internal.prompt.InAppMessagePromptTypes;
import com.onesignal.session.internal.outcomes.impl.OutcomeEventsTable;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.AbstractC0860no;
import io.appmetrica.analytics.impl.C0681h0;
import io.appmetrica.analytics.impl.C1022u5;
import io.appmetrica.analytics.impl.Gn;
import io.appmetrica.analytics.impl.K7;
import io.appmetrica.analytics.impl.O3;
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
        private static final Gn f5848D = new Gn(new C0681h0());

        /* renamed from: A, reason: collision with root package name */
        private Integer f5849A;

        /* renamed from: B, reason: collision with root package name */
        private List f5850B;

        /* renamed from: C, reason: collision with root package name */
        private final HashMap f5851C;

        /* renamed from: a, reason: collision with root package name */
        private final C1022u5 f5852a;

        /* renamed from: b, reason: collision with root package name */
        private final String f5853b;

        /* renamed from: c, reason: collision with root package name */
        private String f5854c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f5855d;

        /* renamed from: e, reason: collision with root package name */
        private Boolean f5856e;

        /* renamed from: f, reason: collision with root package name */
        private Boolean f5857f;

        /* renamed from: g, reason: collision with root package name */
        private Location f5858g;

        /* renamed from: h, reason: collision with root package name */
        private Boolean f5859h;

        /* renamed from: i, reason: collision with root package name */
        private Boolean f5860i;

        /* renamed from: j, reason: collision with root package name */
        private Boolean f5861j;

        /* renamed from: k, reason: collision with root package name */
        private PreloadInfo f5862k;

        /* renamed from: l, reason: collision with root package name */
        private Boolean f5863l;

        /* renamed from: m, reason: collision with root package name */
        private Boolean f5864m;

        /* renamed from: n, reason: collision with root package name */
        private Integer f5865n;

        /* renamed from: o, reason: collision with root package name */
        private final LinkedHashMap f5866o;

        /* renamed from: p, reason: collision with root package name */
        private String f5867p;

        /* renamed from: q, reason: collision with root package name */
        private Boolean f5868q;

        /* renamed from: r, reason: collision with root package name */
        private Boolean f5869r;

        /* renamed from: s, reason: collision with root package name */
        private Boolean f5870s;

        /* renamed from: t, reason: collision with root package name */
        private String f5871t;

        /* renamed from: u, reason: collision with root package name */
        private Integer f5872u;

        /* renamed from: v, reason: collision with root package name */
        private Integer f5873v;

        /* renamed from: w, reason: collision with root package name */
        private Integer f5874w;

        /* renamed from: x, reason: collision with root package name */
        private final LinkedHashMap f5875x;

        /* renamed from: y, reason: collision with root package name */
        private ICrashTransformer f5876y;
        private Boolean z;

        public /* synthetic */ Builder(String str, int i2) {
            this(str);
        }

        public AppMetricaConfig build() {
            return new AppMetricaConfig(this, 0);
        }

        public Builder handleFirstActivationAsUpdate(boolean z) {
            this.f5863l = Boolean.valueOf(z);
            return this;
        }

        public Builder withAdditionalConfig(String str, Object obj) {
            this.f5851C.put(str, obj);
            return this;
        }

        public Builder withAdvIdentifiersTracking(boolean z) {
            this.f5860i = Boolean.valueOf(z);
            return this;
        }

        public Builder withAnrMonitoring(boolean z) {
            this.z = Boolean.valueOf(z);
            return this;
        }

        public Builder withAnrMonitoringTimeout(int i2) {
            this.f5849A = Integer.valueOf(i2);
            return this;
        }

        public Builder withAppBuildNumber(int i2) {
            if (i2 < 0) {
                throw new IllegalArgumentException(String.format(Locale.US, "Invalid %1$s. %1$s should be positive.", "App Build Number"));
            }
            this.f5872u = Integer.valueOf(i2);
            return this;
        }

        public Builder withAppEnvironmentValue(String str, String str2) {
            this.f5875x.put(str, str2);
            return this;
        }

        public Builder withAppOpenTrackingEnabled(boolean z) {
            this.f5870s = Boolean.valueOf(z);
            return this;
        }

        public Builder withAppVersion(String str) {
            this.f5854c = str;
            return this;
        }

        public Builder withCrashReporting(boolean z) {
            this.f5856e = Boolean.valueOf(z);
            return this;
        }

        public Builder withCrashTransformer(ICrashTransformer iCrashTransformer) {
            this.f5876y = iCrashTransformer;
            return this;
        }

        public Builder withCustomHosts(List<String> list) {
            this.f5850B = CollectionUtils.unmodifiableListCopy(list);
            return this;
        }

        public Builder withDataSendingEnabled(boolean z) {
            this.f5864m = Boolean.valueOf(z);
            return this;
        }

        public Builder withDeviceType(String str) {
            this.f5871t = str;
            if (!PredefinedDeviceTypes.ALL_VALUES.contains(str)) {
                PublicLogger.getAnonymousInstance().info("PredefinedDeviceTypes does not contain value for `deviceType = %s`. It may cause events to not appear in AppMetrica reports.", str);
            }
            return this;
        }

        public Builder withDispatchPeriodSeconds(int i2) {
            this.f5873v = Integer.valueOf(i2);
            return this;
        }

        public Builder withErrorEnvironmentValue(String str, String str2) {
            this.f5866o.put(str, str2);
            return this;
        }

        public Builder withLocation(Location location) {
            this.f5858g = location;
            return this;
        }

        public Builder withLocationTracking(boolean z) {
            this.f5859h = Boolean.valueOf(z);
            return this;
        }

        public Builder withLogs() {
            this.f5861j = Boolean.TRUE;
            return this;
        }

        public Builder withMaxReportsCount(int i2) {
            this.f5874w = Integer.valueOf(i2);
            return this;
        }

        public Builder withMaxReportsInDatabaseCount(int i2) {
            this.f5865n = Integer.valueOf(this.f5852a.a(i2));
            return this;
        }

        public Builder withNativeCrashReporting(boolean z) {
            this.f5857f = Boolean.valueOf(z);
            return this;
        }

        public Builder withPreloadInfo(PreloadInfo preloadInfo) {
            this.f5862k = preloadInfo;
            return this;
        }

        public Builder withRevenueAutoTrackingEnabled(boolean z) {
            this.f5868q = Boolean.valueOf(z);
            return this;
        }

        public Builder withSessionTimeout(int i2) {
            this.f5855d = Integer.valueOf(i2);
            return this;
        }

        public Builder withSessionsAutoTrackingEnabled(boolean z) {
            this.f5869r = Boolean.valueOf(z);
            return this;
        }

        public Builder withUserProfileID(String str) {
            this.f5867p = str;
            return this;
        }

        private Builder(String str) {
            this.f5866o = new LinkedHashMap();
            this.f5875x = new LinkedHashMap();
            this.f5851C = new HashMap();
            f5848D.a(str);
            this.f5852a = new C1022u5(str);
            this.f5853b = str;
        }
    }

    public /* synthetic */ AppMetricaConfig(Builder builder, int i2) {
        this(builder);
    }

    public static AppMetricaConfig fromJson(String str) {
        Builder a6 = new O3().a(str);
        if (a6 == null) {
            return null;
        }
        return a6.build();
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
        new K7();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("apikey", this.apiKey);
            jSONObject2.put("app_version", this.appVersion);
            jSONObject2.put("session_timeout", this.sessionTimeout);
            jSONObject2.put(InAppMessagePromptTypes.LOCATION_PROMPT_KEY, O3.a(this.location));
            PreloadInfo preloadInfo = this.preloadInfo;
            JSONArray jSONArray = null;
            if (preloadInfo != null) {
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("trackid", preloadInfo.getTrackingId());
                    Map<String, String> additionalParams = preloadInfo.getAdditionalParams();
                    jSONObject3.put(OutcomeEventsTable.COLUMN_NAME_PARAMS, additionalParams == null ? null : new JSONObject(additionalParams));
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
                    if (!AbstractC0860no.a((Collection) list)) {
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
        this.apiKey = builder.f5853b;
        this.appVersion = builder.f5854c;
        this.sessionTimeout = builder.f5855d;
        this.crashReporting = builder.f5856e;
        this.nativeCrashReporting = builder.f5857f;
        this.location = builder.f5858g;
        this.locationTracking = builder.f5859h;
        this.advIdentifiersTracking = builder.f5860i;
        this.logs = builder.f5861j;
        this.preloadInfo = builder.f5862k;
        this.firstActivationAsUpdate = builder.f5863l;
        this.dataSendingEnabled = builder.f5864m;
        this.maxReportsInDatabaseCount = builder.f5865n;
        this.errorEnvironment = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f5866o);
        this.userProfileID = builder.f5867p;
        this.revenueAutoTrackingEnabled = builder.f5868q;
        this.sessionsAutoTrackingEnabled = builder.f5869r;
        this.appOpenTrackingEnabled = builder.f5870s;
        this.deviceType = builder.f5871t;
        this.appBuildNumber = builder.f5872u;
        this.dispatchPeriodSeconds = builder.f5873v;
        this.maxReportsCount = builder.f5874w;
        this.appEnvironment = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f5875x);
        this.crashTransformer = builder.f5876y;
        this.anrMonitoring = builder.z;
        this.anrMonitoringTimeout = builder.f5849A;
        this.customHosts = builder.f5850B;
        this.additionalConfig = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f5851C);
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
