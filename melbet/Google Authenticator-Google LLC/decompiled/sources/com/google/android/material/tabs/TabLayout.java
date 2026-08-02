package com.google.android.material.tabs;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.apps.authenticator2.R;
import defpackage.aah;
import defpackage.aqu;
import defpackage.brn;
import defpackage.bst;
import defpackage.em;
import defpackage.fes;
import defpackage.fhq;
import defpackage.fhr;
import defpackage.fik;
import defpackage.fjw;
import defpackage.fny;
import defpackage.fob;
import defpackage.fpa;
import defpackage.fpr;
import defpackage.fps;
import defpackage.fpt;
import defpackage.fpu;
import defpackage.fpw;
import defpackage.fpx;
import defpackage.fpy;
import defpackage.frj;
import defpackage.wq;
import defpackage.wr;
import defpackage.ws;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class TabLayout extends HorizontalScrollView {
    private static final wq E = new ws(16);
    public final ArrayList A;
    aqu B;
    public int C;
    public fhq D;
    private final ArrayList F;
    private fpx G;
    private int H;
    private final int I;
    private final int J;
    private final int K;
    private int L;
    private ValueAnimator M;
    private boolean N;
    private final wq O;
    private fhq P;
    public int a;
    final fpw b;
    public int c;
    public int d;
    public int e;
    public int f;
    public final int g;
    public final int h;
    public int i;
    public ColorStateList j;
    public ColorStateList k;
    public Drawable l;
    public float m;
    public float n;
    public float o;
    public final int p;
    public int q;
    public int r;
    int s;
    public int t;
    public int u;
    public boolean v;
    public boolean w;
    int x;
    public boolean y;
    public final TimeInterpolator z;

    /* JADX WARN: Code restructure failed: missing block: B:64:0x028c, code lost:
    
        if (r12 != 2) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TabLayout(Context context, AttributeSet attributeSet, int i) {
        super(frj.a(context, attributeSet, i, R.style.Widget_Design_TabLayout), attributeSet, i);
        fhq fprVar;
        this.a = -1;
        this.F = new ArrayList();
        this.i = -1;
        this.H = 0;
        this.q = Integer.MAX_VALUE;
        this.x = -1;
        this.A = new ArrayList();
        this.O = new wr(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        fpw fpwVar = new fpw(this, context2);
        this.b = fpwVar;
        super.addView(fpwVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray a = fjw.a(context2, attributeSet, fpt.a, i, R.style.Widget_Design_TabLayout, 24);
        ColorStateList b = fhr.b(getBackground());
        if (b != null) {
            fob fobVar = new fob();
            fobVar.M(b);
            fobVar.J(context2);
            fobVar.L(getElevation());
            setBackground(fobVar);
        }
        Drawable f = fny.f(context2, a, 5);
        Drawable mutate = (f == null ? new GradientDrawable() : f).mutate();
        this.l = mutate;
        fhr.e(mutate, this.H);
        int i2 = this.x;
        fpwVar.b(i2 == -1 ? this.l.getIntrinsicHeight() : i2);
        int color = a.getColor(8, 0);
        this.H = color;
        fhr.e(this.l, color);
        i(false);
        fpwVar.b(a.getDimensionPixelSize(11, -1));
        int i3 = a.getInt(10, 0);
        if (this.t != i3) {
            this.t = i3;
            fpwVar.postInvalidateOnAnimation();
        }
        int i4 = a.getInt(7, 0);
        if (i4 != 0) {
            if (i4 == 1) {
                fprVar = new fpr();
            } else {
                if (i4 != 2) {
                    throw new IllegalArgumentException(i4 + " is not a valid TabIndicatorAnimationMode");
                }
                fprVar = new fps();
            }
            this.D = fprVar;
        } else {
            this.D = new fhq((byte[]) null);
        }
        this.w = a.getBoolean(9, true);
        fpwVar.a();
        fpwVar.postInvalidateOnAnimation();
        int dimensionPixelSize = a.getDimensionPixelSize(16, 0);
        this.f = dimensionPixelSize;
        this.e = dimensionPixelSize;
        this.d = dimensionPixelSize;
        this.c = dimensionPixelSize;
        this.c = a.getDimensionPixelSize(19, dimensionPixelSize);
        this.d = a.getDimensionPixelSize(20, this.d);
        this.e = a.getDimensionPixelSize(18, this.e);
        this.f = a.getDimensionPixelSize(17, this.f);
        this.g = true != fny.m(context2, R.attr.isMaterial3Theme, false) ? R.attr.textAppearanceButton : R.attr.textAppearanceTitleSmall;
        int resourceId = a.getResourceId(24, R.style.TextAppearance_Design_Tab);
        this.h = resourceId;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(resourceId, em.x);
        try {
            this.m = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.j = fny.e(context2, obtainStyledAttributes, 3);
            obtainStyledAttributes.recycle();
            if (a.hasValue(22)) {
                this.i = a.getResourceId(22, resourceId);
            }
            int i5 = this.i;
            if (i5 != -1) {
                obtainStyledAttributes = context2.obtainStyledAttributes(i5, em.x);
                try {
                    this.n = obtainStyledAttributes.getDimensionPixelSize(0, (int) this.m);
                    ColorStateList e = fny.e(context2, obtainStyledAttributes, 3);
                    if (e != null) {
                        this.j = l(this.j.getDefaultColor(), e.getColorForState(new int[]{android.R.attr.state_selected}, e.getDefaultColor()));
                    }
                } finally {
                }
            }
            if (a.hasValue(25)) {
                this.j = fny.e(context2, a, 25);
            }
            if (a.hasValue(23)) {
                this.j = l(this.j.getDefaultColor(), a.getColor(23, 0));
            }
            fny.e(context2, a, 3);
            a.getInt(4, -1);
            this.k = fny.e(context2, a, 21);
            this.s = a.getInt(6, 300);
            this.z = fny.p(context2, R.attr.motionEasingEmphasizedInterpolator, fes.b);
            this.I = a.getDimensionPixelSize(14, -1);
            this.J = a.getDimensionPixelSize(13, -1);
            this.p = a.getResourceId(0, 0);
            this.L = a.getDimensionPixelSize(1, 0);
            this.u = a.getInt(15, 1);
            this.r = a.getInt(2, 0);
            this.v = a.getBoolean(12, false);
            this.y = a.getBoolean(26, false);
            a.recycle();
            Resources resources = getResources();
            this.o = resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.K = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            int i6 = this.u;
            fpwVar.setPaddingRelative((i6 == 0 || i6 == 2) ? Math.max(0, this.L - this.c) : 0, 0, 0, 0);
            int i7 = this.u;
            if (i7 == 0) {
                int i8 = this.r;
                if (i8 == 0) {
                    Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
                } else if (i8 == 1) {
                    fpwVar.setGravity(1);
                }
                fpwVar.setGravity(8388611);
            } else if (i7 == 1 || i7 == 2) {
                if (this.r == 2) {
                    Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
                }
                fpwVar.setGravity(1);
            }
            i(true);
        } finally {
        }
    }

    private final int j(int i, float f) {
        fpw fpwVar;
        View childAt;
        int i2 = this.u;
        if ((i2 != 0 && i2 != 2) || (childAt = (fpwVar = this.b).getChildAt(i)) == null) {
            return 0;
        }
        int i3 = i + 1;
        View childAt2 = i3 < fpwVar.getChildCount() ? fpwVar.getChildAt(i3) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i4 = (int) ((width + width2) * 0.5f * f);
        return getLayoutDirection() == 0 ? left + i4 : left - i4;
    }

    private final int k() {
        int i = this.I;
        if (i != -1) {
            return i;
        }
        int i2 = this.u;
        if (i2 == 0 || i2 == 2) {
            return this.K;
        }
        return 0;
    }

    private static ColorStateList l(int i, int i2) {
        return new ColorStateList(new int[][]{SELECTED_STATE_SET, EMPTY_STATE_SET}, new int[]{i2, i});
    }

    private final void m(View view) {
        if (!(view instanceof fpu)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        fpu fpuVar = (fpu) view;
        fpx d = d();
        CharSequence charSequence = fpuVar.a;
        Drawable drawable = fpuVar.b;
        int i = fpuVar.c;
        if (!TextUtils.isEmpty(fpuVar.getContentDescription())) {
            d.b = fpuVar.getContentDescription();
            fpy fpyVar = d.g;
            if (fpyVar != null) {
                fpyVar.b();
            }
        }
        e(d, this.F.isEmpty());
    }

    private final void n(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null && isLaidOut()) {
            fpw fpwVar = this.b;
            int childCount = fpwVar.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (fpwVar.getChildAt(i2).getWidth() > 0) {
                }
            }
            int scrollX = getScrollX();
            int j = j(i, 0.0f);
            if (scrollX != j) {
                if (this.M == null) {
                    ValueAnimator valueAnimator = new ValueAnimator();
                    this.M = valueAnimator;
                    valueAnimator.setInterpolator(this.z);
                    this.M.setDuration(this.s);
                    this.M.addUpdateListener(new fpa(this, 5));
                }
                this.M.setIntValues(scrollX, j);
                this.M.start();
            }
            int i3 = this.s;
            ValueAnimator valueAnimator2 = fpwVar.a;
            if (valueAnimator2 != null && valueAnimator2.isRunning() && fpwVar.b.a != i) {
                fpwVar.a.cancel();
            }
            fpwVar.d(true, i, i3);
            return;
        }
        h(i, 0.0f, true, true, true);
    }

    private final void o(int i) {
        fpw fpwVar = this.b;
        int childCount = fpwVar.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = fpwVar.getChildAt(i2);
                boolean z = i2 == i;
                if ((i2 != i || childAt.isSelected()) && (i2 == i || !childAt.isSelected())) {
                    childAt.setSelected(z);
                    childAt.setActivated(z);
                } else {
                    childAt.setSelected(z);
                    childAt.setActivated(z);
                    if (childAt instanceof fpy) {
                        ((fpy) childAt).c();
                    }
                }
                i2++;
            }
        }
    }

    private final void p(LinearLayout.LayoutParams layoutParams) {
        if (this.u == 1 && this.r == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
    }

    private final boolean q() {
        int i = this.u;
        return i == 0 || i == 2;
    }

    private final void r(aqu aquVar, boolean z) {
        if (this.B != null && this.P != null) {
            throw null;
        }
        if (aquVar == null) {
            this.B = null;
            f();
            this.N = z;
        } else {
            this.B = aquVar;
            if (this.P != null) {
                throw null;
            }
            this.P = new fhq(this);
            throw null;
        }
    }

    public final int a() {
        fpx fpxVar = this.G;
        if (fpxVar != null) {
            return fpxVar.c;
        }
        return -1;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        m(view);
    }

    public final int b() {
        return this.F.size();
    }

    public final fpx c(int i) {
        if (i < 0 || i >= b()) {
            return null;
        }
        return (fpx) this.F.get(i);
    }

    public final fpx d() {
        fpx fpxVar = (fpx) E.a();
        if (fpxVar == null) {
            fpxVar = new fpx();
        }
        fpxVar.f = this;
        wq wqVar = this.O;
        fpy fpyVar = wqVar != null ? (fpy) wqVar.a() : null;
        if (fpyVar == null) {
            fpyVar = new fpy(this, getContext());
        }
        fpyVar.a(fpxVar);
        fpyVar.setFocusable(true);
        fpyVar.setMinimumWidth(k());
        if (TextUtils.isEmpty(fpxVar.b)) {
            fpyVar.setContentDescription(null);
        } else {
            fpyVar.setContentDescription(fpxVar.b);
        }
        fpxVar.g = fpyVar;
        if (fpxVar.h != -1) {
            fpxVar.g.setId(0);
        }
        return fpxVar;
    }

    public final void e(fpx fpxVar, boolean z) {
        ArrayList arrayList = this.F;
        int size = arrayList.size();
        if (fpxVar.f != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        fpxVar.c = size;
        arrayList.add(size, fpxVar);
        int size2 = arrayList.size();
        int i = -1;
        for (int i2 = size + 1; i2 < size2; i2++) {
            if (((fpx) arrayList.get(i2)).c == this.a) {
                i = i2;
            }
            ((fpx) arrayList.get(i2)).c = i2;
        }
        this.a = i;
        fpy fpyVar = fpxVar.g;
        fpyVar.setSelected(false);
        fpyVar.setActivated(false);
        fpw fpwVar = this.b;
        int i3 = fpxVar.c;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        p(layoutParams);
        fpwVar.addView(fpyVar, i3, layoutParams);
        if (z) {
            fpxVar.a();
        }
    }

    public final void f() {
        fpw fpwVar = this.b;
        for (int childCount = fpwVar.getChildCount() - 1; childCount >= 0; childCount--) {
            fpy fpyVar = (fpy) fpwVar.getChildAt(childCount);
            fpwVar.removeViewAt(childCount);
            if (fpyVar != null) {
                fpyVar.a(null);
                fpyVar.setSelected(false);
                this.O.b(fpyVar);
            }
            requestLayout();
        }
        Iterator it = this.F.iterator();
        while (it.hasNext()) {
            fpx fpxVar = (fpx) it.next();
            it.remove();
            fpxVar.f = null;
            fpxVar.g = null;
            fpxVar.h = -1;
            fpxVar.a = null;
            fpxVar.b = null;
            fpxVar.c = -1;
            fpxVar.d = null;
            E.b(fpxVar);
        }
        this.G = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
    
        if (r0.c == (-1)) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(fpx fpxVar, boolean z) {
        TabLayout tabLayout;
        fpx fpxVar2 = this.G;
        if (fpxVar2 == fpxVar) {
            if (fpxVar2 != null) {
                ArrayList arrayList = this.A;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                }
                n(fpxVar.c);
                return;
            }
            return;
        }
        int i = fpxVar != null ? fpxVar.c : -1;
        if (z) {
            if (fpxVar2 == null) {
                fpxVar2 = null;
            }
            if (i != -1) {
                tabLayout = this;
                tabLayout.h(i, 0.0f, true, true, true);
                if (i != -1) {
                    tabLayout.o(i);
                }
            } else {
                i = -1;
                tabLayout = this;
                tabLayout.n(i);
                if (i != -1) {
                }
            }
        } else {
            tabLayout = this;
        }
        tabLayout.G = fpxVar;
        if (fpxVar2 != null && fpxVar2.f != null) {
            ArrayList arrayList2 = tabLayout.A;
            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            }
        }
        if (fpxVar != null) {
            ArrayList arrayList3 = tabLayout.A;
            for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                ((ViewPager2) ((bst) arrayList3.get(size3)).a).h(fpxVar.c);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public final void h(int i, float f, boolean z, boolean z2, boolean z3) {
        float f2 = i + f;
        int round = Math.round(f2);
        if (round >= 0) {
            fpw fpwVar = this.b;
            if (round >= fpwVar.getChildCount()) {
                return;
            }
            if (z2) {
                fpwVar.b.a = Math.round(f2);
                ValueAnimator valueAnimator = fpwVar.a;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    fpwVar.a.cancel();
                }
                fpwVar.c(fpwVar.getChildAt(i), fpwVar.getChildAt(i + 1), f);
            }
            ValueAnimator valueAnimator2 = this.M;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.M.cancel();
            }
            int j = j(i, f);
            int scrollX = getScrollX();
            boolean z4 = (i < a() && j >= scrollX) || (i > a() && j <= scrollX) || i == a();
            if (getLayoutDirection() == 1) {
                z4 = (i < a() && j <= scrollX) || (i > a() && j >= scrollX) || i == a();
            }
            if (z4 || this.C == 1 || z3) {
                if (i < 0) {
                    j = 0;
                }
                scrollTo(j, 0);
            }
            if (z) {
                o(round);
            }
        }
    }

    public final void i(boolean z) {
        int i = 0;
        while (true) {
            fpw fpwVar = this.b;
            if (i >= fpwVar.getChildCount()) {
                return;
            }
            View childAt = fpwVar.getChildAt(i);
            childAt.setMinimumWidth(k());
            p((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
            i++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        fhq.x(this);
        if (this.B == null) {
            ViewParent parent = getParent();
            if (parent instanceof aqu) {
                r((aqu) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.N) {
            r(null, false);
            this.N = false;
        }
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        fpy fpyVar;
        Drawable drawable;
        int i = 0;
        while (true) {
            fpw fpwVar = this.b;
            if (i >= fpwVar.getChildCount()) {
                super.onDraw(canvas);
                return;
            }
            View childAt = fpwVar.getChildAt(i);
            if ((childAt instanceof fpy) && (drawable = (fpyVar = (fpy) childAt).c) != null) {
                drawable.setBounds(fpyVar.getLeft(), fpyVar.getTop(), fpyVar.getRight(), fpyVar.getBottom());
                drawable.draw(canvas);
            }
            i++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        new aah(accessibilityNodeInfo).q(brn.ab(1, b(), 1));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return q() && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        ArrayList arrayList = this.F;
        Context context = getContext();
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
        }
        int round = Math.round(fik.c(context, 48));
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(round + getPaddingTop() + getPaddingBottom(), 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i2) >= round) {
            getChildAt(0).setMinimumHeight(round);
        }
        int size2 = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int i4 = this.J;
            if (i4 <= 0) {
                i4 = (int) (size2 - fik.c(getContext(), 56));
            }
            this.q = i4;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i5 = this.u;
            if (i5 != 0) {
                if (i5 == 1) {
                    if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                        return;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
                }
                if (i5 != 2) {
                    return;
                }
            }
            if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || q()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        fhq.w(this, f);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return Math.max(0, ((this.b.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight()) > 0;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
        m(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m(view);
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.tabStyle);
    }

    public TabLayout(Context context) {
        this(context, null);
    }
}
