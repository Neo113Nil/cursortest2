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
import com.visualfortune.eyerest.R;
import g.K;
import j.j;
import java.util.WeakHashMap;
import k.InterfaceC0169x;
import k.MenuC0158m;
import l.C0211e;
import l.C0213f;
import l.C0223k;
import l.InterfaceC0209d;
import l.InterfaceC0226l0;
import l.InterfaceC0228m0;
import l.RunnableC0207c;
import l.Y0;
import l.d1;
import s1.l;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0226l0, InterfaceC0014o, InterfaceC0015p {

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f1191C = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* renamed from: D, reason: collision with root package name */
    public static final w0 f1192D;

    /* renamed from: E, reason: collision with root package name */
    public static final Rect f1193E;

    /* renamed from: A, reason: collision with root package name */
    public final C0016q f1194A;

    /* renamed from: B, reason: collision with root package name */
    public final C0213f f1195B;

    /* renamed from: a, reason: collision with root package name */
    public int f1196a;

    /* renamed from: b, reason: collision with root package name */
    public int f1197b;

    /* renamed from: c, reason: collision with root package name */
    public ContentFrameLayout f1198c;
    public ActionBarContainer d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0228m0 f1199e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f1200f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1201g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1202j;

    /* renamed from: k, reason: collision with root package name */
    public int f1203k;

    /* renamed from: l, reason: collision with root package name */
    public int f1204l;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f1205m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f1206n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f1207o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f1208p;

    /* renamed from: q, reason: collision with root package name */
    public w0 f1209q;

    /* renamed from: r, reason: collision with root package name */
    public w0 f1210r;

    /* renamed from: s, reason: collision with root package name */
    public w0 f1211s;

    /* renamed from: t, reason: collision with root package name */
    public w0 f1212t;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC0209d f1213u;

    /* renamed from: v, reason: collision with root package name */
    public OverScroller f1214v;

    /* renamed from: w, reason: collision with root package name */
    public ViewPropertyAnimator f1215w;

    /* renamed from: x, reason: collision with root package name */
    public final Y f1216x;

    /* renamed from: y, reason: collision with root package name */
    public final RunnableC0207c f1217y;

    /* renamed from: z, reason: collision with root package name */
    public final RunnableC0207c f1218z;

    static {
        int i = Build.VERSION.SDK_INT;
        o0 n0Var = i >= 30 ? new n0() : i >= 29 ? new m0() : new l0();
        n0Var.g(c.b(0, 1, 0, 1));
        f1192D = n0Var.b();
        f1193E = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1197b = 0;
        this.f1205m = new Rect();
        this.f1206n = new Rect();
        this.f1207o = new Rect();
        this.f1208p = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        w0 w0Var = w0.f448b;
        this.f1209q = w0Var;
        this.f1210r = w0Var;
        this.f1211s = w0Var;
        this.f1212t = w0Var;
        this.f1216x = new Y(3, this);
        this.f1217y = new RunnableC0207c(this, 0);
        this.f1218z = new RunnableC0207c(this, 1);
        i(context);
        this.f1194A = new C0016q();
        C0213f c0213f = new C0213f(context);
        c0213f.setWillNotDraw(true);
        this.f1195B = c0213f;
        addView(c0213f);
    }

    public static boolean g(View view, Rect rect, boolean z2) {
        boolean z3;
        C0211e c0211e = (C0211e) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) c0211e).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) c0211e).leftMargin = i2;
            z3 = true;
        } else {
            z3 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) c0211e).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) c0211e).topMargin = i4;
            z3 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) c0211e).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) c0211e).rightMargin = i6;
            z3 = true;
        }
        if (z2) {
            int i7 = ((ViewGroup.MarginLayoutParams) c0211e).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) c0211e).bottomMargin = i8;
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
        return layoutParams instanceof C0211e;
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
        if (this.f1200f != null) {
            if (this.d.getVisibility() == 0) {
                i = (int) (this.d.getTranslationY() + this.d.getBottom() + 0.5f);
            } else {
                i = 0;
            }
            this.f1200f.setBounds(0, i, getWidth(), this.f1200f.getIntrinsicHeight() + i);
            this.f1200f.draw(canvas);
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
        return new C0211e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0211e(getContext(), attributeSet);
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
        C0016q c0016q = this.f1194A;
        return c0016q.f436b | c0016q.f435a;
    }

    public CharSequence getTitle() {
        k();
        return ((d1) this.f1199e).f3052a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f1217y);
        removeCallbacks(this.f1218z);
        ViewPropertyAnimator viewPropertyAnimator = this.f1215w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1191C);
        this.f1196a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1200f = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f1214v = new OverScroller(context);
    }

    public final void j(int i) {
        k();
        if (i == 2) {
            ((d1) this.f1199e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((d1) this.f1199e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        InterfaceC0228m0 wrapper;
        if (this.f1198c == null) {
            this.f1198c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof InterfaceC0228m0) {
                wrapper = (InterfaceC0228m0) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f1199e = wrapper;
        }
    }

    public final void l(MenuC0158m menuC0158m, InterfaceC0169x interfaceC0169x) {
        k();
        d1 d1Var = (d1) this.f1199e;
        C0223k c0223k = d1Var.f3061m;
        Toolbar toolbar = d1Var.f3052a;
        if (c0223k == null) {
            d1Var.f3061m = new C0223k(toolbar.getContext());
        }
        C0223k c0223k2 = d1Var.f3061m;
        c0223k2.f3089e = interfaceC0169x;
        if (menuC0158m == null && toolbar.f1259a == null) {
            return;
        }
        toolbar.f();
        MenuC0158m menuC0158m2 = toolbar.f1259a.f1219p;
        if (menuC0158m2 == menuC0158m) {
            return;
        }
        if (menuC0158m2 != null) {
            menuC0158m2.r(toolbar.f1252K);
            menuC0158m2.r(toolbar.f1253L);
        }
        if (toolbar.f1253L == null) {
            toolbar.f1253L = new Y0(toolbar);
        }
        c0223k2.f3099q = true;
        if (menuC0158m != null) {
            menuC0158m.b(c0223k2, toolbar.f1265j);
            menuC0158m.b(toolbar.f1253L, toolbar.f1265j);
        } else {
            c0223k2.j(toolbar.f1265j, null);
            toolbar.f1253L.j(toolbar.f1265j, null);
            c0223k2.c();
            toolbar.f1253L.c();
        }
        toolbar.f1259a.setPopupTheme(toolbar.f1266k);
        toolbar.f1259a.setPresenter(c0223k2);
        toolbar.f1252K = c0223k2;
        toolbar.u();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        w0 g2 = w0.g(this, windowInsets);
        boolean g3 = g(this.d, new Rect(g2.b(), g2.d(), g2.c(), g2.a()), false);
        WeakHashMap weakHashMap = S.f362a;
        Rect rect = this.f1205m;
        G.b(this, g2, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        u0 u0Var = g2.f449a;
        w0 l2 = u0Var.l(i, i2, i3, i4);
        this.f1209q = l2;
        boolean z2 = true;
        if (!this.f1210r.equals(l2)) {
            this.f1210r = this.f1209q;
            g3 = true;
        }
        Rect rect2 = this.f1206n;
        if (rect2.equals(rect)) {
            z2 = g3;
        } else {
            rect2.set(rect);
        }
        if (z2) {
            requestLayout();
        }
        return u0Var.a().f449a.c().f449a.b().f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = S.f362a;
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
                C0211e c0211e = (C0211e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) c0211e).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) c0211e).topMargin + paddingTop;
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
        C0211e c0211e = (C0211e) this.d.getLayoutParams();
        int max = Math.max(0, this.d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0211e).leftMargin + ((ViewGroup.MarginLayoutParams) c0211e).rightMargin);
        int max2 = Math.max(0, this.d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0211e).topMargin + ((ViewGroup.MarginLayoutParams) c0211e).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.d.getMeasuredState());
        WeakHashMap weakHashMap = S.f362a;
        boolean z2 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z2) {
            measuredHeight = this.f1196a;
            if (this.h && this.d.getTabContainer() != null) {
                measuredHeight += this.f1196a;
            }
        } else {
            measuredHeight = this.d.getVisibility() != 8 ? this.d.getMeasuredHeight() : 0;
        }
        Rect rect = this.f1205m;
        Rect rect2 = this.f1207o;
        rect2.set(rect);
        this.f1211s = this.f1209q;
        if (!this.f1201g && !z2) {
            C0213f c0213f = this.f1195B;
            w0 w0Var = f1192D;
            Rect rect3 = this.f1208p;
            G.b(c0213f, w0Var, rect3);
            if (!rect3.equals(f1193E)) {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.f1211s = this.f1211s.f449a.l(0, measuredHeight, 0, 0);
                g(this.f1198c, rect2, true);
                if (!this.f1212t.equals(this.f1211s)) {
                    w0 w0Var2 = this.f1211s;
                    this.f1212t = w0Var2;
                    ContentFrameLayout contentFrameLayout = this.f1198c;
                    WindowInsets f2 = w0Var2.f();
                    if (f2 != null) {
                        WindowInsets a2 = E.a(contentFrameLayout, f2);
                        if (!a2.equals(f2)) {
                            w0.g(contentFrameLayout, a2);
                        }
                    }
                }
                measureChildWithMargins(this.f1198c, i, 0, i2, 0);
                C0211e c0211e2 = (C0211e) this.f1198c.getLayoutParams();
                int max3 = Math.max(max, this.f1198c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0211e2).leftMargin + ((ViewGroup.MarginLayoutParams) c0211e2).rightMargin);
                int max4 = Math.max(max2, this.f1198c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0211e2).topMargin + ((ViewGroup.MarginLayoutParams) c0211e2).bottomMargin);
                int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1198c.getMeasuredState());
                setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
            }
        }
        c b2 = c.b(this.f1211s.b(), this.f1211s.d() + measuredHeight, this.f1211s.c(), this.f1211s.a());
        w0 w0Var3 = this.f1211s;
        int i3 = Build.VERSION.SDK_INT;
        o0 n0Var = i3 >= 30 ? new n0(w0Var3) : i3 >= 29 ? new m0(w0Var3) : new l0(w0Var3);
        n0Var.g(b2);
        this.f1211s = n0Var.b();
        g(this.f1198c, rect2, true);
        if (!this.f1212t.equals(this.f1211s)) {
        }
        measureChildWithMargins(this.f1198c, i, 0, i2, 0);
        C0211e c0211e22 = (C0211e) this.f1198c.getLayoutParams();
        int max32 = Math.max(max, this.f1198c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0211e22).leftMargin + ((ViewGroup.MarginLayoutParams) c0211e22).rightMargin);
        int max42 = Math.max(max2, this.f1198c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0211e22).topMargin + ((ViewGroup.MarginLayoutParams) c0211e22).bottomMargin);
        int combineMeasuredStates22 = View.combineMeasuredStates(combineMeasuredStates, this.f1198c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max32, getSuggestedMinimumWidth()), i, combineMeasuredStates22), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max42, getSuggestedMinimumHeight()), i2, combineMeasuredStates22 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (!this.i || !z2) {
            return false;
        }
        this.f1214v.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f1214v.getFinalY() > this.d.getHeight()) {
            h();
            this.f1218z.run();
        } else {
            h();
            this.f1217y.run();
        }
        this.f1202j = true;
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
        int i5 = this.f1203k + i2;
        this.f1203k = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        K k2;
        j jVar;
        this.f1194A.f435a = i;
        this.f1203k = getActionBarHideOffset();
        h();
        InterfaceC0209d interfaceC0209d = this.f1213u;
        if (interfaceC0209d == null || (jVar = (k2 = (K) interfaceC0209d).f2356z) == null) {
            return;
        }
        jVar.a();
        k2.f2356z = null;
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
        if (!this.i || this.f1202j) {
            return;
        }
        if (this.f1203k <= this.d.getHeight()) {
            h();
            postDelayed(this.f1217y, 600L);
        } else {
            h();
            postDelayed(this.f1218z, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        k();
        int i2 = this.f1204l ^ i;
        this.f1204l = i;
        boolean z2 = (i & 4) == 0;
        boolean z3 = (i & 256) != 0;
        InterfaceC0209d interfaceC0209d = this.f1213u;
        if (interfaceC0209d != null) {
            K k2 = (K) interfaceC0209d;
            k2.f2352v = !z3;
            if (z2 || !z3) {
                if (k2.f2353w) {
                    k2.f2353w = false;
                    k2.p0(true);
                }
            } else if (!k2.f2353w) {
                k2.f2353w = true;
                k2.p0(true);
            }
        }
        if ((i2 & 256) == 0 || this.f1213u == null) {
            return;
        }
        WeakHashMap weakHashMap = S.f362a;
        E.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f1197b = i;
        InterfaceC0209d interfaceC0209d = this.f1213u;
        if (interfaceC0209d != null) {
            ((K) interfaceC0209d).f2351u = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        h();
        this.d.setTranslationY(-Math.max(0, Math.min(i, this.d.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0209d interfaceC0209d) {
        this.f1213u = interfaceC0209d;
        if (getWindowToken() != null) {
            ((K) this.f1213u).f2351u = this.f1197b;
            int i = this.f1204l;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = S.f362a;
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
        d1 d1Var = (d1) this.f1199e;
        d1Var.d = i != 0 ? l.z(d1Var.f3052a.getContext(), i) : null;
        d1Var.c();
    }

    public void setLogo(int i) {
        k();
        d1 d1Var = (d1) this.f1199e;
        d1Var.f3055e = i != 0 ? l.z(d1Var.f3052a.getContext(), i) : null;
        d1Var.c();
    }

    public void setOverlayMode(boolean z2) {
        this.f1201g = z2;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i) {
    }

    @Override // l.InterfaceC0226l0
    public void setWindowCallback(Window.Callback callback) {
        k();
        ((d1) this.f1199e).f3059k = callback;
    }

    @Override // l.InterfaceC0226l0
    public void setWindowTitle(CharSequence charSequence) {
        k();
        d1 d1Var = (d1) this.f1199e;
        if (d1Var.f3057g) {
            return;
        }
        d1Var.h = charSequence;
        if ((d1Var.f3053b & 8) != 0) {
            Toolbar toolbar = d1Var.f3052a;
            toolbar.setTitle(charSequence);
            if (d1Var.f3057g) {
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
        return new C0211e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        d1 d1Var = (d1) this.f1199e;
        d1Var.d = drawable;
        d1Var.c();
    }
}
