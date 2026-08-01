package U;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f1116a;

    /* renamed from: b, reason: collision with root package name */
    public x f1117b;

    public u(int i) {
        this.f1116a = new SparseArray(i);
    }

    public final void a(x xVar, int i, int i2) {
        int a2 = xVar.a(i);
        SparseArray sparseArray = this.f1116a;
        u uVar = sparseArray == null ? null : (u) sparseArray.get(a2);
        if (uVar == null) {
            uVar = new u(1);
            sparseArray.put(xVar.a(i), uVar);
        }
        if (i2 > i) {
            uVar.a(xVar, i + 1, i2);
        } else {
            uVar.f1117b = xVar;
        }
    }
}
