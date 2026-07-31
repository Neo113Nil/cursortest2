package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class o72 implements j52<ij1, cf0, y62> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f9557a;

    /* renamed from: b, reason: collision with root package name */
    private final gk1 f9558b;

    public o72(Context context, gk1 gk1Var) {
        this.f9557a = context;
        this.f9558b = gk1Var;
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final /* bridge */ /* synthetic */ ij1 a(ds2 ds2Var, rr2 rr2Var, d52<cf0, y62> d52Var) {
        h72 h72Var = new h72(rr2Var, d52Var.f4072b, false);
        jj1 c7 = this.f9558b.c(new l71(ds2Var, rr2Var, d52Var.f4071a), new nj1(h72Var, null));
        h72Var.b(c7.b());
        d52Var.f4073c.t6(c7.f());
        return c7.i();
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final void b(ds2 ds2Var, rr2 rr2Var, d52<cf0, y62> d52Var) {
        try {
            d52Var.f4072b.h0(rr2Var.W);
            d52Var.f4072b.A2(rr2Var.R, rr2Var.f11400w.toString(), ds2Var.f4312a.f2953a.f7618d, x3.b.B3(this.f9557a), new n72(this, d52Var, null), d52Var.f4073c);
        } catch (RemoteException e7) {
            throw new ps2(e7);
        }
    }
}
