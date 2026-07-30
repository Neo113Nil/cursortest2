package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class nb0 extends tf {
    public final qb0 o;

    public nb0(dn dnVar, qb0 qb0Var) {
        super(1, dnVar);
        this.o = qb0Var;
    }

    @Override // defpackage.tf
    public final String D() {
        return "AwaitContinuation";
    }

    @Override // defpackage.tf
    public final Throwable q(qb0 qb0Var) {
        Throwable e;
        Object R = this.o.R();
        return (!(R instanceof pb0) || (e = ((pb0) R).e()) == null) ? R instanceof hj ? ((hj) R).a : qb0Var.o() : e;
    }
}
