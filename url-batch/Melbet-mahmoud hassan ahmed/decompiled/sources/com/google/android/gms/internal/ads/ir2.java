package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class ir2 extends ek0 {

    /* renamed from: f, reason: collision with root package name */
    private final er2 f6753f;

    /* renamed from: g, reason: collision with root package name */
    private final tq2 f6754g;

    /* renamed from: h, reason: collision with root package name */
    private final String f6755h;

    /* renamed from: i, reason: collision with root package name */
    private final fs2 f6756i;

    /* renamed from: j, reason: collision with root package name */
    private final Context f6757j;

    /* renamed from: k, reason: collision with root package name */
    private hs1 f6758k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f6759l = ((Boolean) sw.c().b(m10.f8326w0)).booleanValue();

    public ir2(String str, er2 er2Var, Context context, tq2 tq2Var, fs2 fs2Var) {
        this.f6755h = str;
        this.f6753f = er2Var;
        this.f6754g = tq2Var;
        this.f6756i = fs2Var;
        this.f6757j = context;
    }

    private final synchronized void v6(kv kvVar, nk0 nk0Var, int i7) {
        r3.o.e("#008 Must be called on the main UI thread.");
        this.f6754g.T(nk0Var);
        y2.t.q();
        if (a3.g2.l(this.f6757j) && kvVar.f7661x == null) {
            io0.d("Failed to load the ad because app ID is missing.");
            this.f6754g.d(dt2.d(4, null, null));
            return;
        }
        if (this.f6758k != null) {
            return;
        }
        vq2 vq2Var = new vq2(null);
        this.f6753f.i(i7);
        this.f6753f.a(kvVar, this.f6755h, vq2Var, new hr2(this));
    }

    @Override // com.google.android.gms.internal.ads.fk0
    public final synchronized void G4(kv kvVar, nk0 nk0Var) {
        v6(kvVar, nk0Var, 3);
    }

    @Override // com.google.android.gms.internal.ads.fk0
    public final void O5(wy wyVar) {
        r3.o.e("setOnPaidEventListener must be called on the main UI thread.");
        this.f6754g.C(wyVar);
    }

    @Override // com.google.android.gms.internal.ads.fk0
    public final synchronized void X1(uk0 uk0Var) {
        r3.o.e("#008 Must be called on the main UI thread.");
        fs2 fs2Var = this.f6756i;
        fs2Var.f5192a = uk0Var.f12831f;
        fs2Var.f5193b = uk0Var.f12832g;
    }

    @Override // com.google.android.gms.internal.ads.fk0
    public final void X3(ty tyVar) {
        if (tyVar == null) {
            this.f6754g.z(null);
        } else {
            this.f6754g.z(new gr2(this, tyVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.fk0
    public final Bundle a() {
        r3.o.e("#008 Must be called on the main UI thread.");
        hs1 hs1Var = this.f6758k;
        return hs1Var != null ? hs1Var.h() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.fk0
    public final synchronized void a3(kv kvVar, nk0 nk0Var) {
        v6(kvVar, nk0Var, 2);
    }

    @Override // com.google.android.gms.internal.ads.fk0
    public final synchronized String b() {
        hs1 hs1Var = this.f6758k;
        if (hs1Var == null || hs1Var.c() == null) {
            return null;
        }
        return this.f6758k.c().b();
    }

    @Override // com.google.android.gms.internal.ads.fk0
    public final zy c() {
        hs1 hs1Var;
        if (((Boolean) sw.c().b(m10.f8222i5)).booleanValue() && (hs1Var = this.f6758k) != null) {
            return hs1Var.c();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.fk0
    public final ck0 g() {
        r3.o.e("#008 Must be called on the main UI thread.");
        hs1 hs1Var = this.f6758k;
        if (hs1Var != null) {
            return hs1Var.i();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.fk0
    public final synchronized void k0(boolean z6) {
        r3.o.e("setImmersiveMode must be called on the main UI thread.");
        this.f6759l = z6;
    }

    @Override // com.google.android.gms.internal.ads.fk0
    public final synchronized void m6(x3.a aVar) {
        t1(aVar, this.f6759l);
    }

    @Override // com.google.android.gms.internal.ads.fk0
    public final boolean n() {
        r3.o.e("#008 Must be called on the main UI thread.");
        hs1 hs1Var = this.f6758k;
        return (hs1Var == null || hs1Var.k()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.fk0
    public final void n5(jk0 jk0Var) {
        r3.o.e("#008 Must be called on the main UI thread.");
        this.f6754g.Q(jk0Var);
    }

    @Override // com.google.android.gms.internal.ads.fk0
    public final void q4(ok0 ok0Var) {
        r3.o.e("#008 Must be called on the main UI thread.");
        this.f6754g.a0(ok0Var);
    }

    @Override // com.google.android.gms.internal.ads.fk0
    public final synchronized void t1(x3.a aVar, boolean z6) {
        r3.o.e("#008 Must be called on the main UI thread.");
        if (this.f6758k == null) {
            io0.g("Rewarded can not be shown before loaded");
            this.f6754g.M0(dt2.d(9, null, null));
        } else {
            this.f6758k.m(z6, (Activity) x3.b.O0(aVar));
        }
    }
}
