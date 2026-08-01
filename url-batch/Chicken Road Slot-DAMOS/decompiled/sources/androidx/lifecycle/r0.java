package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class r0 implements w0 {

    /* renamed from: a, reason: collision with root package name */
    public final Application f719a;

    /* renamed from: b, reason: collision with root package name */
    public final v0 f720b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f721c;

    /* renamed from: d, reason: collision with root package name */
    public final w f722d;

    /* renamed from: e, reason: collision with root package name */
    public final c6.l f723e;

    public r0(Application application, f5.e eVar, Bundle bundle) {
        v0 v0Var;
        this.f723e = eVar.b();
        this.f722d = eVar.g();
        this.f721c = bundle;
        this.f719a = application;
        if (application != null) {
            if (v0.f732c == null) {
                v0.f732c = new v0(application);
            }
            v0Var = v0.f732c;
            v0Var.getClass();
        } else {
            v0Var = new v0(null);
        }
        this.f720b = v0Var;
    }

    @Override // androidx.lifecycle.w0
    public final u0 a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(cls, canonicalName);
        }
        te.a1.e("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Override // androidx.lifecycle.w0
    public final u0 b(wd.h hVar, k4.e eVar) {
        Class a9 = hVar.a();
        a9.getClass();
        return c(a9, eVar);
    }

    @Override // androidx.lifecycle.w0
    public final u0 c(Class cls, k4.e eVar) {
        LinkedHashMap linkedHashMap = eVar.f5386a;
        String str = (String) linkedHashMap.get(y0.f747b);
        if (str == null) {
            kotlin.collections.i0.l("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        if (linkedHashMap.get(o0.f703a) == null || linkedHashMap.get(o0.f704b) == null) {
            if (this.f722d != null) {
                return d(cls, str);
            }
            kotlin.collections.i0.l("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        Application application = (Application) linkedHashMap.get(v0.f733d);
        boolean isAssignableFrom = a.class.isAssignableFrom(cls);
        Constructor a9 = (!isAssignableFrom || application == null) ? s0.a(cls, s0.f725b) : s0.a(cls, s0.f724a);
        return a9 == null ? this.f720b.c(cls, eVar) : (!isAssignableFrom || application == null) ? s0.b(cls, a9, o0.b(eVar)) : s0.b(cls, a9, application, o0.b(eVar));
    }

    public final u0 d(Class cls, String str) {
        l0 l0Var;
        w wVar = this.f722d;
        if (wVar == null) {
            a2.r.r("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }
        boolean isAssignableFrom = a.class.isAssignableFrom(cls);
        Application application = this.f719a;
        Constructor a9 = (!isAssignableFrom || application == null) ? s0.a(cls, s0.f725b) : s0.a(cls, s0.f724a);
        if (a9 == null) {
            if (application != null) {
                return this.f720b.a(cls);
            }
            if (x0.f744a == null) {
                x0.f744a = new x0();
            }
            x0.f744a.getClass();
            return z4.w.m(cls);
        }
        c6.l lVar = this.f723e;
        lVar.getClass();
        Bundle b10 = lVar.b(str);
        if (b10 == null) {
            b10 = this.f721c;
        }
        if (b10 == null) {
            l0Var = new l0();
        } else {
            ClassLoader classLoader = l0.class.getClassLoader();
            classLoader.getClass();
            b10.setClassLoader(classLoader);
            id.h hVar = new id.h(b10.size());
            for (String str2 : b10.keySet()) {
                str2.getClass();
                hVar.put(str2, b10.get(str2));
            }
            l0Var = new l0(hVar.b());
        }
        m0 m0Var = new m0(str, l0Var);
        m0Var.j(wVar, lVar);
        p pVar = wVar.f737c;
        if (pVar == p.f708e || pVar.compareTo(p.f710r) >= 0) {
            lVar.l();
        } else {
            wVar.a(new h(wVar, lVar));
        }
        u0 b11 = (!isAssignableFrom || application == null) ? s0.b(cls, a9, l0Var) : s0.b(cls, a9, application, l0Var);
        b11.a("androidx.lifecycle.savedstate.vm.tag", m0Var);
        return b11;
    }

    public r0() {
        this.f720b = new v0(null);
    }
}
