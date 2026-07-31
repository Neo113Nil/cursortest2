package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class hr2 implements bd2<hs1> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ir2 f6392a;

    hr2(ir2 ir2Var) {
        this.f6392a = ir2Var;
    }

    @Override // com.google.android.gms.internal.ads.bd2
    public final /* bridge */ /* synthetic */ void a(hs1 hs1Var) {
        hs1 hs1Var2;
        hs1 hs1Var3 = hs1Var;
        synchronized (this.f6392a) {
            this.f6392a.f6758k = hs1Var3;
            hs1Var2 = this.f6392a.f6758k;
            hs1Var2.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.bd2
    public final void zza() {
        synchronized (this.f6392a) {
            this.f6392a.f6758k = null;
        }
    }
}
