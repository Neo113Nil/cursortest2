package androidx.lifecycle;

import D4.AbstractC0024y;
import D4.n0;
import a0.C0171b;
import a0.C0175f;
import a0.InterfaceC0174e;
import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import com.onesignal.core.activities.PermissionsActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;
import n2.AbstractC1341c;

/* loaded from: classes.dex */
public abstract class M {

    /* renamed from: a, reason: collision with root package name */
    public static final U f4540a = new U();

    /* renamed from: b, reason: collision with root package name */
    public static final U f4541b = new U();

    /* renamed from: c, reason: collision with root package name */
    public static final U f4542c = new U();

    public static final void a(T t5, C0175f registry, AbstractC0245o lifecycle) {
        kotlin.jvm.internal.i.e(registry, "registry");
        kotlin.jvm.internal.i.e(lifecycle, "lifecycle");
        K k3 = (K) t5.getTag("androidx.lifecycle.savedstate.vm.tag");
        if (k3 == null || k3.f4539c) {
            return;
        }
        k3.b(registry, lifecycle);
        EnumC0244n enumC0244n = ((C0252w) lifecycle).f4592d;
        if (enumC0244n == EnumC0244n.f4577b || enumC0244n.compareTo(EnumC0244n.f4579d) >= 0) {
            registry.d();
        } else {
            lifecycle.a(new C0240j(registry, lifecycle));
        }
    }

    public static J b(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            if (bundle2 == null) {
                return new J();
            }
            HashMap hashMap = new HashMap();
            for (String key : bundle2.keySet()) {
                kotlin.jvm.internal.i.d(key, "key");
                hashMap.put(key, bundle2.get(key));
            }
            return new J(hashMap);
        }
        ClassLoader classLoader = J.class.getClassLoader();
        kotlin.jvm.internal.i.b(classLoader);
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
            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.String");
            linkedHashMap.put((String) obj, parcelableArrayList2.get(i2));
        }
        return new J(linkedHashMap);
    }

    public static final J c(S.c cVar) {
        U u5 = f4540a;
        LinkedHashMap linkedHashMap = cVar.f2736a;
        a0.h hVar = (a0.h) linkedHashMap.get(u5);
        if (hVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        Z z = (Z) linkedHashMap.get(f4541b);
        if (z == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) linkedHashMap.get(f4542c);
        String str = (String) linkedHashMap.get(U.f4559b);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        InterfaceC0174e b6 = hVar.getSavedStateRegistry().b();
        N n6 = b6 instanceof N ? (N) b6 : null;
        if (n6 == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        LinkedHashMap linkedHashMap2 = g(z).f4547a;
        J j2 = (J) linkedHashMap2.get(str);
        if (j2 != null) {
            return j2;
        }
        Class[] clsArr = J.f4531f;
        n6.b();
        Bundle bundle2 = n6.f4545c;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
        Bundle bundle4 = n6.f4545c;
        if (bundle4 != null) {
            bundle4.remove(str);
        }
        Bundle bundle5 = n6.f4545c;
        if (bundle5 != null && bundle5.isEmpty()) {
            n6.f4545c = null;
        }
        J b7 = b(bundle3, bundle);
        linkedHashMap2.put(str, b7);
        return b7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void d(Activity activity, EnumC0243m event) {
        kotlin.jvm.internal.i.e(activity, "activity");
        kotlin.jvm.internal.i.e(event, "event");
        if (activity instanceof InterfaceC0250u) {
            AbstractC0245o lifecycle = ((InterfaceC0250u) activity).getLifecycle();
            if (lifecycle instanceof C0252w) {
                ((C0252w) lifecycle).e(event);
            }
        }
    }

    public static final void e(a0.h hVar) {
        EnumC0244n enumC0244n = ((C0252w) hVar.getLifecycle()).f4592d;
        if (enumC0244n != EnumC0244n.f4577b && enumC0244n != EnumC0244n.f4578c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (hVar.getSavedStateRegistry().b() == null) {
            N n6 = new N(hVar.getSavedStateRegistry(), (Z) hVar);
            hVar.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", n6);
            hVar.getLifecycle().a(new C0171b(2, n6));
        }
    }

    public static final C0247q f(PermissionsActivity permissionsActivity) {
        C0247q c0247q;
        AbstractC0245o lifecycle = permissionsActivity.getLifecycle();
        kotlin.jvm.internal.i.e(lifecycle, "<this>");
        loop0: while (true) {
            AtomicReference atomicReference = lifecycle.f4582a;
            c0247q = (C0247q) atomicReference.get();
            if (c0247q == null) {
                n0 c2 = AbstractC0024y.c();
                K4.d dVar = D4.E.f459a;
                c0247q = new C0247q(lifecycle, AbstractC1341c.A(c2, I4.o.f1316a.f660f));
                while (!atomicReference.compareAndSet(null, c0247q)) {
                    if (atomicReference.get() != null) {
                        break;
                    }
                }
                K4.d dVar2 = D4.E.f459a;
                AbstractC0024y.n(c0247q, I4.o.f1316a.f660f, 0, new C0246p(c0247q, null), 2);
                break loop0;
            }
            break;
        }
        return c0247q;
    }

    public static final O g(Z z) {
        return (O) new B4.i(z.getViewModelStore(), new L(), z instanceof InterfaceC0238h ? ((InterfaceC0238h) z).getDefaultViewModelCreationExtras() : S.a.f2735b).D("androidx.lifecycle.internal.SavedStateHandlesVM", O.class);
    }

    public static void h(Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
        if (Build.VERSION.SDK_INT >= 29) {
            H.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new H());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new I(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
