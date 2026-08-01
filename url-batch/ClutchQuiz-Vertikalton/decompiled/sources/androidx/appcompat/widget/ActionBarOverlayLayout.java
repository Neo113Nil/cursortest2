package androidx.appcompat.widget;

import C.d;
import K.E;
import K.G;
import K.InterfaceC0015p;
import K.InterfaceC0016q;
import K.S;
import K.Y;
import K.l0;
import K.m0;
import K.n0;
import K.o0;
import K.r;
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
import com.clutchquizarena.app.R;
import g.J;
import j.j;
import java.util.WeakHashMap;
import k.InterfaceC0178x;
import k.MenuC0167m;
import l.C0209e;
import l.C0211f;
import l.C0221k;
import l.InterfaceC0207d;
import l.InterfaceC0220j0;
import l.InterfaceC0222k0;
import l.RunnableC0205c;
import l.X0;
import l.c1;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0220j0, InterfaceC0015p, InterfaceC0016q {

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f1295C = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* renamed from: D, reason: collision with root package name */
    public static final w0 f1296D;

    /* renamed from: E, reason: collision with root package name */
    public static final Rect f1297E;

    /* renamed from: A, reason: collision with root package name */
    public final r f1298A;

    /* renamed from: B, reason: collision with root package name */
    public final C0211f f1299B;

    /* renamed from: a, reason: collision with root package name */
    public int f1300a;

    /* renamed from: b, reason: collision with root package name */
    public int f1301b;

    /* renamed from: c, reason: collision with root package name */
    public ContentFrameLayout f1302c;
    public ActionBarContainer d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0222k0 f1303e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f1304f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1305g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1306j;

    /* renamed from: k, reason: collision with root package name */
    public int f1307k;

    /* renamed from: l, reason: collision with root package name */
    public int f1308l;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f1309m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f1310n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f1311o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f1312p;

    /* renamed from: q, reason: collision with root package name */
    public w0 f1313q;

    /* renamed from: r, reason: collision with root package name */
    public w0 f1314r;

    /* renamed from: s, reason: collision with root package name */
    public w0 f1315s;

    /* renamed from: t, reason: collision with root package name */
    public w0 f1316t;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC0207d f1317u;

    /* renamed from: v, reason: collision with root package name */
    public OverScroller f1318v;

    /* renamed from: w, reason: collision with root package name */
    public ViewPropertyAnimator f1319w;

    /* renamed from: x, reason: collision with root package name */
    public final Y f1320x;

    /* renamed from: y, reason: collision with root package name */
    public final RunnableC0205c f1321y;

    /* renamed from: z, reason: collision with root package name */
    public final RunnableC0205c f1322z;

    static {
        int i = Build.VERSION.SDK_INT;
        o0 n0Var = i >= 30 ? new n0() : i >= 29 ? new m0() : new l0();
        n0Var.g(d.b(0, 1, 0, 1));
        f1296D = n0Var.b();
        f1297E = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1301b = 0;
        this.f1309m = new Rect();
        this.f1310n = new Rect();
        this.f1311o = new Rect();
        this.f1312p = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        w0 w0Var = w0.f450b;
        this.f1313q = w0Var;
        this.f1314r = w0Var;
        this.f1315s = w0Var;
        this.f1316t = w0Var;
        this.f1320x = new Y(2, this);
        this.f1321y = new RunnableC0205c(this, 0);
        this.f1322z = new RunnableC0205c(this, 1);
        i(context);
        this.f1298A = new r();
        C0211f c0211f = new C0211f(context);
        c0211f.setWillNotDraw(true);
        this.f1299B = c0211f;
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

    @Override // K.InterfaceC0015p
    public final void a(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // K.InterfaceC0016q
    public final void b(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        c(view, i, i2, i3, i4, i5);
    }

    @Override // K.InterfaceC0015p
    public final void c(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0209e;
    }

    @Override // K.InterfaceC0015p
    public final void d(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f1304f != null) {
            if (this.d.getVisibility() == 0) {
                i = (int) (this.d.getTranslationY() + this.d.getBottom() + 0.5f);
            } else {
                i = 0;
            }
            this.f1304f.setBounds(0, i, getWidth(), this.f1304f.getIntrinsicHeight() + i);
            this.f1304f.draw(canvas);
        }
    }

    @Override // K.InterfaceC0015p
    public final void e(View view, int i, int i2, int[] iArr, int i3) {
    }

    @Override // K.InterfaceC0015p
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
        r rVar = this.f1298A;
        return rVar.f440b | rVar.f439a;
    }

    public CharSequence getTitle() {
        k();
        return ((c1) this.f1303e).f2953a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f1321y);
        removeCallbacks(this.f1322z);
        ViewPropertyAnimator viewPropertyAnimator = this.f1319w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1295C);
        this.f1300a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1304f = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f1318v = new OverScroller(context);
    }

    public final void j(int i) {
        k();
        if (i == 2) {
            ((c1) this.f1303e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((c1) this.f1303e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        InterfaceC0222k0 wrapper;
        if (this.f1302c == null) {
            this.f1302c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof InterfaceC0222k0) {
                wrapper = (InterfaceC0222k0) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f1303e = wrapper;
        }
    }

    public final void l(MenuC0167m menuC0167m, InterfaceC0178x interfaceC0178x) {
        k();
        c1 c1Var = (c1) this.f1303e;
        C0221k c0221k = c1Var.f2962m;
        Toolbar toolbar = c1Var.f2953a;
        if (c0221k == null) {
            c1Var.f2962m = new C0221k(toolbar.getContext());
        }
        C0221k c0221k2 = c1Var.f2962m;
        c0221k2.f2990e = interfaceC0178x;
        if (menuC0167m == null && toolbar.f1366a == null) {
            return;
        }
        toolbar.f();
        MenuC0167m menuC0167m2 = toolbar.f1366a.f1323p;
        if (menuC0167m2 == menuC0167m) {
            return;
        }
        if (menuC0167m2 != null) {
            menuC0167m2.r(toolbar.f1359K);
            menuC0167m2.r(toolbar.f1360L);
        }
        if (toolbar.f1360L == null) {
            toolbar.f1360L = new X0(toolbar);
        }
        c0221k2.f3000q = true;
        if (menuC0167m != null) {
            menuC0167m.b(c0221k2, toolbar.f1372j);
            menuC0167m.b(toolbar.f1360L, toolbar.f1372j);
        } else {
            c0221k2.j(toolbar.f1372j, null);
            toolbar.f1360L.j(toolbar.f1372j, null);
            c0221k2.c();
            toolbar.f1360L.c();
        }
        toolbar.f1366a.setPopupTheme(toolbar.f1373k);
        toolbar.f1366a.setPresenter(c0221k2);
        toolbar.f1359K = c0221k2;
        toolbar.u();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        w0 g2 = w0.g(this, windowInsets);
        boolean g3 = g(this.d, new Rect(g2.b(), g2.d(), g2.c(), g2.a()), false);
        WeakHashMap weakHashMap = S.f365a;
        Rect rect = this.f1309m;
        G.b(this, g2, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        u0 u0Var = g2.f451a;
        w0 l2 = u0Var.l(i, i2, i3, i4);
        this.f1313q = l2;
        boolean z2 = true;
        if (!this.f1314r.equals(l2)) {
            this.f1314r = this.f1313q;
            g3 = true;
        }
        Rect rect2 = this.f1310n;
        if (rect2.equals(rect)) {
            z2 = g3;
        } else {
            rect2.set(rect);
        }
        if (z2) {
            requestLayout();
        }
        return u0Var.a().f451a.c().f451a.b().f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = S.f365a;
        E.c(this);
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
        WeakHashMap weakHashMap = S.f365a;
        boolean z2 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z2) {
            measuredHeight = this.f1300a;
            if (this.h && this.d.getTabContainer() != null) {
                measuredHeight += this.f1300a;
            }
        } else {
            measuredHeight = this.d.getVisibility() != 8 ? this.d.getMeasuredHeight() : 0;
        }
        Rect rect = this.f1309m;
        Rect rect2 = this.f1311o;
        rect2.set(rect);
        this.f1315s = this.f1313q;
        if (!this.f1305g && !z2) {
            C0211f c0211f = this.f1299B;
            w0 w0Var = f1296D;
            Rect rect3 = this.f1312p;
            G.b(c0211f, w0Var, rect3);
            if (!rect3.equals(f1297E)) {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.f1315s = this.f1315s.f451a.l(0, measuredHeight, 0, 0);
                g(this.f1302c, rect2, true);
                if (!this.f1316t.equals(this.f1315s)) {
                    w0 w0Var2 = this.f1315s;
                    this.f1316t = w0Var2;
                    ContentFrameLayout contentFrameLayout = this.f1302c;
                    WindowInsets f2 = w0Var2.f();
                    if (f2 != null) {
                        WindowInsets a2 = E.a(contentFrameLayout, f2);
                        if (!a2.equals(f2)) {
                            w0.g(contentFrameLayout, a2);
                        }
                    }
                }
                measureChildWithMargins(this.f1302c, i, 0, i2, 0);
                C0209e c0209e2 = (C0209e) this.f1302c.getLayoutParams();
                int max3 = Math.max(max, this.f1302c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0209e2).leftMargin + ((ViewGroup.MarginLayoutParams) c0209e2).rightMargin);
                int max4 = Math.max(max2, this.f1302c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0209e2).topMargin + ((ViewGroup.MarginLayoutParams) c0209e2).bottomMargin);
                int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1302c.getMeasuredState());
                setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
            }
        }
        d b2 = d.b(this.f1315s.b(), this.f1315s.d() + measuredHeight, this.f1315s.c(), this.f1315s.a());
        w0 w0Var3 = this.f1315s;
        int i3 = Build.VERSION.SDK_INT;
        o0 n0Var = i3 >= 30 ? new n0(w0Var3) : i3 >= 29 ? new m0(w0Var3) : new l0(w0Var3);
        n0Var.g(b2);
        this.f1315s = n0Var.b();
        g(this.f1302c, rect2, true);
        if (!this.f1316t.equals(this.f1315s)) {
        }
        measureChildWithMargins(this.f1302c, i, 0, i2, 0);
        C0209e c0209e22 = (C0209e) this.f1302c.getLayoutParams();
        int max32 = Math.max(max, this.f1302c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0209e22).leftMargin + ((ViewGroup.MarginLayoutParams) c0209e22).rightMargin);
        int max42 = Math.max(max2, this.f1302c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0209e22).topMargin + ((ViewGroup.MarginLayoutParams) c0209e22).bottomMargin);
        int combineMeasuredStates22 = View.combineMeasuredStates(combineMeasuredStates, this.f1302c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max32, getSuggestedMinimumWidth()), i, combineMeasuredStates22), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max42, getSuggestedMinimumHeight()), i2, combineMeasuredStates22 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (!this.i || !z2) {
            return false;
        }
        this.f1318v.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f1318v.getFinalY() > this.d.getHeight()) {
            h();
            this.f1322z.run();
        } else {
            h();
            this.f1321y.run();
        }
        this.f1306j = true;
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
        int i5 = this.f1307k + i2;
        this.f1307k = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        J j2;
        j jVar;
        this.f1298A.f439a = i;
        this.f1307k = getActionBarHideOffset();
        h();
        InterfaceC0207d interfaceC0207d = this.f1317u;
        if (interfaceC0207d == null || (jVar = (j2 = (J) interfaceC0207d).f2409s) == null) {
            return;
        }
        jVar.a();
        j2.f2409s = null;
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
        if (!this.i || this.f1306j) {
            return;
        }
        if (this.f1307k <= this.d.getHeight()) {
            h();
            postDelayed(this.f1321y, 600L);
        } else {
            h();
            postDelayed(this.f1322z, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        k();
        int i2 = this.f1308l ^ i;
        this.f1308l = i;
        boolean z2 = (i & 4) == 0;
        boolean z3 = (i & 256) != 0;
        InterfaceC0207d interfaceC0207d = this.f1317u;
        if (interfaceC0207d != null) {
            J j2 = (J) interfaceC0207d;
            j2.f2405o = !z3;
            if (z2 || !z3) {
                if (j2.f2406p) {
                    j2.f2406p = false;
                    j2.X(true);
                }
            } else if (!j2.f2406p) {
                j2.f2406p = true;
                j2.X(true);
            }
        }
        if ((i2 & 256) == 0 || this.f1317u == null) {
            return;
        }
        WeakHashMap weakHashMap = S.f365a;
        E.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f1301b = i;
        InterfaceC0207d interfaceC0207d = this.f1317u;
        if (interfaceC0207d != null) {
            ((J) interfaceC0207d).f2404n = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        h();
        this.d.setTranslationY(-Math.max(0, Math.min(i, this.d.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0207d interfaceC0207d) {
        this.f1317u = interfaceC0207d;
        if (getWindowToken() != null) {
            ((J) this.f1317u).f2404n = this.f1301b;
            int i = this.f1308l;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = S.f365a;
                E.c(this);
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
        c1 c1Var = (c1) this.f1303e;
        c1Var.d = i != 0 ? T.d.t(c1Var.f2953a.getContext(), i) : null;
        c1Var.c();
    }

    public void setLogo(int i) {
        k();
        c1 c1Var = (c1) this.f1303e;
        c1Var.f2956e = i != 0 ? T.d.t(c1Var.f2953a.getContext(), i) : null;
        c1Var.c();
    }

    public void setOverlayMode(boolean z2) {
        this.f1305g = z2;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i) {
    }

    @Override // l.InterfaceC0220j0
    public void setWindowCallback(Window.Callback callback) {
        k();
        ((c1) this.f1303e).f2960k = callback;
    }

    @Override // l.InterfaceC0220j0
    public void setWindowTitle(CharSequence charSequence) {
        k();
        c1 c1Var = (c1) this.f1303e;
        if (c1Var.f2958g) {
            return;
        }
        c1Var.h = charSequence;
        if ((c1Var.f2954b & 8) != 0) {
            Toolbar toolbar = c1Var.f2953a;
            toolbar.setTitle(charSequence);
            if (c1Var.f2958g) {
                S.m(toolbar.getRootView(), charSequence);
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
        c1 c1Var = (c1) this.f1303e;
        c1Var.d = drawable;
        c1Var.c();
    }
}
