package androidx.lifecycle;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import m1.C1304b;
import m1.C1307e;
import m1.InterfaceC1306d;

/* loaded from: classes.dex */
public abstract class E {

    /* renamed from: a, reason: collision with root package name */
    public static final K f5014a = new K();

    /* renamed from: b, reason: collision with root package name */
    public static final K f5015b = new K();

    /* renamed from: c, reason: collision with root package name */
    public static final K f5016c = new K();

    public static final void a(J j4, C1307e registry, AbstractC0231j lifecycle) {
        Object obj;
        kotlin.jvm.internal.i.e(registry, "registry");
        kotlin.jvm.internal.i.e(lifecycle, "lifecycle");
        HashMap hashMap = j4.f5029a;
        if (hashMap == null) {
            obj = null;
        } else {
            synchronized (hashMap) {
                obj = j4.f5029a.get("androidx.lifecycle.savedstate.vm.tag");
            }
        }
        C c4 = (C) obj;
        if (c4 == null || c4.f5013c) {
            return;
        }
        c4.b(lifecycle, registry);
        EnumC0230i enumC0230i = ((C0237p) lifecycle).f5052c;
        if (enumC0230i == EnumC0230i.f5042b || enumC0230i.compareTo(EnumC0230i.f5044d) >= 0) {
            registry.d();
        } else {
            lifecycle.a(new C0226e(lifecycle, registry));
        }
    }

    public static B b(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            if (bundle2 == null) {
                return new B();
            }
            HashMap hashMap = new HashMap();
            for (String key : bundle2.keySet()) {
                kotlin.jvm.internal.i.d(key, "key");
                hashMap.put(key, bundle2.get(key));
            }
            return new B(hashMap);
        }
        ClassLoader classLoader = B.class.getClassLoader();
        kotlin.jvm.internal.i.b(classLoader);
        bundle.setClassLoader(classLoader);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
            throw new IllegalStateException("Invalid bundle passed as restored state");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = parcelableArrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            Object obj = parcelableArrayList.get(i4);
            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.String");
            linkedHashMap.put((String) obj, parcelableArrayList2.get(i4));
        }
        return new B(linkedHashMap);
    }

    public static final B c(R.c cVar) {
        LinkedHashMap linkedHashMap = cVar.f2272a;
        m1.g gVar = (m1.g) linkedHashMap.get(f5014a);
        if (gVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        P p2 = (P) linkedHashMap.get(f5015b);
        if (p2 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) linkedHashMap.get(f5016c);
        String str = (String) linkedHashMap.get(K.f5033b);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        InterfaceC1306d b4 = gVar.getSavedStateRegistry().b();
        F f4 = b4 instanceof F ? (F) b4 : null;
        if (f4 == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        LinkedHashMap linkedHashMap2 = e(p2).f5021d;
        B b5 = (B) linkedHashMap2.get(str);
        if (b5 != null) {
            return b5;
        }
        Class[] clsArr = B.f5005f;
        f4.b();
        Bundle bundle2 = f4.f5019c;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
        Bundle bundle4 = f4.f5019c;
        if (bundle4 != null) {
            bundle4.remove(str);
        }
        Bundle bundle5 = f4.f5019c;
        if (bundle5 != null && bundle5.isEmpty()) {
            f4.f5019c = null;
        }
        B b6 = b(bundle3, bundle);
        linkedHashMap2.put(str, b6);
        return b6;
    }

    public static final void d(m1.g gVar) {
        EnumC0230i enumC0230i = ((C0237p) gVar.getLifecycle()).f5052c;
        if (enumC0230i != EnumC0230i.f5042b && enumC0230i != EnumC0230i.f5043c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (gVar.getSavedStateRegistry().b() == null) {
            F f4 = new F(gVar.getSavedStateRegistry(), (P) gVar);
            gVar.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", f4);
            gVar.getLifecycle().a(new C1304b(1, f4));
        }
    }

    public static final G e(P p2) {
        return (G) new B1.j(p2.getViewModelStore(), new D(), p2 instanceof InterfaceC0224c ? ((InterfaceC0224c) p2).getDefaultViewModelCreationExtras() : R.a.f2271b).l(G.class, "androidx.lifecycle.internal.SavedStateHandlesVM");
    }
}
