package android.support.v7.widget;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import com.google.android.apps.authenticator2.R;
import defpackage.bo;
import defpackage.el;
import defpackage.fo;
import defpackage.gd;
import defpackage.go;
import defpackage.hb;
import defpackage.hc;
import defpackage.hd;
import defpackage.he;
import defpackage.hk;
import defpackage.jb;
import defpackage.mf;
import defpackage.mk;
import defpackage.vb;
import defpackage.xn;
import defpackage.xo;
import defpackage.xp;
import defpackage.yi;
import defpackage.yq;
import defpackage.zg;
import defpackage.zh;
import defpackage.zi;
import defpackage.zj;
import defpackage.zk;
import defpackage.zl;
import defpackage.zm;
import defpackage.zn;
import defpackage.zz;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ActionBarOverlayLayout extends ViewGroup implements jb, xn, xo {
    static final int[] a = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    private static final zz k;
    private static final Rect l;
    private zz A;
    private zz B;
    private OverScroller C;
    private final Runnable D;
    private final Runnable E;
    private final xp F;
    private final he G;
    private mk H;
    public int b;
    public ActionBarContainer c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public hc h;
    public ViewPropertyAnimator i;
    public final AnimatorListenerAdapter j;
    private int m;
    private ContentFrameLayout n;
    private Drawable o;
    private boolean p;
    private int q;
    private final Rect r;
    private final Rect s;
    private final Rect t;
    private final Rect u;
    private final Rect v;
    private boolean w;
    private boolean x;
    private zz y;
    private zz z;

    static {
        zn zmVar = Build.VERSION.SDK_INT >= 36 ? new zm() : Build.VERSION.SDK_INT >= 35 ? new zl() : Build.VERSION.SDK_INT >= 34 ? new zk() : Build.VERSION.SDK_INT >= 31 ? new zj() : Build.VERSION.SDK_INT >= 30 ? new zi() : Build.VERSION.SDK_INT >= 29 ? new zh() : new zg();
        zmVar.c(new vb(0, 1, 0, 1));
        k = zmVar.a();
        l = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.r = new Rect();
        this.s = new Rect();
        this.t = new Rect();
        this.u = new Rect();
        this.v = new Rect();
        this.w = true;
        this.x = false;
        zz zzVar = zz.a;
        this.y = zzVar;
        this.z = zzVar;
        this.A = zzVar;
        this.B = zzVar;
        this.j = new hb(this);
        this.D = new bo(this, 7, null);
        this.E = new bo(this, 8, null);
        v(context);
        this.F = new xp();
        he heVar = new he(context);
        this.G = heVar;
        addView(heVar);
    }

    private final void v(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(a);
        this.m = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.o = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.C = new OverScroller(context);
    }

    private static final boolean w(View view, int i, int i2, int i3, int i4) {
        boolean z;
        hd hdVar = (hd) view.getLayoutParams();
        if (hdVar.leftMargin != i) {
            hdVar.leftMargin = i;
            z = true;
        } else {
            z = false;
        }
        if (hdVar.topMargin != i2) {
            hdVar.topMargin = i2;
            z = true;
        }
        if (hdVar.rightMargin != i3) {
            hdVar.rightMargin = i3;
            z = true;
        }
        if (hdVar.bottomMargin == i4) {
            return z;
        }
        hdVar.bottomMargin = i4;
        return true;
    }

    @Override // defpackage.jb
    public final void a() {
        i();
        this.H.c();
    }

    public final void b() {
        removeCallbacks(this.D);
        removeCallbacks(this.E);
        ViewPropertyAnimator viewPropertyAnimator = this.i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // defpackage.jb
    public final void c(int i) {
        i();
        if (i != 109) {
            return;
        }
        this.d = true;
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof hd;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.o != null) {
            int bottom = this.c.getVisibility() == 0 ? (int) (this.c.getBottom() + this.c.getTranslationY() + 0.5f) : 0;
            this.o.setBounds(0, bottom, getWidth(), this.o.getIntrinsicHeight() + bottom);
            this.o.draw(canvas);
        }
    }

    @Override // defpackage.xn
    public final void e(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // defpackage.xo
    public final void f(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        e(view, i, i2, i3, i4, i5);
    }

    @Override // defpackage.xn
    public final void g(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new hd();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new hd(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.F.a();
    }

    @Override // defpackage.xn
    public final void h(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    final void i() {
        if (this.n == null) {
            this.n = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.c = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View findViewById = findViewById(R.id.action_bar);
            if (!(findViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(String.valueOf(findViewById.getClass().getSimpleName())));
            }
            this.H = ((Toolbar) findViewById).z();
        }
    }

    public final void j(int i) {
        b();
        this.c.setTranslationY(-Math.max(0, Math.min(i, this.c.getHeight())));
    }

    public final void k(boolean z) {
        if (z != this.p) {
            this.p = z;
            if (z) {
                return;
            }
            b();
            j(0);
        }
    }

    @Override // defpackage.jb
    public final void l(Menu menu, go goVar) {
        i();
        mk mkVar = this.H;
        hk hkVar = mkVar.f;
        if (hkVar == null) {
            mkVar.f = new hk(mkVar.a.getContext());
            hkVar = mkVar.f;
            hkVar.g = R.id.action_menu_presenter;
        }
        hkVar.e = goVar;
        Toolbar toolbar = mkVar.a;
        if (menu == null && toolbar.a == null) {
            return;
        }
        toolbar.l();
        gd gdVar = toolbar.a.a;
        if (gdVar != menu) {
            if (gdVar != null) {
                gdVar.m(toolbar.s);
                gdVar.m(toolbar.t);
            }
            if (toolbar.t == null) {
                toolbar.t = new mf(toolbar);
            }
            hkVar.q();
            if (menu != null) {
                gd gdVar2 = (gd) menu;
                gdVar2.h(hkVar, toolbar.i);
                gdVar2.h(toolbar.t, toolbar.i);
            } else {
                hkVar.c(toolbar.i, null);
                toolbar.t.c(toolbar.i, null);
                hkVar.j();
                toolbar.t.j();
            }
            toolbar.a.j(toolbar.j);
            toolbar.a.k(hkVar);
            toolbar.s = hkVar;
            toolbar.v();
        }
    }

    @Override // defpackage.jb
    public final void m() {
        i();
        this.H.f();
    }

    @Override // defpackage.jb
    public final void n(Window.Callback callback) {
        i();
        this.H.d = callback;
    }

    @Override // defpackage.jb
    public final void o(CharSequence charSequence) {
        i();
        this.H.j(charSequence);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00aa, code lost:
    
        if (r4 != false) goto L31;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        boolean w;
        i();
        int windowSystemUiVisibility = getWindowSystemUiVisibility();
        int i = windowSystemUiVisibility & 256;
        int i2 = windowSystemUiVisibility & 1536;
        zz zzVar = k;
        int i3 = yq.a;
        he heVar = this.G;
        Rect rect = this.v;
        yi.a(heVar, zzVar, rect);
        boolean equals = rect.equals(l);
        this.w = !equals;
        boolean z = true;
        boolean z2 = i != 0;
        boolean z3 = equals || (z2 && i2 != 0);
        this.x = z3;
        hc hcVar = this.h;
        if (hcVar != null) {
            ((el) hcVar).j = (z2 || z3) ? false : true;
        }
        zz q = zz.q(windowInsets, this);
        vb i4 = q.i();
        Rect rect2 = this.u;
        int i5 = i4.b;
        int i6 = i4.c;
        int i7 = i4.d;
        rect2.set(i5, i6, i7, i4.e);
        if (this.x) {
            vb f = q.f(2);
            int i8 = f.b;
            int i9 = f.d;
            this.c.setPadding(i5 - i8, i6, i7 - i9, 0);
            w = w(this.c, i8, 0, i9, 0);
        } else {
            this.c.setPadding(0, 0, 0, 0);
            w = w(this.c, i5, i6, i7, 0);
        }
        Rect rect3 = this.r;
        yi.a(this, q, rect3);
        zz o = q.o(rect3.left, rect3.top, rect3.right, rect3.bottom);
        this.y = o;
        if (this.z.equals(o)) {
            z = w;
        } else {
            this.z = this.y;
        }
        Rect rect4 = this.s;
        if (!rect4.equals(rect3)) {
            rect4.set(rect3);
        }
        requestLayout();
        return q.l().n().m().e();
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        v(getContext());
        int i = yq.a;
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                hd hdVar = (hd) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = hdVar.leftMargin + paddingLeft;
                int i7 = hdVar.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int measuredHeight;
        i();
        measureChildWithMargins(this.c, i, 0, i2, 0);
        hd hdVar = (hd) this.c.getLayoutParams();
        int max = Math.max(0, this.c.getMeasuredWidth() + hdVar.leftMargin + hdVar.rightMargin);
        int max2 = Math.max(0, this.c.getMeasuredHeight() + hdVar.topMargin + hdVar.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.c.getMeasuredState());
        int i3 = yq.a;
        boolean z = (getWindowSystemUiVisibility() & 256) != 0;
        if (z) {
            measuredHeight = this.m;
            if (this.x) {
                measuredHeight += this.u.top;
            }
        } else {
            measuredHeight = this.c.getVisibility() != 8 ? this.c.getMeasuredHeight() : 0;
        }
        Rect rect = this.t;
        rect.set(this.r);
        zz zzVar = this.y;
        this.A = zzVar;
        if (this.d || z || !this.w) {
            vb d = this.x ? vb.d(zzVar.b(), Math.max(this.A.d(), measuredHeight), this.A.c(), Math.max(this.A.a(), 0)) : vb.d(zzVar.b(), this.A.d() + measuredHeight, this.A.c(), this.A.a());
            zz zzVar2 = this.A;
            zn zmVar = Build.VERSION.SDK_INT >= 36 ? new zm(zzVar2) : Build.VERSION.SDK_INT >= 35 ? new zl(zzVar2) : Build.VERSION.SDK_INT >= 34 ? new zk(zzVar2) : Build.VERSION.SDK_INT >= 31 ? new zj(zzVar2) : Build.VERSION.SDK_INT >= 30 ? new zi(zzVar2) : Build.VERSION.SDK_INT >= 29 ? new zh(zzVar2) : new zg(zzVar2);
            zmVar.c(d);
            this.A = zmVar.a();
        } else {
            if (this.x) {
                rect.top = Math.max(rect.top, measuredHeight);
                rect.bottom = Math.max(rect.bottom, 0);
            } else {
                rect.top += measuredHeight;
                rect.bottom = rect.bottom;
            }
            this.A = this.A.o(0, measuredHeight, 0, 0);
        }
        w(this.n, rect.left, rect.top, rect.right, rect.bottom);
        if (!this.B.equals(this.A)) {
            zz zzVar3 = this.A;
            this.B = zzVar3;
            yq.q(this.n, zzVar3);
        }
        measureChildWithMargins(this.n, i, 0, i2, 0);
        hd hdVar2 = (hd) this.n.getLayoutParams();
        int max3 = Math.max(max, this.n.getMeasuredWidth() + hdVar2.leftMargin + hdVar2.rightMargin);
        int max4 = Math.max(max2, this.n.getMeasuredHeight() + hdVar2.topMargin + hdVar2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.n.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.p || !z) {
            return false;
        }
        this.C.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.C.getFinalY() > this.c.getHeight()) {
            b();
            this.E.run();
        } else {
            b();
            this.D.run();
        }
        this.f = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.q + i2;
        this.q = i5;
        j(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        el elVar;
        fo foVar;
        this.F.b(i, 0);
        ActionBarContainer actionBarContainer = this.c;
        this.q = actionBarContainer != null ? -((int) actionBarContainer.getTranslationY()) : 0;
        b();
        hc hcVar = this.h;
        if (hcVar == null || (foVar = (elVar = (el) hcVar).l) == null) {
            return;
        }
        foVar.a();
        elVar.l = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.c.getVisibility() != 0) {
            return false;
        }
        return this.p;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.p || this.f) {
            return;
        }
        if (this.q <= this.c.getHeight()) {
            b();
            postDelayed(this.D, 600L);
        } else {
            b();
            postDelayed(this.E, 600L);
        }
    }

    @Override // android.view.View
    @Deprecated
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        i();
        int i2 = this.g ^ i;
        this.g = i;
        hc hcVar = this.h;
        if (hcVar != null) {
            boolean z = (i & 256) != 0;
            int i3 = i & 4;
            el elVar = (el) hcVar;
            elVar.j = (z || this.x) ? false : true;
            if (i3 == 0 || !z) {
                if (elVar.k) {
                    elVar.k = false;
                    elVar.y(true);
                }
            } else if (!elVar.k) {
                elVar.k = true;
                elVar.y(true);
            }
        }
        if ((i2 & 256) == 0 || this.h == null) {
            return;
        }
        int i4 = yq.a;
        requestApplyInsets();
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.b = i;
        hc hcVar = this.h;
        if (hcVar != null) {
            ((el) hcVar).i = i;
        }
    }

    @Override // defpackage.jb
    public final boolean p() {
        ActionMenuView actionMenuView;
        i();
        Toolbar toolbar = this.H.a;
        return toolbar.getVisibility() == 0 && (actionMenuView = toolbar.a) != null && actionMenuView.b;
    }

    @Override // defpackage.jb
    public final boolean q() {
        i();
        return this.H.l();
    }

    @Override // defpackage.jb
    public final boolean r() {
        hk hkVar;
        i();
        ActionMenuView actionMenuView = this.H.a.a;
        if (actionMenuView == null || (hkVar = actionMenuView.c) == null) {
            return false;
        }
        return hkVar.m != null || hkVar.m();
    }

    @Override // defpackage.jb
    public final boolean s() {
        i();
        return this.H.m();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // defpackage.xn
    public final boolean t(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // defpackage.jb
    public final boolean u() {
        i();
        return this.H.n();
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new hd(layoutParams);
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // defpackage.xn
    public final void d(View view, int i, int i2, int[] iArr, int i3) {
    }
}
