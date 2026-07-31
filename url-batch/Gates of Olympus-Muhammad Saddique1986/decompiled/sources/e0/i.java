package e0;

import a0.C0238c;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import b0.AbstractC0335d;
import b0.C0334c;
import b0.C0349s;
import b0.C0352v;
import b0.M;
import b0.r;
import d0.C0401b;
import f0.AbstractC0431a;
import h2.AbstractC0508a;

/* loaded from: classes.dex */
public final class i implements InterfaceC0418d {

    /* renamed from: A, reason: collision with root package name */
    public static final h f5768A = new h();

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0431a f5769b;

    /* renamed from: c, reason: collision with root package name */
    public final C0349s f5770c;

    /* renamed from: d, reason: collision with root package name */
    public final o f5771d;

    /* renamed from: e, reason: collision with root package name */
    public final Resources f5772e;

    /* renamed from: f, reason: collision with root package name */
    public final Rect f5773f;

    /* renamed from: g, reason: collision with root package name */
    public int f5774g;

    /* renamed from: h, reason: collision with root package name */
    public int f5775h;

    /* renamed from: i, reason: collision with root package name */
    public long f5776i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f5777j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5778k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f5779l;

    /* renamed from: m, reason: collision with root package name */
    public final int f5780m;

    /* renamed from: n, reason: collision with root package name */
    public int f5781n;

    /* renamed from: o, reason: collision with root package name */
    public float f5782o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f5783p;

    /* renamed from: q, reason: collision with root package name */
    public float f5784q;

    /* renamed from: r, reason: collision with root package name */
    public float f5785r;

    /* renamed from: s, reason: collision with root package name */
    public float f5786s;

    /* renamed from: t, reason: collision with root package name */
    public float f5787t;

    /* renamed from: u, reason: collision with root package name */
    public float f5788u;

    /* renamed from: v, reason: collision with root package name */
    public long f5789v;

    /* renamed from: w, reason: collision with root package name */
    public long f5790w;

    /* renamed from: x, reason: collision with root package name */
    public float f5791x;

    /* renamed from: y, reason: collision with root package name */
    public float f5792y;

    /* renamed from: z, reason: collision with root package name */
    public float f5793z;

    public i(AbstractC0431a abstractC0431a) {
        C0349s c0349s = new C0349s();
        C0401b c0401b = new C0401b();
        this.f5769b = abstractC0431a;
        this.f5770c = c0349s;
        o oVar = new o(abstractC0431a, c0349s, c0401b);
        this.f5771d = oVar;
        this.f5772e = abstractC0431a.getResources();
        this.f5773f = new Rect();
        abstractC0431a.addView(oVar);
        oVar.setClipBounds(null);
        this.f5776i = 0L;
        View.generateViewId();
        this.f5780m = 3;
        this.f5781n = 0;
        this.f5782o = 1.0f;
        this.f5784q = 1.0f;
        this.f5785r = 1.0f;
        long j3 = C0352v.f5434b;
        this.f5789v = j3;
        this.f5790w = j3;
    }

    @Override // e0.InterfaceC0418d
    public final float A() {
        return this.f5788u;
    }

    @Override // e0.InterfaceC0418d
    public final void B(Outline outline, long j3) {
        o oVar = this.f5771d;
        oVar.f5804h = outline;
        oVar.invalidateOutline();
        if (h() && outline != null) {
            oVar.setClipToOutline(true);
            if (this.f5779l) {
                this.f5779l = false;
                this.f5777j = true;
            }
        }
        this.f5778k = outline != null;
    }

