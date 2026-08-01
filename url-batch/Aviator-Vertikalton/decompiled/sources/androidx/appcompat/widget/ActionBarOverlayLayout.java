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
import com.fortuneink.neonpad.R;
import g.O;
import j.k;
import java.util.WeakHashMap;
import k.InterfaceC0211x;
import k.MenuC0200m;
import l.C0256e;
import l.C0258f;
import l.C0268k;
import l.InterfaceC0254d;
import l.InterfaceC0273m0;
import l.InterfaceC0275n0;
import l.RunnableC0252c;
import l.Z0;
import l.e1;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0273m0, InterfaceC0022s, InterfaceC0023t {

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f1006C = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* renamed from: D, reason: collision with root package name */
    public static final B0 f1007D;

    /* renamed from: E, reason: collision with root package name */
    public static final Rect f1008E;

    /* renamed from: A, reason: collision with root package name */
    public final C0024u f1009A;

    /* renamed from: B, reason: collision with root package name */
    public final C0258f f1010B;

    /* renamed from: a, reason: collision with root package name */
    public int f1011a;

    /* renamed from: b, reason: collision with root package name */
    public int f1012b;

    /* renamed from: c, reason: collision with root package name */
    public ContentFrameLayout f1013c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContainer f1014d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0275n0 f1015e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f1016f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1017g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1018j;

    /* renamed from: k, reason: collision with root package name */
    public int f1019k;

    /* renamed from: l, reason: collision with root package name */
    public int f1020l;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f1021m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f1022n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f1023o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f1024p;

    /* renamed from: q, reason: collision with root package name */
    public B0 f1025q;

    /* renamed from: r, reason: collision with root package name */
    public B0 f1026r;

    /* renamed from: s, reason: collision with root package name */
    public B0 f1027s;

    /* renamed from: t, reason: collision with root package name */
    public B0 f1028t;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC0254d f1029u;

    /* renamed from: v, reason: collision with root package name */
    public OverScroller f1030v;

    /* renamed from: w, reason: collision with root package name */
    public ViewPropertyAnimator f1031w;

    /* renamed from: x, reason: collision with root package name */
    public final C0007d0 f1032x;

    /* renamed from: y, reason: collision with root package name */
    public final RunnableC0252c f1033y;

    /* renamed from: z, reason: collision with root package name */
    public final RunnableC0252c f1034z;

    static {
        int i = Build.VERSION.SDK_INT;
        t0 s0Var = i >= 30 ? new s0() : i >= 29 ? new r0() : new q0();
        s0Var.g(d.b(0, 1, 0, 1));
        f1007D = s0Var.b();
        f1008E = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1012b = 0;
        this.f1021m = new Rect();
        this.f1022n = new Rect();
        this.f1023o = new Rect();
        this.f1024p = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        B0 b02 = B0.f394b;
        this.f1025q = b02;
        this.f1026r = b02;
        this.f1027s = b02;
        this.f1028t = b02;
        this.f1032x = new C0007d0(4, this);
        this.f1033y = new RunnableC0252c(this, 0);
        this.f1034z = new RunnableC0252c(this, 1);
        i(context);
        this.f1009A = new C0024u();
        C0258f c0258f = new C0258f(context);
        c0258f.setWillNotDraw(true);
        this.f1010B = c0258f;
        addView(c0258f);
    }

    public static boolean g(View view, Rect rect, boolean z2) {
        boolean z3;
        C0256e c0256e = (C0256e) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) c0256e).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) c0256e).leftMargin = i2;
            z3 = true;
        } else {
            z3 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) c0256e).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) c0256e).topMargin = i4;
            z3 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) c0256e).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) c0256e).rightMargin = i6;
            z3 = true;
        }
        if (z2) {
            int i7 = ((ViewGroup.MarginLayoutParams) c0256e).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) c0256e).bottomMargin = i8;
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
        return layoutParams instanceof C0256e;
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
        if (this.f1016f != null) {
            if (this.f1014d.getVisibility() == 0) {
                i = (int) (this.f1014d.getTranslationY() + this.f1014d.getBottom() + 0.5f);
            } else {
                i = 0;
            }
            this.f1016f.setBounds(0, i, getWidth(), this.f1016f.getIntrinsicHeight() + i);
            this.f1016f.draw(canvas);
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
        return new C0256e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0256e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1014d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0024u c0024u = this.f1009A;
        return c0024u.f501b | c0024u.f500a;
    }

    public CharSequence getTitle() {
        k();
        return ((e1) this.f1015e).f3352a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f1033y);
        removeCallbacks(this.f1034z);
        ViewPropertyAnimator viewPropertyAnimator = this.f1031w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1006C);
        this.f1011a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1016f = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f1030v = new OverScroller(context);
    }

    public final void j(int i) {
        k();
        if (i == 2) {
            ((e1) this.f1015e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((e1) this.f1015e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        InterfaceC0275n0 wrapper;
        if (this.f1013c == null) {
            this.f1013c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f1014d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof InterfaceC0275n0) {
                wrapper = (InterfaceC0275n0) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f1015e = wrapper;
        }
    }

    public final void l(MenuC0200m menuC0200m, InterfaceC0211x interfaceC0211x) {
        k();
        e1 e1Var = (e1) this.f1015e;
        C0268k c0268k = e1Var.f3362m;
        Toolbar toolbar = e1Var.f3352a;
        if (c0268k == null) {
            e1Var.f3362m = new C0268k(toolbar.getContext());
        }
        C0268k c0268k2 = e1Var.f3362m;
        c0268k2.f3390e = interfaceC0211x;
        if (menuC0200m == null && toolbar.f1080a == null) {
            return;
        }
        toolbar.f();
        MenuC0200m menuC0200m2 = toolbar.f1080a.f1036p;
        if (menuC0200m2 == menuC0200m) {
            return;
        }
        if (menuC0200m2 != null) {
            menuC0200m2.r(toolbar.f1071L);
            menuC0200m2.r(toolbar.f1072M);
        }
        if (toolbar.f1072M == null) {
            toolbar.f1072M = new Z0(toolbar);
        }
        c0268k2.f3400q = true;
        if (menuC0200m != null) {
            menuC0200m.b(c0268k2, toolbar.f1087j);
            menuC0200m.b(toolbar.f1072M, toolbar.f1087j);
        } else {
            c0268k2.j(toolbar.f1087j, null);
            toolbar.f1072M.j(toolbar.f1087j, null);
            c0268k2.c();
            toolbar.f1072M.c();
        }
        toolbar.f1080a.setPopupTheme(toolbar.f1088k);
        toolbar.f1080a.setPresenter(c0268k2);
        toolbar.f1071L = c0268k2;
        toolbar.w();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        B0 g2 = B0.g(this, windowInsets);
        boolean g3 = g(this.f1014d, new Rect(g2.b(), g2.d(), g2.c(), g2.a()), false);
        WeakHashMap weakHashMap = X.f418a;
        Rect rect = this.f1021m;
        L.b(this, g2, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        z0 z0Var = g2.f395a;
        B0 l2 = z0Var.l(i, i2, i3, i4);
        this.f1025q = l2;
        boolean z2 = true;
        if (!this.f1026r.equals(l2)) {
            this.f1026r = this.f1025q;
            g3 = true;
        }
        Rect rect2 = this.f1022n;
        if (rect2.equals(rect)) {
            z2 = g3;
        } else {
            rect2.set(rect);
        }
        if (z2) {
            requestLayout();
        }
        return z0Var.a().f395a.c().f395a.b().f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = X.f418a;
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
                C0256e c0256e = (C0256e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) c0256e).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) c0256e).topMargin + paddingTop;
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
        measureChildWithMargins(this.f1014d, i, 0, i2, 0);
        C0256e c0256e = (C0256e) this.f1014d.getLayoutParams();
        int max = Math.max(0, this.f1014d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0256e).leftMargin + ((ViewGroup.MarginLayoutParams) c0256e).rightMargin);
        int max2 = Math.max(0, this.f1014d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0256e).topMargin + ((ViewGroup.MarginLayoutParams) c0256e).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f1014d.getMeasuredState());
        WeakHashMap weakHashMap = X.f418a;
        boolean z2 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z2) {
            measuredHeight = this.f1011a;
            if (this.h && this.f1014d.getTabContainer() != null) {
                measuredHeight += this.f1011a;
            }
        } else {
            measuredHeight = this.f1014d.getVisibility() != 8 ? this.f1014d.getMeasuredHeight() : 0;
        }
        Rect rect = this.f1021m;
        Rect rect2 = this.f1023o;
        rect2.set(rect);
        this.f1027s = this.f1025q;
        if (!this.f1017g && !z2) {
            C0258f c0258f = this.f1010B;
            B0 b02 = f1007D;
            Rect rect3 = this.f1024p;
            L.b(c0258f, b02, rect3);
            if (!rect3.equals(f1008E)) {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.f1027s = this.f1027s.f395a.l(0, measuredHeight, 0, 0);
                g(this.f1013c, rect2, true);
                if (!this.f1028t.equals(this.f1027s)) {
                    B0 b03 = this.f1027s;
                    this.f1028t = b03;
                    ContentFrameLayout contentFrameLayout = this.f1013c;
                    WindowInsets f2 = b03.f();
                    if (f2 != null) {
                        WindowInsets a2 = J.a(contentFrameLayout, f2);
                        if (!a2.equals(f2)) {
                            B0.g(contentFrameLayout, a2);
                        }
                    }
                }
                measureChildWithMargins(this.f1013c, i, 0, i2, 0);
                C0256e c0256e2 = (C0256e) this.f1013c.getLayoutParams();
                int max3 = Math.max(max, this.f1013c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0256e2).leftMargin + ((ViewGroup.MarginLayoutParams) c0256e2).rightMargin);
                int max4 = Math.max(max2, this.f1013c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0256e2).topMargin + ((ViewGroup.MarginLayoutParams) c0256e2).bottomMargin);
                int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1013c.getMeasuredState());
                setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
            }
        }
        d b2 = d.b(this.f1027s.b(), this.f1027s.d() + measuredHeight, this.f1027s.c(), this.f1027s.a());
        B0 b04 = this.f1027s;
        int i3 = Build.VERSION.SDK_INT;
        t0 s0Var = i3 >= 30 ? new s0(b04) : i3 >= 29 ? new r0(b04) : new q0(b04);
        s0Var.g(b2);
        this.f1027s = s0Var.b();
        g(this.f1013c, rect2, true);
        if (!this.f1028t.equals(this.f1027s)) {
        }
        measureChildWithMargins(this.f1013c, i, 0, i2, 0);
        C0256e c0256e22 = (C0256e) this.f1013c.getLayoutParams();
        int max32 = Math.max(max, this.f1013c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0256e22).leftMargin + ((ViewGroup.MarginLayoutParams) c0256e22).rightMargin);
        int max42 = Math.max(max2, this.f1013c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0256e22).topMargin + ((ViewGroup.MarginLayoutParams) c0256e22).bottomMargin);
        int combineMeasuredStates22 = View.combineMeasuredStates(combineMeasuredStates, this.f1013c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max32, getSuggestedMinimumWidth()), i, combineMeasuredStates22), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max42, getSuggestedMinimumHeight()), i2, combineMeasuredStates22 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (!this.i || !z2) {
            return false;
        }
        this.f1030v.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f1030v.getFinalY() > this.f1014d.getHeight()) {
            h();
            this.f1034z.run();
        } else {
            h();
            this.f1033y.run();
        }
        this.f1018j = true;
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
        int i5 = this.f1019k + i2;
        this.f1019k = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        O o2;
        k kVar;
        this.f1009A.f500a = i;
        this.f1019k = getActionBarHideOffset();
        h();
        InterfaceC0254d interfaceC0254d = this.f1029u;
        if (interfaceC0254d == null || (kVar = (o2 = (O) interfaceC0254d).f2535s) == null) {
            return;
        }
        kVar.a();
        o2.f2535s = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f1014d.getVisibility() != 0) {
            return false;
        }
        return this.i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.i || this.f1018j) {
            return;
        }
        if (this.f1019k <= this.f1014d.getHeight()) {
            h();
            postDelayed(this.f1033y, 600L);
        } else {
            h();
            postDelayed(this.f1034z, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        k();
        int i2 = this.f1020l ^ i;
        this.f1020l = i;
        boolean z2 = (i & 4) == 0;
        boolean z3 = (i & 256) != 0;
        InterfaceC0254d interfaceC0254d = this.f1029u;
        if (interfaceC0254d != null) {
            O o2 = (O) interfaceC0254d;
            o2.f2531o = !z3;
            if (z2 || !z3) {
                if (o2.f2532p) {
                    o2.f2532p = false;
                    o2.s(true);
                }
            } else if (!o2.f2532p) {
                o2.f2532p = true;
                o2.s(true);
            }
        }
        if ((i2 & 256) == 0 || this.f1029u == null) {
            return;
        }
        WeakHashMap weakHashMap = X.f418a;
        J.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f1012b = i;
        InterfaceC0254d interfaceC0254d = this.f1029u;
        if (interfaceC0254d != null) {
            ((O) interfaceC0254d).f2530n = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        h();
        this.f1014d.setTranslationY(-Math.max(0, Math.min(i, this.f1014d.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0254d interfaceC0254d) {
        this.f1029u = interfaceC0254d;
        if (getWindowToken() != null) {
            ((O) this.f1029u).f2530n = this.f1012b;
            int i = this.f1020l;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = X.f418a;
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
        e1 e1Var = (e1) this.f1015e;
        e1Var.f3355d = i != 0 ? q1.d.z(e1Var.f3352a.getContext(), i) : null;
        e1Var.c();
    }

    public void setLogo(int i) {
        k();
        e1 e1Var = (e1) this.f1015e;
        e1Var.f3356e = i != 0 ? q1.d.z(e1Var.f3352a.getContext(), i) : null;
        e1Var.c();
    }

    public void setOverlayMode(boolean z2) {
        this.f1017g = z2;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i) {
    }

    @Override // l.InterfaceC0273m0
    public void setWindowCallback(Window.Callback callback) {
        k();
        ((e1) this.f1015e).f3360k = callback;
    }

    @Override // l.InterfaceC0273m0
    public void setWindowTitle(CharSequence charSequence) {
        k();
        e1 e1Var = (e1) this.f1015e;
        if (e1Var.f3358g) {
            return;
        }
        e1Var.h = charSequence;
        if ((e1Var.f3353b & 8) != 0) {
            Toolbar toolbar = e1Var.f3352a;
            toolbar.setTitle(charSequence);
            if (e1Var.f3358g) {
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
        return new C0256e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        e1 e1Var = (e1) this.f1015e;
        e1Var.f3355d = drawable;
        e1Var.c();
    }
}
