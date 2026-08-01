package androidx.lifecycle;

import android.view.View;
import b0.C0080a;
import c0.C0086a;
import com.fortunequest.neontrack.R;
import j0.C0167a;
import j0.InterfaceC0169c;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import s1.AbstractC0335s;
import s1.AbstractC0341y;
import s1.a0;
import u0.C0372k;

/* loaded from: classes.dex */
public abstract class J implements P {

    /* renamed from: a, reason: collision with root package name */
    public static final R0.e f1861a = new R0.e(17);

    /* renamed from: b, reason: collision with root package name */
    public static final R0.e f1862b = new R0.e(18);

    /* renamed from: c, reason: collision with root package name */
    public static final R0.e f1863c = new R0.e(16);
    public static final R0.e d = new R0.e(19);

    public static final void c(O o2, j0.d dVar, v vVar) {
        AutoCloseable autoCloseable;
        k1.e.e(dVar, "registry");
        k1.e.e(vVar, "lifecycle");
        C0086a c0086a = o2.f1870a;
        if (c0086a != null) {
            synchronized (c0086a.f2056a) {
                autoCloseable = (AutoCloseable) c0086a.f2057b.get("androidx.lifecycle.savedstate.vm.tag");
            }
        } else {
            autoCloseable = null;
        }
    }

    public static final void d(j0.f fVar) {
        InterfaceC0169c interfaceC0169c;
        EnumC0072m enumC0072m = fVar.e().d;
        if (enumC0072m != EnumC0072m.f1885b && enumC0072m != EnumC0072m.f1886c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Iterator it = ((n.f) fVar.b().d).iterator();
        while (true) {
            n.b bVar = (n.b) it;
            if (!bVar.hasNext()) {
                interfaceC0169c = null;
                break;
            }
            Map.Entry entry = (Map.Entry) bVar.next();
            k1.e.d(entry, "components");
            String str = (String) entry.getKey();
            interfaceC0169c = (InterfaceC0169c) entry.getValue();
            if (k1.e.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                break;
            }
        }
        if (interfaceC0169c == null) {
            L l2 = new L(fVar.b(), (S) fVar);
            fVar.b().e("androidx.lifecycle.internal.SavedStateHandlesProvider", l2);
            fVar.e().a(new C0167a(4, l2));
        }
    }

    public static final C0074o e(t tVar) {
        C0074o c0074o;
        k1.e.e(tVar, "<this>");
        v e2 = tVar.e();
        k1.e.e(e2, "<this>");
        loop0: while (true) {
            AtomicReference atomicReference = e2.f1896a;
            c0074o = (C0074o) atomicReference.get();
            if (c0074o == null) {
                a0 a0Var = new a0(null);
                y1.d dVar = AbstractC0341y.f4072a;
                c0074o = new C0074o(e2, b1.g.x(a0Var, w1.m.f4515a.f4166f));
                while (!atomicReference.compareAndSet(null, c0074o)) {
                    if (atomicReference.get() != null) {
                        break;
                    }
                }
                y1.d dVar2 = AbstractC0341y.f4072a;
                AbstractC0335s.g(c0074o, w1.m.f4515a.f4166f, new C0073n(c0074o, null), 2);
                break loop0;
            }
            break;
        }
        return c0074o;
    }

    public static final M f(S s2) {
        I i = new I();
        Q c2 = s2.c();
        b0.b a2 = s2 instanceof InterfaceC0067h ? ((InterfaceC0067h) s2).a() : C0080a.f2039b;
        k1.e.e(c2, "store");
        k1.e.e(a2, "defaultCreationExtras");
        return (M) new C0372k(c2, i, a2).g(k1.i.a(M.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final void g(View view, t tVar) {
        k1.e.e(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, tVar);
    }
}
