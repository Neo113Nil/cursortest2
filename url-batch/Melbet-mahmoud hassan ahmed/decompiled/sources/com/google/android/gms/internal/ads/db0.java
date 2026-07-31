package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class db0 implements dp0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ mb0 f4150a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ nb0 f4151b;

    db0(nb0 nb0Var, mb0 mb0Var) {
        this.f4151b = nb0Var;
        this.f4150a = mb0Var;
    }

    @Override // com.google.android.gms.internal.ads.dp0
    public final void zza() {
        Object obj;
        obj = this.f4151b.f9012a;
        synchronized (obj) {
            this.f4151b.f9019h = 1;
            a3.r1.k("Failed loading new engine. Marking new engine destroyable.");
            this.f4150a.g();
        }
    }
}
