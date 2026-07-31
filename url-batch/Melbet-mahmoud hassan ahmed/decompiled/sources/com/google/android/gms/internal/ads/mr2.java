package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class mr2 implements bd2<hs1> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ or2 f8694a;

    mr2(or2 or2Var) {
        this.f8694a = or2Var;
    }

    @Override // com.google.android.gms.internal.ads.bd2
    public final /* bridge */ /* synthetic */ void a(hs1 hs1Var) {
        hs1 hs1Var2;
        hs1 hs1Var3 = hs1Var;
        synchronized (this.f8694a) {
            this.f8694a.f9798i = hs1Var3;
            hs1Var2 = this.f8694a.f9798i;
            hs1Var2.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.bd2
    public final void zza() {
        synchronized (this.f8694a) {
            this.f8694a.f9798i = null;
        }
    }
}
