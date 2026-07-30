package defpackage;

import android.util.SparseArray;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ml1 {
    public final SparseArray a;
    public e13 b;

    public ml1(int i) {
        this.a = new SparseArray(i);
    }

    public final void a(e13 e13Var, int i, int i2) {
        int a = e13Var.a(i);
        SparseArray sparseArray = this.a;
        ml1 ml1Var = sparseArray == null ? null : (ml1) sparseArray.get(a);
        if (ml1Var == null) {
            ml1Var = new ml1(1);
            sparseArray.put(e13Var.a(i), ml1Var);
        }
        if (i2 > i) {
            ml1Var.a(e13Var, i + 1, i2);
        } else {
            ml1Var.b = e13Var;
        }
    }
}
