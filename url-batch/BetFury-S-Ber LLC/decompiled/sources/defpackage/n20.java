package defpackage;

import android.util.SparseArray;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class n20 {
    public final SparseArray a;
    public nk0 b;

    public n20(int i) {
        this.a = new SparseArray(i);
    }

    public final void a(nk0 nk0Var, int i, int i2) {
        int a = nk0Var.a(i);
        SparseArray sparseArray = this.a;
        n20 n20Var = sparseArray == null ? null : (n20) sparseArray.get(a);
        if (n20Var == null) {
            n20Var = new n20(1);
            sparseArray.put(nk0Var.a(i), n20Var);
        }
        if (i2 > i) {
            n20Var.a(nk0Var, i + 1, i2);
        } else {
            n20Var.b = nk0Var;
        }
    }
}
