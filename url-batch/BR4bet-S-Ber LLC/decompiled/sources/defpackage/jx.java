package defpackage;

import android.util.SparseArray;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class jx {
    public final SparseArray a;
    public sa0 b;

    public jx(int i) {
        this.a = new SparseArray(i);
    }

    public final void a(sa0 sa0Var, int i, int i2) {
        int a = sa0Var.a(i);
        SparseArray sparseArray = this.a;
        jx jxVar = sparseArray == null ? null : (jx) sparseArray.get(a);
        if (jxVar == null) {
            jxVar = new jx(1);
            sparseArray.put(sa0Var.a(i), jxVar);
        }
        if (i2 > i) {
            jxVar.a(sa0Var, i + 1, i2);
        } else {
            jxVar.b = sa0Var;
        }
    }
}
