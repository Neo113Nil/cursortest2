package defpackage;

import android.util.SparseArray;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class g20 {
    public SparseArray a;
    public int b;

    public final f20 a(int i) {
        SparseArray sparseArray = this.a;
        f20 f20Var = (f20) sparseArray.get(i);
        if (f20Var != null) {
            return f20Var;
        }
        f20 f20Var2 = new f20();
        sparseArray.put(i, f20Var2);
        return f20Var2;
    }
}
