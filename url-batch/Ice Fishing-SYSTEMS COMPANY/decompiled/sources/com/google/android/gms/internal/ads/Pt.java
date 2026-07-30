package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import java.util.concurrent.Executor;
import q2.C4907p;

/* loaded from: classes2.dex */
public final class Pt {

    /* renamed from: a, reason: collision with root package name */
    public final Context f27070a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f27071b;

    /* renamed from: c, reason: collision with root package name */
    public final C3214fi f27072c;

    /* renamed from: d, reason: collision with root package name */
    public final Jt f27073d;

    /* renamed from: e, reason: collision with root package name */
    public final Bt f27074e;

    /* renamed from: f, reason: collision with root package name */
    public final C3008bu f27075f;

    /* renamed from: g, reason: collision with root package name */
    public final Zu f27076g;

    /* renamed from: h, reason: collision with root package name */
    public final C3171eu f27077h;
    public J3.a i;

    public Pt(Context context, Executor executor, C3214fi c3214fi, Bt bt, Jt jt, C3171eu c3171eu, C3008bu c3008bu) {
        this.f27070a = context;
        this.f27071b = executor;
        this.f27072c = c3214fi;
        this.f27074e = bt;
        this.f27073d = jt;
        this.f27077h = c3171eu;
        this.f27075f = c3008bu;
        this.f27076g = c3214fi.c();
    }

    public final boolean a(q2.d1 d1Var, String str, PA pa, Kr kr) {
        Yu yu;
        int i = 0;
        Executor executor = this.f27071b;
        if (str == null) {
            int i4 = t2.C.f40822b;
            u2.i.c("Ad unit ID should not be null for rewarded video ad.");
            executor.execute(new RunnableC3376ij(26, this));
            return false;
        }
        J3.a aVar = this.i;
        if (aVar != null && !aVar.isDone()) {
            return false;
        }
        C3151ea c3151ea = AbstractC3368ia.f31654e3;
        q2.r rVar = q2.r.f40116e;
        if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
            C4907p.a();
        }
        boolean booleanValue = ((Boolean) AbstractC2547Fa.f24966c.r()).booleanValue();
        Bt bt = this.f27074e;
        if (!booleanValue || bt.o() == null) {
            yu = null;
        } else {
            yu = (Yu) ((C3806qi) bt.o()).f33807g.d();
            yu.i(5);
            yu.c(d1Var.f40016I);
            yu.d(d1Var.f40013F);
        }
        boolean z8 = d1Var.f40034y;
        Context context = this.f27070a;
        AbstractC2655Lg.o(context, z8);
        if (((Boolean) rVar.f40119c.a(AbstractC3368ia.ka)).booleanValue() && z8) {
            ((C2748Qo) this.f27072c.f30762G.d()).b(true);
        }
        Pair pair = new Pair("api-call", Long.valueOf(d1Var.f40025S));
        p2.j.f39798C.f39810k.getClass();
        Bundle c4 = AbstractC3035cL.c(pair, new Pair("dynamite-enter", Long.valueOf(System.currentTimeMillis())));
        C3171eu c3171eu = this.f27077h;
        c3171eu.f30532c = str;
        c3171eu.f30531b = new q2.g1("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false, false);
        c3171eu.f30530a = d1Var;
        c3171eu.f30548t = c4;
        C3226fu a9 = c3171eu.a();
        Vu e6 = Vu.e(context, PA.N(a9), 5, d1Var);
        Nt nt = new Nt();
        nt.f26619a = a9;
        J3.a x3 = bt.x(new C2593Hm(nt, null, 15, false), new Mt(0, this));
        this.i = x3;
        x3.c(new MD(i, x3, new r(this, kr, yu, e6, nt)), executor);
        return true;
    }

    public final C3322hi b(InterfaceC4302zt interfaceC4302zt) {
        C3322hi c3322hi = new C3322hi(this.f27072c.f30795b, 1);
        C3646nk c3646nk = new C3646nk();
        c3646nk.f32990a = this.f27070a;
        c3646nk.f32991b = ((Nt) interfaceC4302zt).f26619a;
        c3646nk.f32993d = this.f27075f;
        c3322hi.f31248f = new C3646nk(c3646nk);
        c3322hi.f31247e = new C3809ql(new C3755pl());
        return c3322hi;
    }
}
