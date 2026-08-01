package androidx.lifecycle;

import L.C0014l;
import android.view.View;
import c0.AbstractC0091b;
import c0.C0090a;
import com.winfour.winrandom.R;
import d0.C0094a;
import j0.C0146a;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class H implements N {

    /* renamed from: a, reason: collision with root package name */
    public static final K0.e f1549a = new K0.e(17);

    /* renamed from: b, reason: collision with root package name */
    public static final K0.e f1550b = new K0.e(18);

    /* renamed from: c, reason: collision with root package name */
    public static final K0.e f1551c = new K0.e(16);
    public static final K0.e d = new K0.e(19);

    public static final void c(M m2, j0.d dVar, t tVar) {
        AutoCloseable autoCloseable;
        h1.d.e(dVar, "registry");
        h1.d.e(tVar, "lifecycle");
        C0094a c0094a = m2.f1558a;
        if (c0094a != null) {
            synchronized (c0094a.f2128a) {
                autoCloseable = (AutoCloseable) c0094a.f2129b.get("androidx.lifecycle.savedstate.vm.tag");
            }
        } else {
            autoCloseable = null;
        }
    }

    public static final void d(j0.f fVar) {
        j0.c cVar;
        EnumC0079m enumC0079m = fVar.d().f1582c;
        if (enumC0079m != EnumC0079m.f1573b && enumC0079m != EnumC0079m.f1574c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Iterator it = ((o.f) fVar.b().d).iterator();
        while (true) {
            o.b bVar = (o.b) it;
            if (!bVar.hasNext()) {
                cVar = null;
                break;
            }
            Map.Entry entry = (Map.Entry) bVar.next();
            h1.d.d(entry, "components");
            String str = (String) entry.getKey();
            cVar = (j0.c) entry.getValue();
            if (h1.d.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                break;
            }
        }
        if (cVar == null) {
            J j2 = new J(fVar.b(), (P) fVar);
            fVar.b().e("androidx.lifecycle.internal.SavedStateHandlesProvider", j2);
            fVar.d().a(new C0146a(4, j2));
        }
    }

    public static final K e(P p2) {
        G g2 = new G();
        O c2 = p2.c();
        AbstractC0091b a2 = p2 instanceof InterfaceC0074h ? ((InterfaceC0074h) p2).a() : C0090a.f1733b;
        h1.d.e(c2, "store");
        h1.d.e(a2, "defaultCreationExtras");
        return (K) new C0014l(c2, g2, a2).f(h1.h.a(K.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final void f(View view, r rVar) {
        h1.d.e(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, rVar);
    }
}
