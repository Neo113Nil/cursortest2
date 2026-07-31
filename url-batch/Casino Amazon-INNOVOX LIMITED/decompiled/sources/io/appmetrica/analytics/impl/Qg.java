package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.IAppMetricaService;

/* loaded from: classes3.dex */
public class Qg extends AbstractCallableC0657yh {
    public final C0607wh e;

    public Qg(C0416p0 c0416p0, InterfaceC0053al interfaceC0053al, C0607wh c0607wh) {
        super(c0416p0, interfaceC0053al);
        this.e = c0607wh;
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC0657yh
    public final void a(Throwable th) {
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC0657yh
    public final void a(IAppMetricaService iAppMetricaService) {
        C0607wh c0607wh = this.e;
        iAppMetricaService.reportData(c0607wh.c, c0607wh.f1550a.d(c0607wh.e.c()));
    }
}
