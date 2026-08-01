package androidx.appcompat.widget;

import E.c;
import M.C0015p;
import M.D;
import M.F;
import M.InterfaceC0013n;
import M.InterfaceC0014o;
import M.Q;
import M.X;
import M.k0;
import M.l0;
import M.m0;
import M.n0;
import M.t0;
import M.v0;
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
import com.winfour.neondrop.R;
import g.K;
import j.C0153j;
import java.util.WeakHashMap;
import k.m;
import k.x;
import l.C0183e;
import l.C0185f;
import l.C0195k;
import l.InterfaceC0181d;
import l.InterfaceC0198l0;
import l.InterfaceC0200m0;
import l.RunnableC0179c;
import l.Z0;
import l.e1;
import z1.l;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0198l0, InterfaceC0013n, InterfaceC0014o {

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f1363C = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* renamed from: D, reason: collision with root package name */
    public static final v0 f1364D;

    /* renamed from: E, reason: collision with root package name */
    public static final Rect f1365E;

    /* renamed from: A, reason: collision with root package name */
    public final C0015p f1366A;

    /* renamed from: B, reason: collision with root package name */
    public final C0185f f1367B;

    /* renamed from: a, reason: collision with root package name */
    public int f1368a;

    /* renamed from: b, reason: collision with root package name */
    public int f1369b;

    /* renamed from: c, reason: collision with root package name */
    public ContentFrameLayout f1370c;
    public ActionBarContainer d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0200m0 f1371e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f1372f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1373g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1374j;

    /* renamed from: k, reason: collision with root package name */
    public int f1375k;

    /* renamed from: l, reason: collision with root package name */
    public int f1376l;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f1377m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f1378n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f1379o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f1380p;

    /* renamed from: q, reason: collision with root package name */
    public v0 f1381q;

    /* renamed from: r, reason: collision with root package name */
    public v0 f1382r;

    /* renamed from: s, reason: collision with root package name */
    public v0 f1383s;

    /* renamed from: t, reason: collision with root package name */
    public v0 f1384t;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC0181d f1385u;

    /* renamed from: v, reason: collision with root package name */
    public OverScroller f1386v;

    /* renamed from: w, reason: collision with root package name */
    public ViewPropertyAnimator f1387w;

    /* renamed from: x, reason: collision with root package name */
    public final X f1388x;

    /* renamed from: y, reason: collision with root package name */
    public final RunnableC0179c f1389y;

    /* renamed from: z, reason: collision with root package name */
    public final RunnableC0179c f1390z;

    static {
        int i = Build.VERSION.SDK_INT;
        n0 m0Var = i >= 30 ? new m0() : i >= 29 ? new l0() : new k0();
        m0Var.g(c.b(0, 1, 0, 1));
        f1364D = m0Var.b();
        f1365E = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1369b = 0;
        this.f1377m = new Rect();
        this.f1378n = new Rect();
        this.f1379o = new Rect();
        this.f1380p = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        v0 v0Var = v0.f595b;
        this.f1381q = v0Var;
        this.f1382r = v0Var;
        this.f1383s = v0Var;
        this.f1384t = v0Var;
        this.f1388x = new X(2, this);
        this.f1389y = new RunnableC0179c(this, 0);
        this.f1390z = new RunnableC0179c(this, 1);
        i(context);
        this.f1366A = new C0015p();
        C0185f c0185f = new C0185f(context);
        c0185f.setWillNotDraw(true);
        this.f1367B = c0185f;
        addView(c0185f);
    }

    public static boolean g(View view, Rect rect, boolean z2) {
        boolean z3;
        C0183e c0183e = (C0183e) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) c0183e).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) c0183e).leftMargin = i2;
            z3 = true;
        } else {
            z3 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) c0183e).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) c0183e).topMargin = i4;
            z3 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) c0183e).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) c0183e).rightMargin = i6;
            z3 = true;
        }
        if (z2) {
            int i7 = ((ViewGroup.MarginLayoutParams) c0183e).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) c0183e).bottomMargin = i8;
                return true;
            }
        }
        return z3;
    }

    @Override // M.InterfaceC0013n
    public final void a(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // M.InterfaceC0014o
    public final void b(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        c(view, i, i2, i3, i4, i5);
    }

    @Override // M.InterfaceC0013n
    public final void c(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0183e;
    }

    @Override // M.InterfaceC0013n
    public final void d(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f1372f != null) {
            if (this.d.getVisibility() == 0) {
                i = (int) (this.d.getTranslationY() + this.d.getBottom() + 0.5f);
            } else {
                i = 0;
            }
            this.f1372f.setBounds(0, i, getWidth(), this.f1372f.getIntrinsicHeight() + i);
            this.f1372f.draw(canvas);
        }
    }

    @Override // M.InterfaceC0013n
    public final void e(View view, int i, int i2, int[] iArr, int i3) {
    }

    @Override // M.InterfaceC0013n
    public final boolean f(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0183e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0183e(getContext(), attributeSet);
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
        C0015p c0015p = this.f1366A;
        return c0015p.f583b | c0015p.f582a;
    }

    public CharSequence getTitle() {
        k();
        return ((e1) this.f1371e).f2979a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f1389y);
        removeCallbacks(this.f1390z);
        ViewPropertyAnimator viewPropertyAnimator = this.f1387w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1363C);
        this.f1368a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1372f = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f1386v = new OverScroller(context);
    }

    public final void j(int i) {
        k();
        if (i == 2) {
            ((e1) this.f1371e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((e1) this.f1371e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        InterfaceC0200m0 wrapper;
        if (this.f1370c == null) {
            this.f1370c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof InterfaceC0200m0) {
                wrapper = (InterfaceC0200m0) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f1371e = wrapper;
        }
    }

    public final void l(m mVar, x xVar) {
        k();
        e1 e1Var = (e1) this.f1371e;
        C0195k c0195k = e1Var.f2988m;
        Toolbar toolbar = e1Var.f2979a;
        if (c0195k == null) {
            e1Var.f2988m = new C0195k(toolbar.getContext());
        }
        C0195k c0195k2 = e1Var.f2988m;
        c0195k2.f3016e = xVar;
        if (mVar == null && toolbar.f1431a == null) {
            return;
        }
        toolbar.f();
        m mVar2 = toolbar.f1431a.f1391p;
        if (mVar2 == mVar) {
            return;
        }
        if (mVar2 != null) {
            mVar2.r(toolbar.f1424K);
            mVar2.r(toolbar.f1425L);
        }
        if (toolbar.f1425L == null) {
            toolbar.f1425L = new Z0(toolbar);
        }
        c0195k2.f3026q = true;
        if (mVar != null) {
            mVar.b(c0195k2, toolbar.f1437j);
            mVar.b(toolbar.f1425L, toolbar.f1437j);
        } else {
            c0195k2.j(toolbar.f1437j, null);
            toolbar.f1425L.j(toolbar.f1437j, null);
            c0195k2.c();
            toolbar.f1425L.c();
        }
        toolbar.f1431a.setPopupTheme(toolbar.f1438k);
        toolbar.f1431a.setPresenter(c0195k2);
        toolbar.f1424K = c0195k2;
        toolbar.u();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        v0 g2 = v0.g(this, windowInsets);
        boolean g3 = g(this.d, new Rect(g2.b(), g2.d(), g2.c(), g2.a()), false);
        WeakHashMap weakHashMap = Q.f513a;
        Rect rect = this.f1377m;
        F.b(this, g2, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        t0 t0Var = g2.f596a;
        v0 l2 = t0Var.l(i, i2, i3, i4);
        this.f1381q = l2;
        boolean z2 = true;
        if (!this.f1382r.equals(l2)) {
            this.f1382r = this.f1381q;
            g3 = true;
        }
        Rect rect2 = this.f1378n;
        if (rect2.equals(rect)) {
            z2 = g3;
        } else {
            rect2.set(rect);
        }
        if (z2) {
            requestLayout();
        }
        return t0Var.a().f596a.c().f596a.b().f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = Q.f513a;
        D.c(this);
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
                C0183e c0183e = (C0183e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) c0183e).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) c0183e).topMargin + paddingTop;
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
        C0183e c0183e = (C0183e) this.d.getLayoutParams();
        int max = Math.max(0, this.d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0183e).leftMargin + ((ViewGroup.MarginLayoutParams) c0183e).rightMargin);
        int max2 = Math.max(0, this.d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0183e).topMargin + ((ViewGroup.MarginLayoutParams) c0183e).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.d.getMeasuredState());
        WeakHashMap weakHashMap = Q.f513a;
        boolean z2 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z2) {
            measuredHeight = this.f1368a;
            if (this.h && this.d.getTabContainer() != null) {
                measuredHeight += this.f1368a;
            }
        } else {
            measuredHeight = this.d.getVisibility() != 8 ? this.d.getMeasuredHeight() : 0;
        }
        Rect rect = this.f1377m;
        Rect rect2 = this.f1379o;
        rect2.set(rect);
        this.f1383s = this.f1381q;
        if (!this.f1373g && !z2) {
            C0185f c0185f = this.f1367B;
            v0 v0Var = f1364D;
            Rect rect3 = this.f1380p;
            F.b(c0185f, v0Var, rect3);
            if (!rect3.equals(f1365E)) {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.f1383s = this.f1383s.f596a.l(0, measuredHeight, 0, 0);
                g(this.f1370c, rect2, true);
                if (!this.f1384t.equals(this.f1383s)) {
                    v0 v0Var2 = this.f1383s;
                    this.f1384t = v0Var2;
                    ContentFrameLayout contentFrameLayout = this.f1370c;
                    WindowInsets f2 = v0Var2.f();
                    if (f2 != null) {
                        WindowInsets a2 = D.a(contentFrameLayout, f2);
                        if (!a2.equals(f2)) {
                            v0.g(contentFrameLayout, a2);
                        }
                    }
                }
                measureChildWithMargins(this.f1370c, i, 0, i2, 0);
                C0183e c0183e2 = (C0183e) this.f1370c.getLayoutParams();
                int max3 = Math.max(max, this.f1370c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0183e2).leftMargin + ((ViewGroup.MarginLayoutParams) c0183e2).rightMargin);
                int max4 = Math.max(max2, this.f1370c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0183e2).topMargin + ((ViewGroup.MarginLayoutParams) c0183e2).bottomMargin);
                int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1370c.getMeasuredState());
                setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
            }
        }
        c b2 = c.b(this.f1383s.b(), this.f1383s.d() + measuredHeight, this.f1383s.c(), this.f1383s.a());
        v0 v0Var3 = this.f1383s;
        int i3 = Build.VERSION.SDK_INT;
        n0 m0Var = i3 >= 30 ? new m0(v0Var3) : i3 >= 29 ? new l0(v0Var3) : new k0(v0Var3);
        m0Var.g(b2);
        this.f1383s = m0Var.b();
        g(this.f1370c, rect2, true);
        if (!this.f1384t.equals(this.f1383s)) {
        }
        measureChildWithMargins(this.f1370c, i, 0, i2, 0);
        C0183e c0183e22 = (C0183e) this.f1370c.getLayoutParams();
        int max32 = Math.max(max, this.f1370c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0183e22).leftMargin + ((ViewGroup.MarginLayoutParams) c0183e22).rightMargin);
        int max42 = Math.max(max2, this.f1370c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0183e22).topMargin + ((ViewGroup.MarginLayoutParams) c0183e22).bottomMargin);
        int combineMeasuredStates22 = View.combineMeasuredStates(combineMeasuredStates, this.f1370c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max32, getSuggestedMinimumWidth()), i, combineMeasuredStates22), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max42, getSuggestedMinimumHeight()), i2, combineMeasuredStates22 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (!this.i || !z2) {
            return false;
        }
        this.f1386v.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f1386v.getFinalY() > this.d.getHeight()) {
            h();
            this.f1390z.run();
        } else {
            h();
            this.f1389y.run();
        }
        this.f1374j = true;
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
        int i5 = this.f1375k + i2;
        this.f1375k = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        K k2;
        C0153j c0153j;
        this.f1366A.f582a = i;
        this.f1375k = getActionBarHideOffset();
        h();
        InterfaceC0181d interfaceC0181d = this.f1385u;
        if (interfaceC0181d == null || (c0153j = (k2 = (K) interfaceC0181d).f2276s) == null) {
            return;
        }
        c0153j.a();
        k2.f2276s = null;
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
        if (!this.i || this.f1374j) {
            return;
        }
        if (this.f1375k <= this.d.getHeight()) {
            h();
            postDelayed(this.f1389y, 600L);
        } else {
            h();
            postDelayed(this.f1390z, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        k();
        int i2 = this.f1376l ^ i;
        this.f1376l = i;
        boolean z2 = (i & 4) == 0;
        boolean z3 = (i & 256) != 0;
        InterfaceC0181d interfaceC0181d = this.f1385u;
        if (interfaceC0181d != null) {
            K k2 = (K) interfaceC0181d;
            k2.f2272o = !z3;
            if (z2 || !z3) {
                if (k2.f2273p) {
                    k2.f2273p = false;
                    k2.D0(true);
                }
            } else if (!k2.f2273p) {
                k2.f2273p = true;
                k2.D0(true);
            }
        }
        if ((i2 & 256) == 0 || this.f1385u == null) {
            return;
        }
        WeakHashMap weakHashMap = Q.f513a;
        D.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f1369b = i;
        InterfaceC0181d interfaceC0181d = this.f1385u;
        if (interfaceC0181d != null) {
            ((K) interfaceC0181d).f2271n = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        h();
        this.d.setTranslationY(-Math.max(0, Math.min(i, this.d.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0181d interfaceC0181d) {
        this.f1385u = interfaceC0181d;
        if (getWindowToken() != null) {
            ((K) this.f1385u).f2271n = this.f1369b;
            int i = this.f1376l;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = Q.f513a;
                D.c(this);
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
        e1 e1Var = (e1) this.f1371e;
        e1Var.d = i != 0 ? l.F(e1Var.f2979a.getContext(), i) : null;
        e1Var.c();
    }

    public void setLogo(int i) {
        k();
        e1 e1Var = (e1) this.f1371e;
        e1Var.f2982e = i != 0 ? l.F(e1Var.f2979a.getContext(), i) : null;
        e1Var.c();
    }

    public void setOverlayMode(boolean z2) {
        this.f1373g = z2;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i) {
    }

    @Override // l.InterfaceC0198l0
    public void setWindowCallback(Window.Callback callback) {
        k();
        ((e1) this.f1371e).f2986k = callback;
    }

    @Override // l.InterfaceC0198l0
    public void setWindowTitle(CharSequence charSequence) {
        k();
        e1 e1Var = (e1) this.f1371e;
        if (e1Var.f2984g) {
            return;
        }
        e1Var.h = charSequence;
        if ((e1Var.f2980b & 8) != 0) {
            Toolbar toolbar = e1Var.f2979a;
            toolbar.setTitle(charSequence);
            if (e1Var.f2984g) {
                Q.m(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0183e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        e1 e1Var = (e1) this.f1371e;
        e1Var.d = drawable;
        e1Var.c();
    }
}
