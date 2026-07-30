package androidx.lifecycle;

import android.os.Bundle;
import b0.C0265a;
import com.onesignal.core.activities.PermissionsActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;
import k0.C0590a;
import k0.C0593d;
import k0.InterfaceC0592c;
import kotlin.jvm.internal.Intrinsics;
import n6.AbstractC0792z;
import n6.m0;
import u6.C0953e;

/* loaded from: classes.dex */
public abstract class O {

    /* renamed from: a, reason: collision with root package name */
    public static final X f3869a = new X();

    /* renamed from: b, reason: collision with root package name */
    public static final X f3870b = new X();

    /* renamed from: c, reason: collision with root package name */
    public static final X f3871c = new X();

    public static final void a(W viewModel, C0593d registry, AbstractC0250p lifecycle) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        M m2 = (M) viewModel.getTag("androidx.lifecycle.savedstate.vm.tag");
        if (m2 == null || m2.f3868i) {
            return;
        }
        m2.b(lifecycle, registry);
        EnumC0249o enumC0249o = ((C0258y) lifecycle).f3922d;
        if (enumC0249o == EnumC0249o.f3907e || enumC0249o.a(EnumC0249o.f3909l)) {
            registry.d();
        } else {
            lifecycle.a(new C0241g(lifecycle, registry));
        }
    }

    public static L b(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            if (bundle2 == null) {
                return new L();
            }
            HashMap hashMap = new HashMap();
            for (String key : bundle2.keySet()) {
                Intrinsics.checkNotNullExpressionValue(key, "key");
                hashMap.put(key, bundle2.get(key));
            }
            return new L(hashMap);
        }
        ClassLoader classLoader = L.class.getClassLoader();
        Intrinsics.b(classLoader);
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
            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.String");
            linkedHashMap.put((String) obj, parcelableArrayList2.get(i2));
        }
        return new L(linkedHashMap);
    }

    public static final L c(b0.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        k0.f fVar = (k0.f) dVar.a(f3869a);
        if (fVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        c0 c0Var = (c0) dVar.a(f3870b);
        if (c0Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) dVar.a(f3871c);
        String key = (String) dVar.a(X.f3888b);
        if (key == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        InterfaceC0592c b7 = fVar.getSavedStateRegistry().b();
        P p7 = b7 instanceof P ? (P) b7 : null;
        if (p7 == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        Q f7 = f(c0Var);
        L l7 = (L) f7.f3876a.get(key);
        if (l7 != null) {
            return l7;
        }
        Class[] clsArr = L.f3860f;
        Intrinsics.checkNotNullParameter(key, "key");
        p7.b();
        Bundle bundle2 = p7.f3874c;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(key) : null;
        Bundle bundle4 = p7.f3874c;
        if (bundle4 != null) {
            bundle4.remove(key);
        }
        Bundle bundle5 = p7.f3874c;
        if (bundle5 != null && bundle5.isEmpty()) {
            p7.f3874c = null;
        }
        L b8 = b(bundle3, bundle);
        f7.f3876a.put(key, b8);
        return b8;
    }

    public static final void d(k0.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        EnumC0249o enumC0249o = ((C0258y) fVar.getLifecycle()).f3922d;
        if (enumC0249o != EnumC0249o.f3907e && enumC0249o != EnumC0249o.f3908i) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (fVar.getSavedStateRegistry().b() == null) {
            P p7 = new P(fVar.getSavedStateRegistry(), (c0) fVar);
            fVar.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", p7);
            fVar.getLifecycle().a(new C0590a(p7));
        }
    }

    public static final r e(PermissionsActivity permissionsActivity) {
        Intrinsics.checkNotNullParameter(permissionsActivity, "<this>");
        AbstractC0250p lifecycle = permissionsActivity.getLifecycle();
        Intrinsics.checkNotNullParameter(lifecycle, "<this>");
        while (true) {
            r rVar = (r) lifecycle.f3912a.get();
            if (rVar != null) {
                return rVar;
            }
            m0 m0Var = new m0();
            C0953e c0953e = n6.F.f7011a;
            r rVar2 = new r(lifecycle, kotlin.coroutines.e.c(m0Var, s6.n.f7850a.f7135m));
            AtomicReference atomicReference = lifecycle.f3912a;
            while (!atomicReference.compareAndSet(null, rVar2)) {
                if (atomicReference.get() != null) {
                    break;
                }
            }
            C0953e c0953e2 = n6.F.f7011a;
            AbstractC0792z.l(rVar2, s6.n.f7850a.f7135m, new C0251q(rVar2, null), 2);
            return rVar2;
        }
    }

    public static final Q f(c0 owner) {
        Intrinsics.checkNotNullParameter(owner, "<this>");
        N factory = new N();
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(factory, "factory");
        b0 viewModelStore = owner.getViewModelStore();
        Intrinsics.checkNotNullParameter(owner, "owner");
        return (Q) new D0.j(viewModelStore, factory, owner instanceof InterfaceC0244j ? ((InterfaceC0244j) owner).getDefaultViewModelCreationExtras() : C0265a.f4133b).H(Q.class, "androidx.lifecycle.internal.SavedStateHandlesVM");
    }
}
