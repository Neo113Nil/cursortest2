package androidx.fragment.app;

import E.InterfaceC0007h;
import E.InterfaceC0013n;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.AbstractC0231j;
import b.C0238A;
import b.InterfaceC0239B;
import io.flutter.embedding.android.FlutterFragmentActivity;
import m1.C1307e;
import t.InterfaceC1422j;
import t.InterfaceC1423k;
import u.InterfaceC1444a;
import u.InterfaceC1445b;

/* loaded from: classes.dex */
public final class J extends Q implements InterfaceC1444a, InterfaceC1445b, InterfaceC1422j, InterfaceC1423k, androidx.lifecycle.P, InterfaceC0239B, d.i, m1.g, j0, InterfaceC0007h {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ FlutterFragmentActivity f4759e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(FlutterFragmentActivity flutterFragmentActivity) {
        super(flutterFragmentActivity);
        this.f4759e = flutterFragmentActivity;
    }

    @Override // androidx.fragment.app.j0
    public final void a(F f4) {
        this.f4759e.onAttachFragment(f4);
    }

    @Override // E.InterfaceC0007h
    public final void addMenuProvider(InterfaceC0013n interfaceC0013n) {
        this.f4759e.addMenuProvider(interfaceC0013n);
    }

    @Override // u.InterfaceC1444a
    public final void addOnConfigurationChangedListener(D.a aVar) {
        this.f4759e.addOnConfigurationChangedListener(aVar);
    }

    @Override // t.InterfaceC1422j
    public final void addOnMultiWindowModeChangedListener(D.a aVar) {
        this.f4759e.addOnMultiWindowModeChangedListener(aVar);
    }

    @Override // t.InterfaceC1423k
    public final void addOnPictureInPictureModeChangedListener(D.a aVar) {
        this.f4759e.addOnPictureInPictureModeChangedListener(aVar);
    }

    @Override // u.InterfaceC1445b
    public final void addOnTrimMemoryListener(D.a aVar) {
        this.f4759e.addOnTrimMemoryListener(aVar);
    }

    @Override // androidx.fragment.app.N
    public final View b(int i4) {
        return this.f4759e.findViewById(i4);
    }

    @Override // androidx.fragment.app.N
    public final boolean c() {
        Window window = this.f4759e.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // d.i
    public final d.h getActivityResultRegistry() {
        return this.f4759e.getActivityResultRegistry();
    }

    @Override // androidx.lifecycle.InterfaceC0235n
    public final AbstractC0231j getLifecycle() {
        return this.f4759e.mFragmentLifecycleRegistry;
    }

    @Override // b.InterfaceC0239B
    public final C0238A getOnBackPressedDispatcher() {
        return this.f4759e.getOnBackPressedDispatcher();
    }

    @Override // m1.g
    public final C1307e getSavedStateRegistry() {
        return this.f4759e.getSavedStateRegistry();
    }

    @Override // androidx.lifecycle.P
    public final androidx.lifecycle.O getViewModelStore() {
        return this.f4759e.getViewModelStore();
    }

    @Override // E.InterfaceC0007h
    public final void removeMenuProvider(InterfaceC0013n interfaceC0013n) {
        this.f4759e.removeMenuProvider(interfaceC0013n);
    }

    @Override // u.InterfaceC1444a
    public final void removeOnConfigurationChangedListener(D.a aVar) {
        this.f4759e.removeOnConfigurationChangedListener(aVar);
    }

    @Override // t.InterfaceC1422j
    public final void removeOnMultiWindowModeChangedListener(D.a aVar) {
        this.f4759e.removeOnMultiWindowModeChangedListener(aVar);
    }

    @Override // t.InterfaceC1423k
    public final void removeOnPictureInPictureModeChangedListener(D.a aVar) {
        this.f4759e.removeOnPictureInPictureModeChangedListener(aVar);
    }

    @Override // u.InterfaceC1445b
    public final void removeOnTrimMemoryListener(D.a aVar) {
        this.f4759e.removeOnTrimMemoryListener(aVar);
    }
}
