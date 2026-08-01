package defpackage;

import android.util.SparseArray;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class n80 {
    public SparseArray a;
    public int b;

    public final m80 a(int i) {
        SparseArray sparseArray = this.a;
        m80 m80Var = (m80) sparseArray.get(i);
        if (m80Var != null) {
            return m80Var;
        }
        m80 m80Var2 = new m80();
        sparseArray.put(i, m80Var2);
        return m80Var2;
    }
}
