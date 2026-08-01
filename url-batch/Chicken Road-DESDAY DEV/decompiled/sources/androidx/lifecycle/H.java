package androidx.lifecycle;

import K.C0011l;
import a0.AbstractC0057b;
import a0.C0056a;
import android.view.View;
import b0.C0079a;
import com.playgen.securelock.R;
import h0.C0137a;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class H implements N {

    /* renamed from: a, reason: collision with root package name */
    public static final I0.e f1398a = new I0.e(14);

    /* renamed from: b, reason: collision with root package name */
    public static final I0.e f1399b = new I0.e(15);

    /* renamed from: c, reason: collision with root package name */
    public static final I0.e f1400c = new I0.e(13);
    public static final I0.e d = new I0.e(16);

    public static final void c(M m2, h0.d dVar, t tVar) {
        AutoCloseable autoCloseable;
        b1.d.e(dVar, "registry");
        b1.d.e(tVar, "lifecycle");
        C0079a c0079a = m2.f1407a;
        if (c0079a != null) {
            synchronized (c0079a.f1561a) {
                autoCloseable = (AutoCloseable) c0079a.f1562b.get("androidx.lifecycle.savedstate.vm.tag");
            }
        } else {
            autoCloseable = null;
        }
    }

    public static final void d(h0.f fVar) {
        h0.c cVar;
        EnumC0073m enumC0073m = fVar.d().f1431c;
        if (enumC0073m != EnumC0073m.f1422b && enumC0073m != EnumC0073m.f1423c) {
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
            fVar.d().a(new C0137a(4, j2));
        }
    }

    public static final K e(P p2) {
        G g2 = new G();
        O c2 = p2.c();
        AbstractC0057b a2 = p2 instanceof InterfaceC0068h ? ((InterfaceC0068h) p2).a() : C0056a.f1164b;
        b1.d.e(c2, "store");
        b1.d.e(a2, "defaultCreationExtras");
        return (K) new C0011l(c2, g2, a2).n(b1.h.a(K.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final void f(View view, r rVar) {
        b1.d.e(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, rVar);
    }
}
