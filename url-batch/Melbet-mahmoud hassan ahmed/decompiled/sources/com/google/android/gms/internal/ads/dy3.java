package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
final class dy3 implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, nb4, i14, p74, u44, n93, k53, iy3, a80, mm3 {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ gy3 f4398f;

    /* synthetic */ dy3(gy3 gy3Var, cy3 cy3Var) {
        this.f4398f = gy3Var;
    }

    @Override // com.google.android.gms.internal.ads.nb4
    public final void B(String str) {
        q04 q04Var;
        q04Var = this.f4398f.f5952i;
        q04Var.B(str);
    }

    @Override // com.google.android.gms.internal.ads.i14
    public final void C(long j7) {
        q04 q04Var;
        q04Var = this.f4398f.f5952i;
        q04Var.C(j7);
    }

    @Override // com.google.android.gms.internal.ads.nb4
    public final void E(c0 c0Var, de3 de3Var) {
        q04 q04Var;
        this.f4398f.f5958o = c0Var;
        q04Var = this.f4398f.f5952i;
        q04Var.E(c0Var, de3Var);
    }

    @Override // com.google.android.gms.internal.ads.i14
    public final void M(String str) {
        q04 q04Var;
        q04Var = this.f4398f.f5952i;
        q04Var.M(str);
    }

    @Override // com.google.android.gms.internal.ads.a80
    public final void O(int i7) {
        gy3.E(this.f4398f);
    }

    @Override // com.google.android.gms.internal.ads.a80
    public final /* synthetic */ void R(int i7) {
    }

    @Override // com.google.android.gms.internal.ads.i14
    public final void a(boolean z6) {
        boolean z7;
        z7 = this.f4398f.B;
        if (z7 == z6) {
            return;
        }
        this.f4398f.B = z6;
        gy3.z(this.f4398f);
    }

