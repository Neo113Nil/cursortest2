package androidx.recyclerview.widget;

import C.j;
import H.h;
import K.b;
import L.C0016n;
import L.C0019q;
import L.H;
import L.U;
import N0.B;
import S.a;
import U.d;
import V.g;
import Z.V;
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
import g0.AbstractC0109a;
import h0.AbstractC0114B;
import h0.AbstractC0117E;
import h0.AbstractC0118F;
import h0.C0113A;
import h0.C0119a;
import h0.C0121c;
import h0.C0128j;
import h0.C0131m;
import h0.C0132n;
import h0.C0140w;
import h0.C0142y;
import h0.C0143z;
import h0.G;
import h0.InterfaceC0116D;
import h0.J;
import h0.K;
import h0.L;
import h0.M;
import h0.N;
import h0.O;
import h0.P;
import h0.Q;
import h0.RunnableC0134p;
import h0.S;
import h0.T;
import h0.W;
import h0.X;
import h0.Y;
import h0.Z;
import h0.a0;
import h0.c0;
import h0.l0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p.e;
import p.k;
import r.AbstractC0290e;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* renamed from: D0, reason: collision with root package name */
    public static final Class[] f1624D0;

    /* renamed from: E0, reason: collision with root package name */
    public static final d f1625E0;
    public static final X F0;

    /* renamed from: x0, reason: collision with root package name */
    public static boolean f1626x0 = false;

    /* renamed from: y0, reason: collision with root package name */
    public static boolean f1627y0 = false;

    /* renamed from: A, reason: collision with root package name */
    public boolean f1629A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f1630B;

    /* renamed from: C, reason: collision with root package name */
    public int f1631C;

    /* renamed from: D, reason: collision with root package name */
    public int f1632D;

    /* renamed from: E, reason: collision with root package name */
    public AbstractC0117E f1633E;

    /* renamed from: F, reason: collision with root package name */
    public EdgeEffect f1634F;
    public EdgeEffect G;

    /* renamed from: H, reason: collision with root package name */
    public EdgeEffect f1635H;

    /* renamed from: I, reason: collision with root package name */
    public EdgeEffect f1636I;

    /* renamed from: J, reason: collision with root package name */
    public AbstractC0118F f1637J;

    /* renamed from: K, reason: collision with root package name */
    public int f1638K;

    /* renamed from: L, reason: collision with root package name */
    public int f1639L;

    /* renamed from: M, reason: collision with root package name */
    public VelocityTracker f1640M;

    /* renamed from: N, reason: collision with root package name */
    public int f1641N;

    /* renamed from: O, reason: collision with root package name */
    public int f1642O;

    /* renamed from: P, reason: collision with root package name */
    public int f1643P;

    /* renamed from: Q, reason: collision with root package name */
    public int f1644Q;

    /* renamed from: R, reason: collision with root package name */
    public int f1645R;

    /* renamed from: S, reason: collision with root package name */
    public L f1646S;

    /* renamed from: T, reason: collision with root package name */
    public final int f1647T;

    /* renamed from: U, reason: collision with root package name */
    public final int f1648U;

    /* renamed from: V, reason: collision with root package name */
    public final float f1649V;

    /* renamed from: W, reason: collision with root package name */
    public final float f1650W;

    /* renamed from: a, reason: collision with root package name */
    public final float f1651a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f1652a0;

    /* renamed from: b, reason: collision with root package name */
    public final S f1653b;

    /* renamed from: b0, reason: collision with root package name */
    public final Z f1654b0;

    /* renamed from: c, reason: collision with root package name */
    public final P f1655c;

    /* renamed from: c0, reason: collision with root package name */
    public RunnableC0134p f1656c0;
    public T d;

    /* renamed from: d0, reason: collision with root package name */
    public final C0132n f1657d0;

    /* renamed from: e, reason: collision with root package name */
    public final I.d f1658e;

    /* renamed from: e0, reason: collision with root package name */
    public final W f1659e0;

    /* renamed from: f, reason: collision with root package name */
    public final C0121c f1660f;

    /* renamed from: f0, reason: collision with root package name */
    public M f1661f0;

    /* renamed from: g, reason: collision with root package name */
    public final j f1662g;

    /* renamed from: g0, reason: collision with root package name */
    public ArrayList f1663g0;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1664h;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f1665h0;
    public final Rect i;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f1666i0;

    /* renamed from: j, reason: collision with root package name */
    public final Rect f1667j;

    /* renamed from: j0, reason: collision with root package name */
    public final C0113A f1668j0;

    /* renamed from: k, reason: collision with root package name */
    public final RectF f1669k;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f1670k0;

    /* renamed from: l, reason: collision with root package name */
    public AbstractC0114B f1671l;
    public c0 l0;

    /* renamed from: m, reason: collision with root package name */
    public J f1672m;

    /* renamed from: m0, reason: collision with root package name */
    public final int[] f1673m0;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f1674n;

    /* renamed from: n0, reason: collision with root package name */
    public C0016n f1675n0;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f1676o;

    /* renamed from: o0, reason: collision with root package name */
    public final int[] f1677o0;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f1678p;
    public final int[] p0;

    /* renamed from: q, reason: collision with root package name */
    public C0131m f1679q;

    /* renamed from: q0, reason: collision with root package name */
    public final int[] f1680q0;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1681r;

    /* renamed from: r0, reason: collision with root package name */
    public final ArrayList f1682r0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1683s;

    /* renamed from: s0, reason: collision with root package name */
    public final B f1684s0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1685t;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f1686t0;

    /* renamed from: u, reason: collision with root package name */
    public int f1687u;

    /* renamed from: u0, reason: collision with root package name */
    public int f1688u0;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1689v;

    /* renamed from: v0, reason: collision with root package name */
    public int f1690v0;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1691w;

    /* renamed from: w0, reason: collision with root package name */
    public final C0113A f1692w0;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1693x;

    /* renamed from: y, reason: collision with root package name */
    public int f1694y;

    /* renamed from: z, reason: collision with root package name */
    public final AccessibilityManager f1695z;

    /* renamed from: z0, reason: collision with root package name */
    public static final int[] f1628z0 = {R.attr.nestedScrollingEnabled};
    public static final float A0 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: B0, reason: collision with root package name */
    public static final boolean f1622B0 = true;

    /* renamed from: C0, reason: collision with root package name */
    public static final boolean f1623C0 = true;

    static {
        Class cls = Integer.TYPE;
        f1624D0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f1625E0 = new d(1);
        F0 = new X();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.winfour.winrandom.R.attr.recyclerViewStyle);
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
            RecyclerView G = G(viewGroup.getChildAt(i));
            if (G != null) {
                return G;
            }
        }
        return null;
    }

    public static a0 L(View view) {
        if (view == null) {
            return null;
        }
        return ((K) view.getLayoutParams()).f2409a;
    }

    private C0016n getScrollingChildHelper() {
        if (this.f1675n0 == null) {
            this.f1675n0 = new C0016n(this);
        }
        return this.f1675n0;
    }

    public static void l(a0 a0Var) {
        WeakReference weakReference = a0Var.f2456b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == a0Var.f2455a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            a0Var.f2456b = null;
        }
    }

    public static int o(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && A1.d.F(edgeEffect) != A0) {
            int round = Math.round(A1.d.a0(edgeEffect, ((-i) * 4.0f) / i2, 0.5f) * ((-i2) / 4.0f));
            if (round != i) {
                edgeEffect.finish();
            }
            return i - round;
        }
        if (i >= 0 || edgeEffect2 == null || A1.d.F(edgeEffect2) == A0) {
            return i;
        }
        float f2 = i2;
        int round2 = Math.round(A1.d.a0(edgeEffect2, (i * 4.0f) / f2, 0.5f) * (f2 / 4.0f));
        if (round2 != i) {
            edgeEffect2.finish();
        }
        return i - round2;
    }

    public static void setDebugAssertionsEnabled(boolean z2) {
        f1626x0 = z2;
    }

    public static void setVerboseLoggingEnabled(boolean z2) {
        f1627y0 = z2;
    }

    public final void A() {
        if (this.G != null) {
            return;
        }
        ((X) this.f1633E).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.G = edgeEffect;
        if (this.f1664h) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String B() {
        return " " + super.toString() + ", adapter:" + this.f1671l + ", layout:" + this.f1672m + ", context:" + getContext();
    }

    public final void C(W w2) {
        if (getScrollState() != 2) {
            w2.getClass();
            return;
        }
        OverScroller overScroller = this.f1654b0.f2447c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        w2.getClass();
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
        ArrayList arrayList = this.f1678p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0131m c0131m = (C0131m) arrayList.get(i);
            int i2 = c0131m.f2579v;
            if (i2 == 1) {
                boolean d = c0131m.d(motionEvent.getX(), motionEvent.getY());
                boolean c2 = c0131m.c(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0 && (d || c2)) {
                    if (c2) {
                        c0131m.f2580w = 1;
                        c0131m.f2573p = (int) motionEvent.getX();
                    } else if (d) {
                        c0131m.f2580w = 2;
                        c0131m.f2570m = (int) motionEvent.getY();
                    }
                    c0131m.f(2);
                    if (action == 3) {
                        this.f1679q = c0131m;
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
        int e2 = this.f1660f.e();
        if (e2 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < e2; i3++) {
            a0 L2 = L(this.f1660f.d(i3));
            if (!L2.p()) {
                int b2 = L2.b();
                if (b2 < i) {
                    i = b2;
                }
                if (b2 > i2) {
                    i2 = b2;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public final a0 H(int i) {
        a0 a0Var = null;
        if (this.f1629A) {
            return null;
        }
        int h2 = this.f1660f.h();
        for (int i2 = 0; i2 < h2; i2++) {
            a0 L2 = L(this.f1660f.g(i2));
            if (L2 != null && !L2.i() && I(L2) == i) {
                if (!this.f1660f.f2478c.contains(L2.f2455a)) {
                    return L2;
                }
                a0Var = L2;
            }
        }
        return a0Var;
    }

    public final int I(a0 a0Var) {
        if (a0Var.d(524) || !a0Var.f()) {
            return -1;
        }
        I.d dVar = this.f1658e;
        int i = a0Var.f2457c;
        ArrayList arrayList = (ArrayList) dVar.f321c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0119a c0119a = (C0119a) arrayList.get(i2);
            int i3 = c0119a.f2451a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = c0119a.f2452b;
                    if (i4 <= i) {
                        int i5 = c0119a.f2453c;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = c0119a.f2452b;
                    if (i6 == i) {
                        i = c0119a.f2453c;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (c0119a.f2453c <= i) {
                            i++;
                        }
                    }
                }
            } else if (c0119a.f2452b <= i) {
                i += c0119a.f2453c;
            }
        }
        return i;
    }

    public final long J(a0 a0Var) {
        return this.f1671l.f2384b ? a0Var.f2458e : a0Var.f2457c;
    }

    public final a0 K(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return L(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect M(View view) {
        K k2 = (K) view.getLayoutParams();
        boolean z2 = k2.f2411c;
        Rect rect = k2.f2410b;
        if (!z2) {
            return rect;
        }
        if (this.f1659e0.f2438g && (k2.f2409a.l() || k2.f2409a.g())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.f1676o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.i;
            rect2.set(0, 0, 0, 0);
            ((G) arrayList.get(i)).getClass();
            ((K) view.getLayoutParams()).f2409a.getClass();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        k2.f2411c = false;
        return rect;
    }

    public final boolean N() {
        return !this.f1685t || this.f1629A || this.f1658e.f();
    }

    public final boolean O() {
        return this.f1631C > 0;
    }

    public final void P(int i) {
        if (this.f1672m == null) {
            return;
        }
        setScrollState(2);
        this.f1672m.p0(i);
        awakenScrollBars();
    }

    public final void Q() {
        int h2 = this.f1660f.h();
        for (int i = 0; i < h2; i++) {
            ((K) this.f1660f.g(i).getLayoutParams()).f2411c = true;
        }
        ArrayList arrayList = this.f1655c.f2420c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            K k2 = (K) ((a0) arrayList.get(i2)).f2455a.getLayoutParams();
            if (k2 != null) {
                k2.f2411c = true;
            }
        }
    }

    public final void R(int i, int i2, boolean z2) {
        int i3 = i + i2;
        int h2 = this.f1660f.h();
        for (int i4 = 0; i4 < h2; i4++) {
            a0 L2 = L(this.f1660f.g(i4));
            if (L2 != null && !L2.p()) {
                int i5 = L2.f2457c;
                W w2 = this.f1659e0;
                if (i5 >= i3) {
                    if (f1627y0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i4 + " holder " + L2 + " now at position " + (L2.f2457c - i2));
                    }
                    L2.m(-i2, z2);
                    w2.f2437f = true;
                } else if (i5 >= i) {
                    if (f1627y0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i4 + " holder " + L2 + " now REMOVED");
                    }
                    L2.a(8);
                    L2.m(-i2, z2);
                    L2.f2457c = i - 1;
                    w2.f2437f = true;
                }
            }
        }
        P p2 = this.f1655c;
        ArrayList arrayList = p2.f2420c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a0 a0Var = (a0) arrayList.get(size);
            if (a0Var != null) {
                int i6 = a0Var.f2457c;
                if (i6 >= i3) {
                    if (f1627y0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + a0Var + " now at position " + (a0Var.f2457c - i2));
                    }
                    a0Var.m(-i2, z2);
                } else if (i6 >= i) {
                    a0Var.a(8);
                    p2.g(size);
                }
            }
        }
        requestLayout();
    }

    public final void S() {
        this.f1631C++;
    }

    public final void T(boolean z2) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.f1631C - 1;
        this.f1631C = i2;
        if (i2 < 1) {
            if (f1626x0 && i2 < 0) {
                throw new IllegalStateException(V.d(this, new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching")));
            }
            this.f1631C = 0;
            if (z2) {
                int i3 = this.f1694y;
                this.f1694y = 0;
                if (i3 != 0 && (accessibilityManager = this.f1695z) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(obtain);
                }
                ArrayList arrayList = this.f1682r0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    a0 a0Var = (a0) arrayList.get(size);
                    if (a0Var.f2455a.getParent() == this && !a0Var.p() && (i = a0Var.f2469q) != -1) {
                        WeakHashMap weakHashMap = L.T.f490a;
                        a0Var.f2455a.setImportantForAccessibility(i);
                        a0Var.f2469q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void U(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1639L) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f1639L = motionEvent.getPointerId(i);
            int x2 = (int) (motionEvent.getX(i) + 0.5f);
            this.f1643P = x2;
            this.f1641N = x2;
            int y2 = (int) (motionEvent.getY(i) + 0.5f);
            this.f1644Q = y2;
            this.f1642O = y2;
        }
    }

    public final void V() {
        if (this.f1670k0 || !this.f1681r) {
            return;
        }
        WeakHashMap weakHashMap = L.T.f490a;
        postOnAnimation(this.f1684s0);
        this.f1670k0 = true;
    }

    public final void W(boolean z2) {
        this.f1630B = z2 | this.f1630B;
        this.f1629A = true;
        int h2 = this.f1660f.h();
        for (int i = 0; i < h2; i++) {
            a0 L2 = L(this.f1660f.g(i));
            if (L2 != null && !L2.p()) {
                L2.a(6);
            }
        }
        Q();
        P p2 = this.f1655c;
        ArrayList arrayList = p2.f2420c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            a0 a0Var = (a0) arrayList.get(i2);
            if (a0Var != null) {
                a0Var.a(6);
                a0Var.a(1024);
            }
        }
        AbstractC0114B abstractC0114B = p2.f2424h.f1671l;
        if (abstractC0114B == null || !abstractC0114B.f2384b) {
            p2.f();
        }
    }

    public final void X(a0 a0Var, C0019q c0019q) {
        a0Var.f2462j &= -8193;
        boolean z2 = this.f1659e0.f2439h;
        j jVar = this.f1662g;
        if (z2 && a0Var.l() && !a0Var.i() && !a0Var.p()) {
            ((e) jVar.f87c).d(J(a0Var), a0Var);
        }
        k kVar = (k) jVar.f86b;
        l0 l0Var = (l0) kVar.getOrDefault(a0Var, null);
        if (l0Var == null) {
            l0Var = l0.a();
            kVar.put(a0Var, l0Var);
        }
        l0Var.f2554b = c0019q;
        l0Var.f2553a |= 4;
    }

    public final int Y(int i, float f2) {
        float height = f2 / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.f1634F;
        float f3 = A0;
        if (edgeEffect == null || A1.d.F(edgeEffect) == A0) {
            EdgeEffect edgeEffect2 = this.f1635H;
            if (edgeEffect2 != null && A1.d.F(edgeEffect2) != A0) {
                if (canScrollHorizontally(1)) {
                    this.f1635H.onRelease();
                } else {
                    float a02 = A1.d.a0(this.f1635H, width, height);
                    if (A1.d.F(this.f1635H) == A0) {
                        this.f1635H.onRelease();
                    }
                    f3 = a02;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.f1634F.onRelease();
            } else {
                float f4 = -A1.d.a0(this.f1634F, -width, 1.0f - height);
                if (A1.d.F(this.f1634F) == A0) {
                    this.f1634F.onRelease();
                }
                f3 = f4;
            }
            invalidate();
        }
        return Math.round(f3 * getWidth());
    }

    public final int Z(int i, float f2) {
        float width = f2 / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect = this.G;
        float f3 = A0;
        if (edgeEffect == null || A1.d.F(edgeEffect) == A0) {
            EdgeEffect edgeEffect2 = this.f1636I;
            if (edgeEffect2 != null && A1.d.F(edgeEffect2) != A0) {
                if (canScrollVertically(1)) {
                    this.f1636I.onRelease();
                } else {
                    float a02 = A1.d.a0(this.f1636I, height, 1.0f - width);
                    if (A1.d.F(this.f1636I) == A0) {
                        this.f1636I.onRelease();
                    }
                    f3 = a02;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.G.onRelease();
            } else {
                float f4 = -A1.d.a0(this.G, -height, width);
                if (A1.d.F(this.G) == A0) {
                    this.G.onRelease();
                }
                f3 = f4;
            }
            invalidate();
        }
        return Math.round(f3 * getHeight());
    }

    public final void a0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.i;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof K) {
            K k2 = (K) layoutParams;
            if (!k2.f2411c) {
                int i = rect.left;
                Rect rect2 = k2.f2410b;
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
        this.f1672m.m0(this, view, this.i, !this.f1685t, view2 == null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        J j2 = this.f1672m;
        if (j2 != null) {
            j2.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    public final void b0() {
        VelocityTracker velocityTracker = this.f1640M;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z2 = false;
        j0(0);
        EdgeEffect edgeEffect = this.f1634F;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = this.f1634F.isFinished();
        }
        EdgeEffect edgeEffect2 = this.G;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 |= this.G.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1635H;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 |= this.f1635H.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1636I;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z2 |= this.f1636I.isFinished();
        }
        if (z2) {
            WeakHashMap weakHashMap = L.T.f490a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c0(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2;
        p();
        AbstractC0114B abstractC0114B = this.f1671l;
        int[] iArr = this.f1680q0;
        if (abstractC0114B != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            d0(i, i2, iArr);
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
        if (!this.f1676o.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        v(i4, i5, i6, i7, this.f1677o0, i3, iArr);
        int i10 = iArr[0];
        int i11 = i6 - i10;
        int i12 = iArr[1];
        int i13 = i7 - i12;
        boolean z3 = (i10 == 0 && i12 == 0) ? false : true;
        int i14 = this.f1643P;
        int[] iArr2 = this.f1677o0;
        int i15 = iArr2[0];
        this.f1643P = i14 - i15;
        int i16 = this.f1644Q;
        int i17 = iArr2[1];
        this.f1644Q = i16 - i17;
        int[] iArr3 = this.p0;
        iArr3[0] = iArr3[0] + i15;
        iArr3[1] = iArr3[1] + i17;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && (motionEvent.getSource() & 8194) != 8194) {
                float x2 = motionEvent.getX();
                float f2 = i11;
                float y2 = motionEvent.getY();
                float f3 = i13;
                if (f2 < A0) {
                    y();
                    A1.d.a0(this.f1634F, (-f2) / getWidth(), 1.0f - (y2 / getHeight()));
                } else if (f2 > A0) {
                    z();
                    A1.d.a0(this.f1635H, f2 / getWidth(), y2 / getHeight());
                } else {
                    z2 = false;
                    if (f3 >= A0) {
                        A();
                        A1.d.a0(this.G, (-f3) / getHeight(), x2 / getWidth());
                    } else {
                        if (f3 > A0) {
                            x();
                            A1.d.a0(this.f1636I, f3 / getHeight(), 1.0f - (x2 / getWidth()));
                        }
                        if (!z2 || f2 != A0 || f3 != A0) {
                            WeakHashMap weakHashMap = L.T.f490a;
                            postInvalidateOnAnimation();
                        }
                    }
                    z2 = true;
                    if (!z2) {
                    }
                    WeakHashMap weakHashMap2 = L.T.f490a;
                    postInvalidateOnAnimation();
                }
                z2 = true;
                if (f3 >= A0) {
                }
                z2 = true;
                if (!z2) {
                }
                WeakHashMap weakHashMap22 = L.T.f490a;
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

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof K) && this.f1672m.f((K) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        J j2 = this.f1672m;
        if (j2 != null && j2.d()) {
            return this.f1672m.j(this.f1659e0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        J j2 = this.f1672m;
        if (j2 != null && j2.d()) {
            return this.f1672m.k(this.f1659e0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        J j2 = this.f1672m;
        if (j2 != null && j2.d()) {
            return this.f1672m.l(this.f1659e0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        J j2 = this.f1672m;
        if (j2 != null && j2.e()) {
            return this.f1672m.m(this.f1659e0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        J j2 = this.f1672m;
        if (j2 != null && j2.e()) {
            return this.f1672m.n(this.f1659e0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        J j2 = this.f1672m;
        if (j2 != null && j2.e()) {
            return this.f1672m.o(this.f1659e0);
        }
        return 0;
    }

    public final void d0(int i, int i2, int[] iArr) {
        a0 a0Var;
        C0121c c0121c = this.f1660f;
        h0();
        S();
        int i3 = h.f295a;
        Trace.beginSection("RV Scroll");
        W w2 = this.f1659e0;
        C(w2);
        P p2 = this.f1655c;
        int o02 = i != 0 ? this.f1672m.o0(i, p2, w2) : 0;
        int q02 = i2 != 0 ? this.f1672m.q0(i2, p2, w2) : 0;
        Trace.endSection();
        int e2 = c0121c.e();
        for (int i4 = 0; i4 < e2; i4++) {
            View d = c0121c.d(i4);
            a0 K2 = K(d);
            if (K2 != null && (a0Var = K2.i) != null) {
                int left = d.getLeft();
                int top = d.getTop();
                View view = a0Var.f2455a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        T(true);
        i0(false);
        if (iArr != null) {
            iArr[0] = o02;
            iArr[1] = q02;
        }
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
        ArrayList arrayList = this.f1676o;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i = 0; i < size; i++) {
            ((G) arrayList.get(i)).b(canvas, this);
        }
        EdgeEffect edgeEffect = this.f1634F;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f1664h ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, A0);
            EdgeEffect edgeEffect2 = this.f1634F;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.G;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f1664h) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.G;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f1635H;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f1664h ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f1635H;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f1636I;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f1664h) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f1636I;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(save4);
        }
        if ((z2 || this.f1637J == null || arrayList.size() <= 0 || !this.f1637J.f()) ? z2 : true) {
            WeakHashMap weakHashMap = L.T.f490a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    public final void e0(int i) {
        C0140w c0140w;
        if (this.f1691w) {
            return;
        }
        setScrollState(0);
        Z z2 = this.f1654b0;
        z2.f2450g.removeCallbacks(z2);
        z2.f2447c.abortAnimation();
        J j2 = this.f1672m;
        if (j2 != null && (c0140w = j2.f2399e) != null) {
            c0140w.i();
        }
        J j3 = this.f1672m;
        if (j3 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            j3.p0(i);
            awakenScrollBars();
        }
    }

    public final boolean f0(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        float F2 = A1.d.F(edgeEffect) * i2;
        float abs = Math.abs(-i) * 0.35f;
        float f2 = this.f1651a * 0.015f;
        double log = Math.log(abs / f2);
        double d = A0;
        return ((float) (Math.exp((d / (d - 1.0d)) * log) * ((double) f2))) < F2;
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
        this.f1672m.getClass();
        boolean z3 = true;
        boolean z4 = (this.f1671l == null || this.f1672m == null || O() || this.f1691w) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        W w2 = this.f1659e0;
        P p2 = this.f1655c;
        if (z4 && (i == 2 || i == 1)) {
            if (this.f1672m.e()) {
                if (focusFinder.findNextFocus(this, view, i == 2 ? 130 : 33) == null) {
                    z2 = true;
                    if (!z2 && this.f1672m.d()) {
                        z2 = focusFinder.findNextFocus(this, view, !((this.f1672m.C() != 1) ^ (i != 2)) ? 66 : 17) != null;
                    }
                    if (z2) {
                        p();
                        if (D(view) == null) {
                            return null;
                        }
                        h0();
                        this.f1672m.T(view, i, p2, w2);
                        i0(false);
                    }
                    view2 = focusFinder.findNextFocus(this, view, i);
                }
            }
            z2 = false;
            if (!z2) {
                if (focusFinder.findNextFocus(this, view, !((this.f1672m.C() != 1) ^ (i != 2)) ? 66 : 17) != null) {
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
                h0();
                view2 = this.f1672m.T(view, i, p2, w2);
                i0(false);
            } else {
                view2 = findNextFocus;
            }
        }
        if (view2 != null && !view2.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i);
            }
            a0(view2, null);
            return view;
        }
        if (view2 != null && view2 != this && view2 != view) {
            if (D(view2) == null) {
                z3 = false;
            } else if (view != null && D(view) != null) {
                int width = view.getWidth();
                int height = view.getHeight();
                Rect rect = this.i;
                rect.set(0, 0, width, height);
                int width2 = view2.getWidth();
                int height2 = view2.getHeight();
                Rect rect2 = this.f1667j;
                rect2.set(0, 0, width2, height2);
                offsetDescendantRectToMyCoords(view, rect);
                offsetDescendantRectToMyCoords(view2, rect2);
                int i3 = this.f1672m.C() == 1 ? -1 : 1;
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
                                        throw new IllegalArgumentException(V.d(this, sb));
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

    public final void g0(int i, int i2, boolean z2) {
        J j2 = this.f1672m;
        if (j2 == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f1691w) {
            return;
        }
        if (!j2.d()) {
            i = 0;
        }
        if (!this.f1672m.e()) {
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
        this.f1654b0.c(i, i2, Integer.MIN_VALUE, null);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        J j2 = this.f1672m;
        if (j2 != null) {
            return j2.r();
        }
        throw new IllegalStateException(V.d(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        J j2 = this.f1672m;
        if (j2 != null) {
            return j2.s(getContext(), attributeSet);
        }
        throw new IllegalStateException(V.d(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC0114B getAdapter() {
        return this.f1671l;
    }

    @Override // android.view.View
    public int getBaseline() {
        J j2 = this.f1672m;
        if (j2 == null) {
            return super.getBaseline();
        }
        j2.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f1664h;
    }

    public c0 getCompatAccessibilityDelegate() {
        return this.l0;
    }

    public AbstractC0117E getEdgeEffectFactory() {
        return this.f1633E;
    }

    public AbstractC0118F getItemAnimator() {
        return this.f1637J;
    }

    public int getItemDecorationCount() {
        return this.f1676o.size();
    }

    public J getLayoutManager() {
        return this.f1672m;
    }

    public int getMaxFlingVelocity() {
        return this.f1648U;
    }

    public int getMinFlingVelocity() {
        return this.f1647T;
    }

    public long getNanoTime() {
        if (f1623C0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public L getOnFlingListener() {
        return this.f1646S;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f1652a0;
    }

    public O getRecycledViewPool() {
        return this.f1655c.c();
    }

    public int getScrollState() {
        return this.f1638K;
    }

    public final void h(a0 a0Var) {
        View view = a0Var.f2455a;
        boolean z2 = view.getParent() == this;
        this.f1655c.l(K(view));
        if (a0Var.k()) {
            this.f1660f.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z2) {
            this.f1660f.a(view, -1, true);
            return;
        }
        C0121c c0121c = this.f1660f;
        int indexOfChild = c0121c.f2476a.f2382a.indexOfChild(view);
        if (indexOfChild >= 0) {
            c0121c.f2477b.i(indexOfChild);
            c0121c.i(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final void h0() {
        int i = this.f1687u + 1;
        this.f1687u = i;
        if (i != 1 || this.f1691w) {
            return;
        }
        this.f1689v = false;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(G g2) {
        J j2 = this.f1672m;
        if (j2 != null) {
            j2.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f1676o;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(g2);
        Q();
        requestLayout();
    }

    public final void i0(boolean z2) {
        if (this.f1687u < 1) {
            if (f1626x0) {
                throw new IllegalStateException(V.d(this, new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.")));
            }
            this.f1687u = 1;
        }
        if (!z2 && !this.f1691w) {
            this.f1689v = false;
        }
        if (this.f1687u == 1) {
            if (z2 && this.f1689v && !this.f1691w && this.f1672m != null && this.f1671l != null) {
                r();
            }
            if (!this.f1691w) {
                this.f1689v = false;
            }
        }
        this.f1687u--;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f1681r;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f1691w;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    public final void j(M m2) {
        if (this.f1663g0 == null) {
            this.f1663g0 = new ArrayList();
        }
        this.f1663g0.add(m2);
    }

    public final void j0(int i) {
        getScrollingChildHelper().h(i);
    }

    public final void k(String str) {
        if (O()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(V.d(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        }
        if (this.f1632D > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(V.d(this, new StringBuilder(""))));
        }
    }

    public final void m() {
        int h2 = this.f1660f.h();
        for (int i = 0; i < h2; i++) {
            a0 L2 = L(this.f1660f.g(i));
            if (!L2.p()) {
                L2.d = -1;
                L2.f2460g = -1;
            }
        }
        P p2 = this.f1655c;
        ArrayList arrayList = p2.f2420c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            a0 a0Var = (a0) arrayList.get(i2);
            a0Var.d = -1;
            a0Var.f2460g = -1;
        }
        ArrayList arrayList2 = p2.f2418a;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            a0 a0Var2 = (a0) arrayList2.get(i3);
            a0Var2.d = -1;
            a0Var2.f2460g = -1;
        }
        ArrayList arrayList3 = p2.f2419b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                a0 a0Var3 = (a0) p2.f2419b.get(i4);
                a0Var3.d = -1;
                a0Var3.f2460g = -1;
            }
        }
    }

    public final void n(int i, int i2) {
        boolean z2;
        EdgeEffect edgeEffect = this.f1634F;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z2 = false;
        } else {
            this.f1634F.onRelease();
            z2 = this.f1634F.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f1635H;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f1635H.onRelease();
            z2 |= this.f1635H.isFinished();
        }
        EdgeEffect edgeEffect3 = this.G;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.G.onRelease();
            z2 |= this.G.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1636I;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f1636I.onRelease();
            z2 |= this.f1636I.isFinished();
        }
        if (z2) {
            WeakHashMap weakHashMap = L.T.f490a;
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
        this.f1631C = 0;
        this.f1681r = true;
        this.f1685t = this.f1685t && !isLayoutRequested();
        this.f1655c.d();
        J j2 = this.f1672m;
        if (j2 != null) {
            j2.f2401g = true;
            j2.R(this);
        }
        this.f1670k0 = false;
        if (f1623C0) {
            ThreadLocal threadLocal = RunnableC0134p.f2591e;
            RunnableC0134p runnableC0134p = (RunnableC0134p) threadLocal.get();
            this.f1656c0 = runnableC0134p;
            if (runnableC0134p == null) {
                RunnableC0134p runnableC0134p2 = new RunnableC0134p();
                runnableC0134p2.f2593a = new ArrayList();
                runnableC0134p2.d = new ArrayList();
                this.f1656c0 = runnableC0134p2;
                WeakHashMap weakHashMap = L.T.f490a;
                Display display = getDisplay();
                if (!isInEditMode() && display != null) {
                    f2 = display.getRefreshRate();
                }
                f2 = 60.0f;
                RunnableC0134p runnableC0134p3 = this.f1656c0;
                runnableC0134p3.f2595c = (long) (1.0E9f / f2);
                threadLocal.set(runnableC0134p3);
            }
            RunnableC0134p runnableC0134p4 = this.f1656c0;
            runnableC0134p4.getClass();
            boolean z2 = f1626x0;
            ArrayList arrayList = runnableC0134p4.f2593a;
            if (z2 && arrayList.contains(this)) {
                throw new IllegalStateException("RecyclerView already present in worker list!");
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        P p2;
        RunnableC0134p runnableC0134p;
        C0140w c0140w;
        super.onDetachedFromWindow();
        AbstractC0118F abstractC0118F = this.f1637J;
        if (abstractC0118F != null) {
            abstractC0118F.e();
        }
        int i = 0;
        setScrollState(0);
        Z z2 = this.f1654b0;
        z2.f2450g.removeCallbacks(z2);
        z2.f2447c.abortAnimation();
        J j2 = this.f1672m;
        if (j2 != null && (c0140w = j2.f2399e) != null) {
            c0140w.i();
        }
        this.f1681r = false;
        J j3 = this.f1672m;
        if (j3 != null) {
            j3.f2401g = false;
            j3.S(this);
        }
        this.f1682r0.clear();
        removeCallbacks(this.f1684s0);
        this.f1662g.getClass();
        while (l0.d.a() != null) {
        }
        int i2 = 0;
        while (true) {
            p2 = this.f1655c;
            ArrayList arrayList = p2.f2420c;
            if (i2 >= arrayList.size()) {
                break;
            }
            A1.d.j(((a0) arrayList.get(i2)).f2455a);
            i2++;
        }
        p2.e(p2.f2424h.f1671l, false);
        while (i < getChildCount()) {
            int i3 = i + 1;
            View childAt = getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            a aVar = (a) childAt.getTag(com.winfour.winrandom.R.id.pooling_container_listener_holder_tag);
            if (aVar == null) {
                aVar = new a();
                childAt.setTag(com.winfour.winrandom.R.id.pooling_container_listener_holder_tag, aVar);
            }
            ArrayList arrayList2 = aVar.f799a;
            int m02 = W0.h.m0(arrayList2);
            if (-1 < m02) {
                arrayList2.get(m02).getClass();
                throw new ClassCastException();
            }
            i = i3;
        }
        if (!f1623C0 || (runnableC0134p = this.f1656c0) == null) {
            return;
        }
        boolean remove = runnableC0134p.f2593a.remove(this);
        if (f1626x0 && !remove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
        this.f1656c0 = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f1676o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((G) arrayList.get(i)).a(this);
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
        J j2;
        if (this.f1672m != null && !this.f1691w && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f2 = this.f1672m.e() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f1672m.d()) {
                    f3 = motionEvent.getAxisValue(10);
                    if (f2 == A0 || f3 != A0) {
                        int i = (int) (f3 * this.f1649V);
                        int i2 = (int) (f2 * this.f1650W);
                        j2 = this.f1672m;
                        if (j2 == null) {
                            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                        } else if (!this.f1691w) {
                            int[] iArr = this.f1680q0;
                            iArr[0] = 0;
                            iArr[1] = 0;
                            boolean d = j2.d();
                            boolean e2 = this.f1672m.e();
                            int i3 = e2 ? (d ? 1 : 0) | 2 : d ? 1 : 0;
                            float y2 = motionEvent.getY();
                            float x2 = motionEvent.getX();
                            int Y2 = i - Y(i, y2);
                            int Z2 = i2 - Z(i2, x2);
                            getScrollingChildHelper().g(i3, 1);
                            if (u(d ? Y2 : 0, e2 ? Z2 : 0, this.f1680q0, this.f1677o0, 1)) {
                                Y2 -= iArr[0];
                                Z2 -= iArr[1];
                            }
                            c0(d ? Y2 : 0, e2 ? Z2 : 0, motionEvent, 1);
                            RunnableC0134p runnableC0134p = this.f1656c0;
                            if (runnableC0134p != null && (Y2 != 0 || Z2 != 0)) {
                                runnableC0134p.a(this, Y2, Z2);
                            }
                            j0(1);
                        }
                    }
                }
                f3 = 0.0f;
                if (f2 == A0) {
                }
                int i4 = (int) (f3 * this.f1649V);
                int i22 = (int) (f2 * this.f1650W);
                j2 = this.f1672m;
                if (j2 == null) {
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f1672m.e()) {
                        f2 = -axisValue;
                        f3 = 0.0f;
                        if (f2 == A0) {
                        }
                        int i42 = (int) (f3 * this.f1649V);
                        int i222 = (int) (f2 * this.f1650W);
                        j2 = this.f1672m;
                        if (j2 == null) {
                        }
                    } else if (this.f1672m.d()) {
                        f3 = axisValue;
                        f2 = 0.0f;
                        if (f2 == A0) {
                        }
                        int i422 = (int) (f3 * this.f1649V);
                        int i2222 = (int) (f2 * this.f1650W);
                        j2 = this.f1672m;
                        if (j2 == null) {
                        }
                    }
                }
                f2 = 0.0f;
                f3 = 0.0f;
                if (f2 == A0) {
                }
                int i4222 = (int) (f3 * this.f1649V);
                int i22222 = (int) (f2 * this.f1650W);
                j2 = this.f1672m;
                if (j2 == null) {
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
        if (this.f1691w) {
            return false;
        }
        this.f1679q = null;
        if (E(motionEvent)) {
            b0();
            setScrollState(0);
            return true;
        }
        J j2 = this.f1672m;
        if (j2 == null) {
            return false;
        }
        boolean d = j2.d();
        boolean e2 = this.f1672m.e();
        if (this.f1640M == null) {
            this.f1640M = VelocityTracker.obtain();
        }
        this.f1640M.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f1693x) {
                this.f1693x = false;
            }
            this.f1639L = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.f1643P = x2;
            this.f1641N = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.f1644Q = y2;
            this.f1642O = y2;
            EdgeEffect edgeEffect = this.f1634F;
            if (edgeEffect == null || A1.d.F(edgeEffect) == A0 || canScrollHorizontally(-1)) {
                z2 = false;
            } else {
                A1.d.a0(this.f1634F, A0, 1.0f - (motionEvent.getY() / getHeight()));
                z2 = true;
            }
            EdgeEffect edgeEffect2 = this.f1635H;
            boolean z4 = z2;
            if (edgeEffect2 != null) {
                z4 = z2;
                if (A1.d.F(edgeEffect2) != A0) {
                    z4 = z2;
                    if (!canScrollHorizontally(1)) {
                        A1.d.a0(this.f1635H, A0, motionEvent.getY() / getHeight());
                        z4 = true;
                    }
                }
            }
            EdgeEffect edgeEffect3 = this.G;
            boolean z5 = z4;
            if (edgeEffect3 != null) {
                z5 = z4;
                if (A1.d.F(edgeEffect3) != A0) {
                    z5 = z4;
                    if (!canScrollVertically(-1)) {
                        A1.d.a0(this.G, A0, motionEvent.getX() / getWidth());
                        z5 = true;
                    }
                }
            }
            EdgeEffect edgeEffect4 = this.f1636I;
            boolean z6 = z5;
            if (edgeEffect4 != null) {
                z6 = z5;
                if (A1.d.F(edgeEffect4) != A0) {
                    z6 = z5;
                    if (!canScrollVertically(1)) {
                        A1.d.a0(this.f1636I, A0, 1.0f - (motionEvent.getX() / getWidth()));
                        z6 = true;
                    }
                }
            }
            if (z6 || this.f1638K == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                j0(1);
            }
            int[] iArr = this.p0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i = d;
            if (e2) {
                i = (d ? 1 : 0) | 2;
            }
            getScrollingChildHelper().g(i, 0);
        } else if (actionMasked == 1) {
            this.f1640M.clear();
            j0(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f1639L);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f1639L + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f1638K != 1) {
                int i2 = x3 - this.f1641N;
                int i3 = y3 - this.f1642O;
                if (d == 0 || Math.abs(i2) <= this.f1645R) {
                    z3 = false;
                } else {
                    this.f1643P = x3;
                    z3 = true;
                }
                if (e2 && Math.abs(i3) > this.f1645R) {
                    this.f1644Q = y3;
                    z3 = true;
                }
                if (z3) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            b0();
            setScrollState(0);
        } else if (actionMasked == 5) {
            this.f1639L = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f1643P = x4;
            this.f1641N = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f1644Q = y4;
            this.f1642O = y4;
        } else if (actionMasked == 6) {
            U(motionEvent);
        }
        return this.f1638K == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int i5 = h.f295a;
        Trace.beginSection("RV OnLayout");
        r();
        Trace.endSection();
        this.f1685t = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        J j2 = this.f1672m;
        if (j2 == null) {
            q(i, i2);
            return;
        }
        boolean L2 = j2.L();
        boolean z2 = false;
        W w2 = this.f1659e0;
        if (!L2) {
            if (this.f1683s) {
                this.f1672m.f2397b.q(i, i2);
                return;
            }
            if (w2.f2441k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            AbstractC0114B abstractC0114B = this.f1671l;
            if (abstractC0114B != null) {
                w2.f2436e = abstractC0114B.a();
            } else {
                w2.f2436e = 0;
            }
            h0();
            this.f1672m.f2397b.q(i, i2);
            i0(false);
            w2.f2438g = false;
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.f1672m.f2397b.q(i, i2);
        if (mode == 1073741824 && mode2 == 1073741824) {
            z2 = true;
        }
        this.f1686t0 = z2;
        if (z2 || this.f1671l == null) {
            return;
        }
        if (w2.d == 1) {
            s();
        }
        this.f1672m.s0(i, i2);
        w2.i = true;
        t();
        this.f1672m.u0(i, i2);
        if (this.f1672m.x0()) {
            this.f1672m.s0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            w2.i = true;
            t();
            this.f1672m.u0(i, i2);
        }
        this.f1688u0 = getMeasuredWidth();
        this.f1690v0 = getMeasuredHeight();
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
        if (!(parcelable instanceof T)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        T t2 = (T) parcelable;
        this.d = t2;
        super.onRestoreInstanceState(t2.f826a);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        T t2 = new T(super.onSaveInstanceState());
        T t3 = this.d;
        if (t3 != null) {
            t2.f2426c = t3.f2426c;
        } else {
            J j2 = this.f1672m;
            if (j2 != null) {
                t2.f2426c = j2.g0();
            } else {
                t2.f2426c = null;
            }
        }
        return t2;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.f1636I = null;
        this.G = null;
        this.f1635H = null;
        this.f1634F = null;
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
        Z z3;
        float f2;
        float f3;
        Z z4;
        MotionEvent motionEvent4;
        int minFlingVelocity;
        boolean z5;
        int H2;
        PointF a2;
        Z z6;
        int i3;
        RecyclerView recyclerView2;
        boolean z7;
        if (this.f1691w || this.f1693x) {
            return false;
        }
        C0131m c0131m = this.f1679q;
        if (c0131m == null) {
            z2 = motionEvent.getAction() == 0 ? false : E(motionEvent);
        } else {
            if (c0131m.f2579v != 0) {
                if (motionEvent.getAction() == 0) {
                    boolean d = c0131m.d(motionEvent.getX(), motionEvent.getY());
                    boolean c2 = c0131m.c(motionEvent.getX(), motionEvent.getY());
                    if (d || c2) {
                        if (c2) {
                            c0131m.f2580w = 1;
                            c0131m.f2573p = (int) motionEvent.getX();
                        } else if (d) {
                            c0131m.f2580w = 2;
                            c0131m.f2570m = (int) motionEvent.getY();
                        }
                        c0131m.f(2);
                    }
                } else if (motionEvent.getAction() == 1 && c0131m.f2579v == 2) {
                    c0131m.f2570m = A0;
                    c0131m.f2573p = A0;
                    c0131m.f(1);
                    c0131m.f2580w = 0;
                } else if (motionEvent.getAction() == 2 && c0131m.f2579v == 2) {
                    c0131m.g();
                    int i4 = c0131m.f2580w;
                    int i5 = c0131m.f2561b;
                    if (i4 == 1) {
                        float x2 = motionEvent.getX();
                        int[] iArr = c0131m.f2582y;
                        iArr[0] = i5;
                        int i6 = c0131m.f2574q - i5;
                        iArr[1] = i6;
                        float max = Math.max(i5, Math.min(i6, x2));
                        if (Math.abs(c0131m.f2572o - max) >= 2.0f) {
                            int e2 = C0131m.e(c0131m.f2573p, max, iArr, c0131m.f2576s.computeHorizontalScrollRange(), c0131m.f2576s.computeHorizontalScrollOffset(), c0131m.f2574q);
                            if (e2 != 0) {
                                c0131m.f2576s.scrollBy(e2, 0);
                            }
                            c0131m.f2573p = max;
                        }
                    }
                    if (c0131m.f2580w == 2) {
                        float y2 = motionEvent.getY();
                        int[] iArr2 = c0131m.f2581x;
                        iArr2[0] = i5;
                        int i7 = c0131m.f2575r - i5;
                        iArr2[1] = i7;
                        float max2 = Math.max(i5, Math.min(i7, y2));
                        if (Math.abs(c0131m.f2569l - max2) >= 2.0f) {
                            int e3 = C0131m.e(c0131m.f2570m, max2, iArr2, c0131m.f2576s.computeVerticalScrollRange(), c0131m.f2576s.computeVerticalScrollOffset(), c0131m.f2575r);
                            if (e3 != 0) {
                                c0131m.f2576s.scrollBy(0, e3);
                            }
                            c0131m.f2570m = max2;
                        }
                    }
                }
            }
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.f1679q = null;
            }
            z2 = true;
        }
        if (z2) {
            b0();
            setScrollState(0);
            return true;
        }
        J j2 = this.f1672m;
        if (j2 == null) {
            return false;
        }
        boolean d2 = j2.d();
        boolean e4 = this.f1672m.e();
        if (this.f1640M == null) {
            this.f1640M = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        int[] iArr3 = this.p0;
        if (actionMasked == 0) {
            iArr3[1] = 0;
            iArr3[0] = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(iArr3[0], iArr3[1]);
        if (actionMasked == 0) {
            recyclerView = this;
            motionEvent2 = obtain;
            recyclerView.f1639L = motionEvent.getPointerId(0);
            int x3 = (int) (motionEvent.getX() + 0.5f);
            recyclerView.f1643P = x3;
            recyclerView.f1641N = x3;
            int y3 = (int) (motionEvent.getY() + 0.5f);
            recyclerView.f1644Q = y3;
            recyclerView.f1642O = y3;
            int i8 = d2;
            if (e4) {
                i8 = (d2 ? 1 : 0) | 2;
            }
            getScrollingChildHelper().g(i8, 0);
        } else {
            if (actionMasked == 1) {
                this.f1640M.addMovement(obtain);
                VelocityTracker velocityTracker = this.f1640M;
                int i9 = this.f1648U;
                velocityTracker.computeCurrentVelocity(1000, i9);
                float f4 = d2 != 0 ? -this.f1640M.getXVelocity(this.f1639L) : 0.0f;
                float f5 = e4 ? -this.f1640M.getYVelocity(this.f1639L) : 0.0f;
                if (f4 == A0 && f5 == A0) {
                    recyclerView2 = this;
                    i3 = 0;
                    motionEvent4 = obtain;
                } else {
                    int i10 = (int) f4;
                    int i11 = (int) f5;
                    J j3 = this.f1672m;
                    if (j3 == null) {
                        Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                    } else if (!this.f1691w) {
                        int d3 = j3.d();
                        boolean e5 = this.f1672m.e();
                        int i12 = this.f1647T;
                        if (d3 == 0 || Math.abs(i10) < i12) {
                            i10 = 0;
                        }
                        if (!e5 || Math.abs(i11) < i12) {
                            i11 = 0;
                        }
                        if (i10 != 0 || i11 != 0) {
                            if (i10 != 0) {
                                EdgeEffect edgeEffect = this.f1634F;
                                if (edgeEffect == null || A1.d.F(edgeEffect) == A0) {
                                    EdgeEffect edgeEffect2 = this.f1635H;
                                    if (edgeEffect2 != null && A1.d.F(edgeEffect2) != A0) {
                                        if (f0(this.f1635H, i10, getWidth())) {
                                            this.f1635H.onAbsorb(i10);
                                            i10 = 0;
                                        }
                                        i = i10;
                                        i10 = 0;
                                    }
                                } else {
                                    int i13 = -i10;
                                    if (f0(this.f1634F, i13, getWidth())) {
                                        this.f1634F.onAbsorb(i13);
                                        i10 = 0;
                                    }
                                    i = i10;
                                    i10 = 0;
                                }
                                if (i11 != 0) {
                                    EdgeEffect edgeEffect3 = this.G;
                                    if (edgeEffect3 == null || A1.d.F(edgeEffect3) == A0) {
                                        EdgeEffect edgeEffect4 = this.f1636I;
                                        if (edgeEffect4 != null && A1.d.F(edgeEffect4) != A0) {
                                            if (f0(this.f1636I, i11, getHeight())) {
                                                this.f1636I.onAbsorb(i11);
                                                i11 = 0;
                                            }
                                            i2 = 0;
                                        }
                                    } else {
                                        int i14 = -i11;
                                        if (f0(this.G, i14, getHeight())) {
                                            this.G.onAbsorb(i14);
                                            i11 = 0;
                                        }
                                        i2 = 0;
                                    }
                                    z3 = this.f1654b0;
                                    if (i == 0 || i11 != 0) {
                                        int i15 = -i9;
                                        i = Math.max(i15, Math.min(i, i9));
                                        i11 = Math.max(i15, Math.min(i11, i9));
                                        z3.a(i, i11);
                                    }
                                    if (i10 == 0 || i2 != 0) {
                                        f2 = i10;
                                        f3 = i2;
                                        if (!dispatchNestedPreFling(f2, f3)) {
                                            boolean z8 = d3 != 0 || e5;
                                            dispatchNestedFling(f2, f3, z8);
                                            L l2 = this.f1646S;
                                            if (l2 != null) {
                                                C0143z c0143z = (C0143z) l2;
                                                J layoutManager = c0143z.f2641a.getLayoutManager();
                                                if (layoutManager != 0 && c0143z.f2641a.getAdapter() != null && ((Math.abs(i2) > (minFlingVelocity = c0143z.f2641a.getMinFlingVelocity()) || Math.abs(i10) > minFlingVelocity) && ((z5 = layoutManager instanceof h0.V)))) {
                                                    C0142y c0142y = !z5 ? null : new C0142y(c0143z, c0143z.f2641a.getContext(), 0);
                                                    if (c0142y != null) {
                                                        int B2 = layoutManager.B();
                                                        if (B2 != 0) {
                                                            g e6 = layoutManager.e() ? c0143z.e(layoutManager) : layoutManager.d() ? c0143z.d(layoutManager) : null;
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
                                                                        z6 = z3;
                                                                    } else {
                                                                        z6 = z3;
                                                                        int b2 = C0143z.b(u2, e6);
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
                                                                    z3 = z6;
                                                                }
                                                                z4 = z3;
                                                                boolean z9 = !layoutManager.d() ? i2 <= 0 : i10 <= 0;
                                                                if (z9 && view != null) {
                                                                    H2 = J.H(view);
                                                                } else if (z9 || view2 == null) {
                                                                    if (z9) {
                                                                        view = view2;
                                                                    }
                                                                    if (view != null) {
                                                                        H2 = ((z5 && (a2 = ((h0.V) layoutManager).a(layoutManager.B() - 1)) != null && ((a2.x > A0 ? 1 : (a2.x == A0 ? 0 : -1)) < 0 || (a2.y > A0 ? 1 : (a2.y == A0 ? 0 : -1)) < 0)) == z9 ? -1 : 1) + J.H(view);
                                                                        if (H2 >= 0) {
                                                                        }
                                                                    }
                                                                    H2 = -1;
                                                                } else {
                                                                    H2 = J.H(view2);
                                                                }
                                                                if (H2 != -1) {
                                                                    c0142y.f2625a = H2;
                                                                    layoutManager.A0(c0142y);
                                                                }
                                                                if (z8) {
                                                                    if (e5) {
                                                                        d3 = (d3 == true ? 1 : 0) | 2;
                                                                    }
                                                                    getScrollingChildHelper().g(d3, 1);
                                                                    int i20 = -i9;
                                                                    z4.a(Math.max(i20, Math.min(i10, i9)), Math.max(i20, Math.min(i2, i9)));
                                                                }
                                                                i3 = 0;
                                                                recyclerView2 = this;
                                                            }
                                                        }
                                                        z4 = z3;
                                                        motionEvent4 = obtain;
                                                        H2 = -1;
                                                        if (H2 != -1) {
                                                        }
                                                        if (z8) {
                                                        }
                                                        i3 = 0;
                                                        recyclerView2 = this;
                                                    }
                                                }
                                            }
                                            z4 = z3;
                                            motionEvent4 = obtain;
                                            if (z8) {
                                            }
                                            i3 = 0;
                                            recyclerView2 = this;
                                        }
                                    } else if (i != 0 || i11 != 0) {
                                        motionEvent4 = obtain;
                                    }
                                    b0();
                                    motionEvent3 = motionEvent4;
                                    motionEvent3.recycle();
                                    return true;
                                }
                                i2 = i11;
                                i11 = 0;
                                z3 = this.f1654b0;
                                if (i == 0) {
                                }
                                int i152 = -i9;
                                i = Math.max(i152, Math.min(i, i9));
                                i11 = Math.max(i152, Math.min(i11, i9));
                                z3.a(i, i11);
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
                            z3 = this.f1654b0;
                            if (i == 0) {
                            }
                            int i1522 = -i9;
                            i = Math.max(i1522, Math.min(i, i9));
                            i11 = Math.max(i1522, Math.min(i11, i9));
                            z3.a(i, i11);
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
                b0();
                motionEvent3 = motionEvent4;
                motionEvent3.recycle();
                return true;
            }
            if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f1639L);
                if (findPointerIndex < 0) {
                    Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f1639L + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                int x4 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                int y4 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                int i21 = this.f1643P - x4;
                int i22 = this.f1644Q - y4;
                if (this.f1638K != 1) {
                    if (d2 != 0) {
                        i21 = i21 > 0 ? Math.max(0, i21 - this.f1645R) : Math.min(0, i21 + this.f1645R);
                        if (i21 != 0) {
                            z7 = true;
                            if (e4) {
                                i22 = i22 > 0 ? Math.max(0, i22 - this.f1645R) : Math.min(0, i22 + this.f1645R);
                                if (i22 != 0) {
                                    z7 = true;
                                }
                            }
                            if (z7) {
                                setScrollState(1);
                            }
                        }
                    }
                    z7 = false;
                    if (e4) {
                    }
                    if (z7) {
                    }
                }
                if (this.f1638K == 1) {
                    int[] iArr4 = this.f1680q0;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    int Y2 = i21 - Y(i21, motionEvent.getY());
                    int Z2 = i22 - Z(i22, motionEvent.getX());
                    boolean u3 = u(d2 != 0 ? Y2 : 0, e4 ? Z2 : 0, this.f1680q0, this.f1677o0, 0);
                    int[] iArr5 = this.f1677o0;
                    if (u3) {
                        Y2 -= iArr4[0];
                        Z2 -= iArr4[1];
                        iArr3[0] = iArr3[0] + iArr5[0];
                        iArr3[1] = iArr3[1] + iArr5[1];
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int i23 = Y2;
                    int i24 = Z2;
                    this.f1643P = x4 - iArr5[0];
                    this.f1644Q = y4 - iArr5[1];
                    if (c0(d2 != 0 ? i23 : 0, e4 ? i24 : 0, motionEvent, 0)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    RunnableC0134p runnableC0134p = this.f1656c0;
                    if (runnableC0134p != null && (i23 != 0 || i24 != 0)) {
                        runnableC0134p.a(this, i23, i24);
                    }
                }
            } else if (actionMasked == 3) {
                b0();
                setScrollState(0);
            } else if (actionMasked == 5) {
                this.f1639L = motionEvent.getPointerId(actionIndex);
                int x5 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.f1643P = x5;
                this.f1641N = x5;
                int y5 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.f1644Q = y5;
                this.f1642O = y5;
            } else if (actionMasked == 6) {
                U(motionEvent);
            }
            recyclerView = this;
            motionEvent2 = obtain;
        }
        motionEvent3 = motionEvent2;
        recyclerView.f1640M.addMovement(motionEvent3);
        motionEvent3.recycle();
        return true;
    }

    public final void p() {
        I.d dVar = this.f1658e;
        if (!this.f1685t || this.f1629A) {
            int i = h.f295a;
            Trace.beginSection("RV FullInvalidate");
            r();
            Trace.endSection();
            return;
        }
        if (dVar.f()) {
            dVar.getClass();
            if (dVar.f()) {
                int i2 = h.f295a;
                Trace.beginSection("RV FullInvalidate");
                r();
                Trace.endSection();
            }
        }
    }

    public final void q(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = L.T.f490a;
        setMeasuredDimension(J.g(i, paddingRight, getMinimumWidth()), J.g(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x0332, code lost:
    
        if (r19.f1660f.f2478c.contains(getFocusedChild()) == false) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x038d, code lost:
    
        if (r6.hasFocusable() != false) goto L190;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [h0.a0] */
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
        if (this.f1671l == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f1672m == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        W w2 = this.f1659e0;
        w2.i = false;
        boolean z3 = this.f1686t0 && !(this.f1688u0 == getWidth() && this.f1690v0 == getHeight());
        this.f1688u0 = 0;
        this.f1690v0 = 0;
        this.f1686t0 = false;
        if (w2.d == 1) {
            s();
            this.f1672m.r0(this);
            t();
        } else {
            I.d dVar = this.f1658e;
            if ((((ArrayList) dVar.d).isEmpty() || ((ArrayList) dVar.f321c).isEmpty()) && !z3 && this.f1672m.f2407n == getWidth() && this.f1672m.f2408o == getHeight()) {
                this.f1672m.r0(this);
            } else {
                this.f1672m.r0(this);
                t();
            }
        }
        w2.a(4);
        h0();
        S();
        w2.d = 1;
        boolean z4 = w2.f2440j;
        View view2 = null;
        Long l2 = null;
        P p2 = this.f1655c;
        j jVar = this.f1662g;
        if (z4) {
            int e2 = this.f1660f.e() - 1;
            while (e2 >= 0) {
                a0 L2 = L(this.f1660f.d(e2));
                if (!L2.p()) {
                    long J2 = J(L2);
                    this.f1637J.getClass();
                    C0019q c0019q2 = new C0019q();
                    c0019q2.a(L2);
                    a0 a0Var = (a0) ((e) jVar.f87c).c(J2, l2);
                    if (a0Var == null || a0Var.p()) {
                        jVar.a(L2, c0019q2);
                    } else {
                        k kVar = (k) jVar.f86b;
                        l0 l0Var = (l0) kVar.getOrDefault(a0Var, l2);
                        boolean z5 = (l0Var == null || (l0Var.f2553a & 1) == 0) ? false : true;
                        l0 l0Var2 = (l0) kVar.getOrDefault(L2, l2);
                        boolean z6 = (l0Var2 == null || (l0Var2.f2553a & 1) == 0) ? false : true;
                        if (z5 && a0Var == L2) {
                            jVar.a(L2, c0019q2);
                        } else {
                            C0019q F2 = jVar.F(a0Var, 4);
                            jVar.a(L2, c0019q2);
                            C0019q F3 = jVar.F(L2, 8);
                            if (F2 == null) {
                                int e3 = this.f1660f.e();
                                for (int i2 = 0; i2 < e3; i2++) {
                                    a0 L3 = L(this.f1660f.d(i2));
                                    if (L3 != L2 && J(L3) == J2) {
                                        AbstractC0114B abstractC0114B = this.f1671l;
                                        if (abstractC0114B == null || !abstractC0114B.f2384b) {
                                            StringBuilder sb = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                                            sb.append(L3);
                                            sb.append(" \n View Holder 2:");
                                            sb.append(L2);
                                            throw new IllegalStateException(V.d(this, sb));
                                        }
                                        StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                                        sb2.append(L3);
                                        sb2.append(" \n View Holder 2:");
                                        sb2.append(L2);
                                        throw new IllegalStateException(V.d(this, sb2));
                                    }
                                }
                                Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + a0Var + " cannot be found but it is necessary for " + L2 + B());
                            } else {
                                a0Var.o(false);
                                if (z5) {
                                    h(a0Var);
                                }
                                if (a0Var != L2) {
                                    if (z6) {
                                        h(L2);
                                    }
                                    a0Var.f2461h = L2;
                                    h(a0Var);
                                    p2.l(a0Var);
                                    L2.o(false);
                                    L2.i = a0Var;
                                }
                                if (this.f1637J.a(a0Var, L2, F2, F3)) {
                                    V();
                                }
                            }
                        }
                    }
                }
                e2--;
                l2 = null;
            }
            k kVar2 = (k) jVar.f86b;
            for (int i3 = kVar2.f3473c - 1; i3 >= 0; i3--) {
                a0 a0Var2 = (a0) kVar2.h(i3);
                l0 l0Var3 = (l0) kVar2.i(i3);
                int i4 = l0Var3.f2553a;
                int i5 = i4 & 3;
                C0113A c0113a = this.f1692w0;
                if (i5 == 3) {
                    RecyclerView recyclerView2 = c0113a.f2382a;
                    recyclerView2.f1672m.k0(a0Var2.f2455a, recyclerView2.f1655c);
                } else if ((i4 & 1) != 0) {
                    C0019q c0019q3 = l0Var3.f2554b;
                    if (c0019q3 == null) {
                        RecyclerView recyclerView3 = c0113a.f2382a;
                        recyclerView3.f1672m.k0(a0Var2.f2455a, recyclerView3.f1655c);
                    } else {
                        c0113a.g(a0Var2, c0019q3, l0Var3.f2555c);
                    }
                } else if ((i4 & 14) == 14) {
                    c0113a.f(a0Var2, l0Var3.f2554b, l0Var3.f2555c);
                } else if ((i4 & 12) == 12) {
                    C0019q c0019q4 = l0Var3.f2554b;
                    C0019q c0019q5 = l0Var3.f2555c;
                    c0113a.getClass();
                    a0Var2.o(false);
                    RecyclerView recyclerView4 = c0113a.f2382a;
                    if (!recyclerView4.f1629A) {
                        C0128j c0128j = (C0128j) recyclerView4.f1637J;
                        c0128j.getClass();
                        int i6 = c0019q4.f562a;
                        int i7 = c0019q5.f562a;
                        if (i6 == i7 && c0019q4.f563b == c0019q5.f563b) {
                            c0128j.c(a0Var2);
                            recyclerView = recyclerView4;
                            g2 = false;
                        } else {
                            recyclerView = recyclerView4;
                            g2 = c0128j.g(a0Var2, i6, c0019q4.f563b, i7, c0019q5.f563b);
                        }
                        if (g2) {
                            recyclerView.V();
                        }
                    } else if (recyclerView4.f1637J.a(a0Var2, a0Var2, c0019q4, c0019q5)) {
                        recyclerView4.V();
                    }
                } else {
                    if ((i4 & 4) != 0) {
                        c0019q = null;
                        c0113a.g(a0Var2, l0Var3.f2554b, null);
                    } else {
                        c0019q = null;
                        if ((i4 & 8) != 0) {
                            c0113a.f(a0Var2, l0Var3.f2554b, l0Var3.f2555c);
                        }
                    }
                    i = 0;
                    l0Var3.f2553a = i;
                    l0Var3.f2554b = c0019q;
                    l0Var3.f2555c = c0019q;
                    l0.d.c(l0Var3);
                }
                i = 0;
                c0019q = null;
                l0Var3.f2553a = i;
                l0Var3.f2554b = c0019q;
                l0Var3.f2555c = c0019q;
                l0.d.c(l0Var3);
            }
            view2 = null;
        }
        this.f1672m.j0(p2);
        w2.f2434b = w2.f2436e;
        this.f1629A = false;
        this.f1630B = false;
        w2.f2440j = false;
        w2.f2441k = false;
        this.f1672m.f2400f = false;
        ArrayList arrayList = p2.f2419b;
        if (arrayList != null) {
            arrayList.clear();
        }
        J j2 = this.f1672m;
        if (j2.f2404k) {
            j2.f2403j = 0;
            j2.f2404k = false;
            p2.m();
        }
        this.f1672m.e0(w2);
        T(true);
        i0(false);
        ((k) jVar.f86b).clear();
        ((e) jVar.f87c).a();
        int[] iArr = this.f1673m0;
        int i8 = iArr[0];
        int i9 = iArr[1];
        F(iArr);
        if ((iArr[0] == i8 && iArr[1] == i9) ? false : true) {
            w(0, 0);
        }
        if (this.f1652a0 && this.f1671l != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (!isFocused()) {
            }
            long j3 = w2.f2443m;
            if (j3 != -1 && (z2 = this.f1671l.f2384b) && z2) {
                int h2 = this.f1660f.h();
                r10 = view2;
                int i10 = 0;
                while (true) {
                    if (i10 >= h2) {
                        break;
                    }
                    a0 L4 = L(this.f1660f.g(i10));
                    if (L4 != null && !L4.i() && L4.f2458e == j3) {
                        if (!this.f1660f.f2478c.contains(L4.f2455a)) {
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
                ArrayList arrayList2 = this.f1660f.f2478c;
                view = r10.f2455a;
                if (!arrayList2.contains(view)) {
                }
            }
            if (this.f1660f.e() > 0) {
                int i11 = w2.f2442l;
                if (i11 == -1) {
                    i11 = 0;
                }
                int b2 = w2.b();
                for (int i12 = i11; i12 < b2; i12++) {
                    a0 H2 = H(i12);
                    if (H2 == null) {
                        break;
                    }
                    View view3 = H2.f2455a;
                    if (view3.hasFocusable()) {
                        view2 = view3;
                        break;
                    }
                }
                for (int min = Math.min(b2, i11) - 1; min >= 0; min--) {
                    a0 H3 = H(min);
                    if (H3 == null) {
                        break;
                    }
                    view = H3.f2455a;
                    if (view.hasFocusable()) {
                        view2 = view;
                        break;
                    }
                }
            }
            if (view2 != null) {
                int i13 = w2.f2444n;
                if (i13 != -1 && (findViewById = view2.findViewById(i13)) != null && findViewById.isFocusable()) {
                    view2 = findViewById;
                }
                view2.requestFocus();
            }
        }
        w2.f2443m = -1L;
        w2.f2442l = -1;
        w2.f2444n = -1;
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z2) {
        a0 L2 = L(view);
        if (L2 != null) {
            if (L2.k()) {
                L2.f2462j &= -257;
            } else if (!L2.p()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(L2);
                throw new IllegalArgumentException(V.d(this, sb));
            }
        } else if (f1626x0) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            throw new IllegalArgumentException(V.d(this, sb2));
        }
        view.clearAnimation();
        L(view);
        super.removeDetachedView(view, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        C0140w c0140w = this.f1672m.f2399e;
        if ((c0140w == null || !c0140w.f2628e) && !O() && view2 != null) {
            a0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.f1672m.m0(this, view, rect, z2, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        ArrayList arrayList = this.f1678p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C0131m) arrayList.get(i)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f1687u != 0 || this.f1691w) {
            this.f1689v = true;
        } else {
            super.requestLayout();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x03ee A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:360:0x03d2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0226 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s() {
        View D2;
        int I2;
        View view;
        l0 l0Var;
        boolean z2;
        int i;
        int i2;
        boolean z3;
        boolean z4;
        char c2;
        int i3;
        int i4;
        boolean z5;
        boolean z6;
        C0119a h2;
        int i5;
        int i6;
        C0119a c0119a;
        W w2 = this.f1659e0;
        w2.a(1);
        C(w2);
        w2.i = false;
        h0();
        j jVar = this.f1662g;
        ((k) jVar.f86b).clear();
        e eVar = (e) jVar.f87c;
        eVar.a();
        S();
        if (this.f1629A) {
            I.d dVar = this.f1658e;
            dVar.j((ArrayList) dVar.f321c);
            dVar.j((ArrayList) dVar.d);
            if (this.f1630B) {
                this.f1672m.Z();
            }
        }
        if (this.f1637J == null || !this.f1672m.B0()) {
            this.f1658e.b();
        } else {
            I.d dVar2 = this.f1658e;
            ArrayList arrayList = (ArrayList) dVar2.f321c;
            D.g gVar = (D.g) dVar2.f323f;
            gVar.getClass();
            while (true) {
                int size = arrayList.size() - 1;
                boolean z7 = false;
                while (true) {
                    i = 8;
                    if (size < 0) {
                        size = -1;
                        break;
                    }
                    if (((C0119a) arrayList.get(size)).f2451a == 8) {
                        if (z7) {
                            break;
                        }
                    } else {
                        z7 = true;
                    }
                    size--;
                }
                if (size == -1) {
                    break;
                }
                int i7 = size + 1;
                C0119a c0119a2 = (C0119a) arrayList.get(size);
                C0119a c0119a3 = (C0119a) arrayList.get(i7);
                int i8 = c0119a3.f2451a;
                if (i8 != 1) {
                    C0119a c0119a4 = null;
                    I.d dVar3 = (I.d) gVar.f122b;
                    if (i8 == 2) {
                        int i9 = c0119a2.f2452b;
                        int i10 = c0119a2.f2453c;
                        if (i9 < i10) {
                            if (c0119a3.f2452b == i9 && c0119a3.f2453c == i10 - i9) {
                                z5 = false;
                                z6 = true;
                            } else {
                                z5 = false;
                                z6 = false;
                            }
                        } else if (c0119a3.f2452b == i10 + 1 && c0119a3.f2453c == i9 - i10) {
                            z5 = true;
                            z6 = true;
                        } else {
                            z5 = true;
                            z6 = false;
                        }
                        int i11 = c0119a3.f2452b;
                        if (i10 < i11) {
                            c0119a3.f2452b = i11 - 1;
                        } else {
                            int i12 = c0119a3.f2453c;
                            if (i10 < i11 + i12) {
                                c0119a3.f2453c = i12 - 1;
                                c0119a2.f2451a = 2;
                                c0119a2.f2453c = 1;
                                if (c0119a3.f2453c == 0) {
                                    arrayList.remove(i7);
                                    dVar3.getClass();
                                    ((b) dVar3.f320b).c(c0119a3);
                                }
                            }
                        }
                        int i13 = c0119a2.f2452b;
                        int i14 = c0119a3.f2452b;
                        if (i13 <= i14) {
                            c0119a3.f2452b = i14 + 1;
                        } else {
                            int i15 = i14 + c0119a3.f2453c;
                            if (i13 < i15) {
                                c0119a4 = dVar3.h(2, i13 + 1, i15 - i13);
                                c0119a3.f2453c = c0119a2.f2452b - c0119a3.f2452b;
                            }
                        }
                        C0119a c0119a5 = c0119a4;
                        if (z6) {
                            arrayList.set(size, c0119a3);
                            arrayList.remove(i7);
                            dVar3.getClass();
                            ((b) dVar3.f320b).c(c0119a2);
                        } else {
                            if (z5) {
                                if (c0119a5 != null) {
                                    int i16 = c0119a2.f2452b;
                                    if (i16 > c0119a5.f2452b) {
                                        c0119a2.f2452b = i16 - c0119a5.f2453c;
                                    }
                                    int i17 = c0119a2.f2453c;
                                    if (i17 > c0119a5.f2452b) {
                                        c0119a2.f2453c = i17 - c0119a5.f2453c;
                                    }
                                }
                                int i18 = c0119a2.f2452b;
                                if (i18 > c0119a3.f2452b) {
                                    c0119a2.f2452b = i18 - c0119a3.f2453c;
                                }
                                int i19 = c0119a2.f2453c;
                                if (i19 > c0119a3.f2452b) {
                                    c0119a2.f2453c = i19 - c0119a3.f2453c;
                                }
                            } else {
                                if (c0119a5 != null) {
                                    int i20 = c0119a2.f2452b;
                                    if (i20 >= c0119a5.f2452b) {
                                        c0119a2.f2452b = i20 - c0119a5.f2453c;
                                    }
                                    int i21 = c0119a2.f2453c;
                                    if (i21 >= c0119a5.f2452b) {
                                        c0119a2.f2453c = i21 - c0119a5.f2453c;
                                    }
                                }
                                int i22 = c0119a2.f2452b;
                                if (i22 >= c0119a3.f2452b) {
                                    c0119a2.f2452b = i22 - c0119a3.f2453c;
                                }
                                int i23 = c0119a2.f2453c;
                                if (i23 >= c0119a3.f2452b) {
                                    c0119a2.f2453c = i23 - c0119a3.f2453c;
                                }
                            }
                            arrayList.set(size, c0119a3);
                            if (c0119a2.f2452b != c0119a2.f2453c) {
                                arrayList.set(i7, c0119a2);
                            } else {
                                arrayList.remove(i7);
                            }
                            if (c0119a5 != null) {
                                arrayList.add(size, c0119a5);
                            }
                        }
                    } else if (i8 == 4) {
                        int i24 = c0119a2.f2453c;
                        int i25 = c0119a3.f2452b;
                        if (i24 < i25) {
                            c0119a3.f2452b = i25 - 1;
                        } else {
                            int i26 = c0119a3.f2453c;
                            if (i24 < i25 + i26) {
                                c0119a3.f2453c = i26 - 1;
                                h2 = dVar3.h(4, c0119a2.f2452b, 1);
                                i5 = c0119a2.f2452b;
                                i6 = c0119a3.f2452b;
                                if (i5 > i6) {
                                    c0119a3.f2452b = i6 + 1;
                                } else {
                                    int i27 = i6 + c0119a3.f2453c;
                                    if (i5 < i27) {
                                        int i28 = i27 - i5;
                                        c0119a4 = dVar3.h(4, i5 + 1, i28);
                                        c0119a3.f2453c -= i28;
                                    }
                                }
                                c0119a = c0119a4;
                                arrayList.set(i7, c0119a2);
                                if (c0119a3.f2453c <= 0) {
                                    arrayList.set(size, c0119a3);
                                } else {
                                    arrayList.remove(size);
                                    dVar3.getClass();
                                    ((b) dVar3.f320b).c(c0119a3);
                                }
                                if (h2 != null) {
                                    arrayList.add(size, h2);
                                }
                                if (c0119a == null) {
                                    arrayList.add(size, c0119a);
                                }
                            }
                        }
                        h2 = null;
                        i5 = c0119a2.f2452b;
                        i6 = c0119a3.f2452b;
                        if (i5 > i6) {
                        }
                        c0119a = c0119a4;
                        arrayList.set(i7, c0119a2);
                        if (c0119a3.f2453c <= 0) {
                        }
                        if (h2 != null) {
                        }
                        if (c0119a == null) {
                        }
                    }
                } else {
                    int i29 = c0119a2.f2453c;
                    int i30 = c0119a3.f2452b;
                    int i31 = i29 < i30 ? -1 : 0;
                    int i32 = c0119a2.f2452b;
                    if (i32 < i30) {
                        i31++;
                    }
                    if (i30 <= i32) {
                        c0119a2.f2452b = i32 + c0119a3.f2453c;
                    }
                    int i33 = c0119a3.f2452b;
                    if (i33 <= i29) {
                        c0119a2.f2453c = i29 + c0119a3.f2453c;
                    }
                    c0119a3.f2452b = i33 + i31;
                    arrayList.set(size, c0119a3);
                    arrayList.set(i7, c0119a2);
                }
            }
            int size2 = arrayList.size();
            int i34 = 0;
            while (i34 < size2) {
                C0119a c0119a6 = (C0119a) arrayList.get(i34);
                int i35 = c0119a6.f2451a;
                if (i35 != 1) {
                    b bVar = (b) dVar2.f320b;
                    C0113A c0113a = (C0113A) dVar2.f322e;
                    if (i35 == 2) {
                        i2 = size2;
                        int i36 = c0119a6.f2452b;
                        int i37 = c0119a6.f2453c + i36;
                        int i38 = i36;
                        int i39 = 0;
                        char c3 = 65535;
                        while (i38 < i37) {
                            if (c0113a.b(i38) != null || dVar2.a(i38)) {
                                if (c3 == 0) {
                                    dVar2.c(dVar2.h(2, i36, i39));
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                z4 = z3;
                                c2 = 1;
                            } else {
                                if (c3 == 1) {
                                    dVar2.i(dVar2.h(2, i36, i39));
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                c2 = 0;
                            }
                            if (z4) {
                                i38 -= i39;
                                i37 -= i39;
                                i39 = 1;
                            } else {
                                i39++;
                            }
                            i38++;
                            c3 = c2;
                        }
                        if (i39 != c0119a6.f2453c) {
                            bVar.c(c0119a6);
                            c0119a6 = dVar2.h(2, i36, i39);
                        }
                        if (c3 == 0) {
                            dVar2.c(c0119a6);
                        } else {
                            dVar2.i(c0119a6);
                        }
                    } else if (i35 != 4) {
                        if (i35 == i) {
                            dVar2.i(c0119a6);
                        }
                        i2 = size2;
                    } else {
                        int i40 = c0119a6.f2452b;
                        int i41 = c0119a6.f2453c + i40;
                        int i42 = i40;
                        char c4 = 65535;
                        int i43 = 0;
                        while (i40 < i41) {
                            if (c0113a.b(i40) != null || dVar2.a(i40)) {
                                i3 = size2;
                                if (c4 == 0) {
                                    dVar2.c(dVar2.h(4, i42, i43));
                                    i42 = i40;
                                    i43 = 0;
                                }
                                i4 = 1;
                                c4 = 1;
                            } else {
                                i3 = size2;
                                if (c4 == 1) {
                                    dVar2.i(dVar2.h(4, i42, i43));
                                    i42 = i40;
                                    i43 = 0;
                                }
                                i4 = 1;
                                c4 = 0;
                            }
                            i43 += i4;
                            i40++;
                            size2 = i3;
                        }
                        i2 = size2;
                        if (i43 != c0119a6.f2453c) {
                            bVar.c(c0119a6);
                            c0119a6 = dVar2.h(4, i42, i43);
                        }
                        if (c4 == 0) {
                            dVar2.c(c0119a6);
                        } else {
                            dVar2.i(c0119a6);
                        }
                    }
                } else {
                    i2 = size2;
                    dVar2.i(c0119a6);
                }
                i34++;
                size2 = i2;
                i = 8;
            }
            arrayList.clear();
        }
        boolean z8 = this.f1665h0 || this.f1666i0;
        boolean z9 = this.f1685t && this.f1637J != null && ((z2 = this.f1629A) || z8 || this.f1672m.f2400f) && (!z2 || this.f1671l.f2384b);
        W w3 = this.f1659e0;
        w3.f2440j = z9;
        w3.f2441k = z9 && z8 && !this.f1629A && this.f1637J != null && this.f1672m.B0();
        View focusedChild = (this.f1652a0 && hasFocus() && this.f1671l != null) ? getFocusedChild() : null;
        a0 K2 = (focusedChild == null || (D2 = D(focusedChild)) == null) ? null : K(D2);
        if (K2 == null) {
            w2.f2443m = -1L;
            w2.f2442l = -1;
            w2.f2444n = -1;
        } else {
            w2.f2443m = this.f1671l.f2384b ? K2.f2458e : -1L;
            if (!this.f1629A) {
                if (K2.i()) {
                    I2 = K2.d;
                } else {
                    RecyclerView recyclerView = K2.f2470r;
                    if (recyclerView != null) {
                        I2 = recyclerView.I(K2);
                    }
                }
                w2.f2442l = I2;
                view = K2.f2455a;
                int id = view.getId();
                while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                    view = ((ViewGroup) view).getFocusedChild();
                    if (view.getId() == -1) {
                        id = view.getId();
                    }
                }
                w2.f2444n = id;
            }
            I2 = -1;
            w2.f2442l = I2;
            view = K2.f2455a;
            int id2 = view.getId();
            while (!view.isFocused()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() == -1) {
                }
            }
            w2.f2444n = id2;
        }
        w2.f2439h = w2.f2440j && this.f1666i0;
        this.f1666i0 = false;
        this.f1665h0 = false;
        w2.f2438g = w2.f2441k;
        w2.f2436e = this.f1671l.a();
        F(this.f1673m0);
        boolean z10 = w2.f2440j;
        k kVar = (k) jVar.f86b;
        if (z10) {
            int e2 = this.f1660f.e();
            for (int i44 = 0; i44 < e2; i44++) {
                a0 L2 = L(this.f1660f.d(i44));
                if (!L2.p() && (!L2.g() || this.f1671l.f2384b)) {
                    AbstractC0118F abstractC0118F = this.f1637J;
                    AbstractC0118F.b(L2);
                    L2.c();
                    abstractC0118F.getClass();
                    C0019q c0019q = new C0019q();
                    c0019q.a(L2);
                    l0 l0Var2 = (l0) kVar.getOrDefault(L2, null);
                    if (l0Var2 == null) {
                        l0Var2 = l0.a();
                        kVar.put(L2, l0Var2);
                    }
                    l0Var2.f2554b = c0019q;
                    l0Var2.f2553a |= 4;
                    if (w2.f2439h && L2.l() && !L2.i() && !L2.p() && !L2.g()) {
                        eVar.d(J(L2), L2);
                    }
                }
            }
        }
        if (w2.f2441k) {
            int h3 = this.f1660f.h();
            for (int i45 = 0; i45 < h3; i45++) {
                a0 L3 = L(this.f1660f.g(i45));
                if (f1626x0 && L3.f2457c == -1 && !L3.i()) {
                    throw new IllegalStateException(V.d(this, new StringBuilder("view holder cannot have position -1 unless it is removed")));
                }
                if (!L3.p() && L3.d == -1) {
                    L3.d = L3.f2457c;
                }
            }
            boolean z11 = w2.f2437f;
            w2.f2437f = false;
            this.f1672m.d0(this.f1655c, w2);
            w2.f2437f = z11;
            for (int i46 = 0; i46 < this.f1660f.e(); i46++) {
                a0 L4 = L(this.f1660f.d(i46));
                if (!L4.p() && ((l0Var = (l0) kVar.getOrDefault(L4, null)) == null || (l0Var.f2553a & 4) == 0)) {
                    AbstractC0118F.b(L4);
                    boolean d = L4.d(8192);
                    AbstractC0118F abstractC0118F2 = this.f1637J;
                    L4.c();
                    abstractC0118F2.getClass();
                    C0019q c0019q2 = new C0019q();
                    c0019q2.a(L4);
                    if (d) {
                        X(L4, c0019q2);
                    } else {
                        l0 l0Var3 = (l0) kVar.getOrDefault(L4, null);
                        if (l0Var3 == null) {
                            l0Var3 = l0.a();
                            kVar.put(L4, l0Var3);
                        }
                        l0Var3.f2553a |= 2;
                        l0Var3.f2554b = c0019q2;
                    }
                }
            }
            m();
        } else {
            m();
        }
        T(true);
        i0(false);
        w2.d = 2;
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        J j2 = this.f1672m;
        if (j2 == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f1691w) {
            return;
        }
        boolean d = j2.d();
        boolean e2 = this.f1672m.e();
        if (d || e2) {
            if (!d) {
                i = 0;
            }
            if (!e2) {
                i2 = 0;
            }
            c0(i, i2, null, 0);
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
            this.f1694y |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(c0 c0Var) {
        this.l0 = c0Var;
        L.T.l(this, c0Var);
    }

    public void setAdapter(AbstractC0114B abstractC0114B) {
        setLayoutFrozen(false);
        AbstractC0114B abstractC0114B2 = this.f1671l;
        S s2 = this.f1653b;
        if (abstractC0114B2 != null) {
            abstractC0114B2.f2383a.unregisterObserver(s2);
            this.f1671l.getClass();
        }
        AbstractC0118F abstractC0118F = this.f1637J;
        if (abstractC0118F != null) {
            abstractC0118F.e();
        }
        J j2 = this.f1672m;
        P p2 = this.f1655c;
        if (j2 != null) {
            j2.i0(p2);
            this.f1672m.j0(p2);
        }
        p2.f2418a.clear();
        p2.f();
        I.d dVar = this.f1658e;
        dVar.j((ArrayList) dVar.f321c);
        dVar.j((ArrayList) dVar.d);
        AbstractC0114B abstractC0114B3 = this.f1671l;
        this.f1671l = abstractC0114B;
        if (abstractC0114B != null) {
            abstractC0114B.f2383a.registerObserver(s2);
        }
        J j3 = this.f1672m;
        if (j3 != null) {
            j3.Q();
        }
        AbstractC0114B abstractC0114B4 = this.f1671l;
        p2.f2418a.clear();
        p2.f();
        p2.e(abstractC0114B3, true);
        O c2 = p2.c();
        if (abstractC0114B3 != null) {
            c2.f2416b--;
        }
        if (c2.f2416b == 0) {
            int i = 0;
            while (true) {
                SparseArray sparseArray = c2.f2415a;
                if (i >= sparseArray.size()) {
                    break;
                }
                N n2 = (N) sparseArray.valueAt(i);
                Iterator it = n2.f2412a.iterator();
                while (it.hasNext()) {
                    A1.d.j(((a0) it.next()).f2455a);
                }
                n2.f2412a.clear();
                i++;
            }
        }
        if (abstractC0114B4 != null) {
            c2.f2416b++;
        }
        p2.d();
        this.f1659e0.f2437f = true;
        W(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC0116D interfaceC0116D) {
        if (interfaceC0116D == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z2) {
        if (z2 != this.f1664h) {
            this.f1636I = null;
            this.G = null;
            this.f1635H = null;
            this.f1634F = null;
        }
        this.f1664h = z2;
        super.setClipToPadding(z2);
        if (this.f1685t) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(AbstractC0117E abstractC0117E) {
        abstractC0117E.getClass();
        this.f1633E = abstractC0117E;
        this.f1636I = null;
        this.G = null;
        this.f1635H = null;
        this.f1634F = null;
    }

    public void setHasFixedSize(boolean z2) {
        this.f1683s = z2;
    }

    public void setItemAnimator(AbstractC0118F abstractC0118F) {
        AbstractC0118F abstractC0118F2 = this.f1637J;
        if (abstractC0118F2 != null) {
            abstractC0118F2.e();
            this.f1637J.f2386a = null;
        }
        this.f1637J = abstractC0118F;
        if (abstractC0118F != null) {
            abstractC0118F.f2386a = this.f1668j0;
        }
    }

    public void setItemViewCacheSize(int i) {
        P p2 = this.f1655c;
        p2.f2421e = i;
        p2.m();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(J j2) {
        RecyclerView recyclerView;
        C0140w c0140w;
        if (j2 == this.f1672m) {
            return;
        }
        setScrollState(0);
        Z z2 = this.f1654b0;
        z2.f2450g.removeCallbacks(z2);
        z2.f2447c.abortAnimation();
        J j3 = this.f1672m;
        if (j3 != null && (c0140w = j3.f2399e) != null) {
            c0140w.i();
        }
        J j4 = this.f1672m;
        P p2 = this.f1655c;
        if (j4 != null) {
            AbstractC0118F abstractC0118F = this.f1637J;
            if (abstractC0118F != null) {
                abstractC0118F.e();
            }
            this.f1672m.i0(p2);
            this.f1672m.j0(p2);
            p2.f2418a.clear();
            p2.f();
            if (this.f1681r) {
                J j5 = this.f1672m;
                j5.f2401g = false;
                j5.S(this);
            }
            this.f1672m.v0(null);
            this.f1672m = null;
        } else {
            p2.f2418a.clear();
            p2.f();
        }
        C0121c c0121c = this.f1660f;
        c0121c.f2477b.h();
        ArrayList arrayList = c0121c.f2478c;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = c0121c.f2476a.f2382a;
            if (size < 0) {
                break;
            }
            a0 L2 = L((View) arrayList.get(size));
            if (L2 != null) {
                int i = L2.f2468p;
                if (recyclerView.O()) {
                    L2.f2469q = i;
                    recyclerView.f1682r0.add(L2);
                } else {
                    WeakHashMap weakHashMap = L.T.f490a;
                    L2.f2455a.setImportantForAccessibility(i);
                }
                L2.f2468p = 0;
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
        this.f1672m = j2;
        if (j2 != null) {
            if (j2.f2397b != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(j2);
                sb.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(V.d(j2.f2397b, sb));
            }
            j2.v0(this);
            if (this.f1681r) {
                J j6 = this.f1672m;
                j6.f2401g = true;
                j6.R(this);
            }
        }
        p2.m();
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
            WeakHashMap weakHashMap = L.T.f490a;
            H.z(scrollingChildHelper.f551c);
        }
        scrollingChildHelper.d = z2;
    }

    public void setOnFlingListener(L l2) {
        this.f1646S = l2;
    }

    @Deprecated
    public void setOnScrollListener(M m2) {
        this.f1661f0 = m2;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.f1652a0 = z2;
    }

    public void setRecycledViewPool(O o2) {
        P p2 = this.f1655c;
        RecyclerView recyclerView = p2.f2424h;
        p2.e(recyclerView.f1671l, false);
        if (p2.f2423g != null) {
            r2.f2416b--;
        }
        p2.f2423g = o2;
        if (o2 != null && recyclerView.getAdapter() != null) {
            p2.f2423g.f2416b++;
        }
        p2.d();
    }

    @Deprecated
    public void setRecyclerListener(Q q2) {
    }

    public void setScrollState(int i) {
        C0140w c0140w;
        if (i == this.f1638K) {
            return;
        }
        if (f1627y0) {
            Log.d("RecyclerView", "setting scroll state to " + i + " from " + this.f1638K, new Exception());
        }
        this.f1638K = i;
        if (i != 2) {
            Z z2 = this.f1654b0;
            z2.f2450g.removeCallbacks(z2);
            z2.f2447c.abortAnimation();
            J j2 = this.f1672m;
            if (j2 != null && (c0140w = j2.f2399e) != null) {
                c0140w.i();
            }
        }
        J j3 = this.f1672m;
        if (j3 != null) {
            j3.h0(i);
        }
        M m2 = this.f1661f0;
        if (m2 != null) {
            m2.a(this, i);
        }
        ArrayList arrayList = this.f1663g0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((M) this.f1663g0.get(size)).a(this, i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.f1645R = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.f1645R = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(Y y2) {
        this.f1655c.getClass();
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
        C0140w c0140w;
        if (z2 != this.f1691w) {
            k("Do not suppressLayout in layout or scroll");
            if (!z2) {
                this.f1691w = false;
                if (this.f1689v && this.f1672m != null && this.f1671l != null) {
                    requestLayout();
                }
                this.f1689v = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, A0, A0, 0));
            this.f1691w = true;
            this.f1693x = true;
            setScrollState(0);
            Z z3 = this.f1654b0;
            z3.f2450g.removeCallbacks(z3);
            z3.f2447c.abortAnimation();
            J j2 = this.f1672m;
            if (j2 == null || (c0140w = j2.f2399e) == null) {
                return;
            }
            c0140w.i();
        }
    }

    public final void t() {
        h0();
        S();
        W w2 = this.f1659e0;
        w2.a(6);
        this.f1658e.b();
        w2.f2436e = this.f1671l.a();
        w2.f2435c = 0;
        if (this.d != null) {
            AbstractC0114B abstractC0114B = this.f1671l;
            int a2 = AbstractC0290e.a(abstractC0114B.f2385c);
            if (a2 == 1 ? abstractC0114B.a() > 0 : a2 != 2) {
                Parcelable parcelable = this.d.f2426c;
                if (parcelable != null) {
                    this.f1672m.f0(parcelable);
                }
                this.d = null;
            }
        }
        w2.f2438g = false;
        this.f1672m.d0(this.f1655c, w2);
        w2.f2437f = false;
        w2.f2440j = w2.f2440j && this.f1637J != null;
        w2.d = 4;
        T(true);
        i0(false);
    }

    public final boolean u(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().c(i, i2, iArr, iArr2, i3);
    }

    public final void v(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().d(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public final void w(int i, int i2) {
        this.f1632D++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        M m2 = this.f1661f0;
        if (m2 != null) {
            m2.b(this, i, i2);
        }
        ArrayList arrayList = this.f1663g0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((M) this.f1663g0.get(size)).b(this, i, i2);
            }
        }
        this.f1632D--;
    }

    public final void x() {
        if (this.f1636I != null) {
            return;
        }
        ((X) this.f1633E).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1636I = edgeEffect;
        if (this.f1664h) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void y() {
        if (this.f1634F != null) {
            return;
        }
        ((X) this.f1633E).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1634F = edgeEffect;
        if (this.f1664h) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void z() {
        if (this.f1635H != null) {
            return;
        }
        ((X) this.f1633E).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1635H = edgeEffect;
        if (this.f1664h) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArray;
        char c2;
        char c3;
        boolean z2;
        Object[] objArr;
        Constructor constructor;
        int i2 = 7;
        this.f1653b = new S(this);
        this.f1655c = new P(this);
        this.f1662g = new j(14);
        this.i = new Rect();
        this.f1667j = new Rect();
        this.f1669k = new RectF();
        this.f1674n = new ArrayList();
        this.f1676o = new ArrayList();
        this.f1678p = new ArrayList();
        this.f1687u = 0;
        this.f1629A = false;
        this.f1630B = false;
        this.f1631C = 0;
        this.f1632D = 0;
        this.f1633E = F0;
        C0128j c0128j = new C0128j();
        c0128j.f2386a = null;
        c0128j.f2387b = new ArrayList();
        c0128j.f2388c = 120L;
        c0128j.d = 120L;
        c0128j.f2389e = 250L;
        c0128j.f2390f = 250L;
        c0128j.f2530g = true;
        c0128j.f2531h = new ArrayList();
        c0128j.i = new ArrayList();
        c0128j.f2532j = new ArrayList();
        c0128j.f2533k = new ArrayList();
        c0128j.f2534l = new ArrayList();
        c0128j.f2535m = new ArrayList();
        c0128j.f2536n = new ArrayList();
        c0128j.f2537o = new ArrayList();
        c0128j.f2538p = new ArrayList();
        c0128j.f2539q = new ArrayList();
        c0128j.f2540r = new ArrayList();
        this.f1637J = c0128j;
        this.f1638K = 0;
        this.f1639L = -1;
        this.f1649V = Float.MIN_VALUE;
        this.f1650W = Float.MIN_VALUE;
        this.f1652a0 = true;
        this.f1654b0 = new Z(this);
        this.f1657d0 = f1623C0 ? new C0132n() : null;
        W w2 = new W();
        w2.f2433a = -1;
        w2.f2434b = 0;
        w2.f2435c = 0;
        w2.d = 1;
        w2.f2436e = 0;
        w2.f2437f = false;
        w2.f2438g = false;
        w2.f2439h = false;
        w2.i = false;
        w2.f2440j = false;
        w2.f2441k = false;
        this.f1659e0 = w2;
        this.f1665h0 = false;
        this.f1666i0 = false;
        C0113A c0113a = new C0113A(this);
        this.f1668j0 = c0113a;
        this.f1670k0 = false;
        this.f1673m0 = new int[2];
        this.f1677o0 = new int[2];
        this.p0 = new int[2];
        this.f1680q0 = new int[2];
        this.f1682r0 = new ArrayList();
        this.f1684s0 = new B(i2, this);
        this.f1688u0 = 0;
        this.f1690v0 = 0;
        this.f1692w0 = new C0113A(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1645R = viewConfiguration.getScaledTouchSlop();
        this.f1649V = U.a(viewConfiguration);
        this.f1650W = U.b(viewConfiguration);
        this.f1647T = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1648U = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f1651a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.f1637J.f2386a = c0113a;
        this.f1658e = new I.d(new C0113A(this));
        this.f1660f = new C0121c(new C0113A(this));
        WeakHashMap weakHashMap = L.T.f490a;
        if (L.J.c(this) == 0) {
            L.J.m(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f1695z = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new c0(this));
        int[] iArr = AbstractC0109a.f2378a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        L.T.k(this, context, iArr, attributeSet, obtainStyledAttributes, i);
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f1664h = obtainStyledAttributes.getBoolean(1, true);
        if (obtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException(V.d(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
            }
            Resources resources = getContext().getResources();
            typedArray = obtainStyledAttributes;
            c2 = 3;
            c3 = 2;
            new C0131m(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.winfour.winrandom.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.winfour.winrandom.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.winfour.winrandom.R.dimen.fastscroll_margin));
        } else {
            typedArray = obtainStyledAttributes;
            c2 = 3;
            c3 = 2;
        }
        typedArray.recycle();
        if (string != null) {
            String trim = string.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    trim = context.getPackageName() + trim;
                } else if (!trim.contains(".")) {
                    trim = RecyclerView.class.getPackage().getName() + '.' + trim;
                }
                String str = trim;
                try {
                    Class<? extends U> asSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(J.class);
                    try {
                        constructor = asSubclass.getConstructor(f1624D0);
                        objArr = new Object[4];
                        objArr[0] = context;
                        z2 = true;
                        try {
                            objArr[1] = attributeSet;
                            objArr[c3] = Integer.valueOf(i);
                            objArr[c2] = 0;
                        } catch (NoSuchMethodException e2) {
                            e = e2;
                            NoSuchMethodException noSuchMethodException = e;
                            objArr = null;
                            try {
                                constructor = asSubclass.getConstructor(null);
                                Object[] objArr2 = objArr;
                                constructor.setAccessible(z2);
                                setLayoutManager((J) constructor.newInstance(objArr2));
                                int[] iArr2 = f1628z0;
                                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
                                L.T.k(this, context, iArr2, attributeSet, obtainStyledAttributes2, i);
                                boolean z3 = obtainStyledAttributes2.getBoolean(0, z2);
                                obtainStyledAttributes2.recycle();
                                setNestedScrollingEnabled(z3);
                                setTag(com.winfour.winrandom.R.id.is_pooling_container_tag, Boolean.TRUE);
                            } catch (NoSuchMethodException e3) {
                                e3.initCause(noSuchMethodException);
                                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e3);
                            }
                        }
                    } catch (NoSuchMethodException e4) {
                        e = e4;
                        z2 = true;
                    }
                    Object[] objArr22 = objArr;
                    constructor.setAccessible(z2);
                    setLayoutManager((J) constructor.newInstance(objArr22));
                    int[] iArr22 = f1628z0;
                    TypedArray obtainStyledAttributes22 = context.obtainStyledAttributes(attributeSet, iArr22, i, 0);
                    L.T.k(this, context, iArr22, attributeSet, obtainStyledAttributes22, i);
                    boolean z32 = obtainStyledAttributes22.getBoolean(0, z2);
                    obtainStyledAttributes22.recycle();
                    setNestedScrollingEnabled(z32);
                    setTag(com.winfour.winrandom.R.id.is_pooling_container_tag, Boolean.TRUE);
                } catch (ClassCastException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e5);
                } catch (ClassNotFoundException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e6);
                } catch (IllegalAccessException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e7);
                } catch (InstantiationException e8) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e8);
                } catch (InvocationTargetException e9) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e9);
                }
            }
        }
        z2 = true;
        int[] iArr222 = f1628z0;
        TypedArray obtainStyledAttributes222 = context.obtainStyledAttributes(attributeSet, iArr222, i, 0);
        L.T.k(this, context, iArr222, attributeSet, obtainStyledAttributes222, i);
        boolean z322 = obtainStyledAttributes222.getBoolean(0, z2);
        obtainStyledAttributes222.recycle();
        setNestedScrollingEnabled(z322);
        setTag(com.winfour.winrandom.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        J j2 = this.f1672m;
        if (j2 != null) {
            return j2.t(layoutParams);
        }
        throw new IllegalStateException(V.d(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }
}
