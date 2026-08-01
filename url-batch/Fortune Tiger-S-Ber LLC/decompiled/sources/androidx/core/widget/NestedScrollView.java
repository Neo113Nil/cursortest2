package androidx.core.widget;

import a2.e;
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
import b1.i0;
import com.google.android.material.datepicker.f;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import k0.b0;
import k0.j;
import k0.j0;
import k0.l;
import k0.r;
import k0.t;
import k0.u;
import m0.a;
import o0.c;
import o0.g;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements l {
    public static final float H = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final f I = new f(4);
    public static final int[] J = {R.attr.fillViewport};
    public int A;
    public int B;
    public g C;
    public final i0 D;
    public final j E;
    public float F;
    public final k0.g G;

    /* renamed from: f, reason: collision with root package name */
    public final float f306f;
    public long g;
    public final Rect h;

    /* renamed from: i, reason: collision with root package name */
    public final OverScroller f307i;

    /* renamed from: j, reason: collision with root package name */
    public final EdgeEffect f308j;

    /* renamed from: k, reason: collision with root package name */
    public final EdgeEffect f309k;

    /* renamed from: l, reason: collision with root package name */
    public r f310l;

    /* renamed from: m, reason: collision with root package name */
    public int f311m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f312n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f313o;

    /* renamed from: p, reason: collision with root package name */
    public View f314p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f315q;

    /* renamed from: r, reason: collision with root package name */
    public VelocityTracker f316r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f317s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f318t;

    /* renamed from: u, reason: collision with root package name */
    public final int f319u;

    /* renamed from: v, reason: collision with root package name */
    public final int f320v;

    /* renamed from: w, reason: collision with root package name */
    public final int f321w;

    /* renamed from: x, reason: collision with root package name */
    public int f322x;

    /* renamed from: y, reason: collision with root package name */
    public final int[] f323y;

    /* renamed from: z, reason: collision with root package name */
    public final int[] f324z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.gglhk.bofio.fortunetiger.R.attr.nestedScrollViewStyle);
        this.h = new Rect();
        this.f312n = true;
        this.f313o = false;
        this.f314p = null;
        this.f315q = false;
        this.f318t = true;
        this.f322x = -1;
        this.f323y = new int[2];
        this.f324z = new int[2];
        this.G = new k0.g(getContext(), new e(28, this));
        int i4 = Build.VERSION.SDK_INT;
        this.f308j = i4 >= 31 ? c.a(context, attributeSet) : new EdgeEffect(context);
        this.f309k = i4 >= 31 ? c.a(context, attributeSet) : new EdgeEffect(context);
        this.f306f = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f307i = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f319u = viewConfiguration.getScaledTouchSlop();
        this.f320v = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f321w = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, J, com.gglhk.bofio.fortunetiger.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.D = new i0();
        this.E = new j(this);
        setNestedScrollingEnabled(true);
        j0.m(this, I);
    }

    private r getScrollFeedbackProvider() {
        if (this.f310l == null) {
            this.f310l = new r(this);
        }
        return this.f310l;
    }

    public static boolean l(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && l((View) parent, nestedScrollView);
    }

    @Override // k0.k
    public final void a(View view, View view2, int i4, int i5) {
        i0 i0Var = this.D;
        if (i5 == 1) {
            i0Var.f802b = i4;
        } else {
            i0Var.f801a = i4;
        }
        this.E.g(2, i5);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // k0.k
    public final void b(View view, int i4) {
        i0 i0Var = this.D;
        if (i4 == 1) {
            i0Var.f802b = 0;
        } else {
            i0Var.f801a = 0;
        }
        w(i4);
    }

    @Override // k0.k
    public final void c(View view, int i4, int i5, int[] iArr, int i6) {
        this.E.c(i4, i5, i6, iArr, null);
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
        int i4;
        if (this.f307i.isFinished()) {
            return;
        }
        this.f307i.computeScrollOffset();
        int currY = this.f307i.getCurrY();
        int i5 = currY - this.B;
        int height = getHeight();
        EdgeEffect edgeEffect = this.f308j;
        EdgeEffect edgeEffect2 = this.f309k;
        if (i5 <= 0 || a.j(edgeEffect) == 0.0f) {
            if (i5 < 0 && a.j(edgeEffect2) != 0.0f) {
                float f4 = height;
                round = Math.round(a.u(edgeEffect2, (i5 * 4.0f) / f4, 0.5f) * (f4 / 4.0f));
                if (round != i5) {
                    edgeEffect2.finish();
                }
            }
            int i6 = i5;
            this.B = currY;
            int[] iArr = this.f324z;
            iArr[1] = 0;
            this.E.c(0, i6, 1, iArr, null);
            i4 = i6 - iArr[1];
            int scrollRange = getScrollRange();
            if (Build.VERSION.SDK_INT >= 35) {
                o0.e.a(this, Math.abs(this.f307i.getCurrVelocity()));
            }
            if (i4 != 0) {
                int scrollY = getScrollY();
                p(i4, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i7 = i4 - scrollY2;
                iArr[1] = 0;
                this.E.d(0, scrollY2, 0, i7, this.f323y, 1, iArr);
                i4 = i7 - iArr[1];
            }
            if (i4 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i4 < 0) {
                        if (edgeEffect.isFinished()) {
                            edgeEffect.onAbsorb((int) this.f307i.getCurrVelocity());
                        }
                    } else if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) this.f307i.getCurrVelocity());
                    }
                }
                this.f307i.abortAnimation();
                w(1);
            }
            if (this.f307i.isFinished()) {
                postInvalidateOnAnimation();
                return;
            } else {
                w(1);
                return;
            }
        }
        round = Math.round(a.u(edgeEffect, ((-i5) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (round != i5) {
            edgeEffect.finish();
        }
        i5 -= round;
        int i62 = i5;
        this.B = currY;
        int[] iArr2 = this.f324z;
        iArr2[1] = 0;
        this.E.c(0, i62, 1, iArr2, null);
        i4 = i62 - iArr2[1];
        int scrollRange2 = getScrollRange();
        if (Build.VERSION.SDK_INT >= 35) {
        }
        if (i4 != 0) {
        }
        if (i4 != 0) {
        }
        if (this.f307i.isFinished()) {
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

    @Override // k0.l
    public final void d(View view, int i4, int i5, int i6, int i7, int i8, int[] iArr) {
        n(i7, i8, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || i(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f4, float f5, boolean z3) {
        return this.E.a(f4, f5, z3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f4, float f5) {
        return this.E.b(f4, f5);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i4, int i5, int[] iArr, int[] iArr2) {
        return this.E.c(i4, i5, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i4, int i5, int i6, int i7, int[] iArr) {
        return this.E.d(i4, i5, i6, i7, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i4;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f308j;
        int i5 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                i4 = getPaddingLeft();
            } else {
                i4 = 0;
            }
            if (getClipToPadding()) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate(i4, min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.f309k;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getScrollRange(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingRight() + getPaddingLeft();
            i5 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingBottom() + getPaddingTop();
            max -= getPaddingBottom();
        }
        canvas.translate(i5 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(save2);
    }

    @Override // k0.k
    public final void e(View view, int i4, int i5, int i6, int i7, int i8) {
        n(i7, i8, null);
    }

    @Override // k0.k
    public final boolean f(View view, View view2, int i4, int i5) {
        return (i4 & 2) != 0;
    }

    public final boolean g(int i4) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View view = findFocus;
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i4);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m(findNextFocus, maxScrollAmount, getHeight())) {
            if (i4 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i4 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i4 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            s(maxScrollAmount, -1, null, 0, 1, true);
        } else {
            Rect rect = this.h;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            s(h(rect), -1, null, 0, 1, true);
            findNextFocus.requestFocus(i4);
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
        i0 i0Var = this.D;
        return i0Var.f802b | i0Var.f801a;
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
        int i4 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i5 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i4 - verticalFadingEdgeLength : i4;
        int i6 = rect.bottom;
        if (i6 > i5 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i5, (childAt.getBottom() + layoutParams.bottomMargin) - i4);
        }
        if (rect.top >= scrollY || i6 >= i5) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i5 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.E.f(0);
    }

    public final boolean i(KeyEvent keyEvent) {
        this.h.setEmpty();
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
        return this.E.f2750d;
    }

    public final void j(int i4) {
        if (getChildCount() > 0) {
            this.f307i.fling(getScrollX(), getScrollY(), 0, i4, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.E.g(2, 1);
            this.B = getScrollY();
            postInvalidateOnAnimation();
            if (Build.VERSION.SDK_INT >= 35) {
                o0.e.a(this, Math.abs(this.f307i.getCurrVelocity()));
            }
        }
    }

    public final boolean k(int i4) {
        int childCount;
        boolean z3 = i4 == 130;
        int height = getHeight();
        Rect rect = this.h;
        rect.top = 0;
        rect.bottom = height;
        if (z3 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return r(i4, rect.top, rect.bottom);
    }

    public final boolean m(View view, int i4, int i5) {
        Rect rect = this.h;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i4 >= getScrollY() && rect.top - i4 <= getScrollY() + i5;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i4, int i5) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i4, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i4, int i5, int i6, int i7) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i4, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i5, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(int i4, int i5, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i4);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.E.d(0, scrollY2, 0, i4 - scrollY2, null, i5, iArr);
    }

    public final void o(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f322x) {
            int i4 = actionIndex == 0 ? 1 : 0;
            this.f311m = (int) motionEvent.getY(i4);
            this.f322x = motionEvent.getPointerId(i4);
            VelocityTracker velocityTracker = this.f316r;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f313o = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x011e, code lost:
    
        if (r0 >= 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x00d3, code lost:
    
        if (r7 >= 0) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02a7  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f4;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z3;
        NestedScrollView nestedScrollView;
        float f5;
        NestedScrollView nestedScrollView2;
        float f6;
        long j4;
        float f7;
        float sqrt;
        int i9;
        NestedScrollView nestedScrollView3;
        float f8;
        if (motionEvent.getAction() != 8 || this.f315q) {
            return false;
        }
        if ((motionEvent.getSource() & 2) == 2) {
            float axisValue = motionEvent.getAxisValue(9);
            i5 = (int) motionEvent.getX();
            i4 = 9;
            f4 = axisValue;
        } else if ((motionEvent.getSource() & 4194304) == 4194304) {
            float axisValue2 = motionEvent.getAxisValue(26);
            i5 = getWidth() / 2;
            f4 = axisValue2;
            i4 = 26;
        } else {
            f4 = 0.0f;
            i4 = 0;
            i5 = 0;
        }
        if (f4 == 0.0f) {
            return false;
        }
        s(-((int) (getVerticalScrollFactorCompat() * f4)), i4, motionEvent, i5, 1, (motionEvent.getSource() & 8194) == 8194);
        if (i4 != 0) {
            k0.g gVar = this.G;
            NestedScrollView nestedScrollView4 = (NestedScrollView) gVar.f2736b.g;
            int[] iArr = gVar.h;
            int source = motionEvent.getSource();
            int deviceId = motionEvent.getDeviceId();
            int i10 = 1;
            if (gVar.f2739f == source && gVar.g == deviceId && gVar.f2738e == i4) {
                z3 = false;
                i6 = 0;
            } else {
                Context context = gVar.f2735a;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int deviceId2 = motionEvent.getDeviceId();
                i6 = 0;
                int source2 = motionEvent.getSource();
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 34) {
                    i7 = androidx.activity.a.f(viewConfiguration, deviceId2, i4, source2);
                } else {
                    InputDevice device = InputDevice.getDevice(deviceId2);
                    if (device != null && device.getMotionRange(i4, source2) != null) {
                        Resources resources = context.getResources();
                        int identifier = (source2 == 4194304 && i4 == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                        Objects.requireNonNull(viewConfiguration);
                        if (identifier == -1) {
                            i7 = viewConfiguration.getScaledMinimumFlingVelocity();
                        } else if (identifier != 0) {
                            i7 = resources.getDimensionPixelSize(identifier);
                        }
                    }
                    i7 = Integer.MAX_VALUE;
                }
                iArr[0] = i7;
                int deviceId3 = motionEvent.getDeviceId();
                int source3 = motionEvent.getSource();
                if (i11 >= 34) {
                    i8 = androidx.activity.a.e(viewConfiguration, deviceId3, i4, source3);
                } else {
                    InputDevice device2 = InputDevice.getDevice(deviceId3);
                    if (device2 != null && device2.getMotionRange(i4, source3) != null) {
                        Resources resources2 = context.getResources();
                        int identifier2 = (source3 == 4194304 && i4 == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                        Objects.requireNonNull(viewConfiguration);
                        if (identifier2 == -1) {
                            i8 = viewConfiguration.getScaledMaximumFlingVelocity();
                        } else if (identifier2 != 0) {
                            i8 = resources2.getDimensionPixelSize(identifier2);
                        }
                    }
                    i8 = Integer.MIN_VALUE;
                }
                iArr[1] = i8;
                gVar.f2739f = source;
                gVar.g = deviceId;
                gVar.f2738e = i4;
                z3 = true;
            }
            if (iArr[i6] == Integer.MAX_VALUE) {
                VelocityTracker velocityTracker = gVar.c;
                if (velocityTracker == null) {
                    return true;
                }
                velocityTracker.recycle();
                gVar.c = null;
                return true;
            }
            if (gVar.c == null) {
                gVar.c = VelocityTracker.obtain();
            }
            VelocityTracker velocityTracker2 = gVar.c;
            Map map = t.f2775a;
            velocityTracker2.addMovement(motionEvent);
            int i12 = 20;
            if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
                Map map2 = t.f2775a;
                if (!map2.containsKey(velocityTracker2)) {
                    map2.put(velocityTracker2, new u());
                }
                u uVar = (u) map2.get(velocityTracker2);
                long[] jArr = uVar.f2780b;
                long eventTime = motionEvent.getEventTime();
                if (uVar.f2781d != 0 && eventTime - jArr[uVar.f2782e] > 40) {
                    uVar.f2781d = i6;
                    uVar.c = 0.0f;
                }
                int i13 = (uVar.f2782e + 1) % 20;
                uVar.f2782e = i13;
                int i14 = uVar.f2781d;
                if (i14 != 20) {
                    uVar.f2781d = i14 + 1;
                }
                uVar.f2779a[i13] = motionEvent.getAxisValue(26);
                jArr[uVar.f2782e] = eventTime;
            }
            velocityTracker2.computeCurrentVelocity(1000, Float.MAX_VALUE);
            u uVar2 = (u) t.f2775a.get(velocityTracker2);
            if (uVar2 != null) {
                float[] fArr = uVar2.f2779a;
                long[] jArr2 = uVar2.f2780b;
                int i15 = uVar2.f2781d;
                if (i15 >= 2) {
                    int i16 = uVar2.f2782e;
                    int i17 = ((i16 + 20) - (i15 - 1)) % 20;
                    long j5 = jArr2[i16];
                    while (true) {
                        j4 = jArr2[i17];
                        if (j5 - j4 <= 100) {
                            break;
                        }
                        uVar2.f2781d--;
                        i17 = (i17 + 1) % 20;
                    }
                    int i18 = uVar2.f2781d;
                    if (i18 >= 2) {
                        if (i18 == 2) {
                            int i19 = (i17 + 1) % 20;
                            if (j4 != jArr2[i19]) {
                                nestedScrollView = nestedScrollView4;
                                f7 = Float.MAX_VALUE;
                                i9 = 1000;
                                sqrt = fArr[i19] / (r12 - j4);
                            }
                        } else {
                            f7 = Float.MAX_VALUE;
                            float f9 = 0.0f;
                            int i20 = 0;
                            int i21 = 0;
                            while (true) {
                                if (i20 >= uVar2.f2781d - 1) {
                                    break;
                                }
                                int i22 = i20 + i17;
                                long j6 = jArr2[i22 % 20];
                                int i23 = (i22 + 1) % i12;
                                if (jArr2[i23] == j6) {
                                    nestedScrollView3 = nestedScrollView4;
                                } else {
                                    i21++;
                                    nestedScrollView3 = nestedScrollView4;
                                    float sqrt2 = (f9 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f9) * 2.0f));
                                    float f10 = fArr[i23] / (jArr2[i23] - j6);
                                    float abs = (Math.abs(f10) * (f10 - sqrt2)) + f9;
                                    if (i21 == i10) {
                                        abs *= 0.5f;
                                    }
                                    f9 = abs;
                                }
                                i20++;
                                nestedScrollView4 = nestedScrollView3;
                                i12 = 20;
                                i10 = 1;
                            }
                            nestedScrollView = nestedScrollView4;
                            sqrt = ((float) Math.sqrt(Math.abs(f9) * 2.0f)) * (f9 < 0.0f ? -1.0f : 1.0f);
                            i9 = 1000;
                        }
                        f8 = sqrt * i9;
                        uVar2.c = f8;
                        if (f8 >= (-Math.abs(f7))) {
                            uVar2.c = -Math.abs(f7);
                        } else if (uVar2.c > Math.abs(f7)) {
                            uVar2.c = Math.abs(f7);
                        }
                    }
                }
                nestedScrollView = nestedScrollView4;
                f7 = Float.MAX_VALUE;
                i9 = 1000;
                sqrt = 0.0f;
                f8 = sqrt * i9;
                uVar2.c = f8;
                if (f8 >= (-Math.abs(f7))) {
                }
            } else {
                nestedScrollView = nestedScrollView4;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                f5 = androidx.activity.a.b(velocityTracker2, i4);
            } else if (i4 == 0) {
                f5 = velocityTracker2.getXVelocity();
            } else if (i4 == 1) {
                f5 = velocityTracker2.getYVelocity();
            } else {
                u uVar3 = (u) t.f2775a.get(velocityTracker2);
                f5 = (uVar3 == null || i4 != 26) ? 0.0f : uVar3.c;
            }
            float f11 = f5 * (-nestedScrollView.getVerticalScrollFactorCompat());
            float signum = Math.signum(f11);
            if (z3 || !(signum == Math.signum(gVar.f2737d) || signum == 0.0f)) {
                nestedScrollView2 = nestedScrollView;
                nestedScrollView2.f307i.abortAnimation();
            } else {
                nestedScrollView2 = nestedScrollView;
            }
            if (Math.abs(f11) >= iArr[0]) {
                float max = Math.max(-r2, Math.min(f11, iArr[1]));
                if (max == 0.0f) {
                    f6 = 0.0f;
                } else {
                    nestedScrollView2.f307i.abortAnimation();
                    nestedScrollView2.j((int) max);
                    f6 = max;
                }
                gVar.f2737d = f6;
                return true;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z3 = true;
        if (action == 2 && this.f315q) {
            return true;
        }
        int i4 = action & 255;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    int i5 = this.f322x;
                    if (i5 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i5);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i5 + " in onInterceptTouchEvent");
                        } else {
                            int y3 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y3 - this.f311m) > this.f319u && (2 & getNestedScrollAxes()) == 0) {
                                this.f315q = true;
                                this.f311m = y3;
                                if (this.f316r == null) {
                                    this.f316r = VelocityTracker.obtain();
                                }
                                this.f316r.addMovement(motionEvent);
                                this.A = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i4 != 3) {
                    if (i4 == 6) {
                        o(motionEvent);
                    }
                }
            }
            this.f315q = false;
            this.f322x = -1;
            VelocityTracker velocityTracker = this.f316r;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f316r = null;
            }
            if (this.f307i.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
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
                    this.f311m = y4;
                    this.f322x = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.f316r;
                    if (velocityTracker2 == null) {
                        this.f316r = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f316r.addMovement(motionEvent);
                    this.f307i.computeScrollOffset();
                    if (!v(motionEvent) && this.f307i.isFinished()) {
                        z3 = false;
                    }
                    this.f315q = z3;
                    this.E.g(2, 0);
                }
            }
            if (!v(motionEvent) && this.f307i.isFinished()) {
                z3 = false;
            }
            this.f315q = z3;
            VelocityTracker velocityTracker3 = this.f316r;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f316r = null;
            }
        }
        return this.f315q;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        int i8;
        super.onLayout(z3, i4, i5, i6, i7);
        int i9 = 0;
        this.f312n = false;
        View view = this.f314p;
        if (view != null && l(view, this)) {
            View view2 = this.f314p;
            Rect rect = this.h;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h = h(rect);
            if (h != 0) {
                scrollBy(0, h);
            }
        }
        this.f314p = null;
        if (!this.f313o) {
            if (this.C != null) {
                scrollTo(getScrollX(), this.C.f2980f);
                this.C = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i8 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i8 = 0;
            }
            int paddingTop = ((i7 - i5) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i8 && scrollY >= 0) {
                i9 = paddingTop + scrollY > i8 ? i8 - paddingTop : scrollY;
            }
            if (i9 != scrollY) {
                scrollTo(getScrollX(), i9);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f313o = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        if (this.f317s && View.MeasureSpec.getMode(i5) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i4, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f4, float f5, boolean z3) {
        if (z3) {
            return false;
        }
        dispatchNestedFling(0.0f, f5, true);
        j((int) f5);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f4, float f5) {
        return this.E.b(f4, f5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i4, int i5, int[] iArr) {
        this.E.c(i4, i5, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i4, int i5, int i6, int i7) {
        n(i7, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i4) {
        a(view, view2, i4, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i4, int i5, boolean z3, boolean z4) {
        super.scrollTo(i4, i5);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i4, Rect rect) {
        if (i4 == 2) {
            i4 = 130;
        } else if (i4 == 1) {
            i4 = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i4) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i4);
        if (findNextFocus != null && m(findNextFocus, 0, getHeight())) {
            return findNextFocus.requestFocus(i4, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.getSuperState());
        this.C = gVar;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        gVar.f2980f = getScrollY();
        return gVar;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i4, int i5, int i6, int i7) {
        super.onScrollChanged(i4, i5, i6, i7);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !m(findFocus, 0, i7)) {
            return;
        }
        Rect rect = this.h;
        findFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(findFocus, rect);
        int h = h(rect);
        if (h != 0) {
            if (this.f318t) {
                u(0, h, false);
            } else {
                scrollBy(0, h);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i4) {
        return f(view, view2, i4, 0);
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
        float u3;
        int round;
        int i4;
        ViewParent parent2;
        if (this.f316r == null) {
            this.f316r = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.A = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float f4 = 0.0f;
        obtain.offsetLocation(0.0f, this.A);
        j jVar = this.E;
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f308j;
            EdgeEffect edgeEffect2 = this.f309k;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f316r;
                velocityTracker.computeCurrentVelocity(1000, this.f321w);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f322x);
                if (Math.abs(yVelocity) >= this.f320v) {
                    if (a.j(edgeEffect) != 0.0f) {
                        if (t(edgeEffect, yVelocity)) {
                            edgeEffect.onAbsorb(yVelocity);
                        } else {
                            j(-yVelocity);
                        }
                    } else if (a.j(edgeEffect2) != 0.0f) {
                        int i5 = -yVelocity;
                        if (t(edgeEffect2, i5)) {
                            edgeEffect2.onAbsorb(i5);
                        } else {
                            j(i5);
                        }
                    } else {
                        int i6 = -yVelocity;
                        float f5 = i6;
                        if (!jVar.b(0.0f, f5)) {
                            dispatchNestedFling(0.0f, f5, true);
                            j(i6);
                        }
                    }
                } else if (this.f307i.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f322x = -1;
                this.f315q = false;
                VelocityTracker velocityTracker2 = this.f316r;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f316r = null;
                }
                w(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f322x);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f322x + " in onTouchEvent");
                } else {
                    int y3 = (int) motionEvent.getY(findPointerIndex);
                    int i7 = this.f311m - y3;
                    float x3 = motionEvent.getX(findPointerIndex) / getWidth();
                    float height = i7 / getHeight();
                    if (a.j(edgeEffect) != 0.0f) {
                        u3 = -a.u(edgeEffect, -height, x3);
                        if (a.j(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                    } else {
                        if (a.j(edgeEffect2) != 0.0f) {
                            u3 = a.u(edgeEffect2, height, 1.0f - x3);
                            if (a.j(edgeEffect2) == 0.0f) {
                                edgeEffect2.onRelease();
                            }
                        }
                        round = Math.round(f4 * getHeight());
                        if (round != 0) {
                            invalidate();
                        }
                        i4 = i7 - round;
                        if (!this.f315q && Math.abs(i4) > this.f319u) {
                            parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.f315q = true;
                            i4 = i4 <= 0 ? i4 - this.f319u : i4 + this.f319u;
                        }
                        if (this.f315q) {
                            int s2 = s(i4, 1, motionEvent, (int) motionEvent.getX(findPointerIndex), 0, false);
                            this.f311m = y3 - s2;
                            this.A += s2;
                        }
                    }
                    f4 = u3;
                    round = Math.round(f4 * getHeight());
                    if (round != 0) {
                    }
                    i4 = i7 - round;
                    if (!this.f315q) {
                        parent2 = getParent();
                        if (parent2 != null) {
                        }
                        this.f315q = true;
                        if (i4 <= 0) {
                        }
                    }
                    if (this.f315q) {
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f315q && getChildCount() > 0) {
                    if (this.f307i.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        postInvalidateOnAnimation();
                    }
                }
                this.f322x = -1;
                this.f315q = false;
                VelocityTracker velocityTracker3 = this.f316r;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f316r = null;
                }
                w(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f311m = (int) motionEvent.getY(actionIndex);
                this.f322x = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                o(motionEvent);
                this.f311m = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f322x));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f315q && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f307i.isFinished()) {
                this.f307i.abortAnimation();
                w(1);
            }
            int y4 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f311m = y4;
            this.f322x = pointerId;
            jVar.g(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f316r;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public final boolean p(int i4, int i5, int i6, int i7) {
        int i8;
        boolean z3;
        int i9;
        boolean z4;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i10 = i6 + i4;
        if (i5 <= 0 && i5 >= 0) {
            i8 = i5;
            z3 = false;
        } else {
            i8 = 0;
            z3 = true;
        }
        if (i10 > i7) {
            i9 = i7;
        } else {
            if (i10 >= 0) {
                i9 = i10;
                z4 = false;
                if (z4 && !this.E.f(1)) {
                    this.f307i.springBack(i8, i9, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i8, i9);
                return !z3 || z4;
            }
            i9 = 0;
        }
        z4 = true;
        if (z4) {
            this.f307i.springBack(i8, i9, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i8, i9);
        if (z3) {
        }
    }

    public final void q(int i4) {
        boolean z3 = i4 == 130;
        int height = getHeight();
        Rect rect = this.h;
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
        int i5 = rect.top;
        int i6 = height + i5;
        rect.bottom = i6;
        r(i4, i5, i6);
    }

    public final boolean r(int i4, int i5, int i6) {
        boolean z3;
        int height = getHeight();
        int scrollY = getScrollY();
        int i7 = height + scrollY;
        boolean z4 = i4 == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z5 = false;
        for (int i8 = 0; i8 < size; i8++) {
            View view2 = focusables.get(i8);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i5 < bottom && top < i6) {
                boolean z6 = i5 < top && bottom < i6;
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
        if (i5 < scrollY || i6 > i7) {
            s(z4 ? i5 - scrollY : i6 - i7, -1, null, 0, 1, true);
            z3 = true;
        } else {
            z3 = false;
        }
        if (view3 != findFocus()) {
            view3.requestFocus(i4);
        }
        return z3;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f312n) {
            this.f314p = view2;
        } else {
            Rect rect = this.h;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h = h(rect);
            if (h != 0) {
                scrollBy(0, h);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z3) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int h = h(rect);
        boolean z4 = h != 0;
        if (z4) {
            if (z3) {
                scrollBy(0, h);
                return z4;
            }
            u(0, h, false);
        }
        return z4;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z3) {
        VelocityTracker velocityTracker;
        if (z3 && (velocityTracker = this.f316r) != null) {
            velocityTracker.recycle();
            this.f316r = null;
        }
        super.requestDisallowInterceptTouchEvent(z3);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f312n = true;
        super.requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int s(int i4, int i5, MotionEvent motionEvent, int i6, int i7, boolean z3) {
        int i8;
        int i9;
        boolean z4;
        boolean z5;
        VelocityTracker velocityTracker;
        j jVar = this.E;
        if (i7 == 1) {
            jVar.g(2, i7);
        }
        boolean c = this.E.c(0, i4, i7, this.f324z, this.f323y);
        int[] iArr = this.f323y;
        int[] iArr2 = this.f324z;
        if (c) {
            i8 = i4 - iArr2[1];
            i9 = iArr[1];
        } else {
            i8 = i4;
            i9 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z6 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z3;
        boolean z7 = p(i8, 0, scrollY, scrollRange) && !jVar.f(i7);
        int scrollY2 = getScrollY() - scrollY;
        if (motionEvent != null && scrollY2 != 0) {
            getScrollFeedbackProvider().f2772a.onScrollProgress(motionEvent.getDeviceId(), motionEvent.getSource(), i5, scrollY2);
        }
        iArr2[1] = 0;
        this.E.d(0, scrollY2, 0, i8 - scrollY2, this.f323y, i7, iArr2);
        int i10 = i9 + iArr[1];
        int i11 = i8 - iArr2[1];
        int i12 = scrollY + i11;
        EdgeEffect edgeEffect = this.f309k;
        EdgeEffect edgeEffect2 = this.f308j;
        if (i12 < 0) {
            if (z6) {
                a.u(edgeEffect2, (-i11) / getHeight(), i6 / getWidth());
                if (motionEvent != null) {
                    getScrollFeedbackProvider().f2772a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i5, true);
                }
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i12 > scrollRange && z6) {
            a.u(edgeEffect, i11 / getHeight(), 1.0f - (i6 / getWidth()));
            if (motionEvent != null) {
                z4 = false;
                getScrollFeedbackProvider().f2772a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i5, false);
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
            if (z5 && i7 == 0 && (velocityTracker = this.f316r) != null) {
                velocityTracker.clear();
            }
            if (i7 == 1) {
                w(i7);
                edgeEffect2.onRelease();
                edgeEffect.onRelease();
            }
            return i10;
        }
        z4 = false;
        if (edgeEffect2.isFinished()) {
        }
        postInvalidateOnAnimation();
        z5 = z4;
        if (z5) {
            velocityTracker.clear();
        }
        if (i7 == 1) {
        }
        return i10;
    }

    @Override // android.view.View
    public final void scrollTo(int i4, int i5) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i4 < 0) {
                i4 = 0;
            } else if (width + i4 > width2) {
                i4 = width2 - width;
            }
            if (height >= height2 || i5 < 0) {
                i5 = 0;
            } else if (height + i5 > height2) {
                i5 = height2 - height;
            }
            if (i4 == getScrollX() && i5 == getScrollY()) {
                return;
            }
            super.scrollTo(i4, i5);
        }
    }

    public void setFillViewport(boolean z3) {
        if (z3 != this.f317s) {
            this.f317s = z3;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z3) {
        j jVar = this.E;
        if (jVar.f2750d) {
            ViewGroup viewGroup = jVar.c;
            WeakHashMap weakHashMap = j0.f2752a;
            b0.k(viewGroup);
        }
        jVar.f2750d = z3;
    }

    public void setSmoothScrollingEnabled(boolean z3) {
        this.f318t = z3;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i4) {
        return this.E.g(i4, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        w(0);
    }

    public final boolean t(EdgeEffect edgeEffect, int i4) {
        if (i4 > 0) {
            return true;
        }
        float j4 = a.j(edgeEffect) * getHeight();
        float abs = Math.abs(-i4) * 0.35f;
        float f4 = this.f306f * 0.015f;
        double log = Math.log(abs / f4);
        double d4 = H;
        return ((float) (Math.exp((d4 / (d4 - 1.0d)) * log) * ((double) f4))) < j4;
    }

    public final void u(int i4, int i5, boolean z3) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.g > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int max = Math.max(0, Math.min(i5 + scrollY, Math.max(0, height - height2))) - scrollY;
            this.f307i.startScroll(getScrollX(), scrollY, 0, max, 250);
            if (z3) {
                this.E.g(2, 1);
            } else {
                w(1);
            }
            this.B = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f307i.isFinished()) {
                this.f307i.abortAnimation();
                w(1);
            }
            scrollBy(i4, i5);
        }
        this.g = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean v(MotionEvent motionEvent) {
        boolean z3;
        EdgeEffect edgeEffect = this.f308j;
        if (a.j(edgeEffect) != 0.0f) {
            a.u(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z3 = true;
        } else {
            z3 = false;
        }
        EdgeEffect edgeEffect2 = this.f309k;
        if (a.j(edgeEffect2) == 0.0f) {
            return z3;
        }
        a.u(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void w(int i4) {
        this.E.h(i4);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i4) {
        if (getChildCount() <= 0) {
            super.addView(view, i4);
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
    public final void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i4, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void setOnScrollChangeListener(o0.f fVar) {
    }
}
