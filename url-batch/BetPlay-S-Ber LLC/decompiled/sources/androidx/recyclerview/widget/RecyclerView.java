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
import defpackage.a00;
import defpackage.aa;
import defpackage.ax;
import defpackage.b00;
import defpackage.bx;
import defpackage.c00;
import defpackage.cz;
import defpackage.dz;
import defpackage.e00;
import defpackage.e90;
import defpackage.ez;
import defpackage.fz;
import defpackage.h30;
import defpackage.h5;
import defpackage.hz;
import defpackage.iz;
import defpackage.jz;
import defpackage.k2;
import defpackage.ky;
import defpackage.kz;
import defpackage.l2;
import defpackage.l90;
import defpackage.nz;
import defpackage.o30;
import defpackage.o8;
import defpackage.oz;
import defpackage.pz;
import defpackage.qz;
import defpackage.r6;
import defpackage.rv;
import defpackage.rz;
import defpackage.se;
import defpackage.sm;
import defpackage.sz;
import defpackage.t60;
import defpackage.tz;
import defpackage.um;
import defpackage.uv;
import defpackage.uz;
import defpackage.vr;
import defpackage.vz;
import defpackage.wi;
import defpackage.wq;
import defpackage.wz;
import defpackage.y80;
import defpackage.yz;
import defpackage.zg;
import defpackage.zz;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {
    public static final int[] D0 = {R.attr.nestedScrollingEnabled};
    public static final Class[] E0;
    public static final dz F0;
    public boolean A;
    public int A0;
    public boolean B;
    public int B0;
    public boolean C;
    public final ez C0;
    public int D;
    public boolean E;
    public final AccessibilityManager F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public iz K;
    public EdgeEffect L;
    public EdgeEffect M;
    public EdgeEffect N;
    public EdgeEffect O;
    public jz P;
    public int Q;
    public int R;
    public VelocityTracker S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int a0;
    public pz b0;
    public final int c0;
    public final int d0;
    public final float e0;
    public final vz f;
    public final float f0;
    public final tz g;
    public boolean g0;
    public wz h;
    public final b00 h0;
    public final l2 i;
    public um i0;
    public final r6 j;
    public final sm j0;
    public final h5 k;
    public final zz k0;
    public boolean l;
    public qz l0;
    public final cz m;
    public ArrayList m0;
    public final Rect n;
    public boolean n0;
    public final Rect o;
    public boolean o0;
    public final RectF p;
    public final ez p0;
    public fz q;
    public boolean q0;
    public nz r;
    public e00 r0;
    public final ArrayList s;
    public final int[] s0;
    public final ArrayList t;
    public rv t0;
    public final ArrayList u;
    public final int[] u0;
    public wi v;
    public final int[] v0;
    public boolean w;
    public final int[] w0;
    public boolean x;
    public final ArrayList x0;
    public boolean y;
    public final cz y0;
    public int z;
    public boolean z0;

    static {
        Class cls = Integer.TYPE;
        E0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        F0 = new dz(0);
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
        this.f = new vz(this);
        this.g = new tz(this);
        this.k = new h5(23);
        this.m = new cz(this, 0);
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
        this.K = new iz();
        se seVar = new se();
        seVar.a = null;
        seVar.b = new ArrayList();
        seVar.c = 120L;
        seVar.d = 120L;
        seVar.e = 250L;
        seVar.f = 250L;
        seVar.g = true;
        seVar.h = new ArrayList();
        seVar.i = new ArrayList();
        seVar.j = new ArrayList();
        seVar.k = new ArrayList();
        seVar.l = new ArrayList();
        seVar.m = new ArrayList();
        seVar.n = new ArrayList();
        seVar.o = new ArrayList();
        seVar.p = new ArrayList();
        seVar.q = new ArrayList();
        seVar.r = new ArrayList();
        this.P = seVar;
        this.Q = 0;
        this.R = -1;
        this.e0 = Float.MIN_VALUE;
        this.f0 = Float.MIN_VALUE;
        this.g0 = true;
        this.h0 = new b00(this);
        this.j0 = new sm();
        zz zzVar = new zz();
        zzVar.a = -1;
        zzVar.b = 0;
        zzVar.c = 0;
        zzVar.d = 1;
        zzVar.e = 0;
        zzVar.f = false;
        zzVar.g = false;
        zzVar.h = false;
        zzVar.i = false;
        zzVar.j = false;
        zzVar.k = false;
        this.k0 = zzVar;
        this.n0 = false;
        this.o0 = false;
        ez ezVar = new ez(this);
        this.p0 = ezVar;
        this.q0 = false;
        this.s0 = new int[2];
        this.u0 = new int[2];
        this.v0 = new int[2];
        this.w0 = new int[2];
        this.x0 = new ArrayList();
        this.y0 = new cz(this, 1);
        this.A0 = 0;
        this.B0 = 0;
        this.C0 = new ez(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.a0 = viewConfiguration.getScaledTouchSlop();
        this.e0 = viewConfiguration.getScaledHorizontalScrollFactor();
        this.f0 = viewConfiguration.getScaledVerticalScrollFactor();
        this.c0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.d0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.P.a = ezVar;
        this.i = new l2(new ez(this));
        this.j = new r6(new ez(this));
        WeakHashMap weakHashMap = e90.a;
        if (y80.a(this) == 0) {
            y80.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.F = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new e00(this));
        int[] iArr = ky.a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        e90.l(this, context, iArr, attributeSet, obtainStyledAttributes, i);
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
                o8.j("Trying to set fast scroller without both required drawables.".concat(y()));
                throw null;
            }
            Resources resources = getContext().getResources();
            c = 3;
            c2 = 2;
            z = 1;
            typedArray = obtainStyledAttributes;
            i2 = 4;
            new wi(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.awerser.monnit.betplay.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.awerser.monnit.betplay.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.awerser.monnit.betplay.R.dimen.fastscroll_margin));
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
                    Class asSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(nz.class);
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
                    setLayoutManager((nz) constructor.newInstance(objArr));
                } catch (ClassCastException e3) {
                    o8.f(attributeSet.getPositionDescription(), ": Class is not a LayoutManager ", str, e3);
                    throw null;
                } catch (ClassNotFoundException e4) {
                    o8.f(attributeSet.getPositionDescription(), ": Unable to find LayoutManager ", str, e4);
                    throw null;
                } catch (IllegalAccessException e5) {
                    o8.f(attributeSet.getPositionDescription(), ": Cannot access non-public constructor ", str, e5);
                    throw null;
                } catch (InstantiationException e6) {
                    o8.f(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e6);
                    throw null;
                } catch (InvocationTargetException e7) {
                    o8.f(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e7);
                    throw null;
                }
            }
        }
        int[] iArr2 = D0;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        e90.l(this, context, iArr2, attributeSet, obtainStyledAttributes2, i);
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

    public static c00 I(View view) {
        if (view == null) {
            return null;
        }
        return ((oz) view.getLayoutParams()).a;
    }

    private rv getScrollingChildHelper() {
        if (this.t0 == null) {
            this.t0 = new rv(this);
        }
        return this.t0;
    }

    public static void j(c00 c00Var) {
        WeakReference weakReference = c00Var.b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == c00Var.a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            c00Var.b = null;
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
            wi wiVar = (wi) arrayList.get(i);
            int i2 = wiVar.v;
            if (i2 == 1) {
                boolean d = wiVar.d(motionEvent.getX(), motionEvent.getY());
                boolean c = wiVar.c(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0 && (d || c)) {
                    if (c) {
                        wiVar.w = 1;
                        wiVar.p = (int) motionEvent.getX();
                    } else if (d) {
                        wiVar.w = 2;
                        wiVar.m = (int) motionEvent.getY();
                    }
                    wiVar.f(2);
                    if (action == 3) {
                        this.v = wiVar;
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
        r6 r6Var = this.j;
        int i = r6Var.i();
        if (i == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        for (int i4 = 0; i4 < i; i4++) {
            c00 I = I(r6Var.h(i4));
            if (!I.o()) {
                int b = I.b();
                if (b < i2) {
                    i2 = b;
                }
                if (b > i3) {
                    i3 = b;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i3;
    }

    public final c00 E(int i) {
        c00 c00Var = null;
        if (this.G) {
            return null;
        }
        r6 r6Var = this.j;
        int q = r6Var.q();
        for (int i2 = 0; i2 < q; i2++) {
            c00 I = I(r6Var.p(i2));
            if (I != null && !I.h() && F(I) == i) {
                if (!((ArrayList) r6Var.d).contains(I.a)) {
                    return I;
                }
                c00Var = I;
            }
        }
        return c00Var;
    }

    public final int F(c00 c00Var) {
        if ((c00Var.j & 524) == 0 && c00Var.e()) {
            int i = c00Var.c;
            ArrayList arrayList = this.i.b;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                k2 k2Var = (k2) arrayList.get(i2);
                int i3 = k2Var.a;
                if (i3 != 1) {
                    if (i3 == 2) {
                        int i4 = k2Var.b;
                        if (i4 <= i) {
                            int i5 = k2Var.d;
                            if (i4 + i5 <= i) {
                                i -= i5;
                            }
                        } else {
                            continue;
                        }
                    } else if (i3 == 8) {
                        int i6 = k2Var.b;
                        if (i6 == i) {
                            i = k2Var.d;
                        } else {
                            if (i6 < i) {
                                i--;
                            }
                            if (k2Var.d <= i) {
                                i++;
                            }
                        }
                    }
                } else if (k2Var.b <= i) {
                    i += k2Var.d;
                }
            }
            return i;
        }
        return -1;
    }

    public final long G(c00 c00Var) {
        return this.q.b ? c00Var.e : c00Var.c;
    }

    public final c00 H(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return I(view);
        }
        o8.n("View ", view, " is not a direct child of ", this);
        return null;
    }

    public final Rect J(View view) {
        oz ozVar = (oz) view.getLayoutParams();
        boolean z = ozVar.c;
        Rect rect = ozVar.b;
        if (!z || (this.k0.g && (ozVar.a.k() || ozVar.a.f()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.t;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.n;
            rect2.set(0, 0, 0, 0);
            ((kz) arrayList.get(i)).getClass();
            ((oz) view.getLayoutParams()).a.getClass();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        ozVar.c = false;
        return rect;
    }

    public final boolean K() {
        return !this.y || this.G || this.i.h();
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
        r6 r6Var = this.j;
        int q = r6Var.q();
        for (int i = 0; i < q; i++) {
            ((oz) r6Var.p(i).getLayoutParams()).c = true;
        }
        ArrayList arrayList = this.g.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            oz ozVar = (oz) ((c00) arrayList.get(i2)).a.getLayoutParams();
            if (ozVar != null) {
                ozVar.c = true;
            }
        }
    }

    public final void O(int i, boolean z, int i2) {
        int i3 = i + i2;
        r6 r6Var = this.j;
        int q = r6Var.q();
        for (int i4 = 0; i4 < q; i4++) {
            c00 I = I(r6Var.p(i4));
            if (I != null && !I.o()) {
                int i5 = I.c;
                zz zzVar = this.k0;
                if (i5 >= i3) {
                    I.l(-i2, z);
                    zzVar.f = true;
                } else if (i5 >= i) {
                    I.a(8);
                    I.l(-i2, z);
                    I.c = i - 1;
                    zzVar.f = true;
                }
            }
        }
        tz tzVar = this.g;
        ArrayList arrayList = tzVar.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            c00 c00Var = (c00) arrayList.get(size);
            if (c00Var != null) {
                int i6 = c00Var.c;
                if (i6 >= i3) {
                    c00Var.l(-i2, z);
                } else if (i6 >= i) {
                    c00Var.a(8);
                    tzVar.f(size);
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
                    c00 c00Var = (c00) arrayList.get(size);
                    if (c00Var.a.getParent() == this && !c00Var.o() && (i = c00Var.q) != -1) {
                        View view = c00Var.a;
                        WeakHashMap weakHashMap = e90.a;
                        view.setImportantForAccessibility(i);
                        c00Var.q = -1;
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
        WeakHashMap weakHashMap = e90.a;
        postOnAnimation(this.y0);
        this.q0 = true;
    }

    public final void T() {
        boolean z;
        boolean z2 = this.G;
        l2 l2Var = this.i;
        boolean z3 = false;
        if (z2) {
            l2Var.l(l2Var.b);
            l2Var.l((ArrayList) l2Var.d);
            l2Var.a = 0;
            if (this.H) {
                this.r.Y();
            }
        }
        if (this.P != null && this.r.A0()) {
            l2Var.k();
        } else {
            l2Var.c();
        }
        boolean z4 = this.n0 || this.o0;
        boolean z5 = this.y && this.P != null && ((z = this.G) || z4 || this.r.f) && (!z || this.q.b);
        zz zzVar = this.k0;
        zzVar.j = z5;
        if (z5 && z4 && !this.G && this.P != null && this.r.A0()) {
            z3 = true;
        }
        zzVar.k = z3;
    }

    public final void U(c00 c00Var, uv uvVar) {
        c00Var.j &= -8193;
        boolean z = this.k0.h;
        h5 h5Var = this.k;
        if (z && c00Var.k() && !c00Var.h() && !c00Var.o()) {
            ((vr) h5Var.h).d(G(c00Var), c00Var);
        }
        h30 h30Var = (h30) h5Var.g;
        l90 l90Var = (l90) h30Var.get(c00Var);
        if (l90Var == null) {
            l90Var = l90.a();
            h30Var.put(c00Var, l90Var);
        }
        l90Var.b = uvVar;
        l90Var.a |= 4;
    }

    public final void V(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.n;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof oz) {
            oz ozVar = (oz) layoutParams;
            if (!ozVar.c) {
                Rect rect2 = ozVar.b;
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
            WeakHashMap weakHashMap = e90.a;
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
        fz fzVar = this.q;
        int[] iArr = this.w0;
        if (fzVar != null) {
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
                                WeakHashMap weakHashMap = e90.a;
                                postInvalidateOnAnimation();
                            }
                        }
                        z2 = z;
                        if (!z2) {
                        }
                        WeakHashMap weakHashMap2 = e90.a;
                        postInvalidateOnAnimation();
                    }
                }
                z2 = z;
                if (f2 >= 0.0f) {
                }
                z2 = z;
                if (!z2) {
                }
                WeakHashMap weakHashMap22 = e90.a;
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
        c00 c00Var;
        b0();
        P();
        int i3 = t60.a;
        Trace.beginSection("RV Scroll");
        zz zzVar = this.k0;
        z(zzVar);
        tz tzVar = this.g;
        int n0 = i != 0 ? this.r.n0(i, tzVar, zzVar) : 0;
        int p0 = i2 != 0 ? this.r.p0(i2, tzVar, zzVar) : 0;
        Trace.endSection();
        r6 r6Var = this.j;
        int i4 = r6Var.i();
        for (int i5 = 0; i5 < i4; i5++) {
            View h = r6Var.h(i5);
            c00 H = H(h);
            if (H != null && (c00Var = H.i) != null) {
                View view = c00Var.a;
                int left = h.getLeft();
                int top = h.getTop();
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
        wq wqVar;
        if (this.B) {
            return;
        }
        setScrollState(0);
        b00 b00Var = this.h0;
        b00Var.l.removeCallbacks(b00Var);
        b00Var.h.abortAnimation();
        nz nzVar = this.r;
        if (nzVar != null && (wqVar = nzVar.e) != null) {
            wqVar.i();
        }
        nz nzVar2 = this.r;
        if (nzVar2 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            nzVar2.o0(i);
            awakenScrollBars();
        }
    }

    public final void a0(int i, boolean z, int i2) {
        nz nzVar = this.r;
        if (nzVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.B) {
            return;
        }
        if (!nzVar.d()) {
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
        nz nzVar = this.r;
        if (nzVar != null) {
            nzVar.getClass();
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
        return (layoutParams instanceof oz) && this.r.f((oz) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        nz nzVar = this.r;
        if (nzVar != null && nzVar.d()) {
            return this.r.j(this.k0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        nz nzVar = this.r;
        if (nzVar != null && nzVar.d()) {
            return this.r.k(this.k0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        nz nzVar = this.r;
        if (nzVar != null && nzVar.d()) {
            return this.r.l(this.k0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        nz nzVar = this.r;
        if (nzVar != null && nzVar.e()) {
            return this.r.m(this.k0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        nz nzVar = this.r;
        if (nzVar != null && nzVar.e()) {
            return this.r.n(this.k0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        nz nzVar = this.r;
        if (nzVar != null && nzVar.e()) {
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
            ((kz) arrayList.get(i)).b(canvas, this);
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
            WeakHashMap weakHashMap = e90.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final void f(c00 c00Var) {
        View view = c00Var.a;
        boolean z = view.getParent() == this;
        this.g.k(H(view));
        boolean j = c00Var.j();
        r6 r6Var = this.j;
        if (j) {
            r6Var.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            r6Var.a(view, -1, true);
            return;
        }
        int indexOfChild = ((ez) r6Var.b).a.indexOfChild(view);
        if (indexOfChild < 0) {
            o8.v(view, "view is not a child, cannot hide ");
        } else {
            ((aa) r6Var.c).i(indexOfChild);
            r6Var.s(view);
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
        zz zzVar = this.k0;
        tz tzVar = this.g;
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
                            this.r.T(view, i, tzVar, zzVar);
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
                    view2 = this.r.T(view, i, tzVar, zzVar);
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

    public final void g(kz kzVar) {
        nz nzVar = this.r;
        if (nzVar != null) {
            nzVar.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.t;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(kzVar);
        N();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        nz nzVar = this.r;
        if (nzVar != null) {
            return nzVar.r();
        }
        o8.t("RecyclerView has no LayoutManager".concat(y()));
        return null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        nz nzVar = this.r;
        if (nzVar != null) {
            return nzVar.s(getContext(), attributeSet);
        }
        o8.t("RecyclerView has no LayoutManager".concat(y()));
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public fz getAdapter() {
        return this.q;
    }

    @Override // android.view.View
    public int getBaseline() {
        nz nzVar = this.r;
        if (nzVar == null) {
            return super.getBaseline();
        }
        nzVar.getClass();
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

    public e00 getCompatAccessibilityDelegate() {
        return this.r0;
    }

    public iz getEdgeEffectFactory() {
        return this.K;
    }

    public jz getItemAnimator() {
        return this.P;
    }

    public int getItemDecorationCount() {
        return this.t.size();
    }

    public nz getLayoutManager() {
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

    public pz getOnFlingListener() {
        return this.b0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.g0;
    }

    public sz getRecycledViewPool() {
        return this.g.c();
    }

    public int getScrollState() {
        return this.Q;
    }

    public final void h(qz qzVar) {
        if (this.m0 == null) {
            this.m0 = new ArrayList();
        }
        this.m0.add(qzVar);
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
            o8.t("Cannot call this method while RecyclerView is computing a layout or scrolling".concat(y()));
        } else {
            o8.t(str);
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
        r6 r6Var = this.j;
        int q = r6Var.q();
        for (int i = 0; i < q; i++) {
            c00 I = I(r6Var.p(i));
            if (!I.o()) {
                I.d = -1;
                I.g = -1;
            }
        }
        tz tzVar = this.g;
        ArrayList arrayList = tzVar.a;
        ArrayList arrayList2 = tzVar.c;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            c00 c00Var = (c00) arrayList2.get(i2);
            c00Var.d = -1;
            c00Var.g = -1;
        }
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            c00 c00Var2 = (c00) arrayList.get(i3);
            c00Var2.d = -1;
            c00Var2.g = -1;
        }
        ArrayList arrayList3 = tzVar.b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                c00 c00Var3 = (c00) tzVar.b.get(i4);
                c00Var3.d = -1;
                c00Var3.g = -1;
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
            WeakHashMap weakHashMap = e90.a;
            postInvalidateOnAnimation();
        }
    }

    public final void m() {
        if (!this.y || this.G) {
            int i = t60.a;
            Trace.beginSection("RV FullInvalidate");
            o();
            Trace.endSection();
            return;
        }
        l2 l2Var = this.i;
        if (l2Var.h()) {
            int i2 = l2Var.a;
            if ((i2 & 4) == 0 || (i2 & 11) != 0) {
                if (l2Var.h()) {
                    int i3 = t60.a;
                    Trace.beginSection("RV FullInvalidate");
                    o();
                    Trace.endSection();
                    return;
                }
                return;
            }
            int i4 = t60.a;
            Trace.beginSection("RV PartialInvalidate");
            b0();
            P();
            l2Var.k();
            if (!this.A) {
                r6 r6Var = this.j;
                int i5 = r6Var.i();
                int i6 = 0;
                while (true) {
                    if (i6 < i5) {
                        c00 I = I(r6Var.h(i6));
                        if (I != null && !I.o() && I.k()) {
                            o();
                            break;
                        }
                        i6++;
                    } else {
                        l2Var.b();
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
        WeakHashMap weakHashMap = e90.a;
        setMeasuredDimension(nz.g(i, paddingRight, getMinimumWidth()), nz.g(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x0358, code lost:
    
        if (((java.util.ArrayList) r7.d).contains(getFocusedChild()) == false) goto L227;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o() {
        boolean z;
        c00 c00Var;
        View findViewById;
        boolean z2;
        h30 h30Var;
        uv uvVar;
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
        zz zzVar = this.k0;
        boolean z4 = false;
        zzVar.i = false;
        boolean z5 = true;
        Object[] objArr = this.z0 && !(this.A0 == getWidth() && this.B0 == getHeight());
        this.A0 = 0;
        this.B0 = 0;
        this.z0 = false;
        if (zzVar.d == 1) {
            p();
            this.r.q0(this);
            q();
        } else {
            l2 l2Var = this.i;
            if ((((ArrayList) l2Var.d).isEmpty() || l2Var.b.isEmpty()) && !objArr == true && this.r.n == getWidth() && this.r.o == getHeight()) {
                this.r.q0(this);
            } else {
                this.r.q0(this);
                q();
            }
        }
        zzVar.a(4);
        b0();
        P();
        zzVar.d = 1;
        boolean z6 = zzVar.j;
        r6 r6Var = this.j;
        tz tzVar = this.g;
        h5 h5Var = this.k;
        if (z6) {
            int i = r6Var.i() - 1;
            while (i >= 0) {
                c00 I = I(r6Var.h(i));
                if (I.o()) {
                    z3 = z5;
                } else {
                    long G = G(I);
                    this.P.getClass();
                    uv uvVar2 = new uv();
                    uvVar2.a(I);
                    vr vrVar = (vr) h5Var.h;
                    z3 = z5;
                    h30 h30Var2 = (h30) h5Var.g;
                    c00 c00Var2 = (c00) vrVar.b(G);
                    if (c00Var2 == null || c00Var2.o()) {
                        h5Var.a(I, uvVar2);
                    } else {
                        l90 l90Var = (l90) h30Var2.get(c00Var2);
                        boolean z7 = (l90Var == null || (l90Var.a & 1) == 0) ? z4 : z3;
                        l90 l90Var2 = (l90) h30Var2.get(I);
                        boolean z8 = (l90Var2 == null || (l90Var2.a & 1) == 0) ? z4 : z3;
                        if (z7 && c00Var2 == I) {
                            h5Var.a(I, uvVar2);
                        } else {
                            uv I2 = h5Var.I(c00Var2, 4);
                            h5Var.a(I, uvVar2);
                            uv I3 = h5Var.I(I, 8);
                            if (I2 == null) {
                                int i2 = r6Var.i();
                                for (int i3 = 0; i3 < i2; i3++) {
                                    c00 I4 = I(r6Var.h(i3));
                                    if (I4 != I && G(I4) == G) {
                                        fz fzVar = this.q;
                                        if (fzVar == null || !fzVar.b) {
                                            throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + I4 + " \n View Holder 2:" + I + y());
                                        }
                                        throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + I4 + " \n View Holder 2:" + I + y());
                                    }
                                }
                                Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + c00Var2 + " cannot be found but it is necessary for " + I + y());
                            } else {
                                c00Var2.n(false);
                                if (z7) {
                                    f(c00Var2);
                                }
                                if (c00Var2 != I) {
                                    if (z8) {
                                        f(I);
                                    }
                                    c00Var2.h = I;
                                    f(c00Var2);
                                    tzVar.k(c00Var2);
                                    I.n(false);
                                    I.i = c00Var2;
                                }
                                if (this.P.a(c00Var2, I, I2, I3)) {
                                    S();
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
            h30 h30Var3 = (h30) h5Var.g;
            int i4 = h30Var3.h - 1;
            while (i4 >= 0) {
                c00 c00Var3 = (c00) h30Var3.f(i4);
                l90 l90Var3 = (l90) h30Var3.g(i4);
                int i5 = l90Var3.a;
                int i6 = i5 & 3;
                ez ezVar = this.C0;
                if (i6 == 3) {
                    RecyclerView recyclerView = ezVar.a;
                    recyclerView.r.j0(c00Var3.a, recyclerView.g);
                } else if ((i5 & 1) != 0) {
                    uv uvVar3 = l90Var3.b;
                    if (uvVar3 == null) {
                        RecyclerView recyclerView2 = ezVar.a;
                        recyclerView2.r.j0(c00Var3.a, recyclerView2.g);
                    } else {
                        ezVar.g(c00Var3, uvVar3, l90Var3.c);
                    }
                } else if ((i5 & 14) == 14) {
                    ezVar.f(c00Var3, l90Var3.b, l90Var3.c);
                } else if ((i5 & 12) == 12) {
                    uv uvVar4 = l90Var3.b;
                    uv uvVar5 = l90Var3.c;
                    ezVar.getClass();
                    c00Var3.n(false);
                    RecyclerView recyclerView3 = ezVar.a;
                    boolean z9 = recyclerView3.G;
                    jz jzVar = recyclerView3.P;
                    if (!z9) {
                        se seVar = (se) jzVar;
                        seVar.getClass();
                        int i7 = uvVar4.a;
                        int i8 = uvVar5.a;
                        if (i7 == i8) {
                            h30Var = h30Var3;
                            if (uvVar4.b == uvVar5.b) {
                                seVar.c(c00Var3);
                                g = false;
                                if (g) {
                                    recyclerView3.S();
                                }
                                uvVar = null;
                                l90Var3.a = 0;
                                l90Var3.b = uvVar;
                                l90Var3.c = uvVar;
                                l90.d.c(l90Var3);
                                i4--;
                                h30Var3 = h30Var;
                            }
                        } else {
                            h30Var = h30Var3;
                        }
                        g = seVar.g(c00Var3, i7, uvVar4.b, i8, uvVar5.b);
                        if (g) {
                        }
                        uvVar = null;
                        l90Var3.a = 0;
                        l90Var3.b = uvVar;
                        l90Var3.c = uvVar;
                        l90.d.c(l90Var3);
                        i4--;
                        h30Var3 = h30Var;
                    } else if (jzVar.a(c00Var3, c00Var3, uvVar4, uvVar5)) {
                        recyclerView3.S();
                    }
                } else {
                    h30Var = h30Var3;
                    if ((i5 & 4) != 0) {
                        uvVar = null;
                        ezVar.g(c00Var3, l90Var3.b, null);
                    } else {
                        uvVar = null;
                        if ((i5 & 8) != 0) {
                            ezVar.f(c00Var3, l90Var3.b, l90Var3.c);
                        }
                    }
                    l90Var3.a = 0;
                    l90Var3.b = uvVar;
                    l90Var3.c = uvVar;
                    l90.d.c(l90Var3);
                    i4--;
                    h30Var3 = h30Var;
                }
                h30Var = h30Var3;
                uvVar = null;
                l90Var3.a = 0;
                l90Var3.b = uvVar;
                l90Var3.c = uvVar;
                l90.d.c(l90Var3);
                i4--;
                h30Var3 = h30Var;
            }
        } else {
            z = true;
        }
        View view = null;
        this.r.i0(tzVar);
        zzVar.b = zzVar.e;
        this.G = false;
        this.H = false;
        zzVar.j = false;
        zzVar.k = false;
        this.r.f = false;
        ArrayList arrayList = tzVar.b;
        if (arrayList != null) {
            arrayList.clear();
        }
        nz nzVar = this.r;
        if (nzVar.k) {
            nzVar.j = 0;
            nzVar.k = false;
            tzVar.l();
        }
        this.r.d0(zzVar);
        boolean z10 = z;
        Q(z10);
        c0(false);
        ((h30) h5Var.g).clear();
        ((vr) h5Var.h).a();
        int[] iArr = this.s0;
        int i9 = iArr[0];
        int i10 = iArr[z10 ? 1 : 0];
        C(iArr);
        if ((iArr[0] == i9 && iArr[z10 ? 1 : 0] == i10) ? false : true) {
            t(0, 0);
        }
        if (this.g0 && this.q != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (!isFocused()) {
            }
            long j = zzVar.m;
            if (j != -1 && (z2 = this.q.b) && z2) {
                int q = r6Var.q();
                c00Var = null;
                int i11 = 0;
                while (true) {
                    if (i11 >= q) {
                        break;
                    }
                    c00 I5 = I(r6Var.p(i11));
                    if (I5 != null && !I5.h() && I5.e == j) {
                        if (!((ArrayList) r6Var.d).contains(I5.a)) {
                            c00Var = I5;
                            break;
                        }
                        c00Var = I5;
                    }
                    i11++;
                }
            } else {
                c00Var = null;
            }
            if (c00Var != null) {
                View view2 = c00Var.a;
                if (!((ArrayList) r6Var.d).contains(view2) && view2.hasFocusable()) {
                    view = view2;
                    if (view != null) {
                        int i12 = zzVar.n;
                        if (i12 != -1 && (findViewById = view.findViewById(i12)) != null && findViewById.isFocusable()) {
                            view = findViewById;
                        }
                        view.requestFocus();
                    }
                }
            }
            if (r6Var.i() > 0) {
                int i13 = zzVar.l;
                if (i13 == -1) {
                    i13 = 0;
                }
                int b = zzVar.b();
                for (int i14 = i13; i14 < b; i14++) {
                    c00 E = E(i14);
                    if (E == null) {
                        break;
                    }
                    View view3 = E.a;
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
                    c00 E2 = E(min);
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
        zzVar.m = -1L;
        zzVar.l = -1;
        zzVar.n = -1;
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
        nz nzVar = this.r;
        if (nzVar != null) {
            nzVar.g = true;
            nzVar.R(this);
        }
        this.q0 = false;
        ThreadLocal threadLocal = um.j;
        um umVar = (um) threadLocal.get();
        this.i0 = umVar;
        if (umVar == null) {
            um umVar2 = new um();
            umVar2.f = new ArrayList();
            umVar2.i = new ArrayList();
            this.i0 = umVar2;
            WeakHashMap weakHashMap = e90.a;
            Display display = getDisplay();
            if (!isInEditMode() && display != null) {
                f = display.getRefreshRate();
            }
            f = 60.0f;
            um umVar3 = this.i0;
            umVar3.h = (long) (1.0E9f / f);
            threadLocal.set(umVar3);
        }
        this.i0.f.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        wq wqVar;
        super.onDetachedFromWindow();
        jz jzVar = this.P;
        if (jzVar != null) {
            jzVar.e();
        }
        setScrollState(0);
        b00 b00Var = this.h0;
        b00Var.l.removeCallbacks(b00Var);
        b00Var.h.abortAnimation();
        nz nzVar = this.r;
        if (nzVar != null && (wqVar = nzVar.e) != null) {
            wqVar.i();
        }
        this.w = false;
        nz nzVar2 = this.r;
        if (nzVar2 != null) {
            nzVar2.g = false;
            nzVar2.S(this);
        }
        this.x0.clear();
        removeCallbacks(this.y0);
        this.k.getClass();
        while (l90.d.a() != null) {
        }
        um umVar = this.i0;
        if (umVar != null) {
            umVar.f.remove(this);
            this.i0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.t;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((kz) arrayList.get(i)).a(this);
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
        nz nzVar;
        if (this.r != null && !this.B && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f = this.r.e() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.r.d()) {
                    f2 = motionEvent.getAxisValue(10);
                    if (f == 0.0f || f2 != 0.0f) {
                        int i = (int) (f2 * this.e0);
                        int i2 = (int) (f * this.f0);
                        nzVar = this.r;
                        if (nzVar == null) {
                            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                            return false;
                        }
                        if (!this.B) {
                            int[] iArr = this.w0;
                            iArr[0] = 0;
                            iArr[1] = 0;
                            boolean d = nzVar.d();
                            boolean e = this.r.e();
                            getScrollingChildHelper().g(e ? (d ? 1 : 0) | 2 : d ? 1 : 0, 1);
                            if (r(d ? i : 0, e ? i2 : 0, 1, this.w0, this.u0)) {
                                i -= iArr[0];
                                i2 -= iArr[1];
                            }
                            X(d ? i : 0, e ? i2 : 0, motionEvent, 1);
                            um umVar = this.i0;
                            if (umVar != null && (i != 0 || i2 != 0)) {
                                umVar.a(this, i, i2);
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
                nzVar = this.r;
                if (nzVar == null) {
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
                        nzVar = this.r;
                        if (nzVar == null) {
                        }
                    } else if (this.r.d()) {
                        f2 = axisValue;
                        f = 0.0f;
                        if (f == 0.0f) {
                        }
                        int i322 = (int) (f2 * this.e0);
                        int i2222 = (int) (f * this.f0);
                        nzVar = this.r;
                        if (nzVar == null) {
                        }
                    }
                }
                f = 0.0f;
                f2 = 0.0f;
                if (f == 0.0f) {
                }
                int i3222 = (int) (f2 * this.e0);
                int i22222 = (int) (f * this.f0);
                nzVar = this.r;
                if (nzVar == null) {
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
            nz nzVar = this.r;
            if (nzVar != null) {
                boolean d = nzVar.d();
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
        int i5 = t60.a;
        Trace.beginSection("RV OnLayout");
        o();
        Trace.endSection();
        this.y = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        nz nzVar = this.r;
        if (nzVar == null) {
            n(i, i2);
            return;
        }
        boolean L = nzVar.L();
        boolean z = false;
        zz zzVar = this.k0;
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
            if (zzVar.d == 1) {
                p();
            }
            this.r.r0(i, i2);
            zzVar.i = true;
            q();
            this.r.t0(i, i2);
            if (this.r.w0()) {
                this.r.r0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                zzVar.i = true;
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
            if (zzVar.k) {
                zzVar.g = true;
            } else {
                this.i.c();
                zzVar.g = false;
            }
            this.E = false;
            c0(false);
        } else if (zzVar.k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        fz fzVar = this.q;
        if (fzVar != null) {
            zzVar.e = fzVar.a();
        } else {
            zzVar.e = 0;
        }
        b0();
        this.r.b.n(i, i2);
        c0(false);
        zzVar.g = false;
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
        if (!(parcelable instanceof wz)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        wz wzVar = (wz) parcelable;
        this.h = wzVar;
        super.onRestoreInstanceState(wzVar.getSuperState());
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        wz wzVar = new wz(super.onSaveInstanceState());
        wz wzVar2 = this.h;
        if (wzVar2 != null) {
            wzVar.f = wzVar2.f;
            return wzVar;
        }
        nz nzVar = this.r;
        if (nzVar != null) {
            wzVar.f = nzVar.f0();
            return wzVar;
        }
        wzVar.f = null;
        return wzVar;
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
        ax axVar;
        float f;
        int H;
        PointF a;
        int i2;
        int i3;
        boolean z3;
        if (!this.B && !this.C) {
            wi wiVar = this.v;
            if (wiVar == null) {
                z = motionEvent.getAction() == 0 ? false : B(motionEvent);
            } else {
                int i4 = wiVar.b;
                if (wiVar.v != 0) {
                    if (motionEvent.getAction() == 0) {
                        boolean d = wiVar.d(motionEvent.getX(), motionEvent.getY());
                        boolean c = wiVar.c(motionEvent.getX(), motionEvent.getY());
                        if (d || c) {
                            if (c) {
                                wiVar.w = 1;
                                wiVar.p = (int) motionEvent.getX();
                            } else if (d) {
                                wiVar.w = 2;
                                wiVar.m = (int) motionEvent.getY();
                            }
                            wiVar.f(2);
                        }
                    } else if (motionEvent.getAction() == 1 && wiVar.v == 2) {
                        wiVar.m = 0.0f;
                        wiVar.p = 0.0f;
                        wiVar.f(1);
                        wiVar.w = 0;
                    } else if (motionEvent.getAction() == 2 && wiVar.v == 2) {
                        wiVar.g();
                        if (wiVar.w == 1) {
                            float x = motionEvent.getX();
                            int[] iArr = wiVar.y;
                            iArr[0] = i4;
                            int i5 = wiVar.q - i4;
                            iArr[1] = i5;
                            float max = Math.max(i4, Math.min(i5, x));
                            if (Math.abs(wiVar.o - max) >= 2.0f) {
                                int e = wi.e(wiVar.p, max, iArr, wiVar.s.computeHorizontalScrollRange(), wiVar.s.computeHorizontalScrollOffset(), wiVar.q);
                                if (e != 0) {
                                    wiVar.s.scrollBy(e, 0);
                                }
                                wiVar.p = max;
                            }
                        }
                        if (wiVar.w == 2) {
                            float y = motionEvent.getY();
                            int[] iArr2 = wiVar.x;
                            iArr2[0] = i4;
                            int i6 = wiVar.r - i4;
                            iArr2[1] = i6;
                            float max2 = Math.max(i4, Math.min(i6, y));
                            if (Math.abs(wiVar.l - max2) >= 2.0f) {
                                int e2 = wi.e(wiVar.m, max2, iArr2, wiVar.s.computeVerticalScrollRange(), wiVar.s.computeVerticalScrollOffset(), wiVar.r);
                                if (e2 != 0) {
                                    wiVar.s.scrollBy(0, e2);
                                }
                                wiVar.m = max2;
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
            nz nzVar = this.r;
            if (nzVar != null) {
                boolean d2 = nzVar.d();
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
                            nz nzVar2 = this.r;
                            if (nzVar2 == null) {
                                Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                            } else if (!this.B) {
                                int d3 = nzVar2.d();
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
                                        pz pzVar = this.b0;
                                        if (pzVar != null) {
                                            bx bxVar = (bx) pzVar;
                                            nz layoutManager = bxVar.a.getLayoutManager();
                                            if (layoutManager != 0 && bxVar.a.getAdapter() != null && ((Math.abs(i10) > (minFlingVelocity = bxVar.a.getMinFlingVelocity()) || Math.abs(i9) > minFlingVelocity) && ((z2 = layoutManager instanceof yz)))) {
                                                if (z2) {
                                                    f = 0.0f;
                                                    axVar = new ax(bxVar, bxVar.a.getContext());
                                                } else {
                                                    f = 0.0f;
                                                    axVar = null;
                                                }
                                                if (axVar != null) {
                                                    int B = layoutManager.B();
                                                    if (B != 0) {
                                                        zg e5 = layoutManager.e() ? bxVar.e(layoutManager) : layoutManager.d() ? bxVar.d(layoutManager) : null;
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
                                                                    int b = bx.b(u, e5);
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
                                                                H = nz.H(view);
                                                            } else if (z5 || view2 == null) {
                                                                if (z5) {
                                                                    view = view2;
                                                                }
                                                                if (view != null) {
                                                                    H = ((z2 && (a = ((yz) layoutManager).a(layoutManager.B() + (-1))) != null && ((a.x > f ? 1 : (a.x == f ? 0 : -1)) < 0 || (a.y > f ? 1 : (a.y == f ? 0 : -1)) < 0)) == z5 ? -1 : 1) + nz.H(view);
                                                                    if (H >= 0) {
                                                                    }
                                                                }
                                                                H = -1;
                                                            } else {
                                                                H = nz.H(view2);
                                                            }
                                                            if (H != -1) {
                                                                axVar.a = H;
                                                                layoutManager.z0(axVar);
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
                                                                b00 b00Var = this.h0;
                                                                RecyclerView recyclerView = b00Var.l;
                                                                recyclerView.setScrollState(2);
                                                                b00Var.g = 0;
                                                                b00Var.f = 0;
                                                                Interpolator interpolator = b00Var.i;
                                                                dz dzVar = F0;
                                                                if (interpolator != dzVar) {
                                                                    b00Var.i = dzVar;
                                                                    b00Var.h = new OverScroller(recyclerView.getContext(), dzVar);
                                                                }
                                                                b00Var.h.fling(0, 0, max3, max4, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                                                b00Var.a();
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
                            um umVar = this.i0;
                            if (umVar != null && (i21 != 0 || i23 != 0)) {
                                umVar.a(this, i21, i23);
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
        l90 l90Var;
        View A;
        zz zzVar = this.k0;
        zzVar.a(1);
        z(zzVar);
        zzVar.i = false;
        b0();
        h5 h5Var = this.k;
        h30 h30Var = (h30) h5Var.g;
        h30 h30Var2 = (h30) h5Var.g;
        h30Var.clear();
        vr vrVar = (vr) h5Var.h;
        vrVar.a();
        P();
        T();
        c00 c00Var = null;
        View focusedChild = (this.g0 && hasFocus() && this.q != null) ? getFocusedChild() : null;
        if (focusedChild != null && (A = A(focusedChild)) != null) {
            c00Var = H(A);
        }
        if (c00Var == null) {
            zzVar.m = -1L;
            zzVar.l = -1;
            zzVar.n = -1;
        } else {
            zzVar.m = this.q.b ? c00Var.e : -1L;
            if (!this.G) {
                if (c00Var.h()) {
                    F = c00Var.d;
                } else {
                    RecyclerView recyclerView = c00Var.r;
                    if (recyclerView != null) {
                        F = recyclerView.F(c00Var);
                    }
                }
                zzVar.l = F;
                view = c00Var.a;
                int id = view.getId();
                while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                    view = ((ViewGroup) view).getFocusedChild();
                    if (view.getId() == -1) {
                        id = view.getId();
                    }
                }
                zzVar.n = id;
            }
            F = -1;
            zzVar.l = F;
            view = c00Var.a;
            int id2 = view.getId();
            while (!view.isFocused()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() == -1) {
                }
            }
            zzVar.n = id2;
        }
        zzVar.h = zzVar.j && this.o0;
        this.o0 = false;
        this.n0 = false;
        zzVar.g = zzVar.k;
        zzVar.e = this.q.a();
        C(this.s0);
        boolean z = zzVar.j;
        r6 r6Var = this.j;
        if (z) {
            int i = r6Var.i();
            for (int i2 = 0; i2 < i; i2++) {
                c00 I = I(r6Var.h(i2));
                if (!I.o() && (!I.f() || this.q.b)) {
                    jz jzVar = this.P;
                    jz.b(I);
                    I.c();
                    jzVar.getClass();
                    uv uvVar = new uv();
                    uvVar.a(I);
                    l90 l90Var2 = (l90) h30Var2.get(I);
                    if (l90Var2 == null) {
                        l90Var2 = l90.a();
                        h30Var2.put(I, l90Var2);
                    }
                    l90Var2.b = uvVar;
                    l90Var2.a |= 4;
                    if (zzVar.h && I.k() && !I.h() && !I.o() && !I.f()) {
                        vrVar.d(G(I), I);
                    }
                }
            }
        }
        if (zzVar.k) {
            int q = r6Var.q();
            for (int i3 = 0; i3 < q; i3++) {
                c00 I2 = I(r6Var.p(i3));
                if (!I2.o() && I2.d == -1) {
                    I2.d = I2.c;
                }
            }
            boolean z2 = zzVar.f;
            zzVar.f = false;
            this.r.c0(this.g, zzVar);
            zzVar.f = z2;
            for (int i4 = 0; i4 < r6Var.i(); i4++) {
                c00 I3 = I(r6Var.h(i4));
                if (!I3.o() && ((l90Var = (l90) h30Var2.get(I3)) == null || (l90Var.a & 4) == 0)) {
                    jz.b(I3);
                    boolean z3 = (I3.j & 8192) != 0;
                    jz jzVar2 = this.P;
                    I3.c();
                    jzVar2.getClass();
                    uv uvVar2 = new uv();
                    uvVar2.a(I3);
                    if (z3) {
                        U(I3, uvVar2);
                    } else {
                        l90 l90Var3 = (l90) h30Var2.get(I3);
                        if (l90Var3 == null) {
                            l90Var3 = l90.a();
                            h30Var2.put(I3, l90Var3);
                        }
                        l90Var3.a |= 2;
                        l90Var3.b = uvVar2;
                    }
                }
            }
            k();
        } else {
            k();
        }
        Q(true);
        c0(false);
        zzVar.d = 2;
    }

    public final void q() {
        b0();
        P();
        zz zzVar = this.k0;
        zzVar.a(6);
        this.i.c();
        zzVar.e = this.q.a();
        zzVar.c = 0;
        if (this.h != null) {
            fz fzVar = this.q;
            int i = o30.i(fzVar.c);
            if (i == 1 ? fzVar.a() > 0 : i != 2) {
                Parcelable parcelable = this.h.f;
                if (parcelable != null) {
                    this.r.e0(parcelable);
                }
                this.h = null;
            }
        }
        zzVar.g = false;
        this.r.c0(this.g, zzVar);
        zzVar.f = false;
        zzVar.j = zzVar.j && this.P != null;
        zzVar.d = 4;
        Q(true);
        c0(false);
    }

    public final boolean r(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i2, i3, iArr, iArr2);
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        c00 I = I(view);
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
        wq wqVar = this.r.e;
        if ((wqVar == null || !wqVar.e) && !L() && view2 != null) {
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
            ((wi) arrayList.get(i)).getClass();
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
        nz nzVar = this.r;
        if (nzVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.B) {
            return;
        }
        boolean d = nzVar.d();
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

    public void setAccessibilityDelegateCompat(e00 e00Var) {
        this.r0 = e00Var;
        e90.m(this, e00Var);
    }

    public void setAdapter(fz fzVar) {
        setLayoutFrozen(false);
        fz fzVar2 = this.q;
        vz vzVar = this.f;
        if (fzVar2 != null) {
            fzVar2.a.unregisterObserver(vzVar);
            this.q.getClass();
        }
        jz jzVar = this.P;
        if (jzVar != null) {
            jzVar.e();
        }
        nz nzVar = this.r;
        tz tzVar = this.g;
        if (nzVar != null) {
            nzVar.h0(tzVar);
            this.r.i0(tzVar);
        }
        tzVar.a.clear();
        tzVar.e();
        l2 l2Var = this.i;
        l2Var.l(l2Var.b);
        l2Var.l((ArrayList) l2Var.d);
        l2Var.a = 0;
        fz fzVar3 = this.q;
        this.q = fzVar;
        if (fzVar != null) {
            fzVar.a.registerObserver(vzVar);
        }
        nz nzVar2 = this.r;
        if (nzVar2 != null) {
            nzVar2.Q();
        }
        fz fzVar4 = this.q;
        tzVar.a.clear();
        tzVar.e();
        sz c = tzVar.c();
        if (fzVar3 != null) {
            c.b--;
        }
        if (c.b == 0) {
            SparseArray sparseArray = c.a;
            for (int i = 0; i < sparseArray.size(); i++) {
                ((rz) sparseArray.valueAt(i)).a.clear();
            }
        }
        if (fzVar4 != null) {
            c.b++;
        }
        this.k0.f = true;
        this.H |= false;
        this.G = true;
        r6 r6Var = this.j;
        int q = r6Var.q();
        for (int i2 = 0; i2 < q; i2++) {
            c00 I = I(r6Var.p(i2));
            if (I != null && !I.o()) {
                I.a(6);
            }
        }
        N();
        ArrayList arrayList = tzVar.c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            c00 c00Var = (c00) arrayList.get(i3);
            if (c00Var != null) {
                c00Var.a(6);
                c00Var.a(1024);
            }
        }
        fz fzVar5 = tzVar.h.q;
        if (fzVar5 == null || !fzVar5.b) {
            tzVar.e();
        }
        requestLayout();
    }

    public void setChildDrawingOrderCallback(hz hzVar) {
        if (hzVar == null) {
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

    public void setEdgeEffectFactory(iz izVar) {
        izVar.getClass();
        this.K = izVar;
        this.O = null;
        this.M = null;
        this.N = null;
        this.L = null;
    }

    public void setHasFixedSize(boolean z) {
        this.x = z;
    }

    public void setItemAnimator(jz jzVar) {
        jz jzVar2 = this.P;
        if (jzVar2 != null) {
            jzVar2.e();
            this.P.a = null;
        }
        this.P = jzVar;
        if (jzVar != null) {
            jzVar.a = this.p0;
        }
    }

    public void setItemViewCacheSize(int i) {
        tz tzVar = this.g;
        tzVar.e = i;
        tzVar.l();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(nz nzVar) {
        RecyclerView recyclerView;
        wq wqVar;
        if (nzVar == this.r) {
            return;
        }
        setScrollState(0);
        b00 b00Var = this.h0;
        b00Var.l.removeCallbacks(b00Var);
        b00Var.h.abortAnimation();
        nz nzVar2 = this.r;
        if (nzVar2 != null && (wqVar = nzVar2.e) != null) {
            wqVar.i();
        }
        nz nzVar3 = this.r;
        tz tzVar = this.g;
        if (nzVar3 != null) {
            jz jzVar = this.P;
            if (jzVar != null) {
                jzVar.e();
            }
            this.r.h0(tzVar);
            this.r.i0(tzVar);
            tzVar.a.clear();
            tzVar.e();
            if (this.w) {
                nz nzVar4 = this.r;
                nzVar4.g = false;
                nzVar4.S(this);
            }
            this.r.u0(null);
            this.r = null;
        } else {
            tzVar.a.clear();
            tzVar.e();
        }
        r6 r6Var = this.j;
        ((aa) r6Var.c).h();
        ArrayList arrayList = (ArrayList) r6Var.d;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = ((ez) r6Var.b).a;
            if (size < 0) {
                break;
            }
            c00 I = I((View) arrayList.get(size));
            if (I != null) {
                int i = I.p;
                if (recyclerView.L()) {
                    I.q = i;
                    recyclerView.x0.add(I);
                } else {
                    View view = I.a;
                    WeakHashMap weakHashMap = e90.a;
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
        this.r = nzVar;
        if (nzVar != null) {
            if (nzVar.b != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(nzVar);
                String y = nzVar.b.y();
                sb.append(" is already attached to a RecyclerView:");
                sb.append(y);
                throw new IllegalArgumentException(sb.toString());
            }
            nzVar.u0(this);
            if (this.w) {
                nz nzVar5 = this.r;
                nzVar5.g = true;
                nzVar5.R(this);
            }
        }
        tzVar.l();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
        } else {
            o8.j("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        rv scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.d) {
            ViewGroup viewGroup = scrollingChildHelper.c;
            WeakHashMap weakHashMap = e90.a;
            viewGroup.stopNestedScroll();
        }
        scrollingChildHelper.d = z;
    }

    public void setOnFlingListener(pz pzVar) {
        this.b0 = pzVar;
    }

    @Deprecated
    public void setOnScrollListener(qz qzVar) {
        this.l0 = qzVar;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.g0 = z;
    }

    public void setRecycledViewPool(sz szVar) {
        tz tzVar = this.g;
        if (tzVar.g != null) {
            r0.b--;
        }
        tzVar.g = szVar;
        if (szVar == null || tzVar.h.getAdapter() == null) {
            return;
        }
        tzVar.g.b++;
    }

    public void setScrollState(int i) {
        wq wqVar;
        if (i == this.Q) {
            return;
        }
        this.Q = i;
        if (i != 2) {
            b00 b00Var = this.h0;
            b00Var.l.removeCallbacks(b00Var);
            b00Var.h.abortAnimation();
            nz nzVar = this.r;
            if (nzVar != null && (wqVar = nzVar.e) != null) {
                wqVar.i();
            }
        }
        nz nzVar2 = this.r;
        if (nzVar2 != null) {
            nzVar2.g0(i);
        }
        qz qzVar = this.l0;
        if (qzVar != null) {
            qzVar.a(this, i);
        }
        ArrayList arrayList = this.m0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((qz) this.m0.get(size)).a(this, i);
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

    public void setViewCacheExtension(a00 a00Var) {
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
        wq wqVar;
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
            b00 b00Var = this.h0;
            b00Var.l.removeCallbacks(b00Var);
            b00Var.h.abortAnimation();
            nz nzVar = this.r;
            if (nzVar == null || (wqVar = nzVar.e) == null) {
                return;
            }
            wqVar.i();
        }
    }

    public final void t(int i, int i2) {
        this.J++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        qz qzVar = this.l0;
        if (qzVar != null) {
            qzVar.b(this, i, i2);
        }
        ArrayList arrayList = this.m0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((qz) this.m0.get(size)).b(this, i, i2);
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

    public final void z(zz zzVar) {
        if (getScrollState() != 2) {
            zzVar.getClass();
            return;
        }
        OverScroller overScroller = this.h0.h;
        overScroller.getFinalX();
        overScroller.getCurrX();
        zzVar.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        nz nzVar = this.r;
        if (nzVar != null) {
            return nzVar.t(layoutParams);
        }
        o8.t("RecyclerView has no LayoutManager".concat(y()));
        return null;
    }

    @Deprecated
    public void setRecyclerListener(uz uzVar) {
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.awerser.monnit.betplay.R.attr.recyclerViewStyle);
    }
}
