package androidx.coordinatorlayout.widget;

import a2.q;
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
import androidx.emoji2.text.w;
import b1.i0;
import com.gglhk.bofio.fortunetiger.R;
import j0.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.WeakHashMap;
import k0.b0;
import k0.j0;
import k0.k;
import k0.l;
import k0.m1;
import k0.z;
import n.j;
import r0.a;
import x.b;
import x.d;
import x.e;
import x.f;
import x.g;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements k, l {
    public static final ThreadLocal A;
    public static final q B;
    public static final c C;

    /* renamed from: y, reason: collision with root package name */
    public static final String f273y;

    /* renamed from: z, reason: collision with root package name */
    public static final Class[] f274z;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f275f;
    public final w g;
    public final ArrayList h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f276i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f277j;

    /* renamed from: k, reason: collision with root package name */
    public final int[] f278k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f279l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f280m;

    /* renamed from: n, reason: collision with root package name */
    public final int[] f281n;

    /* renamed from: o, reason: collision with root package name */
    public View f282o;

    /* renamed from: p, reason: collision with root package name */
    public View f283p;

    /* renamed from: q, reason: collision with root package name */
    public e f284q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f285r;

    /* renamed from: s, reason: collision with root package name */
    public m1 f286s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f287t;

    /* renamed from: u, reason: collision with root package name */
    public Drawable f288u;

    /* renamed from: v, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f289v;

    /* renamed from: w, reason: collision with root package name */
    public a f290w;

    /* renamed from: x, reason: collision with root package name */
    public final i0 f291x;

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        f273y = r02 != null ? r02.getName() : null;
        B = new q(3);
        f274z = new Class[]{Context.class, AttributeSet.class};
        A = new ThreadLocal();
        C = new c();
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f275f = new ArrayList();
        this.g = new w(7);
        this.h = new ArrayList();
        this.f276i = new ArrayList();
        this.f277j = new int[2];
        this.f278k = new int[2];
        this.f291x = new i0();
        int[] iArr = w.a.f3580a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f281n = intArray;
            float f4 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i4 = 0; i4 < length; i4++) {
                this.f281n[i4] = (int) (r1[i4] * f4);
            }
        }
        this.f288u = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        w();
        super.setOnHierarchyChangeListener(new x.c(this));
        WeakHashMap weakHashMap = j0.f2752a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect g() {
        Rect rect = (Rect) C.a();
        return rect == null ? new Rect() : rect;
    }

    public static void l(int i4, Rect rect, Rect rect2, d dVar, int i5, int i6) {
        int i7 = dVar.c;
        if (i7 == 0) {
            i7 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i7, i4);
        int i8 = dVar.f3592d;
        if ((i8 & 7) == 0) {
            i8 |= 8388611;
        }
        if ((i8 & 112) == 0) {
            i8 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i8, i4);
        int i9 = absoluteGravity & 7;
        int i10 = absoluteGravity & 112;
        int i11 = absoluteGravity2 & 7;
        int i12 = absoluteGravity2 & 112;
        int width = i11 != 1 ? i11 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i12 != 16 ? i12 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i9 == 1) {
            width -= i5 / 2;
        } else if (i9 != 5) {
            width -= i5;
        }
        if (i10 == 16) {
            height -= i6 / 2;
        } else if (i10 != 80) {
            height -= i6;
        }
        rect2.set(width, height, i5 + width, i6 + height);
    }

    public static d n(View view) {
        d dVar = (d) view.getLayoutParams();
        if (!dVar.f3591b) {
            b bVar = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                bVar = (b) cls.getAnnotation(b.class);
                if (bVar != null) {
                    break;
                }
            }
            if (bVar != null) {
                try {
                    x.a aVar = (x.a) bVar.value().getDeclaredConstructor(null).newInstance(null);
                    x.a aVar2 = dVar.f3590a;
                    if (aVar2 != aVar) {
                        if (aVar2 != null) {
                            aVar2.e();
                        }
                        dVar.f3590a = aVar;
                        dVar.f3591b = true;
                        if (aVar != null) {
                            aVar.c(dVar);
                        }
                    }
                } catch (Exception e4) {
                    Log.e("CoordinatorLayout", "Default behavior class " + bVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e4);
                }
            }
            dVar.f3591b = true;
        }
        return dVar;
    }

    public static void u(View view, int i4) {
        d dVar = (d) view.getLayoutParams();
        int i5 = dVar.f3595i;
        if (i5 != i4) {
            WeakHashMap weakHashMap = j0.f2752a;
            view.offsetLeftAndRight(i4 - i5);
            dVar.f3595i = i4;
        }
    }

    public static void v(View view, int i4) {
        d dVar = (d) view.getLayoutParams();
        int i5 = dVar.f3596j;
        if (i5 != i4) {
            WeakHashMap weakHashMap = j0.f2752a;
            view.offsetTopAndBottom(i4 - i5);
            dVar.f3596j = i4;
        }
    }

    @Override // k0.k
    public final void a(View view, View view2, int i4, int i5) {
        i0 i0Var = this.f291x;
        if (i5 == 1) {
            i0Var.f802b = i4;
        } else {
            i0Var.f801a = i4;
        }
        this.f283p = view2;
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            ((d) getChildAt(i6).getLayoutParams()).getClass();
        }
    }

    @Override // k0.k
    public final void b(View view, int i4) {
        i0 i0Var = this.f291x;
        if (i4 == 1) {
            i0Var.f802b = 0;
        } else {
            i0Var.f801a = 0;
        }
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            d dVar = (d) childAt.getLayoutParams();
            if (dVar.a(i4)) {
                x.a aVar = dVar.f3590a;
                if (aVar != null) {
                    aVar.p(childAt, view, i4);
                }
                if (i4 == 0) {
                    dVar.f3599m = false;
                } else if (i4 == 1) {
                    dVar.f3600n = false;
                }
            }
        }
        this.f283p = null;
    }

    @Override // k0.k
    public final void c(View view, int i4, int i5, int[] iArr, int i6) {
        x.a aVar;
        int childCount = getChildCount();
        boolean z3 = false;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.a(i6) && (aVar = dVar.f3590a) != null) {
                    int[] iArr2 = this.f277j;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    aVar.j(this, childAt, view, i4, i5, iArr2, i6);
                    i7 = i4 > 0 ? Math.max(i7, iArr2[0]) : Math.min(i7, iArr2[0]);
                    i8 = i5 > 0 ? Math.max(i8, iArr2[1]) : Math.min(i8, iArr2[1]);
                    z3 = true;
                }
            }
        }
        iArr[0] = i7;
        iArr[1] = i8;
        if (z3) {
            p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof d) && super.checkLayoutParams(layoutParams);
    }

    @Override // k0.l
    public final void d(View view, int i4, int i5, int i6, int i7, int i8, int[] iArr) {
        x.a aVar;
        int childCount = getChildCount();
        int i9 = 0;
        int i10 = 0;
        boolean z3 = false;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.a(i8) && (aVar = dVar.f3590a) != null) {
                    int[] iArr2 = this.f277j;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    aVar.k(this, childAt, i5, i6, i7, iArr2);
                    i9 = i6 > 0 ? Math.max(i9, iArr2[0]) : Math.min(i9, iArr2[0]);
                    i10 = i7 > 0 ? Math.max(i10, iArr2[1]) : Math.min(i10, iArr2[1]);
                    z3 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i9;
        iArr[1] = iArr[1] + i10;
        if (z3) {
            p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j4) {
        x.a aVar = ((d) view.getLayoutParams()).f3590a;
        if (aVar != null) {
            aVar.getClass();
        }
        return super.drawChild(canvas, view, j4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f288u;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // k0.k
    public final void e(View view, int i4, int i5, int i6, int i7, int i8) {
        d(view, i4, i5, i6, i7, 0, this.f278k);
    }

    @Override // k0.k
    public final boolean f(View view, View view2, int i4, int i5) {
        int childCount = getChildCount();
        boolean z3 = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                x.a aVar = dVar.f3590a;
                if (aVar != null) {
                    boolean o4 = aVar.o(childAt, i4, i5);
                    z3 |= o4;
                    if (i5 == 0) {
                        dVar.f3599m = o4;
                    } else if (i5 == 1) {
                        dVar.f3600n = o4;
                    }
                } else if (i5 == 0) {
                    dVar.f3599m = false;
                } else if (i5 == 1) {
                    dVar.f3600n = false;
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
        return Collections.unmodifiableList(this.f275f);
    }

    public final m1 getLastWindowInsets() {
        return this.f286s;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        i0 i0Var = this.f291x;
        return i0Var.f802b | i0Var.f801a;
    }

    public Drawable getStatusBarBackground() {
        return this.f288u;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(d dVar, Rect rect, int i4, int i5) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i4) - ((ViewGroup.MarginLayoutParams) dVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) dVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i5) - ((ViewGroup.MarginLayoutParams) dVar).bottomMargin));
        rect.set(max, max2, i4 + max, i5 + max2);
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
        j jVar = (j) this.g.g;
        int i4 = jVar.h;
        ArrayList arrayList = null;
        for (int i5 = 0; i5 < i4; i5++) {
            ArrayList arrayList2 = (ArrayList) jVar.i(i5);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(jVar.f(i5));
            }
        }
        ArrayList arrayList3 = this.f276i;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void k(View view, Rect rect) {
        ThreadLocal threadLocal = g.f3603a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = g.f3603a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        g.a(this, view, matrix);
        ThreadLocal threadLocal3 = g.f3604b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int m(int i4) {
        int[] iArr = this.f281n;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i4);
            return 0;
        }
        if (i4 >= 0 && i4 < iArr.length) {
            return iArr[i4];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i4 + " out of range for " + this);
        return 0;
    }

    public final boolean o(View view, int i4, int i5) {
        c cVar = C;
        Rect g = g();
        k(view, g);
        try {
            return g.contains(i4, i5);
        } finally {
            g.setEmpty();
            cVar.c(g);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t(false);
        if (this.f285r) {
            if (this.f284q == null) {
                this.f284q = new e(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f284q);
        }
        if (this.f286s == null) {
            WeakHashMap weakHashMap = j0.f2752a;
            if (getFitsSystemWindows()) {
                z.c(this);
            }
        }
        this.f280m = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t(false);
        if (this.f285r && this.f284q != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f284q);
        }
        View view = this.f283p;
        if (view != null) {
            b(view, 0);
        }
        this.f280m = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f287t || this.f288u == null) {
            return;
        }
        m1 m1Var = this.f286s;
        int d4 = m1Var != null ? m1Var.d() : 0;
        if (d4 > 0) {
            this.f288u.setBounds(0, 0, getWidth(), d4);
            this.f288u.draw(canvas);
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
    public final void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        x.a aVar;
        WeakHashMap weakHashMap = j0.f2752a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f275f;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            View view = (View) arrayList.get(i8);
            if (view.getVisibility() != 8 && ((aVar = ((d) view.getLayoutParams()).f3590a) == null || !aVar.g(this, view, layoutDirection))) {
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
    public final void onMeasure(int i4, int i5) {
        boolean z3;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        x.a aVar;
        int i12;
        int i13;
        boolean z4;
        int i14;
        int i15;
        ArrayList arrayList;
        int i16;
        int i17;
        View view;
        int i18;
        int max;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.s();
        int childCount = coordinatorLayout.getChildCount();
        int i19 = 0;
        loop0: while (true) {
            if (i19 >= childCount) {
                z3 = false;
                break;
            }
            View childAt = coordinatorLayout.getChildAt(i19);
            j jVar = (j) coordinatorLayout.g.g;
            int i20 = jVar.h;
            for (int i21 = 0; i21 < i20; i21++) {
                ArrayList arrayList2 = (ArrayList) jVar.i(i21);
                if (arrayList2 != null && arrayList2.contains(childAt)) {
                    z3 = true;
                    break loop0;
                }
            }
            i19++;
        }
        if (z3 != coordinatorLayout.f285r) {
            if (z3) {
                if (coordinatorLayout.f280m) {
                    if (coordinatorLayout.f284q == null) {
                        coordinatorLayout.f284q = new e(coordinatorLayout);
                    }
                    coordinatorLayout.getViewTreeObserver().addOnPreDrawListener(coordinatorLayout.f284q);
                }
                coordinatorLayout.f285r = true;
            } else {
                if (coordinatorLayout.f280m && coordinatorLayout.f284q != null) {
                    coordinatorLayout.getViewTreeObserver().removeOnPreDrawListener(coordinatorLayout.f284q);
                }
                coordinatorLayout.f285r = false;
            }
        }
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        WeakHashMap weakHashMap = j0.f2752a;
        int layoutDirection = coordinatorLayout.getLayoutDirection();
        boolean z5 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        int mode2 = View.MeasureSpec.getMode(i5);
        int size2 = View.MeasureSpec.getSize(i5);
        int i22 = paddingLeft + paddingRight;
        int i23 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z6 = coordinatorLayout.f286s != null && coordinatorLayout.getFitsSystemWindows();
        ArrayList arrayList3 = coordinatorLayout.f275f;
        int size3 = arrayList3.size();
        int i24 = 0;
        int i25 = 0;
        while (i24 < size3) {
            View view2 = (View) arrayList3.get(i24);
            int i26 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                arrayList = arrayList3;
                i9 = size3;
                i18 = i24;
                i12 = paddingLeft;
                suggestedMinimumWidth = i26;
                z4 = false;
                i14 = paddingRight;
            } else {
                d dVar = (d) view2.getLayoutParams();
                int i27 = dVar.f3593e;
                if (i27 < 0 || mode == 0) {
                    i6 = suggestedMinimumHeight;
                } else {
                    int m4 = coordinatorLayout.m(i27);
                    int i28 = dVar.c;
                    if (i28 == 0) {
                        i28 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i28, layoutDirection) & 7;
                    i6 = suggestedMinimumHeight;
                    if ((absoluteGravity == 3 && !z5) || (absoluteGravity == 5 && z5)) {
                        max = Math.max(0, (size - paddingRight) - m4);
                    } else if ((absoluteGravity == 5 && !z5) || (absoluteGravity == 3 && z5)) {
                        max = Math.max(0, m4 - paddingLeft);
                    }
                    int i29 = size3;
                    i8 = max;
                    i7 = i29;
                    if (z6 || view2.getFitsSystemWindows()) {
                        i9 = i7;
                        i10 = i4;
                        i11 = i5;
                    } else {
                        i9 = i7;
                        int c = coordinatorLayout.f286s.c() + coordinatorLayout.f286s.b();
                        int a4 = coordinatorLayout.f286s.a() + coordinatorLayout.f286s.d();
                        i10 = View.MeasureSpec.makeMeasureSpec(size - c, mode);
                        i11 = View.MeasureSpec.makeMeasureSpec(size2 - a4, mode2);
                    }
                    aVar = dVar.f3590a;
                    if (aVar == null) {
                        z4 = false;
                        i12 = paddingLeft;
                        i13 = i26;
                        i14 = paddingRight;
                        i15 = i6;
                        arrayList = arrayList3;
                        int i30 = i10;
                        i18 = i24;
                        int i31 = i11;
                        boolean h = aVar.h(this, view2, i30, i8, i31);
                        view = view2;
                        i10 = i30;
                        i16 = i8;
                        i17 = i31;
                        if (h) {
                            coordinatorLayout = this;
                            int max2 = Math.max(i13, view.getMeasuredWidth() + i22 + ((ViewGroup.MarginLayoutParams) dVar).leftMargin + ((ViewGroup.MarginLayoutParams) dVar).rightMargin);
                            int max3 = Math.max(i15, view.getMeasuredHeight() + i23 + ((ViewGroup.MarginLayoutParams) dVar).topMargin + ((ViewGroup.MarginLayoutParams) dVar).bottomMargin);
                            i25 = View.combineMeasuredStates(i25, view.getMeasuredState());
                            suggestedMinimumWidth = max2;
                            suggestedMinimumHeight = max3;
                        }
                    } else {
                        i12 = paddingLeft;
                        i13 = i26;
                        z4 = false;
                        i14 = paddingRight;
                        i15 = i6;
                        arrayList = arrayList3;
                        i16 = i8;
                        i17 = i11;
                        view = view2;
                        i18 = i24;
                    }
                    coordinatorLayout = this;
                    coordinatorLayout.measureChildWithMargins(view, i10, i16, i17, 0);
                    int max22 = Math.max(i13, view.getMeasuredWidth() + i22 + ((ViewGroup.MarginLayoutParams) dVar).leftMargin + ((ViewGroup.MarginLayoutParams) dVar).rightMargin);
                    int max32 = Math.max(i15, view.getMeasuredHeight() + i23 + ((ViewGroup.MarginLayoutParams) dVar).topMargin + ((ViewGroup.MarginLayoutParams) dVar).bottomMargin);
                    i25 = View.combineMeasuredStates(i25, view.getMeasuredState());
                    suggestedMinimumWidth = max22;
                    suggestedMinimumHeight = max32;
                }
                i7 = size3;
                i8 = 0;
                if (z6) {
                }
                i9 = i7;
                i10 = i4;
                i11 = i5;
                aVar = dVar.f3590a;
                if (aVar == null) {
                }
                coordinatorLayout = this;
                coordinatorLayout.measureChildWithMargins(view, i10, i16, i17, 0);
                int max222 = Math.max(i13, view.getMeasuredWidth() + i22 + ((ViewGroup.MarginLayoutParams) dVar).leftMargin + ((ViewGroup.MarginLayoutParams) dVar).rightMargin);
                int max322 = Math.max(i15, view.getMeasuredHeight() + i23 + ((ViewGroup.MarginLayoutParams) dVar).topMargin + ((ViewGroup.MarginLayoutParams) dVar).bottomMargin);
                i25 = View.combineMeasuredStates(i25, view.getMeasuredState());
                suggestedMinimumWidth = max222;
                suggestedMinimumHeight = max322;
            }
            i24 = i18 + 1;
            paddingLeft = i12;
            paddingRight = i14;
            size3 = i9;
            arrayList3 = arrayList;
        }
        int i32 = i25;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i4, (-16777216) & i32), View.resolveSizeAndState(suggestedMinimumHeight, i5, i32 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f4, float f5, boolean z3) {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.a(0)) {
                    x.a aVar = dVar.f3590a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f4, float f5) {
        x.a aVar;
        int childCount = getChildCount();
        boolean z3 = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.a(0) && (aVar = dVar.f3590a) != null) {
                    z3 |= aVar.i(view);
                }
            }
        }
        return z3;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i4, int i5, int[] iArr) {
        c(view, i4, i5, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i4, int i5, int i6, int i7) {
        e(view, i4, i5, i6, i7, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i4) {
        a(view, view2, i4, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.f3016f);
        SparseArray sparseArray = fVar.h;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            int id = childAt.getId();
            x.a aVar = n(childAt).f3590a;
            if (id != -1 && aVar != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                aVar.m(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable n3;
        f fVar = new f(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            int id = childAt.getId();
            x.a aVar = ((d) childAt.getLayoutParams()).f3590a;
            if (id != -1 && aVar != null && (n3 = aVar.n(childAt)) != null) {
                sparseArray.append(id, n3);
            }
        }
        fVar.h = sparseArray;
        return fVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i4) {
        return f(view, view2, i4, 0);
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
        if (this.f282o == null) {
            z3 = r(motionEvent, 1);
        } else {
            z3 = false;
        }
        x.a aVar = ((d) this.f282o.getLayoutParams()).f3590a;
        if (aVar != null) {
            q4 = aVar.q(this.f282o, motionEvent);
            motionEvent2 = null;
            if (this.f282o != null) {
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
        if (this.f282o != null) {
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
    public final void p(int i4) {
        int i5;
        Rect rect;
        int i6;
        int i7;
        ArrayList arrayList;
        boolean z3;
        boolean z4;
        int width;
        int i8;
        int i9;
        int i10;
        int height;
        int i11;
        int i12;
        int i13;
        ArrayList arrayList2;
        d dVar;
        int i14;
        int i15;
        Rect rect2;
        int i16;
        View view;
        x.a aVar;
        WeakHashMap weakHashMap = j0.f2752a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList3 = this.f275f;
        int size = arrayList3.size();
        Rect g = g();
        Rect g4 = g();
        Rect g5 = g();
        int i17 = 0;
        while (true) {
            c cVar = C;
            if (i17 >= size) {
                Rect rect3 = g5;
                g.setEmpty();
                cVar.c(g);
                g4.setEmpty();
                cVar.c(g4);
                rect3.setEmpty();
                cVar.c(rect3);
                return;
            }
            View view2 = (View) arrayList3.get(i17);
            d dVar2 = (d) view2.getLayoutParams();
            if (i4 == 0 && view2.getVisibility() == 8) {
                arrayList = arrayList3;
                i7 = size;
                rect = g5;
                i5 = i17;
            } else {
                int i18 = 0;
                while (i18 < i17) {
                    if (dVar2.f3598l == ((View) arrayList3.get(i18))) {
                        d dVar3 = (d) view2.getLayoutParams();
                        if (dVar3.f3597k != null) {
                            Rect g6 = g();
                            Rect g7 = g();
                            d dVar4 = dVar2;
                            Rect g8 = g();
                            k(dVar3.f3597k, g6);
                            i(view2, g7, false);
                            int measuredWidth = view2.getMeasuredWidth();
                            View view3 = view2;
                            int measuredHeight = view3.getMeasuredHeight();
                            arrayList2 = arrayList3;
                            dVar = dVar4;
                            i14 = i18;
                            layoutDirection = layoutDirection;
                            i16 = i17;
                            view = view3;
                            l(layoutDirection, g6, g8, dVar3, measuredWidth, measuredHeight);
                            i15 = size;
                            rect2 = g5;
                            boolean z5 = (g8.left == g7.left && g8.top == g7.top) ? false : true;
                            h(dVar3, g8, measuredWidth, measuredHeight);
                            int i19 = g8.left - g7.left;
                            int i20 = g8.top - g7.top;
                            if (i19 != 0) {
                                WeakHashMap weakHashMap2 = j0.f2752a;
                                view.offsetLeftAndRight(i19);
                            }
                            if (i20 != 0) {
                                WeakHashMap weakHashMap3 = j0.f2752a;
                                view.offsetTopAndBottom(i20);
                            }
                            if (z5 && (aVar = dVar3.f3590a) != null) {
                                aVar.d(this, view, dVar3.f3597k);
                            }
                            g6.setEmpty();
                            cVar.c(g6);
                            g7.setEmpty();
                            cVar.c(g7);
                            g8.setEmpty();
                            cVar.c(g8);
                            i18 = i14 + 1;
                            dVar2 = dVar;
                            view2 = view;
                            arrayList3 = arrayList2;
                            size = i15;
                            i17 = i16;
                            g5 = rect2;
                        }
                    }
                    arrayList2 = arrayList3;
                    dVar = dVar2;
                    i14 = i18;
                    i15 = size;
                    rect2 = g5;
                    i16 = i17;
                    view = view2;
                    i18 = i14 + 1;
                    dVar2 = dVar;
                    view2 = view;
                    arrayList3 = arrayList2;
                    size = i15;
                    i17 = i16;
                    g5 = rect2;
                }
                ArrayList arrayList4 = arrayList3;
                d dVar5 = dVar2;
                int i21 = size;
                Rect rect4 = g5;
                i5 = i17;
                View view4 = view2;
                i(view4, g4, true);
                if (dVar5.g != 0 && !g4.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(dVar5.g, layoutDirection);
                    int i22 = absoluteGravity & 112;
                    if (i22 == 48) {
                        g.top = Math.max(g.top, g4.bottom);
                    } else if (i22 == 80) {
                        g.bottom = Math.max(g.bottom, getHeight() - g4.top);
                    }
                    int i23 = absoluteGravity & 7;
                    if (i23 == 3) {
                        g.left = Math.max(g.left, g4.right);
                    } else if (i23 == 5) {
                        g.right = Math.max(g.right, getWidth() - g4.left);
                    }
                }
                if (dVar5.h != 0 && view4.getVisibility() == 0) {
                    WeakHashMap weakHashMap4 = j0.f2752a;
                    if (view4.isLaidOut() && view4.getWidth() > 0 && view4.getHeight() > 0) {
                        d dVar6 = (d) view4.getLayoutParams();
                        x.a aVar2 = dVar6.f3590a;
                        Rect g9 = g();
                        Rect g10 = g();
                        g10.set(view4.getLeft(), view4.getTop(), view4.getRight(), view4.getBottom());
                        if (aVar2 == null || !aVar2.a(view4)) {
                            g9.set(g10);
                        } else if (!g10.contains(g9)) {
                            throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + g9.toShortString() + " | Bounds:" + g10.toShortString());
                        }
                        g10.setEmpty();
                        cVar.c(g10);
                        if (g9.isEmpty()) {
                            g9.setEmpty();
                            cVar.c(g9);
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(dVar6.h, layoutDirection);
                            if ((absoluteGravity2 & 48) != 48 || (i12 = (g9.top - ((ViewGroup.MarginLayoutParams) dVar6).topMargin) - dVar6.f3596j) >= (i13 = g.top)) {
                                z3 = false;
                            } else {
                                v(view4, i13 - i12);
                                z3 = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - g9.bottom) - ((ViewGroup.MarginLayoutParams) dVar6).bottomMargin) + dVar6.f3596j) < (i11 = g.bottom)) {
                                v(view4, height - i11);
                                z3 = true;
                            }
                            if (!z3) {
                                v(view4, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i9 = (g9.left - ((ViewGroup.MarginLayoutParams) dVar6).leftMargin) - dVar6.f3595i) >= (i10 = g.left)) {
                                z4 = false;
                            } else {
                                u(view4, i10 - i9);
                                z4 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - g9.right) - ((ViewGroup.MarginLayoutParams) dVar6).rightMargin) + dVar6.f3595i) < (i8 = g.right)) {
                                u(view4, width - i8);
                                z4 = true;
                            }
                            if (!z4) {
                                u(view4, 0);
                            }
                            g9.setEmpty();
                            cVar.c(g9);
                            if (i4 == 2) {
                                rect = rect4;
                                rect.set(((d) view4.getLayoutParams()).f3601o);
                                if (rect.equals(g4)) {
                                    arrayList = arrayList4;
                                    i7 = i21;
                                } else {
                                    ((d) view4.getLayoutParams()).f3601o.set(g4);
                                }
                            } else {
                                rect = rect4;
                            }
                            i6 = i5 + 1;
                            i7 = i21;
                            while (true) {
                                arrayList = arrayList4;
                                if (i6 >= i7) {
                                    View view5 = (View) arrayList.get(i6);
                                    x.a aVar3 = ((d) view5.getLayoutParams()).f3590a;
                                    if (aVar3 != null) {
                                        aVar3.b(view5);
                                    }
                                    i6++;
                                    arrayList4 = arrayList;
                                }
                            }
                        }
                    }
                }
                if (i4 == 2) {
                }
                i6 = i5 + 1;
                i7 = i21;
                while (true) {
                    arrayList = arrayList4;
                    if (i6 >= i7) {
                        break;
                    }
                    i6++;
                    arrayList4 = arrayList;
                }
            }
            i17 = i5 + 1;
            size = i7;
            g5 = rect;
            arrayList3 = arrayList;
        }
    }

    public final void q(View view, int i4) {
        Rect g;
        Rect g4;
        d dVar = (d) view.getLayoutParams();
        View view2 = dVar.f3597k;
        if (view2 == null && dVar.f3594f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        c cVar = C;
        if (view2 != null) {
            g = g();
            g4 = g();
            try {
                k(view2, g);
                d dVar2 = (d) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                l(i4, g, g4, dVar2, measuredWidth, measuredHeight);
                h(dVar2, g4, measuredWidth, measuredHeight);
                view.layout(g4.left, g4.top, g4.right, g4.bottom);
                return;
            } finally {
                g.setEmpty();
                cVar.c(g);
                g4.setEmpty();
                cVar.c(g4);
            }
        }
        int i5 = dVar.f3593e;
        if (i5 < 0) {
            d dVar3 = (d) view.getLayoutParams();
            g = g();
            g.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) dVar3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) dVar3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) dVar3).bottomMargin);
            if (this.f286s != null) {
                WeakHashMap weakHashMap = j0.f2752a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    g.left = this.f286s.b() + g.left;
                    g.top = this.f286s.d() + g.top;
                    g.right -= this.f286s.c();
                    g.bottom -= this.f286s.a();
                }
            }
            g4 = g();
            int i6 = dVar3.c;
            if ((i6 & 7) == 0) {
                i6 |= 8388611;
            }
            if ((i6 & 112) == 0) {
                i6 |= 48;
            }
            Gravity.apply(i6, view.getMeasuredWidth(), view.getMeasuredHeight(), g, g4, i4);
            view.layout(g4.left, g4.top, g4.right, g4.bottom);
            return;
        }
        d dVar4 = (d) view.getLayoutParams();
        int i7 = dVar4.c;
        if (i7 == 0) {
            i7 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i7, i4);
        int i8 = absoluteGravity & 7;
        int i9 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i4 == 1) {
            i5 = width - i5;
        }
        int m4 = m(i5) - measuredWidth2;
        if (i8 == 1) {
            m4 += measuredWidth2 / 2;
        } else if (i8 == 5) {
            m4 += measuredWidth2;
        }
        int i10 = i9 != 16 ? i9 != 80 ? 0 : measuredHeight2 : measuredHeight2 / 2;
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar4).leftMargin, Math.min(m4, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) dVar4).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) dVar4).topMargin, Math.min(i10, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) dVar4).bottomMargin));
        view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
    }

    public final boolean r(MotionEvent motionEvent, int i4) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.h;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i5 = childCount - 1; i5 >= 0; i5--) {
            arrayList.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i5) : i5));
        }
        q qVar = B;
        if (qVar != null) {
            Collections.sort(arrayList, qVar);
        }
        int size = arrayList.size();
        MotionEvent motionEvent2 = null;
        boolean z3 = false;
        for (int i6 = 0; i6 < size; i6++) {
            View view = (View) arrayList.get(i6);
            x.a aVar = ((d) view.getLayoutParams()).f3590a;
            if (z3 && actionMasked != 0) {
                if (aVar != null) {
                    if (motionEvent2 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i4 == 0) {
                        aVar.f(this, view, motionEvent2);
                    } else if (i4 == 1) {
                        aVar.q(view, motionEvent2);
                    }
                }
            } else if (!z3 && aVar != null) {
                if (i4 == 0) {
                    z3 = aVar.f(this, view, motionEvent);
                } else if (i4 == 1) {
                    z3 = aVar.q(view, motionEvent);
                }
                if (z3) {
                    this.f282o = view;
                }
            }
        }
        arrayList.clear();
        return z3;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z3) {
        x.a aVar = ((d) view.getLayoutParams()).f3590a;
        if (aVar == null || !aVar.l(this, view, rect)) {
            return super.requestChildRectangleOnScreen(view, rect, z3);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z3) {
        super.requestDisallowInterceptTouchEvent(z3);
        if (!z3 || this.f279l) {
            return;
        }
        t(false);
        this.f279l = true;
    }

    public final void s() {
        ArrayList arrayList = this.f275f;
        arrayList.clear();
        w wVar = this.g;
        j jVar = (j) wVar.g;
        j0.b bVar = (j0.b) wVar.f368f;
        j jVar2 = (j) wVar.g;
        int i4 = jVar.h;
        for (int i5 = 0; i5 < i4; i5++) {
            ArrayList arrayList2 = (ArrayList) jVar.i(i5);
            if (arrayList2 != null) {
                arrayList2.clear();
                bVar.c(arrayList2);
            }
        }
        jVar.clear();
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            d n3 = n(childAt);
            int i7 = n3.f3594f;
            if (i7 == -1) {
                n3.f3598l = null;
                n3.f3597k = null;
            } else {
                View view = n3.f3597k;
                if (view != null && view.getId() == i7) {
                    View view2 = n3.f3597k;
                    for (ViewParent parent = view2.getParent(); parent != this; parent = parent.getParent()) {
                        if (parent == null || parent == childAt) {
                            n3.f3598l = null;
                            n3.f3597k = null;
                        } else {
                            if (parent instanceof View) {
                                view2 = parent;
                            }
                        }
                    }
                    n3.f3598l = view2;
                }
                View findViewById = findViewById(i7);
                n3.f3597k = findViewById;
                if (findViewById == null) {
                    if (!isInEditMode()) {
                        throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + getResources().getResourceName(i7) + " to anchor view " + childAt);
                    }
                    n3.f3598l = null;
                    n3.f3597k = null;
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
                            n3.f3598l = null;
                            n3.f3597k = null;
                        }
                    }
                    n3.f3598l = findViewById;
                } else {
                    if (!isInEditMode()) {
                        throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                    }
                    n3.f3598l = null;
                    n3.f3597k = null;
                }
            }
            if (!jVar2.containsKey(childAt)) {
                jVar2.put(childAt, null);
            }
            for (int i8 = 0; i8 < childCount; i8++) {
                if (i8 != i6) {
                    View childAt2 = getChildAt(i8);
                    if (childAt2 != n3.f3598l) {
                        WeakHashMap weakHashMap = j0.f2752a;
                        int layoutDirection = getLayoutDirection();
                        int absoluteGravity = Gravity.getAbsoluteGravity(((d) childAt2.getLayoutParams()).g, layoutDirection);
                        if (absoluteGravity == 0 || (Gravity.getAbsoluteGravity(n3.h, layoutDirection) & absoluteGravity) != absoluteGravity) {
                            x.a aVar = n3.f3590a;
                            if (aVar != null) {
                                aVar.b(childAt);
                            }
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
        ArrayList arrayList4 = (ArrayList) wVar.h;
        arrayList4.clear();
        HashSet hashSet = (HashSet) wVar.f369i;
        hashSet.clear();
        int i9 = jVar2.h;
        for (int i10 = 0; i10 < i9; i10++) {
            wVar.c(jVar2.f(i10), arrayList4, hashSet);
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
        this.f289v = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f288u;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f288u = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f288u.setState(getDrawableState());
                }
                Drawable drawable3 = this.f288u;
                WeakHashMap weakHashMap = j0.f2752a;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.f288u.setVisible(getVisibility() == 0, false);
                this.f288u.setCallback(this);
            }
            WeakHashMap weakHashMap2 = j0.f2752a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i4) {
        setStatusBarBackground(new ColorDrawable(i4));
    }

    public void setStatusBarBackgroundResource(int i4) {
        setStatusBarBackground(i4 != 0 ? getContext().getDrawable(i4) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        super.setVisibility(i4);
        boolean z3 = i4 == 0;
        Drawable drawable = this.f288u;
        if (drawable == null || drawable.isVisible() == z3) {
            return;
        }
        this.f288u.setVisible(z3, false);
    }

    public final void t(boolean z3) {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            x.a aVar = ((d) childAt.getLayoutParams()).f3590a;
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
        for (int i5 = 0; i5 < childCount; i5++) {
            ((d) getChildAt(i5).getLayoutParams()).getClass();
        }
        this.f282o = null;
        this.f279l = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f288u;
    }

    public final void w() {
        WeakHashMap weakHashMap = j0.f2752a;
        if (!getFitsSystemWindows()) {
            b0.j(this, null);
            return;
        }
        if (this.f290w == null) {
            this.f290w = new a(this);
        }
        b0.j(this, this.f290w);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d ? new d((d) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new d((ViewGroup.MarginLayoutParams) layoutParams) : new d(layoutParams);
    }
}
