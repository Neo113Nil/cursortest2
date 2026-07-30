package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class iw0 implements ew0 {
    public final os b;
    public final ns c;
    public final RenderNode d;
    public long e;
    public Paint f;
    public Matrix g;
    public boolean h;
    public float i;
    public int j;
    public float k;
    public float l;
    public float m;
    public long n;
    public long o;
    public float p;
    public boolean q;
    public boolean r;
    public boolean s;
    public int t;

    public iw0() {
        os osVar = new os();
        ns nsVar = new ns();
        this.b = osVar;
        this.c = nsVar;
        RenderNode renderNode = new RenderNode("graphicsLayer");
        this.d = renderNode;
        this.e = 0L;
        renderNode.setClipToBounds(false);
        O(renderNode, 0);
        this.i = 1.0f;
        this.j = 3;
        this.k = 1.0f;
        this.l = 1.0f;
        long j = aw.b;
        this.n = j;
        this.o = j;
        this.p = 8.0f;
        this.t = 0;
    }

    @Override // defpackage.ew0
    public final void A(long j) {
        this.o = j;
        this.d.setSpotShadowColor(ap.H(j));
    }

    @Override // defpackage.ew0
    public final void B(float f) {
        this.l = f;
        this.d.setScaleY(f);
    }

    @Override // defpackage.ew0
    public final Matrix C() {
        Matrix matrix = this.g;
        if (matrix == null) {
            matrix = new Matrix();
            this.g = matrix;
        }
        this.d.getMatrix(matrix);
        return matrix;
    }

    @Override // defpackage.ew0
    public final void D(int i, int i2, long j) {
        this.d.setPosition(i, i2, ((int) (j >> 32)) + i, ((int) (4294967295L & j)) + i2);
        this.e = zm3.Q(j);
    }

    @Override // defpackage.ew0
    public final float E() {
        return 0.0f;
    }

    @Override // defpackage.ew0
    public final void F(float f) {
        this.p = f;
        this.d.setCameraDistance(f);
    }

    @Override // defpackage.ew0
    public final float G() {
        return this.m;
    }

    @Override // defpackage.ew0
    public final boolean H() {
        return this.d.hasDisplayList();
    }

    @Override // defpackage.ew0
    public final float I() {
        return this.l;
    }

    @Override // defpackage.ew0
    public final float J() {
        return 0.0f;
    }

    @Override // defpackage.ew0
    public final int K() {
        return this.j;
    }

    @Override // defpackage.ew0
    public final void L(long j) {
        long j2 = 9223372034707292159L & j;
        RenderNode renderNode = this.d;
        if (j2 == 9205357640488583168L) {
            renderNode.resetPivot();
        } else {
            renderNode.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.d.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // defpackage.ew0
    public final long M() {
        return this.n;
    }

    public final void N() {
        boolean z = this.q;
        boolean z2 = false;
        boolean z3 = z && !this.h;
        if (z && this.h) {
            z2 = true;
        }
        if (z3 != this.r) {
            this.r = z3;
            this.d.setClipToBounds(z3);
        }
        if (z2 != this.s) {
            this.s = z2;
            this.d.setClipToOutline(z2);
        }
    }

    public final void O(RenderNode renderNode, int i) {
        if (i == 1) {
            renderNode.setUseCompositingLayer(true, this.f);
            renderNode.setHasOverlappingRendering(true);
            return;
        }
        Paint paint = this.f;
        if (i == 2) {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void P() {
        int i = this.t;
        if (i != 1 && this.j == 3) {
            O(this.d, i);
        } else {
            O(this.d, 1);
        }
    }

    @Override // defpackage.ew0
    public final float a() {
        return this.i;
    }

    @Override // defpackage.ew0
    public final void b() {
        this.d.setRotationX(0.0f);
    }

    @Override // defpackage.ew0
    public final void c(float f) {
        this.i = f;
        this.d.setAlpha(f);
    }

    @Override // defpackage.ew0
    public final float d() {
        return this.k;
    }

    @Override // defpackage.ew0
    public final void e(float f) {
        this.m = f;
        this.d.setElevation(f);
    }

    @Override // defpackage.ew0
    public final float f() {
        return 0.0f;
    }

    @Override // defpackage.ew0
    public final void g() {
        this.d.setTranslationY(0.0f);
    }

    @Override // defpackage.ew0
    public final void h() {
        this.d.setRotationY(0.0f);
    }

    @Override // defpackage.ew0
    public final long i() {
        return this.o;
    }

    @Override // defpackage.ew0
    public final void j(long j) {
        this.n = j;
        this.d.setAmbientShadowColor(ap.H(j));
    }

    @Override // defpackage.ew0
    public final void k(Outline outline, long j) {
        this.d.setOutline(outline);
        this.h = outline != null;
        N();
    }

    @Override // defpackage.ew0
    public final void l() {
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setColorFilter(null);
        P();
    }

    @Override // defpackage.ew0
    public final void m(float f) {
        this.k = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.ew0
    public final void n(int i) {
        this.j = i;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setBlendMode(x6.v(i));
        P();
    }

    @Override // defpackage.ew0
    public final float o() {
        return this.p;
    }

    @Override // defpackage.ew0
    public final void p() {
        this.d.discardDisplayList();
    }

    @Override // defpackage.ew0
    public final float q() {
        return 0.0f;
    }

    @Override // defpackage.ew0
    public final void r() {
        this.d.setTranslationX(0.0f);
    }

    @Override // defpackage.ew0
    public final void s(ls lsVar) {
        Canvas canvas = z6.a;
        ((y6) lsVar).a.drawRenderNode(this.d);
    }

    @Override // defpackage.ew0
    public final void t(boolean z) {
        this.q = z;
        N();
    }

    @Override // defpackage.ew0
    public final int u() {
        return this.t;
    }

    @Override // defpackage.ew0
    public final float v() {
        return 0.0f;
    }

    @Override // defpackage.ew0
    public final void w(ca0 ca0Var, u81 u81Var, dw0 dw0Var, j6 j6Var) {
        ns nsVar = this.c;
        RecordingCanvas beginRecording = this.d.beginRecording();
        try {
            os osVar = this.b;
            y6 y6Var = osVar.a;
            Canvas canvas = y6Var.a;
            y6Var.a = beginRecording;
            mh mhVar = nsVar.n;
            mhVar.H(ca0Var);
            mhVar.I(u81Var);
            mhVar.o = dw0Var;
            mhVar.J(this.e);
            mhVar.G(y6Var);
            j6Var.invoke(nsVar);
            osVar.a.a = canvas;
        } finally {
            this.d.endRecording();
        }
    }

    @Override // defpackage.ew0
    public final mo x() {
        return null;
    }

    @Override // defpackage.ew0
    public final void y(int i) {
        this.t = i;
        P();
    }

    @Override // defpackage.ew0
    public final void z() {
        this.d.setRotationZ(0.0f);
    }
}
