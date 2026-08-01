package androidx.lifecycle;

import K.C0011l;
import a0.AbstractC0056b;
import a0.C0055a;
import android.view.View;
import b0.C0078a;
import com.glasspulse.glasspulse.R;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class H implements N {

    /* renamed from: a, reason: collision with root package name */
    public static final M0.e f1415a = new M0.e(14);

    /* renamed from: b, reason: collision with root package name */
    public static final M0.e f1416b = new M0.e(15);

    /* renamed from: c, reason: collision with root package name */
    public static final M0.e f1417c = new M0.e(13);
    public static final M0.e d = new M0.e(16);

    public static final void c(M m2, h0.d dVar, t tVar) {
        AutoCloseable autoCloseable;
        b1.d.e(dVar, "registry");
        b1.d.e(tVar, "lifecycle");
        C0078a c0078a = m2.f1424a;
        if (c0078a != null) {
            synchronized (c0078a.f1577a) {
                autoCloseable = (AutoCloseable) c0078a.f1578b.get("androidx.lifecycle.savedstate.vm.tag");
            }
        } else {
            autoCloseable = null;
        }
    }

    public static final void d(h0.f fVar) {
        h0.c cVar;
        EnumC0072m enumC0072m = fVar.d().f1448c;
        if (enumC0072m != EnumC0072m.f1439b && enumC0072m != EnumC0072m.f1440c) {
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
            b1.d.d(entry, "components");
            String str = (String) entry.getKey();
            cVar = (h0.c) entry.getValue();
            if (b1.d.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                break;
            }
        }
        if (cVar == null) {
            J j2 = new J(fVar.b(), (P) fVar);
            fVar.b().e("androidx.lifecycle.internal.SavedStateHandlesProvider", j2);
            fVar.d().a(new h0.a(4, j2));
        }
    }

    public static final K e(P p2) {
        G g2 = new G();
        O c2 = p2.c();
        AbstractC0056b a2 = p2 instanceof InterfaceC0067h ? ((InterfaceC0067h) p2).a() : C0055a.f1178b;
        b1.d.e(c2, "store");
        b1.d.e(a2, "defaultCreationExtras");
        return (K) new C0011l(c2, g2, a2).n(b1.h.a(K.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final void f(View view, r rVar) {
        b1.d.e(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, rVar);
    }
}
