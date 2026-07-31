package e0;

import D1.C0014b;
import F.C0047j0;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import b0.AbstractC0259J;
import b0.AbstractC0272e;
import b0.C0271d;
import b0.C0286s;
import b0.C0288u;
import b0.InterfaceC0285r;
import d0.C0321b;
import java.util.concurrent.atomic.AtomicBoolean;
import u0.C0997t;

/* loaded from: classes.dex */
public final class e implements d {

    /* renamed from: A, reason: collision with root package name */
    public static final AtomicBoolean f4496A = new AtomicBoolean(true);

    /* renamed from: b, reason: collision with root package name */
    public final C0286s f4497b;

    /* renamed from: c, reason: collision with root package name */
    public final C0321b f4498c;

    /* renamed from: d, reason: collision with root package name */
    public final RenderNode f4499d;

    /* renamed from: e, reason: collision with root package name */
    public long f4500e;

    /* renamed from: f, reason: collision with root package name */
    public Matrix f4501f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4502g;

    /* renamed from: h, reason: collision with root package name */
    public long f4503h;

    /* renamed from: i, reason: collision with root package name */
    public int f4504i;

    /* renamed from: j, reason: collision with root package name */
    public final int f4505j;

    /* renamed from: k, reason: collision with root package name */
    public float f4506k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4507l;

    /* renamed from: m, reason: collision with root package name */
    public float f4508m;

    /* renamed from: n, reason: collision with root package name */
    public float f4509n;

    /* renamed from: o, reason: collision with root package name */
    public float f4510o;
    public float p;

    /* renamed from: q, reason: collision with root package name */
    public float f4511q;

    /* renamed from: r, reason: collision with root package name */
    public long f4512r;

    /* renamed from: s, reason: collision with root package name */
    public long f4513s;

    /* renamed from: t, reason: collision with root package name */
    public float f4514t;

    /* renamed from: u, reason: collision with root package name */
    public float f4515u;

    /* renamed from: v, reason: collision with root package name */
    public float f4516v;

    /* renamed from: w, reason: collision with root package name */
    public float f4517w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f4518x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f4519y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f4520z;

