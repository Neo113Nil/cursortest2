package androidx.lifecycle;

import K.C0014l;
import android.view.View;
import b0.AbstractC0079b;
import b0.C0078a;
import c0.C0084a;
import com.playbag.tripgear.R;
import i0.C0141a;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class H implements N {

    /* renamed from: a, reason: collision with root package name */
    public static final J0.e f1457a = new J0.e(15);

    /* renamed from: b, reason: collision with root package name */
    public static final J0.e f1458b = new J0.e(16);

    /* renamed from: c, reason: collision with root package name */
    public static final J0.e f1459c = new J0.e(14);
    public static final J0.e d = new J0.e(17);

    public static final void c(M m2, i0.d dVar, t tVar) {
        AutoCloseable autoCloseable;
        d1.d.e(dVar, "registry");
        d1.d.e(tVar, "lifecycle");
        C0084a c0084a = m2.f1466a;
        if (c0084a != null) {
            synchronized (c0084a.f1638a) {
                autoCloseable = (AutoCloseable) c0084a.f1639b.get("androidx.lifecycle.savedstate.vm.tag");
            }
        } else {
            autoCloseable = null;
        }
    }

    public static final void d(i0.f fVar) {
        i0.c cVar;
        EnumC0072m enumC0072m = fVar.d().f1490c;
        if (enumC0072m != EnumC0072m.f1481b && enumC0072m != EnumC0072m.f1482c) {
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
            d1.d.d(entry, "components");
            String str = (String) entry.getKey();
            cVar = (i0.c) entry.getValue();
            if (d1.d.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                break;
            }
        }
        if (cVar == null) {
            J j2 = new J(fVar.b(), (P) fVar);
            fVar.b().e("androidx.lifecycle.internal.SavedStateHandlesProvider", j2);
            fVar.d().a(new C0141a(4, j2));
        }
    }

    public static final K e(P p2) {
        G g2 = new G();
        O c2 = p2.c();
        AbstractC0079b a2 = p2 instanceof InterfaceC0067h ? ((InterfaceC0067h) p2).a() : C0078a.f1631b;
        d1.d.e(c2, "store");
        d1.d.e(a2, "defaultCreationExtras");
        return (K) new C0014l(c2, g2, a2).f(d1.h.a(K.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final void f(View view, r rVar) {
        d1.d.e(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, rVar);
    }
}
