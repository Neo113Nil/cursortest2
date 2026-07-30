package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class l61 extends j61 {
    public final n61 t;
    public final m61 u;
    public final cu v;
    public final Object w;

    public l61(n61 n61Var, m61 m61Var, cu cuVar, Object obj) {
        this.t = n61Var;
        this.u = m61Var;
        this.v = cuVar;
        this.w = obj;
    }

    @Override // defpackage.j61
    public final boolean r() {
        return false;
    }

    @Override // defpackage.j61
    public final void s(Throwable th) {
        cu cuVar = this.v;
        cu X = n61.X(cuVar);
        n61 n61Var = this.t;
        m61 m61Var = this.u;
        Object obj = this.w;
        if (X == null || !n61Var.k0(m61Var, X, obj)) {
            m61Var.m.e(new me1(2), 2);
            cu X2 = n61.X(cuVar);
            if (X2 == null || !n61Var.k0(m61Var, X2, obj)) {
                n61Var.k(n61Var.F(m61Var, obj));
            }
        }
    }
}
