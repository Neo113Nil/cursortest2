package androidx.core.widget;

import B0.E;
import C.e;
import C.h;
import C.i;
import C.j;
import C.l;
import N.C0056m;
import a.AbstractC0086a;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import y.AbstractC0251A;
import y.AbstractC0252B;
import y.AbstractC0267k;
import y.AbstractC0268l;
import y.AbstractC0272p;
import y.C0259c;
import y.C0263g;
import y.C0269m;
import y.InterfaceC0265i;
import y.x;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0265i {

    /* renamed from: F, reason: collision with root package name */
    public static final float f1407F = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final h G = new h();

    /* renamed from: H, reason: collision with root package name */
    public static final int[] f1408H = {R.attr.fillViewport};

    /* renamed from: A, reason: collision with root package name */
    public l f1409A;

    /* renamed from: B, reason: collision with root package name */
    public final C0056m f1410B;

    /* renamed from: C, reason: collision with root package name */
    public final C0263g f1411C;

    /* renamed from: D, reason: collision with root package name */
    public float f1412D;

    /* renamed from: E, reason: collision with root package name */
    public final C0259c f1413E;

    /* renamed from: e, reason: collision with root package name */
    public final float f1414e;

    /* renamed from: f, reason: collision with root package name */
    public long f1415f;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f1416g;

    /* renamed from: h, reason: collision with root package name */
    public final OverScroller f1417h;

    /* renamed from: i, reason: collision with root package name */
    public final EdgeEffect f1418i;

    /* renamed from: j, reason: collision with root package name */
    public final EdgeEffect f1419j;

    /* renamed from: k, reason: collision with root package name */
    public int f1420k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1421l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1422m;

    /* renamed from: n, reason: collision with root package name */
    public View f1423n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1424o;

    /* renamed from: p, reason: collision with root package name */
    public VelocityTracker f1425p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1426q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1427r;

    /* renamed from: s, reason: collision with root package name */
    public final int f1428s;
    public final int t;

    /* renamed from: u, reason: collision with root package name */
    public final int f1429u;

    /* renamed from: v, reason: collision with root package name */
    public int f1430v;

    /* renamed from: w, reason: collision with root package name */
    public final int[] f1431w;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f1432x;

    /* renamed from: y, reason: collision with root package name */
    public int f1433y;

    /* renamed from: z, reason: collision with root package name */
    public int f1434z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.crane.slab.beam.R.attr.nestedScrollViewStyle);
        this.f1416g = new Rect();
        this.f1421l = true;
        this.f1422m = false;
        this.f1423n = null;
        this.f1424o = false;
        this.f1427r = true;
        this.f1430v = -1;
        this.f1431w = new int[2];
        this.f1432x = new int[2];
        this.f1413E = new C0259c(getContext(), new E(1, this));
        int i2 = Build.VERSION.SDK_INT;
        this.f1418i = i2 >= 31 ? e.a(context, attributeSet) : new EdgeEffect(context);
        this.f1419j = i2 >= 31 ? e.a(context, attributeSet) : new EdgeEffect(context);
        this.f1414e = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f1417h = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f1428s = viewConfiguration.getScaledTouchSlop();
        this.t = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1429u = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1408H, com.crane.slab.beam.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f1410B = new C0056m();
        this.f1411C = new C0263g(this);
        setNestedScrollingEnabled(true);
        x.a(this, G);
    }

    public static boolean k(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && k((View) parent, nestedScrollView);
    }

    @Override // y.InterfaceC0264h
    public final void a(View view, View view2, int i2, int i3) {
        C0056m c0056m = this.f1410B;
        if (i3 == 1) {
            c0056m.f757c = i2;
        } else {
            c0056m.f756b = i2;
        }
        u(2, i3);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // y.InterfaceC0264h
    public final void b(ViewGroup viewGroup, int i2, int i3, int i4, int i5, int i6) {
        m(i5, i6, null);
    }

    @Override // y.InterfaceC0264h
    public final void c(View view, int i2) {
        C0056m c0056m = this.f1410B;
        if (i2 == 1) {
            c0056m.f757c = 0;
        } else {
            c0056m.f756b = 0;
        }
        w(i2);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e9  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void computeScroll() {
        int round;
        int i2;
        if (this.f1417h.isFinished()) {
            return;
        }
        this.f1417h.computeScrollOffset();
        int currY = this.f1417h.getCurrY();
        int i3 = currY - this.f1434z;
        int height = getHeight();
        EdgeEffect edgeEffect = this.f1418i;
        EdgeEffect edgeEffect2 = this.f1419j;
        if (i3 <= 0 || AbstractC0086a.r(edgeEffect) == 0.0f) {
            if (i3 < 0 && AbstractC0086a.r(edgeEffect2) != 0.0f) {
                float f2 = height;
                round = Math.round(AbstractC0086a.A(edgeEffect2, (i3 * 4.0f) / f2, 0.5f) * (f2 / 4.0f));
                if (round != i3) {
                    edgeEffect2.finish();
                }
            }
            int i4 = i3;
            this.f1434z = currY;
            int[] iArr = this.f1432x;
            iArr[1] = 0;
            this.f1411C.c(0, i4, iArr, null, 1);
            i2 = i4 - iArr[1];
            int scrollRange = getScrollRange();
            if (i2 != 0) {
                int scrollY = getScrollY();
                o(i2, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i5 = i2 - scrollY2;
                iArr[1] = 0;
                this.f1411C.d(0, scrollY2, 0, i5, this.f1431w, 1, iArr);
                i2 = i5 - iArr[1];
            }
            if (i2 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i2 < 0) {
                        if (edgeEffect.isFinished()) {
                            edgeEffect.onAbsorb((int) this.f1417h.getCurrVelocity());
                        }
                    } else if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) this.f1417h.getCurrVelocity());
                    }
                }
                this.f1417h.abortAnimation();
                w(1);
            }
            if (this.f1417h.isFinished()) {
                postInvalidateOnAnimation();
                return;
            } else {
                w(1);
                return;
            }
        }
        round = Math.round(AbstractC0086a.A(edgeEffect, ((-i3) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (round != i3) {
            edgeEffect.finish();
        }
        i3 -= round;
        int i42 = i3;
        this.f1434z = currY;
        int[] iArr2 = this.f1432x;
        iArr2[1] = 0;
        this.f1411C.c(0, i42, iArr2, null, 1);
        i2 = i42 - iArr2[1];
        int scrollRange2 = getScrollRange();
        if (i2 != 0) {
        }
        if (i2 != 0) {
        }
        if (this.f1417h.isFinished()) {
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? (scrollY - max) + bottom : bottom;
    }

    @Override // y.InterfaceC0264h
    public final void d(int i2, int i3, int[] iArr, int i4) {
        this.f1411C.c(i2, i3, iArr, null, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00cb A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z2;
        if (!super.dispatchKeyEvent(keyEvent)) {
            this.f1416g.setEmpty();
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                    if (keyEvent.getAction() == 0) {
                        int keyCode = keyEvent.getKeyCode();
                        if (keyCode == 19) {
                            z2 = keyEvent.isAltPressed() ? j(33) : g(33);
                        } else if (keyCode == 20) {
                            z2 = keyEvent.isAltPressed() ? j(130) : g(130);
                        } else if (keyCode == 62) {
                            p(keyEvent.isShiftPressed() ? 33 : 130);
                        } else if (keyCode == 92) {
                            z2 = j(33);
                        } else if (keyCode == 93) {
                            z2 = j(130);
                        } else if (keyCode == 122) {
                            p(33);
                        } else if (keyCode == 123) {
                            p(130);
                        }
                        if (z2) {
                            return false;
                        }
                    }
                    z2 = false;
                    if (z2) {
                    }
                }
            }
            if (isFocused() && keyEvent.getKeyCode() != 4) {
                View findFocus = findFocus();
                if (findFocus == this) {
                    findFocus = null;
                }
                View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
                if (findNextFocus != null && findNextFocus != this && findNextFocus.requestFocus(130)) {
                    z2 = true;
                    if (z2) {
                    }
                }
            }
            z2 = false;
            if (z2) {
            }
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return this.f1411C.a(f2, f3, z2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f2, float f3) {
        return this.f1411C.b(f2, f3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return this.f1411C.c(i2, i3, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return this.f1411C.d(i2, i3, i4, i5, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i2;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f1418i;
        int i3 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (i.a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                i2 = getPaddingLeft();
            } else {
                i2 = 0;
            }
            if (i.a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate(i2, min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.f1419j;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getScrollRange(), scrollY) + height2;
        if (i.a(this)) {
            width2 -= getPaddingRight() + getPaddingLeft();
            i3 = getPaddingLeft();
        }
        if (i.a(this)) {
            height2 -= getPaddingBottom() + getPaddingTop();
            max -= getPaddingBottom();
        }
        canvas.translate(i3 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(save2);
    }

    @Override // y.InterfaceC0265i
    public final void e(ViewGroup viewGroup, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        m(i5, i6, iArr);
    }

    @Override // y.InterfaceC0264h
    public final boolean f(View view, View view2, int i2, int i3) {
        return (i2 & 2) != 0;
    }

    public final boolean g(int i2) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i2);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !l(findNextFocus, maxScrollAmount, getHeight())) {
            if (i2 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i2 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i2 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            r(maxScrollAmount, 0, 1, true);
        } else {
            Rect rect = this.f1416g;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            r(h(rect), 0, 1, true);
            findNextFocus.requestFocus(i2);
        }
        if (findFocus != null && findFocus.isFocused() && !l(findFocus, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0056m c0056m = this.f1410B;
        return c0056m.f757c | c0056m.f756b;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.f1412D == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f1412D = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f1412D;
    }

    public final int h(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i2 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i3 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i2 - verticalFadingEdgeLength : i2;
        int i4 = rect.bottom;
        if (i4 > i3 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i3, (childAt.getBottom() + layoutParams.bottomMargin) - i2);
        }
        if (rect.top >= scrollY || i4 >= i3) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i3 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f1411C.f(0);
    }

    public final void i(int i2) {
        if (getChildCount() > 0) {
            this.f1417h.fling(getScrollX(), getScrollY(), 0, i2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            u(2, 1);
            this.f1434z = getScrollY();
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f1411C.f3150d;
    }

    public final boolean j(int i2) {
        int childCount;
        boolean z2 = i2 == 130;
        int height = getHeight();
        Rect rect = this.f1416g;
        rect.top = 0;
        rect.bottom = height;
        if (z2 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return q(i2, rect.top, rect.bottom);
    }

    public final boolean l(View view, int i2, int i3) {
        Rect rect = this.f1416g;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i2 >= getScrollY() && rect.top - i2 <= getScrollY() + i3;
    }

    public final void m(int i2, int i3, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i2);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f1411C.d(0, scrollY2, 0, i2 - scrollY2, null, i3, iArr);
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i2, int i3) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1430v) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.f1420k = (int) motionEvent.getY(i2);
            this.f1430v = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.f1425p;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean o(int i2, int i3, int i4, int i5) {
        int i6;
        boolean z2;
        int i7;
        boolean z3;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i8 = i4 + i2;
        if (i3 <= 0 && i3 >= 0) {
            i6 = i3;
            z2 = false;
        } else {
            i6 = 0;
            z2 = true;
        }
        if (i8 > i5) {
            i7 = i5;
        } else {
            if (i8 >= 0) {
                i7 = i8;
                z3 = false;
                if (z3 && !this.f1411C.f(1)) {
                    this.f1417h.springBack(i6, i7, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i6, i7);
                return !z2 || z3;
            }
            i7 = 0;
        }
        z3 = true;
        if (z3) {
            this.f1417h.springBack(i6, i7, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i6, i7);
        if (z2) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1422m = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x011c, code lost:
    
        if (r0 >= 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x00d1, code lost:
    
        if (r4 >= 0) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02a3  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        int i7;
        float f3;
        float f4;
        long j2;
        float f5;
        float sqrt;
        int i8;
        int i9;
        float f6;
        if (motionEvent.getAction() != 8 || this.f1424o) {
            return false;
        }
        if ((motionEvent.getSource() & 2) == 2) {
            i2 = 9;
            f2 = motionEvent.getAxisValue(9);
            i3 = (int) motionEvent.getX();
        } else if ((motionEvent.getSource() & 4194304) == 4194304) {
            f2 = motionEvent.getAxisValue(26);
            i3 = getWidth() / 2;
            i2 = 26;
        } else {
            f2 = 0.0f;
            i2 = 0;
            i3 = 0;
        }
        if (f2 == 0.0f) {
            return false;
        }
        r(-((int) (getVerticalScrollFactorCompat() * f2)), i3, 1, (motionEvent.getSource() & 8194) == 8194);
        if (i2 == 0) {
            return true;
        }
        C0259c c0259c = this.f1413E;
        NestedScrollView nestedScrollView = (NestedScrollView) c0259c.f3139b.f20f;
        int[] iArr = c0259c.f3145h;
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        int i10 = 1;
        if (c0259c.f3143f == source && c0259c.f3144g == deviceId && c0259c.f3142e == i2) {
            z2 = false;
            i4 = 0;
        } else {
            Context context = c0259c.f3138a;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int deviceId2 = motionEvent.getDeviceId();
            i4 = 0;
            int source2 = motionEvent.getSource();
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 34) {
                Method method = AbstractC0252B.f3101a;
                i5 = AbstractC0251A.b(viewConfiguration, deviceId2, i2, source2);
            } else {
                Method method2 = AbstractC0252B.f3101a;
                InputDevice device = InputDevice.getDevice(deviceId2);
                if (device != null && device.getMotionRange(i2, source2) != null) {
                    Resources resources = context.getResources();
                    int identifier = (source2 == 4194304 && i2 == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier == -1) {
                        i5 = viewConfiguration.getScaledMinimumFlingVelocity();
                    } else if (identifier != 0) {
                        i5 = resources.getDimensionPixelSize(identifier);
                    }
                }
                i5 = Integer.MAX_VALUE;
            }
            iArr[0] = i5;
            int deviceId3 = motionEvent.getDeviceId();
            int source3 = motionEvent.getSource();
            if (i11 >= 34) {
                i6 = AbstractC0251A.a(viewConfiguration, deviceId3, i2, source3);
            } else {
                InputDevice device2 = InputDevice.getDevice(deviceId3);
                if (device2 != null && device2.getMotionRange(i2, source3) != null) {
                    Resources resources2 = context.getResources();
                    int identifier2 = (source3 == 4194304 && i2 == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier2 == -1) {
                        i6 = viewConfiguration.getScaledMaximumFlingVelocity();
                    } else if (identifier2 != 0) {
                        i6 = resources2.getDimensionPixelSize(identifier2);
                    }
                }
                i6 = Integer.MIN_VALUE;
            }
            iArr[1] = i6;
            c0259c.f3143f = source;
            c0259c.f3144g = deviceId;
            c0259c.f3142e = i2;
            z2 = true;
        }
        if (iArr[i4] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = c0259c.f3140c;
            if (velocityTracker == null) {
                return true;
            }
            velocityTracker.recycle();
            c0259c.f3140c = null;
            return true;
        }
        if (c0259c.f3140c == null) {
            c0259c.f3140c = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker2 = c0259c.f3140c;
        Map map = AbstractC0268l.f3152a;
        velocityTracker2.addMovement(motionEvent);
        int i12 = 20;
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            Map map2 = AbstractC0268l.f3152a;
            if (!map2.containsKey(velocityTracker2)) {
                map2.put(velocityTracker2, new C0269m());
            }
            C0269m c0269m = (C0269m) map2.get(velocityTracker2);
            long[] jArr = c0269m.f3154b;
            long eventTime = motionEvent.getEventTime();
            if (c0269m.f3156d != 0 && eventTime - jArr[c0269m.f3157e] > 40) {
                c0269m.f3156d = i4;
                c0269m.f3155c = 0.0f;
            }
            int i13 = (c0269m.f3157e + 1) % 20;
            c0269m.f3157e = i13;
            int i14 = c0269m.f3156d;
            if (i14 != 20) {
                c0269m.f3156d = i14 + 1;
            }
            c0269m.f3153a[i13] = motionEvent.getAxisValue(26);
            jArr[c0269m.f3157e] = eventTime;
        }
        velocityTracker2.computeCurrentVelocity(1000, Float.MAX_VALUE);
        C0269m c0269m2 = (C0269m) AbstractC0268l.f3152a.get(velocityTracker2);
        if (c0269m2 != null) {
            float[] fArr = c0269m2.f3153a;
            long[] jArr2 = c0269m2.f3154b;
            int i15 = c0269m2.f3156d;
            if (i15 >= 2) {
                int i16 = c0269m2.f3157e;
                int i17 = ((i16 + 20) - (i15 - 1)) % 20;
                long j3 = jArr2[i16];
                while (true) {
                    j2 = jArr2[i17];
                    if (j3 - j2 <= 100) {
                        break;
                    }
                    c0269m2.f3156d--;
                    i17 = (i17 + 1) % 20;
                }
                int i18 = c0269m2.f3156d;
                if (i18 >= 2) {
                    if (i18 == 2) {
                        int i19 = (i17 + 1) % 20;
                        if (j2 != jArr2[i19]) {
                            i7 = i2;
                            f5 = Float.MAX_VALUE;
                            i8 = 1000;
                            sqrt = fArr[i19] / (r12 - j2);
                        }
                    } else {
                        f5 = Float.MAX_VALUE;
                        float f7 = 0.0f;
                        int i20 = 0;
                        int i21 = 0;
                        while (true) {
                            if (i20 >= c0269m2.f3156d - 1) {
                                break;
                            }
                            int i22 = i20 + i17;
                            long j4 = jArr2[i22 % 20];
                            int i23 = (i22 + 1) % i12;
                            if (jArr2[i23] == j4) {
                                i9 = i2;
                            } else {
                                i21++;
                                i9 = i2;
                                float sqrt2 = (f7 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f7) * 2.0f));
                                float f8 = fArr[i23] / (jArr2[i23] - j4);
                                float abs = (Math.abs(f8) * (f8 - sqrt2)) + f7;
                                if (i21 == i10) {
                                    abs *= 0.5f;
                                }
                                f7 = abs;
                            }
                            i20++;
                            i2 = i9;
                            i12 = 20;
                            i10 = 1;
                        }
                        i7 = i2;
                        sqrt = ((float) Math.sqrt(Math.abs(f7) * 2.0f)) * (f7 < 0.0f ? -1.0f : 1.0f);
                        i8 = 1000;
                    }
                    f6 = sqrt * i8;
                    c0269m2.f3155c = f6;
                    if (f6 >= (-Math.abs(f5))) {
                        c0269m2.f3155c = -Math.abs(f5);
                    } else if (c0269m2.f3155c > Math.abs(f5)) {
                        c0269m2.f3155c = Math.abs(f5);
                    }
                }
            }
            i7 = i2;
            f5 = Float.MAX_VALUE;
            i8 = 1000;
            sqrt = 0.0f;
            f6 = sqrt * i8;
            c0269m2.f3155c = f6;
            if (f6 >= (-Math.abs(f5))) {
            }
        } else {
            i7 = i2;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            f3 = AbstractC0267k.a(velocityTracker2, i7);
        } else {
            int i24 = i7;
            if (i24 == 0) {
                f3 = velocityTracker2.getXVelocity();
            } else if (i24 == 1) {
                f3 = velocityTracker2.getYVelocity();
            } else {
                C0269m c0269m3 = (C0269m) AbstractC0268l.f3152a.get(velocityTracker2);
                f3 = (c0269m3 == null || i24 != 26) ? 0.0f : c0269m3.f3155c;
            }
        }
        float f9 = f3 * (-nestedScrollView.getVerticalScrollFactorCompat());
        float signum = Math.signum(f9);
        if (z2 || (signum != Math.signum(c0259c.f3141d) && signum != 0.0f)) {
            nestedScrollView.f1417h.abortAnimation();
        }
        if (Math.abs(f9) < iArr[0]) {
            return true;
        }
        float max = Math.max(-r1, Math.min(f9, iArr[1]));
        if (max == 0.0f) {
            f4 = 0.0f;
        } else {
            nestedScrollView.f1417h.abortAnimation();
            nestedScrollView.i((int) max);
            f4 = max;
        }
        c0259c.f3141d = f4;
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z2 = true;
        if (action == 2 && this.f1424o) {
            return true;
        }
        int i2 = action & 255;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    int i3 = this.f1430v;
                    if (i3 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i3);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i3 + " in onInterceptTouchEvent");
                        } else {
                            int y2 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y2 - this.f1420k) > this.f1428s && (2 & getNestedScrollAxes()) == 0) {
                                this.f1424o = true;
                                this.f1420k = y2;
                                if (this.f1425p == null) {
                                    this.f1425p = VelocityTracker.obtain();
                                }
                                this.f1425p.addMovement(motionEvent);
                                this.f1433y = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i2 != 3) {
                    if (i2 == 6) {
                        n(motionEvent);
                    }
                }
            }
            this.f1424o = false;
            this.f1430v = -1;
            VelocityTracker velocityTracker = this.f1425p;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f1425p = null;
            }
            if (this.f1417h.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            w(0);
        } else {
            int y3 = (int) motionEvent.getY();
            int x2 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y3 >= childAt.getTop() - scrollY && y3 < childAt.getBottom() - scrollY && x2 >= childAt.getLeft() && x2 < childAt.getRight()) {
                    this.f1420k = y3;
                    this.f1430v = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.f1425p;
                    if (velocityTracker2 == null) {
                        this.f1425p = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f1425p.addMovement(motionEvent);
                    this.f1417h.computeScrollOffset();
                    if (!v(motionEvent) && this.f1417h.isFinished()) {
                        z2 = false;
                    }
                    this.f1424o = z2;
                    u(2, 0);
                }
            }
            if (!v(motionEvent) && this.f1417h.isFinished()) {
                z2 = false;
            }
            this.f1424o = z2;
            VelocityTracker velocityTracker3 = this.f1425p;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f1425p = null;
            }
        }
        return this.f1424o;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        super.onLayout(z2, i2, i3, i4, i5);
        int i7 = 0;
        this.f1421l = false;
        View view = this.f1423n;
        if (view != null && k(view, this)) {
            View view2 = this.f1423n;
            Rect rect = this.f1416g;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h2 = h(rect);
            if (h2 != 0) {
                scrollBy(0, h2);
            }
        }
        this.f1423n = null;
        if (!this.f1422m) {
            if (this.f1409A != null) {
                scrollTo(getScrollX(), this.f1409A.f179e);
                this.f1409A = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i6 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i6 = 0;
            }
            int paddingTop = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i6 && scrollY >= 0) {
                i7 = paddingTop + scrollY > i6 ? i6 - paddingTop : scrollY;
            }
            if (i7 != scrollY) {
                scrollTo(getScrollX(), i7);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f1422m = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f1426q && View.MeasureSpec.getMode(i3) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (z2) {
            return false;
        }
        dispatchNestedFling(0.0f, f3, true);
        i((int) f3);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        return this.f1411C.b(f2, f3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        this.f1411C.c(i2, i3, iArr, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        m(i5, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        a(view, view2, i2, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i2, int i3, boolean z2, boolean z3) {
        super.scrollTo(i2, i3);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (i2 == 2) {
            i2 = 130;
        } else if (i2 == 1) {
            i2 = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i2) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i2);
        if (findNextFocus != null && l(findNextFocus, 0, getHeight())) {
            return findNextFocus.requestFocus(i2, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof l)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        l lVar = (l) parcelable;
        super.onRestoreInstanceState(lVar.getSuperState());
        this.f1409A = lVar;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        l lVar = new l(super.onSaveInstanceState());
        lVar.f179e = getScrollY();
        return lVar;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !l(findFocus, 0, i5)) {
            return;
        }
        Rect rect = this.f1416g;
        findFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(findFocus, rect);
        int h2 = h(rect);
        if (h2 != 0) {
            if (this.f1427r) {
                t(0, h2, false);
            } else {
                scrollBy(0, h2);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        return f(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        c(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0147  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        float A2;
        int round;
        int i2;
        ViewParent parent2;
        if (this.f1425p == null) {
            this.f1425p = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1433y = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float f2 = 0.0f;
        obtain.offsetLocation(0.0f, this.f1433y);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f1418i;
            EdgeEffect edgeEffect2 = this.f1419j;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f1425p;
                velocityTracker.computeCurrentVelocity(1000, this.f1429u);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f1430v);
                if (Math.abs(yVelocity) >= this.t) {
                    if (AbstractC0086a.r(edgeEffect) != 0.0f) {
                        if (s(edgeEffect, yVelocity)) {
                            edgeEffect.onAbsorb(yVelocity);
                        } else {
                            i(-yVelocity);
                        }
                    } else if (AbstractC0086a.r(edgeEffect2) != 0.0f) {
                        int i3 = -yVelocity;
                        if (s(edgeEffect2, i3)) {
                            edgeEffect2.onAbsorb(i3);
                        } else {
                            i(i3);
                        }
                    } else {
                        int i4 = -yVelocity;
                        float f3 = i4;
                        if (!this.f1411C.b(0.0f, f3)) {
                            dispatchNestedFling(0.0f, f3, true);
                            i(i4);
                        }
                    }
                } else if (this.f1417h.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f1430v = -1;
                this.f1424o = false;
                VelocityTracker velocityTracker2 = this.f1425p;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f1425p = null;
                }
                w(0);
                this.f1418i.onRelease();
                this.f1419j.onRelease();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f1430v);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f1430v + " in onTouchEvent");
                } else {
                    int y2 = (int) motionEvent.getY(findPointerIndex);
                    int i5 = this.f1420k - y2;
                    float x2 = motionEvent.getX(findPointerIndex) / getWidth();
                    float height = i5 / getHeight();
                    if (AbstractC0086a.r(edgeEffect) != 0.0f) {
                        A2 = -AbstractC0086a.A(edgeEffect, -height, x2);
                        if (AbstractC0086a.r(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                    } else {
                        if (AbstractC0086a.r(edgeEffect2) != 0.0f) {
                            A2 = AbstractC0086a.A(edgeEffect2, height, 1.0f - x2);
                            if (AbstractC0086a.r(edgeEffect2) == 0.0f) {
                                edgeEffect2.onRelease();
                            }
                        }
                        round = Math.round(f2 * getHeight());
                        if (round != 0) {
                            invalidate();
                        }
                        i2 = i5 - round;
                        if (!this.f1424o && Math.abs(i2) > this.f1428s) {
                            parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.f1424o = true;
                            i2 = i2 <= 0 ? i2 - this.f1428s : i2 + this.f1428s;
                        }
                        if (this.f1424o) {
                            int r2 = r(i2, (int) motionEvent.getX(findPointerIndex), 0, false);
                            this.f1420k = y2 - r2;
                            this.f1433y += r2;
                        }
                    }
                    f2 = A2;
                    round = Math.round(f2 * getHeight());
                    if (round != 0) {
                    }
                    i2 = i5 - round;
                    if (!this.f1424o) {
                        parent2 = getParent();
                        if (parent2 != null) {
                        }
                        this.f1424o = true;
                        if (i2 <= 0) {
                        }
                    }
                    if (this.f1424o) {
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f1424o && getChildCount() > 0) {
                    if (this.f1417h.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        postInvalidateOnAnimation();
                    }
                }
                this.f1430v = -1;
                this.f1424o = false;
                VelocityTracker velocityTracker3 = this.f1425p;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f1425p = null;
                }
                w(0);
                this.f1418i.onRelease();
                this.f1419j.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f1420k = (int) motionEvent.getY(actionIndex);
                this.f1430v = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                n(motionEvent);
                this.f1420k = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f1430v));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f1424o && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f1417h.isFinished()) {
                this.f1417h.abortAnimation();
                w(1);
            }
            int y3 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f1420k = y3;
            this.f1430v = pointerId;
            u(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f1425p;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public final void p(int i2) {
        boolean z2 = i2 == 130;
        int height = getHeight();
        Rect rect = this.f1416g;
        if (z2) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i3 = rect.top;
        int i4 = height + i3;
        rect.bottom = i4;
        q(i2, i3, i4);
    }

    public final boolean q(int i2, int i3, int i4) {
        boolean z2;
        int height = getHeight();
        int scrollY = getScrollY();
        int i5 = height + scrollY;
        boolean z3 = i2 == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z4 = false;
        for (int i6 = 0; i6 < size; i6++) {
            View view2 = focusables.get(i6);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i3 < bottom && top < i4) {
                boolean z5 = i3 < top && bottom < i4;
                if (view == null) {
                    view = view2;
                    z4 = z5;
                } else {
                    boolean z6 = (z3 && top < view.getTop()) || (!z3 && bottom > view.getBottom());
                    if (z4) {
                        if (z5) {
                            if (!z6) {
                            }
                            view = view2;
                        }
                    } else if (z5) {
                        view = view2;
                        z4 = true;
                    } else {
                        if (!z6) {
                        }
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i3 < scrollY || i4 > i5) {
            r(z3 ? i3 - scrollY : i4 - i5, 0, 1, true);
            z2 = true;
        } else {
            z2 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i2);
        }
        return z2;
    }

    public final int r(int i2, int i3, int i4, boolean z2) {
        int i5;
        int i6;
        boolean z3;
        VelocityTracker velocityTracker;
        if (i4 == 1) {
            u(2, i4);
        }
        boolean c2 = this.f1411C.c(0, i2, this.f1432x, this.f1431w, i4);
        int[] iArr = this.f1431w;
        int[] iArr2 = this.f1432x;
        if (c2) {
            i5 = i2 - iArr2[1];
            i6 = iArr[1];
        } else {
            i5 = i2;
            i6 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z4 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z2;
        boolean z5 = o(i5, 0, scrollY, scrollRange) && !this.f1411C.f(i4);
        int scrollY2 = getScrollY() - scrollY;
        iArr2[1] = 0;
        this.f1411C.d(0, scrollY2, 0, i5 - scrollY2, this.f1431w, i4, iArr2);
        int i7 = i6 + iArr[1];
        int i8 = i5 - iArr2[1];
        int i9 = scrollY + i8;
        EdgeEffect edgeEffect = this.f1419j;
        EdgeEffect edgeEffect2 = this.f1418i;
        if (i9 < 0) {
            if (z4) {
                AbstractC0086a.A(edgeEffect2, (-i8) / getHeight(), i3 / getWidth());
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i9 > scrollRange && z4) {
            AbstractC0086a.A(edgeEffect, i8 / getHeight(), 1.0f - (i3 / getWidth()));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (edgeEffect2.isFinished() && edgeEffect.isFinished()) {
            z3 = z5;
        } else {
            postInvalidateOnAnimation();
            z3 = false;
        }
        if (z3 && i4 == 0 && (velocityTracker = this.f1425p) != null) {
            velocityTracker.clear();
        }
        if (i4 == 1) {
            w(i4);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i7;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f1421l) {
            this.f1423n = view2;
        } else {
            Rect rect = this.f1416g;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h2 = h(rect);
            if (h2 != 0) {
                scrollBy(0, h2);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int h2 = h(rect);
        boolean z3 = h2 != 0;
        if (z3) {
            if (z2) {
                scrollBy(0, h2);
                return z3;
            }
            t(0, h2, false);
        }
        return z3;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        VelocityTracker velocityTracker;
        if (z2 && (velocityTracker = this.f1425p) != null) {
            velocityTracker.recycle();
            this.f1425p = null;
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f1421l = true;
        super.requestLayout();
    }

    public final boolean s(EdgeEffect edgeEffect, int i2) {
        if (i2 > 0) {
            return true;
        }
        float r2 = AbstractC0086a.r(edgeEffect) * getHeight();
        float abs = Math.abs(-i2) * 0.35f;
        float f2 = this.f1414e * 0.015f;
        double log = Math.log(abs / f2);
        double d2 = f1407F;
        return ((float) (Math.exp((d2 / (d2 - 1.0d)) * log) * ((double) f2))) < r2;
    }

    @Override // android.view.View
    public final void scrollTo(int i2, int i3) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i2 < 0) {
                i2 = 0;
            } else if (width + i2 > width2) {
                i2 = width2 - width;
            }
            if (height >= height2 || i3 < 0) {
                i3 = 0;
            } else if (height + i3 > height2) {
                i3 = height2 - height;
            }
            if (i2 == getScrollX() && i3 == getScrollY()) {
                return;
            }
            super.scrollTo(i2, i3);
        }
    }

    public void setFillViewport(boolean z2) {
        if (z2 != this.f1426q) {
            this.f1426q = z2;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        C0263g c0263g = this.f1411C;
        if (c0263g.f3150d) {
            ViewGroup viewGroup = c0263g.f3149c;
            Field field = x.f3160a;
            AbstractC0272p.z(viewGroup);
        }
        c0263g.f3150d = z2;
    }

    public void setSmoothScrollingEnabled(boolean z2) {
        this.f1427r = z2;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i2) {
        return this.f1411C.g(i2, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        w(0);
    }

    public final void t(int i2, int i3, boolean z2) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f1415f > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int max = Math.max(0, Math.min(i3 + scrollY, Math.max(0, height - height2))) - scrollY;
            this.f1417h.startScroll(getScrollX(), scrollY, 0, max, 250);
            if (z2) {
                u(2, 1);
            } else {
                w(1);
            }
            this.f1434z = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f1417h.isFinished()) {
                this.f1417h.abortAnimation();
                w(1);
            }
            scrollBy(i2, i3);
        }
        this.f1415f = AnimationUtils.currentAnimationTimeMillis();
    }

    public final void u(int i2, int i3) {
        this.f1411C.g(2, i3);
    }

    public final boolean v(MotionEvent motionEvent) {
        boolean z2;
        EdgeEffect edgeEffect = this.f1418i;
        if (AbstractC0086a.r(edgeEffect) != 0.0f) {
            AbstractC0086a.A(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z2 = true;
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect2 = this.f1419j;
        if (AbstractC0086a.r(edgeEffect2) == 0.0f) {
            return z2;
        }
        AbstractC0086a.A(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void w(int i2) {
        this.f1411C.h(i2);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2) {
        if (getChildCount() <= 0) {
            super.addView(view, i2);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void setOnScrollChangeListener(j jVar) {
    }
}
