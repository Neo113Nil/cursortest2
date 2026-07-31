package t;

import e2.InterfaceC0426e;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class H extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public static final H f8441e = new H(2);

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        I i3 = (I) obj2;
        R.c cVar = (R.c) i3.f8443b.getValue();
        if (cVar != null) {
            Iterator it = i3.f8444c.iterator();
            while (it.hasNext()) {
                cVar.a(it.next());
            }
        }
        Map a3 = i3.f8442a.a();
        if (a3.isEmpty()) {
            return null;
        }
        return a3;
    }
}
