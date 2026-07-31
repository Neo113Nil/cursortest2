package u0;

import C0.C0025a;
import a0.C0237b;
import a0.C0238c;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import b0.C0334c;
import b0.C0349s;
import e0.C0416b;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class Q0 extends View implements t0.g0 {

    /* renamed from: s, reason: collision with root package name */
    public static final R0.w f9245s = new R0.w(3);

    /* renamed from: t, reason: collision with root package name */
    public static Method f9246t;

    /* renamed from: u, reason: collision with root package name */
    public static Field f9247u;

    /* renamed from: v, reason: collision with root package name */
    public static boolean f9248v;

    /* renamed from: w, reason: collision with root package name */
    public static boolean f9249w;

    /* renamed from: d, reason: collision with root package name */
    public final C1123s f9250d;

    /* renamed from: e, reason: collision with root package name */
    public final C1113m0 f9251e;

    /* renamed from: f, reason: collision with root package name */
    public C0025a f9252f;

    /* renamed from: g, reason: collision with root package name */
    public t0.D f9253g;

    /* renamed from: h, reason: collision with root package name */
    public final C1132w0 f9254h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f9255i;

    /* renamed from: j, reason: collision with root package name */
    public Rect f9256j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f9257k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f9258l;

    /* renamed from: m, reason: collision with root package name */
    public final C0349s f9259m;

    /* renamed from: n, reason: collision with root package name */
    public final C1126t0 f9260n;

    /* renamed from: o, reason: collision with root package name */
    public long f9261o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f9262p;

    /* renamed from: q, reason: collision with root package name */
    public final long f9263q;

    /* renamed from: r, reason: collision with root package name */
    public int f9264r;

    public Q0(C1123s c1123s, C1113m0 c1113m0, C0025a c0025a, t0.D d3) {
        super(c1123s.getContext());
        this.f9250d = c1123s;
        this.f9251e = c1113m0;
        this.f9252f = c0025a;
        this.f9253g = d3;
        this.f9254h = new C1132w0();
        this.f9259m = new C0349s();
        this.f9260n = new C1126t0(C1087D.f9136i);
        this.f9261o = b0.U.f5400b;
        this.f9262p = true;
        setWillNotDraw(false);
        c1113m0.addView(this);
        this.f9263q = View.generateViewId();
    }

    private final b0.L getManualClipPath() {
        if (getClipToOutline()) {
            C1132w0 c1132w0 = this.f9254h;
            if (c1132w0.f9542g) {
                c1132w0.d();
                return c1132w0.f9540e;
            }
        }
        return null;
    }

    private final void setInvalidated(boolean z3) {
        if (z3 != this.f9257k) {
            this.f9257k = z3;
            this.f9250d.u(this, z3);
        }
    }

    @Override // t0.g0
    public final void a(float[] fArr) {
        float[] a3 = this.f9260n.a(this);
        if (a3 != null) {
            b0.G.g(fArr, a3);
        }
    }

    @Override // t0.g0
    public final void b(C0237b c0237b, boolean z3) {
        C1126t0 c1126t0 = this.f9260n;
        if (!z3) {
            b0.G.c(c1126t0.b(this), c0237b);
            return;
        }
        float[] a3 = c1126t0.a(this);
        if (a3 != null) {
            b0.G.c(a3, c0237b);
            return;
        }
        c0237b.f4718a = 0.0f;
        c0237b.f4719b = 0.0f;
        c0237b.f4720c = 0.0f;
        c0237b.f4721d = 0.0f;
    }

    @Override // t0.g0
    public final void c() {
        setInvalidated(false);
        C1123s c1123s = this.f9250d;
        c1123s.f9454B = true;
        this.f9252f = null;
        this.f9253g = null;
        c1123s.C(this);
        this.f9251e.removeViewInLayout(this);
    }

    @Override // t0.g0
    public final long d(long j3, boolean z3) {
        C1126t0 c1126t0 = this.f9260n;
        if (!z3) {
            return b0.G.b(j3, c1126t0.b(this));
        }
        float[] a3 = c1126t0.a(this);
        if (a3 != null) {
            return b0.G.b(j3, a3);
        }
        return 9187343241974906880L;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z3;
        C0349s c0349s = this.f9259m;
        C0334c c0334c = c0349s.f5432a;
        Canvas canvas2 = c0334c.f5405a;
        c0334c.f5405a = canvas;
        if (getManualClipPath() == null && canvas.isHardwareAccelerated()) {
            z3 = false;
        } else {
            c0334c.f();
            this.f9254h.a(c0334c);
            z3 = true;
        }
        C0025a c0025a = this.f9252f;
        if (c0025a != null) {
            c0025a.h(c0334c, null);
        }
        if (z3) {
            c0334c.a();
        }
        c0349s.f5432a.f5405a = canvas2;
        setInvalidated(false);
    }

    @Override // t0.g0
    public final void e(long j3) {
        int i3 = (int) (j3 >> 32);
        int left = getLeft();
        C1126t0 c1126t0 = this.f9260n;
        if (i3 != left) {
            offsetLeftAndRight(i3 - getLeft());
            c1126t0.c();
        }
        int i4 = (int) (j3 & 4294967295L);
        if (i4 != getTop()) {
            offsetTopAndBottom(i4 - getTop());
            c1126t0.c();
        }
    }

    @Override // t0.g0
    public final void f() {
        if (!this.f9257k || f9249w) {
            return;
        }
        L.B(this);
        setInvalidated(false);
    }

    @Override // t0.g0
    public final void g(long j3) {
        int i3 = (int) (j3 >> 32);
        int i4 = (int) (j3 & 4294967295L);
        if (i3 == getWidth() && i4 == getHeight()) {
            return;
        }
        setPivotX(b0.U.b(this.f9261o) * i3);
        setPivotY(b0.U.c(this.f9261o) * i4);
        setOutlineProvider(this.f9254h.b() != null ? f9245s : null);
        layout(getLeft(), getTop(), getLeft() + i3, getTop() + i4);
        m();
        this.f9260n.c();
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    public final C1113m0 getContainer() {
        return this.f9251e;
    }

    public long getLayerId() {
        return this.f9263q;
    }

    public final C1123s getOwnerView() {
        return this.f9250d;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return P0.a(this.f9250d);
        }
        return -1L;
    }

    @Override // t0.g0
    public final void h(b0.r rVar, C0416b c0416b) {
        boolean z3 = getElevation() > 0.0f;
        this.f9258l = z3;
        if (z3) {
            rVar.q();
        }
        this.f9251e.a(rVar, this, getDrawingTime());
        if (this.f9258l) {
            rVar.h();
        }
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f9262p;
    }

    @Override // t0.g0
    public final void i(float[] fArr) {
        b0.G.g(fArr, this.f9260n.b(this));
    }

    @Override // android.view.View, t0.g0
    public final void invalidate() {
        if (this.f9257k) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.f9250d.invalidate();
    }

    @Override // t0.g0
    public final void j(C0025a c0025a, t0.D d3) {
        this.f9251e.addView(this);
        this.f9255i = false;
        this.f9258l = false;
        this.f9261o = b0.U.f5400b;
        this.f9252f = c0025a;
        this.f9253g = d3;
    }

    @Override // t0.g0
    public final boolean k(long j3) {
        b0.K k3;
        float d3 = C0238c.d(j3);
        float e3 = C0238c.e(j3);
        if (this.f9255i) {
            return 0.0f <= d3 && d3 < ((float) getWidth()) && 0.0f <= e3 && e3 < ((float) getHeight());
        }
        if (!getClipToOutline()) {
            return true;
        }
        C1132w0 c1132w0 = this.f9254h;
        if (c1132w0.f9548m && (k3 = c1132w0.f9538c) != null) {
            return L.u(k3, C0238c.d(j3), C0238c.e(j3), null, null);
        }
        return true;
    }

    @Override // t0.g0
    public final void l(b0.O o3) {
        t0.D d3;
        int i3 = o3.f5359d | this.f9264r;
        if ((i3 & 4096) != 0) {
            long j3 = o3.f5372q;
            this.f9261o = j3;
            setPivotX(b0.U.b(j3) * getWidth());
            setPivotY(b0.U.c(this.f9261o) * getHeight());
        }
        if ((i3 & 1) != 0) {
            setScaleX(o3.f5360e);
        }
        if ((i3 & 2) != 0) {
            setScaleY(o3.f5361f);
        }
        if ((i3 & 4) != 0) {
            setAlpha(o3.f5362g);
        }
        if ((i3 & 8) != 0) {
            setTranslationX(o3.f5363h);
        }
        if ((i3 & 16) != 0) {
            setTranslationY(o3.f5364i);
        }
        if ((i3 & 32) != 0) {
            setElevation(o3.f5365j);
        }
        if ((i3 & 1024) != 0) {
            setRotation(o3.f5370o);
        }
        if ((i3 & 256) != 0) {
            setRotationX(o3.f5368m);
        }
        if ((i3 & 512) != 0) {
            setRotationY(o3.f5369n);
        }
        if ((i3 & 2048) != 0) {
            setCameraDistancePx(o3.f5371p);
        }
        boolean z3 = true;
        boolean z4 = getManualClipPath() != null;
        boolean z5 = o3.f5374s;
        A1.i iVar = b0.M.f5355a;
        boolean z6 = z5 && o3.f5373r != iVar;
        if ((i3 & 24576) != 0) {
            this.f9255i = z5 && o3.f5373r == iVar;
            m();
            setClipToOutline(z6);
        }
        boolean c2 = this.f9254h.c(o3.f5379x, o3.f5362g, z6, o3.f5365j, o3.f5376u);
        C1132w0 c1132w0 = this.f9254h;
        if (c1132w0.f9541f) {
            setOutlineProvider(c1132w0.b() != null ? f9245s : null);
        }
        boolean z7 = getManualClipPath() != null;
        if (z4 != z7 || (z7 && c2)) {
            invalidate();
        }
        if (!this.f9258l && getElevation() > 0.0f && (d3 = this.f9253g) != null) {
            d3.b();
        }
        if ((i3 & 7963) != 0) {
            this.f9260n.c();
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            int i5 = i3 & 64;
            S0 s02 = S0.f9269a;
            if (i5 != 0) {
                s02.a(this, b0.M.D(o3.f5366k));
            }
            if ((i3 & 128) != 0) {
                s02.b(this, b0.M.D(o3.f5367l));
            }
        }
        if (i4 >= 31 && (131072 & i3) != 0) {
            T0.f9274a.a(this, null);
        }
        if ((i3 & 32768) != 0) {
            int i6 = o3.f5375t;
            if (b0.M.q(i6, 1)) {
                setLayerType(2, null);
            } else if (b0.M.q(i6, 2)) {
                setLayerType(0, null);
                z3 = false;
            } else {
                setLayerType(0, null);
            }
            this.f9262p = z3;
        }
        this.f9264r = o3.f5359d;
    }

    public final void m() {
        Rect rect;
        if (this.f9255i) {
            Rect rect2 = this.f9256j;
            if (rect2 == null) {
                this.f9256j = new Rect(0, 0, getWidth(), getHeight());
            } else {
                f2.j.c(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.f9256j;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    public final void setCameraDistancePx(float f3) {
        setCameraDistance(f3 * getResources().getDisplayMetrics().densityDpi);
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
    }
}
