package T;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f746a;

    /* renamed from: b, reason: collision with root package name */
    public w f747b;

    public s(int i) {
        this.f746a = new SparseArray(i);
    }

    public final void a(w wVar, int i, int i2) {
        int a2 = wVar.a(i);
        SparseArray sparseArray = this.f746a;
        s sVar = sparseArray == null ? null : (s) sparseArray.get(a2);
        if (sVar == null) {
            sVar = new s(1);
            sparseArray.put(wVar.a(i), sVar);
        }
        if (i2 > i) {
            sVar.a(wVar, i + 1, i2);
        } else {
            sVar.f747b = wVar;
        }
    }
}
