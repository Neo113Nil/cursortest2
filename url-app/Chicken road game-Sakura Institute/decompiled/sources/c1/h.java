package c1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import z0.l0;
import z0.r;
import z0.s;
import z0.u;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h implements e {

    /* renamed from: b, reason: collision with root package name */
    public final s f1574b;

    /* renamed from: c, reason: collision with root package name */
    public final b1.c f1575c;

    /* renamed from: d, reason: collision with root package name */
    public final RenderNode f1576d;

    /* renamed from: e, reason: collision with root package name */
    public long f1577e;

    /* renamed from: f, reason: collision with root package name */
    public Matrix f1578f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1579g;

    /* renamed from: h, reason: collision with root package name */
    public float f1580h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1581i;

    /* renamed from: j, reason: collision with root package name */
    public float f1582j;

    /* renamed from: k, reason: collision with root package name */
    public float f1583k;

    /* renamed from: l, reason: collision with root package name */
    public float f1584l;

    /* renamed from: m, reason: collision with root package name */
    public long f1585m;

    /* renamed from: n, reason: collision with root package name */
    public long f1586n;

    /* renamed from: o, reason: collision with root package name */
    public float f1587o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1588p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1589q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1590r;

    /* renamed from: s, reason: collision with root package name */
    public int f1591s;

    public h() {
        s sVar = new s();
        b1.c cVar = new b1.c();
        this.f1574b = sVar;
        this.f1575c = cVar;
        RenderNode c4 = g.c();
        this.f1576d = c4;
        this.f1577e = 0L;
        c4.setClipToBounds(false);
        f(c4, 0);
        this.f1580h = 1.0f;
        this.f1581i = 3;
        this.f1582j = 1.0f;
        this.f1583k = 1.0f;
        long j8 = u.f10052b;
        this.f1585m = j8;
        this.f1586n = j8;
        this.f1587o = 8.0f;
        this.f1591s = 0;
    }

    public static void f(RenderNode renderNode, int i7) {
        if (i7 == 1) {
            renderNode.setUseCompositingLayer(true, null);
            renderNode.setHasOverlappingRendering(true);
        } else if (i7 == 2) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // c1.e
    public final float A() {
        return 0.0f;
    }

    @Override // c1.e
    public final void B(int i7) {
        this.f1591s = i7;
        if (i7 != 1 && this.f1581i == 3) {
            f(this.f1576d, i7);
        } else {
            f(this.f1576d, 1);
        }
    }

    @Override // c1.e
    public final void C(long j8) {
        this.f1586n = j8;
        this.f1576d.setSpotShadowColor(l0.w(j8));
    }

    @Override // c1.e
    public final Matrix D() {
        Matrix matrix = this.f1578f;
        if (matrix == null) {
            matrix = new Matrix();
            this.f1578f = matrix;
        }
        this.f1576d.getMatrix(matrix);
        return matrix;
    }

    @Override // c1.e
    public final void E(m2.b bVar, m2.k kVar, c cVar, a aVar) {
        RecordingCanvas beginRecording;
        b1.c cVar2 = this.f1575c;
        beginRecording = this.f1576d.beginRecording();
        try {
            s sVar = this.f1574b;
            z0.d dVar = sVar.f10046a;
            Canvas canvas = dVar.f9984a;
            dVar.f9984a = beginRecording;
            b1.b bVar2 = cVar2.f1234g;
            bVar2.A(bVar);
            bVar2.B(kVar);
            bVar2.f1231h = cVar;
            bVar2.C(this.f1577e);
            bVar2.z(dVar);
            aVar.f(cVar2);
            sVar.f10046a.f9984a = canvas;
        } finally {
            this.f1576d.endRecording();
        }
    }

    @Override // c1.e
    public final void F(int i7, int i8, long j8) {
        this.f1576d.setPosition(i7, i8, ((int) (j8 >> 32)) + i7, ((int) (4294967295L & j8)) + i8);
        this.f1577e = j1.c.o0(j8);
    }

    @Override // c1.e
    public final float G() {
        return 0.0f;
    }

    @Override // c1.e
    public final float H() {
        return this.f1584l;
    }

    @Override // c1.e
    public final float I() {
        return this.f1583k;
    }

    @Override // c1.e
    public final void J(r rVar) {
        z0.e.a(rVar).drawRenderNode(this.f1576d);
    }

    @Override // c1.e
    public final float K() {
        return 0.0f;
    }

    @Override // c1.e
    public final int L() {
        return this.f1581i;
    }

    @Override // c1.e
    public final void M(long j8) {
        if (u3.r.i(j8)) {
            this.f1576d.resetPivot();
        } else {
            this.f1576d.setPivotX(y0.c.d(j8));
            this.f1576d.setPivotY(y0.c.e(j8));
        }
    }

    @Override // c1.e
    public final long N() {
        return this.f1585m;
    }

    @Override // c1.e
    public final float a() {
        return this.f1580h;
    }

    @Override // c1.e
    public final void b() {
        this.f1576d.setRotationX(0.0f);
    }

    @Override // c1.e
    public final void c(float f9) {
        this.f1580h = f9;
        this.f1576d.setAlpha(f9);
    }

    public final void d() {
        boolean z8 = this.f1588p;
        boolean z9 = false;
        boolean z10 = z8 && !this.f1579g;
        if (z8 && this.f1579g) {
            z9 = true;
        }
        if (z10 != this.f1589q) {
            this.f1589q = z10;
            this.f1576d.setClipToBounds(z10);
        }
        if (z9 != this.f1590r) {
            this.f1590r = z9;
            this.f1576d.setClipToOutline(z9);
        }
    }

    @Override // c1.e
    public final void e() {
        this.f1576d.setTranslationY(0.0f);
    }

    @Override // c1.e
    public final void g() {
        this.f1576d.setRotationY(0.0f);
    }

    @Override // c1.e
    public final void h(float f9) {
        this.f1582j = f9;
        this.f1576d.setScaleX(f9);
    }

    @Override // c1.e
    public final void i() {
        this.f1576d.discardDisplayList();
    }

    @Override // c1.e
    public final void j() {
        this.f1576d.setTranslationX(0.0f);
    }

    @Override // c1.e
    public final void k() {
        this.f1576d.setRotationZ(0.0f);
    }

    @Override // c1.e
    public final void l(float f9) {
        this.f1583k = f9;
        this.f1576d.setScaleY(f9);
    }

    @Override // c1.e
    public final void o(float f9) {
        this.f1587o = f9;
        this.f1576d.setCameraDistance(f9);
    }

    @Override // c1.e
    public final boolean p() {
        boolean hasDisplayList;
        hasDisplayList = this.f1576d.hasDisplayList();
        return hasDisplayList;
    }

    @Override // c1.e
    public final float q() {
        return this.f1582j;
    }

    @Override // c1.e
    public final void r(float f9) {
        this.f1584l = f9;
        this.f1576d.setElevation(f9);
    }

    @Override // c1.e
    public final float s() {
        return 0.0f;
    }

    @Override // c1.e
    public final long t() {
        return this.f1586n;
    }

    @Override // c1.e
    public final void u(long j8) {
        this.f1585m = j8;
        this.f1576d.setAmbientShadowColor(l0.w(j8));
    }

    @Override // c1.e
    public final void v(Outline outline, long j8) {
        this.f1576d.setOutline(outline);
        this.f1579g = outline != null;
        d();
    }

    @Override // c1.e
    public final float w() {
        return this.f1587o;
    }

    @Override // c1.e
    public final float x() {
        return 0.0f;
    }

    @Override // c1.e
    public final void y(boolean z8) {
        this.f1588p = z8;
        d();
    }

    @Override // c1.e
    public final int z() {
        return this.f1591s;
    }
}
