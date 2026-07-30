package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class um1 implements qm1 {
    public final sm1 d;
    public final q21 e;
    public final long g;
    public final long h = 0;

    public um1(sm1 sm1Var, q21 q21Var) {
        this.d = sm1Var;
        this.e = q21Var;
        this.g = (sm1Var.l() + sm1Var.g()) * 1000000;
    }

    @Override // defpackage.qm1
    public final boolean a() {
        return true;
    }

    @Override // defpackage.qm1
    public final long b(v7 v7Var, v7 v7Var2, v7 v7Var3) {
        return Long.MAX_VALUE;
    }

    public final long c(long j) {
        long j2 = this.h;
        if (j + j2 <= 0) {
            return 0L;
        }
        long j3 = j + j2;
        long j4 = this.g;
        long j5 = j3 / j4;
        return (this.e == q21.d || j5 % 2 == 0) ? j3 - (j5 * j4) : ((j5 + 1) * j4) - j3;
    }

    public final v7 d(long j, v7 v7Var, v7 v7Var2, v7 v7Var3) {
        long j2 = this.h;
        long j3 = j + j2;
        long j4 = this.g;
        return j3 > j4 ? this.d.h(j4 - j2, v7Var, v7Var3, v7Var2) : v7Var2;
    }

    @Override // defpackage.qm1
    public final v7 h(long j, v7 v7Var, v7 v7Var2, v7 v7Var3) {
        return this.d.h(c(j), v7Var, v7Var2, d(j, v7Var, v7Var3, v7Var2));
    }

    @Override // defpackage.qm1
    public final v7 m(long j, v7 v7Var, v7 v7Var2, v7 v7Var3) {
        return this.d.m(c(j), v7Var, v7Var2, d(j, v7Var, v7Var3, v7Var2));
    }
}
