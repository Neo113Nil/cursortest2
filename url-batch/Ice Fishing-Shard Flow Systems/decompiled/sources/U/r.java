package U;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f2700a;

    /* renamed from: b, reason: collision with root package name */
    public n f2701b;

    public r(int i2) {
        this.f2700a = new SparseArray(i2);
    }

    public final void a(n nVar, int i2, int i5) {
        int a7 = nVar.a(i2);
        SparseArray sparseArray = this.f2700a;
        r rVar = sparseArray == null ? null : (r) sparseArray.get(a7);
        if (rVar == null) {
            rVar = new r(1);
            sparseArray.put(nVar.a(i2), rVar);
        }
        if (i5 > i2) {
            rVar.a(nVar, i2 + 1, i5);
        } else {
            rVar.f2701b = nVar;
        }
    }
}
