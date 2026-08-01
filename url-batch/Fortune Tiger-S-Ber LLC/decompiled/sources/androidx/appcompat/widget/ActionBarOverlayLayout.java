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
import b1.i0;
import com.gglhk.bofio.fortunetiger.R;
import f.l0;
import i.j;
import j.m;
import j.x;
import java.util.WeakHashMap;
import k.c;
import k.d;
import k.e;
import k.f;
import k.h1;
import k.i1;
import k.u2;
import k.z2;
import k0.a1;
import k0.b0;
import k0.b1;
import k0.j0;
import k0.k;
import k0.l;
import k0.m1;
import k0.x0;
import k0.y0;
import k0.z;
import k0.z0;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements h1, k, l {
    public static final int[] H = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public static final m1 I;
    public static final Rect J;
    public OverScroller A;
    public ViewPropertyAnimator B;
    public final f1.k C;
    public final c D;
    public final c E;
    public final i0 F;
    public final f G;

    /* renamed from: f, reason: collision with root package name */
    public int f200f;
    public int g;
    public ContentFrameLayout h;

    /* renamed from: i, reason: collision with root package name */
    public ActionBarContainer f201i;

    /* renamed from: j, reason: collision with root package name */
    public i1 f202j;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f203k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f204l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f205m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f206n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f207o;

    /* renamed from: p, reason: collision with root package name */
    public int f208p;

    /* renamed from: q, reason: collision with root package name */
    public int f209q;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f210r;

    /* renamed from: s, reason: collision with root package name */
    public final Rect f211s;

    /* renamed from: t, reason: collision with root package name */
    public final Rect f212t;

    /* renamed from: u, reason: collision with root package name */
    public final Rect f213u;

    /* renamed from: v, reason: collision with root package name */
    public m1 f214v;

    /* renamed from: w, reason: collision with root package name */
    public m1 f215w;

    /* renamed from: x, reason: collision with root package name */
    public m1 f216x;

    /* renamed from: y, reason: collision with root package name */
    public m1 f217y;

    /* renamed from: z, reason: collision with root package name */
    public d f218z;

    static {
        int i4 = Build.VERSION.SDK_INT;
        b1 a1Var = i4 >= 34 ? new a1() : i4 >= 30 ? new z0() : i4 >= 29 ? new y0() : new x0();
        a1Var.g(c0.c.c(0, 1, 0, 1));
        I = a1Var.b();
        J = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = 0;
        this.f210r = new Rect();
        this.f211s = new Rect();
        this.f212t = new Rect();
        this.f213u = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        m1 m1Var = m1.f2759b;
        this.f214v = m1Var;
        this.f215w = m1Var;
        this.f216x = m1Var;
        this.f217y = m1Var;
        this.C = new f1.k(3, this);
        this.D = new c(this, 0);
        this.E = new c(this, 1);
        i(context);
        this.F = new i0();
        f fVar = new f(context);
        fVar.setWillNotDraw(true);
        this.G = fVar;
        addView(fVar);
    }

    public static boolean g(View view, Rect rect, boolean z3) {
        boolean z4;
        e eVar = (e) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
        int i5 = rect.left;
        if (i4 != i5) {
            ((ViewGroup.MarginLayoutParams) eVar).leftMargin = i5;
            z4 = true;
        } else {
            z4 = false;
        }
        int i6 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        int i7 = rect.top;
        if (i6 != i7) {
            ((ViewGroup.MarginLayoutParams) eVar).topMargin = i7;
            z4 = true;
        }
        int i8 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
        int i9 = rect.right;
        if (i8 != i9) {
            ((ViewGroup.MarginLayoutParams) eVar).rightMargin = i9;
            z4 = true;
        }
        if (z3) {
            int i10 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            int i11 = rect.bottom;
            if (i10 != i11) {
                ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = i11;
                return true;
            }
        }
        return z4;
    }

    @Override // k0.k
    public final void a(View view, View view2, int i4, int i5) {
        if (i5 == 0) {
            onNestedScrollAccepted(view, view2, i4);
        }
    }

    @Override // k0.k
    public final void b(View view, int i4) {
        if (i4 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // k0.l
    public final void d(View view, int i4, int i5, int i6, int i7, int i8, int[] iArr) {
        e(view, i4, i5, i6, i7, i8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i4;
        super.draw(canvas);
        if (this.f203k != null) {
            if (this.f201i.getVisibility() == 0) {
                i4 = (int) (this.f201i.getTranslationY() + this.f201i.getBottom() + 0.5f);
            } else {
                i4 = 0;
            }
            this.f203k.setBounds(0, i4, getWidth(), this.f203k.getIntrinsicHeight() + i4);
            this.f203k.draw(canvas);
        }
    }

    @Override // k0.k
    public final void e(View view, int i4, int i5, int i6, int i7, int i8) {
        if (i8 == 0) {
            onNestedScroll(view, i4, i5, i6, i7);
        }
    }

    @Override // k0.k
    public final boolean f(View view, View view2, int i4, int i5) {
        return i5 == 0 && onStartNestedScroll(view, view2, i4);
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
        ActionBarContainer actionBarContainer = this.f201i;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        i0 i0Var = this.F;
        return i0Var.f802b | i0Var.f801a;
    }

    public CharSequence getTitle() {
        k();
        return ((z2) this.f202j).f2699a.getTitle();
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
        this.f200f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f203k = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.A = new OverScroller(context);
    }

    public final void j(int i4) {
        k();
        if (i4 == 2) {
            ((z2) this.f202j).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i4 == 5) {
            ((z2) this.f202j).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i4 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        i1 wrapper;
        if (this.h == null) {
            this.h = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f201i = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof i1) {
                wrapper = (i1) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f202j = wrapper;
        }
    }

    public final void l(Menu menu, x xVar) {
        k();
        z2 z2Var = (z2) this.f202j;
        Toolbar toolbar = z2Var.f2699a;
        if (z2Var.f2708m == null) {
            z2Var.f2708m = new k.k(toolbar.getContext());
        }
        k.k kVar = z2Var.f2708m;
        kVar.f2569j = xVar;
        m mVar = (m) menu;
        if (mVar == null && toolbar.f236f == null) {
            return;
        }
        toolbar.f();
        m mVar2 = toolbar.f236f.f219u;
        if (mVar2 == mVar) {
            return;
        }
        if (mVar2 != null) {
            mVar2.r(toolbar.P);
            mVar2.r(toolbar.Q);
        }
        if (toolbar.Q == null) {
            toolbar.Q = new u2(toolbar);
        }
        kVar.f2581v = true;
        if (mVar != null) {
            mVar.b(kVar, toolbar.f243o);
            mVar.b(toolbar.Q, toolbar.f243o);
        } else {
            kVar.g(toolbar.f243o, null);
            toolbar.Q.g(toolbar.f243o, null);
            kVar.e();
            toolbar.Q.e();
        }
        toolbar.f236f.setPopupTheme(toolbar.f244p);
        toolbar.f236f.setPresenter(kVar);
        toolbar.P = kVar;
        toolbar.t();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        m1 g = m1.g(this, windowInsets);
        boolean g4 = g(this.f201i, new Rect(g.b(), g.d(), g.c(), g.a()), false);
        WeakHashMap weakHashMap = j0.f2752a;
        Rect rect = this.f210r;
        b0.b(this, g, rect);
        int i4 = rect.left;
        int i5 = rect.top;
        int i6 = rect.right;
        int i7 = rect.bottom;
        k0.i1 i1Var = g.f2760a;
        m1 m4 = i1Var.m(i4, i5, i6, i7);
        this.f214v = m4;
        boolean z3 = true;
        if (!this.f215w.equals(m4)) {
            this.f215w = this.f214v;
            g4 = true;
        }
        Rect rect2 = this.f211s;
        if (rect2.equals(rect)) {
            z3 = g4;
        } else {
            rect2.set(rect);
        }
        if (z3) {
            requestLayout();
        }
        return i1Var.a().f2760a.c().f2760a.b().f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = j0.f2752a;
        z.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i9 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i10 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i9, i10, measuredWidth + i9, measuredHeight + i10);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0106  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i4, int i5) {
        int measuredHeight;
        k();
        measureChildWithMargins(this.f201i, i4, 0, i5, 0);
        e eVar = (e) this.f201i.getLayoutParams();
        int max = Math.max(0, this.f201i.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int max2 = Math.max(0, this.f201i.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f201i.getMeasuredState());
        WeakHashMap weakHashMap = j0.f2752a;
        boolean z3 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z3) {
            measuredHeight = this.f200f;
            if (this.f205m && this.f201i.getTabContainer() != null) {
                measuredHeight += this.f200f;
            }
        } else {
            measuredHeight = this.f201i.getVisibility() != 8 ? this.f201i.getMeasuredHeight() : 0;
        }
        Rect rect = this.f210r;
        Rect rect2 = this.f212t;
        rect2.set(rect);
        this.f216x = this.f214v;
        if (!this.f204l && !z3) {
            f fVar = this.G;
            m1 m1Var = I;
            Rect rect3 = this.f213u;
            b0.b(fVar, m1Var, rect3);
            if (!rect3.equals(J)) {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.f216x = this.f216x.f2760a.m(0, measuredHeight, 0, 0);
                g(this.h, rect2, true);
                if (!this.f217y.equals(this.f216x)) {
                    m1 m1Var2 = this.f216x;
                    this.f217y = m1Var2;
                    j0.b(this.h, m1Var2);
                }
                measureChildWithMargins(this.h, i4, 0, i5, 0);
                e eVar2 = (e) this.h.getLayoutParams();
                int max3 = Math.max(max, this.h.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
                int max4 = Math.max(max2, this.h.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
                int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.h.getMeasuredState());
                setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i4, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i5, combineMeasuredStates2 << 16));
            }
        }
        c0.c c = c0.c.c(this.f216x.b(), this.f216x.d() + measuredHeight, this.f216x.c(), this.f216x.a());
        m1 m1Var3 = this.f216x;
        int i6 = Build.VERSION.SDK_INT;
        b1 a1Var = i6 >= 34 ? new a1(m1Var3) : i6 >= 30 ? new z0(m1Var3) : i6 >= 29 ? new y0(m1Var3) : new x0(m1Var3);
        a1Var.g(c);
        this.f216x = a1Var.b();
        g(this.h, rect2, true);
        if (!this.f217y.equals(this.f216x)) {
        }
        measureChildWithMargins(this.h, i4, 0, i5, 0);
        e eVar22 = (e) this.h.getLayoutParams();
        int max32 = Math.max(max, this.h.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar22).leftMargin + ((ViewGroup.MarginLayoutParams) eVar22).rightMargin);
        int max42 = Math.max(max2, this.h.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar22).topMargin + ((ViewGroup.MarginLayoutParams) eVar22).bottomMargin);
        int combineMeasuredStates22 = View.combineMeasuredStates(combineMeasuredStates, this.h.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max32, getSuggestedMinimumWidth()), i4, combineMeasuredStates22), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max42, getSuggestedMinimumHeight()), i5, combineMeasuredStates22 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f4, float f5, boolean z3) {
        if (!this.f206n || !z3) {
            return false;
        }
        this.A.fling(0, 0, 0, (int) f5, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.A.getFinalY() > this.f201i.getHeight()) {
            h();
            this.E.run();
        } else {
            h();
            this.D.run();
        }
        this.f207o = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f4, float f5) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i4, int i5, int i6, int i7) {
        int i8 = this.f208p + i5;
        this.f208p = i8;
        setActionBarHideOffset(i8);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i4) {
        l0 l0Var;
        j jVar;
        this.F.f801a = i4;
        this.f208p = getActionBarHideOffset();
        h();
        d dVar = this.f218z;
        if (dVar == null || (jVar = (l0Var = (l0) dVar).f1633x) == null) {
            return;
        }
        jVar.a();
        l0Var.f1633x = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i4) {
        if ((i4 & 2) == 0 || this.f201i.getVisibility() != 0) {
            return false;
        }
        return this.f206n;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f206n || this.f207o) {
            return;
        }
        if (this.f208p <= this.f201i.getHeight()) {
            h();
            postDelayed(this.D, 600L);
        } else {
            h();
            postDelayed(this.E, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i4) {
        super.onWindowSystemUiVisibilityChanged(i4);
        k();
        int i5 = this.f209q ^ i4;
        this.f209q = i4;
        boolean z3 = (i4 & 4) == 0;
        boolean z4 = (i4 & 256) != 0;
        d dVar = this.f218z;
        if (dVar != null) {
            l0 l0Var = (l0) dVar;
            l0Var.f1629t = !z4;
            if (z3 || !z4) {
                if (l0Var.f1630u) {
                    l0Var.f1630u = false;
                    l0Var.q0(true);
                }
            } else if (!l0Var.f1630u) {
                l0Var.f1630u = true;
                l0Var.q0(true);
            }
        }
        if ((i5 & 256) == 0 || this.f218z == null) {
            return;
        }
        WeakHashMap weakHashMap = j0.f2752a;
        z.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i4) {
        super.onWindowVisibilityChanged(i4);
        this.g = i4;
        d dVar = this.f218z;
        if (dVar != null) {
            ((l0) dVar).f1628s = i4;
        }
    }

    public void setActionBarHideOffset(int i4) {
        h();
        this.f201i.setTranslationY(-Math.max(0, Math.min(i4, this.f201i.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.f218z = dVar;
        if (getWindowToken() != null) {
            ((l0) this.f218z).f1628s = this.g;
            int i4 = this.f209q;
            if (i4 != 0) {
                onWindowSystemUiVisibilityChanged(i4);
                WeakHashMap weakHashMap = j0.f2752a;
                z.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z3) {
        this.f205m = z3;
    }

    public void setHideOnContentScrollEnabled(boolean z3) {
        if (z3 != this.f206n) {
            this.f206n = z3;
            if (z3) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i4) {
        k();
        z2 z2Var = (z2) this.f202j;
        z2Var.f2701d = i4 != 0 ? k3.m.w(z2Var.f2699a.getContext(), i4) : null;
        z2Var.c();
    }

    public void setLogo(int i4) {
        k();
        z2 z2Var = (z2) this.f202j;
        z2Var.f2702e = i4 != 0 ? k3.m.w(z2Var.f2699a.getContext(), i4) : null;
        z2Var.c();
    }

    public void setOverlayMode(boolean z3) {
        this.f204l = z3;
    }

    @Override // k.h1
    public void setWindowCallback(Window.Callback callback) {
        k();
        ((z2) this.f202j).f2706k = callback;
    }

    @Override // k.h1
    public void setWindowTitle(CharSequence charSequence) {
        k();
        z2 z2Var = (z2) this.f202j;
        if (z2Var.g) {
            return;
        }
        Toolbar toolbar = z2Var.f2699a;
        z2Var.h = charSequence;
        if ((z2Var.f2700b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (z2Var.g) {
                j0.n(toolbar.getRootView(), charSequence);
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
        z2 z2Var = (z2) this.f202j;
        z2Var.f2701d = drawable;
        z2Var.c();
    }

    public void setShowingForActionMode(boolean z3) {
    }

    public void setUiOptions(int i4) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i4, int i5, int[] iArr) {
    }

    @Override // k0.k
    public final void c(View view, int i4, int i5, int[] iArr, int i6) {
    }
}
