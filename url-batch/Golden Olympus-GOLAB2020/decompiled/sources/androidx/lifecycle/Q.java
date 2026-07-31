package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.Y;
import b0.AbstractC1367a;
import h0.C2435d;
import h0.InterfaceC2437f;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class Q extends Y.d implements Y.b {

    /* renamed from: a, reason: collision with root package name */
    private Application f12598a;

    /* renamed from: c, reason: collision with root package name */
    private final Y.b f12599c;

    /* renamed from: d, reason: collision with root package name */
    private Bundle f12600d;

    /* renamed from: e, reason: collision with root package name */
    private AbstractC1346l f12601e;

    /* renamed from: f, reason: collision with root package name */
    private C2435d f12602f;

    public Q(Application application, InterfaceC2437f owner, Bundle bundle) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f12602f = owner.getSavedStateRegistry();
        this.f12601e = owner.getLifecycle();
        this.f12600d = bundle;
        this.f12598a = application;
        this.f12599c = application != null ? Y.a.f12617f.b(application) : new Y.a();
    }

    @Override // androidx.lifecycle.Y.d
    public void a(V viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        if (this.f12601e != null) {
            C2435d c2435d = this.f12602f;
            Intrinsics.checkNotNull(c2435d);
            AbstractC1346l abstractC1346l = this.f12601e;
            Intrinsics.checkNotNull(abstractC1346l);
            C1344j.a(viewModel, c2435d, abstractC1346l);
        }
    }

    public final V b(String key, Class modelClass) {
        List list;
        Constructor c4;
        V d4;
        Application application;
        List list2;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        AbstractC1346l abstractC1346l = this.f12601e;
        if (abstractC1346l == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean isAssignableFrom = AbstractC1335a.class.isAssignableFrom(modelClass);
        if (!isAssignableFrom || this.f12598a == null) {
            list = S.f12604b;
            c4 = S.c(modelClass, list);
        } else {
            list2 = S.f12603a;
            c4 = S.c(modelClass, list2);
        }
        if (c4 == null) {
            return this.f12598a != null ? this.f12599c.create(modelClass) : Y.c.f12624a.a().create(modelClass);
        }
        C2435d c2435d = this.f12602f;
        Intrinsics.checkNotNull(c2435d);
        M b4 = C1344j.b(c2435d, abstractC1346l, key, this.f12600d);
        if (!isAssignableFrom || (application = this.f12598a) == null) {
            d4 = S.d(modelClass, c4, b4.b());
        } else {
            Intrinsics.checkNotNull(application);
            d4 = S.d(modelClass, c4, application, b4.b());
        }
        d4.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", b4);
        return d4;
    }

    @Override // androidx.lifecycle.Y.b
    public V create(Class modelClass, AbstractC1367a extras) {
        List list;
        Constructor c4;
        List list2;
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        String str = (String) extras.a(Y.c.f12626d);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (extras.a(N.f12589a) == null || extras.a(N.f12590b) == null) {
            if (this.f12601e != null) {
                return b(str, modelClass);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) extras.a(Y.a.f12619h);
        boolean isAssignableFrom = AbstractC1335a.class.isAssignableFrom(modelClass);
        if (!isAssignableFrom || application == null) {
            list = S.f12604b;
            c4 = S.c(modelClass, list);
        } else {
            list2 = S.f12603a;
            c4 = S.c(modelClass, list2);
        }
        return c4 == null ? this.f12599c.create(modelClass, extras) : (!isAssignableFrom || application == null) ? S.d(modelClass, c4, N.a(extras)) : S.d(modelClass, c4, application, N.a(extras));
    }

    @Override // androidx.lifecycle.Y.b
    public V create(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return b(canonicalName, modelClass);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
