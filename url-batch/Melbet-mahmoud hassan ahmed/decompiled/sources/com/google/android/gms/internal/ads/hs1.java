package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class hs1 extends v61 {

    /* renamed from: i, reason: collision with root package name */
    private final Context f6393i;

    /* renamed from: j, reason: collision with root package name */
    private final WeakReference<eu0> f6394j;

    /* renamed from: k, reason: collision with root package name */
    private final pk1 f6395k;

    /* renamed from: l, reason: collision with root package name */
    private final yh1 f6396l;

    /* renamed from: m, reason: collision with root package name */
    private final jb1 f6397m;

    /* renamed from: n, reason: collision with root package name */
    private final rc1 f6398n;

    /* renamed from: o, reason: collision with root package name */
    private final q71 f6399o;

    /* renamed from: p, reason: collision with root package name */
    private final ck0 f6400p;

    /* renamed from: q, reason: collision with root package name */
    private final f13 f6401q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f6402r;

    hs1(u61 u61Var, Context context, eu0 eu0Var, pk1 pk1Var, yh1 yh1Var, jb1 jb1Var, rc1 rc1Var, q71 q71Var, rr2 rr2Var, f13 f13Var) {
        super(u61Var);
        this.f6402r = false;
        this.f6393i = context;
        this.f6395k = pk1Var;
        this.f6394j = new WeakReference<>(eu0Var);
        this.f6396l = yh1Var;
        this.f6397m = jb1Var;
        this.f6398n = rc1Var;
        this.f6399o = q71Var;
        this.f6401q = f13Var;
        yj0 yj0Var = rr2Var.f11390m;
        this.f6400p = new wk0(yj0Var != null ? yj0Var.f14705f : "", yj0Var != null ? yj0Var.f14706g : 1);
    }

    public final void finalize() {
        try {
            final eu0 eu0Var = this.f6394j.get();
            if (((Boolean) sw.c().b(m10.f8206g5)).booleanValue()) {
                if (!this.f6402r && eu0Var != null) {
                    wo0.f13898e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.gs1
                        @Override // java.lang.Runnable
                        public final void run() {
                            eu0.this.destroy();
                        }
                    });
                }
            } else if (eu0Var != null) {
                eu0Var.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    public final Bundle h() {
        return this.f6398n.S0();
    }

    public final ck0 i() {
        return this.f6400p;
    }

    public final boolean j() {
        return this.f6399o.c();
    }

    public final boolean k() {
        return this.f6402r;
    }

    public final boolean l() {
        eu0 eu0Var = this.f6394j.get();
        return (eu0Var == null || eu0Var.a1()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.content.Context] */
    public final boolean m(boolean z6, Activity activity) {
        if (((Boolean) sw.c().b(m10.f8312u0)).booleanValue()) {
            y2.t.q();
            if (a3.g2.k(this.f6393i)) {
                io0.g("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.f6397m.a();
                if (((Boolean) sw.c().b(m10.f8319v0)).booleanValue()) {
                    this.f6401q.a(this.f13138a.f4313b.f3934b.f12947b);
                }
                return false;
            }
        }
        if (this.f6402r) {
            io0.g("The rewarded ad have been showed.");
            this.f6397m.d(dt2.d(10, null, null));
            return false;
        }
        this.f6402r = true;
        this.f6396l.a();
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.f6393i;
        }
        try {
            this.f6395k.a(z6, activity2, this.f6397m);
            this.f6396l.zza();
            return true;
        } catch (ok1 e7) {
            this.f6397m.r0(e7);
            return false;
        }
    }
}
