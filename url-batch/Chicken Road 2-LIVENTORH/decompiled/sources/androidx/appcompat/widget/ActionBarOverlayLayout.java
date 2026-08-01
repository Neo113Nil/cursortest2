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
import com.oriondriftchasers.arordrft.R;
import f1.h0;
import g.m0;
import h.a;
import j.j;
import j1.k;
import java.util.WeakHashMap;
import k.x;
import l.c;
import l.d;
import l.d3;
import l.e;
import l.f;
import l.k1;
import l.l1;
import l.y2;
import n0.b0;
import n0.b1;
import n0.c1;
import n0.d0;
import n0.d1;
import n0.e1;
import n0.f1;
import n0.l;
import n0.l0;
import n0.m;
import n0.n1;
import n0.q1;
import n0.z0;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements k1, l, m {
    public static final int[] H = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public static final q1 I;
    public static final Rect J;
    public OverScroller A;
    public ViewPropertyAnimator B;
    public final k C;
    public final c D;
    public final c E;
    public final h0 F;
    public final f G;

    /* renamed from: f, reason: collision with root package name */
    public int f178f;

    /* renamed from: g, reason: collision with root package name */
    public int f179g;

    /* renamed from: h, reason: collision with root package name */
    public ContentFrameLayout f180h;
    public ActionBarContainer i;

    /* renamed from: j, reason: collision with root package name */
    public l1 f181j;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f182k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f183l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f184m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f185n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f186o;

    /* renamed from: p, reason: collision with root package name */
    public int f187p;

    /* renamed from: q, reason: collision with root package name */
    public int f188q;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f189r;

    /* renamed from: s, reason: collision with root package name */
    public final Rect f190s;

    /* renamed from: t, reason: collision with root package name */
    public final Rect f191t;

    /* renamed from: u, reason: collision with root package name */
    public final Rect f192u;

    /* renamed from: v, reason: collision with root package name */
    public q1 f193v;

    /* renamed from: w, reason: collision with root package name */
    public q1 f194w;

    /* renamed from: x, reason: collision with root package name */
    public q1 f195x;

    /* renamed from: y, reason: collision with root package name */
    public q1 f196y;

    /* renamed from: z, reason: collision with root package name */
    public d f197z;

    static {
        int i = Build.VERSION.SDK_INT;
        f1 e1Var = i >= 34 ? new e1() : i >= 31 ? new d1() : i >= 30 ? new c1() : i >= 29 ? new b1() : new z0();
        e1Var.g(f0.c.c(0, 1, 0, 1));
        I = e1Var.b();
        J = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f179g = 0;
        this.f189r = new Rect();
        this.f190s = new Rect();
        this.f191t = new Rect();
        this.f192u = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        q1 q1Var = q1.f2774b;
        this.f193v = q1Var;
        this.f194w = q1Var;
        this.f195x = q1Var;
        this.f196y = q1Var;
        this.C = new k(2, this);
        this.D = new c(this, 0);
        this.E = new c(this, 1);
        i(context);
        this.F = new h0();
        f fVar = new f(context);
        fVar.setWillNotDraw(true);
        this.G = fVar;
        addView(fVar);
    }

    public static boolean g(View view, Rect rect, boolean z3) {
        boolean z4;
        e eVar = (e) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
        int i4 = rect.left;
        if (i != i4) {
            ((ViewGroup.MarginLayoutParams) eVar).leftMargin = i4;
            z4 = true;
        } else {
            z4 = false;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        int i6 = rect.top;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) eVar).topMargin = i6;
            z4 = true;
        }
        int i7 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
        int i8 = rect.right;
        if (i7 != i8) {
            ((ViewGroup.MarginLayoutParams) eVar).rightMargin = i8;
            z4 = true;
        }
        if (z3) {
            int i9 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            int i10 = rect.bottom;
            if (i9 != i10) {
                ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = i10;
                return true;
            }
        }
        return z4;
    }

    @Override // n0.l
    public final void a(View view, View view2, int i, int i4) {
        if (i4 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // n0.l
    public final void b(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // n0.m
    public final void d(View view, int i, int i4, int i5, int i6, int i7, int[] iArr) {
        e(view, i, i4, i5, i6, i7);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f182k != null) {
            if (this.i.getVisibility() == 0) {
                i = (int) (this.i.getTranslationY() + this.i.getBottom() + 0.5f);
            } else {
                i = 0;
            }
            this.f182k.setBounds(0, i, getWidth(), this.f182k.getIntrinsicHeight() + i);
            this.f182k.draw(canvas);
        }
    }

    @Override // n0.l
    public final void e(View view, int i, int i4, int i5, int i6, int i7) {
        if (i7 == 0) {
            onNestedScroll(view, i, i4, i5, i6);
        }
    }

    @Override // n0.l
    public final boolean f(View view, View view2, int i, int i4) {
        return i4 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
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
        h0 h0Var = this.F;
        return h0Var.f1365b | h0Var.f1364a;
    }

    public CharSequence getTitle() {
        k();
        return ((d3) this.f181j).f2269a.getTitle();
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
        this.f178f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f182k = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.A = new OverScroller(context);
    }

    public final void j(int i) {
        k();
        if (i == 2) {
            ((d3) this.f181j).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((d3) this.f181j).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        l1 wrapper;
        if (this.f180h == null) {
            this.f180h = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.i = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof l1) {
                wrapper = (l1) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f181j = wrapper;
        }
    }

    public final void l(Menu menu, x xVar) {
        k();
        d3 d3Var = (d3) this.f181j;
        Toolbar toolbar = d3Var.f2269a;
        if (d3Var.f2279m == null) {
            l.l lVar = new l.l(toolbar.getContext());
            d3Var.f2279m = lVar;
            lVar.f2366n = R.id.action_menu_presenter;
        }
        l.l lVar2 = d3Var.f2279m;
        lVar2.f2362j = xVar;
        k.m mVar = (k.m) menu;
        if (mVar == null && toolbar.f218f == null) {
            return;
        }
        toolbar.f();
        k.m mVar2 = toolbar.f218f.f198u;
        if (mVar2 == mVar) {
            return;
        }
        if (mVar2 != null) {
            mVar2.r(toolbar.P);
            mVar2.r(toolbar.Q);
        }
        if (toolbar.Q == null) {
            toolbar.Q = new y2(toolbar);
        }
        lVar2.f2375w = true;
        if (mVar != null) {
            mVar.b(lVar2, toolbar.f226o);
            mVar.b(toolbar.Q, toolbar.f226o);
        } else {
            lVar2.g(toolbar.f226o, null);
            toolbar.Q.g(toolbar.f226o, null);
            lVar2.m(true);
            toolbar.Q.m(true);
        }
        toolbar.f218f.setPopupTheme(toolbar.f227p);
        toolbar.f218f.setPresenter(lVar2);
        toolbar.P = lVar2;
        toolbar.t();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        q1 g4 = q1.g(this, windowInsets);
        boolean g5 = g(this.i, new Rect(g4.b(), g4.d(), g4.c(), g4.a()), false);
        WeakHashMap weakHashMap = l0.f2757a;
        Rect rect = this.f189r;
        d0.b(this, g4, rect);
        int i = rect.left;
        int i4 = rect.top;
        int i5 = rect.right;
        int i6 = rect.bottom;
        n1 n1Var = g4.f2775a;
        q1 m4 = n1Var.m(i, i4, i5, i6);
        this.f193v = m4;
        boolean z3 = true;
        if (!this.f194w.equals(m4)) {
            this.f194w = this.f193v;
            g5 = true;
        }
        Rect rect2 = this.f190s;
        if (rect2.equals(rect)) {
            z3 = g5;
        } else {
            rect2.set(rect);
        }
        if (z3) {
            requestLayout();
        }
        return n1Var.a().f2775a.c().f2775a.b().f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = l0.f2757a;
        b0.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i4, int i5, int i6) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i8 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i9 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i8, i9, measuredWidth + i8, measuredHeight + i9);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0110  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i4) {
        int measuredHeight;
        k();
        measureChildWithMargins(this.i, i, 0, i4, 0);
        e eVar = (e) this.i.getLayoutParams();
        int max = Math.max(0, this.i.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int max2 = Math.max(0, this.i.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.i.getMeasuredState());
        WeakHashMap weakHashMap = l0.f2757a;
        boolean z3 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z3) {
            measuredHeight = this.f178f;
            if (this.f184m && this.i.getTabContainer() != null) {
                measuredHeight += this.f178f;
            }
        } else {
            measuredHeight = this.i.getVisibility() != 8 ? this.i.getMeasuredHeight() : 0;
        }
        Rect rect = this.f189r;
        Rect rect2 = this.f191t;
        rect2.set(rect);
        this.f195x = this.f193v;
        if (!this.f183l && !z3) {
            f fVar = this.G;
            q1 q1Var = I;
            Rect rect3 = this.f192u;
            d0.b(fVar, q1Var, rect3);
            if (!rect3.equals(J)) {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.f195x = this.f195x.f2775a.m(0, measuredHeight, 0, 0);
                g(this.f180h, rect2, true);
                if (!this.f196y.equals(this.f195x)) {
                    q1 q1Var2 = this.f195x;
                    this.f196y = q1Var2;
                    l0.b(this.f180h, q1Var2);
                }
                measureChildWithMargins(this.f180h, i, 0, i4, 0);
                e eVar2 = (e) this.f180h.getLayoutParams();
                int max3 = Math.max(max, this.f180h.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
                int max4 = Math.max(max2, this.f180h.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
                int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f180h.getMeasuredState());
                setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i4, combineMeasuredStates2 << 16));
            }
        }
        f0.c c4 = f0.c.c(this.f195x.b(), this.f195x.d() + measuredHeight, this.f195x.c(), this.f195x.a());
        q1 q1Var3 = this.f195x;
        int i5 = Build.VERSION.SDK_INT;
        f1 e1Var = i5 >= 34 ? new e1(q1Var3) : i5 >= 31 ? new d1(q1Var3) : i5 >= 30 ? new c1(q1Var3) : i5 >= 29 ? new b1(q1Var3) : new z0(q1Var3);
        e1Var.g(c4);
        this.f195x = e1Var.b();
        g(this.f180h, rect2, true);
        if (!this.f196y.equals(this.f195x)) {
        }
        measureChildWithMargins(this.f180h, i, 0, i4, 0);
        e eVar22 = (e) this.f180h.getLayoutParams();
        int max32 = Math.max(max, this.f180h.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar22).leftMargin + ((ViewGroup.MarginLayoutParams) eVar22).rightMargin);
        int max42 = Math.max(max2, this.f180h.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar22).topMargin + ((ViewGroup.MarginLayoutParams) eVar22).bottomMargin);
        int combineMeasuredStates22 = View.combineMeasuredStates(combineMeasuredStates, this.f180h.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max32, getSuggestedMinimumWidth()), i, combineMeasuredStates22), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max42, getSuggestedMinimumHeight()), i4, combineMeasuredStates22 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f4, boolean z3) {
        if (!this.f185n || !z3) {
            return false;
        }
        this.A.fling(0, 0, 0, (int) f4, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.A.getFinalY() > this.i.getHeight()) {
            h();
            this.E.run();
        } else {
            h();
            this.D.run();
        }
        this.f186o = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f4) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i4, int i5, int i6) {
        int i7 = this.f187p + i4;
        this.f187p = i7;
        setActionBarHideOffset(i7);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        m0 m0Var;
        j jVar;
        this.F.f1364a = i;
        this.f187p = getActionBarHideOffset();
        h();
        d dVar = this.f197z;
        if (dVar == null || (jVar = (m0Var = (m0) dVar).F) == null) {
            return;
        }
        jVar.a();
        m0Var.F = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.i.getVisibility() != 0) {
            return false;
        }
        return this.f185n;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f185n || this.f186o) {
            return;
        }
        if (this.f187p <= this.i.getHeight()) {
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
        int i4 = this.f188q ^ i;
        this.f188q = i;
        boolean z3 = (i & 4) == 0;
        boolean z4 = (i & 256) != 0;
        d dVar = this.f197z;
        if (dVar != null) {
            m0 m0Var = (m0) dVar;
            m0Var.B = !z4;
            if (z3 || !z4) {
                if (m0Var.C) {
                    m0Var.C = false;
                    m0Var.b0(true);
                }
            } else if (!m0Var.C) {
                m0Var.C = true;
                m0Var.b0(true);
            }
        }
        if ((i4 & 256) == 0 || this.f197z == null) {
            return;
        }
        WeakHashMap weakHashMap = l0.f2757a;
        b0.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f179g = i;
        d dVar = this.f197z;
        if (dVar != null) {
            ((m0) dVar).A = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        h();
        this.i.setTranslationY(-Math.max(0, Math.min(i, this.i.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.f197z = dVar;
        if (getWindowToken() != null) {
            ((m0) this.f197z).A = this.f179g;
            int i = this.f188q;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = l0.f2757a;
                b0.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z3) {
        this.f184m = z3;
    }

    public void setHideOnContentScrollEnabled(boolean z3) {
        if (z3 != this.f185n) {
            this.f185n = z3;
            if (z3) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        k();
        d3 d3Var = (d3) this.f181j;
        d3Var.d = i != 0 ? a.x(d3Var.f2269a.getContext(), i) : null;
        d3Var.c();
    }

    public void setLogo(int i) {
        k();
        d3 d3Var = (d3) this.f181j;
        d3Var.f2272e = i != 0 ? a.x(d3Var.f2269a.getContext(), i) : null;
        d3Var.c();
    }

    public void setOverlayMode(boolean z3) {
        this.f183l = z3;
    }

    @Override // l.k1
    public void setWindowCallback(Window.Callback callback) {
        k();
        ((d3) this.f181j).f2277k = callback;
    }

    @Override // l.k1
    public void setWindowTitle(CharSequence charSequence) {
        k();
        d3 d3Var = (d3) this.f181j;
        if (d3Var.f2274g) {
            return;
        }
        Toolbar toolbar = d3Var.f2269a;
        d3Var.f2275h = charSequence;
        if ((d3Var.f2270b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (d3Var.f2274g) {
                l0.n(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        d3 d3Var = (d3) this.f181j;
        d3Var.d = drawable;
        d3Var.c();
    }

    public void setShowingForActionMode(boolean z3) {
    }

    public void setUiOptions(int i) {
    }

    @Override // n0.l
    public final void c(View view, int i, int i4, int[] iArr, int i5) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i4, int[] iArr) {
    }
}
