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
import com.google.android.gms.internal.measurement.md;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import kotlin.collections.i0;
import o3.c;
import o3.c0;
import o3.d0;
import o3.h;
import o3.n;
import o3.q;
import o3.r;
import o3.s;
import t3.b;
import t3.d;
import t3.e;
import t3.f;
import t3.g;
import z4.w;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements h {
    public static final float Q = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final d R = new d();
    public static final int[] S = {R.attr.fillViewport};
    public VelocityTracker A;
    public boolean B;
    public boolean C;
    public final int D;
    public final int E;
    public final int F;
    public int G;
    public final int[] H;
    public final int[] I;
    public int J;
    public int K;
    public g L;
    public final md M;
    public final b7.h N;
    public float O;
    public final c P;

    /* renamed from: d, reason: collision with root package name */
    public final float f485d;

    /* renamed from: e, reason: collision with root package name */
    public long f486e;

    /* renamed from: i, reason: collision with root package name */
    public final Rect f487i;

    /* renamed from: r, reason: collision with root package name */
    public final OverScroller f488r;

    /* renamed from: s, reason: collision with root package name */
    public final EdgeEffect f489s;

    /* renamed from: t, reason: collision with root package name */
    public final EdgeEffect f490t;

    /* renamed from: u, reason: collision with root package name */
    public n f491u;

    /* renamed from: v, reason: collision with root package name */
    public int f492v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f493w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f494x;

    /* renamed from: y, reason: collision with root package name */
    public View f495y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f496z;

    public NestedScrollView(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.f487i = new Rect();
        this.f493w = true;
        this.f494x = false;
        this.f495y = null;
        this.f496z = false;
        this.C = true;
        this.G = -1;
        this.H = new int[2];
        this.I = new int[2];
        this.P = new c(getContext(), new l.d(27, this));
        int i10 = Build.VERSION.SDK_INT;
        this.f489s = i10 >= 31 ? b.a(context, attributeSet) : new EdgeEffect(context);
        this.f490t = i10 >= 31 ? b.a(context, attributeSet) : new EdgeEffect(context);
        this.f485d = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f488r = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.D = viewConfiguration.getScaledTouchSlop();
        this.E = viewConfiguration.getScaledMinimumFlingVelocity();
        this.F = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, S, i3, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.M = new md();
        b7.h hVar = new b7.h();
        hVar.f1295d = this;
        this.N = hVar;
        setNestedScrollingEnabled(true);
        c0.d(this, R);
    }

    private n getScrollFeedbackProvider() {
        if (this.f491u == null) {
            this.f491u = new n(this);
        }
        return this.f491u;
    }

    public static boolean k(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && k((View) parent, nestedScrollView);
    }

    @Override // o3.g
    public final void a(View view, View view2, int i3, int i10) {
        md mdVar = this.M;
        if (i10 == 1) {
            mdVar.f2540b = i3;
        } else {
            mdVar.f2539a = i3;
        }
        u(2, i10);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
        } else {
            i0.l("ScrollView can host only one direct child");
        }
    }

    public final boolean b(int i3) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View view = findFocus;
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i3);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !l(findNextFocus, maxScrollAmount, getHeight())) {
            if (i3 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i3 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i3 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            r(maxScrollAmount, -1, null, 0, 1, true);
        } else {
            Rect rect = this.f487i;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            r(g(rect), -1, null, 0, 1, true);
            findNextFocus.requestFocus(i3);
        }
        if (view != null && view.isFocused() && !l(view, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // o3.g
    public final void c(View view, int i3) {
        md mdVar = this.M;
        if (i3 == 1) {
            mdVar.f2540b = 0;
        } else {
            mdVar.f2539a = 0;
        }
        w(i3);
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
        int i3;
        if (this.f488r.isFinished()) {
            return;
        }
        this.f488r.computeScrollOffset();
        int currY = this.f488r.getCurrY();
        int i10 = currY - this.K;
        int height = getHeight();
        EdgeEffect edgeEffect = this.f489s;
        EdgeEffect edgeEffect2 = this.f490t;
        if (i10 <= 0 || w.u(edgeEffect) == 0.0f) {
            if (i10 < 0 && w.u(edgeEffect2) != 0.0f) {
                float f3 = height;
                round = Math.round(w.G(edgeEffect2, (i10 * 4.0f) / f3, 0.5f) * (f3 / 4.0f));
                if (round != i10) {
                    edgeEffect2.finish();
                }
            }
            int i11 = i10;
            this.K = currY;
            int[] iArr = this.I;
            iArr[1] = 0;
            this.N.b(0, i11, 1, iArr, null);
            i3 = i11 - iArr[1];
            int scrollRange = getScrollRange();
            if (Build.VERSION.SDK_INT >= 35) {
                e.a(this, Math.abs(this.f488r.getCurrVelocity()));
            }
            if (i3 != 0) {
                int scrollY = getScrollY();
                o(i3, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i12 = i3 - scrollY2;
                iArr[1] = 0;
                this.N.c(0, scrollY2, 0, i12, this.H, 1, iArr);
                i3 = i12 - iArr[1];
            }
            if (i3 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i3 < 0) {
                        if (edgeEffect.isFinished()) {
                            edgeEffect.onAbsorb((int) this.f488r.getCurrVelocity());
                        }
                    } else if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) this.f488r.getCurrVelocity());
                    }
                }
                this.f488r.abortAnimation();
                w(1);
            }
            if (this.f488r.isFinished()) {
                postInvalidateOnAnimation();
                return;
            } else {
                w(1);
                return;
            }
        }
        round = Math.round(w.G(edgeEffect, ((-i10) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (round != i10) {
            edgeEffect.finish();
        }
        i10 -= round;
        int i112 = i10;
        this.K = currY;
        int[] iArr2 = this.I;
        iArr2[1] = 0;
        this.N.b(0, i112, 1, iArr2, null);
        i3 = i112 - iArr2[1];
        int scrollRange2 = getScrollRange();
        if (Build.VERSION.SDK_INT >= 35) {
        }
        if (i3 != 0) {
        }
        if (i3 != 0) {
        }
        if (this.f488r.isFinished()) {
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

    @Override // o3.h
    public final void d(NestedScrollView nestedScrollView, int i3, int i10, int i11, int i12, int i13, int[] iArr) {
        m(i12, i13, iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00cb A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z10;
        if (!super.dispatchKeyEvent(keyEvent)) {
            this.f487i.setEmpty();
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                    if (keyEvent.getAction() == 0) {
                        int keyCode = keyEvent.getKeyCode();
                        if (keyCode == 19) {
                            z10 = keyEvent.isAltPressed() ? j(33) : b(33);
                        } else if (keyCode == 20) {
                            z10 = keyEvent.isAltPressed() ? j(130) : b(130);
                        } else if (keyCode == 62) {
                            p(keyEvent.isShiftPressed() ? 33 : 130);
                        } else if (keyCode == 92) {
                            z10 = j(33);
                        } else if (keyCode == 93) {
                            z10 = j(130);
                        } else if (keyCode == 122) {
                            p(33);
                        } else if (keyCode == 123) {
                            p(130);
                        }
                        if (z10) {
                            return false;
                        }
                    }
                    z10 = false;
                    if (z10) {
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
                    z10 = true;
                    if (z10) {
                    }
                }
            }
            z10 = false;
            if (z10) {
            }
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f3, float f10, boolean z10) {
        ViewParent d10;
        b7.h hVar = this.N;
        if (hVar.f1292a && (d10 = hVar.d(0)) != null) {
            try {
                return d10.onNestedFling((NestedScrollView) hVar.f1295d, f3, f10, z10);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + d10 + " does not implement interface method onNestedFling", e2);
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f3, float f10) {
        ViewParent d10;
        b7.h hVar = this.N;
        if (hVar.f1292a && (d10 = hVar.d(0)) != null) {
            try {
                return d10.onNestedPreFling((NestedScrollView) hVar.f1295d, f3, f10);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + d10 + " does not implement interface method onNestedPreFling", e2);
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i3, int i10, int[] iArr, int[] iArr2) {
        return this.N.b(i3, i10, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i3, int i10, int i11, int i12, int[] iArr) {
        return this.N.c(i3, i10, i11, i12, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i3;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f489s;
        int i10 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                i3 = getPaddingLeft();
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            } else {
                i3 = 0;
            }
            canvas.translate(i3, min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.f490t;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getScrollRange(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingRight() + getPaddingLeft();
            i10 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingBottom() + getPaddingTop();
            max -= getPaddingBottom();
        }
        canvas.translate(i10 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(save2);
    }

    @Override // o3.g
    public final void e(int i3, int i10, int[] iArr, int i11) {
        this.N.b(i3, i10, i11, iArr, null);
    }

    @Override // o3.g
    public final void f(NestedScrollView nestedScrollView, int i3, int i10, int i11, int i12, int i13) {
        m(i12, i13, null);
    }

    public final int g(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i3 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i10 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i3 - verticalFadingEdgeLength : i3;
        int i11 = rect.bottom;
        if (i11 > i10 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i10, (childAt.getBottom() + layoutParams.bottomMargin) - i3);
        }
        if (rect.top >= scrollY || i11 >= i10) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i10 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
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
        md mdVar = this.M;
        return mdVar.f2540b | mdVar.f2539a;
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
        if (this.O == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                i0.l("Expected theme to define listPreferredItemHeight.");
                return 0.0f;
            }
            this.O = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.O;
    }

    public final void h(int i3) {
        if (getChildCount() > 0) {
            this.f488r.fling(getScrollX(), getScrollY(), 0, i3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            u(2, 1);
            this.K = getScrollY();
            postInvalidateOnAnimation();
            if (Build.VERSION.SDK_INT >= 35) {
                e.a(this, Math.abs(this.f488r.getCurrVelocity()));
            }
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.N.d(0) != null;
    }

    @Override // o3.g
    public final boolean i(View view, View view2, int i3, int i10) {
        return (i3 & 2) != 0;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.N.f1292a;
    }

    public final boolean j(int i3) {
        int childCount;
        boolean z10 = i3 == 130;
        int height = getHeight();
        Rect rect = this.f487i;
        rect.top = 0;
        rect.bottom = height;
        if (z10 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return q(i3, rect.top, rect.bottom);
    }

    public final boolean l(View view, int i3, int i10) {
        Rect rect = this.f487i;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i3 >= getScrollY() && rect.top - i3 <= getScrollY() + i10;
    }

    public final void m(int i3, int i10, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i3);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.N.c(0, scrollY2, 0, i3 - scrollY2, null, i10, iArr);
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i3, int i10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i3, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.G) {
            int i3 = actionIndex == 0 ? 1 : 0;
            this.f492v = (int) motionEvent.getY(i3);
            this.G = motionEvent.getPointerId(i3);
            VelocityTracker velocityTracker = this.A;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean o(int i3, int i10, int i11, int i12) {
        int i13;
        boolean z10;
        int i14;
        boolean z11;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i15 = i11 + i3;
        if (i10 <= 0 && i10 >= 0) {
            i13 = i10;
            z10 = false;
        } else {
            i13 = 0;
            z10 = true;
        }
        if (i15 > i12) {
            i14 = i12;
        } else {
            if (i15 >= 0) {
                i14 = i15;
                z11 = false;
                if (z11 && this.N.d(1) == null) {
                    this.f488r.springBack(i13, i14, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i13, i14);
                return !z10 || z11;
            }
            i14 = 0;
        }
        z11 = true;
        if (z11) {
            this.f488r.springBack(i13, i14, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i13, i14);
        if (z10) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f494x = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x0122, code lost:
    
        if (r0 >= 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x00d7, code lost:
    
        if (r7 >= 0) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02a9  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f3;
        int i3;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        NestedScrollView nestedScrollView;
        float f10;
        NestedScrollView nestedScrollView2;
        float f11;
        long j;
        float f12;
        int i14;
        float sqrt;
        int i15;
        NestedScrollView nestedScrollView3;
        float f13;
        if (motionEvent.getAction() != 8 || this.f496z) {
            return false;
        }
        if ((motionEvent.getSource() & 2) == 2) {
            float axisValue = motionEvent.getAxisValue(9);
            i10 = (int) motionEvent.getX();
            i3 = 9;
            f3 = axisValue;
        } else if ((motionEvent.getSource() & 4194304) == 4194304) {
            float axisValue2 = motionEvent.getAxisValue(26);
            i10 = getWidth() / 2;
            f3 = axisValue2;
            i3 = 26;
        } else {
            f3 = 0.0f;
            i3 = 0;
            i10 = 0;
        }
        if (f3 == 0.0f) {
            return false;
        }
        r(-((int) (getVerticalScrollFactorCompat() * f3)), i3, motionEvent, i10, 1, (motionEvent.getSource() & 8194) == 8194);
        if (i3 != 0) {
            c cVar = this.P;
            NestedScrollView nestedScrollView4 = (NestedScrollView) cVar.f7372b.f5643e;
            int[] iArr = cVar.f7377h;
            int source = motionEvent.getSource();
            int deviceId = motionEvent.getDeviceId();
            int i16 = 1;
            if (cVar.f7376f == source && cVar.g == deviceId && cVar.f7375e == i3) {
                z10 = false;
                i11 = 0;
            } else {
                Context context = cVar.f7371a;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int deviceId2 = motionEvent.getDeviceId();
                i11 = 0;
                int source2 = motionEvent.getSource();
                int i17 = Build.VERSION.SDK_INT;
                if (i17 >= 34) {
                    Method method = d0.f7385a;
                    i12 = q.f(viewConfiguration, deviceId2, i3, source2);
                } else {
                    Method method2 = d0.f7385a;
                    InputDevice device = InputDevice.getDevice(deviceId2);
                    if (device != null && device.getMotionRange(i3, source2) != null) {
                        Resources resources = context.getResources();
                        int identifier = (source2 == 4194304 && i3 == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                        Objects.requireNonNull(viewConfiguration);
                        if (identifier == -1) {
                            i12 = viewConfiguration.getScaledMinimumFlingVelocity();
                        } else if (identifier != 0) {
                            i12 = resources.getDimensionPixelSize(identifier);
                        }
                    }
                    i12 = Integer.MAX_VALUE;
                }
                iArr[0] = i12;
                int deviceId3 = motionEvent.getDeviceId();
                int source3 = motionEvent.getSource();
                if (i17 >= 34) {
                    i13 = q.e(viewConfiguration, deviceId3, i3, source3);
                } else {
                    InputDevice device2 = InputDevice.getDevice(deviceId3);
                    if (device2 != null && device2.getMotionRange(i3, source3) != null) {
                        Resources resources2 = context.getResources();
                        int identifier2 = (source3 == 4194304 && i3 == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                        Objects.requireNonNull(viewConfiguration);
                        if (identifier2 == -1) {
                            i13 = viewConfiguration.getScaledMaximumFlingVelocity();
                        } else if (identifier2 != 0) {
                            i13 = resources2.getDimensionPixelSize(identifier2);
                        }
                    }
                    i13 = Integer.MIN_VALUE;
                }
                iArr[1] = i13;
                cVar.f7376f = source;
                cVar.g = deviceId;
                cVar.f7375e = i3;
                z10 = true;
            }
            int i18 = iArr[i11];
            VelocityTracker velocityTracker = cVar.f7373c;
            if (i18 == Integer.MAX_VALUE) {
                if (velocityTracker == null) {
                    return true;
                }
                velocityTracker.recycle();
                cVar.f7373c = null;
                return true;
            }
            if (velocityTracker == null) {
                cVar.f7373c = VelocityTracker.obtain();
            }
            VelocityTracker velocityTracker2 = cVar.f7373c;
            Map map = r.f7436a;
            velocityTracker2.addMovement(motionEvent);
            int i19 = 20;
            if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
                Map map2 = r.f7436a;
                if (!map2.containsKey(velocityTracker2)) {
                    map2.put(velocityTracker2, new s());
                }
                s sVar = (s) map2.get(velocityTracker2);
                long[] jArr = sVar.f7442b;
                long eventTime = motionEvent.getEventTime();
                if (sVar.f7444d != 0 && eventTime - jArr[sVar.f7445e] > 40) {
                    sVar.f7444d = i11;
                    sVar.f7443c = 0.0f;
                }
                int i20 = (sVar.f7445e + 1) % 20;
                sVar.f7445e = i20;
                int i21 = sVar.f7444d;
                if (i21 != 20) {
                    sVar.f7444d = i21 + 1;
                }
                sVar.f7441a[i20] = motionEvent.getAxisValue(26);
                jArr[sVar.f7445e] = eventTime;
            }
            float f14 = Float.MAX_VALUE;
            velocityTracker2.computeCurrentVelocity(1000, Float.MAX_VALUE);
            s sVar2 = (s) r.f7436a.get(velocityTracker2);
            if (sVar2 != null) {
                float[] fArr = sVar2.f7441a;
                long[] jArr2 = sVar2.f7442b;
                int i22 = sVar2.f7444d;
                if (i22 < 2) {
                    nestedScrollView = nestedScrollView4;
                    f12 = Float.MAX_VALUE;
                } else {
                    int i23 = sVar2.f7445e;
                    int i24 = ((i23 + 20) - (i22 - 1)) % 20;
                    long j3 = jArr2[i23];
                    while (true) {
                        j = jArr2[i24];
                        long j10 = j3 - j;
                        f12 = f14;
                        i14 = sVar2.f7444d;
                        if (j10 <= 100) {
                            break;
                        }
                        sVar2.f7444d = i14 - 1;
                        i24 = (i24 + 1) % 20;
                        f14 = f12;
                    }
                    if (i14 >= 2) {
                        if (i14 == 2) {
                            int i25 = (i24 + 1) % 20;
                            if (j != jArr2[i25]) {
                                nestedScrollView = nestedScrollView4;
                                i15 = 1000;
                                sqrt = fArr[i25] / (r12 - j);
                            }
                        } else {
                            float f15 = 0.0f;
                            int i26 = 0;
                            int i27 = 0;
                            while (true) {
                                if (i26 >= sVar2.f7444d - 1) {
                                    break;
                                }
                                int i28 = i26 + i24;
                                long j11 = jArr2[i28 % 20];
                                int i29 = (i28 + 1) % i19;
                                if (jArr2[i29] == j11) {
                                    nestedScrollView3 = nestedScrollView4;
                                } else {
                                    i27++;
                                    nestedScrollView3 = nestedScrollView4;
                                    float sqrt2 = (f15 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f15) * 2.0f));
                                    float f16 = fArr[i29] / (jArr2[i29] - j11);
                                    float abs = (Math.abs(f16) * (f16 - sqrt2)) + f15;
                                    if (i27 == i16) {
                                        abs *= 0.5f;
                                    }
                                    f15 = abs;
                                }
                                i26++;
                                nestedScrollView4 = nestedScrollView3;
                                i19 = 20;
                                i16 = 1;
                            }
                            nestedScrollView = nestedScrollView4;
                            sqrt = ((float) Math.sqrt(Math.abs(f15) * 2.0f)) * (f15 < 0.0f ? -1.0f : 1.0f);
                            i15 = 1000;
                        }
                        f13 = sqrt * i15;
                        sVar2.f7443c = f13;
                        if (f13 >= (-Math.abs(f12))) {
                            sVar2.f7443c = -Math.abs(f12);
                        } else if (sVar2.f7443c > Math.abs(f12)) {
                            sVar2.f7443c = Math.abs(f12);
                        }
                    }
                    nestedScrollView = nestedScrollView4;
                }
                i15 = 1000;
                sqrt = 0.0f;
                f13 = sqrt * i15;
                sVar2.f7443c = f13;
                if (f13 >= (-Math.abs(f12))) {
                }
            } else {
                nestedScrollView = nestedScrollView4;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                f10 = q.b(velocityTracker2, i3);
            } else if (i3 == 0) {
                f10 = velocityTracker2.getXVelocity();
            } else if (i3 == 1) {
                f10 = velocityTracker2.getYVelocity();
            } else {
                s sVar3 = (s) r.f7436a.get(velocityTracker2);
                f10 = (sVar3 == null || i3 != 26) ? 0.0f : sVar3.f7443c;
            }
            float f17 = f10 * (-nestedScrollView.getVerticalScrollFactorCompat());
            float signum = Math.signum(f17);
            if (z10 || !(signum == Math.signum(cVar.f7374d) || signum == 0.0f)) {
                nestedScrollView2 = nestedScrollView;
                nestedScrollView2.f488r.abortAnimation();
            } else {
                nestedScrollView2 = nestedScrollView;
            }
            if (Math.abs(f17) >= iArr[0]) {
                float max = Math.max(-r2, Math.min(f17, iArr[1]));
                if (max == 0.0f) {
                    f11 = 0.0f;
                } else {
                    nestedScrollView2.f488r.abortAnimation();
                    nestedScrollView2.h((int) max);
                    f11 = max;
                }
                cVar.f7374d = f11;
                return true;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z10 = true;
        if (action == 2 && this.f496z) {
            return true;
        }
        int i3 = action & 255;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    int i10 = this.G;
                    if (i10 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i10);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i10 + " in onInterceptTouchEvent");
                        } else {
                            int y3 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y3 - this.f492v) > this.D && (2 & getNestedScrollAxes()) == 0) {
                                this.f496z = true;
                                this.f492v = y3;
                                if (this.A == null) {
                                    this.A = VelocityTracker.obtain();
                                }
                                this.A.addMovement(motionEvent);
                                this.J = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i3 != 3) {
                    if (i3 == 6) {
                        n(motionEvent);
                    }
                }
            }
            this.f496z = false;
            this.G = -1;
            VelocityTracker velocityTracker = this.A;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.A = null;
            }
            if (this.f488r.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            w(0);
        } else {
            int y10 = (int) motionEvent.getY();
            int x10 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y10 >= childAt.getTop() - scrollY && y10 < childAt.getBottom() - scrollY && x10 >= childAt.getLeft() && x10 < childAt.getRight()) {
                    this.f492v = y10;
                    this.G = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.A;
                    if (velocityTracker2 == null) {
                        this.A = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.A.addMovement(motionEvent);
                    this.f488r.computeScrollOffset();
                    if (!v(motionEvent) && this.f488r.isFinished()) {
                        z10 = false;
                    }
                    this.f496z = z10;
                    u(2, 0);
                }
            }
            if (!v(motionEvent) && this.f488r.isFinished()) {
                z10 = false;
            }
            this.f496z = z10;
            VelocityTracker velocityTracker3 = this.A;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.A = null;
            }
        }
        return this.f496z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z10, i3, i10, i11, i12);
        int i14 = 0;
        this.f493w = false;
        View view = this.f495y;
        if (view != null && k(view, this)) {
            View view2 = this.f495y;
            Rect rect = this.f487i;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int g = g(rect);
            if (g != 0) {
                scrollBy(0, g);
            }
        }
        this.f495y = null;
        if (!this.f494x) {
            if (this.L != null) {
                scrollTo(getScrollX(), this.L.f9273d);
                this.L = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i13 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i13 = 0;
            }
            int paddingTop = ((i12 - i10) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i13 && scrollY >= 0) {
                i14 = paddingTop + scrollY > i13 ? i13 - paddingTop : scrollY;
            }
            if (i14 != scrollY) {
                scrollTo(getScrollX(), i14);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f494x = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        if (this.B && View.MeasureSpec.getMode(i10) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f3, float f10, boolean z10) {
        if (z10) {
            return false;
        }
        dispatchNestedFling(0.0f, f10, true);
        h((int) f10);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f3, float f10) {
        return dispatchNestedPreFling(f3, f10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i3, int i10, int[] iArr) {
        this.N.b(i3, i10, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i3, int i10, int i11, int i12) {
        m(i12, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i3) {
        a(view, view2, i3, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i3, int i10, boolean z10, boolean z11) {
        super.scrollTo(i3, i10);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i3, Rect rect) {
        if (i3 == 2) {
            i3 = 130;
        } else if (i3 == 1) {
            i3 = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i3) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i3);
        if (findNextFocus != null && l(findNextFocus, 0, getHeight())) {
            return findNextFocus.requestFocus(i3, rect);
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
        this.L = gVar;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        gVar.f9273d = getScrollY();
        return gVar;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i3, int i10, int i11, int i12) {
        super.onScrollChanged(i3, i10, i11, i12);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !l(findFocus, 0, i12)) {
            return;
        }
        Rect rect = this.f487i;
        findFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(findFocus, rect);
        int g = g(rect);
        if (g != 0) {
            if (this.C) {
                t(0, g, false);
            } else {
                scrollBy(0, g);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i3) {
        return i(view, view2, i3, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        c(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0143  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        float G;
        int round;
        int i3;
        ViewParent parent2;
        if (this.A == null) {
            this.A = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.J = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float f3 = 0.0f;
        obtain.offsetLocation(0.0f, this.J);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f489s;
            EdgeEffect edgeEffect2 = this.f490t;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.A;
                velocityTracker.computeCurrentVelocity(1000, this.F);
                int yVelocity = (int) velocityTracker.getYVelocity(this.G);
                if (Math.abs(yVelocity) >= this.E) {
                    if (w.u(edgeEffect) != 0.0f) {
                        if (s(edgeEffect, yVelocity)) {
                            edgeEffect.onAbsorb(yVelocity);
                        } else {
                            h(-yVelocity);
                        }
                    } else if (w.u(edgeEffect2) != 0.0f) {
                        int i10 = -yVelocity;
                        if (s(edgeEffect2, i10)) {
                            edgeEffect2.onAbsorb(i10);
                        } else {
                            h(i10);
                        }
                    } else {
                        int i11 = -yVelocity;
                        float f10 = i11;
                        if (!dispatchNestedPreFling(0.0f, f10)) {
                            dispatchNestedFling(0.0f, f10, true);
                            h(i11);
                        }
                    }
                } else if (this.f488r.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.G = -1;
                this.f496z = false;
                VelocityTracker velocityTracker2 = this.A;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.A = null;
                }
                w(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.G);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.G + " in onTouchEvent");
                } else {
                    int y3 = (int) motionEvent.getY(findPointerIndex);
                    int i12 = this.f492v - y3;
                    float x10 = motionEvent.getX(findPointerIndex) / getWidth();
                    float height = i12 / getHeight();
                    if (w.u(edgeEffect) != 0.0f) {
                        G = -w.G(edgeEffect, -height, x10);
                        if (w.u(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                    } else {
                        if (w.u(edgeEffect2) != 0.0f) {
                            G = w.G(edgeEffect2, height, 1.0f - x10);
                            if (w.u(edgeEffect2) == 0.0f) {
                                edgeEffect2.onRelease();
                            }
                        }
                        round = Math.round(f3 * getHeight());
                        if (round != 0) {
                            invalidate();
                        }
                        i3 = i12 - round;
                        if (!this.f496z && Math.abs(i3) > this.D) {
                            parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.f496z = true;
                            int i13 = this.D;
                            i3 = i3 <= 0 ? i3 - i13 : i3 + i13;
                        }
                        if (this.f496z) {
                            int r9 = r(i3, 1, motionEvent, (int) motionEvent.getX(findPointerIndex), 0, false);
                            this.f492v = y3 - r9;
                            this.J += r9;
                        }
                    }
                    f3 = G;
                    round = Math.round(f3 * getHeight());
                    if (round != 0) {
                    }
                    i3 = i12 - round;
                    if (!this.f496z) {
                        parent2 = getParent();
                        if (parent2 != null) {
                        }
                        this.f496z = true;
                        int i132 = this.D;
                        if (i3 <= 0) {
                        }
                    }
                    if (this.f496z) {
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f496z && getChildCount() > 0) {
                    if (this.f488r.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        postInvalidateOnAnimation();
                    }
                }
                this.G = -1;
                this.f496z = false;
                VelocityTracker velocityTracker3 = this.A;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.A = null;
                }
                w(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f492v = (int) motionEvent.getY(actionIndex);
                this.G = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                n(motionEvent);
                this.f492v = (int) motionEvent.getY(motionEvent.findPointerIndex(this.G));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f496z && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f488r.isFinished()) {
                this.f488r.abortAnimation();
                w(1);
            }
            int y10 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f492v = y10;
            this.G = pointerId;
            u(2, 0);
        }
        VelocityTracker velocityTracker4 = this.A;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public final void p(int i3) {
        boolean z10 = i3 == 130;
        int height = getHeight();
        Rect rect = this.f487i;
        if (z10) {
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
        int i10 = rect.top;
        int i11 = height + i10;
        rect.bottom = i11;
        q(i3, i10, i11);
    }

    public final boolean q(int i3, int i10, int i11) {
        boolean z10;
        int height = getHeight();
        int scrollY = getScrollY();
        int i12 = height + scrollY;
        boolean z11 = i3 == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z12 = false;
        for (int i13 = 0; i13 < size; i13++) {
            View view2 = focusables.get(i13);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i10 < bottom && top < i11) {
                boolean z13 = i10 < top && bottom < i11;
                if (view == null) {
                    view = view2;
                    z12 = z13;
                } else {
                    boolean z14 = (z11 && top < view.getTop()) || (!z11 && bottom > view.getBottom());
                    if (z12) {
                        if (z13) {
                            if (!z14) {
                            }
                            view = view2;
                        }
                    } else if (z13) {
                        view = view2;
                        z12 = true;
                    } else {
                        if (!z14) {
                        }
                        view = view2;
                    }
                }
            }
        }
        View view3 = view == null ? this : view;
        if (i10 < scrollY || i11 > i12) {
            r(z11 ? i10 - scrollY : i11 - i12, -1, null, 0, 1, true);
            z10 = true;
        } else {
            z10 = false;
        }
        if (view3 != findFocus()) {
            view3.requestFocus(i3);
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int r(int i3, int i10, MotionEvent motionEvent, int i11, int i12, boolean z10) {
        int i13;
        int i14;
        boolean z11;
        boolean z12;
        VelocityTracker velocityTracker;
        if (i12 == 1) {
            u(2, i12);
        }
        boolean b10 = this.N.b(0, i3, i12, this.I, this.H);
        int[] iArr = this.H;
        int[] iArr2 = this.I;
        if (b10) {
            i13 = i3 - iArr2[1];
            i14 = iArr[1];
        } else {
            i13 = i3;
            i14 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z13 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z10;
        boolean z14 = o(i13, 0, scrollY, scrollRange) && this.N.d(i12) == null;
        int scrollY2 = getScrollY() - scrollY;
        if (motionEvent != null && scrollY2 != 0) {
            getScrollFeedbackProvider().f7423a.onScrollProgress(motionEvent.getDeviceId(), motionEvent.getSource(), i10, scrollY2);
        }
        iArr2[1] = 0;
        this.N.c(0, scrollY2, 0, i13 - scrollY2, this.H, i12, iArr2);
        int i15 = i14 + iArr[1];
        int i16 = i13 - iArr2[1];
        int i17 = scrollY + i16;
        EdgeEffect edgeEffect = this.f490t;
        EdgeEffect edgeEffect2 = this.f489s;
        if (i17 < 0) {
            if (z13) {
                w.G(edgeEffect2, (-i16) / getHeight(), i11 / getWidth());
                if (motionEvent != null) {
                    getScrollFeedbackProvider().f7423a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i10, true);
                }
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i17 > scrollRange && z13) {
            w.G(edgeEffect, i16 / getHeight(), 1.0f - (i11 / getWidth()));
            if (motionEvent != null) {
                z11 = false;
                getScrollFeedbackProvider().f7423a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i10, false);
            } else {
                z11 = false;
            }
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
            if (edgeEffect2.isFinished() || !edgeEffect.isFinished()) {
                postInvalidateOnAnimation();
                z12 = z11;
            } else {
                z12 = z14;
            }
            if (z12 && i12 == 0 && (velocityTracker = this.A) != null) {
                velocityTracker.clear();
            }
            if (i12 == 1) {
                w(i12);
                edgeEffect2.onRelease();
                edgeEffect.onRelease();
            }
            return i15;
        }
        z11 = false;
        if (edgeEffect2.isFinished()) {
        }
        postInvalidateOnAnimation();
        z12 = z11;
        if (z12) {
            velocityTracker.clear();
        }
        if (i12 == 1) {
        }
        return i15;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f493w) {
            this.f495y = view2;
        } else {
            Rect rect = this.f487i;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int g = g(rect);
            if (g != 0) {
                scrollBy(0, g);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int g = g(rect);
        boolean z11 = g != 0;
        if (z11) {
            if (z10) {
                scrollBy(0, g);
                return z11;
            }
            t(0, g, false);
        }
        return z11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        VelocityTracker velocityTracker;
        if (z10 && (velocityTracker = this.A) != null) {
            velocityTracker.recycle();
            this.A = null;
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f493w = true;
        super.requestLayout();
    }

    public final boolean s(EdgeEffect edgeEffect, int i3) {
        if (i3 > 0) {
            return true;
        }
        float u2 = w.u(edgeEffect) * getHeight();
        float abs = Math.abs(-i3) * 0.35f;
        float f3 = this.f485d * 0.015f;
        double log = Math.log(abs / f3);
        double d10 = Q;
        return ((float) (Math.exp((d10 / (d10 - 1.0d)) * log) * ((double) f3))) < u2;
    }

    @Override // android.view.View
    public final void scrollTo(int i3, int i10) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i3 < 0) {
                i3 = 0;
            } else if (width + i3 > width2) {
                i3 = width2 - width;
            }
            if (height >= height2 || i10 < 0) {
                i10 = 0;
            } else if (height + i10 > height2) {
                i10 = height2 - height;
            }
            if (i3 == getScrollX() && i10 == getScrollY()) {
                return;
            }
            super.scrollTo(i3, i10);
        }
    }

    public void setFillViewport(boolean z10) {
        if (z10 != this.B) {
            this.B = z10;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        b7.h hVar = this.N;
        if (hVar.f1292a) {
            NestedScrollView nestedScrollView = (NestedScrollView) hVar.f1295d;
            Field field = c0.f7378a;
            nestedScrollView.stopNestedScroll();
        }
        hVar.f1292a = z10;
    }

    public void setSmoothScrollingEnabled(boolean z10) {
        this.C = z10;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i3) {
        return u(i3, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        w(0);
    }

    public final void t(int i3, int i10, boolean z10) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f486e > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int max = Math.max(0, Math.min(i10 + scrollY, Math.max(0, height - height2))) - scrollY;
            this.f488r.startScroll(getScrollX(), scrollY, 0, max, 250);
            if (z10) {
                u(2, 1);
            } else {
                w(1);
            }
            this.K = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f488r.isFinished()) {
                this.f488r.abortAnimation();
                w(1);
            }
            scrollBy(i3, i10);
        }
        this.f486e = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean u(int i3, int i10) {
        boolean onStartNestedScroll;
        b7.h hVar = this.N;
        View view = (NestedScrollView) hVar.f1295d;
        if (hVar.d(i10) != null) {
            return true;
        }
        if (hVar.f1292a) {
            View view2 = view;
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                boolean z10 = parent instanceof o3.g;
                if (z10) {
                    onStartNestedScroll = ((o3.g) parent).i(view2, view, i3, i10);
                } else {
                    if (i10 == 0) {
                        try {
                            onStartNestedScroll = parent.onStartNestedScroll(view2, view, i3);
                        } catch (AbstractMethodError e2) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e2);
                        }
                    }
                    onStartNestedScroll = false;
                }
                if (onStartNestedScroll) {
                    if (i10 == 0) {
                        hVar.f1293b = parent;
                    } else if (i10 == 1) {
                        hVar.f1294c = parent;
                    }
                    if (z10) {
                        ((o3.g) parent).a(view2, view, i3, i10);
                        return true;
                    }
                    if (i10 != 0) {
                        return true;
                    }
                    try {
                        parent.onNestedScrollAccepted(view2, view, i3);
                        return true;
                    } catch (AbstractMethodError e9) {
                        Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e9);
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

    public final boolean v(MotionEvent motionEvent) {
        boolean z10;
        EdgeEffect edgeEffect = this.f489s;
        if (w.u(edgeEffect) != 0.0f) {
            w.G(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z10 = true;
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = this.f490t;
        if (w.u(edgeEffect2) == 0.0f) {
            return z10;
        }
        w.G(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void w(int i3) {
        b7.h hVar = this.N;
        ViewParent d10 = hVar.d(i3);
        if (d10 != null) {
            NestedScrollView nestedScrollView = (NestedScrollView) hVar.f1295d;
            if (d10 instanceof o3.g) {
                ((o3.g) d10).c(nestedScrollView, i3);
            } else if (i3 == 0) {
                try {
                    d10.onStopNestedScroll(nestedScrollView);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + d10 + " does not implement interface method onStopNestedScroll", e2);
                }
            }
            if (i3 == 0) {
                hVar.f1293b = null;
            } else {
                if (i3 != 1) {
                    return;
                }
                hVar.f1294c = null;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i3) {
        if (getChildCount() <= 0) {
            super.addView(view, i3);
        } else {
            i0.l("ScrollView can host only one direct child");
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
        } else {
            i0.l("ScrollView can host only one direct child");
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i3, layoutParams);
        } else {
            i0.l("ScrollView can host only one direct child");
        }
    }

    public void setOnScrollChangeListener(f fVar) {
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.appsflyer.R.attr.nestedScrollViewStyle);
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }
}
