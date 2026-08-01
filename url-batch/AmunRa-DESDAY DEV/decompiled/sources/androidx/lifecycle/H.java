package androidx.lifecycle;

import K.C0011l;
import a0.AbstractC0057b;
import a0.C0056a;
import android.view.View;
import b0.C0077a;
import com.visualfortune.eyerest.R;
import h0.C0135a;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class H implements N {

    /* renamed from: a, reason: collision with root package name */
    public static final I0.e f1373a = new I0.e(14);

    /* renamed from: b, reason: collision with root package name */
    public static final I0.e f1374b = new I0.e(15);

    /* renamed from: c, reason: collision with root package name */
    public static final I0.e f1375c = new I0.e(13);
    public static final I0.e d = new I0.e(16);

    public static final void c(M m2, h0.d dVar, t tVar) {
        AutoCloseable autoCloseable;
        Z0.d.e(dVar, "registry");
        Z0.d.e(tVar, "lifecycle");
        C0077a c0077a = m2.f1382a;
        if (c0077a != null) {
            synchronized (c0077a.f1535a) {
                autoCloseable = (AutoCloseable) c0077a.f1536b.get("androidx.lifecycle.savedstate.vm.tag");
            }
        } else {
            autoCloseable = null;
        }
    }

    public static final void d(h0.f fVar) {
        h0.c cVar;
        EnumC0071m enumC0071m = fVar.d().f1406c;
        if (enumC0071m != EnumC0071m.f1397b && enumC0071m != EnumC0071m.f1398c) {
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
            Z0.d.d(entry, "components");
            String str = (String) entry.getKey();
            cVar = (h0.c) entry.getValue();
            if (Z0.d.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                break;
            }
        }
        if (cVar == null) {
            J j2 = new J(fVar.b(), (P) fVar);
            fVar.b().e("androidx.lifecycle.internal.SavedStateHandlesProvider", j2);
            fVar.d().a(new C0135a(4, j2));
        }
    }

    public static final K e(P p2) {
        G g2 = new G();
        O c2 = p2.c();
        AbstractC0057b a2 = p2 instanceof InterfaceC0066h ? ((InterfaceC0066h) p2).a() : C0056a.f1139b;
        Z0.d.e(c2, "store");
        Z0.d.e(a2, "defaultCreationExtras");
        return (K) new C0011l(c2, g2, a2).n(Z0.h.a(K.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final void f(View view, r rVar) {
        Z0.d.e(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, rVar);
    }
}
