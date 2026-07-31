package w4;

import android.util.SparseArray;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public SparseArray f7927a;

    /* renamed from: b, reason: collision with root package name */
    public int f7928b;

    public final h0 a(int i) {
        SparseArray sparseArray = this.f7927a;
        h0 h0Var = (h0) sparseArray.get(i);
        if (h0Var != null) {
            return h0Var;
        }
        h0 h0Var2 = new h0();
        sparseArray.put(i, h0Var2);
        return h0Var2;
    }
}
