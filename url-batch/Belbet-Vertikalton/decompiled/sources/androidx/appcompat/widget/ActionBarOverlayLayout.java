package androidx.appcompat.widget;

import E.c;
import H1.d;
import I0.i;
import M.C;
import M.C0019o;
import M.E;
import M.InterfaceC0017m;
import M.InterfaceC0018n;
import M.P;
import M.i0;
import M.j0;
import M.k0;
import M.l0;
import M.r0;
import M.t0;
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
import com.winpower.neonfit.R;
import h.K;
import java.util.WeakHashMap;
import l.j;
import m.InterfaceC0240x;
import m.MenuC0229m;
import n.C0270e;
import n.C0272f;
import n.C0282k;
import n.InterfaceC0268d;
import n.InterfaceC0283k0;
import n.InterfaceC0285l0;
import n.RunnableC0266c;
import n.d1;
import n.i1;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0283k0, InterfaceC0017m, InterfaceC0018n {

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f1725C = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* renamed from: D, reason: collision with root package name */
    public static final t0 f1726D;

    /* renamed from: E, reason: collision with root package name */
    public static final Rect f1727E;

    /* renamed from: A, reason: collision with root package name */
    public final C0019o f1728A;

    /* renamed from: B, reason: collision with root package name */
    public final C0272f f1729B;

    /* renamed from: a, reason: collision with root package name */
    public int f1730a;

    /* renamed from: b, reason: collision with root package name */
    public int f1731b;

    /* renamed from: c, reason: collision with root package name */
    public ContentFrameLayout f1732c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContainer f1733d;
    public InterfaceC0285l0 e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f1734f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1735g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1736h;
    public boolean i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public int f1737k;

    /* renamed from: l, reason: collision with root package name */
    public int f1738l;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f1739m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f1740n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f1741o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f1742p;

    /* renamed from: q, reason: collision with root package name */
    public t0 f1743q;

    /* renamed from: r, reason: collision with root package name */
    public t0 f1744r;

    /* renamed from: s, reason: collision with root package name */
    public t0 f1745s;

    /* renamed from: t, reason: collision with root package name */
    public t0 f1746t;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC0268d f1747u;

    /* renamed from: v, reason: collision with root package name */
    public OverScroller f1748v;

    /* renamed from: w, reason: collision with root package name */
    public ViewPropertyAnimator f1749w;

    /* renamed from: x, reason: collision with root package name */
    public final i f1750x;

    /* renamed from: y, reason: collision with root package name */
    public final RunnableC0266c f1751y;

    /* renamed from: z, reason: collision with root package name */
    public final RunnableC0266c f1752z;

    static {
        int i = Build.VERSION.SDK_INT;
        l0 k0Var = i >= 30 ? new k0() : i >= 29 ? new j0() : new i0();
        k0Var.g(c.b(0, 1, 0, 1));
        f1726D = k0Var.b();
        f1727E = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1731b = 0;
        this.f1739m = new Rect();
        this.f1740n = new Rect();
        this.f1741o = new Rect();
        this.f1742p = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        t0 t0Var = t0.f793b;
        this.f1743q = t0Var;
        this.f1744r = t0Var;
        this.f1745s = t0Var;
        this.f1746t = t0Var;
        this.f1750x = new i(4, this);
        this.f1751y = new RunnableC0266c(this, 0);
        this.f1752z = new RunnableC0266c(this, 1);
        i(context);
        this.f1728A = new C0019o();
        C0272f c0272f = new C0272f(context);
        c0272f.setWillNotDraw(true);
        this.f1729B = c0272f;
        addView(c0272f);
    }

    public static boolean g(View view, Rect rect, boolean z2) {
        boolean z3;
        C0270e c0270e = (C0270e) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) c0270e).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) c0270e).leftMargin = i2;
            z3 = true;
        } else {
            z3 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) c0270e).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) c0270e).topMargin = i4;
            z3 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) c0270e).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) c0270e).rightMargin = i6;
            z3 = true;
        }
        if (z2) {
            int i7 = ((ViewGroup.MarginLayoutParams) c0270e).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) c0270e).bottomMargin = i8;
                return true;
            }
        }
        return z3;
    }

    @Override // M.InterfaceC0017m
    public final void a(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // M.InterfaceC0018n
    public final void b(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        c(view, i, i2, i3, i4, i5);
    }

    @Override // M.InterfaceC0017m
    public final void c(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0270e;
    }

    @Override // M.InterfaceC0017m
    public final void d(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f1734f != null) {
            if (this.f1733d.getVisibility() == 0) {
                i = (int) (this.f1733d.getTranslationY() + this.f1733d.getBottom() + 0.5f);
            } else {
                i = 0;
            }
            this.f1734f.setBounds(0, i, getWidth(), this.f1734f.getIntrinsicHeight() + i);
            this.f1734f.draw(canvas);
        }
    }

    @Override // M.InterfaceC0017m
    public final void e(View view, int i, int i2, int[] iArr, int i3) {
    }

    @Override // M.InterfaceC0017m
    public final boolean f(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0270e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0270e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1733d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0019o c0019o = this.f1728A;
        return c0019o.f782b | c0019o.f781a;
    }

    public CharSequence getTitle() {
        k();
        return ((i1) this.e).f3637a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f1751y);
        removeCallbacks(this.f1752z);
        ViewPropertyAnimator viewPropertyAnimator = this.f1749w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1725C);
        this.f1730a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1734f = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f1748v = new OverScroller(context);
    }

    public final void j(int i) {
        k();
        if (i == 2) {
            ((i1) this.e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((i1) this.e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        InterfaceC0285l0 wrapper;
        if (this.f1732c == null) {
            this.f1732c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f1733d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof InterfaceC0285l0) {
                wrapper = (InterfaceC0285l0) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.e = wrapper;
        }
    }

    public final void l(MenuC0229m menuC0229m, InterfaceC0240x interfaceC0240x) {
        k();
        i1 i1Var = (i1) this.e;
        C0282k c0282k = i1Var.f3646m;
        Toolbar toolbar = i1Var.f3637a;
        if (c0282k == null) {
            i1Var.f3646m = new C0282k(toolbar.getContext());
        }
        C0282k c0282k2 = i1Var.f3646m;
        c0282k2.e = interfaceC0240x;
        if (menuC0229m == null && toolbar.f1793a == null) {
            return;
        }
        toolbar.f();
        MenuC0229m menuC0229m2 = toolbar.f1793a.f1753p;
        if (menuC0229m2 == menuC0229m) {
            return;
        }
        if (menuC0229m2 != null) {
            menuC0229m2.r(toolbar.f1786K);
            menuC0229m2.r(toolbar.f1787L);
        }
        if (toolbar.f1787L == null) {
            toolbar.f1787L = new d1(toolbar);
        }
        c0282k2.f3663q = true;
        if (menuC0229m != null) {
            menuC0229m.b(c0282k2, toolbar.j);
            menuC0229m.b(toolbar.f1787L, toolbar.j);
        } else {
            c0282k2.f(toolbar.j, null);
            toolbar.f1787L.f(toolbar.j, null);
            c0282k2.d();
            toolbar.f1787L.d();
        }
        toolbar.f1793a.setPopupTheme(toolbar.f1800k);
        toolbar.f1793a.setPresenter(c0282k2);
        toolbar.f1786K = c0282k2;
        toolbar.u();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        t0 g2 = t0.g(this, windowInsets);
        boolean g3 = g(this.f1733d, new Rect(g2.b(), g2.d(), g2.c(), g2.a()), false);
        WeakHashMap weakHashMap = P.f711a;
        Rect rect = this.f1739m;
        E.b(this, g2, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        r0 r0Var = g2.f794a;
        t0 l2 = r0Var.l(i, i2, i3, i4);
        this.f1743q = l2;
        boolean z2 = true;
        if (!this.f1744r.equals(l2)) {
            this.f1744r = this.f1743q;
            g3 = true;
        }
        Rect rect2 = this.f1740n;
        if (rect2.equals(rect)) {
            z2 = g3;
        } else {
            rect2.set(rect);
        }
        if (z2) {
            requestLayout();
        }
        return r0Var.a().f794a.c().f794a.b().f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = P.f711a;
        C.c(this);
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
                C0270e c0270e = (C0270e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) c0270e).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) c0270e).topMargin + paddingTop;
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
        measureChildWithMargins(this.f1733d, i, 0, i2, 0);
        C0270e c0270e = (C0270e) this.f1733d.getLayoutParams();
        int max = Math.max(0, this.f1733d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0270e).leftMargin + ((ViewGroup.MarginLayoutParams) c0270e).rightMargin);
        int max2 = Math.max(0, this.f1733d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0270e).topMargin + ((ViewGroup.MarginLayoutParams) c0270e).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f1733d.getMeasuredState());
        WeakHashMap weakHashMap = P.f711a;
        boolean z2 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z2) {
            measuredHeight = this.f1730a;
            if (this.f1736h && this.f1733d.getTabContainer() != null) {
                measuredHeight += this.f1730a;
            }
        } else {
            measuredHeight = this.f1733d.getVisibility() != 8 ? this.f1733d.getMeasuredHeight() : 0;
        }
        Rect rect = this.f1739m;
        Rect rect2 = this.f1741o;
        rect2.set(rect);
        this.f1745s = this.f1743q;
        if (!this.f1735g && !z2) {
            C0272f c0272f = this.f1729B;
            t0 t0Var = f1726D;
            Rect rect3 = this.f1742p;
            E.b(c0272f, t0Var, rect3);
            if (!rect3.equals(f1727E)) {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.f1745s = this.f1745s.f794a.l(0, measuredHeight, 0, 0);
                g(this.f1732c, rect2, true);
                if (!this.f1746t.equals(this.f1745s)) {
                    t0 t0Var2 = this.f1745s;
                    this.f1746t = t0Var2;
                    ContentFrameLayout contentFrameLayout = this.f1732c;
                    WindowInsets f2 = t0Var2.f();
                    if (f2 != null) {
                        WindowInsets a2 = C.a(contentFrameLayout, f2);
                        if (!a2.equals(f2)) {
                            t0.g(contentFrameLayout, a2);
                        }
                    }
                }
                measureChildWithMargins(this.f1732c, i, 0, i2, 0);
                C0270e c0270e2 = (C0270e) this.f1732c.getLayoutParams();
                int max3 = Math.max(max, this.f1732c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0270e2).leftMargin + ((ViewGroup.MarginLayoutParams) c0270e2).rightMargin);
                int max4 = Math.max(max2, this.f1732c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0270e2).topMargin + ((ViewGroup.MarginLayoutParams) c0270e2).bottomMargin);
                int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1732c.getMeasuredState());
                setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
            }
        }
        c b2 = c.b(this.f1745s.b(), this.f1745s.d() + measuredHeight, this.f1745s.c(), this.f1745s.a());
        t0 t0Var3 = this.f1745s;
        int i3 = Build.VERSION.SDK_INT;
        l0 k0Var = i3 >= 30 ? new k0(t0Var3) : i3 >= 29 ? new j0(t0Var3) : new i0(t0Var3);
        k0Var.g(b2);
        this.f1745s = k0Var.b();
        g(this.f1732c, rect2, true);
        if (!this.f1746t.equals(this.f1745s)) {
        }
        measureChildWithMargins(this.f1732c, i, 0, i2, 0);
        C0270e c0270e22 = (C0270e) this.f1732c.getLayoutParams();
        int max32 = Math.max(max, this.f1732c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0270e22).leftMargin + ((ViewGroup.MarginLayoutParams) c0270e22).rightMargin);
        int max42 = Math.max(max2, this.f1732c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0270e22).topMargin + ((ViewGroup.MarginLayoutParams) c0270e22).bottomMargin);
        int combineMeasuredStates22 = View.combineMeasuredStates(combineMeasuredStates, this.f1732c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max32, getSuggestedMinimumWidth()), i, combineMeasuredStates22), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max42, getSuggestedMinimumHeight()), i2, combineMeasuredStates22 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (!this.i || !z2) {
            return false;
        }
        this.f1748v.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f1748v.getFinalY() > this.f1733d.getHeight()) {
            h();
            this.f1752z.run();
        } else {
            h();
            this.f1751y.run();
        }
        this.j = true;
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
        int i5 = this.f1737k + i2;
        this.f1737k = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        K k2;
        j jVar;
        this.f1728A.f781a = i;
        this.f1737k = getActionBarHideOffset();
        h();
        InterfaceC0268d interfaceC0268d = this.f1747u;
        if (interfaceC0268d == null || (jVar = (k2 = (K) interfaceC0268d).f2764w) == null) {
            return;
        }
        jVar.a();
        k2.f2764w = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f1733d.getVisibility() != 0) {
            return false;
        }
        return this.i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.i || this.j) {
            return;
        }
        if (this.f1737k <= this.f1733d.getHeight()) {
            h();
            postDelayed(this.f1751y, 600L);
        } else {
            h();
            postDelayed(this.f1752z, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        k();
        int i2 = this.f1738l ^ i;
        this.f1738l = i;
        boolean z2 = (i & 4) == 0;
        boolean z3 = (i & 256) != 0;
        InterfaceC0268d interfaceC0268d = this.f1747u;
        if (interfaceC0268d != null) {
            K k2 = (K) interfaceC0268d;
            k2.f2760s = !z3;
            if (z2 || !z3) {
                if (k2.f2761t) {
                    k2.f2761t = false;
                    k2.m0(true);
                }
            } else if (!k2.f2761t) {
                k2.f2761t = true;
                k2.m0(true);
            }
        }
        if ((i2 & 256) == 0 || this.f1747u == null) {
            return;
        }
        WeakHashMap weakHashMap = P.f711a;
        C.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f1731b = i;
        InterfaceC0268d interfaceC0268d = this.f1747u;
        if (interfaceC0268d != null) {
            ((K) interfaceC0268d).f2759r = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        h();
        this.f1733d.setTranslationY(-Math.max(0, Math.min(i, this.f1733d.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0268d interfaceC0268d) {
        this.f1747u = interfaceC0268d;
        if (getWindowToken() != null) {
            ((K) this.f1747u).f2759r = this.f1731b;
            int i = this.f1738l;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = P.f711a;
                C.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z2) {
        this.f1736h = z2;
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
        i1 i1Var = (i1) this.e;
        i1Var.f3640d = i != 0 ? d.F(i1Var.f3637a.getContext(), i) : null;
        i1Var.c();
    }

    public void setLogo(int i) {
        k();
        i1 i1Var = (i1) this.e;
        i1Var.e = i != 0 ? d.F(i1Var.f3637a.getContext(), i) : null;
        i1Var.c();
    }

    public void setOverlayMode(boolean z2) {
        this.f1735g = z2;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i) {
    }

    @Override // n.InterfaceC0283k0
    public void setWindowCallback(Window.Callback callback) {
        k();
        ((i1) this.e).f3644k = callback;
    }

    @Override // n.InterfaceC0283k0
    public void setWindowTitle(CharSequence charSequence) {
        k();
        i1 i1Var = (i1) this.e;
        if (i1Var.f3642g) {
            return;
        }
        i1Var.f3643h = charSequence;
        if ((i1Var.f3638b & 8) != 0) {
            Toolbar toolbar = i1Var.f3637a;
            toolbar.setTitle(charSequence);
            if (i1Var.f3642g) {
                P.m(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0270e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        i1 i1Var = (i1) this.e;
        i1Var.f3640d = drawable;
        i1Var.c();
    }
}
