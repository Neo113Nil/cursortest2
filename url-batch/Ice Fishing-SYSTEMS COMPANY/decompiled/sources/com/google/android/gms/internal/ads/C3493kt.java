package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.widget.FrameLayout;
import java.util.HashSet;
import java.util.concurrent.Executor;
import q2.C4907p;
import u2.C5107a;

/* renamed from: com.google.android.gms.internal.ads.kt, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3493kt {

    /* renamed from: a, reason: collision with root package name */
    public final Context f32476a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f32477b;

    /* renamed from: c, reason: collision with root package name */
    public final C3214fi f32478c;

    /* renamed from: d, reason: collision with root package name */
    public final C3439jt f32479d;

    /* renamed from: e, reason: collision with root package name */
    public final Bt f32480e;

    /* renamed from: f, reason: collision with root package name */
    public final C5107a f32481f;

    /* renamed from: g, reason: collision with root package name */
    public final FrameLayout f32482g;

    /* renamed from: h, reason: collision with root package name */
    public final Zu f32483h;
    public final C3171eu i;

    /* renamed from: j, reason: collision with root package name */
    public J3.a f32484j;

    public C3493kt(Context context, Executor executor, C3214fi c3214fi, Bt bt, C3439jt c3439jt, C3171eu c3171eu, C5107a c5107a) {
        this.f32476a = context;
        this.f32477b = executor;
        this.f32478c = c3214fi;
        this.f32480e = bt;
        this.f32479d = c3439jt;
        this.i = c3171eu;
        this.f32481f = c5107a;
        this.f32482g = new FrameLayout(context);
        this.f32483h = c3214fi.c();
    }

    public final synchronized boolean a(q2.d1 d1Var, String str, PA pa, Kr kr) {
        Throwable th;
        boolean z8;
        Yu yu;
        C3375ii c3375ii;
        try {
            try {
                if (!d1Var.b()) {
                    if (((Boolean) AbstractC2598Ia.f25569d.r()).booleanValue()) {
                        try {
                            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Cc)).booleanValue()) {
                                z8 = true;
                                if (this.f32481f.f41219v >= ((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.Dc)).intValue() || !z8) {
                                    O2.w.d("loadAd must be called on the main UI thread.");
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                    z8 = false;
                    if (this.f32481f.f41219v >= ((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.Dc)).intValue()) {
                    }
                    O2.w.d("loadAd must be called on the main UI thread.");
                }
                if (str == null) {
                    int i = t2.C.f40822b;
                    u2.i.c("Ad unit ID should not be null for app open ad.");
                    this.f32477b.execute(new RunnableC3376ij(21, this));
                    return false;
                }
                if (this.f32484j != null) {
                    return false;
                }
                C3151ea c3151ea = AbstractC3368ia.f31654e3;
                q2.r rVar = q2.r.f40116e;
                if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                    C4907p.a();
                }
                if (!((Boolean) AbstractC2547Fa.f24966c.r()).booleanValue() || (c3375ii = (C3375ii) this.f32480e.o()) == null) {
                    yu = null;
                } else {
                    Yu yu2 = (Yu) c3375ii.f31942f.d();
                    yu2.i(7);
                    yu2.c(d1Var.f40016I);
                    yu2.d(d1Var.f40013F);
                    yu = yu2;
                }
                Context context = this.f32476a;
                boolean z9 = d1Var.f40034y;
                AbstractC2655Lg.o(context, z9);
                if (((Boolean) rVar.f40119c.a(AbstractC3368ia.ka)).booleanValue() && z9) {
                    ((C2748Qo) this.f32478c.f30762G.d()).b(true);
                }
                Pair pair = new Pair("api-call", Long.valueOf(d1Var.f40025S));
                p2.j.f39798C.f39810k.getClass();
                Bundle c4 = AbstractC3035cL.c(pair, new Pair("dynamite-enter", Long.valueOf(System.currentTimeMillis())));
                C3171eu c3171eu = this.i;
                c3171eu.f30532c = str;
                c3171eu.f30531b = q2.g1.b();
                c3171eu.f30530a = d1Var;
                c3171eu.f30548t = c4;
                C3226fu a9 = c3171eu.a();
                Vu e6 = Vu.e(context, PA.N(a9), 7, d1Var);
                C3279gt c3279gt = new C3279gt();
                c3279gt.f31114a = a9;
                J3.a x3 = this.f32480e.x(new C2593Hm(c3279gt, null, 15, false), new Vx(29, this));
                this.f32484j = x3;
                x3.c(new MD(0, x3, new r(this, kr, yu, e6, c3279gt)), this.f32477b);
                return true;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final synchronized C3322hi b(InterfaceC4302zt interfaceC4302zt) {
        C3279gt c3279gt = (C3279gt) interfaceC4302zt;
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.q9)).booleanValue()) {
            C3646nk c3646nk = new C3646nk();
            c3646nk.f32990a = this.f32476a;
            c3646nk.f32991b = c3279gt.f31114a;
            C3646nk c3646nk2 = new C3646nk(c3646nk);
            C3755pl c3755pl = new C3755pl();
            C3439jt c3439jt = this.f32479d;
            Executor executor = this.f32477b;
            ((HashSet) c3755pl.f33501l).add(new C2473Al(c3439jt, executor));
            c3755pl.c(c3439jt, executor);
            C3809ql c3809ql = new C3809ql(c3755pl);
            C3322hi c3322hi = new C3322hi(this.f32478c.f30795b, 0);
            c3322hi.f31248f = c3646nk2;
            c3322hi.f31247e = c3809ql;
            return c3322hi;
        }
        C3439jt c3439jt2 = this.f32479d;
        C3439jt c3439jt3 = new C3439jt(c3439jt2.f32211n);
        c3439jt3.f32210B = c3439jt2;
        C3755pl c3755pl2 = new C3755pl();
        Executor executor2 = this.f32477b;
        c3755pl2.a(c3439jt3, executor2);
        ((HashSet) c3755pl2.f33497g).add(new C2473Al(c3439jt3, executor2));
        ((HashSet) c3755pl2.f33503n).add(new C2473Al(c3439jt3, executor2));
        ((HashSet) c3755pl2.f33502m).add(new C2473Al(c3439jt3, executor2));
        ((HashSet) c3755pl2.f33501l).add(new C2473Al(c3439jt3, executor2));
        c3755pl2.c(c3439jt3, executor2);
        c3755pl2.f33504o = c3439jt3;
        C3646nk c3646nk3 = new C3646nk();
        c3646nk3.f32990a = this.f32476a;
        c3646nk3.f32991b = c3279gt.f31114a;
        C3646nk c3646nk4 = new C3646nk(c3646nk3);
        C3809ql c3809ql2 = new C3809ql(c3755pl2);
        C3322hi c3322hi2 = new C3322hi(this.f32478c.f30795b, 0);
        c3322hi2.f31248f = c3646nk4;
        c3322hi2.f31247e = c3809ql2;
        return c3322hi2;
    }
}
