package io.appmetrica.analytics.impl;

import android.location.Location;
import io.appmetrica.analytics.AppMetricaConfig;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class Z7 implements InterfaceC2544cd {

    /* renamed from: a, reason: collision with root package name */
    public Location f38603a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f38604b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f38605c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f38606d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f38607e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f38608f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public boolean f38609g;

    /* renamed from: h, reason: collision with root package name */
    public String f38610h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f38611i;

    /* renamed from: j, reason: collision with root package name */
    public Ji f38612j;

    @Override // io.appmetrica.analytics.impl.InterfaceC2544cd
    public final void a(boolean z4) {
        Boolean valueOf = Boolean.valueOf(z4);
        this.f38604b = valueOf;
        Ji ji = this.f38612j;
        if (ji != null) {
            ji.a(valueOf, this.f38606d, this.f38605c);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2544cd
    public final void b(boolean z4) {
        Boolean valueOf = Boolean.valueOf(z4);
        this.f38605c = valueOf;
        Ji ji = this.f38612j;
        if (ji != null) {
            ji.a(this.f38604b, this.f38606d, valueOf);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2544cd
    public final void clearAppEnvironment() {
        this.f38609g = true;
        this.f38607e.clear();
    }

    public final Location j() {
        return this.f38603a;
    }

    public final Boolean k() {
        return this.f38605c;
    }

    public final Boolean l() {
        return this.f38606d;
    }

    public final Boolean m() {
        return this.f38604b;
    }

    public final boolean n() {
        return this.f38609g;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2544cd
    public final void putAppEnvironmentValue(String str, String str2) {
        this.f38607e.put(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2544cd
    public final void setDataSendingEnabled(boolean z4) {
        Boolean valueOf = Boolean.valueOf(z4);
        this.f38606d = valueOf;
        Ji ji = this.f38612j;
        if (ji != null) {
            ji.a(this.f38604b, valueOf, this.f38605c);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2544cd
    public final void setUserProfileID(String str) {
        this.f38610h = str;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2544cd
    public final void a(Location location) {
        this.f38603a = location;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2544cd
    public final void a(String str, String str2) {
        this.f38608f.put(str, str2);
    }

    public final AppMetricaConfig a(AppMetricaConfig appMetricaConfig) {
        if (this.f38611i) {
            return appMetricaConfig;
        }
        AppMetricaConfig.Builder newConfigBuilder = AppMetricaConfig.newConfigBuilder(appMetricaConfig.apiKey);
        newConfigBuilder.withDeviceType(appMetricaConfig.deviceType);
        newConfigBuilder.withPreloadInfo(appMetricaConfig.preloadInfo);
        newConfigBuilder.withLocation(appMetricaConfig.location);
        if (AbstractC2713io.a(appMetricaConfig.appVersion)) {
            newConfigBuilder.withAppVersion(appMetricaConfig.appVersion);
        }
        if (AbstractC2713io.a(appMetricaConfig.dispatchPeriodSeconds)) {
            newConfigBuilder.withDispatchPeriodSeconds(appMetricaConfig.dispatchPeriodSeconds.intValue());
        }
        if (AbstractC2713io.a(appMetricaConfig.appBuildNumber)) {
            newConfigBuilder.withAppBuildNumber(appMetricaConfig.appBuildNumber.intValue());
        }
        if (AbstractC2713io.a(appMetricaConfig.maxReportsCount)) {
            newConfigBuilder.withMaxReportsCount(appMetricaConfig.maxReportsCount.intValue());
        }
        if (AbstractC2713io.a(appMetricaConfig.logs) && appMetricaConfig.logs.booleanValue()) {
            newConfigBuilder.withLogs();
        }
        if (AbstractC2713io.a(appMetricaConfig.sessionTimeout)) {
            newConfigBuilder.withSessionTimeout(appMetricaConfig.sessionTimeout.intValue());
        }
        if (AbstractC2713io.a(appMetricaConfig.sessionsAutoTrackingEnabled)) {
            newConfigBuilder.withSessionsAutoTrackingEnabled(appMetricaConfig.sessionsAutoTrackingEnabled.booleanValue());
        }
        if (AbstractC2713io.a(appMetricaConfig.crashReporting)) {
            newConfigBuilder.withCrashReporting(appMetricaConfig.crashReporting.booleanValue());
        }
        if (AbstractC2713io.a(appMetricaConfig.nativeCrashReporting)) {
            newConfigBuilder.withNativeCrashReporting(appMetricaConfig.nativeCrashReporting.booleanValue());
        }
        if (AbstractC2713io.a(appMetricaConfig.locationTracking)) {
            newConfigBuilder.withLocationTracking(appMetricaConfig.locationTracking.booleanValue());
        }
        if (AbstractC2713io.a(appMetricaConfig.advIdentifiersTracking)) {
            newConfigBuilder.withAdvIdentifiersTracking(appMetricaConfig.advIdentifiersTracking.booleanValue());
        }
        if (AbstractC2713io.a(appMetricaConfig.firstActivationAsUpdate)) {
            newConfigBuilder.handleFirstActivationAsUpdate(appMetricaConfig.firstActivationAsUpdate.booleanValue());
        }
        if (AbstractC2713io.a(appMetricaConfig.dataSendingEnabled)) {
            newConfigBuilder.withDataSendingEnabled(appMetricaConfig.dataSendingEnabled.booleanValue());
        }
        if (AbstractC2713io.a(appMetricaConfig.anrMonitoring)) {
            newConfigBuilder.withAnrMonitoring(appMetricaConfig.anrMonitoring.booleanValue());
        }
        if (AbstractC2713io.a(appMetricaConfig.anrMonitoringTimeout)) {
            newConfigBuilder.withAnrMonitoringTimeout(appMetricaConfig.anrMonitoringTimeout.intValue());
        }
        if (AbstractC2713io.a(appMetricaConfig.maxReportsInDatabaseCount)) {
            newConfigBuilder.withMaxReportsInDatabaseCount(appMetricaConfig.maxReportsInDatabaseCount.intValue());
        }
        if (AbstractC2713io.a(appMetricaConfig.crashTransformer)) {
            newConfigBuilder.withCrashTransformer(appMetricaConfig.crashTransformer);
        }
        if (AbstractC2713io.a(appMetricaConfig.userProfileID)) {
            newConfigBuilder.withUserProfileID(appMetricaConfig.userProfileID);
        }
        if (AbstractC2713io.a(appMetricaConfig.revenueAutoTrackingEnabled)) {
            newConfigBuilder.withRevenueAutoTrackingEnabled(appMetricaConfig.revenueAutoTrackingEnabled.booleanValue());
        }
        if (AbstractC2713io.a(appMetricaConfig.appOpenTrackingEnabled)) {
            newConfigBuilder.withAppOpenTrackingEnabled(appMetricaConfig.appOpenTrackingEnabled.booleanValue());
        }
        if (AbstractC2713io.a((Object) appMetricaConfig.customHosts)) {
            newConfigBuilder.withCustomHosts(appMetricaConfig.customHosts);
        }
        LinkedHashMap linkedHashMap = this.f38607e;
        if (!AbstractC2713io.a((Map) linkedHashMap)) {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                newConfigBuilder.withAppEnvironmentValue((String) entry.getKey(), (String) entry.getValue());
            }
        }
        Map<String, String> map = appMetricaConfig.appEnvironment;
        if (!AbstractC2713io.a((Map) map)) {
            for (Map.Entry<String, String> entry2 : map.entrySet()) {
                newConfigBuilder.withAppEnvironmentValue(entry2.getKey(), entry2.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = this.f38608f;
        if (!AbstractC2713io.a((Map) linkedHashMap2)) {
            for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                newConfigBuilder.withErrorEnvironmentValue((String) entry3.getKey(), (String) entry3.getValue());
            }
        }
        Map<String, String> map2 = appMetricaConfig.errorEnvironment;
        if (!AbstractC2713io.a((Map) map2)) {
            for (Map.Entry<String, String> entry4 : map2.entrySet()) {
                newConfigBuilder.withErrorEnvironmentValue(entry4.getKey(), entry4.getValue());
            }
        }
        Map<String, Object> map3 = appMetricaConfig.additionalConfig;
        if (!AbstractC2713io.a((Map) map3)) {
            for (Map.Entry<String, Object> entry5 : map3.entrySet()) {
                newConfigBuilder.withAdditionalConfig(entry5.getKey(), entry5.getValue());
            }
        }
        Boolean bool = this.f38604b;
        if (appMetricaConfig.locationTracking == null && AbstractC2713io.a(bool)) {
            newConfigBuilder.withLocationTracking(bool.booleanValue());
        }
        Location location = this.f38603a;
        if (appMetricaConfig.location == null && AbstractC2713io.a(location)) {
            newConfigBuilder.withLocation(location);
        }
        Boolean bool2 = this.f38606d;
        if (appMetricaConfig.dataSendingEnabled == null && AbstractC2713io.a(bool2)) {
            newConfigBuilder.withDataSendingEnabled(bool2.booleanValue());
        }
        if (!AbstractC2713io.a(appMetricaConfig.userProfileID) && AbstractC2713io.a(this.f38610h)) {
            newConfigBuilder.withUserProfileID(this.f38610h);
        }
        Boolean bool3 = this.f38605c;
        if (appMetricaConfig.advIdentifiersTracking == null && AbstractC2713io.a(bool3)) {
            newConfigBuilder.withAdvIdentifiersTracking(bool3.booleanValue());
        }
        this.f38611i = true;
        this.f38603a = null;
        this.f38604b = null;
        this.f38605c = null;
        this.f38606d = null;
        this.f38607e.clear();
        this.f38608f.clear();
        this.f38609g = false;
        this.f38610h = null;
        return newConfigBuilder.build();
    }

    public final void a(Ji ji) {
        Boolean bool = this.f38604b;
        if (bool != null || this.f38606d != null || this.f38605c != null) {
            ji.a(bool, this.f38606d, this.f38605c);
        }
        this.f38612j = ji;
    }
}
