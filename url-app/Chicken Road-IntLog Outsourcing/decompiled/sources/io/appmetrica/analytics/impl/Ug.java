package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.IAppMetricaService;

/* loaded from: classes.dex */
public class Ug extends Ch {

    /* renamed from: e, reason: collision with root package name */
    public final Ah f7595e;

    public Ug(C0888p0 c0888p0, InterfaceC0599dl interfaceC0599dl, Ah ah) {
        super(c0888p0, interfaceC0599dl);
        this.f7595e = ah;
    }

    @Override // io.appmetrica.analytics.impl.Ch
    public final void a(Throwable th) {
    }

    @Override // io.appmetrica.analytics.impl.Ch
    public final void a(IAppMetricaService iAppMetricaService) {
        Ah ah = this.f7595e;
        iAppMetricaService.reportData(ah.f6532c, ah.f6530a.d(ah.f6534e.c()));
    }
}
