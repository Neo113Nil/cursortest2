package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hkk extends hky {
    public hkk(Class cls) {
        super("tags", cls, false, true);
    }

    @Override // defpackage.hky
    public final /* bridge */ /* synthetic */ void b(Object obj, hkx hkxVar) {
        hob hobVar = (hob) obj;
        if (hobVar == null) {
            return;
        }
        hnx hnxVar = new hnx((hny) hobVar.c.d);
        while (hnxVar.hasNext()) {
            Map.Entry entry = (Map.Entry) hnxVar.next();
            if (((Set) entry.getValue()).isEmpty()) {
                hkxVar.a((String) entry.getKey(), null);
            } else {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    hkxVar.a((String) entry.getKey(), it.next());
                }
            }
        }
    }
}
