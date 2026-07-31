package u0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import b0.C0334c;
import b0.C0349s;
import e0.AbstractC0420f;
import r0.C0929z;

/* loaded from: classes.dex */
public final class C0 implements InterfaceC1105i0 {

    /* renamed from: a, reason: collision with root package name */
    public final RenderNode f9132a = AbstractC0420f.v();

    @Override // u0.InterfaceC1105i0
    public final int A() {
        int left;
        left = this.f9132a.getLeft();
        return left;
    }

    @Override // u0.InterfaceC1105i0
    public final void B(boolean z3) {
        this.f9132a.setClipToOutline(z3);
    }

    @Override // u0.InterfaceC1105i0
    public final void C(int i3) {
        RenderNode renderNode = this.f9132a;
        if (b0.M.q(i3, 1)) {
            renderNode.setUseCompositingLayer(true, null);
            renderNode.setHasOverlappingRendering(true);
        } else if (b0.M.q(i3, 2)) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // u0.InterfaceC1105i0
    public final void D(float f3) {
        this.f9132a.setPivotX(f3);
    }

    @Override // u0.InterfaceC1105i0
    public final void E(boolean z3) {
        this.f9132a.setClipToBounds(z3);
    }

    @Override // u0.InterfaceC1105i0
    public final void F(Outline outline) {
        this.f9132a.setOutline(outline);
    }

    @Override // u0.InterfaceC1105i0
    public final void G(int i3) {
        this.f9132a.setSpotShadowColor(i3);
    }

    @Override // u0.InterfaceC1105i0
    public final boolean H(int i3, int i4, int i5, int i6) {
        boolean position;
        position = this.f9132a.setPosition(i3, i4, i5, i6);
        return position;
    }

    @Override // u0.InterfaceC1105i0
    public final boolean I() {
        boolean hasOverlappingRendering;
        hasOverlappingRendering = this.f9132a.setHasOverlappingRendering(true);
        return hasOverlappingRendering;
    }

    @Override // u0.InterfaceC1105i0
    public final void J(Matrix matrix) {
        this.f9132a.getMatrix(matrix);
    }

    @Override // u0.InterfaceC1105i0
    public final float K() {
        float elevation;
        elevation = this.f9132a.getElevation();
        return elevation;
    }

    @Override // u0.InterfaceC1105i0
    public final void L(int i3) {
        this.f9132a.setAmbientShadowColor(i3);
    }

    @Override // u0.InterfaceC1105i0
    public final float a() {
        float alpha;
        alpha = this.f9132a.getAlpha();
        return alpha;
    }

    @Override // u0.InterfaceC1105i0
    public final void b(float f3) {
        this.f9132a.setRotationY(f3);
    }

    @Override // u0.InterfaceC1105i0
    public final void c(float f3) {
        this.f9132a.setTranslationX(f3);
    }

    @Override // u0.InterfaceC1105i0
    public final void d(float f3) {
        this.f9132a.setAlpha(f3);
    }

    @Override // u0.InterfaceC1105i0
    public final void e(float f3) {
        this.f9132a.setScaleY(f3);
    }

    @Override // u0.InterfaceC1105i0
    public final int f() {
        int width;
        width = this.f9132a.getWidth();
        return width;
    }

    @Override // u0.InterfaceC1105i0
    public final void g() {
        if (Build.VERSION.SDK_INT >= 31) {
            D0.f9138a.a(this.f9132a, null);
        }
    }

    @Override // u0.InterfaceC1105i0
    public final int h() {
        int height;
        height = this.f9132a.getHeight();
        return height;
    }

    @Override // u0.InterfaceC1105i0
    public final void i(float f3) {
        this.f9132a.setRotationZ(f3);
    }

    @Override // u0.InterfaceC1105i0
    public final void j(float f3) {
        this.f9132a.setTranslationY(f3);
    }

    @Override // u0.InterfaceC1105i0
    public final void k(float f3) {
        this.f9132a.setCameraDistance(f3);
    }

    @Override // u0.InterfaceC1105i0
    public final boolean l() {
        boolean hasDisplayList;
        hasDisplayList = this.f9132a.hasDisplayList();
        return hasDisplayList;
    }

    @Override // u0.InterfaceC1105i0
    public final void m(float f3) {
        this.f9132a.setScaleX(f3);
    }

    @Override // u0.InterfaceC1105i0
    public final void n(float f3) {
        this.f9132a.setRotationX(f3);
    }

    @Override // u0.InterfaceC1105i0
    public final void o() {
        this.f9132a.discardDisplayList();
    }

    @Override // u0.InterfaceC1105i0
    public final void p(float f3) {
        this.f9132a.setPivotY(f3);
    }

    @Override // u0.InterfaceC1105i0
    public final void q(float f3) {
        this.f9132a.setElevation(f3);
    }

    @Override // u0.InterfaceC1105i0
    public final void r(int i3) {
        this.f9132a.offsetLeftAndRight(i3);
    }

    @Override // u0.InterfaceC1105i0
    public final int s() {
        int bottom;
        bottom = this.f9132a.getBottom();
        return bottom;
    }

    @Override // u0.InterfaceC1105i0
    public final int t() {
        int right;
        right = this.f9132a.getRight();
        return right;
    }

    @Override // u0.InterfaceC1105i0
    public final void u(C0349s c0349s, b0.L l3, C0929z c0929z) {
        RecordingCanvas beginRecording;
        beginRecording = this.f9132a.beginRecording();
        C0334c c0334c = c0349s.f5432a;
        Canvas canvas = c0334c.f5405a;
        c0334c.f5405a = beginRecording;
        if (l3 != null) {
            c0334c.f();
            c0334c.i(l3, 1);
        }
        c0929z.n(c0334c);
        if (l3 != null) {
            c0334c.a();
        }
        c0349s.f5432a.f5405a = canvas;
        this.f9132a.endRecording();
    }

    @Override // u0.InterfaceC1105i0
    public final boolean v() {
        boolean clipToOutline;
        clipToOutline = this.f9132a.getClipToOutline();
        return clipToOutline;
    }

    @Override // u0.InterfaceC1105i0
    public final void w(int i3) {
        this.f9132a.offsetTopAndBottom(i3);
    }

    @Override // u0.InterfaceC1105i0
    public final boolean x() {
        boolean clipToBounds;
        clipToBounds = this.f9132a.getClipToBounds();
        return clipToBounds;
    }

    @Override // u0.InterfaceC1105i0
    public final void y(Canvas canvas) {
        canvas.drawRenderNode(this.f9132a);
    }

    @Override // u0.InterfaceC1105i0
    public final int z() {
        int top;
        top = this.f9132a.getTop();
        return top;
    }
}
