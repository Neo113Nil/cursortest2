package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import com.trembin.nirefon.betfury.R;
import defpackage.a1;
import defpackage.ap0;
import defpackage.b1;
import defpackage.bo0;
import defpackage.c1;
import defpackage.ci;
import defpackage.d1;
import defpackage.d50;
import defpackage.dp0;
import defpackage.fv;
import defpackage.g20;
import defpackage.hm0;
import defpackage.ko0;
import defpackage.l1;
import defpackage.lo0;
import defpackage.mo0;
import defpackage.no0;
import defpackage.oo0;
import defpackage.po0;
import defpackage.qo0;
import defpackage.r10;
import defpackage.r30;
import defpackage.ri0;
import defpackage.ro0;
import defpackage.s30;
import defpackage.s9;
import defpackage.t30;
import defpackage.wm0;
import defpackage.yi0;
import defpackage.z0;
import defpackage.zl0;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements r30, s30 {
    public static final int[] H = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public static final dp0 I;
    public static final Rect J;
    public OverScroller A;
    public ViewPropertyAnimator B;
    public final z0 C;
    public final a1 D;
    public final a1 E;
    public final t30 F;
    public final d1 G;
    public int f;
    public int g;
    public ContentFrameLayout h;
    public ActionBarContainer i;
    public ci j;
    public Drawable k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public int p;
    public int q;
    public final Rect r;
    public final Rect s;
    public final Rect t;
    public final Rect u;
    public dp0 v;
    public dp0 w;
    public dp0 x;
    public dp0 y;
    public b1 z;

    static {
        int i = Build.VERSION.SDK_INT;
        ro0 qo0Var = i >= 36 ? new qo0() : i >= 35 ? new po0() : i >= 34 ? new oo0() : i >= 31 ? new no0() : i >= 30 ? new mo0() : i >= 29 ? new lo0() : new ko0();
        qo0Var.h(fv.c(0, 1, 0, 1));
        I = qo0Var.b();
        J = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = 0;
        this.r = new Rect();
        this.s = new Rect();
        this.t = new Rect();
        this.u = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        dp0 dp0Var = dp0.b;
        this.v = dp0Var;
        this.w = dp0Var;
        this.x = dp0Var;
        this.y = dp0Var;
        this.C = new z0(0, this);
        this.D = new a1(this, 0);
        this.E = new a1(this, 1);
        i(context);
        this.F = new t30();
        d1 d1Var = new d1(context);
        d1Var.setWillNotDraw(true);
        this.G = d1Var;
        addView(d1Var);
    }

    public static boolean g(View view, Rect rect, boolean z) {
        boolean z2;
        c1 c1Var = (c1) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) c1Var).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) c1Var).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) c1Var).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) c1Var).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) c1Var).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) c1Var).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) c1Var).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) c1Var).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    @Override // defpackage.r30
    public final void a(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // defpackage.r30
    public final void b(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c1;
    }

    @Override // defpackage.s30
    public final void d(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        e(view, i, i2, i3, i4, i5);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.k != null) {
            if (this.i.getVisibility() == 0) {
                i = (int) (this.i.getTranslationY() + this.i.getBottom() + 0.5f);
            } else {
                i = 0;
            }
            this.k.setBounds(0, i, getWidth(), this.k.getIntrinsicHeight() + i);
            this.k.draw(canvas);
        }
    }

    @Override // defpackage.r30
    public final void e(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // defpackage.r30
    public final boolean f(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c1(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c1(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.i;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        t30 t30Var = this.F;
        return t30Var.b | t30Var.a;
    }

    public CharSequence getTitle() {
        k();
        return ((yi0) this.j).a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.D);
        removeCallbacks(this.E);
        ViewPropertyAnimator viewPropertyAnimator = this.B;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(H);
        this.f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.k = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.A = new OverScroller(context);
    }

    public final void j(int i) {
        k();
        if (i == 2) {
            ((yi0) this.j).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((yi0) this.j).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        ci wrapper;
        if (this.h == null) {
            this.h = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.i = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof ci) {
                wrapper = (ci) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    s9.u("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                    return;
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.j = wrapper;
        }
    }

    public final void l(Menu menu, g20 g20Var) {
        k();
        yi0 yi0Var = (yi0) this.j;
        Toolbar toolbar = yi0Var.a;
        if (yi0Var.m == null) {
            yi0Var.m = new l1(toolbar.getContext());
        }
        l1 l1Var = yi0Var.m;
        l1Var.j = g20Var;
        r10 r10Var = (r10) menu;
        if (r10Var == null && toolbar.f == null) {
            return;
        }
        toolbar.f();
        r10 r10Var2 = toolbar.f.u;
        if (r10Var2 == r10Var) {
            return;
        }
        if (r10Var2 != null) {
            r10Var2.r(toolbar.Q);
            r10Var2.r(toolbar.R);
        }
        if (toolbar.R == null) {
            toolbar.R = new ri0(toolbar);
        }
        l1Var.v = true;
        Context context = toolbar.o;
        if (r10Var != null) {
            r10Var.b(l1Var, context);
            r10Var.b(toolbar.R, toolbar.o);
        } else {
            l1Var.h(context, null);
            toolbar.R.h(toolbar.o, null);
            l1Var.g();
            toolbar.R.g();
        }
        toolbar.f.setPopupTheme(toolbar.p);
        toolbar.f.setPresenter(l1Var);
        toolbar.Q = l1Var;
        toolbar.v();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        dp0 g = dp0.g(this, windowInsets);
        boolean g2 = g(this.i, new Rect(g.b(), g.d(), g.c(), g.a()), false);
        WeakHashMap weakHashMap = hm0.a;
        Rect rect = this.r;
        zl0.b(this, g, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        ap0 ap0Var = g.a;
        dp0 q = ap0Var.q(i, i2, i3, i4);
        this.v = q;
        boolean z = true;
        if (!this.w.equals(q)) {
            this.w = this.v;
            g2 = true;
        }
        Rect rect2 = this.s;
        if (rect2.equals(rect)) {
            z = g2;
        } else {
            rect2.set(rect);
        }
        if (z) {
            requestLayout();
        }
        return ap0Var.a().a.c().a.b().f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = hm0.a;
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                c1 c1Var = (c1) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) c1Var).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) c1Var).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0125  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        k();
        measureChildWithMargins(this.i, i, 0, i2, 0);
        c1 c1Var = (c1) this.i.getLayoutParams();
        int max = Math.max(0, this.i.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c1Var).leftMargin + ((ViewGroup.MarginLayoutParams) c1Var).rightMargin);
        int max2 = Math.max(0, this.i.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1Var).topMargin + ((ViewGroup.MarginLayoutParams) c1Var).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.i.getMeasuredState());
        WeakHashMap weakHashMap = hm0.a;
        boolean z = (getWindowSystemUiVisibility() & 256) != 0;
        if (z) {
            measuredHeight = this.f;
            if (this.m && this.i.getTabContainer() != null) {
                measuredHeight += this.f;
            }
        } else {
            measuredHeight = this.i.getVisibility() != 8 ? this.i.getMeasuredHeight() : 0;
        }
        Rect rect = this.r;
        Rect rect2 = this.t;
        rect2.set(rect);
        this.x = this.v;
        if (!this.l && !z) {
            d1 d1Var = this.G;
            dp0 dp0Var = I;
            Rect rect3 = this.u;
            zl0.b(d1Var, dp0Var, rect3);
            if (!rect3.equals(J)) {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.x = this.x.a.q(0, measuredHeight, 0, 0);
                g(this.h, rect2, true);
                if (!this.y.equals(this.x)) {
                    dp0 dp0Var2 = this.x;
                    this.y = dp0Var2;
                    hm0.b(this.h, dp0Var2);
                }
                measureChildWithMargins(this.h, i, 0, i2, 0);
                c1 c1Var2 = (c1) this.h.getLayoutParams();
                int max3 = Math.max(max, this.h.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c1Var2).leftMargin + ((ViewGroup.MarginLayoutParams) c1Var2).rightMargin);
                int max4 = Math.max(max2, this.h.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1Var2).topMargin + ((ViewGroup.MarginLayoutParams) c1Var2).bottomMargin);
                int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.h.getMeasuredState());
                setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
            }
        }
        fv c = fv.c(this.x.b(), this.x.d() + measuredHeight, this.x.c(), this.x.a());
        dp0 dp0Var3 = this.x;
        int i3 = Build.VERSION.SDK_INT;
        ro0 qo0Var = i3 >= 36 ? new qo0(dp0Var3) : i3 >= 35 ? new po0(dp0Var3) : i3 >= 34 ? new oo0(dp0Var3) : i3 >= 31 ? new no0(dp0Var3) : i3 >= 30 ? new mo0(dp0Var3) : i3 >= 29 ? new lo0(dp0Var3) : new ko0(dp0Var3);
        qo0Var.h(c);
        this.x = qo0Var.b();
        g(this.h, rect2, true);
        if (!this.y.equals(this.x)) {
        }
        measureChildWithMargins(this.h, i, 0, i2, 0);
        c1 c1Var22 = (c1) this.h.getLayoutParams();
        int max32 = Math.max(max, this.h.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c1Var22).leftMargin + ((ViewGroup.MarginLayoutParams) c1Var22).rightMargin);
        int max42 = Math.max(max2, this.h.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1Var22).topMargin + ((ViewGroup.MarginLayoutParams) c1Var22).bottomMargin);
        int combineMeasuredStates22 = View.combineMeasuredStates(combineMeasuredStates, this.h.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max32, getSuggestedMinimumWidth()), i, combineMeasuredStates22), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max42, getSuggestedMinimumHeight()), i2, combineMeasuredStates22 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.n || !z) {
            return false;
        }
        this.A.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.A.getFinalY() > this.i.getHeight()) {
            h();
            this.E.run();
        } else {
            h();
            this.D.run();
        }
        this.o = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.p + i2;
        this.p = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        bo0 bo0Var;
        wm0 wm0Var;
        this.F.a = i;
        this.p = getActionBarHideOffset();
        h();
        b1 b1Var = this.z;
        if (b1Var == null || (wm0Var = (bo0Var = (bo0) b1Var).K) == null) {
            return;
        }
        wm0Var.a();
        bo0Var.K = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.i.getVisibility() != 0) {
            return false;
        }
        return this.n;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.n || this.o) {
            return;
        }
        if (this.p <= this.i.getHeight()) {
            h();
            postDelayed(this.D, 600L);
        } else {
            h();
            postDelayed(this.E, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        k();
        int i2 = this.q ^ i;
        this.q = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        b1 b1Var = this.z;
        if (b1Var != null) {
            bo0 bo0Var = (bo0) b1Var;
            bo0Var.G = !z2;
            if (z || !z2) {
                if (bo0Var.H) {
                    bo0Var.H = false;
                    bo0Var.Z(true);
                }
            } else if (!bo0Var.H) {
                bo0Var.H = true;
                bo0Var.Z(true);
            }
        }
        if ((i2 & 256) == 0 || this.z == null) {
            return;
        }
        WeakHashMap weakHashMap = hm0.a;
        requestApplyInsets();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.g = i;
        b1 b1Var = this.z;
        if (b1Var != null) {
            ((bo0) b1Var).F = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        h();
        this.i.setTranslationY(-Math.max(0, Math.min(i, this.i.getHeight())));
    }

    public void setActionBarVisibilityCallback(b1 b1Var) {
        this.z = b1Var;
        if (getWindowToken() != null) {
            ((bo0) this.z).F = this.g;
            int i = this.q;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = hm0.a;
                requestApplyInsets();
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.m = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.n) {
            this.n = z;
            if (z) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        k();
        yi0 yi0Var = (yi0) this.j;
        yi0Var.d = i != 0 ? d50.v(yi0Var.a.getContext(), i) : null;
        yi0Var.c();
    }

    public void setLogo(int i) {
        k();
        yi0 yi0Var = (yi0) this.j;
        yi0Var.e = i != 0 ? d50.v(yi0Var.a.getContext(), i) : null;
        yi0Var.c();
    }

    public void setOverlayMode(boolean z) {
        this.l = z;
    }

    public void setWindowCallback(Window.Callback callback) {
        k();
        ((yi0) this.j).k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        k();
        yi0 yi0Var = (yi0) this.j;
        if (yi0Var.g) {
            return;
        }
        Toolbar toolbar = yi0Var.a;
        yi0Var.h = charSequence;
        if ((yi0Var.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (yi0Var.g) {
                hm0.n(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new c1(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        yi0 yi0Var = (yi0) this.j;
        yi0Var.d = drawable;
        yi0Var.c();
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // defpackage.r30
    public final void c(View view, int i, int i2, int[] iArr, int i3) {
    }
}
