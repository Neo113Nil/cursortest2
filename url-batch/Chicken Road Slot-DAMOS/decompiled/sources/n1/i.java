package n1;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import k1.n;
import k1.o;
import k1.p;
import k1.v;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i implements d {

    /* renamed from: v, reason: collision with root package name */
    public static final h f6959v = new h();

    /* renamed from: b, reason: collision with root package name */
    public final o1.a f6960b;

    /* renamed from: c, reason: collision with root package name */
    public final o f6961c;

    /* renamed from: d, reason: collision with root package name */
    public final l f6962d;

    /* renamed from: e, reason: collision with root package name */
    public final Resources f6963e;

    /* renamed from: f, reason: collision with root package name */
    public final Rect f6964f;
    public Paint g;

    /* renamed from: h, reason: collision with root package name */
    public int f6965h;

    /* renamed from: i, reason: collision with root package name */
    public int f6966i;
    public long j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f6967k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f6968l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f6969m;

    /* renamed from: n, reason: collision with root package name */
    public int f6970n;

    /* renamed from: o, reason: collision with root package name */
    public int f6971o;

    /* renamed from: p, reason: collision with root package name */
    public float f6972p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f6973q;

    /* renamed from: r, reason: collision with root package name */
    public float f6974r;

    /* renamed from: s, reason: collision with root package name */
    public float f6975s;

    /* renamed from: t, reason: collision with root package name */
    public long f6976t;

    /* renamed from: u, reason: collision with root package name */
    public long f6977u;

    public i(o1.a aVar) {
        o oVar = new o();
        m1.b bVar = new m1.b();
        this.f6960b = aVar;
        this.f6961c = oVar;
        l lVar = new l(aVar, oVar, bVar);
        this.f6962d = lVar;
        this.f6963e = aVar.getResources();
        this.f6964f = new Rect();
        aVar.addView(lVar);
        lVar.setClipBounds(null);
        this.j = 0L;
        View.generateViewId();
        this.f6970n = 3;
        this.f6971o = 0;
        this.f6972p = 1.0f;
        this.f6974r = 1.0f;
        this.f6975s = 1.0f;
        long j = p.f5336b;
        this.f6976t = j;
        this.f6977u = j;
    }

    @Override // n1.d
    public final void A(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f6977u = j;
            this.f6962d.setOutlineSpotShadowColor(v.r(j));
        }
    }

    @Override // n1.d
    public final void B(float f3) {
        this.f6975s = f3;
        this.f6962d.setScaleY(f3);
    }

    @Override // n1.d
    public final Matrix C() {
        return this.f6962d.getMatrix();
    }

    @Override // n1.d
    public final void D(int i3, int i10, long j) {
        boolean a9 = x2.k.a(this.j, j);
        l lVar = this.f6962d;
        if (a9) {
            int i11 = this.f6965h;
            if (i11 != i3) {
                lVar.offsetLeftAndRight(i3 - i11);
            }
            int i12 = this.f6966i;
            if (i12 != i10) {
                lVar.offsetTopAndBottom(i10 - i12);
            }
        } else {
            if (this.f6969m || lVar.getClipToOutline()) {
                this.f6967k = true;
            }
            int i13 = (int) (j >> 32);
            int i14 = (int) (4294967295L & j);
            lVar.layout(i3, i10, i3 + i13, i10 + i14);
            this.j = j;
            if (this.f6973q) {
                lVar.setPivotX(i13 / 2.0f);
                lVar.setPivotY(i14 / 2.0f);
            }
        }
        this.f6965h = i3;
        this.f6966i = i10;
    }

    @Override // n1.d
    public final float E() {
        return 0.0f;
    }

    @Override // n1.d
    public final void F(float f3) {
        this.f6962d.setCameraDistance(f3 * this.f6963e.getDisplayMetrics().densityDpi);
    }

    @Override // n1.d
    public final float G() {
        return 0.0f;
    }

    @Override // n1.d
    public final float I() {
        return this.f6975s;
    }

    @Override // n1.d
    public final float J() {
        return 0.0f;
    }

    @Override // n1.d
    public final int K() {
        return this.f6970n;
    }

    @Override // n1.d
    public final void L(long j) {
        long j3 = 9223372034707292159L & j;
        l lVar = this.f6962d;
        if (j3 != 9205357640488583168L) {
            this.f6973q = false;
            lVar.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            lVar.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                lVar.resetPivot();
                return;
            }
            this.f6973q = true;
            lVar.setPivotX(((int) (this.j >> 32)) / 2.0f);
            lVar.setPivotY(((int) (this.j & 4294967295L)) / 2.0f);
        }
    }

    @Override // n1.d
    public final long M() {
        return this.f6976t;
    }

    public final void N(int i3) {
        l lVar = this.f6962d;
        boolean z10 = true;
        if (i3 == 1) {
            lVar.setLayerType(2, this.g);
        } else {
            Paint paint = this.g;
            if (i3 == 2) {
                lVar.setLayerType(0, paint);
                z10 = false;
            } else {
                lVar.setLayerType(0, paint);
            }
        }
        lVar.setCanUseCompositingLayer$ui_graphics(z10);
    }

    public final void O() {
        int i3 = this.f6971o;
        if (i3 != 1 && this.f6970n == 3) {
            N(i3);
        } else {
            N(1);
        }
    }

    @Override // n1.d
    public final float a() {
        return this.f6972p;
    }

    @Override // n1.d
    public final void b() {
        this.f6962d.setRotationX(0.0f);
    }

    @Override // n1.d
    public final void c(float f3) {
        this.f6972p = f3;
        this.f6962d.setAlpha(f3);
    }

    @Override // n1.d
    public final float d() {
        return this.f6974r;
    }

    @Override // n1.d
    public final void e(n nVar) {
        Rect rect;
        boolean z10 = this.f6967k;
        l lVar = this.f6962d;
        if (z10) {
            if ((this.f6969m || lVar.getClipToOutline()) && !this.f6968l) {
                rect = this.f6964f;
                rect.left = 0;
                rect.top = 0;
                rect.right = lVar.getWidth();
                rect.bottom = lVar.getHeight();
            } else {
                rect = null;
            }
            lVar.setClipBounds(rect);
        }
        Canvas canvas = k1.c.f5301a;
        if (((k1.b) nVar).f5296a.isHardwareAccelerated()) {
            this.f6960b.a(nVar, lVar, lVar.getDrawingTime());
        }
    }

    @Override // n1.d
    public final float f() {
        return 0.0f;
    }

    @Override // n1.d
    public final void g() {
        this.f6962d.setTranslationY(0.0f);
    }

    @Override // n1.d
    public final void h() {
        this.f6962d.setRotationY(0.0f);
    }

    @Override // n1.d
    public final long i() {
        return this.f6977u;
    }

    @Override // n1.d
    public final void j(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f6976t = j;
            this.f6962d.setOutlineAmbientShadowColor(v.r(j));
        }
    }

    @Override // n1.d
    public final void k(Outline outline, long j) {
        l lVar = this.f6962d;
        lVar.f6983s = outline;
        lVar.invalidateOutline();
        if ((this.f6969m || lVar.getClipToOutline()) && outline != null) {
            lVar.setClipToOutline(true);
            if (this.f6969m) {
                this.f6969m = false;
                this.f6967k = true;
            }
        }
        this.f6968l = outline != null;
    }

    @Override // n1.d
    public final void l() {
        Paint paint = this.g;
        if (paint == null) {
            paint = new Paint();
            this.g = paint;
        }
        paint.setColorFilter(null);
        O();
    }

    @Override // n1.d
    public final void m(float f3) {
        this.f6974r = f3;
        this.f6962d.setScaleX(f3);
    }

    @Override // n1.d
    public final void n(int i3) {
        this.f6970n = i3;
        Paint paint = this.g;
        if (paint == null) {
            paint = new Paint();
            this.g = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(v.t(i3)));
        O();
    }

    @Override // n1.d
    public final float o() {
        return this.f6962d.getCameraDistance() / this.f6963e.getDisplayMetrics().densityDpi;
    }

    @Override // n1.d
    public final void p() {
        this.f6960b.removeViewInLayout(this.f6962d);
    }

    @Override // n1.d
    public final void q() {
        this.f6962d.setElevation(0.0f);
    }

    @Override // n1.d
    public final float r() {
        return 0.0f;
    }

    @Override // n1.d
    public final void s(x2.c cVar, x2.l lVar, b bVar, a3.e eVar) {
        l lVar2 = this.f6962d;
        ViewParent parent = lVar2.getParent();
        o1.a aVar = this.f6960b;
        if (parent == null) {
            aVar.addView(lVar2);
        }
        lVar2.f6985u = cVar;
        lVar2.f6986v = lVar;
        lVar2.f6987w = eVar;
        lVar2.f6988x = bVar;
        if (lVar2.isAttachedToWindow()) {
            lVar2.setVisibility(4);
            lVar2.setVisibility(0);
            try {
                o oVar = this.f6961c;
                h hVar = f6959v;
                k1.b bVar2 = oVar.f5335a;
                Canvas canvas = bVar2.f5296a;
                bVar2.f5296a = hVar;
                aVar.a(bVar2, lVar2, lVar2.getDrawingTime());
                oVar.f5335a.f5296a = canvas;
            } catch (ClassCastException unused) {
            }
        }
    }

    @Override // n1.d
    public final void t() {
        this.f6962d.setTranslationX(0.0f);
    }

    @Override // n1.d
    public final void u(boolean z10) {
        boolean z11 = false;
        this.f6969m = z10 && !this.f6968l;
        this.f6967k = true;
        if (z10 && this.f6968l) {
            z11 = true;
        }
        this.f6962d.setClipToOutline(z11);
    }

    @Override // n1.d
    public final int v() {
        return this.f6971o;
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
        this.f6971o = i3;
        O();
    }

    @Override // n1.d
    public final void z() {
        this.f6962d.setRotation(0.0f);
    }
}
