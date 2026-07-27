package androidx.recyclerview.widget;

import A.g;
import B4.i;
import E.AbstractC0048x;
import E.AbstractC0050z;
import E.C0039n;
import E.G;
import E.H;
import E.K;
import I.c;
import L.a;
import T4.l;
import W.A;
import W.B;
import W.C;
import W.C0157b;
import W.C0158c;
import W.C0162g;
import W.C0164i;
import W.D;
import W.F;
import W.M;
import W.RunnableC0166k;
import W.p;
import W.q;
import W.r;
import W.s;
import W.t;
import W.u;
import W.v;
import W.w;
import W.x;
import W.y;
import W.z;
import W1.e;
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
import b2.AbstractC0279e;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import l1.j;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* renamed from: o0, reason: collision with root package name */
    public static final int[] f4627o0 = {R.attr.nestedScrollingEnabled};

    /* renamed from: p0, reason: collision with root package name */
    public static final int[] f4628p0 = {R.attr.clipToPadding};

    /* renamed from: q0, reason: collision with root package name */
    public static final Class[] f4629q0;
    public static final a r0;

    /* renamed from: A, reason: collision with root package name */
    public EdgeEffect f4630A;

    /* renamed from: B, reason: collision with root package name */
    public EdgeEffect f4631B;

    /* renamed from: C, reason: collision with root package name */
    public EdgeEffect f4632C;

    /* renamed from: D, reason: collision with root package name */
    public s f4633D;

    /* renamed from: E, reason: collision with root package name */
    public int f4634E;

    /* renamed from: F, reason: collision with root package name */
    public int f4635F;

    /* renamed from: G, reason: collision with root package name */
    public VelocityTracker f4636G;

    /* renamed from: H, reason: collision with root package name */
    public int f4637H;

    /* renamed from: I, reason: collision with root package name */
    public int f4638I;

    /* renamed from: J, reason: collision with root package name */
    public int f4639J;

    /* renamed from: K, reason: collision with root package name */
    public int f4640K;

    /* renamed from: L, reason: collision with root package name */
    public int f4641L;

    /* renamed from: T, reason: collision with root package name */
    public final int f4642T;

    /* renamed from: U, reason: collision with root package name */
    public final int f4643U;

    /* renamed from: V, reason: collision with root package name */
    public final float f4644V;

    /* renamed from: W, reason: collision with root package name */
    public final float f4645W;

    /* renamed from: a, reason: collision with root package name */
    public final l f4646a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f4647a0;

    /* renamed from: b, reason: collision with root package name */
    public A f4648b;

    /* renamed from: b0, reason: collision with root package name */
    public final D f4649b0;

    /* renamed from: c, reason: collision with root package name */
    public final i f4650c;

    /* renamed from: c0, reason: collision with root package name */
    public RunnableC0166k f4651c0;

    /* renamed from: d, reason: collision with root package name */
    public final i f4652d;

    /* renamed from: d0, reason: collision with root package name */
    public final C0164i f4653d0;

    /* renamed from: e, reason: collision with root package name */
    public final j f4654e;

    /* renamed from: e0, reason: collision with root package name */
    public final B f4655e0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4656f;

    /* renamed from: f0, reason: collision with root package name */
    public ArrayList f4657f0;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f4658g;

    /* renamed from: g0, reason: collision with root package name */
    public final j f4659g0;

    /* renamed from: h, reason: collision with root package name */
    public final Rect f4660h;

    /* renamed from: h0, reason: collision with root package name */
    public F f4661h0;

    /* renamed from: i, reason: collision with root package name */
    public t f4662i;

    /* renamed from: i0, reason: collision with root package name */
    public C0039n f4663i0;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f4664j;

    /* renamed from: j0, reason: collision with root package name */
    public final int[] f4665j0;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f4666k;

    /* renamed from: k0, reason: collision with root package name */
    public final int[] f4667k0;

    /* renamed from: l, reason: collision with root package name */
    public C0162g f4668l;
    public final int[] l0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4669m;

    /* renamed from: m0, reason: collision with root package name */
    public final ArrayList f4670m0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4671n;

    /* renamed from: n0, reason: collision with root package name */
    public final B.a f4672n0;

    /* renamed from: o, reason: collision with root package name */
    public boolean f4673o;

    /* renamed from: p, reason: collision with root package name */
    public int f4674p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4675q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f4676r;

    /* renamed from: s, reason: collision with root package name */
    public int f4677s;

    /* renamed from: t, reason: collision with root package name */
    public final AccessibilityManager f4678t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f4679u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f4680v;

    /* renamed from: w, reason: collision with root package name */
    public int f4681w;

    /* renamed from: x, reason: collision with root package name */
    public final int f4682x;

    /* renamed from: y, reason: collision with root package name */
    public r f4683y;
    public EdgeEffect z;

    static {
        Class cls = Integer.TYPE;
        f4629q0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        r0 = new a(1);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        float a6;
        char c2;
        int i2;
        TypedArray typedArray;
        char c6;
        Constructor constructor;
        this.f4646a = new l(this);
        this.f4654e = new j();
        this.f4658g = new Rect();
        this.f4660h = new Rect();
        new RectF();
        this.f4664j = new ArrayList();
        this.f4666k = new ArrayList();
        this.f4674p = 0;
        this.f4679u = false;
        this.f4680v = false;
        this.f4681w = 0;
        this.f4682x = 0;
        this.f4683y = new r();
        C0158c c0158c = new C0158c();
        Object[] objArr = null;
        c0158c.f3363a = null;
        c0158c.f3364b = new ArrayList();
        c0158c.f3365c = 250L;
        c0158c.f3366d = 250L;
        c0158c.f3300e = new ArrayList();
        c0158c.f3301f = new ArrayList();
        c0158c.f3302g = new ArrayList();
        c0158c.f3303h = new ArrayList();
        c0158c.f3304i = new ArrayList();
        c0158c.f3305j = new ArrayList();
        c0158c.f3306k = new ArrayList();
        c0158c.f3307l = new ArrayList();
        c0158c.f3308m = new ArrayList();
        c0158c.f3309n = new ArrayList();
        c0158c.f3310o = new ArrayList();
        this.f4633D = c0158c;
        this.f4634E = 0;
        this.f4635F = -1;
        this.f4644V = Float.MIN_VALUE;
        this.f4645W = Float.MIN_VALUE;
        boolean z = true;
        this.f4647a0 = true;
        this.f4649b0 = new D(this);
        this.f4653d0 = new C0164i();
        B b6 = new B();
        b6.f3258a = 0;
        b6.f3259b = false;
        b6.f3260c = false;
        b6.f3261d = false;
        b6.f3262e = false;
        this.f4655e0 = b6;
        j jVar = new j(18);
        this.f4659g0 = jVar;
        this.f4665j0 = new int[2];
        this.f4667k0 = new int[2];
        this.l0 = new int[2];
        this.f4670m0 = new ArrayList();
        this.f4672n0 = new B.a(9, this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f4628p0, 0, 0);
            this.f4656f = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.f4656f = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f4641L = viewConfiguration.getScaledTouchSlop();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            Method method = K.f568a;
            a6 = H.a(viewConfiguration);
        } else {
            a6 = K.a(viewConfiguration, context);
        }
        this.f4644V = a6;
        this.f4645W = i3 >= 26 ? H.b(viewConfiguration) : K.a(viewConfiguration, context);
        this.f4642T = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f4643U = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f4633D.f3363a = jVar;
        this.f4650c = new i(new e(this));
        this.f4652d = new i(new U.e(this));
        Field field = G.f566a;
        if ((i3 >= 26 ? AbstractC0050z.c(this) : 0) == 0 && i3 >= 26) {
            AbstractC0050z.m(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f4678t = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new F(this));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, V.a.f3181a, 0, 0);
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
                c6 = 2;
                new C0162g(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.chickyneer.roadway.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.chickyneer.roadway.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.chickyneer.roadway.R.dimen.fastscroll_margin));
            } else {
                c2 = 3;
                i2 = 4;
                typedArray = obtainStyledAttributes2;
                c6 = 2;
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
                        Class<? extends U> asSubclass = (isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).loadClass(trim).asSubclass(t.class);
                        try {
                            constructor = asSubclass.getConstructor(f4629q0);
                            Object[] objArr2 = new Object[i2];
                            objArr2[0] = context;
                            objArr2[1] = attributeSet;
                            objArr2[c6] = 0;
                            objArr2[c2] = 0;
                            objArr = objArr2;
                        } catch (NoSuchMethodException e3) {
                            try {
                                constructor = asSubclass.getConstructor(null);
                            } catch (NoSuchMethodException e6) {
                                e6.initCause(e3);
                                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + trim, e6);
                            }
                        }
                        constructor.setAccessible(true);
                        setLayoutManager((t) constructor.newInstance(objArr));
                    } catch (ClassCastException e7) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + trim, e7);
                    } catch (ClassNotFoundException e8) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + trim, e8);
                    } catch (IllegalAccessException e9) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + trim, e9);
                    } catch (InstantiationException e10) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e10);
                    } catch (InvocationTargetException e11) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e11);
                    }
                }
            }
            TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f4627o0, 0, 0);
            z = obtainStyledAttributes3.getBoolean(0, true);
            obtainStyledAttributes3.recycle();
        } else {
            setDescendantFocusability(262144);
        }
        setNestedScrollingEnabled(z);
    }

    private C0039n getScrollingChildHelper() {
        if (this.f4663i0 == null) {
            this.f4663i0 = new C0039n(this);
        }
        return this.f4663i0;
    }

    public static void j(View view) {
        if (view == null) {
            return;
        }
        ((u) view.getLayoutParams()).getClass();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i2, int i3) {
        t tVar = this.f4662i;
        if (tVar != null) {
            tVar.getClass();
        }
        super.addFocusables(arrayList, i2, i3);
    }

    public final void b(String str) {
        if (this.f4681w > 0) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + h());
        }
        if (this.f4682x > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + h()));
        }
    }

    public final void c(int i2, int i3) {
        boolean z;
        EdgeEffect edgeEffect = this.z;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            z = false;
        } else {
            this.z.onRelease();
            z = this.z.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f4631B;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.f4631B.onRelease();
            z |= this.f4631B.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f4630A;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.f4630A.onRelease();
            z |= this.f4630A.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f4632C;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.f4632C.onRelease();
            z |= this.f4632C.isFinished();
        }
        if (z) {
            Field field = G.f566a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof u) && this.f4662i.d((u) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        t tVar = this.f4662i;
        if (tVar != null && tVar.b()) {
            return this.f4662i.f(this.f4655e0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        t tVar = this.f4662i;
        if (tVar != null && tVar.b()) {
            this.f4662i.g(this.f4655e0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        t tVar = this.f4662i;
        if (tVar != null && tVar.b()) {
            return this.f4662i.h(this.f4655e0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        t tVar = this.f4662i;
        if (tVar != null && tVar.c()) {
            return this.f4662i.i(this.f4655e0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        t tVar = this.f4662i;
        if (tVar != null && tVar.c()) {
            this.f4662i.j(this.f4655e0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        t tVar = this.f4662i;
        if (tVar != null && tVar.c()) {
            return this.f4662i.k(this.f4655e0);
        }
        return 0;
    }

    public final void d() {
        i iVar = this.f4650c;
        if (!this.f4673o || this.f4679u) {
            int i2 = g.f2a;
            Trace.beginSection("RV FullInvalidate");
            Log.e("RecyclerView", "No adapter attached; skipping layout");
            Trace.endSection();
            return;
        }
        if (((ArrayList) iVar.f312c).size() > 0) {
            iVar.getClass();
            if (((ArrayList) iVar.f312c).size() > 0) {
                int i3 = g.f2a;
                Trace.beginSection("RV FullInvalidate");
                Log.e("RecyclerView", "No adapter attached; skipping layout");
                Trace.endSection();
            }
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f3, float f6, boolean z) {
        return getScrollingChildHelper().a(f3, f6, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f3, float f6) {
        return getScrollingChildHelper().b(f3, f6);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i2, i3, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i2, int i3, int i6, int i7, int[] iArr) {
        return getScrollingChildHelper().d(i2, i3, i6, i7, iArr, 0, null);
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
        ArrayList arrayList = this.f4664j;
        int size = arrayList.size();
        boolean z5 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0162g c0162g = (C0162g) arrayList.get(i2);
            if (c0162g.f3327l != c0162g.f3329n.getWidth() || c0162g.f3328m != c0162g.f3329n.getHeight()) {
                c0162g.f3327l = c0162g.f3329n.getWidth();
                c0162g.f3328m = c0162g.f3329n.getHeight();
                c0162g.e(0);
            } else if (c0162g.f3337v != 0) {
                if (c0162g.f3330o) {
                    int i3 = c0162g.f3327l;
                    int i6 = c0162g.f3319d;
                    int i7 = i3 - i6;
                    int i8 = 0 - (0 / 2);
                    StateListDrawable stateListDrawable = c0162g.f3317b;
                    stateListDrawable.setBounds(0, 0, i6, 0);
                    int i9 = c0162g.f3328m;
                    Drawable drawable = c0162g.f3318c;
                    drawable.setBounds(0, 0, c0162g.f3320e, i9);
                    RecyclerView recyclerView = c0162g.f3329n;
                    Field field = G.f566a;
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
                if (c0162g.f3331p) {
                    int i10 = c0162g.f3328m;
                    int i11 = c0162g.f3323h;
                    int i12 = i10 - i11;
                    StateListDrawable stateListDrawable2 = c0162g.f3321f;
                    stateListDrawable2.setBounds(0, 0, 0, i11);
                    int i13 = c0162g.f3327l;
                    Drawable drawable2 = c0162g.f3322g;
                    drawable2.setBounds(0, 0, i13, c0162g.f3324i);
                    canvas.translate(0.0f, i12);
                    drawable2.draw(canvas);
                    canvas.translate(0 - (0 / 2), 0.0f);
                    stateListDrawable2.draw(canvas);
                    canvas.translate(-r9, -i12);
                }
            }
        }
        EdgeEffect edgeEffect = this.z;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f4656f ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.z;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f4630A;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f4656f) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f4630A;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f4631B;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f4656f ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f4631B;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f4632C;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f4656f) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f4632C;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z5 = true;
            }
            z |= z5;
            canvas.restoreToCount(save4);
        }
        if ((z || this.f4633D == null || arrayList.size() <= 0 || !this.f4633D.b()) ? z : true) {
            Field field2 = G.f566a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    public final void e(int i2, int i3) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        Field field = G.f566a;
        setMeasuredDimension(t.e(i2, paddingRight, getMinimumWidth()), t.e(i3, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final boolean f(int i2, int i3, int[] iArr, int[] iArr2, int i6) {
        return getScrollingChildHelper().c(i2, i3, iArr, iArr2, i6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i2) {
        int i3;
        this.f4662i.getClass();
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
            Rect rect = this.f4658g;
            char c2 = 0;
            rect.set(0, 0, width, height);
            int width2 = findNextFocus.getWidth();
            int height2 = findNextFocus.getHeight();
            Rect rect2 = this.f4660h;
            rect2.set(0, 0, width2, height2);
            offsetDescendantRectToMyCoords(view, rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect2);
            RecyclerView recyclerView = this.f4662i.f3368b;
            Field field = G.f566a;
            int i6 = recyclerView.getLayoutDirection() == 1 ? -1 : 1;
            int i7 = rect.left;
            int i8 = rect2.left;
            if ((i7 < i8 || rect.right <= i8) && rect.right < rect2.right) {
                i3 = 1;
            } else {
                int i9 = rect.right;
                int i10 = rect2.right;
                i3 = ((i9 > i10 || i7 >= i10) && i7 > i8) ? -1 : 0;
            }
            int i11 = rect.top;
            int i12 = rect2.top;
            if ((i11 < i12 || rect.bottom <= i12) && rect.bottom < rect2.bottom) {
                c2 = 1;
            } else {
                int i13 = rect.bottom;
                int i14 = rect2.bottom;
                if ((i13 > i14 || i11 >= i14) && i11 > i12) {
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
                    if (c2 == 0 && i3 * i6 >= 0) {
                        return findNextFocus;
                    }
                }
            } else {
                if (c2 < 0) {
                    return findNextFocus;
                }
                if (c2 == 0 && i3 * i6 <= 0) {
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
        t tVar = this.f4662i;
        if (tVar != null) {
            return tVar.l();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + h());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        t tVar = this.f4662i;
        if (tVar != null) {
            return tVar.m(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + h());
    }

    public p getAdapter() {
        return null;
    }

    @Override // android.view.View
    public int getBaseline() {
        t tVar = this.f4662i;
        if (tVar == null) {
            return super.getBaseline();
        }
        tVar.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i2, int i3) {
        return super.getChildDrawingOrder(i2, i3);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f4656f;
    }

    public F getCompatAccessibilityDelegate() {
        return this.f4661h0;
    }

    public r getEdgeEffectFactory() {
        return this.f4683y;
    }

    public s getItemAnimator() {
        return this.f4633D;
    }

    public int getItemDecorationCount() {
        return this.f4664j.size();
    }

    public t getLayoutManager() {
        return this.f4662i;
    }

    public int getMaxFlingVelocity() {
        return this.f4643U;
    }

    public int getMinFlingVelocity() {
        return this.f4642T;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public v getOnFlingListener() {
        return null;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f4647a0;
    }

    public y getRecycledViewPool() {
        l lVar = this.f4646a;
        if (((y) lVar.f2905e) == null) {
            y yVar = new y();
            yVar.f3376a = new SparseArray();
            yVar.f3377b = 0;
            lVar.f2905e = yVar;
        }
        return (y) lVar.f2905e;
    }

    public int getScrollState() {
        return this.f4634E;
    }

    public final String h() {
        return " " + super.toString() + ", adapter:null, layout:" + this.f4662i + ", context:" + getContext();
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
        return this.f4669m;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f628d;
    }

    public final boolean k() {
        return getScrollingChildHelper().f(1);
    }

    public final boolean l() {
        return !this.f4673o || this.f4679u || ((ArrayList) this.f4650c.f312c).size() > 0;
    }

    public final void m() {
        int I5 = this.f4652d.I();
        for (int i2 = 0; i2 < I5; i2++) {
            ((u) this.f4652d.H(i2).getLayoutParams()).f3375b = true;
        }
        ArrayList arrayList = (ArrayList) this.f4646a.f2904d;
        if (arrayList.size() <= 0) {
            return;
        }
        AbstractC0279e.o(arrayList.get(0));
        throw null;
    }

    public final void n(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f4635F) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.f4635F = motionEvent.getPointerId(i2);
            int x5 = (int) (motionEvent.getX(i2) + 0.5f);
            this.f4639J = x5;
            this.f4637H = x5;
            int y5 = (int) (motionEvent.getY(i2) + 0.5f);
            this.f4640K = y5;
            this.f4638I = y5;
        }
    }

    public final void o(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f4658g;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof u) {
            u uVar = (u) layoutParams;
            if (!uVar.f3375b) {
                int i2 = rect.left;
                Rect rect2 = uVar.f3374a;
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
        this.f4662i.G(this, view, this.f4658g, !this.f4673o, view2 == null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r1 >= 30.0f) goto L19;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAttachedToWindow() {
        float f3;
        super.onAttachedToWindow();
        boolean z = false;
        this.f4681w = 0;
        this.f4669m = true;
        if (this.f4673o && !isLayoutRequested()) {
            z = true;
        }
        this.f4673o = z;
        t tVar = this.f4662i;
        if (tVar != null) {
            tVar.f3371e = true;
        }
        ThreadLocal threadLocal = RunnableC0166k.f3347e;
        RunnableC0166k runnableC0166k = (RunnableC0166k) threadLocal.get();
        this.f4651c0 = runnableC0166k;
        if (runnableC0166k == null) {
            RunnableC0166k runnableC0166k2 = new RunnableC0166k();
            runnableC0166k2.f3349a = new ArrayList();
            runnableC0166k2.f3352d = new ArrayList();
            this.f4651c0 = runnableC0166k2;
            Field field = G.f566a;
            Display display = getDisplay();
            if (!isInEditMode() && display != null) {
                f3 = display.getRefreshRate();
            }
            f3 = 60.0f;
            RunnableC0166k runnableC0166k3 = this.f4651c0;
            runnableC0166k3.f3351c = (long) (1.0E9f / f3);
            threadLocal.set(runnableC0166k3);
        }
        this.f4651c0.f3349a.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Object obj;
        super.onDetachedFromWindow();
        s sVar = this.f4633D;
        if (sVar != null) {
            sVar.a();
        }
        setScrollState(0);
        D d6 = this.f4649b0;
        d6.f3269g.removeCallbacks(d6);
        d6.f3265c.abortAnimation();
        this.f4669m = false;
        t tVar = this.f4662i;
        if (tVar != null) {
            tVar.f3371e = false;
            tVar.z(this);
        }
        this.f4670m0.clear();
        removeCallbacks(this.f4672n0);
        this.f4654e.getClass();
        do {
            G0.F f3 = M.f3296a;
            int i2 = f3.f753b;
            obj = null;
            if (i2 > 0) {
                int i3 = i2 - 1;
                Object[] objArr = (Object[]) f3.f754c;
                Object obj2 = objArr[i3];
                kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
                objArr[i3] = null;
                f3.f753b--;
                obj = obj2;
            }
        } while (obj != null);
        RunnableC0166k runnableC0166k = this.f4651c0;
        if (runnableC0166k != null) {
            runnableC0166k.f3349a.remove(this);
            this.f4651c0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f4664j;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C0162g) arrayList.get(i2)).getClass();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f3;
        float f6;
        if (this.f4662i != null && !this.f4675q && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f3 = this.f4662i.c() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f4662i.b()) {
                    f6 = motionEvent.getAxisValue(10);
                    if (f3 == 0.0f || f6 != 0.0f) {
                        q((int) (f6 * this.f4644V), (int) (f3 * this.f4645W), motionEvent);
                    }
                }
                f6 = 0.0f;
                if (f3 == 0.0f) {
                }
                q((int) (f6 * this.f4644V), (int) (f3 * this.f4645W), motionEvent);
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f4662i.c()) {
                        f3 = -axisValue;
                        f6 = 0.0f;
                        if (f3 == 0.0f) {
                        }
                        q((int) (f6 * this.f4644V), (int) (f3 * this.f4645W), motionEvent);
                    } else if (this.f4662i.b()) {
                        f6 = axisValue;
                        f3 = 0.0f;
                        if (f3 == 0.0f) {
                        }
                        q((int) (f6 * this.f4644V), (int) (f3 * this.f4645W), motionEvent);
                    }
                }
                f3 = 0.0f;
                f6 = 0.0f;
                if (f3 == 0.0f) {
                }
                q((int) (f6 * this.f4644V), (int) (f3 * this.f4645W), motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.f4675q) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            this.f4668l = null;
        }
        ArrayList arrayList = this.f4666k;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0162g c0162g = (C0162g) arrayList.get(i2);
            if (c0162g.c(motionEvent) && action != 3) {
                this.f4668l = c0162g;
                p();
                setScrollState(0);
                return true;
            }
        }
        t tVar = this.f4662i;
        if (tVar == null) {
            return false;
        }
        boolean b6 = tVar.b();
        boolean c2 = this.f4662i.c();
        if (this.f4636G == null) {
            this.f4636G = VelocityTracker.obtain();
        }
        this.f4636G.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f4676r) {
                this.f4676r = false;
            }
            this.f4635F = motionEvent.getPointerId(0);
            int x5 = (int) (motionEvent.getX() + 0.5f);
            this.f4639J = x5;
            this.f4637H = x5;
            int y5 = (int) (motionEvent.getY() + 0.5f);
            this.f4640K = y5;
            this.f4638I = y5;
            if (this.f4634E == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
            }
            int[] iArr = this.l0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i3 = b6;
            if (c2) {
                i3 = (b6 ? 1 : 0) | 2;
            }
            getScrollingChildHelper().g(i3, 0);
        } else if (actionMasked == 1) {
            this.f4636G.clear();
            s(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f4635F);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f4635F + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x6 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y6 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f4634E != 1) {
                int i6 = x6 - this.f4637H;
                int i7 = y6 - this.f4638I;
                if (b6 == 0 || Math.abs(i6) <= this.f4641L) {
                    z = false;
                } else {
                    this.f4639J = x6;
                    z = true;
                }
                if (c2 && Math.abs(i7) > this.f4641L) {
                    this.f4640K = y6;
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
            this.f4635F = motionEvent.getPointerId(actionIndex);
            int x7 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f4639J = x7;
            this.f4637H = x7;
            int y7 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f4640K = y7;
            this.f4638I = y7;
        } else if (actionMasked == 6) {
            n(motionEvent);
        }
        return this.f4634E == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i6, int i7) {
        int i8 = g.f2a;
        Trace.beginSection("RV OnLayout");
        Log.e("RecyclerView", "No adapter attached; skipping layout");
        Trace.endSection();
        this.f4673o = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        t tVar = this.f4662i;
        if (tVar == null) {
            e(i2, i3);
            return;
        }
        if (tVar.y()) {
            View.MeasureSpec.getMode(i2);
            View.MeasureSpec.getMode(i3);
            this.f4662i.f3368b.e(i2, i3);
        } else {
            if (this.f4671n) {
                this.f4662i.f3368b.e(i2, i3);
                return;
            }
            B b6 = this.f4655e0;
            if (b6.f3262e) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            b6.getClass();
            this.f4674p++;
            this.f4662i.f3368b.e(i2, i3);
            if (this.f4674p < 1) {
                this.f4674p = 1;
            }
            this.f4674p--;
            b6.f3260c = false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (this.f4681w > 0) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof A)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        A a6 = (A) parcelable;
        this.f4648b = a6;
        super.onRestoreInstanceState(a6.f1370a);
        t tVar = this.f4662i;
        if (tVar == null || (parcelable2 = this.f4648b.f3257c) == null) {
            return;
        }
        tVar.B(parcelable2);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        A a6 = new A(super.onSaveInstanceState());
        A a7 = this.f4648b;
        if (a7 != null) {
            a6.f3257c = a7.f3257c;
        } else {
            t tVar = this.f4662i;
            if (tVar != null) {
                a6.f3257c = tVar.C();
            } else {
                a6.f3257c = null;
            }
        }
        return a6;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i6, int i7) {
        super.onSizeChanged(i2, i3, i6, i7);
        if (i2 == i6 && i3 == i7) {
            return;
        }
        this.f4632C = null;
        this.f4630A = null;
        this.f4631B = null;
        this.z = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x024c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.f4675q || this.f4676r) {
            return false;
        }
        int action = motionEvent.getAction();
        C0162g c0162g = this.f4668l;
        if (c0162g != null) {
            if (action != 0) {
                if (c0162g.f3332q != 0) {
                    if (motionEvent.getAction() == 0) {
                        boolean b6 = c0162g.b(motionEvent.getX(), motionEvent.getY());
                        boolean a6 = c0162g.a(motionEvent.getX(), motionEvent.getY());
                        if (b6 || a6) {
                            if (a6) {
                                c0162g.f3333r = 1;
                                c0162g.f3326k = (int) motionEvent.getX();
                            } else if (b6) {
                                c0162g.f3333r = 2;
                                c0162g.f3325j = (int) motionEvent.getY();
                            }
                            c0162g.e(2);
                        }
                    } else if (motionEvent.getAction() == 1 && c0162g.f3332q == 2) {
                        c0162g.f3325j = 0.0f;
                        c0162g.f3326k = 0.0f;
                        c0162g.e(1);
                        c0162g.f3333r = 0;
                    } else if (motionEvent.getAction() == 2 && c0162g.f3332q == 2) {
                        c0162g.f();
                        int i2 = c0162g.f3333r;
                        int i3 = c0162g.f3316a;
                        if (i2 == 1) {
                            float x5 = motionEvent.getX();
                            int[] iArr = c0162g.f3335t;
                            iArr[0] = i3;
                            int i6 = c0162g.f3327l - i3;
                            iArr[1] = i6;
                            float max = Math.max(i3, Math.min(i6, x5));
                            if (Math.abs(0 - max) >= 2.0f) {
                                float f3 = c0162g.f3326k;
                                int computeHorizontalScrollRange = c0162g.f3329n.computeHorizontalScrollRange();
                                c0162g.f3329n.computeHorizontalScrollOffset();
                                int d6 = C0162g.d(f3, max, iArr, computeHorizontalScrollRange, 0, c0162g.f3327l);
                                if (d6 != 0) {
                                    c0162g.f3329n.scrollBy(d6, 0);
                                }
                                c0162g.f3326k = max;
                            }
                        }
                        if (c0162g.f3333r == 2) {
                            float y5 = motionEvent.getY();
                            int[] iArr2 = c0162g.f3334s;
                            iArr2[0] = i3;
                            int i7 = c0162g.f3328m - i3;
                            iArr2[1] = i7;
                            float max2 = Math.max(i3, Math.min(i7, y5));
                            if (Math.abs(0 - max2) >= 2.0f) {
                                float f6 = c0162g.f3325j;
                                int computeVerticalScrollRange = c0162g.f3329n.computeVerticalScrollRange();
                                c0162g.f3329n.computeVerticalScrollOffset();
                                int d7 = C0162g.d(f6, max2, iArr2, computeVerticalScrollRange, 0, c0162g.f3328m);
                                if (d7 != 0) {
                                    c0162g.f3329n.scrollBy(0, d7);
                                }
                                c0162g.f3325j = max2;
                            }
                        }
                    }
                }
                if (action == 3 || action == 1) {
                    this.f4668l = null;
                }
                p();
                setScrollState(0);
                return true;
            }
            this.f4668l = null;
        }
        if (action != 0) {
            ArrayList arrayList = this.f4666k;
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                C0162g c0162g2 = (C0162g) arrayList.get(i8);
                if (c0162g2.c(motionEvent)) {
                    this.f4668l = c0162g2;
                    p();
                    setScrollState(0);
                    return true;
                }
            }
        }
        t tVar = this.f4662i;
        if (tVar == null) {
            return false;
        }
        boolean b7 = tVar.b();
        boolean c2 = this.f4662i.c();
        if (this.f4636G == null) {
            this.f4636G = VelocityTracker.obtain();
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        int[] iArr3 = this.l0;
        if (actionMasked == 0) {
            iArr3[1] = 0;
            iArr3[0] = 0;
        }
        obtain.offsetLocation(iArr3[0], iArr3[1]);
        if (actionMasked == 0) {
            this.f4635F = motionEvent.getPointerId(0);
            int x6 = (int) (motionEvent.getX() + 0.5f);
            this.f4639J = x6;
            this.f4637H = x6;
            int y6 = (int) (motionEvent.getY() + 0.5f);
            this.f4640K = y6;
            this.f4638I = y6;
            int i9 = b7;
            if (c2) {
                i9 = (b7 ? 1 : 0) | 2;
            }
            getScrollingChildHelper().g(i9, 0);
        } else {
            if (actionMasked == 1) {
                this.f4636G.addMovement(obtain);
                VelocityTracker velocityTracker = this.f4636G;
                int i10 = this.f4643U;
                velocityTracker.computeCurrentVelocity(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, i10);
                float f7 = b7 != 0 ? -this.f4636G.getXVelocity(this.f4635F) : 0.0f;
                float f8 = c2 ? -this.f4636G.getYVelocity(this.f4635F) : 0.0f;
                if (f7 != 0.0f || f8 != 0.0f) {
                    int i11 = (int) f7;
                    int i12 = (int) f8;
                    t tVar2 = this.f4662i;
                    if (tVar2 == null) {
                        Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                    } else if (!this.f4675q) {
                        boolean b8 = tVar2.b();
                        boolean c6 = this.f4662i.c();
                        int i13 = this.f4642T;
                        if (b8 == 0 || Math.abs(i11) < i13) {
                            i11 = 0;
                        }
                        if (!c6 || Math.abs(i12) < i13) {
                            i12 = 0;
                        }
                        if (i11 != 0 || i12 != 0) {
                            float f9 = i11;
                            float f10 = i12;
                            if (!dispatchNestedPreFling(f9, f10)) {
                                boolean z5 = b8 != 0 || c6;
                                dispatchNestedFling(f9, f10, z5);
                                int i14 = b8;
                                if (z5) {
                                    if (c6) {
                                        i14 = (b8 ? 1 : 0) | 2;
                                    }
                                    getScrollingChildHelper().g(i14, 1);
                                    int i15 = -i10;
                                    int max3 = Math.max(i15, Math.min(i11, i10));
                                    int max4 = Math.max(i15, Math.min(i12, i10));
                                    D d8 = this.f4649b0;
                                    d8.f3269g.setScrollState(2);
                                    d8.f3264b = 0;
                                    d8.f3263a = 0;
                                    d8.f3265c.fling(0, 0, max3, max4, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                    d8.a();
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
                int findPointerIndex = motionEvent.findPointerIndex(this.f4635F);
                if (findPointerIndex < 0) {
                    Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f4635F + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                int x7 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                int y7 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                int i16 = this.f4639J - x7;
                int i17 = this.f4640K - y7;
                boolean f11 = f(i16, i17, this.f4667k0, this.f4665j0, 0);
                int[] iArr4 = this.f4665j0;
                if (f11) {
                    int[] iArr5 = this.f4667k0;
                    i16 -= iArr5[0];
                    i17 -= iArr5[1];
                    obtain.offsetLocation(iArr4[0], iArr4[1]);
                    iArr3[0] = iArr3[0] + iArr4[0];
                    iArr3[1] = iArr3[1] + iArr4[1];
                }
                if (this.f4634E != 1) {
                    if (b7 != 0) {
                        int abs = Math.abs(i16);
                        int i18 = this.f4641L;
                        if (abs > i18) {
                            i16 = i16 > 0 ? i16 - i18 : i16 + i18;
                            z = true;
                            if (c2) {
                                int abs2 = Math.abs(i17);
                                int i19 = this.f4641L;
                                if (abs2 > i19) {
                                    i17 = i17 > 0 ? i17 - i19 : i17 + i19;
                                    z = true;
                                }
                            }
                            if (z) {
                                setScrollState(1);
                            }
                        }
                    }
                    z = false;
                    if (c2) {
                    }
                    if (z) {
                    }
                }
                int i20 = i17;
                if (this.f4634E == 1) {
                    this.f4639J = x7 - iArr4[0];
                    this.f4640K = y7 - iArr4[1];
                    q(b7 != 0 ? i16 : 0, c2 ? i20 : 0, obtain);
                    RunnableC0166k runnableC0166k = this.f4651c0;
                    if (runnableC0166k != null && (i16 != 0 || i20 != 0)) {
                        runnableC0166k.a(this, i16, i20);
                    }
                }
            } else if (actionMasked == 3) {
                p();
                setScrollState(0);
            } else if (actionMasked == 5) {
                this.f4635F = motionEvent.getPointerId(actionIndex);
                int x8 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.f4639J = x8;
                this.f4637H = x8;
                int y8 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.f4640K = y8;
                this.f4638I = y8;
            } else if (actionMasked == 6) {
                n(motionEvent);
            }
        }
        this.f4636G.addMovement(obtain);
        obtain.recycle();
        return true;
    }

    public final void p() {
        VelocityTracker velocityTracker = this.f4636G;
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
        EdgeEffect edgeEffect2 = this.f4630A;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.f4630A.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f4631B;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.f4631B.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f4632C;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.f4632C.isFinished();
        }
        if (z) {
            Field field = G.f566a;
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
        if (!this.f4664j.isEmpty()) {
            invalidate();
        }
        int[] iArr = this.f4665j0;
        boolean z = false;
        boolean z5 = true;
        if (g(iArr, 0)) {
            int i6 = this.f4639J;
            int i7 = iArr[0];
            this.f4639J = i6 - i7;
            int i8 = this.f4640K;
            int i9 = iArr[1];
            this.f4640K = i8 - i9;
            if (motionEvent != null) {
                motionEvent.offsetLocation(i7, i9);
            }
            int[] iArr2 = this.l0;
            iArr2[0] = iArr2[0] + iArr[0];
            iArr2[1] = iArr2[1] + iArr[1];
        } else if (getOverScrollMode() != 2) {
            if (motionEvent != null && (motionEvent.getSource() & 8194) != 8194) {
                float x5 = motionEvent.getX();
                float f3 = 0;
                float y5 = motionEvent.getY();
                if (f3 < 0.0f) {
                    if (this.z == null) {
                        this.f4683y.getClass();
                        EdgeEffect edgeEffect = new EdgeEffect(getContext());
                        this.z = edgeEffect;
                        if (this.f4656f) {
                            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                        } else {
                            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
                        }
                    }
                    c.a(this.z, (-f3) / getWidth(), 1.0f - (y5 / getHeight()));
                } else {
                    if (f3 > 0.0f) {
                        if (this.f4631B == null) {
                            this.f4683y.getClass();
                            EdgeEffect edgeEffect2 = new EdgeEffect(getContext());
                            this.f4631B = edgeEffect2;
                            if (this.f4656f) {
                                edgeEffect2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                            } else {
                                edgeEffect2.setSize(getMeasuredHeight(), getMeasuredWidth());
                            }
                        }
                        c.a(this.f4631B, f3 / getWidth(), y5 / getHeight());
                    }
                    if (f3 >= 0.0f) {
                        if (this.f4630A == null) {
                            this.f4683y.getClass();
                            EdgeEffect edgeEffect3 = new EdgeEffect(getContext());
                            this.f4630A = edgeEffect3;
                            if (this.f4656f) {
                                edgeEffect3.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
                            } else {
                                edgeEffect3.setSize(getMeasuredWidth(), getMeasuredHeight());
                            }
                        }
                        c.a(this.f4630A, (-f3) / getHeight(), x5 / getWidth());
                    } else if (f3 > 0.0f) {
                        if (this.f4632C == null) {
                            this.f4683y.getClass();
                            EdgeEffect edgeEffect4 = new EdgeEffect(getContext());
                            this.f4632C = edgeEffect4;
                            if (this.f4656f) {
                                edgeEffect4.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
                            } else {
                                edgeEffect4.setSize(getMeasuredWidth(), getMeasuredHeight());
                            }
                        }
                        c.a(this.f4632C, f3 / getHeight(), 1.0f - (x5 / getWidth()));
                    } else {
                        z5 = z;
                    }
                    if (!z5 || f3 != 0.0f || f3 != 0.0f) {
                        Field field = G.f566a;
                        postInvalidateOnAnimation();
                    }
                }
                z = true;
                if (f3 >= 0.0f) {
                }
                if (!z5) {
                }
                Field field2 = G.f566a;
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
        int i6;
        t tVar = this.f4662i;
        if (tVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f4675q) {
            return;
        }
        int i7 = !tVar.b() ? 0 : i2;
        int i8 = !this.f4662i.c() ? 0 : i3;
        if (i7 == 0 && i8 == 0) {
            return;
        }
        D d6 = this.f4649b0;
        d6.getClass();
        int abs = Math.abs(i7);
        int abs2 = Math.abs(i8);
        boolean z = abs > abs2;
        int sqrt = (int) Math.sqrt(0);
        int sqrt2 = (int) Math.sqrt((i8 * i8) + (i7 * i7));
        RecyclerView recyclerView = d6.f3269g;
        int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
        int i9 = width / 2;
        float f3 = width;
        float f6 = i9;
        float sin = (((float) Math.sin((Math.min(1.0f, (sqrt2 * 1.0f) / f3) - 0.5f) * 0.47123894f)) * f6) + f6;
        if (sqrt > 0) {
            i6 = Math.round(Math.abs(sin / sqrt) * 1000.0f) * 4;
        } else {
            if (!z) {
                abs = abs2;
            }
            i6 = (int) (((abs / f3) + 1.0f) * 300.0f);
        }
        int min = Math.min(i6, 2000);
        a aVar = r0;
        if (d6.f3266d != aVar) {
            d6.f3266d = aVar;
            d6.f3265c = new OverScroller(recyclerView.getContext(), aVar);
        }
        recyclerView.setScrollState(2);
        d6.f3264b = 0;
        d6.f3263a = 0;
        d6.f3265c.startScroll(0, 0, i7, i8, min);
        d6.a();
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
        this.f4662i.getClass();
        if (this.f4681w <= 0 && view2 != null) {
            o(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f4662i.G(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.f4666k;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C0162g) arrayList.get(i2)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f4674p != 0 || this.f4675q) {
            return;
        }
        super.requestLayout();
    }

    public final void s(int i2) {
        getScrollingChildHelper().h(i2);
    }

    @Override // android.view.View
    public final void scrollBy(int i2, int i3) {
        t tVar = this.f4662i;
        if (tVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f4675q) {
            return;
        }
        boolean b6 = tVar.b();
        boolean c2 = this.f4662i.c();
        if (b6 || c2) {
            if (!b6) {
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
        if (this.f4681w <= 0) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.f4677s |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(F f3) {
        this.f4661h0 = f3;
        G.a(this, f3);
    }

    public void setAdapter(p pVar) {
        setLayoutFrozen(false);
        s sVar = this.f4633D;
        if (sVar != null) {
            sVar.a();
        }
        t tVar = this.f4662i;
        l lVar = this.f4646a;
        if (tVar != null) {
            tVar.E();
            this.f4662i.F(lVar);
        }
        ((ArrayList) lVar.f2903c).clear();
        ArrayList arrayList = (ArrayList) lVar.f2904d;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            AbstractC0279e.o(arrayList.get(size));
            throw null;
        }
        arrayList.clear();
        C0164i c0164i = ((RecyclerView) lVar.f2906f).f4653d0;
        c0164i.getClass();
        c0164i.f3341c = 0;
        i iVar = this.f4650c;
        iVar.Q((ArrayList) iVar.f312c);
        iVar.Q((ArrayList) iVar.f313d);
        ((ArrayList) lVar.f2903c).clear();
        ArrayList arrayList2 = (ArrayList) lVar.f2904d;
        int size2 = arrayList2.size() - 1;
        if (size2 >= 0) {
            AbstractC0279e.o(arrayList2.get(size2));
            throw null;
        }
        arrayList2.clear();
        RecyclerView recyclerView = (RecyclerView) lVar.f2906f;
        C0164i c0164i2 = recyclerView.f4653d0;
        c0164i2.getClass();
        c0164i2.f3341c = 0;
        if (((y) lVar.f2905e) == null) {
            y yVar = new y();
            yVar.f3376a = new SparseArray();
            yVar.f3377b = 0;
            lVar.f2905e = yVar;
        }
        y yVar2 = (y) lVar.f2905e;
        if (yVar2.f3377b == 0) {
            SparseArray sparseArray = yVar2.f3376a;
            if (sparseArray.size() > 0) {
                ((x) sparseArray.valueAt(0)).getClass();
                throw null;
            }
        }
        this.f4655e0.f3259b = true;
        this.f4680v = this.f4680v;
        this.f4679u = true;
        int I5 = this.f4652d.I();
        for (int i2 = 0; i2 < I5; i2++) {
            j(this.f4652d.H(i2));
        }
        m();
        int size3 = arrayList2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            if (arrayList2.get(i3) != null) {
                throw new ClassCastException();
            }
        }
        int size4 = arrayList2.size() - 1;
        if (size4 >= 0) {
            AbstractC0279e.o(arrayList2.get(size4));
            throw null;
        }
        arrayList2.clear();
        C0164i c0164i3 = recyclerView.f4653d0;
        c0164i3.getClass();
        c0164i3.f3341c = 0;
        requestLayout();
    }

    public void setChildDrawingOrderCallback(q qVar) {
        if (qVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.f4656f) {
            this.f4632C = null;
            this.f4630A = null;
            this.f4631B = null;
            this.z = null;
        }
        this.f4656f = z;
        super.setClipToPadding(z);
        if (this.f4673o) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(r rVar) {
        rVar.getClass();
        this.f4683y = rVar;
        this.f4632C = null;
        this.f4630A = null;
        this.f4631B = null;
        this.z = null;
    }

    public void setHasFixedSize(boolean z) {
        this.f4671n = z;
    }

    public void setItemAnimator(s sVar) {
        s sVar2 = this.f4633D;
        if (sVar2 != null) {
            sVar2.a();
            this.f4633D.f3363a = null;
        }
        this.f4633D = sVar;
        if (sVar != null) {
            sVar.f3363a = this.f4659g0;
        }
    }

    public void setItemViewCacheSize(int i2) {
        l lVar = this.f4646a;
        lVar.f2901a = i2;
        lVar.f();
    }

    public void setLayoutFrozen(boolean z) {
        if (z != this.f4675q) {
            b("Do not setLayoutFrozen in layout or scroll");
            if (!z) {
                this.f4675q = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f4675q = true;
            this.f4676r = true;
            setScrollState(0);
            D d6 = this.f4649b0;
            d6.f3269g.removeCallbacks(d6);
            d6.f3265c.abortAnimation();
        }
    }

    public void setLayoutManager(t tVar) {
        U.e eVar;
        if (tVar == this.f4662i) {
            return;
        }
        setScrollState(0);
        D d6 = this.f4649b0;
        d6.f3269g.removeCallbacks(d6);
        d6.f3265c.abortAnimation();
        t tVar2 = this.f4662i;
        l lVar = this.f4646a;
        if (tVar2 != null) {
            s sVar = this.f4633D;
            if (sVar != null) {
                sVar.a();
            }
            this.f4662i.E();
            this.f4662i.F(lVar);
            ((ArrayList) lVar.f2903c).clear();
            ArrayList arrayList = (ArrayList) lVar.f2904d;
            int size = arrayList.size() - 1;
            if (size >= 0) {
                AbstractC0279e.o(arrayList.get(size));
                throw null;
            }
            arrayList.clear();
            C0164i c0164i = ((RecyclerView) lVar.f2906f).f4653d0;
            c0164i.getClass();
            c0164i.f3341c = 0;
            if (this.f4669m) {
                t tVar3 = this.f4662i;
                tVar3.f3371e = false;
                tVar3.z(this);
            }
            this.f4662i.I(null);
            this.f4662i = null;
        } else {
            ((ArrayList) lVar.f2903c).clear();
            ArrayList arrayList2 = (ArrayList) lVar.f2904d;
            int size2 = arrayList2.size() - 1;
            if (size2 >= 0) {
                AbstractC0279e.o(arrayList2.get(size2));
                throw null;
            }
            arrayList2.clear();
            C0164i c0164i2 = ((RecyclerView) lVar.f2906f).f4653d0;
            c0164i2.getClass();
            c0164i2.f3341c = 0;
        }
        i iVar = this.f4652d;
        ((C0157b) iVar.f312c).d();
        ArrayList arrayList3 = (ArrayList) iVar.f313d;
        int size3 = arrayList3.size() - 1;
        while (true) {
            eVar = (U.e) iVar.f311b;
            if (size3 < 0) {
                break;
            }
            j((View) arrayList3.get(size3));
            arrayList3.remove(size3);
            size3--;
        }
        RecyclerView recyclerView = (RecyclerView) eVar.f3053a;
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            j(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f4662i = tVar;
        if (tVar != null) {
            if (tVar.f3368b != null) {
                throw new IllegalArgumentException("LayoutManager " + tVar + " is already attached to a RecyclerView:" + tVar.f3368b.h());
            }
            tVar.I(this);
            if (this.f4669m) {
                this.f4662i.f3371e = true;
            }
        }
        lVar.f();
        requestLayout();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        C0039n scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f628d) {
            Field field = G.f566a;
            AbstractC0048x.z(scrollingChildHelper.f627c);
        }
        scrollingChildHelper.f628d = z;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.f4647a0 = z;
    }

    public void setRecycledViewPool(y yVar) {
        l lVar = this.f4646a;
        if (((y) lVar.f2905e) != null) {
            r1.f3377b--;
        }
        lVar.f2905e = yVar;
        if (yVar != null) {
            ((RecyclerView) lVar.f2906f).getAdapter();
        }
    }

    public void setScrollState(int i2) {
        if (i2 == this.f4634E) {
            return;
        }
        this.f4634E = i2;
        if (i2 != 2) {
            D d6 = this.f4649b0;
            d6.f3269g.removeCallbacks(d6);
            d6.f3265c.abortAnimation();
        }
        t tVar = this.f4662i;
        if (tVar != null) {
            tVar.D(i2);
        }
        ArrayList arrayList = this.f4657f0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((w) this.f4657f0.get(size)).getClass();
            }
        }
    }

    public void setScrollingTouchSlop(int i2) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 != 0) {
            if (i2 == 1) {
                this.f4641L = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i2 + "; using default value");
        }
        this.f4641L = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(C c2) {
        this.f4646a.getClass();
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
        t tVar = this.f4662i;
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
