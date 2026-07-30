package androidx.appcompat.widget;

import I.C0123t;
import I.InterfaceC0122s;
import I.K;
import I.T;
import I.X;
import I.a0;
import I.b0;
import I.c0;
import I.d0;
import I.e0;
import I.f0;
import I.g0;
import I.h0;
import I.r;
import I.r0;
import I.v0;
import O6.g;
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
import com.icefishing.icefish.ice.fishing.s294s.R;
import i.C0513O;
import j4.C0573b;
import java.util.WeakHashMap;
import m.m;
import m.y;
import n.C0706e;
import n.C0716j;
import n.InterfaceC0704d;
import n.InterfaceC0723m0;
import n.InterfaceC0725n0;
import n.RunnableC0702c;
import n.n1;
import n.s1;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0723m0, r, InterfaceC0122s {

    /* renamed from: J, reason: collision with root package name */
    public static final int[] f3167J = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* renamed from: A, reason: collision with root package name */
    public v0 f3168A;

    /* renamed from: B, reason: collision with root package name */
    public v0 f3169B;

    /* renamed from: C, reason: collision with root package name */
    public InterfaceC0704d f3170C;

    /* renamed from: D, reason: collision with root package name */
    public OverScroller f3171D;

    /* renamed from: E, reason: collision with root package name */
    public ViewPropertyAnimator f3172E;

    /* renamed from: F, reason: collision with root package name */
    public final X f3173F;

    /* renamed from: G, reason: collision with root package name */
    public final RunnableC0702c f3174G;

    /* renamed from: H, reason: collision with root package name */
    public final RunnableC0702c f3175H;

    /* renamed from: I, reason: collision with root package name */
    public final C0123t f3176I;

    /* renamed from: d, reason: collision with root package name */
    public int f3177d;

    /* renamed from: e, reason: collision with root package name */
    public int f3178e;

    /* renamed from: i, reason: collision with root package name */
    public ContentFrameLayout f3179i;

    /* renamed from: l, reason: collision with root package name */
    public ActionBarContainer f3180l;

    /* renamed from: m, reason: collision with root package name */
    public InterfaceC0725n0 f3181m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f3182n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3183o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3184p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3185q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3186r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3187s;

    /* renamed from: t, reason: collision with root package name */
    public int f3188t;

    /* renamed from: u, reason: collision with root package name */
    public int f3189u;

    /* renamed from: v, reason: collision with root package name */
    public final Rect f3190v;

    /* renamed from: w, reason: collision with root package name */
    public final Rect f3191w;

    /* renamed from: x, reason: collision with root package name */
    public final Rect f3192x;

    /* renamed from: y, reason: collision with root package name */
    public v0 f3193y;

    /* renamed from: z, reason: collision with root package name */
    public v0 f3194z;

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3178e = 0;
        this.f3190v = new Rect();
        this.f3191w = new Rect();
        this.f3192x = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        v0 v0Var = v0.f1238b;
        this.f3193y = v0Var;
        this.f3194z = v0Var;
        this.f3168A = v0Var;
        this.f3169B = v0Var;
        this.f3173F = new X(this);
        this.f3174G = new RunnableC0702c(this, 0);
        this.f3175H = new RunnableC0702c(this, 1);
        c(context);
        this.f3176I = new C0123t();
    }

    public static boolean a(View view, Rect rect, boolean z7) {
        boolean z8;
        C0706e c0706e = (C0706e) view.getLayoutParams();
        int i2 = ((ViewGroup.MarginLayoutParams) c0706e).leftMargin;
        int i5 = rect.left;
        if (i2 != i5) {
            ((ViewGroup.MarginLayoutParams) c0706e).leftMargin = i5;
            z8 = true;
        } else {
            z8 = false;
        }
        int i7 = ((ViewGroup.MarginLayoutParams) c0706e).topMargin;
        int i8 = rect.top;
        if (i7 != i8) {
            ((ViewGroup.MarginLayoutParams) c0706e).topMargin = i8;
            z8 = true;
        }
        int i9 = ((ViewGroup.MarginLayoutParams) c0706e).rightMargin;
        int i10 = rect.right;
        if (i9 != i10) {
            ((ViewGroup.MarginLayoutParams) c0706e).rightMargin = i10;
            z8 = true;
        }
        if (z7) {
            int i11 = ((ViewGroup.MarginLayoutParams) c0706e).bottomMargin;
            int i12 = rect.bottom;
            if (i11 != i12) {
                ((ViewGroup.MarginLayoutParams) c0706e).bottomMargin = i12;
                return true;
            }
        }
        return z8;
    }

    public final void b() {
        removeCallbacks(this.f3174G);
        removeCallbacks(this.f3175H);
        ViewPropertyAnimator viewPropertyAnimator = this.f3172E;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void c(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f3167J);
        this.f3177d = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f3182n = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f3183o = context.getApplicationInfo().targetSdkVersion < 19;
        this.f3171D = new OverScroller(context);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0706e;
    }

    public final void d(int i2) {
        e();
        if (i2 == 2) {
            ((s1) this.f3181m).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i2 == 5) {
            ((s1) this.f3181m).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i2 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i2;
        super.draw(canvas);
        if (this.f3182n == null || this.f3183o) {
            return;
        }
        if (this.f3180l.getVisibility() == 0) {
            i2 = (int) (this.f3180l.getTranslationY() + this.f3180l.getBottom() + 0.5f);
        } else {
            i2 = 0;
        }
        this.f3182n.setBounds(0, i2, getWidth(), this.f3182n.getIntrinsicHeight() + i2);
        this.f3182n.draw(canvas);
    }

    public final void e() {
        InterfaceC0725n0 wrapper;
        if (this.f3179i == null) {
            this.f3179i = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f3180l = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof InterfaceC0725n0) {
                wrapper = (InterfaceC0725n0) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f3181m = wrapper;
        }
    }

    public final void f(Menu menu, y yVar) {
        e();
        s1 s1Var = (s1) this.f3181m;
        Toolbar toolbar = s1Var.f6886a;
        if (s1Var.f6897m == null) {
            s1Var.f6897m = new C0716j(toolbar.getContext());
        }
        C0716j c0716j = s1Var.f6897m;
        c0716j.f6802m = yVar;
        m mVar = (m) menu;
        if (mVar == null && toolbar.f3332d == null) {
            return;
        }
        toolbar.f();
        m mVar2 = toolbar.f3332d.f3204x;
        if (mVar2 == mVar) {
            return;
        }
        if (mVar2 != null) {
            mVar2.r(toolbar.f3325T);
            mVar2.r(toolbar.f3326U);
        }
        if (toolbar.f3326U == null) {
            toolbar.f3326U = new n1(toolbar);
        }
        c0716j.f6814y = true;
        if (mVar != null) {
            mVar.b(c0716j, toolbar.f3343r);
            mVar.b(toolbar.f3326U, toolbar.f3343r);
        } else {
            c0716j.g(toolbar.f3343r, null);
            toolbar.f3326U.g(toolbar.f3343r, null);
            c0716j.d();
            toolbar.f3326U.d();
        }
        toolbar.f3332d.setPopupTheme(toolbar.f3344s);
        toolbar.f3332d.setPresenter(c0716j);
        toolbar.f3325T = c0716j;
        toolbar.v();
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0706e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0706e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f3180l;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0123t c0123t = this.f3176I;
        return c0123t.f1237b | c0123t.f1236a;
    }

    public CharSequence getTitle() {
        e();
        return ((s1) this.f3181m).f6886a.getTitle();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        e();
        v0 c7 = v0.c(windowInsets, this);
        r0 r0Var = c7.f1239a;
        boolean a7 = a(this.f3180l, new Rect(r0Var.k().f147a, r0Var.k().f148b, r0Var.k().f149c, r0Var.k().f150d), false);
        WeakHashMap weakHashMap = T.f1153a;
        Rect rect = this.f3190v;
        K.b(this, c7, rect);
        v0 o7 = r0Var.o(rect.left, rect.top, rect.right, rect.bottom);
        this.f3193y = o7;
        boolean z7 = true;
        if (!this.f3194z.equals(o7)) {
            this.f3194z = this.f3193y;
            a7 = true;
        }
        Rect rect2 = this.f3191w;
        if (rect2.equals(rect)) {
            z7 = a7;
        } else {
            rect2.set(rect);
        }
        if (z7) {
            requestLayout();
        }
        return r0Var.a().f1239a.c().f1239a.b().b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c(getContext());
        WeakHashMap weakHashMap = T.f1153a;
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i2, int i5, int i7, int i8) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                C0706e c0706e = (C0706e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i10 = ((ViewGroup.MarginLayoutParams) c0706e).leftMargin + paddingLeft;
                int i11 = ((ViewGroup.MarginLayoutParams) c0706e).topMargin + paddingTop;
                childAt.layout(i10, i11, measuredWidth + i10, measuredHeight + i11);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i5) {
        int measuredHeight;
        e();
        measureChildWithMargins(this.f3180l, i2, 0, i5, 0);
        C0706e c0706e = (C0706e) this.f3180l.getLayoutParams();
        int max = Math.max(0, this.f3180l.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0706e).leftMargin + ((ViewGroup.MarginLayoutParams) c0706e).rightMargin);
        int max2 = Math.max(0, this.f3180l.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0706e).topMargin + ((ViewGroup.MarginLayoutParams) c0706e).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f3180l.getMeasuredState());
        WeakHashMap weakHashMap = T.f1153a;
        boolean z7 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z7) {
            measuredHeight = this.f3177d;
            if (this.f3185q && this.f3180l.getTabContainer() != null) {
                measuredHeight += this.f3177d;
            }
        } else {
            measuredHeight = this.f3180l.getVisibility() != 8 ? this.f3180l.getMeasuredHeight() : 0;
        }
        Rect rect = this.f3190v;
        Rect rect2 = this.f3192x;
        rect2.set(rect);
        v0 v0Var = this.f3193y;
        this.f3168A = v0Var;
        if (this.f3184p || z7) {
            B.c a7 = B.c.a(v0Var.f1239a.k().f147a, this.f3168A.f1239a.k().f148b + measuredHeight, this.f3168A.f1239a.k().f149c, this.f3168A.f1239a.k().f150d);
            v0 v0Var2 = this.f3168A;
            int i7 = Build.VERSION.SDK_INT;
            h0 g0Var = i7 >= 36 ? new g0(v0Var2) : i7 >= 35 ? new f0(v0Var2) : i7 >= 34 ? new e0(v0Var2) : i7 >= 31 ? new d0(v0Var2) : i7 >= 30 ? new c0(v0Var2) : i7 >= 29 ? new b0(v0Var2) : new a0(v0Var2);
            g0Var.e(a7);
            this.f3168A = g0Var.b();
        } else {
            rect2.top += measuredHeight;
            rect2.bottom = rect2.bottom;
            this.f3168A = v0Var.f1239a.o(0, measuredHeight, 0, 0);
        }
        a(this.f3179i, rect2, true);
        if (!this.f3169B.equals(this.f3168A)) {
            v0 v0Var3 = this.f3168A;
            this.f3169B = v0Var3;
            T.b(this.f3179i, v0Var3);
        }
        measureChildWithMargins(this.f3179i, i2, 0, i5, 0);
        C0706e c0706e2 = (C0706e) this.f3179i.getLayoutParams();
        int max3 = Math.max(max, this.f3179i.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0706e2).leftMargin + ((ViewGroup.MarginLayoutParams) c0706e2).rightMargin);
        int max4 = Math.max(max2, this.f3179i.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0706e2).topMargin + ((ViewGroup.MarginLayoutParams) c0706e2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f3179i.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i2, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i5, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f7, float f8, boolean z7) {
        if (!this.f3186r || !z7) {
            return false;
        }
        this.f3171D.fling(0, 0, 0, (int) f8, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f3171D.getFinalY() > this.f3180l.getHeight()) {
            b();
            this.f3175H.run();
        } else {
            b();
            this.f3174G.run();
        }
        this.f3187s = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f7, float f8) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i2, int i5, int[] iArr) {
    }

    @Override // I.InterfaceC0122s
    public final void onNestedScroll(View view, int i2, int i5, int i7, int i8, int i9, int[] iArr) {
        onNestedScroll(view, i2, i5, i7, i8, i9);
    }

    @Override // I.r
    public final void onNestedScrollAccepted(View view, View view2, int i2, int i5) {
        if (i5 == 0) {
            onNestedScrollAccepted(view, view2, i2);
        }
    }

    @Override // I.r
    public final boolean onStartNestedScroll(View view, View view2, int i2, int i5) {
        return i5 == 0 && onStartNestedScroll(view, view2, i2);
    }

    @Override // I.r
    public final void onStopNestedScroll(View view, int i2) {
        if (i2 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i2) {
        super.onWindowSystemUiVisibilityChanged(i2);
        e();
        int i5 = this.f3189u ^ i2;
        this.f3189u = i2;
        boolean z7 = (i2 & 4) == 0;
        boolean z8 = (i2 & 256) != 0;
        InterfaceC0704d interfaceC0704d = this.f3170C;
        if (interfaceC0704d != null) {
            C0513O c0513o = (C0513O) interfaceC0704d;
            c0513o.f5402o = !z8;
            if (z7 || !z8) {
                if (c0513o.f5404q) {
                    c0513o.f5404q = false;
                    c0513o.y(true);
                }
            } else if (!c0513o.f5404q) {
                c0513o.f5404q = true;
                c0513o.y(true);
            }
        }
        if ((i5 & 256) == 0 || this.f3170C == null) {
            return;
        }
        WeakHashMap weakHashMap = T.f1153a;
        requestApplyInsets();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        this.f3178e = i2;
        InterfaceC0704d interfaceC0704d = this.f3170C;
        if (interfaceC0704d != null) {
            ((C0513O) interfaceC0704d).f5401n = i2;
        }
    }

    public void setActionBarHideOffset(int i2) {
        b();
        this.f3180l.setTranslationY(-Math.max(0, Math.min(i2, this.f3180l.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0704d interfaceC0704d) {
        this.f3170C = interfaceC0704d;
        if (getWindowToken() != null) {
            ((C0513O) this.f3170C).f5401n = this.f3178e;
            int i2 = this.f3189u;
            if (i2 != 0) {
                onWindowSystemUiVisibilityChanged(i2);
                WeakHashMap weakHashMap = T.f1153a;
                requestApplyInsets();
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z7) {
        this.f3185q = z7;
    }

    public void setHideOnContentScrollEnabled(boolean z7) {
        if (z7 != this.f3186r) {
            this.f3186r = z7;
            if (z7) {
                return;
            }
            b();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i2) {
        e();
        s1 s1Var = (s1) this.f3181m;
        s1Var.f6889d = i2 != 0 ? g.M(s1Var.f6886a.getContext(), i2) : null;
        s1Var.c();
    }

    public void setLogo(int i2) {
        e();
        s1 s1Var = (s1) this.f3181m;
        s1Var.f6890e = i2 != 0 ? g.M(s1Var.f6886a.getContext(), i2) : null;
        s1Var.c();
    }

    public void setOverlayMode(boolean z7) {
        this.f3184p = z7;
        this.f3183o = z7 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z7) {
    }

    public void setUiOptions(int i2) {
    }

    @Override // n.InterfaceC0723m0
    public void setWindowCallback(Window.Callback callback) {
        e();
        ((s1) this.f3181m).f6895k = callback;
    }

    @Override // n.InterfaceC0723m0
    public void setWindowTitle(CharSequence charSequence) {
        e();
        s1 s1Var = (s1) this.f3181m;
        if (s1Var.f6892g) {
            return;
        }
        Toolbar toolbar = s1Var.f6886a;
        s1Var.f6893h = charSequence;
        if ((s1Var.f6887b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (s1Var.f6892g) {
                T.j(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // I.r
    public final void onNestedPreScroll(View view, int i2, int i5, int[] iArr, int i7) {
    }

    @Override // I.r
    public final void onNestedScroll(View view, int i2, int i5, int i7, int i8, int i9) {
        if (i9 == 0) {
            onNestedScroll(view, i2, i5, i7, i8);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        C0513O c0513o;
        C0573b c0573b;
        this.f3176I.f1236a = i2;
        this.f3188t = getActionBarHideOffset();
        b();
        InterfaceC0704d interfaceC0704d = this.f3170C;
        if (interfaceC0704d == null || (c0573b = (c0513o = (C0513O) interfaceC0704d).f5407t) == null) {
            return;
        }
        c0573b.a();
        c0513o.f5407t = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        if ((i2 & 2) == 0 || this.f3180l.getVisibility() != 0) {
            return false;
        }
        return this.f3186r;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f3186r || this.f3187s) {
            return;
        }
        if (this.f3188t <= this.f3180l.getHeight()) {
            b();
            postDelayed(this.f3174G, 600L);
        } else {
            b();
            postDelayed(this.f3175H, 600L);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0706e(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i2, int i5, int i7, int i8) {
        int i9 = this.f3188t + i5;
        this.f3188t = i9;
        setActionBarHideOffset(i9);
    }

    public void setIcon(Drawable drawable) {
        e();
        s1 s1Var = (s1) this.f3181m;
        s1Var.f6889d = drawable;
        s1Var.c();
    }
}
