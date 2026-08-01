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
import androidx.core.widget.NestedScrollView;
import com.appsflyer.R;
import com.google.android.gms.internal.measurement.md;
import java.lang.reflect.Field;
import kotlin.collections.i0;
import m.b;
import m.c;
import m.c2;
import m.d;
import m.e;
import m.f;
import m.j0;
import o3.a0;
import o3.c0;
import o3.g;
import o3.h;
import o3.h1;
import o3.k1;
import o3.r0;
import o3.s0;
import o3.t0;
import o3.u;
import o3.u0;
import o3.v0;
import o3.w;
import o3.w0;
import o3.x0;
import o3.y0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements g, h {
    public static final int[] N = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public static final k1 O;
    public static final Rect P;
    public final Rect A;
    public final Rect B;
    public k1 C;
    public k1 D;
    public k1 E;
    public k1 F;
    public OverScroller G;
    public ViewPropertyAnimator H;
    public final b I;
    public final c J;
    public final c K;
    public final md L;
    public final f M;

    /* renamed from: d, reason: collision with root package name */
    public int f415d;

    /* renamed from: e, reason: collision with root package name */
    public ContentFrameLayout f416e;

    /* renamed from: i, reason: collision with root package name */
    public ActionBarContainer f417i;

    /* renamed from: r, reason: collision with root package name */
    public j0 f418r;

    /* renamed from: s, reason: collision with root package name */
    public Drawable f419s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f420t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f421u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f422v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f423w;

    /* renamed from: x, reason: collision with root package name */
    public int f424x;

    /* renamed from: y, reason: collision with root package name */
    public final Rect f425y;

    /* renamed from: z, reason: collision with root package name */
    public final Rect f426z;

    static {
        int i3 = Build.VERSION.SDK_INT;
        y0 x0Var = i3 >= 36 ? new x0() : i3 >= 35 ? new w0() : i3 >= 34 ? new v0() : i3 >= 31 ? new u0() : i3 >= 30 ? new t0() : i3 >= 29 ? new s0() : new r0();
        x0Var.h(h3.b.b(0, 1, 0, 1));
        O = x0Var.b();
        P = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f425y = new Rect();
        this.f426z = new Rect();
        this.A = new Rect();
        this.B = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        k1 k1Var = k1.f7414b;
        this.C = k1Var;
        this.D = k1Var;
        this.E = k1Var;
        this.F = k1Var;
        this.I = new b(this);
        this.J = new c(this, 0);
        this.K = new c(this, 1);
        h(context);
        this.L = new md();
        f fVar = new f(context);
        fVar.setWillNotDraw(true);
        this.M = fVar;
        addView(fVar);
    }

    public static boolean b(View view, Rect rect, boolean z10) {
        boolean z11;
        e eVar = (e) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
        int i10 = rect.left;
        if (i3 != i10) {
            ((ViewGroup.MarginLayoutParams) eVar).leftMargin = i10;
            z11 = true;
        } else {
            z11 = false;
        }
        int i11 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        int i12 = rect.top;
        if (i11 != i12) {
            ((ViewGroup.MarginLayoutParams) eVar).topMargin = i12;
            z11 = true;
        }
        int i13 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
        int i14 = rect.right;
        if (i13 != i14) {
            ((ViewGroup.MarginLayoutParams) eVar).rightMargin = i14;
            z11 = true;
        }
        if (z10) {
            int i15 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            int i16 = rect.bottom;
            if (i15 != i16) {
                ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = i16;
                return true;
            }
        }
        return z11;
    }

    @Override // o3.g
    public final void a(View view, View view2, int i3, int i10) {
        if (i10 == 0) {
            onNestedScrollAccepted(view, view2, i3);
        }
    }

    @Override // o3.g
    public final void c(View view, int i3) {
        if (i3 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // o3.h
    public final void d(NestedScrollView nestedScrollView, int i3, int i10, int i11, int i12, int i13, int[] iArr) {
        f(nestedScrollView, i3, i10, i11, i12, i13);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i3;
        super.draw(canvas);
        if (this.f419s != null) {
            if (this.f417i.getVisibility() == 0) {
                i3 = (int) (this.f417i.getTranslationY() + this.f417i.getBottom() + 0.5f);
            } else {
                i3 = 0;
            }
            this.f419s.setBounds(0, i3, getWidth(), this.f419s.getIntrinsicHeight() + i3);
            this.f419s.draw(canvas);
        }
    }

    @Override // o3.g
    public final void f(NestedScrollView nestedScrollView, int i3, int i10, int i11, int i12, int i13) {
        if (i13 == 0) {
            onNestedScroll(nestedScrollView, i3, i10, i11, i12);
        }
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public final void g() {
        removeCallbacks(this.J);
        removeCallbacks(this.K);
        ViewPropertyAnimator viewPropertyAnimator = this.H;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
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
        ActionBarContainer actionBarContainer = this.f417i;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        md mdVar = this.L;
        return mdVar.f2540b | mdVar.f2539a;
    }

    public CharSequence getTitle() {
        j();
        return ((c2) this.f418r).f6051a.getTitle();
    }

    public final void h(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(N);
        this.f415d = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f419s = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.G = new OverScroller(context);
    }

    @Override // o3.g
    public final boolean i(View view, View view2, int i3, int i10) {
        return i10 == 0 && onStartNestedScroll(view, view2, i3);
    }

    public final void j() {
        j0 wrapper;
        if (this.f416e == null) {
            this.f416e = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f417i = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof j0) {
                wrapper = (j0) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    i0.l("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                    return;
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f418r = wrapper;
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        j();
        k1 c10 = k1.c(windowInsets, this);
        h1 h1Var = c10.f7415a;
        boolean b10 = b(this.f417i, new Rect(h1Var.n().f4443a, h1Var.n().f4444b, h1Var.n().f4445c, h1Var.n().f4446d), false);
        Field field = c0.f7378a;
        Rect rect = this.f425y;
        w.b(this, c10, rect);
        k1 r9 = h1Var.r(rect.left, rect.top, rect.right, rect.bottom);
        this.C = r9;
        boolean z10 = true;
        if (!this.D.equals(r9)) {
            this.D = this.C;
            b10 = true;
        }
        Rect rect2 = this.f426z;
        if (rect2.equals(rect)) {
            z10 = b10;
        } else {
            rect2.set(rect);
        }
        if (z10) {
            requestLayout();
        }
        return h1Var.a().f7415a.c().f7415a.b().b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        h(getContext());
        Field field = c0.f7378a;
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i14 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i15 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i14, i15, measuredWidth + i14, measuredHeight + i15);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0135  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i3, int i10) {
        int measuredHeight;
        j();
        measureChildWithMargins(this.f417i, i3, 0, i10, 0);
        e eVar = (e) this.f417i.getLayoutParams();
        int max = Math.max(0, this.f417i.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int max2 = Math.max(0, this.f417i.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f417i.getMeasuredState());
        Field field = c0.f7378a;
        boolean z10 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z10) {
            measuredHeight = this.f415d;
            if (this.f421u && this.f417i.getTabContainer() != null) {
                measuredHeight += this.f415d;
            }
        } else {
            measuredHeight = this.f417i.getVisibility() != 8 ? this.f417i.getMeasuredHeight() : 0;
        }
        Rect rect = this.f425y;
        Rect rect2 = this.A;
        rect2.set(rect);
        this.E = this.C;
        if (!this.f420t && !z10) {
            f fVar = this.M;
            k1 k1Var = O;
            Rect rect3 = this.B;
            w.b(fVar, k1Var, rect3);
            if (!rect3.equals(P)) {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.E = this.E.f7415a.r(0, measuredHeight, 0, 0);
                b(this.f416e, rect2, true);
                if (!this.F.equals(this.E)) {
                    k1 k1Var2 = this.E;
                    this.F = k1Var2;
                    ContentFrameLayout contentFrameLayout = this.f416e;
                    WindowInsets b10 = k1Var2.b();
                    if (b10 != null) {
                        WindowInsets a9 = Build.VERSION.SDK_INT >= 30 ? a0.a(contentFrameLayout, b10) : u.a(contentFrameLayout, b10);
                        if (!a9.equals(b10)) {
                            k1.c(a9, contentFrameLayout);
                        }
                    }
                }
                measureChildWithMargins(this.f416e, i3, 0, i10, 0);
                e eVar2 = (e) this.f416e.getLayoutParams();
                int max3 = Math.max(max, this.f416e.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
                int max4 = Math.max(max2, this.f416e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
                int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f416e.getMeasuredState());
                setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i3, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i10, combineMeasuredStates2 << 16));
            }
        }
        h3.b b11 = h3.b.b(this.E.f7415a.n().f4443a, this.E.f7415a.n().f4444b + measuredHeight, this.E.f7415a.n().f4445c, this.E.f7415a.n().f4446d);
        k1 k1Var3 = this.E;
        int i11 = Build.VERSION.SDK_INT;
        y0 x0Var = i11 >= 36 ? new x0(k1Var3) : i11 >= 35 ? new w0(k1Var3) : i11 >= 34 ? new v0(k1Var3) : i11 >= 31 ? new u0(k1Var3) : i11 >= 30 ? new t0(k1Var3) : i11 >= 29 ? new s0(k1Var3) : new r0(k1Var3);
        x0Var.h(b11);
        this.E = x0Var.b();
        b(this.f416e, rect2, true);
        if (!this.F.equals(this.E)) {
        }
        measureChildWithMargins(this.f416e, i3, 0, i10, 0);
        e eVar22 = (e) this.f416e.getLayoutParams();
        int max32 = Math.max(max, this.f416e.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar22).leftMargin + ((ViewGroup.MarginLayoutParams) eVar22).rightMargin);
        int max42 = Math.max(max2, this.f416e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar22).topMargin + ((ViewGroup.MarginLayoutParams) eVar22).bottomMargin);
        int combineMeasuredStates22 = View.combineMeasuredStates(combineMeasuredStates, this.f416e.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max32, getSuggestedMinimumWidth()), i3, combineMeasuredStates22), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max42, getSuggestedMinimumHeight()), i10, combineMeasuredStates22 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f3, float f10, boolean z10) {
        if (!this.f422v || !z10) {
            return false;
        }
        this.G.fling(0, 0, 0, (int) f10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.G.getFinalY() > this.f417i.getHeight()) {
            g();
            this.K.run();
        } else {
            g();
            this.J.run();
        }
        this.f423w = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f3, float f10) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i3, int i10, int i11, int i12) {
        int i13 = this.f424x + i10;
        this.f424x = i13;
        setActionBarHideOffset(i13);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i3) {
        this.L.f2539a = i3;
        this.f424x = getActionBarHideOffset();
        g();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i3) {
        if ((i3 & 2) == 0 || this.f417i.getVisibility() != 0) {
            return false;
        }
        return this.f422v;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f422v || this.f423w) {
            return;
        }
        if (this.f424x <= this.f417i.getHeight()) {
            g();
            postDelayed(this.J, 600L);
        } else {
            g();
            postDelayed(this.K, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i3) {
        super.onWindowSystemUiVisibilityChanged(i3);
        j();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i3) {
        super.onWindowVisibilityChanged(i3);
    }

    public void setActionBarHideOffset(int i3) {
        g();
        this.f417i.setTranslationY(-Math.max(0, Math.min(i3, this.f417i.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        if (getWindowToken() != null) {
            throw null;
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.f421u = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.f422v) {
            this.f422v = z10;
            if (z10) {
                return;
            }
            g();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i3) {
        j();
        c2 c2Var = (c2) this.f418r;
        c2Var.f6054d = i3 != 0 ? z4.w.v(c2Var.f6051a.getContext(), i3) : null;
        c2Var.c();
    }

    public void setLogo(int i3) {
        j();
        c2 c2Var = (c2) this.f418r;
        c2Var.f6055e = i3 != 0 ? z4.w.v(c2Var.f6051a.getContext(), i3) : null;
        c2Var.c();
    }

    public void setOverlayMode(boolean z10) {
        this.f420t = z10;
    }

    public void setWindowCallback(Window.Callback callback) {
        j();
        ((c2) this.f418r).getClass();
    }

    public void setWindowTitle(CharSequence charSequence) {
        j();
        c2 c2Var = (c2) this.f418r;
        if (c2Var.g) {
            return;
        }
        Toolbar toolbar = c2Var.f6051a;
        c2Var.f6057h = charSequence;
        if ((c2Var.f6052b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (c2Var.g) {
                c0.e(toolbar.getRootView(), charSequence);
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
        j();
        c2 c2Var = (c2) this.f418r;
        c2Var.f6054d = drawable;
        c2Var.c();
    }

    public void setShowingForActionMode(boolean z10) {
    }

    public void setUiOptions(int i3) {
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    @Override // o3.g
    public final void e(int i3, int i10, int[] iArr, int i11) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i3, int i10, int[] iArr) {
    }
}
