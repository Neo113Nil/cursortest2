package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class p0 implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public final Application f852a;

    /* renamed from: b, reason: collision with root package name */
    public final s0 f853b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f854c;

    /* renamed from: d, reason: collision with root package name */
    public final w f855d;

    /* renamed from: e, reason: collision with root package name */
    public final x4.e f856e;

    public p0() {
        this.f853b = new s0(null);
    }

    @Override // androidx.lifecycle.t0
    public final r0 a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.t0
    public final r0 b(q6.e eVar, l4.e eVar2) {
        return c(m.a.A(eVar), eVar2);
    }

    @Override // androidx.lifecycle.t0
    public final r0 c(Class cls, l4.e eVar) {
        LinkedHashMap linkedHashMap = eVar.f4829a;
        String str = (String) linkedHashMap.get(v0.f867b);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (linkedHashMap.get(l0.f836a) == null || linkedHashMap.get(l0.f837b) == null) {
            if (this.f855d != null) {
                return d(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) linkedHashMap.get(s0.f862d);
        boolean isAssignableFrom = a.class.isAssignableFrom(cls);
        Constructor a8 = (!isAssignableFrom || application == null) ? q0.a(cls, q0.f858b) : q0.a(cls, q0.f857a);
        return a8 == null ? this.f853b.c(cls, eVar) : (!isAssignableFrom || application == null) ? q0.b(cls, a8, l0.b(eVar)) : q0.b(cls, a8, application, l0.b(eVar));
    }

    public final r0 d(Class cls, String str) {
        i0 i0Var;
        AutoCloseable autoCloseable;
        Application application;
        w wVar = this.f855d;
        if (wVar == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean isAssignableFrom = a.class.isAssignableFrom(cls);
        Constructor a8 = (!isAssignableFrom || this.f852a == null) ? q0.a(cls, q0.f858b) : q0.a(cls, q0.f857a);
        if (a8 == null) {
            if (this.f852a != null) {
                return this.f853b.a(cls);
            }
            if (u0.f864a == null) {
                u0.f864a = new u0();
            }
            q6.i.b(u0.f864a);
            return h0.a.y(cls);
        }
        x4.e eVar = this.f856e;
        q6.i.b(eVar);
        Bundle bundle = this.f854c;
        Bundle a9 = eVar.a(str);
        if (a9 != null) {
            bundle = a9;
        }
        if (bundle == null) {
            i0Var = new i0();
        } else {
            ClassLoader classLoader = i0.class.getClassLoader();
            q6.i.b(classLoader);
            bundle.setClassLoader(classLoader);
            e6.f fVar = new e6.f(bundle.size());
            for (String str2 : bundle.keySet()) {
                q6.i.b(str2);
                fVar.put(str2, bundle.get(str2));
            }
            i0Var = new i0(d6.y.E(fVar));
        }
        j0 j0Var = new j0(str, i0Var);
        j0Var.e(wVar, eVar);
        p pVar = wVar.f871c;
        if (pVar == p.f848e || pVar.compareTo(p.f850g) >= 0) {
            eVar.g();
        } else {
            wVar.a(new h(wVar, eVar));
        }
        r0 b8 = (!isAssignableFrom || (application = this.f852a) == null) ? q0.b(cls, a8, i0Var) : q0.b(cls, a8, application, i0Var);
        b8.getClass();
        n4.c cVar = b8.f860a;
        if (cVar == null) {
            return b8;
        }
        if (cVar.f5374d) {
            n4.c.a(j0Var);
            return b8;
        }
        synchronized (cVar.f5371a) {
            autoCloseable = (AutoCloseable) cVar.f5372b.put("androidx.lifecycle.savedstate.vm.tag", j0Var);
        }
        n4.c.a(autoCloseable);
        return b8;
    }

    public p0(Application application, x4.f fVar, Bundle bundle) {
        s0 s0Var;
        this.f856e = fVar.b();
        this.f855d = fVar.g();
        this.f854c = bundle;
        this.f852a = application;
        if (application != null) {
            if (s0.f861c == null) {
                s0.f861c = new s0(application);
            }
            s0Var = s0.f861c;
            q6.i.b(s0Var);
        } else {
            s0Var = new s0(null);
        }
        this.f853b = s0Var;
    }
}
