package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class hw0 implements ew0 {
    public static final AtomicBoolean w = new AtomicBoolean(true);
    public final os b;
    public final ns c;
    public final RenderNode d;
    public long e;
    public Paint f;
    public Matrix g;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public float l;
    public boolean m;
    public float n;
    public float o;
    public float p;
    public long q;
    public long r;
    public float s;
    public boolean t;
    public boolean u;
    public boolean v;

    public hw0(t7 t7Var, os osVar, ns nsVar) {
        this.b = osVar;
        this.c = nsVar;
        RenderNode create = RenderNode.create("Compose", t7Var);
        this.d = create;
        this.e = 0L;
        this.i = 0L;
        if (w.getAndSet(false)) {
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
                y82.c(create, y82.a(create));
                y82.d(create, y82.b(create));
            }
            x82.a(create);
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
        }
        create.setClipToBounds(false);
        O(0);
        this.j = 0;
        this.k = 3;
        this.l = 1.0f;
        this.n = 1.0f;
        this.o = 1.0f;
        long j = aw.b;
        this.q = j;
        this.r = j;
        this.s = 8.0f;
    }

    @Override // defpackage.ew0
    public final void A(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.r = j;
            y82.d(this.d, ap.H(j));
        }
    }

    @Override // defpackage.ew0
    public final void B(float f) {
        this.o = f;
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
        int i3 = (int) (j >> 32);
        int i4 = (int) (4294967295L & j);
        this.d.setLeftTopRightBottom(i, i2, i + i3, i2 + i4);
        if (x31.a(this.e, j)) {
            return;
        }
        if (this.m) {
            this.d.setPivotX(i3 / 2.0f);
            this.d.setPivotY(i4 / 2.0f);
        }
        this.e = j;
    }

    @Override // defpackage.ew0
    public final float E() {
        return 0.0f;
    }

    @Override // defpackage.ew0
    public final void F(float f) {
        this.s = f;
        this.d.setCameraDistance(-f);
    }

    @Override // defpackage.ew0
    public final float G() {
        return this.p;
    }

    @Override // defpackage.ew0
    public final boolean H() {
        return this.d.isValid();
    }

    @Override // defpackage.ew0
    public final float I() {
        return this.o;
    }

    @Override // defpackage.ew0
    public final float J() {
        return 0.0f;
    }

    @Override // defpackage.ew0
    public final int K() {
        return this.k;
    }

    @Override // defpackage.ew0
    public final void L(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.m = true;
            this.d.setPivotX(((int) (this.e >> 32)) / 2.0f);
            this.d.setPivotY(((int) (4294967295L & this.e)) / 2.0f);
        } else {
            this.m = false;
            this.d.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.d.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // defpackage.ew0
    public final long M() {
        return this.q;
    }

    public final void N() {
        boolean z = this.t;
        boolean z2 = false;
        boolean z3 = z && !this.h;
        if (z && this.h) {
            z2 = true;
        }
        if (z3 != this.u) {
            this.u = z3;
            this.d.setClipToBounds(z3);
        }
        if (z2 != this.v) {
            this.v = z2;
            this.d.setClipToOutline(z2);
        }
    }

    public final void O(int i) {
        RenderNode renderNode = this.d;
        if (i == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void P() {
        int i = this.j;
        if (i != 1 && this.k == 3) {
            O(i);
        } else {
            O(1);
        }
    }

    @Override // defpackage.ew0
    public final float a() {
        return this.l;
    }

    @Override // defpackage.ew0
    public final void b() {
        this.d.setRotationX(0.0f);
    }

    @Override // defpackage.ew0
    public final void c(float f) {
        this.l = f;
        this.d.setAlpha(f);
    }

    @Override // defpackage.ew0
    public final float d() {
        return this.n;
    }

    @Override // defpackage.ew0
    public final void e(float f) {
        this.p = f;
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
        return this.r;
    }

    @Override // defpackage.ew0
    public final void j(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.q = j;
            y82.c(this.d, ap.H(j));
        }
    }

    @Override // defpackage.ew0
    public final void k(Outline outline, long j) {
        this.i = j;
        this.d.setOutline(outline);
        this.h = outline != null;
        N();
    }

    @Override // defpackage.ew0
    public final void l() {
        P();
    }

    @Override // defpackage.ew0
    public final void m(float f) {
        this.n = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.ew0
    public final void n(int i) {
        if (this.k == i) {
            return;
        }
        this.k = i;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(x6.w(i)));
        P();
    }

    @Override // defpackage.ew0
    public final float o() {
        return this.s;
    }

    @Override // defpackage.ew0
    public final void p() {
        x82.a(this.d);
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
        DisplayListCanvas displayListCanvas = ((y6) lsVar).a;
        displayListCanvas.getClass();
        displayListCanvas.drawRenderNode(this.d);
    }

    @Override // defpackage.ew0
    public final void t(boolean z) {
        this.t = z;
        N();
    }

    @Override // defpackage.ew0
    public final int u() {
        return this.j;
    }

    @Override // defpackage.ew0
    public final float v() {
        return 0.0f;
    }

    @Override // defpackage.ew0
    public final void w(ca0 ca0Var, u81 u81Var, dw0 dw0Var, j6 j6Var) {
        Canvas start = this.d.start(Math.max((int) (this.e >> 32), (int) (this.i >> 32)), Math.max((int) (this.e & 4294967295L), (int) (this.i & 4294967295L)));
        try {
            y6 y6Var = this.b.a;
            Canvas canvas = y6Var.a;
            y6Var.a = start;
            ns nsVar = this.c;
            mh mhVar = nsVar.n;
            long Q = zm3.Q(this.e);
            ms msVar = ((ns) mhVar.p).m;
            ca0 ca0Var2 = msVar.a;
            u81 u81Var2 = msVar.b;
            ls o = mhVar.o();
            long v = mhVar.v();
            dw0 dw0Var2 = (dw0) mhVar.o;
            mhVar.H(ca0Var);
            mhVar.I(u81Var);
            mhVar.G(y6Var);
            mhVar.J(Q);
            mhVar.o = dw0Var;
            y6Var.m();
            try {
                j6Var.invoke(nsVar);
                y6Var.j();
                mhVar.H(ca0Var2);
                mhVar.I(u81Var2);
                mhVar.G(o);
                mhVar.J(v);
                mhVar.o = dw0Var2;
                y6Var.a = canvas;
            } catch (Throwable th) {
                y6Var.j();
                mh mhVar2 = nsVar.n;
                mhVar2.H(ca0Var2);
                mhVar2.I(u81Var2);
                mhVar2.G(o);
                mhVar2.J(v);
                mhVar2.o = dw0Var2;
                throw th;
            }
        } finally {
            this.d.end(start);
        }
    }

    @Override // defpackage.ew0
    public final mo x() {
        return null;
    }

    @Override // defpackage.ew0
    public final void y(int i) {
        this.j = i;
        P();
    }

    @Override // defpackage.ew0
    public final void z() {
        this.d.setRotation(0.0f);
    }
}
