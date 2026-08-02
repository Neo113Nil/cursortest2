package io.appmetrica.analytics.impl;

import android.location.Location;
import io.appmetrica.analytics.AppMetricaConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class D7 implements Hc {

    /* renamed from: a, reason: collision with root package name */
    public Location f10178a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f10179b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f10180c;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f10182e;

    /* renamed from: h, reason: collision with root package name */
    public boolean f10185h;

    /* renamed from: i, reason: collision with root package name */
    public String f10186i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f10188k;

    /* renamed from: l, reason: collision with root package name */
    public C1058wi f10189l;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f10181d = Boolean.FALSE;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f10183f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f10184g = new LinkedHashMap();

    /* renamed from: j, reason: collision with root package name */
    public List<String> f10187j = new ArrayList();

    @Override // io.appmetrica.analytics.impl.Hc
    public final void a(boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        this.f10179b = valueOf;
        C1058wi c1058wi = this.f10189l;
        if (c1058wi != null) {
            c1058wi.a(valueOf, this.f10182e, this.f10180c, this.f10181d);
        }
    }

    @Override // io.appmetrica.analytics.impl.Hc
    public final void clearAppEnvironment() {
        this.f10185h = true;
        this.f10183f.clear();
    }

    public final C0755l0 j() {
        return new C0755l0(this.f10187j, this.f10185h);
    }

    public final Location k() {
        return this.f10178a;
    }

    public final Boolean l() {
        return this.f10180c;
    }

    public final Boolean m() {
        return this.f10182e;
    }

    public final Boolean n() {
        return this.f10179b;
    }

    public final boolean o() {
        return this.f10185h;
    }

    @Override // io.appmetrica.analytics.impl.Hc
    public final void putAppEnvironmentValue(String str, String str2) {
        this.f10183f.put(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.Hc
    public final void setDataSendingEnabled(boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        this.f10182e = valueOf;
        C1058wi c1058wi = this.f10189l;
        if (c1058wi != null) {
            c1058wi.a(this.f10179b, valueOf, this.f10180c, this.f10181d);
        }
    }

    @Override // io.appmetrica.analytics.impl.Hc
    public final void setUserProfileID(String str) {
        this.f10186i = str;
    }

    @Override // io.appmetrica.analytics.impl.Hc
    public final void a(boolean z, boolean z4) {
        boolean z5 = this.f10180c == null;
        boolean booleanValue = this.f10181d.booleanValue();
        if (z4 || z5 || !booleanValue) {
            this.f10180c = Boolean.valueOf(z);
            Boolean valueOf = Boolean.valueOf(z4);
            this.f10181d = valueOf;
            C1058wi c1058wi = this.f10189l;
            if (c1058wi != null) {
                c1058wi.a(this.f10179b, this.f10182e, this.f10180c, valueOf);
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Hc
    public final void a(Location location) {
        this.f10178a = location;
    }

    @Override // io.appmetrica.analytics.impl.Hc
    public final void a(String str, String str2) {
        this.f10184g.put(str, str2);
    }

    public final AppMetricaConfig a(AppMetricaConfig appMetricaConfig) {
        if (this.f10188k) {
            return appMetricaConfig;
        }
        AppMetricaConfig.Builder newConfigBuilder = AppMetricaConfig.newConfigBuilder(appMetricaConfig.apiKey);
        newConfigBuilder.withDeviceType(appMetricaConfig.deviceType);
        newConfigBuilder.withPreloadInfo(appMetricaConfig.preloadInfo);
        newConfigBuilder.withLocation(appMetricaConfig.location);
        if (AbstractC0779lo.a(appMetricaConfig.appVersion)) {
            newConfigBuilder.withAppVersion(appMetricaConfig.appVersion);
        }
        if (AbstractC0779lo.a(appMetricaConfig.dispatchPeriodSeconds)) {
            newConfigBuilder.withDispatchPeriodSeconds(appMetricaConfig.dispatchPeriodSeconds.intValue());
        }
        if (AbstractC0779lo.a(appMetricaConfig.appBuildNumber)) {
            newConfigBuilder.withAppBuildNumber(appMetricaConfig.appBuildNumber.intValue());
        }
        if (AbstractC0779lo.a(appMetricaConfig.maxReportsCount)) {
            newConfigBuilder.withMaxReportsCount(appMetricaConfig.maxReportsCount.intValue());
        }
        if (AbstractC0779lo.a(appMetricaConfig.logs) && appMetricaConfig.logs.booleanValue()) {
            newConfigBuilder.withLogs();
        }
        if (AbstractC0779lo.a(appMetricaConfig.sessionTimeout)) {
            newConfigBuilder.withSessionTimeout(appMetricaConfig.sessionTimeout.intValue());
        }
        if (AbstractC0779lo.a(appMetricaConfig.sessionsAutoTrackingEnabled)) {
            newConfigBuilder.withSessionsAutoTrackingEnabled(appMetricaConfig.sessionsAutoTrackingEnabled.booleanValue());
        }
        if (AbstractC0779lo.a(appMetricaConfig.crashReporting)) {
            newConfigBuilder.withCrashReporting(appMetricaConfig.crashReporting.booleanValue());
        }
        if (AbstractC0779lo.a(appMetricaConfig.nativeCrashReporting)) {
            newConfigBuilder.withNativeCrashReporting(appMetricaConfig.nativeCrashReporting.booleanValue());
        }
        if (AbstractC0779lo.a(appMetricaConfig.locationTracking)) {
            newConfigBuilder.withLocationTracking(appMetricaConfig.locationTracking.booleanValue());
        }
        if (AbstractC0779lo.a(appMetricaConfig.advIdentifiersTracking)) {
            newConfigBuilder.withAdvIdentifiersTracking(appMetricaConfig.advIdentifiersTracking.booleanValue());
        }
        if (AbstractC0779lo.a(appMetricaConfig.firstActivationAsUpdate)) {
            newConfigBuilder.handleFirstActivationAsUpdate(appMetricaConfig.firstActivationAsUpdate.booleanValue());
        }
        if (AbstractC0779lo.a(appMetricaConfig.dataSendingEnabled)) {
            newConfigBuilder.withDataSendingEnabled(appMetricaConfig.dataSendingEnabled.booleanValue());
        }
        if (AbstractC0779lo.a(appMetricaConfig.anrMonitoring)) {
            newConfigBuilder.withAnrMonitoring(appMetricaConfig.anrMonitoring.booleanValue());
        }
        if (AbstractC0779lo.a(appMetricaConfig.anrMonitoringTimeout)) {
            newConfigBuilder.withAnrMonitoringTimeout(appMetricaConfig.anrMonitoringTimeout.intValue());
        }
        if (AbstractC0779lo.a(appMetricaConfig.maxReportsInDatabaseCount)) {
            newConfigBuilder.withMaxReportsInDatabaseCount(appMetricaConfig.maxReportsInDatabaseCount.intValue());
        }
        if (AbstractC0779lo.a(appMetricaConfig.crashTransformer)) {
            newConfigBuilder.withCrashTransformer(appMetricaConfig.crashTransformer);
        }
        if (AbstractC0779lo.a(appMetricaConfig.userProfileID)) {
            newConfigBuilder.withUserProfileID(appMetricaConfig.userProfileID);
        }
        if (AbstractC0779lo.a(appMetricaConfig.revenueAutoTrackingEnabled)) {
            newConfigBuilder.withRevenueAutoTrackingEnabled(appMetricaConfig.revenueAutoTrackingEnabled.booleanValue());
        }
        if (AbstractC0779lo.a(appMetricaConfig.appOpenTrackingEnabled)) {
            newConfigBuilder.withAppOpenTrackingEnabled(appMetricaConfig.appOpenTrackingEnabled.booleanValue());
        }
        if (AbstractC0779lo.a((Object) appMetricaConfig.customHosts)) {
            newConfigBuilder.withCustomHosts(appMetricaConfig.customHosts);
        }
        LinkedHashMap linkedHashMap = this.f10183f;
        if (!AbstractC0779lo.a((Map) linkedHashMap)) {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                newConfigBuilder.withAppEnvironmentValue((String) entry.getKey(), (String) entry.getValue());
            }
        }
        Map<String, String> map = appMetricaConfig.appEnvironment;
        if (!AbstractC0779lo.a((Map) map)) {
            for (Map.Entry<String, String> entry2 : map.entrySet()) {
                newConfigBuilder.withAppEnvironmentValue(entry2.getKey(), entry2.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = this.f10184g;
        if (!AbstractC0779lo.a((Map) linkedHashMap2)) {
            for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                newConfigBuilder.withErrorEnvironmentValue((String) entry3.getKey(), (String) entry3.getValue());
            }
        }
        Map<String, String> map2 = appMetricaConfig.errorEnvironment;
        if (!AbstractC0779lo.a((Map) map2)) {
            for (Map.Entry<String, String> entry4 : map2.entrySet()) {
                newConfigBuilder.withErrorEnvironmentValue(entry4.getKey(), entry4.getValue());
            }
        }
        Map<String, Object> map3 = appMetricaConfig.additionalConfig;
        if (!AbstractC0779lo.a((Map) map3)) {
            for (Map.Entry<String, Object> entry5 : map3.entrySet()) {
                newConfigBuilder.withAdditionalConfig(entry5.getKey(), entry5.getValue());
            }
        }
        Boolean bool = this.f10179b;
        if (appMetricaConfig.locationTracking == null && AbstractC0779lo.a(bool)) {
            newConfigBuilder.withLocationTracking(bool.booleanValue());
        }
        Location location = this.f10178a;
        if (appMetricaConfig.location == null && AbstractC0779lo.a(location)) {
            newConfigBuilder.withLocation(location);
        }
        Boolean bool2 = this.f10182e;
        if (appMetricaConfig.dataSendingEnabled == null && AbstractC0779lo.a(bool2)) {
            newConfigBuilder.withDataSendingEnabled(bool2.booleanValue());
        }
        if (!AbstractC0779lo.a(appMetricaConfig.userProfileID) && AbstractC0779lo.a(this.f10186i)) {
            newConfigBuilder.withUserProfileID(this.f10186i);
        }
        Boolean bool3 = this.f10180c;
        if (appMetricaConfig.advIdentifiersTracking == null && AbstractC0779lo.a(bool3)) {
            newConfigBuilder.withAdvIdentifiersTracking(bool3.booleanValue());
        }
        this.f10188k = true;
        this.f10178a = null;
        this.f10179b = null;
        this.f10180c = null;
        this.f10181d = Boolean.FALSE;
        this.f10182e = null;
        this.f10183f.clear();
        this.f10184g.clear();
        this.f10185h = false;
        this.f10186i = null;
        return newConfigBuilder.build();
    }

    @Override // io.appmetrica.analytics.impl.Hc
    public final void a(String str) {
        this.f10187j.add(str);
    }

    public final void a(C1058wi c1058wi) {
        Boolean bool = this.f10179b;
        if (bool != null || this.f10182e != null || this.f10180c != null) {
            c1058wi.a(bool, this.f10182e, this.f10180c, this.f10181d);
        }
        this.f10189l = c1058wi;
    }
}
