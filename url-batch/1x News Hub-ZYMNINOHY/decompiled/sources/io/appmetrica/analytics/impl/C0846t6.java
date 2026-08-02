package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* renamed from: io.appmetrica.analytics.impl.t6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0846t6 {

    /* renamed from: a, reason: collision with root package name */
    public final Bi f8338a;

    /* renamed from: b, reason: collision with root package name */
    public final Kh f8339b;

    public C0846t6(Gf gf, I8 i8, Bi bi, AppMetricaConfig appMetricaConfig) {
        this.f8338a = bi;
        this.f8339b = new Kh(gf, new CounterConfiguration(appMetricaConfig, CounterConfigurationReporterType.CRASH), i8, appMetricaConfig.userProfileID);
    }

    public final Kh a() {
        return this.f8339b;
    }
}
