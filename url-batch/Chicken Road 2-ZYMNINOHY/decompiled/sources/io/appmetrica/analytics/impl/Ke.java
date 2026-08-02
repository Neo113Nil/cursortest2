package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class Ke implements InterfaceC1000uc, ActivationBarrierCallback {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0919r9 f10527a;

    /* renamed from: b, reason: collision with root package name */
    public final C0974tc f10528b;

    /* renamed from: c, reason: collision with root package name */
    public final C0974tc f10529c;

    public Ke(InterfaceC0919r9 interfaceC0919r9, Qg qg, C0837o4 c0837o4, We we) {
        this.f10527a = interfaceC0919r9;
        C0974tc c0974tc = new C0974tc(qg, c0837o4, we);
        this.f10528b = c0974tc;
        this.f10529c = c0974tc;
        if (c0974tc.b()) {
            return;
        }
        C0817na.k().a().subscribe(TimeUnit.SECONDS.toMillis(I7.f10426a.longValue()), C0817na.k().w().d(), this);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1000uc
    public final F8 a() {
        return this.f10529c;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
    public final void onWaitFinished() {
        this.f10528b.a();
        ((C0734k5) this.f10527a.a()).e();
    }
}
