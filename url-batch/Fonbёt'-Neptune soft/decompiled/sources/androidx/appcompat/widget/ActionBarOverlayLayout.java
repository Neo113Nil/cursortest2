package androidx.appcompat.widget;

import A.AbstractC0015p;
import A.C0010k;
import A.InterfaceC0008i;
import A.InterfaceC0009j;
import A.z;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import com.neptunesoft.languesbacdz.R;
import j.C0226b;
import j.C0229e;
import j.InterfaceC0228d;
import j.InterfaceC0249z;
import j.RunnableC0227c;
import j.s0;
import j.y0;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0008i, InterfaceC0009j {

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f1385C = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* renamed from: A, reason: collision with root package name */
    public final RunnableC0227c f1386A;

    /* renamed from: B, reason: collision with root package name */
    public final C0010k f1387B;

    /* renamed from: e, reason: collision with root package name */
    public int f1388e;

    /* renamed from: f, reason: collision with root package name */
    public ContentFrameLayout f1389f;

    /* renamed from: g, reason: collision with root package name */
    public ActionBarContainer f1390g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC0249z f1391h;

    /* renamed from: i, reason: collision with root package name */
    public Drawable f1392i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1393j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1394k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1395l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1396m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1397n;

    /* renamed from: o, reason: collision with root package name */
    public int f1398o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f1399p;

    /* renamed from: q, reason: collision with root package name */
    public final Rect f1400q;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f1401r;

    /* renamed from: s, reason: collision with root package name */
    public final Rect f1402s;

    /* renamed from: t, reason: collision with root package name */
    public final Rect f1403t;

    /* renamed from: u, reason: collision with root package name */
    public final Rect f1404u;
    public final Rect v;

    /* renamed from: w, reason: collision with root package name */
    public OverScroller f1405w;

    /* renamed from: x, reason: collision with root package name */
    public ViewPropertyAnimator f1406x;

    /* renamed from: y, reason: collision with root package name */
    public final C0226b f1407y;

    /* renamed from: z, reason: collision with root package name */
    public final RunnableC0227c f1408z;

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1399p = new Rect();
        this.f1400q = new Rect();
        this.f1401r = new Rect();
        this.f1402s = new Rect();
        this.f1403t = new Rect();
        this.f1404u = new Rect();
        this.v = new Rect();
        this.f1407y = new C0226b(this);
        this.f1408z = new RunnableC0227c(this, 0);
        this.f1386A = new RunnableC0227c(this, 1);
        i(context);
        this.f1387B = new C0010k(0);
    }

    public static boolean g(View view, Rect rect, boolean z2) {
        boolean z3;
        C0229e c0229e = (C0229e) view.getLayoutParams();
        int i2 = ((ViewGroup.MarginLayoutParams) c0229e).leftMargin;
        int i3 = rect.left;
        if (i2 != i3) {
            ((ViewGroup.MarginLayoutParams) c0229e).leftMargin = i3;
            z3 = true;
        } else {
            z3 = false;
        }
        int i4 = ((ViewGroup.MarginLayoutParams) c0229e).topMargin;
        int i5 = rect.top;
        if (i4 != i5) {
            ((ViewGroup.MarginLayoutParams) c0229e).topMargin = i5;
            z3 = true;
        }
        int i6 = ((ViewGroup.MarginLayoutParams) c0229e).rightMargin;
        int i7 = rect.right;
        if (i6 != i7) {
            ((ViewGroup.MarginLayoutParams) c0229e).rightMargin = i7;
            z3 = true;
        }
        if (z2) {
            int i8 = ((ViewGroup.MarginLayoutParams) c0229e).bottomMargin;
            int i9 = rect.bottom;
            if (i8 != i9) {
                ((ViewGroup.MarginLayoutParams) c0229e).bottomMargin = i9;
                return true;
            }
        }
        return z3;
    }

    @Override // A.InterfaceC0008i
    public final void a(View view, View view2, int i2, int i3) {
        if (i3 == 0) {
            onNestedScrollAccepted(view, view2, i2);
        }
    }

    @Override // A.InterfaceC0008i
    public final void b(ViewGroup viewGroup, int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            onNestedScroll(viewGroup, i2, i3, i4, i5);
        }
    }

    @Override // A.InterfaceC0008i
    public final void c(View view, int i2) {
        if (i2 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0229e;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i2;
        super.draw(canvas);
        if (this.f1392i == null || this.f1393j) {
            return;
        }
        if (this.f1390g.getVisibility() == 0) {
            i2 = (int) (this.f1390g.getTranslationY() + this.f1390g.getBottom() + 0.5f);
        } else {
            i2 = 0;
        }
        this.f1392i.setBounds(0, i2, getWidth(), this.f1392i.getIntrinsicHeight() + i2);
        this.f1392i.draw(canvas);
    }

    @Override // A.InterfaceC0009j
    public final void e(ViewGroup viewGroup, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        b(viewGroup, i2, i3, i4, i5, i6);
    }

    @Override // A.InterfaceC0008i
    public final boolean f(View view, View view2, int i2, int i3) {
        return i3 == 0 && onStartNestedScroll(view, view2, i2);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        j();
        Field field = z.f58a;
        getWindowSystemUiVisibility();
        boolean g2 = g(this.f1390g, rect, false);
        Rect rect2 = this.f1402s;
        rect2.set(rect);
        Method method = y0.f3101a;
        Rect rect3 = this.f1399p;
        if (method != null) {
            try {
                method.invoke(this, rect2, rect3);
            } catch (Exception e2) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e2);
            }
        }
        Rect rect4 = this.f1403t;
        if (!rect4.equals(rect2)) {
            rect4.set(rect2);
            g2 = true;
        }
        Rect rect5 = this.f1400q;
        if (!rect5.equals(rect3)) {
            rect5.set(rect3);
            g2 = true;
        }
        if (g2) {
            requestLayout();
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0229e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0229e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1390g;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0010k c0010k = this.f1387B;
        return c0010k.f49c | c0010k.f48b;
    }

    public CharSequence getTitle() {
        j();
        return ((s0) this.f1391h).f3035a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f1408z);
        removeCallbacks(this.f1386A);
        ViewPropertyAnimator viewPropertyAnimator = this.f1406x;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1385C);
        this.f1388e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1392i = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f1393j = context.getApplicationInfo().targetSdkVersion < 19;
        this.f1405w = new OverScroller(context);
    }

    public final void j() {
        InterfaceC0249z wrapper;
        if (this.f1389f == null) {
            this.f1389f = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f1390g = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof InterfaceC0249z) {
                wrapper = (InterfaceC0249z) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f1391h = wrapper;
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        Field field = z.f58a;
        AbstractC0015p.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C0229e c0229e = (C0229e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = ((ViewGroup.MarginLayoutParams) c0229e).leftMargin + paddingLeft;
                int i8 = ((ViewGroup.MarginLayoutParams) c0229e).topMargin + paddingTop;
                childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        j();
        measureChildWithMargins(this.f1390g, i2, 0, i3, 0);
        C0229e c0229e = (C0229e) this.f1390g.getLayoutParams();
        int i4 = 0;
        int max = Math.max(0, this.f1390g.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0229e).leftMargin + ((ViewGroup.MarginLayoutParams) c0229e).rightMargin);
        int max2 = Math.max(0, this.f1390g.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0229e).topMargin + ((ViewGroup.MarginLayoutParams) c0229e).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f1390g.getMeasuredState());
        Field field = z.f58a;
        boolean z2 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z2) {
            i4 = this.f1388e;
            if (this.f1395l && this.f1390g.getTabContainer() != null) {
                i4 += this.f1388e;
            }
        } else if (this.f1390g.getVisibility() != 8) {
            i4 = this.f1390g.getMeasuredHeight();
        }
        Rect rect = this.f1399p;
        Rect rect2 = this.f1401r;
        rect2.set(rect);
        Rect rect3 = this.f1404u;
        rect3.set(this.f1402s);
        if (this.f1394k || z2) {
            rect3.top += i4;
            rect3.bottom = rect3.bottom;
        } else {
            rect2.top += i4;
            rect2.bottom = rect2.bottom;
        }
        g(this.f1389f, rect2, true);
        Rect rect4 = this.v;
        if (!rect4.equals(rect3)) {
            rect4.set(rect3);
            this.f1389f.a(rect3);
        }
        measureChildWithMargins(this.f1389f, i2, 0, i3, 0);
        C0229e c0229e2 = (C0229e) this.f1389f.getLayoutParams();
        int max3 = Math.max(max, this.f1389f.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0229e2).leftMargin + ((ViewGroup.MarginLayoutParams) c0229e2).rightMargin);
        int max4 = Math.max(max2, this.f1389f.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0229e2).topMargin + ((ViewGroup.MarginLayoutParams) c0229e2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1389f.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i2, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i3, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (!this.f1396m || !z2) {
            return false;
        }
        this.f1405w.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f1405w.getFinalY() > this.f1390g.getHeight()) {
            h();
            this.f1386A.run();
        } else {
            h();
            this.f1408z.run();
        }
        this.f1397n = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        int i6 = this.f1398o + i3;
        this.f1398o = i6;
        setActionBarHideOffset(i6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        this.f1387B.f48b = i2;
        this.f1398o = getActionBarHideOffset();
        h();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        if ((i2 & 2) == 0 || this.f1390g.getVisibility() != 0) {
            return false;
        }
        return this.f1396m;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f1396m || this.f1397n) {
            return;
        }
        if (this.f1398o <= this.f1390g.getHeight()) {
            h();
            postDelayed(this.f1408z, 600L);
        } else {
            h();
            postDelayed(this.f1386A, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i2) {
        super.onWindowSystemUiVisibilityChanged(i2);
        j();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
    }

    public void setActionBarHideOffset(int i2) {
        h();
        this.f1390g.setTranslationY(-Math.max(0, Math.min(i2, this.f1390g.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0228d interfaceC0228d) {
        if (getWindowToken() != null) {
            throw null;
        }
    }

    public void setHasNonEmbeddedTabs(boolean z2) {
        this.f1395l = z2;
    }

    public void setHideOnContentScrollEnabled(boolean z2) {
        if (z2 != this.f1396m) {
            this.f1396m = z2;
            if (z2) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i2) {
        j();
        s0 s0Var = (s0) this.f1391h;
        s0Var.f3038d = i2 != 0 ? d.b.c(s0Var.f3035a.getContext(), i2) : null;
        s0Var.c();
    }

    public void setLogo(int i2) {
        j();
        s0 s0Var = (s0) this.f1391h;
        s0Var.f3039e = i2 != 0 ? d.b.c(s0Var.f3035a.getContext(), i2) : null;
        s0Var.c();
    }

    public void setOverlayMode(boolean z2) {
        this.f1394k = z2;
        this.f1393j = z2 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i2) {
    }

    public void setWindowCallback(Window.Callback callback) {
        j();
        ((s0) this.f1391h).f3045k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        j();
        s0 s0Var = (s0) this.f1391h;
        if (s0Var.f3041g) {
            return;
        }
        s0Var.f3042h = charSequence;
        if ((s0Var.f3036b & 8) != 0) {
            s0Var.f3035a.setTitle(charSequence);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0229e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        j();
        s0 s0Var = (s0) this.f1391h;
        s0Var.f3038d = drawable;
        s0Var.c();
    }

    @Override // A.InterfaceC0008i
    public final void d(int i2, int i3, int[] iArr, int i4) {
    }
}
