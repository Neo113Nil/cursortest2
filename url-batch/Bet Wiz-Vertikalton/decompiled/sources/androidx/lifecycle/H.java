package androidx.lifecycle;

import K.C0011l;
import a0.AbstractC0056b;
import a0.C0055a;
import android.view.View;
import b0.C0076a;
import com.neonpulse.gridlogic.R;
import h0.C0136a;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class H implements N {

    /* renamed from: a, reason: collision with root package name */
    public static final I0.e f1443a = new I0.e(16);

    /* renamed from: b, reason: collision with root package name */
    public static final I0.e f1444b = new I0.e(17);

    /* renamed from: c, reason: collision with root package name */
    public static final I0.e f1445c = new I0.e(15);
    public static final I0.e d = new I0.e(18);

    public static final void c(M m2, h0.d dVar, t tVar) {
        AutoCloseable autoCloseable;
        e1.d.e(dVar, "registry");
        e1.d.e(tVar, "lifecycle");
        C0076a c0076a = m2.f1452a;
        if (c0076a != null) {
            synchronized (c0076a.f1606a) {
                autoCloseable = (AutoCloseable) c0076a.f1607b.get("androidx.lifecycle.savedstate.vm.tag");
            }
        } else {
            autoCloseable = null;
        }
    }

    public static final void d(h0.f fVar) {
        h0.c cVar;
        EnumC0070m enumC0070m = fVar.d().f1476c;
        if (enumC0070m != EnumC0070m.f1467b && enumC0070m != EnumC0070m.f1468c) {
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
            e1.d.d(entry, "components");
            String str = (String) entry.getKey();
            cVar = (h0.c) entry.getValue();
            if (e1.d.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                break;
            }
        }
        if (cVar == null) {
            J j2 = new J(fVar.b(), (P) fVar);
            fVar.b().e("androidx.lifecycle.internal.SavedStateHandlesProvider", j2);
            fVar.d().a(new C0136a(4, j2));
        }
    }

    public static final K e(P p2) {
        G g2 = new G();
        O c2 = p2.c();
        AbstractC0056b a2 = p2 instanceof InterfaceC0065h ? ((InterfaceC0065h) p2).a() : C0055a.f1208b;
        e1.d.e(c2, "store");
        e1.d.e(a2, "defaultCreationExtras");
        return (K) new C0011l(c2, g2, a2).n(e1.h.a(K.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final void f(View view, r rVar) {
        e1.d.e(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, rVar);
    }
}
