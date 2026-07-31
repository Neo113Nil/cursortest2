package androidx.lifecycle;

import android.os.Bundle;
import android.view.View;
import com.snovikpovik.vuevnxsj.R;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final w5.f f836a = new w5.f(1);

    /* renamed from: b, reason: collision with root package name */
    public static final w5.f f837b = new w5.f(2);

    /* renamed from: c, reason: collision with root package name */
    public static final w5.f f838c = new w5.f(3);

    public static final void a(r0 r0Var, x4.e eVar, w wVar) {
        AutoCloseable autoCloseable;
        q6.i.e(eVar, "registry");
        q6.i.e(wVar, "lifecycle");
        n4.c cVar = r0Var.f860a;
        if (cVar != null) {
            synchronized (cVar.f5371a) {
                autoCloseable = (AutoCloseable) cVar.f5372b.get("androidx.lifecycle.savedstate.vm.tag");
            }
        } else {
            autoCloseable = null;
        }
        j0 j0Var = (j0) autoCloseable;
        if (j0Var == null || j0Var.f835f) {
            return;
        }
        j0Var.e(wVar, eVar);
        p pVar = wVar.f871c;
        if (pVar == p.f848e || pVar.compareTo(p.f850g) >= 0) {
            eVar.g();
        } else {
            wVar.a(new h(wVar, eVar));
        }
    }

    public static final i0 b(l4.b bVar) {
        i0 i0Var;
        q6.i.e(bVar, "<this>");
        x4.f fVar = (x4.f) bVar.a(f836a);
        if (fVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        x0 x0Var = (x0) bVar.a(f837b);
        if (x0Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) bVar.a(f838c);
        String str = (String) bVar.a(v0.f867b);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        x4.d b8 = fVar.b().b();
        Bundle bundle2 = null;
        n0 n0Var = b8 instanceof n0 ? (n0) b8 : null;
        if (n0Var == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        LinkedHashMap linkedHashMap = f(x0Var).f846b;
        i0 i0Var2 = (i0) linkedHashMap.get(str);
        if (i0Var2 != null) {
            return i0Var2;
        }
        n0Var.b();
        Bundle bundle3 = n0Var.f844c;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                bundle4 = h0.a.j((c6.f[]) Arrays.copyOf(new c6.f[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                n0Var.f844c = null;
            }
            bundle2 = bundle4;
        }
        if (bundle2 != null) {
            bundle = bundle2;
        }
        if (bundle == null) {
            i0Var = new i0();
        } else {
            ClassLoader classLoader = i0.class.getClassLoader();
            q6.i.b(classLoader);
            bundle.setClassLoader(classLoader);
            e6.f fVar2 = new e6.f(bundle.size());
            for (String str2 : bundle.keySet()) {
                q6.i.b(str2);
                fVar2.put(str2, bundle.get(str2));
            }
            i0Var = new i0(d6.y.E(fVar2));
        }
        linkedHashMap.put(str, i0Var);
        return i0Var;
    }

    public static final void c(x4.f fVar) {
        p pVar = fVar.g().f871c;
        if (pVar != p.f848e && pVar != p.f849f) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (fVar.b().b() == null) {
            n0 n0Var = new n0(fVar.b(), (x0) fVar);
            fVar.b().f("androidx.lifecycle.internal.SavedStateHandlesProvider", n0Var);
            fVar.g().a(new e(1, n0Var));
        }
    }

    public static final u d(View view) {
        q6.i.e(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            u uVar = tag instanceof u ? (u) tag : null;
            if (uVar != null) {
                return uVar;
            }
            Object L = r2.o.L(view);
            view = L instanceof View ? (View) L : null;
        }
        return null;
    }

    public static final x0 e(View view) {
        q6.i.e(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            x0 x0Var = tag instanceof x0 ? (x0) tag : null;
            if (x0Var != null) {
                return x0Var;
            }
            Object L = r2.o.L(view);
            view = L instanceof View ? (View) L : null;
        }
        return null;
    }

    public static final o0 f(x0 x0Var) {
        v0 b8 = w5.f.b(x0Var, new k0(), 4);
        return (o0) ((c5.x) b8.f868a).n(q6.t.a(o0.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final void g(View view, u uVar) {
        q6.i.e(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, uVar);
    }

    public static final void h(View view, x0 x0Var) {
        q6.i.e(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, x0Var);
    }
}
