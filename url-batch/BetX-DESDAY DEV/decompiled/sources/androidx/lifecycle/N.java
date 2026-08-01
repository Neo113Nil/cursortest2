package androidx.lifecycle;

import a0.C0043a;
import android.app.Application;
import android.os.Bundle;
import androidx.fragment.app.AbstractActivityC0064v;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class N implements S {

    /* renamed from: a, reason: collision with root package name */
    public final Application f1464a;

    /* renamed from: b, reason: collision with root package name */
    public final Q f1465b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f1466c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0082o f1467d;

    /* renamed from: e, reason: collision with root package name */
    public final g0.d f1468e;

    public N(Application application, AbstractActivityC0064v abstractActivityC0064v, Bundle bundle) {
        Q q2;
        this.f1468e = abstractActivityC0064v.getSavedStateRegistry();
        this.f1467d = abstractActivityC0064v.getLifecycle();
        this.f1466c = bundle;
        this.f1464a = application;
        if (application != null) {
            if (Q.f1472c == null) {
                Q.f1472c = new Q(application);
            }
            q2 = Q.f1472c;
            X0.f.b(q2);
        } else {
            q2 = new Q(null);
        }
        this.f1465b = q2;
    }

    @Override // androidx.lifecycle.S
    public final P a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.S
    public final P c(Class cls, Z.c cVar) {
        a0.b bVar = a0.b.f953a;
        LinkedHashMap linkedHashMap = cVar.f883a;
        String str = (String) linkedHashMap.get(bVar);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (linkedHashMap.get(J.f1454a) == null || linkedHashMap.get(J.f1455b) == null) {
            if (this.f1467d != null) {
                return d(str, cls);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) linkedHashMap.get(Q.f1473d);
        boolean isAssignableFrom = AbstractC0068a.class.isAssignableFrom(cls);
        Constructor a2 = (!isAssignableFrom || application == null) ? O.a(cls, O.f1470b) : O.a(cls, O.f1469a);
        return a2 == null ? this.f1465b.c(cls, cVar) : (!isAssignableFrom || application == null) ? O.b(cls, a2, J.c(cVar)) : O.b(cls, a2, application, J.c(cVar));
    }

    public final P d(String str, Class cls) {
        AutoCloseable autoCloseable;
        Application application;
        AbstractC0082o abstractC0082o = this.f1467d;
        if (abstractC0082o == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean isAssignableFrom = AbstractC0068a.class.isAssignableFrom(cls);
        Constructor a2 = (!isAssignableFrom || this.f1464a == null) ? O.a(cls, O.f1470b) : O.a(cls, O.f1469a);
        if (a2 == null) {
            if (this.f1464a != null) {
                return this.f1465b.a(cls);
            }
            if (T.f1475a == null) {
                T.f1475a = new T();
            }
            T t2 = T.f1475a;
            X0.f.b(t2);
            return t2.a(cls);
        }
        g0.d dVar = this.f1468e;
        X0.f.b(dVar);
        Bundle bundle = this.f1466c;
        Bundle a3 = dVar.a(str);
        Class[] clsArr = G.f1445f;
        G b2 = J.b(a3, bundle);
        H h = new H(str, b2);
        h.h(dVar, abstractC0082o);
        EnumC0081n enumC0081n = ((C0088v) abstractC0082o).f1500c;
        if (enumC0081n == EnumC0081n.f1490b || enumC0081n.compareTo(EnumC0081n.f1492d) >= 0) {
            dVar.d();
        } else {
            abstractC0082o.a(new C0073f(abstractC0082o, 1, dVar));
        }
        P b3 = (!isAssignableFrom || (application = this.f1464a) == null) ? O.b(cls, a2, b2) : O.b(cls, a2, application, b2);
        b3.getClass();
        C0043a c0043a = b3.f1471a;
        if (c0043a != null) {
            if (c0043a.f952d) {
                C0043a.a(h);
            } else {
                synchronized (c0043a.f949a) {
                    autoCloseable = (AutoCloseable) c0043a.f950b.put("androidx.lifecycle.savedstate.vm.tag", h);
                }
                C0043a.a(autoCloseable);
            }
        }
        return b3;
    }
}
