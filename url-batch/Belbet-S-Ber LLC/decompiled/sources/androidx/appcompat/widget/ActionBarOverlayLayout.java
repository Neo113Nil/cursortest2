package androidx.appcompat.widget;

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
import com.gdmhkmf.belbet.R;
import g.k0;
import g1.v0;
import g2.e;
import java.util.WeakHashMap;
import k.m;
import k.x;
import l.a3;
import l.b;
import l.c;
import l.d;
import l.h1;
import l.i1;
import l.j;
import l.v2;
import n0.c1;
import n0.d1;
import n0.e1;
import n0.f1;
import n0.g1;
import n0.h0;
import n0.j1;
import n0.n;
import n0.o;
import n0.p0;
import n0.s1;
import n0.v1;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements h1, n, o {
    public static final int[] H = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public static final v1 I;
    public static final Rect J;
    public OverScroller A;
    public ViewPropertyAnimator B;
    public final e C;
    public final b D;
    public final b E;
    public final v0 F;
    public final l.e G;

    /* renamed from: f, reason: collision with root package name */
    public int f308f;

    /* renamed from: g, reason: collision with root package name */
    public int f309g;
    public ContentFrameLayout h;
    public ActionBarContainer i;

    /* renamed from: j, reason: collision with root package name */
    public i1 f310j;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f311k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f312l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f313m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f314n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f315o;

    /* renamed from: p, reason: collision with root package name */
    public int f316p;

    /* renamed from: q, reason: collision with root package name */
    public int f317q;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f318r;

    /* renamed from: s, reason: collision with root package name */
    public final Rect f319s;

    /* renamed from: t, reason: collision with root package name */
    public final Rect f320t;

    /* renamed from: u, reason: collision with root package name */
    public final Rect f321u;

    /* renamed from: v, reason: collision with root package name */
    public v1 f322v;

    /* renamed from: w, reason: collision with root package name */
    public v1 f323w;

    /* renamed from: x, reason: collision with root package name */
    public v1 f324x;

    /* renamed from: y, reason: collision with root package name */
    public v1 f325y;

    /* renamed from: z, reason: collision with root package name */
    public c f326z;

    static {
        int i = Build.VERSION.SDK_INT;
        j1 i1Var = i >= 36 ? new n0.i1() : i >= 35 ? new n0.h1() : i >= 34 ? new g1() : i >= 31 ? new f1() : i >= 30 ? new e1() : i >= 29 ? new d1() : new c1();
        i1Var.h(f0.c.c(0, 1, 0, 1));
        I = i1Var.b();
        J = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f309g = 0;
        this.f318r = new Rect();
        this.f319s = new Rect();
        this.f320t = new Rect();
        this.f321u = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        v1 v1Var = v1.f2841b;
        this.f322v = v1Var;
        this.f323w = v1Var;
        this.f324x = v1Var;
        this.f325y = v1Var;
        this.C = new e(3, this);
        this.D = new b(this, 0);
        this.E = new b(this, 1);
        i(context);
        this.F = new v0();
        l.e eVar = new l.e(context);
        eVar.setWillNotDraw(true);
        this.G = eVar;
        addView(eVar);
    }

    public static boolean g(View view, Rect rect, boolean z4) {
        boolean z5;
        d dVar = (d) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) dVar).leftMargin;
        int i4 = rect.left;
        if (i != i4) {
            ((ViewGroup.MarginLayoutParams) dVar).leftMargin = i4;
            z5 = true;
        } else {
            z5 = false;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) dVar).topMargin;
        int i6 = rect.top;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) dVar).topMargin = i6;
            z5 = true;
        }
        int i7 = ((ViewGroup.MarginLayoutParams) dVar).rightMargin;
        int i8 = rect.right;
        if (i7 != i8) {
            ((ViewGroup.MarginLayoutParams) dVar).rightMargin = i8;
            z5 = true;
        }
        if (z4) {
            int i9 = ((ViewGroup.MarginLayoutParams) dVar).bottomMargin;
            int i10 = rect.bottom;
            if (i9 != i10) {
                ((ViewGroup.MarginLayoutParams) dVar).bottomMargin = i10;
                return true;
            }
        }
        return z5;
    }

    @Override // n0.n
    public final void a(View view, View view2, int i, int i4) {
        if (i4 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // n0.n
    public final void b(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d;
    }

    @Override // n0.o
    public final void d(View view, int i, int i4, int i5, int i6, int i7, int[] iArr) {
        e(view, i, i4, i5, i6, i7);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f311k != null) {
            if (this.i.getVisibility() == 0) {
                i = (int) (this.i.getTranslationY() + this.i.getBottom() + 0.5f);
            } else {
                i = 0;
            }
            this.f311k.setBounds(0, i, getWidth(), this.f311k.getIntrinsicHeight() + i);
            this.f311k.draw(canvas);
        }
    }

    @Override // n0.n
    public final void e(View view, int i, int i4, int i5, int i6, int i7) {
        if (i7 == 0) {
            onNestedScroll(view, i, i4, i5, i6);
        }
    }

    @Override // n0.n
    public final boolean f(View view, View view2, int i, int i4) {
        return i4 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new d(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.i;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        v0 v0Var = this.F;
        return v0Var.f1809b | v0Var.f1808a;
    }

    public CharSequence getTitle() {
        k();
        return ((a3) this.f310j).f2391a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.D);
        removeCallbacks(this.E);
        ViewPropertyAnimator viewPropertyAnimator = this.B;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(H);
        this.f308f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f311k = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.A = new OverScroller(context);
    }

    public final void j(int i) {
        k();
        if (i == 2) {
            ((a3) this.f310j).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((a3) this.f310j).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        i1 wrapper;
        if (this.h == null) {
            this.h = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.i = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof i1) {
                wrapper = (i1) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f310j = wrapper;
        }
    }

    public final void l(Menu menu, x xVar) {
        k();
        a3 a3Var = (a3) this.f310j;
        Toolbar toolbar = a3Var.f2391a;
        if (a3Var.f2400m == null) {
            a3Var.f2400m = new j(toolbar.getContext());
        }
        j jVar = a3Var.f2400m;
        jVar.f2464j = xVar;
        m mVar = (m) menu;
        if (mVar == null && toolbar.f345f == null) {
            return;
        }
        toolbar.f();
        m mVar2 = toolbar.f345f.f327u;
        if (mVar2 == mVar) {
            return;
        }
        if (mVar2 != null) {
            mVar2.r(toolbar.P);
            mVar2.r(toolbar.Q);
        }
        if (toolbar.Q == null) {
            toolbar.Q = new v2(toolbar);
        }
        jVar.f2476v = true;
        if (mVar != null) {
            mVar.b(jVar, toolbar.f352o);
            mVar.b(toolbar.Q, toolbar.f352o);
        } else {
            jVar.j(toolbar.f352o, null);
            toolbar.Q.j(toolbar.f352o, null);
            jVar.g();
            toolbar.Q.g();
        }
        toolbar.f345f.setPopupTheme(toolbar.f353p);
        toolbar.f345f.setPresenter(jVar);
        toolbar.P = jVar;
        toolbar.t();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        v1 g3 = v1.g(this, windowInsets);
        boolean g5 = g(this.i, new Rect(g3.b(), g3.d(), g3.c(), g3.a()), false);
        WeakHashMap weakHashMap = p0.f2816a;
        Rect rect = this.f318r;
        h0.b(this, g3, rect);
        int i = rect.left;
        int i4 = rect.top;
        int i5 = rect.right;
        int i6 = rect.bottom;
        s1 s1Var = g3.f2842a;
        v1 q4 = s1Var.q(i, i4, i5, i6);
        this.f322v = q4;
        boolean z4 = true;
        if (!this.f323w.equals(q4)) {
            this.f323w = this.f322v;
            g5 = true;
        }
        Rect rect2 = this.f319s;
        if (rect2.equals(rect)) {
            z4 = g5;
        } else {
            rect2.set(rect);
        }
        if (z4) {
            requestLayout();
        }
        return s1Var.a().f2842a.c().f2842a.b().f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = p0.f2816a;
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i, int i4, int i5, int i6) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i8 = ((ViewGroup.MarginLayoutParams) dVar).leftMargin + paddingLeft;
                int i9 = ((ViewGroup.MarginLayoutParams) dVar).topMargin + paddingTop;
                childAt.layout(i8, i9, measuredWidth + i8, measuredHeight + i9);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0125  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i4) {
        int measuredHeight;
        k();
        measureChildWithMargins(this.i, i, 0, i4, 0);
        d dVar = (d) this.i.getLayoutParams();
        int max = Math.max(0, this.i.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) dVar).leftMargin + ((ViewGroup.MarginLayoutParams) dVar).rightMargin);
        int max2 = Math.max(0, this.i.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) dVar).topMargin + ((ViewGroup.MarginLayoutParams) dVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.i.getMeasuredState());
        WeakHashMap weakHashMap = p0.f2816a;
        boolean z4 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z4) {
            measuredHeight = this.f308f;
            if (this.f313m && this.i.getTabContainer() != null) {
                measuredHeight += this.f308f;
            }
        } else {
            measuredHeight = this.i.getVisibility() != 8 ? this.i.getMeasuredHeight() : 0;
        }
        Rect rect = this.f318r;
        Rect rect2 = this.f320t;
        rect2.set(rect);
        this.f324x = this.f322v;
        if (!this.f312l && !z4) {
            l.e eVar = this.G;
            v1 v1Var = I;
            Rect rect3 = this.f321u;
            h0.b(eVar, v1Var, rect3);
            if (!rect3.equals(J)) {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.f324x = this.f324x.f2842a.q(0, measuredHeight, 0, 0);
                g(this.h, rect2, true);
                if (!this.f325y.equals(this.f324x)) {
                    v1 v1Var2 = this.f324x;
                    this.f325y = v1Var2;
                    p0.b(this.h, v1Var2);
                }
                measureChildWithMargins(this.h, i, 0, i4, 0);
                d dVar2 = (d) this.h.getLayoutParams();
                int max3 = Math.max(max, this.h.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) dVar2).leftMargin + ((ViewGroup.MarginLayoutParams) dVar2).rightMargin);
                int max4 = Math.max(max2, this.h.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) dVar2).topMargin + ((ViewGroup.MarginLayoutParams) dVar2).bottomMargin);
                int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.h.getMeasuredState());
                setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i4, combineMeasuredStates2 << 16));
            }
        }
        f0.c c5 = f0.c.c(this.f324x.b(), this.f324x.d() + measuredHeight, this.f324x.c(), this.f324x.a());
        v1 v1Var3 = this.f324x;
        int i5 = Build.VERSION.SDK_INT;
        j1 i1Var = i5 >= 36 ? new n0.i1(v1Var3) : i5 >= 35 ? new n0.h1(v1Var3) : i5 >= 34 ? new g1(v1Var3) : i5 >= 31 ? new f1(v1Var3) : i5 >= 30 ? new e1(v1Var3) : i5 >= 29 ? new d1(v1Var3) : new c1(v1Var3);
        i1Var.h(c5);
        this.f324x = i1Var.b();
        g(this.h, rect2, true);
        if (!this.f325y.equals(this.f324x)) {
        }
        measureChildWithMargins(this.h, i, 0, i4, 0);
        d dVar22 = (d) this.h.getLayoutParams();
        int max32 = Math.max(max, this.h.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) dVar22).leftMargin + ((ViewGroup.MarginLayoutParams) dVar22).rightMargin);
        int max42 = Math.max(max2, this.h.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) dVar22).topMargin + ((ViewGroup.MarginLayoutParams) dVar22).bottomMargin);
        int combineMeasuredStates22 = View.combineMeasuredStates(combineMeasuredStates, this.h.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max32, getSuggestedMinimumWidth()), i, combineMeasuredStates22), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max42, getSuggestedMinimumHeight()), i4, combineMeasuredStates22 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f5, float f6, boolean z4) {
        if (!this.f314n || !z4) {
            return false;
        }
        this.A.fling(0, 0, 0, (int) f6, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.A.getFinalY() > this.i.getHeight()) {
            h();
            this.E.run();
        } else {
            h();
            this.D.run();
        }
        this.f315o = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f5, float f6) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i4, int i5, int i6) {
        int i7 = this.f316p + i4;
        this.f316p = i7;
        setActionBarHideOffset(i7);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        k0 k0Var;
        j.j jVar;
        this.F.f1808a = i;
        this.f316p = getActionBarHideOffset();
        h();
        c cVar = this.f326z;
        if (cVar == null || (jVar = (k0Var = (k0) cVar).f1549t) == null) {
            return;
        }
        jVar.a();
        k0Var.f1549t = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.i.getVisibility() != 0) {
            return false;
        }
        return this.f314n;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f314n || this.f315o) {
            return;
        }
        if (this.f316p <= this.i.getHeight()) {
            h();
            postDelayed(this.D, 600L);
        } else {
            h();
            postDelayed(this.E, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        k();
        int i4 = this.f317q ^ i;
        this.f317q = i;
        boolean z4 = (i & 4) == 0;
        boolean z5 = (i & 256) != 0;
        c cVar = this.f326z;
        if (cVar != null) {
            k0 k0Var = (k0) cVar;
            k0Var.f1545p = !z5;
            if (z4 || !z5) {
                if (k0Var.f1546q) {
                    k0Var.f1546q = false;
                    k0Var.q0(true);
                }
            } else if (!k0Var.f1546q) {
                k0Var.f1546q = true;
                k0Var.q0(true);
            }
        }
        if ((i4 & 256) == 0 || this.f326z == null) {
            return;
        }
        WeakHashMap weakHashMap = p0.f2816a;
        requestApplyInsets();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f309g = i;
        c cVar = this.f326z;
        if (cVar != null) {
            ((k0) cVar).f1544o = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        h();
        this.i.setTranslationY(-Math.max(0, Math.min(i, this.i.getHeight())));
    }

    public void setActionBarVisibilityCallback(c cVar) {
        this.f326z = cVar;
        if (getWindowToken() != null) {
            ((k0) this.f326z).f1544o = this.f309g;
            int i = this.f317q;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = p0.f2816a;
                requestApplyInsets();
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z4) {
        this.f313m = z4;
    }

    public void setHideOnContentScrollEnabled(boolean z4) {
        if (z4 != this.f314n) {
            this.f314n = z4;
            if (z4) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        k();
        a3 a3Var = (a3) this.f310j;
        a3Var.d = i != 0 ? b4.d.y(a3Var.f2391a.getContext(), i) : null;
        a3Var.c();
    }

    public void setLogo(int i) {
        k();
        a3 a3Var = (a3) this.f310j;
        a3Var.f2394e = i != 0 ? b4.d.y(a3Var.f2391a.getContext(), i) : null;
        a3Var.c();
    }

    public void setOverlayMode(boolean z4) {
        this.f312l = z4;
    }

    @Override // l.h1
    public void setWindowCallback(Window.Callback callback) {
        k();
        ((a3) this.f310j).f2398k = callback;
    }

    @Override // l.h1
    public void setWindowTitle(CharSequence charSequence) {
        k();
        a3 a3Var = (a3) this.f310j;
        if (a3Var.f2396g) {
            return;
        }
        Toolbar toolbar = a3Var.f2391a;
        a3Var.h = charSequence;
        if ((a3Var.f2392b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (a3Var.f2396g) {
                p0.n(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new d(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        a3 a3Var = (a3) this.f310j;
        a3Var.d = drawable;
        a3Var.c();
    }

    public void setShowingForActionMode(boolean z4) {
    }

    public void setUiOptions(int i) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i4, int[] iArr) {
    }

    @Override // n0.n
    public final void c(View view, int i, int i4, int[] iArr, int i5) {
    }
}
