package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;
import m1.C1307e;

/* loaded from: classes.dex */
public final class H implements M {

    /* renamed from: a, reason: collision with root package name */
    public final Application f5022a;

    /* renamed from: b, reason: collision with root package name */
    public final L f5023b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f5024c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0231j f5025d;

    /* renamed from: e, reason: collision with root package name */
    public final C1307e f5026e;

    public H(Application application, m1.g gVar, Bundle bundle) {
        L l4;
        this.f5026e = gVar.getSavedStateRegistry();
        this.f5025d = gVar.getLifecycle();
        this.f5024c = bundle;
        this.f5022a = application;
        if (application != null) {
            if (L.f5034c == null) {
                L.f5034c = new L(application);
            }
            l4 = L.f5034c;
            kotlin.jvm.internal.i.b(l4);
        } else {
            l4 = new L(null);
        }
        this.f5023b = l4;
    }

    @Override // androidx.lifecycle.M
    public final J a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return c(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.M
    public final J b(Class cls, R.c cVar) {
        K k4 = K.f5033b;
        LinkedHashMap linkedHashMap = cVar.f2272a;
        String str = (String) linkedHashMap.get(k4);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (linkedHashMap.get(E.f5014a) == null || linkedHashMap.get(E.f5015b) == null) {
            if (this.f5025d != null) {
                return c(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) linkedHashMap.get(K.f5032a);
        boolean isAssignableFrom = AbstractC0222a.class.isAssignableFrom(cls);
        Constructor a3 = (!isAssignableFrom || application == null) ? I.a(cls, I.f5028b) : I.a(cls, I.f5027a);
        return a3 == null ? this.f5023b.b(cls, cVar) : (!isAssignableFrom || application == null) ? I.b(cls, a3, E.c(cVar)) : I.b(cls, a3, application, E.c(cVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final J c(Class cls, String str) {
        Object obj;
        Application application;
        AbstractC0231j abstractC0231j = this.f5025d;
        if (abstractC0231j == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean isAssignableFrom = AbstractC0222a.class.isAssignableFrom(cls);
        Constructor a3 = (!isAssignableFrom || this.f5022a == null) ? I.a(cls, I.f5028b) : I.a(cls, I.f5027a);
        if (a3 == null) {
            if (this.f5022a != null) {
                return this.f5023b.a(cls);
            }
            if (N.f5036a == null) {
                N.f5036a = new N();
            }
            N n = N.f5036a;
            kotlin.jvm.internal.i.b(n);
            return n.a(cls);
        }
        C1307e c1307e = this.f5026e;
        kotlin.jvm.internal.i.b(c1307e);
        Bundle bundle = this.f5024c;
        Bundle a4 = c1307e.a(str);
        Class[] clsArr = B.f5005f;
        B b4 = E.b(a4, bundle);
        C c4 = new C(str, b4);
        c4.b(abstractC0231j, c1307e);
        EnumC0230i enumC0230i = ((C0237p) abstractC0231j).f5052c;
        if (enumC0230i == EnumC0230i.f5042b || enumC0230i.compareTo(EnumC0230i.f5044d) >= 0) {
            c1307e.d();
        } else {
            abstractC0231j.a(new C0226e(abstractC0231j, c1307e));
        }
        J b5 = (!isAssignableFrom || (application = this.f5022a) == null) ? I.b(cls, a3, b4) : I.b(cls, a3, application, b4);
        synchronized (b5.f5029a) {
            try {
                obj = b5.f5029a.get("androidx.lifecycle.savedstate.vm.tag");
                if (obj == 0) {
                    b5.f5029a.put("androidx.lifecycle.savedstate.vm.tag", c4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj != 0) {
            c4 = obj;
        }
        if (b5.f5031c) {
            J.a(c4);
        }
        return b5;
    }
}
