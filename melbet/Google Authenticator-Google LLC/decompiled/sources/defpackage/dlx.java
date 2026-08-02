package defpackage;

import android.util.SparseIntArray;
import j$.util.DesugarCollections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dlx implements dkl, dlv {
    private final hel a;

    public dlx(List list, List list2, SparseIntArray sparseIntArray, List list3, SparseIntArray sparseIntArray2) {
        DesugarCollections.unmodifiableList(list);
        DesugarCollections.unmodifiableList(list2);
        DesugarCollections.unmodifiableList(list3);
        hoq.y(!list.isEmpty(), "Must have at least one graft");
        hoq.y(list2.size() == sparseIntArray.size() && list3.size() == sparseIntArray2.size(), "All children must have a parent specified.");
        this.a = hel.q(dih.f((dlw) list.get(0)));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hoq.x(dih.f((dlw) it.next()).equals(this.a.get(0)));
        }
    }

    @Override // defpackage.dlv
    public final /* synthetic */ dkx a() {
        return dih.f(this);
    }

    @Override // defpackage.dlv
    public final List b() {
        return this.a;
    }

    public final String toString() {
        gzo T = hoq.T(this);
        hre hreVar = dih.f(this).d;
        if (hreVar == null) {
            hreVar = hre.a;
        }
        T.e("rootVeId", hreVar.d);
        hre hreVar2 = dih.g(this).d;
        if (hreVar2 == null) {
            hreVar2 = hre.a;
        }
        T.e("targetVeId", hreVar2.d);
        return T.toString();
    }
}
