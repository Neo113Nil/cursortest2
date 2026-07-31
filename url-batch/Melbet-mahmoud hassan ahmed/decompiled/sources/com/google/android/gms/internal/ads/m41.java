package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;

/* loaded from: classes.dex */
public final class m41 extends v61 {

    /* renamed from: i, reason: collision with root package name */
    private final eu0 f8400i;

    /* renamed from: j, reason: collision with root package name */
    private final int f8401j;

    /* renamed from: k, reason: collision with root package name */
    private final Context f8402k;

    /* renamed from: l, reason: collision with root package name */
    private final t31 f8403l;

    /* renamed from: m, reason: collision with root package name */
    private final pk1 f8404m;

    /* renamed from: n, reason: collision with root package name */
    private final jb1 f8405n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f8406o;

    m41(u61 u61Var, Context context, eu0 eu0Var, int i7, t31 t31Var, pk1 pk1Var, jb1 jb1Var) {
        super(u61Var);
        this.f8406o = false;
        this.f8400i = eu0Var;
        this.f8402k = context;
        this.f8401j = i7;
        this.f8403l = t31Var;
        this.f8404m = pk1Var;
        this.f8405n = jb1Var;
    }

    @Override // com.google.android.gms.internal.ads.v61
    public final void a() {
        super.a();
        eu0 eu0Var = this.f8400i;
        if (eu0Var != null) {
            eu0Var.destroy();
        }
    }

    public final int h() {
        return this.f8401j;
    }

    public final void i(np npVar) {
        eu0 eu0Var = this.f8400i;
        if (eu0Var != null) {
            eu0Var.R(npVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [android.content.Context] */
    public final void j(Activity activity, cq cqVar, boolean z6) {
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.f8402k;
        }
        if (((Boolean) sw.c().b(m10.f8312u0)).booleanValue()) {
            y2.t.q();
            if (a3.g2.k(activity2)) {
                io0.g("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.f8405n.a();
                if (((Boolean) sw.c().b(m10.f8319v0)).booleanValue()) {
                    new f13(activity2.getApplicationContext(), y2.t.u().b()).a(this.f13138a.f4313b.f3934b.f12947b);
                    return;
                }
                return;
            }
        }
        if (this.f8406o) {
            io0.g("App open interstitial ad is already visible.");
            if (((Boolean) sw.c().b(m10.i7)).booleanValue()) {
                this.f8405n.d(dt2.d(10, null, null));
            }
        }
        if (this.f8406o) {
            return;
        }
        try {
            this.f8404m.a(z6, activity2, this.f8405n);
            this.f8406o = true;
        } catch (ok1 e7) {
            if (((Boolean) sw.c().b(m10.i7)).booleanValue()) {
                this.f8405n.r0(e7);
            } else {
                cqVar.C0(dt2.a(e7));
            }
        }
    }

    public final void k(long j7, int i7) {
        this.f8403l.a(j7, i7);
    }
}
