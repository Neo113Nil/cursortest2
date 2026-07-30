package s1;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class n2 extends View implements r1.f1 {

    /* renamed from: u, reason: collision with root package name */
    public static final c1.o f8312u = new c1.o(3);

    /* renamed from: v, reason: collision with root package name */
    public static Method f8313v;

    /* renamed from: w, reason: collision with root package name */
    public static Field f8314w;

    /* renamed from: x, reason: collision with root package name */
    public static boolean f8315x;

    /* renamed from: y, reason: collision with root package name */
    public static boolean f8316y;

    /* renamed from: f, reason: collision with root package name */
    public final r f8317f;

    /* renamed from: g, reason: collision with root package name */
    public final l1 f8318g;

    /* renamed from: h, reason: collision with root package name */
    public q6.e f8319h;

    /* renamed from: i, reason: collision with root package name */
    public q6.a f8320i;

    /* renamed from: j, reason: collision with root package name */
    public final u1 f8321j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f8322k;

    /* renamed from: l, reason: collision with root package name */
    public Rect f8323l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8324m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f8325n;

    /* renamed from: o, reason: collision with root package name */
    public final z0.s f8326o;

    /* renamed from: p, reason: collision with root package name */
    public final r1 f8327p;

    /* renamed from: q, reason: collision with root package name */
    public long f8328q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f8329r;

    /* renamed from: s, reason: collision with root package name */
    public final long f8330s;

    /* renamed from: t, reason: collision with root package name */
    public int f8331t;

    public n2(r rVar, l1 l1Var, q6.e eVar, q6.a aVar) {
        super(rVar.getContext());
        this.f8317f = rVar;
        this.f8318g = l1Var;
        this.f8319h = eVar;
        this.f8320i = aVar;
        this.f8321j = new u1();
        this.f8326o = new z0.s();
        this.f8327p = new r1(c1.f8185j);
        this.f8328q = z0.s0.f10047b;
        this.f8329r = true;
        setWillNotDraw(false);
        l1Var.addView(this);
        this.f8330s = View.generateViewId();
    }

    private final z0.k0 getManualClipPath() {
        if (!getClipToOutline()) {
            return null;
        }
        u1 u1Var = this.f8321j;
        if (!u1Var.f8441g) {
            return null;
        }
        u1Var.d();
        return u1Var.f8439e;
    }

    private final void setInvalidated(boolean z8) {
        if (z8 != this.f8324m) {
            this.f8324m = z8;
            this.f8317f.s(this, z8);
        }
    }

    @Override // r1.f1
    public final void a(q6.e eVar, q6.a aVar) {
        this.f8318g.addView(this);
        this.f8322k = false;
        this.f8325n = false;
        int i7 = z0.s0.f10048c;
        this.f8328q = z0.s0.f10047b;
        this.f8319h = eVar;
        this.f8320i = aVar;
    }

    @Override // r1.f1
    public final long b(long j8, boolean z8) {
        r1 r1Var = this.f8327p;
        if (!z8) {
            return z0.f0.b(j8, r1Var.b(this));
        }
        float[] a3 = r1Var.a(this);
        if (a3 != null) {
            return z0.f0.b(j8, a3);
        }
        return 9187343241974906880L;
    }

    @Override // r1.f1
    public final void c(z0.n0 n0Var) {
        q6.a aVar;
        int i7 = n0Var.f10014f | this.f8331t;
        if ((i7 & 4096) != 0) {
            long j8 = n0Var.f10022n;
            this.f8328q = j8;
            setPivotX(z0.s0.b(j8) * getWidth());
            setPivotY(z0.s0.c(this.f8328q) * getHeight());
        }
        if ((i7 & 1) != 0) {
            setScaleX(n0Var.f10015g);
        }
        if ((i7 & 2) != 0) {
            setScaleY(n0Var.f10016h);
        }
        if ((i7 & 4) != 0) {
            setAlpha(n0Var.f10017i);
        }
        if ((i7 & 8) != 0) {
            setTranslationX(0.0f);
        }
        if ((i7 & 16) != 0) {
            setTranslationY(0.0f);
        }
        if ((i7 & 32) != 0) {
            setElevation(n0Var.f10018j);
        }
        if ((i7 & 1024) != 0) {
            setRotation(0.0f);
        }
        if ((i7 & 256) != 0) {
            setRotationX(0.0f);
        }
        if ((i7 & 512) != 0) {
            setRotationY(0.0f);
        }
        if ((i7 & 2048) != 0) {
            setCameraDistancePx(n0Var.f10021m);
        }
        boolean z8 = getManualClipPath() != null;
        boolean z9 = n0Var.f10024p;
        j4.i iVar = z0.l0.f10006a;
        boolean z10 = z9 && n0Var.f10023o != iVar;
        if ((i7 & 24576) != 0) {
            this.f8322k = z9 && n0Var.f10023o == iVar;
            l();
            setClipToOutline(z10);
        }
        boolean c4 = this.f8321j.c(n0Var.f10028t, n0Var.f10017i, z10, n0Var.f10018j, n0Var.f10025q);
        u1 u1Var = this.f8321j;
        if (u1Var.f8440f) {
            setOutlineProvider(u1Var.b() != null ? f8312u : null);
        }
        boolean z11 = getManualClipPath() != null;
        if (z8 != z11 || (z11 && c4)) {
            invalidate();
        }
        if (!this.f8325n && getElevation() > 0.0f && (aVar = this.f8320i) != null) {
            aVar.a();
        }
        if ((i7 & 7963) != 0) {
            this.f8327p.c();
        }
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 28) {
            int i9 = i7 & 64;
            p2 p2Var = p2.f8349a;
            if (i9 != 0) {
                p2Var.a(this, z0.l0.w(n0Var.f10019k));
            }
            if ((i7 & 128) != 0) {
                p2Var.b(this, z0.l0.w(n0Var.f10020l));
            }
        }
        if (i8 >= 31 && (131072 & i7) != 0) {
            q2.f8358a.a(this, null);
        }
        if ((i7 & 32768) != 0) {
            setLayerType(0, null);
            this.f8329r = true;
        }
        this.f8331t = n0Var.f10014f;
    }

    @Override // r1.f1
    public final void d(long j8) {
        int i7 = (int) (j8 >> 32);
        int i8 = (int) (j8 & 4294967295L);
        if (i7 == getWidth() && i8 == getHeight()) {
            return;
        }
        setPivotX(z0.s0.b(this.f8328q) * i7);
        setPivotY(z0.s0.c(this.f8328q) * i8);
        setOutlineProvider(this.f8321j.b() != null ? f8312u : null);
        layout(getLeft(), getTop(), getLeft() + i7, getTop() + i8);
        l();
        this.f8327p.c();
    }

    @Override // r1.f1
    public final void destroy() {
        setInvalidated(false);
        r rVar = this.f8317f;
        rVar.D = true;
        this.f8319h = null;
        this.f8320i = null;
        rVar.B(this);
        this.f8318g.removeViewInLayout(this);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z8;
        z0.s sVar = this.f8326o;
        z0.d dVar = sVar.f10046a;
        Canvas canvas2 = dVar.f9984a;
        dVar.f9984a = canvas;
        if (getManualClipPath() == null && canvas.isHardwareAccelerated()) {
            z8 = false;
        } else {
            dVar.o();
            this.f8321j.a(dVar);
            z8 = true;
        }
        q6.e eVar = this.f8319h;
        if (eVar != null) {
            eVar.d(dVar, null);
        }
        if (z8) {
            dVar.n();
        }
        sVar.f10046a.f9984a = canvas2;
        setInvalidated(false);
    }

    @Override // r1.f1
    public final void e(float[] fArr) {
        z0.f0.g(fArr, this.f8327p.b(this));
    }

    @Override // r1.f1
    public final void f(float[] fArr) {
        float[] a3 = this.f8327p.a(this);
        if (a3 != null) {
            z0.f0.g(fArr, a3);
        }
    }

    @Override // r1.f1
    public final void g(y0.b bVar, boolean z8) {
        r1 r1Var = this.f8327p;
        if (!z8) {
            z0.f0.c(r1Var.b(this), bVar);
            return;
        }
        float[] a3 = r1Var.a(this);
        if (a3 != null) {
            z0.f0.c(a3, bVar);
            return;
        }
        bVar.f9774a = 0.0f;
        bVar.f9775b = 0.0f;
        bVar.f9776c = 0.0f;
        bVar.f9777d = 0.0f;
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    public final l1 getContainer() {
        return this.f8318g;
    }

    public long getLayerId() {
        return this.f8330s;
    }

    public final r getOwnerView() {
        return this.f8317f;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return m2.a(this.f8317f);
        }
        return -1L;
    }

    @Override // r1.f1
    public final void h(long j8) {
        int i7 = (int) (j8 >> 32);
        int left = getLeft();
        r1 r1Var = this.f8327p;
        if (i7 != left) {
            offsetLeftAndRight(i7 - getLeft());
            r1Var.c();
        }
        int i8 = (int) (j8 & 4294967295L);
        if (i8 != getTop()) {
            offsetTopAndBottom(i8 - getTop());
            r1Var.c();
        }
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f8329r;
    }

    @Override // r1.f1
    public final void i() {
        if (!this.f8324m || f8316y) {
            return;
        }
        j0.B(this);
        setInvalidated(false);
    }

    @Override // android.view.View, r1.f1
    public final void invalidate() {
        if (this.f8324m) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.f8317f.invalidate();
    }

    @Override // r1.f1
    public final void j(z0.r rVar, c1.c cVar) {
        boolean z8 = getElevation() > 0.0f;
        this.f8325n = z8;
        if (z8) {
            rVar.s();
        }
        this.f8318g.a(rVar, this, getDrawingTime());
        if (this.f8325n) {
            rVar.p();
        }
    }

    @Override // r1.f1
    public final boolean k(long j8) {
        z0.j0 j0Var;
        float d8 = y0.c.d(j8);
        float e9 = y0.c.e(j8);
        if (this.f8322k) {
            if (0.0f > d8 || d8 >= getWidth() || 0.0f > e9 || e9 >= getHeight()) {
                return false;
            }
        } else if (getClipToOutline()) {
            u1 u1Var = this.f8321j;
            if (u1Var.f8447m && (j0Var = u1Var.f8437c) != null) {
                return j0.u(j0Var, y0.c.d(j8), y0.c.e(j8));
            }
            return true;
        }
        return true;
    }

    public final void l() {
        Rect rect;
        if (this.f8322k) {
            Rect rect2 = this.f8323l;
            if (rect2 == null) {
                this.f8323l = new Rect(0, 0, getWidth(), getHeight());
            } else {
                r6.k.c(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.f8323l;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    public final void setCameraDistancePx(float f9) {
        setCameraDistance(f9 * getResources().getDisplayMetrics().densityDpi);
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z8, int i7, int i8, int i9, int i10) {
    }
}
