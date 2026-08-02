package defpackage;

import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gti implements gvj {
    public final Object a;
    private final /* synthetic */ int b;

    public gti(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.gvj
    public final void a(gvy gvyVar, SparseArray sparseArray) {
        if (this.b != 0) {
            for (int i = 0; i < sparseArray.size(); i++) {
                eog c = eog.c((guc) sparseArray.valueAt(i), true);
                if (c != null && c.a() != null && !c.d()) {
                    ((eoi) this.a).a(c, gvyVar);
                }
            }
        }
    }
}
