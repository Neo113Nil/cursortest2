package androidx.core.widget;

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
import com.google.android.material.datepicker.b;
import j0.o0;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import q3.c0;
import q3.h;
import q3.k;
import q3.k0;
import q3.l0;
import q3.m;
import q3.o;
import q3.u;
import q3.v;
import q3.w;
import q3.x;
import r2.r;
import u3.c;
import u3.e;
import u3.f;
import u3.g;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements o {
    public static final float F = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final b G = new b(1);
    public static final int[] H = {R.attr.fillViewport};
    public g A;
    public final o0 B;
    public final m C;
    public float D;
    public final h E;

    /* renamed from: d, reason: collision with root package name */
    public final float f623d;

    /* renamed from: e, reason: collision with root package name */
    public long f624e;

    /* renamed from: f, reason: collision with root package name */
    public final Rect f625f;

    /* renamed from: g, reason: collision with root package name */
    public final OverScroller f626g;

    /* renamed from: h, reason: collision with root package name */
    public final EdgeEffect f627h;
    public final EdgeEffect i;

    /* renamed from: j, reason: collision with root package name */
    public u f628j;

    /* renamed from: k, reason: collision with root package name */
    public int f629k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f630l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f631m;

    /* renamed from: n, reason: collision with root package name */
    public View f632n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f633o;

    /* renamed from: p, reason: collision with root package name */
    public VelocityTracker f634p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f635q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f636r;

    /* renamed from: s, reason: collision with root package name */
    public final int f637s;

    /* renamed from: t, reason: collision with root package name */
    public final int f638t;

    /* renamed from: u, reason: collision with root package name */
    public final int f639u;

    /* renamed from: v, reason: collision with root package name */
    public int f640v;

    /* renamed from: w, reason: collision with root package name */
    public final int[] f641w;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f642x;

    /* renamed from: y, reason: collision with root package name */
    public int f643y;

    /* renamed from: z, reason: collision with root package name */
    public int f644z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.snovikpovik.vuevnxsj.R.attr.nestedScrollViewStyle);
        this.f625f = new Rect();
        this.f630l = true;
        this.f631m = false;
        this.f632n = null;
        this.f633o = false;
        this.f636r = true;
        this.f640v = -1;
        this.f641w = new int[2];
        this.f642x = new int[2];
        this.E = new h(getContext(), new k(10, this));
        int i = Build.VERSION.SDK_INT;
        this.f627h = i >= 31 ? c.a(context, attributeSet) : new EdgeEffect(context);
        this.i = i >= 31 ? c.a(context, attributeSet) : new EdgeEffect(context);
        this.f623d = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f626g = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f637s = viewConfiguration.getScaledTouchSlop();
        this.f638t = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f639u = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, H, com.snovikpovik.vuevnxsj.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.B = new o0();
        this.C = new m(this);
        setNestedScrollingEnabled(true);
        k0.k(this, G);
    }

    private u getScrollFeedbackProvider() {
        if (this.f628j == null) {
            this.f628j = new u(this);
        }
        return this.f628j;
    }

    public static boolean k(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && k((View) parent, nestedScrollView);
    }

    @Override // q3.n
    public final void a(View view, View view2, int i, int i8) {
        o0 o0Var = this.B;
        if (i8 == 1) {
            o0Var.f3810b = i;
        } else {
            o0Var.f3809a = i;
        }
        this.C.g(2, i8);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // q3.n
    public final void b(View view, int i) {
        o0 o0Var = this.B;
        if (i == 1) {
            o0Var.f3810b = 0;
        } else {
            o0Var.f3809a = 0;
        }
        v(i);
    }

    @Override // q3.n
    public final void c(View view, int i, int i8, int[] iArr, int i9) {
        this.C.c(i, i8, i9, iArr, null);
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
        if (this.f626g.isFinished()) {
            return;
        }
        this.f626g.computeScrollOffset();
        int currY = this.f626g.getCurrY();
        int i8 = currY - this.f644z;
        int height = getHeight();
        EdgeEffect edgeEffect = this.f627h;
        EdgeEffect edgeEffect2 = this.i;
        if (i8 <= 0 || r.y(edgeEffect) == 0.0f) {
            if (i8 < 0 && r.y(edgeEffect2) != 0.0f) {
                float f6 = height;
                round = Math.round(r.I(edgeEffect2, (i8 * 4.0f) / f6, 0.5f) * (f6 / 4.0f));
                if (round != i8) {
                    edgeEffect2.finish();
                }
            }
            int i9 = i8;
            this.f644z = currY;
            int[] iArr = this.f642x;
            iArr[1] = 0;
            this.C.c(0, i9, 1, iArr, null);
            i = i9 - iArr[1];
            int scrollRange = getScrollRange();
            if (Build.VERSION.SDK_INT >= 35) {
                e.a(this, Math.abs(this.f626g.getCurrVelocity()));
            }
            if (i != 0) {
                int scrollY = getScrollY();
                o(i, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i10 = i - scrollY2;
                iArr[1] = 0;
                this.C.d(0, scrollY2, 0, i10, this.f641w, 1, iArr);
                i = i10 - iArr[1];
            }
            if (i != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i < 0) {
                        if (edgeEffect.isFinished()) {
                            edgeEffect.onAbsorb((int) this.f626g.getCurrVelocity());
                        }
                    } else if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) this.f626g.getCurrVelocity());
                    }
                }
                this.f626g.abortAnimation();
                v(1);
            }
            if (this.f626g.isFinished()) {
                postInvalidateOnAnimation();
                return;
            } else {
                v(1);
                return;
            }
        }
        round = Math.round(r.I(edgeEffect, ((-i8) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (round != i8) {
            edgeEffect.finish();
        }
        i8 -= round;
        int i92 = i8;
        this.f644z = currY;
        int[] iArr2 = this.f642x;
        iArr2[1] = 0;
        this.C.c(0, i92, 1, iArr2, null);
        i = i92 - iArr2[1];
        int scrollRange2 = getScrollRange();
        if (Build.VERSION.SDK_INT >= 35) {
        }
        if (i != 0) {
        }
        if (i != 0) {
        }
        if (this.f626g.isFinished()) {
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

    @Override // q3.o
    public final void d(View view, int i, int i8, int i9, int i10, int i11, int[] iArr) {
        m(i10, i11, iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00cb A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z3;
        if (!super.dispatchKeyEvent(keyEvent)) {
            this.f625f.setEmpty();
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                    if (keyEvent.getAction() == 0) {
                        int keyCode = keyEvent.getKeyCode();
                        if (keyCode == 19) {
                            z3 = keyEvent.isAltPressed() ? j(33) : g(33);
                        } else if (keyCode == 20) {
                            z3 = keyEvent.isAltPressed() ? j(130) : g(130);
                        } else if (keyCode == 62) {
                            p(keyEvent.isShiftPressed() ? 33 : 130);
                        } else if (keyCode == 92) {
                            z3 = j(33);
                        } else if (keyCode == 93) {
                            z3 = j(130);
                        } else if (keyCode == 122) {
                            p(33);
                        } else if (keyCode == 123) {
                            p(130);
                        }
                        if (z3) {
                            return false;
                        }
                    }
                    z3 = false;
                    if (z3) {
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
                    z3 = true;
                    if (z3) {
                    }
                }
            }
            z3 = false;
            if (z3) {
            }
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f6, float f8, boolean z3) {
        return this.C.a(f6, f8, z3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f6, float f8) {
        return this.C.b(f6, f8);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i8, int[] iArr, int[] iArr2) {
        return this.C.c(i, i8, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i8, int i9, int i10, int[] iArr) {
        return this.C.d(i, i8, i9, i10, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f627h;
        int i8 = 0;
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
        EdgeEffect edgeEffect2 = this.i;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getScrollRange(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingRight() + getPaddingLeft();
            i8 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingBottom() + getPaddingTop();
            max -= getPaddingBottom();
        }
        canvas.translate(i8 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(save2);
    }

    @Override // q3.n
    public final void e(View view, int i, int i8, int i9, int i10, int i11) {
        m(i10, i11, null);
    }

    @Override // q3.n
    public final boolean f(View view, View view2, int i, int i8) {
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
        if (findNextFocus == null || !l(findNextFocus, maxScrollAmount, getHeight())) {
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
            r(maxScrollAmount, -1, null, 0, 1, true);
        } else {
            Rect rect = this.f625f;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            r(h(rect), -1, null, 0, 1, true);
            findNextFocus.requestFocus(i);
        }
        if (view != null && view.isFocused() && !l(view, 0, getHeight())) {
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
        o0 o0Var = this.B;
        return o0Var.f3810b | o0Var.f3809a;
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
        if (this.D == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.D = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.D;
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
        int i8 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i9 = rect.bottom;
        if (i9 > i8 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i8, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        }
        if (rect.top >= scrollY || i9 >= i8) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i8 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.C.f(0);
    }

    public final void i(int i) {
        if (getChildCount() > 0) {
            this.f626g.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.C.g(2, 1);
            this.f644z = getScrollY();
            postInvalidateOnAnimation();
            if (Build.VERSION.SDK_INT >= 35) {
                e.a(this, Math.abs(this.f626g.getCurrVelocity()));
            }
        }
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.C.f6131d;
    }

    public final boolean j(int i) {
        int childCount;
        boolean z3 = i == 130;
        int height = getHeight();
        Rect rect = this.f625f;
        rect.top = 0;
        rect.bottom = height;
        if (z3 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return q(i, rect.top, rect.bottom);
    }

    public final boolean l(View view, int i, int i8) {
        Rect rect = this.f625f;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i >= getScrollY() && rect.top - i <= getScrollY() + i8;
    }

    public final void m(int i, int i8, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.C.d(0, scrollY2, 0, i - scrollY2, null, i8, iArr);
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i, int i8) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i8, int i9, int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i8, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f640v) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f629k = (int) motionEvent.getY(i);
            this.f640v = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f634p;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean o(int i, int i8, int i9, int i10) {
        int i11;
        boolean z3;
        int i12;
        boolean z7;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i13 = i9 + i;
        if (i8 <= 0 && i8 >= 0) {
            i11 = i8;
            z3 = false;
        } else {
            i11 = 0;
            z3 = true;
        }
        if (i13 > i10) {
            i12 = i10;
        } else {
            if (i13 >= 0) {
                i12 = i13;
                z7 = false;
                if (z7 && !this.C.f(1)) {
                    this.f626g.springBack(i11, i12, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i11, i12);
                return !z3 || z7;
            }
            i12 = 0;
        }
        z7 = true;
        if (z7) {
            this.f626g.springBack(i11, i12, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i11, i12);
        if (z3) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f631m = false;
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
        float f6;
        int i;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z3;
        NestedScrollView nestedScrollView;
        float f8;
        NestedScrollView nestedScrollView2;
        float f9;
        long j7;
        float f10;
        float sqrt;
        int i12;
        NestedScrollView nestedScrollView3;
        float f11;
        if (motionEvent.getAction() != 8 || this.f633o) {
            return false;
        }
        if ((motionEvent.getSource() & 2) == 2) {
            float axisValue = motionEvent.getAxisValue(9);
            i8 = (int) motionEvent.getX();
            i = 9;
            f6 = axisValue;
        } else if ((motionEvent.getSource() & 4194304) == 4194304) {
            float axisValue2 = motionEvent.getAxisValue(26);
            i8 = getWidth() / 2;
            f6 = axisValue2;
            i = 26;
        } else {
            f6 = 0.0f;
            i = 0;
            i8 = 0;
        }
        if (f6 == 0.0f) {
            return false;
        }
        r(-((int) (getVerticalScrollFactorCompat() * f6)), i, motionEvent, i8, 1, (motionEvent.getSource() & 8194) == 8194);
        if (i != 0) {
            h hVar = this.E;
            NestedScrollView nestedScrollView4 = (NestedScrollView) hVar.f6103b.f6119e;
            int[] iArr = hVar.f6109h;
            int source = motionEvent.getSource();
            int deviceId = motionEvent.getDeviceId();
            int i13 = 1;
            if (hVar.f6107f == source && hVar.f6108g == deviceId && hVar.f6106e == i) {
                z3 = false;
                i9 = 0;
            } else {
                Context context = hVar.f6102a;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int deviceId2 = motionEvent.getDeviceId();
                i9 = 0;
                int source2 = motionEvent.getSource();
                int i14 = Build.VERSION.SDK_INT;
                if (i14 >= 34) {
                    Method method = l0.f6125a;
                    i10 = v.f(viewConfiguration, deviceId2, i, source2);
                } else {
                    Method method2 = l0.f6125a;
                    InputDevice device = InputDevice.getDevice(deviceId2);
                    if (device != null && device.getMotionRange(i, source2) != null) {
                        Resources resources = context.getResources();
                        int identifier = (source2 == 4194304 && i == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                        Objects.requireNonNull(viewConfiguration);
                        if (identifier == -1) {
                            i10 = viewConfiguration.getScaledMinimumFlingVelocity();
                        } else if (identifier != 0) {
                            i10 = resources.getDimensionPixelSize(identifier);
                        }
                    }
                    i10 = Integer.MAX_VALUE;
                }
                iArr[0] = i10;
                int deviceId3 = motionEvent.getDeviceId();
                int source3 = motionEvent.getSource();
                if (i14 >= 34) {
                    i11 = v.e(viewConfiguration, deviceId3, i, source3);
                } else {
                    InputDevice device2 = InputDevice.getDevice(deviceId3);
                    if (device2 != null && device2.getMotionRange(i, source3) != null) {
                        Resources resources2 = context.getResources();
                        int identifier2 = (source3 == 4194304 && i == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                        Objects.requireNonNull(viewConfiguration);
                        if (identifier2 == -1) {
                            i11 = viewConfiguration.getScaledMaximumFlingVelocity();
                        } else if (identifier2 != 0) {
                            i11 = resources2.getDimensionPixelSize(identifier2);
                        }
                    }
                    i11 = Integer.MIN_VALUE;
                }
                iArr[1] = i11;
                hVar.f6107f = source;
                hVar.f6108g = deviceId;
                hVar.f6106e = i;
                z3 = true;
            }
            if (iArr[i9] == Integer.MAX_VALUE) {
                VelocityTracker velocityTracker = hVar.f6104c;
                if (velocityTracker == null) {
                    return true;
                }
                velocityTracker.recycle();
                hVar.f6104c = null;
                return true;
            }
            if (hVar.f6104c == null) {
                hVar.f6104c = VelocityTracker.obtain();
            }
            VelocityTracker velocityTracker2 = hVar.f6104c;
            Map map = w.f6167a;
            velocityTracker2.addMovement(motionEvent);
            int i15 = 20;
            if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
                Map map2 = w.f6167a;
                if (!map2.containsKey(velocityTracker2)) {
                    map2.put(velocityTracker2, new x());
                }
                x xVar = (x) map2.get(velocityTracker2);
                long[] jArr = xVar.f6170b;
                long eventTime = motionEvent.getEventTime();
                if (xVar.f6172d != 0 && eventTime - jArr[xVar.f6173e] > 40) {
                    xVar.f6172d = i9;
                    xVar.f6171c = 0.0f;
                }
                int i16 = (xVar.f6173e + 1) % 20;
                xVar.f6173e = i16;
                int i17 = xVar.f6172d;
                if (i17 != 20) {
                    xVar.f6172d = i17 + 1;
                }
                xVar.f6169a[i16] = motionEvent.getAxisValue(26);
                jArr[xVar.f6173e] = eventTime;
            }
            velocityTracker2.computeCurrentVelocity(1000, Float.MAX_VALUE);
            x xVar2 = (x) w.f6167a.get(velocityTracker2);
            if (xVar2 != null) {
                float[] fArr = xVar2.f6169a;
                long[] jArr2 = xVar2.f6170b;
                int i18 = xVar2.f6172d;
                if (i18 >= 2) {
                    int i19 = xVar2.f6173e;
                    int i20 = ((i19 + 20) - (i18 - 1)) % 20;
                    long j8 = jArr2[i19];
                    while (true) {
                        j7 = jArr2[i20];
                        if (j8 - j7 <= 100) {
                            break;
                        }
                        xVar2.f6172d--;
                        i20 = (i20 + 1) % 20;
                    }
                    int i21 = xVar2.f6172d;
                    if (i21 >= 2) {
                        if (i21 == 2) {
                            int i22 = (i20 + 1) % 20;
                            if (j7 != jArr2[i22]) {
                                nestedScrollView = nestedScrollView4;
                                f10 = Float.MAX_VALUE;
                                i12 = 1000;
                                sqrt = fArr[i22] / (r12 - j7);
                            }
                        } else {
                            f10 = Float.MAX_VALUE;
                            float f12 = 0.0f;
                            int i23 = 0;
                            int i24 = 0;
                            while (true) {
                                if (i23 >= xVar2.f6172d - 1) {
                                    break;
                                }
                                int i25 = i23 + i20;
                                long j9 = jArr2[i25 % 20];
                                int i26 = (i25 + 1) % i15;
                                if (jArr2[i26] == j9) {
                                    nestedScrollView3 = nestedScrollView4;
                                } else {
                                    i24++;
                                    nestedScrollView3 = nestedScrollView4;
                                    float sqrt2 = (f12 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f12) * 2.0f));
                                    float f13 = fArr[i26] / (jArr2[i26] - j9);
                                    float abs = (Math.abs(f13) * (f13 - sqrt2)) + f12;
                                    if (i24 == i13) {
                                        abs *= 0.5f;
                                    }
                                    f12 = abs;
                                }
                                i23++;
                                nestedScrollView4 = nestedScrollView3;
                                i15 = 20;
                                i13 = 1;
                            }
                            nestedScrollView = nestedScrollView4;
                            sqrt = ((float) Math.sqrt(Math.abs(f12) * 2.0f)) * (f12 < 0.0f ? -1.0f : 1.0f);
                            i12 = 1000;
                        }
                        f11 = sqrt * i12;
                        xVar2.f6171c = f11;
                        if (f11 >= (-Math.abs(f10))) {
                            xVar2.f6171c = -Math.abs(f10);
                        } else if (xVar2.f6171c > Math.abs(f10)) {
                            xVar2.f6171c = Math.abs(f10);
                        }
                    }
                }
                nestedScrollView = nestedScrollView4;
                f10 = Float.MAX_VALUE;
                i12 = 1000;
                sqrt = 0.0f;
                f11 = sqrt * i12;
                xVar2.f6171c = f11;
                if (f11 >= (-Math.abs(f10))) {
                }
            } else {
                nestedScrollView = nestedScrollView4;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                f8 = v.b(velocityTracker2, i);
            } else if (i == 0) {
                f8 = velocityTracker2.getXVelocity();
            } else if (i == 1) {
                f8 = velocityTracker2.getYVelocity();
            } else {
                x xVar3 = (x) w.f6167a.get(velocityTracker2);
                f8 = (xVar3 == null || i != 26) ? 0.0f : xVar3.f6171c;
            }
            float f14 = f8 * (-nestedScrollView.getVerticalScrollFactorCompat());
            float signum = Math.signum(f14);
            if (z3 || !(signum == Math.signum(hVar.f6105d) || signum == 0.0f)) {
                nestedScrollView2 = nestedScrollView;
                nestedScrollView2.f626g.abortAnimation();
            } else {
                nestedScrollView2 = nestedScrollView;
            }
            if (Math.abs(f14) >= iArr[0]) {
                float max = Math.max(-r2, Math.min(f14, iArr[1]));
                if (max == 0.0f) {
                    f9 = 0.0f;
                } else {
                    nestedScrollView2.f626g.abortAnimation();
                    nestedScrollView2.i((int) max);
                    f9 = max;
                }
                hVar.f6105d = f9;
                return true;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z3 = true;
        if (action == 2 && this.f633o) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i8 = this.f640v;
                    if (i8 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i8);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i8 + " in onInterceptTouchEvent");
                        } else {
                            int y7 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y7 - this.f629k) > this.f637s && (2 & getNestedScrollAxes()) == 0) {
                                this.f633o = true;
                                this.f629k = y7;
                                if (this.f634p == null) {
                                    this.f634p = VelocityTracker.obtain();
                                }
                                this.f634p.addMovement(motionEvent);
                                this.f643y = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        n(motionEvent);
                    }
                }
            }
            this.f633o = false;
            this.f640v = -1;
            VelocityTracker velocityTracker = this.f634p;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f634p = null;
            }
            if (this.f626g.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            v(0);
        } else {
            int y8 = (int) motionEvent.getY();
            int x7 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y8 >= childAt.getTop() - scrollY && y8 < childAt.getBottom() - scrollY && x7 >= childAt.getLeft() && x7 < childAt.getRight()) {
                    this.f629k = y8;
                    this.f640v = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.f634p;
                    if (velocityTracker2 == null) {
                        this.f634p = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f634p.addMovement(motionEvent);
                    this.f626g.computeScrollOffset();
                    if (!u(motionEvent) && this.f626g.isFinished()) {
                        z3 = false;
                    }
                    this.f633o = z3;
                    this.C.g(2, 0);
                }
            }
            if (!u(motionEvent) && this.f626g.isFinished()) {
                z3 = false;
            }
            this.f633o = z3;
            VelocityTracker velocityTracker3 = this.f634p;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f634p = null;
            }
        }
        return this.f633o;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i8, int i9, int i10) {
        int i11;
        super.onLayout(z3, i, i8, i9, i10);
        int i12 = 0;
        this.f630l = false;
        View view = this.f632n;
        if (view != null && k(view, this)) {
            View view2 = this.f632n;
            Rect rect = this.f625f;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h8 = h(rect);
            if (h8 != 0) {
                scrollBy(0, h8);
            }
        }
        this.f632n = null;
        if (!this.f631m) {
            if (this.A != null) {
                scrollTo(getScrollX(), this.A.f7374d);
                this.A = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i11 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i11 = 0;
            }
            int paddingTop = ((i10 - i8) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i11 && scrollY >= 0) {
                i12 = paddingTop + scrollY > i11 ? i11 - paddingTop : scrollY;
            }
            if (i12 != scrollY) {
                scrollTo(getScrollX(), i12);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f631m = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i8) {
        super.onMeasure(i, i8);
        if (this.f635q && View.MeasureSpec.getMode(i8) != 0 && getChildCount() > 0) {
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
    public final boolean onNestedFling(View view, float f6, float f8, boolean z3) {
        if (z3) {
            return false;
        }
        dispatchNestedFling(0.0f, f8, true);
        i((int) f8);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f6, float f8) {
        return this.C.b(f6, f8);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i8, int[] iArr) {
        this.C.c(i, i8, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i8, int i9, int i10) {
        m(i10, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        a(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i, int i8, boolean z3, boolean z7) {
        super.scrollTo(i, i8);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (findNextFocus != null && l(findNextFocus, 0, getHeight())) {
            return findNextFocus.requestFocus(i, rect);
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
        this.A = gVar;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        gVar.f7374d = getScrollY();
        return gVar;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i8, int i9, int i10) {
        super.onScrollChanged(i, i8, i9, i10);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i8, int i9, int i10) {
        super.onSizeChanged(i, i8, i9, i10);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !l(findFocus, 0, i10)) {
            return;
        }
        Rect rect = this.f625f;
        findFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(findFocus, rect);
        int h8 = h(rect);
        if (h8 != 0) {
            if (this.f636r) {
                t(0, h8, false);
            } else {
                scrollBy(0, h8);
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
        float I;
        int round;
        int i;
        ViewParent parent2;
        if (this.f634p == null) {
            this.f634p = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f643y = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float f6 = 0.0f;
        obtain.offsetLocation(0.0f, this.f643y);
        m mVar = this.C;
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f627h;
            EdgeEffect edgeEffect2 = this.i;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f634p;
                velocityTracker.computeCurrentVelocity(1000, this.f639u);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f640v);
                if (Math.abs(yVelocity) >= this.f638t) {
                    if (r.y(edgeEffect) != 0.0f) {
                        if (s(edgeEffect, yVelocity)) {
                            edgeEffect.onAbsorb(yVelocity);
                        } else {
                            i(-yVelocity);
                        }
                    } else if (r.y(edgeEffect2) != 0.0f) {
                        int i8 = -yVelocity;
                        if (s(edgeEffect2, i8)) {
                            edgeEffect2.onAbsorb(i8);
                        } else {
                            i(i8);
                        }
                    } else {
                        int i9 = -yVelocity;
                        float f8 = i9;
                        if (!mVar.b(0.0f, f8)) {
                            dispatchNestedFling(0.0f, f8, true);
                            i(i9);
                        }
                    }
                } else if (this.f626g.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f640v = -1;
                this.f633o = false;
                VelocityTracker velocityTracker2 = this.f634p;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f634p = null;
                }
                v(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f640v);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f640v + " in onTouchEvent");
                } else {
                    int y7 = (int) motionEvent.getY(findPointerIndex);
                    int i10 = this.f629k - y7;
                    float x7 = motionEvent.getX(findPointerIndex) / getWidth();
                    float height = i10 / getHeight();
                    if (r.y(edgeEffect) != 0.0f) {
                        I = -r.I(edgeEffect, -height, x7);
                        if (r.y(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                    } else {
                        if (r.y(edgeEffect2) != 0.0f) {
                            I = r.I(edgeEffect2, height, 1.0f - x7);
                            if (r.y(edgeEffect2) == 0.0f) {
                                edgeEffect2.onRelease();
                            }
                        }
                        round = Math.round(f6 * getHeight());
                        if (round != 0) {
                            invalidate();
                        }
                        i = i10 - round;
                        if (!this.f633o && Math.abs(i) > this.f637s) {
                            parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.f633o = true;
                            i = i <= 0 ? i - this.f637s : i + this.f637s;
                        }
                        if (this.f633o) {
                            int r7 = r(i, 1, motionEvent, (int) motionEvent.getX(findPointerIndex), 0, false);
                            this.f629k = y7 - r7;
                            this.f643y += r7;
                        }
                    }
                    f6 = I;
                    round = Math.round(f6 * getHeight());
                    if (round != 0) {
                    }
                    i = i10 - round;
                    if (!this.f633o) {
                        parent2 = getParent();
                        if (parent2 != null) {
                        }
                        this.f633o = true;
                        if (i <= 0) {
                        }
                    }
                    if (this.f633o) {
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f633o && getChildCount() > 0) {
                    if (this.f626g.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        postInvalidateOnAnimation();
                    }
                }
                this.f640v = -1;
                this.f633o = false;
                VelocityTracker velocityTracker3 = this.f634p;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f634p = null;
                }
                v(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f629k = (int) motionEvent.getY(actionIndex);
                this.f640v = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                n(motionEvent);
                this.f629k = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f640v));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f633o && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f626g.isFinished()) {
                this.f626g.abortAnimation();
                v(1);
            }
            int y8 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f629k = y8;
            this.f640v = pointerId;
            mVar.g(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f634p;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public final void p(int i) {
        boolean z3 = i == 130;
        int height = getHeight();
        Rect rect = this.f625f;
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
        int i8 = rect.top;
        int i9 = height + i8;
        rect.bottom = i9;
        q(i, i8, i9);
    }

    public final boolean q(int i, int i8, int i9) {
        boolean z3;
        int height = getHeight();
        int scrollY = getScrollY();
        int i10 = height + scrollY;
        boolean z7 = i == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z8 = false;
        for (int i11 = 0; i11 < size; i11++) {
            View view2 = focusables.get(i11);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i8 < bottom && top < i9) {
                boolean z9 = i8 < top && bottom < i9;
                if (view == null) {
                    view = view2;
                    z8 = z9;
                } else {
                    boolean z10 = (z7 && top < view.getTop()) || (!z7 && bottom > view.getBottom());
                    if (z8) {
                        if (z9) {
                            if (!z10) {
                            }
                            view = view2;
                        }
                    } else if (z9) {
                        view = view2;
                        z8 = true;
                    } else {
                        if (!z10) {
                        }
                        view = view2;
                    }
                }
            }
        }
        View view3 = view == null ? this : view;
        if (i8 < scrollY || i9 > i10) {
            r(z7 ? i8 - scrollY : i9 - i10, -1, null, 0, 1, true);
            z3 = true;
        } else {
            z3 = false;
        }
        if (view3 != findFocus()) {
            view3.requestFocus(i);
        }
        return z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int r(int i, int i8, MotionEvent motionEvent, int i9, int i10, boolean z3) {
        int i11;
        int i12;
        boolean z7;
        boolean z8;
        VelocityTracker velocityTracker;
        m mVar = this.C;
        if (i10 == 1) {
            mVar.g(2, i10);
        }
        boolean c8 = this.C.c(0, i, i10, this.f642x, this.f641w);
        int[] iArr = this.f641w;
        int[] iArr2 = this.f642x;
        if (c8) {
            i11 = i - iArr2[1];
            i12 = iArr[1];
        } else {
            i11 = i;
            i12 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z9 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z3;
        boolean z10 = o(i11, 0, scrollY, scrollRange) && !mVar.f(i10);
        int scrollY2 = getScrollY() - scrollY;
        if (motionEvent != null && scrollY2 != 0) {
            getScrollFeedbackProvider().f6159a.onScrollProgress(motionEvent.getDeviceId(), motionEvent.getSource(), i8, scrollY2);
        }
        iArr2[1] = 0;
        this.C.d(0, scrollY2, 0, i11 - scrollY2, this.f641w, i10, iArr2);
        int i13 = i12 + iArr[1];
        int i14 = i11 - iArr2[1];
        int i15 = scrollY + i14;
        EdgeEffect edgeEffect = this.i;
        EdgeEffect edgeEffect2 = this.f627h;
        if (i15 < 0) {
            if (z9) {
                r.I(edgeEffect2, (-i14) / getHeight(), i9 / getWidth());
                if (motionEvent != null) {
                    getScrollFeedbackProvider().f6159a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i8, true);
                }
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i15 > scrollRange && z9) {
            r.I(edgeEffect, i14 / getHeight(), 1.0f - (i9 / getWidth()));
            if (motionEvent != null) {
                z7 = false;
                getScrollFeedbackProvider().f6159a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i8, false);
            } else {
                z7 = false;
            }
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
            if (edgeEffect2.isFinished() || !edgeEffect.isFinished()) {
                postInvalidateOnAnimation();
                z8 = z7;
            } else {
                z8 = z10;
            }
            if (z8 && i10 == 0 && (velocityTracker = this.f634p) != null) {
                velocityTracker.clear();
            }
            if (i10 == 1) {
                v(i10);
                edgeEffect2.onRelease();
                edgeEffect.onRelease();
            }
            return i13;
        }
        z7 = false;
        if (edgeEffect2.isFinished()) {
        }
        postInvalidateOnAnimation();
        z8 = z7;
        if (z8) {
            velocityTracker.clear();
        }
        if (i10 == 1) {
        }
        return i13;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f630l) {
            this.f632n = view2;
        } else {
            Rect rect = this.f625f;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h8 = h(rect);
            if (h8 != 0) {
                scrollBy(0, h8);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z3) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int h8 = h(rect);
        boolean z7 = h8 != 0;
        if (z7) {
            if (z3) {
                scrollBy(0, h8);
                return z7;
            }
            t(0, h8, false);
        }
        return z7;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z3) {
        VelocityTracker velocityTracker;
        if (z3 && (velocityTracker = this.f634p) != null) {
            velocityTracker.recycle();
            this.f634p = null;
        }
        super.requestDisallowInterceptTouchEvent(z3);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f630l = true;
        super.requestLayout();
    }

    public final boolean s(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float y7 = r.y(edgeEffect) * getHeight();
        float abs = Math.abs(-i) * 0.35f;
        float f6 = this.f623d * 0.015f;
        double log = Math.log(abs / f6);
        double d8 = F;
        return ((float) (Math.exp((d8 / (d8 - 1.0d)) * log) * ((double) f6))) < y7;
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i8) {
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
            if (height >= height2 || i8 < 0) {
                i8 = 0;
            } else if (height + i8 > height2) {
                i8 = height2 - height;
            }
            if (i == getScrollX() && i8 == getScrollY()) {
                return;
            }
            super.scrollTo(i, i8);
        }
    }

    public void setFillViewport(boolean z3) {
        if (z3 != this.f635q) {
            this.f635q = z3;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z3) {
        m mVar = this.C;
        if (mVar.f6131d) {
            ViewGroup viewGroup = mVar.f6130c;
            Field field = k0.f6120a;
            c0.j(viewGroup);
        }
        mVar.f6131d = z3;
    }

    public void setSmoothScrollingEnabled(boolean z3) {
        this.f636r = z3;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.C.g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        v(0);
    }

    public final void t(int i, int i8, boolean z3) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f624e > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int max = Math.max(0, Math.min(i8 + scrollY, Math.max(0, height - height2))) - scrollY;
            this.f626g.startScroll(getScrollX(), scrollY, 0, max, 250);
            if (z3) {
                this.C.g(2, 1);
            } else {
                v(1);
            }
            this.f644z = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f626g.isFinished()) {
                this.f626g.abortAnimation();
                v(1);
            }
            scrollBy(i, i8);
        }
        this.f624e = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean u(MotionEvent motionEvent) {
        boolean z3;
        EdgeEffect edgeEffect = this.f627h;
        if (r.y(edgeEffect) != 0.0f) {
            r.I(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z3 = true;
        } else {
            z3 = false;
        }
        EdgeEffect edgeEffect2 = this.i;
        if (r.y(edgeEffect2) == 0.0f) {
            return z3;
        }
        r.I(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void v(int i) {
        this.C.h(i);
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
