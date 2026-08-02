package androidx.recyclerview.widget;

import A.A;
import A.AbstractC0018t;
import A.C0007h;
import A.z;
import B.m;
import B0.C0023a;
import B0.C0031i;
import F.b;
import F.d;
import O.a;
import P.B;
import P.C;
import P.C0092b;
import P.C0093c;
import P.C0097g;
import P.C0099i;
import P.D;
import P.E;
import P.F;
import P.G;
import P.I;
import P.InterpolatorC0106p;
import P.P;
import P.RunnableC0101k;
import P.q;
import P.r;
import P.s;
import P.t;
import P.v;
import P.w;
import P.x;
import P.y;
import Q0.h;
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

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* renamed from: l0, reason: collision with root package name */
    public static final int[] f1821l0 = {R.attr.nestedScrollingEnabled};

    /* renamed from: m0, reason: collision with root package name */
    public static final int[] f1822m0 = {R.attr.clipToPadding};

    /* renamed from: n0, reason: collision with root package name */
    public static final boolean f1823n0 = true;

    /* renamed from: o0, reason: collision with root package name */
    public static final Class[] f1824o0;

    /* renamed from: p0, reason: collision with root package name */
    public static final InterpolatorC0106p f1825p0;

    /* renamed from: A, reason: collision with root package name */
    public int f1826A;

    /* renamed from: B, reason: collision with root package name */
    public final int f1827B;

    /* renamed from: C, reason: collision with root package name */
    public s f1828C;

    /* renamed from: D, reason: collision with root package name */
    public EdgeEffect f1829D;

    /* renamed from: E, reason: collision with root package name */
    public EdgeEffect f1830E;

    /* renamed from: F, reason: collision with root package name */
    public EdgeEffect f1831F;

    /* renamed from: G, reason: collision with root package name */
    public EdgeEffect f1832G;

    /* renamed from: H, reason: collision with root package name */
    public t f1833H;

    /* renamed from: I, reason: collision with root package name */
    public int f1834I;
    public int J;

    /* renamed from: K, reason: collision with root package name */
    public VelocityTracker f1835K;

    /* renamed from: L, reason: collision with root package name */
    public int f1836L;

    /* renamed from: M, reason: collision with root package name */
    public int f1837M;

    /* renamed from: N, reason: collision with root package name */
    public int f1838N;

    /* renamed from: O, reason: collision with root package name */
    public int f1839O;

    /* renamed from: P, reason: collision with root package name */
    public int f1840P;

    /* renamed from: Q, reason: collision with root package name */
    public final int f1841Q;

    /* renamed from: R, reason: collision with root package name */
    public final int f1842R;

    /* renamed from: S, reason: collision with root package name */
    public final float f1843S;

    /* renamed from: T, reason: collision with root package name */
    public final float f1844T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f1845U;

    /* renamed from: V, reason: collision with root package name */
    public final G f1846V;

    /* renamed from: W, reason: collision with root package name */
    public RunnableC0101k f1847W;

    /* renamed from: a0, reason: collision with root package name */
    public final C0099i f1848a0;

    /* renamed from: b0, reason: collision with root package name */
    public final E f1849b0;

    /* renamed from: c0, reason: collision with root package name */
    public ArrayList f1850c0;

    /* renamed from: d0, reason: collision with root package name */
    public final C0023a f1851d0;

    /* renamed from: e, reason: collision with root package name */
    public final B f1852e;

    /* renamed from: e0, reason: collision with root package name */
    public I f1853e0;

    /* renamed from: f, reason: collision with root package name */
    public D f1854f;
    public C0007h f0;

    /* renamed from: g, reason: collision with root package name */
    public final C0031i f1855g;

    /* renamed from: g0, reason: collision with root package name */
    public final int[] f1856g0;

    /* renamed from: h, reason: collision with root package name */
    public final C0031i f1857h;

    /* renamed from: h0, reason: collision with root package name */
    public final int[] f1858h0;

    /* renamed from: i, reason: collision with root package name */
    public final C0023a f1859i;

    /* renamed from: i0, reason: collision with root package name */
    public final int[] f1860i0;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1861j;

    /* renamed from: j0, reason: collision with root package name */
    public final ArrayList f1862j0;

    /* renamed from: k, reason: collision with root package name */
    public final Rect f1863k;

    /* renamed from: k0, reason: collision with root package name */
    public final b f1864k0;

    /* renamed from: l, reason: collision with root package name */
    public final Rect f1865l;

    /* renamed from: m, reason: collision with root package name */
    public v f1866m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f1867n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f1868o;

    /* renamed from: p, reason: collision with root package name */
    public C0097g f1869p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1870q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1871r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1872s;

    /* renamed from: t, reason: collision with root package name */
    public int f1873t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1874u;
    public boolean v;

    /* renamed from: w, reason: collision with root package name */
    public int f1875w;

    /* renamed from: x, reason: collision with root package name */
    public final AccessibilityManager f1876x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f1877y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1878z;

    static {
        Class cls = Integer.TYPE;
        f1824o0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f1825p0 = new InterpolatorC0106p();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        float a2;
        TypedArray typedArray;
        int i2;
        char c2;
        Object[] objArr;
        Constructor constructor;
        int i3 = 2;
        this.f1852e = new B(this);
        this.f1859i = new C0023a();
        this.f1863k = new Rect();
        this.f1865l = new Rect();
        new RectF();
        this.f1867n = new ArrayList();
        this.f1868o = new ArrayList();
        this.f1873t = 0;
        this.f1877y = false;
        this.f1878z = false;
        this.f1826A = 0;
        this.f1827B = 0;
        this.f1828C = new s();
        C0093c c0093c = new C0093c();
        c0093c.f942a = null;
        c0093c.f943b = new ArrayList();
        c0093c.f944c = 250L;
        c0093c.f945d = 250L;
        c0093c.f880e = new ArrayList();
        c0093c.f881f = new ArrayList();
        c0093c.f882g = new ArrayList();
        c0093c.f883h = new ArrayList();
        c0093c.f884i = new ArrayList();
        c0093c.f885j = new ArrayList();
        c0093c.f886k = new ArrayList();
        c0093c.f887l = new ArrayList();
        c0093c.f888m = new ArrayList();
        c0093c.f889n = new ArrayList();
        c0093c.f890o = new ArrayList();
        this.f1833H = c0093c;
        this.f1834I = 0;
        this.J = -1;
        this.f1843S = Float.MIN_VALUE;
        this.f1844T = Float.MIN_VALUE;
        boolean z2 = true;
        this.f1845U = true;
        this.f1846V = new G(this);
        this.f1848a0 = f1823n0 ? new C0099i() : null;
        E e2 = new E();
        e2.f834a = 0;
        e2.f835b = false;
        e2.f836c = false;
        e2.f837d = false;
        e2.f838e = false;
        this.f1849b0 = e2;
        C0023a c0023a = new C0023a(20);
        this.f1851d0 = c0023a;
        this.f1856g0 = new int[2];
        this.f1858h0 = new int[2];
        this.f1860i0 = new int[2];
        this.f1862j0 = new ArrayList();
        this.f1864k0 = new b(i3, this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1822m0, 0, 0);
            this.f1861j = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.f1861j = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1840P = viewConfiguration.getScaledTouchSlop();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26) {
            Method method = A.D.f0a;
            a2 = A.a(viewConfiguration);
        } else {
            a2 = A.D.a(viewConfiguration, context);
        }
        this.f1843S = a2;
        this.f1844T = i4 >= 26 ? A.b(viewConfiguration) : A.D.a(viewConfiguration, context);
        this.f1841Q = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1842R = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f1833H.f942a = c0023a;
        this.f1855g = new C0031i(new C0023a(19, this));
        this.f1857h = new C0031i(new m(11, this));
        Field field = z.f58a;
        if ((i4 >= 26 ? AbstractC0018t.c(this) : 0) == 0 && i4 >= 26) {
            AbstractC0018t.m(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f1876x = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new I(this));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, a.f824a, 0, 0);
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
                c2 = 3;
                i2 = 4;
                typedArray = obtainStyledAttributes2;
                new C0097g(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.neptunesoft.languesbacdz.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.neptunesoft.languesbacdz.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.neptunesoft.languesbacdz.R.dimen.fastscroll_margin));
            } else {
                typedArray = obtainStyledAttributes2;
                i2 = 4;
                c2 = 3;
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
                        Class<? extends U> asSubclass = (isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).loadClass(trim).asSubclass(v.class);
                        try {
                            constructor = asSubclass.getConstructor(f1824o0);
                            Object[] objArr2 = new Object[i2];
                            objArr2[0] = context;
                            objArr2[1] = attributeSet;
                            objArr2[2] = 0;
                            objArr2[c2] = 0;
                            objArr = objArr2;
                        } catch (NoSuchMethodException e3) {
                            try {
                                objArr = null;
                                constructor = asSubclass.getConstructor(null);
                            } catch (NoSuchMethodException e4) {
                                e4.initCause(e3);
                                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + trim, e4);
                            }
                        }
                        constructor.setAccessible(true);
                        setLayoutManager((v) constructor.newInstance(objArr));
                    } catch (ClassCastException e5) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + trim, e5);
                    } catch (ClassNotFoundException e6) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + trim, e6);
                    } catch (IllegalAccessException e7) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + trim, e7);
                    } catch (InstantiationException e8) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e8);
                    } catch (InvocationTargetException e9) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e9);
                    }
                }
            }
            TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f1821l0, 0, 0);
            z2 = obtainStyledAttributes3.getBoolean(0, true);
            obtainStyledAttributes3.recycle();
        } else {
            setDescendantFocusability(262144);
        }
        setNestedScrollingEnabled(z2);
    }

    private C0007h getScrollingChildHelper() {
        if (this.f0 == null) {
            this.f0 = new C0007h(this);
        }
        return this.f0;
    }

    public static void j(View view) {
        if (view == null) {
            return;
        }
        ((w) view.getLayoutParams()).getClass();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i2, int i3) {
        v vVar = this.f1866m;
        if (vVar != null) {
            vVar.getClass();
        }
        super.addFocusables(arrayList, i2, i3);
    }

    public final void b(String str) {
        if (this.f1826A > 0) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + h());
        }
        if (this.f1827B > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + h()));
        }
    }

    public final void c(int i2, int i3) {
        boolean z2;
        EdgeEffect edgeEffect = this.f1829D;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            z2 = false;
        } else {
            this.f1829D.onRelease();
            z2 = this.f1829D.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f1831F;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.f1831F.onRelease();
            z2 |= this.f1831F.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1830E;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.f1830E.onRelease();
            z2 |= this.f1830E.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1832G;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.f1832G.onRelease();
            z2 |= this.f1832G.isFinished();
        }
        if (z2) {
            Field field = z.f58a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof w) && this.f1866m.d((w) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        v vVar = this.f1866m;
        if (vVar != null && vVar.b()) {
            return this.f1866m.f(this.f1849b0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        v vVar = this.f1866m;
        if (vVar != null && vVar.b()) {
            this.f1866m.g(this.f1849b0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        v vVar = this.f1866m;
        if (vVar != null && vVar.b()) {
            return this.f1866m.h(this.f1849b0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        v vVar = this.f1866m;
        if (vVar != null && vVar.c()) {
            return this.f1866m.i(this.f1849b0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        v vVar = this.f1866m;
        if (vVar != null && vVar.c()) {
            this.f1866m.j(this.f1849b0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        v vVar = this.f1866m;
        if (vVar != null && vVar.c()) {
            return this.f1866m.k(this.f1849b0);
        }
        return 0;
    }

    public final void d() {
        C0031i c0031i = this.f1855g;
        if (!this.f1872s || this.f1877y) {
            int i2 = w.b.f3549a;
            Trace.beginSection("RV FullInvalidate");
            Log.e("RecyclerView", "No adapter attached; skipping layout");
            Trace.endSection();
            return;
        }
        if (((ArrayList) c0031i.f155g).size() > 0) {
            c0031i.getClass();
            if (((ArrayList) c0031i.f155g).size() > 0) {
                int i3 = w.b.f3549a;
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
        ArrayList arrayList = this.f1867n;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0097g c0097g = (C0097g) arrayList.get(i2);
            if (c0097g.f907l != c0097g.f909n.getWidth() || c0097g.f908m != c0097g.f909n.getHeight()) {
                c0097g.f907l = c0097g.f909n.getWidth();
                c0097g.f908m = c0097g.f909n.getHeight();
                c0097g.e(0);
            } else if (c0097g.v != 0) {
                if (c0097g.f910o) {
                    int i3 = c0097g.f907l;
                    int i4 = c0097g.f899d;
                    int i5 = i3 - i4;
                    int i6 = 0 - (0 / 2);
                    StateListDrawable stateListDrawable = c0097g.f897b;
                    stateListDrawable.setBounds(0, 0, i4, 0);
                    int i7 = c0097g.f908m;
                    Drawable drawable = c0097g.f898c;
                    drawable.setBounds(0, 0, c0097g.f900e, i7);
                    RecyclerView recyclerView = c0097g.f909n;
                    Field field = z.f58a;
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
                if (c0097g.f911p) {
                    int i8 = c0097g.f908m;
                    int i9 = c0097g.f903h;
                    int i10 = i8 - i9;
                    StateListDrawable stateListDrawable2 = c0097g.f901f;
                    stateListDrawable2.setBounds(0, 0, 0, i9);
                    int i11 = c0097g.f907l;
                    Drawable drawable2 = c0097g.f902g;
                    drawable2.setBounds(0, 0, i11, c0097g.f904i);
                    canvas.translate(0.0f, i10);
                    drawable2.draw(canvas);
                    canvas.translate(0 - (0 / 2), 0.0f);
                    stateListDrawable2.draw(canvas);
                    canvas.translate(-r9, -i10);
                }
            }
        }
        EdgeEffect edgeEffect = this.f1829D;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f1861j ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f1829D;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f1830E;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f1861j) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f1830E;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f1831F;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f1861j ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f1831F;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f1832G;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f1861j) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f1832G;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(save4);
        }
        if ((z2 || this.f1833H == null || arrayList.size() <= 0 || !this.f1833H.b()) ? z2 : true) {
            Field field2 = z.f58a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    public final void e(int i2, int i3) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        Field field = z.f58a;
        setMeasuredDimension(v.e(i2, paddingRight, getMinimumWidth()), v.e(i3, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final boolean f(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return getScrollingChildHelper().c(i2, i3, iArr, iArr2, i4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i2) {
        int i3;
        this.f1866m.getClass();
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i2);
        if (findNextFocus != null && !findNextFocus.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i2);
            }
            o(findNextFocus, null);
            return view;
        }
        if (findNextFocus != null && findNextFocus != this && i(findNextFocus) != null) {
            if (view == null || i(view) == null) {
                return findNextFocus;
            }
            int width = view.getWidth();
            int height = view.getHeight();
            Rect rect = this.f1863k;
            char c2 = 0;
            rect.set(0, 0, width, height);
            int width2 = findNextFocus.getWidth();
            int height2 = findNextFocus.getHeight();
            Rect rect2 = this.f1865l;
            rect2.set(0, 0, width2, height2);
            offsetDescendantRectToMyCoords(view, rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect2);
            RecyclerView recyclerView = this.f1866m.f949b;
            Field field = z.f58a;
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
                                if (c2 > 0) {
                                    return findNextFocus;
                                }
                            } else if (i3 > 0) {
                                return findNextFocus;
                            }
                        } else if (c2 < 0) {
                            return findNextFocus;
                        }
                    } else if (i3 < 0) {
                        return findNextFocus;
                    }
                } else {
                    if (c2 > 0) {
                        return findNextFocus;
                    }
                    if (c2 == 0 && i3 * i4 >= 0) {
                        return findNextFocus;
                    }
                }
            } else {
                if (c2 < 0) {
                    return findNextFocus;
                }
                if (c2 == 0 && i3 * i4 <= 0) {
                    return findNextFocus;
                }
            }
        }
        return super.focusSearch(view, i2);
    }

    public final boolean g(int[] iArr, int i2) {
        return getScrollingChildHelper().d(0, 0, 0, 0, iArr, i2, null);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        v vVar = this.f1866m;
        if (vVar != null) {
            return vVar.l();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + h());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        v vVar = this.f1866m;
        if (vVar != null) {
            return vVar.m(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + h());
    }

    public q getAdapter() {
        return null;
    }

    @Override // android.view.View
    public int getBaseline() {
        v vVar = this.f1866m;
        if (vVar == null) {
            return super.getBaseline();
        }
        vVar.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i2, int i3) {
        return super.getChildDrawingOrder(i2, i3);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f1861j;
    }

    public I getCompatAccessibilityDelegate() {
        return this.f1853e0;
    }

    public s getEdgeEffectFactory() {
        return this.f1828C;
    }

    public t getItemAnimator() {
        return this.f1833H;
    }

    public int getItemDecorationCount() {
        return this.f1867n.size();
    }

    public v getLayoutManager() {
        return this.f1866m;
    }

    public int getMaxFlingVelocity() {
        return this.f1842R;
    }

    public int getMinFlingVelocity() {
        return this.f1841Q;
    }

    public long getNanoTime() {
        if (f1823n0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public x getOnFlingListener() {
        return null;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f1845U;
    }

    public P.A getRecycledViewPool() {
        B b2 = this.f1852e;
        if (((P.A) b2.f831e) == null) {
            P.A a2 = new P.A();
            a2.f825a = new SparseArray();
            a2.f826b = 0;
            b2.f831e = a2;
        }
        return (P.A) b2.f831e;
    }

    public int getScrollState() {
        return this.f1834I;
    }

    public final String h() {
        return " " + super.toString() + ", adapter:null, layout:" + this.f1866m + ", context:" + getContext();
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
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
        return this.f1870q;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f45d;
    }

    public final boolean k() {
        return getScrollingChildHelper().f(1);
    }

    public final boolean l() {
        return !this.f1872s || this.f1877y || ((ArrayList) this.f1855g.f155g).size() > 0;
    }

    public final void m() {
        int D2 = this.f1857h.D();
        for (int i2 = 0; i2 < D2; i2++) {
            ((w) this.f1857h.C(i2).getLayoutParams()).f956b = true;
        }
        ArrayList arrayList = (ArrayList) this.f1852e.f830d;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    public final void n(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.J) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.J = motionEvent.getPointerId(i2);
            int x2 = (int) (motionEvent.getX(i2) + 0.5f);
            this.f1838N = x2;
            this.f1836L = x2;
            int y2 = (int) (motionEvent.getY(i2) + 0.5f);
            this.f1839O = y2;
            this.f1837M = y2;
        }
    }

    public final void o(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f1863k;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof w) {
            w wVar = (w) layoutParams;
            if (!wVar.f956b) {
                int i2 = rect.left;
                Rect rect2 = wVar.f955a;
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
        this.f1866m.G(this, view, this.f1863k, !this.f1872s, view2 == null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        if (r1 >= 30.0f) goto L21;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAttachedToWindow() {
        float f2;
        super.onAttachedToWindow();
        boolean z2 = false;
        this.f1826A = 0;
        this.f1870q = true;
        if (this.f1872s && !isLayoutRequested()) {
            z2 = true;
        }
        this.f1872s = z2;
        v vVar = this.f1866m;
        if (vVar != null) {
            vVar.f952e = true;
        }
        if (f1823n0) {
            ThreadLocal threadLocal = RunnableC0101k.f926i;
            RunnableC0101k runnableC0101k = (RunnableC0101k) threadLocal.get();
            this.f1847W = runnableC0101k;
            if (runnableC0101k == null) {
                RunnableC0101k runnableC0101k2 = new RunnableC0101k();
                runnableC0101k2.f928e = new ArrayList();
                runnableC0101k2.f931h = new ArrayList();
                this.f1847W = runnableC0101k2;
                Field field = z.f58a;
                Display display = getDisplay();
                if (!isInEditMode() && display != null) {
                    f2 = display.getRefreshRate();
                }
                f2 = 60.0f;
                RunnableC0101k runnableC0101k3 = this.f1847W;
                runnableC0101k3.f930g = (long) (1.0E9f / f2);
                threadLocal.set(runnableC0101k3);
            }
            this.f1847W.f928e.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Object obj;
        RunnableC0101k runnableC0101k;
        super.onDetachedFromWindow();
        t tVar = this.f1833H;
        if (tVar != null) {
            tVar.a();
        }
        setScrollState(0);
        G g2 = this.f1846V;
        g2.f845k.removeCallbacks(g2);
        g2.f841g.abortAnimation();
        this.f1870q = false;
        v vVar = this.f1866m;
        if (vVar != null) {
            vVar.f952e = false;
            vVar.z(this);
        }
        this.f1862j0.clear();
        removeCallbacks(this.f1864k0);
        this.f1859i.getClass();
        do {
            m0.D d2 = P.f877a;
            int i2 = d2.f3126a;
            obj = null;
            if (i2 > 0) {
                int i3 = i2 - 1;
                Object[] objArr = d2.f3127b;
                Object obj2 = objArr[i3];
                h.c(obj2, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
                objArr[i3] = null;
                d2.f3126a--;
                obj = obj2;
            }
        } while (obj != null);
        if (!f1823n0 || (runnableC0101k = this.f1847W) == null) {
            return;
        }
        runnableC0101k.f928e.remove(this);
        this.f1847W = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f1867n;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C0097g) arrayList.get(i2)).getClass();
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
        if (this.f1866m != null && !this.f1874u && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f2 = this.f1866m.c() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f1866m.b()) {
                    f3 = motionEvent.getAxisValue(10);
                    if (f2 == 0.0f || f3 != 0.0f) {
                        q((int) (f3 * this.f1843S), (int) (f2 * this.f1844T), motionEvent);
                    }
                }
                f3 = 0.0f;
                if (f2 == 0.0f) {
                }
                q((int) (f3 * this.f1843S), (int) (f2 * this.f1844T), motionEvent);
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f1866m.c()) {
                        f2 = -axisValue;
                        f3 = 0.0f;
                        if (f2 == 0.0f) {
                        }
                        q((int) (f3 * this.f1843S), (int) (f2 * this.f1844T), motionEvent);
                    } else if (this.f1866m.b()) {
                        f3 = axisValue;
                        f2 = 0.0f;
                        if (f2 == 0.0f) {
                        }
                        q((int) (f3 * this.f1843S), (int) (f2 * this.f1844T), motionEvent);
                    }
                }
                f2 = 0.0f;
                f3 = 0.0f;
                if (f2 == 0.0f) {
                }
                q((int) (f3 * this.f1843S), (int) (f2 * this.f1844T), motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (this.f1874u) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            this.f1869p = null;
        }
        ArrayList arrayList = this.f1868o;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0097g c0097g = (C0097g) arrayList.get(i2);
            if (c0097g.c(motionEvent) && action != 3) {
                this.f1869p = c0097g;
                p();
                setScrollState(0);
                return true;
            }
        }
        v vVar = this.f1866m;
        if (vVar == null) {
            return false;
        }
        boolean b2 = vVar.b();
        boolean c2 = this.f1866m.c();
        if (this.f1835K == null) {
            this.f1835K = VelocityTracker.obtain();
        }
        this.f1835K.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.v) {
                this.v = false;
            }
            this.J = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.f1838N = x2;
            this.f1836L = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.f1839O = y2;
            this.f1837M = y2;
            if (this.f1834I == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
            }
            int[] iArr = this.f1860i0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i3 = b2;
            if (c2) {
                i3 = (b2 ? 1 : 0) | 2;
            }
            getScrollingChildHelper().g(i3, 0);
        } else if (actionMasked == 1) {
            this.f1835K.clear();
            s(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.J);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.J + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f1834I != 1) {
                int i4 = x3 - this.f1836L;
                int i5 = y3 - this.f1837M;
                if (b2 == 0 || Math.abs(i4) <= this.f1840P) {
                    z2 = false;
                } else {
                    this.f1838N = x3;
                    z2 = true;
                }
                if (c2 && Math.abs(i5) > this.f1840P) {
                    this.f1839O = y3;
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
            this.J = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f1838N = x4;
            this.f1836L = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f1839O = y4;
            this.f1837M = y4;
        } else if (actionMasked == 6) {
            n(motionEvent);
        }
        return this.f1834I == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6 = w.b.f3549a;
        Trace.beginSection("RV OnLayout");
        Log.e("RecyclerView", "No adapter attached; skipping layout");
        Trace.endSection();
        this.f1872s = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        v vVar = this.f1866m;
        if (vVar == null) {
            e(i2, i3);
            return;
        }
        if (vVar.y()) {
            View.MeasureSpec.getMode(i2);
            View.MeasureSpec.getMode(i3);
            this.f1866m.f949b.e(i2, i3);
        } else {
            if (this.f1871r) {
                this.f1866m.f949b.e(i2, i3);
                return;
            }
            E e2 = this.f1849b0;
            if (e2.f838e) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            e2.getClass();
            this.f1873t++;
            this.f1866m.f949b.e(i2, i3);
            if (this.f1873t < 1) {
                this.f1873t = 1;
            }
            this.f1873t--;
            e2.f836c = false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (this.f1826A > 0) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof D)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        D d2 = (D) parcelable;
        this.f1854f = d2;
        super.onRestoreInstanceState(d2.f495a);
        v vVar = this.f1866m;
        if (vVar == null || (parcelable2 = this.f1854f.f833c) == null) {
            return;
        }
        vVar.B(parcelable2);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        D d2 = new D(super.onSaveInstanceState());
        D d3 = this.f1854f;
        if (d3 != null) {
            d2.f833c = d3.f833c;
        } else {
            v vVar = this.f1866m;
            if (vVar != null) {
                d2.f833c = vVar.C();
            } else {
                d2.f833c = null;
            }
        }
        return d2;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 == i4 && i3 == i5) {
            return;
        }
        this.f1832G = null;
        this.f1830E = null;
        this.f1831F = null;
        this.f1829D = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x024c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (this.f1874u || this.v) {
            return false;
        }
        int action = motionEvent.getAction();
        C0097g c0097g = this.f1869p;
        if (c0097g != null) {
            if (action != 0) {
                if (c0097g.f912q != 0) {
                    if (motionEvent.getAction() == 0) {
                        boolean b2 = c0097g.b(motionEvent.getX(), motionEvent.getY());
                        boolean a2 = c0097g.a(motionEvent.getX(), motionEvent.getY());
                        if (b2 || a2) {
                            if (a2) {
                                c0097g.f913r = 1;
                                c0097g.f906k = (int) motionEvent.getX();
                            } else if (b2) {
                                c0097g.f913r = 2;
                                c0097g.f905j = (int) motionEvent.getY();
                            }
                            c0097g.e(2);
                        }
                    } else if (motionEvent.getAction() == 1 && c0097g.f912q == 2) {
                        c0097g.f905j = 0.0f;
                        c0097g.f906k = 0.0f;
                        c0097g.e(1);
                        c0097g.f913r = 0;
                    } else if (motionEvent.getAction() == 2 && c0097g.f912q == 2) {
                        c0097g.f();
                        int i2 = c0097g.f913r;
                        int i3 = c0097g.f896a;
                        if (i2 == 1) {
                            float x2 = motionEvent.getX();
                            int[] iArr = c0097g.f915t;
                            iArr[0] = i3;
                            int i4 = c0097g.f907l - i3;
                            iArr[1] = i4;
                            float max = Math.max(i3, Math.min(i4, x2));
                            if (Math.abs(0 - max) >= 2.0f) {
                                float f2 = c0097g.f906k;
                                int computeHorizontalScrollRange = c0097g.f909n.computeHorizontalScrollRange();
                                c0097g.f909n.computeHorizontalScrollOffset();
                                int d2 = C0097g.d(f2, max, iArr, computeHorizontalScrollRange, 0, c0097g.f907l);
                                if (d2 != 0) {
                                    c0097g.f909n.scrollBy(d2, 0);
                                }
                                c0097g.f906k = max;
                            }
                        }
                        if (c0097g.f913r == 2) {
                            float y2 = motionEvent.getY();
                            int[] iArr2 = c0097g.f914s;
                            iArr2[0] = i3;
                            int i5 = c0097g.f908m - i3;
                            iArr2[1] = i5;
                            float max2 = Math.max(i3, Math.min(i5, y2));
                            if (Math.abs(0 - max2) >= 2.0f) {
                                float f3 = c0097g.f905j;
                                int computeVerticalScrollRange = c0097g.f909n.computeVerticalScrollRange();
                                c0097g.f909n.computeVerticalScrollOffset();
                                int d3 = C0097g.d(f3, max2, iArr2, computeVerticalScrollRange, 0, c0097g.f908m);
                                if (d3 != 0) {
                                    c0097g.f909n.scrollBy(0, d3);
                                }
                                c0097g.f905j = max2;
                            }
                        }
                    }
                }
                if (action == 3 || action == 1) {
                    this.f1869p = null;
                }
                p();
                setScrollState(0);
                return true;
            }
            this.f1869p = null;
        }
        if (action != 0) {
            ArrayList arrayList = this.f1868o;
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                C0097g c0097g2 = (C0097g) arrayList.get(i6);
                if (c0097g2.c(motionEvent)) {
                    this.f1869p = c0097g2;
                    p();
                    setScrollState(0);
                    return true;
                }
            }
        }
        v vVar = this.f1866m;
        if (vVar == null) {
            return false;
        }
        boolean b3 = vVar.b();
        boolean c2 = this.f1866m.c();
        if (this.f1835K == null) {
            this.f1835K = VelocityTracker.obtain();
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        int[] iArr3 = this.f1860i0;
        if (actionMasked == 0) {
            iArr3[1] = 0;
            iArr3[0] = 0;
        }
        obtain.offsetLocation(iArr3[0], iArr3[1]);
        if (actionMasked == 0) {
            this.J = motionEvent.getPointerId(0);
            int x3 = (int) (motionEvent.getX() + 0.5f);
            this.f1838N = x3;
            this.f1836L = x3;
            int y3 = (int) (motionEvent.getY() + 0.5f);
            this.f1839O = y3;
            this.f1837M = y3;
            int i7 = b3;
            if (c2) {
                i7 = (b3 ? 1 : 0) | 2;
            }
            getScrollingChildHelper().g(i7, 0);
        } else {
            if (actionMasked == 1) {
                this.f1835K.addMovement(obtain);
                VelocityTracker velocityTracker = this.f1835K;
                int i8 = this.f1842R;
                velocityTracker.computeCurrentVelocity(1000, i8);
                float f4 = b3 != 0 ? -this.f1835K.getXVelocity(this.J) : 0.0f;
                float f5 = c2 ? -this.f1835K.getYVelocity(this.J) : 0.0f;
                if (f4 != 0.0f || f5 != 0.0f) {
                    int i9 = (int) f4;
                    int i10 = (int) f5;
                    v vVar2 = this.f1866m;
                    if (vVar2 == null) {
                        Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                    } else if (!this.f1874u) {
                        boolean b4 = vVar2.b();
                        boolean c3 = this.f1866m.c();
                        int i11 = this.f1841Q;
                        if (b4 == 0 || Math.abs(i9) < i11) {
                            i9 = 0;
                        }
                        if (!c3 || Math.abs(i10) < i11) {
                            i10 = 0;
                        }
                        if (i9 != 0 || i10 != 0) {
                            float f6 = i9;
                            float f7 = i10;
                            if (!dispatchNestedPreFling(f6, f7)) {
                                boolean z3 = b4 != 0 || c3;
                                dispatchNestedFling(f6, f7, z3);
                                int i12 = b4;
                                if (z3) {
                                    if (c3) {
                                        i12 = (b4 ? 1 : 0) | 2;
                                    }
                                    getScrollingChildHelper().g(i12, 1);
                                    int i13 = -i8;
                                    int max3 = Math.max(i13, Math.min(i9, i8));
                                    int max4 = Math.max(i13, Math.min(i10, i8));
                                    G g2 = this.f1846V;
                                    g2.f845k.setScrollState(2);
                                    g2.f840f = 0;
                                    g2.f839e = 0;
                                    g2.f841g.fling(0, 0, max3, max4, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                    g2.a();
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
                int findPointerIndex = motionEvent.findPointerIndex(this.J);
                if (findPointerIndex < 0) {
                    Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.J + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                int x4 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                int y4 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                int i14 = this.f1838N - x4;
                int i15 = this.f1839O - y4;
                boolean f8 = f(i14, i15, this.f1858h0, this.f1856g0, 0);
                int[] iArr4 = this.f1856g0;
                if (f8) {
                    int[] iArr5 = this.f1858h0;
                    i14 -= iArr5[0];
                    i15 -= iArr5[1];
                    obtain.offsetLocation(iArr4[0], iArr4[1]);
                    iArr3[0] = iArr3[0] + iArr4[0];
                    iArr3[1] = iArr3[1] + iArr4[1];
                }
                if (this.f1834I != 1) {
                    if (b3 != 0) {
                        int abs = Math.abs(i14);
                        int i16 = this.f1840P;
                        if (abs > i16) {
                            i14 = i14 > 0 ? i14 - i16 : i14 + i16;
                            z2 = true;
                            if (c2) {
                                int abs2 = Math.abs(i15);
                                int i17 = this.f1840P;
                                if (abs2 > i17) {
                                    i15 = i15 > 0 ? i15 - i17 : i15 + i17;
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
                int i18 = i15;
                if (this.f1834I == 1) {
                    this.f1838N = x4 - iArr4[0];
                    this.f1839O = y4 - iArr4[1];
                    q(b3 != 0 ? i14 : 0, c2 ? i18 : 0, obtain);
                    RunnableC0101k runnableC0101k = this.f1847W;
                    if (runnableC0101k != null && (i14 != 0 || i18 != 0)) {
                        runnableC0101k.a(this, i14, i18);
                    }
                }
            } else if (actionMasked == 3) {
                p();
                setScrollState(0);
            } else if (actionMasked == 5) {
                this.J = motionEvent.getPointerId(actionIndex);
                int x5 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.f1838N = x5;
                this.f1836L = x5;
                int y5 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.f1839O = y5;
                this.f1837M = y5;
            } else if (actionMasked == 6) {
                n(motionEvent);
            }
        }
        this.f1835K.addMovement(obtain);
        obtain.recycle();
        return true;
    }

    public final void p() {
        VelocityTracker velocityTracker = this.f1835K;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z2 = false;
        s(0);
        EdgeEffect edgeEffect = this.f1829D;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = this.f1829D.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f1830E;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 |= this.f1830E.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1831F;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 |= this.f1831F.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1832G;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z2 |= this.f1832G.isFinished();
        }
        if (z2) {
            Field field = z.f58a;
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
        if (!this.f1867n.isEmpty()) {
            invalidate();
        }
        int[] iArr = this.f1856g0;
        boolean z2 = false;
        boolean z3 = true;
        if (g(iArr, 0)) {
            int i4 = this.f1838N;
            int i5 = iArr[0];
            this.f1838N = i4 - i5;
            int i6 = this.f1839O;
            int i7 = iArr[1];
            this.f1839O = i6 - i7;
            if (motionEvent != null) {
                motionEvent.offsetLocation(i5, i7);
            }
            int[] iArr2 = this.f1860i0;
            iArr2[0] = iArr2[0] + iArr[0];
            iArr2[1] = iArr2[1] + iArr[1];
        } else if (getOverScrollMode() != 2) {
            if (motionEvent != null && (motionEvent.getSource() & 8194) != 8194) {
                float x2 = motionEvent.getX();
                float f2 = 0;
                float y2 = motionEvent.getY();
                if (f2 < 0.0f) {
                    if (this.f1829D == null) {
                        this.f1828C.getClass();
                        EdgeEffect edgeEffect = new EdgeEffect(getContext());
                        this.f1829D = edgeEffect;
                        if (this.f1861j) {
                            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                        } else {
                            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
                        }
                    }
                    d.a(this.f1829D, (-f2) / getWidth(), 1.0f - (y2 / getHeight()));
                } else {
                    if (f2 > 0.0f) {
                        if (this.f1831F == null) {
                            this.f1828C.getClass();
                            EdgeEffect edgeEffect2 = new EdgeEffect(getContext());
                            this.f1831F = edgeEffect2;
                            if (this.f1861j) {
                                edgeEffect2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                            } else {
                                edgeEffect2.setSize(getMeasuredHeight(), getMeasuredWidth());
                            }
                        }
                        d.a(this.f1831F, f2 / getWidth(), y2 / getHeight());
                    }
                    if (f2 >= 0.0f) {
                        if (this.f1830E == null) {
                            this.f1828C.getClass();
                            EdgeEffect edgeEffect3 = new EdgeEffect(getContext());
                            this.f1830E = edgeEffect3;
                            if (this.f1861j) {
                                edgeEffect3.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
                            } else {
                                edgeEffect3.setSize(getMeasuredWidth(), getMeasuredHeight());
                            }
                        }
                        d.a(this.f1830E, (-f2) / getHeight(), x2 / getWidth());
                    } else if (f2 > 0.0f) {
                        if (this.f1832G == null) {
                            this.f1828C.getClass();
                            EdgeEffect edgeEffect4 = new EdgeEffect(getContext());
                            this.f1832G = edgeEffect4;
                            if (this.f1861j) {
                                edgeEffect4.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
                            } else {
                                edgeEffect4.setSize(getMeasuredWidth(), getMeasuredHeight());
                            }
                        }
                        d.a(this.f1832G, f2 / getHeight(), 1.0f - (x2 / getWidth()));
                    } else {
                        z3 = z2;
                    }
                    if (!z3 || f2 != 0.0f || f2 != 0.0f) {
                        Field field = z.f58a;
                        postInvalidateOnAnimation();
                    }
                }
                z2 = true;
                if (f2 >= 0.0f) {
                }
                if (!z3) {
                }
                Field field2 = z.f58a;
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
        v vVar = this.f1866m;
        if (vVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f1874u) {
            return;
        }
        int i5 = !vVar.b() ? 0 : i2;
        int i6 = !this.f1866m.c() ? 0 : i3;
        if (i5 == 0 && i6 == 0) {
            return;
        }
        G g2 = this.f1846V;
        g2.getClass();
        int abs = Math.abs(i5);
        int abs2 = Math.abs(i6);
        boolean z2 = abs > abs2;
        int sqrt = (int) Math.sqrt(0);
        int sqrt2 = (int) Math.sqrt((i6 * i6) + (i5 * i5));
        RecyclerView recyclerView = g2.f845k;
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
        Interpolator interpolator = g2.f842h;
        InterpolatorC0106p interpolatorC0106p = f1825p0;
        if (interpolator != interpolatorC0106p) {
            g2.f842h = interpolatorC0106p;
            g2.f841g = new OverScroller(recyclerView.getContext(), interpolatorC0106p);
        }
        recyclerView.setScrollState(2);
        g2.f840f = 0;
        g2.f839e = 0;
        g2.f841g.startScroll(0, 0, i5, i6, min);
        if (Build.VERSION.SDK_INT < 23) {
            g2.f841g.computeScrollOffset();
        }
        g2.a();
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
        this.f1866m.getClass();
        if (this.f1826A <= 0 && view2 != null) {
            o(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.f1866m.G(this, view, rect, z2, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        ArrayList arrayList = this.f1868o;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C0097g) arrayList.get(i2)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f1873t != 0 || this.f1874u) {
            return;
        }
        super.requestLayout();
    }

    public final void s(int i2) {
        getScrollingChildHelper().h(i2);
    }

    @Override // android.view.View
    public final void scrollBy(int i2, int i3) {
        v vVar = this.f1866m;
        if (vVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f1874u) {
            return;
        }
        boolean b2 = vVar.b();
        boolean c2 = this.f1866m.c();
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
        if (this.f1826A <= 0) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.f1875w |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(I i2) {
        this.f1853e0 = i2;
        z.a(this, i2);
    }

    public void setAdapter(q qVar) {
        setLayoutFrozen(false);
        t tVar = this.f1833H;
        if (tVar != null) {
            tVar.a();
        }
        v vVar = this.f1866m;
        B b2 = this.f1852e;
        if (vVar != null) {
            vVar.E();
            this.f1866m.F(b2);
        }
        ((ArrayList) b2.f829c).clear();
        b2.c();
        C0031i c0031i = this.f1855g;
        c0031i.O((ArrayList) c0031i.f155g);
        c0031i.O((ArrayList) c0031i.f156h);
        ((ArrayList) b2.f829c).clear();
        b2.c();
        if (((P.A) b2.f831e) == null) {
            P.A a2 = new P.A();
            a2.f825a = new SparseArray();
            a2.f826b = 0;
            b2.f831e = a2;
        }
        P.A a3 = (P.A) b2.f831e;
        if (a3.f826b == 0) {
            SparseArray sparseArray = a3.f825a;
            if (sparseArray.size() > 0) {
                ((P.z) sparseArray.valueAt(0)).getClass();
                throw null;
            }
        }
        this.f1849b0.f835b = true;
        this.f1878z = this.f1878z;
        this.f1877y = true;
        int D2 = this.f1857h.D();
        for (int i2 = 0; i2 < D2; i2++) {
            j(this.f1857h.C(i2));
        }
        m();
        ArrayList arrayList = (ArrayList) b2.f830d;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (arrayList.get(i3) != null) {
                throw new ClassCastException();
            }
        }
        ((RecyclerView) b2.f832f).getClass();
        b2.c();
        requestLayout();
    }

    public void setChildDrawingOrderCallback(r rVar) {
        if (rVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z2) {
        if (z2 != this.f1861j) {
            this.f1832G = null;
            this.f1830E = null;
            this.f1831F = null;
            this.f1829D = null;
        }
        this.f1861j = z2;
        super.setClipToPadding(z2);
        if (this.f1872s) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(s sVar) {
        sVar.getClass();
        this.f1828C = sVar;
        this.f1832G = null;
        this.f1830E = null;
        this.f1831F = null;
        this.f1829D = null;
    }

    public void setHasFixedSize(boolean z2) {
        this.f1871r = z2;
    }

    public void setItemAnimator(t tVar) {
        t tVar2 = this.f1833H;
        if (tVar2 != null) {
            tVar2.a();
            this.f1833H.f942a = null;
        }
        this.f1833H = tVar;
        if (tVar != null) {
            tVar.f942a = this.f1851d0;
        }
    }

    public void setItemViewCacheSize(int i2) {
        B b2 = this.f1852e;
        b2.f827a = i2;
        b2.e();
    }

    public void setLayoutFrozen(boolean z2) {
        if (z2 != this.f1874u) {
            b("Do not setLayoutFrozen in layout or scroll");
            if (!z2) {
                this.f1874u = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f1874u = true;
            this.v = true;
            setScrollState(0);
            G g2 = this.f1846V;
            g2.f845k.removeCallbacks(g2);
            g2.f841g.abortAnimation();
        }
    }

    public void setLayoutManager(v vVar) {
        m mVar;
        if (vVar == this.f1866m) {
            return;
        }
        setScrollState(0);
        G g2 = this.f1846V;
        g2.f845k.removeCallbacks(g2);
        g2.f841g.abortAnimation();
        v vVar2 = this.f1866m;
        B b2 = this.f1852e;
        if (vVar2 != null) {
            t tVar = this.f1833H;
            if (tVar != null) {
                tVar.a();
            }
            this.f1866m.E();
            this.f1866m.F(b2);
            ((ArrayList) b2.f829c).clear();
            b2.c();
            if (this.f1870q) {
                v vVar3 = this.f1866m;
                vVar3.f952e = false;
                vVar3.z(this);
            }
            this.f1866m.I(null);
            this.f1866m = null;
        } else {
            ((ArrayList) b2.f829c).clear();
            b2.c();
        }
        C0031i c0031i = this.f1857h;
        ((C0092b) c0031i.f155g).c();
        ArrayList arrayList = (ArrayList) c0031i.f156h;
        int size = arrayList.size() - 1;
        while (true) {
            mVar = (m) c0031i.f154f;
            if (size < 0) {
                break;
            }
            j((View) arrayList.get(size));
            arrayList.remove(size);
            size--;
        }
        RecyclerView recyclerView = (RecyclerView) mVar.f78f;
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            j(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f1866m = vVar;
        if (vVar != null) {
            if (vVar.f949b != null) {
                throw new IllegalArgumentException("LayoutManager " + vVar + " is already attached to a RecyclerView:" + vVar.f949b.h());
            }
            vVar.I(this);
            if (this.f1870q) {
                this.f1866m.f952e = true;
            }
        }
        b2.e();
        requestLayout();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        C0007h scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f45d) {
            Field field = z.f58a;
            A.r.z(scrollingChildHelper.f44c);
        }
        scrollingChildHelper.f45d = z2;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.f1845U = z2;
    }

    public void setRecycledViewPool(P.A a2) {
        B b2 = this.f1852e;
        if (((P.A) b2.f831e) != null) {
            r1.f826b--;
        }
        b2.f831e = a2;
        if (a2 != null) {
            ((RecyclerView) b2.f832f).getAdapter();
        }
    }

    public void setScrollState(int i2) {
        if (i2 == this.f1834I) {
            return;
        }
        this.f1834I = i2;
        if (i2 != 2) {
            G g2 = this.f1846V;
            g2.f845k.removeCallbacks(g2);
            g2.f841g.abortAnimation();
        }
        v vVar = this.f1866m;
        if (vVar != null) {
            vVar.D(i2);
        }
        ArrayList arrayList = this.f1850c0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((y) this.f1850c0.get(size)).getClass();
            }
        }
    }

    public void setScrollingTouchSlop(int i2) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 != 0) {
            if (i2 == 1) {
                this.f1840P = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i2 + "; using default value");
        }
        this.f1840P = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(F f2) {
        this.f1852e.getClass();
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
        v vVar = this.f1866m;
        if (vVar != null) {
            return vVar.n(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + h());
    }

    public void setOnFlingListener(x xVar) {
    }

    @Deprecated
    public void setOnScrollListener(y yVar) {
    }

    public void setRecyclerListener(C c2) {
    }
}
