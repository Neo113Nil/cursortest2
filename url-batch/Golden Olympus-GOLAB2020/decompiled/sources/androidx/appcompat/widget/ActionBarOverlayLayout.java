package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.j;
import androidx.core.graphics.Insets;
import androidx.core.view.AbstractC1281a0;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e.AbstractC2405a;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC1276z, androidx.core.view.G, androidx.core.view.H {

    /* renamed from: G, reason: collision with root package name */
    static final int[] f10489G = {AbstractC2405a.f36188b, R.attr.windowContentOverlay};

    /* renamed from: H, reason: collision with root package name */
    private static final WindowInsetsCompat f10490H = new WindowInsetsCompat.Builder().setSystemWindowInsets(Insets.of(0, 1, 0, 1)).build();

    /* renamed from: I, reason: collision with root package name */
    private static final Rect f10491I = new Rect();

    /* renamed from: A, reason: collision with root package name */
    ViewPropertyAnimator f10492A;

    /* renamed from: B, reason: collision with root package name */
    final AnimatorListenerAdapter f10493B;

    /* renamed from: C, reason: collision with root package name */
    private final Runnable f10494C;

    /* renamed from: D, reason: collision with root package name */
    private final Runnable f10495D;

    /* renamed from: E, reason: collision with root package name */
    private final androidx.core.view.I f10496E;

    /* renamed from: F, reason: collision with root package name */
    private final f f10497F;

    /* renamed from: a, reason: collision with root package name */
    private int f10498a;

    /* renamed from: b, reason: collision with root package name */
    private int f10499b;

    /* renamed from: c, reason: collision with root package name */
    private ContentFrameLayout f10500c;

    /* renamed from: d, reason: collision with root package name */
    ActionBarContainer f10501d;

    /* renamed from: e, reason: collision with root package name */
    private A f10502e;

    /* renamed from: f, reason: collision with root package name */
    private Drawable f10503f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f10504g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f10505h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f10506i;

    /* renamed from: j, reason: collision with root package name */
    boolean f10507j;

    /* renamed from: k, reason: collision with root package name */
    private int f10508k;

    /* renamed from: l, reason: collision with root package name */
    private int f10509l;

    /* renamed from: m, reason: collision with root package name */
    private final Rect f10510m;

    /* renamed from: n, reason: collision with root package name */
    private final Rect f10511n;

    /* renamed from: o, reason: collision with root package name */
    private final Rect f10512o;

    /* renamed from: p, reason: collision with root package name */
    private final Rect f10513p;

    /* renamed from: q, reason: collision with root package name */
    private final Rect f10514q;

    /* renamed from: r, reason: collision with root package name */
    private final Rect f10515r;

    /* renamed from: s, reason: collision with root package name */
    private final Rect f10516s;

    /* renamed from: t, reason: collision with root package name */
    private final Rect f10517t;

    /* renamed from: u, reason: collision with root package name */
    private WindowInsetsCompat f10518u;

    /* renamed from: v, reason: collision with root package name */
    private WindowInsetsCompat f10519v;

    /* renamed from: w, reason: collision with root package name */
    private WindowInsetsCompat f10520w;

    /* renamed from: x, reason: collision with root package name */
    private WindowInsetsCompat f10521x;

    /* renamed from: y, reason: collision with root package name */
    private d f10522y;

    /* renamed from: z, reason: collision with root package name */
    private OverScroller f10523z;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f10492A = null;
            actionBarOverlayLayout.f10507j = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f10492A = null;
            actionBarOverlayLayout.f10507j = false;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.p();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f10492A = actionBarOverlayLayout.f10501d.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f10493B);
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.p();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f10492A = actionBarOverlayLayout.f10501d.animate().translationY(-ActionBarOverlayLayout.this.f10501d.getHeight()).setListener(ActionBarOverlayLayout.this.f10493B);
        }
    }

    public interface d {
        void a();

        void b();

        void c(boolean z4);

        void d();

        void e();

        void f(int i4);
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(int i4, int i5) {
            super(i4, i5);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    private static final class f extends View {
        f(Context context) {
            super(context);
            setWillNotDraw(true);
        }

        @Override // android.view.View
        public int getWindowSystemUiVisibility() {
            return 0;
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10499b = 0;
        this.f10510m = new Rect();
        this.f10511n = new Rect();
        this.f10512o = new Rect();
        this.f10513p = new Rect();
        this.f10514q = new Rect();
        this.f10515r = new Rect();
        this.f10516s = new Rect();
        this.f10517t = new Rect();
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.CONSUMED;
        this.f10518u = windowInsetsCompat;
        this.f10519v = windowInsetsCompat;
        this.f10520w = windowInsetsCompat;
        this.f10521x = windowInsetsCompat;
        this.f10493B = new a();
        this.f10494C = new b();
        this.f10495D = new c();
        q(context);
        this.f10496E = new androidx.core.view.I(this);
        f fVar = new f(context);
        this.f10497F = fVar;
        addView(fVar);
    }

    private void j() {
        p();
        this.f10495D.run();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean k(View view, Rect rect, boolean z4, boolean z5, boolean z6, boolean z7) {
        boolean z8;
        e eVar = (e) view.getLayoutParams();
        if (z4) {
            int i4 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
            int i5 = rect.left;
            if (i4 != i5) {
                ((ViewGroup.MarginLayoutParams) eVar).leftMargin = i5;
                z8 = true;
                if (z5) {
                    int i6 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                    int i7 = rect.top;
                    if (i6 != i7) {
                        ((ViewGroup.MarginLayoutParams) eVar).topMargin = i7;
                        z8 = true;
                    }
                }
                if (z7) {
                    int i8 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
                    int i9 = rect.right;
                    if (i8 != i9) {
                        ((ViewGroup.MarginLayoutParams) eVar).rightMargin = i9;
                        z8 = true;
                    }
                }
                if (z6) {
                    int i10 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                    int i11 = rect.bottom;
                    if (i10 != i11) {
                        ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = i11;
                        return true;
                    }
                }
                return z8;
            }
        }
        z8 = false;
        if (z5) {
        }
        if (z7) {
        }
        if (z6) {
        }
        return z8;
    }

    private boolean l() {
        AbstractC1281a0.f(this.f10497F, f10490H, this.f10513p);
        return !this.f10513p.equals(f10491I);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private A o(View view) {
        if (view instanceof A) {
            return (A) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    private void q(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f10489G);
        this.f10498a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f10503f = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f10523z = new OverScroller(context);
    }

    private void s() {
        p();
        postDelayed(this.f10495D, 600L);
    }

    private void t() {
        p();
        postDelayed(this.f10494C, 600L);
    }

    private void v() {
        p();
        this.f10494C.run();
    }

    private boolean w(float f4) {
        this.f10523z.fling(0, 0, 0, (int) f4, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f10523z.getFinalY() > this.f10501d.getHeight();
    }

    @Override // androidx.appcompat.widget.InterfaceC1276z
    public void a(Menu menu, j.a aVar) {
        u();
        this.f10502e.a(menu, aVar);
    }

    @Override // androidx.appcompat.widget.InterfaceC1276z
    public boolean b() {
        u();
        return this.f10502e.b();
    }

    @Override // androidx.appcompat.widget.InterfaceC1276z
    public void c() {
        u();
        this.f10502e.c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // androidx.appcompat.widget.InterfaceC1276z
    public boolean d() {
        u();
        return this.f10502e.d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f10503f != null) {
            int bottom = this.f10501d.getVisibility() == 0 ? (int) (this.f10501d.getBottom() + this.f10501d.getTranslationY() + 0.5f) : 0;
            this.f10503f.setBounds(0, bottom, getWidth(), this.f10503f.getIntrinsicHeight() + bottom);
            this.f10503f.draw(canvas);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC1276z
    public boolean e() {
        u();
        return this.f10502e.e();
    }

    @Override // androidx.appcompat.widget.InterfaceC1276z
    public boolean f() {
        u();
        return this.f10502e.f();
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.InterfaceC1276z
    public boolean g() {
        u();
        return this.f10502e.g();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f10501d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f10496E.a();
    }

    public CharSequence getTitle() {
        u();
        return this.f10502e.getTitle();
    }

    @Override // androidx.appcompat.widget.InterfaceC1276z
    public void h(int i4) {
        u();
        if (i4 == 2) {
            this.f10502e.u();
        } else if (i4 == 5) {
            this.f10502e.v();
        } else {
            if (i4 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC1276z
    public void i() {
        u();
        this.f10502e.h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        u();
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(windowInsets, this);
        boolean k4 = k(this.f10501d, new Rect(windowInsetsCompat.getSystemWindowInsetLeft(), windowInsetsCompat.getSystemWindowInsetTop(), windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom()), true, true, false, true);
        AbstractC1281a0.f(this, windowInsetsCompat, this.f10510m);
        Rect rect = this.f10510m;
        WindowInsetsCompat inset = windowInsetsCompat.inset(rect.left, rect.top, rect.right, rect.bottom);
        this.f10518u = inset;
        boolean z4 = true;
        if (!this.f10519v.equals(inset)) {
            this.f10519v = this.f10518u;
            k4 = true;
        }
        if (this.f10511n.equals(this.f10510m)) {
            z4 = k4;
        } else {
            this.f10511n.set(this.f10510m);
        }
        if (z4) {
            requestLayout();
        }
        return windowInsetsCompat.consumeDisplayCutout().consumeSystemWindowInsets().consumeStableInsets().toWindowInsets();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        q(getContext());
        AbstractC1281a0.l0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i9 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i10 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i9, i10, measuredWidth + i9, measuredHeight + i10);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        int measuredHeight;
        u();
        measureChildWithMargins(this.f10501d, i4, 0, i5, 0);
        e eVar = (e) this.f10501d.getLayoutParams();
        int max = Math.max(0, this.f10501d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int max2 = Math.max(0, this.f10501d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f10501d.getMeasuredState());
        boolean z4 = (AbstractC1281a0.M(this) & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0;
        if (z4) {
            measuredHeight = this.f10498a;
            if (this.f10505h && this.f10501d.getTabContainer() != null) {
                measuredHeight += this.f10498a;
            }
        } else {
            measuredHeight = this.f10501d.getVisibility() != 8 ? this.f10501d.getMeasuredHeight() : 0;
        }
        this.f10512o.set(this.f10510m);
        this.f10520w = this.f10518u;
        if (this.f10504g || z4 || !l()) {
            this.f10520w = new WindowInsetsCompat.Builder(this.f10520w).setSystemWindowInsets(Insets.of(this.f10520w.getSystemWindowInsetLeft(), this.f10520w.getSystemWindowInsetTop() + measuredHeight, this.f10520w.getSystemWindowInsetRight(), this.f10520w.getSystemWindowInsetBottom())).build();
        } else {
            Rect rect = this.f10512o;
            rect.top += measuredHeight;
            rect.bottom = rect.bottom;
            this.f10520w = this.f10520w.inset(0, measuredHeight, 0, 0);
        }
        k(this.f10500c, this.f10512o, true, true, true, true);
        if (!this.f10521x.equals(this.f10520w)) {
            WindowInsetsCompat windowInsetsCompat = this.f10520w;
            this.f10521x = windowInsetsCompat;
            AbstractC1281a0.g(this.f10500c, windowInsetsCompat);
        }
        measureChildWithMargins(this.f10500c, i4, 0, i5, 0);
        e eVar2 = (e) this.f10500c.getLayoutParams();
        int max3 = Math.max(max, this.f10500c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int max4 = Math.max(max2, this.f10500c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f10500c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i4, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i5, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f4, float f5, boolean z4) {
        if (!this.f10506i || !z4) {
            return false;
        }
        if (w(f5)) {
            j();
        } else {
            v();
        }
        this.f10507j = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f4, float f5) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i4, int i5, int[] iArr) {
    }

    @Override // androidx.core.view.H
    public void onNestedScroll(View view, int i4, int i5, int i6, int i7, int i8, int[] iArr) {
        onNestedScroll(view, i4, i5, i6, i7, i8);
    }

    @Override // androidx.core.view.G
    public void onNestedScrollAccepted(View view, View view2, int i4, int i5) {
        if (i5 == 0) {
            onNestedScrollAccepted(view, view2, i4);
        }
    }

    @Override // androidx.core.view.G
    public boolean onStartNestedScroll(View view, View view2, int i4, int i5) {
        return i5 == 0 && onStartNestedScroll(view, view2, i4);
    }

    @Override // androidx.core.view.G
    public void onStopNestedScroll(View view, int i4) {
        if (i4 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i4) {
        super.onWindowSystemUiVisibilityChanged(i4);
        u();
        int i5 = this.f10509l ^ i4;
        this.f10509l = i4;
        boolean z4 = (i4 & 4) == 0;
        boolean z5 = (i4 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0;
        d dVar = this.f10522y;
        if (dVar != null) {
            dVar.c(!z5);
            if (z4 || !z5) {
                this.f10522y.a();
            } else {
                this.f10522y.d();
            }
        }
        if ((i5 & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 0 || this.f10522y == null) {
            return;
        }
        AbstractC1281a0.l0(this);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i4) {
        super.onWindowVisibilityChanged(i4);
        this.f10499b = i4;
        d dVar = this.f10522y;
        if (dVar != null) {
            dVar.f(i4);
        }
    }

    void p() {
        removeCallbacks(this.f10494C);
        removeCallbacks(this.f10495D);
        ViewPropertyAnimator viewPropertyAnimator = this.f10492A;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public boolean r() {
        return this.f10504g;
    }

    public void setActionBarHideOffset(int i4) {
        p();
        this.f10501d.setTranslationY(-Math.max(0, Math.min(i4, this.f10501d.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.f10522y = dVar;
        if (getWindowToken() != null) {
            this.f10522y.f(this.f10499b);
            int i4 = this.f10509l;
            if (i4 != 0) {
                onWindowSystemUiVisibilityChanged(i4);
                AbstractC1281a0.l0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z4) {
        this.f10505h = z4;
    }

    public void setHideOnContentScrollEnabled(boolean z4) {
        if (z4 != this.f10506i) {
            this.f10506i = z4;
            if (z4) {
                return;
            }
            p();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i4) {
        u();
        this.f10502e.setIcon(i4);
    }

    public void setLogo(int i4) {
        u();
        this.f10502e.m(i4);
    }

    public void setOverlayMode(boolean z4) {
        this.f10504g = z4;
    }

    public void setShowingForActionMode(boolean z4) {
    }

    public void setUiOptions(int i4) {
    }

    @Override // androidx.appcompat.widget.InterfaceC1276z
    public void setWindowCallback(Window.Callback callback) {
        u();
        this.f10502e.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.InterfaceC1276z
    public void setWindowTitle(CharSequence charSequence) {
        u();
        this.f10502e.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    void u() {
        if (this.f10500c == null) {
            this.f10500c = (ContentFrameLayout) findViewById(e.f.f36297b);
            this.f10501d = (ActionBarContainer) findViewById(e.f.f36298c);
            this.f10502e = o(findViewById(e.f.f36296a));
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    @Override // androidx.core.view.G
    public void onNestedPreScroll(View view, int i4, int i5, int[] iArr, int i6) {
        if (i6 == 0) {
            onNestedPreScroll(view, i4, i5, iArr);
        }
    }

    @Override // androidx.core.view.G
    public void onNestedScroll(View view, int i4, int i5, int i6, int i7, int i8) {
        if (i8 == 0) {
            onNestedScroll(view, i4, i5, i6, i7);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i4) {
        this.f10496E.b(view, view2, i4);
        this.f10508k = getActionBarHideOffset();
        p();
        d dVar = this.f10522y;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i4) {
        if ((i4 & 2) == 0 || this.f10501d.getVisibility() != 0) {
            return false;
        }
        return this.f10506i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (this.f10506i && !this.f10507j) {
            if (this.f10508k <= this.f10501d.getHeight()) {
                t();
            } else {
                s();
            }
        }
        d dVar = this.f10522y;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i4, int i5, int i6, int i7) {
        int i8 = this.f10508k + i5;
        this.f10508k = i8;
        setActionBarHideOffset(i8);
    }

    public void setIcon(Drawable drawable) {
        u();
        this.f10502e.setIcon(drawable);
    }
}
