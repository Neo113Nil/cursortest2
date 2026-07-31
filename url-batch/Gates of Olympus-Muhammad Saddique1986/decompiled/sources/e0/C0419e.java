package e0;

import a0.C0238c;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import b0.AbstractC0335d;
import b0.C0334c;
import b0.C0349s;
import b0.C0352v;
import b0.M;
import b0.r;
import d0.C0401b;
import h2.AbstractC0508a;
import java.util.concurrent.atomic.AtomicBoolean;
import u0.C1123s;

/* renamed from: e0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0419e implements InterfaceC0418d {

    /* renamed from: A, reason: collision with root package name */
    public static final AtomicBoolean f5719A = new AtomicBoolean(true);

    /* renamed from: b, reason: collision with root package name */
    public final C0349s f5720b;

    /* renamed from: c, reason: collision with root package name */
    public final C0401b f5721c;

    /* renamed from: d, reason: collision with root package name */
    public final RenderNode f5722d;

    /* renamed from: e, reason: collision with root package name */
    public long f5723e;

    /* renamed from: f, reason: collision with root package name */
    public Matrix f5724f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5725g;

    /* renamed from: h, reason: collision with root package name */
    public long f5726h;

    /* renamed from: i, reason: collision with root package name */
    public int f5727i;

    /* renamed from: j, reason: collision with root package name */
    public final int f5728j;

    /* renamed from: k, reason: collision with root package name */
    public float f5729k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f5730l;

    /* renamed from: m, reason: collision with root package name */
    public float f5731m;

    /* renamed from: n, reason: collision with root package name */
    public float f5732n;

    /* renamed from: o, reason: collision with root package name */
    public float f5733o;

    /* renamed from: p, reason: collision with root package name */
    public float f5734p;

    /* renamed from: q, reason: collision with root package name */
    public float f5735q;

    /* renamed from: r, reason: collision with root package name */
    public long f5736r;

    /* renamed from: s, reason: collision with root package name */
    public long f5737s;

    /* renamed from: t, reason: collision with root package name */
    public float f5738t;

    /* renamed from: u, reason: collision with root package name */
    public float f5739u;

    /* renamed from: v, reason: collision with root package name */
    public float f5740v;

    /* renamed from: w, reason: collision with root package name */
    public float f5741w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f5742x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f5743y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f5744z;

    public C0419e(C1123s c1123s, C0349s c0349s, C0401b c0401b) {
        this.f5720b = c0349s;
        this.f5721c = c0401b;
        RenderNode create = RenderNode.create("Compose", c1123s);
        this.f5722d = create;
        this.f5723e = 0L;
        this.f5726h = 0L;
        if (f5719A.getAndSet(false)) {
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
                m mVar = m.f5797a;
                mVar.c(create, mVar.a(create));
                mVar.d(create, mVar.b(create));
            }
            l.f5796a.a(create);
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
        }
        create.setClipToBounds(false);
        h(0);
        this.f5727i = 0;
        this.f5728j = 3;
        this.f5729k = 1.0f;
        this.f5731m = 1.0f;
        this.f5732n = 1.0f;
        int i3 = C0352v.f5440h;
        this.f5736r = M.u();
        this.f5737s = M.u();
        this.f5741w = 8.0f;
    }

    @Override // e0.InterfaceC0418d
    public final float A() {
        return this.f5735q;
    }

    @Override // e0.InterfaceC0418d
    public final void B(Outline outline, long j3) {
        this.f5726h = j3;
        this.f5722d.setOutline(outline);
        this.f5725g = outline != null;
        f();
    }

    @Override // e0.InterfaceC0418d
    public final void C(O0.b bVar, O0.k kVar, C0416b c0416b, A0.l lVar) {
        Canvas start = this.f5722d.start(Math.max(O0.j.c(this.f5723e), O0.j.c(this.f5726h)), Math.max(O0.j.b(this.f5723e), O0.j.b(this.f5726h)));
        try {
            C0349s c0349s = this.f5720b;
            Canvas u3 = c0349s.a().u();
            c0349s.a().v(start);
            C0334c a3 = c0349s.a();
            C0401b c0401b = this.f5721c;
            long f02 = O2.d.f0(this.f5723e);
            O0.b j3 = c0401b.S().j();
            O0.k m3 = c0401b.S().m();
            r h3 = c0401b.S().h();
            long n3 = c0401b.S().n();
            C0416b k3 = c0401b.S().k();
            G1.m S3 = c0401b.S();
            S3.w(bVar);
            S3.y(kVar);
            S3.v(a3);
            S3.z(f02);
            S3.x(c0416b);
            a3.f();
            try {
                lVar.n(c0401b);
                a3.a();
                G1.m S4 = c0401b.S();
                S4.w(j3);
                S4.y(m3);
                S4.v(h3);
                S4.z(n3);
                S4.x(k3);
                c0349s.a().v(u3);
            } catch (Throwable th) {
                a3.a();
                G1.m S5 = c0401b.S();
                S5.w(j3);
                S5.y(m3);
                S5.v(h3);
                S5.z(n3);
                S5.x(k3);
                throw th;
            }
        } finally {
            this.f5722d.end(start);
        }
    }

    @Override // e0.InterfaceC0418d
    public final float D() {
        return this.f5732n;
    }

    @Override // e0.InterfaceC0418d
    public final float E() {
        return this.f5741w;
    }

    @Override // e0.InterfaceC0418d
    public final float F() {
        return this.f5740v;
    }

    @Override // e0.InterfaceC0418d
    public final int G() {
        return this.f5728j;
    }

    @Override // e0.InterfaceC0418d
    public final void H(long j3) {
        if (l0.c.E(j3)) {
            this.f5730l = true;
            this.f5722d.setPivotX(O0.j.c(this.f5723e) / 2.0f);
            this.f5722d.setPivotY(O0.j.b(this.f5723e) / 2.0f);
        } else {
            this.f5730l = false;
            this.f5722d.setPivotX(C0238c.d(j3));
            this.f5722d.setPivotY(C0238c.e(j3));
        }
    }

    @Override // e0.InterfaceC0418d
    public final long I() {
        return this.f5736r;
    }

    @Override // e0.InterfaceC0418d
    public final float J() {
        return this.f5733o;
    }

    @Override // e0.InterfaceC0418d
    public final void K(boolean z3) {
        this.f5742x = z3;
        f();
    }

    @Override // e0.InterfaceC0418d
    public final int L() {
        return this.f5727i;
    }

    @Override // e0.InterfaceC0418d
    public final float M() {
        return this.f5738t;
    }

    @Override // e0.InterfaceC0418d
    public final float a() {
        return this.f5729k;
    }

    @Override // e0.InterfaceC0418d
    public final void b(float f3) {
        this.f5739u = f3;
        this.f5722d.setRotationY(f3);
    }

    @Override // e0.InterfaceC0418d
    public final void c(float f3) {
        this.f5733o = f3;
        this.f5722d.setTranslationX(f3);
    }

    @Override // e0.InterfaceC0418d
    public final void d(float f3) {
        this.f5729k = f3;
        this.f5722d.setAlpha(f3);
    }

    @Override // e0.InterfaceC0418d
    public final void e(float f3) {
        this.f5732n = f3;
        this.f5722d.setScaleY(f3);
    }

    public final void f() {
        boolean z3 = this.f5742x;
        boolean z4 = false;
        boolean z5 = z3 && !this.f5725g;
        if (z3 && this.f5725g) {
            z4 = true;
        }
        if (z5 != this.f5743y) {
            this.f5743y = z5;
            this.f5722d.setClipToBounds(z5);
        }
        if (z4 != this.f5744z) {
            this.f5744z = z4;
            this.f5722d.setClipToOutline(z4);
        }
    }

    public final void h(int i3) {
        RenderNode renderNode = this.f5722d;
        if (AbstractC0508a.x(i3, 1)) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(true);
        } else if (AbstractC0508a.x(i3, 2)) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // e0.InterfaceC0418d
    public final void i(float f3) {
        this.f5740v = f3;
        this.f5722d.setRotation(f3);
    }

    @Override // e0.InterfaceC0418d
    public final void j(float f3) {
        this.f5734p = f3;
        this.f5722d.setTranslationY(f3);
    }

    @Override // e0.InterfaceC0418d
    public final void k(float f3) {
        this.f5741w = f3;
        this.f5722d.setCameraDistance(-f3);
    }

    @Override // e0.InterfaceC0418d
    public final boolean l() {
        return this.f5722d.isValid();
    }

    @Override // e0.InterfaceC0418d
    public final void m(float f3) {
        this.f5731m = f3;
        this.f5722d.setScaleX(f3);
    }

    @Override // e0.InterfaceC0418d
    public final void n(float f3) {
        this.f5738t = f3;
        this.f5722d.setRotationX(f3);
    }

    @Override // e0.InterfaceC0418d
    public final void o() {
        l.f5796a.a(this.f5722d);
    }

    @Override // e0.InterfaceC0418d
    public final void p(int i3) {
        this.f5727i = i3;
        if (AbstractC0508a.x(i3, 1) || !M.p(this.f5728j, 3)) {
            h(1);
        } else {
            h(this.f5727i);
        }
    }

    @Override // e0.InterfaceC0418d
    public final void q(long j3) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f5737s = j3;
            m.f5797a.d(this.f5722d, M.D(j3));
        }
    }

    @Override // e0.InterfaceC0418d
    public final void r(r rVar) {
        DisplayListCanvas a3 = AbstractC0335d.a(rVar);
        f2.j.d(a3, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        a3.drawRenderNode(this.f5722d);
    }

    @Override // e0.InterfaceC0418d
    public final float s() {
        return this.f5731m;
    }

    @Override // e0.InterfaceC0418d
    public final Matrix t() {
        Matrix matrix = this.f5724f;
        if (matrix == null) {
            matrix = new Matrix();
            this.f5724f = matrix;
        }
        this.f5722d.getMatrix(matrix);
        return matrix;
    }

    @Override // e0.InterfaceC0418d
    public final void u(float f3) {
        this.f5735q = f3;
        this.f5722d.setElevation(f3);
    }

    @Override // e0.InterfaceC0418d
    public final float v() {
        return this.f5734p;
    }

    @Override // e0.InterfaceC0418d
    public final void w(int i3, int i4, long j3) {
        this.f5722d.setLeftTopRightBottom(i3, i4, O0.j.c(j3) + i3, O0.j.b(j3) + i4);
        if (O0.j.a(this.f5723e, j3)) {
            return;
        }
        if (this.f5730l) {
            this.f5722d.setPivotX(O0.j.c(j3) / 2.0f);
            this.f5722d.setPivotY(O0.j.b(j3) / 2.0f);
        }
        this.f5723e = j3;
    }

    @Override // e0.InterfaceC0418d
    public final float x() {
        return this.f5739u;
    }

    @Override // e0.InterfaceC0418d
    public final long y() {
        return this.f5737s;
    }

    @Override // e0.InterfaceC0418d
    public final void z(long j3) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f5736r = j3;
            m.f5797a.c(this.f5722d, M.D(j3));
        }
    }

    @Override // e0.InterfaceC0418d
    public final void g() {
    }
}
