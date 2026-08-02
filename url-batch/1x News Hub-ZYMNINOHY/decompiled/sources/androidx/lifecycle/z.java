package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;
import n.C1116b;
import n.C1120f;

/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final D f2410a = new D();

    /* renamed from: b, reason: collision with root package name */
    public static final D f2411b = new D();

    /* renamed from: c, reason: collision with root package name */
    public static final D f2412c = new D();

    public static final void a(V.f fVar) {
        V.d dVar;
        h hVar = fVar.e().f2389c;
        if (hVar != h.f2380b && hVar != h.f2381c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Iterator it = ((C1120f) fVar.b().f1183d).iterator();
        while (true) {
            C1116b c1116b = (C1116b) it;
            if (!c1116b.hasNext()) {
                dVar = null;
                break;
            }
            Map.Entry components = (Map.Entry) c1116b.next();
            kotlin.jvm.internal.j.d(components, "components");
            String str = (String) components.getKey();
            dVar = (V.d) components.getValue();
            if (kotlin.jvm.internal.j.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                break;
            }
        }
        if (dVar == null) {
            A a3 = new A(fVar.b(), (G) fVar);
            fVar.b().c("androidx.lifecycle.internal.SavedStateHandlesProvider", a3);
            fVar.e().a(new V.b(1, a3));
        }
    }
}
