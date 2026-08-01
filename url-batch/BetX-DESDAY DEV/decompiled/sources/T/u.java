package T;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f822a;

    /* renamed from: b, reason: collision with root package name */
    public y f823b;

    public u(int i) {
        this.f822a = new SparseArray(i);
    }

    public final void a(y yVar, int i, int i2) {
        int a2 = yVar.a(i);
        SparseArray sparseArray = this.f822a;
        u uVar = sparseArray == null ? null : (u) sparseArray.get(a2);
        if (uVar == null) {
            uVar = new u(1);
            sparseArray.put(yVar.a(i), uVar);
        }
        if (i2 > i) {
            uVar.a(yVar, i + 1, i2);
        } else {
            uVar.f823b = yVar;
        }
    }
}
