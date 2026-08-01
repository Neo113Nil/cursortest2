package androidx.coordinatorlayout.widget;

import C.a;
import F0.n;
import L.b;
import L.c;
import M.C0015p;
import M.D;
import M.F;
import M.InterfaceC0013n;
import M.InterfaceC0014o;
import M.Q;
import M.v0;
import T0.g;
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
import com.winfour.neondrop.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.WeakHashMap;
import l.C0176a0;
import q.k;
import y.AbstractC0313a;
import z.AbstractC0318a;
import z.AbstractC0324g;
import z.C0321d;
import z.C0323f;
import z.InterfaceC0319b;
import z.ViewGroupOnHierarchyChangeListenerC0320c;
import z.ViewTreeObserverOnPreDrawListenerC0322e;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC0013n, InterfaceC0014o {

    /* renamed from: t, reason: collision with root package name */
    public static final String f1473t;

    /* renamed from: u, reason: collision with root package name */
    public static final Class[] f1474u;

    /* renamed from: v, reason: collision with root package name */
    public static final ThreadLocal f1475v;

    /* renamed from: w, reason: collision with root package name */
    public static final n f1476w;

    /* renamed from: x, reason: collision with root package name */
    public static final c f1477x;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1478a;

    /* renamed from: b, reason: collision with root package name */
    public final g f1479b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1480c;
    public final ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f1481e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f1482f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1483g;
    public boolean h;
    public final int[] i;

    /* renamed from: j, reason: collision with root package name */
    public View f1484j;

    /* renamed from: k, reason: collision with root package name */
    public View f1485k;

    /* renamed from: l, reason: collision with root package name */
    public ViewTreeObserverOnPreDrawListenerC0322e f1486l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1487m;

    /* renamed from: n, reason: collision with root package name */
    public v0 f1488n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1489o;

    /* renamed from: p, reason: collision with root package name */
    public Drawable f1490p;

    /* renamed from: q, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f1491q;

    /* renamed from: r, reason: collision with root package name */
    public C0176a0 f1492r;

    /* renamed from: s, reason: collision with root package name */
    public final C0015p f1493s;

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        f1473t = r02 != null ? r02.getName() : null;
        f1476w = new n(3);
        f1474u = new Class[]{Context.class, AttributeSet.class};
        f1475v = new ThreadLocal();
        f1477x = new c();
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f1478a = new ArrayList();
        this.f1479b = new g(8);
        this.f1480c = new ArrayList();
        this.d = new ArrayList();
        this.f1481e = new int[2];
        this.f1482f = new int[2];
        this.f1493s = new C0015p();
        int[] iArr = AbstractC0313a.f4185a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.i = intArray;
            float f2 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i = 0; i < length; i++) {
                this.i[i] = (int) (r2[i] * f2);
            }
        }
        this.f1490p = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        w();
        super.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC0320c(this));
        WeakHashMap weakHashMap = Q.f513a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect g() {
        Rect rect = (Rect) f1477x.a();
        return rect == null ? new Rect() : rect;
    }

    public static void l(int i, Rect rect, Rect rect2, C0321d c0321d, int i2, int i3) {
        int i4 = c0321d.f4306c;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = c0321d.d;
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

    public static C0321d n(View view) {
        C0321d c0321d = (C0321d) view.getLayoutParams();
        if (!c0321d.f4305b) {
            InterfaceC0319b interfaceC0319b = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                interfaceC0319b = (InterfaceC0319b) cls.getAnnotation(InterfaceC0319b.class);
                if (interfaceC0319b != null) {
                    break;
                }
            }
            if (interfaceC0319b != null) {
                try {
                    AbstractC0318a abstractC0318a = (AbstractC0318a) interfaceC0319b.value().getDeclaredConstructor(null).newInstance(null);
                    AbstractC0318a abstractC0318a2 = c0321d.f4304a;
                    if (abstractC0318a2 != abstractC0318a) {
                        if (abstractC0318a2 != null) {
                            abstractC0318a2.e();
                        }
                        c0321d.f4304a = abstractC0318a;
                        c0321d.f4305b = true;
                        if (abstractC0318a != null) {
                            abstractC0318a.c(c0321d);
                        }
                    }
                } catch (Exception e2) {
                    Log.e("CoordinatorLayout", "Default behavior class " + interfaceC0319b.value().getName() + " could not be instantiated. Did you forget a default constructor?", e2);
                }
            }
            c0321d.f4305b = true;
        }
        return c0321d;
    }

    public static void u(View view, int i) {
        C0321d c0321d = (C0321d) view.getLayoutParams();
        int i2 = c0321d.i;
        if (i2 != i) {
            WeakHashMap weakHashMap = Q.f513a;
            view.offsetLeftAndRight(i - i2);
            c0321d.i = i;
        }
    }

    public static void v(View view, int i) {
        C0321d c0321d = (C0321d) view.getLayoutParams();
        int i2 = c0321d.f4310j;
        if (i2 != i) {
            WeakHashMap weakHashMap = Q.f513a;
            view.offsetTopAndBottom(i - i2);
            c0321d.f4310j = i;
        }
    }

    @Override // M.InterfaceC0013n
    public final void a(View view, View view2, int i, int i2) {
        C0015p c0015p = this.f1493s;
        if (i2 == 1) {
            c0015p.f583b = i;
        } else {
            c0015p.f582a = i;
        }
        this.f1485k = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((C0321d) getChildAt(i3).getLayoutParams()).getClass();
        }
    }

    @Override // M.InterfaceC0014o
    public final void b(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        AbstractC0318a abstractC0318a;
        int childCount = getChildCount();
        boolean z2 = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C0321d c0321d = (C0321d) childAt.getLayoutParams();
                if (c0321d.a(i5) && (abstractC0318a = c0321d.f4304a) != null) {
                    int[] iArr2 = this.f1481e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC0318a.k(this, childAt, i2, i3, i4, iArr2);
                    i6 = i3 > 0 ? Math.max(i6, iArr2[0]) : Math.min(i6, iArr2[0]);
                    i7 = i4 > 0 ? Math.max(i7, iArr2[1]) : Math.min(i7, iArr2[1]);
                    z2 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i7;
        if (z2) {
            p(1);
        }
    }

    @Override // M.InterfaceC0013n
    public final void c(View view, int i, int i2, int i3, int i4, int i5) {
        b(view, i, i2, i3, i4, 0, this.f1482f);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0321d) && super.checkLayoutParams(layoutParams);
    }

    @Override // M.InterfaceC0013n
    public final void d(View view, int i) {
        C0015p c0015p = this.f1493s;
        if (i == 1) {
            c0015p.f583b = 0;
        } else {
            c0015p.f582a = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0321d c0321d = (C0321d) childAt.getLayoutParams();
            if (c0321d.a(i)) {
                AbstractC0318a abstractC0318a = c0321d.f4304a;
                if (abstractC0318a != null) {
                    abstractC0318a.p(childAt, view, i);
                }
                if (i == 0) {
                    c0321d.f4313m = false;
                } else if (i == 1) {
                    c0321d.f4314n = false;
                }
            }
        }
        this.f1485k = null;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        AbstractC0318a abstractC0318a = ((C0321d) view.getLayoutParams()).f4304a;
        if (abstractC0318a != null) {
            abstractC0318a.getClass();
        }
        return super.drawChild(canvas, view, j2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1490p;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // M.InterfaceC0013n
    public final void e(View view, int i, int i2, int[] iArr, int i3) {
        AbstractC0318a abstractC0318a;
        int childCount = getChildCount();
        boolean z2 = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C0321d c0321d = (C0321d) childAt.getLayoutParams();
                if (c0321d.a(i3) && (abstractC0318a = c0321d.f4304a) != null) {
                    int[] iArr2 = this.f1481e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC0318a.j(this, childAt, view, i, i2, iArr2, i3);
                    i4 = i > 0 ? Math.max(i4, iArr2[0]) : Math.min(i4, iArr2[0]);
                    i5 = i2 > 0 ? Math.max(i5, iArr2[1]) : Math.min(i5, iArr2[1]);
                    z2 = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z2) {
            p(1);
        }
    }

    @Override // M.InterfaceC0013n
    public final boolean f(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C0321d c0321d = (C0321d) childAt.getLayoutParams();
                AbstractC0318a abstractC0318a = c0321d.f4304a;
                if (abstractC0318a != null) {
                    boolean o2 = abstractC0318a.o(childAt, i, i2);
                    z2 |= o2;
                    if (i2 == 0) {
                        c0321d.f4313m = o2;
                    } else if (i2 == 1) {
                        c0321d.f4314n = o2;
                    }
                } else if (i2 == 0) {
                    c0321d.f4313m = false;
                } else if (i2 == 1) {
                    c0321d.f4314n = false;
                }
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0321d();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0321d(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        s();
        return Collections.unmodifiableList(this.f1478a);
    }

    public final v0 getLastWindowInsets() {
        return this.f1488n;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0015p c0015p = this.f1493s;
        return c0015p.f583b | c0015p.f582a;
    }

    public Drawable getStatusBarBackground() {
        return this.f1490p;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(C0321d c0321d, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0321d).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) c0321d).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0321d).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) c0321d).bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    public final void i(View view, Rect rect, boolean z2) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z2) {
            k(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final ArrayList j(View view) {
        k kVar = (k) this.f1479b.f825b;
        int i = kVar.f3372c;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) kVar.j(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(kVar.h(i2));
            }
        }
        ArrayList arrayList3 = this.d;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void k(View view, Rect rect) {
        ThreadLocal threadLocal = AbstractC0324g.f4318a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = AbstractC0324g.f4318a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        AbstractC0324g.a(this, view, matrix);
        ThreadLocal threadLocal3 = AbstractC0324g.f4319b;
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
        int[] iArr = this.i;
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

    public final boolean o(View view, int i, int i2) {
        c cVar = f1477x;
        Rect g2 = g();
        k(view, g2);
        try {
            return g2.contains(i, i2);
        } finally {
            g2.setEmpty();
            cVar.c(g2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t(false);
        if (this.f1487m) {
            if (this.f1486l == null) {
                this.f1486l = new ViewTreeObserverOnPreDrawListenerC0322e(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f1486l);
        }
        if (this.f1488n == null) {
            WeakHashMap weakHashMap = Q.f513a;
            if (getFitsSystemWindows()) {
                D.c(this);
            }
        }
        this.h = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t(false);
        if (this.f1487m && this.f1486l != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f1486l);
        }
        View view = this.f1485k;
        if (view != null) {
            d(view, 0);
        }
        this.h = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f1489o || this.f1490p == null) {
            return;
        }
        v0 v0Var = this.f1488n;
        int d = v0Var != null ? v0Var.d() : 0;
        if (d > 0) {
            this.f1490p.setBounds(0, 0, getWidth(), d);
            this.f1490p.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            t(true);
        }
        boolean r2 = r(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            t(true);
        }
        return r2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        AbstractC0318a abstractC0318a;
        WeakHashMap weakHashMap = Q.f513a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f1478a;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            if (view.getVisibility() != 8 && ((abstractC0318a = ((C0321d) view.getLayoutParams()).f4304a) == null || !abstractC0318a.g(this, view, layoutDirection))) {
                q(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0186, code lost:
    
        if (r0.h(r32, r20, r25, r8, r26) == false) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0189  */
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
        AbstractC0318a abstractC0318a;
        int i9;
        ArrayList arrayList;
        int i10;
        boolean z3;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z4;
        int max;
        s();
        int childCount = getChildCount();
        int i17 = 0;
        loop0: while (true) {
            if (i17 >= childCount) {
                z2 = false;
                break;
            }
            View childAt = getChildAt(i17);
            k kVar = (k) this.f1479b.f825b;
            int i18 = kVar.f3372c;
            for (int i19 = 0; i19 < i18; i19++) {
                ArrayList arrayList2 = (ArrayList) kVar.j(i19);
                if (arrayList2 != null && arrayList2.contains(childAt)) {
                    z2 = true;
                    break loop0;
                }
            }
            i17++;
        }
        if (z2 != this.f1487m) {
            if (z2) {
                if (this.h) {
                    if (this.f1486l == null) {
                        this.f1486l = new ViewTreeObserverOnPreDrawListenerC0322e(this);
                    }
                    getViewTreeObserver().addOnPreDrawListener(this.f1486l);
                }
                this.f1487m = true;
            } else {
                if (this.h && this.f1486l != null) {
                    getViewTreeObserver().removeOnPreDrawListener(this.f1486l);
                }
                this.f1487m = false;
            }
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = Q.f513a;
        int layoutDirection = getLayoutDirection();
        boolean z5 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i20 = paddingLeft + paddingRight;
        int i21 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        boolean z6 = this.f1488n != null && getFitsSystemWindows();
        ArrayList arrayList3 = this.f1478a;
        int size3 = arrayList3.size();
        int i22 = suggestedMinimumWidth;
        int i23 = suggestedMinimumHeight;
        int i24 = 0;
        int i25 = 0;
        while (i25 < size3) {
            View view = (View) arrayList3.get(i25);
            if (view.getVisibility() == 8) {
                i14 = i25;
                i9 = size3;
                arrayList = arrayList3;
                i12 = paddingLeft;
                i15 = paddingRight;
                i10 = layoutDirection;
                z4 = true;
                z3 = false;
            } else {
                C0321d c0321d = (C0321d) view.getLayoutParams();
                int i26 = c0321d.f4307e;
                if (i26 < 0 || mode == 0) {
                    i3 = i24;
                    i4 = i25;
                } else {
                    int m2 = m(i26);
                    i3 = i24;
                    int i27 = c0321d.f4306c;
                    if (i27 == 0) {
                        i27 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i27, layoutDirection) & 7;
                    i4 = i25;
                    if ((absoluteGravity == 3 && !z5) || (absoluteGravity == 5 && z5)) {
                        max = Math.max(0, (size - paddingRight) - m2);
                    } else if ((absoluteGravity == 5 && !z5) || (absoluteGravity == 3 && z5)) {
                        max = Math.max(0, m2 - paddingLeft);
                    }
                    i5 = max;
                    if (z6 || view.getFitsSystemWindows()) {
                        i6 = i23;
                        i7 = i;
                        i8 = i2;
                    } else {
                        int c2 = this.f1488n.c() + this.f1488n.b();
                        i6 = i23;
                        int a2 = this.f1488n.a() + this.f1488n.d();
                        i7 = View.MeasureSpec.makeMeasureSpec(size - c2, mode);
                        i8 = View.MeasureSpec.makeMeasureSpec(size2 - a2, mode2);
                    }
                    abstractC0318a = c0321d.f4304a;
                    if (abstractC0318a == null) {
                        int i28 = i3;
                        i14 = i4;
                        z3 = false;
                        i12 = paddingLeft;
                        i13 = i28;
                        int i29 = i6;
                        i15 = paddingRight;
                        i16 = i29;
                        i10 = layoutDirection;
                        i11 = i22;
                        i9 = size3;
                        arrayList = arrayList3;
                    } else {
                        i9 = size3;
                        arrayList = arrayList3;
                        i10 = layoutDirection;
                        z3 = false;
                        i11 = i22;
                        int i30 = i4;
                        i12 = paddingLeft;
                        i13 = i3;
                        i14 = i30;
                        int i31 = i6;
                        i15 = paddingRight;
                        i16 = i31;
                    }
                    measureChildWithMargins(view, i7, i5, i8, 0);
                    int max2 = Math.max(i11, view.getMeasuredWidth() + i20 + ((ViewGroup.MarginLayoutParams) c0321d).leftMargin + ((ViewGroup.MarginLayoutParams) c0321d).rightMargin);
                    int max3 = Math.max(i16, view.getMeasuredHeight() + i21 + ((ViewGroup.MarginLayoutParams) c0321d).topMargin + ((ViewGroup.MarginLayoutParams) c0321d).bottomMargin);
                    i22 = max2;
                    i24 = View.combineMeasuredStates(i13, view.getMeasuredState());
                    i23 = max3;
                    z4 = true;
                }
                i5 = 0;
                if (z6) {
                }
                i6 = i23;
                i7 = i;
                i8 = i2;
                abstractC0318a = c0321d.f4304a;
                if (abstractC0318a == null) {
                }
                measureChildWithMargins(view, i7, i5, i8, 0);
                int max22 = Math.max(i11, view.getMeasuredWidth() + i20 + ((ViewGroup.MarginLayoutParams) c0321d).leftMargin + ((ViewGroup.MarginLayoutParams) c0321d).rightMargin);
                int max32 = Math.max(i16, view.getMeasuredHeight() + i21 + ((ViewGroup.MarginLayoutParams) c0321d).topMargin + ((ViewGroup.MarginLayoutParams) c0321d).bottomMargin);
                i22 = max22;
                i24 = View.combineMeasuredStates(i13, view.getMeasuredState());
                i23 = max32;
                z4 = true;
            }
            i25 = i14 + 1;
            paddingLeft = i12;
            paddingRight = i15;
            layoutDirection = i10;
            size3 = i9;
            arrayList3 = arrayList;
        }
        int i32 = i24;
        setMeasuredDimension(View.resolveSizeAndState(i22, i, (-16777216) & i32), View.resolveSizeAndState(i23, i2, i32 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0321d c0321d = (C0321d) childAt.getLayoutParams();
                if (c0321d.a(0)) {
                    AbstractC0318a abstractC0318a = c0321d.f4304a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        AbstractC0318a abstractC0318a;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0321d c0321d = (C0321d) childAt.getLayoutParams();
                if (c0321d.a(0) && (abstractC0318a = c0321d.f4304a) != null) {
                    z2 |= abstractC0318a.i(view);
                }
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        e(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        c(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        a(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C0323f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0323f c0323f = (C0323f) parcelable;
        super.onRestoreInstanceState(c0323f.f802a);
        SparseArray sparseArray = c0323f.f4317c;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC0318a abstractC0318a = n(childAt).f4304a;
            if (id != -1 && abstractC0318a != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                abstractC0318a.m(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable n2;
        C0323f c0323f = new C0323f(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC0318a abstractC0318a = ((C0321d) childAt.getLayoutParams()).f4304a;
            if (id != -1 && abstractC0318a != null && (n2 = abstractC0318a.n(childAt)) != null) {
                sparseArray.append(id, n2);
            }
        }
        c0323f.f4317c = sparseArray;
        return c0323f;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return f(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        d(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r3 != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean q2;
        MotionEvent motionEvent2;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f1484j == null) {
            z2 = r(motionEvent, 1);
        } else {
            z2 = false;
        }
        AbstractC0318a abstractC0318a = ((C0321d) this.f1484j.getLayoutParams()).f4304a;
        if (abstractC0318a != null) {
            q2 = abstractC0318a.q(this.f1484j, motionEvent);
            motionEvent2 = null;
            if (this.f1484j != null) {
                q2 |= super.onTouchEvent(motionEvent);
            } else if (z2) {
                long uptimeMillis = SystemClock.uptimeMillis();
                motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEvent2);
            }
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            if (actionMasked != 1 || actionMasked == 3) {
                t(false);
            }
            return q2;
        }
        q2 = false;
        motionEvent2 = null;
        if (this.f1484j != null) {
        }
        if (motionEvent2 != null) {
        }
        if (actionMasked != 1) {
        }
        t(false);
        return q2;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x004b A[EDGE_INSN: B:114:0x004b->B:9:0x004b BREAK  A[LOOP:2: B:106:0x02db->B:112:0x02f2], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(int i) {
        int i2;
        Rect rect;
        int i3;
        Rect rect2;
        int i4;
        Rect rect3;
        int i5;
        int i6;
        ArrayList arrayList;
        boolean z2;
        int i7;
        int i8;
        int width;
        int i9;
        int i10;
        int i11;
        int height;
        int i12;
        int i13;
        int i14;
        C0321d c0321d;
        int i15;
        c cVar;
        int i16;
        Rect rect4;
        Rect rect5;
        Rect rect6;
        ArrayList arrayList2;
        int i17;
        AbstractC0318a abstractC0318a;
        int i18 = i;
        WeakHashMap weakHashMap = Q.f513a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList3 = this.f1478a;
        int size = arrayList3.size();
        Rect g2 = g();
        Rect g3 = g();
        Rect g4 = g();
        int i19 = 0;
        while (true) {
            c cVar2 = f1477x;
            if (i19 >= size) {
                Rect rect7 = g4;
                Rect rect8 = g3;
                Rect rect9 = g2;
                rect9.setEmpty();
                cVar2.c(rect9);
                rect8.setEmpty();
                cVar2.c(rect8);
                rect7.setEmpty();
                cVar2.c(rect7);
                return;
            }
            View view = (View) arrayList3.get(i19);
            C0321d c0321d2 = (C0321d) view.getLayoutParams();
            if (i18 == 0 && view.getVisibility() == 8) {
                i4 = i18;
                i3 = layoutDirection;
                i2 = i19;
                rect3 = g4;
                rect = g3;
                rect2 = g2;
                arrayList = arrayList3;
                i6 = size;
            } else {
                int i20 = 0;
                while (i20 < i19) {
                    if (c0321d2.f4312l == ((View) arrayList3.get(i20))) {
                        C0321d c0321d3 = (C0321d) view.getLayoutParams();
                        if (c0321d3.f4311k != null) {
                            Rect g5 = g();
                            Rect g6 = g();
                            arrayList2 = arrayList3;
                            Rect g7 = g();
                            k(c0321d3.f4311k, g5);
                            i(view, g6, false);
                            i17 = size;
                            int measuredWidth = view.getMeasuredWidth();
                            int measuredHeight = view.getMeasuredHeight();
                            c0321d = c0321d2;
                            cVar = cVar2;
                            i16 = i19;
                            i15 = layoutDirection;
                            rect4 = g4;
                            rect5 = g3;
                            rect6 = g2;
                            l(layoutDirection, g5, g7, c0321d3, measuredWidth, measuredHeight);
                            boolean z3 = (g7.left == g6.left && g7.top == g6.top) ? false : true;
                            h(c0321d3, g7, measuredWidth, measuredHeight);
                            int i21 = g7.left - g6.left;
                            int i22 = g7.top - g6.top;
                            if (i21 != 0) {
                                WeakHashMap weakHashMap2 = Q.f513a;
                                view.offsetLeftAndRight(i21);
                            }
                            if (i22 != 0) {
                                WeakHashMap weakHashMap3 = Q.f513a;
                                view.offsetTopAndBottom(i22);
                            }
                            if (z3 && (abstractC0318a = c0321d3.f4304a) != null) {
                                abstractC0318a.d(this, view, c0321d3.f4311k);
                            }
                            g5.setEmpty();
                            cVar.c(g5);
                            g6.setEmpty();
                            cVar.c(g6);
                            g7.setEmpty();
                            cVar.c(g7);
                            i20++;
                            cVar2 = cVar;
                            size = i17;
                            arrayList3 = arrayList2;
                            layoutDirection = i15;
                            c0321d2 = c0321d;
                            i19 = i16;
                            g4 = rect4;
                            g3 = rect5;
                            g2 = rect6;
                        }
                    }
                    c0321d = c0321d2;
                    i15 = layoutDirection;
                    cVar = cVar2;
                    i16 = i19;
                    rect4 = g4;
                    rect5 = g3;
                    rect6 = g2;
                    arrayList2 = arrayList3;
                    i17 = size;
                    i20++;
                    cVar2 = cVar;
                    size = i17;
                    arrayList3 = arrayList2;
                    layoutDirection = i15;
                    c0321d2 = c0321d;
                    i19 = i16;
                    g4 = rect4;
                    g3 = rect5;
                    g2 = rect6;
                }
                C0321d c0321d4 = c0321d2;
                int i23 = layoutDirection;
                b bVar = cVar2;
                i2 = i19;
                Rect rect10 = g4;
                rect = g3;
                Rect rect11 = g2;
                ArrayList arrayList4 = arrayList3;
                int i24 = size;
                i(view, rect, true);
                if (c0321d4.f4309g == 0 || rect.isEmpty()) {
                    i3 = i23;
                    rect2 = rect11;
                } else {
                    i3 = i23;
                    int absoluteGravity = Gravity.getAbsoluteGravity(c0321d4.f4309g, i3);
                    int i25 = absoluteGravity & 112;
                    if (i25 == 48) {
                        rect2 = rect11;
                        rect2.top = Math.max(rect2.top, rect.bottom);
                    } else if (i25 != 80) {
                        rect2 = rect11;
                    } else {
                        rect2 = rect11;
                        rect2.bottom = Math.max(rect2.bottom, getHeight() - rect.top);
                    }
                    int i26 = absoluteGravity & 7;
                    if (i26 == 3) {
                        rect2.left = Math.max(rect2.left, rect.right);
                    } else if (i26 == 5) {
                        rect2.right = Math.max(rect2.right, getWidth() - rect.left);
                    }
                }
                if (c0321d4.h != 0 && view.getVisibility() == 0) {
                    WeakHashMap weakHashMap4 = Q.f513a;
                    if (view.isLaidOut() && view.getWidth() > 0 && view.getHeight() > 0) {
                        C0321d c0321d5 = (C0321d) view.getLayoutParams();
                        AbstractC0318a abstractC0318a2 = c0321d5.f4304a;
                        Rect g8 = g();
                        Rect g9 = g();
                        g9.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        if (abstractC0318a2 == null || !abstractC0318a2.a(view)) {
                            g8.set(g9);
                        } else if (!g9.contains(g8)) {
                            throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + g8.toShortString() + " | Bounds:" + g9.toShortString());
                        }
                        g9.setEmpty();
                        bVar.c(g9);
                        if (!g8.isEmpty()) {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(c0321d5.h, i3);
                            if ((absoluteGravity2 & 48) != 48 || (i13 = (g8.top - ((ViewGroup.MarginLayoutParams) c0321d5).topMargin) - c0321d5.f4310j) >= (i14 = rect2.top)) {
                                z2 = false;
                            } else {
                                v(view, i14 - i13);
                                z2 = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - g8.bottom) - ((ViewGroup.MarginLayoutParams) c0321d5).bottomMargin) + c0321d5.f4310j) < (i12 = rect2.bottom)) {
                                v(view, height - i12);
                                z2 = true;
                            }
                            if (z2) {
                                i7 = 0;
                            } else {
                                i7 = 0;
                                v(view, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i10 = (g8.left - ((ViewGroup.MarginLayoutParams) c0321d5).leftMargin) - c0321d5.i) >= (i11 = rect2.left)) {
                                i8 = i7;
                            } else {
                                u(view, i11 - i10);
                                i8 = 1;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - g8.right) - ((ViewGroup.MarginLayoutParams) c0321d5).rightMargin) + c0321d5.i) < (i9 = rect2.right)) {
                                u(view, width - i9);
                                i8 = 1;
                            }
                            if (i8 == 0) {
                                u(view, i7);
                            }
                            g8.setEmpty();
                            bVar.c(g8);
                            i4 = i;
                            if (i4 == 2) {
                                rect3 = rect10;
                                rect3.set(((C0321d) view.getLayoutParams()).f4315o);
                                if (rect3.equals(rect)) {
                                    i6 = i24;
                                    arrayList = arrayList4;
                                } else {
                                    ((C0321d) view.getLayoutParams()).f4315o.set(rect);
                                }
                            } else {
                                rect3 = rect10;
                            }
                            i5 = i2 + 1;
                            i6 = i24;
                            while (true) {
                                arrayList = arrayList4;
                                if (i5 < i6) {
                                    break;
                                }
                                View view2 = (View) arrayList.get(i5);
                                AbstractC0318a abstractC0318a3 = ((C0321d) view2.getLayoutParams()).f4304a;
                                if (abstractC0318a3 != null) {
                                    abstractC0318a3.b(view2);
                                }
                                i5++;
                                arrayList4 = arrayList;
                            }
                        } else {
                            g8.setEmpty();
                            bVar.c(g8);
                        }
                    }
                }
                i4 = i;
                if (i4 == 2) {
                }
                i5 = i2 + 1;
                i6 = i24;
                while (true) {
                    arrayList = arrayList4;
                    if (i5 < i6) {
                    }
                    i5++;
                    arrayList4 = arrayList;
                }
            }
            size = i6;
            i19 = i2 + 1;
            g3 = rect;
            i18 = i4;
            g4 = rect3;
            arrayList3 = arrayList;
            g2 = rect2;
            layoutDirection = i3;
        }
    }

    public final void q(View view, int i) {
        Rect g2;
        Rect g3;
        C0321d c0321d = (C0321d) view.getLayoutParams();
        View view2 = c0321d.f4311k;
        if (view2 == null && c0321d.f4308f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        c cVar = f1477x;
        if (view2 != null) {
            g2 = g();
            g3 = g();
            try {
                k(view2, g2);
                C0321d c0321d2 = (C0321d) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                l(i, g2, g3, c0321d2, measuredWidth, measuredHeight);
                h(c0321d2, g3, measuredWidth, measuredHeight);
                view.layout(g3.left, g3.top, g3.right, g3.bottom);
                return;
            } finally {
                g2.setEmpty();
                cVar.c(g2);
                g3.setEmpty();
                cVar.c(g3);
            }
        }
        int i2 = c0321d.f4307e;
        if (i2 < 0) {
            C0321d c0321d3 = (C0321d) view.getLayoutParams();
            g2 = g();
            g2.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0321d3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0321d3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0321d3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c0321d3).bottomMargin);
            if (this.f1488n != null) {
                WeakHashMap weakHashMap = Q.f513a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    g2.left = this.f1488n.b() + g2.left;
                    g2.top = this.f1488n.d() + g2.top;
                    g2.right -= this.f1488n.c();
                    g2.bottom -= this.f1488n.a();
                }
            }
            g3 = g();
            int i3 = c0321d3.f4306c;
            if ((i3 & 7) == 0) {
                i3 |= 8388611;
            }
            if ((i3 & 112) == 0) {
                i3 |= 48;
            }
            Gravity.apply(i3, view.getMeasuredWidth(), view.getMeasuredHeight(), g2, g3, i);
            view.layout(g3.left, g3.top, g3.right, g3.bottom);
            return;
        }
        C0321d c0321d4 = (C0321d) view.getLayoutParams();
        int i4 = c0321d4.f4306c;
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
        int m2 = m(i2) - measuredWidth2;
        if (i5 == 1) {
            m2 += measuredWidth2 / 2;
        } else if (i5 == 5) {
            m2 += measuredWidth2;
        }
        int i7 = i6 != 16 ? i6 != 80 ? 0 : measuredHeight2 : measuredHeight2 / 2;
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0321d4).leftMargin, Math.min(m2, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) c0321d4).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0321d4).topMargin, Math.min(i7, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) c0321d4).bottomMargin));
        view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
    }

    public final boolean r(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f1480c;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            arrayList.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        n nVar = f1476w;
        if (nVar != null) {
            Collections.sort(arrayList, nVar);
        }
        int size = arrayList.size();
        MotionEvent motionEvent2 = null;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) arrayList.get(i3);
            AbstractC0318a abstractC0318a = ((C0321d) view.getLayoutParams()).f4304a;
            if (z2 && actionMasked != 0) {
                if (abstractC0318a != null) {
                    if (motionEvent2 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i == 0) {
                        abstractC0318a.f(this, view, motionEvent2);
                    } else if (i == 1) {
                        abstractC0318a.q(view, motionEvent2);
                    }
                }
            } else if (!z2 && abstractC0318a != null) {
                if (i == 0) {
                    z2 = abstractC0318a.f(this, view, motionEvent);
                } else if (i == 1) {
                    z2 = abstractC0318a.q(view, motionEvent);
                }
                if (z2) {
                    this.f1484j = view;
                }
            }
        }
        arrayList.clear();
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        AbstractC0318a abstractC0318a = ((C0321d) view.getLayoutParams()).f4304a;
        if (abstractC0318a != null) {
            abstractC0318a.l(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        if (!z2 || this.f1483g) {
            return;
        }
        t(false);
        this.f1483g = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0144, code lost:
    
        throw new java.lang.IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s() {
        b bVar;
        ArrayList arrayList = this.f1478a;
        arrayList.clear();
        g gVar = this.f1479b;
        k kVar = (k) gVar.f825b;
        int i = kVar.f3372c;
        int i2 = 0;
        while (true) {
            bVar = (b) gVar.f824a;
            if (i2 >= i) {
                break;
            }
            ArrayList arrayList2 = (ArrayList) kVar.j(i2);
            if (arrayList2 != null) {
                arrayList2.clear();
                bVar.c(arrayList2);
            }
            i2++;
        }
        kVar.clear();
        int childCount = getChildCount();
        int i3 = 0;
        loop1: while (true) {
            k kVar2 = (k) gVar.f825b;
            if (i3 >= childCount) {
                ArrayList arrayList3 = (ArrayList) gVar.f826c;
                arrayList3.clear();
                HashSet hashSet = (HashSet) gVar.d;
                hashSet.clear();
                int i4 = kVar2.f3372c;
                for (int i5 = 0; i5 < i4; i5++) {
                    gVar.c(kVar2.h(i5), arrayList3, hashSet);
                }
                arrayList.addAll(arrayList3);
                Collections.reverse(arrayList);
                return;
            }
            View childAt = getChildAt(i3);
            C0321d n2 = n(childAt);
            int i6 = n2.f4308f;
            if (i6 == -1) {
                n2.f4312l = null;
                n2.f4311k = null;
            } else {
                View view = n2.f4311k;
                if (view != null && view.getId() == i6) {
                    View view2 = n2.f4311k;
                    for (ViewParent parent = view2.getParent(); parent != this; parent = parent.getParent()) {
                        if (parent == null || parent == childAt) {
                            n2.f4312l = null;
                            n2.f4311k = null;
                        } else {
                            if (parent instanceof View) {
                                view2 = parent;
                            }
                        }
                    }
                    n2.f4312l = view2;
                }
                View findViewById = findViewById(i6);
                n2.f4311k = findViewById;
                if (findViewById == null) {
                    if (!isInEditMode()) {
                        throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + getResources().getResourceName(i6) + " to anchor view " + childAt);
                    }
                    n2.f4312l = null;
                    n2.f4311k = null;
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
                            n2.f4312l = null;
                            n2.f4311k = null;
                        }
                    }
                    n2.f4312l = findViewById;
                } else {
                    if (!isInEditMode()) {
                        throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                    }
                    n2.f4312l = null;
                    n2.f4311k = null;
                }
            }
            if (!kVar2.containsKey(childAt)) {
                kVar2.put(childAt, null);
            }
            for (int i7 = 0; i7 < childCount; i7++) {
                if (i7 != i3) {
                    View childAt2 = getChildAt(i7);
                    if (childAt2 != n2.f4312l) {
                        WeakHashMap weakHashMap = Q.f513a;
                        int layoutDirection = getLayoutDirection();
                        int absoluteGravity = Gravity.getAbsoluteGravity(((C0321d) childAt2.getLayoutParams()).f4309g, layoutDirection);
                        if (absoluteGravity == 0 || (Gravity.getAbsoluteGravity(n2.h, layoutDirection) & absoluteGravity) != absoluteGravity) {
                            AbstractC0318a abstractC0318a = n2.f4304a;
                            if (abstractC0318a != null) {
                                abstractC0318a.b(childAt);
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
                        arrayList4 = (ArrayList) bVar.a();
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        kVar2.put(childAt2, arrayList4);
                    }
                    arrayList4.add(childAt);
                }
            }
            i3++;
        }
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z2) {
        super.setFitsSystemWindows(z2);
        w();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f1491q = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f1490p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f1490p = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f1490p.setState(getDrawableState());
                }
                Drawable drawable3 = this.f1490p;
                WeakHashMap weakHashMap = Q.f513a;
                F.b.b(drawable3, getLayoutDirection());
                this.f1490p.setVisible(getVisibility() == 0, false);
                this.f1490p.setCallback(this);
            }
            WeakHashMap weakHashMap2 = Q.f513a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? a.b(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z2 = i == 0;
        Drawable drawable = this.f1490p;
        if (drawable == null || drawable.isVisible() == z2) {
            return;
        }
        this.f1490p.setVisible(z2, false);
    }

    public final void t(boolean z2) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            AbstractC0318a abstractC0318a = ((C0321d) childAt.getLayoutParams()).f4304a;
            if (abstractC0318a != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z2) {
                    abstractC0318a.f(this, childAt, obtain);
                } else {
                    abstractC0318a.q(childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C0321d) getChildAt(i2).getLayoutParams()).getClass();
        }
        this.f1484j = null;
        this.f1483g = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1490p;
    }

    public final void w() {
        WeakHashMap weakHashMap = Q.f513a;
        if (!getFitsSystemWindows()) {
            F.u(this, null);
            return;
        }
        if (this.f1492r == null) {
            this.f1492r = new C0176a0(this);
        }
        F.u(this, this.f1492r);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0321d ? new C0321d((C0321d) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0321d((ViewGroup.MarginLayoutParams) layoutParams) : new C0321d(layoutParams);
    }
}
