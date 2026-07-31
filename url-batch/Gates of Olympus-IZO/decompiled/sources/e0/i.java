package e0;

import F.C0047j0;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import b0.AbstractC0259J;
import b0.AbstractC0272e;
import b0.C0271d;
import b0.C0286s;
import b0.C0288u;
import b0.InterfaceC0285r;
import d0.C0321b;
import f0.AbstractC0384a;

/* loaded from: classes.dex */
public final class i implements d {

    /* renamed from: A, reason: collision with root package name */
    public static final h f4543A = new h();

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0384a f4544b;

    /* renamed from: c, reason: collision with root package name */
    public final C0286s f4545c;

    /* renamed from: d, reason: collision with root package name */
    public final o f4546d;

    /* renamed from: e, reason: collision with root package name */
    public final Resources f4547e;

    /* renamed from: f, reason: collision with root package name */
    public final Rect f4548f;

    /* renamed from: g, reason: collision with root package name */
    public int f4549g;

    /* renamed from: h, reason: collision with root package name */
    public int f4550h;

    /* renamed from: i, reason: collision with root package name */
    public long f4551i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4552j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4553k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4554l;

    /* renamed from: m, reason: collision with root package name */
    public final int f4555m;

    /* renamed from: n, reason: collision with root package name */
    public int f4556n;

    /* renamed from: o, reason: collision with root package name */
    public float f4557o;
    public boolean p;

    /* renamed from: q, reason: collision with root package name */
    public float f4558q;

    /* renamed from: r, reason: collision with root package name */
    public float f4559r;

    /* renamed from: s, reason: collision with root package name */
    public float f4560s;

    /* renamed from: t, reason: collision with root package name */
    public float f4561t;

    /* renamed from: u, reason: collision with root package name */
    public float f4562u;

    /* renamed from: v, reason: collision with root package name */
    public long f4563v;

    /* renamed from: w, reason: collision with root package name */
    public long f4564w;

    /* renamed from: x, reason: collision with root package name */
    public float f4565x;

    /* renamed from: y, reason: collision with root package name */
    public float f4566y;

    /* renamed from: z, reason: collision with root package name */
    public float f4567z;

    public i(AbstractC0384a abstractC0384a) {
        C0286s c0286s = new C0286s();
        C0321b c0321b = new C0321b();
        this.f4544b = abstractC0384a;
        this.f4545c = c0286s;
        o oVar = new o(abstractC0384a, c0286s, c0321b);
        this.f4546d = oVar;
        this.f4547e = abstractC0384a.getResources();
        this.f4548f = new Rect();
        abstractC0384a.addView(oVar);
        oVar.setClipBounds(null);
        this.f4551i = 0L;
        View.generateViewId();
        this.f4555m = 3;
        this.f4556n = 0;
        this.f4557o = 1.0f;
        this.f4558q = 1.0f;
        this.f4559r = 1.0f;
        long j3 = C0288u.f4292b;
        this.f4563v = j3;
        this.f4564w = j3;
    }

    @Override // e0.d
    public final float A() {
        return this.f4562u;
    }

    @Override // e0.d
    public final void B(Outline outline, long j3) {
        o oVar = this.f4546d;
        oVar.f4578h = outline;
        oVar.invalidateOutline();
        if (h() && outline != null) {
            oVar.setClipToOutline(true);
            if (this.f4554l) {
                this.f4554l = false;
                this.f4552j = true;
            }
        }
        this.f4553k = outline != null;
    }

    @Override // e0.d
    public final float C() {
        return this.f4559r;
    }

    @Override // e0.d
    public final float D() {
        return this.f4546d.getCameraDistance() / this.f4547e.getDisplayMetrics().densityDpi;
    }

    @Override // e0.d
    public final float E() {
        return this.f4567z;
    }

    @Override // e0.d
    public final int F() {
        return this.f4555m;
    }

