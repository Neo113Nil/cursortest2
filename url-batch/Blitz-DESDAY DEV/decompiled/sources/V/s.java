package V;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f909a;

    /* renamed from: b, reason: collision with root package name */
    public v f910b;

    public s(int i) {
        this.f909a = new SparseArray(i);
    }

    public final void a(v vVar, int i, int i2) {
        int a2 = vVar.a(i);
        SparseArray sparseArray = this.f909a;
        s sVar = sparseArray == null ? null : (s) sparseArray.get(a2);
        if (sVar == null) {
            sVar = new s(1);
            sparseArray.put(vVar.a(i), sVar);
        }
        if (i2 > i) {
            sVar.a(vVar, i + 1, i2);
        } else {
            sVar.f910b = vVar;
        }
    }
}
