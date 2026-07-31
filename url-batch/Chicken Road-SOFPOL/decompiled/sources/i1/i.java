package i1;

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
import f1.p;
import f1.q;
import f1.r;
import f1.s;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class i implements d {

    /* renamed from: w, reason: collision with root package name */
    public static final h f3358w = new h();

    /* renamed from: b, reason: collision with root package name */
    public final j1.a f3359b;

    /* renamed from: c, reason: collision with root package name */
    public final r f3360c;

    /* renamed from: d, reason: collision with root package name */
    public final m f3361d;

    /* renamed from: e, reason: collision with root package name */
    public final Resources f3362e;

    /* renamed from: f, reason: collision with root package name */
    public final Rect f3363f;

    /* renamed from: g, reason: collision with root package name */
    public Paint f3364g;

    /* renamed from: h, reason: collision with root package name */
    public int f3365h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public long f3366j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3367k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3368l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3369m;

    /* renamed from: n, reason: collision with root package name */
    public int f3370n;

    /* renamed from: o, reason: collision with root package name */
    public int f3371o;

    /* renamed from: p, reason: collision with root package name */
    public float f3372p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3373q;

    /* renamed from: r, reason: collision with root package name */
    public float f3374r;

    /* renamed from: s, reason: collision with root package name */
    public float f3375s;

    /* renamed from: t, reason: collision with root package name */
    public float f3376t;

    /* renamed from: u, reason: collision with root package name */
    public long f3377u;

    /* renamed from: v, reason: collision with root package name */
    public long f3378v;

    public i(j1.a aVar) {
        r rVar = new r();
        h1.b bVar = new h1.b();
        this.f3359b = aVar;
        this.f3360c = rVar;
        m mVar = new m(aVar, rVar, bVar);
        this.f3361d = mVar;
        this.f3362e = aVar.getResources();
        this.f3363f = new Rect();
        aVar.addView(mVar);
        mVar.setClipBounds(null);
        this.f3366j = 0L;
        View.generateViewId();
        this.f3370n = 3;
        this.f3371o = 0;
        this.f3372p = 1.0f;
        this.f3374r = 1.0f;
        this.f3375s = 1.0f;
        long j7 = s.f2698b;
        this.f3377u = j7;
        this.f3378v = j7;
    }

    @Override // i1.d
    public final void A(float f6) {
        this.f3375s = f6;
        this.f3361d.setScaleY(f6);
    }

    @Override // i1.d
    public final Matrix B() {
        return this.f3361d.getMatrix();
    }

    @Override // i1.d
    public final void C(int i, int i8, long j7) {
        boolean a8 = r2.k.a(this.f3366j, j7);
        m mVar = this.f3361d;
        if (a8) {
            int i9 = this.f3365h;
            if (i9 != i) {
                mVar.offsetLeftAndRight(i - i9);
            }
            int i10 = this.i;
            if (i10 != i8) {
                mVar.offsetTopAndBottom(i8 - i10);
            }
        } else {
            if (this.f3369m || mVar.getClipToOutline()) {
                this.f3367k = true;
            }
            int i11 = (int) (j7 >> 32);
            int i12 = (int) (4294967295L & j7);
            mVar.layout(i, i8, i + i11, i8 + i12);
            this.f3366j = j7;
            if (this.f3373q) {
                mVar.setPivotX(i11 / 2.0f);
                mVar.setPivotY(i12 / 2.0f);
            }
        }
        this.f3365h = i;
        this.i = i8;
    }

    @Override // i1.d
    public final float D() {
        return 0.0f;
    }

    @Override // i1.d
    public final void E(float f6) {
        this.f3361d.setCameraDistance(f6 * this.f3362e.getDisplayMetrics().densityDpi);
    }

    @Override // i1.d
    public final float F() {
        return this.f3376t;
    }

    @Override // i1.d
    public final void H(q qVar) {
        Rect rect;
        boolean z3 = this.f3367k;
        m mVar = this.f3361d;
        if (z3) {
            if ((this.f3369m || mVar.getClipToOutline()) && !this.f3368l) {
                rect = this.f3363f;
                rect.left = 0;
                rect.top = 0;
                rect.right = mVar.getWidth();
                rect.bottom = mVar.getHeight();
            } else {
                rect = null;
            }
            mVar.setClipBounds(rect);
        }
        if (f1.c.a(qVar).isHardwareAccelerated()) {
            this.f3359b.a(qVar, mVar, mVar.getDrawingTime());
        }
    }

    @Override // i1.d
    public final float I() {
        return this.f3375s;
    }

    @Override // i1.d
    public final float J() {
        return 0.0f;
    }

    @Override // i1.d
    public final int K() {
        return this.f3370n;
    }

    @Override // i1.d
    public final void L(long j7) {
        long j8 = 9223372034707292159L & j7;
        m mVar = this.f3361d;
        if (j8 != 9205357640488583168L) {
            this.f3373q = false;
            mVar.setPivotX(Float.intBitsToFloat((int) (j7 >> 32)));
            mVar.setPivotY(Float.intBitsToFloat((int) (j7 & 4294967295L)));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                mVar.resetPivot();
                return;
            }
            this.f3373q = true;
            mVar.setPivotX(((int) (this.f3366j >> 32)) / 2.0f);
            mVar.setPivotY(((int) (this.f3366j & 4294967295L)) / 2.0f);
        }
    }

    @Override // i1.d
    public final long M() {
        return this.f3377u;
    }

    public final void N(int i) {
        m mVar = this.f3361d;
        boolean z3 = true;
        if (i == 1) {
            mVar.setLayerType(2, this.f3364g);
        } else if (i == 2) {
            mVar.setLayerType(0, this.f3364g);
            z3 = false;
        } else {
            mVar.setLayerType(0, this.f3364g);
        }
        mVar.setCanUseCompositingLayer$ui_graphics_release(z3);
    }

    public final void O() {
        int i = this.f3371o;
        if (i != 1 && this.f3370n == 3) {
            N(i);
        } else {
            N(1);
        }
    }

    @Override // i1.d
    public final float a() {
        return this.f3372p;
    }

    @Override // i1.d
    public final void b() {
        this.f3361d.setRotationX(0.0f);
    }

    @Override // i1.d
    public final void c(r2.c cVar, r2.l lVar, b bVar, b1.e eVar) {
        m mVar = this.f3361d;
        ViewParent parent = mVar.getParent();
        j1.a aVar = this.f3359b;
        if (parent == null) {
            aVar.addView(mVar);
        }
        mVar.f3386j = cVar;
        mVar.f3387k = lVar;
        mVar.f3388l = eVar;
        mVar.f3389m = bVar;
        if (mVar.isAttachedToWindow()) {
            mVar.setVisibility(4);
            mVar.setVisibility(0);
            try {
                r rVar = this.f3360c;
                h hVar = f3358w;
                f1.b bVar2 = rVar.f2697a;
                Canvas canvas = bVar2.f2622a;
                bVar2.f2622a = hVar;
                aVar.a(bVar2, mVar, mVar.getDrawingTime());
                rVar.f2697a.f2622a = canvas;
            } catch (ClassCastException unused) {
            }
        }
    }

    @Override // i1.d
    public final void d(float f6) {
        this.f3372p = f6;
        this.f3361d.setAlpha(f6);
    }

    @Override // i1.d
    public final float e() {
        return this.f3374r;
    }

    @Override // i1.d
    public final void f(float f6) {
        this.f3376t = f6;
        this.f3361d.setElevation(f6);
    }

    @Override // i1.d
    public final float g() {
        return 0.0f;
    }

    @Override // i1.d
    public final void h() {
        this.f3361d.setTranslationY(0.0f);
    }

    @Override // i1.d
    public final void i() {
        this.f3361d.setRotationY(0.0f);
    }

    @Override // i1.d
    public final long j() {
        return this.f3378v;
    }

    @Override // i1.d
    public final void k(long j7) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f3377u = j7;
            this.f3361d.setOutlineAmbientShadowColor(p.u(j7));
        }
    }

    @Override // i1.d
    public final void l(Outline outline, long j7) {
        m mVar = this.f3361d;
        mVar.f3385h = outline;
        mVar.invalidateOutline();
        if ((this.f3369m || mVar.getClipToOutline()) && outline != null) {
            mVar.setClipToOutline(true);
            if (this.f3369m) {
                this.f3369m = false;
                this.f3367k = true;
            }
        }
        this.f3368l = outline != null;
    }

    @Override // i1.d
    public final void m() {
        Paint paint = this.f3364g;
        if (paint == null) {
            paint = new Paint();
            this.f3364g = paint;
        }
        paint.setColorFilter(null);
        O();
    }

    @Override // i1.d
    public final void n(float f6) {
        this.f3374r = f6;
        this.f3361d.setScaleX(f6);
    }

    @Override // i1.d
    public final void o(int i) {
        this.f3370n = i;
        Paint paint = this.f3364g;
        if (paint == null) {
            paint = new Paint();
            this.f3364g = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(p.x(i)));
        O();
    }

    @Override // i1.d
    public final float p() {
        return this.f3361d.getCameraDistance() / this.f3362e.getDisplayMetrics().densityDpi;
    }

    @Override // i1.d
    public final void q() {
        this.f3359b.removeViewInLayout(this.f3361d);
    }

    @Override // i1.d
    public final float r() {
        return 0.0f;
    }

    @Override // i1.d
    public final void s() {
        this.f3361d.setTranslationX(0.0f);
    }

    @Override // i1.d
    public final void t(boolean z3) {
        boolean z7 = false;
        this.f3369m = z3 && !this.f3368l;
        this.f3367k = true;
        if (z3 && this.f3368l) {
            z7 = true;
        }
        this.f3361d.setClipToOutline(z7);
    }

    @Override // i1.d
    public final int u() {
        return this.f3371o;
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
        this.f3371o = i;
        O();
    }

    @Override // i1.d
    public final void y() {
        this.f3361d.setRotation(0.0f);
    }

    @Override // i1.d
    public final void z(long j7) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f3378v = j7;
            this.f3361d.setOutlineSpotShadowColor(p.u(j7));
        }
    }
}
