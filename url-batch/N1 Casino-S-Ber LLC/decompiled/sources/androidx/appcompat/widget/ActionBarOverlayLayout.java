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
import com.derinko.gbini.n1casino.R;
import defpackage.ab0;
import defpackage.bb0;
import defpackage.bu;
import defpackage.cb0;
import defpackage.cv;
import defpackage.d60;
import defpackage.db0;
import defpackage.dv;
import defpackage.eb0;
import defpackage.ev;
import defpackage.fb0;
import defpackage.h1;
import defpackage.ie;
import defpackage.k60;
import defpackage.m90;
import defpackage.mt;
import defpackage.ob0;
import defpackage.p80;
import defpackage.qa0;
import defpackage.rb0;
import defpackage.t8;
import defpackage.to;
import defpackage.v0;
import defpackage.w0;
import defpackage.x0;
import defpackage.x80;
import defpackage.y0;
import defpackage.ya0;
import defpackage.z0;
import defpackage.za0;
import defpackage.zo;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements cv, dv {
    public static final int[] H = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public static final rb0 I;
    public static final Rect J;
    public OverScroller A;
    public ViewPropertyAnimator B;
    public final v0 C;
    public final w0 D;
    public final w0 E;
    public final ev F;
    public final z0 G;
    public int f;
    public int g;
    public ContentFrameLayout h;
    public ActionBarContainer i;
    public ie j;
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
    public rb0 v;
    public rb0 w;
    public rb0 x;
    public rb0 y;
    public x0 z;

    static {
        int i = Build.VERSION.SDK_INT;
        fb0 eb0Var = i >= 36 ? new eb0() : i >= 35 ? new db0() : i >= 34 ? new cb0() : i >= 31 ? new bb0() : i >= 30 ? new ab0() : i >= 29 ? new za0() : new ya0();
        eb0Var.h(to.c(0, 1, 0, 1));
        I = eb0Var.b();
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
        rb0 rb0Var = rb0.b;
        this.v = rb0Var;
        this.w = rb0Var;
        this.x = rb0Var;
        this.y = rb0Var;
        this.C = new v0(0, this);
        this.D = new w0(this, 0);
        this.E = new w0(this, 1);
        i(context);
        this.F = new ev();
        z0 z0Var = new z0(context);
        z0Var.setWillNotDraw(true);
        this.G = z0Var;
        addView(z0Var);
    }

    public static boolean g(View view, Rect rect, boolean z) {
        boolean z2;
        y0 y0Var = (y0) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) y0Var).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) y0Var).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) y0Var).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) y0Var).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) y0Var).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) y0Var).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) y0Var).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) y0Var).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    @Override // defpackage.cv
    public final void a(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // defpackage.cv
    public final void b(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof y0;
    }

    @Override // defpackage.dv
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

    @Override // defpackage.cv
    public final void e(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // defpackage.cv
    public final boolean f(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new y0(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new y0(getContext(), attributeSet);
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
        ev evVar = this.F;
        return evVar.b | evVar.a;
    }

    public CharSequence getTitle() {
        k();
        return ((k60) this.j).a.getTitle();
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
            ((k60) this.j).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((k60) this.j).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        ie wrapper;
        if (this.h == null) {
            this.h = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.i = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof ie) {
                wrapper = (ie) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    t8.t("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                    return;
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.j = wrapper;
        }
    }

    public final void l(Menu menu, bu buVar) {
        k();
        k60 k60Var = (k60) this.j;
        Toolbar toolbar = k60Var.a;
        if (k60Var.m == null) {
            k60Var.m = new h1(toolbar.getContext());
        }
        h1 h1Var = k60Var.m;
        h1Var.j = buVar;
        mt mtVar = (mt) menu;
        if (mtVar == null && toolbar.f == null) {
            return;
        }
        toolbar.f();
        mt mtVar2 = toolbar.f.u;
        if (mtVar2 == mtVar) {
            return;
        }
        if (mtVar2 != null) {
            mtVar2.r(toolbar.Q);
            mtVar2.r(toolbar.R);
        }
        if (toolbar.R == null) {
            toolbar.R = new d60(toolbar);
        }
        h1Var.v = true;
        Context context = toolbar.o;
        if (mtVar != null) {
            mtVar.b(h1Var, context);
            mtVar.b(toolbar.R, toolbar.o);
        } else {
            h1Var.i(context, null);
            toolbar.R.i(toolbar.o, null);
            h1Var.g();
            toolbar.R.g();
        }
        toolbar.f.setPopupTheme(toolbar.p);
        toolbar.f.setPresenter(h1Var);
        toolbar.Q = h1Var;
        toolbar.v();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        rb0 g = rb0.g(this, windowInsets);
        boolean g2 = g(this.i, new Rect(g.b(), g.d(), g.c(), g.a()), false);
        WeakHashMap weakHashMap = x80.a;
        Rect rect = this.r;
        p80.b(this, g, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        ob0 ob0Var = g.a;
        rb0 q = ob0Var.q(i, i2, i3, i4);
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
        return ob0Var.a().a.c().a.b().f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = x80.a;
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
                y0 y0Var = (y0) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) y0Var).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) y0Var).topMargin + paddingTop;
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
        y0 y0Var = (y0) this.i.getLayoutParams();
        int max = Math.max(0, this.i.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) y0Var).leftMargin + ((ViewGroup.MarginLayoutParams) y0Var).rightMargin);
        int max2 = Math.max(0, this.i.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) y0Var).topMargin + ((ViewGroup.MarginLayoutParams) y0Var).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.i.getMeasuredState());
        WeakHashMap weakHashMap = x80.a;
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
            z0 z0Var = this.G;
            rb0 rb0Var = I;
            Rect rect3 = this.u;
            p80.b(z0Var, rb0Var, rect3);
            if (!rect3.equals(J)) {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.x = this.x.a.q(0, measuredHeight, 0, 0);
                g(this.h, rect2, true);
                if (!this.y.equals(this.x)) {
                    rb0 rb0Var2 = this.x;
                    this.y = rb0Var2;
                    x80.b(this.h, rb0Var2);
                }
                measureChildWithMargins(this.h, i, 0, i2, 0);
                y0 y0Var2 = (y0) this.h.getLayoutParams();
                int max3 = Math.max(max, this.h.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) y0Var2).leftMargin + ((ViewGroup.MarginLayoutParams) y0Var2).rightMargin);
                int max4 = Math.max(max2, this.h.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) y0Var2).topMargin + ((ViewGroup.MarginLayoutParams) y0Var2).bottomMargin);
                int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.h.getMeasuredState());
                setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
            }
        }
        to c = to.c(this.x.b(), this.x.d() + measuredHeight, this.x.c(), this.x.a());
        rb0 rb0Var3 = this.x;
        int i3 = Build.VERSION.SDK_INT;
        fb0 eb0Var = i3 >= 36 ? new eb0(rb0Var3) : i3 >= 35 ? new db0(rb0Var3) : i3 >= 34 ? new cb0(rb0Var3) : i3 >= 31 ? new bb0(rb0Var3) : i3 >= 30 ? new ab0(rb0Var3) : i3 >= 29 ? new za0(rb0Var3) : new ya0(rb0Var3);
        eb0Var.h(c);
        this.x = eb0Var.b();
        g(this.h, rect2, true);
        if (!this.y.equals(this.x)) {
        }
        measureChildWithMargins(this.h, i, 0, i2, 0);
        y0 y0Var22 = (y0) this.h.getLayoutParams();
        int max32 = Math.max(max, this.h.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) y0Var22).leftMargin + ((ViewGroup.MarginLayoutParams) y0Var22).rightMargin);
        int max42 = Math.max(max2, this.h.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) y0Var22).topMargin + ((ViewGroup.MarginLayoutParams) y0Var22).bottomMargin);
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
        qa0 qa0Var;
        m90 m90Var;
        this.F.a = i;
        this.p = getActionBarHideOffset();
        h();
        x0 x0Var = this.z;
        if (x0Var == null || (m90Var = (qa0Var = (qa0) x0Var).K) == null) {
            return;
        }
        m90Var.a();
        qa0Var.K = null;
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
        x0 x0Var = this.z;
        if (x0Var != null) {
            qa0 qa0Var = (qa0) x0Var;
            qa0Var.G = !z2;
            if (z || !z2) {
                if (qa0Var.H) {
                    qa0Var.H = false;
                    qa0Var.I0(true);
                }
            } else if (!qa0Var.H) {
                qa0Var.H = true;
                qa0Var.I0(true);
            }
        }
        if ((i2 & 256) == 0 || this.z == null) {
            return;
        }
        WeakHashMap weakHashMap = x80.a;
        requestApplyInsets();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.g = i;
        x0 x0Var = this.z;
        if (x0Var != null) {
            ((qa0) x0Var).F = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        h();
        this.i.setTranslationY(-Math.max(0, Math.min(i, this.i.getHeight())));
    }

    public void setActionBarVisibilityCallback(x0 x0Var) {
        this.z = x0Var;
        if (getWindowToken() != null) {
            ((qa0) this.z).F = this.g;
            int i = this.q;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = x80.a;
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
        k60 k60Var = (k60) this.j;
        k60Var.d = i != 0 ? zo.s(k60Var.a.getContext(), i) : null;
        k60Var.c();
    }

    public void setLogo(int i) {
        k();
        k60 k60Var = (k60) this.j;
        k60Var.e = i != 0 ? zo.s(k60Var.a.getContext(), i) : null;
        k60Var.c();
    }

    public void setOverlayMode(boolean z) {
        this.l = z;
    }

    public void setWindowCallback(Window.Callback callback) {
        k();
        ((k60) this.j).k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        k();
        k60 k60Var = (k60) this.j;
        if (k60Var.g) {
            return;
        }
        Toolbar toolbar = k60Var.a;
        k60Var.h = charSequence;
        if ((k60Var.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (k60Var.g) {
                x80.n(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new y0(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        k60 k60Var = (k60) this.j;
        k60Var.d = drawable;
        k60Var.c();
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // defpackage.cv
    public final void c(View view, int i, int i2, int[] iArr, int i3) {
    }
}
