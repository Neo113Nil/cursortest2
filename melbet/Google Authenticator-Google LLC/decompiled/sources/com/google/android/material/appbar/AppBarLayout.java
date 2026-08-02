package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.authenticator2.R;
import defpackage.abn;
import defpackage.edm;
import defpackage.fes;
import defpackage.fey;
import defpackage.fez;
import defpackage.ffa;
import defpackage.ffb;
import defpackage.ffe;
import defpackage.fff;
import defpackage.ffg;
import defpackage.ffi;
import defpackage.fhq;
import defpackage.fhr;
import defpackage.fjw;
import defpackage.fny;
import defpackage.fob;
import defpackage.fpv;
import defpackage.frj;
import defpackage.fwm;
import defpackage.pj;
import defpackage.tu;
import defpackage.tv;
import defpackage.tw;
import defpackage.tz;
import defpackage.xl;
import defpackage.yi;
import defpackage.yq;
import defpackage.zz;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AppBarLayout extends LinearLayout implements tv {
    public boolean a;
    public int b;
    public zz c;
    public boolean d;
    public boolean e;
    public final List f;
    public final LinkedHashSet g;
    public int h;
    public Drawable i;
    public Integer j;
    public final float k;
    private int l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private ColorStateList q;
    private int r;
    private WeakReference s;
    private ValueAnimator t;
    private ValueAnimator.AnimatorUpdateListener u;
    private final long v;
    private final TimeInterpolator w;
    private int[] x;
    private Behavior y;

    public AppBarLayout(Context context, AttributeSet attributeSet, int i) {
        super(frj.a(context, attributeSet, i, R.style.Widget_Design_AppBarLayout), attributeSet, i);
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.b = 0;
        this.f = new ArrayList();
        this.g = new LinkedHashSet();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            int[] iArr = ffi.a;
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        int[] iArr2 = ffi.a;
        Context context3 = getContext();
        TypedArray a = fjw.a(context3, attributeSet, ffi.a, i, R.style.Widget_Design_AppBarLayout, new int[0]);
        try {
            if (a.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, a.getResourceId(0, 0)));
            }
            a.recycle();
            TypedArray a2 = fjw.a(context2, attributeSet, ffg.a, i, R.style.Widget_Design_AppBarLayout, new int[0]);
            this.q = fny.e(context2, a2, 6);
            this.v = fny.i(context2, R.attr.motionDurationMedium2, getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.w = fny.p(context2, R.attr.motionEasingStandardInterpolator, fes.a);
            if (a2.hasValue(4)) {
                j(a2.getBoolean(4, false), false, false);
            }
            if (a2.hasValue(3)) {
                ffi.a(this, a2.getDimensionPixelSize(3, 0));
            }
            setBackground(a2.getDrawable(0));
            if (a2.hasValue(2)) {
                setKeyboardNavigationCluster(a2.getBoolean(2, false));
            }
            if (a2.hasValue(1)) {
                setTouchscreenBlocksFocus(a2.getBoolean(1, false));
            }
            this.k = getResources().getDimension(R.dimen.design_appbar_elevation);
            this.e = a2.getBoolean(5, false);
            this.r = a2.getResourceId(7, -1);
            Drawable drawable = a2.getDrawable(8);
            Drawable drawable2 = this.i;
            if (drawable2 != drawable) {
                Integer num = null;
                if (drawable2 != null) {
                    drawable2.setCallback(null);
                }
                Drawable mutate = drawable != null ? drawable.mutate() : null;
                this.i = mutate;
                if (mutate instanceof fob) {
                    num = Integer.valueOf(((fob) mutate).w);
                } else {
                    ColorStateList b = fhr.b(mutate);
                    if (b != null) {
                        num = Integer.valueOf(b.getDefaultColor());
                    }
                }
                this.j = num;
                Drawable drawable3 = this.i;
                if (drawable3 != null) {
                    if (drawable3.isStateful()) {
                        this.i.setState(getDrawableState());
                    }
                    this.i.setLayoutDirection(getLayoutDirection());
                    this.i.setVisible(getVisibility() == 0, false);
                    this.i.setCallback(this);
                }
                k();
                postInvalidateOnAnimation();
            }
            a2.recycle();
            tu tuVar = new tu(this, 3);
            int i2 = yq.a;
            yi.c(this, tuVar);
        } catch (Throwable th) {
            a.recycle();
            throw th;
        }
    }

    protected static final ffb m(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new ffb((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new ffb((ViewGroup.MarginLayoutParams) layoutParams) : new ffb(layoutParams);
    }

    private final void o() {
        Behavior behavior = this.y;
        ffa ffaVar = null;
        if (behavior != null && this.m != -1 && this.b == 0) {
            ffaVar = behavior.N(abn.c, this);
        }
        this.m = -1;
        this.n = -1;
        this.o = -1;
        if (ffaVar != null) {
            this.y.P(ffaVar, false);
        }
    }

    private final void p(float f, float f2) {
        ValueAnimator valueAnimator = this.t;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        this.t = ofFloat;
        ofFloat.setDuration(this.v);
        this.t.setInterpolator(this.w);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.u;
        if (animatorUpdateListener != null) {
            this.t.addUpdateListener(animatorUpdateListener);
        }
        this.t.start();
    }

    private final boolean q() {
        return this.i != null && e() > 0;
    }

    private final boolean r() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.tv
    public final tw a() {
        Behavior behavior = new Behavior();
        this.y = behavior;
        return behavior;
    }

    public final int b() {
        int i;
        int minimumHeight;
        int i2 = this.n;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                ffb ffbVar = (ffb) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = ffbVar.a;
                if ((i4 & 5) != 5) {
                    if (i3 > 0) {
                        break;
                    }
                } else {
                    int i5 = ffbVar.topMargin + ffbVar.bottomMargin;
                    if ((i4 & 8) != 0) {
                        minimumHeight = childAt.getMinimumHeight();
                    } else if ((i4 & 2) != 0) {
                        minimumHeight = measuredHeight - childAt.getMinimumHeight();
                    } else {
                        i = i5 + measuredHeight;
                        if (childCount == 0 && childAt.getFitsSystemWindows()) {
                            i = Math.min(i, measuredHeight - e());
                        }
                        i3 += i;
                    }
                    i = i5 + minimumHeight;
                    if (childCount == 0) {
                        i = Math.min(i, measuredHeight - e());
                    }
                    i3 += i;
                }
            }
        }
        int max = Math.max(0, i3);
        this.n = max;
        return max;
    }

    final int c() {
        int i = this.o;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                ffb ffbVar = (ffb) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + ffbVar.topMargin + ffbVar.bottomMargin;
                int i4 = ffbVar.a;
                if ((i4 & 1) == 0) {
                    break;
                }
                i3 += measuredHeight;
                if ((i4 & 2) != 0) {
                    i3 -= childAt.getMinimumHeight();
                    break;
                }
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.o = max;
        return max;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ffb;
    }

    public final int d() {
        int e = e();
        int minimumHeight = getMinimumHeight();
        if (minimumHeight != 0) {
            int i = minimumHeight + minimumHeight + e;
            return i < getHeight() ? i : minimumHeight + e;
        }
        int childCount = getChildCount();
        int minimumHeight2 = childCount > 0 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
        if (minimumHeight2 == 0) {
            return getHeight() / 3;
        }
        int i2 = minimumHeight2 + minimumHeight2 + e;
        return i2 < getHeight() ? i2 : minimumHeight2 + e;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (q()) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.l);
            this.i.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.i;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    final int e() {
        zz zzVar = this.c;
        if (zzVar != null) {
            return zzVar.d();
        }
        return 0;
    }

    public final int f() {
        int i = this.m;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                ffb ffbVar = (ffb) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = ffbVar.a;
                if ((i4 & 1) == 0) {
                    break;
                }
                i3 += measuredHeight + ffbVar.topMargin + ffbVar.bottomMargin;
                if (i2 == 0) {
                    if (childAt.getFitsSystemWindows()) {
                        i3 -= e();
                    }
                    i2 = 0;
                }
                if ((i4 & 2) != 0) {
                    i3 -= childAt.getMinimumHeight();
                    break;
                }
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.m = max;
        return max;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final ffb generateLayoutParams(AttributeSet attributeSet) {
        return new ffb(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ffb();
    }

    final void h(int i) {
        this.l = i;
        if (willNotDraw()) {
            return;
        }
        postInvalidateOnAnimation();
    }

    public final void i(boolean z) {
        j(z, isLaidOut(), true);
    }

    public final void j(boolean z, boolean z2, boolean z3) {
        this.b = (true != z ? 2 : 1) | (true != z2 ? 0 : 4) | (true == z3 ? 8 : 0);
        requestLayout();
    }

    public final void k() {
        setWillNotDraw(!q());
    }

    final boolean l(View view) {
        int i;
        if (this.s == null && (i = this.r) != -1) {
            View findViewById = view != null ? view.findViewById(i) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.r);
            }
            if (findViewById != null) {
                this.s = new WeakReference(findViewById);
            }
        }
        WeakReference weakReference = this.s;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    final boolean n(boolean z) {
        if (this.d == z) {
            return false;
        }
        this.d = z;
        refreshDrawableState();
        if (getBackground() instanceof fob) {
            if (this.q != null) {
                p(true != z ? 1.0f : 0.0f, true == z ? 1.0f : 0.0f);
            } else if (this.e) {
                p(z ? 0.0f : this.k, z ? this.k : 0.0f);
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        fhq.x(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] iArr = this.x;
        if (iArr == null) {
            iArr = new int[4];
            this.x = iArr;
        }
        int length = iArr.length;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 4);
        boolean z = this.p;
        boolean z2 = false;
        iArr[0] = true != z ? -2130969965 : R.attr.state_liftable;
        int i2 = -2130969966;
        if (!z) {
            z2 = true;
        } else if (this.d) {
            i2 = R.attr.state_lifted;
        }
        iArr[1] = i2;
        iArr[2] = true != z2 ? R.attr.state_collapsible : -2130969961;
        int i3 = -2130969960;
        if (z && this.d) {
            i3 = R.attr.state_collapsed;
        }
        iArr[3] = i3;
        return mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.s;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.s = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (getFitsSystemWindows() && r()) {
            int e = e();
            int childCount = getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = getChildAt(childCount);
                int i5 = yq.a;
                childAt.offsetTopAndBottom(e);
            }
        }
        o();
        boolean z2 = false;
        this.a = false;
        int childCount2 = getChildCount();
        int i6 = 0;
        while (true) {
            if (i6 >= childCount2) {
                break;
            }
            if (((ffb) getChildAt(i6).getLayoutParams()).b != null) {
                this.a = true;
                break;
            }
            i6++;
        }
        Drawable drawable = this.i;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), e());
        }
        if (!this.e) {
            int childCount3 = getChildCount();
            for (int i7 = 0; i7 < childCount3; i7++) {
                int i8 = ((ffb) getChildAt(i7).getLayoutParams()).a;
                if ((i8 & 1) != 1 || (i8 & 10) == 0) {
                }
            }
            if (this.p == z2) {
                this.p = z2;
                refreshDrawableState();
                return;
            }
            return;
        }
        z2 = true;
        if (this.p == z2) {
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && getFitsSystemWindows() && r()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = pj.j(getMeasuredHeight() + e(), 0, View.MeasureSpec.getSize(i2));
            } else if (mode == 0) {
                measuredHeight += e();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        o();
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        fob fobVar;
        fob fobVar2;
        AppBarLayout appBarLayout;
        boolean z = drawable instanceof fob;
        Context context = getContext();
        if (z) {
            fobVar2 = (fob) drawable;
        } else {
            ColorStateList b = fhr.b(drawable);
            if (b != null) {
                fob fobVar3 = new fob();
                fobVar3.M(b);
                fobVar = fobVar3;
                if (fobVar != null || fobVar.C() == null) {
                    appBarLayout = this;
                } else {
                    this.h = fobVar.C().getDefaultColor();
                    ColorStateList colorStateList = this.q;
                    if (colorStateList != null) {
                        appBarLayout = this;
                        appBarLayout.u = new fey(appBarLayout, colorStateList, fobVar, fhq.f(getContext(), R.attr.colorSurface), 0);
                    } else {
                        appBarLayout = this;
                        fobVar.J(context);
                        appBarLayout.u = new edm((Object) appBarLayout, fobVar, 2);
                    }
                    drawable = fobVar;
                }
                super.setBackground(drawable);
            }
            fobVar2 = null;
        }
        fobVar = fobVar2;
        if (fobVar != null) {
        }
        appBarLayout = this;
        super.setBackground(drawable);
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        fhq.w(this, f);
    }

    @Override // android.widget.LinearLayout
    public final void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(1);
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        Drawable drawable = this.i;
        if (drawable != null) {
            drawable.setVisible(i == 0, false);
        }
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.i;
    }

    /* compiled from: PG */
    public class BaseBehavior extends ffe {
        public int a;
        private int c;
        private ValueAnimator d;
        private ffa e;
        private WeakReference f;

        public BaseBehavior() {
        }

        public static final View R(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (((tz) childAt.getLayoutParams()).a instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        private final void W(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            if (yq.b(coordinatorLayout) != null) {
                return;
            }
            yq.l(coordinatorLayout, new fez(this, appBarLayout, coordinatorLayout));
        }

        private final void X(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int e = appBarLayout.e() + appBarLayout.getPaddingTop();
            int L = L() - e;
            int childCount = appBarLayout.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = appBarLayout.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                ffb ffbVar = (ffb) childAt.getLayoutParams();
                if (Y(ffbVar.a, 32)) {
                    top -= ffbVar.topMargin;
                    bottom += ffbVar.bottomMargin;
                }
                int i2 = -L;
                if (top <= i2 && bottom >= i2) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                View childAt2 = appBarLayout.getChildAt(i);
                ffb ffbVar2 = (ffb) childAt2.getLayoutParams();
                int i3 = ffbVar2.a;
                if ((i3 & 17) == 17) {
                    int i4 = -childAt2.getTop();
                    int i5 = -childAt2.getBottom();
                    if (i == 0 && appBarLayout.getFitsSystemWindows() && childAt2.getFitsSystemWindows()) {
                        i4 -= appBarLayout.e();
                    }
                    if (Y(i3, 2)) {
                        i5 += childAt2.getMinimumHeight();
                    } else if (Y(i3, 5)) {
                        int minimumHeight = childAt2.getMinimumHeight() + i5;
                        if (L < minimumHeight) {
                            i4 = minimumHeight;
                        } else {
                            i5 = minimumHeight;
                        }
                    }
                    if (Y(i3, 32)) {
                        i4 += ffbVar2.topMargin;
                        i5 -= ffbVar2.bottomMargin;
                    }
                    if (L < (i5 + i4) / 2) {
                        i4 = i5;
                    }
                    Z(coordinatorLayout, appBarLayout, pj.j(i4 + e, -appBarLayout.f(), 0));
                }
            }
        }

        private static boolean Y(int i, int i2) {
            return (i & i2) == i2;
        }

        private final void Z(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            float abs = Math.abs(L() - i);
            float abs2 = Math.abs(0.0f);
            int round = abs2 > 0.0f ? Math.round((abs / abs2) * 1000.0f) * 3 : (int) (((abs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int L = L();
            ValueAnimator valueAnimator = this.d;
            if (L == i) {
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.d.cancel();
                return;
            }
            if (valueAnimator == null) {
                ValueAnimator valueAnimator2 = new ValueAnimator();
                this.d = valueAnimator2;
                valueAnimator2.setInterpolator(fes.e);
                this.d.addUpdateListener(new fpv(this, coordinatorLayout, appBarLayout, 1));
            } else {
                valueAnimator.cancel();
            }
            this.d.setDuration(Math.min(round, 600));
            this.d.setIntValues(L, i);
            this.d.start();
        }

        private static final View aa(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof xl) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        private static final void ab(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, boolean z) {
            View view;
            boolean z2;
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    view = null;
                    break;
                }
                view = appBarLayout.getChildAt(i3);
                if (abs >= view.getTop() && abs <= view.getBottom()) {
                    break;
                } else {
                    i3++;
                }
            }
            if (view != null) {
                int i4 = ((ffb) view.getLayoutParams()).a;
                if ((i4 & 1) != 0) {
                    int minimumHeight = view.getMinimumHeight();
                    z2 = true;
                    if (i2 > 0) {
                    }
                }
            }
            z2 = false;
            if (appBarLayout.e) {
                z2 = appBarLayout.l(aa(coordinatorLayout));
            }
            boolean n = appBarLayout.n(z2);
            if (!z) {
                if (n) {
                    ArrayList f = coordinatorLayout.h.f(appBarLayout);
                    List arrayList = f != null ? new ArrayList(f) : null;
                    if (arrayList == null) {
                        arrayList = Collections.EMPTY_LIST;
                    }
                    int size = arrayList.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        tw twVar = ((tz) ((View) arrayList.get(i5)).getLayoutParams()).a;
                        if (twVar instanceof ScrollingViewBehavior) {
                            if (((ScrollingViewBehavior) twVar).d == 0) {
                                return;
                            }
                        }
                    }
                    return;
                }
                return;
            }
            if (appBarLayout.getBackground() != null) {
                appBarLayout.getBackground().jumpToCurrentState();
            }
            if (appBarLayout.getForeground() != null) {
                appBarLayout.getForeground().jumpToCurrentState();
            }
            if (appBarLayout.getStateListAnimator() != null) {
                appBarLayout.getStateListAnimator().jumpToCurrentState();
            }
        }

        @Override // defpackage.ffe
        public final /* bridge */ /* synthetic */ int J(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            return (-appBarLayout.c()) + appBarLayout.e();
        }

        @Override // defpackage.ffe
        public final /* synthetic */ int K(View view) {
            return ((AppBarLayout) view).f();
        }

        @Override // defpackage.ffe
        public final int L() {
            return U() + this.a;
        }

        @Override // defpackage.ffe
        public final /* bridge */ /* synthetic */ int M(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            int i4;
            int i5;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int L = L();
            int i6 = 0;
            if (i2 == 0 || L < i2 || L > i3) {
                this.a = 0;
            } else {
                int j = pj.j(i, i2, i3);
                if (L != j) {
                    if (appBarLayout.a) {
                        int abs = Math.abs(j);
                        int childCount = appBarLayout.getChildCount();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= childCount) {
                                break;
                            }
                            View childAt = appBarLayout.getChildAt(i7);
                            ffb ffbVar = (ffb) childAt.getLayoutParams();
                            Interpolator interpolator = ffbVar.b;
                            if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                                i7++;
                            } else if (interpolator != null) {
                                int i8 = ffbVar.a;
                                if ((i8 & 1) != 0) {
                                    i5 = childAt.getHeight() + ffbVar.topMargin + ffbVar.bottomMargin;
                                    if ((i8 & 2) != 0) {
                                        i5 -= childAt.getMinimumHeight();
                                    }
                                } else {
                                    i5 = 0;
                                }
                                if (childAt.getFitsSystemWindows()) {
                                    i5 -= appBarLayout.e();
                                }
                                if (i5 > 0) {
                                    float f = i5;
                                    i4 = Integer.signum(j) * (childAt.getTop() + Math.round(f * interpolator.getInterpolation((abs - childAt.getTop()) / f)));
                                }
                            }
                        }
                    }
                    i4 = j;
                    boolean V = V(i4);
                    int i9 = L - j;
                    this.a = j - i4;
                    if (V) {
                        for (int i10 = 0; i10 < appBarLayout.getChildCount(); i10++) {
                            ffb ffbVar2 = (ffb) appBarLayout.getChildAt(i10).getLayoutParams();
                            fwm fwmVar = ffbVar2.c;
                            if (fwmVar != null && (ffbVar2.a & 1) != 0) {
                                View childAt2 = appBarLayout.getChildAt(i10);
                                float U = U();
                                Rect rect = (Rect) fwmVar.b;
                                childAt2.getDrawingRect(rect);
                                appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect);
                                rect.offset(0, -appBarLayout.e());
                                float abs2 = rect.top - Math.abs(U);
                                if (abs2 <= 0.0f) {
                                    float i11 = 1.0f - pj.i(Math.abs(abs2 / rect.height()), 0.0f, 1.0f);
                                    float height = (-abs2) - ((rect.height() * 0.3f) * (1.0f - (i11 * i11)));
                                    childAt2.setTranslationY(height);
                                    Rect rect2 = (Rect) fwmVar.a;
                                    childAt2.getDrawingRect(rect2);
                                    rect2.offset(0, (int) (-height));
                                    if (height >= rect2.height()) {
                                        childAt2.setAlpha(0.0f);
                                    } else {
                                        childAt2.setAlpha(1.0f);
                                    }
                                    childAt2.setClipBounds(rect2);
                                } else {
                                    childAt2.setClipBounds(null);
                                    childAt2.setTranslationY(0.0f);
                                    childAt2.setAlpha(1.0f);
                                }
                            }
                        }
                    } else if (appBarLayout.a) {
                        coordinatorLayout.b(appBarLayout);
                    }
                    appBarLayout.h(U());
                    ab(coordinatorLayout, appBarLayout, j, j < L ? -1 : 1, false);
                    i6 = i9;
                }
            }
            W(coordinatorLayout, appBarLayout);
            return i6;
        }

        final ffa N(Parcelable parcelable, AppBarLayout appBarLayout) {
            int U = U();
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + U;
                if (childAt.getTop() + U <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = abn.c;
                    }
                    ffa ffaVar = new ffa(parcelable);
                    boolean z = U == 0;
                    ffaVar.b = z;
                    ffaVar.a = !z && (-U) >= appBarLayout.f();
                    ffaVar.e = i;
                    ffaVar.g = bottom == childAt.getMinimumHeight() + appBarLayout.e();
                    ffaVar.f = bottom / childAt.getHeight();
                    return ffaVar;
                }
            }
            return null;
        }

        @Override // defpackage.ffe
        public final /* bridge */ /* synthetic */ void O(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            X(coordinatorLayout, appBarLayout);
            if (appBarLayout.e) {
                appBarLayout.n(appBarLayout.l(aa(coordinatorLayout)));
            }
        }

        final void P(ffa ffaVar, boolean z) {
            if (this.e == null || z) {
                this.e = ffaVar;
            }
        }

        @Override // defpackage.ffe
        public final /* bridge */ /* synthetic */ boolean Q(View view) {
            WeakReference weakReference = this.f;
            if (weakReference == null) {
                return true;
            }
            View view2 = (View) weakReference.get();
            return (view2 == null || !view2.isShown() || view2.canScrollVertically(-1)) ? false : true;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void S(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int[] iArr) {
            AppBarLayout appBarLayout2;
            int i2;
            int i3;
            if (i != 0) {
                if (i < 0) {
                    i2 = -appBarLayout.f();
                    i3 = appBarLayout.b() + i2;
                } else {
                    i2 = -appBarLayout.f();
                    i3 = 0;
                }
                int i4 = i2;
                int i5 = i3;
                if (i4 != i5) {
                    appBarLayout2 = appBarLayout;
                    iArr[1] = T(coordinatorLayout, appBarLayout2, i, i4, i5);
                    if (appBarLayout2.e) {
                        return;
                    }
                    appBarLayout2.n(appBarLayout2.l(view));
                    return;
                }
            }
            appBarLayout2 = appBarLayout;
            if (appBarLayout2.e) {
            }
        }

        @Override // defpackage.tw
        public final /* bridge */ /* synthetic */ void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.c == 0 || i == 1) {
                X(coordinatorLayout, appBarLayout);
                if (appBarLayout.e) {
                    appBarLayout.n(appBarLayout.l(view2));
                }
            }
            this.f = new WeakReference(view2);
        }

        @Override // defpackage.ffh, defpackage.tw
        public final /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
            BaseBehavior baseBehavior;
            CoordinatorLayout coordinatorLayout2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.l(coordinatorLayout, appBarLayout, i);
            int i2 = appBarLayout.b;
            ffa ffaVar = this.e;
            if (ffaVar == null || (i2 & 8) != 0) {
                baseBehavior = this;
                coordinatorLayout2 = coordinatorLayout;
                if (i2 != 0) {
                    int i3 = i2 & 4;
                    if ((i2 & 2) != 0) {
                        int i4 = -appBarLayout.f();
                        if (i3 != 0) {
                            baseBehavior.Z(coordinatorLayout2, appBarLayout, i4);
                        } else {
                            baseBehavior.M(coordinatorLayout2, appBarLayout, i4, Integer.MIN_VALUE, Integer.MAX_VALUE);
                        }
                    } else if ((i2 & 1) != 0) {
                        if (i3 != 0) {
                            baseBehavior.Z(coordinatorLayout2, appBarLayout, 0);
                        } else {
                            baseBehavior.M(coordinatorLayout2, appBarLayout, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
                        }
                    }
                }
            } else if (ffaVar.a) {
                baseBehavior = this;
                coordinatorLayout2 = coordinatorLayout;
                baseBehavior.M(coordinatorLayout2, appBarLayout, -appBarLayout.f(), Integer.MIN_VALUE, Integer.MAX_VALUE);
            } else {
                baseBehavior = this;
                coordinatorLayout2 = coordinatorLayout;
                if (ffaVar.b) {
                    baseBehavior.M(coordinatorLayout2, appBarLayout, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
                } else {
                    View childAt = appBarLayout.getChildAt(ffaVar.e);
                    baseBehavior.M(coordinatorLayout2, appBarLayout, (-childAt.getBottom()) + (baseBehavior.e.g ? childAt.getMinimumHeight() + appBarLayout.e() : Math.round(childAt.getHeight() * baseBehavior.e.f)), Integer.MIN_VALUE, Integer.MAX_VALUE);
                }
            }
            appBarLayout.b = 0;
            baseBehavior.e = null;
            baseBehavior.V(pj.j(baseBehavior.U(), -appBarLayout.f(), 0));
            ab(coordinatorLayout2, appBarLayout, baseBehavior.U(), 0, true);
            appBarLayout.h(baseBehavior.U());
            baseBehavior.W(coordinatorLayout2, appBarLayout);
            return true;
        }

        @Override // defpackage.tw
        public final /* bridge */ /* synthetic */ boolean s(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((tz) appBarLayout.getLayoutParams()).height != -2) {
                return false;
            }
            coordinatorLayout.m(appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }

        @Override // defpackage.tw
        public final /* bridge */ /* synthetic */ void u(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int[] iArr, int i2) {
            S(coordinatorLayout, (AppBarLayout) view, view2, i, iArr);
        }

        @Override // defpackage.tw
        public final /* bridge */ /* synthetic */ void v(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
            int i4;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i3 < 0) {
                i4 = i3;
                iArr[1] = T(coordinatorLayout, appBarLayout, i4, -appBarLayout.c(), 0);
            } else {
                i4 = i3;
            }
            if (i4 == 0) {
                W(coordinatorLayout, appBarLayout);
            }
        }

        @Override // defpackage.tw
        public final /* bridge */ /* synthetic */ void w(View view, Parcelable parcelable) {
            if (!(parcelable instanceof ffa)) {
                this.e = null;
            } else {
                P((ffa) parcelable, true);
                Parcelable parcelable2 = this.e.d;
            }
        }

        @Override // defpackage.tw
        public final /* bridge */ /* synthetic */ Parcelable x(View view) {
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            ffa N = N(absSavedState, (AppBarLayout) view);
            return N == null ? absSavedState : N;
        }

        @Override // defpackage.tw
        public final /* bridge */ /* synthetic */ boolean y(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            boolean z = false;
            if ((i & 2) != 0 && (appBarLayout.e || appBarLayout.d || (appBarLayout.f() != 0 && coordinatorLayout.getHeight() - view2.getHeight() <= appBarLayout.getHeight()))) {
                z = true;
            }
            if (z && (valueAnimator = this.d) != null) {
                valueAnimator.cancel();
            }
            this.f = null;
            this.c = i2;
            return z;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* compiled from: PG */
    public class Behavior extends BaseBehavior {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* synthetic */ LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new ffb();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m(layoutParams);
    }

    /* compiled from: PG */
    public class ScrollingViewBehavior extends fff {
        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ffg.d);
            this.d = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }

        static final AppBarLayout M(List list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = (View) list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // defpackage.fff
        public final float J(View view) {
            int i;
            if (!(view instanceof AppBarLayout)) {
                return 0.0f;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int f = appBarLayout.f();
            int b = appBarLayout.b();
            tw twVar = ((tz) appBarLayout.getLayoutParams()).a;
            int L = twVar instanceof BaseBehavior ? ((BaseBehavior) twVar).L() : 0;
            if ((b == 0 || f + L > b) && (i = f - b) != 0) {
                return (L / i) + 1.0f;
            }
            return 0.0f;
        }

        @Override // defpackage.fff
        public final int K(View view) {
            return ((AppBarLayout) view).f();
        }

        @Override // defpackage.fff
        public final /* bridge */ /* synthetic */ View L(List list) {
            return M(list);
        }

        @Override // defpackage.ffh, defpackage.tw
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
            super.l(coordinatorLayout, view, i);
            return true;
        }

        @Override // defpackage.tw
        public final boolean m(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout M = M(coordinatorLayout.a(view));
            if (M != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                Rect rect3 = this.a;
                rect3.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect3.contains(rect2)) {
                    M.j(false, !z, true);
                    return true;
                }
            }
            return false;
        }

        @Override // defpackage.tw
        public final boolean p(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // defpackage.tw
        public void q(CoordinatorLayout coordinatorLayout, View view, View view2) {
            tw twVar = ((tz) view2.getLayoutParams()).a;
            if (twVar instanceof BaseBehavior) {
                int bottom = (((view2.getBottom() - view.getTop()) + ((BaseBehavior) twVar).a) + this.c) - N(view2);
                int i = yq.a;
                view.offsetTopAndBottom(bottom);
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.e) {
                    appBarLayout.n(appBarLayout.l(view));
                }
            }
        }

        @Override // defpackage.tw
        public final void r(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                yq.l(coordinatorLayout, null);
            }
        }

        @Override // defpackage.tw
        public final /* bridge */ /* synthetic */ boolean s(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            zz zzVar;
            int i4 = view.getLayoutParams().height;
            if (i4 != -1) {
                if (i4 != -2) {
                    return false;
                }
                i4 = -2;
            }
            View L = L(coordinatorLayout.a(view));
            if (L == null) {
                return false;
            }
            int size = View.MeasureSpec.getSize(i3);
            if (size <= 0) {
                size = coordinatorLayout.getHeight();
            } else if (L.getFitsSystemWindows() && (zzVar = coordinatorLayout.e) != null) {
                size += zzVar.d() + zzVar.a();
            }
            int K = size + K(L);
            int measuredHeight = L.getMeasuredHeight();
            if (P()) {
                view.setTranslationY(-measuredHeight);
            } else {
                view.setTranslationY(0.0f);
                K -= measuredHeight;
            }
            coordinatorLayout.m(view, i, i2, View.MeasureSpec.makeMeasureSpec(K, i4 == -1 ? 1073741824 : Integer.MIN_VALUE));
            return true;
        }

        public ScrollingViewBehavior() {
        }
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.appBarLayoutStyle);
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }
}
