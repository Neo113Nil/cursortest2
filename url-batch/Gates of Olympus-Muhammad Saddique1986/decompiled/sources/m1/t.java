package m1;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f6979a;

    /* renamed from: b, reason: collision with root package name */
    public u f6980b;

    public t(int i3) {
        this.f6979a = new SparseArray(i3);
    }

    public final void a(u uVar, int i3, int i4) {
        int a3 = uVar.a(i3);
        SparseArray sparseArray = this.f6979a;
        t tVar = sparseArray == null ? null : (t) sparseArray.get(a3);
        if (tVar == null) {
            tVar = new t(1);
            sparseArray.put(uVar.a(i3), tVar);
        }
        if (i4 > i3) {
            tVar.a(uVar, i3 + 1, i4);
        } else {
            tVar.f6980b = uVar;
        }
    }
}
