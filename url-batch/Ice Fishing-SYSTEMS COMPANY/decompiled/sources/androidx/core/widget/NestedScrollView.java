package androidx.core.widget;

import O.AbstractC0335a0;
import O.AbstractC0337b0;
import O.C;
import O.C0345g;
import O.C0355q;
import O.C0357t;
import O.D;
import O.E;
import O.InterfaceC0356s;
import O.InterfaceC0362y;
import O.L;
import O.X;
import U.e;
import U.h;
import U.i;
import U.j;
import U.k;
import a.AbstractC0415a;
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
import com.anythink.basead.exoplayer.k.p;
import com.anythink.expressad.video.module.a.a;
import com.icefishing.icefishingliveapp.C5284R;
import h4.c;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0356s, InterfaceC0362y {

    /* renamed from: U, reason: collision with root package name */
    public static final float f4813U = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: V, reason: collision with root package name */
    public static final h f4814V = new h(0);

    /* renamed from: W, reason: collision with root package name */
    public static final int[] f4815W = {R.attr.fillViewport};

    /* renamed from: A, reason: collision with root package name */
    public boolean f4816A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f4817B;

    /* renamed from: C, reason: collision with root package name */
    public View f4818C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f4819D;

    /* renamed from: E, reason: collision with root package name */
    public VelocityTracker f4820E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f4821F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f4822G;

    /* renamed from: H, reason: collision with root package name */
    public final int f4823H;

    /* renamed from: I, reason: collision with root package name */
    public final int f4824I;
    public final int J;

    /* renamed from: K, reason: collision with root package name */
    public int f4825K;

    /* renamed from: L, reason: collision with root package name */
    public final int[] f4826L;

    /* renamed from: M, reason: collision with root package name */
    public final int[] f4827M;

    /* renamed from: N, reason: collision with root package name */
    public int f4828N;

    /* renamed from: O, reason: collision with root package name */
    public int f4829O;

    /* renamed from: P, reason: collision with root package name */
    public k f4830P;

    /* renamed from: Q, reason: collision with root package name */
    public final C0357t f4831Q;

    /* renamed from: R, reason: collision with root package name */
    public final C0355q f4832R;

    /* renamed from: S, reason: collision with root package name */
    public float f4833S;

    /* renamed from: T, reason: collision with root package name */
    public final C0345g f4834T;

    /* renamed from: n, reason: collision with root package name */
    public final float f4835n;

    /* renamed from: u, reason: collision with root package name */
    public long f4836u;

    /* renamed from: v, reason: collision with root package name */
    public final Rect f4837v;

    /* renamed from: w, reason: collision with root package name */
    public final OverScroller f4838w;

    /* renamed from: x, reason: collision with root package name */
    public final EdgeEffect f4839x;

    /* renamed from: y, reason: collision with root package name */
    public final EdgeEffect f4840y;

    /* renamed from: z, reason: collision with root package name */
    public int f4841z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C5284R.attr.nestedScrollViewStyle);
        this.f4837v = new Rect();
        this.f4816A = true;
        this.f4817B = false;
        this.f4818C = null;
        this.f4819D = false;
        this.f4822G = true;
        this.f4825K = -1;
        this.f4826L = new int[2];
        this.f4827M = new int[2];
        this.f4834T = new C0345g(getContext(), new c(13, this));
        int i = Build.VERSION.SDK_INT;
        this.f4839x = i >= 31 ? e.a(context, attributeSet) : new EdgeEffect(context);
        this.f4840y = i >= 31 ? e.a(context, attributeSet) : new EdgeEffect(context);
        this.f4835n = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f4838w = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f4823H = viewConfiguration.getScaledTouchSlop();
        this.f4824I = viewConfiguration.getScaledMinimumFlingVelocity();
        this.J = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f4815W, C5284R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f4831Q = new C0357t();
        this.f4832R = new C0355q(this);
        setNestedScrollingEnabled(true);
        X.o(this, f4814V);
    }

    public static boolean l(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && l((View) parent, nestedScrollView);
    }

    @Override // O.r
    public final void a(int i, View view) {
        C0357t c0357t = this.f4831Q;
        if (i == 1) {
            c0357t.f2320b = 0;
        } else {
            c0357t.f2319a = 0;
        }
        w(i);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // O.InterfaceC0356s
    public final void b(View view, int i, int i4, int i9, int i10, int i11, int[] iArr) {
        n(i10, i11, iArr);
    }

    @Override // O.r
    public final void c(View view, int i, int i4, int i9, int i10, int i11) {
        n(i10, i11, null);
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
        int i;
        if (this.f4838w.isFinished()) {
            return;
        }
        this.f4838w.computeScrollOffset();
        int currY = this.f4838w.getCurrY();
        int i4 = currY - this.f4829O;
        int height = getHeight();
        EdgeEffect edgeEffect = this.f4840y;
        EdgeEffect edgeEffect2 = this.f4839x;
        if (i4 <= 0 || AbstractC0415a.s(edgeEffect2) == 0.0f) {
            if (i4 < 0 && AbstractC0415a.s(edgeEffect) != 0.0f) {
                float f6 = height;
                round = Math.round(AbstractC0415a.v(edgeEffect, (i4 * 4.0f) / f6, 0.5f) * (f6 / 4.0f));
                if (round != i4) {
                    edgeEffect.finish();
                }
            }
            int i9 = i4;
            this.f4829O = currY;
            int[] iArr = this.f4827M;
            iArr[1] = 0;
            this.f4832R.c(0, i9, 1, iArr, null);
            i = i9 - iArr[1];
            int scrollRange = getScrollRange();
            if (i != 0) {
                int scrollY = getScrollY();
                p(i, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i10 = i - scrollY2;
                iArr[1] = 0;
                this.f4832R.d(0, scrollY2, 0, i10, this.f4826L, 1, iArr);
                i = i10 - iArr[1];
            }
            if (i != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i < 0) {
                        if (edgeEffect2.isFinished()) {
                            edgeEffect2.onAbsorb((int) this.f4838w.getCurrVelocity());
                        }
                    } else if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) this.f4838w.getCurrVelocity());
                    }
                }
                this.f4838w.abortAnimation();
                w(1);
            }
            if (this.f4838w.isFinished()) {
                postInvalidateOnAnimation();
                return;
            } else {
                w(1);
                return;
            }
        }
        round = Math.round(AbstractC0415a.v(edgeEffect2, ((-i4) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (round != i4) {
            edgeEffect2.finish();
        }
        i4 -= round;
        int i92 = i4;
        this.f4829O = currY;
        int[] iArr2 = this.f4827M;
        iArr2[1] = 0;
        this.f4832R.c(0, i92, 1, iArr2, null);
        i = i92 - iArr2[1];
        int scrollRange2 = getScrollRange();
        if (i != 0) {
        }
        if (i != 0) {
        }
        if (this.f4838w.isFinished()) {
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

    @Override // O.r
    public final boolean d(View view, View view2, int i, int i4) {
        return (i & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || i(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f6, float f9, boolean z8) {
        return this.f4832R.a(f6, f9, z8);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f6, float f9) {
        return this.f4832R.b(f6, f9);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i4, int[] iArr, int[] iArr2) {
        return this.f4832R.c(i, i4, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i4, int i9, int i10, int[] iArr) {
        return this.f4832R.d(i, i4, i9, i10, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f4839x;
        int i4 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (i.a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                i = getPaddingLeft();
            } else {
                i = 0;
            }
            if (i.a(this)) {
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
        EdgeEffect edgeEffect2 = this.f4840y;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getScrollRange(), scrollY) + height2;
        if (i.a(this)) {
            width2 -= getPaddingRight() + getPaddingLeft();
            i4 = getPaddingLeft();
        }
        if (i.a(this)) {
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

    @Override // O.r
    public final void e(View view, View view2, int i, int i4) {
        C0357t c0357t = this.f4831Q;
        if (i4 == 1) {
            c0357t.f2320b = i;
        } else {
            c0357t.f2319a = i;
        }
        this.f4832R.g(2, i4);
    }

    @Override // O.r
    public final void f(View view, int i, int i4, int[] iArr, int i9) {
        this.f4832R.c(i, i4, i9, iArr, null);
    }

    public final boolean g(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m(maxScrollAmount, getHeight(), findNextFocus)) {
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
            s(maxScrollAmount, 0, 1, true);
        } else {
            Rect rect = this.f4837v;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            s(h(rect), 0, 1, true);
            findNextFocus.requestFocus(i);
        }
        if (findFocus != null && findFocus.isFocused() && !m(0, getHeight(), findFocus)) {
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
        C0357t c0357t = this.f4831Q;
        return c0357t.f2320b | c0357t.f2319a;
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
        if (this.f4833S == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f4833S = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f4833S;
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
        int i9 = rect.bottom;
        if (i9 > i4 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i4, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        }
        if (rect.top >= scrollY || i9 >= i4) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i4 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f4832R.f(0);
    }

    public final boolean i(KeyEvent keyEvent) {
        this.f4837v.setEmpty();
        int childCount = getChildCount();
        int i = a.f21889U;
        if (childCount > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 19) {
                        return keyEvent.isAltPressed() ? k(33) : g(33);
                    }
                    if (keyCode == 20) {
                        return keyEvent.isAltPressed() ? k(a.f21889U) : g(a.f21889U);
                    }
                    if (keyCode == 62) {
                        if (keyEvent.isShiftPressed()) {
                            i = 33;
                        }
                        q(i);
                        return false;
                    }
                    if (keyCode == 92) {
                        return k(33);
                    }
                    if (keyCode == 93) {
                        return k(a.f21889U);
                    }
                    if (keyCode == 122) {
                        q(33);
                        return false;
                    }
                    if (keyCode == 123) {
                        q(a.f21889U);
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
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, a.f21889U);
            if (findNextFocus != null && findNextFocus != this && findNextFocus.requestFocus(a.f21889U)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f4832R.f2314d;
    }

    public final void j(int i) {
        if (getChildCount() > 0) {
            this.f4838w.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.f4832R.g(2, 1);
            this.f4829O = getScrollY();
            postInvalidateOnAnimation();
        }
    }

    public final boolean k(int i) {
        int childCount;
        boolean z8 = i == 130;
        int height = getHeight();
        Rect rect = this.f4837v;
        rect.top = 0;
        rect.bottom = height;
        if (z8 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return r(i, rect.top, rect.bottom);
    }

    public final boolean m(int i, int i4, View view) {
        Rect rect = this.f4837v;
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
    public final void measureChildWithMargins(View view, int i, int i4, int i9, int i10) {
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
        this.f4832R.d(0, scrollY2, 0, i - scrollY2, null, i4, iArr);
    }

    public final void o(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f4825K) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f4841z = (int) motionEvent.getY(i);
            this.f4825K = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f4820E;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4817B = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x012b, code lost:
    
        if (r2 >= 0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x00d7, code lost:
    
        if (r2 >= 0) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02c5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f6;
        int i;
        int i4;
        int i9;
        int i10;
        int i11;
        int scaledMaximumFlingVelocity;
        boolean z8;
        VelocityTracker velocityTracker;
        float f9;
        float f10;
        long j9;
        float f11;
        float sqrt;
        int i12;
        float f12;
        VelocityTracker velocityTracker2;
        int i13;
        float f13;
        if (motionEvent.getAction() != 8 || this.f4819D) {
            return false;
        }
        if ((motionEvent.getSource() & 2) == 2) {
            i = 9;
            f6 = motionEvent.getAxisValue(9);
            i4 = (int) motionEvent.getX();
        } else if ((motionEvent.getSource() & 4194304) == 4194304) {
            f6 = motionEvent.getAxisValue(26);
            i4 = getWidth() / 2;
            i = 26;
        } else {
            f6 = 0.0f;
            i = 0;
            i4 = 0;
        }
        if (f6 == 0.0f) {
            return false;
        }
        s(-((int) (getVerticalScrollFactorCompat() * f6)), i4, 1, (motionEvent.getSource() & 8194) == 8194);
        if (i == 0) {
            return true;
        }
        C0345g c0345g = this.f4834T;
        c0345g.getClass();
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        int i14 = c0345g.f2266f;
        int[] iArr = c0345g.f2268h;
        int i15 = 1;
        if (i14 == source && c0345g.f2267g == deviceId && c0345g.f2265e == i) {
            z8 = false;
            i9 = 20;
            i10 = 0;
        } else {
            Context context = c0345g.f2261a;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            i9 = 20;
            int deviceId2 = motionEvent.getDeviceId();
            int source2 = motionEvent.getSource();
            i10 = 0;
            int i16 = Build.VERSION.SDK_INT;
            if (i16 >= 34) {
                Method method = AbstractC0337b0.f2250a;
                i11 = AbstractC0335a0.b(viewConfiguration, deviceId2, i, source2);
            } else {
                Method method2 = AbstractC0337b0.f2250a;
                InputDevice device = InputDevice.getDevice(deviceId2);
                if (device != null && device.getMotionRange(i, source2) != null) {
                    Resources resources = context.getResources();
                    int identifier = (source2 == 4194304 && i == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", com.onesignal.core.internal.backend.impl.a.TURBINE_FEATURES_PLATFORM_ANDROID) : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier == -1) {
                        i11 = viewConfiguration.getScaledMinimumFlingVelocity();
                    } else if (identifier != 0) {
                        i11 = resources.getDimensionPixelSize(identifier);
                    }
                }
                i11 = Integer.MAX_VALUE;
            }
            iArr[0] = i11;
            int deviceId3 = motionEvent.getDeviceId();
            int source3 = motionEvent.getSource();
            if (i16 >= 34) {
                scaledMaximumFlingVelocity = AbstractC0335a0.a(viewConfiguration, deviceId3, i, source3);
            } else {
                InputDevice device2 = InputDevice.getDevice(deviceId3);
                if ((device2 == null || device2.getMotionRange(i, source3) == null) ? false : true) {
                    Resources resources2 = context.getResources();
                    int identifier2 = (source3 == 4194304 && i == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", com.onesignal.core.internal.backend.impl.a.TURBINE_FEATURES_PLATFORM_ANDROID) : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier2 == -1) {
                        scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                    } else if (identifier2 != 0) {
                        scaledMaximumFlingVelocity = resources2.getDimensionPixelSize(identifier2);
                    }
                }
                scaledMaximumFlingVelocity = Integer.MIN_VALUE;
            }
            iArr[1] = scaledMaximumFlingVelocity;
            c0345g.f2266f = source;
            c0345g.f2267g = deviceId;
            c0345g.f2265e = i;
            z8 = true;
        }
        if (iArr[i10] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker3 = c0345g.f2263c;
            if (velocityTracker3 == null) {
                return true;
            }
            velocityTracker3.recycle();
            c0345g.f2263c = null;
            return true;
        }
        if (c0345g.f2263c == null) {
            c0345g.f2263c = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker4 = c0345g.f2263c;
        Map map = D.f2219a;
        velocityTracker4.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            Map map2 = D.f2219a;
            if (!map2.containsKey(velocityTracker4)) {
                map2.put(velocityTracker4, new E());
            }
            E e6 = (E) map2.get(velocityTracker4);
            e6.getClass();
            long eventTime = motionEvent.getEventTime();
            int i17 = e6.f2223d;
            long[] jArr = e6.f2221b;
            if (i17 != 0 && eventTime - jArr[e6.f2224e] > 40) {
                e6.f2223d = i10;
                e6.f2222c = 0.0f;
            }
            int i18 = (e6.f2224e + 1) % 20;
            e6.f2224e = i18;
            int i19 = e6.f2223d;
            if (i19 != i9) {
                e6.f2223d = i19 + 1;
            }
            e6.f2220a[i18] = motionEvent.getAxisValue(26);
            jArr[e6.f2224e] = eventTime;
        }
        float f14 = Float.MAX_VALUE;
        velocityTracker4.computeCurrentVelocity(1000, Float.MAX_VALUE);
        E e9 = (E) D.f2219a.get(velocityTracker4);
        if (e9 != null) {
            int i20 = e9.f2223d;
            if (i20 >= 2) {
                int i21 = e9.f2224e;
                int i22 = ((i21 + 20) - (i20 - 1)) % 20;
                long[] jArr2 = e9.f2221b;
                long j10 = jArr2[i21];
                while (true) {
                    j9 = jArr2[i22];
                    if (j10 - j9 <= 100) {
                        break;
                    }
                    e9.f2223d--;
                    i22 = (i22 + 1) % 20;
                }
                int i23 = e9.f2223d;
                if (i23 >= 2) {
                    float[] fArr = e9.f2220a;
                    if (i23 == 2) {
                        int i24 = (i22 + 1) % 20;
                        if (j9 != jArr2[i24]) {
                            velocityTracker = velocityTracker4;
                            f11 = Float.MAX_VALUE;
                            i12 = 1000;
                            sqrt = fArr[i24] / (r17 - j9);
                        }
                    } else {
                        float f15 = 0.0f;
                        int i25 = 0;
                        int i26 = 0;
                        while (true) {
                            if (i25 >= e9.f2223d - 1) {
                                break;
                            }
                            int i27 = i25 + i22;
                            long j11 = jArr2[i27 % 20];
                            int i28 = (i27 + 1) % 20;
                            if (jArr2[i28] == j11) {
                                velocityTracker2 = velocityTracker4;
                                f12 = f14;
                                i13 = i15;
                            } else {
                                i26++;
                                f12 = f14;
                                velocityTracker2 = velocityTracker4;
                                float sqrt2 = (f15 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f15) * 2.0f));
                                float f16 = fArr[i28] / (jArr2[i28] - j11);
                                float abs = (Math.abs(f16) * (f16 - sqrt2)) + f15;
                                i13 = i15;
                                if (i26 == i13) {
                                    abs *= 0.5f;
                                }
                                f15 = abs;
                            }
                            i25 += i13;
                            f14 = f12;
                            i15 = i13;
                            velocityTracker4 = velocityTracker2;
                        }
                        velocityTracker = velocityTracker4;
                        f11 = f14;
                        sqrt = ((float) Math.sqrt(Math.abs(f15) * 2.0f)) * (f15 < 0.0f ? -1.0f : 1.0f);
                        i12 = 1000;
                    }
                    f13 = sqrt * i12;
                    e9.f2222c = f13;
                    if (f13 >= (-Math.abs(f11))) {
                        e9.f2222c = -Math.abs(f11);
                    } else if (e9.f2222c > Math.abs(f11)) {
                        e9.f2222c = Math.abs(f11);
                    }
                }
            }
            velocityTracker = velocityTracker4;
            f11 = Float.MAX_VALUE;
            i12 = 1000;
            sqrt = 0.0f;
            f13 = sqrt * i12;
            e9.f2222c = f13;
            if (f13 >= (-Math.abs(f11))) {
            }
        } else {
            velocityTracker = velocityTracker4;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            f9 = C.a(velocityTracker, i);
        } else {
            VelocityTracker velocityTracker5 = velocityTracker;
            if (i == 0) {
                f9 = velocityTracker5.getXVelocity();
            } else if (i == 1) {
                f9 = velocityTracker5.getYVelocity();
            } else {
                E e10 = (E) D.f2219a.get(velocityTracker5);
                f9 = (e10 == null || i != 26) ? 0.0f : e10.f2222c;
            }
        }
        NestedScrollView nestedScrollView = (NestedScrollView) c0345g.f2262b.f38233u;
        float f17 = f9 * (-nestedScrollView.getVerticalScrollFactorCompat());
        float signum = Math.signum(f17);
        if (z8 || (signum != Math.signum(c0345g.f2264d) && signum != 0.0f)) {
            nestedScrollView.f4838w.abortAnimation();
        }
        if (Math.abs(f17) < iArr[0]) {
            return true;
        }
        float max = Math.max(-r3, Math.min(f17, iArr[1]));
        if (max == 0.0f) {
            f10 = 0.0f;
        } else {
            nestedScrollView.f4838w.abortAnimation();
            nestedScrollView.j((int) max);
            f10 = max;
        }
        c0345g.f2264d = f10;
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z8 = true;
        if (action == 2 && this.f4819D) {
            return true;
        }
        int i = action & p.f8630b;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i4 = this.f4825K;
                    if (i4 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i4);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i4 + " in onInterceptTouchEvent");
                        } else {
                            int y6 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y6 - this.f4841z) > this.f4823H && (2 & getNestedScrollAxes()) == 0) {
                                this.f4819D = true;
                                this.f4841z = y6;
                                if (this.f4820E == null) {
                                    this.f4820E = VelocityTracker.obtain();
                                }
                                this.f4820E.addMovement(motionEvent);
                                this.f4828N = 0;
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
            this.f4819D = false;
            this.f4825K = -1;
            VelocityTracker velocityTracker = this.f4820E;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f4820E = null;
            }
            if (this.f4838w.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            w(0);
        } else {
            int y8 = (int) motionEvent.getY();
            int x3 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y8 >= childAt.getTop() - scrollY && y8 < childAt.getBottom() - scrollY && x3 >= childAt.getLeft() && x3 < childAt.getRight()) {
                    this.f4841z = y8;
                    this.f4825K = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.f4820E;
                    if (velocityTracker2 == null) {
                        this.f4820E = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f4820E.addMovement(motionEvent);
                    this.f4838w.computeScrollOffset();
                    if (!v(motionEvent) && this.f4838w.isFinished()) {
                        z8 = false;
                    }
                    this.f4819D = z8;
                    this.f4832R.g(2, 0);
                }
            }
            if (!v(motionEvent) && this.f4838w.isFinished()) {
                z8 = false;
            }
            this.f4819D = z8;
            VelocityTracker velocityTracker3 = this.f4820E;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f4820E = null;
            }
        }
        return this.f4819D;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i, int i4, int i9, int i10) {
        int i11;
        super.onLayout(z8, i, i4, i9, i10);
        int i12 = 0;
        this.f4816A = false;
        View view = this.f4818C;
        if (view != null && l(view, this)) {
            View view2 = this.f4818C;
            Rect rect = this.f4837v;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h9 = h(rect);
            if (h9 != 0) {
                scrollBy(0, h9);
            }
        }
        this.f4818C = null;
        if (!this.f4817B) {
            if (this.f4830P != null) {
                scrollTo(getScrollX(), this.f4830P.f3206n);
                this.f4830P = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i11 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i11 = 0;
            }
            int paddingTop = ((i10 - i4) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i11 && scrollY >= 0) {
                i12 = paddingTop + scrollY > i11 ? i11 - paddingTop : scrollY;
            }
            if (i12 != scrollY) {
                scrollTo(getScrollX(), i12);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f4817B = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
        if (this.f4821F && View.MeasureSpec.getMode(i4) != 0 && getChildCount() > 0) {
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
    public final boolean onNestedFling(View view, float f6, float f9, boolean z8) {
        if (z8) {
            return false;
        }
        dispatchNestedFling(0.0f, f9, true);
        j((int) f9);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f6, float f9) {
        return this.f4832R.b(f6, f9);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i4, int[] iArr) {
        this.f4832R.c(i, i4, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i4, int i9, int i10) {
        n(i10, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        e(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i, int i4, boolean z8, boolean z9) {
        super.scrollTo(i, i4);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = a.f21889U;
        } else if (i == 1) {
            i = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (findNextFocus != null && m(0, getHeight(), findNextFocus)) {
            return findNextFocus.requestFocus(i, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof k)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        k kVar = (k) parcelable;
        super.onRestoreInstanceState(kVar.getSuperState());
        this.f4830P = kVar;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        k kVar = new k(super.onSaveInstanceState());
        kVar.f3206n = getScrollY();
        return kVar;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i4, int i9, int i10) {
        super.onScrollChanged(i, i4, i9, i10);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i4, int i9, int i10) {
        super.onSizeChanged(i, i4, i9, i10);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !m(0, i10, findFocus)) {
            return;
        }
        Rect rect = this.f4837v;
        findFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(findFocus, rect);
        int h9 = h(rect);
        if (h9 != 0) {
            if (this.f4822G) {
                u(0, h9, false);
            } else {
                scrollBy(0, h9);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return d(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        a(0, view);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (this.f4820E == null) {
            this.f4820E = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f4828N = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float f6 = 0.0f;
        obtain.offsetLocation(0.0f, this.f4828N);
        C0355q c0355q = this.f4832R;
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f4840y;
            EdgeEffect edgeEffect2 = this.f4839x;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f4820E;
                velocityTracker.computeCurrentVelocity(1000, this.J);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f4825K);
                if (Math.abs(yVelocity) >= this.f4824I) {
                    if (AbstractC0415a.s(edgeEffect2) != 0.0f) {
                        if (t(edgeEffect2, yVelocity)) {
                            edgeEffect2.onAbsorb(yVelocity);
                        } else {
                            j(-yVelocity);
                        }
                    } else if (AbstractC0415a.s(edgeEffect) != 0.0f) {
                        int i = -yVelocity;
                        if (t(edgeEffect, i)) {
                            edgeEffect.onAbsorb(i);
                        } else {
                            j(i);
                        }
                    } else {
                        int i4 = -yVelocity;
                        float f9 = i4;
                        if (!c0355q.b(0.0f, f9)) {
                            dispatchNestedFling(0.0f, f9, true);
                            j(i4);
                        }
                    }
                } else if (this.f4838w.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f4825K = -1;
                this.f4819D = false;
                VelocityTracker velocityTracker2 = this.f4820E;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f4820E = null;
                }
                w(0);
                this.f4839x.onRelease();
                this.f4840y.onRelease();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f4825K);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f4825K + " in onTouchEvent");
                } else {
                    int y6 = (int) motionEvent.getY(findPointerIndex);
                    int i9 = this.f4841z - y6;
                    float x3 = motionEvent.getX(findPointerIndex) / getWidth();
                    float height = i9 / getHeight();
                    if (AbstractC0415a.s(edgeEffect2) != 0.0f) {
                        float f10 = -AbstractC0415a.v(edgeEffect2, -height, x3);
                        if (AbstractC0415a.s(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                        f6 = f10;
                    } else if (AbstractC0415a.s(edgeEffect) != 0.0f) {
                        float v6 = AbstractC0415a.v(edgeEffect, height, 1.0f - x3);
                        if (AbstractC0415a.s(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                        f6 = v6;
                    }
                    int round = Math.round(f6 * getHeight());
                    if (round != 0) {
                        invalidate();
                    }
                    int i10 = i9 - round;
                    if (!this.f4819D && Math.abs(i10) > this.f4823H) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f4819D = true;
                        i10 = i10 > 0 ? i10 - this.f4823H : i10 + this.f4823H;
                    }
                    if (this.f4819D) {
                        int s3 = s(i10, (int) motionEvent.getX(findPointerIndex), 0, false);
                        this.f4841z = y6 - s3;
                        this.f4828N += s3;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f4819D && getChildCount() > 0 && this.f4838w.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f4825K = -1;
                this.f4819D = false;
                VelocityTracker velocityTracker3 = this.f4820E;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f4820E = null;
                }
                w(0);
                this.f4839x.onRelease();
                this.f4840y.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f4841z = (int) motionEvent.getY(actionIndex);
                this.f4825K = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                o(motionEvent);
                this.f4841z = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f4825K));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f4819D && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f4838w.isFinished()) {
                this.f4838w.abortAnimation();
                w(1);
            }
            int y8 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f4841z = y8;
            this.f4825K = pointerId;
            c0355q.g(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f4820E;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public final boolean p(int i, int i4, int i9, int i10) {
        int i11;
        boolean z8;
        int i12;
        boolean z9;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i13 = i9 + i;
        if (i4 <= 0 && i4 >= 0) {
            i11 = i4;
            z8 = false;
        } else {
            i11 = 0;
            z8 = true;
        }
        if (i13 > i10) {
            i12 = i10;
        } else {
            if (i13 >= 0) {
                i12 = i13;
                z9 = false;
                if (z9 && !this.f4832R.f(1)) {
                    this.f4838w.springBack(i11, i12, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i11, i12);
                return !z8 || z9;
            }
            i12 = 0;
        }
        z9 = true;
        if (z9) {
            this.f4838w.springBack(i11, i12, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i11, i12);
        if (z8) {
        }
    }

    public final void q(int i) {
        boolean z8 = i == 130;
        int height = getHeight();
        Rect rect = this.f4837v;
        if (z8) {
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
        int i9 = height + i4;
        rect.bottom = i9;
        r(i, i4, i9);
    }

    public final boolean r(int i, int i4, int i9) {
        boolean z8;
        int height = getHeight();
        int scrollY = getScrollY();
        int i10 = height + scrollY;
        boolean z9 = i == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z10 = false;
        for (int i11 = 0; i11 < size; i11++) {
            View view2 = focusables.get(i11);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i4 < bottom && top < i9) {
                boolean z11 = i4 < top && bottom < i9;
                if (view == null) {
                    view = view2;
                    z10 = z11;
                } else {
                    boolean z12 = (z9 && top < view.getTop()) || (!z9 && bottom > view.getBottom());
                    if (z10) {
                        if (z11) {
                            if (!z12) {
                            }
                            view = view2;
                        }
                    } else if (z11) {
                        view = view2;
                        z10 = true;
                    } else {
                        if (!z12) {
                        }
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i4 < scrollY || i9 > i10) {
            s(z9 ? i4 - scrollY : i9 - i10, 0, 1, true);
            z8 = true;
        } else {
            z8 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i);
        }
        return z8;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f4816A) {
            this.f4818C = view2;
        } else {
            Rect rect = this.f4837v;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h9 = h(rect);
            if (h9 != 0) {
                scrollBy(0, h9);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z8) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int h9 = h(rect);
        boolean z9 = h9 != 0;
        if (z9) {
            if (z8) {
                scrollBy(0, h9);
                return z9;
            }
            u(0, h9, false);
        }
        return z9;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z8) {
        VelocityTracker velocityTracker;
        if (z8 && (velocityTracker = this.f4820E) != null) {
            velocityTracker.recycle();
            this.f4820E = null;
        }
        super.requestDisallowInterceptTouchEvent(z8);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f4816A = true;
        super.requestLayout();
    }

    public final int s(int i, int i4, int i9, boolean z8) {
        int i10;
        int i11;
        boolean z9;
        VelocityTracker velocityTracker;
        C0355q c0355q = this.f4832R;
        if (i9 == 1) {
            c0355q.g(2, i9);
        }
        boolean c4 = this.f4832R.c(0, i, i9, this.f4827M, this.f4826L);
        int[] iArr = this.f4827M;
        int[] iArr2 = this.f4826L;
        if (c4) {
            i10 = i - iArr[1];
            i11 = iArr2[1];
        } else {
            i10 = i;
            i11 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z10 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z8;
        boolean z11 = p(i10, 0, scrollY, scrollRange) && !c0355q.f(i9);
        int scrollY2 = getScrollY() - scrollY;
        iArr[1] = 0;
        this.f4832R.d(0, scrollY2, 0, i10 - scrollY2, this.f4826L, i9, iArr);
        int i12 = i11 + iArr2[1];
        int i13 = i10 - iArr[1];
        int i14 = scrollY + i13;
        EdgeEffect edgeEffect = this.f4840y;
        EdgeEffect edgeEffect2 = this.f4839x;
        if (i14 < 0) {
            if (z10) {
                AbstractC0415a.v(edgeEffect2, (-i13) / getHeight(), i4 / getWidth());
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i14 > scrollRange && z10) {
            AbstractC0415a.v(edgeEffect, i13 / getHeight(), 1.0f - (i4 / getWidth()));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (edgeEffect2.isFinished() && edgeEffect.isFinished()) {
            z9 = z11;
        } else {
            postInvalidateOnAnimation();
            z9 = false;
        }
        if (z9 && i9 == 0 && (velocityTracker = this.f4820E) != null) {
            velocityTracker.clear();
        }
        if (i9 == 1) {
            w(i9);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i12;
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

    public void setFillViewport(boolean z8) {
        if (z8 != this.f4821F) {
            this.f4821F = z8;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z8) {
        C0355q c0355q = this.f4832R;
        if (c0355q.f2314d) {
            WeakHashMap weakHashMap = X.f2240a;
            L.z(c0355q.f2313c);
        }
        c0355q.f2314d = z8;
    }

    public void setSmoothScrollingEnabled(boolean z8) {
        this.f4822G = z8;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.f4832R.g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        w(0);
    }

    public final boolean t(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float s3 = AbstractC0415a.s(edgeEffect) * getHeight();
        float abs = Math.abs(-i) * 0.35f;
        float f6 = this.f4835n * 0.015f;
        double log = Math.log(abs / f6);
        double d2 = f4813U;
        return ((float) (Math.exp((d2 / (d2 - 1.0d)) * log) * ((double) f6))) < s3;
    }

    public final void u(int i, int i4, boolean z8) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f4836u > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f4838w.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i4 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            if (z8) {
                this.f4832R.g(2, 1);
            } else {
                w(1);
            }
            this.f4829O = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f4838w.isFinished()) {
                this.f4838w.abortAnimation();
                w(1);
            }
            scrollBy(i, i4);
        }
        this.f4836u = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean v(MotionEvent motionEvent) {
        boolean z8;
        EdgeEffect edgeEffect = this.f4839x;
        if (AbstractC0415a.s(edgeEffect) != 0.0f) {
            AbstractC0415a.v(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z8 = true;
        } else {
            z8 = false;
        }
        EdgeEffect edgeEffect2 = this.f4840y;
        if (AbstractC0415a.s(edgeEffect2) == 0.0f) {
            return z8;
        }
        AbstractC0415a.v(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void w(int i) {
        this.f4832R.h(i);
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

    public void setOnScrollChangeListener(j jVar) {
    }
}
