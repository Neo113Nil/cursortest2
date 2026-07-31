package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.xi, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3096xi implements InterfaceC2830nb {
    @Override // io.appmetrica.analytics.impl.InterfaceC2830nb, io.appmetrica.analytics.impl.InterfaceC2856ob
    @NonNull
    public final InterfaceC2830nb a() {
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2830nb
    @NonNull
    public final InterfaceC2569db b(@NonNull AppMetricaConfig appMetricaConfig, @NonNull PublicLogger publicLogger, boolean z4) {
        return new Sc();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2830nb
    public final void a(@NonNull ReporterConfig reporterConfig) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2830nb
    @NonNull
    public final InterfaceC2804mb b(@NonNull ReporterConfig reporterConfig) {
        return new C3018ui();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2830nb
    @NonNull
    public final InterfaceC2569db a(@NonNull AppMetricaConfig appMetricaConfig, @NonNull PublicLogger publicLogger, boolean z4) {
        return new Sc();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2830nb
    @NonNull
    public final InterfaceC2882pb a(@NonNull AppMetricaConfig appMetricaConfig) {
        return new C3018ui();
    }
}
