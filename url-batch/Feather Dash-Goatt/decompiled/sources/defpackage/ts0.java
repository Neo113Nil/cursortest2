package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ts0 extends zs0 {
    public static final ts0 c = new ts0(0, 1, 1);

    @Override // defpackage.zs0
    public final void a(uh uhVar, b9 b9Var, db1 db1Var, i21 i21Var, at0 at0Var) {
        i11 i11Var = (i11) uhVar.c(0);
        vn0 vn0Var = i21Var.i;
        dw0 dw0Var = vn0Var != null ? (dw0) vn0Var.g(i11Var) : null;
        if (dw0Var != null) {
            ArrayList arrayList = i21Var.j;
            if (arrayList == null) {
                arrayList = new ArrayList();
                i21Var.j = arrayList;
            }
            arrayList.add(i21Var.e);
            i21Var.e = dw0Var.e;
        }
    }
}
