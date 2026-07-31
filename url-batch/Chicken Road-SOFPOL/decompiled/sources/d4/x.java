package d4;

import android.util.SparseArray;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f2303a;

    /* renamed from: b, reason: collision with root package name */
    public a0 f2304b;

    public x(int i) {
        this.f2303a = new SparseArray(i);
    }

    public final void a(a0 a0Var, int i, int i8) {
        int a8 = a0Var.a(i);
        SparseArray sparseArray = this.f2303a;
        x xVar = sparseArray == null ? null : (x) sparseArray.get(a8);
        if (xVar == null) {
            xVar = new x(1);
            sparseArray.put(a0Var.a(i), xVar);
        }
        if (i8 > i) {
            xVar.a(a0Var, i + 1, i8);
        } else {
            xVar.f2304b = a0Var;
        }
    }
}
