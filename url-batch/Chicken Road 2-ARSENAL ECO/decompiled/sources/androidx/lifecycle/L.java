package androidx.lifecycle;

import H5.AbstractC0165z;
import H5.n0;
import a1.AbstractC0223a;
import android.os.Bundle;
import com.onesignal.core.activities.PermissionsActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class L {

    /* renamed from: a, reason: collision with root package name */
    public static final T f3475a = new T();

    /* renamed from: b, reason: collision with root package name */
    public static final T f3476b = new T();

    /* renamed from: c, reason: collision with root package name */
    public static final T f3477c = new T();

    public static final void a(S s6, T.f registry, AbstractC0248o lifecycle) {
        kotlin.jvm.internal.i.e(registry, "registry");
        kotlin.jvm.internal.i.e(lifecycle, "lifecycle");
        J j4 = (J) s6.getTag("androidx.lifecycle.savedstate.vm.tag");
        if (j4 == null || j4.f3474h) {
            return;
        }
        j4.b(registry, lifecycle);
        EnumC0247n enumC0247n = ((C0255w) lifecycle).f3527d;
        if (enumC0247n == EnumC0247n.f3512g || enumC0247n.compareTo(EnumC0247n.f3514i) >= 0) {
            registry.d();
        } else {
            lifecycle.a(new C0243j(registry, lifecycle));
        }
    }

    public static I b(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            if (bundle2 == null) {
                return new I();
            }
            HashMap hashMap = new HashMap();
            for (String key : bundle2.keySet()) {
                kotlin.jvm.internal.i.d(key, "key");
                hashMap.put(key, bundle2.get(key));
            }
            return new I(hashMap);
        }
        ClassLoader classLoader = I.class.getClassLoader();
        kotlin.jvm.internal.i.b(classLoader);
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
            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.String");
            linkedHashMap.put((String) obj, parcelableArrayList2.get(i7));
        }
        return new I(linkedHashMap);
    }

    public static final I c(O.c cVar) {
        LinkedHashMap linkedHashMap = cVar.f1763a;
        T.h hVar = (T.h) linkedHashMap.get(f3475a);
        if (hVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        Y y = (Y) linkedHashMap.get(f3476b);
        if (y == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) linkedHashMap.get(f3477c);
        String str = (String) linkedHashMap.get(T.f3494b);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        T.e b7 = hVar.getSavedStateRegistry().b();
        M m4 = b7 instanceof M ? (M) b7 : null;
        if (m4 == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        LinkedHashMap linkedHashMap2 = f(y).f3482a;
        I i7 = (I) linkedHashMap2.get(str);
        if (i7 != null) {
            return i7;
        }
        Class[] clsArr = I.f3466f;
        m4.c();
        Bundle bundle2 = m4.f3480c;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
        Bundle bundle4 = m4.f3480c;
        if (bundle4 != null) {
            bundle4.remove(str);
        }
        Bundle bundle5 = m4.f3480c;
        if (bundle5 != null && bundle5.isEmpty()) {
            m4.f3480c = null;
        }
        I b8 = b(bundle3, bundle);
        linkedHashMap2.put(str, b8);
        return b8;
    }

    public static final void d(T.h hVar) {
        EnumC0247n enumC0247n = ((C0255w) hVar.getLifecycle()).f3527d;
        if (enumC0247n != EnumC0247n.f3512g && enumC0247n != EnumC0247n.f3513h) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (hVar.getSavedStateRegistry().b() == null) {
            M m4 = new M(hVar.getSavedStateRegistry(), (Y) hVar);
            hVar.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", m4);
            hVar.getLifecycle().a(new T.b(2, m4));
        }
    }

    public static final C0250q e(PermissionsActivity permissionsActivity) {
        AbstractC0248o lifecycle = permissionsActivity.getLifecycle();
        kotlin.jvm.internal.i.e(lifecycle, "<this>");
        AtomicReference atomicReference = lifecycle.f3517a;
        while (true) {
            C0250q c0250q = (C0250q) atomicReference.get();
            if (c0250q != null) {
                return c0250q;
            }
            n0 n0Var = new n0();
            O5.d dVar = H5.F.f1027a;
            C0250q c0250q2 = new C0250q(lifecycle, AbstractC0223a.D(n0Var, M5.o.f1618a.f1227j));
            while (!atomicReference.compareAndSet(null, c0250q2)) {
                if (atomicReference.get() != null) {
                    break;
                }
            }
            O5.d dVar2 = H5.F.f1027a;
            AbstractC0165z.l(c0250q2, M5.o.f1618a.f1227j, new C0249p(c0250q2, null), 2);
            return c0250q2;
        }
    }

    public static final N f(Y y) {
        return (N) new B0.c(y.getViewModelStore(), new K(), y instanceof InterfaceC0241h ? ((InterfaceC0241h) y).getDefaultViewModelCreationExtras() : O.a.f1762b).k("androidx.lifecycle.internal.SavedStateHandlesVM", N.class);
    }
}
