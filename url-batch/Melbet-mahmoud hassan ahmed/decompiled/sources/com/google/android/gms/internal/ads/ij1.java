package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class ij1 extends v61 {

    /* renamed from: i, reason: collision with root package name */
    private final Context f6663i;

    /* renamed from: j, reason: collision with root package name */
    private final WeakReference<eu0> f6664j;

    /* renamed from: k, reason: collision with root package name */
    private final yh1 f6665k;

    /* renamed from: l, reason: collision with root package name */
    private final pk1 f6666l;

    /* renamed from: m, reason: collision with root package name */
    private final q71 f6667m;

    /* renamed from: n, reason: collision with root package name */
    private final f13 f6668n;

    /* renamed from: o, reason: collision with root package name */
    private final jb1 f6669o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f6670p;

    ij1(u61 u61Var, Context context, eu0 eu0Var, yh1 yh1Var, pk1 pk1Var, q71 q71Var, f13 f13Var, jb1 jb1Var) {
        super(u61Var);
        this.f6670p = false;
        this.f6663i = context;
        this.f6664j = new WeakReference<>(eu0Var);
        this.f6665k = yh1Var;
        this.f6666l = pk1Var;
        this.f6667m = q71Var;
        this.f6668n = f13Var;
        this.f6669o = jb1Var;
    }

    public final void finalize() {
        try {
            final eu0 eu0Var = this.f6664j.get();
            if (((Boolean) sw.c().b(m10.f8206g5)).booleanValue()) {
                if (!this.f6670p && eu0Var != null) {
                    wo0.f13898e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.hj1
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

    public final boolean h() {
        return this.f6667m.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.content.Context] */
    public final boolean i(boolean z6, Activity activity) {
        if (((Boolean) sw.c().b(m10.f8312u0)).booleanValue()) {
            y2.t.q();
            if (a3.g2.k(this.f6663i)) {
                io0.g("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.f6669o.a();
                if (((Boolean) sw.c().b(m10.f8319v0)).booleanValue()) {
                    this.f6668n.a(this.f13138a.f4313b.f3934b.f12947b);
                }
                return false;
            }
        }
        if (((Boolean) sw.c().b(m10.i7)).booleanValue() && this.f6670p) {
            io0.g("The interstitial ad has been showed.");
            this.f6669o.d(dt2.d(10, null, null));
        }
        if (!this.f6670p) {
            this.f6665k.a();
            Activity activity2 = activity;
            if (activity == null) {
                activity2 = this.f6663i;
            }
            try {
                this.f6666l.a(z6, activity2, this.f6669o);
                this.f6665k.zza();
                this.f6670p = true;
                return true;
            } catch (ok1 e7) {
                this.f6669o.r0(e7);
            }
        }
        return false;
    }
}
