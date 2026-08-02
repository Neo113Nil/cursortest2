package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes.dex */
public interface Sa extends Ta {
    Ia a(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger, C0755l0 c0755l0);

    @Override // io.appmetrica.analytics.impl.Ta
    /* synthetic */ Sa a();

    Ua a(AppMetricaConfig appMetricaConfig);

    void a(ReporterConfig reporterConfig);

    Ia b(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger, C0755l0 c0755l0);

    Ra b(ReporterConfig reporterConfig);
}
