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
    public Location f6263a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f6264b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f6265c;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f6267e;

    /* renamed from: h, reason: collision with root package name */
    public boolean f6269h;

    /* renamed from: i, reason: collision with root package name */
    public String f6270i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f6272k;

    /* renamed from: l, reason: collision with root package name */
    public Bi f6273l;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f6266d = Boolean.FALSE;
    public final LinkedHashMap f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f6268g = new LinkedHashMap();

    /* renamed from: j, reason: collision with root package name */
    public List<String> f6271j = new ArrayList();

    @Override // io.appmetrica.analytics.impl.Oc
    public final void a(boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        this.f6264b = valueOf;
        Bi bi = this.f6273l;
        if (bi != null) {
            bi.a(valueOf, this.f6267e, this.f6265c, this.f6266d);
        }
    }

    @Override // io.appmetrica.analytics.impl.Oc
    public final void clearAppEnvironment() {
        this.f6269h = true;
        this.f.clear();
    }

    public final C0633l0 j() {
        return new C0633l0(this.f6271j, this.f6269h);
    }

    public final Location k() {
        return this.f6263a;
    }

    public final Boolean l() {
        return this.f6265c;
    }

    public final Boolean m() {
        return this.f6267e;
    }

    public final Boolean n() {
        return this.f6264b;
    }

    public final boolean o() {
        return this.f6269h;
    }

    @Override // io.appmetrica.analytics.impl.Oc
    public final void putAppEnvironmentValue(String str, String str2) {
        this.f.put(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.Oc
    public final void setDataSendingEnabled(boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        this.f6267e = valueOf;
        Bi bi = this.f6273l;
        if (bi != null) {
            bi.a(this.f6264b, valueOf, this.f6265c, this.f6266d);
        }
    }

    @Override // io.appmetrica.analytics.impl.Oc
    public final void setUserProfileID(String str) {
        this.f6270i = str;
    }

    @Override // io.appmetrica.analytics.impl.Oc
    public final void a(boolean z, boolean z2) {
        boolean z3 = this.f6265c == null;
        boolean booleanValue = this.f6266d.booleanValue();
        if (z2 || z3 || !booleanValue) {
            this.f6265c = Boolean.valueOf(z);
            Boolean valueOf = Boolean.valueOf(z2);
            this.f6266d = valueOf;
            Bi bi = this.f6273l;
            if (bi != null) {
                bi.a(this.f6264b, this.f6267e, this.f6265c, valueOf);
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Oc
    public final void a(Location location) {
        this.f6263a = location;
    }

    @Override // io.appmetrica.analytics.impl.Oc
    public final void a(String str, String str2) {
        this.f6268g.put(str, str2);
    }

    public final AppMetricaConfig a(AppMetricaConfig appMetricaConfig) {
        if (this.f6272k) {
            return appMetricaConfig;
        }
        AppMetricaConfig.Builder newConfigBuilder = AppMetricaConfig.newConfigBuilder(appMetricaConfig.apiKey);
        newConfigBuilder.withDeviceType(appMetricaConfig.deviceType);
        newConfigBuilder.withPreloadInfo(appMetricaConfig.preloadInfo);
        newConfigBuilder.withLocation(appMetricaConfig.location);
        if (AbstractC0709no.a(appMetricaConfig.appVersion)) {
            newConfigBuilder.withAppVersion(appMetricaConfig.appVersion);
        }
        if (AbstractC0709no.a(appMetricaConfig.dispatchPeriodSeconds)) {
            newConfigBuilder.withDispatchPeriodSeconds(appMetricaConfig.dispatchPeriodSeconds.intValue());
        }
        if (AbstractC0709no.a(appMetricaConfig.appBuildNumber)) {
            newConfigBuilder.withAppBuildNumber(appMetricaConfig.appBuildNumber.intValue());
        }
        if (AbstractC0709no.a(appMetricaConfig.maxReportsCount)) {
            newConfigBuilder.withMaxReportsCount(appMetricaConfig.maxReportsCount.intValue());
        }
        if (AbstractC0709no.a(appMetricaConfig.logs) && appMetricaConfig.logs.booleanValue()) {
            newConfigBuilder.withLogs();
        }
        if (AbstractC0709no.a(appMetricaConfig.sessionTimeout)) {
            newConfigBuilder.withSessionTimeout(appMetricaConfig.sessionTimeout.intValue());
        }
        if (AbstractC0709no.a(appMetricaConfig.sessionsAutoTrackingEnabled)) {
            newConfigBuilder.withSessionsAutoTrackingEnabled(appMetricaConfig.sessionsAutoTrackingEnabled.booleanValue());
        }
        if (AbstractC0709no.a(appMetricaConfig.crashReporting)) {
            newConfigBuilder.withCrashReporting(appMetricaConfig.crashReporting.booleanValue());
        }
        if (AbstractC0709no.a(appMetricaConfig.nativeCrashReporting)) {
            newConfigBuilder.withNativeCrashReporting(appMetricaConfig.nativeCrashReporting.booleanValue());
        }
        if (AbstractC0709no.a(appMetricaConfig.locationTracking)) {
            newConfigBuilder.withLocationTracking(appMetricaConfig.locationTracking.booleanValue());
        }
        if (AbstractC0709no.a(appMetricaConfig.advIdentifiersTracking)) {
            newConfigBuilder.withAdvIdentifiersTracking(appMetricaConfig.advIdentifiersTracking.booleanValue());
        }
        if (AbstractC0709no.a(appMetricaConfig.firstActivationAsUpdate)) {
            newConfigBuilder.handleFirstActivationAsUpdate(appMetricaConfig.firstActivationAsUpdate.booleanValue());
        }
        if (AbstractC0709no.a(appMetricaConfig.dataSendingEnabled)) {
            newConfigBuilder.withDataSendingEnabled(appMetricaConfig.dataSendingEnabled.booleanValue());
        }
        if (AbstractC0709no.a(appMetricaConfig.anrMonitoring)) {
            newConfigBuilder.withAnrMonitoring(appMetricaConfig.anrMonitoring.booleanValue());
        }
        if (AbstractC0709no.a(appMetricaConfig.anrMonitoringTimeout)) {
            newConfigBuilder.withAnrMonitoringTimeout(appMetricaConfig.anrMonitoringTimeout.intValue());
        }
        if (AbstractC0709no.a(appMetricaConfig.maxReportsInDatabaseCount)) {
            newConfigBuilder.withMaxReportsInDatabaseCount(appMetricaConfig.maxReportsInDatabaseCount.intValue());
        }
        if (AbstractC0709no.a(appMetricaConfig.crashTransformer)) {
            newConfigBuilder.withCrashTransformer(appMetricaConfig.crashTransformer);
        }
        if (AbstractC0709no.a(appMetricaConfig.userProfileID)) {
            newConfigBuilder.withUserProfileID(appMetricaConfig.userProfileID);
        }
        if (AbstractC0709no.a(appMetricaConfig.revenueAutoTrackingEnabled)) {
            newConfigBuilder.withRevenueAutoTrackingEnabled(appMetricaConfig.revenueAutoTrackingEnabled.booleanValue());
        }
        if (AbstractC0709no.a(appMetricaConfig.appOpenTrackingEnabled)) {
            newConfigBuilder.withAppOpenTrackingEnabled(appMetricaConfig.appOpenTrackingEnabled.booleanValue());
        }
        if (AbstractC0709no.a((Object) appMetricaConfig.customHosts)) {
            newConfigBuilder.withCustomHosts(appMetricaConfig.customHosts);
        }
        LinkedHashMap linkedHashMap = this.f;
        if (!AbstractC0709no.a((Map) linkedHashMap)) {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                newConfigBuilder.withAppEnvironmentValue((String) entry.getKey(), (String) entry.getValue());
            }
        }
        Map<String, String> map = appMetricaConfig.appEnvironment;
        if (!AbstractC0709no.a((Map) map)) {
            for (Map.Entry<String, String> entry2 : map.entrySet()) {
                newConfigBuilder.withAppEnvironmentValue(entry2.getKey(), entry2.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = this.f6268g;
        if (!AbstractC0709no.a((Map) linkedHashMap2)) {
            for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                newConfigBuilder.withErrorEnvironmentValue((String) entry3.getKey(), (String) entry3.getValue());
            }
        }
        Map<String, String> map2 = appMetricaConfig.errorEnvironment;
        if (!AbstractC0709no.a((Map) map2)) {
            for (Map.Entry<String, String> entry4 : map2.entrySet()) {
                newConfigBuilder.withErrorEnvironmentValue(entry4.getKey(), entry4.getValue());
            }
        }
        Map<String, Object> map3 = appMetricaConfig.additionalConfig;
        if (!AbstractC0709no.a((Map) map3)) {
            for (Map.Entry<String, Object> entry5 : map3.entrySet()) {
                newConfigBuilder.withAdditionalConfig(entry5.getKey(), entry5.getValue());
            }
        }
        Boolean bool = this.f6264b;
        if (appMetricaConfig.locationTracking == null && AbstractC0709no.a(bool)) {
            newConfigBuilder.withLocationTracking(bool.booleanValue());
        }
        Location location = this.f6263a;
        if (appMetricaConfig.location == null && AbstractC0709no.a(location)) {
            newConfigBuilder.withLocation(location);
        }
        Boolean bool2 = this.f6267e;
        if (appMetricaConfig.dataSendingEnabled == null && AbstractC0709no.a(bool2)) {
            newConfigBuilder.withDataSendingEnabled(bool2.booleanValue());
        }
        if (!AbstractC0709no.a(appMetricaConfig.userProfileID) && AbstractC0709no.a(this.f6270i)) {
            newConfigBuilder.withUserProfileID(this.f6270i);
        }
        Boolean bool3 = this.f6265c;
        if (appMetricaConfig.advIdentifiersTracking == null && AbstractC0709no.a(bool3)) {
            newConfigBuilder.withAdvIdentifiersTracking(bool3.booleanValue());
        }
        this.f6272k = true;
        this.f6263a = null;
        this.f6264b = null;
        this.f6265c = null;
        this.f6266d = Boolean.FALSE;
        this.f6267e = null;
        this.f.clear();
        this.f6268g.clear();
        this.f6269h = false;
        this.f6270i = null;
        return newConfigBuilder.build();
    }

    @Override // io.appmetrica.analytics.impl.Oc
    public final void a(String str) {
        this.f6271j.add(str);
    }

    public final void a(Bi bi) {
        Boolean bool = this.f6264b;
        if (bool != null || this.f6267e != null || this.f6265c != null) {
            bi.a(bool, this.f6267e, this.f6265c, this.f6266d);
        }
        this.f6273l = bi;
    }
}
