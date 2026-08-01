package E;

import D.AbstractActivityC0005f;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f192a = new ArrayList();

    public h(AbstractActivityC0005f abstractActivityC0005f, String[] strArr) {
        I.e eVar = (I.e) C.b.e().f13a;
        if (eVar.f259a) {
            return;
        }
        eVar.c(abstractActivityC0005f.getApplicationContext());
        eVar.a(abstractActivityC0005f.getApplicationContext(), strArr);
    }

    public final c a(g gVar) {
        F.a aVar;
        c cVar;
        AbstractActivityC0005f abstractActivityC0005f = gVar.f186a;
        F.a aVar2 = gVar.f187b;
        String str = gVar.f188c;
        List<String> list = gVar.f189d;
        io.flutter.plugin.platform.k kVar = new io.flutter.plugin.platform.k();
        boolean z2 = gVar.f190e;
        boolean z3 = gVar.f191f;
        if (aVar2 == null) {
            I.e eVar = (I.e) C.b.e().f13a;
            if (!eVar.f259a) {
                throw new AssertionError("DartEntrypoints can only be created once a FlutterEngine is created.");
            }
            aVar = new F.a(eVar.f262d.f251b, "main");
        } else {
            aVar = aVar2;
        }
        ArrayList arrayList = this.f192a;
        if (arrayList.size() == 0) {
            cVar = new c(abstractActivityC0005f, null, kVar, z2, z3);
            if (str != null) {
                cVar.f156i.f266a.f("setInitialRoute", str, null);
            }
            cVar.f150c.c(aVar, list);
        } else {
            c cVar2 = (c) arrayList.get(0);
            if (!cVar2.f148a.isAttached()) {
                throw new IllegalStateException("Spawn can only be called on a fully constructed FlutterEngine");
            }
            long j2 = c.f146y;
            cVar = new c(abstractActivityC0005f, cVar2.f148a.spawn(aVar.f199c, aVar.f198b, str, list, j2), kVar, z2, z3);
        }
        arrayList.add(cVar);
        cVar.f168v.add(new f(this, cVar));
        return cVar;
    }
}
