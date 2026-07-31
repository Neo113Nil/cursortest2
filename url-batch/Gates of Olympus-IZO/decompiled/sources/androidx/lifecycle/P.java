package androidx.lifecycle;

import D1.C0014b;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;
import k2.AbstractC0552y;
import k2.n0;
import m.w0;
import n1.C0674a;
import n1.C0675b;
import p1.C0762a;
import p1.C0765d;

/* loaded from: classes.dex */
public abstract class P {

    /* renamed from: a, reason: collision with root package name */
    public static final F0.a f3986a = new F0.a(15);

    /* renamed from: b, reason: collision with root package name */
    public static final F0.a f3987b = new F0.a(16);

    /* renamed from: c, reason: collision with root package name */
    public static final F0.a f3988c = new F0.a(14);

    /* renamed from: d, reason: collision with root package name */
    public static final C0765d f3989d = new C0765d();

    public static final void a(V v3, u1.e eVar, C0238x c0238x) {
        Z1.i.f(eVar, "registry");
        Z1.i.f(c0238x, "lifecycle");
        N n3 = (N) v3.c("androidx.lifecycle.savedstate.vm.tag");
        if (n3 == null || n3.f3985f) {
            return;
        }
        n3.i(c0238x, eVar);
        k(c0238x, eVar);
    }

    public static final N b(u1.e eVar, C0238x c0238x, String str, Bundle bundle) {
        Z1.i.f(eVar, "registry");
        Z1.i.f(c0238x, "lifecycle");
        Bundle a3 = eVar.a(str);
        Class[] clsArr = M.f3977f;
        N n3 = new N(str, c(a3, bundle));
        n3.i(c0238x, eVar);
        k(c0238x, eVar);
        return n3;
    }

    public static M c(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            if (bundle2 == null) {
                return new M();
            }
            HashMap hashMap = new HashMap();
            for (String str : bundle2.keySet()) {
                Z1.i.e(str, "key");
                hashMap.put(str, bundle2.get(str));
            }
            return new M(hashMap);
        }
        ClassLoader classLoader = M.class.getClassLoader();
        Z1.i.c(classLoader);
        bundle.setClassLoader(classLoader);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
            throw new IllegalStateException("Invalid bundle passed as restored state");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = parcelableArrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = parcelableArrayList.get(i3);
            Z1.i.d(obj, "null cannot be cast to non-null type kotlin.String");
            linkedHashMap.put((String) obj, parcelableArrayList2.get(i3));
        }
        return new M(linkedHashMap);
    }

    public static final M d(C0675b c0675b) {
        F0.a aVar = f3986a;
        LinkedHashMap linkedHashMap = (LinkedHashMap) c0675b.f5876a;
        u1.f fVar = (u1.f) linkedHashMap.get(aVar);
        if (fVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        b0 b0Var = (b0) linkedHashMap.get(f3987b);
        if (b0Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) linkedHashMap.get(f3988c);
        String str = (String) linkedHashMap.get(C0765d.f6760a);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        u1.d b2 = fVar.c().b();
        Q q2 = b2 instanceof Q ? (Q) b2 : null;
        if (q2 == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        LinkedHashMap linkedHashMap2 = i(b0Var).f3994b;
        M m3 = (M) linkedHashMap2.get(str);
        if (m3 != null) {
            return m3;
        }
        Class[] clsArr = M.f3977f;
        q2.b();
        Bundle bundle2 = q2.f3992c;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
        Bundle bundle4 = q2.f3992c;
        if (bundle4 != null) {
            bundle4.remove(str);
        }
        Bundle bundle5 = q2.f3992c;
        if (bundle5 != null && bundle5.isEmpty()) {
            q2.f3992c = null;
        }
        M c3 = c(bundle3, bundle);
        linkedHashMap2.put(str, c3);
        return c3;
    }

    public static final void e(u1.f fVar) {
        EnumC0230o enumC0230o = fVar.e().f4041d;
        if (enumC0230o != EnumC0230o.f4026e && enumC0230o != EnumC0230o.f4027f) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (fVar.c().b() == null) {
            Q q2 = new Q(fVar.c(), (b0) fVar);
            fVar.c().c("androidx.lifecycle.internal.SavedStateHandlesProvider", q2);
            fVar.e().a(new u1.b(2, q2));
        }
    }

    public static final InterfaceC0236v f(View view) {
        Z1.i.f(view, "<this>");
        return (InterfaceC0236v) g2.h.b0(g2.h.d0(g2.h.c0(view, c0.f4012f), c0.f4013g));
    }

    public static final b0 g(View view) {
        Z1.i.f(view, "<this>");
        return (b0) g2.h.b0(g2.h.d0(g2.h.c0(view, c0.f4014h), c0.f4015i));
    }

    public static final C0232q h(b.o oVar) {
        C0232q c0232q;
        C0238x c0238x = oVar.f3274d;
        Z1.i.f(c0238x, "<this>");
        loop0: while (true) {
            AtomicReference atomicReference = c0238x.f4038a;
            c0232q = (C0232q) atomicReference.get();
            if (c0232q == null) {
                n0 b2 = AbstractC0552y.b();
                r2.e eVar = k2.E.f5312a;
                c0232q = new C0232q(c0238x, I2.l.M(b2, p2.n.f6799a.f5551i));
                while (!atomicReference.compareAndSet(null, c0232q)) {
                    if (atomicReference.get() != null) {
                        break;
                    }
                }
                r2.e eVar2 = k2.E.f5312a;
                AbstractC0552y.q(c0232q, p2.n.f6799a.f5551i, null, new C0231p(c0232q, null), 2);
                break loop0;
            }
            break;
        }
        return c0232q;
    }

    public static final S i(b0 b0Var) {
        O o3 = new O();
        a0 d3 = b0Var.d();
        w0 a3 = b0Var instanceof InterfaceC0225j ? ((InterfaceC0225j) b0Var).a() : C0674a.f6271b;
        Z1.i.f(a3, "defaultCreationExtras");
        return (S) new C0014b(d3, o3, a3).n(Z1.u.a(S.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final C0762a j(V v3) {
        C0762a c0762a;
        Z1.i.f(v3, "<this>");
        synchronized (f3989d) {
            c0762a = (C0762a) v3.c("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (c0762a == null) {
                P1.i iVar = P1.j.f3073d;
                try {
                    r2.e eVar = k2.E.f5312a;
                    iVar = p2.n.f6799a.f5551i;
                } catch (L1.i | IllegalStateException unused) {
                }
                C0762a c0762a2 = new C0762a(iVar.o(AbstractC0552y.b()));
                v3.a("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", c0762a2);
                c0762a = c0762a2;
            }
        }
        return c0762a;
    }

    public static void k(C0238x c0238x, u1.e eVar) {
        EnumC0230o enumC0230o = c0238x.f4041d;
        if (enumC0230o == EnumC0230o.f4026e || enumC0230o.compareTo(EnumC0230o.f4028g) >= 0) {
            eVar.d();
        } else {
            c0238x.a(new C0222g(c0238x, eVar));
        }
    }
}
