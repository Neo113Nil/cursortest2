package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class vp0 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ xp0 f13469f;

    vp0(xp0 xp0Var) {
        this.f13469f = xp0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yp0 yp0Var;
        boolean z6;
        yp0 yp0Var2;
        yp0 yp0Var3;
        yp0Var = this.f13469f.f14295w;
        if (yp0Var != null) {
            z6 = this.f13469f.f14296x;
            if (!z6) {
                yp0Var3 = this.f13469f.f14295w;
                yp0Var3.e();
                this.f13469f.f14296x = true;
            }
            yp0Var2 = this.f13469f.f14295w;
            yp0Var2.b();
        }
    }
}
