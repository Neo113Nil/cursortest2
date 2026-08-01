package T;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f843a;

    /* renamed from: b, reason: collision with root package name */
    public z f844b;

    public v(int i) {
        this.f843a = new SparseArray(i);
    }

    public final void a(z zVar, int i, int i2) {
        int a2 = zVar.a(i);
        SparseArray sparseArray = this.f843a;
        v vVar = sparseArray == null ? null : (v) sparseArray.get(a2);
        if (vVar == null) {
            vVar = new v(1);
            sparseArray.put(zVar.a(i), vVar);
        }
        if (i2 > i) {
            vVar.a(zVar, i + 1, i2);
        } else {
            vVar.f844b = zVar;
        }
    }
}
