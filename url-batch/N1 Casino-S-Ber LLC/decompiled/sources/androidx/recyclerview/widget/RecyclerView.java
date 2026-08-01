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
import defpackage.a6;
import defpackage.av;
import defpackage.az;
import defpackage.bv;
import defpackage.bz;
import defpackage.ca;
import defpackage.cj;
import defpackage.cp;
import defpackage.cz;
import defpackage.d30;
import defpackage.dz;
import defpackage.e90;
import defpackage.ep;
import defpackage.ev;
import defpackage.ez;
import defpackage.fz;
import defpackage.gz;
import defpackage.hh;
import defpackage.hr;
import defpackage.hz;
import defpackage.im;
import defpackage.jq;
import defpackage.jz;
import defpackage.km;
import defpackage.kz;
import defpackage.lz;
import defpackage.mz;
import defpackage.n60;
import defpackage.nw;
import defpackage.ny;
import defpackage.nz;
import defpackage.or;
import defpackage.ow;
import defpackage.oy;
import defpackage.py;
import defpackage.pz;
import defpackage.q4;
import defpackage.r80;
import defpackage.re;
import defpackage.ry;
import defpackage.sy;
import defpackage.t8;
import defpackage.ty;
import defpackage.u20;
import defpackage.ux;
import defpackage.uy;
import defpackage.w1;
import defpackage.x1;
import defpackage.x80;
import defpackage.xy;
import defpackage.yy;
import defpackage.zy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements av {
    public static final int[] E0 = {R.attr.nestedScrollingEnabled};
    public static final Class[] F0;
    public static final cp G0;
    public boolean A;
    public boolean A0;
    public boolean B;
    public int B0;
    public boolean C;
    public int C0;
    public int D;
    public final oy D0;
    public boolean E;
    public final AccessibilityManager F;
    public ArrayList G;
    public boolean H;
    public boolean I;
    public int J;
    public int K;
    public sy L;
    public EdgeEffect M;
    public EdgeEffect N;
    public EdgeEffect O;
    public EdgeEffect P;
    public ty Q;
    public int R;
    public int S;
    public VelocityTracker T;
    public int U;
    public int V;
    public int W;
    public int a0;
    public int b0;
    public zy c0;
    public final int d0;
    public final int e0;
    public final gz f;
    public final float f0;
    public final ez g;
    public final float g0;
    public hz h;
    public boolean h0;
    public final x1 i;
    public final mz i0;
    public final a6 j;
    public km j0;
    public final q4 k;
    public final im k0;
    public boolean l;
    public final kz l0;
    public final ny m;
    public bz m0;
    public final Rect n;
    public ArrayList n0;
    public final Rect o;
    public boolean o0;
    public final RectF p;
    public boolean p0;
    public py q;
    public final oy q0;
    public xy r;
    public boolean r0;
    public final ArrayList s;
    public pz s0;
    public final ArrayList t;
    public final int[] t0;
    public final ArrayList u;
    public bv u0;
    public az v;
    public final int[] v0;
    public boolean w;
    public final int[] w0;
    public boolean x;
    public final int[] x0;
    public boolean y;
    public final ArrayList y0;
    public int z;
    public final ny z0;

    static {
        Class cls = Integer.TYPE;
        F0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        G0 = new cp(2);
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
        this.f = new gz(this);
        this.g = new ez(this);
        this.k = new q4(27);
        this.m = new ny(this, 0);
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
        this.L = new sy();
        re reVar = new re();
        reVar.a = null;
        reVar.b = new ArrayList();
        reVar.c = 120L;
        reVar.d = 120L;
        reVar.e = 250L;
        reVar.f = 250L;
        reVar.g = true;
        reVar.h = new ArrayList();
        reVar.i = new ArrayList();
        reVar.j = new ArrayList();
        reVar.k = new ArrayList();
        reVar.l = new ArrayList();
        reVar.m = new ArrayList();
        reVar.n = new ArrayList();
        reVar.o = new ArrayList();
        reVar.p = new ArrayList();
        reVar.q = new ArrayList();
        reVar.r = new ArrayList();
        this.Q = reVar;
        this.R = 0;
        this.S = -1;
        this.f0 = Float.MIN_VALUE;
        this.g0 = Float.MIN_VALUE;
        this.h0 = true;
        this.i0 = new mz(this);
        this.k0 = new im();
        kz kzVar = new kz();
        kzVar.a = -1;
        kzVar.b = 0;
        kzVar.c = 0;
        kzVar.d = 1;
        kzVar.e = 0;
        kzVar.f = false;
        kzVar.g = false;
        kzVar.h = false;
        kzVar.i = false;
        kzVar.j = false;
        kzVar.k = false;
        this.l0 = kzVar;
        this.o0 = false;
        this.p0 = false;
        oy oyVar = new oy(this);
        this.q0 = oyVar;
        this.r0 = false;
        this.t0 = new int[2];
        this.v0 = new int[2];
        this.w0 = new int[2];
        this.x0 = new int[2];
        this.y0 = new ArrayList();
        this.z0 = new ny(this, 1);
        this.B0 = 0;
        this.C0 = 0;
        this.D0 = new oy(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.b0 = viewConfiguration.getScaledTouchSlop();
        this.f0 = viewConfiguration.getScaledHorizontalScrollFactor();
        this.g0 = viewConfiguration.getScaledVerticalScrollFactor();
        this.d0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.e0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.Q.a = oyVar;
        this.i = new x1(new oy(this));
        this.j = new a6(new oy(this));
        WeakHashMap weakHashMap = x80.a;
        if (r80.a(this) == 0) {
            r80.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.F = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new pz(this));
        int[] iArr = ux.a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        x80.l(this, context, iArr, attributeSet, obtainStyledAttributes, i);
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
                t8.k("Trying to set fast scroller without both required drawables.".concat(z()));
                throw null;
            }
            Resources resources = getContext().getResources();
            c = 3;
            c2 = 2;
            z = 1;
            typedArray = obtainStyledAttributes;
            i2 = 4;
            new cj(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.derinko.gbini.n1casino.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.derinko.gbini.n1casino.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.derinko.gbini.n1casino.R.dimen.fastscroll_margin));
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
                    Class asSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(xy.class);
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
                    setLayoutManager((xy) constructor.newInstance(objArr));
                } catch (ClassCastException e3) {
                    t8.g(attributeSet.getPositionDescription(), ": Class is not a LayoutManager ", str, e3);
                    throw null;
                } catch (ClassNotFoundException e4) {
                    t8.g(attributeSet.getPositionDescription(), ": Unable to find LayoutManager ", str, e4);
                    throw null;
                } catch (IllegalAccessException e5) {
                    t8.g(attributeSet.getPositionDescription(), ": Cannot access non-public constructor ", str, e5);
                    throw null;
                } catch (InstantiationException e6) {
                    t8.g(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e6);
                    throw null;
                } catch (InvocationTargetException e7) {
                    t8.g(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e7);
                    throw null;
                }
            }
        }
        int[] iArr2 = E0;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        x80.l(this, context, iArr2, attributeSet, obtainStyledAttributes2, i);
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

    public static nz J(View view) {
        if (view == null) {
            return null;
        }
        return ((yy) view.getLayoutParams()).a;
    }

    private bv getScrollingChildHelper() {
        if (this.u0 == null) {
            this.u0 = new bv(this);
        }
        return this.u0;
    }

    public static void j(nz nzVar) {
        WeakReference weakReference = nzVar.b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == nzVar.a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            nzVar.b = null;
        }
    }

    public final void A(kz kzVar) {
        if (getScrollState() != 2) {
            kzVar.getClass();
            return;
        }
        OverScroller overScroller = this.i0.h;
        overScroller.getFinalX();
        overScroller.getCurrX();
        kzVar.getClass();
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
            az azVar = (az) arrayList.get(i);
            if (azVar.b(motionEvent) && action != 3) {
                this.v = azVar;
                return true;
            }
        }
        return false;
    }

    public final void D(int[] iArr) {
        a6 a6Var = this.j;
        int i = a6Var.i();
        if (i == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        for (int i4 = 0; i4 < i; i4++) {
            nz J = J(a6Var.h(i4));
            if (!J.p()) {
                int c = J.c();
                if (c < i2) {
                    i2 = c;
                }
                if (c > i3) {
                    i3 = c;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i3;
    }

    public final nz F(int i) {
        nz nzVar = null;
        if (this.H) {
            return null;
        }
        a6 a6Var = this.j;
        int q = a6Var.q();
        for (int i2 = 0; i2 < q; i2++) {
            nz J = J(a6Var.p(i2));
            if (J != null && !J.i() && G(J) == i) {
                if (!((ArrayList) a6Var.d).contains(J.a)) {
                    return J;
                }
                nzVar = J;
            }
        }
        return nzVar;
    }

    public final int G(nz nzVar) {
        if ((nzVar.j & 524) == 0 && nzVar.f()) {
            int i = nzVar.c;
            ArrayList arrayList = (ArrayList) this.i.c;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                w1 w1Var = (w1) arrayList.get(i2);
                int i3 = w1Var.a;
                if (i3 != 1) {
                    if (i3 == 2) {
                        int i4 = w1Var.b;
                        if (i4 <= i) {
                            int i5 = w1Var.d;
                            if (i4 + i5 <= i) {
                                i -= i5;
                            }
                        } else {
                            continue;
                        }
                    } else if (i3 == 8) {
                        int i6 = w1Var.b;
                        if (i6 == i) {
                            i = w1Var.d;
                        } else {
                            if (i6 < i) {
                                i--;
                            }
                            if (w1Var.d <= i) {
                                i++;
                            }
                        }
                    }
                } else if (w1Var.b <= i) {
                    i += w1Var.d;
                }
            }
            return i;
        }
        return -1;
    }

    public final long H(nz nzVar) {
        return this.q.b ? nzVar.e : nzVar.c;
    }

    public final nz I(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return J(view);
        }
        t8.p("View ", view, " is not a direct child of ", this);
        return null;
    }

    public final Rect K(View view) {
        yy yyVar = (yy) view.getLayoutParams();
        boolean z = yyVar.c;
        Rect rect = yyVar.b;
        if (!z || (this.l0.g && (yyVar.a.l() || yyVar.a.g()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.t;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.n;
            rect2.set(0, 0, 0, 0);
            ((uy) arrayList.get(i)).d(rect2, view);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        yyVar.c = false;
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
        a6 a6Var = this.j;
        int q = a6Var.q();
        for (int i = 0; i < q; i++) {
            ((yy) a6Var.p(i).getLayoutParams()).c = true;
        }
        ArrayList arrayList = this.g.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            yy yyVar = (yy) ((nz) arrayList.get(i2)).a.getLayoutParams();
            if (yyVar != null) {
                yyVar.c = true;
            }
        }
    }

    public final void P(int i, int i2, boolean z) {
        int i3 = i + i2;
        a6 a6Var = this.j;
        int q = a6Var.q();
        for (int i4 = 0; i4 < q; i4++) {
            nz J = J(a6Var.p(i4));
            if (J != null && !J.p()) {
                int i5 = J.c;
                kz kzVar = this.l0;
                if (i5 >= i3) {
                    J.m(-i2, z);
                    kzVar.f = true;
                } else if (i5 >= i) {
                    J.a(8);
                    J.m(-i2, z);
                    J.c = i - 1;
                    kzVar.f = true;
                }
            }
        }
        ez ezVar = this.g;
        ArrayList arrayList = ezVar.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            nz nzVar = (nz) arrayList.get(size);
            if (nzVar != null) {
                int i6 = nzVar.c;
                if (i6 >= i3) {
                    nzVar.m(-i2, z);
                } else if (i6 >= i) {
                    nzVar.a(8);
                    ezVar.f(size);
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
                    nz nzVar = (nz) arrayList.get(size);
                    if (nzVar.a.getParent() == this && !nzVar.p() && (i = nzVar.q) != -1) {
                        View view = nzVar.a;
                        WeakHashMap weakHashMap = x80.a;
                        view.setImportantForAccessibility(i);
                        nzVar.q = -1;
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
        WeakHashMap weakHashMap = x80.a;
        postOnAnimation(this.z0);
        this.r0 = true;
    }

    public final void U() {
        boolean z;
        boolean z2 = this.H;
        x1 x1Var = this.i;
        boolean z3 = false;
        if (z2) {
            x1Var.r((ArrayList) x1Var.c);
            x1Var.r((ArrayList) x1Var.d);
            x1Var.a = 0;
            if (this.I) {
                this.r.Y();
            }
        }
        if (this.Q != null && this.r.A0()) {
            x1Var.q();
        } else {
            x1Var.d();
        }
        boolean z4 = this.o0 || this.p0;
        boolean z5 = this.y && this.Q != null && ((z = this.H) || z4 || this.r.f) && (!z || this.q.b);
        kz kzVar = this.l0;
        kzVar.j = z5;
        if (z5 && z4 && !this.H && this.Q != null && this.r.A0()) {
            z3 = true;
        }
        kzVar.k = z3;
    }

    public final void V(nz nzVar, ev evVar) {
        nzVar.j &= -8193;
        boolean z = this.l0.h;
        q4 q4Var = this.k;
        if (z && nzVar.l() && !nzVar.i() && !nzVar.p()) {
            ((hr) q4Var.h).d(H(nzVar), nzVar);
        }
        u20 u20Var = (u20) q4Var.g;
        e90 e90Var = (e90) u20Var.get(nzVar);
        if (e90Var == null) {
            e90Var = e90.a();
            u20Var.put(nzVar, e90Var);
        }
        e90Var.b = evVar;
        e90Var.a |= 4;
    }

    public final void W(uy uyVar) {
        xy xyVar = this.r;
        if (xyVar != null) {
            xyVar.c("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.t;
        arrayList.remove(uyVar);
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
        if (layoutParams instanceof yy) {
            yy yyVar = (yy) layoutParams;
            if (!yyVar.c) {
                Rect rect2 = yyVar.b;
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
            WeakHashMap weakHashMap = x80.a;
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
        py pyVar = this.q;
        int[] iArr = this.x0;
        if (pyVar != null) {
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
                                WeakHashMap weakHashMap = x80.a;
                                postInvalidateOnAnimation();
                            }
                        }
                        z2 = z;
                        if (!z2) {
                        }
                        WeakHashMap weakHashMap2 = x80.a;
                        postInvalidateOnAnimation();
                    }
                }
                z2 = z;
                if (f2 >= 0.0f) {
                }
                z2 = z;
                if (!z2) {
                }
                WeakHashMap weakHashMap22 = x80.a;
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
        nz nzVar;
        d0();
        Q();
        int i3 = n60.a;
        Trace.beginSection("RV Scroll");
        kz kzVar = this.l0;
        A(kzVar);
        ez ezVar = this.g;
        int n0 = i != 0 ? this.r.n0(i, ezVar, kzVar) : 0;
        int p0 = i2 != 0 ? this.r.p0(i2, ezVar, kzVar) : 0;
        Trace.endSection();
        a6 a6Var = this.j;
        int i4 = a6Var.i();
        for (int i5 = 0; i5 < i4; i5++) {
            View h = a6Var.h(i5);
            nz I = I(h);
            if (I != null && (nzVar = I.i) != null) {
                View view = nzVar.a;
                int left = h.getLeft();
                int top = h.getTop();
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
        xy xyVar = this.r;
        if (xyVar != null) {
            xyVar.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    public final void b0(int i) {
        jq jqVar;
        if (this.B) {
            return;
        }
        setScrollState(0);
        mz mzVar = this.i0;
        mzVar.l.removeCallbacks(mzVar);
        mzVar.h.abortAnimation();
        xy xyVar = this.r;
        if (xyVar != null && (jqVar = xyVar.e) != null) {
            jqVar.i();
        }
        xy xyVar2 = this.r;
        if (xyVar2 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            xyVar2.o0(i);
            awakenScrollBars();
        }
    }

    public final void c0(int i, int i2, boolean z) {
        xy xyVar = this.r;
        if (xyVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.B) {
            return;
        }
        if (!xyVar.d()) {
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
        return (layoutParams instanceof yy) && this.r.f((yy) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        xy xyVar = this.r;
        if (xyVar != null && xyVar.d()) {
            return this.r.j(this.l0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        xy xyVar = this.r;
        if (xyVar != null && xyVar.d()) {
            return this.r.k(this.l0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        xy xyVar = this.r;
        if (xyVar != null && xyVar.d()) {
            return this.r.l(this.l0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        xy xyVar = this.r;
        if (xyVar != null && xyVar.e()) {
            return this.r.m(this.l0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        xy xyVar = this.r;
        if (xyVar != null && xyVar.e()) {
            return this.r.n(this.l0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        xy xyVar = this.r;
        if (xyVar != null && xyVar.e()) {
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
            ((uy) arrayList.get(i)).f(canvas, this);
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
            WeakHashMap weakHashMap = x80.a;
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

    public final void f(nz nzVar) {
        View view = nzVar.a;
        boolean z = view.getParent() == this;
        this.g.k(I(view));
        boolean k = nzVar.k();
        a6 a6Var = this.j;
        if (k) {
            a6Var.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            a6Var.a(view, -1, true);
            return;
        }
        int indexOfChild = ((oy) a6Var.b).a.indexOfChild(view);
        if (indexOfChild < 0) {
            t8.v(view, "view is not a child, cannot hide ");
        } else {
            ((ca) a6Var.c).i(indexOfChild);
            a6Var.s(view);
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
        kz kzVar = this.l0;
        ez ezVar = this.g;
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
                            this.r.T(view, i, ezVar, kzVar);
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
                    view2 = this.r.T(view, i, ezVar, kzVar);
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

    public final void g(uy uyVar) {
        xy xyVar = this.r;
        if (xyVar != null) {
            xyVar.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.t;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(uyVar);
        O();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        xy xyVar = this.r;
        if (xyVar != null) {
            return xyVar.r();
        }
        t8.t("RecyclerView has no LayoutManager".concat(z()));
        return null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        xy xyVar = this.r;
        if (xyVar != null) {
            return xyVar.s(getContext(), attributeSet);
        }
        t8.t("RecyclerView has no LayoutManager".concat(z()));
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public py getAdapter() {
        return this.q;
    }

    @Override // android.view.View
    public int getBaseline() {
        xy xyVar = this.r;
        if (xyVar == null) {
            return super.getBaseline();
        }
        xyVar.getClass();
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

    public pz getCompatAccessibilityDelegate() {
        return this.s0;
    }

    public sy getEdgeEffectFactory() {
        return this.L;
    }

    public ty getItemAnimator() {
        return this.Q;
    }

    public int getItemDecorationCount() {
        return this.t.size();
    }

    public xy getLayoutManager() {
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

    public zy getOnFlingListener() {
        return this.c0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.h0;
    }

    public dz getRecycledViewPool() {
        return this.g.c();
    }

    public int getScrollState() {
        return this.R;
    }

    public final void h(bz bzVar) {
        if (this.n0 == null) {
            this.n0 = new ArrayList();
        }
        this.n0.add(bzVar);
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
            t8.t("Cannot call this method while RecyclerView is computing a layout or scrolling".concat(z()));
        } else {
            t8.t(str);
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
        a6 a6Var = this.j;
        int q = a6Var.q();
        for (int i = 0; i < q; i++) {
            nz J = J(a6Var.p(i));
            if (!J.p()) {
                J.d = -1;
                J.g = -1;
            }
        }
        ez ezVar = this.g;
        ArrayList arrayList = ezVar.a;
        ArrayList arrayList2 = ezVar.c;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            nz nzVar = (nz) arrayList2.get(i2);
            nzVar.d = -1;
            nzVar.g = -1;
        }
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            nz nzVar2 = (nz) arrayList.get(i3);
            nzVar2.d = -1;
            nzVar2.g = -1;
        }
        ArrayList arrayList3 = ezVar.b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                nz nzVar3 = (nz) ezVar.b.get(i4);
                nzVar3.d = -1;
                nzVar3.g = -1;
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
            WeakHashMap weakHashMap = x80.a;
            postInvalidateOnAnimation();
        }
    }

    public final void m() {
        if (!this.y || this.H) {
            int i = n60.a;
            Trace.beginSection("RV FullInvalidate");
            p();
            Trace.endSection();
            return;
        }
        x1 x1Var = this.i;
        if (x1Var.k()) {
            int i2 = x1Var.a;
            if ((i2 & 4) == 0 || (i2 & 11) != 0) {
                if (x1Var.k()) {
                    int i3 = n60.a;
                    Trace.beginSection("RV FullInvalidate");
                    p();
                    Trace.endSection();
                    return;
                }
                return;
            }
            int i4 = n60.a;
            Trace.beginSection("RV PartialInvalidate");
            d0();
            Q();
            x1Var.q();
            if (!this.A) {
                a6 a6Var = this.j;
                int i5 = a6Var.i();
                int i6 = 0;
                while (true) {
                    if (i6 < i5) {
                        nz J = J(a6Var.h(i6));
                        if (J != null && !J.p() && J.l()) {
                            p();
                            break;
                        }
                        i6++;
                    } else {
                        x1Var.c();
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
        WeakHashMap weakHashMap = x80.a;
        setMeasuredDimension(xy.g(i, paddingRight, getMinimumWidth()), xy.g(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final void o(View view) {
        J(view);
        ArrayList arrayList = this.G;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ep epVar = (ep) this.G.get(size);
                if (view == epVar.w) {
                    epVar.w = null;
                }
                nz I = epVar.r.I(view);
                if (I != null) {
                    nz nzVar = epVar.c;
                    if (nzVar == null || I != nzVar) {
                        epVar.j(I, false);
                        if (epVar.a.remove(I.a)) {
                            epVar.m.getClass();
                            or.b(I);
                        }
                    } else {
                        epVar.o(null, 0);
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
        xy xyVar = this.r;
        if (xyVar != null) {
            xyVar.g = true;
            xyVar.R(this);
        }
        this.r0 = false;
        ThreadLocal threadLocal = km.j;
        km kmVar = (km) threadLocal.get();
        this.j0 = kmVar;
        if (kmVar == null) {
            km kmVar2 = new km();
            kmVar2.f = new ArrayList();
            kmVar2.i = new ArrayList();
            this.j0 = kmVar2;
            WeakHashMap weakHashMap = x80.a;
            Display display = getDisplay();
            if (!isInEditMode() && display != null) {
                f = display.getRefreshRate();
            }
            f = 60.0f;
            km kmVar3 = this.j0;
            kmVar3.h = (long) (1.0E9f / f);
            threadLocal.set(kmVar3);
        }
        this.j0.f.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        jq jqVar;
        super.onDetachedFromWindow();
        ty tyVar = this.Q;
        if (tyVar != null) {
            tyVar.e();
        }
        setScrollState(0);
        mz mzVar = this.i0;
        mzVar.l.removeCallbacks(mzVar);
        mzVar.h.abortAnimation();
        xy xyVar = this.r;
        if (xyVar != null && (jqVar = xyVar.e) != null) {
            jqVar.i();
        }
        this.w = false;
        xy xyVar2 = this.r;
        if (xyVar2 != null) {
            xyVar2.g = false;
            xyVar2.S(this);
        }
        this.y0.clear();
        removeCallbacks(this.z0);
        this.k.getClass();
        while (e90.d.a() != null) {
        }
        km kmVar = this.j0;
        if (kmVar != null) {
            kmVar.f.remove(this);
            this.j0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.t;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((uy) arrayList.get(i)).e(canvas, this);
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
        xy xyVar;
        if (this.r != null && !this.B && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f = this.r.e() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.r.d()) {
                    f2 = motionEvent.getAxisValue(10);
                    if (f == 0.0f || f2 != 0.0f) {
                        int i = (int) (f2 * this.f0);
                        int i2 = (int) (f * this.g0);
                        xyVar = this.r;
                        if (xyVar == null) {
                            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                            return false;
                        }
                        if (!this.B) {
                            int[] iArr = this.x0;
                            iArr[0] = 0;
                            iArr[1] = 0;
                            boolean d = xyVar.d();
                            boolean e = this.r.e();
                            getScrollingChildHelper().g(e ? (d ? 1 : 0) | 2 : d ? 1 : 0, 1);
                            if (s(d ? i : 0, e ? i2 : 0, 1, this.x0, this.v0)) {
                                i -= iArr[0];
                                i2 -= iArr[1];
                            }
                            Z(d ? i : 0, e ? i2 : 0, motionEvent, 1);
                            km kmVar = this.j0;
                            if (kmVar != null && (i != 0 || i2 != 0)) {
                                kmVar.a(this, i, i2);
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
                xyVar = this.r;
                if (xyVar == null) {
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
                        xyVar = this.r;
                        if (xyVar == null) {
                        }
                    } else if (this.r.d()) {
                        f2 = axisValue;
                        f = 0.0f;
                        if (f == 0.0f) {
                        }
                        int i322 = (int) (f2 * this.f0);
                        int i2222 = (int) (f * this.g0);
                        xyVar = this.r;
                        if (xyVar == null) {
                        }
                    }
                }
                f = 0.0f;
                f2 = 0.0f;
                if (f == 0.0f) {
                }
                int i3222 = (int) (f2 * this.f0);
                int i22222 = (int) (f * this.g0);
                xyVar = this.r;
                if (xyVar == null) {
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
            xy xyVar = this.r;
            if (xyVar != null) {
                boolean d = xyVar.d();
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
        int i5 = n60.a;
        Trace.beginSection("RV OnLayout");
        p();
        Trace.endSection();
        this.y = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        xy xyVar = this.r;
        if (xyVar == null) {
            n(i, i2);
            return;
        }
        boolean L = xyVar.L();
        boolean z = false;
        kz kzVar = this.l0;
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
            if (kzVar.d == 1) {
                q();
            }
            this.r.r0(i, i2);
            kzVar.i = true;
            r();
            this.r.t0(i, i2);
            if (this.r.w0()) {
                this.r.r0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                kzVar.i = true;
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
            if (kzVar.k) {
                kzVar.g = true;
            } else {
                this.i.d();
                kzVar.g = false;
            }
            this.E = false;
            e0(false);
        } else if (kzVar.k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        py pyVar = this.q;
        if (pyVar != null) {
            kzVar.e = pyVar.a();
        } else {
            kzVar.e = 0;
        }
        d0();
        this.r.b.n(i, i2);
        e0(false);
        kzVar.g = false;
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
        if (!(parcelable instanceof hz)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        hz hzVar = (hz) parcelable;
        this.h = hzVar;
        super.onRestoreInstanceState(hzVar.f);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        hz hzVar = new hz(super.onSaveInstanceState());
        hz hzVar2 = this.h;
        if (hzVar2 != null) {
            hzVar.h = hzVar2.h;
            return hzVar;
        }
        xy xyVar = this.r;
        if (xyVar != null) {
            hzVar.h = xyVar.f0();
            return hzVar;
        }
        hzVar.h = null;
        return hzVar;
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
            az azVar = this.v;
            if (azVar == null) {
                z = motionEvent.getAction() == 0 ? false : C(motionEvent);
            } else {
                azVar.a(motionEvent);
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
            xy xyVar = this.r;
            if (xyVar != null) {
                boolean d = xyVar.d();
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
                            xy xyVar2 = this.r;
                            if (xyVar2 == null) {
                                Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                            } else if (!this.B) {
                                boolean d2 = xyVar2.d();
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
                                        zy zyVar = this.c0;
                                        if (zyVar != null) {
                                            ow owVar = (ow) zyVar;
                                            xy layoutManager = owVar.a.getLayoutManager();
                                            if (layoutManager != 0 && owVar.a.getAdapter() != null && ((Math.abs(i8) > (minFlingVelocity = owVar.a.getMinFlingVelocity()) || Math.abs(i7) > minFlingVelocity) && ((z2 = layoutManager instanceof jz)))) {
                                                nw nwVar = !z2 ? null : new nw(owVar, owVar.a.getContext());
                                                if (nwVar != null) {
                                                    int B = layoutManager.B();
                                                    if (B != 0) {
                                                        hh e3 = layoutManager.e() ? owVar.e(layoutManager) : layoutManager.d() ? owVar.d(layoutManager) : null;
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
                                                                    int b = ow.b(u, e3);
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
                                                                H = xy.H(view);
                                                            } else if (z5 || view2 == null) {
                                                                if (z5) {
                                                                    view = view2;
                                                                }
                                                                if (view != null) {
                                                                    H = ((z2 && (a = ((jz) layoutManager).a(layoutManager.B() + (-1))) != null && ((a.x > 0.0f ? 1 : (a.x == 0.0f ? 0 : -1)) < 0 || (a.y > 0.0f ? 1 : (a.y == 0.0f ? 0 : -1)) < 0)) == z5 ? -1 : 1) + xy.H(view);
                                                                    if (H >= 0) {
                                                                    }
                                                                }
                                                                H = -1;
                                                            } else {
                                                                H = xy.H(view2);
                                                            }
                                                            if (H != -1) {
                                                                nwVar.a = H;
                                                                layoutManager.z0(nwVar);
                                                                Y();
                                                                obtain.recycle();
                                                                return true;
                                                            }
                                                            if (z4) {
                                                                getScrollingChildHelper().g(e2 ? i | 2 : i, i2);
                                                                int i15 = -i6;
                                                                int max = Math.max(i15, Math.min(i7, i6));
                                                                int max2 = Math.max(i15, Math.min(i8, i6));
                                                                mz mzVar = this.i0;
                                                                RecyclerView recyclerView = mzVar.l;
                                                                recyclerView.setScrollState(2);
                                                                mzVar.g = 0;
                                                                mzVar.f = 0;
                                                                Interpolator interpolator = mzVar.i;
                                                                cp cpVar = G0;
                                                                if (interpolator != cpVar) {
                                                                    mzVar.i = cpVar;
                                                                    mzVar.h = new OverScroller(recyclerView.getContext(), cpVar);
                                                                }
                                                                mzVar.h.fling(0, 0, max, max2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                                                mzVar.a();
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
                            km kmVar = this.j0;
                            if (kmVar != null && (i20 != 0 || i22 != 0)) {
                                kmVar.a(this, i20, i22);
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
        nz nzVar;
        View findViewById;
        boolean z2;
        u20 u20Var;
        ev evVar;
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
        kz kzVar = this.l0;
        boolean z4 = false;
        kzVar.i = false;
        boolean z5 = true;
        Object[] objArr = this.A0 && !(this.B0 == getWidth() && this.C0 == getHeight());
        this.B0 = 0;
        this.C0 = 0;
        this.A0 = false;
        if (kzVar.d == 1) {
            q();
            this.r.q0(this);
            r();
        } else {
            x1 x1Var = this.i;
            if ((((ArrayList) x1Var.d).isEmpty() || ((ArrayList) x1Var.c).isEmpty()) && !objArr == true && this.r.n == getWidth() && this.r.o == getHeight()) {
                this.r.q0(this);
            } else {
                this.r.q0(this);
                r();
            }
        }
        kzVar.a(4);
        d0();
        Q();
        kzVar.d = 1;
        boolean z6 = kzVar.j;
        a6 a6Var = this.j;
        ez ezVar = this.g;
        q4 q4Var = this.k;
        if (z6) {
            int i = a6Var.i() - 1;
            while (i >= 0) {
                nz J = J(a6Var.h(i));
                if (J.p()) {
                    z3 = z5;
                } else {
                    long H = H(J);
                    this.Q.getClass();
                    ev evVar2 = new ev();
                    evVar2.a(J);
                    hr hrVar = (hr) q4Var.h;
                    z3 = z5;
                    u20 u20Var2 = (u20) q4Var.g;
                    nz nzVar2 = (nz) hrVar.b(H);
                    if (nzVar2 == null || nzVar2.p()) {
                        q4Var.c(J, evVar2);
                    } else {
                        e90 e90Var = (e90) u20Var2.get(nzVar2);
                        boolean z7 = (e90Var == null || (e90Var.a & 1) == 0) ? z4 : z3;
                        e90 e90Var2 = (e90) u20Var2.get(J);
                        boolean z8 = (e90Var2 == null || (e90Var2.a & 1) == 0) ? z4 : z3;
                        if (z7 && nzVar2 == J) {
                            q4Var.c(J, evVar2);
                        } else {
                            ev O = q4Var.O(nzVar2, 4);
                            q4Var.c(J, evVar2);
                            ev O2 = q4Var.O(J, 8);
                            if (O == null) {
                                int i2 = a6Var.i();
                                for (int i3 = 0; i3 < i2; i3++) {
                                    nz J2 = J(a6Var.h(i3));
                                    if (J2 != J && H(J2) == H) {
                                        py pyVar = this.q;
                                        if (pyVar == null || !pyVar.b) {
                                            throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + J2 + " \n View Holder 2:" + J + z());
                                        }
                                        throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + J2 + " \n View Holder 2:" + J + z());
                                    }
                                }
                                Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + nzVar2 + " cannot be found but it is necessary for " + J + z());
                            } else {
                                nzVar2.o(false);
                                if (z7) {
                                    f(nzVar2);
                                }
                                if (nzVar2 != J) {
                                    if (z8) {
                                        f(J);
                                    }
                                    nzVar2.h = J;
                                    f(nzVar2);
                                    ezVar.k(nzVar2);
                                    J.o(false);
                                    J.i = nzVar2;
                                }
                                if (this.Q.a(nzVar2, J, O, O2)) {
                                    T();
                                }
                            }
                        }
                    }
                }
                i--;
                z5 = z3;
                z4 = false;
            }
            z = z5;
            u20 u20Var3 = (u20) q4Var.g;
            int i4 = u20Var3.h - 1;
            while (i4 >= 0) {
                nz nzVar3 = (nz) u20Var3.f(i4);
                e90 e90Var3 = (e90) u20Var3.g(i4);
                int i5 = e90Var3.a;
                int i6 = i5 & 3;
                oy oyVar = this.D0;
                if (i6 == 3) {
                    RecyclerView recyclerView = oyVar.a;
                    recyclerView.r.j0(nzVar3.a, recyclerView.g);
                } else if ((i5 & 1) != 0) {
                    ev evVar3 = e90Var3.b;
                    if (evVar3 == null) {
                        RecyclerView recyclerView2 = oyVar.a;
                        recyclerView2.r.j0(nzVar3.a, recyclerView2.g);
                    } else {
                        oyVar.g(nzVar3, evVar3, e90Var3.c);
                    }
                } else if ((i5 & 14) == 14) {
                    oyVar.f(nzVar3, e90Var3.b, e90Var3.c);
                } else if ((i5 & 12) == 12) {
                    ev evVar4 = e90Var3.b;
                    ev evVar5 = e90Var3.c;
                    oyVar.getClass();
                    nzVar3.o(false);
                    RecyclerView recyclerView3 = oyVar.a;
                    boolean z9 = recyclerView3.H;
                    ty tyVar = recyclerView3.Q;
                    if (!z9) {
                        re reVar = (re) tyVar;
                        reVar.getClass();
                        int i7 = evVar4.a;
                        int i8 = evVar5.a;
                        if (i7 == i8) {
                            u20Var = u20Var3;
                            if (evVar4.b == evVar5.b) {
                                reVar.c(nzVar3);
                                g = false;
                                if (g) {
                                    recyclerView3.T();
                                }
                                evVar = null;
                                e90Var3.a = 0;
                                e90Var3.b = evVar;
                                e90Var3.c = evVar;
                                e90.d.c(e90Var3);
                                i4--;
                                u20Var3 = u20Var;
                            }
                        } else {
                            u20Var = u20Var3;
                        }
                        g = reVar.g(nzVar3, i7, evVar4.b, i8, evVar5.b);
                        if (g) {
                        }
                        evVar = null;
                        e90Var3.a = 0;
                        e90Var3.b = evVar;
                        e90Var3.c = evVar;
                        e90.d.c(e90Var3);
                        i4--;
                        u20Var3 = u20Var;
                    } else if (tyVar.a(nzVar3, nzVar3, evVar4, evVar5)) {
                        recyclerView3.T();
                    }
                } else {
                    u20Var = u20Var3;
                    if ((i5 & 4) != 0) {
                        evVar = null;
                        oyVar.g(nzVar3, e90Var3.b, null);
                    } else {
                        evVar = null;
                        if ((i5 & 8) != 0) {
                            oyVar.f(nzVar3, e90Var3.b, e90Var3.c);
                        }
                    }
                    e90Var3.a = 0;
                    e90Var3.b = evVar;
                    e90Var3.c = evVar;
                    e90.d.c(e90Var3);
                    i4--;
                    u20Var3 = u20Var;
                }
                u20Var = u20Var3;
                evVar = null;
                e90Var3.a = 0;
                e90Var3.b = evVar;
                e90Var3.c = evVar;
                e90.d.c(e90Var3);
                i4--;
                u20Var3 = u20Var;
            }
        } else {
            z = true;
        }
        View view = null;
        this.r.i0(ezVar);
        kzVar.b = kzVar.e;
        this.H = false;
        this.I = false;
        kzVar.j = false;
        kzVar.k = false;
        this.r.f = false;
        ArrayList arrayList = ezVar.b;
        if (arrayList != null) {
            arrayList.clear();
        }
        xy xyVar = this.r;
        if (xyVar.k) {
            xyVar.j = 0;
            xyVar.k = false;
            ezVar.l();
        }
        this.r.d0(kzVar);
        boolean z10 = z;
        R(z10);
        e0(false);
        ((u20) q4Var.g).clear();
        ((hr) q4Var.h).a();
        int[] iArr = this.t0;
        int i9 = iArr[0];
        int i10 = iArr[z10 ? 1 : 0];
        D(iArr);
        if ((iArr[0] == i9 && iArr[z10 ? 1 : 0] == i10) ? false : true) {
            u(0, 0);
        }
        if (this.h0 && this.q != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (!isFocused()) {
            }
            long j = kzVar.m;
            if (j != -1 && (z2 = this.q.b) && z2) {
                int q = a6Var.q();
                nzVar = null;
                int i11 = 0;
                while (true) {
                    if (i11 >= q) {
                        break;
                    }
                    nz J3 = J(a6Var.p(i11));
                    if (J3 != null && !J3.i() && J3.e == j) {
                        if (!((ArrayList) a6Var.d).contains(J3.a)) {
                            nzVar = J3;
                            break;
                        }
                        nzVar = J3;
                    }
                    i11++;
                }
            } else {
                nzVar = null;
            }
            if (nzVar != null) {
                View view2 = nzVar.a;
                if (!((ArrayList) a6Var.d).contains(view2) && view2.hasFocusable()) {
                    view = view2;
                    if (view != null) {
                        int i12 = kzVar.n;
                        if (i12 != -1 && (findViewById = view.findViewById(i12)) != null && findViewById.isFocusable()) {
                            view = findViewById;
                        }
                        view.requestFocus();
                    }
                }
            }
            if (a6Var.i() > 0) {
                int i13 = kzVar.l;
                if (i13 == -1) {
                    i13 = 0;
                }
                int b = kzVar.b();
                for (int i14 = i13; i14 < b; i14++) {
                    nz F = F(i14);
                    if (F == null) {
                        break;
                    }
                    View view3 = F.a;
                    if (view3.hasFocusable()) {
                        view = view3;
                        break;
                    }
                }
                int min = Math.min(b, i13) - 1;
                while (true) {
                    if (min < 0) {
                        break;
                    }
                    nz F2 = F(min);
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
        kzVar.m = -1L;
        kzVar.l = -1;
        kzVar.n = -1;
    }

    public final void q() {
        e90 e90Var;
        View B;
        kz kzVar = this.l0;
        kzVar.a(1);
        A(kzVar);
        kzVar.i = false;
        d0();
        q4 q4Var = this.k;
        u20 u20Var = (u20) q4Var.g;
        u20 u20Var2 = (u20) q4Var.g;
        u20Var.clear();
        hr hrVar = (hr) q4Var.h;
        hrVar.a();
        Q();
        U();
        nz nzVar = null;
        View focusedChild = (this.h0 && hasFocus() && this.q != null) ? getFocusedChild() : null;
        if (focusedChild != null && (B = B(focusedChild)) != null) {
            nzVar = I(B);
        }
        if (nzVar == null) {
            kzVar.m = -1L;
            kzVar.l = -1;
            kzVar.n = -1;
        } else {
            kzVar.m = this.q.b ? nzVar.e : -1L;
            kzVar.l = this.H ? -1 : nzVar.i() ? nzVar.d : nzVar.b();
            View view = nzVar.a;
            int id = view.getId();
            while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                    id = view.getId();
                }
            }
            kzVar.n = id;
        }
        kzVar.h = kzVar.j && this.p0;
        this.p0 = false;
        this.o0 = false;
        kzVar.g = kzVar.k;
        kzVar.e = this.q.a();
        D(this.t0);
        boolean z = kzVar.j;
        a6 a6Var = this.j;
        if (z) {
            int i = a6Var.i();
            for (int i2 = 0; i2 < i; i2++) {
                nz J = J(a6Var.h(i2));
                if (!J.p() && (!J.g() || this.q.b)) {
                    ty tyVar = this.Q;
                    ty.b(J);
                    J.d();
                    tyVar.getClass();
                    ev evVar = new ev();
                    evVar.a(J);
                    e90 e90Var2 = (e90) u20Var2.get(J);
                    if (e90Var2 == null) {
                        e90Var2 = e90.a();
                        u20Var2.put(J, e90Var2);
                    }
                    e90Var2.b = evVar;
                    e90Var2.a |= 4;
                    if (kzVar.h && J.l() && !J.i() && !J.p() && !J.g()) {
                        hrVar.d(H(J), J);
                    }
                }
            }
        }
        if (kzVar.k) {
            int q = a6Var.q();
            for (int i3 = 0; i3 < q; i3++) {
                nz J2 = J(a6Var.p(i3));
                if (!J2.p() && J2.d == -1) {
                    J2.d = J2.c;
                }
            }
            boolean z2 = kzVar.f;
            kzVar.f = false;
            this.r.c0(this.g, kzVar);
            kzVar.f = z2;
            for (int i4 = 0; i4 < a6Var.i(); i4++) {
                nz J3 = J(a6Var.h(i4));
                if (!J3.p() && ((e90Var = (e90) u20Var2.get(J3)) == null || (e90Var.a & 4) == 0)) {
                    ty.b(J3);
                    boolean z3 = (J3.j & 8192) != 0;
                    ty tyVar2 = this.Q;
                    J3.d();
                    tyVar2.getClass();
                    ev evVar2 = new ev();
                    evVar2.a(J3);
                    if (z3) {
                        V(J3, evVar2);
                    } else {
                        e90 e90Var3 = (e90) u20Var2.get(J3);
                        if (e90Var3 == null) {
                            e90Var3 = e90.a();
                            u20Var2.put(J3, e90Var3);
                        }
                        e90Var3.a |= 2;
                        e90Var3.b = evVar2;
                    }
                }
            }
            k();
        } else {
            k();
        }
        R(true);
        e0(false);
        kzVar.d = 2;
    }

    public final void r() {
        d0();
        Q();
        kz kzVar = this.l0;
        kzVar.a(6);
        this.i.d();
        kzVar.e = this.q.a();
        kzVar.c = 0;
        if (this.h != null) {
            py pyVar = this.q;
            int h = d30.h(pyVar.c);
            if (h == 1 ? pyVar.a() > 0 : h != 2) {
                Parcelable parcelable = this.h.h;
                if (parcelable != null) {
                    this.r.e0(parcelable);
                }
                this.h = null;
            }
        }
        kzVar.g = false;
        this.r.c0(this.g, kzVar);
        kzVar.f = false;
        kzVar.j = kzVar.j && this.Q != null;
        kzVar.d = 4;
        R(true);
        e0(false);
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        nz J = J(view);
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
        jq jqVar = this.r.e;
        if ((jqVar == null || !jqVar.e) && !M() && view2 != null) {
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
            ((az) arrayList.get(i)).c(z);
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
        xy xyVar = this.r;
        if (xyVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.B) {
            return;
        }
        boolean d = xyVar.d();
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

    public void setAccessibilityDelegateCompat(pz pzVar) {
        this.s0 = pzVar;
        x80.m(this, pzVar);
    }

    public void setAdapter(py pyVar) {
        setLayoutFrozen(false);
        py pyVar2 = this.q;
        gz gzVar = this.f;
        if (pyVar2 != null) {
            pyVar2.a.unregisterObserver(gzVar);
            this.q.getClass();
        }
        ty tyVar = this.Q;
        if (tyVar != null) {
            tyVar.e();
        }
        xy xyVar = this.r;
        ez ezVar = this.g;
        if (xyVar != null) {
            xyVar.h0(ezVar);
            this.r.i0(ezVar);
        }
        ezVar.a.clear();
        ezVar.e();
        x1 x1Var = this.i;
        x1Var.r((ArrayList) x1Var.c);
        x1Var.r((ArrayList) x1Var.d);
        x1Var.a = 0;
        py pyVar3 = this.q;
        this.q = pyVar;
        if (pyVar != null) {
            pyVar.a.registerObserver(gzVar);
        }
        xy xyVar2 = this.r;
        if (xyVar2 != null) {
            xyVar2.Q();
        }
        py pyVar4 = this.q;
        ezVar.a.clear();
        ezVar.e();
        dz c = ezVar.c();
        if (pyVar3 != null) {
            c.b--;
        }
        if (c.b == 0) {
            SparseArray sparseArray = c.a;
            for (int i = 0; i < sparseArray.size(); i++) {
                ((cz) sparseArray.valueAt(i)).a.clear();
            }
        }
        if (pyVar4 != null) {
            c.b++;
        }
        this.l0.f = true;
        this.I |= false;
        this.H = true;
        a6 a6Var = this.j;
        int q = a6Var.q();
        for (int i2 = 0; i2 < q; i2++) {
            nz J = J(a6Var.p(i2));
            if (J != null && !J.p()) {
                J.a(6);
            }
        }
        O();
        ArrayList arrayList = ezVar.c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            nz nzVar = (nz) arrayList.get(i3);
            if (nzVar != null) {
                nzVar.a(6);
                nzVar.a(1024);
            }
        }
        py pyVar5 = ezVar.h.q;
        if (pyVar5 == null || !pyVar5.b) {
            ezVar.e();
        }
        requestLayout();
    }

    public void setChildDrawingOrderCallback(ry ryVar) {
        if (ryVar == null) {
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

    public void setEdgeEffectFactory(sy syVar) {
        syVar.getClass();
        this.L = syVar;
        this.P = null;
        this.N = null;
        this.O = null;
        this.M = null;
    }

    public void setHasFixedSize(boolean z) {
        this.x = z;
    }

    public void setItemAnimator(ty tyVar) {
        ty tyVar2 = this.Q;
        if (tyVar2 != null) {
            tyVar2.e();
            this.Q.a = null;
        }
        this.Q = tyVar;
        if (tyVar != null) {
            tyVar.a = this.q0;
        }
    }

    public void setItemViewCacheSize(int i) {
        ez ezVar = this.g;
        ezVar.e = i;
        ezVar.l();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(xy xyVar) {
        RecyclerView recyclerView;
        jq jqVar;
        if (xyVar == this.r) {
            return;
        }
        setScrollState(0);
        mz mzVar = this.i0;
        mzVar.l.removeCallbacks(mzVar);
        mzVar.h.abortAnimation();
        xy xyVar2 = this.r;
        if (xyVar2 != null && (jqVar = xyVar2.e) != null) {
            jqVar.i();
        }
        xy xyVar3 = this.r;
        ez ezVar = this.g;
        if (xyVar3 != null) {
            ty tyVar = this.Q;
            if (tyVar != null) {
                tyVar.e();
            }
            this.r.h0(ezVar);
            this.r.i0(ezVar);
            ezVar.a.clear();
            ezVar.e();
            if (this.w) {
                xy xyVar4 = this.r;
                xyVar4.g = false;
                xyVar4.S(this);
            }
            this.r.u0(null);
            this.r = null;
        } else {
            ezVar.a.clear();
            ezVar.e();
        }
        a6 a6Var = this.j;
        ((ca) a6Var.c).h();
        ArrayList arrayList = (ArrayList) a6Var.d;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = ((oy) a6Var.b).a;
            if (size < 0) {
                break;
            }
            nz J = J((View) arrayList.get(size));
            if (J != null) {
                int i = J.p;
                if (recyclerView.M()) {
                    J.q = i;
                    recyclerView.y0.add(J);
                } else {
                    View view = J.a;
                    WeakHashMap weakHashMap = x80.a;
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
        this.r = xyVar;
        if (xyVar != null) {
            if (xyVar.b != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(xyVar);
                String z = xyVar.b.z();
                sb.append(" is already attached to a RecyclerView:");
                sb.append(z);
                throw new IllegalArgumentException(sb.toString());
            }
            xyVar.u0(this);
            if (this.w) {
                xy xyVar5 = this.r;
                xyVar5.g = true;
                xyVar5.R(this);
            }
        }
        ezVar.l();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
        } else {
            t8.k("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        bv scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.d) {
            ViewGroup viewGroup = scrollingChildHelper.c;
            WeakHashMap weakHashMap = x80.a;
            viewGroup.stopNestedScroll();
        }
        scrollingChildHelper.d = z;
    }

    public void setOnFlingListener(zy zyVar) {
        this.c0 = zyVar;
    }

    @Deprecated
    public void setOnScrollListener(bz bzVar) {
        this.m0 = bzVar;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.h0 = z;
    }

    public void setRecycledViewPool(dz dzVar) {
        ez ezVar = this.g;
        if (ezVar.g != null) {
            r0.b--;
        }
        ezVar.g = dzVar;
        if (dzVar == null || ezVar.h.getAdapter() == null) {
            return;
        }
        ezVar.g.b++;
    }

    public void setScrollState(int i) {
        jq jqVar;
        if (i == this.R) {
            return;
        }
        this.R = i;
        if (i != 2) {
            mz mzVar = this.i0;
            mzVar.l.removeCallbacks(mzVar);
            mzVar.h.abortAnimation();
            xy xyVar = this.r;
            if (xyVar != null && (jqVar = xyVar.e) != null) {
                jqVar.i();
            }
        }
        xy xyVar2 = this.r;
        if (xyVar2 != null) {
            xyVar2.g0(i);
        }
        bz bzVar = this.m0;
        if (bzVar != null) {
            bzVar.a(this, i);
        }
        ArrayList arrayList = this.n0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((bz) this.n0.get(size)).a(this, i);
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

    public void setViewCacheExtension(lz lzVar) {
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
        jq jqVar;
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
            mz mzVar = this.i0;
            mzVar.l.removeCallbacks(mzVar);
            mzVar.h.abortAnimation();
            xy xyVar = this.r;
            if (xyVar == null || (jqVar = xyVar.e) == null) {
                return;
            }
            jqVar.i();
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
        bz bzVar = this.m0;
        if (bzVar != null) {
            bzVar.b(this, i, i2);
        }
        ArrayList arrayList = this.n0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((bz) this.n0.get(size)).b(this, i, i2);
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
        xy xyVar = this.r;
        if (xyVar != null) {
            return xyVar.t(layoutParams);
        }
        t8.t("RecyclerView has no LayoutManager".concat(z()));
        return null;
    }

    @Deprecated
    public void setRecyclerListener(fz fzVar) {
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.derinko.gbini.n1casino.R.attr.recyclerViewStyle);
    }
}
