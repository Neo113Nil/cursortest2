package androidx.appcompat.widget;

import E.AbstractC0024z;
import E.H;
import E.InterfaceC0015p;
import E.InterfaceC0016q;
import E.r;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import com.rockchicken.pump.up.road.R;
import g.AbstractC0432a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import k.C1204b;
import k.C1210e;
import k.InterfaceC1208d;
import k.InterfaceC1236w;
import k.RunnableC1206c;
import k.n0;
import k.t0;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0015p, InterfaceC0016q {

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f4342y = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* renamed from: a, reason: collision with root package name */
    public int f4343a;

    /* renamed from: b, reason: collision with root package name */
    public ContentFrameLayout f4344b;

    /* renamed from: c, reason: collision with root package name */
    public ActionBarContainer f4345c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC1236w f4346d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f4347e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4348f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4349g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4350h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4351i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4352j;

    /* renamed from: k, reason: collision with root package name */
    public int f4353k;

    /* renamed from: l, reason: collision with root package name */
    public final Rect f4354l;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f4355m;
    public final Rect n;
    public final Rect o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f4356p;

    /* renamed from: q, reason: collision with root package name */
    public final Rect f4357q;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f4358r;

    /* renamed from: s, reason: collision with root package name */
    public OverScroller f4359s;

    /* renamed from: t, reason: collision with root package name */
    public ViewPropertyAnimator f4360t;

    /* renamed from: u, reason: collision with root package name */
    public final C1204b f4361u;
    public final RunnableC1206c v;

    /* renamed from: w, reason: collision with root package name */
    public final RunnableC1206c f4362w;

    /* renamed from: x, reason: collision with root package name */
    public final r f4363x;

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4354l = new Rect();
        this.f4355m = new Rect();
        this.n = new Rect();
        this.o = new Rect();
        this.f4356p = new Rect();
        this.f4357q = new Rect();
        this.f4358r = new Rect();
        this.f4361u = new C1204b(0, this);
        this.v = new RunnableC1206c(this, 0);
        this.f4362w = new RunnableC1206c(this, 1);
        i(context);
        this.f4363x = new r();
    }

    public static boolean g(View view, Rect rect, boolean z) {
        boolean z4;
        C1210e c1210e = (C1210e) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) c1210e).leftMargin;
        int i5 = rect.left;
        if (i4 != i5) {
            ((ViewGroup.MarginLayoutParams) c1210e).leftMargin = i5;
            z4 = true;
        } else {
            z4 = false;
        }
        int i6 = ((ViewGroup.MarginLayoutParams) c1210e).topMargin;
        int i7 = rect.top;
        if (i6 != i7) {
            ((ViewGroup.MarginLayoutParams) c1210e).topMargin = i7;
            z4 = true;
        }
        int i8 = ((ViewGroup.MarginLayoutParams) c1210e).rightMargin;
        int i9 = rect.right;
        if (i8 != i9) {
            ((ViewGroup.MarginLayoutParams) c1210e).rightMargin = i9;
            z4 = true;
        }
        if (z) {
            int i10 = ((ViewGroup.MarginLayoutParams) c1210e).bottomMargin;
            int i11 = rect.bottom;
            if (i10 != i11) {
                ((ViewGroup.MarginLayoutParams) c1210e).bottomMargin = i11;
                return true;
            }
        }
        return z4;
    }

    @Override // E.InterfaceC0015p
    public final void a(ViewGroup viewGroup, int i4, int i5, int i6, int i7, int i8) {
        if (i8 == 0) {
            onNestedScroll(viewGroup, i4, i5, i6, i7);
        }
    }

    @Override // E.InterfaceC0016q
    public final void b(ViewGroup viewGroup, int i4, int i5, int i6, int i7, int i8, int[] iArr) {
        a(viewGroup, i4, i5, i6, i7, i8);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1210e;
    }

    @Override // E.InterfaceC0015p
    public final boolean d(View view, View view2, int i4, int i5) {
        return i5 == 0 && onStartNestedScroll(view, view2, i4);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i4;
        super.draw(canvas);
        if (this.f4347e == null || this.f4348f) {
            return;
        }
        if (this.f4345c.getVisibility() == 0) {
            i4 = (int) (this.f4345c.getTranslationY() + this.f4345c.getBottom() + 0.5f);
        } else {
            i4 = 0;
        }
        this.f4347e.setBounds(0, i4, getWidth(), this.f4347e.getIntrinsicHeight() + i4);
        this.f4347e.draw(canvas);
    }

    @Override // E.InterfaceC0015p
    public final void e(View view, View view2, int i4, int i5) {
        if (i5 == 0) {
            onNestedScrollAccepted(view, view2, i4);
        }
    }

    @Override // E.InterfaceC0015p
    public final void f(View view, int i4) {
        if (i4 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        j();
        Field field = H.f375a;
        getWindowSystemUiVisibility();
        boolean g4 = g(this.f4345c, rect, false);
        Rect rect2 = this.o;
        rect2.set(rect);
        Method method = t0.f14107a;
        Rect rect3 = this.f4354l;
        if (method != null) {
            try {
                method.invoke(this, rect2, rect3);
            } catch (Exception e4) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e4);
            }
        }
        Rect rect4 = this.f4356p;
        if (!rect4.equals(rect2)) {
            rect4.set(rect2);
            g4 = true;
        }
        Rect rect5 = this.f4355m;
        if (!rect5.equals(rect3)) {
            rect5.set(rect3);
            g4 = true;
        }
        if (g4) {
            requestLayout();
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C1210e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1210e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f4345c;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        r rVar = this.f4363x;
        return rVar.f438c | rVar.f437b;
    }

    public CharSequence getTitle() {
        j();
        return ((n0) this.f4346d).f14052a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.v);
        removeCallbacks(this.f4362w);
        ViewPropertyAnimator viewPropertyAnimator = this.f4360t;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f4342y);
        this.f4343a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f4347e = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f4348f = context.getApplicationInfo().targetSdkVersion < 19;
        this.f4359s = new OverScroller(context);
    }

    public final void j() {
        InterfaceC1236w wrapper;
        if (this.f4344b == null) {
            this.f4344b = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f4345c = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof InterfaceC1236w) {
                wrapper = (InterfaceC1236w) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f4346d = wrapper;
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        Field field = H.f375a;
        AbstractC0024z.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i4, int i5, int i6, int i7) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C1210e c1210e = (C1210e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i9 = ((ViewGroup.MarginLayoutParams) c1210e).leftMargin + paddingLeft;
                int i10 = ((ViewGroup.MarginLayoutParams) c1210e).topMargin + paddingTop;
                childAt.layout(i9, i10, measuredWidth + i9, measuredHeight + i10);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i5) {
        j();
        measureChildWithMargins(this.f4345c, i4, 0, i5, 0);
        C1210e c1210e = (C1210e) this.f4345c.getLayoutParams();
        int i6 = 0;
        int max = Math.max(0, this.f4345c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c1210e).leftMargin + ((ViewGroup.MarginLayoutParams) c1210e).rightMargin);
        int max2 = Math.max(0, this.f4345c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1210e).topMargin + ((ViewGroup.MarginLayoutParams) c1210e).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f4345c.getMeasuredState());
        Field field = H.f375a;
        boolean z = (getWindowSystemUiVisibility() & 256) != 0;
        if (z) {
            i6 = this.f4343a;
            if (this.f4350h && this.f4345c.getTabContainer() != null) {
                i6 += this.f4343a;
            }
        } else if (this.f4345c.getVisibility() != 8) {
            i6 = this.f4345c.getMeasuredHeight();
        }
        Rect rect = this.f4354l;
        Rect rect2 = this.n;
        rect2.set(rect);
        Rect rect3 = this.o;
        Rect rect4 = this.f4357q;
        rect4.set(rect3);
        if (this.f4349g || z) {
            rect4.top += i6;
            rect4.bottom = rect4.bottom;
        } else {
            rect2.top += i6;
            rect2.bottom = rect2.bottom;
        }
        g(this.f4344b, rect2, true);
        Rect rect5 = this.f4358r;
        if (!rect5.equals(rect4)) {
            rect5.set(rect4);
            this.f4344b.a(rect4);
        }
        measureChildWithMargins(this.f4344b, i4, 0, i5, 0);
        C1210e c1210e2 = (C1210e) this.f4344b.getLayoutParams();
        int max3 = Math.max(max, this.f4344b.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c1210e2).leftMargin + ((ViewGroup.MarginLayoutParams) c1210e2).rightMargin);
        int max4 = Math.max(max2, this.f4344b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1210e2).topMargin + ((ViewGroup.MarginLayoutParams) c1210e2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f4344b.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i4, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i5, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f4, float f5, boolean z) {
        if (!this.f4351i || !z) {
            return false;
        }
        this.f4359s.fling(0, 0, 0, (int) f5, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f4359s.getFinalY() > this.f4345c.getHeight()) {
            h();
            this.f4362w.run();
        } else {
            h();
            this.v.run();
        }
        this.f4352j = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f4, float f5) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i4, int i5, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i4, int i5, int i6, int i7) {
        int i8 = this.f4353k + i5;
        this.f4353k = i8;
        setActionBarHideOffset(i8);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i4) {
        this.f4363x.f437b = i4;
        this.f4353k = getActionBarHideOffset();
        h();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i4) {
        if ((i4 & 2) == 0 || this.f4345c.getVisibility() != 0) {
            return false;
        }
        return this.f4351i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f4351i || this.f4352j) {
            return;
        }
        if (this.f4353k <= this.f4345c.getHeight()) {
            h();
            postDelayed(this.v, 600L);
        } else {
            h();
            postDelayed(this.f4362w, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i4) {
        super.onWindowSystemUiVisibilityChanged(i4);
        j();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i4) {
        super.onWindowVisibilityChanged(i4);
    }

    public void setActionBarHideOffset(int i4) {
        h();
        this.f4345c.setTranslationY(-Math.max(0, Math.min(i4, this.f4345c.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC1208d interfaceC1208d) {
        if (getWindowToken() != null) {
            throw null;
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f4350h = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f4351i) {
            this.f4351i = z;
            if (z) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i4) {
        j();
        n0 n0Var = (n0) this.f4346d;
        n0Var.f14055d = i4 != 0 ? AbstractC0432a.a(n0Var.f14052a.getContext(), i4) : null;
        n0Var.c();
    }

    public void setLogo(int i4) {
        j();
        n0 n0Var = (n0) this.f4346d;
        n0Var.f14056e = i4 != 0 ? AbstractC0432a.a(n0Var.f14052a.getContext(), i4) : null;
        n0Var.c();
    }

    public void setOverlayMode(boolean z) {
        this.f4349g = z;
        this.f4348f = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i4) {
    }

    public void setWindowCallback(Window.Callback callback) {
        j();
        ((n0) this.f4346d).f14062k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        j();
        n0 n0Var = (n0) this.f4346d;
        if (n0Var.f14058g) {
            return;
        }
        n0Var.f14059h = charSequence;
        if ((n0Var.f14053b & 8) != 0) {
            n0Var.f14052a.setTitle(charSequence);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C1210e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        j();
        n0 n0Var = (n0) this.f4346d;
        n0Var.f14055d = drawable;
        n0Var.c();
    }

    @Override // E.InterfaceC0015p
    public final void c(int i4, int i5, int i6, int[] iArr) {
    }
}
