package androidx.recyclerview.widget;

import B1.c;
import F1.a;
import I0.h;
import L.b;
import M.C0016l;
import M.C0019o;
import M.E;
import M.G;
import M.P;
import N0.e;
import U.d;
import V.g;
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
import android.os.Build;
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
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import g0.AbstractC0123a;
import h0.AbstractC0137C;
import h0.AbstractC0138D;
import h0.AbstractC0141G;
import h0.AbstractC0143I;
import h0.AbstractC0144J;
import h0.AbstractC0174y;
import h0.C0136B;
import h0.C0142H;
import h0.C0145K;
import h0.C0146L;
import h0.C0147M;
import h0.C0149O;
import h0.C0151a;
import h0.C0158h;
import h0.C0161k;
import h0.C0162l;
import h0.C0170u;
import h0.C0172w;
import h0.C0173x;
import h0.InterfaceC0135A;
import h0.InterfaceC0148N;
import h0.Q;
import h0.RunnableC0164n;
import h0.S;
import h0.T;
import h0.U;
import h0.V;
import h0.X;
import h0.f0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.WeakHashMap;
import q.k;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {
    public static final int[] s0 = {R.attr.nestedScrollingEnabled};

    /* renamed from: t0, reason: collision with root package name */
    public static final Class[] f1988t0;

    /* renamed from: u0, reason: collision with root package name */
    public static final d f1989u0;

    /* renamed from: A, reason: collision with root package name */
    public int f1990A;

    /* renamed from: B, reason: collision with root package name */
    public int f1991B;

    /* renamed from: C, reason: collision with root package name */
    public C0136B f1992C;

    /* renamed from: D, reason: collision with root package name */
    public EdgeEffect f1993D;

    /* renamed from: E, reason: collision with root package name */
    public EdgeEffect f1994E;

    /* renamed from: F, reason: collision with root package name */
    public EdgeEffect f1995F;

    /* renamed from: G, reason: collision with root package name */
    public EdgeEffect f1996G;
    public AbstractC0137C H;

    /* renamed from: I, reason: collision with root package name */
    public int f1997I;

    /* renamed from: J, reason: collision with root package name */
    public int f1998J;

    /* renamed from: K, reason: collision with root package name */
    public VelocityTracker f1999K;

    /* renamed from: L, reason: collision with root package name */
    public int f2000L;

    /* renamed from: M, reason: collision with root package name */
    public int f2001M;

    /* renamed from: N, reason: collision with root package name */
    public int f2002N;

    /* renamed from: O, reason: collision with root package name */
    public int f2003O;

    /* renamed from: P, reason: collision with root package name */
    public int f2004P;

    /* renamed from: Q, reason: collision with root package name */
    public AbstractC0143I f2005Q;

    /* renamed from: R, reason: collision with root package name */
    public final int f2006R;

    /* renamed from: S, reason: collision with root package name */
    public final int f2007S;

    /* renamed from: T, reason: collision with root package name */
    public final float f2008T;

    /* renamed from: U, reason: collision with root package name */
    public final float f2009U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f2010V;

    /* renamed from: W, reason: collision with root package name */
    public final U f2011W;

    /* renamed from: a, reason: collision with root package name */
    public final e f2012a;

    /* renamed from: a0, reason: collision with root package name */
    public RunnableC0164n f2013a0;

    /* renamed from: b, reason: collision with root package name */
    public final C0147M f2014b;

    /* renamed from: b0, reason: collision with root package name */
    public final C0162l f2015b0;

    /* renamed from: c, reason: collision with root package name */
    public C0149O f2016c;

    /* renamed from: c0, reason: collision with root package name */
    public final S f2017c0;

    /* renamed from: d, reason: collision with root package name */
    public final J.d f2018d;

    /* renamed from: d0, reason: collision with root package name */
    public AbstractC0144J f2019d0;
    public final h e;

    /* renamed from: e0, reason: collision with root package name */
    public ArrayList f2020e0;

    /* renamed from: f, reason: collision with root package name */
    public final c f2021f;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f2022f0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2023g;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f2024g0;

    /* renamed from: h, reason: collision with root package name */
    public final Rect f2025h;

    /* renamed from: h0, reason: collision with root package name */
    public final C0173x f2026h0;
    public final Rect i;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f2027i0;
    public final RectF j;

    /* renamed from: j0, reason: collision with root package name */
    public X f2028j0;

    /* renamed from: k, reason: collision with root package name */
    public AbstractC0174y f2029k;

    /* renamed from: k0, reason: collision with root package name */
    public final int[] f2030k0;

    /* renamed from: l, reason: collision with root package name */
    public AbstractC0141G f2031l;

    /* renamed from: l0, reason: collision with root package name */
    public C0016l f2032l0;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f2033m;

    /* renamed from: m0, reason: collision with root package name */
    public final int[] f2034m0;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f2035n;

    /* renamed from: n0, reason: collision with root package name */
    public final int[] f2036n0;

    /* renamed from: o, reason: collision with root package name */
    public C0161k f2037o;
    public final int[] o0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2038p;

    /* renamed from: p0, reason: collision with root package name */
    public final ArrayList f2039p0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2040q;

    /* renamed from: q0, reason: collision with root package name */
    public final C1.e f2041q0;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2042r;

    /* renamed from: r0, reason: collision with root package name */
    public final C0173x f2043r0;

    /* renamed from: s, reason: collision with root package name */
    public int f2044s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2045t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2046u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2047v;

    /* renamed from: w, reason: collision with root package name */
    public int f2048w;

    /* renamed from: x, reason: collision with root package name */
    public final AccessibilityManager f2049x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f2050y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f2051z;

    static {
        Class cls = Integer.TYPE;
        f1988t0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f1989u0 = new d(1);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.winpower.neonfit.R.attr.recyclerViewStyle);
    }

    public static RecyclerView D(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView D2 = D(viewGroup.getChildAt(i));
            if (D2 != null) {
                return D2;
            }
        }
        return null;
    }

    public static V I(View view) {
        if (view == null) {
            return null;
        }
        return ((C0142H) view.getLayoutParams()).f2916a;
    }

    private C0016l getScrollingChildHelper() {
        if (this.f2032l0 == null) {
            this.f2032l0 = new C0016l(this);
        }
        return this.f2032l0;
    }

    public static void j(V v2) {
        WeakReference weakReference = v2.f2959b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == v2.f2958a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            v2.f2959b = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View A(View view) {
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
    public final boolean B(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.f2035n;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0161k c0161k = (C0161k) arrayList.get(i);
            int i2 = c0161k.f3071v;
            if (i2 == 1) {
                boolean d2 = c0161k.d(motionEvent.getX(), motionEvent.getY());
                boolean c2 = c0161k.c(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0 && (d2 || c2)) {
                    if (c2) {
                        c0161k.f3072w = 1;
                        c0161k.f3065p = (int) motionEvent.getX();
                    } else if (d2) {
                        c0161k.f3072w = 2;
                        c0161k.f3062m = (int) motionEvent.getY();
                    }
                    c0161k.f(2);
                    if (action == 3) {
                        this.f2037o = c0161k;
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

    public final void C(int[] iArr) {
        int f2 = this.e.f();
        if (f2 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < f2; i3++) {
            V I2 = I(this.e.e(i3));
            if (!I2.p()) {
                int b2 = I2.b();
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

    public final V E(int i) {
        V v2 = null;
        if (this.f2050y) {
            return null;
        }
        int m2 = this.e.m();
        for (int i2 = 0; i2 < m2; i2++) {
            V I2 = I(this.e.l(i2));
            if (I2 != null && !I2.i() && F(I2) == i) {
                if (!((ArrayList) this.e.f593d).contains(I2.f2958a)) {
                    return I2;
                }
                v2 = I2;
            }
        }
        return v2;
    }

    public final int F(V v2) {
        if (v2.d(524) || !v2.f()) {
            return -1;
        }
        J.d dVar = this.f2018d;
        int i = v2.f2960c;
        ArrayList arrayList = (ArrayList) dVar.f626c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0151a c0151a = (C0151a) arrayList.get(i2);
            int i3 = c0151a.f2983a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = c0151a.f2984b;
                    if (i4 <= i) {
                        int i5 = c0151a.f2985c;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = c0151a.f2984b;
                    if (i6 == i) {
                        i = c0151a.f2985c;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (c0151a.f2985c <= i) {
                            i++;
                        }
                    }
                }
            } else if (c0151a.f2984b <= i) {
                i += c0151a.f2985c;
            }
        }
        return i;
    }

    public final long G(V v2) {
        return this.f2029k.f3137b ? v2.e : v2.f2960c;
    }

    public final V H(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return I(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect J(View view) {
        C0142H c0142h = (C0142H) view.getLayoutParams();
        boolean z2 = c0142h.f2918c;
        Rect rect = c0142h.f2917b;
        if (!z2) {
            return rect;
        }
        if (this.f2017c0.f2945g && (c0142h.f2916a.l() || c0142h.f2916a.g())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.f2033m;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.f2025h;
            rect2.set(0, 0, 0, 0);
            ((AbstractC0138D) arrayList.get(i)).getClass();
            ((C0142H) view.getLayoutParams()).f2916a.getClass();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        c0142h.f2918c = false;
        return rect;
    }

    public final boolean K() {
        return !this.f2042r || this.f2050y || this.f2018d.f();
    }

    public final boolean L() {
        return this.f1990A > 0;
    }

    public final void M(int i) {
        if (this.f2031l == null) {
            return;
        }
        setScrollState(2);
        this.f2031l.n0(i);
        awakenScrollBars();
    }

    public final void N() {
        int m2 = this.e.m();
        for (int i = 0; i < m2; i++) {
            ((C0142H) this.e.l(i).getLayoutParams()).f2918c = true;
        }
        ArrayList arrayList = this.f2014b.f2928c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0142H c0142h = (C0142H) ((V) arrayList.get(i2)).f2958a.getLayoutParams();
            if (c0142h != null) {
                c0142h.f2918c = true;
            }
        }
    }

    public final void O(int i, int i2, boolean z2) {
        int i3 = i + i2;
        int m2 = this.e.m();
        for (int i4 = 0; i4 < m2; i4++) {
            V I2 = I(this.e.l(i4));
            if (I2 != null && !I2.p()) {
                int i5 = I2.f2960c;
                S s2 = this.f2017c0;
                if (i5 >= i3) {
                    I2.m(-i2, z2);
                    s2.f2944f = true;
                } else if (i5 >= i) {
                    I2.a(8);
                    I2.m(-i2, z2);
                    I2.f2960c = i - 1;
                    s2.f2944f = true;
                }
            }
        }
        C0147M c0147m = this.f2014b;
        ArrayList arrayList = c0147m.f2928c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            V v2 = (V) arrayList.get(size);
            if (v2 != null) {
                int i6 = v2.f2960c;
                if (i6 >= i3) {
                    v2.m(-i2, z2);
                } else if (i6 >= i) {
                    v2.a(8);
                    c0147m.e(size);
                }
            }
        }
        requestLayout();
    }

    public final void P() {
        this.f1990A++;
    }

    public final void Q(boolean z2) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.f1990A - 1;
        this.f1990A = i2;
        if (i2 < 1) {
            this.f1990A = 0;
            if (z2) {
                int i3 = this.f2048w;
                this.f2048w = 0;
                if (i3 != 0 && (accessibilityManager = this.f2049x) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(obtain);
                }
                ArrayList arrayList = this.f2039p0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    V v2 = (V) arrayList.get(size);
                    if (v2.f2958a.getParent() == this && !v2.p() && (i = v2.f2971q) != -1) {
                        WeakHashMap weakHashMap = P.f711a;
                        v2.f2958a.setImportantForAccessibility(i);
                        v2.f2971q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void R(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1998J) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f1998J = motionEvent.getPointerId(i);
            int x2 = (int) (motionEvent.getX(i) + 0.5f);
            this.f2002N = x2;
            this.f2000L = x2;
            int y2 = (int) (motionEvent.getY(i) + 0.5f);
            this.f2003O = y2;
            this.f2001M = y2;
        }
    }

    public final void S() {
        if (this.f2027i0 || !this.f2038p) {
            return;
        }
        WeakHashMap weakHashMap = P.f711a;
        postOnAnimation(this.f2041q0);
        this.f2027i0 = true;
    }

    public final void T(V v2, C0019o c0019o) {
        v2.j &= -8193;
        boolean z2 = this.f2017c0.f2946h;
        c cVar = this.f2021f;
        if (z2 && v2.l() && !v2.i() && !v2.p()) {
            ((q.e) cVar.f69c).d(G(v2), v2);
        }
        k kVar = (k) cVar.f68b;
        f0 f0Var = (f0) kVar.getOrDefault(v2, null);
        if (f0Var == null) {
            f0Var = f0.a();
            kVar.put(v2, f0Var);
        }
        f0Var.f3029b = c0019o;
        f0Var.f3028a |= 4;
    }

    public final void U(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f2025h;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C0142H) {
            C0142H c0142h = (C0142H) layoutParams;
            if (!c0142h.f2918c) {
                int i = rect.left;
                Rect rect2 = c0142h.f2917b;
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
        this.f2031l.k0(this, view, this.f2025h, !this.f2042r, view2 == null);
    }

    public final void V() {
        VelocityTracker velocityTracker = this.f1999K;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z2 = false;
        c0(0);
        EdgeEffect edgeEffect = this.f1993D;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = this.f1993D.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f1994E;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 |= this.f1994E.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1995F;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 |= this.f1995F.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1996G;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z2 |= this.f1996G.isFinished();
        }
        if (z2) {
            WeakHashMap weakHashMap = P.f711a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean W(int i, int i2, MotionEvent motionEvent) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        m();
        AbstractC0174y abstractC0174y = this.f2029k;
        int[] iArr = this.o0;
        if (abstractC0174y != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            X(i, i2, iArr);
            int i7 = iArr[0];
            int i8 = iArr[1];
            i3 = i7;
            i4 = i8;
            i5 = i - i7;
            i6 = i2 - i8;
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
        }
        if (!this.f2033m.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        s(i3, i4, i5, i6, this.f2034m0, 0, iArr);
        int i9 = iArr[0];
        int i10 = i5 - i9;
        int i11 = iArr[1];
        int i12 = i6 - i11;
        boolean z3 = (i9 == 0 && i11 == 0) ? false : true;
        int i13 = this.f2002N;
        int[] iArr2 = this.f2034m0;
        int i14 = iArr2[0];
        this.f2002N = i13 - i14;
        int i15 = this.f2003O;
        int i16 = iArr2[1];
        this.f2003O = i15 - i16;
        int[] iArr3 = this.f2036n0;
        iArr3[0] = iArr3[0] + i14;
        iArr3[1] = iArr3[1] + i16;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && (motionEvent.getSource() & 8194) != 8194) {
                float x2 = motionEvent.getX();
                float f2 = i10;
                float y2 = motionEvent.getY();
                float f3 = i12;
                if (f2 < 0.0f) {
                    v();
                    S.d.a(this.f1993D, (-f2) / getWidth(), 1.0f - (y2 / getHeight()));
                } else if (f2 > 0.0f) {
                    w();
                    S.d.a(this.f1995F, f2 / getWidth(), y2 / getHeight());
                } else {
                    z2 = false;
                    if (f3 >= 0.0f) {
                        x();
                        S.d.a(this.f1994E, (-f3) / getHeight(), x2 / getWidth());
                    } else {
                        if (f3 > 0.0f) {
                            u();
                            S.d.a(this.f1996G, f3 / getHeight(), 1.0f - (x2 / getWidth()));
                        }
                        if (!z2 || f2 != 0.0f || f3 != 0.0f) {
                            WeakHashMap weakHashMap = P.f711a;
                            postInvalidateOnAnimation();
                        }
                    }
                    z2 = true;
                    if (!z2) {
                    }
                    WeakHashMap weakHashMap2 = P.f711a;
                    postInvalidateOnAnimation();
                }
                z2 = true;
                if (f3 >= 0.0f) {
                }
                z2 = true;
                if (!z2) {
                }
                WeakHashMap weakHashMap22 = P.f711a;
                postInvalidateOnAnimation();
            }
            l(i, i2);
        }
        if (i3 != 0 || i4 != 0) {
            t(i3, i4);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z3 && i3 == 0 && i4 == 0) ? false : true;
    }

    public final void X(int i, int i2, int[] iArr) {
        V v2;
        h hVar = this.e;
        a0();
        P();
        int i3 = I.h.f579a;
        Trace.beginSection("RV Scroll");
        S s2 = this.f2017c0;
        z(s2);
        C0147M c0147m = this.f2014b;
        int m02 = i != 0 ? this.f2031l.m0(i, c0147m, s2) : 0;
        int o0 = i2 != 0 ? this.f2031l.o0(i2, c0147m, s2) : 0;
        Trace.endSection();
        int f2 = hVar.f();
        for (int i4 = 0; i4 < f2; i4++) {
            View e = hVar.e(i4);
            V H = H(e);
            if (H != null && (v2 = H.i) != null) {
                int left = e.getLeft();
                int top = e.getTop();
                View view = v2.f2958a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        Q(true);
        b0(false);
        if (iArr != null) {
            iArr[0] = m02;
            iArr[1] = o0;
        }
    }

    public final void Y(int i) {
        C0170u c0170u;
        if (this.f2046u) {
            return;
        }
        setScrollState(0);
        U u2 = this.f2011W;
        u2.f2956g.removeCallbacks(u2);
        u2.f2953c.abortAnimation();
        AbstractC0141G abstractC0141G = this.f2031l;
        if (abstractC0141G != null && (c0170u = abstractC0141G.e) != null) {
            c0170u.i();
        }
        AbstractC0141G abstractC0141G2 = this.f2031l;
        if (abstractC0141G2 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC0141G2.n0(i);
            awakenScrollBars();
        }
    }

    public final void Z(int i, int i2, boolean z2) {
        AbstractC0141G abstractC0141G = this.f2031l;
        if (abstractC0141G == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f2046u) {
            return;
        }
        if (!abstractC0141G.d()) {
            i = 0;
        }
        if (!this.f2031l.e()) {
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
        this.f2011W.b(i, i2, Integer.MIN_VALUE, null);
    }

    public final void a0() {
        int i = this.f2044s + 1;
        this.f2044s = i;
        if (i != 1 || this.f2046u) {
            return;
        }
        this.f2045t = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        AbstractC0141G abstractC0141G = this.f2031l;
        if (abstractC0141G != null) {
            abstractC0141G.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    public final void b0(boolean z2) {
        if (this.f2044s < 1) {
            this.f2044s = 1;
        }
        if (!z2 && !this.f2046u) {
            this.f2045t = false;
        }
        if (this.f2044s == 1) {
            if (z2 && this.f2045t && !this.f2046u && this.f2031l != null && this.f2029k != null) {
                o();
            }
            if (!this.f2046u) {
                this.f2045t = false;
            }
        }
        this.f2044s--;
    }

    public final void c0(int i) {
        getScrollingChildHelper().h(i);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0142H) && this.f2031l.f((C0142H) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        AbstractC0141G abstractC0141G = this.f2031l;
        if (abstractC0141G != null && abstractC0141G.d()) {
            return this.f2031l.j(this.f2017c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        AbstractC0141G abstractC0141G = this.f2031l;
        if (abstractC0141G != null && abstractC0141G.d()) {
            return this.f2031l.k(this.f2017c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        AbstractC0141G abstractC0141G = this.f2031l;
        if (abstractC0141G != null && abstractC0141G.d()) {
            return this.f2031l.l(this.f2017c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        AbstractC0141G abstractC0141G = this.f2031l;
        if (abstractC0141G != null && abstractC0141G.e()) {
            return this.f2031l.m(this.f2017c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        AbstractC0141G abstractC0141G = this.f2031l;
        if (abstractC0141G != null && abstractC0141G.e()) {
            return this.f2031l.n(this.f2017c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        AbstractC0141G abstractC0141G = this.f2031l;
        if (abstractC0141G != null && abstractC0141G.e()) {
            return this.f2031l.o(this.f2017c0);
        }
        return 0;
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
        ArrayList arrayList = this.f2033m;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i = 0; i < size; i++) {
            ((AbstractC0138D) arrayList.get(i)).b(canvas, this);
        }
        EdgeEffect edgeEffect = this.f1993D;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f2023g ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f1993D;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f1994E;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f2023g) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f1994E;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f1995F;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f2023g ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f1995F;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f1996G;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f2023g) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f1996G;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(save4);
        }
        if ((z2 || this.H == null || arrayList.size() <= 0 || !this.H.f()) ? z2 : true) {
            WeakHashMap weakHashMap = P.f711a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final void f(V v2) {
        View view = v2.f2958a;
        boolean z2 = view.getParent() == this;
        this.f2014b.j(H(view));
        if (v2.k()) {
            this.e.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z2) {
            this.e.a(view, -1, true);
            return;
        }
        h hVar = this.e;
        int indexOfChild = ((C0173x) hVar.f591b).f3135a.indexOfChild(view);
        if (indexOfChild >= 0) {
            ((a) hVar.f592c).i(indexOfChild);
            hVar.p(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x018a, code lost:
    
        if ((r5 * r6) < 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0192, code lost:
    
        if ((r5 * r6) > 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x015e, code lost:
    
        if (r7 > 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x017c, code lost:
    
        if (r5 > 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x017f, code lost:
    
        if (r7 < 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0182, code lost:
    
        if (r5 < 0) goto L136;
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
    /* JADX WARN: Removed duplicated region for block: B:61:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View focusSearch(View view, int i) {
        View view2;
        int i2;
        char c2;
        boolean z2;
        this.f2031l.getClass();
        boolean z3 = true;
        boolean z4 = (this.f2029k == null || this.f2031l == null || L() || this.f2046u) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        S s2 = this.f2017c0;
        C0147M c0147m = this.f2014b;
        if (z4 && (i == 2 || i == 1)) {
            if (this.f2031l.e()) {
                if (focusFinder.findNextFocus(this, view, i == 2 ? 130 : 33) == null) {
                    z2 = true;
                    if (!z2 && this.f2031l.d()) {
                        z2 = focusFinder.findNextFocus(this, view, !((this.f2031l.C() != 1) ^ (i != 2)) ? 66 : 17) != null;
                    }
                    if (z2) {
                        m();
                        if (A(view) == null) {
                            return null;
                        }
                        a0();
                        this.f2031l.S(view, i, c0147m, s2);
                        b0(false);
                    }
                    view2 = focusFinder.findNextFocus(this, view, i);
                }
            }
            z2 = false;
            if (!z2) {
                if (focusFinder.findNextFocus(this, view, !((this.f2031l.C() != 1) ^ (i != 2)) ? 66 : 17) != null) {
                }
            }
            if (z2) {
            }
            view2 = focusFinder.findNextFocus(this, view, i);
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i);
            if (findNextFocus == null && z4) {
                m();
                if (A(view) == null) {
                    return null;
                }
                a0();
                view2 = this.f2031l.S(view, i, c0147m, s2);
                b0(false);
            } else {
                view2 = findNextFocus;
            }
        }
        if (view2 != null && !view2.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i);
            }
            U(view2, null);
            return view;
        }
        if (view2 != null && view2 != this) {
            if (A(view2) == null) {
                z3 = false;
            } else if (view != null && A(view) != null) {
                int width = view.getWidth();
                int height = view.getHeight();
                Rect rect = this.f2025h;
                rect.set(0, 0, width, height);
                int width2 = view2.getWidth();
                int height2 = view2.getHeight();
                Rect rect2 = this.i;
                rect2.set(0, 0, width2, height2);
                offsetDescendantRectToMyCoords(view, rect);
                offsetDescendantRectToMyCoords(view2, rect2);
                int i3 = this.f2031l.C() == 1 ? -1 : 1;
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
                                        throw new IllegalArgumentException("Invalid direction: " + i + y());
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

    public final void g(AbstractC0138D abstractC0138D) {
        AbstractC0141G abstractC0141G = this.f2031l;
        if (abstractC0141G != null) {
            abstractC0141G.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f2033m;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(abstractC0138D);
        N();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC0141G abstractC0141G = this.f2031l;
        if (abstractC0141G != null) {
            return abstractC0141G.r();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC0141G abstractC0141G = this.f2031l;
        if (abstractC0141G != null) {
            return abstractC0141G.s(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC0174y getAdapter() {
        return this.f2029k;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC0141G abstractC0141G = this.f2031l;
        if (abstractC0141G == null) {
            return super.getBaseline();
        }
        abstractC0141G.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f2023g;
    }

    public X getCompatAccessibilityDelegate() {
        return this.f2028j0;
    }

    public C0136B getEdgeEffectFactory() {
        return this.f1992C;
    }

    public AbstractC0137C getItemAnimator() {
        return this.H;
    }

    public int getItemDecorationCount() {
        return this.f2033m.size();
    }

    public AbstractC0141G getLayoutManager() {
        return this.f2031l;
    }

    public int getMaxFlingVelocity() {
        return this.f2007S;
    }

    public int getMinFlingVelocity() {
        return this.f2006R;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public AbstractC0143I getOnFlingListener() {
        return this.f2005Q;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f2010V;
    }

    public C0146L getRecycledViewPool() {
        return this.f2014b.c();
    }

    public int getScrollState() {
        return this.f1997I;
    }

    public final void h(AbstractC0144J abstractC0144J) {
        if (this.f2020e0 == null) {
            this.f2020e0 = new ArrayList();
        }
        this.f2020e0.add(abstractC0144J);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(String str) {
        if (L()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + y());
        }
        if (this.f1991B > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + y()));
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f2038p;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f2046u;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f770d;
    }

    public final void k() {
        int m2 = this.e.m();
        for (int i = 0; i < m2; i++) {
            V I2 = I(this.e.l(i));
            if (!I2.p()) {
                I2.f2961d = -1;
                I2.f2963g = -1;
            }
        }
        C0147M c0147m = this.f2014b;
        ArrayList arrayList = c0147m.f2928c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            V v2 = (V) arrayList.get(i2);
            v2.f2961d = -1;
            v2.f2963g = -1;
        }
        ArrayList arrayList2 = c0147m.f2926a;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            V v3 = (V) arrayList2.get(i3);
            v3.f2961d = -1;
            v3.f2963g = -1;
        }
        ArrayList arrayList3 = c0147m.f2927b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                V v4 = (V) c0147m.f2927b.get(i4);
                v4.f2961d = -1;
                v4.f2963g = -1;
            }
        }
    }

    public final void l(int i, int i2) {
        boolean z2;
        EdgeEffect edgeEffect = this.f1993D;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z2 = false;
        } else {
            this.f1993D.onRelease();
            z2 = this.f1993D.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f1995F;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f1995F.onRelease();
            z2 |= this.f1995F.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1994E;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f1994E.onRelease();
            z2 |= this.f1994E.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1996G;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f1996G.onRelease();
            z2 |= this.f1996G.isFinished();
        }
        if (z2) {
            WeakHashMap weakHashMap = P.f711a;
            postInvalidateOnAnimation();
        }
    }

    public final void m() {
        J.d dVar = this.f2018d;
        if (!this.f2042r || this.f2050y) {
            int i = I.h.f579a;
            Trace.beginSection("RV FullInvalidate");
            o();
            Trace.endSection();
            return;
        }
        if (dVar.f()) {
            dVar.getClass();
            if (dVar.f()) {
                int i2 = I.h.f579a;
                Trace.beginSection("RV FullInvalidate");
                o();
                Trace.endSection();
            }
        }
    }

    public final void n(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = P.f711a;
        setMeasuredDimension(AbstractC0141G.g(i, paddingRight, getMinimumWidth()), AbstractC0141G.g(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x0323, code lost:
    
        if (((java.util.ArrayList) r19.e.f593d).contains(getFocusedChild()) == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0382, code lost:
    
        if (r6.hasFocusable() != false) goto L181;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [h0.V] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o() {
        ?? r10;
        View view;
        View findViewById;
        boolean z2;
        C0019o c0019o;
        int i;
        RecyclerView recyclerView;
        boolean g2;
        if (this.f2029k == null) {
            Log.e("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f2031l == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        S s2 = this.f2017c0;
        s2.i = false;
        if (s2.f2943d == 1) {
            p();
            this.f2031l.p0(this);
            q();
        } else {
            J.d dVar = this.f2018d;
            if ((((ArrayList) dVar.f627d).isEmpty() || ((ArrayList) dVar.f626c).isEmpty()) && this.f2031l.f2914n == getWidth() && this.f2031l.f2915o == getHeight()) {
                this.f2031l.p0(this);
            } else {
                this.f2031l.p0(this);
                q();
            }
        }
        s2.a(4);
        a0();
        P();
        s2.f2943d = 1;
        boolean z3 = s2.j;
        View view2 = null;
        Long l2 = null;
        C0147M c0147m = this.f2014b;
        c cVar = this.f2021f;
        if (z3) {
            int f2 = this.e.f() - 1;
            while (f2 >= 0) {
                V I2 = I(this.e.e(f2));
                if (!I2.p()) {
                    long G2 = G(I2);
                    this.H.getClass();
                    C0019o c0019o2 = new C0019o();
                    c0019o2.a(I2);
                    V v2 = (V) ((q.e) cVar.f69c).c(G2, l2);
                    if (v2 == null || v2.p()) {
                        cVar.c(I2, c0019o2);
                    } else {
                        k kVar = (k) cVar.f68b;
                        f0 f0Var = (f0) kVar.getOrDefault(v2, l2);
                        boolean z4 = (f0Var == null || (f0Var.f3028a & 1) == 0) ? false : true;
                        f0 f0Var2 = (f0) kVar.getOrDefault(I2, l2);
                        boolean z5 = (f0Var2 == null || (f0Var2.f3028a & 1) == 0) ? false : true;
                        if (z4 && v2 == I2) {
                            cVar.c(I2, c0019o2);
                        } else {
                            C0019o I3 = cVar.I(v2, 4);
                            cVar.c(I2, c0019o2);
                            C0019o I4 = cVar.I(I2, 8);
                            if (I3 == null) {
                                int f3 = this.e.f();
                                for (int i2 = 0; i2 < f3; i2++) {
                                    V I5 = I(this.e.e(i2));
                                    if (I5 != I2 && G(I5) == G2) {
                                        AbstractC0174y abstractC0174y = this.f2029k;
                                        if (abstractC0174y == null || !abstractC0174y.f3137b) {
                                            throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + I5 + " \n View Holder 2:" + I2 + y());
                                        }
                                        throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + I5 + " \n View Holder 2:" + I2 + y());
                                    }
                                }
                                Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + v2 + " cannot be found but it is necessary for " + I2 + y());
                            } else {
                                v2.o(false);
                                if (z4) {
                                    f(v2);
                                }
                                if (v2 != I2) {
                                    if (z5) {
                                        f(I2);
                                    }
                                    v2.f2964h = I2;
                                    f(v2);
                                    c0147m.j(v2);
                                    I2.o(false);
                                    I2.i = v2;
                                }
                                if (this.H.a(v2, I2, I3, I4)) {
                                    S();
                                }
                            }
                        }
                    }
                }
                f2--;
                l2 = null;
            }
            k kVar2 = (k) cVar.f68b;
            for (int i3 = kVar2.f3925c - 1; i3 >= 0; i3--) {
                V v3 = (V) kVar2.h(i3);
                f0 f0Var3 = (f0) kVar2.i(i3);
                int i4 = f0Var3.f3028a;
                int i5 = i4 & 3;
                C0173x c0173x = this.f2043r0;
                if (i5 == 3) {
                    RecyclerView recyclerView2 = c0173x.f3135a;
                    recyclerView2.f2031l.i0(v3.f2958a, recyclerView2.f2014b);
                } else if ((i4 & 1) != 0) {
                    C0019o c0019o3 = f0Var3.f3029b;
                    if (c0019o3 == null) {
                        RecyclerView recyclerView3 = c0173x.f3135a;
                        recyclerView3.f2031l.i0(v3.f2958a, recyclerView3.f2014b);
                    } else {
                        c0173x.g(v3, c0019o3, f0Var3.f3030c);
                    }
                } else if ((i4 & 14) == 14) {
                    c0173x.f(v3, f0Var3.f3029b, f0Var3.f3030c);
                } else if ((i4 & 12) == 12) {
                    C0019o c0019o4 = f0Var3.f3029b;
                    C0019o c0019o5 = f0Var3.f3030c;
                    c0173x.getClass();
                    v3.o(false);
                    RecyclerView recyclerView4 = c0173x.f3135a;
                    if (!recyclerView4.f2050y) {
                        C0158h c0158h = (C0158h) recyclerView4.H;
                        c0158h.getClass();
                        int i6 = c0019o4.f781a;
                        int i7 = c0019o5.f781a;
                        if (i6 == i7 && c0019o4.f782b == c0019o5.f782b) {
                            c0158h.c(v3);
                            recyclerView = recyclerView4;
                            g2 = false;
                        } else {
                            recyclerView = recyclerView4;
                            g2 = c0158h.g(v3, i6, c0019o4.f782b, i7, c0019o5.f782b);
                        }
                        if (g2) {
                            recyclerView.S();
                        }
                    } else if (recyclerView4.H.a(v3, v3, c0019o4, c0019o5)) {
                        recyclerView4.S();
                    }
                } else {
                    if ((i4 & 4) != 0) {
                        c0019o = null;
                        c0173x.g(v3, f0Var3.f3029b, null);
                    } else {
                        c0019o = null;
                        if ((i4 & 8) != 0) {
                            c0173x.f(v3, f0Var3.f3029b, f0Var3.f3030c);
                        }
                    }
                    i = 0;
                    f0Var3.f3028a = i;
                    f0Var3.f3029b = c0019o;
                    f0Var3.f3030c = c0019o;
                    f0.f3027d.c(f0Var3);
                }
                i = 0;
                c0019o = null;
                f0Var3.f3028a = i;
                f0Var3.f3029b = c0019o;
                f0Var3.f3030c = c0019o;
                f0.f3027d.c(f0Var3);
            }
            view2 = null;
        }
        this.f2031l.h0(c0147m);
        s2.f2941b = s2.e;
        this.f2050y = false;
        this.f2051z = false;
        s2.j = false;
        s2.f2947k = false;
        this.f2031l.f2908f = false;
        ArrayList arrayList = c0147m.f2927b;
        if (arrayList != null) {
            arrayList.clear();
        }
        AbstractC0141G abstractC0141G = this.f2031l;
        if (abstractC0141G.f2911k) {
            abstractC0141G.j = 0;
            abstractC0141G.f2911k = false;
            c0147m.k();
        }
        this.f2031l.c0(s2);
        Q(true);
        b0(false);
        ((k) cVar.f68b).clear();
        ((q.e) cVar.f69c).a();
        int[] iArr = this.f2030k0;
        int i8 = iArr[0];
        int i9 = iArr[1];
        C(iArr);
        if ((iArr[0] == i8 && iArr[1] == i9) ? false : true) {
            t(0, 0);
        }
        if (this.f2010V && this.f2029k != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (!isFocused()) {
            }
            long j = s2.f2949m;
            if (j != -1 && (z2 = this.f2029k.f3137b) && z2) {
                int m2 = this.e.m();
                r10 = view2;
                int i10 = 0;
                while (true) {
                    if (i10 >= m2) {
                        break;
                    }
                    V I6 = I(this.e.l(i10));
                    if (I6 != null && !I6.i() && I6.e == j) {
                        if (!((ArrayList) this.e.f593d).contains(I6.f2958a)) {
                            r10 = I6;
                            break;
                        }
                        r10 = I6;
                    }
                    i10++;
                    r10 = r10;
                }
            } else {
                r10 = view2;
            }
            if (r10 != null) {
                ArrayList arrayList2 = (ArrayList) this.e.f593d;
                view = r10.f2958a;
                if (!arrayList2.contains(view)) {
                }
            }
            if (this.e.f() > 0) {
                int i11 = s2.f2948l;
                if (i11 == -1) {
                    i11 = 0;
                }
                int b2 = s2.b();
                for (int i12 = i11; i12 < b2; i12++) {
                    V E2 = E(i12);
                    if (E2 == null) {
                        break;
                    }
                    View view3 = E2.f2958a;
                    if (view3.hasFocusable()) {
                        view2 = view3;
                        break;
                    }
                }
                for (int min = Math.min(b2, i11) - 1; min >= 0; min--) {
                    V E3 = E(min);
                    if (E3 == null) {
                        break;
                    }
                    view = E3.f2958a;
                    if (view.hasFocusable()) {
                        view2 = view;
                        break;
                    }
                }
            }
            if (view2 != null) {
                int i13 = s2.f2950n;
                if (i13 != -1 && (findViewById = view2.findViewById(i13)) != null && findViewById.isFocusable()) {
                    view2 = findViewById;
                }
                view2.requestFocus();
            }
        }
        s2.f2949m = -1L;
        s2.f2948l = -1;
        s2.f2950n = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        if (r1 >= 30.0f) goto L20;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAttachedToWindow() {
        float f2;
        super.onAttachedToWindow();
        this.f1990A = 0;
        this.f2038p = true;
        this.f2042r = this.f2042r && !isLayoutRequested();
        AbstractC0141G abstractC0141G = this.f2031l;
        if (abstractC0141G != null) {
            abstractC0141G.f2909g = true;
            abstractC0141G.Q(this);
        }
        this.f2027i0 = false;
        ThreadLocal threadLocal = RunnableC0164n.e;
        RunnableC0164n runnableC0164n = (RunnableC0164n) threadLocal.get();
        this.f2013a0 = runnableC0164n;
        if (runnableC0164n == null) {
            RunnableC0164n runnableC0164n2 = new RunnableC0164n();
            runnableC0164n2.f3085a = new ArrayList();
            runnableC0164n2.f3088d = new ArrayList();
            this.f2013a0 = runnableC0164n2;
            WeakHashMap weakHashMap = P.f711a;
            Display display = getDisplay();
            if (!isInEditMode() && display != null) {
                f2 = display.getRefreshRate();
            }
            f2 = 60.0f;
            RunnableC0164n runnableC0164n3 = this.f2013a0;
            runnableC0164n3.f3087c = (long) (1.0E9f / f2);
            threadLocal.set(runnableC0164n3);
        }
        this.f2013a0.f3085a.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C0170u c0170u;
        super.onDetachedFromWindow();
        AbstractC0137C abstractC0137C = this.H;
        if (abstractC0137C != null) {
            abstractC0137C.e();
        }
        setScrollState(0);
        U u2 = this.f2011W;
        u2.f2956g.removeCallbacks(u2);
        u2.f2953c.abortAnimation();
        AbstractC0141G abstractC0141G = this.f2031l;
        if (abstractC0141G != null && (c0170u = abstractC0141G.e) != null) {
            c0170u.i();
        }
        this.f2038p = false;
        AbstractC0141G abstractC0141G2 = this.f2031l;
        if (abstractC0141G2 != null) {
            abstractC0141G2.f2909g = false;
            abstractC0141G2.R(this);
        }
        this.f2039p0.clear();
        removeCallbacks(this.f2041q0);
        this.f2021f.getClass();
        while (f0.f3027d.a() != null) {
        }
        RunnableC0164n runnableC0164n = this.f2013a0;
        if (runnableC0164n != null) {
            runnableC0164n.f3085a.remove(this);
            this.f2013a0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f2033m;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0138D) arrayList.get(i)).a(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f2;
        float f3;
        if (this.f2031l != null && !this.f2046u && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f2 = this.f2031l.e() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f2031l.d()) {
                    f3 = motionEvent.getAxisValue(10);
                    if (f2 == 0.0f || f3 != 0.0f) {
                        W((int) (f3 * this.f2008T), (int) (f2 * this.f2009U), motionEvent);
                    }
                }
                f3 = 0.0f;
                if (f2 == 0.0f) {
                }
                W((int) (f3 * this.f2008T), (int) (f2 * this.f2009U), motionEvent);
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f2031l.e()) {
                        f2 = -axisValue;
                        f3 = 0.0f;
                        if (f2 == 0.0f) {
                        }
                        W((int) (f3 * this.f2008T), (int) (f2 * this.f2009U), motionEvent);
                    } else if (this.f2031l.d()) {
                        f3 = axisValue;
                        f2 = 0.0f;
                        if (f2 == 0.0f) {
                        }
                        W((int) (f3 * this.f2008T), (int) (f2 * this.f2009U), motionEvent);
                    }
                }
                f2 = 0.0f;
                f3 = 0.0f;
                if (f2 == 0.0f) {
                }
                W((int) (f3 * this.f2008T), (int) (f2 * this.f2009U), motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (this.f2046u) {
            return false;
        }
        this.f2037o = null;
        if (B(motionEvent)) {
            V();
            setScrollState(0);
            return true;
        }
        AbstractC0141G abstractC0141G = this.f2031l;
        if (abstractC0141G == null) {
            return false;
        }
        boolean d2 = abstractC0141G.d();
        boolean e = this.f2031l.e();
        if (this.f1999K == null) {
            this.f1999K = VelocityTracker.obtain();
        }
        this.f1999K.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f2047v) {
                this.f2047v = false;
            }
            this.f1998J = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.f2002N = x2;
            this.f2000L = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.f2003O = y2;
            this.f2001M = y2;
            if (this.f1997I == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                c0(1);
            }
            int[] iArr = this.f2036n0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i = d2;
            if (e) {
                i = (d2 ? 1 : 0) | 2;
            }
            getScrollingChildHelper().g(i, 0);
        } else if (actionMasked == 1) {
            this.f1999K.clear();
            c0(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f1998J);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f1998J + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f1997I != 1) {
                int i2 = x3 - this.f2000L;
                int i3 = y3 - this.f2001M;
                if (d2 == 0 || Math.abs(i2) <= this.f2004P) {
                    z2 = false;
                } else {
                    this.f2002N = x3;
                    z2 = true;
                }
                if (e && Math.abs(i3) > this.f2004P) {
                    this.f2003O = y3;
                    z2 = true;
                }
                if (z2) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            V();
            setScrollState(0);
        } else if (actionMasked == 5) {
            this.f1998J = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f2002N = x4;
            this.f2000L = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f2003O = y4;
            this.f2001M = y4;
        } else if (actionMasked == 6) {
            R(motionEvent);
        }
        return this.f1997I == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int i5 = I.h.f579a;
        Trace.beginSection("RV OnLayout");
        o();
        Trace.endSection();
        this.f2042r = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        AbstractC0141G abstractC0141G = this.f2031l;
        if (abstractC0141G == null) {
            n(i, i2);
            return;
        }
        boolean L2 = abstractC0141G.L();
        S s2 = this.f2017c0;
        if (!L2) {
            if (this.f2040q) {
                this.f2031l.f2905b.n(i, i2);
                return;
            }
            if (s2.f2947k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            AbstractC0174y abstractC0174y = this.f2029k;
            if (abstractC0174y != null) {
                s2.e = abstractC0174y.a();
            } else {
                s2.e = 0;
            }
            a0();
            this.f2031l.f2905b.n(i, i2);
            b0(false);
            s2.f2945g = false;
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.f2031l.f2905b.n(i, i2);
        if ((mode == 1073741824 && mode2 == 1073741824) || this.f2029k == null) {
            return;
        }
        if (s2.f2943d == 1) {
            p();
        }
        this.f2031l.q0(i, i2);
        s2.i = true;
        q();
        this.f2031l.s0(i, i2);
        if (this.f2031l.v0()) {
            this.f2031l.q0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            s2.i = true;
            q();
            this.f2031l.s0(i, i2);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (L()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C0149O)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0149O c0149o = (C0149O) parcelable;
        this.f2016c = c0149o;
        super.onRestoreInstanceState(c0149o.f1148a);
        AbstractC0141G abstractC0141G = this.f2031l;
        if (abstractC0141G == null || (parcelable2 = this.f2016c.f2933c) == null) {
            return;
        }
        abstractC0141G.d0(parcelable2);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0149O c0149o = new C0149O(super.onSaveInstanceState());
        C0149O c0149o2 = this.f2016c;
        if (c0149o2 != null) {
            c0149o.f2933c = c0149o2.f2933c;
        } else {
            AbstractC0141G abstractC0141G = this.f2031l;
            if (abstractC0141G != null) {
                c0149o.f2933c = abstractC0141G.e0();
            } else {
                c0149o.f2933c = null;
            }
        }
        return c0149o;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.f1996G = null;
        this.f1994E = null;
        this.f1995F = null;
        this.f1993D = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0213  */
    /* JADX WARN: Type inference failed for: r7v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v7 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        RecyclerView recyclerView;
        MotionEvent motionEvent2;
        MotionEvent motionEvent3;
        MotionEvent motionEvent4;
        RecyclerView recyclerView2;
        int minFlingVelocity;
        boolean z3;
        int i;
        PointF a2;
        int i2;
        boolean z4;
        if (this.f2046u || this.f2047v) {
            return false;
        }
        C0161k c0161k = this.f2037o;
        if (c0161k == null) {
            z2 = motionEvent.getAction() == 0 ? false : B(motionEvent);
        } else {
            if (c0161k.f3071v != 0) {
                if (motionEvent.getAction() == 0) {
                    boolean d2 = c0161k.d(motionEvent.getX(), motionEvent.getY());
                    boolean c2 = c0161k.c(motionEvent.getX(), motionEvent.getY());
                    if (d2 || c2) {
                        if (c2) {
                            c0161k.f3072w = 1;
                            c0161k.f3065p = (int) motionEvent.getX();
                        } else if (d2) {
                            c0161k.f3072w = 2;
                            c0161k.f3062m = (int) motionEvent.getY();
                        }
                        c0161k.f(2);
                    }
                } else if (motionEvent.getAction() == 1 && c0161k.f3071v == 2) {
                    c0161k.f3062m = 0.0f;
                    c0161k.f3065p = 0.0f;
                    c0161k.f(1);
                    c0161k.f3072w = 0;
                } else if (motionEvent.getAction() == 2 && c0161k.f3071v == 2) {
                    c0161k.g();
                    int i3 = c0161k.f3072w;
                    int i4 = c0161k.f3054b;
                    if (i3 == 1) {
                        float x2 = motionEvent.getX();
                        int[] iArr = c0161k.f3074y;
                        iArr[0] = i4;
                        int i5 = c0161k.f3066q - i4;
                        iArr[1] = i5;
                        float max = Math.max(i4, Math.min(i5, x2));
                        if (Math.abs(c0161k.f3064o - max) >= 2.0f) {
                            int e = C0161k.e(c0161k.f3065p, max, iArr, c0161k.f3068s.computeHorizontalScrollRange(), c0161k.f3068s.computeHorizontalScrollOffset(), c0161k.f3066q);
                            if (e != 0) {
                                c0161k.f3068s.scrollBy(e, 0);
                            }
                            c0161k.f3065p = max;
                        }
                    }
                    if (c0161k.f3072w == 2) {
                        float y2 = motionEvent.getY();
                        int[] iArr2 = c0161k.f3073x;
                        iArr2[0] = i4;
                        int i6 = c0161k.f3067r - i4;
                        iArr2[1] = i6;
                        float max2 = Math.max(i4, Math.min(i6, y2));
                        if (Math.abs(c0161k.f3061l - max2) >= 2.0f) {
                            int e2 = C0161k.e(c0161k.f3062m, max2, iArr2, c0161k.f3068s.computeVerticalScrollRange(), c0161k.f3068s.computeVerticalScrollOffset(), c0161k.f3067r);
                            if (e2 != 0) {
                                c0161k.f3068s.scrollBy(0, e2);
                            }
                            c0161k.f3062m = max2;
                        }
                    }
                }
            }
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.f2037o = null;
            }
            z2 = true;
        }
        if (z2) {
            V();
            setScrollState(0);
            return true;
        }
        AbstractC0141G abstractC0141G = this.f2031l;
        if (abstractC0141G == null) {
            return false;
        }
        boolean d3 = abstractC0141G.d();
        boolean e3 = this.f2031l.e();
        if (this.f1999K == null) {
            this.f1999K = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        int[] iArr3 = this.f2036n0;
        if (actionMasked == 0) {
            iArr3[1] = 0;
            iArr3[0] = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(iArr3[0], iArr3[1]);
        if (actionMasked == 0) {
            recyclerView = this;
            motionEvent2 = obtain;
            recyclerView.f1998J = motionEvent.getPointerId(0);
            int x3 = (int) (motionEvent.getX() + 0.5f);
            recyclerView.f2002N = x3;
            recyclerView.f2000L = x3;
            int y3 = (int) (motionEvent.getY() + 0.5f);
            recyclerView.f2003O = y3;
            recyclerView.f2001M = y3;
            int i7 = d3;
            if (e3) {
                i7 = (d3 ? 1 : 0) | 2;
            }
            getScrollingChildHelper().g(i7, 0);
        } else {
            if (actionMasked == 1) {
                this.f1999K.addMovement(obtain);
                VelocityTracker velocityTracker = this.f1999K;
                int i8 = this.f2007S;
                velocityTracker.computeCurrentVelocity(1000, i8);
                float f2 = d3 != 0 ? -this.f1999K.getXVelocity(this.f1998J) : 0.0f;
                float f3 = e3 ? -this.f1999K.getYVelocity(this.f1998J) : 0.0f;
                if (f2 == 0.0f && f3 == 0.0f) {
                    recyclerView2 = this;
                    i2 = 0;
                    motionEvent4 = obtain;
                } else {
                    int i9 = (int) f2;
                    int i10 = (int) f3;
                    AbstractC0141G abstractC0141G2 = this.f2031l;
                    if (abstractC0141G2 == null) {
                        Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                    } else if (!this.f2046u) {
                        int d4 = abstractC0141G2.d();
                        boolean e4 = this.f2031l.e();
                        int i11 = this.f2006R;
                        if (d4 == 0 || Math.abs(i9) < i11) {
                            i9 = 0;
                        }
                        if (!e4 || Math.abs(i10) < i11) {
                            i10 = 0;
                        }
                        if (i9 != 0 || i10 != 0) {
                            float f4 = i9;
                            float f5 = i10;
                            if (!dispatchNestedPreFling(f4, f5)) {
                                boolean z5 = d4 != 0 || e4;
                                dispatchNestedFling(f4, f5, z5);
                                AbstractC0143I abstractC0143I = this.f2005Q;
                                if (abstractC0143I != null) {
                                    C0172w c0172w = (C0172w) abstractC0143I;
                                    AbstractC0141G layoutManager = c0172w.f3131a.getLayoutManager();
                                    if (layoutManager != 0 && c0172w.f3131a.getAdapter() != null && ((Math.abs(i10) > (minFlingVelocity = c0172w.f3131a.getMinFlingVelocity()) || Math.abs(i9) > minFlingVelocity) && ((z3 = layoutManager instanceof Q)))) {
                                        A0.c cVar = !z3 ? null : new A0.c(c0172w, c0172w.f3131a.getContext(), 1);
                                        if (cVar != null) {
                                            int B2 = layoutManager.B();
                                            if (B2 != 0) {
                                                g e5 = layoutManager.e() ? c0172w.e(layoutManager) : layoutManager.d() ? c0172w.d(layoutManager) : null;
                                                if (e5 != null) {
                                                    int v2 = layoutManager.v();
                                                    motionEvent4 = obtain;
                                                    int i12 = Integer.MIN_VALUE;
                                                    int i13 = Integer.MAX_VALUE;
                                                    int i14 = 0;
                                                    View view = null;
                                                    View view2 = null;
                                                    while (i14 < v2) {
                                                        int i15 = v2;
                                                        View u2 = layoutManager.u(i14);
                                                        if (u2 != null) {
                                                            int b2 = C0172w.b(u2, e5);
                                                            if (b2 <= 0 && b2 > i12) {
                                                                i12 = b2;
                                                                view2 = u2;
                                                            }
                                                            if (b2 >= 0 && b2 < i13) {
                                                                i13 = b2;
                                                                view = u2;
                                                            }
                                                        }
                                                        i14++;
                                                        v2 = i15;
                                                    }
                                                    boolean z6 = !layoutManager.d() ? i10 <= 0 : i9 <= 0;
                                                    if (z6 && view != null) {
                                                        i = AbstractC0141G.H(view);
                                                    } else if (z6 || view2 == null) {
                                                        if (z6) {
                                                            view = view2;
                                                        }
                                                        if (view != null) {
                                                            int H = ((z3 && (a2 = ((Q) layoutManager).a(layoutManager.B() - 1)) != null && ((a2.x > 0.0f ? 1 : (a2.x == 0.0f ? 0 : -1)) < 0 || (a2.y > 0.0f ? 1 : (a2.y == 0.0f ? 0 : -1)) < 0)) == z6 ? -1 : 1) + AbstractC0141G.H(view);
                                                            if (H >= 0 && H < B2) {
                                                                i = H;
                                                            }
                                                        }
                                                        i = -1;
                                                    } else {
                                                        i = AbstractC0141G.H(view2);
                                                    }
                                                    if (i != -1) {
                                                        cVar.f3117a = i;
                                                        layoutManager.y0(cVar);
                                                        V();
                                                        motionEvent3 = motionEvent4;
                                                        motionEvent3.recycle();
                                                        return true;
                                                    }
                                                    if (z5) {
                                                        if (e4) {
                                                            d4 = (d4 == true ? 1 : 0) | 2;
                                                        }
                                                        getScrollingChildHelper().g(d4, 1);
                                                        int i16 = -i8;
                                                        int max3 = Math.max(i16, Math.min(i9, i8));
                                                        int max4 = Math.max(i16, Math.min(i10, i8));
                                                        U u3 = this.f2011W;
                                                        RecyclerView recyclerView3 = u3.f2956g;
                                                        recyclerView3.setScrollState(2);
                                                        u3.f2952b = 0;
                                                        u3.f2951a = 0;
                                                        Interpolator interpolator = u3.f2954d;
                                                        d dVar = f1989u0;
                                                        if (interpolator != dVar) {
                                                            u3.f2954d = dVar;
                                                            u3.f2953c = new OverScroller(recyclerView3.getContext(), dVar);
                                                        }
                                                        u3.f2953c.fling(0, 0, max3, max4, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                                        u3.a();
                                                        V();
                                                        motionEvent3 = motionEvent4;
                                                        motionEvent3.recycle();
                                                        return true;
                                                    }
                                                    recyclerView2 = this;
                                                    i2 = 0;
                                                }
                                            }
                                            motionEvent4 = obtain;
                                            i = -1;
                                            if (i != -1) {
                                            }
                                            if (z5) {
                                            }
                                        }
                                    }
                                }
                                motionEvent4 = obtain;
                                if (z5) {
                                }
                            }
                        }
                    }
                    recyclerView2 = this;
                    motionEvent4 = obtain;
                    i2 = 0;
                }
                recyclerView2.setScrollState(i2);
                V();
                motionEvent3 = motionEvent4;
                motionEvent3.recycle();
                return true;
            }
            if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f1998J);
                if (findPointerIndex < 0) {
                    Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f1998J + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                int x4 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                int y4 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                int i17 = this.f2002N - x4;
                int i18 = this.f2003O - y4;
                if (this.f1997I != 1) {
                    if (d3 != 0) {
                        i17 = i17 > 0 ? Math.max(0, i17 - this.f2004P) : Math.min(0, i17 + this.f2004P);
                        if (i17 != 0) {
                            z4 = true;
                            if (e3) {
                                i18 = i18 > 0 ? Math.max(0, i18 - this.f2004P) : Math.min(0, i18 + this.f2004P);
                                if (i18 != 0) {
                                    z4 = true;
                                }
                            }
                            if (z4) {
                                setScrollState(1);
                            }
                        }
                    }
                    z4 = false;
                    if (e3) {
                    }
                    if (z4) {
                    }
                }
                int i19 = i17;
                int i20 = i18;
                if (this.f1997I == 1) {
                    int[] iArr4 = this.o0;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    boolean r2 = r(d3 != 0 ? i19 : 0, e3 ? i20 : 0, iArr4, this.f2034m0, 0);
                    int[] iArr5 = this.f2034m0;
                    if (r2) {
                        i19 -= iArr4[0];
                        i20 -= iArr4[1];
                        iArr3[0] = iArr3[0] + iArr5[0];
                        iArr3[1] = iArr3[1] + iArr5[1];
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int i21 = i19;
                    int i22 = i20;
                    this.f2002N = x4 - iArr5[0];
                    this.f2003O = y4 - iArr5[1];
                    if (W(d3 != 0 ? i21 : 0, e3 ? i22 : 0, motionEvent)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    RunnableC0164n runnableC0164n = this.f2013a0;
                    if (runnableC0164n != null && (i21 != 0 || i22 != 0)) {
                        runnableC0164n.a(this, i21, i22);
                    }
                }
            } else if (actionMasked == 3) {
                V();
                setScrollState(0);
            } else if (actionMasked == 5) {
                this.f1998J = motionEvent.getPointerId(actionIndex);
                int x5 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.f2002N = x5;
                this.f2000L = x5;
                int y5 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.f2003O = y5;
                this.f2001M = y5;
            } else if (actionMasked == 6) {
                R(motionEvent);
            }
            recyclerView = this;
            motionEvent2 = obtain;
        }
        motionEvent3 = motionEvent2;
        recyclerView.f1999K.addMovement(motionEvent3);
        motionEvent3.recycle();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x03ee A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x03d2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0226 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p() {
        View A2;
        int F2;
        View view;
        f0 f0Var;
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
        C0151a h2;
        int i5;
        int i6;
        C0151a c0151a;
        S s2 = this.f2017c0;
        s2.a(1);
        z(s2);
        s2.i = false;
        a0();
        c cVar = this.f2021f;
        ((k) cVar.f68b).clear();
        q.e eVar = (q.e) cVar.f69c;
        eVar.a();
        P();
        if (this.f2050y) {
            J.d dVar = this.f2018d;
            dVar.j((ArrayList) dVar.f626c);
            dVar.j((ArrayList) dVar.f627d);
            if (this.f2051z) {
                this.f2031l.X();
            }
        }
        if (this.H == null || !this.f2031l.z0()) {
            this.f2018d.b();
        } else {
            J.d dVar2 = this.f2018d;
            ArrayList arrayList = (ArrayList) dVar2.f626c;
            C1.d dVar3 = (C1.d) dVar2.f628f;
            dVar3.getClass();
            while (true) {
                int size = arrayList.size() - 1;
                boolean z7 = false;
                while (true) {
                    i = 8;
                    if (size < 0) {
                        size = -1;
                        break;
                    }
                    if (((C0151a) arrayList.get(size)).f2983a == 8) {
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
                C0151a c0151a2 = (C0151a) arrayList.get(size);
                C0151a c0151a3 = (C0151a) arrayList.get(i7);
                int i8 = c0151a3.f2983a;
                if (i8 != 1) {
                    C0151a c0151a4 = null;
                    J.d dVar4 = (J.d) dVar3.f145b;
                    if (i8 == 2) {
                        int i9 = c0151a2.f2984b;
                        int i10 = c0151a2.f2985c;
                        if (i9 < i10) {
                            if (c0151a3.f2984b == i9 && c0151a3.f2985c == i10 - i9) {
                                z5 = false;
                                z6 = true;
                            } else {
                                z5 = false;
                                z6 = false;
                            }
                        } else if (c0151a3.f2984b == i10 + 1 && c0151a3.f2985c == i9 - i10) {
                            z5 = true;
                            z6 = true;
                        } else {
                            z5 = true;
                            z6 = false;
                        }
                        int i11 = c0151a3.f2984b;
                        if (i10 < i11) {
                            c0151a3.f2984b = i11 - 1;
                        } else {
                            int i12 = c0151a3.f2985c;
                            if (i10 < i11 + i12) {
                                c0151a3.f2985c = i12 - 1;
                                c0151a2.f2983a = 2;
                                c0151a2.f2985c = 1;
                                if (c0151a3.f2985c == 0) {
                                    arrayList.remove(i7);
                                    dVar4.getClass();
                                    ((b) dVar4.f625b).c(c0151a3);
                                }
                            }
                        }
                        int i13 = c0151a2.f2984b;
                        int i14 = c0151a3.f2984b;
                        if (i13 <= i14) {
                            c0151a3.f2984b = i14 + 1;
                        } else {
                            int i15 = i14 + c0151a3.f2985c;
                            if (i13 < i15) {
                                c0151a4 = dVar4.h(2, i13 + 1, i15 - i13);
                                c0151a3.f2985c = c0151a2.f2984b - c0151a3.f2984b;
                            }
                        }
                        C0151a c0151a5 = c0151a4;
                        if (z6) {
                            arrayList.set(size, c0151a3);
                            arrayList.remove(i7);
                            dVar4.getClass();
                            ((b) dVar4.f625b).c(c0151a2);
                        } else {
                            if (z5) {
                                if (c0151a5 != null) {
                                    int i16 = c0151a2.f2984b;
                                    if (i16 > c0151a5.f2984b) {
                                        c0151a2.f2984b = i16 - c0151a5.f2985c;
                                    }
                                    int i17 = c0151a2.f2985c;
                                    if (i17 > c0151a5.f2984b) {
                                        c0151a2.f2985c = i17 - c0151a5.f2985c;
                                    }
                                }
                                int i18 = c0151a2.f2984b;
                                if (i18 > c0151a3.f2984b) {
                                    c0151a2.f2984b = i18 - c0151a3.f2985c;
                                }
                                int i19 = c0151a2.f2985c;
                                if (i19 > c0151a3.f2984b) {
                                    c0151a2.f2985c = i19 - c0151a3.f2985c;
                                }
                            } else {
                                if (c0151a5 != null) {
                                    int i20 = c0151a2.f2984b;
                                    if (i20 >= c0151a5.f2984b) {
                                        c0151a2.f2984b = i20 - c0151a5.f2985c;
                                    }
                                    int i21 = c0151a2.f2985c;
                                    if (i21 >= c0151a5.f2984b) {
                                        c0151a2.f2985c = i21 - c0151a5.f2985c;
                                    }
                                }
                                int i22 = c0151a2.f2984b;
                                if (i22 >= c0151a3.f2984b) {
                                    c0151a2.f2984b = i22 - c0151a3.f2985c;
                                }
                                int i23 = c0151a2.f2985c;
                                if (i23 >= c0151a3.f2984b) {
                                    c0151a2.f2985c = i23 - c0151a3.f2985c;
                                }
                            }
                            arrayList.set(size, c0151a3);
                            if (c0151a2.f2984b != c0151a2.f2985c) {
                                arrayList.set(i7, c0151a2);
                            } else {
                                arrayList.remove(i7);
                            }
                            if (c0151a5 != null) {
                                arrayList.add(size, c0151a5);
                            }
                        }
                    } else if (i8 == 4) {
                        int i24 = c0151a2.f2985c;
                        int i25 = c0151a3.f2984b;
                        if (i24 < i25) {
                            c0151a3.f2984b = i25 - 1;
                        } else {
                            int i26 = c0151a3.f2985c;
                            if (i24 < i25 + i26) {
                                c0151a3.f2985c = i26 - 1;
                                h2 = dVar4.h(4, c0151a2.f2984b, 1);
                                i5 = c0151a2.f2984b;
                                i6 = c0151a3.f2984b;
                                if (i5 > i6) {
                                    c0151a3.f2984b = i6 + 1;
                                } else {
                                    int i27 = i6 + c0151a3.f2985c;
                                    if (i5 < i27) {
                                        int i28 = i27 - i5;
                                        c0151a4 = dVar4.h(4, i5 + 1, i28);
                                        c0151a3.f2985c -= i28;
                                    }
                                }
                                c0151a = c0151a4;
                                arrayList.set(i7, c0151a2);
                                if (c0151a3.f2985c <= 0) {
                                    arrayList.set(size, c0151a3);
                                } else {
                                    arrayList.remove(size);
                                    dVar4.getClass();
                                    ((b) dVar4.f625b).c(c0151a3);
                                }
                                if (h2 != null) {
                                    arrayList.add(size, h2);
                                }
                                if (c0151a == null) {
                                    arrayList.add(size, c0151a);
                                }
                            }
                        }
                        h2 = null;
                        i5 = c0151a2.f2984b;
                        i6 = c0151a3.f2984b;
                        if (i5 > i6) {
                        }
                        c0151a = c0151a4;
                        arrayList.set(i7, c0151a2);
                        if (c0151a3.f2985c <= 0) {
                        }
                        if (h2 != null) {
                        }
                        if (c0151a == null) {
                        }
                    }
                } else {
                    int i29 = c0151a2.f2985c;
                    int i30 = c0151a3.f2984b;
                    int i31 = i29 < i30 ? -1 : 0;
                    int i32 = c0151a2.f2984b;
                    if (i32 < i30) {
                        i31++;
                    }
                    if (i30 <= i32) {
                        c0151a2.f2984b = i32 + c0151a3.f2985c;
                    }
                    int i33 = c0151a3.f2984b;
                    if (i33 <= i29) {
                        c0151a2.f2985c = i29 + c0151a3.f2985c;
                    }
                    c0151a3.f2984b = i33 + i31;
                    arrayList.set(size, c0151a3);
                    arrayList.set(i7, c0151a2);
                }
            }
            int size2 = arrayList.size();
            int i34 = 0;
            while (i34 < size2) {
                C0151a c0151a6 = (C0151a) arrayList.get(i34);
                int i35 = c0151a6.f2983a;
                if (i35 != 1) {
                    b bVar = (b) dVar2.f625b;
                    C0173x c0173x = (C0173x) dVar2.e;
                    if (i35 == 2) {
                        i2 = size2;
                        int i36 = c0151a6.f2984b;
                        int i37 = c0151a6.f2985c + i36;
                        int i38 = i36;
                        int i39 = 0;
                        char c3 = 65535;
                        while (i38 < i37) {
                            if (c0173x.b(i38) != null || dVar2.a(i38)) {
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
                        if (i39 != c0151a6.f2985c) {
                            bVar.c(c0151a6);
                            c0151a6 = dVar2.h(2, i36, i39);
                        }
                        if (c3 == 0) {
                            dVar2.c(c0151a6);
                        } else {
                            dVar2.i(c0151a6);
                        }
                    } else if (i35 != 4) {
                        if (i35 == i) {
                            dVar2.i(c0151a6);
                        }
                        i2 = size2;
                    } else {
                        int i40 = c0151a6.f2984b;
                        int i41 = c0151a6.f2985c + i40;
                        int i42 = i40;
                        char c4 = 65535;
                        int i43 = 0;
                        while (i40 < i41) {
                            if (c0173x.b(i40) != null || dVar2.a(i40)) {
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
                        if (i43 != c0151a6.f2985c) {
                            bVar.c(c0151a6);
                            c0151a6 = dVar2.h(4, i42, i43);
                        }
                        if (c4 == 0) {
                            dVar2.c(c0151a6);
                        } else {
                            dVar2.i(c0151a6);
                        }
                    }
                } else {
                    i2 = size2;
                    dVar2.i(c0151a6);
                }
                i34++;
                size2 = i2;
                i = 8;
            }
            arrayList.clear();
        }
        boolean z8 = this.f2022f0 || this.f2024g0;
        boolean z9 = this.f2042r && this.H != null && ((z2 = this.f2050y) || z8 || this.f2031l.f2908f) && (!z2 || this.f2029k.f3137b);
        S s3 = this.f2017c0;
        s3.j = z9;
        s3.f2947k = z9 && z8 && !this.f2050y && this.H != null && this.f2031l.z0();
        View focusedChild = (this.f2010V && hasFocus() && this.f2029k != null) ? getFocusedChild() : null;
        V H = (focusedChild == null || (A2 = A(focusedChild)) == null) ? null : H(A2);
        if (H == null) {
            s2.f2949m = -1L;
            s2.f2948l = -1;
            s2.f2950n = -1;
        } else {
            s2.f2949m = this.f2029k.f3137b ? H.e : -1L;
            if (!this.f2050y) {
                if (H.i()) {
                    F2 = H.f2961d;
                } else {
                    RecyclerView recyclerView = H.f2972r;
                    if (recyclerView != null) {
                        F2 = recyclerView.F(H);
                    }
                }
                s2.f2948l = F2;
                view = H.f2958a;
                int id = view.getId();
                while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                    view = ((ViewGroup) view).getFocusedChild();
                    if (view.getId() == -1) {
                        id = view.getId();
                    }
                }
                s2.f2950n = id;
            }
            F2 = -1;
            s2.f2948l = F2;
            view = H.f2958a;
            int id2 = view.getId();
            while (!view.isFocused()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() == -1) {
                }
            }
            s2.f2950n = id2;
        }
        s2.f2946h = s2.j && this.f2024g0;
        this.f2024g0 = false;
        this.f2022f0 = false;
        s2.f2945g = s2.f2947k;
        s2.e = this.f2029k.a();
        C(this.f2030k0);
        boolean z10 = s2.j;
        k kVar = (k) cVar.f68b;
        if (z10) {
            int f2 = this.e.f();
            for (int i44 = 0; i44 < f2; i44++) {
                V I2 = I(this.e.e(i44));
                if (!I2.p() && (!I2.g() || this.f2029k.f3137b)) {
                    AbstractC0137C abstractC0137C = this.H;
                    AbstractC0137C.b(I2);
                    I2.c();
                    abstractC0137C.getClass();
                    C0019o c0019o = new C0019o();
                    c0019o.a(I2);
                    f0 f0Var2 = (f0) kVar.getOrDefault(I2, null);
                    if (f0Var2 == null) {
                        f0Var2 = f0.a();
                        kVar.put(I2, f0Var2);
                    }
                    f0Var2.f3029b = c0019o;
                    f0Var2.f3028a |= 4;
                    if (s2.f2946h && I2.l() && !I2.i() && !I2.p() && !I2.g()) {
                        eVar.d(G(I2), I2);
                    }
                }
            }
        }
        if (s2.f2947k) {
            int m2 = this.e.m();
            for (int i45 = 0; i45 < m2; i45++) {
                V I3 = I(this.e.l(i45));
                if (!I3.p() && I3.f2961d == -1) {
                    I3.f2961d = I3.f2960c;
                }
            }
            boolean z11 = s2.f2944f;
            s2.f2944f = false;
            this.f2031l.b0(this.f2014b, s2);
            s2.f2944f = z11;
            for (int i46 = 0; i46 < this.e.f(); i46++) {
                V I4 = I(this.e.e(i46));
                if (!I4.p() && ((f0Var = (f0) kVar.getOrDefault(I4, null)) == null || (f0Var.f3028a & 4) == 0)) {
                    AbstractC0137C.b(I4);
                    boolean d2 = I4.d(8192);
                    AbstractC0137C abstractC0137C2 = this.H;
                    I4.c();
                    abstractC0137C2.getClass();
                    C0019o c0019o2 = new C0019o();
                    c0019o2.a(I4);
                    if (d2) {
                        T(I4, c0019o2);
                    } else {
                        f0 f0Var3 = (f0) kVar.getOrDefault(I4, null);
                        if (f0Var3 == null) {
                            f0Var3 = f0.a();
                            kVar.put(I4, f0Var3);
                        }
                        f0Var3.f3028a |= 2;
                        f0Var3.f3029b = c0019o2;
                    }
                }
            }
            k();
        } else {
            k();
        }
        Q(true);
        b0(false);
        s2.f2943d = 2;
    }

    public final void q() {
        a0();
        P();
        S s2 = this.f2017c0;
        s2.a(6);
        this.f2018d.b();
        s2.e = this.f2029k.a();
        s2.f2942c = 0;
        s2.f2945g = false;
        this.f2031l.b0(this.f2014b, s2);
        s2.f2944f = false;
        this.f2016c = null;
        s2.j = s2.j && this.H != null;
        s2.f2943d = 4;
        Q(true);
        b0(false);
    }

    public final boolean r(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().c(i, i2, iArr, iArr2, i3);
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z2) {
        V I2 = I(view);
        if (I2 != null) {
            if (I2.k()) {
                I2.j &= -257;
            } else if (!I2.p()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + I2 + y());
            }
        }
        view.clearAnimation();
        I(view);
        super.removeDetachedView(view, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        C0170u c0170u = this.f2031l.e;
        if ((c0170u == null || !c0170u.e) && !L() && view2 != null) {
            U(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.f2031l.k0(this, view, rect, z2, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        ArrayList arrayList = this.f2035n;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C0161k) arrayList.get(i)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f2044s != 0 || this.f2046u) {
            this.f2045t = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().d(i, i2, i3, i4, iArr, i5, iArr2);
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        AbstractC0141G abstractC0141G = this.f2031l;
        if (abstractC0141G == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f2046u) {
            return;
        }
        boolean d2 = abstractC0141G.d();
        boolean e = this.f2031l.e();
        if (d2 || e) {
            if (!d2) {
                i = 0;
            }
            if (!e) {
                i2 = 0;
            }
            W(i, i2, null);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!L()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.f2048w |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(X x2) {
        this.f2028j0 = x2;
        P.l(this, x2);
    }

    public void setAdapter(AbstractC0174y abstractC0174y) {
        setLayoutFrozen(false);
        AbstractC0174y abstractC0174y2 = this.f2029k;
        e eVar = this.f2012a;
        if (abstractC0174y2 != null) {
            abstractC0174y2.f3136a.unregisterObserver(eVar);
            this.f2029k.getClass();
        }
        AbstractC0137C abstractC0137C = this.H;
        if (abstractC0137C != null) {
            abstractC0137C.e();
        }
        AbstractC0141G abstractC0141G = this.f2031l;
        C0147M c0147m = this.f2014b;
        if (abstractC0141G != null) {
            abstractC0141G.g0(c0147m);
            this.f2031l.h0(c0147m);
        }
        c0147m.f2926a.clear();
        c0147m.d();
        J.d dVar = this.f2018d;
        dVar.j((ArrayList) dVar.f626c);
        dVar.j((ArrayList) dVar.f627d);
        AbstractC0174y abstractC0174y3 = this.f2029k;
        this.f2029k = abstractC0174y;
        if (abstractC0174y != null) {
            abstractC0174y.f3136a.registerObserver(eVar);
        }
        AbstractC0174y abstractC0174y4 = this.f2029k;
        c0147m.f2926a.clear();
        c0147m.d();
        C0146L c2 = c0147m.c();
        if (abstractC0174y3 != null) {
            c2.f2925b--;
        }
        if (c2.f2925b == 0) {
            int i = 0;
            while (true) {
                SparseArray sparseArray = c2.f2924a;
                if (i >= sparseArray.size()) {
                    break;
                }
                ((C0145K) sparseArray.valueAt(i)).f2920a.clear();
                i++;
            }
        }
        if (abstractC0174y4 != null) {
            c2.f2925b++;
        }
        this.f2017c0.f2944f = true;
        this.f2051z |= false;
        this.f2050y = true;
        int m2 = this.e.m();
        for (int i2 = 0; i2 < m2; i2++) {
            V I2 = I(this.e.l(i2));
            if (I2 != null && !I2.p()) {
                I2.a(6);
            }
        }
        N();
        C0147M c0147m2 = this.f2014b;
        ArrayList arrayList = c0147m2.f2928c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            V v2 = (V) arrayList.get(i3);
            if (v2 != null) {
                v2.a(6);
                v2.a(1024);
            }
        }
        AbstractC0174y abstractC0174y5 = c0147m2.f2932h.f2029k;
        if (abstractC0174y5 == null || !abstractC0174y5.f3137b) {
            c0147m2.d();
        }
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC0135A interfaceC0135A) {
        if (interfaceC0135A == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z2) {
        if (z2 != this.f2023g) {
            this.f1996G = null;
            this.f1994E = null;
            this.f1995F = null;
            this.f1993D = null;
        }
        this.f2023g = z2;
        super.setClipToPadding(z2);
        if (this.f2042r) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C0136B c0136b) {
        c0136b.getClass();
        this.f1992C = c0136b;
        this.f1996G = null;
        this.f1994E = null;
        this.f1995F = null;
        this.f1993D = null;
    }

    public void setHasFixedSize(boolean z2) {
        this.f2040q = z2;
    }

    public void setItemAnimator(AbstractC0137C abstractC0137C) {
        AbstractC0137C abstractC0137C2 = this.H;
        if (abstractC0137C2 != null) {
            abstractC0137C2.e();
            this.H.f2893a = null;
        }
        this.H = abstractC0137C;
        if (abstractC0137C != null) {
            abstractC0137C.f2893a = this.f2026h0;
        }
    }

    public void setItemViewCacheSize(int i) {
        C0147M c0147m = this.f2014b;
        c0147m.e = i;
        c0147m.k();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(AbstractC0141G abstractC0141G) {
        RecyclerView recyclerView;
        C0170u c0170u;
        if (abstractC0141G == this.f2031l) {
            return;
        }
        setScrollState(0);
        U u2 = this.f2011W;
        u2.f2956g.removeCallbacks(u2);
        u2.f2953c.abortAnimation();
        AbstractC0141G abstractC0141G2 = this.f2031l;
        if (abstractC0141G2 != null && (c0170u = abstractC0141G2.e) != null) {
            c0170u.i();
        }
        AbstractC0141G abstractC0141G3 = this.f2031l;
        C0147M c0147m = this.f2014b;
        if (abstractC0141G3 != null) {
            AbstractC0137C abstractC0137C = this.H;
            if (abstractC0137C != null) {
                abstractC0137C.e();
            }
            this.f2031l.g0(c0147m);
            this.f2031l.h0(c0147m);
            c0147m.f2926a.clear();
            c0147m.d();
            if (this.f2038p) {
                AbstractC0141G abstractC0141G4 = this.f2031l;
                abstractC0141G4.f2909g = false;
                abstractC0141G4.R(this);
            }
            this.f2031l.t0(null);
            this.f2031l = null;
        } else {
            c0147m.f2926a.clear();
            c0147m.d();
        }
        h hVar = this.e;
        ((a) hVar.f592c).h();
        ArrayList arrayList = (ArrayList) hVar.f593d;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = ((C0173x) hVar.f591b).f3135a;
            if (size < 0) {
                break;
            }
            V I2 = I((View) arrayList.get(size));
            if (I2 != null) {
                int i = I2.f2970p;
                if (recyclerView.L()) {
                    I2.f2971q = i;
                    recyclerView.f2039p0.add(I2);
                } else {
                    WeakHashMap weakHashMap = P.f711a;
                    I2.f2958a.setImportantForAccessibility(i);
                }
                I2.f2970p = 0;
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            I(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f2031l = abstractC0141G;
        if (abstractC0141G != null) {
            if (abstractC0141G.f2905b != null) {
                throw new IllegalArgumentException("LayoutManager " + abstractC0141G + " is already attached to a RecyclerView:" + abstractC0141G.f2905b.y());
            }
            abstractC0141G.t0(this);
            if (this.f2038p) {
                AbstractC0141G abstractC0141G5 = this.f2031l;
                abstractC0141G5.f2909g = true;
                abstractC0141G5.Q(this);
            }
        }
        c0147m.k();
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
        if (scrollingChildHelper.f770d) {
            WeakHashMap weakHashMap = P.f711a;
            E.z(scrollingChildHelper.f769c);
        }
        scrollingChildHelper.f770d = z2;
    }

    public void setOnFlingListener(AbstractC0143I abstractC0143I) {
        this.f2005Q = abstractC0143I;
    }

    @Deprecated
    public void setOnScrollListener(AbstractC0144J abstractC0144J) {
        this.f2019d0 = abstractC0144J;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.f2010V = z2;
    }

    public void setRecycledViewPool(C0146L c0146l) {
        C0147M c0147m = this.f2014b;
        if (c0147m.f2931g != null) {
            r1.f2925b--;
        }
        c0147m.f2931g = c0146l;
        if (c0146l == null || c0147m.f2932h.getAdapter() == null) {
            return;
        }
        c0147m.f2931g.f2925b++;
    }

    public void setRecyclerListener(InterfaceC0148N interfaceC0148N) {
    }

    public void setScrollState(int i) {
        C0170u c0170u;
        if (i == this.f1997I) {
            return;
        }
        this.f1997I = i;
        if (i != 2) {
            U u2 = this.f2011W;
            u2.f2956g.removeCallbacks(u2);
            u2.f2953c.abortAnimation();
            AbstractC0141G abstractC0141G = this.f2031l;
            if (abstractC0141G != null && (c0170u = abstractC0141G.e) != null) {
                c0170u.i();
            }
        }
        AbstractC0141G abstractC0141G2 = this.f2031l;
        if (abstractC0141G2 != null) {
            abstractC0141G2.f0(i);
        }
        AbstractC0144J abstractC0144J = this.f2019d0;
        if (abstractC0144J != null) {
            abstractC0144J.a(this, i);
        }
        ArrayList arrayList = this.f2020e0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC0144J) this.f2020e0.get(size)).a(this, i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.f2004P = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.f2004P = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(T t2) {
        this.f2014b.getClass();
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
        C0170u c0170u;
        if (z2 != this.f2046u) {
            i("Do not suppressLayout in layout or scroll");
            if (!z2) {
                this.f2046u = false;
                if (this.f2045t && this.f2031l != null && this.f2029k != null) {
                    requestLayout();
                }
                this.f2045t = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f2046u = true;
            this.f2047v = true;
            setScrollState(0);
            U u2 = this.f2011W;
            u2.f2956g.removeCallbacks(u2);
            u2.f2953c.abortAnimation();
            AbstractC0141G abstractC0141G = this.f2031l;
            if (abstractC0141G == null || (c0170u = abstractC0141G.e) == null) {
                return;
            }
            c0170u.i();
        }
    }

    public final void t(int i, int i2) {
        this.f1991B++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        AbstractC0144J abstractC0144J = this.f2019d0;
        if (abstractC0144J != null) {
            abstractC0144J.b(this, i, i2);
        }
        ArrayList arrayList = this.f2020e0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC0144J) this.f2020e0.get(size)).b(this, i, i2);
            }
        }
        this.f1991B--;
    }

    public final void u() {
        if (this.f1996G != null) {
            return;
        }
        this.f1992C.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1996G = edgeEffect;
        if (this.f2023g) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void v() {
        if (this.f1993D != null) {
            return;
        }
        this.f1992C.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1993D = edgeEffect;
        if (this.f2023g) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void w() {
        if (this.f1995F != null) {
            return;
        }
        this.f1992C.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1995F = edgeEffect;
        if (this.f2023g) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void x() {
        if (this.f1994E != null) {
            return;
        }
        this.f1992C.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1994E = edgeEffect;
        if (this.f2023g) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String y() {
        return " " + super.toString() + ", adapter:" + this.f2029k + ", layout:" + this.f2031l + ", context:" + getContext();
    }

    public final void z(S s2) {
        if (getScrollState() != 2) {
            s2.getClass();
            return;
        }
        OverScroller overScroller = this.f2011W.f2953c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        s2.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x03c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArray;
        int i2;
        char c2;
        boolean z2;
        int i3;
        Object[] objArr;
        Constructor constructor;
        this.f2012a = new e(this);
        this.f2014b = new C0147M(this);
        this.f2021f = new c(17);
        this.f2025h = new Rect();
        this.i = new Rect();
        this.j = new RectF();
        this.f2033m = new ArrayList();
        this.f2035n = new ArrayList();
        this.f2044s = 0;
        this.f2050y = false;
        this.f2051z = false;
        this.f1990A = 0;
        this.f1991B = 0;
        this.f1992C = new C0136B();
        C0158h c0158h = new C0158h();
        c0158h.f2893a = null;
        c0158h.f2894b = new ArrayList();
        c0158h.f2895c = 120L;
        c0158h.f2896d = 120L;
        c0158h.e = 250L;
        c0158h.f2897f = 250L;
        c0158h.f3036g = true;
        c0158h.f3037h = new ArrayList();
        c0158h.i = new ArrayList();
        c0158h.j = new ArrayList();
        c0158h.f3038k = new ArrayList();
        c0158h.f3039l = new ArrayList();
        c0158h.f3040m = new ArrayList();
        c0158h.f3041n = new ArrayList();
        c0158h.f3042o = new ArrayList();
        c0158h.f3043p = new ArrayList();
        c0158h.f3044q = new ArrayList();
        c0158h.f3045r = new ArrayList();
        this.H = c0158h;
        this.f1997I = 0;
        this.f1998J = -1;
        this.f2008T = Float.MIN_VALUE;
        this.f2009U = Float.MIN_VALUE;
        this.f2010V = true;
        this.f2011W = new U(this);
        this.f2015b0 = new C0162l();
        S s2 = new S();
        s2.f2940a = -1;
        s2.f2941b = 0;
        s2.f2942c = 0;
        s2.f2943d = 1;
        s2.e = 0;
        s2.f2944f = false;
        s2.f2945g = false;
        s2.f2946h = false;
        s2.i = false;
        s2.j = false;
        s2.f2947k = false;
        this.f2017c0 = s2;
        this.f2022f0 = false;
        this.f2024g0 = false;
        C0173x c0173x = new C0173x(this);
        this.f2026h0 = c0173x;
        this.f2027i0 = false;
        this.f2030k0 = new int[2];
        this.f2034m0 = new int[2];
        this.f2036n0 = new int[2];
        this.o0 = new int[2];
        this.f2039p0 = new ArrayList();
        this.f2041q0 = new C1.e(9, this);
        this.f2043r0 = new C0173x(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f2004P = viewConfiguration.getScaledTouchSlop();
        this.f2008T = M.Q.a(viewConfiguration);
        this.f2009U = M.Q.b(viewConfiguration);
        this.f2006R = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2007S = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.H.f2893a = c0173x;
        this.f2018d = new J.d(new C0173x(this));
        this.e = new h(new C0173x(this));
        WeakHashMap weakHashMap = P.f711a;
        if (G.c(this) == 0) {
            G.m(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f2049x = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new X(this));
        int[] iArr = AbstractC0123a.f2718a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            typedArray = obtainStyledAttributes;
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, i, 0);
        } else {
            typedArray = obtainStyledAttributes;
        }
        String string = typedArray.getString(8);
        if (typedArray.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f2023g = typedArray.getBoolean(1, true);
        if (typedArray.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArray.getDrawable(6);
            Drawable drawable = typedArray.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArray.getDrawable(4);
            Drawable drawable2 = typedArray.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + y());
            }
            Resources resources = getContext().getResources();
            i2 = 4;
            c2 = 2;
            new C0161k(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.winpower.neonfit.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.winpower.neonfit.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.winpower.neonfit.R.dimen.fastscroll_margin));
        } else {
            i2 = 4;
            c2 = 2;
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
                try {
                    Class<? extends U> asSubclass = Class.forName(trim, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(AbstractC0141G.class);
                    try {
                        constructor = asSubclass.getConstructor(f1988t0);
                        Object[] objArr2 = new Object[i2];
                        objArr2[0] = context;
                        z2 = true;
                        try {
                            objArr2[1] = attributeSet;
                            objArr2[c2] = Integer.valueOf(i);
                            objArr2[3] = 0;
                            objArr = objArr2;
                        } catch (NoSuchMethodException e) {
                            e = e;
                            NoSuchMethodException noSuchMethodException = e;
                            try {
                                objArr = null;
                                constructor = asSubclass.getConstructor(null);
                                constructor.setAccessible(z2);
                                setLayoutManager((AbstractC0141G) constructor.newInstance(objArr));
                                i3 = Build.VERSION.SDK_INT;
                                int[] iArr2 = s0;
                                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
                                if (i3 >= 29) {
                                }
                                boolean z3 = obtainStyledAttributes2.getBoolean(0, z2);
                                obtainStyledAttributes2.recycle();
                                setNestedScrollingEnabled(z3);
                            } catch (NoSuchMethodException e2) {
                                e2.initCause(noSuchMethodException);
                                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + trim, e2);
                            }
                        }
                    } catch (NoSuchMethodException e3) {
                        e = e3;
                        z2 = true;
                    }
                    constructor.setAccessible(z2);
                    setLayoutManager((AbstractC0141G) constructor.newInstance(objArr));
                    i3 = Build.VERSION.SDK_INT;
                    int[] iArr22 = s0;
                    TypedArray obtainStyledAttributes22 = context.obtainStyledAttributes(attributeSet, iArr22, i, 0);
                    if (i3 >= 29) {
                        saveAttributeDataForStyleable(context, iArr22, attributeSet, obtainStyledAttributes22, i, 0);
                    }
                    boolean z32 = obtainStyledAttributes22.getBoolean(0, z2);
                    obtainStyledAttributes22.recycle();
                    setNestedScrollingEnabled(z32);
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
        z2 = true;
        i3 = Build.VERSION.SDK_INT;
        int[] iArr222 = s0;
        TypedArray obtainStyledAttributes222 = context.obtainStyledAttributes(attributeSet, iArr222, i, 0);
        if (i3 >= 29) {
        }
        boolean z322 = obtainStyledAttributes222.getBoolean(0, z2);
        obtainStyledAttributes222.recycle();
        setNestedScrollingEnabled(z322);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC0141G abstractC0141G = this.f2031l;
        if (abstractC0141G != null) {
            return abstractC0141G.t(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }
}
