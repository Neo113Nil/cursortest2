package s;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f0 extends r6.l implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public static final f0 f8003g = new f0(2);

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        g0 g0Var = (g0) obj2;
        p0.c cVar = (p0.c) g0Var.f8008b.getValue();
        if (cVar != null) {
            Iterator it = g0Var.f8009c.iterator();
            while (it.hasNext()) {
                cVar.c(it.next());
            }
        }
        Map c4 = g0Var.f8007a.c();
        if (c4.isEmpty()) {
            return null;
        }
        return c4;
    }
}
