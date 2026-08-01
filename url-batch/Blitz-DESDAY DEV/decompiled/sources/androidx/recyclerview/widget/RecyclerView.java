package androidx.recyclerview.widget;

import A1.j;
import I.h;
import L.b;
import L0.e;
import M.C0012m;
import M.C0015p;
import M.H;
import M.S;
import O0.B;
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
import g0.a;
import h0.AbstractC0113A;
import h0.C;
import h0.C0114a;
import h0.C0115b;
import h0.C0122i;
import h0.C0125l;
import h0.C0126m;
import h0.C0134v;
import h0.C0136x;
import h0.C0137y;
import h0.C0138z;
import h0.D;
import h0.E;
import h0.F;
import h0.I;
import h0.J;
import h0.K;
import h0.L;
import h0.M;
import h0.N;
import h0.O;
import h0.P;
import h0.Q;
import h0.RunnableC0128o;
import h0.T;
import h0.U;
import h0.V;
import h0.W;
import h0.X;
import h0.Z;
import h0.i0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.WeakHashMap;
import q.k;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* renamed from: s0, reason: collision with root package name */
    public static final int[] f1616s0 = {R.attr.nestedScrollingEnabled};

    /* renamed from: t0, reason: collision with root package name */
    public static final Class[] f1617t0;

    /* renamed from: u0, reason: collision with root package name */
    public static final d f1618u0;

    /* renamed from: A, reason: collision with root package name */
    public int f1619A;

    /* renamed from: B, reason: collision with root package name */
    public int f1620B;

    /* renamed from: C, reason: collision with root package name */
    public D f1621C;

    /* renamed from: D, reason: collision with root package name */
    public EdgeEffect f1622D;

    /* renamed from: E, reason: collision with root package name */
    public EdgeEffect f1623E;

    /* renamed from: F, reason: collision with root package name */
    public EdgeEffect f1624F;

    /* renamed from: G, reason: collision with root package name */
    public EdgeEffect f1625G;
    public E H;

    /* renamed from: I, reason: collision with root package name */
    public int f1626I;

    /* renamed from: J, reason: collision with root package name */
    public int f1627J;

    /* renamed from: K, reason: collision with root package name */
    public VelocityTracker f1628K;

    /* renamed from: L, reason: collision with root package name */
    public int f1629L;

    /* renamed from: M, reason: collision with root package name */
    public int f1630M;

    /* renamed from: N, reason: collision with root package name */
    public int f1631N;

    /* renamed from: O, reason: collision with root package name */
    public int f1632O;

    /* renamed from: P, reason: collision with root package name */
    public int f1633P;

    /* renamed from: Q, reason: collision with root package name */
    public K f1634Q;

    /* renamed from: R, reason: collision with root package name */
    public final int f1635R;

    /* renamed from: S, reason: collision with root package name */
    public final int f1636S;

    /* renamed from: T, reason: collision with root package name */
    public final float f1637T;

    /* renamed from: U, reason: collision with root package name */
    public final float f1638U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f1639V;

    /* renamed from: W, reason: collision with root package name */
    public final W f1640W;

    /* renamed from: a, reason: collision with root package name */
    public final e f1641a;

    /* renamed from: a0, reason: collision with root package name */
    public RunnableC0128o f1642a0;

    /* renamed from: b, reason: collision with root package name */
    public final O f1643b;

    /* renamed from: b0, reason: collision with root package name */
    public final C0126m f1644b0;

    /* renamed from: c, reason: collision with root package name */
    public Q f1645c;

    /* renamed from: c0, reason: collision with root package name */
    public final U f1646c0;
    public final J.d d;

    /* renamed from: d0, reason: collision with root package name */
    public L f1647d0;

    /* renamed from: e, reason: collision with root package name */
    public final j f1648e;

    /* renamed from: e0, reason: collision with root package name */
    public ArrayList f1649e0;

    /* renamed from: f, reason: collision with root package name */
    public final D.j f1650f;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f1651f0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1652g;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f1653g0;
    public final Rect h;

    /* renamed from: h0, reason: collision with root package name */
    public final C0138z f1654h0;
    public final Rect i;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f1655i0;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f1656j;

    /* renamed from: j0, reason: collision with root package name */
    public Z f1657j0;

    /* renamed from: k, reason: collision with root package name */
    public AbstractC0113A f1658k;

    /* renamed from: k0, reason: collision with root package name */
    public final int[] f1659k0;

    /* renamed from: l, reason: collision with root package name */
    public I f1660l;

    /* renamed from: l0, reason: collision with root package name */
    public C0012m f1661l0;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f1662m;

    /* renamed from: m0, reason: collision with root package name */
    public final int[] f1663m0;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f1664n;

    /* renamed from: n0, reason: collision with root package name */
    public final int[] f1665n0;

    /* renamed from: o, reason: collision with root package name */
    public C0125l f1666o;

    /* renamed from: o0, reason: collision with root package name */
    public final int[] f1667o0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1668p;
    public final ArrayList p0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1669q;

    /* renamed from: q0, reason: collision with root package name */
    public final B f1670q0;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1671r;

    /* renamed from: r0, reason: collision with root package name */
    public final C0138z f1672r0;

    /* renamed from: s, reason: collision with root package name */
    public int f1673s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1674t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1675u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1676v;

    /* renamed from: w, reason: collision with root package name */
    public int f1677w;

    /* renamed from: x, reason: collision with root package name */
    public final AccessibilityManager f1678x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f1679y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1680z;

    static {
        Class cls = Integer.TYPE;
        f1617t0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f1618u0 = new d(1);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.winfour.neondrop.R.attr.recyclerViewStyle);
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
        return ((J) view.getLayoutParams()).f2391a;
    }

    private C0012m getScrollingChildHelper() {
        if (this.f1661l0 == null) {
            this.f1661l0 = new C0012m(this);
        }
        return this.f1661l0;
    }

    public static void j(X x2) {
        WeakReference weakReference = x2.f2431b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == x2.f2430a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            x2.f2431b = null;
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
        ArrayList arrayList = this.f1664n;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0125l c0125l = (C0125l) arrayList.get(i);
            int i2 = c0125l.f2549v;
            if (i2 == 1) {
                boolean d = c0125l.d(motionEvent.getX(), motionEvent.getY());
                boolean c2 = c0125l.c(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0 && (d || c2)) {
                    if (c2) {
                        c0125l.f2550w = 1;
                        c0125l.f2543p = (int) motionEvent.getX();
                    } else if (d) {
                        c0125l.f2550w = 2;
                        c0125l.f2540m = (int) motionEvent.getY();
                    }
                    c0125l.f(2);
                    if (action == 3) {
                        this.f1666o = c0125l;
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
        int h = this.f1648e.h();
        if (h == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < h; i3++) {
            X I2 = I(this.f1648e.g(i3));
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
        if (this.f1679y) {
            return null;
        }
        int o2 = this.f1648e.o();
        for (int i2 = 0; i2 < o2; i2++) {
            X I2 = I(this.f1648e.n(i2));
            if (I2 != null && !I2.i() && F(I2) == i) {
                if (!((ArrayList) this.f1648e.d).contains(I2.f2430a)) {
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
        J.d dVar = this.d;
        int i = x2.f2432c;
        ArrayList arrayList = (ArrayList) dVar.f359c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0114a c0114a = (C0114a) arrayList.get(i2);
            int i3 = c0114a.f2447a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = c0114a.f2448b;
                    if (i4 <= i) {
                        int i5 = c0114a.f2449c;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = c0114a.f2448b;
                    if (i6 == i) {
                        i = c0114a.f2449c;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (c0114a.f2449c <= i) {
                            i++;
                        }
                    }
                }
            } else if (c0114a.f2448b <= i) {
                i += c0114a.f2449c;
            }
        }
        return i;
    }

    public final long G(X x2) {
        return this.f1658k.f2368b ? x2.f2433e : x2.f2432c;
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
        boolean z2 = j2.f2393c;
        Rect rect = j2.f2392b;
        if (!z2) {
            return rect;
        }
        if (this.f1646c0.f2417g && (j2.f2391a.l() || j2.f2391a.g())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.f1662m;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.h;
            rect2.set(0, 0, 0, 0);
            ((F) arrayList.get(i)).getClass();
            ((J) view.getLayoutParams()).f2391a.getClass();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        j2.f2393c = false;
        return rect;
    }

    public final boolean K() {
        return !this.f1671r || this.f1679y || this.d.f();
    }

    public final boolean L() {
        return this.f1619A > 0;
    }

    public final void M(int i) {
        if (this.f1660l == null) {
            return;
        }
        setScrollState(2);
        this.f1660l.n0(i);
        awakenScrollBars();
    }

    public final void N() {
        int o2 = this.f1648e.o();
        for (int i = 0; i < o2; i++) {
            ((J) this.f1648e.n(i).getLayoutParams()).f2393c = true;
        }
        ArrayList arrayList = this.f1643b.f2401c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            J j2 = (J) ((X) arrayList.get(i2)).f2430a.getLayoutParams();
            if (j2 != null) {
                j2.f2393c = true;
            }
        }
    }

    public final void O(int i, int i2, boolean z2) {
        int i3 = i + i2;
        int o2 = this.f1648e.o();
        for (int i4 = 0; i4 < o2; i4++) {
            X I2 = I(this.f1648e.n(i4));
            if (I2 != null && !I2.p()) {
                int i5 = I2.f2432c;
                U u2 = this.f1646c0;
                if (i5 >= i3) {
                    I2.m(-i2, z2);
                    u2.f2416f = true;
                } else if (i5 >= i) {
                    I2.a(8);
                    I2.m(-i2, z2);
                    I2.f2432c = i - 1;
                    u2.f2416f = true;
                }
            }
        }
        O o3 = this.f1643b;
        ArrayList arrayList = o3.f2401c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            X x2 = (X) arrayList.get(size);
            if (x2 != null) {
                int i6 = x2.f2432c;
                if (i6 >= i3) {
                    x2.m(-i2, z2);
                } else if (i6 >= i) {
                    x2.a(8);
                    o3.e(size);
                }
            }
        }
        requestLayout();
    }

    public final void P() {
        this.f1619A++;
    }

    public final void Q(boolean z2) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.f1619A - 1;
        this.f1619A = i2;
        if (i2 < 1) {
            this.f1619A = 0;
            if (z2) {
                int i3 = this.f1677w;
                this.f1677w = 0;
                if (i3 != 0 && (accessibilityManager = this.f1678x) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(obtain);
                }
                ArrayList arrayList = this.p0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    X x2 = (X) arrayList.get(size);
                    if (x2.f2430a.getParent() == this && !x2.p() && (i = x2.f2443q) != -1) {
                        WeakHashMap weakHashMap = M.Q.f513a;
                        x2.f2430a.setImportantForAccessibility(i);
                        x2.f2443q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void R(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1627J) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f1627J = motionEvent.getPointerId(i);
            int x2 = (int) (motionEvent.getX(i) + 0.5f);
            this.f1631N = x2;
            this.f1629L = x2;
            int y2 = (int) (motionEvent.getY(i) + 0.5f);
            this.f1632O = y2;
            this.f1630M = y2;
        }
    }

    public final void S() {
        if (this.f1655i0 || !this.f1668p) {
            return;
        }
        WeakHashMap weakHashMap = M.Q.f513a;
        postOnAnimation(this.f1670q0);
        this.f1655i0 = true;
    }

    public final void T(X x2, C0015p c0015p) {
        x2.f2436j &= -8193;
        boolean z2 = this.f1646c0.h;
        D.j jVar = this.f1650f;
        if (z2 && x2.l() && !x2.i() && !x2.p()) {
            ((q.e) jVar.f134c).d(G(x2), x2);
        }
        k kVar = (k) jVar.f133b;
        i0 i0Var = (i0) kVar.getOrDefault(x2, null);
        if (i0Var == null) {
            i0Var = i0.a();
            kVar.put(x2, i0Var);
        }
        i0Var.f2522b = c0015p;
        i0Var.f2521a |= 4;
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
            if (!j2.f2393c) {
                int i = rect.left;
                Rect rect2 = j2.f2392b;
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
        this.f1660l.k0(this, view, this.h, !this.f1671r, view2 == null);
    }

    public final void V() {
        VelocityTracker velocityTracker = this.f1628K;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z2 = false;
        c0(0);
        EdgeEffect edgeEffect = this.f1622D;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = this.f1622D.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f1623E;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 |= this.f1623E.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1624F;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 |= this.f1624F.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1625G;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z2 |= this.f1625G.isFinished();
        }
        if (z2) {
            WeakHashMap weakHashMap = M.Q.f513a;
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
        AbstractC0113A abstractC0113A = this.f1658k;
        int[] iArr = this.f1667o0;
        if (abstractC0113A != null) {
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
        if (!this.f1662m.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        s(i3, i4, i5, i6, this.f1663m0, 0, iArr);
        int i9 = iArr[0];
        int i10 = i5 - i9;
        int i11 = iArr[1];
        int i12 = i6 - i11;
        boolean z3 = (i9 == 0 && i11 == 0) ? false : true;
        int i13 = this.f1631N;
        int[] iArr2 = this.f1663m0;
        int i14 = iArr2[0];
        this.f1631N = i13 - i14;
        int i15 = this.f1632O;
        int i16 = iArr2[1];
        this.f1632O = i15 - i16;
        int[] iArr3 = this.f1665n0;
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
                    S.d.a(this.f1622D, (-f2) / getWidth(), 1.0f - (y2 / getHeight()));
                } else if (f2 > 0.0f) {
                    w();
                    S.d.a(this.f1624F, f2 / getWidth(), y2 / getHeight());
                } else {
                    z2 = false;
                    if (f3 >= 0.0f) {
                        x();
                        S.d.a(this.f1623E, (-f3) / getHeight(), x2 / getWidth());
                    } else {
                        if (f3 > 0.0f) {
                            u();
                            S.d.a(this.f1625G, f3 / getHeight(), 1.0f - (x2 / getWidth()));
                        }
                        if (!z2 || f2 != 0.0f || f3 != 0.0f) {
                            WeakHashMap weakHashMap = M.Q.f513a;
                            postInvalidateOnAnimation();
                        }
                    }
                    z2 = true;
                    if (!z2) {
                    }
                    WeakHashMap weakHashMap2 = M.Q.f513a;
                    postInvalidateOnAnimation();
                }
                z2 = true;
                if (f3 >= 0.0f) {
                }
                z2 = true;
                if (!z2) {
                }
                WeakHashMap weakHashMap22 = M.Q.f513a;
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
        j jVar = this.f1648e;
        a0();
        P();
        int i3 = h.f335a;
        Trace.beginSection("RV Scroll");
        U u2 = this.f1646c0;
        z(u2);
        O o2 = this.f1643b;
        int m02 = i != 0 ? this.f1660l.m0(i, o2, u2) : 0;
        int o02 = i2 != 0 ? this.f1660l.o0(i2, o2, u2) : 0;
        Trace.endSection();
        int h = jVar.h();
        for (int i4 = 0; i4 < h; i4++) {
            View g2 = jVar.g(i4);
            X H = H(g2);
            if (H != null && (x2 = H.i) != null) {
                int left = g2.getLeft();
                int top = g2.getTop();
                View view = x2.f2430a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        Q(true);
        b0(false);
        if (iArr != null) {
            iArr[0] = m02;
            iArr[1] = o02;
        }
    }

    public final void Y(int i) {
        C0134v c0134v;
        if (this.f1675u) {
            return;
        }
        setScrollState(0);
        W w2 = this.f1640W;
        w2.f2428g.removeCallbacks(w2);
        w2.f2425c.abortAnimation();
        I i2 = this.f1660l;
        if (i2 != null && (c0134v = i2.f2382e) != null) {
            c0134v.i();
        }
        I i3 = this.f1660l;
        if (i3 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            i3.n0(i);
            awakenScrollBars();
        }
    }

    public final void Z(int i, int i2, boolean z2) {
        I i3 = this.f1660l;
        if (i3 == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f1675u) {
            return;
        }
        if (!i3.d()) {
            i = 0;
        }
        if (!this.f1660l.e()) {
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
        this.f1640W.b(i, i2, Integer.MIN_VALUE, null);
    }

    public final void a0() {
        int i = this.f1673s + 1;
        this.f1673s = i;
        if (i != 1 || this.f1675u) {
            return;
        }
        this.f1674t = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        I i3 = this.f1660l;
        if (i3 != null) {
            i3.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    public final void b0(boolean z2) {
        if (this.f1673s < 1) {
            this.f1673s = 1;
        }
        if (!z2 && !this.f1675u) {
            this.f1674t = false;
        }
        if (this.f1673s == 1) {
            if (z2 && this.f1674t && !this.f1675u && this.f1660l != null && this.f1658k != null) {
                o();
            }
            if (!this.f1675u) {
                this.f1674t = false;
            }
        }
        this.f1673s--;
    }

    public final void c0(int i) {
        getScrollingChildHelper().h(i);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof J) && this.f1660l.f((J) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        I i = this.f1660l;
        if (i != null && i.d()) {
            return this.f1660l.j(this.f1646c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        I i = this.f1660l;
        if (i != null && i.d()) {
            return this.f1660l.k(this.f1646c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        I i = this.f1660l;
        if (i != null && i.d()) {
            return this.f1660l.l(this.f1646c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        I i = this.f1660l;
        if (i != null && i.e()) {
            return this.f1660l.m(this.f1646c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        I i = this.f1660l;
        if (i != null && i.e()) {
            return this.f1660l.n(this.f1646c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        I i = this.f1660l;
        if (i != null && i.e()) {
            return this.f1660l.o(this.f1646c0);
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
        ArrayList arrayList = this.f1662m;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i = 0; i < size; i++) {
            ((F) arrayList.get(i)).b(canvas, this);
        }
        EdgeEffect edgeEffect = this.f1622D;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f1652g ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f1622D;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f1623E;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f1652g) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f1623E;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f1624F;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f1652g ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f1624F;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f1625G;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f1652g) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f1625G;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(save4);
        }
        if ((z2 || this.H == null || arrayList.size() <= 0 || !this.H.f()) ? z2 : true) {
            WeakHashMap weakHashMap = M.Q.f513a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    public final void f(X x2) {
        View view = x2.f2430a;
        boolean z2 = view.getParent() == this;
        this.f1643b.j(H(view));
        if (x2.k()) {
            this.f1648e.c(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z2) {
            this.f1648e.a(view, -1, true);
            return;
        }
        j jVar = this.f1648e;
        int indexOfChild = ((C0138z) jVar.f80b).f2611a.indexOfChild(view);
        if (indexOfChild >= 0) {
            ((C0115b) jVar.f81c).i(indexOfChild);
            jVar.r(view);
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
        this.f1660l.getClass();
        boolean z3 = true;
        boolean z4 = (this.f1658k == null || this.f1660l == null || L() || this.f1675u) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        U u2 = this.f1646c0;
        O o2 = this.f1643b;
        if (z4 && (i == 2 || i == 1)) {
            if (this.f1660l.e()) {
                if (focusFinder.findNextFocus(this, view, i == 2 ? 130 : 33) == null) {
                    z2 = true;
                    if (!z2 && this.f1660l.d()) {
                        z2 = focusFinder.findNextFocus(this, view, !((this.f1660l.C() != 1) ^ (i != 2)) ? 66 : 17) != null;
                    }
                    if (z2) {
                        m();
                        if (A(view) == null) {
                            return null;
                        }
                        a0();
                        this.f1660l.S(view, i, o2, u2);
                        b0(false);
                    }
                    view2 = focusFinder.findNextFocus(this, view, i);
                }
            }
            z2 = false;
            if (!z2) {
                if (focusFinder.findNextFocus(this, view, !((this.f1660l.C() != 1) ^ (i != 2)) ? 66 : 17) != null) {
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
                view2 = this.f1660l.S(view, i, o2, u2);
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
                int i3 = this.f1660l.C() == 1 ? -1 : 1;
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

    public final void g(F f2) {
        I i = this.f1660l;
        if (i != null) {
            i.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f1662m;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(f2);
        N();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        I i = this.f1660l;
        if (i != null) {
            return i.r();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        I i = this.f1660l;
        if (i != null) {
            return i.s(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC0113A getAdapter() {
        return this.f1658k;
    }

    @Override // android.view.View
    public int getBaseline() {
        I i = this.f1660l;
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
        return this.f1652g;
    }

    public Z getCompatAccessibilityDelegate() {
        return this.f1657j0;
    }

    public D getEdgeEffectFactory() {
        return this.f1621C;
    }

    public E getItemAnimator() {
        return this.H;
    }

    public int getItemDecorationCount() {
        return this.f1662m.size();
    }

    public I getLayoutManager() {
        return this.f1660l;
    }

    public int getMaxFlingVelocity() {
        return this.f1636S;
    }

    public int getMinFlingVelocity() {
        return this.f1635R;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public K getOnFlingListener() {
        return this.f1634Q;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f1639V;
    }

    public N getRecycledViewPool() {
        return this.f1643b.c();
    }

    public int getScrollState() {
        return this.f1626I;
    }

    public final void h(L l2) {
        if (this.f1649e0 == null) {
            this.f1649e0 = new ArrayList();
        }
        this.f1649e0.add(l2);
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
        if (this.f1620B > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + y()));
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f1668p;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f1675u;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    public final void k() {
        int o2 = this.f1648e.o();
        for (int i = 0; i < o2; i++) {
            X I2 = I(this.f1648e.n(i));
            if (!I2.p()) {
                I2.d = -1;
                I2.f2435g = -1;
            }
        }
        O o3 = this.f1643b;
        ArrayList arrayList = o3.f2401c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            X x2 = (X) arrayList.get(i2);
            x2.d = -1;
            x2.f2435g = -1;
        }
        ArrayList arrayList2 = o3.f2399a;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            X x3 = (X) arrayList2.get(i3);
            x3.d = -1;
            x3.f2435g = -1;
        }
        ArrayList arrayList3 = o3.f2400b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                X x4 = (X) o3.f2400b.get(i4);
                x4.d = -1;
                x4.f2435g = -1;
            }
        }
    }

    public final void l(int i, int i2) {
        boolean z2;
        EdgeEffect edgeEffect = this.f1622D;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z2 = false;
        } else {
            this.f1622D.onRelease();
            z2 = this.f1622D.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f1624F;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f1624F.onRelease();
            z2 |= this.f1624F.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1623E;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f1623E.onRelease();
            z2 |= this.f1623E.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1625G;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f1625G.onRelease();
            z2 |= this.f1625G.isFinished();
        }
        if (z2) {
            WeakHashMap weakHashMap = M.Q.f513a;
            postInvalidateOnAnimation();
        }
    }

    public final void m() {
        J.d dVar = this.d;
        if (!this.f1671r || this.f1679y) {
            int i = h.f335a;
            Trace.beginSection("RV FullInvalidate");
            o();
            Trace.endSection();
            return;
        }
        if (dVar.f()) {
            dVar.getClass();
            if (dVar.f()) {
                int i2 = h.f335a;
                Trace.beginSection("RV FullInvalidate");
                o();
                Trace.endSection();
            }
        }
    }

    public final void n(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = M.Q.f513a;
        setMeasuredDimension(I.g(i, paddingRight, getMinimumWidth()), I.g(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x0323, code lost:
    
        if (((java.util.ArrayList) r19.f1648e.d).contains(getFocusedChild()) == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0382, code lost:
    
        if (r6.hasFocusable() != false) goto L181;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [h0.X] */
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
        C0015p c0015p;
        int i;
        RecyclerView recyclerView;
        boolean g2;
        if (this.f1658k == null) {
            Log.e("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f1660l == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        U u2 = this.f1646c0;
        u2.i = false;
        if (u2.d == 1) {
            p();
            this.f1660l.p0(this);
            q();
        } else {
            J.d dVar = this.d;
            if ((((ArrayList) dVar.d).isEmpty() || ((ArrayList) dVar.f359c).isEmpty()) && this.f1660l.f2389n == getWidth() && this.f1660l.f2390o == getHeight()) {
                this.f1660l.p0(this);
            } else {
                this.f1660l.p0(this);
                q();
            }
        }
        u2.a(4);
        a0();
        P();
        u2.d = 1;
        boolean z3 = u2.f2418j;
        View view2 = null;
        Long l2 = null;
        O o2 = this.f1643b;
        D.j jVar = this.f1650f;
        if (z3) {
            int h = this.f1648e.h() - 1;
            while (h >= 0) {
                X I2 = I(this.f1648e.g(h));
                if (!I2.p()) {
                    long G2 = G(I2);
                    this.H.getClass();
                    C0015p c0015p2 = new C0015p();
                    c0015p2.a(I2);
                    X x2 = (X) ((q.e) jVar.f134c).c(G2, l2);
                    if (x2 == null || x2.p()) {
                        jVar.a(I2, c0015p2);
                    } else {
                        k kVar = (k) jVar.f133b;
                        i0 i0Var = (i0) kVar.getOrDefault(x2, l2);
                        boolean z4 = (i0Var == null || (i0Var.f2521a & 1) == 0) ? false : true;
                        i0 i0Var2 = (i0) kVar.getOrDefault(I2, l2);
                        boolean z5 = (i0Var2 == null || (i0Var2.f2521a & 1) == 0) ? false : true;
                        if (z4 && x2 == I2) {
                            jVar.a(I2, c0015p2);
                        } else {
                            C0015p F2 = jVar.F(x2, 4);
                            jVar.a(I2, c0015p2);
                            C0015p F3 = jVar.F(I2, 8);
                            if (F2 == null) {
                                int h2 = this.f1648e.h();
                                for (int i2 = 0; i2 < h2; i2++) {
                                    X I3 = I(this.f1648e.g(i2));
                                    if (I3 != I2 && G(I3) == G2) {
                                        AbstractC0113A abstractC0113A = this.f1658k;
                                        if (abstractC0113A == null || !abstractC0113A.f2368b) {
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
                                if (this.H.a(x2, I2, F2, F3)) {
                                    S();
                                }
                            }
                        }
                    }
                }
                h--;
                l2 = null;
            }
            k kVar2 = (k) jVar.f133b;
            for (int i3 = kVar2.f3372c - 1; i3 >= 0; i3--) {
                X x3 = (X) kVar2.h(i3);
                i0 i0Var3 = (i0) kVar2.i(i3);
                int i4 = i0Var3.f2521a;
                int i5 = i4 & 3;
                C0138z c0138z = this.f1672r0;
                if (i5 == 3) {
                    RecyclerView recyclerView2 = c0138z.f2611a;
                    recyclerView2.f1660l.i0(x3.f2430a, recyclerView2.f1643b);
                } else if ((i4 & 1) != 0) {
                    C0015p c0015p3 = i0Var3.f2522b;
                    if (c0015p3 == null) {
                        RecyclerView recyclerView3 = c0138z.f2611a;
                        recyclerView3.f1660l.i0(x3.f2430a, recyclerView3.f1643b);
                    } else {
                        c0138z.g(x3, c0015p3, i0Var3.f2523c);
                    }
                } else if ((i4 & 14) == 14) {
                    c0138z.f(x3, i0Var3.f2522b, i0Var3.f2523c);
                } else if ((i4 & 12) == 12) {
                    C0015p c0015p4 = i0Var3.f2522b;
                    C0015p c0015p5 = i0Var3.f2523c;
                    c0138z.getClass();
                    x3.o(false);
                    RecyclerView recyclerView4 = c0138z.f2611a;
                    if (!recyclerView4.f1679y) {
                        C0122i c0122i = (C0122i) recyclerView4.H;
                        c0122i.getClass();
                        int i6 = c0015p4.f582a;
                        int i7 = c0015p5.f582a;
                        if (i6 == i7 && c0015p4.f583b == c0015p5.f583b) {
                            c0122i.c(x3);
                            recyclerView = recyclerView4;
                            g2 = false;
                        } else {
                            recyclerView = recyclerView4;
                            g2 = c0122i.g(x3, i6, c0015p4.f583b, i7, c0015p5.f583b);
                        }
                        if (g2) {
                            recyclerView.S();
                        }
                    } else if (recyclerView4.H.a(x3, x3, c0015p4, c0015p5)) {
                        recyclerView4.S();
                    }
                } else {
                    if ((i4 & 4) != 0) {
                        c0015p = null;
                        c0138z.g(x3, i0Var3.f2522b, null);
                    } else {
                        c0015p = null;
                        if ((i4 & 8) != 0) {
                            c0138z.f(x3, i0Var3.f2522b, i0Var3.f2523c);
                        }
                    }
                    i = 0;
                    i0Var3.f2521a = i;
                    i0Var3.f2522b = c0015p;
                    i0Var3.f2523c = c0015p;
                    i0.d.c(i0Var3);
                }
                i = 0;
                c0015p = null;
                i0Var3.f2521a = i;
                i0Var3.f2522b = c0015p;
                i0Var3.f2523c = c0015p;
                i0.d.c(i0Var3);
            }
            view2 = null;
        }
        this.f1660l.h0(o2);
        u2.f2413b = u2.f2415e;
        this.f1679y = false;
        this.f1680z = false;
        u2.f2418j = false;
        u2.f2419k = false;
        this.f1660l.f2383f = false;
        ArrayList arrayList = o2.f2400b;
        if (arrayList != null) {
            arrayList.clear();
        }
        I i8 = this.f1660l;
        if (i8.f2386k) {
            i8.f2385j = 0;
            i8.f2386k = false;
            o2.k();
        }
        this.f1660l.c0(u2);
        Q(true);
        b0(false);
        ((k) jVar.f133b).clear();
        ((q.e) jVar.f134c).a();
        int[] iArr = this.f1659k0;
        int i9 = iArr[0];
        int i10 = iArr[1];
        C(iArr);
        if ((iArr[0] == i9 && iArr[1] == i10) ? false : true) {
            t(0, 0);
        }
        if (this.f1639V && this.f1658k != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (!isFocused()) {
            }
            long j2 = u2.f2421m;
            if (j2 != -1 && (z2 = this.f1658k.f2368b) && z2) {
                int o3 = this.f1648e.o();
                r10 = view2;
                int i11 = 0;
                while (true) {
                    if (i11 >= o3) {
                        break;
                    }
                    X I4 = I(this.f1648e.n(i11));
                    if (I4 != null && !I4.i() && I4.f2433e == j2) {
                        if (!((ArrayList) this.f1648e.d).contains(I4.f2430a)) {
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
                ArrayList arrayList2 = (ArrayList) this.f1648e.d;
                view = r10.f2430a;
                if (!arrayList2.contains(view)) {
                }
            }
            if (this.f1648e.h() > 0) {
                int i12 = u2.f2420l;
                if (i12 == -1) {
                    i12 = 0;
                }
                int b2 = u2.b();
                for (int i13 = i12; i13 < b2; i13++) {
                    X E2 = E(i13);
                    if (E2 == null) {
                        break;
                    }
                    View view3 = E2.f2430a;
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
                    view = E3.f2430a;
                    if (view.hasFocusable()) {
                        view2 = view;
                        break;
                    }
                }
            }
            if (view2 != null) {
                int i14 = u2.f2422n;
                if (i14 != -1 && (findViewById = view2.findViewById(i14)) != null && findViewById.isFocusable()) {
                    view2 = findViewById;
                }
                view2.requestFocus();
            }
        }
        u2.f2421m = -1L;
        u2.f2420l = -1;
        u2.f2422n = -1;
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
        this.f1619A = 0;
        this.f1668p = true;
        this.f1671r = this.f1671r && !isLayoutRequested();
        I i = this.f1660l;
        if (i != null) {
            i.f2384g = true;
            i.Q(this);
        }
        this.f1655i0 = false;
        ThreadLocal threadLocal = RunnableC0128o.f2561e;
        RunnableC0128o runnableC0128o = (RunnableC0128o) threadLocal.get();
        this.f1642a0 = runnableC0128o;
        if (runnableC0128o == null) {
            RunnableC0128o runnableC0128o2 = new RunnableC0128o();
            runnableC0128o2.f2563a = new ArrayList();
            runnableC0128o2.d = new ArrayList();
            this.f1642a0 = runnableC0128o2;
            WeakHashMap weakHashMap = M.Q.f513a;
            Display display = getDisplay();
            if (!isInEditMode() && display != null) {
                f2 = display.getRefreshRate();
            }
            f2 = 60.0f;
            RunnableC0128o runnableC0128o3 = this.f1642a0;
            runnableC0128o3.f2565c = (long) (1.0E9f / f2);
            threadLocal.set(runnableC0128o3);
        }
        this.f1642a0.f2563a.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C0134v c0134v;
        super.onDetachedFromWindow();
        E e2 = this.H;
        if (e2 != null) {
            e2.e();
        }
        setScrollState(0);
        W w2 = this.f1640W;
        w2.f2428g.removeCallbacks(w2);
        w2.f2425c.abortAnimation();
        I i = this.f1660l;
        if (i != null && (c0134v = i.f2382e) != null) {
            c0134v.i();
        }
        this.f1668p = false;
        I i2 = this.f1660l;
        if (i2 != null) {
            i2.f2384g = false;
            i2.R(this);
        }
        this.p0.clear();
        removeCallbacks(this.f1670q0);
        this.f1650f.getClass();
        while (i0.d.a() != null) {
        }
        RunnableC0128o runnableC0128o = this.f1642a0;
        if (runnableC0128o != null) {
            runnableC0128o.f2563a.remove(this);
            this.f1642a0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f1662m;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((F) arrayList.get(i)).a(this);
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
        if (this.f1660l != null && !this.f1675u && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f2 = this.f1660l.e() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f1660l.d()) {
                    f3 = motionEvent.getAxisValue(10);
                    if (f2 == 0.0f || f3 != 0.0f) {
                        W((int) (f3 * this.f1637T), (int) (f2 * this.f1638U), motionEvent);
                    }
                }
                f3 = 0.0f;
                if (f2 == 0.0f) {
                }
                W((int) (f3 * this.f1637T), (int) (f2 * this.f1638U), motionEvent);
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f1660l.e()) {
                        f2 = -axisValue;
                        f3 = 0.0f;
                        if (f2 == 0.0f) {
                        }
                        W((int) (f3 * this.f1637T), (int) (f2 * this.f1638U), motionEvent);
                    } else if (this.f1660l.d()) {
                        f3 = axisValue;
                        f2 = 0.0f;
                        if (f2 == 0.0f) {
                        }
                        W((int) (f3 * this.f1637T), (int) (f2 * this.f1638U), motionEvent);
                    }
                }
                f2 = 0.0f;
                f3 = 0.0f;
                if (f2 == 0.0f) {
                }
                W((int) (f3 * this.f1637T), (int) (f2 * this.f1638U), motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (this.f1675u) {
            return false;
        }
        this.f1666o = null;
        if (B(motionEvent)) {
            V();
            setScrollState(0);
            return true;
        }
        I i = this.f1660l;
        if (i == null) {
            return false;
        }
        boolean d = i.d();
        boolean e2 = this.f1660l.e();
        if (this.f1628K == null) {
            this.f1628K = VelocityTracker.obtain();
        }
        this.f1628K.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f1676v) {
                this.f1676v = false;
            }
            this.f1627J = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.f1631N = x2;
            this.f1629L = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.f1632O = y2;
            this.f1630M = y2;
            if (this.f1626I == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                c0(1);
            }
            int[] iArr = this.f1665n0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i2 = d;
            if (e2) {
                i2 = (d ? 1 : 0) | 2;
            }
            getScrollingChildHelper().g(i2, 0);
        } else if (actionMasked == 1) {
            this.f1628K.clear();
            c0(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f1627J);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f1627J + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f1626I != 1) {
                int i3 = x3 - this.f1629L;
                int i4 = y3 - this.f1630M;
                if (d == 0 || Math.abs(i3) <= this.f1633P) {
                    z2 = false;
                } else {
                    this.f1631N = x3;
                    z2 = true;
                }
                if (e2 && Math.abs(i4) > this.f1633P) {
                    this.f1632O = y3;
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
            this.f1627J = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f1631N = x4;
            this.f1629L = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f1632O = y4;
            this.f1630M = y4;
        } else if (actionMasked == 6) {
            R(motionEvent);
        }
        return this.f1626I == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int i5 = h.f335a;
        Trace.beginSection("RV OnLayout");
        o();
        Trace.endSection();
        this.f1671r = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        I i3 = this.f1660l;
        if (i3 == null) {
            n(i, i2);
            return;
        }
        boolean L2 = i3.L();
        U u2 = this.f1646c0;
        if (!L2) {
            if (this.f1669q) {
                this.f1660l.f2380b.n(i, i2);
                return;
            }
            if (u2.f2419k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            AbstractC0113A abstractC0113A = this.f1658k;
            if (abstractC0113A != null) {
                u2.f2415e = abstractC0113A.a();
            } else {
                u2.f2415e = 0;
            }
            a0();
            this.f1660l.f2380b.n(i, i2);
            b0(false);
            u2.f2417g = false;
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.f1660l.f2380b.n(i, i2);
        if ((mode == 1073741824 && mode2 == 1073741824) || this.f1658k == null) {
            return;
        }
        if (u2.d == 1) {
            p();
        }
        this.f1660l.q0(i, i2);
        u2.i = true;
        q();
        this.f1660l.s0(i, i2);
        if (this.f1660l.v0()) {
            this.f1660l.q0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            u2.i = true;
            q();
            this.f1660l.s0(i, i2);
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
        this.f1645c = q2;
        super.onRestoreInstanceState(q2.f802a);
        I i = this.f1660l;
        if (i == null || (parcelable2 = this.f1645c.f2405c) == null) {
            return;
        }
        i.d0(parcelable2);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Q q2 = new Q(super.onSaveInstanceState());
        Q q3 = this.f1645c;
        if (q3 != null) {
            q2.f2405c = q3.f2405c;
        } else {
            I i = this.f1660l;
            if (i != null) {
                q2.f2405c = i.e0();
            } else {
                q2.f2405c = null;
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
        this.f1625G = null;
        this.f1623E = null;
        this.f1624F = null;
        this.f1622D = null;
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
        if (this.f1675u || this.f1676v) {
            return false;
        }
        C0125l c0125l = this.f1666o;
        if (c0125l == null) {
            z2 = motionEvent.getAction() == 0 ? false : B(motionEvent);
        } else {
            if (c0125l.f2549v != 0) {
                if (motionEvent.getAction() == 0) {
                    boolean d = c0125l.d(motionEvent.getX(), motionEvent.getY());
                    boolean c2 = c0125l.c(motionEvent.getX(), motionEvent.getY());
                    if (d || c2) {
                        if (c2) {
                            c0125l.f2550w = 1;
                            c0125l.f2543p = (int) motionEvent.getX();
                        } else if (d) {
                            c0125l.f2550w = 2;
                            c0125l.f2540m = (int) motionEvent.getY();
                        }
                        c0125l.f(2);
                    }
                } else if (motionEvent.getAction() == 1 && c0125l.f2549v == 2) {
                    c0125l.f2540m = 0.0f;
                    c0125l.f2543p = 0.0f;
                    c0125l.f(1);
                    c0125l.f2550w = 0;
                } else if (motionEvent.getAction() == 2 && c0125l.f2549v == 2) {
                    c0125l.g();
                    int i3 = c0125l.f2550w;
                    int i4 = c0125l.f2532b;
                    if (i3 == 1) {
                        float x2 = motionEvent.getX();
                        int[] iArr = c0125l.f2552y;
                        iArr[0] = i4;
                        int i5 = c0125l.f2544q - i4;
                        iArr[1] = i5;
                        float max = Math.max(i4, Math.min(i5, x2));
                        if (Math.abs(c0125l.f2542o - max) >= 2.0f) {
                            int e2 = C0125l.e(c0125l.f2543p, max, iArr, c0125l.f2546s.computeHorizontalScrollRange(), c0125l.f2546s.computeHorizontalScrollOffset(), c0125l.f2544q);
                            if (e2 != 0) {
                                c0125l.f2546s.scrollBy(e2, 0);
                            }
                            c0125l.f2543p = max;
                        }
                    }
                    if (c0125l.f2550w == 2) {
                        float y2 = motionEvent.getY();
                        int[] iArr2 = c0125l.f2551x;
                        iArr2[0] = i4;
                        int i6 = c0125l.f2545r - i4;
                        iArr2[1] = i6;
                        float max2 = Math.max(i4, Math.min(i6, y2));
                        if (Math.abs(c0125l.f2539l - max2) >= 2.0f) {
                            int e3 = C0125l.e(c0125l.f2540m, max2, iArr2, c0125l.f2546s.computeVerticalScrollRange(), c0125l.f2546s.computeVerticalScrollOffset(), c0125l.f2545r);
                            if (e3 != 0) {
                                c0125l.f2546s.scrollBy(0, e3);
                            }
                            c0125l.f2540m = max2;
                        }
                    }
                }
            }
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.f1666o = null;
            }
            z2 = true;
        }
        if (z2) {
            V();
            setScrollState(0);
            return true;
        }
        I i7 = this.f1660l;
        if (i7 == null) {
            return false;
        }
        boolean d2 = i7.d();
        boolean e4 = this.f1660l.e();
        if (this.f1628K == null) {
            this.f1628K = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        int[] iArr3 = this.f1665n0;
        if (actionMasked == 0) {
            iArr3[1] = 0;
            iArr3[0] = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(iArr3[0], iArr3[1]);
        if (actionMasked == 0) {
            recyclerView = this;
            motionEvent2 = obtain;
            recyclerView.f1627J = motionEvent.getPointerId(0);
            int x3 = (int) (motionEvent.getX() + 0.5f);
            recyclerView.f1631N = x3;
            recyclerView.f1629L = x3;
            int y3 = (int) (motionEvent.getY() + 0.5f);
            recyclerView.f1632O = y3;
            recyclerView.f1630M = y3;
            int i8 = d2;
            if (e4) {
                i8 = (d2 ? 1 : 0) | 2;
            }
            getScrollingChildHelper().g(i8, 0);
        } else {
            if (actionMasked == 1) {
                this.f1628K.addMovement(obtain);
                VelocityTracker velocityTracker = this.f1628K;
                int i9 = this.f1636S;
                velocityTracker.computeCurrentVelocity(1000, i9);
                float f2 = d2 != 0 ? -this.f1628K.getXVelocity(this.f1627J) : 0.0f;
                float f3 = e4 ? -this.f1628K.getYVelocity(this.f1627J) : 0.0f;
                if (f2 == 0.0f && f3 == 0.0f) {
                    recyclerView2 = this;
                    i2 = 0;
                    motionEvent4 = obtain;
                } else {
                    int i10 = (int) f2;
                    int i11 = (int) f3;
                    I i12 = this.f1660l;
                    if (i12 == null) {
                        Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                    } else if (!this.f1675u) {
                        int d3 = i12.d();
                        boolean e5 = this.f1660l.e();
                        int i13 = this.f1635R;
                        if (d3 == 0 || Math.abs(i10) < i13) {
                            i10 = 0;
                        }
                        if (!e5 || Math.abs(i11) < i13) {
                            i11 = 0;
                        }
                        if (i10 != 0 || i11 != 0) {
                            float f4 = i10;
                            float f5 = i11;
                            if (!dispatchNestedPreFling(f4, f5)) {
                                boolean z5 = d3 != 0 || e5;
                                dispatchNestedFling(f4, f5, z5);
                                K k2 = this.f1634Q;
                                if (k2 != null) {
                                    C0137y c0137y = (C0137y) k2;
                                    I layoutManager = c0137y.f2608a.getLayoutManager();
                                    if (layoutManager != 0 && c0137y.f2608a.getAdapter() != null && ((Math.abs(i11) > (minFlingVelocity = c0137y.f2608a.getMinFlingVelocity()) || Math.abs(i10) > minFlingVelocity) && ((z3 = layoutManager instanceof T)))) {
                                        C0136x c0136x = !z3 ? null : new C0136x(c0137y, c0137y.f2608a.getContext(), 0);
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
                                                            int H = ((z3 && (a2 = ((T) layoutManager).a(layoutManager.B() - 1)) != null && ((a2.x > 0.0f ? 1 : (a2.x == 0.0f ? 0 : -1)) < 0 || (a2.y > 0.0f ? 1 : (a2.y == 0.0f ? 0 : -1)) < 0)) == z6 ? -1 : 1) + I.H(view);
                                                            if (H >= 0 && H < B2) {
                                                                i = H;
                                                            }
                                                        }
                                                        i = -1;
                                                    } else {
                                                        i = I.H(view2);
                                                    }
                                                    if (i != -1) {
                                                        c0136x.f2593a = i;
                                                        layoutManager.y0(c0136x);
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
                                                        int i18 = -i9;
                                                        int max3 = Math.max(i18, Math.min(i10, i9));
                                                        int max4 = Math.max(i18, Math.min(i11, i9));
                                                        W w2 = this.f1640W;
                                                        RecyclerView recyclerView3 = w2.f2428g;
                                                        recyclerView3.setScrollState(2);
                                                        w2.f2424b = 0;
                                                        w2.f2423a = 0;
                                                        Interpolator interpolator = w2.d;
                                                        d dVar = f1618u0;
                                                        if (interpolator != dVar) {
                                                            w2.d = dVar;
                                                            w2.f2425c = new OverScroller(recyclerView3.getContext(), dVar);
                                                        }
                                                        w2.f2425c.fling(0, 0, max3, max4, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
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
                int findPointerIndex = motionEvent.findPointerIndex(this.f1627J);
                if (findPointerIndex < 0) {
                    Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f1627J + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                int x4 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                int y4 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                int i19 = this.f1631N - x4;
                int i20 = this.f1632O - y4;
                if (this.f1626I != 1) {
                    if (d2 != 0) {
                        i19 = i19 > 0 ? Math.max(0, i19 - this.f1633P) : Math.min(0, i19 + this.f1633P);
                        if (i19 != 0) {
                            z4 = true;
                            if (e4) {
                                i20 = i20 > 0 ? Math.max(0, i20 - this.f1633P) : Math.min(0, i20 + this.f1633P);
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
                if (this.f1626I == 1) {
                    int[] iArr4 = this.f1667o0;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    boolean r2 = r(d2 != 0 ? i21 : 0, e4 ? i22 : 0, iArr4, this.f1663m0, 0);
                    int[] iArr5 = this.f1663m0;
                    if (r2) {
                        i21 -= iArr4[0];
                        i22 -= iArr4[1];
                        iArr3[0] = iArr3[0] + iArr5[0];
                        iArr3[1] = iArr3[1] + iArr5[1];
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int i23 = i21;
                    int i24 = i22;
                    this.f1631N = x4 - iArr5[0];
                    this.f1632O = y4 - iArr5[1];
                    if (W(d2 != 0 ? i23 : 0, e4 ? i24 : 0, motionEvent)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    RunnableC0128o runnableC0128o = this.f1642a0;
                    if (runnableC0128o != null && (i23 != 0 || i24 != 0)) {
                        runnableC0128o.a(this, i23, i24);
                    }
                }
            } else if (actionMasked == 3) {
                V();
                setScrollState(0);
            } else if (actionMasked == 5) {
                this.f1627J = motionEvent.getPointerId(actionIndex);
                int x5 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.f1631N = x5;
                this.f1629L = x5;
                int y5 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.f1632O = y5;
                this.f1630M = y5;
            } else if (actionMasked == 6) {
                R(motionEvent);
            }
            recyclerView = this;
            motionEvent2 = obtain;
        }
        motionEvent3 = motionEvent2;
        recyclerView.f1628K.addMovement(motionEvent3);
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
        C0114a h;
        int i5;
        int i6;
        C0114a c0114a;
        U u2 = this.f1646c0;
        u2.a(1);
        z(u2);
        u2.i = false;
        a0();
        D.j jVar = this.f1650f;
        ((k) jVar.f133b).clear();
        q.e eVar = (q.e) jVar.f134c;
        eVar.a();
        P();
        if (this.f1679y) {
            J.d dVar = this.d;
            dVar.j((ArrayList) dVar.f359c);
            dVar.j((ArrayList) dVar.d);
            if (this.f1680z) {
                this.f1660l.X();
            }
        }
        if (this.H == null || !this.f1660l.z0()) {
            this.d.b();
        } else {
            J.d dVar2 = this.d;
            ArrayList arrayList = (ArrayList) dVar2.f359c;
            E.g gVar = (E.g) dVar2.f361f;
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
                    if (((C0114a) arrayList.get(size)).f2447a == 8) {
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
                int i8 = c0114a3.f2447a;
                if (i8 != 1) {
                    C0114a c0114a4 = null;
                    J.d dVar3 = (J.d) gVar.f170b;
                    if (i8 == 2) {
                        int i9 = c0114a2.f2448b;
                        int i10 = c0114a2.f2449c;
                        if (i9 < i10) {
                            if (c0114a3.f2448b == i9 && c0114a3.f2449c == i10 - i9) {
                                z5 = false;
                                z6 = true;
                            } else {
                                z5 = false;
                                z6 = false;
                            }
                        } else if (c0114a3.f2448b == i10 + 1 && c0114a3.f2449c == i9 - i10) {
                            z5 = true;
                            z6 = true;
                        } else {
                            z5 = true;
                            z6 = false;
                        }
                        int i11 = c0114a3.f2448b;
                        if (i10 < i11) {
                            c0114a3.f2448b = i11 - 1;
                        } else {
                            int i12 = c0114a3.f2449c;
                            if (i10 < i11 + i12) {
                                c0114a3.f2449c = i12 - 1;
                                c0114a2.f2447a = 2;
                                c0114a2.f2449c = 1;
                                if (c0114a3.f2449c == 0) {
                                    arrayList.remove(i7);
                                    dVar3.getClass();
                                    ((b) dVar3.f358b).c(c0114a3);
                                }
                            }
                        }
                        int i13 = c0114a2.f2448b;
                        int i14 = c0114a3.f2448b;
                        if (i13 <= i14) {
                            c0114a3.f2448b = i14 + 1;
                        } else {
                            int i15 = i14 + c0114a3.f2449c;
                            if (i13 < i15) {
                                c0114a4 = dVar3.h(2, i13 + 1, i15 - i13);
                                c0114a3.f2449c = c0114a2.f2448b - c0114a3.f2448b;
                            }
                        }
                        C0114a c0114a5 = c0114a4;
                        if (z6) {
                            arrayList.set(size, c0114a3);
                            arrayList.remove(i7);
                            dVar3.getClass();
                            ((b) dVar3.f358b).c(c0114a2);
                        } else {
                            if (z5) {
                                if (c0114a5 != null) {
                                    int i16 = c0114a2.f2448b;
                                    if (i16 > c0114a5.f2448b) {
                                        c0114a2.f2448b = i16 - c0114a5.f2449c;
                                    }
                                    int i17 = c0114a2.f2449c;
                                    if (i17 > c0114a5.f2448b) {
                                        c0114a2.f2449c = i17 - c0114a5.f2449c;
                                    }
                                }
                                int i18 = c0114a2.f2448b;
                                if (i18 > c0114a3.f2448b) {
                                    c0114a2.f2448b = i18 - c0114a3.f2449c;
                                }
                                int i19 = c0114a2.f2449c;
                                if (i19 > c0114a3.f2448b) {
                                    c0114a2.f2449c = i19 - c0114a3.f2449c;
                                }
                            } else {
                                if (c0114a5 != null) {
                                    int i20 = c0114a2.f2448b;
                                    if (i20 >= c0114a5.f2448b) {
                                        c0114a2.f2448b = i20 - c0114a5.f2449c;
                                    }
                                    int i21 = c0114a2.f2449c;
                                    if (i21 >= c0114a5.f2448b) {
                                        c0114a2.f2449c = i21 - c0114a5.f2449c;
                                    }
                                }
                                int i22 = c0114a2.f2448b;
                                if (i22 >= c0114a3.f2448b) {
                                    c0114a2.f2448b = i22 - c0114a3.f2449c;
                                }
                                int i23 = c0114a2.f2449c;
                                if (i23 >= c0114a3.f2448b) {
                                    c0114a2.f2449c = i23 - c0114a3.f2449c;
                                }
                            }
                            arrayList.set(size, c0114a3);
                            if (c0114a2.f2448b != c0114a2.f2449c) {
                                arrayList.set(i7, c0114a2);
                            } else {
                                arrayList.remove(i7);
                            }
                            if (c0114a5 != null) {
                                arrayList.add(size, c0114a5);
                            }
                        }
                    } else if (i8 == 4) {
                        int i24 = c0114a2.f2449c;
                        int i25 = c0114a3.f2448b;
                        if (i24 < i25) {
                            c0114a3.f2448b = i25 - 1;
                        } else {
                            int i26 = c0114a3.f2449c;
                            if (i24 < i25 + i26) {
                                c0114a3.f2449c = i26 - 1;
                                h = dVar3.h(4, c0114a2.f2448b, 1);
                                i5 = c0114a2.f2448b;
                                i6 = c0114a3.f2448b;
                                if (i5 > i6) {
                                    c0114a3.f2448b = i6 + 1;
                                } else {
                                    int i27 = i6 + c0114a3.f2449c;
                                    if (i5 < i27) {
                                        int i28 = i27 - i5;
                                        c0114a4 = dVar3.h(4, i5 + 1, i28);
                                        c0114a3.f2449c -= i28;
                                    }
                                }
                                c0114a = c0114a4;
                                arrayList.set(i7, c0114a2);
                                if (c0114a3.f2449c <= 0) {
                                    arrayList.set(size, c0114a3);
                                } else {
                                    arrayList.remove(size);
                                    dVar3.getClass();
                                    ((b) dVar3.f358b).c(c0114a3);
                                }
                                if (h != null) {
                                    arrayList.add(size, h);
                                }
                                if (c0114a == null) {
                                    arrayList.add(size, c0114a);
                                }
                            }
                        }
                        h = null;
                        i5 = c0114a2.f2448b;
                        i6 = c0114a3.f2448b;
                        if (i5 > i6) {
                        }
                        c0114a = c0114a4;
                        arrayList.set(i7, c0114a2);
                        if (c0114a3.f2449c <= 0) {
                        }
                        if (h != null) {
                        }
                        if (c0114a == null) {
                        }
                    }
                } else {
                    int i29 = c0114a2.f2449c;
                    int i30 = c0114a3.f2448b;
                    int i31 = i29 < i30 ? -1 : 0;
                    int i32 = c0114a2.f2448b;
                    if (i32 < i30) {
                        i31++;
                    }
                    if (i30 <= i32) {
                        c0114a2.f2448b = i32 + c0114a3.f2449c;
                    }
                    int i33 = c0114a3.f2448b;
                    if (i33 <= i29) {
                        c0114a2.f2449c = i29 + c0114a3.f2449c;
                    }
                    c0114a3.f2448b = i33 + i31;
                    arrayList.set(size, c0114a3);
                    arrayList.set(i7, c0114a2);
                }
            }
            int size2 = arrayList.size();
            int i34 = 0;
            while (i34 < size2) {
                C0114a c0114a6 = (C0114a) arrayList.get(i34);
                int i35 = c0114a6.f2447a;
                if (i35 != 1) {
                    b bVar = (b) dVar2.f358b;
                    C0138z c0138z = (C0138z) dVar2.f360e;
                    if (i35 == 2) {
                        i2 = size2;
                        int i36 = c0114a6.f2448b;
                        int i37 = c0114a6.f2449c + i36;
                        int i38 = i36;
                        int i39 = 0;
                        char c3 = 65535;
                        while (i38 < i37) {
                            if (c0138z.b(i38) != null || dVar2.a(i38)) {
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
                        if (i39 != c0114a6.f2449c) {
                            bVar.c(c0114a6);
                            c0114a6 = dVar2.h(2, i36, i39);
                        }
                        if (c3 == 0) {
                            dVar2.c(c0114a6);
                        } else {
                            dVar2.i(c0114a6);
                        }
                    } else if (i35 != 4) {
                        if (i35 == i) {
                            dVar2.i(c0114a6);
                        }
                        i2 = size2;
                    } else {
                        int i40 = c0114a6.f2448b;
                        int i41 = c0114a6.f2449c + i40;
                        int i42 = i40;
                        char c4 = 65535;
                        int i43 = 0;
                        while (i40 < i41) {
                            if (c0138z.b(i40) != null || dVar2.a(i40)) {
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
                        if (i43 != c0114a6.f2449c) {
                            bVar.c(c0114a6);
                            c0114a6 = dVar2.h(4, i42, i43);
                        }
                        if (c4 == 0) {
                            dVar2.c(c0114a6);
                        } else {
                            dVar2.i(c0114a6);
                        }
                    }
                } else {
                    i2 = size2;
                    dVar2.i(c0114a6);
                }
                i34++;
                size2 = i2;
                i = 8;
            }
            arrayList.clear();
        }
        boolean z8 = this.f1651f0 || this.f1653g0;
        boolean z9 = this.f1671r && this.H != null && ((z2 = this.f1679y) || z8 || this.f1660l.f2383f) && (!z2 || this.f1658k.f2368b);
        U u3 = this.f1646c0;
        u3.f2418j = z9;
        u3.f2419k = z9 && z8 && !this.f1679y && this.H != null && this.f1660l.z0();
        View focusedChild = (this.f1639V && hasFocus() && this.f1658k != null) ? getFocusedChild() : null;
        X H = (focusedChild == null || (A2 = A(focusedChild)) == null) ? null : H(A2);
        if (H == null) {
            u2.f2421m = -1L;
            u2.f2420l = -1;
            u2.f2422n = -1;
        } else {
            u2.f2421m = this.f1658k.f2368b ? H.f2433e : -1L;
            if (!this.f1679y) {
                if (H.i()) {
                    F2 = H.d;
                } else {
                    RecyclerView recyclerView = H.f2444r;
                    if (recyclerView != null) {
                        F2 = recyclerView.F(H);
                    }
                }
                u2.f2420l = F2;
                view = H.f2430a;
                int id = view.getId();
                while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                    view = ((ViewGroup) view).getFocusedChild();
                    if (view.getId() == -1) {
                        id = view.getId();
                    }
                }
                u2.f2422n = id;
            }
            F2 = -1;
            u2.f2420l = F2;
            view = H.f2430a;
            int id2 = view.getId();
            while (!view.isFocused()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() == -1) {
                }
            }
            u2.f2422n = id2;
        }
        u2.h = u2.f2418j && this.f1653g0;
        this.f1653g0 = false;
        this.f1651f0 = false;
        u2.f2417g = u2.f2419k;
        u2.f2415e = this.f1658k.a();
        C(this.f1659k0);
        boolean z10 = u2.f2418j;
        k kVar = (k) jVar.f133b;
        if (z10) {
            int h2 = this.f1648e.h();
            for (int i44 = 0; i44 < h2; i44++) {
                X I2 = I(this.f1648e.g(i44));
                if (!I2.p() && (!I2.g() || this.f1658k.f2368b)) {
                    E e2 = this.H;
                    E.b(I2);
                    I2.c();
                    e2.getClass();
                    C0015p c0015p = new C0015p();
                    c0015p.a(I2);
                    i0 i0Var2 = (i0) kVar.getOrDefault(I2, null);
                    if (i0Var2 == null) {
                        i0Var2 = i0.a();
                        kVar.put(I2, i0Var2);
                    }
                    i0Var2.f2522b = c0015p;
                    i0Var2.f2521a |= 4;
                    if (u2.h && I2.l() && !I2.i() && !I2.p() && !I2.g()) {
                        eVar.d(G(I2), I2);
                    }
                }
            }
        }
        if (u2.f2419k) {
            int o2 = this.f1648e.o();
            for (int i45 = 0; i45 < o2; i45++) {
                X I3 = I(this.f1648e.n(i45));
                if (!I3.p() && I3.d == -1) {
                    I3.d = I3.f2432c;
                }
            }
            boolean z11 = u2.f2416f;
            u2.f2416f = false;
            this.f1660l.b0(this.f1643b, u2);
            u2.f2416f = z11;
            for (int i46 = 0; i46 < this.f1648e.h(); i46++) {
                X I4 = I(this.f1648e.g(i46));
                if (!I4.p() && ((i0Var = (i0) kVar.getOrDefault(I4, null)) == null || (i0Var.f2521a & 4) == 0)) {
                    E.b(I4);
                    boolean d = I4.d(8192);
                    E e3 = this.H;
                    I4.c();
                    e3.getClass();
                    C0015p c0015p2 = new C0015p();
                    c0015p2.a(I4);
                    if (d) {
                        T(I4, c0015p2);
                    } else {
                        i0 i0Var3 = (i0) kVar.getOrDefault(I4, null);
                        if (i0Var3 == null) {
                            i0Var3 = i0.a();
                            kVar.put(I4, i0Var3);
                        }
                        i0Var3.f2521a |= 2;
                        i0Var3.f2522b = c0015p2;
                    }
                }
            }
            k();
        } else {
            k();
        }
        Q(true);
        b0(false);
        u2.d = 2;
    }

    public final void q() {
        a0();
        P();
        U u2 = this.f1646c0;
        u2.a(6);
        this.d.b();
        u2.f2415e = this.f1658k.a();
        u2.f2414c = 0;
        u2.f2417g = false;
        this.f1660l.b0(this.f1643b, u2);
        u2.f2416f = false;
        this.f1645c = null;
        u2.f2418j = u2.f2418j && this.H != null;
        u2.d = 4;
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
                I2.f2436j &= -257;
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
        C0134v c0134v = this.f1660l.f2382e;
        if ((c0134v == null || !c0134v.f2596e) && !L() && view2 != null) {
            U(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.f1660l.k0(this, view, rect, z2, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        ArrayList arrayList = this.f1664n;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C0125l) arrayList.get(i)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f1673s != 0 || this.f1675u) {
            this.f1674t = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().d(i, i2, i3, i4, iArr, i5, iArr2);
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        I i3 = this.f1660l;
        if (i3 == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f1675u) {
            return;
        }
        boolean d = i3.d();
        boolean e2 = this.f1660l.e();
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
            this.f1677w |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(Z z2) {
        this.f1657j0 = z2;
        M.Q.l(this, z2);
    }

    public void setAdapter(AbstractC0113A abstractC0113A) {
        setLayoutFrozen(false);
        AbstractC0113A abstractC0113A2 = this.f1658k;
        e eVar = this.f1641a;
        if (abstractC0113A2 != null) {
            abstractC0113A2.f2367a.unregisterObserver(eVar);
            this.f1658k.getClass();
        }
        E e2 = this.H;
        if (e2 != null) {
            e2.e();
        }
        I i = this.f1660l;
        O o2 = this.f1643b;
        if (i != null) {
            i.g0(o2);
            this.f1660l.h0(o2);
        }
        o2.f2399a.clear();
        o2.d();
        J.d dVar = this.d;
        dVar.j((ArrayList) dVar.f359c);
        dVar.j((ArrayList) dVar.d);
        AbstractC0113A abstractC0113A3 = this.f1658k;
        this.f1658k = abstractC0113A;
        if (abstractC0113A != null) {
            abstractC0113A.f2367a.registerObserver(eVar);
        }
        AbstractC0113A abstractC0113A4 = this.f1658k;
        o2.f2399a.clear();
        o2.d();
        N c2 = o2.c();
        if (abstractC0113A3 != null) {
            c2.f2398b--;
        }
        if (c2.f2398b == 0) {
            int i2 = 0;
            while (true) {
                SparseArray sparseArray = c2.f2397a;
                if (i2 >= sparseArray.size()) {
                    break;
                }
                ((M) sparseArray.valueAt(i2)).f2394a.clear();
                i2++;
            }
        }
        if (abstractC0113A4 != null) {
            c2.f2398b++;
        }
        this.f1646c0.f2416f = true;
        this.f1680z |= false;
        this.f1679y = true;
        int o3 = this.f1648e.o();
        for (int i3 = 0; i3 < o3; i3++) {
            X I2 = I(this.f1648e.n(i3));
            if (I2 != null && !I2.p()) {
                I2.a(6);
            }
        }
        N();
        O o4 = this.f1643b;
        ArrayList arrayList = o4.f2401c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            X x2 = (X) arrayList.get(i4);
            if (x2 != null) {
                x2.a(6);
                x2.a(1024);
            }
        }
        AbstractC0113A abstractC0113A5 = o4.h.f1658k;
        if (abstractC0113A5 == null || !abstractC0113A5.f2368b) {
            o4.d();
        }
        requestLayout();
    }

    public void setChildDrawingOrderCallback(C c2) {
        if (c2 == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z2) {
        if (z2 != this.f1652g) {
            this.f1625G = null;
            this.f1623E = null;
            this.f1624F = null;
            this.f1622D = null;
        }
        this.f1652g = z2;
        super.setClipToPadding(z2);
        if (this.f1671r) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(D d) {
        d.getClass();
        this.f1621C = d;
        this.f1625G = null;
        this.f1623E = null;
        this.f1624F = null;
        this.f1622D = null;
    }

    public void setHasFixedSize(boolean z2) {
        this.f1669q = z2;
    }

    public void setItemAnimator(E e2) {
        E e3 = this.H;
        if (e3 != null) {
            e3.e();
            this.H.f2369a = null;
        }
        this.H = e2;
        if (e2 != null) {
            e2.f2369a = this.f1654h0;
        }
    }

    public void setItemViewCacheSize(int i) {
        O o2 = this.f1643b;
        o2.f2402e = i;
        o2.k();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(I i) {
        RecyclerView recyclerView;
        C0134v c0134v;
        if (i == this.f1660l) {
            return;
        }
        setScrollState(0);
        W w2 = this.f1640W;
        w2.f2428g.removeCallbacks(w2);
        w2.f2425c.abortAnimation();
        I i2 = this.f1660l;
        if (i2 != null && (c0134v = i2.f2382e) != null) {
            c0134v.i();
        }
        I i3 = this.f1660l;
        O o2 = this.f1643b;
        if (i3 != null) {
            E e2 = this.H;
            if (e2 != null) {
                e2.e();
            }
            this.f1660l.g0(o2);
            this.f1660l.h0(o2);
            o2.f2399a.clear();
            o2.d();
            if (this.f1668p) {
                I i4 = this.f1660l;
                i4.f2384g = false;
                i4.R(this);
            }
            this.f1660l.t0(null);
            this.f1660l = null;
        } else {
            o2.f2399a.clear();
            o2.d();
        }
        j jVar = this.f1648e;
        ((C0115b) jVar.f81c).h();
        ArrayList arrayList = (ArrayList) jVar.d;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = ((C0138z) jVar.f80b).f2611a;
            if (size < 0) {
                break;
            }
            X I2 = I((View) arrayList.get(size));
            if (I2 != null) {
                int i5 = I2.f2442p;
                if (recyclerView.L()) {
                    I2.f2443q = i5;
                    recyclerView.p0.add(I2);
                } else {
                    WeakHashMap weakHashMap = M.Q.f513a;
                    I2.f2430a.setImportantForAccessibility(i5);
                }
                I2.f2442p = 0;
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
        this.f1660l = i;
        if (i != null) {
            if (i.f2380b != null) {
                throw new IllegalArgumentException("LayoutManager " + i + " is already attached to a RecyclerView:" + i.f2380b.y());
            }
            i.t0(this);
            if (this.f1668p) {
                I i7 = this.f1660l;
                i7.f2384g = true;
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
        C0012m scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.d) {
            WeakHashMap weakHashMap = M.Q.f513a;
            M.F.z(scrollingChildHelper.f571c);
        }
        scrollingChildHelper.d = z2;
    }

    public void setOnFlingListener(K k2) {
        this.f1634Q = k2;
    }

    @Deprecated
    public void setOnScrollListener(L l2) {
        this.f1647d0 = l2;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.f1639V = z2;
    }

    public void setRecycledViewPool(N n2) {
        O o2 = this.f1643b;
        if (o2.f2404g != null) {
            r1.f2398b--;
        }
        o2.f2404g = n2;
        if (n2 == null || o2.h.getAdapter() == null) {
            return;
        }
        o2.f2404g.f2398b++;
    }

    public void setRecyclerListener(P p2) {
    }

    public void setScrollState(int i) {
        C0134v c0134v;
        if (i == this.f1626I) {
            return;
        }
        this.f1626I = i;
        if (i != 2) {
            W w2 = this.f1640W;
            w2.f2428g.removeCallbacks(w2);
            w2.f2425c.abortAnimation();
            I i2 = this.f1660l;
            if (i2 != null && (c0134v = i2.f2382e) != null) {
                c0134v.i();
            }
        }
        I i3 = this.f1660l;
        if (i3 != null) {
            i3.f0(i);
        }
        L l2 = this.f1647d0;
        if (l2 != null) {
            l2.a(this, i);
        }
        ArrayList arrayList = this.f1649e0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((L) this.f1649e0.get(size)).a(this, i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.f1633P = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.f1633P = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(V v2) {
        this.f1643b.getClass();
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
        if (z2 != this.f1675u) {
            i("Do not suppressLayout in layout or scroll");
            if (!z2) {
                this.f1675u = false;
                if (this.f1674t && this.f1660l != null && this.f1658k != null) {
                    requestLayout();
                }
                this.f1674t = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f1675u = true;
            this.f1676v = true;
            setScrollState(0);
            W w2 = this.f1640W;
            w2.f2428g.removeCallbacks(w2);
            w2.f2425c.abortAnimation();
            I i = this.f1660l;
            if (i == null || (c0134v = i.f2382e) == null) {
                return;
            }
            c0134v.i();
        }
    }

    public final void t(int i, int i2) {
        this.f1620B++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        L l2 = this.f1647d0;
        if (l2 != null) {
            l2.b(this, i, i2);
        }
        ArrayList arrayList = this.f1649e0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((L) this.f1649e0.get(size)).b(this, i, i2);
            }
        }
        this.f1620B--;
    }

    public final void u() {
        if (this.f1625G != null) {
            return;
        }
        this.f1621C.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1625G = edgeEffect;
        if (this.f1652g) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void v() {
        if (this.f1622D != null) {
            return;
        }
        this.f1621C.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1622D = edgeEffect;
        if (this.f1652g) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void w() {
        if (this.f1624F != null) {
            return;
        }
        this.f1621C.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1624F = edgeEffect;
        if (this.f1652g) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void x() {
        if (this.f1623E != null) {
            return;
        }
        this.f1621C.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1623E = edgeEffect;
        if (this.f1652g) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String y() {
        return " " + super.toString() + ", adapter:" + this.f1658k + ", layout:" + this.f1660l + ", context:" + getContext();
    }

    public final void z(U u2) {
        if (getScrollState() != 2) {
            u2.getClass();
            return;
        }
        OverScroller overScroller = this.f1640W.f2425c;
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
        this.f1641a = new e(this);
        this.f1643b = new O(this);
        this.f1650f = new D.j(15);
        this.h = new Rect();
        this.i = new Rect();
        this.f1656j = new RectF();
        this.f1662m = new ArrayList();
        this.f1664n = new ArrayList();
        this.f1673s = 0;
        this.f1679y = false;
        this.f1680z = false;
        this.f1619A = 0;
        this.f1620B = 0;
        this.f1621C = new D();
        C0122i c0122i = new C0122i();
        c0122i.f2369a = null;
        c0122i.f2370b = new ArrayList();
        c0122i.f2371c = 120L;
        c0122i.d = 120L;
        c0122i.f2372e = 250L;
        c0122i.f2373f = 250L;
        c0122i.f2511g = true;
        c0122i.h = new ArrayList();
        c0122i.i = new ArrayList();
        c0122i.f2512j = new ArrayList();
        c0122i.f2513k = new ArrayList();
        c0122i.f2514l = new ArrayList();
        c0122i.f2515m = new ArrayList();
        c0122i.f2516n = new ArrayList();
        c0122i.f2517o = new ArrayList();
        c0122i.f2518p = new ArrayList();
        c0122i.f2519q = new ArrayList();
        c0122i.f2520r = new ArrayList();
        this.H = c0122i;
        this.f1626I = 0;
        this.f1627J = -1;
        this.f1637T = Float.MIN_VALUE;
        this.f1638U = Float.MIN_VALUE;
        this.f1639V = true;
        this.f1640W = new W(this);
        this.f1644b0 = new C0126m();
        U u2 = new U();
        u2.f2412a = -1;
        u2.f2413b = 0;
        u2.f2414c = 0;
        u2.d = 1;
        u2.f2415e = 0;
        u2.f2416f = false;
        u2.f2417g = false;
        u2.h = false;
        u2.i = false;
        u2.f2418j = false;
        u2.f2419k = false;
        this.f1646c0 = u2;
        this.f1651f0 = false;
        this.f1653g0 = false;
        C0138z c0138z = new C0138z(this);
        this.f1654h0 = c0138z;
        this.f1655i0 = false;
        this.f1659k0 = new int[2];
        this.f1663m0 = new int[2];
        this.f1665n0 = new int[2];
        this.f1667o0 = new int[2];
        this.p0 = new ArrayList();
        this.f1670q0 = new B(7, this);
        this.f1672r0 = new C0138z(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1633P = viewConfiguration.getScaledTouchSlop();
        this.f1637T = S.a(viewConfiguration);
        this.f1638U = S.b(viewConfiguration);
        this.f1635R = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1636S = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.H.f2369a = c0138z;
        this.d = new J.d(new C0138z(this));
        this.f1648e = new j(new C0138z(this));
        WeakHashMap weakHashMap = M.Q.f513a;
        if (H.c(this) == 0) {
            H.m(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f1678x = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new Z(this));
        int[] iArr = a.f2358a;
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
        this.f1652g = typedArray.getBoolean(1, true);
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
            new C0125l(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.winfour.neondrop.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.winfour.neondrop.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.winfour.neondrop.R.dimen.fastscroll_margin));
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
                        constructor = asSubclass.getConstructor(f1617t0);
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
                                int[] iArr2 = f1616s0;
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
                    int[] iArr22 = f1616s0;
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
        int[] iArr222 = f1616s0;
        TypedArray obtainStyledAttributes222 = context.obtainStyledAttributes(attributeSet, iArr222, i, 0);
        if (i3 >= 29) {
        }
        boolean z322 = obtainStyledAttributes222.getBoolean(0, z2);
        obtainStyledAttributes222.recycle();
        setNestedScrollingEnabled(z322);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        I i = this.f1660l;
        if (i != null) {
            return i.t(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }
}
