package androidx.appcompat.widget;

import D.c;
import L.C0003b0;
import L.C0019q;
import L.F;
import L.H;
import L.InterfaceC0017o;
import L.InterfaceC0018p;
import L.T;
import L.o0;
import L.p0;
import L.q0;
import L.r0;
import L.x0;
import L.z0;
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
import com.winfour.winrandom.R;
import g.K;
import h.AbstractC0112a;
import java.util.WeakHashMap;
import k.j;
import l.InterfaceC0180x;
import l.MenuC0169m;
import m.C0209e;
import m.C0211f;
import m.C0221k;
import m.InterfaceC0207d;
import m.InterfaceC0224l0;
import m.InterfaceC0226m0;
import m.RunnableC0205c;
import m.e1;
import m.j1;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0224l0, InterfaceC0017o, InterfaceC0018p {

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f1359C = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* renamed from: D, reason: collision with root package name */
    public static final z0 f1360D;

    /* renamed from: E, reason: collision with root package name */
    public static final Rect f1361E;

    /* renamed from: A, reason: collision with root package name */
    public final C0019q f1362A;

    /* renamed from: B, reason: collision with root package name */
    public final C0211f f1363B;

    /* renamed from: a, reason: collision with root package name */
    public int f1364a;

    /* renamed from: b, reason: collision with root package name */
    public int f1365b;

    /* renamed from: c, reason: collision with root package name */
    public ContentFrameLayout f1366c;
    public ActionBarContainer d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0226m0 f1367e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f1368f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1369g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1370h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1371j;

    /* renamed from: k, reason: collision with root package name */
    public int f1372k;

    /* renamed from: l, reason: collision with root package name */
    public int f1373l;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f1374m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f1375n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f1376o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f1377p;

    /* renamed from: q, reason: collision with root package name */
    public z0 f1378q;

    /* renamed from: r, reason: collision with root package name */
    public z0 f1379r;

    /* renamed from: s, reason: collision with root package name */
    public z0 f1380s;

    /* renamed from: t, reason: collision with root package name */
    public z0 f1381t;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC0207d f1382u;

    /* renamed from: v, reason: collision with root package name */
    public OverScroller f1383v;

    /* renamed from: w, reason: collision with root package name */
    public ViewPropertyAnimator f1384w;

    /* renamed from: x, reason: collision with root package name */
    public final C0003b0 f1385x;

    /* renamed from: y, reason: collision with root package name */
    public final RunnableC0205c f1386y;

    /* renamed from: z, reason: collision with root package name */
    public final RunnableC0205c f1387z;

    static {
        int i = Build.VERSION.SDK_INT;
        r0 q0Var = i >= 30 ? new q0() : i >= 29 ? new p0() : new o0();
        q0Var.g(c.b(0, 1, 0, 1));
        f1360D = q0Var.b();
        f1361E = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1365b = 0;
        this.f1374m = new Rect();
        this.f1375n = new Rect();
        this.f1376o = new Rect();
        this.f1377p = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        z0 z0Var = z0.f588b;
        this.f1378q = z0Var;
        this.f1379r = z0Var;
        this.f1380s = z0Var;
        this.f1381t = z0Var;
        this.f1385x = new C0003b0(2, this);
        this.f1386y = new RunnableC0205c(this, 0);
        this.f1387z = new RunnableC0205c(this, 1);
        i(context);
        this.f1362A = new C0019q();
        C0211f c0211f = new C0211f(context);
        c0211f.setWillNotDraw(true);
        this.f1363B = c0211f;
        addView(c0211f);
    }

    public static boolean g(View view, Rect rect, boolean z2) {
        boolean z3;
        C0209e c0209e = (C0209e) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) c0209e).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) c0209e).leftMargin = i2;
            z3 = true;
        } else {
            z3 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) c0209e).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) c0209e).topMargin = i4;
            z3 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) c0209e).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) c0209e).rightMargin = i6;
            z3 = true;
        }
        if (z2) {
            int i7 = ((ViewGroup.MarginLayoutParams) c0209e).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) c0209e).bottomMargin = i8;
                return true;
            }
        }
        return z3;
    }

    @Override // L.InterfaceC0017o
    public final void a(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // L.InterfaceC0018p
    public final void b(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        c(view, i, i2, i3, i4, i5);
    }

    @Override // L.InterfaceC0017o
    public final void c(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0209e;
    }

    @Override // L.InterfaceC0017o
    public final void d(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f1368f != null) {
            if (this.d.getVisibility() == 0) {
                i = (int) (this.d.getTranslationY() + this.d.getBottom() + 0.5f);
            } else {
                i = 0;
            }
            this.f1368f.setBounds(0, i, getWidth(), this.f1368f.getIntrinsicHeight() + i);
            this.f1368f.draw(canvas);
        }
    }

    @Override // L.InterfaceC0017o
    public final void e(View view, int i, int i2, int[] iArr, int i3) {
    }

    @Override // L.InterfaceC0017o
    public final boolean f(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0209e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0209e(getContext(), attributeSet);
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
        C0019q c0019q = this.f1362A;
        return c0019q.f563b | c0019q.f562a;
    }

    public CharSequence getTitle() {
        k();
        return ((j1) this.f1367e).f3110a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f1386y);
        removeCallbacks(this.f1387z);
        ViewPropertyAnimator viewPropertyAnimator = this.f1384w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1359C);
        this.f1364a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1368f = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f1383v = new OverScroller(context);
    }

    public final void j(int i) {
        k();
        if (i == 2) {
            ((j1) this.f1367e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((j1) this.f1367e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        InterfaceC0226m0 wrapper;
        if (this.f1366c == null) {
            this.f1366c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof InterfaceC0226m0) {
                wrapper = (InterfaceC0226m0) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f1367e = wrapper;
        }
    }

    public final void l(MenuC0169m menuC0169m, InterfaceC0180x interfaceC0180x) {
        k();
        j1 j1Var = (j1) this.f1367e;
        C0221k c0221k = j1Var.f3120m;
        Toolbar toolbar = j1Var.f3110a;
        if (c0221k == null) {
            j1Var.f3120m = new C0221k(toolbar.getContext());
        }
        C0221k c0221k2 = j1Var.f3120m;
        c0221k2.f3126e = interfaceC0180x;
        if (menuC0169m == null && toolbar.f1429a == null) {
            return;
        }
        toolbar.f();
        MenuC0169m menuC0169m2 = toolbar.f1429a.f1388p;
        if (menuC0169m2 == menuC0169m) {
            return;
        }
        if (menuC0169m2 != null) {
            menuC0169m2.r(toolbar.f1422K);
            menuC0169m2.r(toolbar.f1423L);
        }
        if (toolbar.f1423L == null) {
            toolbar.f1423L = new e1(toolbar);
        }
        c0221k2.f3137q = true;
        if (menuC0169m != null) {
            menuC0169m.b(c0221k2, toolbar.f1436j);
            menuC0169m.b(toolbar.f1423L, toolbar.f1436j);
        } else {
            c0221k2.d(toolbar.f1436j, null);
            toolbar.f1423L.d(toolbar.f1436j, null);
            c0221k2.c();
            toolbar.f1423L.c();
        }
        toolbar.f1429a.setPopupTheme(toolbar.f1437k);
        toolbar.f1429a.setPresenter(c0221k2);
        toolbar.f1422K = c0221k2;
        toolbar.u();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        z0 g2 = z0.g(this, windowInsets);
        boolean g3 = g(this.d, new Rect(g2.b(), g2.d(), g2.c(), g2.a()), false);
        WeakHashMap weakHashMap = T.f490a;
        Rect rect = this.f1374m;
        H.b(this, g2, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        x0 x0Var = g2.f589a;
        z0 l2 = x0Var.l(i, i2, i3, i4);
        this.f1378q = l2;
        boolean z2 = true;
        if (!this.f1379r.equals(l2)) {
            this.f1379r = this.f1378q;
            g3 = true;
        }
        Rect rect2 = this.f1375n;
        if (rect2.equals(rect)) {
            z2 = g3;
        } else {
            rect2.set(rect);
        }
        if (z2) {
            requestLayout();
        }
        return x0Var.a().f589a.c().f589a.b().f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = T.f490a;
        F.c(this);
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
                C0209e c0209e = (C0209e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) c0209e).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) c0209e).topMargin + paddingTop;
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
        C0209e c0209e = (C0209e) this.d.getLayoutParams();
        int max = Math.max(0, this.d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0209e).leftMargin + ((ViewGroup.MarginLayoutParams) c0209e).rightMargin);
        int max2 = Math.max(0, this.d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0209e).topMargin + ((ViewGroup.MarginLayoutParams) c0209e).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.d.getMeasuredState());
        WeakHashMap weakHashMap = T.f490a;
        boolean z2 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z2) {
            measuredHeight = this.f1364a;
            if (this.f1370h && this.d.getTabContainer() != null) {
                measuredHeight += this.f1364a;
            }
        } else {
            measuredHeight = this.d.getVisibility() != 8 ? this.d.getMeasuredHeight() : 0;
        }
        Rect rect = this.f1374m;
        Rect rect2 = this.f1376o;
        rect2.set(rect);
        this.f1380s = this.f1378q;
        if (!this.f1369g && !z2) {
            C0211f c0211f = this.f1363B;
            z0 z0Var = f1360D;
            Rect rect3 = this.f1377p;
            H.b(c0211f, z0Var, rect3);
            if (!rect3.equals(f1361E)) {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.f1380s = this.f1380s.f589a.l(0, measuredHeight, 0, 0);
                g(this.f1366c, rect2, true);
                if (!this.f1381t.equals(this.f1380s)) {
                    z0 z0Var2 = this.f1380s;
                    this.f1381t = z0Var2;
                    ContentFrameLayout contentFrameLayout = this.f1366c;
                    WindowInsets f2 = z0Var2.f();
                    if (f2 != null) {
                        WindowInsets a2 = F.a(contentFrameLayout, f2);
                        if (!a2.equals(f2)) {
                            z0.g(contentFrameLayout, a2);
                        }
                    }
                }
                measureChildWithMargins(this.f1366c, i, 0, i2, 0);
                C0209e c0209e2 = (C0209e) this.f1366c.getLayoutParams();
                int max3 = Math.max(max, this.f1366c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0209e2).leftMargin + ((ViewGroup.MarginLayoutParams) c0209e2).rightMargin);
                int max4 = Math.max(max2, this.f1366c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0209e2).topMargin + ((ViewGroup.MarginLayoutParams) c0209e2).bottomMargin);
                int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1366c.getMeasuredState());
                setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
            }
        }
        c b2 = c.b(this.f1380s.b(), this.f1380s.d() + measuredHeight, this.f1380s.c(), this.f1380s.a());
        z0 z0Var3 = this.f1380s;
        int i3 = Build.VERSION.SDK_INT;
        r0 q0Var = i3 >= 30 ? new q0(z0Var3) : i3 >= 29 ? new p0(z0Var3) : new o0(z0Var3);
        q0Var.g(b2);
        this.f1380s = q0Var.b();
        g(this.f1366c, rect2, true);
        if (!this.f1381t.equals(this.f1380s)) {
        }
        measureChildWithMargins(this.f1366c, i, 0, i2, 0);
        C0209e c0209e22 = (C0209e) this.f1366c.getLayoutParams();
        int max32 = Math.max(max, this.f1366c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0209e22).leftMargin + ((ViewGroup.MarginLayoutParams) c0209e22).rightMargin);
        int max42 = Math.max(max2, this.f1366c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0209e22).topMargin + ((ViewGroup.MarginLayoutParams) c0209e22).bottomMargin);
        int combineMeasuredStates22 = View.combineMeasuredStates(combineMeasuredStates, this.f1366c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max32, getSuggestedMinimumWidth()), i, combineMeasuredStates22), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max42, getSuggestedMinimumHeight()), i2, combineMeasuredStates22 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (!this.i || !z2) {
            return false;
        }
        this.f1383v.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f1383v.getFinalY() > this.d.getHeight()) {
            h();
            this.f1387z.run();
        } else {
            h();
            this.f1386y.run();
        }
        this.f1371j = true;
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
        int i5 = this.f1372k + i2;
        this.f1372k = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        K k2;
        j jVar;
        this.f1362A.f562a = i;
        this.f1372k = getActionBarHideOffset();
        h();
        InterfaceC0207d interfaceC0207d = this.f1382u;
        if (interfaceC0207d == null || (jVar = (k2 = (K) interfaceC0207d).f2294w) == null) {
            return;
        }
        jVar.a();
        k2.f2294w = null;
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
        if (!this.i || this.f1371j) {
            return;
        }
        if (this.f1372k <= this.d.getHeight()) {
            h();
            postDelayed(this.f1386y, 600L);
        } else {
            h();
            postDelayed(this.f1387z, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        k();
        int i2 = this.f1373l ^ i;
        this.f1373l = i;
        boolean z2 = (i & 4) == 0;
        boolean z3 = (i & 256) != 0;
        InterfaceC0207d interfaceC0207d = this.f1382u;
        if (interfaceC0207d != null) {
            K k2 = (K) interfaceC0207d;
            k2.f2290s = !z3;
            if (z2 || !z3) {
                if (k2.f2291t) {
                    k2.f2291t = false;
                    k2.r0(true);
                }
            } else if (!k2.f2291t) {
                k2.f2291t = true;
                k2.r0(true);
            }
        }
        if ((i2 & 256) == 0 || this.f1382u == null) {
            return;
        }
        WeakHashMap weakHashMap = T.f490a;
        F.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f1365b = i;
        InterfaceC0207d interfaceC0207d = this.f1382u;
        if (interfaceC0207d != null) {
            ((K) interfaceC0207d).f2289r = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        h();
        this.d.setTranslationY(-Math.max(0, Math.min(i, this.d.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0207d interfaceC0207d) {
        this.f1382u = interfaceC0207d;
        if (getWindowToken() != null) {
            ((K) this.f1382u).f2289r = this.f1365b;
            int i = this.f1373l;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = T.f490a;
                F.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z2) {
        this.f1370h = z2;
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
        j1 j1Var = (j1) this.f1367e;
        j1Var.d = i != 0 ? AbstractC0112a.l(j1Var.f3110a.getContext(), i) : null;
        j1Var.c();
    }

    public void setLogo(int i) {
        k();
        j1 j1Var = (j1) this.f1367e;
        j1Var.f3113e = i != 0 ? AbstractC0112a.l(j1Var.f3110a.getContext(), i) : null;
        j1Var.c();
    }

    public void setOverlayMode(boolean z2) {
        this.f1369g = z2;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i) {
    }

    @Override // m.InterfaceC0224l0
    public void setWindowCallback(Window.Callback callback) {
        k();
        ((j1) this.f1367e).f3118k = callback;
    }

    @Override // m.InterfaceC0224l0
    public void setWindowTitle(CharSequence charSequence) {
        k();
        j1 j1Var = (j1) this.f1367e;
        if (j1Var.f3115g) {
            return;
        }
        j1Var.f3116h = charSequence;
        if ((j1Var.f3111b & 8) != 0) {
            Toolbar toolbar = j1Var.f3110a;
            toolbar.setTitle(charSequence);
            if (j1Var.f3115g) {
                T.m(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0209e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        j1 j1Var = (j1) this.f1367e;
        j1Var.d = drawable;
        j1Var.c();
    }
}
