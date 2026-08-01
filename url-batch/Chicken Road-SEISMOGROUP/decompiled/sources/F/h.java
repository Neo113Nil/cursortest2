package F;

import E.AbstractActivityC0004e;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f267a = new ArrayList();

    public h(AbstractActivityC0004e abstractActivityC0004e, String[] strArr) {
        I.e eVar = (I.e) D.b.e().f99a;
        if (eVar.f324a) {
            return;
        }
        eVar.c(abstractActivityC0004e.getApplicationContext());
        eVar.a(abstractActivityC0004e.getApplicationContext(), strArr);
    }

    public final c a(g gVar) {
        G.a aVar;
        c cVar;
        AbstractActivityC0004e abstractActivityC0004e = gVar.f261a;
        G.a aVar2 = gVar.f262b;
        String str = gVar.f263c;
        List<String> list = gVar.f264d;
        io.flutter.plugin.platform.j jVar = new io.flutter.plugin.platform.j();
        boolean z = gVar.f265e;
        boolean z2 = gVar.f266f;
        if (aVar2 == null) {
            I.e eVar = (I.e) D.b.e().f99a;
            if (!eVar.f324a) {
                throw new AssertionError("DartEntrypoints can only be created once a FlutterEngine is created.");
            }
            aVar = new G.a(eVar.f327d.f316b, "main");
        } else {
            aVar = aVar2;
        }
        ArrayList arrayList = this.f267a;
        if (arrayList.size() == 0) {
            cVar = new c(abstractActivityC0004e, null, jVar, z, z2);
            if (str != null) {
                cVar.f231i.f331a.h("setInitialRoute", str, null);
            }
            cVar.f225c.a(aVar, list);
        } else {
            c cVar2 = (c) arrayList.get(0);
            if (!cVar2.f223a.isAttached()) {
                throw new IllegalStateException("Spawn can only be called on a fully constructed FlutterEngine");
            }
            long j2 = c.f222y;
            cVar = new c(abstractActivityC0004e, cVar2.f223a.spawn(aVar.f274c, aVar.f273b, str, list, j2), jVar, z, z2);
        }
        arrayList.add(cVar);
        cVar.f243v.add(new f(this, cVar));
        return cVar;
    }
}
