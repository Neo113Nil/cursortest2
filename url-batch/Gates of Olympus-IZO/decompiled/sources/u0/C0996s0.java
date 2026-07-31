package u0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import b0.AbstractC0259J;
import b0.C0271d;
import b0.C0286s;
import b0.InterfaceC0258I;

/* renamed from: u0.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0996s0 implements InterfaceC0965c0 {

    /* renamed from: a, reason: collision with root package name */
    public final RenderNode f8407a = e0.f.x();

    @Override // u0.InterfaceC0965c0
    public final void A(boolean z3) {
        this.f8407a.setClipToOutline(z3);
    }

    @Override // u0.InterfaceC0965c0
    public final void B(int i3) {
        RenderNode renderNode = this.f8407a;
        if (AbstractC0259J.o(i3, 1)) {
            renderNode.setUseCompositingLayer(true, null);
            renderNode.setHasOverlappingRendering(true);
        } else if (AbstractC0259J.o(i3, 2)) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // u0.InterfaceC0965c0
    public final void C(float f3) {
        this.f8407a.setPivotX(f3);
    }

    @Override // u0.InterfaceC0965c0
    public final void D(boolean z3) {
        this.f8407a.setClipToBounds(z3);
    }

    @Override // u0.InterfaceC0965c0
    public final void E(Outline outline) {
        this.f8407a.setOutline(outline);
    }

    @Override // u0.InterfaceC0965c0
    public final void F(int i3) {
        this.f8407a.setSpotShadowColor(i3);
    }

    @Override // u0.InterfaceC0965c0
    public final boolean G(int i3, int i4, int i5, int i6) {
        boolean position;
        position = this.f8407a.setPosition(i3, i4, i5, i6);
        return position;
    }

    @Override // u0.InterfaceC0965c0
    public final boolean H() {
        boolean hasOverlappingRendering;
        hasOverlappingRendering = this.f8407a.setHasOverlappingRendering(true);
        return hasOverlappingRendering;
    }

    @Override // u0.InterfaceC0965c0
    public final void I(Matrix matrix) {
        this.f8407a.getMatrix(matrix);
    }

    @Override // u0.InterfaceC0965c0
    public final float J() {
        float elevation;
        elevation = this.f8407a.getElevation();
        return elevation;
    }

    @Override // u0.InterfaceC0965c0
    public final void K(C0286s c0286s, InterfaceC0258I interfaceC0258I, t.x xVar) {
        RecordingCanvas beginRecording;
        beginRecording = this.f8407a.beginRecording();
        C0271d c0271d = c0286s.f4290a;
        Canvas canvas = c0271d.f4263a;
        c0271d.f4263a = beginRecording;
        if (interfaceC0258I != null) {
            c0271d.f();
            c0271d.i(interfaceC0258I, 1);
        }
        xVar.j(c0271d);
        if (interfaceC0258I != null) {
            c0271d.a();
        }
        c0286s.f4290a.f4263a = canvas;
        this.f8407a.endRecording();
    }

    @Override // u0.InterfaceC0965c0
    public final void L(int i3) {
        this.f8407a.setAmbientShadowColor(i3);
    }

    @Override // u0.InterfaceC0965c0
    public final float a() {
        float alpha;
        alpha = this.f8407a.getAlpha();
        return alpha;
    }

    @Override // u0.InterfaceC0965c0
    public final void b(float f3) {
        this.f8407a.setRotationY(f3);
    }

    @Override // u0.InterfaceC0965c0
    public final void c(float f3) {
        this.f8407a.setTranslationX(f3);
    }

    @Override // u0.InterfaceC0965c0
    public final void d(float f3) {
        this.f8407a.setAlpha(f3);
    }

    @Override // u0.InterfaceC0965c0
    public final void e(float f3) {
        this.f8407a.setScaleY(f3);
    }

    @Override // u0.InterfaceC0965c0
    public final int f() {
        int width;
        width = this.f8407a.getWidth();
        return width;
    }

    @Override // u0.InterfaceC0965c0
    public final void g() {
        if (Build.VERSION.SDK_INT >= 31) {
            C0998t0.f8476a.a(this.f8407a, null);
        }
    }

    @Override // u0.InterfaceC0965c0
    public final int h() {
        int height;
        height = this.f8407a.getHeight();
        return height;
    }

    @Override // u0.InterfaceC0965c0
    public final void i(float f3) {
        this.f8407a.setRotationZ(f3);
    }

    @Override // u0.InterfaceC0965c0
    public final void j(float f3) {
        this.f8407a.setTranslationY(f3);
    }

    @Override // u0.InterfaceC0965c0
    public final void k(float f3) {
        this.f8407a.setCameraDistance(f3);
    }

    @Override // u0.InterfaceC0965c0
    public final boolean l() {
        boolean hasDisplayList;
        hasDisplayList = this.f8407a.hasDisplayList();
        return hasDisplayList;
    }

    @Override // u0.InterfaceC0965c0
    public final void m(float f3) {
        this.f8407a.setScaleX(f3);
    }

    @Override // u0.InterfaceC0965c0
    public final void n(float f3) {
        this.f8407a.setRotationX(f3);
    }

    @Override // u0.InterfaceC0965c0
    public final void o() {
        this.f8407a.discardDisplayList();
    }

    @Override // u0.InterfaceC0965c0
    public final void p(float f3) {
        this.f8407a.setPivotY(f3);
    }

    @Override // u0.InterfaceC0965c0
    public final void q(float f3) {
        this.f8407a.setElevation(f3);
    }

    @Override // u0.InterfaceC0965c0
    public final void r(int i3) {
        this.f8407a.offsetLeftAndRight(i3);
    }

    @Override // u0.InterfaceC0965c0
    public final int s() {
        int bottom;
        bottom = this.f8407a.getBottom();
        return bottom;
    }

    @Override // u0.InterfaceC0965c0
    public final int t() {
        int right;
        right = this.f8407a.getRight();
        return right;
    }

    @Override // u0.InterfaceC0965c0
    public final boolean u() {
        boolean clipToOutline;
        clipToOutline = this.f8407a.getClipToOutline();
        return clipToOutline;
    }

    @Override // u0.InterfaceC0965c0
    public final void v(int i3) {
        this.f8407a.offsetTopAndBottom(i3);
    }

    @Override // u0.InterfaceC0965c0
    public final boolean w() {
        boolean clipToBounds;
        clipToBounds = this.f8407a.getClipToBounds();
        return clipToBounds;
    }

    @Override // u0.InterfaceC0965c0
    public final void x(Canvas canvas) {
        canvas.drawRenderNode(this.f8407a);
    }

    @Override // u0.InterfaceC0965c0
    public final int y() {
        int top;
        top = this.f8407a.getTop();
        return top;
    }

    @Override // u0.InterfaceC0965c0
    public final int z() {
        int left;
        left = this.f8407a.getLeft();
        return left;
    }
}
