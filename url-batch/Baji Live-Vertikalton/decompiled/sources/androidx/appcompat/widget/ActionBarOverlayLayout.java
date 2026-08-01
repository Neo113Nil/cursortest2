package androidx.appcompat.widget;

import C.d;
import K.C0017q;
import K.F;
import K.H;
import K.InterfaceC0015o;
import K.InterfaceC0016p;
import K.T;
import K.Z;
import K.m0;
import K.n0;
import K.o0;
import K.p0;
import K.v0;
import K.x0;
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
import com.playwall.bouncefield.R;
import g.K;
import j.j;
import java.util.WeakHashMap;
import k.InterfaceC0168x;
import k.MenuC0157m;
import l.C0230e;
import l.C0232f;
import l.C0244l;
import l.InterfaceC0228d;
import l.InterfaceC0245l0;
import l.InterfaceC0247m0;
import l.RunnableC0226c;
import l.Y0;
import l.d1;
import q1.l;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0245l0, InterfaceC0015o, InterfaceC0016p {

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f1152C = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* renamed from: D, reason: collision with root package name */
    public static final x0 f1153D;

    /* renamed from: E, reason: collision with root package name */
    public static final Rect f1154E;

    /* renamed from: A, reason: collision with root package name */
    public final C0017q f1155A;

    /* renamed from: B, reason: collision with root package name */
    public final C0232f f1156B;

    /* renamed from: a, reason: collision with root package name */
    public int f1157a;

    /* renamed from: b, reason: collision with root package name */
    public int f1158b;

    /* renamed from: c, reason: collision with root package name */
    public ContentFrameLayout f1159c;
    public ActionBarContainer d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0247m0 f1160e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f1161f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1162g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1163j;

    /* renamed from: k, reason: collision with root package name */
    public int f1164k;

    /* renamed from: l, reason: collision with root package name */
    public int f1165l;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f1166m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f1167n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f1168o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f1169p;

    /* renamed from: q, reason: collision with root package name */
    public x0 f1170q;

    /* renamed from: r, reason: collision with root package name */
    public x0 f1171r;

    /* renamed from: s, reason: collision with root package name */
    public x0 f1172s;

    /* renamed from: t, reason: collision with root package name */
    public x0 f1173t;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC0228d f1174u;

    /* renamed from: v, reason: collision with root package name */
    public OverScroller f1175v;

    /* renamed from: w, reason: collision with root package name */
    public ViewPropertyAnimator f1176w;

    /* renamed from: x, reason: collision with root package name */
    public final Z f1177x;

    /* renamed from: y, reason: collision with root package name */
    public final RunnableC0226c f1178y;

    /* renamed from: z, reason: collision with root package name */
    public final RunnableC0226c f1179z;

    static {
        int i = Build.VERSION.SDK_INT;
        p0 o0Var = i >= 30 ? new o0() : i >= 29 ? new n0() : new m0();
        o0Var.g(d.b(0, 1, 0, 1));
        f1153D = o0Var.b();
        f1154E = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1158b = 0;
        this.f1166m = new Rect();
        this.f1167n = new Rect();
        this.f1168o = new Rect();
        this.f1169p = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        x0 x0Var = x0.f467b;
        this.f1170q = x0Var;
        this.f1171r = x0Var;
        this.f1172s = x0Var;
        this.f1173t = x0Var;
        this.f1177x = new Z(3, this);
        this.f1178y = new RunnableC0226c(this, 0);
        this.f1179z = new RunnableC0226c(this, 1);
        i(context);
        this.f1155A = new C0017q();
        C0232f c0232f = new C0232f(context);
        c0232f.setWillNotDraw(true);
        this.f1156B = c0232f;
        addView(c0232f);
    }

    public static boolean g(View view, Rect rect, boolean z2) {
        boolean z3;
        C0230e c0230e = (C0230e) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) c0230e).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) c0230e).leftMargin = i2;
            z3 = true;
        } else {
            z3 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) c0230e).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) c0230e).topMargin = i4;
            z3 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) c0230e).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) c0230e).rightMargin = i6;
            z3 = true;
        }
        if (z2) {
            int i7 = ((ViewGroup.MarginLayoutParams) c0230e).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) c0230e).bottomMargin = i8;
                return true;
            }
        }
        return z3;
    }

    @Override // K.InterfaceC0015o
    public final void a(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // K.InterfaceC0016p
    public final void b(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        c(view, i, i2, i3, i4, i5);
    }

    @Override // K.InterfaceC0015o
    public final void c(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0230e;
    }

    @Override // K.InterfaceC0015o
    public final void d(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f1161f != null) {
            if (this.d.getVisibility() == 0) {
                i = (int) (this.d.getTranslationY() + this.d.getBottom() + 0.5f);
            } else {
                i = 0;
            }
            this.f1161f.setBounds(0, i, getWidth(), this.f1161f.getIntrinsicHeight() + i);
            this.f1161f.draw(canvas);
        }
    }

    @Override // K.InterfaceC0015o
    public final void e(View view, int i, int i2, int[] iArr, int i3) {
    }

    @Override // K.InterfaceC0015o
    public final boolean f(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0230e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0230e(getContext(), attributeSet);
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
        C0017q c0017q = this.f1155A;
        return c0017q.f448b | c0017q.f447a;
    }

    public CharSequence getTitle() {
        k();
        return ((d1) this.f1160e).f2951a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f1178y);
        removeCallbacks(this.f1179z);
        ViewPropertyAnimator viewPropertyAnimator = this.f1176w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1152C);
        this.f1157a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1161f = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f1175v = new OverScroller(context);
    }

    public final void j(int i) {
        k();
        if (i == 2) {
            ((d1) this.f1160e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((d1) this.f1160e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        InterfaceC0247m0 wrapper;
        if (this.f1159c == null) {
            this.f1159c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof InterfaceC0247m0) {
                wrapper = (InterfaceC0247m0) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f1160e = wrapper;
        }
    }

    public final void l(MenuC0157m menuC0157m, InterfaceC0168x interfaceC0168x) {
        k();
        d1 d1Var = (d1) this.f1160e;
        C0244l c0244l = d1Var.f2960m;
        Toolbar toolbar = d1Var.f2951a;
        if (c0244l == null) {
            d1Var.f2960m = new C0244l(toolbar.getContext());
        }
        C0244l c0244l2 = d1Var.f2960m;
        c0244l2.f2989e = interfaceC0168x;
        if (menuC0157m == null && toolbar.f1220a == null) {
            return;
        }
        toolbar.f();
        MenuC0157m menuC0157m2 = toolbar.f1220a.f1180p;
        if (menuC0157m2 == menuC0157m) {
            return;
        }
        if (menuC0157m2 != null) {
            menuC0157m2.r(toolbar.f1213K);
            menuC0157m2.r(toolbar.f1214L);
        }
        if (toolbar.f1214L == null) {
            toolbar.f1214L = new Y0(toolbar);
        }
        c0244l2.f2999q = true;
        if (menuC0157m != null) {
            menuC0157m.b(c0244l2, toolbar.f1226j);
            menuC0157m.b(toolbar.f1214L, toolbar.f1226j);
        } else {
            c0244l2.j(toolbar.f1226j, null);
            toolbar.f1214L.j(toolbar.f1226j, null);
            c0244l2.c();
            toolbar.f1214L.c();
        }
        toolbar.f1220a.setPopupTheme(toolbar.f1227k);
        toolbar.f1220a.setPresenter(c0244l2);
        toolbar.f1213K = c0244l2;
        toolbar.u();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        x0 g2 = x0.g(this, windowInsets);
        boolean g3 = g(this.d, new Rect(g2.b(), g2.d(), g2.c(), g2.a()), false);
        WeakHashMap weakHashMap = T.f381a;
        Rect rect = this.f1166m;
        H.b(this, g2, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        v0 v0Var = g2.f468a;
        x0 l2 = v0Var.l(i, i2, i3, i4);
        this.f1170q = l2;
        boolean z2 = true;
        if (!this.f1171r.equals(l2)) {
            this.f1171r = this.f1170q;
            g3 = true;
        }
        Rect rect2 = this.f1167n;
        if (rect2.equals(rect)) {
            z2 = g3;
        } else {
            rect2.set(rect);
        }
        if (z2) {
            requestLayout();
        }
        return v0Var.a().f468a.c().f468a.b().f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = T.f381a;
        F.c(this);
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
                C0230e c0230e = (C0230e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) c0230e).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) c0230e).topMargin + paddingTop;
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
        C0230e c0230e = (C0230e) this.d.getLayoutParams();
        int max = Math.max(0, this.d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0230e).leftMargin + ((ViewGroup.MarginLayoutParams) c0230e).rightMargin);
        int max2 = Math.max(0, this.d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0230e).topMargin + ((ViewGroup.MarginLayoutParams) c0230e).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.d.getMeasuredState());
        WeakHashMap weakHashMap = T.f381a;
        boolean z2 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z2) {
            measuredHeight = this.f1157a;
            if (this.h && this.d.getTabContainer() != null) {
                measuredHeight += this.f1157a;
            }
        } else {
            measuredHeight = this.d.getVisibility() != 8 ? this.d.getMeasuredHeight() : 0;
        }
        Rect rect = this.f1166m;
        Rect rect2 = this.f1168o;
        rect2.set(rect);
        this.f1172s = this.f1170q;
        if (!this.f1162g && !z2) {
            C0232f c0232f = this.f1156B;
            x0 x0Var = f1153D;
            Rect rect3 = this.f1169p;
            H.b(c0232f, x0Var, rect3);
            if (!rect3.equals(f1154E)) {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.f1172s = this.f1172s.f468a.l(0, measuredHeight, 0, 0);
                g(this.f1159c, rect2, true);
                if (!this.f1173t.equals(this.f1172s)) {
                    x0 x0Var2 = this.f1172s;
                    this.f1173t = x0Var2;
                    ContentFrameLayout contentFrameLayout = this.f1159c;
                    WindowInsets f2 = x0Var2.f();
                    if (f2 != null) {
                        WindowInsets a2 = F.a(contentFrameLayout, f2);
                        if (!a2.equals(f2)) {
                            x0.g(contentFrameLayout, a2);
                        }
                    }
                }
                measureChildWithMargins(this.f1159c, i, 0, i2, 0);
                C0230e c0230e2 = (C0230e) this.f1159c.getLayoutParams();
                int max3 = Math.max(max, this.f1159c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0230e2).leftMargin + ((ViewGroup.MarginLayoutParams) c0230e2).rightMargin);
                int max4 = Math.max(max2, this.f1159c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0230e2).topMargin + ((ViewGroup.MarginLayoutParams) c0230e2).bottomMargin);
                int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1159c.getMeasuredState());
                setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
            }
        }
        d b2 = d.b(this.f1172s.b(), this.f1172s.d() + measuredHeight, this.f1172s.c(), this.f1172s.a());
        x0 x0Var3 = this.f1172s;
        int i3 = Build.VERSION.SDK_INT;
        p0 o0Var = i3 >= 30 ? new o0(x0Var3) : i3 >= 29 ? new n0(x0Var3) : new m0(x0Var3);
        o0Var.g(b2);
        this.f1172s = o0Var.b();
        g(this.f1159c, rect2, true);
        if (!this.f1173t.equals(this.f1172s)) {
        }
        measureChildWithMargins(this.f1159c, i, 0, i2, 0);
        C0230e c0230e22 = (C0230e) this.f1159c.getLayoutParams();
        int max32 = Math.max(max, this.f1159c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0230e22).leftMargin + ((ViewGroup.MarginLayoutParams) c0230e22).rightMargin);
        int max42 = Math.max(max2, this.f1159c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0230e22).topMargin + ((ViewGroup.MarginLayoutParams) c0230e22).bottomMargin);
        int combineMeasuredStates22 = View.combineMeasuredStates(combineMeasuredStates, this.f1159c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max32, getSuggestedMinimumWidth()), i, combineMeasuredStates22), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max42, getSuggestedMinimumHeight()), i2, combineMeasuredStates22 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (!this.i || !z2) {
            return false;
        }
        this.f1175v.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f1175v.getFinalY() > this.d.getHeight()) {
            h();
            this.f1179z.run();
        } else {
            h();
            this.f1178y.run();
        }
        this.f1163j = true;
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
        int i5 = this.f1164k + i2;
        this.f1164k = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        K k2;
        j jVar;
        this.f1155A.f447a = i;
        this.f1164k = getActionBarHideOffset();
        h();
        InterfaceC0228d interfaceC0228d = this.f1174u;
        if (interfaceC0228d == null || (jVar = (k2 = (K) interfaceC0228d).f2277s) == null) {
            return;
        }
        jVar.a();
        k2.f2277s = null;
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
        if (!this.i || this.f1163j) {
            return;
        }
        if (this.f1164k <= this.d.getHeight()) {
            h();
            postDelayed(this.f1178y, 600L);
        } else {
            h();
            postDelayed(this.f1179z, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        k();
        int i2 = this.f1165l ^ i;
        this.f1165l = i;
        boolean z2 = (i & 4) == 0;
        boolean z3 = (i & 256) != 0;
        InterfaceC0228d interfaceC0228d = this.f1174u;
        if (interfaceC0228d != null) {
            K k2 = (K) interfaceC0228d;
            k2.f2273o = !z3;
            if (z2 || !z3) {
                if (k2.f2274p) {
                    k2.f2274p = false;
                    k2.i0(true);
                }
            } else if (!k2.f2274p) {
                k2.f2274p = true;
                k2.i0(true);
            }
        }
        if ((i2 & 256) == 0 || this.f1174u == null) {
            return;
        }
        WeakHashMap weakHashMap = T.f381a;
        F.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f1158b = i;
        InterfaceC0228d interfaceC0228d = this.f1174u;
        if (interfaceC0228d != null) {
            ((K) interfaceC0228d).f2272n = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        h();
        this.d.setTranslationY(-Math.max(0, Math.min(i, this.d.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0228d interfaceC0228d) {
        this.f1174u = interfaceC0228d;
        if (getWindowToken() != null) {
            ((K) this.f1174u).f2272n = this.f1158b;
            int i = this.f1165l;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = T.f381a;
                F.c(this);
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
        d1 d1Var = (d1) this.f1160e;
        d1Var.d = i != 0 ? l.v(d1Var.f2951a.getContext(), i) : null;
        d1Var.c();
    }

    public void setLogo(int i) {
        k();
        d1 d1Var = (d1) this.f1160e;
        d1Var.f2954e = i != 0 ? l.v(d1Var.f2951a.getContext(), i) : null;
        d1Var.c();
    }

    public void setOverlayMode(boolean z2) {
        this.f1162g = z2;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i) {
    }

    @Override // l.InterfaceC0245l0
    public void setWindowCallback(Window.Callback callback) {
        k();
        ((d1) this.f1160e).f2958k = callback;
    }

    @Override // l.InterfaceC0245l0
    public void setWindowTitle(CharSequence charSequence) {
        k();
        d1 d1Var = (d1) this.f1160e;
        if (d1Var.f2956g) {
            return;
        }
        d1Var.h = charSequence;
        if ((d1Var.f2952b & 8) != 0) {
            Toolbar toolbar = d1Var.f2951a;
            toolbar.setTitle(charSequence);
            if (d1Var.f2956g) {
                T.m(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0230e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        d1 d1Var = (d1) this.f1160e;
        d1Var.d = drawable;
        d1Var.c();
    }
}
