package androidx.core.widget;

import E.A;
import E.AbstractC0014o;
import E.AbstractC0015p;
import E.AbstractC0018t;
import E.B;
import E.C0002c;
import E.C0006g;
import E.C0009j;
import E.C0013n;
import E.C0016q;
import E.InterfaceC0008i;
import G.a;
import H.d;
import H.f;
import H.g;
import H.i;
import a.AbstractC0129a;
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
import b0.C0178i;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0008i {

    /* renamed from: C, reason: collision with root package name */
    public static final float f2183C = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: D, reason: collision with root package name */
    public static final f f2184D = new f();

    /* renamed from: E, reason: collision with root package name */
    public static final int[] f2185E = {R.attr.fillViewport};

    /* renamed from: A, reason: collision with root package name */
    public float f2186A;

    /* renamed from: B, reason: collision with root package name */
    public final C0002c f2187B;

    /* renamed from: a, reason: collision with root package name */
    public final float f2188a;

    /* renamed from: b, reason: collision with root package name */
    public long f2189b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f2190c;

    /* renamed from: d, reason: collision with root package name */
    public final OverScroller f2191d;

    /* renamed from: e, reason: collision with root package name */
    public final EdgeEffect f2192e;
    public final EdgeEffect f;

    /* renamed from: g, reason: collision with root package name */
    public C0013n f2193g;

    /* renamed from: h, reason: collision with root package name */
    public int f2194h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2195i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2196j;

    /* renamed from: k, reason: collision with root package name */
    public View f2197k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2198l;

    /* renamed from: m, reason: collision with root package name */
    public VelocityTracker f2199m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2200n;
    public boolean o;

    /* renamed from: p, reason: collision with root package name */
    public final int f2201p;

    /* renamed from: q, reason: collision with root package name */
    public final int f2202q;

    /* renamed from: r, reason: collision with root package name */
    public final int f2203r;

    /* renamed from: s, reason: collision with root package name */
    public int f2204s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f2205t;

    /* renamed from: u, reason: collision with root package name */
    public final int[] f2206u;
    public int v;

    /* renamed from: w, reason: collision with root package name */
    public int f2207w;

    /* renamed from: x, reason: collision with root package name */
    public i f2208x;

    /* renamed from: y, reason: collision with root package name */
    public final C0009j f2209y;
    public final C0006g z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.fc.barca.football.R.attr.nestedScrollViewStyle);
        this.f2190c = new Rect();
        this.f2195i = true;
        this.f2196j = false;
        this.f2197k = null;
        this.f2198l = false;
        this.o = true;
        this.f2204s = -1;
        this.f2205t = new int[2];
        this.f2206u = new int[2];
        this.f2187B = new C0002c(getContext(), new C0178i(6, this));
        int i3 = Build.VERSION.SDK_INT;
        this.f2192e = i3 >= 31 ? d.a(context, attributeSet) : new EdgeEffect(context);
        this.f = i3 >= 31 ? d.a(context, attributeSet) : new EdgeEffect(context);
        this.f2188a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f2191d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f2201p = viewConfiguration.getScaledTouchSlop();
        this.f2202q = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2203r = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2185E, com.fc.barca.football.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f2209y = new C0009j();
        this.z = new C0006g(this);
        setNestedScrollingEnabled(true);
        A.a(this, f2184D);
    }

    private C0013n getScrollFeedbackProvider() {
        if (this.f2193g == null) {
            this.f2193g = new C0013n(this);
        }
        return this.f2193g;
    }

    public static boolean k(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && k((View) parent, nestedScrollView);
    }

    @Override // E.InterfaceC0007h
    public final void a(View view, View view2, int i3, int i4) {
        C0009j c0009j = this.f2209y;
        if (i4 == 1) {
            c0009j.f292c = i3;
        } else {
            c0009j.f291b = i3;
        }
        u(2, i4);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // E.InterfaceC0007h
    public final void b(ViewGroup viewGroup, int i3, int i4, int i5, int i6, int i7) {
        m(i6, i7, null);
    }

    @Override // E.InterfaceC0007h
    public final void c(View view, int i3) {
        C0009j c0009j = this.f2209y;
        if (i3 == 1) {
            c0009j.f292c = 0;
        } else {
            c0009j.f291b = 0;
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
        if (this.f2191d.isFinished()) {
            return;
        }
        this.f2191d.computeScrollOffset();
        int currY = this.f2191d.getCurrY();
        int i4 = currY - this.f2207w;
        int height = getHeight();
        EdgeEffect edgeEffect = this.f;
        EdgeEffect edgeEffect2 = this.f2192e;
        if (i4 <= 0 || AbstractC0129a.o(edgeEffect2) == 0.0f) {
            if (i4 < 0 && AbstractC0129a.o(edgeEffect) != 0.0f) {
                float f = height;
                round = Math.round(AbstractC0129a.t(edgeEffect, (i4 * 4.0f) / f, 0.5f) * (f / 4.0f));
                if (round != i4) {
                    edgeEffect.finish();
                }
            }
            int i5 = i4;
            this.f2207w = currY;
            int[] iArr = this.f2206u;
            iArr[1] = 0;
            this.z.c(0, i5, 1, iArr, null);
            i3 = i5 - iArr[1];
            int scrollRange = getScrollRange();
            if (Build.VERSION.SDK_INT >= 35) {
                a.a(this, Math.abs(this.f2191d.getCurrVelocity()));
            }
            if (i3 != 0) {
                int scrollY = getScrollY();
                o(i3, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i6 = i3 - scrollY2;
                iArr[1] = 0;
                this.z.d(0, scrollY2, 0, i6, this.f2205t, 1, iArr);
                i3 = i6 - iArr[1];
            }
            if (i3 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i3 < 0) {
                        if (edgeEffect2.isFinished()) {
                            edgeEffect2.onAbsorb((int) this.f2191d.getCurrVelocity());
                        }
                    } else if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) this.f2191d.getCurrVelocity());
                    }
                }
                this.f2191d.abortAnimation();
                w(1);
            }
            if (this.f2191d.isFinished()) {
                postInvalidateOnAnimation();
                return;
            } else {
                w(1);
                return;
            }
        }
        round = Math.round(AbstractC0129a.t(edgeEffect2, ((-i4) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (round != i4) {
            edgeEffect2.finish();
        }
        i4 -= round;
        int i52 = i4;
        this.f2207w = currY;
        int[] iArr2 = this.f2206u;
        iArr2[1] = 0;
        this.z.c(0, i52, 1, iArr2, null);
        i3 = i52 - iArr2[1];
        int scrollRange2 = getScrollRange();
        if (Build.VERSION.SDK_INT >= 35) {
        }
        if (i3 != 0) {
        }
        if (i3 != 0) {
        }
        if (this.f2191d.isFinished()) {
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

    @Override // E.InterfaceC0007h
    public final void d(int i3, int i4, int[] iArr, int i5) {
        this.z.c(i3, i4, i5, iArr, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00cb A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z;
        if (!super.dispatchKeyEvent(keyEvent)) {
            this.f2190c.setEmpty();
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
    public final boolean dispatchNestedFling(float f, float f3, boolean z) {
        return this.z.a(f, f3, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f3) {
        return this.z.b(f, f3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i3, int i4, int[] iArr, int[] iArr2) {
        return this.z.c(i3, i4, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i3, int i4, int i5, int i6, int[] iArr) {
        return this.z.d(i3, i4, i5, i6, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i3;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f2192e;
        int i4 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                i3 = getPaddingLeft();
            } else {
                i3 = 0;
            }
            if (getClipToPadding()) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate(i3, min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.f;
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

    @Override // E.InterfaceC0008i
    public final void e(ViewGroup viewGroup, int i3, int i4, int i5, int i6, int i7, int[] iArr) {
        m(i6, i7, iArr);
    }

    @Override // E.InterfaceC0007h
    public final boolean f(View view, View view2, int i3, int i4) {
        return (i3 & 2) != 0;
    }

    public final boolean g(int i3) {
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
            Rect rect = this.f2190c;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            r(h(rect), -1, null, 0, 1, true);
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
        C0009j c0009j = this.f2209y;
        return c0009j.f292c | c0009j.f291b;
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
        if (this.f2186A == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f2186A = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f2186A;
    }

    public final int h(Rect rect) {
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
        int i4 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i3 - verticalFadingEdgeLength : i3;
        int i5 = rect.bottom;
        if (i5 > i4 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i4, (childAt.getBottom() + layoutParams.bottomMargin) - i3);
        }
        if (rect.top >= scrollY || i5 >= i4) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i4 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.z.f(0);
    }

    public final void i(int i3) {
        if (getChildCount() > 0) {
            this.f2191d.fling(getScrollX(), getScrollY(), 0, i3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            u(2, 1);
            this.f2207w = getScrollY();
            postInvalidateOnAnimation();
            if (Build.VERSION.SDK_INT >= 35) {
                a.a(this, Math.abs(this.f2191d.getCurrVelocity()));
            }
        }
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.z.f288d;
    }

    public final boolean j(int i3) {
        int childCount;
        boolean z = i3 == 130;
        int height = getHeight();
        Rect rect = this.f2190c;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return q(i3, rect.top, rect.bottom);
    }

    public final boolean l(View view, int i3, int i4) {
        Rect rect = this.f2190c;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i3 >= getScrollY() && rect.top - i3 <= getScrollY() + i4;
    }

    public final void m(int i3, int i4, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i3);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.z.d(0, scrollY2, 0, i3 - scrollY2, null, i4, iArr);
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i3, int i4) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i3, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i4, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2204s) {
            int i3 = actionIndex == 0 ? 1 : 0;
            this.f2194h = (int) motionEvent.getY(i3);
            this.f2204s = motionEvent.getPointerId(i3);
            VelocityTracker velocityTracker = this.f2199m;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean o(int i3, int i4, int i5, int i6) {
        int i7;
        boolean z;
        int i8;
        boolean z2;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i9 = i5 + i3;
        if (i4 <= 0 && i4 >= 0) {
            i7 = i4;
            z = false;
        } else {
            i7 = 0;
            z = true;
        }
        if (i9 > i6) {
            i8 = i6;
        } else {
            if (i9 >= 0) {
                i8 = i9;
                z2 = false;
                if (z2 && !this.z.f(1)) {
                    this.f2191d.springBack(i7, i8, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i7, i8);
                return !z || z2;
            }
            i8 = 0;
        }
        z2 = true;
        if (z2) {
            this.f2191d.springBack(i7, i8, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i7, i8);
        if (z) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2196j = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x0131, code lost:
    
        if (r6 >= 0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x00dd, code lost:
    
        if (r7 >= 0) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02cb  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int scaledMaximumFlingVelocity;
        boolean z;
        VelocityTracker velocityTracker;
        float f3;
        float f4;
        long j3;
        float f5;
        float sqrt;
        int i8;
        float f6;
        VelocityTracker velocityTracker2;
        int i9;
        float f7;
        if (motionEvent.getAction() != 8 || this.f2198l) {
            return false;
        }
        if ((motionEvent.getSource() & 2) == 2) {
            float axisValue = motionEvent.getAxisValue(9);
            i4 = (int) motionEvent.getX();
            i3 = 9;
            f = axisValue;
        } else if ((motionEvent.getSource() & 4194304) == 4194304) {
            float axisValue2 = motionEvent.getAxisValue(26);
            i4 = getWidth() / 2;
            f = axisValue2;
            i3 = 26;
        } else {
            f = 0.0f;
            i3 = 0;
            i4 = 0;
        }
        if (f == 0.0f) {
            return false;
        }
        r(-((int) (getVerticalScrollFactorCompat() * f)), i3, motionEvent, i4, 1, (motionEvent.getSource() & 8194) == 8194);
        if (i3 != 0) {
            C0002c c0002c = this.f2187B;
            c0002c.getClass();
            int source = motionEvent.getSource();
            int deviceId = motionEvent.getDeviceId();
            int i10 = c0002c.f;
            int[] iArr = c0002c.f283h;
            int i11 = 1;
            if (i10 == source && c0002c.f282g == deviceId && c0002c.f281e == i3) {
                z = false;
                i5 = 20;
                i6 = 0;
            } else {
                Context context = c0002c.f277a;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                i5 = 20;
                int deviceId2 = motionEvent.getDeviceId();
                int source2 = motionEvent.getSource();
                i6 = 0;
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= 34) {
                    Method method = B.f245a;
                    i7 = AbstractC0014o.f(viewConfiguration, deviceId2, i3, source2);
                } else {
                    Method method2 = B.f245a;
                    InputDevice device = InputDevice.getDevice(deviceId2);
                    if (device != null && device.getMotionRange(i3, source2) != null) {
                        Resources resources = context.getResources();
                        int identifier = (source2 == 4194304 && i3 == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", ConstantDeviceInfo.APP_PLATFORM) : -1;
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
                if (i12 >= 34) {
                    scaledMaximumFlingVelocity = AbstractC0014o.e(viewConfiguration, deviceId3, i3, source3);
                } else {
                    InputDevice device2 = InputDevice.getDevice(deviceId3);
                    if ((device2 == null || device2.getMotionRange(i3, source3) == null) ? false : true) {
                        Resources resources2 = context.getResources();
                        int identifier2 = (source3 == 4194304 && i3 == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", ConstantDeviceInfo.APP_PLATFORM) : -1;
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
                c0002c.f = source;
                c0002c.f282g = deviceId;
                c0002c.f281e = i3;
                z = true;
            }
            if (iArr[i6] == Integer.MAX_VALUE) {
                VelocityTracker velocityTracker3 = c0002c.f279c;
                if (velocityTracker3 == null) {
                    return true;
                }
                velocityTracker3.recycle();
                c0002c.f279c = null;
                return true;
            }
            if (c0002c.f279c == null) {
                c0002c.f279c = VelocityTracker.obtain();
            }
            VelocityTracker velocityTracker4 = c0002c.f279c;
            Map map = AbstractC0015p.f295a;
            velocityTracker4.addMovement(motionEvent);
            if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
                Map map2 = AbstractC0015p.f295a;
                if (!map2.containsKey(velocityTracker4)) {
                    map2.put(velocityTracker4, new C0016q());
                }
                C0016q c0016q = (C0016q) map2.get(velocityTracker4);
                c0016q.getClass();
                long eventTime = motionEvent.getEventTime();
                int i13 = c0016q.f299d;
                long[] jArr = c0016q.f297b;
                if (i13 != 0 && eventTime - jArr[c0016q.f300e] > 40) {
                    c0016q.f299d = i6;
                    c0016q.f298c = 0.0f;
                }
                int i14 = (c0016q.f300e + 1) % 20;
                c0016q.f300e = i14;
                int i15 = c0016q.f299d;
                if (i15 != i5) {
                    c0016q.f299d = i15 + 1;
                }
                c0016q.f296a[i14] = motionEvent.getAxisValue(26);
                jArr[c0016q.f300e] = eventTime;
            }
            float f8 = Float.MAX_VALUE;
            velocityTracker4.computeCurrentVelocity(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, Float.MAX_VALUE);
            C0016q c0016q2 = (C0016q) AbstractC0015p.f295a.get(velocityTracker4);
            if (c0016q2 != null) {
                int i16 = c0016q2.f299d;
                if (i16 >= 2) {
                    int i17 = c0016q2.f300e;
                    int i18 = ((i17 + 20) - (i16 - 1)) % 20;
                    long[] jArr2 = c0016q2.f297b;
                    long j4 = jArr2[i17];
                    while (true) {
                        j3 = jArr2[i18];
                        if (j4 - j3 <= 100) {
                            break;
                        }
                        c0016q2.f299d--;
                        i18 = (i18 + 1) % 20;
                    }
                    int i19 = c0016q2.f299d;
                    if (i19 >= 2) {
                        float[] fArr = c0016q2.f296a;
                        if (i19 == 2) {
                            int i20 = (i18 + 1) % 20;
                            if (j3 != jArr2[i20]) {
                                velocityTracker = velocityTracker4;
                                f5 = Float.MAX_VALUE;
                                i8 = 1000;
                                sqrt = fArr[i20] / (r17 - j3);
                            }
                        } else {
                            float f9 = 0.0f;
                            int i21 = 0;
                            int i22 = 0;
                            while (true) {
                                if (i21 >= c0016q2.f299d - 1) {
                                    break;
                                }
                                int i23 = i21 + i18;
                                long j5 = jArr2[i23 % 20];
                                int i24 = (i23 + 1) % 20;
                                if (jArr2[i24] == j5) {
                                    velocityTracker2 = velocityTracker4;
                                    f6 = f8;
                                    i9 = i11;
                                } else {
                                    i22++;
                                    f6 = f8;
                                    velocityTracker2 = velocityTracker4;
                                    float sqrt2 = (f9 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f9) * 2.0f));
                                    float f10 = fArr[i24] / (jArr2[i24] - j5);
                                    float abs = (Math.abs(f10) * (f10 - sqrt2)) + f9;
                                    i9 = i11;
                                    if (i22 == i9) {
                                        abs *= 0.5f;
                                    }
                                    f9 = abs;
                                }
                                i21 += i9;
                                f8 = f6;
                                i11 = i9;
                                velocityTracker4 = velocityTracker2;
                            }
                            velocityTracker = velocityTracker4;
                            f5 = f8;
                            sqrt = ((float) Math.sqrt(Math.abs(f9) * 2.0f)) * (f9 < 0.0f ? -1.0f : 1.0f);
                            i8 = AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT;
                        }
                        f7 = sqrt * i8;
                        c0016q2.f298c = f7;
                        if (f7 >= (-Math.abs(f5))) {
                            c0016q2.f298c = -Math.abs(f5);
                        } else if (c0016q2.f298c > Math.abs(f5)) {
                            c0016q2.f298c = Math.abs(f5);
                        }
                    }
                }
                velocityTracker = velocityTracker4;
                f5 = Float.MAX_VALUE;
                i8 = 1000;
                sqrt = 0.0f;
                f7 = sqrt * i8;
                c0016q2.f298c = f7;
                if (f7 >= (-Math.abs(f5))) {
                }
            } else {
                velocityTracker = velocityTracker4;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                f3 = AbstractC0014o.b(velocityTracker, i3);
            } else {
                VelocityTracker velocityTracker5 = velocityTracker;
                if (i3 == 0) {
                    f3 = velocityTracker5.getXVelocity();
                } else if (i3 == 1) {
                    f3 = velocityTracker5.getYVelocity();
                } else {
                    C0016q c0016q3 = (C0016q) AbstractC0015p.f295a.get(velocityTracker5);
                    f3 = (c0016q3 == null || i3 != 26) ? 0.0f : c0016q3.f298c;
                }
            }
            NestedScrollView nestedScrollView = (NestedScrollView) c0002c.f278b.f2532b;
            float f11 = f3 * (-nestedScrollView.getVerticalScrollFactorCompat());
            float signum = Math.signum(f11);
            if (z || (signum != Math.signum(c0002c.f280d) && signum != 0.0f)) {
                nestedScrollView.f2191d.abortAnimation();
            }
            if (Math.abs(f11) >= iArr[0]) {
                float max = Math.max(-r4, Math.min(f11, iArr[1]));
                if (max == 0.0f) {
                    f4 = 0.0f;
                } else {
                    nestedScrollView.f2191d.abortAnimation();
                    nestedScrollView.i((int) max);
                    f4 = max;
                }
                c0002c.f280d = f4;
                return true;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2 && this.f2198l) {
            return true;
        }
        int i3 = action & KotlinVersion.MAX_COMPONENT_VALUE;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = this.f2204s;
                    if (i4 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i4);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i4 + " in onInterceptTouchEvent");
                        } else {
                            int y3 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y3 - this.f2194h) > this.f2201p && (2 & getNestedScrollAxes()) == 0) {
                                this.f2198l = true;
                                this.f2194h = y3;
                                if (this.f2199m == null) {
                                    this.f2199m = VelocityTracker.obtain();
                                }
                                this.f2199m.addMovement(motionEvent);
                                this.v = 0;
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
            this.f2198l = false;
            this.f2204s = -1;
            VelocityTracker velocityTracker = this.f2199m;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f2199m = null;
            }
            if (this.f2191d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
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
                    this.f2194h = y4;
                    this.f2204s = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.f2199m;
                    if (velocityTracker2 == null) {
                        this.f2199m = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f2199m.addMovement(motionEvent);
                    this.f2191d.computeScrollOffset();
                    if (!v(motionEvent) && this.f2191d.isFinished()) {
                        z = false;
                    }
                    this.f2198l = z;
                    u(2, 0);
                }
            }
            if (!v(motionEvent) && this.f2191d.isFinished()) {
                z = false;
            }
            this.f2198l = z;
            VelocityTracker velocityTracker3 = this.f2199m;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f2199m = null;
            }
        }
        return this.f2198l;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i3, int i4, int i5, int i6) {
        int i7;
        super.onLayout(z, i3, i4, i5, i6);
        int i8 = 0;
        this.f2195i = false;
        View view = this.f2197k;
        if (view != null && k(view, this)) {
            View view2 = this.f2197k;
            Rect rect = this.f2190c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h3 = h(rect);
            if (h3 != 0) {
                scrollBy(0, h3);
            }
        }
        this.f2197k = null;
        if (!this.f2196j) {
            if (this.f2208x != null) {
                scrollTo(getScrollX(), this.f2208x.f591a);
                this.f2208x = null;
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
        this.f2196j = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i4) {
        super.onMeasure(i3, i4);
        if (this.f2200n && View.MeasureSpec.getMode(i4) != 0 && getChildCount() > 0) {
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
    public final boolean onNestedFling(View view, float f, float f3, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f3, true);
        i((int) f3);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f3) {
        return this.z.b(f, f3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i3, int i4, int[] iArr) {
        this.z.c(i3, i4, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i3, int i4, int i5, int i6) {
        m(i6, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i3) {
        a(view, view2, i3, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i3, int i4, boolean z, boolean z2) {
        super.scrollTo(i3, i4);
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
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.getSuperState());
        this.f2208x = iVar;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        i iVar = new i(super.onSaveInstanceState());
        iVar.f591a = getScrollY();
        return iVar;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i3, int i4, int i5, int i6) {
        super.onScrollChanged(i3, i4, i5, i6);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i4, int i5, int i6) {
        super.onSizeChanged(i3, i4, i5, i6);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !l(findFocus, 0, i6)) {
            return;
        }
        Rect rect = this.f2190c;
        findFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(findFocus, rect);
        int h3 = h(rect);
        if (h3 != 0) {
            if (this.o) {
                t(0, h3, false);
            } else {
                scrollBy(0, h3);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i3) {
        return f(view, view2, i3, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        c(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0149  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        float t3;
        int round;
        int i3;
        ViewParent parent2;
        if (this.f2199m == null) {
            this.f2199m = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.v = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float f = 0.0f;
        obtain.offsetLocation(0.0f, this.v);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f;
            EdgeEffect edgeEffect2 = this.f2192e;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f2199m;
                velocityTracker.computeCurrentVelocity(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, this.f2203r);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f2204s);
                if (Math.abs(yVelocity) >= this.f2202q) {
                    if (AbstractC0129a.o(edgeEffect2) != 0.0f) {
                        if (s(edgeEffect2, yVelocity)) {
                            edgeEffect2.onAbsorb(yVelocity);
                        } else {
                            i(-yVelocity);
                        }
                    } else if (AbstractC0129a.o(edgeEffect) != 0.0f) {
                        int i4 = -yVelocity;
                        if (s(edgeEffect, i4)) {
                            edgeEffect.onAbsorb(i4);
                        } else {
                            i(i4);
                        }
                    } else {
                        int i5 = -yVelocity;
                        float f3 = i5;
                        if (!this.z.b(0.0f, f3)) {
                            dispatchNestedFling(0.0f, f3, true);
                            i(i5);
                        }
                    }
                } else if (this.f2191d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f2204s = -1;
                this.f2198l = false;
                VelocityTracker velocityTracker2 = this.f2199m;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f2199m = null;
                }
                w(0);
                this.f2192e.onRelease();
                this.f.onRelease();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f2204s);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f2204s + " in onTouchEvent");
                } else {
                    int y3 = (int) motionEvent.getY(findPointerIndex);
                    int i6 = this.f2194h - y3;
                    float x3 = motionEvent.getX(findPointerIndex) / getWidth();
                    float height = i6 / getHeight();
                    if (AbstractC0129a.o(edgeEffect2) != 0.0f) {
                        t3 = -AbstractC0129a.t(edgeEffect2, -height, x3);
                        if (AbstractC0129a.o(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                    } else {
                        if (AbstractC0129a.o(edgeEffect) != 0.0f) {
                            t3 = AbstractC0129a.t(edgeEffect, height, 1.0f - x3);
                            if (AbstractC0129a.o(edgeEffect) == 0.0f) {
                                edgeEffect.onRelease();
                            }
                        }
                        round = Math.round(f * getHeight());
                        if (round != 0) {
                            invalidate();
                        }
                        i3 = i6 - round;
                        if (!this.f2198l && Math.abs(i3) > this.f2201p) {
                            parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.f2198l = true;
                            i3 = i3 <= 0 ? i3 - this.f2201p : i3 + this.f2201p;
                        }
                        if (this.f2198l) {
                            int r3 = r(i3, 1, motionEvent, (int) motionEvent.getX(findPointerIndex), 0, false);
                            this.f2194h = y3 - r3;
                            this.v += r3;
                        }
                    }
                    f = t3;
                    round = Math.round(f * getHeight());
                    if (round != 0) {
                    }
                    i3 = i6 - round;
                    if (!this.f2198l) {
                        parent2 = getParent();
                        if (parent2 != null) {
                        }
                        this.f2198l = true;
                        if (i3 <= 0) {
                        }
                    }
                    if (this.f2198l) {
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f2198l && getChildCount() > 0 && this.f2191d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f2204s = -1;
                this.f2198l = false;
                VelocityTracker velocityTracker3 = this.f2199m;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f2199m = null;
                }
                w(0);
                this.f2192e.onRelease();
                this.f.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f2194h = (int) motionEvent.getY(actionIndex);
                this.f2204s = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                n(motionEvent);
                this.f2194h = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f2204s));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f2198l && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f2191d.isFinished()) {
                this.f2191d.abortAnimation();
                w(1);
            }
            int y4 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f2194h = y4;
            this.f2204s = pointerId;
            u(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f2199m;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public final void p(int i3) {
        boolean z = i3 == 130;
        int height = getHeight();
        Rect rect = this.f2190c;
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
        int i4 = rect.top;
        int i5 = height + i4;
        rect.bottom = i5;
        q(i3, i4, i5);
    }

    public final boolean q(int i3, int i4, int i5) {
        boolean z;
        int height = getHeight();
        int scrollY = getScrollY();
        int i6 = height + scrollY;
        boolean z2 = i3 == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z3 = false;
        for (int i7 = 0; i7 < size; i7++) {
            View view2 = focusables.get(i7);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i4 < bottom && top < i5) {
                boolean z4 = i4 < top && bottom < i5;
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
        if (i4 < scrollY || i5 > i6) {
            r(z2 ? i4 - scrollY : i5 - i6, -1, null, 0, 1, true);
            z = true;
        } else {
            z = false;
        }
        if (view3 != findFocus()) {
            view3.requestFocus(i3);
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int r(int i3, int i4, MotionEvent motionEvent, int i5, int i6, boolean z) {
        int i7;
        int i8;
        boolean z2;
        boolean z3;
        VelocityTracker velocityTracker;
        if (i6 == 1) {
            u(2, i6);
        }
        boolean c3 = this.z.c(0, i3, i6, this.f2206u, this.f2205t);
        int[] iArr = this.f2206u;
        int[] iArr2 = this.f2205t;
        if (c3) {
            i7 = i3 - iArr[1];
            i8 = iArr2[1];
        } else {
            i7 = i3;
            i8 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z4 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z;
        boolean z5 = o(i7, 0, scrollY, scrollRange) && !this.z.f(i6);
        int scrollY2 = getScrollY() - scrollY;
        if (motionEvent != null && scrollY2 != 0) {
            getScrollFeedbackProvider().f294a.b(motionEvent.getDeviceId(), motionEvent.getSource(), i4, scrollY2);
        }
        iArr[1] = 0;
        this.z.d(0, scrollY2, 0, i7 - scrollY2, this.f2205t, i6, iArr);
        int i9 = i8 + iArr2[1];
        int i10 = i7 - iArr[1];
        int i11 = scrollY + i10;
        EdgeEffect edgeEffect = this.f;
        EdgeEffect edgeEffect2 = this.f2192e;
        if (i11 < 0) {
            if (z4) {
                AbstractC0129a.t(edgeEffect2, (-i10) / getHeight(), i5 / getWidth());
                if (motionEvent != null) {
                    getScrollFeedbackProvider().f294a.a(motionEvent.getDeviceId(), motionEvent.getSource(), i4, true);
                }
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i11 > scrollRange && z4) {
            AbstractC0129a.t(edgeEffect, i10 / getHeight(), 1.0f - (i5 / getWidth()));
            if (motionEvent != null) {
                z2 = false;
                getScrollFeedbackProvider().f294a.a(motionEvent.getDeviceId(), motionEvent.getSource(), i4, false);
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
            if (z3 && i6 == 0 && (velocityTracker = this.f2199m) != null) {
                velocityTracker.clear();
            }
            if (i6 == 1) {
                w(i6);
                edgeEffect2.onRelease();
                edgeEffect.onRelease();
            }
            return i9;
        }
        z2 = false;
        if (edgeEffect2.isFinished()) {
        }
        postInvalidateOnAnimation();
        z3 = z2;
        if (z3) {
            velocityTracker.clear();
        }
        if (i6 == 1) {
        }
        return i9;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f2195i) {
            this.f2197k = view2;
        } else {
            Rect rect = this.f2190c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h3 = h(rect);
            if (h3 != 0) {
                scrollBy(0, h3);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int h3 = h(rect);
        boolean z2 = h3 != 0;
        if (z2) {
            if (z) {
                scrollBy(0, h3);
                return z2;
            }
            t(0, h3, false);
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        VelocityTracker velocityTracker;
        if (z && (velocityTracker = this.f2199m) != null) {
            velocityTracker.recycle();
            this.f2199m = null;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f2195i = true;
        super.requestLayout();
    }

    public final boolean s(EdgeEffect edgeEffect, int i3) {
        if (i3 > 0) {
            return true;
        }
        float o = AbstractC0129a.o(edgeEffect) * getHeight();
        float abs = Math.abs(-i3) * 0.35f;
        float f = this.f2188a * 0.015f;
        double log = Math.log(abs / f);
        double d3 = f2183C;
        return ((float) (Math.exp((d3 / (d3 - 1.0d)) * log) * ((double) f))) < o;
    }

    @Override // android.view.View
    public final void scrollTo(int i3, int i4) {
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
            if (height >= height2 || i4 < 0) {
                i4 = 0;
            } else if (height + i4 > height2) {
                i4 = height2 - height;
            }
            if (i3 == getScrollX() && i4 == getScrollY()) {
                return;
            }
            super.scrollTo(i3, i4);
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f2200n) {
            this.f2200n = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        C0006g c0006g = this.z;
        if (c0006g.f288d) {
            Field field = A.f243a;
            AbstractC0018t.g(c0006g.f287c);
        }
        c0006g.f288d = z;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.o = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i3) {
        return this.z.g(i3, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        w(0);
    }

    public final void t(int i3, int i4, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f2189b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f2191d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i4 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            if (z) {
                u(2, 1);
            } else {
                w(1);
            }
            this.f2207w = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f2191d.isFinished()) {
                this.f2191d.abortAnimation();
                w(1);
            }
            scrollBy(i3, i4);
        }
        this.f2189b = AnimationUtils.currentAnimationTimeMillis();
    }

    public final void u(int i3, int i4) {
        this.z.g(2, i4);
    }

    public final boolean v(MotionEvent motionEvent) {
        boolean z;
        EdgeEffect edgeEffect = this.f2192e;
        if (AbstractC0129a.o(edgeEffect) != 0.0f) {
            AbstractC0129a.t(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.f;
        if (AbstractC0129a.o(edgeEffect2) == 0.0f) {
            return z;
        }
        AbstractC0129a.t(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void w(int i3) {
        this.z.h(i3);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i3) {
        if (getChildCount() <= 0) {
            super.addView(view, i3);
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
    public final void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i3, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void setOnScrollChangeListener(g gVar) {
    }
}
