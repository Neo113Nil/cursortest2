package androidx.core.widget;

import B.f;
import I.A;
import I.B;
import I.C;
import I.C0111g;
import I.C0121q;
import I.C0123t;
import I.D;
import I.InterfaceC0122s;
import I.T;
import I.U;
import L.b;
import L.d;
import L.e;
import L.g;
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
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0122s {

    /* renamed from: K, reason: collision with root package name */
    public static final float f3377K = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: L, reason: collision with root package name */
    public static final d f3378L = new d();

    /* renamed from: M, reason: collision with root package name */
    public static final int[] f3379M = {R.attr.fillViewport};

    /* renamed from: A, reason: collision with root package name */
    public int f3380A;

    /* renamed from: B, reason: collision with root package name */
    public final int[] f3381B;

    /* renamed from: C, reason: collision with root package name */
    public final int[] f3382C;

    /* renamed from: D, reason: collision with root package name */
    public int f3383D;

    /* renamed from: E, reason: collision with root package name */
    public int f3384E;

    /* renamed from: F, reason: collision with root package name */
    public g f3385F;

    /* renamed from: G, reason: collision with root package name */
    public final C0123t f3386G;

    /* renamed from: H, reason: collision with root package name */
    public final C0121q f3387H;

    /* renamed from: I, reason: collision with root package name */
    public float f3388I;

    /* renamed from: J, reason: collision with root package name */
    public final C0111g f3389J;

    /* renamed from: d, reason: collision with root package name */
    public final float f3390d;

    /* renamed from: e, reason: collision with root package name */
    public long f3391e;

    /* renamed from: i, reason: collision with root package name */
    public final Rect f3392i;

    /* renamed from: l, reason: collision with root package name */
    public final OverScroller f3393l;

    /* renamed from: m, reason: collision with root package name */
    public final EdgeEffect f3394m;

    /* renamed from: n, reason: collision with root package name */
    public final EdgeEffect f3395n;

    /* renamed from: o, reason: collision with root package name */
    public A f3396o;

    /* renamed from: p, reason: collision with root package name */
    public int f3397p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3398q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3399r;

    /* renamed from: s, reason: collision with root package name */
    public View f3400s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f3401t;

    /* renamed from: u, reason: collision with root package name */
    public VelocityTracker f3402u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f3403v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f3404w;

    /* renamed from: x, reason: collision with root package name */
    public final int f3405x;

    /* renamed from: y, reason: collision with root package name */
    public final int f3406y;

    /* renamed from: z, reason: collision with root package name */
    public final int f3407z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.icefishing.icefish.ice.fishing.s294s.R.attr.nestedScrollViewStyle);
        this.f3392i = new Rect();
        this.f3398q = true;
        this.f3399r = false;
        this.f3400s = null;
        this.f3401t = false;
        this.f3404w = true;
        this.f3380A = -1;
        this.f3381B = new int[2];
        this.f3382C = new int[2];
        this.f3389J = new C0111g(getContext(), new f(7, this));
        int i2 = Build.VERSION.SDK_INT;
        this.f3394m = i2 >= 31 ? b.a(context, attributeSet) : new EdgeEffect(context);
        this.f3395n = i2 >= 31 ? b.a(context, attributeSet) : new EdgeEffect(context);
        this.f3390d = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f3393l = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f3405x = viewConfiguration.getScaledTouchSlop();
        this.f3406y = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3407z = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3379M, com.icefishing.icefish.ice.fishing.s294s.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f3386G = new C0123t();
        this.f3387H = new C0121q(this);
        setNestedScrollingEnabled(true);
        T.i(this, f3378L);
    }

    public static boolean g(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && g((View) parent, nestedScrollView);
    }

    private A getScrollFeedbackProvider() {
        if (this.f3396o == null) {
            this.f3396o = new A(this);
        }
        return this.f3396o;
    }

    public final boolean a(int i2) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View view = findFocus;
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i2);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !h(findNextFocus, maxScrollAmount, getHeight())) {
            if (i2 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i2 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i2 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            n(maxScrollAmount, -1, null, 0, 1, true);
        } else {
            Rect rect = this.f3392i;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            n(b(rect), -1, null, 0, 1, true);
            findNextFocus.requestFocus(i2);
        }
        if (view != null && view.isFocused() && !h(view, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    public final int b(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i2 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i5 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i2 - verticalFadingEdgeLength : i2;
        int i7 = rect.bottom;
        if (i7 > i5 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i5, (childAt.getBottom() + layoutParams.bottomMargin) - i2);
        }
        if (rect.top >= scrollY || i7 >= i5) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i5 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    public final boolean c(int i2, int i5, int[] iArr, int[] iArr2, int i7) {
        return this.f3387H.c(i2, i5, iArr, null, i7);
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

    /* JADX WARN: Removed duplicated region for block: B:15:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void computeScroll() {
        int round;
        int i2;
        int i5;
        if (this.f3393l.isFinished()) {
            return;
        }
        this.f3393l.computeScrollOffset();
        int currY = this.f3393l.getCurrY();
        int i7 = currY - this.f3384E;
        int height = getHeight();
        EdgeEffect edgeEffect = this.f3394m;
        EdgeEffect edgeEffect2 = this.f3395n;
        if (i7 <= 0 || O6.g.L(edgeEffect) == 0.0f) {
            if (i7 < 0 && O6.g.L(edgeEffect2) != 0.0f) {
                float f7 = height;
                round = Math.round(O6.g.X(edgeEffect2, (i7 * 4.0f) / f7, 0.5f) * (f7 / 4.0f));
                if (round != i7) {
                    edgeEffect2.finish();
                }
            }
            this.f3384E = currY;
            int[] iArr = this.f3382C;
            iArr[1] = 0;
            c(0, i7, iArr, null, 1);
            i2 = i7 - iArr[1];
            int scrollRange = getScrollRange();
            if (Build.VERSION.SDK_INT >= 35) {
                e.a(this, Math.abs(this.f3393l.getCurrVelocity()));
            }
            if (i2 == 0) {
                int scrollY = getScrollY();
                k(i2, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i8 = i2 - scrollY2;
                iArr[1] = 0;
                i5 = 1;
                this.f3387H.d(0, scrollY2, 0, i8, this.f3381B, 1, iArr);
                i2 = i8 - iArr[1];
            } else {
                i5 = 1;
            }
            if (i2 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == i5 && scrollRange > 0)) {
                    if (i2 < 0) {
                        if (edgeEffect.isFinished()) {
                            edgeEffect.onAbsorb((int) this.f3393l.getCurrVelocity());
                        }
                    } else if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) this.f3393l.getCurrVelocity());
                    }
                }
                this.f3393l.abortAnimation();
                s(i5);
            }
            if (this.f3393l.isFinished()) {
                postInvalidateOnAnimation();
                return;
            } else {
                s(i5);
                return;
            }
        }
        round = Math.round(O6.g.X(edgeEffect, ((-i7) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (round != i7) {
            edgeEffect.finish();
        }
        i7 -= round;
        this.f3384E = currY;
        int[] iArr2 = this.f3382C;
        iArr2[1] = 0;
        c(0, i7, iArr2, null, 1);
        i2 = i7 - iArr2[1];
        int scrollRange2 = getScrollRange();
        if (Build.VERSION.SDK_INT >= 35) {
        }
        if (i2 == 0) {
        }
        if (i2 != 0) {
        }
        if (this.f3393l.isFinished()) {
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

    public final boolean d(KeyEvent keyEvent) {
        this.f3392i.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 19) {
                        return keyEvent.isAltPressed() ? f(33) : a(33);
                    }
                    if (keyCode == 20) {
                        return keyEvent.isAltPressed() ? f(130) : a(130);
                    }
                    if (keyCode == 62) {
                        l(keyEvent.isShiftPressed() ? 33 : 130);
                        return false;
                    }
                    if (keyCode == 92) {
                        return f(33);
                    }
                    if (keyCode == 93) {
                        return f(130);
                    }
                    if (keyCode == 122) {
                        l(33);
                        return false;
                    }
                    if (keyCode == 123) {
                        l(130);
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

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || d(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f7, float f8, boolean z7) {
        return this.f3387H.a(f7, f8, z7);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f7, float f8) {
        return this.f3387H.b(f7, f8);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i2, int i5, int[] iArr, int[] iArr2) {
        return this.f3387H.c(i2, i5, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i2, int i5, int i7, int i8, int[] iArr) {
        return this.f3387H.d(i2, i5, i7, i8, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i2;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f3394m;
        int i5 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                i2 = getPaddingLeft();
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            } else {
                i2 = 0;
            }
            canvas.translate(i2, min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.f3395n;
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

    public final void e(int i2) {
        if (getChildCount() > 0) {
            this.f3393l.fling(getScrollX(), getScrollY(), 0, i2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            q(2, 1);
            this.f3384E = getScrollY();
            postInvalidateOnAnimation();
            if (Build.VERSION.SDK_INT >= 35) {
                e.a(this, Math.abs(this.f3393l.getCurrVelocity()));
            }
        }
    }

    public final boolean f(int i2) {
        int childCount;
        boolean z7 = i2 == 130;
        int height = getHeight();
        Rect rect = this.f3392i;
        rect.top = 0;
        rect.bottom = height;
        if (z7 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return m(i2, rect.top, rect.bottom);
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
        C0123t c0123t = this.f3386G;
        return c0123t.f1237b | c0123t.f1236a;
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
        if (this.f3388I == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f3388I = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f3388I;
    }

    public final boolean h(View view, int i2, int i5) {
        Rect rect = this.f3392i;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i2 >= getScrollY() && rect.top - i2 <= getScrollY() + i5;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f3387H.f(0);
    }

    public final void i(int i2, int i5, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i2);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f3387H.d(0, scrollY2, 0, i2 - scrollY2, null, i5, iArr);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f3387H.f1232d;
    }

    public final void j(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3380A) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.f3397p = (int) motionEvent.getY(i2);
            this.f3380A = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.f3402u;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean k(int i2, int i5, int i7, int i8) {
        int i9;
        boolean z7;
        int i10;
        boolean z8;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i11 = i7 + i2;
        if (i5 <= 0 && i5 >= 0) {
            i9 = i5;
            z7 = false;
        } else {
            i9 = 0;
            z7 = true;
        }
        if (i11 > i8) {
            i10 = i8;
        } else {
            if (i11 >= 0) {
                i10 = i11;
                z8 = false;
                if (z8 && !this.f3387H.f(1)) {
                    this.f3393l.springBack(i9, i10, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i9, i10);
                return !z7 || z8;
            }
            i10 = 0;
        }
        z8 = true;
        if (z8) {
            this.f3393l.springBack(i9, i10, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i9, i10);
        if (z7) {
        }
    }

    public final void l(int i2) {
        boolean z7 = i2 == 130;
        int height = getHeight();
        Rect rect = this.f3392i;
        if (z7) {
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
        int i7 = height + i5;
        rect.bottom = i7;
        m(i2, i5, i7);
    }

    public final boolean m(int i2, int i5, int i7) {
        boolean z7;
        int height = getHeight();
        int scrollY = getScrollY();
        int i8 = height + scrollY;
        boolean z8 = i2 == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z9 = false;
        for (int i9 = 0; i9 < size; i9++) {
            View view2 = focusables.get(i9);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i5 < bottom && top < i7) {
                boolean z10 = i5 < top && bottom < i7;
                if (view == null) {
                    view = view2;
                    z9 = z10;
                } else {
                    boolean z11 = (z8 && top < view.getTop()) || (!z8 && bottom > view.getBottom());
                    if (z9) {
                        if (z10) {
                            if (!z11) {
                            }
                            view = view2;
                        }
                    } else if (z10) {
                        view = view2;
                        z9 = true;
                    } else {
                        if (!z11) {
                        }
                        view = view2;
                    }
                }
            }
        }
        View view3 = view == null ? this : view;
        if (i5 < scrollY || i7 > i8) {
            n(z8 ? i5 - scrollY : i7 - i8, -1, null, 0, 1, true);
            z7 = true;
        } else {
            z7 = false;
        }
        if (view3 != findFocus()) {
            view3.requestFocus(i2);
        }
        return z7;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i2, int i5) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i2, int i5, int i7, int i8) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i5, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int n(int i2, int i5, MotionEvent motionEvent, int i7, int i8, boolean z7) {
        int i9;
        int i10;
        boolean z8;
        boolean z9;
        VelocityTracker velocityTracker;
        if (i8 == 1) {
            q(2, i8);
        }
        boolean c7 = this.f3387H.c(0, i2, this.f3382C, this.f3381B, i8);
        int[] iArr = this.f3381B;
        int[] iArr2 = this.f3382C;
        if (c7) {
            i9 = i2 - iArr2[1];
            i10 = iArr[1];
        } else {
            i9 = i2;
            i10 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z10 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z7;
        boolean z11 = k(i9, 0, scrollY, scrollRange) && !this.f3387H.f(i8);
        int scrollY2 = getScrollY() - scrollY;
        if (motionEvent != null && scrollY2 != 0) {
            getScrollFeedbackProvider().f1133a.onScrollProgress(motionEvent.getDeviceId(), motionEvent.getSource(), i5, scrollY2);
        }
        iArr2[1] = 0;
        this.f3387H.d(0, scrollY2, 0, i9 - scrollY2, this.f3381B, i8, iArr2);
        int i11 = i10 + iArr[1];
        int i12 = i9 - iArr2[1];
        int i13 = scrollY + i12;
        EdgeEffect edgeEffect = this.f3395n;
        EdgeEffect edgeEffect2 = this.f3394m;
        if (i13 < 0) {
            if (z10) {
                O6.g.X(edgeEffect2, (-i12) / getHeight(), i7 / getWidth());
                if (motionEvent != null) {
                    getScrollFeedbackProvider().f1133a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i5, true);
                }
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i13 > scrollRange && z10) {
            O6.g.X(edgeEffect, i12 / getHeight(), 1.0f - (i7 / getWidth()));
            if (motionEvent != null) {
                z8 = false;
                getScrollFeedbackProvider().f1133a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i5, false);
            } else {
                z8 = false;
            }
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
            if (edgeEffect2.isFinished() || !edgeEffect.isFinished()) {
                postInvalidateOnAnimation();
                z9 = z8;
            } else {
                z9 = z11;
            }
            if (z9 && i8 == 0 && (velocityTracker = this.f3402u) != null) {
                velocityTracker.clear();
            }
            if (i8 == 1) {
                s(i8);
                edgeEffect2.onRelease();
                edgeEffect.onRelease();
            }
            return i11;
        }
        z8 = false;
        if (edgeEffect2.isFinished()) {
        }
        postInvalidateOnAnimation();
        z9 = z8;
        if (z9) {
            velocityTracker.clear();
        }
        if (i8 == 1) {
        }
        return i11;
    }

    public final boolean o(EdgeEffect edgeEffect, int i2) {
        if (i2 > 0) {
            return true;
        }
        float L7 = O6.g.L(edgeEffect) * getHeight();
        float abs = Math.abs(-i2) * 0.35f;
        float f7 = this.f3390d * 0.015f;
        double log = Math.log(abs / f7);
        double d7 = f3377K;
        return ((float) (Math.exp((d7 / (d7 - 1.0d)) * log) * ((double) f7))) < L7;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3399r = false;
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
        float f7;
        int i2;
        int i5;
        int i7;
        int i8;
        int i9;
        boolean z7;
        NestedScrollView nestedScrollView;
        float f8;
        NestedScrollView nestedScrollView2;
        float f9;
        long j;
        float f10;
        float sqrt;
        int i10;
        NestedScrollView nestedScrollView3;
        float f11;
        if (motionEvent.getAction() != 8 || this.f3401t) {
            return false;
        }
        if ((motionEvent.getSource() & 2) == 2) {
            float axisValue = motionEvent.getAxisValue(9);
            i5 = (int) motionEvent.getX();
            i2 = 9;
            f7 = axisValue;
        } else if ((motionEvent.getSource() & 4194304) == 4194304) {
            float axisValue2 = motionEvent.getAxisValue(26);
            i5 = getWidth() / 2;
            f7 = axisValue2;
            i2 = 26;
        } else {
            f7 = 0.0f;
            i2 = 0;
            i5 = 0;
        }
        if (f7 == 0.0f) {
            return false;
        }
        n(-((int) (getVerticalScrollFactorCompat() * f7)), i2, motionEvent, i5, 1, (motionEvent.getSource() & 8194) == 8194);
        if (i2 != 0) {
            C0111g c0111g = this.f3389J;
            NestedScrollView nestedScrollView4 = (NestedScrollView) c0111g.f1184b.f152e;
            int[] iArr = c0111g.f1190h;
            int source = motionEvent.getSource();
            int deviceId = motionEvent.getDeviceId();
            int i11 = 1;
            if (c0111g.f1188f == source && c0111g.f1189g == deviceId && c0111g.f1187e == i2) {
                z7 = false;
                i7 = 0;
            } else {
                Context context = c0111g.f1183a;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int deviceId2 = motionEvent.getDeviceId();
                i7 = 0;
                int source2 = motionEvent.getSource();
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= 34) {
                    Method method = U.f1158a;
                    i8 = B.f(viewConfiguration, deviceId2, i2, source2);
                } else {
                    Method method2 = U.f1158a;
                    InputDevice device = InputDevice.getDevice(deviceId2);
                    if (device != null && device.getMotionRange(i2, source2) != null) {
                        Resources resources = context.getResources();
                        int identifier = (source2 == 4194304 && i2 == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", a.TURBINE_FEATURES_PLATFORM_ANDROID) : -1;
                        Objects.requireNonNull(viewConfiguration);
                        if (identifier == -1) {
                            i8 = viewConfiguration.getScaledMinimumFlingVelocity();
                        } else if (identifier != 0) {
                            i8 = resources.getDimensionPixelSize(identifier);
                        }
                    }
                    i8 = Integer.MAX_VALUE;
                }
                iArr[0] = i8;
                int deviceId3 = motionEvent.getDeviceId();
                int source3 = motionEvent.getSource();
                if (i12 >= 34) {
                    i9 = B.e(viewConfiguration, deviceId3, i2, source3);
                } else {
                    InputDevice device2 = InputDevice.getDevice(deviceId3);
                    if (device2 != null && device2.getMotionRange(i2, source3) != null) {
                        Resources resources2 = context.getResources();
                        int identifier2 = (source3 == 4194304 && i2 == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", a.TURBINE_FEATURES_PLATFORM_ANDROID) : -1;
                        Objects.requireNonNull(viewConfiguration);
                        if (identifier2 == -1) {
                            i9 = viewConfiguration.getScaledMaximumFlingVelocity();
                        } else if (identifier2 != 0) {
                            i9 = resources2.getDimensionPixelSize(identifier2);
                        }
                    }
                    i9 = Integer.MIN_VALUE;
                }
                iArr[1] = i9;
                c0111g.f1188f = source;
                c0111g.f1189g = deviceId;
                c0111g.f1187e = i2;
                z7 = true;
            }
            if (iArr[i7] == Integer.MAX_VALUE) {
                VelocityTracker velocityTracker = c0111g.f1185c;
                if (velocityTracker == null) {
                    return true;
                }
                velocityTracker.recycle();
                c0111g.f1185c = null;
                return true;
            }
            if (c0111g.f1185c == null) {
                c0111g.f1185c = VelocityTracker.obtain();
            }
            VelocityTracker velocityTracker2 = c0111g.f1185c;
            Map map = C.f1134a;
            velocityTracker2.addMovement(motionEvent);
            int i13 = 20;
            if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
                Map map2 = C.f1134a;
                if (!map2.containsKey(velocityTracker2)) {
                    map2.put(velocityTracker2, new D());
                }
                D d7 = (D) map2.get(velocityTracker2);
                long[] jArr = d7.f1136b;
                long eventTime = motionEvent.getEventTime();
                if (d7.f1138d != 0 && eventTime - jArr[d7.f1139e] > 40) {
                    d7.f1138d = i7;
                    d7.f1137c = 0.0f;
                }
                int i14 = (d7.f1139e + 1) % 20;
                d7.f1139e = i14;
                int i15 = d7.f1138d;
                if (i15 != 20) {
                    d7.f1138d = i15 + 1;
                }
                d7.f1135a[i14] = motionEvent.getAxisValue(26);
                jArr[d7.f1139e] = eventTime;
            }
            velocityTracker2.computeCurrentVelocity(1000, Float.MAX_VALUE);
            D d8 = (D) C.f1134a.get(velocityTracker2);
            if (d8 != null) {
                float[] fArr = d8.f1135a;
                long[] jArr2 = d8.f1136b;
                int i16 = d8.f1138d;
                if (i16 >= 2) {
                    int i17 = d8.f1139e;
                    int i18 = ((i17 + 20) - (i16 - 1)) % 20;
                    long j7 = jArr2[i17];
                    while (true) {
                        j = jArr2[i18];
                        if (j7 - j <= 100) {
                            break;
                        }
                        d8.f1138d--;
                        i18 = (i18 + 1) % 20;
                    }
                    int i19 = d8.f1138d;
                    if (i19 >= 2) {
                        if (i19 == 2) {
                            int i20 = (i18 + 1) % 20;
                            if (j != jArr2[i20]) {
                                nestedScrollView = nestedScrollView4;
                                f10 = Float.MAX_VALUE;
                                i10 = 1000;
                                sqrt = fArr[i20] / (r12 - j);
                            }
                        } else {
                            f10 = Float.MAX_VALUE;
                            float f12 = 0.0f;
                            int i21 = 0;
                            int i22 = 0;
                            while (true) {
                                if (i21 >= d8.f1138d - 1) {
                                    break;
                                }
                                int i23 = i21 + i18;
                                long j8 = jArr2[i23 % 20];
                                int i24 = (i23 + 1) % i13;
                                if (jArr2[i24] == j8) {
                                    nestedScrollView3 = nestedScrollView4;
                                } else {
                                    i22++;
                                    nestedScrollView3 = nestedScrollView4;
                                    float sqrt2 = (f12 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f12) * 2.0f));
                                    float f13 = fArr[i24] / (jArr2[i24] - j8);
                                    float abs = (Math.abs(f13) * (f13 - sqrt2)) + f12;
                                    if (i22 == i11) {
                                        abs *= 0.5f;
                                    }
                                    f12 = abs;
                                }
                                i21++;
                                nestedScrollView4 = nestedScrollView3;
                                i13 = 20;
                                i11 = 1;
                            }
                            nestedScrollView = nestedScrollView4;
                            sqrt = ((float) Math.sqrt(Math.abs(f12) * 2.0f)) * (f12 < 0.0f ? -1.0f : 1.0f);
                            i10 = 1000;
                        }
                        f11 = sqrt * i10;
                        d8.f1137c = f11;
                        if (f11 >= (-Math.abs(f10))) {
                            d8.f1137c = -Math.abs(f10);
                        } else if (d8.f1137c > Math.abs(f10)) {
                            d8.f1137c = Math.abs(f10);
                        }
                    }
                }
                nestedScrollView = nestedScrollView4;
                f10 = Float.MAX_VALUE;
                i10 = 1000;
                sqrt = 0.0f;
                f11 = sqrt * i10;
                d8.f1137c = f11;
                if (f11 >= (-Math.abs(f10))) {
                }
            } else {
                nestedScrollView = nestedScrollView4;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                f8 = B.b(velocityTracker2, i2);
            } else if (i2 == 0) {
                f8 = velocityTracker2.getXVelocity();
            } else if (i2 == 1) {
                f8 = velocityTracker2.getYVelocity();
            } else {
                D d9 = (D) C.f1134a.get(velocityTracker2);
                f8 = (d9 == null || i2 != 26) ? 0.0f : d9.f1137c;
            }
            float f14 = f8 * (-nestedScrollView.getVerticalScrollFactorCompat());
            float signum = Math.signum(f14);
            if (z7 || !(signum == Math.signum(c0111g.f1186d) || signum == 0.0f)) {
                nestedScrollView2 = nestedScrollView;
                nestedScrollView2.f3393l.abortAnimation();
            } else {
                nestedScrollView2 = nestedScrollView;
            }
            if (Math.abs(f14) >= iArr[0]) {
                float max = Math.max(-r2, Math.min(f14, iArr[1]));
                if (max == 0.0f) {
                    f9 = 0.0f;
                } else {
                    nestedScrollView2.f3393l.abortAnimation();
                    nestedScrollView2.e((int) max);
                    f9 = max;
                }
                c0111g.f1186d = f9;
                return true;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z7 = true;
        if (action == 2 && this.f3401t) {
            return true;
        }
        int i2 = action & 255;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    int i5 = this.f3380A;
                    if (i5 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i5);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i5 + " in onInterceptTouchEvent");
                        } else {
                            int y7 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y7 - this.f3397p) > this.f3405x && (2 & getNestedScrollAxes()) == 0) {
                                this.f3401t = true;
                                this.f3397p = y7;
                                if (this.f3402u == null) {
                                    this.f3402u = VelocityTracker.obtain();
                                }
                                this.f3402u.addMovement(motionEvent);
                                this.f3383D = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i2 != 3) {
                    if (i2 == 6) {
                        j(motionEvent);
                    }
                }
            }
            this.f3401t = false;
            this.f3380A = -1;
            VelocityTracker velocityTracker = this.f3402u;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f3402u = null;
            }
            if (this.f3393l.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            s(0);
        } else {
            int y8 = (int) motionEvent.getY();
            int x7 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y8 >= childAt.getTop() - scrollY && y8 < childAt.getBottom() - scrollY && x7 >= childAt.getLeft() && x7 < childAt.getRight()) {
                    this.f3397p = y8;
                    this.f3380A = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.f3402u;
                    if (velocityTracker2 == null) {
                        this.f3402u = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f3402u.addMovement(motionEvent);
                    this.f3393l.computeScrollOffset();
                    if (!r(motionEvent) && this.f3393l.isFinished()) {
                        z7 = false;
                    }
                    this.f3401t = z7;
                    q(2, 0);
                }
            }
            if (!r(motionEvent) && this.f3393l.isFinished()) {
                z7 = false;
            }
            this.f3401t = z7;
            VelocityTracker velocityTracker3 = this.f3402u;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f3402u = null;
            }
        }
        return this.f3401t;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i2, int i5, int i7, int i8) {
        int i9;
        super.onLayout(z7, i2, i5, i7, i8);
        int i10 = 0;
        this.f3398q = false;
        View view = this.f3400s;
        if (view != null && g(view, this)) {
            View view2 = this.f3400s;
            Rect rect = this.f3392i;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int b7 = b(rect);
            if (b7 != 0) {
                scrollBy(0, b7);
            }
        }
        this.f3400s = null;
        if (!this.f3399r) {
            if (this.f3385F != null) {
                scrollTo(getScrollX(), this.f3385F.f1649d);
                this.f3385F = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i9 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i9 = 0;
            }
            int paddingTop = ((i8 - i5) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i9 && scrollY >= 0) {
                i10 = paddingTop + scrollY > i9 ? i9 - paddingTop : scrollY;
            }
            if (i10 != scrollY) {
                scrollTo(getScrollX(), i10);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f3399r = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i5) {
        super.onMeasure(i2, i5);
        if (this.f3403v && View.MeasureSpec.getMode(i5) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f7, float f8, boolean z7) {
        if (z7) {
            return false;
        }
        dispatchNestedFling(0.0f, f8, true);
        e((int) f8);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f7, float f8) {
        return this.f3387H.b(f7, f8);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i2, int i5, int[] iArr) {
        c(i2, i5, iArr, null, 0);
    }

    @Override // I.InterfaceC0122s
    public final void onNestedScroll(View view, int i2, int i5, int i7, int i8, int i9, int[] iArr) {
        i(i8, i9, iArr);
    }

    @Override // I.r
    public final void onNestedScrollAccepted(View view, View view2, int i2, int i5) {
        C0123t c0123t = this.f3386G;
        if (i5 == 1) {
            c0123t.f1237b = i2;
        } else {
            c0123t.f1236a = i2;
        }
        q(2, i5);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i2, int i5, boolean z7, boolean z8) {
        super.scrollTo(i2, i5);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (i2 == 2) {
            i2 = 130;
        } else if (i2 == 1) {
            i2 = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i2) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i2);
        if (findNextFocus != null && h(findNextFocus, 0, getHeight())) {
            return findNextFocus.requestFocus(i2, rect);
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
        this.f3385F = gVar;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        gVar.f1649d = getScrollY();
        return gVar;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i2, int i5, int i7, int i8) {
        super.onScrollChanged(i2, i5, i7, i8);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i5, int i7, int i8) {
        super.onSizeChanged(i2, i5, i7, i8);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !h(findFocus, 0, i8)) {
            return;
        }
        Rect rect = this.f3392i;
        findFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(findFocus, rect);
        int b7 = b(rect);
        if (b7 != 0) {
            if (this.f3404w) {
                p(0, b7, false);
            } else {
                scrollBy(0, b7);
            }
        }
    }

    @Override // I.r
    public final boolean onStartNestedScroll(View view, View view2, int i2, int i5) {
        return (i2 & 2) != 0;
    }

    @Override // I.r
    public final void onStopNestedScroll(View view, int i2) {
        C0123t c0123t = this.f3386G;
        if (i2 == 1) {
            c0123t.f1237b = 0;
        } else {
            c0123t.f1236a = 0;
        }
        s(i2);
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
        float X6;
        int round;
        int i2;
        ViewParent parent2;
        if (this.f3402u == null) {
            this.f3402u = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f3383D = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float f7 = 0.0f;
        obtain.offsetLocation(0.0f, this.f3383D);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f3394m;
            EdgeEffect edgeEffect2 = this.f3395n;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f3402u;
                velocityTracker.computeCurrentVelocity(1000, this.f3407z);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f3380A);
                if (Math.abs(yVelocity) >= this.f3406y) {
                    if (O6.g.L(edgeEffect) != 0.0f) {
                        if (o(edgeEffect, yVelocity)) {
                            edgeEffect.onAbsorb(yVelocity);
                        } else {
                            e(-yVelocity);
                        }
                    } else if (O6.g.L(edgeEffect2) != 0.0f) {
                        int i5 = -yVelocity;
                        if (o(edgeEffect2, i5)) {
                            edgeEffect2.onAbsorb(i5);
                        } else {
                            e(i5);
                        }
                    } else {
                        int i7 = -yVelocity;
                        float f8 = i7;
                        if (!this.f3387H.b(0.0f, f8)) {
                            dispatchNestedFling(0.0f, f8, true);
                            e(i7);
                        }
                    }
                } else if (this.f3393l.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f3380A = -1;
                this.f3401t = false;
                VelocityTracker velocityTracker2 = this.f3402u;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f3402u = null;
                }
                s(0);
                this.f3394m.onRelease();
                this.f3395n.onRelease();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f3380A);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f3380A + " in onTouchEvent");
                } else {
                    int y7 = (int) motionEvent.getY(findPointerIndex);
                    int i8 = this.f3397p - y7;
                    float x7 = motionEvent.getX(findPointerIndex) / getWidth();
                    float height = i8 / getHeight();
                    if (O6.g.L(edgeEffect) != 0.0f) {
                        X6 = -O6.g.X(edgeEffect, -height, x7);
                        if (O6.g.L(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                    } else {
                        if (O6.g.L(edgeEffect2) != 0.0f) {
                            X6 = O6.g.X(edgeEffect2, height, 1.0f - x7);
                            if (O6.g.L(edgeEffect2) == 0.0f) {
                                edgeEffect2.onRelease();
                            }
                        }
                        round = Math.round(f7 * getHeight());
                        if (round != 0) {
                            invalidate();
                        }
                        i2 = i8 - round;
                        if (!this.f3401t && Math.abs(i2) > this.f3405x) {
                            parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.f3401t = true;
                            i2 = i2 <= 0 ? i2 - this.f3405x : i2 + this.f3405x;
                        }
                        if (this.f3401t) {
                            int n7 = n(i2, 1, motionEvent, (int) motionEvent.getX(findPointerIndex), 0, false);
                            this.f3397p = y7 - n7;
                            this.f3383D += n7;
                        }
                    }
                    f7 = X6;
                    round = Math.round(f7 * getHeight());
                    if (round != 0) {
                    }
                    i2 = i8 - round;
                    if (!this.f3401t) {
                        parent2 = getParent();
                        if (parent2 != null) {
                        }
                        this.f3401t = true;
                        if (i2 <= 0) {
                        }
                    }
                    if (this.f3401t) {
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f3401t && getChildCount() > 0) {
                    if (this.f3393l.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        postInvalidateOnAnimation();
                    }
                }
                this.f3380A = -1;
                this.f3401t = false;
                VelocityTracker velocityTracker3 = this.f3402u;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f3402u = null;
                }
                s(0);
                this.f3394m.onRelease();
                this.f3395n.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f3397p = (int) motionEvent.getY(actionIndex);
                this.f3380A = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                j(motionEvent);
                this.f3397p = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f3380A));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f3401t && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f3393l.isFinished()) {
                this.f3393l.abortAnimation();
                s(1);
            }
            int y8 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f3397p = y8;
            this.f3380A = pointerId;
            q(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f3402u;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public final void p(int i2, int i5, boolean z7) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f3391e > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int max = Math.max(0, Math.min(i5 + scrollY, Math.max(0, height - height2))) - scrollY;
            this.f3393l.startScroll(getScrollX(), scrollY, 0, max, 250);
            if (z7) {
                q(2, 1);
            } else {
                s(1);
            }
            this.f3384E = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f3393l.isFinished()) {
                this.f3393l.abortAnimation();
                s(1);
            }
            scrollBy(i2, i5);
        }
        this.f3391e = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean q(int i2, int i5) {
        return this.f3387H.g(2, i5);
    }

    public final boolean r(MotionEvent motionEvent) {
        boolean z7;
        EdgeEffect edgeEffect = this.f3394m;
        if (O6.g.L(edgeEffect) != 0.0f) {
            O6.g.X(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z7 = true;
        } else {
            z7 = false;
        }
        EdgeEffect edgeEffect2 = this.f3395n;
        if (O6.g.L(edgeEffect2) == 0.0f) {
            return z7;
        }
        O6.g.X(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f3398q) {
            this.f3400s = view2;
        } else {
            Rect rect = this.f3392i;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int b7 = b(rect);
            if (b7 != 0) {
                scrollBy(0, b7);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z7) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int b7 = b(rect);
        boolean z8 = b7 != 0;
        if (z8) {
            if (z7) {
                scrollBy(0, b7);
                return z8;
            }
            p(0, b7, false);
        }
        return z8;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z7) {
        VelocityTracker velocityTracker;
        if (z7 && (velocityTracker = this.f3402u) != null) {
            velocityTracker.recycle();
            this.f3402u = null;
        }
        super.requestDisallowInterceptTouchEvent(z7);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f3398q = true;
        super.requestLayout();
    }

    public final void s(int i2) {
        this.f3387H.h(i2);
    }

    @Override // android.view.View
    public final void scrollTo(int i2, int i5) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i2 < 0) {
                i2 = 0;
            } else if (width + i2 > width2) {
                i2 = width2 - width;
            }
            if (height >= height2 || i5 < 0) {
                i5 = 0;
            } else if (height + i5 > height2) {
                i5 = height2 - height;
            }
            if (i2 == getScrollX() && i5 == getScrollY()) {
                return;
            }
            super.scrollTo(i2, i5);
        }
    }

    public void setFillViewport(boolean z7) {
        if (z7 != this.f3403v) {
            this.f3403v = z7;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z7) {
        C0121q c0121q = this.f3387H;
        if (c0121q.f1232d) {
            ViewGroup viewGroup = c0121q.f1231c;
            WeakHashMap weakHashMap = T.f1153a;
            viewGroup.stopNestedScroll();
        }
        c0121q.f1232d = z7;
    }

    public void setSmoothScrollingEnabled(boolean z7) {
        this.f3404w = z7;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i2) {
        return this.f3387H.g(i2, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        s(0);
    }

    @Override // I.r
    public final void onNestedPreScroll(View view, int i2, int i5, int[] iArr, int i7) {
        c(i2, i5, iArr, null, i7);
    }

    @Override // I.r
    public final void onNestedScroll(View view, int i2, int i5, int i7, int i8, int i9) {
        i(i8, i9, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        return onStartNestedScroll(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i2, int i5, int i7, int i8) {
        i(i8, 0, null);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2) {
        if (getChildCount() <= 0) {
            super.addView(view, i2);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        onNestedScrollAccepted(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
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
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void setOnScrollChangeListener(L.f fVar) {
    }
}
