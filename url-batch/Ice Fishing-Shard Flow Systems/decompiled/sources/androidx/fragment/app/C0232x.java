package androidx.fragment.app;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.AbstractC0250p;
import d.C0349A;
import i.AbstractActivityC0525l;
import k0.C0593d;
import kotlin.jvm.internal.Intrinsics;
import z.InterfaceC1052d;

/* renamed from: androidx.fragment.app.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0232x extends A implements InterfaceC1052d, androidx.lifecycle.c0, d.B, k0.f, W {

    /* renamed from: d, reason: collision with root package name */
    public final AbstractActivityC0525l f3822d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractActivityC0525l f3823e;

    /* renamed from: i, reason: collision with root package name */
    public final Handler f3824i;

    /* renamed from: l, reason: collision with root package name */
    public final S f3825l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0525l f3826m;

    public C0232x(AbstractActivityC0525l context) {
        this.f3826m = context;
        Intrinsics.checkNotNullParameter(context, "activity");
        Handler handler = new Handler();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f3822d = context;
        this.f3823e = context;
        this.f3824i = handler;
        this.f3825l = new S();
    }

    @Override // androidx.fragment.app.W
    public final void a(ComponentCallbacksC0228t componentCallbacksC0228t) {
        this.f3826m.onAttachFragment(componentCallbacksC0228t);
    }

    @Override // z.InterfaceC1052d
    public final void addOnConfigurationChangedListener(H.a aVar) {
        this.f3826m.addOnConfigurationChangedListener(aVar);
    }

    @Override // androidx.fragment.app.A
    public final View b(int i2) {
        return this.f3826m.findViewById(i2);
    }

    @Override // androidx.fragment.app.A
    public final boolean c() {
        Window window = this.f3826m.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // androidx.lifecycle.InterfaceC0256w
    public final AbstractC0250p getLifecycle() {
        return this.f3826m.mFragmentLifecycleRegistry;
    }

    @Override // d.B
    public final C0349A getOnBackPressedDispatcher() {
        return this.f3826m.getOnBackPressedDispatcher();
    }

    @Override // k0.f
    public final C0593d getSavedStateRegistry() {
        return this.f3826m.getSavedStateRegistry();
    }

    @Override // androidx.lifecycle.c0
    public final androidx.lifecycle.b0 getViewModelStore() {
        return this.f3826m.getViewModelStore();
    }

    @Override // z.InterfaceC1052d
    public final void removeOnConfigurationChangedListener(H.a aVar) {
        this.f3826m.removeOnConfigurationChangedListener(aVar);
    }
}
