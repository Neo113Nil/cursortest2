package androidx.fragment.app;

import a.AbstractC0415a;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.AbstractC0508p;
import androidx.lifecycle.InterfaceC0513v;
import h.AbstractActivityC4553l;
import x0.C5202c;
import x0.InterfaceC5204e;

/* renamed from: androidx.fragment.app.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0489w extends AbstractC0415a implements androidx.lifecycle.Y, InterfaceC0513v, InterfaceC5204e, T {

    /* renamed from: n, reason: collision with root package name */
    public final AbstractActivityC0490x f5187n;

    /* renamed from: u, reason: collision with root package name */
    public final AbstractActivityC0490x f5188u;

    /* renamed from: v, reason: collision with root package name */
    public final Handler f5189v;

    /* renamed from: w, reason: collision with root package name */
    public final O f5190w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC4553l f5191x;

    public C0489w(AbstractActivityC4553l abstractActivityC4553l) {
        this.f5191x = abstractActivityC4553l;
        Handler handler = new Handler();
        this.f5190w = new O();
        this.f5187n = abstractActivityC4553l;
        this.f5188u = abstractActivityC4553l;
        this.f5189v = handler;
    }

    @Override // androidx.fragment.app.T
    public final void a(AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s) {
        this.f5191x.onAttachFragment(abstractComponentCallbacksC0485s);
    }

    @Override // androidx.lifecycle.InterfaceC0513v
    public final AbstractC0508p getLifecycle() {
        return this.f5191x.mFragmentLifecycleRegistry;
    }

    @Override // x0.InterfaceC5204e
    public final C5202c getSavedStateRegistry() {
        return this.f5191x.getSavedStateRegistry();
    }

    @Override // androidx.lifecycle.Y
    public final androidx.lifecycle.X getViewModelStore() {
        return this.f5191x.getViewModelStore();
    }

    @Override // a.AbstractC0415a
    public final View t(int i) {
        return this.f5191x.findViewById(i);
    }

    @Override // a.AbstractC0415a
    public final boolean u() {
        Window window = this.f5191x.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }
}
