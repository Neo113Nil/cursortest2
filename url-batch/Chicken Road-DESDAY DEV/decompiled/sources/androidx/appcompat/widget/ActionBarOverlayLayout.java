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
import com.playgen.securelock.R;
import g.K;
import j.j;
import java.util.WeakHashMap;
import k.InterfaceC0172x;
import k.MenuC0161m;
import l.C0214e;
import l.C0216f;
import l.C0226k;
import l.InterfaceC0212d;
import l.InterfaceC0229l0;
import l.InterfaceC0231m0;
import l.RunnableC0210c;
import l.Z0;
import l.e1;
import u1.d;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0229l0, InterfaceC0014o, InterfaceC0015p {

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f1216C = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* renamed from: D, reason: collision with root package name */
    public static final w0 f1217D;

    /* renamed from: E, reason: collision with root package name */
    public static final Rect f1218E;

    /* renamed from: A, reason: collision with root package name */
    public final C0016q f1219A;

    /* renamed from: B, reason: collision with root package name */
    public final C0216f f1220B;

    /* renamed from: a, reason: collision with root package name */
    public int f1221a;

    /* renamed from: b, reason: collision with root package name */
    public int f1222b;

    /* renamed from: c, reason: collision with root package name */
    public ContentFrameLayout f1223c;
    public ActionBarContainer d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0231m0 f1224e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f1225f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1226g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1227j;

    /* renamed from: k, reason: collision with root package name */
    public int f1228k;

    /* renamed from: l, reason: collision with root package name */
    public int f1229l;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f1230m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f1231n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f1232o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f1233p;

    /* renamed from: q, reason: collision with root package name */
    public w0 f1234q;

    /* renamed from: r, reason: collision with root package name */
    public w0 f1235r;

    /* renamed from: s, reason: collision with root package name */
    public w0 f1236s;

    /* renamed from: t, reason: collision with root package name */
    public w0 f1237t;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC0212d f1238u;

    /* renamed from: v, reason: collision with root package name */
    public OverScroller f1239v;

    /* renamed from: w, reason: collision with root package name */
    public ViewPropertyAnimator f1240w;

    /* renamed from: x, reason: collision with root package name */
    public final Y f1241x;

    /* renamed from: y, reason: collision with root package name */
    public final RunnableC0210c f1242y;

    /* renamed from: z, reason: collision with root package name */
    public final RunnableC0210c f1243z;

    static {
        int i = Build.VERSION.SDK_INT;
        o0 n0Var = i >= 30 ? new n0() : i >= 29 ? new m0() : new l0();
        n0Var.g(c.b(0, 1, 0, 1));
        f1217D = n0Var.b();
        f1218E = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1222b = 0;
        this.f1230m = new Rect();
        this.f1231n = new Rect();
        this.f1232o = new Rect();
        this.f1233p = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        w0 w0Var = w0.f455b;
        this.f1234q = w0Var;
        this.f1235r = w0Var;
        this.f1236s = w0Var;
        this.f1237t = w0Var;
        this.f1241x = new Y(3, this);
        this.f1242y = new RunnableC0210c(this, 0);
        this.f1243z = new RunnableC0210c(this, 1);
        i(context);
        this.f1219A = new C0016q();
        C0216f c0216f = new C0216f(context);
        c0216f.setWillNotDraw(true);
        this.f1220B = c0216f;
        addView(c0216f);
    }

    public static boolean g(View view, Rect rect, boolean z2) {
        boolean z3;
        C0214e c0214e = (C0214e) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) c0214e).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) c0214e).leftMargin = i2;
            z3 = true;
        } else {
            z3 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) c0214e).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) c0214e).topMargin = i4;
            z3 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) c0214e).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) c0214e).rightMargin = i6;
            z3 = true;
        }
        if (z2) {
            int i7 = ((ViewGroup.MarginLayoutParams) c0214e).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) c0214e).bottomMargin = i8;
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
        return layoutParams instanceof C0214e;
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
        if (this.f1225f != null) {
            if (this.d.getVisibility() == 0) {
                i = (int) (this.d.getTranslationY() + this.d.getBottom() + 0.5f);
            } else {
                i = 0;
            }
            this.f1225f.setBounds(0, i, getWidth(), this.f1225f.getIntrinsicHeight() + i);
            this.f1225f.draw(canvas);
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
        return new C0214e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0214e(getContext(), attributeSet);
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
        C0016q c0016q = this.f1219A;
        return c0016q.f443b | c0016q.f442a;
    }

    public CharSequence getTitle() {
        k();
        return ((e1) this.f1224e).f2906a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f1242y);
        removeCallbacks(this.f1243z);
        ViewPropertyAnimator viewPropertyAnimator = this.f1240w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1216C);
        this.f1221a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1225f = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f1239v = new OverScroller(context);
    }

    public final void j(int i) {
        k();
        if (i == 2) {
            ((e1) this.f1224e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((e1) this.f1224e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        InterfaceC0231m0 wrapper;
        if (this.f1223c == null) {
            this.f1223c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof InterfaceC0231m0) {
                wrapper = (InterfaceC0231m0) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f1224e = wrapper;
        }
    }

    public final void l(MenuC0161m menuC0161m, InterfaceC0172x interfaceC0172x) {
        k();
        e1 e1Var = (e1) this.f1224e;
        C0226k c0226k = e1Var.f2915m;
        Toolbar toolbar = e1Var.f2906a;
        if (c0226k == null) {
            e1Var.f2915m = new C0226k(toolbar.getContext());
        }
        C0226k c0226k2 = e1Var.f2915m;
        c0226k2.f2943e = interfaceC0172x;
        if (menuC0161m == null && toolbar.f1284a == null) {
            return;
        }
        toolbar.f();
        MenuC0161m menuC0161m2 = toolbar.f1284a.f1244p;
        if (menuC0161m2 == menuC0161m) {
            return;
        }
        if (menuC0161m2 != null) {
            menuC0161m2.r(toolbar.f1277K);
            menuC0161m2.r(toolbar.f1278L);
        }
        if (toolbar.f1278L == null) {
            toolbar.f1278L = new Z0(toolbar);
        }
        c0226k2.f2953q = true;
        if (menuC0161m != null) {
            menuC0161m.b(c0226k2, toolbar.f1290j);
            menuC0161m.b(toolbar.f1278L, toolbar.f1290j);
        } else {
            c0226k2.j(toolbar.f1290j, null);
            toolbar.f1278L.j(toolbar.f1290j, null);
            c0226k2.c();
            toolbar.f1278L.c();
        }
        toolbar.f1284a.setPopupTheme(toolbar.f1291k);
        toolbar.f1284a.setPresenter(c0226k2);
        toolbar.f1277K = c0226k2;
        toolbar.u();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        w0 g2 = w0.g(this, windowInsets);
        boolean g3 = g(this.d, new Rect(g2.b(), g2.d(), g2.c(), g2.a()), false);
        WeakHashMap weakHashMap = S.f369a;
        Rect rect = this.f1230m;
        G.b(this, g2, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        u0 u0Var = g2.f456a;
        w0 l2 = u0Var.l(i, i2, i3, i4);
        this.f1234q = l2;
        boolean z2 = true;
        if (!this.f1235r.equals(l2)) {
            this.f1235r = this.f1234q;
            g3 = true;
        }
        Rect rect2 = this.f1231n;
        if (rect2.equals(rect)) {
            z2 = g3;
        } else {
            rect2.set(rect);
        }
        if (z2) {
            requestLayout();
        }
        return u0Var.a().f456a.c().f456a.b().f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = S.f369a;
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
                C0214e c0214e = (C0214e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) c0214e).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) c0214e).topMargin + paddingTop;
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
        C0214e c0214e = (C0214e) this.d.getLayoutParams();
        int max = Math.max(0, this.d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0214e).leftMargin + ((ViewGroup.MarginLayoutParams) c0214e).rightMargin);
        int max2 = Math.max(0, this.d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0214e).topMargin + ((ViewGroup.MarginLayoutParams) c0214e).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.d.getMeasuredState());
        WeakHashMap weakHashMap = S.f369a;
        boolean z2 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z2) {
            measuredHeight = this.f1221a;
            if (this.h && this.d.getTabContainer() != null) {
                measuredHeight += this.f1221a;
            }
        } else {
            measuredHeight = this.d.getVisibility() != 8 ? this.d.getMeasuredHeight() : 0;
        }
        Rect rect = this.f1230m;
        Rect rect2 = this.f1232o;
        rect2.set(rect);
        this.f1236s = this.f1234q;
        if (!this.f1226g && !z2) {
            C0216f c0216f = this.f1220B;
            w0 w0Var = f1217D;
            Rect rect3 = this.f1233p;
            G.b(c0216f, w0Var, rect3);
            if (!rect3.equals(f1218E)) {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.f1236s = this.f1236s.f456a.l(0, measuredHeight, 0, 0);
                g(this.f1223c, rect2, true);
                if (!this.f1237t.equals(this.f1236s)) {
                    w0 w0Var2 = this.f1236s;
                    this.f1237t = w0Var2;
                    ContentFrameLayout contentFrameLayout = this.f1223c;
                    WindowInsets f2 = w0Var2.f();
                    if (f2 != null) {
                        WindowInsets a2 = E.a(contentFrameLayout, f2);
                        if (!a2.equals(f2)) {
                            w0.g(contentFrameLayout, a2);
                        }
                    }
                }
                measureChildWithMargins(this.f1223c, i, 0, i2, 0);
                C0214e c0214e2 = (C0214e) this.f1223c.getLayoutParams();
                int max3 = Math.max(max, this.f1223c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0214e2).leftMargin + ((ViewGroup.MarginLayoutParams) c0214e2).rightMargin);
                int max4 = Math.max(max2, this.f1223c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0214e2).topMargin + ((ViewGroup.MarginLayoutParams) c0214e2).bottomMargin);
                int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1223c.getMeasuredState());
                setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
            }
        }
        c b2 = c.b(this.f1236s.b(), this.f1236s.d() + measuredHeight, this.f1236s.c(), this.f1236s.a());
        w0 w0Var3 = this.f1236s;
        int i3 = Build.VERSION.SDK_INT;
        o0 n0Var = i3 >= 30 ? new n0(w0Var3) : i3 >= 29 ? new m0(w0Var3) : new l0(w0Var3);
        n0Var.g(b2);
        this.f1236s = n0Var.b();
        g(this.f1223c, rect2, true);
        if (!this.f1237t.equals(this.f1236s)) {
        }
        measureChildWithMargins(this.f1223c, i, 0, i2, 0);
        C0214e c0214e22 = (C0214e) this.f1223c.getLayoutParams();
        int max32 = Math.max(max, this.f1223c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0214e22).leftMargin + ((ViewGroup.MarginLayoutParams) c0214e22).rightMargin);
        int max42 = Math.max(max2, this.f1223c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0214e22).topMargin + ((ViewGroup.MarginLayoutParams) c0214e22).bottomMargin);
        int combineMeasuredStates22 = View.combineMeasuredStates(combineMeasuredStates, this.f1223c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max32, getSuggestedMinimumWidth()), i, combineMeasuredStates22), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max42, getSuggestedMinimumHeight()), i2, combineMeasuredStates22 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (!this.i || !z2) {
            return false;
        }
        this.f1239v.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f1239v.getFinalY() > this.d.getHeight()) {
            h();
            this.f1243z.run();
        } else {
            h();
            this.f1242y.run();
        }
        this.f1227j = true;
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
        int i5 = this.f1228k + i2;
        this.f1228k = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        K k2;
        j jVar;
        this.f1219A.f442a = i;
        this.f1228k = getActionBarHideOffset();
        h();
        InterfaceC0212d interfaceC0212d = this.f1238u;
        if (interfaceC0212d == null || (jVar = (k2 = (K) interfaceC0212d).f2352s) == null) {
            return;
        }
        jVar.a();
        k2.f2352s = null;
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
        if (!this.i || this.f1227j) {
            return;
        }
        if (this.f1228k <= this.d.getHeight()) {
            h();
            postDelayed(this.f1242y, 600L);
        } else {
            h();
            postDelayed(this.f1243z, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        k();
        int i2 = this.f1229l ^ i;
        this.f1229l = i;
        boolean z2 = (i & 4) == 0;
        boolean z3 = (i & 256) != 0;
        InterfaceC0212d interfaceC0212d = this.f1238u;
        if (interfaceC0212d != null) {
            K k2 = (K) interfaceC0212d;
            k2.f2348o = !z3;
            if (z2 || !z3) {
                if (k2.f2349p) {
                    k2.f2349p = false;
                    k2.z0(true);
                }
            } else if (!k2.f2349p) {
                k2.f2349p = true;
                k2.z0(true);
            }
        }
        if ((i2 & 256) == 0 || this.f1238u == null) {
            return;
        }
        WeakHashMap weakHashMap = S.f369a;
        E.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f1222b = i;
        InterfaceC0212d interfaceC0212d = this.f1238u;
        if (interfaceC0212d != null) {
            ((K) interfaceC0212d).f2347n = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        h();
        this.d.setTranslationY(-Math.max(0, Math.min(i, this.d.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0212d interfaceC0212d) {
        this.f1238u = interfaceC0212d;
        if (getWindowToken() != null) {
            ((K) this.f1238u).f2347n = this.f1222b;
            int i = this.f1229l;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = S.f369a;
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
        e1 e1Var = (e1) this.f1224e;
        e1Var.d = i != 0 ? d.G(e1Var.f2906a.getContext(), i) : null;
        e1Var.c();
    }

    public void setLogo(int i) {
        k();
        e1 e1Var = (e1) this.f1224e;
        e1Var.f2909e = i != 0 ? d.G(e1Var.f2906a.getContext(), i) : null;
        e1Var.c();
    }

    public void setOverlayMode(boolean z2) {
        this.f1226g = z2;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i) {
    }

    @Override // l.InterfaceC0229l0
    public void setWindowCallback(Window.Callback callback) {
        k();
        ((e1) this.f1224e).f2913k = callback;
    }

    @Override // l.InterfaceC0229l0
    public void setWindowTitle(CharSequence charSequence) {
        k();
        e1 e1Var = (e1) this.f1224e;
        if (e1Var.f2911g) {
            return;
        }
        e1Var.h = charSequence;
        if ((e1Var.f2907b & 8) != 0) {
            Toolbar toolbar = e1Var.f2906a;
            toolbar.setTitle(charSequence);
            if (e1Var.f2911g) {
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
        return new C0214e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        e1 e1Var = (e1) this.f1224e;
        e1Var.d = drawable;
        e1Var.c();
    }
}
