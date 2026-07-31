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
import b1.b;
import c3.a;
import c5.x;
import com.snovikpovik.vuevnxsj.R;
import d3.d;
import d3.e;
import d3.f;
import d3.g;
import d3.h;
import j0.o0;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import o.t0;
import p3.c;
import q3.a0;
import q3.c0;
import q3.k0;
import q3.l1;
import q3.n;
import q3.o;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements n, o {
    public static final c A;

    /* renamed from: w, reason: collision with root package name */
    public static final String f585w;

    /* renamed from: x, reason: collision with root package name */
    public static final Class[] f586x;

    /* renamed from: y, reason: collision with root package name */
    public static final ThreadLocal f587y;

    /* renamed from: z, reason: collision with root package name */
    public static final g f588z;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f589d;

    /* renamed from: e, reason: collision with root package name */
    public final x f590e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f591f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f592g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f593h;
    public final int[] i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f594j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f595k;

    /* renamed from: l, reason: collision with root package name */
    public final int[] f596l;

    /* renamed from: m, reason: collision with root package name */
    public View f597m;

    /* renamed from: n, reason: collision with root package name */
    public View f598n;

    /* renamed from: o, reason: collision with root package name */
    public e f599o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f600p;

    /* renamed from: q, reason: collision with root package name */
    public l1 f601q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f602r;

    /* renamed from: s, reason: collision with root package name */
    public Drawable f603s;

    /* renamed from: t, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f604t;

    /* renamed from: u, reason: collision with root package name */
    public b f605u;

    /* renamed from: v, reason: collision with root package name */
    public final o0 f606v;

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        f585w = r02 != null ? r02.getName() : null;
        f588z = new g(0);
        f586x = new Class[]{Context.class, AttributeSet.class};
        f587y = new ThreadLocal();
        A = new c();
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f589d = new ArrayList();
        this.f590e = new x(1);
        this.f591f = new ArrayList();
        this.f592g = new ArrayList();
        this.f593h = new int[2];
        this.i = new int[2];
        this.f606v = new o0();
        int[] iArr = a.f1610a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f596l = intArray;
            float f6 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i = 0; i < length; i++) {
                this.f596l[i] = (int) (r1[i] * f6);
            }
        }
        this.f603s = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        w();
        super.setOnHierarchyChangeListener(new d3.c(this));
        Field field = k0.f6120a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect g() {
        Rect rect = (Rect) A.a();
        return rect == null ? new Rect() : rect;
    }

    public static void l(int i, Rect rect, Rect rect2, d dVar, int i8, int i9) {
        int i10 = dVar.f2228c;
        if (i10 == 0) {
            i10 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, i);
        int i11 = dVar.f2229d;
        if ((i11 & 7) == 0) {
            i11 |= 8388611;
        }
        if ((i11 & 112) == 0) {
            i11 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i11, i);
        int i12 = absoluteGravity & 7;
        int i13 = absoluteGravity & 112;
        int i14 = absoluteGravity2 & 7;
        int i15 = absoluteGravity2 & 112;
        int width = i14 != 1 ? i14 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i15 != 16 ? i15 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i12 == 1) {
            width -= i8 / 2;
        } else if (i12 != 5) {
            width -= i8;
        }
        if (i13 == 16) {
            height -= i9 / 2;
        } else if (i13 != 80) {
            height -= i9;
        }
        rect2.set(width, height, i8 + width, i9 + height);
    }

    public static d n(View view) {
        d dVar = (d) view.getLayoutParams();
        if (!dVar.f2227b) {
            d3.b bVar = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                bVar = (d3.b) cls.getAnnotation(d3.b.class);
                if (bVar != null) {
                    break;
                }
            }
            if (bVar != null) {
                try {
                    d3.a aVar = (d3.a) bVar.value().getDeclaredConstructor(null).newInstance(null);
                    d3.a aVar2 = dVar.f2226a;
                    if (aVar2 != aVar) {
                        if (aVar2 != null) {
                            aVar2.e();
                        }
                        dVar.f2226a = aVar;
                        dVar.f2227b = true;
                        if (aVar != null) {
                            aVar.c(dVar);
                        }
                    }
                } catch (Exception e8) {
                    Log.e("CoordinatorLayout", "Default behavior class " + bVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e8);
                }
            }
            dVar.f2227b = true;
        }
        return dVar;
    }

    public static void u(View view, int i) {
        d dVar = (d) view.getLayoutParams();
        int i8 = dVar.i;
        if (i8 != i) {
            Field field = k0.f6120a;
            view.offsetLeftAndRight(i - i8);
            dVar.i = i;
        }
    }

    public static void v(View view, int i) {
        d dVar = (d) view.getLayoutParams();
        int i8 = dVar.f2234j;
        if (i8 != i) {
            Field field = k0.f6120a;
            view.offsetTopAndBottom(i - i8);
            dVar.f2234j = i;
        }
    }

    @Override // q3.n
    public final void a(View view, View view2, int i, int i8) {
        o0 o0Var = this.f606v;
        if (i8 == 1) {
            o0Var.f3810b = i;
        } else {
            o0Var.f3809a = i;
        }
        this.f598n = view2;
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            ((d) getChildAt(i9).getLayoutParams()).getClass();
        }
    }

    @Override // q3.n
    public final void b(View view, int i) {
        o0 o0Var = this.f606v;
        if (i == 1) {
            o0Var.f3810b = 0;
        } else {
            o0Var.f3809a = 0;
        }
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            d dVar = (d) childAt.getLayoutParams();
            if (dVar.a(i)) {
                d3.a aVar = dVar.f2226a;
                if (aVar != null) {
                    aVar.p(childAt, view, i);
                }
                if (i == 0) {
                    dVar.f2237m = false;
                } else if (i == 1) {
                    dVar.f2238n = false;
                }
            }
        }
        this.f598n = null;
    }

    @Override // q3.n
    public final void c(View view, int i, int i8, int[] iArr, int i9) {
        d3.a aVar;
        int childCount = getChildCount();
        boolean z3 = false;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.a(i9) && (aVar = dVar.f2226a) != null) {
                    int[] iArr2 = this.f593h;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    aVar.j(this, childAt, view, i, i8, iArr2, i9);
                    i10 = i > 0 ? Math.max(i10, iArr2[0]) : Math.min(i10, iArr2[0]);
                    i11 = i8 > 0 ? Math.max(i11, iArr2[1]) : Math.min(i11, iArr2[1]);
                    z3 = true;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
        if (z3) {
            p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof d) && super.checkLayoutParams(layoutParams);
    }

    @Override // q3.o
    public final void d(View view, int i, int i8, int i9, int i10, int i11, int[] iArr) {
        d3.a aVar;
        int childCount = getChildCount();
        int i12 = 0;
        int i13 = 0;
        boolean z3 = false;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.a(i11) && (aVar = dVar.f2226a) != null) {
                    int[] iArr2 = this.f593h;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    aVar.k(this, childAt, i8, i9, i10, iArr2);
                    i12 = i9 > 0 ? Math.max(i12, iArr2[0]) : Math.min(i12, iArr2[0]);
                    i13 = i10 > 0 ? Math.max(i13, iArr2[1]) : Math.min(i13, iArr2[1]);
                    z3 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i12;
        iArr[1] = iArr[1] + i13;
        if (z3) {
            p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j7) {
        d3.a aVar = ((d) view.getLayoutParams()).f2226a;
        if (aVar != null) {
            aVar.getClass();
        }
        return super.drawChild(canvas, view, j7);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f603s;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // q3.n
    public final void e(View view, int i, int i8, int i9, int i10, int i11) {
        d(view, i, i8, i9, i10, 0, this.i);
    }

    @Override // q3.n
    public final boolean f(View view, View view2, int i, int i8) {
        int childCount = getChildCount();
        boolean z3 = false;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                d3.a aVar = dVar.f2226a;
                if (aVar != null) {
                    boolean o2 = aVar.o(childAt, i, i8);
                    z3 |= o2;
                    if (i8 == 0) {
                        dVar.f2237m = o2;
                    } else if (i8 == 1) {
                        dVar.f2238n = o2;
                    }
                } else if (i8 == 0) {
                    dVar.f2237m = false;
                } else if (i8 == 1) {
                    dVar.f2238n = false;
                }
            }
        }
        return z3;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new d();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        s();
        return Collections.unmodifiableList(this.f589d);
    }

    public final l1 getLastWindowInsets() {
        return this.f601q;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        o0 o0Var = this.f606v;
        return o0Var.f3810b | o0Var.f3809a;
    }

    public Drawable getStatusBarBackground() {
        return this.f603s;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(d dVar, Rect rect, int i, int i8) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) dVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) dVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i8) - ((ViewGroup.MarginLayoutParams) dVar).bottomMargin));
        rect.set(max, max2, i + max, i8 + max2);
    }

    public final void i(View view, Rect rect, boolean z3) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z3) {
            k(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final ArrayList j(View view) {
        t0 t0Var = (t0) this.f590e.f1738e;
        int i = t0Var.f5542f;
        ArrayList arrayList = null;
        for (int i8 = 0; i8 < i; i8++) {
            ArrayList arrayList2 = (ArrayList) t0Var.i(i8);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(t0Var.f(i8));
            }
        }
        ArrayList arrayList3 = this.f592g;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void k(View view, Rect rect) {
        ThreadLocal threadLocal = h.f2243a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = h.f2243a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        h.a(this, view, matrix);
        ThreadLocal threadLocal3 = h.f2244b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int m(int i) {
        int[] iArr = this.f596l;
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

    public final boolean o(View view, int i, int i8) {
        c cVar = A;
        Rect g3 = g();
        k(view, g3);
        try {
            return g3.contains(i, i8);
        } finally {
            g3.setEmpty();
            cVar.c(g3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t(false);
        if (this.f600p) {
            if (this.f599o == null) {
                this.f599o = new e(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f599o);
        }
        if (this.f601q == null) {
            Field field = k0.f6120a;
            if (getFitsSystemWindows()) {
                a0.c(this);
            }
        }
        this.f595k = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t(false);
        if (this.f600p && this.f599o != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f599o);
        }
        View view = this.f598n;
        if (view != null) {
            b(view, 0);
        }
        this.f595k = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f602r || this.f603s == null) {
            return;
        }
        l1 l1Var = this.f601q;
        int a8 = l1Var != null ? l1Var.a() : 0;
        if (a8 > 0) {
            this.f603s.setBounds(0, 0, getWidth(), a8);
            this.f603s.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            t(true);
        }
        boolean r7 = r(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return r7;
        }
        t(true);
        return r7;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i8, int i9, int i10) {
        d3.a aVar;
        Field field = k0.f6120a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f589d;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view = (View) arrayList.get(i11);
            if (view.getVisibility() != 8 && ((aVar = ((d) view.getLayoutParams()).f2226a) == null || !aVar.g(this, view, layoutDirection))) {
                q(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0197  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i8) {
        boolean z3;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        d3.a aVar;
        int i15;
        int i16;
        boolean z7;
        int i17;
        int i18;
        ArrayList arrayList;
        int i19;
        int i20;
        View view;
        int i21;
        int max;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.s();
        int childCount = coordinatorLayout.getChildCount();
        int i22 = 0;
        loop0: while (true) {
            if (i22 >= childCount) {
                z3 = false;
                break;
            }
            View childAt = coordinatorLayout.getChildAt(i22);
            t0 t0Var = (t0) coordinatorLayout.f590e.f1738e;
            int i23 = t0Var.f5542f;
            for (int i24 = 0; i24 < i23; i24++) {
                ArrayList arrayList2 = (ArrayList) t0Var.i(i24);
                if (arrayList2 != null && arrayList2.contains(childAt)) {
                    z3 = true;
                    break loop0;
                }
            }
            i22++;
        }
        if (z3 != coordinatorLayout.f600p) {
            if (z3) {
                if (coordinatorLayout.f595k) {
                    if (coordinatorLayout.f599o == null) {
                        coordinatorLayout.f599o = new e(coordinatorLayout);
                    }
                    coordinatorLayout.getViewTreeObserver().addOnPreDrawListener(coordinatorLayout.f599o);
                }
                coordinatorLayout.f600p = true;
            } else {
                if (coordinatorLayout.f595k && coordinatorLayout.f599o != null) {
                    coordinatorLayout.getViewTreeObserver().removeOnPreDrawListener(coordinatorLayout.f599o);
                }
                coordinatorLayout.f600p = false;
            }
        }
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        Field field = k0.f6120a;
        int layoutDirection = coordinatorLayout.getLayoutDirection();
        boolean z8 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i8);
        int size2 = View.MeasureSpec.getSize(i8);
        int i25 = paddingLeft + paddingRight;
        int i26 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z9 = coordinatorLayout.f601q != null && coordinatorLayout.getFitsSystemWindows();
        ArrayList arrayList3 = coordinatorLayout.f589d;
        int size3 = arrayList3.size();
        int i27 = 0;
        int i28 = 0;
        while (i27 < size3) {
            View view2 = (View) arrayList3.get(i27);
            int i29 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                arrayList = arrayList3;
                i12 = size3;
                i21 = i27;
                i15 = paddingLeft;
                suggestedMinimumWidth = i29;
                z7 = false;
                i17 = paddingRight;
            } else {
                d dVar = (d) view2.getLayoutParams();
                int i30 = dVar.f2230e;
                if (i30 < 0 || mode == 0) {
                    i9 = suggestedMinimumHeight;
                } else {
                    int m7 = coordinatorLayout.m(i30);
                    int i31 = dVar.f2228c;
                    if (i31 == 0) {
                        i31 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i31, layoutDirection) & 7;
                    i9 = suggestedMinimumHeight;
                    if ((absoluteGravity == 3 && !z8) || (absoluteGravity == 5 && z8)) {
                        max = Math.max(0, (size - paddingRight) - m7);
                    } else if ((absoluteGravity == 5 && !z8) || (absoluteGravity == 3 && z8)) {
                        max = Math.max(0, m7 - paddingLeft);
                    }
                    int i32 = size3;
                    i11 = max;
                    i10 = i32;
                    if (z9 || view2.getFitsSystemWindows()) {
                        i12 = i10;
                        i13 = i;
                        i14 = i8;
                    } else {
                        i12 = i10;
                        int i33 = coordinatorLayout.f601q.f6127a.k().f3423c + coordinatorLayout.f601q.f6127a.k().f3421a;
                        int a8 = coordinatorLayout.f601q.f6127a.k().f3424d + coordinatorLayout.f601q.a();
                        i13 = View.MeasureSpec.makeMeasureSpec(size - i33, mode);
                        i14 = View.MeasureSpec.makeMeasureSpec(size2 - a8, mode2);
                    }
                    aVar = dVar.f2226a;
                    if (aVar == null) {
                        z7 = false;
                        i15 = paddingLeft;
                        i16 = i29;
                        i17 = paddingRight;
                        i18 = i9;
                        arrayList = arrayList3;
                        int i34 = i13;
                        i21 = i27;
                        int i35 = i14;
                        boolean h8 = aVar.h(this, view2, i34, i11, i35);
                        view = view2;
                        i13 = i34;
                        i19 = i11;
                        i20 = i35;
                        if (h8) {
                            coordinatorLayout = this;
                            int max2 = Math.max(i16, view.getMeasuredWidth() + i25 + ((ViewGroup.MarginLayoutParams) dVar).leftMargin + ((ViewGroup.MarginLayoutParams) dVar).rightMargin);
                            int max3 = Math.max(i18, view.getMeasuredHeight() + i26 + ((ViewGroup.MarginLayoutParams) dVar).topMargin + ((ViewGroup.MarginLayoutParams) dVar).bottomMargin);
                            i28 = View.combineMeasuredStates(i28, view.getMeasuredState());
                            suggestedMinimumWidth = max2;
                            suggestedMinimumHeight = max3;
                        }
                    } else {
                        i15 = paddingLeft;
                        i16 = i29;
                        z7 = false;
                        i17 = paddingRight;
                        i18 = i9;
                        arrayList = arrayList3;
                        i19 = i11;
                        i20 = i14;
                        view = view2;
                        i21 = i27;
                    }
                    coordinatorLayout = this;
                    coordinatorLayout.measureChildWithMargins(view, i13, i19, i20, 0);
                    int max22 = Math.max(i16, view.getMeasuredWidth() + i25 + ((ViewGroup.MarginLayoutParams) dVar).leftMargin + ((ViewGroup.MarginLayoutParams) dVar).rightMargin);
                    int max32 = Math.max(i18, view.getMeasuredHeight() + i26 + ((ViewGroup.MarginLayoutParams) dVar).topMargin + ((ViewGroup.MarginLayoutParams) dVar).bottomMargin);
                    i28 = View.combineMeasuredStates(i28, view.getMeasuredState());
                    suggestedMinimumWidth = max22;
                    suggestedMinimumHeight = max32;
                }
                i10 = size3;
                i11 = 0;
                if (z9) {
                }
                i12 = i10;
                i13 = i;
                i14 = i8;
                aVar = dVar.f2226a;
                if (aVar == null) {
                }
                coordinatorLayout = this;
                coordinatorLayout.measureChildWithMargins(view, i13, i19, i20, 0);
                int max222 = Math.max(i16, view.getMeasuredWidth() + i25 + ((ViewGroup.MarginLayoutParams) dVar).leftMargin + ((ViewGroup.MarginLayoutParams) dVar).rightMargin);
                int max322 = Math.max(i18, view.getMeasuredHeight() + i26 + ((ViewGroup.MarginLayoutParams) dVar).topMargin + ((ViewGroup.MarginLayoutParams) dVar).bottomMargin);
                i28 = View.combineMeasuredStates(i28, view.getMeasuredState());
                suggestedMinimumWidth = max222;
                suggestedMinimumHeight = max322;
            }
            i27 = i21 + 1;
            paddingLeft = i15;
            paddingRight = i17;
            size3 = i12;
            arrayList3 = arrayList;
        }
        int i36 = i28;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i, (-16777216) & i36), View.resolveSizeAndState(suggestedMinimumHeight, i8, i36 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f6, float f8, boolean z3) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.a(0)) {
                    d3.a aVar = dVar.f2226a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f6, float f8) {
        d3.a aVar;
        int childCount = getChildCount();
        boolean z3 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.a(0) && (aVar = dVar.f2226a) != null) {
                    z3 |= aVar.i(view);
                }
            }
        }
        return z3;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i8, int[] iArr) {
        c(view, i, i8, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i8, int i9, int i10) {
        e(view, i, i8, i9, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        a(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.f7877d);
        SparseArray sparseArray = fVar.f2241f;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            d3.a aVar = n(childAt).f2226a;
            if (id != -1 && aVar != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                aVar.m(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable n6;
        f fVar = new f(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            d3.a aVar = ((d) childAt.getLayoutParams()).f2226a;
            if (id != -1 && aVar != null && (n6 = aVar.n(childAt)) != null) {
                sparseArray.append(id, n6);
            }
        }
        fVar.f2241f = sparseArray;
        return fVar;
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
        boolean z3;
        boolean q4;
        MotionEvent motionEvent2;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f597m == null) {
            z3 = r(motionEvent, 1);
        } else {
            z3 = false;
        }
        d3.a aVar = ((d) this.f597m.getLayoutParams()).f2226a;
        if (aVar != null) {
            q4 = aVar.q(this.f597m, motionEvent);
            motionEvent2 = null;
            if (this.f597m != null) {
                q4 |= super.onTouchEvent(motionEvent);
            } else if (z3) {
                long uptimeMillis = SystemClock.uptimeMillis();
                motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEvent2);
            }
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            if (actionMasked == 1 && actionMasked != 3) {
                return q4;
            }
            t(false);
            return q4;
        }
        q4 = false;
        motionEvent2 = null;
        if (this.f597m != null) {
        }
        if (motionEvent2 != null) {
        }
        if (actionMasked == 1) {
        }
        t(false);
        return q4;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0270  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(int i) {
        int i8;
        Rect rect;
        int i9;
        int i10;
        ArrayList arrayList;
        boolean z3;
        boolean z7;
        int width;
        int i11;
        int i12;
        int i13;
        int height;
        int i14;
        int i15;
        int i16;
        ArrayList arrayList2;
        d dVar;
        int i17;
        int i18;
        Rect rect2;
        int i19;
        View view;
        d3.a aVar;
        Field field = k0.f6120a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList3 = this.f589d;
        int size = arrayList3.size();
        Rect g3 = g();
        Rect g7 = g();
        Rect g8 = g();
        int i20 = 0;
        while (true) {
            c cVar = A;
            if (i20 >= size) {
                Rect rect3 = g8;
                g3.setEmpty();
                cVar.c(g3);
                g7.setEmpty();
                cVar.c(g7);
                rect3.setEmpty();
                cVar.c(rect3);
                return;
            }
            View view2 = (View) arrayList3.get(i20);
            d dVar2 = (d) view2.getLayoutParams();
            if (i == 0 && view2.getVisibility() == 8) {
                arrayList = arrayList3;
                i10 = size;
                rect = g8;
                i8 = i20;
            } else {
                int i21 = 0;
                while (i21 < i20) {
                    if (dVar2.f2236l == ((View) arrayList3.get(i21))) {
                        d dVar3 = (d) view2.getLayoutParams();
                        if (dVar3.f2235k != null) {
                            Rect g9 = g();
                            Rect g10 = g();
                            d dVar4 = dVar2;
                            Rect g11 = g();
                            k(dVar3.f2235k, g9);
                            i(view2, g10, false);
                            int measuredWidth = view2.getMeasuredWidth();
                            View view3 = view2;
                            int measuredHeight = view3.getMeasuredHeight();
                            arrayList2 = arrayList3;
                            dVar = dVar4;
                            i17 = i21;
                            layoutDirection = layoutDirection;
                            i19 = i20;
                            view = view3;
                            l(layoutDirection, g9, g11, dVar3, measuredWidth, measuredHeight);
                            i18 = size;
                            rect2 = g8;
                            boolean z8 = (g11.left == g10.left && g11.top == g10.top) ? false : true;
                            h(dVar3, g11, measuredWidth, measuredHeight);
                            int i22 = g11.left - g10.left;
                            int i23 = g11.top - g10.top;
                            if (i22 != 0) {
                                Field field2 = k0.f6120a;
                                view.offsetLeftAndRight(i22);
                            }
                            if (i23 != 0) {
                                Field field3 = k0.f6120a;
                                view.offsetTopAndBottom(i23);
                            }
                            if (z8 && (aVar = dVar3.f2226a) != null) {
                                aVar.d(this, view, dVar3.f2235k);
                            }
                            g9.setEmpty();
                            cVar.c(g9);
                            g10.setEmpty();
                            cVar.c(g10);
                            g11.setEmpty();
                            cVar.c(g11);
                            i21 = i17 + 1;
                            dVar2 = dVar;
                            view2 = view;
                            arrayList3 = arrayList2;
                            size = i18;
                            i20 = i19;
                            g8 = rect2;
                        }
                    }
                    arrayList2 = arrayList3;
                    dVar = dVar2;
                    i17 = i21;
                    i18 = size;
                    rect2 = g8;
                    i19 = i20;
                    view = view2;
                    i21 = i17 + 1;
                    dVar2 = dVar;
                    view2 = view;
                    arrayList3 = arrayList2;
                    size = i18;
                    i20 = i19;
                    g8 = rect2;
                }
                ArrayList arrayList4 = arrayList3;
                d dVar5 = dVar2;
                int i24 = size;
                Rect rect4 = g8;
                i8 = i20;
                View view4 = view2;
                i(view4, g7, true);
                if (dVar5.f2232g != 0 && !g7.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(dVar5.f2232g, layoutDirection);
                    int i25 = absoluteGravity & 112;
                    if (i25 == 48) {
                        g3.top = Math.max(g3.top, g7.bottom);
                    } else if (i25 == 80) {
                        g3.bottom = Math.max(g3.bottom, getHeight() - g7.top);
                    }
                    int i26 = absoluteGravity & 7;
                    if (i26 == 3) {
                        g3.left = Math.max(g3.left, g7.right);
                    } else if (i26 == 5) {
                        g3.right = Math.max(g3.right, getWidth() - g7.left);
                    }
                }
                if (dVar5.f2233h != 0 && view4.getVisibility() == 0) {
                    Field field4 = k0.f6120a;
                    if (view4.isLaidOut() && view4.getWidth() > 0 && view4.getHeight() > 0) {
                        d dVar6 = (d) view4.getLayoutParams();
                        d3.a aVar2 = dVar6.f2226a;
                        Rect g12 = g();
                        Rect g13 = g();
                        g13.set(view4.getLeft(), view4.getTop(), view4.getRight(), view4.getBottom());
                        if (aVar2 == null || !aVar2.a(view4)) {
                            g12.set(g13);
                        } else if (!g13.contains(g12)) {
                            throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + g12.toShortString() + " | Bounds:" + g13.toShortString());
                        }
                        g13.setEmpty();
                        cVar.c(g13);
                        if (g12.isEmpty()) {
                            g12.setEmpty();
                            cVar.c(g12);
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(dVar6.f2233h, layoutDirection);
                            if ((absoluteGravity2 & 48) != 48 || (i15 = (g12.top - ((ViewGroup.MarginLayoutParams) dVar6).topMargin) - dVar6.f2234j) >= (i16 = g3.top)) {
                                z3 = false;
                            } else {
                                v(view4, i16 - i15);
                                z3 = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - g12.bottom) - ((ViewGroup.MarginLayoutParams) dVar6).bottomMargin) + dVar6.f2234j) < (i14 = g3.bottom)) {
                                v(view4, height - i14);
                                z3 = true;
                            }
                            if (!z3) {
                                v(view4, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i12 = (g12.left - ((ViewGroup.MarginLayoutParams) dVar6).leftMargin) - dVar6.i) >= (i13 = g3.left)) {
                                z7 = false;
                            } else {
                                u(view4, i13 - i12);
                                z7 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - g12.right) - ((ViewGroup.MarginLayoutParams) dVar6).rightMargin) + dVar6.i) < (i11 = g3.right)) {
                                u(view4, width - i11);
                                z7 = true;
                            }
                            if (!z7) {
                                u(view4, 0);
                            }
                            g12.setEmpty();
                            cVar.c(g12);
                            if (i == 2) {
                                rect = rect4;
                                rect.set(((d) view4.getLayoutParams()).f2239o);
                                if (rect.equals(g7)) {
                                    arrayList = arrayList4;
                                    i10 = i24;
                                } else {
                                    ((d) view4.getLayoutParams()).f2239o.set(g7);
                                }
                            } else {
                                rect = rect4;
                            }
                            i9 = i8 + 1;
                            i10 = i24;
                            while (true) {
                                arrayList = arrayList4;
                                if (i9 >= i10) {
                                    View view5 = (View) arrayList.get(i9);
                                    d3.a aVar3 = ((d) view5.getLayoutParams()).f2226a;
                                    if (aVar3 != null) {
                                        aVar3.b(view5);
                                    }
                                    i9++;
                                    arrayList4 = arrayList;
                                }
                            }
                        }
                    }
                }
                if (i == 2) {
                }
                i9 = i8 + 1;
                i10 = i24;
                while (true) {
                    arrayList = arrayList4;
                    if (i9 >= i10) {
                        break;
                    }
                    i9++;
                    arrayList4 = arrayList;
                }
            }
            i20 = i8 + 1;
            size = i10;
            g8 = rect;
            arrayList3 = arrayList;
        }
    }

    public final void q(View view, int i) {
        Rect g3;
        Rect g7;
        d dVar = (d) view.getLayoutParams();
        View view2 = dVar.f2235k;
        if (view2 == null && dVar.f2231f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        c cVar = A;
        if (view2 != null) {
            g3 = g();
            g7 = g();
            try {
                k(view2, g3);
                d dVar2 = (d) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                l(i, g3, g7, dVar2, measuredWidth, measuredHeight);
                h(dVar2, g7, measuredWidth, measuredHeight);
                view.layout(g7.left, g7.top, g7.right, g7.bottom);
                return;
            } finally {
                g3.setEmpty();
                cVar.c(g3);
                g7.setEmpty();
                cVar.c(g7);
            }
        }
        int i8 = dVar.f2230e;
        if (i8 < 0) {
            d dVar3 = (d) view.getLayoutParams();
            g3 = g();
            g3.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) dVar3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) dVar3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) dVar3).bottomMargin);
            if (this.f601q != null) {
                Field field = k0.f6120a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    g3.left = this.f601q.f6127a.k().f3421a + g3.left;
                    g3.top = this.f601q.a() + g3.top;
                    g3.right -= this.f601q.f6127a.k().f3423c;
                    g3.bottom -= this.f601q.f6127a.k().f3424d;
                }
            }
            g7 = g();
            int i9 = dVar3.f2228c;
            if ((i9 & 7) == 0) {
                i9 |= 8388611;
            }
            if ((i9 & 112) == 0) {
                i9 |= 48;
            }
            Gravity.apply(i9, view.getMeasuredWidth(), view.getMeasuredHeight(), g3, g7, i);
            view.layout(g7.left, g7.top, g7.right, g7.bottom);
            return;
        }
        d dVar4 = (d) view.getLayoutParams();
        int i10 = dVar4.f2228c;
        if (i10 == 0) {
            i10 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, i);
        int i11 = absoluteGravity & 7;
        int i12 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i == 1) {
            i8 = width - i8;
        }
        int m7 = m(i8) - measuredWidth2;
        if (i11 == 1) {
            m7 += measuredWidth2 / 2;
        } else if (i11 == 5) {
            m7 += measuredWidth2;
        }
        int i13 = i12 != 16 ? i12 != 80 ? 0 : measuredHeight2 : measuredHeight2 / 2;
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar4).leftMargin, Math.min(m7, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) dVar4).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) dVar4).topMargin, Math.min(i13, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) dVar4).bottomMargin));
        view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
    }

    public final boolean r(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f591f;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i8 = childCount - 1; i8 >= 0; i8--) {
            arrayList.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i8) : i8));
        }
        g gVar = f588z;
        if (gVar != null) {
            Collections.sort(arrayList, gVar);
        }
        int size = arrayList.size();
        MotionEvent motionEvent2 = null;
        boolean z3 = false;
        for (int i9 = 0; i9 < size; i9++) {
            View view = (View) arrayList.get(i9);
            d3.a aVar = ((d) view.getLayoutParams()).f2226a;
            if (z3 && actionMasked != 0) {
                if (aVar != null) {
                    if (motionEvent2 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i == 0) {
                        aVar.f(this, view, motionEvent2);
                    } else if (i == 1) {
                        aVar.q(view, motionEvent2);
                    }
                }
            } else if (!z3 && aVar != null) {
                if (i == 0) {
                    z3 = aVar.f(this, view, motionEvent);
                } else if (i == 1) {
                    z3 = aVar.q(view, motionEvent);
                }
                if (z3) {
                    this.f597m = view;
                }
            }
        }
        arrayList.clear();
        return z3;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z3) {
        d3.a aVar = ((d) view.getLayoutParams()).f2226a;
        if (aVar != null) {
            aVar.l(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z3) {
        super.requestDisallowInterceptTouchEvent(z3);
        if (!z3 || this.f594j) {
            return;
        }
        t(false);
        this.f594j = true;
    }

    public final void s() {
        ArrayList arrayList = this.f589d;
        arrayList.clear();
        x xVar = this.f590e;
        t0 t0Var = (t0) xVar.f1738e;
        p3.b bVar = (p3.b) xVar.f1737d;
        t0 t0Var2 = (t0) xVar.f1738e;
        int i = t0Var.f5542f;
        for (int i8 = 0; i8 < i; i8++) {
            ArrayList arrayList2 = (ArrayList) t0Var.i(i8);
            if (arrayList2 != null) {
                arrayList2.clear();
                bVar.c(arrayList2);
            }
        }
        t0Var.clear();
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            d n6 = n(childAt);
            int i10 = n6.f2231f;
            if (i10 == -1) {
                n6.f2236l = null;
                n6.f2235k = null;
            } else {
                View view = n6.f2235k;
                if (view != null && view.getId() == i10) {
                    View view2 = n6.f2235k;
                    for (ViewParent parent = view2.getParent(); parent != this; parent = parent.getParent()) {
                        if (parent == null || parent == childAt) {
                            n6.f2236l = null;
                            n6.f2235k = null;
                        } else {
                            if (parent instanceof View) {
                                view2 = parent;
                            }
                        }
                    }
                    n6.f2236l = view2;
                }
                View findViewById = findViewById(i10);
                n6.f2235k = findViewById;
                if (findViewById == null) {
                    if (!isInEditMode()) {
                        throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + getResources().getResourceName(i10) + " to anchor view " + childAt);
                    }
                    n6.f2236l = null;
                    n6.f2235k = null;
                } else if (findViewById != this) {
                    for (ViewParent parent2 = findViewById.getParent(); parent2 != this && parent2 != null; parent2 = parent2.getParent()) {
                        if (parent2 != childAt) {
                            if (parent2 instanceof View) {
                                findViewById = parent2;
                            }
                        } else {
                            if (!isInEditMode()) {
                                throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                            }
                            n6.f2236l = null;
                            n6.f2235k = null;
                        }
                    }
                    n6.f2236l = findViewById;
                } else {
                    if (!isInEditMode()) {
                        throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                    }
                    n6.f2236l = null;
                    n6.f2235k = null;
                }
            }
            if (!t0Var2.containsKey(childAt)) {
                t0Var2.put(childAt, null);
            }
            for (int i11 = 0; i11 < childCount; i11++) {
                if (i11 != i9) {
                    View childAt2 = getChildAt(i11);
                    if (childAt2 != n6.f2236l) {
                        Field field = k0.f6120a;
                        int layoutDirection = getLayoutDirection();
                        int absoluteGravity = Gravity.getAbsoluteGravity(((d) childAt2.getLayoutParams()).f2232g, layoutDirection);
                        if (absoluteGravity == 0 || (Gravity.getAbsoluteGravity(n6.f2233h, layoutDirection) & absoluteGravity) != absoluteGravity) {
                            d3.a aVar = n6.f2226a;
                            if (aVar != null) {
                                aVar.b(childAt);
                            }
                        }
                    }
                    if (!t0Var2.containsKey(childAt2) && !t0Var2.containsKey(childAt2)) {
                        t0Var2.put(childAt2, null);
                    }
                    if (!t0Var2.containsKey(childAt2) || !t0Var2.containsKey(childAt)) {
                        throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
                    }
                    ArrayList arrayList3 = (ArrayList) t0Var2.get(childAt2);
                    if (arrayList3 == null) {
                        arrayList3 = (ArrayList) bVar.a();
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        t0Var2.put(childAt2, arrayList3);
                    }
                    arrayList3.add(childAt);
                }
            }
        }
        ArrayList arrayList4 = (ArrayList) xVar.f1739f;
        arrayList4.clear();
        HashSet hashSet = (HashSet) xVar.f1740g;
        hashSet.clear();
        int i12 = t0Var2.f5542f;
        for (int i13 = 0; i13 < i12; i13++) {
            xVar.e(t0Var2.f(i13), arrayList4, hashSet);
        }
        arrayList.addAll(arrayList4);
        Collections.reverse(arrayList);
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z3) {
        super.setFitsSystemWindows(z3);
        w();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f604t = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f603s;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f603s = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f603s.setState(getDrawableState());
                }
                Drawable drawable3 = this.f603s;
                Field field = k0.f6120a;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.f603s.setVisible(getVisibility() == 0, false);
                this.f603s.setCallback(this);
            }
            Field field2 = k0.f6120a;
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
        boolean z3 = i == 0;
        Drawable drawable = this.f603s;
        if (drawable == null || drawable.isVisible() == z3) {
            return;
        }
        this.f603s.setVisible(z3, false);
    }

    public final void t(boolean z3) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            d3.a aVar = ((d) childAt.getLayoutParams()).f2226a;
            if (aVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z3) {
                    aVar.f(this, childAt, obtain);
                } else {
                    aVar.q(childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i8 = 0; i8 < childCount; i8++) {
            ((d) getChildAt(i8).getLayoutParams()).getClass();
        }
        this.f597m = null;
        this.f594j = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f603s;
    }

    public final void w() {
        Field field = k0.f6120a;
        if (!getFitsSystemWindows()) {
            c0.i(this, null);
            return;
        }
        if (this.f605u == null) {
            this.f605u = new b(6, this);
        }
        c0.i(this, this.f605u);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d ? new d((d) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new d((ViewGroup.MarginLayoutParams) layoutParams) : new d(layoutParams);
    }
}
