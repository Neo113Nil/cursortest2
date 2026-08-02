package androidx.core.widget;

import E.A;
import E.AbstractC0021w;
import E.AbstractC0022x;
import E.C0002c;
import E.C0014o;
import E.C0020v;
import E.C0023y;
import E.H;
import E.I;
import E.InterfaceC0016q;
import E.r;
import G.a;
import H.d;
import H.f;
import H.g;
import H.i;
import a.AbstractC0124a;
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
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import kotlin.KotlinVersion;
import t1.h;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0016q {

    /* renamed from: C, reason: collision with root package name */
    public static final float f4518C = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: D, reason: collision with root package name */
    public static final f f4519D = new f();

    /* renamed from: E, reason: collision with root package name */
    public static final int[] f4520E = {R.attr.fillViewport};

    /* renamed from: A, reason: collision with root package name */
    public float f4521A;

    /* renamed from: B, reason: collision with root package name */
    public final C0002c f4522B;

    /* renamed from: a, reason: collision with root package name */
    public final float f4523a;

    /* renamed from: b, reason: collision with root package name */
    public long f4524b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f4525c;

    /* renamed from: d, reason: collision with root package name */
    public final OverScroller f4526d;

    /* renamed from: e, reason: collision with root package name */
    public final EdgeEffect f4527e;

    /* renamed from: f, reason: collision with root package name */
    public final EdgeEffect f4528f;

    /* renamed from: g, reason: collision with root package name */
    public C0020v f4529g;

    /* renamed from: h, reason: collision with root package name */
    public int f4530h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4531i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4532j;

    /* renamed from: k, reason: collision with root package name */
    public View f4533k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4534l;

    /* renamed from: m, reason: collision with root package name */
    public VelocityTracker f4535m;
    public boolean n;
    public boolean o;

    /* renamed from: p, reason: collision with root package name */
    public final int f4536p;

    /* renamed from: q, reason: collision with root package name */
    public final int f4537q;

    /* renamed from: r, reason: collision with root package name */
    public final int f4538r;

    /* renamed from: s, reason: collision with root package name */
    public int f4539s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f4540t;

    /* renamed from: u, reason: collision with root package name */
    public final int[] f4541u;
    public int v;

    /* renamed from: w, reason: collision with root package name */
    public int f4542w;

    /* renamed from: x, reason: collision with root package name */
    public i f4543x;

    /* renamed from: y, reason: collision with root package name */
    public final r f4544y;
    public final C0014o z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.rockchicken.pump.up.road.R.attr.nestedScrollViewStyle);
        this.f4525c = new Rect();
        this.f4531i = true;
        this.f4532j = false;
        this.f4533k = null;
        this.f4534l = false;
        this.o = true;
        this.f4539s = -1;
        this.f4540t = new int[2];
        this.f4541u = new int[2];
        this.f4522B = new C0002c(getContext(), new h(5, this));
        int i4 = Build.VERSION.SDK_INT;
        this.f4527e = i4 >= 31 ? d.a(context, attributeSet) : new EdgeEffect(context);
        this.f4528f = i4 >= 31 ? d.a(context, attributeSet) : new EdgeEffect(context);
        this.f4523a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f4526d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f4536p = viewConfiguration.getScaledTouchSlop();
        this.f4537q = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f4538r = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f4520E, com.rockchicken.pump.up.road.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f4544y = new r();
        this.z = new C0014o(this);
        setNestedScrollingEnabled(true);
        H.a(this, f4519D);
    }

    private C0020v getScrollFeedbackProvider() {
        if (this.f4529g == null) {
            this.f4529g = new C0020v(this);
        }
        return this.f4529g;
    }

    public static boolean k(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && k((View) parent, nestedScrollView);
    }

    @Override // E.InterfaceC0015p
    public final void a(ViewGroup viewGroup, int i4, int i5, int i6, int i7, int i8) {
        m(i7, i8, null);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // E.InterfaceC0016q
    public final void b(ViewGroup viewGroup, int i4, int i5, int i6, int i7, int i8, int[] iArr) {
        m(i7, i8, iArr);
    }

    @Override // E.InterfaceC0015p
    public final void c(int i4, int i5, int i6, int[] iArr) {
        this.z.c(i4, i5, i6, iArr, null);
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
        if (this.f4526d.isFinished()) {
            return;
        }
        this.f4526d.computeScrollOffset();
        int currY = this.f4526d.getCurrY();
        int i5 = currY - this.f4542w;
        int height = getHeight();
        EdgeEffect edgeEffect = this.f4527e;
        EdgeEffect edgeEffect2 = this.f4528f;
        if (i5 <= 0 || AbstractC0124a.z(edgeEffect) == 0.0f) {
            if (i5 < 0 && AbstractC0124a.z(edgeEffect2) != 0.0f) {
                float f4 = height;
                round = Math.round(AbstractC0124a.L(edgeEffect2, (i5 * 4.0f) / f4, 0.5f) * (f4 / 4.0f));
                if (round != i5) {
                    edgeEffect2.finish();
                }
            }
            int i6 = i5;
            this.f4542w = currY;
            int[] iArr = this.f4541u;
            iArr[1] = 0;
            this.z.c(0, i6, 1, iArr, null);
            i4 = i6 - iArr[1];
            int scrollRange = getScrollRange();
            if (Build.VERSION.SDK_INT >= 35) {
                a.a(this, Math.abs(this.f4526d.getCurrVelocity()));
            }
            if (i4 != 0) {
                int scrollY = getScrollY();
                o(i4, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i7 = i4 - scrollY2;
                iArr[1] = 0;
                this.z.d(0, scrollY2, 0, i7, this.f4540t, 1, iArr);
                i4 = i7 - iArr[1];
            }
            if (i4 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i4 < 0) {
                        if (edgeEffect.isFinished()) {
                            edgeEffect.onAbsorb((int) this.f4526d.getCurrVelocity());
                        }
                    } else if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) this.f4526d.getCurrVelocity());
                    }
                }
                this.f4526d.abortAnimation();
                w(1);
            }
            if (this.f4526d.isFinished()) {
                postInvalidateOnAnimation();
                return;
            } else {
                w(1);
                return;
            }
        }
        round = Math.round(AbstractC0124a.L(edgeEffect, ((-i5) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (round != i5) {
            edgeEffect.finish();
        }
        i5 -= round;
        int i62 = i5;
        this.f4542w = currY;
        int[] iArr2 = this.f4541u;
        iArr2[1] = 0;
        this.z.c(0, i62, 1, iArr2, null);
        i4 = i62 - iArr2[1];
        int scrollRange2 = getScrollRange();
        if (Build.VERSION.SDK_INT >= 35) {
        }
        if (i4 != 0) {
        }
        if (i4 != 0) {
        }
        if (this.f4526d.isFinished()) {
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

    @Override // E.InterfaceC0015p
    public final boolean d(View view, View view2, int i4, int i5) {
        return (i4 & 2) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00cb A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z;
        if (!super.dispatchKeyEvent(keyEvent)) {
            this.f4525c.setEmpty();
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                    if (keyEvent.getAction() == 0) {
                        int keyCode = keyEvent.getKeyCode();
                        if (keyCode == 19) {
                            z = keyEvent.isAltPressed() ? j(33) : g(33);
                        } else if (keyCode == 20) {
                            z = keyEvent.isAltPressed() ? j(130) : g(130);
                        } else if (keyCode == 62) {
                            p(keyEvent.isShiftPressed() ? 33 : 130);
                        } else if (keyCode == 92) {
                            z = j(33);
                        } else if (keyCode == 93) {
                            z = j(130);
                        } else if (keyCode == 122) {
                            p(33);
                        } else if (keyCode == 123) {
                            p(130);
                        }
                        if (z) {
                            return false;
                        }
                    }
                    z = false;
                    if (z) {
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
                    z = true;
                    if (z) {
                    }
                }
            }
            z = false;
            if (z) {
            }
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f4, float f5, boolean z) {
        return this.z.a(f4, f5, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f4, float f5) {
        return this.z.b(f4, f5);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i4, int i5, int[] iArr, int[] iArr2) {
        return this.z.c(i4, i5, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i4, int i5, int i6, int i7, int[] iArr) {
        return this.z.d(i4, i5, i6, i7, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i4;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f4527e;
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
        EdgeEffect edgeEffect2 = this.f4528f;
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

    @Override // E.InterfaceC0015p
    public final void e(View view, View view2, int i4, int i5) {
        r rVar = this.f4544y;
        if (i5 == 1) {
            rVar.f438c = i4;
        } else {
            rVar.f437b = i4;
        }
        u(2, i5);
    }

    @Override // E.InterfaceC0015p
    public final void f(View view, int i4) {
        r rVar = this.f4544y;
        if (i4 == 1) {
            rVar.f438c = 0;
        } else {
            rVar.f437b = 0;
        }
        w(i4);
    }

    public final boolean g(int i4) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View view = findFocus;
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i4);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !l(findNextFocus, maxScrollAmount, getHeight())) {
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
            r(maxScrollAmount, -1, null, 0, 1, true);
        } else {
            Rect rect = this.f4525c;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            r(h(rect), -1, null, 0, 1, true);
            findNextFocus.requestFocus(i4);
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
        r rVar = this.f4544y;
        return rVar.f438c | rVar.f437b;
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
        if (this.f4521A == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f4521A = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f4521A;
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
        return this.z.f(0);
    }

    public final void i(int i4) {
        if (getChildCount() > 0) {
            this.f4526d.fling(getScrollX(), getScrollY(), 0, i4, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            u(2, 1);
            this.f4542w = getScrollY();
            postInvalidateOnAnimation();
            if (Build.VERSION.SDK_INT >= 35) {
                a.a(this, Math.abs(this.f4526d.getCurrVelocity()));
            }
        }
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.z.f434d;
    }

    public final boolean j(int i4) {
        int childCount;
        boolean z = i4 == 130;
        int height = getHeight();
        Rect rect = this.f4525c;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return q(i4, rect.top, rect.bottom);
    }

    public final boolean l(View view, int i4, int i5) {
        Rect rect = this.f4525c;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i4 >= getScrollY() && rect.top - i4 <= getScrollY() + i5;
    }

    public final void m(int i4, int i5, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i4);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.z.d(0, scrollY2, 0, i4 - scrollY2, null, i5, iArr);
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

    public final void n(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f4539s) {
            int i4 = actionIndex == 0 ? 1 : 0;
            this.f4530h = (int) motionEvent.getY(i4);
            this.f4539s = motionEvent.getPointerId(i4);
            VelocityTracker velocityTracker = this.f4535m;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean o(int i4, int i5, int i6, int i7) {
        int i8;
        boolean z;
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
            z = false;
        } else {
            i8 = 0;
            z = true;
        }
        if (i10 > i7) {
            i9 = i7;
        } else {
            if (i10 >= 0) {
                i9 = i10;
                z4 = false;
                if (z4 && !this.z.f(1)) {
                    this.f4526d.springBack(i8, i9, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i8, i9);
                return !z || z4;
            }
            i9 = 0;
        }
        z4 = true;
        if (z4) {
            this.f4526d.springBack(i8, i9, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i8, i9);
        if (z) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4532j = false;
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
        float f4;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z;
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
        if (motionEvent.getAction() != 8 || this.f4534l) {
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
        r(-((int) (getVerticalScrollFactorCompat() * f4)), i4, motionEvent, i5, 1, (motionEvent.getSource() & 8194) == 8194);
        if (i4 != 0) {
            C0002c c0002c = this.f4522B;
            NestedScrollView nestedScrollView4 = (NestedScrollView) c0002c.f407b.f15398b;
            int[] iArr = c0002c.f413h;
            int source = motionEvent.getSource();
            int deviceId = motionEvent.getDeviceId();
            int i10 = 1;
            if (c0002c.f411f == source && c0002c.f412g == deviceId && c0002c.f410e == i4) {
                z = false;
                i6 = 0;
            } else {
                Context context = c0002c.f406a;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int deviceId2 = motionEvent.getDeviceId();
                i6 = 0;
                int source2 = motionEvent.getSource();
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 34) {
                    Method method = I.f377a;
                    i7 = AbstractC0021w.f(viewConfiguration, deviceId2, i4, source2);
                } else {
                    Method method2 = I.f377a;
                    InputDevice device = InputDevice.getDevice(deviceId2);
                    if (device != null && device.getMotionRange(i4, source2) != null) {
                        Resources resources = context.getResources();
                        int identifier = (source2 == 4194304 && i4 == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", ConstantDeviceInfo.APP_PLATFORM) : -1;
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
                    i8 = AbstractC0021w.e(viewConfiguration, deviceId3, i4, source3);
                } else {
                    InputDevice device2 = InputDevice.getDevice(deviceId3);
                    if (device2 != null && device2.getMotionRange(i4, source3) != null) {
                        Resources resources2 = context.getResources();
                        int identifier2 = (source3 == 4194304 && i4 == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", ConstantDeviceInfo.APP_PLATFORM) : -1;
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
                c0002c.f411f = source;
                c0002c.f412g = deviceId;
                c0002c.f410e = i4;
                z = true;
            }
            if (iArr[i6] == Integer.MAX_VALUE) {
                VelocityTracker velocityTracker = c0002c.f408c;
                if (velocityTracker == null) {
                    return true;
                }
                velocityTracker.recycle();
                c0002c.f408c = null;
                return true;
            }
            if (c0002c.f408c == null) {
                c0002c.f408c = VelocityTracker.obtain();
            }
            VelocityTracker velocityTracker2 = c0002c.f408c;
            Map map = AbstractC0022x.f444a;
            velocityTracker2.addMovement(motionEvent);
            int i12 = 20;
            if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
                Map map2 = AbstractC0022x.f444a;
                if (!map2.containsKey(velocityTracker2)) {
                    map2.put(velocityTracker2, new C0023y());
                }
                C0023y c0023y = (C0023y) map2.get(velocityTracker2);
                long[] jArr = c0023y.f446b;
                long eventTime = motionEvent.getEventTime();
                if (c0023y.f448d != 0 && eventTime - jArr[c0023y.f449e] > 40) {
                    c0023y.f448d = i6;
                    c0023y.f447c = 0.0f;
                }
                int i13 = (c0023y.f449e + 1) % 20;
                c0023y.f449e = i13;
                int i14 = c0023y.f448d;
                if (i14 != 20) {
                    c0023y.f448d = i14 + 1;
                }
                c0023y.f445a[i13] = motionEvent.getAxisValue(26);
                jArr[c0023y.f449e] = eventTime;
            }
            velocityTracker2.computeCurrentVelocity(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, Float.MAX_VALUE);
            C0023y c0023y2 = (C0023y) AbstractC0022x.f444a.get(velocityTracker2);
            if (c0023y2 != null) {
                float[] fArr = c0023y2.f445a;
                long[] jArr2 = c0023y2.f446b;
                int i15 = c0023y2.f448d;
                if (i15 >= 2) {
                    int i16 = c0023y2.f449e;
                    int i17 = ((i16 + 20) - (i15 - 1)) % 20;
                    long j5 = jArr2[i16];
                    while (true) {
                        j4 = jArr2[i17];
                        if (j5 - j4 <= 100) {
                            break;
                        }
                        c0023y2.f448d--;
                        i17 = (i17 + 1) % 20;
                    }
                    int i18 = c0023y2.f448d;
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
                                if (i20 >= c0023y2.f448d - 1) {
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
                            i9 = AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT;
                        }
                        f8 = sqrt * i9;
                        c0023y2.f447c = f8;
                        if (f8 >= (-Math.abs(f7))) {
                            c0023y2.f447c = -Math.abs(f7);
                        } else if (c0023y2.f447c > Math.abs(f7)) {
                            c0023y2.f447c = Math.abs(f7);
                        }
                    }
                }
                nestedScrollView = nestedScrollView4;
                f7 = Float.MAX_VALUE;
                i9 = 1000;
                sqrt = 0.0f;
                f8 = sqrt * i9;
                c0023y2.f447c = f8;
                if (f8 >= (-Math.abs(f7))) {
                }
            } else {
                nestedScrollView = nestedScrollView4;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                f5 = AbstractC0021w.b(velocityTracker2, i4);
            } else if (i4 == 0) {
                f5 = velocityTracker2.getXVelocity();
            } else if (i4 == 1) {
                f5 = velocityTracker2.getYVelocity();
            } else {
                C0023y c0023y3 = (C0023y) AbstractC0022x.f444a.get(velocityTracker2);
                f5 = (c0023y3 == null || i4 != 26) ? 0.0f : c0023y3.f447c;
            }
            float f11 = f5 * (-nestedScrollView.getVerticalScrollFactorCompat());
            float signum = Math.signum(f11);
            if (z || !(signum == Math.signum(c0002c.f409d) || signum == 0.0f)) {
                nestedScrollView2 = nestedScrollView;
                nestedScrollView2.f4526d.abortAnimation();
            } else {
                nestedScrollView2 = nestedScrollView;
            }
            if (Math.abs(f11) >= iArr[0]) {
                float max = Math.max(-r2, Math.min(f11, iArr[1]));
                if (max == 0.0f) {
                    f6 = 0.0f;
                } else {
                    nestedScrollView2.f4526d.abortAnimation();
                    nestedScrollView2.i((int) max);
                    f6 = max;
                }
                c0002c.f409d = f6;
                return true;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2 && this.f4534l) {
            return true;
        }
        int i4 = action & KotlinVersion.MAX_COMPONENT_VALUE;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    int i5 = this.f4539s;
                    if (i5 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i5);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i5 + " in onInterceptTouchEvent");
                        } else {
                            int y4 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y4 - this.f4530h) > this.f4536p && (2 & getNestedScrollAxes()) == 0) {
                                this.f4534l = true;
                                this.f4530h = y4;
                                if (this.f4535m == null) {
                                    this.f4535m = VelocityTracker.obtain();
                                }
                                this.f4535m.addMovement(motionEvent);
                                this.v = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i4 != 3) {
                    if (i4 == 6) {
                        n(motionEvent);
                    }
                }
            }
            this.f4534l = false;
            this.f4539s = -1;
            VelocityTracker velocityTracker = this.f4535m;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f4535m = null;
            }
            if (this.f4526d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
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
                    this.f4530h = y5;
                    this.f4539s = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.f4535m;
                    if (velocityTracker2 == null) {
                        this.f4535m = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f4535m.addMovement(motionEvent);
                    this.f4526d.computeScrollOffset();
                    if (!v(motionEvent) && this.f4526d.isFinished()) {
                        z = false;
                    }
                    this.f4534l = z;
                    u(2, 0);
                }
            }
            if (!v(motionEvent) && this.f4526d.isFinished()) {
                z = false;
            }
            this.f4534l = z;
            VelocityTracker velocityTracker3 = this.f4535m;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f4535m = null;
            }
        }
        return this.f4534l;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i4, int i5, int i6, int i7) {
        int i8;
        super.onLayout(z, i4, i5, i6, i7);
        int i9 = 0;
        this.f4531i = false;
        View view = this.f4533k;
        if (view != null && k(view, this)) {
            View view2 = this.f4533k;
            Rect rect = this.f4525c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h2 = h(rect);
            if (h2 != 0) {
                scrollBy(0, h2);
            }
        }
        this.f4533k = null;
        if (!this.f4532j) {
            if (this.f4543x != null) {
                scrollTo(getScrollX(), this.f4543x.f1076a);
                this.f4543x = null;
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
        this.f4532j = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        if (this.n && View.MeasureSpec.getMode(i5) != 0 && getChildCount() > 0) {
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
    public final boolean onNestedFling(View view, float f4, float f5, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f5, true);
        i((int) f5);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f4, float f5) {
        return this.z.b(f4, f5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i4, int i5, int[] iArr) {
        this.z.c(i4, i5, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i4, int i5, int i6, int i7) {
        m(i7, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i4) {
        e(view, view2, i4, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i4, int i5, boolean z, boolean z4) {
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
        if (findNextFocus != null && l(findNextFocus, 0, getHeight())) {
            return findNextFocus.requestFocus(i4, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.getSuperState());
        this.f4543x = iVar;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        i iVar = new i(super.onSaveInstanceState());
        iVar.f1076a = getScrollY();
        return iVar;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i4, int i5, int i6, int i7) {
        super.onScrollChanged(i4, i5, i6, i7);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !l(findFocus, 0, i7)) {
            return;
        }
        Rect rect = this.f4525c;
        findFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(findFocus, rect);
        int h2 = h(rect);
        if (h2 != 0) {
            if (this.o) {
                t(0, false, h2);
            } else {
                scrollBy(0, h2);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i4) {
        return d(view, view2, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        f(view, 0);
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
        float L;
        int round;
        int i4;
        ViewParent parent2;
        if (this.f4535m == null) {
            this.f4535m = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.v = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float f4 = 0.0f;
        obtain.offsetLocation(0.0f, this.v);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f4527e;
            EdgeEffect edgeEffect2 = this.f4528f;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f4535m;
                velocityTracker.computeCurrentVelocity(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, this.f4538r);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f4539s);
                if (Math.abs(yVelocity) >= this.f4537q) {
                    if (AbstractC0124a.z(edgeEffect) != 0.0f) {
                        if (s(edgeEffect, yVelocity)) {
                            edgeEffect.onAbsorb(yVelocity);
                        } else {
                            i(-yVelocity);
                        }
                    } else if (AbstractC0124a.z(edgeEffect2) != 0.0f) {
                        int i5 = -yVelocity;
                        if (s(edgeEffect2, i5)) {
                            edgeEffect2.onAbsorb(i5);
                        } else {
                            i(i5);
                        }
                    } else {
                        int i6 = -yVelocity;
                        float f5 = i6;
                        if (!this.z.b(0.0f, f5)) {
                            dispatchNestedFling(0.0f, f5, true);
                            i(i6);
                        }
                    }
                } else if (this.f4526d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f4539s = -1;
                this.f4534l = false;
                VelocityTracker velocityTracker2 = this.f4535m;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f4535m = null;
                }
                w(0);
                this.f4527e.onRelease();
                this.f4528f.onRelease();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f4539s);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f4539s + " in onTouchEvent");
                } else {
                    int y4 = (int) motionEvent.getY(findPointerIndex);
                    int i7 = this.f4530h - y4;
                    float x4 = motionEvent.getX(findPointerIndex) / getWidth();
                    float height = i7 / getHeight();
                    if (AbstractC0124a.z(edgeEffect) != 0.0f) {
                        L = -AbstractC0124a.L(edgeEffect, -height, x4);
                        if (AbstractC0124a.z(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                    } else {
                        if (AbstractC0124a.z(edgeEffect2) != 0.0f) {
                            L = AbstractC0124a.L(edgeEffect2, height, 1.0f - x4);
                            if (AbstractC0124a.z(edgeEffect2) == 0.0f) {
                                edgeEffect2.onRelease();
                            }
                        }
                        round = Math.round(f4 * getHeight());
                        if (round != 0) {
                            invalidate();
                        }
                        i4 = i7 - round;
                        if (!this.f4534l && Math.abs(i4) > this.f4536p) {
                            parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.f4534l = true;
                            i4 = i4 <= 0 ? i4 - this.f4536p : i4 + this.f4536p;
                        }
                        if (this.f4534l) {
                            int r4 = r(i4, 1, motionEvent, (int) motionEvent.getX(findPointerIndex), 0, false);
                            this.f4530h = y4 - r4;
                            this.v += r4;
                        }
                    }
                    f4 = L;
                    round = Math.round(f4 * getHeight());
                    if (round != 0) {
                    }
                    i4 = i7 - round;
                    if (!this.f4534l) {
                        parent2 = getParent();
                        if (parent2 != null) {
                        }
                        this.f4534l = true;
                        if (i4 <= 0) {
                        }
                    }
                    if (this.f4534l) {
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f4534l && getChildCount() > 0) {
                    if (this.f4526d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        postInvalidateOnAnimation();
                    }
                }
                this.f4539s = -1;
                this.f4534l = false;
                VelocityTracker velocityTracker3 = this.f4535m;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f4535m = null;
                }
                w(0);
                this.f4527e.onRelease();
                this.f4528f.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f4530h = (int) motionEvent.getY(actionIndex);
                this.f4539s = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                n(motionEvent);
                this.f4530h = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f4539s));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f4534l && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f4526d.isFinished()) {
                this.f4526d.abortAnimation();
                w(1);
            }
            int y5 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f4530h = y5;
            this.f4539s = pointerId;
            u(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f4535m;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public final void p(int i4) {
        boolean z = i4 == 130;
        int height = getHeight();
        Rect rect = this.f4525c;
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
        int i5 = rect.top;
        int i6 = height + i5;
        rect.bottom = i6;
        q(i4, i5, i6);
    }

    public final boolean q(int i4, int i5, int i6) {
        boolean z;
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
            r(z4 ? i5 - scrollY : i6 - i7, -1, null, 0, 1, true);
            z = true;
        } else {
            z = false;
        }
        if (view3 != findFocus()) {
            view3.requestFocus(i4);
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int r(int i4, int i5, MotionEvent motionEvent, int i6, int i7, boolean z) {
        int i8;
        int i9;
        boolean z4;
        boolean z5;
        VelocityTracker velocityTracker;
        if (i7 == 1) {
            u(2, i7);
        }
        boolean c4 = this.z.c(0, i4, i7, this.f4541u, this.f4540t);
        int[] iArr = this.f4540t;
        int[] iArr2 = this.f4541u;
        if (c4) {
            i8 = i4 - iArr2[1];
            i9 = iArr[1];
        } else {
            i8 = i4;
            i9 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z6 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z;
        boolean z7 = o(i8, 0, scrollY, scrollRange) && !this.z.f(i7);
        int scrollY2 = getScrollY() - scrollY;
        if (motionEvent != null && scrollY2 != 0) {
            getScrollFeedbackProvider().f443a.onScrollProgress(motionEvent.getDeviceId(), motionEvent.getSource(), i5, scrollY2);
        }
        iArr2[1] = 0;
        this.z.d(0, scrollY2, 0, i8 - scrollY2, this.f4540t, i7, iArr2);
        int i10 = i9 + iArr[1];
        int i11 = i8 - iArr2[1];
        int i12 = scrollY + i11;
        EdgeEffect edgeEffect = this.f4528f;
        EdgeEffect edgeEffect2 = this.f4527e;
        if (i12 < 0) {
            if (z6) {
                AbstractC0124a.L(edgeEffect2, (-i11) / getHeight(), i6 / getWidth());
                if (motionEvent != null) {
                    getScrollFeedbackProvider().f443a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i5, true);
                }
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i12 > scrollRange && z6) {
            AbstractC0124a.L(edgeEffect, i11 / getHeight(), 1.0f - (i6 / getWidth()));
            if (motionEvent != null) {
                z4 = false;
                getScrollFeedbackProvider().f443a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i5, false);
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
            if (z5 && i7 == 0 && (velocityTracker = this.f4535m) != null) {
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

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f4531i) {
            this.f4533k = view2;
        } else {
            Rect rect = this.f4525c;
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
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int h2 = h(rect);
        boolean z4 = h2 != 0;
        if (z4) {
            if (z) {
                scrollBy(0, h2);
                return z4;
            }
            t(0, false, h2);
        }
        return z4;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        VelocityTracker velocityTracker;
        if (z && (velocityTracker = this.f4535m) != null) {
            velocityTracker.recycle();
            this.f4535m = null;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f4531i = true;
        super.requestLayout();
    }

    public final boolean s(EdgeEffect edgeEffect, int i4) {
        if (i4 > 0) {
            return true;
        }
        float z = AbstractC0124a.z(edgeEffect) * getHeight();
        float abs = Math.abs(-i4) * 0.35f;
        float f4 = this.f4523a * 0.015f;
        double log = Math.log(abs / f4);
        double d4 = f4518C;
        return ((float) (Math.exp((d4 / (d4 - 1.0d)) * log) * ((double) f4))) < z;
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

    public void setFillViewport(boolean z) {
        if (z != this.n) {
            this.n = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        C0014o c0014o = this.z;
        if (c0014o.f434d) {
            ViewGroup viewGroup = c0014o.f433c;
            Field field = H.f375a;
            A.g(viewGroup);
        }
        c0014o.f434d = z;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.o = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i4) {
        return this.z.g(i4, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        w(0);
    }

    public final void t(int i4, boolean z, int i5) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f4524b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int max = Math.max(0, Math.min(i5 + scrollY, Math.max(0, height - height2))) - scrollY;
            this.f4526d.startScroll(getScrollX(), scrollY, 0, max, 250);
            if (z) {
                u(2, 1);
            } else {
                w(1);
            }
            this.f4542w = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f4526d.isFinished()) {
                this.f4526d.abortAnimation();
                w(1);
            }
            scrollBy(i4, i5);
        }
        this.f4524b = AnimationUtils.currentAnimationTimeMillis();
    }

    public final void u(int i4, int i5) {
        this.z.g(2, i5);
    }

    public final boolean v(MotionEvent motionEvent) {
        boolean z;
        EdgeEffect edgeEffect = this.f4527e;
        if (AbstractC0124a.z(edgeEffect) != 0.0f) {
            AbstractC0124a.L(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.f4528f;
        if (AbstractC0124a.z(edgeEffect2) == 0.0f) {
            return z;
        }
        AbstractC0124a.L(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void w(int i4) {
        this.z.h(i4);
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

    public void setOnScrollChangeListener(g gVar) {
    }
}
