package defpackage;

import java.util.List;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class wr0 extends zs0 {
    public static final wr0 c = new wr0(0, 2, 1);

    @Override // defpackage.zs0
    public final void a(uh uhVar, b9 b9Var, db1 db1Var, i21 i21Var, at0 at0Var) {
        int i = ((z90) uhVar.c(0)).a;
        List list = (List) uhVar.c(1);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            int i3 = i + i2;
            b9Var.a(i3, obj);
            b9Var.d(i3, obj);
        }
    }
}
