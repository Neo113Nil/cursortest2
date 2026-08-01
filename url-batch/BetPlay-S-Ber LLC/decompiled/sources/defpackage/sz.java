package defpackage;

import android.util.SparseArray;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class sz {
    public SparseArray a;
    public int b;

    public final rz a(int i) {
        SparseArray sparseArray = this.a;
        rz rzVar = (rz) sparseArray.get(i);
        if (rzVar != null) {
            return rzVar;
        }
        rz rzVar2 = new rz();
        sparseArray.put(i, rzVar2);
        return rzVar2;
    }
}
