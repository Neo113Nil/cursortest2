package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class jd2 implements cd2<v61> {

    /* renamed from: a, reason: collision with root package name */
    private final is2 f7088a;

    /* renamed from: b, reason: collision with root package name */
    private final bw0 f7089b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f7090c;

    /* renamed from: d, reason: collision with root package name */
    private final zc2 f7091d;

    /* renamed from: e, reason: collision with root package name */
    private final qx2 f7092e;

    /* renamed from: f, reason: collision with root package name */
    private k71 f7093f;

    public jd2(bw0 bw0Var, Context context, zc2 zc2Var, is2 is2Var) {
        this.f7089b = bw0Var;
        this.f7090c = context;
        this.f7091d = zc2Var;
        this.f7088a = is2Var;
        this.f7092e = bw0Var.b();
        is2Var.J(zc2Var.d());
    }

    @Override // com.google.android.gms.internal.ads.cd2
    public final boolean a(kv kvVar, String str, ad2 ad2Var, bd2<? super v61> bd2Var) {
        ox2 p7 = ox2.p(this.f7090c, 7, 8, kvVar);
        y2.t.q();
        if (a3.g2.l(this.f7090c) && kvVar.f7661x == null) {
            io0.d("Failed to load the ad because app ID is missing.");
            this.f7089b.d().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.ed2
                @Override // java.lang.Runnable
                public final void run() {
                    jd2.this.e();
                }
            });
            if (p7 != null) {
                qx2 qx2Var = this.f7092e;
                p7.g(false);
                qx2Var.a(p7.i());
            }
            return false;
        }
        if (str == null) {
            io0.d("Ad unit ID should not be null for NativeAdLoader.");
            this.f7089b.d().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.fd2
                @Override // java.lang.Runnable
                public final void run() {
                    jd2.this.f();
                }
            });
            if (p7 != null) {
                qx2 qx2Var2 = this.f7092e;
                p7.g(false);
                qx2Var2.a(p7.i());
            }
            return false;
        }
        zs2.a(this.f7090c, kvVar.f7648k);
        if (((Boolean) sw.c().b(m10.A6)).booleanValue() && kvVar.f7648k) {
            this.f7089b.s().l(true);
        }
        int i7 = ((dd2) ad2Var).f4170a;
        is2 is2Var = this.f7088a;
        is2Var.d(kvVar);
        is2Var.N(i7);
        ks2 f7 = is2Var.f();
        if (f7.f7628n != null) {
            this.f7091d.d().C(f7.f7628n);
        }
        cl1 o7 = this.f7089b.o();
        fa1 fa1Var = new fa1();
        fa1Var.c(this.f7090c);
        fa1Var.f(f7);
        o7.n(fa1Var.g());
        mg1 mg1Var = new mg1();
        mg1Var.n(this.f7091d.d(), this.f7089b.d());
        o7.r(mg1Var.q());
        o7.g(this.f7091d.c());
        o7.h(new q41(null));
        dl1 e7 = o7.e();
        this.f7089b.C().c(1);
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        ScheduledExecutorService e8 = this.f7089b.e();
        z71<d71> a7 = e7.a();
        k71 k71Var = new k71(dc3Var, e8, a7.h(a7.i()));
        this.f7093f = k71Var;
        k71Var.e(new id2(this, bd2Var, p7, e7));
        return true;
    }

    final /* synthetic */ void e() {
        this.f7091d.a().d(dt2.d(4, null, null));
    }

    final /* synthetic */ void f() {
        this.f7091d.a().d(dt2.d(6, null, null));
    }

    @Override // com.google.android.gms.internal.ads.cd2
    public final boolean zza() {
        k71 k71Var = this.f7093f;
        return k71Var != null && k71Var.f();
    }
}
