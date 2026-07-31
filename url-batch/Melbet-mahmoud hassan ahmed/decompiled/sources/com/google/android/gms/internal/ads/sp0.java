package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class sp0 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ xp0 f11901f;

    sp0(xp0 xp0Var) {
        this.f11901f = xp0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yp0 yp0Var;
        yp0 yp0Var2;
        yp0Var = this.f11901f.f14295w;
        if (yp0Var != null) {
            yp0Var2 = this.f11901f.f14295w;
            yp0Var2.f();
        }
    }
}
