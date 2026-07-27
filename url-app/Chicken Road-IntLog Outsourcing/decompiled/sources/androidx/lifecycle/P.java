package androidx.lifecycle;

import a0.C0175f;
import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class P implements W {

    /* renamed from: a, reason: collision with root package name */
    public final Application f4548a;

    /* renamed from: b, reason: collision with root package name */
    public final V f4549b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f4550c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0245o f4551d;

    /* renamed from: e, reason: collision with root package name */
    public final C0175f f4552e;

    public P(Application application, androidx.activity.l lVar, Bundle bundle) {
        V v4;
        this.f4552e = lVar.getSavedStateRegistry();
        this.f4551d = lVar.getLifecycle();
        this.f4550c = bundle;
        this.f4548a = application;
        if (application != null) {
            if (V.f4560c == null) {
                V.f4560c = new V(application);
            }
            v4 = V.f4560c;
            kotlin.jvm.internal.i.b(v4);
        } else {
            v4 = new V(null);
        }
        this.f4549b = v4;
    }

    @Override // androidx.lifecycle.W
    public final T a(Class cls, S.c cVar) {
        U u5 = U.f4559b;
        LinkedHashMap linkedHashMap = cVar.f2736a;
        String str = (String) linkedHashMap.get(u5);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (linkedHashMap.get(M.f4540a) == null || linkedHashMap.get(M.f4541b) == null) {
            if (this.f4551d != null) {
                return c(str, cls);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) linkedHashMap.get(U.f4558a);
        boolean isAssignableFrom = AbstractC0231a.class.isAssignableFrom(cls);
        Constructor a6 = (!isAssignableFrom || application == null) ? Q.a(cls, Q.f4554b) : Q.a(cls, Q.f4553a);
        return a6 == null ? this.f4549b.a(cls, cVar) : (!isAssignableFrom || application == null) ? Q.b(cls, a6, M.c(cVar)) : Q.b(cls, a6, application, M.c(cVar));
    }

    @Override // androidx.lifecycle.W
    public final T b(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return c(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public final T c(String str, Class cls) {
        AbstractC0245o abstractC0245o = this.f4551d;
        if (abstractC0245o == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean isAssignableFrom = AbstractC0231a.class.isAssignableFrom(cls);
        Application application = this.f4548a;
        Constructor a6 = (!isAssignableFrom || application == null) ? Q.a(cls, Q.f4554b) : Q.a(cls, Q.f4553a);
        if (a6 == null) {
            if (application != null) {
                return this.f4549b.b(cls);
            }
            if (X.f4562a == null) {
                X.f4562a = new X();
            }
            X x5 = X.f4562a;
            kotlin.jvm.internal.i.b(x5);
            return x5.b(cls);
        }
        C0175f c0175f = this.f4552e;
        kotlin.jvm.internal.i.b(c0175f);
        Bundle a7 = c0175f.a(str);
        Class[] clsArr = J.f4531f;
        J b6 = M.b(a7, this.f4550c);
        K k3 = new K(str, b6);
        k3.b(c0175f, abstractC0245o);
        EnumC0244n enumC0244n = ((C0252w) abstractC0245o).f4592d;
        if (enumC0244n == EnumC0244n.f4577b || enumC0244n.compareTo(EnumC0244n.f4579d) >= 0) {
            c0175f.d();
        } else {
            abstractC0245o.a(new C0240j(c0175f, abstractC0245o));
        }
        T b7 = (!isAssignableFrom || application == null) ? Q.b(cls, a6, b6) : Q.b(cls, a6, application, b6);
        b7.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", k3);
        return b7;
    }
}
