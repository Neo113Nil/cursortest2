package T;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f740a;

    /* renamed from: b, reason: collision with root package name */
    public w f741b;

    public s(int i) {
        this.f740a = new SparseArray(i);
    }

    public final void a(w wVar, int i, int i2) {
        int a2 = wVar.a(i);
        SparseArray sparseArray = this.f740a;
        s sVar = sparseArray == null ? null : (s) sparseArray.get(a2);
        if (sVar == null) {
            sVar = new s(1);
            sparseArray.put(wVar.a(i), sVar);
        }
        if (i2 > i) {
            sVar.a(wVar, i + 1, i2);
        } else {
            sVar.f741b = wVar;
        }
    }
}
