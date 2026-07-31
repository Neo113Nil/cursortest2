package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class d82 implements j52<mm1, cf0, y62> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f4115a;

    /* renamed from: b, reason: collision with root package name */
    private final dl1 f4116b;

    /* renamed from: c, reason: collision with root package name */
    private sd0 f4117c;

    /* renamed from: d, reason: collision with root package name */
    private final po0 f4118d;

    public d82(Context context, dl1 dl1Var, po0 po0Var) {
        this.f4115a = context;
        this.f4116b = dl1Var;
        this.f4118d = po0Var;
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final /* bridge */ /* synthetic */ mm1 a(ds2 ds2Var, rr2 rr2Var, d52<cf0, y62> d52Var) {
        if (!ds2Var.f4312a.f2953a.f7621g.contains(Integer.toString(6))) {
            throw new u82(2, "Unified must be used for RTB.");
        }
        rm1 a02 = rm1.a0(this.f4117c);
        if (!ds2Var.f4312a.f2953a.f7621g.contains(Integer.toString(a02.K()))) {
            throw new u82(1, "No corresponding native ad listener");
        }
        tm1 d7 = this.f4116b.d(new l71(ds2Var, rr2Var, d52Var.f4071a), new dn1(a02), new so1(null, null, this.f4117c, null));
        d52Var.f4073c.t6(d7.f());
        return d7.h();
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final void b(ds2 ds2Var, rr2 rr2Var, d52<cf0, y62> d52Var) {
        try {
            d52Var.f4072b.h0(rr2Var.W);
            b82 b82Var = null;
            if (this.f4118d.f10303h < ((Integer) sw.c().b(m10.f8226j1)).intValue()) {
                d52Var.f4072b.n2(rr2Var.R, rr2Var.f11400w.toString(), ds2Var.f4312a.f2953a.f7618d, x3.b.B3(this.f4115a), new c82(this, d52Var, b82Var), d52Var.f4073c);
            } else {
                d52Var.f4072b.P4(rr2Var.R, rr2Var.f11400w.toString(), ds2Var.f4312a.f2953a.f7618d, x3.b.B3(this.f4115a), new c82(this, d52Var, b82Var), d52Var.f4073c, ds2Var.f4312a.f2953a.f7623i);
            }
        } catch (RemoteException e7) {
            throw new ps2(e7);
        }
    }
}