    public e(C0997t c0997t, C0286s c0286s, C0321b c0321b) {
        this.f4497b = c0286s;
        this.f4498c = c0321b;
        RenderNode create = RenderNode.create("Compose", c0997t);
        this.f4499d = create;
        this.f4500e = 0L;
        this.f4503h = 0L;
        if (f4496A.getAndSet(false)) {
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
                m mVar = m.f4571a;
                mVar.c(create, mVar.a(create));
                mVar.d(create, mVar.b(create));
            }
            l.f4570a.a(create);
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
        }
        create.setClipToBounds(false);
        h(0);
        this.f4504i = 0;
        this.f4505j = 3;
        this.f4506k = 1.0f;
        this.f4508m = 1.0f;
        this.f4509n = 1.0f;
        int i3 = C0288u.f4297g;
        this.f4512r = AbstractC0259J.s();
        this.f4513s = AbstractC0259J.s();
        this.f4517w = 8.0f;
    }

    @Override // e0.d
    public final float A() {
        return this.f4511q;
    }

    @Override // e0.d
    public final void B(Outline outline, long j3) {
        this.f4503h = j3;
        this.f4499d.setOutline(outline);
        this.f4502g = outline != null;
        f();
    }

    @Override // e0.d
    public final float C() {
        return this.f4509n;
    }

    @Override // e0.d
    public final float D() {
        return this.f4517w;
    }

    @Override // e0.d
    public final float E() {
        return this.f4516v;
    }

    @Override // e0.d
    public final int F() {
        return this.f4505j;
    }

    @Override // e0.d
    public final void G(long j3) {
        if (I2.l.F(j3)) {
            this.f4507l = true;
            this.f4499d.setPivotX(M0.i.c(this.f4500e) / 2.0f);
            this.f4499d.setPivotY(M0.i.b(this.f4500e) / 2.0f);
        } else {
            this.f4507l = false;
            this.f4499d.setPivotX(a0.c.d(j3));
            this.f4499d.setPivotY(a0.c.e(j3));
        }
    }

    @Override // e0.d
    public final long H() {
        return this.f4512r;
    }

    @Override // e0.d
    public final float I() {
        return this.f4510o;
    }

    @Override // e0.d
    public final void J(boolean z3) {
        this.f4518x = z3;
        f();
    }

    @Override // e0.d
    public final int K() {
        return this.f4504i;
    }

    @Override // e0.d
    public final void L(M0.b bVar, M0.j jVar, C0336b c0336b, C0047j0 c0047j0) {
        Canvas start = this.f4499d.start(Math.max(M0.i.c(this.f4500e), M0.i.c(this.f4503h)), Math.max(M0.i.b(this.f4500e), M0.i.b(this.f4503h)));
        try {
            C0286s c0286s = this.f4497b;
            Canvas t3 = c0286s.a().t();
            c0286s.a().u(start);
            C0271d a3 = c0286s.a();
            C0321b c0321b = this.f4498c;
            long R2 = I2.l.R(this.f4500e);
            M0.b j3 = c0321b.P().j();
            M0.j l3 = c0321b.P().l();
            InterfaceC0285r h3 = c0321b.P().h();
            long m3 = c0321b.P().m();
            C0336b k3 = c0321b.P().k();
            C0014b P2 = c0321b.P();
            P2.v(bVar);
            P2.x(jVar);
            P2.u(a3);
            P2.y(R2);
            P2.w(c0336b);
            a3.f();
            try {
                c0047j0.j(c0321b);
                a3.a();
                C0014b P3 = c0321b.P();
                P3.v(j3);
                P3.x(l3);
                P3.u(h3);
                P3.y(m3);
                P3.w(k3);
                c0286s.a().u(t3);
            } catch (Throwable th) {
                a3.a();
                C0014b P4 = c0321b.P();
                P4.v(j3);
                P4.x(l3);
                P4.u(h3);
                P4.y(m3);
                P4.w(k3);
                throw th;
            }
        } finally {
            this.f4499d.end(start);
        }
    }

    @Override // e0.d
    public final float M() {
        return this.f4514t;
    }

    @Override // e0.d
    public final float a() {
        return this.f4506k;
    }

    @Override // e0.d
    public final void b(float f3) {
        this.f4515u = f3;
        this.f4499d.setRotationY(f3);
    }

    @Override // e0.d
    public final void c(float f3) {
        this.f4510o = f3;
        this.f4499d.setTranslationX(f3);
    }

    @Override // e0.d
    public final void d(float f3) {
        this.f4506k = f3;
        this.f4499d.setAlpha(f3);
    }

    @Override // e0.d
    public final void e(float f3) {
        this.f4509n = f3;
        this.f4499d.setScaleY(f3);
    }

    public final void f() {
        boolean z3 = this.f4518x;
        boolean z4 = false;
        boolean z5 = z3 && !this.f4502g;
        if (z3 && this.f4502g) {
            z4 = true;
        }
        if (z5 != this.f4519y) {
            this.f4519y = z5;
            this.f4499d.setClipToBounds(z5);
        }
        if (z4 != this.f4520z) {
            this.f4520z = z4;
            this.f4499d.setClipToOutline(z4);
        }
    }

    public final void h(int i3) {
        RenderNode renderNode = this.f4499d;
        if (I2.l.x(i3, 1)) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(true);
        } else if (I2.l.x(i3, 2)) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // e0.d
    public final void i(float f3) {
        this.f4516v = f3;
        this.f4499d.setRotation(f3);
    }

    @Override // e0.d
    public final void j(float f3) {
        this.p = f3;
        this.f4499d.setTranslationY(f3);
    }

    @Override // e0.d
    public final void k(float f3) {
        this.f4517w = f3;
        this.f4499d.setCameraDistance(-f3);
    }

    @Override // e0.d
    public final boolean l() {
        return this.f4499d.isValid();
    }

    @Override // e0.d
    public final void m(float f3) {
        this.f4508m = f3;
        this.f4499d.setScaleX(f3);
    }

    @Override // e0.d
    public final void n(float f3) {
        this.f4514t = f3;
        this.f4499d.setRotationX(f3);
    }

    @Override // e0.d
    public final void o() {
        l.f4570a.a(this.f4499d);
    }

    @Override // e0.d
    public final void p(int i3) {
        this.f4504i = i3;
        if (I2.l.x(i3, 1) || !AbstractC0259J.n(this.f4505j, 3)) {
            h(1);
        } else {
            h(this.f4504i);
        }
    }

    @Override // e0.d
    public final void q(long j3) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f4513s = j3;
            m.f4571a.d(this.f4499d, AbstractC0259J.E(j3));
        }
    }

    @Override // e0.d
    public final void r(InterfaceC0285r interfaceC0285r) {
        DisplayListCanvas a3 = AbstractC0272e.a(interfaceC0285r);
        Z1.i.d(a3, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        a3.drawRenderNode(this.f4499d);
    }

    @Override // e0.d
    public final float s() {
        return this.f4508m;
    }

    @Override // e0.d
    public final Matrix t() {
        Matrix matrix = this.f4501f;
        if (matrix == null) {
            matrix = new Matrix();
            this.f4501f = matrix;
        }
        this.f4499d.getMatrix(matrix);
        return matrix;
    }

    @Override // e0.d
    public final void u(float f3) {
        this.f4511q = f3;
        this.f4499d.setElevation(f3);
    }

    @Override // e0.d
    public final float v() {
        return this.p;
    }

    @Override // e0.d
    public final void w(int i3, int i4, long j3) {
        this.f4499d.setLeftTopRightBottom(i3, i4, M0.i.c(j3) + i3, M0.i.b(j3) + i4);
        if (M0.i.a(this.f4500e, j3)) {
            return;
        }
        if (this.f4507l) {
            this.f4499d.setPivotX(M0.i.c(j3) / 2.0f);
            this.f4499d.setPivotY(M0.i.b(j3) / 2.0f);
        }
        this.f4500e = j3;
    }

    @Override // e0.d
    public final float x() {
        return this.f4515u;
    }

    @Override // e0.d
    public final long y() {
        return this.f4513s;
    }

    @Override // e0.d
    public final void z(long j3) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f4512r = j3;
            m.f4571a.c(this.f4499d, AbstractC0259J.E(j3));
        }
    }

    @Override // e0.d
    public final void g() {
    }
}
