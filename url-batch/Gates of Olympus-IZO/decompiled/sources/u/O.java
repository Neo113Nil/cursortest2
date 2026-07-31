package u;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class O extends Z1.j implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public static final O f8030e = new O(2);

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        P p = (P) obj2;
        R.c cVar = (R.c) p.f8032b.getValue();
        if (cVar != null) {
            Iterator it = p.f8033c.iterator();
            while (it.hasNext()) {
                cVar.b(it.next());
            }
        }
        Map b2 = p.f8031a.b();
        if (b2.isEmpty()) {
            return null;
        }
        return b2;
    }
}
