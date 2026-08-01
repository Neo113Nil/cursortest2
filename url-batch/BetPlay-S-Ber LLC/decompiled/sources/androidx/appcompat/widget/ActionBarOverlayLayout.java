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
import com.awerser.monnit.betplay.R;
import defpackage.a1;
import defpackage.ac0;
import defpackage.au;
import defpackage.b1;
import defpackage.e90;
import defpackage.hb0;
import defpackage.ib0;
import defpackage.ie;
import defpackage.ip;
import defpackage.jb0;
import defpackage.k1;
import defpackage.kb0;
import defpackage.l60;
import defpackage.l70;
import defpackage.lb0;
import defpackage.mb0;
import defpackage.nb0;
import defpackage.o8;
import defpackage.ob0;
import defpackage.q60;
import defpackage.qu;
import defpackage.sv;
import defpackage.tv;
import defpackage.u90;
import defpackage.uv;
import defpackage.w80;
import defpackage.x0;
import defpackage.xa0;
import defpackage.xb0;
import defpackage.y0;
import defpackage.z0;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements sv, tv {
    public static final int[] H = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public static final ac0 I;
    public static final Rect J;
    public OverScroller A;
    public ViewPropertyAnimator B;
    public final x0 C;
    public final y0 D;
    public final y0 E;
    public final uv F;
    public final b1 G;
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
    public ac0 v;
    public ac0 w;
    public ac0 x;
    public ac0 y;
    public z0 z;

    static {
        int i = Build.VERSION.SDK_INT;
        ob0 nb0Var = i >= 36 ? new nb0() : i >= 35 ? new mb0() : i >= 34 ? new lb0() : i >= 31 ? new kb0() : i >= 30 ? new jb0() : i >= 29 ? new ib0() : new hb0();
        nb0Var.h(ip.c(0, 1, 0, 1));
        I = nb0Var.b();
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
        ac0 ac0Var = ac0.b;
        this.v = ac0Var;
        this.w = ac0Var;
        this.x = ac0Var;
        this.y = ac0Var;
        this.C = new x0(0, this);
        this.D = new y0(this, 0);
        this.E = new y0(this, 1);
        i(context);
        this.F = new uv();
        b1 b1Var = new b1(context);
        b1Var.setWillNotDraw(true);
        this.G = b1Var;
        addView(b1Var);
    }

    public static boolean g(View view, Rect rect, boolean z) {
        boolean z2;
        a1 a1Var = (a1) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) a1Var).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) a1Var).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) a1Var).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) a1Var).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) a1Var).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) a1Var).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) a1Var).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) a1Var).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    @Override // defpackage.sv
    public final void a(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // defpackage.sv
    public final void b(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a1;
    }

    @Override // defpackage.tv
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

    @Override // defpackage.sv
    public final void e(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // defpackage.sv
    public final boolean f(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a1(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a1(getContext(), attributeSet);
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
        uv uvVar = this.F;
        return uvVar.b | uvVar.a;
    }

    public CharSequence getTitle() {
        k();
        return ((q60) this.j).a.getTitle();
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
            ((q60) this.j).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((q60) this.j).getClass();
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
                    o8.t("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                    return;
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.j = wrapper;
        }
    }

    public final void l(Menu menu, qu quVar) {
        k();
        q60 q60Var = (q60) this.j;
        Toolbar toolbar = q60Var.a;
        if (q60Var.m == null) {
            q60Var.m = new k1(toolbar.getContext());
        }
        k1 k1Var = q60Var.m;
        k1Var.j = quVar;
        au auVar = (au) menu;
        if (auVar == null && toolbar.f == null) {
            return;
        }
        toolbar.h();
        au auVar2 = toolbar.f.u;
        if (auVar2 == auVar) {
            return;
        }
        if (auVar2 != null) {
            auVar2.r(toolbar.P);
            auVar2.r(toolbar.Q);
        }
        if (toolbar.Q == null) {
            toolbar.Q = new l60(toolbar);
        }
        k1Var.v = true;
        Context context = toolbar.o;
        if (auVar != null) {
            auVar.b(k1Var, context);
            auVar.b(toolbar.Q, toolbar.o);
        } else {
            k1Var.i(context, null);
            toolbar.Q.i(toolbar.o, null);
            k1Var.g();
            toolbar.Q.g();
        }
        toolbar.f.setPopupTheme(toolbar.p);
        toolbar.f.setPresenter(k1Var);
        toolbar.P = k1Var;
        toolbar.v();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        ac0 g = ac0.g(this, windowInsets);
        boolean g2 = g(this.i, new Rect(g.b(), g.d(), g.c(), g.a()), false);
        WeakHashMap weakHashMap = e90.a;
        Rect rect = this.r;
        w80.b(this, g, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        xb0 xb0Var = g.a;
        ac0 q = xb0Var.q(i, i2, i3, i4);
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
        return xb0Var.a().a.c().a.b().f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = e90.a;
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
                a1 a1Var = (a1) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) a1Var).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) a1Var).topMargin + paddingTop;
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
        a1 a1Var = (a1) this.i.getLayoutParams();
        int max = Math.max(0, this.i.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) a1Var).leftMargin + ((ViewGroup.MarginLayoutParams) a1Var).rightMargin);
        int max2 = Math.max(0, this.i.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) a1Var).topMargin + ((ViewGroup.MarginLayoutParams) a1Var).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.i.getMeasuredState());
        WeakHashMap weakHashMap = e90.a;
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
            b1 b1Var = this.G;
            ac0 ac0Var = I;
            Rect rect3 = this.u;
            w80.b(b1Var, ac0Var, rect3);
            if (!rect3.equals(J)) {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.x = this.x.a.q(0, measuredHeight, 0, 0);
                g(this.h, rect2, true);
                if (!this.y.equals(this.x)) {
                    ac0 ac0Var2 = this.x;
                    this.y = ac0Var2;
                    e90.b(this.h, ac0Var2);
                }
                measureChildWithMargins(this.h, i, 0, i2, 0);
                a1 a1Var2 = (a1) this.h.getLayoutParams();
                int max3 = Math.max(max, this.h.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) a1Var2).leftMargin + ((ViewGroup.MarginLayoutParams) a1Var2).rightMargin);
                int max4 = Math.max(max2, this.h.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) a1Var2).topMargin + ((ViewGroup.MarginLayoutParams) a1Var2).bottomMargin);
                int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.h.getMeasuredState());
                setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
            }
        }
        ip c = ip.c(this.x.b(), this.x.d() + measuredHeight, this.x.c(), this.x.a());
        ac0 ac0Var3 = this.x;
        int i3 = Build.VERSION.SDK_INT;
        ob0 nb0Var = i3 >= 36 ? new nb0(ac0Var3) : i3 >= 35 ? new mb0(ac0Var3) : i3 >= 34 ? new lb0(ac0Var3) : i3 >= 31 ? new kb0(ac0Var3) : i3 >= 30 ? new jb0(ac0Var3) : i3 >= 29 ? new ib0(ac0Var3) : new hb0(ac0Var3);
        nb0Var.h(c);
        this.x = nb0Var.b();
        g(this.h, rect2, true);
        if (!this.y.equals(this.x)) {
        }
        measureChildWithMargins(this.h, i, 0, i2, 0);
        a1 a1Var22 = (a1) this.h.getLayoutParams();
        int max32 = Math.max(max, this.h.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) a1Var22).leftMargin + ((ViewGroup.MarginLayoutParams) a1Var22).rightMargin);
        int max42 = Math.max(max2, this.h.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) a1Var22).topMargin + ((ViewGroup.MarginLayoutParams) a1Var22).bottomMargin);
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
        xa0 xa0Var;
        u90 u90Var;
        this.F.a = i;
        this.p = getActionBarHideOffset();
        h();
        z0 z0Var = this.z;
        if (z0Var == null || (u90Var = (xa0Var = (xa0) z0Var).s) == null) {
            return;
        }
        u90Var.a();
        xa0Var.s = null;
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
        z0 z0Var = this.z;
        if (z0Var != null) {
            xa0 xa0Var = (xa0) z0Var;
            xa0Var.o = !z2;
            if (z || !z2) {
                if (xa0Var.p) {
                    xa0Var.p = false;
                    xa0Var.f(true);
                }
            } else if (!xa0Var.p) {
                xa0Var.p = true;
                xa0Var.f(true);
            }
        }
        if ((i2 & 256) == 0 || this.z == null) {
            return;
        }
        WeakHashMap weakHashMap = e90.a;
        requestApplyInsets();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.g = i;
        z0 z0Var = this.z;
        if (z0Var != null) {
            ((xa0) z0Var).n = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        h();
        this.i.setTranslationY(-Math.max(0, Math.min(i, this.i.getHeight())));
    }

    public void setActionBarVisibilityCallback(z0 z0Var) {
        this.z = z0Var;
        if (getWindowToken() != null) {
            ((xa0) this.z).n = this.g;
            int i = this.q;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = e90.a;
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
        q60 q60Var = (q60) this.j;
        q60Var.d = i != 0 ? l70.p(q60Var.a.getContext(), i) : null;
        q60Var.c();
    }

    public void setLogo(int i) {
        k();
        q60 q60Var = (q60) this.j;
        q60Var.e = i != 0 ? l70.p(q60Var.a.getContext(), i) : null;
        q60Var.c();
    }

    public void setOverlayMode(boolean z) {
        this.l = z;
    }

    public void setWindowCallback(Window.Callback callback) {
        k();
        ((q60) this.j).k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        k();
        q60 q60Var = (q60) this.j;
        if (q60Var.g) {
            return;
        }
        Toolbar toolbar = q60Var.a;
        q60Var.h = charSequence;
        if ((q60Var.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (q60Var.g) {
                e90.n(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a1(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        q60 q60Var = (q60) this.j;
        q60Var.d = drawable;
        q60Var.c();
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // defpackage.sv
    public final void c(View view, int i, int i2, int[] iArr, int i3) {
    }
}
