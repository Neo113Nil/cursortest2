package defpackage;

import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class jr0 extends pr0 implements vu1, fv1, av1, bv1, u53, su1, m4, zd2, fs0, hk1 {
    public final /* synthetic */ kr0 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jr0(kr0 kr0Var) {
        super(kr0Var);
        this.q = kr0Var;
    }

    @Override // defpackage.fs0
    public final void a(fr0 fr0Var) {
        this.q.onAttachFragment(fr0Var);
    }

    @Override // defpackage.hk1
    public final void addMenuProvider(al1 al1Var) {
        this.q.addMenuProvider(al1Var);
    }

    @Override // defpackage.vu1
    public final void addOnConfigurationChangedListener(a20 a20Var) {
        this.q.addOnConfigurationChangedListener(a20Var);
    }

    @Override // defpackage.av1
    public final void addOnMultiWindowModeChangedListener(a20 a20Var) {
        this.q.addOnMultiWindowModeChangedListener(a20Var);
    }

    @Override // defpackage.bv1
    public final void addOnPictureInPictureModeChangedListener(a20 a20Var) {
        this.q.addOnPictureInPictureModeChangedListener(a20Var);
    }

    @Override // defpackage.fv1
    public final void addOnTrimMemoryListener(a20 a20Var) {
        this.q.addOnTrimMemoryListener(a20Var);
    }

    @Override // defpackage.mr0
    public final View b(int i) {
        return this.q.findViewById(i);
    }

    @Override // defpackage.mr0
    public final boolean c() {
        Window window = this.q.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // defpackage.m4
    public final i4 getActivityResultRegistry() {
        return this.q.getActivityResultRegistry();
    }

    @Override // defpackage.id1
    public final ad1 getLifecycle() {
        return this.q.mFragmentLifecycleRegistry;
    }

    @Override // defpackage.su1
    public final ru1 getOnBackPressedDispatcher() {
        return this.q.getOnBackPressedDispatcher();
    }

    @Override // defpackage.zd2
    public final wd2 getSavedStateRegistry() {
        return this.q.getSavedStateRegistry();
    }

    @Override // defpackage.u53
    public final t53 getViewModelStore() {
        return this.q.getViewModelStore();
    }

    @Override // defpackage.hk1
    public final void removeMenuProvider(al1 al1Var) {
        this.q.removeMenuProvider(al1Var);
    }

    @Override // defpackage.vu1
    public final void removeOnConfigurationChangedListener(a20 a20Var) {
        this.q.removeOnConfigurationChangedListener(a20Var);
    }

    @Override // defpackage.av1
    public final void removeOnMultiWindowModeChangedListener(a20 a20Var) {
        this.q.removeOnMultiWindowModeChangedListener(a20Var);
    }

    @Override // defpackage.bv1
    public final void removeOnPictureInPictureModeChangedListener(a20 a20Var) {
        this.q.removeOnPictureInPictureModeChangedListener(a20Var);
    }

    @Override // defpackage.fv1
    public final void removeOnTrimMemoryListener(a20 a20Var) {
        this.q.removeOnTrimMemoryListener(a20Var);
    }
}
