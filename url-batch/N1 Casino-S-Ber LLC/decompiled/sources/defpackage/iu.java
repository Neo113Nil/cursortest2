package defpackage;

import android.util.SparseArray;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class iu {
    public final SparseArray a;
    public l70 b;

    public iu(int i) {
        this.a = new SparseArray(i);
    }

    public final void a(l70 l70Var, int i, int i2) {
        int a = l70Var.a(i);
        SparseArray sparseArray = this.a;
        iu iuVar = sparseArray == null ? null : (iu) sparseArray.get(a);
        if (iuVar == null) {
            iuVar = new iu(1);
            sparseArray.put(l70Var.a(i), iuVar);
        }
        if (i2 > i) {
            iuVar.a(l70Var, i + 1, i2);
        } else {
            iuVar.b = l70Var;
        }
    }
}
