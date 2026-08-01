package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
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
import b4.d;
import b4.l;
import com.google.android.material.datepicker.j;
import g1.v0;
import java.util.ArrayList;
import java.util.WeakHashMap;
import n0.g;
import n0.m;
import n0.o;
import n0.p0;
import n0.v;
import q3.a;
import r0.b;
import r0.e;
import r0.f;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements o {
    public static final float H = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final j I = new j(3);
    public static final int[] J = {R.attr.fillViewport};
    public int A;
    public int B;
    public f C;
    public final v0 D;
    public final m E;
    public float F;
    public final g G;

    /* renamed from: f, reason: collision with root package name */
    public final float f416f;

    /* renamed from: g, reason: collision with root package name */
    public long f417g;
    public final Rect h;
    public final OverScroller i;

    /* renamed from: j, reason: collision with root package name */
    public final EdgeEffect f418j;

    /* renamed from: k, reason: collision with root package name */
    public final EdgeEffect f419k;

    /* renamed from: l, reason: collision with root package name */
    public v f420l;

    /* renamed from: m, reason: collision with root package name */
    public int f421m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f422n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f423o;

    /* renamed from: p, reason: collision with root package name */
    public View f424p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f425q;

    /* renamed from: r, reason: collision with root package name */
    public VelocityTracker f426r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f427s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f428t;

    /* renamed from: u, reason: collision with root package name */
    public final int f429u;

    /* renamed from: v, reason: collision with root package name */
    public final int f430v;

    /* renamed from: w, reason: collision with root package name */
    public final int f431w;

    /* renamed from: x, reason: collision with root package name */
    public int f432x;

    /* renamed from: y, reason: collision with root package name */
    public final int[] f433y;

    /* renamed from: z, reason: collision with root package name */
    public final int[] f434z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.gdmhkmf.belbet.R.attr.nestedScrollViewStyle);
        this.h = new Rect();
        this.f422n = true;
        this.f423o = false;
        this.f424p = null;
        this.f425q = false;
        this.f428t = true;
        this.f432x = -1;
        this.f433y = new int[2];
        this.f434z = new int[2];
        this.G = new g(getContext(), new a(this));
        int i = Build.VERSION.SDK_INT;
        this.f418j = i >= 31 ? b.a(context, attributeSet) : new EdgeEffect(context);
        this.f419k = i >= 31 ? b.a(context, attributeSet) : new EdgeEffect(context);
        this.f416f = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.i = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f429u = viewConfiguration.getScaledTouchSlop();
        this.f430v = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f431w = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, J, com.gdmhkmf.belbet.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.D = new v0();
        this.E = new m(this);
        setNestedScrollingEnabled(true);
        p0.m(this, I);
    }

    private v getScrollFeedbackProvider() {
        if (this.f420l == null) {
            this.f420l = new v(this);
        }
        return this.f420l;
    }

    public static boolean l(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && l((View) parent, nestedScrollView);
    }

    @Override // n0.n
    public final void a(View view, View view2, int i, int i4) {
        v0 v0Var = this.D;
        if (i4 == 1) {
            v0Var.f1809b = i;
        } else {
            v0Var.f1808a = i;
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

    @Override // n0.n
    public final void b(View view, int i) {
        v0 v0Var = this.D;
        if (i == 1) {
            v0Var.f1809b = 0;
        } else {
            v0Var.f1808a = 0;
        }
        w(i);
    }

    @Override // n0.n
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
        EdgeEffect edgeEffect = this.f418j;
        EdgeEffect edgeEffect2 = this.f419k;
        if (i4 <= 0 || d.x(edgeEffect) == 0.0f) {
            if (i4 < 0 && d.x(edgeEffect2) != 0.0f) {
                float f5 = height;
                round = Math.round(d.L(edgeEffect2, (i4 * 4.0f) / f5, 0.5f) * (f5 / 4.0f));
                if (round != i4) {
                    edgeEffect2.finish();
                }
            }
            int i5 = i4;
            this.B = currY;
            int[] iArr = this.f434z;
            iArr[1] = 0;
            this.E.c(0, i5, 1, iArr, null);
            i = i5 - iArr[1];
            int scrollRange = getScrollRange();
            if (Build.VERSION.SDK_INT >= 35) {
                r0.d.a(this, Math.abs(this.i.getCurrVelocity()));
            }
            if (i != 0) {
                int scrollY = getScrollY();
                p(i, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i6 = i - scrollY2;
                iArr[1] = 0;
                this.E.d(0, scrollY2, 0, i6, this.f433y, 1, iArr);
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
        round = Math.round(d.L(edgeEffect, ((-i4) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (round != i4) {
            edgeEffect.finish();
        }
        i4 -= round;
        int i52 = i4;
        this.B = currY;
        int[] iArr2 = this.f434z;
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

    @Override // n0.o
    public final void d(View view, int i, int i4, int i5, int i6, int i7, int[] iArr) {
        n(i6, i7, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || i(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f5, float f6, boolean z4) {
        return this.E.a(f5, f6, z4);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f5, float f6) {
        return this.E.b(f5, f6);
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
        EdgeEffect edgeEffect = this.f418j;
        int i4 = 0;
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
        EdgeEffect edgeEffect2 = this.f419k;
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

    @Override // n0.n
    public final void e(View view, int i, int i4, int i5, int i6, int i7) {
        n(i6, i7, null);
    }

    @Override // n0.n
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
        v0 v0Var = this.D;
        return v0Var.f1809b | v0Var.f1808a;
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
                r0.d.a(this, Math.abs(this.i.getCurrVelocity()));
            }
        }
    }

    public final boolean k(int i) {
        int childCount;
        boolean z4 = i == 130;
        int height = getHeight();
        Rect rect = this.h;
        rect.top = 0;
        rect.bottom = height;
        if (z4 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return r(i, rect.top, rect.bottom);
    }

    public final boolean m(View view, int i, int i4) {
        Rect rect = this.h;
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
        if (motionEvent.getPointerId(actionIndex) == this.f432x) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f421m = (int) motionEvent.getY(i);
            this.f432x = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f426r;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f423o = false;
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i;
        int i4;
        float f5;
        if (motionEvent.getAction() == 8 && !this.f425q) {
            if (l.L(motionEvent, 2)) {
                f5 = motionEvent.getAxisValue(9);
                i = 9;
                i4 = (int) motionEvent.getX();
            } else if (l.L(motionEvent, 4194304)) {
                float axisValue = motionEvent.getAxisValue(26);
                i4 = getWidth() / 2;
                i = 26;
                f5 = axisValue;
            } else {
                i = 0;
                i4 = 0;
                f5 = 0.0f;
            }
            if (f5 != 0.0f) {
                s(-((int) (getVerticalScrollFactorCompat() * f5)), i, motionEvent, i4, 1, l.L(motionEvent, 8194));
                if (i == 0) {
                    return true;
                }
                this.G.a(motionEvent, i);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z4 = true;
        if (action == 2 && this.f425q) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i4 = this.f432x;
                    if (i4 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i4);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i4 + " in onInterceptTouchEvent");
                        } else {
                            int y4 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y4 - this.f421m) > this.f429u && (2 & getNestedScrollAxes()) == 0) {
                                this.f425q = true;
                                this.f421m = y4;
                                if (this.f426r == null) {
                                    this.f426r = VelocityTracker.obtain();
                                }
                                this.f426r.addMovement(motionEvent);
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
            this.f425q = false;
            this.f432x = -1;
            VelocityTracker velocityTracker = this.f426r;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f426r = null;
            }
            if (this.i.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            w(0);
        } else {
            int y5 = (int) motionEvent.getY();
            int x4 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y5 >= childAt.getTop() - scrollY && y5 < childAt.getBottom() - scrollY && x4 >= childAt.getLeft() && x4 < childAt.getRight()) {
                    this.f421m = y5;
                    this.f432x = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.f426r;
                    if (velocityTracker2 == null) {
                        this.f426r = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f426r.addMovement(motionEvent);
                    this.i.computeScrollOffset();
                    if (!v(motionEvent) && this.i.isFinished()) {
                        z4 = false;
                    }
                    this.f425q = z4;
                    this.E.g(2, 0);
                }
            }
            if (!v(motionEvent) && this.i.isFinished()) {
                z4 = false;
            }
            this.f425q = z4;
            VelocityTracker velocityTracker3 = this.f426r;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f426r = null;
            }
        }
        return this.f425q;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i, int i4, int i5, int i6) {
        int i7;
        super.onLayout(z4, i, i4, i5, i6);
        int i8 = 0;
        this.f422n = false;
        View view = this.f424p;
        if (view != null && l(view, this)) {
            View view2 = this.f424p;
            Rect rect = this.h;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h = h(rect);
            if (h != 0) {
                scrollBy(0, h);
            }
        }
        this.f424p = null;
        if (!this.f423o) {
            if (this.C != null) {
                scrollTo(getScrollX(), this.C.f3199f);
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
        this.f423o = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
        if (this.f427s && View.MeasureSpec.getMode(i4) != 0 && getChildCount() > 0) {
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
    public final boolean onNestedFling(View view, float f5, float f6, boolean z4) {
        if (z4) {
            return false;
        }
        dispatchNestedFling(0.0f, f6, true);
        j((int) f6);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f5, float f6) {
        return this.E.b(f5, f6);
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
    public final void onOverScrolled(int i, int i4, boolean z4, boolean z5) {
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
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        this.C = fVar;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        fVar.f3199f = getScrollY();
        return fVar;
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
        Rect rect = this.h;
        findFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(findFocus, rect);
        int h = h(rect);
        if (h != 0) {
            if (this.f428t) {
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
        float L;
        int round;
        int i;
        ViewParent parent2;
        if (this.f426r == null) {
            this.f426r = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.A = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float f5 = 0.0f;
        obtain.offsetLocation(0.0f, this.A);
        m mVar = this.E;
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f418j;
            EdgeEffect edgeEffect2 = this.f419k;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f426r;
                velocityTracker.computeCurrentVelocity(1000, this.f431w);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f432x);
                if (Math.abs(yVelocity) >= this.f430v) {
                    if (d.x(edgeEffect) != 0.0f) {
                        if (t(edgeEffect, yVelocity)) {
                            edgeEffect.onAbsorb(yVelocity);
                        } else {
                            j(-yVelocity);
                        }
                    } else if (d.x(edgeEffect2) != 0.0f) {
                        int i4 = -yVelocity;
                        if (t(edgeEffect2, i4)) {
                            edgeEffect2.onAbsorb(i4);
                        } else {
                            j(i4);
                        }
                    } else {
                        int i5 = -yVelocity;
                        float f6 = i5;
                        if (!mVar.b(0.0f, f6)) {
                            dispatchNestedFling(0.0f, f6, true);
                            j(i5);
                        }
                    }
                } else if (this.i.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f432x = -1;
                this.f425q = false;
                VelocityTracker velocityTracker2 = this.f426r;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f426r = null;
                }
                w(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f432x);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f432x + " in onTouchEvent");
                } else {
                    int y4 = (int) motionEvent.getY(findPointerIndex);
                    int i6 = this.f421m - y4;
                    float x4 = motionEvent.getX(findPointerIndex) / getWidth();
                    float height = i6 / getHeight();
                    if (d.x(edgeEffect) != 0.0f) {
                        L = -d.L(edgeEffect, -height, x4);
                        if (d.x(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                    } else {
                        if (d.x(edgeEffect2) != 0.0f) {
                            L = d.L(edgeEffect2, height, 1.0f - x4);
                            if (d.x(edgeEffect2) == 0.0f) {
                                edgeEffect2.onRelease();
                            }
                        }
                        round = Math.round(f5 * getHeight());
                        if (round != 0) {
                            invalidate();
                        }
                        i = i6 - round;
                        if (!this.f425q && Math.abs(i) > this.f429u) {
                            parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.f425q = true;
                            i = i <= 0 ? i - this.f429u : i + this.f429u;
                        }
                        if (this.f425q) {
                            int s3 = s(i, 1, motionEvent, (int) motionEvent.getX(findPointerIndex), 0, false);
                            this.f421m = y4 - s3;
                            this.A += s3;
                        }
                    }
                    f5 = L;
                    round = Math.round(f5 * getHeight());
                    if (round != 0) {
                    }
                    i = i6 - round;
                    if (!this.f425q) {
                        parent2 = getParent();
                        if (parent2 != null) {
                        }
                        this.f425q = true;
                        if (i <= 0) {
                        }
                    }
                    if (this.f425q) {
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f425q && getChildCount() > 0) {
                    if (this.i.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        postInvalidateOnAnimation();
                    }
                }
                this.f432x = -1;
                this.f425q = false;
                VelocityTracker velocityTracker3 = this.f426r;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f426r = null;
                }
                w(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f421m = (int) motionEvent.getY(actionIndex);
                this.f432x = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                o(motionEvent);
                this.f421m = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f432x));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f425q && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.i.isFinished()) {
                this.i.abortAnimation();
                w(1);
            }
            int y5 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f421m = y5;
            this.f432x = pointerId;
            mVar.g(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f426r;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public final boolean p(int i, int i4, int i5, int i6) {
        int i7;
        boolean z4;
        int i8;
        boolean z5;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i9 = i5 + i;
        if (i4 <= 0 && i4 >= 0) {
            i7 = i4;
            z4 = false;
        } else {
            i7 = 0;
            z4 = true;
        }
        if (i9 > i6) {
            i8 = i6;
        } else {
            if (i9 >= 0) {
                i8 = i9;
                z5 = false;
                if (z5 && !this.E.f(1)) {
                    this.i.springBack(i7, i8, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i7, i8);
                return !z4 || z5;
            }
            i8 = 0;
        }
        z5 = true;
        if (z5) {
            this.i.springBack(i7, i8, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i7, i8);
        if (z4) {
        }
    }

    public final void q(int i) {
        boolean z4 = i == 130;
        int height = getHeight();
        Rect rect = this.h;
        if (z4) {
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
        boolean z4;
        int height = getHeight();
        int scrollY = getScrollY();
        int i6 = height + scrollY;
        boolean z5 = i == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z6 = false;
        for (int i7 = 0; i7 < size; i7++) {
            View view2 = focusables.get(i7);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i4 < bottom && top < i5) {
                boolean z7 = i4 < top && bottom < i5;
                if (view == null) {
                    view = view2;
                    z6 = z7;
                } else {
                    boolean z8 = (z5 && top < view.getTop()) || (!z5 && bottom > view.getBottom());
                    if (z6) {
                        if (z7) {
                            if (!z8) {
                            }
                            view = view2;
                        }
                    } else if (z7) {
                        view = view2;
                        z6 = true;
                    } else {
                        if (!z8) {
                        }
                        view = view2;
                    }
                }
            }
        }
        View view3 = view == null ? this : view;
        if (i4 < scrollY || i5 > i6) {
            s(z5 ? i4 - scrollY : i5 - i6, -1, null, 0, 1, true);
            z4 = true;
        } else {
            z4 = false;
        }
        if (view3 != findFocus()) {
            view3.requestFocus(i);
        }
        return z4;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f422n) {
            this.f424p = view2;
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
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z4) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int h = h(rect);
        boolean z5 = h != 0;
        if (z5) {
            if (z4) {
                scrollBy(0, h);
                return z5;
            }
            u(0, h, false);
        }
        return z5;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        VelocityTracker velocityTracker;
        if (z4 && (velocityTracker = this.f426r) != null) {
            velocityTracker.recycle();
            this.f426r = null;
        }
        super.requestDisallowInterceptTouchEvent(z4);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f422n = true;
        super.requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int s(int i, int i4, MotionEvent motionEvent, int i5, int i6, boolean z4) {
        int i7;
        int i8;
        boolean z5;
        boolean z6;
        VelocityTracker velocityTracker;
        m mVar = this.E;
        if (i6 == 1) {
            mVar.g(2, i6);
        }
        boolean c5 = this.E.c(0, i, i6, this.f434z, this.f433y);
        int[] iArr = this.f433y;
        int[] iArr2 = this.f434z;
        if (c5) {
            i7 = i - iArr2[1];
            i8 = iArr[1];
        } else {
            i7 = i;
            i8 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z7 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z4;
        boolean z8 = p(i7, 0, scrollY, scrollRange) && !mVar.f(i6);
        int scrollY2 = getScrollY() - scrollY;
        if (motionEvent != null && scrollY2 != 0) {
            getScrollFeedbackProvider().f2836a.onScrollProgress(motionEvent.getDeviceId(), motionEvent.getSource(), i4, scrollY2);
        }
        iArr2[1] = 0;
        this.E.d(0, scrollY2, 0, i7 - scrollY2, this.f433y, i6, iArr2);
        int i9 = i8 + iArr[1];
        int i10 = i7 - iArr2[1];
        int i11 = scrollY + i10;
        EdgeEffect edgeEffect = this.f419k;
        EdgeEffect edgeEffect2 = this.f418j;
        if (i11 < 0) {
            if (z7) {
                d.L(edgeEffect2, (-i10) / getHeight(), i5 / getWidth());
                if (motionEvent != null) {
                    getScrollFeedbackProvider().f2836a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i4, true);
                }
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i11 > scrollRange && z7) {
            d.L(edgeEffect, i10 / getHeight(), 1.0f - (i5 / getWidth()));
            if (motionEvent != null) {
                z5 = false;
                getScrollFeedbackProvider().f2836a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i4, false);
            } else {
                z5 = false;
            }
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
            if (edgeEffect2.isFinished() || !edgeEffect.isFinished()) {
                postInvalidateOnAnimation();
                z6 = z5;
            } else {
                z6 = z8;
            }
            if (z6 && i6 == 0 && (velocityTracker = this.f426r) != null) {
                velocityTracker.clear();
            }
            if (i6 == 1) {
                w(i6);
                edgeEffect2.onRelease();
                edgeEffect.onRelease();
            }
            return i9;
        }
        z5 = false;
        if (edgeEffect2.isFinished()) {
        }
        postInvalidateOnAnimation();
        z6 = z5;
        if (z6) {
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

    public void setFillViewport(boolean z4) {
        if (z4 != this.f427s) {
            this.f427s = z4;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z4) {
        m mVar = this.E;
        if (mVar.d) {
            ViewGroup viewGroup = mVar.f2807c;
            WeakHashMap weakHashMap = p0.f2816a;
            viewGroup.stopNestedScroll();
        }
        mVar.d = z4;
    }

    public void setSmoothScrollingEnabled(boolean z4) {
        this.f428t = z4;
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
        float x4 = d.x(edgeEffect) * getHeight();
        float abs = Math.abs(-i) * 0.35f;
        float f5 = this.f416f * 0.015f;
        double log = Math.log(abs / f5);
        double d = H;
        return ((float) (Math.exp((d / (d - 1.0d)) * log) * ((double) f5))) < x4;
    }

    public final void u(int i, int i4, boolean z4) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f417g > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int max = Math.max(0, Math.min(i4 + scrollY, Math.max(0, height - height2))) - scrollY;
            this.i.startScroll(getScrollX(), scrollY, 0, max, 250);
            if (z4) {
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
        this.f417g = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean v(MotionEvent motionEvent) {
        boolean z4;
        EdgeEffect edgeEffect = this.f418j;
        if (d.x(edgeEffect) != 0.0f) {
            d.L(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z4 = true;
        } else {
            z4 = false;
        }
        EdgeEffect edgeEffect2 = this.f419k;
        if (d.x(edgeEffect2) == 0.0f) {
            return z4;
        }
        d.L(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
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

    public void setOnScrollChangeListener(e eVar) {
    }
}
