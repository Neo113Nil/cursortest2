package androidx.recyclerview.widget;

import B.j;
import G.h;
import J.b;
import K.C0011l;
import K.C0013n;
import K.C0016q;
import K.G;
import K.S;
import M0.e;
import P0.A;
import S.d;
import T.g;
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
import e0.AbstractC0085a;
import f0.AbstractC0086A;
import f0.C;
import f0.C0087a;
import f0.C0088b;
import f0.C0095i;
import f0.C0098l;
import f0.C0099m;
import f0.C0107v;
import f0.C0109x;
import f0.C0110y;
import f0.C0111z;
import f0.D;
import f0.E;
import f0.F;
import f0.I;
import f0.J;
import f0.K;
import f0.L;
import f0.M;
import f0.N;
import f0.O;
import f0.P;
import f0.Q;
import f0.RunnableC0101o;
import f0.T;
import f0.U;
import f0.V;
import f0.W;
import f0.X;
import f0.Z;
import f0.h0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o.k;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* renamed from: s0, reason: collision with root package name */
    public static final int[] f1486s0 = {R.attr.nestedScrollingEnabled};

    /* renamed from: t0, reason: collision with root package name */
    public static final Class[] f1487t0;

    /* renamed from: u0, reason: collision with root package name */
    public static final d f1488u0;

    /* renamed from: A, reason: collision with root package name */
    public int f1489A;

    /* renamed from: B, reason: collision with root package name */
    public int f1490B;

    /* renamed from: C, reason: collision with root package name */
    public D f1491C;

    /* renamed from: D, reason: collision with root package name */
    public EdgeEffect f1492D;

    /* renamed from: E, reason: collision with root package name */
    public EdgeEffect f1493E;
    public EdgeEffect F;

    /* renamed from: G, reason: collision with root package name */
    public EdgeEffect f1494G;

    /* renamed from: H, reason: collision with root package name */
    public E f1495H;

    /* renamed from: I, reason: collision with root package name */
    public int f1496I;

    /* renamed from: J, reason: collision with root package name */
    public int f1497J;

    /* renamed from: K, reason: collision with root package name */
    public VelocityTracker f1498K;

    /* renamed from: L, reason: collision with root package name */
    public int f1499L;

    /* renamed from: M, reason: collision with root package name */
    public int f1500M;

    /* renamed from: N, reason: collision with root package name */
    public int f1501N;

    /* renamed from: O, reason: collision with root package name */
    public int f1502O;

    /* renamed from: P, reason: collision with root package name */
    public int f1503P;

    /* renamed from: Q, reason: collision with root package name */
    public K f1504Q;

    /* renamed from: R, reason: collision with root package name */
    public final int f1505R;

    /* renamed from: S, reason: collision with root package name */
    public final int f1506S;

    /* renamed from: T, reason: collision with root package name */
    public final float f1507T;

    /* renamed from: U, reason: collision with root package name */
    public final float f1508U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f1509V;

    /* renamed from: W, reason: collision with root package name */
    public final W f1510W;

    /* renamed from: a, reason: collision with root package name */
    public final e f1511a;

    /* renamed from: a0, reason: collision with root package name */
    public RunnableC0101o f1512a0;

    /* renamed from: b, reason: collision with root package name */
    public final O f1513b;

    /* renamed from: b0, reason: collision with root package name */
    public final C0099m f1514b0;

    /* renamed from: c, reason: collision with root package name */
    public Q f1515c;

    /* renamed from: c0, reason: collision with root package name */
    public final U f1516c0;
    public final H.e d;

    /* renamed from: d0, reason: collision with root package name */
    public L f1517d0;

    /* renamed from: e, reason: collision with root package name */
    public final C0011l f1518e;

    /* renamed from: e0, reason: collision with root package name */
    public ArrayList f1519e0;

    /* renamed from: f, reason: collision with root package name */
    public final j f1520f;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f1521f0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1522g;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f1523g0;
    public final Rect h;

    /* renamed from: h0, reason: collision with root package name */
    public final C0111z f1524h0;
    public final Rect i;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f1525i0;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f1526j;
    public Z j0;

    /* renamed from: k, reason: collision with root package name */
    public AbstractC0086A f1527k;

    /* renamed from: k0, reason: collision with root package name */
    public final int[] f1528k0;

    /* renamed from: l, reason: collision with root package name */
    public I f1529l;

    /* renamed from: l0, reason: collision with root package name */
    public C0013n f1530l0;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f1531m;

    /* renamed from: m0, reason: collision with root package name */
    public final int[] f1532m0;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f1533n;
    public final int[] n0;

    /* renamed from: o, reason: collision with root package name */
    public C0098l f1534o;

    /* renamed from: o0, reason: collision with root package name */
    public final int[] f1535o0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1536p;

    /* renamed from: p0, reason: collision with root package name */
    public final ArrayList f1537p0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1538q;

    /* renamed from: q0, reason: collision with root package name */
    public final A f1539q0;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1540r;

    /* renamed from: r0, reason: collision with root package name */
    public final C0111z f1541r0;

    /* renamed from: s, reason: collision with root package name */
    public int f1542s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1543t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1544u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1545v;

    /* renamed from: w, reason: collision with root package name */
    public int f1546w;

    /* renamed from: x, reason: collision with root package name */
    public final AccessibilityManager f1547x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f1548y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1549z;

    static {
        Class cls = Integer.TYPE;
        f1487t0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f1488u0 = new d(1);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.glasspulse.glasspulse.R.attr.recyclerViewStyle);
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
        return ((J) view.getLayoutParams()).f2079a;
    }

    private C0013n getScrollingChildHelper() {
        if (this.f1530l0 == null) {
            this.f1530l0 = new C0013n(this);
        }
        return this.f1530l0;
    }

    public static void j(X x2) {
        WeakReference weakReference = x2.f2119b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == x2.f2118a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            x2.f2119b = null;
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
        ArrayList arrayList = this.f1533n;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0098l c0098l = (C0098l) arrayList.get(i);
            int i2 = c0098l.f2233v;
            if (i2 == 1) {
                boolean d = c0098l.d(motionEvent.getX(), motionEvent.getY());
                boolean c2 = c0098l.c(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0 && (d || c2)) {
                    if (c2) {
                        c0098l.f2234w = 1;
                        c0098l.f2227p = (int) motionEvent.getX();
                    } else if (d) {
                        c0098l.f2234w = 2;
                        c0098l.f2224m = (int) motionEvent.getY();
                    }
                    c0098l.f(2);
                    if (action == 3) {
                        this.f1534o = c0098l;
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
        int f2 = this.f1518e.f();
        if (f2 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < f2; i3++) {
            X I2 = I(this.f1518e.e(i3));
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
        if (this.f1548y) {
            return null;
        }
        int m2 = this.f1518e.m();
        for (int i2 = 0; i2 < m2; i2++) {
            X I2 = I(this.f1518e.l(i2));
            if (I2 != null && !I2.i() && F(I2) == i) {
                if (!((ArrayList) this.f1518e.d).contains(I2.f2118a)) {
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
        H.e eVar = this.d;
        int i = x2.f2120c;
        ArrayList arrayList = (ArrayList) eVar.f275c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0087a c0087a = (C0087a) arrayList.get(i2);
            int i3 = c0087a.f2135a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = c0087a.f2136b;
                    if (i4 <= i) {
                        int i5 = c0087a.f2137c;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = c0087a.f2136b;
                    if (i6 == i) {
                        i = c0087a.f2137c;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (c0087a.f2137c <= i) {
                            i++;
                        }
                    }
                }
            } else if (c0087a.f2136b <= i) {
                i += c0087a.f2137c;
            }
        }
        return i;
    }

    public final long G(X x2) {
        return this.f1527k.f2056b ? x2.f2121e : x2.f2120c;
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
        boolean z2 = j2.f2081c;
        Rect rect = j2.f2080b;
        if (!z2) {
            return rect;
        }
        if (this.f1516c0.f2105g && (j2.f2079a.l() || j2.f2079a.g())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.f1531m;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.h;
            rect2.set(0, 0, 0, 0);
            ((F) arrayList.get(i)).getClass();
            ((J) view.getLayoutParams()).f2079a.getClass();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        j2.f2081c = false;
        return rect;
    }

    public final boolean K() {
        return !this.f1540r || this.f1548y || this.d.f();
    }

    public final boolean L() {
        return this.f1489A > 0;
    }

    public final void M(int i) {
        if (this.f1529l == null) {
            return;
        }
        setScrollState(2);
        this.f1529l.n0(i);
        awakenScrollBars();
    }

    public final void N() {
        int m2 = this.f1518e.m();
        for (int i = 0; i < m2; i++) {
            ((J) this.f1518e.l(i).getLayoutParams()).f2081c = true;
        }
        ArrayList arrayList = this.f1513b.f2089c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            J j2 = (J) ((X) arrayList.get(i2)).f2118a.getLayoutParams();
            if (j2 != null) {
                j2.f2081c = true;
            }
        }
    }

    public final void O(int i, int i2, boolean z2) {
        int i3 = i + i2;
        int m2 = this.f1518e.m();
        for (int i4 = 0; i4 < m2; i4++) {
            X I2 = I(this.f1518e.l(i4));
            if (I2 != null && !I2.p()) {
                int i5 = I2.f2120c;
                U u2 = this.f1516c0;
                if (i5 >= i3) {
                    I2.m(-i2, z2);
                    u2.f2104f = true;
                } else if (i5 >= i) {
                    I2.a(8);
                    I2.m(-i2, z2);
                    I2.f2120c = i - 1;
                    u2.f2104f = true;
                }
            }
        }
        O o2 = this.f1513b;
        ArrayList arrayList = o2.f2089c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            X x2 = (X) arrayList.get(size);
            if (x2 != null) {
                int i6 = x2.f2120c;
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
        this.f1489A++;
    }

    public final void Q(boolean z2) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.f1489A - 1;
        this.f1489A = i2;
        if (i2 < 1) {
            this.f1489A = 0;
            if (z2) {
                int i3 = this.f1546w;
                this.f1546w = 0;
                if (i3 != 0 && (accessibilityManager = this.f1547x) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(obtain);
                }
                ArrayList arrayList = this.f1537p0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    X x2 = (X) arrayList.get(size);
                    if (x2.f2118a.getParent() == this && !x2.p() && (i = x2.f2131q) != -1) {
                        WeakHashMap weakHashMap = S.f351a;
                        x2.f2118a.setImportantForAccessibility(i);
                        x2.f2131q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void R(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1497J) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f1497J = motionEvent.getPointerId(i);
            int x2 = (int) (motionEvent.getX(i) + 0.5f);
            this.f1501N = x2;
            this.f1499L = x2;
            int y2 = (int) (motionEvent.getY(i) + 0.5f);
            this.f1502O = y2;
            this.f1500M = y2;
        }
    }

    public final void S() {
        if (this.f1525i0 || !this.f1536p) {
            return;
        }
        WeakHashMap weakHashMap = S.f351a;
        postOnAnimation(this.f1539q0);
        this.f1525i0 = true;
    }

    public final void T(X x2, C0016q c0016q) {
        x2.f2124j &= -8193;
        boolean z2 = this.f1516c0.h;
        j jVar = this.f1520f;
        if (z2 && x2.l() && !x2.i() && !x2.p()) {
            ((o.e) jVar.f54c).d(G(x2), x2);
        }
        k kVar = (k) jVar.f53b;
        h0 h0Var = (h0) kVar.getOrDefault(x2, null);
        if (h0Var == null) {
            h0Var = h0.a();
            kVar.put(x2, h0Var);
        }
        h0Var.f2195b = c0016q;
        h0Var.f2194a |= 4;
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
            if (!j2.f2081c) {
                int i = rect.left;
                Rect rect2 = j2.f2080b;
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
        this.f1529l.k0(this, view, this.h, !this.f1540r, view2 == null);
    }

    public final void V() {
        VelocityTracker velocityTracker = this.f1498K;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z2 = false;
        c0(0);
        EdgeEffect edgeEffect = this.f1492D;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = this.f1492D.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f1493E;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 |= this.f1493E.isFinished();
        }
        EdgeEffect edgeEffect3 = this.F;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 |= this.F.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1494G;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z2 |= this.f1494G.isFinished();
        }
        if (z2) {
            WeakHashMap weakHashMap = S.f351a;
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
        AbstractC0086A abstractC0086A = this.f1527k;
        int[] iArr = this.f1535o0;
        if (abstractC0086A != null) {
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
        if (!this.f1531m.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        s(i3, i4, i5, i6, this.f1532m0, 0, iArr);
        int i9 = iArr[0];
        int i10 = i5 - i9;
        int i11 = iArr[1];
        int i12 = i6 - i11;
        boolean z3 = (i9 == 0 && i11 == 0) ? false : true;
        int i13 = this.f1501N;
        int[] iArr2 = this.f1532m0;
        int i14 = iArr2[0];
        this.f1501N = i13 - i14;
        int i15 = this.f1502O;
        int i16 = iArr2[1];
        this.f1502O = i15 - i16;
        int[] iArr3 = this.n0;
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
                    Q.d.a(this.f1492D, (-f2) / getWidth(), 1.0f - (y2 / getHeight()));
                } else if (f2 > 0.0f) {
                    w();
                    Q.d.a(this.F, f2 / getWidth(), y2 / getHeight());
                } else {
                    z2 = false;
                    if (f3 >= 0.0f) {
                        x();
                        Q.d.a(this.f1493E, (-f3) / getHeight(), x2 / getWidth());
                    } else {
                        if (f3 > 0.0f) {
                            u();
                            Q.d.a(this.f1494G, f3 / getHeight(), 1.0f - (x2 / getWidth()));
                        }
                        if (!z2 || f2 != 0.0f || f3 != 0.0f) {
                            WeakHashMap weakHashMap = S.f351a;
                            postInvalidateOnAnimation();
                        }
                    }
                    z2 = true;
                    if (!z2) {
                    }
                    WeakHashMap weakHashMap2 = S.f351a;
                    postInvalidateOnAnimation();
                }
                z2 = true;
                if (f3 >= 0.0f) {
                }
                z2 = true;
                if (!z2) {
                }
                WeakHashMap weakHashMap22 = S.f351a;
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
        C0011l c0011l = this.f1518e;
        a0();
        P();
        int i3 = h.f178a;
        Trace.beginSection("RV Scroll");
        U u2 = this.f1516c0;
        z(u2);
        O o2 = this.f1513b;
        int m02 = i != 0 ? this.f1529l.m0(i, o2, u2) : 0;
        int o02 = i2 != 0 ? this.f1529l.o0(i2, o2, u2) : 0;
        Trace.endSection();
        int f2 = c0011l.f();
        for (int i4 = 0; i4 < f2; i4++) {
            View e2 = c0011l.e(i4);
            X H2 = H(e2);
            if (H2 != null && (x2 = H2.i) != null) {
                int left = e2.getLeft();
                int top = e2.getTop();
                View view = x2.f2118a;
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
        C0107v c0107v;
        if (this.f1544u) {
            return;
        }
        setScrollState(0);
        W w2 = this.f1510W;
        w2.f2116g.removeCallbacks(w2);
        w2.f2113c.abortAnimation();
        I i2 = this.f1529l;
        if (i2 != null && (c0107v = i2.f2070e) != null) {
            c0107v.i();
        }
        I i3 = this.f1529l;
        if (i3 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            i3.n0(i);
            awakenScrollBars();
        }
    }

    public final void Z(int i, int i2, boolean z2) {
        I i3 = this.f1529l;
        if (i3 == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f1544u) {
            return;
        }
        if (!i3.d()) {
            i = 0;
        }
        if (!this.f1529l.e()) {
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
        this.f1510W.b(i, i2, Integer.MIN_VALUE, null);
    }

    public final void a0() {
        int i = this.f1542s + 1;
        this.f1542s = i;
        if (i != 1 || this.f1544u) {
            return;
        }
        this.f1543t = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        I i3 = this.f1529l;
        if (i3 != null) {
            i3.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    public final void b0(boolean z2) {
        if (this.f1542s < 1) {
            this.f1542s = 1;
        }
        if (!z2 && !this.f1544u) {
            this.f1543t = false;
        }
        if (this.f1542s == 1) {
            if (z2 && this.f1543t && !this.f1544u && this.f1529l != null && this.f1527k != null) {
                o();
            }
            if (!this.f1544u) {
                this.f1543t = false;
            }
        }
        this.f1542s--;
    }

    public final void c0(int i) {
        getScrollingChildHelper().h(i);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof J) && this.f1529l.f((J) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        I i = this.f1529l;
        if (i != null && i.d()) {
            return this.f1529l.j(this.f1516c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        I i = this.f1529l;
        if (i != null && i.d()) {
            return this.f1529l.k(this.f1516c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        I i = this.f1529l;
        if (i != null && i.d()) {
            return this.f1529l.l(this.f1516c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        I i = this.f1529l;
        if (i != null && i.e()) {
            return this.f1529l.m(this.f1516c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        I i = this.f1529l;
        if (i != null && i.e()) {
            return this.f1529l.n(this.f1516c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        I i = this.f1529l;
        if (i != null && i.e()) {
            return this.f1529l.o(this.f1516c0);
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
        ArrayList arrayList = this.f1531m;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i = 0; i < size; i++) {
            ((F) arrayList.get(i)).b(canvas, this);
        }
        EdgeEffect edgeEffect = this.f1492D;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f1522g ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f1492D;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f1493E;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f1522g) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f1493E;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.F;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f1522g ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.F;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f1494G;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f1522g) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f1494G;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(save4);
        }
        if ((z2 || this.f1495H == null || arrayList.size() <= 0 || !this.f1495H.f()) ? z2 : true) {
            WeakHashMap weakHashMap = S.f351a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    public final void f(X x2) {
        View view = x2.f2118a;
        boolean z2 = view.getParent() == this;
        this.f1513b.j(H(view));
        if (x2.k()) {
            this.f1518e.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z2) {
            this.f1518e.a(view, -1, true);
            return;
        }
        C0011l c0011l = this.f1518e;
        int indexOfChild = ((C0111z) c0011l.f404b).f2295a.indexOfChild(view);
        if (indexOfChild >= 0) {
            ((C0088b) c0011l.f405c).i(indexOfChild);
            c0011l.p(view);
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
        this.f1529l.getClass();
        boolean z3 = true;
        boolean z4 = (this.f1527k == null || this.f1529l == null || L() || this.f1544u) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        U u2 = this.f1516c0;
        O o2 = this.f1513b;
        if (z4 && (i == 2 || i == 1)) {
            if (this.f1529l.e()) {
                if (focusFinder.findNextFocus(this, view, i == 2 ? 130 : 33) == null) {
                    z2 = true;
                    if (!z2 && this.f1529l.d()) {
                        z2 = focusFinder.findNextFocus(this, view, !((this.f1529l.C() != 1) ^ (i != 2)) ? 66 : 17) != null;
                    }
                    if (z2) {
                        m();
                        if (A(view) == null) {
                            return null;
                        }
                        a0();
                        this.f1529l.S(view, i, o2, u2);
                        b0(false);
                    }
                    view2 = focusFinder.findNextFocus(this, view, i);
                }
            }
            z2 = false;
            if (!z2) {
                if (focusFinder.findNextFocus(this, view, !((this.f1529l.C() != 1) ^ (i != 2)) ? 66 : 17) != null) {
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
                view2 = this.f1529l.S(view, i, o2, u2);
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
                int i3 = this.f1529l.C() == 1 ? -1 : 1;
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
        I i = this.f1529l;
        if (i != null) {
            i.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f1531m;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(f2);
        N();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        I i = this.f1529l;
        if (i != null) {
            return i.r();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        I i = this.f1529l;
        if (i != null) {
            return i.s(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC0086A getAdapter() {
        return this.f1527k;
    }

    @Override // android.view.View
    public int getBaseline() {
        I i = this.f1529l;
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
        return this.f1522g;
    }

    public Z getCompatAccessibilityDelegate() {
        return this.j0;
    }

    public D getEdgeEffectFactory() {
        return this.f1491C;
    }

    public E getItemAnimator() {
        return this.f1495H;
    }

    public int getItemDecorationCount() {
        return this.f1531m.size();
    }

    public I getLayoutManager() {
        return this.f1529l;
    }

    public int getMaxFlingVelocity() {
        return this.f1506S;
    }

    public int getMinFlingVelocity() {
        return this.f1505R;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public K getOnFlingListener() {
        return this.f1504Q;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f1509V;
    }

    public N getRecycledViewPool() {
        return this.f1513b.c();
    }

    public int getScrollState() {
        return this.f1496I;
    }

    public final void h(L l2) {
        if (this.f1519e0 == null) {
            this.f1519e0 = new ArrayList();
        }
        this.f1519e0.add(l2);
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
        if (this.f1490B > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + y()));
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f1536p;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f1544u;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    public final void k() {
        int m2 = this.f1518e.m();
        for (int i = 0; i < m2; i++) {
            X I2 = I(this.f1518e.l(i));
            if (!I2.p()) {
                I2.d = -1;
                I2.f2123g = -1;
            }
        }
        O o2 = this.f1513b;
        ArrayList arrayList = o2.f2089c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            X x2 = (X) arrayList.get(i2);
            x2.d = -1;
            x2.f2123g = -1;
        }
        ArrayList arrayList2 = o2.f2087a;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            X x3 = (X) arrayList2.get(i3);
            x3.d = -1;
            x3.f2123g = -1;
        }
        ArrayList arrayList3 = o2.f2088b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                X x4 = (X) o2.f2088b.get(i4);
                x4.d = -1;
                x4.f2123g = -1;
            }
        }
    }

    public final void l(int i, int i2) {
        boolean z2;
        EdgeEffect edgeEffect = this.f1492D;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z2 = false;
        } else {
            this.f1492D.onRelease();
            z2 = this.f1492D.isFinished();
        }
        EdgeEffect edgeEffect2 = this.F;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.F.onRelease();
            z2 |= this.F.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1493E;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f1493E.onRelease();
            z2 |= this.f1493E.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1494G;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f1494G.onRelease();
            z2 |= this.f1494G.isFinished();
        }
        if (z2) {
            WeakHashMap weakHashMap = S.f351a;
            postInvalidateOnAnimation();
        }
    }

    public final void m() {
        H.e eVar = this.d;
        if (!this.f1540r || this.f1548y) {
            int i = h.f178a;
            Trace.beginSection("RV FullInvalidate");
            o();
            Trace.endSection();
            return;
        }
        if (eVar.f()) {
            eVar.getClass();
            if (eVar.f()) {
                int i2 = h.f178a;
                Trace.beginSection("RV FullInvalidate");
                o();
                Trace.endSection();
            }
        }
    }

    public final void n(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = S.f351a;
        setMeasuredDimension(I.g(i, paddingRight, getMinimumWidth()), I.g(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x0323, code lost:
    
        if (((java.util.ArrayList) r19.f1518e.d).contains(getFocusedChild()) == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0382, code lost:
    
        if (r6.hasFocusable() != false) goto L181;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [f0.X] */
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
        C0016q c0016q;
        int i;
        RecyclerView recyclerView;
        boolean g2;
        if (this.f1527k == null) {
            Log.e("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f1529l == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        U u2 = this.f1516c0;
        u2.i = false;
        if (u2.d == 1) {
            p();
            this.f1529l.p0(this);
            q();
        } else {
            H.e eVar = this.d;
            if ((((ArrayList) eVar.d).isEmpty() || ((ArrayList) eVar.f275c).isEmpty()) && this.f1529l.f2077n == getWidth() && this.f1529l.f2078o == getHeight()) {
                this.f1529l.p0(this);
            } else {
                this.f1529l.p0(this);
                q();
            }
        }
        u2.a(4);
        a0();
        P();
        u2.d = 1;
        boolean z3 = u2.f2106j;
        View view2 = null;
        Long l2 = null;
        O o2 = this.f1513b;
        j jVar = this.f1520f;
        if (z3) {
            int f2 = this.f1518e.f() - 1;
            while (f2 >= 0) {
                X I2 = I(this.f1518e.e(f2));
                if (!I2.p()) {
                    long G2 = G(I2);
                    this.f1495H.getClass();
                    C0016q c0016q2 = new C0016q();
                    c0016q2.a(I2);
                    X x2 = (X) ((o.e) jVar.f54c).c(G2, l2);
                    if (x2 == null || x2.p()) {
                        jVar.b(I2, c0016q2);
                    } else {
                        k kVar = (k) jVar.f53b;
                        h0 h0Var = (h0) kVar.getOrDefault(x2, l2);
                        boolean z4 = (h0Var == null || (h0Var.f2194a & 1) == 0) ? false : true;
                        h0 h0Var2 = (h0) kVar.getOrDefault(I2, l2);
                        boolean z5 = (h0Var2 == null || (h0Var2.f2194a & 1) == 0) ? false : true;
                        if (z4 && x2 == I2) {
                            jVar.b(I2, c0016q2);
                        } else {
                            C0016q G3 = jVar.G(x2, 4);
                            jVar.b(I2, c0016q2);
                            C0016q G4 = jVar.G(I2, 8);
                            if (G3 == null) {
                                int f3 = this.f1518e.f();
                                for (int i2 = 0; i2 < f3; i2++) {
                                    X I3 = I(this.f1518e.e(i2));
                                    if (I3 != I2 && G(I3) == G2) {
                                        AbstractC0086A abstractC0086A = this.f1527k;
                                        if (abstractC0086A == null || !abstractC0086A.f2056b) {
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
                                if (this.f1495H.a(x2, I2, G3, G4)) {
                                    S();
                                }
                            }
                        }
                    }
                }
                f2--;
                l2 = null;
            }
            k kVar2 = (k) jVar.f53b;
            for (int i3 = kVar2.f3361c - 1; i3 >= 0; i3--) {
                X x3 = (X) kVar2.h(i3);
                h0 h0Var3 = (h0) kVar2.i(i3);
                int i4 = h0Var3.f2194a;
                int i5 = i4 & 3;
                C0111z c0111z = this.f1541r0;
                if (i5 == 3) {
                    RecyclerView recyclerView2 = c0111z.f2295a;
                    recyclerView2.f1529l.i0(x3.f2118a, recyclerView2.f1513b);
                } else if ((i4 & 1) != 0) {
                    C0016q c0016q3 = h0Var3.f2195b;
                    if (c0016q3 == null) {
                        RecyclerView recyclerView3 = c0111z.f2295a;
                        recyclerView3.f1529l.i0(x3.f2118a, recyclerView3.f1513b);
                    } else {
                        c0111z.g(x3, c0016q3, h0Var3.f2196c);
                    }
                } else if ((i4 & 14) == 14) {
                    c0111z.f(x3, h0Var3.f2195b, h0Var3.f2196c);
                } else if ((i4 & 12) == 12) {
                    C0016q c0016q4 = h0Var3.f2195b;
                    C0016q c0016q5 = h0Var3.f2196c;
                    c0111z.getClass();
                    x3.o(false);
                    RecyclerView recyclerView4 = c0111z.f2295a;
                    if (!recyclerView4.f1548y) {
                        C0095i c0095i = (C0095i) recyclerView4.f1495H;
                        c0095i.getClass();
                        int i6 = c0016q4.f424a;
                        int i7 = c0016q5.f424a;
                        if (i6 == i7 && c0016q4.f425b == c0016q5.f425b) {
                            c0095i.c(x3);
                            recyclerView = recyclerView4;
                            g2 = false;
                        } else {
                            recyclerView = recyclerView4;
                            g2 = c0095i.g(x3, i6, c0016q4.f425b, i7, c0016q5.f425b);
                        }
                        if (g2) {
                            recyclerView.S();
                        }
                    } else if (recyclerView4.f1495H.a(x3, x3, c0016q4, c0016q5)) {
                        recyclerView4.S();
                    }
                } else {
                    if ((i4 & 4) != 0) {
                        c0016q = null;
                        c0111z.g(x3, h0Var3.f2195b, null);
                    } else {
                        c0016q = null;
                        if ((i4 & 8) != 0) {
                            c0111z.f(x3, h0Var3.f2195b, h0Var3.f2196c);
                        }
                    }
                    i = 0;
                    h0Var3.f2194a = i;
                    h0Var3.f2195b = c0016q;
                    h0Var3.f2196c = c0016q;
                    h0.d.c(h0Var3);
                }
                i = 0;
                c0016q = null;
                h0Var3.f2194a = i;
                h0Var3.f2195b = c0016q;
                h0Var3.f2196c = c0016q;
                h0.d.c(h0Var3);
            }
            view2 = null;
        }
        this.f1529l.h0(o2);
        u2.f2101b = u2.f2103e;
        this.f1548y = false;
        this.f1549z = false;
        u2.f2106j = false;
        u2.f2107k = false;
        this.f1529l.f2071f = false;
        ArrayList arrayList = o2.f2088b;
        if (arrayList != null) {
            arrayList.clear();
        }
        I i8 = this.f1529l;
        if (i8.f2074k) {
            i8.f2073j = 0;
            i8.f2074k = false;
            o2.k();
        }
        this.f1529l.c0(u2);
        Q(true);
        b0(false);
        ((k) jVar.f53b).clear();
        ((o.e) jVar.f54c).a();
        int[] iArr = this.f1528k0;
        int i9 = iArr[0];
        int i10 = iArr[1];
        C(iArr);
        if ((iArr[0] == i9 && iArr[1] == i10) ? false : true) {
            t(0, 0);
        }
        if (this.f1509V && this.f1527k != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (!isFocused()) {
            }
            long j2 = u2.f2109m;
            if (j2 != -1 && (z2 = this.f1527k.f2056b) && z2) {
                int m2 = this.f1518e.m();
                r10 = view2;
                int i11 = 0;
                while (true) {
                    if (i11 >= m2) {
                        break;
                    }
                    X I4 = I(this.f1518e.l(i11));
                    if (I4 != null && !I4.i() && I4.f2121e == j2) {
                        if (!((ArrayList) this.f1518e.d).contains(I4.f2118a)) {
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
                ArrayList arrayList2 = (ArrayList) this.f1518e.d;
                view = r10.f2118a;
                if (!arrayList2.contains(view)) {
                }
            }
            if (this.f1518e.f() > 0) {
                int i12 = u2.f2108l;
                if (i12 == -1) {
                    i12 = 0;
                }
                int b2 = u2.b();
                for (int i13 = i12; i13 < b2; i13++) {
                    X E2 = E(i13);
                    if (E2 == null) {
                        break;
                    }
                    View view3 = E2.f2118a;
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
                    view = E3.f2118a;
                    if (view.hasFocusable()) {
                        view2 = view;
                        break;
                    }
                }
            }
            if (view2 != null) {
                int i14 = u2.f2110n;
                if (i14 != -1 && (findViewById = view2.findViewById(i14)) != null && findViewById.isFocusable()) {
                    view2 = findViewById;
                }
                view2.requestFocus();
            }
        }
        u2.f2109m = -1L;
        u2.f2108l = -1;
        u2.f2110n = -1;
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
        this.f1489A = 0;
        this.f1536p = true;
        this.f1540r = this.f1540r && !isLayoutRequested();
        I i = this.f1529l;
        if (i != null) {
            i.f2072g = true;
            i.Q(this);
        }
        this.f1525i0 = false;
        ThreadLocal threadLocal = RunnableC0101o.f2245e;
        RunnableC0101o runnableC0101o = (RunnableC0101o) threadLocal.get();
        this.f1512a0 = runnableC0101o;
        if (runnableC0101o == null) {
            RunnableC0101o runnableC0101o2 = new RunnableC0101o();
            runnableC0101o2.f2247a = new ArrayList();
            runnableC0101o2.d = new ArrayList();
            this.f1512a0 = runnableC0101o2;
            WeakHashMap weakHashMap = S.f351a;
            Display display = getDisplay();
            if (!isInEditMode() && display != null) {
                f2 = display.getRefreshRate();
            }
            f2 = 60.0f;
            RunnableC0101o runnableC0101o3 = this.f1512a0;
            runnableC0101o3.f2249c = (long) (1.0E9f / f2);
            threadLocal.set(runnableC0101o3);
        }
        this.f1512a0.f2247a.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C0107v c0107v;
        super.onDetachedFromWindow();
        E e2 = this.f1495H;
        if (e2 != null) {
            e2.e();
        }
        setScrollState(0);
        W w2 = this.f1510W;
        w2.f2116g.removeCallbacks(w2);
        w2.f2113c.abortAnimation();
        I i = this.f1529l;
        if (i != null && (c0107v = i.f2070e) != null) {
            c0107v.i();
        }
        this.f1536p = false;
        I i2 = this.f1529l;
        if (i2 != null) {
            i2.f2072g = false;
            i2.R(this);
        }
        this.f1537p0.clear();
        removeCallbacks(this.f1539q0);
        this.f1520f.getClass();
        while (h0.d.a() != null) {
        }
        RunnableC0101o runnableC0101o = this.f1512a0;
        if (runnableC0101o != null) {
            runnableC0101o.f2247a.remove(this);
            this.f1512a0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f1531m;
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
        if (this.f1529l != null && !this.f1544u && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f2 = this.f1529l.e() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f1529l.d()) {
                    f3 = motionEvent.getAxisValue(10);
                    if (f2 == 0.0f || f3 != 0.0f) {
                        W((int) (f3 * this.f1507T), (int) (f2 * this.f1508U), motionEvent);
                    }
                }
                f3 = 0.0f;
                if (f2 == 0.0f) {
                }
                W((int) (f3 * this.f1507T), (int) (f2 * this.f1508U), motionEvent);
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f1529l.e()) {
                        f2 = -axisValue;
                        f3 = 0.0f;
                        if (f2 == 0.0f) {
                        }
                        W((int) (f3 * this.f1507T), (int) (f2 * this.f1508U), motionEvent);
                    } else if (this.f1529l.d()) {
                        f3 = axisValue;
                        f2 = 0.0f;
                        if (f2 == 0.0f) {
                        }
                        W((int) (f3 * this.f1507T), (int) (f2 * this.f1508U), motionEvent);
                    }
                }
                f2 = 0.0f;
                f3 = 0.0f;
                if (f2 == 0.0f) {
                }
                W((int) (f3 * this.f1507T), (int) (f2 * this.f1508U), motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (this.f1544u) {
            return false;
        }
        this.f1534o = null;
        if (B(motionEvent)) {
            V();
            setScrollState(0);
            return true;
        }
        I i = this.f1529l;
        if (i == null) {
            return false;
        }
        boolean d = i.d();
        boolean e2 = this.f1529l.e();
        if (this.f1498K == null) {
            this.f1498K = VelocityTracker.obtain();
        }
        this.f1498K.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f1545v) {
                this.f1545v = false;
            }
            this.f1497J = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.f1501N = x2;
            this.f1499L = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.f1502O = y2;
            this.f1500M = y2;
            if (this.f1496I == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                c0(1);
            }
            int[] iArr = this.n0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i2 = d;
            if (e2) {
                i2 = (d ? 1 : 0) | 2;
            }
            getScrollingChildHelper().g(i2, 0);
        } else if (actionMasked == 1) {
            this.f1498K.clear();
            c0(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f1497J);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f1497J + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f1496I != 1) {
                int i3 = x3 - this.f1499L;
                int i4 = y3 - this.f1500M;
                if (d == 0 || Math.abs(i3) <= this.f1503P) {
                    z2 = false;
                } else {
                    this.f1501N = x3;
                    z2 = true;
                }
                if (e2 && Math.abs(i4) > this.f1503P) {
                    this.f1502O = y3;
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
            this.f1497J = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f1501N = x4;
            this.f1499L = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f1502O = y4;
            this.f1500M = y4;
        } else if (actionMasked == 6) {
            R(motionEvent);
        }
        return this.f1496I == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int i5 = h.f178a;
        Trace.beginSection("RV OnLayout");
        o();
        Trace.endSection();
        this.f1540r = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        I i3 = this.f1529l;
        if (i3 == null) {
            n(i, i2);
            return;
        }
        boolean L2 = i3.L();
        U u2 = this.f1516c0;
        if (!L2) {
            if (this.f1538q) {
                this.f1529l.f2068b.n(i, i2);
                return;
            }
            if (u2.f2107k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            AbstractC0086A abstractC0086A = this.f1527k;
            if (abstractC0086A != null) {
                u2.f2103e = abstractC0086A.a();
            } else {
                u2.f2103e = 0;
            }
            a0();
            this.f1529l.f2068b.n(i, i2);
            b0(false);
            u2.f2105g = false;
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.f1529l.f2068b.n(i, i2);
        if ((mode == 1073741824 && mode2 == 1073741824) || this.f1527k == null) {
            return;
        }
        if (u2.d == 1) {
            p();
        }
        this.f1529l.q0(i, i2);
        u2.i = true;
        q();
        this.f1529l.s0(i, i2);
        if (this.f1529l.v0()) {
            this.f1529l.q0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            u2.i = true;
            q();
            this.f1529l.s0(i, i2);
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
        this.f1515c = q2;
        super.onRestoreInstanceState(q2.f732a);
        I i = this.f1529l;
        if (i == null || (parcelable2 = this.f1515c.f2093c) == null) {
            return;
        }
        i.d0(parcelable2);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Q q2 = new Q(super.onSaveInstanceState());
        Q q3 = this.f1515c;
        if (q3 != null) {
            q2.f2093c = q3.f2093c;
        } else {
            I i = this.f1529l;
            if (i != null) {
                q2.f2093c = i.e0();
            } else {
                q2.f2093c = null;
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
        this.f1494G = null;
        this.f1493E = null;
        this.F = null;
        this.f1492D = null;
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
        if (this.f1544u || this.f1545v) {
            return false;
        }
        C0098l c0098l = this.f1534o;
        if (c0098l == null) {
            z2 = motionEvent.getAction() == 0 ? false : B(motionEvent);
        } else {
            if (c0098l.f2233v != 0) {
                if (motionEvent.getAction() == 0) {
                    boolean d = c0098l.d(motionEvent.getX(), motionEvent.getY());
                    boolean c2 = c0098l.c(motionEvent.getX(), motionEvent.getY());
                    if (d || c2) {
                        if (c2) {
                            c0098l.f2234w = 1;
                            c0098l.f2227p = (int) motionEvent.getX();
                        } else if (d) {
                            c0098l.f2234w = 2;
                            c0098l.f2224m = (int) motionEvent.getY();
                        }
                        c0098l.f(2);
                    }
                } else if (motionEvent.getAction() == 1 && c0098l.f2233v == 2) {
                    c0098l.f2224m = 0.0f;
                    c0098l.f2227p = 0.0f;
                    c0098l.f(1);
                    c0098l.f2234w = 0;
                } else if (motionEvent.getAction() == 2 && c0098l.f2233v == 2) {
                    c0098l.g();
                    int i3 = c0098l.f2234w;
                    int i4 = c0098l.f2216b;
                    if (i3 == 1) {
                        float x2 = motionEvent.getX();
                        int[] iArr = c0098l.f2236y;
                        iArr[0] = i4;
                        int i5 = c0098l.f2228q - i4;
                        iArr[1] = i5;
                        float max = Math.max(i4, Math.min(i5, x2));
                        if (Math.abs(c0098l.f2226o - max) >= 2.0f) {
                            int e2 = C0098l.e(c0098l.f2227p, max, iArr, c0098l.f2230s.computeHorizontalScrollRange(), c0098l.f2230s.computeHorizontalScrollOffset(), c0098l.f2228q);
                            if (e2 != 0) {
                                c0098l.f2230s.scrollBy(e2, 0);
                            }
                            c0098l.f2227p = max;
                        }
                    }
                    if (c0098l.f2234w == 2) {
                        float y2 = motionEvent.getY();
                        int[] iArr2 = c0098l.f2235x;
                        iArr2[0] = i4;
                        int i6 = c0098l.f2229r - i4;
                        iArr2[1] = i6;
                        float max2 = Math.max(i4, Math.min(i6, y2));
                        if (Math.abs(c0098l.f2223l - max2) >= 2.0f) {
                            int e3 = C0098l.e(c0098l.f2224m, max2, iArr2, c0098l.f2230s.computeVerticalScrollRange(), c0098l.f2230s.computeVerticalScrollOffset(), c0098l.f2229r);
                            if (e3 != 0) {
                                c0098l.f2230s.scrollBy(0, e3);
                            }
                            c0098l.f2224m = max2;
                        }
                    }
                }
            }
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.f1534o = null;
            }
            z2 = true;
        }
        if (z2) {
            V();
            setScrollState(0);
            return true;
        }
        I i7 = this.f1529l;
        if (i7 == null) {
            return false;
        }
        boolean d2 = i7.d();
        boolean e4 = this.f1529l.e();
        if (this.f1498K == null) {
            this.f1498K = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        int[] iArr3 = this.n0;
        if (actionMasked == 0) {
            iArr3[1] = 0;
            iArr3[0] = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(iArr3[0], iArr3[1]);
        if (actionMasked == 0) {
            recyclerView = this;
            motionEvent2 = obtain;
            recyclerView.f1497J = motionEvent.getPointerId(0);
            int x3 = (int) (motionEvent.getX() + 0.5f);
            recyclerView.f1501N = x3;
            recyclerView.f1499L = x3;
            int y3 = (int) (motionEvent.getY() + 0.5f);
            recyclerView.f1502O = y3;
            recyclerView.f1500M = y3;
            int i8 = d2;
            if (e4) {
                i8 = (d2 ? 1 : 0) | 2;
            }
            getScrollingChildHelper().g(i8, 0);
        } else {
            if (actionMasked == 1) {
                this.f1498K.addMovement(obtain);
                VelocityTracker velocityTracker = this.f1498K;
                int i9 = this.f1506S;
                velocityTracker.computeCurrentVelocity(1000, i9);
                float f2 = d2 != 0 ? -this.f1498K.getXVelocity(this.f1497J) : 0.0f;
                float f3 = e4 ? -this.f1498K.getYVelocity(this.f1497J) : 0.0f;
                if (f2 == 0.0f && f3 == 0.0f) {
                    recyclerView2 = this;
                    i2 = 0;
                    motionEvent4 = obtain;
                } else {
                    int i10 = (int) f2;
                    int i11 = (int) f3;
                    I i12 = this.f1529l;
                    if (i12 == null) {
                        Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                    } else if (!this.f1544u) {
                        int d3 = i12.d();
                        boolean e5 = this.f1529l.e();
                        int i13 = this.f1505R;
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
                                K k2 = this.f1504Q;
                                if (k2 != null) {
                                    C0110y c0110y = (C0110y) k2;
                                    I layoutManager = c0110y.f2292a.getLayoutManager();
                                    if (layoutManager != 0 && c0110y.f2292a.getAdapter() != null && ((Math.abs(i11) > (minFlingVelocity = c0110y.f2292a.getMinFlingVelocity()) || Math.abs(i10) > minFlingVelocity) && ((z3 = layoutManager instanceof T)))) {
                                        C0109x c0109x = !z3 ? null : new C0109x(c0110y, c0110y.f2292a.getContext(), 0);
                                        if (c0109x != null) {
                                            int B2 = layoutManager.B();
                                            if (B2 != 0) {
                                                g e6 = layoutManager.e() ? c0110y.e(layoutManager) : layoutManager.d() ? c0110y.d(layoutManager) : null;
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
                                                            int b2 = C0110y.b(u2, e6);
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
                                                        c0109x.f2277a = i;
                                                        layoutManager.y0(c0109x);
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
                                                        W w2 = this.f1510W;
                                                        RecyclerView recyclerView3 = w2.f2116g;
                                                        recyclerView3.setScrollState(2);
                                                        w2.f2112b = 0;
                                                        w2.f2111a = 0;
                                                        Interpolator interpolator = w2.d;
                                                        d dVar = f1488u0;
                                                        if (interpolator != dVar) {
                                                            w2.d = dVar;
                                                            w2.f2113c = new OverScroller(recyclerView3.getContext(), dVar);
                                                        }
                                                        w2.f2113c.fling(0, 0, max3, max4, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
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
                int findPointerIndex = motionEvent.findPointerIndex(this.f1497J);
                if (findPointerIndex < 0) {
                    Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f1497J + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                int x4 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                int y4 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                int i19 = this.f1501N - x4;
                int i20 = this.f1502O - y4;
                if (this.f1496I != 1) {
                    if (d2 != 0) {
                        i19 = i19 > 0 ? Math.max(0, i19 - this.f1503P) : Math.min(0, i19 + this.f1503P);
                        if (i19 != 0) {
                            z4 = true;
                            if (e4) {
                                i20 = i20 > 0 ? Math.max(0, i20 - this.f1503P) : Math.min(0, i20 + this.f1503P);
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
                if (this.f1496I == 1) {
                    int[] iArr4 = this.f1535o0;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    boolean r2 = r(d2 != 0 ? i21 : 0, e4 ? i22 : 0, iArr4, this.f1532m0, 0);
                    int[] iArr5 = this.f1532m0;
                    if (r2) {
                        i21 -= iArr4[0];
                        i22 -= iArr4[1];
                        iArr3[0] = iArr3[0] + iArr5[0];
                        iArr3[1] = iArr3[1] + iArr5[1];
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int i23 = i21;
                    int i24 = i22;
                    this.f1501N = x4 - iArr5[0];
                    this.f1502O = y4 - iArr5[1];
                    if (W(d2 != 0 ? i23 : 0, e4 ? i24 : 0, motionEvent)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    RunnableC0101o runnableC0101o = this.f1512a0;
                    if (runnableC0101o != null && (i23 != 0 || i24 != 0)) {
                        runnableC0101o.a(this, i23, i24);
                    }
                }
            } else if (actionMasked == 3) {
                V();
                setScrollState(0);
            } else if (actionMasked == 5) {
                this.f1497J = motionEvent.getPointerId(actionIndex);
                int x5 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.f1501N = x5;
                this.f1499L = x5;
                int y5 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.f1502O = y5;
                this.f1500M = y5;
            } else if (actionMasked == 6) {
                R(motionEvent);
            }
            recyclerView = this;
            motionEvent2 = obtain;
        }
        motionEvent3 = motionEvent2;
        recyclerView.f1498K.addMovement(motionEvent3);
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
        C0087a h;
        int i5;
        int i6;
        C0087a c0087a;
        U u2 = this.f1516c0;
        u2.a(1);
        z(u2);
        u2.i = false;
        a0();
        j jVar = this.f1520f;
        ((k) jVar.f53b).clear();
        o.e eVar = (o.e) jVar.f54c;
        eVar.a();
        P();
        if (this.f1548y) {
            H.e eVar2 = this.d;
            eVar2.j((ArrayList) eVar2.f275c);
            eVar2.j((ArrayList) eVar2.d);
            if (this.f1549z) {
                this.f1529l.X();
            }
        }
        if (this.f1495H == null || !this.f1529l.z0()) {
            this.d.b();
        } else {
            H.e eVar3 = this.d;
            ArrayList arrayList = (ArrayList) eVar3.f275c;
            C.h hVar = (C.h) eVar3.f277f;
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
                    if (((C0087a) arrayList.get(size)).f2135a == 8) {
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
                C0087a c0087a2 = (C0087a) arrayList.get(size);
                C0087a c0087a3 = (C0087a) arrayList.get(i7);
                int i8 = c0087a3.f2135a;
                if (i8 != 1) {
                    C0087a c0087a4 = null;
                    H.e eVar4 = (H.e) hVar.f150b;
                    if (i8 == 2) {
                        int i9 = c0087a2.f2136b;
                        int i10 = c0087a2.f2137c;
                        if (i9 < i10) {
                            if (c0087a3.f2136b == i9 && c0087a3.f2137c == i10 - i9) {
                                z5 = false;
                                z6 = true;
                            } else {
                                z5 = false;
                                z6 = false;
                            }
                        } else if (c0087a3.f2136b == i10 + 1 && c0087a3.f2137c == i9 - i10) {
                            z5 = true;
                            z6 = true;
                        } else {
                            z5 = true;
                            z6 = false;
                        }
                        int i11 = c0087a3.f2136b;
                        if (i10 < i11) {
                            c0087a3.f2136b = i11 - 1;
                        } else {
                            int i12 = c0087a3.f2137c;
                            if (i10 < i11 + i12) {
                                c0087a3.f2137c = i12 - 1;
                                c0087a2.f2135a = 2;
                                c0087a2.f2137c = 1;
                                if (c0087a3.f2137c == 0) {
                                    arrayList.remove(i7);
                                    eVar4.getClass();
                                    ((b) eVar4.f274b).c(c0087a3);
                                }
                            }
                        }
                        int i13 = c0087a2.f2136b;
                        int i14 = c0087a3.f2136b;
                        if (i13 <= i14) {
                            c0087a3.f2136b = i14 + 1;
                        } else {
                            int i15 = i14 + c0087a3.f2137c;
                            if (i13 < i15) {
                                c0087a4 = eVar4.h(2, i13 + 1, i15 - i13);
                                c0087a3.f2137c = c0087a2.f2136b - c0087a3.f2136b;
                            }
                        }
                        C0087a c0087a5 = c0087a4;
                        if (z6) {
                            arrayList.set(size, c0087a3);
                            arrayList.remove(i7);
                            eVar4.getClass();
                            ((b) eVar4.f274b).c(c0087a2);
                        } else {
                            if (z5) {
                                if (c0087a5 != null) {
                                    int i16 = c0087a2.f2136b;
                                    if (i16 > c0087a5.f2136b) {
                                        c0087a2.f2136b = i16 - c0087a5.f2137c;
                                    }
                                    int i17 = c0087a2.f2137c;
                                    if (i17 > c0087a5.f2136b) {
                                        c0087a2.f2137c = i17 - c0087a5.f2137c;
                                    }
                                }
                                int i18 = c0087a2.f2136b;
                                if (i18 > c0087a3.f2136b) {
                                    c0087a2.f2136b = i18 - c0087a3.f2137c;
                                }
                                int i19 = c0087a2.f2137c;
                                if (i19 > c0087a3.f2136b) {
                                    c0087a2.f2137c = i19 - c0087a3.f2137c;
                                }
                            } else {
                                if (c0087a5 != null) {
                                    int i20 = c0087a2.f2136b;
                                    if (i20 >= c0087a5.f2136b) {
                                        c0087a2.f2136b = i20 - c0087a5.f2137c;
                                    }
                                    int i21 = c0087a2.f2137c;
                                    if (i21 >= c0087a5.f2136b) {
                                        c0087a2.f2137c = i21 - c0087a5.f2137c;
                                    }
                                }
                                int i22 = c0087a2.f2136b;
                                if (i22 >= c0087a3.f2136b) {
                                    c0087a2.f2136b = i22 - c0087a3.f2137c;
                                }
                                int i23 = c0087a2.f2137c;
                                if (i23 >= c0087a3.f2136b) {
                                    c0087a2.f2137c = i23 - c0087a3.f2137c;
                                }
                            }
                            arrayList.set(size, c0087a3);
                            if (c0087a2.f2136b != c0087a2.f2137c) {
                                arrayList.set(i7, c0087a2);
                            } else {
                                arrayList.remove(i7);
                            }
                            if (c0087a5 != null) {
                                arrayList.add(size, c0087a5);
                            }
                        }
                    } else if (i8 == 4) {
                        int i24 = c0087a2.f2137c;
                        int i25 = c0087a3.f2136b;
                        if (i24 < i25) {
                            c0087a3.f2136b = i25 - 1;
                        } else {
                            int i26 = c0087a3.f2137c;
                            if (i24 < i25 + i26) {
                                c0087a3.f2137c = i26 - 1;
                                h = eVar4.h(4, c0087a2.f2136b, 1);
                                i5 = c0087a2.f2136b;
                                i6 = c0087a3.f2136b;
                                if (i5 > i6) {
                                    c0087a3.f2136b = i6 + 1;
                                } else {
                                    int i27 = i6 + c0087a3.f2137c;
                                    if (i5 < i27) {
                                        int i28 = i27 - i5;
                                        c0087a4 = eVar4.h(4, i5 + 1, i28);
                                        c0087a3.f2137c -= i28;
                                    }
                                }
                                c0087a = c0087a4;
                                arrayList.set(i7, c0087a2);
                                if (c0087a3.f2137c <= 0) {
                                    arrayList.set(size, c0087a3);
                                } else {
                                    arrayList.remove(size);
                                    eVar4.getClass();
                                    ((b) eVar4.f274b).c(c0087a3);
                                }
                                if (h != null) {
                                    arrayList.add(size, h);
                                }
                                if (c0087a == null) {
                                    arrayList.add(size, c0087a);
                                }
                            }
                        }
                        h = null;
                        i5 = c0087a2.f2136b;
                        i6 = c0087a3.f2136b;
                        if (i5 > i6) {
                        }
                        c0087a = c0087a4;
                        arrayList.set(i7, c0087a2);
                        if (c0087a3.f2137c <= 0) {
                        }
                        if (h != null) {
                        }
                        if (c0087a == null) {
                        }
                    }
                } else {
                    int i29 = c0087a2.f2137c;
                    int i30 = c0087a3.f2136b;
                    int i31 = i29 < i30 ? -1 : 0;
                    int i32 = c0087a2.f2136b;
                    if (i32 < i30) {
                        i31++;
                    }
                    if (i30 <= i32) {
                        c0087a2.f2136b = i32 + c0087a3.f2137c;
                    }
                    int i33 = c0087a3.f2136b;
                    if (i33 <= i29) {
                        c0087a2.f2137c = i29 + c0087a3.f2137c;
                    }
                    c0087a3.f2136b = i33 + i31;
                    arrayList.set(size, c0087a3);
                    arrayList.set(i7, c0087a2);
                }
            }
            int size2 = arrayList.size();
            int i34 = 0;
            while (i34 < size2) {
                C0087a c0087a6 = (C0087a) arrayList.get(i34);
                int i35 = c0087a6.f2135a;
                if (i35 != 1) {
                    b bVar = (b) eVar3.f274b;
                    C0111z c0111z = (C0111z) eVar3.f276e;
                    if (i35 == 2) {
                        i2 = size2;
                        int i36 = c0087a6.f2136b;
                        int i37 = c0087a6.f2137c + i36;
                        int i38 = i36;
                        int i39 = 0;
                        char c3 = 65535;
                        while (i38 < i37) {
                            if (c0111z.b(i38) != null || eVar3.a(i38)) {
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
                        if (i39 != c0087a6.f2137c) {
                            bVar.c(c0087a6);
                            c0087a6 = eVar3.h(2, i36, i39);
                        }
                        if (c3 == 0) {
                            eVar3.c(c0087a6);
                        } else {
                            eVar3.i(c0087a6);
                        }
                    } else if (i35 != 4) {
                        if (i35 == i) {
                            eVar3.i(c0087a6);
                        }
                        i2 = size2;
                    } else {
                        int i40 = c0087a6.f2136b;
                        int i41 = c0087a6.f2137c + i40;
                        int i42 = i40;
                        char c4 = 65535;
                        int i43 = 0;
                        while (i40 < i41) {
                            if (c0111z.b(i40) != null || eVar3.a(i40)) {
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
                        if (i43 != c0087a6.f2137c) {
                            bVar.c(c0087a6);
                            c0087a6 = eVar3.h(4, i42, i43);
                        }
                        if (c4 == 0) {
                            eVar3.c(c0087a6);
                        } else {
                            eVar3.i(c0087a6);
                        }
                    }
                } else {
                    i2 = size2;
                    eVar3.i(c0087a6);
                }
                i34++;
                size2 = i2;
                i = 8;
            }
            arrayList.clear();
        }
        boolean z8 = this.f1521f0 || this.f1523g0;
        boolean z9 = this.f1540r && this.f1495H != null && ((z2 = this.f1548y) || z8 || this.f1529l.f2071f) && (!z2 || this.f1527k.f2056b);
        U u3 = this.f1516c0;
        u3.f2106j = z9;
        u3.f2107k = z9 && z8 && !this.f1548y && this.f1495H != null && this.f1529l.z0();
        View focusedChild = (this.f1509V && hasFocus() && this.f1527k != null) ? getFocusedChild() : null;
        X H2 = (focusedChild == null || (A2 = A(focusedChild)) == null) ? null : H(A2);
        if (H2 == null) {
            u2.f2109m = -1L;
            u2.f2108l = -1;
            u2.f2110n = -1;
        } else {
            u2.f2109m = this.f1527k.f2056b ? H2.f2121e : -1L;
            if (!this.f1548y) {
                if (H2.i()) {
                    F = H2.d;
                } else {
                    RecyclerView recyclerView = H2.f2132r;
                    if (recyclerView != null) {
                        F = recyclerView.F(H2);
                    }
                }
                u2.f2108l = F;
                view = H2.f2118a;
                int id = view.getId();
                while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                    view = ((ViewGroup) view).getFocusedChild();
                    if (view.getId() == -1) {
                        id = view.getId();
                    }
                }
                u2.f2110n = id;
            }
            F = -1;
            u2.f2108l = F;
            view = H2.f2118a;
            int id2 = view.getId();
            while (!view.isFocused()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() == -1) {
                }
            }
            u2.f2110n = id2;
        }
        u2.h = u2.f2106j && this.f1523g0;
        this.f1523g0 = false;
        this.f1521f0 = false;
        u2.f2105g = u2.f2107k;
        u2.f2103e = this.f1527k.a();
        C(this.f1528k0);
        boolean z10 = u2.f2106j;
        k kVar = (k) jVar.f53b;
        if (z10) {
            int f2 = this.f1518e.f();
            for (int i44 = 0; i44 < f2; i44++) {
                X I2 = I(this.f1518e.e(i44));
                if (!I2.p() && (!I2.g() || this.f1527k.f2056b)) {
                    E e2 = this.f1495H;
                    E.b(I2);
                    I2.c();
                    e2.getClass();
                    C0016q c0016q = new C0016q();
                    c0016q.a(I2);
                    h0 h0Var2 = (h0) kVar.getOrDefault(I2, null);
                    if (h0Var2 == null) {
                        h0Var2 = h0.a();
                        kVar.put(I2, h0Var2);
                    }
                    h0Var2.f2195b = c0016q;
                    h0Var2.f2194a |= 4;
                    if (u2.h && I2.l() && !I2.i() && !I2.p() && !I2.g()) {
                        eVar.d(G(I2), I2);
                    }
                }
            }
        }
        if (u2.f2107k) {
            int m2 = this.f1518e.m();
            for (int i45 = 0; i45 < m2; i45++) {
                X I3 = I(this.f1518e.l(i45));
                if (!I3.p() && I3.d == -1) {
                    I3.d = I3.f2120c;
                }
            }
            boolean z11 = u2.f2104f;
            u2.f2104f = false;
            this.f1529l.b0(this.f1513b, u2);
            u2.f2104f = z11;
            for (int i46 = 0; i46 < this.f1518e.f(); i46++) {
                X I4 = I(this.f1518e.e(i46));
                if (!I4.p() && ((h0Var = (h0) kVar.getOrDefault(I4, null)) == null || (h0Var.f2194a & 4) == 0)) {
                    E.b(I4);
                    boolean d = I4.d(8192);
                    E e3 = this.f1495H;
                    I4.c();
                    e3.getClass();
                    C0016q c0016q2 = new C0016q();
                    c0016q2.a(I4);
                    if (d) {
                        T(I4, c0016q2);
                    } else {
                        h0 h0Var3 = (h0) kVar.getOrDefault(I4, null);
                        if (h0Var3 == null) {
                            h0Var3 = h0.a();
                            kVar.put(I4, h0Var3);
                        }
                        h0Var3.f2194a |= 2;
                        h0Var3.f2195b = c0016q2;
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
        U u2 = this.f1516c0;
        u2.a(6);
        this.d.b();
        u2.f2103e = this.f1527k.a();
        u2.f2102c = 0;
        u2.f2105g = false;
        this.f1529l.b0(this.f1513b, u2);
        u2.f2104f = false;
        this.f1515c = null;
        u2.f2106j = u2.f2106j && this.f1495H != null;
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
                I2.f2124j &= -257;
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
        C0107v c0107v = this.f1529l.f2070e;
        if ((c0107v == null || !c0107v.f2280e) && !L() && view2 != null) {
            U(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.f1529l.k0(this, view, rect, z2, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        ArrayList arrayList = this.f1533n;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C0098l) arrayList.get(i)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f1542s != 0 || this.f1544u) {
            this.f1543t = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().d(i, i2, i3, i4, iArr, i5, iArr2);
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        I i3 = this.f1529l;
        if (i3 == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f1544u) {
            return;
        }
        boolean d = i3.d();
        boolean e2 = this.f1529l.e();
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
            this.f1546w |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(Z z2) {
        this.j0 = z2;
        S.l(this, z2);
    }

    public void setAdapter(AbstractC0086A abstractC0086A) {
        setLayoutFrozen(false);
        AbstractC0086A abstractC0086A2 = this.f1527k;
        e eVar = this.f1511a;
        if (abstractC0086A2 != null) {
            abstractC0086A2.f2055a.unregisterObserver(eVar);
            this.f1527k.getClass();
        }
        E e2 = this.f1495H;
        if (e2 != null) {
            e2.e();
        }
        I i = this.f1529l;
        O o2 = this.f1513b;
        if (i != null) {
            i.g0(o2);
            this.f1529l.h0(o2);
        }
        o2.f2087a.clear();
        o2.d();
        H.e eVar2 = this.d;
        eVar2.j((ArrayList) eVar2.f275c);
        eVar2.j((ArrayList) eVar2.d);
        AbstractC0086A abstractC0086A3 = this.f1527k;
        this.f1527k = abstractC0086A;
        if (abstractC0086A != null) {
            abstractC0086A.f2055a.registerObserver(eVar);
        }
        AbstractC0086A abstractC0086A4 = this.f1527k;
        o2.f2087a.clear();
        o2.d();
        N c2 = o2.c();
        if (abstractC0086A3 != null) {
            c2.f2086b--;
        }
        if (c2.f2086b == 0) {
            int i2 = 0;
            while (true) {
                SparseArray sparseArray = c2.f2085a;
                if (i2 >= sparseArray.size()) {
                    break;
                }
                ((M) sparseArray.valueAt(i2)).f2082a.clear();
                i2++;
            }
        }
        if (abstractC0086A4 != null) {
            c2.f2086b++;
        }
        this.f1516c0.f2104f = true;
        this.f1549z |= false;
        this.f1548y = true;
        int m2 = this.f1518e.m();
        for (int i3 = 0; i3 < m2; i3++) {
            X I2 = I(this.f1518e.l(i3));
            if (I2 != null && !I2.p()) {
                I2.a(6);
            }
        }
        N();
        O o3 = this.f1513b;
        ArrayList arrayList = o3.f2089c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            X x2 = (X) arrayList.get(i4);
            if (x2 != null) {
                x2.a(6);
                x2.a(1024);
            }
        }
        AbstractC0086A abstractC0086A5 = o3.h.f1527k;
        if (abstractC0086A5 == null || !abstractC0086A5.f2056b) {
            o3.d();
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
        if (z2 != this.f1522g) {
            this.f1494G = null;
            this.f1493E = null;
            this.F = null;
            this.f1492D = null;
        }
        this.f1522g = z2;
        super.setClipToPadding(z2);
        if (this.f1540r) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(D d) {
        d.getClass();
        this.f1491C = d;
        this.f1494G = null;
        this.f1493E = null;
        this.F = null;
        this.f1492D = null;
    }

    public void setHasFixedSize(boolean z2) {
        this.f1538q = z2;
    }

    public void setItemAnimator(E e2) {
        E e3 = this.f1495H;
        if (e3 != null) {
            e3.e();
            this.f1495H.f2057a = null;
        }
        this.f1495H = e2;
        if (e2 != null) {
            e2.f2057a = this.f1524h0;
        }
    }

    public void setItemViewCacheSize(int i) {
        O o2 = this.f1513b;
        o2.f2090e = i;
        o2.k();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(I i) {
        RecyclerView recyclerView;
        C0107v c0107v;
        if (i == this.f1529l) {
            return;
        }
        setScrollState(0);
        W w2 = this.f1510W;
        w2.f2116g.removeCallbacks(w2);
        w2.f2113c.abortAnimation();
        I i2 = this.f1529l;
        if (i2 != null && (c0107v = i2.f2070e) != null) {
            c0107v.i();
        }
        I i3 = this.f1529l;
        O o2 = this.f1513b;
        if (i3 != null) {
            E e2 = this.f1495H;
            if (e2 != null) {
                e2.e();
            }
            this.f1529l.g0(o2);
            this.f1529l.h0(o2);
            o2.f2087a.clear();
            o2.d();
            if (this.f1536p) {
                I i4 = this.f1529l;
                i4.f2072g = false;
                i4.R(this);
            }
            this.f1529l.t0(null);
            this.f1529l = null;
        } else {
            o2.f2087a.clear();
            o2.d();
        }
        C0011l c0011l = this.f1518e;
        ((C0088b) c0011l.f405c).h();
        ArrayList arrayList = (ArrayList) c0011l.d;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = ((C0111z) c0011l.f404b).f2295a;
            if (size < 0) {
                break;
            }
            X I2 = I((View) arrayList.get(size));
            if (I2 != null) {
                int i5 = I2.f2130p;
                if (recyclerView.L()) {
                    I2.f2131q = i5;
                    recyclerView.f1537p0.add(I2);
                } else {
                    WeakHashMap weakHashMap = S.f351a;
                    I2.f2118a.setImportantForAccessibility(i5);
                }
                I2.f2130p = 0;
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
        this.f1529l = i;
        if (i != null) {
            if (i.f2068b != null) {
                throw new IllegalArgumentException("LayoutManager " + i + " is already attached to a RecyclerView:" + i.f2068b.y());
            }
            i.t0(this);
            if (this.f1536p) {
                I i7 = this.f1529l;
                i7.f2072g = true;
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
        C0013n scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.d) {
            WeakHashMap weakHashMap = S.f351a;
            G.z(scrollingChildHelper.f413c);
        }
        scrollingChildHelper.d = z2;
    }

    public void setOnFlingListener(K k2) {
        this.f1504Q = k2;
    }

    @Deprecated
    public void setOnScrollListener(L l2) {
        this.f1517d0 = l2;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.f1509V = z2;
    }

    public void setRecycledViewPool(N n2) {
        O o2 = this.f1513b;
        if (o2.f2092g != null) {
            r1.f2086b--;
        }
        o2.f2092g = n2;
        if (n2 == null || o2.h.getAdapter() == null) {
            return;
        }
        o2.f2092g.f2086b++;
    }

    public void setRecyclerListener(P p2) {
    }

    public void setScrollState(int i) {
        C0107v c0107v;
        if (i == this.f1496I) {
            return;
        }
        this.f1496I = i;
        if (i != 2) {
            W w2 = this.f1510W;
            w2.f2116g.removeCallbacks(w2);
            w2.f2113c.abortAnimation();
            I i2 = this.f1529l;
            if (i2 != null && (c0107v = i2.f2070e) != null) {
                c0107v.i();
            }
        }
        I i3 = this.f1529l;
        if (i3 != null) {
            i3.f0(i);
        }
        L l2 = this.f1517d0;
        if (l2 != null) {
            l2.a(this, i);
        }
        ArrayList arrayList = this.f1519e0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((L) this.f1519e0.get(size)).a(this, i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.f1503P = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.f1503P = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(V v2) {
        this.f1513b.getClass();
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
        C0107v c0107v;
        if (z2 != this.f1544u) {
            i("Do not suppressLayout in layout or scroll");
            if (!z2) {
                this.f1544u = false;
                if (this.f1543t && this.f1529l != null && this.f1527k != null) {
                    requestLayout();
                }
                this.f1543t = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f1544u = true;
            this.f1545v = true;
            setScrollState(0);
            W w2 = this.f1510W;
            w2.f2116g.removeCallbacks(w2);
            w2.f2113c.abortAnimation();
            I i = this.f1529l;
            if (i == null || (c0107v = i.f2070e) == null) {
                return;
            }
            c0107v.i();
        }
    }

    public final void t(int i, int i2) {
        this.f1490B++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        L l2 = this.f1517d0;
        if (l2 != null) {
            l2.b(this, i, i2);
        }
        ArrayList arrayList = this.f1519e0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((L) this.f1519e0.get(size)).b(this, i, i2);
            }
        }
        this.f1490B--;
    }

    public final void u() {
        if (this.f1494G != null) {
            return;
        }
        this.f1491C.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1494G = edgeEffect;
        if (this.f1522g) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void v() {
        if (this.f1492D != null) {
            return;
        }
        this.f1491C.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1492D = edgeEffect;
        if (this.f1522g) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void w() {
        if (this.F != null) {
            return;
        }
        this.f1491C.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.F = edgeEffect;
        if (this.f1522g) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void x() {
        if (this.f1493E != null) {
            return;
        }
        this.f1491C.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1493E = edgeEffect;
        if (this.f1522g) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String y() {
        return " " + super.toString() + ", adapter:" + this.f1527k + ", layout:" + this.f1529l + ", context:" + getContext();
    }

    public final void z(U u2) {
        if (getScrollState() != 2) {
            u2.getClass();
            return;
        }
        OverScroller overScroller = this.f1510W.f2113c;
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
        this.f1511a = new e(this);
        this.f1513b = new O(this);
        this.f1520f = new j(13);
        this.h = new Rect();
        this.i = new Rect();
        this.f1526j = new RectF();
        this.f1531m = new ArrayList();
        this.f1533n = new ArrayList();
        this.f1542s = 0;
        this.f1548y = false;
        this.f1549z = false;
        this.f1489A = 0;
        this.f1490B = 0;
        this.f1491C = new D();
        C0095i c0095i = new C0095i();
        c0095i.f2057a = null;
        c0095i.f2058b = new ArrayList();
        c0095i.f2059c = 120L;
        c0095i.d = 120L;
        c0095i.f2060e = 250L;
        c0095i.f2061f = 250L;
        c0095i.f2198g = true;
        c0095i.h = new ArrayList();
        c0095i.i = new ArrayList();
        c0095i.f2199j = new ArrayList();
        c0095i.f2200k = new ArrayList();
        c0095i.f2201l = new ArrayList();
        c0095i.f2202m = new ArrayList();
        c0095i.f2203n = new ArrayList();
        c0095i.f2204o = new ArrayList();
        c0095i.f2205p = new ArrayList();
        c0095i.f2206q = new ArrayList();
        c0095i.f2207r = new ArrayList();
        this.f1495H = c0095i;
        this.f1496I = 0;
        this.f1497J = -1;
        this.f1507T = Float.MIN_VALUE;
        this.f1508U = Float.MIN_VALUE;
        this.f1509V = true;
        this.f1510W = new W(this);
        this.f1514b0 = new C0099m();
        U u2 = new U();
        u2.f2100a = -1;
        u2.f2101b = 0;
        u2.f2102c = 0;
        u2.d = 1;
        u2.f2103e = 0;
        u2.f2104f = false;
        u2.f2105g = false;
        u2.h = false;
        u2.i = false;
        u2.f2106j = false;
        u2.f2107k = false;
        this.f1516c0 = u2;
        this.f1521f0 = false;
        this.f1523g0 = false;
        C0111z c0111z = new C0111z(this);
        this.f1524h0 = c0111z;
        this.f1525i0 = false;
        this.f1528k0 = new int[2];
        this.f1532m0 = new int[2];
        this.n0 = new int[2];
        this.f1535o0 = new int[2];
        this.f1537p0 = new ArrayList();
        this.f1539q0 = new A(7, this);
        this.f1541r0 = new C0111z(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1503P = viewConfiguration.getScaledTouchSlop();
        this.f1507T = K.T.a(viewConfiguration);
        this.f1508U = K.T.b(viewConfiguration);
        this.f1505R = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1506S = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f1495H.f2057a = c0111z;
        this.d = new H.e(new C0111z(this));
        this.f1518e = new C0011l(new C0111z(this));
        WeakHashMap weakHashMap = S.f351a;
        if (K.I.c(this) == 0) {
            K.I.m(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f1547x = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new Z(this));
        int[] iArr = AbstractC0085a.f2031a;
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
        this.f1522g = typedArray.getBoolean(1, true);
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
            new C0098l(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.glasspulse.glasspulse.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.glasspulse.glasspulse.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.glasspulse.glasspulse.R.dimen.fastscroll_margin));
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
                        constructor = asSubclass.getConstructor(f1487t0);
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
                                int[] iArr2 = f1486s0;
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
                    int[] iArr22 = f1486s0;
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
        int[] iArr222 = f1486s0;
        TypedArray obtainStyledAttributes222 = context.obtainStyledAttributes(attributeSet, iArr222, i, 0);
        if (i3 >= 29) {
        }
        boolean z322 = obtainStyledAttributes222.getBoolean(0, z2);
        obtainStyledAttributes222.recycle();
        setNestedScrollingEnabled(z322);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        I i = this.f1529l;
        if (i != null) {
            return i.t(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }
}
