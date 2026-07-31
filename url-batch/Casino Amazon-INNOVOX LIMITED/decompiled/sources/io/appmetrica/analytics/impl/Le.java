package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class Le implements InterfaceC0577vc, ActivationBarrierCallback {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0499s9 f936a;
    public final C0552uc b;
    public final C0552uc c;

    public Le(InterfaceC0499s9 interfaceC0499s9, Rg rg, C0420p4 c0420p4, Xe xe) {
        this.f936a = interfaceC0499s9;
        C0552uc c0552uc = new C0552uc(rg, c0420p4, xe);
        this.b = c0552uc;
        this.c = c0552uc;
        if (c0552uc.b()) {
            return;
        }
        C0401oa.k().a().subscribe(TimeUnit.SECONDS.toMillis(J7.f902a.longValue()), C0401oa.k().w().d(), this);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0577vc
    public final G8 a() {
        return this.c;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
    public final void onWaitFinished() {
        this.b.a();
        ((C0321l5) this.f936a.a()).e();
    }
}
