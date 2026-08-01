package androidx.recyclerview.widget;

import B.j;
import G.h;
import K.C0016n;
import K.C0019q;
import K.J;
import K.T;
import R.a;
import T.d;
import U.g;
import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import f0.AbstractC0089a;
import g0.AbstractC0112D;
import g0.C0109A;
import g0.C0111C;
import g0.C0115a;
import g0.C0116b;
import g0.C0118d;
import g0.C0125k;
import g0.C0128n;
import g0.C0129o;
import g0.C0137x;
import g0.C0139z;
import g0.G;
import g0.H;
import g0.I;
import g0.InterfaceC0114F;
import g0.L;
import g0.M;
import g0.N;
import g0.O;
import g0.P;
import g0.Q;
import g0.RunnableC0110B;
import g0.RunnableC0131q;
import g0.S;
import g0.U;
import g0.V;
import g0.X;
import g0.Y;
import g0.Z;
import g0.a0;
import g0.b0;
import g0.c0;
import g0.e0;
import g0.m0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import o.e;
import o.k;
import q.AbstractC0287e;
import w1.l;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* renamed from: A0, reason: collision with root package name */
    public static boolean f1528A0 = false;

    /* renamed from: B0, reason: collision with root package name */
    public static final int[] f1529B0 = {R.attr.nestedScrollingEnabled};

    /* renamed from: C0, reason: collision with root package name */
    public static final float f1530C0 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: D0, reason: collision with root package name */
    public static final boolean f1531D0 = true;
    public static final boolean E0 = true;

    /* renamed from: F0, reason: collision with root package name */
    public static final boolean f1532F0 = true;

    /* renamed from: G0, reason: collision with root package name */
    public static final Class[] f1533G0;

    /* renamed from: H0, reason: collision with root package name */
    public static final d f1534H0;

    /* renamed from: I0, reason: collision with root package name */
    public static final Z f1535I0;
    public static boolean z0 = false;

    /* renamed from: A, reason: collision with root package name */
    public boolean f1536A;

    /* renamed from: B, reason: collision with root package name */
    public final AccessibilityManager f1537B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f1538C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f1539D;

    /* renamed from: E, reason: collision with root package name */
    public int f1540E;
    public int F;

    /* renamed from: G, reason: collision with root package name */
    public G f1541G;

    /* renamed from: H, reason: collision with root package name */
    public EdgeEffect f1542H;

    /* renamed from: I, reason: collision with root package name */
    public EdgeEffect f1543I;

    /* renamed from: J, reason: collision with root package name */
    public EdgeEffect f1544J;

    /* renamed from: K, reason: collision with root package name */
    public EdgeEffect f1545K;

    /* renamed from: L, reason: collision with root package name */
    public H f1546L;

    /* renamed from: M, reason: collision with root package name */
    public int f1547M;

    /* renamed from: N, reason: collision with root package name */
    public int f1548N;

    /* renamed from: O, reason: collision with root package name */
    public VelocityTracker f1549O;

    /* renamed from: P, reason: collision with root package name */
    public int f1550P;

    /* renamed from: Q, reason: collision with root package name */
    public int f1551Q;

    /* renamed from: R, reason: collision with root package name */
    public int f1552R;

    /* renamed from: S, reason: collision with root package name */
    public int f1553S;

    /* renamed from: T, reason: collision with root package name */
    public int f1554T;

    /* renamed from: U, reason: collision with root package name */
    public N f1555U;

    /* renamed from: V, reason: collision with root package name */
    public final int f1556V;

    /* renamed from: W, reason: collision with root package name */
    public final int f1557W;

    /* renamed from: a, reason: collision with root package name */
    public final float f1558a;

    /* renamed from: a0, reason: collision with root package name */
    public final float f1559a0;

    /* renamed from: b, reason: collision with root package name */
    public final U f1560b;

    /* renamed from: b0, reason: collision with root package name */
    public final float f1561b0;

    /* renamed from: c, reason: collision with root package name */
    public final S f1562c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f1563c0;
    public V d;

    /* renamed from: d0, reason: collision with root package name */
    public final b0 f1564d0;

    /* renamed from: e, reason: collision with root package name */
    public final C0116b f1565e;

    /* renamed from: e0, reason: collision with root package name */
    public RunnableC0131q f1566e0;

    /* renamed from: f, reason: collision with root package name */
    public final C0118d f1567f;

    /* renamed from: f0, reason: collision with root package name */
    public final C0129o f1568f0;

    /* renamed from: g, reason: collision with root package name */
    public final j f1569g;

    /* renamed from: g0, reason: collision with root package name */
    public final Y f1570g0;
    public boolean h;

    /* renamed from: h0, reason: collision with root package name */
    public O f1571h0;
    public final RunnableC0110B i;

    /* renamed from: i0, reason: collision with root package name */
    public ArrayList f1572i0;

    /* renamed from: j, reason: collision with root package name */
    public final Rect f1573j;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f1574j0;

    /* renamed from: k, reason: collision with root package name */
    public final Rect f1575k;
    public boolean k0;

    /* renamed from: l, reason: collision with root package name */
    public final RectF f1576l;

    /* renamed from: l0, reason: collision with root package name */
    public final C0111C f1577l0;

    /* renamed from: m, reason: collision with root package name */
    public AbstractC0112D f1578m;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f1579m0;

    /* renamed from: n, reason: collision with root package name */
    public L f1580n;

    /* renamed from: n0, reason: collision with root package name */
    public e0 f1581n0;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f1582o;
    public final int[] o0;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f1583p;

    /* renamed from: p0, reason: collision with root package name */
    public C0016n f1584p0;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f1585q;

    /* renamed from: q0, reason: collision with root package name */
    public final int[] f1586q0;

    /* renamed from: r, reason: collision with root package name */
    public C0128n f1587r;

    /* renamed from: r0, reason: collision with root package name */
    public final int[] f1588r0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1589s;

    /* renamed from: s0, reason: collision with root package name */
    public final int[] f1590s0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1591t;

    /* renamed from: t0, reason: collision with root package name */
    public final ArrayList f1592t0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1593u;

    /* renamed from: u0, reason: collision with root package name */
    public final RunnableC0110B f1594u0;

    /* renamed from: v, reason: collision with root package name */
    public int f1595v;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f1596v0;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1597w;

    /* renamed from: w0, reason: collision with root package name */
    public int f1598w0;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1599x;

    /* renamed from: x0, reason: collision with root package name */
    public int f1600x0;

    /* renamed from: y, reason: collision with root package name */
    public boolean f1601y;

    /* renamed from: y0, reason: collision with root package name */
    public final C0111C f1602y0;

    /* renamed from: z, reason: collision with root package name */
    public int f1603z;

    static {
        Class cls = Integer.TYPE;
        f1533G0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f1534H0 = new d(1);
        f1535I0 = new Z();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.playbag.tripgear.R.attr.recyclerViewStyle);
    }

    public static RecyclerView G(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView G2 = G(viewGroup.getChildAt(i));
            if (G2 != null) {
                return G2;
            }
        }
        return null;
    }

    public static c0 L(View view) {
        if (view == null) {
            return null;
        }
        return ((M) view.getLayoutParams()).f2287a;
    }

    private C0016n getScrollingChildHelper() {
        if (this.f1584p0 == null) {
            this.f1584p0 = new C0016n(this);
        }
        return this.f1584p0;
    }

    public static void l(c0 c0Var) {
        WeakReference weakReference = c0Var.f2340b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == c0Var.f2339a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            c0Var.f2340b = null;
        }
    }

    public static int o(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && l.y(edgeEffect) != f1530C0) {
            int round = Math.round(l.L(edgeEffect, ((-i) * 4.0f) / i2, 0.5f) * ((-i2) / 4.0f));
            if (round != i) {
                edgeEffect.finish();
            }
            return i - round;
        }
        if (i >= 0 || edgeEffect2 == null || l.y(edgeEffect2) == f1530C0) {
            return i;
        }
        float f2 = i2;
        int round2 = Math.round(l.L(edgeEffect2, (i * 4.0f) / f2, 0.5f) * (f2 / 4.0f));
        if (round2 != i) {
            edgeEffect2.finish();
        }
        return i - round2;
    }

    public static void setDebugAssertionsEnabled(boolean z2) {
        z0 = z2;
    }

    public static void setVerboseLoggingEnabled(boolean z2) {
        f1528A0 = z2;
    }

    public final void A() {
        if (this.f1543I != null) {
            return;
        }
        ((Z) this.f1541G).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1543I = edgeEffect;
        if (this.h) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String B() {
        return " " + super.toString() + ", adapter:" + this.f1578m + ", layout:" + this.f1580n + ", context:" + getContext();
    }

    public final void C(Y y2) {
        if (getScrollState() != 2) {
            y2.getClass();
            return;
        }
        OverScroller overScroller = this.f1564d0.f2331c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        y2.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View D(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean E(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.f1585q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0128n c0128n = (C0128n) arrayList.get(i);
            int i2 = c0128n.f2453v;
            if (i2 == 1) {
                boolean d = c0128n.d(motionEvent.getX(), motionEvent.getY());
                boolean c2 = c0128n.c(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0 && (d || c2)) {
                    if (c2) {
                        c0128n.f2454w = 1;
                        c0128n.f2447p = (int) motionEvent.getX();
                    } else if (d) {
                        c0128n.f2454w = 2;
                        c0128n.f2444m = (int) motionEvent.getY();
                    }
                    c0128n.f(2);
                    if (action == 3) {
                        this.f1587r = c0128n;
                        return true;
                    }
                }
            } else {
                if (i2 != 2) {
                    continue;
                }
                if (action == 3) {
                }
            }
        }
        return false;
    }

    public final void F(int[] iArr) {
        int e2 = this.f1567f.e();
        if (e2 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < e2; i3++) {
            c0 L2 = L(this.f1567f.d(i3));
            if (!L2.q()) {
                int c2 = L2.c();
                if (c2 < i) {
                    i = c2;
                }
                if (c2 > i2) {
                    i2 = c2;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public final c0 H(int i) {
        c0 c0Var = null;
        if (this.f1538C) {
            return null;
        }
        int h = this.f1567f.h();
        for (int i2 = 0; i2 < h; i2++) {
            c0 L2 = L(this.f1567f.g(i2));
            if (L2 != null && !L2.j() && I(L2) == i) {
                if (!this.f1567f.f2357c.contains(L2.f2339a)) {
                    return L2;
                }
                c0Var = L2;
            }
        }
        return c0Var;
    }

    public final int I(c0 c0Var) {
        if (c0Var.e(524) || !c0Var.g()) {
            return -1;
        }
        C0116b c0116b = this.f1565e;
        int i = c0Var.f2341c;
        ArrayList arrayList = (ArrayList) c0116b.f2326c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0115a c0115a = (C0115a) arrayList.get(i2);
            int i3 = c0115a.f2321a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = c0115a.f2322b;
                    if (i4 <= i) {
                        int i5 = c0115a.d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = c0115a.f2322b;
                    if (i6 == i) {
                        i = c0115a.d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (c0115a.d <= i) {
                            i++;
                        }
                    }
                }
            } else if (c0115a.f2322b <= i) {
                i += c0115a.d;
            }
        }
        return i;
    }

    public final long J(c0 c0Var) {
        return this.f1578m.f2263b ? c0Var.f2342e : c0Var.f2341c;
    }

    public final c0 K(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return L(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect M(View view) {
        M m2 = (M) view.getLayoutParams();
        boolean z2 = m2.f2289c;
        Rect rect = m2.f2288b;
        if (!z2) {
            return rect;
        }
        if (this.f1570g0.f2315g && (m2.f2287a.m() || m2.f2287a.h())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.f1583p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.f1573j;
            rect2.set(0, 0, 0, 0);
            ((I) arrayList.get(i)).getClass();
            ((M) view.getLayoutParams()).f2287a.getClass();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        m2.f2289c = false;
        return rect;
    }

    public final boolean N() {
        return !this.f1593u || this.f1538C || this.f1565e.j();
    }

    public final boolean O() {
        return this.f1540E > 0;
    }

    public final void P(int i) {
        if (this.f1580n == null) {
            return;
        }
        setScrollState(2);
        this.f1580n.p0(i);
        awakenScrollBars();
    }

    public final void Q() {
        int h = this.f1567f.h();
        for (int i = 0; i < h; i++) {
            ((M) this.f1567f.g(i).getLayoutParams()).f2289c = true;
        }
        ArrayList arrayList = this.f1562c.f2298c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            M m2 = (M) ((c0) arrayList.get(i2)).f2339a.getLayoutParams();
            if (m2 != null) {
                m2.f2289c = true;
            }
        }
    }

    public final void R(int i, int i2, boolean z2) {
        int i3 = i + i2;
        int h = this.f1567f.h();
        for (int i4 = 0; i4 < h; i4++) {
            c0 L2 = L(this.f1567f.g(i4));
            if (L2 != null && !L2.q()) {
                int i5 = L2.f2341c;
                Y y2 = this.f1570g0;
                if (i5 >= i3) {
                    if (f1528A0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i4 + " holder " + L2 + " now at position " + (L2.f2341c - i2));
                    }
                    L2.n(-i2, z2);
                    y2.f2314f = true;
                } else if (i5 >= i) {
                    if (f1528A0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i4 + " holder " + L2 + " now REMOVED");
                    }
                    L2.a(8);
                    L2.n(-i2, z2);
                    L2.f2341c = i - 1;
                    y2.f2314f = true;
                }
            }
        }
        S s2 = this.f1562c;
        ArrayList arrayList = s2.f2298c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            c0 c0Var = (c0) arrayList.get(size);
            if (c0Var != null) {
                int i6 = c0Var.f2341c;
                if (i6 >= i3) {
                    if (f1528A0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + c0Var + " now at position " + (c0Var.f2341c - i2));
                    }
                    c0Var.n(-i2, z2);
                } else if (i6 >= i) {
                    c0Var.a(8);
                    s2.g(size);
                }
            }
        }
        requestLayout();
    }

    public final void S() {
        this.f1540E++;
    }

    public final void T(boolean z2) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.f1540E - 1;
        this.f1540E = i2;
        if (i2 < 1) {
            if (z0 && i2 < 0) {
                throw new IllegalStateException(Y.V.d(this, new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching")));
            }
            this.f1540E = 0;
            if (z2) {
                int i3 = this.f1603z;
                this.f1603z = 0;
                if (i3 != 0 && (accessibilityManager = this.f1537B) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(obtain);
                }
                ArrayList arrayList = this.f1592t0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    c0 c0Var = (c0) arrayList.get(size);
                    if (c0Var.f2339a.getParent() == this && !c0Var.q() && (i = c0Var.f2352q) != -1) {
                        WeakHashMap weakHashMap = T.f423a;
                        c0Var.f2339a.setImportantForAccessibility(i);
                        c0Var.f2352q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void U(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1548N) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f1548N = motionEvent.getPointerId(i);
            int x2 = (int) (motionEvent.getX(i) + 0.5f);
            this.f1552R = x2;
            this.f1550P = x2;
            int y2 = (int) (motionEvent.getY(i) + 0.5f);
            this.f1553S = y2;
            this.f1551Q = y2;
        }
    }

    public final void V() {
        if (this.f1579m0 || !this.f1589s) {
            return;
        }
        WeakHashMap weakHashMap = T.f423a;
        postOnAnimation(this.f1594u0);
        this.f1579m0 = true;
    }

    public final void W() {
        boolean z2;
        boolean z3 = false;
        if (this.f1538C) {
            C0116b c0116b = this.f1565e;
            c0116b.q((ArrayList) c0116b.f2326c);
            c0116b.q((ArrayList) c0116b.d);
            c0116b.f2324a = 0;
            if (this.f1539D) {
                this.f1580n.Z();
            }
        }
        if (this.f1546L == null || !this.f1580n.B0()) {
            this.f1565e.d();
        } else {
            this.f1565e.p();
        }
        boolean z4 = this.f1574j0 || this.k0;
        boolean z5 = this.f1593u && this.f1546L != null && ((z2 = this.f1538C) || z4 || this.f1580n.f2279f) && (!z2 || this.f1578m.f2263b);
        Y y2 = this.f1570g0;
        y2.f2316j = z5;
        if (z5 && z4 && !this.f1538C && this.f1546L != null && this.f1580n.B0()) {
            z3 = true;
        }
        y2.f2317k = z3;
    }

    public final void X(boolean z2) {
        this.f1539D = z2 | this.f1539D;
        this.f1538C = true;
        int h = this.f1567f.h();
        for (int i = 0; i < h; i++) {
            c0 L2 = L(this.f1567f.g(i));
            if (L2 != null && !L2.q()) {
                L2.a(6);
            }
        }
        Q();
        S s2 = this.f1562c;
        ArrayList arrayList = s2.f2298c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            c0 c0Var = (c0) arrayList.get(i2);
            if (c0Var != null) {
                c0Var.a(6);
                c0Var.a(1024);
            }
        }
        AbstractC0112D abstractC0112D = s2.h.f1578m;
        if (abstractC0112D == null || !abstractC0112D.f2263b) {
            s2.f();
        }
    }

    public final void Y(c0 c0Var, C0019q c0019q) {
        c0Var.f2345j &= -8193;
        boolean z2 = this.f1570g0.h;
        j jVar = this.f1569g;
        if (z2 && c0Var.m() && !c0Var.j() && !c0Var.q()) {
            ((e) jVar.f32c).d(J(c0Var), c0Var);
        }
        k kVar = (k) jVar.f31b;
        m0 m0Var = (m0) kVar.getOrDefault(c0Var, null);
        if (m0Var == null) {
            m0Var = m0.a();
            kVar.put(c0Var, m0Var);
        }
        m0Var.f2429b = c0019q;
        m0Var.f2428a |= 4;
    }

    public final int Z(int i, float f2) {
        float height = f2 / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.f1542H;
        float f3 = f1530C0;
        if (edgeEffect == null || l.y(edgeEffect) == f1530C0) {
            EdgeEffect edgeEffect2 = this.f1544J;
            if (edgeEffect2 != null && l.y(edgeEffect2) != f1530C0) {
                if (canScrollHorizontally(1)) {
                    this.f1544J.onRelease();
                } else {
                    float L2 = l.L(this.f1544J, width, height);
                    if (l.y(this.f1544J) == f1530C0) {
                        this.f1544J.onRelease();
                    }
                    f3 = L2;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.f1542H.onRelease();
            } else {
                float f4 = -l.L(this.f1542H, -width, 1.0f - height);
                if (l.y(this.f1542H) == f1530C0) {
                    this.f1542H.onRelease();
                }
                f3 = f4;
            }
            invalidate();
        }
        return Math.round(f3 * getWidth());
    }

    public final int a0(int i, float f2) {
        float width = f2 / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect = this.f1543I;
        float f3 = f1530C0;
        if (edgeEffect == null || l.y(edgeEffect) == f1530C0) {
            EdgeEffect edgeEffect2 = this.f1545K;
            if (edgeEffect2 != null && l.y(edgeEffect2) != f1530C0) {
                if (canScrollVertically(1)) {
                    this.f1545K.onRelease();
                } else {
                    float L2 = l.L(this.f1545K, height, 1.0f - width);
                    if (l.y(this.f1545K) == f1530C0) {
                        this.f1545K.onRelease();
                    }
                    f3 = L2;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.f1543I.onRelease();
            } else {
                float f4 = -l.L(this.f1543I, -height, width);
                if (l.y(this.f1543I) == f1530C0) {
                    this.f1543I.onRelease();
                }
                f3 = f4;
            }
            invalidate();
        }
        return Math.round(f3 * getHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        L l2 = this.f1580n;
        if (l2 != null) {
            l2.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    public final void b0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f1573j;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof M) {
            M m2 = (M) layoutParams;
            if (!m2.f2289c) {
                int i = rect.left;
                Rect rect2 = m2.f2288b;
                rect.left = i - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f1580n.m0(this, view, this.f1573j, !this.f1593u, view2 == null);
    }

    public final void c0() {
        VelocityTracker velocityTracker = this.f1549O;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z2 = false;
        k0(0);
        EdgeEffect edgeEffect = this.f1542H;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = this.f1542H.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f1543I;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 |= this.f1543I.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1544J;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 |= this.f1544J.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1545K;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z2 |= this.f1545K.isFinished();
        }
        if (z2) {
            WeakHashMap weakHashMap = T.f423a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof M) && this.f1580n.f((M) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        L l2 = this.f1580n;
        if (l2 != null && l2.d()) {
            return this.f1580n.j(this.f1570g0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        L l2 = this.f1580n;
        if (l2 != null && l2.d()) {
            return this.f1580n.k(this.f1570g0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        L l2 = this.f1580n;
        if (l2 != null && l2.d()) {
            return this.f1580n.l(this.f1570g0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        L l2 = this.f1580n;
        if (l2 != null && l2.e()) {
            return this.f1580n.m(this.f1570g0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        L l2 = this.f1580n;
        if (l2 != null && l2.e()) {
            return this.f1580n.n(this.f1570g0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        L l2 = this.f1580n;
        if (l2 != null && l2.e()) {
            return this.f1580n.o(this.f1570g0);
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d0(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2;
        p();
        AbstractC0112D abstractC0112D = this.f1578m;
        int[] iArr = this.f1590s0;
        if (abstractC0112D != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            e0(i, i2, iArr);
            int i8 = iArr[0];
            int i9 = iArr[1];
            i4 = i8;
            i5 = i9;
            i6 = i - i8;
            i7 = i2 - i9;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (!this.f1583p.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        v(i4, i5, i6, i7, this.f1586q0, i3, iArr);
        int i10 = iArr[0];
        int i11 = i6 - i10;
        int i12 = iArr[1];
        int i13 = i7 - i12;
        boolean z3 = (i10 == 0 && i12 == 0) ? false : true;
        int i14 = this.f1552R;
        int[] iArr2 = this.f1586q0;
        int i15 = iArr2[0];
        this.f1552R = i14 - i15;
        int i16 = this.f1553S;
        int i17 = iArr2[1];
        this.f1553S = i16 - i17;
        int[] iArr3 = this.f1588r0;
        iArr3[0] = iArr3[0] + i15;
        iArr3[1] = iArr3[1] + i17;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && (motionEvent.getSource() & 8194) != 8194) {
                float x2 = motionEvent.getX();
                float f2 = i11;
                float y2 = motionEvent.getY();
                float f3 = i13;
                if (f2 < f1530C0) {
                    y();
                    l.L(this.f1542H, (-f2) / getWidth(), 1.0f - (y2 / getHeight()));
                } else if (f2 > f1530C0) {
                    z();
                    l.L(this.f1544J, f2 / getWidth(), y2 / getHeight());
                } else {
                    z2 = false;
                    if (f3 >= f1530C0) {
                        A();
                        l.L(this.f1543I, (-f3) / getHeight(), x2 / getWidth());
                    } else {
                        if (f3 > f1530C0) {
                            x();
                            l.L(this.f1545K, f3 / getHeight(), 1.0f - (x2 / getWidth()));
                        }
                        if (!z2 || f2 != f1530C0 || f3 != f1530C0) {
                            WeakHashMap weakHashMap = T.f423a;
                            postInvalidateOnAnimation();
                        }
                    }
                    z2 = true;
                    if (!z2) {
                    }
                    WeakHashMap weakHashMap2 = T.f423a;
                    postInvalidateOnAnimation();
                }
                z2 = true;
                if (f3 >= f1530C0) {
                }
                z2 = true;
                if (!z2) {
                }
                WeakHashMap weakHashMap22 = T.f423a;
                postInvalidateOnAnimation();
            }
            n(i, i2);
        }
        if (i4 != 0 || i5 != 0) {
            w(i4, i5);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z3 && i4 == 0 && i5 == 0) ? false : true;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return getScrollingChildHelper().a(f2, f3, z2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f2, float f3) {
        return getScrollingChildHelper().b(f2, f3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().d(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z2;
        super.draw(canvas);
        ArrayList arrayList = this.f1583p;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i = 0; i < size; i++) {
            ((I) arrayList.get(i)).b(canvas, this);
        }
        EdgeEffect edgeEffect = this.f1542H;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.h ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, f1530C0);
            EdgeEffect edgeEffect2 = this.f1542H;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f1543I;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.h) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f1543I;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f1544J;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.h ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f1544J;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f1545K;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.h) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f1545K;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(save4);
        }
        if ((z2 || this.f1546L == null || arrayList.size() <= 0 || !this.f1546L.f()) ? z2 : true) {
            WeakHashMap weakHashMap = T.f423a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    public final void e0(int i, int i2, int[] iArr) {
        c0 c0Var;
        C0118d c0118d = this.f1567f;
        i0();
        S();
        int i3 = h.f234a;
        Trace.beginSection("RV Scroll");
        Y y2 = this.f1570g0;
        C(y2);
        S s2 = this.f1562c;
        int o0 = i != 0 ? this.f1580n.o0(i, s2, y2) : 0;
        int q02 = i2 != 0 ? this.f1580n.q0(i2, s2, y2) : 0;
        Trace.endSection();
        int e2 = c0118d.e();
        for (int i4 = 0; i4 < e2; i4++) {
            View d = c0118d.d(i4);
            c0 K2 = K(d);
            if (K2 != null && (c0Var = K2.i) != null) {
                int left = d.getLeft();
                int top = d.getTop();
                View view = c0Var.f2339a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        T(true);
        j0(false);
        if (iArr != null) {
            iArr[0] = o0;
            iArr[1] = q02;
        }
    }

    public final void f0(int i) {
        C0137x c0137x;
        if (this.f1599x) {
            return;
        }
        setScrollState(0);
        b0 b0Var = this.f1564d0;
        b0Var.f2334g.removeCallbacks(b0Var);
        b0Var.f2331c.abortAnimation();
        L l2 = this.f1580n;
        if (l2 != null && (c0137x = l2.f2278e) != null) {
            c0137x.i();
        }
        L l3 = this.f1580n;
        if (l3 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            l3.p0(i);
            awakenScrollBars();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x017d, code lost:
    
        if (r5 < 0) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0185, code lost:
    
        if ((r5 * r6) <= 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x018d, code lost:
    
        if ((r5 * r6) >= 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0160, code lost:
    
        if (r7 > 0) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0177, code lost:
    
        if (r5 > 0) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x017a, code lost:
    
        if (r7 < 0) goto L137;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View focusSearch(View view, int i) {
        View view2;
        int i2;
        char c2;
        boolean z2;
        this.f1580n.getClass();
        boolean z3 = true;
        boolean z4 = (this.f1578m == null || this.f1580n == null || O() || this.f1599x) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        Y y2 = this.f1570g0;
        S s2 = this.f1562c;
        if (z4 && (i == 2 || i == 1)) {
            if (this.f1580n.e()) {
                if (focusFinder.findNextFocus(this, view, i == 2 ? 130 : 33) == null) {
                    z2 = true;
                    if (!z2 && this.f1580n.d()) {
                        z2 = focusFinder.findNextFocus(this, view, !((this.f1580n.C() != 1) ^ (i != 2)) ? 66 : 17) != null;
                    }
                    if (z2) {
                        p();
                        if (D(view) == null) {
                            return null;
                        }
                        i0();
                        this.f1580n.T(view, i, s2, y2);
                        j0(false);
                    }
                    view2 = focusFinder.findNextFocus(this, view, i);
                }
            }
            z2 = false;
            if (!z2) {
                if (focusFinder.findNextFocus(this, view, !((this.f1580n.C() != 1) ^ (i != 2)) ? 66 : 17) != null) {
                }
            }
            if (z2) {
            }
            view2 = focusFinder.findNextFocus(this, view, i);
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i);
            if (findNextFocus == null && z4) {
                p();
                if (D(view) == null) {
                    return null;
                }
                i0();
                view2 = this.f1580n.T(view, i, s2, y2);
                j0(false);
            } else {
                view2 = findNextFocus;
            }
        }
        if (view2 != null && !view2.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i);
            }
            b0(view2, null);
            return view;
        }
        if (view2 != null && view2 != this && view2 != view) {
            if (D(view2) == null) {
                z3 = false;
            } else if (view != null && D(view) != null) {
                int width = view.getWidth();
                int height = view.getHeight();
                Rect rect = this.f1573j;
                rect.set(0, 0, width, height);
                int width2 = view2.getWidth();
                int height2 = view2.getHeight();
                Rect rect2 = this.f1575k;
                rect2.set(0, 0, width2, height2);
                offsetDescendantRectToMyCoords(view, rect);
                offsetDescendantRectToMyCoords(view2, rect2);
                int i3 = this.f1580n.C() == 1 ? -1 : 1;
                int i4 = rect.left;
                int i5 = rect2.left;
                if ((i4 < i5 || rect.right <= i5) && rect.right < rect2.right) {
                    i2 = 1;
                } else {
                    int i6 = rect.right;
                    int i7 = rect2.right;
                    i2 = ((i6 > i7 || i4 >= i7) && i4 > i5) ? -1 : 0;
                }
                int i8 = rect.top;
                int i9 = rect2.top;
                if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
                    c2 = 1;
                } else {
                    int i10 = rect.bottom;
                    int i11 = rect2.bottom;
                    c2 = ((i10 > i11 || i8 >= i11) && i8 > i9) ? (char) 65535 : (char) 0;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 17) {
                            if (i != 33) {
                                if (i != 66) {
                                    if (i != 130) {
                                        StringBuilder sb = new StringBuilder("Invalid direction: ");
                                        sb.append(i);
                                        throw new IllegalArgumentException(Y.V.d(this, sb));
                                    }
                                }
                            }
                        }
                    } else if (c2 <= 0) {
                        if (c2 == 0) {
                        }
                    }
                } else if (c2 >= 0) {
                    if (c2 == 0) {
                    }
                }
            }
            return !z3 ? view2 : super.focusSearch(view, i);
        }
        z3 = false;
        if (!z3) {
        }
    }

    public final boolean g0(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        float y2 = l.y(edgeEffect) * i2;
        float abs = Math.abs(-i) * 0.35f;
        float f2 = this.f1558a * 0.015f;
        double log = Math.log(abs / f2);
        double d = f1530C0;
        return ((float) (Math.exp((d / (d - 1.0d)) * log) * ((double) f2))) < y2;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        L l2 = this.f1580n;
        if (l2 != null) {
            return l2.r();
        }
        throw new IllegalStateException(Y.V.d(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        L l2 = this.f1580n;
        if (l2 != null) {
            return l2.s(getContext(), attributeSet);
        }
        throw new IllegalStateException(Y.V.d(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC0112D getAdapter() {
        return this.f1578m;
    }

    @Override // android.view.View
    public int getBaseline() {
        L l2 = this.f1580n;
        if (l2 == null) {
            return super.getBaseline();
        }
        l2.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.h;
    }

    public e0 getCompatAccessibilityDelegate() {
        return this.f1581n0;
    }

    public G getEdgeEffectFactory() {
        return this.f1541G;
    }

    public H getItemAnimator() {
        return this.f1546L;
    }

    public int getItemDecorationCount() {
        return this.f1583p.size();
    }

    public L getLayoutManager() {
        return this.f1580n;
    }

    public int getMaxFlingVelocity() {
        return this.f1557W;
    }

    public int getMinFlingVelocity() {
        return this.f1556V;
    }

    public long getNanoTime() {
        if (f1532F0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public N getOnFlingListener() {
        return this.f1555U;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f1563c0;
    }

    public Q getRecycledViewPool() {
        return this.f1562c.c();
    }

    public int getScrollState() {
        return this.f1547M;
    }

    public final void h(c0 c0Var) {
        View view = c0Var.f2339a;
        boolean z2 = view.getParent() == this;
        this.f1562c.l(K(view));
        if (c0Var.l()) {
            this.f1567f.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z2) {
            this.f1567f.a(view, -1, true);
            return;
        }
        C0118d c0118d = this.f1567f;
        int indexOfChild = c0118d.f2355a.f2261a.indexOfChild(view);
        if (indexOfChild >= 0) {
            c0118d.f2356b.i(indexOfChild);
            c0118d.i(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final void h0(int i, int i2, boolean z2) {
        L l2 = this.f1580n;
        if (l2 == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f1599x) {
            return;
        }
        if (!l2.d()) {
            i = 0;
        }
        if (!this.f1580n.e()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (z2) {
            int i3 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i3 |= 2;
            }
            getScrollingChildHelper().g(i3, 1);
        }
        this.f1564d0.c(i, i2, Integer.MIN_VALUE, null);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(I i) {
        L l2 = this.f1580n;
        if (l2 != null) {
            l2.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f1583p;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(i);
        Q();
        requestLayout();
    }

    public final void i0() {
        int i = this.f1595v + 1;
        this.f1595v = i;
        if (i != 1 || this.f1599x) {
            return;
        }
        this.f1597w = false;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f1589s;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f1599x;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    public final void j(O o2) {
        if (this.f1572i0 == null) {
            this.f1572i0 = new ArrayList();
        }
        this.f1572i0.add(o2);
    }

    public final void j0(boolean z2) {
        if (this.f1595v < 1) {
            if (z0) {
                throw new IllegalStateException(Y.V.d(this, new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.")));
            }
            this.f1595v = 1;
        }
        if (!z2 && !this.f1599x) {
            this.f1597w = false;
        }
        if (this.f1595v == 1) {
            if (z2 && this.f1597w && !this.f1599x && this.f1580n != null && this.f1578m != null) {
                r();
            }
            if (!this.f1599x) {
                this.f1597w = false;
            }
        }
        this.f1595v--;
    }

    public final void k(String str) {
        if (O()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(Y.V.d(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        }
        if (this.F > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(Y.V.d(this, new StringBuilder(""))));
        }
    }

    public final void k0(int i) {
        getScrollingChildHelper().h(i);
    }

    public final void m() {
        int h = this.f1567f.h();
        for (int i = 0; i < h; i++) {
            c0 L2 = L(this.f1567f.g(i));
            if (!L2.q()) {
                L2.d = -1;
                L2.f2344g = -1;
            }
        }
        S s2 = this.f1562c;
        ArrayList arrayList = s2.f2298c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            c0 c0Var = (c0) arrayList.get(i2);
            c0Var.d = -1;
            c0Var.f2344g = -1;
        }
        ArrayList arrayList2 = s2.f2296a;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            c0 c0Var2 = (c0) arrayList2.get(i3);
            c0Var2.d = -1;
            c0Var2.f2344g = -1;
        }
        ArrayList arrayList3 = s2.f2297b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                c0 c0Var3 = (c0) s2.f2297b.get(i4);
                c0Var3.d = -1;
                c0Var3.f2344g = -1;
            }
        }
    }

    public final void n(int i, int i2) {
        boolean z2;
        EdgeEffect edgeEffect = this.f1542H;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z2 = false;
        } else {
            this.f1542H.onRelease();
            z2 = this.f1542H.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f1544J;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f1544J.onRelease();
            z2 |= this.f1544J.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1543I;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f1543I.onRelease();
            z2 |= this.f1543I.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1545K;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f1545K.onRelease();
            z2 |= this.f1545K.isFinished();
        }
        if (z2) {
            WeakHashMap weakHashMap = T.f423a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
    
        if (r1 >= 30.0f) goto L22;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAttachedToWindow() {
        float f2;
        super.onAttachedToWindow();
        this.f1540E = 0;
        this.f1589s = true;
        this.f1593u = this.f1593u && !isLayoutRequested();
        this.f1562c.d();
        L l2 = this.f1580n;
        if (l2 != null) {
            l2.f2280g = true;
            l2.R(this);
        }
        this.f1579m0 = false;
        if (f1532F0) {
            ThreadLocal threadLocal = RunnableC0131q.f2465e;
            RunnableC0131q runnableC0131q = (RunnableC0131q) threadLocal.get();
            this.f1566e0 = runnableC0131q;
            if (runnableC0131q == null) {
                RunnableC0131q runnableC0131q2 = new RunnableC0131q();
                runnableC0131q2.f2467a = new ArrayList();
                runnableC0131q2.d = new ArrayList();
                this.f1566e0 = runnableC0131q2;
                WeakHashMap weakHashMap = T.f423a;
                Display display = getDisplay();
                if (!isInEditMode() && display != null) {
                    f2 = display.getRefreshRate();
                }
                f2 = 60.0f;
                RunnableC0131q runnableC0131q3 = this.f1566e0;
                runnableC0131q3.f2469c = (long) (1.0E9f / f2);
                threadLocal.set(runnableC0131q3);
            }
            RunnableC0131q runnableC0131q4 = this.f1566e0;
            runnableC0131q4.getClass();
            boolean z2 = z0;
            ArrayList arrayList = runnableC0131q4.f2467a;
            if (z2 && arrayList.contains(this)) {
                throw new IllegalStateException("RecyclerView already present in worker list!");
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        S s2;
        RunnableC0131q runnableC0131q;
        C0137x c0137x;
        super.onDetachedFromWindow();
        H h = this.f1546L;
        if (h != null) {
            h.e();
        }
        int i = 0;
        setScrollState(0);
        b0 b0Var = this.f1564d0;
        b0Var.f2334g.removeCallbacks(b0Var);
        b0Var.f2331c.abortAnimation();
        L l2 = this.f1580n;
        if (l2 != null && (c0137x = l2.f2278e) != null) {
            c0137x.i();
        }
        this.f1589s = false;
        L l3 = this.f1580n;
        if (l3 != null) {
            l3.f2280g = false;
            l3.S(this);
        }
        this.f1592t0.clear();
        removeCallbacks(this.f1594u0);
        this.f1569g.getClass();
        while (m0.d.a() != null) {
        }
        int i2 = 0;
        while (true) {
            s2 = this.f1562c;
            ArrayList arrayList = s2.f2298c;
            if (i2 >= arrayList.size()) {
                break;
            }
            l.h(((c0) arrayList.get(i2)).f2339a);
            i2++;
        }
        s2.e(s2.h.f1578m, false);
        while (i < getChildCount()) {
            int i3 = i + 1;
            View childAt = getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            a aVar = (a) childAt.getTag(com.playbag.tripgear.R.id.pooling_container_listener_holder_tag);
            if (aVar == null) {
                aVar = new a();
                childAt.setTag(com.playbag.tripgear.R.id.pooling_container_listener_holder_tag, aVar);
            }
            ArrayList arrayList2 = aVar.f772a;
            int x02 = S0.h.x0(arrayList2);
            if (-1 < x02) {
                arrayList2.get(x02).getClass();
                throw new ClassCastException();
            }
            i = i3;
        }
        if (!f1532F0 || (runnableC0131q = this.f1566e0) == null) {
            return;
        }
        boolean remove = runnableC0131q.f2467a.remove(this);
        if (z0 && !remove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
        this.f1566e0 = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f1583p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((I) arrayList.get(i)).a(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f2;
        float f3;
        L l2;
        if (this.f1580n != null && !this.f1599x && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f2 = this.f1580n.e() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f1580n.d()) {
                    f3 = motionEvent.getAxisValue(10);
                    if (f2 == f1530C0 || f3 != f1530C0) {
                        int i = (int) (f3 * this.f1559a0);
                        int i2 = (int) (f2 * this.f1561b0);
                        l2 = this.f1580n;
                        if (l2 == null) {
                            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                        } else if (!this.f1599x) {
                            int[] iArr = this.f1590s0;
                            iArr[0] = 0;
                            iArr[1] = 0;
                            boolean d = l2.d();
                            boolean e2 = this.f1580n.e();
                            int i3 = e2 ? (d ? 1 : 0) | 2 : d ? 1 : 0;
                            float y2 = motionEvent.getY();
                            float x2 = motionEvent.getX();
                            int Z2 = i - Z(i, y2);
                            int a02 = i2 - a0(i2, x2);
                            getScrollingChildHelper().g(i3, 1);
                            if (u(d ? Z2 : 0, e2 ? a02 : 0, this.f1590s0, this.f1586q0, 1)) {
                                Z2 -= iArr[0];
                                a02 -= iArr[1];
                            }
                            d0(d ? Z2 : 0, e2 ? a02 : 0, motionEvent, 1);
                            RunnableC0131q runnableC0131q = this.f1566e0;
                            if (runnableC0131q != null && (Z2 != 0 || a02 != 0)) {
                                runnableC0131q.a(this, Z2, a02);
                            }
                            k0(1);
                        }
                    }
                }
                f3 = 0.0f;
                if (f2 == f1530C0) {
                }
                int i4 = (int) (f3 * this.f1559a0);
                int i22 = (int) (f2 * this.f1561b0);
                l2 = this.f1580n;
                if (l2 == null) {
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f1580n.e()) {
                        f2 = -axisValue;
                        f3 = 0.0f;
                        if (f2 == f1530C0) {
                        }
                        int i42 = (int) (f3 * this.f1559a0);
                        int i222 = (int) (f2 * this.f1561b0);
                        l2 = this.f1580n;
                        if (l2 == null) {
                        }
                    } else if (this.f1580n.d()) {
                        f3 = axisValue;
                        f2 = 0.0f;
                        if (f2 == f1530C0) {
                        }
                        int i422 = (int) (f3 * this.f1559a0);
                        int i2222 = (int) (f2 * this.f1561b0);
                        l2 = this.f1580n;
                        if (l2 == null) {
                        }
                    }
                }
                f2 = 0.0f;
                f3 = 0.0f;
                if (f2 == f1530C0) {
                }
                int i4222 = (int) (f3 * this.f1559a0);
                int i22222 = (int) (f2 * this.f1561b0);
                l2 = this.f1580n;
                if (l2 == null) {
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean z3;
        if (this.f1599x) {
            return false;
        }
        this.f1587r = null;
        if (E(motionEvent)) {
            c0();
            setScrollState(0);
            return true;
        }
        L l2 = this.f1580n;
        if (l2 == null) {
            return false;
        }
        boolean d = l2.d();
        boolean e2 = this.f1580n.e();
        if (this.f1549O == null) {
            this.f1549O = VelocityTracker.obtain();
        }
        this.f1549O.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f1601y) {
                this.f1601y = false;
            }
            this.f1548N = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.f1552R = x2;
            this.f1550P = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.f1553S = y2;
            this.f1551Q = y2;
            EdgeEffect edgeEffect = this.f1542H;
            if (edgeEffect == null || l.y(edgeEffect) == f1530C0 || canScrollHorizontally(-1)) {
                z2 = false;
            } else {
                l.L(this.f1542H, f1530C0, 1.0f - (motionEvent.getY() / getHeight()));
                z2 = true;
            }
            EdgeEffect edgeEffect2 = this.f1544J;
            boolean z4 = z2;
            if (edgeEffect2 != null) {
                z4 = z2;
                if (l.y(edgeEffect2) != f1530C0) {
                    z4 = z2;
                    if (!canScrollHorizontally(1)) {
                        l.L(this.f1544J, f1530C0, motionEvent.getY() / getHeight());
                        z4 = true;
                    }
                }
            }
            EdgeEffect edgeEffect3 = this.f1543I;
            boolean z5 = z4;
            if (edgeEffect3 != null) {
                z5 = z4;
                if (l.y(edgeEffect3) != f1530C0) {
                    z5 = z4;
                    if (!canScrollVertically(-1)) {
                        l.L(this.f1543I, f1530C0, motionEvent.getX() / getWidth());
                        z5 = true;
                    }
                }
            }
            EdgeEffect edgeEffect4 = this.f1545K;
            boolean z6 = z5;
            if (edgeEffect4 != null) {
                z6 = z5;
                if (l.y(edgeEffect4) != f1530C0) {
                    z6 = z5;
                    if (!canScrollVertically(1)) {
                        l.L(this.f1545K, f1530C0, 1.0f - (motionEvent.getX() / getWidth()));
                        z6 = true;
                    }
                }
            }
            if (z6 || this.f1547M == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                k0(1);
            }
            int[] iArr = this.f1588r0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i = d;
            if (e2) {
                i = (d ? 1 : 0) | 2;
            }
            getScrollingChildHelper().g(i, 0);
        } else if (actionMasked == 1) {
            this.f1549O.clear();
            k0(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f1548N);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f1548N + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f1547M != 1) {
                int i2 = x3 - this.f1550P;
                int i3 = y3 - this.f1551Q;
                if (d == 0 || Math.abs(i2) <= this.f1554T) {
                    z3 = false;
                } else {
                    this.f1552R = x3;
                    z3 = true;
                }
                if (e2 && Math.abs(i3) > this.f1554T) {
                    this.f1553S = y3;
                    z3 = true;
                }
                if (z3) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            c0();
            setScrollState(0);
        } else if (actionMasked == 5) {
            this.f1548N = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f1552R = x4;
            this.f1550P = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f1553S = y4;
            this.f1551Q = y4;
        } else if (actionMasked == 6) {
            U(motionEvent);
        }
        return this.f1547M == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int i5 = h.f234a;
        Trace.beginSection("RV OnLayout");
        r();
        Trace.endSection();
        this.f1593u = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        L l2 = this.f1580n;
        if (l2 == null) {
            q(i, i2);
            return;
        }
        boolean L2 = l2.L();
        boolean z2 = false;
        Y y2 = this.f1570g0;
        if (L2) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f1580n.f2276b.q(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z2 = true;
            }
            this.f1596v0 = z2;
            if (z2 || this.f1578m == null) {
                return;
            }
            if (y2.d == 1) {
                s();
            }
            this.f1580n.s0(i, i2);
            y2.i = true;
            t();
            this.f1580n.u0(i, i2);
            if (this.f1580n.x0()) {
                this.f1580n.s0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                y2.i = true;
                t();
                this.f1580n.u0(i, i2);
            }
            this.f1598w0 = getMeasuredWidth();
            this.f1600x0 = getMeasuredHeight();
            return;
        }
        if (this.f1591t) {
            this.f1580n.f2276b.q(i, i2);
            return;
        }
        if (this.f1536A) {
            i0();
            S();
            W();
            T(true);
            if (y2.f2317k) {
                y2.f2315g = true;
            } else {
                this.f1565e.d();
                y2.f2315g = false;
            }
            this.f1536A = false;
            j0(false);
        } else if (y2.f2317k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        AbstractC0112D abstractC0112D = this.f1578m;
        if (abstractC0112D != null) {
            y2.f2313e = abstractC0112D.a();
        } else {
            y2.f2313e = 0;
        }
        i0();
        this.f1580n.f2276b.q(i, i2);
        j0(false);
        y2.f2315g = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (O()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof V)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        V v2 = (V) parcelable;
        this.d = v2;
        super.onRestoreInstanceState(v2.f783a);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        V v2 = new V(super.onSaveInstanceState());
        V v3 = this.d;
        if (v3 != null) {
            v2.f2303c = v3.f2303c;
        } else {
            L l2 = this.f1580n;
            if (l2 != null) {
                v2.f2303c = l2.g0();
            } else {
                v2.f2303c = null;
            }
        }
        return v2;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.f1545K = null;
        this.f1543I = null;
        this.f1544J = null;
        this.f1542H = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:224:0x04d3, code lost:
    
        if (r2 < r4) goto L240;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x039c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0213  */
    /* JADX WARN: Type inference failed for: r5v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v28 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        RecyclerView recyclerView;
        MotionEvent motionEvent2;
        MotionEvent motionEvent3;
        int i;
        int i2;
        b0 b0Var;
        float f2;
        float f3;
        b0 b0Var2;
        MotionEvent motionEvent4;
        int minFlingVelocity;
        boolean z3;
        int H2;
        PointF a2;
        b0 b0Var3;
        int i3;
        RecyclerView recyclerView2;
        boolean z4;
        if (this.f1599x || this.f1601y) {
            return false;
        }
        C0128n c0128n = this.f1587r;
        if (c0128n == null) {
            z2 = motionEvent.getAction() == 0 ? false : E(motionEvent);
        } else {
            if (c0128n.f2453v != 0) {
                if (motionEvent.getAction() == 0) {
                    boolean d = c0128n.d(motionEvent.getX(), motionEvent.getY());
                    boolean c2 = c0128n.c(motionEvent.getX(), motionEvent.getY());
                    if (d || c2) {
                        if (c2) {
                            c0128n.f2454w = 1;
                            c0128n.f2447p = (int) motionEvent.getX();
                        } else if (d) {
                            c0128n.f2454w = 2;
                            c0128n.f2444m = (int) motionEvent.getY();
                        }
                        c0128n.f(2);
                    }
                } else if (motionEvent.getAction() == 1 && c0128n.f2453v == 2) {
                    c0128n.f2444m = f1530C0;
                    c0128n.f2447p = f1530C0;
                    c0128n.f(1);
                    c0128n.f2454w = 0;
                } else if (motionEvent.getAction() == 2 && c0128n.f2453v == 2) {
                    c0128n.g();
                    int i4 = c0128n.f2454w;
                    int i5 = c0128n.f2436b;
                    if (i4 == 1) {
                        float x2 = motionEvent.getX();
                        int[] iArr = c0128n.f2456y;
                        iArr[0] = i5;
                        int i6 = c0128n.f2448q - i5;
                        iArr[1] = i6;
                        float max = Math.max(i5, Math.min(i6, x2));
                        if (Math.abs(c0128n.f2446o - max) >= 2.0f) {
                            int e2 = C0128n.e(c0128n.f2447p, max, iArr, c0128n.f2450s.computeHorizontalScrollRange(), c0128n.f2450s.computeHorizontalScrollOffset(), c0128n.f2448q);
                            if (e2 != 0) {
                                c0128n.f2450s.scrollBy(e2, 0);
                            }
                            c0128n.f2447p = max;
                        }
                    }
                    if (c0128n.f2454w == 2) {
                        float y2 = motionEvent.getY();
                        int[] iArr2 = c0128n.f2455x;
                        iArr2[0] = i5;
                        int i7 = c0128n.f2449r - i5;
                        iArr2[1] = i7;
                        float max2 = Math.max(i5, Math.min(i7, y2));
                        if (Math.abs(c0128n.f2443l - max2) >= 2.0f) {
                            int e3 = C0128n.e(c0128n.f2444m, max2, iArr2, c0128n.f2450s.computeVerticalScrollRange(), c0128n.f2450s.computeVerticalScrollOffset(), c0128n.f2449r);
                            if (e3 != 0) {
                                c0128n.f2450s.scrollBy(0, e3);
                            }
                            c0128n.f2444m = max2;
                        }
                    }
                }
            }
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.f1587r = null;
            }
            z2 = true;
        }
        if (z2) {
            c0();
            setScrollState(0);
            return true;
        }
        L l2 = this.f1580n;
        if (l2 == null) {
            return false;
        }
        boolean d2 = l2.d();
        boolean e4 = this.f1580n.e();
        if (this.f1549O == null) {
            this.f1549O = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        int[] iArr3 = this.f1588r0;
        if (actionMasked == 0) {
            iArr3[1] = 0;
            iArr3[0] = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(iArr3[0], iArr3[1]);
        if (actionMasked == 0) {
            recyclerView = this;
            motionEvent2 = obtain;
            recyclerView.f1548N = motionEvent.getPointerId(0);
            int x3 = (int) (motionEvent.getX() + 0.5f);
            recyclerView.f1552R = x3;
            recyclerView.f1550P = x3;
            int y3 = (int) (motionEvent.getY() + 0.5f);
            recyclerView.f1553S = y3;
            recyclerView.f1551Q = y3;
            int i8 = d2;
            if (e4) {
                i8 = (d2 ? 1 : 0) | 2;
            }
            getScrollingChildHelper().g(i8, 0);
        } else {
            if (actionMasked == 1) {
                this.f1549O.addMovement(obtain);
                VelocityTracker velocityTracker = this.f1549O;
                int i9 = this.f1557W;
                velocityTracker.computeCurrentVelocity(1000, i9);
                float f4 = d2 != 0 ? -this.f1549O.getXVelocity(this.f1548N) : 0.0f;
                float f5 = e4 ? -this.f1549O.getYVelocity(this.f1548N) : 0.0f;
                if (f4 == f1530C0 && f5 == f1530C0) {
                    recyclerView2 = this;
                    i3 = 0;
                    motionEvent4 = obtain;
                } else {
                    int i10 = (int) f4;
                    int i11 = (int) f5;
                    L l3 = this.f1580n;
                    if (l3 == null) {
                        Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                    } else if (!this.f1599x) {
                        int d3 = l3.d();
                        boolean e5 = this.f1580n.e();
                        int i12 = this.f1556V;
                        if (d3 == 0 || Math.abs(i10) < i12) {
                            i10 = 0;
                        }
                        if (!e5 || Math.abs(i11) < i12) {
                            i11 = 0;
                        }
                        if (i10 != 0 || i11 != 0) {
                            if (i10 != 0) {
                                EdgeEffect edgeEffect = this.f1542H;
                                if (edgeEffect == null || l.y(edgeEffect) == f1530C0) {
                                    EdgeEffect edgeEffect2 = this.f1544J;
                                    if (edgeEffect2 != null && l.y(edgeEffect2) != f1530C0) {
                                        if (g0(this.f1544J, i10, getWidth())) {
                                            this.f1544J.onAbsorb(i10);
                                            i10 = 0;
                                        }
                                        i = i10;
                                        i10 = 0;
                                    }
                                } else {
                                    int i13 = -i10;
                                    if (g0(this.f1542H, i13, getWidth())) {
                                        this.f1542H.onAbsorb(i13);
                                        i10 = 0;
                                    }
                                    i = i10;
                                    i10 = 0;
                                }
                                if (i11 != 0) {
                                    EdgeEffect edgeEffect3 = this.f1543I;
                                    if (edgeEffect3 == null || l.y(edgeEffect3) == f1530C0) {
                                        EdgeEffect edgeEffect4 = this.f1545K;
                                        if (edgeEffect4 != null && l.y(edgeEffect4) != f1530C0) {
                                            if (g0(this.f1545K, i11, getHeight())) {
                                                this.f1545K.onAbsorb(i11);
                                                i11 = 0;
                                            }
                                            i2 = 0;
                                        }
                                    } else {
                                        int i14 = -i11;
                                        if (g0(this.f1543I, i14, getHeight())) {
                                            this.f1543I.onAbsorb(i14);
                                            i11 = 0;
                                        }
                                        i2 = 0;
                                    }
                                    b0Var = this.f1564d0;
                                    if (i == 0 || i11 != 0) {
                                        int i15 = -i9;
                                        i = Math.max(i15, Math.min(i, i9));
                                        i11 = Math.max(i15, Math.min(i11, i9));
                                        b0Var.a(i, i11);
                                    }
                                    if (i10 == 0 || i2 != 0) {
                                        f2 = i10;
                                        f3 = i2;
                                        if (!dispatchNestedPreFling(f2, f3)) {
                                            boolean z5 = d3 != 0 || e5;
                                            dispatchNestedFling(f2, f3, z5);
                                            N n2 = this.f1555U;
                                            if (n2 != null) {
                                                C0109A c0109a = (C0109A) n2;
                                                L layoutManager = c0109a.f2256a.getLayoutManager();
                                                if (layoutManager != 0 && c0109a.f2256a.getAdapter() != null && ((Math.abs(i2) > (minFlingVelocity = c0109a.f2256a.getMinFlingVelocity()) || Math.abs(i10) > minFlingVelocity) && ((z3 = layoutManager instanceof X)))) {
                                                    C0139z c0139z = !z3 ? null : new C0139z(c0109a, c0109a.f2256a.getContext(), 0);
                                                    if (c0139z != null) {
                                                        int B2 = layoutManager.B();
                                                        if (B2 != 0) {
                                                            g e6 = layoutManager.e() ? c0109a.e(layoutManager) : layoutManager.d() ? c0109a.d(layoutManager) : null;
                                                            if (e6 != null) {
                                                                int v2 = layoutManager.v();
                                                                motionEvent4 = obtain;
                                                                int i16 = Integer.MIN_VALUE;
                                                                int i17 = Integer.MAX_VALUE;
                                                                int i18 = 0;
                                                                View view = null;
                                                                View view2 = null;
                                                                while (i18 < v2) {
                                                                    int i19 = v2;
                                                                    View u2 = layoutManager.u(i18);
                                                                    if (u2 == null) {
                                                                        b0Var3 = b0Var;
                                                                    } else {
                                                                        b0Var3 = b0Var;
                                                                        int b2 = C0109A.b(u2, e6);
                                                                        if (b2 <= 0 && b2 > i16) {
                                                                            view2 = u2;
                                                                            i16 = b2;
                                                                        }
                                                                        if (b2 >= 0 && b2 < i17) {
                                                                            view = u2;
                                                                            i17 = b2;
                                                                        }
                                                                    }
                                                                    i18++;
                                                                    v2 = i19;
                                                                    b0Var = b0Var3;
                                                                }
                                                                b0Var2 = b0Var;
                                                                boolean z6 = !layoutManager.d() ? i2 <= 0 : i10 <= 0;
                                                                if (z6 && view != null) {
                                                                    H2 = L.H(view);
                                                                } else if (z6 || view2 == null) {
                                                                    if (z6) {
                                                                        view = view2;
                                                                    }
                                                                    if (view != null) {
                                                                        H2 = ((z3 && (a2 = ((X) layoutManager).a(layoutManager.B() - 1)) != null && ((a2.x > f1530C0 ? 1 : (a2.x == f1530C0 ? 0 : -1)) < 0 || (a2.y > f1530C0 ? 1 : (a2.y == f1530C0 ? 0 : -1)) < 0)) == z6 ? -1 : 1) + L.H(view);
                                                                        if (H2 >= 0) {
                                                                        }
                                                                    }
                                                                    H2 = -1;
                                                                } else {
                                                                    H2 = L.H(view2);
                                                                }
                                                                if (H2 != -1) {
                                                                    c0139z.f2497a = H2;
                                                                    layoutManager.A0(c0139z);
                                                                }
                                                                if (z5) {
                                                                    if (e5) {
                                                                        d3 = (d3 == true ? 1 : 0) | 2;
                                                                    }
                                                                    getScrollingChildHelper().g(d3, 1);
                                                                    int i20 = -i9;
                                                                    b0Var2.a(Math.max(i20, Math.min(i10, i9)), Math.max(i20, Math.min(i2, i9)));
                                                                }
                                                                i3 = 0;
                                                                recyclerView2 = this;
                                                            }
                                                        }
                                                        b0Var2 = b0Var;
                                                        motionEvent4 = obtain;
                                                        H2 = -1;
                                                        if (H2 != -1) {
                                                        }
                                                        if (z5) {
                                                        }
                                                        i3 = 0;
                                                        recyclerView2 = this;
                                                    }
                                                }
                                            }
                                            b0Var2 = b0Var;
                                            motionEvent4 = obtain;
                                            if (z5) {
                                            }
                                            i3 = 0;
                                            recyclerView2 = this;
                                        }
                                    } else if (i != 0 || i11 != 0) {
                                        motionEvent4 = obtain;
                                    }
                                    c0();
                                    motionEvent3 = motionEvent4;
                                    motionEvent3.recycle();
                                    return true;
                                }
                                i2 = i11;
                                i11 = 0;
                                b0Var = this.f1564d0;
                                if (i == 0) {
                                }
                                int i152 = -i9;
                                i = Math.max(i152, Math.min(i, i9));
                                i11 = Math.max(i152, Math.min(i11, i9));
                                b0Var.a(i, i11);
                                if (i10 == 0) {
                                }
                                f2 = i10;
                                f3 = i2;
                                if (!dispatchNestedPreFling(f2, f3)) {
                                }
                            }
                            i = 0;
                            if (i11 != 0) {
                            }
                            i2 = i11;
                            i11 = 0;
                            b0Var = this.f1564d0;
                            if (i == 0) {
                            }
                            int i1522 = -i9;
                            i = Math.max(i1522, Math.min(i, i9));
                            i11 = Math.max(i1522, Math.min(i11, i9));
                            b0Var.a(i, i11);
                            if (i10 == 0) {
                            }
                            f2 = i10;
                            f3 = i2;
                            if (!dispatchNestedPreFling(f2, f3)) {
                            }
                        }
                    }
                    motionEvent4 = obtain;
                    i3 = 0;
                    recyclerView2 = this;
                }
                recyclerView2.setScrollState(i3);
                c0();
                motionEvent3 = motionEvent4;
                motionEvent3.recycle();
                return true;
            }
            if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f1548N);
                if (findPointerIndex < 0) {
                    Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f1548N + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                int x4 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                int y4 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                int i21 = this.f1552R - x4;
                int i22 = this.f1553S - y4;
                if (this.f1547M != 1) {
                    if (d2 != 0) {
                        i21 = i21 > 0 ? Math.max(0, i21 - this.f1554T) : Math.min(0, i21 + this.f1554T);
                        if (i21 != 0) {
                            z4 = true;
                            if (e4) {
                                i22 = i22 > 0 ? Math.max(0, i22 - this.f1554T) : Math.min(0, i22 + this.f1554T);
                                if (i22 != 0) {
                                    z4 = true;
                                }
                            }
                            if (z4) {
                                setScrollState(1);
                            }
                        }
                    }
                    z4 = false;
                    if (e4) {
                    }
                    if (z4) {
                    }
                }
                if (this.f1547M == 1) {
                    int[] iArr4 = this.f1590s0;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    int Z2 = i21 - Z(i21, motionEvent.getY());
                    int a02 = i22 - a0(i22, motionEvent.getX());
                    boolean u3 = u(d2 != 0 ? Z2 : 0, e4 ? a02 : 0, this.f1590s0, this.f1586q0, 0);
                    int[] iArr5 = this.f1586q0;
                    if (u3) {
                        Z2 -= iArr4[0];
                        a02 -= iArr4[1];
                        iArr3[0] = iArr3[0] + iArr5[0];
                        iArr3[1] = iArr3[1] + iArr5[1];
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int i23 = Z2;
                    int i24 = a02;
                    this.f1552R = x4 - iArr5[0];
                    this.f1553S = y4 - iArr5[1];
                    if (d0(d2 != 0 ? i23 : 0, e4 ? i24 : 0, motionEvent, 0)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    RunnableC0131q runnableC0131q = this.f1566e0;
                    if (runnableC0131q != null && (i23 != 0 || i24 != 0)) {
                        runnableC0131q.a(this, i23, i24);
                    }
                }
            } else if (actionMasked == 3) {
                c0();
                setScrollState(0);
            } else if (actionMasked == 5) {
                this.f1548N = motionEvent.getPointerId(actionIndex);
                int x5 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.f1552R = x5;
                this.f1550P = x5;
                int y5 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.f1553S = y5;
                this.f1551Q = y5;
            } else if (actionMasked == 6) {
                U(motionEvent);
            }
            recyclerView = this;
            motionEvent2 = obtain;
        }
        motionEvent3 = motionEvent2;
        recyclerView.f1549O.addMovement(motionEvent3);
        motionEvent3.recycle();
        return true;
    }

    public final void p() {
        C0118d c0118d = this.f1567f;
        C0116b c0116b = this.f1565e;
        if (!this.f1593u || this.f1538C) {
            int i = h.f234a;
            Trace.beginSection("RV FullInvalidate");
            r();
            Trace.endSection();
            return;
        }
        if (c0116b.j()) {
            int i2 = c0116b.f2324a;
            if ((i2 & 4) == 0 || (i2 & 11) != 0) {
                if (c0116b.j()) {
                    int i3 = h.f234a;
                    Trace.beginSection("RV FullInvalidate");
                    r();
                    Trace.endSection();
                    return;
                }
                return;
            }
            int i4 = h.f234a;
            Trace.beginSection("RV PartialInvalidate");
            i0();
            S();
            c0116b.p();
            if (!this.f1597w) {
                int e2 = c0118d.e();
                int i5 = 0;
                while (true) {
                    if (i5 < e2) {
                        c0 L2 = L(c0118d.d(i5));
                        if (L2 != null && !L2.q() && L2.m()) {
                            r();
                            break;
                        }
                        i5++;
                    } else {
                        c0116b.c();
                        break;
                    }
                }
            }
            j0(true);
            T(true);
            Trace.endSection();
        }
    }

    public final void q(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = T.f423a;
        setMeasuredDimension(L.g(i, paddingRight, getMinimumWidth()), L.g(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x0332, code lost:
    
        if (r19.f1567f.f2357c.contains(getFocusedChild()) == false) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x038d, code lost:
    
        if (r6.hasFocusable() != false) goto L190;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [g0.c0] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r() {
        ?? r10;
        View view;
        View findViewById;
        boolean z2;
        C0019q c0019q;
        int i;
        RecyclerView recyclerView;
        boolean g2;
        if (this.f1578m == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f1580n == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        Y y2 = this.f1570g0;
        y2.i = false;
        boolean z3 = this.f1596v0 && !(this.f1598w0 == getWidth() && this.f1600x0 == getHeight());
        this.f1598w0 = 0;
        this.f1600x0 = 0;
        this.f1596v0 = false;
        if (y2.d == 1) {
            s();
            this.f1580n.r0(this);
            t();
        } else {
            C0116b c0116b = this.f1565e;
            if ((((ArrayList) c0116b.d).isEmpty() || ((ArrayList) c0116b.f2326c).isEmpty()) && !z3 && this.f1580n.f2285n == getWidth() && this.f1580n.f2286o == getHeight()) {
                this.f1580n.r0(this);
            } else {
                this.f1580n.r0(this);
                t();
            }
        }
        y2.a(4);
        i0();
        S();
        y2.d = 1;
        boolean z4 = y2.f2316j;
        View view2 = null;
        Long l2 = null;
        S s2 = this.f1562c;
        j jVar = this.f1569g;
        if (z4) {
            int e2 = this.f1567f.e() - 1;
            while (e2 >= 0) {
                c0 L2 = L(this.f1567f.d(e2));
                if (!L2.q()) {
                    long J2 = J(L2);
                    this.f1546L.getClass();
                    C0019q c0019q2 = new C0019q();
                    c0019q2.a(L2);
                    c0 c0Var = (c0) ((e) jVar.f32c).c(J2, l2);
                    if (c0Var == null || c0Var.q()) {
                        jVar.a(L2, c0019q2);
                    } else {
                        k kVar = (k) jVar.f31b;
                        m0 m0Var = (m0) kVar.getOrDefault(c0Var, l2);
                        boolean z5 = (m0Var == null || (m0Var.f2428a & 1) == 0) ? false : true;
                        m0 m0Var2 = (m0) kVar.getOrDefault(L2, l2);
                        boolean z6 = (m0Var2 == null || (m0Var2.f2428a & 1) == 0) ? false : true;
                        if (z5 && c0Var == L2) {
                            jVar.a(L2, c0019q2);
                        } else {
                            C0019q H2 = jVar.H(c0Var, 4);
                            jVar.a(L2, c0019q2);
                            C0019q H3 = jVar.H(L2, 8);
                            if (H2 == null) {
                                int e3 = this.f1567f.e();
                                for (int i2 = 0; i2 < e3; i2++) {
                                    c0 L3 = L(this.f1567f.d(i2));
                                    if (L3 != L2 && J(L3) == J2) {
                                        AbstractC0112D abstractC0112D = this.f1578m;
                                        if (abstractC0112D == null || !abstractC0112D.f2263b) {
                                            StringBuilder sb = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                                            sb.append(L3);
                                            sb.append(" \n View Holder 2:");
                                            sb.append(L2);
                                            throw new IllegalStateException(Y.V.d(this, sb));
                                        }
                                        StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                                        sb2.append(L3);
                                        sb2.append(" \n View Holder 2:");
                                        sb2.append(L2);
                                        throw new IllegalStateException(Y.V.d(this, sb2));
                                    }
                                }
                                Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + c0Var + " cannot be found but it is necessary for " + L2 + B());
                            } else {
                                c0Var.p(false);
                                if (z5) {
                                    h(c0Var);
                                }
                                if (c0Var != L2) {
                                    if (z6) {
                                        h(L2);
                                    }
                                    c0Var.h = L2;
                                    h(c0Var);
                                    s2.l(c0Var);
                                    L2.p(false);
                                    L2.i = c0Var;
                                }
                                if (this.f1546L.a(c0Var, L2, H2, H3)) {
                                    V();
                                }
                            }
                        }
                    }
                }
                e2--;
                l2 = null;
            }
            k kVar2 = (k) jVar.f31b;
            for (int i3 = kVar2.f3246c - 1; i3 >= 0; i3--) {
                c0 c0Var2 = (c0) kVar2.h(i3);
                m0 m0Var3 = (m0) kVar2.i(i3);
                int i4 = m0Var3.f2428a;
                int i5 = i4 & 3;
                C0111C c0111c = this.f1602y0;
                if (i5 == 3) {
                    RecyclerView recyclerView2 = c0111c.f2261a;
                    recyclerView2.f1580n.k0(c0Var2.f2339a, recyclerView2.f1562c);
                } else if ((i4 & 1) != 0) {
                    C0019q c0019q3 = m0Var3.f2429b;
                    if (c0019q3 == null) {
                        RecyclerView recyclerView3 = c0111c.f2261a;
                        recyclerView3.f1580n.k0(c0Var2.f2339a, recyclerView3.f1562c);
                    } else {
                        c0111c.g(c0Var2, c0019q3, m0Var3.f2430c);
                    }
                } else if ((i4 & 14) == 14) {
                    c0111c.f(c0Var2, m0Var3.f2429b, m0Var3.f2430c);
                } else if ((i4 & 12) == 12) {
                    C0019q c0019q4 = m0Var3.f2429b;
                    C0019q c0019q5 = m0Var3.f2430c;
                    c0111c.getClass();
                    c0Var2.p(false);
                    RecyclerView recyclerView4 = c0111c.f2261a;
                    if (!recyclerView4.f1538C) {
                        C0125k c0125k = (C0125k) recyclerView4.f1546L;
                        c0125k.getClass();
                        int i6 = c0019q4.f493a;
                        int i7 = c0019q5.f493a;
                        if (i6 == i7 && c0019q4.f494b == c0019q5.f494b) {
                            c0125k.c(c0Var2);
                            recyclerView = recyclerView4;
                            g2 = false;
                        } else {
                            recyclerView = recyclerView4;
                            g2 = c0125k.g(c0Var2, i6, c0019q4.f494b, i7, c0019q5.f494b);
                        }
                        if (g2) {
                            recyclerView.V();
                        }
                    } else if (recyclerView4.f1546L.a(c0Var2, c0Var2, c0019q4, c0019q5)) {
                        recyclerView4.V();
                    }
                } else {
                    if ((i4 & 4) != 0) {
                        c0019q = null;
                        c0111c.g(c0Var2, m0Var3.f2429b, null);
                    } else {
                        c0019q = null;
                        if ((i4 & 8) != 0) {
                            c0111c.f(c0Var2, m0Var3.f2429b, m0Var3.f2430c);
                        }
                    }
                    i = 0;
                    m0Var3.f2428a = i;
                    m0Var3.f2429b = c0019q;
                    m0Var3.f2430c = c0019q;
                    m0.d.c(m0Var3);
                }
                i = 0;
                c0019q = null;
                m0Var3.f2428a = i;
                m0Var3.f2429b = c0019q;
                m0Var3.f2430c = c0019q;
                m0.d.c(m0Var3);
            }
            view2 = null;
        }
        this.f1580n.j0(s2);
        y2.f2311b = y2.f2313e;
        this.f1538C = false;
        this.f1539D = false;
        y2.f2316j = false;
        y2.f2317k = false;
        this.f1580n.f2279f = false;
        ArrayList arrayList = s2.f2297b;
        if (arrayList != null) {
            arrayList.clear();
        }
        L l3 = this.f1580n;
        if (l3.f2282k) {
            l3.f2281j = 0;
            l3.f2282k = false;
            s2.m();
        }
        this.f1580n.e0(y2);
        T(true);
        j0(false);
        ((k) jVar.f31b).clear();
        ((e) jVar.f32c).a();
        int[] iArr = this.o0;
        int i8 = iArr[0];
        int i9 = iArr[1];
        F(iArr);
        if ((iArr[0] == i8 && iArr[1] == i9) ? false : true) {
            w(0, 0);
        }
        if (this.f1563c0 && this.f1578m != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (!isFocused()) {
            }
            long j2 = y2.f2319m;
            if (j2 != -1 && (z2 = this.f1578m.f2263b) && z2) {
                int h = this.f1567f.h();
                r10 = view2;
                int i10 = 0;
                while (true) {
                    if (i10 >= h) {
                        break;
                    }
                    c0 L4 = L(this.f1567f.g(i10));
                    if (L4 != null && !L4.j() && L4.f2342e == j2) {
                        if (!this.f1567f.f2357c.contains(L4.f2339a)) {
                            r10 = L4;
                            break;
                        }
                        r10 = L4;
                    }
                    i10++;
                    r10 = r10;
                }
            } else {
                r10 = view2;
            }
            if (r10 != null) {
                ArrayList arrayList2 = this.f1567f.f2357c;
                view = r10.f2339a;
                if (!arrayList2.contains(view)) {
                }
            }
            if (this.f1567f.e() > 0) {
                int i11 = y2.f2318l;
                if (i11 == -1) {
                    i11 = 0;
                }
                int b2 = y2.b();
                for (int i12 = i11; i12 < b2; i12++) {
                    c0 H4 = H(i12);
                    if (H4 == null) {
                        break;
                    }
                    View view3 = H4.f2339a;
                    if (view3.hasFocusable()) {
                        view2 = view3;
                        break;
                    }
                }
                for (int min = Math.min(b2, i11) - 1; min >= 0; min--) {
                    c0 H5 = H(min);
                    if (H5 == null) {
                        break;
                    }
                    view = H5.f2339a;
                    if (view.hasFocusable()) {
                        view2 = view;
                        break;
                    }
                }
            }
            if (view2 != null) {
                int i13 = y2.f2320n;
                if (i13 != -1 && (findViewById = view2.findViewById(i13)) != null && findViewById.isFocusable()) {
                    view2 = findViewById;
                }
                view2.requestFocus();
            }
        }
        y2.f2319m = -1L;
        y2.f2318l = -1;
        y2.f2320n = -1;
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z2) {
        c0 L2 = L(view);
        if (L2 != null) {
            if (L2.l()) {
                L2.f2345j &= -257;
            } else if (!L2.q()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(L2);
                throw new IllegalArgumentException(Y.V.d(this, sb));
            }
        } else if (z0) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            throw new IllegalArgumentException(Y.V.d(this, sb2));
        }
        view.clearAnimation();
        L(view);
        super.removeDetachedView(view, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        C0137x c0137x = this.f1580n.f2278e;
        if ((c0137x == null || !c0137x.f2500e) && !O() && view2 != null) {
            b0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.f1580n.m0(this, view, rect, z2, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        ArrayList arrayList = this.f1585q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C0128n) arrayList.get(i)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f1595v != 0 || this.f1599x) {
            this.f1597w = true;
        } else {
            super.requestLayout();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x009b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x007f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s() {
        View D2;
        int I2;
        View view;
        m0 m0Var;
        Y y2 = this.f1570g0;
        y2.a(1);
        C(y2);
        y2.i = false;
        i0();
        j jVar = this.f1569g;
        ((k) jVar.f31b).clear();
        e eVar = (e) jVar.f32c;
        eVar.a();
        S();
        W();
        View focusedChild = (this.f1563c0 && hasFocus() && this.f1578m != null) ? getFocusedChild() : null;
        c0 K2 = (focusedChild == null || (D2 = D(focusedChild)) == null) ? null : K(D2);
        if (K2 == null) {
            y2.f2319m = -1L;
            y2.f2318l = -1;
            y2.f2320n = -1;
        } else {
            y2.f2319m = this.f1578m.f2263b ? K2.f2342e : -1L;
            if (!this.f1538C) {
                if (K2.j()) {
                    I2 = K2.d;
                } else {
                    RecyclerView recyclerView = K2.f2353r;
                    if (recyclerView != null) {
                        I2 = recyclerView.I(K2);
                    }
                }
                y2.f2318l = I2;
                view = K2.f2339a;
                int id = view.getId();
                while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                    view = ((ViewGroup) view).getFocusedChild();
                    if (view.getId() == -1) {
                        id = view.getId();
                    }
                }
                y2.f2320n = id;
            }
            I2 = -1;
            y2.f2318l = I2;
            view = K2.f2339a;
            int id2 = view.getId();
            while (!view.isFocused()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() == -1) {
                }
            }
            y2.f2320n = id2;
        }
        y2.h = y2.f2316j && this.k0;
        this.k0 = false;
        this.f1574j0 = false;
        y2.f2315g = y2.f2317k;
        y2.f2313e = this.f1578m.a();
        F(this.o0);
        boolean z2 = y2.f2316j;
        k kVar = (k) jVar.f31b;
        if (z2) {
            int e2 = this.f1567f.e();
            for (int i = 0; i < e2; i++) {
                c0 L2 = L(this.f1567f.d(i));
                if (!L2.q() && (!L2.h() || this.f1578m.f2263b)) {
                    H h = this.f1546L;
                    H.b(L2);
                    L2.d();
                    h.getClass();
                    C0019q c0019q = new C0019q();
                    c0019q.a(L2);
                    m0 m0Var2 = (m0) kVar.getOrDefault(L2, null);
                    if (m0Var2 == null) {
                        m0Var2 = m0.a();
                        kVar.put(L2, m0Var2);
                    }
                    m0Var2.f2429b = c0019q;
                    m0Var2.f2428a |= 4;
                    if (y2.h && L2.m() && !L2.j() && !L2.q() && !L2.h()) {
                        eVar.d(J(L2), L2);
                    }
                }
            }
        }
        if (y2.f2317k) {
            int h2 = this.f1567f.h();
            for (int i2 = 0; i2 < h2; i2++) {
                c0 L3 = L(this.f1567f.g(i2));
                if (z0 && L3.f2341c == -1 && !L3.j()) {
                    throw new IllegalStateException(Y.V.d(this, new StringBuilder("view holder cannot have position -1 unless it is removed")));
                }
                if (!L3.q() && L3.d == -1) {
                    L3.d = L3.f2341c;
                }
            }
            boolean z3 = y2.f2314f;
            y2.f2314f = false;
            this.f1580n.d0(this.f1562c, y2);
            y2.f2314f = z3;
            for (int i3 = 0; i3 < this.f1567f.e(); i3++) {
                c0 L4 = L(this.f1567f.d(i3));
                if (!L4.q() && ((m0Var = (m0) kVar.getOrDefault(L4, null)) == null || (m0Var.f2428a & 4) == 0)) {
                    H.b(L4);
                    boolean e3 = L4.e(8192);
                    H h3 = this.f1546L;
                    L4.d();
                    h3.getClass();
                    C0019q c0019q2 = new C0019q();
                    c0019q2.a(L4);
                    if (e3) {
                        Y(L4, c0019q2);
                    } else {
                        m0 m0Var3 = (m0) kVar.getOrDefault(L4, null);
                        if (m0Var3 == null) {
                            m0Var3 = m0.a();
                            kVar.put(L4, m0Var3);
                        }
                        m0Var3.f2428a |= 2;
                        m0Var3.f2429b = c0019q2;
                    }
                }
            }
            m();
        } else {
            m();
        }
        T(true);
        j0(false);
        y2.d = 2;
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        L l2 = this.f1580n;
        if (l2 == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f1599x) {
            return;
        }
        boolean d = l2.d();
        boolean e2 = this.f1580n.e();
        if (d || e2) {
            if (!d) {
                i = 0;
            }
            if (!e2) {
                i2 = 0;
            }
            d0(i, i2, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!O()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.f1603z |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(e0 e0Var) {
        this.f1581n0 = e0Var;
        T.l(this, e0Var);
    }

    public void setAdapter(AbstractC0112D abstractC0112D) {
        setLayoutFrozen(false);
        AbstractC0112D abstractC0112D2 = this.f1578m;
        U u2 = this.f1560b;
        if (abstractC0112D2 != null) {
            abstractC0112D2.f2262a.unregisterObserver(u2);
            this.f1578m.getClass();
        }
        H h = this.f1546L;
        if (h != null) {
            h.e();
        }
        L l2 = this.f1580n;
        S s2 = this.f1562c;
        if (l2 != null) {
            l2.i0(s2);
            this.f1580n.j0(s2);
        }
        s2.f2296a.clear();
        s2.f();
        C0116b c0116b = this.f1565e;
        c0116b.q((ArrayList) c0116b.f2326c);
        c0116b.q((ArrayList) c0116b.d);
        c0116b.f2324a = 0;
        AbstractC0112D abstractC0112D3 = this.f1578m;
        this.f1578m = abstractC0112D;
        if (abstractC0112D != null) {
            abstractC0112D.f2262a.registerObserver(u2);
        }
        L l3 = this.f1580n;
        if (l3 != null) {
            l3.Q();
        }
        AbstractC0112D abstractC0112D4 = this.f1578m;
        s2.f2296a.clear();
        s2.f();
        s2.e(abstractC0112D3, true);
        Q c2 = s2.c();
        if (abstractC0112D3 != null) {
            c2.f2294b--;
        }
        if (c2.f2294b == 0) {
            int i = 0;
            while (true) {
                SparseArray sparseArray = c2.f2293a;
                if (i >= sparseArray.size()) {
                    break;
                }
                P p2 = (P) sparseArray.valueAt(i);
                Iterator it = p2.f2290a.iterator();
                while (it.hasNext()) {
                    l.h(((c0) it.next()).f2339a);
                }
                p2.f2290a.clear();
                i++;
            }
        }
        if (abstractC0112D4 != null) {
            c2.f2294b++;
        }
        s2.d();
        this.f1570g0.f2314f = true;
        X(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC0114F interfaceC0114F) {
        if (interfaceC0114F == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z2) {
        if (z2 != this.h) {
            this.f1545K = null;
            this.f1543I = null;
            this.f1544J = null;
            this.f1542H = null;
        }
        this.h = z2;
        super.setClipToPadding(z2);
        if (this.f1593u) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(G g2) {
        g2.getClass();
        this.f1541G = g2;
        this.f1545K = null;
        this.f1543I = null;
        this.f1544J = null;
        this.f1542H = null;
    }

    public void setHasFixedSize(boolean z2) {
        this.f1591t = z2;
    }

    public void setItemAnimator(H h) {
        H h2 = this.f1546L;
        if (h2 != null) {
            h2.e();
            this.f1546L.f2265a = null;
        }
        this.f1546L = h;
        if (h != null) {
            h.f2265a = this.f1577l0;
        }
    }

    public void setItemViewCacheSize(int i) {
        S s2 = this.f1562c;
        s2.f2299e = i;
        s2.m();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(L l2) {
        RecyclerView recyclerView;
        C0137x c0137x;
        if (l2 == this.f1580n) {
            return;
        }
        setScrollState(0);
        b0 b0Var = this.f1564d0;
        b0Var.f2334g.removeCallbacks(b0Var);
        b0Var.f2331c.abortAnimation();
        L l3 = this.f1580n;
        if (l3 != null && (c0137x = l3.f2278e) != null) {
            c0137x.i();
        }
        L l4 = this.f1580n;
        S s2 = this.f1562c;
        if (l4 != null) {
            H h = this.f1546L;
            if (h != null) {
                h.e();
            }
            this.f1580n.i0(s2);
            this.f1580n.j0(s2);
            s2.f2296a.clear();
            s2.f();
            if (this.f1589s) {
                L l5 = this.f1580n;
                l5.f2280g = false;
                l5.S(this);
            }
            this.f1580n.v0(null);
            this.f1580n = null;
        } else {
            s2.f2296a.clear();
            s2.f();
        }
        C0118d c0118d = this.f1567f;
        c0118d.f2356b.h();
        ArrayList arrayList = c0118d.f2357c;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = c0118d.f2355a.f2261a;
            if (size < 0) {
                break;
            }
            c0 L2 = L((View) arrayList.get(size));
            if (L2 != null) {
                int i = L2.f2351p;
                if (recyclerView.O()) {
                    L2.f2352q = i;
                    recyclerView.f1592t0.add(L2);
                } else {
                    WeakHashMap weakHashMap = T.f423a;
                    L2.f2339a.setImportantForAccessibility(i);
                }
                L2.f2351p = 0;
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            L(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f1580n = l2;
        if (l2 != null) {
            if (l2.f2276b != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(l2);
                sb.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(Y.V.d(l2.f2276b, sb));
            }
            l2.v0(this);
            if (this.f1589s) {
                L l6 = this.f1580n;
                l6.f2280g = true;
                l6.R(this);
            }
        }
        s2.m();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        C0016n scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.d) {
            WeakHashMap weakHashMap = T.f423a;
            K.H.z(scrollingChildHelper.f483c);
        }
        scrollingChildHelper.d = z2;
    }

    public void setOnFlingListener(N n2) {
        this.f1555U = n2;
    }

    @Deprecated
    public void setOnScrollListener(O o2) {
        this.f1571h0 = o2;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.f1563c0 = z2;
    }

    public void setRecycledViewPool(Q q2) {
        S s2 = this.f1562c;
        RecyclerView recyclerView = s2.h;
        s2.e(recyclerView.f1578m, false);
        if (s2.f2301g != null) {
            r2.f2294b--;
        }
        s2.f2301g = q2;
        if (q2 != null && recyclerView.getAdapter() != null) {
            s2.f2301g.f2294b++;
        }
        s2.d();
    }

    @Deprecated
    public void setRecyclerListener(g0.T t2) {
    }

    public void setScrollState(int i) {
        C0137x c0137x;
        if (i == this.f1547M) {
            return;
        }
        if (f1528A0) {
            Log.d("RecyclerView", "setting scroll state to " + i + " from " + this.f1547M, new Exception());
        }
        this.f1547M = i;
        if (i != 2) {
            b0 b0Var = this.f1564d0;
            b0Var.f2334g.removeCallbacks(b0Var);
            b0Var.f2331c.abortAnimation();
            L l2 = this.f1580n;
            if (l2 != null && (c0137x = l2.f2278e) != null) {
                c0137x.i();
            }
        }
        L l3 = this.f1580n;
        if (l3 != null) {
            l3.h0(i);
        }
        O o2 = this.f1571h0;
        if (o2 != null) {
            o2.a(this, i);
        }
        ArrayList arrayList = this.f1572i0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((O) this.f1572i0.get(size)).a(this, i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.f1554T = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.f1554T = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(a0 a0Var) {
        this.f1562c.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z2) {
        C0137x c0137x;
        if (z2 != this.f1599x) {
            k("Do not suppressLayout in layout or scroll");
            if (!z2) {
                this.f1599x = false;
                if (this.f1597w && this.f1580n != null && this.f1578m != null) {
                    requestLayout();
                }
                this.f1597w = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, f1530C0, f1530C0, 0));
            this.f1599x = true;
            this.f1601y = true;
            setScrollState(0);
            b0 b0Var = this.f1564d0;
            b0Var.f2334g.removeCallbacks(b0Var);
            b0Var.f2331c.abortAnimation();
            L l2 = this.f1580n;
            if (l2 == null || (c0137x = l2.f2278e) == null) {
                return;
            }
            c0137x.i();
        }
    }

    public final void t() {
        i0();
        S();
        Y y2 = this.f1570g0;
        y2.a(6);
        this.f1565e.d();
        y2.f2313e = this.f1578m.a();
        y2.f2312c = 0;
        if (this.d != null) {
            AbstractC0112D abstractC0112D = this.f1578m;
            int a2 = AbstractC0287e.a(abstractC0112D.f2264c);
            if (a2 == 1 ? abstractC0112D.a() > 0 : a2 != 2) {
                Parcelable parcelable = this.d.f2303c;
                if (parcelable != null) {
                    this.f1580n.f0(parcelable);
                }
                this.d = null;
            }
        }
        y2.f2315g = false;
        this.f1580n.d0(this.f1562c, y2);
        y2.f2314f = false;
        y2.f2316j = y2.f2316j && this.f1546L != null;
        y2.d = 4;
        T(true);
        j0(false);
    }

    public final boolean u(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().c(i, i2, iArr, iArr2, i3);
    }

    public final void v(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().d(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public final void w(int i, int i2) {
        this.F++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        O o2 = this.f1571h0;
        if (o2 != null) {
            o2.b(this, i, i2);
        }
        ArrayList arrayList = this.f1572i0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((O) this.f1572i0.get(size)).b(this, i, i2);
            }
        }
        this.F--;
    }

    public final void x() {
        if (this.f1545K != null) {
            return;
        }
        ((Z) this.f1541G).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1545K = edgeEffect;
        if (this.h) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void y() {
        if (this.f1542H != null) {
            return;
        }
        ((Z) this.f1541G).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1542H = edgeEffect;
        if (this.h) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void z() {
        if (this.f1544J != null) {
            return;
        }
        ((Z) this.f1541G).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1544J = edgeEffect;
        if (this.h) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        char c2;
        Object[] objArr;
        Constructor constructor;
        int i3 = 1;
        this.f1560b = new U(this);
        this.f1562c = new S(this);
        this.f1569g = new j(15);
        this.i = new RunnableC0110B(this, 0);
        this.f1573j = new Rect();
        this.f1575k = new Rect();
        this.f1576l = new RectF();
        this.f1582o = new ArrayList();
        this.f1583p = new ArrayList();
        this.f1585q = new ArrayList();
        this.f1595v = 0;
        this.f1538C = false;
        this.f1539D = false;
        this.f1540E = 0;
        this.F = 0;
        this.f1541G = f1535I0;
        C0125k c0125k = new C0125k();
        c0125k.f2265a = null;
        c0125k.f2266b = new ArrayList();
        c0125k.f2267c = 120L;
        c0125k.d = 120L;
        c0125k.f2268e = 250L;
        c0125k.f2269f = 250L;
        c0125k.f2406g = true;
        c0125k.h = new ArrayList();
        c0125k.i = new ArrayList();
        c0125k.f2407j = new ArrayList();
        c0125k.f2408k = new ArrayList();
        c0125k.f2409l = new ArrayList();
        c0125k.f2410m = new ArrayList();
        c0125k.f2411n = new ArrayList();
        c0125k.f2412o = new ArrayList();
        c0125k.f2413p = new ArrayList();
        c0125k.f2414q = new ArrayList();
        c0125k.f2415r = new ArrayList();
        this.f1546L = c0125k;
        this.f1547M = 0;
        this.f1548N = -1;
        this.f1559a0 = Float.MIN_VALUE;
        this.f1561b0 = Float.MIN_VALUE;
        this.f1563c0 = true;
        this.f1564d0 = new b0(this);
        this.f1568f0 = f1532F0 ? new C0129o() : null;
        Y y2 = new Y();
        y2.f2310a = -1;
        y2.f2311b = 0;
        y2.f2312c = 0;
        y2.d = 1;
        y2.f2313e = 0;
        y2.f2314f = false;
        y2.f2315g = false;
        y2.h = false;
        y2.i = false;
        y2.f2316j = false;
        y2.f2317k = false;
        this.f1570g0 = y2;
        this.f1574j0 = false;
        this.k0 = false;
        C0111C c0111c = new C0111C(this);
        this.f1577l0 = c0111c;
        this.f1579m0 = false;
        this.o0 = new int[2];
        this.f1586q0 = new int[2];
        this.f1588r0 = new int[2];
        this.f1590s0 = new int[2];
        this.f1592t0 = new ArrayList();
        this.f1594u0 = new RunnableC0110B(this, i3);
        this.f1598w0 = 0;
        this.f1600x0 = 0;
        this.f1602y0 = new C0111C(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1554T = viewConfiguration.getScaledTouchSlop();
        this.f1559a0 = K.U.a(viewConfiguration);
        this.f1561b0 = K.U.b(viewConfiguration);
        this.f1556V = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1557W = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f1558a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.f1546L.f2265a = c0111c;
        this.f1565e = new C0116b(new C0111C(this));
        this.f1567f = new C0118d(new C0111C(this));
        WeakHashMap weakHashMap = T.f423a;
        if (J.c(this) == 0) {
            J.m(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f1537B = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new e0(this));
        int[] iArr = AbstractC0089a.f2078a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        T.k(this, context, iArr, attributeSet, obtainStyledAttributes, i);
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.h = obtainStyledAttributes.getBoolean(1, true);
        if (obtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException(Y.V.d(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
            }
            Resources resources = getContext().getResources();
            i2 = 4;
            c2 = 2;
            new C0128n(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.playbag.tripgear.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.playbag.tripgear.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.playbag.tripgear.R.dimen.fastscroll_margin));
        } else {
            i2 = 4;
            c2 = 2;
        }
        obtainStyledAttributes.recycle();
        if (string != null) {
            String trim = string.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    trim = context.getPackageName() + trim;
                } else if (!trim.contains(".")) {
                    trim = RecyclerView.class.getPackage().getName() + '.' + trim;
                }
                try {
                    Class<? extends U> asSubclass = Class.forName(trim, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(L.class);
                    try {
                        constructor = asSubclass.getConstructor(f1533G0);
                        objArr = new Object[i2];
                        objArr[0] = context;
                        objArr[1] = attributeSet;
                        objArr[c2] = Integer.valueOf(i);
                        objArr[3] = 0;
                    } catch (NoSuchMethodException e2) {
                        try {
                            objArr = null;
                            constructor = asSubclass.getConstructor(null);
                        } catch (NoSuchMethodException e3) {
                            e3.initCause(e2);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + trim, e3);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((L) constructor.newInstance(objArr));
                } catch (ClassCastException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + trim, e4);
                } catch (ClassNotFoundException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + trim, e5);
                } catch (IllegalAccessException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + trim, e6);
                } catch (InstantiationException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e7);
                } catch (InvocationTargetException e8) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e8);
                }
            }
        }
        int[] iArr2 = f1529B0;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        T.k(this, context, iArr2, attributeSet, obtainStyledAttributes2, i);
        boolean z2 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
        setTag(com.playbag.tripgear.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        L l2 = this.f1580n;
        if (l2 != null) {
            return l2.t(layoutParams);
        }
        throw new IllegalStateException(Y.V.d(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }
}
