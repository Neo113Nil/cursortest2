package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class evc implements evq {
    @Override // defpackage.evq
    public final boolean a(List list) {
        evh evhVar = evi.a;
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= !(((bry) evhVar.b.get((String) it.next())) == null);
        }
        return z;
    }
}
