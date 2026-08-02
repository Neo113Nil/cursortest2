package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.IAppMetricaService;

/* loaded from: classes.dex */
public class Ug extends Ch {

    /* renamed from: e, reason: collision with root package name */
    public final Ah f6763e;

    public Ug(C0737p0 c0737p0, InterfaceC0448dl interfaceC0448dl, Ah ah) {
        super(c0737p0, interfaceC0448dl);
        this.f6763e = ah;
    }

    @Override // io.appmetrica.analytics.impl.Ch
    public final void a(Throwable th) {
    }

    @Override // io.appmetrica.analytics.impl.Ch
    public final void a(IAppMetricaService iAppMetricaService) {
        Ah ah = this.f6763e;
        iAppMetricaService.reportData(ah.f5755c, ah.f5753a.d(ah.f5757e.c()));
    }
}
