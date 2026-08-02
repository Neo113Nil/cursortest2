package androidx.appcompat.widget;

import E.A;
import E.C0009j;
import E.InterfaceC0007h;
import E.InterfaceC0008i;
import E.r;
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
import com.fc.barca.football.R;
import h.AbstractC0337a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import l.C1080b;
import l.C1083e;
import l.InterfaceC1082d;
import l.InterfaceC1101x;
import l.RunnableC1081c;
import l.q0;
import l.w0;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0007h, InterfaceC0008i {

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f2011y = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* renamed from: a, reason: collision with root package name */
    public int f2012a;

    /* renamed from: b, reason: collision with root package name */
    public ContentFrameLayout f2013b;

    /* renamed from: c, reason: collision with root package name */
    public ActionBarContainer f2014c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC1101x f2015d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f2016e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2017g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2018h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2019i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2020j;

    /* renamed from: k, reason: collision with root package name */
    public int f2021k;

    /* renamed from: l, reason: collision with root package name */
    public final Rect f2022l;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f2023m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f2024n;
    public final Rect o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f2025p;

    /* renamed from: q, reason: collision with root package name */
    public final Rect f2026q;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f2027r;

    /* renamed from: s, reason: collision with root package name */
    public OverScroller f2028s;

    /* renamed from: t, reason: collision with root package name */
    public ViewPropertyAnimator f2029t;

    /* renamed from: u, reason: collision with root package name */
    public final C1080b f2030u;
    public final RunnableC1081c v;

    /* renamed from: w, reason: collision with root package name */
    public final RunnableC1081c f2031w;

    /* renamed from: x, reason: collision with root package name */
    public final C0009j f2032x;

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2022l = new Rect();
        this.f2023m = new Rect();
        this.f2024n = new Rect();
        this.o = new Rect();
        this.f2025p = new Rect();
        this.f2026q = new Rect();
        this.f2027r = new Rect();
        this.f2030u = new C1080b(this);
        this.v = new RunnableC1081c(this, 0);
        this.f2031w = new RunnableC1081c(this, 1);
        i(context);
        this.f2032x = new C0009j();
    }

    public static boolean g(View view, Rect rect, boolean z) {
        boolean z2;
        C1083e c1083e = (C1083e) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c1083e).leftMargin;
        int i4 = rect.left;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) c1083e).leftMargin = i4;
            z2 = true;
        } else {
            z2 = false;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) c1083e).topMargin;
        int i6 = rect.top;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) c1083e).topMargin = i6;
            z2 = true;
        }
        int i7 = ((ViewGroup.MarginLayoutParams) c1083e).rightMargin;
        int i8 = rect.right;
        if (i7 != i8) {
            ((ViewGroup.MarginLayoutParams) c1083e).rightMargin = i8;
            z2 = true;
        }
        if (z) {
            int i9 = ((ViewGroup.MarginLayoutParams) c1083e).bottomMargin;
            int i10 = rect.bottom;
            if (i9 != i10) {
                ((ViewGroup.MarginLayoutParams) c1083e).bottomMargin = i10;
                return true;
            }
        }
        return z2;
    }

    @Override // E.InterfaceC0007h
    public final void a(View view, View view2, int i3, int i4) {
        if (i4 == 0) {
            onNestedScrollAccepted(view, view2, i3);
        }
    }

    @Override // E.InterfaceC0007h
    public final void b(ViewGroup viewGroup, int i3, int i4, int i5, int i6, int i7) {
        if (i7 == 0) {
            onNestedScroll(viewGroup, i3, i4, i5, i6);
        }
    }

    @Override // E.InterfaceC0007h
    public final void c(View view, int i3) {
        if (i3 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1083e;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i3;
        super.draw(canvas);
        if (this.f2016e == null || this.f) {
            return;
        }
        if (this.f2014c.getVisibility() == 0) {
            i3 = (int) (this.f2014c.getTranslationY() + this.f2014c.getBottom() + 0.5f);
        } else {
            i3 = 0;
        }
        this.f2016e.setBounds(0, i3, getWidth(), this.f2016e.getIntrinsicHeight() + i3);
        this.f2016e.draw(canvas);
    }

    @Override // E.InterfaceC0008i
    public final void e(ViewGroup viewGroup, int i3, int i4, int i5, int i6, int i7, int[] iArr) {
        b(viewGroup, i3, i4, i5, i6, i7);
    }

    @Override // E.InterfaceC0007h
    public final boolean f(View view, View view2, int i3, int i4) {
        return i4 == 0 && onStartNestedScroll(view, view2, i3);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        j();
        Field field = A.f243a;
        getWindowSystemUiVisibility();
        boolean g3 = g(this.f2014c, rect, false);
        Rect rect2 = this.o;
        rect2.set(rect);
        Method method = w0.f9931a;
        Rect rect3 = this.f2022l;
        if (method != null) {
            try {
                method.invoke(this, rect2, rect3);
            } catch (Exception e3) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e3);
            }
        }
        Rect rect4 = this.f2025p;
        if (!rect4.equals(rect2)) {
            rect4.set(rect2);
            g3 = true;
        }
        Rect rect5 = this.f2023m;
        if (!rect5.equals(rect3)) {
            rect5.set(rect3);
            g3 = true;
        }
        if (g3) {
            requestLayout();
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C1083e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1083e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f2014c;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0009j c0009j = this.f2032x;
        return c0009j.f292c | c0009j.f291b;
    }

    public CharSequence getTitle() {
        j();
        return ((q0) this.f2015d).f9870a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.v);
        removeCallbacks(this.f2031w);
        ViewPropertyAnimator viewPropertyAnimator = this.f2029t;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f2011y);
        this.f2012a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f2016e = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f = context.getApplicationInfo().targetSdkVersion < 19;
        this.f2028s = new OverScroller(context);
    }

    public final void j() {
        InterfaceC1101x wrapper;
        if (this.f2013b == null) {
            this.f2013b = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f2014c = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof InterfaceC1101x) {
                wrapper = (InterfaceC1101x) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f2015d = wrapper;
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        Field field = A.f243a;
        r.a(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i3, int i4, int i5, int i6) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                C1083e c1083e = (C1083e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i8 = ((ViewGroup.MarginLayoutParams) c1083e).leftMargin + paddingLeft;
                int i9 = ((ViewGroup.MarginLayoutParams) c1083e).topMargin + paddingTop;
                childAt.layout(i8, i9, measuredWidth + i8, measuredHeight + i9);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        j();
        measureChildWithMargins(this.f2014c, i3, 0, i4, 0);
        C1083e c1083e = (C1083e) this.f2014c.getLayoutParams();
        int i5 = 0;
        int max = Math.max(0, this.f2014c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c1083e).leftMargin + ((ViewGroup.MarginLayoutParams) c1083e).rightMargin);
        int max2 = Math.max(0, this.f2014c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1083e).topMargin + ((ViewGroup.MarginLayoutParams) c1083e).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f2014c.getMeasuredState());
        Field field = A.f243a;
        boolean z = (getWindowSystemUiVisibility() & 256) != 0;
        if (z) {
            i5 = this.f2012a;
            if (this.f2018h && this.f2014c.getTabContainer() != null) {
                i5 += this.f2012a;
            }
        } else if (this.f2014c.getVisibility() != 8) {
            i5 = this.f2014c.getMeasuredHeight();
        }
        Rect rect = this.f2022l;
        Rect rect2 = this.f2024n;
        rect2.set(rect);
        Rect rect3 = this.f2026q;
        rect3.set(this.o);
        if (this.f2017g || z) {
            rect3.top += i5;
            rect3.bottom = rect3.bottom;
        } else {
            rect2.top += i5;
            rect2.bottom = rect2.bottom;
        }
        g(this.f2013b, rect2, true);
        Rect rect4 = this.f2027r;
        if (!rect4.equals(rect3)) {
            rect4.set(rect3);
            this.f2013b.a(rect3);
        }
        measureChildWithMargins(this.f2013b, i3, 0, i4, 0);
        C1083e c1083e2 = (C1083e) this.f2013b.getLayoutParams();
        int max3 = Math.max(max, this.f2013b.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c1083e2).leftMargin + ((ViewGroup.MarginLayoutParams) c1083e2).rightMargin);
        int max4 = Math.max(max2, this.f2013b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1083e2).topMargin + ((ViewGroup.MarginLayoutParams) c1083e2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f2013b.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i3, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i4, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f3, boolean z) {
        if (!this.f2019i || !z) {
            return false;
        }
        this.f2028s.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f2028s.getFinalY() > this.f2014c.getHeight()) {
            h();
            this.f2031w.run();
        } else {
            h();
            this.v.run();
        }
        this.f2020j = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f3) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i3, int i4, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i3, int i4, int i5, int i6) {
        int i7 = this.f2021k + i4;
        this.f2021k = i7;
        setActionBarHideOffset(i7);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i3) {
        this.f2032x.f291b = i3;
        this.f2021k = getActionBarHideOffset();
        h();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i3) {
        if ((i3 & 2) == 0 || this.f2014c.getVisibility() != 0) {
            return false;
        }
        return this.f2019i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f2019i || this.f2020j) {
            return;
        }
        if (this.f2021k <= this.f2014c.getHeight()) {
            h();
            postDelayed(this.v, 600L);
        } else {
            h();
            postDelayed(this.f2031w, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i3) {
        super.onWindowSystemUiVisibilityChanged(i3);
        j();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i3) {
        super.onWindowVisibilityChanged(i3);
    }

    public void setActionBarHideOffset(int i3) {
        h();
        this.f2014c.setTranslationY(-Math.max(0, Math.min(i3, this.f2014c.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC1082d interfaceC1082d) {
        if (getWindowToken() != null) {
            throw null;
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f2018h = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f2019i) {
            this.f2019i = z;
            if (z) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i3) {
        j();
        q0 q0Var = (q0) this.f2015d;
        q0Var.f9873d = i3 != 0 ? AbstractC0337a.a(q0Var.f9870a.getContext(), i3) : null;
        q0Var.c();
    }

    public void setLogo(int i3) {
        j();
        q0 q0Var = (q0) this.f2015d;
        q0Var.f9874e = i3 != 0 ? AbstractC0337a.a(q0Var.f9870a.getContext(), i3) : null;
        q0Var.c();
    }

    public void setOverlayMode(boolean z) {
        this.f2017g = z;
        this.f = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i3) {
    }

    public void setWindowCallback(Window.Callback callback) {
        j();
        ((q0) this.f2015d).f9879k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        j();
        q0 q0Var = (q0) this.f2015d;
        if (q0Var.f9875g) {
            return;
        }
        q0Var.f9876h = charSequence;
        if ((q0Var.f9871b & 8) != 0) {
            q0Var.f9870a.setTitle(charSequence);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C1083e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        j();
        q0 q0Var = (q0) this.f2015d;
        q0Var.f9873d = drawable;
        q0Var.c();
    }

    @Override // E.InterfaceC0007h
    public final void d(int i3, int i4, int[] iArr, int i5) {
    }
}
