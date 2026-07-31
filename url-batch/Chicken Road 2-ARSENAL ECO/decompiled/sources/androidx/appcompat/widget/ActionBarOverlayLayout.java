package androidx.appcompat.widget;

import D.AbstractC0106t;
import D.AbstractC0108v;
import D.C0102o;
import D.D;
import D.InterfaceC0100m;
import D.InterfaceC0101n;
import D.K;
import D.M;
import D.N;
import D.O;
import D.W;
import D.Y;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.core.widget.NestedScrollView;
import com.strategylink.Row.Five.R;
import h.AbstractC0401a;
import java.lang.reflect.Field;
import k.C0443b;
import k.C0446e;
import k.InterfaceC0440B;
import k.InterfaceC0445d;
import k.RunnableC0444c;
import k.s0;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0100m, InterfaceC0101n {

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f3271D = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* renamed from: A, reason: collision with root package name */
    public final RunnableC0444c f3272A;

    /* renamed from: B, reason: collision with root package name */
    public final RunnableC0444c f3273B;

    /* renamed from: C, reason: collision with root package name */
    public final C0102o f3274C;

    /* renamed from: f, reason: collision with root package name */
    public int f3275f;

    /* renamed from: g, reason: collision with root package name */
    public ContentFrameLayout f3276g;

    /* renamed from: h, reason: collision with root package name */
    public ActionBarContainer f3277h;

    /* renamed from: i, reason: collision with root package name */
    public InterfaceC0440B f3278i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f3279j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3280k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3281l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3282m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3283n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3284o;

    /* renamed from: p, reason: collision with root package name */
    public int f3285p;

    /* renamed from: q, reason: collision with root package name */
    public final Rect f3286q;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f3287r;

    /* renamed from: s, reason: collision with root package name */
    public final Rect f3288s;

    /* renamed from: t, reason: collision with root package name */
    public Y f3289t;

    /* renamed from: u, reason: collision with root package name */
    public Y f3290u;

    /* renamed from: v, reason: collision with root package name */
    public Y f3291v;

    /* renamed from: w, reason: collision with root package name */
    public Y f3292w;

    /* renamed from: x, reason: collision with root package name */
    public OverScroller f3293x;
    public ViewPropertyAnimator y;

    /* renamed from: z, reason: collision with root package name */
    public final C0443b f3294z;

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3286q = new Rect();
        this.f3287r = new Rect();
        this.f3288s = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        Y y = Y.f271b;
        this.f3289t = y;
        this.f3290u = y;
        this.f3291v = y;
        this.f3292w = y;
        this.f3294z = new C0443b(this);
        this.f3272A = new RunnableC0444c(this, 0);
        this.f3273B = new RunnableC0444c(this, 1);
        i(context);
        this.f3274C = new C0102o();
    }

    public static boolean g(View view, Rect rect, boolean z5) {
        boolean z6;
        C0446e c0446e = (C0446e) view.getLayoutParams();
        int i7 = ((ViewGroup.MarginLayoutParams) c0446e).leftMargin;
        int i8 = rect.left;
        if (i7 != i8) {
            ((ViewGroup.MarginLayoutParams) c0446e).leftMargin = i8;
            z6 = true;
        } else {
            z6 = false;
        }
        int i9 = ((ViewGroup.MarginLayoutParams) c0446e).topMargin;
        int i10 = rect.top;
        if (i9 != i10) {
            ((ViewGroup.MarginLayoutParams) c0446e).topMargin = i10;
            z6 = true;
        }
        int i11 = ((ViewGroup.MarginLayoutParams) c0446e).rightMargin;
        int i12 = rect.right;
        if (i11 != i12) {
            ((ViewGroup.MarginLayoutParams) c0446e).rightMargin = i12;
            z6 = true;
        }
        if (z5) {
            int i13 = ((ViewGroup.MarginLayoutParams) c0446e).bottomMargin;
            int i14 = rect.bottom;
            if (i13 != i14) {
                ((ViewGroup.MarginLayoutParams) c0446e).bottomMargin = i14;
                return true;
            }
        }
        return z6;
    }

    @Override // D.InterfaceC0100m
    public final void a(View view, View view2, int i7, int i8) {
        if (i8 == 0) {
            onNestedScrollAccepted(view, view2, i7);
        }
    }

    @Override // D.InterfaceC0100m
    public final void b(View view, int i7) {
        if (i7 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // D.InterfaceC0101n
    public final void c(NestedScrollView nestedScrollView, int i7, int i8, int i9, int i10, int i11, int[] iArr) {
        e(nestedScrollView, i7, i8, i9, i10, i11);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0446e;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i7;
        super.draw(canvas);
        if (this.f3279j == null || this.f3280k) {
            return;
        }
        if (this.f3277h.getVisibility() == 0) {
            i7 = (int) (this.f3277h.getTranslationY() + this.f3277h.getBottom() + 0.5f);
        } else {
            i7 = 0;
        }
        this.f3279j.setBounds(0, i7, getWidth(), this.f3279j.getIntrinsicHeight() + i7);
        this.f3279j.draw(canvas);
    }

    @Override // D.InterfaceC0100m
    public final void e(NestedScrollView nestedScrollView, int i7, int i8, int i9, int i10, int i11) {
        if (i11 == 0) {
            onNestedScroll(nestedScrollView, i7, i8, i9, i10);
        }
    }

    @Override // D.InterfaceC0100m
    public final boolean f(View view, View view2, int i7, int i8) {
        return i8 == 0 && onStartNestedScroll(view, view2, i7);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0446e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0446e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f3277h;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0102o c0102o = this.f3274C;
        return c0102o.f300b | c0102o.f299a;
    }

    public CharSequence getTitle() {
        j();
        return ((s0) this.f3278i).f5088a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f3272A);
        removeCallbacks(this.f3273B);
        ViewPropertyAnimator viewPropertyAnimator = this.y;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f3271D);
        this.f3275f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f3279j = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f3280k = context.getApplicationInfo().targetSdkVersion < 19;
        this.f3293x = new OverScroller(context);
    }

    public final void j() {
        InterfaceC0440B wrapper;
        if (this.f3276g == null) {
            this.f3276g = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f3277h = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof InterfaceC0440B) {
                wrapper = (InterfaceC0440B) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f3278i = wrapper;
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        j();
        Y c7 = Y.c(windowInsets, this);
        W w5 = c7.f272a;
        boolean g7 = g(this.f3277h, new Rect(w5.i().f6127a, w5.i().f6128b, w5.i().f6129c, w5.i().f6130d), false);
        Field field = D.f240a;
        Rect rect = this.f3286q;
        AbstractC0108v.b(this, c7, rect);
        Y k4 = w5.k(rect.left, rect.top, rect.right, rect.bottom);
        this.f3289t = k4;
        boolean z5 = true;
        if (!this.f3290u.equals(k4)) {
            this.f3290u = this.f3289t;
            g7 = true;
        }
        Rect rect2 = this.f3287r;
        if (rect2.equals(rect)) {
            z5 = g7;
        } else {
            rect2.set(rect);
        }
        if (z5) {
            requestLayout();
        }
        return w5.a().f272a.c().f272a.b().b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        Field field = D.f240a;
        AbstractC0106t.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i7, int i8, int i9, int i10) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                C0446e c0446e = (C0446e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = ((ViewGroup.MarginLayoutParams) c0446e).leftMargin + paddingLeft;
                int i13 = ((ViewGroup.MarginLayoutParams) c0446e).topMargin + paddingTop;
                childAt.layout(i12, i13, measuredWidth + i12, measuredHeight + i13);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        int measuredHeight;
        j();
        measureChildWithMargins(this.f3277h, i7, 0, i8, 0);
        C0446e c0446e = (C0446e) this.f3277h.getLayoutParams();
        int max = Math.max(0, this.f3277h.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0446e).leftMargin + ((ViewGroup.MarginLayoutParams) c0446e).rightMargin);
        int max2 = Math.max(0, this.f3277h.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0446e).topMargin + ((ViewGroup.MarginLayoutParams) c0446e).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f3277h.getMeasuredState());
        Field field = D.f240a;
        boolean z5 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z5) {
            measuredHeight = this.f3275f;
            if (this.f3282m && this.f3277h.getTabContainer() != null) {
                measuredHeight += this.f3275f;
            }
        } else {
            measuredHeight = this.f3277h.getVisibility() != 8 ? this.f3277h.getMeasuredHeight() : 0;
        }
        Rect rect = this.f3286q;
        Rect rect2 = this.f3288s;
        rect2.set(rect);
        Y y = this.f3289t;
        this.f3291v = y;
        if (this.f3281l || z5) {
            w.c a7 = w.c.a(y.f272a.i().f6127a, this.f3291v.f272a.i().f6128b + measuredHeight, this.f3291v.f272a.i().f6129c, this.f3291v.f272a.i().f6130d);
            Y y6 = this.f3291v;
            int i9 = Build.VERSION.SDK_INT;
            O n7 = i9 >= 30 ? new N(y6) : i9 >= 29 ? new M(y6) : new K(y6);
            n7.d(a7);
            this.f3291v = n7.b();
        } else {
            rect2.top += measuredHeight;
            rect2.bottom = rect2.bottom;
            this.f3291v = y.f272a.k(0, measuredHeight, 0, 0);
        }
        g(this.f3276g, rect2, true);
        if (!this.f3292w.equals(this.f3291v)) {
            Y y7 = this.f3291v;
            this.f3292w = y7;
            ContentFrameLayout contentFrameLayout = this.f3276g;
            WindowInsets b7 = y7.b();
            if (b7 != null) {
                WindowInsets a8 = AbstractC0106t.a(contentFrameLayout, b7);
                if (!a8.equals(b7)) {
                    Y.c(a8, contentFrameLayout);
                }
            }
        }
        measureChildWithMargins(this.f3276g, i7, 0, i8, 0);
        C0446e c0446e2 = (C0446e) this.f3276g.getLayoutParams();
        int max3 = Math.max(max, this.f3276g.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0446e2).leftMargin + ((ViewGroup.MarginLayoutParams) c0446e2).rightMargin);
        int max4 = Math.max(max2, this.f3276g.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0446e2).topMargin + ((ViewGroup.MarginLayoutParams) c0446e2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f3276g.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i7, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i8, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f7, float f8, boolean z5) {
        if (!this.f3283n || !z5) {
            return false;
        }
        this.f3293x.fling(0, 0, 0, (int) f8, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f3293x.getFinalY() > this.f3277h.getHeight()) {
            h();
            this.f3273B.run();
        } else {
            h();
            this.f3272A.run();
        }
        this.f3284o = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f7, float f8) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i7, int i8, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i7, int i8, int i9, int i10) {
        int i11 = this.f3285p + i8;
        this.f3285p = i11;
        setActionBarHideOffset(i11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i7) {
        this.f3274C.f299a = i7;
        this.f3285p = getActionBarHideOffset();
        h();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i7) {
        if ((i7 & 2) == 0 || this.f3277h.getVisibility() != 0) {
            return false;
        }
        return this.f3283n;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f3283n || this.f3284o) {
            return;
        }
        if (this.f3285p <= this.f3277h.getHeight()) {
            h();
            postDelayed(this.f3272A, 600L);
        } else {
            h();
            postDelayed(this.f3273B, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i7) {
        super.onWindowSystemUiVisibilityChanged(i7);
        j();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i7) {
        super.onWindowVisibilityChanged(i7);
    }

    public void setActionBarHideOffset(int i7) {
        h();
        this.f3277h.setTranslationY(-Math.max(0, Math.min(i7, this.f3277h.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0445d interfaceC0445d) {
        if (getWindowToken() != null) {
            throw null;
        }
    }

    public void setHasNonEmbeddedTabs(boolean z5) {
        this.f3282m = z5;
    }

    public void setHideOnContentScrollEnabled(boolean z5) {
        if (z5 != this.f3283n) {
            this.f3283n = z5;
            if (z5) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i7) {
        j();
        s0 s0Var = (s0) this.f3278i;
        s0Var.f5091d = i7 != 0 ? AbstractC0401a.a(s0Var.f5088a.getContext(), i7) : null;
        s0Var.c();
    }

    public void setLogo(int i7) {
        j();
        s0 s0Var = (s0) this.f3278i;
        s0Var.f5092e = i7 != 0 ? AbstractC0401a.a(s0Var.f5088a.getContext(), i7) : null;
        s0Var.c();
    }

    public void setOverlayMode(boolean z5) {
        this.f3281l = z5;
        this.f3280k = z5 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z5) {
    }

    public void setUiOptions(int i7) {
    }

    public void setWindowCallback(Window.Callback callback) {
        j();
        ((s0) this.f3278i).f5098k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        j();
        s0 s0Var = (s0) this.f3278i;
        if (s0Var.f5094g) {
            return;
        }
        s0Var.f5095h = charSequence;
        if ((s0Var.f5089b & 8) != 0) {
            s0Var.f5088a.setTitle(charSequence);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0446e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        j();
        s0 s0Var = (s0) this.f3278i;
        s0Var.f5091d = drawable;
        s0Var.c();
    }

    @Override // D.InterfaceC0100m
    public final void d(int i7, int i8, int[] iArr, int i9) {
    }
}
