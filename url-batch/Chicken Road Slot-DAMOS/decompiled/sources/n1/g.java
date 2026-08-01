package n1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import k1.j0;
import k1.n;
import k1.o;
import k1.p;
import k1.v;
import z4.m;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g implements d {

    /* renamed from: b, reason: collision with root package name */
    public final o f6943b;

    /* renamed from: c, reason: collision with root package name */
    public final m1.b f6944c;

    /* renamed from: d, reason: collision with root package name */
    public final RenderNode f6945d;

    /* renamed from: e, reason: collision with root package name */
    public long f6946e;

    /* renamed from: f, reason: collision with root package name */
    public Paint f6947f;
    public Matrix g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f6948h;

    /* renamed from: i, reason: collision with root package name */
    public float f6949i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public float f6950k;

    /* renamed from: l, reason: collision with root package name */
    public float f6951l;

    /* renamed from: m, reason: collision with root package name */
    public long f6952m;

    /* renamed from: n, reason: collision with root package name */
    public long f6953n;

    /* renamed from: o, reason: collision with root package name */
    public float f6954o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f6955p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f6956q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f6957r;

    /* renamed from: s, reason: collision with root package name */
    public int f6958s;

    public g() {
        o oVar = new o();
        m1.b bVar = new m1.b();
        this.f6943b = oVar;
        this.f6944c = bVar;
        RenderNode b10 = j0.b();
        this.f6945d = b10;
        this.f6946e = 0L;
        b10.setClipToBounds(false);
        O(b10, 0);
        this.f6949i = 1.0f;
        this.j = 3;
        this.f6950k = 1.0f;
        this.f6951l = 1.0f;
        long j = p.f5336b;
        this.f6952m = j;
        this.f6953n = j;
        this.f6954o = 8.0f;
        this.f6958s = 0;
    }

    @Override // n1.d
    public final void A(long j) {
        this.f6953n = j;
        this.f6945d.setSpotShadowColor(v.r(j));
    }

    @Override // n1.d
    public final void B(float f3) {
        this.f6951l = f3;
        this.f6945d.setScaleY(f3);
    }

    @Override // n1.d
    public final Matrix C() {
        Matrix matrix = this.g;
        if (matrix == null) {
            matrix = new Matrix();
            this.g = matrix;
        }
        this.f6945d.getMatrix(matrix);
        return matrix;
    }

    @Override // n1.d
    public final void D(int i3, int i10, long j) {
        this.f6945d.setPosition(i3, i10, ((int) (j >> 32)) + i3, ((int) (4294967295L & j)) + i10);
        this.f6946e = m.b(j);
    }

    @Override // n1.d
    public final float E() {
        return 0.0f;
    }

    @Override // n1.d
    public final void F(float f3) {
        this.f6954o = f3;
        this.f6945d.setCameraDistance(f3);
    }

    @Override // n1.d
    public final float G() {
        return 0.0f;
    }

    @Override // n1.d
    public final boolean H() {
        boolean hasDisplayList;
        hasDisplayList = this.f6945d.hasDisplayList();
        return hasDisplayList;
    }

    @Override // n1.d
    public final float I() {
        return this.f6951l;
    }

    @Override // n1.d
    public final float J() {
        return 0.0f;
    }

    @Override // n1.d
    public final int K() {
        return this.j;
    }

    @Override // n1.d
    public final void L(long j) {
        long j3 = 9223372034707292159L & j;
        RenderNode renderNode = this.f6945d;
        if (j3 == 9205357640488583168L) {
            renderNode.resetPivot();
        } else {
            renderNode.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.f6945d.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // n1.d
    public final long M() {
        return this.f6952m;
    }

    public final void N() {
        boolean z10 = this.f6955p;
        boolean z11 = false;
        boolean z12 = z10 && !this.f6948h;
        if (z10 && this.f6948h) {
            z11 = true;
        }
        if (z12 != this.f6956q) {
            this.f6956q = z12;
            this.f6945d.setClipToBounds(z12);
        }
        if (z11 != this.f6957r) {
            this.f6957r = z11;
            this.f6945d.setClipToOutline(z11);
        }
    }

    public final void O(RenderNode renderNode, int i3) {
        Paint paint = this.f6947f;
        if (i3 == 1) {
            renderNode.setUseCompositingLayer(true, paint);
            renderNode.setHasOverlappingRendering(true);
        } else if (i3 == 2) {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void P() {
        int i3 = this.f6958s;
        if (i3 != 1 && this.j == 3) {
            O(this.f6945d, i3);
        } else {
            O(this.f6945d, 1);
        }
    }

    @Override // n1.d
    public final float a() {
        return this.f6949i;
    }

    @Override // n1.d
    public final void b() {
        this.f6945d.setRotationX(0.0f);
    }

    @Override // n1.d
    public final void c(float f3) {
        this.f6949i = f3;
        this.f6945d.setAlpha(f3);
    }

    @Override // n1.d
    public final float d() {
        return this.f6950k;
    }

    @Override // n1.d
    public final void e(n nVar) {
        Canvas canvas = k1.c.f5301a;
        ((k1.b) nVar).f5296a.drawRenderNode(this.f6945d);
    }

    @Override // n1.d
    public final float f() {
        return 0.0f;
    }

    @Override // n1.d
    public final void g() {
        this.f6945d.setTranslationY(0.0f);
    }

    @Override // n1.d
    public final void h() {
        this.f6945d.setRotationY(0.0f);
    }

    @Override // n1.d
    public final long i() {
        return this.f6953n;
    }

    @Override // n1.d
    public final void j(long j) {
        this.f6952m = j;
        this.f6945d.setAmbientShadowColor(v.r(j));
    }

    @Override // n1.d
    public final void k(Outline outline, long j) {
        this.f6945d.setOutline(outline);
        this.f6948h = outline != null;
        N();
    }

    @Override // n1.d
    public final void l() {
        Paint paint = this.f6947f;
        if (paint == null) {
            paint = new Paint();
            this.f6947f = paint;
        }
        paint.setColorFilter(null);
        P();
    }

    @Override // n1.d
    public final void m(float f3) {
        this.f6950k = f3;
        this.f6945d.setScaleX(f3);
    }

    @Override // n1.d
    public final void n(int i3) {
        this.j = i3;
        Paint paint = this.f6947f;
        if (paint == null) {
            paint = new Paint();
            this.f6947f = paint;
        }
        paint.setBlendMode(v.q(i3));
        P();
    }

    @Override // n1.d
    public final float o() {
        return this.f6954o;
    }

    @Override // n1.d
    public final void p() {
        this.f6945d.discardDisplayList();
    }

    @Override // n1.d
    public final void q() {
        this.f6945d.setElevation(0.0f);
    }

    @Override // n1.d
    public final float r() {
        return 0.0f;
    }

    @Override // n1.d
    public final void s(x2.c cVar, x2.l lVar, b bVar, a3.e eVar) {
        RecordingCanvas beginRecording;
        m1.b bVar2 = this.f6944c;
        beginRecording = this.f6945d.beginRecording();
        try {
            o oVar = this.f6943b;
            k1.b bVar3 = oVar.f5335a;
            Canvas canvas = bVar3.f5296a;
            bVar3.f5296a = beginRecording;
            a1.n nVar = bVar2.f6406e;
            nVar.I(cVar);
            nVar.J(lVar);
            nVar.f40e = bVar;
            nVar.K(this.f6946e);
            nVar.H(bVar3);
            eVar.invoke(bVar2);
            oVar.f5335a.f5296a = canvas;
        } finally {
            this.f6945d.endRecording();
        }
    }

    @Override // n1.d
    public final void t() {
        this.f6945d.setTranslationX(0.0f);
    }

    @Override // n1.d
    public final void u(boolean z10) {
        this.f6955p = z10;
        N();
    }

    @Override // n1.d
    public final int v() {
        return this.f6958s;
    }

    @Override // n1.d
    public final float w() {
        return 0.0f;
    }

    @Override // n1.d
    public final k1.j x() {
        return null;
    }

    @Override // n1.d
    public final void y(int i3) {
        this.f6958s = i3;
        P();
    }

    @Override // n1.d
    public final void z() {
        this.f6945d.setRotationZ(0.0f);
    }
}
