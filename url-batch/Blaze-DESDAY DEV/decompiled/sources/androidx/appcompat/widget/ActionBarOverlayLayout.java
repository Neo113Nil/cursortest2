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
import com.winworm.neongrid.R;
import g.K;
import j.j;
import java.util.WeakHashMap;
import k.InterfaceC0177x;
import k.MenuC0166m;
import l.C0207e;
import l.C0209f;
import l.C0219k;
import l.InterfaceC0205d;
import l.InterfaceC0220k0;
import l.InterfaceC0222l0;
import l.RunnableC0203c;
import l.Y0;
import l.d1;
import z1.l;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0220k0, InterfaceC0017o, InterfaceC0018p {

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f1306C = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* renamed from: D, reason: collision with root package name */
    public static final z0 f1307D;

    /* renamed from: E, reason: collision with root package name */
    public static final Rect f1308E;

    /* renamed from: A, reason: collision with root package name */
    public final C0019q f1309A;

    /* renamed from: B, reason: collision with root package name */
    public final C0209f f1310B;

    /* renamed from: a, reason: collision with root package name */
    public int f1311a;

    /* renamed from: b, reason: collision with root package name */
    public int f1312b;

    /* renamed from: c, reason: collision with root package name */
    public ContentFrameLayout f1313c;
    public ActionBarContainer d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0222l0 f1314e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f1315f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1316g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1317j;

    /* renamed from: k, reason: collision with root package name */
    public int f1318k;

    /* renamed from: l, reason: collision with root package name */
    public int f1319l;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f1320m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f1321n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f1322o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f1323p;

    /* renamed from: q, reason: collision with root package name */
    public z0 f1324q;

    /* renamed from: r, reason: collision with root package name */
    public z0 f1325r;

    /* renamed from: s, reason: collision with root package name */
    public z0 f1326s;

    /* renamed from: t, reason: collision with root package name */
    public z0 f1327t;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC0205d f1328u;

    /* renamed from: v, reason: collision with root package name */
    public OverScroller f1329v;

    /* renamed from: w, reason: collision with root package name */
    public ViewPropertyAnimator f1330w;

    /* renamed from: x, reason: collision with root package name */
    public final C0003b0 f1331x;

    /* renamed from: y, reason: collision with root package name */
    public final RunnableC0203c f1332y;

    /* renamed from: z, reason: collision with root package name */
    public final RunnableC0203c f1333z;

    static {
        int i = Build.VERSION.SDK_INT;
        r0 q0Var = i >= 30 ? new q0() : i >= 29 ? new p0() : new o0();
        q0Var.g(c.b(0, 1, 0, 1));
        f1307D = q0Var.b();
        f1308E = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1312b = 0;
        this.f1320m = new Rect();
        this.f1321n = new Rect();
        this.f1322o = new Rect();
        this.f1323p = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        z0 z0Var = z0.f535b;
        this.f1324q = z0Var;
        this.f1325r = z0Var;
        this.f1326s = z0Var;
        this.f1327t = z0Var;
        this.f1331x = new C0003b0(2, this);
        this.f1332y = new RunnableC0203c(this, 0);
        this.f1333z = new RunnableC0203c(this, 1);
        i(context);
        this.f1309A = new C0019q();
        C0209f c0209f = new C0209f(context);
        c0209f.setWillNotDraw(true);
        this.f1310B = c0209f;
        addView(c0209f);
    }

    public static boolean g(View view, Rect rect, boolean z2) {
        boolean z3;
        C0207e c0207e = (C0207e) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) c0207e).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) c0207e).leftMargin = i2;
            z3 = true;
        } else {
            z3 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) c0207e).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) c0207e).topMargin = i4;
            z3 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) c0207e).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) c0207e).rightMargin = i6;
            z3 = true;
        }
        if (z2) {
            int i7 = ((ViewGroup.MarginLayoutParams) c0207e).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) c0207e).bottomMargin = i8;
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
        return layoutParams instanceof C0207e;
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
        if (this.f1315f != null) {
            if (this.d.getVisibility() == 0) {
                i = (int) (this.d.getTranslationY() + this.d.getBottom() + 0.5f);
            } else {
                i = 0;
            }
            this.f1315f.setBounds(0, i, getWidth(), this.f1315f.getIntrinsicHeight() + i);
            this.f1315f.draw(canvas);
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
        return new C0207e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0207e(getContext(), attributeSet);
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
        C0019q c0019q = this.f1309A;
        return c0019q.f511b | c0019q.f510a;
    }

    public CharSequence getTitle() {
        k();
        return ((d1) this.f1314e).f2923a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f1332y);
        removeCallbacks(this.f1333z);
        ViewPropertyAnimator viewPropertyAnimator = this.f1330w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1306C);
        this.f1311a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1315f = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f1329v = new OverScroller(context);
    }

    public final void j(int i) {
        k();
        if (i == 2) {
            ((d1) this.f1314e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((d1) this.f1314e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        InterfaceC0222l0 wrapper;
        if (this.f1313c == null) {
            this.f1313c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof InterfaceC0222l0) {
                wrapper = (InterfaceC0222l0) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f1314e = wrapper;
        }
    }

    public final void l(MenuC0166m menuC0166m, InterfaceC0177x interfaceC0177x) {
        k();
        d1 d1Var = (d1) this.f1314e;
        C0219k c0219k = d1Var.f2932m;
        Toolbar toolbar = d1Var.f2923a;
        if (c0219k == null) {
            d1Var.f2932m = new C0219k(toolbar.getContext());
        }
        C0219k c0219k2 = d1Var.f2932m;
        c0219k2.f2960e = interfaceC0177x;
        if (menuC0166m == null && toolbar.f1374a == null) {
            return;
        }
        toolbar.f();
        MenuC0166m menuC0166m2 = toolbar.f1374a.f1334p;
        if (menuC0166m2 == menuC0166m) {
            return;
        }
        if (menuC0166m2 != null) {
            menuC0166m2.r(toolbar.f1367K);
            menuC0166m2.r(toolbar.f1368L);
        }
        if (toolbar.f1368L == null) {
            toolbar.f1368L = new Y0(toolbar);
        }
        c0219k2.f2970q = true;
        if (menuC0166m != null) {
            menuC0166m.b(c0219k2, toolbar.f1380j);
            menuC0166m.b(toolbar.f1368L, toolbar.f1380j);
        } else {
            c0219k2.j(toolbar.f1380j, null);
            toolbar.f1368L.j(toolbar.f1380j, null);
            c0219k2.c();
            toolbar.f1368L.c();
        }
        toolbar.f1374a.setPopupTheme(toolbar.f1381k);
        toolbar.f1374a.setPresenter(c0219k2);
        toolbar.f1367K = c0219k2;
        toolbar.u();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        z0 g2 = z0.g(this, windowInsets);
        boolean g3 = g(this.d, new Rect(g2.b(), g2.d(), g2.c(), g2.a()), false);
        WeakHashMap weakHashMap = T.f440a;
        Rect rect = this.f1320m;
        H.b(this, g2, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        x0 x0Var = g2.f536a;
        z0 l2 = x0Var.l(i, i2, i3, i4);
        this.f1324q = l2;
        boolean z2 = true;
        if (!this.f1325r.equals(l2)) {
            this.f1325r = this.f1324q;
            g3 = true;
        }
        Rect rect2 = this.f1321n;
        if (rect2.equals(rect)) {
            z2 = g3;
        } else {
            rect2.set(rect);
        }
        if (z2) {
            requestLayout();
        }
        return x0Var.a().f536a.c().f536a.b().f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = T.f440a;
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
                C0207e c0207e = (C0207e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) c0207e).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) c0207e).topMargin + paddingTop;
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
        C0207e c0207e = (C0207e) this.d.getLayoutParams();
        int max = Math.max(0, this.d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0207e).leftMargin + ((ViewGroup.MarginLayoutParams) c0207e).rightMargin);
        int max2 = Math.max(0, this.d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0207e).topMargin + ((ViewGroup.MarginLayoutParams) c0207e).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.d.getMeasuredState());
        WeakHashMap weakHashMap = T.f440a;
        boolean z2 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z2) {
            measuredHeight = this.f1311a;
            if (this.h && this.d.getTabContainer() != null) {
                measuredHeight += this.f1311a;
            }
        } else {
            measuredHeight = this.d.getVisibility() != 8 ? this.d.getMeasuredHeight() : 0;
        }
        Rect rect = this.f1320m;
        Rect rect2 = this.f1322o;
        rect2.set(rect);
        this.f1326s = this.f1324q;
        if (!this.f1316g && !z2) {
            C0209f c0209f = this.f1310B;
            z0 z0Var = f1307D;
            Rect rect3 = this.f1323p;
            H.b(c0209f, z0Var, rect3);
            if (!rect3.equals(f1308E)) {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.f1326s = this.f1326s.f536a.l(0, measuredHeight, 0, 0);
                g(this.f1313c, rect2, true);
                if (!this.f1327t.equals(this.f1326s)) {
                    z0 z0Var2 = this.f1326s;
                    this.f1327t = z0Var2;
                    ContentFrameLayout contentFrameLayout = this.f1313c;
                    WindowInsets f2 = z0Var2.f();
                    if (f2 != null) {
                        WindowInsets a2 = F.a(contentFrameLayout, f2);
                        if (!a2.equals(f2)) {
                            z0.g(contentFrameLayout, a2);
                        }
                    }
                }
                measureChildWithMargins(this.f1313c, i, 0, i2, 0);
                C0207e c0207e2 = (C0207e) this.f1313c.getLayoutParams();
                int max3 = Math.max(max, this.f1313c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0207e2).leftMargin + ((ViewGroup.MarginLayoutParams) c0207e2).rightMargin);
                int max4 = Math.max(max2, this.f1313c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0207e2).topMargin + ((ViewGroup.MarginLayoutParams) c0207e2).bottomMargin);
                int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1313c.getMeasuredState());
                setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
            }
        }
        c b2 = c.b(this.f1326s.b(), this.f1326s.d() + measuredHeight, this.f1326s.c(), this.f1326s.a());
        z0 z0Var3 = this.f1326s;
        int i3 = Build.VERSION.SDK_INT;
        r0 q0Var = i3 >= 30 ? new q0(z0Var3) : i3 >= 29 ? new p0(z0Var3) : new o0(z0Var3);
        q0Var.g(b2);
        this.f1326s = q0Var.b();
        g(this.f1313c, rect2, true);
        if (!this.f1327t.equals(this.f1326s)) {
        }
        measureChildWithMargins(this.f1313c, i, 0, i2, 0);
        C0207e c0207e22 = (C0207e) this.f1313c.getLayoutParams();
        int max32 = Math.max(max, this.f1313c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0207e22).leftMargin + ((ViewGroup.MarginLayoutParams) c0207e22).rightMargin);
        int max42 = Math.max(max2, this.f1313c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0207e22).topMargin + ((ViewGroup.MarginLayoutParams) c0207e22).bottomMargin);
        int combineMeasuredStates22 = View.combineMeasuredStates(combineMeasuredStates, this.f1313c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max32, getSuggestedMinimumWidth()), i, combineMeasuredStates22), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max42, getSuggestedMinimumHeight()), i2, combineMeasuredStates22 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (!this.i || !z2) {
            return false;
        }
        this.f1329v.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f1329v.getFinalY() > this.d.getHeight()) {
            h();
            this.f1333z.run();
        } else {
            h();
            this.f1332y.run();
        }
        this.f1317j = true;
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
        int i5 = this.f1318k + i2;
        this.f1318k = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        K k2;
        j jVar;
        this.f1309A.f510a = i;
        this.f1318k = getActionBarHideOffset();
        h();
        InterfaceC0205d interfaceC0205d = this.f1328u;
        if (interfaceC0205d == null || (jVar = (k2 = (K) interfaceC0205d).f2214s) == null) {
            return;
        }
        jVar.a();
        k2.f2214s = null;
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
        if (!this.i || this.f1317j) {
            return;
        }
        if (this.f1318k <= this.d.getHeight()) {
            h();
            postDelayed(this.f1332y, 600L);
        } else {
            h();
            postDelayed(this.f1333z, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        k();
        int i2 = this.f1319l ^ i;
        this.f1319l = i;
        boolean z2 = (i & 4) == 0;
        boolean z3 = (i & 256) != 0;
        InterfaceC0205d interfaceC0205d = this.f1328u;
        if (interfaceC0205d != null) {
            K k2 = (K) interfaceC0205d;
            k2.f2210o = !z3;
            if (z2 || !z3) {
                if (k2.f2211p) {
                    k2.f2211p = false;
                    k2.A0(true);
                }
            } else if (!k2.f2211p) {
                k2.f2211p = true;
                k2.A0(true);
            }
        }
        if ((i2 & 256) == 0 || this.f1328u == null) {
            return;
        }
        WeakHashMap weakHashMap = T.f440a;
        F.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f1312b = i;
        InterfaceC0205d interfaceC0205d = this.f1328u;
        if (interfaceC0205d != null) {
            ((K) interfaceC0205d).f2209n = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        h();
        this.d.setTranslationY(-Math.max(0, Math.min(i, this.d.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0205d interfaceC0205d) {
        this.f1328u = interfaceC0205d;
        if (getWindowToken() != null) {
            ((K) this.f1328u).f2209n = this.f1312b;
            int i = this.f1319l;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = T.f440a;
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
        d1 d1Var = (d1) this.f1314e;
        d1Var.d = i != 0 ? l.w(d1Var.f2923a.getContext(), i) : null;
        d1Var.c();
    }

    public void setLogo(int i) {
        k();
        d1 d1Var = (d1) this.f1314e;
        d1Var.f2926e = i != 0 ? l.w(d1Var.f2923a.getContext(), i) : null;
        d1Var.c();
    }

    public void setOverlayMode(boolean z2) {
        this.f1316g = z2;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i) {
    }

    @Override // l.InterfaceC0220k0
    public void setWindowCallback(Window.Callback callback) {
        k();
        ((d1) this.f1314e).f2930k = callback;
    }

    @Override // l.InterfaceC0220k0
    public void setWindowTitle(CharSequence charSequence) {
        k();
        d1 d1Var = (d1) this.f1314e;
        if (d1Var.f2928g) {
            return;
        }
        d1Var.h = charSequence;
        if ((d1Var.f2924b & 8) != 0) {
            Toolbar toolbar = d1Var.f2923a;
            toolbar.setTitle(charSequence);
            if (d1Var.f2928g) {
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
        return new C0207e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        d1 d1Var = (d1) this.f1314e;
        d1Var.d = drawable;
        d1Var.c();
    }
}
