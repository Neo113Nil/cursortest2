package defpackage;

import java.util.Set;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ns0 extends zs0 {
    public static final ns0 c = new ns0(0, 1, 1);

    @Override // defpackage.zs0
    public final void a(uh uhVar, b9 b9Var, db1 db1Var, i21 i21Var, at0 at0Var) {
        i11 i11Var = (i11) uhVar.c(0);
        Set set = i21Var.a;
        if (set == null) {
            return;
        }
        dw0 dw0Var = new dw0(set);
        vn0 vn0Var = i21Var.i;
        if (vn0Var == null) {
            long[] jArr = q61.a;
            vn0Var = new vn0();
            i21Var.i = vn0Var;
        }
        vn0Var.m(i11Var, dw0Var);
        i21Var.e.b(new k21(dw0Var, -1));
    }
}
