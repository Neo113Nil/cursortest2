package androidx.core.widget;

import a0.a;
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
import com.google.android.material.datepicker.g;
import f1.h0;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.d0;
import n0.k;
import n0.l0;
import n0.m;
import n0.m0;
import n0.s;
import n0.u;
import n0.v;
import n0.w;
import r0.c;
import r0.e;
import r0.f;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements m {
    public static final float H = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final g I = new g(4);
    public static final int[] J = {R.attr.fillViewport};
    public int A;
    public int B;
    public r0.g C;
    public final h0 D;
    public final k E;
    public float F;
    public final n0.g G;

    /* renamed from: f, reason: collision with root package name */
    public final float f291f;

    /* renamed from: g, reason: collision with root package name */
    public long f292g;

    /* renamed from: h, reason: collision with root package name */
    public final Rect f293h;
    public final OverScroller i;

    /* renamed from: j, reason: collision with root package name */
    public final EdgeEffect f294j;

    /* renamed from: k, reason: collision with root package name */
    public final EdgeEffect f295k;

    /* renamed from: l, reason: collision with root package name */
    public s f296l;

    /* renamed from: m, reason: collision with root package name */
    public int f297m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f298n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f299o;

    /* renamed from: p, reason: collision with root package name */
    public View f300p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f301q;

    /* renamed from: r, reason: collision with root package name */
    public VelocityTracker f302r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f303s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f304t;

    /* renamed from: u, reason: collision with root package name */
    public final int f305u;

    /* renamed from: v, reason: collision with root package name */
    public final int f306v;

    /* renamed from: w, reason: collision with root package name */
    public final int f307w;

    /* renamed from: x, reason: collision with root package name */
    public int f308x;

    /* renamed from: y, reason: collision with root package name */
    public final int[] f309y;

    /* renamed from: z, reason: collision with root package name */
    public final int[] f310z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.oriondriftchasers.arordrft.R.attr.nestedScrollViewStyle);
        this.f293h = new Rect();
        this.f298n = true;
        this.f299o = false;
        this.f300p = null;
        this.f301q = false;
        this.f304t = true;
        this.f308x = -1;
        this.f309y = new int[2];
        this.f310z = new int[2];
        this.G = new n0.g(getContext(), new a(27, this));
        int i = Build.VERSION.SDK_INT;
        this.f294j = i >= 31 ? c.a(context, attributeSet) : new EdgeEffect(context);
        this.f295k = i >= 31 ? c.a(context, attributeSet) : new EdgeEffect(context);
        this.f291f = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.i = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f305u = viewConfiguration.getScaledTouchSlop();
        this.f306v = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f307w = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, J, com.oriondriftchasers.arordrft.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.D = new h0();
        this.E = new k(this);
        setNestedScrollingEnabled(true);
        l0.m(this, I);
    }

    private s getScrollFeedbackProvider() {
        if (this.f296l == null) {
            this.f296l = new s(this);
        }
        return this.f296l;
    }

    public static boolean l(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && l((View) parent, nestedScrollView);
    }

    @Override // n0.l
    public final void a(View view, View view2, int i, int i4) {
        h0 h0Var = this.D;
        if (i4 == 1) {
            h0Var.f1365b = i;
        } else {
            h0Var.f1364a = i;
        }
        this.E.g(2, i4);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // n0.l
    public final void b(View view, int i) {
        h0 h0Var = this.D;
        if (i == 1) {
            h0Var.f1365b = 0;
        } else {
            h0Var.f1364a = 0;
        }
        w(i);
    }

    @Override // n0.l
    public final void c(View view, int i, int i4, int[] iArr, int i5) {
        this.E.c(i, i4, i5, iArr, null);
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

    /* JADX WARN: Removed duplicated region for block: B:16:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fc  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void computeScroll() {
        int round;
        int i;
        if (this.i.isFinished()) {
            return;
        }
        this.i.computeScrollOffset();
        int currY = this.i.getCurrY();
        int i4 = currY - this.B;
        int height = getHeight();
        EdgeEffect edgeEffect = this.f294j;
        EdgeEffect edgeEffect2 = this.f295k;
        if (i4 <= 0 || h.a.w(edgeEffect) == 0.0f) {
            if (i4 < 0 && h.a.w(edgeEffect2) != 0.0f) {
                float f2 = height;
                round = Math.round(h.a.W(edgeEffect2, (i4 * 4.0f) / f2, 0.5f) * (f2 / 4.0f));
                if (round != i4) {
                    edgeEffect2.finish();
                }
            }
            int i5 = i4;
            this.B = currY;
            int[] iArr = this.f310z;
            iArr[1] = 0;
            this.E.c(0, i5, 1, iArr, null);
            i = i5 - iArr[1];
            int scrollRange = getScrollRange();
            if (Build.VERSION.SDK_INT >= 35) {
                e.a(this, Math.abs(this.i.getCurrVelocity()));
            }
            if (i != 0) {
                int scrollY = getScrollY();
                p(i, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i6 = i - scrollY2;
                iArr[1] = 0;
                this.E.d(0, scrollY2, 0, i6, this.f309y, 1, iArr);
                i = i6 - iArr[1];
            }
            if (i != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i < 0) {
                        if (edgeEffect.isFinished()) {
                            edgeEffect.onAbsorb((int) this.i.getCurrVelocity());
                        }
                    } else if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) this.i.getCurrVelocity());
                    }
                }
                this.i.abortAnimation();
                w(1);
            }
            if (this.i.isFinished()) {
                postInvalidateOnAnimation();
                return;
            } else {
                w(1);
                return;
            }
        }
        round = Math.round(h.a.W(edgeEffect, ((-i4) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (round != i4) {
            edgeEffect.finish();
        }
        i4 -= round;
        int i52 = i4;
        this.B = currY;
        int[] iArr2 = this.f310z;
        iArr2[1] = 0;
        this.E.c(0, i52, 1, iArr2, null);
        i = i52 - iArr2[1];
        int scrollRange2 = getScrollRange();
        if (Build.VERSION.SDK_INT >= 35) {
        }
        if (i != 0) {
        }
        if (i != 0) {
        }
        if (this.i.isFinished()) {
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

    @Override // n0.m
    public final void d(View view, int i, int i4, int i5, int i6, int i7, int[] iArr) {
        n(i6, i7, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || i(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f2, float f4, boolean z3) {
        return this.E.a(f2, f4, z3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f2, float f4) {
        return this.E.b(f2, f4);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i4, int[] iArr, int[] iArr2) {
        return this.E.c(i, i4, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i4, int i5, int i6, int[] iArr) {
        return this.E.d(i, i4, i5, i6, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f294j;
        int i4 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                i = getPaddingLeft();
            } else {
                i = 0;
            }
            if (getClipToPadding()) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate(i, min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.f295k;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getScrollRange(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingRight() + getPaddingLeft();
            i4 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingBottom() + getPaddingTop();
            max -= getPaddingBottom();
        }
        canvas.translate(i4 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(save2);
    }

    @Override // n0.l
    public final void e(View view, int i, int i4, int i5, int i6, int i7) {
        n(i6, i7, null);
    }

    @Override // n0.l
    public final boolean f(View view, View view2, int i, int i4) {
        return (i & 2) != 0;
    }

    public final boolean g(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View view = findFocus;
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            s(maxScrollAmount, -1, null, 0, 1, true);
        } else {
            Rect rect = this.f293h;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            s(h(rect), -1, null, 0, 1, true);
            findNextFocus.requestFocus(i);
        }
        if (view != null && view.isFocused() && !m(view, 0, getHeight())) {
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
        h0 h0Var = this.D;
        return h0Var.f1365b | h0Var.f1364a;
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
        if (this.F == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.F = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.F;
    }

    public final int h(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i4 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i5 = rect.bottom;
        if (i5 > i4 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i4, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        }
        if (rect.top >= scrollY || i5 >= i4) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i4 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.E.f(0);
    }

    public final boolean i(KeyEvent keyEvent) {
        this.f293h.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 19) {
                        return keyEvent.isAltPressed() ? k(33) : g(33);
                    }
                    if (keyCode == 20) {
                        return keyEvent.isAltPressed() ? k(130) : g(130);
                    }
                    if (keyCode == 62) {
                        q(keyEvent.isShiftPressed() ? 33 : 130);
                        return false;
                    }
                    if (keyCode == 92) {
                        return k(33);
                    }
                    if (keyCode == 93) {
                        return k(130);
                    }
                    if (keyCode == 122) {
                        q(33);
                        return false;
                    }
                    if (keyCode == 123) {
                        q(130);
                        return false;
                    }
                }
                return false;
            }
        }
        if (isFocused() && keyEvent.getKeyCode() != 4) {
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            if (findNextFocus != null && findNextFocus != this && findNextFocus.requestFocus(130)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.E.d;
    }

    public final void j(int i) {
        if (getChildCount() > 0) {
            this.i.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.E.g(2, 1);
            this.B = getScrollY();
            postInvalidateOnAnimation();
            if (Build.VERSION.SDK_INT >= 35) {
                e.a(this, Math.abs(this.i.getCurrVelocity()));
            }
        }
    }

    public final boolean k(int i) {
        int childCount;
        boolean z3 = i == 130;
        int height = getHeight();
        Rect rect = this.f293h;
        rect.top = 0;
        rect.bottom = height;
        if (z3 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return r(i, rect.top, rect.bottom);
    }

    public final boolean m(View view, int i, int i4) {
        Rect rect = this.f293h;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i >= getScrollY() && rect.top - i <= getScrollY() + i4;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i, int i4) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i4, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(int i, int i4, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.E.d(0, scrollY2, 0, i - scrollY2, null, i4, iArr);
    }

    public final void o(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f308x) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f297m = (int) motionEvent.getY(i);
            this.f308x = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f302r;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f299o = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x0122, code lost:
    
        if (r0 >= 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x00d7, code lost:
    
        if (r7 >= 0) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02ab  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f2;
        int i;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z3;
        NestedScrollView nestedScrollView;
        float f4;
        NestedScrollView nestedScrollView2;
        float f5;
        long j4;
        float f6;
        float sqrt;
        int i8;
        NestedScrollView nestedScrollView3;
        float f7;
        if (motionEvent.getAction() != 8 || this.f301q) {
            return false;
        }
        if ((motionEvent.getSource() & 2) == 2) {
            float axisValue = motionEvent.getAxisValue(9);
            i4 = (int) motionEvent.getX();
            i = 9;
            f2 = axisValue;
        } else if ((motionEvent.getSource() & 4194304) == 4194304) {
            float axisValue2 = motionEvent.getAxisValue(26);
            i4 = getWidth() / 2;
            f2 = axisValue2;
            i = 26;
        } else {
            f2 = 0.0f;
            i = 0;
            i4 = 0;
        }
        if (f2 == 0.0f) {
            return false;
        }
        s(-((int) (getVerticalScrollFactorCompat() * f2)), i, motionEvent, i4, 1, (motionEvent.getSource() & 8194) == 8194);
        if (i != 0) {
            n0.g gVar = this.G;
            NestedScrollView nestedScrollView4 = (NestedScrollView) gVar.f2729b.f81g;
            int[] iArr = gVar.f2734h;
            int source = motionEvent.getSource();
            int deviceId = motionEvent.getDeviceId();
            int i9 = 1;
            if (gVar.f2732f == source && gVar.f2733g == deviceId && gVar.f2731e == i) {
                z3 = false;
                i5 = 0;
            } else {
                Context context = gVar.f2728a;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int deviceId2 = motionEvent.getDeviceId();
                i5 = 0;
                int source2 = motionEvent.getSource();
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 34) {
                    Method method = m0.f2762a;
                    i6 = u.f(viewConfiguration, deviceId2, i, source2);
                } else {
                    Method method2 = m0.f2762a;
                    InputDevice device = InputDevice.getDevice(deviceId2);
                    if (device != null && device.getMotionRange(i, source2) != null) {
                        Resources resources = context.getResources();
                        int identifier = (source2 == 4194304 && i == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                        Objects.requireNonNull(viewConfiguration);
                        if (identifier == -1) {
                            i6 = viewConfiguration.getScaledMinimumFlingVelocity();
                        } else if (identifier != 0) {
                            i6 = resources.getDimensionPixelSize(identifier);
                        }
                    }
                    i6 = Integer.MAX_VALUE;
                }
                iArr[0] = i6;
                int deviceId3 = motionEvent.getDeviceId();
                int source3 = motionEvent.getSource();
                if (i10 >= 34) {
                    i7 = u.e(viewConfiguration, deviceId3, i, source3);
                } else {
                    InputDevice device2 = InputDevice.getDevice(deviceId3);
                    if (device2 != null && device2.getMotionRange(i, source3) != null) {
                        Resources resources2 = context.getResources();
                        int identifier2 = (source3 == 4194304 && i == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                        Objects.requireNonNull(viewConfiguration);
                        if (identifier2 == -1) {
                            i7 = viewConfiguration.getScaledMaximumFlingVelocity();
                        } else if (identifier2 != 0) {
                            i7 = resources2.getDimensionPixelSize(identifier2);
                        }
                    }
                    i7 = Integer.MIN_VALUE;
                }
                iArr[1] = i7;
                gVar.f2732f = source;
                gVar.f2733g = deviceId;
                gVar.f2731e = i;
                z3 = true;
            }
            if (iArr[i5] == Integer.MAX_VALUE) {
                VelocityTracker velocityTracker = gVar.f2730c;
                if (velocityTracker == null) {
                    return true;
                }
                velocityTracker.recycle();
                gVar.f2730c = null;
                return true;
            }
            if (gVar.f2730c == null) {
                gVar.f2730c = VelocityTracker.obtain();
            }
            VelocityTracker velocityTracker2 = gVar.f2730c;
            Map map = v.f2790a;
            velocityTracker2.addMovement(motionEvent);
            int i11 = 20;
            if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
                Map map2 = v.f2790a;
                if (!map2.containsKey(velocityTracker2)) {
                    map2.put(velocityTracker2, new w());
                }
                w wVar = (w) map2.get(velocityTracker2);
                long[] jArr = wVar.f2795b;
                long eventTime = motionEvent.getEventTime();
                if (wVar.d != 0 && eventTime - jArr[wVar.f2797e] > 40) {
                    wVar.d = i5;
                    wVar.f2796c = 0.0f;
                }
                int i12 = (wVar.f2797e + 1) % 20;
                wVar.f2797e = i12;
                int i13 = wVar.d;
                if (i13 != 20) {
                    wVar.d = i13 + 1;
                }
                wVar.f2794a[i12] = motionEvent.getAxisValue(26);
                jArr[wVar.f2797e] = eventTime;
            }
            velocityTracker2.computeCurrentVelocity(1000, Float.MAX_VALUE);
            w wVar2 = (w) v.f2790a.get(velocityTracker2);
            if (wVar2 != null) {
                float[] fArr = wVar2.f2794a;
                long[] jArr2 = wVar2.f2795b;
                int i14 = wVar2.d;
                if (i14 >= 2) {
                    int i15 = wVar2.f2797e;
                    int i16 = ((i15 + 20) - (i14 - 1)) % 20;
                    long j5 = jArr2[i15];
                    while (true) {
                        j4 = jArr2[i16];
                        if (j5 - j4 <= 100) {
                            break;
                        }
                        wVar2.d--;
                        i16 = (i16 + 1) % 20;
                    }
                    int i17 = wVar2.d;
                    if (i17 >= 2) {
                        if (i17 == 2) {
                            int i18 = (i16 + 1) % 20;
                            if (j4 != jArr2[i18]) {
                                nestedScrollView = nestedScrollView4;
                                f6 = Float.MAX_VALUE;
                                i8 = 1000;
                                sqrt = fArr[i18] / (r12 - j4);
                            }
                        } else {
                            f6 = Float.MAX_VALUE;
                            float f8 = 0.0f;
                            int i19 = 0;
                            int i20 = 0;
                            while (true) {
                                if (i19 >= wVar2.d - 1) {
                                    break;
                                }
                                int i21 = i19 + i16;
                                long j6 = jArr2[i21 % 20];
                                int i22 = (i21 + 1) % i11;
                                if (jArr2[i22] == j6) {
                                    nestedScrollView3 = nestedScrollView4;
                                } else {
                                    i20++;
                                    nestedScrollView3 = nestedScrollView4;
                                    float sqrt2 = (f8 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f8) * 2.0f));
                                    float f9 = fArr[i22] / (jArr2[i22] - j6);
                                    float abs = (Math.abs(f9) * (f9 - sqrt2)) + f8;
                                    if (i20 == i9) {
                                        abs *= 0.5f;
                                    }
                                    f8 = abs;
                                }
                                i19++;
                                nestedScrollView4 = nestedScrollView3;
                                i11 = 20;
                                i9 = 1;
                            }
                            nestedScrollView = nestedScrollView4;
                            sqrt = ((float) Math.sqrt(Math.abs(f8) * 2.0f)) * (f8 < 0.0f ? -1.0f : 1.0f);
                            i8 = 1000;
                        }
                        f7 = sqrt * i8;
                        wVar2.f2796c = f7;
                        if (f7 >= (-Math.abs(f6))) {
                            wVar2.f2796c = -Math.abs(f6);
                        } else if (wVar2.f2796c > Math.abs(f6)) {
                            wVar2.f2796c = Math.abs(f6);
                        }
                    }
                }
                nestedScrollView = nestedScrollView4;
                f6 = Float.MAX_VALUE;
                i8 = 1000;
                sqrt = 0.0f;
                f7 = sqrt * i8;
                wVar2.f2796c = f7;
                if (f7 >= (-Math.abs(f6))) {
                }
            } else {
                nestedScrollView = nestedScrollView4;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                f4 = u.b(velocityTracker2, i);
            } else if (i == 0) {
                f4 = velocityTracker2.getXVelocity();
            } else if (i == 1) {
                f4 = velocityTracker2.getYVelocity();
            } else {
                w wVar3 = (w) v.f2790a.get(velocityTracker2);
                f4 = (wVar3 == null || i != 26) ? 0.0f : wVar3.f2796c;
            }
            float f10 = f4 * (-nestedScrollView.getVerticalScrollFactorCompat());
            float signum = Math.signum(f10);
            if (z3 || !(signum == Math.signum(gVar.d) || signum == 0.0f)) {
                nestedScrollView2 = nestedScrollView;
                nestedScrollView2.i.abortAnimation();
            } else {
                nestedScrollView2 = nestedScrollView;
            }
            if (Math.abs(f10) >= iArr[0]) {
                float max = Math.max(-r2, Math.min(f10, iArr[1]));
                if (max == 0.0f) {
                    f5 = 0.0f;
                } else {
                    nestedScrollView2.i.abortAnimation();
                    nestedScrollView2.j((int) max);
                    f5 = max;
                }
                gVar.d = f5;
                return true;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z3 = true;
        if (action == 2 && this.f301q) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i4 = this.f308x;
                    if (i4 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i4);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i4 + " in onInterceptTouchEvent");
                        } else {
                            int y3 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y3 - this.f297m) > this.f305u && (2 & getNestedScrollAxes()) == 0) {
                                this.f301q = true;
                                this.f297m = y3;
                                if (this.f302r == null) {
                                    this.f302r = VelocityTracker.obtain();
                                }
                                this.f302r.addMovement(motionEvent);
                                this.A = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        o(motionEvent);
                    }
                }
            }
            this.f301q = false;
            this.f308x = -1;
            VelocityTracker velocityTracker = this.f302r;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f302r = null;
            }
            if (this.i.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            w(0);
        } else {
            int y4 = (int) motionEvent.getY();
            int x3 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y4 >= childAt.getTop() - scrollY && y4 < childAt.getBottom() - scrollY && x3 >= childAt.getLeft() && x3 < childAt.getRight()) {
                    this.f297m = y4;
                    this.f308x = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.f302r;
                    if (velocityTracker2 == null) {
                        this.f302r = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f302r.addMovement(motionEvent);
                    this.i.computeScrollOffset();
                    if (!v(motionEvent) && this.i.isFinished()) {
                        z3 = false;
                    }
                    this.f301q = z3;
                    this.E.g(2, 0);
                }
            }
            if (!v(motionEvent) && this.i.isFinished()) {
                z3 = false;
            }
            this.f301q = z3;
            VelocityTracker velocityTracker3 = this.f302r;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f302r = null;
            }
        }
        return this.f301q;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i4, int i5, int i6) {
        int i7;
        super.onLayout(z3, i, i4, i5, i6);
        int i8 = 0;
        this.f298n = false;
        View view = this.f300p;
        if (view != null && l(view, this)) {
            View view2 = this.f300p;
            Rect rect = this.f293h;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h4 = h(rect);
            if (h4 != 0) {
                scrollBy(0, h4);
            }
        }
        this.f300p = null;
        if (!this.f299o) {
            if (this.C != null) {
                scrollTo(getScrollX(), this.C.f3140f);
                this.C = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i7 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i7 = 0;
            }
            int paddingTop = ((i6 - i4) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i7 && scrollY >= 0) {
                i8 = paddingTop + scrollY > i7 ? i7 - paddingTop : scrollY;
            }
            if (i8 != scrollY) {
                scrollTo(getScrollX(), i8);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f299o = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
        if (this.f303s && View.MeasureSpec.getMode(i4) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f4, boolean z3) {
        if (z3) {
            return false;
        }
        dispatchNestedFling(0.0f, f4, true);
        j((int) f4);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f4) {
        return this.E.b(f2, f4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i4, int[] iArr) {
        this.E.c(i, i4, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i4, int i5, int i6) {
        n(i6, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        a(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i, int i4, boolean z3, boolean z4) {
        super.scrollTo(i, i4);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (findNextFocus != null && m(findNextFocus, 0, getHeight())) {
            return findNextFocus.requestFocus(i, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof r0.g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        r0.g gVar = (r0.g) parcelable;
        super.onRestoreInstanceState(gVar.getSuperState());
        this.C = gVar;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        r0.g gVar = new r0.g(super.onSaveInstanceState());
        gVar.f3140f = getScrollY();
        return gVar;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i4, int i5, int i6) {
        super.onScrollChanged(i, i4, i5, i6);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i4, int i5, int i6) {
        super.onSizeChanged(i, i4, i5, i6);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !m(findFocus, 0, i6)) {
            return;
        }
        Rect rect = this.f293h;
        findFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(findFocus, rect);
        int h4 = h(rect);
        if (h4 != 0) {
            if (this.f304t) {
                u(0, h4, false);
            } else {
                scrollBy(0, h4);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return f(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        b(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0148  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        float W;
        int round;
        int i;
        ViewParent parent2;
        if (this.f302r == null) {
            this.f302r = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.A = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float f2 = 0.0f;
        obtain.offsetLocation(0.0f, this.A);
        k kVar = this.E;
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f294j;
            EdgeEffect edgeEffect2 = this.f295k;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f302r;
                velocityTracker.computeCurrentVelocity(1000, this.f307w);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f308x);
                if (Math.abs(yVelocity) >= this.f306v) {
                    if (h.a.w(edgeEffect) != 0.0f) {
                        if (t(edgeEffect, yVelocity)) {
                            edgeEffect.onAbsorb(yVelocity);
                        } else {
                            j(-yVelocity);
                        }
                    } else if (h.a.w(edgeEffect2) != 0.0f) {
                        int i4 = -yVelocity;
                        if (t(edgeEffect2, i4)) {
                            edgeEffect2.onAbsorb(i4);
                        } else {
                            j(i4);
                        }
                    } else {
                        int i5 = -yVelocity;
                        float f4 = i5;
                        if (!kVar.b(0.0f, f4)) {
                            dispatchNestedFling(0.0f, f4, true);
                            j(i5);
                        }
                    }
                } else if (this.i.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f308x = -1;
                this.f301q = false;
                VelocityTracker velocityTracker2 = this.f302r;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f302r = null;
                }
                w(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f308x);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f308x + " in onTouchEvent");
                } else {
                    int y3 = (int) motionEvent.getY(findPointerIndex);
                    int i6 = this.f297m - y3;
                    float x3 = motionEvent.getX(findPointerIndex) / getWidth();
                    float height = i6 / getHeight();
                    if (h.a.w(edgeEffect) != 0.0f) {
                        W = -h.a.W(edgeEffect, -height, x3);
                        if (h.a.w(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                    } else {
                        if (h.a.w(edgeEffect2) != 0.0f) {
                            W = h.a.W(edgeEffect2, height, 1.0f - x3);
                            if (h.a.w(edgeEffect2) == 0.0f) {
                                edgeEffect2.onRelease();
                            }
                        }
                        round = Math.round(f2 * getHeight());
                        if (round != 0) {
                            invalidate();
                        }
                        i = i6 - round;
                        if (!this.f301q && Math.abs(i) > this.f305u) {
                            parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.f301q = true;
                            i = i <= 0 ? i - this.f305u : i + this.f305u;
                        }
                        if (this.f301q) {
                            int s3 = s(i, 1, motionEvent, (int) motionEvent.getX(findPointerIndex), 0, false);
                            this.f297m = y3 - s3;
                            this.A += s3;
                        }
                    }
                    f2 = W;
                    round = Math.round(f2 * getHeight());
                    if (round != 0) {
                    }
                    i = i6 - round;
                    if (!this.f301q) {
                        parent2 = getParent();
                        if (parent2 != null) {
                        }
                        this.f301q = true;
                        if (i <= 0) {
                        }
                    }
                    if (this.f301q) {
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f301q && getChildCount() > 0) {
                    if (this.i.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        postInvalidateOnAnimation();
                    }
                }
                this.f308x = -1;
                this.f301q = false;
                VelocityTracker velocityTracker3 = this.f302r;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f302r = null;
                }
                w(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f297m = (int) motionEvent.getY(actionIndex);
                this.f308x = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                o(motionEvent);
                this.f297m = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f308x));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f301q && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.i.isFinished()) {
                this.i.abortAnimation();
                w(1);
            }
            int y4 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f297m = y4;
            this.f308x = pointerId;
            kVar.g(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f302r;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public final boolean p(int i, int i4, int i5, int i6) {
        int i7;
        boolean z3;
        int i8;
        boolean z4;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i9 = i5 + i;
        if (i4 <= 0 && i4 >= 0) {
            i7 = i4;
            z3 = false;
        } else {
            i7 = 0;
            z3 = true;
        }
        if (i9 > i6) {
            i8 = i6;
        } else {
            if (i9 >= 0) {
                i8 = i9;
                z4 = false;
                if (z4 && !this.E.f(1)) {
                    this.i.springBack(i7, i8, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i7, i8);
                return !z3 || z4;
            }
            i8 = 0;
        }
        z4 = true;
        if (z4) {
            this.i.springBack(i7, i8, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i7, i8);
        if (z3) {
        }
    }

    public final void q(int i) {
        boolean z3 = i == 130;
        int height = getHeight();
        Rect rect = this.f293h;
        if (z3) {
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
        int i4 = rect.top;
        int i5 = height + i4;
        rect.bottom = i5;
        r(i, i4, i5);
    }

    public final boolean r(int i, int i4, int i5) {
        boolean z3;
        int height = getHeight();
        int scrollY = getScrollY();
        int i6 = height + scrollY;
        boolean z4 = i == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z5 = false;
        for (int i7 = 0; i7 < size; i7++) {
            View view2 = focusables.get(i7);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i4 < bottom && top < i5) {
                boolean z6 = i4 < top && bottom < i5;
                if (view == null) {
                    view = view2;
                    z5 = z6;
                } else {
                    boolean z7 = (z4 && top < view.getTop()) || (!z4 && bottom > view.getBottom());
                    if (z5) {
                        if (z6) {
                            if (!z7) {
                            }
                            view = view2;
                        }
                    } else if (z6) {
                        view = view2;
                        z5 = true;
                    } else {
                        if (!z7) {
                        }
                        view = view2;
                    }
                }
            }
        }
        View view3 = view == null ? this : view;
        if (i4 < scrollY || i5 > i6) {
            s(z4 ? i4 - scrollY : i5 - i6, -1, null, 0, 1, true);
            z3 = true;
        } else {
            z3 = false;
        }
        if (view3 != findFocus()) {
            view3.requestFocus(i);
        }
        return z3;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f298n) {
            this.f300p = view2;
        } else {
            Rect rect = this.f293h;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h4 = h(rect);
            if (h4 != 0) {
                scrollBy(0, h4);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z3) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int h4 = h(rect);
        boolean z4 = h4 != 0;
        if (z4) {
            if (z3) {
                scrollBy(0, h4);
                return z4;
            }
            u(0, h4, false);
        }
        return z4;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z3) {
        VelocityTracker velocityTracker;
        if (z3 && (velocityTracker = this.f302r) != null) {
            velocityTracker.recycle();
            this.f302r = null;
        }
        super.requestDisallowInterceptTouchEvent(z3);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f298n = true;
        super.requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int s(int i, int i4, MotionEvent motionEvent, int i5, int i6, boolean z3) {
        int i7;
        int i8;
        boolean z4;
        boolean z5;
        VelocityTracker velocityTracker;
        k kVar = this.E;
        if (i6 == 1) {
            kVar.g(2, i6);
        }
        boolean c4 = this.E.c(0, i, i6, this.f310z, this.f309y);
        int[] iArr = this.f309y;
        int[] iArr2 = this.f310z;
        if (c4) {
            i7 = i - iArr2[1];
            i8 = iArr[1];
        } else {
            i7 = i;
            i8 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z6 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z3;
        boolean z7 = p(i7, 0, scrollY, scrollRange) && !kVar.f(i6);
        int scrollY2 = getScrollY() - scrollY;
        if (motionEvent != null && scrollY2 != 0) {
            getScrollFeedbackProvider().f2777a.onScrollProgress(motionEvent.getDeviceId(), motionEvent.getSource(), i4, scrollY2);
        }
        iArr2[1] = 0;
        this.E.d(0, scrollY2, 0, i7 - scrollY2, this.f309y, i6, iArr2);
        int i9 = i8 + iArr[1];
        int i10 = i7 - iArr2[1];
        int i11 = scrollY + i10;
        EdgeEffect edgeEffect = this.f295k;
        EdgeEffect edgeEffect2 = this.f294j;
        if (i11 < 0) {
            if (z6) {
                h.a.W(edgeEffect2, (-i10) / getHeight(), i5 / getWidth());
                if (motionEvent != null) {
                    getScrollFeedbackProvider().f2777a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i4, true);
                }
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i11 > scrollRange && z6) {
            h.a.W(edgeEffect, i10 / getHeight(), 1.0f - (i5 / getWidth()));
            if (motionEvent != null) {
                z4 = false;
                getScrollFeedbackProvider().f2777a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i4, false);
            } else {
                z4 = false;
            }
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
            if (edgeEffect2.isFinished() || !edgeEffect.isFinished()) {
                postInvalidateOnAnimation();
                z5 = z4;
            } else {
                z5 = z7;
            }
            if (z5 && i6 == 0 && (velocityTracker = this.f302r) != null) {
                velocityTracker.clear();
            }
            if (i6 == 1) {
                w(i6);
                edgeEffect2.onRelease();
                edgeEffect.onRelease();
            }
            return i9;
        }
        z4 = false;
        if (edgeEffect2.isFinished()) {
        }
        postInvalidateOnAnimation();
        z5 = z4;
        if (z5) {
            velocityTracker.clear();
        }
        if (i6 == 1) {
        }
        return i9;
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i4) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i < 0) {
                i = 0;
            } else if (width + i > width2) {
                i = width2 - width;
            }
            if (height >= height2 || i4 < 0) {
                i4 = 0;
            } else if (height + i4 > height2) {
                i4 = height2 - height;
            }
            if (i == getScrollX() && i4 == getScrollY()) {
                return;
            }
            super.scrollTo(i, i4);
        }
    }

    public void setFillViewport(boolean z3) {
        if (z3 != this.f303s) {
            this.f303s = z3;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z3) {
        k kVar = this.E;
        if (kVar.d) {
            ViewGroup viewGroup = kVar.f2751c;
            WeakHashMap weakHashMap = l0.f2757a;
            d0.k(viewGroup);
        }
        kVar.d = z3;
    }

    public void setSmoothScrollingEnabled(boolean z3) {
        this.f304t = z3;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.E.g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        w(0);
    }

    public final boolean t(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float w3 = h.a.w(edgeEffect) * getHeight();
        float abs = Math.abs(-i) * 0.35f;
        float f2 = this.f291f * 0.015f;
        double log = Math.log(abs / f2);
        double d = H;
        return ((float) (Math.exp((d / (d - 1.0d)) * log) * ((double) f2))) < w3;
    }

    public final void u(int i, int i4, boolean z3) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f292g > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int max = Math.max(0, Math.min(i4 + scrollY, Math.max(0, height - height2))) - scrollY;
            this.i.startScroll(getScrollX(), scrollY, 0, max, 250);
            if (z3) {
                this.E.g(2, 1);
            } else {
                w(1);
            }
            this.B = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.i.isFinished()) {
                this.i.abortAnimation();
                w(1);
            }
            scrollBy(i, i4);
        }
        this.f292g = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean v(MotionEvent motionEvent) {
        boolean z3;
        EdgeEffect edgeEffect = this.f294j;
        if (h.a.w(edgeEffect) != 0.0f) {
            h.a.W(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z3 = true;
        } else {
            z3 = false;
        }
        EdgeEffect edgeEffect2 = this.f295k;
        if (h.a.w(edgeEffect2) == 0.0f) {
            return z3;
        }
        h.a.W(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void w(int i) {
        this.E.h(i);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
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
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void setOnScrollChangeListener(f fVar) {
    }
}
