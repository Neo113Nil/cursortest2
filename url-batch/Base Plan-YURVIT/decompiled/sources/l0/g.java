package l0;

import B0.C0008i;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import k0.AbstractActivityC0187d;
import p0.C0220e;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2813a = new ArrayList();

    public g(AbstractActivityC0187d abstractActivityC0187d, String[] strArr) {
        C0220e c0220e = (C0220e) C0008i.A().f84f;
        if (c0220e.f2938a) {
            return;
        }
        c0220e.c(abstractActivityC0187d.getApplicationContext());
        c0220e.a(abstractActivityC0187d.getApplicationContext(), strArr);
    }

    public final c a(f fVar) {
        c cVar;
        Context context = fVar.f2807a;
        m0.a aVar = fVar.f2808b;
        String str = fVar.f2809c;
        List<String> list = fVar.f2810d;
        io.flutter.plugin.platform.l lVar = new io.flutter.plugin.platform.l();
        boolean z2 = fVar.f2811e;
        boolean z3 = fVar.f2812f;
        if (aVar == null) {
            C0220e c0220e = (C0220e) C0008i.A().f84f;
            if (!c0220e.f2938a) {
                throw new AssertionError("DartEntrypoints can only be created once a FlutterEngine is created.");
            }
            aVar = new m0.a(c0220e.f2941d.f2930b, "main");
        }
        m0.a aVar2 = aVar;
        ArrayList arrayList = this.f2813a;
        if (arrayList.size() == 0) {
            cVar = new c(context, null, lVar, z2, z3);
            if (str != null) {
                cVar.f2783i.f2986a.B("setInitialRoute", str, null);
            }
            cVar.f2777c.a(aVar2, list);
        } else {
            c cVar2 = (c) arrayList.get(0);
            if (!cVar2.f2775a.isAttached()) {
                throw new IllegalStateException("Spawn can only be called on a fully constructed FlutterEngine");
            }
            cVar = new c(context, cVar2.f2775a.spawn(aVar2.f2856c, aVar2.f2855b, str, list, c.f2773y), lVar, z2, z3);
        }
        arrayList.add(cVar);
        cVar.f2795v.add(new e(this, cVar));
        return cVar;
    }
}
