package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class z72 implements j52<mm1, at2, y62> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f15004a;

    /* renamed from: b, reason: collision with root package name */
    private final dl1 f15005b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f15006c;

    public z72(Context context, dl1 dl1Var, Executor executor) {
        this.f15004a = context;
        this.f15005b = dl1Var;
        this.f15006c = executor;
    }

    private static final boolean c(ds2 ds2Var, int i7) {
        return ds2Var.f4312a.f2953a.f7621g.contains(Integer.toString(i7));
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final /* bridge */ /* synthetic */ mm1 a(ds2 ds2Var, rr2 rr2Var, d52<at2, y62> d52Var) {
        rm1 D;
        od0 b7 = d52Var.f4072b.b();
        pd0 c7 = d52Var.f4072b.c();
        sd0 g7 = d52Var.f4072b.g();
        if (g7 != null && c(ds2Var, 6)) {
            D = rm1.a0(g7);
        } else if (b7 != null && c(ds2Var, 6)) {
            D = rm1.E(b7);
        } else if (b7 != null && c(ds2Var, 2)) {
            D = rm1.C(b7);
        } else if (c7 != null && c(ds2Var, 6)) {
            D = rm1.F(c7);
        } else {
            if (c7 == null || !c(ds2Var, 1)) {
                throw new u82(1, "No native ad mappers");
            }
            D = rm1.D(c7);
        }
        if (!ds2Var.f4312a.f2953a.f7621g.contains(Integer.toString(D.K()))) {
            throw new u82(1, "No corresponding native ad listener");
        }
        tm1 d7 = this.f15005b.d(new l71(ds2Var, rr2Var, d52Var.f4071a), new dn1(D), new so1(c7, b7, g7, null));
        d52Var.f4073c.t6(d7.g());
        d7.c().D0(new g21(d52Var.f4072b), this.f15006c);
        return d7.h();
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final void b(ds2 ds2Var, rr2 rr2Var, d52<at2, y62> d52Var) {
        at2 at2Var = d52Var.f4072b;
        Context context = this.f15004a;
        kv kvVar = ds2Var.f4312a.f2953a.f7618d;
        String jSONObject = rr2Var.f11400w.toString();
        String l7 = a3.a1.l(rr2Var.f11397t);
        y62 y62Var = d52Var.f4073c;
        ks2 ks2Var = ds2Var.f4312a.f2953a;
        at2Var.r(context, kvVar, jSONObject, l7, y62Var, ks2Var.f7623i, ks2Var.f7621g);
    }
}
