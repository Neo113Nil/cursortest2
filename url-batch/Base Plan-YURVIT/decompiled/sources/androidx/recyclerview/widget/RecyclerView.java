package androidx.recyclerview.widget;

import B0.C0000a;
import B0.C0008i;
import C.b;
import C.d;
import M.a;
import N.A;
import N.B;
import N.C;
import N.C0045b;
import N.C0046c;
import N.C0050g;
import N.C0052i;
import N.D;
import N.E;
import N.F;
import N.G;
import N.H;
import N.InterpolatorC0060q;
import N.J;
import N.Q;
import N.RunnableC0054k;
import N.s;
import N.t;
import N.u;
import N.w;
import N.z;
import P0.h;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
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
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import u.c;
import y.AbstractC0252B;
import y.AbstractC0272p;
import y.C0263g;
import y.r;
import y.x;
import y.y;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* renamed from: l0, reason: collision with root package name */
    public static final int[] f1655l0 = {R.attr.nestedScrollingEnabled};

    /* renamed from: m0, reason: collision with root package name */
    public static final int[] f1656m0 = {R.attr.clipToPadding};

    /* renamed from: n0, reason: collision with root package name */
    public static final Class[] f1657n0;

    /* renamed from: o0, reason: collision with root package name */
    public static final InterpolatorC0060q f1658o0;

    /* renamed from: A, reason: collision with root package name */
    public int f1659A;

    /* renamed from: B, reason: collision with root package name */
    public final int f1660B;

    /* renamed from: C, reason: collision with root package name */
    public t f1661C;

    /* renamed from: D, reason: collision with root package name */
    public EdgeEffect f1662D;

    /* renamed from: E, reason: collision with root package name */
    public EdgeEffect f1663E;

    /* renamed from: F, reason: collision with root package name */
    public EdgeEffect f1664F;
    public EdgeEffect G;

    /* renamed from: H, reason: collision with root package name */
    public u f1665H;

    /* renamed from: I, reason: collision with root package name */
    public int f1666I;

    /* renamed from: J, reason: collision with root package name */
    public int f1667J;

    /* renamed from: K, reason: collision with root package name */
    public VelocityTracker f1668K;

    /* renamed from: L, reason: collision with root package name */
    public int f1669L;

    /* renamed from: M, reason: collision with root package name */
    public int f1670M;

    /* renamed from: N, reason: collision with root package name */
    public int f1671N;

    /* renamed from: O, reason: collision with root package name */
    public int f1672O;

    /* renamed from: P, reason: collision with root package name */
    public int f1673P;

    /* renamed from: Q, reason: collision with root package name */
    public final int f1674Q;

    /* renamed from: R, reason: collision with root package name */
    public final int f1675R;

    /* renamed from: S, reason: collision with root package name */
    public final float f1676S;

    /* renamed from: T, reason: collision with root package name */
    public final float f1677T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f1678U;
    public final H V;

    /* renamed from: W, reason: collision with root package name */
    public RunnableC0054k f1679W;

    /* renamed from: a0, reason: collision with root package name */
    public final C0052i f1680a0;
    public final F b0;

    /* renamed from: c0, reason: collision with root package name */
    public ArrayList f1681c0;

    /* renamed from: d0, reason: collision with root package name */
    public final C0000a f1682d0;

    /* renamed from: e, reason: collision with root package name */
    public final C f1683e;

    /* renamed from: e0, reason: collision with root package name */
    public J f1684e0;

    /* renamed from: f, reason: collision with root package name */
    public E f1685f;

    /* renamed from: f0, reason: collision with root package name */
    public C0263g f1686f0;

    /* renamed from: g, reason: collision with root package name */
    public final C0008i f1687g;

    /* renamed from: g0, reason: collision with root package name */
    public final int[] f1688g0;

    /* renamed from: h, reason: collision with root package name */
    public final C0008i f1689h;

    /* renamed from: h0, reason: collision with root package name */
    public final int[] f1690h0;

    /* renamed from: i, reason: collision with root package name */
    public final C0000a f1691i;
    public final int[] i0;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1692j;

    /* renamed from: j0, reason: collision with root package name */
    public final ArrayList f1693j0;

    /* renamed from: k, reason: collision with root package name */
    public final Rect f1694k;

    /* renamed from: k0, reason: collision with root package name */
    public final b f1695k0;

    /* renamed from: l, reason: collision with root package name */
    public final Rect f1696l;

    /* renamed from: m, reason: collision with root package name */
    public w f1697m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f1698n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f1699o;

    /* renamed from: p, reason: collision with root package name */
    public C0050g f1700p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1701q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1702r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1703s;
    public int t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1704u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1705v;

    /* renamed from: w, reason: collision with root package name */
    public int f1706w;

    /* renamed from: x, reason: collision with root package name */
    public final AccessibilityManager f1707x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f1708y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1709z;

    static {
        Class cls = Integer.TYPE;
        f1657n0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f1658o0 = new InterpolatorC0060q();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        float a2;
        Constructor constructor;
        this.f1683e = new C(this);
        this.f1691i = new C0000a();
        this.f1694k = new Rect();
        this.f1696l = new Rect();
        new RectF();
        this.f1698n = new ArrayList();
        this.f1699o = new ArrayList();
        this.t = 0;
        this.f1708y = false;
        this.f1709z = false;
        this.f1659A = 0;
        this.f1660B = 0;
        this.f1661C = new t();
        C0046c c0046c = new C0046c();
        Object[] objArr = null;
        c0046c.f768a = null;
        c0046c.f769b = new ArrayList();
        c0046c.f770c = 250L;
        c0046c.f771d = 250L;
        c0046c.f703e = new ArrayList();
        c0046c.f704f = new ArrayList();
        c0046c.f705g = new ArrayList();
        c0046c.f706h = new ArrayList();
        c0046c.f707i = new ArrayList();
        c0046c.f708j = new ArrayList();
        c0046c.f709k = new ArrayList();
        c0046c.f710l = new ArrayList();
        c0046c.f711m = new ArrayList();
        c0046c.f712n = new ArrayList();
        c0046c.f713o = new ArrayList();
        this.f1665H = c0046c;
        this.f1666I = 0;
        this.f1667J = -1;
        this.f1676S = Float.MIN_VALUE;
        this.f1677T = Float.MIN_VALUE;
        boolean z2 = true;
        this.f1678U = true;
        this.V = new H(this);
        this.f1680a0 = new C0052i();
        F f2 = new F();
        f2.f657a = 0;
        f2.f658b = false;
        f2.f659c = false;
        f2.f660d = false;
        f2.f661e = false;
        this.b0 = f2;
        C0000a c0000a = new C0000a(14);
        this.f1682d0 = c0000a;
        this.f1688g0 = new int[2];
        this.f1690h0 = new int[2];
        this.i0 = new int[2];
        this.f1693j0 = new ArrayList();
        this.f1695k0 = new b(2, this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1656m0, 0, 0);
            this.f1692j = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.f1692j = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1673P = viewConfiguration.getScaledTouchSlop();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            Method method = AbstractC0252B.f3101a;
            a2 = y.a(viewConfiguration);
        } else {
            a2 = AbstractC0252B.a(viewConfiguration, context);
        }
        this.f1676S = a2;
        this.f1677T = i2 >= 26 ? y.b(viewConfiguration) : AbstractC0252B.a(viewConfiguration, context);
        this.f1674Q = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1675R = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f1665H.f768a = c0000a;
        this.f1687g = new C0008i(new C0000a(13, this));
        this.f1689h = new C0008i(new B0.E(9, this));
        Field field = x.f3160a;
        if ((i2 >= 26 ? r.c(this) : 0) == 0 && i2 >= 26) {
            r.m(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f1707x = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new J(this));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, a.f647a, 0, 0);
            String string = obtainStyledAttributes2.getString(7);
            if (obtainStyledAttributes2.getInt(1, -1) == -1) {
                setDescendantFocusability(262144);
            }
            if (obtainStyledAttributes2.getBoolean(2, false)) {
                StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes2.getDrawable(5);
                Drawable drawable = obtainStyledAttributes2.getDrawable(6);
                StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes2.getDrawable(3);
                Drawable drawable2 = obtainStyledAttributes2.getDrawable(4);
                if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                    throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + h());
                }
                Resources resources = getContext().getResources();
                new C0050g(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.crane.slab.beam.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.crane.slab.beam.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.crane.slab.beam.R.dimen.fastscroll_margin));
            }
            obtainStyledAttributes2.recycle();
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
                        Class<? extends U> asSubclass = (isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).loadClass(str).asSubclass(w.class);
                        try {
                            constructor = asSubclass.getConstructor(f1657n0);
                            objArr = new Object[]{context, attributeSet, 0, 0};
                        } catch (NoSuchMethodException e2) {
                            try {
                                constructor = asSubclass.getConstructor(null);
                            } catch (NoSuchMethodException e3) {
                                e3.initCause(e2);
                                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e3);
                            }
                        }
                        constructor.setAccessible(true);
                        setLayoutManager((w) constructor.newInstance(objArr));
                    } catch (ClassCastException e4) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e4);
                    } catch (ClassNotFoundException e5) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e5);
                    } catch (IllegalAccessException e6) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e6);
                    } catch (InstantiationException e7) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e7);
                    } catch (InvocationTargetException e8) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e8);
                    }
                }
            }
            TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f1655l0, 0, 0);
            z2 = obtainStyledAttributes3.getBoolean(0, true);
            obtainStyledAttributes3.recycle();
        } else {
            setDescendantFocusability(262144);
        }
        setNestedScrollingEnabled(z2);
    }

    private C0263g getScrollingChildHelper() {
        if (this.f1686f0 == null) {
            this.f1686f0 = new C0263g(this);
        }
        return this.f1686f0;
    }

    public static void j(View view) {
        if (view == null) {
            return;
        }
        ((N.x) view.getLayoutParams()).getClass();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i2, int i3) {
        w wVar = this.f1697m;
        if (wVar != null) {
            wVar.getClass();
        }
        super.addFocusables(arrayList, i2, i3);
    }

    public final void b(String str) {
        if (this.f1659A > 0) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + h());
        }
        if (this.f1660B > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + h()));
        }
    }

    public final void c(int i2, int i3) {
        boolean z2;
        EdgeEffect edgeEffect = this.f1662D;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            z2 = false;
        } else {
            this.f1662D.onRelease();
            z2 = this.f1662D.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f1664F;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.f1664F.onRelease();
            z2 |= this.f1664F.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1663E;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.f1663E.onRelease();
            z2 |= this.f1663E.isFinished();
        }
        EdgeEffect edgeEffect4 = this.G;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.G.onRelease();
            z2 |= this.G.isFinished();
        }
        if (z2) {
            Field field = x.f3160a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof N.x) && this.f1697m.d((N.x) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        w wVar = this.f1697m;
        if (wVar != null && wVar.b()) {
            return this.f1697m.f(this.b0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        w wVar = this.f1697m;
        if (wVar != null && wVar.b()) {
            this.f1697m.g(this.b0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        w wVar = this.f1697m;
        if (wVar != null && wVar.b()) {
            return this.f1697m.h(this.b0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        w wVar = this.f1697m;
        if (wVar != null && wVar.c()) {
            return this.f1697m.i(this.b0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        w wVar = this.f1697m;
        if (wVar != null && wVar.c()) {
            this.f1697m.j(this.b0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        w wVar = this.f1697m;
        if (wVar != null && wVar.c()) {
            return this.f1697m.k(this.b0);
        }
        return 0;
    }

    public final void d() {
        if (!this.f1703s || this.f1708y) {
            int i2 = c.f2984a;
            Trace.beginSection("RV FullInvalidate");
            Log.e("RecyclerView", "No adapter attached; skipping layout");
            Trace.endSection();
            return;
        }
        C0008i c0008i = this.f1687g;
        if (((ArrayList) c0008i.f85g).size() > 0) {
            c0008i.getClass();
            if (((ArrayList) c0008i.f85g).size() > 0) {
                int i3 = c.f2984a;
                Trace.beginSection("RV FullInvalidate");
                Log.e("RecyclerView", "No adapter attached; skipping layout");
                Trace.endSection();
            }
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
    public final boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i2, i3, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().d(i2, i3, i4, i5, iArr, 0, null);
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
        ArrayList arrayList = this.f1698n;
        int size = arrayList.size();
        boolean z3 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            C0050g c0050g = (C0050g) arrayList.get(i2);
            if (c0050g.f730l != c0050g.f732n.getWidth() || c0050g.f731m != c0050g.f732n.getHeight()) {
                c0050g.f730l = c0050g.f732n.getWidth();
                c0050g.f731m = c0050g.f732n.getHeight();
                c0050g.e(0);
            } else if (c0050g.f739v != 0) {
                if (c0050g.f733o) {
                    int i3 = c0050g.f730l;
                    int i4 = c0050g.f722d;
                    int i5 = i3 - i4;
                    int i6 = 0 - (0 / 2);
                    StateListDrawable stateListDrawable = c0050g.f720b;
                    stateListDrawable.setBounds(0, 0, i4, 0);
                    Drawable drawable = c0050g.f721c;
                    drawable.setBounds(0, 0, c0050g.f723e, c0050g.f731m);
                    RecyclerView recyclerView = c0050g.f732n;
                    Field field = x.f3160a;
                    if (recyclerView.getLayoutDirection() == 1) {
                        drawable.draw(canvas);
                        canvas.translate(i4, i6);
                        canvas.scale(-1.0f, 1.0f);
                        stateListDrawable.draw(canvas);
                        canvas.scale(1.0f, 1.0f);
                        canvas.translate(-i4, -i6);
                    } else {
                        canvas.translate(i5, 0.0f);
                        drawable.draw(canvas);
                        canvas.translate(0.0f, i6);
                        stateListDrawable.draw(canvas);
                        canvas.translate(-i5, -i6);
                    }
                }
                if (c0050g.f734p) {
                    int i7 = c0050g.f731m;
                    int i8 = c0050g.f726h;
                    int i9 = i7 - i8;
                    StateListDrawable stateListDrawable2 = c0050g.f724f;
                    stateListDrawable2.setBounds(0, 0, 0, i8);
                    Drawable drawable2 = c0050g.f725g;
                    drawable2.setBounds(0, 0, c0050g.f730l, c0050g.f727i);
                    canvas.translate(0.0f, i9);
                    drawable2.draw(canvas);
                    canvas.translate(0 - (0 / 2), 0.0f);
                    stateListDrawable2.draw(canvas);
                    canvas.translate(-r8, -i9);
                }
            }
            i2++;
        }
        EdgeEffect edgeEffect = this.f1662D;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f1692j ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f1662D;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f1663E;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f1692j) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f1663E;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f1664F;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f1692j ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f1664F;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.G;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f1692j) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.G;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(save4);
        }
        if ((z2 || this.f1665H == null || arrayList.size() <= 0 || !this.f1665H.b()) ? z2 : true) {
            Field field2 = x.f3160a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    public final void e(int i2, int i3) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        Field field = x.f3160a;
        setMeasuredDimension(w.e(i2, paddingRight, getMinimumWidth()), w.e(i3, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final boolean f(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return getScrollingChildHelper().c(i2, i3, iArr, iArr2, i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c2, code lost:
    
        if (r4 > 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e0, code lost:
    
        if (r7 > 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e3, code lost:
    
        if (r4 < 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e6, code lost:
    
        if (r7 < 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ee, code lost:
    
        if ((r7 * r1) < 0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f6, code lost:
    
        if ((r7 * r1) > 0) goto L83;
     */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View focusSearch(View view, int i2) {
        int i3;
        this.f1697m.getClass();
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i2);
        if (findNextFocus != null && !findNextFocus.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i2);
            }
            o(findNextFocus, null);
            return view;
        }
        if (findNextFocus != null && findNextFocus != this && i(findNextFocus) != null) {
            if (view != null && i(view) != null) {
                int width = view.getWidth();
                int height = view.getHeight();
                Rect rect = this.f1694k;
                char c2 = 0;
                rect.set(0, 0, width, height);
                int width2 = findNextFocus.getWidth();
                int height2 = findNextFocus.getHeight();
                Rect rect2 = this.f1696l;
                rect2.set(0, 0, width2, height2);
                offsetDescendantRectToMyCoords(view, rect);
                offsetDescendantRectToMyCoords(findNextFocus, rect2);
                RecyclerView recyclerView = this.f1697m.f775b;
                Field field = x.f3160a;
                int i4 = recyclerView.getLayoutDirection() == 1 ? -1 : 1;
                int i5 = rect.left;
                int i6 = rect2.left;
                if ((i5 < i6 || rect.right <= i6) && rect.right < rect2.right) {
                    i3 = 1;
                } else {
                    int i7 = rect.right;
                    int i8 = rect2.right;
                    i3 = ((i7 > i8 || i5 >= i8) && i5 > i6) ? -1 : 0;
                }
                int i9 = rect.top;
                int i10 = rect2.top;
                if ((i9 < i10 || rect.bottom <= i10) && rect.bottom < rect2.bottom) {
                    c2 = 1;
                } else {
                    int i11 = rect.bottom;
                    int i12 = rect2.bottom;
                    if ((i11 > i12 || i9 >= i12) && i9 > i10) {
                        c2 = 65535;
                    }
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 17) {
                            if (i2 != 33) {
                                if (i2 != 66) {
                                    if (i2 != 130) {
                                        throw new IllegalArgumentException("Invalid direction: " + i2 + h());
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
            return findNextFocus;
        }
        return super.focusSearch(view, i2);
    }

    public final boolean g(int[] iArr, int i2) {
        return getScrollingChildHelper().d(0, 0, 0, 0, iArr, i2, null);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        w wVar = this.f1697m;
        if (wVar != null) {
            return wVar.l();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + h());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        w wVar = this.f1697m;
        if (wVar != null) {
            return wVar.m(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + h());
    }

    public N.r getAdapter() {
        return null;
    }

    @Override // android.view.View
    public int getBaseline() {
        w wVar = this.f1697m;
        if (wVar == null) {
            return super.getBaseline();
        }
        wVar.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i2, int i3) {
        return super.getChildDrawingOrder(i2, i3);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f1692j;
    }

    public J getCompatAccessibilityDelegate() {
        return this.f1684e0;
    }

    public t getEdgeEffectFactory() {
        return this.f1661C;
    }

    public u getItemAnimator() {
        return this.f1665H;
    }

    public int getItemDecorationCount() {
        return this.f1698n.size();
    }

    public w getLayoutManager() {
        return this.f1697m;
    }

    public int getMaxFlingVelocity() {
        return this.f1675R;
    }

    public int getMinFlingVelocity() {
        return this.f1674Q;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public N.y getOnFlingListener() {
        return null;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f1678U;
    }

    public B getRecycledViewPool() {
        C c2 = this.f1683e;
        if (c2.f654e == null) {
            B b2 = new B();
            b2.f648a = new SparseArray();
            b2.f649b = 0;
            c2.f654e = b2;
        }
        return c2.f654e;
    }

    public int getScrollState() {
        return this.f1666I;
    }

    public final String h() {
        return " " + super.toString() + ", adapter:null, layout:" + this.f1697m + ", context:" + getContext();
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View i(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        return null;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f1701q;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f3150d;
    }

    public final boolean k() {
        return getScrollingChildHelper().f(1);
    }

    public final boolean l() {
        return !this.f1703s || this.f1708y || ((ArrayList) this.f1687g.f85g).size() > 0;
    }

    public final void m() {
        int y2 = this.f1689h.y();
        for (int i2 = 0; i2 < y2; i2++) {
            ((N.x) this.f1689h.x(i2).getLayoutParams()).f782b = true;
        }
        ArrayList arrayList = this.f1683e.f651b;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    public final void n(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1667J) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.f1667J = motionEvent.getPointerId(i2);
            int x2 = (int) (motionEvent.getX(i2) + 0.5f);
            this.f1671N = x2;
            this.f1669L = x2;
            int y2 = (int) (motionEvent.getY(i2) + 0.5f);
            this.f1672O = y2;
            this.f1670M = y2;
        }
    }

    public final void o(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f1694k;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof N.x) {
            N.x xVar = (N.x) layoutParams;
            if (!xVar.f782b) {
                Rect rect2 = xVar.f781a;
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
        this.f1697m.G(this, view, this.f1694k, !this.f1703s, view2 == null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r1 >= 30.0f) goto L19;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAttachedToWindow() {
        float f2;
        super.onAttachedToWindow();
        boolean z2 = false;
        this.f1659A = 0;
        this.f1701q = true;
        if (this.f1703s && !isLayoutRequested()) {
            z2 = true;
        }
        this.f1703s = z2;
        w wVar = this.f1697m;
        if (wVar != null) {
            wVar.f778e = true;
        }
        ThreadLocal threadLocal = RunnableC0054k.f749i;
        RunnableC0054k runnableC0054k = (RunnableC0054k) threadLocal.get();
        this.f1679W = runnableC0054k;
        if (runnableC0054k == null) {
            RunnableC0054k runnableC0054k2 = new RunnableC0054k();
            runnableC0054k2.f751e = new ArrayList();
            runnableC0054k2.f754h = new ArrayList();
            this.f1679W = runnableC0054k2;
            Field field = x.f3160a;
            Display display = getDisplay();
            if (!isInEditMode() && display != null) {
                f2 = display.getRefreshRate();
            }
            f2 = 60.0f;
            RunnableC0054k runnableC0054k3 = this.f1679W;
            runnableC0054k3.f753g = (long) (1.0E9f / f2);
            threadLocal.set(runnableC0054k3);
        }
        this.f1679W.f751e.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Object obj;
        super.onDetachedFromWindow();
        u uVar = this.f1665H;
        if (uVar != null) {
            uVar.a();
        }
        setScrollState(0);
        H h2 = this.V;
        h2.f668k.removeCallbacks(h2);
        h2.f664g.abortAnimation();
        this.f1701q = false;
        w wVar = this.f1697m;
        if (wVar != null) {
            wVar.f778e = false;
            wVar.z(this);
        }
        this.f1693j0.clear();
        removeCallbacks(this.f1695k0);
        this.f1691i.getClass();
        do {
            k0.C c2 = Q.f700a;
            Object[] objArr = c2.f2648b;
            int i2 = c2.f2647a;
            obj = null;
            if (i2 > 0) {
                int i3 = i2 - 1;
                Object obj2 = objArr[i3];
                h.c(obj2, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
                objArr[i3] = null;
                c2.f2647a--;
                obj = obj2;
            }
        } while (obj != null);
        RunnableC0054k runnableC0054k = this.f1679W;
        if (runnableC0054k != null) {
            runnableC0054k.f751e.remove(this);
            this.f1679W = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f1698n;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C0050g) arrayList.get(i2)).getClass();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f2;
        float f3;
        if (this.f1697m != null && !this.f1704u && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f2 = this.f1697m.c() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f1697m.b()) {
                    f3 = motionEvent.getAxisValue(10);
                    if (f2 == 0.0f || f3 != 0.0f) {
                        q((int) (f3 * this.f1676S), (int) (f2 * this.f1677T), motionEvent);
                    }
                }
                f3 = 0.0f;
                if (f2 == 0.0f) {
                }
                q((int) (f3 * this.f1676S), (int) (f2 * this.f1677T), motionEvent);
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f1697m.c()) {
                        f2 = -axisValue;
                        f3 = 0.0f;
                        if (f2 == 0.0f) {
                        }
                        q((int) (f3 * this.f1676S), (int) (f2 * this.f1677T), motionEvent);
                    } else if (this.f1697m.b()) {
                        f3 = axisValue;
                        f2 = 0.0f;
                        if (f2 == 0.0f) {
                        }
                        q((int) (f3 * this.f1676S), (int) (f2 * this.f1677T), motionEvent);
                    }
                }
                f2 = 0.0f;
                f3 = 0.0f;
                if (f2 == 0.0f) {
                }
                q((int) (f3 * this.f1676S), (int) (f2 * this.f1677T), motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (!this.f1704u) {
            int action = motionEvent.getAction();
            if (action == 3 || action == 0) {
                this.f1700p = null;
            }
            ArrayList arrayList = this.f1699o;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0050g c0050g = (C0050g) arrayList.get(i2);
                if (c0050g.c(motionEvent) && action != 3) {
                    this.f1700p = c0050g;
                    p();
                    setScrollState(0);
                    return true;
                }
            }
            w wVar = this.f1697m;
            if (wVar != null) {
                boolean b2 = wVar.b();
                boolean c2 = this.f1697m.c();
                if (this.f1668K == null) {
                    this.f1668K = VelocityTracker.obtain();
                }
                this.f1668K.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.f1705v) {
                        this.f1705v = false;
                    }
                    this.f1667J = motionEvent.getPointerId(0);
                    int x2 = (int) (motionEvent.getX() + 0.5f);
                    this.f1671N = x2;
                    this.f1669L = x2;
                    int y2 = (int) (motionEvent.getY() + 0.5f);
                    this.f1672O = y2;
                    this.f1670M = y2;
                    if (this.f1666I == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                    }
                    int[] iArr = this.i0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i3 = b2;
                    if (c2) {
                        i3 = (b2 ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i3, 0);
                } else if (actionMasked == 1) {
                    this.f1668K.clear();
                    s(0);
                } else if (actionMasked == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f1667J);
                    if (findPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f1667J + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.f1666I != 1) {
                        int i4 = x3 - this.f1669L;
                        int i5 = y3 - this.f1670M;
                        if (b2 == 0 || Math.abs(i4) <= this.f1673P) {
                            z2 = false;
                        } else {
                            this.f1671N = x3;
                            z2 = true;
                        }
                        if (c2 && Math.abs(i5) > this.f1673P) {
                            this.f1672O = y3;
                            z2 = true;
                        }
                        if (z2) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    p();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.f1667J = motionEvent.getPointerId(actionIndex);
                    int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.f1671N = x4;
                    this.f1669L = x4;
                    int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.f1672O = y4;
                    this.f1670M = y4;
                } else if (actionMasked == 6) {
                    n(motionEvent);
                }
                if (this.f1666I == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6 = c.f2984a;
        Trace.beginSection("RV OnLayout");
        Log.e("RecyclerView", "No adapter attached; skipping layout");
        Trace.endSection();
        this.f1703s = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        w wVar = this.f1697m;
        if (wVar == null) {
            e(i2, i3);
            return;
        }
        if (wVar.y()) {
            View.MeasureSpec.getMode(i2);
            View.MeasureSpec.getMode(i3);
            this.f1697m.f775b.e(i2, i3);
        } else {
            if (this.f1702r) {
                this.f1697m.f775b.e(i2, i3);
                return;
            }
            F f2 = this.b0;
            if (f2.f661e) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            f2.getClass();
            this.t++;
            this.f1697m.f775b.e(i2, i3);
            if (this.t < 1) {
                this.t = 1;
            }
            this.t--;
            f2.f659c = false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (this.f1659A > 0) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof E)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        E e2 = (E) parcelable;
        this.f1685f = e2;
        super.onRestoreInstanceState(e2.f209e);
        w wVar = this.f1697m;
        if (wVar == null || (parcelable2 = this.f1685f.f656g) == null) {
            return;
        }
        wVar.B(parcelable2);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        E e2 = new E(super.onSaveInstanceState());
        E e3 = this.f1685f;
        if (e3 != null) {
            e2.f656g = e3.f656g;
            return e2;
        }
        w wVar = this.f1697m;
        if (wVar != null) {
            e2.f656g = wVar.C();
            return e2;
        }
        e2.f656g = null;
        return e2;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 == i4 && i3 == i5) {
            return;
        }
        this.G = null;
        this.f1663E = null;
        this.f1664F = null;
        this.f1662D = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0241  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (!this.f1704u && !this.f1705v) {
            int action = motionEvent.getAction();
            C0050g c0050g = this.f1700p;
            if (c0050g != null) {
                if (action != 0) {
                    int i2 = c0050g.f719a;
                    if (c0050g.f735q != 0) {
                        if (motionEvent.getAction() == 0) {
                            boolean b2 = c0050g.b(motionEvent.getX(), motionEvent.getY());
                            boolean a2 = c0050g.a(motionEvent.getX(), motionEvent.getY());
                            if (b2 || a2) {
                                if (a2) {
                                    c0050g.f736r = 1;
                                    c0050g.f729k = (int) motionEvent.getX();
                                } else if (b2) {
                                    c0050g.f736r = 2;
                                    c0050g.f728j = (int) motionEvent.getY();
                                }
                                c0050g.e(2);
                            }
                        } else if (motionEvent.getAction() == 1 && c0050g.f735q == 2) {
                            c0050g.f728j = 0.0f;
                            c0050g.f729k = 0.0f;
                            c0050g.e(1);
                            c0050g.f736r = 0;
                        } else if (motionEvent.getAction() == 2 && c0050g.f735q == 2) {
                            c0050g.f();
                            if (c0050g.f736r == 1) {
                                float x2 = motionEvent.getX();
                                int[] iArr = c0050g.t;
                                iArr[0] = i2;
                                int i3 = c0050g.f730l - i2;
                                iArr[1] = i3;
                                float max = Math.max(i2, Math.min(i3, x2));
                                if (Math.abs(0 - max) >= 2.0f) {
                                    float f2 = c0050g.f729k;
                                    int computeHorizontalScrollRange = c0050g.f732n.computeHorizontalScrollRange();
                                    c0050g.f732n.computeHorizontalScrollOffset();
                                    int d2 = C0050g.d(f2, max, iArr, computeHorizontalScrollRange, 0, c0050g.f730l);
                                    if (d2 != 0) {
                                        c0050g.f732n.scrollBy(d2, 0);
                                    }
                                    c0050g.f729k = max;
                                }
                            }
                            if (c0050g.f736r == 2) {
                                float y2 = motionEvent.getY();
                                int[] iArr2 = c0050g.f737s;
                                iArr2[0] = i2;
                                int i4 = c0050g.f731m - i2;
                                iArr2[1] = i4;
                                float max2 = Math.max(i2, Math.min(i4, y2));
                                if (Math.abs(0 - max2) >= 2.0f) {
                                    float f3 = c0050g.f728j;
                                    int computeVerticalScrollRange = c0050g.f732n.computeVerticalScrollRange();
                                    c0050g.f732n.computeVerticalScrollOffset();
                                    int d3 = C0050g.d(f3, max2, iArr2, computeVerticalScrollRange, 0, c0050g.f731m);
                                    if (d3 != 0) {
                                        c0050g.f732n.scrollBy(0, d3);
                                    }
                                    c0050g.f728j = max2;
                                }
                            }
                        }
                    }
                    if (action == 3 || action == 1) {
                        this.f1700p = null;
                    }
                    p();
                    setScrollState(0);
                    return true;
                }
                this.f1700p = null;
            }
            if (action != 0) {
                ArrayList arrayList = this.f1699o;
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    C0050g c0050g2 = (C0050g) arrayList.get(i5);
                    if (c0050g2.c(motionEvent)) {
                        this.f1700p = c0050g2;
                        p();
                        setScrollState(0);
                        return true;
                    }
                }
            }
            w wVar = this.f1697m;
            if (wVar != null) {
                boolean b3 = wVar.b();
                boolean c2 = this.f1697m.c();
                if (this.f1668K == null) {
                    this.f1668K = VelocityTracker.obtain();
                }
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                int[] iArr3 = this.i0;
                if (actionMasked == 0) {
                    iArr3[1] = 0;
                    iArr3[0] = 0;
                }
                obtain.offsetLocation(iArr3[0], iArr3[1]);
                if (actionMasked == 0) {
                    this.f1667J = motionEvent.getPointerId(0);
                    int x3 = (int) (motionEvent.getX() + 0.5f);
                    this.f1671N = x3;
                    this.f1669L = x3;
                    int y3 = (int) (motionEvent.getY() + 0.5f);
                    this.f1672O = y3;
                    this.f1670M = y3;
                    int i6 = b3;
                    if (c2) {
                        i6 = (b3 ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i6, 0);
                } else {
                    if (actionMasked == 1) {
                        this.f1668K.addMovement(obtain);
                        VelocityTracker velocityTracker = this.f1668K;
                        int i7 = this.f1675R;
                        velocityTracker.computeCurrentVelocity(1000, i7);
                        float f4 = b3 != 0 ? -this.f1668K.getXVelocity(this.f1667J) : 0.0f;
                        float f5 = c2 ? -this.f1668K.getYVelocity(this.f1667J) : 0.0f;
                        if (f4 != 0.0f || f5 != 0.0f) {
                            int i8 = (int) f4;
                            int i9 = (int) f5;
                            w wVar2 = this.f1697m;
                            if (wVar2 == null) {
                                Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                            } else if (!this.f1704u) {
                                boolean b4 = wVar2.b();
                                boolean c3 = this.f1697m.c();
                                int i10 = this.f1674Q;
                                if (b4 == 0 || Math.abs(i8) < i10) {
                                    i8 = 0;
                                }
                                if (!c3 || Math.abs(i9) < i10) {
                                    i9 = 0;
                                }
                                if (i8 != 0 || i9 != 0) {
                                    float f6 = i8;
                                    float f7 = i9;
                                    if (!dispatchNestedPreFling(f6, f7)) {
                                        boolean z3 = b4 != 0 || c3;
                                        dispatchNestedFling(f6, f7, z3);
                                        int i11 = b4;
                                        if (z3) {
                                            if (c3) {
                                                i11 = (b4 ? 1 : 0) | 2;
                                            }
                                            getScrollingChildHelper().g(i11, 1);
                                            int i12 = -i7;
                                            int max3 = Math.max(i12, Math.min(i8, i7));
                                            int max4 = Math.max(i12, Math.min(i9, i7));
                                            H h2 = this.V;
                                            h2.f668k.setScrollState(2);
                                            h2.f663f = 0;
                                            h2.f662e = 0;
                                            h2.f664g.fling(0, 0, max3, max4, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                            h2.a();
                                            p();
                                            obtain.recycle();
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                        setScrollState(0);
                        p();
                        obtain.recycle();
                        return true;
                    }
                    if (actionMasked == 2) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f1667J);
                        if (findPointerIndex < 0) {
                            Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f1667J + " not found. Did any MotionEvents get skipped?");
                            return false;
                        }
                        int x4 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                        int y4 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                        int i13 = this.f1671N - x4;
                        int i14 = this.f1672O - y4;
                        boolean f8 = f(i13, i14, this.f1690h0, this.f1688g0, 0);
                        int[] iArr4 = this.f1688g0;
                        if (f8) {
                            int[] iArr5 = this.f1690h0;
                            i13 -= iArr5[0];
                            i14 -= iArr5[1];
                            obtain.offsetLocation(iArr4[0], iArr4[1]);
                            iArr3[0] = iArr3[0] + iArr4[0];
                            iArr3[1] = iArr3[1] + iArr4[1];
                        }
                        if (this.f1666I != 1) {
                            if (b3 != 0) {
                                int abs = Math.abs(i13);
                                int i15 = this.f1673P;
                                if (abs > i15) {
                                    i13 = i13 > 0 ? i13 - i15 : i13 + i15;
                                    z2 = true;
                                    if (c2) {
                                        int abs2 = Math.abs(i14);
                                        int i16 = this.f1673P;
                                        if (abs2 > i16) {
                                            i14 = i14 > 0 ? i14 - i16 : i14 + i16;
                                            z2 = true;
                                        }
                                    }
                                    if (z2) {
                                        setScrollState(1);
                                    }
                                }
                            }
                            z2 = false;
                            if (c2) {
                            }
                            if (z2) {
                            }
                        }
                        if (this.f1666I == 1) {
                            this.f1671N = x4 - iArr4[0];
                            this.f1672O = y4 - iArr4[1];
                            q(b3 != 0 ? i13 : 0, c2 ? i14 : 0, obtain);
                            RunnableC0054k runnableC0054k = this.f1679W;
                            if (runnableC0054k != null && (i13 != 0 || i14 != 0)) {
                                runnableC0054k.a(this, i13, i14);
                            }
                        }
                    } else if (actionMasked == 3) {
                        p();
                        setScrollState(0);
                    } else if (actionMasked == 5) {
                        this.f1667J = motionEvent.getPointerId(actionIndex);
                        int x5 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.f1671N = x5;
                        this.f1669L = x5;
                        int y5 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        this.f1672O = y5;
                        this.f1670M = y5;
                    } else if (actionMasked == 6) {
                        n(motionEvent);
                    }
                }
                this.f1668K.addMovement(obtain);
                obtain.recycle();
                return true;
            }
        }
        return false;
    }

    public final void p() {
        VelocityTracker velocityTracker = this.f1668K;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z2 = false;
        s(0);
        EdgeEffect edgeEffect = this.f1662D;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = this.f1662D.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f1663E;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 |= this.f1663E.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1664F;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 |= this.f1664F.isFinished();
        }
        EdgeEffect edgeEffect4 = this.G;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z2 |= this.G.isFinished();
        }
        if (z2) {
            Field field = x.f3160a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(int i2, int i3, MotionEvent motionEvent) {
        d();
        if (!this.f1698n.isEmpty()) {
            invalidate();
        }
        int[] iArr = this.f1688g0;
        boolean z2 = false;
        boolean z3 = true;
        if (g(iArr, 0)) {
            int i4 = this.f1671N;
            int i5 = iArr[0];
            this.f1671N = i4 - i5;
            int i6 = this.f1672O;
            int i7 = iArr[1];
            this.f1672O = i6 - i7;
            if (motionEvent != null) {
                motionEvent.offsetLocation(i5, i7);
            }
            int[] iArr2 = this.i0;
            iArr2[0] = iArr2[0] + iArr[0];
            iArr2[1] = iArr2[1] + iArr[1];
        } else if (getOverScrollMode() != 2) {
            if (motionEvent != null && (motionEvent.getSource() & 8194) != 8194) {
                float x2 = motionEvent.getX();
                float f2 = 0;
                float y2 = motionEvent.getY();
                if (f2 < 0.0f) {
                    if (this.f1662D == null) {
                        this.f1661C.getClass();
                        EdgeEffect edgeEffect = new EdgeEffect(getContext());
                        this.f1662D = edgeEffect;
                        if (this.f1692j) {
                            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                        } else {
                            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
                        }
                    }
                    d.a(this.f1662D, (-f2) / getWidth(), 1.0f - (y2 / getHeight()));
                } else {
                    if (f2 > 0.0f) {
                        if (this.f1664F == null) {
                            this.f1661C.getClass();
                            EdgeEffect edgeEffect2 = new EdgeEffect(getContext());
                            this.f1664F = edgeEffect2;
                            if (this.f1692j) {
                                edgeEffect2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                            } else {
                                edgeEffect2.setSize(getMeasuredHeight(), getMeasuredWidth());
                            }
                        }
                        d.a(this.f1664F, f2 / getWidth(), y2 / getHeight());
                    }
                    if (f2 >= 0.0f) {
                        if (this.f1663E == null) {
                            this.f1661C.getClass();
                            EdgeEffect edgeEffect3 = new EdgeEffect(getContext());
                            this.f1663E = edgeEffect3;
                            if (this.f1692j) {
                                edgeEffect3.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
                            } else {
                                edgeEffect3.setSize(getMeasuredWidth(), getMeasuredHeight());
                            }
                        }
                        d.a(this.f1663E, (-f2) / getHeight(), x2 / getWidth());
                    } else if (f2 > 0.0f) {
                        if (this.G == null) {
                            this.f1661C.getClass();
                            EdgeEffect edgeEffect4 = new EdgeEffect(getContext());
                            this.G = edgeEffect4;
                            if (this.f1692j) {
                                edgeEffect4.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
                            } else {
                                edgeEffect4.setSize(getMeasuredWidth(), getMeasuredHeight());
                            }
                        }
                        d.a(this.G, f2 / getHeight(), 1.0f - (x2 / getWidth()));
                    } else {
                        z3 = z2;
                    }
                    if (!z3 || f2 != 0.0f || f2 != 0.0f) {
                        Field field = x.f3160a;
                        postInvalidateOnAnimation();
                    }
                }
                z2 = true;
                if (f2 >= 0.0f) {
                }
                if (!z3) {
                }
                Field field2 = x.f3160a;
                postInvalidateOnAnimation();
            }
            c(i2, i3);
        }
        if (awakenScrollBars()) {
            return;
        }
        invalidate();
    }

    public final void r(int i2, int i3) {
        int i4;
        w wVar = this.f1697m;
        if (wVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f1704u) {
            return;
        }
        int i5 = !wVar.b() ? 0 : i2;
        int i6 = !this.f1697m.c() ? 0 : i3;
        if (i5 == 0 && i6 == 0) {
            return;
        }
        H h2 = this.V;
        RecyclerView recyclerView = h2.f668k;
        int abs = Math.abs(i5);
        int abs2 = Math.abs(i6);
        boolean z2 = abs > abs2;
        int sqrt = (int) Math.sqrt(0);
        int sqrt2 = (int) Math.sqrt((i6 * i6) + (i5 * i5));
        int width = z2 ? recyclerView.getWidth() : recyclerView.getHeight();
        int i7 = width / 2;
        float f2 = width;
        float f3 = i7;
        float sin = (((float) Math.sin((Math.min(1.0f, (sqrt2 * 1.0f) / f2) - 0.5f) * 0.47123894f)) * f3) + f3;
        if (sqrt > 0) {
            i4 = Math.round(Math.abs(sin / sqrt) * 1000.0f) * 4;
        } else {
            if (!z2) {
                abs = abs2;
            }
            i4 = (int) (((abs / f2) + 1.0f) * 300.0f);
        }
        int min = Math.min(i4, 2000);
        Interpolator interpolator = h2.f665h;
        InterpolatorC0060q interpolatorC0060q = f1658o0;
        if (interpolator != interpolatorC0060q) {
            h2.f665h = interpolatorC0060q;
            h2.f664g = new OverScroller(recyclerView.getContext(), interpolatorC0060q);
        }
        recyclerView.setScrollState(2);
        h2.f663f = 0;
        h2.f662e = 0;
        h2.f664g.startScroll(0, 0, i5, i6, min);
        h2.a();
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z2) {
        j(view);
        view.clearAnimation();
        j(view);
        super.removeDetachedView(view, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        this.f1697m.getClass();
        if (this.f1659A <= 0 && view2 != null) {
            o(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.f1697m.G(this, view, rect, z2, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        ArrayList arrayList = this.f1699o;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C0050g) arrayList.get(i2)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.t != 0 || this.f1704u) {
            return;
        }
        super.requestLayout();
    }

    public final void s(int i2) {
        getScrollingChildHelper().h(i2);
    }

    @Override // android.view.View
    public final void scrollBy(int i2, int i3) {
        w wVar = this.f1697m;
        if (wVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f1704u) {
            return;
        }
        boolean b2 = wVar.b();
        boolean c2 = this.f1697m.c();
        if (b2 || c2) {
            if (!b2) {
                i2 = 0;
            }
            if (!c2) {
                i3 = 0;
            }
            q(i2, i3, null);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i2, int i3) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (this.f1659A <= 0) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.f1706w |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(J j2) {
        this.f1684e0 = j2;
        x.a(this, j2);
    }

    public void setAdapter(N.r rVar) {
        setLayoutFrozen(false);
        u uVar = this.f1665H;
        if (uVar != null) {
            uVar.a();
        }
        w wVar = this.f1697m;
        C c2 = this.f1683e;
        if (wVar != null) {
            wVar.E();
            this.f1697m.F(c2);
        }
        c2.f650a.clear();
        ArrayList arrayList = c2.f651b;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            arrayList.get(size).getClass();
            throw new ClassCastException();
        }
        arrayList.clear();
        C0052i c0052i = c2.f655f.f1680a0;
        c0052i.getClass();
        c0052i.f743c = 0;
        C0008i c0008i = this.f1687g;
        c0008i.H((ArrayList) c0008i.f85g);
        c0008i.H((ArrayList) c0008i.f86h);
        ArrayList arrayList2 = c2.f650a;
        RecyclerView recyclerView = c2.f655f;
        ArrayList arrayList3 = c2.f651b;
        arrayList2.clear();
        int size2 = arrayList3.size() - 1;
        if (size2 >= 0) {
            arrayList3.get(size2).getClass();
            throw new ClassCastException();
        }
        arrayList3.clear();
        C0052i c0052i2 = recyclerView.f1680a0;
        c0052i2.getClass();
        c0052i2.f743c = 0;
        if (c2.f654e == null) {
            B b2 = new B();
            b2.f648a = new SparseArray();
            b2.f649b = 0;
            c2.f654e = b2;
        }
        B b3 = c2.f654e;
        if (b3.f649b == 0) {
            SparseArray sparseArray = b3.f648a;
            if (sparseArray.size() > 0) {
                ((A) sparseArray.valueAt(0)).getClass();
                throw null;
            }
        }
        this.b0.f658b = true;
        this.f1709z = this.f1709z;
        this.f1708y = true;
        int y2 = this.f1689h.y();
        for (int i2 = 0; i2 < y2; i2++) {
            j(this.f1689h.x(i2));
        }
        m();
        int size3 = arrayList3.size();
        for (int i3 = 0; i3 < size3; i3++) {
            if (arrayList3.get(i3) != null) {
                throw new ClassCastException();
            }
        }
        int size4 = arrayList3.size() - 1;
        if (size4 >= 0) {
            arrayList3.get(size4).getClass();
            throw new ClassCastException();
        }
        arrayList3.clear();
        C0052i c0052i3 = recyclerView.f1680a0;
        c0052i3.getClass();
        c0052i3.f743c = 0;
        requestLayout();
    }

    public void setChildDrawingOrderCallback(s sVar) {
        if (sVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z2) {
        if (z2 != this.f1692j) {
            this.G = null;
            this.f1663E = null;
            this.f1664F = null;
            this.f1662D = null;
        }
        this.f1692j = z2;
        super.setClipToPadding(z2);
        if (this.f1703s) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(t tVar) {
        tVar.getClass();
        this.f1661C = tVar;
        this.G = null;
        this.f1663E = null;
        this.f1664F = null;
        this.f1662D = null;
    }

    public void setHasFixedSize(boolean z2) {
        this.f1702r = z2;
    }

    public void setItemAnimator(u uVar) {
        u uVar2 = this.f1665H;
        if (uVar2 != null) {
            uVar2.a();
            this.f1665H.f768a = null;
        }
        this.f1665H = uVar;
        if (uVar != null) {
            uVar.f768a = this.f1682d0;
        }
    }

    public void setItemViewCacheSize(int i2) {
        C c2 = this.f1683e;
        c2.f652c = i2;
        c2.b();
    }

    public void setLayoutFrozen(boolean z2) {
        if (z2 != this.f1704u) {
            b("Do not setLayoutFrozen in layout or scroll");
            if (!z2) {
                this.f1704u = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f1704u = true;
            this.f1705v = true;
            setScrollState(0);
            H h2 = this.V;
            h2.f668k.removeCallbacks(h2);
            h2.f664g.abortAnimation();
        }
    }

    public void setLayoutManager(w wVar) {
        if (wVar == this.f1697m) {
            return;
        }
        setScrollState(0);
        H h2 = this.V;
        h2.f668k.removeCallbacks(h2);
        h2.f664g.abortAnimation();
        w wVar2 = this.f1697m;
        C c2 = this.f1683e;
        if (wVar2 != null) {
            u uVar = this.f1665H;
            if (uVar != null) {
                uVar.a();
            }
            this.f1697m.E();
            this.f1697m.F(c2);
            c2.f650a.clear();
            ArrayList arrayList = c2.f651b;
            int size = arrayList.size() - 1;
            if (size >= 0) {
                arrayList.get(size).getClass();
                throw new ClassCastException();
            }
            arrayList.clear();
            C0052i c0052i = c2.f655f.f1680a0;
            c0052i.getClass();
            c0052i.f743c = 0;
            if (this.f1701q) {
                w wVar3 = this.f1697m;
                wVar3.f778e = false;
                wVar3.z(this);
            }
            this.f1697m.I(null);
            this.f1697m = null;
        } else {
            c2.f650a.clear();
            ArrayList arrayList2 = c2.f651b;
            int size2 = arrayList2.size() - 1;
            if (size2 >= 0) {
                arrayList2.get(size2).getClass();
                throw new ClassCastException();
            }
            arrayList2.clear();
            C0052i c0052i2 = c2.f655f.f1680a0;
            c0052i2.getClass();
            c0052i2.f743c = 0;
        }
        C0008i c0008i = this.f1689h;
        B0.E e2 = (B0.E) c0008i.f84f;
        ((C0045b) c0008i.f85g).c();
        ArrayList arrayList3 = (ArrayList) c0008i.f86h;
        for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
            j((View) arrayList3.get(size3));
            arrayList3.remove(size3);
        }
        RecyclerView recyclerView = (RecyclerView) e2.f20f;
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            j(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f1697m = wVar;
        if (wVar != null) {
            if (wVar.f775b != null) {
                throw new IllegalArgumentException("LayoutManager " + wVar + " is already attached to a RecyclerView:" + wVar.f775b.h());
            }
            wVar.I(this);
            if (this.f1701q) {
                this.f1697m.f778e = true;
            }
        }
        c2.b();
        requestLayout();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        C0263g scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f3150d) {
            ViewGroup viewGroup = scrollingChildHelper.f3149c;
            Field field = x.f3160a;
            AbstractC0272p.z(viewGroup);
        }
        scrollingChildHelper.f3150d = z2;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.f1678U = z2;
    }

    public void setRecycledViewPool(B b2) {
        C c2 = this.f1683e;
        if (c2.f654e != null) {
            r1.f649b--;
        }
        c2.f654e = b2;
        if (b2 != null) {
            c2.f655f.getAdapter();
        }
    }

    public void setScrollState(int i2) {
        if (i2 == this.f1666I) {
            return;
        }
        this.f1666I = i2;
        if (i2 != 2) {
            H h2 = this.V;
            h2.f668k.removeCallbacks(h2);
            h2.f664g.abortAnimation();
        }
        w wVar = this.f1697m;
        if (wVar != null) {
            wVar.D(i2);
        }
        ArrayList arrayList = this.f1681c0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((z) this.f1681c0.get(size)).getClass();
            }
        }
    }

    public void setScrollingTouchSlop(int i2) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 != 0) {
            if (i2 == 1) {
                this.f1673P = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i2 + "; using default value");
        }
        this.f1673P = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(G g2) {
        this.f1683e.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().g(i2, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        w wVar = this.f1697m;
        if (wVar != null) {
            return wVar.n(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + h());
    }

    public void setOnFlingListener(N.y yVar) {
    }

    @Deprecated
    public void setOnScrollListener(z zVar) {
    }

    public void setRecyclerListener(D d2) {
    }
}
