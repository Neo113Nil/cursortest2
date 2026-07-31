package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.nb, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC2830nb extends InterfaceC2856ob {
    @NonNull
    InterfaceC2569db a(@NonNull AppMetricaConfig appMetricaConfig, @NonNull PublicLogger publicLogger, boolean z4);

    @Override // io.appmetrica.analytics.impl.InterfaceC2856ob
    @NonNull
    /* synthetic */ InterfaceC2830nb a();

    @NonNull
    InterfaceC2882pb a(@NonNull AppMetricaConfig appMetricaConfig);

    void a(@NonNull ReporterConfig reporterConfig);

    @NonNull
    InterfaceC2569db b(@NonNull AppMetricaConfig appMetricaConfig, @NonNull PublicLogger publicLogger, boolean z4);

    @NonNull
    InterfaceC2804mb b(@NonNull ReporterConfig reporterConfig);
}
