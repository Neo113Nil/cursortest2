package i1;

import a0.g1;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import f1.p;
import f1.q;
import f1.r;
import f1.s;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class g implements d {

    /* renamed from: b, reason: collision with root package name */
    public final r f3340b;

    /* renamed from: c, reason: collision with root package name */
    public final h1.b f3341c;

    /* renamed from: d, reason: collision with root package name */
    public final RenderNode f3342d;

    /* renamed from: e, reason: collision with root package name */
    public long f3343e;

    /* renamed from: f, reason: collision with root package name */
    public Paint f3344f;

    /* renamed from: g, reason: collision with root package name */
    public Matrix f3345g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3346h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public int f3347j;

    /* renamed from: k, reason: collision with root package name */
    public float f3348k;

    /* renamed from: l, reason: collision with root package name */
    public float f3349l;

    /* renamed from: m, reason: collision with root package name */
    public float f3350m;

    /* renamed from: n, reason: collision with root package name */
    public long f3351n;

    /* renamed from: o, reason: collision with root package name */
    public long f3352o;

    /* renamed from: p, reason: collision with root package name */
    public float f3353p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3354q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3355r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3356s;

    /* renamed from: t, reason: collision with root package name */
    public int f3357t;

    public g() {
        r rVar = new r();
        h1.b bVar = new h1.b();
        this.f3340b = rVar;
        this.f3341c = bVar;
        RenderNode b8 = f.b();
        this.f3342d = b8;
        this.f3343e = 0L;
        b8.setClipToBounds(false);
        O(b8, 0);
        this.i = 1.0f;
        this.f3347j = 3;
        this.f3348k = 1.0f;
        this.f3349l = 1.0f;
        long j7 = s.f2698b;
        this.f3351n = j7;
        this.f3352o = j7;
        this.f3353p = 8.0f;
        this.f3357t = 0;
    }

    @Override // i1.d
    public final void A(float f6) {
        this.f3349l = f6;
        this.f3342d.setScaleY(f6);
    }

    @Override // i1.d
    public final Matrix B() {
        Matrix matrix = this.f3345g;
        if (matrix == null) {
            matrix = new Matrix();
            this.f3345g = matrix;
        }
        this.f3342d.getMatrix(matrix);
        return matrix;
    }

    @Override // i1.d
    public final void C(int i, int i8, long j7) {
        this.f3342d.setPosition(i, i8, ((int) (j7 >> 32)) + i, ((int) (4294967295L & j7)) + i8);
        this.f3343e = m.a.R(j7);
    }

    @Override // i1.d
    public final float D() {
        return 0.0f;
    }

    @Override // i1.d
    public final void E(float f6) {
        this.f3353p = f6;
        this.f3342d.setCameraDistance(f6);
    }

    @Override // i1.d
    public final float F() {
        return this.f3350m;
    }

    @Override // i1.d
    public final boolean G() {
        boolean hasDisplayList;
        hasDisplayList = this.f3342d.hasDisplayList();
        return hasDisplayList;
    }

    @Override // i1.d
    public final void H(q qVar) {
        f1.c.a(qVar).drawRenderNode(this.f3342d);
    }

    @Override // i1.d
    public final float I() {
        return this.f3349l;
    }

    @Override // i1.d
    public final float J() {
        return 0.0f;
    }

    @Override // i1.d
    public final int K() {
        return this.f3347j;
    }

    @Override // i1.d
    public final void L(long j7) {
        if ((9223372034707292159L & j7) == 9205357640488583168L) {
            this.f3342d.resetPivot();
        } else {
            this.f3342d.setPivotX(Float.intBitsToFloat((int) (j7 >> 32)));
            this.f3342d.setPivotY(Float.intBitsToFloat((int) (j7 & 4294967295L)));
        }
    }

    @Override // i1.d
    public final long M() {
        return this.f3351n;
    }

    public final void N() {
        boolean z3 = this.f3354q;
        boolean z7 = false;
        boolean z8 = z3 && !this.f3346h;
        if (z3 && this.f3346h) {
            z7 = true;
        }
        if (z8 != this.f3355r) {
            this.f3355r = z8;
            this.f3342d.setClipToBounds(z8);
        }
        if (z7 != this.f3356s) {
            this.f3356s = z7;
            this.f3342d.setClipToOutline(z7);
        }
    }

    public final void O(RenderNode renderNode, int i) {
        if (i == 1) {
            renderNode.setUseCompositingLayer(true, this.f3344f);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setUseCompositingLayer(false, this.f3344f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, this.f3344f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void P() {
        int i = this.f3357t;
        if (i != 1 && this.f3347j == 3) {
            O(this.f3342d, i);
        } else {
            O(this.f3342d, 1);
        }
    }

    @Override // i1.d
    public final float a() {
        return this.i;
    }

    @Override // i1.d
    public final void b() {
        this.f3342d.setRotationX(0.0f);
    }

    @Override // i1.d
    public final void c(r2.c cVar, r2.l lVar, b bVar, b1.e eVar) {
        RecordingCanvas beginRecording;
        h1.b bVar2 = this.f3341c;
        beginRecording = this.f3342d.beginRecording();
        try {
            r rVar = this.f3340b;
            f1.b bVar3 = rVar.f2697a;
            Canvas canvas = bVar3.f2622a;
            bVar3.f2622a = beginRecording;
            g1 g1Var = bVar2.f3075e;
            g1Var.K(cVar);
            g1Var.L(lVar);
            g1Var.f85c = bVar;
            g1Var.M(this.f3343e);
            g1Var.J(bVar3);
            eVar.i(bVar2);
            rVar.f2697a.f2622a = canvas;
        } finally {
            this.f3342d.endRecording();
        }
    }

    @Override // i1.d
    public final void d(float f6) {
        this.i = f6;
        this.f3342d.setAlpha(f6);
    }

    @Override // i1.d
    public final float e() {
        return this.f3348k;
    }

    @Override // i1.d
    public final void f(float f6) {
        this.f3350m = f6;
        this.f3342d.setElevation(f6);
    }

    @Override // i1.d
    public final float g() {
        return 0.0f;
    }

    @Override // i1.d
    public final void h() {
        this.f3342d.setTranslationY(0.0f);
    }

    @Override // i1.d
    public final void i() {
        this.f3342d.setRotationY(0.0f);
    }

    @Override // i1.d
    public final long j() {
        return this.f3352o;
    }

    @Override // i1.d
    public final void k(long j7) {
        this.f3351n = j7;
        this.f3342d.setAmbientShadowColor(p.u(j7));
    }

    @Override // i1.d
    public final void l(Outline outline, long j7) {
        this.f3342d.setOutline(outline);
        this.f3346h = outline != null;
        N();
    }

    @Override // i1.d
    public final void m() {
        Paint paint = this.f3344f;
        if (paint == null) {
            paint = new Paint();
            this.f3344f = paint;
        }
        paint.setColorFilter(null);
        P();
    }

    @Override // i1.d
    public final void n(float f6) {
        this.f3348k = f6;
        this.f3342d.setScaleX(f6);
    }

    @Override // i1.d
    public final void o(int i) {
        this.f3347j = i;
        Paint paint = this.f3344f;
        if (paint == null) {
            paint = new Paint();
            this.f3344f = paint;
        }
        paint.setBlendMode(p.r(i));
        P();
    }

    @Override // i1.d
    public final float p() {
        return this.f3353p;
    }

    @Override // i1.d
    public final void q() {
        this.f3342d.discardDisplayList();
    }

    @Override // i1.d
    public final float r() {
        return 0.0f;
    }

    @Override // i1.d
    public final void s() {
        this.f3342d.setTranslationX(0.0f);
    }

    @Override // i1.d
    public final void t(boolean z3) {
        this.f3354q = z3;
        N();
    }

    @Override // i1.d
    public final int u() {
        return this.f3357t;
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
        this.f3357t = i;
        P();
    }

    @Override // i1.d
    public final void y() {
        this.f3342d.setRotationZ(0.0f);
    }

    @Override // i1.d
    public final void z(long j7) {
        this.f3352o = j7;
        this.f3342d.setSpotShadowColor(p.u(j7));
    }
}
