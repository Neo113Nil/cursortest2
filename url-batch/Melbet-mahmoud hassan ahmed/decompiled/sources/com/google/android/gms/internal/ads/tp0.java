package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class tp0 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f12294f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ int f12295g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ xp0 f12296h;

    tp0(xp0 xp0Var, int i7, int i8) {
        this.f12296h = xp0Var;
        this.f12294f = i7;
        this.f12295g = i8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yp0 yp0Var;
        yp0 yp0Var2;
        yp0Var = this.f12296h.f14295w;
        if (yp0Var != null) {
            yp0Var2 = this.f12296h.f14295w;
            yp0Var2.c(this.f12294f, this.f12295g);
        }
    }
}
