package u0;

import F.C0036e;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import b0.AbstractC0257H;
import b0.AbstractC0259J;
import b0.C0261L;
import b0.C0266Q;
import b0.C0271d;
import b0.C0286s;
import b0.InterfaceC0258I;
import b0.InterfaceC0285r;
import e0.C0336b;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class F0 extends View implements t0.f0 {

    /* renamed from: s, reason: collision with root package name */
    public static final P0.p f8158s = new P0.p(2);

    /* renamed from: t, reason: collision with root package name */
    public static Method f8159t;

    /* renamed from: u, reason: collision with root package name */
    public static Field f8160u;

    /* renamed from: v, reason: collision with root package name */
    public static boolean f8161v;

    /* renamed from: w, reason: collision with root package name */
    public static boolean f8162w;

    /* renamed from: d, reason: collision with root package name */
    public final C0997t f8163d;

    /* renamed from: e, reason: collision with root package name */
    public final C0973g0 f8164e;

    /* renamed from: f, reason: collision with root package name */
    public C0036e f8165f;

    /* renamed from: g, reason: collision with root package name */
    public r1.r f8166g;

    /* renamed from: h, reason: collision with root package name */
    public final C0991p0 f8167h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f8168i;

    /* renamed from: j, reason: collision with root package name */
    public Rect f8169j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f8170k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f8171l;

    /* renamed from: m, reason: collision with root package name */
    public final C0286s f8172m;

    /* renamed from: n, reason: collision with root package name */
    public final C0985m0 f8173n;

    /* renamed from: o, reason: collision with root package name */
    public long f8174o;
    public boolean p;

    /* renamed from: q, reason: collision with root package name */
    public final long f8175q;

    /* renamed from: r, reason: collision with root package name */
    public int f8176r;

    public F0(C0997t c0997t, C0973g0 c0973g0, C0036e c0036e, r1.r rVar) {
        super(c0997t.getContext());
        this.f8163d = c0997t;
        this.f8164e = c0973g0;
        this.f8165f = c0036e;
        this.f8166g = rVar;
        this.f8167h = new C0991p0();
        this.f8172m = new C0286s();
        this.f8173n = new C0985m0(C0958E.f8123i);
        this.f8174o = C0266Q.f4258b;
        this.p = true;
        setWillNotDraw(false);
        c0973g0.addView(this);
        this.f8175q = View.generateViewId();
    }

    private final InterfaceC0258I getManualClipPath() {
        if (getClipToOutline()) {
            C0991p0 c0991p0 = this.f8167h;
            if (c0991p0.f8388g) {
                c0991p0.d();
                return c0991p0.f8386e;
            }
        }
        return null;
    }

    private final void setInvalidated(boolean z3) {
        if (z3 != this.f8170k) {
            this.f8170k = z3;
            this.f8163d.u(this, z3);
        }
    }

    @Override // t0.f0
    public final void a(C0036e c0036e, r1.r rVar) {
        this.f8164e.addView(this);
        this.f8168i = false;
        this.f8171l = false;
        this.f8174o = C0266Q.f4258b;
        this.f8165f = c0036e;
        this.f8166g = rVar;
    }

    @Override // t0.f0
    public final void b(a0.b bVar, boolean z3) {
        C0985m0 c0985m0 = this.f8173n;
        if (!z3) {
            AbstractC0259J.v(c0985m0.b(this), bVar);
            return;
        }
        float[] a3 = c0985m0.a(this);
        if (a3 != null) {
            AbstractC0259J.v(a3, bVar);
            return;
        }
        bVar.f3485a = 0.0f;
        bVar.f3486b = 0.0f;
        bVar.f3487c = 0.0f;
        bVar.f3488d = 0.0f;
    }

    @Override // t0.f0
    public final void c() {
        setInvalidated(false);
        C0997t c0997t = this.f8163d;
        c0997t.B = true;
        this.f8165f = null;
        this.f8166g = null;
        c0997t.C(this);
        this.f8164e.removeViewInLayout(this);
    }

    @Override // t0.f0
    public final long d(long j3, boolean z3) {
        C0985m0 c0985m0 = this.f8173n;
        if (!z3) {
            return AbstractC0259J.u(c0985m0.b(this), j3);
        }
        float[] a3 = c0985m0.a(this);
        if (a3 != null) {
            return AbstractC0259J.u(a3, j3);
        }
        return 9187343241974906880L;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z3;
        C0286s c0286s = this.f8172m;
        C0271d c0271d = c0286s.f4290a;
        Canvas canvas2 = c0271d.f4263a;
        c0271d.f4263a = canvas;
        if (getManualClipPath() == null && canvas.isHardwareAccelerated()) {
            z3 = false;
        } else {
            c0271d.f();
            this.f8167h.a(c0271d);
            z3 = true;
        }
        C0036e c0036e = this.f8165f;
        if (c0036e != null) {
            c0036e.g(c0271d, null);
        }
        if (z3) {
            c0271d.a();
        }
        c0286s.f4290a.f4263a = canvas2;
        setInvalidated(false);
    }

    @Override // t0.f0
    public final void e(long j3) {
        int i3 = (int) (j3 >> 32);
        int left = getLeft();
        C0985m0 c0985m0 = this.f8173n;
        if (i3 != left) {
            offsetLeftAndRight(i3 - getLeft());
            c0985m0.c();
        }
        int i4 = (int) (j3 & 4294967295L);
        if (i4 != getTop()) {
            offsetTopAndBottom(i4 - getTop());
            c0985m0.c();
        }
    }

    @Override // t0.f0
    public final void f() {
        if (!this.f8170k || f8162w) {
            return;
        }
        L.x(this);
        setInvalidated(false);
    }

    @Override // t0.f0
    public final void g(long j3) {
        int i3 = (int) (j3 >> 32);
        int i4 = (int) (j3 & 4294967295L);
        if (i3 == getWidth() && i4 == getHeight()) {
            return;
        }
        setPivotX(C0266Q.b(this.f8174o) * i3);
        setPivotY(C0266Q.c(this.f8174o) * i4);
        setOutlineProvider(this.f8167h.b() != null ? f8158s : null);
        layout(getLeft(), getTop(), getLeft() + i3, getTop() + i4);
        k();
        this.f8173n.c();
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    public final C0973g0 getContainer() {
        return this.f8164e;
    }

    public long getLayerId() {
        return this.f8175q;
    }

    public final C0997t getOwnerView() {
        return this.f8163d;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return E0.a(this.f8163d);
        }
        return -1L;
    }

    @Override // t0.f0
    public final void h(InterfaceC0285r interfaceC0285r, C0336b c0336b) {
        boolean z3 = getElevation() > 0.0f;
        this.f8171l = z3;
        if (z3) {
            interfaceC0285r.p();
        }
        this.f8164e.a(interfaceC0285r, this, getDrawingTime());
        if (this.f8171l) {
            interfaceC0285r.h();
        }
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.p;
    }

    @Override // t0.f0
    public final boolean i(long j3) {
        AbstractC0257H abstractC0257H;
        float d3 = a0.c.d(j3);
        float e3 = a0.c.e(j3);
        if (this.f8168i) {
            return 0.0f <= d3 && d3 < ((float) getWidth()) && 0.0f <= e3 && e3 < ((float) getHeight());
        }
        if (!getClipToOutline()) {
            return true;
        }
        C0991p0 c0991p0 = this.f8167h;
        if (c0991p0.f8394m && (abstractC0257H = c0991p0.f8384c) != null) {
            return L.q(abstractC0257H, a0.c.d(j3), a0.c.e(j3), null, null);
        }
        return true;
    }

    @Override // android.view.View, t0.f0
    public final void invalidate() {
        if (this.f8170k) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.f8163d.invalidate();
    }

    @Override // t0.f0
    public final void j(C0261L c0261l) {
        r1.r rVar;
        int i3 = c0261l.f4219d | this.f8176r;
        if ((i3 & 4096) != 0) {
            long j3 = c0261l.f4231q;
            this.f8174o = j3;
            setPivotX(C0266Q.b(j3) * getWidth());
            setPivotY(C0266Q.c(this.f8174o) * getHeight());
        }
        if ((i3 & 1) != 0) {
            setScaleX(c0261l.f4220e);
        }
        if ((i3 & 2) != 0) {
            setScaleY(c0261l.f4221f);
        }
        if ((i3 & 4) != 0) {
            setAlpha(c0261l.f4222g);
        }
        if ((i3 & 8) != 0) {
            setTranslationX(c0261l.f4223h);
        }
        if ((i3 & 16) != 0) {
            setTranslationY(c0261l.f4224i);
        }
        if ((i3 & 32) != 0) {
            setElevation(c0261l.f4225j);
        }
        if ((i3 & 1024) != 0) {
            setRotation(c0261l.f4230o);
        }
        if ((i3 & 256) != 0) {
            setRotationX(c0261l.f4228m);
        }
        if ((i3 & 512) != 0) {
            setRotationY(c0261l.f4229n);
        }
        if ((i3 & 2048) != 0) {
            setCameraDistancePx(c0261l.p);
        }
        boolean z3 = true;
        boolean z4 = getManualClipPath() != null;
        boolean z5 = c0261l.f4233s;
        F0.a aVar = AbstractC0259J.f4215a;
        boolean z6 = z5 && c0261l.f4232r != aVar;
        if ((i3 & 24576) != 0) {
            this.f8168i = z5 && c0261l.f4232r == aVar;
            k();
            setClipToOutline(z6);
        }
        boolean c3 = this.f8167h.c(c0261l.f4238x, c0261l.f4222g, z6, c0261l.f4225j, c0261l.f4235u);
        C0991p0 c0991p0 = this.f8167h;
        if (c0991p0.f8387f) {
            setOutlineProvider(c0991p0.b() != null ? f8158s : null);
        }
        boolean z7 = getManualClipPath() != null;
        if (z4 != z7 || (z7 && c3)) {
            invalidate();
        }
        if (!this.f8171l && getElevation() > 0.0f && (rVar = this.f8166g) != null) {
            rVar.b();
        }
        if ((i3 & 7963) != 0) {
            this.f8173n.c();
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            int i5 = i3 & 64;
            H0 h02 = H0.f8179a;
            if (i5 != 0) {
                h02.a(this, AbstractC0259J.E(c0261l.f4226k));
            }
            if ((i3 & 128) != 0) {
                h02.b(this, AbstractC0259J.E(c0261l.f4227l));
            }
        }
        if (i4 >= 31 && (131072 & i3) != 0) {
            I0.f8181a.a(this, null);
        }
        if ((i3 & 32768) != 0) {
            int i6 = c0261l.f4234t;
            if (AbstractC0259J.o(i6, 1)) {
                setLayerType(2, null);
            } else if (AbstractC0259J.o(i6, 2)) {
                setLayerType(0, null);
                z3 = false;
            } else {
                setLayerType(0, null);
            }
            this.p = z3;
        }
        this.f8176r = c0261l.f4219d;
    }

    public final void k() {
        Rect rect;
        if (this.f8168i) {
            Rect rect2 = this.f8169j;
            if (rect2 == null) {
                this.f8169j = new Rect(0, 0, getWidth(), getHeight());
            } else {
                Z1.i.c(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.f8169j;
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
