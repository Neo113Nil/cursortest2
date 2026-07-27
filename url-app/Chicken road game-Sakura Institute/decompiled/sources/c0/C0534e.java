package c0;

import B1.C0097d;
import Z.AbstractC0307d;
import Z.C0306c;
import Z.C0321s;
import Z.C0323u;
import Z.K;
import Z.r;
import a.AbstractC0345a;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import b0.C0494b;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s0.C1166s;

/* renamed from: c0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0534e implements InterfaceC0533d {

    /* renamed from: z, reason: collision with root package name */
    public static final AtomicBoolean f5747z = new AtomicBoolean(true);

    /* renamed from: b, reason: collision with root package name */
    public final C0321s f5748b;

    /* renamed from: c, reason: collision with root package name */
    public final C0494b f5749c;

    /* renamed from: d, reason: collision with root package name */
    public final RenderNode f5750d;

    /* renamed from: e, reason: collision with root package name */
    public long f5751e;

    /* renamed from: f, reason: collision with root package name */
    public Matrix f5752f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5753g;

    /* renamed from: h, reason: collision with root package name */
    public int f5754h;

    /* renamed from: i, reason: collision with root package name */
    public final int f5755i;

    /* renamed from: j, reason: collision with root package name */
    public float f5756j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5757k;

    /* renamed from: l, reason: collision with root package name */
    public float f5758l;

    /* renamed from: m, reason: collision with root package name */
    public float f5759m;

    /* renamed from: n, reason: collision with root package name */
    public float f5760n;

    /* renamed from: o, reason: collision with root package name */
    public float f5761o;

    /* renamed from: p, reason: collision with root package name */
    public float f5762p;

    /* renamed from: q, reason: collision with root package name */
    public long f5763q;

    /* renamed from: r, reason: collision with root package name */
    public long f5764r;

    /* renamed from: s, reason: collision with root package name */
    public float f5765s;

    /* renamed from: t, reason: collision with root package name */
    public float f5766t;

    /* renamed from: u, reason: collision with root package name */
    public float f5767u;

    /* renamed from: v, reason: collision with root package name */
    public float f5768v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f5769w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f5770x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f5771y;

    public C0534e(C1166s c1166s, C0321s c0321s, C0494b c0494b) {
        this.f5748b = c0321s;
        this.f5749c = c0494b;
        RenderNode create = RenderNode.create("Compose", c1166s);
        this.f5750d = create;
        this.f5751e = 0L;
        if (f5747z.getAndSet(false)) {
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
                l lVar = l.f5823a;
                lVar.c(create, lVar.a(create));
                lVar.d(create, lVar.b(create));
            }
            k.f5822a.a(create);
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
        }
        create.setClipToBounds(false);
        g(0);
        this.f5754h = 0;
        this.f5755i = 3;
        this.f5756j = 1.0f;
        this.f5758l = 1.0f;
        this.f5759m = 1.0f;
        int i2 = C0323u.f4548h;
        this.f5763q = K.u();
        this.f5764r = K.u();
        this.f5768v = 8.0f;
    }

    @Override // c0.InterfaceC0533d
    public final void A(int i2, int i4, long j4) {
        this.f5750d.setLeftTopRightBottom(i2, i4, M0.j.c(j4) + i2, M0.j.b(j4) + i4);
        if (M0.j.a(this.f5751e, j4)) {
            return;
        }
        if (this.f5757k) {
            this.f5750d.setPivotX(M0.j.c(j4) / 2.0f);
            this.f5750d.setPivotY(M0.j.b(j4) / 2.0f);
        }
        this.f5751e = j4;
    }

    @Override // c0.InterfaceC0533d
    public final float B() {
        return this.f5766t;
    }

    @Override // c0.InterfaceC0533d
    public final void C(M0.b bVar, M0.k kVar, C0531b c0531b, Function1 function1) {
        Canvas start = this.f5750d.start(M0.j.c(this.f5751e), M0.j.b(this.f5751e));
        try {
            C0321s c0321s = this.f5748b;
            Canvas u4 = c0321s.a().u();
            c0321s.a().v(start);
            C0306c a4 = c0321s.a();
            C0494b c0494b = this.f5749c;
            long U3 = u3.d.U(this.f5751e);
            M0.b m4 = c0494b.Y().m();
            M0.k q2 = c0494b.Y().q();
            r k4 = c0494b.Y().k();
            long s4 = c0494b.Y().s();
            C0531b n2 = c0494b.Y().n();
            C0097d Y3 = c0494b.Y();
            Y3.D(bVar);
            Y3.F(kVar);
            Y3.C(a4);
            Y3.G(U3);
            Y3.E(c0531b);
            a4.g();
            try {
                function1.invoke(c0494b);
                a4.b();
                C0097d Y4 = c0494b.Y();
                Y4.D(m4);
                Y4.F(q2);
                Y4.C(k4);
                Y4.G(s4);
                Y4.E(n2);
                c0321s.a().v(u4);
            } catch (Throwable th) {
                a4.b();
                C0097d Y5 = c0494b.Y();
                Y5.D(m4);
                Y5.F(q2);
                Y5.C(k4);
                Y5.G(s4);
                Y5.E(n2);
                throw th;
            }
        } finally {
            this.f5750d.end(start);
        }
    }

    @Override // c0.InterfaceC0533d
    public final long D() {
        return this.f5764r;
    }

    @Override // c0.InterfaceC0533d
    public final void E(long j4) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f5763q = j4;
            l.f5823a.c(this.f5750d, K.D(j4));
        }
    }

    @Override // c0.InterfaceC0533d
    public final float F() {
        return this.f5762p;
    }

    @Override // c0.InterfaceC0533d
    public final float G() {
        return this.f5759m;
    }

    @Override // c0.InterfaceC0533d
    public final float H() {
        return this.f5768v;
    }

    @Override // c0.InterfaceC0533d
    public final float I() {
        return this.f5767u;
    }

    @Override // c0.InterfaceC0533d
    public final int J() {
        return this.f5755i;
    }

    @Override // c0.InterfaceC0533d
    public final void K(long j4) {
        if (AbstractC0345a.A(j4)) {
            this.f5757k = true;
            this.f5750d.setPivotX(M0.j.c(this.f5751e) / 2.0f);
            this.f5750d.setPivotY(M0.j.b(this.f5751e) / 2.0f);
        } else {
            this.f5757k = false;
            this.f5750d.setPivotX(Y.c.d(j4));
            this.f5750d.setPivotY(Y.c.e(j4));
        }
    }

    @Override // c0.InterfaceC0533d
    public final long L() {
        return this.f5763q;
    }

    @Override // c0.InterfaceC0533d
    public final float M() {
        return this.f5760n;
    }

    @Override // c0.InterfaceC0533d
    public final void N(boolean z4) {
        this.f5769w = z4;
        f();
    }

    @Override // c0.InterfaceC0533d
    public final int O() {
        return this.f5754h;
    }

    @Override // c0.InterfaceC0533d
    public final float P() {
        return this.f5765s;
    }

    @Override // c0.InterfaceC0533d
    public final float a() {
        return this.f5756j;
    }

    @Override // c0.InterfaceC0533d
    public final void b(float f4) {
        this.f5766t = f4;
        this.f5750d.setRotationY(f4);
    }

    @Override // c0.InterfaceC0533d
    public final void c(float f4) {
        this.f5760n = f4;
        this.f5750d.setTranslationX(f4);
    }

    @Override // c0.InterfaceC0533d
    public final void d(float f4) {
        this.f5756j = f4;
        this.f5750d.setAlpha(f4);
    }

    @Override // c0.InterfaceC0533d
    public final void e(float f4) {
        this.f5759m = f4;
        this.f5750d.setScaleY(f4);
    }

    public final void f() {
        boolean z4 = this.f5769w;
        boolean z5 = false;
        boolean z6 = z4 && !this.f5753g;
        if (z4 && this.f5753g) {
            z5 = true;
        }
        if (z6 != this.f5770x) {
            this.f5770x = z6;
            this.f5750d.setClipToBounds(z6);
        }
        if (z5 != this.f5771y) {
            this.f5771y = z5;
            this.f5750d.setClipToOutline(z5);
        }
    }

    public final void g(int i2) {
        RenderNode renderNode = this.f5750d;
        if (u3.l.c0(i2, 1)) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(true);
        } else if (u3.l.c0(i2, 2)) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // c0.InterfaceC0533d
    public final void h() {
    }

    @Override // c0.InterfaceC0533d
    public final void k(float f4) {
        this.f5767u = f4;
        this.f5750d.setRotation(f4);
    }

    @Override // c0.InterfaceC0533d
    public final void l(float f4) {
        this.f5761o = f4;
        this.f5750d.setTranslationY(f4);
    }

    @Override // c0.InterfaceC0533d
    public final void m(float f4) {
        this.f5768v = f4;
        this.f5750d.setCameraDistance(-f4);
    }

    @Override // c0.InterfaceC0533d
    public final boolean n() {
        return this.f5750d.isValid();
    }

    @Override // c0.InterfaceC0533d
    public final void o(Outline outline) {
        this.f5750d.setOutline(outline);
        this.f5753g = outline != null;
        f();
    }

    @Override // c0.InterfaceC0533d
    public final void p(float f4) {
        this.f5758l = f4;
        this.f5750d.setScaleX(f4);
    }

    @Override // c0.InterfaceC0533d
    public final void q(float f4) {
        this.f5765s = f4;
        this.f5750d.setRotationX(f4);
    }

    @Override // c0.InterfaceC0533d
    public final void r() {
        k.f5822a.a(this.f5750d);
    }

    @Override // c0.InterfaceC0533d
    public final void s(int i2) {
        this.f5754h = i2;
        if (u3.l.c0(i2, 1) || !K.o(this.f5755i, 3)) {
            g(1);
        } else {
            g(this.f5754h);
        }
    }

    @Override // c0.InterfaceC0533d
    public final void t(long j4) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f5764r = j4;
            l.f5823a.d(this.f5750d, K.D(j4));
        }
    }

    @Override // c0.InterfaceC0533d
    public final boolean u() {
        return this.f5769w;
    }

    @Override // c0.InterfaceC0533d
    public final float v() {
        return this.f5758l;
    }

    @Override // c0.InterfaceC0533d
    public final Matrix w() {
        Matrix matrix = this.f5752f;
        if (matrix == null) {
            matrix = new Matrix();
            this.f5752f = matrix;
        }
        this.f5750d.getMatrix(matrix);
        return matrix;
    }

    @Override // c0.InterfaceC0533d
    public final void x(float f4) {
        this.f5762p = f4;
        this.f5750d.setElevation(f4);
    }

    @Override // c0.InterfaceC0533d
    public final float y() {
        return this.f5761o;
    }

    @Override // c0.InterfaceC0533d
    public final void z(r rVar) {
        DisplayListCanvas a4 = AbstractC0307d.a(rVar);
        Intrinsics.d(a4, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        a4.drawRenderNode(this.f5750d);
    }
}
