package defpackage;

import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class kk extends nk implements nw, tw, qw, rw, r90, mw, j2, x10, zk, cu {
    public final /* synthetic */ r3 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kk(r3 r3Var) {
        super(r3Var);
        this.j = r3Var;
    }

    @Override // defpackage.cu
    public final void a(rk rkVar) {
        this.j.a(rkVar);
    }

    @Override // defpackage.nw
    public final void c(hd hdVar) {
        this.j.c(hdVar);
    }

    @Override // defpackage.nw
    public final void d(hd hdVar) {
        this.j.d(hdVar);
    }

    @Override // defpackage.rw
    public final void e(hd hdVar) {
        this.j.e(hdVar);
    }

    @Override // defpackage.qw
    public final void f(hd hdVar) {
        this.j.f(hdVar);
    }

    @Override // defpackage.cu
    public final void g(rk rkVar) {
        this.j.g(rkVar);
    }

    @Override // defpackage.nq
    public final iq getLifecycle() {
        return this.j.A;
    }

    @Override // defpackage.mw
    public final lw getOnBackPressedDispatcher() {
        return this.j.getOnBackPressedDispatcher();
    }

    @Override // defpackage.x10
    public final v10 getSavedStateRegistry() {
        return this.j.i.b;
    }

    @Override // defpackage.r90
    public final q90 getViewModelStore() {
        return this.j.getViewModelStore();
    }

    @Override // defpackage.tw
    public final void h(hd hdVar) {
        this.j.h(hdVar);
    }

    @Override // defpackage.j2
    public final i2 i() {
        return this.j.m;
    }

    @Override // defpackage.tw
    public final void j(hd hdVar) {
        this.j.j(hdVar);
    }

    @Override // defpackage.rw
    public final void k(hd hdVar) {
        this.j.k(hdVar);
    }

    @Override // defpackage.qw
    public final void l(hd hdVar) {
        this.j.l(hdVar);
    }

    @Override // defpackage.mk
    public final View m(int i) {
        return this.j.findViewById(i);
    }

    @Override // defpackage.mk
    public final boolean n() {
        Window window = this.j.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // defpackage.zk
    public final void b(Fragment fragment) {
    }
}
