package androidx.lifecycle;

import K.C0014l;
import android.view.View;
import b0.AbstractC0080b;
import b0.C0079a;
import c0.C0086a;
import com.winworm.neongrid.R;
import i0.C0143a;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class H implements N {

    /* renamed from: a, reason: collision with root package name */
    public static final J0.e f1488a = new J0.e(16);

    /* renamed from: b, reason: collision with root package name */
    public static final J0.e f1489b = new J0.e(17);

    /* renamed from: c, reason: collision with root package name */
    public static final J0.e f1490c = new J0.e(15);
    public static final J0.e d = new J0.e(18);

    public static final void c(M m2, i0.d dVar, t tVar) {
        AutoCloseable autoCloseable;
        g1.d.e(dVar, "registry");
        g1.d.e(tVar, "lifecycle");
        C0086a c0086a = m2.f1497a;
        if (c0086a != null) {
            synchronized (c0086a.f1668a) {
                autoCloseable = (AutoCloseable) c0086a.f1669b.get("androidx.lifecycle.savedstate.vm.tag");
            }
        } else {
            autoCloseable = null;
        }
    }

    public static final void d(i0.f fVar) {
        i0.c cVar;
        EnumC0073m enumC0073m = fVar.e().f1521c;
        if (enumC0073m != EnumC0073m.f1512b && enumC0073m != EnumC0073m.f1513c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Iterator it = ((n.f) fVar.b().d).iterator();
        while (true) {
            n.b bVar = (n.b) it;
            if (!bVar.hasNext()) {
                cVar = null;
                break;
            }
            Map.Entry entry = (Map.Entry) bVar.next();
            g1.d.d(entry, "components");
            String str = (String) entry.getKey();
            cVar = (i0.c) entry.getValue();
            if (g1.d.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                break;
            }
        }
        if (cVar == null) {
            J j2 = new J(fVar.b(), (P) fVar);
            fVar.b().e("androidx.lifecycle.internal.SavedStateHandlesProvider", j2);
            fVar.e().a(new C0143a(4, j2));
        }
    }

    public static final K e(P p2) {
        G g2 = new G();
        O c2 = p2.c();
        AbstractC0080b a2 = p2 instanceof InterfaceC0068h ? ((InterfaceC0068h) p2).a() : C0079a.f1660b;
        g1.d.e(c2, "store");
        g1.d.e(a2, "defaultCreationExtras");
        return (K) new C0014l(c2, g2, a2).f(g1.h.a(K.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final void f(View view, r rVar) {
        g1.d.e(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, rVar);
    }
}
