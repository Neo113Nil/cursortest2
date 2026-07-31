package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class fq0 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ boolean f5174f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ gq0 f5175g;

    fq0(gq0 gq0Var, boolean z6) {
        this.f5175g = gq0Var;
        this.f5174f = z6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5175g.r("windowVisibilityChanged", "isVisible", String.valueOf(this.f5174f));
    }
}