    @Override // e0.d
    public final void G(long j3) {
        boolean F3 = I2.l.F(j3);
        o oVar = this.f4546d;
        if (!F3) {
            this.p = false;
            oVar.setPivotX(a0.c.d(j3));
            oVar.setPivotY(a0.c.e(j3));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                oVar.resetPivot();
                return;
            }
            this.p = true;
            oVar.setPivotX(((int) (this.f4551i >> 32)) / 2.0f);
            oVar.setPivotY(((int) (this.f4551i & 4294967295L)) / 2.0f);
        }
    }

    @Override // e0.d
    public final long H() {
        return this.f4563v;
    }

    @Override // e0.d
    public final float I() {
        return this.f4560s;
    }

    @Override // e0.d
    public final void J(boolean z3) {
        boolean z4 = false;
        this.f4554l = z3 && !this.f4553k;
        this.f4552j = true;
        if (z3 && this.f4553k) {
            z4 = true;
        }
        this.f4546d.setClipToOutline(z4);
    }

    @Override // e0.d
    public final int K() {
        return this.f4556n;
    }

    @Override // e0.d
    public final void L(M0.b bVar, M0.j jVar, C0336b c0336b, C0047j0 c0047j0) {
        o oVar = this.f4546d;
        ViewParent parent = oVar.getParent();
        AbstractC0384a abstractC0384a = this.f4544b;
        if (parent == null) {
            abstractC0384a.addView(oVar);
        }
        oVar.f4580j = bVar;
        oVar.f4581k = jVar;
        oVar.f4582l = c0047j0;
        oVar.f4583m = c0336b;
        if (oVar.isAttachedToWindow()) {
            oVar.setVisibility(4);
            oVar.setVisibility(0);
            try {
                C0286s c0286s = this.f4545c;
                h hVar = f4543A;
                C0271d c0271d = c0286s.f4290a;
                Canvas canvas = c0271d.f4263a;
                c0271d.f4263a = hVar;
                abstractC0384a.a(c0271d, oVar, oVar.getDrawingTime());
                c0286s.f4290a.f4263a = canvas;
            } catch (Throwable unused) {
            }
        }
    }

    @Override // e0.d
    public final float M() {
        return this.f4565x;
    }

    @Override // e0.d
    public final float a() {
        return this.f4557o;
    }

    @Override // e0.d
    public final void b(float f3) {
        this.f4566y = f3;
        this.f4546d.setRotationY(f3);
    }

    @Override // e0.d
    public final void c(float f3) {
        this.f4560s = f3;
        this.f4546d.setTranslationX(f3);
    }

    @Override // e0.d
    public final void d(float f3) {
        this.f4557o = f3;
        this.f4546d.setAlpha(f3);
    }

    @Override // e0.d
    public final void e(float f3) {
        this.f4559r = f3;
        this.f4546d.setScaleY(f3);
    }

    public final void f(int i3) {
        boolean z3 = true;
        boolean x3 = I2.l.x(i3, 1);
        o oVar = this.f4546d;
        if (x3) {
            oVar.setLayerType(2, null);
        } else if (I2.l.x(i3, 2)) {
            oVar.setLayerType(0, null);
            z3 = false;
        } else {
            oVar.setLayerType(0, null);
        }
        oVar.setCanUseCompositingLayer$ui_graphics_release(z3);
    }

    @Override // e0.d
    public final void g() {
        if (Build.VERSION.SDK_INT >= 31) {
            this.f4546d.setRenderEffect(null);
        }
    }

    public final boolean h() {
        return this.f4554l || this.f4546d.getClipToOutline();
    }

    @Override // e0.d
    public final void i(float f3) {
        this.f4567z = f3;
        this.f4546d.setRotation(f3);
    }

    @Override // e0.d
    public final void j(float f3) {
        this.f4561t = f3;
        this.f4546d.setTranslationY(f3);
    }

    @Override // e0.d
    public final void k(float f3) {
        this.f4546d.setCameraDistance(f3 * this.f4547e.getDisplayMetrics().densityDpi);
    }

    @Override // e0.d
    public final void m(float f3) {
        this.f4558q = f3;
        this.f4546d.setScaleX(f3);
    }

    @Override // e0.d
    public final void n(float f3) {
        this.f4565x = f3;
        this.f4546d.setRotationX(f3);
    }

    @Override // e0.d
    public final void o() {
        this.f4544b.removeViewInLayout(this.f4546d);
    }

    @Override // e0.d
    public final void p(int i3) {
        this.f4556n = i3;
        if (I2.l.x(i3, 1) || !AbstractC0259J.n(this.f4555m, 3)) {
            f(1);
        } else {
            f(this.f4556n);
        }
    }

    @Override // e0.d
    public final void q(long j3) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f4564w = j3;
            this.f4546d.setOutlineSpotShadowColor(AbstractC0259J.E(j3));
        }
    }

    @Override // e0.d
    public final void r(InterfaceC0285r interfaceC0285r) {
        Rect rect;
        boolean z3 = this.f4552j;
        o oVar = this.f4546d;
        if (z3) {
            if (!h() || this.f4553k) {
                rect = null;
            } else {
                rect = this.f4548f;
                rect.left = 0;
                rect.top = 0;
                rect.right = oVar.getWidth();
                rect.bottom = oVar.getHeight();
            }
            oVar.setClipBounds(rect);
        }
        if (AbstractC0272e.a(interfaceC0285r).isHardwareAccelerated()) {
            this.f4544b.a(interfaceC0285r, oVar, oVar.getDrawingTime());
        }
    }

    @Override // e0.d
    public final float s() {
        return this.f4558q;
    }

    @Override // e0.d
    public final Matrix t() {
        return this.f4546d.getMatrix();
    }

    @Override // e0.d
    public final void u(float f3) {
        this.f4562u = f3;
        this.f4546d.setElevation(f3);
    }

    @Override // e0.d
    public final float v() {
        return this.f4561t;
    }

    @Override // e0.d
    public final void w(int i3, int i4, long j3) {
        boolean a3 = M0.i.a(this.f4551i, j3);
        o oVar = this.f4546d;
        if (a3) {
            int i5 = this.f4549g;
            if (i5 != i3) {
                oVar.offsetLeftAndRight(i3 - i5);
            }
            int i6 = this.f4550h;
            if (i6 != i4) {
                oVar.offsetTopAndBottom(i4 - i6);
            }
        } else {
            if (h()) {
                this.f4552j = true;
            }
            int i7 = (int) (j3 >> 32);
            int i8 = (int) (4294967295L & j3);
            oVar.layout(i3, i4, i3 + i7, i4 + i8);
            this.f4551i = j3;
            if (this.p) {
                oVar.setPivotX(i7 / 2.0f);
                oVar.setPivotY(i8 / 2.0f);
            }
        }
        this.f4549g = i3;
        this.f4550h = i4;
    }

    @Override // e0.d
    public final float x() {
        return this.f4566y;
    }

    @Override // e0.d
    public final long y() {
        return this.f4564w;
    }

    @Override // e0.d
    public final void z(long j3) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f4563v = j3;
            this.f4546d.setOutlineAmbientShadowColor(AbstractC0259J.E(j3));
        }
    }
}
