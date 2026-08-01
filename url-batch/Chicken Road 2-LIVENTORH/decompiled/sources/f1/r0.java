package f1;

import android.util.SparseArray;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public SparseArray f1484a;

    /* renamed from: b, reason: collision with root package name */
    public int f1485b;

    public final q0 a(int i) {
        SparseArray sparseArray = this.f1484a;
        q0 q0Var = (q0) sparseArray.get(i);
        if (q0Var != null) {
            return q0Var;
        }
        q0 q0Var2 = new q0();
        sparseArray.put(i, q0Var2);
        return q0Var2;
    }
}
