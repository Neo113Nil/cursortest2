package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class id2 implements nb3<v61> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bd2 f6615a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ox2 f6616b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ dl1 f6617c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ jd2 f6618d;

    id2(jd2 jd2Var, bd2 bd2Var, ox2 ox2Var, dl1 dl1Var) {
        this.f6618d = jd2Var;
        this.f6615a = bd2Var;
        this.f6616b = ox2Var;
        this.f6617c = dl1Var;
    }

    @Override // com.google.android.gms.internal.ads.nb3
    public final /* bridge */ /* synthetic */ void a(v61 v61Var) {
        zc2 zc2Var;
        bw0 bw0Var;
        qx2 qx2Var;
        v61 v61Var2 = v61Var;
        synchronized (this.f6618d) {
            hf1 e7 = v61Var2.e();
            zc2Var = this.f6618d.f7091d;
            e7.a(zc2Var.d());
            this.f6615a.a(v61Var2);
            bw0Var = this.f6618d.f7089b;
            bw0Var.d().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.gd2
                @Override // java.lang.Runnable
                public final void run() {
                    zc2 zc2Var2;
                    zc2Var2 = id2.this.f6618d.f7091d;
                    zc2Var2.b().m();
                }
            });
            if (this.f6616b != null) {
                qx2Var = this.f6618d.f7092e;
                ox2 ox2Var = this.f6616b;
                ox2Var.d(v61Var2.g().f4313b);
                ox2Var.e(v61Var2.c().b());
                ox2Var.g(true);
                qx2Var.a(ox2Var.i());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.nb3
    public final void b(Throwable th) {
        bw0 bw0Var;
        qx2 qx2Var;
        final cv a7 = this.f6617c.a().a(th);
        this.f6617c.b().d(a7);
        bw0Var = this.f6618d.f7089b;
        bw0Var.d().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.hd2
            @Override // java.lang.Runnable
            public final void run() {
                zc2 zc2Var;
                id2 id2Var = id2.this;
                cv cvVar = a7;
                zc2Var = id2Var.f6618d.f7091d;
                zc2Var.a().d(cvVar);
            }
        });
        zs2.b(a7.f3954f, th, "NativeAdLoader.onFailure");
        this.f6615a.zza();
        if (this.f6616b != null) {
            qx2Var = this.f6618d.f7092e;
            ox2 ox2Var = this.f6616b;
            ox2Var.c(a7);
            ox2Var.g(false);
            qx2Var.a(ox2Var.i());
        }
    }
}
