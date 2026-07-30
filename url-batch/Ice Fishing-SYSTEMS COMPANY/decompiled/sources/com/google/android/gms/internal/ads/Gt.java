package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import java.util.HashSet;
import java.util.concurrent.Executor;
import q2.C4907p;

/* loaded from: classes2.dex */
public final class Gt {

    /* renamed from: a, reason: collision with root package name */
    public final Context f25234a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f25235b;

    /* renamed from: c, reason: collision with root package name */
    public final C3214fi f25236c;

    /* renamed from: d, reason: collision with root package name */
    public final Fr f25237d;

    /* renamed from: e, reason: collision with root package name */
    public final Jt f25238e;

    /* renamed from: f, reason: collision with root package name */
    public C3744pa f25239f;

    /* renamed from: g, reason: collision with root package name */
    public final Zu f25240g;

    /* renamed from: h, reason: collision with root package name */
    public final C3171eu f25241h;
    public Ku i;

    public Gt(Context context, Executor executor, C3214fi c3214fi, Fr fr, Jt jt, C3171eu c3171eu) {
        this.f25234a = context;
        this.f25235b = executor;
        this.f25236c = c3214fi;
        this.f25237d = fr;
        this.f25241h = c3171eu;
        this.f25238e = jt;
        this.f25240g = c3214fi.c();
    }

    public final boolean a(q2.d1 d1Var, String str, PA pa, Kr kr) {
        boolean z8;
        C3644ni c3644ni;
        Yu yu;
        Executor executor = this.f25235b;
        if (str == null) {
            int i = t2.C.f40822b;
            u2.i.c("Ad unit ID should not be null for interstitial ad.");
            executor.execute(new RunnableC3376ij(24, this));
            return false;
        }
        if (b()) {
            return false;
        }
        C3151ea c3151ea = AbstractC3368ia.f31654e3;
        q2.r rVar = q2.r.f40116e;
        if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
            C4907p.a();
        }
        C3151ea c3151ea2 = AbstractC3368ia.ka;
        SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga = rVar.f40119c;
        boolean booleanValue = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(c3151ea2)).booleanValue();
        C3214fi c3214fi = this.f25236c;
        if (booleanValue && d1Var.f40034y) {
            ((C2748Qo) c3214fi.f30762G.d()).b(true);
        }
        Pair pair = new Pair("api-call", Long.valueOf(d1Var.f40025S));
        p2.j.f39798C.f39810k.getClass();
        Bundle c4 = AbstractC3035cL.c(pair, new Pair("dynamite-enter", Long.valueOf(System.currentTimeMillis())));
        C3171eu c3171eu = this.f25241h;
        c3171eu.f30532c = str;
        c3171eu.f30531b = ((Dt) pa).f24600U;
        c3171eu.f30530a = d1Var;
        c3171eu.f30548t = c4;
        C3226fu a9 = c3171eu.a();
        int N8 = PA.N(a9);
        Context context = this.f25234a;
        Vu e6 = Vu.e(context, N8, 4, d1Var);
        boolean booleanValue2 = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.r9)).booleanValue();
        Fr fr = this.f25237d;
        if (booleanValue2) {
            C3214fi c3214fi2 = c3214fi.f30795b;
            C3646nk c3646nk = new C3646nk();
            c3646nk.f32990a = context;
            c3646nk.f32991b = a9;
            C3646nk c3646nk2 = new C3646nk(c3646nk);
            C3755pl c3755pl = new C3755pl();
            c3755pl.d(fr, executor);
            c3755pl.b(fr, executor);
            c3644ni = new C3644ni(c3214fi2, new C3431jl(22), new C3809ql(c3755pl), c3646nk2, new C3562m7(26), new C3761pr(0, this.f25239f), null, null);
            z8 = true;
        } else {
            C3755pl c3755pl2 = new C3755pl();
            HashSet hashSet = (HashSet) c3755pl2.f33498h;
            HashSet hashSet2 = (HashSet) c3755pl2.f33495e;
            z8 = true;
            Jt jt = this.f25238e;
            if (jt != null) {
                hashSet2.add(new C2473Al(jt, executor));
                hashSet.add(new C2473Al(jt, executor));
                c3755pl2.a(jt, executor);
            }
            C3214fi c3214fi3 = c3214fi.f30795b;
            C3646nk c3646nk3 = new C3646nk();
            c3646nk3.f32990a = context;
            c3646nk3.f32991b = a9;
            C3646nk c3646nk4 = new C3646nk(c3646nk3);
            c3755pl2.d(fr, executor);
            hashSet2.add(new C2473Al(fr, executor));
            hashSet.add(new C2473Al(fr, executor));
            c3755pl2.a(fr, executor);
            ((HashSet) c3755pl2.f33493c).add(new C2473Al(fr, executor));
            c3755pl2.c(fr, executor);
            c3755pl2.b(fr, executor);
            ((HashSet) c3755pl2.f33502m).add(new C2473Al(fr, executor));
            ((HashSet) c3755pl2.f33501l).add(new C2473Al(fr, executor));
            c3644ni = new C3644ni(c3214fi3, new C3431jl(22), new C3809ql(c3755pl2), c3646nk4, new C3562m7(26), new C3761pr(0, this.f25239f), null, null);
        }
        if (((Boolean) AbstractC2547Fa.f24966c.r()).booleanValue()) {
            yu = (Yu) c3644ni.f32967o0.d();
            yu.i(4);
            yu.c(d1Var.f40016I);
            yu.d(d1Var.f40013F);
        } else {
            yu = null;
        }
        Yu yu2 = yu;
        C2709Oj c2709Oj = (C2709Oj) c3644ni.f32884D0.d();
        Ku c9 = c2709Oj.c(c2709Oj.b());
        this.i = c9;
        c9.c(new MD(0, c9, new r(this, kr, yu2, e6, c3644ni)), executor);
        return z8;
    }

    public final boolean b() {
        Ku ku = this.i;
        return (ku == null || ku.f26063v.isDone()) ? false : true;
    }
}
