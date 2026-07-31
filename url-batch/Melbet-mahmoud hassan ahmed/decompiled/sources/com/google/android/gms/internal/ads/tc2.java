package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class tc2 implements bd2<ij1> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ uc2 f12177a;

    tc2(uc2 uc2Var) {
        this.f12177a = uc2Var;
    }

    @Override // com.google.android.gms.internal.ads.bd2
    public final /* bridge */ /* synthetic */ void a(ij1 ij1Var) {
        ij1 ij1Var2;
        ij1 ij1Var3 = ij1Var;
        synchronized (this.f12177a) {
            this.f12177a.f12741l = ij1Var3;
            ij1Var2 = this.f12177a.f12741l;
            ij1Var2.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.bd2
    public final void zza() {
        synchronized (this.f12177a) {
            this.f12177a.f12741l = null;
        }
    }
}
