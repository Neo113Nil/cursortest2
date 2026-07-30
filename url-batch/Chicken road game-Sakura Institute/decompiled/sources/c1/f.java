package c1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import java.util.concurrent.atomic.AtomicBoolean;
import s1.r;
import z0.l0;
import z0.s;
import z0.u;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f implements e {

    /* renamed from: v, reason: collision with root package name */
    public static final AtomicBoolean f1553v = new AtomicBoolean(true);

    /* renamed from: b, reason: collision with root package name */
    public final s f1554b;

    /* renamed from: c, reason: collision with root package name */
    public final b1.c f1555c;

    /* renamed from: d, reason: collision with root package name */
    public final RenderNode f1556d;

    /* renamed from: e, reason: collision with root package name */
    public long f1557e;

    /* renamed from: f, reason: collision with root package name */
    public Matrix f1558f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1559g;

    /* renamed from: h, reason: collision with root package name */
    public long f1560h;

    /* renamed from: i, reason: collision with root package name */
    public int f1561i;

    /* renamed from: j, reason: collision with root package name */
    public final int f1562j;

    /* renamed from: k, reason: collision with root package name */
    public float f1563k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1564l;

    /* renamed from: m, reason: collision with root package name */
    public float f1565m;

    /* renamed from: n, reason: collision with root package name */
    public float f1566n;

    /* renamed from: o, reason: collision with root package name */
    public float f1567o;

    /* renamed from: p, reason: collision with root package name */
    public long f1568p;

    /* renamed from: q, reason: collision with root package name */
    public long f1569q;

    /* renamed from: r, reason: collision with root package name */
    public float f1570r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1571s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1572t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1573u;

    public f(r rVar, s sVar, b1.c cVar) {
        this.f1554b = sVar;
        this.f1555c = cVar;
        RenderNode create = RenderNode.create("Compose", rVar);
        this.f1556d = create;
        this.f1557e = 0L;
        this.f1560h = 0L;
        if (f1553v.getAndSet(false)) {
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
                n nVar = n.f1616a;
                nVar.c(create, nVar.a(create));
                nVar.d(create, nVar.b(create));
            }
            m.f1615a.a(create);
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
        }
        create.setClipToBounds(false);
        f(0);
        this.f1561i = 0;
        this.f1562j = 3;
        this.f1563k = 1.0f;
        this.f1565m = 1.0f;
        this.f1566n = 1.0f;
        long j8 = u.f10052b;
        this.f1568p = j8;
        this.f1569q = j8;
        this.f1570r = 8.0f;
    }

    @Override // c1.e
    public final float A() {
        return 0.0f;
    }

    @Override // c1.e
    public final void B(int i7) {
        this.f1561i = i7;
        if (i7 != 1 && this.f1562j == 3) {
            f(i7);
        } else {
            f(1);
        }
    }

    @Override // c1.e
    public final void C(long j8) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f1569q = j8;
            n.f1616a.d(this.f1556d, l0.w(j8));
        }
    }

    @Override // c1.e
    public final Matrix D() {
        Matrix matrix = this.f1558f;
        if (matrix == null) {
            matrix = new Matrix();
            this.f1558f = matrix;
        }
        this.f1556d.getMatrix(matrix);
        return matrix;
    }

    @Override // c1.e
    public final void E(m2.b bVar, m2.k kVar, c cVar, a aVar) {
        Canvas start = this.f1556d.start(Math.max((int) (this.f1557e >> 32), (int) (this.f1560h >> 32)), Math.max((int) (this.f1557e & 4294967295L), (int) (this.f1560h & 4294967295L)));
        try {
            z0.d dVar = this.f1554b.f10046a;
            Canvas canvas = dVar.f9984a;
            dVar.f9984a = start;
            b1.c cVar2 = this.f1555c;
            b1.b bVar2 = cVar2.f1234g;
            long o02 = j1.c.o0(this.f1557e);
            b1.a aVar2 = ((b1.c) bVar2.f1232i).f1233f;
            m2.b bVar3 = aVar2.f1225a;
            m2.k kVar2 = aVar2.f1226b;
            z0.r k8 = bVar2.k();
            long p6 = bVar2.p();
            c cVar3 = (c) bVar2.f1231h;
            bVar2.A(bVar);
            bVar2.B(kVar);
            bVar2.z(dVar);
            bVar2.C(o02);
            bVar2.f1231h = cVar;
            dVar.o();
            try {
                aVar.f(cVar2);
                dVar.n();
                bVar2.A(bVar3);
                bVar2.B(kVar2);
                bVar2.z(k8);
                bVar2.C(p6);
                bVar2.f1231h = cVar3;
                dVar.f9984a = canvas;
                this.f1556d.end(start);
            } catch (Throwable th) {
                dVar.n();
                b1.b bVar4 = cVar2.f1234g;
                bVar4.A(bVar3);
                bVar4.B(kVar2);
                bVar4.z(k8);
                bVar4.C(p6);
                bVar4.f1231h = cVar3;
                throw th;
            }
        } catch (Throwable th2) {
            this.f1556d.end(start);
            throw th2;
        }
    }

    @Override // c1.e
    public final void F(int i7, int i8, long j8) {
        int i9 = (int) (j8 >> 32);
        int i10 = (int) (4294967295L & j8);
        this.f1556d.setLeftTopRightBottom(i7, i8, i7 + i9, i8 + i10);
        if (m2.j.a(this.f1557e, j8)) {
            return;
        }
        if (this.f1564l) {
            this.f1556d.setPivotX(i9 / 2.0f);
            this.f1556d.setPivotY(i10 / 2.0f);
        }
        this.f1557e = j8;
    }

    @Override // c1.e
    public final float G() {
        return 0.0f;
    }

    @Override // c1.e
    public final float H() {
        return this.f1567o;
    }

    @Override // c1.e
    public final float I() {
        return this.f1566n;
    }

    @Override // c1.e
    public final void J(z0.r rVar) {
        DisplayListCanvas a3 = z0.e.a(rVar);
        r6.k.d(a3, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        a3.drawRenderNode(this.f1556d);
    }

    @Override // c1.e
    public final float K() {
        return 0.0f;
    }

    @Override // c1.e
    public final int L() {
        return this.f1562j;
    }

    @Override // c1.e
    public final void M(long j8) {
        if (u3.r.i(j8)) {
            this.f1564l = true;
            this.f1556d.setPivotX(((int) (this.f1557e >> 32)) / 2.0f);
            this.f1556d.setPivotY(((int) (this.f1557e & 4294967295L)) / 2.0f);
        } else {
            this.f1564l = false;
            this.f1556d.setPivotX(y0.c.d(j8));
            this.f1556d.setPivotY(y0.c.e(j8));
        }
    }

    @Override // c1.e
    public final long N() {
        return this.f1568p;
    }

    @Override // c1.e
    public final float a() {
        return this.f1563k;
    }

    @Override // c1.e
    public final void b() {
        this.f1556d.setRotationX(0.0f);
    }

    @Override // c1.e
    public final void c(float f9) {
        this.f1563k = f9;
        this.f1556d.setAlpha(f9);
    }

    public final void d() {
        boolean z8 = this.f1571s;
        boolean z9 = false;
        boolean z10 = z8 && !this.f1559g;
        if (z8 && this.f1559g) {
            z9 = true;
        }
        if (z10 != this.f1572t) {
            this.f1572t = z10;
            this.f1556d.setClipToBounds(z10);
        }
        if (z9 != this.f1573u) {
            this.f1573u = z9;
            this.f1556d.setClipToOutline(z9);
        }
    }

    @Override // c1.e
    public final void e() {
        this.f1556d.setTranslationY(0.0f);
    }

    public final void f(int i7) {
        RenderNode renderNode = this.f1556d;
        if (i7 == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(true);
        } else if (i7 == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // c1.e
    public final void g() {
        this.f1556d.setRotationY(0.0f);
    }

    @Override // c1.e
    public final void h(float f9) {
        this.f1565m = f9;
        this.f1556d.setScaleX(f9);
    }

    @Override // c1.e
    public final void i() {
        m.f1615a.a(this.f1556d);
    }

    @Override // c1.e
    public final void j() {
        this.f1556d.setTranslationX(0.0f);
    }

    @Override // c1.e
    public final void k() {
        this.f1556d.setRotation(0.0f);
    }

    @Override // c1.e
    public final void l(float f9) {
        this.f1566n = f9;
        this.f1556d.setScaleY(f9);
    }

    @Override // c1.e
    public final void o(float f9) {
        this.f1570r = f9;
        this.f1556d.setCameraDistance(-f9);
    }

    @Override // c1.e
    public final boolean p() {
        return this.f1556d.isValid();
    }

    @Override // c1.e
    public final float q() {
        return this.f1565m;
    }

    @Override // c1.e
    public final void r(float f9) {
        this.f1567o = f9;
        this.f1556d.setElevation(f9);
    }

    @Override // c1.e
    public final float s() {
        return 0.0f;
    }

    @Override // c1.e
    public final long t() {
        return this.f1569q;
    }

    @Override // c1.e
    public final void u(long j8) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f1568p = j8;
            n.f1616a.c(this.f1556d, l0.w(j8));
        }
    }

    @Override // c1.e
    public final void v(Outline outline, long j8) {
        this.f1560h = j8;
        this.f1556d.setOutline(outline);
        this.f1559g = outline != null;
        d();
    }

    @Override // c1.e
    public final float w() {
        return this.f1570r;
    }

    @Override // c1.e
    public final float x() {
        return 0.0f;
    }

    @Override // c1.e
    public final void y(boolean z8) {
        this.f1571s = z8;
        d();
    }

    @Override // c1.e
    public final int z() {
        return this.f1561i;
    }
}