    @Override // e0.InterfaceC0418d
    public final void C(O0.b bVar, O0.k kVar, C0416b c0416b, A0.l lVar) {
        o oVar = this.f5771d;
        ViewParent parent = oVar.getParent();
        AbstractC0431a abstractC0431a = this.f5769b;
        if (parent == null) {
            abstractC0431a.addView(oVar);
        }
        oVar.f5806j = bVar;
        oVar.f5807k = kVar;
        oVar.f5808l = lVar;
        oVar.f5809m = c0416b;
        if (oVar.isAttachedToWindow()) {
            oVar.setVisibility(4);
            oVar.setVisibility(0);
            try {
                C0349s c0349s = this.f5770c;
                h hVar = f5768A;
                C0334c c0334c = c0349s.f5432a;
                Canvas canvas = c0334c.f5405a;
                c0334c.f5405a = hVar;
                abstractC0431a.a(c0334c, oVar, oVar.getDrawingTime());
                c0349s.f5432a.f5405a = canvas;
            } catch (Throwable unused) {
            }
        }
    }

    @Override // e0.InterfaceC0418d
    public final float D() {
        return this.f5785r;
    }

    @Override // e0.InterfaceC0418d
    public final float E() {
        return this.f5771d.getCameraDistance() / this.f5772e.getDisplayMetrics().densityDpi;
    }

    @Override // e0.InterfaceC0418d
    public final float F() {
        return this.f5793z;
    }

    @Override // e0.InterfaceC0418d
    public final int G() {
        return this.f5780m;
    }

