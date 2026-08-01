package androidx.recyclerview.widget;

import B.j;
import G.i;
import H0.e;
import J.b;
import K.C0024u;
import K.Y;
import K0.B;
import S.d;
import T.g;
import T.r;
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
import d0.AbstractC0106a;
import e0.AbstractC0108A;
import e0.AbstractC0112E;
import e0.AbstractC0113F;
import e0.C0111D;
import e0.C0114a;
import e0.C0115b;
import e0.C0122i;
import e0.C0125l;
import e0.C0126m;
import e0.C0134v;
import e0.C0136x;
import e0.C0137y;
import e0.C0138z;
import e0.I;
import e0.InterfaceC0110C;
import e0.J;
import e0.K;
import e0.L;
import e0.M;
import e0.N;
import e0.O;
import e0.P;
import e0.Q;
import e0.RunnableC0128o;
import e0.T;
import e0.U;
import e0.V;
import e0.W;
import e0.X;
import e0.Z;
import e0.h0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o.k;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* renamed from: s0, reason: collision with root package name */
    public static final int[] f1541s0 = {R.attr.nestedScrollingEnabled};

    /* renamed from: t0, reason: collision with root package name */
    public static final Class[] f1542t0;

    /* renamed from: u0, reason: collision with root package name */
    public static final d f1543u0;

    /* renamed from: A, reason: collision with root package name */
    public int f1544A;

    /* renamed from: B, reason: collision with root package name */
    public int f1545B;

    /* renamed from: C, reason: collision with root package name */
    public C0111D f1546C;

    /* renamed from: D, reason: collision with root package name */
    public EdgeEffect f1547D;

    /* renamed from: E, reason: collision with root package name */
    public EdgeEffect f1548E;
    public EdgeEffect F;

    /* renamed from: G, reason: collision with root package name */
    public EdgeEffect f1549G;

    /* renamed from: H, reason: collision with root package name */
    public AbstractC0112E f1550H;

    /* renamed from: I, reason: collision with root package name */
    public int f1551I;

    /* renamed from: J, reason: collision with root package name */
    public int f1552J;

    /* renamed from: K, reason: collision with root package name */
    public VelocityTracker f1553K;

    /* renamed from: L, reason: collision with root package name */
    public int f1554L;

    /* renamed from: M, reason: collision with root package name */
    public int f1555M;

    /* renamed from: N, reason: collision with root package name */
    public int f1556N;

    /* renamed from: O, reason: collision with root package name */
    public int f1557O;

    /* renamed from: P, reason: collision with root package name */
    public int f1558P;

    /* renamed from: Q, reason: collision with root package name */
    public K f1559Q;

    /* renamed from: R, reason: collision with root package name */
    public final int f1560R;

    /* renamed from: S, reason: collision with root package name */
    public final int f1561S;

    /* renamed from: T, reason: collision with root package name */
    public final float f1562T;

    /* renamed from: U, reason: collision with root package name */
    public final float f1563U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f1564V;

    /* renamed from: W, reason: collision with root package name */
    public final W f1565W;

    /* renamed from: a, reason: collision with root package name */
    public final e f1566a;

    /* renamed from: a0, reason: collision with root package name */
    public RunnableC0128o f1567a0;

    /* renamed from: b, reason: collision with root package name */
    public final O f1568b;

    /* renamed from: b0, reason: collision with root package name */
    public final C0126m f1569b0;

    /* renamed from: c, reason: collision with root package name */
    public Q f1570c;

    /* renamed from: c0, reason: collision with root package name */
    public final U f1571c0;

    /* renamed from: d, reason: collision with root package name */
    public final H.e f1572d;

    /* renamed from: d0, reason: collision with root package name */
    public L f1573d0;

    /* renamed from: e, reason: collision with root package name */
    public final r f1574e;

    /* renamed from: e0, reason: collision with root package name */
    public ArrayList f1575e0;

    /* renamed from: f, reason: collision with root package name */
    public final j f1576f;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f1577f0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1578g;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f1579g0;
    public final Rect h;

    /* renamed from: h0, reason: collision with root package name */
    public final C0138z f1580h0;
    public final Rect i;
    public boolean i0;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f1581j;

    /* renamed from: j0, reason: collision with root package name */
    public Z f1582j0;

    /* renamed from: k, reason: collision with root package name */
    public AbstractC0108A f1583k;

    /* renamed from: k0, reason: collision with root package name */
    public final int[] f1584k0;

    /* renamed from: l, reason: collision with root package name */
    public I f1585l;

    /* renamed from: l0, reason: collision with root package name */
    public K.r f1586l0;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f1587m;
    public final int[] m0;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f1588n;

    /* renamed from: n0, reason: collision with root package name */
    public final int[] f1589n0;

    /* renamed from: o, reason: collision with root package name */
    public C0125l f1590o;

    /* renamed from: o0, reason: collision with root package name */
    public final int[] f1591o0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1592p;

    /* renamed from: p0, reason: collision with root package name */
    public final ArrayList f1593p0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1594q;

    /* renamed from: q0, reason: collision with root package name */
    public final B f1595q0;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1596r;

    /* renamed from: r0, reason: collision with root package name */
    public final C0138z f1597r0;

    /* renamed from: s, reason: collision with root package name */
    public int f1598s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1599t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1600u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1601v;

    /* renamed from: w, reason: collision with root package name */
    public int f1602w;

    /* renamed from: x, reason: collision with root package name */
    public final AccessibilityManager f1603x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f1604y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1605z;

    static {
        Class cls = Integer.TYPE;
        f1542t0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f1543u0 = new d(1);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.luckyarcade.spinthrow.R.attr.recyclerViewStyle);
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

    public static X I(View view) {
        if (view == null) {
            return null;
        }
        return ((J) view.getLayoutParams()).f2127a;
    }

    private K.r getScrollingChildHelper() {
        if (this.f1586l0 == null) {
            this.f1586l0 = new K.r(this);
        }
        return this.f1586l0;
    }

    public static void j(X x2) {
        WeakReference weakReference = x2.f2173b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == x2.f2172a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            x2.f2173b = null;
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
        ArrayList arrayList = this.f1588n;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0125l c0125l = (C0125l) arrayList.get(i);
            int i2 = c0125l.f2302v;
            if (i2 == 1) {
                boolean d2 = c0125l.d(motionEvent.getX(), motionEvent.getY());
                boolean c2 = c0125l.c(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0 && (d2 || c2)) {
                    if (c2) {
                        c0125l.f2303w = 1;
                        c0125l.f2296p = (int) motionEvent.getX();
                    } else if (d2) {
                        c0125l.f2303w = 2;
                        c0125l.f2293m = (int) motionEvent.getY();
                    }
                    c0125l.f(2);
                    if (action == 3) {
                        this.f1590o = c0125l;
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
        int f2 = this.f1574e.f();
        if (f2 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < f2; i3++) {
            X I2 = I(this.f1574e.e(i3));
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

    public final X E(int i) {
        X x2 = null;
        if (this.f1604y) {
            return null;
        }
        int m2 = this.f1574e.m();
        for (int i2 = 0; i2 < m2; i2++) {
            X I2 = I(this.f1574e.l(i2));
            if (I2 != null && !I2.i() && F(I2) == i) {
                if (!((ArrayList) this.f1574e.f813d).contains(I2.f2172a)) {
                    return I2;
                }
                x2 = I2;
            }
        }
        return x2;
    }

    public final int F(X x2) {
        if (x2.d(524) || !x2.f()) {
            return -1;
        }
        H.e eVar = this.f1572d;
        int i = x2.f2174c;
        ArrayList arrayList = (ArrayList) eVar.f223c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0114a c0114a = (C0114a) arrayList.get(i2);
            int i3 = c0114a.f2192a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = c0114a.f2193b;
                    if (i4 <= i) {
                        int i5 = c0114a.f2194c;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = c0114a.f2193b;
                    if (i6 == i) {
                        i = c0114a.f2194c;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (c0114a.f2194c <= i) {
                            i++;
                        }
                    }
                }
            } else if (c0114a.f2193b <= i) {
                i += c0114a.f2194c;
            }
        }
        return i;
    }

    public final long G(X x2) {
        return this.f1583k.f2101b ? x2.f2176e : x2.f2174c;
    }

    public final X H(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return I(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect J(View view) {
        J j2 = (J) view.getLayoutParams();
        boolean z2 = j2.f2129c;
        Rect rect = j2.f2128b;
        if (!z2) {
            return rect;
        }
        if (this.f1571c0.f2158g && (j2.f2127a.l() || j2.f2127a.g())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.f1587m;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.h;
            rect2.set(0, 0, 0, 0);
            ((AbstractC0113F) arrayList.get(i)).getClass();
            ((J) view.getLayoutParams()).f2127a.getClass();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        j2.f2129c = false;
        return rect;
    }

    public final boolean K() {
        return !this.f1596r || this.f1604y || this.f1572d.f();
    }

    public final boolean L() {
        return this.f1544A > 0;
    }

    public final void M(int i) {
        if (this.f1585l == null) {
            return;
        }
        setScrollState(2);
        this.f1585l.n0(i);
        awakenScrollBars();
    }

    public final void N() {
        int m2 = this.f1574e.m();
        for (int i = 0; i < m2; i++) {
            ((J) this.f1574e.l(i).getLayoutParams()).f2129c = true;
        }
        ArrayList arrayList = this.f1568b.f2139c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            J j2 = (J) ((X) arrayList.get(i2)).f2172a.getLayoutParams();
            if (j2 != null) {
                j2.f2129c = true;
            }
        }
    }

    public final void O(int i, int i2, boolean z2) {
        int i3 = i + i2;
        int m2 = this.f1574e.m();
        for (int i4 = 0; i4 < m2; i4++) {
            X I2 = I(this.f1574e.l(i4));
            if (I2 != null && !I2.p()) {
                int i5 = I2.f2174c;
                U u2 = this.f1571c0;
                if (i5 >= i3) {
                    I2.m(-i2, z2);
                    u2.f2157f = true;
                } else if (i5 >= i) {
                    I2.a(8);
                    I2.m(-i2, z2);
                    I2.f2174c = i - 1;
                    u2.f2157f = true;
                }
            }
        }
        O o2 = this.f1568b;
        ArrayList arrayList = o2.f2139c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            X x2 = (X) arrayList.get(size);
            if (x2 != null) {
                int i6 = x2.f2174c;
                if (i6 >= i3) {
                    x2.m(-i2, z2);
                } else if (i6 >= i) {
                    x2.a(8);
                    o2.e(size);
                }
            }
        }
        requestLayout();
    }

    public final void P() {
        this.f1544A++;
    }

    public final void Q(boolean z2) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.f1544A - 1;
        this.f1544A = i2;
        if (i2 < 1) {
            this.f1544A = 0;
            if (z2) {
                int i3 = this.f1602w;
                this.f1602w = 0;
                if (i3 != 0 && (accessibilityManager = this.f1603x) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(obtain);
                }
                ArrayList arrayList = this.f1593p0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    X x2 = (X) arrayList.get(size);
                    if (x2.f2172a.getParent() == this && !x2.p() && (i = x2.f2186q) != -1) {
                        WeakHashMap weakHashMap = K.X.f419a;
                        x2.f2172a.setImportantForAccessibility(i);
                        x2.f2186q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void R(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1552J) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f1552J = motionEvent.getPointerId(i);
            int x2 = (int) (motionEvent.getX(i) + 0.5f);
            this.f1556N = x2;
            this.f1554L = x2;
            int y2 = (int) (motionEvent.getY(i) + 0.5f);
            this.f1557O = y2;
            this.f1555M = y2;
        }
    }

    public final void S() {
        if (this.i0 || !this.f1592p) {
            return;
        }
        WeakHashMap weakHashMap = K.X.f419a;
        postOnAnimation(this.f1595q0);
        this.i0 = true;
    }

    public final void T(X x2, C0024u c0024u) {
        x2.f2179j &= -8193;
        boolean z2 = this.f1571c0.h;
        j jVar = this.f1576f;
        if (z2 && x2.l() && !x2.i() && !x2.p()) {
            ((o.e) jVar.f37c).d(G(x2), x2);
        }
        k kVar = (k) jVar.f36b;
        h0 h0Var = (h0) kVar.getOrDefault(x2, null);
        if (h0Var == null) {
            h0Var = h0.a();
            kVar.put(x2, h0Var);
        }
        h0Var.f2263b = c0024u;
        h0Var.f2262a |= 4;
    }

    public final void U(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.h;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof J) {
            J j2 = (J) layoutParams;
            if (!j2.f2129c) {
                int i = rect.left;
                Rect rect2 = j2.f2128b;
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
        this.f1585l.k0(this, view, this.h, !this.f1596r, view2 == null);
    }

    public final void V() {
        VelocityTracker velocityTracker = this.f1553K;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z2 = false;
        c0(0);
        EdgeEffect edgeEffect = this.f1547D;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = this.f1547D.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f1548E;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 |= this.f1548E.isFinished();
        }
        EdgeEffect edgeEffect3 = this.F;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 |= this.F.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1549G;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z2 |= this.f1549G.isFinished();
        }
        if (z2) {
            WeakHashMap weakHashMap = K.X.f419a;
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
        AbstractC0108A abstractC0108A = this.f1583k;
        int[] iArr = this.f1591o0;
        if (abstractC0108A != null) {
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
        if (!this.f1587m.isEmpty()) {
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
        int i13 = this.f1556N;
        int[] iArr2 = this.m0;
        int i14 = iArr2[0];
        this.f1556N = i13 - i14;
        int i15 = this.f1557O;
        int i16 = iArr2[1];
        this.f1557O = i15 - i16;
        int[] iArr3 = this.f1589n0;
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
                    Q.d.a(this.f1547D, (-f2) / getWidth(), 1.0f - (y2 / getHeight()));
                } else if (f2 > 0.0f) {
                    w();
                    Q.d.a(this.F, f2 / getWidth(), y2 / getHeight());
                } else {
                    z2 = false;
                    if (f3 >= 0.0f) {
                        x();
                        Q.d.a(this.f1548E, (-f3) / getHeight(), x2 / getWidth());
                    } else {
                        if (f3 > 0.0f) {
                            u();
                            Q.d.a(this.f1549G, f3 / getHeight(), 1.0f - (x2 / getWidth()));
                        }
                        if (!z2 || f2 != 0.0f || f3 != 0.0f) {
                            WeakHashMap weakHashMap = K.X.f419a;
                            postInvalidateOnAnimation();
                        }
                    }
                    z2 = true;
                    if (!z2) {
                    }
                    WeakHashMap weakHashMap2 = K.X.f419a;
                    postInvalidateOnAnimation();
                }
                z2 = true;
                if (f3 >= 0.0f) {
                }
                z2 = true;
                if (!z2) {
                }
                WeakHashMap weakHashMap22 = K.X.f419a;
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
        X x2;
        r rVar = this.f1574e;
        a0();
        P();
        int i3 = i.f203a;
        Trace.beginSection("RV Scroll");
        U u2 = this.f1571c0;
        z(u2);
        O o2 = this.f1568b;
        int m0 = i != 0 ? this.f1585l.m0(i, o2, u2) : 0;
        int o02 = i2 != 0 ? this.f1585l.o0(i2, o2, u2) : 0;
        Trace.endSection();
        int f2 = rVar.f();
        for (int i4 = 0; i4 < f2; i4++) {
            View e2 = rVar.e(i4);
            X H2 = H(e2);
            if (H2 != null && (x2 = H2.i) != null) {
                int left = e2.getLeft();
                int top = e2.getTop();
                View view = x2.f2172a;
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
        C0134v c0134v;
        if (this.f1600u) {
            return;
        }
        setScrollState(0);
        W w2 = this.f1565W;
        w2.f2170g.removeCallbacks(w2);
        w2.f2166c.abortAnimation();
        I i2 = this.f1585l;
        if (i2 != null && (c0134v = i2.f2118e) != null) {
            c0134v.i();
        }
        I i3 = this.f1585l;
        if (i3 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            i3.n0(i);
            awakenScrollBars();
        }
    }

    public final void Z(int i, int i2, boolean z2) {
        I i3 = this.f1585l;
        if (i3 == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f1600u) {
            return;
        }
        if (!i3.d()) {
            i = 0;
        }
        if (!this.f1585l.e()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (z2) {
            int i4 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i4 |= 2;
            }
            getScrollingChildHelper().g(i4, 1);
        }
        this.f1565W.b(i, i2, Integer.MIN_VALUE, null);
    }

    public final void a0() {
        int i = this.f1598s + 1;
        this.f1598s = i;
        if (i != 1 || this.f1600u) {
            return;
        }
        this.f1599t = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        I i3 = this.f1585l;
        if (i3 != null) {
            i3.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    public final void b0(boolean z2) {
        if (this.f1598s < 1) {
            this.f1598s = 1;
        }
        if (!z2 && !this.f1600u) {
            this.f1599t = false;
        }
        if (this.f1598s == 1) {
            if (z2 && this.f1599t && !this.f1600u && this.f1585l != null && this.f1583k != null) {
                o();
            }
            if (!this.f1600u) {
                this.f1599t = false;
            }
        }
        this.f1598s--;
    }

    public final void c0(int i) {
        getScrollingChildHelper().h(i);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof J) && this.f1585l.f((J) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        I i = this.f1585l;
        if (i != null && i.d()) {
            return this.f1585l.j(this.f1571c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        I i = this.f1585l;
        if (i != null && i.d()) {
            return this.f1585l.k(this.f1571c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        I i = this.f1585l;
        if (i != null && i.d()) {
            return this.f1585l.l(this.f1571c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        I i = this.f1585l;
        if (i != null && i.e()) {
            return this.f1585l.m(this.f1571c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        I i = this.f1585l;
        if (i != null && i.e()) {
            return this.f1585l.n(this.f1571c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        I i = this.f1585l;
        if (i != null && i.e()) {
            return this.f1585l.o(this.f1571c0);
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
        ArrayList arrayList = this.f1587m;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i = 0; i < size; i++) {
            ((AbstractC0113F) arrayList.get(i)).b(canvas, this);
        }
        EdgeEffect edgeEffect = this.f1547D;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f1578g ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f1547D;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f1548E;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f1578g) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f1548E;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.F;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f1578g ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.F;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f1549G;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f1578g) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f1549G;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(save4);
        }
        if ((z2 || this.f1550H == null || arrayList.size() <= 0 || !this.f1550H.f()) ? z2 : true) {
            WeakHashMap weakHashMap = K.X.f419a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    public final void f(X x2) {
        View view = x2.f2172a;
        boolean z2 = view.getParent() == this;
        this.f1568b.j(H(view));
        if (x2.k()) {
            this.f1574e.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z2) {
            this.f1574e.a(view, -1, true);
            return;
        }
        r rVar = this.f1574e;
        int indexOfChild = ((C0138z) rVar.f811b).f2374a.indexOfChild(view);
        if (indexOfChild >= 0) {
            ((C0115b) rVar.f812c).i(indexOfChild);
            rVar.p(view);
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
        this.f1585l.getClass();
        boolean z3 = true;
        boolean z4 = (this.f1583k == null || this.f1585l == null || L() || this.f1600u) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        U u2 = this.f1571c0;
        O o2 = this.f1568b;
        if (z4 && (i == 2 || i == 1)) {
            if (this.f1585l.e()) {
                if (focusFinder.findNextFocus(this, view, i == 2 ? 130 : 33) == null) {
                    z2 = true;
                    if (!z2 && this.f1585l.d()) {
                        z2 = focusFinder.findNextFocus(this, view, !((this.f1585l.C() != 1) ^ (i != 2)) ? 66 : 17) != null;
                    }
                    if (z2) {
                        m();
                        if (A(view) == null) {
                            return null;
                        }
                        a0();
                        this.f1585l.S(view, i, o2, u2);
                        b0(false);
                    }
                    view2 = focusFinder.findNextFocus(this, view, i);
                }
            }
            z2 = false;
            if (!z2) {
                if (focusFinder.findNextFocus(this, view, !((this.f1585l.C() != 1) ^ (i != 2)) ? 66 : 17) != null) {
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
                view2 = this.f1585l.S(view, i, o2, u2);
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
                int i3 = this.f1585l.C() == 1 ? -1 : 1;
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

    public final void g(AbstractC0113F abstractC0113F) {
        I i = this.f1585l;
        if (i != null) {
            i.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f1587m;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(abstractC0113F);
        N();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        I i = this.f1585l;
        if (i != null) {
            return i.r();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        I i = this.f1585l;
        if (i != null) {
            return i.s(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC0108A getAdapter() {
        return this.f1583k;
    }

    @Override // android.view.View
    public int getBaseline() {
        I i = this.f1585l;
        if (i == null) {
            return super.getBaseline();
        }
        i.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f1578g;
    }

    public Z getCompatAccessibilityDelegate() {
        return this.f1582j0;
    }

    public C0111D getEdgeEffectFactory() {
        return this.f1546C;
    }

    public AbstractC0112E getItemAnimator() {
        return this.f1550H;
    }

    public int getItemDecorationCount() {
        return this.f1587m.size();
    }

    public I getLayoutManager() {
        return this.f1585l;
    }

    public int getMaxFlingVelocity() {
        return this.f1561S;
    }

    public int getMinFlingVelocity() {
        return this.f1560R;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public K getOnFlingListener() {
        return this.f1559Q;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f1564V;
    }

    public N getRecycledViewPool() {
        return this.f1568b.c();
    }

    public int getScrollState() {
        return this.f1551I;
    }

    public final void h(L l2) {
        if (this.f1575e0 == null) {
            this.f1575e0 = new ArrayList();
        }
        this.f1575e0.add(l2);
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
        if (this.f1545B > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + y()));
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f1592p;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f1600u;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f496d;
    }

    public final void k() {
        int m2 = this.f1574e.m();
        for (int i = 0; i < m2; i++) {
            X I2 = I(this.f1574e.l(i));
            if (!I2.p()) {
                I2.f2175d = -1;
                I2.f2178g = -1;
            }
        }
        O o2 = this.f1568b;
        ArrayList arrayList = o2.f2139c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            X x2 = (X) arrayList.get(i2);
            x2.f2175d = -1;
            x2.f2178g = -1;
        }
        ArrayList arrayList2 = o2.f2137a;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            X x3 = (X) arrayList2.get(i3);
            x3.f2175d = -1;
            x3.f2178g = -1;
        }
        ArrayList arrayList3 = o2.f2138b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                X x4 = (X) o2.f2138b.get(i4);
                x4.f2175d = -1;
                x4.f2178g = -1;
            }
        }
    }

    public final void l(int i, int i2) {
        boolean z2;
        EdgeEffect edgeEffect = this.f1547D;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z2 = false;
        } else {
            this.f1547D.onRelease();
            z2 = this.f1547D.isFinished();
        }
        EdgeEffect edgeEffect2 = this.F;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.F.onRelease();
            z2 |= this.F.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1548E;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f1548E.onRelease();
            z2 |= this.f1548E.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1549G;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f1549G.onRelease();
            z2 |= this.f1549G.isFinished();
        }
        if (z2) {
            WeakHashMap weakHashMap = K.X.f419a;
            postInvalidateOnAnimation();
        }
    }

    public final void m() {
        H.e eVar = this.f1572d;
        if (!this.f1596r || this.f1604y) {
            int i = i.f203a;
            Trace.beginSection("RV FullInvalidate");
            o();
            Trace.endSection();
            return;
        }
        if (eVar.f()) {
            eVar.getClass();
            if (eVar.f()) {
                int i2 = i.f203a;
                Trace.beginSection("RV FullInvalidate");
                o();
                Trace.endSection();
            }
        }
    }

    public final void n(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = K.X.f419a;
        setMeasuredDimension(I.g(i, paddingRight, getMinimumWidth()), I.g(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x0323, code lost:
    
        if (((java.util.ArrayList) r19.f1574e.f813d).contains(getFocusedChild()) == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0382, code lost:
    
        if (r6.hasFocusable() != false) goto L181;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [e0.X] */
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
        C0024u c0024u;
        int i;
        RecyclerView recyclerView;
        boolean g2;
        if (this.f1583k == null) {
            Log.e("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f1585l == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        U u2 = this.f1571c0;
        u2.i = false;
        if (u2.f2155d == 1) {
            p();
            this.f1585l.p0(this);
            q();
        } else {
            H.e eVar = this.f1572d;
            if ((((ArrayList) eVar.f224d).isEmpty() || ((ArrayList) eVar.f223c).isEmpty()) && this.f1585l.f2125n == getWidth() && this.f1585l.f2126o == getHeight()) {
                this.f1585l.p0(this);
            } else {
                this.f1585l.p0(this);
                q();
            }
        }
        u2.a(4);
        a0();
        P();
        u2.f2155d = 1;
        boolean z3 = u2.f2159j;
        View view2 = null;
        Long l2 = null;
        O o2 = this.f1568b;
        j jVar = this.f1576f;
        if (z3) {
            int f2 = this.f1574e.f() - 1;
            while (f2 >= 0) {
                X I2 = I(this.f1574e.e(f2));
                if (!I2.p()) {
                    long G2 = G(I2);
                    this.f1550H.getClass();
                    C0024u c0024u2 = new C0024u();
                    c0024u2.a(I2);
                    X x2 = (X) ((o.e) jVar.f37c).c(G2, l2);
                    if (x2 == null || x2.p()) {
                        jVar.f(I2, c0024u2);
                    } else {
                        k kVar = (k) jVar.f36b;
                        h0 h0Var = (h0) kVar.getOrDefault(x2, l2);
                        boolean z4 = (h0Var == null || (h0Var.f2262a & 1) == 0) ? false : true;
                        h0 h0Var2 = (h0) kVar.getOrDefault(I2, l2);
                        boolean z5 = (h0Var2 == null || (h0Var2.f2262a & 1) == 0) ? false : true;
                        if (z4 && x2 == I2) {
                            jVar.f(I2, c0024u2);
                        } else {
                            C0024u G3 = jVar.G(x2, 4);
                            jVar.f(I2, c0024u2);
                            C0024u G4 = jVar.G(I2, 8);
                            if (G3 == null) {
                                int f3 = this.f1574e.f();
                                for (int i2 = 0; i2 < f3; i2++) {
                                    X I3 = I(this.f1574e.e(i2));
                                    if (I3 != I2 && G(I3) == G2) {
                                        AbstractC0108A abstractC0108A = this.f1583k;
                                        if (abstractC0108A == null || !abstractC0108A.f2101b) {
                                            throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + I3 + " \n View Holder 2:" + I2 + y());
                                        }
                                        throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + I3 + " \n View Holder 2:" + I2 + y());
                                    }
                                }
                                Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + x2 + " cannot be found but it is necessary for " + I2 + y());
                            } else {
                                x2.o(false);
                                if (z4) {
                                    f(x2);
                                }
                                if (x2 != I2) {
                                    if (z5) {
                                        f(I2);
                                    }
                                    x2.h = I2;
                                    f(x2);
                                    o2.j(x2);
                                    I2.o(false);
                                    I2.i = x2;
                                }
                                if (this.f1550H.a(x2, I2, G3, G4)) {
                                    S();
                                }
                            }
                        }
                    }
                }
                f2--;
                l2 = null;
            }
            k kVar2 = (k) jVar.f36b;
            for (int i3 = kVar2.f3711c - 1; i3 >= 0; i3--) {
                X x3 = (X) kVar2.h(i3);
                h0 h0Var3 = (h0) kVar2.i(i3);
                int i4 = h0Var3.f2262a;
                int i5 = i4 & 3;
                C0138z c0138z = this.f1597r0;
                if (i5 == 3) {
                    RecyclerView recyclerView2 = c0138z.f2374a;
                    recyclerView2.f1585l.i0(x3.f2172a, recyclerView2.f1568b);
                } else if ((i4 & 1) != 0) {
                    C0024u c0024u3 = h0Var3.f2263b;
                    if (c0024u3 == null) {
                        RecyclerView recyclerView3 = c0138z.f2374a;
                        recyclerView3.f1585l.i0(x3.f2172a, recyclerView3.f1568b);
                    } else {
                        c0138z.g(x3, c0024u3, h0Var3.f2264c);
                    }
                } else if ((i4 & 14) == 14) {
                    c0138z.f(x3, h0Var3.f2263b, h0Var3.f2264c);
                } else if ((i4 & 12) == 12) {
                    C0024u c0024u4 = h0Var3.f2263b;
                    C0024u c0024u5 = h0Var3.f2264c;
                    c0138z.getClass();
                    x3.o(false);
                    RecyclerView recyclerView4 = c0138z.f2374a;
                    if (!recyclerView4.f1604y) {
                        C0122i c0122i = (C0122i) recyclerView4.f1550H;
                        c0122i.getClass();
                        int i6 = c0024u4.f501a;
                        int i7 = c0024u5.f501a;
                        if (i6 == i7 && c0024u4.f502b == c0024u5.f502b) {
                            c0122i.c(x3);
                            recyclerView = recyclerView4;
                            g2 = false;
                        } else {
                            recyclerView = recyclerView4;
                            g2 = c0122i.g(x3, i6, c0024u4.f502b, i7, c0024u5.f502b);
                        }
                        if (g2) {
                            recyclerView.S();
                        }
                    } else if (recyclerView4.f1550H.a(x3, x3, c0024u4, c0024u5)) {
                        recyclerView4.S();
                    }
                } else {
                    if ((i4 & 4) != 0) {
                        c0024u = null;
                        c0138z.g(x3, h0Var3.f2263b, null);
                    } else {
                        c0024u = null;
                        if ((i4 & 8) != 0) {
                            c0138z.f(x3, h0Var3.f2263b, h0Var3.f2264c);
                        }
                    }
                    i = 0;
                    h0Var3.f2262a = i;
                    h0Var3.f2263b = c0024u;
                    h0Var3.f2264c = c0024u;
                    h0.f2261d.c(h0Var3);
                }
                i = 0;
                c0024u = null;
                h0Var3.f2262a = i;
                h0Var3.f2263b = c0024u;
                h0Var3.f2264c = c0024u;
                h0.f2261d.c(h0Var3);
            }
            view2 = null;
        }
        this.f1585l.h0(o2);
        u2.f2153b = u2.f2156e;
        this.f1604y = false;
        this.f1605z = false;
        u2.f2159j = false;
        u2.f2160k = false;
        this.f1585l.f2119f = false;
        ArrayList arrayList = o2.f2138b;
        if (arrayList != null) {
            arrayList.clear();
        }
        I i8 = this.f1585l;
        if (i8.f2122k) {
            i8.f2121j = 0;
            i8.f2122k = false;
            o2.k();
        }
        this.f1585l.c0(u2);
        Q(true);
        b0(false);
        ((k) jVar.f36b).clear();
        ((o.e) jVar.f37c).a();
        int[] iArr = this.f1584k0;
        int i9 = iArr[0];
        int i10 = iArr[1];
        C(iArr);
        if ((iArr[0] == i9 && iArr[1] == i10) ? false : true) {
            t(0, 0);
        }
        if (this.f1564V && this.f1583k != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (!isFocused()) {
            }
            long j2 = u2.f2162m;
            if (j2 != -1 && (z2 = this.f1583k.f2101b) && z2) {
                int m2 = this.f1574e.m();
                r10 = view2;
                int i11 = 0;
                while (true) {
                    if (i11 >= m2) {
                        break;
                    }
                    X I4 = I(this.f1574e.l(i11));
                    if (I4 != null && !I4.i() && I4.f2176e == j2) {
                        if (!((ArrayList) this.f1574e.f813d).contains(I4.f2172a)) {
                            r10 = I4;
                            break;
                        }
                        r10 = I4;
                    }
                    i11++;
                    r10 = r10;
                }
            } else {
                r10 = view2;
            }
            if (r10 != null) {
                ArrayList arrayList2 = (ArrayList) this.f1574e.f813d;
                view = r10.f2172a;
                if (!arrayList2.contains(view)) {
                }
            }
            if (this.f1574e.f() > 0) {
                int i12 = u2.f2161l;
                if (i12 == -1) {
                    i12 = 0;
                }
                int b2 = u2.b();
                for (int i13 = i12; i13 < b2; i13++) {
                    X E2 = E(i13);
                    if (E2 == null) {
                        break;
                    }
                    View view3 = E2.f2172a;
                    if (view3.hasFocusable()) {
                        view2 = view3;
                        break;
                    }
                }
                for (int min = Math.min(b2, i12) - 1; min >= 0; min--) {
                    X E3 = E(min);
                    if (E3 == null) {
                        break;
                    }
                    view = E3.f2172a;
                    if (view.hasFocusable()) {
                        view2 = view;
                        break;
                    }
                }
            }
            if (view2 != null) {
                int i14 = u2.f2163n;
                if (i14 != -1 && (findViewById = view2.findViewById(i14)) != null && findViewById.isFocusable()) {
                    view2 = findViewById;
                }
                view2.requestFocus();
            }
        }
        u2.f2162m = -1L;
        u2.f2161l = -1;
        u2.f2163n = -1;
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
        this.f1544A = 0;
        this.f1592p = true;
        this.f1596r = this.f1596r && !isLayoutRequested();
        I i = this.f1585l;
        if (i != null) {
            i.f2120g = true;
            i.Q(this);
        }
        this.i0 = false;
        ThreadLocal threadLocal = RunnableC0128o.f2316e;
        RunnableC0128o runnableC0128o = (RunnableC0128o) threadLocal.get();
        this.f1567a0 = runnableC0128o;
        if (runnableC0128o == null) {
            RunnableC0128o runnableC0128o2 = new RunnableC0128o();
            runnableC0128o2.f2318a = new ArrayList();
            runnableC0128o2.f2321d = new ArrayList();
            this.f1567a0 = runnableC0128o2;
            WeakHashMap weakHashMap = K.X.f419a;
            Display display = getDisplay();
            if (!isInEditMode() && display != null) {
                f2 = display.getRefreshRate();
            }
            f2 = 60.0f;
            RunnableC0128o runnableC0128o3 = this.f1567a0;
            runnableC0128o3.f2320c = (long) (1.0E9f / f2);
            threadLocal.set(runnableC0128o3);
        }
        this.f1567a0.f2318a.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C0134v c0134v;
        super.onDetachedFromWindow();
        AbstractC0112E abstractC0112E = this.f1550H;
        if (abstractC0112E != null) {
            abstractC0112E.e();
        }
        setScrollState(0);
        W w2 = this.f1565W;
        w2.f2170g.removeCallbacks(w2);
        w2.f2166c.abortAnimation();
        I i = this.f1585l;
        if (i != null && (c0134v = i.f2118e) != null) {
            c0134v.i();
        }
        this.f1592p = false;
        I i2 = this.f1585l;
        if (i2 != null) {
            i2.f2120g = false;
            i2.R(this);
        }
        this.f1593p0.clear();
        removeCallbacks(this.f1595q0);
        this.f1576f.getClass();
        while (h0.f2261d.a() != null) {
        }
        RunnableC0128o runnableC0128o = this.f1567a0;
        if (runnableC0128o != null) {
            runnableC0128o.f2318a.remove(this);
            this.f1567a0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f1587m;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0113F) arrayList.get(i)).a(this);
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
        if (this.f1585l != null && !this.f1600u && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f2 = this.f1585l.e() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f1585l.d()) {
                    f3 = motionEvent.getAxisValue(10);
                    if (f2 == 0.0f || f3 != 0.0f) {
                        W((int) (f3 * this.f1562T), (int) (f2 * this.f1563U), motionEvent);
                    }
                }
                f3 = 0.0f;
                if (f2 == 0.0f) {
                }
                W((int) (f3 * this.f1562T), (int) (f2 * this.f1563U), motionEvent);
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f1585l.e()) {
                        f2 = -axisValue;
                        f3 = 0.0f;
                        if (f2 == 0.0f) {
                        }
                        W((int) (f3 * this.f1562T), (int) (f2 * this.f1563U), motionEvent);
                    } else if (this.f1585l.d()) {
                        f3 = axisValue;
                        f2 = 0.0f;
                        if (f2 == 0.0f) {
                        }
                        W((int) (f3 * this.f1562T), (int) (f2 * this.f1563U), motionEvent);
                    }
                }
                f2 = 0.0f;
                f3 = 0.0f;
                if (f2 == 0.0f) {
                }
                W((int) (f3 * this.f1562T), (int) (f2 * this.f1563U), motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (this.f1600u) {
            return false;
        }
        this.f1590o = null;
        if (B(motionEvent)) {
            V();
            setScrollState(0);
            return true;
        }
        I i = this.f1585l;
        if (i == null) {
            return false;
        }
        boolean d2 = i.d();
        boolean e2 = this.f1585l.e();
        if (this.f1553K == null) {
            this.f1553K = VelocityTracker.obtain();
        }
        this.f1553K.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f1601v) {
                this.f1601v = false;
            }
            this.f1552J = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.f1556N = x2;
            this.f1554L = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.f1557O = y2;
            this.f1555M = y2;
            if (this.f1551I == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                c0(1);
            }
            int[] iArr = this.f1589n0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i2 = d2;
            if (e2) {
                i2 = (d2 ? 1 : 0) | 2;
            }
            getScrollingChildHelper().g(i2, 0);
        } else if (actionMasked == 1) {
            this.f1553K.clear();
            c0(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f1552J);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f1552J + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f1551I != 1) {
                int i3 = x3 - this.f1554L;
                int i4 = y3 - this.f1555M;
                if (d2 == 0 || Math.abs(i3) <= this.f1558P) {
                    z2 = false;
                } else {
                    this.f1556N = x3;
                    z2 = true;
                }
                if (e2 && Math.abs(i4) > this.f1558P) {
                    this.f1557O = y3;
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
            this.f1552J = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f1556N = x4;
            this.f1554L = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f1557O = y4;
            this.f1555M = y4;
        } else if (actionMasked == 6) {
            R(motionEvent);
        }
        return this.f1551I == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int i5 = i.f203a;
        Trace.beginSection("RV OnLayout");
        o();
        Trace.endSection();
        this.f1596r = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        I i3 = this.f1585l;
        if (i3 == null) {
            n(i, i2);
            return;
        }
        boolean L2 = i3.L();
        U u2 = this.f1571c0;
        if (!L2) {
            if (this.f1594q) {
                this.f1585l.f2115b.n(i, i2);
                return;
            }
            if (u2.f2160k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            AbstractC0108A abstractC0108A = this.f1583k;
            if (abstractC0108A != null) {
                u2.f2156e = abstractC0108A.a();
            } else {
                u2.f2156e = 0;
            }
            a0();
            this.f1585l.f2115b.n(i, i2);
            b0(false);
            u2.f2158g = false;
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.f1585l.f2115b.n(i, i2);
        if ((mode == 1073741824 && mode2 == 1073741824) || this.f1583k == null) {
            return;
        }
        if (u2.f2155d == 1) {
            p();
        }
        this.f1585l.q0(i, i2);
        u2.i = true;
        q();
        this.f1585l.s0(i, i2);
        if (this.f1585l.v0()) {
            this.f1585l.q0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            u2.i = true;
            q();
            this.f1585l.s0(i, i2);
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
        if (!(parcelable instanceof Q)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Q q2 = (Q) parcelable;
        this.f1570c = q2;
        super.onRestoreInstanceState(q2.f736a);
        I i = this.f1585l;
        if (i == null || (parcelable2 = this.f1570c.f2144c) == null) {
            return;
        }
        i.d0(parcelable2);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Q q2 = new Q(super.onSaveInstanceState());
        Q q3 = this.f1570c;
        if (q3 != null) {
            q2.f2144c = q3.f2144c;
        } else {
            I i = this.f1585l;
            if (i != null) {
                q2.f2144c = i.e0();
            } else {
                q2.f2144c = null;
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
        this.f1549G = null;
        this.f1548E = null;
        this.F = null;
        this.f1547D = null;
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
        if (this.f1600u || this.f1601v) {
            return false;
        }
        C0125l c0125l = this.f1590o;
        if (c0125l == null) {
            z2 = motionEvent.getAction() == 0 ? false : B(motionEvent);
        } else {
            if (c0125l.f2302v != 0) {
                if (motionEvent.getAction() == 0) {
                    boolean d2 = c0125l.d(motionEvent.getX(), motionEvent.getY());
                    boolean c2 = c0125l.c(motionEvent.getX(), motionEvent.getY());
                    if (d2 || c2) {
                        if (c2) {
                            c0125l.f2303w = 1;
                            c0125l.f2296p = (int) motionEvent.getX();
                        } else if (d2) {
                            c0125l.f2303w = 2;
                            c0125l.f2293m = (int) motionEvent.getY();
                        }
                        c0125l.f(2);
                    }
                } else if (motionEvent.getAction() == 1 && c0125l.f2302v == 2) {
                    c0125l.f2293m = 0.0f;
                    c0125l.f2296p = 0.0f;
                    c0125l.f(1);
                    c0125l.f2303w = 0;
                } else if (motionEvent.getAction() == 2 && c0125l.f2302v == 2) {
                    c0125l.g();
                    int i3 = c0125l.f2303w;
                    int i4 = c0125l.f2284b;
                    if (i3 == 1) {
                        float x2 = motionEvent.getX();
                        int[] iArr = c0125l.f2305y;
                        iArr[0] = i4;
                        int i5 = c0125l.f2297q - i4;
                        iArr[1] = i5;
                        float max = Math.max(i4, Math.min(i5, x2));
                        if (Math.abs(c0125l.f2295o - max) >= 2.0f) {
                            int e2 = C0125l.e(c0125l.f2296p, max, iArr, c0125l.f2299s.computeHorizontalScrollRange(), c0125l.f2299s.computeHorizontalScrollOffset(), c0125l.f2297q);
                            if (e2 != 0) {
                                c0125l.f2299s.scrollBy(e2, 0);
                            }
                            c0125l.f2296p = max;
                        }
                    }
                    if (c0125l.f2303w == 2) {
                        float y2 = motionEvent.getY();
                        int[] iArr2 = c0125l.f2304x;
                        iArr2[0] = i4;
                        int i6 = c0125l.f2298r - i4;
                        iArr2[1] = i6;
                        float max2 = Math.max(i4, Math.min(i6, y2));
                        if (Math.abs(c0125l.f2292l - max2) >= 2.0f) {
                            int e3 = C0125l.e(c0125l.f2293m, max2, iArr2, c0125l.f2299s.computeVerticalScrollRange(), c0125l.f2299s.computeVerticalScrollOffset(), c0125l.f2298r);
                            if (e3 != 0) {
                                c0125l.f2299s.scrollBy(0, e3);
                            }
                            c0125l.f2293m = max2;
                        }
                    }
                }
            }
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.f1590o = null;
            }
            z2 = true;
        }
        if (z2) {
            V();
            setScrollState(0);
            return true;
        }
        I i7 = this.f1585l;
        if (i7 == null) {
            return false;
        }
        boolean d3 = i7.d();
        boolean e4 = this.f1585l.e();
        if (this.f1553K == null) {
            this.f1553K = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        int[] iArr3 = this.f1589n0;
        if (actionMasked == 0) {
            iArr3[1] = 0;
            iArr3[0] = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(iArr3[0], iArr3[1]);
        if (actionMasked == 0) {
            recyclerView = this;
            motionEvent2 = obtain;
            recyclerView.f1552J = motionEvent.getPointerId(0);
            int x3 = (int) (motionEvent.getX() + 0.5f);
            recyclerView.f1556N = x3;
            recyclerView.f1554L = x3;
            int y3 = (int) (motionEvent.getY() + 0.5f);
            recyclerView.f1557O = y3;
            recyclerView.f1555M = y3;
            int i8 = d3;
            if (e4) {
                i8 = (d3 ? 1 : 0) | 2;
            }
            getScrollingChildHelper().g(i8, 0);
        } else {
            if (actionMasked == 1) {
                this.f1553K.addMovement(obtain);
                VelocityTracker velocityTracker = this.f1553K;
                int i9 = this.f1561S;
                velocityTracker.computeCurrentVelocity(1000, i9);
                float f2 = d3 != 0 ? -this.f1553K.getXVelocity(this.f1552J) : 0.0f;
                float f3 = e4 ? -this.f1553K.getYVelocity(this.f1552J) : 0.0f;
                if (f2 == 0.0f && f3 == 0.0f) {
                    recyclerView2 = this;
                    i2 = 0;
                    motionEvent4 = obtain;
                } else {
                    int i10 = (int) f2;
                    int i11 = (int) f3;
                    I i12 = this.f1585l;
                    if (i12 == null) {
                        Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                    } else if (!this.f1600u) {
                        int d4 = i12.d();
                        boolean e5 = this.f1585l.e();
                        int i13 = this.f1560R;
                        if (d4 == 0 || Math.abs(i10) < i13) {
                            i10 = 0;
                        }
                        if (!e5 || Math.abs(i11) < i13) {
                            i11 = 0;
                        }
                        if (i10 != 0 || i11 != 0) {
                            float f4 = i10;
                            float f5 = i11;
                            if (!dispatchNestedPreFling(f4, f5)) {
                                boolean z5 = d4 != 0 || e5;
                                dispatchNestedFling(f4, f5, z5);
                                K k2 = this.f1559Q;
                                if (k2 != null) {
                                    C0137y c0137y = (C0137y) k2;
                                    I layoutManager = c0137y.f2370a.getLayoutManager();
                                    if (layoutManager != 0 && c0137y.f2370a.getAdapter() != null && ((Math.abs(i11) > (minFlingVelocity = c0137y.f2370a.getMinFlingVelocity()) || Math.abs(i10) > minFlingVelocity) && ((z3 = layoutManager instanceof T)))) {
                                        C0136x c0136x = !z3 ? null : new C0136x(c0137y, c0137y.f2370a.getContext(), 0);
                                        if (c0136x != null) {
                                            int B2 = layoutManager.B();
                                            if (B2 != 0) {
                                                g e6 = layoutManager.e() ? c0137y.e(layoutManager) : layoutManager.d() ? c0137y.d(layoutManager) : null;
                                                if (e6 != null) {
                                                    int v2 = layoutManager.v();
                                                    motionEvent4 = obtain;
                                                    int i14 = Integer.MIN_VALUE;
                                                    int i15 = Integer.MAX_VALUE;
                                                    int i16 = 0;
                                                    View view = null;
                                                    View view2 = null;
                                                    while (i16 < v2) {
                                                        int i17 = v2;
                                                        View u2 = layoutManager.u(i16);
                                                        if (u2 != null) {
                                                            int b2 = C0137y.b(u2, e6);
                                                            if (b2 <= 0 && b2 > i14) {
                                                                i14 = b2;
                                                                view2 = u2;
                                                            }
                                                            if (b2 >= 0 && b2 < i15) {
                                                                i15 = b2;
                                                                view = u2;
                                                            }
                                                        }
                                                        i16++;
                                                        v2 = i17;
                                                    }
                                                    boolean z6 = !layoutManager.d() ? i11 <= 0 : i10 <= 0;
                                                    if (z6 && view != null) {
                                                        i = I.H(view);
                                                    } else if (z6 || view2 == null) {
                                                        if (z6) {
                                                            view = view2;
                                                        }
                                                        if (view != null) {
                                                            int H2 = ((z3 && (a2 = ((T) layoutManager).a(layoutManager.B() - 1)) != null && ((a2.x > 0.0f ? 1 : (a2.x == 0.0f ? 0 : -1)) < 0 || (a2.y > 0.0f ? 1 : (a2.y == 0.0f ? 0 : -1)) < 0)) == z6 ? -1 : 1) + I.H(view);
                                                            if (H2 >= 0 && H2 < B2) {
                                                                i = H2;
                                                            }
                                                        }
                                                        i = -1;
                                                    } else {
                                                        i = I.H(view2);
                                                    }
                                                    if (i != -1) {
                                                        c0136x.f2353a = i;
                                                        layoutManager.y0(c0136x);
                                                        V();
                                                        motionEvent3 = motionEvent4;
                                                        motionEvent3.recycle();
                                                        return true;
                                                    }
                                                    if (z5) {
                                                        if (e5) {
                                                            d4 = (d4 == true ? 1 : 0) | 2;
                                                        }
                                                        getScrollingChildHelper().g(d4, 1);
                                                        int i18 = -i9;
                                                        int max3 = Math.max(i18, Math.min(i10, i9));
                                                        int max4 = Math.max(i18, Math.min(i11, i9));
                                                        W w2 = this.f1565W;
                                                        RecyclerView recyclerView3 = w2.f2170g;
                                                        recyclerView3.setScrollState(2);
                                                        w2.f2165b = 0;
                                                        w2.f2164a = 0;
                                                        Interpolator interpolator = w2.f2167d;
                                                        d dVar = f1543u0;
                                                        if (interpolator != dVar) {
                                                            w2.f2167d = dVar;
                                                            w2.f2166c = new OverScroller(recyclerView3.getContext(), dVar);
                                                        }
                                                        w2.f2166c.fling(0, 0, max3, max4, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                                        w2.a();
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
                int findPointerIndex = motionEvent.findPointerIndex(this.f1552J);
                if (findPointerIndex < 0) {
                    Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f1552J + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                int x4 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                int y4 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                int i19 = this.f1556N - x4;
                int i20 = this.f1557O - y4;
                if (this.f1551I != 1) {
                    if (d3 != 0) {
                        i19 = i19 > 0 ? Math.max(0, i19 - this.f1558P) : Math.min(0, i19 + this.f1558P);
                        if (i19 != 0) {
                            z4 = true;
                            if (e4) {
                                i20 = i20 > 0 ? Math.max(0, i20 - this.f1558P) : Math.min(0, i20 + this.f1558P);
                                if (i20 != 0) {
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
                int i21 = i19;
                int i22 = i20;
                if (this.f1551I == 1) {
                    int[] iArr4 = this.f1591o0;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    boolean r2 = r(d3 != 0 ? i21 : 0, e4 ? i22 : 0, iArr4, this.m0, 0);
                    int[] iArr5 = this.m0;
                    if (r2) {
                        i21 -= iArr4[0];
                        i22 -= iArr4[1];
                        iArr3[0] = iArr3[0] + iArr5[0];
                        iArr3[1] = iArr3[1] + iArr5[1];
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int i23 = i21;
                    int i24 = i22;
                    this.f1556N = x4 - iArr5[0];
                    this.f1557O = y4 - iArr5[1];
                    if (W(d3 != 0 ? i23 : 0, e4 ? i24 : 0, motionEvent)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    RunnableC0128o runnableC0128o = this.f1567a0;
                    if (runnableC0128o != null && (i23 != 0 || i24 != 0)) {
                        runnableC0128o.a(this, i23, i24);
                    }
                }
            } else if (actionMasked == 3) {
                V();
                setScrollState(0);
            } else if (actionMasked == 5) {
                this.f1552J = motionEvent.getPointerId(actionIndex);
                int x5 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.f1556N = x5;
                this.f1554L = x5;
                int y5 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.f1557O = y5;
                this.f1555M = y5;
            } else if (actionMasked == 6) {
                R(motionEvent);
            }
            recyclerView = this;
            motionEvent2 = obtain;
        }
        motionEvent3 = motionEvent2;
        recyclerView.f1553K.addMovement(motionEvent3);
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
        h0 h0Var;
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
        C0114a g2;
        int i5;
        int i6;
        C0114a c0114a;
        U u2 = this.f1571c0;
        u2.a(1);
        z(u2);
        u2.i = false;
        a0();
        j jVar = this.f1576f;
        ((k) jVar.f36b).clear();
        o.e eVar = (o.e) jVar.f37c;
        eVar.a();
        P();
        if (this.f1604y) {
            H.e eVar2 = this.f1572d;
            eVar2.i((ArrayList) eVar2.f223c);
            eVar2.i((ArrayList) eVar2.f224d);
            if (this.f1605z) {
                this.f1585l.X();
            }
        }
        if (this.f1550H == null || !this.f1585l.z0()) {
            this.f1572d.b();
        } else {
            H.e eVar3 = this.f1572d;
            ArrayList arrayList = (ArrayList) eVar3.f223c;
            B0.d dVar = (B0.d) eVar3.f226f;
            dVar.getClass();
            while (true) {
                int size = arrayList.size() - 1;
                boolean z7 = false;
                while (true) {
                    i = 8;
                    if (size < 0) {
                        size = -1;
                        break;
                    }
                    if (((C0114a) arrayList.get(size)).f2192a == 8) {
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
                C0114a c0114a2 = (C0114a) arrayList.get(size);
                C0114a c0114a3 = (C0114a) arrayList.get(i7);
                int i8 = c0114a3.f2192a;
                if (i8 != 1) {
                    C0114a c0114a4 = null;
                    H.e eVar4 = (H.e) dVar.f66b;
                    if (i8 == 2) {
                        int i9 = c0114a2.f2193b;
                        int i10 = c0114a2.f2194c;
                        if (i9 < i10) {
                            if (c0114a3.f2193b == i9 && c0114a3.f2194c == i10 - i9) {
                                z5 = false;
                                z6 = true;
                            } else {
                                z5 = false;
                                z6 = false;
                            }
                        } else if (c0114a3.f2193b == i10 + 1 && c0114a3.f2194c == i9 - i10) {
                            z5 = true;
                            z6 = true;
                        } else {
                            z5 = true;
                            z6 = false;
                        }
                        int i11 = c0114a3.f2193b;
                        if (i10 < i11) {
                            c0114a3.f2193b = i11 - 1;
                        } else {
                            int i12 = c0114a3.f2194c;
                            if (i10 < i11 + i12) {
                                c0114a3.f2194c = i12 - 1;
                                c0114a2.f2192a = 2;
                                c0114a2.f2194c = 1;
                                if (c0114a3.f2194c == 0) {
                                    arrayList.remove(i7);
                                    eVar4.getClass();
                                    ((b) eVar4.f222b).c(c0114a3);
                                }
                            }
                        }
                        int i13 = c0114a2.f2193b;
                        int i14 = c0114a3.f2193b;
                        if (i13 <= i14) {
                            c0114a3.f2193b = i14 + 1;
                        } else {
                            int i15 = i14 + c0114a3.f2194c;
                            if (i13 < i15) {
                                c0114a4 = eVar4.g(2, i13 + 1, i15 - i13);
                                c0114a3.f2194c = c0114a2.f2193b - c0114a3.f2193b;
                            }
                        }
                        C0114a c0114a5 = c0114a4;
                        if (z6) {
                            arrayList.set(size, c0114a3);
                            arrayList.remove(i7);
                            eVar4.getClass();
                            ((b) eVar4.f222b).c(c0114a2);
                        } else {
                            if (z5) {
                                if (c0114a5 != null) {
                                    int i16 = c0114a2.f2193b;
                                    if (i16 > c0114a5.f2193b) {
                                        c0114a2.f2193b = i16 - c0114a5.f2194c;
                                    }
                                    int i17 = c0114a2.f2194c;
                                    if (i17 > c0114a5.f2193b) {
                                        c0114a2.f2194c = i17 - c0114a5.f2194c;
                                    }
                                }
                                int i18 = c0114a2.f2193b;
                                if (i18 > c0114a3.f2193b) {
                                    c0114a2.f2193b = i18 - c0114a3.f2194c;
                                }
                                int i19 = c0114a2.f2194c;
                                if (i19 > c0114a3.f2193b) {
                                    c0114a2.f2194c = i19 - c0114a3.f2194c;
                                }
                            } else {
                                if (c0114a5 != null) {
                                    int i20 = c0114a2.f2193b;
                                    if (i20 >= c0114a5.f2193b) {
                                        c0114a2.f2193b = i20 - c0114a5.f2194c;
                                    }
                                    int i21 = c0114a2.f2194c;
                                    if (i21 >= c0114a5.f2193b) {
                                        c0114a2.f2194c = i21 - c0114a5.f2194c;
                                    }
                                }
                                int i22 = c0114a2.f2193b;
                                if (i22 >= c0114a3.f2193b) {
                                    c0114a2.f2193b = i22 - c0114a3.f2194c;
                                }
                                int i23 = c0114a2.f2194c;
                                if (i23 >= c0114a3.f2193b) {
                                    c0114a2.f2194c = i23 - c0114a3.f2194c;
                                }
                            }
                            arrayList.set(size, c0114a3);
                            if (c0114a2.f2193b != c0114a2.f2194c) {
                                arrayList.set(i7, c0114a2);
                            } else {
                                arrayList.remove(i7);
                            }
                            if (c0114a5 != null) {
                                arrayList.add(size, c0114a5);
                            }
                        }
                    } else if (i8 == 4) {
                        int i24 = c0114a2.f2194c;
                        int i25 = c0114a3.f2193b;
                        if (i24 < i25) {
                            c0114a3.f2193b = i25 - 1;
                        } else {
                            int i26 = c0114a3.f2194c;
                            if (i24 < i25 + i26) {
                                c0114a3.f2194c = i26 - 1;
                                g2 = eVar4.g(4, c0114a2.f2193b, 1);
                                i5 = c0114a2.f2193b;
                                i6 = c0114a3.f2193b;
                                if (i5 > i6) {
                                    c0114a3.f2193b = i6 + 1;
                                } else {
                                    int i27 = i6 + c0114a3.f2194c;
                                    if (i5 < i27) {
                                        int i28 = i27 - i5;
                                        c0114a4 = eVar4.g(4, i5 + 1, i28);
                                        c0114a3.f2194c -= i28;
                                    }
                                }
                                c0114a = c0114a4;
                                arrayList.set(i7, c0114a2);
                                if (c0114a3.f2194c <= 0) {
                                    arrayList.set(size, c0114a3);
                                } else {
                                    arrayList.remove(size);
                                    eVar4.getClass();
                                    ((b) eVar4.f222b).c(c0114a3);
                                }
                                if (g2 != null) {
                                    arrayList.add(size, g2);
                                }
                                if (c0114a == null) {
                                    arrayList.add(size, c0114a);
                                }
                            }
                        }
                        g2 = null;
                        i5 = c0114a2.f2193b;
                        i6 = c0114a3.f2193b;
                        if (i5 > i6) {
                        }
                        c0114a = c0114a4;
                        arrayList.set(i7, c0114a2);
                        if (c0114a3.f2194c <= 0) {
                        }
                        if (g2 != null) {
                        }
                        if (c0114a == null) {
                        }
                    }
                } else {
                    int i29 = c0114a2.f2194c;
                    int i30 = c0114a3.f2193b;
                    int i31 = i29 < i30 ? -1 : 0;
                    int i32 = c0114a2.f2193b;
                    if (i32 < i30) {
                        i31++;
                    }
                    if (i30 <= i32) {
                        c0114a2.f2193b = i32 + c0114a3.f2194c;
                    }
                    int i33 = c0114a3.f2193b;
                    if (i33 <= i29) {
                        c0114a2.f2194c = i29 + c0114a3.f2194c;
                    }
                    c0114a3.f2193b = i33 + i31;
                    arrayList.set(size, c0114a3);
                    arrayList.set(i7, c0114a2);
                }
            }
            int size2 = arrayList.size();
            int i34 = 0;
            while (i34 < size2) {
                C0114a c0114a6 = (C0114a) arrayList.get(i34);
                int i35 = c0114a6.f2192a;
                if (i35 != 1) {
                    b bVar = (b) eVar3.f222b;
                    C0138z c0138z = (C0138z) eVar3.f225e;
                    if (i35 == 2) {
                        i2 = size2;
                        int i36 = c0114a6.f2193b;
                        int i37 = c0114a6.f2194c + i36;
                        int i38 = i36;
                        int i39 = 0;
                        char c3 = 65535;
                        while (i38 < i37) {
                            if (c0138z.b(i38) != null || eVar3.a(i38)) {
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
                        if (i39 != c0114a6.f2194c) {
                            bVar.c(c0114a6);
                            c0114a6 = eVar3.g(2, i36, i39);
                        }
                        if (c3 == 0) {
                            eVar3.c(c0114a6);
                        } else {
                            eVar3.h(c0114a6);
                        }
                    } else if (i35 != 4) {
                        if (i35 == i) {
                            eVar3.h(c0114a6);
                        }
                        i2 = size2;
                    } else {
                        int i40 = c0114a6.f2193b;
                        int i41 = c0114a6.f2194c + i40;
                        int i42 = i40;
                        char c4 = 65535;
                        int i43 = 0;
                        while (i40 < i41) {
                            if (c0138z.b(i40) != null || eVar3.a(i40)) {
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
                        if (i43 != c0114a6.f2194c) {
                            bVar.c(c0114a6);
                            c0114a6 = eVar3.g(4, i42, i43);
                        }
                        if (c4 == 0) {
                            eVar3.c(c0114a6);
                        } else {
                            eVar3.h(c0114a6);
                        }
                    }
                } else {
                    i2 = size2;
                    eVar3.h(c0114a6);
                }
                i34++;
                size2 = i2;
                i = 8;
            }
            arrayList.clear();
        }
        boolean z8 = this.f1577f0 || this.f1579g0;
        boolean z9 = this.f1596r && this.f1550H != null && ((z2 = this.f1604y) || z8 || this.f1585l.f2119f) && (!z2 || this.f1583k.f2101b);
        U u3 = this.f1571c0;
        u3.f2159j = z9;
        u3.f2160k = z9 && z8 && !this.f1604y && this.f1550H != null && this.f1585l.z0();
        View focusedChild = (this.f1564V && hasFocus() && this.f1583k != null) ? getFocusedChild() : null;
        X H2 = (focusedChild == null || (A2 = A(focusedChild)) == null) ? null : H(A2);
        if (H2 == null) {
            u2.f2162m = -1L;
            u2.f2161l = -1;
            u2.f2163n = -1;
        } else {
            u2.f2162m = this.f1583k.f2101b ? H2.f2176e : -1L;
            if (!this.f1604y) {
                if (H2.i()) {
                    F = H2.f2175d;
                } else {
                    RecyclerView recyclerView = H2.f2187r;
                    if (recyclerView != null) {
                        F = recyclerView.F(H2);
                    }
                }
                u2.f2161l = F;
                view = H2.f2172a;
                int id = view.getId();
                while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                    view = ((ViewGroup) view).getFocusedChild();
                    if (view.getId() == -1) {
                        id = view.getId();
                    }
                }
                u2.f2163n = id;
            }
            F = -1;
            u2.f2161l = F;
            view = H2.f2172a;
            int id2 = view.getId();
            while (!view.isFocused()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() == -1) {
                }
            }
            u2.f2163n = id2;
        }
        u2.h = u2.f2159j && this.f1579g0;
        this.f1579g0 = false;
        this.f1577f0 = false;
        u2.f2158g = u2.f2160k;
        u2.f2156e = this.f1583k.a();
        C(this.f1584k0);
        boolean z10 = u2.f2159j;
        k kVar = (k) jVar.f36b;
        if (z10) {
            int f2 = this.f1574e.f();
            for (int i44 = 0; i44 < f2; i44++) {
                X I2 = I(this.f1574e.e(i44));
                if (!I2.p() && (!I2.g() || this.f1583k.f2101b)) {
                    AbstractC0112E abstractC0112E = this.f1550H;
                    AbstractC0112E.b(I2);
                    I2.c();
                    abstractC0112E.getClass();
                    C0024u c0024u = new C0024u();
                    c0024u.a(I2);
                    h0 h0Var2 = (h0) kVar.getOrDefault(I2, null);
                    if (h0Var2 == null) {
                        h0Var2 = h0.a();
                        kVar.put(I2, h0Var2);
                    }
                    h0Var2.f2263b = c0024u;
                    h0Var2.f2262a |= 4;
                    if (u2.h && I2.l() && !I2.i() && !I2.p() && !I2.g()) {
                        eVar.d(G(I2), I2);
                    }
                }
            }
        }
        if (u2.f2160k) {
            int m2 = this.f1574e.m();
            for (int i45 = 0; i45 < m2; i45++) {
                X I3 = I(this.f1574e.l(i45));
                if (!I3.p() && I3.f2175d == -1) {
                    I3.f2175d = I3.f2174c;
                }
            }
            boolean z11 = u2.f2157f;
            u2.f2157f = false;
            this.f1585l.b0(this.f1568b, u2);
            u2.f2157f = z11;
            for (int i46 = 0; i46 < this.f1574e.f(); i46++) {
                X I4 = I(this.f1574e.e(i46));
                if (!I4.p() && ((h0Var = (h0) kVar.getOrDefault(I4, null)) == null || (h0Var.f2262a & 4) == 0)) {
                    AbstractC0112E.b(I4);
                    boolean d2 = I4.d(8192);
                    AbstractC0112E abstractC0112E2 = this.f1550H;
                    I4.c();
                    abstractC0112E2.getClass();
                    C0024u c0024u2 = new C0024u();
                    c0024u2.a(I4);
                    if (d2) {
                        T(I4, c0024u2);
                    } else {
                        h0 h0Var3 = (h0) kVar.getOrDefault(I4, null);
                        if (h0Var3 == null) {
                            h0Var3 = h0.a();
                            kVar.put(I4, h0Var3);
                        }
                        h0Var3.f2262a |= 2;
                        h0Var3.f2263b = c0024u2;
                    }
                }
            }
            k();
        } else {
            k();
        }
        Q(true);
        b0(false);
        u2.f2155d = 2;
    }

    public final void q() {
        a0();
        P();
        U u2 = this.f1571c0;
        u2.a(6);
        this.f1572d.b();
        u2.f2156e = this.f1583k.a();
        u2.f2154c = 0;
        u2.f2158g = false;
        this.f1585l.b0(this.f1568b, u2);
        u2.f2157f = false;
        this.f1570c = null;
        u2.f2159j = u2.f2159j && this.f1550H != null;
        u2.f2155d = 4;
        Q(true);
        b0(false);
    }

    public final boolean r(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().c(i, i2, iArr, iArr2, i3);
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z2) {
        X I2 = I(view);
        if (I2 != null) {
            if (I2.k()) {
                I2.f2179j &= -257;
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
        C0134v c0134v = this.f1585l.f2118e;
        if ((c0134v == null || !c0134v.f2357e) && !L() && view2 != null) {
            U(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.f1585l.k0(this, view, rect, z2, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        ArrayList arrayList = this.f1588n;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C0125l) arrayList.get(i)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f1598s != 0 || this.f1600u) {
            this.f1599t = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().d(i, i2, i3, i4, iArr, i5, iArr2);
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        I i3 = this.f1585l;
        if (i3 == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f1600u) {
            return;
        }
        boolean d2 = i3.d();
        boolean e2 = this.f1585l.e();
        if (d2 || e2) {
            if (!d2) {
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
            this.f1602w |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(Z z2) {
        this.f1582j0 = z2;
        K.X.l(this, z2);
    }

    public void setAdapter(AbstractC0108A abstractC0108A) {
        setLayoutFrozen(false);
        AbstractC0108A abstractC0108A2 = this.f1583k;
        e eVar = this.f1566a;
        if (abstractC0108A2 != null) {
            abstractC0108A2.f2100a.unregisterObserver(eVar);
            this.f1583k.getClass();
        }
        AbstractC0112E abstractC0112E = this.f1550H;
        if (abstractC0112E != null) {
            abstractC0112E.e();
        }
        I i = this.f1585l;
        O o2 = this.f1568b;
        if (i != null) {
            i.g0(o2);
            this.f1585l.h0(o2);
        }
        o2.f2137a.clear();
        o2.d();
        H.e eVar2 = this.f1572d;
        eVar2.i((ArrayList) eVar2.f223c);
        eVar2.i((ArrayList) eVar2.f224d);
        AbstractC0108A abstractC0108A3 = this.f1583k;
        this.f1583k = abstractC0108A;
        if (abstractC0108A != null) {
            abstractC0108A.f2100a.registerObserver(eVar);
        }
        AbstractC0108A abstractC0108A4 = this.f1583k;
        o2.f2137a.clear();
        o2.d();
        N c2 = o2.c();
        if (abstractC0108A3 != null) {
            c2.f2136b--;
        }
        if (c2.f2136b == 0) {
            int i2 = 0;
            while (true) {
                SparseArray sparseArray = c2.f2135a;
                if (i2 >= sparseArray.size()) {
                    break;
                }
                ((M) sparseArray.valueAt(i2)).f2131a.clear();
                i2++;
            }
        }
        if (abstractC0108A4 != null) {
            c2.f2136b++;
        }
        this.f1571c0.f2157f = true;
        this.f1605z |= false;
        this.f1604y = true;
        int m2 = this.f1574e.m();
        for (int i3 = 0; i3 < m2; i3++) {
            X I2 = I(this.f1574e.l(i3));
            if (I2 != null && !I2.p()) {
                I2.a(6);
            }
        }
        N();
        O o3 = this.f1568b;
        ArrayList arrayList = o3.f2139c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            X x2 = (X) arrayList.get(i4);
            if (x2 != null) {
                x2.a(6);
                x2.a(1024);
            }
        }
        AbstractC0108A abstractC0108A5 = o3.h.f1583k;
        if (abstractC0108A5 == null || !abstractC0108A5.f2101b) {
            o3.d();
        }
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC0110C interfaceC0110C) {
        if (interfaceC0110C == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z2) {
        if (z2 != this.f1578g) {
            this.f1549G = null;
            this.f1548E = null;
            this.F = null;
            this.f1547D = null;
        }
        this.f1578g = z2;
        super.setClipToPadding(z2);
        if (this.f1596r) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C0111D c0111d) {
        c0111d.getClass();
        this.f1546C = c0111d;
        this.f1549G = null;
        this.f1548E = null;
        this.F = null;
        this.f1547D = null;
    }

    public void setHasFixedSize(boolean z2) {
        this.f1594q = z2;
    }

    public void setItemAnimator(AbstractC0112E abstractC0112E) {
        AbstractC0112E abstractC0112E2 = this.f1550H;
        if (abstractC0112E2 != null) {
            abstractC0112E2.e();
            this.f1550H.f2102a = null;
        }
        this.f1550H = abstractC0112E;
        if (abstractC0112E != null) {
            abstractC0112E.f2102a = this.f1580h0;
        }
    }

    public void setItemViewCacheSize(int i) {
        O o2 = this.f1568b;
        o2.f2141e = i;
        o2.k();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(I i) {
        RecyclerView recyclerView;
        C0134v c0134v;
        if (i == this.f1585l) {
            return;
        }
        setScrollState(0);
        W w2 = this.f1565W;
        w2.f2170g.removeCallbacks(w2);
        w2.f2166c.abortAnimation();
        I i2 = this.f1585l;
        if (i2 != null && (c0134v = i2.f2118e) != null) {
            c0134v.i();
        }
        I i3 = this.f1585l;
        O o2 = this.f1568b;
        if (i3 != null) {
            AbstractC0112E abstractC0112E = this.f1550H;
            if (abstractC0112E != null) {
                abstractC0112E.e();
            }
            this.f1585l.g0(o2);
            this.f1585l.h0(o2);
            o2.f2137a.clear();
            o2.d();
            if (this.f1592p) {
                I i4 = this.f1585l;
                i4.f2120g = false;
                i4.R(this);
            }
            this.f1585l.t0(null);
            this.f1585l = null;
        } else {
            o2.f2137a.clear();
            o2.d();
        }
        r rVar = this.f1574e;
        ((C0115b) rVar.f812c).h();
        ArrayList arrayList = (ArrayList) rVar.f813d;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = ((C0138z) rVar.f811b).f2374a;
            if (size < 0) {
                break;
            }
            X I2 = I((View) arrayList.get(size));
            if (I2 != null) {
                int i5 = I2.f2185p;
                if (recyclerView.L()) {
                    I2.f2186q = i5;
                    recyclerView.f1593p0.add(I2);
                } else {
                    WeakHashMap weakHashMap = K.X.f419a;
                    I2.f2172a.setImportantForAccessibility(i5);
                }
                I2.f2185p = 0;
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = recyclerView.getChildAt(i6);
            I(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f1585l = i;
        if (i != null) {
            if (i.f2115b != null) {
                throw new IllegalArgumentException("LayoutManager " + i + " is already attached to a RecyclerView:" + i.f2115b.y());
            }
            i.t0(this);
            if (this.f1592p) {
                I i7 = this.f1585l;
                i7.f2120g = true;
                i7.Q(this);
            }
        }
        o2.k();
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
        K.r scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f496d) {
            WeakHashMap weakHashMap = K.X.f419a;
            K.L.z(scrollingChildHelper.f495c);
        }
        scrollingChildHelper.f496d = z2;
    }

    public void setOnFlingListener(K k2) {
        this.f1559Q = k2;
    }

    @Deprecated
    public void setOnScrollListener(L l2) {
        this.f1573d0 = l2;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.f1564V = z2;
    }

    public void setRecycledViewPool(N n2) {
        O o2 = this.f1568b;
        if (o2.f2143g != null) {
            r1.f2136b--;
        }
        o2.f2143g = n2;
        if (n2 == null || o2.h.getAdapter() == null) {
            return;
        }
        o2.f2143g.f2136b++;
    }

    public void setRecyclerListener(P p2) {
    }

    public void setScrollState(int i) {
        C0134v c0134v;
        if (i == this.f1551I) {
            return;
        }
        this.f1551I = i;
        if (i != 2) {
            W w2 = this.f1565W;
            w2.f2170g.removeCallbacks(w2);
            w2.f2166c.abortAnimation();
            I i2 = this.f1585l;
            if (i2 != null && (c0134v = i2.f2118e) != null) {
                c0134v.i();
            }
        }
        I i3 = this.f1585l;
        if (i3 != null) {
            i3.f0(i);
        }
        L l2 = this.f1573d0;
        if (l2 != null) {
            l2.a(this, i);
        }
        ArrayList arrayList = this.f1575e0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((L) this.f1575e0.get(size)).a(this, i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.f1558P = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.f1558P = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(V v2) {
        this.f1568b.getClass();
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
        C0134v c0134v;
        if (z2 != this.f1600u) {
            i("Do not suppressLayout in layout or scroll");
            if (!z2) {
                this.f1600u = false;
                if (this.f1599t && this.f1585l != null && this.f1583k != null) {
                    requestLayout();
                }
                this.f1599t = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f1600u = true;
            this.f1601v = true;
            setScrollState(0);
            W w2 = this.f1565W;
            w2.f2170g.removeCallbacks(w2);
            w2.f2166c.abortAnimation();
            I i = this.f1585l;
            if (i == null || (c0134v = i.f2118e) == null) {
                return;
            }
            c0134v.i();
        }
    }

    public final void t(int i, int i2) {
        this.f1545B++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        L l2 = this.f1573d0;
        if (l2 != null) {
            l2.b(this, i, i2);
        }
        ArrayList arrayList = this.f1575e0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((L) this.f1575e0.get(size)).b(this, i, i2);
            }
        }
        this.f1545B--;
    }

    public final void u() {
        if (this.f1549G != null) {
            return;
        }
        this.f1546C.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1549G = edgeEffect;
        if (this.f1578g) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void v() {
        if (this.f1547D != null) {
            return;
        }
        this.f1546C.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1547D = edgeEffect;
        if (this.f1578g) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void w() {
        if (this.F != null) {
            return;
        }
        this.f1546C.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.F = edgeEffect;
        if (this.f1578g) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void x() {
        if (this.f1548E != null) {
            return;
        }
        this.f1546C.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1548E = edgeEffect;
        if (this.f1578g) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String y() {
        return " " + super.toString() + ", adapter:" + this.f1583k + ", layout:" + this.f1585l + ", context:" + getContext();
    }

    public final void z(U u2) {
        if (getScrollState() != 2) {
            u2.getClass();
            return;
        }
        OverScroller overScroller = this.f1565W.f2166c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        u2.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x03cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        TypedArray typedArray;
        TypedArray typedArray2;
        char c2;
        char c3;
        boolean z2;
        int i3;
        Object[] objArr;
        Constructor constructor;
        this.f1566a = new e(this);
        this.f1568b = new O(this);
        this.f1576f = new j(12);
        this.h = new Rect();
        this.i = new Rect();
        this.f1581j = new RectF();
        this.f1587m = new ArrayList();
        this.f1588n = new ArrayList();
        this.f1598s = 0;
        this.f1604y = false;
        this.f1605z = false;
        this.f1544A = 0;
        this.f1545B = 0;
        this.f1546C = new C0111D();
        C0122i c0122i = new C0122i();
        c0122i.f2102a = null;
        c0122i.f2103b = new ArrayList();
        c0122i.f2104c = 120L;
        c0122i.f2105d = 120L;
        c0122i.f2106e = 250L;
        c0122i.f2107f = 250L;
        c0122i.f2266g = true;
        c0122i.h = new ArrayList();
        c0122i.i = new ArrayList();
        c0122i.f2267j = new ArrayList();
        c0122i.f2268k = new ArrayList();
        c0122i.f2269l = new ArrayList();
        c0122i.f2270m = new ArrayList();
        c0122i.f2271n = new ArrayList();
        c0122i.f2272o = new ArrayList();
        c0122i.f2273p = new ArrayList();
        c0122i.f2274q = new ArrayList();
        c0122i.f2275r = new ArrayList();
        this.f1550H = c0122i;
        this.f1551I = 0;
        this.f1552J = -1;
        this.f1562T = Float.MIN_VALUE;
        this.f1563U = Float.MIN_VALUE;
        this.f1564V = true;
        this.f1565W = new W(this);
        this.f1569b0 = new C0126m();
        U u2 = new U();
        u2.f2152a = -1;
        u2.f2153b = 0;
        u2.f2154c = 0;
        u2.f2155d = 1;
        u2.f2156e = 0;
        u2.f2157f = false;
        u2.f2158g = false;
        u2.h = false;
        u2.i = false;
        u2.f2159j = false;
        u2.f2160k = false;
        this.f1571c0 = u2;
        this.f1577f0 = false;
        this.f1579g0 = false;
        C0138z c0138z = new C0138z(this);
        this.f1580h0 = c0138z;
        this.i0 = false;
        this.f1584k0 = new int[2];
        this.m0 = new int[2];
        this.f1589n0 = new int[2];
        this.f1591o0 = new int[2];
        this.f1593p0 = new ArrayList();
        this.f1595q0 = new B(7, this);
        this.f1597r0 = new C0138z(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1558P = viewConfiguration.getScaledTouchSlop();
        this.f1562T = Y.a(viewConfiguration);
        this.f1563U = Y.b(viewConfiguration);
        this.f1560R = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1561S = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f1550H.f2102a = c0138z;
        this.f1572d = new H.e(new C0138z(this));
        this.f1574e = new r(new C0138z(this));
        WeakHashMap weakHashMap = K.X.f419a;
        if (K.N.c(this) == 0) {
            K.N.m(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f1603x = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new Z(this));
        int[] iArr = AbstractC0106a.f2092a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            i2 = 8;
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, i, 0);
            typedArray = obtainStyledAttributes;
        } else {
            i2 = 8;
            typedArray = obtainStyledAttributes;
        }
        String string = typedArray.getString(i2);
        if (typedArray.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f1578g = typedArray.getBoolean(1, true);
        if (typedArray.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArray.getDrawable(6);
            Drawable drawable = typedArray.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArray.getDrawable(4);
            Drawable drawable2 = typedArray.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + y());
            }
            Resources resources = getContext().getResources();
            typedArray2 = typedArray;
            c2 = 3;
            c3 = 2;
            new C0125l(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.luckyarcade.spinthrow.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.luckyarcade.spinthrow.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.luckyarcade.spinthrow.R.dimen.fastscroll_margin));
        } else {
            typedArray2 = typedArray;
            c2 = 3;
            c3 = 2;
        }
        typedArray2.recycle();
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
                    Class<? extends U> asSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(I.class);
                    try {
                        constructor = asSubclass.getConstructor(f1542t0);
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
                                setLayoutManager((I) constructor.newInstance(objArr2));
                                i3 = Build.VERSION.SDK_INT;
                                int[] iArr2 = f1541s0;
                                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
                                if (i3 >= 29) {
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
                    setLayoutManager((I) constructor.newInstance(objArr22));
                    i3 = Build.VERSION.SDK_INT;
                    int[] iArr22 = f1541s0;
                    TypedArray obtainStyledAttributes22 = context.obtainStyledAttributes(attributeSet, iArr22, i, 0);
                    if (i3 >= 29) {
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
        i3 = Build.VERSION.SDK_INT;
        int[] iArr222 = f1541s0;
        TypedArray obtainStyledAttributes222 = context.obtainStyledAttributes(attributeSet, iArr222, i, 0);
        if (i3 >= 29) {
        }
        boolean z322 = obtainStyledAttributes222.getBoolean(0, z2);
        obtainStyledAttributes222.recycle();
        setNestedScrollingEnabled(z322);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        I i = this.f1585l;
        if (i != null) {
            return i.t(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }
}
