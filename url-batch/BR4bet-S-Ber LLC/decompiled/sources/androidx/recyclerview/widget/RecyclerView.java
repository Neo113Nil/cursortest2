package androidx.recyclerview.widget;

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
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import defpackage.a5;
import defpackage.b20;
import defpackage.c20;
import defpackage.cc0;
import defpackage.d20;
import defpackage.dy;
import defpackage.e20;
import defpackage.eu;
import defpackage.ey;
import defpackage.f20;
import defpackage.f60;
import defpackage.g20;
import defpackage.g9;
import defpackage.h20;
import defpackage.hy;
import defpackage.i20;
import defpackage.ic0;
import defpackage.ij;
import defpackage.j20;
import defpackage.k20;
import defpackage.k6;
import defpackage.lg;
import defpackage.ll;
import defpackage.m20;
import defpackage.n20;
import defpackage.o20;
import defpackage.oc0;
import defpackage.p20;
import defpackage.q10;
import defpackage.q20;
import defpackage.r10;
import defpackage.ra;
import defpackage.ro;
import defpackage.rz;
import defpackage.s10;
import defpackage.s20;
import defpackage.sz;
import defpackage.t10;
import defpackage.to;
import defpackage.v10;
import defpackage.v90;
import defpackage.w10;
import defpackage.w50;
import defpackage.x00;
import defpackage.x1;
import defpackage.x10;
import defpackage.xs;
import defpackage.y1;
import defpackage.y10;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements dy {
    public static final int[] D0 = {R.attr.nestedScrollingEnabled};
    public static final Class[] E0;
    public static final r10 F0;
    public boolean A;
    public int A0;
    public boolean B;
    public int B0;
    public boolean C;
    public final s10 C0;
    public int D;
    public boolean E;
    public final AccessibilityManager F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public w10 K;
    public EdgeEffect L;
    public EdgeEffect M;
    public EdgeEffect N;
    public EdgeEffect O;
    public x10 P;
    public int Q;
    public int R;
    public VelocityTracker S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int a0;
    public d20 b0;
    public final int c0;
    public final int d0;
    public final float e0;
    public final j20 f;
    public final float f0;
    public final h20 g;
    public boolean g0;
    public k20 h;
    public final p20 h0;
    public final y1 i;
    public to i0;
    public final k6 j;
    public final ro j0;
    public final a5 k;
    public final n20 k0;
    public boolean l;
    public e20 l0;
    public final q10 m;
    public ArrayList m0;
    public final Rect n;
    public boolean n0;
    public final Rect o;
    public boolean o0;
    public final RectF p;
    public final s10 p0;
    public t10 q;
    public boolean q0;
    public b20 r;
    public s20 r0;
    public final ArrayList s;
    public final int[] s0;
    public final ArrayList t;
    public ey t0;
    public final ArrayList u;
    public final int[] u0;
    public ll v;
    public final int[] v0;
    public boolean w;
    public final int[] w0;
    public boolean x;
    public final ArrayList x0;
    public boolean y;
    public final q10 y0;
    public int z;
    public boolean z0;

    static {
        Class cls = Integer.TYPE;
        E0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        F0 = new r10(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2 */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        char c;
        boolean z;
        char c2;
        TypedArray typedArray;
        int i2;
        Constructor constructor;
        Object[] objArr;
        this.f = new j20(this);
        this.g = new h20(this);
        this.k = new a5(25);
        this.m = new q10(this, 0);
        this.n = new Rect();
        this.o = new Rect();
        this.p = new RectF();
        this.s = new ArrayList();
        this.t = new ArrayList();
        this.u = new ArrayList();
        this.z = 0;
        this.G = false;
        this.H = false;
        this.I = 0;
        this.J = 0;
        this.K = new w10();
        lg lgVar = new lg();
        lgVar.a = null;
        lgVar.b = new ArrayList();
        lgVar.c = 120L;
        lgVar.d = 120L;
        lgVar.e = 250L;
        lgVar.f = 250L;
        lgVar.g = true;
        lgVar.h = new ArrayList();
        lgVar.i = new ArrayList();
        lgVar.j = new ArrayList();
        lgVar.k = new ArrayList();
        lgVar.l = new ArrayList();
        lgVar.m = new ArrayList();
        lgVar.n = new ArrayList();
        lgVar.o = new ArrayList();
        lgVar.p = new ArrayList();
        lgVar.q = new ArrayList();
        lgVar.r = new ArrayList();
        this.P = lgVar;
        this.Q = 0;
        this.R = -1;
        this.e0 = Float.MIN_VALUE;
        this.f0 = Float.MIN_VALUE;
        this.g0 = true;
        this.h0 = new p20(this);
        this.j0 = new ro();
        n20 n20Var = new n20();
        n20Var.a = -1;
        n20Var.b = 0;
        n20Var.c = 0;
        n20Var.d = 1;
        n20Var.e = 0;
        n20Var.f = false;
        n20Var.g = false;
        n20Var.h = false;
        n20Var.i = false;
        n20Var.j = false;
        n20Var.k = false;
        this.k0 = n20Var;
        this.n0 = false;
        this.o0 = false;
        s10 s10Var = new s10(this);
        this.p0 = s10Var;
        this.q0 = false;
        this.s0 = new int[2];
        this.u0 = new int[2];
        this.v0 = new int[2];
        this.w0 = new int[2];
        this.x0 = new ArrayList();
        this.y0 = new q10(this, 1);
        this.A0 = 0;
        this.B0 = 0;
        this.C0 = new s10(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.a0 = viewConfiguration.getScaledTouchSlop();
        this.e0 = viewConfiguration.getScaledHorizontalScrollFactor();
        this.f0 = viewConfiguration.getScaledVerticalScrollFactor();
        this.c0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.d0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.P.a = s10Var;
        this.i = new y1(new s10(this));
        this.j = new k6(new s10(this));
        WeakHashMap weakHashMap = ic0.a;
        if (cc0.a(this) == 0) {
            cc0.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.F = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new s20(this));
        int[] iArr = x00.a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        ic0.l(this, context, iArr, attributeSet, obtainStyledAttributes, i);
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.l = obtainStyledAttributes.getBoolean(1, true);
        if (obtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                g9.i("Trying to set fast scroller without both required drawables.".concat(y()));
                throw null;
            }
            Resources resources = getContext().getResources();
            c = 3;
            c2 = 2;
            z = 1;
            typedArray = obtainStyledAttributes;
            i2 = 4;
            new ll(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.moontiko.really.admiralcasino.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.moontiko.really.admiralcasino.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.moontiko.really.admiralcasino.R.dimen.fastscroll_margin));
        } else {
            c = 3;
            z = 1;
            c2 = 2;
            typedArray = obtainStyledAttributes;
            i2 = 4;
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
                    Class asSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(b20.class);
                    try {
                        constructor = asSubclass.getConstructor(E0);
                        objArr = new Object[i2];
                        objArr[0] = context;
                        objArr[z] = attributeSet;
                        objArr[c2] = Integer.valueOf(i);
                        objArr[c] = 0;
                    } catch (NoSuchMethodException e) {
                        try {
                            constructor = asSubclass.getConstructor(null);
                            objArr = null;
                        } catch (NoSuchMethodException e2) {
                            e2.initCause(e);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e2);
                        }
                    }
                    constructor.setAccessible(z);
                    setLayoutManager((b20) constructor.newInstance(objArr));
                } catch (ClassCastException e3) {
                    g9.f(attributeSet.getPositionDescription(), ": Class is not a LayoutManager ", str, e3);
                    throw null;
                } catch (ClassNotFoundException e4) {
                    g9.f(attributeSet.getPositionDescription(), ": Unable to find LayoutManager ", str, e4);
                    throw null;
                } catch (IllegalAccessException e5) {
                    g9.f(attributeSet.getPositionDescription(), ": Cannot access non-public constructor ", str, e5);
                    throw null;
                } catch (InstantiationException e6) {
                    g9.f(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e6);
                    throw null;
                } catch (InvocationTargetException e7) {
                    g9.f(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e7);
                    throw null;
                }
            }
        }
        int[] iArr2 = D0;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        ic0.l(this, context, iArr2, attributeSet, obtainStyledAttributes2, i);
        boolean z2 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
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
            RecyclerView D = D(viewGroup.getChildAt(i));
            if (D != null) {
                return D;
            }
        }
        return null;
    }

    public static q20 I(View view) {
        if (view == null) {
            return null;
        }
        return ((c20) view.getLayoutParams()).a;
    }

    private ey getScrollingChildHelper() {
        if (this.t0 == null) {
            this.t0 = new ey(this);
        }
        return this.t0;
    }

    public static void j(q20 q20Var) {
        WeakReference weakReference = q20Var.b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == q20Var.a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            q20Var.b = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
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
        ArrayList arrayList = this.u;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ll llVar = (ll) arrayList.get(i);
            int i2 = llVar.v;
            if (i2 == 1) {
                boolean d = llVar.d(motionEvent.getX(), motionEvent.getY());
                boolean c = llVar.c(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0 && (d || c)) {
                    if (c) {
                        llVar.w = 1;
                        llVar.p = (int) motionEvent.getX();
                    } else if (d) {
                        llVar.w = 2;
                        llVar.m = (int) motionEvent.getY();
                    }
                    llVar.f(2);
                    if (action == 3) {
                        this.v = llVar;
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
        k6 k6Var = this.j;
        int m = k6Var.m();
        if (m == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < m; i3++) {
            q20 I = I(k6Var.l(i3));
            if (!I.o()) {
                int b = I.b();
                if (b < i) {
                    i = b;
                }
                if (b > i2) {
                    i2 = b;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public final q20 E(int i) {
        q20 q20Var = null;
        if (this.G) {
            return null;
        }
        k6 k6Var = this.j;
        int u = k6Var.u();
        for (int i2 = 0; i2 < u; i2++) {
            q20 I = I(k6Var.t(i2));
            if (I != null && !I.h() && F(I) == i) {
                if (!((ArrayList) k6Var.i).contains(I.a)) {
                    return I;
                }
                q20Var = I;
            }
        }
        return q20Var;
    }

    public final int F(q20 q20Var) {
        if ((q20Var.j & 524) == 0 && q20Var.e()) {
            int i = q20Var.c;
            ArrayList arrayList = (ArrayList) this.i.c;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                x1 x1Var = (x1) arrayList.get(i2);
                int i3 = x1Var.a;
                if (i3 != 1) {
                    if (i3 == 2) {
                        int i4 = x1Var.b;
                        if (i4 <= i) {
                            int i5 = x1Var.d;
                            if (i4 + i5 <= i) {
                                i -= i5;
                            }
                        } else {
                            continue;
                        }
                    } else if (i3 == 8) {
                        int i6 = x1Var.b;
                        if (i6 == i) {
                            i = x1Var.d;
                        } else {
                            if (i6 < i) {
                                i--;
                            }
                            if (x1Var.d <= i) {
                                i++;
                            }
                        }
                    }
                } else if (x1Var.b <= i) {
                    i += x1Var.d;
                }
            }
            return i;
        }
        return -1;
    }

    public final long G(q20 q20Var) {
        return this.q.b ? q20Var.e : q20Var.c;
    }

    public final q20 H(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return I(view);
        }
        g9.n("View ", view, " is not a direct child of ", this);
        return null;
    }

    public final Rect J(View view) {
        c20 c20Var = (c20) view.getLayoutParams();
        boolean z = c20Var.c;
        Rect rect = c20Var.b;
        if (!z || (this.k0.g && (c20Var.a.k() || c20Var.a.f()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.t;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.n;
            rect2.set(0, 0, 0, 0);
            ((y10) arrayList.get(i)).getClass();
            ((c20) view.getLayoutParams()).a.getClass();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        c20Var.c = false;
        return rect;
    }

    public final boolean K() {
        return !this.y || this.G || this.i.k();
    }

    public final boolean L() {
        return this.I > 0;
    }

    public final void M(int i) {
        if (this.r == null) {
            return;
        }
        setScrollState(2);
        this.r.o0(i);
        awakenScrollBars();
    }

    public final void N() {
        k6 k6Var = this.j;
        int u = k6Var.u();
        for (int i = 0; i < u; i++) {
            ((c20) k6Var.t(i).getLayoutParams()).c = true;
        }
        ArrayList arrayList = this.g.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            c20 c20Var = (c20) ((q20) arrayList.get(i2)).a.getLayoutParams();
            if (c20Var != null) {
                c20Var.c = true;
            }
        }
    }

    public final void O(int i, int i2, boolean z) {
        int i3 = i + i2;
        k6 k6Var = this.j;
        int u = k6Var.u();
        for (int i4 = 0; i4 < u; i4++) {
            q20 I = I(k6Var.t(i4));
            if (I != null && !I.o()) {
                int i5 = I.c;
                n20 n20Var = this.k0;
                if (i5 >= i3) {
                    I.l(-i2, z);
                    n20Var.f = true;
                } else if (i5 >= i) {
                    I.a(8);
                    I.l(-i2, z);
                    I.c = i - 1;
                    n20Var.f = true;
                }
            }
        }
        h20 h20Var = this.g;
        ArrayList arrayList = h20Var.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            q20 q20Var = (q20) arrayList.get(size);
            if (q20Var != null) {
                int i6 = q20Var.c;
                if (i6 >= i3) {
                    q20Var.l(-i2, z);
                } else if (i6 >= i) {
                    q20Var.a(8);
                    h20Var.f(size);
                }
            }
        }
        requestLayout();
    }

    public final void P() {
        this.I++;
    }

    public final void Q(boolean z) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.I - 1;
        this.I = i2;
        if (i2 < 1) {
            this.I = 0;
            if (z) {
                int i3 = this.D;
                this.D = 0;
                if (i3 != 0 && (accessibilityManager = this.F) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(obtain);
                }
                ArrayList arrayList = this.x0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    q20 q20Var = (q20) arrayList.get(size);
                    if (q20Var.a.getParent() == this && !q20Var.o() && (i = q20Var.q) != -1) {
                        View view = q20Var.a;
                        WeakHashMap weakHashMap = ic0.a;
                        view.setImportantForAccessibility(i);
                        q20Var.q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void R(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.R) {
            int i = actionIndex == 0 ? 1 : 0;
            this.R = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.V = x;
            this.T = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.W = y;
            this.U = y;
        }
    }

    public final void S() {
        if (this.q0 || !this.w) {
            return;
        }
        WeakHashMap weakHashMap = ic0.a;
        postOnAnimation(this.y0);
        this.q0 = true;
    }

    public final void T() {
        boolean z;
        boolean z2 = this.G;
        y1 y1Var = this.i;
        boolean z3 = false;
        if (z2) {
            y1Var.r((ArrayList) y1Var.c);
            y1Var.r((ArrayList) y1Var.d);
            y1Var.a = 0;
            if (this.H) {
                this.r.Y();
            }
        }
        if (this.P != null && this.r.A0()) {
            y1Var.q();
        } else {
            y1Var.d();
        }
        boolean z4 = this.n0 || this.o0;
        boolean z5 = this.y && this.P != null && ((z = this.G) || z4 || this.r.f) && (!z || this.q.b);
        n20 n20Var = this.k0;
        n20Var.j = z5;
        if (z5 && z4 && !this.G && this.P != null && this.r.A0()) {
            z3 = true;
        }
        n20Var.k = z3;
    }

    public final void U(q20 q20Var, hy hyVar) {
        q20Var.j &= -8193;
        boolean z = this.k0.h;
        a5 a5Var = this.k;
        if (z && q20Var.k() && !q20Var.h() && !q20Var.o()) {
            ((eu) a5Var.h).d(G(q20Var), q20Var);
        }
        w50 w50Var = (w50) a5Var.g;
        oc0 oc0Var = (oc0) w50Var.get(q20Var);
        if (oc0Var == null) {
            oc0Var = oc0.a();
            w50Var.put(q20Var, oc0Var);
        }
        oc0Var.b = hyVar;
        oc0Var.a |= 4;
    }

    public final void V(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.n;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof c20) {
            c20 c20Var = (c20) layoutParams;
            if (!c20Var.c) {
                Rect rect2 = c20Var.b;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.r.l0(this, view, this.n, !this.y, view2 == null);
    }

    public final void W() {
        VelocityTracker velocityTracker = this.S;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z = false;
        d0(0);
        EdgeEffect edgeEffect = this.L;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.L.isFinished();
        }
        EdgeEffect edgeEffect2 = this.M;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.M.isFinished();
        }
        EdgeEffect edgeEffect3 = this.N;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.N.isFinished();
        }
        EdgeEffect edgeEffect4 = this.O;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.O.isFinished();
        }
        if (z) {
            WeakHashMap weakHashMap = ic0.a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean X(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        boolean z2;
        m();
        t10 t10Var = this.q;
        int[] iArr = this.w0;
        if (t10Var != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            Y(i, i2, iArr);
            i4 = iArr[0];
            i5 = iArr[1];
            i6 = i - i4;
            i7 = i2 - i5;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (!this.t.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        s(i4, i5, i6, i7, this.u0, i3, iArr);
        int i8 = iArr[0];
        int i9 = i6 - i8;
        int i10 = iArr[1];
        int i11 = i7 - i10;
        boolean z3 = (i8 == 0 && i10 == 0) ? false : true;
        int i12 = this.V;
        int[] iArr2 = this.u0;
        int i13 = iArr2[0];
        this.V = i12 - i13;
        int i14 = this.W;
        int i15 = iArr2[1];
        this.W = i14 - i15;
        int[] iArr3 = this.v0;
        iArr3[0] = iArr3[0] + i13;
        iArr3[1] = iArr3[1] + i15;
        if (getOverScrollMode() != 2) {
            if (motionEvent == null || (motionEvent.getSource() & 8194) == 8194) {
                z = true;
            } else {
                float x = motionEvent.getX();
                float f = i9;
                float y = motionEvent.getY();
                float f2 = i11;
                if (f < 0.0f) {
                    v();
                    z = true;
                    this.L.onPull((-f) / getWidth(), 1.0f - (y / getHeight()));
                } else {
                    z = true;
                    if (f > 0.0f) {
                        w();
                        this.N.onPull(f / getWidth(), y / getHeight());
                    } else {
                        z2 = false;
                        if (f2 >= 0.0f) {
                            x();
                            this.M.onPull((-f2) / getHeight(), x / getWidth());
                        } else {
                            if (f2 > 0.0f) {
                                u();
                                this.O.onPull(f2 / getHeight(), 1.0f - (x / getWidth()));
                            }
                            if (!z2 || f != 0.0f || f2 != 0.0f) {
                                WeakHashMap weakHashMap = ic0.a;
                                postInvalidateOnAnimation();
                            }
                        }
                        z2 = z;
                        if (!z2) {
                        }
                        WeakHashMap weakHashMap2 = ic0.a;
                        postInvalidateOnAnimation();
                    }
                }
                z2 = z;
                if (f2 >= 0.0f) {
                }
                z2 = z;
                if (!z2) {
                }
                WeakHashMap weakHashMap22 = ic0.a;
                postInvalidateOnAnimation();
            }
            l(i, i2);
        } else {
            z = true;
        }
        if (i4 != 0 || i5 != 0) {
            t(i4, i5);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (!z3 && i4 == 0 && i5 == 0) {
            return false;
        }
        return z;
    }

    public final void Y(int i, int i2, int[] iArr) {
        q20 q20Var;
        b0();
        P();
        int i3 = v90.a;
        Trace.beginSection("RV Scroll");
        n20 n20Var = this.k0;
        z(n20Var);
        h20 h20Var = this.g;
        int n0 = i != 0 ? this.r.n0(i, h20Var, n20Var) : 0;
        int p0 = i2 != 0 ? this.r.p0(i2, h20Var, n20Var) : 0;
        Trace.endSection();
        k6 k6Var = this.j;
        int m = k6Var.m();
        for (int i4 = 0; i4 < m; i4++) {
            View l = k6Var.l(i4);
            q20 H = H(l);
            if (H != null && (q20Var = H.i) != null) {
                View view = q20Var.a;
                int left = l.getLeft();
                int top = l.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        Q(true);
        c0(false);
        if (iArr != null) {
            iArr[0] = n0;
            iArr[1] = p0;
        }
    }

    public final void Z(int i) {
        xs xsVar;
        if (this.B) {
            return;
        }
        setScrollState(0);
        p20 p20Var = this.h0;
        p20Var.l.removeCallbacks(p20Var);
        p20Var.h.abortAnimation();
        b20 b20Var = this.r;
        if (b20Var != null && (xsVar = b20Var.e) != null) {
            xsVar.i();
        }
        b20 b20Var2 = this.r;
        if (b20Var2 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            b20Var2.o0(i);
            awakenScrollBars();
        }
    }

    public final void a0(int i, int i2, boolean z) {
        b20 b20Var = this.r;
        if (b20Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.B) {
            return;
        }
        if (!b20Var.d()) {
            i = 0;
        }
        if (!this.r.e()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (z) {
            int i3 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i3 |= 2;
            }
            getScrollingChildHelper().g(i3, 1);
        }
        this.h0.b(i, i2, Integer.MIN_VALUE, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        b20 b20Var = this.r;
        if (b20Var != null) {
            b20Var.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    public final void b0() {
        int i = this.z + 1;
        this.z = i;
        if (i != 1 || this.B) {
            return;
        }
        this.A = false;
    }

    public final void c0(boolean z) {
        if (this.z < 1) {
            this.z = 1;
        }
        if (!z && !this.B) {
            this.A = false;
        }
        if (this.z == 1) {
            if (z && this.A && !this.B && this.r != null && this.q != null) {
                o();
            }
            if (!this.B) {
                this.A = false;
            }
        }
        this.z--;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof c20) && this.r.f((c20) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        b20 b20Var = this.r;
        if (b20Var != null && b20Var.d()) {
            return this.r.j(this.k0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        b20 b20Var = this.r;
        if (b20Var != null && b20Var.d()) {
            return this.r.k(this.k0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        b20 b20Var = this.r;
        if (b20Var != null && b20Var.d()) {
            return this.r.l(this.k0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        b20 b20Var = this.r;
        if (b20Var != null && b20Var.e()) {
            return this.r.m(this.k0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        b20 b20Var = this.r;
        if (b20Var != null && b20Var.e()) {
            return this.r.n(this.k0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        b20 b20Var = this.r;
        if (b20Var != null && b20Var.e()) {
            return this.r.o(this.k0);
        }
        return 0;
    }

    public final void d0(int i) {
        getScrollingChildHelper().h(i);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i2, 0, iArr, iArr2);
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
        boolean z;
        super.draw(canvas);
        ArrayList arrayList = this.t;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((y10) arrayList.get(i)).b(canvas, this);
        }
        EdgeEffect edgeEffect = this.L;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.l ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.L;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.M;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.l) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.M;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.N;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.l ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.N;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.O;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.l) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.O;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(save4);
        }
        if ((z || this.P == null || arrayList.size() <= 0 || !this.P.f()) ? z : true) {
            WeakHashMap weakHashMap = ic0.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final void f(q20 q20Var) {
        View view = q20Var.a;
        boolean z = view.getParent() == this;
        this.g.k(H(view));
        boolean j = q20Var.j();
        k6 k6Var = this.j;
        if (j) {
            k6Var.f(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            k6Var.a(view, -1, true);
            return;
        }
        int indexOfChild = ((s10) k6Var.g).a.indexOfChild(view);
        if (indexOfChild < 0) {
            g9.v(view, "view is not a child, cannot hide ");
        } else {
            ((ra) k6Var.h).i(indexOfChild);
            k6Var.x(view);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0186, code lost:
    
        if (r5 < 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x018e, code lost:
    
        if ((r5 * r6) <= 0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0196, code lost:
    
        if ((r5 * r6) >= 0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0160, code lost:
    
        if (r7 > 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0180, code lost:
    
        if (r5 > 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0183, code lost:
    
        if (r7 < 0) goto L136;
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
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00db  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View focusSearch(View view, int i) {
        View view2;
        int i2;
        char c;
        boolean z;
        this.r.getClass();
        boolean z2 = true;
        boolean z3 = (this.q == null || this.r == null || L() || this.B) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        n20 n20Var = this.k0;
        h20 h20Var = this.g;
        if (z3 && (i == 2 || i == 1)) {
            if (this.r.e()) {
                if (focusFinder.findNextFocus(this, view, i == 2 ? 130 : 33) == null) {
                    z = true;
                    if (!z && this.r.d()) {
                        z = focusFinder.findNextFocus(this, view, !((this.r.C() != 1) ^ (i != 2)) ? 66 : 17) != null;
                    }
                    if (z) {
                        m();
                        if (A(view) != null) {
                            b0();
                            this.r.T(view, i, h20Var, n20Var);
                            c0(false);
                        }
                        return null;
                    }
                    view2 = focusFinder.findNextFocus(this, view, i);
                    if (view2 == null) {
                    }
                    if (view2 != null) {
                        if (A(view2) != null) {
                        }
                        if (z2) {
                        }
                    }
                    z2 = false;
                    if (z2) {
                    }
                }
            }
            z = false;
            if (!z) {
                if (focusFinder.findNextFocus(this, view, !((this.r.C() != 1) ^ (i != 2)) ? 66 : 17) != null) {
                }
            }
            if (z) {
            }
            view2 = focusFinder.findNextFocus(this, view, i);
            if (view2 == null) {
            }
            if (view2 != null) {
            }
            z2 = false;
            if (z2) {
            }
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i);
            if (findNextFocus == null && z3) {
                m();
                if (A(view) != null) {
                    b0();
                    view2 = this.r.T(view, i, h20Var, n20Var);
                    c0(false);
                }
                return null;
            }
            view2 = findNextFocus;
            if (view2 == null && !view2.hasFocusable()) {
                if (getFocusedChild() == null) {
                    return super.focusSearch(view, i);
                }
                V(view2, null);
                return view;
            }
            if (view2 != null && view2 != this && view2 != view) {
                if (A(view2) != null) {
                    z2 = false;
                } else if (view != null && A(view) != null) {
                    int width = view.getWidth();
                    int height = view.getHeight();
                    Rect rect = this.n;
                    rect.set(0, 0, width, height);
                    int width2 = view2.getWidth();
                    int height2 = view2.getHeight();
                    Rect rect2 = this.o;
                    rect2.set(0, 0, width2, height2);
                    offsetDescendantRectToMyCoords(view, rect);
                    offsetDescendantRectToMyCoords(view2, rect2);
                    int i3 = this.r.C() == 1 ? -1 : 1;
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
                        c = 1;
                    } else {
                        int i10 = rect.bottom;
                        int i11 = rect2.bottom;
                        c = ((i10 > i11 || i8 >= i11) && i8 > i9) ? (char) 65535 : (char) 0;
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
                        } else if (c <= 0) {
                            if (c == 0) {
                            }
                        }
                    } else if (c >= 0) {
                        if (c == 0) {
                        }
                    }
                }
                return z2 ? view2 : super.focusSearch(view, i);
            }
            z2 = false;
            if (z2) {
            }
        }
    }

    public final void g(y10 y10Var) {
        b20 b20Var = this.r;
        if (b20Var != null) {
            b20Var.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.t;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(y10Var);
        N();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        b20 b20Var = this.r;
        if (b20Var != null) {
            return b20Var.r();
        }
        g9.s("RecyclerView has no LayoutManager".concat(y()));
        return null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        b20 b20Var = this.r;
        if (b20Var != null) {
            return b20Var.s(getContext(), attributeSet);
        }
        g9.s("RecyclerView has no LayoutManager".concat(y()));
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public t10 getAdapter() {
        return this.q;
    }

    @Override // android.view.View
    public int getBaseline() {
        b20 b20Var = this.r;
        if (b20Var == null) {
            return super.getBaseline();
        }
        b20Var.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.l;
    }

    public s20 getCompatAccessibilityDelegate() {
        return this.r0;
    }

    public w10 getEdgeEffectFactory() {
        return this.K;
    }

    public x10 getItemAnimator() {
        return this.P;
    }

    public int getItemDecorationCount() {
        return this.t.size();
    }

    public b20 getLayoutManager() {
        return this.r;
    }

    public int getMaxFlingVelocity() {
        return this.d0;
    }

    public int getMinFlingVelocity() {
        return this.c0;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public d20 getOnFlingListener() {
        return this.b0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.g0;
    }

    public g20 getRecycledViewPool() {
        return this.g.c();
    }

    public int getScrollState() {
        return this.Q;
    }

    public final void h(e20 e20Var) {
        if (this.m0 == null) {
            this.m0 = new ArrayList();
        }
        this.m0.add(e20Var);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(String str) {
        if (!L()) {
            if (this.J > 0) {
                Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(y()));
            }
        } else if (str == null) {
            g9.s("Cannot call this method while RecyclerView is computing a layout or scrolling".concat(y()));
        } else {
            g9.s(str);
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.w;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.B;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    public final void k() {
        k6 k6Var = this.j;
        int u = k6Var.u();
        for (int i = 0; i < u; i++) {
            q20 I = I(k6Var.t(i));
            if (!I.o()) {
                I.d = -1;
                I.g = -1;
            }
        }
        h20 h20Var = this.g;
        ArrayList arrayList = h20Var.a;
        ArrayList arrayList2 = h20Var.c;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            q20 q20Var = (q20) arrayList2.get(i2);
            q20Var.d = -1;
            q20Var.g = -1;
        }
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            q20 q20Var2 = (q20) arrayList.get(i3);
            q20Var2.d = -1;
            q20Var2.g = -1;
        }
        ArrayList arrayList3 = h20Var.b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                q20 q20Var3 = (q20) h20Var.b.get(i4);
                q20Var3.d = -1;
                q20Var3.g = -1;
            }
        }
    }

    public final void l(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.L;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.L.onRelease();
            z = this.L.isFinished();
        }
        EdgeEffect edgeEffect2 = this.N;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.N.onRelease();
            z |= this.N.isFinished();
        }
        EdgeEffect edgeEffect3 = this.M;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.M.onRelease();
            z |= this.M.isFinished();
        }
        EdgeEffect edgeEffect4 = this.O;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.O.onRelease();
            z |= this.O.isFinished();
        }
        if (z) {
            WeakHashMap weakHashMap = ic0.a;
            postInvalidateOnAnimation();
        }
    }

    public final void m() {
        if (!this.y || this.G) {
            int i = v90.a;
            Trace.beginSection("RV FullInvalidate");
            o();
            Trace.endSection();
            return;
        }
        y1 y1Var = this.i;
        if (y1Var.k()) {
            int i2 = y1Var.a;
            if ((i2 & 4) == 0 || (i2 & 11) != 0) {
                if (y1Var.k()) {
                    int i3 = v90.a;
                    Trace.beginSection("RV FullInvalidate");
                    o();
                    Trace.endSection();
                    return;
                }
                return;
            }
            int i4 = v90.a;
            Trace.beginSection("RV PartialInvalidate");
            b0();
            P();
            y1Var.q();
            if (!this.A) {
                k6 k6Var = this.j;
                int m = k6Var.m();
                int i5 = 0;
                while (true) {
                    if (i5 < m) {
                        q20 I = I(k6Var.l(i5));
                        if (I != null && !I.o() && I.k()) {
                            o();
                            break;
                        }
                        i5++;
                    } else {
                        y1Var.c();
                        break;
                    }
                }
            }
            c0(true);
            Q(true);
            Trace.endSection();
        }
    }

    public final void n(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = ic0.a;
        setMeasuredDimension(b20.g(i, paddingRight, getMinimumWidth()), b20.g(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x035a, code lost:
    
        if (((java.util.ArrayList) r7.i).contains(getFocusedChild()) == false) goto L227;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o() {
        boolean z;
        q20 q20Var;
        View findViewById;
        boolean z2;
        w50 w50Var;
        hy hyVar;
        boolean g;
        boolean z3;
        if (this.q == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.r == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        n20 n20Var = this.k0;
        boolean z4 = false;
        n20Var.i = false;
        boolean z5 = true;
        Object[] objArr = this.z0 && !(this.A0 == getWidth() && this.B0 == getHeight());
        this.A0 = 0;
        this.B0 = 0;
        this.z0 = false;
        if (n20Var.d == 1) {
            p();
            this.r.q0(this);
            q();
        } else {
            y1 y1Var = this.i;
            if ((((ArrayList) y1Var.d).isEmpty() || ((ArrayList) y1Var.c).isEmpty()) && !objArr == true && this.r.n == getWidth() && this.r.o == getHeight()) {
                this.r.q0(this);
            } else {
                this.r.q0(this);
                q();
            }
        }
        n20Var.a(4);
        b0();
        P();
        n20Var.d = 1;
        boolean z6 = n20Var.j;
        k6 k6Var = this.j;
        h20 h20Var = this.g;
        a5 a5Var = this.k;
        if (z6) {
            int m = k6Var.m() - 1;
            while (m >= 0) {
                q20 I = I(k6Var.l(m));
                if (I.o()) {
                    z3 = z5;
                } else {
                    long G = G(I);
                    this.P.getClass();
                    hy hyVar2 = new hy();
                    hyVar2.a(I);
                    eu euVar = (eu) a5Var.h;
                    z3 = z5;
                    w50 w50Var2 = (w50) a5Var.g;
                    q20 q20Var2 = (q20) euVar.b(G);
                    if (q20Var2 == null || q20Var2.o()) {
                        a5Var.h(I, hyVar2);
                    } else {
                        oc0 oc0Var = (oc0) w50Var2.get(q20Var2);
                        boolean z7 = (oc0Var == null || (oc0Var.a & 1) == 0) ? z4 : z3;
                        oc0 oc0Var2 = (oc0) w50Var2.get(I);
                        boolean z8 = (oc0Var2 == null || (oc0Var2.a & 1) == 0) ? z4 : z3;
                        if (z7 && q20Var2 == I) {
                            a5Var.h(I, hyVar2);
                        } else {
                            hy O = a5Var.O(q20Var2, 4);
                            a5Var.h(I, hyVar2);
                            hy O2 = a5Var.O(I, 8);
                            if (O == null) {
                                int m2 = k6Var.m();
                                for (int i = 0; i < m2; i++) {
                                    q20 I2 = I(k6Var.l(i));
                                    if (I2 != I && G(I2) == G) {
                                        t10 t10Var = this.q;
                                        if (t10Var == null || !t10Var.b) {
                                            throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + I2 + " \n View Holder 2:" + I + y());
                                        }
                                        throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + I2 + " \n View Holder 2:" + I + y());
                                    }
                                }
                                Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + q20Var2 + " cannot be found but it is necessary for " + I + y());
                            } else {
                                q20Var2.n(false);
                                if (z7) {
                                    f(q20Var2);
                                }
                                if (q20Var2 != I) {
                                    if (z8) {
                                        f(I);
                                    }
                                    q20Var2.h = I;
                                    f(q20Var2);
                                    h20Var.k(q20Var2);
                                    I.n(false);
                                    I.i = q20Var2;
                                }
                                if (this.P.a(q20Var2, I, O, O2)) {
                                    S();
                                }
                            }
                        }
                    }
                }
                m--;
                z5 = z3;
                z4 = false;
            }
            z = z5;
            w50 w50Var3 = (w50) a5Var.g;
            int i2 = w50Var3.h - 1;
            while (i2 >= 0) {
                q20 q20Var3 = (q20) w50Var3.f(i2);
                oc0 oc0Var3 = (oc0) w50Var3.g(i2);
                int i3 = oc0Var3.a;
                int i4 = i3 & 3;
                s10 s10Var = this.C0;
                if (i4 == 3) {
                    RecyclerView recyclerView = s10Var.a;
                    recyclerView.r.j0(q20Var3.a, recyclerView.g);
                } else if ((i3 & 1) != 0) {
                    hy hyVar3 = oc0Var3.b;
                    if (hyVar3 == null) {
                        RecyclerView recyclerView2 = s10Var.a;
                        recyclerView2.r.j0(q20Var3.a, recyclerView2.g);
                    } else {
                        s10Var.g(q20Var3, hyVar3, oc0Var3.c);
                    }
                } else if ((i3 & 14) == 14) {
                    s10Var.f(q20Var3, oc0Var3.b, oc0Var3.c);
                } else if ((i3 & 12) == 12) {
                    hy hyVar4 = oc0Var3.b;
                    hy hyVar5 = oc0Var3.c;
                    s10Var.getClass();
                    q20Var3.n(false);
                    RecyclerView recyclerView3 = s10Var.a;
                    boolean z9 = recyclerView3.G;
                    x10 x10Var = recyclerView3.P;
                    if (!z9) {
                        lg lgVar = (lg) x10Var;
                        lgVar.getClass();
                        int i5 = hyVar4.a;
                        int i6 = hyVar5.a;
                        if (i5 == i6) {
                            w50Var = w50Var3;
                            if (hyVar4.b == hyVar5.b) {
                                lgVar.c(q20Var3);
                                g = false;
                                if (g) {
                                    recyclerView3.S();
                                }
                                hyVar = null;
                                oc0Var3.a = 0;
                                oc0Var3.b = hyVar;
                                oc0Var3.c = hyVar;
                                oc0.d.c(oc0Var3);
                                i2--;
                                w50Var3 = w50Var;
                            }
                        } else {
                            w50Var = w50Var3;
                        }
                        g = lgVar.g(q20Var3, i5, hyVar4.b, i6, hyVar5.b);
                        if (g) {
                        }
                        hyVar = null;
                        oc0Var3.a = 0;
                        oc0Var3.b = hyVar;
                        oc0Var3.c = hyVar;
                        oc0.d.c(oc0Var3);
                        i2--;
                        w50Var3 = w50Var;
                    } else if (x10Var.a(q20Var3, q20Var3, hyVar4, hyVar5)) {
                        recyclerView3.S();
                    }
                } else {
                    w50Var = w50Var3;
                    if ((i3 & 4) != 0) {
                        hyVar = null;
                        s10Var.g(q20Var3, oc0Var3.b, null);
                    } else {
                        hyVar = null;
                        if ((i3 & 8) != 0) {
                            s10Var.f(q20Var3, oc0Var3.b, oc0Var3.c);
                        }
                    }
                    oc0Var3.a = 0;
                    oc0Var3.b = hyVar;
                    oc0Var3.c = hyVar;
                    oc0.d.c(oc0Var3);
                    i2--;
                    w50Var3 = w50Var;
                }
                w50Var = w50Var3;
                hyVar = null;
                oc0Var3.a = 0;
                oc0Var3.b = hyVar;
                oc0Var3.c = hyVar;
                oc0.d.c(oc0Var3);
                i2--;
                w50Var3 = w50Var;
            }
        } else {
            z = true;
        }
        View view = null;
        this.r.i0(h20Var);
        n20Var.b = n20Var.e;
        this.G = false;
        this.H = false;
        n20Var.j = false;
        n20Var.k = false;
        this.r.f = false;
        ArrayList arrayList = h20Var.b;
        if (arrayList != null) {
            arrayList.clear();
        }
        b20 b20Var = this.r;
        if (b20Var.k) {
            b20Var.j = 0;
            b20Var.k = false;
            h20Var.l();
        }
        this.r.d0(n20Var);
        boolean z10 = z;
        Q(z10);
        c0(false);
        ((w50) a5Var.g).clear();
        ((eu) a5Var.h).a();
        int[] iArr = this.s0;
        int i7 = iArr[0];
        int i8 = iArr[z10 ? 1 : 0];
        C(iArr);
        if ((iArr[0] == i7 && iArr[z10 ? 1 : 0] == i8) ? false : true) {
            t(0, 0);
        }
        if (this.g0 && this.q != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (!isFocused()) {
            }
            long j = n20Var.m;
            if (j != -1 && (z2 = this.q.b) && z2) {
                int u = k6Var.u();
                q20Var = null;
                int i9 = 0;
                while (true) {
                    if (i9 >= u) {
                        break;
                    }
                    q20 I3 = I(k6Var.t(i9));
                    if (I3 != null && !I3.h() && I3.e == j) {
                        if (!((ArrayList) k6Var.i).contains(I3.a)) {
                            q20Var = I3;
                            break;
                        }
                        q20Var = I3;
                    }
                    i9++;
                }
            } else {
                q20Var = null;
            }
            if (q20Var != null) {
                View view2 = q20Var.a;
                if (!((ArrayList) k6Var.i).contains(view2) && view2.hasFocusable()) {
                    view = view2;
                    if (view != null) {
                        int i10 = n20Var.n;
                        if (i10 != -1 && (findViewById = view.findViewById(i10)) != null && findViewById.isFocusable()) {
                            view = findViewById;
                        }
                        view.requestFocus();
                    }
                }
            }
            if (k6Var.m() > 0) {
                int i11 = n20Var.l;
                if (i11 == -1) {
                    i11 = 0;
                }
                int b = n20Var.b();
                for (int i12 = i11; i12 < b; i12++) {
                    q20 E = E(i12);
                    if (E == null) {
                        break;
                    }
                    View view3 = E.a;
                    if (view3.hasFocusable()) {
                        view = view3;
                        break;
                    }
                }
                int min = Math.min(b, i11) - 1;
                while (true) {
                    if (min < 0) {
                        break;
                    }
                    q20 E2 = E(min);
                    if (E2 == null) {
                        break;
                    }
                    View view4 = E2.a;
                    if (view4.hasFocusable()) {
                        view = view4;
                        break;
                    }
                    min--;
                }
            }
            if (view != null) {
            }
        }
        n20Var.m = -1L;
        n20Var.l = -1;
        n20Var.n = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        if (r1 >= 30.0f) goto L20;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAttachedToWindow() {
        float f;
        super.onAttachedToWindow();
        this.I = 0;
        this.w = true;
        this.y = this.y && !isLayoutRequested();
        b20 b20Var = this.r;
        if (b20Var != null) {
            b20Var.g = true;
            b20Var.R(this);
        }
        this.q0 = false;
        ThreadLocal threadLocal = to.j;
        to toVar = (to) threadLocal.get();
        this.i0 = toVar;
        if (toVar == null) {
            to toVar2 = new to();
            toVar2.f = new ArrayList();
            toVar2.i = new ArrayList();
            this.i0 = toVar2;
            WeakHashMap weakHashMap = ic0.a;
            Display display = getDisplay();
            if (!isInEditMode() && display != null) {
                f = display.getRefreshRate();
            }
            f = 60.0f;
            to toVar3 = this.i0;
            toVar3.h = (long) (1.0E9f / f);
            threadLocal.set(toVar3);
        }
        this.i0.f.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        xs xsVar;
        super.onDetachedFromWindow();
        x10 x10Var = this.P;
        if (x10Var != null) {
            x10Var.e();
        }
        setScrollState(0);
        p20 p20Var = this.h0;
        p20Var.l.removeCallbacks(p20Var);
        p20Var.h.abortAnimation();
        b20 b20Var = this.r;
        if (b20Var != null && (xsVar = b20Var.e) != null) {
            xsVar.i();
        }
        this.w = false;
        b20 b20Var2 = this.r;
        if (b20Var2 != null) {
            b20Var2.g = false;
            b20Var2.S(this);
        }
        this.x0.clear();
        removeCallbacks(this.y0);
        this.k.getClass();
        while (oc0.d.a() != null) {
        }
        to toVar = this.i0;
        if (toVar != null) {
            toVar.f.remove(this);
            this.i0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.t;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((y10) arrayList.get(i)).a(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        b20 b20Var;
        if (this.r != null && !this.B && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f = this.r.e() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.r.d()) {
                    f2 = motionEvent.getAxisValue(10);
                    if (f == 0.0f || f2 != 0.0f) {
                        int i = (int) (f2 * this.e0);
                        int i2 = (int) (f * this.f0);
                        b20Var = this.r;
                        if (b20Var == null) {
                            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                            return false;
                        }
                        if (!this.B) {
                            int[] iArr = this.w0;
                            iArr[0] = 0;
                            iArr[1] = 0;
                            boolean d = b20Var.d();
                            boolean e = this.r.e();
                            getScrollingChildHelper().g(e ? (d ? 1 : 0) | 2 : d ? 1 : 0, 1);
                            if (r(d ? i : 0, e ? i2 : 0, 1, this.w0, this.u0)) {
                                i -= iArr[0];
                                i2 -= iArr[1];
                            }
                            X(d ? i : 0, e ? i2 : 0, motionEvent, 1);
                            to toVar = this.i0;
                            if (toVar != null && (i != 0 || i2 != 0)) {
                                toVar.a(this, i, i2);
                            }
                            d0(1);
                        }
                    }
                }
                f2 = 0.0f;
                if (f == 0.0f) {
                }
                int i3 = (int) (f2 * this.e0);
                int i22 = (int) (f * this.f0);
                b20Var = this.r;
                if (b20Var == null) {
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.r.e()) {
                        f = -axisValue;
                        f2 = 0.0f;
                        if (f == 0.0f) {
                        }
                        int i32 = (int) (f2 * this.e0);
                        int i222 = (int) (f * this.f0);
                        b20Var = this.r;
                        if (b20Var == null) {
                        }
                    } else if (this.r.d()) {
                        f2 = axisValue;
                        f = 0.0f;
                        if (f == 0.0f) {
                        }
                        int i322 = (int) (f2 * this.e0);
                        int i2222 = (int) (f * this.f0);
                        b20Var = this.r;
                        if (b20Var == null) {
                        }
                    }
                }
                f = 0.0f;
                f2 = 0.0f;
                if (f == 0.0f) {
                }
                int i3222 = (int) (f2 * this.e0);
                int i22222 = (int) (f * this.f0);
                b20Var = this.r;
                if (b20Var == null) {
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (!this.B) {
            this.v = null;
            if (B(motionEvent)) {
                W();
                setScrollState(0);
                return true;
            }
            b20 b20Var = this.r;
            if (b20Var != null) {
                boolean d = b20Var.d();
                boolean e = this.r.e();
                if (this.S == null) {
                    this.S = VelocityTracker.obtain();
                }
                this.S.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.C) {
                        this.C = false;
                    }
                    this.R = motionEvent.getPointerId(0);
                    int x = (int) (motionEvent.getX() + 0.5f);
                    this.V = x;
                    this.T = x;
                    int y = (int) (motionEvent.getY() + 0.5f);
                    this.W = y;
                    this.U = y;
                    if (this.Q == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        d0(1);
                    }
                    int[] iArr = this.v0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i = d;
                    if (e) {
                        i = (d ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i, 0);
                } else if (actionMasked == 1) {
                    this.S.clear();
                    d0(0);
                } else if (actionMasked == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.R);
                    if (findPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.R + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.Q != 1) {
                        int i2 = x2 - this.T;
                        int i3 = y2 - this.U;
                        if (d == 0 || Math.abs(i2) <= this.a0) {
                            z = false;
                        } else {
                            this.V = x2;
                            z = true;
                        }
                        if (e && Math.abs(i3) > this.a0) {
                            this.W = y2;
                            z = true;
                        }
                        if (z) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    W();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.R = motionEvent.getPointerId(actionIndex);
                    int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.V = x3;
                    this.T = x3;
                    int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.W = y3;
                    this.U = y3;
                } else if (actionMasked == 6) {
                    R(motionEvent);
                }
                if (this.Q == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = v90.a;
        Trace.beginSection("RV OnLayout");
        o();
        Trace.endSection();
        this.y = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        b20 b20Var = this.r;
        if (b20Var == null) {
            n(i, i2);
            return;
        }
        boolean L = b20Var.L();
        boolean z = false;
        n20 n20Var = this.k0;
        if (L) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.r.b.n(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.z0 = z;
            if (z || this.q == null) {
                return;
            }
            if (n20Var.d == 1) {
                p();
            }
            this.r.r0(i, i2);
            n20Var.i = true;
            q();
            this.r.t0(i, i2);
            if (this.r.w0()) {
                this.r.r0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                n20Var.i = true;
                q();
                this.r.t0(i, i2);
            }
            this.A0 = getMeasuredWidth();
            this.B0 = getMeasuredHeight();
            return;
        }
        if (this.x) {
            this.r.b.n(i, i2);
            return;
        }
        if (this.E) {
            b0();
            P();
            T();
            Q(true);
            if (n20Var.k) {
                n20Var.g = true;
            } else {
                this.i.d();
                n20Var.g = false;
            }
            this.E = false;
            c0(false);
        } else if (n20Var.k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        t10 t10Var = this.q;
        if (t10Var != null) {
            n20Var.e = t10Var.a();
        } else {
            n20Var.e = 0;
        }
        b0();
        this.r.b.n(i, i2);
        c0(false);
        n20Var.g = false;
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
        if (!(parcelable instanceof k20)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        k20 k20Var = (k20) parcelable;
        this.h = k20Var;
        super.onRestoreInstanceState(k20Var.f);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        k20 k20Var = new k20(super.onSaveInstanceState());
        k20 k20Var2 = this.h;
        if (k20Var2 != null) {
            k20Var.h = k20Var2.h;
            return k20Var;
        }
        b20 b20Var = this.r;
        if (b20Var != null) {
            k20Var.h = b20Var.f0();
            return k20Var;
        }
        k20Var.h = null;
        return k20Var;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.O = null;
        this.M = null;
        this.N = null;
        this.L = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:197:0x0402, code lost:
    
        if (r2 < r5) goto L196;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x020d  */
    /* JADX WARN: Type inference failed for: r9v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v26 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int i;
        int minFlingVelocity;
        boolean z2;
        rz rzVar;
        float f;
        int H;
        PointF a;
        int i2;
        int i3;
        boolean z3;
        if (!this.B && !this.C) {
            ll llVar = this.v;
            if (llVar == null) {
                z = motionEvent.getAction() == 0 ? false : B(motionEvent);
            } else {
                int i4 = llVar.b;
                if (llVar.v != 0) {
                    if (motionEvent.getAction() == 0) {
                        boolean d = llVar.d(motionEvent.getX(), motionEvent.getY());
                        boolean c = llVar.c(motionEvent.getX(), motionEvent.getY());
                        if (d || c) {
                            if (c) {
                                llVar.w = 1;
                                llVar.p = (int) motionEvent.getX();
                            } else if (d) {
                                llVar.w = 2;
                                llVar.m = (int) motionEvent.getY();
                            }
                            llVar.f(2);
                        }
                    } else if (motionEvent.getAction() == 1 && llVar.v == 2) {
                        llVar.m = 0.0f;
                        llVar.p = 0.0f;
                        llVar.f(1);
                        llVar.w = 0;
                    } else if (motionEvent.getAction() == 2 && llVar.v == 2) {
                        llVar.g();
                        if (llVar.w == 1) {
                            float x = motionEvent.getX();
                            int[] iArr = llVar.y;
                            iArr[0] = i4;
                            int i5 = llVar.q - i4;
                            iArr[1] = i5;
                            float max = Math.max(i4, Math.min(i5, x));
                            if (Math.abs(llVar.o - max) >= 2.0f) {
                                int e = ll.e(llVar.p, max, iArr, llVar.s.computeHorizontalScrollRange(), llVar.s.computeHorizontalScrollOffset(), llVar.q);
                                if (e != 0) {
                                    llVar.s.scrollBy(e, 0);
                                }
                                llVar.p = max;
                            }
                        }
                        if (llVar.w == 2) {
                            float y = motionEvent.getY();
                            int[] iArr2 = llVar.x;
                            iArr2[0] = i4;
                            int i6 = llVar.r - i4;
                            iArr2[1] = i6;
                            float max2 = Math.max(i4, Math.min(i6, y));
                            if (Math.abs(llVar.l - max2) >= 2.0f) {
                                int e2 = ll.e(llVar.m, max2, iArr2, llVar.s.computeVerticalScrollRange(), llVar.s.computeVerticalScrollOffset(), llVar.r);
                                if (e2 != 0) {
                                    llVar.s.scrollBy(0, e2);
                                }
                                llVar.m = max2;
                            }
                        }
                    }
                }
                int action = motionEvent.getAction();
                if (action == 3 || action == 1) {
                    this.v = null;
                }
                z = true;
            }
            if (z) {
                W();
                setScrollState(0);
                return true;
            }
            b20 b20Var = this.r;
            if (b20Var != null) {
                boolean d2 = b20Var.d();
                boolean e3 = this.r.e();
                if (this.S == null) {
                    this.S = VelocityTracker.obtain();
                }
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                int[] iArr3 = this.v0;
                if (actionMasked == 0) {
                    iArr3[1] = 0;
                    iArr3[0] = 0;
                }
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.offsetLocation(iArr3[0], iArr3[1]);
                if (actionMasked == 0) {
                    this.R = motionEvent.getPointerId(0);
                    int x2 = (int) (motionEvent.getX() + 0.5f);
                    this.V = x2;
                    this.T = x2;
                    int y2 = (int) (motionEvent.getY() + 0.5f);
                    this.W = y2;
                    this.U = y2;
                    int i7 = d2;
                    if (e3) {
                        i7 = (d2 ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i7, 0);
                } else {
                    if (actionMasked == 1) {
                        this.S.addMovement(obtain);
                        VelocityTracker velocityTracker = this.S;
                        int i8 = this.d0;
                        velocityTracker.computeCurrentVelocity(1000, i8);
                        float f2 = d2 != 0 ? -this.S.getXVelocity(this.R) : 0.0f;
                        float f3 = e3 ? -this.S.getYVelocity(this.R) : 0.0f;
                        if (f2 == 0.0f && f3 == 0.0f) {
                            i3 = 0;
                        } else {
                            int i9 = (int) f2;
                            int i10 = (int) f3;
                            b20 b20Var2 = this.r;
                            if (b20Var2 == null) {
                                Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                            } else if (!this.B) {
                                int d3 = b20Var2.d();
                                boolean e4 = this.r.e();
                                int i11 = this.c0;
                                if (d3 == 0 || Math.abs(i9) < i11) {
                                    i9 = 0;
                                }
                                if (!e4 || Math.abs(i10) < i11) {
                                    i10 = 0;
                                }
                                if (i9 != 0 || i10 != 0) {
                                    float f4 = i9;
                                    float f5 = i10;
                                    if (!dispatchNestedPreFling(f4, f5)) {
                                        boolean z4 = d3 != 0 || e4;
                                        dispatchNestedFling(f4, f5, z4);
                                        d20 d20Var = this.b0;
                                        if (d20Var != null) {
                                            sz szVar = (sz) d20Var;
                                            b20 layoutManager = szVar.a.getLayoutManager();
                                            if (layoutManager != 0 && szVar.a.getAdapter() != null && ((Math.abs(i10) > (minFlingVelocity = szVar.a.getMinFlingVelocity()) || Math.abs(i9) > minFlingVelocity) && ((z2 = layoutManager instanceof m20)))) {
                                                if (z2) {
                                                    f = 0.0f;
                                                    rzVar = new rz(szVar, szVar.a.getContext());
                                                } else {
                                                    f = 0.0f;
                                                    rzVar = null;
                                                }
                                                if (rzVar != null) {
                                                    int B = layoutManager.B();
                                                    if (B != 0) {
                                                        ij e5 = layoutManager.e() ? szVar.e(layoutManager) : layoutManager.d() ? szVar.d(layoutManager) : null;
                                                        if (e5 != null) {
                                                            int v = layoutManager.v();
                                                            int i12 = Integer.MIN_VALUE;
                                                            int i13 = Integer.MAX_VALUE;
                                                            View view = null;
                                                            View view2 = null;
                                                            i = 1;
                                                            int i14 = 0;
                                                            while (i14 < v) {
                                                                int i15 = v;
                                                                View u = layoutManager.u(i14);
                                                                if (u == null) {
                                                                    i2 = i14;
                                                                } else {
                                                                    i2 = i14;
                                                                    int b = sz.b(u, e5);
                                                                    if (b <= 0 && b > i12) {
                                                                        view2 = u;
                                                                        i12 = b;
                                                                    }
                                                                    if (b >= 0 && b < i13) {
                                                                        view = u;
                                                                        i13 = b;
                                                                    }
                                                                }
                                                                i14 = i2 + 1;
                                                                v = i15;
                                                            }
                                                            boolean z5 = !layoutManager.d() ? i10 <= 0 : i9 <= 0;
                                                            if (z5 && view != null) {
                                                                H = b20.H(view);
                                                            } else if (z5 || view2 == null) {
                                                                if (z5) {
                                                                    view = view2;
                                                                }
                                                                if (view != null) {
                                                                    H = ((z2 && (a = ((m20) layoutManager).a(layoutManager.B() + (-1))) != null && ((a.x > f ? 1 : (a.x == f ? 0 : -1)) < 0 || (a.y > f ? 1 : (a.y == f ? 0 : -1)) < 0)) == z5 ? -1 : 1) + b20.H(view);
                                                                    if (H >= 0) {
                                                                    }
                                                                }
                                                                H = -1;
                                                            } else {
                                                                H = b20.H(view2);
                                                            }
                                                            if (H != -1) {
                                                                rzVar.a = H;
                                                                layoutManager.z0(rzVar);
                                                                W();
                                                                obtain.recycle();
                                                                return true;
                                                            }
                                                            if (z4) {
                                                                if (e4) {
                                                                    d3 = (d3 == true ? 1 : 0) | 2;
                                                                }
                                                                getScrollingChildHelper().g(d3, i);
                                                                int i16 = -i8;
                                                                int max3 = Math.max(i16, Math.min(i9, i8));
                                                                int max4 = Math.max(i16, Math.min(i10, i8));
                                                                p20 p20Var = this.h0;
                                                                RecyclerView recyclerView = p20Var.l;
                                                                recyclerView.setScrollState(2);
                                                                p20Var.g = 0;
                                                                p20Var.f = 0;
                                                                Interpolator interpolator = p20Var.i;
                                                                r10 r10Var = F0;
                                                                if (interpolator != r10Var) {
                                                                    p20Var.i = r10Var;
                                                                    p20Var.h = new OverScroller(recyclerView.getContext(), r10Var);
                                                                }
                                                                p20Var.h.fling(0, 0, max3, max4, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                                                p20Var.a();
                                                                W();
                                                                obtain.recycle();
                                                                return true;
                                                            }
                                                        }
                                                    }
                                                    i = 1;
                                                    H = -1;
                                                    if (H != -1) {
                                                    }
                                                    if (z4) {
                                                    }
                                                }
                                            }
                                        }
                                        i = 1;
                                        if (z4) {
                                        }
                                    }
                                }
                            }
                            i3 = 0;
                        }
                        setScrollState(i3);
                        W();
                        obtain.recycle();
                        return true;
                    }
                    if (actionMasked == 2) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.R);
                        if (findPointerIndex < 0) {
                            Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.R + " not found. Did any MotionEvents get skipped?");
                            return false;
                        }
                        int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                        int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                        int i17 = this.V - x3;
                        int i18 = this.W - y3;
                        if (this.Q != 1) {
                            if (d2 != 0) {
                                int i19 = this.a0;
                                i17 = i17 > 0 ? Math.max(0, i17 - i19) : Math.min(0, i17 + i19);
                                if (i17 != 0) {
                                    z3 = true;
                                    if (e3) {
                                        int i20 = this.a0;
                                        i18 = i18 > 0 ? Math.max(0, i18 - i20) : Math.min(0, i18 + i20);
                                        if (i18 != 0) {
                                            z3 = true;
                                        }
                                    }
                                    if (z3) {
                                        setScrollState(1);
                                    }
                                }
                            }
                            z3 = false;
                            if (e3) {
                            }
                            if (z3) {
                            }
                        }
                        int i21 = i17;
                        int i22 = i18;
                        if (this.Q == 1) {
                            int[] iArr4 = this.w0;
                            iArr4[0] = 0;
                            iArr4[1] = 0;
                            boolean r = r(d2 != 0 ? i21 : 0, e3 ? i22 : 0, 0, iArr4, this.u0);
                            int[] iArr5 = this.u0;
                            if (r) {
                                i21 -= iArr4[0];
                                i22 -= iArr4[1];
                                iArr3[0] = iArr3[0] + iArr5[0];
                                iArr3[1] = iArr3[1] + iArr5[1];
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            int i23 = i22;
                            this.V = x3 - iArr5[0];
                            this.W = y3 - iArr5[1];
                            if (X(d2 != 0 ? i21 : 0, e3 ? i23 : 0, motionEvent, 0)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            to toVar = this.i0;
                            if (toVar != null && (i21 != 0 || i23 != 0)) {
                                toVar.a(this, i21, i23);
                            }
                        }
                    } else if (actionMasked == 3) {
                        W();
                        setScrollState(0);
                    } else if (actionMasked == 5) {
                        this.R = motionEvent.getPointerId(actionIndex);
                        int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.V = x4;
                        this.T = x4;
                        int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        this.W = y4;
                        this.U = y4;
                    } else if (actionMasked == 6) {
                        R(motionEvent);
                    }
                }
                this.S.addMovement(obtain);
                obtain.recycle();
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x009e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0082 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p() {
        int F;
        View view;
        oc0 oc0Var;
        View A;
        n20 n20Var = this.k0;
        n20Var.a(1);
        z(n20Var);
        n20Var.i = false;
        b0();
        a5 a5Var = this.k;
        w50 w50Var = (w50) a5Var.g;
        w50 w50Var2 = (w50) a5Var.g;
        w50Var.clear();
        eu euVar = (eu) a5Var.h;
        euVar.a();
        P();
        T();
        q20 q20Var = null;
        View focusedChild = (this.g0 && hasFocus() && this.q != null) ? getFocusedChild() : null;
        if (focusedChild != null && (A = A(focusedChild)) != null) {
            q20Var = H(A);
        }
        if (q20Var == null) {
            n20Var.m = -1L;
            n20Var.l = -1;
            n20Var.n = -1;
        } else {
            n20Var.m = this.q.b ? q20Var.e : -1L;
            if (!this.G) {
                if (q20Var.h()) {
                    F = q20Var.d;
                } else {
                    RecyclerView recyclerView = q20Var.r;
                    if (recyclerView != null) {
                        F = recyclerView.F(q20Var);
                    }
                }
                n20Var.l = F;
                view = q20Var.a;
                int id = view.getId();
                while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                    view = ((ViewGroup) view).getFocusedChild();
                    if (view.getId() == -1) {
                        id = view.getId();
                    }
                }
                n20Var.n = id;
            }
            F = -1;
            n20Var.l = F;
            view = q20Var.a;
            int id2 = view.getId();
            while (!view.isFocused()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() == -1) {
                }
            }
            n20Var.n = id2;
        }
        n20Var.h = n20Var.j && this.o0;
        this.o0 = false;
        this.n0 = false;
        n20Var.g = n20Var.k;
        n20Var.e = this.q.a();
        C(this.s0);
        boolean z = n20Var.j;
        k6 k6Var = this.j;
        if (z) {
            int m = k6Var.m();
            for (int i = 0; i < m; i++) {
                q20 I = I(k6Var.l(i));
                if (!I.o() && (!I.f() || this.q.b)) {
                    x10 x10Var = this.P;
                    x10.b(I);
                    I.c();
                    x10Var.getClass();
                    hy hyVar = new hy();
                    hyVar.a(I);
                    oc0 oc0Var2 = (oc0) w50Var2.get(I);
                    if (oc0Var2 == null) {
                        oc0Var2 = oc0.a();
                        w50Var2.put(I, oc0Var2);
                    }
                    oc0Var2.b = hyVar;
                    oc0Var2.a |= 4;
                    if (n20Var.h && I.k() && !I.h() && !I.o() && !I.f()) {
                        euVar.d(G(I), I);
                    }
                }
            }
        }
        if (n20Var.k) {
            int u = k6Var.u();
            for (int i2 = 0; i2 < u; i2++) {
                q20 I2 = I(k6Var.t(i2));
                if (!I2.o() && I2.d == -1) {
                    I2.d = I2.c;
                }
            }
            boolean z2 = n20Var.f;
            n20Var.f = false;
            this.r.c0(this.g, n20Var);
            n20Var.f = z2;
            for (int i3 = 0; i3 < k6Var.m(); i3++) {
                q20 I3 = I(k6Var.l(i3));
                if (!I3.o() && ((oc0Var = (oc0) w50Var2.get(I3)) == null || (oc0Var.a & 4) == 0)) {
                    x10.b(I3);
                    boolean z3 = (I3.j & 8192) != 0;
                    x10 x10Var2 = this.P;
                    I3.c();
                    x10Var2.getClass();
                    hy hyVar2 = new hy();
                    hyVar2.a(I3);
                    if (z3) {
                        U(I3, hyVar2);
                    } else {
                        oc0 oc0Var3 = (oc0) w50Var2.get(I3);
                        if (oc0Var3 == null) {
                            oc0Var3 = oc0.a();
                            w50Var2.put(I3, oc0Var3);
                        }
                        oc0Var3.a |= 2;
                        oc0Var3.b = hyVar2;
                    }
                }
            }
            k();
        } else {
            k();
        }
        Q(true);
        c0(false);
        n20Var.d = 2;
    }

    public final void q() {
        b0();
        P();
        n20 n20Var = this.k0;
        n20Var.a(6);
        this.i.d();
        n20Var.e = this.q.a();
        n20Var.c = 0;
        if (this.h != null) {
            t10 t10Var = this.q;
            int j = f60.j(t10Var.c);
            if (j == 1 ? t10Var.a() > 0 : j != 2) {
                Parcelable parcelable = this.h.h;
                if (parcelable != null) {
                    this.r.e0(parcelable);
                }
                this.h = null;
            }
        }
        n20Var.g = false;
        this.r.c0(this.g, n20Var);
        n20Var.f = false;
        n20Var.j = n20Var.j && this.P != null;
        n20Var.d = 4;
        Q(true);
        c0(false);
    }

    public final boolean r(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i2, i3, iArr, iArr2);
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        q20 I = I(view);
        if (I != null) {
            if (I.j()) {
                I.j &= -257;
            } else if (!I.o()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + I + y());
            }
        }
        view.clearAnimation();
        I(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        xs xsVar = this.r.e;
        if ((xsVar == null || !xsVar.e) && !L() && view2 != null) {
            V(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.r.l0(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.u;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ll) arrayList.get(i)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.z != 0 || this.B) {
            this.A = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().d(i, i2, i3, i4, iArr, i5, iArr2);
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        b20 b20Var = this.r;
        if (b20Var == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.B) {
            return;
        }
        boolean d = b20Var.d();
        boolean e = this.r.e();
        if (d || e) {
            if (!d) {
                i = 0;
            }
            if (!e) {
                i2 = 0;
            }
            X(i, i2, null, 0);
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
            this.D |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(s20 s20Var) {
        this.r0 = s20Var;
        ic0.m(this, s20Var);
    }

    public void setAdapter(t10 t10Var) {
        setLayoutFrozen(false);
        t10 t10Var2 = this.q;
        j20 j20Var = this.f;
        if (t10Var2 != null) {
            t10Var2.a.unregisterObserver(j20Var);
            this.q.getClass();
        }
        x10 x10Var = this.P;
        if (x10Var != null) {
            x10Var.e();
        }
        b20 b20Var = this.r;
        h20 h20Var = this.g;
        if (b20Var != null) {
            b20Var.h0(h20Var);
            this.r.i0(h20Var);
        }
        h20Var.a.clear();
        h20Var.e();
        y1 y1Var = this.i;
        y1Var.r((ArrayList) y1Var.c);
        y1Var.r((ArrayList) y1Var.d);
        y1Var.a = 0;
        t10 t10Var3 = this.q;
        this.q = t10Var;
        if (t10Var != null) {
            t10Var.a.registerObserver(j20Var);
        }
        b20 b20Var2 = this.r;
        if (b20Var2 != null) {
            b20Var2.Q();
        }
        t10 t10Var4 = this.q;
        h20Var.a.clear();
        h20Var.e();
        g20 c = h20Var.c();
        if (t10Var3 != null) {
            c.b--;
        }
        if (c.b == 0) {
            SparseArray sparseArray = c.a;
            for (int i = 0; i < sparseArray.size(); i++) {
                ((f20) sparseArray.valueAt(i)).a.clear();
            }
        }
        if (t10Var4 != null) {
            c.b++;
        }
        this.k0.f = true;
        this.H |= false;
        this.G = true;
        k6 k6Var = this.j;
        int u = k6Var.u();
        for (int i2 = 0; i2 < u; i2++) {
            q20 I = I(k6Var.t(i2));
            if (I != null && !I.o()) {
                I.a(6);
            }
        }
        N();
        ArrayList arrayList = h20Var.c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            q20 q20Var = (q20) arrayList.get(i3);
            if (q20Var != null) {
                q20Var.a(6);
                q20Var.a(1024);
            }
        }
        t10 t10Var5 = h20Var.h.q;
        if (t10Var5 == null || !t10Var5.b) {
            h20Var.e();
        }
        requestLayout();
    }

    public void setChildDrawingOrderCallback(v10 v10Var) {
        if (v10Var == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.l) {
            this.O = null;
            this.M = null;
            this.N = null;
            this.L = null;
        }
        this.l = z;
        super.setClipToPadding(z);
        if (this.y) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(w10 w10Var) {
        w10Var.getClass();
        this.K = w10Var;
        this.O = null;
        this.M = null;
        this.N = null;
        this.L = null;
    }

    public void setHasFixedSize(boolean z) {
        this.x = z;
    }

    public void setItemAnimator(x10 x10Var) {
        x10 x10Var2 = this.P;
        if (x10Var2 != null) {
            x10Var2.e();
            this.P.a = null;
        }
        this.P = x10Var;
        if (x10Var != null) {
            x10Var.a = this.p0;
        }
    }

    public void setItemViewCacheSize(int i) {
        h20 h20Var = this.g;
        h20Var.e = i;
        h20Var.l();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(b20 b20Var) {
        RecyclerView recyclerView;
        xs xsVar;
        if (b20Var == this.r) {
            return;
        }
        setScrollState(0);
        p20 p20Var = this.h0;
        p20Var.l.removeCallbacks(p20Var);
        p20Var.h.abortAnimation();
        b20 b20Var2 = this.r;
        if (b20Var2 != null && (xsVar = b20Var2.e) != null) {
            xsVar.i();
        }
        b20 b20Var3 = this.r;
        h20 h20Var = this.g;
        if (b20Var3 != null) {
            x10 x10Var = this.P;
            if (x10Var != null) {
                x10Var.e();
            }
            this.r.h0(h20Var);
            this.r.i0(h20Var);
            h20Var.a.clear();
            h20Var.e();
            if (this.w) {
                b20 b20Var4 = this.r;
                b20Var4.g = false;
                b20Var4.S(this);
            }
            this.r.u0(null);
            this.r = null;
        } else {
            h20Var.a.clear();
            h20Var.e();
        }
        k6 k6Var = this.j;
        ((ra) k6Var.h).h();
        ArrayList arrayList = (ArrayList) k6Var.i;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = ((s10) k6Var.g).a;
            if (size < 0) {
                break;
            }
            q20 I = I((View) arrayList.get(size));
            if (I != null) {
                int i = I.p;
                if (recyclerView.L()) {
                    I.q = i;
                    recyclerView.x0.add(I);
                } else {
                    View view = I.a;
                    WeakHashMap weakHashMap = ic0.a;
                    view.setImportantForAccessibility(i);
                }
                I.p = 0;
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
        this.r = b20Var;
        if (b20Var != null) {
            if (b20Var.b != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(b20Var);
                String y = b20Var.b.y();
                sb.append(" is already attached to a RecyclerView:");
                sb.append(y);
                throw new IllegalArgumentException(sb.toString());
            }
            b20Var.u0(this);
            if (this.w) {
                b20 b20Var5 = this.r;
                b20Var5.g = true;
                b20Var5.R(this);
            }
        }
        h20Var.l();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
        } else {
            g9.i("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        ey scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.d) {
            ViewGroup viewGroup = scrollingChildHelper.c;
            WeakHashMap weakHashMap = ic0.a;
            viewGroup.stopNestedScroll();
        }
        scrollingChildHelper.d = z;
    }

    public void setOnFlingListener(d20 d20Var) {
        this.b0 = d20Var;
    }

    @Deprecated
    public void setOnScrollListener(e20 e20Var) {
        this.l0 = e20Var;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.g0 = z;
    }

    public void setRecycledViewPool(g20 g20Var) {
        h20 h20Var = this.g;
        if (h20Var.g != null) {
            r0.b--;
        }
        h20Var.g = g20Var;
        if (g20Var == null || h20Var.h.getAdapter() == null) {
            return;
        }
        h20Var.g.b++;
    }

    public void setScrollState(int i) {
        xs xsVar;
        if (i == this.Q) {
            return;
        }
        this.Q = i;
        if (i != 2) {
            p20 p20Var = this.h0;
            p20Var.l.removeCallbacks(p20Var);
            p20Var.h.abortAnimation();
            b20 b20Var = this.r;
            if (b20Var != null && (xsVar = b20Var.e) != null) {
                xsVar.i();
            }
        }
        b20 b20Var2 = this.r;
        if (b20Var2 != null) {
            b20Var2.g0(i);
        }
        e20 e20Var = this.l0;
        if (e20Var != null) {
            e20Var.a(this, i);
        }
        ArrayList arrayList = this.m0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((e20) this.m0.get(size)).a(this, i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.a0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.a0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(o20 o20Var) {
        this.g.getClass();
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
    public final void suppressLayout(boolean z) {
        xs xsVar;
        if (z != this.B) {
            i("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.B = false;
                if (this.A && this.r != null && this.q != null) {
                    requestLayout();
                }
                this.A = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.B = true;
            this.C = true;
            setScrollState(0);
            p20 p20Var = this.h0;
            p20Var.l.removeCallbacks(p20Var);
            p20Var.h.abortAnimation();
            b20 b20Var = this.r;
            if (b20Var == null || (xsVar = b20Var.e) == null) {
                return;
            }
            xsVar.i();
        }
    }

    public final void t(int i, int i2) {
        this.J++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        e20 e20Var = this.l0;
        if (e20Var != null) {
            e20Var.b(this, i, i2);
        }
        ArrayList arrayList = this.m0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((e20) this.m0.get(size)).b(this, i, i2);
            }
        }
        this.J--;
    }

    public final void u() {
        if (this.O != null) {
            return;
        }
        this.K.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.O = edgeEffect;
        if (this.l) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void v() {
        if (this.L != null) {
            return;
        }
        this.K.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.L = edgeEffect;
        if (this.l) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void w() {
        if (this.N != null) {
            return;
        }
        this.K.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.N = edgeEffect;
        if (this.l) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void x() {
        if (this.M != null) {
            return;
        }
        this.K.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.M = edgeEffect;
        if (this.l) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String y() {
        return " " + super.toString() + ", adapter:" + this.q + ", layout:" + this.r + ", context:" + getContext();
    }

    public final void z(n20 n20Var) {
        if (getScrollState() != 2) {
            n20Var.getClass();
            return;
        }
        OverScroller overScroller = this.h0.h;
        overScroller.getFinalX();
        overScroller.getCurrX();
        n20Var.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        b20 b20Var = this.r;
        if (b20Var != null) {
            return b20Var.t(layoutParams);
        }
        g9.s("RecyclerView has no LayoutManager".concat(y()));
        return null;
    }

    @Deprecated
    public void setRecyclerListener(i20 i20Var) {
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.moontiko.really.admiralcasino.R.attr.recyclerViewStyle);
    }
}
