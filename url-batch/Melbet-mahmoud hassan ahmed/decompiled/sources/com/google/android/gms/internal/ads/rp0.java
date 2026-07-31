package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class rp0 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f11310f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f11311g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ xp0 f11312h;

    rp0(xp0 xp0Var, String str, String str2) {
        this.f11312h = xp0Var;
        this.f11310f = str;
        this.f11311g = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yp0 yp0Var;
        yp0 yp0Var2;
        yp0Var = this.f11312h.f14295w;
        if (yp0Var != null) {
            yp0Var2 = this.f11312h.f14295w;
            yp0Var2.a(this.f11310f, this.f11311g);
        }
    }
}
