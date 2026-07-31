package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class lc0 {

    /* renamed from: a, reason: collision with root package name */
    private final nb0 f7921a;

    /* renamed from: b, reason: collision with root package name */
    private cc3<ob0> f7922b;

    lc0(nb0 nb0Var) {
        this.f7921a = nb0Var;
    }

    private final void d() {
        if (this.f7922b == null) {
            final bp0 bp0Var = new bp0();
            this.f7922b = bp0Var;
            this.f7921a.b(null).e(new fp0() { // from class: com.google.android.gms.internal.ads.ic0
                @Override // com.google.android.gms.internal.ads.fp0
                public final void c(Object obj) {
                    bp0.this.e((ob0) obj);
                }
            }, new dp0() { // from class: com.google.android.gms.internal.ads.hc0
                @Override // com.google.android.gms.internal.ads.dp0
                public final void zza() {
                    bp0.this.f(new qb0("Cannot get Javascript Engine"));
                }
            });
        }
    }

    public final <I, O> oc0<I, O> a(String str, vb0<I> vb0Var, tb0<O> tb0Var) {
        d();
        return new oc0<>(this.f7922b, "google.afma.activeView.handleUpdate", vb0Var, tb0Var);
    }

    public final void b(final String str, final t70<? super ob0> t70Var) {
        d();
        this.f7922b = rb3.n(this.f7922b, new xa3() { // from class: com.google.android.gms.internal.ads.kc0
            @Override // com.google.android.gms.internal.ads.xa3
            public final cc3 c(Object obj) {
                ob0 ob0Var = (ob0) obj;
                ob0Var.X(str, t70Var);
                return rb3.i(ob0Var);
            }
        }, wo0.f13899f);
    }

    public final void c(final String str, final t70<? super ob0> t70Var) {
        this.f7922b = rb3.m(this.f7922b, new e43() { // from class: com.google.android.gms.internal.ads.jc0
            @Override // com.google.android.gms.internal.ads.e43
            public final Object apply(Object obj) {
                ob0 ob0Var = (ob0) obj;
                ob0Var.U0(str, t70Var);
                return ob0Var;
            }
        }, wo0.f13899f);
    }
}
