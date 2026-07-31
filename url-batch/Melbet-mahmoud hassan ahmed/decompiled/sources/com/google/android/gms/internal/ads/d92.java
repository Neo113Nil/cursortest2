package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class d92 implements j52<hs1, cf0, y62> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f4122a;

    /* renamed from: b, reason: collision with root package name */
    private final ms1 f4123b;

    public d92(Context context, ms1 ms1Var) {
        this.f4122a = context;
        this.f4123b = ms1Var;
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final /* bridge */ /* synthetic */ hs1 a(ds2 ds2Var, rr2 rr2Var, d52<cf0, y62> d52Var) {
        h72 h72Var = new h72(rr2Var, d52Var.f4072b, true);
        is1 f7 = this.f4123b.f(new l71(ds2Var, rr2Var, d52Var.f4071a), new js1(h72Var));
        h72Var.b(f7.b());
        d52Var.f4073c.t6(f7.n());
        return f7.k();
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final void b(ds2 ds2Var, rr2 rr2Var, d52<cf0, y62> d52Var) {
        try {
            d52Var.f4072b.h0(rr2Var.W);
            if (ds2Var.f4312a.f2953a.f7629o.f15240a == 3) {
                d52Var.f4072b.H3(rr2Var.R, rr2Var.f11400w.toString(), ds2Var.f4312a.f2953a.f7618d, x3.b.B3(this.f4122a), new c92(this, d52Var, null), d52Var.f4073c);
            } else {
                d52Var.f4072b.k5(rr2Var.R, rr2Var.f11400w.toString(), ds2Var.f4312a.f2953a.f7618d, x3.b.B3(this.f4122a), new c92(this, d52Var, null), d52Var.f4073c);
            }
        } catch (RemoteException e7) {
            a3.r1.l("Remote exception loading a rewarded RTB ad", e7);
        }
    }
}
