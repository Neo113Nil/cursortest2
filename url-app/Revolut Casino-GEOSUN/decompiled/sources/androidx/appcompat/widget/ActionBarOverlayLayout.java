package androidx.appcompat.widget;

import L.C0038n;
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
import com.aurifaber.valuta.rotatus.signum.modulus.R;
import d.AbstractC0110a;
import h.C0149b;
import h.C0152e;
import h.InterfaceC0151d;
import h.InterfaceC0170x;
import h.RunnableC0150c;
import h.q0;
import h.w0;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import w.AbstractC0268n;
import w.InterfaceC0262h;
import w.InterfaceC0263i;
import w.x;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0262h, InterfaceC0263i {

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f1135C = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* renamed from: A, reason: collision with root package name */
    public final RunnableC0150c f1136A;

    /* renamed from: B, reason: collision with root package name */
    public final C0038n f1137B;

    /* renamed from: e, reason: collision with root package name */
    public int f1138e;

    /* renamed from: f, reason: collision with root package name */
    public ContentFrameLayout f1139f;

    /* renamed from: g, reason: collision with root package name */
    public ActionBarContainer f1140g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC0170x f1141h;

    /* renamed from: i, reason: collision with root package name */
    public Drawable f1142i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1143j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1144k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1145l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1146m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1147n;

    /* renamed from: o, reason: collision with root package name */
    public int f1148o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f1149p;

    /* renamed from: q, reason: collision with root package name */
    public final Rect f1150q;
    public final Rect r;

    /* renamed from: s, reason: collision with root package name */
    public final Rect f1151s;

    /* renamed from: t, reason: collision with root package name */
    public final Rect f1152t;

    /* renamed from: u, reason: collision with root package name */
    public final Rect f1153u;

    /* renamed from: v, reason: collision with root package name */
    public final Rect f1154v;

    /* renamed from: w, reason: collision with root package name */
    public OverScroller f1155w;

    /* renamed from: x, reason: collision with root package name */
    public ViewPropertyAnimator f1156x;

    /* renamed from: y, reason: collision with root package name */
    public final C0149b f1157y;

    /* renamed from: z, reason: collision with root package name */
    public final RunnableC0150c f1158z;

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1149p = new Rect();
        this.f1150q = new Rect();
        this.r = new Rect();
        this.f1151s = new Rect();
        this.f1152t = new Rect();
        this.f1153u = new Rect();
        this.f1154v = new Rect();
        this.f1157y = new C0149b(this);
        this.f1158z = new RunnableC0150c(this, 0);
        this.f1136A = new RunnableC0150c(this, 1);
        i(context);
        this.f1137B = new C0038n(2);
    }

    public static boolean g(View view, Rect rect, boolean z2) {
        boolean z3;
        C0152e c0152e = (C0152e) view.getLayoutParams();
        int i2 = ((ViewGroup.MarginLayoutParams) c0152e).leftMargin;
        int i3 = rect.left;
        if (i2 != i3) {
            ((ViewGroup.MarginLayoutParams) c0152e).leftMargin = i3;
            z3 = true;
        } else {
            z3 = false;
        }
        int i4 = ((ViewGroup.MarginLayoutParams) c0152e).topMargin;
        int i5 = rect.top;
        if (i4 != i5) {
            ((ViewGroup.MarginLayoutParams) c0152e).topMargin = i5;
            z3 = true;
        }
        int i6 = ((ViewGroup.MarginLayoutParams) c0152e).rightMargin;
        int i7 = rect.right;
        if (i6 != i7) {
            ((ViewGroup.MarginLayoutParams) c0152e).rightMargin = i7;
            z3 = true;
        }
        if (z2) {
            int i8 = ((ViewGroup.MarginLayoutParams) c0152e).bottomMargin;
            int i9 = rect.bottom;
            if (i8 != i9) {
                ((ViewGroup.MarginLayoutParams) c0152e).bottomMargin = i9;
                return true;
            }
        }
        return z3;
    }

    @Override // w.InterfaceC0262h
    public final void b(View view, View view2, int i2, int i3) {
        if (i3 == 0) {
            onNestedScrollAccepted(view, view2, i2);
        }
    }

    @Override // w.InterfaceC0262h
    public final void c(ViewGroup viewGroup, int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            onNestedScroll(viewGroup, i2, i3, i4, i5);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0152e;
    }

    @Override // w.InterfaceC0262h
    public final void d(View view, int i2) {
        if (i2 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i2;
        super.draw(canvas);
        if (this.f1142i == null || this.f1143j) {
            return;
        }
        if (this.f1140g.getVisibility() == 0) {
            i2 = (int) (this.f1140g.getTranslationY() + this.f1140g.getBottom() + 0.5f);
        } else {
            i2 = 0;
        }
        this.f1142i.setBounds(0, i2, getWidth(), this.f1142i.getIntrinsicHeight() + i2);
        this.f1142i.draw(canvas);
    }

    @Override // w.InterfaceC0263i
    public final void e(ViewGroup viewGroup, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        c(viewGroup, i2, i3, i4, i5, i6);
    }

    @Override // w.InterfaceC0262h
    public final boolean f(View view, View view2, int i2, int i3) {
        return i3 == 0 && onStartNestedScroll(view, view2, i2);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        j();
        Field field = x.f3075a;
        getWindowSystemUiVisibility();
        boolean g2 = g(this.f1140g, rect, false);
        Rect rect2 = this.f1151s;
        rect2.set(rect);
        Method method = w0.f2322a;
        Rect rect3 = this.f1149p;
        if (method != null) {
            try {
                method.invoke(this, rect2, rect3);
            } catch (Exception e2) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e2);
            }
        }
        Rect rect4 = this.f1152t;
        if (!rect4.equals(rect2)) {
            rect4.set(rect2);
            g2 = true;
        }
        Rect rect5 = this.f1150q;
        if (!rect5.equals(rect3)) {
            rect5.set(rect3);
            g2 = true;
        }
        if (g2) {
            requestLayout();
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0152e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0152e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1140g;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0038n c0038n = this.f1137B;
        return c0038n.f579c | c0038n.f578b;
    }

    public CharSequence getTitle() {
        j();
        return ((q0) this.f1141h).f2256a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f1158z);
        removeCallbacks(this.f1136A);
        ViewPropertyAnimator viewPropertyAnimator = this.f1156x;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1135C);
        this.f1138e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1142i = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f1143j = context.getApplicationInfo().targetSdkVersion < 19;
        this.f1155w = new OverScroller(context);
    }

    public final void j() {
        InterfaceC0170x wrapper;
        if (this.f1139f == null) {
            this.f1139f = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f1140g = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof InterfaceC0170x) {
                wrapper = (InterfaceC0170x) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f1141h = wrapper;
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        Field field = x.f3075a;
        AbstractC0268n.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C0152e c0152e = (C0152e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = ((ViewGroup.MarginLayoutParams) c0152e).leftMargin + paddingLeft;
                int i8 = ((ViewGroup.MarginLayoutParams) c0152e).topMargin + paddingTop;
                childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        j();
        measureChildWithMargins(this.f1140g, i2, 0, i3, 0);
        C0152e c0152e = (C0152e) this.f1140g.getLayoutParams();
        int i4 = 0;
        int max = Math.max(0, this.f1140g.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0152e).leftMargin + ((ViewGroup.MarginLayoutParams) c0152e).rightMargin);
        int max2 = Math.max(0, this.f1140g.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0152e).topMargin + ((ViewGroup.MarginLayoutParams) c0152e).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f1140g.getMeasuredState());
        Field field = x.f3075a;
        boolean z2 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z2) {
            i4 = this.f1138e;
            if (this.f1145l && this.f1140g.getTabContainer() != null) {
                i4 += this.f1138e;
            }
        } else if (this.f1140g.getVisibility() != 8) {
            i4 = this.f1140g.getMeasuredHeight();
        }
        Rect rect = this.f1149p;
        Rect rect2 = this.r;
        rect2.set(rect);
        Rect rect3 = this.f1153u;
        rect3.set(this.f1151s);
        if (this.f1144k || z2) {
            rect3.top += i4;
            rect3.bottom = rect3.bottom;
        } else {
            rect2.top += i4;
            rect2.bottom = rect2.bottom;
        }
        g(this.f1139f, rect2, true);
        Rect rect4 = this.f1154v;
        if (!rect4.equals(rect3)) {
            rect4.set(rect3);
            this.f1139f.a(rect3);
        }
        measureChildWithMargins(this.f1139f, i2, 0, i3, 0);
        C0152e c0152e2 = (C0152e) this.f1139f.getLayoutParams();
        int max3 = Math.max(max, this.f1139f.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0152e2).leftMargin + ((ViewGroup.MarginLayoutParams) c0152e2).rightMargin);
        int max4 = Math.max(max2, this.f1139f.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0152e2).topMargin + ((ViewGroup.MarginLayoutParams) c0152e2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1139f.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i2, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i3, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (!this.f1146m || !z2) {
            return false;
        }
        this.f1155w.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f1155w.getFinalY() > this.f1140g.getHeight()) {
            h();
            this.f1136A.run();
        } else {
            h();
            this.f1158z.run();
        }
        this.f1147n = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        int i6 = this.f1148o + i3;
        this.f1148o = i6;
        setActionBarHideOffset(i6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        this.f1137B.f578b = i2;
        this.f1148o = getActionBarHideOffset();
        h();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        if ((i2 & 2) == 0 || this.f1140g.getVisibility() != 0) {
            return false;
        }
        return this.f1146m;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f1146m || this.f1147n) {
            return;
        }
        if (this.f1148o <= this.f1140g.getHeight()) {
            h();
            postDelayed(this.f1158z, 600L);
        } else {
            h();
            postDelayed(this.f1136A, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i2) {
        super.onWindowSystemUiVisibilityChanged(i2);
        j();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
    }

    public void setActionBarHideOffset(int i2) {
        h();
        this.f1140g.setTranslationY(-Math.max(0, Math.min(i2, this.f1140g.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0151d interfaceC0151d) {
        if (getWindowToken() != null) {
            throw null;
        }
    }

    public void setHasNonEmbeddedTabs(boolean z2) {
        this.f1145l = z2;
    }

    public void setHideOnContentScrollEnabled(boolean z2) {
        if (z2 != this.f1146m) {
            this.f1146m = z2;
            if (z2) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i2) {
        j();
        q0 q0Var = (q0) this.f1141h;
        q0Var.f2259d = i2 != 0 ? AbstractC0110a.a(q0Var.f2256a.getContext(), i2) : null;
        q0Var.c();
    }

    public void setLogo(int i2) {
        j();
        q0 q0Var = (q0) this.f1141h;
        q0Var.f2260e = i2 != 0 ? AbstractC0110a.a(q0Var.f2256a.getContext(), i2) : null;
        q0Var.c();
    }

    public void setOverlayMode(boolean z2) {
        this.f1144k = z2;
        this.f1143j = z2 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i2) {
    }

    public void setWindowCallback(Window.Callback callback) {
        j();
        ((q0) this.f1141h).f2266k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        j();
        q0 q0Var = (q0) this.f1141h;
        if (q0Var.f2262g) {
            return;
        }
        q0Var.f2263h = charSequence;
        if ((q0Var.f2257b & 8) != 0) {
            q0Var.f2256a.setTitle(charSequence);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0152e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        j();
        q0 q0Var = (q0) this.f1141h;
        q0Var.f2259d = drawable;
        q0Var.c();
    }

    @Override // w.InterfaceC0262h
    public final void a(int i2, int i3, int[] iArr, int i4) {
    }
}
