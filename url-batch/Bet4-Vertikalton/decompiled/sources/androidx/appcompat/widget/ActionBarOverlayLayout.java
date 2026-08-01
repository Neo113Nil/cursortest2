package androidx.appcompat.widget;

import C.c;
import K.C0003b0;
import K.C0019q;
import K.F;
import K.H;
import K.InterfaceC0017o;
import K.InterfaceC0018p;
import K.T;
import K.o0;
import K.p0;
import K.q0;
import K.r0;
import K.x0;
import K.z0;
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
import com.playbag.tripgear.R;
import g.K;
import j.j;
import java.util.WeakHashMap;
import k.InterfaceC0175x;
import k.MenuC0164m;
import l.C0204e;
import l.C0206f;
import l.C0216k;
import l.InterfaceC0202d;
import l.InterfaceC0217k0;
import l.InterfaceC0219l0;
import l.RunnableC0200c;
import l.Y0;
import l.d1;
import w1.l;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0217k0, InterfaceC0017o, InterfaceC0018p {

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f1275C = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* renamed from: D, reason: collision with root package name */
    public static final z0 f1276D;

    /* renamed from: E, reason: collision with root package name */
    public static final Rect f1277E;

    /* renamed from: A, reason: collision with root package name */
    public final C0019q f1278A;

    /* renamed from: B, reason: collision with root package name */
    public final C0206f f1279B;

    /* renamed from: a, reason: collision with root package name */
    public int f1280a;

    /* renamed from: b, reason: collision with root package name */
    public int f1281b;

    /* renamed from: c, reason: collision with root package name */
    public ContentFrameLayout f1282c;
    public ActionBarContainer d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0219l0 f1283e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f1284f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1285g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1286j;

    /* renamed from: k, reason: collision with root package name */
    public int f1287k;

    /* renamed from: l, reason: collision with root package name */
    public int f1288l;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f1289m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f1290n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f1291o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f1292p;

    /* renamed from: q, reason: collision with root package name */
    public z0 f1293q;

    /* renamed from: r, reason: collision with root package name */
    public z0 f1294r;

    /* renamed from: s, reason: collision with root package name */
    public z0 f1295s;

    /* renamed from: t, reason: collision with root package name */
    public z0 f1296t;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC0202d f1297u;

    /* renamed from: v, reason: collision with root package name */
    public OverScroller f1298v;

    /* renamed from: w, reason: collision with root package name */
    public ViewPropertyAnimator f1299w;

    /* renamed from: x, reason: collision with root package name */
    public final C0003b0 f1300x;

    /* renamed from: y, reason: collision with root package name */
    public final RunnableC0200c f1301y;

    /* renamed from: z, reason: collision with root package name */
    public final RunnableC0200c f1302z;

    static {
        int i = Build.VERSION.SDK_INT;
        r0 q0Var = i >= 30 ? new q0() : i >= 29 ? new p0() : new o0();
        q0Var.g(c.b(0, 1, 0, 1));
        f1276D = q0Var.b();
        f1277E = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1281b = 0;
        this.f1289m = new Rect();
        this.f1290n = new Rect();
        this.f1291o = new Rect();
        this.f1292p = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        z0 z0Var = z0.f518b;
        this.f1293q = z0Var;
        this.f1294r = z0Var;
        this.f1295s = z0Var;
        this.f1296t = z0Var;
        this.f1300x = new C0003b0(2, this);
        this.f1301y = new RunnableC0200c(this, 0);
        this.f1302z = new RunnableC0200c(this, 1);
        i(context);
        this.f1278A = new C0019q();
        C0206f c0206f = new C0206f(context);
        c0206f.setWillNotDraw(true);
        this.f1279B = c0206f;
        addView(c0206f);
    }

    public static boolean g(View view, Rect rect, boolean z2) {
        boolean z3;
        C0204e c0204e = (C0204e) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) c0204e).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) c0204e).leftMargin = i2;
            z3 = true;
        } else {
            z3 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) c0204e).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) c0204e).topMargin = i4;
            z3 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) c0204e).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) c0204e).rightMargin = i6;
            z3 = true;
        }
        if (z2) {
            int i7 = ((ViewGroup.MarginLayoutParams) c0204e).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) c0204e).bottomMargin = i8;
                return true;
            }
        }
        return z3;
    }

    @Override // K.InterfaceC0017o
    public final void a(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // K.InterfaceC0018p
    public final void b(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        c(view, i, i2, i3, i4, i5);
    }

    @Override // K.InterfaceC0017o
    public final void c(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0204e;
    }

    @Override // K.InterfaceC0017o
    public final void d(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f1284f != null) {
            if (this.d.getVisibility() == 0) {
                i = (int) (this.d.getTranslationY() + this.d.getBottom() + 0.5f);
            } else {
                i = 0;
            }
            this.f1284f.setBounds(0, i, getWidth(), this.f1284f.getIntrinsicHeight() + i);
            this.f1284f.draw(canvas);
        }
    }

    @Override // K.InterfaceC0017o
    public final void e(View view, int i, int i2, int[] iArr, int i3) {
    }

    @Override // K.InterfaceC0017o
    public final boolean f(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0204e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0204e(getContext(), attributeSet);
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
        C0019q c0019q = this.f1278A;
        return c0019q.f494b | c0019q.f493a;
    }

    public CharSequence getTitle() {
        k();
        return ((d1) this.f1283e).f2898a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f1301y);
        removeCallbacks(this.f1302z);
        ViewPropertyAnimator viewPropertyAnimator = this.f1299w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1275C);
        this.f1280a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1284f = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f1298v = new OverScroller(context);
    }

    public final void j(int i) {
        k();
        if (i == 2) {
            ((d1) this.f1283e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((d1) this.f1283e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        InterfaceC0219l0 wrapper;
        if (this.f1282c == null) {
            this.f1282c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof InterfaceC0219l0) {
                wrapper = (InterfaceC0219l0) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f1283e = wrapper;
        }
    }

    public final void l(MenuC0164m menuC0164m, InterfaceC0175x interfaceC0175x) {
        k();
        d1 d1Var = (d1) this.f1283e;
        C0216k c0216k = d1Var.f2907m;
        Toolbar toolbar = d1Var.f2898a;
        if (c0216k == null) {
            d1Var.f2907m = new C0216k(toolbar.getContext());
        }
        C0216k c0216k2 = d1Var.f2907m;
        c0216k2.f2935e = interfaceC0175x;
        if (menuC0164m == null && toolbar.f1343a == null) {
            return;
        }
        toolbar.f();
        MenuC0164m menuC0164m2 = toolbar.f1343a.f1303p;
        if (menuC0164m2 == menuC0164m) {
            return;
        }
        if (menuC0164m2 != null) {
            menuC0164m2.r(toolbar.f1336K);
            menuC0164m2.r(toolbar.f1337L);
        }
        if (toolbar.f1337L == null) {
            toolbar.f1337L = new Y0(toolbar);
        }
        c0216k2.f2945q = true;
        if (menuC0164m != null) {
            menuC0164m.b(c0216k2, toolbar.f1349j);
            menuC0164m.b(toolbar.f1337L, toolbar.f1349j);
        } else {
            c0216k2.j(toolbar.f1349j, null);
            toolbar.f1337L.j(toolbar.f1349j, null);
            c0216k2.c();
            toolbar.f1337L.c();
        }
        toolbar.f1343a.setPopupTheme(toolbar.f1350k);
        toolbar.f1343a.setPresenter(c0216k2);
        toolbar.f1336K = c0216k2;
        toolbar.u();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        z0 g2 = z0.g(this, windowInsets);
        boolean g3 = g(this.d, new Rect(g2.b(), g2.d(), g2.c(), g2.a()), false);
        WeakHashMap weakHashMap = T.f423a;
        Rect rect = this.f1289m;
        H.b(this, g2, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        x0 x0Var = g2.f519a;
        z0 l2 = x0Var.l(i, i2, i3, i4);
        this.f1293q = l2;
        boolean z2 = true;
        if (!this.f1294r.equals(l2)) {
            this.f1294r = this.f1293q;
            g3 = true;
        }
        Rect rect2 = this.f1290n;
        if (rect2.equals(rect)) {
            z2 = g3;
        } else {
            rect2.set(rect);
        }
        if (z2) {
            requestLayout();
        }
        return x0Var.a().f519a.c().f519a.b().f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = T.f423a;
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
                C0204e c0204e = (C0204e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) c0204e).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) c0204e).topMargin + paddingTop;
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
        C0204e c0204e = (C0204e) this.d.getLayoutParams();
        int max = Math.max(0, this.d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0204e).leftMargin + ((ViewGroup.MarginLayoutParams) c0204e).rightMargin);
        int max2 = Math.max(0, this.d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0204e).topMargin + ((ViewGroup.MarginLayoutParams) c0204e).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.d.getMeasuredState());
        WeakHashMap weakHashMap = T.f423a;
        boolean z2 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z2) {
            measuredHeight = this.f1280a;
            if (this.h && this.d.getTabContainer() != null) {
                measuredHeight += this.f1280a;
            }
        } else {
            measuredHeight = this.d.getVisibility() != 8 ? this.d.getMeasuredHeight() : 0;
        }
        Rect rect = this.f1289m;
        Rect rect2 = this.f1291o;
        rect2.set(rect);
        this.f1295s = this.f1293q;
        if (!this.f1285g && !z2) {
            C0206f c0206f = this.f1279B;
            z0 z0Var = f1276D;
            Rect rect3 = this.f1292p;
            H.b(c0206f, z0Var, rect3);
            if (!rect3.equals(f1277E)) {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.f1295s = this.f1295s.f519a.l(0, measuredHeight, 0, 0);
                g(this.f1282c, rect2, true);
                if (!this.f1296t.equals(this.f1295s)) {
                    z0 z0Var2 = this.f1295s;
                    this.f1296t = z0Var2;
                    ContentFrameLayout contentFrameLayout = this.f1282c;
                    WindowInsets f2 = z0Var2.f();
                    if (f2 != null) {
                        WindowInsets a2 = F.a(contentFrameLayout, f2);
                        if (!a2.equals(f2)) {
                            z0.g(contentFrameLayout, a2);
                        }
                    }
                }
                measureChildWithMargins(this.f1282c, i, 0, i2, 0);
                C0204e c0204e2 = (C0204e) this.f1282c.getLayoutParams();
                int max3 = Math.max(max, this.f1282c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0204e2).leftMargin + ((ViewGroup.MarginLayoutParams) c0204e2).rightMargin);
                int max4 = Math.max(max2, this.f1282c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0204e2).topMargin + ((ViewGroup.MarginLayoutParams) c0204e2).bottomMargin);
                int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1282c.getMeasuredState());
                setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
            }
        }
        c b2 = c.b(this.f1295s.b(), this.f1295s.d() + measuredHeight, this.f1295s.c(), this.f1295s.a());
        z0 z0Var3 = this.f1295s;
        int i3 = Build.VERSION.SDK_INT;
        r0 q0Var = i3 >= 30 ? new q0(z0Var3) : i3 >= 29 ? new p0(z0Var3) : new o0(z0Var3);
        q0Var.g(b2);
        this.f1295s = q0Var.b();
        g(this.f1282c, rect2, true);
        if (!this.f1296t.equals(this.f1295s)) {
        }
        measureChildWithMargins(this.f1282c, i, 0, i2, 0);
        C0204e c0204e22 = (C0204e) this.f1282c.getLayoutParams();
        int max32 = Math.max(max, this.f1282c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0204e22).leftMargin + ((ViewGroup.MarginLayoutParams) c0204e22).rightMargin);
        int max42 = Math.max(max2, this.f1282c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0204e22).topMargin + ((ViewGroup.MarginLayoutParams) c0204e22).bottomMargin);
        int combineMeasuredStates22 = View.combineMeasuredStates(combineMeasuredStates, this.f1282c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max32, getSuggestedMinimumWidth()), i, combineMeasuredStates22), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max42, getSuggestedMinimumHeight()), i2, combineMeasuredStates22 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (!this.i || !z2) {
            return false;
        }
        this.f1298v.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f1298v.getFinalY() > this.d.getHeight()) {
            h();
            this.f1302z.run();
        } else {
            h();
            this.f1301y.run();
        }
        this.f1286j = true;
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
        int i5 = this.f1287k + i2;
        this.f1287k = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        K k2;
        j jVar;
        this.f1278A.f493a = i;
        this.f1287k = getActionBarHideOffset();
        h();
        InterfaceC0202d interfaceC0202d = this.f1297u;
        if (interfaceC0202d == null || (jVar = (k2 = (K) interfaceC0202d).f2174s) == null) {
            return;
        }
        jVar.a();
        k2.f2174s = null;
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
        if (!this.i || this.f1286j) {
            return;
        }
        if (this.f1287k <= this.d.getHeight()) {
            h();
            postDelayed(this.f1301y, 600L);
        } else {
            h();
            postDelayed(this.f1302z, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        k();
        int i2 = this.f1288l ^ i;
        this.f1288l = i;
        boolean z2 = (i & 4) == 0;
        boolean z3 = (i & 256) != 0;
        InterfaceC0202d interfaceC0202d = this.f1297u;
        if (interfaceC0202d != null) {
            K k2 = (K) interfaceC0202d;
            k2.f2170o = !z3;
            if (z2 || !z3) {
                if (k2.f2171p) {
                    k2.f2171p = false;
                    k2.C0(true);
                }
            } else if (!k2.f2171p) {
                k2.f2171p = true;
                k2.C0(true);
            }
        }
        if ((i2 & 256) == 0 || this.f1297u == null) {
            return;
        }
        WeakHashMap weakHashMap = T.f423a;
        F.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f1281b = i;
        InterfaceC0202d interfaceC0202d = this.f1297u;
        if (interfaceC0202d != null) {
            ((K) interfaceC0202d).f2169n = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        h();
        this.d.setTranslationY(-Math.max(0, Math.min(i, this.d.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0202d interfaceC0202d) {
        this.f1297u = interfaceC0202d;
        if (getWindowToken() != null) {
            ((K) this.f1297u).f2169n = this.f1281b;
            int i = this.f1288l;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = T.f423a;
                F.c(this);
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
        d1 d1Var = (d1) this.f1283e;
        d1Var.d = i != 0 ? l.z(d1Var.f2898a.getContext(), i) : null;
        d1Var.c();
    }

    public void setLogo(int i) {
        k();
        d1 d1Var = (d1) this.f1283e;
        d1Var.f2901e = i != 0 ? l.z(d1Var.f2898a.getContext(), i) : null;
        d1Var.c();
    }

    public void setOverlayMode(boolean z2) {
        this.f1285g = z2;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i) {
    }

    @Override // l.InterfaceC0217k0
    public void setWindowCallback(Window.Callback callback) {
        k();
        ((d1) this.f1283e).f2905k = callback;
    }

    @Override // l.InterfaceC0217k0
    public void setWindowTitle(CharSequence charSequence) {
        k();
        d1 d1Var = (d1) this.f1283e;
        if (d1Var.f2903g) {
            return;
        }
        d1Var.h = charSequence;
        if ((d1Var.f2899b & 8) != 0) {
            Toolbar toolbar = d1Var.f2898a;
            toolbar.setTitle(charSequence);
            if (d1Var.f2903g) {
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
        return new C0204e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        d1 d1Var = (d1) this.f1283e;
        d1Var.d = drawable;
        d1Var.c();
    }
}
