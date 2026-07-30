package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class zr0 extends zs0 {
    public static final zr0 c = new zr0(0, 2, 1);

    @Override // defpackage.zs0
    public final void a(uh uhVar, b9 b9Var, db1 db1Var, i21 i21Var, at0 at0Var) {
        int i;
        z90 z90Var = (z90) uhVar.c(0);
        int c2 = db1Var.c((d3) uhVar.c(1));
        if (db1Var.t >= c2) {
            kl.a("Check failed");
        }
        t90.x(db1Var, b9Var, c2);
        int i2 = db1Var.t;
        int i3 = db1Var.v;
        while (i3 >= 0 && !db1Var.y(i3)) {
            i3 = db1Var.E(db1Var.b, i3);
        }
        int i4 = i3 + 1;
        int i5 = 0;
        while (i4 < i2) {
            if (db1Var.v(i2, i4)) {
                if (db1Var.y(i4)) {
                    i5 = 0;
                }
                i4++;
            } else {
                i5 += db1Var.y(i4) ? 1 : db1Var.b[(db1Var.r(i4) * 5) + 1] & 67108863;
                i4 += db1Var.u(i4);
            }
        }
        while (true) {
            i = db1Var.t;
            if (i >= c2) {
                break;
            }
            if (db1Var.v(c2, i)) {
                int i6 = db1Var.t;
                if (i6 < db1Var.u && (db1Var.b[(db1Var.r(i6) * 5) + 1] & 1073741824) != 0) {
                    b9Var.b(db1Var.D(db1Var.t));
                    i5 = 0;
                }
                db1Var.P();
            } else {
                i5 += db1Var.L();
            }
        }
        if (i != c2) {
            kl.a("Check failed");
        }
        z90Var.a = i5;
    }
}
