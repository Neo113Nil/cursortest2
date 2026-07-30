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
import androidx.core.widget.NestedScrollView;
import com.majelw.libystne.R;
import defpackage.ak0;
import defpackage.c83;
import defpackage.e3;
import defpackage.e53;
import defpackage.ey2;
import defpackage.fk1;
import defpackage.j73;
import defpackage.j8;
import defpackage.k73;
import defpackage.ky2;
import defpackage.l73;
import defpackage.lh;
import defpackage.m73;
import defpackage.n73;
import defpackage.o73;
import defpackage.p73;
import defpackage.q73;
import defpackage.qr1;
import defpackage.rr1;
import defpackage.t2;
import defpackage.u2;
import defpackage.u70;
import defpackage.v2;
import defpackage.w2;
import defpackage.w63;
import defpackage.x2;
import defpackage.x43;
import defpackage.x53;
import defpackage.yk1;
import defpackage.z21;
import defpackage.z73;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements qr1, rr1 {
    public static final int[] O = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public static final c83 P;
    public static final Rect Q;
    public final Rect A;
    public final Rect B;
    public c83 C;
    public c83 D;
    public c83 E;
    public c83 F;
    public v2 G;
    public OverScroller H;
    public ViewPropertyAnimator I;
    public final t2 J;
    public final u2 K;
    public final u2 L;
    public final ak0 M;
    public final x2 N;
    public int m;
    public int n;
    public ContentFrameLayout o;
    public ActionBarContainer p;
    public u70 q;
    public Drawable r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public int w;
    public int x;
    public final Rect y;
    public final Rect z;

    static {
        int i = Build.VERSION.SDK_INT;
        q73 p73Var = i >= 36 ? new p73() : i >= 35 ? new o73() : i >= 34 ? new n73() : i >= 31 ? new m73() : i >= 30 ? new l73() : i >= 29 ? new k73() : new j73();
        p73Var.h(z21.b(0, 1, 0, 1));
        P = p73Var.b();
        Q = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.n = 0;
        this.y = new Rect();
        this.z = new Rect();
        this.A = new Rect();
        this.B = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        c83 c83Var = c83.b;
        this.C = c83Var;
        this.D = c83Var;
        this.E = c83Var;
        this.F = c83Var;
        this.J = new t2(this);
        this.K = new u2(this, 0);
        this.L = new u2(this, 1);
        i(context);
        this.M = new ak0();
        x2 x2Var = new x2(context);
        x2Var.setWillNotDraw(true);
        this.N = x2Var;
        addView(x2Var);
    }

    public static boolean g(View view, Rect rect, boolean z) {
        boolean z2;
        w2 w2Var = (w2) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) w2Var).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) w2Var).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) w2Var).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) w2Var).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) w2Var).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) w2Var).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) w2Var).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) w2Var).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    @Override // defpackage.qr1
    public final void a(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // defpackage.qr1
    public final void b(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // defpackage.rr1
    public final void c(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        d(nestedScrollView, i, i2, i3, i4, i5);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof w2;
    }

    @Override // defpackage.qr1
    public final void d(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(nestedScrollView, i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.r != null) {
            if (this.p.getVisibility() == 0) {
                i = (int) (this.p.getTranslationY() + this.p.getBottom() + 0.5f);
            } else {
                i = 0;
            }
            this.r.setBounds(0, i, getWidth(), this.r.getIntrinsicHeight() + i);
            this.r.draw(canvas);
        }
    }

    @Override // defpackage.qr1
    public final boolean f(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new w2(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new w2(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.p;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        ak0 ak0Var = this.M;
        return ak0Var.n | ak0Var.m;
    }

    public CharSequence getTitle() {
        k();
        return ((ky2) this.q).a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.K);
        removeCallbacks(this.L);
        ViewPropertyAnimator viewPropertyAnimator = this.I;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(O);
        this.m = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.r = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.H = new OverScroller(context);
    }

    public final void j(int i) {
        k();
        if (i == 2) {
            ((ky2) this.q).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((ky2) this.q).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        u70 wrapper;
        if (this.o == null) {
            this.o = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.p = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof u70) {
                wrapper = (u70) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    lh.g("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                    return;
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.q = wrapper;
        }
    }

    public final void l(Menu menu, yk1 yk1Var) {
        k();
        ky2 ky2Var = (ky2) this.q;
        Toolbar toolbar = ky2Var.a;
        if (ky2Var.m == null) {
            ky2Var.m = new e3(toolbar.getContext());
        }
        e3 e3Var = ky2Var.m;
        e3Var.q = yk1Var;
        fk1 fk1Var = (fk1) menu;
        if (fk1Var == null && toolbar.m == null) {
            return;
        }
        toolbar.f();
        fk1 fk1Var2 = toolbar.m.B;
        if (fk1Var2 == fk1Var) {
            return;
        }
        if (fk1Var2 != null) {
            fk1Var2.r(toolbar.W);
            fk1Var2.r(toolbar.a0);
        }
        if (toolbar.a0 == null) {
            toolbar.a0 = new ey2(toolbar);
        }
        e3Var.C = true;
        Context context = toolbar.v;
        if (fk1Var != null) {
            fk1Var.b(e3Var, context);
            fk1Var.b(toolbar.a0, toolbar.v);
        } else {
            e3Var.i(context, null);
            toolbar.a0.i(toolbar.v, null);
            e3Var.g();
            toolbar.a0.g();
        }
        toolbar.m.setPopupTheme(toolbar.w);
        toolbar.m.setPresenter(e3Var);
        toolbar.W = e3Var;
        toolbar.t();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        c83 c = c83.c(this, windowInsets);
        z73 z73Var = c.a;
        boolean g = g(this.p, new Rect(z73Var.m().a, z73Var.m().b, z73Var.m().c, z73Var.m().d), false);
        WeakHashMap weakHashMap = e53.a;
        Rect rect = this.y;
        x43.b(this, c, rect);
        c83 q = z73Var.q(rect.left, rect.top, rect.right, rect.bottom);
        this.C = q;
        boolean z = true;
        if (!this.D.equals(q)) {
            this.D = this.C;
            g = true;
        }
        Rect rect2 = this.z;
        if (rect2.equals(rect)) {
            z = g;
        } else {
            rect2.set(rect);
        }
        if (z) {
            requestLayout();
        }
        return z73Var.a().a.c().a.b().b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = e53.a;
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
                w2 w2Var = (w2) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) w2Var).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) w2Var).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0135  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        k();
        measureChildWithMargins(this.p, i, 0, i2, 0);
        w2 w2Var = (w2) this.p.getLayoutParams();
        int max = Math.max(0, this.p.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) w2Var).leftMargin + ((ViewGroup.MarginLayoutParams) w2Var).rightMargin);
        int max2 = Math.max(0, this.p.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) w2Var).topMargin + ((ViewGroup.MarginLayoutParams) w2Var).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.p.getMeasuredState());
        WeakHashMap weakHashMap = e53.a;
        boolean z = (getWindowSystemUiVisibility() & 256) != 0;
        if (z) {
            measuredHeight = this.m;
            if (this.t && this.p.getTabContainer() != null) {
                measuredHeight += this.m;
            }
        } else {
            measuredHeight = this.p.getVisibility() != 8 ? this.p.getMeasuredHeight() : 0;
        }
        Rect rect = this.y;
        Rect rect2 = this.A;
        rect2.set(rect);
        this.E = this.C;
        if (!this.s && !z) {
            x2 x2Var = this.N;
            c83 c83Var = P;
            Rect rect3 = this.B;
            x43.b(x2Var, c83Var, rect3);
            if (!rect3.equals(Q)) {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.E = this.E.a.q(0, measuredHeight, 0, 0);
                g(this.o, rect2, true);
                if (!this.F.equals(this.E)) {
                    c83 c83Var2 = this.E;
                    this.F = c83Var2;
                    e53.b(this.o, c83Var2);
                }
                measureChildWithMargins(this.o, i, 0, i2, 0);
                w2 w2Var2 = (w2) this.o.getLayoutParams();
                int max3 = Math.max(max, this.o.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) w2Var2).leftMargin + ((ViewGroup.MarginLayoutParams) w2Var2).rightMargin);
                int max4 = Math.max(max2, this.o.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) w2Var2).topMargin + ((ViewGroup.MarginLayoutParams) w2Var2).bottomMargin);
                int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.o.getMeasuredState());
                setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
            }
        }
        z21 b = z21.b(this.E.a.m().a, this.E.a.m().b + measuredHeight, this.E.a.m().c, this.E.a.m().d);
        c83 c83Var3 = this.E;
        int i3 = Build.VERSION.SDK_INT;
        q73 p73Var = i3 >= 36 ? new p73(c83Var3) : i3 >= 35 ? new o73(c83Var3) : i3 >= 34 ? new n73(c83Var3) : i3 >= 31 ? new m73(c83Var3) : i3 >= 30 ? new l73(c83Var3) : i3 >= 29 ? new k73(c83Var3) : new j73(c83Var3);
        p73Var.h(b);
        this.E = p73Var.b();
        g(this.o, rect2, true);
        if (!this.F.equals(this.E)) {
        }
        measureChildWithMargins(this.o, i, 0, i2, 0);
        w2 w2Var22 = (w2) this.o.getLayoutParams();
        int max32 = Math.max(max, this.o.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) w2Var22).leftMargin + ((ViewGroup.MarginLayoutParams) w2Var22).rightMargin);
        int max42 = Math.max(max2, this.o.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) w2Var22).topMargin + ((ViewGroup.MarginLayoutParams) w2Var22).bottomMargin);
        int combineMeasuredStates22 = View.combineMeasuredStates(combineMeasuredStates, this.o.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max32, getSuggestedMinimumWidth()), i, combineMeasuredStates22), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max42, getSuggestedMinimumHeight()), i2, combineMeasuredStates22 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.u || !z) {
            return false;
        }
        this.H.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.H.getFinalY() > this.p.getHeight()) {
            h();
            this.L.run();
        } else {
            h();
            this.K.run();
        }
        this.v = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.w + i2;
        this.w = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        w63 w63Var;
        x53 x53Var;
        this.M.m = i;
        this.w = getActionBarHideOffset();
        h();
        v2 v2Var = this.G;
        if (v2Var == null || (x53Var = (w63Var = (w63) v2Var).s) == null) {
            return;
        }
        x53Var.a();
        w63Var.s = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.p.getVisibility() != 0) {
            return false;
        }
        return this.u;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.u || this.v) {
            return;
        }
        if (this.w <= this.p.getHeight()) {
            h();
            postDelayed(this.K, 600L);
        } else {
            h();
            postDelayed(this.L, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        k();
        int i2 = this.x ^ i;
        this.x = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        v2 v2Var = this.G;
        if (v2Var != null) {
            w63 w63Var = (w63) v2Var;
            w63Var.o = !z2;
            if (z || !z2) {
                if (w63Var.p) {
                    w63Var.p = false;
                    w63Var.f(true);
                }
            } else if (!w63Var.p) {
                w63Var.p = true;
                w63Var.f(true);
            }
        }
        if ((i2 & 256) == 0 || this.G == null) {
            return;
        }
        WeakHashMap weakHashMap = e53.a;
        requestApplyInsets();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.n = i;
        v2 v2Var = this.G;
        if (v2Var != null) {
            ((w63) v2Var).n = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        h();
        this.p.setTranslationY(-Math.max(0, Math.min(i, this.p.getHeight())));
    }

    public void setActionBarVisibilityCallback(v2 v2Var) {
        this.G = v2Var;
        if (getWindowToken() != null) {
            ((w63) this.G).n = this.n;
            int i = this.x;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = e53.a;
                requestApplyInsets();
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.t = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.u) {
            this.u = z;
            if (z) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        k();
        ky2 ky2Var = (ky2) this.q;
        ky2Var.d = i != 0 ? j8.F(ky2Var.a.getContext(), i) : null;
        ky2Var.c();
    }

    public void setLogo(int i) {
        k();
        ky2 ky2Var = (ky2) this.q;
        ky2Var.e = i != 0 ? j8.F(ky2Var.a.getContext(), i) : null;
        ky2Var.c();
    }

    public void setOverlayMode(boolean z) {
        this.s = z;
    }

    public void setWindowCallback(Window.Callback callback) {
        k();
        ((ky2) this.q).k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        k();
        ky2 ky2Var = (ky2) this.q;
        if (ky2Var.g) {
            return;
        }
        Toolbar toolbar = ky2Var.a;
        ky2Var.h = charSequence;
        if ((ky2Var.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (ky2Var.g) {
                e53.j(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new w2(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        ky2 ky2Var = (ky2) this.q;
        ky2Var.d = drawable;
        ky2Var.c();
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // defpackage.qr1
    public final void e(int i, int i2, int i3, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }
}
