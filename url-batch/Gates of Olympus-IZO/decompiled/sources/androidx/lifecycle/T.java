package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import h.AbstractC0416e;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;
import n1.C0675b;
import p1.C0765d;

/* loaded from: classes.dex */
public final class T extends Z implements X {

    /* renamed from: a, reason: collision with root package name */
    public final Application f3995a;

    /* renamed from: b, reason: collision with root package name */
    public final W f3996b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f3997c;

    /* renamed from: d, reason: collision with root package name */
    public final C0238x f3998d;

    /* renamed from: e, reason: collision with root package name */
    public final u1.e f3999e;

    public T(Application application, u1.f fVar, Bundle bundle) {
        W w3;
        Z1.i.f(fVar, "owner");
        this.f3999e = fVar.c();
        this.f3998d = fVar.e();
        this.f3997c = bundle;
        this.f3995a = application;
        if (application != null) {
            if (W.f4003c == null) {
                W.f4003c = new W(application);
            }
            w3 = W.f4003c;
            Z1.i.c(w3);
        } else {
            w3 = new W(null);
        }
        this.f3996b = w3;
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
    public final V b(Class cls, C0675b c0675b) {
        C0765d c0765d = C0765d.f6760a;
        LinkedHashMap linkedHashMap = (LinkedHashMap) c0675b.f5876a;
        String str = (String) linkedHashMap.get(c0765d);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (linkedHashMap.get(P.f3986a) == null || linkedHashMap.get(P.f3987b) == null) {
            if (this.f3998d != null) {
                return e(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) linkedHashMap.get(W.f4004d);
        boolean isAssignableFrom = AbstractC0216a.class.isAssignableFrom(cls);
        Constructor a3 = (!isAssignableFrom || application == null) ? U.a(cls, U.f4001b) : U.a(cls, U.f4000a);
        return a3 == null ? this.f3996b.b(cls, c0675b) : (!isAssignableFrom || application == null) ? U.b(cls, a3, P.d(c0675b)) : U.b(cls, a3, application, P.d(c0675b));
    }

    @Override // androidx.lifecycle.Z
    public final void d(V v3) {
        C0238x c0238x = this.f3998d;
        if (c0238x != null) {
            u1.e eVar = this.f3999e;
            Z1.i.c(eVar);
            P.a(v3, eVar, c0238x);
        }
    }

    public final V e(Class cls, String str) {
        C0238x c0238x = this.f3998d;
        if (c0238x == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean isAssignableFrom = AbstractC0216a.class.isAssignableFrom(cls);
        Application application = this.f3995a;
        Constructor a3 = (!isAssignableFrom || application == null) ? U.a(cls, U.f4001b) : U.a(cls, U.f4000a);
        if (a3 == null) {
            if (application != null) {
                return this.f3996b.a(cls);
            }
            if (Y.f4006a == null) {
                Y.f4006a = new Y();
            }
            Z1.i.c(Y.f4006a);
            return AbstractC0416e.o(cls);
        }
        u1.e eVar = this.f3999e;
        Z1.i.c(eVar);
        N b2 = P.b(eVar, c0238x, str, this.f3997c);
        M m3 = b2.f3984e;
        V b3 = (!isAssignableFrom || application == null) ? U.b(cls, a3, m3) : U.b(cls, a3, application, m3);
        b3.a("androidx.lifecycle.savedstate.vm.tag", b2);
        return b3;
    }
}
