package androidx.lifecycle;

import android.os.Bundle;
import android.view.View;
import c7.n1;
import com.android.installreferrer.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;
import l.u1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final j4.i f1021a = new j4.i(2);

    /* renamed from: b, reason: collision with root package name */
    public static final m4.f f1022b = new m4.f();

    /* renamed from: c, reason: collision with root package name */
    public static final m4.f f1023c = new m4.f();

    /* renamed from: d, reason: collision with root package name */
    public static final s3.d f1024d = new s3.d();

    public static final void a(w0 w0Var, x3.e eVar, x xVar) {
        r6.k.f(eVar, "registry");
        r6.k.f(xVar, "lifecycle");
        o0 o0Var = (o0) w0Var.c("androidx.lifecycle.savedstate.vm.tag");
        if (o0Var == null || o0Var.f1015h) {
            return;
        }
        o0Var.k(xVar, eVar);
        l(xVar, eVar);
    }

    public static final o0 b(x3.e eVar, x xVar, String str, Bundle bundle) {
        r6.k.f(eVar, "registry");
        r6.k.f(xVar, "lifecycle");
        Bundle a3 = eVar.a(str);
        Class[] clsArr = n0.f1001f;
        o0 o0Var = new o0(str, c(a3, bundle));
        o0Var.k(xVar, eVar);
        l(xVar, eVar);
        return o0Var;
    }

    public static n0 c(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            if (bundle2 == null) {
                return new n0();
            }
            HashMap hashMap = new HashMap();
            for (String str : bundle2.keySet()) {
                r6.k.e(str, "key");
                hashMap.put(str, bundle2.get(str));
            }
            return new n0(hashMap);
        }
        ClassLoader classLoader = n0.class.getClassLoader();
        r6.k.c(classLoader);
        bundle.setClassLoader(classLoader);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
            throw new IllegalStateException("Invalid bundle passed as restored state");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = parcelableArrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            Object obj = parcelableArrayList.get(i7);
            r6.k.d(obj, "null cannot be cast to non-null type kotlin.String");
            linkedHashMap.put((String) obj, parcelableArrayList2.get(i7));
        }
        return new n0(linkedHashMap);
    }

    public static final n0 d(q3.b bVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) bVar.f5679a;
        x3.f fVar = (x3.f) linkedHashMap.get(f1021a);
        if (fVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        c1 c1Var = (c1) linkedHashMap.get(f1022b);
        if (c1Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) linkedHashMap.get(f1023c);
        String str = (String) linkedHashMap.get(s3.d.f8527a);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        x3.d b9 = fVar.b().b();
        s0 s0Var = b9 instanceof s0 ? (s0) b9 : null;
        if (s0Var == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        LinkedHashMap linkedHashMap2 = i(c1Var).f1032b;
        n0 n0Var = (n0) linkedHashMap2.get(str);
        if (n0Var != null) {
            return n0Var;
        }
        Class[] clsArr = n0.f1001f;
        s0Var.b();
        Bundle bundle2 = s0Var.f1030c;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
        Bundle bundle4 = s0Var.f1030c;
        if (bundle4 != null) {
            bundle4.remove(str);
        }
        Bundle bundle5 = s0Var.f1030c;
        if (bundle5 != null && bundle5.isEmpty()) {
            s0Var.f1030c = null;
        }
        n0 c4 = c(bundle3, bundle);
        linkedHashMap2.put(str, c4);
        return c4;
    }

    public static final void e(x3.f fVar) {
        o oVar = fVar.f().f1046d;
        if (oVar != o.f1008g && oVar != o.f1009h) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (fVar.b().b() == null) {
            s0 s0Var = new s0(fVar.b(), (c1) fVar);
            fVar.b().c("androidx.lifecycle.internal.SavedStateHandlesProvider", s0Var);
            fVar.f().a(new x3.b(2, s0Var));
        }
    }

    public static final v f(View view) {
        r6.k.f(view, "<this>");
        return (v) y6.h.n(y6.h.p(y6.h.o(view, d1.f957h), d1.f958i));
    }

    public static final c1 g(View view) {
        r6.k.f(view, "<this>");
        return (c1) y6.h.n(y6.h.p(y6.h.o(view, d1.f959j), d1.f960k));
    }

    public static final q h(b.o oVar) {
        x xVar = oVar.f8494f;
        r6.k.f(xVar, "<this>");
        AtomicReference atomicReference = xVar.f1043a;
        while (true) {
            q qVar = (q) atomicReference.get();
            if (qVar != null) {
                return qVar;
            }
            n1 b9 = c7.a0.b();
            j7.e eVar = c7.g0.f1696a;
            q qVar2 = new q(xVar, t6.a.I(b9, h7.m.f4700a.f2648k));
            do {
                h6.d dVar = null;
                if (atomicReference.compareAndSet(null, qVar2)) {
                    j7.e eVar2 = c7.g0.f1696a;
                    c7.a0.p(qVar2, h7.m.f4700a.f2648k, null, new p(qVar2, dVar, 0), 2);
                    return qVar2;
                }
            } while (atomicReference.get() == null);
        }
    }

    public static final t0 i(c1 c1Var) {
        p0 p0Var = new p0();
        b1 e9 = c1Var.e();
        u1 d8 = c1Var instanceof j ? ((j) c1Var).d() : q3.a.f7511b;
        r6.k.f(e9, "store");
        r6.k.f(d8, "defaultCreationExtras");
        return (t0) new b1.b(e9, p0Var, d8).q("androidx.lifecycle.internal.SavedStateHandlesVM", r6.w.a(t0.class));
    }

    public static final s3.a j(w0 w0Var) {
        s3.a aVar;
        r6.k.f(w0Var, "<this>");
        synchronized (f1024d) {
            aVar = (s3.a) w0Var.c("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (aVar == null) {
                h6.i iVar = h6.j.f4661f;
                try {
                    j7.e eVar = c7.g0.f1696a;
                    iVar = h7.m.f4700a.f2648k;
                } catch (d6.i | IllegalStateException unused) {
                }
                s3.a aVar2 = new s3.a(iVar.z(c7.a0.b()));
                w0Var.a("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", aVar2);
                aVar = aVar2;
            }
        }
        return aVar;
    }

    public static final void k(View view, v vVar) {
        r6.k.f(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, vVar);
    }

    public static void l(x xVar, x3.e eVar) {
        o oVar = xVar.f1046d;
        if (oVar == o.f1008g || oVar.compareTo(o.f1010i) >= 0) {
            eVar.d();
        } else {
            xVar.a(new g(xVar, eVar));
        }
    }
}
