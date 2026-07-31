package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class j71 implements nb3<v61> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ nb3 f7004a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ k71 f7005b;

    j71(k71 k71Var, nb3 nb3Var) {
        this.f7005b = k71Var;
        this.f7004a = nb3Var;
    }

    @Override // com.google.android.gms.internal.ads.nb3
    public final /* bridge */ /* synthetic */ void a(v61 v61Var) {
        wo0.f13898e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.g71
            @Override // java.lang.Runnable
            public final void run() {
                k71.this.d();
            }
        });
        this.f7004a.a(v61Var);
    }

    @Override // com.google.android.gms.internal.ads.nb3
    public final void b(Throwable th) {
        wo0.f13898e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.g71
            @Override // java.lang.Runnable
            public final void run() {
                k71.this.d();
            }
        });
        this.f7004a.b(th);
    }
}
