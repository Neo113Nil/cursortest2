package s0;

import Z.C0306c;
import Z.C0321s;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;

/* loaded from: classes.dex */
public final class B0 implements InterfaceC1148i0 {

    /* renamed from: g, reason: collision with root package name */
    public static boolean f9986g = true;

    /* renamed from: a, reason: collision with root package name */
    public final RenderNode f9987a;

    /* renamed from: b, reason: collision with root package name */
    public int f9988b;

    /* renamed from: c, reason: collision with root package name */
    public int f9989c;

    /* renamed from: d, reason: collision with root package name */
    public int f9990d;

    /* renamed from: e, reason: collision with root package name */
    public int f9991e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9992f;

    public B0(C1166s c1166s) {
        RenderNode create = RenderNode.create("Compose", c1166s);
        this.f9987a = create;
        if (f9986g) {
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
                H0 h02 = H0.f10054a;
                h02.c(create, h02.a(create));
                h02.d(create, h02.b(create));
            }
            G0.f10052a.a(create);
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
            f9986g = false;
        }
    }

    @Override // s0.InterfaceC1148i0
    public final int A() {
        return this.f9989c;
    }

    @Override // s0.InterfaceC1148i0
    public final void B(boolean z4) {
        this.f9987a.setClipToOutline(z4);
    }

    @Override // s0.InterfaceC1148i0
    public final void C(int i2) {
        if (Z.K.p(i2, 1)) {
            this.f9987a.setLayerType(2);
            this.f9987a.setHasOverlappingRendering(true);
        } else if (Z.K.p(i2, 2)) {
            this.f9987a.setLayerType(0);
            this.f9987a.setHasOverlappingRendering(false);
        } else {
            this.f9987a.setLayerType(0);
            this.f9987a.setHasOverlappingRendering(true);
        }
    }

    @Override // s0.InterfaceC1148i0
    public final void D(float f4) {
        this.f9987a.setPivotX(f4);
    }

    @Override // s0.InterfaceC1148i0
    public final void E(boolean z4) {
        this.f9992f = z4;
        this.f9987a.setClipToBounds(z4);
    }

    @Override // s0.InterfaceC1148i0
    public final void F(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            H0.f10054a.d(this.f9987a, i2);
        }
    }

    @Override // s0.InterfaceC1148i0
    public final boolean G(int i2, int i4, int i5, int i6) {
        this.f9988b = i2;
        this.f9989c = i4;
        this.f9990d = i5;
        this.f9991e = i6;
        return this.f9987a.setLeftTopRightBottom(i2, i4, i5, i6);
    }

    @Override // s0.InterfaceC1148i0
    public final boolean H() {
        return this.f9987a.setHasOverlappingRendering(true);
    }

    @Override // s0.InterfaceC1148i0
    public final void I(Matrix matrix) {
        this.f9987a.getMatrix(matrix);
    }

    @Override // s0.InterfaceC1148i0
    public final float J() {
        return this.f9987a.getElevation();
    }

    @Override // s0.InterfaceC1148i0
    public final void K(C0321s c0321s, Z.J j4, C1160o0 c1160o0) {
        DisplayListCanvas start = this.f9987a.start(g(), j());
        Canvas u4 = c0321s.a().u();
        c0321s.a().v((Canvas) start);
        C0306c a4 = c0321s.a();
        if (j4 != null) {
            a4.g();
            a4.k(j4, 1);
        }
        c1160o0.invoke(a4);
        if (j4 != null) {
            a4.b();
        }
        c0321s.a().v(u4);
        this.f9987a.end(start);
    }

    @Override // s0.InterfaceC1148i0
    public final void L(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            H0.f10054a.c(this.f9987a, i2);
        }
    }

    @Override // s0.InterfaceC1148i0
    public final float a() {
        return this.f9987a.getAlpha();
    }

    @Override // s0.InterfaceC1148i0
    public final void b(float f4) {
        this.f9987a.setRotationY(f4);
    }

    @Override // s0.InterfaceC1148i0
    public final void c(float f4) {
        this.f9987a.setTranslationX(f4);
    }

    @Override // s0.InterfaceC1148i0
    public final void d(float f4) {
        this.f9987a.setAlpha(f4);
    }

    @Override // s0.InterfaceC1148i0
    public final void e(float f4) {
        this.f9987a.setScaleY(f4);
    }

    @Override // s0.InterfaceC1148i0
    public final int f() {
        return this.f9990d;
    }

    @Override // s0.InterfaceC1148i0
    public final int g() {
        return this.f9990d - this.f9988b;
    }

    @Override // s0.InterfaceC1148i0
    public final void h() {
    }

    @Override // s0.InterfaceC1148i0
    public final int i() {
        return this.f9988b;
    }

    @Override // s0.InterfaceC1148i0
    public final int j() {
        return this.f9991e - this.f9989c;
    }

    @Override // s0.InterfaceC1148i0
    public final void k(float f4) {
        this.f9987a.setRotation(f4);
    }

    @Override // s0.InterfaceC1148i0
    public final void l(float f4) {
        this.f9987a.setTranslationY(f4);
    }

    @Override // s0.InterfaceC1148i0
    public final void m(float f4) {
        this.f9987a.setCameraDistance(-f4);
    }

    @Override // s0.InterfaceC1148i0
    public final boolean n() {
        return this.f9987a.isValid();
    }

    @Override // s0.InterfaceC1148i0
    public final void o(Outline outline) {
        this.f9987a.setOutline(outline);
    }

    @Override // s0.InterfaceC1148i0
    public final void p(float f4) {
        this.f9987a.setScaleX(f4);
    }

    @Override // s0.InterfaceC1148i0
    public final void q(float f4) {
        this.f9987a.setRotationX(f4);
    }

    @Override // s0.InterfaceC1148i0
    public final void r() {
        G0.f10052a.a(this.f9987a);
    }

    @Override // s0.InterfaceC1148i0
    public final void s(float f4) {
        this.f9987a.setPivotY(f4);
    }

    @Override // s0.InterfaceC1148i0
    public final void t(float f4) {
        this.f9987a.setElevation(f4);
    }

    @Override // s0.InterfaceC1148i0
    public final void u(int i2) {
        this.f9988b += i2;
        this.f9990d += i2;
        this.f9987a.offsetLeftAndRight(i2);
    }

    @Override // s0.InterfaceC1148i0
    public final int v() {
        return this.f9991e;
    }

    @Override // s0.InterfaceC1148i0
    public final boolean w() {
        return this.f9987a.getClipToOutline();
    }

    @Override // s0.InterfaceC1148i0
    public final void x(int i2) {
        this.f9989c += i2;
        this.f9991e += i2;
        this.f9987a.offsetTopAndBottom(i2);
    }

    @Override // s0.InterfaceC1148i0
    public final boolean y() {
        return this.f9992f;
    }

    @Override // s0.InterfaceC1148i0
    public final void z(Canvas canvas) {
        ((DisplayListCanvas) canvas).drawRenderNode(this.f9987a);
    }
}
