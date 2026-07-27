package s;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function2;

/* renamed from: s.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1091G extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public static final C1091G f9893d = new C1091G(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        C1092H c1092h = (C1092H) obj2;
        P.c cVar = (P.c) c1092h.f9895b.getValue();
        if (cVar != null) {
            Iterator it = c1092h.f9896c.iterator();
            while (it.hasNext()) {
                cVar.a(it.next());
            }
        }
        Map a4 = c1092h.f9894a.a();
        if (a4.isEmpty()) {
            return null;
        }
        return a4;
    }
}
