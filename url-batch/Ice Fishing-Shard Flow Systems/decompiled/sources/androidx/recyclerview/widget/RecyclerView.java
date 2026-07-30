package androidx.recyclerview.widget;

import C4.p;
import D0.j;
import D6.n;
import F.b;
import I.C0121q;
import I.M;
import I.T;
import I.U;
import O.a;
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
import c2.e;
import g0.AbstractC0410C;
import g0.AbstractC0420M;
import g0.AbstractC0436p;
import g0.AbstractC0439s;
import g0.AbstractC0440t;
import g0.AbstractC0442v;
import g0.AbstractC0443w;
import g0.AbstractC0444x;
import g0.C0408A;
import g0.C0409B;
import g0.C0413F;
import g0.C0422b;
import g0.C0426f;
import g0.C0428h;
import g0.C0438r;
import g0.C0441u;
import g0.C0445y;
import g0.InterfaceC0437q;
import g0.InterfaceC0446z;
import g0.RunnableC0411D;
import g0.RunnableC0430j;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import l2.c;
import q1.h;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* renamed from: p0, reason: collision with root package name */
    public static final int[] f3952p0 = {R.attr.nestedScrollingEnabled};

    /* renamed from: q0, reason: collision with root package name */
    public static final int[] f3953q0 = {R.attr.clipToPadding};
    public static final Class[] r0;

    /* renamed from: s0, reason: collision with root package name */
    public static final a f3954s0;

    /* renamed from: A, reason: collision with root package name */
    public int f3955A;

    /* renamed from: B, reason: collision with root package name */
    public final AccessibilityManager f3956B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f3957C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f3958D;

    /* renamed from: E, reason: collision with root package name */
    public int f3959E;

    /* renamed from: F, reason: collision with root package name */
    public final int f3960F;

    /* renamed from: G, reason: collision with root package name */
    public C0438r f3961G;

    /* renamed from: H, reason: collision with root package name */
    public EdgeEffect f3962H;

    /* renamed from: I, reason: collision with root package name */
    public EdgeEffect f3963I;

    /* renamed from: J, reason: collision with root package name */
    public EdgeEffect f3964J;

    /* renamed from: K, reason: collision with root package name */
    public EdgeEffect f3965K;

    /* renamed from: L, reason: collision with root package name */
    public AbstractC0439s f3966L;

    /* renamed from: M, reason: collision with root package name */
    public int f3967M;

    /* renamed from: N, reason: collision with root package name */
    public int f3968N;

    /* renamed from: O, reason: collision with root package name */
    public VelocityTracker f3969O;

    /* renamed from: P, reason: collision with root package name */
    public int f3970P;
    public int Q;

    /* renamed from: R, reason: collision with root package name */
    public int f3971R;

    /* renamed from: S, reason: collision with root package name */
    public int f3972S;

    /* renamed from: T, reason: collision with root package name */
    public int f3973T;

    /* renamed from: U, reason: collision with root package name */
    public final int f3974U;

    /* renamed from: V, reason: collision with root package name */
    public final int f3975V;

    /* renamed from: W, reason: collision with root package name */
    public final float f3976W;

    /* renamed from: a0, reason: collision with root package name */
    public final float f3977a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f3978b0;

    /* renamed from: c0, reason: collision with root package name */
    public final RunnableC0411D f3979c0;

    /* renamed from: d, reason: collision with root package name */
    public final n f3980d;

    /* renamed from: d0, reason: collision with root package name */
    public RunnableC0430j f3981d0;

    /* renamed from: e, reason: collision with root package name */
    public C0408A f3982e;

    /* renamed from: e0, reason: collision with root package name */
    public final C0428h f3983e0;

    /* renamed from: f0, reason: collision with root package name */
    public final C0409B f3984f0;

    /* renamed from: g0, reason: collision with root package name */
    public ArrayList f3985g0;

    /* renamed from: h0, reason: collision with root package name */
    public final h f3986h0;

    /* renamed from: i, reason: collision with root package name */
    public final j f3987i;

    /* renamed from: i0, reason: collision with root package name */
    public C0413F f3988i0;

    /* renamed from: j0, reason: collision with root package name */
    public C0121q f3989j0;

    /* renamed from: k0, reason: collision with root package name */
    public final int[] f3990k0;

    /* renamed from: l, reason: collision with root package name */
    public final j f3991l;

    /* renamed from: l0, reason: collision with root package name */
    public final int[] f3992l0;

    /* renamed from: m, reason: collision with root package name */
    public final h f3993m;

    /* renamed from: m0, reason: collision with root package name */
    public final int[] f3994m0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3995n;

    /* renamed from: n0, reason: collision with root package name */
    public final ArrayList f3996n0;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f3997o;

    /* renamed from: o0, reason: collision with root package name */
    public final b f3998o0;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f3999p;

    /* renamed from: q, reason: collision with root package name */
    public AbstractC0440t f4000q;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f4001r;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f4002s;

    /* renamed from: t, reason: collision with root package name */
    public C0426f f4003t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f4004u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f4005v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f4006w;

    /* renamed from: x, reason: collision with root package name */
    public int f4007x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f4008y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f4009z;

    static {
        Class cls = Integer.TYPE;
        r0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f3954s0 = new a(1);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        float a7;
        Constructor constructor;
        this.f3980d = new n(this);
        this.f3993m = new h();
        this.f3997o = new Rect();
        this.f3999p = new Rect();
        new RectF();
        this.f4001r = new ArrayList();
        this.f4002s = new ArrayList();
        this.f4007x = 0;
        this.f3957C = false;
        this.f3958D = false;
        this.f3959E = 0;
        this.f3960F = 0;
        this.f3961G = new C0438r();
        C0422b c0422b = new C0422b();
        Object[] objArr = null;
        c0422b.f4958a = null;
        c0422b.f4959b = new ArrayList();
        c0422b.f4960c = 250L;
        c0422b.f4961d = 250L;
        c0422b.f4894e = new ArrayList();
        c0422b.f4895f = new ArrayList();
        c0422b.f4896g = new ArrayList();
        c0422b.f4897h = new ArrayList();
        c0422b.f4898i = new ArrayList();
        c0422b.j = new ArrayList();
        c0422b.f4899k = new ArrayList();
        c0422b.f4900l = new ArrayList();
        c0422b.f4901m = new ArrayList();
        c0422b.f4902n = new ArrayList();
        c0422b.f4903o = new ArrayList();
        this.f3966L = c0422b;
        this.f3967M = 0;
        this.f3968N = -1;
        this.f3976W = Float.MIN_VALUE;
        this.f3977a0 = Float.MIN_VALUE;
        boolean z7 = true;
        this.f3978b0 = true;
        this.f3979c0 = new RunnableC0411D(this);
        this.f3983e0 = new C0428h();
        C0409B c0409b = new C0409B();
        c0409b.f4855a = 0;
        c0409b.f4856b = false;
        c0409b.f4857c = false;
        c0409b.f4858d = false;
        c0409b.f4859e = false;
        this.f3984f0 = c0409b;
        h hVar = new h(18);
        this.f3986h0 = hVar;
        this.f3990k0 = new int[2];
        this.f3992l0 = new int[2];
        this.f3994m0 = new int[2];
        this.f3996n0 = new ArrayList();
        this.f3998o0 = new b(13, this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3953q0, 0, 0);
            this.f3995n = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.f3995n = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f3973T = viewConfiguration.getScaledTouchSlop();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            Method method = U.f1158a;
            a7 = C.a.c(viewConfiguration);
        } else {
            a7 = U.a(viewConfiguration, context);
        }
        this.f3976W = a7;
        this.f3977a0 = i2 >= 26 ? C.a.d(viewConfiguration) : U.a(viewConfiguration, context);
        this.f3974U = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3975V = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f3966L.f4958a = hVar;
        this.f3987i = new j(new e(this));
        this.f3991l = new j(new c(this), (byte) 0);
        WeakHashMap weakHashMap = T.f1153a;
        if ((i2 >= 26 ? M.a(this) : 0) == 0 && i2 >= 26) {
            M.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f3956B = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C0413F(this));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f0.a.f4762a, 0, 0);
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
                new C0426f(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.icefishing.icefish.ice.fishing.s294s.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.icefishing.icefish.ice.fishing.s294s.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.icefishing.icefish.ice.fishing.s294s.R.dimen.fastscroll_margin));
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
                        Class<? extends U> asSubclass = (isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).loadClass(str).asSubclass(AbstractC0440t.class);
                        try {
                            constructor = asSubclass.getConstructor(r0);
                            objArr = new Object[]{context, attributeSet, 0, 0};
                        } catch (NoSuchMethodException e7) {
                            try {
                                constructor = asSubclass.getConstructor(null);
                            } catch (NoSuchMethodException e8) {
                                e8.initCause(e7);
                                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e8);
                            }
                        }
                        constructor.setAccessible(true);
                        setLayoutManager((AbstractC0440t) constructor.newInstance(objArr));
                    } catch (ClassCastException e9) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e9);
                    } catch (ClassNotFoundException e10) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e10);
                    } catch (IllegalAccessException e11) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e11);
                    } catch (InstantiationException e12) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e12);
                    } catch (InvocationTargetException e13) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e13);
                    }
                }
            }
            TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f3952p0, 0, 0);
            z7 = obtainStyledAttributes3.getBoolean(0, true);
            obtainStyledAttributes3.recycle();
        } else {
            setDescendantFocusability(262144);
        }
        setNestedScrollingEnabled(z7);
    }

    private C0121q getScrollingChildHelper() {
        if (this.f3989j0 == null) {
            this.f3989j0 = new C0121q(this);
        }
        return this.f3989j0;
    }

    public static void j(View view) {
        if (view == null) {
            return;
        }
        ((C0441u) view.getLayoutParams()).getClass();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i2, int i5) {
        AbstractC0440t abstractC0440t = this.f4000q;
        if (abstractC0440t != null) {
            abstractC0440t.getClass();
        }
        super.addFocusables(arrayList, i2, i5);
    }

    public final void b(String str) {
        if (this.f3959E > 0) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + h());
        }
        if (this.f3960F > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + h()));
        }
    }

    public final void c(int i2, int i5) {
        boolean z7;
        EdgeEffect edgeEffect = this.f3962H;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            z7 = false;
        } else {
            this.f3962H.onRelease();
            z7 = this.f3962H.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f3964J;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.f3964J.onRelease();
            z7 |= this.f3964J.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f3963I;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i5 > 0) {
            this.f3963I.onRelease();
            z7 |= this.f3963I.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f3965K;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i5 < 0) {
            this.f3965K.onRelease();
            z7 |= this.f3965K.isFinished();
        }
        if (z7) {
            WeakHashMap weakHashMap = T.f1153a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0441u) && this.f4000q.d((C0441u) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        AbstractC0440t abstractC0440t = this.f4000q;
        if (abstractC0440t != null && abstractC0440t.b()) {
            return this.f4000q.f(this.f3984f0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        AbstractC0440t abstractC0440t = this.f4000q;
        if (abstractC0440t != null && abstractC0440t.b()) {
            this.f4000q.g(this.f3984f0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        AbstractC0440t abstractC0440t = this.f4000q;
        if (abstractC0440t != null && abstractC0440t.b()) {
            return this.f4000q.h(this.f3984f0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        AbstractC0440t abstractC0440t = this.f4000q;
        if (abstractC0440t != null && abstractC0440t.c()) {
            return this.f4000q.i(this.f3984f0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        AbstractC0440t abstractC0440t = this.f4000q;
        if (abstractC0440t != null && abstractC0440t.c()) {
            this.f4000q.j(this.f3984f0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        AbstractC0440t abstractC0440t = this.f4000q;
        if (abstractC0440t != null && abstractC0440t.c()) {
            return this.f4000q.k(this.f3984f0);
        }
        return 0;
    }

    public final void d() {
        if (!this.f4006w || this.f3957C) {
            int i2 = E.h.f656a;
            Trace.beginSection("RV FullInvalidate");
            Log.e("RecyclerView", "No adapter attached; skipping layout");
            Trace.endSection();
            return;
        }
        j jVar = this.f3987i;
        if (((ArrayList) jVar.f331i).size() > 0) {
            jVar.getClass();
            if (((ArrayList) jVar.f331i).size() > 0) {
                int i5 = E.h.f656a;
                Trace.beginSection("RV FullInvalidate");
                Log.e("RecyclerView", "No adapter attached; skipping layout");
                Trace.endSection();
            }
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f7, float f8, boolean z7) {
        return getScrollingChildHelper().a(f7, f8, z7);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f7, float f8) {
        return getScrollingChildHelper().b(f7, f8);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i2, int i5, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i2, i5, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i2, int i5, int i7, int i8, int[] iArr) {
        return getScrollingChildHelper().d(i2, i5, i7, i8, iArr, 0, null);
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
        boolean z7;
        super.draw(canvas);
        ArrayList arrayList = this.f4001r;
        int size = arrayList.size();
        boolean z8 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            C0426f c0426f = (C0426f) arrayList.get(i2);
            if (c0426f.f4919l != c0426f.f4921n.getWidth() || c0426f.f4920m != c0426f.f4921n.getHeight()) {
                c0426f.f4919l = c0426f.f4921n.getWidth();
                c0426f.f4920m = c0426f.f4921n.getHeight();
                c0426f.e(0);
            } else if (c0426f.f4929v != 0) {
                if (c0426f.f4922o) {
                    int i5 = c0426f.f4919l;
                    int i7 = c0426f.f4912d;
                    int i8 = i5 - i7;
                    int i9 = 0 - (0 / 2);
                    StateListDrawable stateListDrawable = c0426f.f4910b;
                    stateListDrawable.setBounds(0, 0, i7, 0);
                    Drawable drawable = c0426f.f4911c;
                    drawable.setBounds(0, 0, c0426f.f4913e, c0426f.f4920m);
                    RecyclerView recyclerView = c0426f.f4921n;
                    WeakHashMap weakHashMap = T.f1153a;
                    if (recyclerView.getLayoutDirection() == 1) {
                        drawable.draw(canvas);
                        canvas.translate(i7, i9);
                        canvas.scale(-1.0f, 1.0f);
                        stateListDrawable.draw(canvas);
                        canvas.scale(1.0f, 1.0f);
                        canvas.translate(-i7, -i9);
                    } else {
                        canvas.translate(i8, 0.0f);
                        drawable.draw(canvas);
                        canvas.translate(0.0f, i9);
                        stateListDrawable.draw(canvas);
                        canvas.translate(-i8, -i9);
                    }
                }
                if (c0426f.f4923p) {
                    int i10 = c0426f.f4920m;
                    int i11 = c0426f.f4916h;
                    int i12 = i10 - i11;
                    StateListDrawable stateListDrawable2 = c0426f.f4914f;
                    stateListDrawable2.setBounds(0, 0, 0, i11);
                    Drawable drawable2 = c0426f.f4915g;
                    drawable2.setBounds(0, 0, c0426f.f4919l, c0426f.f4917i);
                    canvas.translate(0.0f, i12);
                    drawable2.draw(canvas);
                    canvas.translate(0 - (0 / 2), 0.0f);
                    stateListDrawable2.draw(canvas);
                    canvas.translate(-r8, -i12);
                }
            }
            i2++;
        }
        EdgeEffect edgeEffect = this.f3962H;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z7 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f3995n ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f3962H;
            z7 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f3963I;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f3995n) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f3963I;
            z7 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f3964J;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f3995n ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f3964J;
            z7 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f3965K;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f3995n) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f3965K;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z8 = true;
            }
            z7 |= z8;
            canvas.restoreToCount(save4);
        }
        if ((z7 || this.f3966L == null || arrayList.size() <= 0 || !this.f3966L.b()) ? z7 : true) {
            WeakHashMap weakHashMap2 = T.f1153a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final void e(int i2, int i5) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = T.f1153a;
        setMeasuredDimension(AbstractC0440t.e(i2, paddingRight, getMinimumWidth()), AbstractC0440t.e(i5, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final boolean f(int i2, int i5, int[] iArr, int[] iArr2, int i7) {
        return getScrollingChildHelper().c(i2, i5, iArr, iArr2, i7);
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
        int i5;
        this.f4000q.getClass();
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
                Rect rect = this.f3997o;
                char c7 = 0;
                rect.set(0, 0, width, height);
                int width2 = findNextFocus.getWidth();
                int height2 = findNextFocus.getHeight();
                Rect rect2 = this.f3999p;
                rect2.set(0, 0, width2, height2);
                offsetDescendantRectToMyCoords(view, rect);
                offsetDescendantRectToMyCoords(findNextFocus, rect2);
                RecyclerView recyclerView = this.f4000q.f4963b;
                WeakHashMap weakHashMap = T.f1153a;
                int i7 = recyclerView.getLayoutDirection() == 1 ? -1 : 1;
                int i8 = rect.left;
                int i9 = rect2.left;
                if ((i8 < i9 || rect.right <= i9) && rect.right < rect2.right) {
                    i5 = 1;
                } else {
                    int i10 = rect.right;
                    int i11 = rect2.right;
                    i5 = ((i10 > i11 || i8 >= i11) && i8 > i9) ? -1 : 0;
                }
                int i12 = rect.top;
                int i13 = rect2.top;
                if ((i12 < i13 || rect.bottom <= i13) && rect.bottom < rect2.bottom) {
                    c7 = 1;
                } else {
                    int i14 = rect.bottom;
                    int i15 = rect2.bottom;
                    if ((i14 > i15 || i12 >= i15) && i12 > i13) {
                        c7 = 65535;
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
                    } else if (c7 <= 0) {
                        if (c7 == 0) {
                        }
                    }
                } else if (c7 >= 0) {
                    if (c7 == 0) {
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
        AbstractC0440t abstractC0440t = this.f4000q;
        if (abstractC0440t != null) {
            return abstractC0440t.l();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + h());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC0440t abstractC0440t = this.f4000q;
        if (abstractC0440t != null) {
            return abstractC0440t.m(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + h());
    }

    public AbstractC0436p getAdapter() {
        return null;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC0440t abstractC0440t = this.f4000q;
        if (abstractC0440t == null) {
            return super.getBaseline();
        }
        abstractC0440t.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i2, int i5) {
        return super.getChildDrawingOrder(i2, i5);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f3995n;
    }

    public C0413F getCompatAccessibilityDelegate() {
        return this.f3988i0;
    }

    public C0438r getEdgeEffectFactory() {
        return this.f3961G;
    }

    public AbstractC0439s getItemAnimator() {
        return this.f3966L;
    }

    public int getItemDecorationCount() {
        return this.f4001r.size();
    }

    public AbstractC0440t getLayoutManager() {
        return this.f4000q;
    }

    public int getMaxFlingVelocity() {
        return this.f3975V;
    }

    public int getMinFlingVelocity() {
        return this.f3974U;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public AbstractC0442v getOnFlingListener() {
        return null;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f3978b0;
    }

    public C0445y getRecycledViewPool() {
        n nVar = this.f3980d;
        if (((C0445y) nVar.f544m) == null) {
            C0445y c0445y = new C0445y();
            c0445y.f4971a = new SparseArray();
            c0445y.f4972b = 0;
            nVar.f544m = c0445y;
        }
        return (C0445y) nVar.f544m;
    }

    public int getScrollState() {
        return this.f3967M;
    }

    public final String h() {
        return " " + super.toString() + ", adapter:null, layout:" + this.f4000q + ", context:" + getContext();
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
        return this.f4004u;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f1232d;
    }

    public final boolean k() {
        return getScrollingChildHelper().f(1);
    }

    public final boolean l() {
        return !this.f4006w || this.f3957C || ((ArrayList) this.f3987i.f331i).size() > 0;
    }

    public final void m() {
        int N7 = this.f3991l.N();
        for (int i2 = 0; i2 < N7; i2++) {
            ((C0441u) this.f3991l.M(i2).getLayoutParams()).f4970b = true;
        }
        ArrayList arrayList = (ArrayList) this.f3980d.f543l;
        if (arrayList.size() > 0) {
            throw p.f(arrayList, 0);
        }
    }

    public final void n(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3968N) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.f3968N = motionEvent.getPointerId(i2);
            int x7 = (int) (motionEvent.getX(i2) + 0.5f);
            this.f3971R = x7;
            this.f3970P = x7;
            int y7 = (int) (motionEvent.getY(i2) + 0.5f);
            this.f3972S = y7;
            this.Q = y7;
        }
    }

    public final void o(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f3997o;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C0441u) {
            C0441u c0441u = (C0441u) layoutParams;
            if (!c0441u.f4970b) {
                Rect rect2 = c0441u.f4969a;
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
        this.f4000q.G(this, view, this.f3997o, !this.f4006w, view2 == null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r1 >= 30.0f) goto L19;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAttachedToWindow() {
        float f7;
        super.onAttachedToWindow();
        boolean z7 = false;
        this.f3959E = 0;
        this.f4004u = true;
        if (this.f4006w && !isLayoutRequested()) {
            z7 = true;
        }
        this.f4006w = z7;
        AbstractC0440t abstractC0440t = this.f4000q;
        if (abstractC0440t != null) {
            abstractC0440t.f4966e = true;
        }
        ThreadLocal threadLocal = RunnableC0430j.f4939m;
        RunnableC0430j runnableC0430j = (RunnableC0430j) threadLocal.get();
        this.f3981d0 = runnableC0430j;
        if (runnableC0430j == null) {
            RunnableC0430j runnableC0430j2 = new RunnableC0430j();
            runnableC0430j2.f4941d = new ArrayList();
            runnableC0430j2.f4944l = new ArrayList();
            this.f3981d0 = runnableC0430j2;
            WeakHashMap weakHashMap = T.f1153a;
            Display display = getDisplay();
            if (!isInEditMode() && display != null) {
                f7 = display.getRefreshRate();
            }
            f7 = 60.0f;
            RunnableC0430j runnableC0430j3 = this.f3981d0;
            runnableC0430j3.f4943i = (long) (1.0E9f / f7);
            threadLocal.set(runnableC0430j3);
        }
        this.f3981d0.f4941d.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Object obj;
        super.onDetachedFromWindow();
        AbstractC0439s abstractC0439s = this.f3966L;
        if (abstractC0439s != null) {
            abstractC0439s.a();
        }
        setScrollState(0);
        RunnableC0411D runnableC0411D = this.f3979c0;
        runnableC0411D.f4866o.removeCallbacks(runnableC0411D);
        runnableC0411D.f4862i.abortAnimation();
        this.f4004u = false;
        AbstractC0440t abstractC0440t = this.f4000q;
        if (abstractC0440t != null) {
            abstractC0440t.f4966e = false;
            abstractC0440t.z(this);
        }
        this.f3996n0.clear();
        removeCallbacks(this.f3998o0);
        this.f3993m.getClass();
        do {
            B6.p pVar = AbstractC0420M.f4893a;
            Object[] objArr = (Object[]) pVar.f234c;
            int i2 = pVar.f233b;
            obj = null;
            if (i2 > 0) {
                int i5 = i2 - 1;
                Object obj2 = objArr[i5];
                Intrinsics.c(obj2, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
                objArr[i5] = null;
                pVar.f233b--;
                obj = obj2;
            }
        } while (obj != null);
        RunnableC0430j runnableC0430j = this.f3981d0;
        if (runnableC0430j != null) {
            runnableC0430j.f4941d.remove(this);
            this.f3981d0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f4001r;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C0426f) arrayList.get(i2)).getClass();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f7;
        float f8;
        if (this.f4000q != null && !this.f4008y && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f7 = this.f4000q.c() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f4000q.b()) {
                    f8 = motionEvent.getAxisValue(10);
                    if (f7 == 0.0f || f8 != 0.0f) {
                        q((int) (f8 * this.f3976W), (int) (f7 * this.f3977a0), motionEvent);
                    }
                }
                f8 = 0.0f;
                if (f7 == 0.0f) {
                }
                q((int) (f8 * this.f3976W), (int) (f7 * this.f3977a0), motionEvent);
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f4000q.c()) {
                        f7 = -axisValue;
                        f8 = 0.0f;
                        if (f7 == 0.0f) {
                        }
                        q((int) (f8 * this.f3976W), (int) (f7 * this.f3977a0), motionEvent);
                    } else if (this.f4000q.b()) {
                        f8 = axisValue;
                        f7 = 0.0f;
                        if (f7 == 0.0f) {
                        }
                        q((int) (f8 * this.f3976W), (int) (f7 * this.f3977a0), motionEvent);
                    }
                }
                f7 = 0.0f;
                f8 = 0.0f;
                if (f7 == 0.0f) {
                }
                q((int) (f8 * this.f3976W), (int) (f7 * this.f3977a0), motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z7;
        if (!this.f4008y) {
            int action = motionEvent.getAction();
            if (action == 3 || action == 0) {
                this.f4003t = null;
            }
            ArrayList arrayList = this.f4002s;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0426f c0426f = (C0426f) arrayList.get(i2);
                if (c0426f.c(motionEvent) && action != 3) {
                    this.f4003t = c0426f;
                    p();
                    setScrollState(0);
                    return true;
                }
            }
            AbstractC0440t abstractC0440t = this.f4000q;
            if (abstractC0440t != null) {
                boolean b7 = abstractC0440t.b();
                boolean c7 = this.f4000q.c();
                if (this.f3969O == null) {
                    this.f3969O = VelocityTracker.obtain();
                }
                this.f3969O.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.f4009z) {
                        this.f4009z = false;
                    }
                    this.f3968N = motionEvent.getPointerId(0);
                    int x7 = (int) (motionEvent.getX() + 0.5f);
                    this.f3971R = x7;
                    this.f3970P = x7;
                    int y7 = (int) (motionEvent.getY() + 0.5f);
                    this.f3972S = y7;
                    this.Q = y7;
                    if (this.f3967M == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                    }
                    int[] iArr = this.f3994m0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i5 = b7;
                    if (c7) {
                        i5 = (b7 ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i5, 0);
                } else if (actionMasked == 1) {
                    this.f3969O.clear();
                    s(0);
                } else if (actionMasked == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f3968N);
                    if (findPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f3968N + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x8 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y8 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.f3967M != 1) {
                        int i7 = x8 - this.f3970P;
                        int i8 = y8 - this.Q;
                        if (b7 == 0 || Math.abs(i7) <= this.f3973T) {
                            z7 = false;
                        } else {
                            this.f3971R = x8;
                            z7 = true;
                        }
                        if (c7 && Math.abs(i8) > this.f3973T) {
                            this.f3972S = y8;
                            z7 = true;
                        }
                        if (z7) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    p();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.f3968N = motionEvent.getPointerId(actionIndex);
                    int x9 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.f3971R = x9;
                    this.f3970P = x9;
                    int y9 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.f3972S = y9;
                    this.Q = y9;
                } else if (actionMasked == 6) {
                    n(motionEvent);
                }
                if (this.f3967M == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i2, int i5, int i7, int i8) {
        int i9 = E.h.f656a;
        Trace.beginSection("RV OnLayout");
        Log.e("RecyclerView", "No adapter attached; skipping layout");
        Trace.endSection();
        this.f4006w = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i5) {
        AbstractC0440t abstractC0440t = this.f4000q;
        if (abstractC0440t == null) {
            e(i2, i5);
            return;
        }
        if (abstractC0440t.y()) {
            View.MeasureSpec.getMode(i2);
            View.MeasureSpec.getMode(i5);
            this.f4000q.f4963b.e(i2, i5);
        } else {
            if (this.f4005v) {
                this.f4000q.f4963b.e(i2, i5);
                return;
            }
            C0409B c0409b = this.f3984f0;
            if (c0409b.f4859e) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            c0409b.getClass();
            this.f4007x++;
            this.f4000q.f4963b.e(i2, i5);
            if (this.f4007x < 1) {
                this.f4007x = 1;
            }
            this.f4007x--;
            c0409b.f4857c = false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (this.f3959E > 0) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C0408A)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0408A c0408a = (C0408A) parcelable;
        this.f3982e = c0408a;
        super.onRestoreInstanceState(c0408a.f1776d);
        AbstractC0440t abstractC0440t = this.f4000q;
        if (abstractC0440t == null || (parcelable2 = this.f3982e.f4854i) == null) {
            return;
        }
        abstractC0440t.B(parcelable2);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0408A c0408a = new C0408A(super.onSaveInstanceState());
        C0408A c0408a2 = this.f3982e;
        if (c0408a2 != null) {
            c0408a.f4854i = c0408a2.f4854i;
            return c0408a;
        }
        AbstractC0440t abstractC0440t = this.f4000q;
        if (abstractC0440t != null) {
            c0408a.f4854i = abstractC0440t.C();
            return c0408a;
        }
        c0408a.f4854i = null;
        return c0408a;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i5, int i7, int i8) {
        super.onSizeChanged(i2, i5, i7, i8);
        if (i2 == i7 && i5 == i8) {
            return;
        }
        this.f3965K = null;
        this.f3963I = null;
        this.f3964J = null;
        this.f3962H = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0241  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z7;
        if (!this.f4008y && !this.f4009z) {
            int action = motionEvent.getAction();
            C0426f c0426f = this.f4003t;
            if (c0426f != null) {
                if (action != 0) {
                    int i2 = c0426f.f4909a;
                    if (c0426f.f4924q != 0) {
                        if (motionEvent.getAction() == 0) {
                            boolean b7 = c0426f.b(motionEvent.getX(), motionEvent.getY());
                            boolean a7 = c0426f.a(motionEvent.getX(), motionEvent.getY());
                            if (b7 || a7) {
                                if (a7) {
                                    c0426f.f4925r = 1;
                                    c0426f.f4918k = (int) motionEvent.getX();
                                } else if (b7) {
                                    c0426f.f4925r = 2;
                                    c0426f.j = (int) motionEvent.getY();
                                }
                                c0426f.e(2);
                            }
                        } else if (motionEvent.getAction() == 1 && c0426f.f4924q == 2) {
                            c0426f.j = 0.0f;
                            c0426f.f4918k = 0.0f;
                            c0426f.e(1);
                            c0426f.f4925r = 0;
                        } else if (motionEvent.getAction() == 2 && c0426f.f4924q == 2) {
                            c0426f.f();
                            if (c0426f.f4925r == 1) {
                                float x7 = motionEvent.getX();
                                int[] iArr = c0426f.f4927t;
                                iArr[0] = i2;
                                int i5 = c0426f.f4919l - i2;
                                iArr[1] = i5;
                                float max = Math.max(i2, Math.min(i5, x7));
                                if (Math.abs(0 - max) >= 2.0f) {
                                    float f7 = c0426f.f4918k;
                                    int computeHorizontalScrollRange = c0426f.f4921n.computeHorizontalScrollRange();
                                    c0426f.f4921n.computeHorizontalScrollOffset();
                                    int d7 = C0426f.d(f7, max, iArr, computeHorizontalScrollRange, 0, c0426f.f4919l);
                                    if (d7 != 0) {
                                        c0426f.f4921n.scrollBy(d7, 0);
                                    }
                                    c0426f.f4918k = max;
                                }
                            }
                            if (c0426f.f4925r == 2) {
                                float y7 = motionEvent.getY();
                                int[] iArr2 = c0426f.f4926s;
                                iArr2[0] = i2;
                                int i7 = c0426f.f4920m - i2;
                                iArr2[1] = i7;
                                float max2 = Math.max(i2, Math.min(i7, y7));
                                if (Math.abs(0 - max2) >= 2.0f) {
                                    float f8 = c0426f.j;
                                    int computeVerticalScrollRange = c0426f.f4921n.computeVerticalScrollRange();
                                    c0426f.f4921n.computeVerticalScrollOffset();
                                    int d8 = C0426f.d(f8, max2, iArr2, computeVerticalScrollRange, 0, c0426f.f4920m);
                                    if (d8 != 0) {
                                        c0426f.f4921n.scrollBy(0, d8);
                                    }
                                    c0426f.j = max2;
                                }
                            }
                        }
                    }
                    if (action == 3 || action == 1) {
                        this.f4003t = null;
                    }
                    p();
                    setScrollState(0);
                    return true;
                }
                this.f4003t = null;
            }
            if (action != 0) {
                ArrayList arrayList = this.f4002s;
                int size = arrayList.size();
                for (int i8 = 0; i8 < size; i8++) {
                    C0426f c0426f2 = (C0426f) arrayList.get(i8);
                    if (c0426f2.c(motionEvent)) {
                        this.f4003t = c0426f2;
                        p();
                        setScrollState(0);
                        return true;
                    }
                }
            }
            AbstractC0440t abstractC0440t = this.f4000q;
            if (abstractC0440t != null) {
                boolean b8 = abstractC0440t.b();
                boolean c7 = this.f4000q.c();
                if (this.f3969O == null) {
                    this.f3969O = VelocityTracker.obtain();
                }
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                int[] iArr3 = this.f3994m0;
                if (actionMasked == 0) {
                    iArr3[1] = 0;
                    iArr3[0] = 0;
                }
                obtain.offsetLocation(iArr3[0], iArr3[1]);
                if (actionMasked == 0) {
                    this.f3968N = motionEvent.getPointerId(0);
                    int x8 = (int) (motionEvent.getX() + 0.5f);
                    this.f3971R = x8;
                    this.f3970P = x8;
                    int y8 = (int) (motionEvent.getY() + 0.5f);
                    this.f3972S = y8;
                    this.Q = y8;
                    int i9 = b8;
                    if (c7) {
                        i9 = (b8 ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i9, 0);
                } else {
                    if (actionMasked == 1) {
                        this.f3969O.addMovement(obtain);
                        VelocityTracker velocityTracker = this.f3969O;
                        int i10 = this.f3975V;
                        velocityTracker.computeCurrentVelocity(1000, i10);
                        float f9 = b8 != 0 ? -this.f3969O.getXVelocity(this.f3968N) : 0.0f;
                        float f10 = c7 ? -this.f3969O.getYVelocity(this.f3968N) : 0.0f;
                        if (f9 != 0.0f || f10 != 0.0f) {
                            int i11 = (int) f9;
                            int i12 = (int) f10;
                            AbstractC0440t abstractC0440t2 = this.f4000q;
                            if (abstractC0440t2 == null) {
                                Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                            } else if (!this.f4008y) {
                                boolean b9 = abstractC0440t2.b();
                                boolean c8 = this.f4000q.c();
                                int i13 = this.f3974U;
                                if (b9 == 0 || Math.abs(i11) < i13) {
                                    i11 = 0;
                                }
                                if (!c8 || Math.abs(i12) < i13) {
                                    i12 = 0;
                                }
                                if (i11 != 0 || i12 != 0) {
                                    float f11 = i11;
                                    float f12 = i12;
                                    if (!dispatchNestedPreFling(f11, f12)) {
                                        boolean z8 = b9 != 0 || c8;
                                        dispatchNestedFling(f11, f12, z8);
                                        int i14 = b9;
                                        if (z8) {
                                            if (c8) {
                                                i14 = (b9 ? 1 : 0) | 2;
                                            }
                                            getScrollingChildHelper().g(i14, 1);
                                            int i15 = -i10;
                                            int max3 = Math.max(i15, Math.min(i11, i10));
                                            int max4 = Math.max(i15, Math.min(i12, i10));
                                            RunnableC0411D runnableC0411D = this.f3979c0;
                                            runnableC0411D.f4866o.setScrollState(2);
                                            runnableC0411D.f4861e = 0;
                                            runnableC0411D.f4860d = 0;
                                            runnableC0411D.f4862i.fling(0, 0, max3, max4, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                            runnableC0411D.a();
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
                        int findPointerIndex = motionEvent.findPointerIndex(this.f3968N);
                        if (findPointerIndex < 0) {
                            Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f3968N + " not found. Did any MotionEvents get skipped?");
                            return false;
                        }
                        int x9 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                        int y9 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                        int i16 = this.f3971R - x9;
                        int i17 = this.f3972S - y9;
                        boolean f13 = f(i16, i17, this.f3992l0, this.f3990k0, 0);
                        int[] iArr4 = this.f3990k0;
                        if (f13) {
                            int[] iArr5 = this.f3992l0;
                            i16 -= iArr5[0];
                            i17 -= iArr5[1];
                            obtain.offsetLocation(iArr4[0], iArr4[1]);
                            iArr3[0] = iArr3[0] + iArr4[0];
                            iArr3[1] = iArr3[1] + iArr4[1];
                        }
                        if (this.f3967M != 1) {
                            if (b8 != 0) {
                                int abs = Math.abs(i16);
                                int i18 = this.f3973T;
                                if (abs > i18) {
                                    i16 = i16 > 0 ? i16 - i18 : i16 + i18;
                                    z7 = true;
                                    if (c7) {
                                        int abs2 = Math.abs(i17);
                                        int i19 = this.f3973T;
                                        if (abs2 > i19) {
                                            i17 = i17 > 0 ? i17 - i19 : i17 + i19;
                                            z7 = true;
                                        }
                                    }
                                    if (z7) {
                                        setScrollState(1);
                                    }
                                }
                            }
                            z7 = false;
                            if (c7) {
                            }
                            if (z7) {
                            }
                        }
                        if (this.f3967M == 1) {
                            this.f3971R = x9 - iArr4[0];
                            this.f3972S = y9 - iArr4[1];
                            q(b8 != 0 ? i16 : 0, c7 ? i17 : 0, obtain);
                            RunnableC0430j runnableC0430j = this.f3981d0;
                            if (runnableC0430j != null && (i16 != 0 || i17 != 0)) {
                                runnableC0430j.a(this, i16, i17);
                            }
                        }
                    } else if (actionMasked == 3) {
                        p();
                        setScrollState(0);
                    } else if (actionMasked == 5) {
                        this.f3968N = motionEvent.getPointerId(actionIndex);
                        int x10 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.f3971R = x10;
                        this.f3970P = x10;
                        int y10 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        this.f3972S = y10;
                        this.Q = y10;
                    } else if (actionMasked == 6) {
                        n(motionEvent);
                    }
                }
                this.f3969O.addMovement(obtain);
                obtain.recycle();
                return true;
            }
        }
        return false;
    }

    public final void p() {
        VelocityTracker velocityTracker = this.f3969O;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z7 = false;
        s(0);
        EdgeEffect edgeEffect = this.f3962H;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z7 = this.f3962H.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f3963I;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z7 |= this.f3963I.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f3964J;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z7 |= this.f3964J.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f3965K;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z7 |= this.f3965K.isFinished();
        }
        if (z7) {
            WeakHashMap weakHashMap = T.f1153a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(int i2, int i5, MotionEvent motionEvent) {
        d();
        if (!this.f4001r.isEmpty()) {
            invalidate();
        }
        int[] iArr = this.f3990k0;
        boolean z7 = false;
        boolean z8 = true;
        if (g(iArr, 0)) {
            int i7 = this.f3971R;
            int i8 = iArr[0];
            this.f3971R = i7 - i8;
            int i9 = this.f3972S;
            int i10 = iArr[1];
            this.f3972S = i9 - i10;
            if (motionEvent != null) {
                motionEvent.offsetLocation(i8, i10);
            }
            int[] iArr2 = this.f3994m0;
            iArr2[0] = iArr2[0] + iArr[0];
            iArr2[1] = iArr2[1] + iArr[1];
        } else if (getOverScrollMode() != 2) {
            if (motionEvent != null && (motionEvent.getSource() & 8194) != 8194) {
                float x7 = motionEvent.getX();
                float f7 = 0;
                float y7 = motionEvent.getY();
                if (f7 < 0.0f) {
                    if (this.f3962H == null) {
                        this.f3961G.getClass();
                        EdgeEffect edgeEffect = new EdgeEffect(getContext());
                        this.f3962H = edgeEffect;
                        if (this.f3995n) {
                            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                        } else {
                            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
                        }
                    }
                    this.f3962H.onPull((-f7) / getWidth(), 1.0f - (y7 / getHeight()));
                } else {
                    if (f7 > 0.0f) {
                        if (this.f3964J == null) {
                            this.f3961G.getClass();
                            EdgeEffect edgeEffect2 = new EdgeEffect(getContext());
                            this.f3964J = edgeEffect2;
                            if (this.f3995n) {
                                edgeEffect2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                            } else {
                                edgeEffect2.setSize(getMeasuredHeight(), getMeasuredWidth());
                            }
                        }
                        this.f3964J.onPull(f7 / getWidth(), y7 / getHeight());
                    }
                    if (f7 >= 0.0f) {
                        if (this.f3963I == null) {
                            this.f3961G.getClass();
                            EdgeEffect edgeEffect3 = new EdgeEffect(getContext());
                            this.f3963I = edgeEffect3;
                            if (this.f3995n) {
                                edgeEffect3.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
                            } else {
                                edgeEffect3.setSize(getMeasuredWidth(), getMeasuredHeight());
                            }
                        }
                        this.f3963I.onPull((-f7) / getHeight(), x7 / getWidth());
                    } else if (f7 > 0.0f) {
                        if (this.f3965K == null) {
                            this.f3961G.getClass();
                            EdgeEffect edgeEffect4 = new EdgeEffect(getContext());
                            this.f3965K = edgeEffect4;
                            if (this.f3995n) {
                                edgeEffect4.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
                            } else {
                                edgeEffect4.setSize(getMeasuredWidth(), getMeasuredHeight());
                            }
                        }
                        this.f3965K.onPull(f7 / getHeight(), 1.0f - (x7 / getWidth()));
                    } else {
                        z8 = z7;
                    }
                    if (!z8 || f7 != 0.0f || f7 != 0.0f) {
                        WeakHashMap weakHashMap = T.f1153a;
                        postInvalidateOnAnimation();
                    }
                }
                z7 = true;
                if (f7 >= 0.0f) {
                }
                if (!z8) {
                }
                WeakHashMap weakHashMap2 = T.f1153a;
                postInvalidateOnAnimation();
            }
            c(i2, i5);
        }
        if (awakenScrollBars()) {
            return;
        }
        invalidate();
    }

    public final void r(int i2, int i5) {
        int i7;
        AbstractC0440t abstractC0440t = this.f4000q;
        if (abstractC0440t == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f4008y) {
            return;
        }
        int i8 = !abstractC0440t.b() ? 0 : i2;
        int i9 = !this.f4000q.c() ? 0 : i5;
        if (i8 == 0 && i9 == 0) {
            return;
        }
        RunnableC0411D runnableC0411D = this.f3979c0;
        RecyclerView recyclerView = runnableC0411D.f4866o;
        int abs = Math.abs(i8);
        int abs2 = Math.abs(i9);
        boolean z7 = abs > abs2;
        int sqrt = (int) Math.sqrt(0);
        int sqrt2 = (int) Math.sqrt((i9 * i9) + (i8 * i8));
        int width = z7 ? recyclerView.getWidth() : recyclerView.getHeight();
        int i10 = width / 2;
        float f7 = width;
        float f8 = i10;
        float sin = (((float) Math.sin((Math.min(1.0f, (sqrt2 * 1.0f) / f7) - 0.5f) * 0.47123894f)) * f8) + f8;
        if (sqrt > 0) {
            i7 = Math.round(Math.abs(sin / sqrt) * 1000.0f) * 4;
        } else {
            if (!z7) {
                abs = abs2;
            }
            i7 = (int) (((abs / f7) + 1.0f) * 300.0f);
        }
        int min = Math.min(i7, 2000);
        Interpolator interpolator = runnableC0411D.f4863l;
        a aVar = f3954s0;
        if (interpolator != aVar) {
            runnableC0411D.f4863l = aVar;
            runnableC0411D.f4862i = new OverScroller(recyclerView.getContext(), aVar);
        }
        recyclerView.setScrollState(2);
        runnableC0411D.f4861e = 0;
        runnableC0411D.f4860d = 0;
        runnableC0411D.f4862i.startScroll(0, 0, i8, i9, min);
        runnableC0411D.a();
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z7) {
        j(view);
        view.clearAnimation();
        j(view);
        super.removeDetachedView(view, z7);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        this.f4000q.getClass();
        if (this.f3959E <= 0 && view2 != null) {
            o(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z7) {
        return this.f4000q.G(this, view, rect, z7, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z7) {
        ArrayList arrayList = this.f4002s;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C0426f) arrayList.get(i2)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z7);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f4007x != 0 || this.f4008y) {
            return;
        }
        super.requestLayout();
    }

    public final void s(int i2) {
        getScrollingChildHelper().h(i2);
    }

    @Override // android.view.View
    public final void scrollBy(int i2, int i5) {
        AbstractC0440t abstractC0440t = this.f4000q;
        if (abstractC0440t == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f4008y) {
            return;
        }
        boolean b7 = abstractC0440t.b();
        boolean c7 = this.f4000q.c();
        if (b7 || c7) {
            if (!b7) {
                i2 = 0;
            }
            if (!c7) {
                i5 = 0;
            }
            q(i2, i5, null);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i2, int i5) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (this.f3959E <= 0) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.f3955A |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(C0413F c0413f) {
        this.f3988i0 = c0413f;
        T.i(this, c0413f);
    }

    public void setAdapter(AbstractC0436p abstractC0436p) {
        setLayoutFrozen(false);
        AbstractC0439s abstractC0439s = this.f3966L;
        if (abstractC0439s != null) {
            abstractC0439s.a();
        }
        AbstractC0440t abstractC0440t = this.f4000q;
        n nVar = this.f3980d;
        if (abstractC0440t != null) {
            abstractC0440t.E();
            this.f4000q.F(nVar);
        }
        ((ArrayList) nVar.f542i).clear();
        ArrayList arrayList = (ArrayList) nVar.f543l;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            throw p.f(arrayList, size);
        }
        arrayList.clear();
        C0428h c0428h = ((RecyclerView) nVar.f545n).f3983e0;
        c0428h.getClass();
        c0428h.f4933c = 0;
        j jVar = this.f3987i;
        jVar.X((ArrayList) jVar.f331i);
        jVar.X((ArrayList) jVar.f332l);
        ArrayList arrayList2 = (ArrayList) nVar.f542i;
        RecyclerView recyclerView = (RecyclerView) nVar.f545n;
        ArrayList arrayList3 = (ArrayList) nVar.f543l;
        arrayList2.clear();
        int size2 = arrayList3.size() - 1;
        if (size2 >= 0) {
            throw p.f(arrayList3, size2);
        }
        arrayList3.clear();
        C0428h c0428h2 = recyclerView.f3983e0;
        c0428h2.getClass();
        c0428h2.f4933c = 0;
        if (((C0445y) nVar.f544m) == null) {
            C0445y c0445y = new C0445y();
            c0445y.f4971a = new SparseArray();
            c0445y.f4972b = 0;
            nVar.f544m = c0445y;
        }
        C0445y c0445y2 = (C0445y) nVar.f544m;
        if (c0445y2.f4972b == 0) {
            SparseArray sparseArray = c0445y2.f4971a;
            if (sparseArray.size() > 0) {
                ((AbstractC0444x) sparseArray.valueAt(0)).getClass();
                throw null;
            }
        }
        this.f3984f0.f4856b = true;
        this.f3958D = this.f3958D;
        this.f3957C = true;
        int N7 = this.f3991l.N();
        for (int i2 = 0; i2 < N7; i2++) {
            j(this.f3991l.M(i2));
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
            throw p.f(arrayList3, size4);
        }
        arrayList3.clear();
        C0428h c0428h3 = recyclerView.f3983e0;
        c0428h3.getClass();
        c0428h3.f4933c = 0;
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC0437q interfaceC0437q) {
        if (interfaceC0437q == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z7) {
        if (z7 != this.f3995n) {
            this.f3965K = null;
            this.f3963I = null;
            this.f3964J = null;
            this.f3962H = null;
        }
        this.f3995n = z7;
        super.setClipToPadding(z7);
        if (this.f4006w) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C0438r c0438r) {
        c0438r.getClass();
        this.f3961G = c0438r;
        this.f3965K = null;
        this.f3963I = null;
        this.f3964J = null;
        this.f3962H = null;
    }

    public void setHasFixedSize(boolean z7) {
        this.f4005v = z7;
    }

    public void setItemAnimator(AbstractC0439s abstractC0439s) {
        AbstractC0439s abstractC0439s2 = this.f3966L;
        if (abstractC0439s2 != null) {
            abstractC0439s2.a();
            this.f3966L.f4958a = null;
        }
        this.f3966L = abstractC0439s;
        if (abstractC0439s != null) {
            abstractC0439s.f4958a = this.f3986h0;
        }
    }

    public void setItemViewCacheSize(int i2) {
        n nVar = this.f3980d;
        nVar.f540d = i2;
        nVar.g();
    }

    public void setLayoutFrozen(boolean z7) {
        if (z7 != this.f4008y) {
            b("Do not setLayoutFrozen in layout or scroll");
            if (!z7) {
                this.f4008y = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f4008y = true;
            this.f4009z = true;
            setScrollState(0);
            RunnableC0411D runnableC0411D = this.f3979c0;
            runnableC0411D.f4866o.removeCallbacks(runnableC0411D);
            runnableC0411D.f4862i.abortAnimation();
        }
    }

    public void setLayoutManager(AbstractC0440t abstractC0440t) {
        if (abstractC0440t == this.f4000q) {
            return;
        }
        setScrollState(0);
        RunnableC0411D runnableC0411D = this.f3979c0;
        runnableC0411D.f4866o.removeCallbacks(runnableC0411D);
        runnableC0411D.f4862i.abortAnimation();
        AbstractC0440t abstractC0440t2 = this.f4000q;
        n nVar = this.f3980d;
        if (abstractC0440t2 != null) {
            AbstractC0439s abstractC0439s = this.f3966L;
            if (abstractC0439s != null) {
                abstractC0439s.a();
            }
            this.f4000q.E();
            this.f4000q.F(nVar);
            ((ArrayList) nVar.f542i).clear();
            ArrayList arrayList = (ArrayList) nVar.f543l;
            int size = arrayList.size() - 1;
            if (size >= 0) {
                throw p.f(arrayList, size);
            }
            arrayList.clear();
            C0428h c0428h = ((RecyclerView) nVar.f545n).f3983e0;
            c0428h.getClass();
            c0428h.f4933c = 0;
            if (this.f4004u) {
                AbstractC0440t abstractC0440t3 = this.f4000q;
                abstractC0440t3.f4966e = false;
                abstractC0440t3.z(this);
            }
            this.f4000q.I(null);
            this.f4000q = null;
        } else {
            ((ArrayList) nVar.f542i).clear();
            ArrayList arrayList2 = (ArrayList) nVar.f543l;
            int size2 = arrayList2.size() - 1;
            if (size2 >= 0) {
                throw p.f(arrayList2, size2);
            }
            arrayList2.clear();
            C0428h c0428h2 = ((RecyclerView) nVar.f545n).f3983e0;
            c0428h2.getClass();
            c0428h2.f4933c = 0;
        }
        j jVar = this.f3991l;
        c cVar = (c) jVar.f330e;
        ((J6.a) jVar.f331i).d();
        ArrayList arrayList3 = (ArrayList) jVar.f332l;
        for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
            j((View) arrayList3.get(size3));
            arrayList3.remove(size3);
        }
        RecyclerView recyclerView = (RecyclerView) cVar.f6269d;
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            j(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f4000q = abstractC0440t;
        if (abstractC0440t != null) {
            if (abstractC0440t.f4963b != null) {
                throw new IllegalArgumentException("LayoutManager " + abstractC0440t + " is already attached to a RecyclerView:" + abstractC0440t.f4963b.h());
            }
            abstractC0440t.I(this);
            if (this.f4004u) {
                this.f4000q.f4966e = true;
            }
        }
        nVar.g();
        requestLayout();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z7) {
        C0121q scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f1232d) {
            ViewGroup viewGroup = scrollingChildHelper.f1231c;
            WeakHashMap weakHashMap = T.f1153a;
            viewGroup.stopNestedScroll();
        }
        scrollingChildHelper.f1232d = z7;
    }

    public void setPreserveFocusAfterLayout(boolean z7) {
        this.f3978b0 = z7;
    }

    public void setRecycledViewPool(C0445y c0445y) {
        n nVar = this.f3980d;
        if (((C0445y) nVar.f544m) != null) {
            r1.f4972b--;
        }
        nVar.f544m = c0445y;
        if (c0445y != null) {
            ((RecyclerView) nVar.f545n).getAdapter();
        }
    }

    public void setScrollState(int i2) {
        if (i2 == this.f3967M) {
            return;
        }
        this.f3967M = i2;
        if (i2 != 2) {
            RunnableC0411D runnableC0411D = this.f3979c0;
            runnableC0411D.f4866o.removeCallbacks(runnableC0411D);
            runnableC0411D.f4862i.abortAnimation();
        }
        AbstractC0440t abstractC0440t = this.f4000q;
        if (abstractC0440t != null) {
            abstractC0440t.D(i2);
        }
        ArrayList arrayList = this.f3985g0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC0443w) this.f3985g0.get(size)).getClass();
            }
        }
    }

    public void setScrollingTouchSlop(int i2) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 != 0) {
            if (i2 == 1) {
                this.f3973T = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i2 + "; using default value");
        }
        this.f3973T = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(AbstractC0410C abstractC0410C) {
        this.f3980d.getClass();
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
        AbstractC0440t abstractC0440t = this.f4000q;
        if (abstractC0440t != null) {
            return abstractC0440t.n(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + h());
    }

    public void setOnFlingListener(AbstractC0442v abstractC0442v) {
    }

    @Deprecated
    public void setOnScrollListener(AbstractC0443w abstractC0443w) {
    }

    public void setRecyclerListener(InterfaceC0446z interfaceC0446z) {
    }
}
