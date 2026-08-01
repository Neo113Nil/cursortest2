package androidx.lifecycle;

import K.C0012l;
import a0.C0056a;
import android.view.View;
import b0.C0075a;
import com.molarmass.wincalc.R;
import h0.C0129a;
import h0.C0132d;
import h0.InterfaceC0131c;
import h0.InterfaceC0134f;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class H implements N {

    /* renamed from: a, reason: collision with root package name */
    public static final H0.e f1335a = new H0.e(14);

    /* renamed from: b, reason: collision with root package name */
    public static final H0.e f1336b = new H0.e(15);

    /* renamed from: c, reason: collision with root package name */
    public static final H0.e f1337c = new H0.e(13);
    public static final H0.e d = new H0.e(16);

    public static final void c(M m2, C0132d c0132d, t tVar) {
        AutoCloseable autoCloseable;
        X0.e.e(c0132d, "registry");
        X0.e.e(tVar, "lifecycle");
        C0075a c0075a = m2.f1344a;
        if (c0075a != null) {
            synchronized (c0075a.f1498a) {
                autoCloseable = (AutoCloseable) c0075a.f1499b.get("androidx.lifecycle.savedstate.vm.tag");
            }
        } else {
            autoCloseable = null;
        }
    }

    public static final void d(InterfaceC0134f interfaceC0134f) {
        InterfaceC0131c interfaceC0131c;
        EnumC0069m enumC0069m = interfaceC0134f.d().f1368c;
        if (enumC0069m != EnumC0069m.f1359b && enumC0069m != EnumC0069m.f1360c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Iterator it = ((n.f) interfaceC0134f.b().d).iterator();
        while (true) {
            n.b bVar = (n.b) it;
            if (!bVar.hasNext()) {
                interfaceC0131c = null;
                break;
            }
            Map.Entry entry = (Map.Entry) bVar.next();
            X0.e.d(entry, "components");
            String str = (String) entry.getKey();
            interfaceC0131c = (InterfaceC0131c) entry.getValue();
            if (X0.e.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                break;
            }
        }
        if (interfaceC0131c == null) {
            J j2 = new J(interfaceC0134f.b(), (P) interfaceC0134f);
            interfaceC0134f.b().e("androidx.lifecycle.internal.SavedStateHandlesProvider", j2);
            interfaceC0134f.d().a(new C0129a(4, j2));
        }
    }

    public static final K e(P p2) {
        G g2 = new G();
        O c2 = p2.c();
        a0.b a2 = p2 instanceof InterfaceC0064h ? ((InterfaceC0064h) p2).a() : C0056a.f1101b;
        X0.e.e(c2, "store");
        X0.e.e(a2, "defaultCreationExtras");
        return (K) new C0012l(c2, g2, a2).n(X0.i.a(K.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final void f(View view, r rVar) {
        X0.e.e(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, rVar);
    }
}
