package androidx.appcompat.widget;

import N.C0056m;
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
import com.crane.slab.beam.R;
import e.AbstractC0121a;
import i.C0155b;
import i.C0158e;
import i.InterfaceC0157d;
import i.InterfaceC0177y;
import i.RunnableC0156c;
import i.q0;
import i.w0;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import y.AbstractC0270n;
import y.InterfaceC0264h;
import y.InterfaceC0265i;
import y.x;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0264h, InterfaceC0265i {

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f1226C = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* renamed from: A, reason: collision with root package name */
    public final RunnableC0156c f1227A;

    /* renamed from: B, reason: collision with root package name */
    public final C0056m f1228B;

    /* renamed from: e, reason: collision with root package name */
    public int f1229e;

    /* renamed from: f, reason: collision with root package name */
    public ContentFrameLayout f1230f;

    /* renamed from: g, reason: collision with root package name */
    public ActionBarContainer f1231g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC0177y f1232h;

    /* renamed from: i, reason: collision with root package name */
    public Drawable f1233i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1234j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1235k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1236l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1237m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1238n;

    /* renamed from: o, reason: collision with root package name */
    public int f1239o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f1240p;

    /* renamed from: q, reason: collision with root package name */
    public final Rect f1241q;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f1242r;

    /* renamed from: s, reason: collision with root package name */
    public final Rect f1243s;
    public final Rect t;

    /* renamed from: u, reason: collision with root package name */
    public final Rect f1244u;

    /* renamed from: v, reason: collision with root package name */
    public final Rect f1245v;

    /* renamed from: w, reason: collision with root package name */
    public OverScroller f1246w;

    /* renamed from: x, reason: collision with root package name */
    public ViewPropertyAnimator f1247x;

    /* renamed from: y, reason: collision with root package name */
    public final C0155b f1248y;

    /* renamed from: z, reason: collision with root package name */
    public final RunnableC0156c f1249z;

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1240p = new Rect();
        this.f1241q = new Rect();
        this.f1242r = new Rect();
        this.f1243s = new Rect();
        this.t = new Rect();
        this.f1244u = new Rect();
        this.f1245v = new Rect();
        this.f1248y = new C0155b(this);
        this.f1249z = new RunnableC0156c(this, 0);
        this.f1227A = new RunnableC0156c(this, 1);
        i(context);
        this.f1228B = new C0056m();
    }

    public static boolean g(View view, Rect rect, boolean z2) {
        boolean z3;
        C0158e c0158e = (C0158e) view.getLayoutParams();
        int i2 = ((ViewGroup.MarginLayoutParams) c0158e).leftMargin;
        int i3 = rect.left;
        if (i2 != i3) {
            ((ViewGroup.MarginLayoutParams) c0158e).leftMargin = i3;
            z3 = true;
        } else {
            z3 = false;
        }
        int i4 = ((ViewGroup.MarginLayoutParams) c0158e).topMargin;
        int i5 = rect.top;
        if (i4 != i5) {
            ((ViewGroup.MarginLayoutParams) c0158e).topMargin = i5;
            z3 = true;
        }
        int i6 = ((ViewGroup.MarginLayoutParams) c0158e).rightMargin;
        int i7 = rect.right;
        if (i6 != i7) {
            ((ViewGroup.MarginLayoutParams) c0158e).rightMargin = i7;
            z3 = true;
        }
        if (z2) {
            int i8 = ((ViewGroup.MarginLayoutParams) c0158e).bottomMargin;
            int i9 = rect.bottom;
            if (i8 != i9) {
                ((ViewGroup.MarginLayoutParams) c0158e).bottomMargin = i9;
                return true;
            }
        }
        return z3;
    }

    @Override // y.InterfaceC0264h
    public final void a(View view, View view2, int i2, int i3) {
        if (i3 == 0) {
            onNestedScrollAccepted(view, view2, i2);
        }
    }

    @Override // y.InterfaceC0264h
    public final void b(ViewGroup viewGroup, int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            onNestedScroll(viewGroup, i2, i3, i4, i5);
        }
    }

    @Override // y.InterfaceC0264h
    public final void c(View view, int i2) {
        if (i2 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0158e;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i2;
        super.draw(canvas);
        if (this.f1233i == null || this.f1234j) {
            return;
        }
        if (this.f1231g.getVisibility() == 0) {
            i2 = (int) (this.f1231g.getTranslationY() + this.f1231g.getBottom() + 0.5f);
        } else {
            i2 = 0;
        }
        this.f1233i.setBounds(0, i2, getWidth(), this.f1233i.getIntrinsicHeight() + i2);
        this.f1233i.draw(canvas);
    }

    @Override // y.InterfaceC0265i
    public final void e(ViewGroup viewGroup, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        b(viewGroup, i2, i3, i4, i5, i6);
    }

    @Override // y.InterfaceC0264h
    public final boolean f(View view, View view2, int i2, int i3) {
        return i3 == 0 && onStartNestedScroll(view, view2, i2);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        j();
        Field field = x.f3160a;
        getWindowSystemUiVisibility();
        boolean g2 = g(this.f1231g, rect, false);
        Rect rect2 = this.f1243s;
        rect2.set(rect);
        Method method = w0.f2350a;
        Rect rect3 = this.f1240p;
        if (method != null) {
            try {
                method.invoke(this, rect2, rect3);
            } catch (Exception e2) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e2);
            }
        }
        Rect rect4 = this.t;
        if (!rect4.equals(rect2)) {
            rect4.set(rect2);
            g2 = true;
        }
        Rect rect5 = this.f1241q;
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
        return new C0158e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0158e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1231g;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0056m c0056m = this.f1228B;
        return c0056m.f757c | c0056m.f756b;
    }

    public CharSequence getTitle() {
        j();
        return ((q0) this.f1232h).f2284a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f1249z);
        removeCallbacks(this.f1227A);
        ViewPropertyAnimator viewPropertyAnimator = this.f1247x;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1226C);
        this.f1229e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1233i = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f1234j = context.getApplicationInfo().targetSdkVersion < 19;
        this.f1246w = new OverScroller(context);
    }

    public final void j() {
        InterfaceC0177y wrapper;
        if (this.f1230f == null) {
            this.f1230f = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f1231g = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof InterfaceC0177y) {
                wrapper = (InterfaceC0177y) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f1232h = wrapper;
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        Field field = x.f3160a;
        AbstractC0270n.c(this);
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
                C0158e c0158e = (C0158e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = ((ViewGroup.MarginLayoutParams) c0158e).leftMargin + paddingLeft;
                int i8 = ((ViewGroup.MarginLayoutParams) c0158e).topMargin + paddingTop;
                childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        j();
        measureChildWithMargins(this.f1231g, i2, 0, i3, 0);
        C0158e c0158e = (C0158e) this.f1231g.getLayoutParams();
        int i4 = 0;
        int max = Math.max(0, this.f1231g.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0158e).leftMargin + ((ViewGroup.MarginLayoutParams) c0158e).rightMargin);
        int max2 = Math.max(0, this.f1231g.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0158e).topMargin + ((ViewGroup.MarginLayoutParams) c0158e).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f1231g.getMeasuredState());
        Field field = x.f3160a;
        boolean z2 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z2) {
            i4 = this.f1229e;
            if (this.f1236l && this.f1231g.getTabContainer() != null) {
                i4 += this.f1229e;
            }
        } else if (this.f1231g.getVisibility() != 8) {
            i4 = this.f1231g.getMeasuredHeight();
        }
        Rect rect = this.f1240p;
        Rect rect2 = this.f1242r;
        rect2.set(rect);
        Rect rect3 = this.f1243s;
        Rect rect4 = this.f1244u;
        rect4.set(rect3);
        if (this.f1235k || z2) {
            rect4.top += i4;
            rect4.bottom = rect4.bottom;
        } else {
            rect2.top += i4;
            rect2.bottom = rect2.bottom;
        }
        g(this.f1230f, rect2, true);
        Rect rect5 = this.f1245v;
        if (!rect5.equals(rect4)) {
            rect5.set(rect4);
            this.f1230f.a(rect4);
        }
        measureChildWithMargins(this.f1230f, i2, 0, i3, 0);
        C0158e c0158e2 = (C0158e) this.f1230f.getLayoutParams();
        int max3 = Math.max(max, this.f1230f.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0158e2).leftMargin + ((ViewGroup.MarginLayoutParams) c0158e2).rightMargin);
        int max4 = Math.max(max2, this.f1230f.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0158e2).topMargin + ((ViewGroup.MarginLayoutParams) c0158e2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1230f.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i2, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i3, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (!this.f1237m || !z2) {
            return false;
        }
        this.f1246w.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f1246w.getFinalY() > this.f1231g.getHeight()) {
            h();
            this.f1227A.run();
        } else {
            h();
            this.f1249z.run();
        }
        this.f1238n = true;
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
        int i6 = this.f1239o + i3;
        this.f1239o = i6;
        setActionBarHideOffset(i6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        this.f1228B.f756b = i2;
        this.f1239o = getActionBarHideOffset();
        h();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        if ((i2 & 2) == 0 || this.f1231g.getVisibility() != 0) {
            return false;
        }
        return this.f1237m;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f1237m || this.f1238n) {
            return;
        }
        if (this.f1239o <= this.f1231g.getHeight()) {
            h();
            postDelayed(this.f1249z, 600L);
        } else {
            h();
            postDelayed(this.f1227A, 600L);
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
        this.f1231g.setTranslationY(-Math.max(0, Math.min(i2, this.f1231g.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0157d interfaceC0157d) {
        if (getWindowToken() != null) {
            throw null;
        }
    }

    public void setHasNonEmbeddedTabs(boolean z2) {
        this.f1236l = z2;
    }

    public void setHideOnContentScrollEnabled(boolean z2) {
        if (z2 != this.f1237m) {
            this.f1237m = z2;
            if (z2) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i2) {
        j();
        q0 q0Var = (q0) this.f1232h;
        q0Var.f2287d = i2 != 0 ? AbstractC0121a.a(q0Var.f2284a.getContext(), i2) : null;
        q0Var.c();
    }

    public void setLogo(int i2) {
        j();
        q0 q0Var = (q0) this.f1232h;
        q0Var.f2288e = i2 != 0 ? AbstractC0121a.a(q0Var.f2284a.getContext(), i2) : null;
        q0Var.c();
    }

    public void setOverlayMode(boolean z2) {
        this.f1235k = z2;
        this.f1234j = z2 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i2) {
    }

    public void setWindowCallback(Window.Callback callback) {
        j();
        ((q0) this.f1232h).f2294k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        j();
        q0 q0Var = (q0) this.f1232h;
        if (q0Var.f2290g) {
            return;
        }
        q0Var.f2291h = charSequence;
        if ((q0Var.f2285b & 8) != 0) {
            q0Var.f2284a.setTitle(charSequence);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0158e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        j();
        q0 q0Var = (q0) this.f1232h;
        q0Var.f2287d = drawable;
        q0Var.c();
    }

    @Override // y.InterfaceC0264h
    public final void d(int i2, int i3, int[] iArr, int i4) {
    }
}
