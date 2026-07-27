package androidx.lifecycle;

import B1.C0097d;
import android.os.Bundle;
import android.view.View;
import com.chicken.road.kedro.laqer.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import l.t0;
import p1.C0991a;
import p1.C0993c;
import v1.C1245b;
import v1.C1248e;
import v1.InterfaceC1247d;
import v1.InterfaceC1249f;

/* loaded from: classes.dex */
public abstract class M {

    /* renamed from: a, reason: collision with root package name */
    public static final E1.i f5442a = new E1.i(8);

    /* renamed from: b, reason: collision with root package name */
    public static final H1.f f5443b = new H1.f(8, false);

    /* renamed from: c, reason: collision with root package name */
    public static final H1.f f5444c = new H1.f(7, false);

    public static final void a(T viewModel, C1248e registry, C0483x lifecycle) {
        AutoCloseable autoCloseable;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter("androidx.lifecycle.savedstate.vm.tag", "key");
        r1.b bVar = viewModel.f5457a;
        if (bVar != null) {
            Intrinsics.checkNotNullParameter("androidx.lifecycle.savedstate.vm.tag", "key");
            synchronized (bVar.f9857a) {
                autoCloseable = (AutoCloseable) bVar.f9858b.get("androidx.lifecycle.savedstate.vm.tag");
            }
        } else {
            autoCloseable = null;
        }
        K k4 = (K) autoCloseable;
        if (k4 == null || k4.f5441i) {
            return;
        }
        k4.g(lifecycle, registry);
        k(lifecycle, registry);
    }

    public static final K b(C1248e registry, C0483x lifecycle, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Bundle a4 = registry.a(str);
        Class[] clsArr = J.f5433f;
        K k4 = new K(str, c(a4, bundle));
        k4.g(lifecycle, registry);
        k(lifecycle, registry);
        return k4;
    }

    public static J c(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            if (bundle2 == null) {
                return new J();
            }
            HashMap hashMap = new HashMap();
            for (String key : bundle2.keySet()) {
                Intrinsics.checkNotNullExpressionValue(key, "key");
                hashMap.put(key, bundle2.get(key));
            }
            return new J(hashMap);
        }
        ClassLoader classLoader = J.class.getClassLoader();
        Intrinsics.c(classLoader);
        bundle.setClassLoader(classLoader);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
            throw new IllegalStateException("Invalid bundle passed as restored state");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = parcelableArrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = parcelableArrayList.get(i2);
            Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.String");
            linkedHashMap.put((String) obj, parcelableArrayList2.get(i2));
        }
        return new J(linkedHashMap);
    }

    public static final J d(C0993c c0993c) {
        Intrinsics.checkNotNullParameter(c0993c, "<this>");
        InterfaceC1249f interfaceC1249f = (InterfaceC1249f) c0993c.q(f5442a);
        if (interfaceC1249f == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        Z z4 = (Z) c0993c.q(f5443b);
        if (z4 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) c0993c.q(f5444c);
        String key = (String) c0993c.q(r1.c.f9861d);
        if (key == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        Intrinsics.checkNotNullParameter(interfaceC1249f, "<this>");
        InterfaceC1247d b4 = interfaceC1249f.c().b();
        N n2 = b4 instanceof N ? (N) b4 : null;
        if (n2 == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        O h4 = h(z4);
        J j4 = (J) h4.f5449b.get(key);
        if (j4 != null) {
            return j4;
        }
        Class[] clsArr = J.f5433f;
        Intrinsics.checkNotNullParameter(key, "key");
        n2.b();
        Bundle bundle2 = n2.f5447c;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(key) : null;
        Bundle bundle4 = n2.f5447c;
        if (bundle4 != null) {
            bundle4.remove(key);
        }
        Bundle bundle5 = n2.f5447c;
        if (bundle5 != null && bundle5.isEmpty()) {
            n2.f5447c = null;
        }
        J c4 = c(bundle3, bundle);
        h4.f5449b.put(key, c4);
        return c4;
    }

    public static final void e(InterfaceC1249f interfaceC1249f) {
        Intrinsics.checkNotNullParameter(interfaceC1249f, "<this>");
        EnumC0475o enumC0475o = interfaceC1249f.e().f5496d;
        if (enumC0475o != EnumC0475o.f5481e && enumC0475o != EnumC0475o.f5482i) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (interfaceC1249f.c().b() == null) {
            N n2 = new N(interfaceC1249f.c(), (Z) interfaceC1249f);
            interfaceC1249f.c().c("androidx.lifecycle.internal.SavedStateHandlesProvider", n2);
            interfaceC1249f.e().a(new C1245b(n2));
        }
    }

    public static final InterfaceC0481v f(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return (InterfaceC0481v) T2.r.h(T2.r.j(T2.n.f(view, a0.f5463e), a0.f5464i));
    }

    public static final Z g(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return (Z) T2.r.h(T2.r.j(T2.n.f(view, a0.f5465j), a0.f5466k));
    }

    public static final O h(Z owner) {
        Intrinsics.checkNotNullParameter(owner, "<this>");
        L factory = new L();
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Y store = owner.d();
        Intrinsics.checkNotNullParameter(owner, "owner");
        t0 defaultCreationExtras = owner instanceof InterfaceC0470j ? ((InterfaceC0470j) owner).a() : C0991a.f9082b;
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        C0097d c0097d = new C0097d(store, factory, defaultCreationExtras);
        Intrinsics.checkNotNullParameter("androidx.lifecycle.internal.SavedStateHandlesVM", "key");
        Intrinsics.checkNotNullParameter(O.class, "modelClass");
        Intrinsics.checkNotNullParameter(O.class, "<this>");
        return (O) c0097d.t(M2.F.a(O.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final void i(View view, InterfaceC0481v interfaceC0481v) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, interfaceC0481v);
    }

    public static final void j(View view, Z z4) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, z4);
    }

    public static void k(C0483x c0483x, C1248e c1248e) {
        EnumC0475o enumC0475o = c0483x.f5496d;
        if (enumC0475o == EnumC0475o.f5481e || enumC0475o.a(EnumC0475o.f5483j)) {
            c1248e.d();
        } else {
            c0483x.a(new C0467g(c0483x, c1248e));
        }
    }
}
