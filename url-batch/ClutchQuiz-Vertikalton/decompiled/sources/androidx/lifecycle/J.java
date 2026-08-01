package androidx.lifecycle;

import K.C0012m;
import a0.AbstractC0058b;
import a0.C0057a;
import android.view.View;
import b0.C0081a;
import com.clutchquizarena.app.R;
import h0.C0141a;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import o1.AbstractC0299s;
import o1.AbstractC0305y;
import o1.a0;

/* loaded from: classes.dex */
public abstract class J implements P {

    /* renamed from: a, reason: collision with root package name */
    public static final O0.e f1480a = new O0.e(17);

    /* renamed from: b, reason: collision with root package name */
    public static final O0.e f1481b = new O0.e(18);

    /* renamed from: c, reason: collision with root package name */
    public static final O0.e f1482c = new O0.e(16);
    public static final O0.e d = new O0.e(19);

    public static final void c(O o2, h0.d dVar, v vVar) {
        AutoCloseable autoCloseable;
        g1.f.e(dVar, "registry");
        g1.f.e(vVar, "lifecycle");
        C0081a c0081a = o2.f1489a;
        if (c0081a != null) {
            synchronized (c0081a.f1698a) {
                autoCloseable = (AutoCloseable) c0081a.f1699b.get("androidx.lifecycle.savedstate.vm.tag");
            }
        } else {
            autoCloseable = null;
        }
    }

    public static final void d(h0.f fVar) {
        h0.c cVar;
        EnumC0072m enumC0072m = fVar.d().d;
        if (enumC0072m != EnumC0072m.f1504b && enumC0072m != EnumC0072m.f1505c) {
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
            g1.f.d(entry, "components");
            String str = (String) entry.getKey();
            cVar = (h0.c) entry.getValue();
            if (g1.f.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                break;
            }
        }
        if (cVar == null) {
            L l2 = new L(fVar.b(), (S) fVar);
            fVar.b().e("androidx.lifecycle.internal.SavedStateHandlesProvider", l2);
            fVar.d().a(new C0141a(4, l2));
        }
    }

    public static final C0074o e(t tVar) {
        C0074o c0074o;
        g1.f.e(tVar, "<this>");
        v d2 = tVar.d();
        g1.f.e(d2, "<this>");
        loop0: while (true) {
            AtomicReference atomicReference = d2.f1515a;
            c0074o = (C0074o) atomicReference.get();
            if (c0074o == null) {
                a0 a0Var = new a0(null);
                u1.d dVar = AbstractC0305y.f3369a;
                c0074o = new C0074o(d2, T.d.G(a0Var, s1.m.f3666a.f3398f));
                while (!atomicReference.compareAndSet(null, c0074o)) {
                    if (atomicReference.get() != null) {
                        break;
                    }
                }
                u1.d dVar2 = AbstractC0305y.f3369a;
                AbstractC0299s.h(c0074o, s1.m.f3666a.f3398f, new C0073n(c0074o, null));
                break loop0;
            }
            break;
        }
        return c0074o;
    }

    public static final M f(S s2) {
        I i = new I();
        Q c2 = s2.c();
        AbstractC0058b a2 = s2 instanceof InterfaceC0067h ? ((InterfaceC0067h) s2).a() : C0057a.f1242b;
        g1.f.e(c2, "store");
        g1.f.e(a2, "defaultCreationExtras");
        return (M) new C0012m(c2, i, a2).n(g1.j.a(M.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final void g(View view, t tVar) {
        g1.f.e(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, tVar);
    }
}
