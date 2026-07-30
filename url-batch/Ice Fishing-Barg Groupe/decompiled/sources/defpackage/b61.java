package defpackage;

import android.util.SparseArray;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class b61 {
    public final SparseArray PxuCJdSBwIXG;
    public xm2 lS5Rgt96tfkO;

    public b61(int i) {
        this.PxuCJdSBwIXG = new SparseArray(i);
    }

    public final void PxuCJdSBwIXG(xm2 xm2Var, int i, int i2) {
        int PxuCJdSBwIXG = xm2Var.PxuCJdSBwIXG(i);
        SparseArray sparseArray = this.PxuCJdSBwIXG;
        b61 b61Var = sparseArray == null ? null : (b61) sparseArray.get(PxuCJdSBwIXG);
        if (b61Var == null) {
            b61Var = new b61(1);
            sparseArray.put(xm2Var.PxuCJdSBwIXG(i), b61Var);
        }
        if (i2 > i) {
            b61Var.PxuCJdSBwIXG(xm2Var, i + 1, i2);
        } else {
            b61Var.lS5Rgt96tfkO = xm2Var;
        }
    }
}
