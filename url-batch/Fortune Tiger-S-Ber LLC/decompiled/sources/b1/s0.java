package b1;

import android.util.SparseArray;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public SparseArray f911a;

    /* renamed from: b, reason: collision with root package name */
    public int f912b;

    public final r0 a(int i4) {
        SparseArray sparseArray = this.f911a;
        r0 r0Var = (r0) sparseArray.get(i4);
        if (r0Var != null) {
            return r0Var;
        }
        r0 r0Var2 = new r0();
        sparseArray.put(i4, r0Var2);
        return r0Var2;
    }
}
