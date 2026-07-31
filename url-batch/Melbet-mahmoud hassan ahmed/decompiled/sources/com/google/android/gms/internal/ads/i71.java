package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class i71 implements nb3<d71> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ nb3 f6555a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ k71 f6556b;

    i71(k71 k71Var, nb3 nb3Var) {
        this.f6556b = k71Var;
        this.f6555a = nb3Var;
    }

    @Override // com.google.android.gms.internal.ads.nb3
    public final /* bridge */ /* synthetic */ void a(d71 d71Var) {
        k71.b(this.f6556b, d71Var.f4100a, this.f6555a);
    }

    @Override // com.google.android.gms.internal.ads.nb3
    public final void b(Throwable th) {
        this.f6555a.b(th);
        wo0.f13898e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.g71
            @Override // java.lang.Runnable
            public final void run() {
                k71.this.d();
            }
        });
    }
}
