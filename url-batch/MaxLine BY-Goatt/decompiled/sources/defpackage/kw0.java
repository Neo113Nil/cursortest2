package defpackage;

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

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class kw0 implements ew0 {
    public static final jw0 w = new jw0();
    public final ud0 b;
    public final os c;
    public final l53 d;
    public final Resources e;
    public final Rect f;
    public Paint g;
    public int h;
    public int i;
    public long j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public float p;
    public boolean q;
    public float r;
    public float s;
    public float t;
    public long u;
    public long v;

    public kw0(ud0 ud0Var) {
        os osVar = new os();
        ns nsVar = new ns();
        this.b = ud0Var;
        this.c = osVar;
        l53 l53Var = new l53(ud0Var, osVar, nsVar);
        this.d = l53Var;
        this.e = ud0Var.getResources();
        this.f = new Rect();
        ud0Var.addView(l53Var);
        l53Var.setClipBounds(null);
        this.j = 0L;
        View.generateViewId();
        this.n = 3;
        this.o = 0;
        this.p = 1.0f;
        this.r = 1.0f;
        this.s = 1.0f;
        long j = aw.b;
        this.u = j;
        this.v = j;
    }

    @Override // defpackage.ew0
    public final void A(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.v = j;
            km.u(this.d, ap.H(j));
        }
    }

    @Override // defpackage.ew0
    public final void B(float f) {
        this.s = f;
        this.d.setScaleY(f);
    }

    @Override // defpackage.ew0
    public final Matrix C() {
        return this.d.getMatrix();
    }

    @Override // defpackage.ew0
    public final void D(int i, int i2, long j) {
        boolean a = x31.a(this.j, j);
        l53 l53Var = this.d;
        if (a) {
            int i3 = this.h;
            if (i3 != i) {
                l53Var.offsetLeftAndRight(i - i3);
            }
            int i4 = this.i;
            if (i4 != i2) {
                l53Var.offsetTopAndBottom(i2 - i4);
            }
        } else {
            if (this.m || l53Var.getClipToOutline()) {
                this.k = true;
            }
            int i5 = (int) (j >> 32);
            int i6 = (int) (4294967295L & j);
            l53Var.layout(i, i2, i + i5, i2 + i6);
            this.j = j;
            if (this.q) {
                l53Var.setPivotX(i5 / 2.0f);
                l53Var.setPivotY(i6 / 2.0f);
            }
        }
        this.h = i;
        this.i = i2;
    }

    @Override // defpackage.ew0
    public final float E() {
        return 0.0f;
    }

    @Override // defpackage.ew0
    public final void F(float f) {
        this.d.setCameraDistance(f * this.e.getDisplayMetrics().densityDpi);
    }

    @Override // defpackage.ew0
    public final float G() {
        return this.t;
    }

    @Override // defpackage.ew0
    public final float I() {
        return this.s;
    }

    @Override // defpackage.ew0
    public final float J() {
        return 0.0f;
    }

    @Override // defpackage.ew0
    public final int K() {
        return this.n;
    }

    @Override // defpackage.ew0
    public final void L(long j) {
        long j2 = 9223372034707292159L & j;
        l53 l53Var = this.d;
        if (j2 != 9205357640488583168L) {
            this.q = false;
            l53Var.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            l53Var.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                km.q(l53Var);
                return;
            }
            this.q = true;
            l53Var.setPivotX(((int) (this.j >> 32)) / 2.0f);
            l53Var.setPivotY(((int) (this.j & 4294967295L)) / 2.0f);
        }
    }

    @Override // defpackage.ew0
    public final long M() {
        return this.u;
    }

    public final void N(int i) {
        l53 l53Var = this.d;
        boolean z = true;
        if (i == 1) {
            l53Var.setLayerType(2, this.g);
        } else {
            Paint paint = this.g;
            if (i == 2) {
                l53Var.setLayerType(0, paint);
                z = false;
            } else {
                l53Var.setLayerType(0, paint);
            }
        }
        l53Var.setCanUseCompositingLayer$ui_graphics_release(z);
    }

    public final void O() {
        int i = this.o;
        if (i != 1 && this.n == 3) {
            N(i);
        } else {
            N(1);
        }
    }

    @Override // defpackage.ew0
    public final float a() {
        return this.p;
    }

    @Override // defpackage.ew0
    public final void b() {
        this.d.setRotationX(0.0f);
    }

    @Override // defpackage.ew0
    public final void c(float f) {
        this.p = f;
        this.d.setAlpha(f);
    }

    @Override // defpackage.ew0
    public final float d() {
        return this.r;
    }

    @Override // defpackage.ew0
    public final void e(float f) {
        this.t = f;
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
        return this.v;
    }

    @Override // defpackage.ew0
    public final void j(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.u = j;
            km.t(this.d, ap.H(j));
        }
    }

    @Override // defpackage.ew0
    public final void k(Outline outline, long j) {
        l53 l53Var = this.d;
        l53Var.q = outline;
        l53Var.invalidateOutline();
        if ((this.m || l53Var.getClipToOutline()) && outline != null) {
            l53Var.setClipToOutline(true);
            if (this.m) {
                this.m = false;
                this.k = true;
            }
        }
        this.l = outline != null;
    }

    @Override // defpackage.ew0
    public final void l() {
        Paint paint = this.g;
        if (paint == null) {
            paint = new Paint();
            this.g = paint;
        }
        paint.setColorFilter(null);
        O();
    }

    @Override // defpackage.ew0
    public final void m(float f) {
        this.r = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.ew0
    public final void n(int i) {
        this.n = i;
        Paint paint = this.g;
        if (paint == null) {
            paint = new Paint();
            this.g = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(x6.w(i)));
        O();
    }

    @Override // defpackage.ew0
    public final float o() {
        return this.d.getCameraDistance() / this.e.getDisplayMetrics().densityDpi;
    }

    @Override // defpackage.ew0
    public final void p() {
        this.b.removeViewInLayout(this.d);
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
        Rect rect;
        boolean z = this.k;
        l53 l53Var = this.d;
        if (z) {
            if ((this.m || l53Var.getClipToOutline()) && !this.l) {
                rect = this.f;
                rect.left = 0;
                rect.top = 0;
                rect.right = l53Var.getWidth();
                rect.bottom = l53Var.getHeight();
            } else {
                rect = null;
            }
            l53Var.setClipBounds(rect);
        }
        Canvas canvas = z6.a;
        if (((y6) lsVar).a.isHardwareAccelerated()) {
            this.b.a(lsVar, l53Var, l53Var.getDrawingTime());
        }
    }

    @Override // defpackage.ew0
    public final void t(boolean z) {
        boolean z2 = false;
        this.m = z && !this.l;
        this.k = true;
        if (z && this.l) {
            z2 = true;
        }
        this.d.setClipToOutline(z2);
    }

    @Override // defpackage.ew0
    public final int u() {
        return this.o;
    }

    @Override // defpackage.ew0
    public final float v() {
        return 0.0f;
    }

    @Override // defpackage.ew0
    public final void w(ca0 ca0Var, u81 u81Var, dw0 dw0Var, j6 j6Var) {
        l53 l53Var = this.d;
        ViewParent parent = l53Var.getParent();
        ud0 ud0Var = this.b;
        if (parent == null) {
            ud0Var.addView(l53Var);
        }
        l53Var.s = ca0Var;
        l53Var.t = u81Var;
        l53Var.u = j6Var;
        l53Var.v = dw0Var;
        if (l53Var.isAttachedToWindow()) {
            l53Var.setVisibility(4);
            l53Var.setVisibility(0);
            try {
                os osVar = this.c;
                jw0 jw0Var = w;
                y6 y6Var = osVar.a;
                Canvas canvas = y6Var.a;
                y6Var.a = jw0Var;
                ud0Var.a(y6Var, l53Var, l53Var.getDrawingTime());
                osVar.a.a = canvas;
            } catch (ClassCastException unused) {
            }
        }
    }

    @Override // defpackage.ew0
    public final mo x() {
        return null;
    }

    @Override // defpackage.ew0
    public final void y(int i) {
        this.o = i;
        O();
    }

    @Override // defpackage.ew0
    public final void z() {
        this.d.setRotation(0.0f);
    }
}
