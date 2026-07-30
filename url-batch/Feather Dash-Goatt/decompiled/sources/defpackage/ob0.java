package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ob0 extends mb0 {
    public final qb0 l;
    public final pb0 m;
    public final ug n;
    public final Object o;

    public ob0(qb0 qb0Var, pb0 pb0Var, ug ugVar, Object obj) {
        this.l = qb0Var;
        this.m = pb0Var;
        this.n = ugVar;
        this.o = obj;
    }

    @Override // defpackage.mb0
    public final boolean r() {
        return false;
    }

    @Override // defpackage.mb0
    public final void s(Throwable th) {
        ug ugVar = this.n;
        ug b0 = qb0.b0(ugVar);
        qb0 qb0Var = this.l;
        pb0 pb0Var = this.m;
        Object obj = this.o;
        if (b0 == null || !qb0Var.o0(pb0Var, b0, obj)) {
            pb0Var.d.e(new wh0(2), 2);
            ug b02 = qb0.b0(ugVar);
            if (b02 == null || !qb0Var.o0(pb0Var, b02, obj)) {
                qb0Var.A(qb0Var.L(pb0Var, obj));
            }
        }
    }
}
