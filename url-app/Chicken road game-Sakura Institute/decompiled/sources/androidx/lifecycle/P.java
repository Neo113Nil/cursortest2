package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import kotlin.jvm.internal.Intrinsics;
import p1.C0993c;
import v1.C1248e;
import v1.InterfaceC1249f;

/* loaded from: classes.dex */
public final class P extends X implements V {

    /* renamed from: a, reason: collision with root package name */
    public final Application f5450a;

    /* renamed from: b, reason: collision with root package name */
    public final U f5451b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f5452c;

    /* renamed from: d, reason: collision with root package name */
    public final C0483x f5453d;

    /* renamed from: e, reason: collision with root package name */
    public final C1248e f5454e;

    public P(Application application, InterfaceC1249f owner, Bundle bundle) {
        U u4;
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f5454e = owner.c();
        this.f5453d = owner.e();
        this.f5452c = bundle;
        this.f5450a = application;
        if (application != null) {
            Intrinsics.checkNotNullParameter(application, "application");
            if (U.f5458c == null) {
                Intrinsics.checkNotNullParameter(application, "application");
                U.f5458c = new U(application);
            }
            u4 = U.f5458c;
            Intrinsics.c(u4);
        } else {
            u4 = new U(null);
        }
        this.f5451b = u4;
    }

    @Override // androidx.lifecycle.V
    public final T a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return e(modelClass, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.V
    public final T b(Class modelClass, C0993c extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        String str = (String) extras.q(r1.c.f9861d);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (extras.q(M.f5442a) == null || extras.q(M.f5443b) == null) {
            if (this.f5453d != null) {
                return e(modelClass, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) extras.q(U.f5459d);
        boolean isAssignableFrom = AbstractC0461a.class.isAssignableFrom(modelClass);
        Constructor a4 = (!isAssignableFrom || application == null) ? Q.a(modelClass, Q.f5456b) : Q.a(modelClass, Q.f5455a);
        return a4 == null ? this.f5451b.b(modelClass, extras) : (!isAssignableFrom || application == null) ? Q.b(modelClass, a4, M.d(extras)) : Q.b(modelClass, a4, application, M.d(extras));
    }

    @Override // androidx.lifecycle.X
    public final void d(T viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        C0483x c0483x = this.f5453d;
        if (c0483x != null) {
            C1248e c1248e = this.f5454e;
            Intrinsics.c(c1248e);
            M.a(viewModel, c1248e, c0483x);
        }
    }

    public final T e(Class modelClass, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        C0483x c0483x = this.f5453d;
        if (c0483x == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean isAssignableFrom = AbstractC0461a.class.isAssignableFrom(modelClass);
        Application application = this.f5450a;
        Constructor a4 = (!isAssignableFrom || application == null) ? Q.a(modelClass, Q.f5456b) : Q.a(modelClass, Q.f5455a);
        if (a4 == null) {
            if (application != null) {
                return this.f5451b.a(modelClass);
            }
            if (W.f5461a == null) {
                W.f5461a = new W();
            }
            Intrinsics.c(W.f5461a);
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            return m3.z.j(modelClass);
        }
        C1248e c1248e = this.f5454e;
        Intrinsics.c(c1248e);
        K b4 = M.b(c1248e, c0483x, key, this.f5452c);
        J j4 = b4.f5440e;
        T b5 = (!isAssignableFrom || application == null) ? Q.b(modelClass, a4, j4) : Q.b(modelClass, a4, application, j4);
        b5.a(b4);
        return b5;
    }
}
