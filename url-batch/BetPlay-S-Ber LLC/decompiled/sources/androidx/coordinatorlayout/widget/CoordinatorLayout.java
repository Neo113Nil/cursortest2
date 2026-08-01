package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
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
import com.awerser.monnit.betplay.R;
import defpackage.ac0;
import defpackage.e90;
import defpackage.h30;
import defpackage.h8;
import defpackage.hy;
import defpackage.j1;
import defpackage.k90;
import defpackage.ma;
import defpackage.mx;
import defpackage.nx;
import defpackage.o8;
import defpackage.qd;
import defpackage.rd;
import defpackage.sd;
import defpackage.sv;
import defpackage.td;
import defpackage.tv;
import defpackage.ud;
import defpackage.uv;
import defpackage.vd;
import defpackage.w80;
import defpackage.wd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements sv, tv {
    public static final Class[] A;
    public static final ThreadLocal B;
    public static final ma C;
    public static final nx D;
    public static final String z;
    public final ArrayList f;
    public final h8 g;
    public final ArrayList h;
    public final ArrayList i;
    public Paint j;
    public final int[] k;
    public final int[] l;
    public boolean m;
    public boolean n;
    public final int[] o;
    public View p;
    public View q;
    public vd r;
    public boolean s;
    public ac0 t;
    public boolean u;
    public Drawable v;
    public ViewGroup.OnHierarchyChangeListener w;
    public j1 x;
    public final uv y;

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        z = r0 != null ? r0.getName() : null;
        C = new ma(1);
        A = new Class[]{Context.class, AttributeSet.class};
        B = new ThreadLocal();
        D = new nx();
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f = new ArrayList();
        this.g = new h8(2);
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.k = new int[2];
        this.l = new int[2];
        this.y = new uv();
        int[] iArr = hy.a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.o = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i = 0; i < length; i++) {
                this.o[i] = (int) (r1[i] * f);
            }
        }
        this.v = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        w();
        super.setOnHierarchyChangeListener(new td(this));
        WeakHashMap weakHashMap = e90.a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect g() {
        Rect rect = (Rect) D.a();
        return rect == null ? new Rect() : rect;
    }

    public static void l(int i, Rect rect, Rect rect2, ud udVar, int i2, int i3) {
        int i4 = udVar.c;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = udVar.d;
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
    public static ud n(View view) {
        ud udVar = (ud) view.getLayoutParams();
        if (!udVar.b) {
            if (view instanceof qd) {
                rd behavior = ((qd) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                rd rdVar = udVar.a;
                if (rdVar != behavior) {
                    if (rdVar != null) {
                        rdVar.onDetachedFromLayoutParams();
                    }
                    udVar.a = behavior;
                    udVar.r = null;
                    udVar.b = true;
                    if (behavior != null) {
                        behavior.onAttachedToLayoutParams(udVar);
                    }
                }
                udVar.b = true;
                return udVar;
            }
            sd sdVar = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                sdVar = (sd) cls.getAnnotation(sd.class);
                if (sdVar != null) {
                    break;
                }
            }
            if (sdVar != null) {
                try {
                    rd rdVar2 = (rd) sdVar.value().getDeclaredConstructor(null).newInstance(null);
                    rd rdVar3 = udVar.a;
                    if (rdVar3 != rdVar2) {
                        if (rdVar3 != null) {
                            rdVar3.onDetachedFromLayoutParams();
                        }
                        udVar.a = rdVar2;
                        udVar.r = null;
                        udVar.b = true;
                        if (rdVar2 != null) {
                            rdVar2.onAttachedToLayoutParams(udVar);
                        }
                    }
                } catch (Exception e) {
                    Log.e("CoordinatorLayout", "Default behavior class " + sdVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                }
            }
            udVar.b = true;
        }
        return udVar;
    }

    public static void u(View view, int i) {
        ud udVar = (ud) view.getLayoutParams();
        int i2 = udVar.i;
        if (i2 != i) {
            WeakHashMap weakHashMap = e90.a;
            view.offsetLeftAndRight(i - i2);
            udVar.i = i;
        }
    }

    public static void v(View view, int i) {
        ud udVar = (ud) view.getLayoutParams();
        int i2 = udVar.j;
        if (i2 != i) {
            WeakHashMap weakHashMap = e90.a;
            view.offsetTopAndBottom(i - i2);
            udVar.j = i;
        }
    }

    @Override // defpackage.sv
    public final void a(View view, View view2, int i, int i2) {
        rd rdVar;
        CoordinatorLayout coordinatorLayout;
        View view3;
        View view4;
        int i3;
        int i4;
        uv uvVar = this.y;
        if (i2 == 1) {
            uvVar.b = i;
        } else {
            uvVar.a = i;
        }
        this.q = view2;
        int childCount = getChildCount();
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = this.getChildAt(i5);
            ud udVar = (ud) childAt.getLayoutParams();
            if (udVar.a(i2) && (rdVar = udVar.a) != null) {
                coordinatorLayout = this;
                view3 = view;
                view4 = view2;
                i3 = i;
                i4 = i2;
                rdVar.onNestedScrollAccepted(coordinatorLayout, childAt, view3, view4, i3, i4);
            } else {
                coordinatorLayout = this;
                view3 = view;
                view4 = view2;
                i3 = i;
                i4 = i2;
            }
            i5++;
            this = coordinatorLayout;
            view = view3;
            view2 = view4;
            i = i3;
            i2 = i4;
        }
    }

    @Override // defpackage.sv
    public final void b(View view, int i) {
        uv uvVar = this.y;
        if (i == 1) {
            uvVar.b = 0;
        } else {
            uvVar.a = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            ud udVar = (ud) childAt.getLayoutParams();
            if (udVar.a(i)) {
                rd rdVar = udVar.a;
                if (rdVar != null) {
                    rdVar.onStopNestedScroll(this, childAt, view, i);
                }
                if (i == 0) {
                    udVar.n = false;
                } else if (i == 1) {
                    udVar.o = false;
                }
                udVar.p = false;
            }
        }
        this.q = null;
    }

    @Override // defpackage.sv
    public final void c(View view, int i, int i2, int[] iArr, int i3) {
        rd rdVar;
        int childCount = getChildCount();
        boolean z2 = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                ud udVar = (ud) childAt.getLayoutParams();
                if (udVar.a(i3) && (rdVar = udVar.a) != null) {
                    int[] iArr2 = this.k;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    rdVar.onNestedPreScroll(this, childAt, view, i, i2, iArr2, i3);
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

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof ud) && super.checkLayoutParams(layoutParams);
    }

    @Override // defpackage.tv
    public final void d(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        rd rdVar;
        int childCount = getChildCount();
        boolean z2 = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                ud udVar = (ud) childAt.getLayoutParams();
                if (udVar.a(i5) && (rdVar = udVar.a) != null) {
                    int[] iArr2 = this.k;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    rdVar.onNestedScroll(this, childAt, view, i, i2, i3, i4, i5, iArr2);
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

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        ud udVar = (ud) view.getLayoutParams();
        rd rdVar = udVar.a;
        if (rdVar != null) {
            float scrimOpacity = rdVar.getScrimOpacity(this, view);
            if (scrimOpacity > 0.0f) {
                if (this.j == null) {
                    this.j = new Paint();
                }
                this.j.setColor(udVar.a.getScrimColor(this, view));
                Paint paint = this.j;
                int round = Math.round(scrimOpacity * 255.0f);
                if (round < 0) {
                    round = 0;
                } else if (round > 255) {
                    round = 255;
                }
                paint.setAlpha(round);
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.j);
                canvas.restoreToCount(save);
                return super.drawChild(canvas, view, j);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.v;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // defpackage.sv
    public final void e(View view, int i, int i2, int i3, int i4, int i5) {
        d(view, i, i2, i3, i4, 0, this.l);
    }

    @Override // defpackage.sv
    public final boolean f(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                ud udVar = (ud) childAt.getLayoutParams();
                rd rdVar = udVar.a;
                if (rdVar != null) {
                    boolean onStartNestedScroll = rdVar.onStartNestedScroll(this, childAt, view, view2, i, i2);
                    z2 |= onStartNestedScroll;
                    if (i2 == 0) {
                        udVar.n = onStartNestedScroll;
                    } else if (i2 == 1) {
                        udVar.o = onStartNestedScroll;
                    }
                } else if (i2 == 0) {
                    udVar.n = false;
                } else if (i2 == 1) {
                    udVar.o = false;
                }
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ud();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ud ? new ud((ud) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new ud((ViewGroup.MarginLayoutParams) layoutParams) : new ud(layoutParams);
    }

    public final List<View> getDependencySortedChildren() {
        s();
        return Collections.unmodifiableList(this.f);
    }

    public final ac0 getLastWindowInsets() {
        return this.t;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        uv uvVar = this.y;
        return uvVar.b | uvVar.a;
    }

    public Drawable getStatusBarBackground() {
        return this.v;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(ud udVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) udVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) udVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) udVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) udVar).bottomMargin));
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
        h30 h30Var = (h30) this.g.g;
        int i = h30Var.h;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) h30Var.i(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(h30Var.f(i2));
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
        ThreadLocal threadLocal = k90.a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = k90.a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        k90.a(this, view, matrix);
        ThreadLocal threadLocal3 = k90.b;
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
        int[] iArr = this.o;
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
        nx nxVar = D;
        Rect g = g();
        k(view, g);
        try {
            return g.contains(i, i2);
        } finally {
            g.setEmpty();
            nxVar.c(g);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t(false);
        if (this.s) {
            if (this.r == null) {
                this.r = new vd(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.r);
        }
        if (this.t == null) {
            WeakHashMap weakHashMap = e90.a;
            if (getFitsSystemWindows()) {
                requestApplyInsets();
            }
        }
        this.n = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t(false);
        if (this.s && this.r != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.r);
        }
        View view = this.q;
        if (view != null) {
            b(view, 0);
        }
        this.n = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.u || this.v == null) {
            return;
        }
        ac0 ac0Var = this.t;
        int d = ac0Var != null ? ac0Var.d() : 0;
        if (d > 0) {
            this.v.setBounds(0, 0, getWidth(), d);
            this.v.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            t(true);
        }
        boolean r = r(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return r;
        }
        t(true);
        return r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        rd rdVar;
        WeakHashMap weakHashMap = e90.a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            if (view.getVisibility() != 8 && ((rdVar = ((ud) view.getLayoutParams()).a) == null || !rdVar.onLayoutChild(this, view, layoutDirection))) {
                q(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0193  */
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
        rd rdVar;
        int i9;
        int i10;
        ArrayList arrayList;
        int i11;
        int i12;
        int i13;
        boolean z3;
        int i14;
        int i15;
        View view;
        int i16;
        int i17;
        int max;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.s();
        int childCount = coordinatorLayout.getChildCount();
        int i18 = 0;
        loop0: while (true) {
            if (i18 >= childCount) {
                z2 = false;
                break;
            }
            View childAt = coordinatorLayout.getChildAt(i18);
            h30 h30Var = (h30) coordinatorLayout.g.g;
            int i19 = h30Var.h;
            for (int i20 = 0; i20 < i19; i20++) {
                ArrayList arrayList2 = (ArrayList) h30Var.i(i20);
                if (arrayList2 != null && arrayList2.contains(childAt)) {
                    z2 = true;
                    break loop0;
                }
            }
            i18++;
        }
        if (z2 != coordinatorLayout.s) {
            boolean z4 = coordinatorLayout.n;
            if (z2) {
                if (z4) {
                    if (coordinatorLayout.r == null) {
                        coordinatorLayout.r = new vd(coordinatorLayout);
                    }
                    coordinatorLayout.getViewTreeObserver().addOnPreDrawListener(coordinatorLayout.r);
                }
                coordinatorLayout.s = true;
            } else {
                if (z4 && coordinatorLayout.r != null) {
                    coordinatorLayout.getViewTreeObserver().removeOnPreDrawListener(coordinatorLayout.r);
                }
                coordinatorLayout.s = false;
            }
        }
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        WeakHashMap weakHashMap = e90.a;
        int layoutDirection = coordinatorLayout.getLayoutDirection();
        boolean z5 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i21 = paddingLeft + paddingRight;
        int i22 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z6 = coordinatorLayout.t != null && coordinatorLayout.getFitsSystemWindows();
        ArrayList arrayList3 = coordinatorLayout.f;
        int size3 = arrayList3.size();
        int i23 = 0;
        int i24 = 0;
        while (i23 < size3) {
            View view2 = (View) arrayList3.get(i23);
            int i25 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                arrayList = arrayList3;
                i6 = size3;
                i16 = i23;
                i12 = paddingLeft;
                i9 = layoutDirection;
                suggestedMinimumWidth = i25;
                z3 = false;
                i15 = paddingRight;
            } else {
                ud udVar = (ud) view2.getLayoutParams();
                int i26 = udVar.e;
                if (i26 < 0 || mode == 0) {
                    i3 = suggestedMinimumHeight;
                } else {
                    int m = coordinatorLayout.m(i26);
                    int i27 = udVar.c;
                    if (i27 == 0) {
                        i27 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i27, layoutDirection) & 7;
                    i3 = suggestedMinimumHeight;
                    if ((absoluteGravity == 3 && !z5) || (absoluteGravity == 5 && z5)) {
                        max = Math.max(0, (size - paddingRight) - m);
                    } else if ((absoluteGravity == 5 && !z5) || (absoluteGravity == 3 && z5)) {
                        max = Math.max(0, m - paddingLeft);
                    }
                    int i28 = size3;
                    i5 = max;
                    i4 = i28;
                    if (z6 || view2.getFitsSystemWindows()) {
                        i6 = i4;
                        i7 = i;
                        i8 = i2;
                    } else {
                        i6 = i4;
                        int c = coordinatorLayout.t.c() + coordinatorLayout.t.b();
                        int a = coordinatorLayout.t.a() + coordinatorLayout.t.d();
                        i7 = View.MeasureSpec.makeMeasureSpec(size - c, mode);
                        i8 = View.MeasureSpec.makeMeasureSpec(size2 - a, mode2);
                    }
                    rdVar = udVar.a;
                    if (rdVar == null) {
                        int i29 = i3;
                        i9 = layoutDirection;
                        i10 = i29;
                        z3 = false;
                        i12 = paddingLeft;
                        i13 = i25;
                        i15 = paddingRight;
                        i17 = i24;
                        arrayList = arrayList3;
                        int i30 = i7;
                        i16 = i23;
                        int i31 = i8;
                        boolean onMeasureChild = rdVar.onMeasureChild(this, view2, i30, i5, i31, 0);
                        view = view2;
                        i7 = i30;
                        i11 = i5;
                        i14 = i31;
                        if (onMeasureChild) {
                            coordinatorLayout = this;
                            int max2 = Math.max(i13, view.getMeasuredWidth() + i21 + ((ViewGroup.MarginLayoutParams) udVar).leftMargin + ((ViewGroup.MarginLayoutParams) udVar).rightMargin);
                            int max3 = Math.max(i10, view.getMeasuredHeight() + i22 + ((ViewGroup.MarginLayoutParams) udVar).topMargin + ((ViewGroup.MarginLayoutParams) udVar).bottomMargin);
                            i24 = View.combineMeasuredStates(i17, view.getMeasuredState());
                            suggestedMinimumWidth = max2;
                            suggestedMinimumHeight = max3;
                        }
                    } else {
                        int i32 = i3;
                        i9 = layoutDirection;
                        i10 = i32;
                        arrayList = arrayList3;
                        i11 = i5;
                        i12 = paddingLeft;
                        i13 = i25;
                        z3 = false;
                        i14 = i8;
                        i15 = paddingRight;
                        view = view2;
                        i16 = i23;
                        i17 = i24;
                    }
                    coordinatorLayout = this;
                    coordinatorLayout.measureChildWithMargins(view, i7, i11, i14, 0);
                    int max22 = Math.max(i13, view.getMeasuredWidth() + i21 + ((ViewGroup.MarginLayoutParams) udVar).leftMargin + ((ViewGroup.MarginLayoutParams) udVar).rightMargin);
                    int max32 = Math.max(i10, view.getMeasuredHeight() + i22 + ((ViewGroup.MarginLayoutParams) udVar).topMargin + ((ViewGroup.MarginLayoutParams) udVar).bottomMargin);
                    i24 = View.combineMeasuredStates(i17, view.getMeasuredState());
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
                rdVar = udVar.a;
                if (rdVar == null) {
                }
                coordinatorLayout = this;
                coordinatorLayout.measureChildWithMargins(view, i7, i11, i14, 0);
                int max222 = Math.max(i13, view.getMeasuredWidth() + i21 + ((ViewGroup.MarginLayoutParams) udVar).leftMargin + ((ViewGroup.MarginLayoutParams) udVar).rightMargin);
                int max322 = Math.max(i10, view.getMeasuredHeight() + i22 + ((ViewGroup.MarginLayoutParams) udVar).topMargin + ((ViewGroup.MarginLayoutParams) udVar).bottomMargin);
                i24 = View.combineMeasuredStates(i17, view.getMeasuredState());
                suggestedMinimumWidth = max222;
                suggestedMinimumHeight = max322;
            }
            i23 = i16 + 1;
            paddingLeft = i12;
            paddingRight = i15;
            size3 = i6;
            layoutDirection = i9;
            arrayList3 = arrayList;
        }
        int i33 = i24;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i, (-16777216) & i33), View.resolveSizeAndState(suggestedMinimumHeight, i2, i33 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z2) {
        rd rdVar;
        CoordinatorLayout coordinatorLayout;
        View view2;
        float f3;
        float f4;
        boolean z3;
        int childCount = getChildCount();
        int i = 0;
        boolean z4 = false;
        while (i < childCount) {
            View childAt = this.getChildAt(i);
            if (childAt.getVisibility() != 8) {
                ud udVar = (ud) childAt.getLayoutParams();
                if (udVar.a(0) && (rdVar = udVar.a) != null) {
                    coordinatorLayout = this;
                    view2 = view;
                    f3 = f;
                    f4 = f2;
                    z3 = z2;
                    z4 |= rdVar.onNestedFling(coordinatorLayout, childAt, view2, f3, f4, z3);
                    i++;
                    this = coordinatorLayout;
                    view = view2;
                    f = f3;
                    f2 = f4;
                    z2 = z3;
                }
            }
            coordinatorLayout = this;
            view2 = view;
            f3 = f;
            f4 = f2;
            z3 = z2;
            i++;
            this = coordinatorLayout;
            view = view2;
            f = f3;
            f2 = f4;
            z2 = z3;
        }
        CoordinatorLayout coordinatorLayout2 = this;
        if (z4) {
            coordinatorLayout2.p(1);
        }
        return z4;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        rd rdVar;
        CoordinatorLayout coordinatorLayout;
        View view2;
        float f3;
        float f4;
        int childCount = getChildCount();
        int i = 0;
        boolean z2 = false;
        while (i < childCount) {
            View childAt = this.getChildAt(i);
            if (childAt.getVisibility() != 8) {
                ud udVar = (ud) childAt.getLayoutParams();
                if (udVar.a(0) && (rdVar = udVar.a) != null) {
                    coordinatorLayout = this;
                    view2 = view;
                    f3 = f;
                    f4 = f2;
                    z2 |= rdVar.onNestedPreFling(coordinatorLayout, childAt, view2, f3, f4);
                    i++;
                    this = coordinatorLayout;
                    view = view2;
                    f = f3;
                    f2 = f4;
                }
            }
            coordinatorLayout = this;
            view2 = view;
            f3 = f;
            f4 = f2;
            i++;
            this = coordinatorLayout;
            view = view2;
            f = f3;
            f2 = f4;
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
        if (!(parcelable instanceof wd)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        wd wdVar = (wd) parcelable;
        super.onRestoreInstanceState(wdVar.getSuperState());
        SparseArray sparseArray = wdVar.f;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            rd rdVar = n(childAt).a;
            if (id != -1 && rdVar != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                rdVar.onRestoreInstanceState(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState;
        wd wdVar = new wd(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            rd rdVar = ((ud) childAt.getLayoutParams()).a;
            if (id != -1 && rdVar != null && (onSaveInstanceState = rdVar.onSaveInstanceState(this, childAt)) != null) {
                sparseArray.append(id, onSaveInstanceState);
            }
        }
        wdVar.f = sparseArray;
        return wdVar;
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
        boolean onTouchEvent;
        MotionEvent motionEvent2;
        int actionMasked = motionEvent.getActionMasked();
        if (this.p == null) {
            z2 = r(motionEvent, 1);
        } else {
            z2 = false;
        }
        rd rdVar = ((ud) this.p.getLayoutParams()).a;
        if (rdVar != null) {
            onTouchEvent = rdVar.onTouchEvent(this, this.p, motionEvent);
            motionEvent2 = null;
            if (this.p != null) {
                onTouchEvent |= super.onTouchEvent(motionEvent);
            } else if (z2) {
                long uptimeMillis = SystemClock.uptimeMillis();
                motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEvent2);
            }
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            if (actionMasked == 1 && actionMasked != 3) {
                return onTouchEvent;
            }
            t(false);
            return onTouchEvent;
        }
        onTouchEvent = false;
        motionEvent2 = null;
        if (this.p != null) {
        }
        if (motionEvent2 != null) {
        }
        if (actionMasked == 1) {
        }
        t(false);
        return onTouchEvent;
    }

    public final void p(int i) {
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
        ud udVar;
        int i10;
        int i11;
        Rect rect2;
        int i12;
        View view;
        rd rdVar;
        WeakHashMap weakHashMap = e90.a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList3 = this.f;
        int size = arrayList3.size();
        Rect g = g();
        Rect g2 = g();
        Rect g3 = g();
        int i13 = 0;
        while (true) {
            nx nxVar = D;
            if (i13 >= size) {
                Rect rect3 = g3;
                g.setEmpty();
                nxVar.c(g);
                g2.setEmpty();
                nxVar.c(g2);
                rect3.setEmpty();
                nxVar.c(rect3);
                return;
            }
            View view2 = (View) arrayList3.get(i13);
            ud udVar2 = (ud) view2.getLayoutParams();
            if (i != 0 || view2.getVisibility() != 8) {
                int i14 = 0;
                while (i14 < i13) {
                    if (udVar2.l == ((View) arrayList3.get(i14))) {
                        ud udVar3 = (ud) view2.getLayoutParams();
                        if (udVar3.k != null) {
                            Rect g4 = g();
                            Rect g5 = g();
                            ud udVar4 = udVar2;
                            Rect g6 = g();
                            k(udVar3.k, g4);
                            i(view2, g5, false);
                            int measuredWidth = view2.getMeasuredWidth();
                            View view3 = view2;
                            int measuredHeight = view3.getMeasuredHeight();
                            arrayList2 = arrayList3;
                            udVar = udVar4;
                            i10 = i14;
                            layoutDirection = layoutDirection;
                            i12 = i13;
                            view = view3;
                            l(layoutDirection, g4, g6, udVar3, measuredWidth, measuredHeight);
                            i11 = size;
                            rect2 = g3;
                            boolean z5 = (g6.left == g5.left && g6.top == g5.top) ? false : true;
                            h(udVar3, g6, measuredWidth, measuredHeight);
                            int i15 = g6.left - g5.left;
                            int i16 = g6.top - g5.top;
                            if (i15 != 0) {
                                WeakHashMap weakHashMap2 = e90.a;
                                view.offsetLeftAndRight(i15);
                            }
                            if (i16 != 0) {
                                WeakHashMap weakHashMap3 = e90.a;
                                view.offsetTopAndBottom(i16);
                            }
                            if (z5 && (rdVar = udVar3.a) != null) {
                                rdVar.onDependentViewChanged(this, view, udVar3.k);
                            }
                            g4.setEmpty();
                            nxVar.c(g4);
                            g5.setEmpty();
                            nxVar.c(g5);
                            g6.setEmpty();
                            nxVar.c(g6);
                            i14 = i10 + 1;
                            udVar2 = udVar;
                            view2 = view;
                            arrayList3 = arrayList2;
                            size = i11;
                            i13 = i12;
                            g3 = rect2;
                        }
                    }
                    arrayList2 = arrayList3;
                    udVar = udVar2;
                    i10 = i14;
                    i11 = size;
                    rect2 = g3;
                    i12 = i13;
                    view = view2;
                    i14 = i10 + 1;
                    udVar2 = udVar;
                    view2 = view;
                    arrayList3 = arrayList2;
                    size = i11;
                    i13 = i12;
                    g3 = rect2;
                }
                ArrayList arrayList4 = arrayList3;
                ud udVar5 = udVar2;
                int i17 = size;
                Rect rect4 = g3;
                i2 = i13;
                View view4 = view2;
                i(view4, g2, true);
                if (udVar5.g != 0 && !g2.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(udVar5.g, layoutDirection);
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
                if (udVar5.h != 0 && view4.getVisibility() == 0) {
                    WeakHashMap weakHashMap4 = e90.a;
                    if (view4.isLaidOut() && view4.getWidth() > 0 && view4.getHeight() > 0) {
                        ud udVar6 = (ud) view4.getLayoutParams();
                        rd rdVar2 = udVar6.a;
                        Rect g7 = g();
                        Rect g8 = g();
                        g8.set(view4.getLeft(), view4.getTop(), view4.getRight(), view4.getBottom());
                        if (rdVar2 == null || !rdVar2.getInsetDodgeRect(this, view4, g7)) {
                            g7.set(g8);
                        } else if (!g8.contains(g7)) {
                            throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + g7.toShortString() + " | Bounds:" + g8.toShortString());
                        }
                        g8.setEmpty();
                        nxVar.c(g8);
                        if (g7.isEmpty()) {
                            g7.setEmpty();
                            nxVar.c(g7);
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(udVar6.h, layoutDirection);
                            if ((absoluteGravity2 & 48) != 48 || (i8 = (g7.top - ((ViewGroup.MarginLayoutParams) udVar6).topMargin) - udVar6.j) >= (i9 = g.top)) {
                                z3 = false;
                            } else {
                                v(view4, i9 - i8);
                                z3 = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - g7.bottom) - ((ViewGroup.MarginLayoutParams) udVar6).bottomMargin) + udVar6.j) < (i7 = g.bottom)) {
                                v(view4, height - i7);
                                z3 = true;
                            }
                            if (!z3) {
                                v(view4, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i5 = (g7.left - ((ViewGroup.MarginLayoutParams) udVar6).leftMargin) - udVar6.i) >= (i6 = g.left)) {
                                z4 = false;
                            } else {
                                u(view4, i6 - i5);
                                z4 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - g7.right) - ((ViewGroup.MarginLayoutParams) udVar6).rightMargin) + udVar6.i) < (i4 = g.right)) {
                                u(view4, width - i4);
                                z4 = true;
                            }
                            if (!z4) {
                                u(view4, 0);
                            }
                            g7.setEmpty();
                            nxVar.c(g7);
                        }
                    }
                }
                if (i != 2) {
                    rect = rect4;
                    rect.set(((ud) view4.getLayoutParams()).q);
                    if (rect.equals(g2)) {
                        arrayList = arrayList4;
                        i3 = i17;
                    } else {
                        ((ud) view4.getLayoutParams()).q.set(g2);
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
                    ud udVar7 = (ud) view5.getLayoutParams();
                    rd rdVar3 = udVar7.a;
                    if (rdVar3 != null && rdVar3.layoutDependsOn(this, view5, view4)) {
                        if (i == 0 && udVar7.p) {
                            udVar7.p = false;
                        } else {
                            if (i != 2) {
                                z2 = rdVar3.onDependentViewChanged(this, view5, view4);
                            } else {
                                rdVar3.onDependentViewRemoved(this, view5, view4);
                                z2 = true;
                            }
                            if (i == 1) {
                                udVar7.p = z2;
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

    public final void q(View view, int i) {
        Rect g;
        Rect g2;
        ud udVar = (ud) view.getLayoutParams();
        View view2 = udVar.k;
        if (view2 == null && udVar.f != -1) {
            o8.t("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
            return;
        }
        nx nxVar = D;
        if (view2 != null) {
            g = g();
            g2 = g();
            try {
                k(view2, g);
                ud udVar2 = (ud) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                l(i, g, g2, udVar2, measuredWidth, measuredHeight);
                h(udVar2, g2, measuredWidth, measuredHeight);
                view.layout(g2.left, g2.top, g2.right, g2.bottom);
                return;
            } finally {
                g.setEmpty();
                nxVar.c(g);
                g2.setEmpty();
                nxVar.c(g2);
            }
        }
        int i2 = udVar.e;
        if (i2 < 0) {
            ud udVar3 = (ud) view.getLayoutParams();
            g = g();
            g.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) udVar3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) udVar3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) udVar3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) udVar3).bottomMargin);
            if (this.t != null) {
                WeakHashMap weakHashMap = e90.a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    g.left = this.t.b() + g.left;
                    g.top = this.t.d() + g.top;
                    g.right -= this.t.c();
                    g.bottom -= this.t.a();
                }
            }
            g2 = g();
            int i3 = udVar3.c;
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
        ud udVar4 = (ud) view.getLayoutParams();
        int i4 = udVar4.c;
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
        int m = m(i2) - measuredWidth2;
        if (i5 == 1) {
            m += measuredWidth2 / 2;
        } else if (i5 == 5) {
            m += measuredWidth2;
        }
        int i7 = i6 != 16 ? i6 != 80 ? 0 : measuredHeight2 : measuredHeight2 / 2;
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) udVar4).leftMargin, Math.min(m, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) udVar4).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) udVar4).topMargin, Math.min(i7, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) udVar4).bottomMargin));
        view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
    }

    public final boolean r(MotionEvent motionEvent, int i) {
        boolean blocksInteractionBelow;
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.h;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            arrayList.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        ma maVar = C;
        if (maVar != null) {
            Collections.sort(arrayList, maVar);
        }
        int size = arrayList.size();
        MotionEvent motionEvent2 = null;
        boolean z2 = false;
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) arrayList.get(i3);
            ud udVar = (ud) view.getLayoutParams();
            rd rdVar = udVar.a;
            if (!(z2 || z3) || actionMasked == 0) {
                if (!z2 && rdVar != null) {
                    if (i == 0) {
                        z2 = rdVar.onInterceptTouchEvent(this, view, motionEvent);
                    } else if (i == 1) {
                        z2 = rdVar.onTouchEvent(this, view, motionEvent);
                    }
                    if (z2) {
                        this.p = view;
                    }
                }
                rd rdVar2 = udVar.a;
                if (rdVar2 == null) {
                    udVar.m = false;
                }
                boolean z4 = udVar.m;
                if (z4) {
                    blocksInteractionBelow = true;
                } else {
                    blocksInteractionBelow = (rdVar2 != null ? rdVar2.blocksInteractionBelow(this, view) : false) | z4;
                    udVar.m = blocksInteractionBelow;
                }
                boolean z5 = blocksInteractionBelow && !z4;
                if (blocksInteractionBelow && !z5) {
                    break;
                }
                z3 = z5;
            } else if (rdVar != null) {
                if (motionEvent2 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i == 0) {
                    rdVar.onInterceptTouchEvent(this, view, motionEvent2);
                } else if (i == 1) {
                    rdVar.onTouchEvent(this, view, motionEvent2);
                }
            }
        }
        arrayList.clear();
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        rd rdVar = ((ud) view.getLayoutParams()).a;
        if (rdVar == null || !rdVar.onRequestChildRectangleOnScreen(this, view, rect, z2)) {
            return super.requestChildRectangleOnScreen(view, rect, z2);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        if (!z2 || this.m) {
            return;
        }
        t(false);
        this.m = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f5, code lost:
    
        if ((android.view.Gravity.getAbsoluteGravity(r8.h, r12) & r13) == r13) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s() {
        ArrayList arrayList = this.f;
        arrayList.clear();
        h8 h8Var = this.g;
        h30 h30Var = (h30) h8Var.g;
        mx mxVar = (mx) h8Var.f;
        h30 h30Var2 = (h30) h8Var.g;
        int i = h30Var.h;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) h30Var.i(i2);
            if (arrayList2 != null) {
                arrayList2.clear();
                mxVar.c(arrayList2);
            }
        }
        h30Var.clear();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            ud n = n(childAt);
            int i4 = n.f;
            if (i4 == -1) {
                n.l = null;
                n.k = null;
            } else {
                View view = n.k;
                if (view != null && view.getId() == i4) {
                    View view2 = n.k;
                    for (ViewParent parent = view2.getParent(); parent != this; parent = parent.getParent()) {
                        if (parent == null || parent == childAt) {
                            n.l = null;
                            n.k = null;
                        } else {
                            if (parent instanceof View) {
                                view2 = parent;
                            }
                        }
                    }
                    n.l = view2;
                }
                View findViewById = findViewById(i4);
                n.k = findViewById;
                if (findViewById == null) {
                    if (!isInEditMode()) {
                        throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + getResources().getResourceName(i4) + " to anchor view " + childAt);
                    }
                    n.l = null;
                    n.k = null;
                } else if (findViewById != this) {
                    for (ViewParent parent2 = findViewById.getParent(); parent2 != this && parent2 != null; parent2 = parent2.getParent()) {
                        if (parent2 != childAt) {
                            if (parent2 instanceof View) {
                                findViewById = parent2;
                            }
                        } else if (!isInEditMode()) {
                            o8.t("Anchor must not be a descendant of the anchored view");
                            return;
                        } else {
                            n.l = null;
                            n.k = null;
                        }
                    }
                    n.l = findViewById;
                } else if (!isInEditMode()) {
                    o8.t("View can not be anchored to the the parent CoordinatorLayout");
                    return;
                } else {
                    n.l = null;
                    n.k = null;
                }
            }
            if (!h30Var2.containsKey(childAt)) {
                h30Var2.put(childAt, null);
            }
            for (int i5 = 0; i5 < childCount; i5++) {
                if (i5 != i3) {
                    View childAt2 = getChildAt(i5);
                    if (childAt2 != n.l) {
                        WeakHashMap weakHashMap = e90.a;
                        int layoutDirection = getLayoutDirection();
                        int absoluteGravity = Gravity.getAbsoluteGravity(((ud) childAt2.getLayoutParams()).g, layoutDirection);
                        if (absoluteGravity != 0) {
                        }
                        rd rdVar = n.a;
                        if (rdVar == null) {
                            continue;
                        } else if (!rdVar.layoutDependsOn(this, childAt, childAt2)) {
                            continue;
                        }
                    }
                    if (!h30Var2.containsKey(childAt2) && !h30Var2.containsKey(childAt2)) {
                        h30Var2.put(childAt2, null);
                    }
                    if (!h30Var2.containsKey(childAt2) || !h30Var2.containsKey(childAt)) {
                        o8.j("All nodes must be present in the graph before being added as an edge");
                        return;
                    }
                    ArrayList arrayList3 = (ArrayList) h30Var2.get(childAt2);
                    if (arrayList3 == null) {
                        arrayList3 = (ArrayList) mxVar.a();
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        h30Var2.put(childAt2, arrayList3);
                    }
                    arrayList3.add(childAt);
                }
            }
        }
        ArrayList arrayList4 = (ArrayList) h8Var.h;
        arrayList4.clear();
        HashSet hashSet = (HashSet) h8Var.i;
        hashSet.clear();
        int i6 = h30Var2.h;
        for (int i7 = 0; i7 < i6; i7++) {
            h8Var.b(h30Var2.f(i7), arrayList4, hashSet);
        }
        arrayList.addAll(arrayList4);
        Collections.reverse(arrayList);
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z2) {
        super.setFitsSystemWindows(z2);
        w();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.w = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.v;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.v = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.v.setState(getDrawableState());
                }
                Drawable drawable3 = this.v;
                WeakHashMap weakHashMap = e90.a;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.v.setVisible(getVisibility() == 0, false);
                this.v.setCallback(this);
            }
            WeakHashMap weakHashMap2 = e90.a;
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
        Drawable drawable = this.v;
        if (drawable == null || drawable.isVisible() == z2) {
            return;
        }
        this.v.setVisible(z2, false);
    }

    public final void t(boolean z2) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            rd rdVar = ((ud) childAt.getLayoutParams()).a;
            if (rdVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z2) {
                    rdVar.onInterceptTouchEvent(this, childAt, obtain);
                } else {
                    rdVar.onTouchEvent(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((ud) getChildAt(i2).getLayoutParams()).m = false;
        }
        this.p = null;
        this.m = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.v;
    }

    public final void w() {
        WeakHashMap weakHashMap = e90.a;
        if (!getFitsSystemWindows()) {
            w80.c(this, null);
            return;
        }
        if (this.x == null) {
            this.x = new j1(11, this);
        }
        w80.c(this, this.x);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ud(getContext(), attributeSet);
    }
}
