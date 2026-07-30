package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class u0 extends a1 implements y0 {

    /* renamed from: a, reason: collision with root package name */
    public final Application f1033a;

    /* renamed from: b, reason: collision with root package name */
    public final x0 f1034b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f1035c;

    /* renamed from: d, reason: collision with root package name */
    public final x f1036d;

    /* renamed from: e, reason: collision with root package name */
    public final x3.e f1037e;

    public u0(Application application, x3.f fVar, Bundle bundle) {
        x0 x0Var;
        this.f1037e = fVar.b();
        this.f1036d = fVar.f();
        this.f1035c = bundle;
        this.f1033a = application;
        if (application != null) {
            if (x0.f1053c == null) {
                x0.f1053c = new x0(application);
            }
            x0Var = x0.f1053c;
            r6.k.c(x0Var);
        } else {
            x0Var = new x0(null);
        }
        this.f1034b = x0Var;
    }

    @Override // androidx.lifecycle.y0
    public final w0 a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return e(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.y0
    public final w0 c(Class cls, q3.b bVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) bVar.f5679a;
        String str = (String) linkedHashMap.get(s3.d.f8527a);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (linkedHashMap.get(q0.f1021a) == null || linkedHashMap.get(q0.f1022b) == null) {
            if (this.f1036d != null) {
                return e(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) linkedHashMap.get(x0.f1054d);
        boolean isAssignableFrom = a.class.isAssignableFrom(cls);
        Constructor a3 = (!isAssignableFrom || application == null) ? v0.a(cls, v0.f1039b) : v0.a(cls, v0.f1038a);
        return a3 == null ? this.f1034b.c(cls, bVar) : (!isAssignableFrom || application == null) ? v0.b(cls, a3, q0.d(bVar)) : v0.b(cls, a3, application, q0.d(bVar));
    }

    @Override // androidx.lifecycle.a1
    public final void d(w0 w0Var) {
        x xVar = this.f1036d;
        if (xVar != null) {
            x3.e eVar = this.f1037e;
            r6.k.c(eVar);
            q0.a(w0Var, eVar, xVar);
        }
    }

    public final w0 e(Class cls, String str) {
        x xVar = this.f1036d;
        if (xVar == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean isAssignableFrom = a.class.isAssignableFrom(cls);
        Application application = this.f1033a;
        Constructor a3 = (!isAssignableFrom || application == null) ? v0.a(cls, v0.f1039b) : v0.a(cls, v0.f1038a);
        if (a3 == null) {
            if (application != null) {
                return this.f1034b.a(cls);
            }
            if (z0.f1059a == null) {
                z0.f1059a = new z0();
            }
            r6.k.c(z0.f1059a);
            return a8.m.s(cls);
        }
        x3.e eVar = this.f1037e;
        r6.k.c(eVar);
        o0 b9 = q0.b(eVar, xVar, str, this.f1035c);
        n0 n0Var = b9.f1014g;
        w0 b10 = (!isAssignableFrom || application == null) ? v0.b(cls, a3, n0Var) : v0.b(cls, a3, application, n0Var);
        b10.a("androidx.lifecycle.savedstate.vm.tag", b9);
        return b10;
    }
}
