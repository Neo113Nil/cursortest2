package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* renamed from: io.appmetrica.analytics.impl.m6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0787m6 {

    /* renamed from: a, reason: collision with root package name */
    public final C1058wi f12326a;

    /* renamed from: b, reason: collision with root package name */
    public final Fh f12327b;

    public C0787m6(Bf bf, D8 d8, C1058wi c1058wi, AppMetricaConfig appMetricaConfig) {
        this.f12326a = c1058wi;
        this.f12327b = new Fh(bf, new CounterConfiguration(appMetricaConfig, CounterConfigurationReporterType.CRASH), d8, appMetricaConfig.userProfileID);
    }

    public final Fh a() {
        return this.f12327b;
    }
}