    @Override // e0.InterfaceC0418d
    public final void H(long j3) {
        boolean E3 = l0.c.E(j3);
        o oVar = this.f5771d;
        if (!E3) {
            this.f5783p = false;
            oVar.setPivotX(C0238c.d(j3));
            oVar.setPivotY(C0238c.e(j3));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                oVar.resetPivot();
                return;
            }
            this.f5783p = true;
            oVar.setPivotX(((int) (this.f5776i >> 32)) / 2.0f);
            oVar.setPivotY(((int) (this.f5776i & 4294967295L)) / 2.0f);
        }
    }

    @Override // e0.InterfaceC0418d
    public final long I() {
        return this.f5789v;
    }

    @Override // e0.InterfaceC0418d
    public final float J() {
        return this.f5786s;
    }

    @Override // e0.InterfaceC0418d
    public final void K(boolean z3) {
        boolean z4 = false;
        this.f5779l = z3 && !this.f5778k;
        this.f5777j = true;
        if (z3 && this.f5778k) {
            z4 = true;
        }
        this.f5771d.setClipToOutline(z4);
    }

    @Override // e0.InterfaceC0418d
    public final int L() {
        return this.f5781n;
    }

    @Override // e0.InterfaceC0418d
    public final float M() {
        return this.f5791x;
    }

    @Override // e0.InterfaceC0418d
    public final float a() {
        return this.f5782o;
    }

    @Override // e0.InterfaceC0418d
    public final void b(float f3) {
        this.f5792y = f3;
        this.f5771d.setRotationY(f3);
    }

    @Override // e0.InterfaceC0418d
    public final void c(float f3) {
        this.f5786s = f3;
        this.f5771d.setTranslationX(f3);
    }

    @Override // e0.InterfaceC0418d
    public final void d(float f3) {
        this.f5782o = f3;
        this.f5771d.setAlpha(f3);
    }

    @Override // e0.InterfaceC0418d
    public final void e(float f3) {
        this.f5785r = f3;
        this.f5771d.setScaleY(f3);
    }

    public final void f(int i3) {
        boolean z3 = true;
        boolean x3 = AbstractC0508a.x(i3, 1);
        o oVar = this.f5771d;
        if (x3) {
            oVar.setLayerType(2, null);
        } else if (AbstractC0508a.x(i3, 2)) {
            oVar.setLayerType(0, null);
            z3 = false;
        } else {
            oVar.setLayerType(0, null);
        }
        oVar.setCanUseCompositingLayer$ui_graphics_release(z3);
    }

    @Override // e0.InterfaceC0418d
    public final void g() {
        if (Build.VERSION.SDK_INT >= 31) {
            this.f5771d.setRenderEffect(null);
        }
    }

    public final boolean h() {
        return this.f5779l || this.f5771d.getClipToOutline();
    }

    @Override // e0.InterfaceC0418d
    public final void i(float f3) {
        this.f5793z = f3;
        this.f5771d.setRotation(f3);
    }

    @Override // e0.InterfaceC0418d
    public final void j(float f3) {
        this.f5787t = f3;
        this.f5771d.setTranslationY(f3);
    }

    @Override // e0.InterfaceC0418d
    public final void k(float f3) {
        this.f5771d.setCameraDistance(f3 * this.f5772e.getDisplayMetrics().densityDpi);
    }

    @Override // e0.InterfaceC0418d
    public final void m(float f3) {
        this.f5784q = f3;
        this.f5771d.setScaleX(f3);
    }

    @Override // e0.InterfaceC0418d
    public final void n(float f3) {
        this.f5791x = f3;
        this.f5771d.setRotationX(f3);
    }

    @Override // e0.InterfaceC0418d
    public final void o() {
        this.f5769b.removeViewInLayout(this.f5771d);
    }

    @Override // e0.InterfaceC0418d
    public final void p(int i3) {
        this.f5781n = i3;
        if (AbstractC0508a.x(i3, 1) || !M.p(this.f5780m, 3)) {
            f(1);
        } else {
            f(this.f5781n);
        }
    }

    @Override // e0.InterfaceC0418d
    public final void q(long j3) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f5790w = j3;
            this.f5771d.setOutlineSpotShadowColor(M.D(j3));
        }
    }

    @Override // e0.InterfaceC0418d
    public final void r(r rVar) {
        Rect rect;
        boolean z3 = this.f5777j;
        o oVar = this.f5771d;
        if (z3) {
            if (!h() || this.f5778k) {
                rect = null;
            } else {
                rect = this.f5773f;
                rect.left = 0;
                rect.top = 0;
                rect.right = oVar.getWidth();
                rect.bottom = oVar.getHeight();
            }
            oVar.setClipBounds(rect);
        }
        if (AbstractC0335d.a(rVar).isHardwareAccelerated()) {
            this.f5769b.a(rVar, oVar, oVar.getDrawingTime());
        }
    }

    @Override // e0.InterfaceC0418d
    public final float s() {
        return this.f5784q;
    }

    @Override // e0.InterfaceC0418d
    public final Matrix t() {
        return this.f5771d.getMatrix();
    }

    @Override // e0.InterfaceC0418d
    public final void u(float f3) {
        this.f5788u = f3;
        this.f5771d.setElevation(f3);
    }

    @Override // e0.InterfaceC0418d
    public final float v() {
        return this.f5787t;
    }

    @Override // e0.InterfaceC0418d
    public final void w(int i3, int i4, long j3) {
        boolean a3 = O0.j.a(this.f5776i, j3);
        o oVar = this.f5771d;
        if (a3) {
            int i5 = this.f5774g;
            if (i5 != i3) {
                oVar.offsetLeftAndRight(i3 - i5);
            }
            int i6 = this.f5775h;
            if (i6 != i4) {
                oVar.offsetTopAndBottom(i4 - i6);
            }
        } else {
            if (h()) {
                this.f5777j = true;
            }
            int i7 = (int) (j3 >> 32);
            int i8 = (int) (4294967295L & j3);
            oVar.layout(i3, i4, i3 + i7, i4 + i8);
            this.f5776i = j3;
            if (this.f5783p) {
                oVar.setPivotX(i7 / 2.0f);
                oVar.setPivotY(i8 / 2.0f);
            }
        }
        this.f5774g = i3;
        this.f5775h = i4;
    }

    @Override // e0.InterfaceC0418d
    public final float x() {
        return this.f5792y;
    }

    @Override // e0.InterfaceC0418d
    public final long y() {
        return this.f5790w;
    }

    @Override // e0.InterfaceC0418d
    public final void z(long j3) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f5789v = j3;
            this.f5771d.setOutlineAmbientShadowColor(M.D(j3));
        }
    }
}
