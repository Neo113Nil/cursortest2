package androidx.appcompat.widget;

import A0.a;
import C.d;
import K.C0019o;
import K.D;
import K.F;
import K.InterfaceC0017m;
import K.InterfaceC0018n;
import K.Q;
import K.l0;
import K.m0;
import K.n0;
import K.o0;
import K.u0;
import K.w0;
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
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import c1.AbstractC0091d;
import com.fortunequest.neontrack.R;
import g.K;
import j.j;
import java.util.WeakHashMap;
import k.InterfaceC0201y;
import k.MenuC0189m;
import l.C0230e;
import l.C0232f;
import l.C0242k;
import l.InterfaceC0228d;
import l.InterfaceC0241j0;
import l.InterfaceC0243k0;
import l.RunnableC0226c;
import l.X0;
import l.c1;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0241j0, InterfaceC0017m, InterfaceC0018n {

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f1679C = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* renamed from: D, reason: collision with root package name */
    public static final w0 f1680D;

    /* renamed from: E, reason: collision with root package name */
    public static final Rect f1681E;

    /* renamed from: A, reason: collision with root package name */
    public final C0019o f1682A;

    /* renamed from: B, reason: collision with root package name */
    public final C0232f f1683B;

    /* renamed from: a, reason: collision with root package name */
    public int f1684a;

    /* renamed from: b, reason: collision with root package name */
    public int f1685b;

    /* renamed from: c, reason: collision with root package name */
    public ContentFrameLayout f1686c;
    public ActionBarContainer d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0243k0 f1687e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f1688f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1689g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1690j;

    /* renamed from: k, reason: collision with root package name */
    public int f1691k;

    /* renamed from: l, reason: collision with root package name */
    public int f1692l;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f1693m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f1694n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f1695o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f1696p;

    /* renamed from: q, reason: collision with root package name */
    public w0 f1697q;

    /* renamed from: r, reason: collision with root package name */
    public w0 f1698r;

    /* renamed from: s, reason: collision with root package name */
    public w0 f1699s;

    /* renamed from: t, reason: collision with root package name */
    public w0 f1700t;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC0228d f1701u;

    /* renamed from: v, reason: collision with root package name */
    public OverScroller f1702v;

    /* renamed from: w, reason: collision with root package name */
    public ViewPropertyAnimator f1703w;

    /* renamed from: x, reason: collision with root package name */
    public final a f1704x;

    /* renamed from: y, reason: collision with root package name */
    public final RunnableC0226c f1705y;

    /* renamed from: z, reason: collision with root package name */
    public final RunnableC0226c f1706z;

    static {
        int i = Build.VERSION.SDK_INT;
        o0 n0Var = i >= 30 ? new n0() : i >= 29 ? new m0() : new l0();
        n0Var.g(d.b(0, 1, 0, 1));
        f1680D = n0Var.b();
        f1681E = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1685b = 0;
        this.f1693m = new Rect();
        this.f1694n = new Rect();
        this.f1695o = new Rect();
        this.f1696p = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        w0 w0Var = w0.f667b;
        this.f1697q = w0Var;
        this.f1698r = w0Var;
        this.f1699s = w0Var;
        this.f1700t = w0Var;
        this.f1704x = new a(3, this);
        this.f1705y = new RunnableC0226c(this, 0);
        this.f1706z = new RunnableC0226c(this, 1);
        i(context);
        this.f1682A = new C0019o();
        C0232f c0232f = new C0232f(context);
        c0232f.setWillNotDraw(true);
        this.f1683B = c0232f;
        addView(c0232f);
    }

    public static boolean g(View view, Rect rect, boolean z2) {
        boolean z3;
        C0230e c0230e = (C0230e) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) c0230e).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) c0230e).leftMargin = i2;
            z3 = true;
        } else {
            z3 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) c0230e).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) c0230e).topMargin = i4;
            z3 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) c0230e).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) c0230e).rightMargin = i6;
            z3 = true;
        }
        if (z2) {
            int i7 = ((ViewGroup.MarginLayoutParams) c0230e).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) c0230e).bottomMargin = i8;
                return true;
            }
        }
        return z3;
    }

    @Override // K.InterfaceC0017m
    public final void a(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // K.InterfaceC0018n
    public final void b(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        c(view, i, i2, i3, i4, i5);
    }

    @Override // K.InterfaceC0017m
    public final void c(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0230e;
    }

    @Override // K.InterfaceC0017m
    public final void d(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f1688f != null) {
            if (this.d.getVisibility() == 0) {
                i = (int) (this.d.getTranslationY() + this.d.getBottom() + 0.5f);
            } else {
                i = 0;
            }
            this.f1688f.setBounds(0, i, getWidth(), this.f1688f.getIntrinsicHeight() + i);
            this.f1688f.draw(canvas);
        }
    }

    @Override // K.InterfaceC0017m
    public final void e(View view, int i, int i2, int[] iArr, int i3) {
    }

    @Override // K.InterfaceC0017m
    public final boolean f(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0230e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0230e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0019o c0019o = this.f1682A;
        return c0019o.f642b | c0019o.f641a;
    }

    public CharSequence getTitle() {
        k();
        return ((c1) this.f1687e).f3374a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f1705y);
        removeCallbacks(this.f1706z);
        ViewPropertyAnimator viewPropertyAnimator = this.f1703w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1679C);
        this.f1684a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1688f = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f1702v = new OverScroller(context);
    }

    public final void j(int i) {
        k();
        if (i == 2) {
            ((c1) this.f1687e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((c1) this.f1687e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        InterfaceC0243k0 wrapper;
        if (this.f1686c == null) {
            this.f1686c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof InterfaceC0243k0) {
                wrapper = (InterfaceC0243k0) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f1687e = wrapper;
        }
    }

    public final void l(MenuC0189m menuC0189m, InterfaceC0201y interfaceC0201y) {
        k();
        c1 c1Var = (c1) this.f1687e;
        C0242k c0242k = c1Var.f3383m;
        Toolbar toolbar = c1Var.f3374a;
        if (c0242k == null) {
            c1Var.f3383m = new C0242k(toolbar.getContext());
        }
        C0242k c0242k2 = c1Var.f3383m;
        c0242k2.f3411e = interfaceC0201y;
        if (menuC0189m == null && toolbar.f1747a == null) {
            return;
        }
        toolbar.f();
        MenuC0189m menuC0189m2 = toolbar.f1747a.f1707p;
        if (menuC0189m2 == menuC0189m) {
            return;
        }
        if (menuC0189m2 != null) {
            menuC0189m2.r(toolbar.f1740K);
            menuC0189m2.r(toolbar.f1741L);
        }
        if (toolbar.f1741L == null) {
            toolbar.f1741L = new X0(toolbar);
        }
        c0242k2.f3421q = true;
        if (menuC0189m != null) {
            menuC0189m.b(c0242k2, toolbar.f1753j);
            menuC0189m.b(toolbar.f1741L, toolbar.f1753j);
        } else {
            c0242k2.j(toolbar.f1753j, null);
            toolbar.f1741L.j(toolbar.f1753j, null);
            c0242k2.c();
            toolbar.f1741L.c();
        }
        toolbar.f1747a.setPopupTheme(toolbar.f1754k);
        toolbar.f1747a.setPresenter(c0242k2);
        toolbar.f1740K = c0242k2;
        toolbar.u();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        w0 g2 = w0.g(this, windowInsets);
        boolean g3 = g(this.d, new Rect(g2.b(), g2.d(), g2.c(), g2.a()), false);
        WeakHashMap weakHashMap = Q.f578a;
        Rect rect = this.f1693m;
        F.b(this, g2, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        u0 u0Var = g2.f668a;
        w0 l2 = u0Var.l(i, i2, i3, i4);
        this.f1697q = l2;
        boolean z2 = true;
        if (!this.f1698r.equals(l2)) {
            this.f1698r = this.f1697q;
            g3 = true;
        }
        Rect rect2 = this.f1694n;
        if (rect2.equals(rect)) {
            z2 = g3;
        } else {
            rect2.set(rect);
        }
        if (z2) {
            requestLayout();
        }
        return u0Var.a().f668a.c().f668a.b().f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = Q.f578a;
        D.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0230e c0230e = (C0230e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) c0230e).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) c0230e).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00fc  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        k();
        measureChildWithMargins(this.d, i, 0, i2, 0);
        C0230e c0230e = (C0230e) this.d.getLayoutParams();
        int max = Math.max(0, this.d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0230e).leftMargin + ((ViewGroup.MarginLayoutParams) c0230e).rightMargin);
        int max2 = Math.max(0, this.d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0230e).topMargin + ((ViewGroup.MarginLayoutParams) c0230e).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.d.getMeasuredState());
        WeakHashMap weakHashMap = Q.f578a;
        boolean z2 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z2) {
            measuredHeight = this.f1684a;
            if (this.h && this.d.getTabContainer() != null) {
                measuredHeight += this.f1684a;
            }
        } else {
            measuredHeight = this.d.getVisibility() != 8 ? this.d.getMeasuredHeight() : 0;
        }
        Rect rect = this.f1693m;
        Rect rect2 = this.f1695o;
        rect2.set(rect);
        this.f1699s = this.f1697q;
        if (!this.f1689g && !z2) {
            C0232f c0232f = this.f1683B;
            w0 w0Var = f1680D;
            Rect rect3 = this.f1696p;
            F.b(c0232f, w0Var, rect3);
            if (!rect3.equals(f1681E)) {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.f1699s = this.f1699s.f668a.l(0, measuredHeight, 0, 0);
                g(this.f1686c, rect2, true);
                if (!this.f1700t.equals(this.f1699s)) {
                    w0 w0Var2 = this.f1699s;
                    this.f1700t = w0Var2;
                    ContentFrameLayout contentFrameLayout = this.f1686c;
                    WindowInsets f2 = w0Var2.f();
                    if (f2 != null) {
                        WindowInsets a2 = D.a(contentFrameLayout, f2);
                        if (!a2.equals(f2)) {
                            w0.g(contentFrameLayout, a2);
                        }
                    }
                }
                measureChildWithMargins(this.f1686c, i, 0, i2, 0);
                C0230e c0230e2 = (C0230e) this.f1686c.getLayoutParams();
                int max3 = Math.max(max, this.f1686c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0230e2).leftMargin + ((ViewGroup.MarginLayoutParams) c0230e2).rightMargin);
                int max4 = Math.max(max2, this.f1686c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0230e2).topMargin + ((ViewGroup.MarginLayoutParams) c0230e2).bottomMargin);
                int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1686c.getMeasuredState());
                setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
            }
        }
        d b2 = d.b(this.f1699s.b(), this.f1699s.d() + measuredHeight, this.f1699s.c(), this.f1699s.a());
        w0 w0Var3 = this.f1699s;
        int i3 = Build.VERSION.SDK_INT;
        o0 n0Var = i3 >= 30 ? new n0(w0Var3) : i3 >= 29 ? new m0(w0Var3) : new l0(w0Var3);
        n0Var.g(b2);
        this.f1699s = n0Var.b();
        g(this.f1686c, rect2, true);
        if (!this.f1700t.equals(this.f1699s)) {
        }
        measureChildWithMargins(this.f1686c, i, 0, i2, 0);
        C0230e c0230e22 = (C0230e) this.f1686c.getLayoutParams();
        int max32 = Math.max(max, this.f1686c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0230e22).leftMargin + ((ViewGroup.MarginLayoutParams) c0230e22).rightMargin);
        int max42 = Math.max(max2, this.f1686c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0230e22).topMargin + ((ViewGroup.MarginLayoutParams) c0230e22).bottomMargin);
        int combineMeasuredStates22 = View.combineMeasuredStates(combineMeasuredStates, this.f1686c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max32, getSuggestedMinimumWidth()), i, combineMeasuredStates22), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max42, getSuggestedMinimumHeight()), i2, combineMeasuredStates22 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (!this.i || !z2) {
            return false;
        }
        this.f1702v.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f1702v.getFinalY() > this.d.getHeight()) {
            h();
            this.f1706z.run();
        } else {
            h();
            this.f1705y.run();
        }
        this.f1690j = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f1691k + i2;
        this.f1691k = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        K k2;
        j jVar;
        this.f1682A.f641a = i;
        this.f1691k = getActionBarHideOffset();
        h();
        InterfaceC0228d interfaceC0228d = this.f1701u;
        if (interfaceC0228d == null || (jVar = (k2 = (K) interfaceC0228d).f2632v) == null) {
            return;
        }
        jVar.a();
        k2.f2632v = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.d.getVisibility() != 0) {
            return false;
        }
        return this.i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.i || this.f1690j) {
            return;
        }
        if (this.f1691k <= this.d.getHeight()) {
            h();
            postDelayed(this.f1705y, 600L);
        } else {
            h();
            postDelayed(this.f1706z, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        k();
        int i2 = this.f1692l ^ i;
        this.f1692l = i;
        boolean z2 = (i & 4) == 0;
        boolean z3 = (i & 256) != 0;
        InterfaceC0228d interfaceC0228d = this.f1701u;
        if (interfaceC0228d != null) {
            K k2 = (K) interfaceC0228d;
            k2.f2628r = !z3;
            if (z2 || !z3) {
                if (k2.f2629s) {
                    k2.f2629s = false;
                    k2.I(true);
                }
            } else if (!k2.f2629s) {
                k2.f2629s = true;
                k2.I(true);
            }
        }
        if ((i2 & 256) == 0 || this.f1701u == null) {
            return;
        }
        WeakHashMap weakHashMap = Q.f578a;
        D.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f1685b = i;
        InterfaceC0228d interfaceC0228d = this.f1701u;
        if (interfaceC0228d != null) {
            ((K) interfaceC0228d).f2627q = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        h();
        this.d.setTranslationY(-Math.max(0, Math.min(i, this.d.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0228d interfaceC0228d) {
        this.f1701u = interfaceC0228d;
        if (getWindowToken() != null) {
            ((K) this.f1701u).f2627q = this.f1685b;
            int i = this.f1692l;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = Q.f578a;
                D.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z2) {
        this.h = z2;
    }

    public void setHideOnContentScrollEnabled(boolean z2) {
        if (z2 != this.i) {
            this.i = z2;
            if (z2) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        k();
        c1 c1Var = (c1) this.f1687e;
        c1Var.d = i != 0 ? AbstractC0091d.j(c1Var.f3374a.getContext(), i) : null;
        c1Var.c();
    }

    public void setLogo(int i) {
        k();
        c1 c1Var = (c1) this.f1687e;
        c1Var.f3377e = i != 0 ? AbstractC0091d.j(c1Var.f3374a.getContext(), i) : null;
        c1Var.c();
    }

    public void setOverlayMode(boolean z2) {
        this.f1689g = z2;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i) {
    }

    @Override // l.InterfaceC0241j0
    public void setWindowCallback(Window.Callback callback) {
        k();
        ((c1) this.f1687e).f3381k = callback;
    }

    @Override // l.InterfaceC0241j0
    public void setWindowTitle(CharSequence charSequence) {
        k();
        c1 c1Var = (c1) this.f1687e;
        if (c1Var.f3379g) {
            return;
        }
        c1Var.h = charSequence;
        if ((c1Var.f3375b & 8) != 0) {
            Toolbar toolbar = c1Var.f3374a;
            toolbar.setTitle(charSequence);
            if (c1Var.f3379g) {
                Q.m(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0230e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        c1 c1Var = (c1) this.f1687e;
        c1Var.d = drawable;
        c1Var.c();
    }
}
