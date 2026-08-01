package androidx.appcompat.widget;

import C.c;
import K.C0016q;
import K.E;
import K.G;
import K.InterfaceC0014o;
import K.InterfaceC0015p;
import K.S;
import K.Y;
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
import com.neonpulse.gridlogic.R;
import g.K;
import j.j;
import java.util.WeakHashMap;
import k.InterfaceC0171x;
import k.MenuC0160m;
import l.C0213e;
import l.C0215f;
import l.C0225k;
import l.InterfaceC0211d;
import l.InterfaceC0226k0;
import l.InterfaceC0228l0;
import l.RunnableC0209c;
import l.Y0;
import l.d1;
import x1.l;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0226k0, InterfaceC0014o, InterfaceC0015p {

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f1261C = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* renamed from: D, reason: collision with root package name */
    public static final w0 f1262D;

    /* renamed from: E, reason: collision with root package name */
    public static final Rect f1263E;

    /* renamed from: A, reason: collision with root package name */
    public final C0016q f1264A;

    /* renamed from: B, reason: collision with root package name */
    public final C0215f f1265B;

    /* renamed from: a, reason: collision with root package name */
    public int f1266a;

    /* renamed from: b, reason: collision with root package name */
    public int f1267b;

    /* renamed from: c, reason: collision with root package name */
    public ContentFrameLayout f1268c;
    public ActionBarContainer d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0228l0 f1269e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f1270f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1271g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1272j;

    /* renamed from: k, reason: collision with root package name */
    public int f1273k;

    /* renamed from: l, reason: collision with root package name */
    public int f1274l;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f1275m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f1276n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f1277o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f1278p;

    /* renamed from: q, reason: collision with root package name */
    public w0 f1279q;

    /* renamed from: r, reason: collision with root package name */
    public w0 f1280r;

    /* renamed from: s, reason: collision with root package name */
    public w0 f1281s;

    /* renamed from: t, reason: collision with root package name */
    public w0 f1282t;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC0211d f1283u;

    /* renamed from: v, reason: collision with root package name */
    public OverScroller f1284v;

    /* renamed from: w, reason: collision with root package name */
    public ViewPropertyAnimator f1285w;

    /* renamed from: x, reason: collision with root package name */
    public final Y f1286x;

    /* renamed from: y, reason: collision with root package name */
    public final RunnableC0209c f1287y;

    /* renamed from: z, reason: collision with root package name */
    public final RunnableC0209c f1288z;

    static {
        int i = Build.VERSION.SDK_INT;
        o0 n0Var = i >= 30 ? new n0() : i >= 29 ? new m0() : new l0();
        n0Var.g(c.b(0, 1, 0, 1));
        f1262D = n0Var.b();
        f1263E = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1267b = 0;
        this.f1275m = new Rect();
        this.f1276n = new Rect();
        this.f1277o = new Rect();
        this.f1278p = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        w0 w0Var = w0.f508b;
        this.f1279q = w0Var;
        this.f1280r = w0Var;
        this.f1281s = w0Var;
        this.f1282t = w0Var;
        this.f1286x = new Y(3, this);
        this.f1287y = new RunnableC0209c(this, 0);
        this.f1288z = new RunnableC0209c(this, 1);
        i(context);
        this.f1264A = new C0016q();
        C0215f c0215f = new C0215f(context);
        c0215f.setWillNotDraw(true);
        this.f1265B = c0215f;
        addView(c0215f);
    }

    public static boolean g(View view, Rect rect, boolean z2) {
        boolean z3;
        C0213e c0213e = (C0213e) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) c0213e).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) c0213e).leftMargin = i2;
            z3 = true;
        } else {
            z3 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) c0213e).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) c0213e).topMargin = i4;
            z3 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) c0213e).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) c0213e).rightMargin = i6;
            z3 = true;
        }
        if (z2) {
            int i7 = ((ViewGroup.MarginLayoutParams) c0213e).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) c0213e).bottomMargin = i8;
                return true;
            }
        }
        return z3;
    }

    @Override // K.InterfaceC0014o
    public final void a(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // K.InterfaceC0015p
    public final void b(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        c(view, i, i2, i3, i4, i5);
    }

    @Override // K.InterfaceC0014o
    public final void c(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0213e;
    }

    @Override // K.InterfaceC0014o
    public final void d(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f1270f != null) {
            if (this.d.getVisibility() == 0) {
                i = (int) (this.d.getTranslationY() + this.d.getBottom() + 0.5f);
            } else {
                i = 0;
            }
            this.f1270f.setBounds(0, i, getWidth(), this.f1270f.getIntrinsicHeight() + i);
            this.f1270f.draw(canvas);
        }
    }

    @Override // K.InterfaceC0014o
    public final void e(View view, int i, int i2, int[] iArr, int i3) {
    }

    @Override // K.InterfaceC0014o
    public final boolean f(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0213e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0213e(getContext(), attributeSet);
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
        C0016q c0016q = this.f1264A;
        return c0016q.f496b | c0016q.f495a;
    }

    public CharSequence getTitle() {
        k();
        return ((d1) this.f1269e).f2959a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f1287y);
        removeCallbacks(this.f1288z);
        ViewPropertyAnimator viewPropertyAnimator = this.f1285w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1261C);
        this.f1266a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1270f = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f1284v = new OverScroller(context);
    }

    public final void j(int i) {
        k();
        if (i == 2) {
            ((d1) this.f1269e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((d1) this.f1269e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        InterfaceC0228l0 wrapper;
        if (this.f1268c == null) {
            this.f1268c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof InterfaceC0228l0) {
                wrapper = (InterfaceC0228l0) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f1269e = wrapper;
        }
    }

    public final void l(MenuC0160m menuC0160m, InterfaceC0171x interfaceC0171x) {
        k();
        d1 d1Var = (d1) this.f1269e;
        C0225k c0225k = d1Var.f2968m;
        Toolbar toolbar = d1Var.f2959a;
        if (c0225k == null) {
            d1Var.f2968m = new C0225k(toolbar.getContext());
        }
        C0225k c0225k2 = d1Var.f2968m;
        c0225k2.f2996e = interfaceC0171x;
        if (menuC0160m == null && toolbar.f1329a == null) {
            return;
        }
        toolbar.f();
        MenuC0160m menuC0160m2 = toolbar.f1329a.f1289p;
        if (menuC0160m2 == menuC0160m) {
            return;
        }
        if (menuC0160m2 != null) {
            menuC0160m2.r(toolbar.f1322K);
            menuC0160m2.r(toolbar.f1323L);
        }
        if (toolbar.f1323L == null) {
            toolbar.f1323L = new Y0(toolbar);
        }
        c0225k2.f3006q = true;
        if (menuC0160m != null) {
            menuC0160m.b(c0225k2, toolbar.f1335j);
            menuC0160m.b(toolbar.f1323L, toolbar.f1335j);
        } else {
            c0225k2.j(toolbar.f1335j, null);
            toolbar.f1323L.j(toolbar.f1335j, null);
            c0225k2.c();
            toolbar.f1323L.c();
        }
        toolbar.f1329a.setPopupTheme(toolbar.f1336k);
        toolbar.f1329a.setPresenter(c0225k2);
        toolbar.f1322K = c0225k2;
        toolbar.u();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        w0 g2 = w0.g(this, windowInsets);
        boolean g3 = g(this.d, new Rect(g2.b(), g2.d(), g2.c(), g2.a()), false);
        WeakHashMap weakHashMap = S.f422a;
        Rect rect = this.f1275m;
        G.b(this, g2, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        u0 u0Var = g2.f509a;
        w0 l2 = u0Var.l(i, i2, i3, i4);
        this.f1279q = l2;
        boolean z2 = true;
        if (!this.f1280r.equals(l2)) {
            this.f1280r = this.f1279q;
            g3 = true;
        }
        Rect rect2 = this.f1276n;
        if (rect2.equals(rect)) {
            z2 = g3;
        } else {
            rect2.set(rect);
        }
        if (z2) {
            requestLayout();
        }
        return u0Var.a().f509a.c().f509a.b().f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = S.f422a;
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
                C0213e c0213e = (C0213e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) c0213e).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) c0213e).topMargin + paddingTop;
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
        C0213e c0213e = (C0213e) this.d.getLayoutParams();
        int max = Math.max(0, this.d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0213e).leftMargin + ((ViewGroup.MarginLayoutParams) c0213e).rightMargin);
        int max2 = Math.max(0, this.d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0213e).topMargin + ((ViewGroup.MarginLayoutParams) c0213e).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.d.getMeasuredState());
        WeakHashMap weakHashMap = S.f422a;
        boolean z2 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z2) {
            measuredHeight = this.f1266a;
            if (this.h && this.d.getTabContainer() != null) {
                measuredHeight += this.f1266a;
            }
        } else {
            measuredHeight = this.d.getVisibility() != 8 ? this.d.getMeasuredHeight() : 0;
        }
        Rect rect = this.f1275m;
        Rect rect2 = this.f1277o;
        rect2.set(rect);
        this.f1281s = this.f1279q;
        if (!this.f1271g && !z2) {
            C0215f c0215f = this.f1265B;
            w0 w0Var = f1262D;
            Rect rect3 = this.f1278p;
            G.b(c0215f, w0Var, rect3);
            if (!rect3.equals(f1263E)) {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.f1281s = this.f1281s.f509a.l(0, measuredHeight, 0, 0);
                g(this.f1268c, rect2, true);
                if (!this.f1282t.equals(this.f1281s)) {
                    w0 w0Var2 = this.f1281s;
                    this.f1282t = w0Var2;
                    ContentFrameLayout contentFrameLayout = this.f1268c;
                    WindowInsets f2 = w0Var2.f();
                    if (f2 != null) {
                        WindowInsets a2 = E.a(contentFrameLayout, f2);
                        if (!a2.equals(f2)) {
                            w0.g(contentFrameLayout, a2);
                        }
                    }
                }
                measureChildWithMargins(this.f1268c, i, 0, i2, 0);
                C0213e c0213e2 = (C0213e) this.f1268c.getLayoutParams();
                int max3 = Math.max(max, this.f1268c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0213e2).leftMargin + ((ViewGroup.MarginLayoutParams) c0213e2).rightMargin);
                int max4 = Math.max(max2, this.f1268c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0213e2).topMargin + ((ViewGroup.MarginLayoutParams) c0213e2).bottomMargin);
                int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1268c.getMeasuredState());
                setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
            }
        }
        c b2 = c.b(this.f1281s.b(), this.f1281s.d() + measuredHeight, this.f1281s.c(), this.f1281s.a());
        w0 w0Var3 = this.f1281s;
        int i3 = Build.VERSION.SDK_INT;
        o0 n0Var = i3 >= 30 ? new n0(w0Var3) : i3 >= 29 ? new m0(w0Var3) : new l0(w0Var3);
        n0Var.g(b2);
        this.f1281s = n0Var.b();
        g(this.f1268c, rect2, true);
        if (!this.f1282t.equals(this.f1281s)) {
        }
        measureChildWithMargins(this.f1268c, i, 0, i2, 0);
        C0213e c0213e22 = (C0213e) this.f1268c.getLayoutParams();
        int max32 = Math.max(max, this.f1268c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0213e22).leftMargin + ((ViewGroup.MarginLayoutParams) c0213e22).rightMargin);
        int max42 = Math.max(max2, this.f1268c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0213e22).topMargin + ((ViewGroup.MarginLayoutParams) c0213e22).bottomMargin);
        int combineMeasuredStates22 = View.combineMeasuredStates(combineMeasuredStates, this.f1268c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max32, getSuggestedMinimumWidth()), i, combineMeasuredStates22), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max42, getSuggestedMinimumHeight()), i2, combineMeasuredStates22 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (!this.i || !z2) {
            return false;
        }
        this.f1284v.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f1284v.getFinalY() > this.d.getHeight()) {
            h();
            this.f1288z.run();
        } else {
            h();
            this.f1287y.run();
        }
        this.f1272j = true;
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
        int i5 = this.f1273k + i2;
        this.f1273k = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        K k2;
        j jVar;
        this.f1264A.f495a = i;
        this.f1273k = getActionBarHideOffset();
        h();
        InterfaceC0211d interfaceC0211d = this.f1283u;
        if (interfaceC0211d == null || (jVar = (k2 = (K) interfaceC0211d).f2413s) == null) {
            return;
        }
        jVar.a();
        k2.f2413s = null;
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
        if (!this.i || this.f1272j) {
            return;
        }
        if (this.f1273k <= this.d.getHeight()) {
            h();
            postDelayed(this.f1287y, 600L);
        } else {
            h();
            postDelayed(this.f1288z, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        k();
        int i2 = this.f1274l ^ i;
        this.f1274l = i;
        boolean z2 = (i & 4) == 0;
        boolean z3 = (i & 256) != 0;
        InterfaceC0211d interfaceC0211d = this.f1283u;
        if (interfaceC0211d != null) {
            K k2 = (K) interfaceC0211d;
            k2.f2409o = !z3;
            if (z2 || !z3) {
                if (k2.f2410p) {
                    k2.f2410p = false;
                    k2.q0(true);
                }
            } else if (!k2.f2410p) {
                k2.f2410p = true;
                k2.q0(true);
            }
        }
        if ((i2 & 256) == 0 || this.f1283u == null) {
            return;
        }
        WeakHashMap weakHashMap = S.f422a;
        E.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f1267b = i;
        InterfaceC0211d interfaceC0211d = this.f1283u;
        if (interfaceC0211d != null) {
            ((K) interfaceC0211d).f2408n = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        h();
        this.d.setTranslationY(-Math.max(0, Math.min(i, this.d.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0211d interfaceC0211d) {
        this.f1283u = interfaceC0211d;
        if (getWindowToken() != null) {
            ((K) this.f1283u).f2408n = this.f1267b;
            int i = this.f1274l;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = S.f422a;
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
        d1 d1Var = (d1) this.f1269e;
        d1Var.d = i != 0 ? l.z(d1Var.f2959a.getContext(), i) : null;
        d1Var.c();
    }

    public void setLogo(int i) {
        k();
        d1 d1Var = (d1) this.f1269e;
        d1Var.f2962e = i != 0 ? l.z(d1Var.f2959a.getContext(), i) : null;
        d1Var.c();
    }

    public void setOverlayMode(boolean z2) {
        this.f1271g = z2;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i) {
    }

    @Override // l.InterfaceC0226k0
    public void setWindowCallback(Window.Callback callback) {
        k();
        ((d1) this.f1269e).f2966k = callback;
    }

    @Override // l.InterfaceC0226k0
    public void setWindowTitle(CharSequence charSequence) {
        k();
        d1 d1Var = (d1) this.f1269e;
        if (d1Var.f2964g) {
            return;
        }
        d1Var.h = charSequence;
        if ((d1Var.f2960b & 8) != 0) {
            Toolbar toolbar = d1Var.f2959a;
            toolbar.setTitle(charSequence);
            if (d1Var.f2964g) {
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
        return new C0213e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        d1 d1Var = (d1) this.f1269e;
        d1Var.d = drawable;
        d1Var.c();
    }
}
