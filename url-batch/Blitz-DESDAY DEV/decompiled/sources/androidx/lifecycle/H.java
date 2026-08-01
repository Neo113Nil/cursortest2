package androidx.lifecycle;

import android.view.View;
import c0.C0079a;
import com.winfour.neondrop.R;
import d0.C0080a;
import j0.C0157a;
import java.util.Iterator;
import java.util.Map;
import n.C0241b;
import n.C0245f;

/* loaded from: classes.dex */
public abstract class H implements N {

    /* renamed from: a, reason: collision with root package name */
    public static final L0.e f1545a = new L0.e(16);

    /* renamed from: b, reason: collision with root package name */
    public static final L0.e f1546b = new L0.e(17);

    /* renamed from: c, reason: collision with root package name */
    public static final L0.e f1547c = new L0.e(15);
    public static final L0.e d = new L0.e(18);

    public static final void c(M m2, j0.d dVar, t tVar) {
        AutoCloseable autoCloseable;
        g1.d.e(dVar, "registry");
        g1.d.e(tVar, "lifecycle");
        C0080a c0080a = m2.f1554a;
        if (c0080a != null) {
            synchronized (c0080a.f2121a) {
                autoCloseable = (AutoCloseable) c0080a.f2122b.get("androidx.lifecycle.savedstate.vm.tag");
            }
        } else {
            autoCloseable = null;
        }
    }

    public static final void d(j0.f fVar) {
        j0.c cVar;
        EnumC0070m enumC0070m = fVar.f().f1578c;
        if (enumC0070m != EnumC0070m.f1569b && enumC0070m != EnumC0070m.f1570c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Iterator it = ((C0245f) fVar.c().d).iterator();
        while (true) {
            C0241b c0241b = (C0241b) it;
            if (!c0241b.hasNext()) {
                cVar = null;
                break;
            }
            Map.Entry entry = (Map.Entry) c0241b.next();
            g1.d.d(entry, "components");
            String str = (String) entry.getKey();
            cVar = (j0.c) entry.getValue();
            if (g1.d.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                break;
            }
        }
        if (cVar == null) {
            J j2 = new J(fVar.c(), (P) fVar);
            fVar.c().e("androidx.lifecycle.internal.SavedStateHandlesProvider", j2);
            fVar.f().a(new C0157a(4, j2));
        }
    }

    public static final K e(P p2) {
        G g2 = new G();
        O d2 = p2.d();
        c0.b a2 = p2 instanceof InterfaceC0065h ? ((InterfaceC0065h) p2).a() : C0079a.f1718b;
        g1.d.e(d2, "store");
        g1.d.e(a2, "defaultCreationExtras");
        return (K) new A1.j(d2, g2, a2).p(g1.h.a(K.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final void f(View view, r rVar) {
        g1.d.e(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, rVar);
    }
}
