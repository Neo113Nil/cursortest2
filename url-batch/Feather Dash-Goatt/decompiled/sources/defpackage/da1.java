package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class da1 extends x0 {
    public long a;
    public tf b;

    @Override // defpackage.x0
    public final boolean a(w0 w0Var) {
        ca1 ca1Var = (ca1) w0Var;
        if (this.a >= 0) {
            return false;
        }
        long j = ca1Var.m;
        if (j < ca1Var.n) {
            ca1Var.n = j;
        }
        this.a = j;
        return true;
    }

    @Override // defpackage.x0
    public final dn[] b(w0 w0Var) {
        long j = this.a;
        this.a = -1L;
        this.b = null;
        return ((ca1) w0Var).v(j);
    }
}
