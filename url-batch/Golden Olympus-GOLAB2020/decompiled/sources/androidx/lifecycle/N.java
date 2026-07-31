package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1346l;
import androidx.lifecycle.Y;
import b0.AbstractC1367a;
import h0.C2435d;
import h0.InterfaceC2437f;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class N {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC1367a.b f12589a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC1367a.b f12590b = new c();

    /* renamed from: c, reason: collision with root package name */
    public static final AbstractC1367a.b f12591c = new a();

    public static final class a implements AbstractC1367a.b {
        a() {
        }
    }

    public static final class b implements AbstractC1367a.b {
        b() {
        }
    }

    public static final class c implements AbstractC1367a.b {
        c() {
        }
    }

    public static final class d implements Y.b {
        d() {
        }

        @Override // androidx.lifecycle.Y.b
        public V create(Class modelClass, AbstractC1367a extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return new P();
        }
    }

    public static final K a(AbstractC1367a abstractC1367a) {
        Intrinsics.checkNotNullParameter(abstractC1367a, "<this>");
        InterfaceC2437f interfaceC2437f = (InterfaceC2437f) abstractC1367a.a(f12589a);
        if (interfaceC2437f == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        c0 c0Var = (c0) abstractC1367a.a(f12590b);
        if (c0Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) abstractC1367a.a(f12591c);
        String str = (String) abstractC1367a.a(Y.c.f12626d);
        if (str != null) {
            return b(interfaceC2437f, c0Var, str, bundle);
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
    }

    private static final K b(InterfaceC2437f interfaceC2437f, c0 c0Var, String str, Bundle bundle) {
        O d4 = d(interfaceC2437f);
        P e4 = e(c0Var);
        K k4 = (K) e4.d().get(str);
        if (k4 != null) {
            return k4;
        }
        K a4 = K.f12578f.a(d4.b(str), bundle);
        e4.d().put(str, a4);
        return a4;
    }

    public static final void c(InterfaceC2437f interfaceC2437f) {
        Intrinsics.checkNotNullParameter(interfaceC2437f, "<this>");
        AbstractC1346l.b currentState = interfaceC2437f.getLifecycle().getCurrentState();
        if (currentState != AbstractC1346l.b.INITIALIZED && currentState != AbstractC1346l.b.CREATED) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (interfaceC2437f.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            O o4 = new O(interfaceC2437f.getSavedStateRegistry(), (c0) interfaceC2437f);
            interfaceC2437f.getSavedStateRegistry().h("androidx.lifecycle.internal.SavedStateHandlesProvider", o4);
            interfaceC2437f.getLifecycle().addObserver(new L(o4));
        }
    }

    public static final O d(InterfaceC2437f interfaceC2437f) {
        Intrinsics.checkNotNullParameter(interfaceC2437f, "<this>");
        C2435d.c c4 = interfaceC2437f.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        O o4 = c4 instanceof O ? (O) c4 : null;
        if (o4 != null) {
            return o4;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    public static final P e(c0 c0Var) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        return (P) new Y(c0Var, new d()).b("androidx.lifecycle.internal.SavedStateHandlesVM", P.class);
    }
}
