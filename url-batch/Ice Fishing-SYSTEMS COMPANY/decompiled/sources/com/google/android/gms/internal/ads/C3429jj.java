package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.jj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3429jj extends AbstractC2539Ej {

    /* renamed from: l, reason: collision with root package name */
    public final Context f32157l;

    /* renamed from: m, reason: collision with root package name */
    public final View f32158m;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC3858rh f32159n;

    /* renamed from: o, reason: collision with root package name */
    public final Vt f32160o;

    /* renamed from: p, reason: collision with root package name */
    public final InterfaceC2505Cj f32161p;

    /* renamed from: q, reason: collision with root package name */
    public final C4133wm f32162q;

    /* renamed from: r, reason: collision with root package name */
    public final C2541El f32163r;

    /* renamed from: s, reason: collision with root package name */
    public final InterfaceC3901sN f32164s;

    /* renamed from: t, reason: collision with root package name */
    public final Executor f32165t;

    /* renamed from: u, reason: collision with root package name */
    public q2.g1 f32166u;

    public C3429jj(S0.q qVar, Context context, Vt vt, View view, InterfaceC3858rh interfaceC3858rh, InterfaceC2505Cj interfaceC2505Cj, C4133wm c4133wm, C2541El c2541El, InterfaceC3901sN interfaceC3901sN, Executor executor) {
        super(qVar);
        this.f32157l = context;
        this.f32158m = view;
        this.f32159n = interfaceC3858rh;
        this.f32160o = vt;
        this.f32161p = interfaceC2505Cj;
        this.f32162q = c4133wm;
        this.f32163r = c2541El;
        this.f32164s = interfaceC3901sN;
        this.f32165t = executor;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2539Ej
    public final void a() {
        this.f32165t.execute(new RunnableC3376ij(0, this));
        super.a();
    }

    public final Vt c() {
        q2.g1 g1Var = this.f32166u;
        if (g1Var != null) {
            return g1Var.f40048B ? new Vt(-3, 0, true) : new Vt(g1Var.f40060x, g1Var.f40057u, false);
        }
        Ut ut = this.f24804b;
        if (ut.f28144c0) {
            for (String str : ut.f28139a) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            View view = this.f32158m;
            return new Vt(view.getWidth(), view.getHeight(), false);
        }
        return (Vt) ut.f28171r.get(0);
    }

    public final int d() {
        C3151ea c3151ea = AbstractC3368ia.W8;
        q2.r rVar = q2.r.f40116e;
        if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue() && this.f24804b.f28152g0) {
            if (!((Boolean) rVar.f40119c.a(AbstractC3368ia.X8)).booleanValue()) {
                return 0;
            }
        }
        return ((Wt) this.f24803a.f29349b.f24454v).f28492c;
    }
}
