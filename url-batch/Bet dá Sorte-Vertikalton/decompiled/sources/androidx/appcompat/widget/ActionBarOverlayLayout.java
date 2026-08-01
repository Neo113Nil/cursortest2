package androidx.appcompat.widget;

import C.d;
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
import com.glasspulse.glasspulse.R;
import g.K;
import j.j;
import java.util.WeakHashMap;
import k.InterfaceC0168x;
import k.MenuC0157m;
import l.C0207e;
import l.C0209f;
import l.C0219k;
import l.InterfaceC0205d;
import l.InterfaceC0218j0;
import l.InterfaceC0220k0;
import l.RunnableC0203c;
import l.X0;
import l.c1;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0218j0, InterfaceC0014o, InterfaceC0015p {

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f1230C = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* renamed from: D, reason: collision with root package name */
    public static final w0 f1231D;

    /* renamed from: E, reason: collision with root package name */
    public static final Rect f1232E;

    /* renamed from: A, reason: collision with root package name */
    public final C0016q f1233A;

    /* renamed from: B, reason: collision with root package name */
    public final C0209f f1234B;

    /* renamed from: a, reason: collision with root package name */
    public int f1235a;

    /* renamed from: b, reason: collision with root package name */
    public int f1236b;

    /* renamed from: c, reason: collision with root package name */
    public ContentFrameLayout f1237c;
    public ActionBarContainer d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0220k0 f1238e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f1239f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1240g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1241j;

    /* renamed from: k, reason: collision with root package name */
    public int f1242k;

    /* renamed from: l, reason: collision with root package name */
    public int f1243l;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f1244m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f1245n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f1246o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f1247p;

    /* renamed from: q, reason: collision with root package name */
    public w0 f1248q;

    /* renamed from: r, reason: collision with root package name */
    public w0 f1249r;

    /* renamed from: s, reason: collision with root package name */
    public w0 f1250s;

    /* renamed from: t, reason: collision with root package name */
    public w0 f1251t;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC0205d f1252u;

    /* renamed from: v, reason: collision with root package name */
    public OverScroller f1253v;

    /* renamed from: w, reason: collision with root package name */
    public ViewPropertyAnimator f1254w;

    /* renamed from: x, reason: collision with root package name */
    public final Y f1255x;

    /* renamed from: y, reason: collision with root package name */
    public final RunnableC0203c f1256y;

    /* renamed from: z, reason: collision with root package name */
    public final RunnableC0203c f1257z;

    static {
        int i = Build.VERSION.SDK_INT;
        o0 n0Var = i >= 30 ? new n0() : i >= 29 ? new m0() : new l0();
        n0Var.g(d.b(0, 1, 0, 1));
        f1231D = n0Var.b();
        f1232E = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1236b = 0;
        this.f1244m = new Rect();
        this.f1245n = new Rect();
        this.f1246o = new Rect();
        this.f1247p = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        w0 w0Var = w0.f437b;
        this.f1248q = w0Var;
        this.f1249r = w0Var;
        this.f1250s = w0Var;
        this.f1251t = w0Var;
        this.f1255x = new Y(3, this);
        this.f1256y = new RunnableC0203c(this, 0);
        this.f1257z = new RunnableC0203c(this, 1);
        i(context);
        this.f1233A = new C0016q();
        C0209f c0209f = new C0209f(context);
        c0209f.setWillNotDraw(true);
        this.f1234B = c0209f;
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
        return layoutParams instanceof C0207e;
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
        if (this.f1239f != null) {
            if (this.d.getVisibility() == 0) {
                i = (int) (this.d.getTranslationY() + this.d.getBottom() + 0.5f);
            } else {
                i = 0;
            }
            this.f1239f.setBounds(0, i, getWidth(), this.f1239f.getIntrinsicHeight() + i);
            this.f1239f.draw(canvas);
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
        C0016q c0016q = this.f1233A;
        return c0016q.f425b | c0016q.f424a;
    }

    public CharSequence getTitle() {
        k();
        return ((c1) this.f1238e).f2938a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f1256y);
        removeCallbacks(this.f1257z);
        ViewPropertyAnimator viewPropertyAnimator = this.f1254w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1230C);
        this.f1235a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1239f = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f1253v = new OverScroller(context);
    }

    public final void j(int i) {
        k();
        if (i == 2) {
            ((c1) this.f1238e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((c1) this.f1238e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        InterfaceC0220k0 wrapper;
        if (this.f1237c == null) {
            this.f1237c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof InterfaceC0220k0) {
                wrapper = (InterfaceC0220k0) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f1238e = wrapper;
        }
    }

    public final void l(MenuC0157m menuC0157m, InterfaceC0168x interfaceC0168x) {
        k();
        c1 c1Var = (c1) this.f1238e;
        C0219k c0219k = c1Var.f2947m;
        Toolbar toolbar = c1Var.f2938a;
        if (c0219k == null) {
            c1Var.f2947m = new C0219k(toolbar.getContext());
        }
        C0219k c0219k2 = c1Var.f2947m;
        c0219k2.f2975e = interfaceC0168x;
        if (menuC0157m == null && toolbar.f1301a == null) {
            return;
        }
        toolbar.f();
        MenuC0157m menuC0157m2 = toolbar.f1301a.f1258p;
        if (menuC0157m2 == menuC0157m) {
            return;
        }
        if (menuC0157m2 != null) {
            menuC0157m2.r(toolbar.f1294K);
            menuC0157m2.r(toolbar.f1295L);
        }
        if (toolbar.f1295L == null) {
            toolbar.f1295L = new X0(toolbar);
        }
        c0219k2.f2985q = true;
        if (menuC0157m != null) {
            menuC0157m.b(c0219k2, toolbar.f1307j);
            menuC0157m.b(toolbar.f1295L, toolbar.f1307j);
        } else {
            c0219k2.j(toolbar.f1307j, null);
            toolbar.f1295L.j(toolbar.f1307j, null);
            c0219k2.c();
            toolbar.f1295L.c();
        }
        toolbar.f1301a.setPopupTheme(toolbar.f1308k);
        toolbar.f1301a.setPresenter(c0219k2);
        toolbar.f1294K = c0219k2;
        toolbar.u();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        w0 g2 = w0.g(this, windowInsets);
        boolean g3 = g(this.d, new Rect(g2.b(), g2.d(), g2.c(), g2.a()), false);
        WeakHashMap weakHashMap = S.f351a;
        Rect rect = this.f1244m;
        G.b(this, g2, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        u0 u0Var = g2.f438a;
        w0 l2 = u0Var.l(i, i2, i3, i4);
        this.f1248q = l2;
        boolean z2 = true;
        if (!this.f1249r.equals(l2)) {
            this.f1249r = this.f1248q;
            g3 = true;
        }
        Rect rect2 = this.f1245n;
        if (rect2.equals(rect)) {
            z2 = g3;
        } else {
            rect2.set(rect);
        }
        if (z2) {
            requestLayout();
        }
        return u0Var.a().f438a.c().f438a.b().f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = S.f351a;
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
        WeakHashMap weakHashMap = S.f351a;
        boolean z2 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z2) {
            measuredHeight = this.f1235a;
            if (this.h && this.d.getTabContainer() != null) {
                measuredHeight += this.f1235a;
            }
        } else {
            measuredHeight = this.d.getVisibility() != 8 ? this.d.getMeasuredHeight() : 0;
        }
        Rect rect = this.f1244m;
        Rect rect2 = this.f1246o;
        rect2.set(rect);
        this.f1250s = this.f1248q;
        if (!this.f1240g && !z2) {
            C0209f c0209f = this.f1234B;
            w0 w0Var = f1231D;
            Rect rect3 = this.f1247p;
            G.b(c0209f, w0Var, rect3);
            if (!rect3.equals(f1232E)) {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.f1250s = this.f1250s.f438a.l(0, measuredHeight, 0, 0);
                g(this.f1237c, rect2, true);
                if (!this.f1251t.equals(this.f1250s)) {
                    w0 w0Var2 = this.f1250s;
                    this.f1251t = w0Var2;
                    ContentFrameLayout contentFrameLayout = this.f1237c;
                    WindowInsets f2 = w0Var2.f();
                    if (f2 != null) {
                        WindowInsets a2 = E.a(contentFrameLayout, f2);
                        if (!a2.equals(f2)) {
                            w0.g(contentFrameLayout, a2);
                        }
                    }
                }
                measureChildWithMargins(this.f1237c, i, 0, i2, 0);
                C0207e c0207e2 = (C0207e) this.f1237c.getLayoutParams();
                int max3 = Math.max(max, this.f1237c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0207e2).leftMargin + ((ViewGroup.MarginLayoutParams) c0207e2).rightMargin);
                int max4 = Math.max(max2, this.f1237c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0207e2).topMargin + ((ViewGroup.MarginLayoutParams) c0207e2).bottomMargin);
                int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1237c.getMeasuredState());
                setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
            }
        }
        d b2 = d.b(this.f1250s.b(), this.f1250s.d() + measuredHeight, this.f1250s.c(), this.f1250s.a());
        w0 w0Var3 = this.f1250s;
        int i3 = Build.VERSION.SDK_INT;
        o0 n0Var = i3 >= 30 ? new n0(w0Var3) : i3 >= 29 ? new m0(w0Var3) : new l0(w0Var3);
        n0Var.g(b2);
        this.f1250s = n0Var.b();
        g(this.f1237c, rect2, true);
        if (!this.f1251t.equals(this.f1250s)) {
        }
        measureChildWithMargins(this.f1237c, i, 0, i2, 0);
        C0207e c0207e22 = (C0207e) this.f1237c.getLayoutParams();
        int max32 = Math.max(max, this.f1237c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0207e22).leftMargin + ((ViewGroup.MarginLayoutParams) c0207e22).rightMargin);
        int max42 = Math.max(max2, this.f1237c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0207e22).topMargin + ((ViewGroup.MarginLayoutParams) c0207e22).bottomMargin);
        int combineMeasuredStates22 = View.combineMeasuredStates(combineMeasuredStates, this.f1237c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max32, getSuggestedMinimumWidth()), i, combineMeasuredStates22), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max42, getSuggestedMinimumHeight()), i2, combineMeasuredStates22 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (!this.i || !z2) {
            return false;
        }
        this.f1253v.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f1253v.getFinalY() > this.d.getHeight()) {
            h();
            this.f1257z.run();
        } else {
            h();
            this.f1256y.run();
        }
        this.f1241j = true;
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
        int i5 = this.f1242k + i2;
        this.f1242k = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        K k2;
        j jVar;
        this.f1233A.f424a = i;
        this.f1242k = getActionBarHideOffset();
        h();
        InterfaceC0205d interfaceC0205d = this.f1252u;
        if (interfaceC0205d == null || (jVar = (k2 = (K) interfaceC0205d).f2392u) == null) {
            return;
        }
        jVar.a();
        k2.f2392u = null;
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
        if (!this.i || this.f1241j) {
            return;
        }
        if (this.f1242k <= this.d.getHeight()) {
            h();
            postDelayed(this.f1256y, 600L);
        } else {
            h();
            postDelayed(this.f1257z, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        k();
        int i2 = this.f1243l ^ i;
        this.f1243l = i;
        boolean z2 = (i & 4) == 0;
        boolean z3 = (i & 256) != 0;
        InterfaceC0205d interfaceC0205d = this.f1252u;
        if (interfaceC0205d != null) {
            K k2 = (K) interfaceC0205d;
            k2.f2388q = !z3;
            if (z2 || !z3) {
                if (k2.f2389r) {
                    k2.f2389r = false;
                    k2.p0(true);
                }
            } else if (!k2.f2389r) {
                k2.f2389r = true;
                k2.p0(true);
            }
        }
        if ((i2 & 256) == 0 || this.f1252u == null) {
            return;
        }
        WeakHashMap weakHashMap = S.f351a;
        E.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f1236b = i;
        InterfaceC0205d interfaceC0205d = this.f1252u;
        if (interfaceC0205d != null) {
            ((K) interfaceC0205d).f2387p = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        h();
        this.d.setTranslationY(-Math.max(0, Math.min(i, this.d.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0205d interfaceC0205d) {
        this.f1252u = interfaceC0205d;
        if (getWindowToken() != null) {
            ((K) this.f1252u).f2387p = this.f1236b;
            int i = this.f1243l;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = S.f351a;
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
        c1 c1Var = (c1) this.f1238e;
        c1Var.d = i != 0 ? u1.d.D(c1Var.f2938a.getContext(), i) : null;
        c1Var.c();
    }

    public void setLogo(int i) {
        k();
        c1 c1Var = (c1) this.f1238e;
        c1Var.f2941e = i != 0 ? u1.d.D(c1Var.f2938a.getContext(), i) : null;
        c1Var.c();
    }

    public void setOverlayMode(boolean z2) {
        this.f1240g = z2;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i) {
    }

    @Override // l.InterfaceC0218j0
    public void setWindowCallback(Window.Callback callback) {
        k();
        ((c1) this.f1238e).f2945k = callback;
    }

    @Override // l.InterfaceC0218j0
    public void setWindowTitle(CharSequence charSequence) {
        k();
        c1 c1Var = (c1) this.f1238e;
        if (c1Var.f2943g) {
            return;
        }
        c1Var.h = charSequence;
        if ((c1Var.f2939b & 8) != 0) {
            Toolbar toolbar = c1Var.f2938a;
            toolbar.setTitle(charSequence);
            if (c1Var.f2943g) {
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
        return new C0207e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        c1 c1Var = (c1) this.f1238e;
        c1Var.d = drawable;
        c1Var.c();
    }
}
