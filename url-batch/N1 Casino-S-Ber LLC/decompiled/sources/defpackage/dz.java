package defpackage;

import android.util.SparseArray;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class dz {
    public SparseArray a;
    public int b;

    public final cz a(int i) {
        SparseArray sparseArray = this.a;
        cz czVar = (cz) sparseArray.get(i);
        if (czVar != null) {
            return czVar;
        }
        cz czVar2 = new cz();
        sparseArray.put(i, czVar2);
        return czVar2;
    }
}
