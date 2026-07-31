package u0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import b0.AbstractC0259J;
import b0.C0271d;
import b0.C0286s;
import b0.InterfaceC0258I;

/* renamed from: u0.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0993q0 implements InterfaceC0965c0 {

    /* renamed from: g, reason: collision with root package name */
    public static boolean f8397g = true;

    /* renamed from: a, reason: collision with root package name */
    public final RenderNode f8398a;

    /* renamed from: b, reason: collision with root package name */
    public int f8399b;

    /* renamed from: c, reason: collision with root package name */
    public int f8400c;

    /* renamed from: d, reason: collision with root package name */
    public int f8401d;

    /* renamed from: e, reason: collision with root package name */
    public int f8402e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8403f;

    public C0993q0(C0997t c0997t) {
        RenderNode create = RenderNode.create("Compose", c0997t);
        this.f8398a = create;
        if (f8397g) {
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
                C1004w0 c1004w0 = C1004w0.f8494a;
                c1004w0.c(create, c1004w0.a(create));
                c1004w0.d(create, c1004w0.b(create));
            }
            C1002v0.f8491a.a(create);
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
            f8397g = false;
        }
    }

    @Override // u0.InterfaceC0965c0
    public final void A(boolean z3) {
        this.f8398a.setClipToOutline(z3);
    }

    @Override // u0.InterfaceC0965c0
    public final void B(int i3) {
        if (AbstractC0259J.o(i3, 1)) {
            this.f8398a.setLayerType(2);
            this.f8398a.setHasOverlappingRendering(true);
        } else if (AbstractC0259J.o(i3, 2)) {
            this.f8398a.setLayerType(0);
            this.f8398a.setHasOverlappingRendering(false);
        } else {
            this.f8398a.setLayerType(0);
            this.f8398a.setHasOverlappingRendering(true);
        }
    }

    @Override // u0.InterfaceC0965c0
    public final void C(float f3) {
        this.f8398a.setPivotX(f3);
    }

    @Override // u0.InterfaceC0965c0
    public final void D(boolean z3) {
        this.f8403f = z3;
        this.f8398a.setClipToBounds(z3);
    }

    @Override // u0.InterfaceC0965c0
    public final void E(Outline outline) {
        this.f8398a.setOutline(outline);
    }

    @Override // u0.InterfaceC0965c0
    public final void F(int i3) {
        if (Build.VERSION.SDK_INT >= 28) {
            C1004w0.f8494a.d(this.f8398a, i3);
        }
    }

    @Override // u0.InterfaceC0965c0
    public final boolean G(int i3, int i4, int i5, int i6) {
        this.f8399b = i3;
        this.f8400c = i4;
        this.f8401d = i5;
        this.f8402e = i6;
        return this.f8398a.setLeftTopRightBottom(i3, i4, i5, i6);
    }

    @Override // u0.InterfaceC0965c0
    public final boolean H() {
        return this.f8398a.setHasOverlappingRendering(true);
    }

    @Override // u0.InterfaceC0965c0
    public final void I(Matrix matrix) {
        this.f8398a.getMatrix(matrix);
    }

    @Override // u0.InterfaceC0965c0
    public final float J() {
        return this.f8398a.getElevation();
    }

    @Override // u0.InterfaceC0965c0
    public final void K(C0286s c0286s, InterfaceC0258I interfaceC0258I, t.x xVar) {
        DisplayListCanvas start = this.f8398a.start(f(), h());
        Canvas t3 = c0286s.a().t();
        c0286s.a().u((Canvas) start);
        C0271d a3 = c0286s.a();
        if (interfaceC0258I != null) {
            a3.f();
            a3.i(interfaceC0258I, 1);
        }
        xVar.j(a3);
        if (interfaceC0258I != null) {
            a3.a();
        }
        c0286s.a().u(t3);
        this.f8398a.end(start);
    }

    @Override // u0.InterfaceC0965c0
    public final void L(int i3) {
        if (Build.VERSION.SDK_INT >= 28) {
            C1004w0.f8494a.c(this.f8398a, i3);
        }
    }

    @Override // u0.InterfaceC0965c0
    public final float a() {
        return this.f8398a.getAlpha();
    }

    @Override // u0.InterfaceC0965c0
    public final void b(float f3) {
        this.f8398a.setRotationY(f3);
    }

    @Override // u0.InterfaceC0965c0
    public final void c(float f3) {
        this.f8398a.setTranslationX(f3);
    }

    @Override // u0.InterfaceC0965c0
    public final void d(float f3) {
        this.f8398a.setAlpha(f3);
    }

    @Override // u0.InterfaceC0965c0
    public final void e(float f3) {
        this.f8398a.setScaleY(f3);
    }

    @Override // u0.InterfaceC0965c0
    public final int f() {
        return this.f8401d - this.f8399b;
    }

    @Override // u0.InterfaceC0965c0
    public final int h() {
        return this.f8402e - this.f8400c;
    }

    @Override // u0.InterfaceC0965c0
    public final void i(float f3) {
        this.f8398a.setRotation(f3);
    }

    @Override // u0.InterfaceC0965c0
    public final void j(float f3) {
        this.f8398a.setTranslationY(f3);
    }

    @Override // u0.InterfaceC0965c0
    public final void k(float f3) {
        this.f8398a.setCameraDistance(-f3);
    }

    @Override // u0.InterfaceC0965c0
    public final boolean l() {
        return this.f8398a.isValid();
    }

    @Override // u0.InterfaceC0965c0
    public final void m(float f3) {
        this.f8398a.setScaleX(f3);
    }

    @Override // u0.InterfaceC0965c0
    public final void n(float f3) {
        this.f8398a.setRotationX(f3);
    }

    @Override // u0.InterfaceC0965c0
    public final void o() {
        C1002v0.f8491a.a(this.f8398a);
    }

    @Override // u0.InterfaceC0965c0
    public final void p(float f3) {
        this.f8398a.setPivotY(f3);
    }

    @Override // u0.InterfaceC0965c0
    public final void q(float f3) {
        this.f8398a.setElevation(f3);
    }

    @Override // u0.InterfaceC0965c0
    public final void r(int i3) {
        this.f8399b += i3;
        this.f8401d += i3;
        this.f8398a.offsetLeftAndRight(i3);
    }

    @Override // u0.InterfaceC0965c0
    public final int s() {
        return this.f8402e;
    }

    @Override // u0.InterfaceC0965c0
    public final int t() {
        return this.f8401d;
    }

    @Override // u0.InterfaceC0965c0
    public final boolean u() {
        return this.f8398a.getClipToOutline();
    }

    @Override // u0.InterfaceC0965c0
    public final void v(int i3) {
        this.f8400c += i3;
        this.f8402e += i3;
        this.f8398a.offsetTopAndBottom(i3);
    }

    @Override // u0.InterfaceC0965c0
    public final boolean w() {
        return this.f8403f;
    }

    @Override // u0.InterfaceC0965c0
    public final void x(Canvas canvas) {
        ((DisplayListCanvas) canvas).drawRenderNode(this.f8398a);
    }

    @Override // u0.InterfaceC0965c0
    public final int y() {
        return this.f8400c;
    }

    @Override // u0.InterfaceC0965c0
    public final int z() {
        return this.f8399b;
    }

    @Override // u0.InterfaceC0965c0
    public final void g() {
    }
}
