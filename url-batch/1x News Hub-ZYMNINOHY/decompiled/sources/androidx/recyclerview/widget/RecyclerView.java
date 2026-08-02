package androidx.recyclerview.widget;

import A.d;
import A0.f;
import B.b;
import C0.e;
import E.AbstractC0005f;
import E.AbstractC0018t;
import E.AbstractC0020v;
import E.B;
import E.C0006g;
import H.c;
import K0.j;
import T.a;
import U.A;
import U.C;
import U.C0066b;
import U.C0067c;
import U.C0071g;
import U.C0073i;
import U.D;
import U.E;
import U.F;
import U.H;
import U.O;
import U.RunnableC0075k;
import U.p;
import U.q;
import U.r;
import U.s;
import U.t;
import U.u;
import U.v;
import U.w;
import U.x;
import U.y;
import U.z;
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
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import n0.C1125E;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* renamed from: h0, reason: collision with root package name */
    public static final int[] f2443h0 = {R.attr.nestedScrollingEnabled};

    /* renamed from: i0, reason: collision with root package name */
    public static final int[] f2444i0 = {R.attr.clipToPadding};

    /* renamed from: j0, reason: collision with root package name */
    public static final Class[] f2445j0;

    /* renamed from: k0, reason: collision with root package name */
    public static final p f2446k0;

    /* renamed from: A, reason: collision with root package name */
    public EdgeEffect f2447A;

    /* renamed from: B, reason: collision with root package name */
    public EdgeEffect f2448B;

    /* renamed from: C, reason: collision with root package name */
    public EdgeEffect f2449C;

    /* renamed from: D, reason: collision with root package name */
    public t f2450D;

    /* renamed from: E, reason: collision with root package name */
    public int f2451E;

    /* renamed from: F, reason: collision with root package name */
    public int f2452F;

    /* renamed from: G, reason: collision with root package name */
    public VelocityTracker f2453G;

    /* renamed from: H, reason: collision with root package name */
    public int f2454H;

    /* renamed from: I, reason: collision with root package name */
    public int f2455I;

    /* renamed from: J, reason: collision with root package name */
    public int f2456J;

    /* renamed from: K, reason: collision with root package name */
    public int f2457K;
    public int L;

    /* renamed from: M, reason: collision with root package name */
    public final int f2458M;

    /* renamed from: N, reason: collision with root package name */
    public final int f2459N;

    /* renamed from: O, reason: collision with root package name */
    public final float f2460O;

    /* renamed from: P, reason: collision with root package name */
    public final float f2461P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f2462Q;

    /* renamed from: R, reason: collision with root package name */
    public final F f2463R;

    /* renamed from: S, reason: collision with root package name */
    public RunnableC0075k f2464S;

    /* renamed from: T, reason: collision with root package name */
    public final C0073i f2465T;

    /* renamed from: U, reason: collision with root package name */
    public final D f2466U;

    /* renamed from: V, reason: collision with root package name */
    public ArrayList f2467V;

    /* renamed from: W, reason: collision with root package name */
    public final j f2468W;

    /* renamed from: a, reason: collision with root package name */
    public final A f2469a;

    /* renamed from: a0, reason: collision with root package name */
    public H f2470a0;

    /* renamed from: b, reason: collision with root package name */
    public C f2471b;

    /* renamed from: b0, reason: collision with root package name */
    public C0006g f2472b0;

    /* renamed from: c, reason: collision with root package name */
    public final f f2473c;

    /* renamed from: c0, reason: collision with root package name */
    public final int[] f2474c0;

    /* renamed from: d, reason: collision with root package name */
    public final f f2475d;

    /* renamed from: d0, reason: collision with root package name */
    public final int[] f2476d0;

    /* renamed from: e, reason: collision with root package name */
    public final j f2477e;

    /* renamed from: e0, reason: collision with root package name */
    public final int[] f2478e0;
    public boolean f;

    /* renamed from: f0, reason: collision with root package name */
    public final ArrayList f2479f0;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f2480g;

    /* renamed from: g0, reason: collision with root package name */
    public final b f2481g0;

    /* renamed from: h, reason: collision with root package name */
    public final Rect f2482h;

    /* renamed from: i, reason: collision with root package name */
    public u f2483i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f2484j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f2485k;

    /* renamed from: l, reason: collision with root package name */
    public C0071g f2486l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2487m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2488n;
    public boolean o;

    /* renamed from: p, reason: collision with root package name */
    public int f2489p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2490q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2491r;

    /* renamed from: s, reason: collision with root package name */
    public int f2492s;

    /* renamed from: t, reason: collision with root package name */
    public final AccessibilityManager f2493t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2494u;
    public boolean v;

    /* renamed from: w, reason: collision with root package name */
    public int f2495w;

    /* renamed from: x, reason: collision with root package name */
    public final int f2496x;

    /* renamed from: y, reason: collision with root package name */
    public s f2497y;
    public EdgeEffect z;

    static {
        Class cls = Integer.TYPE;
        f2445j0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f2446k0 = new p();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        float a3;
        int i3;
        char c3;
        Constructor constructor;
        Object[] objArr;
        int i4 = 26;
        this.f2469a = new A(this);
        this.f2477e = new j();
        this.f2480g = new Rect();
        this.f2482h = new Rect();
        new RectF();
        this.f2484j = new ArrayList();
        this.f2485k = new ArrayList();
        this.f2489p = 0;
        this.f2494u = false;
        this.v = false;
        this.f2495w = 0;
        this.f2496x = 0;
        this.f2497y = new s();
        C0067c c0067c = new C0067c();
        c0067c.f1447a = null;
        c0067c.f1448b = new ArrayList();
        c0067c.f1449c = 250L;
        c0067c.f1450d = 250L;
        c0067c.f1391e = new ArrayList();
        c0067c.f = new ArrayList();
        c0067c.f1392g = new ArrayList();
        c0067c.f1393h = new ArrayList();
        c0067c.f1394i = new ArrayList();
        c0067c.f1395j = new ArrayList();
        c0067c.f1396k = new ArrayList();
        c0067c.f1397l = new ArrayList();
        c0067c.f1398m = new ArrayList();
        c0067c.f1399n = new ArrayList();
        c0067c.o = new ArrayList();
        this.f2450D = c0067c;
        this.f2451E = 0;
        this.f2452F = -1;
        this.f2460O = Float.MIN_VALUE;
        this.f2461P = Float.MIN_VALUE;
        boolean z = true;
        this.f2462Q = true;
        this.f2463R = new F(this);
        this.f2465T = new C0073i();
        D d3 = new D();
        d3.f1352a = 0;
        d3.f1353b = false;
        d3.f1354c = false;
        d3.f1355d = false;
        d3.f1356e = false;
        this.f2466U = d3;
        j jVar = new j(27);
        this.f2468W = jVar;
        this.f2474c0 = new int[2];
        this.f2476d0 = new int[2];
        this.f2478e0 = new int[2];
        this.f2479f0 = new ArrayList();
        this.f2481g0 = new b(8, this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2444i0, 0, 0);
            this.f = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.f = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.L = viewConfiguration.getScaledTouchSlop();
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 26) {
            Method method = B.f245a;
            a3 = AbstractC0005f.c(viewConfiguration);
        } else {
            a3 = B.a(viewConfiguration, context);
        }
        this.f2460O = a3;
        this.f2461P = i5 >= 26 ? AbstractC0005f.d(viewConfiguration) : B.a(viewConfiguration, context);
        this.f2458M = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2459N = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f2450D.f1447a = jVar;
        this.f2473c = new f(new j(i4, this));
        this.f2475d = new f(new e(23, this));
        Field field = E.A.f243a;
        if ((i5 >= 26 ? AbstractC0020v.a(this) : 0) == 0 && i5 >= 26) {
            AbstractC0020v.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f2493t = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new H(this));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, a.f1341a, 0, 0);
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
                i3 = 4;
                c3 = 3;
                new C0071g(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.fc.barca.football.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.fc.barca.football.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.fc.barca.football.R.dimen.fastscroll_margin));
            } else {
                i3 = 4;
                c3 = 3;
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
                        Class<? extends U> asSubclass = (isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).loadClass(str).asSubclass(u.class);
                        try {
                            constructor = asSubclass.getConstructor(f2445j0);
                            Object[] objArr2 = new Object[i3];
                            objArr2[0] = context;
                            objArr2[1] = attributeSet;
                            objArr2[2] = 0;
                            objArr2[c3] = 0;
                            objArr = objArr2;
                        } catch (NoSuchMethodException e3) {
                            try {
                                constructor = asSubclass.getConstructor(new Class[0]);
                                objArr = null;
                            } catch (NoSuchMethodException e4) {
                                e4.initCause(e3);
                                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e4);
                            }
                        }
                        constructor.setAccessible(true);
                        setLayoutManager((u) constructor.newInstance(objArr));
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
            TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f2443h0, 0, 0);
            z = obtainStyledAttributes3.getBoolean(0, true);
            obtainStyledAttributes3.recycle();
        } else {
            setDescendantFocusability(262144);
        }
        setNestedScrollingEnabled(z);
    }

    private C0006g getScrollingChildHelper() {
        if (this.f2472b0 == null) {
            this.f2472b0 = new C0006g(this);
        }
        return this.f2472b0;
    }

    public static void j(View view) {
        if (view == null) {
            return;
        }
        ((v) view.getLayoutParams()).getClass();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i3, int i4) {
        u uVar = this.f2483i;
        if (uVar != null) {
            uVar.getClass();
        }
        super.addFocusables(arrayList, i3, i4);
    }

    public final void b(String str) {
        if (this.f2495w > 0) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + h());
        }
        if (this.f2496x > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + h()));
        }
    }

    public final void c(int i3, int i4) {
        boolean z;
        EdgeEffect edgeEffect = this.z;
        if (edgeEffect == null || edgeEffect.isFinished() || i3 <= 0) {
            z = false;
        } else {
            this.z.onRelease();
            z = this.z.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f2448B;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i3 < 0) {
            this.f2448B.onRelease();
            z |= this.f2448B.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f2447A;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i4 > 0) {
            this.f2447A.onRelease();
            z |= this.f2447A.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f2449C;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i4 < 0) {
            this.f2449C.onRelease();
            z |= this.f2449C.isFinished();
        }
        if (z) {
            Field field = E.A.f243a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof v) && this.f2483i.d((v) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        u uVar = this.f2483i;
        if (uVar != null && uVar.b()) {
            return this.f2483i.f(this.f2466U);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        u uVar = this.f2483i;
        if (uVar != null && uVar.b()) {
            this.f2483i.g(this.f2466U);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        u uVar = this.f2483i;
        if (uVar != null && uVar.b()) {
            return this.f2483i.h(this.f2466U);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        u uVar = this.f2483i;
        if (uVar != null && uVar.c()) {
            return this.f2483i.i(this.f2466U);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        u uVar = this.f2483i;
        if (uVar != null && uVar.c()) {
            this.f2483i.j(this.f2466U);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        u uVar = this.f2483i;
        if (uVar != null && uVar.c()) {
            return this.f2483i.k(this.f2466U);
        }
        return 0;
    }

    public final void d() {
        f fVar = this.f2473c;
        if (!this.o || this.f2494u) {
            int i3 = d.f2a;
            Trace.beginSection("RV FullInvalidate");
            Log.e("RecyclerView", "No adapter attached; skipping layout");
            Trace.endSection();
            return;
        }
        if (((ArrayList) fVar.f24c).size() > 0) {
            fVar.getClass();
            if (((ArrayList) fVar.f24c).size() > 0) {
                int i4 = d.f2a;
                Trace.beginSection("RV FullInvalidate");
                Log.e("RecyclerView", "No adapter attached; skipping layout");
                Trace.endSection();
            }
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f3, boolean z) {
        return getScrollingChildHelper().a(f, f3, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f3) {
        return getScrollingChildHelper().b(f, f3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i3, int i4, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i3, i4, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i3, int i4, int i5, int i6, int[] iArr) {
        return getScrollingChildHelper().d(i3, i4, i5, i6, iArr, 0, null);
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
        ArrayList arrayList = this.f2484j;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            C0071g c0071g = (C0071g) arrayList.get(i3);
            if (c0071g.f1415l != c0071g.f1417n.getWidth() || c0071g.f1416m != c0071g.f1417n.getHeight()) {
                c0071g.f1415l = c0071g.f1417n.getWidth();
                c0071g.f1416m = c0071g.f1417n.getHeight();
                c0071g.e(0);
            } else if (c0071g.v != 0) {
                if (c0071g.o) {
                    int i4 = c0071g.f1415l;
                    int i5 = c0071g.f1408d;
                    int i6 = i4 - i5;
                    int i7 = 0 - (0 / 2);
                    StateListDrawable stateListDrawable = c0071g.f1406b;
                    stateListDrawable.setBounds(0, 0, i5, 0);
                    int i8 = c0071g.f1416m;
                    Drawable drawable = c0071g.f1407c;
                    drawable.setBounds(0, 0, c0071g.f1409e, i8);
                    RecyclerView recyclerView = c0071g.f1417n;
                    Field field = E.A.f243a;
                    if (recyclerView.getLayoutDirection() == 1) {
                        drawable.draw(canvas);
                        canvas.translate(i5, i7);
                        canvas.scale(-1.0f, 1.0f);
                        stateListDrawable.draw(canvas);
                        canvas.scale(1.0f, 1.0f);
                        canvas.translate(-i5, -i7);
                    } else {
                        canvas.translate(i6, 0.0f);
                        drawable.draw(canvas);
                        canvas.translate(0.0f, i7);
                        stateListDrawable.draw(canvas);
                        canvas.translate(-i6, -i7);
                    }
                }
                if (c0071g.f1418p) {
                    int i9 = c0071g.f1416m;
                    int i10 = c0071g.f1411h;
                    int i11 = i9 - i10;
                    StateListDrawable stateListDrawable2 = c0071g.f;
                    stateListDrawable2.setBounds(0, 0, 0, i10);
                    int i12 = c0071g.f1415l;
                    Drawable drawable2 = c0071g.f1410g;
                    drawable2.setBounds(0, 0, i12, c0071g.f1412i);
                    canvas.translate(0.0f, i11);
                    drawable2.draw(canvas);
                    canvas.translate(0 - (0 / 2), 0.0f);
                    stateListDrawable2.draw(canvas);
                    canvas.translate(-r9, -i11);
                }
            }
        }
        EdgeEffect edgeEffect = this.z;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.z;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f2447A;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f2447A;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f2448B;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f2448B;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f2449C;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f2449C;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(save4);
        }
        if ((z || this.f2450D == null || arrayList.size() <= 0 || !this.f2450D.b()) ? z : true) {
            Field field2 = E.A.f243a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        return super.drawChild(canvas, view, j3);
    }

    public final void e(int i3, int i4) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        Field field = E.A.f243a;
        setMeasuredDimension(u.e(i3, paddingRight, getMinimumWidth()), u.e(i4, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final boolean f(int i3, int i4, int i5, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i3, i4, i5, iArr, iArr2);
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
    public final View focusSearch(View view, int i3) {
        int i4;
        this.f2483i.getClass();
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i3);
        if (findNextFocus != null && !findNextFocus.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i3);
            }
            o(findNextFocus, null);
            return view;
        }
        if (findNextFocus != null && findNextFocus != this && i(findNextFocus) != null) {
            if (view != null && i(view) != null) {
                int width = view.getWidth();
                int height = view.getHeight();
                Rect rect = this.f2480g;
                char c3 = 0;
                rect.set(0, 0, width, height);
                int width2 = findNextFocus.getWidth();
                int height2 = findNextFocus.getHeight();
                Rect rect2 = this.f2482h;
                rect2.set(0, 0, width2, height2);
                offsetDescendantRectToMyCoords(view, rect);
                offsetDescendantRectToMyCoords(findNextFocus, rect2);
                RecyclerView recyclerView = this.f2483i.f1452b;
                Field field = E.A.f243a;
                int i5 = recyclerView.getLayoutDirection() == 1 ? -1 : 1;
                int i6 = rect.left;
                int i7 = rect2.left;
                if ((i6 < i7 || rect.right <= i7) && rect.right < rect2.right) {
                    i4 = 1;
                } else {
                    int i8 = rect.right;
                    int i9 = rect2.right;
                    i4 = ((i8 > i9 || i6 >= i9) && i6 > i7) ? -1 : 0;
                }
                int i10 = rect.top;
                int i11 = rect2.top;
                if ((i10 < i11 || rect.bottom <= i11) && rect.bottom < rect2.bottom) {
                    c3 = 1;
                } else {
                    int i12 = rect.bottom;
                    int i13 = rect2.bottom;
                    if ((i12 > i13 || i10 >= i13) && i10 > i11) {
                        c3 = 65535;
                    }
                }
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 17) {
                            if (i3 != 33) {
                                if (i3 != 66) {
                                    if (i3 != 130) {
                                        throw new IllegalArgumentException("Invalid direction: " + i3 + h());
                                    }
                                }
                            }
                        }
                    } else if (c3 <= 0) {
                        if (c3 == 0) {
                        }
                    }
                } else if (c3 >= 0) {
                    if (c3 == 0) {
                    }
                }
            }
            return findNextFocus;
        }
        return super.focusSearch(view, i3);
    }

    public final boolean g(int[] iArr, int i3) {
        return getScrollingChildHelper().d(0, 0, 0, 0, iArr, i3, null);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        u uVar = this.f2483i;
        if (uVar != null) {
            return uVar.l();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + h());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        u uVar = this.f2483i;
        if (uVar != null) {
            return uVar.m(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + h());
    }

    public q getAdapter() {
        return null;
    }

    @Override // android.view.View
    public int getBaseline() {
        u uVar = this.f2483i;
        if (uVar == null) {
            return super.getBaseline();
        }
        uVar.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i3, int i4) {
        return super.getChildDrawingOrder(i3, i4);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f;
    }

    public H getCompatAccessibilityDelegate() {
        return this.f2470a0;
    }

    public s getEdgeEffectFactory() {
        return this.f2497y;
    }

    public t getItemAnimator() {
        return this.f2450D;
    }

    public int getItemDecorationCount() {
        return this.f2484j.size();
    }

    public u getLayoutManager() {
        return this.f2483i;
    }

    public int getMaxFlingVelocity() {
        return this.f2459N;
    }

    public int getMinFlingVelocity() {
        return this.f2458M;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public w getOnFlingListener() {
        return null;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f2462Q;
    }

    public z getRecycledViewPool() {
        A a3 = this.f2469a;
        if (((z) a3.f1350e) == null) {
            z zVar = new z();
            zVar.f1459a = new SparseArray();
            zVar.f1460b = 0;
            a3.f1350e = zVar;
        }
        return (z) a3.f1350e;
    }

    public int getScrollState() {
        return this.f2451E;
    }

    public final String h() {
        return " " + super.toString() + ", adapter:null, layout:" + this.f2483i + ", context:" + getContext();
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
        return this.f2487m;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f288d;
    }

    public final boolean k() {
        return getScrollingChildHelper().f(1);
    }

    public final boolean l() {
        return !this.o || this.f2494u || ((ArrayList) this.f2473c.f24c).size() > 0;
    }

    public final void m() {
        int F3 = this.f2475d.F();
        for (int i3 = 0; i3 < F3; i3++) {
            ((v) this.f2475d.E(i3).getLayoutParams()).f1458b = true;
        }
        ArrayList arrayList = (ArrayList) this.f2469a.f1349d;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    public final void n(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2452F) {
            int i3 = actionIndex == 0 ? 1 : 0;
            this.f2452F = motionEvent.getPointerId(i3);
            int x3 = (int) (motionEvent.getX(i3) + 0.5f);
            this.f2456J = x3;
            this.f2454H = x3;
            int y3 = (int) (motionEvent.getY(i3) + 0.5f);
            this.f2457K = y3;
            this.f2455I = y3;
        }
    }

    public final void o(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f2480g;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof v) {
            v vVar = (v) layoutParams;
            if (!vVar.f1458b) {
                int i3 = rect.left;
                Rect rect2 = vVar.f1457a;
                rect.left = i3 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f2483i.G(this, view, this.f2480g, !this.o, view2 == null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r1 >= 30.0f) goto L19;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAttachedToWindow() {
        float f;
        super.onAttachedToWindow();
        boolean z = false;
        this.f2495w = 0;
        this.f2487m = true;
        if (this.o && !isLayoutRequested()) {
            z = true;
        }
        this.o = z;
        u uVar = this.f2483i;
        if (uVar != null) {
            uVar.f1455e = true;
        }
        ThreadLocal threadLocal = RunnableC0075k.f1433e;
        RunnableC0075k runnableC0075k = (RunnableC0075k) threadLocal.get();
        this.f2464S = runnableC0075k;
        if (runnableC0075k == null) {
            RunnableC0075k runnableC0075k2 = new RunnableC0075k();
            runnableC0075k2.f1434a = new ArrayList();
            runnableC0075k2.f1437d = new ArrayList();
            this.f2464S = runnableC0075k2;
            Field field = E.A.f243a;
            Display display = getDisplay();
            if (!isInEditMode() && display != null) {
                f = display.getRefreshRate();
            }
            f = 60.0f;
            RunnableC0075k runnableC0075k3 = this.f2464S;
            runnableC0075k3.f1436c = (long) (1.0E9f / f);
            threadLocal.set(runnableC0075k3);
        }
        this.f2464S.f1434a.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Object obj;
        super.onDetachedFromWindow();
        t tVar = this.f2450D;
        if (tVar != null) {
            tVar.a();
        }
        setScrollState(0);
        F f = this.f2463R;
        f.f1362g.removeCallbacks(f);
        f.f1359c.abortAnimation();
        this.f2487m = false;
        u uVar = this.f2483i;
        if (uVar != null) {
            uVar.f1455e = false;
            uVar.z(this);
        }
        this.f2479f0.clear();
        removeCallbacks(this.f2481g0);
        this.f2477e.getClass();
        do {
            C1125E c1125e = O.f1388a;
            int i3 = c1125e.f9994a;
            obj = null;
            if (i3 > 0) {
                int i4 = i3 - 1;
                Object[] objArr = (Object[]) c1125e.f9995b;
                Object obj2 = objArr[i4];
                kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
                objArr[i4] = null;
                c1125e.f9994a--;
                obj = obj2;
            }
        } while (obj != null);
        RunnableC0075k runnableC0075k = this.f2464S;
        if (runnableC0075k != null) {
            runnableC0075k.f1434a.remove(this);
            this.f2464S = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f2484j;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((C0071g) arrayList.get(i3)).getClass();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float f3;
        if (this.f2483i != null && !this.f2490q && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f = this.f2483i.c() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f2483i.b()) {
                    f3 = motionEvent.getAxisValue(10);
                    if (f == 0.0f || f3 != 0.0f) {
                        q((int) (f3 * this.f2460O), (int) (f * this.f2461P), motionEvent);
                    }
                }
                f3 = 0.0f;
                if (f == 0.0f) {
                }
                q((int) (f3 * this.f2460O), (int) (f * this.f2461P), motionEvent);
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f2483i.c()) {
                        f = -axisValue;
                        f3 = 0.0f;
                        if (f == 0.0f) {
                        }
                        q((int) (f3 * this.f2460O), (int) (f * this.f2461P), motionEvent);
                    } else if (this.f2483i.b()) {
                        f3 = axisValue;
                        f = 0.0f;
                        if (f == 0.0f) {
                        }
                        q((int) (f3 * this.f2460O), (int) (f * this.f2461P), motionEvent);
                    }
                }
                f = 0.0f;
                f3 = 0.0f;
                if (f == 0.0f) {
                }
                q((int) (f3 * this.f2460O), (int) (f * this.f2461P), motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (!this.f2490q) {
            int action = motionEvent.getAction();
            if (action == 3 || action == 0) {
                this.f2486l = null;
            }
            ArrayList arrayList = this.f2485k;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0071g c0071g = (C0071g) arrayList.get(i3);
                if (c0071g.c(motionEvent) && action != 3) {
                    this.f2486l = c0071g;
                    p();
                    setScrollState(0);
                    return true;
                }
            }
            u uVar = this.f2483i;
            if (uVar != null) {
                boolean b3 = uVar.b();
                boolean c3 = this.f2483i.c();
                if (this.f2453G == null) {
                    this.f2453G = VelocityTracker.obtain();
                }
                this.f2453G.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.f2491r) {
                        this.f2491r = false;
                    }
                    this.f2452F = motionEvent.getPointerId(0);
                    int x3 = (int) (motionEvent.getX() + 0.5f);
                    this.f2456J = x3;
                    this.f2454H = x3;
                    int y3 = (int) (motionEvent.getY() + 0.5f);
                    this.f2457K = y3;
                    this.f2455I = y3;
                    if (this.f2451E == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                    }
                    int[] iArr = this.f2478e0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i4 = b3;
                    if (c3) {
                        i4 = (b3 ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i4, 0);
                } else if (actionMasked == 1) {
                    this.f2453G.clear();
                    s(0);
                } else if (actionMasked == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f2452F);
                    if (findPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f2452F + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x4 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y4 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.f2451E != 1) {
                        int i5 = x4 - this.f2454H;
                        int i6 = y4 - this.f2455I;
                        if (b3 == 0 || Math.abs(i5) <= this.L) {
                            z = false;
                        } else {
                            this.f2456J = x4;
                            z = true;
                        }
                        if (c3 && Math.abs(i6) > this.L) {
                            this.f2457K = y4;
                            z = true;
                        }
                        if (z) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    p();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.f2452F = motionEvent.getPointerId(actionIndex);
                    int x5 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.f2456J = x5;
                    this.f2454H = x5;
                    int y5 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.f2457K = y5;
                    this.f2455I = y5;
                } else if (actionMasked == 6) {
                    n(motionEvent);
                }
                if (this.f2451E == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i3, int i4, int i5, int i6) {
        int i7 = d.f2a;
        Trace.beginSection("RV OnLayout");
        Log.e("RecyclerView", "No adapter attached; skipping layout");
        Trace.endSection();
        this.o = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        u uVar = this.f2483i;
        if (uVar == null) {
            e(i3, i4);
            return;
        }
        if (uVar.y()) {
            View.MeasureSpec.getMode(i3);
            View.MeasureSpec.getMode(i4);
            this.f2483i.f1452b.e(i3, i4);
        } else {
            if (this.f2488n) {
                this.f2483i.f1452b.e(i3, i4);
                return;
            }
            D d3 = this.f2466U;
            if (d3.f1356e) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            d3.getClass();
            this.f2489p++;
            this.f2483i.f1452b.e(i3, i4);
            if (this.f2489p < 1) {
                this.f2489p = 1;
            }
            this.f2489p--;
            d3.f1354c = false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i3, Rect rect) {
        if (this.f2495w > 0) {
            return false;
        }
        return super.onRequestFocusInDescendants(i3, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C c3 = (C) parcelable;
        this.f2471b = c3;
        super.onRestoreInstanceState(c3.f624a);
        u uVar = this.f2483i;
        if (uVar == null || (parcelable2 = this.f2471b.f1351c) == null) {
            return;
        }
        uVar.B(parcelable2);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C c3 = new C(super.onSaveInstanceState());
        C c4 = this.f2471b;
        if (c4 != null) {
            c3.f1351c = c4.f1351c;
            return c3;
        }
        u uVar = this.f2483i;
        if (uVar != null) {
            c3.f1351c = uVar.C();
            return c3;
        }
        c3.f1351c = null;
        return c3;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i4, int i5, int i6) {
        super.onSizeChanged(i3, i4, i5, i6);
        if (i3 == i5 && i4 == i6) {
            return;
        }
        this.f2449C = null;
        this.f2447A = null;
        this.f2448B = null;
        this.z = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0241  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (!this.f2490q && !this.f2491r) {
            int action = motionEvent.getAction();
            C0071g c0071g = this.f2486l;
            if (c0071g != null) {
                if (action != 0) {
                    if (c0071g.f1419q != 0) {
                        if (motionEvent.getAction() == 0) {
                            boolean b3 = c0071g.b(motionEvent.getX(), motionEvent.getY());
                            boolean a3 = c0071g.a(motionEvent.getX(), motionEvent.getY());
                            if (b3 || a3) {
                                if (a3) {
                                    c0071g.f1420r = 1;
                                    c0071g.f1414k = (int) motionEvent.getX();
                                } else if (b3) {
                                    c0071g.f1420r = 2;
                                    c0071g.f1413j = (int) motionEvent.getY();
                                }
                                c0071g.e(2);
                            }
                        } else if (motionEvent.getAction() == 1 && c0071g.f1419q == 2) {
                            c0071g.f1413j = 0.0f;
                            c0071g.f1414k = 0.0f;
                            c0071g.e(1);
                            c0071g.f1420r = 0;
                        } else if (motionEvent.getAction() == 2 && c0071g.f1419q == 2) {
                            c0071g.f();
                            int i3 = c0071g.f1420r;
                            int i4 = c0071g.f1405a;
                            if (i3 == 1) {
                                float x3 = motionEvent.getX();
                                int[] iArr = c0071g.f1422t;
                                iArr[0] = i4;
                                int i5 = c0071g.f1415l - i4;
                                iArr[1] = i5;
                                float max = Math.max(i4, Math.min(i5, x3));
                                if (Math.abs(0 - max) >= 2.0f) {
                                    float f = c0071g.f1414k;
                                    int computeHorizontalScrollRange = c0071g.f1417n.computeHorizontalScrollRange();
                                    c0071g.f1417n.computeHorizontalScrollOffset();
                                    int d3 = C0071g.d(f, max, iArr, computeHorizontalScrollRange, 0, c0071g.f1415l);
                                    if (d3 != 0) {
                                        c0071g.f1417n.scrollBy(d3, 0);
                                    }
                                    c0071g.f1414k = max;
                                }
                            }
                            if (c0071g.f1420r == 2) {
                                float y3 = motionEvent.getY();
                                int[] iArr2 = c0071g.f1421s;
                                iArr2[0] = i4;
                                int i6 = c0071g.f1416m - i4;
                                iArr2[1] = i6;
                                float max2 = Math.max(i4, Math.min(i6, y3));
                                if (Math.abs(0 - max2) >= 2.0f) {
                                    float f3 = c0071g.f1413j;
                                    int computeVerticalScrollRange = c0071g.f1417n.computeVerticalScrollRange();
                                    c0071g.f1417n.computeVerticalScrollOffset();
                                    int d4 = C0071g.d(f3, max2, iArr2, computeVerticalScrollRange, 0, c0071g.f1416m);
                                    if (d4 != 0) {
                                        c0071g.f1417n.scrollBy(0, d4);
                                    }
                                    c0071g.f1413j = max2;
                                }
                            }
                        }
                    }
                    if (action == 3 || action == 1) {
                        this.f2486l = null;
                    }
                    p();
                    setScrollState(0);
                    return true;
                }
                this.f2486l = null;
            }
            if (action != 0) {
                ArrayList arrayList = this.f2485k;
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    C0071g c0071g2 = (C0071g) arrayList.get(i7);
                    if (c0071g2.c(motionEvent)) {
                        this.f2486l = c0071g2;
                        p();
                        setScrollState(0);
                        return true;
                    }
                }
            }
            u uVar = this.f2483i;
            if (uVar != null) {
                boolean b4 = uVar.b();
                boolean c3 = this.f2483i.c();
                if (this.f2453G == null) {
                    this.f2453G = VelocityTracker.obtain();
                }
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                int[] iArr3 = this.f2478e0;
                if (actionMasked == 0) {
                    iArr3[1] = 0;
                    iArr3[0] = 0;
                }
                obtain.offsetLocation(iArr3[0], iArr3[1]);
                if (actionMasked == 0) {
                    this.f2452F = motionEvent.getPointerId(0);
                    int x4 = (int) (motionEvent.getX() + 0.5f);
                    this.f2456J = x4;
                    this.f2454H = x4;
                    int y4 = (int) (motionEvent.getY() + 0.5f);
                    this.f2457K = y4;
                    this.f2455I = y4;
                    int i8 = b4;
                    if (c3) {
                        i8 = (b4 ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i8, 0);
                } else {
                    if (actionMasked == 1) {
                        this.f2453G.addMovement(obtain);
                        VelocityTracker velocityTracker = this.f2453G;
                        int i9 = this.f2459N;
                        velocityTracker.computeCurrentVelocity(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, i9);
                        float f4 = b4 != 0 ? -this.f2453G.getXVelocity(this.f2452F) : 0.0f;
                        float f5 = c3 ? -this.f2453G.getYVelocity(this.f2452F) : 0.0f;
                        if (f4 != 0.0f || f5 != 0.0f) {
                            int i10 = (int) f4;
                            int i11 = (int) f5;
                            u uVar2 = this.f2483i;
                            if (uVar2 == null) {
                                Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                            } else if (!this.f2490q) {
                                boolean b5 = uVar2.b();
                                boolean c4 = this.f2483i.c();
                                int i12 = this.f2458M;
                                if (b5 == 0 || Math.abs(i10) < i12) {
                                    i10 = 0;
                                }
                                if (!c4 || Math.abs(i11) < i12) {
                                    i11 = 0;
                                }
                                if (i10 != 0 || i11 != 0) {
                                    float f6 = i10;
                                    float f7 = i11;
                                    if (!dispatchNestedPreFling(f6, f7)) {
                                        boolean z2 = b5 != 0 || c4;
                                        dispatchNestedFling(f6, f7, z2);
                                        int i13 = b5;
                                        if (z2) {
                                            if (c4) {
                                                i13 = (b5 ? 1 : 0) | 2;
                                            }
                                            getScrollingChildHelper().g(i13, 1);
                                            int i14 = -i9;
                                            int max3 = Math.max(i14, Math.min(i10, i9));
                                            int max4 = Math.max(i14, Math.min(i11, i9));
                                            F f8 = this.f2463R;
                                            f8.f1362g.setScrollState(2);
                                            f8.f1358b = 0;
                                            f8.f1357a = 0;
                                            f8.f1359c.fling(0, 0, max3, max4, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                            f8.a();
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
                        int findPointerIndex = motionEvent.findPointerIndex(this.f2452F);
                        if (findPointerIndex < 0) {
                            Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f2452F + " not found. Did any MotionEvents get skipped?");
                            return false;
                        }
                        int x5 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                        int y5 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                        int i15 = this.f2456J - x5;
                        int i16 = this.f2457K - y5;
                        boolean f9 = f(i15, i16, 0, this.f2476d0, this.f2474c0);
                        int[] iArr4 = this.f2474c0;
                        if (f9) {
                            int[] iArr5 = this.f2476d0;
                            i15 -= iArr5[0];
                            i16 -= iArr5[1];
                            obtain.offsetLocation(iArr4[0], iArr4[1]);
                            iArr3[0] = iArr3[0] + iArr4[0];
                            iArr3[1] = iArr3[1] + iArr4[1];
                        }
                        if (this.f2451E != 1) {
                            if (b4 != 0) {
                                int abs = Math.abs(i15);
                                int i17 = this.L;
                                if (abs > i17) {
                                    i15 = i15 > 0 ? i15 - i17 : i15 + i17;
                                    z = true;
                                    if (c3) {
                                        int abs2 = Math.abs(i16);
                                        int i18 = this.L;
                                        if (abs2 > i18) {
                                            i16 = i16 > 0 ? i16 - i18 : i16 + i18;
                                            z = true;
                                        }
                                    }
                                    if (z) {
                                        setScrollState(1);
                                    }
                                }
                            }
                            z = false;
                            if (c3) {
                            }
                            if (z) {
                            }
                        }
                        if (this.f2451E == 1) {
                            this.f2456J = x5 - iArr4[0];
                            this.f2457K = y5 - iArr4[1];
                            q(b4 != 0 ? i15 : 0, c3 ? i16 : 0, obtain);
                            RunnableC0075k runnableC0075k = this.f2464S;
                            if (runnableC0075k != null && (i15 != 0 || i16 != 0)) {
                                runnableC0075k.a(this, i15, i16);
                            }
                        }
                    } else if (actionMasked == 3) {
                        p();
                        setScrollState(0);
                    } else if (actionMasked == 5) {
                        this.f2452F = motionEvent.getPointerId(actionIndex);
                        int x6 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.f2456J = x6;
                        this.f2454H = x6;
                        int y6 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        this.f2457K = y6;
                        this.f2455I = y6;
                    } else if (actionMasked == 6) {
                        n(motionEvent);
                    }
                }
                this.f2453G.addMovement(obtain);
                obtain.recycle();
                return true;
            }
        }
        return false;
    }

    public final void p() {
        VelocityTracker velocityTracker = this.f2453G;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z = false;
        s(0);
        EdgeEffect edgeEffect = this.z;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.z.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f2447A;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.f2447A.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f2448B;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.f2448B.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f2449C;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.f2449C.isFinished();
        }
        if (z) {
            Field field = E.A.f243a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(int i3, int i4, MotionEvent motionEvent) {
        d();
        if (!this.f2484j.isEmpty()) {
            invalidate();
        }
        int[] iArr = this.f2474c0;
        boolean z = false;
        boolean z2 = true;
        if (g(iArr, 0)) {
            int i5 = this.f2456J;
            int i6 = iArr[0];
            this.f2456J = i5 - i6;
            int i7 = this.f2457K;
            int i8 = iArr[1];
            this.f2457K = i7 - i8;
            if (motionEvent != null) {
                motionEvent.offsetLocation(i6, i8);
            }
            int[] iArr2 = this.f2478e0;
            iArr2[0] = iArr2[0] + iArr[0];
            iArr2[1] = iArr2[1] + iArr[1];
        } else if (getOverScrollMode() != 2) {
            if (motionEvent != null && (motionEvent.getSource() & 8194) != 8194) {
                float x3 = motionEvent.getX();
                float f = 0;
                float y3 = motionEvent.getY();
                if (f < 0.0f) {
                    if (this.z == null) {
                        this.f2497y.getClass();
                        EdgeEffect edgeEffect = new EdgeEffect(getContext());
                        this.z = edgeEffect;
                        if (this.f) {
                            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                        } else {
                            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
                        }
                    }
                    c.a(this.z, (-f) / getWidth(), 1.0f - (y3 / getHeight()));
                } else {
                    if (f > 0.0f) {
                        if (this.f2448B == null) {
                            this.f2497y.getClass();
                            EdgeEffect edgeEffect2 = new EdgeEffect(getContext());
                            this.f2448B = edgeEffect2;
                            if (this.f) {
                                edgeEffect2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                            } else {
                                edgeEffect2.setSize(getMeasuredHeight(), getMeasuredWidth());
                            }
                        }
                        c.a(this.f2448B, f / getWidth(), y3 / getHeight());
                    }
                    if (f >= 0.0f) {
                        if (this.f2447A == null) {
                            this.f2497y.getClass();
                            EdgeEffect edgeEffect3 = new EdgeEffect(getContext());
                            this.f2447A = edgeEffect3;
                            if (this.f) {
                                edgeEffect3.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
                            } else {
                                edgeEffect3.setSize(getMeasuredWidth(), getMeasuredHeight());
                            }
                        }
                        c.a(this.f2447A, (-f) / getHeight(), x3 / getWidth());
                    } else if (f > 0.0f) {
                        if (this.f2449C == null) {
                            this.f2497y.getClass();
                            EdgeEffect edgeEffect4 = new EdgeEffect(getContext());
                            this.f2449C = edgeEffect4;
                            if (this.f) {
                                edgeEffect4.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
                            } else {
                                edgeEffect4.setSize(getMeasuredWidth(), getMeasuredHeight());
                            }
                        }
                        c.a(this.f2449C, f / getHeight(), 1.0f - (x3 / getWidth()));
                    } else {
                        z2 = z;
                    }
                    if (!z2 || f != 0.0f || f != 0.0f) {
                        Field field = E.A.f243a;
                        postInvalidateOnAnimation();
                    }
                }
                z = true;
                if (f >= 0.0f) {
                }
                if (!z2) {
                }
                Field field2 = E.A.f243a;
                postInvalidateOnAnimation();
            }
            c(i3, i4);
        }
        if (awakenScrollBars()) {
            return;
        }
        invalidate();
    }

    public final void r(int i3, int i4) {
        int i5;
        u uVar = this.f2483i;
        if (uVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f2490q) {
            return;
        }
        int i6 = !uVar.b() ? 0 : i3;
        int i7 = !this.f2483i.c() ? 0 : i4;
        if (i6 == 0 && i7 == 0) {
            return;
        }
        F f = this.f2463R;
        f.getClass();
        int abs = Math.abs(i6);
        int abs2 = Math.abs(i7);
        boolean z = abs > abs2;
        int sqrt = (int) Math.sqrt(0);
        int sqrt2 = (int) Math.sqrt((i7 * i7) + (i6 * i6));
        RecyclerView recyclerView = f.f1362g;
        int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
        int i8 = width / 2;
        float f3 = width;
        float f4 = i8;
        float sin = (((float) Math.sin((Math.min(1.0f, (sqrt2 * 1.0f) / f3) - 0.5f) * 0.47123894f)) * f4) + f4;
        if (sqrt > 0) {
            i5 = Math.round(Math.abs(sin / sqrt) * 1000.0f) * 4;
        } else {
            if (!z) {
                abs = abs2;
            }
            i5 = (int) (((abs / f3) + 1.0f) * 300.0f);
        }
        int min = Math.min(i5, 2000);
        p pVar = f2446k0;
        if (f.f1360d != pVar) {
            f.f1360d = pVar;
            f.f1359c = new OverScroller(recyclerView.getContext(), pVar);
        }
        recyclerView.setScrollState(2);
        f.f1358b = 0;
        f.f1357a = 0;
        f.f1359c.startScroll(0, 0, i6, i7, min);
        f.a();
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        j(view);
        view.clearAnimation();
        j(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        this.f2483i.getClass();
        if (this.f2495w <= 0 && view2 != null) {
            o(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f2483i.G(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.f2485k;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((C0071g) arrayList.get(i3)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f2489p != 0 || this.f2490q) {
            return;
        }
        super.requestLayout();
    }

    public final void s(int i3) {
        getScrollingChildHelper().h(i3);
    }

    @Override // android.view.View
    public final void scrollBy(int i3, int i4) {
        u uVar = this.f2483i;
        if (uVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f2490q) {
            return;
        }
        boolean b3 = uVar.b();
        boolean c3 = this.f2483i.c();
        if (b3 || c3) {
            if (!b3) {
                i3 = 0;
            }
            if (!c3) {
                i4 = 0;
            }
            q(i3, i4, null);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i3, int i4) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (this.f2495w <= 0) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.f2492s |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(H h3) {
        this.f2470a0 = h3;
        E.A.a(this, h3);
    }

    public void setAdapter(q qVar) {
        setLayoutFrozen(false);
        t tVar = this.f2450D;
        if (tVar != null) {
            tVar.a();
        }
        u uVar = this.f2483i;
        A a3 = this.f2469a;
        if (uVar != null) {
            uVar.E();
            this.f2483i.F(a3);
        }
        ((ArrayList) a3.f1348c).clear();
        ArrayList arrayList = (ArrayList) a3.f1349d;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            arrayList.get(size).getClass();
            throw new ClassCastException();
        }
        arrayList.clear();
        C0073i c0073i = ((RecyclerView) a3.f).f2465T;
        c0073i.getClass();
        c0073i.f1427c = 0;
        f fVar = this.f2473c;
        fVar.P((ArrayList) fVar.f24c);
        fVar.P((ArrayList) fVar.f25d);
        ((ArrayList) a3.f1348c).clear();
        ArrayList arrayList2 = (ArrayList) a3.f1349d;
        int size2 = arrayList2.size() - 1;
        if (size2 >= 0) {
            arrayList2.get(size2).getClass();
            throw new ClassCastException();
        }
        arrayList2.clear();
        RecyclerView recyclerView = (RecyclerView) a3.f;
        C0073i c0073i2 = recyclerView.f2465T;
        c0073i2.getClass();
        c0073i2.f1427c = 0;
        if (((z) a3.f1350e) == null) {
            z zVar = new z();
            zVar.f1459a = new SparseArray();
            zVar.f1460b = 0;
            a3.f1350e = zVar;
        }
        z zVar2 = (z) a3.f1350e;
        if (zVar2.f1460b == 0) {
            SparseArray sparseArray = zVar2.f1459a;
            if (sparseArray.size() > 0) {
                ((y) sparseArray.valueAt(0)).getClass();
                throw null;
            }
        }
        this.f2466U.f1353b = true;
        this.v = this.v;
        this.f2494u = true;
        int F3 = this.f2475d.F();
        for (int i3 = 0; i3 < F3; i3++) {
            j(this.f2475d.E(i3));
        }
        m();
        int size3 = arrayList2.size();
        for (int i4 = 0; i4 < size3; i4++) {
            if (arrayList2.get(i4) != null) {
                throw new ClassCastException();
            }
        }
        int size4 = arrayList2.size() - 1;
        if (size4 >= 0) {
            arrayList2.get(size4).getClass();
            throw new ClassCastException();
        }
        arrayList2.clear();
        C0073i c0073i3 = recyclerView.f2465T;
        c0073i3.getClass();
        c0073i3.f1427c = 0;
        requestLayout();
    }

    public void setChildDrawingOrderCallback(r rVar) {
        if (rVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.f) {
            this.f2449C = null;
            this.f2447A = null;
            this.f2448B = null;
            this.z = null;
        }
        this.f = z;
        super.setClipToPadding(z);
        if (this.o) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(s sVar) {
        sVar.getClass();
        this.f2497y = sVar;
        this.f2449C = null;
        this.f2447A = null;
        this.f2448B = null;
        this.z = null;
    }

    public void setHasFixedSize(boolean z) {
        this.f2488n = z;
    }

    public void setItemAnimator(t tVar) {
        t tVar2 = this.f2450D;
        if (tVar2 != null) {
            tVar2.a();
            this.f2450D.f1447a = null;
        }
        this.f2450D = tVar;
        if (tVar != null) {
            tVar.f1447a = this.f2468W;
        }
    }

    public void setItemViewCacheSize(int i3) {
        A a3 = this.f2469a;
        a3.f1346a = i3;
        a3.b();
    }

    public void setLayoutFrozen(boolean z) {
        if (z != this.f2490q) {
            b("Do not setLayoutFrozen in layout or scroll");
            if (!z) {
                this.f2490q = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f2490q = true;
            this.f2491r = true;
            setScrollState(0);
            F f = this.f2463R;
            f.f1362g.removeCallbacks(f);
            f.f1359c.abortAnimation();
        }
    }

    public void setLayoutManager(u uVar) {
        e eVar;
        if (uVar == this.f2483i) {
            return;
        }
        setScrollState(0);
        F f = this.f2463R;
        f.f1362g.removeCallbacks(f);
        f.f1359c.abortAnimation();
        u uVar2 = this.f2483i;
        A a3 = this.f2469a;
        if (uVar2 != null) {
            t tVar = this.f2450D;
            if (tVar != null) {
                tVar.a();
            }
            this.f2483i.E();
            this.f2483i.F(a3);
            ((ArrayList) a3.f1348c).clear();
            ArrayList arrayList = (ArrayList) a3.f1349d;
            int size = arrayList.size() - 1;
            if (size >= 0) {
                arrayList.get(size).getClass();
                throw new ClassCastException();
            }
            arrayList.clear();
            C0073i c0073i = ((RecyclerView) a3.f).f2465T;
            c0073i.getClass();
            c0073i.f1427c = 0;
            if (this.f2487m) {
                u uVar3 = this.f2483i;
                uVar3.f1455e = false;
                uVar3.z(this);
            }
            this.f2483i.I(null);
            this.f2483i = null;
        } else {
            ((ArrayList) a3.f1348c).clear();
            ArrayList arrayList2 = (ArrayList) a3.f1349d;
            int size2 = arrayList2.size() - 1;
            if (size2 >= 0) {
                arrayList2.get(size2).getClass();
                throw new ClassCastException();
            }
            arrayList2.clear();
            C0073i c0073i2 = ((RecyclerView) a3.f).f2465T;
            c0073i2.getClass();
            c0073i2.f1427c = 0;
        }
        f fVar = this.f2475d;
        ((C0066b) fVar.f24c).c();
        ArrayList arrayList3 = (ArrayList) fVar.f25d;
        int size3 = arrayList3.size() - 1;
        while (true) {
            eVar = (e) fVar.f23b;
            if (size3 < 0) {
                break;
            }
            j((View) arrayList3.get(size3));
            arrayList3.remove(size3);
            size3--;
        }
        RecyclerView recyclerView = (RecyclerView) eVar.f201b;
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            j(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f2483i = uVar;
        if (uVar != null) {
            if (uVar.f1452b != null) {
                throw new IllegalArgumentException("LayoutManager " + uVar + " is already attached to a RecyclerView:" + uVar.f1452b.h());
            }
            uVar.I(this);
            if (this.f2487m) {
                this.f2483i.f1455e = true;
            }
        }
        a3.b();
        requestLayout();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        C0006g scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f288d) {
            Field field = E.A.f243a;
            AbstractC0018t.g(scrollingChildHelper.f287c);
        }
        scrollingChildHelper.f288d = z;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.f2462Q = z;
    }

    public void setRecycledViewPool(z zVar) {
        A a3 = this.f2469a;
        if (((z) a3.f1350e) != null) {
            r1.f1460b--;
        }
        a3.f1350e = zVar;
        if (zVar != null) {
            ((RecyclerView) a3.f).getAdapter();
        }
    }

    public void setScrollState(int i3) {
        if (i3 == this.f2451E) {
            return;
        }
        this.f2451E = i3;
        if (i3 != 2) {
            F f = this.f2463R;
            f.f1362g.removeCallbacks(f);
            f.f1359c.abortAnimation();
        }
        u uVar = this.f2483i;
        if (uVar != null) {
            uVar.D(i3);
        }
        ArrayList arrayList = this.f2467V;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((x) this.f2467V.get(size)).getClass();
            }
        }
    }

    public void setScrollingTouchSlop(int i3) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i3 != 0) {
            if (i3 == 1) {
                this.L = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i3 + "; using default value");
        }
        this.L = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(E e3) {
        this.f2469a.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i3) {
        return getScrollingChildHelper().g(i3, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        u uVar = this.f2483i;
        if (uVar != null) {
            return uVar.n(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + h());
    }

    public void setOnFlingListener(w wVar) {
    }

    @Deprecated
    public void setOnScrollListener(x xVar) {
    }

    public void setRecyclerListener(U.B b3) {
    }
}
