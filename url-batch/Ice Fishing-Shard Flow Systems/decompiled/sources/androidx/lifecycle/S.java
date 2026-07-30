package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import k0.C0593d;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class S implements Z {

    /* renamed from: a, reason: collision with root package name */
    public final Application f3877a;

    /* renamed from: b, reason: collision with root package name */
    public final Y f3878b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f3879c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0250p f3880d;

    /* renamed from: e, reason: collision with root package name */
    public final C0593d f3881e;

    public S(Application application, k0.f owner, Bundle bundle) {
        Y y7;
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f3881e = owner.getSavedStateRegistry();
        this.f3880d = owner.getLifecycle();
        this.f3879c = bundle;
        this.f3877a = application;
        if (application != null) {
            Intrinsics.checkNotNullParameter(application, "application");
            if (Y.f3889c == null) {
                Intrinsics.checkNotNullParameter(application, "application");
                Y.f3889c = new Y(application);
            }
            y7 = Y.f3889c;
            Intrinsics.b(y7);
        } else {
            y7 = new Y(null);
        }
        this.f3878b = y7;
    }

    @Override // androidx.lifecycle.Z
    public final W a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return c(modelClass, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.Z
    public final W b(Class modelClass, b0.d extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        String str = (String) extras.a(X.f3888b);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (extras.a(O.f3869a) == null || extras.a(O.f3870b) == null) {
            if (this.f3880d != null) {
                return c(modelClass, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) extras.a(X.f3887a);
        boolean isAssignableFrom = AbstractC0235a.class.isAssignableFrom(modelClass);
        Constructor a7 = (!isAssignableFrom || application == null) ? T.a(modelClass, T.f3883b) : T.a(modelClass, T.f3882a);
        return a7 == null ? this.f3878b.b(modelClass, extras) : (!isAssignableFrom || application == null) ? T.b(modelClass, a7, O.c(extras)) : T.b(modelClass, a7, application, O.c(extras));
    }

    public final W c(Class modelClass, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        AbstractC0250p lifecycle = this.f3880d;
        if (lifecycle == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean isAssignableFrom = AbstractC0235a.class.isAssignableFrom(modelClass);
        Application application = this.f3877a;
        Constructor a7 = (!isAssignableFrom || application == null) ? T.a(modelClass, T.f3883b) : T.a(modelClass, T.f3882a);
        if (a7 == null) {
            if (application != null) {
                return this.f3878b.a(modelClass);
            }
            if (a0.f3891a == null) {
                a0.f3891a = new a0();
            }
            a0 a0Var = a0.f3891a;
            Intrinsics.b(a0Var);
            return a0Var.a(modelClass);
        }
        C0593d registry = this.f3881e;
        Intrinsics.b(registry);
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Bundle a8 = registry.a(key);
        Class[] clsArr = L.f3860f;
        L b7 = O.b(a8, this.f3879c);
        M m2 = new M(key, b7);
        m2.b(lifecycle, registry);
        EnumC0249o enumC0249o = ((C0258y) lifecycle).f3922d;
        if (enumC0249o == EnumC0249o.f3907e || enumC0249o.a(EnumC0249o.f3909l)) {
            registry.d();
        } else {
            lifecycle.a(new C0241g(lifecycle, registry));
        }
        W b8 = (!isAssignableFrom || application == null) ? T.b(modelClass, a7, b7) : T.b(modelClass, a7, application, b7);
        b8.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", m2);
        return b8;
    }
}
