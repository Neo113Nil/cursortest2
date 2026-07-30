package s1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class y1 implements h1 {

    /* renamed from: g, reason: collision with root package name */
    public static boolean f8476g = true;

    /* renamed from: a, reason: collision with root package name */
    public final RenderNode f8477a;

    /* renamed from: b, reason: collision with root package name */
    public int f8478b;

    /* renamed from: c, reason: collision with root package name */
    public int f8479c;

    /* renamed from: d, reason: collision with root package name */
    public int f8480d;

    /* renamed from: e, reason: collision with root package name */
    public int f8481e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8482f;

    public y1(r rVar) {
        RenderNode create = RenderNode.create("Compose", rVar);
        this.f8477a = create;
        if (f8476g) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            if (Build.VERSION.SDK_INT >= 28) {
                d2 d2Var = d2.f8198a;
                d2Var.c(create, d2Var.a(create));
                d2Var.d(create, d2Var.b(create));
            }
            c2.f8187a.a(create);
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
            f8476g = false;
        }
    }

    @Override // s1.h1
    public final void A(z0.s sVar, z0.k0 k0Var, l0 l0Var) {
        Canvas start = this.f8477a.start(n(), f());
        z0.d dVar = sVar.f10046a;
        Canvas canvas = dVar.f9984a;
        dVar.f9984a = start;
        if (k0Var != null) {
            dVar.o();
            dVar.i(k0Var);
        }
        l0Var.f(dVar);
        if (k0Var != null) {
            dVar.n();
        }
        sVar.f10046a.f9984a = canvas;
        this.f8477a.end(start);
    }

    @Override // s1.h1
    public final void B(int i7) {
        if (Build.VERSION.SDK_INT >= 28) {
            d2.f8198a.c(this.f8477a, i7);
        }
    }

    @Override // s1.h1
    public final void C(float f9) {
        this.f8477a.setPivotY(f9);
    }

    @Override // s1.h1
    public final void D(float f9) {
        this.f8477a.setElevation(f9);
    }

    @Override // s1.h1
    public final boolean E() {
        return this.f8477a.getClipToOutline();
    }

    @Override // s1.h1
    public final void F(int i7) {
        this.f8479c += i7;
        this.f8481e += i7;
        this.f8477a.offsetTopAndBottom(i7);
    }

    @Override // s1.h1
    public final void G(boolean z8) {
        this.f8477a.setClipToOutline(z8);
    }

    @Override // s1.h1
    public final void H(Outline outline) {
        this.f8477a.setOutline(outline);
    }

    @Override // s1.h1
    public final void I(int i7) {
        if (Build.VERSION.SDK_INT >= 28) {
            d2.f8198a.d(this.f8477a, i7);
        }
    }

    @Override // s1.h1
    public final boolean J() {
        return this.f8477a.setHasOverlappingRendering(true);
    }

    @Override // s1.h1
    public final void K(Matrix matrix) {
        this.f8477a.getMatrix(matrix);
    }

    @Override // s1.h1
    public final float L() {
        return this.f8477a.getElevation();
    }

    @Override // s1.h1
    public final float a() {
        return this.f8477a.getAlpha();
    }

    @Override // s1.h1
    public final void b() {
        this.f8477a.setRotationX(0.0f);
    }

    @Override // s1.h1
    public final void c(float f9) {
        this.f8477a.setAlpha(f9);
    }

    @Override // s1.h1
    public final int d() {
        return this.f8478b;
    }

    @Override // s1.h1
    public final void e() {
        this.f8477a.setTranslationY(0.0f);
    }

    @Override // s1.h1
    public final int f() {
        return this.f8481e - this.f8479c;
    }

    @Override // s1.h1
    public final void g() {
        this.f8477a.setRotationY(0.0f);
    }

    @Override // s1.h1
    public final void h(float f9) {
        this.f8477a.setScaleX(f9);
    }

    @Override // s1.h1
    public final void i() {
        c2.f8187a.a(this.f8477a);
    }

    @Override // s1.h1
    public final void j() {
        this.f8477a.setTranslationX(0.0f);
    }

    @Override // s1.h1
    public final void k() {
        this.f8477a.setRotation(0.0f);
    }

    @Override // s1.h1
    public final void l(float f9) {
        this.f8477a.setScaleY(f9);
    }

    @Override // s1.h1
    public final int m() {
        return this.f8480d;
    }

    @Override // s1.h1
    public final int n() {
        return this.f8480d - this.f8478b;
    }

    @Override // s1.h1
    public final void o(float f9) {
        this.f8477a.setCameraDistance(-f9);
    }

    @Override // s1.h1
    public final boolean p() {
        return this.f8477a.isValid();
    }

    @Override // s1.h1
    public final void q(int i7) {
        this.f8478b += i7;
        this.f8480d += i7;
        this.f8477a.offsetLeftAndRight(i7);
    }

    @Override // s1.h1
    public final int r() {
        return this.f8481e;
    }

    @Override // s1.h1
    public final boolean s() {
        return this.f8482f;
    }

    @Override // s1.h1
    public final void u(Canvas canvas) {
        ((DisplayListCanvas) canvas).drawRenderNode(this.f8477a);
    }

    @Override // s1.h1
    public final int v() {
        return this.f8479c;
    }

    @Override // s1.h1
    public final void w(float f9) {
        this.f8477a.setPivotX(f9);
    }

    @Override // s1.h1
    public final void x(boolean z8) {
        this.f8482f = z8;
        this.f8477a.setClipToBounds(z8);
    }

    @Override // s1.h1
    public final boolean y(int i7, int i8, int i9, int i10) {
        this.f8478b = i7;
        this.f8479c = i8;
        this.f8480d = i9;
        this.f8481e = i10;
        return this.f8477a.setLeftTopRightBottom(i7, i8, i9, i10);
    }

    @Override // s1.h1
    public final void z() {
        this.f8477a.setLayerType(0);
        this.f8477a.setHasOverlappingRendering(true);
    }

    @Override // s1.h1
    public final void t() {
    }
}
