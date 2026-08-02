package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.pi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0755pi implements Za {
    @Override // io.appmetrica.analytics.impl.Za, io.appmetrica.analytics.impl.InterfaceC0360ab
    public final Za a() {
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Za
    public final Pa b(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger, C0633l0 c0633l0) {
        return new Ec();
    }

    @Override // io.appmetrica.analytics.impl.Za
    public final void a(ReporterConfig reporterConfig) {
    }

    @Override // io.appmetrica.analytics.impl.Za
    public final Ya b(ReporterConfig reporterConfig) {
        return new C0677mi();
    }

    @Override // io.appmetrica.analytics.impl.Za
    public final Pa a(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger, C0633l0 c0633l0) {
        return new Ec();
    }

    @Override // io.appmetrica.analytics.impl.Za
    public final InterfaceC0386bb a(AppMetricaConfig appMetricaConfig) {
        return new C0677mi();
    }
}
