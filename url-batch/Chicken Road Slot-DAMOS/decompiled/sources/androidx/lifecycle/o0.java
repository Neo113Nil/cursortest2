package androidx.lifecycle;

import android.os.Bundle;
import android.view.View;
import com.appsflyer.R;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final u8.d f703a = new u8.d(4);

    /* renamed from: b, reason: collision with root package name */
    public static final u8.d f704b = new u8.d(5);

    /* renamed from: c, reason: collision with root package name */
    public static final u8.d f705c = new u8.d(6);

    /* renamed from: d, reason: collision with root package name */
    public static final m4.c f706d = new m4.c();

    public static final void a(u0 u0Var, c6.l lVar, w wVar) {
        lVar.getClass();
        wVar.getClass();
        m0 m0Var = (m0) u0Var.c("androidx.lifecycle.savedstate.vm.tag");
        if (m0Var == null || m0Var.f701i) {
            return;
        }
        m0Var.j(wVar, lVar);
        p pVar = wVar.f737c;
        if (pVar == p.f708e || pVar.compareTo(p.f710r) >= 0) {
            lVar.l();
        } else {
            wVar.a(new h(wVar, lVar));
        }
    }

    public static final l0 b(k4.b bVar) {
        l0 l0Var;
        bVar.getClass();
        f5.e eVar = (f5.e) bVar.a(f703a);
        if (eVar == null) {
            te.a1.e("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
            return null;
        }
        a1 a1Var = (a1) bVar.a(f704b);
        if (a1Var == null) {
            te.a1.e("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        Bundle bundle = (Bundle) bVar.a(f705c);
        String str = (String) bVar.a(y0.f747b);
        if (str == null) {
            te.a1.e("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            return null;
        }
        f5.d e2 = eVar.b().e("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle2 = null;
        p0 p0Var = e2 instanceof p0 ? (p0) e2 : null;
        if (p0Var == null) {
            kotlin.collections.i0.l("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
            return null;
        }
        q0 f3 = f(a1Var);
        l0 l0Var2 = (l0) f3.f717b.get(str);
        if (l0Var2 != null) {
            return l0Var2;
        }
        p0Var.b();
        Bundle bundle3 = p0Var.f715c;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                kotlin.collections.k0.f5575d.getClass();
                bundle4 = z4.w.h((Pair[]) Arrays.copyOf(new Pair[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                p0Var.f715c = null;
            }
            bundle2 = bundle4;
        }
        if (bundle2 != null) {
            bundle = bundle2;
        }
        if (bundle == null) {
            l0Var = new l0();
        } else {
            ClassLoader classLoader = l0.class.getClassLoader();
            classLoader.getClass();
            bundle.setClassLoader(classLoader);
            id.h hVar = new id.h(bundle.size());
            for (String str2 : bundle.keySet()) {
                str2.getClass();
                hVar.put(str2, bundle.get(str2));
            }
            l0Var = new l0(hVar.b());
        }
        f3.f717b.put(str, l0Var);
        return l0Var;
    }

    public static final void c(f5.e eVar) {
        p pVar = eVar.g().f737c;
        if (pVar != p.f708e && pVar != p.f709i) {
            te.a1.e("Failed requirement.");
        } else if (eVar.b().e("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            p0 p0Var = new p0(eVar.b(), (a1) eVar);
            eVar.b().i("androidx.lifecycle.internal.SavedStateHandlesProvider", p0Var);
            eVar.g().a(new e(1, p0Var));
        }
    }

    public static final u d(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            u uVar = tag instanceof u ? (u) tag : null;
            if (uVar != null) {
                return uVar;
            }
            Object z10 = z4.w.z(view);
            view = z10 instanceof View ? (View) z10 : null;
        }
        return null;
    }

    public static final a1 e(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            a1 a1Var = tag instanceof a1 ? (a1) tag : null;
            if (a1Var != null) {
                return a1Var;
            }
            Object z10 = z4.w.z(view);
            view = z10 instanceof View ? (View) z10 : null;
        }
        return null;
    }

    public static final q0 f(a1 a1Var) {
        y0 a9 = u8.d.a(a1Var, new n0(), 4);
        return (q0) ((c6.n) a9.f748a).b(wd.c0.a(q0.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final m4.a g(u0 u0Var) {
        m4.a aVar;
        CoroutineContext coroutineContext;
        u0Var.getClass();
        synchronized (f706d) {
            aVar = (m4.a) u0Var.c("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (aVar == null) {
                try {
                    try {
                        ne.e eVar = ge.k0.f4372a;
                        coroutineContext = le.o.f5995a.f4537t;
                    } catch (hd.k unused) {
                        coroutineContext = kotlin.coroutines.g.f5592d;
                    }
                } catch (IllegalStateException unused2) {
                    coroutineContext = kotlin.coroutines.g.f5592d;
                }
                m4.a aVar2 = new m4.a(coroutineContext.p(ge.a0.d()));
                u0Var.a("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", aVar2);
                aVar = aVar2;
            }
        }
        return aVar;
    }
}
