package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class l31 extends mb0 {
    public final nb0 l;

    public l31(nb0 nb0Var) {
        this.l = nb0Var;
    }

    @Override // defpackage.mb0
    public final boolean r() {
        return false;
    }

    @Override // defpackage.mb0
    public final void s(Throwable th) {
        Object R = q().R();
        boolean z = R instanceof hj;
        nb0 nb0Var = this.l;
        if (z) {
            i31 i31Var = k31.d;
            nb0Var.l(ca0.g(((hj) R).a));
        } else {
            i31 i31Var2 = k31.d;
            nb0Var.l(yr1.f0(R));
        }
    }
}
