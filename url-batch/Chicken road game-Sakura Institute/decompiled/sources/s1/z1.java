package s1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class z1 implements h1 {

    /* renamed from: a, reason: collision with root package name */
    public final RenderNode f8492a = l1.f.u();

    @Override // s1.h1
    public final void A(z0.s sVar, z0.k0 k0Var, l0 l0Var) {
        RecordingCanvas beginRecording;
        beginRecording = this.f8492a.beginRecording();
        z0.d dVar = sVar.f10046a;
        Canvas canvas = dVar.f9984a;
        dVar.f9984a = beginRecording;
        if (k0Var != null) {
            dVar.o();
            dVar.i(k0Var);
        }
        l0Var.f(dVar);
        if (k0Var != null) {
            dVar.n();
        }
        sVar.f10046a.f9984a = canvas;
        this.f8492a.endRecording();
    }

    @Override // s1.h1
    public final void B(int i7) {
        this.f8492a.setAmbientShadowColor(i7);
    }

    @Override // s1.h1
    public final void C(float f9) {
        this.f8492a.setPivotY(f9);
    }

    @Override // s1.h1
    public final void D(float f9) {
        this.f8492a.setElevation(f9);
    }

    @Override // s1.h1
    public final boolean E() {
        boolean clipToOutline;
        clipToOutline = this.f8492a.getClipToOutline();
        return clipToOutline;
    }

    @Override // s1.h1
    public final void F(int i7) {
        this.f8492a.offsetTopAndBottom(i7);
    }

    @Override // s1.h1
    public final void G(boolean z8) {
        this.f8492a.setClipToOutline(z8);
    }

    @Override // s1.h1
    public final void H(Outline outline) {
        this.f8492a.setOutline(outline);
    }

    @Override // s1.h1
    public final void I(int i7) {
        this.f8492a.setSpotShadowColor(i7);
    }

    @Override // s1.h1
    public final boolean J() {
        boolean hasOverlappingRendering;
        hasOverlappingRendering = this.f8492a.setHasOverlappingRendering(true);
        return hasOverlappingRendering;
    }

    @Override // s1.h1
    public final void K(Matrix matrix) {
        this.f8492a.getMatrix(matrix);
    }

    @Override // s1.h1
    public final float L() {
        float elevation;
        elevation = this.f8492a.getElevation();
        return elevation;
    }

    @Override // s1.h1
    public final float a() {
        float alpha;
        alpha = this.f8492a.getAlpha();
        return alpha;
    }

    @Override // s1.h1
    public final void b() {
        this.f8492a.setRotationX(0.0f);
    }

    @Override // s1.h1
    public final void c(float f9) {
        this.f8492a.setAlpha(f9);
    }

    @Override // s1.h1
    public final int d() {
        int left;
        left = this.f8492a.getLeft();
        return left;
    }

    @Override // s1.h1
    public final void e() {
        this.f8492a.setTranslationY(0.0f);
    }

    @Override // s1.h1
    public final int f() {
        int height;
        height = this.f8492a.getHeight();
        return height;
    }

    @Override // s1.h1
    public final void g() {
        this.f8492a.setRotationY(0.0f);
    }

    @Override // s1.h1
    public final void h(float f9) {
        this.f8492a.setScaleX(f9);
    }

    @Override // s1.h1
    public final void i() {
        this.f8492a.discardDisplayList();
    }

    @Override // s1.h1
    public final void j() {
        this.f8492a.setTranslationX(0.0f);
    }

    @Override // s1.h1
    public final void k() {
        this.f8492a.setRotationZ(0.0f);
    }

    @Override // s1.h1
    public final void l(float f9) {
        this.f8492a.setScaleY(f9);
    }

    @Override // s1.h1
    public final int m() {
        int right;
        right = this.f8492a.getRight();
        return right;
    }

    @Override // s1.h1
    public final int n() {
        int width;
        width = this.f8492a.getWidth();
        return width;
    }

    @Override // s1.h1
    public final void o(float f9) {
        this.f8492a.setCameraDistance(f9);
    }

    @Override // s1.h1
    public final boolean p() {
        boolean hasDisplayList;
        hasDisplayList = this.f8492a.hasDisplayList();
        return hasDisplayList;
    }

    @Override // s1.h1
    public final void q(int i7) {
        this.f8492a.offsetLeftAndRight(i7);
    }

    @Override // s1.h1
    public final int r() {
        int bottom;
        bottom = this.f8492a.getBottom();
        return bottom;
    }

    @Override // s1.h1
    public final boolean s() {
        boolean clipToBounds;
        clipToBounds = this.f8492a.getClipToBounds();
        return clipToBounds;
    }

    @Override // s1.h1
    public final void t() {
        if (Build.VERSION.SDK_INT >= 31) {
            a2.f8131a.a(this.f8492a, null);
        }
    }

    @Override // s1.h1
    public final void u(Canvas canvas) {
        canvas.drawRenderNode(this.f8492a);
    }

    @Override // s1.h1
    public final int v() {
        int top;
        top = this.f8492a.getTop();
        return top;
    }

    @Override // s1.h1
    public final void w(float f9) {
        this.f8492a.setPivotX(f9);
    }

    @Override // s1.h1
    public final void x(boolean z8) {
        this.f8492a.setClipToBounds(z8);
    }

    @Override // s1.h1
    public final boolean y(int i7, int i8, int i9, int i10) {
        boolean position;
        position = this.f8492a.setPosition(i7, i8, i9, i10);
        return position;
    }

    @Override // s1.h1
    public final void z() {
        RenderNode renderNode = this.f8492a;
        renderNode.setUseCompositingLayer(false, null);
        renderNode.setHasOverlappingRendering(true);
    }
}
