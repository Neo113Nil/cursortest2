package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class vn2 implements nb3<t41> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bd2 f13461a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ox2 f13462b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ r51 f13463c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ wn2 f13464d;

    vn2(wn2 wn2Var, bd2 bd2Var, ox2 ox2Var, r51 r51Var) {
        this.f13464d = wn2Var;
        this.f13461a = bd2Var;
        this.f13462b = ox2Var;
        this.f13463c = r51Var;
    }

    @Override // com.google.android.gms.internal.ads.nb3
    public final /* bridge */ /* synthetic */ void a(t41 t41Var) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        nd1 nd1Var;
        qx2 qx2Var;
        Executor executor;
        final lc2 lc2Var;
        lc2 lc2Var2;
        qc2 qc2Var;
        t41 t41Var2 = t41Var;
        synchronized (this.f13464d) {
            this.f13464d.f13886k = null;
            viewGroup = this.f13464d.f13881f;
            viewGroup.removeAllViews();
            if (t41Var2.i() != null) {
                ViewParent parent = t41Var2.i().getParent();
                if (parent instanceof ViewGroup) {
                    String b7 = t41Var2.c() != null ? t41Var2.c().b() : "";
                    StringBuilder sb = new StringBuilder(String.valueOf(b7).length() + 78);
                    sb.append("Banner view provided from ");
                    sb.append(b7);
                    sb.append(" already has a parent view. Removing its old parent.");
                    io0.g(sb.toString());
                    ((ViewGroup) parent).removeView(t41Var2.i());
                }
            }
            e10<Boolean> e10Var = m10.V5;
            if (((Boolean) sw.c().b(e10Var)).booleanValue()) {
                hf1 e7 = t41Var2.e();
                lc2Var2 = this.f13464d.f13879d;
                e7.a(lc2Var2);
                qc2Var = this.f13464d.f13880e;
                e7.c(qc2Var);
            }
            viewGroup2 = this.f13464d.f13881f;
            viewGroup2.addView(t41Var2.i());
            this.f13461a.a(t41Var2);
            if (((Boolean) sw.c().b(e10Var)).booleanValue()) {
                executor = this.f13464d.f13877b;
                lc2Var = this.f13464d.f13879d;
                lc2Var.getClass();
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.tn2
                    @Override // java.lang.Runnable
                    public final void run() {
                        lc2.this.m();
                    }
                });
            }
            nd1Var = this.f13464d.f13883h;
            nd1Var.S0(t41Var2.h());
            if (this.f13462b != null) {
                qx2Var = this.f13464d.f13884i;
                ox2 ox2Var = this.f13462b;
                ox2Var.d(t41Var2.g().f4313b);
                ox2Var.e(t41Var2.c().b());
                ox2Var.g(true);
                qx2Var.a(ox2Var.i());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.nb3
    public final void b(Throwable th) {
        nd1 nd1Var;
        qx2 qx2Var;
        Executor executor;
        final cv a7 = this.f13463c.d().a(th);
        synchronized (this.f13464d) {
            this.f13464d.f13886k = null;
            this.f13463c.e().d(a7);
            if (((Boolean) sw.c().b(m10.V5)).booleanValue()) {
                executor = this.f13464d.f13877b;
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.un2
                    @Override // java.lang.Runnable
                    public final void run() {
                        lc2 lc2Var;
                        vn2 vn2Var = vn2.this;
                        cv cvVar = a7;
                        lc2Var = vn2Var.f13464d.f13879d;
                        lc2Var.d(cvVar);
                    }
                });
            }
            nd1Var = this.f13464d.f13883h;
            nd1Var.S0(60);
            zs2.b(a7.f3954f, th, "BannerAdLoader.onFailure");
            this.f13461a.zza();
            if (this.f13462b != null) {
                qx2Var = this.f13464d.f13884i;
                ox2 ox2Var = this.f13462b;
                ox2Var.c(a7);
                ox2Var.g(false);
                qx2Var.a(ox2Var.i());
            }
        }
    }
}
