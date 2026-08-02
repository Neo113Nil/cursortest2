package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes.dex */
public interface Za extends InterfaceC0360ab {
    Pa a(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger, C0633l0 c0633l0);

    @Override // io.appmetrica.analytics.impl.InterfaceC0360ab
    /* synthetic */ Za a();

    InterfaceC0386bb a(AppMetricaConfig appMetricaConfig);

    void a(ReporterConfig reporterConfig);

    Pa b(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger, C0633l0 c0633l0);

    Ya b(ReporterConfig reporterConfig);
}
