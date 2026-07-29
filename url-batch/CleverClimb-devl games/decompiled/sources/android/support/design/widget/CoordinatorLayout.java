package android.support.design.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.coreui.R;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.math.MathUtils;
import android.support.v4.util.ObjectsCompat;
import android.support.v4.util.Pools;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.NestedScrollingParent2;
import android.support.v4.view.NestedScrollingParentHelper;
import android.support.v4.view.OnApplyWindowInsetsListener;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.WindowInsetsCompat;
import android.support.v4.widget.DirectedAcyclicGraph;
import android.support.v4.widget.ViewGroupUtils;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements NestedScrollingParent2 {

    /* renamed from: a, reason: collision with root package name */
    static final String f1495a;

    /* renamed from: b, reason: collision with root package name */
    static final Class<?>[] f1496b;

    /* renamed from: c, reason: collision with root package name */
    static final ThreadLocal<Map<String, Constructor<b>>> f1497c;

    /* renamed from: d, reason: collision with root package name */
    static final Comparator<View> f1498d;
    private static final Pools.Pool<Rect> f;
    ViewGroup.OnHierarchyChangeListener e;
    private final List<View> g;
    private final DirectedAcyclicGraph<View> h;
    private final List<View> i;
    private final List<View> j;
    private final int[] k;
    private Paint l;
    private boolean m;
    private boolean n;
    private int[] o;
    private View p;
    private View q;
    private f r;
    private boolean s;
    private WindowInsetsCompat t;
    private boolean u;
    private Drawable v;
    private OnApplyWindowInsetsListener w;
    private final NestedScrollingParentHelper x;

    public interface a {
        b a();
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    public @interface c {
        Class<? extends b> a();
    }

    private static int c(int i) {
        if ((i & 7) == 0) {
            i |= GravityCompat.START;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    private static int d(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    private static int e(int i) {
        if (i == 0) {
            return 17;
        }
        return i;
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        f1495a = r0 != null ? r0.getName() : null;
        if (Build.VERSION.SDK_INT >= 21) {
            f1498d = new g();
        } else {
            f1498d = null;
        }
        f1496b = new Class[]{Context.class, AttributeSet.class};
        f1497c = new ThreadLocal<>();
        f = new Pools.SynchronizedPool(12);
    }

    private static Rect e() {
        Rect acquire = f.acquire();
        return acquire == null ? new Rect() : acquire;
    }

    private static void a(Rect rect) {
        rect.setEmpty();
        f.release(rect);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes;
        this.g = new ArrayList();
        this.h = new DirectedAcyclicGraph<>();
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = new int[2];
        this.x = new NestedScrollingParentHelper(this);
        if (i == 0) {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CoordinatorLayout, 0, R.style.Widget_Support_CoordinatorLayout);
        } else {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CoordinatorLayout, i, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(R.styleable.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.o = resources.getIntArray(resourceId);
            float f2 = resources.getDisplayMetrics().density;
            int length = this.o.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.o[i2] = (int) (this.o[i2] * f2);
            }
        }
        this.v = obtainStyledAttributes.getDrawable(R.styleable.CoordinatorLayout_statusBarBackground);
        obtainStyledAttributes.recycle();
        g();
        super.setOnHierarchyChangeListener(new d());
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.e = onHierarchyChangeListener;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
        if (this.s) {
            if (this.r == null) {
                this.r = new f();
            }
            getViewTreeObserver().addOnPreDrawListener(this.r);
        }
        if (this.t == null && ViewCompat.getFitsSystemWindows(this)) {
            ViewCompat.requestApplyInsets(this);
        }
        this.n = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a(false);
        if (this.s && this.r != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.r);
        }
        if (this.q != null) {
            onStopNestedScroll(this.q);
        }
        this.n = false;
    }

    public void setStatusBarBackground(Drawable drawable) {
        if (this.v != drawable) {
            if (this.v != null) {
                this.v.setCallback(null);
            }
            this.v = drawable != null ? drawable.mutate() : null;
            if (this.v != null) {
                if (this.v.isStateful()) {
                    this.v.setState(getDrawableState());
                }
                DrawableCompat.setLayoutDirection(this.v, ViewCompat.getLayoutDirection(this));
                this.v.setVisible(getVisibility() == 0, false);
                this.v.setCallback(this);
            }
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public Drawable getStatusBarBackground() {
        return this.v;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.v;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.v;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        if (this.v == null || this.v.isVisible() == z) {
            return;
        }
        this.v.setVisible(z, false);
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? ContextCompat.getDrawable(getContext(), i) : null);
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    final WindowInsetsCompat a(WindowInsetsCompat windowInsetsCompat) {
        if (ObjectsCompat.equals(this.t, windowInsetsCompat)) {
            return windowInsetsCompat;
        }
        this.t = windowInsetsCompat;
        this.u = windowInsetsCompat != null && windowInsetsCompat.getSystemWindowInsetTop() > 0;
        setWillNotDraw(!this.u && getBackground() == null);
        WindowInsetsCompat b2 = b(windowInsetsCompat);
        requestLayout();
        return b2;
    }

    public final WindowInsetsCompat getLastWindowInsets() {
        return this.t;
    }

    private void a(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            b a2 = ((e) childAt.getLayoutParams()).a();
            if (a2 != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    a2.a(this, (CoordinatorLayout) childAt, obtain);
                } else {
                    a2.b(this, (CoordinatorLayout) childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((e) getChildAt(i2).getLayoutParams()).e();
        }
        this.p = null;
        this.m = false;
    }

    private void a(List<View> list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i = childCount - 1; i >= 0; i--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i) : i));
        }
        if (f1498d != null) {
            Collections.sort(list, f1498d);
        }
    }

    private boolean a(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.i;
        a(list);
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            View view = list.get(i2);
            e eVar = (e) view.getLayoutParams();
            b a2 = eVar.a();
            if (!(z || z2) || actionMasked == 0) {
                if (!z && a2 != null) {
                    switch (i) {
                        case 0:
                            z = a2.a(this, (CoordinatorLayout) view, motionEvent);
                            break;
                        case 1:
                            z = a2.b(this, (CoordinatorLayout) view, motionEvent);
                            break;
                    }
                    if (z) {
                        this.p = view;
                    }
                }
                boolean d2 = eVar.d();
                boolean a3 = eVar.a(this, view);
                z2 = a3 && !d2;
                if (a3 && !z2) {
                    list.clear();
                    return z;
                }
            } else if (a2 != null) {
                if (motionEvent2 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                switch (i) {
                    case 0:
                        a2.a(this, (CoordinatorLayout) view, motionEvent2);
                        break;
                    case 1:
                        a2.b(this, (CoordinatorLayout) view, motionEvent2);
                        break;
                }
            }
        }
        list.clear();
        return z;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            a(true);
        }
        boolean a2 = a(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            a(true);
        }
        return a2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r3 != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean b2;
        MotionEvent motionEvent2;
        int actionMasked = motionEvent.getActionMasked();
        if (this.p == null) {
            z = a(motionEvent, 1);
        } else {
            z = false;
        }
        b a2 = ((e) this.p.getLayoutParams()).a();
        if (a2 != null) {
            b2 = a2.b(this, (CoordinatorLayout) this.p, motionEvent);
            motionEvent2 = null;
            if (this.p != null) {
                b2 |= super.onTouchEvent(motionEvent);
            } else if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEvent2);
            }
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            if (actionMasked != 1 || actionMasked == 3) {
                a(false);
            }
            return b2;
        }
        b2 = false;
        motionEvent2 = null;
        if (this.p != null) {
        }
        if (motionEvent2 != null) {
        }
        if (actionMasked != 1) {
        }
        a(false);
        return b2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.m) {
            return;
        }
        a(false);
        this.m = true;
    }

    private int b(int i) {
        if (this.o == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        }
        if (i < 0 || i >= this.o.length) {
            Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
            return 0;
        }
        return this.o[i];
    }

    /* JADX WARN: Multi-variable type inference failed */
    static b a(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0 && !TextUtils.isEmpty(f1495a)) {
            str = f1495a + '.' + str;
        }
        try {
            Map map = f1497c.get();
            if (map == null) {
                map = new HashMap();
                f1497c.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = context.getClassLoader().loadClass(str).getConstructor(f1496b);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (b) constructor.newInstance(context, attributeSet);
        } catch (Exception e2) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    e a(View view) {
        e eVar = (e) view.getLayoutParams();
        if (!eVar.f1502b) {
            if (view instanceof a) {
                b a2 = ((a) view).a();
                if (a2 == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                eVar.a(a2);
                eVar.f1502b = true;
            } else {
                c cVar = null;
                for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    cVar = (c) cls.getAnnotation(c.class);
                    if (cVar != null) {
                        break;
                    }
                }
                if (cVar != null) {
                    try {
                        eVar.a(cVar.a().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e2) {
                        Log.e("CoordinatorLayout", "Default behavior class " + cVar.a().getName() + " could not be instantiated. Did you forget a default constructor?", e2);
                    }
                }
                eVar.f1502b = true;
            }
        }
        return eVar;
    }

    private void f() {
        this.g.clear();
        this.h.clear();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            e a2 = a(childAt);
            a2.b(this, childAt);
            this.h.addNode(childAt);
            for (int i2 = 0; i2 < childCount; i2++) {
                if (i2 != i) {
                    View childAt2 = getChildAt(i2);
                    if (a2.a(this, childAt, childAt2)) {
                        if (!this.h.contains(childAt2)) {
                            this.h.addNode(childAt2);
                        }
                        this.h.addEdge(childAt2, childAt);
                    }
                }
            }
        }
        this.g.addAll(this.h.getSortedList());
        Collections.reverse(this.g);
    }

    void a(View view, Rect rect) {
        ViewGroupUtils.getDescendantRect(this, view, rect);
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    public void a(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0119, code lost:
    
        if (r0.a(r30, (android.support.design.widget.CoordinatorLayout) r20, r11, r21, r23, 0) == false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        b a2;
        e eVar;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        f();
        a();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int layoutDirection = ViewCompat.getLayoutDirection(this);
        boolean z = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i12 = paddingLeft + paddingRight;
        int i13 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        boolean z2 = this.t != null && ViewCompat.getFitsSystemWindows(this);
        int size3 = this.g.size();
        int i14 = suggestedMinimumWidth;
        int i15 = suggestedMinimumHeight;
        int i16 = 0;
        int i17 = 0;
        while (i17 < size3) {
            View view = this.g.get(i17);
            if (view.getVisibility() == 8) {
                i11 = i17;
                i9 = size3;
            } else {
                e eVar2 = (e) view.getLayoutParams();
                if (eVar2.e < 0 || mode == 0) {
                    i3 = i15;
                } else {
                    int b2 = b(eVar2.e);
                    int absoluteGravity = GravityCompat.getAbsoluteGravity(d(eVar2.f1503c), layoutDirection) & 7;
                    i3 = i15;
                    if ((absoluteGravity == 3 && !z) || (absoluteGravity == 5 && z)) {
                        i4 = Math.max(0, (size - paddingRight) - b2);
                    } else if ((absoluteGravity == 5 && !z) || (absoluteGravity == 3 && z)) {
                        i4 = Math.max(0, b2 - paddingLeft);
                    }
                    if (z2 || ViewCompat.getFitsSystemWindows(view)) {
                        i5 = i;
                        i6 = i2;
                    } else {
                        int systemWindowInsetLeft = this.t.getSystemWindowInsetLeft() + this.t.getSystemWindowInsetRight();
                        int systemWindowInsetTop = this.t.getSystemWindowInsetTop() + this.t.getSystemWindowInsetBottom();
                        i5 = View.MeasureSpec.makeMeasureSpec(size - systemWindowInsetLeft, mode);
                        i6 = View.MeasureSpec.makeMeasureSpec(size2 - systemWindowInsetTop, mode2);
                    }
                    a2 = eVar2.a();
                    if (a2 == null) {
                        eVar = eVar2;
                        i10 = i3;
                        i7 = i16;
                        i8 = i14;
                        i11 = i17;
                        i9 = size3;
                    } else {
                        eVar = eVar2;
                        i7 = i16;
                        i8 = i14;
                        i9 = size3;
                        i10 = i3;
                        i11 = i17;
                    }
                    a(view, i5, i4, i6, 0);
                    e eVar3 = eVar;
                    int max = Math.max(i8, i12 + view.getMeasuredWidth() + eVar3.leftMargin + eVar3.rightMargin);
                    int max2 = Math.max(i10, i13 + view.getMeasuredHeight() + eVar3.topMargin + eVar3.bottomMargin);
                    i14 = max;
                    i16 = View.combineMeasuredStates(i7, view.getMeasuredState());
                    i15 = max2;
                }
                i4 = 0;
                if (z2) {
                }
                i5 = i;
                i6 = i2;
                a2 = eVar2.a();
                if (a2 == null) {
                }
                a(view, i5, i4, i6, 0);
                e eVar32 = eVar;
                int max3 = Math.max(i8, i12 + view.getMeasuredWidth() + eVar32.leftMargin + eVar32.rightMargin);
                int max22 = Math.max(i10, i13 + view.getMeasuredHeight() + eVar32.topMargin + eVar32.bottomMargin);
                i14 = max3;
                i16 = View.combineMeasuredStates(i7, view.getMeasuredState());
                i15 = max22;
            }
            i17 = i11 + 1;
            size3 = i9;
        }
        int i18 = i16;
        setMeasuredDimension(View.resolveSizeAndState(i14, i, (-16777216) & i18), View.resolveSizeAndState(i15, i2, i18 << 16));
    }

    private WindowInsetsCompat b(WindowInsetsCompat windowInsetsCompat) {
        b a2;
        if (windowInsetsCompat.isConsumed()) {
            return windowInsetsCompat;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (ViewCompat.getFitsSystemWindows(childAt) && (a2 = ((e) childAt.getLayoutParams()).a()) != null) {
                windowInsetsCompat = a2.a(this, (CoordinatorLayout) childAt, windowInsetsCompat);
                if (windowInsetsCompat.isConsumed()) {
                    break;
                }
            }
        }
        return windowInsetsCompat;
    }

    public void a(View view, int i) {
        e eVar = (e) view.getLayoutParams();
        if (eVar.c()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        if (eVar.k != null) {
            a(view, eVar.k, i);
        } else if (eVar.e >= 0) {
            a(view, eVar.e, i);
        } else {
            c(view, i);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        b a2;
        int layoutDirection = ViewCompat.getLayoutDirection(this);
        int size = this.g.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.g.get(i5);
            if (view.getVisibility() != 8 && ((a2 = ((e) view.getLayoutParams()).a()) == null || !a2.a(this, (CoordinatorLayout) view, layoutDirection))) {
                a(view, layoutDirection);
            }
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.u || this.v == null) {
            return;
        }
        int systemWindowInsetTop = this.t != null ? this.t.getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.v.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.v.draw(canvas);
        }
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        g();
    }

    void b(View view, Rect rect) {
        ((e) view.getLayoutParams()).a(rect);
    }

    void c(View view, Rect rect) {
        rect.set(((e) view.getLayoutParams()).b());
    }

    void a(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            a(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    private void a(View view, int i, Rect rect, Rect rect2, e eVar, int i2, int i3) {
        int width;
        int height;
        int absoluteGravity = GravityCompat.getAbsoluteGravity(e(eVar.f1503c), i);
        int absoluteGravity2 = GravityCompat.getAbsoluteGravity(c(eVar.f1504d), i);
        int i4 = absoluteGravity & 7;
        int i5 = absoluteGravity & 112;
        int i6 = absoluteGravity2 & 7;
        int i7 = absoluteGravity2 & 112;
        if (i6 == 1) {
            width = rect.left + (rect.width() / 2);
        } else if (i6 != 5) {
            width = rect.left;
        } else {
            width = rect.right;
        }
        if (i7 == 16) {
            height = rect.top + (rect.height() / 2);
        } else if (i7 != 80) {
            height = rect.top;
        } else {
            height = rect.bottom;
        }
        if (i4 == 1) {
            width -= i2 / 2;
        } else if (i4 != 5) {
            width -= i2;
        }
        if (i5 == 16) {
            height -= i3 / 2;
        } else if (i5 != 80) {
            height -= i3;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }

    private void a(e eVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + eVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - eVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + eVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - eVar.bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    void a(View view, int i, Rect rect, Rect rect2) {
        e eVar = (e) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        a(view, i, rect, rect2, eVar, measuredWidth, measuredHeight);
        a(eVar, rect2, measuredWidth, measuredHeight);
    }

    private void a(View view, View view2, int i) {
        Rect e2 = e();
        Rect e3 = e();
        try {
            a(view2, e2);
            a(view, i, e2, e3);
            view.layout(e3.left, e3.top, e3.right, e3.bottom);
        } finally {
            a(e2);
            a(e3);
        }
    }

    private void a(View view, int i, int i2) {
        e eVar = (e) view.getLayoutParams();
        int absoluteGravity = GravityCompat.getAbsoluteGravity(d(eVar.f1503c), i2);
        int i3 = absoluteGravity & 7;
        int i4 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        int b2 = b(i) - measuredWidth;
        int i5 = 0;
        if (i3 == 1) {
            b2 += measuredWidth / 2;
        } else if (i3 == 5) {
            b2 += measuredWidth;
        }
        if (i4 == 16) {
            i5 = 0 + (measuredHeight / 2);
        } else if (i4 == 80) {
            i5 = measuredHeight + 0;
        }
        int max = Math.max(getPaddingLeft() + eVar.leftMargin, Math.min(b2, ((width - getPaddingRight()) - measuredWidth) - eVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + eVar.topMargin, Math.min(i5, ((height - getPaddingBottom()) - measuredHeight) - eVar.bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    private void c(View view, int i) {
        e eVar = (e) view.getLayoutParams();
        Rect e2 = e();
        e2.set(getPaddingLeft() + eVar.leftMargin, getPaddingTop() + eVar.topMargin, (getWidth() - getPaddingRight()) - eVar.rightMargin, (getHeight() - getPaddingBottom()) - eVar.bottomMargin);
        if (this.t != null && ViewCompat.getFitsSystemWindows(this) && !ViewCompat.getFitsSystemWindows(view)) {
            e2.left += this.t.getSystemWindowInsetLeft();
            e2.top += this.t.getSystemWindowInsetTop();
            e2.right -= this.t.getSystemWindowInsetRight();
            e2.bottom -= this.t.getSystemWindowInsetBottom();
        }
        Rect e3 = e();
        GravityCompat.apply(c(eVar.f1503c), view.getMeasuredWidth(), view.getMeasuredHeight(), e2, e3, i);
        view.layout(e3.left, e3.top, e3.right, e3.bottom);
        a(e2);
        a(e3);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        e eVar = (e) view.getLayoutParams();
        if (eVar.f1501a != null) {
            float b2 = eVar.f1501a.b(this, view);
            if (b2 > 0.0f) {
                if (this.l == null) {
                    this.l = new Paint();
                }
                this.l.setColor(eVar.f1501a.a(this, view));
                this.l.setAlpha(MathUtils.clamp(Math.round(b2 * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.l);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    final void a(int i) {
        boolean z;
        int layoutDirection = ViewCompat.getLayoutDirection(this);
        int size = this.g.size();
        Rect e2 = e();
        Rect e3 = e();
        Rect e4 = e();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.g.get(i2);
            e eVar = (e) view.getLayoutParams();
            if (i != 0 || view.getVisibility() != 8) {
                for (int i3 = 0; i3 < i2; i3++) {
                    if (eVar.l == this.g.get(i3)) {
                        b(view, layoutDirection);
                    }
                }
                a(view, true, e3);
                if (eVar.g != 0 && !e3.isEmpty()) {
                    int absoluteGravity = GravityCompat.getAbsoluteGravity(eVar.g, layoutDirection);
                    int i4 = absoluteGravity & 112;
                    if (i4 == 48) {
                        e2.top = Math.max(e2.top, e3.bottom);
                    } else if (i4 == 80) {
                        e2.bottom = Math.max(e2.bottom, getHeight() - e3.top);
                    }
                    int i5 = absoluteGravity & 7;
                    if (i5 == 3) {
                        e2.left = Math.max(e2.left, e3.right);
                    } else if (i5 == 5) {
                        e2.right = Math.max(e2.right, getWidth() - e3.left);
                    }
                }
                if (eVar.h != 0 && view.getVisibility() == 0) {
                    a(view, e2, layoutDirection);
                }
                if (i != 2) {
                    c(view, e4);
                    if (!e4.equals(e3)) {
                        b(view, e3);
                    }
                }
                for (int i6 = i2 + 1; i6 < size; i6++) {
                    View view2 = this.g.get(i6);
                    e eVar2 = (e) view2.getLayoutParams();
                    b a2 = eVar2.a();
                    if (a2 != null && a2.a(this, (CoordinatorLayout) view2, view)) {
                        if (i == 0 && eVar2.f()) {
                            eVar2.g();
                        } else {
                            if (i == 2) {
                                a2.c(this, view2, view);
                                z = true;
                            } else {
                                z = a2.b(this, (CoordinatorLayout) view2, view);
                            }
                            if (i == 1) {
                                eVar2.a(z);
                            }
                        }
                    }
                }
            }
        }
        a(e2);
        a(e3);
        a(e4);
    }

    private void a(View view, Rect rect, int i) {
        boolean z;
        boolean z2;
        int width;
        int i2;
        int height;
        int i3;
        if (ViewCompat.isLaidOut(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            e eVar = (e) view.getLayoutParams();
            b a2 = eVar.a();
            Rect e2 = e();
            Rect e3 = e();
            e3.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (a2 != null && a2.a(this, (CoordinatorLayout) view, e2)) {
                if (!e3.contains(e2)) {
                    throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + e2.toShortString() + " | Bounds:" + e3.toShortString());
                }
            } else {
                e2.set(e3);
            }
            a(e3);
            if (e2.isEmpty()) {
                a(e2);
                return;
            }
            int absoluteGravity = GravityCompat.getAbsoluteGravity(eVar.h, i);
            if ((absoluteGravity & 48) != 48 || (i3 = (e2.top - eVar.topMargin) - eVar.j) >= rect.top) {
                z = false;
            } else {
                e(view, rect.top - i3);
                z = true;
            }
            if ((absoluteGravity & 80) == 80 && (height = ((getHeight() - e2.bottom) - eVar.bottomMargin) + eVar.j) < rect.bottom) {
                e(view, height - rect.bottom);
                z = true;
            }
            if (!z) {
                e(view, 0);
            }
            if ((absoluteGravity & 3) != 3 || (i2 = (e2.left - eVar.leftMargin) - eVar.i) >= rect.left) {
                z2 = false;
            } else {
                d(view, rect.left - i2);
                z2 = true;
            }
            if ((absoluteGravity & 5) == 5 && (width = ((getWidth() - e2.right) - eVar.rightMargin) + eVar.i) < rect.right) {
                d(view, width - rect.right);
                z2 = true;
            }
            if (!z2) {
                d(view, 0);
            }
            a(e2);
        }
    }

    private void d(View view, int i) {
        e eVar = (e) view.getLayoutParams();
        if (eVar.i != i) {
            ViewCompat.offsetLeftAndRight(view, i - eVar.i);
            eVar.i = i;
        }
    }

    private void e(View view, int i) {
        e eVar = (e) view.getLayoutParams();
        if (eVar.j != i) {
            ViewCompat.offsetTopAndBottom(view, i - eVar.j);
            eVar.j = i;
        }
    }

    final List<View> getDependencySortedChildren() {
        f();
        return Collections.unmodifiableList(this.g);
    }

    void a() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            if (b(getChildAt(i))) {
                z = true;
                break;
            }
            i++;
        }
        if (z != this.s) {
            if (z) {
                b();
            } else {
                c();
            }
        }
    }

    private boolean b(View view) {
        return this.h.hasOutgoingEdges(view);
    }

    void b() {
        if (this.n) {
            if (this.r == null) {
                this.r = new f();
            }
            getViewTreeObserver().addOnPreDrawListener(this.r);
        }
        this.s = true;
    }

    void c() {
        if (this.n && this.r != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.r);
        }
        this.s = false;
    }

    void b(View view, int i) {
        b a2;
        e eVar = (e) view.getLayoutParams();
        if (eVar.k != null) {
            Rect e2 = e();
            Rect e3 = e();
            Rect e4 = e();
            a(eVar.k, e2);
            a(view, false, e3);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            a(view, i, e2, e4, eVar, measuredWidth, measuredHeight);
            boolean z = (e4.left == e3.left && e4.top == e3.top) ? false : true;
            a(eVar, e4, measuredWidth, measuredHeight);
            int i2 = e4.left - e3.left;
            int i3 = e4.top - e3.top;
            if (i2 != 0) {
                ViewCompat.offsetLeftAndRight(view, i2);
            }
            if (i3 != 0) {
                ViewCompat.offsetTopAndBottom(view, i3);
            }
            if (z && (a2 = eVar.a()) != null) {
                a2.b(this, (CoordinatorLayout) view, eVar.k);
            }
            a(e2);
            a(e3);
            a(e4);
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof e) {
            return new e((e) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new e((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new e(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof e) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return onStartNestedScroll(view, view2, i, 0);
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                b a2 = eVar.a();
                if (a2 != null) {
                    boolean a3 = a2.a(this, (CoordinatorLayout) childAt, view, view2, i, i2);
                    eVar.a(i2, a3);
                    z |= a3;
                } else {
                    eVar.a(i2, false);
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        b a2;
        this.x.onNestedScrollAccepted(view, view2, i, i2);
        this.q = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            e eVar = (e) childAt.getLayoutParams();
            if (eVar.b(i2) && (a2 = eVar.a()) != null) {
                a2.b(this, childAt, view, view2, i, i2);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public void onStopNestedScroll(View view, int i) {
        this.x.onStopNestedScroll(view, i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            e eVar = (e) childAt.getLayoutParams();
            if (eVar.b(i)) {
                b a2 = eVar.a();
                if (a2 != null) {
                    a2.a(this, (CoordinatorLayout) childAt, view, i);
                }
                eVar.a(i);
                eVar.g();
            }
        }
        this.q = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        onNestedScroll(view, i, i2, i3, i4, 0);
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        b a2;
        int childCount = getChildCount();
        boolean z = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.b(i5) && (a2 = eVar.a()) != null) {
                    a2.a(this, childAt, view, i, i2, i3, i4, i5);
                    z = true;
                }
            }
        }
        if (z) {
            a(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        onNestedPreScroll(view, i, i2, iArr, 0);
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        b a2;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.b(i3) && (a2 = eVar.a()) != null) {
                    int[] iArr2 = this.k;
                    this.k[1] = 0;
                    iArr2[0] = 0;
                    a2.a(this, (CoordinatorLayout) childAt, view, i, i2, this.k, i3);
                    if (i > 0) {
                        min = Math.max(i4, this.k[0]);
                    } else {
                        min = Math.min(i4, this.k[0]);
                    }
                    if (i2 > 0) {
                        min2 = Math.max(i5, this.k[1]);
                    } else {
                        min2 = Math.min(i5, this.k[1]);
                    }
                    i4 = min;
                    i5 = min2;
                    z = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z) {
            a(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        b a2;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.b(0) && (a2 = eVar.a()) != null) {
                    z2 |= a2.a(this, (CoordinatorLayout) childAt, view, f2, f3, z);
                }
            }
        }
        if (z2) {
            a(1);
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public boolean onNestedPreFling(View view, float f2, float f3) {
        b a2;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.b(0) && (a2 = eVar.a()) != null) {
                    z |= a2.a(this, (CoordinatorLayout) childAt, view, f2, f3);
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.support.v4.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.x.getNestedScrollAxes();
    }

    class f implements ViewTreeObserver.OnPreDrawListener {
        f() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.a(0);
            return true;
        }
    }

    static class g implements Comparator<View> {
        g() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            float z = ViewCompat.getZ(view);
            float z2 = ViewCompat.getZ(view2);
            if (z > z2) {
                return -1;
            }
            return z < z2 ? 1 : 0;
        }
    }

    public static abstract class b<V extends View> {
        public int a(CoordinatorLayout coordinatorLayout, V v) {
            return -16777216;
        }

        public WindowInsetsCompat a(CoordinatorLayout coordinatorLayout, V v, WindowInsetsCompat windowInsetsCompat) {
            return windowInsetsCompat;
        }

        public void a() {
        }

        public void a(e eVar) {
        }

        public void a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        @Deprecated
        public void a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        }

        @Deprecated
        public void a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, boolean z) {
            return false;
        }

        @Deprecated
        public boolean a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
            return false;
        }

        public float b(CoordinatorLayout coordinatorLayout, V v) {
            return 0.0f;
        }

        @Deprecated
        public void b(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        }

        public boolean b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public void c(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        @Deprecated
        public void d(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public boolean c(CoordinatorLayout coordinatorLayout, V v) {
            return b(coordinatorLayout, v) > 0.0f;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                return a(coordinatorLayout, (CoordinatorLayout) v, view, view2, i);
            }
            return false;
        }

        public void b(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                b(coordinatorLayout, v, view, view2, i);
            }
        }

        public void a(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
            if (i == 0) {
                d(coordinatorLayout, v, view);
            }
        }

        public void a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                a(coordinatorLayout, (CoordinatorLayout) v, view, i, i2, i3, i4);
            }
        }

        public void a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                a(coordinatorLayout, (CoordinatorLayout) v, view, i, i2, iArr);
            }
        }

        public Parcelable d(CoordinatorLayout coordinatorLayout, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }
    }

    public static class e extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        b f1501a;

        /* renamed from: b, reason: collision with root package name */
        boolean f1502b;

        /* renamed from: c, reason: collision with root package name */
        public int f1503c;

        /* renamed from: d, reason: collision with root package name */
        public int f1504d;
        public int e;
        int f;
        public int g;
        public int h;
        int i;
        int j;
        View k;
        View l;
        final Rect m;
        Object n;
        private boolean o;
        private boolean p;
        private boolean q;
        private boolean r;

        public e(int i, int i2) {
            super(i, i2);
            this.f1502b = false;
            this.f1503c = 0;
            this.f1504d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.m = new Rect();
        }

        e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1502b = false;
            this.f1503c = 0;
            this.f1504d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.m = new Rect();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CoordinatorLayout_Layout);
            this.f1503c = obtainStyledAttributes.getInteger(R.styleable.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.f = obtainStyledAttributes.getResourceId(R.styleable.CoordinatorLayout_Layout_layout_anchor, -1);
            this.f1504d = obtainStyledAttributes.getInteger(R.styleable.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.e = obtainStyledAttributes.getInteger(R.styleable.CoordinatorLayout_Layout_layout_keyline, -1);
            this.g = obtainStyledAttributes.getInt(R.styleable.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.h = obtainStyledAttributes.getInt(R.styleable.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            this.f1502b = obtainStyledAttributes.hasValue(R.styleable.CoordinatorLayout_Layout_layout_behavior);
            if (this.f1502b) {
                this.f1501a = CoordinatorLayout.a(context, attributeSet, obtainStyledAttributes.getString(R.styleable.CoordinatorLayout_Layout_layout_behavior));
            }
            obtainStyledAttributes.recycle();
            if (this.f1501a != null) {
                this.f1501a.a(this);
            }
        }

        public e(e eVar) {
            super((ViewGroup.MarginLayoutParams) eVar);
            this.f1502b = false;
            this.f1503c = 0;
            this.f1504d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.m = new Rect();
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1502b = false;
            this.f1503c = 0;
            this.f1504d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.m = new Rect();
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1502b = false;
            this.f1503c = 0;
            this.f1504d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.m = new Rect();
        }

        public b a() {
            return this.f1501a;
        }

        public void a(b bVar) {
            if (this.f1501a != bVar) {
                if (this.f1501a != null) {
                    this.f1501a.a();
                }
                this.f1501a = bVar;
                this.n = null;
                this.f1502b = true;
                if (bVar != null) {
                    bVar.a(this);
                }
            }
        }

        void a(Rect rect) {
            this.m.set(rect);
        }

        Rect b() {
            return this.m;
        }

        boolean c() {
            return this.k == null && this.f != -1;
        }

        boolean d() {
            if (this.f1501a == null) {
                this.o = false;
            }
            return this.o;
        }

        boolean a(CoordinatorLayout coordinatorLayout, View view) {
            if (this.o) {
                return true;
            }
            boolean c2 = (this.f1501a != null ? this.f1501a.c(coordinatorLayout, view) : false) | this.o;
            this.o = c2;
            return c2;
        }

        void e() {
            this.o = false;
        }

        void a(int i) {
            a(i, false);
        }

        void a(int i, boolean z) {
            switch (i) {
                case 0:
                    this.p = z;
                    break;
                case 1:
                    this.q = z;
                    break;
            }
        }

        boolean b(int i) {
            switch (i) {
                case 0:
                    return this.p;
                case 1:
                    return this.q;
                default:
                    return false;
            }
        }

        boolean f() {
            return this.r;
        }

        void a(boolean z) {
            this.r = z;
        }

        void g() {
            this.r = false;
        }

        boolean a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 == this.l || a(view2, ViewCompat.getLayoutDirection(coordinatorLayout)) || (this.f1501a != null && this.f1501a.a(coordinatorLayout, (CoordinatorLayout) view, view2));
        }

        View b(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f == -1) {
                this.l = null;
                this.k = null;
                return null;
            }
            if (this.k == null || !b(view, coordinatorLayout)) {
                a(view, coordinatorLayout);
            }
            return this.k;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v3, types: [android.view.ViewParent] */
        private void a(View view, CoordinatorLayout coordinatorLayout) {
            this.k = coordinatorLayout.findViewById(this.f);
            if (this.k != null) {
                if (this.k == coordinatorLayout) {
                    if (coordinatorLayout.isInEditMode()) {
                        this.l = null;
                        this.k = null;
                        return;
                    }
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
                CoordinatorLayout coordinatorLayout2 = this.k;
                for (CoordinatorLayout coordinatorLayout3 = this.k.getParent(); coordinatorLayout3 != coordinatorLayout && coordinatorLayout3 != null; coordinatorLayout3 = coordinatorLayout3.getParent()) {
                    if (coordinatorLayout3 == view) {
                        if (coordinatorLayout.isInEditMode()) {
                            this.l = null;
                            this.k = null;
                            return;
                        }
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }
                    if (coordinatorLayout3 instanceof View) {
                        coordinatorLayout2 = coordinatorLayout3;
                    }
                }
                this.l = coordinatorLayout2;
                return;
            }
            if (coordinatorLayout.isInEditMode()) {
                this.l = null;
                this.k = null;
                return;
            }
            throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f) + " to anchor view " + view);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v2, types: [android.view.ViewParent] */
        private boolean b(View view, CoordinatorLayout coordinatorLayout) {
            if (this.k.getId() != this.f) {
                return false;
            }
            CoordinatorLayout coordinatorLayout2 = this.k;
            for (CoordinatorLayout coordinatorLayout3 = this.k.getParent(); coordinatorLayout3 != coordinatorLayout; coordinatorLayout3 = coordinatorLayout3.getParent()) {
                if (coordinatorLayout3 == null || coordinatorLayout3 == view) {
                    this.l = null;
                    this.k = null;
                    return false;
                }
                if (coordinatorLayout3 instanceof View) {
                    coordinatorLayout2 = coordinatorLayout3;
                }
            }
            this.l = coordinatorLayout2;
            return true;
        }

        private boolean a(View view, int i) {
            int absoluteGravity = GravityCompat.getAbsoluteGravity(((e) view.getLayoutParams()).g, i);
            return absoluteGravity != 0 && (GravityCompat.getAbsoluteGravity(this.h, i) & absoluteGravity) == absoluteGravity;
        }
    }

    private class d implements ViewGroup.OnHierarchyChangeListener {
        d() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (CoordinatorLayout.this.e != null) {
                CoordinatorLayout.this.e.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.a(2);
            if (CoordinatorLayout.this.e != null) {
                CoordinatorLayout.this.e.onChildViewRemoved(view, view2);
            }
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        SparseArray<Parcelable> sparseArray = savedState.behaviorStates;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            b a2 = a(childAt).a();
            if (id != -1 && a2 != null && (parcelable2 = sparseArray.get(id)) != null) {
                a2.a(this, (CoordinatorLayout) childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable d2;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            b a2 = ((e) childAt.getLayoutParams()).a();
            if (id != -1 && a2 != null && (d2 = a2.d(this, childAt)) != null) {
                sparseArray.append(id, d2);
            }
        }
        savedState.behaviorStates = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        b a2 = ((e) view.getLayoutParams()).a();
        if (a2 == null || !a2.a(this, (CoordinatorLayout) view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    private void g() {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (ViewCompat.getFitsSystemWindows(this)) {
            if (this.w == null) {
                this.w = new OnApplyWindowInsetsListener() { // from class: android.support.design.widget.CoordinatorLayout.1
                    @Override // android.support.v4.view.OnApplyWindowInsetsListener
                    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                        return CoordinatorLayout.this.a(windowInsetsCompat);
                    }
                };
            }
            ViewCompat.setOnApplyWindowInsetsListener(this, this.w);
            setSystemUiVisibility(1280);
            return;
        }
        ViewCompat.setOnApplyWindowInsetsListener(this, null);
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: android.support.design.widget.CoordinatorLayout.SavedState.1
            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        SparseArray<Parcelable> behaviorStates;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.behaviorStates = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.behaviorStates.append(iArr[i], readParcelableArray[i]);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.support.v4.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            int size = this.behaviorStates != null ? this.behaviorStates.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.behaviorStates.keyAt(i2);
                parcelableArr[i2] = this.behaviorStates.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }
}
