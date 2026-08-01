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
import defpackage.ac;
import defpackage.aw;
import defpackage.b70;
import defpackage.b80;
import defpackage.bj0;
import defpackage.bm0;
import defpackage.c80;
import defpackage.d80;
import defpackage.e2;
import defpackage.e80;
import defpackage.ez;
import defpackage.f2;
import defpackage.h80;
import defpackage.hm0;
import defpackage.hs;
import defpackage.i50;
import defpackage.i80;
import defpackage.j50;
import defpackage.j80;
import defpackage.k80;
import defpackage.ko;
import defpackage.l80;
import defpackage.m80;
import defpackage.mb;
import defpackage.n80;
import defpackage.nm0;
import defpackage.nz;
import defpackage.o80;
import defpackage.p30;
import defpackage.p80;
import defpackage.pi;
import defpackage.q30;
import defpackage.q80;
import defpackage.r80;
import defpackage.s6;
import defpackage.s9;
import defpackage.t30;
import defpackage.t80;
import defpackage.tl0;
import defpackage.u80;
import defpackage.v70;
import defpackage.v80;
import defpackage.w70;
import defpackage.w80;
import defpackage.wl;
import defpackage.wx;
import defpackage.x70;
import defpackage.x80;
import defpackage.yv;
import defpackage.z70;
import defpackage.z80;
import defpackage.zd0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements p30 {
    public static final int[] E0 = {R.attr.nestedScrollingEnabled};
    public static final Class[] F0;
    public static final yv G0;
    public boolean A;
    public boolean A0;
    public boolean B;
    public int B0;
    public boolean C;
    public int C0;
    public int D;
    public final w70 D0;
    public boolean E;
    public final AccessibilityManager F;
    public ArrayList G;
    public boolean H;
    public boolean I;
    public int J;
    public int K;
    public c80 L;
    public EdgeEffect M;
    public EdgeEffect N;
    public EdgeEffect O;
    public EdgeEffect P;
    public d80 Q;
    public int R;
    public int S;
    public VelocityTracker T;
    public int U;
    public int V;
    public int W;
    public int a0;
    public int b0;
    public j80 c0;
    public final int d0;
    public final int e0;
    public final q80 f;
    public final float f0;
    public final o80 g;
    public final float g0;
    public r80 h;
    public boolean h0;
    public final f2 i;
    public final w80 i0;
    public final s6 j;
    public hs j0;
    public final tl0 k;
    public final ac k0;
    public boolean l;
    public final u80 l0;
    public final v70 m;
    public l80 m0;
    public final Rect n;
    public ArrayList n0;
    public final Rect o;
    public boolean o0;
    public final RectF p;
    public boolean p0;
    public z70 q;
    public final w70 q0;
    public h80 r;
    public boolean r0;
    public final ArrayList s;
    public z80 s0;
    public final ArrayList t;
    public final int[] t0;
    public final ArrayList u;
    public q30 u0;
    public k80 v;
    public final int[] v0;
    public boolean w;
    public final int[] w0;
    public boolean x;
    public final int[] x0;
    public boolean y;
    public final ArrayList y0;
    public int z;
    public final v70 z0;

    static {
        Class cls = Integer.TYPE;
        F0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        G0 = new yv(2);
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
        this.f = new q80(this);
        this.g = new o80(this);
        this.k = new tl0();
        this.m = new v70(this, 0);
        this.n = new Rect();
        this.o = new Rect();
        this.p = new RectF();
        this.s = new ArrayList();
        this.t = new ArrayList();
        this.u = new ArrayList();
        this.z = 0;
        this.H = false;
        this.I = false;
        this.J = 0;
        this.K = 0;
        this.L = new c80();
        pi piVar = new pi();
        piVar.a = null;
        piVar.b = new ArrayList();
        piVar.c = 120L;
        piVar.d = 120L;
        piVar.e = 250L;
        piVar.f = 250L;
        piVar.g = true;
        piVar.h = new ArrayList();
        piVar.i = new ArrayList();
        piVar.j = new ArrayList();
        piVar.k = new ArrayList();
        piVar.l = new ArrayList();
        piVar.m = new ArrayList();
        piVar.n = new ArrayList();
        piVar.o = new ArrayList();
        piVar.p = new ArrayList();
        piVar.q = new ArrayList();
        piVar.r = new ArrayList();
        this.Q = piVar;
        this.R = 0;
        this.S = -1;
        this.f0 = Float.MIN_VALUE;
        this.g0 = Float.MIN_VALUE;
        this.h0 = true;
        this.i0 = new w80(this);
        this.k0 = new ac();
        u80 u80Var = new u80();
        u80Var.a = -1;
        u80Var.b = 0;
        u80Var.c = 0;
        u80Var.d = 1;
        u80Var.e = 0;
        u80Var.f = false;
        u80Var.g = false;
        u80Var.h = false;
        u80Var.i = false;
        u80Var.j = false;
        u80Var.k = false;
        this.l0 = u80Var;
        this.o0 = false;
        this.p0 = false;
        w70 w70Var = new w70(this);
        this.q0 = w70Var;
        this.r0 = false;
        this.t0 = new int[2];
        this.v0 = new int[2];
        this.w0 = new int[2];
        this.x0 = new int[2];
        this.y0 = new ArrayList();
        this.z0 = new v70(this, 1);
        this.B0 = 0;
        this.C0 = 0;
        this.D0 = new w70(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.b0 = viewConfiguration.getScaledTouchSlop();
        this.f0 = viewConfiguration.getScaledHorizontalScrollFactor();
        this.g0 = viewConfiguration.getScaledVerticalScrollFactor();
        this.d0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.e0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.Q.a = w70Var;
        this.i = new f2(new w70(this));
        this.j = new s6(new w70(this));
        WeakHashMap weakHashMap = hm0.a;
        if (bm0.a(this) == 0) {
            bm0.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.F = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new z80(this));
        int[] iArr = b70.a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        hm0.l(this, context, iArr, attributeSet, obtainStyledAttributes, i);
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
                s9.k("Trying to set fast scroller without both required drawables.".concat(z()));
                throw null;
            }
            Resources resources = getContext().getResources();
            c = 3;
            c2 = 2;
            z = 1;
            typedArray = obtainStyledAttributes;
            i2 = 4;
            new ko(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.trembin.nirefon.betfury.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.trembin.nirefon.betfury.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.trembin.nirefon.betfury.R.dimen.fastscroll_margin));
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
                    Class asSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(h80.class);
                    try {
                        constructor = asSubclass.getConstructor(F0);
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
                    setLayoutManager((h80) constructor.newInstance(objArr));
                } catch (ClassCastException e3) {
                    s9.g(attributeSet.getPositionDescription(), ": Class is not a LayoutManager ", str, e3);
                    throw null;
                } catch (ClassNotFoundException e4) {
                    s9.g(attributeSet.getPositionDescription(), ": Unable to find LayoutManager ", str, e4);
                    throw null;
                } catch (IllegalAccessException e5) {
                    s9.g(attributeSet.getPositionDescription(), ": Cannot access non-public constructor ", str, e5);
                    throw null;
                } catch (InstantiationException e6) {
                    s9.g(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e6);
                    throw null;
                } catch (InvocationTargetException e7) {
                    s9.g(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e7);
                    throw null;
                }
            }
        }
        int[] iArr2 = E0;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        hm0.l(this, context, iArr2, attributeSet, obtainStyledAttributes2, i);
        boolean z2 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
    }

    public static RecyclerView E(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView E = E(viewGroup.getChildAt(i));
            if (E != null) {
                return E;
            }
        }
        return null;
    }

    public static x80 J(View view) {
        if (view == null) {
            return null;
        }
        return ((i80) view.getLayoutParams()).a;
    }

    private q30 getScrollingChildHelper() {
        if (this.u0 == null) {
            this.u0 = new q30(this);
        }
        return this.u0;
    }

    public static void j(x80 x80Var) {
        WeakReference weakReference = x80Var.b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == x80Var.a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            x80Var.b = null;
        }
    }

    public final void A(u80 u80Var) {
        if (getScrollState() != 2) {
            u80Var.getClass();
            return;
        }
        OverScroller overScroller = this.i0.h;
        overScroller.getFinalX();
        overScroller.getCurrX();
        u80Var.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View B(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        return null;
    }

    public final boolean C(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.u;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            k80 k80Var = (k80) arrayList.get(i);
            if (k80Var.b(motionEvent) && action != 3) {
                this.v = k80Var;
                return true;
            }
        }
        return false;
    }

    public final void D(int[] iArr) {
        s6 s6Var = this.j;
        int h = s6Var.h();
        if (h == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < h; i3++) {
            x80 J = J(s6Var.g(i3));
            if (!J.p()) {
                int c = J.c();
                if (c < i) {
                    i = c;
                }
                if (c > i2) {
                    i2 = c;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public final x80 F(int i) {
        x80 x80Var = null;
        if (this.H) {
            return null;
        }
        s6 s6Var = this.j;
        int p = s6Var.p();
        for (int i2 = 0; i2 < p; i2++) {
            x80 J = J(s6Var.o(i2));
            if (J != null && !J.i() && G(J) == i) {
                if (!((ArrayList) s6Var.d).contains(J.a)) {
                    return J;
                }
                x80Var = J;
            }
        }
        return x80Var;
    }

    public final int G(x80 x80Var) {
        if ((x80Var.j & 524) == 0 && x80Var.f()) {
            int i = x80Var.c;
            ArrayList arrayList = (ArrayList) this.i.c;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                e2 e2Var = (e2) arrayList.get(i2);
                int i3 = e2Var.a;
                if (i3 != 1) {
                    if (i3 == 2) {
                        int i4 = e2Var.b;
                        if (i4 <= i) {
                            int i5 = e2Var.d;
                            if (i4 + i5 <= i) {
                                i -= i5;
                            }
                        } else {
                            continue;
                        }
                    } else if (i3 == 8) {
                        int i6 = e2Var.b;
                        if (i6 == i) {
                            i = e2Var.d;
                        } else {
                            if (i6 < i) {
                                i--;
                            }
                            if (e2Var.d <= i) {
                                i++;
                            }
                        }
                    }
                } else if (e2Var.b <= i) {
                    i += e2Var.d;
                }
            }
            return i;
        }
        return -1;
    }

    public final long H(x80 x80Var) {
        return this.q.b ? x80Var.e : x80Var.c;
    }

    public final x80 I(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return J(view);
        }
        s9.o("View ", view, " is not a direct child of ", this);
        return null;
    }

    public final Rect K(View view) {
        i80 i80Var = (i80) view.getLayoutParams();
        boolean z = i80Var.c;
        Rect rect = i80Var.b;
        if (!z || (this.l0.g && (i80Var.a.l() || i80Var.a.g()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.t;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.n;
            rect2.set(0, 0, 0, 0);
            ((e80) arrayList.get(i)).d(rect2, view);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        i80Var.c = false;
        return rect;
    }

    public final boolean L() {
        return !this.y || this.H || this.i.k();
    }

    public final boolean M() {
        return this.J > 0;
    }

    public final void N(int i) {
        if (this.r == null) {
            return;
        }
        setScrollState(2);
        this.r.o0(i);
        awakenScrollBars();
    }

    public final void O() {
        s6 s6Var = this.j;
        int p = s6Var.p();
        for (int i = 0; i < p; i++) {
            ((i80) s6Var.o(i).getLayoutParams()).c = true;
        }
        ArrayList arrayList = this.g.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            i80 i80Var = (i80) ((x80) arrayList.get(i2)).a.getLayoutParams();
            if (i80Var != null) {
                i80Var.c = true;
            }
        }
    }

    public final void P(int i, int i2, boolean z) {
        int i3 = i + i2;
        s6 s6Var = this.j;
        int p = s6Var.p();
        for (int i4 = 0; i4 < p; i4++) {
            x80 J = J(s6Var.o(i4));
            if (J != null && !J.p()) {
                int i5 = J.c;
                u80 u80Var = this.l0;
                if (i5 >= i3) {
                    J.m(-i2, z);
                    u80Var.f = true;
                } else if (i5 >= i) {
                    J.a(8);
                    J.m(-i2, z);
                    J.c = i - 1;
                    u80Var.f = true;
                }
            }
        }
        o80 o80Var = this.g;
        ArrayList arrayList = o80Var.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            x80 x80Var = (x80) arrayList.get(size);
            if (x80Var != null) {
                int i6 = x80Var.c;
                if (i6 >= i3) {
                    x80Var.m(-i2, z);
                } else if (i6 >= i) {
                    x80Var.a(8);
                    o80Var.f(size);
                }
            }
        }
        requestLayout();
    }

    public final void Q() {
        this.J++;
    }

    public final void R(boolean z) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.J - 1;
        this.J = i2;
        if (i2 < 1) {
            this.J = 0;
            if (z) {
                int i3 = this.D;
                this.D = 0;
                if (i3 != 0 && (accessibilityManager = this.F) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(obtain);
                }
                ArrayList arrayList = this.y0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    x80 x80Var = (x80) arrayList.get(size);
                    if (x80Var.a.getParent() == this && !x80Var.p() && (i = x80Var.q) != -1) {
                        View view = x80Var.a;
                        WeakHashMap weakHashMap = hm0.a;
                        view.setImportantForAccessibility(i);
                        x80Var.q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void S(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.S) {
            int i = actionIndex == 0 ? 1 : 0;
            this.S = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.W = x;
            this.U = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.a0 = y;
            this.V = y;
        }
    }

    public final void T() {
        if (this.r0 || !this.w) {
            return;
        }
        WeakHashMap weakHashMap = hm0.a;
        postOnAnimation(this.z0);
        this.r0 = true;
    }

    public final void U() {
        boolean z;
        boolean z2 = this.H;
        f2 f2Var = this.i;
        boolean z3 = false;
        if (z2) {
            f2Var.r((ArrayList) f2Var.c);
            f2Var.r((ArrayList) f2Var.d);
            f2Var.a = 0;
            if (this.I) {
                this.r.Y();
            }
        }
        if (this.Q != null && this.r.A0()) {
            f2Var.q();
        } else {
            f2Var.d();
        }
        boolean z4 = this.o0 || this.p0;
        boolean z5 = this.y && this.Q != null && ((z = this.H) || z4 || this.r.f) && (!z || this.q.b);
        u80 u80Var = this.l0;
        u80Var.j = z5;
        if (z5 && z4 && !this.H && this.Q != null && this.r.A0()) {
            z3 = true;
        }
        u80Var.k = z3;
    }

    public final void V(x80 x80Var, t30 t30Var) {
        x80Var.j &= -8193;
        boolean z = this.l0.h;
        tl0 tl0Var = this.k;
        if (z && x80Var.l() && !x80Var.i() && !x80Var.p()) {
            ((ez) tl0Var.h).d(H(x80Var), x80Var);
        }
        zd0 zd0Var = (zd0) tl0Var.g;
        nm0 nm0Var = (nm0) zd0Var.get(x80Var);
        if (nm0Var == null) {
            nm0Var = nm0.a();
            zd0Var.put(x80Var, nm0Var);
        }
        nm0Var.b = t30Var;
        nm0Var.a |= 4;
    }

    public final void W(e80 e80Var) {
        h80 h80Var = this.r;
        if (h80Var != null) {
            h80Var.c("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.t;
        arrayList.remove(e80Var);
        if (arrayList.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        O();
        requestLayout();
    }

    public final void X(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.n;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof i80) {
            i80 i80Var = (i80) layoutParams;
            if (!i80Var.c) {
                Rect rect2 = i80Var.b;
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

    public final void Y() {
        VelocityTracker velocityTracker = this.T;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z = false;
        f0(0);
        EdgeEffect edgeEffect = this.M;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.M.isFinished();
        }
        EdgeEffect edgeEffect2 = this.N;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.N.isFinished();
        }
        EdgeEffect edgeEffect3 = this.O;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.O.isFinished();
        }
        EdgeEffect edgeEffect4 = this.P;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.P.isFinished();
        }
        if (z) {
            WeakHashMap weakHashMap = hm0.a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Z(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        boolean z2;
        m();
        z70 z70Var = this.q;
        int[] iArr = this.x0;
        if (z70Var != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            a0(i, i2, iArr);
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
        t(i4, i5, i6, i7, this.v0, i3, iArr);
        int i8 = iArr[0];
        int i9 = i6 - i8;
        int i10 = iArr[1];
        int i11 = i7 - i10;
        boolean z3 = (i8 == 0 && i10 == 0) ? false : true;
        int i12 = this.W;
        int[] iArr2 = this.v0;
        int i13 = iArr2[0];
        this.W = i12 - i13;
        int i14 = this.a0;
        int i15 = iArr2[1];
        this.a0 = i14 - i15;
        int[] iArr3 = this.w0;
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
                    w();
                    z = true;
                    this.M.onPull((-f) / getWidth(), 1.0f - (y / getHeight()));
                } else {
                    z = true;
                    if (f > 0.0f) {
                        x();
                        this.O.onPull(f / getWidth(), y / getHeight());
                    } else {
                        z2 = false;
                        if (f2 >= 0.0f) {
                            y();
                            this.N.onPull((-f2) / getHeight(), x / getWidth());
                        } else {
                            if (f2 > 0.0f) {
                                v();
                                this.P.onPull(f2 / getHeight(), 1.0f - (x / getWidth()));
                            }
                            if (!z2 || f != 0.0f || f2 != 0.0f) {
                                WeakHashMap weakHashMap = hm0.a;
                                postInvalidateOnAnimation();
                            }
                        }
                        z2 = z;
                        if (!z2) {
                        }
                        WeakHashMap weakHashMap2 = hm0.a;
                        postInvalidateOnAnimation();
                    }
                }
                z2 = z;
                if (f2 >= 0.0f) {
                }
                z2 = z;
                if (!z2) {
                }
                WeakHashMap weakHashMap22 = hm0.a;
                postInvalidateOnAnimation();
            }
            l(i, i2);
        } else {
            z = true;
        }
        if (i4 != 0 || i5 != 0) {
            u(i4, i5);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (!z3 && i4 == 0 && i5 == 0) {
            return false;
        }
        return z;
    }

    public final void a0(int i, int i2, int[] iArr) {
        x80 x80Var;
        d0();
        Q();
        int i3 = bj0.a;
        Trace.beginSection("RV Scroll");
        u80 u80Var = this.l0;
        A(u80Var);
        o80 o80Var = this.g;
        int n0 = i != 0 ? this.r.n0(i, o80Var, u80Var) : 0;
        int p0 = i2 != 0 ? this.r.p0(i2, o80Var, u80Var) : 0;
        Trace.endSection();
        s6 s6Var = this.j;
        int h = s6Var.h();
        for (int i4 = 0; i4 < h; i4++) {
            View g = s6Var.g(i4);
            x80 I = I(g);
            if (I != null && (x80Var = I.i) != null) {
                View view = x80Var.a;
                int left = g.getLeft();
                int top = g.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        R(true);
        e0(false);
        if (iArr != null) {
            iArr[0] = n0;
            iArr[1] = p0;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        h80 h80Var = this.r;
        if (h80Var != null) {
            h80Var.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    public final void b0(int i) {
        wx wxVar;
        if (this.B) {
            return;
        }
        setScrollState(0);
        w80 w80Var = this.i0;
        w80Var.l.removeCallbacks(w80Var);
        w80Var.h.abortAnimation();
        h80 h80Var = this.r;
        if (h80Var != null && (wxVar = h80Var.e) != null) {
            wxVar.i();
        }
        h80 h80Var2 = this.r;
        if (h80Var2 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            h80Var2.o0(i);
            awakenScrollBars();
        }
    }

    public final void c0(int i, int i2, boolean z) {
        h80 h80Var = this.r;
        if (h80Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.B) {
            return;
        }
        if (!h80Var.d()) {
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
        this.i0.b(i, i2, Integer.MIN_VALUE, null);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof i80) && this.r.f((i80) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        h80 h80Var = this.r;
        if (h80Var != null && h80Var.d()) {
            return this.r.j(this.l0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        h80 h80Var = this.r;
        if (h80Var != null && h80Var.d()) {
            return this.r.k(this.l0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        h80 h80Var = this.r;
        if (h80Var != null && h80Var.d()) {
            return this.r.l(this.l0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        h80 h80Var = this.r;
        if (h80Var != null && h80Var.e()) {
            return this.r.m(this.l0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        h80 h80Var = this.r;
        if (h80Var != null && h80Var.e()) {
            return this.r.n(this.l0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        h80 h80Var = this.r;
        if (h80Var != null && h80Var.e()) {
            return this.r.o(this.l0);
        }
        return 0;
    }

    public final void d0() {
        int i = this.z + 1;
        this.z = i;
        if (i != 1 || this.B) {
            return;
        }
        this.A = false;
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
            ((e80) arrayList.get(i)).f(canvas, this);
        }
        EdgeEffect edgeEffect = this.M;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.l ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.M;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.N;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.l) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.N;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.O;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.l ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.O;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.P;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.l) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.P;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(save4);
        }
        if ((z || this.Q == null || arrayList.size() <= 0 || !this.Q.f()) ? z : true) {
            WeakHashMap weakHashMap = hm0.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final void e0(boolean z) {
        if (this.z < 1) {
            this.z = 1;
        }
        if (!z && !this.B) {
            this.A = false;
        }
        if (this.z == 1) {
            if (z && this.A && !this.B && this.r != null && this.q != null) {
                p();
            }
            if (!this.B) {
                this.A = false;
            }
        }
        this.z--;
    }

    public final void f(x80 x80Var) {
        View view = x80Var.a;
        boolean z = view.getParent() == this;
        this.g.k(I(view));
        boolean k = x80Var.k();
        s6 s6Var = this.j;
        if (k) {
            s6Var.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            s6Var.a(view, -1, true);
            return;
        }
        int indexOfChild = ((w70) s6Var.b).a.indexOfChild(view);
        if (indexOfChild < 0) {
            s9.v(view, "view is not a child, cannot hide ");
        } else {
            ((mb) s6Var.c).i(indexOfChild);
            s6Var.r(view);
        }
    }

    public final void f0(int i) {
        getScrollingChildHelper().h(i);
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
        boolean z3 = (this.q == null || this.r == null || M() || this.B) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        u80 u80Var = this.l0;
        o80 o80Var = this.g;
        if (z3 && (i == 2 || i == 1)) {
            if (this.r.e()) {
                if (focusFinder.findNextFocus(this, view, i == 2 ? 130 : 33) == null) {
                    z = true;
                    if (!z && this.r.d()) {
                        z = focusFinder.findNextFocus(this, view, !((this.r.C() != 1) ^ (i != 2)) ? 66 : 17) != null;
                    }
                    if (z) {
                        m();
                        if (B(view) != null) {
                            d0();
                            this.r.T(view, i, o80Var, u80Var);
                            e0(false);
                        }
                        return null;
                    }
                    view2 = focusFinder.findNextFocus(this, view, i);
                    if (view2 == null) {
                    }
                    if (view2 != null) {
                        if (B(view2) != null) {
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
                if (B(view) != null) {
                    d0();
                    view2 = this.r.T(view, i, o80Var, u80Var);
                    e0(false);
                }
                return null;
            }
            view2 = findNextFocus;
            if (view2 == null && !view2.hasFocusable()) {
                if (getFocusedChild() == null) {
                    return super.focusSearch(view, i);
                }
                X(view2, null);
                return view;
            }
            if (view2 != null && view2 != this && view2 != view) {
                if (B(view2) != null) {
                    z2 = false;
                } else if (view != null && B(view) != null) {
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
                                            throw new IllegalArgumentException("Invalid direction: " + i + z());
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

    public final void g(e80 e80Var) {
        h80 h80Var = this.r;
        if (h80Var != null) {
            h80Var.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.t;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(e80Var);
        O();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        h80 h80Var = this.r;
        if (h80Var != null) {
            return h80Var.r();
        }
        s9.u("RecyclerView has no LayoutManager".concat(z()));
        return null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        h80 h80Var = this.r;
        if (h80Var != null) {
            return h80Var.s(getContext(), attributeSet);
        }
        s9.u("RecyclerView has no LayoutManager".concat(z()));
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public z70 getAdapter() {
        return this.q;
    }

    @Override // android.view.View
    public int getBaseline() {
        h80 h80Var = this.r;
        if (h80Var == null) {
            return super.getBaseline();
        }
        h80Var.getClass();
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

    public z80 getCompatAccessibilityDelegate() {
        return this.s0;
    }

    public c80 getEdgeEffectFactory() {
        return this.L;
    }

    public d80 getItemAnimator() {
        return this.Q;
    }

    public int getItemDecorationCount() {
        return this.t.size();
    }

    public h80 getLayoutManager() {
        return this.r;
    }

    public int getMaxFlingVelocity() {
        return this.e0;
    }

    public int getMinFlingVelocity() {
        return this.d0;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public j80 getOnFlingListener() {
        return this.c0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.h0;
    }

    public n80 getRecycledViewPool() {
        return this.g.c();
    }

    public int getScrollState() {
        return this.R;
    }

    public final void h(l80 l80Var) {
        if (this.n0 == null) {
            this.n0 = new ArrayList();
        }
        this.n0.add(l80Var);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(String str) {
        if (!M()) {
            if (this.K > 0) {
                Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(z()));
            }
        } else if (str == null) {
            s9.u("Cannot call this method while RecyclerView is computing a layout or scrolling".concat(z()));
        } else {
            s9.u(str);
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
        s6 s6Var = this.j;
        int p = s6Var.p();
        for (int i = 0; i < p; i++) {
            x80 J = J(s6Var.o(i));
            if (!J.p()) {
                J.d = -1;
                J.g = -1;
            }
        }
        o80 o80Var = this.g;
        ArrayList arrayList = o80Var.a;
        ArrayList arrayList2 = o80Var.c;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            x80 x80Var = (x80) arrayList2.get(i2);
            x80Var.d = -1;
            x80Var.g = -1;
        }
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            x80 x80Var2 = (x80) arrayList.get(i3);
            x80Var2.d = -1;
            x80Var2.g = -1;
        }
        ArrayList arrayList3 = o80Var.b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                x80 x80Var3 = (x80) o80Var.b.get(i4);
                x80Var3.d = -1;
                x80Var3.g = -1;
            }
        }
    }

    public final void l(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.M;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.M.onRelease();
            z = this.M.isFinished();
        }
        EdgeEffect edgeEffect2 = this.O;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.O.onRelease();
            z |= this.O.isFinished();
        }
        EdgeEffect edgeEffect3 = this.N;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.N.onRelease();
            z |= this.N.isFinished();
        }
        EdgeEffect edgeEffect4 = this.P;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.P.onRelease();
            z |= this.P.isFinished();
        }
        if (z) {
            WeakHashMap weakHashMap = hm0.a;
            postInvalidateOnAnimation();
        }
    }

    public final void m() {
        if (!this.y || this.H) {
            int i = bj0.a;
            Trace.beginSection("RV FullInvalidate");
            p();
            Trace.endSection();
            return;
        }
        f2 f2Var = this.i;
        if (f2Var.k()) {
            int i2 = f2Var.a;
            if ((i2 & 4) == 0 || (i2 & 11) != 0) {
                if (f2Var.k()) {
                    int i3 = bj0.a;
                    Trace.beginSection("RV FullInvalidate");
                    p();
                    Trace.endSection();
                    return;
                }
                return;
            }
            int i4 = bj0.a;
            Trace.beginSection("RV PartialInvalidate");
            d0();
            Q();
            f2Var.q();
            if (!this.A) {
                s6 s6Var = this.j;
                int h = s6Var.h();
                int i5 = 0;
                while (true) {
                    if (i5 < h) {
                        x80 J = J(s6Var.g(i5));
                        if (J != null && !J.p() && J.l()) {
                            p();
                            break;
                        }
                        i5++;
                    } else {
                        f2Var.c();
                        break;
                    }
                }
            }
            e0(true);
            R(true);
            Trace.endSection();
        }
    }

    public final void n(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = hm0.a;
        setMeasuredDimension(h80.g(i, paddingRight, getMinimumWidth()), h80.g(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final void o(View view) {
        J(view);
        ArrayList arrayList = this.G;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                aw awVar = (aw) this.G.get(size);
                if (view == awVar.w) {
                    awVar.w = null;
                }
                x80 I = awVar.r.I(view);
                if (I != null) {
                    x80 x80Var = awVar.c;
                    if (x80Var == null || I != x80Var) {
                        awVar.j(I, false);
                        if (awVar.a.remove(I.a)) {
                            awVar.m.getClass();
                            nz.b(I);
                        }
                    } else {
                        awVar.o(null, 0);
                    }
                }
            }
        }
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
        this.J = 0;
        this.w = true;
        this.y = this.y && !isLayoutRequested();
        h80 h80Var = this.r;
        if (h80Var != null) {
            h80Var.g = true;
            h80Var.R(this);
        }
        this.r0 = false;
        ThreadLocal threadLocal = hs.j;
        hs hsVar = (hs) threadLocal.get();
        this.j0 = hsVar;
        if (hsVar == null) {
            hs hsVar2 = new hs();
            hsVar2.f = new ArrayList();
            hsVar2.i = new ArrayList();
            this.j0 = hsVar2;
            WeakHashMap weakHashMap = hm0.a;
            Display display = getDisplay();
            if (!isInEditMode() && display != null) {
                f = display.getRefreshRate();
            }
            f = 60.0f;
            hs hsVar3 = this.j0;
            hsVar3.h = (long) (1.0E9f / f);
            threadLocal.set(hsVar3);
        }
        this.j0.f.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        wx wxVar;
        super.onDetachedFromWindow();
        d80 d80Var = this.Q;
        if (d80Var != null) {
            d80Var.e();
        }
        setScrollState(0);
        w80 w80Var = this.i0;
        w80Var.l.removeCallbacks(w80Var);
        w80Var.h.abortAnimation();
        h80 h80Var = this.r;
        if (h80Var != null && (wxVar = h80Var.e) != null) {
            wxVar.i();
        }
        this.w = false;
        h80 h80Var2 = this.r;
        if (h80Var2 != null) {
            h80Var2.g = false;
            h80Var2.S(this);
        }
        this.y0.clear();
        removeCallbacks(this.z0);
        this.k.getClass();
        while (nm0.d.a() != null) {
        }
        hs hsVar = this.j0;
        if (hsVar != null) {
            hsVar.f.remove(this);
            this.j0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.t;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((e80) arrayList.get(i)).e(canvas, this);
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
        h80 h80Var;
        if (this.r != null && !this.B && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f = this.r.e() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.r.d()) {
                    f2 = motionEvent.getAxisValue(10);
                    if (f == 0.0f || f2 != 0.0f) {
                        int i = (int) (f2 * this.f0);
                        int i2 = (int) (f * this.g0);
                        h80Var = this.r;
                        if (h80Var == null) {
                            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                            return false;
                        }
                        if (!this.B) {
                            int[] iArr = this.x0;
                            iArr[0] = 0;
                            iArr[1] = 0;
                            boolean d = h80Var.d();
                            boolean e = this.r.e();
                            getScrollingChildHelper().g(e ? (d ? 1 : 0) | 2 : d ? 1 : 0, 1);
                            if (s(d ? i : 0, e ? i2 : 0, 1, this.x0, this.v0)) {
                                i -= iArr[0];
                                i2 -= iArr[1];
                            }
                            Z(d ? i : 0, e ? i2 : 0, motionEvent, 1);
                            hs hsVar = this.j0;
                            if (hsVar != null && (i != 0 || i2 != 0)) {
                                hsVar.a(this, i, i2);
                            }
                            f0(1);
                        }
                    }
                }
                f2 = 0.0f;
                if (f == 0.0f) {
                }
                int i3 = (int) (f2 * this.f0);
                int i22 = (int) (f * this.g0);
                h80Var = this.r;
                if (h80Var == null) {
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.r.e()) {
                        f = -axisValue;
                        f2 = 0.0f;
                        if (f == 0.0f) {
                        }
                        int i32 = (int) (f2 * this.f0);
                        int i222 = (int) (f * this.g0);
                        h80Var = this.r;
                        if (h80Var == null) {
                        }
                    } else if (this.r.d()) {
                        f2 = axisValue;
                        f = 0.0f;
                        if (f == 0.0f) {
                        }
                        int i322 = (int) (f2 * this.f0);
                        int i2222 = (int) (f * this.g0);
                        h80Var = this.r;
                        if (h80Var == null) {
                        }
                    }
                }
                f = 0.0f;
                f2 = 0.0f;
                if (f == 0.0f) {
                }
                int i3222 = (int) (f2 * this.f0);
                int i22222 = (int) (f * this.g0);
                h80Var = this.r;
                if (h80Var == null) {
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
            if (C(motionEvent)) {
                Y();
                setScrollState(0);
                return true;
            }
            h80 h80Var = this.r;
            if (h80Var != null) {
                boolean d = h80Var.d();
                boolean e = this.r.e();
                if (this.T == null) {
                    this.T = VelocityTracker.obtain();
                }
                this.T.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.C) {
                        this.C = false;
                    }
                    this.S = motionEvent.getPointerId(0);
                    int x = (int) (motionEvent.getX() + 0.5f);
                    this.W = x;
                    this.U = x;
                    int y = (int) (motionEvent.getY() + 0.5f);
                    this.a0 = y;
                    this.V = y;
                    if (this.R == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        f0(1);
                    }
                    int[] iArr = this.w0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i = d;
                    if (e) {
                        i = (d ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i, 0);
                } else if (actionMasked == 1) {
                    this.T.clear();
                    f0(0);
                } else if (actionMasked == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.S);
                    if (findPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.S + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.R != 1) {
                        int i2 = x2 - this.U;
                        int i3 = y2 - this.V;
                        if (d == 0 || Math.abs(i2) <= this.b0) {
                            z = false;
                        } else {
                            this.W = x2;
                            z = true;
                        }
                        if (e && Math.abs(i3) > this.b0) {
                            this.a0 = y2;
                            z = true;
                        }
                        if (z) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    Y();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.S = motionEvent.getPointerId(actionIndex);
                    int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.W = x3;
                    this.U = x3;
                    int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.a0 = y3;
                    this.V = y3;
                } else if (actionMasked == 6) {
                    S(motionEvent);
                }
                if (this.R == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = bj0.a;
        Trace.beginSection("RV OnLayout");
        p();
        Trace.endSection();
        this.y = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        h80 h80Var = this.r;
        if (h80Var == null) {
            n(i, i2);
            return;
        }
        boolean L = h80Var.L();
        boolean z = false;
        u80 u80Var = this.l0;
        if (L) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.r.b.n(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.A0 = z;
            if (z || this.q == null) {
                return;
            }
            if (u80Var.d == 1) {
                q();
            }
            this.r.r0(i, i2);
            u80Var.i = true;
            r();
            this.r.t0(i, i2);
            if (this.r.w0()) {
                this.r.r0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                u80Var.i = true;
                r();
                this.r.t0(i, i2);
            }
            this.B0 = getMeasuredWidth();
            this.C0 = getMeasuredHeight();
            return;
        }
        if (this.x) {
            this.r.b.n(i, i2);
            return;
        }
        if (this.E) {
            d0();
            Q();
            U();
            R(true);
            if (u80Var.k) {
                u80Var.g = true;
            } else {
                this.i.d();
                u80Var.g = false;
            }
            this.E = false;
            e0(false);
        } else if (u80Var.k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        z70 z70Var = this.q;
        if (z70Var != null) {
            u80Var.e = z70Var.a();
        } else {
            u80Var.e = 0;
        }
        d0();
        this.r.b.n(i, i2);
        e0(false);
        u80Var.g = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (M()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof r80)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        r80 r80Var = (r80) parcelable;
        this.h = r80Var;
        super.onRestoreInstanceState(r80Var.f);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        r80 r80Var = new r80(super.onSaveInstanceState());
        r80 r80Var2 = this.h;
        if (r80Var2 != null) {
            r80Var.h = r80Var2.h;
            return r80Var;
        }
        h80 h80Var = this.r;
        if (h80Var != null) {
            r80Var.h = h80Var.f0();
            return r80Var;
        }
        r80Var.h = null;
        return r80Var;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.P = null;
        this.N = null;
        this.O = null;
        this.M = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:198:0x030a, code lost:
    
        if (r1 < r2) goto L156;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0112  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int i;
        int i2;
        int minFlingVelocity;
        boolean z2;
        int H;
        PointF a;
        int i3;
        int i4;
        boolean z3;
        if (!this.B && !this.C) {
            k80 k80Var = this.v;
            if (k80Var == null) {
                z = motionEvent.getAction() == 0 ? false : C(motionEvent);
            } else {
                k80Var.a(motionEvent);
                int action = motionEvent.getAction();
                if (action == 3 || action == 1) {
                    this.v = null;
                }
                z = true;
            }
            if (z) {
                Y();
                setScrollState(0);
                return true;
            }
            h80 h80Var = this.r;
            if (h80Var != null) {
                boolean d = h80Var.d();
                boolean e = this.r.e();
                if (this.T == null) {
                    this.T = VelocityTracker.obtain();
                }
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                int[] iArr = this.w0;
                if (actionMasked == 0) {
                    iArr[1] = 0;
                    iArr[0] = 0;
                }
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.offsetLocation(iArr[0], iArr[1]);
                if (actionMasked == 0) {
                    this.S = motionEvent.getPointerId(0);
                    int x = (int) (motionEvent.getX() + 0.5f);
                    this.W = x;
                    this.U = x;
                    int y = (int) (motionEvent.getY() + 0.5f);
                    this.a0 = y;
                    this.V = y;
                    int i5 = d;
                    if (e) {
                        i5 = (d ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i5, 0);
                } else {
                    if (actionMasked == 1) {
                        this.T.addMovement(obtain);
                        VelocityTracker velocityTracker = this.T;
                        int i6 = this.e0;
                        velocityTracker.computeCurrentVelocity(1000, i6);
                        float f = d != 0 ? -this.T.getXVelocity(this.S) : 0.0f;
                        float f2 = e ? -this.T.getYVelocity(this.S) : 0.0f;
                        if (f == 0.0f && f2 == 0.0f) {
                            i4 = 0;
                        } else {
                            int i7 = (int) f;
                            int i8 = (int) f2;
                            h80 h80Var2 = this.r;
                            if (h80Var2 == null) {
                                Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                            } else if (!this.B) {
                                boolean d2 = h80Var2.d();
                                boolean e2 = this.r.e();
                                int i9 = this.d0;
                                if (d2 == 0 || Math.abs(i7) < i9) {
                                    i7 = 0;
                                }
                                if (!e2 || Math.abs(i8) < i9) {
                                    i8 = 0;
                                }
                                if (i7 != 0 || i8 != 0) {
                                    float f3 = i7;
                                    float f4 = i8;
                                    if (!dispatchNestedPreFling(f3, f4)) {
                                        boolean z4 = d2 != 0 || e2;
                                        dispatchNestedFling(f3, f4, z4);
                                        j80 j80Var = this.c0;
                                        if (j80Var != null) {
                                            j50 j50Var = (j50) j80Var;
                                            h80 layoutManager = j50Var.a.getLayoutManager();
                                            if (layoutManager != 0 && j50Var.a.getAdapter() != null && ((Math.abs(i8) > (minFlingVelocity = j50Var.a.getMinFlingVelocity()) || Math.abs(i7) > minFlingVelocity) && ((z2 = layoutManager instanceof t80)))) {
                                                i50 i50Var = !z2 ? null : new i50(j50Var, j50Var.a.getContext());
                                                if (i50Var != null) {
                                                    int B = layoutManager.B();
                                                    if (B != 0) {
                                                        wl e3 = layoutManager.e() ? j50Var.e(layoutManager) : layoutManager.d() ? j50Var.d(layoutManager) : null;
                                                        if (e3 != null) {
                                                            int v = layoutManager.v();
                                                            int i10 = Integer.MIN_VALUE;
                                                            int i11 = Integer.MAX_VALUE;
                                                            View view = null;
                                                            View view2 = null;
                                                            i2 = 1;
                                                            int i12 = 0;
                                                            int i13 = d2;
                                                            while (i12 < v) {
                                                                int i14 = i13;
                                                                View u = layoutManager.u(i12);
                                                                if (u == null) {
                                                                    i3 = i12;
                                                                } else {
                                                                    i3 = i12;
                                                                    int b = j50.b(u, e3);
                                                                    if (b <= 0 && b > i10) {
                                                                        view2 = u;
                                                                        i10 = b;
                                                                    }
                                                                    if (b >= 0 && b < i11) {
                                                                        view = u;
                                                                        i11 = b;
                                                                    }
                                                                }
                                                                i12 = i3 + 1;
                                                                i13 = i14;
                                                            }
                                                            i = i13;
                                                            boolean z5 = !layoutManager.d() ? i8 <= 0 : i7 <= 0;
                                                            if (z5 && view != null) {
                                                                H = h80.H(view);
                                                            } else if (z5 || view2 == null) {
                                                                if (z5) {
                                                                    view = view2;
                                                                }
                                                                if (view != null) {
                                                                    H = ((z2 && (a = ((t80) layoutManager).a(layoutManager.B() + (-1))) != null && ((a.x > 0.0f ? 1 : (a.x == 0.0f ? 0 : -1)) < 0 || (a.y > 0.0f ? 1 : (a.y == 0.0f ? 0 : -1)) < 0)) == z5 ? -1 : 1) + h80.H(view);
                                                                    if (H >= 0) {
                                                                    }
                                                                }
                                                                H = -1;
                                                            } else {
                                                                H = h80.H(view2);
                                                            }
                                                            if (H != -1) {
                                                                i50Var.a = H;
                                                                layoutManager.z0(i50Var);
                                                                Y();
                                                                obtain.recycle();
                                                                return true;
                                                            }
                                                            if (z4) {
                                                                getScrollingChildHelper().g(e2 ? i | 2 : i, i2);
                                                                int i15 = -i6;
                                                                int max = Math.max(i15, Math.min(i7, i6));
                                                                int max2 = Math.max(i15, Math.min(i8, i6));
                                                                w80 w80Var = this.i0;
                                                                RecyclerView recyclerView = w80Var.l;
                                                                recyclerView.setScrollState(2);
                                                                w80Var.g = 0;
                                                                w80Var.f = 0;
                                                                Interpolator interpolator = w80Var.i;
                                                                yv yvVar = G0;
                                                                if (interpolator != yvVar) {
                                                                    w80Var.i = yvVar;
                                                                    w80Var.h = new OverScroller(recyclerView.getContext(), yvVar);
                                                                }
                                                                w80Var.h.fling(0, 0, max, max2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                                                w80Var.a();
                                                                Y();
                                                                obtain.recycle();
                                                                return true;
                                                            }
                                                        }
                                                    }
                                                    i = d2 ? 1 : 0;
                                                    i2 = 1;
                                                    H = -1;
                                                    if (H != -1) {
                                                    }
                                                    if (z4) {
                                                    }
                                                }
                                            }
                                        }
                                        i = d2 ? 1 : 0;
                                        i2 = 1;
                                        if (z4) {
                                        }
                                    }
                                }
                            }
                            i4 = 0;
                        }
                        setScrollState(i4);
                        Y();
                        obtain.recycle();
                        return true;
                    }
                    if (actionMasked == 2) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.S);
                        if (findPointerIndex < 0) {
                            Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.S + " not found. Did any MotionEvents get skipped?");
                            return false;
                        }
                        int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                        int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                        int i16 = this.W - x2;
                        int i17 = this.a0 - y2;
                        if (this.R != 1) {
                            if (d != 0) {
                                int i18 = this.b0;
                                i16 = i16 > 0 ? Math.max(0, i16 - i18) : Math.min(0, i16 + i18);
                                if (i16 != 0) {
                                    z3 = true;
                                    if (e) {
                                        int i19 = this.b0;
                                        i17 = i17 > 0 ? Math.max(0, i17 - i19) : Math.min(0, i17 + i19);
                                        if (i17 != 0) {
                                            z3 = true;
                                        }
                                    }
                                    if (z3) {
                                        setScrollState(1);
                                    }
                                }
                            }
                            z3 = false;
                            if (e) {
                            }
                            if (z3) {
                            }
                        }
                        int i20 = i16;
                        int i21 = i17;
                        if (this.R == 1) {
                            int[] iArr2 = this.x0;
                            iArr2[0] = 0;
                            iArr2[1] = 0;
                            boolean s = s(d != 0 ? i20 : 0, e ? i21 : 0, 0, iArr2, this.v0);
                            int[] iArr3 = this.v0;
                            if (s) {
                                i20 -= iArr2[0];
                                i21 -= iArr2[1];
                                iArr[0] = iArr[0] + iArr3[0];
                                iArr[1] = iArr[1] + iArr3[1];
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            int i22 = i21;
                            this.W = x2 - iArr3[0];
                            this.a0 = y2 - iArr3[1];
                            if (Z(d != 0 ? i20 : 0, e ? i22 : 0, motionEvent, 0)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            hs hsVar = this.j0;
                            if (hsVar != null && (i20 != 0 || i22 != 0)) {
                                hsVar.a(this, i20, i22);
                            }
                        }
                    } else if (actionMasked == 3) {
                        Y();
                        setScrollState(0);
                    } else if (actionMasked == 5) {
                        this.S = motionEvent.getPointerId(actionIndex);
                        int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.W = x3;
                        this.U = x3;
                        int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        this.a0 = y3;
                        this.V = y3;
                    } else if (actionMasked == 6) {
                        S(motionEvent);
                    }
                }
                this.T.addMovement(obtain);
                obtain.recycle();
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x035a, code lost:
    
        if (((java.util.ArrayList) r7.d).contains(getFocusedChild()) == false) goto L227;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p() {
        boolean z;
        x80 x80Var;
        View findViewById;
        boolean z2;
        zd0 zd0Var;
        t30 t30Var;
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
        u80 u80Var = this.l0;
        boolean z4 = false;
        u80Var.i = false;
        boolean z5 = true;
        Object[] objArr = this.A0 && !(this.B0 == getWidth() && this.C0 == getHeight());
        this.B0 = 0;
        this.C0 = 0;
        this.A0 = false;
        if (u80Var.d == 1) {
            q();
            this.r.q0(this);
            r();
        } else {
            f2 f2Var = this.i;
            if ((((ArrayList) f2Var.d).isEmpty() || ((ArrayList) f2Var.c).isEmpty()) && !objArr == true && this.r.n == getWidth() && this.r.o == getHeight()) {
                this.r.q0(this);
            } else {
                this.r.q0(this);
                r();
            }
        }
        u80Var.a(4);
        d0();
        Q();
        u80Var.d = 1;
        boolean z6 = u80Var.j;
        s6 s6Var = this.j;
        o80 o80Var = this.g;
        tl0 tl0Var = this.k;
        if (z6) {
            int h = s6Var.h() - 1;
            while (h >= 0) {
                x80 J = J(s6Var.g(h));
                if (J.p()) {
                    z3 = z5;
                } else {
                    long H = H(J);
                    this.Q.getClass();
                    t30 t30Var2 = new t30();
                    t30Var2.a(J);
                    ez ezVar = (ez) tl0Var.h;
                    z3 = z5;
                    zd0 zd0Var2 = (zd0) tl0Var.g;
                    x80 x80Var2 = (x80) ezVar.b(H);
                    if (x80Var2 == null || x80Var2.p()) {
                        tl0Var.a(J, t30Var2);
                    } else {
                        nm0 nm0Var = (nm0) zd0Var2.get(x80Var2);
                        boolean z7 = (nm0Var == null || (nm0Var.a & 1) == 0) ? z4 : z3;
                        nm0 nm0Var2 = (nm0) zd0Var2.get(J);
                        boolean z8 = (nm0Var2 == null || (nm0Var2.a & 1) == 0) ? z4 : z3;
                        if (z7 && x80Var2 == J) {
                            tl0Var.a(J, t30Var2);
                        } else {
                            t30 d = tl0Var.d(x80Var2, 4);
                            tl0Var.a(J, t30Var2);
                            t30 d2 = tl0Var.d(J, 8);
                            if (d == null) {
                                int h2 = s6Var.h();
                                for (int i = 0; i < h2; i++) {
                                    x80 J2 = J(s6Var.g(i));
                                    if (J2 != J && H(J2) == H) {
                                        z70 z70Var = this.q;
                                        if (z70Var == null || !z70Var.b) {
                                            throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + J2 + " \n View Holder 2:" + J + z());
                                        }
                                        throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + J2 + " \n View Holder 2:" + J + z());
                                    }
                                }
                                Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + x80Var2 + " cannot be found but it is necessary for " + J + z());
                            } else {
                                x80Var2.o(false);
                                if (z7) {
                                    f(x80Var2);
                                }
                                if (x80Var2 != J) {
                                    if (z8) {
                                        f(J);
                                    }
                                    x80Var2.h = J;
                                    f(x80Var2);
                                    o80Var.k(x80Var2);
                                    J.o(false);
                                    J.i = x80Var2;
                                }
                                if (this.Q.a(x80Var2, J, d, d2)) {
                                    T();
                                }
                            }
                        }
                    }
                }
                h--;
                z5 = z3;
                z4 = false;
            }
            z = z5;
            zd0 zd0Var3 = (zd0) tl0Var.g;
            int i2 = zd0Var3.h - 1;
            while (i2 >= 0) {
                x80 x80Var3 = (x80) zd0Var3.f(i2);
                nm0 nm0Var3 = (nm0) zd0Var3.g(i2);
                int i3 = nm0Var3.a;
                int i4 = i3 & 3;
                w70 w70Var = this.D0;
                if (i4 == 3) {
                    RecyclerView recyclerView = w70Var.a;
                    recyclerView.r.j0(x80Var3.a, recyclerView.g);
                } else if ((i3 & 1) != 0) {
                    t30 t30Var3 = nm0Var3.b;
                    if (t30Var3 == null) {
                        RecyclerView recyclerView2 = w70Var.a;
                        recyclerView2.r.j0(x80Var3.a, recyclerView2.g);
                    } else {
                        w70Var.g(x80Var3, t30Var3, nm0Var3.c);
                    }
                } else if ((i3 & 14) == 14) {
                    w70Var.f(x80Var3, nm0Var3.b, nm0Var3.c);
                } else if ((i3 & 12) == 12) {
                    t30 t30Var4 = nm0Var3.b;
                    t30 t30Var5 = nm0Var3.c;
                    w70Var.getClass();
                    x80Var3.o(false);
                    RecyclerView recyclerView3 = w70Var.a;
                    boolean z9 = recyclerView3.H;
                    d80 d80Var = recyclerView3.Q;
                    if (!z9) {
                        pi piVar = (pi) d80Var;
                        piVar.getClass();
                        int i5 = t30Var4.a;
                        int i6 = t30Var5.a;
                        if (i5 == i6) {
                            zd0Var = zd0Var3;
                            if (t30Var4.b == t30Var5.b) {
                                piVar.c(x80Var3);
                                g = false;
                                if (g) {
                                    recyclerView3.T();
                                }
                                t30Var = null;
                                nm0Var3.a = 0;
                                nm0Var3.b = t30Var;
                                nm0Var3.c = t30Var;
                                nm0.d.c(nm0Var3);
                                i2--;
                                zd0Var3 = zd0Var;
                            }
                        } else {
                            zd0Var = zd0Var3;
                        }
                        g = piVar.g(x80Var3, i5, t30Var4.b, i6, t30Var5.b);
                        if (g) {
                        }
                        t30Var = null;
                        nm0Var3.a = 0;
                        nm0Var3.b = t30Var;
                        nm0Var3.c = t30Var;
                        nm0.d.c(nm0Var3);
                        i2--;
                        zd0Var3 = zd0Var;
                    } else if (d80Var.a(x80Var3, x80Var3, t30Var4, t30Var5)) {
                        recyclerView3.T();
                    }
                } else {
                    zd0Var = zd0Var3;
                    if ((i3 & 4) != 0) {
                        t30Var = null;
                        w70Var.g(x80Var3, nm0Var3.b, null);
                    } else {
                        t30Var = null;
                        if ((i3 & 8) != 0) {
                            w70Var.f(x80Var3, nm0Var3.b, nm0Var3.c);
                        }
                    }
                    nm0Var3.a = 0;
                    nm0Var3.b = t30Var;
                    nm0Var3.c = t30Var;
                    nm0.d.c(nm0Var3);
                    i2--;
                    zd0Var3 = zd0Var;
                }
                zd0Var = zd0Var3;
                t30Var = null;
                nm0Var3.a = 0;
                nm0Var3.b = t30Var;
                nm0Var3.c = t30Var;
                nm0.d.c(nm0Var3);
                i2--;
                zd0Var3 = zd0Var;
            }
        } else {
            z = true;
        }
        View view = null;
        this.r.i0(o80Var);
        u80Var.b = u80Var.e;
        this.H = false;
        this.I = false;
        u80Var.j = false;
        u80Var.k = false;
        this.r.f = false;
        ArrayList arrayList = o80Var.b;
        if (arrayList != null) {
            arrayList.clear();
        }
        h80 h80Var = this.r;
        if (h80Var.k) {
            h80Var.j = 0;
            h80Var.k = false;
            o80Var.l();
        }
        this.r.d0(u80Var);
        boolean z10 = z;
        R(z10);
        e0(false);
        ((zd0) tl0Var.g).clear();
        ((ez) tl0Var.h).a();
        int[] iArr = this.t0;
        int i7 = iArr[0];
        int i8 = iArr[z10 ? 1 : 0];
        D(iArr);
        if ((iArr[0] == i7 && iArr[z10 ? 1 : 0] == i8) ? false : true) {
            u(0, 0);
        }
        if (this.h0 && this.q != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (!isFocused()) {
            }
            long j = u80Var.m;
            if (j != -1 && (z2 = this.q.b) && z2) {
                int p = s6Var.p();
                x80Var = null;
                int i9 = 0;
                while (true) {
                    if (i9 >= p) {
                        break;
                    }
                    x80 J3 = J(s6Var.o(i9));
                    if (J3 != null && !J3.i() && J3.e == j) {
                        if (!((ArrayList) s6Var.d).contains(J3.a)) {
                            x80Var = J3;
                            break;
                        }
                        x80Var = J3;
                    }
                    i9++;
                }
            } else {
                x80Var = null;
            }
            if (x80Var != null) {
                View view2 = x80Var.a;
                if (!((ArrayList) s6Var.d).contains(view2) && view2.hasFocusable()) {
                    view = view2;
                    if (view != null) {
                        int i10 = u80Var.n;
                        if (i10 != -1 && (findViewById = view.findViewById(i10)) != null && findViewById.isFocusable()) {
                            view = findViewById;
                        }
                        view.requestFocus();
                    }
                }
            }
            if (s6Var.h() > 0) {
                int i11 = u80Var.l;
                if (i11 == -1) {
                    i11 = 0;
                }
                int b = u80Var.b();
                for (int i12 = i11; i12 < b; i12++) {
                    x80 F = F(i12);
                    if (F == null) {
                        break;
                    }
                    View view3 = F.a;
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
                    x80 F2 = F(min);
                    if (F2 == null) {
                        break;
                    }
                    View view4 = F2.a;
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
        u80Var.m = -1L;
        u80Var.l = -1;
        u80Var.n = -1;
    }

    public final void q() {
        nm0 nm0Var;
        View B;
        u80 u80Var = this.l0;
        u80Var.a(1);
        A(u80Var);
        u80Var.i = false;
        d0();
        tl0 tl0Var = this.k;
        zd0 zd0Var = (zd0) tl0Var.g;
        zd0 zd0Var2 = (zd0) tl0Var.g;
        zd0Var.clear();
        ez ezVar = (ez) tl0Var.h;
        ezVar.a();
        Q();
        U();
        x80 x80Var = null;
        View focusedChild = (this.h0 && hasFocus() && this.q != null) ? getFocusedChild() : null;
        if (focusedChild != null && (B = B(focusedChild)) != null) {
            x80Var = I(B);
        }
        if (x80Var == null) {
            u80Var.m = -1L;
            u80Var.l = -1;
            u80Var.n = -1;
        } else {
            u80Var.m = this.q.b ? x80Var.e : -1L;
            u80Var.l = this.H ? -1 : x80Var.i() ? x80Var.d : x80Var.b();
            View view = x80Var.a;
            int id = view.getId();
            while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                    id = view.getId();
                }
            }
            u80Var.n = id;
        }
        u80Var.h = u80Var.j && this.p0;
        this.p0 = false;
        this.o0 = false;
        u80Var.g = u80Var.k;
        u80Var.e = this.q.a();
        D(this.t0);
        boolean z = u80Var.j;
        s6 s6Var = this.j;
        if (z) {
            int h = s6Var.h();
            for (int i = 0; i < h; i++) {
                x80 J = J(s6Var.g(i));
                if (!J.p() && (!J.g() || this.q.b)) {
                    d80 d80Var = this.Q;
                    d80.b(J);
                    J.d();
                    d80Var.getClass();
                    t30 t30Var = new t30();
                    t30Var.a(J);
                    nm0 nm0Var2 = (nm0) zd0Var2.get(J);
                    if (nm0Var2 == null) {
                        nm0Var2 = nm0.a();
                        zd0Var2.put(J, nm0Var2);
                    }
                    nm0Var2.b = t30Var;
                    nm0Var2.a |= 4;
                    if (u80Var.h && J.l() && !J.i() && !J.p() && !J.g()) {
                        ezVar.d(H(J), J);
                    }
                }
            }
        }
        if (u80Var.k) {
            int p = s6Var.p();
            for (int i2 = 0; i2 < p; i2++) {
                x80 J2 = J(s6Var.o(i2));
                if (!J2.p() && J2.d == -1) {
                    J2.d = J2.c;
                }
            }
            boolean z2 = u80Var.f;
            u80Var.f = false;
            this.r.c0(this.g, u80Var);
            u80Var.f = z2;
            for (int i3 = 0; i3 < s6Var.h(); i3++) {
                x80 J3 = J(s6Var.g(i3));
                if (!J3.p() && ((nm0Var = (nm0) zd0Var2.get(J3)) == null || (nm0Var.a & 4) == 0)) {
                    d80.b(J3);
                    boolean z3 = (J3.j & 8192) != 0;
                    d80 d80Var2 = this.Q;
                    J3.d();
                    d80Var2.getClass();
                    t30 t30Var2 = new t30();
                    t30Var2.a(J3);
                    if (z3) {
                        V(J3, t30Var2);
                    } else {
                        nm0 nm0Var3 = (nm0) zd0Var2.get(J3);
                        if (nm0Var3 == null) {
                            nm0Var3 = nm0.a();
                            zd0Var2.put(J3, nm0Var3);
                        }
                        nm0Var3.a |= 2;
                        nm0Var3.b = t30Var2;
                    }
                }
            }
            k();
        } else {
            k();
        }
        R(true);
        e0(false);
        u80Var.d = 2;
    }

    public final void r() {
        d0();
        Q();
        u80 u80Var = this.l0;
        u80Var.a(6);
        this.i.d();
        u80Var.e = this.q.a();
        u80Var.c = 0;
        if (this.h != null) {
            z70 z70Var = this.q;
            z70Var.getClass();
            int i = x70.a[z70Var.c.ordinal()];
            if (i != 1 && (i != 2 || z70Var.a() > 0)) {
                Parcelable parcelable = this.h.h;
                if (parcelable != null) {
                    this.r.e0(parcelable);
                }
                this.h = null;
            }
        }
        u80Var.g = false;
        this.r.c0(this.g, u80Var);
        u80Var.f = false;
        u80Var.j = u80Var.j && this.Q != null;
        u80Var.d = 4;
        R(true);
        e0(false);
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        x80 J = J(view);
        if (J != null) {
            if (J.k()) {
                J.j &= -257;
            } else if (!J.p()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + J + z());
            }
        }
        view.clearAnimation();
        o(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        wx wxVar = this.r.e;
        if ((wxVar == null || !wxVar.e) && !M() && view2 != null) {
            X(view, view2);
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
            ((k80) arrayList.get(i)).c(z);
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

    public final boolean s(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i2, i3, iArr, iArr2);
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        h80 h80Var = this.r;
        if (h80Var == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.B) {
            return;
        }
        boolean d = h80Var.d();
        boolean e = this.r.e();
        if (d || e) {
            if (!d) {
                i = 0;
            }
            if (!e) {
                i2 = 0;
            }
            Z(i, i2, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!M()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.D |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(z80 z80Var) {
        this.s0 = z80Var;
        hm0.m(this, z80Var);
    }

    public void setAdapter(z70 z70Var) {
        setLayoutFrozen(false);
        z70 z70Var2 = this.q;
        q80 q80Var = this.f;
        if (z70Var2 != null) {
            z70Var2.a.unregisterObserver(q80Var);
            this.q.getClass();
        }
        d80 d80Var = this.Q;
        if (d80Var != null) {
            d80Var.e();
        }
        h80 h80Var = this.r;
        o80 o80Var = this.g;
        if (h80Var != null) {
            h80Var.h0(o80Var);
            this.r.i0(o80Var);
        }
        o80Var.a.clear();
        o80Var.e();
        f2 f2Var = this.i;
        f2Var.r((ArrayList) f2Var.c);
        f2Var.r((ArrayList) f2Var.d);
        f2Var.a = 0;
        z70 z70Var3 = this.q;
        this.q = z70Var;
        if (z70Var != null) {
            z70Var.a.registerObserver(q80Var);
        }
        h80 h80Var2 = this.r;
        if (h80Var2 != null) {
            h80Var2.Q();
        }
        z70 z70Var4 = this.q;
        o80Var.a.clear();
        o80Var.e();
        n80 c = o80Var.c();
        if (z70Var3 != null) {
            c.b--;
        }
        if (c.b == 0) {
            SparseArray sparseArray = c.a;
            for (int i = 0; i < sparseArray.size(); i++) {
                ((m80) sparseArray.valueAt(i)).a.clear();
            }
        }
        if (z70Var4 != null) {
            c.b++;
        }
        this.l0.f = true;
        this.I |= false;
        this.H = true;
        s6 s6Var = this.j;
        int p = s6Var.p();
        for (int i2 = 0; i2 < p; i2++) {
            x80 J = J(s6Var.o(i2));
            if (J != null && !J.p()) {
                J.a(6);
            }
        }
        O();
        ArrayList arrayList = o80Var.c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            x80 x80Var = (x80) arrayList.get(i3);
            if (x80Var != null) {
                x80Var.a(6);
                x80Var.a(1024);
            }
        }
        z70 z70Var5 = o80Var.h.q;
        if (z70Var5 == null || !z70Var5.b) {
            o80Var.e();
        }
        requestLayout();
    }

    public void setChildDrawingOrderCallback(b80 b80Var) {
        if (b80Var == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.l) {
            this.P = null;
            this.N = null;
            this.O = null;
            this.M = null;
        }
        this.l = z;
        super.setClipToPadding(z);
        if (this.y) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(c80 c80Var) {
        c80Var.getClass();
        this.L = c80Var;
        this.P = null;
        this.N = null;
        this.O = null;
        this.M = null;
    }

    public void setHasFixedSize(boolean z) {
        this.x = z;
    }

    public void setItemAnimator(d80 d80Var) {
        d80 d80Var2 = this.Q;
        if (d80Var2 != null) {
            d80Var2.e();
            this.Q.a = null;
        }
        this.Q = d80Var;
        if (d80Var != null) {
            d80Var.a = this.q0;
        }
    }

    public void setItemViewCacheSize(int i) {
        o80 o80Var = this.g;
        o80Var.e = i;
        o80Var.l();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(h80 h80Var) {
        RecyclerView recyclerView;
        wx wxVar;
        if (h80Var == this.r) {
            return;
        }
        setScrollState(0);
        w80 w80Var = this.i0;
        w80Var.l.removeCallbacks(w80Var);
        w80Var.h.abortAnimation();
        h80 h80Var2 = this.r;
        if (h80Var2 != null && (wxVar = h80Var2.e) != null) {
            wxVar.i();
        }
        h80 h80Var3 = this.r;
        o80 o80Var = this.g;
        if (h80Var3 != null) {
            d80 d80Var = this.Q;
            if (d80Var != null) {
                d80Var.e();
            }
            this.r.h0(o80Var);
            this.r.i0(o80Var);
            o80Var.a.clear();
            o80Var.e();
            if (this.w) {
                h80 h80Var4 = this.r;
                h80Var4.g = false;
                h80Var4.S(this);
            }
            this.r.u0(null);
            this.r = null;
        } else {
            o80Var.a.clear();
            o80Var.e();
        }
        s6 s6Var = this.j;
        ((mb) s6Var.c).h();
        ArrayList arrayList = (ArrayList) s6Var.d;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = ((w70) s6Var.b).a;
            if (size < 0) {
                break;
            }
            x80 J = J((View) arrayList.get(size));
            if (J != null) {
                int i = J.p;
                if (recyclerView.M()) {
                    J.q = i;
                    recyclerView.y0.add(J);
                } else {
                    View view = J.a;
                    WeakHashMap weakHashMap = hm0.a;
                    view.setImportantForAccessibility(i);
                }
                J.p = 0;
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            recyclerView.o(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.r = h80Var;
        if (h80Var != null) {
            if (h80Var.b != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(h80Var);
                String z = h80Var.b.z();
                sb.append(" is already attached to a RecyclerView:");
                sb.append(z);
                throw new IllegalArgumentException(sb.toString());
            }
            h80Var.u0(this);
            if (this.w) {
                h80 h80Var5 = this.r;
                h80Var5.g = true;
                h80Var5.R(this);
            }
        }
        o80Var.l();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
        } else {
            s9.k("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        q30 scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.d) {
            ViewGroup viewGroup = scrollingChildHelper.c;
            WeakHashMap weakHashMap = hm0.a;
            viewGroup.stopNestedScroll();
        }
        scrollingChildHelper.d = z;
    }

    public void setOnFlingListener(j80 j80Var) {
        this.c0 = j80Var;
    }

    @Deprecated
    public void setOnScrollListener(l80 l80Var) {
        this.m0 = l80Var;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.h0 = z;
    }

    public void setRecycledViewPool(n80 n80Var) {
        o80 o80Var = this.g;
        if (o80Var.g != null) {
            r0.b--;
        }
        o80Var.g = n80Var;
        if (n80Var == null || o80Var.h.getAdapter() == null) {
            return;
        }
        o80Var.g.b++;
    }

    public void setScrollState(int i) {
        wx wxVar;
        if (i == this.R) {
            return;
        }
        this.R = i;
        if (i != 2) {
            w80 w80Var = this.i0;
            w80Var.l.removeCallbacks(w80Var);
            w80Var.h.abortAnimation();
            h80 h80Var = this.r;
            if (h80Var != null && (wxVar = h80Var.e) != null) {
                wxVar.i();
            }
        }
        h80 h80Var2 = this.r;
        if (h80Var2 != null) {
            h80Var2.g0(i);
        }
        l80 l80Var = this.m0;
        if (l80Var != null) {
            l80Var.a(this, i);
        }
        ArrayList arrayList = this.n0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((l80) this.n0.get(size)).a(this, i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.b0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.b0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(v80 v80Var) {
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
        wx wxVar;
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
            w80 w80Var = this.i0;
            w80Var.l.removeCallbacks(w80Var);
            w80Var.h.abortAnimation();
            h80 h80Var = this.r;
            if (h80Var == null || (wxVar = h80Var.e) == null) {
                return;
            }
            wxVar.i();
        }
    }

    public final void t(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().d(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public final void u(int i, int i2) {
        this.K++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        l80 l80Var = this.m0;
        if (l80Var != null) {
            l80Var.b(this, i, i2);
        }
        ArrayList arrayList = this.n0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((l80) this.n0.get(size)).b(this, i, i2);
            }
        }
        this.K--;
    }

    public final void v() {
        if (this.P != null) {
            return;
        }
        this.L.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.P = edgeEffect;
        if (this.l) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void w() {
        if (this.M != null) {
            return;
        }
        this.L.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.M = edgeEffect;
        if (this.l) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void x() {
        if (this.O != null) {
            return;
        }
        this.L.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.O = edgeEffect;
        if (this.l) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void y() {
        if (this.N != null) {
            return;
        }
        this.L.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.N = edgeEffect;
        if (this.l) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String z() {
        return " " + super.toString() + ", adapter:" + this.q + ", layout:" + this.r + ", context:" + getContext();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        h80 h80Var = this.r;
        if (h80Var != null) {
            return h80Var.t(layoutParams);
        }
        s9.u("RecyclerView has no LayoutManager".concat(z()));
        return null;
    }

    @Deprecated
    public void setRecyclerListener(p80 p80Var) {
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.trembin.nirefon.betfury.R.attr.recyclerViewStyle);
    }
}
