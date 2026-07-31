package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* loaded from: classes3.dex */
public final class I6 {

    /* renamed from: a, reason: collision with root package name */
    public final Ji f37705a;

    /* renamed from: b, reason: collision with root package name */
    public final Sh f37706b;

    public I6(Pf pf, W8 w8, Ji ji, AppMetricaConfig appMetricaConfig) {
        this.f37705a = ji;
        this.f37706b = new Sh(pf, new CounterConfiguration(appMetricaConfig, CounterConfigurationReporterType.CRASH), w8, appMetricaConfig.userProfileID);
    }

    public final Sh a() {
        return this.f37706b;
    }
}