    @Override // com.google.android.gms.internal.ads.nb4
    public final void b(ry0 ry0Var) {
        q04 q04Var;
        CopyOnWriteArraySet copyOnWriteArraySet;
        this.f4398f.G = ry0Var;
        q04Var = this.f4398f.f5952i;
        q04Var.b(ry0Var);
        copyOnWriteArraySet = this.f4398f.f5951h;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((r80) it.next()).b(ry0Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.a80
    public final void b0(boolean z6) {
    }

    @Override // com.google.android.gms.internal.ads.nb4
    public final void c(long j7, int i7) {
        q04 q04Var;
        q04Var = this.f4398f.f5952i;
        q04Var.c(j7, i7);
    }

    @Override // com.google.android.gms.internal.ads.a80
    public final /* synthetic */ void c0(e30 e30Var) {
    }

    @Override // com.google.android.gms.internal.ads.mm3
    public final /* synthetic */ void d(boolean z6) {
    }

    @Override // com.google.android.gms.internal.ads.a80
    public final void d0(boolean z6, int i7) {
        gy3.E(this.f4398f);
    }

    @Override // com.google.android.gms.internal.ads.nb4
    public final void e(cd3 cd3Var) {
        q04 q04Var;
        this.f4398f.f5966w = cd3Var;
        q04Var = this.f4398f.f5952i;
        q04Var.e(cd3Var);
    }

    @Override // com.google.android.gms.internal.ads.a80
    public final /* synthetic */ void e0(ta0 ta0Var, ta0 ta0Var2, int i7) {
    }

    @Override // com.google.android.gms.internal.ads.i14
    public final void f(cd3 cd3Var) {
        q04 q04Var;
        this.f4398f.f5967x = cd3Var;
        q04Var = this.f4398f.f5952i;
        q04Var.f(cd3Var);
    }

    @Override // com.google.android.gms.internal.ads.a80
    public final /* synthetic */ void f0(ei0 ei0Var, int i7) {
    }

    @Override // com.google.android.gms.internal.ads.a80
    public final /* synthetic */ void g0(boolean z6, int i7) {
    }

    @Override // com.google.android.gms.internal.ads.mm3
    public final void h(boolean z6) {
        gy3.E(this.f4398f);
    }

    @Override // com.google.android.gms.internal.ads.a80
    public final /* synthetic */ void h0(pw0 pw0Var) {
    }

    @Override // com.google.android.gms.internal.ads.i14
    public final void i(Exception exc) {
        q04 q04Var;
        q04Var = this.f4398f.f5952i;
        q04Var.i(exc);
    }

    @Override // com.google.android.gms.internal.ads.a80
    public final /* synthetic */ void i0(z60 z60Var) {
    }

    @Override // com.google.android.gms.internal.ads.nb4
    public final void j(int i7, long j7) {
        q04 q04Var;
        q04Var = this.f4398f.f5952i;
        q04Var.j(i7, j7);
    }

    @Override // com.google.android.gms.internal.ads.a80
    public final /* synthetic */ void j0(fu fuVar) {
    }

    @Override // com.google.android.gms.internal.ads.i14
    public final void k(String str, long j7, long j8) {
        q04 q04Var;
        q04Var = this.f4398f.f5952i;
        q04Var.k(str, j7, j8);
    }

    @Override // com.google.android.gms.internal.ads.a80
    public final /* synthetic */ void k0(zo zoVar, int i7) {
    }

    @Override // com.google.android.gms.internal.ads.nb4
    public final void l(Exception exc) {
        q04 q04Var;
        q04Var = this.f4398f.f5952i;
        q04Var.l(exc);
    }

    @Override // com.google.android.gms.internal.ads.a80
    public final /* synthetic */ void l0(hm0 hm0Var, in0 in0Var) {
    }

    @Override // com.google.android.gms.internal.ads.a80
    public final /* synthetic */ void m0(boolean z6) {
    }

    @Override // com.google.android.gms.internal.ads.i14
    public final void n(cd3 cd3Var) {
        q04 q04Var;
        q04Var = this.f4398f.f5952i;
        q04Var.n(cd3Var);
        this.f4398f.f5959p = null;
        this.f4398f.f5967x = null;
    }

    @Override // com.google.android.gms.internal.ads.a80
    public final /* synthetic */ void n0(c10 c10Var) {
    }

    @Override // com.google.android.gms.internal.ads.a80
    public final /* synthetic */ void o() {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i8) {
        gy3.B(this.f4398f, surfaceTexture);
        this.f4398f.T(i7, i8);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f4398f.W(null);
        this.f4398f.T(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i8) {
        this.f4398f.T(i7, i8);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // com.google.android.gms.internal.ads.i14
    public final void p(int i7, long j7, long j8) {
        q04 q04Var;
        q04Var = this.f4398f.f5952i;
        q04Var.p(i7, j7, j8);
    }

    @Override // com.google.android.gms.internal.ads.nb4
    public final void q(cd3 cd3Var) {
        q04 q04Var;
        q04Var = this.f4398f.f5952i;
        q04Var.q(cd3Var);
        this.f4398f.f5958o = null;
        this.f4398f.f5966w = null;
    }

    @Override // com.google.android.gms.internal.ads.nb4
    public final void s(String str, long j7, long j8) {
        q04 q04Var;
        q04Var = this.f4398f.f5952i;
        q04Var.s(str, j7, j8);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i7, int i8, int i9) {
        this.f4398f.T(i8, i9);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f4398f.T(0, 0);
    }

    @Override // com.google.android.gms.internal.ads.nb4
    public final void w(Object obj, long j7) {
        q04 q04Var;
        Object obj2;
        CopyOnWriteArraySet copyOnWriteArraySet;
        q04Var = this.f4398f.f5952i;
        q04Var.w(obj, j7);
        obj2 = this.f4398f.f5961r;
        if (obj2 == obj) {
            copyOnWriteArraySet = this.f4398f.f5951h;
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                ((r80) it.next()).m();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.i14
    public final void y(c0 c0Var, de3 de3Var) {
        q04 q04Var;
        this.f4398f.f5959p = c0Var;
        q04Var = this.f4398f.f5952i;
        q04Var.y(c0Var, de3Var);
    }

    @Override // com.google.android.gms.internal.ads.i14
    public final void z(Exception exc) {
        q04 q04Var;
        q04Var = this.f4398f.f5952i;
        q04Var.z(exc);
    }
}
