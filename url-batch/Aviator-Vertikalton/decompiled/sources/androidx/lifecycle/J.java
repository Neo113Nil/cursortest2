package androidx.lifecycle;

import a0.C0043a;
import android.os.Bundle;
import android.view.View;
import com.fortuneink.neonpad.R;
import g0.C0163a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public abstract class J {

    /* renamed from: a, reason: collision with root package name */
    public static final H0.e f1453a = new H0.e(14);

    /* renamed from: b, reason: collision with root package name */
    public static final H0.e f1454b = new H0.e(15);

    /* renamed from: c, reason: collision with root package name */
    public static final H0.e f1455c = new H0.e(13);

    public static final void a(P p2, g0.d dVar, AbstractC0082o abstractC0082o) {
        AutoCloseable autoCloseable;
        X0.f.e(dVar, "registry");
        X0.f.e(abstractC0082o, "lifecycle");
        C0043a c0043a = p2.f1470a;
        if (c0043a != null) {
            synchronized (c0043a.f948a) {
                autoCloseable = (AutoCloseable) c0043a.f949b.get("androidx.lifecycle.savedstate.vm.tag");
            }
        } else {
            autoCloseable = null;
        }
        H h = (H) autoCloseable;
        if (h == null || h.f1452c) {
            return;
        }
        h.h(dVar, abstractC0082o);
        EnumC0081n enumC0081n = ((C0088v) abstractC0082o).f1499c;
        if (enumC0081n == EnumC0081n.f1489b || enumC0081n.compareTo(EnumC0081n.f1491d) >= 0) {
            dVar.d();
        } else {
            abstractC0082o.a(new C0073f(abstractC0082o, 1, dVar));
        }
    }

    public static G b(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            if (bundle2 == null) {
                return new G();
            }
            HashMap hashMap = new HashMap();
            for (String str : bundle2.keySet()) {
                X0.f.d(str, "key");
                hashMap.put(str, bundle2.get(str));
            }
            return new G(hashMap);
        }
        ClassLoader classLoader = G.class.getClassLoader();
        X0.f.b(classLoader);
        bundle.setClassLoader(classLoader);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
            throw new IllegalStateException("Invalid bundle passed as restored state");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = parcelableArrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = parcelableArrayList.get(i);
            X0.f.c(obj, "null cannot be cast to non-null type kotlin.String");
            linkedHashMap.put((String) obj, parcelableArrayList2.get(i));
        }
        return new G(linkedHashMap);
    }

    public static final G c(Z.c cVar) {
        H0.e eVar = f1453a;
        LinkedHashMap linkedHashMap = cVar.f882a;
        g0.f fVar = (g0.f) linkedHashMap.get(eVar);
        if (fVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        V v2 = (V) linkedHashMap.get(f1454b);
        if (v2 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) linkedHashMap.get(f1455c);
        String str = (String) linkedHashMap.get(a0.b.f952a);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        g0.c b2 = fVar.getSavedStateRegistry().b();
        L l2 = b2 instanceof L ? (L) b2 : null;
        if (l2 == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        LinkedHashMap linkedHashMap2 = e(v2).f1462b;
        G g2 = (G) linkedHashMap2.get(str);
        if (g2 != null) {
            return g2;
        }
        Class[] clsArr = G.f1444f;
        l2.b();
        Bundle bundle2 = l2.f1460c;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
        Bundle bundle4 = l2.f1460c;
        if (bundle4 != null) {
            bundle4.remove(str);
        }
        Bundle bundle5 = l2.f1460c;
        if (bundle5 != null && bundle5.isEmpty()) {
            l2.f1460c = null;
        }
        G b3 = b(bundle3, bundle);
        linkedHashMap2.put(str, b3);
        return b3;
    }

    public static final void d(g0.f fVar) {
        EnumC0081n enumC0081n = ((C0088v) fVar.getLifecycle()).f1499c;
        if (enumC0081n != EnumC0081n.f1489b && enumC0081n != EnumC0081n.f1490c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (fVar.getSavedStateRegistry().b() == null) {
            L l2 = new L(fVar.getSavedStateRegistry(), (V) fVar);
            fVar.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", l2);
            fVar.getLifecycle().a(new C0163a(4, l2));
        }
    }

    public static final M e(V v2) {
        I i = new I();
        U viewModelStore = v2.getViewModelStore();
        Z.b defaultViewModelCreationExtras = v2 instanceof InterfaceC0076i ? ((InterfaceC0076i) v2).getDefaultViewModelCreationExtras() : Z.a.f881b;
        X0.f.e(viewModelStore, "store");
        X0.f.e(defaultViewModelCreationExtras, "defaultCreationExtras");
        return (M) new T.r(viewModelStore, i, defaultViewModelCreationExtras).n(X0.j.a(M.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final void f(View view, InterfaceC0086t interfaceC0086t) {
        X0.f.e(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, interfaceC0086t);
    }
}
