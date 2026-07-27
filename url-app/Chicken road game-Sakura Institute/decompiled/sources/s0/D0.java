package s0;

import Z.C0306c;
import Z.C0321s;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import c0.AbstractC0535f;

/* loaded from: classes.dex */
public final class D0 implements InterfaceC1148i0 {

    /* renamed from: a, reason: collision with root package name */
    public final RenderNode f10034a = AbstractC0535f.x();

    @Override // s0.InterfaceC1148i0
    public final int A() {
        int top;
        top = this.f10034a.getTop();
        return top;
    }

    @Override // s0.InterfaceC1148i0
    public final void B(boolean z4) {
        this.f10034a.setClipToOutline(z4);
    }

    @Override // s0.InterfaceC1148i0
    public final void C(int i2) {
        RenderNode renderNode = this.f10034a;
        if (Z.K.p(i2, 1)) {
            renderNode.setUseCompositingLayer(true, null);
            renderNode.setHasOverlappingRendering(true);
        } else if (Z.K.p(i2, 2)) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // s0.InterfaceC1148i0
    public final void D(float f4) {
        this.f10034a.setPivotX(f4);
    }

    @Override // s0.InterfaceC1148i0
    public final void E(boolean z4) {
        this.f10034a.setClipToBounds(z4);
    }

    @Override // s0.InterfaceC1148i0
    public final void F(int i2) {
        this.f10034a.setSpotShadowColor(i2);
    }

    @Override // s0.InterfaceC1148i0
    public final boolean G(int i2, int i4, int i5, int i6) {
        boolean position;
        position = this.f10034a.setPosition(i2, i4, i5, i6);
        return position;
    }

    @Override // s0.InterfaceC1148i0
    public final boolean H() {
        boolean hasOverlappingRendering;
        hasOverlappingRendering = this.f10034a.setHasOverlappingRendering(true);
        return hasOverlappingRendering;
    }

    @Override // s0.InterfaceC1148i0
    public final void I(Matrix matrix) {
        this.f10034a.getMatrix(matrix);
    }

    @Override // s0.InterfaceC1148i0
    public final float J() {
        float elevation;
        elevation = this.f10034a.getElevation();
        return elevation;
    }

    @Override // s0.InterfaceC1148i0
    public final void K(C0321s c0321s, Z.J j4, C1160o0 c1160o0) {
        RecordingCanvas beginRecording;
        beginRecording = this.f10034a.beginRecording();
        C0306c c0306c = c0321s.f4540a;
        Canvas canvas = c0306c.f4515a;
        c0306c.f4515a = beginRecording;
        if (j4 != null) {
            c0306c.g();
            c0306c.k(j4, 1);
        }
        c1160o0.invoke(c0306c);
        if (j4 != null) {
            c0306c.b();
        }
        c0321s.f4540a.f4515a = canvas;
        this.f10034a.endRecording();
    }

    @Override // s0.InterfaceC1148i0
    public final void L(int i2) {
        this.f10034a.setAmbientShadowColor(i2);
    }

    @Override // s0.InterfaceC1148i0
    public final float a() {
        float alpha;
        alpha = this.f10034a.getAlpha();
        return alpha;
    }

    @Override // s0.InterfaceC1148i0
    public final void b(float f4) {
        this.f10034a.setRotationY(f4);
    }

    @Override // s0.InterfaceC1148i0
    public final void c(float f4) {
        this.f10034a.setTranslationX(f4);
    }

    @Override // s0.InterfaceC1148i0
    public final void d(float f4) {
        this.f10034a.setAlpha(f4);
    }

    @Override // s0.InterfaceC1148i0
    public final void e(float f4) {
        this.f10034a.setScaleY(f4);
    }

    @Override // s0.InterfaceC1148i0
    public final int f() {
        int right;
        right = this.f10034a.getRight();
        return right;
    }

    @Override // s0.InterfaceC1148i0
    public final int g() {
        int width;
        width = this.f10034a.getWidth();
        return width;
    }

    @Override // s0.InterfaceC1148i0
    public final void h() {
        if (Build.VERSION.SDK_INT >= 31) {
            E0.f10036a.a(this.f10034a, null);
        }
    }

    @Override // s0.InterfaceC1148i0
    public final int i() {
        int left;
        left = this.f10034a.getLeft();
        return left;
    }

    @Override // s0.InterfaceC1148i0
    public final int j() {
        int height;
        height = this.f10034a.getHeight();
        return height;
    }

    @Override // s0.InterfaceC1148i0
    public final void k(float f4) {
        this.f10034a.setRotationZ(f4);
    }

    @Override // s0.InterfaceC1148i0
    public final void l(float f4) {
        this.f10034a.setTranslationY(f4);
    }

    @Override // s0.InterfaceC1148i0
    public final void m(float f4) {
        this.f10034a.setCameraDistance(f4);
    }

    @Override // s0.InterfaceC1148i0
    public final boolean n() {
        boolean hasDisplayList;
        hasDisplayList = this.f10034a.hasDisplayList();
        return hasDisplayList;
    }

    @Override // s0.InterfaceC1148i0
    public final void o(Outline outline) {
        this.f10034a.setOutline(outline);
    }

    @Override // s0.InterfaceC1148i0
    public final void p(float f4) {
        this.f10034a.setScaleX(f4);
    }

    @Override // s0.InterfaceC1148i0
    public final void q(float f4) {
        this.f10034a.setRotationX(f4);
    }

    @Override // s0.InterfaceC1148i0
    public final void r() {
        this.f10034a.discardDisplayList();
    }

    @Override // s0.InterfaceC1148i0
    public final void s(float f4) {
        this.f10034a.setPivotY(f4);
    }

    @Override // s0.InterfaceC1148i0
    public final void t(float f4) {
        this.f10034a.setElevation(f4);
    }

    @Override // s0.InterfaceC1148i0
    public final void u(int i2) {
        this.f10034a.offsetLeftAndRight(i2);
    }

    @Override // s0.InterfaceC1148i0
    public final int v() {
        int bottom;
        bottom = this.f10034a.getBottom();
        return bottom;
    }

    @Override // s0.InterfaceC1148i0
    public final boolean w() {
        boolean clipToOutline;
        clipToOutline = this.f10034a.getClipToOutline();
        return clipToOutline;
    }

    @Override // s0.InterfaceC1148i0
    public final void x(int i2) {
        this.f10034a.offsetTopAndBottom(i2);
    }

    @Override // s0.InterfaceC1148i0
    public final boolean y() {
        boolean clipToBounds;
        clipToBounds = this.f10034a.getClipToBounds();
        return clipToBounds;
    }

    @Override // s0.InterfaceC1148i0
    public final void z(Canvas canvas) {
        canvas.drawRenderNode(this.f10034a);
    }
}
