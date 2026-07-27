package io.appmetrica.analytics.impl;

import android.location.Location;
import io.appmetrica.analytics.AppMetricaConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class L7 implements Oc {

    /* renamed from: a, reason: collision with root package name */
    public Location f7068a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f7069b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f7070c;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f7072e;

    /* renamed from: h, reason: collision with root package name */
    public boolean f7075h;

    /* renamed from: i, reason: collision with root package name */
    public String f7076i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f7078k;

    /* renamed from: l, reason: collision with root package name */
    public Bi f7079l;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f7071d = Boolean.FALSE;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f7073f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f7074g = new LinkedHashMap();

    /* renamed from: j, reason: collision with root package name */
    public List<String> f7077j = new ArrayList();

    @Override // io.appmetrica.analytics.impl.Oc
    public final void a(boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        this.f7069b = valueOf;
        Bi bi = this.f7079l;
        if (bi != null) {
            bi.a(valueOf, this.f7072e, this.f7070c, this.f7071d);
        }
    }

    @Override // io.appmetrica.analytics.impl.Oc
    public final void clearAppEnvironment() {
        this.f7075h = true;
        this.f7073f.clear();
    }

    public final C0784l0 j() {
        return new C0784l0(this.f7077j, this.f7075h);
    }

    public final Location k() {
        return this.f7068a;
    }

    public final Boolean l() {
        return this.f7070c;
    }

    public final Boolean m() {
        return this.f7072e;
    }

    public final Boolean n() {
        return this.f7069b;
    }

    public final boolean o() {
        return this.f7075h;
    }

    @Override // io.appmetrica.analytics.impl.Oc
    public final void putAppEnvironmentValue(String str, String str2) {
        this.f7073f.put(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.Oc
    public final void setDataSendingEnabled(boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        this.f7072e = valueOf;
        Bi bi = this.f7079l;
        if (bi != null) {
            bi.a(this.f7069b, valueOf, this.f7070c, this.f7071d);
        }
    }

    @Override // io.appmetrica.analytics.impl.Oc
    public final void setUserProfileID(String str) {
        this.f7076i = str;
    }

    @Override // io.appmetrica.analytics.impl.Oc
    public final void a(boolean z, boolean z5) {
        boolean z6 = this.f7070c == null;
        boolean booleanValue = this.f7071d.booleanValue();
        if (z5 || z6 || !booleanValue) {
            this.f7070c = Boolean.valueOf(z);
            Boolean valueOf = Boolean.valueOf(z5);
            this.f7071d = valueOf;
            Bi bi = this.f7079l;
            if (bi != null) {
                bi.a(this.f7069b, this.f7072e, this.f7070c, valueOf);
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Oc
    public final void a(Location location) {
        this.f7068a = location;
    }

    @Override // io.appmetrica.analytics.impl.Oc
    public final void a(String str, String str2) {
        this.f7074g.put(str, str2);
    }

    public final AppMetricaConfig a(AppMetricaConfig appMetricaConfig) {
        if (this.f7078k) {
            return appMetricaConfig;
        }
        AppMetricaConfig.Builder newConfigBuilder = AppMetricaConfig.newConfigBuilder(appMetricaConfig.apiKey);
        newConfigBuilder.withDeviceType(appMetricaConfig.deviceType);
        newConfigBuilder.withPreloadInfo(appMetricaConfig.preloadInfo);
        newConfigBuilder.withLocation(appMetricaConfig.location);
        if (AbstractC0860no.a(appMetricaConfig.appVersion)) {
            newConfigBuilder.withAppVersion(appMetricaConfig.appVersion);
        }
        if (AbstractC0860no.a(appMetricaConfig.dispatchPeriodSeconds)) {
            newConfigBuilder.withDispatchPeriodSeconds(appMetricaConfig.dispatchPeriodSeconds.intValue());
        }
        if (AbstractC0860no.a(appMetricaConfig.appBuildNumber)) {
            newConfigBuilder.withAppBuildNumber(appMetricaConfig.appBuildNumber.intValue());
        }
        if (AbstractC0860no.a(appMetricaConfig.maxReportsCount)) {
            newConfigBuilder.withMaxReportsCount(appMetricaConfig.maxReportsCount.intValue());
        }
        if (AbstractC0860no.a(appMetricaConfig.logs) && appMetricaConfig.logs.booleanValue()) {
            newConfigBuilder.withLogs();
        }
        if (AbstractC0860no.a(appMetricaConfig.sessionTimeout)) {
            newConfigBuilder.withSessionTimeout(appMetricaConfig.sessionTimeout.intValue());
        }
        if (AbstractC0860no.a(appMetricaConfig.sessionsAutoTrackingEnabled)) {
            newConfigBuilder.withSessionsAutoTrackingEnabled(appMetricaConfig.sessionsAutoTrackingEnabled.booleanValue());
        }
        if (AbstractC0860no.a(appMetricaConfig.crashReporting)) {
            newConfigBuilder.withCrashReporting(appMetricaConfig.crashReporting.booleanValue());
        }
        if (AbstractC0860no.a(appMetricaConfig.nativeCrashReporting)) {
            newConfigBuilder.withNativeCrashReporting(appMetricaConfig.nativeCrashReporting.booleanValue());
        }
        if (AbstractC0860no.a(appMetricaConfig.locationTracking)) {
            newConfigBuilder.withLocationTracking(appMetricaConfig.locationTracking.booleanValue());
        }
        if (AbstractC0860no.a(appMetricaConfig.advIdentifiersTracking)) {
            newConfigBuilder.withAdvIdentifiersTracking(appMetricaConfig.advIdentifiersTracking.booleanValue());
        }
        if (AbstractC0860no.a(appMetricaConfig.firstActivationAsUpdate)) {
            newConfigBuilder.handleFirstActivationAsUpdate(appMetricaConfig.firstActivationAsUpdate.booleanValue());
        }
        if (AbstractC0860no.a(appMetricaConfig.dataSendingEnabled)) {
            newConfigBuilder.withDataSendingEnabled(appMetricaConfig.dataSendingEnabled.booleanValue());
        }
        if (AbstractC0860no.a(appMetricaConfig.anrMonitoring)) {
            newConfigBuilder.withAnrMonitoring(appMetricaConfig.anrMonitoring.booleanValue());
        }
        if (AbstractC0860no.a(appMetricaConfig.anrMonitoringTimeout)) {
            newConfigBuilder.withAnrMonitoringTimeout(appMetricaConfig.anrMonitoringTimeout.intValue());
        }
        if (AbstractC0860no.a(appMetricaConfig.maxReportsInDatabaseCount)) {
            newConfigBuilder.withMaxReportsInDatabaseCount(appMetricaConfig.maxReportsInDatabaseCount.intValue());
        }
        if (AbstractC0860no.a(appMetricaConfig.crashTransformer)) {
            newConfigBuilder.withCrashTransformer(appMetricaConfig.crashTransformer);
        }
        if (AbstractC0860no.a(appMetricaConfig.userProfileID)) {
            newConfigBuilder.withUserProfileID(appMetricaConfig.userProfileID);
        }
        if (AbstractC0860no.a(appMetricaConfig.revenueAutoTrackingEnabled)) {
            newConfigBuilder.withRevenueAutoTrackingEnabled(appMetricaConfig.revenueAutoTrackingEnabled.booleanValue());
        }
        if (AbstractC0860no.a(appMetricaConfig.appOpenTrackingEnabled)) {
            newConfigBuilder.withAppOpenTrackingEnabled(appMetricaConfig.appOpenTrackingEnabled.booleanValue());
        }
        if (AbstractC0860no.a((Object) appMetricaConfig.customHosts)) {
            newConfigBuilder.withCustomHosts(appMetricaConfig.customHosts);
        }
        LinkedHashMap linkedHashMap = this.f7073f;
        if (!AbstractC0860no.a((Map) linkedHashMap)) {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                newConfigBuilder.withAppEnvironmentValue((String) entry.getKey(), (String) entry.getValue());
            }
        }
        Map<String, String> map = appMetricaConfig.appEnvironment;
        if (!AbstractC0860no.a((Map) map)) {
            for (Map.Entry<String, String> entry2 : map.entrySet()) {
                newConfigBuilder.withAppEnvironmentValue(entry2.getKey(), entry2.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = this.f7074g;
        if (!AbstractC0860no.a((Map) linkedHashMap2)) {
            for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                newConfigBuilder.withErrorEnvironmentValue((String) entry3.getKey(), (String) entry3.getValue());
            }
        }
        Map<String, String> map2 = appMetricaConfig.errorEnvironment;
        if (!AbstractC0860no.a((Map) map2)) {
            for (Map.Entry<String, String> entry4 : map2.entrySet()) {
                newConfigBuilder.withErrorEnvironmentValue(entry4.getKey(), entry4.getValue());
            }
        }
        Map<String, Object> map3 = appMetricaConfig.additionalConfig;
        if (!AbstractC0860no.a((Map) map3)) {
            for (Map.Entry<String, Object> entry5 : map3.entrySet()) {
                newConfigBuilder.withAdditionalConfig(entry5.getKey(), entry5.getValue());
            }
        }
        Boolean bool = this.f7069b;
        if (appMetricaConfig.locationTracking == null && AbstractC0860no.a(bool)) {
            newConfigBuilder.withLocationTracking(bool.booleanValue());
        }
        Location location = this.f7068a;
        if (appMetricaConfig.location == null && AbstractC0860no.a(location)) {
            newConfigBuilder.withLocation(location);
        }
        Boolean bool2 = this.f7072e;
        if (appMetricaConfig.dataSendingEnabled == null && AbstractC0860no.a(bool2)) {
            newConfigBuilder.withDataSendingEnabled(bool2.booleanValue());
        }
        if (!AbstractC0860no.a(appMetricaConfig.userProfileID) && AbstractC0860no.a(this.f7076i)) {
            newConfigBuilder.withUserProfileID(this.f7076i);
        }
        Boolean bool3 = this.f7070c;
        if (appMetricaConfig.advIdentifiersTracking == null && AbstractC0860no.a(bool3)) {
            newConfigBuilder.withAdvIdentifiersTracking(bool3.booleanValue());
        }
        this.f7078k = true;
        this.f7068a = null;
        this.f7069b = null;
        this.f7070c = null;
        this.f7071d = Boolean.FALSE;
        this.f7072e = null;
        this.f7073f.clear();
        this.f7074g.clear();
        this.f7075h = false;
        this.f7076i = null;
        return newConfigBuilder.build();
    }

    @Override // io.appmetrica.analytics.impl.Oc
    public final void a(String str) {
        this.f7077j.add(str);
    }

    public final void a(Bi bi) {
        Boolean bool = this.f7069b;
        if (bool != null || this.f7072e != null || this.f7070c != null) {
            bi.a(bool, this.f7072e, this.f7070c, this.f7071d);
        }
        this.f7079l = bi;
    }
}
