package f0;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    public SparseArray f2085a;

    /* renamed from: b, reason: collision with root package name */
    public int f2086b;

    public final M a(int i) {
        SparseArray sparseArray = this.f2085a;
        M m2 = (M) sparseArray.get(i);
        if (m2 != null) {
            return m2;
        }
        M m3 = new M();
        sparseArray.put(i, m3);
        return m3;
    }
}
