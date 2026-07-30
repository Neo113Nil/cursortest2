package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.Qk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2744Qk extends AbstractC2982bM implements InterfaceC2506Ck, InterfaceC2693Nk {

    /* renamed from: v, reason: collision with root package name */
    public final Ut f27206v;

    /* renamed from: w, reason: collision with root package name */
    public final AtomicBoolean f27207w;

    /* renamed from: x, reason: collision with root package name */
    public final C2953au f27208x;

    public C2744Qk(Set set, Ut ut, C2953au c2953au) {
        super(set);
        this.f27207w = new AtomicBoolean();
        this.f27206v = ut;
        this.f27208x = c2953au;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2982bM
    public final void k() {
        if (this.f27206v.f28141b == 1) {
            v1();
        }
    }

    public final void v1() {
        q2.h1 h1Var;
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.U8)).booleanValue() && (h1Var = this.f27206v.f28148e0) != null && h1Var.f40068n == 3 && this.f27207w.compareAndSet(false, true)) {
            u1(new Rx(19, h1Var));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2506Ck
    public final void y() {
        int i = this.f27206v.f28141b;
        if (i == 2 || i == 5 || i == 4 || i == 6 || i == 7) {
            v1();
        }
    }
}
