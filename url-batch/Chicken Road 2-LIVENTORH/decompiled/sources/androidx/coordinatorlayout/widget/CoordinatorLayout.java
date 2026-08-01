package androidx.coordinatorlayout.widget;

import a0.a;
import a0.b;
import a0.d;
import a0.e;
import a0.f;
import a0.h;
import a0.i;
import a0.j;
import a0.k;
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
import com.oriondriftchasers.arordrft.R;
import f1.h0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.WeakHashMap;
import m0.c;
import n0.b0;
import n0.d0;
import n0.l;
import n0.l0;
import n0.m;
import n0.q1;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements l, m {
    public static final ThreadLocal A;
    public static final i B;
    public static final c C;

    /* renamed from: y, reason: collision with root package name */
    public static final String f257y;

    /* renamed from: z, reason: collision with root package name */
    public static final Class[] f258z;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f259f;

    /* renamed from: g, reason: collision with root package name */
    public final j f260g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f261h;
    public final ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f262j;

    /* renamed from: k, reason: collision with root package name */
    public final int[] f263k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f264l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f265m;

    /* renamed from: n, reason: collision with root package name */
    public final int[] f266n;

    /* renamed from: o, reason: collision with root package name */
    public View f267o;

    /* renamed from: p, reason: collision with root package name */
    public View f268p;

    /* renamed from: q, reason: collision with root package name */
    public f f269q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f270r;

    /* renamed from: s, reason: collision with root package name */
    public q1 f271s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f272t;

    /* renamed from: u, reason: collision with root package name */
    public Drawable f273u;

    /* renamed from: v, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f274v;

    /* renamed from: w, reason: collision with root package name */
    public a f275w;

    /* renamed from: x, reason: collision with root package name */
    public final h0 f276x;

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        f257y = r02 != null ? r02.getName() : null;
        B = new i(0);
        f258z = new Class[]{Context.class, AttributeSet.class};
        A = new ThreadLocal();
        C = new c(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f259f = new ArrayList();
        this.f260g = new j(0);
        this.f261h = new ArrayList();
        this.i = new ArrayList();
        this.f262j = new int[2];
        this.f263k = new int[2];
        this.f276x = new h0();
        int[] iArr = z.a.f3846a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f266n = intArray;
            float f2 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i = 0; i < length; i++) {
                this.f266n[i] = (int) (r1[i] * f2);
            }
        }
        this.f273u = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        w();
        super.setOnHierarchyChangeListener(new d(this));
        WeakHashMap weakHashMap = l0.f2757a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect g() {
        Rect rect = (Rect) C.a();
        return rect == null ? new Rect() : rect;
    }

    public static void l(int i, Rect rect, Rect rect2, e eVar, int i4, int i5) {
        int i6 = eVar.f85c;
        if (i6 == 0) {
            i6 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i6, i);
        int i7 = eVar.d;
        if ((i7 & 7) == 0) {
            i7 |= 8388611;
        }
        if ((i7 & 112) == 0) {
            i7 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i7, i);
        int i8 = absoluteGravity & 7;
        int i9 = absoluteGravity & 112;
        int i10 = absoluteGravity2 & 7;
        int i11 = absoluteGravity2 & 112;
        int width = i10 != 1 ? i10 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i11 != 16 ? i11 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i8 == 1) {
            width -= i4 / 2;
        } else if (i8 != 5) {
            width -= i4;
        }
        if (i9 == 16) {
            height -= i5 / 2;
        } else if (i9 != 80) {
            height -= i5;
        }
        rect2.set(width, height, i4 + width, i5 + height);
    }

    public static e n(View view) {
        e eVar = (e) view.getLayoutParams();
        if (!eVar.f84b) {
            a0.c cVar = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                cVar = (a0.c) cls.getAnnotation(a0.c.class);
                if (cVar != null) {
                    break;
                }
            }
            if (cVar != null) {
                try {
                    b bVar = (b) cVar.value().getDeclaredConstructor(null).newInstance(null);
                    b bVar2 = eVar.f83a;
                    if (bVar2 != bVar) {
                        if (bVar2 != null) {
                            bVar2.e();
                        }
                        eVar.f83a = bVar;
                        eVar.f84b = true;
                        if (bVar != null) {
                            bVar.c(eVar);
                        }
                    }
                } catch (Exception e4) {
                    Log.e("CoordinatorLayout", "Default behavior class " + cVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e4);
                }
            }
            eVar.f84b = true;
        }
        return eVar;
    }

    public static void u(View view, int i) {
        e eVar = (e) view.getLayoutParams();
        int i4 = eVar.i;
        if (i4 != i) {
            WeakHashMap weakHashMap = l0.f2757a;
            view.offsetLeftAndRight(i - i4);
            eVar.i = i;
        }
    }

    public static void v(View view, int i) {
        e eVar = (e) view.getLayoutParams();
        int i4 = eVar.f90j;
        if (i4 != i) {
            WeakHashMap weakHashMap = l0.f2757a;
            view.offsetTopAndBottom(i - i4);
            eVar.f90j = i;
        }
    }

    @Override // n0.l
    public final void a(View view, View view2, int i, int i4) {
        h0 h0Var = this.f276x;
        if (i4 == 1) {
            h0Var.f1365b = i;
        } else {
            h0Var.f1364a = i;
        }
        this.f268p = view2;
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            ((e) getChildAt(i5).getLayoutParams()).getClass();
        }
    }

    @Override // n0.l
    public final void b(View view, int i) {
        h0 h0Var = this.f276x;
        if (i == 1) {
            h0Var.f1365b = 0;
        } else {
            h0Var.f1364a = 0;
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            e eVar = (e) childAt.getLayoutParams();
            if (eVar.a(i)) {
                b bVar = eVar.f83a;
                if (bVar != null) {
                    bVar.p(childAt, view, i);
                }
                if (i == 0) {
                    eVar.f93m = false;
                } else if (i == 1) {
                    eVar.f94n = false;
                }
            }
        }
        this.f268p = null;
    }

    @Override // n0.l
    public final void c(View view, int i, int i4, int[] iArr, int i5) {
        b bVar;
        int childCount = getChildCount();
        boolean z3 = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(i5) && (bVar = eVar.f83a) != null) {
                    int[] iArr2 = this.f262j;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    bVar.j(this, childAt, view, i, i4, iArr2, i5);
                    i6 = i > 0 ? Math.max(i6, iArr2[0]) : Math.min(i6, iArr2[0]);
                    i7 = i4 > 0 ? Math.max(i7, iArr2[1]) : Math.min(i7, iArr2[1]);
                    z3 = true;
                }
            }
        }
        iArr[0] = i6;
        iArr[1] = i7;
        if (z3) {
            p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof e) && super.checkLayoutParams(layoutParams);
    }

    @Override // n0.m
    public final void d(View view, int i, int i4, int i5, int i6, int i7, int[] iArr) {
        b bVar;
        int childCount = getChildCount();
        int i8 = 0;
        int i9 = 0;
        boolean z3 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(i7) && (bVar = eVar.f83a) != null) {
                    int[] iArr2 = this.f262j;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    bVar.k(this, childAt, i4, i5, i6, iArr2);
                    i8 = i5 > 0 ? Math.max(i8, iArr2[0]) : Math.min(i8, iArr2[0]);
                    i9 = i6 > 0 ? Math.max(i9, iArr2[1]) : Math.min(i9, iArr2[1]);
                    z3 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i8;
        iArr[1] = iArr[1] + i9;
        if (z3) {
            p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j4) {
        b bVar = ((e) view.getLayoutParams()).f83a;
        if (bVar != null) {
            bVar.getClass();
        }
        return super.drawChild(canvas, view, j4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f273u;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // n0.l
    public final void e(View view, int i, int i4, int i5, int i6, int i7) {
        d(view, i, i4, i5, i6, 0, this.f263k);
    }

    @Override // n0.l
    public final boolean f(View view, View view2, int i, int i4) {
        int childCount = getChildCount();
        boolean z3 = false;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                b bVar = eVar.f83a;
                if (bVar != null) {
                    boolean o4 = bVar.o(childAt, i, i4);
                    z3 |= o4;
                    if (i4 == 0) {
                        eVar.f93m = o4;
                    } else if (i4 == 1) {
                        eVar.f94n = o4;
                    }
                } else if (i4 == 0) {
                    eVar.f93m = false;
                } else if (i4 == 1) {
                    eVar.f94n = false;
                }
            }
        }
        return z3;
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
        return Collections.unmodifiableList(this.f259f);
    }

    public final q1 getLastWindowInsets() {
        return this.f271s;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        h0 h0Var = this.f276x;
        return h0Var.f1365b | h0Var.f1364a;
    }

    public Drawable getStatusBarBackground() {
        return this.f273u;
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
        q.j jVar = (q.j) this.f260g.f101g;
        int i = jVar.f3036h;
        ArrayList arrayList = null;
        for (int i4 = 0; i4 < i; i4++) {
            ArrayList arrayList2 = (ArrayList) jVar.i(i4);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(jVar.f(i4));
            }
        }
        ArrayList arrayList3 = this.i;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void k(View view, Rect rect) {
        ThreadLocal threadLocal = k.f103a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = k.f103a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        k.a(this, view, matrix);
        ThreadLocal threadLocal3 = k.f104b;
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
        int[] iArr = this.f266n;
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

    public final boolean o(View view, int i, int i4) {
        c cVar = C;
        Rect g4 = g();
        k(view, g4);
        try {
            return g4.contains(i, i4);
        } finally {
            g4.setEmpty();
            cVar.c(g4);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t(false);
        if (this.f270r) {
            if (this.f269q == null) {
                this.f269q = new f(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f269q);
        }
        if (this.f271s == null) {
            WeakHashMap weakHashMap = l0.f2757a;
            if (getFitsSystemWindows()) {
                b0.c(this);
            }
        }
        this.f265m = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t(false);
        if (this.f270r && this.f269q != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f269q);
        }
        View view = this.f268p;
        if (view != null) {
            b(view, 0);
        }
        this.f265m = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f272t || this.f273u == null) {
            return;
        }
        q1 q1Var = this.f271s;
        int d = q1Var != null ? q1Var.d() : 0;
        if (d > 0) {
            this.f273u.setBounds(0, 0, getWidth(), d);
            this.f273u.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            t(true);
        }
        boolean r3 = r(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return r3;
        }
        t(true);
        return r3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i4, int i5, int i6) {
        b bVar;
        WeakHashMap weakHashMap = l0.f2757a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f259f;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            View view = (View) arrayList.get(i7);
            if (view.getVisibility() != 8 && ((bVar = ((e) view.getLayoutParams()).f83a) == null || !bVar.g(this, view, layoutDirection))) {
                q(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x018b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i4) {
        boolean z3;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        b bVar;
        int i11;
        int i12;
        boolean z4;
        int i13;
        int i14;
        ArrayList arrayList;
        int i15;
        int i16;
        View view;
        int i17;
        int max;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.s();
        int childCount = coordinatorLayout.getChildCount();
        int i18 = 0;
        loop0: while (true) {
            if (i18 >= childCount) {
                z3 = false;
                break;
            }
            View childAt = coordinatorLayout.getChildAt(i18);
            q.j jVar = (q.j) coordinatorLayout.f260g.f101g;
            int i19 = jVar.f3036h;
            for (int i20 = 0; i20 < i19; i20++) {
                ArrayList arrayList2 = (ArrayList) jVar.i(i20);
                if (arrayList2 != null && arrayList2.contains(childAt)) {
                    z3 = true;
                    break loop0;
                }
            }
            i18++;
        }
        if (z3 != coordinatorLayout.f270r) {
            if (z3) {
                if (coordinatorLayout.f265m) {
                    if (coordinatorLayout.f269q == null) {
                        coordinatorLayout.f269q = new f(coordinatorLayout);
                    }
                    coordinatorLayout.getViewTreeObserver().addOnPreDrawListener(coordinatorLayout.f269q);
                }
                coordinatorLayout.f270r = true;
            } else {
                if (coordinatorLayout.f265m && coordinatorLayout.f269q != null) {
                    coordinatorLayout.getViewTreeObserver().removeOnPreDrawListener(coordinatorLayout.f269q);
                }
                coordinatorLayout.f270r = false;
            }
        }
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        WeakHashMap weakHashMap = l0.f2757a;
        int layoutDirection = coordinatorLayout.getLayoutDirection();
        boolean z5 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i4);
        int size2 = View.MeasureSpec.getSize(i4);
        int i21 = paddingLeft + paddingRight;
        int i22 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z6 = coordinatorLayout.f271s != null && coordinatorLayout.getFitsSystemWindows();
        ArrayList arrayList3 = coordinatorLayout.f259f;
        int size3 = arrayList3.size();
        int i23 = 0;
        int i24 = 0;
        while (i23 < size3) {
            View view2 = (View) arrayList3.get(i23);
            int i25 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                arrayList = arrayList3;
                i8 = size3;
                i17 = i23;
                i11 = paddingLeft;
                suggestedMinimumWidth = i25;
                z4 = false;
                i13 = paddingRight;
            } else {
                e eVar = (e) view2.getLayoutParams();
                int i26 = eVar.f86e;
                if (i26 < 0 || mode == 0) {
                    i5 = suggestedMinimumHeight;
                } else {
                    int m4 = coordinatorLayout.m(i26);
                    int i27 = eVar.f85c;
                    if (i27 == 0) {
                        i27 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i27, layoutDirection) & 7;
                    i5 = suggestedMinimumHeight;
                    if ((absoluteGravity == 3 && !z5) || (absoluteGravity == 5 && z5)) {
                        max = Math.max(0, (size - paddingRight) - m4);
                    } else if ((absoluteGravity == 5 && !z5) || (absoluteGravity == 3 && z5)) {
                        max = Math.max(0, m4 - paddingLeft);
                    }
                    int i28 = size3;
                    i7 = max;
                    i6 = i28;
                    if (z6 || view2.getFitsSystemWindows()) {
                        i8 = i6;
                        i9 = i;
                        i10 = i4;
                    } else {
                        i8 = i6;
                        int c4 = coordinatorLayout.f271s.c() + coordinatorLayout.f271s.b();
                        int a2 = coordinatorLayout.f271s.a() + coordinatorLayout.f271s.d();
                        i9 = View.MeasureSpec.makeMeasureSpec(size - c4, mode);
                        i10 = View.MeasureSpec.makeMeasureSpec(size2 - a2, mode2);
                    }
                    bVar = eVar.f83a;
                    if (bVar == null) {
                        z4 = false;
                        i11 = paddingLeft;
                        i12 = i25;
                        i13 = paddingRight;
                        i14 = i5;
                        arrayList = arrayList3;
                        int i29 = i9;
                        i17 = i23;
                        int i30 = i10;
                        boolean h4 = bVar.h(this, view2, i29, i7, i30);
                        view = view2;
                        i9 = i29;
                        i15 = i7;
                        i16 = i30;
                        if (h4) {
                            coordinatorLayout = this;
                            int max2 = Math.max(i12, view.getMeasuredWidth() + i21 + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
                            int max3 = Math.max(i14, view.getMeasuredHeight() + i22 + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
                            i24 = View.combineMeasuredStates(i24, view.getMeasuredState());
                            suggestedMinimumWidth = max2;
                            suggestedMinimumHeight = max3;
                        }
                    } else {
                        i11 = paddingLeft;
                        i12 = i25;
                        z4 = false;
                        i13 = paddingRight;
                        i14 = i5;
                        arrayList = arrayList3;
                        i15 = i7;
                        i16 = i10;
                        view = view2;
                        i17 = i23;
                    }
                    coordinatorLayout = this;
                    coordinatorLayout.measureChildWithMargins(view, i9, i15, i16, 0);
                    int max22 = Math.max(i12, view.getMeasuredWidth() + i21 + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
                    int max32 = Math.max(i14, view.getMeasuredHeight() + i22 + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
                    i24 = View.combineMeasuredStates(i24, view.getMeasuredState());
                    suggestedMinimumWidth = max22;
                    suggestedMinimumHeight = max32;
                }
                i6 = size3;
                i7 = 0;
                if (z6) {
                }
                i8 = i6;
                i9 = i;
                i10 = i4;
                bVar = eVar.f83a;
                if (bVar == null) {
                }
                coordinatorLayout = this;
                coordinatorLayout.measureChildWithMargins(view, i9, i15, i16, 0);
                int max222 = Math.max(i12, view.getMeasuredWidth() + i21 + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
                int max322 = Math.max(i14, view.getMeasuredHeight() + i22 + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
                i24 = View.combineMeasuredStates(i24, view.getMeasuredState());
                suggestedMinimumWidth = max222;
                suggestedMinimumHeight = max322;
            }
            i23 = i17 + 1;
            paddingLeft = i11;
            paddingRight = i13;
            size3 = i8;
            arrayList3 = arrayList;
        }
        int i31 = i24;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i, (-16777216) & i31), View.resolveSizeAndState(suggestedMinimumHeight, i4, i31 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f4, boolean z3) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(0)) {
                    b bVar = eVar.f83a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f4) {
        b bVar;
        int childCount = getChildCount();
        boolean z3 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(0) && (bVar = eVar.f83a) != null) {
                    z3 |= bVar.i(view);
                }
            }
        }
        return z3;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i4, int[] iArr) {
        c(view, i, i4, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i4, int i5, int i6) {
        e(view, i, i4, i5, i6, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        a(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.f3175f);
        SparseArray sparseArray = hVar.f98h;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            b bVar = n(childAt).f83a;
            if (id != -1 && bVar != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                bVar.m(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable n4;
        h hVar = new h(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            b bVar = ((e) childAt.getLayoutParams()).f83a;
            if (id != -1 && bVar != null && (n4 = bVar.n(childAt)) != null) {
                sparseArray.append(id, n4);
            }
        }
        hVar.f98h = sparseArray;
        return hVar;
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
        boolean q3;
        MotionEvent motionEvent2;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f267o == null) {
            z3 = r(motionEvent, 1);
        } else {
            z3 = false;
        }
        b bVar = ((e) this.f267o.getLayoutParams()).f83a;
        if (bVar != null) {
            q3 = bVar.q(this.f267o, motionEvent);
            motionEvent2 = null;
            if (this.f267o != null) {
                q3 |= super.onTouchEvent(motionEvent);
            } else if (z3) {
                long uptimeMillis = SystemClock.uptimeMillis();
                motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEvent2);
            }
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            if (actionMasked == 1 && actionMasked != 3) {
                return q3;
            }
            t(false);
            return q3;
        }
        q3 = false;
        motionEvent2 = null;
        if (this.f267o != null) {
        }
        if (motionEvent2 != null) {
        }
        if (actionMasked == 1) {
        }
        t(false);
        return q3;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0270  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(int i) {
        int i4;
        Rect rect;
        int i5;
        int i6;
        ArrayList arrayList;
        boolean z3;
        boolean z4;
        int width;
        int i7;
        int i8;
        int i9;
        int height;
        int i10;
        int i11;
        int i12;
        ArrayList arrayList2;
        e eVar;
        int i13;
        int i14;
        Rect rect2;
        int i15;
        View view;
        b bVar;
        WeakHashMap weakHashMap = l0.f2757a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList3 = this.f259f;
        int size = arrayList3.size();
        Rect g4 = g();
        Rect g5 = g();
        Rect g6 = g();
        int i16 = 0;
        while (true) {
            c cVar = C;
            if (i16 >= size) {
                Rect rect3 = g6;
                g4.setEmpty();
                cVar.c(g4);
                g5.setEmpty();
                cVar.c(g5);
                rect3.setEmpty();
                cVar.c(rect3);
                return;
            }
            View view2 = (View) arrayList3.get(i16);
            e eVar2 = (e) view2.getLayoutParams();
            if (i == 0 && view2.getVisibility() == 8) {
                arrayList = arrayList3;
                i6 = size;
                rect = g6;
                i4 = i16;
            } else {
                int i17 = 0;
                while (i17 < i16) {
                    if (eVar2.f92l == ((View) arrayList3.get(i17))) {
                        e eVar3 = (e) view2.getLayoutParams();
                        if (eVar3.f91k != null) {
                            Rect g7 = g();
                            Rect g8 = g();
                            e eVar4 = eVar2;
                            Rect g9 = g();
                            k(eVar3.f91k, g7);
                            i(view2, g8, false);
                            int measuredWidth = view2.getMeasuredWidth();
                            View view3 = view2;
                            int measuredHeight = view3.getMeasuredHeight();
                            arrayList2 = arrayList3;
                            eVar = eVar4;
                            i13 = i17;
                            layoutDirection = layoutDirection;
                            i15 = i16;
                            view = view3;
                            l(layoutDirection, g7, g9, eVar3, measuredWidth, measuredHeight);
                            i14 = size;
                            rect2 = g6;
                            boolean z5 = (g9.left == g8.left && g9.top == g8.top) ? false : true;
                            h(eVar3, g9, measuredWidth, measuredHeight);
                            int i18 = g9.left - g8.left;
                            int i19 = g9.top - g8.top;
                            if (i18 != 0) {
                                WeakHashMap weakHashMap2 = l0.f2757a;
                                view.offsetLeftAndRight(i18);
                            }
                            if (i19 != 0) {
                                WeakHashMap weakHashMap3 = l0.f2757a;
                                view.offsetTopAndBottom(i19);
                            }
                            if (z5 && (bVar = eVar3.f83a) != null) {
                                bVar.d(this, view, eVar3.f91k);
                            }
                            g7.setEmpty();
                            cVar.c(g7);
                            g8.setEmpty();
                            cVar.c(g8);
                            g9.setEmpty();
                            cVar.c(g9);
                            i17 = i13 + 1;
                            eVar2 = eVar;
                            view2 = view;
                            arrayList3 = arrayList2;
                            size = i14;
                            i16 = i15;
                            g6 = rect2;
                        }
                    }
                    arrayList2 = arrayList3;
                    eVar = eVar2;
                    i13 = i17;
                    i14 = size;
                    rect2 = g6;
                    i15 = i16;
                    view = view2;
                    i17 = i13 + 1;
                    eVar2 = eVar;
                    view2 = view;
                    arrayList3 = arrayList2;
                    size = i14;
                    i16 = i15;
                    g6 = rect2;
                }
                ArrayList arrayList4 = arrayList3;
                e eVar5 = eVar2;
                int i20 = size;
                Rect rect4 = g6;
                i4 = i16;
                View view4 = view2;
                i(view4, g5, true);
                if (eVar5.f88g != 0 && !g5.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(eVar5.f88g, layoutDirection);
                    int i21 = absoluteGravity & 112;
                    if (i21 == 48) {
                        g4.top = Math.max(g4.top, g5.bottom);
                    } else if (i21 == 80) {
                        g4.bottom = Math.max(g4.bottom, getHeight() - g5.top);
                    }
                    int i22 = absoluteGravity & 7;
                    if (i22 == 3) {
                        g4.left = Math.max(g4.left, g5.right);
                    } else if (i22 == 5) {
                        g4.right = Math.max(g4.right, getWidth() - g5.left);
                    }
                }
                if (eVar5.f89h != 0 && view4.getVisibility() == 0) {
                    WeakHashMap weakHashMap4 = l0.f2757a;
                    if (view4.isLaidOut() && view4.getWidth() > 0 && view4.getHeight() > 0) {
                        e eVar6 = (e) view4.getLayoutParams();
                        b bVar2 = eVar6.f83a;
                        Rect g10 = g();
                        Rect g11 = g();
                        g11.set(view4.getLeft(), view4.getTop(), view4.getRight(), view4.getBottom());
                        if (bVar2 == null || !bVar2.a(view4)) {
                            g10.set(g11);
                        } else if (!g11.contains(g10)) {
                            throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + g10.toShortString() + " | Bounds:" + g11.toShortString());
                        }
                        g11.setEmpty();
                        cVar.c(g11);
                        if (g10.isEmpty()) {
                            g10.setEmpty();
                            cVar.c(g10);
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(eVar6.f89h, layoutDirection);
                            if ((absoluteGravity2 & 48) != 48 || (i11 = (g10.top - ((ViewGroup.MarginLayoutParams) eVar6).topMargin) - eVar6.f90j) >= (i12 = g4.top)) {
                                z3 = false;
                            } else {
                                v(view4, i12 - i11);
                                z3 = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - g10.bottom) - ((ViewGroup.MarginLayoutParams) eVar6).bottomMargin) + eVar6.f90j) < (i10 = g4.bottom)) {
                                v(view4, height - i10);
                                z3 = true;
                            }
                            if (!z3) {
                                v(view4, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i8 = (g10.left - ((ViewGroup.MarginLayoutParams) eVar6).leftMargin) - eVar6.i) >= (i9 = g4.left)) {
                                z4 = false;
                            } else {
                                u(view4, i9 - i8);
                                z4 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - g10.right) - ((ViewGroup.MarginLayoutParams) eVar6).rightMargin) + eVar6.i) < (i7 = g4.right)) {
                                u(view4, width - i7);
                                z4 = true;
                            }
                            if (!z4) {
                                u(view4, 0);
                            }
                            g10.setEmpty();
                            cVar.c(g10);
                            if (i == 2) {
                                rect = rect4;
                                rect.set(((e) view4.getLayoutParams()).f95o);
                                if (rect.equals(g5)) {
                                    arrayList = arrayList4;
                                    i6 = i20;
                                } else {
                                    ((e) view4.getLayoutParams()).f95o.set(g5);
                                }
                            } else {
                                rect = rect4;
                            }
                            i5 = i4 + 1;
                            i6 = i20;
                            while (true) {
                                arrayList = arrayList4;
                                if (i5 >= i6) {
                                    View view5 = (View) arrayList.get(i5);
                                    b bVar3 = ((e) view5.getLayoutParams()).f83a;
                                    if (bVar3 != null) {
                                        bVar3.b(view5);
                                    }
                                    i5++;
                                    arrayList4 = arrayList;
                                }
                            }
                        }
                    }
                }
                if (i == 2) {
                }
                i5 = i4 + 1;
                i6 = i20;
                while (true) {
                    arrayList = arrayList4;
                    if (i5 >= i6) {
                        break;
                    }
                    i5++;
                    arrayList4 = arrayList;
                }
            }
            i16 = i4 + 1;
            size = i6;
            g6 = rect;
            arrayList3 = arrayList;
        }
    }

    public final void q(View view, int i) {
        Rect g4;
        Rect g5;
        e eVar = (e) view.getLayoutParams();
        View view2 = eVar.f91k;
        if (view2 == null && eVar.f87f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        c cVar = C;
        if (view2 != null) {
            g4 = g();
            g5 = g();
            try {
                k(view2, g4);
                e eVar2 = (e) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                l(i, g4, g5, eVar2, measuredWidth, measuredHeight);
                h(eVar2, g5, measuredWidth, measuredHeight);
                view.layout(g5.left, g5.top, g5.right, g5.bottom);
                return;
            } finally {
                g4.setEmpty();
                cVar.c(g4);
                g5.setEmpty();
                cVar.c(g5);
            }
        }
        int i4 = eVar.f86e;
        if (i4 < 0) {
            e eVar3 = (e) view.getLayoutParams();
            g4 = g();
            g4.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) eVar3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin);
            if (this.f271s != null) {
                WeakHashMap weakHashMap = l0.f2757a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    g4.left = this.f271s.b() + g4.left;
                    g4.top = this.f271s.d() + g4.top;
                    g4.right -= this.f271s.c();
                    g4.bottom -= this.f271s.a();
                }
            }
            g5 = g();
            int i5 = eVar3.f85c;
            if ((i5 & 7) == 0) {
                i5 |= 8388611;
            }
            if ((i5 & 112) == 0) {
                i5 |= 48;
            }
            Gravity.apply(i5, view.getMeasuredWidth(), view.getMeasuredHeight(), g4, g5, i);
            view.layout(g5.left, g5.top, g5.right, g5.bottom);
            return;
        }
        e eVar4 = (e) view.getLayoutParams();
        int i6 = eVar4.f85c;
        if (i6 == 0) {
            i6 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i6, i);
        int i7 = absoluteGravity & 7;
        int i8 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i == 1) {
            i4 = width - i4;
        }
        int m4 = m(i4) - measuredWidth2;
        if (i7 == 1) {
            m4 += measuredWidth2 / 2;
        } else if (i7 == 5) {
            m4 += measuredWidth2;
        }
        int i9 = i8 != 16 ? i8 != 80 ? 0 : measuredHeight2 : measuredHeight2 / 2;
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar4).leftMargin, Math.min(m4, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) eVar4).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar4).topMargin, Math.min(i9, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) eVar4).bottomMargin));
        view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
    }

    public final boolean r(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f261h;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            arrayList.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i4) : i4));
        }
        i iVar = B;
        if (iVar != null) {
            Collections.sort(arrayList, iVar);
        }
        int size = arrayList.size();
        MotionEvent motionEvent2 = null;
        boolean z3 = false;
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            b bVar = ((e) view.getLayoutParams()).f83a;
            if (z3 && actionMasked != 0) {
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
            } else if (!z3 && bVar != null) {
                if (i == 0) {
                    z3 = bVar.f(this, view, motionEvent);
                } else if (i == 1) {
                    z3 = bVar.q(view, motionEvent);
                }
                if (z3) {
                    this.f267o = view;
                }
            }
        }
        arrayList.clear();
        return z3;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z3) {
        b bVar = ((e) view.getLayoutParams()).f83a;
        if (bVar != null) {
            bVar.l(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z3) {
        super.requestDisallowInterceptTouchEvent(z3);
        if (!z3 || this.f264l) {
            return;
        }
        t(false);
        this.f264l = true;
    }

    public final void s() {
        ArrayList arrayList = this.f259f;
        arrayList.clear();
        j jVar = this.f260g;
        q.j jVar2 = (q.j) jVar.f101g;
        m0.b bVar = (m0.b) jVar.f100f;
        q.j jVar3 = (q.j) jVar.f101g;
        int i = jVar2.f3036h;
        for (int i4 = 0; i4 < i; i4++) {
            ArrayList arrayList2 = (ArrayList) jVar2.i(i4);
            if (arrayList2 != null) {
                arrayList2.clear();
                bVar.c(arrayList2);
            }
        }
        jVar2.clear();
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            e n4 = n(childAt);
            int i6 = n4.f87f;
            if (i6 == -1) {
                n4.f92l = null;
                n4.f91k = null;
            } else {
                View view = n4.f91k;
                if (view != null && view.getId() == i6) {
                    View view2 = n4.f91k;
                    for (ViewParent parent = view2.getParent(); parent != this; parent = parent.getParent()) {
                        if (parent == null || parent == childAt) {
                            n4.f92l = null;
                            n4.f91k = null;
                        } else {
                            if (parent instanceof View) {
                                view2 = parent;
                            }
                        }
                    }
                    n4.f92l = view2;
                }
                View findViewById = findViewById(i6);
                n4.f91k = findViewById;
                if (findViewById == null) {
                    if (!isInEditMode()) {
                        throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + getResources().getResourceName(i6) + " to anchor view " + childAt);
                    }
                    n4.f92l = null;
                    n4.f91k = null;
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
                            n4.f92l = null;
                            n4.f91k = null;
                        }
                    }
                    n4.f92l = findViewById;
                } else {
                    if (!isInEditMode()) {
                        throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                    }
                    n4.f92l = null;
                    n4.f91k = null;
                }
            }
            if (!jVar3.containsKey(childAt)) {
                jVar3.put(childAt, null);
            }
            for (int i7 = 0; i7 < childCount; i7++) {
                if (i7 != i5) {
                    View childAt2 = getChildAt(i7);
                    if (childAt2 != n4.f92l) {
                        WeakHashMap weakHashMap = l0.f2757a;
                        int layoutDirection = getLayoutDirection();
                        int absoluteGravity = Gravity.getAbsoluteGravity(((e) childAt2.getLayoutParams()).f88g, layoutDirection);
                        if (absoluteGravity == 0 || (Gravity.getAbsoluteGravity(n4.f89h, layoutDirection) & absoluteGravity) != absoluteGravity) {
                            b bVar2 = n4.f83a;
                            if (bVar2 != null) {
                                bVar2.b(childAt);
                            }
                        }
                    }
                    if (!jVar3.containsKey(childAt2) && !jVar3.containsKey(childAt2)) {
                        jVar3.put(childAt2, null);
                    }
                    if (!jVar3.containsKey(childAt2) || !jVar3.containsKey(childAt)) {
                        throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
                    }
                    ArrayList arrayList3 = (ArrayList) jVar3.get(childAt2);
                    if (arrayList3 == null) {
                        arrayList3 = (ArrayList) bVar.a();
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        jVar3.put(childAt2, arrayList3);
                    }
                    arrayList3.add(childAt);
                }
            }
        }
        ArrayList arrayList4 = (ArrayList) jVar.f102h;
        arrayList4.clear();
        HashSet hashSet = (HashSet) jVar.i;
        hashSet.clear();
        int i8 = jVar3.f3036h;
        for (int i9 = 0; i9 < i8; i9++) {
            jVar.d(jVar3.f(i9), arrayList4, hashSet);
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
        this.f274v = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f273u;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f273u = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f273u.setState(getDrawableState());
                }
                Drawable drawable3 = this.f273u;
                WeakHashMap weakHashMap = l0.f2757a;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.f273u.setVisible(getVisibility() == 0, false);
                this.f273u.setCallback(this);
            }
            WeakHashMap weakHashMap2 = l0.f2757a;
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
        Drawable drawable = this.f273u;
        if (drawable == null || drawable.isVisible() == z3) {
            return;
        }
        this.f273u.setVisible(z3, false);
    }

    public final void t(boolean z3) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            b bVar = ((e) childAt.getLayoutParams()).f83a;
            if (bVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z3) {
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
        this.f267o = null;
        this.f264l = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f273u;
    }

    public final void w() {
        WeakHashMap weakHashMap = l0.f2757a;
        if (!getFitsSystemWindows()) {
            d0.j(this, null);
            return;
        }
        if (this.f275w == null) {
            this.f275w = new a(0, this);
        }
        d0.j(this, this.f275w);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }
}
