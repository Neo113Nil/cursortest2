package defpackage;

import android.util.SparseArray;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class tl0 {
    public final SparseArray a;
    public yj1 b;

    public tl0(int i) {
        this.a = new SparseArray(i);
    }

    public final void a(yj1 yj1Var, int i, int i2) {
        int a = yj1Var.a(i);
        SparseArray sparseArray = this.a;
        tl0 tl0Var = sparseArray == null ? null : (tl0) sparseArray.get(a);
        if (tl0Var == null) {
            tl0Var = new tl0(1);
            sparseArray.put(yj1Var.a(i), tl0Var);
        }
        if (i2 > i) {
            tl0Var.a(yj1Var, i + 1, i2);
        } else {
            tl0Var.b = yj1Var;
        }
    }
}
