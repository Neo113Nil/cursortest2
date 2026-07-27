package k1;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f7406a;

    /* renamed from: b, reason: collision with root package name */
    public q f7407b;

    public p(int i2) {
        this.f7406a = new SparseArray(i2);
    }

    public final void a(q qVar, int i2, int i4) {
        int a4 = qVar.a(i2);
        SparseArray sparseArray = this.f7406a;
        p pVar = sparseArray == null ? null : (p) sparseArray.get(a4);
        if (pVar == null) {
            pVar = new p(1);
            sparseArray.put(qVar.a(i2), pVar);
        }
        if (i4 > i2) {
            pVar.a(qVar, i2 + 1, i4);
        } else {
            pVar.f7407b = qVar;
        }
    }
}
