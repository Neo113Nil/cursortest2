package androidx.fragment.app;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.AbstractC0082o;
import g.AbstractActivityC0159k;

/* renamed from: androidx.fragment.app.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0063u extends q1.l implements androidx.lifecycle.V, a.C, g0.f, P {

    /* renamed from: g, reason: collision with root package name */
    public final AbstractActivityC0064v f1424g;
    public final AbstractActivityC0064v h;
    public final Handler i;

    /* renamed from: j, reason: collision with root package name */
    public final L f1425j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0159k f1426k;

    public C0063u(AbstractActivityC0159k abstractActivityC0159k) {
        this.f1426k = abstractActivityC0159k;
        Handler handler = new Handler();
        this.f1425j = new L();
        this.f1424g = abstractActivityC0159k;
        this.h = abstractActivityC0159k;
        this.i = handler;
    }

    @Override // q1.l
    public final View Q(int i) {
        return this.f1426k.findViewById(i);
    }

    @Override // q1.l
    public final boolean T() {
        Window window = this.f1426k.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // androidx.fragment.app.P
    public final void a(AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q) {
        this.f1426k.onAttachFragment(abstractComponentCallbacksC0060q);
    }

    @Override // androidx.lifecycle.InterfaceC0086t
    public final AbstractC0082o getLifecycle() {
        return this.f1426k.mFragmentLifecycleRegistry;
    }

    @Override // g0.f
    public final g0.d getSavedStateRegistry() {
        return this.f1426k.getSavedStateRegistry();
    }

    @Override // androidx.lifecycle.V
    public final androidx.lifecycle.U getViewModelStore() {
        return this.f1426k.getViewModelStore();
    }
}
