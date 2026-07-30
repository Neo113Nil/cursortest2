package androidx.recyclerview.widget;

import A.b;
import A.d;
import A.j;
import E.a;
import F0.h;
import F0.i;
import L.A;
import L.AbstractC0042s;
import L.B;
import L.C;
import L.C0026b;
import L.C0027c;
import L.C0028d;
import L.C0032h;
import L.C0034j;
import L.D;
import L.F;
import L.G;
import L.H;
import L.I;
import L.K;
import L.RunnableC0036l;
import L.S;
import L.r;
import L.t;
import L.u;
import L.v;
import L.x;
import L.z;
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
import c0.E;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import w.AbstractC0250B;
import w.AbstractC0270p;
import w.C0261g;
import w.y;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {
    public static final int[] l0 = {R.attr.nestedScrollingEnabled};

    /* renamed from: m0, reason: collision with root package name */
    public static final int[] f1565m0 = {R.attr.clipToPadding};

    /* renamed from: n0, reason: collision with root package name */
    public static final Class[] f1566n0;

    /* renamed from: o0, reason: collision with root package name */
    public static final r f1567o0;

    /* renamed from: A, reason: collision with root package name */
    public int f1568A;

    /* renamed from: B, reason: collision with root package name */
    public final int f1569B;

    /* renamed from: C, reason: collision with root package name */
    public u f1570C;

    /* renamed from: D, reason: collision with root package name */
    public EdgeEffect f1571D;

    /* renamed from: E, reason: collision with root package name */
    public EdgeEffect f1572E;

    /* renamed from: F, reason: collision with root package name */
    public EdgeEffect f1573F;

    /* renamed from: G, reason: collision with root package name */
    public EdgeEffect f1574G;

    /* renamed from: H, reason: collision with root package name */
    public v f1575H;

    /* renamed from: I, reason: collision with root package name */
    public int f1576I;

    /* renamed from: J, reason: collision with root package name */
    public int f1577J;

    /* renamed from: K, reason: collision with root package name */
    public VelocityTracker f1578K;

    /* renamed from: L, reason: collision with root package name */
    public int f1579L;

    /* renamed from: M, reason: collision with root package name */
    public int f1580M;

    /* renamed from: N, reason: collision with root package name */
    public int f1581N;

    /* renamed from: O, reason: collision with root package name */
    public int f1582O;

    /* renamed from: P, reason: collision with root package name */
    public int f1583P;

    /* renamed from: Q, reason: collision with root package name */
    public final int f1584Q;

    /* renamed from: R, reason: collision with root package name */
    public final int f1585R;

    /* renamed from: S, reason: collision with root package name */
    public final float f1586S;
    public final float T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f1587U;

    /* renamed from: V, reason: collision with root package name */
    public final I f1588V;

    /* renamed from: W, reason: collision with root package name */
    public RunnableC0036l f1589W;

    /* renamed from: a0, reason: collision with root package name */
    public final C0034j f1590a0;

    /* renamed from: b0, reason: collision with root package name */
    public final G f1591b0;

    /* renamed from: c0, reason: collision with root package name */
    public ArrayList f1592c0;

    /* renamed from: d0, reason: collision with root package name */
    public final a f1593d0;

    /* renamed from: e, reason: collision with root package name */
    public final D f1594e;

    /* renamed from: e0, reason: collision with root package name */
    public K f1595e0;

    /* renamed from: f, reason: collision with root package name */
    public F f1596f;

    /* renamed from: f0, reason: collision with root package name */
    public C0261g f1597f0;

    /* renamed from: g, reason: collision with root package name */
    public final C0026b f1598g;

    /* renamed from: g0, reason: collision with root package name */
    public final int[] f1599g0;

    /* renamed from: h, reason: collision with root package name */
    public final C0026b f1600h;

    /* renamed from: h0, reason: collision with root package name */
    public final int[] f1601h0;

    /* renamed from: i, reason: collision with root package name */
    public final a f1602i;
    public final int[] i0;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1603j;

    /* renamed from: j0, reason: collision with root package name */
    public final ArrayList f1604j0;

    /* renamed from: k, reason: collision with root package name */
    public final Rect f1605k;

    /* renamed from: k0, reason: collision with root package name */
    public final b f1606k0;

    /* renamed from: l, reason: collision with root package name */
    public final Rect f1607l;

    /* renamed from: m, reason: collision with root package name */
    public x f1608m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f1609n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f1610o;

    /* renamed from: p, reason: collision with root package name */
    public C0032h f1611p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1612q;
    public boolean r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1613s;

    /* renamed from: t, reason: collision with root package name */
    public int f1614t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1615u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1616v;

    /* renamed from: w, reason: collision with root package name */
    public int f1617w;

    /* renamed from: x, reason: collision with root package name */
    public final AccessibilityManager f1618x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f1619y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1620z;

    static {
        Class cls = Integer.TYPE;
        f1566n0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f1567o0 = new r();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v4 */
    public RecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        float a2;
        char c2;
        int i2;
        TypedArray typedArray;
        ?? r15;
        Constructor constructor;
        Object[] objArr;
        int i3 = 8;
        this.f1594e = new D(this);
        this.f1602i = new a();
        this.f1605k = new Rect();
        this.f1607l = new Rect();
        new RectF();
        this.f1609n = new ArrayList();
        this.f1610o = new ArrayList();
        this.f1614t = 0;
        this.f1619y = false;
        this.f1620z = false;
        this.f1568A = 0;
        this.f1569B = 0;
        this.f1570C = new u();
        C0028d c0028d = new C0028d();
        c0028d.f590a = null;
        c0028d.f591b = new ArrayList();
        c0028d.f592c = 250L;
        c0028d.f593d = 250L;
        c0028d.f525e = new ArrayList();
        c0028d.f526f = new ArrayList();
        c0028d.f527g = new ArrayList();
        c0028d.f528h = new ArrayList();
        c0028d.f529i = new ArrayList();
        c0028d.f530j = new ArrayList();
        c0028d.f531k = new ArrayList();
        c0028d.f532l = new ArrayList();
        c0028d.f533m = new ArrayList();
        c0028d.f534n = new ArrayList();
        c0028d.f535o = new ArrayList();
        this.f1575H = c0028d;
        this.f1576I = 0;
        this.f1577J = -1;
        this.f1586S = Float.MIN_VALUE;
        this.T = Float.MIN_VALUE;
        boolean z2 = true;
        this.f1587U = true;
        this.f1588V = new I(this);
        this.f1590a0 = new C0034j();
        G g2 = new G();
        g2.f474a = 0;
        g2.f475b = false;
        g2.f476c = false;
        g2.f477d = false;
        g2.f478e = false;
        this.f1591b0 = g2;
        a aVar = new a(10);
        this.f1593d0 = aVar;
        this.f1599g0 = new int[2];
        this.f1601h0 = new int[2];
        this.i0 = new int[2];
        this.f1604j0 = new ArrayList();
        this.f1606k0 = new b(2, this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1565m0, 0, 0);
            this.f1603j = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.f1603j = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1583P = viewConfiguration.getScaledTouchSlop();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26) {
            Method method = AbstractC0250B.f3016a;
            a2 = y.a(viewConfiguration);
        } else {
            a2 = AbstractC0250B.a(viewConfiguration, context);
        }
        this.f1586S = a2;
        this.T = i4 >= 26 ? y.b(viewConfiguration) : AbstractC0250B.a(viewConfiguration, context);
        this.f1584Q = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1585R = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f1575H.f590a = aVar;
        this.f1598g = new C0026b(new a(9, this));
        this.f1600h = new C0026b(new j(i3, this));
        Field field = w.x.f3075a;
        if ((i4 >= 26 ? w.r.c(this) : 0) == 0 && i4 >= 26) {
            w.r.m(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f1618x = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new K(this));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, K.a.f462a, 0, 0);
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
                r15 = 1;
                new C0032h(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.aurifaber.valuta.rotatus.signum.modulus.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.aurifaber.valuta.rotatus.signum.modulus.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.aurifaber.valuta.rotatus.signum.modulus.R.dimen.fastscroll_margin));
            } else {
                c2 = 3;
                i2 = 4;
                typedArray = obtainStyledAttributes2;
                r15 = 1;
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
                        Class<? extends U> asSubclass = (isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).loadClass(trim).asSubclass(x.class);
                        try {
                            Constructor constructor2 = asSubclass.getConstructor(f1566n0);
                            objArr = new Object[i2];
                            objArr[0] = context;
                            objArr[r15] = attributeSet;
                            objArr[2] = 0;
                            objArr[c2] = 0;
                            constructor = constructor2;
                        } catch (NoSuchMethodException e2) {
                            try {
                                constructor = asSubclass.getConstructor(null);
                                objArr = null;
                            } catch (NoSuchMethodException e3) {
                                e3.initCause(e2);
                                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + trim, e3);
                            }
                        }
                        constructor.setAccessible(r15);
                        setLayoutManager((x) constructor.newInstance(objArr));
                    } catch (ClassCastException e4) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + trim, e4);
                    } catch (ClassNotFoundException e5) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + trim, e5);
                    } catch (IllegalAccessException e6) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + trim, e6);
                    } catch (InstantiationException e7) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e7);
                    } catch (InvocationTargetException e8) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e8);
                    }
                }
            }
            TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, l0, 0, 0);
            z2 = obtainStyledAttributes3.getBoolean(0, r15);
            obtainStyledAttributes3.recycle();
        } else {
            setDescendantFocusability(262144);
        }
        setNestedScrollingEnabled(z2);
    }

    private C0261g getScrollingChildHelper() {
        if (this.f1597f0 == null) {
            this.f1597f0 = new C0261g(this);
        }
        return this.f1597f0;
    }

    public static void j(View view) {
        if (view == null) {
            return;
        }
        ((L.y) view.getLayoutParams()).getClass();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i2, int i3) {
        x xVar = this.f1608m;
        if (xVar != null) {
            xVar.getClass();
        }
        super.addFocusables(arrayList, i2, i3);
    }

    public final void b(String str) {
        if (this.f1568A > 0) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + h());
        }
        if (this.f1569B > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + h()));
        }
    }

    public final void c(int i2, int i3) {
        boolean z2;
        EdgeEffect edgeEffect = this.f1571D;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            z2 = false;
        } else {
            this.f1571D.onRelease();
            z2 = this.f1571D.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f1573F;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.f1573F.onRelease();
            z2 |= this.f1573F.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1572E;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.f1572E.onRelease();
            z2 |= this.f1572E.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1574G;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.f1574G.onRelease();
            z2 |= this.f1574G.isFinished();
        }
        if (z2) {
            Field field = w.x.f3075a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof L.y) && this.f1608m.d((L.y) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        x xVar = this.f1608m;
        if (xVar != null && xVar.b()) {
            return this.f1608m.f(this.f1591b0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        x xVar = this.f1608m;
        if (xVar != null && xVar.b()) {
            this.f1608m.g(this.f1591b0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        x xVar = this.f1608m;
        if (xVar != null && xVar.b()) {
            return this.f1608m.h(this.f1591b0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        x xVar = this.f1608m;
        if (xVar != null && xVar.c()) {
            return this.f1608m.i(this.f1591b0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        x xVar = this.f1608m;
        if (xVar != null && xVar.c()) {
            this.f1608m.j(this.f1591b0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        x xVar = this.f1608m;
        if (xVar != null && xVar.c()) {
            return this.f1608m.k(this.f1591b0);
        }
        return 0;
    }

    public final void d() {
        C0026b c0026b = this.f1598g;
        if (!this.f1613s || this.f1619y) {
            int i2 = s.b.f2838a;
            Trace.beginSection("RV FullInvalidate");
            Log.e("RecyclerView", "No adapter attached; skipping layout");
            Trace.endSection();
            return;
        }
        if (((ArrayList) c0026b.f520f).size() > 0) {
            c0026b.getClass();
            if (((ArrayList) c0026b.f520f).size() > 0) {
                int i3 = s.b.f2838a;
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
        ArrayList arrayList = this.f1609n;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0032h c0032h = (C0032h) arrayList.get(i2);
            if (c0032h.f552l != c0032h.f554n.getWidth() || c0032h.f553m != c0032h.f554n.getHeight()) {
                c0032h.f552l = c0032h.f554n.getWidth();
                c0032h.f553m = c0032h.f554n.getHeight();
                c0032h.e(0);
            } else if (c0032h.f561v != 0) {
                if (c0032h.f555o) {
                    int i3 = c0032h.f552l;
                    int i4 = c0032h.f544d;
                    int i5 = i3 - i4;
                    int i6 = 0 - (0 / 2);
                    StateListDrawable stateListDrawable = c0032h.f542b;
                    stateListDrawable.setBounds(0, 0, i4, 0);
                    int i7 = c0032h.f553m;
                    Drawable drawable = c0032h.f543c;
                    drawable.setBounds(0, 0, c0032h.f545e, i7);
                    RecyclerView recyclerView = c0032h.f554n;
                    Field field = w.x.f3075a;
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
                if (c0032h.f556p) {
                    int i8 = c0032h.f553m;
                    int i9 = c0032h.f548h;
                    int i10 = i8 - i9;
                    StateListDrawable stateListDrawable2 = c0032h.f546f;
                    stateListDrawable2.setBounds(0, 0, 0, i9);
                    int i11 = c0032h.f552l;
                    Drawable drawable2 = c0032h.f547g;
                    drawable2.setBounds(0, 0, i11, c0032h.f549i);
                    canvas.translate(0.0f, i10);
                    drawable2.draw(canvas);
                    canvas.translate(0 - (0 / 2), 0.0f);
                    stateListDrawable2.draw(canvas);
                    canvas.translate(-r9, -i10);
                }
            }
        }
        EdgeEffect edgeEffect = this.f1571D;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f1603j ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f1571D;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f1572E;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f1603j) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f1572E;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f1573F;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f1603j ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f1573F;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f1574G;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f1603j) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f1574G;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(save4);
        }
        if ((z2 || this.f1575H == null || arrayList.size() <= 0 || !this.f1575H.b()) ? z2 : true) {
            Field field2 = w.x.f3075a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    public final void e(int i2, int i3) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        Field field = w.x.f3075a;
        setMeasuredDimension(x.e(i2, paddingRight, getMinimumWidth()), x.e(i3, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final boolean f(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return getScrollingChildHelper().c(i2, i3, iArr, iArr2, i4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i2) {
        int i3;
        this.f1608m.getClass();
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
            Rect rect = this.f1605k;
            char c2 = 0;
            rect.set(0, 0, width, height);
            int width2 = findNextFocus.getWidth();
            int height2 = findNextFocus.getHeight();
            Rect rect2 = this.f1607l;
            rect2.set(0, 0, width2, height2);
            offsetDescendantRectToMyCoords(view, rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect2);
            RecyclerView recyclerView = this.f1608m.f597b;
            Field field = w.x.f3075a;
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
        x xVar = this.f1608m;
        if (xVar != null) {
            return xVar.l();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + h());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        x xVar = this.f1608m;
        if (xVar != null) {
            return xVar.m(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + h());
    }

    public AbstractC0042s getAdapter() {
        return null;
    }

    @Override // android.view.View
    public int getBaseline() {
        x xVar = this.f1608m;
        if (xVar == null) {
            return super.getBaseline();
        }
        xVar.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i2, int i3) {
        return super.getChildDrawingOrder(i2, i3);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f1603j;
    }

    public K getCompatAccessibilityDelegate() {
        return this.f1595e0;
    }

    public u getEdgeEffectFactory() {
        return this.f1570C;
    }

    public v getItemAnimator() {
        return this.f1575H;
    }

    public int getItemDecorationCount() {
        return this.f1609n.size();
    }

    public x getLayoutManager() {
        return this.f1608m;
    }

    public int getMaxFlingVelocity() {
        return this.f1585R;
    }

    public int getMinFlingVelocity() {
        return this.f1584Q;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public z getOnFlingListener() {
        return null;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f1587U;
    }

    public C getRecycledViewPool() {
        D d2 = this.f1594e;
        if (d2.f471e == null) {
            C c2 = new C();
            c2.f465a = new SparseArray();
            c2.f466b = 0;
            d2.f471e = c2;
        }
        return d2.f471e;
    }

    public int getScrollState() {
        return this.f1576I;
    }

    public final String h() {
        return " " + super.toString() + ", adapter:null, layout:" + this.f1608m + ", context:" + getContext();
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
        return this.f1612q;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f3065d;
    }

    public final boolean k() {
        return getScrollingChildHelper().f(1);
    }

    public final boolean l() {
        return !this.f1613s || this.f1619y || ((ArrayList) this.f1598g.f520f).size() > 0;
    }

    public final void m() {
        int A2 = this.f1600h.A();
        for (int i2 = 0; i2 < A2; i2++) {
            ((L.y) this.f1600h.z(i2).getLayoutParams()).f604b = true;
        }
        ArrayList arrayList = this.f1594e.f468b;
        if (arrayList.size() <= 0) {
            return;
        }
        h.h(arrayList.get(0));
        throw null;
    }

    public final void n(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1577J) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.f1577J = motionEvent.getPointerId(i2);
            int x2 = (int) (motionEvent.getX(i2) + 0.5f);
            this.f1581N = x2;
            this.f1579L = x2;
            int y2 = (int) (motionEvent.getY(i2) + 0.5f);
            this.f1582O = y2;
            this.f1580M = y2;
        }
    }

    public final void o(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f1605k;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof L.y) {
            L.y yVar = (L.y) layoutParams;
            if (!yVar.f604b) {
                int i2 = rect.left;
                Rect rect2 = yVar.f603a;
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
        this.f1608m.G(this, view, this.f1605k, !this.f1613s, view2 == null);
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
        this.f1568A = 0;
        this.f1612q = true;
        if (this.f1613s && !isLayoutRequested()) {
            z2 = true;
        }
        this.f1613s = z2;
        x xVar = this.f1608m;
        if (xVar != null) {
            xVar.f600e = true;
        }
        ThreadLocal threadLocal = RunnableC0036l.f571i;
        RunnableC0036l runnableC0036l = (RunnableC0036l) threadLocal.get();
        this.f1589W = runnableC0036l;
        if (runnableC0036l == null) {
            RunnableC0036l runnableC0036l2 = new RunnableC0036l();
            runnableC0036l2.f573e = new ArrayList();
            runnableC0036l2.f576h = new ArrayList();
            this.f1589W = runnableC0036l2;
            Field field = w.x.f3075a;
            Display display = getDisplay();
            if (!isInEditMode() && display != null) {
                f2 = display.getRefreshRate();
            }
            f2 = 60.0f;
            RunnableC0036l runnableC0036l3 = this.f1589W;
            runnableC0036l3.f575g = (long) (1.0E9f / f2);
            threadLocal.set(runnableC0036l3);
        }
        this.f1589W.f573e.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Object obj;
        super.onDetachedFromWindow();
        v vVar = this.f1575H;
        if (vVar != null) {
            vVar.a();
        }
        setScrollState(0);
        I i2 = this.f1588V;
        i2.f485k.removeCallbacks(i2);
        i2.f481g.abortAnimation();
        this.f1612q = false;
        x xVar = this.f1608m;
        if (xVar != null) {
            xVar.f600e = false;
            xVar.z(this);
        }
        this.f1604j0.clear();
        removeCallbacks(this.f1606k0);
        this.f1602i.getClass();
        do {
            E e2 = S.f517a;
            int i3 = e2.f1667a;
            obj = null;
            if (i3 > 0) {
                int i4 = i3 - 1;
                Object[] objArr = e2.f1668b;
                Object obj2 = objArr[i4];
                i.c(obj2, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
                objArr[i4] = null;
                e2.f1667a--;
                obj = obj2;
            }
        } while (obj != null);
        RunnableC0036l runnableC0036l = this.f1589W;
        if (runnableC0036l != null) {
            runnableC0036l.f573e.remove(this);
            this.f1589W = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f1609n;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C0032h) arrayList.get(i2)).getClass();
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
        if (this.f1608m != null && !this.f1615u && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f2 = this.f1608m.c() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f1608m.b()) {
                    f3 = motionEvent.getAxisValue(10);
                    if (f2 == 0.0f || f3 != 0.0f) {
                        q((int) (f3 * this.f1586S), (int) (f2 * this.T), motionEvent);
                    }
                }
                f3 = 0.0f;
                if (f2 == 0.0f) {
                }
                q((int) (f3 * this.f1586S), (int) (f2 * this.T), motionEvent);
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f1608m.c()) {
                        f2 = -axisValue;
                        f3 = 0.0f;
                        if (f2 == 0.0f) {
                        }
                        q((int) (f3 * this.f1586S), (int) (f2 * this.T), motionEvent);
                    } else if (this.f1608m.b()) {
                        f3 = axisValue;
                        f2 = 0.0f;
                        if (f2 == 0.0f) {
                        }
                        q((int) (f3 * this.f1586S), (int) (f2 * this.T), motionEvent);
                    }
                }
                f2 = 0.0f;
                f3 = 0.0f;
                if (f2 == 0.0f) {
                }
                q((int) (f3 * this.f1586S), (int) (f2 * this.T), motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (this.f1615u) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            this.f1611p = null;
        }
        ArrayList arrayList = this.f1610o;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0032h c0032h = (C0032h) arrayList.get(i2);
            if (c0032h.c(motionEvent) && action != 3) {
                this.f1611p = c0032h;
                p();
                setScrollState(0);
                return true;
            }
        }
        x xVar = this.f1608m;
        if (xVar == null) {
            return false;
        }
        boolean b2 = xVar.b();
        boolean c2 = this.f1608m.c();
        if (this.f1578K == null) {
            this.f1578K = VelocityTracker.obtain();
        }
        this.f1578K.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f1616v) {
                this.f1616v = false;
            }
            this.f1577J = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.f1581N = x2;
            this.f1579L = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.f1582O = y2;
            this.f1580M = y2;
            if (this.f1576I == 2) {
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
            this.f1578K.clear();
            s(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f1577J);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f1577J + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f1576I != 1) {
                int i4 = x3 - this.f1579L;
                int i5 = y3 - this.f1580M;
                if (b2 == 0 || Math.abs(i4) <= this.f1583P) {
                    z2 = false;
                } else {
                    this.f1581N = x3;
                    z2 = true;
                }
                if (c2 && Math.abs(i5) > this.f1583P) {
                    this.f1582O = y3;
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
            this.f1577J = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f1581N = x4;
            this.f1579L = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f1582O = y4;
            this.f1580M = y4;
        } else if (actionMasked == 6) {
            n(motionEvent);
        }
        return this.f1576I == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6 = s.b.f2838a;
        Trace.beginSection("RV OnLayout");
        Log.e("RecyclerView", "No adapter attached; skipping layout");
        Trace.endSection();
        this.f1613s = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        x xVar = this.f1608m;
        if (xVar == null) {
            e(i2, i3);
            return;
        }
        if (xVar.y()) {
            View.MeasureSpec.getMode(i2);
            View.MeasureSpec.getMode(i3);
            this.f1608m.f597b.e(i2, i3);
        } else {
            if (this.r) {
                this.f1608m.f597b.e(i2, i3);
                return;
            }
            G g2 = this.f1591b0;
            if (g2.f478e) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            g2.getClass();
            this.f1614t++;
            this.f1608m.f597b.e(i2, i3);
            if (this.f1614t < 1) {
                this.f1614t = 1;
            }
            this.f1614t--;
            g2.f476c = false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (this.f1568A > 0) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof F)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        F f2 = (F) parcelable;
        this.f1596f = f2;
        super.onRestoreInstanceState(f2.f56a);
        x xVar = this.f1608m;
        if (xVar == null || (parcelable2 = this.f1596f.f473c) == null) {
            return;
        }
        xVar.B(parcelable2);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        F f2 = new F(super.onSaveInstanceState());
        F f3 = this.f1596f;
        if (f3 != null) {
            f2.f473c = f3.f473c;
        } else {
            x xVar = this.f1608m;
            if (xVar != null) {
                f2.f473c = xVar.C();
            } else {
                f2.f473c = null;
            }
        }
        return f2;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 == i4 && i3 == i5) {
            return;
        }
        this.f1574G = null;
        this.f1572E = null;
        this.f1573F = null;
        this.f1571D = null;
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
        if (this.f1615u || this.f1616v) {
            return false;
        }
        int action = motionEvent.getAction();
        C0032h c0032h = this.f1611p;
        if (c0032h != null) {
            if (action != 0) {
                if (c0032h.f557q != 0) {
                    if (motionEvent.getAction() == 0) {
                        boolean b2 = c0032h.b(motionEvent.getX(), motionEvent.getY());
                        boolean a2 = c0032h.a(motionEvent.getX(), motionEvent.getY());
                        if (b2 || a2) {
                            if (a2) {
                                c0032h.r = 1;
                                c0032h.f551k = (int) motionEvent.getX();
                            } else if (b2) {
                                c0032h.r = 2;
                                c0032h.f550j = (int) motionEvent.getY();
                            }
                            c0032h.e(2);
                        }
                    } else if (motionEvent.getAction() == 1 && c0032h.f557q == 2) {
                        c0032h.f550j = 0.0f;
                        c0032h.f551k = 0.0f;
                        c0032h.e(1);
                        c0032h.r = 0;
                    } else if (motionEvent.getAction() == 2 && c0032h.f557q == 2) {
                        c0032h.f();
                        int i2 = c0032h.r;
                        int i3 = c0032h.f541a;
                        if (i2 == 1) {
                            float x2 = motionEvent.getX();
                            int[] iArr = c0032h.f559t;
                            iArr[0] = i3;
                            int i4 = c0032h.f552l - i3;
                            iArr[1] = i4;
                            float max = Math.max(i3, Math.min(i4, x2));
                            if (Math.abs(0 - max) >= 2.0f) {
                                float f2 = c0032h.f551k;
                                int computeHorizontalScrollRange = c0032h.f554n.computeHorizontalScrollRange();
                                c0032h.f554n.computeHorizontalScrollOffset();
                                int d2 = C0032h.d(f2, max, iArr, computeHorizontalScrollRange, 0, c0032h.f552l);
                                if (d2 != 0) {
                                    c0032h.f554n.scrollBy(d2, 0);
                                }
                                c0032h.f551k = max;
                            }
                        }
                        if (c0032h.r == 2) {
                            float y2 = motionEvent.getY();
                            int[] iArr2 = c0032h.f558s;
                            iArr2[0] = i3;
                            int i5 = c0032h.f553m - i3;
                            iArr2[1] = i5;
                            float max2 = Math.max(i3, Math.min(i5, y2));
                            if (Math.abs(0 - max2) >= 2.0f) {
                                float f3 = c0032h.f550j;
                                int computeVerticalScrollRange = c0032h.f554n.computeVerticalScrollRange();
                                c0032h.f554n.computeVerticalScrollOffset();
                                int d3 = C0032h.d(f3, max2, iArr2, computeVerticalScrollRange, 0, c0032h.f553m);
                                if (d3 != 0) {
                                    c0032h.f554n.scrollBy(0, d3);
                                }
                                c0032h.f550j = max2;
                            }
                        }
                    }
                }
                if (action == 3 || action == 1) {
                    this.f1611p = null;
                }
                p();
                setScrollState(0);
                return true;
            }
            this.f1611p = null;
        }
        if (action != 0) {
            ArrayList arrayList = this.f1610o;
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                C0032h c0032h2 = (C0032h) arrayList.get(i6);
                if (c0032h2.c(motionEvent)) {
                    this.f1611p = c0032h2;
                    p();
                    setScrollState(0);
                    return true;
                }
            }
        }
        x xVar = this.f1608m;
        if (xVar == null) {
            return false;
        }
        boolean b3 = xVar.b();
        boolean c2 = this.f1608m.c();
        if (this.f1578K == null) {
            this.f1578K = VelocityTracker.obtain();
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
            this.f1577J = motionEvent.getPointerId(0);
            int x3 = (int) (motionEvent.getX() + 0.5f);
            this.f1581N = x3;
            this.f1579L = x3;
            int y3 = (int) (motionEvent.getY() + 0.5f);
            this.f1582O = y3;
            this.f1580M = y3;
            int i7 = b3;
            if (c2) {
                i7 = (b3 ? 1 : 0) | 2;
            }
            getScrollingChildHelper().g(i7, 0);
        } else {
            if (actionMasked == 1) {
                this.f1578K.addMovement(obtain);
                VelocityTracker velocityTracker = this.f1578K;
                int i8 = this.f1585R;
                velocityTracker.computeCurrentVelocity(1000, i8);
                float f4 = b3 != 0 ? -this.f1578K.getXVelocity(this.f1577J) : 0.0f;
                float f5 = c2 ? -this.f1578K.getYVelocity(this.f1577J) : 0.0f;
                if (f4 != 0.0f || f5 != 0.0f) {
                    int i9 = (int) f4;
                    int i10 = (int) f5;
                    x xVar2 = this.f1608m;
                    if (xVar2 == null) {
                        Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                    } else if (!this.f1615u) {
                        boolean b4 = xVar2.b();
                        boolean c3 = this.f1608m.c();
                        int i11 = this.f1584Q;
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
                                    I i14 = this.f1588V;
                                    i14.f485k.setScrollState(2);
                                    i14.f480f = 0;
                                    i14.f479e = 0;
                                    i14.f481g.fling(0, 0, max3, max4, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                    i14.a();
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
                int findPointerIndex = motionEvent.findPointerIndex(this.f1577J);
                if (findPointerIndex < 0) {
                    Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f1577J + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                int x4 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                int y4 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                int i15 = this.f1581N - x4;
                int i16 = this.f1582O - y4;
                boolean f8 = f(i15, i16, this.f1601h0, this.f1599g0, 0);
                int[] iArr4 = this.f1599g0;
                if (f8) {
                    int[] iArr5 = this.f1601h0;
                    i15 -= iArr5[0];
                    i16 -= iArr5[1];
                    obtain.offsetLocation(iArr4[0], iArr4[1]);
                    iArr3[0] = iArr3[0] + iArr4[0];
                    iArr3[1] = iArr3[1] + iArr4[1];
                }
                if (this.f1576I != 1) {
                    if (b3 != 0) {
                        int abs = Math.abs(i15);
                        int i17 = this.f1583P;
                        if (abs > i17) {
                            i15 = i15 > 0 ? i15 - i17 : i15 + i17;
                            z2 = true;
                            if (c2) {
                                int abs2 = Math.abs(i16);
                                int i18 = this.f1583P;
                                if (abs2 > i18) {
                                    i16 = i16 > 0 ? i16 - i18 : i16 + i18;
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
                int i19 = i16;
                if (this.f1576I == 1) {
                    this.f1581N = x4 - iArr4[0];
                    this.f1582O = y4 - iArr4[1];
                    q(b3 != 0 ? i15 : 0, c2 ? i19 : 0, obtain);
                    RunnableC0036l runnableC0036l = this.f1589W;
                    if (runnableC0036l != null && (i15 != 0 || i19 != 0)) {
                        runnableC0036l.a(this, i15, i19);
                    }
                }
            } else if (actionMasked == 3) {
                p();
                setScrollState(0);
            } else if (actionMasked == 5) {
                this.f1577J = motionEvent.getPointerId(actionIndex);
                int x5 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.f1581N = x5;
                this.f1579L = x5;
                int y5 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.f1582O = y5;
                this.f1580M = y5;
            } else if (actionMasked == 6) {
                n(motionEvent);
            }
        }
        this.f1578K.addMovement(obtain);
        obtain.recycle();
        return true;
    }

    public final void p() {
        VelocityTracker velocityTracker = this.f1578K;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z2 = false;
        s(0);
        EdgeEffect edgeEffect = this.f1571D;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = this.f1571D.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f1572E;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 |= this.f1572E.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1573F;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 |= this.f1573F.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1574G;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z2 |= this.f1574G.isFinished();
        }
        if (z2) {
            Field field = w.x.f3075a;
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
        if (!this.f1609n.isEmpty()) {
            invalidate();
        }
        int[] iArr = this.f1599g0;
        boolean z2 = false;
        boolean z3 = true;
        if (g(iArr, 0)) {
            int i4 = this.f1581N;
            int i5 = iArr[0];
            this.f1581N = i4 - i5;
            int i6 = this.f1582O;
            int i7 = iArr[1];
            this.f1582O = i6 - i7;
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
                    if (this.f1571D == null) {
                        this.f1570C.getClass();
                        EdgeEffect edgeEffect = new EdgeEffect(getContext());
                        this.f1571D = edgeEffect;
                        if (this.f1603j) {
                            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                        } else {
                            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
                        }
                    }
                    d.a(this.f1571D, (-f2) / getWidth(), 1.0f - (y2 / getHeight()));
                } else {
                    if (f2 > 0.0f) {
                        if (this.f1573F == null) {
                            this.f1570C.getClass();
                            EdgeEffect edgeEffect2 = new EdgeEffect(getContext());
                            this.f1573F = edgeEffect2;
                            if (this.f1603j) {
                                edgeEffect2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                            } else {
                                edgeEffect2.setSize(getMeasuredHeight(), getMeasuredWidth());
                            }
                        }
                        d.a(this.f1573F, f2 / getWidth(), y2 / getHeight());
                    }
                    if (f2 >= 0.0f) {
                        if (this.f1572E == null) {
                            this.f1570C.getClass();
                            EdgeEffect edgeEffect3 = new EdgeEffect(getContext());
                            this.f1572E = edgeEffect3;
                            if (this.f1603j) {
                                edgeEffect3.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
                            } else {
                                edgeEffect3.setSize(getMeasuredWidth(), getMeasuredHeight());
                            }
                        }
                        d.a(this.f1572E, (-f2) / getHeight(), x2 / getWidth());
                    } else if (f2 > 0.0f) {
                        if (this.f1574G == null) {
                            this.f1570C.getClass();
                            EdgeEffect edgeEffect4 = new EdgeEffect(getContext());
                            this.f1574G = edgeEffect4;
                            if (this.f1603j) {
                                edgeEffect4.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
                            } else {
                                edgeEffect4.setSize(getMeasuredWidth(), getMeasuredHeight());
                            }
                        }
                        d.a(this.f1574G, f2 / getHeight(), 1.0f - (x2 / getWidth()));
                    } else {
                        z3 = z2;
                    }
                    if (!z3 || f2 != 0.0f || f2 != 0.0f) {
                        Field field = w.x.f3075a;
                        postInvalidateOnAnimation();
                    }
                }
                z2 = true;
                if (f2 >= 0.0f) {
                }
                if (!z3) {
                }
                Field field2 = w.x.f3075a;
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
        x xVar = this.f1608m;
        if (xVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f1615u) {
            return;
        }
        int i5 = !xVar.b() ? 0 : i2;
        int i6 = !this.f1608m.c() ? 0 : i3;
        if (i5 == 0 && i6 == 0) {
            return;
        }
        I i7 = this.f1588V;
        i7.getClass();
        int abs = Math.abs(i5);
        int abs2 = Math.abs(i6);
        boolean z2 = abs > abs2;
        int sqrt = (int) Math.sqrt(0);
        int sqrt2 = (int) Math.sqrt((i6 * i6) + (i5 * i5));
        RecyclerView recyclerView = i7.f485k;
        int width = z2 ? recyclerView.getWidth() : recyclerView.getHeight();
        int i8 = width / 2;
        float f2 = width;
        float f3 = i8;
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
        r rVar = f1567o0;
        if (i7.f482h != rVar) {
            i7.f482h = rVar;
            i7.f481g = new OverScroller(recyclerView.getContext(), rVar);
        }
        recyclerView.setScrollState(2);
        i7.f480f = 0;
        i7.f479e = 0;
        i7.f481g.startScroll(0, 0, i5, i6, min);
        i7.a();
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
        this.f1608m.getClass();
        if (this.f1568A <= 0 && view2 != null) {
            o(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.f1608m.G(this, view, rect, z2, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        ArrayList arrayList = this.f1610o;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C0032h) arrayList.get(i2)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f1614t != 0 || this.f1615u) {
            return;
        }
        super.requestLayout();
    }

    public final void s(int i2) {
        getScrollingChildHelper().h(i2);
    }

    @Override // android.view.View
    public final void scrollBy(int i2, int i3) {
        x xVar = this.f1608m;
        if (xVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f1615u) {
            return;
        }
        boolean b2 = xVar.b();
        boolean c2 = this.f1608m.c();
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
        if (this.f1568A <= 0) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.f1617w |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(K k2) {
        this.f1595e0 = k2;
        w.x.a(this, k2);
    }

    public void setAdapter(AbstractC0042s abstractC0042s) {
        setLayoutFrozen(false);
        v vVar = this.f1575H;
        if (vVar != null) {
            vVar.a();
        }
        x xVar = this.f1608m;
        D d2 = this.f1594e;
        if (xVar != null) {
            xVar.E();
            this.f1608m.F(d2);
        }
        d2.f467a.clear();
        ArrayList arrayList = d2.f468b;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            h.h(arrayList.get(size));
            throw null;
        }
        arrayList.clear();
        C0034j c0034j = d2.f472f.f1590a0;
        c0034j.getClass();
        c0034j.f565c = 0;
        C0026b c0026b = this.f1598g;
        c0026b.I((ArrayList) c0026b.f520f);
        c0026b.I((ArrayList) c0026b.f522h);
        d2.f467a.clear();
        ArrayList arrayList2 = d2.f468b;
        int size2 = arrayList2.size() - 1;
        if (size2 >= 0) {
            h.h(arrayList2.get(size2));
            throw null;
        }
        arrayList2.clear();
        RecyclerView recyclerView = d2.f472f;
        C0034j c0034j2 = recyclerView.f1590a0;
        c0034j2.getClass();
        c0034j2.f565c = 0;
        if (d2.f471e == null) {
            C c2 = new C();
            c2.f465a = new SparseArray();
            c2.f466b = 0;
            d2.f471e = c2;
        }
        C c3 = d2.f471e;
        if (c3.f466b == 0) {
            SparseArray sparseArray = c3.f465a;
            if (sparseArray.size() > 0) {
                ((B) sparseArray.valueAt(0)).getClass();
                throw null;
            }
        }
        this.f1591b0.f475b = true;
        this.f1620z = this.f1620z;
        this.f1619y = true;
        int A2 = this.f1600h.A();
        for (int i2 = 0; i2 < A2; i2++) {
            j(this.f1600h.z(i2));
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
            h.h(arrayList2.get(size4));
            throw null;
        }
        arrayList2.clear();
        C0034j c0034j3 = recyclerView.f1590a0;
        c0034j3.getClass();
        c0034j3.f565c = 0;
        requestLayout();
    }

    public void setChildDrawingOrderCallback(t tVar) {
        if (tVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z2) {
        if (z2 != this.f1603j) {
            this.f1574G = null;
            this.f1572E = null;
            this.f1573F = null;
            this.f1571D = null;
        }
        this.f1603j = z2;
        super.setClipToPadding(z2);
        if (this.f1613s) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(u uVar) {
        uVar.getClass();
        this.f1570C = uVar;
        this.f1574G = null;
        this.f1572E = null;
        this.f1573F = null;
        this.f1571D = null;
    }

    public void setHasFixedSize(boolean z2) {
        this.r = z2;
    }

    public void setItemAnimator(v vVar) {
        v vVar2 = this.f1575H;
        if (vVar2 != null) {
            vVar2.a();
            this.f1575H.f590a = null;
        }
        this.f1575H = vVar;
        if (vVar != null) {
            vVar.f590a = this.f1593d0;
        }
    }

    public void setItemViewCacheSize(int i2) {
        D d2 = this.f1594e;
        d2.f469c = i2;
        d2.b();
    }

    public void setLayoutFrozen(boolean z2) {
        if (z2 != this.f1615u) {
            b("Do not setLayoutFrozen in layout or scroll");
            if (!z2) {
                this.f1615u = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f1615u = true;
            this.f1616v = true;
            setScrollState(0);
            I i2 = this.f1588V;
            i2.f485k.removeCallbacks(i2);
            i2.f481g.abortAnimation();
        }
    }

    public void setLayoutManager(x xVar) {
        j jVar;
        if (xVar == this.f1608m) {
            return;
        }
        setScrollState(0);
        I i2 = this.f1588V;
        i2.f485k.removeCallbacks(i2);
        i2.f481g.abortAnimation();
        x xVar2 = this.f1608m;
        D d2 = this.f1594e;
        if (xVar2 != null) {
            v vVar = this.f1575H;
            if (vVar != null) {
                vVar.a();
            }
            this.f1608m.E();
            this.f1608m.F(d2);
            d2.f467a.clear();
            ArrayList arrayList = d2.f468b;
            int size = arrayList.size() - 1;
            if (size >= 0) {
                h.h(arrayList.get(size));
                throw null;
            }
            arrayList.clear();
            C0034j c0034j = d2.f472f.f1590a0;
            c0034j.getClass();
            c0034j.f565c = 0;
            if (this.f1612q) {
                x xVar3 = this.f1608m;
                xVar3.f600e = false;
                xVar3.z(this);
            }
            this.f1608m.I(null);
            this.f1608m = null;
        } else {
            d2.f467a.clear();
            ArrayList arrayList2 = d2.f468b;
            int size2 = arrayList2.size() - 1;
            if (size2 >= 0) {
                h.h(arrayList2.get(size2));
                throw null;
            }
            arrayList2.clear();
            C0034j c0034j2 = d2.f472f.f1590a0;
            c0034j2.getClass();
            c0034j2.f565c = 0;
        }
        C0026b c0026b = this.f1600h;
        ((C0027c) c0026b.f522h).c();
        ArrayList arrayList3 = (ArrayList) c0026b.f520f;
        int size3 = arrayList3.size() - 1;
        while (true) {
            jVar = (j) c0026b.f521g;
            if (size3 < 0) {
                break;
            }
            j((View) arrayList3.get(size3));
            arrayList3.remove(size3);
            size3--;
        }
        RecyclerView recyclerView = (RecyclerView) jVar.f30f;
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            j(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f1608m = xVar;
        if (xVar != null) {
            if (xVar.f597b != null) {
                throw new IllegalArgumentException("LayoutManager " + xVar + " is already attached to a RecyclerView:" + xVar.f597b.h());
            }
            xVar.I(this);
            if (this.f1612q) {
                this.f1608m.f600e = true;
            }
        }
        d2.b();
        requestLayout();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        C0261g scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f3065d) {
            Field field = w.x.f3075a;
            AbstractC0270p.z(scrollingChildHelper.f3064c);
        }
        scrollingChildHelper.f3065d = z2;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.f1587U = z2;
    }

    public void setRecycledViewPool(C c2) {
        D d2 = this.f1594e;
        if (d2.f471e != null) {
            r1.f466b--;
        }
        d2.f471e = c2;
        if (c2 != null) {
            d2.f472f.getAdapter();
        }
    }

    public void setScrollState(int i2) {
        if (i2 == this.f1576I) {
            return;
        }
        this.f1576I = i2;
        if (i2 != 2) {
            I i3 = this.f1588V;
            i3.f485k.removeCallbacks(i3);
            i3.f481g.abortAnimation();
        }
        x xVar = this.f1608m;
        if (xVar != null) {
            xVar.D(i2);
        }
        ArrayList arrayList = this.f1592c0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((A) this.f1592c0.get(size)).getClass();
            }
        }
    }

    public void setScrollingTouchSlop(int i2) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 != 0) {
            if (i2 == 1) {
                this.f1583P = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i2 + "; using default value");
        }
        this.f1583P = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(H h2) {
        this.f1594e.getClass();
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
        x xVar = this.f1608m;
        if (xVar != null) {
            return xVar.n(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + h());
    }

    public void setOnFlingListener(z zVar) {
    }

    @Deprecated
    public void setOnScrollListener(A a2) {
    }

    public void setRecyclerListener(L.E e2) {
    }
}
