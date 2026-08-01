package n1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import d2.v;
import java.util.concurrent.atomic.AtomicBoolean;
import k1.n;
import k1.o;
import k1.p;
import z4.m;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e implements d {

    /* renamed from: v, reason: collision with root package name */
    public static final AtomicBoolean f6924v = new AtomicBoolean(true);

    /* renamed from: b, reason: collision with root package name */
    public final o f6925b;

    /* renamed from: c, reason: collision with root package name */
    public final m1.b f6926c;

    /* renamed from: d, reason: collision with root package name */
    public final RenderNode f6927d;

    /* renamed from: e, reason: collision with root package name */
    public long f6928e;

    /* renamed from: f, reason: collision with root package name */
    public Paint f6929f;
    public Matrix g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f6930h;

    /* renamed from: i, reason: collision with root package name */
    public long f6931i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f6932k;

    /* renamed from: l, reason: collision with root package name */
    public float f6933l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f6934m;

    /* renamed from: n, reason: collision with root package name */
    public float f6935n;

    /* renamed from: o, reason: collision with root package name */
    public float f6936o;

    /* renamed from: p, reason: collision with root package name */
    public long f6937p;

    /* renamed from: q, reason: collision with root package name */
    public long f6938q;

    /* renamed from: r, reason: collision with root package name */
    public float f6939r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f6940s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f6941t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f6942u;

    public e(v vVar, o oVar, m1.b bVar) {
        this.f6925b = oVar;
        this.f6926c = bVar;
        RenderNode create = RenderNode.create("Compose", vVar);
        this.f6927d = create;
        this.f6928e = 0L;
        this.f6931i = 0L;
        if (f6924v.getAndSet(false)) {
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
        this.j = 0;
        this.f6932k = 3;
        this.f6933l = 1.0f;
        this.f6935n = 1.0f;
        this.f6936o = 1.0f;
        long j = p.f5336b;
        this.f6937p = j;
        this.f6938q = j;
        this.f6939r = 8.0f;
    }

    @Override // n1.d
    public final void A(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f6938q = j;
            k.d(this.f6927d, k1.v.r(j));
        }
    }

    @Override // n1.d
    public final void B(float f3) {
        this.f6936o = f3;
        this.f6927d.setScaleY(f3);
    }

    @Override // n1.d
    public final Matrix C() {
        Matrix matrix = this.g;
        if (matrix == null) {
            matrix = new Matrix();
            this.g = matrix;
        }
        this.f6927d.getMatrix(matrix);
        return matrix;
    }

    @Override // n1.d
    public final void D(int i3, int i10, long j) {
        int i11 = (int) (j >> 32);
        int i12 = (int) (4294967295L & j);
        this.f6927d.setLeftTopRightBottom(i3, i10, i3 + i11, i10 + i12);
        if (x2.k.a(this.f6928e, j)) {
            return;
        }
        if (this.f6934m) {
            this.f6927d.setPivotX(i11 / 2.0f);
            this.f6927d.setPivotY(i12 / 2.0f);
        }
        this.f6928e = j;
    }

    @Override // n1.d
    public final float E() {
        return 0.0f;
    }

    @Override // n1.d
    public final void F(float f3) {
        this.f6939r = f3;
        this.f6927d.setCameraDistance(-f3);
    }

    @Override // n1.d
    public final float G() {
        return 0.0f;
    }

    @Override // n1.d
    public final boolean H() {
        return this.f6927d.isValid();
    }

    @Override // n1.d
    public final float I() {
        return this.f6936o;
    }

    @Override // n1.d
    public final float J() {
        return 0.0f;
    }

    @Override // n1.d
    public final int K() {
        return this.f6932k;
    }

    @Override // n1.d
    public final void L(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.f6934m = true;
            this.f6927d.setPivotX(((int) (this.f6928e >> 32)) / 2.0f);
            this.f6927d.setPivotY(((int) (4294967295L & this.f6928e)) / 2.0f);
        } else {
            this.f6934m = false;
            this.f6927d.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.f6927d.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // n1.d
    public final long M() {
        return this.f6937p;
    }

    public final void N() {
        boolean z10 = this.f6940s;
        boolean z11 = false;
        boolean z12 = z10 && !this.f6930h;
        if (z10 && this.f6930h) {
            z11 = true;
        }
        if (z12 != this.f6941t) {
            this.f6941t = z12;
            this.f6927d.setClipToBounds(z12);
        }
        if (z11 != this.f6942u) {
            this.f6942u = z11;
            this.f6927d.setClipToOutline(z11);
        }
    }

    public final void O(int i3) {
        RenderNode renderNode = this.f6927d;
        if (i3 == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.f6929f);
            renderNode.setHasOverlappingRendering(true);
        } else if (i3 == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f6929f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f6929f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void P() {
        int i3 = this.j;
        if (i3 != 1 && this.f6932k == 3) {
            O(i3);
        } else {
            O(1);
        }
    }

    @Override // n1.d
    public final float a() {
        return this.f6933l;
    }

    @Override // n1.d
    public final void b() {
        this.f6927d.setRotationX(0.0f);
    }

    @Override // n1.d
    public final void c(float f3) {
        this.f6933l = f3;
        this.f6927d.setAlpha(f3);
    }

    @Override // n1.d
    public final float d() {
        return this.f6935n;
    }

    @Override // n1.d
    public final void e(n nVar) {
        Canvas canvas = k1.c.f5301a;
        DisplayListCanvas displayListCanvas = ((k1.b) nVar).f5296a;
        displayListCanvas.getClass();
        displayListCanvas.drawRenderNode(this.f6927d);
    }

    @Override // n1.d
    public final float f() {
        return 0.0f;
    }

    @Override // n1.d
    public final void g() {
        this.f6927d.setTranslationY(0.0f);
    }

    @Override // n1.d
    public final void h() {
        this.f6927d.setRotationY(0.0f);
    }

    @Override // n1.d
    public final long i() {
        return this.f6938q;
    }

    @Override // n1.d
    public final void j(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f6937p = j;
            k.c(this.f6927d, k1.v.r(j));
        }
    }

    @Override // n1.d
    public final void k(Outline outline, long j) {
        this.f6931i = j;
        this.f6927d.setOutline(outline);
        this.f6930h = outline != null;
        N();
    }

    @Override // n1.d
    public final void l() {
        P();
    }

    @Override // n1.d
    public final void m(float f3) {
        this.f6935n = f3;
        this.f6927d.setScaleX(f3);
    }

    @Override // n1.d
    public final void n(int i3) {
        if (this.f6932k == i3) {
            return;
        }
        this.f6932k = i3;
        Paint paint = this.f6929f;
        if (paint == null) {
            paint = new Paint();
            this.f6929f = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(k1.v.t(i3)));
        P();
    }

    @Override // n1.d
    public final float o() {
        return this.f6939r;
    }

    @Override // n1.d
    public final void p() {
        j.a(this.f6927d);
    }

    @Override // n1.d
    public final void q() {
        this.f6927d.setElevation(0.0f);
    }

    @Override // n1.d
    public final float r() {
        return 0.0f;
    }

    @Override // n1.d
    public final void s(x2.c cVar, x2.l lVar, b bVar, a3.e eVar) {
        Canvas start = this.f6927d.start(Math.max((int) (this.f6928e >> 32), (int) (this.f6931i >> 32)), Math.max((int) (this.f6928e & 4294967295L), (int) (this.f6931i & 4294967295L)));
        try {
            k1.b bVar2 = this.f6925b.f5335a;
            Canvas canvas = bVar2.f5296a;
            bVar2.f5296a = start;
            m1.b bVar3 = this.f6926c;
            a1.n nVar = bVar3.f6406e;
            long b10 = m.b(this.f6928e);
            m1.a aVar = ((m1.b) nVar.f42r).f6405d;
            x2.c cVar2 = aVar.f6401a;
            x2.l lVar2 = aVar.f6402b;
            n p4 = nVar.p();
            long u2 = nVar.u();
            b bVar4 = (b) nVar.f40e;
            nVar.I(cVar);
            nVar.J(lVar);
            nVar.H(bVar2);
            nVar.K(b10);
            nVar.f40e = bVar;
            bVar2.h();
            try {
                eVar.invoke(bVar3);
                bVar2.f();
                nVar.I(cVar2);
                nVar.J(lVar2);
                nVar.H(p4);
                nVar.K(u2);
                nVar.f40e = bVar4;
                bVar2.f5296a = canvas;
                this.f6927d.end(start);
            } catch (Throwable th) {
                bVar2.f();
                a1.n nVar2 = bVar3.f6406e;
                nVar2.I(cVar2);
                nVar2.J(lVar2);
                nVar2.H(p4);
                nVar2.K(u2);
                nVar2.f40e = bVar4;
                throw th;
            }
        } catch (Throwable th2) {
            this.f6927d.end(start);
            throw th2;
        }
    }

    @Override // n1.d
    public final void t() {
        this.f6927d.setTranslationX(0.0f);
    }

    @Override // n1.d
    public final void u(boolean z10) {
        this.f6940s = z10;
        N();
    }

    @Override // n1.d
    public final int v() {
        return this.j;
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
        this.j = i3;
        P();
    }

    @Override // n1.d
    public final void z() {
        this.f6927d.setRotation(0.0f);
    }
}
