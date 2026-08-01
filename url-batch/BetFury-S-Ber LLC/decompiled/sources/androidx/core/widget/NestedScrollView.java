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
import defpackage.bk;
import defpackage.d50;
import defpackage.hm0;
import defpackage.j0;
import defpackage.jl;
import defpackage.kz;
import defpackage.ll0;
import defpackage.m30;
import defpackage.ml0;
import defpackage.n00;
import defpackage.n30;
import defpackage.o30;
import defpackage.p30;
import defpackage.q30;
import defpackage.s30;
import defpackage.s9;
import defpackage.t30;
import defpackage.yb0;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements s30, p30 {
    public static final float H = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final n00 I = new n00(3);
    public static final int[] J = {R.attr.fillViewport};
    public int A;
    public int B;
    public o30 C;
    public final t30 D;
    public final q30 E;
    public float F;
    public final bk G;
    public final float f;
    public long g;
    public final Rect h;
    public final OverScroller i;
    public final EdgeEffect j;
    public final EdgeEffect k;
    public yb0 l;
    public int m;
    public boolean n;
    public boolean o;
    public View p;
    public boolean q;
    public VelocityTracker r;
    public boolean s;
    public boolean t;
    public final int u;
    public final int v;
    public final int w;
    public int x;
    public final int[] y;
    public final int[] z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.trembin.nirefon.betfury.R.attr.nestedScrollViewStyle);
        this.h = new Rect();
        this.n = true;
        this.o = false;
        this.p = null;
        this.q = false;
        this.t = true;
        this.x = -1;
        this.y = new int[2];
        this.z = new int[2];
        this.G = new bk(getContext(), new kz(this));
        int i = Build.VERSION.SDK_INT;
        this.j = i >= 31 ? jl.a(context, attributeSet) : new EdgeEffect(context);
        this.k = i >= 31 ? jl.a(context, attributeSet) : new EdgeEffect(context);
        this.f = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.i = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.u = viewConfiguration.getScaledTouchSlop();
        this.v = viewConfiguration.getScaledMinimumFlingVelocity();
        this.w = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, J, com.trembin.nirefon.betfury.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.D = new t30();
        this.E = new q30(this);
        setNestedScrollingEnabled(true);
        hm0.m(this, I);
    }

    private yb0 getScrollFeedbackProvider() {
        if (this.l == null) {
            this.l = new yb0(this);
        }
        return this.l;
    }

    public static boolean l(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && l((View) parent, nestedScrollView);
    }

    @Override // defpackage.r30
    public final void a(View view, View view2, int i, int i2) {
        t30 t30Var = this.D;
        if (i2 == 1) {
            t30Var.b = i;
        } else {
            t30Var.a = i;
        }
        this.E.g(2, i2);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
        } else {
            s9.u("ScrollView can host only one direct child");
        }
    }

    @Override // defpackage.r30
    public final void b(View view, int i) {
        t30 t30Var = this.D;
        if (i == 1) {
            t30Var.b = 0;
        } else {
            t30Var.a = 0;
        }
        w(i);
    }

    @Override // defpackage.r30
    public final void c(View view, int i, int i2, int[] iArr, int i3) {
        this.E.c(i, i2, i3, iArr, null);
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
    /* JADX WARN: Removed duplicated region for block: B:18:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ef  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void computeScroll() {
        int round;
        int i;
        OverScroller overScroller = this.i;
        if (overScroller.isFinished()) {
            return;
        }
        overScroller.computeScrollOffset();
        int currY = overScroller.getCurrY();
        int i2 = currY - this.B;
        int height = getHeight();
        EdgeEffect edgeEffect = this.j;
        EdgeEffect edgeEffect2 = this.k;
        if (i2 <= 0 || d50.u(edgeEffect) == 0.0f) {
            if (i2 < 0 && d50.u(edgeEffect2) != 0.0f) {
                float f = height;
                round = Math.round(d50.F(edgeEffect2, (i2 * 4.0f) / f, 0.5f) * (f / 4.0f));
                if (round != i2) {
                    edgeEffect2.finish();
                }
            }
            int i3 = i2;
            this.B = currY;
            int[] iArr = this.z;
            iArr[1] = 0;
            this.E.c(0, i3, 1, iArr, null);
            i = i3 - iArr[1];
            int scrollRange = getScrollRange();
            if (Build.VERSION.SDK_INT >= 35) {
                m30.a(this, Math.abs(overScroller.getCurrVelocity()));
            }
            if (i != 0) {
                int scrollY = getScrollY();
                p(i, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i4 = i - scrollY2;
                iArr[1] = 0;
                this.E.d(0, scrollY2, 0, i4, this.y, 1, iArr);
                i = i4 - iArr[1];
            }
            if (i != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i < 0) {
                        if (edgeEffect.isFinished()) {
                            edgeEffect.onAbsorb((int) overScroller.getCurrVelocity());
                        }
                    } else if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) overScroller.getCurrVelocity());
                    }
                }
                overScroller.abortAnimation();
                w(1);
            }
            if (overScroller.isFinished()) {
                postInvalidateOnAnimation();
                return;
            } else {
                w(1);
                return;
            }
        }
        round = Math.round(d50.F(edgeEffect, ((-i2) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (round != i2) {
            edgeEffect.finish();
        }
        i2 -= round;
        int i32 = i2;
        this.B = currY;
        int[] iArr2 = this.z;
        iArr2[1] = 0;
        this.E.c(0, i32, 1, iArr2, null);
        i = i32 - iArr2[1];
        int scrollRange2 = getScrollRange();
        if (Build.VERSION.SDK_INT >= 35) {
        }
        if (i != 0) {
        }
        if (i != 0) {
        }
        if (overScroller.isFinished()) {
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

    @Override // defpackage.s30
    public final void d(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        n(i4, i5, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || i(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.E.a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.E.b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.E.c(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.E.d(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.j;
        int i2 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                i = getPaddingLeft();
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            } else {
                i = 0;
            }
            canvas.translate(i, min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.k;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getScrollRange(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingRight() + getPaddingLeft();
            i2 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingBottom() + getPaddingTop();
            max -= getPaddingBottom();
        }
        canvas.translate(i2 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(save2);
    }

    @Override // defpackage.r30
    public final void e(View view, int i, int i2, int i3, int i4, int i5) {
        n(i4, i5, null);
    }

    @Override // defpackage.r30
    public final boolean f(View view, View view2, int i, int i2) {
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
            Rect rect = this.h;
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
        t30 t30Var = this.D;
        return t30Var.b | t30Var.a;
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
                s9.u("Expected theme to define listPreferredItemHeight.");
                return 0.0f;
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
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i3 = rect.bottom;
        if (i3 > i2 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i2, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        }
        if (rect.top >= scrollY || i3 >= i2) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
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
        return this.E.d;
    }

    public final void j(int i) {
        if (getChildCount() > 0) {
            this.i.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.E.g(2, 1);
            this.B = getScrollY();
            postInvalidateOnAnimation();
            if (Build.VERSION.SDK_INT >= 35) {
                m30.a(this, Math.abs(this.i.getCurrVelocity()));
            }
        }
    }

    public final boolean k(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.h;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return r(i, rect.top, rect.bottom);
    }

    public final boolean m(View view, int i, int i2) {
        Rect rect = this.h;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i >= getScrollY() && rect.top - i <= getScrollY() + i2;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.E.d(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    public final void o(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.x) {
            int i = actionIndex == 0 ? 1 : 0;
            this.m = (int) motionEvent.getY(i);
            this.x = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.r;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.o = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x0120, code lost:
    
        if (r7 >= 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x00d5, code lost:
    
        if (r8 >= 0) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02a1  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        boolean z2;
        boolean z3;
        float f2;
        float f3;
        long j;
        float f4;
        int i6;
        float sqrt;
        boolean z4;
        float f5;
        if (motionEvent.getAction() != 8 || this.q) {
            return false;
        }
        if ((motionEvent.getSource() & 2) == 2) {
            float axisValue = motionEvent.getAxisValue(9);
            i2 = (int) motionEvent.getX();
            i = 9;
            f = axisValue;
        } else if ((motionEvent.getSource() & 4194304) == 4194304) {
            float axisValue2 = motionEvent.getAxisValue(26);
            i2 = getWidth() / 2;
            f = axisValue2;
            i = 26;
        } else {
            f = 0.0f;
            i = 0;
            i2 = 0;
        }
        if (f == 0.0f) {
            return false;
        }
        s(-((int) (getVerticalScrollFactorCompat() * f)), i, motionEvent, i2, 1, (motionEvent.getSource() & 8194) == 8194);
        if (i != 0) {
            bk bkVar = this.G;
            NestedScrollView nestedScrollView = (NestedScrollView) bkVar.b.f;
            int[] iArr = bkVar.h;
            int source = motionEvent.getSource();
            int deviceId = motionEvent.getDeviceId();
            if (bkVar.f == source && bkVar.g == deviceId && bkVar.e == i) {
                z2 = false;
                z = true;
                i3 = 0;
            } else {
                Context context = bkVar.a;
                z = true;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int deviceId2 = motionEvent.getDeviceId();
                int source2 = motionEvent.getSource();
                i3 = 0;
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 34) {
                    i4 = j0.f(viewConfiguration, deviceId2, i, source2);
                } else {
                    InputDevice device = InputDevice.getDevice(deviceId2);
                    if (device != null && device.getMotionRange(i, source2) != null) {
                        Resources resources = context.getResources();
                        int identifier = (source2 == 4194304 && i == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                        Objects.requireNonNull(viewConfiguration);
                        if (identifier == -1) {
                            i4 = viewConfiguration.getScaledMinimumFlingVelocity();
                        } else if (identifier != 0) {
                            i4 = resources.getDimensionPixelSize(identifier);
                        }
                    }
                    i4 = Integer.MAX_VALUE;
                }
                iArr[0] = i4;
                int deviceId3 = motionEvent.getDeviceId();
                int source3 = motionEvent.getSource();
                if (i7 >= 34) {
                    i5 = j0.e(viewConfiguration, deviceId3, i, source3);
                } else {
                    InputDevice device2 = InputDevice.getDevice(deviceId3);
                    if (device2 != null && device2.getMotionRange(i, source3) != null) {
                        Resources resources2 = context.getResources();
                        int identifier2 = (source3 == 4194304 && i == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                        Objects.requireNonNull(viewConfiguration);
                        if (identifier2 == -1) {
                            i5 = viewConfiguration.getScaledMaximumFlingVelocity();
                        } else if (identifier2 != 0) {
                            i5 = resources2.getDimensionPixelSize(identifier2);
                        }
                    }
                    i5 = Integer.MIN_VALUE;
                }
                iArr[1] = i5;
                bkVar.f = source;
                bkVar.g = deviceId;
                bkVar.e = i;
                z2 = true;
            }
            int i8 = iArr[i3];
            VelocityTracker velocityTracker = bkVar.c;
            if (i8 == Integer.MAX_VALUE) {
                if (velocityTracker == null) {
                    return z;
                }
                velocityTracker.recycle();
                bkVar.c = null;
                return z;
            }
            if (velocityTracker == null) {
                bkVar.c = VelocityTracker.obtain();
            }
            VelocityTracker velocityTracker2 = bkVar.c;
            Map map = ll0.a;
            velocityTracker2.addMovement(motionEvent);
            if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
                Map map2 = ll0.a;
                if (!map2.containsKey(velocityTracker2)) {
                    map2.put(velocityTracker2, new ml0());
                }
                ml0 ml0Var = (ml0) map2.get(velocityTracker2);
                long[] jArr = ml0Var.b;
                long eventTime = motionEvent.getEventTime();
                if (ml0Var.d != 0 && eventTime - jArr[ml0Var.e] > 40) {
                    ml0Var.d = i3;
                    ml0Var.c = 0.0f;
                }
                int i9 = (ml0Var.e + 1) % 20;
                ml0Var.e = i9;
                int i10 = ml0Var.d;
                if (i10 != 20) {
                    ml0Var.d = i10 + 1;
                }
                ml0Var.a[i9] = motionEvent.getAxisValue(26);
                jArr[ml0Var.e] = eventTime;
            }
            float f6 = Float.MAX_VALUE;
            velocityTracker2.computeCurrentVelocity(1000, Float.MAX_VALUE);
            ml0 ml0Var2 = (ml0) ll0.a.get(velocityTracker2);
            if (ml0Var2 != null) {
                float[] fArr = ml0Var2.a;
                long[] jArr2 = ml0Var2.b;
                int i11 = ml0Var2.d;
                if (i11 < 2) {
                    f4 = Float.MAX_VALUE;
                } else {
                    int i12 = ml0Var2.e;
                    int i13 = ((i12 + 20) - (i11 - 1)) % 20;
                    long j2 = jArr2[i12];
                    while (true) {
                        j = jArr2[i13];
                        long j3 = j2 - j;
                        f4 = f6;
                        i6 = ml0Var2.d;
                        if (j3 <= 100) {
                            break;
                        }
                        ml0Var2.d = i6 - 1;
                        i13 = (i13 + 1) % 20;
                        f6 = f4;
                    }
                    if (i6 >= 2) {
                        if (i6 == 2) {
                            int i14 = (i13 + 1) % 20;
                            if (j != jArr2[i14]) {
                                sqrt = fArr[i14] / (r11 - j);
                                z3 = z2;
                            }
                        } else {
                            float f7 = 0.0f;
                            int i15 = 0;
                            int i16 = 0;
                            while (true) {
                                if (i15 >= ml0Var2.d - 1) {
                                    break;
                                }
                                int i17 = i15 + i13;
                                long j4 = jArr2[i17 % 20];
                                int i18 = (i17 + 1) % 20;
                                if (jArr2[i18] == j4) {
                                    z4 = z2;
                                } else {
                                    i16++;
                                    float f8 = f7;
                                    z4 = z2;
                                    float sqrt2 = (f7 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(2.0f * Math.abs(f7)));
                                    float f9 = fArr[i18] / (jArr2[i18] - j4);
                                    f7 = (Math.abs(f9) * (f9 - sqrt2)) + f8;
                                    if (i16 == z) {
                                        f7 *= 0.5f;
                                    }
                                }
                                i15++;
                                z2 = z4;
                                z = true;
                            }
                            z3 = z2;
                            sqrt = ((float) Math.sqrt(Math.abs(r28) * 2.0f)) * (f7 < 0.0f ? -1.0f : 1.0f);
                        }
                        f5 = sqrt * 1000.0f;
                        ml0Var2.c = f5;
                        if (f5 >= (-Math.abs(f4))) {
                            ml0Var2.c = -Math.abs(f4);
                        } else if (ml0Var2.c > Math.abs(f4)) {
                            ml0Var2.c = Math.abs(f4);
                        }
                    }
                }
                z3 = z2;
                sqrt = 0.0f;
                f5 = sqrt * 1000.0f;
                ml0Var2.c = f5;
                if (f5 >= (-Math.abs(f4))) {
                }
            } else {
                z3 = z2;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                f2 = j0.b(velocityTracker2, i);
            } else if (i == 0) {
                f2 = velocityTracker2.getXVelocity();
            } else if (i == 1) {
                f2 = velocityTracker2.getYVelocity();
            } else {
                ml0 ml0Var3 = (ml0) ll0.a.get(velocityTracker2);
                f2 = (ml0Var3 == null || i != 26) ? 0.0f : ml0Var3.c;
            }
            float f10 = f2 * (-nestedScrollView.getVerticalScrollFactorCompat());
            float signum = Math.signum(f10);
            if (z3 || (signum != Math.signum(bkVar.d) && signum != 0.0f)) {
                nestedScrollView.i.abortAnimation();
            }
            if (Math.abs(f10) >= iArr[0]) {
                float max = Math.max(-r3, Math.min(f10, iArr[1]));
                if (max == 0.0f) {
                    f3 = 0.0f;
                } else {
                    nestedScrollView.i.abortAnimation();
                    nestedScrollView.j((int) max);
                    f3 = max;
                }
                bkVar.d = f3;
                return true;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2 && this.q) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.x;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y - this.m) > this.u && (2 & getNestedScrollAxes()) == 0) {
                                this.q = true;
                                this.m = y;
                                if (this.r == null) {
                                    this.r = VelocityTracker.obtain();
                                }
                                this.r.addMovement(motionEvent);
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
            this.q = false;
            this.x = -1;
            VelocityTracker velocityTracker = this.r;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.r = null;
            }
            if (this.i.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            w(0);
        } else {
            int y2 = (int) motionEvent.getY();
            int x = (int) motionEvent.getX();
            int childCount = getChildCount();
            OverScroller overScroller = this.i;
            if (childCount > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y2 >= childAt.getTop() - scrollY && y2 < childAt.getBottom() - scrollY && x >= childAt.getLeft() && x < childAt.getRight()) {
                    this.m = y2;
                    this.x = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.r;
                    if (velocityTracker2 == null) {
                        this.r = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.r.addMovement(motionEvent);
                    overScroller.computeScrollOffset();
                    if (!v(motionEvent) && overScroller.isFinished()) {
                        z = false;
                    }
                    this.q = z;
                    this.E.g(2, 0);
                }
            }
            if (!v(motionEvent) && overScroller.isFinished()) {
                z = false;
            }
            this.q = z;
            VelocityTracker velocityTracker3 = this.r;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.r = null;
            }
        }
        return this.q;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        int i6 = 0;
        this.n = false;
        View view = this.p;
        if (view != null && l(view, this)) {
            View view2 = this.p;
            Rect rect = this.h;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h = h(rect);
            if (h != 0) {
                scrollBy(0, h);
            }
        }
        this.p = null;
        if (!this.o) {
            if (this.C != null) {
                scrollTo(getScrollX(), this.C.f);
                this.C = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i5 = 0;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i5 && scrollY >= 0) {
                i6 = paddingTop + scrollY > i5 ? i5 - paddingTop : scrollY;
            }
            if (i6 != scrollY) {
                scrollTo(getScrollX(), i6);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.o = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.s && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
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
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        j((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.E.b(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        this.E.c(i, i2, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        n(i4, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        a(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
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
        if (!(parcelable instanceof o30)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        o30 o30Var = (o30) parcelable;
        super.onRestoreInstanceState(o30Var.getSuperState());
        this.C = o30Var;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        o30 o30Var = new o30(super.onSaveInstanceState());
        o30Var.f = getScrollY();
        return o30Var;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !m(findFocus, 0, i4)) {
            return;
        }
        Rect rect = this.h;
        findFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(findFocus, rect);
        int h = h(rect);
        if (h != 0) {
            if (this.t) {
                u(0, h, false);
            } else {
                scrollBy(0, h);
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
    /* JADX WARN: Removed duplicated region for block: B:51:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0144  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        float F;
        int round;
        if (this.r == null) {
            this.r = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.A = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float f = 0.0f;
        obtain.offsetLocation(0.0f, this.A);
        q30 q30Var = this.E;
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.j;
            EdgeEffect edgeEffect2 = this.k;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.r;
                velocityTracker.computeCurrentVelocity(1000, this.w);
                int yVelocity = (int) velocityTracker.getYVelocity(this.x);
                if (Math.abs(yVelocity) >= this.v) {
                    if (d50.u(edgeEffect) != 0.0f) {
                        if (t(edgeEffect, yVelocity)) {
                            edgeEffect.onAbsorb(yVelocity);
                        } else {
                            j(-yVelocity);
                        }
                    } else if (d50.u(edgeEffect2) != 0.0f) {
                        int i = -yVelocity;
                        if (t(edgeEffect2, i)) {
                            edgeEffect2.onAbsorb(i);
                        } else {
                            j(i);
                        }
                    } else {
                        int i2 = -yVelocity;
                        float f2 = i2;
                        if (!q30Var.b(0.0f, f2)) {
                            dispatchNestedFling(0.0f, f2, true);
                            j(i2);
                        }
                    }
                } else if (this.i.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.x = -1;
                this.q = false;
                VelocityTracker velocityTracker2 = this.r;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.r = null;
                }
                w(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.x);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.x + " in onTouchEvent");
                } else {
                    int y = (int) motionEvent.getY(findPointerIndex);
                    int i3 = this.m - y;
                    float x = motionEvent.getX(findPointerIndex) / getWidth();
                    float height = i3 / getHeight();
                    if (d50.u(edgeEffect) != 0.0f) {
                        F = -d50.F(edgeEffect, -height, x);
                        if (d50.u(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                    } else {
                        if (d50.u(edgeEffect2) != 0.0f) {
                            F = d50.F(edgeEffect2, height, 1.0f - x);
                            if (d50.u(edgeEffect2) == 0.0f) {
                                edgeEffect2.onRelease();
                            }
                        }
                        round = Math.round(f * getHeight());
                        if (round != 0) {
                            invalidate();
                        }
                        int i4 = i3 - round;
                        if (!this.q) {
                            int abs = Math.abs(i4);
                            int i5 = this.u;
                            if (abs > i5) {
                                ViewParent parent2 = getParent();
                                if (parent2 != null) {
                                    parent2.requestDisallowInterceptTouchEvent(true);
                                }
                                this.q = true;
                                i4 = i4 > 0 ? i4 - i5 : i4 + i5;
                            }
                        }
                        if (this.q) {
                            int s = s(i4, 1, motionEvent, (int) motionEvent.getX(findPointerIndex), 0, false);
                            this.m = y - s;
                            this.A += s;
                        }
                    }
                    f = F;
                    round = Math.round(f * getHeight());
                    if (round != 0) {
                    }
                    int i42 = i3 - round;
                    if (!this.q) {
                    }
                    if (this.q) {
                    }
                }
            } else if (actionMasked == 3) {
                if (this.q && getChildCount() > 0) {
                    if (this.i.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        postInvalidateOnAnimation();
                    }
                }
                this.x = -1;
                this.q = false;
                VelocityTracker velocityTracker3 = this.r;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.r = null;
                }
                w(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.m = (int) motionEvent.getY(actionIndex);
                this.x = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                o(motionEvent);
                this.m = (int) motionEvent.getY(motionEvent.findPointerIndex(this.x));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.q && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            OverScroller overScroller = this.i;
            if (!overScroller.isFinished()) {
                overScroller.abortAnimation();
                w(1);
            }
            int y2 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.m = y2;
            this.x = pointerId;
            q30Var.g(2, 0);
        }
        VelocityTracker velocityTracker4 = this.r;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public final boolean p(int i, int i2, int i3, int i4) {
        int i5;
        boolean z;
        int i6;
        boolean z2;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i7 = i3 + i;
        if (i2 <= 0 && i2 >= 0) {
            i5 = i2;
            z = false;
        } else {
            i5 = 0;
            z = true;
        }
        if (i7 > i4) {
            i6 = i4;
        } else {
            if (i7 >= 0) {
                i6 = i7;
                z2 = false;
                if (z2 && !this.E.f(1)) {
                    this.i.springBack(i5, i6, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i5, i6);
                return !z || z2;
            }
            i6 = 0;
        }
        z2 = true;
        if (z2) {
            this.i.springBack(i5, i6, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i5, i6);
        if (z) {
        }
    }

    public final void q(int i) {
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.h;
        if (z) {
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
        int i2 = rect.top;
        int i3 = height + i2;
        rect.bottom = i3;
        r(i, i2, i3);
    }

    public final boolean r(int i, int i2, int i3) {
        boolean z;
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z2 = i == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z3 = false;
        for (int i5 = 0; i5 < size; i5++) {
            View view2 = focusables.get(i5);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i2 < bottom && top < i3) {
                boolean z4 = i2 < top && bottom < i3;
                if (view == null) {
                    view = view2;
                    z3 = z4;
                } else {
                    boolean z5 = (z2 && top < view.getTop()) || (!z2 && bottom > view.getBottom());
                    if (z3) {
                        if (z4) {
                            if (!z5) {
                            }
                            view = view2;
                        }
                    } else if (z4) {
                        view = view2;
                        z3 = true;
                    } else {
                        if (!z5) {
                        }
                        view = view2;
                    }
                }
            }
        }
        View view3 = view == null ? this : view;
        if (i2 < scrollY || i3 > i4) {
            s(z2 ? i2 - scrollY : i3 - i4, -1, null, 0, 1, true);
            z = true;
        } else {
            z = false;
        }
        if (view3 != findFocus()) {
            view3.requestFocus(i);
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.n) {
            this.p = view2;
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
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int h = h(rect);
        boolean z2 = h != 0;
        if (z2) {
            if (z) {
                scrollBy(0, h);
                return z2;
            }
            u(0, h, false);
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        VelocityTracker velocityTracker;
        if (z && (velocityTracker = this.r) != null) {
            velocityTracker.recycle();
            this.r = null;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.n = true;
        super.requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int s(int i, int i2, MotionEvent motionEvent, int i3, int i4, boolean z) {
        int i5;
        int i6;
        boolean z2;
        boolean z3;
        VelocityTracker velocityTracker;
        q30 q30Var = this.E;
        if (i4 == 1) {
            q30Var.g(2, i4);
        }
        boolean c = this.E.c(0, i, i4, this.z, this.y);
        int[] iArr = this.y;
        int[] iArr2 = this.z;
        if (c) {
            i5 = i - iArr2[1];
            i6 = iArr[1];
        } else {
            i5 = i;
            i6 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z4 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z;
        boolean z5 = p(i5, 0, scrollY, scrollRange) && !q30Var.f(i4);
        int scrollY2 = getScrollY() - scrollY;
        if (motionEvent != null && scrollY2 != 0) {
            getScrollFeedbackProvider().a.onScrollProgress(motionEvent.getDeviceId(), motionEvent.getSource(), i2, scrollY2);
        }
        iArr2[1] = 0;
        this.E.d(0, scrollY2, 0, i5 - scrollY2, this.y, i4, iArr2);
        int i7 = i6 + iArr[1];
        int i8 = i5 - iArr2[1];
        int i9 = scrollY + i8;
        EdgeEffect edgeEffect = this.k;
        EdgeEffect edgeEffect2 = this.j;
        if (i9 < 0) {
            if (z4) {
                d50.F(edgeEffect2, (-i8) / getHeight(), i3 / getWidth());
                if (motionEvent != null) {
                    getScrollFeedbackProvider().a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i2, true);
                }
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i9 > scrollRange && z4) {
            d50.F(edgeEffect, i8 / getHeight(), 1.0f - (i3 / getWidth()));
            if (motionEvent != null) {
                z2 = false;
                getScrollFeedbackProvider().a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i2, false);
            } else {
                z2 = false;
            }
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
            if (edgeEffect2.isFinished() || !edgeEffect.isFinished()) {
                postInvalidateOnAnimation();
                z3 = z2;
            } else {
                z3 = z5;
            }
            if (z3 && i4 == 0 && (velocityTracker = this.r) != null) {
                velocityTracker.clear();
            }
            if (i4 == 1) {
                w(i4);
                edgeEffect2.onRelease();
                edgeEffect.onRelease();
            }
            return i7;
        }
        z2 = false;
        if (edgeEffect2.isFinished()) {
        }
        postInvalidateOnAnimation();
        z3 = z2;
        if (z3) {
            velocityTracker.clear();
        }
        if (i4 == 1) {
        }
        return i7;
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
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
            if (height >= height2 || i2 < 0) {
                i2 = 0;
            } else if (height + i2 > height2) {
                i2 = height2 - height;
            }
            if (i == getScrollX() && i2 == getScrollY()) {
                return;
            }
            super.scrollTo(i, i2);
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.s) {
            this.s = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        q30 q30Var = this.E;
        if (q30Var.d) {
            ViewGroup viewGroup = q30Var.c;
            WeakHashMap weakHashMap = hm0.a;
            viewGroup.stopNestedScroll();
        }
        q30Var.d = z;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.t = z;
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
        float u = d50.u(edgeEffect) * getHeight();
        float abs = Math.abs(-i) * 0.35f;
        float f = this.f * 0.015f;
        double log = Math.log(abs / f);
        double d = H;
        return ((float) (Math.exp((d / (d - 1.0d)) * log) * ((double) f))) < u;
    }

    public final void u(int i, int i2, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.g > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int max = Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY;
            this.i.startScroll(getScrollX(), scrollY, 0, max, 250);
            if (z) {
                this.E.g(2, 1);
            } else {
                w(1);
            }
            this.B = getScrollY();
            postInvalidateOnAnimation();
        } else {
            OverScroller overScroller = this.i;
            if (!overScroller.isFinished()) {
                overScroller.abortAnimation();
                w(1);
            }
            scrollBy(i, i2);
        }
        this.g = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean v(MotionEvent motionEvent) {
        boolean z;
        EdgeEffect edgeEffect = this.j;
        if (d50.u(edgeEffect) != 0.0f) {
            d50.F(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.k;
        if (d50.u(edgeEffect2) == 0.0f) {
            return z;
        }
        d50.F(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void w(int i) {
        this.E.h(i);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
        } else {
            s9.u("ScrollView can host only one direct child");
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
        } else {
            s9.u("ScrollView can host only one direct child");
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
        } else {
            s9.u("ScrollView can host only one direct child");
        }
    }

    public void setOnScrollChangeListener(n30 n30Var) {
    }
}
