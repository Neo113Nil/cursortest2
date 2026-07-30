package d0;

import L.C0026b;
import c0.AbstractActivityC0104f;
import e0.C0113a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1842a = new ArrayList();

    public i(AbstractActivityC0104f abstractActivityC0104f, String[] strArr) {
        h0.d dVar = (h0.d) C0026b.C().f521g;
        if (dVar.f2337b) {
            return;
        }
        dVar.d(abstractActivityC0104f.getApplicationContext());
        dVar.a(abstractActivityC0104f.getApplicationContext(), strArr);
    }

    public final c a(h hVar) {
        C0113a c0113a;
        c cVar;
        AbstractActivityC0104f abstractActivityC0104f = hVar.f1836a;
        C0113a c0113a2 = hVar.f1837b;
        String str = hVar.f1838c;
        List<String> list = hVar.f1839d;
        io.flutter.plugin.platform.k kVar = new io.flutter.plugin.platform.k();
        boolean z2 = hVar.f1840e;
        boolean z3 = hVar.f1841f;
        if (c0113a2 == null) {
            h0.d dVar = (h0.d) C0026b.C().f521g;
            if (!dVar.f2337b) {
                throw new AssertionError("DartEntrypoints can only be created once a FlutterEngine is created.");
            }
            c0113a = new C0113a(dVar.f2340e.f2328b, "main");
        } else {
            c0113a = c0113a2;
        }
        ArrayList arrayList = this.f1842a;
        if (arrayList.size() == 0) {
            cVar = new c(abstractActivityC0104f, null, kVar, z2, z3);
            if (str != null) {
                cVar.f1796i.f2703a.D("setInitialRoute", str, null);
            }
            cVar.f1790c.a(c0113a, list);
        } else {
            c cVar2 = (c) arrayList.get(0);
            if (!cVar2.f1788a.isAttached()) {
                throw new IllegalStateException("Spawn can only be called on a fully constructed FlutterEngine");
            }
            long j2 = c.f1786y;
            cVar = new c(abstractActivityC0104f, cVar2.f1788a.spawn(c0113a.f1850c, c0113a.f1849b, str, list, j2), kVar, z2, z3);
        }
        arrayList.add(cVar);
        cVar.f1808v.add(new g(this, cVar));
        return cVar;
    }
}
