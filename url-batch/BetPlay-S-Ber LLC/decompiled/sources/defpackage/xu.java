package defpackage;

import android.util.SparseArray;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class xu {
    public final SparseArray a;
    public s70 b;

    public xu(int i) {
        this.a = new SparseArray(i);
    }

    public final void a(s70 s70Var, int i, int i2) {
        int a = s70Var.a(i);
        SparseArray sparseArray = this.a;
        xu xuVar = sparseArray == null ? null : (xu) sparseArray.get(a);
        if (xuVar == null) {
            xuVar = new xu(1);
            sparseArray.put(s70Var.a(i), xuVar);
        }
        if (i2 > i) {
            xuVar.a(s70Var, i + 1, i2);
        } else {
            xuVar.b = s70Var;
        }
    }
}
