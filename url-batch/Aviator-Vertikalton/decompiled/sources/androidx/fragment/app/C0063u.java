package androidx.fragment.app;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.AbstractC0082o;
import g.AbstractActivityC0158k;

/* renamed from: androidx.fragment.app.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0063u extends q1.l implements androidx.lifecycle.V, a.C, g0.f, P {

    /* renamed from: g, reason: collision with root package name */
    public final AbstractActivityC0064v f1423g;
    public final AbstractActivityC0064v h;
    public final Handler i;

    /* renamed from: j, reason: collision with root package name */
    public final L f1424j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0158k f1425k;

    public C0063u(AbstractActivityC0158k abstractActivityC0158k) {
        this.f1425k = abstractActivityC0158k;
        Handler handler = new Handler();
        this.f1424j = new L();
        this.f1423g = abstractActivityC0158k;
        this.h = abstractActivityC0158k;
        this.i = handler;
    }

    @Override // q1.l
    public final View Q(int i) {
        return this.f1425k.findViewById(i);
    }

    @Override // q1.l
    public final boolean T() {
        Window window = this.f1425k.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // androidx.fragment.app.P
    public final void a(AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q) {
        this.f1425k.onAttachFragment(abstractComponentCallbacksC0060q);
    }

    @Override // androidx.lifecycle.InterfaceC0086t
    public final AbstractC0082o getLifecycle() {
        return this.f1425k.mFragmentLifecycleRegistry;
    }

    @Override // g0.f
    public final g0.d getSavedStateRegistry() {
        return this.f1425k.getSavedStateRegistry();
    }

    @Override // androidx.lifecycle.V
    public final androidx.lifecycle.U getViewModelStore() {
        return this.f1425k.getViewModelStore();
    }
}
