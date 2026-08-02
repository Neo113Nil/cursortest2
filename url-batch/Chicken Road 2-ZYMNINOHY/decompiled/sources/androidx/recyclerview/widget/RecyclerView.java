package androidx.recyclerview.widget;

import A.e;
import A0.c;
import B.b;
import B1.j;
import E.A;
import E.AbstractC0005f;
import E.AbstractC0012m;
import E.C;
import E.C0014o;
import E.H;
import E.I;
import E1.P;
import a0.C0144j;
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
import c0.F;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import k1.AbstractC1241a;
import kotlin.jvm.internal.i;
import l1.AbstractC1246C;
import l1.AbstractC1253J;
import l1.AbstractC1268o;
import l1.AbstractC1271r;
import l1.C1244A;
import l1.C1245B;
import l1.C1249F;
import l1.C1255b;
import l1.C1259f;
import l1.C1270q;
import l1.InterfaceC1269p;
import l1.InterpolatorC1267n;
import l1.RunnableC1247D;
import l1.RunnableC1262i;
import l1.t;
import l1.u;
import l1.v;
import l1.w;
import l1.x;
import l1.y;
import l1.z;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* renamed from: h0, reason: collision with root package name */
    public static final int[] f5133h0 = {R.attr.nestedScrollingEnabled};

    /* renamed from: i0, reason: collision with root package name */
    public static final int[] f5134i0 = {R.attr.clipToPadding};

    /* renamed from: j0, reason: collision with root package name */
    public static final Class[] f5135j0;

    /* renamed from: k0, reason: collision with root package name */
    public static final InterpolatorC1267n f5136k0;

    /* renamed from: A, reason: collision with root package name */
    public EdgeEffect f5137A;

    /* renamed from: B, reason: collision with root package name */
    public EdgeEffect f5138B;

    /* renamed from: C, reason: collision with root package name */
    public EdgeEffect f5139C;

    /* renamed from: D, reason: collision with root package name */
    public AbstractC1271r f5140D;

    /* renamed from: E, reason: collision with root package name */
    public int f5141E;

    /* renamed from: F, reason: collision with root package name */
    public int f5142F;

    /* renamed from: G, reason: collision with root package name */
    public VelocityTracker f5143G;

    /* renamed from: H, reason: collision with root package name */
    public int f5144H;

    /* renamed from: I, reason: collision with root package name */
    public int f5145I;

    /* renamed from: J, reason: collision with root package name */
    public int f5146J;

    /* renamed from: K, reason: collision with root package name */
    public int f5147K;
    public int L;

    /* renamed from: M, reason: collision with root package name */
    public final int f5148M;

    /* renamed from: N, reason: collision with root package name */
    public final int f5149N;

    /* renamed from: O, reason: collision with root package name */
    public final float f5150O;

    /* renamed from: P, reason: collision with root package name */
    public final float f5151P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f5152Q;

    /* renamed from: R, reason: collision with root package name */
    public final RunnableC1247D f5153R;

    /* renamed from: S, reason: collision with root package name */
    public RunnableC1262i f5154S;

    /* renamed from: T, reason: collision with root package name */
    public final c f5155T;

    /* renamed from: U, reason: collision with root package name */
    public final C1245B f5156U;

    /* renamed from: V, reason: collision with root package name */
    public ArrayList f5157V;

    /* renamed from: W, reason: collision with root package name */
    public final C0144j f5158W;

    /* renamed from: a, reason: collision with root package name */
    public final F f5159a;

    /* renamed from: a0, reason: collision with root package name */
    public C1249F f5160a0;

    /* renamed from: b, reason: collision with root package name */
    public C1244A f5161b;

    /* renamed from: b0, reason: collision with root package name */
    public C0014o f5162b0;

    /* renamed from: c, reason: collision with root package name */
    public final j f5163c;

    /* renamed from: c0, reason: collision with root package name */
    public final int[] f5164c0;

    /* renamed from: d, reason: collision with root package name */
    public final j f5165d;

    /* renamed from: d0, reason: collision with root package name */
    public final int[] f5166d0;

    /* renamed from: e, reason: collision with root package name */
    public final C0144j f5167e;

    /* renamed from: e0, reason: collision with root package name */
    public final int[] f5168e0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5169f;

    /* renamed from: f0, reason: collision with root package name */
    public final ArrayList f5170f0;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f5171g;

    /* renamed from: g0, reason: collision with root package name */
    public final b f5172g0;

    /* renamed from: h, reason: collision with root package name */
    public final Rect f5173h;

    /* renamed from: i, reason: collision with root package name */
    public t f5174i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f5175j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f5176k;

    /* renamed from: l, reason: collision with root package name */
    public C1259f f5177l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f5178m;
    public boolean n;
    public boolean o;

    /* renamed from: p, reason: collision with root package name */
    public int f5179p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f5180q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f5181r;

    /* renamed from: s, reason: collision with root package name */
    public int f5182s;

    /* renamed from: t, reason: collision with root package name */
    public final AccessibilityManager f5183t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f5184u;
    public boolean v;

    /* renamed from: w, reason: collision with root package name */
    public int f5185w;

    /* renamed from: x, reason: collision with root package name */
    public final int f5186x;

    /* renamed from: y, reason: collision with root package name */
    public C1270q f5187y;
    public EdgeEffect z;

    static {
        Class cls = Integer.TYPE;
        f5135j0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f5136k0 = new InterpolatorC1267n();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        float a3;
        Constructor constructor;
        this.f5159a = new F(this);
        this.f5167e = new C0144j(21);
        this.f5171g = new Rect();
        this.f5173h = new Rect();
        new RectF();
        this.f5175j = new ArrayList();
        this.f5176k = new ArrayList();
        this.f5179p = 0;
        this.f5184u = false;
        this.v = false;
        this.f5185w = 0;
        this.f5186x = 0;
        this.f5187y = new C1270q();
        C1255b c1255b = new C1255b();
        Object[] objArr = null;
        c1255b.f14249a = null;
        c1255b.f14250b = new ArrayList();
        c1255b.f14251c = 250L;
        c1255b.f14252d = 250L;
        c1255b.f14194e = new ArrayList();
        c1255b.f14195f = new ArrayList();
        c1255b.f14196g = new ArrayList();
        c1255b.f14197h = new ArrayList();
        c1255b.f14198i = new ArrayList();
        c1255b.f14199j = new ArrayList();
        c1255b.f14200k = new ArrayList();
        c1255b.f14201l = new ArrayList();
        c1255b.f14202m = new ArrayList();
        c1255b.n = new ArrayList();
        c1255b.o = new ArrayList();
        this.f5140D = c1255b;
        this.f5141E = 0;
        this.f5142F = -1;
        this.f5150O = Float.MIN_VALUE;
        this.f5151P = Float.MIN_VALUE;
        boolean z = true;
        this.f5152Q = true;
        this.f5153R = new RunnableC1247D(this);
        this.f5155T = new c();
        C1245B c1245b = new C1245B();
        c1245b.f14165a = 0;
        c1245b.f14166b = false;
        c1245b.f14167c = false;
        c1245b.f14168d = false;
        c1245b.f14169e = false;
        this.f5156U = c1245b;
        C0144j c0144j = new C0144j(19, false);
        this.f5158W = c0144j;
        this.f5164c0 = new int[2];
        this.f5166d0 = new int[2];
        this.f5168e0 = new int[2];
        this.f5170f0 = new ArrayList();
        this.f5172g0 = new b(16, this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f5134i0, 0, 0);
            this.f5169f = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.f5169f = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.L = viewConfiguration.getScaledTouchSlop();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26) {
            Method method = I.f377a;
            a3 = AbstractC0012m.c(viewConfiguration);
        } else {
            a3 = I.a(viewConfiguration, context);
        }
        this.f5150O = a3;
        this.f5151P = i4 >= 26 ? AbstractC0012m.d(viewConfiguration) : I.a(viewConfiguration, context);
        this.f5148M = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f5149N = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f5140D.f14249a = c0144j;
        this.f5163c = new j(new C0144j(18, this));
        this.f5165d = new j(new e0.t(this));
        Field field = H.f375a;
        if ((i4 >= 26 ? C.a(this) : 0) == 0 && i4 >= 26) {
            C.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f5183t = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C1249F(this));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC1241a.f14146a, 0, 0);
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
                new C1259f(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.rockchicken.pump.up.road.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.rockchicken.pump.up.road.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.rockchicken.pump.up.road.R.dimen.fastscroll_margin));
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
                        Class<? extends U> asSubclass = (isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).loadClass(str).asSubclass(t.class);
                        try {
                            constructor = asSubclass.getConstructor(f5135j0);
                            objArr = new Object[]{context, attributeSet, 0, 0};
                        } catch (NoSuchMethodException e4) {
                            try {
                                constructor = asSubclass.getConstructor(null);
                            } catch (NoSuchMethodException e5) {
                                e5.initCause(e4);
                                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e5);
                            }
                        }
                        constructor.setAccessible(true);
                        setLayoutManager((t) constructor.newInstance(objArr));
                    } catch (ClassCastException e6) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e6);
                    } catch (ClassNotFoundException e7) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e7);
                    } catch (IllegalAccessException e8) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e8);
                    } catch (InstantiationException e9) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e9);
                    } catch (InvocationTargetException e10) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e10);
                    }
                }
            }
            TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f5133h0, 0, 0);
            z = obtainStyledAttributes3.getBoolean(0, true);
            obtainStyledAttributes3.recycle();
        } else {
            setDescendantFocusability(262144);
        }
        setNestedScrollingEnabled(z);
    }

    private C0014o getScrollingChildHelper() {
        if (this.f5162b0 == null) {
            this.f5162b0 = new C0014o(this);
        }
        return this.f5162b0;
    }

    public static void j(View view) {
        if (view == null) {
            return;
        }
        ((u) view.getLayoutParams()).getClass();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i4, int i5) {
        t tVar = this.f5174i;
        if (tVar != null) {
            tVar.getClass();
        }
        super.addFocusables(arrayList, i4, i5);
    }

    public final void b(String str) {
        if (this.f5185w > 0) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + h());
        }
        if (this.f5186x > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + h()));
        }
    }

    public final void c(int i4, int i5) {
        boolean z;
        EdgeEffect edgeEffect = this.z;
        if (edgeEffect == null || edgeEffect.isFinished() || i4 <= 0) {
            z = false;
        } else {
            this.z.onRelease();
            z = this.z.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f5138B;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i4 < 0) {
            this.f5138B.onRelease();
            z |= this.f5138B.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f5137A;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i5 > 0) {
            this.f5137A.onRelease();
            z |= this.f5137A.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f5139C;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i5 < 0) {
            this.f5139C.onRelease();
            z |= this.f5139C.isFinished();
        }
        if (z) {
            Field field = H.f375a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof u) && this.f5174i.d((u) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        t tVar = this.f5174i;
        if (tVar != null && tVar.b()) {
            return this.f5174i.f(this.f5156U);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        t tVar = this.f5174i;
        if (tVar != null && tVar.b()) {
            this.f5174i.g(this.f5156U);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        t tVar = this.f5174i;
        if (tVar != null && tVar.b()) {
            return this.f5174i.h(this.f5156U);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        t tVar = this.f5174i;
        if (tVar != null && tVar.c()) {
            return this.f5174i.i(this.f5156U);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        t tVar = this.f5174i;
        if (tVar != null && tVar.c()) {
            this.f5174i.j(this.f5156U);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        t tVar = this.f5174i;
        if (tVar != null && tVar.c()) {
            return this.f5174i.k(this.f5156U);
        }
        return 0;
    }

    public final void d() {
        if (!this.o || this.f5184u) {
            int i4 = e.f5a;
            Trace.beginSection("RV FullInvalidate");
            Log.e("RecyclerView", "No adapter attached; skipping layout");
            Trace.endSection();
            return;
        }
        j jVar = this.f5163c;
        if (((ArrayList) jVar.f202c).size() > 0) {
            jVar.getClass();
            if (((ArrayList) jVar.f202c).size() > 0) {
                int i5 = e.f5a;
                Trace.beginSection("RV FullInvalidate");
                Log.e("RecyclerView", "No adapter attached; skipping layout");
                Trace.endSection();
            }
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f4, float f5, boolean z) {
        return getScrollingChildHelper().a(f4, f5, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f4, float f5) {
        return getScrollingChildHelper().b(f4, f5);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i4, int i5, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i4, i5, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i4, int i5, int i6, int i7, int[] iArr) {
        return getScrollingChildHelper().d(i4, i5, i6, i7, iArr, 0, null);
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
        ArrayList arrayList = this.f5175j;
        int size = arrayList.size();
        boolean z4 = false;
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                break;
            }
            C1259f c1259f = (C1259f) arrayList.get(i4);
            if (c1259f.f14220l != c1259f.n.getWidth() || c1259f.f14221m != c1259f.n.getHeight()) {
                c1259f.f14220l = c1259f.n.getWidth();
                c1259f.f14221m = c1259f.n.getHeight();
                c1259f.e(0);
            } else if (c1259f.v != 0) {
                if (c1259f.o) {
                    int i5 = c1259f.f14220l;
                    int i6 = c1259f.f14212d;
                    int i7 = i5 - i6;
                    int i8 = 0 - (0 / 2);
                    StateListDrawable stateListDrawable = c1259f.f14210b;
                    stateListDrawable.setBounds(0, 0, i6, 0);
                    Drawable drawable = c1259f.f14211c;
                    drawable.setBounds(0, 0, c1259f.f14213e, c1259f.f14221m);
                    RecyclerView recyclerView = c1259f.n;
                    Field field = H.f375a;
                    if (recyclerView.getLayoutDirection() == 1) {
                        drawable.draw(canvas);
                        canvas.translate(i6, i8);
                        canvas.scale(-1.0f, 1.0f);
                        stateListDrawable.draw(canvas);
                        canvas.scale(1.0f, 1.0f);
                        canvas.translate(-i6, -i8);
                    } else {
                        canvas.translate(i7, 0.0f);
                        drawable.draw(canvas);
                        canvas.translate(0.0f, i8);
                        stateListDrawable.draw(canvas);
                        canvas.translate(-i7, -i8);
                    }
                }
                if (c1259f.f14222p) {
                    int i9 = c1259f.f14221m;
                    int i10 = c1259f.f14216h;
                    int i11 = i9 - i10;
                    StateListDrawable stateListDrawable2 = c1259f.f14214f;
                    stateListDrawable2.setBounds(0, 0, 0, i10);
                    Drawable drawable2 = c1259f.f14215g;
                    drawable2.setBounds(0, 0, c1259f.f14220l, c1259f.f14217i);
                    canvas.translate(0.0f, i11);
                    drawable2.draw(canvas);
                    canvas.translate(0 - (0 / 2), 0.0f);
                    stateListDrawable2.draw(canvas);
                    canvas.translate(-r8, -i11);
                }
            }
            i4++;
        }
        EdgeEffect edgeEffect = this.z;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f5169f ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.z;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f5137A;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f5169f) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f5137A;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f5138B;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f5169f ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f5138B;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f5139C;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f5169f) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f5139C;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z4 = true;
            }
            z |= z4;
            canvas.restoreToCount(save4);
        }
        if ((z || this.f5140D == null || arrayList.size() <= 0 || !this.f5140D.b()) ? z : true) {
            Field field2 = H.f375a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j4) {
        return super.drawChild(canvas, view, j4);
    }

    public final void e(int i4, int i5) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        Field field = H.f375a;
        setMeasuredDimension(t.e(i4, paddingRight, getMinimumWidth()), t.e(i5, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final boolean f(int i4, int i5, int i6, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i4, i5, i6, iArr, iArr2);
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
    public final View focusSearch(View view, int i4) {
        int i5;
        this.f5174i.getClass();
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i4);
        if (findNextFocus != null && !findNextFocus.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i4);
            }
            o(findNextFocus, null);
            return view;
        }
        if (findNextFocus != null && findNextFocus != this && i(findNextFocus) != null) {
            if (view != null && i(view) != null) {
                int width = view.getWidth();
                int height = view.getHeight();
                Rect rect = this.f5171g;
                char c4 = 0;
                rect.set(0, 0, width, height);
                int width2 = findNextFocus.getWidth();
                int height2 = findNextFocus.getHeight();
                Rect rect2 = this.f5173h;
                rect2.set(0, 0, width2, height2);
                offsetDescendantRectToMyCoords(view, rect);
                offsetDescendantRectToMyCoords(findNextFocus, rect2);
                RecyclerView recyclerView = this.f5174i.f14256b;
                Field field = H.f375a;
                int i6 = recyclerView.getLayoutDirection() == 1 ? -1 : 1;
                int i7 = rect.left;
                int i8 = rect2.left;
                if ((i7 < i8 || rect.right <= i8) && rect.right < rect2.right) {
                    i5 = 1;
                } else {
                    int i9 = rect.right;
                    int i10 = rect2.right;
                    i5 = ((i9 > i10 || i7 >= i10) && i7 > i8) ? -1 : 0;
                }
                int i11 = rect.top;
                int i12 = rect2.top;
                if ((i11 < i12 || rect.bottom <= i12) && rect.bottom < rect2.bottom) {
                    c4 = 1;
                } else {
                    int i13 = rect.bottom;
                    int i14 = rect2.bottom;
                    if ((i13 > i14 || i11 >= i14) && i11 > i12) {
                        c4 = 65535;
                    }
                }
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 17) {
                            if (i4 != 33) {
                                if (i4 != 66) {
                                    if (i4 != 130) {
                                        throw new IllegalArgumentException("Invalid direction: " + i4 + h());
                                    }
                                }
                            }
                        }
                    } else if (c4 <= 0) {
                        if (c4 == 0) {
                        }
                    }
                } else if (c4 >= 0) {
                    if (c4 == 0) {
                    }
                }
            }
            return findNextFocus;
        }
        return super.focusSearch(view, i4);
    }

    public final boolean g(int[] iArr, int i4) {
        return getScrollingChildHelper().d(0, 0, 0, 0, iArr, i4, null);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        t tVar = this.f5174i;
        if (tVar != null) {
            return tVar.l();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + h());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        t tVar = this.f5174i;
        if (tVar != null) {
            return tVar.m(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + h());
    }

    public AbstractC1268o getAdapter() {
        return null;
    }

    @Override // android.view.View
    public int getBaseline() {
        t tVar = this.f5174i;
        if (tVar == null) {
            return super.getBaseline();
        }
        tVar.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i4, int i5) {
        return super.getChildDrawingOrder(i4, i5);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f5169f;
    }

    public C1249F getCompatAccessibilityDelegate() {
        return this.f5160a0;
    }

    public C1270q getEdgeEffectFactory() {
        return this.f5187y;
    }

    public AbstractC1271r getItemAnimator() {
        return this.f5140D;
    }

    public int getItemDecorationCount() {
        return this.f5175j.size();
    }

    public t getLayoutManager() {
        return this.f5174i;
    }

    public int getMaxFlingVelocity() {
        return this.f5149N;
    }

    public int getMinFlingVelocity() {
        return this.f5148M;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public v getOnFlingListener() {
        return null;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f5152Q;
    }

    public y getRecycledViewPool() {
        F f4 = this.f5159a;
        if (((y) f4.f5441e) == null) {
            y yVar = new y();
            yVar.f14264a = new SparseArray();
            yVar.f14265b = 0;
            f4.f5441e = yVar;
        }
        return (y) f4.f5441e;
    }

    public int getScrollState() {
        return this.f5141E;
    }

    public final String h() {
        return " " + super.toString() + ", adapter:null, layout:" + this.f5174i + ", context:" + getContext();
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
        return this.f5178m;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f434d;
    }

    public final boolean k() {
        return getScrollingChildHelper().f(1);
    }

    public final boolean l() {
        return !this.o || this.f5184u || ((ArrayList) this.f5163c.f202c).size() > 0;
    }

    public final void m() {
        int r4 = this.f5165d.r();
        for (int i4 = 0; i4 < r4; i4++) {
            ((u) this.f5165d.q(i4).getLayoutParams()).f14263b = true;
        }
        ArrayList arrayList = (ArrayList) this.f5159a.f5440d;
        if (arrayList.size() > 0) {
            throw AbstractC0005f.g(0, arrayList);
        }
    }

    public final void n(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f5142F) {
            int i4 = actionIndex == 0 ? 1 : 0;
            this.f5142F = motionEvent.getPointerId(i4);
            int x4 = (int) (motionEvent.getX(i4) + 0.5f);
            this.f5146J = x4;
            this.f5144H = x4;
            int y4 = (int) (motionEvent.getY(i4) + 0.5f);
            this.f5147K = y4;
            this.f5145I = y4;
        }
    }

    public final void o(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f5171g;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof u) {
            u uVar = (u) layoutParams;
            if (!uVar.f14263b) {
                Rect rect2 = uVar.f14262a;
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
        this.f5174i.G(this, view, this.f5171g, !this.o, view2 == null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r1 >= 30.0f) goto L19;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAttachedToWindow() {
        float f4;
        super.onAttachedToWindow();
        boolean z = false;
        this.f5185w = 0;
        this.f5178m = true;
        if (this.o && !isLayoutRequested()) {
            z = true;
        }
        this.o = z;
        t tVar = this.f5174i;
        if (tVar != null) {
            tVar.f14259e = true;
        }
        ThreadLocal threadLocal = RunnableC1262i.f14234e;
        RunnableC1262i runnableC1262i = (RunnableC1262i) threadLocal.get();
        this.f5154S = runnableC1262i;
        if (runnableC1262i == null) {
            RunnableC1262i runnableC1262i2 = new RunnableC1262i();
            runnableC1262i2.f14236a = new ArrayList();
            runnableC1262i2.f14239d = new ArrayList();
            this.f5154S = runnableC1262i2;
            Field field = H.f375a;
            Display display = getDisplay();
            if (!isInEditMode() && display != null) {
                f4 = display.getRefreshRate();
            }
            f4 = 60.0f;
            RunnableC1262i runnableC1262i3 = this.f5154S;
            runnableC1262i3.f14238c = (long) (1.0E9f / f4);
            threadLocal.set(runnableC1262i3);
        }
        this.f5154S.f14236a.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Object obj;
        super.onDetachedFromWindow();
        AbstractC1271r abstractC1271r = this.f5140D;
        if (abstractC1271r != null) {
            abstractC1271r.a();
        }
        setScrollState(0);
        RunnableC1247D runnableC1247D = this.f5153R;
        runnableC1247D.f14176g.removeCallbacks(runnableC1247D);
        runnableC1247D.f14172c.abortAnimation();
        this.f5178m = false;
        t tVar = this.f5174i;
        if (tVar != null) {
            tVar.f14259e = false;
            tVar.z(this);
        }
        this.f5170f0.clear();
        removeCallbacks(this.f5172g0);
        this.f5167e.getClass();
        do {
            P p2 = AbstractC1253J.f14193a;
            Object[] objArr = (Object[]) p2.f519c;
            int i4 = p2.f518b;
            obj = null;
            if (i4 > 0) {
                int i5 = i4 - 1;
                Object obj2 = objArr[i5];
                i.c(obj2, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
                objArr[i5] = null;
                p2.f518b--;
                obj = obj2;
            }
        } while (obj != null);
        RunnableC1262i runnableC1262i = this.f5154S;
        if (runnableC1262i != null) {
            runnableC1262i.f14236a.remove(this);
            this.f5154S = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f5175j;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((C1259f) arrayList.get(i4)).getClass();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f4;
        float f5;
        if (this.f5174i != null && !this.f5180q && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f4 = this.f5174i.c() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f5174i.b()) {
                    f5 = motionEvent.getAxisValue(10);
                    if (f4 == 0.0f || f5 != 0.0f) {
                        q((int) (f5 * this.f5150O), (int) (f4 * this.f5151P), motionEvent);
                    }
                }
                f5 = 0.0f;
                if (f4 == 0.0f) {
                }
                q((int) (f5 * this.f5150O), (int) (f4 * this.f5151P), motionEvent);
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f5174i.c()) {
                        f4 = -axisValue;
                        f5 = 0.0f;
                        if (f4 == 0.0f) {
                        }
                        q((int) (f5 * this.f5150O), (int) (f4 * this.f5151P), motionEvent);
                    } else if (this.f5174i.b()) {
                        f5 = axisValue;
                        f4 = 0.0f;
                        if (f4 == 0.0f) {
                        }
                        q((int) (f5 * this.f5150O), (int) (f4 * this.f5151P), motionEvent);
                    }
                }
                f4 = 0.0f;
                f5 = 0.0f;
                if (f4 == 0.0f) {
                }
                q((int) (f5 * this.f5150O), (int) (f4 * this.f5151P), motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (!this.f5180q) {
            int action = motionEvent.getAction();
            if (action == 3 || action == 0) {
                this.f5177l = null;
            }
            ArrayList arrayList = this.f5176k;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                C1259f c1259f = (C1259f) arrayList.get(i4);
                if (c1259f.c(motionEvent) && action != 3) {
                    this.f5177l = c1259f;
                    p();
                    setScrollState(0);
                    return true;
                }
            }
            t tVar = this.f5174i;
            if (tVar != null) {
                boolean b4 = tVar.b();
                boolean c4 = this.f5174i.c();
                if (this.f5143G == null) {
                    this.f5143G = VelocityTracker.obtain();
                }
                this.f5143G.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.f5181r) {
                        this.f5181r = false;
                    }
                    this.f5142F = motionEvent.getPointerId(0);
                    int x4 = (int) (motionEvent.getX() + 0.5f);
                    this.f5146J = x4;
                    this.f5144H = x4;
                    int y4 = (int) (motionEvent.getY() + 0.5f);
                    this.f5147K = y4;
                    this.f5145I = y4;
                    if (this.f5141E == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                    }
                    int[] iArr = this.f5168e0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i5 = b4;
                    if (c4) {
                        i5 = (b4 ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i5, 0);
                } else if (actionMasked == 1) {
                    this.f5143G.clear();
                    s(0);
                } else if (actionMasked == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f5142F);
                    if (findPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f5142F + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x5 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y5 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.f5141E != 1) {
                        int i6 = x5 - this.f5144H;
                        int i7 = y5 - this.f5145I;
                        if (b4 == 0 || Math.abs(i6) <= this.L) {
                            z = false;
                        } else {
                            this.f5146J = x5;
                            z = true;
                        }
                        if (c4 && Math.abs(i7) > this.L) {
                            this.f5147K = y5;
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
                    this.f5142F = motionEvent.getPointerId(actionIndex);
                    int x6 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.f5146J = x6;
                    this.f5144H = x6;
                    int y6 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.f5147K = y6;
                    this.f5145I = y6;
                } else if (actionMasked == 6) {
                    n(motionEvent);
                }
                if (this.f5141E == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i4, int i5, int i6, int i7) {
        int i8 = e.f5a;
        Trace.beginSection("RV OnLayout");
        Log.e("RecyclerView", "No adapter attached; skipping layout");
        Trace.endSection();
        this.o = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i5) {
        t tVar = this.f5174i;
        if (tVar == null) {
            e(i4, i5);
            return;
        }
        if (tVar.y()) {
            View.MeasureSpec.getMode(i4);
            View.MeasureSpec.getMode(i5);
            this.f5174i.f14256b.e(i4, i5);
        } else {
            if (this.n) {
                this.f5174i.f14256b.e(i4, i5);
                return;
            }
            C1245B c1245b = this.f5156U;
            if (c1245b.f14169e) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            c1245b.getClass();
            this.f5179p++;
            this.f5174i.f14256b.e(i4, i5);
            if (this.f5179p < 1) {
                this.f5179p = 1;
            }
            this.f5179p--;
            c1245b.f14167c = false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i4, Rect rect) {
        if (this.f5185w > 0) {
            return false;
        }
        return super.onRequestFocusInDescendants(i4, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C1244A)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1244A c1244a = (C1244A) parcelable;
        this.f5161b = c1244a;
        super.onRestoreInstanceState(c1244a.f1142a);
        t tVar = this.f5174i;
        if (tVar == null || (parcelable2 = this.f5161b.f14164c) == null) {
            return;
        }
        tVar.B(parcelable2);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C1244A c1244a = new C1244A(super.onSaveInstanceState());
        C1244A c1244a2 = this.f5161b;
        if (c1244a2 != null) {
            c1244a.f14164c = c1244a2.f14164c;
            return c1244a;
        }
        t tVar = this.f5174i;
        if (tVar != null) {
            c1244a.f14164c = tVar.C();
            return c1244a;
        }
        c1244a.f14164c = null;
        return c1244a;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        if (i4 == i6 && i5 == i7) {
            return;
        }
        this.f5139C = null;
        this.f5137A = null;
        this.f5138B = null;
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
        if (!this.f5180q && !this.f5181r) {
            int action = motionEvent.getAction();
            C1259f c1259f = this.f5177l;
            if (c1259f != null) {
                if (action != 0) {
                    int i4 = c1259f.f14209a;
                    if (c1259f.f14223q != 0) {
                        if (motionEvent.getAction() == 0) {
                            boolean b4 = c1259f.b(motionEvent.getX(), motionEvent.getY());
                            boolean a3 = c1259f.a(motionEvent.getX(), motionEvent.getY());
                            if (b4 || a3) {
                                if (a3) {
                                    c1259f.f14224r = 1;
                                    c1259f.f14219k = (int) motionEvent.getX();
                                } else if (b4) {
                                    c1259f.f14224r = 2;
                                    c1259f.f14218j = (int) motionEvent.getY();
                                }
                                c1259f.e(2);
                            }
                        } else if (motionEvent.getAction() == 1 && c1259f.f14223q == 2) {
                            c1259f.f14218j = 0.0f;
                            c1259f.f14219k = 0.0f;
                            c1259f.e(1);
                            c1259f.f14224r = 0;
                        } else if (motionEvent.getAction() == 2 && c1259f.f14223q == 2) {
                            c1259f.f();
                            if (c1259f.f14224r == 1) {
                                float x4 = motionEvent.getX();
                                int[] iArr = c1259f.f14226t;
                                iArr[0] = i4;
                                int i5 = c1259f.f14220l - i4;
                                iArr[1] = i5;
                                float max = Math.max(i4, Math.min(i5, x4));
                                if (Math.abs(0 - max) >= 2.0f) {
                                    float f4 = c1259f.f14219k;
                                    int computeHorizontalScrollRange = c1259f.n.computeHorizontalScrollRange();
                                    c1259f.n.computeHorizontalScrollOffset();
                                    int d4 = C1259f.d(f4, max, iArr, computeHorizontalScrollRange, 0, c1259f.f14220l);
                                    if (d4 != 0) {
                                        c1259f.n.scrollBy(d4, 0);
                                    }
                                    c1259f.f14219k = max;
                                }
                            }
                            if (c1259f.f14224r == 2) {
                                float y4 = motionEvent.getY();
                                int[] iArr2 = c1259f.f14225s;
                                iArr2[0] = i4;
                                int i6 = c1259f.f14221m - i4;
                                iArr2[1] = i6;
                                float max2 = Math.max(i4, Math.min(i6, y4));
                                if (Math.abs(0 - max2) >= 2.0f) {
                                    float f5 = c1259f.f14218j;
                                    int computeVerticalScrollRange = c1259f.n.computeVerticalScrollRange();
                                    c1259f.n.computeVerticalScrollOffset();
                                    int d5 = C1259f.d(f5, max2, iArr2, computeVerticalScrollRange, 0, c1259f.f14221m);
                                    if (d5 != 0) {
                                        c1259f.n.scrollBy(0, d5);
                                    }
                                    c1259f.f14218j = max2;
                                }
                            }
                        }
                    }
                    if (action == 3 || action == 1) {
                        this.f5177l = null;
                    }
                    p();
                    setScrollState(0);
                    return true;
                }
                this.f5177l = null;
            }
            if (action != 0) {
                ArrayList arrayList = this.f5176k;
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    C1259f c1259f2 = (C1259f) arrayList.get(i7);
                    if (c1259f2.c(motionEvent)) {
                        this.f5177l = c1259f2;
                        p();
                        setScrollState(0);
                        return true;
                    }
                }
            }
            t tVar = this.f5174i;
            if (tVar != null) {
                boolean b5 = tVar.b();
                boolean c4 = this.f5174i.c();
                if (this.f5143G == null) {
                    this.f5143G = VelocityTracker.obtain();
                }
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                int[] iArr3 = this.f5168e0;
                if (actionMasked == 0) {
                    iArr3[1] = 0;
                    iArr3[0] = 0;
                }
                obtain.offsetLocation(iArr3[0], iArr3[1]);
                if (actionMasked == 0) {
                    this.f5142F = motionEvent.getPointerId(0);
                    int x5 = (int) (motionEvent.getX() + 0.5f);
                    this.f5146J = x5;
                    this.f5144H = x5;
                    int y5 = (int) (motionEvent.getY() + 0.5f);
                    this.f5147K = y5;
                    this.f5145I = y5;
                    int i8 = b5;
                    if (c4) {
                        i8 = (b5 ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i8, 0);
                } else {
                    if (actionMasked == 1) {
                        this.f5143G.addMovement(obtain);
                        VelocityTracker velocityTracker = this.f5143G;
                        int i9 = this.f5149N;
                        velocityTracker.computeCurrentVelocity(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, i9);
                        float f6 = b5 != 0 ? -this.f5143G.getXVelocity(this.f5142F) : 0.0f;
                        float f7 = c4 ? -this.f5143G.getYVelocity(this.f5142F) : 0.0f;
                        if (f6 != 0.0f || f7 != 0.0f) {
                            int i10 = (int) f6;
                            int i11 = (int) f7;
                            t tVar2 = this.f5174i;
                            if (tVar2 == null) {
                                Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                            } else if (!this.f5180q) {
                                boolean b6 = tVar2.b();
                                boolean c5 = this.f5174i.c();
                                int i12 = this.f5148M;
                                if (b6 == 0 || Math.abs(i10) < i12) {
                                    i10 = 0;
                                }
                                if (!c5 || Math.abs(i11) < i12) {
                                    i11 = 0;
                                }
                                if (i10 != 0 || i11 != 0) {
                                    float f8 = i10;
                                    float f9 = i11;
                                    if (!dispatchNestedPreFling(f8, f9)) {
                                        boolean z4 = b6 != 0 || c5;
                                        dispatchNestedFling(f8, f9, z4);
                                        int i13 = b6;
                                        if (z4) {
                                            if (c5) {
                                                i13 = (b6 ? 1 : 0) | 2;
                                            }
                                            getScrollingChildHelper().g(i13, 1);
                                            int i14 = -i9;
                                            int max3 = Math.max(i14, Math.min(i10, i9));
                                            int max4 = Math.max(i14, Math.min(i11, i9));
                                            RunnableC1247D runnableC1247D = this.f5153R;
                                            runnableC1247D.f14176g.setScrollState(2);
                                            runnableC1247D.f14171b = 0;
                                            runnableC1247D.f14170a = 0;
                                            runnableC1247D.f14172c.fling(0, 0, max3, max4, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                            runnableC1247D.a();
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
                        int findPointerIndex = motionEvent.findPointerIndex(this.f5142F);
                        if (findPointerIndex < 0) {
                            Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f5142F + " not found. Did any MotionEvents get skipped?");
                            return false;
                        }
                        int x6 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                        int y6 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                        int i15 = this.f5146J - x6;
                        int i16 = this.f5147K - y6;
                        boolean f10 = f(i15, i16, 0, this.f5166d0, this.f5164c0);
                        int[] iArr4 = this.f5164c0;
                        if (f10) {
                            int[] iArr5 = this.f5166d0;
                            i15 -= iArr5[0];
                            i16 -= iArr5[1];
                            obtain.offsetLocation(iArr4[0], iArr4[1]);
                            iArr3[0] = iArr3[0] + iArr4[0];
                            iArr3[1] = iArr3[1] + iArr4[1];
                        }
                        if (this.f5141E != 1) {
                            if (b5 != 0) {
                                int abs = Math.abs(i15);
                                int i17 = this.L;
                                if (abs > i17) {
                                    i15 = i15 > 0 ? i15 - i17 : i15 + i17;
                                    z = true;
                                    if (c4) {
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
                            if (c4) {
                            }
                            if (z) {
                            }
                        }
                        if (this.f5141E == 1) {
                            this.f5146J = x6 - iArr4[0];
                            this.f5147K = y6 - iArr4[1];
                            q(b5 != 0 ? i15 : 0, c4 ? i16 : 0, obtain);
                            RunnableC1262i runnableC1262i = this.f5154S;
                            if (runnableC1262i != null && (i15 != 0 || i16 != 0)) {
                                runnableC1262i.a(this, i15, i16);
                            }
                        }
                    } else if (actionMasked == 3) {
                        p();
                        setScrollState(0);
                    } else if (actionMasked == 5) {
                        this.f5142F = motionEvent.getPointerId(actionIndex);
                        int x7 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.f5146J = x7;
                        this.f5144H = x7;
                        int y7 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        this.f5147K = y7;
                        this.f5145I = y7;
                    } else if (actionMasked == 6) {
                        n(motionEvent);
                    }
                }
                this.f5143G.addMovement(obtain);
                obtain.recycle();
                return true;
            }
        }
        return false;
    }

    public final void p() {
        VelocityTracker velocityTracker = this.f5143G;
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
        EdgeEffect edgeEffect2 = this.f5137A;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.f5137A.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f5138B;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.f5138B.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f5139C;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.f5139C.isFinished();
        }
        if (z) {
            Field field = H.f375a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(int i4, int i5, MotionEvent motionEvent) {
        d();
        if (!this.f5175j.isEmpty()) {
            invalidate();
        }
        int[] iArr = this.f5164c0;
        boolean z = false;
        boolean z4 = true;
        if (g(iArr, 0)) {
            int i6 = this.f5146J;
            int i7 = iArr[0];
            this.f5146J = i6 - i7;
            int i8 = this.f5147K;
            int i9 = iArr[1];
            this.f5147K = i8 - i9;
            if (motionEvent != null) {
                motionEvent.offsetLocation(i7, i9);
            }
            int[] iArr2 = this.f5168e0;
            iArr2[0] = iArr2[0] + iArr[0];
            iArr2[1] = iArr2[1] + iArr[1];
        } else if (getOverScrollMode() != 2) {
            if (motionEvent != null && (motionEvent.getSource() & 8194) != 8194) {
                float x4 = motionEvent.getX();
                float f4 = 0;
                float y4 = motionEvent.getY();
                if (f4 < 0.0f) {
                    if (this.z == null) {
                        this.f5187y.getClass();
                        EdgeEffect edgeEffect = new EdgeEffect(getContext());
                        this.z = edgeEffect;
                        if (this.f5169f) {
                            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                        } else {
                            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
                        }
                    }
                    H.c.a(this.z, (-f4) / getWidth(), 1.0f - (y4 / getHeight()));
                } else {
                    if (f4 > 0.0f) {
                        if (this.f5138B == null) {
                            this.f5187y.getClass();
                            EdgeEffect edgeEffect2 = new EdgeEffect(getContext());
                            this.f5138B = edgeEffect2;
                            if (this.f5169f) {
                                edgeEffect2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                            } else {
                                edgeEffect2.setSize(getMeasuredHeight(), getMeasuredWidth());
                            }
                        }
                        H.c.a(this.f5138B, f4 / getWidth(), y4 / getHeight());
                    }
                    if (f4 >= 0.0f) {
                        if (this.f5137A == null) {
                            this.f5187y.getClass();
                            EdgeEffect edgeEffect3 = new EdgeEffect(getContext());
                            this.f5137A = edgeEffect3;
                            if (this.f5169f) {
                                edgeEffect3.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
                            } else {
                                edgeEffect3.setSize(getMeasuredWidth(), getMeasuredHeight());
                            }
                        }
                        H.c.a(this.f5137A, (-f4) / getHeight(), x4 / getWidth());
                    } else if (f4 > 0.0f) {
                        if (this.f5139C == null) {
                            this.f5187y.getClass();
                            EdgeEffect edgeEffect4 = new EdgeEffect(getContext());
                            this.f5139C = edgeEffect4;
                            if (this.f5169f) {
                                edgeEffect4.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
                            } else {
                                edgeEffect4.setSize(getMeasuredWidth(), getMeasuredHeight());
                            }
                        }
                        H.c.a(this.f5139C, f4 / getHeight(), 1.0f - (x4 / getWidth()));
                    } else {
                        z4 = z;
                    }
                    if (!z4 || f4 != 0.0f || f4 != 0.0f) {
                        Field field = H.f375a;
                        postInvalidateOnAnimation();
                    }
                }
                z = true;
                if (f4 >= 0.0f) {
                }
                if (!z4) {
                }
                Field field2 = H.f375a;
                postInvalidateOnAnimation();
            }
            c(i4, i5);
        }
        if (awakenScrollBars()) {
            return;
        }
        invalidate();
    }

    public final void r(int i4, int i5) {
        int i6;
        t tVar = this.f5174i;
        if (tVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f5180q) {
            return;
        }
        int i7 = !tVar.b() ? 0 : i4;
        int i8 = !this.f5174i.c() ? 0 : i5;
        if (i7 == 0 && i8 == 0) {
            return;
        }
        RunnableC1247D runnableC1247D = this.f5153R;
        RecyclerView recyclerView = runnableC1247D.f14176g;
        int abs = Math.abs(i7);
        int abs2 = Math.abs(i8);
        boolean z = abs > abs2;
        int sqrt = (int) Math.sqrt(0);
        int sqrt2 = (int) Math.sqrt((i8 * i8) + (i7 * i7));
        int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
        int i9 = width / 2;
        float f4 = width;
        float f5 = i9;
        float sin = (((float) Math.sin((Math.min(1.0f, (sqrt2 * 1.0f) / f4) - 0.5f) * 0.47123894f)) * f5) + f5;
        if (sqrt > 0) {
            i6 = Math.round(Math.abs(sin / sqrt) * 1000.0f) * 4;
        } else {
            if (!z) {
                abs = abs2;
            }
            i6 = (int) (((abs / f4) + 1.0f) * 300.0f);
        }
        int min = Math.min(i6, 2000);
        Interpolator interpolator = runnableC1247D.f14173d;
        InterpolatorC1267n interpolatorC1267n = f5136k0;
        if (interpolator != interpolatorC1267n) {
            runnableC1247D.f14173d = interpolatorC1267n;
            runnableC1247D.f14172c = new OverScroller(recyclerView.getContext(), interpolatorC1267n);
        }
        recyclerView.setScrollState(2);
        runnableC1247D.f14171b = 0;
        runnableC1247D.f14170a = 0;
        runnableC1247D.f14172c.startScroll(0, 0, i7, i8, min);
        runnableC1247D.a();
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
        this.f5174i.getClass();
        if (this.f5185w <= 0 && view2 != null) {
            o(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f5174i.G(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.f5176k;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((C1259f) arrayList.get(i4)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f5179p != 0 || this.f5180q) {
            return;
        }
        super.requestLayout();
    }

    public final void s(int i4) {
        getScrollingChildHelper().h(i4);
    }

    @Override // android.view.View
    public final void scrollBy(int i4, int i5) {
        t tVar = this.f5174i;
        if (tVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f5180q) {
            return;
        }
        boolean b4 = tVar.b();
        boolean c4 = this.f5174i.c();
        if (b4 || c4) {
            if (!b4) {
                i4 = 0;
            }
            if (!c4) {
                i5 = 0;
            }
            q(i4, i5, null);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i4, int i5) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (this.f5185w <= 0) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.f5182s |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(C1249F c1249f) {
        this.f5160a0 = c1249f;
        H.a(this, c1249f);
    }

    public void setAdapter(AbstractC1268o abstractC1268o) {
        setLayoutFrozen(false);
        AbstractC1271r abstractC1271r = this.f5140D;
        if (abstractC1271r != null) {
            abstractC1271r.a();
        }
        t tVar = this.f5174i;
        F f4 = this.f5159a;
        if (tVar != null) {
            tVar.E();
            this.f5174i.F(f4);
        }
        ((ArrayList) f4.f5439c).clear();
        ArrayList arrayList = (ArrayList) f4.f5440d;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            throw AbstractC0005f.g(size, arrayList);
        }
        arrayList.clear();
        c cVar = ((RecyclerView) f4.f5442f).f5155T;
        cVar.getClass();
        cVar.f11c = 0;
        j jVar = this.f5163c;
        jVar.y((ArrayList) jVar.f202c);
        jVar.y((ArrayList) jVar.f203d);
        ArrayList arrayList2 = (ArrayList) f4.f5439c;
        RecyclerView recyclerView = (RecyclerView) f4.f5442f;
        ArrayList arrayList3 = (ArrayList) f4.f5440d;
        arrayList2.clear();
        int size2 = arrayList3.size() - 1;
        if (size2 >= 0) {
            throw AbstractC0005f.g(size2, arrayList3);
        }
        arrayList3.clear();
        c cVar2 = recyclerView.f5155T;
        cVar2.getClass();
        cVar2.f11c = 0;
        if (((y) f4.f5441e) == null) {
            y yVar = new y();
            yVar.f14264a = new SparseArray();
            yVar.f14265b = 0;
            f4.f5441e = yVar;
        }
        y yVar2 = (y) f4.f5441e;
        if (yVar2.f14265b == 0) {
            SparseArray sparseArray = yVar2.f14264a;
            if (sparseArray.size() > 0) {
                ((x) sparseArray.valueAt(0)).getClass();
                throw null;
            }
        }
        this.f5156U.f14166b = true;
        this.v = this.v;
        this.f5184u = true;
        int r4 = this.f5165d.r();
        for (int i4 = 0; i4 < r4; i4++) {
            j(this.f5165d.q(i4));
        }
        m();
        int size3 = arrayList3.size();
        for (int i5 = 0; i5 < size3; i5++) {
            if (arrayList3.get(i5) != null) {
                throw new ClassCastException();
            }
        }
        int size4 = arrayList3.size() - 1;
        if (size4 >= 0) {
            throw AbstractC0005f.g(size4, arrayList3);
        }
        arrayList3.clear();
        c cVar3 = recyclerView.f5155T;
        cVar3.getClass();
        cVar3.f11c = 0;
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC1269p interfaceC1269p) {
        if (interfaceC1269p == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.f5169f) {
            this.f5139C = null;
            this.f5137A = null;
            this.f5138B = null;
            this.z = null;
        }
        this.f5169f = z;
        super.setClipToPadding(z);
        if (this.o) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C1270q c1270q) {
        c1270q.getClass();
        this.f5187y = c1270q;
        this.f5139C = null;
        this.f5137A = null;
        this.f5138B = null;
        this.z = null;
    }

    public void setHasFixedSize(boolean z) {
        this.n = z;
    }

    public void setItemAnimator(AbstractC1271r abstractC1271r) {
        AbstractC1271r abstractC1271r2 = this.f5140D;
        if (abstractC1271r2 != null) {
            abstractC1271r2.a();
            this.f5140D.f14249a = null;
        }
        this.f5140D = abstractC1271r;
        if (abstractC1271r != null) {
            abstractC1271r.f14249a = this.f5158W;
        }
    }

    public void setItemViewCacheSize(int i4) {
        F f4 = this.f5159a;
        f4.f5437a = i4;
        f4.c();
    }

    public void setLayoutFrozen(boolean z) {
        if (z != this.f5180q) {
            b("Do not setLayoutFrozen in layout or scroll");
            if (!z) {
                this.f5180q = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f5180q = true;
            this.f5181r = true;
            setScrollState(0);
            RunnableC1247D runnableC1247D = this.f5153R;
            runnableC1247D.f14176g.removeCallbacks(runnableC1247D);
            runnableC1247D.f14172c.abortAnimation();
        }
    }

    public void setLayoutManager(t tVar) {
        if (tVar == this.f5174i) {
            return;
        }
        setScrollState(0);
        RunnableC1247D runnableC1247D = this.f5153R;
        runnableC1247D.f14176g.removeCallbacks(runnableC1247D);
        runnableC1247D.f14172c.abortAnimation();
        t tVar2 = this.f5174i;
        F f4 = this.f5159a;
        if (tVar2 != null) {
            AbstractC1271r abstractC1271r = this.f5140D;
            if (abstractC1271r != null) {
                abstractC1271r.a();
            }
            this.f5174i.E();
            this.f5174i.F(f4);
            ((ArrayList) f4.f5439c).clear();
            ArrayList arrayList = (ArrayList) f4.f5440d;
            int size = arrayList.size() - 1;
            if (size >= 0) {
                throw AbstractC0005f.g(size, arrayList);
            }
            arrayList.clear();
            c cVar = ((RecyclerView) f4.f5442f).f5155T;
            cVar.getClass();
            cVar.f11c = 0;
            if (this.f5178m) {
                t tVar3 = this.f5174i;
                tVar3.f14259e = false;
                tVar3.z(this);
            }
            this.f5174i.I(null);
            this.f5174i = null;
        } else {
            ((ArrayList) f4.f5439c).clear();
            ArrayList arrayList2 = (ArrayList) f4.f5440d;
            int size2 = arrayList2.size() - 1;
            if (size2 >= 0) {
                throw AbstractC0005f.g(size2, arrayList2);
            }
            arrayList2.clear();
            c cVar2 = ((RecyclerView) f4.f5442f).f5155T;
            cVar2.getClass();
            cVar2.f11c = 0;
        }
        j jVar = this.f5165d;
        e0.t tVar4 = (e0.t) jVar.f201b;
        ((G0.c) jVar.f202c).I();
        ArrayList arrayList3 = (ArrayList) jVar.f203d;
        for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
            j((View) arrayList3.get(size3));
            arrayList3.remove(size3);
        }
        RecyclerView recyclerView = (RecyclerView) tVar4.f8416a;
        int childCount = recyclerView.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = recyclerView.getChildAt(i4);
            j(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f5174i = tVar;
        if (tVar != null) {
            if (tVar.f14256b != null) {
                throw new IllegalArgumentException("LayoutManager " + tVar + " is already attached to a RecyclerView:" + tVar.f14256b.h());
            }
            tVar.I(this);
            if (this.f5178m) {
                this.f5174i.f14259e = true;
            }
        }
        f4.c();
        requestLayout();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        C0014o scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f434d) {
            ViewGroup viewGroup = scrollingChildHelper.f433c;
            Field field = H.f375a;
            A.g(viewGroup);
        }
        scrollingChildHelper.f434d = z;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.f5152Q = z;
    }

    public void setRecycledViewPool(y yVar) {
        F f4 = this.f5159a;
        if (((y) f4.f5441e) != null) {
            r1.f14265b--;
        }
        f4.f5441e = yVar;
        if (yVar != null) {
            ((RecyclerView) f4.f5442f).getAdapter();
        }
    }

    public void setScrollState(int i4) {
        if (i4 == this.f5141E) {
            return;
        }
        this.f5141E = i4;
        if (i4 != 2) {
            RunnableC1247D runnableC1247D = this.f5153R;
            runnableC1247D.f14176g.removeCallbacks(runnableC1247D);
            runnableC1247D.f14172c.abortAnimation();
        }
        t tVar = this.f5174i;
        if (tVar != null) {
            tVar.D(i4);
        }
        ArrayList arrayList = this.f5157V;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((w) this.f5157V.get(size)).getClass();
            }
        }
    }

    public void setScrollingTouchSlop(int i4) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i4 != 0) {
            if (i4 == 1) {
                this.L = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i4 + "; using default value");
        }
        this.L = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(AbstractC1246C abstractC1246C) {
        this.f5159a.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i4) {
        return getScrollingChildHelper().g(i4, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        t tVar = this.f5174i;
        if (tVar != null) {
            return tVar.n(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + h());
    }

    public void setOnFlingListener(v vVar) {
    }

    @Deprecated
    public void setOnScrollListener(w wVar) {
    }

    public void setRecyclerListener(z zVar) {
    }
}
