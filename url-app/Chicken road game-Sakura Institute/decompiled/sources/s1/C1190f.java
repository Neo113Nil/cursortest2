package s1;

import androidx.lifecycle.C0483x;
import androidx.lifecycle.K;
import androidx.lifecycle.M;
import androidx.lifecycle.T;
import androidx.lifecycle.V;
import androidx.lifecycle.X;
import kotlin.jvm.internal.Intrinsics;
import p1.C0993c;
import v1.C1248e;

/* renamed from: s1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1190f extends X implements V {

    /* renamed from: a, reason: collision with root package name */
    public C1248e f10504a;

    /* renamed from: b, reason: collision with root package name */
    public C0483x f10505b;

    @Override // androidx.lifecycle.V
    public final T a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String key = modelClass.getCanonicalName();
        if (key == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        if (this.f10505b == null) {
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        C1248e c1248e = this.f10504a;
        Intrinsics.c(c1248e);
        C0483x c0483x = this.f10505b;
        Intrinsics.c(c0483x);
        K b4 = M.b(c1248e, c0483x, key, null);
        androidx.lifecycle.J handle = b4.f5440e;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(handle, "handle");
        C1191g c1191g = new C1191g(handle);
        c1191g.a(b4);
        return c1191g;
    }

    @Override // androidx.lifecycle.V
    public final T b(Class modelClass, C0993c extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        String key = (String) extras.q(r1.c.f9861d);
        if (key == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        C1248e c1248e = this.f10504a;
        if (c1248e == null) {
            androidx.lifecycle.J handle = M.d(extras);
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(handle, "handle");
            return new C1191g(handle);
        }
        Intrinsics.c(c1248e);
        C0483x c0483x = this.f10505b;
        Intrinsics.c(c0483x);
        K b4 = M.b(c1248e, c0483x, key, null);
        androidx.lifecycle.J handle2 = b4.f5440e;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(handle2, "handle");
        C1191g c1191g = new C1191g(handle2);
        c1191g.a(b4);
        return c1191g;
    }

    @Override // androidx.lifecycle.X
    public final void d(T viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        C1248e c1248e = this.f10504a;
        if (c1248e != null) {
            C0483x c0483x = this.f10505b;
            Intrinsics.c(c0483x);
            M.a(viewModel, c1248e, c0483x);
        }
    }
}
