package F1;

import E1.AbstractActivityC0029e;
import P1.o;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugin.platform.r;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f521a = new ArrayList();

    public i(AbstractActivityC0029e abstractActivityC0029e, String[] strArr) {
        J1.d dVar = (J1.d) A0.f.H().f23b;
        if (dVar.f640b) {
            return;
        }
        dVar.d(abstractActivityC0029e.getApplicationContext());
        dVar.a(abstractActivityC0029e.getApplicationContext(), strArr);
    }

    public final FlutterEngine a(h hVar) {
        FlutterEngine flutterEngine;
        AbstractActivityC0029e abstractActivityC0029e = hVar.f516a;
        G1.a aVar = hVar.f517b;
        String str = hVar.f518c;
        List<String> list = hVar.f519d;
        r rVar = new r();
        boolean z = hVar.f520e;
        boolean z2 = hVar.f;
        if (aVar == null) {
            J1.d dVar = (J1.d) A0.f.H().f23b;
            if (!dVar.f640b) {
                throw new AssertionError("DartEntrypoints can only be created once a FlutterEngine is created.");
            }
            aVar = new G1.a(dVar.f643e.f630b, "main");
        }
        G1.a aVar2 = aVar;
        ArrayList arrayList = this.f521a;
        if (arrayList.size() == 0) {
            flutterEngine = new FlutterEngine(abstractActivityC0029e, null, rVar, z, z2);
            if (str != null) {
                ((o) flutterEngine.f9106i.f2532b).a("setInitialRoute", str, null);
            }
            flutterEngine.f9101c.a(aVar2, list);
        } else {
            FlutterEngine flutterEngine2 = (FlutterEngine) arrayList.get(0);
            if (!flutterEngine2.f9099a.isAttached()) {
                throw new IllegalStateException("Spawn can only be called on a fully constructed FlutterEngine");
            }
            long j3 = FlutterEngine.f9098y;
            flutterEngine = new FlutterEngine(abstractActivityC0029e, flutterEngine2.f9099a.spawn(aVar2.f533c, aVar2.f532b, str, list, j3), rVar, z, z2);
        }
        arrayList.add(flutterEngine);
        flutterEngine.v.add(new g(this, flutterEngine));
        return flutterEngine;
    }
}
