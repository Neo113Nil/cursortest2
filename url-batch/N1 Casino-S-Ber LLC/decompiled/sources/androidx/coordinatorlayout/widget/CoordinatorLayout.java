package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.derinko.gbini.n1casino.R;
import defpackage.ax;
import defpackage.cv;
import defpackage.d90;
import defpackage.dv;
import defpackage.ev;
import defpackage.ja;
import defpackage.k0;
import defpackage.md;
import defpackage.nd;
import defpackage.od;
import defpackage.p80;
import defpackage.pd;
import defpackage.qd;
import defpackage.rb0;
import defpackage.rd;
import defpackage.rx;
import defpackage.sd;
import defpackage.t8;
import defpackage.u20;
import defpackage.we;
import defpackage.x80;
import defpackage.zw;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements cv, dv {
    public static final ThreadLocal A;
    public static final ja B;
    public static final ax C;
    public static final String y;
    public static final Class[] z;
    public final ArrayList f;
    public final we g;
    public final ArrayList h;
    public final ArrayList i;
    public final int[] j;
    public final int[] k;
    public boolean l;
    public boolean m;
    public final int[] n;
    public View o;
    public View p;
    public rd q;
    public boolean r;
    public rb0 s;
    public boolean t;
    public Drawable u;
    public ViewGroup.OnHierarchyChangeListener v;
    public k0 w;
    public final ev x;

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        y = r0 != null ? r0.getName() : null;
        B = new ja(1);
        z = new Class[]{Context.class, AttributeSet.class};
        A = new ThreadLocal();
        C = new ax();
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f = new ArrayList();
        this.g = new we(1);
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new int[2];
        this.k = new int[2];
        this.x = new ev();
        int[] iArr = rx.a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.n = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i = 0; i < length; i++) {
                this.n[i] = (int) (r1[i] * f);
            }
        }
        this.u = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        y();
        super.setOnHierarchyChangeListener(new pd(this));
        WeakHashMap weakHashMap = x80.a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect g() {
        Rect rect = (Rect) C.a();
        return rect == null ? new Rect() : rect;
    }

    public static void m(int i, Rect rect, Rect rect2, qd qdVar, int i2, int i3) {
        int i4 = qdVar.c;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = qdVar.d;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        int width = i8 != 1 ? i8 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i9 != 16 ? i9 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i6 == 1) {
            width -= i2 / 2;
        } else if (i6 != 5) {
            width -= i2;
        }
        if (i7 == 16) {
            height -= i3 / 2;
        } else if (i7 != 80) {
            height -= i3;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static qd o(View view) {
        qd qdVar = (qd) view.getLayoutParams();
        if (!qdVar.b) {
            if (view instanceof md) {
                nd behavior = ((md) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                qdVar.b(behavior);
                qdVar.b = true;
                return qdVar;
            }
            od odVar = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                odVar = (od) cls.getAnnotation(od.class);
                if (odVar != null) {
                    break;
                }
            }
            if (odVar != null) {
                try {
                    qdVar.b((nd) odVar.value().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception e) {
                    Log.e("CoordinatorLayout", "Default behavior class " + odVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                }
            }
            qdVar.b = true;
        }
        return qdVar;
    }

    public static void w(View view, int i) {
        qd qdVar = (qd) view.getLayoutParams();
        int i2 = qdVar.i;
        if (i2 != i) {
            WeakHashMap weakHashMap = x80.a;
            view.offsetLeftAndRight(i - i2);
            qdVar.i = i;
        }
    }

    public static void x(View view, int i) {
        qd qdVar = (qd) view.getLayoutParams();
        int i2 = qdVar.j;
        if (i2 != i) {
            WeakHashMap weakHashMap = x80.a;
            view.offsetTopAndBottom(i - i2);
            qdVar.j = i;
        }
    }

    @Override // defpackage.cv
    public final void a(View view, View view2, int i, int i2) {
        ev evVar = this.x;
        if (i2 == 1) {
            evVar.b = i;
        } else {
            evVar.a = i;
        }
        this.p = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((qd) getChildAt(i3).getLayoutParams()).getClass();
        }
    }

    @Override // defpackage.cv
    public final void b(View view, int i) {
        ev evVar = this.x;
        if (i == 1) {
            evVar.b = 0;
        } else {
            evVar.a = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            qd qdVar = (qd) childAt.getLayoutParams();
            if (qdVar.a(i)) {
                nd ndVar = qdVar.a;
                if (ndVar != null) {
                    ndVar.u(this, childAt, view, i);
                }
                if (i == 0) {
                    qdVar.m = false;
                } else if (i == 1) {
                    qdVar.n = false;
                }
                qdVar.o = false;
            }
        }
        this.p = null;
    }

    @Override // defpackage.cv
    public final void c(View view, int i, int i2, int[] iArr, int i3) {
        nd ndVar;
        int childCount = getChildCount();
        boolean z2 = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                qd qdVar = (qd) childAt.getLayoutParams();
                if (qdVar.a(i3) && (ndVar = qdVar.a) != null) {
                    int[] iArr2 = this.j;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    ndVar.o(this, childAt, view, i, i2, iArr2, i3);
                    i4 = i > 0 ? Math.max(i4, iArr2[0]) : Math.min(i4, iArr2[0]);
                    i5 = i2 > 0 ? Math.max(i5, iArr2[1]) : Math.min(i5, iArr2[1]);
                    z2 = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z2) {
            q(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof qd) && super.checkLayoutParams(layoutParams);
    }

    @Override // defpackage.dv
    public final void d(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        nd ndVar;
        int childCount = getChildCount();
        int i6 = 0;
        int i7 = 0;
        boolean z2 = false;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                qd qdVar = (qd) childAt.getLayoutParams();
                if (qdVar.a(i5) && (ndVar = qdVar.a) != null) {
                    int[] iArr2 = this.j;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    ndVar.p(this, childAt, i2, i3, i4, iArr2);
                    i6 = i3 > 0 ? Math.max(i6, iArr2[0]) : Math.min(i6, iArr2[0]);
                    i7 = i4 > 0 ? Math.max(i7, iArr2[1]) : Math.min(i7, iArr2[1]);
                    z2 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i7;
        if (z2) {
            q(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        nd ndVar = ((qd) view.getLayoutParams()).a;
        if (ndVar != null) {
            ndVar.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.u;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // defpackage.cv
    public final void e(View view, int i, int i2, int i3, int i4, int i5) {
        d(view, i, i2, i3, i4, 0, this.k);
    }

    @Override // defpackage.cv
    public final boolean f(View view, View view2, int i, int i2) {
        CoordinatorLayout coordinatorLayout;
        View view3;
        int i3;
        int i4;
        int childCount = getChildCount();
        int i5 = 0;
        boolean z2 = false;
        while (i5 < childCount) {
            View childAt = this.getChildAt(i5);
            if (childAt.getVisibility() == 8) {
                coordinatorLayout = this;
                view3 = view;
                i3 = i;
                i4 = i2;
            } else {
                qd qdVar = (qd) childAt.getLayoutParams();
                nd ndVar = qdVar.a;
                if (ndVar != null) {
                    coordinatorLayout = this;
                    view3 = view;
                    i3 = i;
                    i4 = i2;
                    boolean t = ndVar.t(coordinatorLayout, childAt, view3, i3, i4);
                    z2 |= t;
                    if (i4 == 0) {
                        qdVar.m = t;
                    } else if (i4 == 1) {
                        qdVar.n = t;
                    }
                } else {
                    coordinatorLayout = this;
                    view3 = view;
                    i3 = i;
                    i4 = i2;
                    if (i4 == 0) {
                        qdVar.m = false;
                    } else if (i4 == 1) {
                        qdVar.n = false;
                    }
                }
            }
            i5++;
            this = coordinatorLayout;
            view = view3;
            i = i3;
            i2 = i4;
        }
        return z2;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new qd();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof qd ? new qd((qd) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new qd((ViewGroup.MarginLayoutParams) layoutParams) : new qd(layoutParams);
    }

    public final List<View> getDependencySortedChildren() {
        u();
        return Collections.unmodifiableList(this.f);
    }

    public final rb0 getLastWindowInsets() {
        return this.s;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        ev evVar = this.x;
        return evVar.b | evVar.a;
    }

    public Drawable getStatusBarBackground() {
        return this.u;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(qd qdVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) qdVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) qdVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) qdVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) qdVar).bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    public final void i(View view) {
        List list = (List) ((u20) this.g.g).get(view);
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            View view2 = (View) list.get(i);
            nd ndVar = ((qd) view2.getLayoutParams()).a;
            if (ndVar != null) {
                ndVar.h(this, view2, view);
            }
        }
    }

    public final void j(View view, Rect rect, boolean z2) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z2) {
            l(rect, view);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final ArrayList k(View view) {
        u20 u20Var = (u20) this.g.g;
        int i = u20Var.h;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) u20Var.i(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(u20Var.f(i2));
            }
        }
        ArrayList arrayList3 = this.i;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void l(Rect rect, View view) {
        ThreadLocal threadLocal = d90.a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = d90.a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        d90.a(this, view, matrix);
        ThreadLocal threadLocal3 = d90.b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int n(int i) {
        int[] iArr = this.n;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        }
        if (i >= 0 && i < iArr.length) {
            return iArr[i];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        v(false);
        if (this.r) {
            if (this.q == null) {
                this.q = new rd(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.q);
        }
        if (this.s == null) {
            WeakHashMap weakHashMap = x80.a;
            if (getFitsSystemWindows()) {
                requestApplyInsets();
            }
        }
        this.m = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v(false);
        if (this.r && this.q != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.q);
        }
        View view = this.p;
        if (view != null) {
            b(view, 0);
        }
        this.m = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.t || this.u == null) {
            return;
        }
        rb0 rb0Var = this.s;
        int d = rb0Var != null ? rb0Var.d() : 0;
        if (d > 0) {
            this.u.setBounds(0, 0, getWidth(), d);
            this.u.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            v(true);
        }
        boolean t = t(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return t;
        }
        v(true);
        return t;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        nd ndVar;
        WeakHashMap weakHashMap = x80.a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            if (view.getVisibility() != 8 && ((ndVar = ((qd) view.getLayoutParams()).a) == null || !ndVar.l(this, view, layoutDirection))) {
                r(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0189  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        nd ndVar;
        int i9;
        int i10;
        boolean z3;
        int i11;
        int i12;
        ArrayList arrayList;
        int i13;
        int i14;
        View view;
        int i15;
        int max;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.u();
        int childCount = coordinatorLayout.getChildCount();
        int i16 = 0;
        loop0: while (true) {
            if (i16 >= childCount) {
                z2 = false;
                break;
            }
            View childAt = coordinatorLayout.getChildAt(i16);
            u20 u20Var = (u20) coordinatorLayout.g.g;
            int i17 = u20Var.h;
            for (int i18 = 0; i18 < i17; i18++) {
                ArrayList arrayList2 = (ArrayList) u20Var.i(i18);
                if (arrayList2 != null && arrayList2.contains(childAt)) {
                    z2 = true;
                    break loop0;
                }
            }
            i16++;
        }
        if (z2 != coordinatorLayout.r) {
            boolean z4 = coordinatorLayout.m;
            if (z2) {
                if (z4) {
                    if (coordinatorLayout.q == null) {
                        coordinatorLayout.q = new rd(coordinatorLayout);
                    }
                    coordinatorLayout.getViewTreeObserver().addOnPreDrawListener(coordinatorLayout.q);
                }
                coordinatorLayout.r = true;
            } else {
                if (z4 && coordinatorLayout.q != null) {
                    coordinatorLayout.getViewTreeObserver().removeOnPreDrawListener(coordinatorLayout.q);
                }
                coordinatorLayout.r = false;
            }
        }
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        WeakHashMap weakHashMap = x80.a;
        int layoutDirection = coordinatorLayout.getLayoutDirection();
        boolean z5 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i19 = paddingLeft + paddingRight;
        int i20 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z6 = coordinatorLayout.s != null && coordinatorLayout.getFitsSystemWindows();
        ArrayList arrayList3 = coordinatorLayout.f;
        int size3 = arrayList3.size();
        int i21 = 0;
        int i22 = 0;
        while (i21 < size3) {
            View view2 = (View) arrayList3.get(i21);
            int i23 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                arrayList = arrayList3;
                i6 = size3;
                i15 = i21;
                i9 = paddingLeft;
                suggestedMinimumWidth = i23;
                z3 = false;
                i11 = paddingRight;
            } else {
                qd qdVar = (qd) view2.getLayoutParams();
                int i24 = qdVar.e;
                if (i24 < 0 || mode == 0) {
                    i3 = suggestedMinimumHeight;
                } else {
                    int n = coordinatorLayout.n(i24);
                    int i25 = qdVar.c;
                    if (i25 == 0) {
                        i25 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i25, layoutDirection) & 7;
                    i3 = suggestedMinimumHeight;
                    if ((absoluteGravity == 3 && !z5) || (absoluteGravity == 5 && z5)) {
                        max = Math.max(0, (size - paddingRight) - n);
                    } else if ((absoluteGravity == 5 && !z5) || (absoluteGravity == 3 && z5)) {
                        max = Math.max(0, n - paddingLeft);
                    }
                    int i26 = size3;
                    i5 = max;
                    i4 = i26;
                    if (z6 || view2.getFitsSystemWindows()) {
                        i6 = i4;
                        i7 = i;
                        i8 = i2;
                    } else {
                        i6 = i4;
                        int c = coordinatorLayout.s.c() + coordinatorLayout.s.b();
                        int a = coordinatorLayout.s.a() + coordinatorLayout.s.d();
                        i7 = View.MeasureSpec.makeMeasureSpec(size - c, mode);
                        i8 = View.MeasureSpec.makeMeasureSpec(size2 - a, mode2);
                    }
                    ndVar = qdVar.a;
                    if (ndVar == null) {
                        z3 = false;
                        i9 = paddingLeft;
                        i10 = i23;
                        i11 = paddingRight;
                        i12 = i3;
                        arrayList = arrayList3;
                        int i27 = i7;
                        i15 = i21;
                        int i28 = i8;
                        boolean m = ndVar.m(this, view2, i27, i5, i28);
                        view = view2;
                        i7 = i27;
                        i13 = i5;
                        i14 = i28;
                        if (m) {
                            coordinatorLayout = this;
                            int max2 = Math.max(i10, view.getMeasuredWidth() + i19 + ((ViewGroup.MarginLayoutParams) qdVar).leftMargin + ((ViewGroup.MarginLayoutParams) qdVar).rightMargin);
                            int max3 = Math.max(i12, view.getMeasuredHeight() + i20 + ((ViewGroup.MarginLayoutParams) qdVar).topMargin + ((ViewGroup.MarginLayoutParams) qdVar).bottomMargin);
                            i22 = View.combineMeasuredStates(i22, view.getMeasuredState());
                            suggestedMinimumWidth = max2;
                            suggestedMinimumHeight = max3;
                        }
                    } else {
                        i9 = paddingLeft;
                        i10 = i23;
                        z3 = false;
                        i11 = paddingRight;
                        i12 = i3;
                        arrayList = arrayList3;
                        i13 = i5;
                        i14 = i8;
                        view = view2;
                        i15 = i21;
                    }
                    coordinatorLayout = this;
                    coordinatorLayout.measureChildWithMargins(view, i7, i13, i14, 0);
                    int max22 = Math.max(i10, view.getMeasuredWidth() + i19 + ((ViewGroup.MarginLayoutParams) qdVar).leftMargin + ((ViewGroup.MarginLayoutParams) qdVar).rightMargin);
                    int max32 = Math.max(i12, view.getMeasuredHeight() + i20 + ((ViewGroup.MarginLayoutParams) qdVar).topMargin + ((ViewGroup.MarginLayoutParams) qdVar).bottomMargin);
                    i22 = View.combineMeasuredStates(i22, view.getMeasuredState());
                    suggestedMinimumWidth = max22;
                    suggestedMinimumHeight = max32;
                }
                i4 = size3;
                i5 = 0;
                if (z6) {
                }
                i6 = i4;
                i7 = i;
                i8 = i2;
                ndVar = qdVar.a;
                if (ndVar == null) {
                }
                coordinatorLayout = this;
                coordinatorLayout.measureChildWithMargins(view, i7, i13, i14, 0);
                int max222 = Math.max(i10, view.getMeasuredWidth() + i19 + ((ViewGroup.MarginLayoutParams) qdVar).leftMargin + ((ViewGroup.MarginLayoutParams) qdVar).rightMargin);
                int max322 = Math.max(i12, view.getMeasuredHeight() + i20 + ((ViewGroup.MarginLayoutParams) qdVar).topMargin + ((ViewGroup.MarginLayoutParams) qdVar).bottomMargin);
                i22 = View.combineMeasuredStates(i22, view.getMeasuredState());
                suggestedMinimumWidth = max222;
                suggestedMinimumHeight = max322;
            }
            i21 = i15 + 1;
            paddingLeft = i9;
            paddingRight = i11;
            size3 = i6;
            arrayList3 = arrayList;
        }
        int i29 = i22;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i, (-16777216) & i29), View.resolveSizeAndState(suggestedMinimumHeight, i2, i29 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z2) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                qd qdVar = (qd) childAt.getLayoutParams();
                if (qdVar.a(0)) {
                    nd ndVar = qdVar.a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        nd ndVar;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                qd qdVar = (qd) childAt.getLayoutParams();
                if (qdVar.a(0) && (ndVar = qdVar.a) != null) {
                    z2 |= ndVar.n(view);
                }
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        c(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        e(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        a(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof sd)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        sd sdVar = (sd) parcelable;
        super.onRestoreInstanceState(sdVar.f);
        SparseArray sparseArray = sdVar.h;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            nd ndVar = o(childAt).a;
            if (id != -1 && ndVar != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                ndVar.r(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable s;
        sd sdVar = new sd(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            nd ndVar = ((qd) childAt.getLayoutParams()).a;
            if (id != -1 && ndVar != null && (s = ndVar.s(childAt)) != null) {
                sparseArray.append(id, s);
            }
        }
        sdVar.h = sparseArray;
        return sdVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return f(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        b(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r3 != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean v;
        MotionEvent motionEvent2;
        int actionMasked = motionEvent.getActionMasked();
        if (this.o == null) {
            z2 = t(motionEvent, 1);
        } else {
            z2 = false;
        }
        nd ndVar = ((qd) this.o.getLayoutParams()).a;
        if (ndVar != null) {
            v = ndVar.v(this, this.o, motionEvent);
            motionEvent2 = null;
            if (this.o != null) {
                v |= super.onTouchEvent(motionEvent);
            } else if (z2) {
                long uptimeMillis = SystemClock.uptimeMillis();
                motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEvent2);
            }
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            if (actionMasked == 1 && actionMasked != 3) {
                return v;
            }
            v(false);
            return v;
        }
        v = false;
        motionEvent2 = null;
        if (this.o != null) {
        }
        if (motionEvent2 != null) {
        }
        if (actionMasked == 1) {
        }
        v(false);
        return v;
    }

    public final boolean p(View view, int i, int i2) {
        ax axVar = C;
        Rect g = g();
        l(g, view);
        try {
            return g.contains(i, i2);
        } finally {
            g.setEmpty();
            axVar.c(g);
        }
    }

    public final void q(int i) {
        int i2;
        Rect rect;
        int i3;
        ArrayList arrayList;
        boolean z2;
        boolean z3;
        boolean z4;
        int width;
        int i4;
        int i5;
        int i6;
        int height;
        int i7;
        int i8;
        int i9;
        ArrayList arrayList2;
        qd qdVar;
        int i10;
        int i11;
        Rect rect2;
        int i12;
        View view;
        nd ndVar;
        WeakHashMap weakHashMap = x80.a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList3 = this.f;
        int size = arrayList3.size();
        Rect g = g();
        Rect g2 = g();
        Rect g3 = g();
        int i13 = 0;
        while (true) {
            ax axVar = C;
            if (i13 >= size) {
                Rect rect3 = g3;
                g.setEmpty();
                axVar.c(g);
                g2.setEmpty();
                axVar.c(g2);
                rect3.setEmpty();
                axVar.c(rect3);
                return;
            }
            View view2 = (View) arrayList3.get(i13);
            qd qdVar2 = (qd) view2.getLayoutParams();
            if (i != 0 || view2.getVisibility() != 8) {
                int i14 = 0;
                while (i14 < i13) {
                    if (qdVar2.l == ((View) arrayList3.get(i14))) {
                        qd qdVar3 = (qd) view2.getLayoutParams();
                        if (qdVar3.k != null) {
                            Rect g4 = g();
                            Rect g5 = g();
                            qd qdVar4 = qdVar2;
                            Rect g6 = g();
                            l(g4, qdVar3.k);
                            j(view2, g5, false);
                            int measuredWidth = view2.getMeasuredWidth();
                            View view3 = view2;
                            int measuredHeight = view3.getMeasuredHeight();
                            arrayList2 = arrayList3;
                            qdVar = qdVar4;
                            i10 = i14;
                            layoutDirection = layoutDirection;
                            i12 = i13;
                            view = view3;
                            m(layoutDirection, g4, g6, qdVar3, measuredWidth, measuredHeight);
                            i11 = size;
                            rect2 = g3;
                            boolean z5 = (g6.left == g5.left && g6.top == g5.top) ? false : true;
                            h(qdVar3, g6, measuredWidth, measuredHeight);
                            int i15 = g6.left - g5.left;
                            int i16 = g6.top - g5.top;
                            if (i15 != 0) {
                                WeakHashMap weakHashMap2 = x80.a;
                                view.offsetLeftAndRight(i15);
                            }
                            if (i16 != 0) {
                                WeakHashMap weakHashMap3 = x80.a;
                                view.offsetTopAndBottom(i16);
                            }
                            if (z5 && (ndVar = qdVar3.a) != null) {
                                ndVar.h(this, view, qdVar3.k);
                            }
                            g4.setEmpty();
                            axVar.c(g4);
                            g5.setEmpty();
                            axVar.c(g5);
                            g6.setEmpty();
                            axVar.c(g6);
                            i14 = i10 + 1;
                            qdVar2 = qdVar;
                            view2 = view;
                            arrayList3 = arrayList2;
                            size = i11;
                            i13 = i12;
                            g3 = rect2;
                        }
                    }
                    arrayList2 = arrayList3;
                    qdVar = qdVar2;
                    i10 = i14;
                    i11 = size;
                    rect2 = g3;
                    i12 = i13;
                    view = view2;
                    i14 = i10 + 1;
                    qdVar2 = qdVar;
                    view2 = view;
                    arrayList3 = arrayList2;
                    size = i11;
                    i13 = i12;
                    g3 = rect2;
                }
                ArrayList arrayList4 = arrayList3;
                qd qdVar5 = qdVar2;
                int i17 = size;
                Rect rect4 = g3;
                i2 = i13;
                View view4 = view2;
                j(view4, g2, true);
                if (qdVar5.g != 0 && !g2.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(qdVar5.g, layoutDirection);
                    int i18 = absoluteGravity & 112;
                    if (i18 == 48) {
                        g.top = Math.max(g.top, g2.bottom);
                    } else if (i18 == 80) {
                        g.bottom = Math.max(g.bottom, getHeight() - g2.top);
                    }
                    int i19 = absoluteGravity & 7;
                    if (i19 == 3) {
                        g.left = Math.max(g.left, g2.right);
                    } else if (i19 == 5) {
                        g.right = Math.max(g.right, getWidth() - g2.left);
                    }
                }
                if (qdVar5.h != 0 && view4.getVisibility() == 0) {
                    WeakHashMap weakHashMap4 = x80.a;
                    if (view4.isLaidOut() && view4.getWidth() > 0 && view4.getHeight() > 0) {
                        qd qdVar6 = (qd) view4.getLayoutParams();
                        nd ndVar2 = qdVar6.a;
                        Rect g7 = g();
                        Rect g8 = g();
                        g8.set(view4.getLeft(), view4.getTop(), view4.getRight(), view4.getBottom());
                        if (ndVar2 == null || !ndVar2.e(g7, view4)) {
                            g7.set(g8);
                        } else if (!g8.contains(g7)) {
                            throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + g7.toShortString() + " | Bounds:" + g8.toShortString());
                        }
                        g8.setEmpty();
                        axVar.c(g8);
                        if (g7.isEmpty()) {
                            g7.setEmpty();
                            axVar.c(g7);
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(qdVar6.h, layoutDirection);
                            if ((absoluteGravity2 & 48) != 48 || (i8 = (g7.top - ((ViewGroup.MarginLayoutParams) qdVar6).topMargin) - qdVar6.j) >= (i9 = g.top)) {
                                z3 = false;
                            } else {
                                x(view4, i9 - i8);
                                z3 = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - g7.bottom) - ((ViewGroup.MarginLayoutParams) qdVar6).bottomMargin) + qdVar6.j) < (i7 = g.bottom)) {
                                x(view4, height - i7);
                                z3 = true;
                            }
                            if (!z3) {
                                x(view4, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i5 = (g7.left - ((ViewGroup.MarginLayoutParams) qdVar6).leftMargin) - qdVar6.i) >= (i6 = g.left)) {
                                z4 = false;
                            } else {
                                w(view4, i6 - i5);
                                z4 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - g7.right) - ((ViewGroup.MarginLayoutParams) qdVar6).rightMargin) + qdVar6.i) < (i4 = g.right)) {
                                w(view4, width - i4);
                                z4 = true;
                            }
                            if (!z4) {
                                w(view4, 0);
                            }
                            g7.setEmpty();
                            axVar.c(g7);
                        }
                    }
                }
                if (i != 2) {
                    rect = rect4;
                    rect.set(((qd) view4.getLayoutParams()).p);
                    if (rect.equals(g2)) {
                        arrayList = arrayList4;
                        i3 = i17;
                    } else {
                        ((qd) view4.getLayoutParams()).p.set(g2);
                    }
                } else {
                    rect = rect4;
                }
                int i20 = i2 + 1;
                i3 = i17;
                while (true) {
                    arrayList = arrayList4;
                    if (i20 >= i3) {
                        break;
                    }
                    View view5 = (View) arrayList.get(i20);
                    qd qdVar7 = (qd) view5.getLayoutParams();
                    nd ndVar3 = qdVar7.a;
                    if (ndVar3 != null && ndVar3.f(view5, view4)) {
                        if (i == 0 && qdVar7.o) {
                            qdVar7.o = false;
                        } else {
                            if (i != 2) {
                                z2 = ndVar3.h(this, view5, view4);
                            } else {
                                ndVar3.i(this, view4);
                                z2 = true;
                            }
                            if (i == 1) {
                                qdVar7.o = z2;
                            }
                        }
                    }
                    i20++;
                    arrayList4 = arrayList;
                }
            } else {
                arrayList = arrayList3;
                i3 = size;
                rect = g3;
                i2 = i13;
            }
            i13 = i2 + 1;
            g3 = rect;
            size = i3;
            arrayList3 = arrayList;
        }
    }

    public final void r(View view, int i) {
        Rect g;
        Rect g2;
        qd qdVar = (qd) view.getLayoutParams();
        View view2 = qdVar.k;
        if (view2 == null && qdVar.f != -1) {
            t8.t("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
            return;
        }
        ax axVar = C;
        if (view2 != null) {
            g = g();
            g2 = g();
            try {
                l(g, view2);
                qd qdVar2 = (qd) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                m(i, g, g2, qdVar2, measuredWidth, measuredHeight);
                h(qdVar2, g2, measuredWidth, measuredHeight);
                view.layout(g2.left, g2.top, g2.right, g2.bottom);
                return;
            } finally {
                g.setEmpty();
                axVar.c(g);
                g2.setEmpty();
                axVar.c(g2);
            }
        }
        int i2 = qdVar.e;
        if (i2 < 0) {
            qd qdVar3 = (qd) view.getLayoutParams();
            g = g();
            g.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) qdVar3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) qdVar3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) qdVar3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) qdVar3).bottomMargin);
            if (this.s != null) {
                WeakHashMap weakHashMap = x80.a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    g.left = this.s.b() + g.left;
                    g.top = this.s.d() + g.top;
                    g.right -= this.s.c();
                    g.bottom -= this.s.a();
                }
            }
            g2 = g();
            int i3 = qdVar3.c;
            if ((i3 & 7) == 0) {
                i3 |= 8388611;
            }
            if ((i3 & 112) == 0) {
                i3 |= 48;
            }
            Gravity.apply(i3, view.getMeasuredWidth(), view.getMeasuredHeight(), g, g2, i);
            view.layout(g2.left, g2.top, g2.right, g2.bottom);
            return;
        }
        qd qdVar4 = (qd) view.getLayoutParams();
        int i4 = qdVar4.c;
        if (i4 == 0) {
            i4 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = absoluteGravity & 7;
        int i6 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i == 1) {
            i2 = width - i2;
        }
        int n = n(i2) - measuredWidth2;
        if (i5 == 1) {
            n += measuredWidth2 / 2;
        } else if (i5 == 5) {
            n += measuredWidth2;
        }
        int i7 = i6 != 16 ? i6 != 80 ? 0 : measuredHeight2 : measuredHeight2 / 2;
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) qdVar4).leftMargin, Math.min(n, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) qdVar4).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) qdVar4).topMargin, Math.min(i7, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) qdVar4).bottomMargin));
        view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        nd ndVar = ((qd) view.getLayoutParams()).a;
        if (ndVar == null || !ndVar.q(this, view, rect, z2)) {
            return super.requestChildRectangleOnScreen(view, rect, z2);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        if (!z2 || this.l) {
            return;
        }
        v(false);
        this.l = true;
    }

    public final void s(View view, int i, int i2, int i3) {
        measureChildWithMargins(view, i, i2, i3, 0);
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z2) {
        super.setFitsSystemWindows(z2);
        y();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.v = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.u;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.u = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.u.setState(getDrawableState());
                }
                Drawable drawable3 = this.u;
                WeakHashMap weakHashMap = x80.a;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.u.setVisible(getVisibility() == 0, false);
                this.u.setCallback(this);
            }
            WeakHashMap weakHashMap2 = x80.a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? getContext().getDrawable(i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z2 = i == 0;
        Drawable drawable = this.u;
        if (drawable == null || drawable.isVisible() == z2) {
            return;
        }
        this.u.setVisible(z2, false);
    }

    public final boolean t(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.h;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            arrayList.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        ja jaVar = B;
        if (jaVar != null) {
            Collections.sort(arrayList, jaVar);
        }
        int size = arrayList.size();
        MotionEvent motionEvent2 = null;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) arrayList.get(i3);
            nd ndVar = ((qd) view.getLayoutParams()).a;
            if (z2 && actionMasked != 0) {
                if (ndVar != null) {
                    if (motionEvent2 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i == 0) {
                        ndVar.k(this, view, motionEvent2);
                    } else if (i == 1) {
                        ndVar.v(this, view, motionEvent2);
                    }
                }
            } else if (!z2 && ndVar != null) {
                if (i == 0) {
                    z2 = ndVar.k(this, view, motionEvent);
                } else if (i == 1) {
                    z2 = ndVar.v(this, view, motionEvent);
                }
                if (z2) {
                    this.o = view;
                }
            }
        }
        arrayList.clear();
        return z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f5, code lost:
    
        if ((android.view.Gravity.getAbsoluteGravity(r8.h, r12) & r13) == r13) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u() {
        ArrayList arrayList = this.f;
        arrayList.clear();
        we weVar = this.g;
        u20 u20Var = (u20) weVar.g;
        zw zwVar = (zw) weVar.f;
        u20 u20Var2 = (u20) weVar.g;
        int i = u20Var.h;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) u20Var.i(i2);
            if (arrayList2 != null) {
                arrayList2.clear();
                zwVar.c(arrayList2);
            }
        }
        u20Var.clear();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            qd o = o(childAt);
            int i4 = o.f;
            if (i4 == -1) {
                o.l = null;
                o.k = null;
            } else {
                View view = o.k;
                if (view != null && view.getId() == i4) {
                    View view2 = o.k;
                    for (ViewParent parent = view2.getParent(); parent != this; parent = parent.getParent()) {
                        if (parent == null || parent == childAt) {
                            o.l = null;
                            o.k = null;
                        } else {
                            if (parent instanceof View) {
                                view2 = parent;
                            }
                        }
                    }
                    o.l = view2;
                }
                View findViewById = findViewById(i4);
                o.k = findViewById;
                if (findViewById == null) {
                    if (!isInEditMode()) {
                        throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + getResources().getResourceName(i4) + " to anchor view " + childAt);
                    }
                    o.l = null;
                    o.k = null;
                } else if (findViewById != this) {
                    for (ViewParent parent2 = findViewById.getParent(); parent2 != this && parent2 != null; parent2 = parent2.getParent()) {
                        if (parent2 != childAt) {
                            if (parent2 instanceof View) {
                                findViewById = parent2;
                            }
                        } else if (!isInEditMode()) {
                            t8.t("Anchor must not be a descendant of the anchored view");
                            return;
                        } else {
                            o.l = null;
                            o.k = null;
                        }
                    }
                    o.l = findViewById;
                } else if (!isInEditMode()) {
                    t8.t("View can not be anchored to the the parent CoordinatorLayout");
                    return;
                } else {
                    o.l = null;
                    o.k = null;
                }
            }
            if (!u20Var2.containsKey(childAt)) {
                u20Var2.put(childAt, null);
            }
            for (int i5 = 0; i5 < childCount; i5++) {
                if (i5 != i3) {
                    View childAt2 = getChildAt(i5);
                    if (childAt2 != o.l) {
                        WeakHashMap weakHashMap = x80.a;
                        int layoutDirection = getLayoutDirection();
                        int absoluteGravity = Gravity.getAbsoluteGravity(((qd) childAt2.getLayoutParams()).g, layoutDirection);
                        if (absoluteGravity != 0) {
                        }
                        nd ndVar = o.a;
                        if (ndVar == null) {
                            continue;
                        } else if (!ndVar.f(childAt, childAt2)) {
                            continue;
                        }
                    }
                    if (!u20Var2.containsKey(childAt2) && !u20Var2.containsKey(childAt2)) {
                        u20Var2.put(childAt2, null);
                    }
                    if (!u20Var2.containsKey(childAt2) || !u20Var2.containsKey(childAt)) {
                        t8.k("All nodes must be present in the graph before being added as an edge");
                        return;
                    }
                    ArrayList arrayList3 = (ArrayList) u20Var2.get(childAt2);
                    if (arrayList3 == null) {
                        arrayList3 = (ArrayList) zwVar.a();
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        u20Var2.put(childAt2, arrayList3);
                    }
                    arrayList3.add(childAt);
                }
            }
        }
        ArrayList arrayList4 = (ArrayList) weVar.h;
        arrayList4.clear();
        HashSet hashSet = (HashSet) weVar.i;
        hashSet.clear();
        int i6 = u20Var2.h;
        for (int i7 = 0; i7 < i6; i7++) {
            weVar.f(u20Var2.f(i7), arrayList4, hashSet);
        }
        arrayList.addAll(arrayList4);
        Collections.reverse(arrayList);
    }

    public final void v(boolean z2) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            nd ndVar = ((qd) childAt.getLayoutParams()).a;
            if (ndVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z2) {
                    ndVar.k(this, childAt, obtain);
                } else {
                    ndVar.v(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((qd) getChildAt(i2).getLayoutParams()).getClass();
        }
        this.o = null;
        this.l = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.u;
    }

    public final void y() {
        WeakHashMap weakHashMap = x80.a;
        if (!getFitsSystemWindows()) {
            p80.c(this, null);
            return;
        }
        if (this.w == null) {
            this.w = new k0(16, this);
        }
        p80.c(this, this.w);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new qd(getContext(), attributeSet);
    }
}
