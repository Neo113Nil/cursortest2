package i1;

import a0.g1;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import f1.p;
import f1.q;
import f1.r;
import f1.s;
import java.util.concurrent.atomic.AtomicBoolean;
import x1.t;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e implements d {

    /* renamed from: w, reason: collision with root package name */
    public static final AtomicBoolean f3319w = new AtomicBoolean(true);

    /* renamed from: b, reason: collision with root package name */
    public final r f3320b;

    /* renamed from: c, reason: collision with root package name */
    public final h1.b f3321c;

    /* renamed from: d, reason: collision with root package name */
    public final RenderNode f3322d;

    /* renamed from: e, reason: collision with root package name */
    public long f3323e;

    /* renamed from: f, reason: collision with root package name */
    public Paint f3324f;

    /* renamed from: g, reason: collision with root package name */
    public Matrix f3325g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3326h;
    public long i;

    /* renamed from: j, reason: collision with root package name */
    public int f3327j;

    /* renamed from: k, reason: collision with root package name */
    public int f3328k;

    /* renamed from: l, reason: collision with root package name */
    public float f3329l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3330m;

    /* renamed from: n, reason: collision with root package name */
    public float f3331n;

    /* renamed from: o, reason: collision with root package name */
    public float f3332o;

    /* renamed from: p, reason: collision with root package name */
    public float f3333p;

    /* renamed from: q, reason: collision with root package name */
    public long f3334q;

    /* renamed from: r, reason: collision with root package name */
    public long f3335r;

    /* renamed from: s, reason: collision with root package name */
    public float f3336s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f3337t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3338u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f3339v;

    public e(t tVar, r rVar, h1.b bVar) {
        this.f3320b = rVar;
        this.f3321c = bVar;
        RenderNode create = RenderNode.create("Compose", tVar);
        this.f3322d = create;
        this.f3323e = 0L;
        this.i = 0L;
        if (f3319w.getAndSet(false)) {
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
                k.c(create, k.a(create));
                k.d(create, k.b(create));
            }
            j.a(create);
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
        }
        create.setClipToBounds(false);
        O(0);
        this.f3327j = 0;
        this.f3328k = 3;
        this.f3329l = 1.0f;
        this.f3331n = 1.0f;
        this.f3332o = 1.0f;
        long j7 = s.f2698b;
        this.f3334q = j7;
        this.f3335r = j7;
        this.f3336s = 8.0f;
    }

    @Override // i1.d
    public final void A(float f6) {
        this.f3332o = f6;
        this.f3322d.setScaleY(f6);
    }

    @Override // i1.d
    public final Matrix B() {
        Matrix matrix = this.f3325g;
        if (matrix == null) {
            matrix = new Matrix();
            this.f3325g = matrix;
        }
        this.f3322d.getMatrix(matrix);
        return matrix;
    }

    @Override // i1.d
    public final void C(int i, int i8, long j7) {
        int i9 = (int) (j7 >> 32);
        int i10 = (int) (4294967295L & j7);
        this.f3322d.setLeftTopRightBottom(i, i8, i + i9, i8 + i10);
        if (r2.k.a(this.f3323e, j7)) {
            return;
        }
        if (this.f3330m) {
            this.f3322d.setPivotX(i9 / 2.0f);
            this.f3322d.setPivotY(i10 / 2.0f);
        }
        this.f3323e = j7;
    }

    @Override // i1.d
    public final float D() {
        return 0.0f;
    }

    @Override // i1.d
    public final void E(float f6) {
        this.f3336s = f6;
        this.f3322d.setCameraDistance(-f6);
    }

    @Override // i1.d
    public final float F() {
        return this.f3333p;
    }

    @Override // i1.d
    public final boolean G() {
        return this.f3322d.isValid();
    }

    @Override // i1.d
    public final void H(q qVar) {
        DisplayListCanvas a8 = f1.c.a(qVar);
        q6.i.c(a8, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        a8.drawRenderNode(this.f3322d);
    }

    @Override // i1.d
    public final float I() {
        return this.f3332o;
    }

    @Override // i1.d
    public final float J() {
        return 0.0f;
    }

    @Override // i1.d
    public final int K() {
        return this.f3328k;
    }

    @Override // i1.d
    public final void L(long j7) {
        if ((9223372034707292159L & j7) == 9205357640488583168L) {
            this.f3330m = true;
            this.f3322d.setPivotX(((int) (this.f3323e >> 32)) / 2.0f);
            this.f3322d.setPivotY(((int) (4294967295L & this.f3323e)) / 2.0f);
        } else {
            this.f3330m = false;
            this.f3322d.setPivotX(Float.intBitsToFloat((int) (j7 >> 32)));
            this.f3322d.setPivotY(Float.intBitsToFloat((int) (j7 & 4294967295L)));
        }
    }

    @Override // i1.d
    public final long M() {
        return this.f3334q;
    }

    public final void N() {
        boolean z3 = this.f3337t;
        boolean z7 = false;
        boolean z8 = z3 && !this.f3326h;
        if (z3 && this.f3326h) {
            z7 = true;
        }
        if (z8 != this.f3338u) {
            this.f3338u = z8;
            this.f3322d.setClipToBounds(z8);
        }
        if (z7 != this.f3339v) {
            this.f3339v = z7;
            this.f3322d.setClipToOutline(z7);
        }
    }

    public final void O(int i) {
        RenderNode renderNode = this.f3322d;
        if (i == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.f3324f);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f3324f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f3324f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void P() {
        int i = this.f3327j;
        if (i != 1 && this.f3328k == 3) {
            O(i);
        } else {
            O(1);
        }
    }

    @Override // i1.d
    public final float a() {
        return this.f3329l;
    }

    @Override // i1.d
    public final void b() {
        this.f3322d.setRotationX(0.0f);
    }

    @Override // i1.d
    public final void c(r2.c cVar, r2.l lVar, b bVar, b1.e eVar) {
        Canvas start = this.f3322d.start(Math.max((int) (this.f3323e >> 32), (int) (this.i >> 32)), Math.max((int) (this.f3323e & 4294967295L), (int) (this.i & 4294967295L)));
        try {
            f1.b bVar2 = this.f3320b.f2697a;
            Canvas canvas = bVar2.f2622a;
            bVar2.f2622a = start;
            h1.b bVar3 = this.f3321c;
            g1 g1Var = bVar3.f3075e;
            long R = m.a.R(this.f3323e);
            h1.a aVar = ((h1.b) g1Var.f86d).f3074d;
            r2.c cVar2 = aVar.f3070a;
            r2.l lVar2 = aVar.f3071b;
            q m7 = g1Var.m();
            long u7 = g1Var.u();
            b bVar4 = (b) g1Var.f85c;
            g1Var.K(cVar);
            g1Var.L(lVar);
            g1Var.J(bVar2);
            g1Var.M(R);
            g1Var.f85c = bVar;
            bVar2.h();
            try {
                eVar.i(bVar3);
                bVar2.f();
                g1Var.K(cVar2);
                g1Var.L(lVar2);
                g1Var.J(m7);
                g1Var.M(u7);
                g1Var.f85c = bVar4;
                bVar2.f2622a = canvas;
                this.f3322d.end(start);
            } catch (Throwable th) {
                bVar2.f();
                g1 g1Var2 = bVar3.f3075e;
                g1Var2.K(cVar2);
                g1Var2.L(lVar2);
                g1Var2.J(m7);
                g1Var2.M(u7);
                g1Var2.f85c = bVar4;
                throw th;
            }
        } catch (Throwable th2) {
            this.f3322d.end(start);
            throw th2;
        }
    }

    @Override // i1.d
    public final void d(float f6) {
        this.f3329l = f6;
        this.f3322d.setAlpha(f6);
    }

    @Override // i1.d
    public final float e() {
        return this.f3331n;
    }

    @Override // i1.d
    public final void f(float f6) {
        this.f3333p = f6;
        this.f3322d.setElevation(f6);
    }

    @Override // i1.d
    public final float g() {
        return 0.0f;
    }

    @Override // i1.d
    public final void h() {
        this.f3322d.setTranslationY(0.0f);
    }

    @Override // i1.d
    public final void i() {
        this.f3322d.setRotationY(0.0f);
    }

    @Override // i1.d
    public final long j() {
        return this.f3335r;
    }

    @Override // i1.d
    public final void k(long j7) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f3334q = j7;
            k.c(this.f3322d, p.u(j7));
        }
    }

    @Override // i1.d
    public final void l(Outline outline, long j7) {
        this.i = j7;
        this.f3322d.setOutline(outline);
        this.f3326h = outline != null;
        N();
    }

    @Override // i1.d
    public final void m() {
        P();
    }

    @Override // i1.d
    public final void n(float f6) {
        this.f3331n = f6;
        this.f3322d.setScaleX(f6);
    }

    @Override // i1.d
    public final void o(int i) {
        if (this.f3328k == i) {
            return;
        }
        this.f3328k = i;
        Paint paint = this.f3324f;
        if (paint == null) {
            paint = new Paint();
            this.f3324f = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(p.x(i)));
        P();
    }

    @Override // i1.d
    public final float p() {
        return this.f3336s;
    }

    @Override // i1.d
    public final void q() {
        j.a(this.f3322d);
    }

    @Override // i1.d
    public final float r() {
        return 0.0f;
    }

    @Override // i1.d
    public final void s() {
        this.f3322d.setTranslationX(0.0f);
    }

    @Override // i1.d
    public final void t(boolean z3) {
        this.f3337t = z3;
        N();
    }

    @Override // i1.d
    public final int u() {
        return this.f3327j;
    }

    @Override // i1.d
    public final float v() {
        return 0.0f;
    }

    @Override // i1.d
    public final f1.m w() {
        return null;
    }

    @Override // i1.d
    public final void x(int i) {
        this.f3327j = i;
        P();
    }

    @Override // i1.d
    public final void y() {
        this.f3322d.setRotation(0.0f);
    }

    @Override // i1.d
    public final void z(long j7) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f3335r = j7;
            k.d(this.f3322d, p.u(j7));
        }
    }
}
