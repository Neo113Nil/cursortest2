package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class sa2<AdT> implements a52<AdT> {

    /* renamed from: a, reason: collision with root package name */
    private final i20 f11745a;

    /* renamed from: b, reason: collision with root package name */
    private final dc3 f11746b;

    /* renamed from: c, reason: collision with root package name */
    private final nw2 f11747c;

    /* renamed from: d, reason: collision with root package name */
    private final bb2 f11748d;

    /* JADX WARN: Multi-variable type inference failed */
    public sa2(nw2 nw2Var, nw2 nw2Var2, dc3 dc3Var, i20 i20Var, bb2 bb2Var) {
        this.f11747c = nw2Var;
        this.f11746b = nw2Var2;
        this.f11745a = dc3Var;
        this.f11748d = i20Var;
    }

    @Override // com.google.android.gms.internal.ads.a52
    public final cc3<AdT> a(ds2 ds2Var, rr2 rr2Var) {
        bp0 bp0Var = new bp0();
        xa2 xa2Var = new xa2();
        xa2Var.d(new ra2(this, bp0Var, ds2Var, rr2Var, xa2Var));
        wr2 wr2Var = rr2Var.f11397t;
        final c20 c20Var = new c20(xa2Var, wr2Var.f13927b, wr2Var.f13926a);
        nw2 nw2Var = this.f11747c;
        return wv2.d(new qv2() { // from class: com.google.android.gms.internal.ads.qa2
            @Override // com.google.android.gms.internal.ads.qv2
            public final void zza() {
                sa2.this.c(c20Var);
            }
        }, this.f11746b, gw2.CUSTOM_RENDER_SYN, nw2Var).b(gw2.CUSTOM_RENDER_ACK).d(bp0Var).a();
    }

    @Override // com.google.android.gms.internal.ads.a52
    public final boolean b(ds2 ds2Var, rr2 rr2Var) {
        wr2 wr2Var;
        return (this.f11745a == null || (wr2Var = rr2Var.f11397t) == null || wr2Var.f13926a == null) ? false : true;
    }

    final /* synthetic */ void c(c20 c20Var) {
        this.f11745a.W1(c20Var);
    }
}
