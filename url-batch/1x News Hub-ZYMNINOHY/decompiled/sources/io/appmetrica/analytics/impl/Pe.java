package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class Pe implements Bc, ActivationBarrierCallback {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0978y9 f6462a;

    /* renamed from: b, reason: collision with root package name */
    public final Ac f6463b;

    /* renamed from: c, reason: collision with root package name */
    public final Ac f6464c;

    public Pe(InterfaceC0978y9 interfaceC0978y9, Vg vg, C0896v4 c0896v4, C0390bf c0390bf) {
        this.f6462a = interfaceC0978y9;
        Ac ac = new Ac(vg, c0896v4, c0390bf);
        this.f6463b = ac;
        this.f6464c = ac;
        if (ac.b()) {
            return;
        }
        C0876ua.k().a().subscribe(TimeUnit.SECONDS.toMillis(O7.f6401a.longValue()), C0876ua.k().x().e(), this);
    }

    @Override // io.appmetrica.analytics.impl.Bc
    public final K8 a() {
        return this.f6464c;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
    public final void onWaitFinished() {
        this.f6463b.a();
        ((C0793r5) this.f6462a.a()).e();
    }
}
