package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import c5.k;
import com.snovikpovik.vuevnxsj.R;
import h0.a;
import i3.c;
import j0.o0;
import java.lang.reflect.Field;
import l.b;
import l.d;
import l.e;
import l.i2;
import l.q0;
import q3.a0;
import q3.a1;
import q3.c0;
import q3.i1;
import q3.k0;
import q3.l1;
import q3.n;
import q3.o;
import q3.v0;
import q3.w0;
import q3.x0;
import q3.y0;
import q3.z0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements n, o {
    public static final int[] C = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public static final l1 D;
    public static final Rect E;
    public final o0 A;
    public final e B;

    /* renamed from: d, reason: collision with root package name */
    public int f377d;

    /* renamed from: e, reason: collision with root package name */
    public ContentFrameLayout f378e;

    /* renamed from: f, reason: collision with root package name */
    public ActionBarContainer f379f;

    /* renamed from: g, reason: collision with root package name */
    public q0 f380g;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f381h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f382j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f383k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f384l;

    /* renamed from: m, reason: collision with root package name */
    public int f385m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f386n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f387o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f388p;

    /* renamed from: q, reason: collision with root package name */
    public final Rect f389q;

    /* renamed from: r, reason: collision with root package name */
    public l1 f390r;

    /* renamed from: s, reason: collision with root package name */
    public l1 f391s;

    /* renamed from: t, reason: collision with root package name */
    public l1 f392t;

    /* renamed from: u, reason: collision with root package name */
    public l1 f393u;

    /* renamed from: v, reason: collision with root package name */
    public OverScroller f394v;

    /* renamed from: w, reason: collision with root package name */
    public ViewPropertyAnimator f395w;

    /* renamed from: x, reason: collision with root package name */
    public final k f396x;

    /* renamed from: y, reason: collision with root package name */
    public final b f397y;

    /* renamed from: z, reason: collision with root package name */
    public final b f398z;

    static {
        int i = Build.VERSION.SDK_INT;
        a1 z0Var = i >= 34 ? new z0() : i >= 31 ? new y0() : i >= 30 ? new x0() : i >= 29 ? new w0() : new v0();
        z0Var.g(c.b(0, 1, 0, 1));
        D = z0Var.b();
        E = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f386n = new Rect();
        this.f387o = new Rect();
        this.f388p = new Rect();
        this.f389q = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        l1 l1Var = l1.f6126b;
        this.f390r = l1Var;
        this.f391s = l1Var;
        this.f392t = l1Var;
        this.f393u = l1Var;
        this.f396x = new k(3, this);
        this.f397y = new b(this, 0);
        this.f398z = new b(this, 1);
        i(context);
        this.A = new o0();
        e eVar = new e(context);
        eVar.setWillNotDraw(true);
        this.B = eVar;
        addView(eVar);
    }

    public static boolean g(View view, Rect rect, boolean z3) {
        boolean z7;
        d dVar = (d) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) dVar).leftMargin;
        int i8 = rect.left;
        if (i != i8) {
            ((ViewGroup.MarginLayoutParams) dVar).leftMargin = i8;
            z7 = true;
        } else {
            z7 = false;
        }
        int i9 = ((ViewGroup.MarginLayoutParams) dVar).topMargin;
        int i10 = rect.top;
        if (i9 != i10) {
            ((ViewGroup.MarginLayoutParams) dVar).topMargin = i10;
            z7 = true;
        }
        int i11 = ((ViewGroup.MarginLayoutParams) dVar).rightMargin;
        int i12 = rect.right;
        if (i11 != i12) {
            ((ViewGroup.MarginLayoutParams) dVar).rightMargin = i12;
            z7 = true;
        }
        if (z3) {
            int i13 = ((ViewGroup.MarginLayoutParams) dVar).bottomMargin;
            int i14 = rect.bottom;
            if (i13 != i14) {
                ((ViewGroup.MarginLayoutParams) dVar).bottomMargin = i14;
                return true;
            }
        }
        return z7;
    }

    @Override // q3.n
    public final void a(View view, View view2, int i, int i8) {
        if (i8 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // q3.n
    public final void b(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d;
    }

    @Override // q3.o
    public final void d(View view, int i, int i8, int i9, int i10, int i11, int[] iArr) {
        e(view, i, i8, i9, i10, i11);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f381h != null) {
            if (this.f379f.getVisibility() == 0) {
                i = (int) (this.f379f.getTranslationY() + this.f379f.getBottom() + 0.5f);
            } else {
                i = 0;
            }
            this.f381h.setBounds(0, i, getWidth(), this.f381h.getIntrinsicHeight() + i);
            this.f381h.draw(canvas);
        }
    }

    @Override // q3.n
    public final void e(View view, int i, int i8, int i9, int i10, int i11) {
        if (i11 == 0) {
            onNestedScroll(view, i, i8, i9, i10);
        }
    }

    @Override // q3.n
    public final boolean f(View view, View view2, int i, int i8) {
        return i8 == 0 && onStartNestedScroll(view, view2, i);
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
        ActionBarContainer actionBarContainer = this.f379f;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        o0 o0Var = this.A;
        return o0Var.f3810b | o0Var.f3809a;
    }

    public CharSequence getTitle() {
        j();
        return ((i2) this.f380g).f4278a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f397y);
        removeCallbacks(this.f398z);
        ViewPropertyAnimator viewPropertyAnimator = this.f395w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(C);
        this.f377d = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f381h = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f394v = new OverScroller(context);
    }

    public final void j() {
        q0 wrapper;
        if (this.f378e == null) {
            this.f378e = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f379f = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof q0) {
                wrapper = (q0) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f380g = wrapper;
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        j();
        l1 d8 = l1.d(this, windowInsets);
        i1 i1Var = d8.f6127a;
        boolean g3 = g(this.f379f, new Rect(i1Var.k().f3421a, d8.a(), i1Var.k().f3423c, i1Var.k().f3424d), false);
        Field field = k0.f6120a;
        Rect rect = this.f386n;
        c0.b(this, d8, rect);
        l1 m7 = i1Var.m(rect.left, rect.top, rect.right, rect.bottom);
        this.f390r = m7;
        boolean z3 = true;
        if (!this.f391s.equals(m7)) {
            this.f391s = this.f390r;
            g3 = true;
        }
        Rect rect2 = this.f387o;
        if (rect2.equals(rect)) {
            z3 = g3;
        } else {
            rect2.set(rect);
        }
        if (z3) {
            requestLayout();
        }
        return i1Var.a().f6127a.c().f6127a.b().c();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        Field field = k0.f6120a;
        a0.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i8, int i9, int i10) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = ((ViewGroup.MarginLayoutParams) dVar).leftMargin + paddingLeft;
                int i13 = ((ViewGroup.MarginLayoutParams) dVar).topMargin + paddingTop;
                childAt.layout(i12, i13, measuredWidth + i12, measuredHeight + i13);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x011c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i8) {
        int measuredHeight;
        j();
        measureChildWithMargins(this.f379f, i, 0, i8, 0);
        d dVar = (d) this.f379f.getLayoutParams();
        int max = Math.max(0, this.f379f.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) dVar).leftMargin + ((ViewGroup.MarginLayoutParams) dVar).rightMargin);
        int max2 = Math.max(0, this.f379f.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) dVar).topMargin + ((ViewGroup.MarginLayoutParams) dVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f379f.getMeasuredState());
        Field field = k0.f6120a;
        boolean z3 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z3) {
            measuredHeight = this.f377d;
            if (this.f382j && this.f379f.getTabContainer() != null) {
                measuredHeight += this.f377d;
            }
        } else {
            measuredHeight = this.f379f.getVisibility() != 8 ? this.f379f.getMeasuredHeight() : 0;
        }
        Rect rect = this.f386n;
        Rect rect2 = this.f388p;
        rect2.set(rect);
        this.f392t = this.f390r;
        if (!this.i && !z3) {
            e eVar = this.B;
            l1 l1Var = D;
            Rect rect3 = this.f389q;
            c0.b(eVar, l1Var, rect3);
            if (!rect3.equals(E)) {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.f392t = this.f392t.f6127a.m(0, measuredHeight, 0, 0);
                g(this.f378e, rect2, true);
                if (!this.f393u.equals(this.f392t)) {
                    l1 l1Var2 = this.f392t;
                    this.f393u = l1Var2;
                    k0.a(this.f378e, l1Var2);
                }
                measureChildWithMargins(this.f378e, i, 0, i8, 0);
                d dVar2 = (d) this.f378e.getLayoutParams();
                int max3 = Math.max(max, this.f378e.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) dVar2).leftMargin + ((ViewGroup.MarginLayoutParams) dVar2).rightMargin);
                int max4 = Math.max(max2, this.f378e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) dVar2).topMargin + ((ViewGroup.MarginLayoutParams) dVar2).bottomMargin);
                int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f378e.getMeasuredState());
                setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i8, combineMeasuredStates2 << 16));
            }
        }
        c b8 = c.b(this.f392t.f6127a.k().f3421a, this.f392t.a() + measuredHeight, this.f392t.f6127a.k().f3423c, this.f392t.f6127a.k().f3424d);
        l1 l1Var3 = this.f392t;
        int i9 = Build.VERSION.SDK_INT;
        a1 z0Var = i9 >= 34 ? new z0(l1Var3) : i9 >= 31 ? new y0(l1Var3) : i9 >= 30 ? new x0(l1Var3) : i9 >= 29 ? new w0(l1Var3) : new v0(l1Var3);
        z0Var.g(b8);
        this.f392t = z0Var.b();
        g(this.f378e, rect2, true);
        if (!this.f393u.equals(this.f392t)) {
        }
        measureChildWithMargins(this.f378e, i, 0, i8, 0);
        d dVar22 = (d) this.f378e.getLayoutParams();
        int max32 = Math.max(max, this.f378e.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) dVar22).leftMargin + ((ViewGroup.MarginLayoutParams) dVar22).rightMargin);
        int max42 = Math.max(max2, this.f378e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) dVar22).topMargin + ((ViewGroup.MarginLayoutParams) dVar22).bottomMargin);
        int combineMeasuredStates22 = View.combineMeasuredStates(combineMeasuredStates, this.f378e.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max32, getSuggestedMinimumWidth()), i, combineMeasuredStates22), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max42, getSuggestedMinimumHeight()), i8, combineMeasuredStates22 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f6, float f8, boolean z3) {
        if (!this.f383k || !z3) {
            return false;
        }
        this.f394v.fling(0, 0, 0, (int) f8, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f394v.getFinalY() > this.f379f.getHeight()) {
            h();
            this.f398z.run();
        } else {
            h();
            this.f397y.run();
        }
        this.f384l = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f6, float f8) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i8, int i9, int i10) {
        int i11 = this.f385m + i8;
        this.f385m = i11;
        setActionBarHideOffset(i11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.A.f3809a = i;
        this.f385m = getActionBarHideOffset();
        h();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f379f.getVisibility() != 0) {
            return false;
        }
        return this.f383k;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f383k || this.f384l) {
            return;
        }
        if (this.f385m <= this.f379f.getHeight()) {
            h();
            postDelayed(this.f397y, 600L);
        } else {
            h();
            postDelayed(this.f398z, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        j();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    public void setActionBarHideOffset(int i) {
        h();
        this.f379f.setTranslationY(-Math.max(0, Math.min(i, this.f379f.getHeight())));
    }

    public void setActionBarVisibilityCallback(l.c cVar) {
        if (getWindowToken() != null) {
            throw null;
        }
    }

    public void setHasNonEmbeddedTabs(boolean z3) {
        this.f382j = z3;
    }

    public void setHideOnContentScrollEnabled(boolean z3) {
        if (z3 != this.f383k) {
            this.f383k = z3;
            if (z3) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        j();
        i2 i2Var = (i2) this.f380g;
        i2Var.f4281d = i != 0 ? a.D(i2Var.f4278a.getContext(), i) : null;
        i2Var.c();
    }

    public void setLogo(int i) {
        j();
        i2 i2Var = (i2) this.f380g;
        i2Var.f4282e = i != 0 ? a.D(i2Var.f4278a.getContext(), i) : null;
        i2Var.c();
    }

    public void setOverlayMode(boolean z3) {
        this.i = z3;
    }

    public void setWindowCallback(Window.Callback callback) {
        j();
        ((i2) this.f380g).f4287k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        j();
        i2 i2Var = (i2) this.f380g;
        if (i2Var.f4284g) {
            return;
        }
        Toolbar toolbar = i2Var.f4278a;
        i2Var.f4285h = charSequence;
        if ((i2Var.f4279b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (i2Var.f4284g) {
                k0.l(toolbar.getRootView(), charSequence);
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
        j();
        i2 i2Var = (i2) this.f380g;
        i2Var.f4281d = drawable;
        i2Var.c();
    }

    public void setShowingForActionMode(boolean z3) {
    }

    public void setUiOptions(int i) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i8, int[] iArr) {
    }

    @Override // q3.n
    public final void c(View view, int i, int i8, int[] iArr, int i9) {
    }
}
