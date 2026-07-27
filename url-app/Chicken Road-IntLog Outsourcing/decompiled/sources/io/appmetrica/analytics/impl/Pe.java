package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class Pe implements Bc, ActivationBarrierCallback {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1129y9 f7276a;

    /* renamed from: b, reason: collision with root package name */
    public final Ac f7277b;

    /* renamed from: c, reason: collision with root package name */
    public final Ac f7278c;

    public Pe(InterfaceC1129y9 interfaceC1129y9, Vg vg, C1047v4 c1047v4, C0541bf c0541bf) {
        this.f7276a = interfaceC1129y9;
        Ac ac = new Ac(vg, c1047v4, c0541bf);
        this.f7277b = ac;
        this.f7278c = ac;
        if (ac.b()) {
            return;
        }
        C1027ua.k().a().subscribe(TimeUnit.SECONDS.toMillis(O7.f7211a.longValue()), C1027ua.k().x().e(), this);
    }

    @Override // io.appmetrica.analytics.impl.Bc
    public final K8 a() {
        return this.f7278c;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
    public final void onWaitFinished() {
        this.f7277b.a();
        ((C0944r5) this.f7276a.a()).e();
    }
}
