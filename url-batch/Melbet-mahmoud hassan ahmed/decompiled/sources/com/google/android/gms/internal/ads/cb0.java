package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class cb0 implements fp0<ha0> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ mb0 f3787a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ nb0 f3788b;

    cb0(nb0 nb0Var, mb0 mb0Var) {
        this.f3788b = nb0Var;
        this.f3787a = mb0Var;
    }

    @Override // com.google.android.gms.internal.ads.fp0
    public final /* bridge */ /* synthetic */ void c(ha0 ha0Var) {
        Object obj;
        mb0 mb0Var;
        mb0 mb0Var2;
        mb0 mb0Var3;
        obj = this.f3788b.f9012a;
        synchronized (obj) {
            this.f3788b.f9019h = 0;
            mb0Var = this.f3788b.f9018g;
            if (mb0Var != null) {
                mb0 mb0Var4 = this.f3787a;
                mb0Var2 = this.f3788b.f9018g;
                if (mb0Var4 != mb0Var2) {
                    a3.r1.k("New JS engine is loaded, marking previous one as destroyable.");
                    mb0Var3 = this.f3788b.f9018g;
                    mb0Var3.g();
                }
            }
            this.f3788b.f9018g = this.f3787a;
        }
    }
}
