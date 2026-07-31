package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class O implements V {

    /* renamed from: a, reason: collision with root package name */
    public final Application f3483a;

    /* renamed from: b, reason: collision with root package name */
    public final U f3484b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f3485c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0248o f3486d;

    /* renamed from: e, reason: collision with root package name */
    public final T.f f3487e;

    public O(Application application, androidx.activity.l lVar, Bundle bundle) {
        U u6;
        this.f3487e = lVar.getSavedStateRegistry();
        this.f3486d = lVar.getLifecycle();
        this.f3485c = bundle;
        this.f3483a = application;
        if (application != null) {
            if (U.f3495c == null) {
                U.f3495c = new U(application);
            }
            u6 = U.f3495c;
            kotlin.jvm.internal.i.b(u6);
        } else {
            u6 = new U(null);
        }
        this.f3484b = u6;
    }

    @Override // androidx.lifecycle.V
    public final S a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return c(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.V
    public final S b(Class cls, O.c cVar) {
        T t6 = T.f3494b;
        LinkedHashMap linkedHashMap = cVar.f1763a;
        String str = (String) linkedHashMap.get(t6);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (linkedHashMap.get(L.f3475a) == null || linkedHashMap.get(L.f3476b) == null) {
            if (this.f3486d != null) {
                return c(str, cls);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) linkedHashMap.get(T.f3493a);
        boolean isAssignableFrom = AbstractC0234a.class.isAssignableFrom(cls);
        Constructor a7 = (!isAssignableFrom || application == null) ? P.a(cls, P.f3489b) : P.a(cls, P.f3488a);
        return a7 == null ? this.f3484b.b(cls, cVar) : (!isAssignableFrom || application == null) ? P.b(cls, a7, L.c(cVar)) : P.b(cls, a7, application, L.c(cVar));
    }

    public final S c(String str, Class cls) {
        AbstractC0248o abstractC0248o = this.f3486d;
        if (abstractC0248o == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean isAssignableFrom = AbstractC0234a.class.isAssignableFrom(cls);
        Application application = this.f3483a;
        Constructor a7 = (!isAssignableFrom || application == null) ? P.a(cls, P.f3489b) : P.a(cls, P.f3488a);
        if (a7 == null) {
            if (application != null) {
                return this.f3484b.a(cls);
            }
            if (W.f3497a == null) {
                W.f3497a = new W();
            }
            W w5 = W.f3497a;
            kotlin.jvm.internal.i.b(w5);
            return w5.a(cls);
        }
        T.f fVar = this.f3487e;
        kotlin.jvm.internal.i.b(fVar);
        Bundle a8 = fVar.a(str);
        Class[] clsArr = I.f3466f;
        I b7 = L.b(a8, this.f3485c);
        J j4 = new J(str, b7);
        j4.b(fVar, abstractC0248o);
        EnumC0247n enumC0247n = ((C0255w) abstractC0248o).f3527d;
        if (enumC0247n == EnumC0247n.f3512g || enumC0247n.compareTo(EnumC0247n.f3514i) >= 0) {
            fVar.d();
        } else {
            abstractC0248o.a(new C0243j(fVar, abstractC0248o));
        }
        S b8 = (!isAssignableFrom || application == null) ? P.b(cls, a7, b7) : P.b(cls, a7, application, b7);
        b8.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", j4);
        return b8;
    }
}
