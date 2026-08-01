package androidx.lifecycle;

import K.C0012l;
import a0.C0057a;
import android.view.View;
import b0.C0076a;
import com.skydrop.fallring.R;
import h0.C0130a;
import h0.C0133d;
import h0.InterfaceC0132c;
import h0.InterfaceC0135f;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class H implements N {

    /* renamed from: a, reason: collision with root package name */
    public static final H0.e f1340a = new H0.e(14);

    /* renamed from: b, reason: collision with root package name */
    public static final H0.e f1341b = new H0.e(15);

    /* renamed from: c, reason: collision with root package name */
    public static final H0.e f1342c = new H0.e(13);
    public static final H0.e d = new H0.e(16);

    public static final void c(M m2, C0133d c0133d, t tVar) {
        AutoCloseable autoCloseable;
        X0.d.e(c0133d, "registry");
        X0.d.e(tVar, "lifecycle");
        C0076a c0076a = m2.f1349a;
        if (c0076a != null) {
            synchronized (c0076a.f1503a) {
                autoCloseable = (AutoCloseable) c0076a.f1504b.get("androidx.lifecycle.savedstate.vm.tag");
            }
        } else {
            autoCloseable = null;
        }
    }

    public static final void d(InterfaceC0135f interfaceC0135f) {
        InterfaceC0132c interfaceC0132c;
        EnumC0070m enumC0070m = interfaceC0135f.d().f1373c;
        if (enumC0070m != EnumC0070m.f1364b && enumC0070m != EnumC0070m.f1365c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Iterator it = ((n.f) interfaceC0135f.b().d).iterator();
        while (true) {
            n.b bVar = (n.b) it;
            if (!bVar.hasNext()) {
                interfaceC0132c = null;
                break;
            }
            Map.Entry entry = (Map.Entry) bVar.next();
            X0.d.d(entry, "components");
            String str = (String) entry.getKey();
            interfaceC0132c = (InterfaceC0132c) entry.getValue();
            if (X0.d.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                break;
            }
        }
        if (interfaceC0132c == null) {
            J j2 = new J(interfaceC0135f.b(), (P) interfaceC0135f);
            interfaceC0135f.b().e("androidx.lifecycle.internal.SavedStateHandlesProvider", j2);
            interfaceC0135f.d().a(new C0130a(4, j2));
        }
    }

    public static final K e(P p2) {
        G g2 = new G();
        O c2 = p2.c();
        a0.b a2 = p2 instanceof InterfaceC0065h ? ((InterfaceC0065h) p2).a() : C0057a.f1106b;
        X0.d.e(c2, "store");
        X0.d.e(a2, "defaultCreationExtras");
        return (K) new C0012l(c2, g2, a2).n(X0.h.a(K.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final void f(View view, r rVar) {
        X0.d.e(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, rVar);
    }
}
