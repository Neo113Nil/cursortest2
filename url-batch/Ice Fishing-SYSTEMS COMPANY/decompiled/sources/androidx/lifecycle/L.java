package androidx.lifecycle;

import O7.AbstractC0399y;
import O7.o0;
import android.os.Bundle;
import com.onesignal.core.activities.PermissionsActivity;
import h0.C4555a;
import h0.C4557c;
import h0.C4558d;
import h0.C4559e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;
import x0.C5202c;
import x0.InterfaceC5201b;
import x0.InterfaceC5204e;

/* loaded from: classes.dex */
public abstract class L {

    /* renamed from: a, reason: collision with root package name */
    public static final T f5232a = new T();

    /* renamed from: b, reason: collision with root package name */
    public static final T f5233b = new T();

    /* renamed from: c, reason: collision with root package name */
    public static final T f5234c = new T();

    public static final void a(S s3, C5202c registry, AbstractC0508p lifecycle) {
        kotlin.jvm.internal.h.e(registry, "registry");
        kotlin.jvm.internal.h.e(lifecycle, "lifecycle");
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) s3.getTag("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController == null || savedStateHandleController.f5259v) {
            return;
        }
        savedStateHandleController.b(lifecycle, registry);
        EnumC0507o enumC0507o = ((C0515x) lifecycle).f5290d;
        if (enumC0507o == EnumC0507o.f5277u || enumC0507o.compareTo(EnumC0507o.f5279w) >= 0) {
            registry.d();
        } else {
            lifecycle.a(new LegacySavedStateHandleController$tryToAddRecreator$1(lifecycle, registry));
        }
    }

    public static K b(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            if (bundle2 == null) {
                return new K();
            }
            HashMap hashMap = new HashMap();
            for (String key : bundle2.keySet()) {
                kotlin.jvm.internal.h.d(key, "key");
                hashMap.put(key, bundle2.get(key));
            }
            return new K(hashMap);
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
            throw new IllegalStateException("Invalid bundle passed as restored state");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = parcelableArrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = parcelableArrayList.get(i);
            kotlin.jvm.internal.h.c(obj, "null cannot be cast to non-null type kotlin.String");
            linkedHashMap.put((String) obj, parcelableArrayList2.get(i));
        }
        return new K(linkedHashMap);
    }

    public static final K c(C4558d c4558d) {
        T t9 = f5232a;
        LinkedHashMap linkedHashMap = c4558d.f38143a;
        InterfaceC5204e interfaceC5204e = (InterfaceC5204e) linkedHashMap.get(t9);
        if (interfaceC5204e == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        Y y6 = (Y) linkedHashMap.get(f5233b);
        if (y6 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) linkedHashMap.get(f5234c);
        String str = (String) linkedHashMap.get(T.f5261b);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        InterfaceC5201b b9 = interfaceC5204e.getSavedStateRegistry().b();
        M m8 = b9 instanceof M ? (M) b9 : null;
        if (m8 == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        LinkedHashMap linkedHashMap2 = f(y6).f5243a;
        K k6 = (K) linkedHashMap2.get(str);
        if (k6 != null) {
            return k6;
        }
        Class[] clsArr = K.f5226f;
        m8.b();
        Bundle bundle2 = m8.f5241c;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
        Bundle bundle4 = m8.f5241c;
        if (bundle4 != null) {
            bundle4.remove(str);
        }
        Bundle bundle5 = m8.f5241c;
        if (bundle5 != null && bundle5.isEmpty()) {
            m8.f5241c = null;
        }
        K b10 = b(bundle3, bundle);
        linkedHashMap2.put(str, b10);
        return b10;
    }

    public static final void d(InterfaceC5204e interfaceC5204e) {
        EnumC0507o enumC0507o = ((C0515x) interfaceC5204e.getLifecycle()).f5290d;
        if (enumC0507o != EnumC0507o.f5277u && enumC0507o != EnumC0507o.f5278v) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (interfaceC5204e.getSavedStateRegistry().b() == null) {
            M m8 = new M(interfaceC5204e.getSavedStateRegistry(), (Y) interfaceC5204e);
            interfaceC5204e.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", m8);
            interfaceC5204e.getLifecycle().a(new SavedStateHandleAttacher(m8));
        }
    }

    public static final LifecycleCoroutineScopeImpl e(PermissionsActivity permissionsActivity) {
        AbstractC0508p lifecycle = permissionsActivity.getLifecycle();
        kotlin.jvm.internal.h.e(lifecycle, "<this>");
        while (true) {
            AtomicReference atomicReference = lifecycle.f5282a;
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = (LifecycleCoroutineScopeImpl) atomicReference.get();
            if (lifecycleCoroutineScopeImpl != null) {
                return lifecycleCoroutineScopeImpl;
            }
            o0 o0Var = new o0();
            V7.e eVar = O7.F.f2551a;
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = new LifecycleCoroutineScopeImpl(lifecycle, com.bumptech.glide.e.w(o0Var, T7.o.f3162a.f2693x));
            while (!atomicReference.compareAndSet(null, lifecycleCoroutineScopeImpl2)) {
                if (atomicReference.get() != null) {
                    break;
                }
            }
            V7.e eVar2 = O7.F.f2551a;
            AbstractC0399y.o(lifecycleCoroutineScopeImpl2, T7.o.f3162a.f2693x, new C0509q(lifecycleCoroutineScopeImpl2, null), 2);
            return lifecycleCoroutineScopeImpl2;
        }
    }

    public static final N f(Y y6) {
        ArrayList arrayList = new ArrayList();
        Class a9 = kotlin.jvm.internal.s.a(N.class).a();
        kotlin.jvm.internal.h.c(a9, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        arrayList.add(new C4559e(a9));
        C4559e[] c4559eArr = (C4559e[]) arrayList.toArray(new C4559e[0]);
        return (N) new Y2.e(y6.getViewModelStore(), new C4557c((C4559e[]) Arrays.copyOf(c4559eArr, c4559eArr.length)), y6 instanceof InterfaceC0502j ? ((InterfaceC0502j) y6).getDefaultViewModelCreationExtras() : C4555a.f38142b).x(N.class, "androidx.lifecycle.internal.SavedStateHandlesVM");
    }
}
