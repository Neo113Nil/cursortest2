package c1;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import z0.l0;
import z0.r;
import z0.s;
import z0.u;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j implements e {

    /* renamed from: v, reason: collision with root package name */
    public static final i f1592v = new i();

    /* renamed from: b, reason: collision with root package name */
    public final d1.a f1593b;

    /* renamed from: c, reason: collision with root package name */
    public final s f1594c;

    /* renamed from: d, reason: collision with root package name */
    public final p f1595d;

    /* renamed from: e, reason: collision with root package name */
    public final Resources f1596e;

    /* renamed from: f, reason: collision with root package name */
    public final Rect f1597f;

    /* renamed from: g, reason: collision with root package name */
    public int f1598g;

    /* renamed from: h, reason: collision with root package name */
    public int f1599h;

    /* renamed from: i, reason: collision with root package name */
    public long f1600i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1601j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1602k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1603l;

    /* renamed from: m, reason: collision with root package name */
    public final int f1604m;

    /* renamed from: n, reason: collision with root package name */
    public int f1605n;

    /* renamed from: o, reason: collision with root package name */
    public float f1606o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1607p;

    /* renamed from: q, reason: collision with root package name */
    public float f1608q;

    /* renamed from: r, reason: collision with root package name */
    public float f1609r;

    /* renamed from: s, reason: collision with root package name */
    public float f1610s;

    /* renamed from: t, reason: collision with root package name */
    public long f1611t;

    /* renamed from: u, reason: collision with root package name */
    public long f1612u;

    public j(d1.a aVar) {
        s sVar = new s();
        b1.c cVar = new b1.c();
        this.f1593b = aVar;
        this.f1594c = sVar;
        p pVar = new p(aVar, sVar, cVar);
        this.f1595d = pVar;
        this.f1596e = aVar.getResources();
        this.f1597f = new Rect();
        aVar.addView(pVar);
        pVar.setClipBounds(null);
        this.f1600i = 0L;
        View.generateViewId();
        this.f1604m = 3;
        this.f1605n = 0;
        this.f1606o = 1.0f;
        this.f1608q = 1.0f;
        this.f1609r = 1.0f;
        long j8 = u.f10052b;
        this.f1611t = j8;
        this.f1612u = j8;
    }

    @Override // c1.e
    public final float A() {
        return 0.0f;
    }

    @Override // c1.e
    public final void B(int i7) {
        this.f1605n = i7;
        p pVar = this.f1595d;
        boolean z8 = true;
        if (i7 == 1 || this.f1604m != 3) {
            pVar.setLayerType(2, null);
            pVar.setCanUseCompositingLayer$ui_graphics_release(true);
            return;
        }
        if (i7 == 1) {
            pVar.setLayerType(2, null);
        } else if (i7 == 2) {
            pVar.setLayerType(0, null);
            z8 = false;
        } else {
            pVar.setLayerType(0, null);
        }
        pVar.setCanUseCompositingLayer$ui_graphics_release(z8);
    }

    @Override // c1.e
    public final void C(long j8) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f1612u = j8;
            this.f1595d.setOutlineSpotShadowColor(l0.w(j8));
        }
    }

    @Override // c1.e
    public final Matrix D() {
        return this.f1595d.getMatrix();
    }

    @Override // c1.e
    public final void E(m2.b bVar, m2.k kVar, c cVar, a aVar) {
        p pVar = this.f1595d;
        ViewParent parent = pVar.getParent();
        d1.a aVar2 = this.f1593b;
        if (parent == null) {
            aVar2.addView(pVar);
        }
        pVar.f1625l = bVar;
        pVar.f1626m = kVar;
        pVar.f1627n = aVar;
        pVar.f1628o = cVar;
        if (pVar.isAttachedToWindow()) {
            pVar.setVisibility(4);
            pVar.setVisibility(0);
            try {
                s sVar = this.f1594c;
                i iVar = f1592v;
                z0.d dVar = sVar.f10046a;
                Canvas canvas = dVar.f9984a;
                dVar.f9984a = iVar;
                aVar2.a(dVar, pVar, pVar.getDrawingTime());
                sVar.f10046a.f9984a = canvas;
            } catch (Throwable unused) {
            }
        }
    }

    @Override // c1.e
    public final void F(int i7, int i8, long j8) {
        boolean a3 = m2.j.a(this.f1600i, j8);
        p pVar = this.f1595d;
        if (a3) {
            int i9 = this.f1598g;
            if (i9 != i7) {
                pVar.offsetLeftAndRight(i7 - i9);
            }
            int i10 = this.f1599h;
            if (i10 != i8) {
                pVar.offsetTopAndBottom(i8 - i10);
            }
        } else {
            if (this.f1603l || pVar.getClipToOutline()) {
                this.f1601j = true;
            }
            int i11 = (int) (j8 >> 32);
            int i12 = (int) (4294967295L & j8);
            pVar.layout(i7, i8, i7 + i11, i8 + i12);
            this.f1600i = j8;
            if (this.f1607p) {
                pVar.setPivotX(i11 / 2.0f);
                pVar.setPivotY(i12 / 2.0f);
            }
        }
        this.f1598g = i7;
        this.f1599h = i8;
    }

    @Override // c1.e
    public final float G() {
        return 0.0f;
    }

    @Override // c1.e
    public final float H() {
        return this.f1610s;
    }

    @Override // c1.e
    public final float I() {
        return this.f1609r;
    }

    @Override // c1.e
    public final void J(r rVar) {
        Rect rect;
        boolean z8 = this.f1601j;
        p pVar = this.f1595d;
        if (z8) {
            if ((this.f1603l || pVar.getClipToOutline()) && !this.f1602k) {
                rect = this.f1597f;
                rect.left = 0;
                rect.top = 0;
                rect.right = pVar.getWidth();
                rect.bottom = pVar.getHeight();
            } else {
                rect = null;
            }
            pVar.setClipBounds(rect);
        }
        if (z0.e.a(rVar).isHardwareAccelerated()) {
            this.f1593b.a(rVar, pVar, pVar.getDrawingTime());
        }
    }

    @Override // c1.e
    public final float K() {
        return 0.0f;
    }

    @Override // c1.e
    public final int L() {
        return this.f1604m;
    }

    @Override // c1.e
    public final void M(long j8) {
        boolean i7 = u3.r.i(j8);
        p pVar = this.f1595d;
        if (!i7) {
            this.f1607p = false;
            pVar.setPivotX(y0.c.d(j8));
            pVar.setPivotY(y0.c.e(j8));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                pVar.resetPivot();
                return;
            }
            this.f1607p = true;
            pVar.setPivotX(((int) (this.f1600i >> 32)) / 2.0f);
            pVar.setPivotY(((int) (this.f1600i & 4294967295L)) / 2.0f);
        }
    }

    @Override // c1.e
    public final long N() {
        return this.f1611t;
    }

    @Override // c1.e
    public final float a() {
        return this.f1606o;
    }

    @Override // c1.e
    public final void b() {
        this.f1595d.setRotationX(0.0f);
    }

    @Override // c1.e
    public final void c(float f9) {
        this.f1606o = f9;
        this.f1595d.setAlpha(f9);
    }

    @Override // c1.e
    public final void e() {
        this.f1595d.setTranslationY(0.0f);
    }

    @Override // c1.e
    public final void g() {
        this.f1595d.setRotationY(0.0f);
    }

    @Override // c1.e
    public final void h(float f9) {
        this.f1608q = f9;
        this.f1595d.setScaleX(f9);
    }

    @Override // c1.e
    public final void i() {
        this.f1593b.removeViewInLayout(this.f1595d);
    }

    @Override // c1.e
    public final void j() {
        this.f1595d.setTranslationX(0.0f);
    }

    @Override // c1.e
    public final void k() {
        this.f1595d.setRotation(0.0f);
    }

    @Override // c1.e
    public final void l(float f9) {
        this.f1609r = f9;
        this.f1595d.setScaleY(f9);
    }

    @Override // c1.e
    public final void o(float f9) {
        this.f1595d.setCameraDistance(f9 * this.f1596e.getDisplayMetrics().densityDpi);
    }

    @Override // c1.e
    public final float q() {
        return this.f1608q;
    }

    @Override // c1.e
    public final void r(float f9) {
        this.f1610s = f9;
        this.f1595d.setElevation(f9);
    }

    @Override // c1.e
    public final float s() {
        return 0.0f;
    }

    @Override // c1.e
    public final long t() {
        return this.f1612u;
    }

    @Override // c1.e
    public final void u(long j8) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f1611t = j8;
            this.f1595d.setOutlineAmbientShadowColor(l0.w(j8));
        }
    }

    @Override // c1.e
    public final void v(Outline outline, long j8) {
        p pVar = this.f1595d;
        pVar.f1623j = outline;
        pVar.invalidateOutline();
        if ((this.f1603l || pVar.getClipToOutline()) && outline != null) {
            pVar.setClipToOutline(true);
            if (this.f1603l) {
                this.f1603l = false;
                this.f1601j = true;
            }
        }
        this.f1602k = outline != null;
    }

    @Override // c1.e
    public final float w() {
        return this.f1595d.getCameraDistance() / this.f1596e.getDisplayMetrics().densityDpi;
    }

    @Override // c1.e
    public final float x() {
        return 0.0f;
    }

    @Override // c1.e
    public final void y(boolean z8) {
        boolean z9 = false;
        this.f1603l = z8 && !this.f1602k;
        this.f1601j = true;
        if (z8 && this.f1602k) {
            z9 = true;
        }
        this.f1595d.setClipToOutline(z9);
    }

    @Override // c1.e
    public final int z() {
        return this.f1605n;
    }
}
