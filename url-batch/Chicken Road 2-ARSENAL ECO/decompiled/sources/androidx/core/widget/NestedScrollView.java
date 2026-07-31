package androidx.core.widget;

import D.AbstractC0104q;
import D.AbstractC0108v;
import D.AbstractC0112z;
import D.C0088a;
import D.C0089b;
import D.C0090c;
import D.C0102o;
import D.C0105s;
import D.D;
import D.F;
import D.G;
import D.H;
import D.InterfaceC0100m;
import D.InterfaceC0101n;
import D.r;
import D3.M;
import I.d;
import I.g;
import I.h;
import I.i;
import I.k;
import I4.e;
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
import com.onesignal.core.internal.backend.impl.a;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import u0.AbstractC0676f;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0101n {

    /* renamed from: G, reason: collision with root package name */
    public static final float f3417G = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: H, reason: collision with root package name */
    public static final g f3418H = new g();

    /* renamed from: I, reason: collision with root package name */
    public static final int[] f3419I = {R.attr.fillViewport};

    /* renamed from: A, reason: collision with root package name */
    public int f3420A;

    /* renamed from: B, reason: collision with root package name */
    public k f3421B;

    /* renamed from: C, reason: collision with root package name */
    public final C0102o f3422C;

    /* renamed from: D, reason: collision with root package name */
    public final e f3423D;

    /* renamed from: E, reason: collision with root package name */
    public float f3424E;

    /* renamed from: F, reason: collision with root package name */
    public final C0090c f3425F;

    /* renamed from: f, reason: collision with root package name */
    public final float f3426f;

    /* renamed from: g, reason: collision with root package name */
    public long f3427g;

    /* renamed from: h, reason: collision with root package name */
    public final Rect f3428h;

    /* renamed from: i, reason: collision with root package name */
    public final OverScroller f3429i;

    /* renamed from: j, reason: collision with root package name */
    public final EdgeEffect f3430j;

    /* renamed from: k, reason: collision with root package name */
    public final EdgeEffect f3431k;

    /* renamed from: l, reason: collision with root package name */
    public int f3432l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3433m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3434n;

    /* renamed from: o, reason: collision with root package name */
    public View f3435o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3436p;

    /* renamed from: q, reason: collision with root package name */
    public VelocityTracker f3437q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3438r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3439s;

    /* renamed from: t, reason: collision with root package name */
    public final int f3440t;

    /* renamed from: u, reason: collision with root package name */
    public final int f3441u;

    /* renamed from: v, reason: collision with root package name */
    public final int f3442v;

    /* renamed from: w, reason: collision with root package name */
    public int f3443w;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f3444x;
    public final int[] y;

    /* renamed from: z, reason: collision with root package name */
    public int f3445z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.strategylink.Row.Five.R.attr.nestedScrollViewStyle);
        View.AccessibilityDelegate accessibilityDelegate;
        this.f3428h = new Rect();
        this.f3433m = true;
        this.f3434n = false;
        this.f3435o = null;
        this.f3436p = false;
        this.f3439s = true;
        this.f3443w = -1;
        this.f3444x = new int[2];
        this.y = new int[2];
        this.f3425F = new C0090c(getContext(), new M(7, this));
        int i7 = Build.VERSION.SDK_INT;
        this.f3430j = i7 >= 31 ? d.a(context, attributeSet) : new EdgeEffect(context);
        this.f3431k = i7 >= 31 ? d.a(context, attributeSet) : new EdgeEffect(context);
        this.f3426f = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f3429i = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f3440t = viewConfiguration.getScaledTouchSlop();
        this.f3441u = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3442v = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3419I, com.strategylink.Row.Five.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f3422C = new C0102o();
        this.f3423D = new e(this);
        setNestedScrollingEnabled(true);
        C0089b c0089b = f3418H;
        if (c0089b == null) {
            if (i7 >= 29) {
                Field field = D.f240a;
                accessibilityDelegate = AbstractC0112z.a(this);
            } else {
                if (!D.f241b) {
                    if (D.f240a == null) {
                        try {
                            Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                            D.f240a = declaredField;
                            declaredField.setAccessible(true);
                        } catch (Throwable unused) {
                            D.f241b = true;
                        }
                    }
                    try {
                        Object obj = D.f240a.get(this);
                        if (obj instanceof View.AccessibilityDelegate) {
                            accessibilityDelegate = (View.AccessibilityDelegate) obj;
                        }
                    } catch (Throwable unused2) {
                        D.f241b = true;
                    }
                }
                accessibilityDelegate = null;
            }
            if (accessibilityDelegate instanceof C0088a) {
                c0089b = new C0089b();
            }
        }
        Field field2 = D.f240a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        setAccessibilityDelegate(c0089b != null ? c0089b.f277b : null);
    }

    public static boolean k(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && k((View) parent, nestedScrollView);
    }

    @Override // D.InterfaceC0100m
    public final void a(View view, View view2, int i7, int i8) {
        C0102o c0102o = this.f3422C;
        if (i8 == 1) {
            c0102o.f300b = i7;
        } else {
            c0102o.f299a = i7;
        }
        u(2, i8);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // D.InterfaceC0100m
    public final void b(View view, int i7) {
        C0102o c0102o = this.f3422C;
        if (i7 == 1) {
            c0102o.f300b = 0;
        } else {
            c0102o.f299a = 0;
        }
        w(i7);
    }

    @Override // D.InterfaceC0101n
    public final void c(NestedScrollView nestedScrollView, int i7, int i8, int i9, int i10, int i11, int[] iArr) {
        m(i10, i11, iArr);
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
        int i7;
        if (this.f3429i.isFinished()) {
            return;
        }
        this.f3429i.computeScrollOffset();
        int currY = this.f3429i.getCurrY();
        int i8 = currY - this.f3420A;
        int height = getHeight();
        EdgeEffect edgeEffect = this.f3430j;
        EdgeEffect edgeEffect2 = this.f3431k;
        if (i8 <= 0 || AbstractC0676f.j(edgeEffect) == 0.0f) {
            if (i8 < 0 && AbstractC0676f.j(edgeEffect2) != 0.0f) {
                float f7 = height;
                round = Math.round(AbstractC0676f.o(edgeEffect2, (i8 * 4.0f) / f7, 0.5f) * (f7 / 4.0f));
                if (round != i8) {
                    edgeEffect2.finish();
                }
            }
            int i9 = i8;
            this.f3420A = currY;
            int[] iArr = this.y;
            iArr[1] = 0;
            this.f3423D.b(0, i9, iArr, null, 1);
            i7 = i9 - iArr[1];
            int scrollRange = getScrollRange();
            if (i7 != 0) {
                int scrollY = getScrollY();
                o(i7, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i10 = i7 - scrollY2;
                iArr[1] = 0;
                this.f3423D.c(0, scrollY2, 0, i10, this.f3444x, 1, iArr);
                i7 = i10 - iArr[1];
            }
            if (i7 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i7 < 0) {
                        if (edgeEffect.isFinished()) {
                            edgeEffect.onAbsorb((int) this.f3429i.getCurrVelocity());
                        }
                    } else if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) this.f3429i.getCurrVelocity());
                    }
                }
                this.f3429i.abortAnimation();
                w(1);
            }
            if (this.f3429i.isFinished()) {
                postInvalidateOnAnimation();
                return;
            } else {
                w(1);
                return;
            }
        }
        round = Math.round(AbstractC0676f.o(edgeEffect, ((-i8) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (round != i8) {
            edgeEffect.finish();
        }
        i8 -= round;
        int i92 = i8;
        this.f3420A = currY;
        int[] iArr2 = this.y;
        iArr2[1] = 0;
        this.f3423D.b(0, i92, iArr2, null, 1);
        i7 = i92 - iArr2[1];
        int scrollRange2 = getScrollRange();
        if (i7 != 0) {
        }
        if (i7 != 0) {
        }
        if (this.f3429i.isFinished()) {
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

    @Override // D.InterfaceC0100m
    public final void d(int i7, int i8, int[] iArr, int i9) {
        this.f3423D.b(i7, i8, iArr, null, i9);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00cb A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z5;
        if (!super.dispatchKeyEvent(keyEvent)) {
            this.f3428h.setEmpty();
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                    if (keyEvent.getAction() == 0) {
                        int keyCode = keyEvent.getKeyCode();
                        if (keyCode == 19) {
                            z5 = keyEvent.isAltPressed() ? j(33) : g(33);
                        } else if (keyCode == 20) {
                            z5 = keyEvent.isAltPressed() ? j(130) : g(130);
                        } else if (keyCode == 62) {
                            p(keyEvent.isShiftPressed() ? 33 : 130);
                        } else if (keyCode == 92) {
                            z5 = j(33);
                        } else if (keyCode == 93) {
                            z5 = j(130);
                        } else if (keyCode == 122) {
                            p(33);
                        } else if (keyCode == 123) {
                            p(130);
                        }
                        if (z5) {
                            return false;
                        }
                    }
                    z5 = false;
                    if (z5) {
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
                    z5 = true;
                    if (z5) {
                    }
                }
            }
            z5 = false;
            if (z5) {
            }
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f7, float f8, boolean z5) {
        ViewParent d7;
        e eVar = this.f3423D;
        if (eVar.f1209a && (d7 = eVar.d(0)) != null) {
            try {
                return H.a(d7, (NestedScrollView) eVar.f1212d, f7, f8, z5);
            } catch (AbstractMethodError e4) {
                Log.e("ViewParentCompat", "ViewParent " + d7 + " does not implement interface method onNestedFling", e4);
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f7, float f8) {
        return this.f3423D.a(f7, f8);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i7, int i8, int[] iArr, int[] iArr2) {
        return this.f3423D.b(i7, i8, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i7, int i8, int i9, int i10, int[] iArr) {
        return this.f3423D.c(i7, i8, i9, i10, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i7;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f3430j;
        int i8 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (h.a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                i7 = getPaddingLeft();
            } else {
                i7 = 0;
            }
            if (h.a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate(i7, min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.f3431k;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getScrollRange(), scrollY) + height2;
        if (h.a(this)) {
            width2 -= getPaddingRight() + getPaddingLeft();
            i8 = getPaddingLeft();
        }
        if (h.a(this)) {
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

    @Override // D.InterfaceC0100m
    public final void e(NestedScrollView nestedScrollView, int i7, int i8, int i9, int i10, int i11) {
        m(i10, i11, null);
    }

    @Override // D.InterfaceC0100m
    public final boolean f(View view, View view2, int i7, int i8) {
        return (i7 & 2) != 0;
    }

    public final boolean g(int i7) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i7);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !l(findNextFocus, maxScrollAmount, getHeight())) {
            if (i7 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i7 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i7 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            r(maxScrollAmount, 0, 1, true);
        } else {
            Rect rect = this.f3428h;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            r(h(rect), 0, 1, true);
            findNextFocus.requestFocus(i7);
        }
        if (findFocus != null && findFocus.isFocused() && !l(findFocus, 0, getHeight())) {
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
        C0102o c0102o = this.f3422C;
        return c0102o.f300b | c0102o.f299a;
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
        if (this.f3424E == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f3424E = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f3424E;
    }

    public final int h(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i7 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i8 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i7 - verticalFadingEdgeLength : i7;
        int i9 = rect.bottom;
        if (i9 > i8 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i8, (childAt.getBottom() + layoutParams.bottomMargin) - i7);
        }
        if (rect.top >= scrollY || i9 >= i8) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i8 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f3423D.d(0) != null;
    }

    public final void i(int i7) {
        if (getChildCount() > 0) {
            this.f3429i.fling(getScrollX(), getScrollY(), 0, i7, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            u(2, 1);
            this.f3420A = getScrollY();
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f3423D.f1209a;
    }

    public final boolean j(int i7) {
        int childCount;
        boolean z5 = i7 == 130;
        int height = getHeight();
        Rect rect = this.f3428h;
        rect.top = 0;
        rect.bottom = height;
        if (z5 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return q(i7, rect.top, rect.bottom);
    }

    public final boolean l(View view, int i7, int i8) {
        Rect rect = this.f3428h;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i7 >= getScrollY() && rect.top - i7 <= getScrollY() + i8;
    }

    public final void m(int i7, int i8, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i7);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f3423D.c(0, scrollY2, 0, i7 - scrollY2, null, i8, iArr);
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i7, int i8) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i7, int i8, int i9, int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i8, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3443w) {
            int i7 = actionIndex == 0 ? 1 : 0;
            this.f3432l = (int) motionEvent.getY(i7);
            this.f3443w = motionEvent.getPointerId(i7);
            VelocityTracker velocityTracker = this.f3437q;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean o(int i7, int i8, int i9, int i10) {
        int i11;
        boolean z5;
        int i12;
        boolean z6;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i13 = i9 + i7;
        if (i8 <= 0 && i8 >= 0) {
            i11 = i8;
            z5 = false;
        } else {
            i11 = 0;
            z5 = true;
        }
        if (i13 > i10) {
            i12 = i10;
        } else {
            if (i13 >= 0) {
                i12 = i13;
                z6 = false;
                if (z6 && this.f3423D.d(1) == null) {
                    this.f3429i.springBack(i11, i12, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i11, i12);
                return !z5 || z6;
            }
            i12 = 0;
        }
        z6 = true;
        if (z6) {
            this.f3429i.springBack(i11, i12, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i11, i12);
        if (z5) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3434n = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x011c, code lost:
    
        if (r0 >= 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x00d1, code lost:
    
        if (r4 >= 0) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02a3  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f7;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z5;
        int i12;
        float f8;
        float f9;
        long j4;
        float f10;
        float sqrt;
        int i13;
        int i14;
        float f11;
        if (motionEvent.getAction() != 8 || this.f3436p) {
            return false;
        }
        if ((motionEvent.getSource() & 2) == 2) {
            i7 = 9;
            f7 = motionEvent.getAxisValue(9);
            i8 = (int) motionEvent.getX();
        } else if ((motionEvent.getSource() & 4194304) == 4194304) {
            f7 = motionEvent.getAxisValue(26);
            i8 = getWidth() / 2;
            i7 = 26;
        } else {
            f7 = 0.0f;
            i7 = 0;
            i8 = 0;
        }
        if (f7 == 0.0f) {
            return false;
        }
        r(-((int) (getVerticalScrollFactorCompat() * f7)), i8, 1, (motionEvent.getSource() & 8194) == 8194);
        if (i7 == 0) {
            return true;
        }
        C0090c c0090c = this.f3425F;
        NestedScrollView nestedScrollView = (NestedScrollView) c0090c.f281b.f401g;
        int[] iArr = c0090c.f287h;
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        int i15 = 1;
        if (c0090c.f285f == source && c0090c.f286g == deviceId && c0090c.f284e == i7) {
            z5 = false;
            i9 = 0;
        } else {
            Context context = c0090c.f280a;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int deviceId2 = motionEvent.getDeviceId();
            i9 = 0;
            int source2 = motionEvent.getSource();
            int i16 = Build.VERSION.SDK_INT;
            if (i16 >= 34) {
                int i17 = G.f242a;
                i10 = F.b(viewConfiguration, deviceId2, i7, source2);
            } else {
                int i18 = G.f242a;
                InputDevice device = InputDevice.getDevice(deviceId2);
                if (device != null && device.getMotionRange(i7, source2) != null) {
                    Resources resources = context.getResources();
                    int identifier = (source2 == 4194304 && i7 == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", a.TURBINE_FEATURES_PLATFORM_ANDROID) : -1;
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
            if (i16 >= 34) {
                i11 = F.a(viewConfiguration, deviceId3, i7, source3);
            } else {
                InputDevice device2 = InputDevice.getDevice(deviceId3);
                if (device2 != null && device2.getMotionRange(i7, source3) != null) {
                    Resources resources2 = context.getResources();
                    int identifier2 = (source3 == 4194304 && i7 == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", a.TURBINE_FEATURES_PLATFORM_ANDROID) : -1;
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
            c0090c.f285f = source;
            c0090c.f286g = deviceId;
            c0090c.f284e = i7;
            z5 = true;
        }
        if (iArr[i9] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = c0090c.f282c;
            if (velocityTracker == null) {
                return true;
            }
            velocityTracker.recycle();
            c0090c.f282c = null;
            return true;
        }
        if (c0090c.f282c == null) {
            c0090c.f282c = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker2 = c0090c.f282c;
        Map map = r.f301a;
        velocityTracker2.addMovement(motionEvent);
        int i19 = 20;
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            Map map2 = r.f301a;
            if (!map2.containsKey(velocityTracker2)) {
                map2.put(velocityTracker2, new C0105s());
            }
            C0105s c0105s = (C0105s) map2.get(velocityTracker2);
            long[] jArr = c0105s.f303b;
            long eventTime = motionEvent.getEventTime();
            if (c0105s.f305d != 0 && eventTime - jArr[c0105s.f306e] > 40) {
                c0105s.f305d = i9;
                c0105s.f304c = 0.0f;
            }
            int i20 = (c0105s.f306e + 1) % 20;
            c0105s.f306e = i20;
            int i21 = c0105s.f305d;
            if (i21 != 20) {
                c0105s.f305d = i21 + 1;
            }
            c0105s.f302a[i20] = motionEvent.getAxisValue(26);
            jArr[c0105s.f306e] = eventTime;
        }
        velocityTracker2.computeCurrentVelocity(1000, Float.MAX_VALUE);
        C0105s c0105s2 = (C0105s) r.f301a.get(velocityTracker2);
        if (c0105s2 != null) {
            float[] fArr = c0105s2.f302a;
            long[] jArr2 = c0105s2.f303b;
            int i22 = c0105s2.f305d;
            if (i22 >= 2) {
                int i23 = c0105s2.f306e;
                int i24 = ((i23 + 20) - (i22 - 1)) % 20;
                long j7 = jArr2[i23];
                while (true) {
                    j4 = jArr2[i24];
                    if (j7 - j4 <= 100) {
                        break;
                    }
                    c0105s2.f305d--;
                    i24 = (i24 + 1) % 20;
                }
                int i25 = c0105s2.f305d;
                if (i25 >= 2) {
                    if (i25 == 2) {
                        int i26 = (i24 + 1) % 20;
                        if (j4 != jArr2[i26]) {
                            i12 = i7;
                            f10 = Float.MAX_VALUE;
                            i13 = 1000;
                            sqrt = fArr[i26] / (r12 - j4);
                        }
                    } else {
                        f10 = Float.MAX_VALUE;
                        float f12 = 0.0f;
                        int i27 = 0;
                        int i28 = 0;
                        while (true) {
                            if (i27 >= c0105s2.f305d - 1) {
                                break;
                            }
                            int i29 = i27 + i24;
                            long j8 = jArr2[i29 % 20];
                            int i30 = (i29 + 1) % i19;
                            if (jArr2[i30] == j8) {
                                i14 = i7;
                            } else {
                                i28++;
                                i14 = i7;
                                float sqrt2 = (f12 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f12) * 2.0f));
                                float f13 = fArr[i30] / (jArr2[i30] - j8);
                                float abs = (Math.abs(f13) * (f13 - sqrt2)) + f12;
                                if (i28 == i15) {
                                    abs *= 0.5f;
                                }
                                f12 = abs;
                            }
                            i27++;
                            i7 = i14;
                            i19 = 20;
                            i15 = 1;
                        }
                        i12 = i7;
                        sqrt = ((float) Math.sqrt(Math.abs(f12) * 2.0f)) * (f12 < 0.0f ? -1.0f : 1.0f);
                        i13 = 1000;
                    }
                    f11 = sqrt * i13;
                    c0105s2.f304c = f11;
                    if (f11 >= (-Math.abs(f10))) {
                        c0105s2.f304c = -Math.abs(f10);
                    } else if (c0105s2.f304c > Math.abs(f10)) {
                        c0105s2.f304c = Math.abs(f10);
                    }
                }
            }
            i12 = i7;
            f10 = Float.MAX_VALUE;
            i13 = 1000;
            sqrt = 0.0f;
            f11 = sqrt * i13;
            c0105s2.f304c = f11;
            if (f11 >= (-Math.abs(f10))) {
            }
        } else {
            i12 = i7;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            f8 = AbstractC0104q.a(velocityTracker2, i12);
        } else {
            int i31 = i12;
            if (i31 == 0) {
                f8 = velocityTracker2.getXVelocity();
            } else if (i31 == 1) {
                f8 = velocityTracker2.getYVelocity();
            } else {
                C0105s c0105s3 = (C0105s) r.f301a.get(velocityTracker2);
                f8 = (c0105s3 == null || i31 != 26) ? 0.0f : c0105s3.f304c;
            }
        }
        float f14 = f8 * (-nestedScrollView.getVerticalScrollFactorCompat());
        float signum = Math.signum(f14);
        if (z5 || (signum != Math.signum(c0090c.f283d) && signum != 0.0f)) {
            nestedScrollView.f3429i.abortAnimation();
        }
        if (Math.abs(f14) < iArr[0]) {
            return true;
        }
        float max = Math.max(-r1, Math.min(f14, iArr[1]));
        if (max == 0.0f) {
            f9 = 0.0f;
        } else {
            nestedScrollView.f3429i.abortAnimation();
            nestedScrollView.i((int) max);
            f9 = max;
        }
        c0090c.f283d = f9;
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z5 = true;
        if (action == 2 && this.f3436p) {
            return true;
        }
        int i7 = action & 255;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    int i8 = this.f3443w;
                    if (i8 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i8);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i8 + " in onInterceptTouchEvent");
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y - this.f3432l) > this.f3440t && (2 & getNestedScrollAxes()) == 0) {
                                this.f3436p = true;
                                this.f3432l = y;
                                if (this.f3437q == null) {
                                    this.f3437q = VelocityTracker.obtain();
                                }
                                this.f3437q.addMovement(motionEvent);
                                this.f3445z = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i7 != 3) {
                    if (i7 == 6) {
                        n(motionEvent);
                    }
                }
            }
            this.f3436p = false;
            this.f3443w = -1;
            VelocityTracker velocityTracker = this.f3437q;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f3437q = null;
            }
            if (this.f3429i.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            w(0);
        } else {
            int y6 = (int) motionEvent.getY();
            int x6 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y6 >= childAt.getTop() - scrollY && y6 < childAt.getBottom() - scrollY && x6 >= childAt.getLeft() && x6 < childAt.getRight()) {
                    this.f3432l = y6;
                    this.f3443w = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.f3437q;
                    if (velocityTracker2 == null) {
                        this.f3437q = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f3437q.addMovement(motionEvent);
                    this.f3429i.computeScrollOffset();
                    if (!v(motionEvent) && this.f3429i.isFinished()) {
                        z5 = false;
                    }
                    this.f3436p = z5;
                    u(2, 0);
                }
            }
            if (!v(motionEvent) && this.f3429i.isFinished()) {
                z5 = false;
            }
            this.f3436p = z5;
            VelocityTracker velocityTracker3 = this.f3437q;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f3437q = null;
            }
        }
        return this.f3436p;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i7, int i8, int i9, int i10) {
        int i11;
        super.onLayout(z5, i7, i8, i9, i10);
        int i12 = 0;
        this.f3433m = false;
        View view = this.f3435o;
        if (view != null && k(view, this)) {
            View view2 = this.f3435o;
            Rect rect = this.f3428h;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h7 = h(rect);
            if (h7 != 0) {
                scrollBy(0, h7);
            }
        }
        this.f3435o = null;
        if (!this.f3434n) {
            if (this.f3421B != null) {
                scrollTo(getScrollX(), this.f3421B.f1153f);
                this.f3421B = null;
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
        this.f3434n = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        if (this.f3438r && View.MeasureSpec.getMode(i8) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f7, float f8, boolean z5) {
        if (z5) {
            return false;
        }
        dispatchNestedFling(0.0f, f8, true);
        i((int) f8);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f7, float f8) {
        return this.f3423D.a(f7, f8);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i7, int i8, int[] iArr) {
        this.f3423D.b(i7, i8, iArr, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i7, int i8, int i9, int i10) {
        m(i10, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i7) {
        a(view, view2, i7, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i7, int i8, boolean z5, boolean z6) {
        super.scrollTo(i7, i8);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i7, Rect rect) {
        if (i7 == 2) {
            i7 = 130;
        } else if (i7 == 1) {
            i7 = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i7) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i7);
        if (findNextFocus != null && l(findNextFocus, 0, getHeight())) {
            return findNextFocus.requestFocus(i7, rect);
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
        this.f3421B = kVar;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        k kVar = new k(super.onSaveInstanceState());
        kVar.f1153f = getScrollY();
        return kVar;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i7, int i8, int i9, int i10) {
        super.onScrollChanged(i7, i8, i9, i10);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !l(findFocus, 0, i10)) {
            return;
        }
        Rect rect = this.f3428h;
        findFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(findFocus, rect);
        int h7 = h(rect);
        if (h7 != 0) {
            if (this.f3439s) {
                t(0, h7, false);
            } else {
                scrollBy(0, h7);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i7) {
        return f(view, view2, i7, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        b(view, 0);
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
        float o7;
        int round;
        int i7;
        ViewParent parent2;
        if (this.f3437q == null) {
            this.f3437q = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f3445z = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float f7 = 0.0f;
        obtain.offsetLocation(0.0f, this.f3445z);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f3430j;
            EdgeEffect edgeEffect2 = this.f3431k;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f3437q;
                velocityTracker.computeCurrentVelocity(1000, this.f3442v);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f3443w);
                if (Math.abs(yVelocity) >= this.f3441u) {
                    if (AbstractC0676f.j(edgeEffect) != 0.0f) {
                        if (s(edgeEffect, yVelocity)) {
                            edgeEffect.onAbsorb(yVelocity);
                        } else {
                            i(-yVelocity);
                        }
                    } else if (AbstractC0676f.j(edgeEffect2) != 0.0f) {
                        int i8 = -yVelocity;
                        if (s(edgeEffect2, i8)) {
                            edgeEffect2.onAbsorb(i8);
                        } else {
                            i(i8);
                        }
                    } else {
                        int i9 = -yVelocity;
                        float f8 = i9;
                        if (!this.f3423D.a(0.0f, f8)) {
                            dispatchNestedFling(0.0f, f8, true);
                            i(i9);
                        }
                    }
                } else if (this.f3429i.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f3443w = -1;
                this.f3436p = false;
                VelocityTracker velocityTracker2 = this.f3437q;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f3437q = null;
                }
                w(0);
                this.f3430j.onRelease();
                this.f3431k.onRelease();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f3443w);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f3443w + " in onTouchEvent");
                } else {
                    int y = (int) motionEvent.getY(findPointerIndex);
                    int i10 = this.f3432l - y;
                    float x6 = motionEvent.getX(findPointerIndex) / getWidth();
                    float height = i10 / getHeight();
                    if (AbstractC0676f.j(edgeEffect) != 0.0f) {
                        o7 = -AbstractC0676f.o(edgeEffect, -height, x6);
                        if (AbstractC0676f.j(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                    } else {
                        if (AbstractC0676f.j(edgeEffect2) != 0.0f) {
                            o7 = AbstractC0676f.o(edgeEffect2, height, 1.0f - x6);
                            if (AbstractC0676f.j(edgeEffect2) == 0.0f) {
                                edgeEffect2.onRelease();
                            }
                        }
                        round = Math.round(f7 * getHeight());
                        if (round != 0) {
                            invalidate();
                        }
                        i7 = i10 - round;
                        if (!this.f3436p && Math.abs(i7) > this.f3440t) {
                            parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.f3436p = true;
                            i7 = i7 <= 0 ? i7 - this.f3440t : i7 + this.f3440t;
                        }
                        if (this.f3436p) {
                            int r6 = r(i7, (int) motionEvent.getX(findPointerIndex), 0, false);
                            this.f3432l = y - r6;
                            this.f3445z += r6;
                        }
                    }
                    f7 = o7;
                    round = Math.round(f7 * getHeight());
                    if (round != 0) {
                    }
                    i7 = i10 - round;
                    if (!this.f3436p) {
                        parent2 = getParent();
                        if (parent2 != null) {
                        }
                        this.f3436p = true;
                        if (i7 <= 0) {
                        }
                    }
                    if (this.f3436p) {
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f3436p && getChildCount() > 0) {
                    if (this.f3429i.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        postInvalidateOnAnimation();
                    }
                }
                this.f3443w = -1;
                this.f3436p = false;
                VelocityTracker velocityTracker3 = this.f3437q;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f3437q = null;
                }
                w(0);
                this.f3430j.onRelease();
                this.f3431k.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f3432l = (int) motionEvent.getY(actionIndex);
                this.f3443w = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                n(motionEvent);
                this.f3432l = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f3443w));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f3436p && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f3429i.isFinished()) {
                this.f3429i.abortAnimation();
                w(1);
            }
            int y6 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f3432l = y6;
            this.f3443w = pointerId;
            u(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f3437q;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public final void p(int i7) {
        boolean z5 = i7 == 130;
        int height = getHeight();
        Rect rect = this.f3428h;
        if (z5) {
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
        q(i7, i8, i9);
    }

    public final boolean q(int i7, int i8, int i9) {
        boolean z5;
        int height = getHeight();
        int scrollY = getScrollY();
        int i10 = height + scrollY;
        boolean z6 = i7 == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z7 = false;
        for (int i11 = 0; i11 < size; i11++) {
            View view2 = focusables.get(i11);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i8 < bottom && top < i9) {
                boolean z8 = i8 < top && bottom < i9;
                if (view == null) {
                    view = view2;
                    z7 = z8;
                } else {
                    boolean z9 = (z6 && top < view.getTop()) || (!z6 && bottom > view.getBottom());
                    if (z7) {
                        if (z8) {
                            if (!z9) {
                            }
                            view = view2;
                        }
                    } else if (z8) {
                        view = view2;
                        z7 = true;
                    } else {
                        if (!z9) {
                        }
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i8 < scrollY || i9 > i10) {
            r(z6 ? i8 - scrollY : i9 - i10, 0, 1, true);
            z5 = true;
        } else {
            z5 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i7);
        }
        return z5;
    }

    public final int r(int i7, int i8, int i9, boolean z5) {
        int i10;
        int i11;
        boolean z6;
        VelocityTracker velocityTracker;
        if (i9 == 1) {
            u(2, i9);
        }
        boolean b7 = this.f3423D.b(0, i7, this.y, this.f3444x, i9);
        int[] iArr = this.f3444x;
        int[] iArr2 = this.y;
        if (b7) {
            i10 = i7 - iArr2[1];
            i11 = iArr[1];
        } else {
            i10 = i7;
            i11 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z7 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z5;
        boolean z8 = o(i10, 0, scrollY, scrollRange) && this.f3423D.d(i9) == null;
        int scrollY2 = getScrollY() - scrollY;
        iArr2[1] = 0;
        this.f3423D.c(0, scrollY2, 0, i10 - scrollY2, this.f3444x, i9, iArr2);
        int i12 = i11 + iArr[1];
        int i13 = i10 - iArr2[1];
        int i14 = scrollY + i13;
        EdgeEffect edgeEffect = this.f3431k;
        EdgeEffect edgeEffect2 = this.f3430j;
        if (i14 < 0) {
            if (z7) {
                AbstractC0676f.o(edgeEffect2, (-i13) / getHeight(), i8 / getWidth());
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i14 > scrollRange && z7) {
            AbstractC0676f.o(edgeEffect, i13 / getHeight(), 1.0f - (i8 / getWidth()));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (edgeEffect2.isFinished() && edgeEffect.isFinished()) {
            z6 = z8;
        } else {
            postInvalidateOnAnimation();
            z6 = false;
        }
        if (z6 && i9 == 0 && (velocityTracker = this.f3437q) != null) {
            velocityTracker.clear();
        }
        if (i9 == 1) {
            w(i9);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i12;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f3433m) {
            this.f3435o = view2;
        } else {
            Rect rect = this.f3428h;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h7 = h(rect);
            if (h7 != 0) {
                scrollBy(0, h7);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z5) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int h7 = h(rect);
        boolean z6 = h7 != 0;
        if (z6) {
            if (z5) {
                scrollBy(0, h7);
                return z6;
            }
            t(0, h7, false);
        }
        return z6;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z5) {
        VelocityTracker velocityTracker;
        if (z5 && (velocityTracker = this.f3437q) != null) {
            velocityTracker.recycle();
            this.f3437q = null;
        }
        super.requestDisallowInterceptTouchEvent(z5);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f3433m = true;
        super.requestLayout();
    }

    public final boolean s(EdgeEffect edgeEffect, int i7) {
        if (i7 > 0) {
            return true;
        }
        float j4 = AbstractC0676f.j(edgeEffect) * getHeight();
        float abs = Math.abs(-i7) * 0.35f;
        float f7 = this.f3426f * 0.015f;
        double log = Math.log(abs / f7);
        double d7 = f3417G;
        return ((float) (Math.exp((d7 / (d7 - 1.0d)) * log) * ((double) f7))) < j4;
    }

    @Override // android.view.View
    public final void scrollTo(int i7, int i8) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i7 < 0) {
                i7 = 0;
            } else if (width + i7 > width2) {
                i7 = width2 - width;
            }
            if (height >= height2 || i8 < 0) {
                i8 = 0;
            } else if (height + i8 > height2) {
                i8 = height2 - height;
            }
            if (i7 == getScrollX() && i8 == getScrollY()) {
                return;
            }
            super.scrollTo(i7, i8);
        }
    }

    public void setFillViewport(boolean z5) {
        if (z5 != this.f3438r) {
            this.f3438r = z5;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z5) {
        e eVar = this.f3423D;
        if (eVar.f1209a) {
            NestedScrollView nestedScrollView = (NestedScrollView) eVar.f1212d;
            Field field = D.f240a;
            AbstractC0108v.z(nestedScrollView);
        }
        eVar.f1209a = z5;
    }

    public void setSmoothScrollingEnabled(boolean z5) {
        this.f3439s = z5;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i7) {
        return u(i7, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        w(0);
    }

    public final void t(int i7, int i8, boolean z5) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f3427g > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int max = Math.max(0, Math.min(i8 + scrollY, Math.max(0, height - height2))) - scrollY;
            this.f3429i.startScroll(getScrollX(), scrollY, 0, max, 250);
            if (z5) {
                u(2, 1);
            } else {
                w(1);
            }
            this.f3420A = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f3429i.isFinished()) {
                this.f3429i.abortAnimation();
                w(1);
            }
            scrollBy(i7, i8);
        }
        this.f3427g = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean u(int i7, int i8) {
        boolean f7;
        e eVar = this.f3423D;
        NestedScrollView nestedScrollView = (NestedScrollView) eVar.f1212d;
        if (eVar.d(i8) != null) {
            return true;
        }
        if (eVar.f1209a) {
            View view = nestedScrollView;
            for (ViewParent parent = nestedScrollView.getParent(); parent != null; parent = parent.getParent()) {
                boolean z5 = parent instanceof InterfaceC0100m;
                if (z5) {
                    f7 = ((InterfaceC0100m) parent).f(view, nestedScrollView, i7, i8);
                } else {
                    if (i8 == 0) {
                        try {
                            f7 = H.f(parent, view, nestedScrollView, i7);
                        } catch (AbstractMethodError e4) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e4);
                        }
                    }
                    f7 = false;
                }
                if (f7) {
                    if (i8 == 0) {
                        eVar.f1210b = parent;
                    } else if (i8 == 1) {
                        eVar.f1211c = parent;
                    }
                    if (z5) {
                        ((InterfaceC0100m) parent).a(view, nestedScrollView, i7, i8);
                        return true;
                    }
                    if (i8 != 0) {
                        return true;
                    }
                    try {
                        H.e(parent, view, nestedScrollView, i7);
                        return true;
                    } catch (AbstractMethodError e7) {
                        Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e7);
                        return true;
                    }
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    public final boolean v(MotionEvent motionEvent) {
        boolean z5;
        EdgeEffect edgeEffect = this.f3430j;
        if (AbstractC0676f.j(edgeEffect) != 0.0f) {
            AbstractC0676f.o(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z5 = true;
        } else {
            z5 = false;
        }
        EdgeEffect edgeEffect2 = this.f3431k;
        if (AbstractC0676f.j(edgeEffect2) == 0.0f) {
            return z5;
        }
        AbstractC0676f.o(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void w(int i7) {
        e eVar = this.f3423D;
        ViewParent d7 = eVar.d(i7);
        if (d7 != null) {
            NestedScrollView nestedScrollView = (NestedScrollView) eVar.f1212d;
            if (d7 instanceof InterfaceC0100m) {
                ((InterfaceC0100m) d7).b(nestedScrollView, i7);
            } else if (i7 == 0) {
                try {
                    H.g(d7, nestedScrollView);
                } catch (AbstractMethodError e4) {
                    Log.e("ViewParentCompat", "ViewParent " + d7 + " does not implement interface method onStopNestedScroll", e4);
                }
            }
            if (i7 == 0) {
                eVar.f1210b = null;
            } else {
                if (i7 != 1) {
                    return;
                }
                eVar.f1211c = null;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7) {
        if (getChildCount() <= 0) {
            super.addView(view, i7);
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
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i7, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void setOnScrollChangeListener(i iVar) {
    }
}
