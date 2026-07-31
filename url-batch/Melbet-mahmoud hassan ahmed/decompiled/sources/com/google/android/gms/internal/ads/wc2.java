package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class wc2 implements bd2<v61> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ xc2 f13792a;

    wc2(xc2 xc2Var) {
        this.f13792a = xc2Var;
    }

    @Override // com.google.android.gms.internal.ads.bd2
    public final /* bridge */ /* synthetic */ void a(v61 v61Var) {
        synchronized (this.f13792a) {
            this.f13792a.f14147c = v61Var.c();
            v61Var.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.bd2
    public final void zza() {
        synchronized (this.f13792a) {
        }
    }
}
