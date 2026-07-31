package j1;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f5286a;

    /* renamed from: b, reason: collision with root package name */
    public t f5287b;

    public s(int i3) {
        this.f5286a = new SparseArray(i3);
    }

    public final void a(t tVar, int i3, int i4) {
        int a3 = tVar.a(i3);
        SparseArray sparseArray = this.f5286a;
        s sVar = sparseArray == null ? null : (s) sparseArray.get(a3);
        if (sVar == null) {
            sVar = new s(1);
            sparseArray.put(tVar.a(i3), sVar);
        }
        if (i4 > i3) {
            sVar.a(tVar, i3 + 1, i4);
        } else {
            sVar.f5287b = tVar;
        }
    }
}
