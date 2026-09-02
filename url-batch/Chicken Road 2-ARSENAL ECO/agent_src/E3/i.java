package E3;

import D3.AbstractActivityC0117e;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import u0.C0689s;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f657a = new ArrayList();

    public i(AbstractActivityC0117e abstractActivityC0117e, String[] strArr) {
        I3.c cVar = (I3.c) C0689s.t().f6034f;
        if (cVar.f1192b) {
            return;
        }
        cVar.d(abstractActivityC0117e.getApplicationContext());
        cVar.a(abstractActivityC0117e.getApplicationContext(), strArr);
    }

    public final c a(h hVar) {
        c cVar;
        Context context = hVar.f651a;
        F3.a aVar = hVar.f652b;
        String str = hVar.f653c;
        List<String> list = hVar.f654d;
        io.flutter.plugin.platform.l lVar = new io.flutter.plugin.platform.l();
        boolean z5 = hVar.f655e;
        boolean z6 = hVar.f656f;
        if (aVar == null) {
            I3.c cVar2 = (I3.c) C0689s.t().f6034f;
            if (!cVar2.f1192b) {
                throw new AssertionError("DartEntrypoints can only be created once a FlutterEngine is created.");
            }
            aVar = new F3.a((String) cVar2.f1195e.f1211c, "main");
        }
        F3.a aVar2 = aVar;
        ArrayList arrayList = this.f657a;
        if (arrayList.size() == 0) {
            cVar = new c(context, null, lVar, z5, z6);
            if (str != null) {
                cVar.f608i.f1680a.q("setInitialRoute", str, null);
            }
            cVar.f602c.a(aVar2, list);
        } else {
            c cVar3 = (c) arrayList.get(0);
            if (!cVar3.f600a.isAttached()) {
                throw new IllegalStateException("Spawn can only be called on a fully constructed FlutterEngine");
            }
            cVar = new c(context, cVar3.f600a.spawn(aVar2.f711c, aVar2.f710b, str, list, c.y), lVar, z5, z6);
        }
        arrayList.add(cVar);
        cVar.f621v.add(new g(this, cVar));
        return cVar;
    }
}
