package s0;

import A0.C0030a;
import Z.C0306c;
import Z.C0321s;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import c0.C0531b;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class R0 extends View implements r0.f0 {

    /* renamed from: v, reason: collision with root package name */
    public static final P0.x f10112v = new P0.x(3);

    /* renamed from: w, reason: collision with root package name */
    public static Method f10113w;

    /* renamed from: x, reason: collision with root package name */
    public static Field f10114x;

    /* renamed from: y, reason: collision with root package name */
    public static boolean f10115y;

    /* renamed from: z, reason: collision with root package name */
    public static boolean f10116z;

    /* renamed from: d, reason: collision with root package name */
    public final C1166s f10117d;

    /* renamed from: e, reason: collision with root package name */
    public final C1156m0 f10118e;

    /* renamed from: i, reason: collision with root package name */
    public C0030a f10119i;

    /* renamed from: j, reason: collision with root package name */
    public A3.e f10120j;

    /* renamed from: k, reason: collision with root package name */
    public final C1177x0 f10121k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f10122l;

    /* renamed from: m, reason: collision with root package name */
    public Rect f10123m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f10124n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f10125o;

    /* renamed from: p, reason: collision with root package name */
    public final C0321s f10126p;

    /* renamed from: q, reason: collision with root package name */
    public final C1171u0 f10127q;

    /* renamed from: r, reason: collision with root package name */
    public long f10128r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f10129s;

    /* renamed from: t, reason: collision with root package name */
    public final long f10130t;

    /* renamed from: u, reason: collision with root package name */
    public int f10131u;

    public R0(C1166s c1166s, C1156m0 c1156m0, C0030a c0030a, A3.e eVar) {
        super(c1166s.getContext());
        this.f10117d = c1166s;
        this.f10118e = c1156m0;
        this.f10119i = c0030a;
        this.f10120j = eVar;
        this.f10121k = new C1177x0();
        this.f10126p = new C0321s();
        this.f10127q = new C1171u0(C1117C.f9996k);
        this.f10128r = Z.U.f4510b;
        this.f10129s = true;
        setWillNotDraw(false);
        c1156m0.addView(this);
        this.f10130t = View.generateViewId();
    }

    private final Z.J getManualClipPath() {
        if (getClipToOutline()) {
            C1177x0 c1177x0 = this.f10121k;
            if (c1177x0.f10411g) {
                c1177x0.d();
                return c1177x0.f10409e;
            }
        }
        return null;
    }

    private final void setInvalidated(boolean z4) {
        if (z4 != this.f10124n) {
            this.f10124n = z4;
            this.f10117d.t(this, z4);
        }
    }

    @Override // r0.f0
    public final void a(Z.r rVar, C0531b c0531b) {
        boolean z4 = getElevation() > 0.0f;
        this.f10125o = z4;
        if (z4) {
            rVar.o();
        }
        this.f10118e.a(rVar, this, getDrawingTime());
        if (this.f10125o) {
            rVar.j();
        }
    }

    @Override // r0.f0
    public final void b(Z.M m4) {
        A3.e eVar;
        int i2 = m4.f4466d | this.f10131u;
        if ((i2 & 4096) != 0) {
            long j4 = m4.f4479t;
            this.f10128r = j4;
            setPivotX(Z.U.b(j4) * getWidth());
            setPivotY(Z.U.c(this.f10128r) * getHeight());
        }
        if ((i2 & 1) != 0) {
            setScaleX(m4.f4467e);
        }
        if ((i2 & 2) != 0) {
            setScaleY(m4.f4468i);
        }
        if ((i2 & 4) != 0) {
            setAlpha(m4.f4469j);
        }
        if ((i2 & 8) != 0) {
            setTranslationX(m4.f4470k);
        }
        if ((i2 & 16) != 0) {
            setTranslationY(m4.f4471l);
        }
        if ((i2 & 32) != 0) {
            setElevation(m4.f4472m);
        }
        if ((i2 & 1024) != 0) {
            setRotation(m4.f4477r);
        }
        if ((i2 & 256) != 0) {
            setRotationX(m4.f4475p);
        }
        if ((i2 & 512) != 0) {
            setRotationY(m4.f4476q);
        }
        if ((i2 & 2048) != 0) {
            setCameraDistancePx(m4.f4478s);
        }
        boolean z4 = true;
        boolean z5 = getManualClipPath() != null;
        boolean z6 = m4.f4481v;
        E1.i iVar = Z.K.f4461a;
        boolean z7 = z6 && m4.f4480u != iVar;
        if ((i2 & 24576) != 0) {
            this.f10122l = z6 && m4.f4480u == iVar;
            m();
            setClipToOutline(z7);
        }
        boolean c4 = this.f10121k.c(m4.f4465A, m4.f4469j, z7, m4.f4472m, m4.f4483x);
        C1177x0 c1177x0 = this.f10121k;
        if (c1177x0.f10410f) {
            setOutlineProvider(c1177x0.b() != null ? f10112v : null);
        }
        boolean z8 = getManualClipPath() != null;
        if (z5 != z8 || (z8 && c4)) {
            invalidate();
        }
        if (!this.f10125o && getElevation() > 0.0f && (eVar = this.f10120j) != null) {
            eVar.invoke();
        }
        if ((i2 & 7963) != 0) {
            this.f10127q.c();
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            int i5 = i2 & 64;
            T0 t0 = T0.f10136a;
            if (i5 != 0) {
                t0.a(this, Z.K.D(m4.f4473n));
            }
            if ((i2 & 128) != 0) {
                t0.b(this, Z.K.D(m4.f4474o));
            }
        }
        if (i4 >= 31 && (131072 & i2) != 0) {
            U0.f10138a.a(this, null);
        }
        if ((i2 & 32768) != 0) {
            int i6 = m4.f4482w;
            if (Z.K.p(i6, 1)) {
                setLayerType(2, null);
            } else if (Z.K.p(i6, 2)) {
                setLayerType(0, null);
                z4 = false;
            } else {
                setLayerType(0, null);
            }
            this.f10129s = z4;
        }
        this.f10131u = m4.f4466d;
    }

    @Override // r0.f0
    public final void c(float[] fArr) {
        float[] a4 = this.f10127q.a(this);
        if (a4 != null) {
            Z.E.g(fArr, a4);
        }
    }

    @Override // r0.f0
    public final void d() {
        setInvalidated(false);
        C1166s c1166s = this.f10117d;
        c1166s.f10322E = true;
        this.f10119i = null;
        this.f10120j = null;
        c1166s.B(this);
        this.f10118e.removeViewInLayout(this);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z4;
        C0321s c0321s = this.f10126p;
        C0306c c0306c = c0321s.f4540a;
        Canvas canvas2 = c0306c.f4515a;
        c0306c.f4515a = canvas;
        if (getManualClipPath() == null && canvas.isHardwareAccelerated()) {
            z4 = false;
        } else {
            c0306c.g();
            this.f10121k.a(c0306c);
            z4 = true;
        }
        C0030a c0030a = this.f10119i;
        if (c0030a != null) {
            c0030a.h(c0306c, null);
        }
        if (z4) {
            c0306c.b();
        }
        c0321s.f4540a.f4515a = canvas2;
        setInvalidated(false);
    }

    @Override // r0.f0
    public final long e(long j4, boolean z4) {
        C1171u0 c1171u0 = this.f10127q;
        if (!z4) {
            return Z.E.b(j4, c1171u0.b(this));
        }
        float[] a4 = c1171u0.a(this);
        if (a4 != null) {
            return Z.E.b(j4, a4);
        }
        return 9187343241974906880L;
    }

    @Override // r0.f0
    public final void f(long j4) {
        int i2 = (int) (j4 >> 32);
        int left = getLeft();
        C1171u0 c1171u0 = this.f10127q;
        if (i2 != left) {
            offsetLeftAndRight(i2 - getLeft());
            c1171u0.c();
        }
        int i4 = (int) (j4 & 4294967295L);
        if (i4 != getTop()) {
            offsetTopAndBottom(i4 - getTop());
            c1171u0.c();
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // r0.f0
    public final void g() {
        if (!this.f10124n || f10116z) {
            return;
        }
        AbstractC1125K.q(this);
        setInvalidated(false);
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    public final C1156m0 getContainer() {
        return this.f10118e;
    }

    public long getLayerId() {
        return this.f10130t;
    }

    public final C1166s getOwnerView() {
        return this.f10117d;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return Q0.a(this.f10117d);
        }
        return -1L;
    }

    @Override // r0.f0
    public final void h(long j4) {
        int i2 = (int) (j4 >> 32);
        int i4 = (int) (j4 & 4294967295L);
        if (i2 == getWidth() && i4 == getHeight()) {
            return;
        }
        setPivotX(Z.U.b(this.f10128r) * i2);
        setPivotY(Z.U.c(this.f10128r) * i4);
        setOutlineProvider(this.f10121k.b() != null ? f10112v : null);
        layout(getLeft(), getTop(), getLeft() + i2, getTop() + i4);
        m();
        this.f10127q.c();
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f10129s;
    }

    @Override // r0.f0
    public final void i(C0030a c0030a, A3.e eVar) {
        this.f10118e.addView(this);
        this.f10122l = false;
        this.f10125o = false;
        this.f10128r = Z.U.f4510b;
        this.f10119i = c0030a;
        this.f10120j = eVar;
    }

    @Override // android.view.View, r0.f0
    public final void invalidate() {
        if (this.f10124n) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.f10117d.invalidate();
    }

    @Override // r0.f0
    public final void j(float[] fArr) {
        Z.E.g(fArr, this.f10127q.b(this));
    }

    @Override // r0.f0
    public final boolean k(long j4) {
        Z.I i2;
        float d4 = Y.c.d(j4);
        float e4 = Y.c.e(j4);
        if (this.f10122l) {
            return 0.0f <= d4 && d4 < ((float) getWidth()) && 0.0f <= e4 && e4 < ((float) getHeight());
        }
        if (!getClipToOutline()) {
            return true;
        }
        C1177x0 c1177x0 = this.f10121k;
        if (c1177x0.f10417m && (i2 = c1177x0.f10407c) != null) {
            return AbstractC1125K.j(i2, Y.c.d(j4), Y.c.e(j4), null, null);
        }
        return true;
    }

    @Override // r0.f0
    public final void l(Y.b bVar, boolean z4) {
        C1171u0 c1171u0 = this.f10127q;
        if (!z4) {
            Z.E.c(c1171u0.b(this), bVar);
            return;
        }
        float[] a4 = c1171u0.a(this);
        if (a4 != null) {
            Z.E.c(a4, bVar);
            return;
        }
        bVar.f4368a = 0.0f;
        bVar.f4369b = 0.0f;
        bVar.f4370c = 0.0f;
        bVar.f4371d = 0.0f;
    }

    public final void m() {
        Rect rect;
        if (this.f10122l) {
            Rect rect2 = this.f10123m;
            if (rect2 == null) {
                this.f10123m = new Rect(0, 0, getWidth(), getHeight());
            } else {
                Intrinsics.c(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.f10123m;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    @Override // android.view.View
    public final void onLayout(boolean z4, int i2, int i4, int i5, int i6) {
    }

    public final void setCameraDistancePx(float f4) {
        setCameraDistance(f4 * getResources().getDisplayMetrics().densityDpi);
    }
}
