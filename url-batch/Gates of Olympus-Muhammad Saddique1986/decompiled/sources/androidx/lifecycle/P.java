package androidx.lifecycle;

import android.os.Bundle;
import android.view.View;
import b.AbstractActivityC0319o;
import com.gatesof.olympus.martu.marku.R;
import h2.AbstractC0508a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;
import m.s0;
import q1.C0811a;
import q1.C0812b;
import q2.AbstractC0837y;
import q2.n0;
import s1.C0963a;
import s1.C0966d;

/* loaded from: classes.dex */
public abstract class P {

    /* renamed from: a, reason: collision with root package name */
    public static final A1.i f5187a = new A1.i(17, false);

    /* renamed from: b, reason: collision with root package name */
    public static final A1.i f5188b = new A1.i(18, false);

    /* renamed from: c, reason: collision with root package name */
    public static final A1.i f5189c = new A1.i(16, false);

    /* renamed from: d, reason: collision with root package name */
    public static final C0966d f5190d = new C0966d();

    public static final void a(V v3, y1.e eVar, C0294x c0294x) {
        f2.j.f(eVar, "registry");
        f2.j.f(c0294x, "lifecycle");
        N n3 = (N) v3.c("androidx.lifecycle.savedstate.vm.tag");
        if (n3 == null || n3.f5186f) {
            return;
        }
        n3.g(c0294x, eVar);
        l(c0294x, eVar);
    }

    public static final N b(y1.e eVar, C0294x c0294x, String str, Bundle bundle) {
        f2.j.f(eVar, "registry");
        f2.j.f(c0294x, "lifecycle");
        Bundle a3 = eVar.a(str);
        Class[] clsArr = M.f5178f;
        N n3 = new N(str, c(a3, bundle));
        n3.g(c0294x, eVar);
        l(c0294x, eVar);
        return n3;
    }

    public static M c(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            if (bundle2 == null) {
                return new M();
            }
            HashMap hashMap = new HashMap();
            for (String str : bundle2.keySet()) {
                f2.j.e(str, "key");
                hashMap.put(str, bundle2.get(str));
            }
            return new M(hashMap);
        }
        ClassLoader classLoader = M.class.getClassLoader();
        f2.j.c(classLoader);
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
            f2.j.d(obj, "null cannot be cast to non-null type kotlin.String");
            linkedHashMap.put((String) obj, parcelableArrayList2.get(i3));
        }
        return new M(linkedHashMap);
    }

    public static final M d(C0812b c0812b) {
        A1.i iVar = f5187a;
        LinkedHashMap linkedHashMap = (LinkedHashMap) c0812b.f6877a;
        y1.f fVar = (y1.f) linkedHashMap.get(iVar);
        if (fVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        b0 b0Var = (b0) linkedHashMap.get(f5188b);
        if (b0Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) linkedHashMap.get(f5189c);
        String str = (String) linkedHashMap.get(C0966d.f8358a);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        y1.d b3 = fVar.c().b();
        Q q3 = b3 instanceof Q ? (Q) b3 : null;
        if (q3 == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        LinkedHashMap linkedHashMap2 = i(b0Var).f5195b;
        M m3 = (M) linkedHashMap2.get(str);
        if (m3 != null) {
            return m3;
        }
        Class[] clsArr = M.f5178f;
        q3.b();
        Bundle bundle2 = q3.f5193c;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
        Bundle bundle4 = q3.f5193c;
        if (bundle4 != null) {
            bundle4.remove(str);
        }
        Bundle bundle5 = q3.f5193c;
        if (bundle5 != null && bundle5.isEmpty()) {
            q3.f5193c = null;
        }
        M c2 = c(bundle3, bundle);
        linkedHashMap2.put(str, c2);
        return c2;
    }

    public static final void e(y1.f fVar) {
        EnumC0286o enumC0286o = fVar.e().f5242d;
        if (enumC0286o != EnumC0286o.f5227e && enumC0286o != EnumC0286o.f5228f) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (fVar.c().b() == null) {
            Q q3 = new Q(fVar.c(), (b0) fVar);
            fVar.c().c("androidx.lifecycle.internal.SavedStateHandlesProvider", q3);
            fVar.e().a(new y1.b(2, q3));
        }
    }

    public static final InterfaceC0292v f(View view) {
        f2.j.f(view, "<this>");
        return (InterfaceC0292v) m2.h.S(m2.h.U(m2.h.T(view, c0.f5213f), c0.f5214g));
    }

    public static final b0 g(View view) {
        f2.j.f(view, "<this>");
        return (b0) m2.h.S(m2.h.U(m2.h.T(view, c0.f5215h), c0.f5216i));
    }

    public static final C0288q h(AbstractActivityC0319o abstractActivityC0319o) {
        C0288q c0288q;
        C0294x c0294x = abstractActivityC0319o.f4509d;
        f2.j.f(c0294x, "<this>");
        loop0: while (true) {
            AtomicReference atomicReference = c0294x.f5239a;
            c0288q = (C0288q) atomicReference.get();
            if (c0288q == null) {
                n0 b3 = AbstractC0837y.b();
                x2.e eVar = q2.E.f7851a;
                c0288q = new C0288q(c0294x, AbstractC0508a.L(b3, v2.m.f9819a.f8207i));
                while (!atomicReference.compareAndSet(null, c0288q)) {
                    if (atomicReference.get() != null) {
                        break;
                    }
                }
                x2.e eVar2 = q2.E.f7851a;
                AbstractC0837y.r(c0288q, v2.m.f9819a.f8207i, null, new C0287p(c0288q, null), 2);
                break loop0;
            }
            break;
        }
        return c0288q;
    }

    public static final S i(b0 b0Var) {
        O o3 = new O();
        a0 d3 = b0Var.d();
        s0 a3 = b0Var instanceof InterfaceC0281j ? ((InterfaceC0281j) b0Var).a() : C0811a.f7847b;
        f2.j.f(a3, "defaultCreationExtras");
        return (S) new G1.m(d3, o3, a3).o(f2.v.a(S.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final C0963a j(V v3) {
        C0963a c0963a;
        f2.j.f(v3, "<this>");
        synchronized (f5190d) {
            c0963a = (C0963a) v3.c("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (c0963a == null) {
                V1.i iVar = V1.j.f4558d;
                try {
                    x2.e eVar = q2.E.f7851a;
                    iVar = v2.m.f9819a.f8207i;
                } catch (R1.h | IllegalStateException unused) {
                }
                C0963a c0963a2 = new C0963a(iVar.d(AbstractC0837y.b()));
                v3.a("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", c0963a2);
                c0963a = c0963a2;
            }
        }
        return c0963a;
    }

    public static final void k(View view, InterfaceC0292v interfaceC0292v) {
        f2.j.f(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, interfaceC0292v);
    }

    public static void l(C0294x c0294x, y1.e eVar) {
        EnumC0286o enumC0286o = c0294x.f5242d;
        if (enumC0286o == EnumC0286o.f5227e || enumC0286o.compareTo(EnumC0286o.f5229g) >= 0) {
            eVar.d();
        } else {
            c0294x.a(new C0278g(c0294x, eVar));
        }
    }
}
