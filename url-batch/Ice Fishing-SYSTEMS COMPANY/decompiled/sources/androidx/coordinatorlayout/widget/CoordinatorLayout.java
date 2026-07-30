package androidx.coordinatorlayout.widget;

import A.a;
import B.b;
import B.c;
import B.e;
import B.f;
import B.h;
import B.i;
import I0.j;
import N.d;
import O.A0;
import O.C0357t;
import O.InterfaceC0356s;
import O.J;
import O.L;
import O.X;
import O.r;
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
import com.icefishing.icefishingliveapp.C5284R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.WeakHashMap;
import s.k;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements r, InterfaceC0356s {

    /* renamed from: M, reason: collision with root package name */
    public static final String f4774M;

    /* renamed from: N, reason: collision with root package name */
    public static final Class[] f4775N;

    /* renamed from: O, reason: collision with root package name */
    public static final ThreadLocal f4776O;

    /* renamed from: P, reason: collision with root package name */
    public static final i f4777P;

    /* renamed from: Q, reason: collision with root package name */
    public static final d f4778Q;

    /* renamed from: A, reason: collision with root package name */
    public boolean f4779A;

    /* renamed from: B, reason: collision with root package name */
    public final int[] f4780B;

    /* renamed from: C, reason: collision with root package name */
    public View f4781C;

    /* renamed from: D, reason: collision with root package name */
    public View f4782D;

    /* renamed from: E, reason: collision with root package name */
    public f f4783E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f4784F;

    /* renamed from: G, reason: collision with root package name */
    public A0 f4785G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f4786H;

    /* renamed from: I, reason: collision with root package name */
    public Drawable f4787I;
    public ViewGroup.OnHierarchyChangeListener J;

    /* renamed from: K, reason: collision with root package name */
    public j f4788K;

    /* renamed from: L, reason: collision with root package name */
    public final C0357t f4789L;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f4790n;

    /* renamed from: u, reason: collision with root package name */
    public final S0.i f4791u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f4792v;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList f4793w;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f4794x;

    /* renamed from: y, reason: collision with root package name */
    public final int[] f4795y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f4796z;

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        f4774M = r02 != null ? r02.getName() : null;
        f4777P = new i(0);
        f4775N = new Class[]{Context.class, AttributeSet.class};
        f4776O = new ThreadLocal();
        f4778Q = new d(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C5284R.attr.coordinatorLayoutStyle);
        this.f4790n = new ArrayList();
        this.f4791u = new S0.i(1);
        this.f4792v = new ArrayList();
        this.f4793w = new ArrayList();
        this.f4794x = new int[2];
        this.f4795y = new int[2];
        this.f4789L = new C0357t();
        int[] iArr = a.f4a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, C5284R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, C5284R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f4780B = intArray;
            float f6 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i = 0; i < length; i++) {
                this.f4780B[i] = (int) (r2[i] * f6);
            }
        }
        this.f4787I = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        w();
        super.setOnHierarchyChangeListener(new B.d(this));
        WeakHashMap weakHashMap = X.f2240a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect g() {
        Rect rect = (Rect) f4778Q.a();
        return rect == null ? new Rect() : rect;
    }

    public static void l(int i, Rect rect, Rect rect2, e eVar, int i4, int i9) {
        int i10 = eVar.f45c;
        if (i10 == 0) {
            i10 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, i);
        int i11 = eVar.f46d;
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
            width -= i4 / 2;
        } else if (i12 != 5) {
            width -= i4;
        }
        if (i13 == 16) {
            height -= i9 / 2;
        } else if (i13 != 80) {
            height -= i9;
        }
        rect2.set(width, height, i4 + width, i9 + height);
    }

    public static e n(View view) {
        e eVar = (e) view.getLayoutParams();
        if (!eVar.f44b) {
            c cVar = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                cVar = (c) cls.getAnnotation(c.class);
                if (cVar != null) {
                    break;
                }
            }
            if (cVar != null) {
                try {
                    b bVar = (b) cVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    b bVar2 = eVar.f43a;
                    if (bVar2 != bVar) {
                        if (bVar2 != null) {
                            bVar2.e();
                        }
                        eVar.f43a = bVar;
                        eVar.f44b = true;
                        if (bVar != null) {
                            bVar.c(eVar);
                        }
                    }
                } catch (Exception e6) {
                    Log.e("CoordinatorLayout", "Default behavior class " + cVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e6);
                }
            }
            eVar.f44b = true;
        }
        return eVar;
    }

    public static void u(int i, View view) {
        e eVar = (e) view.getLayoutParams();
        int i4 = eVar.i;
        if (i4 != i) {
            WeakHashMap weakHashMap = X.f2240a;
            view.offsetLeftAndRight(i - i4);
            eVar.i = i;
        }
    }

    public static void v(int i, View view) {
        e eVar = (e) view.getLayoutParams();
        int i4 = eVar.f51j;
        if (i4 != i) {
            WeakHashMap weakHashMap = X.f2240a;
            view.offsetTopAndBottom(i - i4);
            eVar.f51j = i;
        }
    }

    @Override // O.r
    public final void a(int i, View view) {
        C0357t c0357t = this.f4789L;
        if (i == 1) {
            c0357t.f2320b = 0;
        } else {
            c0357t.f2319a = 0;
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            e eVar = (e) childAt.getLayoutParams();
            if (eVar.a(i)) {
                b bVar = eVar.f43a;
                if (bVar != null) {
                    bVar.p(childAt, view, i);
                }
                if (i == 0) {
                    eVar.f54m = false;
                } else if (i == 1) {
                    eVar.f55n = false;
                }
            }
        }
        this.f4782D = null;
    }

    @Override // O.InterfaceC0356s
    public final void b(View view, int i, int i4, int i9, int i10, int i11, int[] iArr) {
        b bVar;
        int childCount = getChildCount();
        int i12 = 0;
        int i13 = 0;
        boolean z8 = false;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(i11) && (bVar = eVar.f43a) != null) {
                    int[] iArr2 = this.f4794x;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    bVar.k(this, childAt, i4, i9, i10, iArr2);
                    i12 = i9 > 0 ? Math.max(i12, iArr2[0]) : Math.min(i12, iArr2[0]);
                    i13 = i10 > 0 ? Math.max(i13, iArr2[1]) : Math.min(i13, iArr2[1]);
                    z8 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i12;
        iArr[1] = iArr[1] + i13;
        if (z8) {
            p(1);
        }
    }

    @Override // O.r
    public final void c(View view, int i, int i4, int i9, int i10, int i11) {
        b(view, i, i4, i9, i10, 0, this.f4795y);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof e) && super.checkLayoutParams(layoutParams);
    }

    @Override // O.r
    public final boolean d(View view, View view2, int i, int i4) {
        int childCount = getChildCount();
        boolean z8 = false;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                b bVar = eVar.f43a;
                if (bVar != null) {
                    boolean o9 = bVar.o(i, i4, childAt);
                    z8 |= o9;
                    if (i4 == 0) {
                        eVar.f54m = o9;
                    } else if (i4 == 1) {
                        eVar.f55n = o9;
                    }
                } else if (i4 == 0) {
                    eVar.f54m = false;
                } else if (i4 == 1) {
                    eVar.f55n = false;
                }
            }
        }
        return z8;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j9) {
        b bVar = ((e) view.getLayoutParams()).f43a;
        if (bVar != null) {
            bVar.getClass();
        }
        return super.drawChild(canvas, view, j9);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f4787I;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // O.r
    public final void e(View view, View view2, int i, int i4) {
        C0357t c0357t = this.f4789L;
        if (i4 == 1) {
            c0357t.f2320b = i;
        } else {
            c0357t.f2319a = i;
        }
        this.f4782D = view2;
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            ((e) getChildAt(i9).getLayoutParams()).getClass();
        }
    }

    @Override // O.r
    public final void f(View view, int i, int i4, int[] iArr, int i9) {
        b bVar;
        int childCount = getChildCount();
        boolean z8 = false;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(i9) && (bVar = eVar.f43a) != null) {
                    int[] iArr2 = this.f4794x;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    bVar.j(this, childAt, view, i, i4, iArr2, i9);
                    i10 = i > 0 ? Math.max(i10, iArr2[0]) : Math.min(i10, iArr2[0]);
                    i11 = i4 > 0 ? Math.max(i11, iArr2[1]) : Math.min(i11, iArr2[1]);
                    z8 = true;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
        if (z8) {
            p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        s();
        return Collections.unmodifiableList(this.f4790n);
    }

    public final A0 getLastWindowInsets() {
        return this.f4785G;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0357t c0357t = this.f4789L;
        return c0357t.f2320b | c0357t.f2319a;
    }

    public Drawable getStatusBarBackground() {
        return this.f4787I;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(e eVar, Rect rect, int i, int i4) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i4) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin));
        rect.set(max, max2, i + max, i4 + max2);
    }

    public final void i(View view, Rect rect, boolean z8) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z8) {
            k(rect, view);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final ArrayList j(View view) {
        k kVar = (k) this.f4791u.f2902v;
        int i = kVar.f40409v;
        ArrayList arrayList = null;
        for (int i4 = 0; i4 < i; i4++) {
            ArrayList arrayList2 = (ArrayList) kVar.l(i4);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(kVar.h(i4));
            }
        }
        ArrayList arrayList3 = this.f4793w;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void k(Rect rect, View view) {
        ThreadLocal threadLocal = B.j.f62a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = B.j.f62a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        B.j.a(this, view, matrix);
        ThreadLocal threadLocal3 = B.j.f63b;
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
        int[] iArr = this.f4780B;
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

    public final boolean o(int i, int i4, View view) {
        d dVar = f4778Q;
        Rect g9 = g();
        k(g9, view);
        try {
            return g9.contains(i, i4);
        } finally {
            g9.setEmpty();
            dVar.c(g9);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t(false);
        if (this.f4784F) {
            if (this.f4783E == null) {
                this.f4783E = new f(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f4783E);
        }
        if (this.f4785G == null) {
            WeakHashMap weakHashMap = X.f2240a;
            if (getFitsSystemWindows()) {
                J.c(this);
            }
        }
        this.f4779A = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t(false);
        if (this.f4784F && this.f4783E != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f4783E);
        }
        View view = this.f4782D;
        if (view != null) {
            a(0, view);
        }
        this.f4779A = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f4786H || this.f4787I == null) {
            return;
        }
        A0 a02 = this.f4785G;
        int d2 = a02 != null ? a02.d() : 0;
        if (d2 > 0) {
            this.f4787I.setBounds(0, 0, getWidth(), d2);
            this.f4787I.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            t(true);
        }
        boolean r9 = r(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return r9;
        }
        t(true);
        return r9;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i, int i4, int i9, int i10) {
        b bVar;
        WeakHashMap weakHashMap = X.f2240a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f4790n;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view = (View) arrayList.get(i11);
            if (view.getVisibility() != 8 && ((bVar = ((e) view.getLayoutParams()).f43a) == null || !bVar.g(this, view, layoutDirection))) {
                q(layoutDirection, view);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i4) {
        boolean z8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        b bVar;
        int i15;
        View view;
        ArrayList arrayList;
        int i16;
        int i17;
        int i18;
        boolean z9;
        int i19;
        int i20;
        int i21;
        int max;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.s();
        int childCount = coordinatorLayout.getChildCount();
        int i22 = 0;
        loop0: while (true) {
            if (i22 >= childCount) {
                z8 = false;
                break;
            }
            View childAt = coordinatorLayout.getChildAt(i22);
            k kVar = (k) coordinatorLayout.f4791u.f2902v;
            int i23 = kVar.f40409v;
            for (int i24 = 0; i24 < i23; i24++) {
                ArrayList arrayList2 = (ArrayList) kVar.l(i24);
                if (arrayList2 != null && arrayList2.contains(childAt)) {
                    z8 = true;
                    break loop0;
                }
            }
            i22++;
        }
        if (z8 != coordinatorLayout.f4784F) {
            if (z8) {
                if (coordinatorLayout.f4779A) {
                    if (coordinatorLayout.f4783E == null) {
                        coordinatorLayout.f4783E = new f(coordinatorLayout);
                    }
                    coordinatorLayout.getViewTreeObserver().addOnPreDrawListener(coordinatorLayout.f4783E);
                }
                coordinatorLayout.f4784F = true;
            } else {
                if (coordinatorLayout.f4779A && coordinatorLayout.f4783E != null) {
                    coordinatorLayout.getViewTreeObserver().removeOnPreDrawListener(coordinatorLayout.f4783E);
                }
                coordinatorLayout.f4784F = false;
            }
        }
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        WeakHashMap weakHashMap = X.f2240a;
        int layoutDirection = coordinatorLayout.getLayoutDirection();
        boolean z10 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i4);
        int size2 = View.MeasureSpec.getSize(i4);
        int i25 = paddingLeft + paddingRight;
        int i26 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z11 = coordinatorLayout.f4785G != null && coordinatorLayout.getFitsSystemWindows();
        ArrayList arrayList3 = coordinatorLayout.f4790n;
        int size3 = arrayList3.size();
        int i27 = 0;
        int i28 = 0;
        while (i27 < size3) {
            View view2 = (View) arrayList3.get(i27);
            int i29 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                arrayList = arrayList3;
                i12 = size3;
                i19 = paddingLeft;
                i17 = paddingRight;
                suggestedMinimumWidth = i29;
                z9 = false;
                i21 = i27;
            } else {
                e eVar = (e) view2.getLayoutParams();
                int i30 = eVar.f47e;
                if (i30 < 0 || mode == 0) {
                    i9 = suggestedMinimumHeight;
                } else {
                    int m8 = coordinatorLayout.m(i30);
                    int i31 = eVar.f45c;
                    if (i31 == 0) {
                        i31 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i31, layoutDirection) & 7;
                    i9 = suggestedMinimumHeight;
                    if ((absoluteGravity == 3 && !z10) || (absoluteGravity == 5 && z10)) {
                        max = Math.max(0, (size - paddingRight) - m8);
                    } else if ((absoluteGravity == 5 && !z10) || (absoluteGravity == 3 && z10)) {
                        max = Math.max(0, m8 - paddingLeft);
                    }
                    int i32 = size3;
                    i11 = max;
                    i10 = i32;
                    if (z11 || view2.getFitsSystemWindows()) {
                        i12 = i10;
                        i13 = i;
                        i14 = i4;
                    } else {
                        i12 = i10;
                        int c4 = coordinatorLayout.f4785G.c() + coordinatorLayout.f4785G.b();
                        int a9 = coordinatorLayout.f4785G.a() + coordinatorLayout.f4785G.d();
                        i13 = View.MeasureSpec.makeMeasureSpec(size - c4, mode);
                        i14 = View.MeasureSpec.makeMeasureSpec(size2 - a9, mode2);
                    }
                    bVar = eVar.f43a;
                    if (bVar == null) {
                        ArrayList arrayList4 = arrayList3;
                        int i33 = i13;
                        arrayList = arrayList4;
                        z9 = false;
                        i17 = paddingRight;
                        i18 = i9;
                        i19 = paddingLeft;
                        i20 = i29;
                        i21 = i27;
                        int i34 = i14;
                        boolean h9 = bVar.h(this, view2, i33, i11, i34);
                        view = view2;
                        i13 = i33;
                        i16 = i11;
                        i15 = i34;
                        if (h9) {
                            coordinatorLayout = this;
                            int max2 = Math.max(i20, view.getMeasuredWidth() + i25 + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
                            int max3 = Math.max(i18, view.getMeasuredHeight() + i26 + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
                            i28 = View.combineMeasuredStates(i28, view.getMeasuredState());
                            suggestedMinimumWidth = max2;
                            suggestedMinimumHeight = max3;
                        }
                    } else {
                        int i35 = i11;
                        i15 = i14;
                        view = view2;
                        arrayList = arrayList3;
                        i16 = i35;
                        i17 = paddingRight;
                        i18 = i9;
                        z9 = false;
                        i19 = paddingLeft;
                        i20 = i29;
                        i21 = i27;
                    }
                    coordinatorLayout = this;
                    coordinatorLayout.measureChildWithMargins(view, i13, i16, i15, 0);
                    int max22 = Math.max(i20, view.getMeasuredWidth() + i25 + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
                    int max32 = Math.max(i18, view.getMeasuredHeight() + i26 + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
                    i28 = View.combineMeasuredStates(i28, view.getMeasuredState());
                    suggestedMinimumWidth = max22;
                    suggestedMinimumHeight = max32;
                }
                i10 = size3;
                i11 = 0;
                if (z11) {
                }
                i12 = i10;
                i13 = i;
                i14 = i4;
                bVar = eVar.f43a;
                if (bVar == null) {
                }
                coordinatorLayout = this;
                coordinatorLayout.measureChildWithMargins(view, i13, i16, i15, 0);
                int max222 = Math.max(i20, view.getMeasuredWidth() + i25 + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
                int max322 = Math.max(i18, view.getMeasuredHeight() + i26 + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
                i28 = View.combineMeasuredStates(i28, view.getMeasuredState());
                suggestedMinimumWidth = max222;
                suggestedMinimumHeight = max322;
            }
            i27 = i21 + 1;
            arrayList3 = arrayList;
            size3 = i12;
            paddingLeft = i19;
            paddingRight = i17;
        }
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i, (-16777216) & i28), View.resolveSizeAndState(suggestedMinimumHeight, i4, i28 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f6, float f9, boolean z8) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(0)) {
                    b bVar = eVar.f43a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f6, float f9) {
        b bVar;
        int childCount = getChildCount();
        boolean z8 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(0) && (bVar = eVar.f43a) != null) {
                    z8 |= bVar.i(view);
                }
            }
        }
        return z8;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i4, int[] iArr) {
        f(view, i, i4, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i4, int i9, int i10) {
        c(view, i, i4, i9, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        e(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.f3318n);
        SparseArray sparseArray = hVar.f60v;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            b bVar = n(childAt).f43a;
            if (id != -1 && bVar != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                bVar.m(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable n9;
        h hVar = new h(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            b bVar = ((e) childAt.getLayoutParams()).f43a;
            if (id != -1 && bVar != null && (n9 = bVar.n(childAt)) != null) {
                sparseArray.append(id, n9);
            }
        }
        hVar.f60v = sparseArray;
        return hVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return d(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        a(0, view);
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
        boolean z8;
        boolean q6;
        MotionEvent motionEvent2;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f4781C == null) {
            z8 = r(motionEvent, 1);
        } else {
            z8 = false;
        }
        b bVar = ((e) this.f4781C.getLayoutParams()).f43a;
        if (bVar != null) {
            q6 = bVar.q(this.f4781C, motionEvent);
            motionEvent2 = null;
            if (this.f4781C != null) {
                q6 |= super.onTouchEvent(motionEvent);
            } else if (z8) {
                long uptimeMillis = SystemClock.uptimeMillis();
                motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEvent2);
            }
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            if (actionMasked == 1 && actionMasked != 3) {
                return q6;
            }
            t(false);
            return q6;
        }
        q6 = false;
        motionEvent2 = null;
        if (this.f4781C != null) {
        }
        if (motionEvent2 != null) {
        }
        if (actionMasked == 1) {
        }
        t(false);
        return q6;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0047 A[EDGE_INSN: B:117:0x0047->B:9:0x0047 BREAK  A[LOOP:2: B:109:0x02ad->B:115:0x02c4], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(int i) {
        Rect rect;
        int i4;
        Rect rect2;
        int i9;
        int i10;
        boolean z8;
        boolean z9;
        int width;
        int i11;
        int i12;
        int i13;
        int height;
        int i14;
        int i15;
        int i16;
        int i17;
        ArrayList arrayList;
        Rect rect3;
        Rect rect4;
        int i18;
        d dVar;
        int i19;
        b bVar;
        WeakHashMap weakHashMap = X.f2240a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList2 = this.f4790n;
        int size = arrayList2.size();
        Rect g9 = g();
        Rect g10 = g();
        Rect g11 = g();
        int i20 = 0;
        while (true) {
            d dVar2 = f4778Q;
            if (i20 >= size) {
                Rect rect5 = g10;
                Rect rect6 = g11;
                g9.setEmpty();
                dVar2.c(g9);
                rect5.setEmpty();
                dVar2.c(rect5);
                rect6.setEmpty();
                dVar2.c(rect6);
                return;
            }
            View view = (View) arrayList2.get(i20);
            e eVar = (e) view.getLayoutParams();
            if (i == 0 && view.getVisibility() == 8) {
                rect = g10;
                rect2 = g11;
                i4 = i20;
                i10 = size;
            } else {
                int i21 = 0;
                while (i21 < i20) {
                    if (eVar.f53l == ((View) arrayList2.get(i21))) {
                        e eVar2 = (e) view.getLayoutParams();
                        if (eVar2.f52k != null) {
                            rect3 = g10;
                            Rect g12 = g();
                            Rect g13 = g();
                            Rect rect7 = g11;
                            Rect g14 = g();
                            i17 = i21;
                            k(g12, eVar2.f52k);
                            i(view, g13, false);
                            i18 = i20;
                            int measuredWidth = view.getMeasuredWidth();
                            d dVar3 = dVar2;
                            int measuredHeight = view.getMeasuredHeight();
                            dVar = dVar3;
                            arrayList = arrayList2;
                            l(layoutDirection, g12, g14, eVar2, measuredWidth, measuredHeight);
                            i19 = size;
                            rect4 = rect7;
                            boolean z10 = (g14.left == g13.left && g14.top == g13.top) ? false : true;
                            h(eVar2, g14, measuredWidth, measuredHeight);
                            int i22 = g14.left - g13.left;
                            int i23 = g14.top - g13.top;
                            if (i22 != 0) {
                                WeakHashMap weakHashMap2 = X.f2240a;
                                view.offsetLeftAndRight(i22);
                            }
                            if (i23 != 0) {
                                WeakHashMap weakHashMap3 = X.f2240a;
                                view.offsetTopAndBottom(i23);
                            }
                            if (z10 && (bVar = eVar2.f43a) != null) {
                                bVar.d(this, view, eVar2.f52k);
                            }
                            g12.setEmpty();
                            dVar.c(g12);
                            g13.setEmpty();
                            dVar.c(g13);
                            g14.setEmpty();
                            dVar.c(g14);
                            dVar2 = dVar;
                            i21 = i17 + 1;
                            g10 = rect3;
                            i20 = i18;
                            arrayList2 = arrayList;
                            size = i19;
                            g11 = rect4;
                        }
                    }
                    i17 = i21;
                    arrayList = arrayList2;
                    rect3 = g10;
                    rect4 = g11;
                    i18 = i20;
                    dVar = dVar2;
                    i19 = size;
                    dVar2 = dVar;
                    i21 = i17 + 1;
                    g10 = rect3;
                    i20 = i18;
                    arrayList2 = arrayList;
                    size = i19;
                    g11 = rect4;
                }
                ArrayList arrayList3 = arrayList2;
                rect = g10;
                Rect rect8 = g11;
                i4 = i20;
                N.c cVar = dVar2;
                int i24 = size;
                i(view, rect, true);
                if (eVar.f49g != 0 && !rect.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(eVar.f49g, layoutDirection);
                    int i25 = absoluteGravity & 112;
                    if (i25 == 48) {
                        g9.top = Math.max(g9.top, rect.bottom);
                    } else if (i25 == 80) {
                        g9.bottom = Math.max(g9.bottom, getHeight() - rect.top);
                    }
                    int i26 = absoluteGravity & 7;
                    if (i26 == 3) {
                        g9.left = Math.max(g9.left, rect.right);
                    } else if (i26 == 5) {
                        g9.right = Math.max(g9.right, getWidth() - rect.left);
                    }
                }
                if (eVar.f50h != 0 && view.getVisibility() == 0) {
                    WeakHashMap weakHashMap4 = X.f2240a;
                    if (view.isLaidOut() && view.getWidth() > 0 && view.getHeight() > 0) {
                        e eVar3 = (e) view.getLayoutParams();
                        b bVar2 = eVar3.f43a;
                        Rect g15 = g();
                        Rect g16 = g();
                        g16.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        if (bVar2 == null || !bVar2.a(view)) {
                            g15.set(g16);
                        } else if (!g16.contains(g15)) {
                            throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + g15.toShortString() + " | Bounds:" + g16.toShortString());
                        }
                        g16.setEmpty();
                        cVar.c(g16);
                        if (!g15.isEmpty()) {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(eVar3.f50h, layoutDirection);
                            if ((absoluteGravity2 & 48) != 48 || (i15 = (g15.top - ((ViewGroup.MarginLayoutParams) eVar3).topMargin) - eVar3.f51j) >= (i16 = g9.top)) {
                                z8 = false;
                            } else {
                                v(i16 - i15, view);
                                z8 = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - g15.bottom) - ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin) + eVar3.f51j) < (i14 = g9.bottom)) {
                                v(height - i14, view);
                                z8 = true;
                            }
                            if (!z8) {
                                v(0, view);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i12 = (g15.left - ((ViewGroup.MarginLayoutParams) eVar3).leftMargin) - eVar3.i) >= (i13 = g9.left)) {
                                z9 = false;
                            } else {
                                u(i13 - i12, view);
                                z9 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - g15.right) - ((ViewGroup.MarginLayoutParams) eVar3).rightMargin) + eVar3.i) < (i11 = g9.right)) {
                                u(width - i11, view);
                                z9 = true;
                            }
                            if (!z9) {
                                u(0, view);
                            }
                            g15.setEmpty();
                            cVar.c(g15);
                            if (i == 2) {
                                rect2 = rect8;
                                rect2.set(((e) view.getLayoutParams()).f56o);
                                if (rect2.equals(rect)) {
                                    arrayList2 = arrayList3;
                                    i10 = i24;
                                } else {
                                    ((e) view.getLayoutParams()).f56o.set(rect);
                                }
                            } else {
                                rect2 = rect8;
                            }
                            i9 = i4 + 1;
                            i10 = i24;
                            while (true) {
                                arrayList2 = arrayList3;
                                if (i9 < i10) {
                                    break;
                                }
                                View view2 = (View) arrayList2.get(i9);
                                b bVar3 = ((e) view2.getLayoutParams()).f43a;
                                if (bVar3 != null) {
                                    bVar3.b(view2);
                                }
                                i9++;
                                arrayList3 = arrayList2;
                            }
                        } else {
                            g15.setEmpty();
                            cVar.c(g15);
                        }
                    }
                }
                if (i == 2) {
                }
                i9 = i4 + 1;
                i10 = i24;
                while (true) {
                    arrayList2 = arrayList3;
                    if (i9 < i10) {
                    }
                    i9++;
                    arrayList3 = arrayList2;
                }
            }
            i20 = i4 + 1;
            size = i10;
            g11 = rect2;
            g10 = rect;
        }
    }

    public final void q(int i, View view) {
        Rect g9;
        Rect g10;
        e eVar = (e) view.getLayoutParams();
        View view2 = eVar.f52k;
        if (view2 == null && eVar.f48f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        d dVar = f4778Q;
        if (view2 != null) {
            g9 = g();
            g10 = g();
            try {
                k(g9, view2);
                e eVar2 = (e) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                l(i, g9, g10, eVar2, measuredWidth, measuredHeight);
                h(eVar2, g10, measuredWidth, measuredHeight);
                view.layout(g10.left, g10.top, g10.right, g10.bottom);
                return;
            } finally {
                g9.setEmpty();
                dVar.c(g9);
                g10.setEmpty();
                dVar.c(g10);
            }
        }
        int i4 = eVar.f47e;
        if (i4 < 0) {
            e eVar3 = (e) view.getLayoutParams();
            g9 = g();
            g9.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) eVar3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin);
            if (this.f4785G != null) {
                WeakHashMap weakHashMap = X.f2240a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    g9.left = this.f4785G.b() + g9.left;
                    g9.top = this.f4785G.d() + g9.top;
                    g9.right -= this.f4785G.c();
                    g9.bottom -= this.f4785G.a();
                }
            }
            g10 = g();
            int i9 = eVar3.f45c;
            if ((i9 & 7) == 0) {
                i9 |= 8388611;
            }
            if ((i9 & 112) == 0) {
                i9 |= 48;
            }
            Gravity.apply(i9, view.getMeasuredWidth(), view.getMeasuredHeight(), g9, g10, i);
            view.layout(g10.left, g10.top, g10.right, g10.bottom);
            return;
        }
        e eVar4 = (e) view.getLayoutParams();
        int i10 = eVar4.f45c;
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
            i4 = width - i4;
        }
        int m8 = m(i4) - measuredWidth2;
        if (i11 == 1) {
            m8 += measuredWidth2 / 2;
        } else if (i11 == 5) {
            m8 += measuredWidth2;
        }
        int i13 = i12 != 16 ? i12 != 80 ? 0 : measuredHeight2 : measuredHeight2 / 2;
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar4).leftMargin, Math.min(m8, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) eVar4).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar4).topMargin, Math.min(i13, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) eVar4).bottomMargin));
        view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
    }

    public final boolean r(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f4792v;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            arrayList.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i4) : i4));
        }
        i iVar = f4777P;
        if (iVar != null) {
            Collections.sort(arrayList, iVar);
        }
        int size = arrayList.size();
        MotionEvent motionEvent2 = null;
        boolean z8 = false;
        for (int i9 = 0; i9 < size; i9++) {
            View view = (View) arrayList.get(i9);
            b bVar = ((e) view.getLayoutParams()).f43a;
            if (z8 && actionMasked != 0) {
                if (bVar != null) {
                    if (motionEvent2 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i == 0) {
                        bVar.f(this, view, motionEvent2);
                    } else if (i == 1) {
                        bVar.q(view, motionEvent2);
                    }
                }
            } else if (!z8 && bVar != null) {
                if (i == 0) {
                    z8 = bVar.f(this, view, motionEvent);
                } else if (i == 1) {
                    z8 = bVar.q(view, motionEvent);
                }
                if (z8) {
                    this.f4781C = view;
                }
            }
        }
        arrayList.clear();
        return z8;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z8) {
        b bVar = ((e) view.getLayoutParams()).f43a;
        if (bVar != null) {
            bVar.l(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z8);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z8) {
        super.requestDisallowInterceptTouchEvent(z8);
        if (!z8 || this.f4796z) {
            return;
        }
        t(false);
        this.f4796z = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0144, code lost:
    
        throw new java.lang.IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s() {
        N.c cVar;
        ArrayList arrayList = this.f4790n;
        arrayList.clear();
        S0.i iVar = this.f4791u;
        k kVar = (k) iVar.f2902v;
        int i = kVar.f40409v;
        int i4 = 0;
        while (true) {
            cVar = (N.c) iVar.f2901u;
            if (i4 >= i) {
                break;
            }
            ArrayList arrayList2 = (ArrayList) kVar.l(i4);
            if (arrayList2 != null) {
                arrayList2.clear();
                cVar.c(arrayList2);
            }
            i4++;
        }
        kVar.clear();
        int childCount = getChildCount();
        int i9 = 0;
        loop1: while (true) {
            k kVar2 = (k) iVar.f2902v;
            if (i9 >= childCount) {
                ArrayList arrayList3 = (ArrayList) iVar.f2903w;
                arrayList3.clear();
                HashSet hashSet = (HashSet) iVar.f2904x;
                hashSet.clear();
                int i10 = kVar2.f40409v;
                for (int i11 = 0; i11 < i10; i11++) {
                    iVar.e(kVar2.h(i11), arrayList3, hashSet);
                }
                arrayList.addAll(arrayList3);
                Collections.reverse(arrayList);
                return;
            }
            View childAt = getChildAt(i9);
            e n9 = n(childAt);
            int i12 = n9.f48f;
            if (i12 == -1) {
                n9.f53l = null;
                n9.f52k = null;
            } else {
                View view = n9.f52k;
                if (view != null && view.getId() == i12) {
                    View view2 = n9.f52k;
                    for (ViewParent parent = view2.getParent(); parent != this; parent = parent.getParent()) {
                        if (parent == null || parent == childAt) {
                            n9.f53l = null;
                            n9.f52k = null;
                        } else {
                            if (parent instanceof View) {
                                view2 = parent;
                            }
                        }
                    }
                    n9.f53l = view2;
                }
                View findViewById = findViewById(i12);
                n9.f52k = findViewById;
                if (findViewById == null) {
                    if (!isInEditMode()) {
                        throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + getResources().getResourceName(i12) + " to anchor view " + childAt);
                    }
                    n9.f53l = null;
                    n9.f52k = null;
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
                            n9.f53l = null;
                            n9.f52k = null;
                        }
                    }
                    n9.f53l = findViewById;
                } else {
                    if (!isInEditMode()) {
                        throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                    }
                    n9.f53l = null;
                    n9.f52k = null;
                }
            }
            if (!kVar2.containsKey(childAt)) {
                kVar2.put(childAt, null);
            }
            for (int i13 = 0; i13 < childCount; i13++) {
                if (i13 != i9) {
                    View childAt2 = getChildAt(i13);
                    if (childAt2 != n9.f53l) {
                        WeakHashMap weakHashMap = X.f2240a;
                        int layoutDirection = getLayoutDirection();
                        int absoluteGravity = Gravity.getAbsoluteGravity(((e) childAt2.getLayoutParams()).f49g, layoutDirection);
                        if (absoluteGravity == 0 || (Gravity.getAbsoluteGravity(n9.f50h, layoutDirection) & absoluteGravity) != absoluteGravity) {
                            b bVar = n9.f43a;
                            if (bVar != null) {
                                bVar.b(childAt);
                            }
                        }
                    }
                    if (!kVar2.containsKey(childAt2) && !kVar2.containsKey(childAt2)) {
                        kVar2.put(childAt2, null);
                    }
                    if (!kVar2.containsKey(childAt2) || !kVar2.containsKey(childAt)) {
                        break loop1;
                    }
                    ArrayList arrayList4 = (ArrayList) kVar2.getOrDefault(childAt2, null);
                    if (arrayList4 == null) {
                        arrayList4 = (ArrayList) cVar.a();
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        kVar2.put(childAt2, arrayList4);
                    }
                    arrayList4.add(childAt);
                }
            }
            i9++;
        }
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z8) {
        super.setFitsSystemWindows(z8);
        w();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.J = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f4787I;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f4787I = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f4787I.setState(getDrawableState());
                }
                Drawable drawable3 = this.f4787I;
                WeakHashMap weakHashMap = X.f2240a;
                H.b.b(drawable3, getLayoutDirection());
                this.f4787I.setVisible(getVisibility() == 0, false);
                this.f4787I.setCallback(this);
            }
            WeakHashMap weakHashMap2 = X.f2240a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? E.a.b(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z8 = i == 0;
        Drawable drawable = this.f4787I;
        if (drawable == null || drawable.isVisible() == z8) {
            return;
        }
        this.f4787I.setVisible(z8, false);
    }

    public final void t(boolean z8) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            b bVar = ((e) childAt.getLayoutParams()).f43a;
            if (bVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z8) {
                    bVar.f(this, childAt, obtain);
                } else {
                    bVar.q(childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            ((e) getChildAt(i4).getLayoutParams()).getClass();
        }
        this.f4781C = null;
        this.f4796z = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f4787I;
    }

    public final void w() {
        WeakHashMap weakHashMap = X.f2240a;
        if (!getFitsSystemWindows()) {
            L.u(this, null);
            return;
        }
        if (this.f4788K == null) {
            this.f4788K = new j(1, this);
        }
        L.u(this, this.f4788K);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }
}
