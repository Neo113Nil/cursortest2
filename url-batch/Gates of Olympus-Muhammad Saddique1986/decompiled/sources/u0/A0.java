package u0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import b0.C0334c;
import b0.C0349s;
import r0.C0929z;

/* loaded from: classes.dex */
public final class A0 implements InterfaceC1105i0 {

    /* renamed from: g, reason: collision with root package name */
    public static boolean f9121g = true;

    /* renamed from: a, reason: collision with root package name */
    public final RenderNode f9122a;

    /* renamed from: b, reason: collision with root package name */
    public int f9123b;

    /* renamed from: c, reason: collision with root package name */
    public int f9124c;

    /* renamed from: d, reason: collision with root package name */
    public int f9125d;

    /* renamed from: e, reason: collision with root package name */
    public int f9126e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9127f;

    public A0(C1123s c1123s) {
        RenderNode create = RenderNode.create("Compose", c1123s);
        this.f9122a = create;
        if (f9121g) {
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
                G0 g02 = G0.f9190a;
                g02.c(create, g02.a(create));
                g02.d(create, g02.b(create));
            }
            F0.f9188a.a(create);
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
            f9121g = false;
        }
    }

    @Override // u0.InterfaceC1105i0
    public final int A() {
        return this.f9123b;
    }

    @Override // u0.InterfaceC1105i0
    public final void B(boolean z3) {
        this.f9122a.setClipToOutline(z3);
    }

    @Override // u0.InterfaceC1105i0
    public final void C(int i3) {
        if (b0.M.q(i3, 1)) {
            this.f9122a.setLayerType(2);
            this.f9122a.setHasOverlappingRendering(true);
        } else if (b0.M.q(i3, 2)) {
            this.f9122a.setLayerType(0);
            this.f9122a.setHasOverlappingRendering(false);
        } else {
            this.f9122a.setLayerType(0);
            this.f9122a.setHasOverlappingRendering(true);
        }
    }

    @Override // u0.InterfaceC1105i0
    public final void D(float f3) {
        this.f9122a.setPivotX(f3);
    }

    @Override // u0.InterfaceC1105i0
    public final void E(boolean z3) {
        this.f9127f = z3;
        this.f9122a.setClipToBounds(z3);
    }

    @Override // u0.InterfaceC1105i0
    public final void F(Outline outline) {
        this.f9122a.setOutline(outline);
    }

    @Override // u0.InterfaceC1105i0
    public final void G(int i3) {
        if (Build.VERSION.SDK_INT >= 28) {
            G0.f9190a.d(this.f9122a, i3);
        }
    }

    @Override // u0.InterfaceC1105i0
    public final boolean H(int i3, int i4, int i5, int i6) {
        this.f9123b = i3;
        this.f9124c = i4;
        this.f9125d = i5;
        this.f9126e = i6;
        return this.f9122a.setLeftTopRightBottom(i3, i4, i5, i6);
    }

    @Override // u0.InterfaceC1105i0
    public final boolean I() {
        return this.f9122a.setHasOverlappingRendering(true);
    }

    @Override // u0.InterfaceC1105i0
    public final void J(Matrix matrix) {
        this.f9122a.getMatrix(matrix);
    }

    @Override // u0.InterfaceC1105i0
    public final float K() {
        return this.f9122a.getElevation();
    }

    @Override // u0.InterfaceC1105i0
    public final void L(int i3) {
        if (Build.VERSION.SDK_INT >= 28) {
            G0.f9190a.c(this.f9122a, i3);
        }
    }

    @Override // u0.InterfaceC1105i0
    public final float a() {
        return this.f9122a.getAlpha();
    }

    @Override // u0.InterfaceC1105i0
    public final void b(float f3) {
        this.f9122a.setRotationY(f3);
    }

    @Override // u0.InterfaceC1105i0
    public final void c(float f3) {
        this.f9122a.setTranslationX(f3);
    }

    @Override // u0.InterfaceC1105i0
    public final void d(float f3) {
        this.f9122a.setAlpha(f3);
    }

    @Override // u0.InterfaceC1105i0
    public final void e(float f3) {
        this.f9122a.setScaleY(f3);
    }

    @Override // u0.InterfaceC1105i0
    public final int f() {
        return this.f9125d - this.f9123b;
    }

    @Override // u0.InterfaceC1105i0
    public final int h() {
        return this.f9126e - this.f9124c;
    }

    @Override // u0.InterfaceC1105i0
    public final void i(float f3) {
        this.f9122a.setRotation(f3);
    }

    @Override // u0.InterfaceC1105i0
    public final void j(float f3) {
        this.f9122a.setTranslationY(f3);
    }

    @Override // u0.InterfaceC1105i0
    public final void k(float f3) {
        this.f9122a.setCameraDistance(-f3);
    }

    @Override // u0.InterfaceC1105i0
    public final boolean l() {
        return this.f9122a.isValid();
    }

    @Override // u0.InterfaceC1105i0
    public final void m(float f3) {
        this.f9122a.setScaleX(f3);
    }

    @Override // u0.InterfaceC1105i0
    public final void n(float f3) {
        this.f9122a.setRotationX(f3);
    }

    @Override // u0.InterfaceC1105i0
    public final void o() {
        F0.f9188a.a(this.f9122a);
    }

    @Override // u0.InterfaceC1105i0
    public final void p(float f3) {
        this.f9122a.setPivotY(f3);
    }

    @Override // u0.InterfaceC1105i0
    public final void q(float f3) {
        this.f9122a.setElevation(f3);
    }

    @Override // u0.InterfaceC1105i0
    public final void r(int i3) {
        this.f9123b += i3;
        this.f9125d += i3;
        this.f9122a.offsetLeftAndRight(i3);
    }

    @Override // u0.InterfaceC1105i0
    public final int s() {
        return this.f9126e;
    }

    @Override // u0.InterfaceC1105i0
    public final int t() {
        return this.f9125d;
    }

    @Override // u0.InterfaceC1105i0
    public final void u(C0349s c0349s, b0.L l3, C0929z c0929z) {
        DisplayListCanvas start = this.f9122a.start(f(), h());
        Canvas u3 = c0349s.a().u();
        c0349s.a().v((Canvas) start);
        C0334c a3 = c0349s.a();
        if (l3 != null) {
            a3.f();
            a3.i(l3, 1);
        }
        c0929z.n(a3);
        if (l3 != null) {
            a3.a();
        }
        c0349s.a().v(u3);
        this.f9122a.end(start);
    }

    @Override // u0.InterfaceC1105i0
    public final boolean v() {
        return this.f9122a.getClipToOutline();
    }

    @Override // u0.InterfaceC1105i0
    public final void w(int i3) {
        this.f9124c += i3;
        this.f9126e += i3;
        this.f9122a.offsetTopAndBottom(i3);
    }

    @Override // u0.InterfaceC1105i0
    public final boolean x() {
        return this.f9127f;
    }

    @Override // u0.InterfaceC1105i0
    public final void y(Canvas canvas) {
        ((DisplayListCanvas) canvas).drawRenderNode(this.f9122a);
    }

    @Override // u0.InterfaceC1105i0
    public final int z() {
        return this.f9124c;
    }

    @Override // u0.InterfaceC1105i0
    public final void g() {
    }
}
