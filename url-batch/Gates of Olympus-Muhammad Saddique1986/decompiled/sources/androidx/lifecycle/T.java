package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;
import n.z0;
import q1.C0812b;
import s1.C0966d;

/* loaded from: classes.dex */
public final class T extends Z implements X {

    /* renamed from: a, reason: collision with root package name */
    public final Application f5196a;

    /* renamed from: b, reason: collision with root package name */
    public final W f5197b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f5198c;

    /* renamed from: d, reason: collision with root package name */
    public final C0294x f5199d;

    /* renamed from: e, reason: collision with root package name */
    public final y1.e f5200e;

    public T(Application application, y1.f fVar, Bundle bundle) {
        W w2;
        f2.j.f(fVar, "owner");
        this.f5200e = fVar.c();
        this.f5199d = fVar.e();
        this.f5198c = bundle;
        this.f5196a = application;
        if (application != null) {
            if (W.f5204c == null) {
                W.f5204c = new W(application);
            }
            w2 = W.f5204c;
            f2.j.c(w2);
        } else {
            w2 = new W(null);
        }
        this.f5197b = w2;
    }

    @Override // androidx.lifecycle.X
    public final V a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return e(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.X
    public final V b(Class cls, C0812b c0812b) {
        C0966d c0966d = C0966d.f8358a;
        LinkedHashMap linkedHashMap = (LinkedHashMap) c0812b.f6877a;
        String str = (String) linkedHashMap.get(c0966d);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (linkedHashMap.get(P.f5187a) == null || linkedHashMap.get(P.f5188b) == null) {
            if (this.f5199d != null) {
                return e(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) linkedHashMap.get(W.f5205d);
        boolean isAssignableFrom = AbstractC0272a.class.isAssignableFrom(cls);
        Constructor a3 = (!isAssignableFrom || application == null) ? U.a(cls, U.f5202b) : U.a(cls, U.f5201a);
        return a3 == null ? this.f5197b.b(cls, c0812b) : (!isAssignableFrom || application == null) ? U.b(cls, a3, P.d(c0812b)) : U.b(cls, a3, application, P.d(c0812b));
    }

    @Override // androidx.lifecycle.Z
    public final void d(V v3) {
        C0294x c0294x = this.f5199d;
        if (c0294x != null) {
            y1.e eVar = this.f5200e;
            f2.j.c(eVar);
            P.a(v3, eVar, c0294x);
        }
    }

    public final V e(Class cls, String str) {
        C0294x c0294x = this.f5199d;
        if (c0294x == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean isAssignableFrom = AbstractC0272a.class.isAssignableFrom(cls);
        Application application = this.f5196a;
        Constructor a3 = (!isAssignableFrom || application == null) ? U.a(cls, U.f5202b) : U.a(cls, U.f5201a);
        if (a3 == null) {
            if (application != null) {
                return this.f5197b.a(cls);
            }
            if (Y.f5207a == null) {
                Y.f5207a = new Y();
            }
            f2.j.c(Y.f5207a);
            return z0.i(cls);
        }
        y1.e eVar = this.f5200e;
        f2.j.c(eVar);
        N b3 = P.b(eVar, c0294x, str, this.f5198c);
        M m3 = b3.f5185e;
        V b4 = (!isAssignableFrom || application == null) ? U.b(cls, a3, m3) : U.b(cls, a3, application, m3);
        b4.a("androidx.lifecycle.savedstate.vm.tag", b3);
        return b4;
    }
}
