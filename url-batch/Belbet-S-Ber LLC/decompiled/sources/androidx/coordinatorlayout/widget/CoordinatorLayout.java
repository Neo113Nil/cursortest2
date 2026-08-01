package androidx.coordinatorlayout.widget;

import a0.a;
import a0.b;
import a0.d;
import a0.e;
import a0.f;
import a0.g;
import a0.i;
import a0.j;
import a0.k;
import a0.l;
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
import com.gdmhkmf.belbet.R;
import g1.v0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.WeakHashMap;
import m0.c;
import n0.h0;
import n0.n;
import n0.o;
import n0.p0;
import n0.v1;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements n, o {
    public static final ThreadLocal A;
    public static final j B;
    public static final c C;

    /* renamed from: y, reason: collision with root package name */
    public static final String f382y;

    /* renamed from: z, reason: collision with root package name */
    public static final Class[] f383z;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f384f;

    /* renamed from: g, reason: collision with root package name */
    public final k f385g;
    public final ArrayList h;
    public final ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f386j;

    /* renamed from: k, reason: collision with root package name */
    public final int[] f387k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f388l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f389m;

    /* renamed from: n, reason: collision with root package name */
    public final int[] f390n;

    /* renamed from: o, reason: collision with root package name */
    public View f391o;

    /* renamed from: p, reason: collision with root package name */
    public View f392p;

    /* renamed from: q, reason: collision with root package name */
    public g f393q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f394r;

    /* renamed from: s, reason: collision with root package name */
    public v1 f395s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f396t;

    /* renamed from: u, reason: collision with root package name */
    public Drawable f397u;

    /* renamed from: v, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f398v;

    /* renamed from: w, reason: collision with root package name */
    public a f399w;

    /* renamed from: x, reason: collision with root package name */
    public final v0 f400x;

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        f382y = r02 != null ? r02.getName() : null;
        B = new j(0);
        f383z = new Class[]{Context.class, AttributeSet.class};
        A = new ThreadLocal();
        C = new c();
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f384f = new ArrayList();
        this.f385g = new k(0);
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.f386j = new int[2];
        this.f387k = new int[2];
        this.f400x = new v0();
        int[] iArr = z.a.f4122a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f390n = intArray;
            float f5 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i = 0; i < length; i++) {
                this.f390n[i] = (int) (r1[i] * f5);
            }
        }
        this.f397u = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        w();
        super.setOnHierarchyChangeListener(new e(this));
        WeakHashMap weakHashMap = p0.f2816a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect g() {
        Rect rect = (Rect) C.a();
        return rect == null ? new Rect() : rect;
    }

    public static void l(int i, Rect rect, Rect rect2, f fVar, int i4, int i5) {
        int i6 = fVar.f83c;
        if (i6 == 0) {
            i6 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i6, i);
        int i7 = fVar.d;
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

    /* JADX WARN: Multi-variable type inference failed */
    public static f n(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.f82b) {
            if (view instanceof b) {
                a0.c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                a0.c cVar = fVar.f81a;
                if (cVar != behavior) {
                    if (cVar != null) {
                        cVar.e();
                    }
                    fVar.f81a = behavior;
                    fVar.f82b = true;
                    if (behavior != null) {
                        behavior.c(fVar);
                    }
                }
                fVar.f82b = true;
                return fVar;
            }
            d dVar = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                dVar = (d) cls.getAnnotation(d.class);
                if (dVar != null) {
                    break;
                }
            }
            if (dVar != null) {
                try {
                    a0.c cVar2 = (a0.c) dVar.value().getDeclaredConstructor(null).newInstance(null);
                    a0.c cVar3 = fVar.f81a;
                    if (cVar3 != cVar2) {
                        if (cVar3 != null) {
                            cVar3.e();
                        }
                        fVar.f81a = cVar2;
                        fVar.f82b = true;
                        if (cVar2 != null) {
                            cVar2.c(fVar);
                        }
                    }
                } catch (Exception e4) {
                    Log.e("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e4);
                }
            }
            fVar.f82b = true;
        }
        return fVar;
    }

    public static void u(View view, int i) {
        f fVar = (f) view.getLayoutParams();
        int i4 = fVar.i;
        if (i4 != i) {
            WeakHashMap weakHashMap = p0.f2816a;
            view.offsetLeftAndRight(i - i4);
            fVar.i = i;
        }
    }

    public static void v(View view, int i) {
        f fVar = (f) view.getLayoutParams();
        int i4 = fVar.f87j;
        if (i4 != i) {
            WeakHashMap weakHashMap = p0.f2816a;
            view.offsetTopAndBottom(i - i4);
            fVar.f87j = i;
        }
    }

    @Override // n0.n
    public final void a(View view, View view2, int i, int i4) {
        v0 v0Var = this.f400x;
        if (i4 == 1) {
            v0Var.f1809b = i;
        } else {
            v0Var.f1808a = i;
        }
        this.f392p = view2;
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            ((f) getChildAt(i5).getLayoutParams()).getClass();
        }
    }

    @Override // n0.n
    public final void b(View view, int i) {
        v0 v0Var = this.f400x;
        if (i == 1) {
            v0Var.f1809b = 0;
        } else {
            v0Var.f1808a = 0;
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.a(i)) {
                a0.c cVar = fVar.f81a;
                if (cVar != null) {
                    cVar.p(childAt, view, i);
                }
                if (i == 0) {
                    fVar.f90m = false;
                } else if (i == 1) {
                    fVar.f91n = false;
                }
                fVar.f92o = false;
            }
        }
        this.f392p = null;
    }

    @Override // n0.n
    public final void c(View view, int i, int i4, int[] iArr, int i5) {
        a0.c cVar;
        int childCount = getChildCount();
        boolean z4 = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i5) && (cVar = fVar.f81a) != null) {
                    int[] iArr2 = this.f386j;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.j(this, childAt, view, i, i4, iArr2, i5);
                    i6 = i > 0 ? Math.max(i6, iArr2[0]) : Math.min(i6, iArr2[0]);
                    i7 = i4 > 0 ? Math.max(i7, iArr2[1]) : Math.min(i7, iArr2[1]);
                    z4 = true;
                }
            }
        }
        iArr[0] = i6;
        iArr[1] = i7;
        if (z4) {
            p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    @Override // n0.o
    public final void d(View view, int i, int i4, int i5, int i6, int i7, int[] iArr) {
        a0.c cVar;
        int childCount = getChildCount();
        int i8 = 0;
        int i9 = 0;
        boolean z4 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i7) && (cVar = fVar.f81a) != null) {
                    int[] iArr2 = this.f386j;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.k(this, childAt, i4, i5, i6, iArr2);
                    i8 = i5 > 0 ? Math.max(i8, iArr2[0]) : Math.min(i8, iArr2[0]);
                    i9 = i6 > 0 ? Math.max(i9, iArr2[1]) : Math.min(i9, iArr2[1]);
                    z4 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i8;
        iArr[1] = iArr[1] + i9;
        if (z4) {
            p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        a0.c cVar = ((f) view.getLayoutParams()).f81a;
        if (cVar != null) {
            cVar.getClass();
        }
        return super.drawChild(canvas, view, j2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f397u;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // n0.n
    public final void e(View view, int i, int i4, int i5, int i6, int i7) {
        d(view, i, i4, i5, i6, 0, this.f387k);
    }

    @Override // n0.n
    public final boolean f(View view, View view2, int i, int i4) {
        int childCount = getChildCount();
        boolean z4 = false;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                a0.c cVar = fVar.f81a;
                if (cVar != null) {
                    boolean o4 = cVar.o(childAt, i, i4);
                    z4 |= o4;
                    if (i4 == 0) {
                        fVar.f90m = o4;
                    } else if (i4 == 1) {
                        fVar.f91n = o4;
                    }
                } else if (i4 == 0) {
                    fVar.f90m = false;
                } else if (i4 == 1) {
                    fVar.f91n = false;
                }
            }
        }
        return z4;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        s();
        return Collections.unmodifiableList(this.f384f);
    }

    public final v1 getLastWindowInsets() {
        return this.f395s;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        v0 v0Var = this.f400x;
        return v0Var.f1809b | v0Var.f1808a;
    }

    public Drawable getStatusBarBackground() {
        return this.f397u;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(f fVar, Rect rect, int i, int i4) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i4) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(max, max2, i + max, i4 + max2);
    }

    public final void i(View view, Rect rect, boolean z4) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z4) {
            k(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final ArrayList j(View view) {
        q.j jVar = (q.j) this.f385g.f98g;
        int i = jVar.h;
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
        ThreadLocal threadLocal = l.f99a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = l.f99a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        l.a(this, view, matrix);
        ThreadLocal threadLocal3 = l.f100b;
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
        int[] iArr = this.f390n;
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
        Rect g3 = g();
        k(view, g3);
        try {
            return g3.contains(i, i4);
        } finally {
            g3.setEmpty();
            cVar.c(g3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t(false);
        if (this.f394r) {
            if (this.f393q == null) {
                this.f393q = new g(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f393q);
        }
        if (this.f395s == null) {
            WeakHashMap weakHashMap = p0.f2816a;
            if (getFitsSystemWindows()) {
                requestApplyInsets();
            }
        }
        this.f389m = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t(false);
        if (this.f394r && this.f393q != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f393q);
        }
        View view = this.f392p;
        if (view != null) {
            b(view, 0);
        }
        this.f389m = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f396t || this.f397u == null) {
            return;
        }
        v1 v1Var = this.f395s;
        int d = v1Var != null ? v1Var.d() : 0;
        if (d > 0) {
            this.f397u.setBounds(0, 0, getWidth(), d);
            this.f397u.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            t(true);
        }
        boolean r4 = r(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return r4;
        }
        t(true);
        return r4;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i, int i4, int i5, int i6) {
        a0.c cVar;
        WeakHashMap weakHashMap = p0.f2816a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f384f;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            View view = (View) arrayList.get(i7);
            if (view.getVisibility() != 8 && ((cVar = ((f) view.getLayoutParams()).f81a) == null || !cVar.g(this, view, layoutDirection))) {
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
        boolean z4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        a0.c cVar;
        int i11;
        int i12;
        boolean z5;
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
                z4 = false;
                break;
            }
            View childAt = coordinatorLayout.getChildAt(i18);
            q.j jVar = (q.j) coordinatorLayout.f385g.f98g;
            int i19 = jVar.h;
            for (int i20 = 0; i20 < i19; i20++) {
                ArrayList arrayList2 = (ArrayList) jVar.i(i20);
                if (arrayList2 != null && arrayList2.contains(childAt)) {
                    z4 = true;
                    break loop0;
                }
            }
            i18++;
        }
        if (z4 != coordinatorLayout.f394r) {
            if (z4) {
                if (coordinatorLayout.f389m) {
                    if (coordinatorLayout.f393q == null) {
                        coordinatorLayout.f393q = new g(coordinatorLayout);
                    }
                    coordinatorLayout.getViewTreeObserver().addOnPreDrawListener(coordinatorLayout.f393q);
                }
                coordinatorLayout.f394r = true;
            } else {
                if (coordinatorLayout.f389m && coordinatorLayout.f393q != null) {
                    coordinatorLayout.getViewTreeObserver().removeOnPreDrawListener(coordinatorLayout.f393q);
                }
                coordinatorLayout.f394r = false;
            }
        }
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        WeakHashMap weakHashMap = p0.f2816a;
        int layoutDirection = coordinatorLayout.getLayoutDirection();
        boolean z6 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i4);
        int size2 = View.MeasureSpec.getSize(i4);
        int i21 = paddingLeft + paddingRight;
        int i22 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z7 = coordinatorLayout.f395s != null && coordinatorLayout.getFitsSystemWindows();
        ArrayList arrayList3 = coordinatorLayout.f384f;
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
                z5 = false;
                i13 = paddingRight;
            } else {
                f fVar = (f) view2.getLayoutParams();
                int i26 = fVar.f84e;
                if (i26 < 0 || mode == 0) {
                    i5 = suggestedMinimumHeight;
                } else {
                    int m4 = coordinatorLayout.m(i26);
                    int i27 = fVar.f83c;
                    if (i27 == 0) {
                        i27 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i27, layoutDirection) & 7;
                    i5 = suggestedMinimumHeight;
                    if ((absoluteGravity == 3 && !z6) || (absoluteGravity == 5 && z6)) {
                        max = Math.max(0, (size - paddingRight) - m4);
                    } else if ((absoluteGravity == 5 && !z6) || (absoluteGravity == 3 && z6)) {
                        max = Math.max(0, m4 - paddingLeft);
                    }
                    int i28 = size3;
                    i7 = max;
                    i6 = i28;
                    if (z7 || view2.getFitsSystemWindows()) {
                        i8 = i6;
                        i9 = i;
                        i10 = i4;
                    } else {
                        i8 = i6;
                        int c5 = coordinatorLayout.f395s.c() + coordinatorLayout.f395s.b();
                        int a5 = coordinatorLayout.f395s.a() + coordinatorLayout.f395s.d();
                        i9 = View.MeasureSpec.makeMeasureSpec(size - c5, mode);
                        i10 = View.MeasureSpec.makeMeasureSpec(size2 - a5, mode2);
                    }
                    cVar = fVar.f81a;
                    if (cVar == null) {
                        z5 = false;
                        i11 = paddingLeft;
                        i12 = i25;
                        i13 = paddingRight;
                        i14 = i5;
                        arrayList = arrayList3;
                        int i29 = i9;
                        i17 = i23;
                        int i30 = i10;
                        boolean h = cVar.h(this, view2, i29, i7, i30);
                        view = view2;
                        i9 = i29;
                        i15 = i7;
                        i16 = i30;
                        if (h) {
                            coordinatorLayout = this;
                            int max2 = Math.max(i12, view.getMeasuredWidth() + i21 + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                            int max3 = Math.max(i14, view.getMeasuredHeight() + i22 + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                            i24 = View.combineMeasuredStates(i24, view.getMeasuredState());
                            suggestedMinimumWidth = max2;
                            suggestedMinimumHeight = max3;
                        }
                    } else {
                        i11 = paddingLeft;
                        i12 = i25;
                        z5 = false;
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
                    int max22 = Math.max(i12, view.getMeasuredWidth() + i21 + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                    int max32 = Math.max(i14, view.getMeasuredHeight() + i22 + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                    i24 = View.combineMeasuredStates(i24, view.getMeasuredState());
                    suggestedMinimumWidth = max22;
                    suggestedMinimumHeight = max32;
                }
                i6 = size3;
                i7 = 0;
                if (z7) {
                }
                i8 = i6;
                i9 = i;
                i10 = i4;
                cVar = fVar.f81a;
                if (cVar == null) {
                }
                coordinatorLayout = this;
                coordinatorLayout.measureChildWithMargins(view, i9, i15, i16, 0);
                int max222 = Math.max(i12, view.getMeasuredWidth() + i21 + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                int max322 = Math.max(i14, view.getMeasuredHeight() + i22 + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
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
    public final boolean onNestedFling(View view, float f5, float f6, boolean z4) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0)) {
                    a0.c cVar = fVar.f81a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f5, float f6) {
        a0.c cVar;
        int childCount = getChildCount();
        boolean z4 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0) && (cVar = fVar.f81a) != null) {
                    z4 |= cVar.i(view);
                }
            }
        }
        return z4;
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
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.f3386f);
        SparseArray sparseArray = iVar.h;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            a0.c cVar = n(childAt).f81a;
            if (id != -1 && cVar != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                cVar.m(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable n4;
        i iVar = new i(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            a0.c cVar = ((f) childAt.getLayoutParams()).f81a;
            if (id != -1 && cVar != null && (n4 = cVar.n(childAt)) != null) {
                sparseArray.append(id, n4);
            }
        }
        iVar.h = sparseArray;
        return iVar;
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
        boolean z4;
        boolean q4;
        MotionEvent motionEvent2;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f391o == null) {
            z4 = r(motionEvent, 1);
        } else {
            z4 = false;
        }
        a0.c cVar = ((f) this.f391o.getLayoutParams()).f81a;
        if (cVar != null) {
            q4 = cVar.q(this.f391o, motionEvent);
            motionEvent2 = null;
            if (this.f391o != null) {
                q4 |= super.onTouchEvent(motionEvent);
            } else if (z4) {
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
        if (this.f391o != null) {
        }
        if (motionEvent2 != null) {
        }
        if (actionMasked == 1) {
        }
        t(false);
        return q4;
    }

    public final void p(int i) {
        int i4;
        Rect rect;
        int i5;
        ArrayList arrayList;
        boolean z4;
        boolean z5;
        int width;
        int i6;
        int i7;
        int i8;
        int height;
        int i9;
        int i10;
        int i11;
        ArrayList arrayList2;
        f fVar;
        int i12;
        int i13;
        Rect rect2;
        int i14;
        View view;
        a0.c cVar;
        WeakHashMap weakHashMap = p0.f2816a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList3 = this.f384f;
        int size = arrayList3.size();
        Rect g3 = g();
        Rect g5 = g();
        Rect g6 = g();
        int i15 = 0;
        while (true) {
            c cVar2 = C;
            if (i15 >= size) {
                Rect rect3 = g6;
                g3.setEmpty();
                cVar2.c(g3);
                g5.setEmpty();
                cVar2.c(g5);
                rect3.setEmpty();
                cVar2.c(rect3);
                return;
            }
            View view2 = (View) arrayList3.get(i15);
            f fVar2 = (f) view2.getLayoutParams();
            if (i != 0 || view2.getVisibility() != 8) {
                int i16 = 0;
                while (i16 < i15) {
                    if (fVar2.f89l == ((View) arrayList3.get(i16))) {
                        f fVar3 = (f) view2.getLayoutParams();
                        if (fVar3.f88k != null) {
                            Rect g7 = g();
                            Rect g8 = g();
                            f fVar4 = fVar2;
                            Rect g9 = g();
                            k(fVar3.f88k, g7);
                            i(view2, g8, false);
                            int measuredWidth = view2.getMeasuredWidth();
                            View view3 = view2;
                            int measuredHeight = view3.getMeasuredHeight();
                            arrayList2 = arrayList3;
                            fVar = fVar4;
                            i12 = i16;
                            layoutDirection = layoutDirection;
                            i14 = i15;
                            view = view3;
                            l(layoutDirection, g7, g9, fVar3, measuredWidth, measuredHeight);
                            i13 = size;
                            rect2 = g6;
                            boolean z6 = (g9.left == g8.left && g9.top == g8.top) ? false : true;
                            h(fVar3, g9, measuredWidth, measuredHeight);
                            int i17 = g9.left - g8.left;
                            int i18 = g9.top - g8.top;
                            if (i17 != 0) {
                                WeakHashMap weakHashMap2 = p0.f2816a;
                                view.offsetLeftAndRight(i17);
                            }
                            if (i18 != 0) {
                                WeakHashMap weakHashMap3 = p0.f2816a;
                                view.offsetTopAndBottom(i18);
                            }
                            if (z6 && (cVar = fVar3.f81a) != null) {
                                cVar.d(this, view, fVar3.f88k);
                            }
                            g7.setEmpty();
                            cVar2.c(g7);
                            g8.setEmpty();
                            cVar2.c(g8);
                            g9.setEmpty();
                            cVar2.c(g9);
                            i16 = i12 + 1;
                            fVar2 = fVar;
                            view2 = view;
                            arrayList3 = arrayList2;
                            size = i13;
                            i15 = i14;
                            g6 = rect2;
                        }
                    }
                    arrayList2 = arrayList3;
                    fVar = fVar2;
                    i12 = i16;
                    i13 = size;
                    rect2 = g6;
                    i14 = i15;
                    view = view2;
                    i16 = i12 + 1;
                    fVar2 = fVar;
                    view2 = view;
                    arrayList3 = arrayList2;
                    size = i13;
                    i15 = i14;
                    g6 = rect2;
                }
                ArrayList arrayList4 = arrayList3;
                f fVar5 = fVar2;
                int i19 = size;
                Rect rect4 = g6;
                i4 = i15;
                View view4 = view2;
                i(view4, g5, true);
                if (fVar5.f86g != 0 && !g5.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(fVar5.f86g, layoutDirection);
                    int i20 = absoluteGravity & 112;
                    if (i20 == 48) {
                        g3.top = Math.max(g3.top, g5.bottom);
                    } else if (i20 == 80) {
                        g3.bottom = Math.max(g3.bottom, getHeight() - g5.top);
                    }
                    int i21 = absoluteGravity & 7;
                    if (i21 == 3) {
                        g3.left = Math.max(g3.left, g5.right);
                    } else if (i21 == 5) {
                        g3.right = Math.max(g3.right, getWidth() - g5.left);
                    }
                }
                if (fVar5.h != 0 && view4.getVisibility() == 0) {
                    WeakHashMap weakHashMap4 = p0.f2816a;
                    if (view4.isLaidOut() && view4.getWidth() > 0 && view4.getHeight() > 0) {
                        f fVar6 = (f) view4.getLayoutParams();
                        a0.c cVar3 = fVar6.f81a;
                        Rect g10 = g();
                        Rect g11 = g();
                        g11.set(view4.getLeft(), view4.getTop(), view4.getRight(), view4.getBottom());
                        if (cVar3 == null || !cVar3.a(view4, g10)) {
                            g10.set(g11);
                        } else if (!g11.contains(g10)) {
                            throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + g10.toShortString() + " | Bounds:" + g11.toShortString());
                        }
                        g11.setEmpty();
                        cVar2.c(g11);
                        if (g10.isEmpty()) {
                            g10.setEmpty();
                            cVar2.c(g10);
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(fVar6.h, layoutDirection);
                            if ((absoluteGravity2 & 48) != 48 || (i10 = (g10.top - ((ViewGroup.MarginLayoutParams) fVar6).topMargin) - fVar6.f87j) >= (i11 = g3.top)) {
                                z4 = false;
                            } else {
                                v(view4, i11 - i10);
                                z4 = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - g10.bottom) - ((ViewGroup.MarginLayoutParams) fVar6).bottomMargin) + fVar6.f87j) < (i9 = g3.bottom)) {
                                v(view4, height - i9);
                                z4 = true;
                            }
                            if (!z4) {
                                v(view4, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i7 = (g10.left - ((ViewGroup.MarginLayoutParams) fVar6).leftMargin) - fVar6.i) >= (i8 = g3.left)) {
                                z5 = false;
                            } else {
                                u(view4, i8 - i7);
                                z5 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - g10.right) - ((ViewGroup.MarginLayoutParams) fVar6).rightMargin) + fVar6.i) < (i6 = g3.right)) {
                                u(view4, width - i6);
                                z5 = true;
                            }
                            if (!z5) {
                                u(view4, 0);
                            }
                            g10.setEmpty();
                            cVar2.c(g10);
                        }
                    }
                }
                if (i != 2) {
                    rect = rect4;
                    rect.set(((f) view4.getLayoutParams()).f93p);
                    if (rect.equals(g5)) {
                        arrayList = arrayList4;
                        i5 = i19;
                    } else {
                        ((f) view4.getLayoutParams()).f93p.set(g5);
                    }
                } else {
                    rect = rect4;
                }
                int i22 = i4 + 1;
                i5 = i19;
                while (true) {
                    arrayList = arrayList4;
                    if (i22 >= i5) {
                        break;
                    }
                    View view5 = (View) arrayList.get(i22);
                    f fVar7 = (f) view5.getLayoutParams();
                    a0.c cVar4 = fVar7.f81a;
                    if (cVar4 != null && cVar4.b(view5, view4)) {
                        if (i == 0 && fVar7.f92o) {
                            fVar7.f92o = false;
                        } else {
                            boolean d = i != 2 ? cVar4.d(this, view5, view4) : true;
                            if (i == 1) {
                                fVar7.f92o = d;
                            }
                        }
                    }
                    i22++;
                    arrayList4 = arrayList;
                }
            } else {
                arrayList = arrayList3;
                i5 = size;
                rect = g6;
                i4 = i15;
            }
            i15 = i4 + 1;
            g6 = rect;
            size = i5;
            arrayList3 = arrayList;
        }
    }

    public final void q(View view, int i) {
        Rect g3;
        Rect g5;
        f fVar = (f) view.getLayoutParams();
        View view2 = fVar.f88k;
        if (view2 == null && fVar.f85f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        c cVar = C;
        if (view2 != null) {
            g3 = g();
            g5 = g();
            try {
                k(view2, g3);
                f fVar2 = (f) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                l(i, g3, g5, fVar2, measuredWidth, measuredHeight);
                h(fVar2, g5, measuredWidth, measuredHeight);
                view.layout(g5.left, g5.top, g5.right, g5.bottom);
                return;
            } finally {
                g3.setEmpty();
                cVar.c(g3);
                g5.setEmpty();
                cVar.c(g5);
            }
        }
        int i4 = fVar.f84e;
        if (i4 < 0) {
            f fVar3 = (f) view.getLayoutParams();
            g3 = g();
            g3.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar3).bottomMargin);
            if (this.f395s != null) {
                WeakHashMap weakHashMap = p0.f2816a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    g3.left = this.f395s.b() + g3.left;
                    g3.top = this.f395s.d() + g3.top;
                    g3.right -= this.f395s.c();
                    g3.bottom -= this.f395s.a();
                }
            }
            g5 = g();
            int i5 = fVar3.f83c;
            if ((i5 & 7) == 0) {
                i5 |= 8388611;
            }
            if ((i5 & 112) == 0) {
                i5 |= 48;
            }
            Gravity.apply(i5, view.getMeasuredWidth(), view.getMeasuredHeight(), g3, g5, i);
            view.layout(g5.left, g5.top, g5.right, g5.bottom);
            return;
        }
        f fVar4 = (f) view.getLayoutParams();
        int i6 = fVar4.f83c;
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
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar4).leftMargin, Math.min(m4, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) fVar4).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar4).topMargin, Math.min(i9, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) fVar4).bottomMargin));
        view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
    }

    public final boolean r(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.h;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            arrayList.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i4) : i4));
        }
        j jVar = B;
        if (jVar != null) {
            Collections.sort(arrayList, jVar);
        }
        int size = arrayList.size();
        MotionEvent motionEvent2 = null;
        boolean z4 = false;
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            a0.c cVar = ((f) view.getLayoutParams()).f81a;
            if (z4 && actionMasked != 0) {
                if (cVar != null) {
                    if (motionEvent2 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i == 0) {
                        cVar.f(this, view, motionEvent2);
                    } else if (i == 1) {
                        cVar.q(view, motionEvent2);
                    }
                }
            } else if (!z4 && cVar != null) {
                if (i == 0) {
                    z4 = cVar.f(this, view, motionEvent);
                } else if (i == 1) {
                    z4 = cVar.q(view, motionEvent);
                }
                if (z4) {
                    this.f391o = view;
                }
            }
        }
        arrayList.clear();
        return z4;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z4) {
        a0.c cVar = ((f) view.getLayoutParams()).f81a;
        if (cVar == null || !cVar.l(this, view, rect)) {
            return super.requestChildRectangleOnScreen(view, rect, z4);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        super.requestDisallowInterceptTouchEvent(z4);
        if (!z4 || this.f388l) {
            return;
        }
        t(false);
        this.f388l = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f9, code lost:
    
        if ((android.view.Gravity.getAbsoluteGravity(r8.h, r12) & r13) == r13) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s() {
        ArrayList arrayList = this.f384f;
        arrayList.clear();
        k kVar = this.f385g;
        q.j jVar = (q.j) kVar.f98g;
        m0.b bVar = (m0.b) kVar.f97f;
        q.j jVar2 = (q.j) kVar.f98g;
        int i = jVar.h;
        for (int i4 = 0; i4 < i; i4++) {
            ArrayList arrayList2 = (ArrayList) jVar.i(i4);
            if (arrayList2 != null) {
                arrayList2.clear();
                bVar.c(arrayList2);
            }
        }
        jVar.clear();
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            f n4 = n(childAt);
            int i6 = n4.f85f;
            if (i6 == -1) {
                n4.f89l = null;
                n4.f88k = null;
            } else {
                View view = n4.f88k;
                if (view != null && view.getId() == i6) {
                    View view2 = n4.f88k;
                    for (ViewParent parent = view2.getParent(); parent != this; parent = parent.getParent()) {
                        if (parent == null || parent == childAt) {
                            n4.f89l = null;
                            n4.f88k = null;
                        } else {
                            if (parent instanceof View) {
                                view2 = parent;
                            }
                        }
                    }
                    n4.f89l = view2;
                }
                View findViewById = findViewById(i6);
                n4.f88k = findViewById;
                if (findViewById == null) {
                    if (!isInEditMode()) {
                        throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + getResources().getResourceName(i6) + " to anchor view " + childAt);
                    }
                    n4.f89l = null;
                    n4.f88k = null;
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
                            n4.f89l = null;
                            n4.f88k = null;
                        }
                    }
                    n4.f89l = findViewById;
                } else {
                    if (!isInEditMode()) {
                        throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                    }
                    n4.f89l = null;
                    n4.f88k = null;
                }
            }
            if (!jVar2.containsKey(childAt)) {
                jVar2.put(childAt, null);
            }
            for (int i7 = 0; i7 < childCount; i7++) {
                if (i7 != i5) {
                    View childAt2 = getChildAt(i7);
                    if (childAt2 != n4.f89l) {
                        WeakHashMap weakHashMap = p0.f2816a;
                        int layoutDirection = getLayoutDirection();
                        int absoluteGravity = Gravity.getAbsoluteGravity(((f) childAt2.getLayoutParams()).f86g, layoutDirection);
                        if (absoluteGravity != 0) {
                        }
                        a0.c cVar = n4.f81a;
                        if (cVar == null) {
                            continue;
                        } else if (!cVar.b(childAt, childAt2)) {
                            continue;
                        }
                    }
                    if (!jVar2.containsKey(childAt2) && !jVar2.containsKey(childAt2)) {
                        jVar2.put(childAt2, null);
                    }
                    if (!jVar2.containsKey(childAt2) || !jVar2.containsKey(childAt)) {
                        throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
                    }
                    ArrayList arrayList3 = (ArrayList) jVar2.get(childAt2);
                    if (arrayList3 == null) {
                        arrayList3 = (ArrayList) bVar.a();
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        jVar2.put(childAt2, arrayList3);
                    }
                    arrayList3.add(childAt);
                }
            }
        }
        ArrayList arrayList4 = (ArrayList) kVar.h;
        arrayList4.clear();
        HashSet hashSet = (HashSet) kVar.i;
        hashSet.clear();
        int i8 = jVar2.h;
        for (int i9 = 0; i9 < i8; i9++) {
            kVar.e(jVar2.f(i9), arrayList4, hashSet);
        }
        arrayList.addAll(arrayList4);
        Collections.reverse(arrayList);
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z4) {
        super.setFitsSystemWindows(z4);
        w();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f398v = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f397u;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f397u = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f397u.setState(getDrawableState());
                }
                Drawable drawable3 = this.f397u;
                WeakHashMap weakHashMap = p0.f2816a;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.f397u.setVisible(getVisibility() == 0, false);
                this.f397u.setCallback(this);
            }
            WeakHashMap weakHashMap2 = p0.f2816a;
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
        boolean z4 = i == 0;
        Drawable drawable = this.f397u;
        if (drawable == null || drawable.isVisible() == z4) {
            return;
        }
        this.f397u.setVisible(z4, false);
    }

    public final void t(boolean z4) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            a0.c cVar = ((f) childAt.getLayoutParams()).f81a;
            if (cVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z4) {
                    cVar.f(this, childAt, obtain);
                } else {
                    cVar.q(childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            ((f) getChildAt(i4).getLayoutParams()).getClass();
        }
        this.f391o = null;
        this.f388l = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f397u;
    }

    public final void w() {
        WeakHashMap weakHashMap = p0.f2816a;
        if (!getFitsSystemWindows()) {
            h0.c(this, null);
            return;
        }
        if (this.f399w == null) {
            this.f399w = new a(0, this);
        }
        h0.c(this, this.f399w);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f ? new f((f) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }
}
