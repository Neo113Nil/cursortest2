package f0;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f326a = new ArrayList();

    public j(e0.f fVar, String[] strArr) {
        j0.d dVar = (j0.d) c0.a.y().f66c;
        if (dVar.f654b) {
            return;
        }
        dVar.d(fVar.getApplicationContext());
        dVar.a(fVar.getApplicationContext(), strArr);
    }

    public final c a(i iVar) {
        c cVar;
        Context context = iVar.f320a;
        g0.a aVar = iVar.f321b;
        String str = iVar.f322c;
        List<String> list = iVar.f323d;
        io.flutter.plugin.platform.j jVar = new io.flutter.plugin.platform.j();
        boolean z2 = iVar.f324e;
        boolean z3 = iVar.f325f;
        if (aVar == null) {
            j0.d dVar = (j0.d) c0.a.y().f66c;
            if (!dVar.f654b) {
                throw new AssertionError("DartEntrypoints can only be created once a FlutterEngine is created.");
            }
            aVar = new g0.a(dVar.f657e.f645b, "main");
        }
        g0.a aVar2 = aVar;
        ArrayList arrayList = this.f326a;
        if (arrayList.size() == 0) {
            cVar = new c(context, null, jVar, z2, z3);
            if (str != null) {
                cVar.f276i.f766a.d("setInitialRoute", str, null);
            }
            cVar.f270c.a(aVar2, list);
        } else {
            c cVar2 = (c) arrayList.get(0);
            if (!cVar2.f268a.isAttached()) {
                l.b("Spawn can only be called on a fully constructed FlutterEngine");
                return null;
            }
            cVar = new c(context, cVar2.f268a.spawn(aVar2.f333c, aVar2.f332b, str, list, c.f266y), jVar, z2, z3);
        }
        arrayList.add(cVar);
        cVar.v.add(new h(this, cVar));
        return cVar;
    }
}
