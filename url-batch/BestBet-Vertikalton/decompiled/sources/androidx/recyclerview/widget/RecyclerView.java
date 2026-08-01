package androidx.recyclerview.widget;

import C0.i;
import E0.c;
import G.h;
import G1.AbstractC0001b;
import H.e;
import H1.l;
import J.b;
import K.C0016l;
import K.C0019o;
import K.F;
import K.S;
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
import f0.AbstractC0110a;
import g0.AbstractC0133C;
import g0.AbstractC0134D;
import g0.AbstractC0135E;
import g0.AbstractC0161z;
import g0.C0137a;
import g0.C0138b;
import g0.C0145i;
import g0.C0148l;
import g0.C0149m;
import g0.C0157v;
import g0.C0159x;
import g0.C0160y;
import g0.H;
import g0.I;
import g0.InterfaceC0132B;
import g0.J;
import g0.K;
import g0.L;
import g0.M;
import g0.N;
import g0.O;
import g0.P;
import g0.Q;
import g0.RunnableC0151o;
import g0.T;
import g0.U;
import g0.V;
import g0.W;
import g0.X;
import g0.Y;
import g0.a0;
import g0.i0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import o.k;
import q.AbstractC0309e;
import u0.C0385x;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* renamed from: D0, reason: collision with root package name */
    public static final Class[] f1940D0;

    /* renamed from: E0, reason: collision with root package name */
    public static final d f1941E0;

    /* renamed from: F0, reason: collision with root package name */
    public static final V f1942F0;

    /* renamed from: x0, reason: collision with root package name */
    public static boolean f1943x0 = false;

    /* renamed from: y0, reason: collision with root package name */
    public static boolean f1944y0 = false;

    /* renamed from: A, reason: collision with root package name */
    public boolean f1946A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f1947B;

    /* renamed from: C, reason: collision with root package name */
    public int f1948C;

    /* renamed from: D, reason: collision with root package name */
    public int f1949D;

    /* renamed from: E, reason: collision with root package name */
    public AbstractC0133C f1950E;
    public EdgeEffect F;

    /* renamed from: G, reason: collision with root package name */
    public EdgeEffect f1951G;

    /* renamed from: H, reason: collision with root package name */
    public EdgeEffect f1952H;

    /* renamed from: I, reason: collision with root package name */
    public EdgeEffect f1953I;

    /* renamed from: J, reason: collision with root package name */
    public AbstractC0134D f1954J;

    /* renamed from: K, reason: collision with root package name */
    public int f1955K;

    /* renamed from: L, reason: collision with root package name */
    public int f1956L;

    /* renamed from: M, reason: collision with root package name */
    public VelocityTracker f1957M;

    /* renamed from: N, reason: collision with root package name */
    public int f1958N;

    /* renamed from: O, reason: collision with root package name */
    public int f1959O;

    /* renamed from: P, reason: collision with root package name */
    public int f1960P;

    /* renamed from: Q, reason: collision with root package name */
    public int f1961Q;

    /* renamed from: R, reason: collision with root package name */
    public int f1962R;

    /* renamed from: S, reason: collision with root package name */
    public J f1963S;

    /* renamed from: T, reason: collision with root package name */
    public final int f1964T;

    /* renamed from: U, reason: collision with root package name */
    public final int f1965U;

    /* renamed from: V, reason: collision with root package name */
    public final float f1966V;

    /* renamed from: W, reason: collision with root package name */
    public final float f1967W;

    /* renamed from: a, reason: collision with root package name */
    public final float f1968a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f1969a0;

    /* renamed from: b, reason: collision with root package name */
    public final P f1970b;

    /* renamed from: b0, reason: collision with root package name */
    public final X f1971b0;

    /* renamed from: c, reason: collision with root package name */
    public final N f1972c;

    /* renamed from: c0, reason: collision with root package name */
    public RunnableC0151o f1973c0;
    public Q d;

    /* renamed from: d0, reason: collision with root package name */
    public final C0149m f1974d0;

    /* renamed from: e, reason: collision with root package name */
    public final e f1975e;

    /* renamed from: e0, reason: collision with root package name */
    public final U f1976e0;

    /* renamed from: f, reason: collision with root package name */
    public final C0138b f1977f;

    /* renamed from: f0, reason: collision with root package name */
    public K f1978f0;

    /* renamed from: g, reason: collision with root package name */
    public final C0385x f1979g;

    /* renamed from: g0, reason: collision with root package name */
    public ArrayList f1980g0;
    public boolean h;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f1981h0;
    public final Rect i;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f1982i0;

    /* renamed from: j, reason: collision with root package name */
    public final Rect f1983j;

    /* renamed from: j0, reason: collision with root package name */
    public final C0160y f1984j0;

    /* renamed from: k, reason: collision with root package name */
    public final RectF f1985k;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f1986k0;

    /* renamed from: l, reason: collision with root package name */
    public AbstractC0161z f1987l;

    /* renamed from: l0, reason: collision with root package name */
    public a0 f1988l0;

    /* renamed from: m, reason: collision with root package name */
    public H f1989m;

    /* renamed from: m0, reason: collision with root package name */
    public final int[] f1990m0;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f1991n;

    /* renamed from: n0, reason: collision with root package name */
    public C0016l f1992n0;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f1993o;
    public final int[] o0;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f1994p;

    /* renamed from: p0, reason: collision with root package name */
    public final int[] f1995p0;

    /* renamed from: q, reason: collision with root package name */
    public C0148l f1996q;

    /* renamed from: q0, reason: collision with root package name */
    public final int[] f1997q0;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1998r;

    /* renamed from: r0, reason: collision with root package name */
    public final ArrayList f1999r0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2000s;
    public final i s0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2001t;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f2002t0;

    /* renamed from: u, reason: collision with root package name */
    public int f2003u;

    /* renamed from: u0, reason: collision with root package name */
    public int f2004u0;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2005v;

    /* renamed from: v0, reason: collision with root package name */
    public int f2006v0;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2007w;

    /* renamed from: w0, reason: collision with root package name */
    public final C0160y f2008w0;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2009x;

    /* renamed from: y, reason: collision with root package name */
    public int f2010y;

    /* renamed from: z, reason: collision with root package name */
    public final AccessibilityManager f2011z;

    /* renamed from: z0, reason: collision with root package name */
    public static final int[] f1945z0 = {R.attr.nestedScrollingEnabled};

    /* renamed from: A0, reason: collision with root package name */
    public static final float f1937A0 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: B0, reason: collision with root package name */
    public static final boolean f1938B0 = true;

    /* renamed from: C0, reason: collision with root package name */
    public static final boolean f1939C0 = true;

    static {
        Class cls = Integer.TYPE;
        f1940D0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f1941E0 = new d(1);
        f1942F0 = new V();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.fortunequest.neontrack.R.attr.recyclerViewStyle);
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

    public static Y L(View view) {
        if (view == null) {
            return null;
        }
        return ((I) view.getLayoutParams()).f2736a;
    }

    private C0016l getScrollingChildHelper() {
        if (this.f1992n0 == null) {
            this.f1992n0 = new C0016l(this);
        }
        return this.f1992n0;
    }

    public static void l(Y y2) {
        WeakReference weakReference = y2.f2778b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == y2.f2777a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            y2.f2778b = null;
        }
    }

    public static int o(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && l.E(edgeEffect) != f1937A0) {
            int round = Math.round(l.X(edgeEffect, ((-i) * 4.0f) / i2, 0.5f) * ((-i2) / 4.0f));
            if (round != i) {
                edgeEffect.finish();
            }
            return i - round;
        }
        if (i >= 0 || edgeEffect2 == null || l.E(edgeEffect2) == f1937A0) {
            return i;
        }
        float f2 = i2;
        int round2 = Math.round(l.X(edgeEffect2, (i * 4.0f) / f2, 0.5f) * (f2 / 4.0f));
        if (round2 != i) {
            edgeEffect2.finish();
        }
        return i - round2;
    }

    public static void setDebugAssertionsEnabled(boolean z2) {
        f1943x0 = z2;
    }

    public static void setVerboseLoggingEnabled(boolean z2) {
        f1944y0 = z2;
    }

    public final void A() {
        if (this.f1951G != null) {
            return;
        }
        ((V) this.f1950E).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1951G = edgeEffect;
        if (this.h) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String B() {
        return " " + super.toString() + ", adapter:" + this.f1987l + ", layout:" + this.f1989m + ", context:" + getContext();
    }

    public final void C(U u2) {
        if (getScrollState() != 2) {
            u2.getClass();
            return;
        }
        OverScroller overScroller = this.f1971b0.f2772c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        u2.getClass();
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
        ArrayList arrayList = this.f1994p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0148l c0148l = (C0148l) arrayList.get(i);
            int i2 = c0148l.f2894v;
            if (i2 == 1) {
                boolean d = c0148l.d(motionEvent.getX(), motionEvent.getY());
                boolean c2 = c0148l.c(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0 && (d || c2)) {
                    if (c2) {
                        c0148l.f2895w = 1;
                        c0148l.f2888p = (int) motionEvent.getX();
                    } else if (d) {
                        c0148l.f2895w = 2;
                        c0148l.f2885m = (int) motionEvent.getY();
                    }
                    c0148l.f(2);
                    if (action == 3) {
                        this.f1996q = c0148l;
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
        int e2 = this.f1977f.e();
        if (e2 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < e2; i3++) {
            Y L2 = L(this.f1977f.d(i3));
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

    public final Y H(int i) {
        Y y2 = null;
        if (this.f1946A) {
            return null;
        }
        int h = this.f1977f.h();
        for (int i2 = 0; i2 < h; i2++) {
            Y L2 = L(this.f1977f.g(i2));
            if (L2 != null && !L2.i() && I(L2) == i) {
                if (!this.f1977f.f2800c.contains(L2.f2777a)) {
                    return L2;
                }
                y2 = L2;
            }
        }
        return y2;
    }

    public final int I(Y y2) {
        if (y2.d(524) || !y2.f()) {
            return -1;
        }
        e eVar = this.f1975e;
        int i = y2.f2779c;
        ArrayList arrayList = (ArrayList) eVar.f483c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0137a c0137a = (C0137a) arrayList.get(i2);
            int i3 = c0137a.f2794a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = c0137a.f2795b;
                    if (i4 <= i) {
                        int i5 = c0137a.f2796c;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = c0137a.f2795b;
                    if (i6 == i) {
                        i = c0137a.f2796c;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (c0137a.f2796c <= i) {
                            i++;
                        }
                    }
                }
            } else if (c0137a.f2795b <= i) {
                i += c0137a.f2796c;
            }
        }
        return i;
    }

    public final long J(Y y2) {
        return this.f1987l.f2956b ? y2.f2780e : y2.f2779c;
    }

    public final Y K(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return L(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect M(View view) {
        I i = (I) view.getLayoutParams();
        boolean z2 = i.f2738c;
        Rect rect = i.f2737b;
        if (!z2) {
            return rect;
        }
        if (this.f1976e0.f2764g && (i.f2736a.l() || i.f2736a.g())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.f1993o;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Rect rect2 = this.i;
            rect2.set(0, 0, 0, 0);
            ((AbstractC0135E) arrayList.get(i2)).getClass();
            ((I) view.getLayoutParams()).f2736a.getClass();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        i.f2738c = false;
        return rect;
    }

    public final boolean N() {
        return !this.f2001t || this.f1946A || this.f1975e.f();
    }

    public final boolean O() {
        return this.f1948C > 0;
    }

    public final void P(int i) {
        if (this.f1989m == null) {
            return;
        }
        setScrollState(2);
        this.f1989m.p0(i);
        awakenScrollBars();
    }

    public final void Q() {
        int h = this.f1977f.h();
        for (int i = 0; i < h; i++) {
            ((I) this.f1977f.g(i).getLayoutParams()).f2738c = true;
        }
        ArrayList arrayList = this.f1972c.f2747c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            I i3 = (I) ((Y) arrayList.get(i2)).f2777a.getLayoutParams();
            if (i3 != null) {
                i3.f2738c = true;
            }
        }
    }

    public final void R(int i, int i2, boolean z2) {
        int i3 = i + i2;
        int h = this.f1977f.h();
        for (int i4 = 0; i4 < h; i4++) {
            Y L2 = L(this.f1977f.g(i4));
            if (L2 != null && !L2.p()) {
                int i5 = L2.f2779c;
                U u2 = this.f1976e0;
                if (i5 >= i3) {
                    if (f1944y0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i4 + " holder " + L2 + " now at position " + (L2.f2779c - i2));
                    }
                    L2.m(-i2, z2);
                    u2.f2763f = true;
                } else if (i5 >= i) {
                    if (f1944y0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i4 + " holder " + L2 + " now REMOVED");
                    }
                    L2.a(8);
                    L2.m(-i2, z2);
                    L2.f2779c = i - 1;
                    u2.f2763f = true;
                }
            }
        }
        N n2 = this.f1972c;
        ArrayList arrayList = n2.f2747c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Y y2 = (Y) arrayList.get(size);
            if (y2 != null) {
                int i6 = y2.f2779c;
                if (i6 >= i3) {
                    if (f1944y0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + y2 + " now at position " + (y2.f2779c - i2));
                    }
                    y2.m(-i2, z2);
                } else if (i6 >= i) {
                    y2.a(8);
                    n2.g(size);
                }
            }
        }
        requestLayout();
    }

    public final void S() {
        this.f1948C++;
    }

    public final void T(boolean z2) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.f1948C - 1;
        this.f1948C = i2;
        if (i2 < 1) {
            if (f1943x0 && i2 < 0) {
                throw new IllegalStateException(AbstractC0001b.e(this, new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching")));
            }
            this.f1948C = 0;
            if (z2) {
                int i3 = this.f2010y;
                this.f2010y = 0;
                if (i3 != 0 && (accessibilityManager = this.f2011z) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(obtain);
                }
                ArrayList arrayList = this.f1999r0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    Y y2 = (Y) arrayList.get(size);
                    if (y2.f2777a.getParent() == this && !y2.p() && (i = y2.f2790q) != -1) {
                        WeakHashMap weakHashMap = K.Q.f578a;
                        y2.f2777a.setImportantForAccessibility(i);
                        y2.f2790q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void U(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1956L) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f1956L = motionEvent.getPointerId(i);
            int x2 = (int) (motionEvent.getX(i) + 0.5f);
            this.f1960P = x2;
            this.f1958N = x2;
            int y2 = (int) (motionEvent.getY(i) + 0.5f);
            this.f1961Q = y2;
            this.f1959O = y2;
        }
    }

    public final void V() {
        if (this.f1986k0 || !this.f1998r) {
            return;
        }
        WeakHashMap weakHashMap = K.Q.f578a;
        postOnAnimation(this.s0);
        this.f1986k0 = true;
    }

    public final void W(boolean z2) {
        this.f1947B = z2 | this.f1947B;
        this.f1946A = true;
        int h = this.f1977f.h();
        for (int i = 0; i < h; i++) {
            Y L2 = L(this.f1977f.g(i));
            if (L2 != null && !L2.p()) {
                L2.a(6);
            }
        }
        Q();
        N n2 = this.f1972c;
        ArrayList arrayList = n2.f2747c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Y y2 = (Y) arrayList.get(i2);
            if (y2 != null) {
                y2.a(6);
                y2.a(1024);
            }
        }
        AbstractC0161z abstractC0161z = n2.h.f1987l;
        if (abstractC0161z == null || !abstractC0161z.f2956b) {
            n2.f();
        }
    }

    public final void X(Y y2, C0019o c0019o) {
        y2.f2783j &= -8193;
        boolean z2 = this.f1976e0.h;
        C0385x c0385x = this.f1979g;
        if (z2 && y2.l() && !y2.i() && !y2.p()) {
            ((o.e) c0385x.f4232c).d(J(y2), y2);
        }
        k kVar = (k) c0385x.f4231b;
        i0 i0Var = (i0) kVar.getOrDefault(y2, null);
        if (i0Var == null) {
            i0Var = i0.a();
            kVar.put(y2, i0Var);
        }
        i0Var.f2867b = c0019o;
        i0Var.f2866a |= 4;
    }

    public final int Y(int i, float f2) {
        float height = f2 / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.F;
        float f3 = f1937A0;
        if (edgeEffect == null || l.E(edgeEffect) == f1937A0) {
            EdgeEffect edgeEffect2 = this.f1952H;
            if (edgeEffect2 != null && l.E(edgeEffect2) != f1937A0) {
                if (canScrollHorizontally(1)) {
                    this.f1952H.onRelease();
                } else {
                    float X2 = l.X(this.f1952H, width, height);
                    if (l.E(this.f1952H) == f1937A0) {
                        this.f1952H.onRelease();
                    }
                    f3 = X2;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.F.onRelease();
            } else {
                float f4 = -l.X(this.F, -width, 1.0f - height);
                if (l.E(this.F) == f1937A0) {
                    this.F.onRelease();
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
        EdgeEffect edgeEffect = this.f1951G;
        float f3 = f1937A0;
        if (edgeEffect == null || l.E(edgeEffect) == f1937A0) {
            EdgeEffect edgeEffect2 = this.f1953I;
            if (edgeEffect2 != null && l.E(edgeEffect2) != f1937A0) {
                if (canScrollVertically(1)) {
                    this.f1953I.onRelease();
                } else {
                    float X2 = l.X(this.f1953I, height, 1.0f - width);
                    if (l.E(this.f1953I) == f1937A0) {
                        this.f1953I.onRelease();
                    }
                    f3 = X2;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.f1951G.onRelease();
            } else {
                float f4 = -l.X(this.f1951G, -height, width);
                if (l.E(this.f1951G) == f1937A0) {
                    this.f1951G.onRelease();
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
        if (layoutParams instanceof I) {
            I i = (I) layoutParams;
            if (!i.f2738c) {
                int i2 = rect.left;
                Rect rect2 = i.f2737b;
                rect.left = i2 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f1989m.m0(this, view, this.i, !this.f2001t, view2 == null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        H h = this.f1989m;
        if (h != null) {
            h.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    public final void b0() {
        VelocityTracker velocityTracker = this.f1957M;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z2 = false;
        j0(0);
        EdgeEffect edgeEffect = this.F;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = this.F.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f1951G;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 |= this.f1951G.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1952H;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 |= this.f1952H.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1953I;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z2 |= this.f1953I.isFinished();
        }
        if (z2) {
            WeakHashMap weakHashMap = K.Q.f578a;
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
        AbstractC0161z abstractC0161z = this.f1987l;
        int[] iArr = this.f1997q0;
        if (abstractC0161z != null) {
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
        if (!this.f1993o.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        v(i4, i5, i6, i7, this.o0, i3, iArr);
        int i10 = iArr[0];
        int i11 = i6 - i10;
        int i12 = iArr[1];
        int i13 = i7 - i12;
        boolean z3 = (i10 == 0 && i12 == 0) ? false : true;
        int i14 = this.f1960P;
        int[] iArr2 = this.o0;
        int i15 = iArr2[0];
        this.f1960P = i14 - i15;
        int i16 = this.f1961Q;
        int i17 = iArr2[1];
        this.f1961Q = i16 - i17;
        int[] iArr3 = this.f1995p0;
        iArr3[0] = iArr3[0] + i15;
        iArr3[1] = iArr3[1] + i17;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && (motionEvent.getSource() & 8194) != 8194) {
                float x2 = motionEvent.getX();
                float f2 = i11;
                float y2 = motionEvent.getY();
                float f3 = i13;
                if (f2 < f1937A0) {
                    y();
                    l.X(this.F, (-f2) / getWidth(), 1.0f - (y2 / getHeight()));
                } else if (f2 > f1937A0) {
                    z();
                    l.X(this.f1952H, f2 / getWidth(), y2 / getHeight());
                } else {
                    z2 = false;
                    if (f3 >= f1937A0) {
                        A();
                        l.X(this.f1951G, (-f3) / getHeight(), x2 / getWidth());
                    } else {
                        if (f3 > f1937A0) {
                            x();
                            l.X(this.f1953I, f3 / getHeight(), 1.0f - (x2 / getWidth()));
                        }
                        if (!z2 || f2 != f1937A0 || f3 != f1937A0) {
                            WeakHashMap weakHashMap = K.Q.f578a;
                            postInvalidateOnAnimation();
                        }
                    }
                    z2 = true;
                    if (!z2) {
                    }
                    WeakHashMap weakHashMap2 = K.Q.f578a;
                    postInvalidateOnAnimation();
                }
                z2 = true;
                if (f3 >= f1937A0) {
                }
                z2 = true;
                if (!z2) {
                }
                WeakHashMap weakHashMap22 = K.Q.f578a;
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
        return (layoutParams instanceof I) && this.f1989m.f((I) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        H h = this.f1989m;
        if (h != null && h.d()) {
            return this.f1989m.j(this.f1976e0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        H h = this.f1989m;
        if (h != null && h.d()) {
            return this.f1989m.k(this.f1976e0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        H h = this.f1989m;
        if (h != null && h.d()) {
            return this.f1989m.l(this.f1976e0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        H h = this.f1989m;
        if (h != null && h.e()) {
            return this.f1989m.m(this.f1976e0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        H h = this.f1989m;
        if (h != null && h.e()) {
            return this.f1989m.n(this.f1976e0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        H h = this.f1989m;
        if (h != null && h.e()) {
            return this.f1989m.o(this.f1976e0);
        }
        return 0;
    }

    public final void d0(int i, int i2, int[] iArr) {
        Y y2;
        C0138b c0138b = this.f1977f;
        h0();
        S();
        int i3 = h.f291a;
        Trace.beginSection("RV Scroll");
        U u2 = this.f1976e0;
        C(u2);
        N n2 = this.f1972c;
        int o0 = i != 0 ? this.f1989m.o0(i, n2, u2) : 0;
        int q02 = i2 != 0 ? this.f1989m.q0(i2, n2, u2) : 0;
        Trace.endSection();
        int e2 = c0138b.e();
        for (int i4 = 0; i4 < e2; i4++) {
            View d = c0138b.d(i4);
            Y K2 = K(d);
            if (K2 != null && (y2 = K2.i) != null) {
                int left = d.getLeft();
                int top = d.getTop();
                View view = y2.f2777a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        T(true);
        i0(false);
        if (iArr != null) {
            iArr[0] = o0;
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
        ArrayList arrayList = this.f1993o;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i = 0; i < size; i++) {
            ((AbstractC0135E) arrayList.get(i)).b(canvas, this);
        }
        EdgeEffect edgeEffect = this.F;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.h ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, f1937A0);
            EdgeEffect edgeEffect2 = this.F;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f1951G;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.h) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f1951G;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f1952H;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.h ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f1952H;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f1953I;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.h) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f1953I;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(save4);
        }
        if ((z2 || this.f1954J == null || arrayList.size() <= 0 || !this.f1954J.f()) ? z2 : true) {
            WeakHashMap weakHashMap = K.Q.f578a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    public final void e0(int i) {
        C0157v c0157v;
        if (this.f2007w) {
            return;
        }
        setScrollState(0);
        X x2 = this.f1971b0;
        x2.f2775g.removeCallbacks(x2);
        x2.f2772c.abortAnimation();
        H h = this.f1989m;
        if (h != null && (c0157v = h.f2727e) != null) {
            c0157v.i();
        }
        H h2 = this.f1989m;
        if (h2 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            h2.p0(i);
            awakenScrollBars();
        }
    }

    public final boolean f0(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        float E2 = l.E(edgeEffect) * i2;
        float abs = Math.abs(-i) * 0.35f;
        float f2 = this.f1968a * 0.015f;
        double log = Math.log(abs / f2);
        double d = f1937A0;
        return ((float) (Math.exp((d / (d - 1.0d)) * log) * ((double) f2))) < E2;
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
        this.f1989m.getClass();
        boolean z3 = true;
        boolean z4 = (this.f1987l == null || this.f1989m == null || O() || this.f2007w) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        U u2 = this.f1976e0;
        N n2 = this.f1972c;
        if (z4 && (i == 2 || i == 1)) {
            if (this.f1989m.e()) {
                if (focusFinder.findNextFocus(this, view, i == 2 ? 130 : 33) == null) {
                    z2 = true;
                    if (!z2 && this.f1989m.d()) {
                        z2 = focusFinder.findNextFocus(this, view, !((this.f1989m.C() != 1) ^ (i != 2)) ? 66 : 17) != null;
                    }
                    if (z2) {
                        p();
                        if (D(view) == null) {
                            return null;
                        }
                        h0();
                        this.f1989m.T(view, i, n2, u2);
                        i0(false);
                    }
                    view2 = focusFinder.findNextFocus(this, view, i);
                }
            }
            z2 = false;
            if (!z2) {
                if (focusFinder.findNextFocus(this, view, !((this.f1989m.C() != 1) ^ (i != 2)) ? 66 : 17) != null) {
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
                view2 = this.f1989m.T(view, i, n2, u2);
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
                Rect rect2 = this.f1983j;
                rect2.set(0, 0, width2, height2);
                offsetDescendantRectToMyCoords(view, rect);
                offsetDescendantRectToMyCoords(view2, rect2);
                int i3 = this.f1989m.C() == 1 ? -1 : 1;
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
                                        throw new IllegalArgumentException(AbstractC0001b.e(this, sb));
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
        H h = this.f1989m;
        if (h == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f2007w) {
            return;
        }
        if (!h.d()) {
            i = 0;
        }
        if (!this.f1989m.e()) {
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
        this.f1971b0.c(i, i2, Integer.MIN_VALUE, null);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        H h = this.f1989m;
        if (h != null) {
            return h.r();
        }
        throw new IllegalStateException(AbstractC0001b.e(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        H h = this.f1989m;
        if (h != null) {
            return h.s(getContext(), attributeSet);
        }
        throw new IllegalStateException(AbstractC0001b.e(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC0161z getAdapter() {
        return this.f1987l;
    }

    @Override // android.view.View
    public int getBaseline() {
        H h = this.f1989m;
        if (h == null) {
            return super.getBaseline();
        }
        h.getClass();
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

    public a0 getCompatAccessibilityDelegate() {
        return this.f1988l0;
    }

    public AbstractC0133C getEdgeEffectFactory() {
        return this.f1950E;
    }

    public AbstractC0134D getItemAnimator() {
        return this.f1954J;
    }

    public int getItemDecorationCount() {
        return this.f1993o.size();
    }

    public H getLayoutManager() {
        return this.f1989m;
    }

    public int getMaxFlingVelocity() {
        return this.f1965U;
    }

    public int getMinFlingVelocity() {
        return this.f1964T;
    }

    public long getNanoTime() {
        if (f1939C0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public J getOnFlingListener() {
        return this.f1963S;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f1969a0;
    }

    public M getRecycledViewPool() {
        return this.f1972c.c();
    }

    public int getScrollState() {
        return this.f1955K;
    }

    public final void h(Y y2) {
        View view = y2.f2777a;
        boolean z2 = view.getParent() == this;
        this.f1972c.l(K(view));
        if (y2.k()) {
            this.f1977f.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z2) {
            this.f1977f.a(view, -1, true);
            return;
        }
        C0138b c0138b = this.f1977f;
        int indexOfChild = c0138b.f2798a.f2954a.indexOfChild(view);
        if (indexOfChild >= 0) {
            c0138b.f2799b.i(indexOfChild);
            c0138b.i(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final void h0() {
        int i = this.f2003u + 1;
        this.f2003u = i;
        if (i != 1 || this.f2007w) {
            return;
        }
        this.f2005v = false;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(AbstractC0135E abstractC0135E) {
        H h = this.f1989m;
        if (h != null) {
            h.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f1993o;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(abstractC0135E);
        Q();
        requestLayout();
    }

    public final void i0(boolean z2) {
        if (this.f2003u < 1) {
            if (f1943x0) {
                throw new IllegalStateException(AbstractC0001b.e(this, new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.")));
            }
            this.f2003u = 1;
        }
        if (!z2 && !this.f2007w) {
            this.f2005v = false;
        }
        if (this.f2003u == 1) {
            if (z2 && this.f2005v && !this.f2007w && this.f1989m != null && this.f1987l != null) {
                r();
            }
            if (!this.f2007w) {
                this.f2005v = false;
            }
        }
        this.f2003u--;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f1998r;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f2007w;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    public final void j(K k2) {
        if (this.f1980g0 == null) {
            this.f1980g0 = new ArrayList();
        }
        this.f1980g0.add(k2);
    }

    public final void j0(int i) {
        getScrollingChildHelper().h(i);
    }

    public final void k(String str) {
        if (O()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(AbstractC0001b.e(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        }
        if (this.f1949D > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(AbstractC0001b.e(this, new StringBuilder(""))));
        }
    }

    public final void m() {
        int h = this.f1977f.h();
        for (int i = 0; i < h; i++) {
            Y L2 = L(this.f1977f.g(i));
            if (!L2.p()) {
                L2.d = -1;
                L2.f2782g = -1;
            }
        }
        N n2 = this.f1972c;
        ArrayList arrayList = n2.f2747c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Y y2 = (Y) arrayList.get(i2);
            y2.d = -1;
            y2.f2782g = -1;
        }
        ArrayList arrayList2 = n2.f2745a;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            Y y3 = (Y) arrayList2.get(i3);
            y3.d = -1;
            y3.f2782g = -1;
        }
        ArrayList arrayList3 = n2.f2746b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                Y y4 = (Y) n2.f2746b.get(i4);
                y4.d = -1;
                y4.f2782g = -1;
            }
        }
    }

    public final void n(int i, int i2) {
        boolean z2;
        EdgeEffect edgeEffect = this.F;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z2 = false;
        } else {
            this.F.onRelease();
            z2 = this.F.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f1952H;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f1952H.onRelease();
            z2 |= this.f1952H.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1951G;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f1951G.onRelease();
            z2 |= this.f1951G.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1953I;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f1953I.onRelease();
            z2 |= this.f1953I.isFinished();
        }
        if (z2) {
            WeakHashMap weakHashMap = K.Q.f578a;
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
        this.f1948C = 0;
        this.f1998r = true;
        this.f2001t = this.f2001t && !isLayoutRequested();
        this.f1972c.d();
        H h = this.f1989m;
        if (h != null) {
            h.f2729g = true;
            h.R(this);
        }
        this.f1986k0 = false;
        if (f1939C0) {
            ThreadLocal threadLocal = RunnableC0151o.f2906e;
            RunnableC0151o runnableC0151o = (RunnableC0151o) threadLocal.get();
            this.f1973c0 = runnableC0151o;
            if (runnableC0151o == null) {
                RunnableC0151o runnableC0151o2 = new RunnableC0151o();
                runnableC0151o2.f2908a = new ArrayList();
                runnableC0151o2.d = new ArrayList();
                this.f1973c0 = runnableC0151o2;
                WeakHashMap weakHashMap = K.Q.f578a;
                Display display = getDisplay();
                if (!isInEditMode() && display != null) {
                    f2 = display.getRefreshRate();
                }
                f2 = 60.0f;
                RunnableC0151o runnableC0151o3 = this.f1973c0;
                runnableC0151o3.f2910c = (long) (1.0E9f / f2);
                threadLocal.set(runnableC0151o3);
            }
            RunnableC0151o runnableC0151o4 = this.f1973c0;
            runnableC0151o4.getClass();
            boolean z2 = f1943x0;
            ArrayList arrayList = runnableC0151o4.f2908a;
            if (z2 && arrayList.contains(this)) {
                throw new IllegalStateException("RecyclerView already present in worker list!");
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        N n2;
        RunnableC0151o runnableC0151o;
        C0157v c0157v;
        super.onDetachedFromWindow();
        AbstractC0134D abstractC0134D = this.f1954J;
        if (abstractC0134D != null) {
            abstractC0134D.e();
        }
        int i = 0;
        setScrollState(0);
        X x2 = this.f1971b0;
        x2.f2775g.removeCallbacks(x2);
        x2.f2772c.abortAnimation();
        H h = this.f1989m;
        if (h != null && (c0157v = h.f2727e) != null) {
            c0157v.i();
        }
        this.f1998r = false;
        H h2 = this.f1989m;
        if (h2 != null) {
            h2.f2729g = false;
            h2.S(this);
        }
        this.f1999r0.clear();
        removeCallbacks(this.s0);
        this.f1979g.getClass();
        while (i0.d.a() != null) {
        }
        int i2 = 0;
        while (true) {
            n2 = this.f1972c;
            ArrayList arrayList = n2.f2747c;
            if (i2 >= arrayList.size()) {
                break;
            }
            l.n(((Y) arrayList.get(i2)).f2777a);
            i2++;
        }
        n2.e(n2.h.f1987l, false);
        while (i < getChildCount()) {
            int i3 = i + 1;
            View childAt = getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            a aVar = (a) childAt.getTag(com.fortunequest.neontrack.R.id.pooling_container_listener_holder_tag);
            if (aVar == null) {
                aVar = new a();
                childAt.setTag(com.fortunequest.neontrack.R.id.pooling_container_listener_holder_tag, aVar);
            }
            ArrayList arrayList2 = aVar.f897a;
            int y02 = Y0.k.y0(arrayList2);
            if (-1 < y02) {
                arrayList2.get(y02).getClass();
                throw new ClassCastException();
            }
            i = i3;
        }
        if (!f1939C0 || (runnableC0151o = this.f1973c0) == null) {
            return;
        }
        boolean remove = runnableC0151o.f2908a.remove(this);
        if (f1943x0 && !remove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
        this.f1973c0 = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f1993o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0135E) arrayList.get(i)).a(this);
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
        H h;
        if (this.f1989m != null && !this.f2007w && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f2 = this.f1989m.e() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f1989m.d()) {
                    f3 = motionEvent.getAxisValue(10);
                    if (f2 == f1937A0 || f3 != f1937A0) {
                        int i = (int) (f3 * this.f1966V);
                        int i2 = (int) (f2 * this.f1967W);
                        h = this.f1989m;
                        if (h == null) {
                            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                        } else if (!this.f2007w) {
                            int[] iArr = this.f1997q0;
                            iArr[0] = 0;
                            iArr[1] = 0;
                            boolean d = h.d();
                            boolean e2 = this.f1989m.e();
                            int i3 = e2 ? (d ? 1 : 0) | 2 : d ? 1 : 0;
                            float y2 = motionEvent.getY();
                            float x2 = motionEvent.getX();
                            int Y2 = i - Y(i, y2);
                            int Z2 = i2 - Z(i2, x2);
                            getScrollingChildHelper().g(i3, 1);
                            if (u(d ? Y2 : 0, e2 ? Z2 : 0, this.f1997q0, this.o0, 1)) {
                                Y2 -= iArr[0];
                                Z2 -= iArr[1];
                            }
                            c0(d ? Y2 : 0, e2 ? Z2 : 0, motionEvent, 1);
                            RunnableC0151o runnableC0151o = this.f1973c0;
                            if (runnableC0151o != null && (Y2 != 0 || Z2 != 0)) {
                                runnableC0151o.a(this, Y2, Z2);
                            }
                            j0(1);
                        }
                    }
                }
                f3 = 0.0f;
                if (f2 == f1937A0) {
                }
                int i4 = (int) (f3 * this.f1966V);
                int i22 = (int) (f2 * this.f1967W);
                h = this.f1989m;
                if (h == null) {
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f1989m.e()) {
                        f2 = -axisValue;
                        f3 = 0.0f;
                        if (f2 == f1937A0) {
                        }
                        int i42 = (int) (f3 * this.f1966V);
                        int i222 = (int) (f2 * this.f1967W);
                        h = this.f1989m;
                        if (h == null) {
                        }
                    } else if (this.f1989m.d()) {
                        f3 = axisValue;
                        f2 = 0.0f;
                        if (f2 == f1937A0) {
                        }
                        int i422 = (int) (f3 * this.f1966V);
                        int i2222 = (int) (f2 * this.f1967W);
                        h = this.f1989m;
                        if (h == null) {
                        }
                    }
                }
                f2 = 0.0f;
                f3 = 0.0f;
                if (f2 == f1937A0) {
                }
                int i4222 = (int) (f3 * this.f1966V);
                int i22222 = (int) (f2 * this.f1967W);
                h = this.f1989m;
                if (h == null) {
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
        if (this.f2007w) {
            return false;
        }
        this.f1996q = null;
        if (E(motionEvent)) {
            b0();
            setScrollState(0);
            return true;
        }
        H h = this.f1989m;
        if (h == null) {
            return false;
        }
        boolean d = h.d();
        boolean e2 = this.f1989m.e();
        if (this.f1957M == null) {
            this.f1957M = VelocityTracker.obtain();
        }
        this.f1957M.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f2009x) {
                this.f2009x = false;
            }
            this.f1956L = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.f1960P = x2;
            this.f1958N = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.f1961Q = y2;
            this.f1959O = y2;
            EdgeEffect edgeEffect = this.F;
            if (edgeEffect == null || l.E(edgeEffect) == f1937A0 || canScrollHorizontally(-1)) {
                z2 = false;
            } else {
                l.X(this.F, f1937A0, 1.0f - (motionEvent.getY() / getHeight()));
                z2 = true;
            }
            EdgeEffect edgeEffect2 = this.f1952H;
            boolean z4 = z2;
            if (edgeEffect2 != null) {
                z4 = z2;
                if (l.E(edgeEffect2) != f1937A0) {
                    z4 = z2;
                    if (!canScrollHorizontally(1)) {
                        l.X(this.f1952H, f1937A0, motionEvent.getY() / getHeight());
                        z4 = true;
                    }
                }
            }
            EdgeEffect edgeEffect3 = this.f1951G;
            boolean z5 = z4;
            if (edgeEffect3 != null) {
                z5 = z4;
                if (l.E(edgeEffect3) != f1937A0) {
                    z5 = z4;
                    if (!canScrollVertically(-1)) {
                        l.X(this.f1951G, f1937A0, motionEvent.getX() / getWidth());
                        z5 = true;
                    }
                }
            }
            EdgeEffect edgeEffect4 = this.f1953I;
            boolean z6 = z5;
            if (edgeEffect4 != null) {
                z6 = z5;
                if (l.E(edgeEffect4) != f1937A0) {
                    z6 = z5;
                    if (!canScrollVertically(1)) {
                        l.X(this.f1953I, f1937A0, 1.0f - (motionEvent.getX() / getWidth()));
                        z6 = true;
                    }
                }
            }
            if (z6 || this.f1955K == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                j0(1);
            }
            int[] iArr = this.f1995p0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i = d;
            if (e2) {
                i = (d ? 1 : 0) | 2;
            }
            getScrollingChildHelper().g(i, 0);
        } else if (actionMasked == 1) {
            this.f1957M.clear();
            j0(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f1956L);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f1956L + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f1955K != 1) {
                int i2 = x3 - this.f1958N;
                int i3 = y3 - this.f1959O;
                if (d == 0 || Math.abs(i2) <= this.f1962R) {
                    z3 = false;
                } else {
                    this.f1960P = x3;
                    z3 = true;
                }
                if (e2 && Math.abs(i3) > this.f1962R) {
                    this.f1961Q = y3;
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
            this.f1956L = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f1960P = x4;
            this.f1958N = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f1961Q = y4;
            this.f1959O = y4;
        } else if (actionMasked == 6) {
            U(motionEvent);
        }
        return this.f1955K == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int i5 = h.f291a;
        Trace.beginSection("RV OnLayout");
        r();
        Trace.endSection();
        this.f2001t = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        H h = this.f1989m;
        if (h == null) {
            q(i, i2);
            return;
        }
        boolean L2 = h.L();
        boolean z2 = false;
        U u2 = this.f1976e0;
        if (!L2) {
            if (this.f2000s) {
                this.f1989m.f2725b.q(i, i2);
                return;
            }
            if (u2.f2766k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            AbstractC0161z abstractC0161z = this.f1987l;
            if (abstractC0161z != null) {
                u2.f2762e = abstractC0161z.a();
            } else {
                u2.f2762e = 0;
            }
            h0();
            this.f1989m.f2725b.q(i, i2);
            i0(false);
            u2.f2764g = false;
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.f1989m.f2725b.q(i, i2);
        if (mode == 1073741824 && mode2 == 1073741824) {
            z2 = true;
        }
        this.f2002t0 = z2;
        if (z2 || this.f1987l == null) {
            return;
        }
        if (u2.d == 1) {
            s();
        }
        this.f1989m.s0(i, i2);
        u2.i = true;
        t();
        this.f1989m.u0(i, i2);
        if (this.f1989m.x0()) {
            this.f1989m.s0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            u2.i = true;
            t();
            this.f1989m.u0(i, i2);
        }
        this.f2004u0 = getMeasuredWidth();
        this.f2006v0 = getMeasuredHeight();
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
        if (!(parcelable instanceof Q)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Q q2 = (Q) parcelable;
        this.d = q2;
        super.onRestoreInstanceState(q2.f986a);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Q q2 = new Q(super.onSaveInstanceState());
        Q q3 = this.d;
        if (q3 != null) {
            q2.f2752c = q3.f2752c;
        } else {
            H h = this.f1989m;
            if (h != null) {
                q2.f2752c = h.g0();
            } else {
                q2.f2752c = null;
            }
        }
        return q2;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.f1953I = null;
        this.f1951G = null;
        this.f1952H = null;
        this.F = null;
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
        X x2;
        float f2;
        float f3;
        X x3;
        MotionEvent motionEvent4;
        int minFlingVelocity;
        boolean z3;
        int H2;
        PointF a2;
        X x4;
        int i3;
        RecyclerView recyclerView2;
        boolean z4;
        if (this.f2007w || this.f2009x) {
            return false;
        }
        C0148l c0148l = this.f1996q;
        if (c0148l == null) {
            z2 = motionEvent.getAction() == 0 ? false : E(motionEvent);
        } else {
            if (c0148l.f2894v != 0) {
                if (motionEvent.getAction() == 0) {
                    boolean d = c0148l.d(motionEvent.getX(), motionEvent.getY());
                    boolean c2 = c0148l.c(motionEvent.getX(), motionEvent.getY());
                    if (d || c2) {
                        if (c2) {
                            c0148l.f2895w = 1;
                            c0148l.f2888p = (int) motionEvent.getX();
                        } else if (d) {
                            c0148l.f2895w = 2;
                            c0148l.f2885m = (int) motionEvent.getY();
                        }
                        c0148l.f(2);
                    }
                } else if (motionEvent.getAction() == 1 && c0148l.f2894v == 2) {
                    c0148l.f2885m = f1937A0;
                    c0148l.f2888p = f1937A0;
                    c0148l.f(1);
                    c0148l.f2895w = 0;
                } else if (motionEvent.getAction() == 2 && c0148l.f2894v == 2) {
                    c0148l.g();
                    int i4 = c0148l.f2895w;
                    int i5 = c0148l.f2877b;
                    if (i4 == 1) {
                        float x5 = motionEvent.getX();
                        int[] iArr = c0148l.f2897y;
                        iArr[0] = i5;
                        int i6 = c0148l.f2889q - i5;
                        iArr[1] = i6;
                        float max = Math.max(i5, Math.min(i6, x5));
                        if (Math.abs(c0148l.f2887o - max) >= 2.0f) {
                            int e2 = C0148l.e(c0148l.f2888p, max, iArr, c0148l.f2891s.computeHorizontalScrollRange(), c0148l.f2891s.computeHorizontalScrollOffset(), c0148l.f2889q);
                            if (e2 != 0) {
                                c0148l.f2891s.scrollBy(e2, 0);
                            }
                            c0148l.f2888p = max;
                        }
                    }
                    if (c0148l.f2895w == 2) {
                        float y2 = motionEvent.getY();
                        int[] iArr2 = c0148l.f2896x;
                        iArr2[0] = i5;
                        int i7 = c0148l.f2890r - i5;
                        iArr2[1] = i7;
                        float max2 = Math.max(i5, Math.min(i7, y2));
                        if (Math.abs(c0148l.f2884l - max2) >= 2.0f) {
                            int e3 = C0148l.e(c0148l.f2885m, max2, iArr2, c0148l.f2891s.computeVerticalScrollRange(), c0148l.f2891s.computeVerticalScrollOffset(), c0148l.f2890r);
                            if (e3 != 0) {
                                c0148l.f2891s.scrollBy(0, e3);
                            }
                            c0148l.f2885m = max2;
                        }
                    }
                }
            }
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.f1996q = null;
            }
            z2 = true;
        }
        if (z2) {
            b0();
            setScrollState(0);
            return true;
        }
        H h = this.f1989m;
        if (h == null) {
            return false;
        }
        boolean d2 = h.d();
        boolean e4 = this.f1989m.e();
        if (this.f1957M == null) {
            this.f1957M = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        int[] iArr3 = this.f1995p0;
        if (actionMasked == 0) {
            iArr3[1] = 0;
            iArr3[0] = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(iArr3[0], iArr3[1]);
        if (actionMasked == 0) {
            recyclerView = this;
            motionEvent2 = obtain;
            recyclerView.f1956L = motionEvent.getPointerId(0);
            int x6 = (int) (motionEvent.getX() + 0.5f);
            recyclerView.f1960P = x6;
            recyclerView.f1958N = x6;
            int y3 = (int) (motionEvent.getY() + 0.5f);
            recyclerView.f1961Q = y3;
            recyclerView.f1959O = y3;
            int i8 = d2;
            if (e4) {
                i8 = (d2 ? 1 : 0) | 2;
            }
            getScrollingChildHelper().g(i8, 0);
        } else {
            if (actionMasked == 1) {
                this.f1957M.addMovement(obtain);
                VelocityTracker velocityTracker = this.f1957M;
                int i9 = this.f1965U;
                velocityTracker.computeCurrentVelocity(1000, i9);
                float f4 = d2 != 0 ? -this.f1957M.getXVelocity(this.f1956L) : 0.0f;
                float f5 = e4 ? -this.f1957M.getYVelocity(this.f1956L) : 0.0f;
                if (f4 == f1937A0 && f5 == f1937A0) {
                    recyclerView2 = this;
                    i3 = 0;
                    motionEvent4 = obtain;
                } else {
                    int i10 = (int) f4;
                    int i11 = (int) f5;
                    H h2 = this.f1989m;
                    if (h2 == null) {
                        Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                    } else if (!this.f2007w) {
                        int d3 = h2.d();
                        boolean e5 = this.f1989m.e();
                        int i12 = this.f1964T;
                        if (d3 == 0 || Math.abs(i10) < i12) {
                            i10 = 0;
                        }
                        if (!e5 || Math.abs(i11) < i12) {
                            i11 = 0;
                        }
                        if (i10 != 0 || i11 != 0) {
                            if (i10 != 0) {
                                EdgeEffect edgeEffect = this.F;
                                if (edgeEffect == null || l.E(edgeEffect) == f1937A0) {
                                    EdgeEffect edgeEffect2 = this.f1952H;
                                    if (edgeEffect2 != null && l.E(edgeEffect2) != f1937A0) {
                                        if (f0(this.f1952H, i10, getWidth())) {
                                            this.f1952H.onAbsorb(i10);
                                            i10 = 0;
                                        }
                                        i = i10;
                                        i10 = 0;
                                    }
                                } else {
                                    int i13 = -i10;
                                    if (f0(this.F, i13, getWidth())) {
                                        this.F.onAbsorb(i13);
                                        i10 = 0;
                                    }
                                    i = i10;
                                    i10 = 0;
                                }
                                if (i11 != 0) {
                                    EdgeEffect edgeEffect3 = this.f1951G;
                                    if (edgeEffect3 == null || l.E(edgeEffect3) == f1937A0) {
                                        EdgeEffect edgeEffect4 = this.f1953I;
                                        if (edgeEffect4 != null && l.E(edgeEffect4) != f1937A0) {
                                            if (f0(this.f1953I, i11, getHeight())) {
                                                this.f1953I.onAbsorb(i11);
                                                i11 = 0;
                                            }
                                            i2 = 0;
                                        }
                                    } else {
                                        int i14 = -i11;
                                        if (f0(this.f1951G, i14, getHeight())) {
                                            this.f1951G.onAbsorb(i14);
                                            i11 = 0;
                                        }
                                        i2 = 0;
                                    }
                                    x2 = this.f1971b0;
                                    if (i == 0 || i11 != 0) {
                                        int i15 = -i9;
                                        i = Math.max(i15, Math.min(i, i9));
                                        i11 = Math.max(i15, Math.min(i11, i9));
                                        x2.a(i, i11);
                                    }
                                    if (i10 == 0 || i2 != 0) {
                                        f2 = i10;
                                        f3 = i2;
                                        if (!dispatchNestedPreFling(f2, f3)) {
                                            boolean z5 = d3 != 0 || e5;
                                            dispatchNestedFling(f2, f3, z5);
                                            J j2 = this.f1963S;
                                            if (j2 != null) {
                                                C0159x c0159x = (C0159x) j2;
                                                H layoutManager = c0159x.f2951a.getLayoutManager();
                                                if (layoutManager != 0 && c0159x.f2951a.getAdapter() != null && ((Math.abs(i2) > (minFlingVelocity = c0159x.f2951a.getMinFlingVelocity()) || Math.abs(i10) > minFlingVelocity) && ((z3 = layoutManager instanceof T)))) {
                                                    c cVar = !z3 ? null : new c(c0159x, c0159x.f2951a.getContext(), 1);
                                                    if (cVar != null) {
                                                        int B2 = layoutManager.B();
                                                        if (B2 != 0) {
                                                            g e6 = layoutManager.e() ? c0159x.e(layoutManager) : layoutManager.d() ? c0159x.d(layoutManager) : null;
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
                                                                        x4 = x2;
                                                                    } else {
                                                                        x4 = x2;
                                                                        int b2 = C0159x.b(u2, e6);
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
                                                                    x2 = x4;
                                                                }
                                                                x3 = x2;
                                                                boolean z6 = !layoutManager.d() ? i2 <= 0 : i10 <= 0;
                                                                if (z6 && view != null) {
                                                                    H2 = H.H(view);
                                                                } else if (z6 || view2 == null) {
                                                                    if (z6) {
                                                                        view = view2;
                                                                    }
                                                                    if (view != null) {
                                                                        H2 = ((z3 && (a2 = ((T) layoutManager).a(layoutManager.B() - 1)) != null && ((a2.x > f1937A0 ? 1 : (a2.x == f1937A0 ? 0 : -1)) < 0 || (a2.y > f1937A0 ? 1 : (a2.y == f1937A0 ? 0 : -1)) < 0)) == z6 ? -1 : 1) + H.H(view);
                                                                        if (H2 >= 0) {
                                                                        }
                                                                    }
                                                                    H2 = -1;
                                                                } else {
                                                                    H2 = H.H(view2);
                                                                }
                                                                if (H2 != -1) {
                                                                    cVar.f2938a = H2;
                                                                    layoutManager.A0(cVar);
                                                                }
                                                                if (z5) {
                                                                    if (e5) {
                                                                        d3 = (d3 == true ? 1 : 0) | 2;
                                                                    }
                                                                    getScrollingChildHelper().g(d3, 1);
                                                                    int i20 = -i9;
                                                                    x3.a(Math.max(i20, Math.min(i10, i9)), Math.max(i20, Math.min(i2, i9)));
                                                                }
                                                                i3 = 0;
                                                                recyclerView2 = this;
                                                            }
                                                        }
                                                        x3 = x2;
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
                                            x3 = x2;
                                            motionEvent4 = obtain;
                                            if (z5) {
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
                                x2 = this.f1971b0;
                                if (i == 0) {
                                }
                                int i152 = -i9;
                                i = Math.max(i152, Math.min(i, i9));
                                i11 = Math.max(i152, Math.min(i11, i9));
                                x2.a(i, i11);
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
                            x2 = this.f1971b0;
                            if (i == 0) {
                            }
                            int i1522 = -i9;
                            i = Math.max(i1522, Math.min(i, i9));
                            i11 = Math.max(i1522, Math.min(i11, i9));
                            x2.a(i, i11);
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
                int findPointerIndex = motionEvent.findPointerIndex(this.f1956L);
                if (findPointerIndex < 0) {
                    Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f1956L + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                int x7 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                int y4 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                int i21 = this.f1960P - x7;
                int i22 = this.f1961Q - y4;
                if (this.f1955K != 1) {
                    if (d2 != 0) {
                        i21 = i21 > 0 ? Math.max(0, i21 - this.f1962R) : Math.min(0, i21 + this.f1962R);
                        if (i21 != 0) {
                            z4 = true;
                            if (e4) {
                                i22 = i22 > 0 ? Math.max(0, i22 - this.f1962R) : Math.min(0, i22 + this.f1962R);
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
                if (this.f1955K == 1) {
                    int[] iArr4 = this.f1997q0;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    int Y2 = i21 - Y(i21, motionEvent.getY());
                    int Z2 = i22 - Z(i22, motionEvent.getX());
                    boolean u3 = u(d2 != 0 ? Y2 : 0, e4 ? Z2 : 0, this.f1997q0, this.o0, 0);
                    int[] iArr5 = this.o0;
                    if (u3) {
                        Y2 -= iArr4[0];
                        Z2 -= iArr4[1];
                        iArr3[0] = iArr3[0] + iArr5[0];
                        iArr3[1] = iArr3[1] + iArr5[1];
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int i23 = Y2;
                    int i24 = Z2;
                    this.f1960P = x7 - iArr5[0];
                    this.f1961Q = y4 - iArr5[1];
                    if (c0(d2 != 0 ? i23 : 0, e4 ? i24 : 0, motionEvent, 0)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    RunnableC0151o runnableC0151o = this.f1973c0;
                    if (runnableC0151o != null && (i23 != 0 || i24 != 0)) {
                        runnableC0151o.a(this, i23, i24);
                    }
                }
            } else if (actionMasked == 3) {
                b0();
                setScrollState(0);
            } else if (actionMasked == 5) {
                this.f1956L = motionEvent.getPointerId(actionIndex);
                int x8 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.f1960P = x8;
                this.f1958N = x8;
                int y5 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.f1961Q = y5;
                this.f1959O = y5;
            } else if (actionMasked == 6) {
                U(motionEvent);
            }
            recyclerView = this;
            motionEvent2 = obtain;
        }
        motionEvent3 = motionEvent2;
        recyclerView.f1957M.addMovement(motionEvent3);
        motionEvent3.recycle();
        return true;
    }

    public final void p() {
        e eVar = this.f1975e;
        if (!this.f2001t || this.f1946A) {
            int i = h.f291a;
            Trace.beginSection("RV FullInvalidate");
            r();
            Trace.endSection();
            return;
        }
        if (eVar.f()) {
            eVar.getClass();
            if (eVar.f()) {
                int i2 = h.f291a;
                Trace.beginSection("RV FullInvalidate");
                r();
                Trace.endSection();
            }
        }
    }

    public final void q(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = K.Q.f578a;
        setMeasuredDimension(H.g(i, paddingRight, getMinimumWidth()), H.g(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x0332, code lost:
    
        if (r19.f1977f.f2800c.contains(getFocusedChild()) == false) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x038d, code lost:
    
        if (r6.hasFocusable() != false) goto L190;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [g0.Y] */
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
        C0019o c0019o;
        int i;
        RecyclerView recyclerView;
        boolean g2;
        if (this.f1987l == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f1989m == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        U u2 = this.f1976e0;
        u2.i = false;
        boolean z3 = this.f2002t0 && !(this.f2004u0 == getWidth() && this.f2006v0 == getHeight());
        this.f2004u0 = 0;
        this.f2006v0 = 0;
        this.f2002t0 = false;
        if (u2.d == 1) {
            s();
            this.f1989m.r0(this);
            t();
        } else {
            e eVar = this.f1975e;
            if ((((ArrayList) eVar.d).isEmpty() || ((ArrayList) eVar.f483c).isEmpty()) && !z3 && this.f1989m.f2734n == getWidth() && this.f1989m.f2735o == getHeight()) {
                this.f1989m.r0(this);
            } else {
                this.f1989m.r0(this);
                t();
            }
        }
        u2.a(4);
        h0();
        S();
        u2.d = 1;
        boolean z4 = u2.f2765j;
        View view2 = null;
        Long l2 = null;
        N n2 = this.f1972c;
        C0385x c0385x = this.f1979g;
        if (z4) {
            int e2 = this.f1977f.e() - 1;
            while (e2 >= 0) {
                Y L2 = L(this.f1977f.d(e2));
                if (!L2.p()) {
                    long J2 = J(L2);
                    this.f1954J.getClass();
                    C0019o c0019o2 = new C0019o();
                    c0019o2.a(L2);
                    Y y2 = (Y) ((o.e) c0385x.f4232c).c(J2, l2);
                    if (y2 == null || y2.p()) {
                        c0385x.c(L2, c0019o2);
                    } else {
                        k kVar = (k) c0385x.f4231b;
                        i0 i0Var = (i0) kVar.getOrDefault(y2, l2);
                        boolean z5 = (i0Var == null || (i0Var.f2866a & 1) == 0) ? false : true;
                        i0 i0Var2 = (i0) kVar.getOrDefault(L2, l2);
                        boolean z6 = (i0Var2 == null || (i0Var2.f2866a & 1) == 0) ? false : true;
                        if (z5 && y2 == L2) {
                            c0385x.c(L2, c0019o2);
                        } else {
                            C0019o B2 = c0385x.B(y2, 4);
                            c0385x.c(L2, c0019o2);
                            C0019o B3 = c0385x.B(L2, 8);
                            if (B2 == null) {
                                int e3 = this.f1977f.e();
                                for (int i2 = 0; i2 < e3; i2++) {
                                    Y L3 = L(this.f1977f.d(i2));
                                    if (L3 != L2 && J(L3) == J2) {
                                        AbstractC0161z abstractC0161z = this.f1987l;
                                        if (abstractC0161z == null || !abstractC0161z.f2956b) {
                                            StringBuilder sb = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                                            sb.append(L3);
                                            sb.append(" \n View Holder 2:");
                                            sb.append(L2);
                                            throw new IllegalStateException(AbstractC0001b.e(this, sb));
                                        }
                                        StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                                        sb2.append(L3);
                                        sb2.append(" \n View Holder 2:");
                                        sb2.append(L2);
                                        throw new IllegalStateException(AbstractC0001b.e(this, sb2));
                                    }
                                }
                                Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + y2 + " cannot be found but it is necessary for " + L2 + B());
                            } else {
                                y2.o(false);
                                if (z5) {
                                    h(y2);
                                }
                                if (y2 != L2) {
                                    if (z6) {
                                        h(L2);
                                    }
                                    y2.h = L2;
                                    h(y2);
                                    n2.l(y2);
                                    L2.o(false);
                                    L2.i = y2;
                                }
                                if (this.f1954J.a(y2, L2, B2, B3)) {
                                    V();
                                }
                            }
                        }
                    }
                }
                e2--;
                l2 = null;
            }
            k kVar2 = (k) c0385x.f4231b;
            for (int i3 = kVar2.f3591c - 1; i3 >= 0; i3--) {
                Y y3 = (Y) kVar2.h(i3);
                i0 i0Var3 = (i0) kVar2.i(i3);
                int i4 = i0Var3.f2866a;
                int i5 = i4 & 3;
                C0160y c0160y = this.f2008w0;
                if (i5 == 3) {
                    RecyclerView recyclerView2 = c0160y.f2954a;
                    recyclerView2.f1989m.k0(y3.f2777a, recyclerView2.f1972c);
                } else if ((i4 & 1) != 0) {
                    C0019o c0019o3 = i0Var3.f2867b;
                    if (c0019o3 == null) {
                        RecyclerView recyclerView3 = c0160y.f2954a;
                        recyclerView3.f1989m.k0(y3.f2777a, recyclerView3.f1972c);
                    } else {
                        c0160y.g(y3, c0019o3, i0Var3.f2868c);
                    }
                } else if ((i4 & 14) == 14) {
                    c0160y.f(y3, i0Var3.f2867b, i0Var3.f2868c);
                } else if ((i4 & 12) == 12) {
                    C0019o c0019o4 = i0Var3.f2867b;
                    C0019o c0019o5 = i0Var3.f2868c;
                    c0160y.getClass();
                    y3.o(false);
                    RecyclerView recyclerView4 = c0160y.f2954a;
                    if (!recyclerView4.f1946A) {
                        C0145i c0145i = (C0145i) recyclerView4.f1954J;
                        c0145i.getClass();
                        int i6 = c0019o4.f641a;
                        int i7 = c0019o5.f641a;
                        if (i6 == i7 && c0019o4.f642b == c0019o5.f642b) {
                            c0145i.c(y3);
                            recyclerView = recyclerView4;
                            g2 = false;
                        } else {
                            recyclerView = recyclerView4;
                            g2 = c0145i.g(y3, i6, c0019o4.f642b, i7, c0019o5.f642b);
                        }
                        if (g2) {
                            recyclerView.V();
                        }
                    } else if (recyclerView4.f1954J.a(y3, y3, c0019o4, c0019o5)) {
                        recyclerView4.V();
                    }
                } else {
                    if ((i4 & 4) != 0) {
                        c0019o = null;
                        c0160y.g(y3, i0Var3.f2867b, null);
                    } else {
                        c0019o = null;
                        if ((i4 & 8) != 0) {
                            c0160y.f(y3, i0Var3.f2867b, i0Var3.f2868c);
                        }
                    }
                    i = 0;
                    i0Var3.f2866a = i;
                    i0Var3.f2867b = c0019o;
                    i0Var3.f2868c = c0019o;
                    i0.d.c(i0Var3);
                }
                i = 0;
                c0019o = null;
                i0Var3.f2866a = i;
                i0Var3.f2867b = c0019o;
                i0Var3.f2868c = c0019o;
                i0.d.c(i0Var3);
            }
            view2 = null;
        }
        this.f1989m.j0(n2);
        u2.f2760b = u2.f2762e;
        this.f1946A = false;
        this.f1947B = false;
        u2.f2765j = false;
        u2.f2766k = false;
        this.f1989m.f2728f = false;
        ArrayList arrayList = n2.f2746b;
        if (arrayList != null) {
            arrayList.clear();
        }
        H h = this.f1989m;
        if (h.f2731k) {
            h.f2730j = 0;
            h.f2731k = false;
            n2.m();
        }
        this.f1989m.e0(u2);
        T(true);
        i0(false);
        ((k) c0385x.f4231b).clear();
        ((o.e) c0385x.f4232c).a();
        int[] iArr = this.f1990m0;
        int i8 = iArr[0];
        int i9 = iArr[1];
        F(iArr);
        if ((iArr[0] == i8 && iArr[1] == i9) ? false : true) {
            w(0, 0);
        }
        if (this.f1969a0 && this.f1987l != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (!isFocused()) {
            }
            long j2 = u2.f2768m;
            if (j2 != -1 && (z2 = this.f1987l.f2956b) && z2) {
                int h2 = this.f1977f.h();
                r10 = view2;
                int i10 = 0;
                while (true) {
                    if (i10 >= h2) {
                        break;
                    }
                    Y L4 = L(this.f1977f.g(i10));
                    if (L4 != null && !L4.i() && L4.f2780e == j2) {
                        if (!this.f1977f.f2800c.contains(L4.f2777a)) {
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
                ArrayList arrayList2 = this.f1977f.f2800c;
                view = r10.f2777a;
                if (!arrayList2.contains(view)) {
                }
            }
            if (this.f1977f.e() > 0) {
                int i11 = u2.f2767l;
                if (i11 == -1) {
                    i11 = 0;
                }
                int b2 = u2.b();
                for (int i12 = i11; i12 < b2; i12++) {
                    Y H2 = H(i12);
                    if (H2 == null) {
                        break;
                    }
                    View view3 = H2.f2777a;
                    if (view3.hasFocusable()) {
                        view2 = view3;
                        break;
                    }
                }
                for (int min = Math.min(b2, i11) - 1; min >= 0; min--) {
                    Y H3 = H(min);
                    if (H3 == null) {
                        break;
                    }
                    view = H3.f2777a;
                    if (view.hasFocusable()) {
                        view2 = view;
                        break;
                    }
                }
            }
            if (view2 != null) {
                int i13 = u2.f2769n;
                if (i13 != -1 && (findViewById = view2.findViewById(i13)) != null && findViewById.isFocusable()) {
                    view2 = findViewById;
                }
                view2.requestFocus();
            }
        }
        u2.f2768m = -1L;
        u2.f2767l = -1;
        u2.f2769n = -1;
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z2) {
        Y L2 = L(view);
        if (L2 != null) {
            if (L2.k()) {
                L2.f2783j &= -257;
            } else if (!L2.p()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(L2);
                throw new IllegalArgumentException(AbstractC0001b.e(this, sb));
            }
        } else if (f1943x0) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            throw new IllegalArgumentException(AbstractC0001b.e(this, sb2));
        }
        view.clearAnimation();
        L(view);
        super.removeDetachedView(view, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        C0157v c0157v = this.f1989m.f2727e;
        if ((c0157v == null || !c0157v.f2941e) && !O() && view2 != null) {
            a0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.f1989m.m0(this, view, rect, z2, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        ArrayList arrayList = this.f1994p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C0148l) arrayList.get(i)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f2003u != 0 || this.f2007w) {
            this.f2005v = true;
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
        i0 i0Var;
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
        C0137a h;
        int i5;
        int i6;
        C0137a c0137a;
        U u2 = this.f1976e0;
        u2.a(1);
        C(u2);
        u2.i = false;
        h0();
        C0385x c0385x = this.f1979g;
        ((k) c0385x.f4231b).clear();
        o.e eVar = (o.e) c0385x.f4232c;
        eVar.a();
        S();
        if (this.f1946A) {
            e eVar2 = this.f1975e;
            eVar2.j((ArrayList) eVar2.f483c);
            eVar2.j((ArrayList) eVar2.d);
            if (this.f1947B) {
                this.f1989m.Z();
            }
        }
        if (this.f1954J == null || !this.f1989m.B0()) {
            this.f1975e.b();
        } else {
            e eVar3 = this.f1975e;
            ArrayList arrayList = (ArrayList) eVar3.f483c;
            A0.c cVar = (A0.c) eVar3.f485f;
            cVar.getClass();
            while (true) {
                int size = arrayList.size() - 1;
                boolean z7 = false;
                while (true) {
                    i = 8;
                    if (size < 0) {
                        size = -1;
                        break;
                    }
                    if (((C0137a) arrayList.get(size)).f2794a == 8) {
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
                C0137a c0137a2 = (C0137a) arrayList.get(size);
                C0137a c0137a3 = (C0137a) arrayList.get(i7);
                int i8 = c0137a3.f2794a;
                if (i8 != 1) {
                    C0137a c0137a4 = null;
                    e eVar4 = (e) cVar.f6b;
                    if (i8 == 2) {
                        int i9 = c0137a2.f2795b;
                        int i10 = c0137a2.f2796c;
                        if (i9 < i10) {
                            if (c0137a3.f2795b == i9 && c0137a3.f2796c == i10 - i9) {
                                z5 = false;
                                z6 = true;
                            } else {
                                z5 = false;
                                z6 = false;
                            }
                        } else if (c0137a3.f2795b == i10 + 1 && c0137a3.f2796c == i9 - i10) {
                            z5 = true;
                            z6 = true;
                        } else {
                            z5 = true;
                            z6 = false;
                        }
                        int i11 = c0137a3.f2795b;
                        if (i10 < i11) {
                            c0137a3.f2795b = i11 - 1;
                        } else {
                            int i12 = c0137a3.f2796c;
                            if (i10 < i11 + i12) {
                                c0137a3.f2796c = i12 - 1;
                                c0137a2.f2794a = 2;
                                c0137a2.f2796c = 1;
                                if (c0137a3.f2796c == 0) {
                                    arrayList.remove(i7);
                                    eVar4.getClass();
                                    ((b) eVar4.f482b).c(c0137a3);
                                }
                            }
                        }
                        int i13 = c0137a2.f2795b;
                        int i14 = c0137a3.f2795b;
                        if (i13 <= i14) {
                            c0137a3.f2795b = i14 + 1;
                        } else {
                            int i15 = i14 + c0137a3.f2796c;
                            if (i13 < i15) {
                                c0137a4 = eVar4.h(2, i13 + 1, i15 - i13);
                                c0137a3.f2796c = c0137a2.f2795b - c0137a3.f2795b;
                            }
                        }
                        C0137a c0137a5 = c0137a4;
                        if (z6) {
                            arrayList.set(size, c0137a3);
                            arrayList.remove(i7);
                            eVar4.getClass();
                            ((b) eVar4.f482b).c(c0137a2);
                        } else {
                            if (z5) {
                                if (c0137a5 != null) {
                                    int i16 = c0137a2.f2795b;
                                    if (i16 > c0137a5.f2795b) {
                                        c0137a2.f2795b = i16 - c0137a5.f2796c;
                                    }
                                    int i17 = c0137a2.f2796c;
                                    if (i17 > c0137a5.f2795b) {
                                        c0137a2.f2796c = i17 - c0137a5.f2796c;
                                    }
                                }
                                int i18 = c0137a2.f2795b;
                                if (i18 > c0137a3.f2795b) {
                                    c0137a2.f2795b = i18 - c0137a3.f2796c;
                                }
                                int i19 = c0137a2.f2796c;
                                if (i19 > c0137a3.f2795b) {
                                    c0137a2.f2796c = i19 - c0137a3.f2796c;
                                }
                            } else {
                                if (c0137a5 != null) {
                                    int i20 = c0137a2.f2795b;
                                    if (i20 >= c0137a5.f2795b) {
                                        c0137a2.f2795b = i20 - c0137a5.f2796c;
                                    }
                                    int i21 = c0137a2.f2796c;
                                    if (i21 >= c0137a5.f2795b) {
                                        c0137a2.f2796c = i21 - c0137a5.f2796c;
                                    }
                                }
                                int i22 = c0137a2.f2795b;
                                if (i22 >= c0137a3.f2795b) {
                                    c0137a2.f2795b = i22 - c0137a3.f2796c;
                                }
                                int i23 = c0137a2.f2796c;
                                if (i23 >= c0137a3.f2795b) {
                                    c0137a2.f2796c = i23 - c0137a3.f2796c;
                                }
                            }
                            arrayList.set(size, c0137a3);
                            if (c0137a2.f2795b != c0137a2.f2796c) {
                                arrayList.set(i7, c0137a2);
                            } else {
                                arrayList.remove(i7);
                            }
                            if (c0137a5 != null) {
                                arrayList.add(size, c0137a5);
                            }
                        }
                    } else if (i8 == 4) {
                        int i24 = c0137a2.f2796c;
                        int i25 = c0137a3.f2795b;
                        if (i24 < i25) {
                            c0137a3.f2795b = i25 - 1;
                        } else {
                            int i26 = c0137a3.f2796c;
                            if (i24 < i25 + i26) {
                                c0137a3.f2796c = i26 - 1;
                                h = eVar4.h(4, c0137a2.f2795b, 1);
                                i5 = c0137a2.f2795b;
                                i6 = c0137a3.f2795b;
                                if (i5 > i6) {
                                    c0137a3.f2795b = i6 + 1;
                                } else {
                                    int i27 = i6 + c0137a3.f2796c;
                                    if (i5 < i27) {
                                        int i28 = i27 - i5;
                                        c0137a4 = eVar4.h(4, i5 + 1, i28);
                                        c0137a3.f2796c -= i28;
                                    }
                                }
                                c0137a = c0137a4;
                                arrayList.set(i7, c0137a2);
                                if (c0137a3.f2796c <= 0) {
                                    arrayList.set(size, c0137a3);
                                } else {
                                    arrayList.remove(size);
                                    eVar4.getClass();
                                    ((b) eVar4.f482b).c(c0137a3);
                                }
                                if (h != null) {
                                    arrayList.add(size, h);
                                }
                                if (c0137a == null) {
                                    arrayList.add(size, c0137a);
                                }
                            }
                        }
                        h = null;
                        i5 = c0137a2.f2795b;
                        i6 = c0137a3.f2795b;
                        if (i5 > i6) {
                        }
                        c0137a = c0137a4;
                        arrayList.set(i7, c0137a2);
                        if (c0137a3.f2796c <= 0) {
                        }
                        if (h != null) {
                        }
                        if (c0137a == null) {
                        }
                    }
                } else {
                    int i29 = c0137a2.f2796c;
                    int i30 = c0137a3.f2795b;
                    int i31 = i29 < i30 ? -1 : 0;
                    int i32 = c0137a2.f2795b;
                    if (i32 < i30) {
                        i31++;
                    }
                    if (i30 <= i32) {
                        c0137a2.f2795b = i32 + c0137a3.f2796c;
                    }
                    int i33 = c0137a3.f2795b;
                    if (i33 <= i29) {
                        c0137a2.f2796c = i29 + c0137a3.f2796c;
                    }
                    c0137a3.f2795b = i33 + i31;
                    arrayList.set(size, c0137a3);
                    arrayList.set(i7, c0137a2);
                }
            }
            int size2 = arrayList.size();
            int i34 = 0;
            while (i34 < size2) {
                C0137a c0137a6 = (C0137a) arrayList.get(i34);
                int i35 = c0137a6.f2794a;
                if (i35 != 1) {
                    b bVar = (b) eVar3.f482b;
                    C0160y c0160y = (C0160y) eVar3.f484e;
                    if (i35 == 2) {
                        i2 = size2;
                        int i36 = c0137a6.f2795b;
                        int i37 = c0137a6.f2796c + i36;
                        int i38 = i36;
                        int i39 = 0;
                        char c3 = 65535;
                        while (i38 < i37) {
                            if (c0160y.b(i38) != null || eVar3.a(i38)) {
                                if (c3 == 0) {
                                    eVar3.c(eVar3.h(2, i36, i39));
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                z4 = z3;
                                c2 = 1;
                            } else {
                                if (c3 == 1) {
                                    eVar3.i(eVar3.h(2, i36, i39));
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
                        if (i39 != c0137a6.f2796c) {
                            bVar.c(c0137a6);
                            c0137a6 = eVar3.h(2, i36, i39);
                        }
                        if (c3 == 0) {
                            eVar3.c(c0137a6);
                        } else {
                            eVar3.i(c0137a6);
                        }
                    } else if (i35 != 4) {
                        if (i35 == i) {
                            eVar3.i(c0137a6);
                        }
                        i2 = size2;
                    } else {
                        int i40 = c0137a6.f2795b;
                        int i41 = c0137a6.f2796c + i40;
                        int i42 = i40;
                        char c4 = 65535;
                        int i43 = 0;
                        while (i40 < i41) {
                            if (c0160y.b(i40) != null || eVar3.a(i40)) {
                                i3 = size2;
                                if (c4 == 0) {
                                    eVar3.c(eVar3.h(4, i42, i43));
                                    i42 = i40;
                                    i43 = 0;
                                }
                                i4 = 1;
                                c4 = 1;
                            } else {
                                i3 = size2;
                                if (c4 == 1) {
                                    eVar3.i(eVar3.h(4, i42, i43));
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
                        if (i43 != c0137a6.f2796c) {
                            bVar.c(c0137a6);
                            c0137a6 = eVar3.h(4, i42, i43);
                        }
                        if (c4 == 0) {
                            eVar3.c(c0137a6);
                        } else {
                            eVar3.i(c0137a6);
                        }
                    }
                } else {
                    i2 = size2;
                    eVar3.i(c0137a6);
                }
                i34++;
                size2 = i2;
                i = 8;
            }
            arrayList.clear();
        }
        boolean z8 = this.f1981h0 || this.f1982i0;
        boolean z9 = this.f2001t && this.f1954J != null && ((z2 = this.f1946A) || z8 || this.f1989m.f2728f) && (!z2 || this.f1987l.f2956b);
        U u3 = this.f1976e0;
        u3.f2765j = z9;
        u3.f2766k = z9 && z8 && !this.f1946A && this.f1954J != null && this.f1989m.B0();
        View focusedChild = (this.f1969a0 && hasFocus() && this.f1987l != null) ? getFocusedChild() : null;
        Y K2 = (focusedChild == null || (D2 = D(focusedChild)) == null) ? null : K(D2);
        if (K2 == null) {
            u2.f2768m = -1L;
            u2.f2767l = -1;
            u2.f2769n = -1;
        } else {
            u2.f2768m = this.f1987l.f2956b ? K2.f2780e : -1L;
            if (!this.f1946A) {
                if (K2.i()) {
                    I2 = K2.d;
                } else {
                    RecyclerView recyclerView = K2.f2791r;
                    if (recyclerView != null) {
                        I2 = recyclerView.I(K2);
                    }
                }
                u2.f2767l = I2;
                view = K2.f2777a;
                int id = view.getId();
                while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                    view = ((ViewGroup) view).getFocusedChild();
                    if (view.getId() == -1) {
                        id = view.getId();
                    }
                }
                u2.f2769n = id;
            }
            I2 = -1;
            u2.f2767l = I2;
            view = K2.f2777a;
            int id2 = view.getId();
            while (!view.isFocused()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() == -1) {
                }
            }
            u2.f2769n = id2;
        }
        u2.h = u2.f2765j && this.f1982i0;
        this.f1982i0 = false;
        this.f1981h0 = false;
        u2.f2764g = u2.f2766k;
        u2.f2762e = this.f1987l.a();
        F(this.f1990m0);
        boolean z10 = u2.f2765j;
        k kVar = (k) c0385x.f4231b;
        if (z10) {
            int e2 = this.f1977f.e();
            for (int i44 = 0; i44 < e2; i44++) {
                Y L2 = L(this.f1977f.d(i44));
                if (!L2.p() && (!L2.g() || this.f1987l.f2956b)) {
                    AbstractC0134D abstractC0134D = this.f1954J;
                    AbstractC0134D.b(L2);
                    L2.c();
                    abstractC0134D.getClass();
                    C0019o c0019o = new C0019o();
                    c0019o.a(L2);
                    i0 i0Var2 = (i0) kVar.getOrDefault(L2, null);
                    if (i0Var2 == null) {
                        i0Var2 = i0.a();
                        kVar.put(L2, i0Var2);
                    }
                    i0Var2.f2867b = c0019o;
                    i0Var2.f2866a |= 4;
                    if (u2.h && L2.l() && !L2.i() && !L2.p() && !L2.g()) {
                        eVar.d(J(L2), L2);
                    }
                }
            }
        }
        if (u2.f2766k) {
            int h2 = this.f1977f.h();
            for (int i45 = 0; i45 < h2; i45++) {
                Y L3 = L(this.f1977f.g(i45));
                if (f1943x0 && L3.f2779c == -1 && !L3.i()) {
                    throw new IllegalStateException(AbstractC0001b.e(this, new StringBuilder("view holder cannot have position -1 unless it is removed")));
                }
                if (!L3.p() && L3.d == -1) {
                    L3.d = L3.f2779c;
                }
            }
            boolean z11 = u2.f2763f;
            u2.f2763f = false;
            this.f1989m.d0(this.f1972c, u2);
            u2.f2763f = z11;
            for (int i46 = 0; i46 < this.f1977f.e(); i46++) {
                Y L4 = L(this.f1977f.d(i46));
                if (!L4.p() && ((i0Var = (i0) kVar.getOrDefault(L4, null)) == null || (i0Var.f2866a & 4) == 0)) {
                    AbstractC0134D.b(L4);
                    boolean d = L4.d(8192);
                    AbstractC0134D abstractC0134D2 = this.f1954J;
                    L4.c();
                    abstractC0134D2.getClass();
                    C0019o c0019o2 = new C0019o();
                    c0019o2.a(L4);
                    if (d) {
                        X(L4, c0019o2);
                    } else {
                        i0 i0Var3 = (i0) kVar.getOrDefault(L4, null);
                        if (i0Var3 == null) {
                            i0Var3 = i0.a();
                            kVar.put(L4, i0Var3);
                        }
                        i0Var3.f2866a |= 2;
                        i0Var3.f2867b = c0019o2;
                    }
                }
            }
            m();
        } else {
            m();
        }
        T(true);
        i0(false);
        u2.d = 2;
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        H h = this.f1989m;
        if (h == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f2007w) {
            return;
        }
        boolean d = h.d();
        boolean e2 = this.f1989m.e();
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
            this.f2010y |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(a0 a0Var) {
        this.f1988l0 = a0Var;
        K.Q.l(this, a0Var);
    }

    public void setAdapter(AbstractC0161z abstractC0161z) {
        setLayoutFrozen(false);
        AbstractC0161z abstractC0161z2 = this.f1987l;
        P p2 = this.f1970b;
        if (abstractC0161z2 != null) {
            abstractC0161z2.f2955a.unregisterObserver(p2);
            this.f1987l.getClass();
        }
        AbstractC0134D abstractC0134D = this.f1954J;
        if (abstractC0134D != null) {
            abstractC0134D.e();
        }
        H h = this.f1989m;
        N n2 = this.f1972c;
        if (h != null) {
            h.i0(n2);
            this.f1989m.j0(n2);
        }
        n2.f2745a.clear();
        n2.f();
        e eVar = this.f1975e;
        eVar.j((ArrayList) eVar.f483c);
        eVar.j((ArrayList) eVar.d);
        AbstractC0161z abstractC0161z3 = this.f1987l;
        this.f1987l = abstractC0161z;
        if (abstractC0161z != null) {
            abstractC0161z.f2955a.registerObserver(p2);
        }
        H h2 = this.f1989m;
        if (h2 != null) {
            h2.Q();
        }
        AbstractC0161z abstractC0161z4 = this.f1987l;
        n2.f2745a.clear();
        n2.f();
        n2.e(abstractC0161z3, true);
        M c2 = n2.c();
        if (abstractC0161z3 != null) {
            c2.f2743b--;
        }
        if (c2.f2743b == 0) {
            int i = 0;
            while (true) {
                SparseArray sparseArray = c2.f2742a;
                if (i >= sparseArray.size()) {
                    break;
                }
                L l2 = (L) sparseArray.valueAt(i);
                Iterator it = l2.f2739a.iterator();
                while (it.hasNext()) {
                    l.n(((Y) it.next()).f2777a);
                }
                l2.f2739a.clear();
                i++;
            }
        }
        if (abstractC0161z4 != null) {
            c2.f2743b++;
        }
        n2.d();
        this.f1976e0.f2763f = true;
        W(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC0132B interfaceC0132B) {
        if (interfaceC0132B == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z2) {
        if (z2 != this.h) {
            this.f1953I = null;
            this.f1951G = null;
            this.f1952H = null;
            this.F = null;
        }
        this.h = z2;
        super.setClipToPadding(z2);
        if (this.f2001t) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(AbstractC0133C abstractC0133C) {
        abstractC0133C.getClass();
        this.f1950E = abstractC0133C;
        this.f1953I = null;
        this.f1951G = null;
        this.f1952H = null;
        this.F = null;
    }

    public void setHasFixedSize(boolean z2) {
        this.f2000s = z2;
    }

    public void setItemAnimator(AbstractC0134D abstractC0134D) {
        AbstractC0134D abstractC0134D2 = this.f1954J;
        if (abstractC0134D2 != null) {
            abstractC0134D2.e();
            this.f1954J.f2714a = null;
        }
        this.f1954J = abstractC0134D;
        if (abstractC0134D != null) {
            abstractC0134D.f2714a = this.f1984j0;
        }
    }

    public void setItemViewCacheSize(int i) {
        N n2 = this.f1972c;
        n2.f2748e = i;
        n2.m();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(H h) {
        RecyclerView recyclerView;
        C0157v c0157v;
        if (h == this.f1989m) {
            return;
        }
        setScrollState(0);
        X x2 = this.f1971b0;
        x2.f2775g.removeCallbacks(x2);
        x2.f2772c.abortAnimation();
        H h2 = this.f1989m;
        if (h2 != null && (c0157v = h2.f2727e) != null) {
            c0157v.i();
        }
        H h3 = this.f1989m;
        N n2 = this.f1972c;
        if (h3 != null) {
            AbstractC0134D abstractC0134D = this.f1954J;
            if (abstractC0134D != null) {
                abstractC0134D.e();
            }
            this.f1989m.i0(n2);
            this.f1989m.j0(n2);
            n2.f2745a.clear();
            n2.f();
            if (this.f1998r) {
                H h4 = this.f1989m;
                h4.f2729g = false;
                h4.S(this);
            }
            this.f1989m.v0(null);
            this.f1989m = null;
        } else {
            n2.f2745a.clear();
            n2.f();
        }
        C0138b c0138b = this.f1977f;
        c0138b.f2799b.h();
        ArrayList arrayList = c0138b.f2800c;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = c0138b.f2798a.f2954a;
            if (size < 0) {
                break;
            }
            Y L2 = L((View) arrayList.get(size));
            if (L2 != null) {
                int i = L2.f2789p;
                if (recyclerView.O()) {
                    L2.f2790q = i;
                    recyclerView.f1999r0.add(L2);
                } else {
                    WeakHashMap weakHashMap = K.Q.f578a;
                    L2.f2777a.setImportantForAccessibility(i);
                }
                L2.f2789p = 0;
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
        this.f1989m = h;
        if (h != null) {
            if (h.f2725b != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(h);
                sb.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(AbstractC0001b.e(h.f2725b, sb));
            }
            h.v0(this);
            if (this.f1998r) {
                H h5 = this.f1989m;
                h5.f2729g = true;
                h5.R(this);
            }
        }
        n2.m();
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
        C0016l scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.d) {
            WeakHashMap weakHashMap = K.Q.f578a;
            F.z(scrollingChildHelper.f634c);
        }
        scrollingChildHelper.d = z2;
    }

    public void setOnFlingListener(J j2) {
        this.f1963S = j2;
    }

    @Deprecated
    public void setOnScrollListener(K k2) {
        this.f1978f0 = k2;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.f1969a0 = z2;
    }

    public void setRecycledViewPool(M m2) {
        N n2 = this.f1972c;
        RecyclerView recyclerView = n2.h;
        n2.e(recyclerView.f1987l, false);
        if (n2.f2750g != null) {
            r2.f2743b--;
        }
        n2.f2750g = m2;
        if (m2 != null && recyclerView.getAdapter() != null) {
            n2.f2750g.f2743b++;
        }
        n2.d();
    }

    @Deprecated
    public void setRecyclerListener(O o2) {
    }

    public void setScrollState(int i) {
        C0157v c0157v;
        if (i == this.f1955K) {
            return;
        }
        if (f1944y0) {
            Log.d("RecyclerView", "setting scroll state to " + i + " from " + this.f1955K, new Exception());
        }
        this.f1955K = i;
        if (i != 2) {
            X x2 = this.f1971b0;
            x2.f2775g.removeCallbacks(x2);
            x2.f2772c.abortAnimation();
            H h = this.f1989m;
            if (h != null && (c0157v = h.f2727e) != null) {
                c0157v.i();
            }
        }
        H h2 = this.f1989m;
        if (h2 != null) {
            h2.h0(i);
        }
        K k2 = this.f1978f0;
        if (k2 != null) {
            k2.a(this, i);
        }
        ArrayList arrayList = this.f1980g0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((K) this.f1980g0.get(size)).a(this, i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.f1962R = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.f1962R = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(W w2) {
        this.f1972c.getClass();
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
        C0157v c0157v;
        if (z2 != this.f2007w) {
            k("Do not suppressLayout in layout or scroll");
            if (!z2) {
                this.f2007w = false;
                if (this.f2005v && this.f1989m != null && this.f1987l != null) {
                    requestLayout();
                }
                this.f2005v = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, f1937A0, f1937A0, 0));
            this.f2007w = true;
            this.f2009x = true;
            setScrollState(0);
            X x2 = this.f1971b0;
            x2.f2775g.removeCallbacks(x2);
            x2.f2772c.abortAnimation();
            H h = this.f1989m;
            if (h == null || (c0157v = h.f2727e) == null) {
                return;
            }
            c0157v.i();
        }
    }

    public final void t() {
        h0();
        S();
        U u2 = this.f1976e0;
        u2.a(6);
        this.f1975e.b();
        u2.f2762e = this.f1987l.a();
        u2.f2761c = 0;
        if (this.d != null) {
            AbstractC0161z abstractC0161z = this.f1987l;
            int a2 = AbstractC0309e.a(abstractC0161z.f2957c);
            if (a2 == 1 ? abstractC0161z.a() > 0 : a2 != 2) {
                Parcelable parcelable = this.d.f2752c;
                if (parcelable != null) {
                    this.f1989m.f0(parcelable);
                }
                this.d = null;
            }
        }
        u2.f2764g = false;
        this.f1989m.d0(this.f1972c, u2);
        u2.f2763f = false;
        u2.f2765j = u2.f2765j && this.f1954J != null;
        u2.d = 4;
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
        this.f1949D++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        K k2 = this.f1978f0;
        if (k2 != null) {
            k2.b(this, i, i2);
        }
        ArrayList arrayList = this.f1980g0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((K) this.f1980g0.get(size)).b(this, i, i2);
            }
        }
        this.f1949D--;
    }

    public final void x() {
        if (this.f1953I != null) {
            return;
        }
        ((V) this.f1950E).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1953I = edgeEffect;
        if (this.h) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void y() {
        if (this.F != null) {
            return;
        }
        ((V) this.f1950E).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.F = edgeEffect;
        if (this.h) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void z() {
        if (this.f1952H != null) {
            return;
        }
        ((V) this.f1950E).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1952H = edgeEffect;
        if (this.h) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        char c2;
        boolean z2;
        Object[] objArr;
        Constructor constructor;
        Object[] objArr2;
        this.f1970b = new P(this);
        this.f1972c = new N(this);
        this.f1979g = new C0385x(8);
        this.i = new Rect();
        this.f1983j = new Rect();
        this.f1985k = new RectF();
        this.f1991n = new ArrayList();
        this.f1993o = new ArrayList();
        this.f1994p = new ArrayList();
        this.f2003u = 0;
        this.f1946A = false;
        this.f1947B = false;
        this.f1948C = 0;
        this.f1949D = 0;
        this.f1950E = f1942F0;
        C0145i c0145i = new C0145i();
        c0145i.f2714a = null;
        c0145i.f2715b = new ArrayList();
        c0145i.f2716c = 120L;
        c0145i.d = 120L;
        c0145i.f2717e = 250L;
        c0145i.f2718f = 250L;
        c0145i.f2856g = true;
        c0145i.h = new ArrayList();
        c0145i.i = new ArrayList();
        c0145i.f2857j = new ArrayList();
        c0145i.f2858k = new ArrayList();
        c0145i.f2859l = new ArrayList();
        c0145i.f2860m = new ArrayList();
        c0145i.f2861n = new ArrayList();
        c0145i.f2862o = new ArrayList();
        c0145i.f2863p = new ArrayList();
        c0145i.f2864q = new ArrayList();
        c0145i.f2865r = new ArrayList();
        this.f1954J = c0145i;
        this.f1955K = 0;
        this.f1956L = -1;
        this.f1966V = Float.MIN_VALUE;
        this.f1967W = Float.MIN_VALUE;
        this.f1969a0 = true;
        this.f1971b0 = new X(this);
        this.f1974d0 = f1939C0 ? new C0149m() : null;
        U u2 = new U();
        u2.f2759a = -1;
        u2.f2760b = 0;
        u2.f2761c = 0;
        u2.d = 1;
        u2.f2762e = 0;
        u2.f2763f = false;
        u2.f2764g = false;
        u2.h = false;
        u2.i = false;
        u2.f2765j = false;
        u2.f2766k = false;
        this.f1976e0 = u2;
        this.f1981h0 = false;
        this.f1982i0 = false;
        C0160y c0160y = new C0160y(this);
        this.f1984j0 = c0160y;
        this.f1986k0 = false;
        this.f1990m0 = new int[2];
        this.o0 = new int[2];
        this.f1995p0 = new int[2];
        this.f1997q0 = new int[2];
        this.f1999r0 = new ArrayList();
        this.s0 = new i(9, this);
        this.f2004u0 = 0;
        this.f2006v0 = 0;
        this.f2008w0 = new C0160y(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1962R = viewConfiguration.getScaledTouchSlop();
        this.f1966V = S.a(viewConfiguration);
        this.f1967W = S.b(viewConfiguration);
        this.f1964T = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1965U = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f1968a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.f1954J.f2714a = c0160y;
        this.f1975e = new e(new C0160y(this));
        this.f1977f = new C0138b(new C0160y(this));
        WeakHashMap weakHashMap = K.Q.f578a;
        if (K.H.c(this) == 0) {
            K.H.m(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f2011z = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new a0(this));
        int[] iArr = AbstractC0110a.f2537a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        K.Q.k(this, context, iArr, attributeSet, obtainStyledAttributes, i);
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
                throw new IllegalArgumentException(AbstractC0001b.e(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
            }
            Resources resources = getContext().getResources();
            i2 = 4;
            c2 = 2;
            new C0148l(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.fortunequest.neontrack.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.fortunequest.neontrack.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.fortunequest.neontrack.R.dimen.fastscroll_margin));
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
                    Class<? extends U> asSubclass = Class.forName(trim, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(H.class);
                    try {
                        constructor = asSubclass.getConstructor(f1940D0);
                        objArr2 = new Object[i2];
                        objArr2[0] = context;
                        z2 = true;
                    } catch (NoSuchMethodException e2) {
                        e = e2;
                        z2 = true;
                    }
                    try {
                        objArr2[1] = attributeSet;
                        objArr2[c2] = Integer.valueOf(i);
                        objArr2[3] = 0;
                        objArr = objArr2;
                    } catch (NoSuchMethodException e3) {
                        e = e3;
                        NoSuchMethodException noSuchMethodException = e;
                        try {
                            objArr = null;
                            constructor = asSubclass.getConstructor(null);
                            constructor.setAccessible(z2);
                            setLayoutManager((H) constructor.newInstance(objArr));
                            int[] iArr2 = f1945z0;
                            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
                            K.Q.k(this, context, iArr2, attributeSet, obtainStyledAttributes2, i);
                            boolean z3 = obtainStyledAttributes2.getBoolean(0, z2);
                            obtainStyledAttributes2.recycle();
                            setNestedScrollingEnabled(z3);
                            setTag(com.fortunequest.neontrack.R.id.is_pooling_container_tag, Boolean.TRUE);
                        } catch (NoSuchMethodException e4) {
                            e4.initCause(noSuchMethodException);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + trim, e4);
                        }
                    }
                    constructor.setAccessible(z2);
                    setLayoutManager((H) constructor.newInstance(objArr));
                    int[] iArr22 = f1945z0;
                    TypedArray obtainStyledAttributes22 = context.obtainStyledAttributes(attributeSet, iArr22, i, 0);
                    K.Q.k(this, context, iArr22, attributeSet, obtainStyledAttributes22, i);
                    boolean z32 = obtainStyledAttributes22.getBoolean(0, z2);
                    obtainStyledAttributes22.recycle();
                    setNestedScrollingEnabled(z32);
                    setTag(com.fortunequest.neontrack.R.id.is_pooling_container_tag, Boolean.TRUE);
                } catch (ClassCastException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + trim, e5);
                } catch (ClassNotFoundException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + trim, e6);
                } catch (IllegalAccessException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + trim, e7);
                } catch (InstantiationException e8) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e8);
                } catch (InvocationTargetException e9) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e9);
                }
            }
        }
        z2 = true;
        int[] iArr222 = f1945z0;
        TypedArray obtainStyledAttributes222 = context.obtainStyledAttributes(attributeSet, iArr222, i, 0);
        K.Q.k(this, context, iArr222, attributeSet, obtainStyledAttributes222, i);
        boolean z322 = obtainStyledAttributes222.getBoolean(0, z2);
        obtainStyledAttributes222.recycle();
        setNestedScrollingEnabled(z322);
        setTag(com.fortunequest.neontrack.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        H h = this.f1989m;
        if (h != null) {
            return h.t(layoutParams);
        }
        throw new IllegalStateException(AbstractC0001b.e(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }
}
