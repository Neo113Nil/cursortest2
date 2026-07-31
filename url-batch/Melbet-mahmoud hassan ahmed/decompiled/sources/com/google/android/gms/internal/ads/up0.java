package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class up0 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ xp0 f12889f;

    up0(xp0 xp0Var) {
        this.f12889f = xp0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yp0 yp0Var;
        yp0 yp0Var2;
        yp0 yp0Var3;
        yp0Var = this.f12889f.f14295w;
        if (yp0Var != null) {
            yp0Var2 = this.f12889f.f14295w;
            yp0Var2.g();
            yp0Var3 = this.f12889f.f14295w;
            yp0Var3.h();
        }
    }
}
