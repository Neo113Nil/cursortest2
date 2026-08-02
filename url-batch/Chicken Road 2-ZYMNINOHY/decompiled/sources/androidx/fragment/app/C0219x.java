package androidx.fragment.app;

import android.os.Bundle;

/* renamed from: androidx.fragment.app.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0219x extends D {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F f4990a;

    public C0219x(F f4) {
        this.f4990a = f4;
    }

    @Override // androidx.fragment.app.D
    public final void a() {
        F f4 = this.f4990a;
        f4.mSavedStateRegistryController.a();
        androidx.lifecycle.E.d(f4);
        Bundle bundle = f4.mSavedFragmentState;
        f4.mSavedStateRegistryController.b(bundle != null ? bundle.getBundle("registryState") : null);
    }
}
