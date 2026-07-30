package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public interface y81 extends tl1 {
    default int a(qg1 qg1Var, jj1 jj1Var, int i) {
        return j(new s41(qg1Var, qg1Var.getLayoutDirection()), new i80(jj1Var, wj1.n, xj1.m, 1), v10.b(0, i, 7)).e();
    }

    default int c(qg1 qg1Var, jj1 jj1Var, int i) {
        return j(new s41(qg1Var, qg1Var.getLayoutDirection()), new i80(jj1Var, wj1.n, xj1.n, 1), v10.b(i, 0, 13)).c();
    }

    default int e(qg1 qg1Var, jj1 jj1Var, int i) {
        return j(new s41(qg1Var, qg1Var.getLayoutDirection()), new i80(jj1Var, wj1.m, xj1.n, 1), v10.b(i, 0, 13)).c();
    }

    default int h(qg1 qg1Var, jj1 jj1Var, int i) {
        return j(new s41(qg1Var, qg1Var.getLayoutDirection()), new i80(jj1Var, wj1.m, xj1.m, 1), v10.b(0, i, 7)).e();
    }

    pj1 j(qj1 qj1Var, jj1 jj1Var, long j);
}
