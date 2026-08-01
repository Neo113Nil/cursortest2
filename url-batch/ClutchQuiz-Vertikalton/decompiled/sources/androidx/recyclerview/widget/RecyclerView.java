package androidx.recyclerview.widget;

import B.j;
import B0.c;
import G.h;
import K.C0012m;
import K.C0014o;
import K.G;
import K.S;
import K.r;
import O0.e;
import Q.b;
import S.d;
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
import e0.a;
import f0.AbstractC0119z;
import f0.B;
import f0.C;
import f0.C0095a;
import f0.C0096b;
import f0.C0103i;
import f0.C0106l;
import f0.C0107m;
import f0.C0115v;
import f0.C0117x;
import f0.C0118y;
import f0.D;
import f0.E;
import f0.H;
import f0.I;
import f0.J;
import f0.K;
import f0.L;
import f0.M;
import f0.N;
import f0.O;
import f0.P;
import f0.RunnableC0109o;
import f0.T;
import f0.U;
import f0.V;
import f0.W;
import f0.Y;
import f0.g0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o.k;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* renamed from: s0, reason: collision with root package name */
    public static final int[] f1556s0 = {R.attr.nestedScrollingEnabled};

    /* renamed from: t0, reason: collision with root package name */
    public static final Class[] f1557t0;

    /* renamed from: u0, reason: collision with root package name */
    public static final d f1558u0;

    /* renamed from: A, reason: collision with root package name */
    public int f1559A;

    /* renamed from: B, reason: collision with root package name */
    public int f1560B;

    /* renamed from: C, reason: collision with root package name */
    public C f1561C;

    /* renamed from: D, reason: collision with root package name */
    public EdgeEffect f1562D;

    /* renamed from: E, reason: collision with root package name */
    public EdgeEffect f1563E;
    public EdgeEffect F;

    /* renamed from: G, reason: collision with root package name */
    public EdgeEffect f1564G;

    /* renamed from: H, reason: collision with root package name */
    public D f1565H;

    /* renamed from: I, reason: collision with root package name */
    public int f1566I;

    /* renamed from: J, reason: collision with root package name */
    public int f1567J;

    /* renamed from: K, reason: collision with root package name */
    public VelocityTracker f1568K;

    /* renamed from: L, reason: collision with root package name */
    public int f1569L;

    /* renamed from: M, reason: collision with root package name */
    public int f1570M;

    /* renamed from: N, reason: collision with root package name */
    public int f1571N;

    /* renamed from: O, reason: collision with root package name */
    public int f1572O;

    /* renamed from: P, reason: collision with root package name */
    public int f1573P;

    /* renamed from: Q, reason: collision with root package name */
    public J f1574Q;

    /* renamed from: R, reason: collision with root package name */
    public final int f1575R;

    /* renamed from: S, reason: collision with root package name */
    public final int f1576S;

    /* renamed from: T, reason: collision with root package name */
    public final float f1577T;

    /* renamed from: U, reason: collision with root package name */
    public final float f1578U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f1579V;

    /* renamed from: W, reason: collision with root package name */
    public final V f1580W;

    /* renamed from: a, reason: collision with root package name */
    public final e f1581a;

    /* renamed from: a0, reason: collision with root package name */
    public RunnableC0109o f1582a0;

    /* renamed from: b, reason: collision with root package name */
    public final N f1583b;

    /* renamed from: b0, reason: collision with root package name */
    public final C0107m f1584b0;

    /* renamed from: c, reason: collision with root package name */
    public P f1585c;

    /* renamed from: c0, reason: collision with root package name */
    public final T f1586c0;
    public final H.e d;

    /* renamed from: d0, reason: collision with root package name */
    public K f1587d0;

    /* renamed from: e, reason: collision with root package name */
    public final C0012m f1588e;

    /* renamed from: e0, reason: collision with root package name */
    public ArrayList f1589e0;

    /* renamed from: f, reason: collision with root package name */
    public final j f1590f;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f1591f0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1592g;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f1593g0;
    public final Rect h;

    /* renamed from: h0, reason: collision with root package name */
    public final C0118y f1594h0;
    public final Rect i;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f1595i0;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f1596j;

    /* renamed from: j0, reason: collision with root package name */
    public Y f1597j0;

    /* renamed from: k, reason: collision with root package name */
    public AbstractC0119z f1598k;

    /* renamed from: k0, reason: collision with root package name */
    public final int[] f1599k0;

    /* renamed from: l, reason: collision with root package name */
    public H f1600l;

    /* renamed from: l0, reason: collision with root package name */
    public C0014o f1601l0;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f1602m;
    public final int[] m0;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f1603n;

    /* renamed from: n0, reason: collision with root package name */
    public final int[] f1604n0;

    /* renamed from: o, reason: collision with root package name */
    public C0106l f1605o;

    /* renamed from: o0, reason: collision with root package name */
    public final int[] f1606o0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1607p;

    /* renamed from: p0, reason: collision with root package name */
    public final ArrayList f1608p0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1609q;
    public final b q0;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1610r;

    /* renamed from: r0, reason: collision with root package name */
    public final C0118y f1611r0;

    /* renamed from: s, reason: collision with root package name */
    public int f1612s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1613t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1614u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1615v;

    /* renamed from: w, reason: collision with root package name */
    public int f1616w;

    /* renamed from: x, reason: collision with root package name */
    public final AccessibilityManager f1617x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f1618y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1619z;

    static {
        Class cls = Integer.TYPE;
        f1557t0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f1558u0 = new d(1);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.clutchquizarena.app.R.attr.recyclerViewStyle);
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

    public static W I(View view) {
        if (view == null) {
            return null;
        }
        return ((I) view.getLayoutParams()).f2154a;
    }

    private C0014o getScrollingChildHelper() {
        if (this.f1601l0 == null) {
            this.f1601l0 = new C0014o(this);
        }
        return this.f1601l0;
    }

    public static void j(W w2) {
        WeakReference weakReference = w2.f2194b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == w2.f2193a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            w2.f2194b = null;
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
        ArrayList arrayList = this.f1603n;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0106l c0106l = (C0106l) arrayList.get(i);
            int i2 = c0106l.f2307v;
            if (i2 == 1) {
                boolean d = c0106l.d(motionEvent.getX(), motionEvent.getY());
                boolean c2 = c0106l.c(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0 && (d || c2)) {
                    if (c2) {
                        c0106l.f2308w = 1;
                        c0106l.f2301p = (int) motionEvent.getX();
                    } else if (d) {
                        c0106l.f2308w = 2;
                        c0106l.f2298m = (int) motionEvent.getY();
                    }
                    c0106l.f(2);
                    if (action == 3) {
                        this.f1605o = c0106l;
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
        int f2 = this.f1588e.f();
        if (f2 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < f2; i3++) {
            W I2 = I(this.f1588e.e(i3));
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

    public final W E(int i) {
        W w2 = null;
        if (this.f1618y) {
            return null;
        }
        int m2 = this.f1588e.m();
        for (int i2 = 0; i2 < m2; i2++) {
            W I2 = I(this.f1588e.l(i2));
            if (I2 != null && !I2.i() && F(I2) == i) {
                if (!((ArrayList) this.f1588e.d).contains(I2.f2193a)) {
                    return I2;
                }
                w2 = I2;
            }
        }
        return w2;
    }

    public final int F(W w2) {
        if (w2.d(524) || !w2.f()) {
            return -1;
        }
        H.e eVar = this.d;
        int i = w2.f2195c;
        ArrayList arrayList = (ArrayList) eVar.f221c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0095a c0095a = (C0095a) arrayList.get(i2);
            int i3 = c0095a.f2212a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = c0095a.f2213b;
                    if (i4 <= i) {
                        int i5 = c0095a.f2214c;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = c0095a.f2213b;
                    if (i6 == i) {
                        i = c0095a.f2214c;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (c0095a.f2214c <= i) {
                            i++;
                        }
                    }
                }
            } else if (c0095a.f2213b <= i) {
                i += c0095a.f2214c;
            }
        }
        return i;
    }

    public final long G(W w2) {
        return this.f1598k.f2369b ? w2.f2196e : w2.f2195c;
    }

    public final W H(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return I(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect J(View view) {
        I i = (I) view.getLayoutParams();
        boolean z2 = i.f2156c;
        Rect rect = i.f2155b;
        if (!z2) {
            return rect;
        }
        if (this.f1586c0.f2180g && (i.f2154a.l() || i.f2154a.g())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.f1602m;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Rect rect2 = this.h;
            rect2.set(0, 0, 0, 0);
            ((E) arrayList.get(i2)).getClass();
            ((I) view.getLayoutParams()).f2154a.getClass();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        i.f2156c = false;
        return rect;
    }

    public final boolean K() {
        return !this.f1610r || this.f1618y || this.d.f();
    }

    public final boolean L() {
        return this.f1559A > 0;
    }

    public final void M(int i) {
        if (this.f1600l == null) {
            return;
        }
        setScrollState(2);
        this.f1600l.n0(i);
        awakenScrollBars();
    }

    public final void N() {
        int m2 = this.f1588e.m();
        for (int i = 0; i < m2; i++) {
            ((I) this.f1588e.l(i).getLayoutParams()).f2156c = true;
        }
        ArrayList arrayList = this.f1583b.f2164c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            I i3 = (I) ((W) arrayList.get(i2)).f2193a.getLayoutParams();
            if (i3 != null) {
                i3.f2156c = true;
            }
        }
    }

    public final void O(int i, int i2, boolean z2) {
        int i3 = i + i2;
        int m2 = this.f1588e.m();
        for (int i4 = 0; i4 < m2; i4++) {
            W I2 = I(this.f1588e.l(i4));
            if (I2 != null && !I2.p()) {
                int i5 = I2.f2195c;
                T t2 = this.f1586c0;
                if (i5 >= i3) {
                    I2.m(-i2, z2);
                    t2.f2179f = true;
                } else if (i5 >= i) {
                    I2.a(8);
                    I2.m(-i2, z2);
                    I2.f2195c = i - 1;
                    t2.f2179f = true;
                }
            }
        }
        N n2 = this.f1583b;
        ArrayList arrayList = n2.f2164c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            W w2 = (W) arrayList.get(size);
            if (w2 != null) {
                int i6 = w2.f2195c;
                if (i6 >= i3) {
                    w2.m(-i2, z2);
                } else if (i6 >= i) {
                    w2.a(8);
                    n2.e(size);
                }
            }
        }
        requestLayout();
    }

    public final void P() {
        this.f1559A++;
    }

    public final void Q(boolean z2) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.f1559A - 1;
        this.f1559A = i2;
        if (i2 < 1) {
            this.f1559A = 0;
            if (z2) {
                int i3 = this.f1616w;
                this.f1616w = 0;
                if (i3 != 0 && (accessibilityManager = this.f1617x) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(obtain);
                }
                ArrayList arrayList = this.f1608p0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    W w2 = (W) arrayList.get(size);
                    if (w2.f2193a.getParent() == this && !w2.p() && (i = w2.f2206q) != -1) {
                        WeakHashMap weakHashMap = S.f365a;
                        w2.f2193a.setImportantForAccessibility(i);
                        w2.f2206q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void R(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1567J) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f1567J = motionEvent.getPointerId(i);
            int x2 = (int) (motionEvent.getX(i) + 0.5f);
            this.f1571N = x2;
            this.f1569L = x2;
            int y2 = (int) (motionEvent.getY(i) + 0.5f);
            this.f1572O = y2;
            this.f1570M = y2;
        }
    }

    public final void S() {
        if (this.f1595i0 || !this.f1607p) {
            return;
        }
        WeakHashMap weakHashMap = S.f365a;
        postOnAnimation(this.q0);
        this.f1595i0 = true;
    }

    public final void T(W w2, r rVar) {
        w2.f2199j &= -8193;
        boolean z2 = this.f1586c0.h;
        j jVar = this.f1590f;
        if (z2 && w2.l() && !w2.i() && !w2.p()) {
            ((o.e) jVar.f57c).d(G(w2), w2);
        }
        k kVar = (k) jVar.f56b;
        g0 g0Var = (g0) kVar.getOrDefault(w2, null);
        if (g0Var == null) {
            g0Var = g0.a();
            kVar.put(w2, g0Var);
        }
        g0Var.f2265b = rVar;
        g0Var.f2264a |= 4;
    }

    public final void U(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.h;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof I) {
            I i = (I) layoutParams;
            if (!i.f2156c) {
                int i2 = rect.left;
                Rect rect2 = i.f2155b;
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
        this.f1600l.k0(this, view, this.h, !this.f1610r, view2 == null);
    }

    public final void V() {
        VelocityTracker velocityTracker = this.f1568K;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z2 = false;
        c0(0);
        EdgeEffect edgeEffect = this.f1562D;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = this.f1562D.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f1563E;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 |= this.f1563E.isFinished();
        }
        EdgeEffect edgeEffect3 = this.F;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 |= this.F.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1564G;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z2 |= this.f1564G.isFinished();
        }
        if (z2) {
            WeakHashMap weakHashMap = S.f365a;
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
        AbstractC0119z abstractC0119z = this.f1598k;
        int[] iArr = this.f1606o0;
        if (abstractC0119z != null) {
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
        if (!this.f1602m.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        s(i3, i4, i5, i6, this.m0, 0, iArr);
        int i9 = iArr[0];
        int i10 = i5 - i9;
        int i11 = iArr[1];
        int i12 = i6 - i11;
        boolean z3 = (i9 == 0 && i11 == 0) ? false : true;
        int i13 = this.f1571N;
        int[] iArr2 = this.m0;
        int i14 = iArr2[0];
        this.f1571N = i13 - i14;
        int i15 = this.f1572O;
        int i16 = iArr2[1];
        this.f1572O = i15 - i16;
        int[] iArr3 = this.f1604n0;
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
                    Q.e.a(this.f1562D, (-f2) / getWidth(), 1.0f - (y2 / getHeight()));
                } else if (f2 > 0.0f) {
                    w();
                    Q.e.a(this.F, f2 / getWidth(), y2 / getHeight());
                } else {
                    z2 = false;
                    if (f3 >= 0.0f) {
                        x();
                        Q.e.a(this.f1563E, (-f3) / getHeight(), x2 / getWidth());
                    } else {
                        if (f3 > 0.0f) {
                            u();
                            Q.e.a(this.f1564G, f3 / getHeight(), 1.0f - (x2 / getWidth()));
                        }
                        if (!z2 || f2 != 0.0f || f3 != 0.0f) {
                            WeakHashMap weakHashMap = S.f365a;
                            postInvalidateOnAnimation();
                        }
                    }
                    z2 = true;
                    if (!z2) {
                    }
                    WeakHashMap weakHashMap2 = S.f365a;
                    postInvalidateOnAnimation();
                }
                z2 = true;
                if (f3 >= 0.0f) {
                }
                z2 = true;
                if (!z2) {
                }
                WeakHashMap weakHashMap22 = S.f365a;
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
        W w2;
        C0012m c0012m = this.f1588e;
        a0();
        P();
        int i3 = h.f211a;
        Trace.beginSection("RV Scroll");
        T t2 = this.f1586c0;
        z(t2);
        N n2 = this.f1583b;
        int m0 = i != 0 ? this.f1600l.m0(i, n2, t2) : 0;
        int o02 = i2 != 0 ? this.f1600l.o0(i2, n2, t2) : 0;
        Trace.endSection();
        int f2 = c0012m.f();
        for (int i4 = 0; i4 < f2; i4++) {
            View e2 = c0012m.e(i4);
            W H2 = H(e2);
            if (H2 != null && (w2 = H2.i) != null) {
                int left = e2.getLeft();
                int top = e2.getTop();
                View view = w2.f2193a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        Q(true);
        b0(false);
        if (iArr != null) {
            iArr[0] = m0;
            iArr[1] = o02;
        }
    }

    public final void Y(int i) {
        C0115v c0115v;
        if (this.f1614u) {
            return;
        }
        setScrollState(0);
        V v2 = this.f1580W;
        v2.f2191g.removeCallbacks(v2);
        v2.f2188c.abortAnimation();
        H h = this.f1600l;
        if (h != null && (c0115v = h.f2145e) != null) {
            c0115v.i();
        }
        H h2 = this.f1600l;
        if (h2 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            h2.n0(i);
            awakenScrollBars();
        }
    }

    public final void Z(int i, int i2, boolean z2) {
        H h = this.f1600l;
        if (h == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f1614u) {
            return;
        }
        if (!h.d()) {
            i = 0;
        }
        if (!this.f1600l.e()) {
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
        this.f1580W.b(i, i2, Integer.MIN_VALUE, null);
    }

    public final void a0() {
        int i = this.f1612s + 1;
        this.f1612s = i;
        if (i != 1 || this.f1614u) {
            return;
        }
        this.f1613t = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        H h = this.f1600l;
        if (h != null) {
            h.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    public final void b0(boolean z2) {
        if (this.f1612s < 1) {
            this.f1612s = 1;
        }
        if (!z2 && !this.f1614u) {
            this.f1613t = false;
        }
        if (this.f1612s == 1) {
            if (z2 && this.f1613t && !this.f1614u && this.f1600l != null && this.f1598k != null) {
                o();
            }
            if (!this.f1614u) {
                this.f1613t = false;
            }
        }
        this.f1612s--;
    }

    public final void c0(int i) {
        getScrollingChildHelper().h(i);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof I) && this.f1600l.f((I) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        H h = this.f1600l;
        if (h != null && h.d()) {
            return this.f1600l.j(this.f1586c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        H h = this.f1600l;
        if (h != null && h.d()) {
            return this.f1600l.k(this.f1586c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        H h = this.f1600l;
        if (h != null && h.d()) {
            return this.f1600l.l(this.f1586c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        H h = this.f1600l;
        if (h != null && h.e()) {
            return this.f1600l.m(this.f1586c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        H h = this.f1600l;
        if (h != null && h.e()) {
            return this.f1600l.n(this.f1586c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        H h = this.f1600l;
        if (h != null && h.e()) {
            return this.f1600l.o(this.f1586c0);
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
        ArrayList arrayList = this.f1602m;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i = 0; i < size; i++) {
            ((E) arrayList.get(i)).b(canvas, this);
        }
        EdgeEffect edgeEffect = this.f1562D;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f1592g ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f1562D;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f1563E;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f1592g) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f1563E;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.F;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f1592g ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.F;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f1564G;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f1592g) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f1564G;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(save4);
        }
        if ((z2 || this.f1565H == null || arrayList.size() <= 0 || !this.f1565H.f()) ? z2 : true) {
            WeakHashMap weakHashMap = S.f365a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    public final void f(W w2) {
        View view = w2.f2193a;
        boolean z2 = view.getParent() == this;
        this.f1583b.j(H(view));
        if (w2.k()) {
            this.f1588e.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z2) {
            this.f1588e.a(view, -1, true);
            return;
        }
        C0012m c0012m = this.f1588e;
        int indexOfChild = ((C0118y) c0012m.f422b).f2367a.indexOfChild(view);
        if (indexOfChild >= 0) {
            ((C0096b) c0012m.f423c).h(indexOfChild);
            c0012m.p(view);
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
        this.f1600l.getClass();
        boolean z3 = true;
        boolean z4 = (this.f1598k == null || this.f1600l == null || L() || this.f1614u) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        T t2 = this.f1586c0;
        N n2 = this.f1583b;
        if (z4 && (i == 2 || i == 1)) {
            if (this.f1600l.e()) {
                if (focusFinder.findNextFocus(this, view, i == 2 ? 130 : 33) == null) {
                    z2 = true;
                    if (!z2 && this.f1600l.d()) {
                        z2 = focusFinder.findNextFocus(this, view, !((this.f1600l.C() != 1) ^ (i != 2)) ? 66 : 17) != null;
                    }
                    if (z2) {
                        m();
                        if (A(view) == null) {
                            return null;
                        }
                        a0();
                        this.f1600l.S(view, i, n2, t2);
                        b0(false);
                    }
                    view2 = focusFinder.findNextFocus(this, view, i);
                }
            }
            z2 = false;
            if (!z2) {
                if (focusFinder.findNextFocus(this, view, !((this.f1600l.C() != 1) ^ (i != 2)) ? 66 : 17) != null) {
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
                view2 = this.f1600l.S(view, i, n2, t2);
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
                Rect rect = this.h;
                rect.set(0, 0, width, height);
                int width2 = view2.getWidth();
                int height2 = view2.getHeight();
                Rect rect2 = this.i;
                rect2.set(0, 0, width2, height2);
                offsetDescendantRectToMyCoords(view, rect);
                offsetDescendantRectToMyCoords(view2, rect2);
                int i3 = this.f1600l.C() == 1 ? -1 : 1;
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

    public final void g(E e2) {
        H h = this.f1600l;
        if (h != null) {
            h.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f1602m;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(e2);
        N();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        H h = this.f1600l;
        if (h != null) {
            return h.r();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        H h = this.f1600l;
        if (h != null) {
            return h.s(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC0119z getAdapter() {
        return this.f1598k;
    }

    @Override // android.view.View
    public int getBaseline() {
        H h = this.f1600l;
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
        return this.f1592g;
    }

    public Y getCompatAccessibilityDelegate() {
        return this.f1597j0;
    }

    public C getEdgeEffectFactory() {
        return this.f1561C;
    }

    public D getItemAnimator() {
        return this.f1565H;
    }

    public int getItemDecorationCount() {
        return this.f1602m.size();
    }

    public H getLayoutManager() {
        return this.f1600l;
    }

    public int getMaxFlingVelocity() {
        return this.f1576S;
    }

    public int getMinFlingVelocity() {
        return this.f1575R;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public J getOnFlingListener() {
        return this.f1574Q;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f1579V;
    }

    public M getRecycledViewPool() {
        return this.f1583b.c();
    }

    public int getScrollState() {
        return this.f1566I;
    }

    public final void h(K k2) {
        if (this.f1589e0 == null) {
            this.f1589e0 = new ArrayList();
        }
        this.f1589e0.add(k2);
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
        if (this.f1560B > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + y()));
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f1607p;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f1614u;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    public final void k() {
        int m2 = this.f1588e.m();
        for (int i = 0; i < m2; i++) {
            W I2 = I(this.f1588e.l(i));
            if (!I2.p()) {
                I2.d = -1;
                I2.f2198g = -1;
            }
        }
        N n2 = this.f1583b;
        ArrayList arrayList = n2.f2164c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            W w2 = (W) arrayList.get(i2);
            w2.d = -1;
            w2.f2198g = -1;
        }
        ArrayList arrayList2 = n2.f2162a;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            W w3 = (W) arrayList2.get(i3);
            w3.d = -1;
            w3.f2198g = -1;
        }
        ArrayList arrayList3 = n2.f2163b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                W w4 = (W) n2.f2163b.get(i4);
                w4.d = -1;
                w4.f2198g = -1;
            }
        }
    }

    public final void l(int i, int i2) {
        boolean z2;
        EdgeEffect edgeEffect = this.f1562D;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z2 = false;
        } else {
            this.f1562D.onRelease();
            z2 = this.f1562D.isFinished();
        }
        EdgeEffect edgeEffect2 = this.F;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.F.onRelease();
            z2 |= this.F.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1563E;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f1563E.onRelease();
            z2 |= this.f1563E.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1564G;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f1564G.onRelease();
            z2 |= this.f1564G.isFinished();
        }
        if (z2) {
            WeakHashMap weakHashMap = S.f365a;
            postInvalidateOnAnimation();
        }
    }

    public final void m() {
        H.e eVar = this.d;
        if (!this.f1610r || this.f1618y) {
            int i = h.f211a;
            Trace.beginSection("RV FullInvalidate");
            o();
            Trace.endSection();
            return;
        }
        if (eVar.f()) {
            eVar.getClass();
            if (eVar.f()) {
                int i2 = h.f211a;
                Trace.beginSection("RV FullInvalidate");
                o();
                Trace.endSection();
            }
        }
    }

    public final void n(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = S.f365a;
        setMeasuredDimension(H.g(i, paddingRight, getMinimumWidth()), H.g(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x0323, code lost:
    
        if (((java.util.ArrayList) r19.f1588e.d).contains(getFocusedChild()) == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0382, code lost:
    
        if (r6.hasFocusable() != false) goto L181;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [f0.W] */
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
        r rVar;
        int i;
        RecyclerView recyclerView;
        boolean g2;
        if (this.f1598k == null) {
            Log.e("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f1600l == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        T t2 = this.f1586c0;
        t2.i = false;
        if (t2.d == 1) {
            p();
            this.f1600l.p0(this);
            q();
        } else {
            H.e eVar = this.d;
            if ((((ArrayList) eVar.d).isEmpty() || ((ArrayList) eVar.f221c).isEmpty()) && this.f1600l.f2152n == getWidth() && this.f1600l.f2153o == getHeight()) {
                this.f1600l.p0(this);
            } else {
                this.f1600l.p0(this);
                q();
            }
        }
        t2.a(4);
        a0();
        P();
        t2.d = 1;
        boolean z3 = t2.f2181j;
        View view2 = null;
        Long l2 = null;
        N n2 = this.f1583b;
        j jVar = this.f1590f;
        if (z3) {
            int f2 = this.f1588e.f() - 1;
            while (f2 >= 0) {
                W I2 = I(this.f1588e.e(f2));
                if (!I2.p()) {
                    long G2 = G(I2);
                    this.f1565H.getClass();
                    r rVar2 = new r();
                    rVar2.a(I2);
                    W w2 = (W) ((o.e) jVar.f57c).c(G2, l2);
                    if (w2 == null || w2.p()) {
                        jVar.d(I2, rVar2);
                    } else {
                        k kVar = (k) jVar.f56b;
                        g0 g0Var = (g0) kVar.getOrDefault(w2, l2);
                        boolean z4 = (g0Var == null || (g0Var.f2264a & 1) == 0) ? false : true;
                        g0 g0Var2 = (g0) kVar.getOrDefault(I2, l2);
                        boolean z5 = (g0Var2 == null || (g0Var2.f2264a & 1) == 0) ? false : true;
                        if (z4 && w2 == I2) {
                            jVar.d(I2, rVar2);
                        } else {
                            r G3 = jVar.G(w2, 4);
                            jVar.d(I2, rVar2);
                            r G4 = jVar.G(I2, 8);
                            if (G3 == null) {
                                int f3 = this.f1588e.f();
                                for (int i2 = 0; i2 < f3; i2++) {
                                    W I3 = I(this.f1588e.e(i2));
                                    if (I3 != I2 && G(I3) == G2) {
                                        AbstractC0119z abstractC0119z = this.f1598k;
                                        if (abstractC0119z == null || !abstractC0119z.f2369b) {
                                            throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + I3 + " \n View Holder 2:" + I2 + y());
                                        }
                                        throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + I3 + " \n View Holder 2:" + I2 + y());
                                    }
                                }
                                Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + w2 + " cannot be found but it is necessary for " + I2 + y());
                            } else {
                                w2.o(false);
                                if (z4) {
                                    f(w2);
                                }
                                if (w2 != I2) {
                                    if (z5) {
                                        f(I2);
                                    }
                                    w2.h = I2;
                                    f(w2);
                                    n2.j(w2);
                                    I2.o(false);
                                    I2.i = w2;
                                }
                                if (this.f1565H.a(w2, I2, G3, G4)) {
                                    S();
                                }
                            }
                        }
                    }
                }
                f2--;
                l2 = null;
            }
            k kVar2 = (k) jVar.f56b;
            for (int i3 = kVar2.f3237c - 1; i3 >= 0; i3--) {
                W w3 = (W) kVar2.h(i3);
                g0 g0Var3 = (g0) kVar2.i(i3);
                int i4 = g0Var3.f2264a;
                int i5 = i4 & 3;
                C0118y c0118y = this.f1611r0;
                if (i5 == 3) {
                    RecyclerView recyclerView2 = c0118y.f2367a;
                    recyclerView2.f1600l.i0(w3.f2193a, recyclerView2.f1583b);
                } else if ((i4 & 1) != 0) {
                    r rVar3 = g0Var3.f2265b;
                    if (rVar3 == null) {
                        RecyclerView recyclerView3 = c0118y.f2367a;
                        recyclerView3.f1600l.i0(w3.f2193a, recyclerView3.f1583b);
                    } else {
                        c0118y.g(w3, rVar3, g0Var3.f2266c);
                    }
                } else if ((i4 & 14) == 14) {
                    c0118y.f(w3, g0Var3.f2265b, g0Var3.f2266c);
                } else if ((i4 & 12) == 12) {
                    r rVar4 = g0Var3.f2265b;
                    r rVar5 = g0Var3.f2266c;
                    c0118y.getClass();
                    w3.o(false);
                    RecyclerView recyclerView4 = c0118y.f2367a;
                    if (!recyclerView4.f1618y) {
                        C0103i c0103i = (C0103i) recyclerView4.f1565H;
                        c0103i.getClass();
                        int i6 = rVar4.f439a;
                        int i7 = rVar5.f439a;
                        if (i6 == i7 && rVar4.f440b == rVar5.f440b) {
                            c0103i.c(w3);
                            recyclerView = recyclerView4;
                            g2 = false;
                        } else {
                            recyclerView = recyclerView4;
                            g2 = c0103i.g(w3, i6, rVar4.f440b, i7, rVar5.f440b);
                        }
                        if (g2) {
                            recyclerView.S();
                        }
                    } else if (recyclerView4.f1565H.a(w3, w3, rVar4, rVar5)) {
                        recyclerView4.S();
                    }
                } else {
                    if ((i4 & 4) != 0) {
                        rVar = null;
                        c0118y.g(w3, g0Var3.f2265b, null);
                    } else {
                        rVar = null;
                        if ((i4 & 8) != 0) {
                            c0118y.f(w3, g0Var3.f2265b, g0Var3.f2266c);
                        }
                    }
                    i = 0;
                    g0Var3.f2264a = i;
                    g0Var3.f2265b = rVar;
                    g0Var3.f2266c = rVar;
                    g0.d.c(g0Var3);
                }
                i = 0;
                rVar = null;
                g0Var3.f2264a = i;
                g0Var3.f2265b = rVar;
                g0Var3.f2266c = rVar;
                g0.d.c(g0Var3);
            }
            view2 = null;
        }
        this.f1600l.h0(n2);
        t2.f2176b = t2.f2178e;
        this.f1618y = false;
        this.f1619z = false;
        t2.f2181j = false;
        t2.f2182k = false;
        this.f1600l.f2146f = false;
        ArrayList arrayList = n2.f2163b;
        if (arrayList != null) {
            arrayList.clear();
        }
        H h = this.f1600l;
        if (h.f2149k) {
            h.f2148j = 0;
            h.f2149k = false;
            n2.k();
        }
        this.f1600l.c0(t2);
        Q(true);
        b0(false);
        ((k) jVar.f56b).clear();
        ((o.e) jVar.f57c).a();
        int[] iArr = this.f1599k0;
        int i8 = iArr[0];
        int i9 = iArr[1];
        C(iArr);
        if ((iArr[0] == i8 && iArr[1] == i9) ? false : true) {
            t(0, 0);
        }
        if (this.f1579V && this.f1598k != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (!isFocused()) {
            }
            long j2 = t2.f2184m;
            if (j2 != -1 && (z2 = this.f1598k.f2369b) && z2) {
                int m2 = this.f1588e.m();
                r10 = view2;
                int i10 = 0;
                while (true) {
                    if (i10 >= m2) {
                        break;
                    }
                    W I4 = I(this.f1588e.l(i10));
                    if (I4 != null && !I4.i() && I4.f2196e == j2) {
                        if (!((ArrayList) this.f1588e.d).contains(I4.f2193a)) {
                            r10 = I4;
                            break;
                        }
                        r10 = I4;
                    }
                    i10++;
                    r10 = r10;
                }
            } else {
                r10 = view2;
            }
            if (r10 != null) {
                ArrayList arrayList2 = (ArrayList) this.f1588e.d;
                view = r10.f2193a;
                if (!arrayList2.contains(view)) {
                }
            }
            if (this.f1588e.f() > 0) {
                int i11 = t2.f2183l;
                if (i11 == -1) {
                    i11 = 0;
                }
                int b2 = t2.b();
                for (int i12 = i11; i12 < b2; i12++) {
                    W E2 = E(i12);
                    if (E2 == null) {
                        break;
                    }
                    View view3 = E2.f2193a;
                    if (view3.hasFocusable()) {
                        view2 = view3;
                        break;
                    }
                }
                for (int min = Math.min(b2, i11) - 1; min >= 0; min--) {
                    W E3 = E(min);
                    if (E3 == null) {
                        break;
                    }
                    view = E3.f2193a;
                    if (view.hasFocusable()) {
                        view2 = view;
                        break;
                    }
                }
            }
            if (view2 != null) {
                int i13 = t2.f2185n;
                if (i13 != -1 && (findViewById = view2.findViewById(i13)) != null && findViewById.isFocusable()) {
                    view2 = findViewById;
                }
                view2.requestFocus();
            }
        }
        t2.f2184m = -1L;
        t2.f2183l = -1;
        t2.f2185n = -1;
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
        this.f1559A = 0;
        this.f1607p = true;
        this.f1610r = this.f1610r && !isLayoutRequested();
        H h = this.f1600l;
        if (h != null) {
            h.f2147g = true;
            h.Q(this);
        }
        this.f1595i0 = false;
        ThreadLocal threadLocal = RunnableC0109o.f2319e;
        RunnableC0109o runnableC0109o = (RunnableC0109o) threadLocal.get();
        this.f1582a0 = runnableC0109o;
        if (runnableC0109o == null) {
            RunnableC0109o runnableC0109o2 = new RunnableC0109o();
            runnableC0109o2.f2321a = new ArrayList();
            runnableC0109o2.d = new ArrayList();
            this.f1582a0 = runnableC0109o2;
            WeakHashMap weakHashMap = S.f365a;
            Display display = getDisplay();
            if (!isInEditMode() && display != null) {
                f2 = display.getRefreshRate();
            }
            f2 = 60.0f;
            RunnableC0109o runnableC0109o3 = this.f1582a0;
            runnableC0109o3.f2323c = (long) (1.0E9f / f2);
            threadLocal.set(runnableC0109o3);
        }
        this.f1582a0.f2321a.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C0115v c0115v;
        super.onDetachedFromWindow();
        D d = this.f1565H;
        if (d != null) {
            d.e();
        }
        setScrollState(0);
        V v2 = this.f1580W;
        v2.f2191g.removeCallbacks(v2);
        v2.f2188c.abortAnimation();
        H h = this.f1600l;
        if (h != null && (c0115v = h.f2145e) != null) {
            c0115v.i();
        }
        this.f1607p = false;
        H h2 = this.f1600l;
        if (h2 != null) {
            h2.f2147g = false;
            h2.R(this);
        }
        this.f1608p0.clear();
        removeCallbacks(this.q0);
        this.f1590f.getClass();
        while (g0.d.a() != null) {
        }
        RunnableC0109o runnableC0109o = this.f1582a0;
        if (runnableC0109o != null) {
            runnableC0109o.f2321a.remove(this);
            this.f1582a0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f1602m;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((E) arrayList.get(i)).a(this);
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
        if (this.f1600l != null && !this.f1614u && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f2 = this.f1600l.e() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f1600l.d()) {
                    f3 = motionEvent.getAxisValue(10);
                    if (f2 == 0.0f || f3 != 0.0f) {
                        W((int) (f3 * this.f1577T), (int) (f2 * this.f1578U), motionEvent);
                    }
                }
                f3 = 0.0f;
                if (f2 == 0.0f) {
                }
                W((int) (f3 * this.f1577T), (int) (f2 * this.f1578U), motionEvent);
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f1600l.e()) {
                        f2 = -axisValue;
                        f3 = 0.0f;
                        if (f2 == 0.0f) {
                        }
                        W((int) (f3 * this.f1577T), (int) (f2 * this.f1578U), motionEvent);
                    } else if (this.f1600l.d()) {
                        f3 = axisValue;
                        f2 = 0.0f;
                        if (f2 == 0.0f) {
                        }
                        W((int) (f3 * this.f1577T), (int) (f2 * this.f1578U), motionEvent);
                    }
                }
                f2 = 0.0f;
                f3 = 0.0f;
                if (f2 == 0.0f) {
                }
                W((int) (f3 * this.f1577T), (int) (f2 * this.f1578U), motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (this.f1614u) {
            return false;
        }
        this.f1605o = null;
        if (B(motionEvent)) {
            V();
            setScrollState(0);
            return true;
        }
        H h = this.f1600l;
        if (h == null) {
            return false;
        }
        boolean d = h.d();
        boolean e2 = this.f1600l.e();
        if (this.f1568K == null) {
            this.f1568K = VelocityTracker.obtain();
        }
        this.f1568K.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f1615v) {
                this.f1615v = false;
            }
            this.f1567J = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.f1571N = x2;
            this.f1569L = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.f1572O = y2;
            this.f1570M = y2;
            if (this.f1566I == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                c0(1);
            }
            int[] iArr = this.f1604n0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i = d;
            if (e2) {
                i = (d ? 1 : 0) | 2;
            }
            getScrollingChildHelper().g(i, 0);
        } else if (actionMasked == 1) {
            this.f1568K.clear();
            c0(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f1567J);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f1567J + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f1566I != 1) {
                int i2 = x3 - this.f1569L;
                int i3 = y3 - this.f1570M;
                if (d == 0 || Math.abs(i2) <= this.f1573P) {
                    z2 = false;
                } else {
                    this.f1571N = x3;
                    z2 = true;
                }
                if (e2 && Math.abs(i3) > this.f1573P) {
                    this.f1572O = y3;
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
            this.f1567J = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f1571N = x4;
            this.f1569L = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f1572O = y4;
            this.f1570M = y4;
        } else if (actionMasked == 6) {
            R(motionEvent);
        }
        return this.f1566I == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int i5 = h.f211a;
        Trace.beginSection("RV OnLayout");
        o();
        Trace.endSection();
        this.f1610r = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        H h = this.f1600l;
        if (h == null) {
            n(i, i2);
            return;
        }
        boolean L2 = h.L();
        T t2 = this.f1586c0;
        if (!L2) {
            if (this.f1609q) {
                this.f1600l.f2143b.n(i, i2);
                return;
            }
            if (t2.f2182k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            AbstractC0119z abstractC0119z = this.f1598k;
            if (abstractC0119z != null) {
                t2.f2178e = abstractC0119z.a();
            } else {
                t2.f2178e = 0;
            }
            a0();
            this.f1600l.f2143b.n(i, i2);
            b0(false);
            t2.f2180g = false;
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.f1600l.f2143b.n(i, i2);
        if ((mode == 1073741824 && mode2 == 1073741824) || this.f1598k == null) {
            return;
        }
        if (t2.d == 1) {
            p();
        }
        this.f1600l.q0(i, i2);
        t2.i = true;
        q();
        this.f1600l.s0(i, i2);
        if (this.f1600l.v0()) {
            this.f1600l.q0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            t2.i = true;
            q();
            this.f1600l.s0(i, i2);
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
        if (!(parcelable instanceof P)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        P p2 = (P) parcelable;
        this.f1585c = p2;
        super.onRestoreInstanceState(p2.f646a);
        H h = this.f1600l;
        if (h == null || (parcelable2 = this.f1585c.f2168c) == null) {
            return;
        }
        h.d0(parcelable2);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        P p2 = new P(super.onSaveInstanceState());
        P p3 = this.f1585c;
        if (p3 != null) {
            p2.f2168c = p3.f2168c;
        } else {
            H h = this.f1600l;
            if (h != null) {
                p2.f2168c = h.e0();
            } else {
                p2.f2168c = null;
            }
        }
        return p2;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.f1564G = null;
        this.f1563E = null;
        this.F = null;
        this.f1562D = null;
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
        if (this.f1614u || this.f1615v) {
            return false;
        }
        C0106l c0106l = this.f1605o;
        if (c0106l == null) {
            z2 = motionEvent.getAction() == 0 ? false : B(motionEvent);
        } else {
            if (c0106l.f2307v != 0) {
                if (motionEvent.getAction() == 0) {
                    boolean d = c0106l.d(motionEvent.getX(), motionEvent.getY());
                    boolean c2 = c0106l.c(motionEvent.getX(), motionEvent.getY());
                    if (d || c2) {
                        if (c2) {
                            c0106l.f2308w = 1;
                            c0106l.f2301p = (int) motionEvent.getX();
                        } else if (d) {
                            c0106l.f2308w = 2;
                            c0106l.f2298m = (int) motionEvent.getY();
                        }
                        c0106l.f(2);
                    }
                } else if (motionEvent.getAction() == 1 && c0106l.f2307v == 2) {
                    c0106l.f2298m = 0.0f;
                    c0106l.f2301p = 0.0f;
                    c0106l.f(1);
                    c0106l.f2308w = 0;
                } else if (motionEvent.getAction() == 2 && c0106l.f2307v == 2) {
                    c0106l.g();
                    int i3 = c0106l.f2308w;
                    int i4 = c0106l.f2290b;
                    if (i3 == 1) {
                        float x2 = motionEvent.getX();
                        int[] iArr = c0106l.f2310y;
                        iArr[0] = i4;
                        int i5 = c0106l.f2302q - i4;
                        iArr[1] = i5;
                        float max = Math.max(i4, Math.min(i5, x2));
                        if (Math.abs(c0106l.f2300o - max) >= 2.0f) {
                            int e2 = C0106l.e(c0106l.f2301p, max, iArr, c0106l.f2304s.computeHorizontalScrollRange(), c0106l.f2304s.computeHorizontalScrollOffset(), c0106l.f2302q);
                            if (e2 != 0) {
                                c0106l.f2304s.scrollBy(e2, 0);
                            }
                            c0106l.f2301p = max;
                        }
                    }
                    if (c0106l.f2308w == 2) {
                        float y2 = motionEvent.getY();
                        int[] iArr2 = c0106l.f2309x;
                        iArr2[0] = i4;
                        int i6 = c0106l.f2303r - i4;
                        iArr2[1] = i6;
                        float max2 = Math.max(i4, Math.min(i6, y2));
                        if (Math.abs(c0106l.f2297l - max2) >= 2.0f) {
                            int e3 = C0106l.e(c0106l.f2298m, max2, iArr2, c0106l.f2304s.computeVerticalScrollRange(), c0106l.f2304s.computeVerticalScrollOffset(), c0106l.f2303r);
                            if (e3 != 0) {
                                c0106l.f2304s.scrollBy(0, e3);
                            }
                            c0106l.f2298m = max2;
                        }
                    }
                }
            }
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.f1605o = null;
            }
            z2 = true;
        }
        if (z2) {
            V();
            setScrollState(0);
            return true;
        }
        H h = this.f1600l;
        if (h == null) {
            return false;
        }
        boolean d2 = h.d();
        boolean e4 = this.f1600l.e();
        if (this.f1568K == null) {
            this.f1568K = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        int[] iArr3 = this.f1604n0;
        if (actionMasked == 0) {
            iArr3[1] = 0;
            iArr3[0] = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(iArr3[0], iArr3[1]);
        if (actionMasked == 0) {
            recyclerView = this;
            motionEvent2 = obtain;
            recyclerView.f1567J = motionEvent.getPointerId(0);
            int x3 = (int) (motionEvent.getX() + 0.5f);
            recyclerView.f1571N = x3;
            recyclerView.f1569L = x3;
            int y3 = (int) (motionEvent.getY() + 0.5f);
            recyclerView.f1572O = y3;
            recyclerView.f1570M = y3;
            int i7 = d2;
            if (e4) {
                i7 = (d2 ? 1 : 0) | 2;
            }
            getScrollingChildHelper().g(i7, 0);
        } else {
            if (actionMasked == 1) {
                this.f1568K.addMovement(obtain);
                VelocityTracker velocityTracker = this.f1568K;
                int i8 = this.f1576S;
                velocityTracker.computeCurrentVelocity(1000, i8);
                float f2 = d2 != 0 ? -this.f1568K.getXVelocity(this.f1567J) : 0.0f;
                float f3 = e4 ? -this.f1568K.getYVelocity(this.f1567J) : 0.0f;
                if (f2 == 0.0f && f3 == 0.0f) {
                    recyclerView2 = this;
                    i2 = 0;
                    motionEvent4 = obtain;
                } else {
                    int i9 = (int) f2;
                    int i10 = (int) f3;
                    H h2 = this.f1600l;
                    if (h2 == null) {
                        Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                    } else if (!this.f1614u) {
                        int d3 = h2.d();
                        boolean e5 = this.f1600l.e();
                        int i11 = this.f1575R;
                        if (d3 == 0 || Math.abs(i9) < i11) {
                            i9 = 0;
                        }
                        if (!e5 || Math.abs(i10) < i11) {
                            i10 = 0;
                        }
                        if (i9 != 0 || i10 != 0) {
                            float f4 = i9;
                            float f5 = i10;
                            if (!dispatchNestedPreFling(f4, f5)) {
                                boolean z5 = d3 != 0 || e5;
                                dispatchNestedFling(f4, f5, z5);
                                J j2 = this.f1574Q;
                                if (j2 != null) {
                                    C0117x c0117x = (C0117x) j2;
                                    H layoutManager = c0117x.f2364a.getLayoutManager();
                                    if (layoutManager != 0 && c0117x.f2364a.getAdapter() != null && ((Math.abs(i10) > (minFlingVelocity = c0117x.f2364a.getMinFlingVelocity()) || Math.abs(i9) > minFlingVelocity) && ((z3 = layoutManager instanceof f0.S)))) {
                                        c cVar = !z3 ? null : new c(c0117x, c0117x.f2364a.getContext(), 1);
                                        if (cVar != null) {
                                            int B2 = layoutManager.B();
                                            if (B2 != 0) {
                                                T.h e6 = layoutManager.e() ? c0117x.e(layoutManager) : layoutManager.d() ? c0117x.d(layoutManager) : null;
                                                if (e6 != null) {
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
                                                            int b2 = C0117x.b(u2, e6);
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
                                                        i = H.H(view);
                                                    } else if (z6 || view2 == null) {
                                                        if (z6) {
                                                            view = view2;
                                                        }
                                                        if (view != null) {
                                                            int H2 = ((z3 && (a2 = ((f0.S) layoutManager).a(layoutManager.B() - 1)) != null && ((a2.x > 0.0f ? 1 : (a2.x == 0.0f ? 0 : -1)) < 0 || (a2.y > 0.0f ? 1 : (a2.y == 0.0f ? 0 : -1)) < 0)) == z6 ? -1 : 1) + H.H(view);
                                                            if (H2 >= 0 && H2 < B2) {
                                                                i = H2;
                                                            }
                                                        }
                                                        i = -1;
                                                    } else {
                                                        i = H.H(view2);
                                                    }
                                                    if (i != -1) {
                                                        cVar.f2351a = i;
                                                        layoutManager.y0(cVar);
                                                        V();
                                                        motionEvent3 = motionEvent4;
                                                        motionEvent3.recycle();
                                                        return true;
                                                    }
                                                    if (z5) {
                                                        if (e5) {
                                                            d3 = (d3 == true ? 1 : 0) | 2;
                                                        }
                                                        getScrollingChildHelper().g(d3, 1);
                                                        int i16 = -i8;
                                                        int max3 = Math.max(i16, Math.min(i9, i8));
                                                        int max4 = Math.max(i16, Math.min(i10, i8));
                                                        V v3 = this.f1580W;
                                                        RecyclerView recyclerView3 = v3.f2191g;
                                                        recyclerView3.setScrollState(2);
                                                        v3.f2187b = 0;
                                                        v3.f2186a = 0;
                                                        Interpolator interpolator = v3.d;
                                                        d dVar = f1558u0;
                                                        if (interpolator != dVar) {
                                                            v3.d = dVar;
                                                            v3.f2188c = new OverScroller(recyclerView3.getContext(), dVar);
                                                        }
                                                        v3.f2188c.fling(0, 0, max3, max4, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                                        v3.a();
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
                int findPointerIndex = motionEvent.findPointerIndex(this.f1567J);
                if (findPointerIndex < 0) {
                    Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f1567J + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                int x4 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                int y4 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                int i17 = this.f1571N - x4;
                int i18 = this.f1572O - y4;
                if (this.f1566I != 1) {
                    if (d2 != 0) {
                        i17 = i17 > 0 ? Math.max(0, i17 - this.f1573P) : Math.min(0, i17 + this.f1573P);
                        if (i17 != 0) {
                            z4 = true;
                            if (e4) {
                                i18 = i18 > 0 ? Math.max(0, i18 - this.f1573P) : Math.min(0, i18 + this.f1573P);
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
                    if (e4) {
                    }
                    if (z4) {
                    }
                }
                int i19 = i17;
                int i20 = i18;
                if (this.f1566I == 1) {
                    int[] iArr4 = this.f1606o0;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    boolean r2 = r(d2 != 0 ? i19 : 0, e4 ? i20 : 0, iArr4, this.m0, 0);
                    int[] iArr5 = this.m0;
                    if (r2) {
                        i19 -= iArr4[0];
                        i20 -= iArr4[1];
                        iArr3[0] = iArr3[0] + iArr5[0];
                        iArr3[1] = iArr3[1] + iArr5[1];
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int i21 = i19;
                    int i22 = i20;
                    this.f1571N = x4 - iArr5[0];
                    this.f1572O = y4 - iArr5[1];
                    if (W(d2 != 0 ? i21 : 0, e4 ? i22 : 0, motionEvent)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    RunnableC0109o runnableC0109o = this.f1582a0;
                    if (runnableC0109o != null && (i21 != 0 || i22 != 0)) {
                        runnableC0109o.a(this, i21, i22);
                    }
                }
            } else if (actionMasked == 3) {
                V();
                setScrollState(0);
            } else if (actionMasked == 5) {
                this.f1567J = motionEvent.getPointerId(actionIndex);
                int x5 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.f1571N = x5;
                this.f1569L = x5;
                int y5 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.f1572O = y5;
                this.f1570M = y5;
            } else if (actionMasked == 6) {
                R(motionEvent);
            }
            recyclerView = this;
            motionEvent2 = obtain;
        }
        motionEvent3 = motionEvent2;
        recyclerView.f1568K.addMovement(motionEvent3);
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
        int F;
        View view;
        g0 g0Var;
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
        C0095a g2;
        int i5;
        int i6;
        C0095a c0095a;
        T t2 = this.f1586c0;
        t2.a(1);
        z(t2);
        t2.i = false;
        a0();
        j jVar = this.f1590f;
        ((k) jVar.f56b).clear();
        o.e eVar = (o.e) jVar.f57c;
        eVar.a();
        P();
        if (this.f1618y) {
            H.e eVar2 = this.d;
            eVar2.i((ArrayList) eVar2.f221c);
            eVar2.i((ArrayList) eVar2.d);
            if (this.f1619z) {
                this.f1600l.X();
            }
        }
        if (this.f1565H == null || !this.f1600l.z0()) {
            this.d.b();
        } else {
            H.e eVar3 = this.d;
            ArrayList arrayList = (ArrayList) eVar3.f221c;
            A0.h hVar = (A0.h) eVar3.f223f;
            hVar.getClass();
            while (true) {
                int size = arrayList.size() - 1;
                boolean z7 = false;
                while (true) {
                    i = 8;
                    if (size < 0) {
                        size = -1;
                        break;
                    }
                    if (((C0095a) arrayList.get(size)).f2212a == 8) {
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
                C0095a c0095a2 = (C0095a) arrayList.get(size);
                C0095a c0095a3 = (C0095a) arrayList.get(i7);
                int i8 = c0095a3.f2212a;
                if (i8 != 1) {
                    C0095a c0095a4 = null;
                    H.e eVar4 = (H.e) hVar.f30b;
                    if (i8 == 2) {
                        int i9 = c0095a2.f2213b;
                        int i10 = c0095a2.f2214c;
                        if (i9 < i10) {
                            if (c0095a3.f2213b == i9 && c0095a3.f2214c == i10 - i9) {
                                z5 = false;
                                z6 = true;
                            } else {
                                z5 = false;
                                z6 = false;
                            }
                        } else if (c0095a3.f2213b == i10 + 1 && c0095a3.f2214c == i9 - i10) {
                            z5 = true;
                            z6 = true;
                        } else {
                            z5 = true;
                            z6 = false;
                        }
                        int i11 = c0095a3.f2213b;
                        if (i10 < i11) {
                            c0095a3.f2213b = i11 - 1;
                        } else {
                            int i12 = c0095a3.f2214c;
                            if (i10 < i11 + i12) {
                                c0095a3.f2214c = i12 - 1;
                                c0095a2.f2212a = 2;
                                c0095a2.f2214c = 1;
                                if (c0095a3.f2214c == 0) {
                                    arrayList.remove(i7);
                                    eVar4.getClass();
                                    ((J.b) eVar4.f220b).c(c0095a3);
                                }
                            }
                        }
                        int i13 = c0095a2.f2213b;
                        int i14 = c0095a3.f2213b;
                        if (i13 <= i14) {
                            c0095a3.f2213b = i14 + 1;
                        } else {
                            int i15 = i14 + c0095a3.f2214c;
                            if (i13 < i15) {
                                c0095a4 = eVar4.g(2, i13 + 1, i15 - i13);
                                c0095a3.f2214c = c0095a2.f2213b - c0095a3.f2213b;
                            }
                        }
                        C0095a c0095a5 = c0095a4;
                        if (z6) {
                            arrayList.set(size, c0095a3);
                            arrayList.remove(i7);
                            eVar4.getClass();
                            ((J.b) eVar4.f220b).c(c0095a2);
                        } else {
                            if (z5) {
                                if (c0095a5 != null) {
                                    int i16 = c0095a2.f2213b;
                                    if (i16 > c0095a5.f2213b) {
                                        c0095a2.f2213b = i16 - c0095a5.f2214c;
                                    }
                                    int i17 = c0095a2.f2214c;
                                    if (i17 > c0095a5.f2213b) {
                                        c0095a2.f2214c = i17 - c0095a5.f2214c;
                                    }
                                }
                                int i18 = c0095a2.f2213b;
                                if (i18 > c0095a3.f2213b) {
                                    c0095a2.f2213b = i18 - c0095a3.f2214c;
                                }
                                int i19 = c0095a2.f2214c;
                                if (i19 > c0095a3.f2213b) {
                                    c0095a2.f2214c = i19 - c0095a3.f2214c;
                                }
                            } else {
                                if (c0095a5 != null) {
                                    int i20 = c0095a2.f2213b;
                                    if (i20 >= c0095a5.f2213b) {
                                        c0095a2.f2213b = i20 - c0095a5.f2214c;
                                    }
                                    int i21 = c0095a2.f2214c;
                                    if (i21 >= c0095a5.f2213b) {
                                        c0095a2.f2214c = i21 - c0095a5.f2214c;
                                    }
                                }
                                int i22 = c0095a2.f2213b;
                                if (i22 >= c0095a3.f2213b) {
                                    c0095a2.f2213b = i22 - c0095a3.f2214c;
                                }
                                int i23 = c0095a2.f2214c;
                                if (i23 >= c0095a3.f2213b) {
                                    c0095a2.f2214c = i23 - c0095a3.f2214c;
                                }
                            }
                            arrayList.set(size, c0095a3);
                            if (c0095a2.f2213b != c0095a2.f2214c) {
                                arrayList.set(i7, c0095a2);
                            } else {
                                arrayList.remove(i7);
                            }
                            if (c0095a5 != null) {
                                arrayList.add(size, c0095a5);
                            }
                        }
                    } else if (i8 == 4) {
                        int i24 = c0095a2.f2214c;
                        int i25 = c0095a3.f2213b;
                        if (i24 < i25) {
                            c0095a3.f2213b = i25 - 1;
                        } else {
                            int i26 = c0095a3.f2214c;
                            if (i24 < i25 + i26) {
                                c0095a3.f2214c = i26 - 1;
                                g2 = eVar4.g(4, c0095a2.f2213b, 1);
                                i5 = c0095a2.f2213b;
                                i6 = c0095a3.f2213b;
                                if (i5 > i6) {
                                    c0095a3.f2213b = i6 + 1;
                                } else {
                                    int i27 = i6 + c0095a3.f2214c;
                                    if (i5 < i27) {
                                        int i28 = i27 - i5;
                                        c0095a4 = eVar4.g(4, i5 + 1, i28);
                                        c0095a3.f2214c -= i28;
                                    }
                                }
                                c0095a = c0095a4;
                                arrayList.set(i7, c0095a2);
                                if (c0095a3.f2214c <= 0) {
                                    arrayList.set(size, c0095a3);
                                } else {
                                    arrayList.remove(size);
                                    eVar4.getClass();
                                    ((J.b) eVar4.f220b).c(c0095a3);
                                }
                                if (g2 != null) {
                                    arrayList.add(size, g2);
                                }
                                if (c0095a == null) {
                                    arrayList.add(size, c0095a);
                                }
                            }
                        }
                        g2 = null;
                        i5 = c0095a2.f2213b;
                        i6 = c0095a3.f2213b;
                        if (i5 > i6) {
                        }
                        c0095a = c0095a4;
                        arrayList.set(i7, c0095a2);
                        if (c0095a3.f2214c <= 0) {
                        }
                        if (g2 != null) {
                        }
                        if (c0095a == null) {
                        }
                    }
                } else {
                    int i29 = c0095a2.f2214c;
                    int i30 = c0095a3.f2213b;
                    int i31 = i29 < i30 ? -1 : 0;
                    int i32 = c0095a2.f2213b;
                    if (i32 < i30) {
                        i31++;
                    }
                    if (i30 <= i32) {
                        c0095a2.f2213b = i32 + c0095a3.f2214c;
                    }
                    int i33 = c0095a3.f2213b;
                    if (i33 <= i29) {
                        c0095a2.f2214c = i29 + c0095a3.f2214c;
                    }
                    c0095a3.f2213b = i33 + i31;
                    arrayList.set(size, c0095a3);
                    arrayList.set(i7, c0095a2);
                }
            }
            int size2 = arrayList.size();
            int i34 = 0;
            while (i34 < size2) {
                C0095a c0095a6 = (C0095a) arrayList.get(i34);
                int i35 = c0095a6.f2212a;
                if (i35 != 1) {
                    J.b bVar = (J.b) eVar3.f220b;
                    C0118y c0118y = (C0118y) eVar3.f222e;
                    if (i35 == 2) {
                        i2 = size2;
                        int i36 = c0095a6.f2213b;
                        int i37 = c0095a6.f2214c + i36;
                        int i38 = i36;
                        int i39 = 0;
                        char c3 = 65535;
                        while (i38 < i37) {
                            if (c0118y.b(i38) != null || eVar3.a(i38)) {
                                if (c3 == 0) {
                                    eVar3.c(eVar3.g(2, i36, i39));
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                z4 = z3;
                                c2 = 1;
                            } else {
                                if (c3 == 1) {
                                    eVar3.h(eVar3.g(2, i36, i39));
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
                        if (i39 != c0095a6.f2214c) {
                            bVar.c(c0095a6);
                            c0095a6 = eVar3.g(2, i36, i39);
                        }
                        if (c3 == 0) {
                            eVar3.c(c0095a6);
                        } else {
                            eVar3.h(c0095a6);
                        }
                    } else if (i35 != 4) {
                        if (i35 == i) {
                            eVar3.h(c0095a6);
                        }
                        i2 = size2;
                    } else {
                        int i40 = c0095a6.f2213b;
                        int i41 = c0095a6.f2214c + i40;
                        int i42 = i40;
                        char c4 = 65535;
                        int i43 = 0;
                        while (i40 < i41) {
                            if (c0118y.b(i40) != null || eVar3.a(i40)) {
                                i3 = size2;
                                if (c4 == 0) {
                                    eVar3.c(eVar3.g(4, i42, i43));
                                    i42 = i40;
                                    i43 = 0;
                                }
                                i4 = 1;
                                c4 = 1;
                            } else {
                                i3 = size2;
                                if (c4 == 1) {
                                    eVar3.h(eVar3.g(4, i42, i43));
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
                        if (i43 != c0095a6.f2214c) {
                            bVar.c(c0095a6);
                            c0095a6 = eVar3.g(4, i42, i43);
                        }
                        if (c4 == 0) {
                            eVar3.c(c0095a6);
                        } else {
                            eVar3.h(c0095a6);
                        }
                    }
                } else {
                    i2 = size2;
                    eVar3.h(c0095a6);
                }
                i34++;
                size2 = i2;
                i = 8;
            }
            arrayList.clear();
        }
        boolean z8 = this.f1591f0 || this.f1593g0;
        boolean z9 = this.f1610r && this.f1565H != null && ((z2 = this.f1618y) || z8 || this.f1600l.f2146f) && (!z2 || this.f1598k.f2369b);
        T t3 = this.f1586c0;
        t3.f2181j = z9;
        t3.f2182k = z9 && z8 && !this.f1618y && this.f1565H != null && this.f1600l.z0();
        View focusedChild = (this.f1579V && hasFocus() && this.f1598k != null) ? getFocusedChild() : null;
        W H2 = (focusedChild == null || (A2 = A(focusedChild)) == null) ? null : H(A2);
        if (H2 == null) {
            t2.f2184m = -1L;
            t2.f2183l = -1;
            t2.f2185n = -1;
        } else {
            t2.f2184m = this.f1598k.f2369b ? H2.f2196e : -1L;
            if (!this.f1618y) {
                if (H2.i()) {
                    F = H2.d;
                } else {
                    RecyclerView recyclerView = H2.f2207r;
                    if (recyclerView != null) {
                        F = recyclerView.F(H2);
                    }
                }
                t2.f2183l = F;
                view = H2.f2193a;
                int id = view.getId();
                while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                    view = ((ViewGroup) view).getFocusedChild();
                    if (view.getId() == -1) {
                        id = view.getId();
                    }
                }
                t2.f2185n = id;
            }
            F = -1;
            t2.f2183l = F;
            view = H2.f2193a;
            int id2 = view.getId();
            while (!view.isFocused()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() == -1) {
                }
            }
            t2.f2185n = id2;
        }
        t2.h = t2.f2181j && this.f1593g0;
        this.f1593g0 = false;
        this.f1591f0 = false;
        t2.f2180g = t2.f2182k;
        t2.f2178e = this.f1598k.a();
        C(this.f1599k0);
        boolean z10 = t2.f2181j;
        k kVar = (k) jVar.f56b;
        if (z10) {
            int f2 = this.f1588e.f();
            for (int i44 = 0; i44 < f2; i44++) {
                W I2 = I(this.f1588e.e(i44));
                if (!I2.p() && (!I2.g() || this.f1598k.f2369b)) {
                    D d = this.f1565H;
                    D.b(I2);
                    I2.c();
                    d.getClass();
                    r rVar = new r();
                    rVar.a(I2);
                    g0 g0Var2 = (g0) kVar.getOrDefault(I2, null);
                    if (g0Var2 == null) {
                        g0Var2 = g0.a();
                        kVar.put(I2, g0Var2);
                    }
                    g0Var2.f2265b = rVar;
                    g0Var2.f2264a |= 4;
                    if (t2.h && I2.l() && !I2.i() && !I2.p() && !I2.g()) {
                        eVar.d(G(I2), I2);
                    }
                }
            }
        }
        if (t2.f2182k) {
            int m2 = this.f1588e.m();
            for (int i45 = 0; i45 < m2; i45++) {
                W I3 = I(this.f1588e.l(i45));
                if (!I3.p() && I3.d == -1) {
                    I3.d = I3.f2195c;
                }
            }
            boolean z11 = t2.f2179f;
            t2.f2179f = false;
            this.f1600l.b0(this.f1583b, t2);
            t2.f2179f = z11;
            for (int i46 = 0; i46 < this.f1588e.f(); i46++) {
                W I4 = I(this.f1588e.e(i46));
                if (!I4.p() && ((g0Var = (g0) kVar.getOrDefault(I4, null)) == null || (g0Var.f2264a & 4) == 0)) {
                    D.b(I4);
                    boolean d2 = I4.d(8192);
                    D d3 = this.f1565H;
                    I4.c();
                    d3.getClass();
                    r rVar2 = new r();
                    rVar2.a(I4);
                    if (d2) {
                        T(I4, rVar2);
                    } else {
                        g0 g0Var3 = (g0) kVar.getOrDefault(I4, null);
                        if (g0Var3 == null) {
                            g0Var3 = g0.a();
                            kVar.put(I4, g0Var3);
                        }
                        g0Var3.f2264a |= 2;
                        g0Var3.f2265b = rVar2;
                    }
                }
            }
            k();
        } else {
            k();
        }
        Q(true);
        b0(false);
        t2.d = 2;
    }

    public final void q() {
        a0();
        P();
        T t2 = this.f1586c0;
        t2.a(6);
        this.d.b();
        t2.f2178e = this.f1598k.a();
        t2.f2177c = 0;
        t2.f2180g = false;
        this.f1600l.b0(this.f1583b, t2);
        t2.f2179f = false;
        this.f1585c = null;
        t2.f2181j = t2.f2181j && this.f1565H != null;
        t2.d = 4;
        Q(true);
        b0(false);
    }

    public final boolean r(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().c(i, i2, iArr, iArr2, i3);
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z2) {
        W I2 = I(view);
        if (I2 != null) {
            if (I2.k()) {
                I2.f2199j &= -257;
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
        C0115v c0115v = this.f1600l.f2145e;
        if ((c0115v == null || !c0115v.f2354e) && !L() && view2 != null) {
            U(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.f1600l.k0(this, view, rect, z2, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        ArrayList arrayList = this.f1603n;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C0106l) arrayList.get(i)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f1612s != 0 || this.f1614u) {
            this.f1613t = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().d(i, i2, i3, i4, iArr, i5, iArr2);
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        H h = this.f1600l;
        if (h == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f1614u) {
            return;
        }
        boolean d = h.d();
        boolean e2 = this.f1600l.e();
        if (d || e2) {
            if (!d) {
                i = 0;
            }
            if (!e2) {
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
            this.f1616w |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(Y y2) {
        this.f1597j0 = y2;
        S.l(this, y2);
    }

    public void setAdapter(AbstractC0119z abstractC0119z) {
        setLayoutFrozen(false);
        AbstractC0119z abstractC0119z2 = this.f1598k;
        e eVar = this.f1581a;
        if (abstractC0119z2 != null) {
            abstractC0119z2.f2368a.unregisterObserver(eVar);
            this.f1598k.getClass();
        }
        D d = this.f1565H;
        if (d != null) {
            d.e();
        }
        H h = this.f1600l;
        N n2 = this.f1583b;
        if (h != null) {
            h.g0(n2);
            this.f1600l.h0(n2);
        }
        n2.f2162a.clear();
        n2.d();
        H.e eVar2 = this.d;
        eVar2.i((ArrayList) eVar2.f221c);
        eVar2.i((ArrayList) eVar2.d);
        AbstractC0119z abstractC0119z3 = this.f1598k;
        this.f1598k = abstractC0119z;
        if (abstractC0119z != null) {
            abstractC0119z.f2368a.registerObserver(eVar);
        }
        AbstractC0119z abstractC0119z4 = this.f1598k;
        n2.f2162a.clear();
        n2.d();
        M c2 = n2.c();
        if (abstractC0119z3 != null) {
            c2.f2161b--;
        }
        if (c2.f2161b == 0) {
            int i = 0;
            while (true) {
                SparseArray sparseArray = c2.f2160a;
                if (i >= sparseArray.size()) {
                    break;
                }
                ((L) sparseArray.valueAt(i)).f2157a.clear();
                i++;
            }
        }
        if (abstractC0119z4 != null) {
            c2.f2161b++;
        }
        this.f1586c0.f2179f = true;
        this.f1619z |= false;
        this.f1618y = true;
        int m2 = this.f1588e.m();
        for (int i2 = 0; i2 < m2; i2++) {
            W I2 = I(this.f1588e.l(i2));
            if (I2 != null && !I2.p()) {
                I2.a(6);
            }
        }
        N();
        N n3 = this.f1583b;
        ArrayList arrayList = n3.f2164c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            W w2 = (W) arrayList.get(i3);
            if (w2 != null) {
                w2.a(6);
                w2.a(1024);
            }
        }
        AbstractC0119z abstractC0119z5 = n3.h.f1598k;
        if (abstractC0119z5 == null || !abstractC0119z5.f2369b) {
            n3.d();
        }
        requestLayout();
    }

    public void setChildDrawingOrderCallback(B b2) {
        if (b2 == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z2) {
        if (z2 != this.f1592g) {
            this.f1564G = null;
            this.f1563E = null;
            this.F = null;
            this.f1562D = null;
        }
        this.f1592g = z2;
        super.setClipToPadding(z2);
        if (this.f1610r) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C c2) {
        c2.getClass();
        this.f1561C = c2;
        this.f1564G = null;
        this.f1563E = null;
        this.F = null;
        this.f1562D = null;
    }

    public void setHasFixedSize(boolean z2) {
        this.f1609q = z2;
    }

    public void setItemAnimator(D d) {
        D d2 = this.f1565H;
        if (d2 != null) {
            d2.e();
            this.f1565H.f2132a = null;
        }
        this.f1565H = d;
        if (d != null) {
            d.f2132a = this.f1594h0;
        }
    }

    public void setItemViewCacheSize(int i) {
        N n2 = this.f1583b;
        n2.f2165e = i;
        n2.k();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(H h) {
        RecyclerView recyclerView;
        C0115v c0115v;
        if (h == this.f1600l) {
            return;
        }
        setScrollState(0);
        V v2 = this.f1580W;
        v2.f2191g.removeCallbacks(v2);
        v2.f2188c.abortAnimation();
        H h2 = this.f1600l;
        if (h2 != null && (c0115v = h2.f2145e) != null) {
            c0115v.i();
        }
        H h3 = this.f1600l;
        N n2 = this.f1583b;
        if (h3 != null) {
            D d = this.f1565H;
            if (d != null) {
                d.e();
            }
            this.f1600l.g0(n2);
            this.f1600l.h0(n2);
            n2.f2162a.clear();
            n2.d();
            if (this.f1607p) {
                H h4 = this.f1600l;
                h4.f2147g = false;
                h4.R(this);
            }
            this.f1600l.t0(null);
            this.f1600l = null;
        } else {
            n2.f2162a.clear();
            n2.d();
        }
        C0012m c0012m = this.f1588e;
        ((C0096b) c0012m.f423c).g();
        ArrayList arrayList = (ArrayList) c0012m.d;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = ((C0118y) c0012m.f422b).f2367a;
            if (size < 0) {
                break;
            }
            W I2 = I((View) arrayList.get(size));
            if (I2 != null) {
                int i = I2.f2205p;
                if (recyclerView.L()) {
                    I2.f2206q = i;
                    recyclerView.f1608p0.add(I2);
                } else {
                    WeakHashMap weakHashMap = S.f365a;
                    I2.f2193a.setImportantForAccessibility(i);
                }
                I2.f2205p = 0;
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
        this.f1600l = h;
        if (h != null) {
            if (h.f2143b != null) {
                throw new IllegalArgumentException("LayoutManager " + h + " is already attached to a RecyclerView:" + h.f2143b.y());
            }
            h.t0(this);
            if (this.f1607p) {
                H h5 = this.f1600l;
                h5.f2147g = true;
                h5.Q(this);
            }
        }
        n2.k();
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
        C0014o scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.d) {
            WeakHashMap weakHashMap = S.f365a;
            G.z(scrollingChildHelper.f427c);
        }
        scrollingChildHelper.d = z2;
    }

    public void setOnFlingListener(J j2) {
        this.f1574Q = j2;
    }

    @Deprecated
    public void setOnScrollListener(K k2) {
        this.f1587d0 = k2;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.f1579V = z2;
    }

    public void setRecycledViewPool(M m2) {
        N n2 = this.f1583b;
        if (n2.f2167g != null) {
            r1.f2161b--;
        }
        n2.f2167g = m2;
        if (m2 == null || n2.h.getAdapter() == null) {
            return;
        }
        n2.f2167g.f2161b++;
    }

    public void setRecyclerListener(O o2) {
    }

    public void setScrollState(int i) {
        C0115v c0115v;
        if (i == this.f1566I) {
            return;
        }
        this.f1566I = i;
        if (i != 2) {
            V v2 = this.f1580W;
            v2.f2191g.removeCallbacks(v2);
            v2.f2188c.abortAnimation();
            H h = this.f1600l;
            if (h != null && (c0115v = h.f2145e) != null) {
                c0115v.i();
            }
        }
        H h2 = this.f1600l;
        if (h2 != null) {
            h2.f0(i);
        }
        K k2 = this.f1587d0;
        if (k2 != null) {
            k2.a(this, i);
        }
        ArrayList arrayList = this.f1589e0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((K) this.f1589e0.get(size)).a(this, i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.f1573P = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.f1573P = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(U u2) {
        this.f1583b.getClass();
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
        C0115v c0115v;
        if (z2 != this.f1614u) {
            i("Do not suppressLayout in layout or scroll");
            if (!z2) {
                this.f1614u = false;
                if (this.f1613t && this.f1600l != null && this.f1598k != null) {
                    requestLayout();
                }
                this.f1613t = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f1614u = true;
            this.f1615v = true;
            setScrollState(0);
            V v2 = this.f1580W;
            v2.f2191g.removeCallbacks(v2);
            v2.f2188c.abortAnimation();
            H h = this.f1600l;
            if (h == null || (c0115v = h.f2145e) == null) {
                return;
            }
            c0115v.i();
        }
    }

    public final void t(int i, int i2) {
        this.f1560B++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        K k2 = this.f1587d0;
        if (k2 != null) {
            k2.b(this, i, i2);
        }
        ArrayList arrayList = this.f1589e0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((K) this.f1589e0.get(size)).b(this, i, i2);
            }
        }
        this.f1560B--;
    }

    public final void u() {
        if (this.f1564G != null) {
            return;
        }
        this.f1561C.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1564G = edgeEffect;
        if (this.f1592g) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void v() {
        if (this.f1562D != null) {
            return;
        }
        this.f1561C.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1562D = edgeEffect;
        if (this.f1592g) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void w() {
        if (this.F != null) {
            return;
        }
        this.f1561C.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.F = edgeEffect;
        if (this.f1592g) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void x() {
        if (this.f1563E != null) {
            return;
        }
        this.f1561C.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1563E = edgeEffect;
        if (this.f1592g) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String y() {
        return " " + super.toString() + ", adapter:" + this.f1598k + ", layout:" + this.f1600l + ", context:" + getContext();
    }

    public final void z(T t2) {
        if (getScrollState() != 2) {
            t2.getClass();
            return;
        }
        OverScroller overScroller = this.f1580W.f2188c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        t2.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x03cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArray;
        char c2;
        char c3;
        boolean z2;
        int i2;
        Object[] objArr;
        Constructor constructor;
        this.f1581a = new e(this, 26);
        this.f1583b = new N(this);
        this.f1590f = new j(13);
        this.h = new Rect();
        this.i = new Rect();
        this.f1596j = new RectF();
        this.f1602m = new ArrayList();
        this.f1603n = new ArrayList();
        this.f1612s = 0;
        this.f1618y = false;
        this.f1619z = false;
        this.f1559A = 0;
        this.f1560B = 0;
        this.f1561C = new C();
        C0103i c0103i = new C0103i();
        c0103i.f2132a = null;
        c0103i.f2133b = new ArrayList();
        c0103i.f2134c = 120L;
        c0103i.d = 120L;
        c0103i.f2135e = 250L;
        c0103i.f2136f = 250L;
        c0103i.f2272g = true;
        c0103i.h = new ArrayList();
        c0103i.i = new ArrayList();
        c0103i.f2273j = new ArrayList();
        c0103i.f2274k = new ArrayList();
        c0103i.f2275l = new ArrayList();
        c0103i.f2276m = new ArrayList();
        c0103i.f2277n = new ArrayList();
        c0103i.f2278o = new ArrayList();
        c0103i.f2279p = new ArrayList();
        c0103i.f2280q = new ArrayList();
        c0103i.f2281r = new ArrayList();
        this.f1565H = c0103i;
        this.f1566I = 0;
        this.f1567J = -1;
        this.f1577T = Float.MIN_VALUE;
        this.f1578U = Float.MIN_VALUE;
        this.f1579V = true;
        this.f1580W = new V(this);
        this.f1584b0 = new C0107m();
        T t2 = new T();
        t2.f2175a = -1;
        t2.f2176b = 0;
        t2.f2177c = 0;
        t2.d = 1;
        t2.f2178e = 0;
        t2.f2179f = false;
        t2.f2180g = false;
        t2.h = false;
        t2.i = false;
        t2.f2181j = false;
        t2.f2182k = false;
        this.f1586c0 = t2;
        this.f1591f0 = false;
        this.f1593g0 = false;
        C0118y c0118y = new C0118y(this);
        this.f1594h0 = c0118y;
        this.f1595i0 = false;
        this.f1599k0 = new int[2];
        this.m0 = new int[2];
        this.f1604n0 = new int[2];
        this.f1606o0 = new int[2];
        this.f1608p0 = new ArrayList();
        this.q0 = new b(8, this);
        this.f1611r0 = new C0118y(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1573P = viewConfiguration.getScaledTouchSlop();
        this.f1577T = K.T.a(viewConfiguration);
        this.f1578U = K.T.b(viewConfiguration);
        this.f1575R = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1576S = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f1565H.f2132a = c0118y;
        this.d = new H.e(new C0118y(this));
        this.f1588e = new C0012m(new C0118y(this));
        WeakHashMap weakHashMap = S.f365a;
        if (K.I.c(this) == 0) {
            K.I.m(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f1617x = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new Y(this));
        int[] iArr = a.f2108a;
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
        this.f1592g = typedArray.getBoolean(1, true);
        if (typedArray.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArray.getDrawable(6);
            Drawable drawable = typedArray.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArray.getDrawable(4);
            Drawable drawable2 = typedArray.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + y());
            }
            Resources resources = getContext().getResources();
            c2 = 3;
            c3 = 2;
            new C0106l(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.clutchquizarena.app.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.clutchquizarena.app.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.clutchquizarena.app.R.dimen.fastscroll_margin));
        } else {
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
                    Class<? extends U> asSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(H.class);
                    try {
                        constructor = asSubclass.getConstructor(f1557t0);
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
                                setLayoutManager((H) constructor.newInstance(objArr2));
                                i2 = Build.VERSION.SDK_INT;
                                int[] iArr2 = f1556s0;
                                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
                                if (i2 >= 29) {
                                }
                                boolean z3 = obtainStyledAttributes2.getBoolean(0, z2);
                                obtainStyledAttributes2.recycle();
                                setNestedScrollingEnabled(z3);
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
                    setLayoutManager((H) constructor.newInstance(objArr22));
                    i2 = Build.VERSION.SDK_INT;
                    int[] iArr22 = f1556s0;
                    TypedArray obtainStyledAttributes22 = context.obtainStyledAttributes(attributeSet, iArr22, i, 0);
                    if (i2 >= 29) {
                        saveAttributeDataForStyleable(context, iArr22, attributeSet, obtainStyledAttributes22, i, 0);
                    }
                    boolean z32 = obtainStyledAttributes22.getBoolean(0, z2);
                    obtainStyledAttributes22.recycle();
                    setNestedScrollingEnabled(z32);
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
        i2 = Build.VERSION.SDK_INT;
        int[] iArr222 = f1556s0;
        TypedArray obtainStyledAttributes222 = context.obtainStyledAttributes(attributeSet, iArr222, i, 0);
        if (i2 >= 29) {
        }
        boolean z322 = obtainStyledAttributes222.getBoolean(0, z2);
        obtainStyledAttributes222.recycle();
        setNestedScrollingEnabled(z322);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        H h = this.f1600l;
        if (h != null) {
            return h.t(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }
}
