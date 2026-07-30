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
import defpackage.ak0;
import defpackage.at0;
import defpackage.df0;
import defpackage.df2;
import defpackage.du;
import defpackage.e53;
import defpackage.fb0;
import defpackage.h53;
import defpackage.iv1;
import defpackage.j43;
import defpackage.k43;
import defpackage.lh;
import defpackage.nr1;
import defpackage.or1;
import defpackage.pr1;
import defpackage.qr1;
import defpackage.rr1;
import defpackage.sf0;
import defpackage.v1;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements rr1 {
    public static final float O = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final nr1 P = new nr1();
    public static final int[] Q = {R.attr.fillViewport};
    public boolean A;
    public final int B;
    public final int C;
    public final int D;
    public int E;
    public final int[] F;
    public final int[] G;
    public int H;
    public int I;
    public pr1 J;
    public final ak0 K;
    public final du L;
    public float M;
    public final fb0 N;
    public final float m;
    public long n;
    public final Rect o;
    public final OverScroller p;
    public final EdgeEffect q;
    public final EdgeEffect r;
    public df2 s;
    public int t;
    public boolean u;
    public boolean v;
    public View w;
    public boolean x;
    public VelocityTracker y;
    public boolean z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.majelw.libystne.R.attr.nestedScrollViewStyle);
        this.o = new Rect();
        this.u = true;
        this.v = false;
        this.w = null;
        this.x = false;
        this.A = true;
        this.E = -1;
        this.F = new int[2];
        this.G = new int[2];
        this.N = new fb0(getContext(), new at0(this));
        int i = Build.VERSION.SDK_INT;
        this.q = i >= 31 ? df0.a(context, attributeSet) : new EdgeEffect(context);
        this.r = i >= 31 ? df0.a(context, attributeSet) : new EdgeEffect(context);
        this.m = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.p = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.B = viewConfiguration.getScaledTouchSlop();
        this.C = viewConfiguration.getScaledMinimumFlingVelocity();
        this.D = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Q, com.majelw.libystne.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.K = new ak0();
        du duVar = new du();
        duVar.d = this;
        this.L = duVar;
        setNestedScrollingEnabled(true);
        e53.i(this, P);
    }

    private df2 getScrollFeedbackProvider() {
        if (this.s == null) {
            this.s = new df2(this);
        }
        return this.s;
    }

    public static boolean m(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m((View) parent, nestedScrollView);
    }

    @Override // defpackage.qr1
    public final void a(View view, View view2, int i, int i2) {
        ak0 ak0Var = this.K;
        if (i2 == 1) {
            ak0Var.n = i;
        } else {
            ak0Var.m = i;
        }
        w(2, i2);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
        } else {
            lh.g("ScrollView can host only one direct child");
        }
    }

    @Override // defpackage.qr1
    public final void b(View view, int i) {
        ak0 ak0Var = this.K;
        if (i == 1) {
            ak0Var.n = 0;
        } else {
            ak0Var.m = 0;
        }
        y(i);
    }

    @Override // defpackage.rr1
    public final void c(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        o(i4, i5, iArr);
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

    /* JADX WARN: Removed duplicated region for block: B:15:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b3  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void computeScroll() {
        int round;
        int i;
        int i2;
        OverScroller overScroller = this.p;
        if (overScroller.isFinished()) {
            return;
        }
        overScroller.computeScrollOffset();
        int currY = overScroller.getCurrY();
        int i3 = currY - this.I;
        int height = getHeight();
        EdgeEffect edgeEffect = this.q;
        EdgeEffect edgeEffect2 = this.r;
        if (i3 <= 0 || iv1.E(edgeEffect) == 0.0f) {
            if (i3 < 0 && iv1.E(edgeEffect2) != 0.0f) {
                float f = height;
                round = Math.round(iv1.N(edgeEffect2, (i3 * 4.0f) / f, 0.5f) * (f / 4.0f));
                if (round != i3) {
                    edgeEffect2.finish();
                }
            }
            this.I = currY;
            int[] iArr = this.G;
            iArr[1] = 0;
            i(0, i3, 1, iArr, null);
            i = i3 - iArr[1];
            int scrollRange = getScrollRange();
            if (Build.VERSION.SDK_INT >= 35) {
                sf0.c(this, Math.abs(overScroller.getCurrVelocity()));
            }
            if (i == 0) {
                int scrollY = getScrollY();
                q(i, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i4 = i - scrollY2;
                iArr[1] = 0;
                i2 = 1;
                this.L.a(0, scrollY2, 0, i4, this.F, 1, iArr);
                i = i4 - iArr[1];
            } else {
                i2 = 1;
            }
            if (i != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == i2 && scrollRange > 0)) {
                    if (i < 0) {
                        if (edgeEffect.isFinished()) {
                            edgeEffect.onAbsorb((int) overScroller.getCurrVelocity());
                        }
                    } else if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) overScroller.getCurrVelocity());
                    }
                }
                overScroller.abortAnimation();
                y(i2);
            }
            if (overScroller.isFinished()) {
                postInvalidateOnAnimation();
                return;
            } else {
                y(i2);
                return;
            }
        }
        round = Math.round(iv1.N(edgeEffect, ((-i3) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (round != i3) {
            edgeEffect.finish();
        }
        i3 -= round;
        this.I = currY;
        int[] iArr2 = this.G;
        iArr2[1] = 0;
        i(0, i3, 1, iArr2, null);
        i = i3 - iArr2[1];
        int scrollRange2 = getScrollRange();
        if (Build.VERSION.SDK_INT >= 35) {
        }
        if (i == 0) {
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

    @Override // defpackage.qr1
    public final void d(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4, int i5) {
        o(i4, i5, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || j(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        ViewParent c;
        du duVar = this.L;
        if (duVar.a && (c = duVar.c(0)) != null) {
            try {
                return c.onNestedFling((NestedScrollView) duVar.d, f, f2, z);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + c + " does not implement interface method onNestedFling", e);
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        ViewParent c;
        du duVar = this.L;
        if (duVar.a && (c = duVar.c(0)) != null) {
            try {
                return c.onNestedPreFling((NestedScrollView) duVar.d, f, f2);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + c + " does not implement interface method onNestedPreFling", e);
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return i(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.L.a(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.q;
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
        EdgeEffect edgeEffect2 = this.r;
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

    @Override // defpackage.qr1
    public final void e(int i, int i2, int i3, int[] iArr) {
        i(i, i2, i3, iArr, null);
    }

    @Override // defpackage.qr1
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
        if (findNextFocus == null || !n(findNextFocus, maxScrollAmount, getHeight())) {
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
            t(maxScrollAmount, -1, null, 0, 1, true);
        } else {
            Rect rect = this.o;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            t(h(rect), -1, null, 0, 1, true);
            findNextFocus.requestFocus(i);
        }
        if (view != null && view.isFocused() && !n(view, 0, getHeight())) {
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
        ak0 ak0Var = this.K;
        return ak0Var.n | ak0Var.m;
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
        if (this.M == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                lh.g("Expected theme to define listPreferredItemHeight.");
                return 0.0f;
            }
            this.M = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.M;
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
        return this.L.c(0) != null;
    }

    public final boolean i(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        ViewParent c;
        int i4;
        int i5;
        du duVar = this.L;
        NestedScrollView nestedScrollView = (NestedScrollView) duVar.d;
        if (!duVar.a || (c = duVar.c(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        if (iArr2 != null) {
            nestedScrollView.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            if (((int[]) duVar.e) == null) {
                duVar.e = new int[2];
            }
            iArr = (int[]) duVar.e;
        }
        iArr[0] = 0;
        iArr[1] = 0;
        NestedScrollView nestedScrollView2 = (NestedScrollView) duVar.d;
        if (c instanceof qr1) {
            ((qr1) c).e(i, i2, i3, iArr);
        } else if (i3 == 0) {
            try {
                c.onNestedPreScroll(nestedScrollView2, i, i2, iArr);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + c + " does not implement interface method onNestedPreScroll", e);
            }
        }
        if (iArr2 != null) {
            nestedScrollView.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.L.a;
    }

    public final boolean j(KeyEvent keyEvent) {
        this.o.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 19) {
                        return keyEvent.isAltPressed() ? l(33) : g(33);
                    }
                    if (keyCode == 20) {
                        return keyEvent.isAltPressed() ? l(130) : g(130);
                    }
                    if (keyCode == 62) {
                        r(keyEvent.isShiftPressed() ? 33 : 130);
                        return false;
                    }
                    if (keyCode == 92) {
                        return l(33);
                    }
                    if (keyCode == 93) {
                        return l(130);
                    }
                    if (keyCode == 122) {
                        r(33);
                        return false;
                    }
                    if (keyCode == 123) {
                        r(130);
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

    public final void k(int i) {
        if (getChildCount() > 0) {
            this.p.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            w(2, 1);
            this.I = getScrollY();
            postInvalidateOnAnimation();
            if (Build.VERSION.SDK_INT >= 35) {
                sf0.c(this, Math.abs(this.p.getCurrVelocity()));
            }
        }
    }

    public final boolean l(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.o;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return s(i, rect.top, rect.bottom);
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

    public final boolean n(View view, int i, int i2) {
        Rect rect = this.o;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i >= getScrollY() && rect.top - i <= getScrollY() + i2;
    }

    public final void o(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.L.a(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.v = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x0124, code lost:
    
        if (r7 >= 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x00d9, code lost:
    
        if (r8 >= 0) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02a5  */
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
        if (motionEvent.getAction() != 8 || this.x) {
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
        t(-((int) (getVerticalScrollFactorCompat() * f)), i, motionEvent, i2, 1, (motionEvent.getSource() & 8194) == 8194);
        if (i != 0) {
            fb0 fb0Var = this.N;
            NestedScrollView nestedScrollView = (NestedScrollView) fb0Var.b.m;
            int[] iArr = fb0Var.h;
            int source = motionEvent.getSource();
            int deviceId = motionEvent.getDeviceId();
            if (fb0Var.f == source && fb0Var.g == deviceId && fb0Var.e == i) {
                z2 = false;
                z = true;
                i3 = 0;
            } else {
                Context context = fb0Var.a;
                z = true;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int deviceId2 = motionEvent.getDeviceId();
                int source2 = motionEvent.getSource();
                i3 = 0;
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 34) {
                    Method method = h53.a;
                    i4 = v1.j(viewConfiguration, deviceId2, i, source2);
                } else {
                    Method method2 = h53.a;
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
                    i5 = v1.i(viewConfiguration, deviceId3, i, source3);
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
                fb0Var.f = source;
                fb0Var.g = deviceId;
                fb0Var.e = i;
                z2 = true;
            }
            int i8 = iArr[i3];
            VelocityTracker velocityTracker = fb0Var.c;
            if (i8 == Integer.MAX_VALUE) {
                if (velocityTracker == null) {
                    return z;
                }
                velocityTracker.recycle();
                fb0Var.c = null;
                return z;
            }
            if (velocityTracker == null) {
                fb0Var.c = VelocityTracker.obtain();
            }
            VelocityTracker velocityTracker2 = fb0Var.c;
            Map map = j43.a;
            velocityTracker2.addMovement(motionEvent);
            if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
                Map map2 = j43.a;
                if (!map2.containsKey(velocityTracker2)) {
                    map2.put(velocityTracker2, new k43());
                }
                k43 k43Var = (k43) map2.get(velocityTracker2);
                long[] jArr = k43Var.b;
                long eventTime = motionEvent.getEventTime();
                if (k43Var.d != 0 && eventTime - jArr[k43Var.e] > 40) {
                    k43Var.d = i3;
                    k43Var.c = 0.0f;
                }
                int i9 = (k43Var.e + 1) % 20;
                k43Var.e = i9;
                int i10 = k43Var.d;
                if (i10 != 20) {
                    k43Var.d = i10 + 1;
                }
                k43Var.a[i9] = motionEvent.getAxisValue(26);
                jArr[k43Var.e] = eventTime;
            }
            float f6 = Float.MAX_VALUE;
            velocityTracker2.computeCurrentVelocity(1000, Float.MAX_VALUE);
            k43 k43Var2 = (k43) j43.a.get(velocityTracker2);
            if (k43Var2 != null) {
                float[] fArr = k43Var2.a;
                long[] jArr2 = k43Var2.b;
                int i11 = k43Var2.d;
                if (i11 < 2) {
                    f4 = Float.MAX_VALUE;
                } else {
                    int i12 = k43Var2.e;
                    int i13 = ((i12 + 20) - (i11 - 1)) % 20;
                    long j2 = jArr2[i12];
                    while (true) {
                        j = jArr2[i13];
                        long j3 = j2 - j;
                        f4 = f6;
                        i6 = k43Var2.d;
                        if (j3 <= 100) {
                            break;
                        }
                        k43Var2.d = i6 - 1;
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
                                if (i15 >= k43Var2.d - 1) {
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
                            sqrt = ((float) Math.sqrt(Math.abs(r29) * 2.0f)) * (f7 < 0.0f ? -1.0f : 1.0f);
                        }
                        f5 = sqrt * 1000.0f;
                        k43Var2.c = f5;
                        if (f5 >= (-Math.abs(f4))) {
                            k43Var2.c = -Math.abs(f4);
                        } else if (k43Var2.c > Math.abs(f4)) {
                            k43Var2.c = Math.abs(f4);
                        }
                    }
                }
                z3 = z2;
                sqrt = 0.0f;
                f5 = sqrt * 1000.0f;
                k43Var2.c = f5;
                if (f5 >= (-Math.abs(f4))) {
                }
            } else {
                z3 = z2;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                f2 = v1.c(velocityTracker2, i);
            } else if (i == 0) {
                f2 = velocityTracker2.getXVelocity();
            } else if (i == 1) {
                f2 = velocityTracker2.getYVelocity();
            } else {
                k43 k43Var3 = (k43) j43.a.get(velocityTracker2);
                f2 = (k43Var3 == null || i != 26) ? 0.0f : k43Var3.c;
            }
            float f10 = f2 * (-nestedScrollView.getVerticalScrollFactorCompat());
            float signum = Math.signum(f10);
            if (z3 || (signum != Math.signum(fb0Var.d) && signum != 0.0f)) {
                nestedScrollView.p.abortAnimation();
            }
            if (Math.abs(f10) >= iArr[0]) {
                float max = Math.max(-r3, Math.min(f10, iArr[1]));
                if (max == 0.0f) {
                    f3 = 0.0f;
                } else {
                    nestedScrollView.p.abortAnimation();
                    nestedScrollView.k((int) max);
                    f3 = max;
                }
                fb0Var.d = f3;
                return true;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2 && this.x) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.E;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y - this.t) > this.B && (2 & getNestedScrollAxes()) == 0) {
                                this.x = true;
                                this.t = y;
                                if (this.y == null) {
                                    this.y = VelocityTracker.obtain();
                                }
                                this.y.addMovement(motionEvent);
                                this.H = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        p(motionEvent);
                    }
                }
            }
            this.x = false;
            this.E = -1;
            VelocityTracker velocityTracker = this.y;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.y = null;
            }
            if (this.p.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            y(0);
        } else {
            int y2 = (int) motionEvent.getY();
            int x = (int) motionEvent.getX();
            int childCount = getChildCount();
            OverScroller overScroller = this.p;
            if (childCount > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y2 >= childAt.getTop() - scrollY && y2 < childAt.getBottom() - scrollY && x >= childAt.getLeft() && x < childAt.getRight()) {
                    this.t = y2;
                    this.E = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.y;
                    if (velocityTracker2 == null) {
                        this.y = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.y.addMovement(motionEvent);
                    overScroller.computeScrollOffset();
                    if (!x(motionEvent) && overScroller.isFinished()) {
                        z = false;
                    }
                    this.x = z;
                    w(2, 0);
                }
            }
            if (!x(motionEvent) && overScroller.isFinished()) {
                z = false;
            }
            this.x = z;
            VelocityTracker velocityTracker3 = this.y;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.y = null;
            }
        }
        return this.x;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        int i6 = 0;
        this.u = false;
        View view = this.w;
        if (view != null && m(view, this)) {
            View view2 = this.w;
            Rect rect = this.o;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h = h(rect);
            if (h != 0) {
                scrollBy(0, h);
            }
        }
        this.w = null;
        if (!this.v) {
            if (this.J != null) {
                scrollTo(getScrollX(), this.J.m);
                this.J = null;
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
        this.v = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.z && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
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
        k((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        i(i, i2, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        o(i4, 0, null);
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
        if (findNextFocus != null && n(findNextFocus, 0, getHeight())) {
            return findNextFocus.requestFocus(i, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof pr1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        pr1 pr1Var = (pr1) parcelable;
        super.onRestoreInstanceState(pr1Var.getSuperState());
        this.J = pr1Var;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        pr1 pr1Var = new pr1(super.onSaveInstanceState());
        pr1Var.m = getScrollY();
        return pr1Var;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !n(findFocus, 0, i4)) {
            return;
        }
        Rect rect = this.o;
        findFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(findFocus, rect);
        int h = h(rect);
        if (h != 0) {
            if (this.A) {
                v(0, h, false);
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

    /* JADX WARN: Removed duplicated region for block: B:48:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0141  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        float N;
        int round;
        if (this.y == null) {
            this.y = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.H = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float f = 0.0f;
        obtain.offsetLocation(0.0f, this.H);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.q;
            EdgeEffect edgeEffect2 = this.r;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.y;
                velocityTracker.computeCurrentVelocity(1000, this.D);
                int yVelocity = (int) velocityTracker.getYVelocity(this.E);
                if (Math.abs(yVelocity) >= this.C) {
                    if (iv1.E(edgeEffect) != 0.0f) {
                        if (u(edgeEffect, yVelocity)) {
                            edgeEffect.onAbsorb(yVelocity);
                        } else {
                            k(-yVelocity);
                        }
                    } else if (iv1.E(edgeEffect2) != 0.0f) {
                        int i = -yVelocity;
                        if (u(edgeEffect2, i)) {
                            edgeEffect2.onAbsorb(i);
                        } else {
                            k(i);
                        }
                    } else {
                        int i2 = -yVelocity;
                        float f2 = i2;
                        if (!dispatchNestedPreFling(0.0f, f2)) {
                            dispatchNestedFling(0.0f, f2, true);
                            k(i2);
                        }
                    }
                } else if (this.p.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.E = -1;
                this.x = false;
                VelocityTracker velocityTracker2 = this.y;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.y = null;
                }
                y(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.E);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.E + " in onTouchEvent");
                } else {
                    int y = (int) motionEvent.getY(findPointerIndex);
                    int i3 = this.t - y;
                    float x = motionEvent.getX(findPointerIndex) / getWidth();
                    float height = i3 / getHeight();
                    if (iv1.E(edgeEffect) != 0.0f) {
                        N = -iv1.N(edgeEffect, -height, x);
                        if (iv1.E(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                    } else {
                        if (iv1.E(edgeEffect2) != 0.0f) {
                            N = iv1.N(edgeEffect2, height, 1.0f - x);
                            if (iv1.E(edgeEffect2) == 0.0f) {
                                edgeEffect2.onRelease();
                            }
                        }
                        round = Math.round(f * getHeight());
                        if (round != 0) {
                            invalidate();
                        }
                        int i4 = i3 - round;
                        if (!this.x) {
                            int abs = Math.abs(i4);
                            int i5 = this.B;
                            if (abs > i5) {
                                ViewParent parent2 = getParent();
                                if (parent2 != null) {
                                    parent2.requestDisallowInterceptTouchEvent(true);
                                }
                                this.x = true;
                                i4 = i4 > 0 ? i4 - i5 : i4 + i5;
                            }
                        }
                        if (this.x) {
                            int t = t(i4, 1, motionEvent, (int) motionEvent.getX(findPointerIndex), 0, false);
                            this.t = y - t;
                            this.H += t;
                        }
                    }
                    f = N;
                    round = Math.round(f * getHeight());
                    if (round != 0) {
                    }
                    int i42 = i3 - round;
                    if (!this.x) {
                    }
                    if (this.x) {
                    }
                }
            } else if (actionMasked == 3) {
                if (this.x && getChildCount() > 0) {
                    if (this.p.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        postInvalidateOnAnimation();
                    }
                }
                this.E = -1;
                this.x = false;
                VelocityTracker velocityTracker3 = this.y;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.y = null;
                }
                y(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.t = (int) motionEvent.getY(actionIndex);
                this.E = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                p(motionEvent);
                this.t = (int) motionEvent.getY(motionEvent.findPointerIndex(this.E));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.x && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            OverScroller overScroller = this.p;
            if (!overScroller.isFinished()) {
                overScroller.abortAnimation();
                y(1);
            }
            int y2 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.t = y2;
            this.E = pointerId;
            w(2, 0);
        }
        VelocityTracker velocityTracker4 = this.y;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public final void p(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.E) {
            int i = actionIndex == 0 ? 1 : 0;
            this.t = (int) motionEvent.getY(i);
            this.E = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.y;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean q(int i, int i2, int i3, int i4) {
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
                if (z2 && this.L.c(1) == null) {
                    this.p.springBack(i5, i6, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i5, i6);
                return !z || z2;
            }
            i6 = 0;
        }
        z2 = true;
        if (z2) {
            this.p.springBack(i5, i6, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i5, i6);
        if (z) {
        }
    }

    public final void r(int i) {
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.o;
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
        s(i, i2, i3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.u) {
            this.w = view2;
        } else {
            Rect rect = this.o;
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
            v(0, h, false);
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        VelocityTracker velocityTracker;
        if (z && (velocityTracker = this.y) != null) {
            velocityTracker.recycle();
            this.y = null;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.u = true;
        super.requestLayout();
    }

    public final boolean s(int i, int i2, int i3) {
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
            t(z2 ? i2 - scrollY : i3 - i4, -1, null, 0, 1, true);
            z = true;
        } else {
            z = false;
        }
        if (view3 != findFocus()) {
            view3.requestFocus(i);
        }
        return z;
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
        if (z != this.z) {
            this.z = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        du duVar = this.L;
        if (duVar.a) {
            NestedScrollView nestedScrollView = (NestedScrollView) duVar.d;
            WeakHashMap weakHashMap = e53.a;
            nestedScrollView.stopNestedScroll();
        }
        duVar.a = z;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.A = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return w(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        y(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int t(int i, int i2, MotionEvent motionEvent, int i3, int i4, boolean z) {
        int i5;
        int i6;
        boolean z2;
        boolean z3;
        VelocityTracker velocityTracker;
        if (i4 == 1) {
            w(2, i4);
        }
        boolean i7 = i(0, i, i4, this.G, this.F);
        int[] iArr = this.F;
        int[] iArr2 = this.G;
        if (i7) {
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
        boolean z5 = q(i5, 0, scrollY, scrollRange) && this.L.c(i4) == null;
        int scrollY2 = getScrollY() - scrollY;
        if (motionEvent != null && scrollY2 != 0) {
            getScrollFeedbackProvider().a.onScrollProgress(motionEvent.getDeviceId(), motionEvent.getSource(), i2, scrollY2);
        }
        iArr2[1] = 0;
        this.L.a(0, scrollY2, 0, i5 - scrollY2, this.F, i4, iArr2);
        int i8 = i6 + iArr[1];
        int i9 = i5 - iArr2[1];
        int i10 = scrollY + i9;
        EdgeEffect edgeEffect = this.r;
        EdgeEffect edgeEffect2 = this.q;
        if (i10 < 0) {
            if (z4) {
                iv1.N(edgeEffect2, (-i9) / getHeight(), i3 / getWidth());
                if (motionEvent != null) {
                    getScrollFeedbackProvider().a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i2, true);
                }
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i10 > scrollRange && z4) {
            iv1.N(edgeEffect, i9 / getHeight(), 1.0f - (i3 / getWidth()));
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
            if (z3 && i4 == 0 && (velocityTracker = this.y) != null) {
                velocityTracker.clear();
            }
            if (i4 == 1) {
                y(i4);
                edgeEffect2.onRelease();
                edgeEffect.onRelease();
            }
            return i8;
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
        return i8;
    }

    public final boolean u(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float E = iv1.E(edgeEffect) * getHeight();
        float abs = Math.abs(-i) * 0.35f;
        float f = this.m * 0.015f;
        double log = Math.log(abs / f);
        double d = O;
        return ((float) (Math.exp((d / (d - 1.0d)) * log) * ((double) f))) < E;
    }

    public final void v(int i, int i2, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.n > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int max = Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY;
            this.p.startScroll(getScrollX(), scrollY, 0, max, 250);
            if (z) {
                w(2, 1);
            } else {
                y(1);
            }
            this.I = getScrollY();
            postInvalidateOnAnimation();
        } else {
            OverScroller overScroller = this.p;
            if (!overScroller.isFinished()) {
                overScroller.abortAnimation();
                y(1);
            }
            scrollBy(i, i2);
        }
        this.n = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean w(int i, int i2) {
        boolean onStartNestedScroll;
        du duVar = this.L;
        View view = (NestedScrollView) duVar.d;
        if (duVar.c(i2) != null) {
            return true;
        }
        if (duVar.a) {
            View view2 = view;
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                boolean z = parent instanceof qr1;
                if (z) {
                    onStartNestedScroll = ((qr1) parent).f(view2, view, i, i2);
                } else {
                    if (i2 == 0) {
                        try {
                            onStartNestedScroll = parent.onStartNestedScroll(view2, view, i);
                        } catch (AbstractMethodError e) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e);
                        }
                    }
                    onStartNestedScroll = false;
                }
                if (onStartNestedScroll) {
                    if (i2 == 0) {
                        duVar.b = parent;
                    } else if (i2 == 1) {
                        duVar.c = parent;
                    }
                    if (z) {
                        ((qr1) parent).a(view2, view, i, i2);
                        return true;
                    }
                    if (i2 != 0) {
                        return true;
                    }
                    try {
                        parent.onNestedScrollAccepted(view2, view, i);
                        return true;
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e2);
                        return true;
                    }
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
        }
        return false;
    }

    public final boolean x(MotionEvent motionEvent) {
        boolean z;
        EdgeEffect edgeEffect = this.q;
        if (iv1.E(edgeEffect) != 0.0f) {
            iv1.N(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.r;
        if (iv1.E(edgeEffect2) == 0.0f) {
            return z;
        }
        iv1.N(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void y(int i) {
        du duVar = this.L;
        ViewParent c = duVar.c(i);
        if (c != null) {
            NestedScrollView nestedScrollView = (NestedScrollView) duVar.d;
            if (c instanceof qr1) {
                ((qr1) c).b(nestedScrollView, i);
            } else if (i == 0) {
                try {
                    c.onStopNestedScroll(nestedScrollView);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + c + " does not implement interface method onStopNestedScroll", e);
                }
            }
            if (i == 0) {
                duVar.b = null;
            } else {
                if (i != 1) {
                    return;
                }
                duVar.c = null;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
        } else {
            lh.g("ScrollView can host only one direct child");
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
        } else {
            lh.g("ScrollView can host only one direct child");
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
        } else {
            lh.g("ScrollView can host only one direct child");
        }
    }

    public void setOnScrollChangeListener(or1 or1Var) {
    }
}
