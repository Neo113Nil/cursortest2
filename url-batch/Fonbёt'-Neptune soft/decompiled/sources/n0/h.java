package n0;

import B0.C0031i;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.platform.o;
import java.util.ArrayList;
import java.util.List;
import m0.AbstractActivityC0264d;
import o0.C0279a;
import q0.C0287d;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3300a = new ArrayList();

    public h(AbstractActivityC0264d abstractActivityC0264d, String[] strArr) {
        C0287d c0287d = (C0287d) C0031i.G().f154f;
        if (c0287d.f3379a) {
            return;
        }
        c0287d.b(abstractActivityC0264d.getApplicationContext());
        c0287d.a(abstractActivityC0264d.getApplicationContext(), strArr);
    }

    public final c a(g gVar) {
        c cVar;
        AbstractActivityC0264d abstractActivityC0264d = gVar.f3294a;
        C0279a c0279a = gVar.f3295b;
        String str = gVar.f3296c;
        List<String> list = gVar.f3297d;
        o oVar = new o();
        boolean z2 = gVar.f3298e;
        boolean z3 = gVar.f3299f;
        if (c0279a == null) {
            C0287d c0287d = (C0287d) C0031i.G().f154f;
            if (!c0287d.f3379a) {
                throw new AssertionError("DartEntrypoints can only be created once a FlutterEngine is created.");
            }
            c0279a = new C0279a((String) c0287d.f3382d.f3330g, "main");
        }
        C0279a c0279a2 = c0279a;
        ArrayList arrayList = this.f3300a;
        if (arrayList.size() == 0) {
            cVar = new c(abstractActivityC0264d, null, oVar, z2, z3);
            if (str != null) {
                cVar.f3271i.f3474a.f("setInitialRoute", str, null);
            }
            cVar.f3265c.d(c0279a2, list);
        } else {
            FlutterJNI flutterJNI = ((c) arrayList.get(0)).f3263a;
            if (!flutterJNI.isAttached()) {
                throw new IllegalStateException("Spawn can only be called on a fully constructed FlutterEngine");
            }
            cVar = new c(abstractActivityC0264d, flutterJNI.spawn(c0279a2.f3327c, c0279a2.f3326b, str, list), oVar, z2, z3);
        }
        arrayList.add(cVar);
        cVar.f3281s.add(new f(this, cVar));
        return cVar;
    }
}
