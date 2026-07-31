package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class ea2 implements gc1 {

    /* renamed from: a, reason: collision with root package name */
    boolean f4538a = false;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ d52 f4539b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bp0 f4540c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ fa2 f4541d;

    ea2(fa2 fa2Var, d52 d52Var, bp0 bp0Var) {
        this.f4541d = fa2Var;
        this.f4539b = d52Var;
        this.f4540c = bp0Var;
    }

    private final void a(cv cvVar) {
        this.f4540c.f(new e52(true == ((Boolean) sw.c().b(m10.T3)).booleanValue() ? 3 : 1, cvVar));
    }

    @Override // com.google.android.gms.internal.ads.gc1
    public final void d(int i7) {
        if (this.f4538a) {
            return;
        }
        a(new cv(i7, fa2.e(this.f4539b.f4071a, i7), "undefined", null, null));
    }

    @Override // com.google.android.gms.internal.ads.gc1
    public final synchronized void e(int i7, String str) {
        if (this.f4538a) {
            return;
        }
        this.f4538a = true;
        if (str == null) {
            str = fa2.e(this.f4539b.f4071a, i7);
        }
        a(new cv(i7, str, "undefined", null, null));
    }

    @Override // com.google.android.gms.internal.ads.gc1
    public final synchronized void g() {
        this.f4540c.e(null);
    }

    @Override // com.google.android.gms.internal.ads.gc1
    public final synchronized void o0(cv cvVar) {
        this.f4538a = true;
        a(cvVar);
    }
}
