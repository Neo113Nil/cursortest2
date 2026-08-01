package androidx.lifecycle;

import a.AbstractC0058a;
import android.view.View;
import c0.AbstractC0102b;
import c0.C0101a;
import com.winpower.neonfit.R;
import j0.C0196a;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import r1.AbstractC0369t;
import r1.AbstractC0375z;
import r1.b0;

/* loaded from: classes.dex */
public abstract class J implements P {

    /* renamed from: a, reason: collision with root package name */
    public static final N0.e f1909a = new N0.e(18);

    /* renamed from: b, reason: collision with root package name */
    public static final N0.e f1910b = new N0.e(19);

    /* renamed from: c, reason: collision with root package name */
    public static final N0.e f1911c = new N0.e(17);

    /* renamed from: d, reason: collision with root package name */
    public static final N0.e f1912d = new N0.e(20);

    public static final void c(O o2, j0.d dVar, v vVar) {
        AutoCloseable autoCloseable;
        j1.h.e(dVar, "registry");
        j1.h.e(vVar, "lifecycle");
        d0.a aVar = o2.f1920a;
        if (aVar != null) {
            synchronized (aVar.f2646a) {
                autoCloseable = (AutoCloseable) aVar.f2647b.get("androidx.lifecycle.savedstate.vm.tag");
            }
        } else {
            autoCloseable = null;
        }
    }

    public static final void d(j0.f fVar) {
        j0.c cVar;
        EnumC0078m enumC0078m = fVar.e().f1949d;
        if (enumC0078m != EnumC0078m.f1935b && enumC0078m != EnumC0078m.f1936c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Iterator it = ((p.f) fVar.b().f3164d).iterator();
        while (true) {
            p.b bVar = (p.b) it;
            if (!bVar.hasNext()) {
                cVar = null;
                break;
            }
            Map.Entry entry = (Map.Entry) bVar.next();
            j1.h.d(entry, "components");
            String str = (String) entry.getKey();
            cVar = (j0.c) entry.getValue();
            if (j1.h.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                break;
            }
        }
        if (cVar == null) {
            L l2 = new L(fVar.b(), (S) fVar);
            fVar.b().e("androidx.lifecycle.internal.SavedStateHandlesProvider", l2);
            fVar.e().a(new C0196a(3, l2));
        }
    }

    public static final C0080o e(t tVar) {
        C0080o c0080o;
        j1.h.e(tVar, "<this>");
        v e = tVar.e();
        j1.h.e(e, "<this>");
        loop0: while (true) {
            AtomicReference atomicReference = e.f1946a;
            c0080o = (C0080o) atomicReference.get();
            if (c0080o == null) {
                b0 b0Var = new b0(null);
                y1.d dVar = AbstractC0375z.f4100a;
                c0080o = new C0080o(e, AbstractC0058a.R(b0Var, w1.n.f4493a.f4142f));
                while (!atomicReference.compareAndSet(null, c0080o)) {
                    if (atomicReference.get() != null) {
                        break;
                    }
                }
                y1.d dVar2 = AbstractC0375z.f4100a;
                AbstractC0369t.h(c0080o, w1.n.f4493a.f4142f, new C0079n(c0080o, null), 2);
                break loop0;
            }
            break;
        }
        return c0080o;
    }

    public static final M f(S s2) {
        I i = new I();
        Q c2 = s2.c();
        AbstractC0102b a2 = s2 instanceof InterfaceC0073h ? ((InterfaceC0073h) s2).a() : C0101a.f2227b;
        j1.h.e(c2, "store");
        j1.h.e(a2, "defaultCreationExtras");
        return (M) new I0.h(c2, i, a2).n(j1.l.a(M.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final void g(View view, t tVar) {
        j1.h.e(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, tVar);
    }
}
