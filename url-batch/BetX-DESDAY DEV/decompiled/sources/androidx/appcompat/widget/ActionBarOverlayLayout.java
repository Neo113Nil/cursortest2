package androidx.appcompat.widget;

import C.d;
import K.B0;
import K.C0007d0;
import K.C0024u;
import K.InterfaceC0022s;
import K.InterfaceC0023t;
import K.J;
import K.L;
import K.X;
import K.q0;
import K.r0;
import K.s0;
import K.t0;
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
import com.luckyarcade.spinthrow.R;
import g.O;
import j.k;
import java.util.WeakHashMap;
import k.InterfaceC0213x;
import k.MenuC0202m;
import l.C0258e;
import l.C0260f;
import l.C0270k;
import l.InterfaceC0256d;
import l.InterfaceC0273l0;
import l.InterfaceC0275m0;
import l.RunnableC0254c;
import l.Y0;
import l.d1;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0273l0, InterfaceC0022s, InterfaceC0023t {

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f1007C = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* renamed from: D, reason: collision with root package name */
    public static final B0 f1008D;

    /* renamed from: E, reason: collision with root package name */
    public static final Rect f1009E;

    /* renamed from: A, reason: collision with root package name */
    public final C0024u f1010A;

    /* renamed from: B, reason: collision with root package name */
    public final C0260f f1011B;

    /* renamed from: a, reason: collision with root package name */
    public int f1012a;

    /* renamed from: b, reason: collision with root package name */
    public int f1013b;

    /* renamed from: c, reason: collision with root package name */
    public ContentFrameLayout f1014c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContainer f1015d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0275m0 f1016e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f1017f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1018g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1019j;

    /* renamed from: k, reason: collision with root package name */
    public int f1020k;

    /* renamed from: l, reason: collision with root package name */
    public int f1021l;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f1022m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f1023n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f1024o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f1025p;

    /* renamed from: q, reason: collision with root package name */
    public B0 f1026q;

    /* renamed from: r, reason: collision with root package name */
    public B0 f1027r;

    /* renamed from: s, reason: collision with root package name */
    public B0 f1028s;

    /* renamed from: t, reason: collision with root package name */
    public B0 f1029t;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC0256d f1030u;

    /* renamed from: v, reason: collision with root package name */
    public OverScroller f1031v;

    /* renamed from: w, reason: collision with root package name */
    public ViewPropertyAnimator f1032w;

    /* renamed from: x, reason: collision with root package name */
    public final C0007d0 f1033x;

    /* renamed from: y, reason: collision with root package name */
    public final RunnableC0254c f1034y;

    /* renamed from: z, reason: collision with root package name */
    public final RunnableC0254c f1035z;

    static {
        int i = Build.VERSION.SDK_INT;
        t0 s0Var = i >= 30 ? new s0() : i >= 29 ? new r0() : new q0();
        s0Var.g(d.b(0, 1, 0, 1));
        f1008D = s0Var.b();
        f1009E = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1013b = 0;
        this.f1022m = new Rect();
        this.f1023n = new Rect();
        this.f1024o = new Rect();
        this.f1025p = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        B0 b02 = B0.f395b;
        this.f1026q = b02;
        this.f1027r = b02;
        this.f1028s = b02;
        this.f1029t = b02;
        this.f1033x = new C0007d0(4, this);
        this.f1034y = new RunnableC0254c(this, 0);
        this.f1035z = new RunnableC0254c(this, 1);
        i(context);
        this.f1010A = new C0024u();
        C0260f c0260f = new C0260f(context);
        c0260f.setWillNotDraw(true);
        this.f1011B = c0260f;
        addView(c0260f);
    }

    public static boolean g(View view, Rect rect, boolean z2) {
        boolean z3;
        C0258e c0258e = (C0258e) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) c0258e).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) c0258e).leftMargin = i2;
            z3 = true;
        } else {
            z3 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) c0258e).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) c0258e).topMargin = i4;
            z3 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) c0258e).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) c0258e).rightMargin = i6;
            z3 = true;
        }
        if (z2) {
            int i7 = ((ViewGroup.MarginLayoutParams) c0258e).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) c0258e).bottomMargin = i8;
                return true;
            }
        }
        return z3;
    }

    @Override // K.InterfaceC0022s
    public final void a(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // K.InterfaceC0023t
    public final void b(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        c(view, i, i2, i3, i4, i5);
    }

    @Override // K.InterfaceC0022s
    public final void c(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0258e;
    }

    @Override // K.InterfaceC0022s
    public final void d(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f1017f != null) {
            if (this.f1015d.getVisibility() == 0) {
                i = (int) (this.f1015d.getTranslationY() + this.f1015d.getBottom() + 0.5f);
            } else {
                i = 0;
            }
            this.f1017f.setBounds(0, i, getWidth(), this.f1017f.getIntrinsicHeight() + i);
            this.f1017f.draw(canvas);
        }
    }

    @Override // K.InterfaceC0022s
    public final void e(View view, int i, int i2, int[] iArr, int i3) {
    }

    @Override // K.InterfaceC0022s
    public final boolean f(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0258e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0258e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1015d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0024u c0024u = this.f1010A;
        return c0024u.f502b | c0024u.f501a;
    }

    public CharSequence getTitle() {
        k();
        return ((d1) this.f1016e).f3352a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f1034y);
        removeCallbacks(this.f1035z);
        ViewPropertyAnimator viewPropertyAnimator = this.f1032w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1007C);
        this.f1012a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1017f = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f1031v = new OverScroller(context);
    }

    public final void j(int i) {
        k();
        if (i == 2) {
            ((d1) this.f1016e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((d1) this.f1016e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        InterfaceC0275m0 wrapper;
        if (this.f1014c == null) {
            this.f1014c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f1015d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof InterfaceC0275m0) {
                wrapper = (InterfaceC0275m0) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f1016e = wrapper;
        }
    }

    public final void l(MenuC0202m menuC0202m, InterfaceC0213x interfaceC0213x) {
        k();
        d1 d1Var = (d1) this.f1016e;
        C0270k c0270k = d1Var.f3362m;
        Toolbar toolbar = d1Var.f3352a;
        if (c0270k == null) {
            d1Var.f3362m = new C0270k(toolbar.getContext());
        }
        C0270k c0270k2 = d1Var.f3362m;
        c0270k2.f3393e = interfaceC0213x;
        if (menuC0202m == null && toolbar.f1081a == null) {
            return;
        }
        toolbar.f();
        MenuC0202m menuC0202m2 = toolbar.f1081a.f1037p;
        if (menuC0202m2 == menuC0202m) {
            return;
        }
        if (menuC0202m2 != null) {
            menuC0202m2.r(toolbar.f1072L);
            menuC0202m2.r(toolbar.f1073M);
        }
        if (toolbar.f1073M == null) {
            toolbar.f1073M = new Y0(toolbar);
        }
        c0270k2.f3403q = true;
        if (menuC0202m != null) {
            menuC0202m.b(c0270k2, toolbar.f1088j);
            menuC0202m.b(toolbar.f1073M, toolbar.f1088j);
        } else {
            c0270k2.j(toolbar.f1088j, null);
            toolbar.f1073M.j(toolbar.f1088j, null);
            c0270k2.c();
            toolbar.f1073M.c();
        }
        toolbar.f1081a.setPopupTheme(toolbar.f1089k);
        toolbar.f1081a.setPresenter(c0270k2);
        toolbar.f1072L = c0270k2;
        toolbar.w();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        B0 g2 = B0.g(this, windowInsets);
        boolean g3 = g(this.f1015d, new Rect(g2.b(), g2.d(), g2.c(), g2.a()), false);
        WeakHashMap weakHashMap = X.f419a;
        Rect rect = this.f1022m;
        L.b(this, g2, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        z0 z0Var = g2.f396a;
        B0 l2 = z0Var.l(i, i2, i3, i4);
        this.f1026q = l2;
        boolean z2 = true;
        if (!this.f1027r.equals(l2)) {
            this.f1027r = this.f1026q;
            g3 = true;
        }
        Rect rect2 = this.f1023n;
        if (rect2.equals(rect)) {
            z2 = g3;
        } else {
            rect2.set(rect);
        }
        if (z2) {
            requestLayout();
        }
        return z0Var.a().f396a.c().f396a.b().f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = X.f419a;
        J.c(this);
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
                C0258e c0258e = (C0258e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) c0258e).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) c0258e).topMargin + paddingTop;
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
        measureChildWithMargins(this.f1015d, i, 0, i2, 0);
        C0258e c0258e = (C0258e) this.f1015d.getLayoutParams();
        int max = Math.max(0, this.f1015d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0258e).leftMargin + ((ViewGroup.MarginLayoutParams) c0258e).rightMargin);
        int max2 = Math.max(0, this.f1015d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0258e).topMargin + ((ViewGroup.MarginLayoutParams) c0258e).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f1015d.getMeasuredState());
        WeakHashMap weakHashMap = X.f419a;
        boolean z2 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z2) {
            measuredHeight = this.f1012a;
            if (this.h && this.f1015d.getTabContainer() != null) {
                measuredHeight += this.f1012a;
            }
        } else {
            measuredHeight = this.f1015d.getVisibility() != 8 ? this.f1015d.getMeasuredHeight() : 0;
        }
        Rect rect = this.f1022m;
        Rect rect2 = this.f1024o;
        rect2.set(rect);
        this.f1028s = this.f1026q;
        if (!this.f1018g && !z2) {
            C0260f c0260f = this.f1011B;
            B0 b02 = f1008D;
            Rect rect3 = this.f1025p;
            L.b(c0260f, b02, rect3);
            if (!rect3.equals(f1009E)) {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.f1028s = this.f1028s.f396a.l(0, measuredHeight, 0, 0);
                g(this.f1014c, rect2, true);
                if (!this.f1029t.equals(this.f1028s)) {
                    B0 b03 = this.f1028s;
                    this.f1029t = b03;
                    ContentFrameLayout contentFrameLayout = this.f1014c;
                    WindowInsets f2 = b03.f();
                    if (f2 != null) {
                        WindowInsets a2 = J.a(contentFrameLayout, f2);
                        if (!a2.equals(f2)) {
                            B0.g(contentFrameLayout, a2);
                        }
                    }
                }
                measureChildWithMargins(this.f1014c, i, 0, i2, 0);
                C0258e c0258e2 = (C0258e) this.f1014c.getLayoutParams();
                int max3 = Math.max(max, this.f1014c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0258e2).leftMargin + ((ViewGroup.MarginLayoutParams) c0258e2).rightMargin);
                int max4 = Math.max(max2, this.f1014c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0258e2).topMargin + ((ViewGroup.MarginLayoutParams) c0258e2).bottomMargin);
                int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1014c.getMeasuredState());
                setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
            }
        }
        d b2 = d.b(this.f1028s.b(), this.f1028s.d() + measuredHeight, this.f1028s.c(), this.f1028s.a());
        B0 b04 = this.f1028s;
        int i3 = Build.VERSION.SDK_INT;
        t0 s0Var = i3 >= 30 ? new s0(b04) : i3 >= 29 ? new r0(b04) : new q0(b04);
        s0Var.g(b2);
        this.f1028s = s0Var.b();
        g(this.f1014c, rect2, true);
        if (!this.f1029t.equals(this.f1028s)) {
        }
        measureChildWithMargins(this.f1014c, i, 0, i2, 0);
        C0258e c0258e22 = (C0258e) this.f1014c.getLayoutParams();
        int max32 = Math.max(max, this.f1014c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0258e22).leftMargin + ((ViewGroup.MarginLayoutParams) c0258e22).rightMargin);
        int max42 = Math.max(max2, this.f1014c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0258e22).topMargin + ((ViewGroup.MarginLayoutParams) c0258e22).bottomMargin);
        int combineMeasuredStates22 = View.combineMeasuredStates(combineMeasuredStates, this.f1014c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max32, getSuggestedMinimumWidth()), i, combineMeasuredStates22), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max42, getSuggestedMinimumHeight()), i2, combineMeasuredStates22 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (!this.i || !z2) {
            return false;
        }
        this.f1031v.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f1031v.getFinalY() > this.f1015d.getHeight()) {
            h();
            this.f1035z.run();
        } else {
            h();
            this.f1034y.run();
        }
        this.f1019j = true;
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
        int i5 = this.f1020k + i2;
        this.f1020k = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        O o2;
        k kVar;
        this.f1010A.f501a = i;
        this.f1020k = getActionBarHideOffset();
        h();
        InterfaceC0256d interfaceC0256d = this.f1030u;
        if (interfaceC0256d == null || (kVar = (o2 = (O) interfaceC0256d).f2539s) == null) {
            return;
        }
        kVar.a();
        o2.f2539s = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f1015d.getVisibility() != 0) {
            return false;
        }
        return this.i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.i || this.f1019j) {
            return;
        }
        if (this.f1020k <= this.f1015d.getHeight()) {
            h();
            postDelayed(this.f1034y, 600L);
        } else {
            h();
            postDelayed(this.f1035z, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        k();
        int i2 = this.f1021l ^ i;
        this.f1021l = i;
        boolean z2 = (i & 4) == 0;
        boolean z3 = (i & 256) != 0;
        InterfaceC0256d interfaceC0256d = this.f1030u;
        if (interfaceC0256d != null) {
            O o2 = (O) interfaceC0256d;
            o2.f2535o = !z3;
            if (z2 || !z3) {
                if (o2.f2536p) {
                    o2.f2536p = false;
                    o2.s(true);
                }
            } else if (!o2.f2536p) {
                o2.f2536p = true;
                o2.s(true);
            }
        }
        if ((i2 & 256) == 0 || this.f1030u == null) {
            return;
        }
        WeakHashMap weakHashMap = X.f419a;
        J.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f1013b = i;
        InterfaceC0256d interfaceC0256d = this.f1030u;
        if (interfaceC0256d != null) {
            ((O) interfaceC0256d).f2534n = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        h();
        this.f1015d.setTranslationY(-Math.max(0, Math.min(i, this.f1015d.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0256d interfaceC0256d) {
        this.f1030u = interfaceC0256d;
        if (getWindowToken() != null) {
            ((O) this.f1030u).f2534n = this.f1013b;
            int i = this.f1021l;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = X.f419a;
                J.c(this);
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
        d1 d1Var = (d1) this.f1016e;
        d1Var.f3355d = i != 0 ? q1.d.z(d1Var.f3352a.getContext(), i) : null;
        d1Var.c();
    }

    public void setLogo(int i) {
        k();
        d1 d1Var = (d1) this.f1016e;
        d1Var.f3356e = i != 0 ? q1.d.z(d1Var.f3352a.getContext(), i) : null;
        d1Var.c();
    }

    public void setOverlayMode(boolean z2) {
        this.f1018g = z2;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i) {
    }

    @Override // l.InterfaceC0273l0
    public void setWindowCallback(Window.Callback callback) {
        k();
        ((d1) this.f1016e).f3360k = callback;
    }

    @Override // l.InterfaceC0273l0
    public void setWindowTitle(CharSequence charSequence) {
        k();
        d1 d1Var = (d1) this.f1016e;
        if (d1Var.f3358g) {
            return;
        }
        d1Var.h = charSequence;
        if ((d1Var.f3353b & 8) != 0) {
            Toolbar toolbar = d1Var.f3352a;
            toolbar.setTitle(charSequence);
            if (d1Var.f3358g) {
                X.m(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0258e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        d1 d1Var = (d1) this.f1016e;
        d1Var.f3355d = drawable;
        d1Var.c();
    }
}
