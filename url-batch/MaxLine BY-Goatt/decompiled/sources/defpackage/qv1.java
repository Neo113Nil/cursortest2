package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class qv1 extends pw1 {
    public static final qv1 c = new qv1(0, 2, 1);

    @Override // defpackage.pw1
    public final void a(gn gnVar, rh rhVar, zl2 zl2Var, q82 q82Var, qw1 qw1Var) {
        int i;
        v31 v31Var = (v31) gnVar.g(0);
        int c2 = zl2Var.c((m6) gnVar.g(1));
        if (zl2Var.t >= c2) {
            b00.c("Check failed");
        }
        iv1.Q(zl2Var, rhVar, c2);
        int i2 = zl2Var.t;
        int i3 = zl2Var.v;
        while (i3 >= 0 && !zl2Var.x(i3)) {
            i3 = zl2Var.D(zl2Var.b, i3);
        }
        int i4 = i3 + 1;
        int i5 = 0;
        while (i4 < i2) {
            if (zl2Var.u(i2, i4)) {
                if (zl2Var.x(i4)) {
                    i5 = 0;
                }
                i4++;
            } else {
                i5 += zl2Var.x(i4) ? 1 : zl2Var.b[(zl2Var.r(i4) * 5) + 1] & 67108863;
                i4 += zl2Var.t(i4);
            }
        }
        while (true) {
            i = zl2Var.t;
            if (i >= c2) {
                break;
            }
            if (zl2Var.u(c2, i)) {
                int i6 = zl2Var.t;
                if (i6 < zl2Var.u && (zl2Var.b[(zl2Var.r(i6) * 5) + 1] & 1073741824) != 0) {
                    rhVar.c(zl2Var.C(zl2Var.t));
                    i5 = 0;
                }
                zl2Var.O();
            } else {
                i5 += zl2Var.K();
            }
        }
        if (i != c2) {
            b00.c("Check failed");
        }
        v31Var.a = i5;
    }
}
