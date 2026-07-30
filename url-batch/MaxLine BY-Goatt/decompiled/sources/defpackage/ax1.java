package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ax1 extends bx1 {
    public final ub2 a;
    public final oa b;

    public ax1(ub2 ub2Var) {
        oa oaVar;
        this.a = ub2Var;
        if (l41.O(ub2Var)) {
            oaVar = null;
        } else {
            oaVar = qa.a();
            oa.a(oaVar, ub2Var);
        }
        this.b = oaVar;
    }

    @Override // defpackage.bx1
    public final w72 a() {
        ub2 ub2Var = this.a;
        return new w72(ub2Var.a, ub2Var.b, ub2Var.c, ub2Var.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ax1) {
            return this.a.equals(((ax1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
