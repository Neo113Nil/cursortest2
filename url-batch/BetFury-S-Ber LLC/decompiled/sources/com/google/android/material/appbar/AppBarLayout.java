package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.trembin.nirefon.betfury.R;
import defpackage.ac;
import defpackage.at;
import defpackage.bi;
import defpackage.c70;
import defpackage.d50;
import defpackage.dp0;
import defpackage.f;
import defpackage.g10;
import defpackage.gg;
import defpackage.gk0;
import defpackage.hg;
import defpackage.hm0;
import defpackage.i5;
import defpackage.kg;
import defpackage.mv;
import defpackage.o0;
import defpackage.o3;
import defpackage.p30;
import defpackage.r3;
import defpackage.s9;
import defpackage.zd0;
import defpackage.zl0;
import defpackage.zs;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class AppBarLayout extends LinearLayout implements gg {
    public static final /* synthetic */ int F = 0;
    public int A;
    public Drawable B;
    public Integer C;
    public final float D;
    public Behavior E;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public int k;
    public dp0 l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public ColorStateList q;
    public int r;
    public WeakReference s;
    public ValueAnimator t;
    public ValueAnimator.AnimatorUpdateListener u;
    public final ArrayList v;
    public final LinkedHashSet w;
    public final long x;
    public final TimeInterpolator y;
    public int[] z;

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        super(mv.V(context, attributeSet, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout), attributeSet, R.attr.appBarLayoutStyle);
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.k = 0;
        this.v = new ArrayList();
        this.w = new LinkedHashSet();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context3 = getContext();
        TypedArray E = d50.E(context3, attributeSet, d50.j, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout, new int[0]);
        try {
            if (E.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, E.getResourceId(0, 0)));
            }
            E.recycle();
            TypedArray E2 = d50.E(context2, attributeSet, c70.a, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout, new int[0]);
            int i = 6;
            this.q = mv.r(context2, E2, 6);
            this.x = d50.R(context2, R.attr.motionDurationMedium2, getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.y = d50.S(context2, R.attr.motionEasingStandardInterpolator, o3.a);
            if (E2.hasValue(4)) {
                d(E2.getBoolean(4, false), false, false);
            }
            if (E2.hasValue(3)) {
                d50.W(this, E2.getDimensionPixelSize(3, 0));
            }
            setBackground(E2.getDrawable(0));
            if (E2.hasValue(2)) {
                setKeyboardNavigationCluster(E2.getBoolean(2, false));
            }
            if (E2.hasValue(1)) {
                setTouchscreenBlocksFocus(E2.getBoolean(1, false));
            }
            this.D = getResources().getDimension(R.dimen.design_appbar_elevation);
            this.p = E2.getBoolean(5, false);
            this.r = E2.getResourceId(7, -1);
            setStatusBarForeground(E2.getDrawable(8));
            E2.recycle();
            o0 o0Var = new o0(i, this);
            WeakHashMap weakHashMap = hm0.a;
            zl0.c(this, o0Var);
        } catch (Throwable th) {
            E.recycle();
            throw th;
        }
    }

    public static r3 b(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            r3 r3Var = new r3((LinearLayout.LayoutParams) layoutParams);
            r3Var.a = 1;
            return r3Var;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            r3 r3Var2 = new r3((ViewGroup.MarginLayoutParams) layoutParams);
            r3Var2.a = 1;
            return r3Var2;
        }
        r3 r3Var3 = new r3(layoutParams);
        r3Var3.a = 1;
        return r3Var3;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final r3 generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        r3 r3Var = new r3(context, attributeSet);
        r3Var.a = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c70.b);
        r3Var.a = obtainStyledAttributes.getInt(1, 0);
        r3Var.b = obtainStyledAttributes.getInt(0, 0) != 1 ? null : new i5(3);
        if (obtainStyledAttributes.hasValue(2)) {
            r3Var.c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(2, 0));
        }
        obtainStyledAttributes.recycle();
        return r3Var;
    }

    public final void c() {
        Behavior behavior = this.E;
        d F2 = (behavior == null || this.g == -1 || this.k != 0) ? null : behavior.F(f.g, this);
        this.g = -1;
        this.h = -1;
        this.i = -1;
        if (F2 != null) {
            Behavior behavior2 = this.E;
            if (behavior2.m != null) {
                return;
            }
            behavior2.m = F2;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof r3;
    }

    public final void d(boolean z, boolean z2, boolean z3) {
        this.k = (z ? 1 : 2) | (z2 ? 4 : 0) | (z3 ? 8 : 0);
        requestLayout();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.B == null || getTopInset() <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(0.0f, -this.f);
        this.B.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.B;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final boolean e(boolean z) {
        if (this.m || this.o == z) {
            return false;
        }
        this.o = z;
        refreshDrawableState();
        if (!(getBackground() instanceof g10)) {
            return true;
        }
        if (this.q != null) {
            g(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
            return true;
        }
        if (!this.p) {
            return true;
        }
        float f = this.D;
        g(z ? 0.0f : f, z ? f : 0.0f);
        return true;
    }

    public final boolean f(View view) {
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

    public final void g(float f, float f2) {
        ValueAnimator valueAnimator = this.t;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        this.t = ofFloat;
        ofFloat.setDuration(this.x);
        this.t.setInterpolator(this.y);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.u;
        if (animatorUpdateListener != null) {
            this.t.addUpdateListener(animatorUpdateListener);
        }
        this.t.start();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        r3 r3Var = new r3(-1, -2);
        r3Var.a = 1;
        return r3Var;
    }

    @Override // defpackage.gg
    public hg getBehavior() {
        Behavior behavior = new Behavior();
        this.E = behavior;
        return behavior;
    }

    public int getDownNestedPreScrollRange() {
        int i;
        int minimumHeight;
        int i2 = this.h;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                r3 r3Var = (r3) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = r3Var.a;
                if ((i4 & 5) != 5) {
                    if (i3 > 0) {
                        break;
                    }
                } else {
                    int i5 = ((LinearLayout.LayoutParams) r3Var).topMargin + ((LinearLayout.LayoutParams) r3Var).bottomMargin;
                    if ((i4 & 8) != 0) {
                        minimumHeight = childAt.getMinimumHeight();
                    } else if ((i4 & 2) != 0) {
                        minimumHeight = measuredHeight - childAt.getMinimumHeight();
                    } else {
                        i = i5 + measuredHeight;
                        if (childCount == 0 && childAt.getFitsSystemWindows()) {
                            i = Math.min(i, measuredHeight - getTopInset());
                        }
                        i3 += i;
                    }
                    i = minimumHeight + i5;
                    if (childCount == 0) {
                        i = Math.min(i, measuredHeight - getTopInset());
                    }
                    i3 += i;
                }
            }
        }
        int max = Math.max(0, i3);
        this.h = max;
        return max;
    }

    public int getDownNestedScrollRange() {
        int i = this.i;
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
                r3 r3Var = (r3) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) r3Var).topMargin + ((LinearLayout.LayoutParams) r3Var).bottomMargin + childAt.getMeasuredHeight();
                int i4 = r3Var.a;
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
        this.i = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.r;
    }

    public g10 getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof g10) {
            return (g10) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int minimumHeight = getMinimumHeight();
        if (minimumHeight != 0) {
            int i = (minimumHeight * 2) + topInset;
            return i < getHeight() ? i : minimumHeight + topInset;
        }
        int childCount = getChildCount();
        int minimumHeight2 = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
        if (minimumHeight2 == 0) {
            return getHeight() / 3;
        }
        int i2 = (minimumHeight2 * 2) + topInset;
        return i2 < getHeight() ? i2 : minimumHeight2 + topInset;
    }

    public int getPendingAction() {
        return this.k;
    }

    public Drawable getStatusBarForeground() {
        return this.B;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        dp0 dp0Var = this.l;
        if (dp0Var != null) {
            return dp0Var.d();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.g;
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
                r3 r3Var = (r3) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = r3Var.a;
                if ((i4 & 1) == 0) {
                    break;
                }
                int i5 = measuredHeight + ((LinearLayout.LayoutParams) r3Var).topMargin + ((LinearLayout.LayoutParams) r3Var).bottomMargin + i3;
                if (i2 == 0 && childAt.getFitsSystemWindows()) {
                    i5 -= getTopInset();
                }
                i3 = i5;
                if ((i4 & 2) != 0) {
                    i3 -= childAt.getMinimumHeight();
                    break;
                }
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.g = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof g10) {
            d50.Y(this, (g10) background);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        if (this.z == null) {
            this.z = new int[4];
        }
        int[] iArr = this.z;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.n;
        iArr[0] = z ? R.attr.state_liftable : -2130904208;
        iArr[1] = (z && this.o) ? R.attr.state_lifted : -2130904209;
        iArr[2] = z ? R.attr.state_collapsible : -2130904204;
        iArr[3] = (z && this.o) ? R.attr.state_collapsed : -2130904203;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.s;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.s = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int topInset = getTopInset();
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt2 = getChildAt(childCount);
                    WeakHashMap weakHashMap = hm0.a;
                    childAt2.offsetTopAndBottom(topInset);
                }
            }
        }
        c();
        this.j = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            }
            if (((r3) getChildAt(i5).getLayoutParams()).c != null) {
                this.j = true;
                break;
            }
            i5++;
        }
        Drawable drawable = this.B;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.m) {
            return;
        }
        if (!this.p) {
            int childCount3 = getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 >= childCount3) {
                    z2 = false;
                    break;
                }
                int i7 = ((r3) getChildAt(i6).getLayoutParams()).a;
                if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                    break;
                } else {
                    i6++;
                }
            }
        }
        if (this.n != z2) {
            this.n = z2;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    measuredHeight = gk0.g(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i2));
                } else if (mode == 0) {
                    measuredHeight += getTopInset();
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        c();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        final g10 g10Var;
        ColorStateList colorStateList;
        Context context = getContext();
        if (drawable instanceof g10) {
            g10Var = (g10) drawable;
        } else {
            ColorStateList B = bi.B(drawable);
            if (B == null) {
                g10Var = null;
            } else {
                g10 g10Var2 = new g10();
                g10Var2.r(B);
                g10Var = g10Var2;
            }
        }
        if (g10Var != null && (colorStateList = g10Var.g.c) != null) {
            this.A = colorStateList.getDefaultColor();
            final ColorStateList colorStateList2 = this.q;
            if (colorStateList2 != null) {
                final Integer z = bi.z(getContext(), R.attr.colorSurface);
                this.u = new ValueAnimator.AnimatorUpdateListener() { // from class: p3
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Integer num;
                        AppBarLayout appBarLayout = AppBarLayout.this;
                        LinkedHashSet linkedHashSet = appBarLayout.w;
                        ArrayList arrayList = appBarLayout.v;
                        int J = bi.J(appBarLayout.A, colorStateList2.getDefaultColor(), ((Float) valueAnimator.getAnimatedValue()).floatValue());
                        ColorStateList valueOf = ColorStateList.valueOf(J);
                        g10 g10Var3 = g10Var;
                        g10Var3.r(valueOf);
                        if (appBarLayout.B != null && (num = appBarLayout.C) != null && num.equals(z)) {
                            appBarLayout.B.setTint(J);
                        }
                        if (!arrayList.isEmpty()) {
                            int size = arrayList.size();
                            int i = 0;
                            while (i < size) {
                                Object obj = arrayList.get(i);
                                i++;
                                if (obj != null) {
                                    s9.c();
                                    return;
                                } else if (g10Var3.g.c != null) {
                                    throw null;
                                }
                            }
                        }
                        if (linkedHashSet.isEmpty()) {
                            return;
                        }
                        Iterator it = linkedHashSet.iterator();
                        if (it.hasNext()) {
                            it.next().getClass();
                            s9.c();
                        }
                    }
                };
            } else {
                g10Var.n(context);
                this.u = new ValueAnimator.AnimatorUpdateListener() { // from class: q3
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int i = AppBarLayout.F;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        g10Var.q(floatValue);
                        AppBarLayout appBarLayout = AppBarLayout.this;
                        Drawable drawable2 = appBarLayout.B;
                        if (drawable2 instanceof g10) {
                            ((g10) drawable2).q(floatValue);
                        }
                        Iterator it = appBarLayout.v.iterator();
                        if (it.hasNext()) {
                            it.next().getClass();
                            s9.c();
                            return;
                        }
                        Iterator it2 = appBarLayout.w.iterator();
                        if (it2.hasNext()) {
                            it2.next().getClass();
                            s9.c();
                        }
                    }
                };
            }
            drawable = g10Var;
        }
        super.setBackground(drawable);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof g10) {
            ((g10) background).q(f);
        }
    }

    public void setExpanded(boolean z) {
        d(z, isLaidOut(), true);
    }

    public void setLiftOnScroll(boolean z) {
        this.p = z;
    }

    public void setLiftOnScrollColor(ColorStateList colorStateList) {
        if (this.q != colorStateList) {
            this.q = colorStateList;
            setBackground(getBackground());
        }
    }

    public void setLiftOnScrollTargetView(View view) {
        this.r = -1;
        if (view != null) {
            this.s = new WeakReference(view);
            return;
        }
        WeakReference weakReference = this.s;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.s = null;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.r = i;
        WeakReference weakReference = this.s;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.s = null;
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.m = z;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
        } else {
            s9.k("AppBarLayout is always vertical and does not support horizontal orientation");
        }
    }

    public void setPendingAction(int i) {
        this.k = i;
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.B;
        if (drawable2 != drawable) {
            Integer num = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.B = mutate;
            if (mutate instanceof g10) {
                num = Integer.valueOf(((g10) mutate).A);
            } else {
                ColorStateList B = bi.B(mutate);
                if (B != null) {
                    num = Integer.valueOf(B.getDefaultColor());
                }
            }
            this.C = num;
            Drawable drawable3 = this.B;
            boolean z = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.B.setState(getDrawableState());
                }
                this.B.setLayoutDirection(getLayoutDirection());
                this.B.setVisible(getVisibility() == 0, false);
                this.B.setCallback(this);
            }
            if (this.B != null && getTopInset() > 0) {
                z = true;
            }
            setWillNotDraw(!z);
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(d50.v(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        d50.W(this, f);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.B;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.B;
    }

    /* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }

    /* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
    public static class BaseBehavior<T extends AppBarLayout> extends zs {
        public int j;
        public int k;
        public ValueAnimator l;
        public d m;
        public WeakReference n;

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            this.f = -1;
            this.h = -1;
        }

        public static View B(BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (((kg) childAt.getLayoutParams()).a instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        public static View D(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof p30) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        public static void H(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, boolean z) {
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
                int i4 = ((r3) view.getLayoutParams()).a;
                if ((i4 & 1) != 0) {
                    int minimumHeight = view.getMinimumHeight();
                    z2 = true;
                    if (i2 > 0) {
                    }
                }
            }
            z2 = false;
            if (appBarLayout.p) {
                z2 = appBarLayout.f(D(coordinatorLayout));
            }
            boolean e = appBarLayout.e(z2);
            if (!z) {
                if (e) {
                    List list = (List) ((zd0) coordinatorLayout.g.g).get(appBarLayout);
                    ArrayList arrayList = coordinatorLayout.i;
                    arrayList.clear();
                    if (list != null) {
                        arrayList.addAll(list);
                    }
                    int size = arrayList.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        hg hgVar = ((kg) ((View) arrayList.get(i5)).getLayoutParams()).a;
                        if (hgVar instanceof ScrollingViewBehavior) {
                            if (((ScrollingViewBehavior) hgVar).f == 0) {
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

        public final void C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(y() - i);
            float abs2 = Math.abs(0.0f);
            int round = abs2 > 0.0f ? Math.round((abs / abs2) * 1000.0f) * 3 : (int) (((abs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int y = y();
            ValueAnimator valueAnimator = this.l;
            if (y == i) {
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.l.cancel();
                return;
            }
            if (valueAnimator == null) {
                ValueAnimator valueAnimator2 = new ValueAnimator();
                this.l = valueAnimator2;
                valueAnimator2.setInterpolator(o3.e);
                this.l.addUpdateListener(new a(coordinatorLayout, this, appBarLayout));
            } else {
                valueAnimator.cancel();
            }
            this.l.setDuration(Math.min(round, 600));
            this.l.setIntValues(y, i);
            this.l.start();
        }

        /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void E(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int[] iArr) {
            AppBarLayout appBarLayout2;
            int i2;
            int i3;
            if (i != 0) {
                if (i < 0) {
                    i2 = -appBarLayout.getTotalScrollRange();
                    i3 = appBarLayout.getDownNestedPreScrollRange() + i2;
                } else {
                    i2 = -appBarLayout.getUpNestedPreScrollRange();
                    i3 = 0;
                }
                int i4 = i2;
                int i5 = i3;
                if (i4 != i5) {
                    appBarLayout2 = appBarLayout;
                    iArr[1] = z(coordinatorLayout, appBarLayout2, y() - i, i4, i5);
                    if (appBarLayout2.p) {
                        return;
                    }
                    appBarLayout2.e(appBarLayout2.f(view));
                    return;
                }
            }
            appBarLayout2 = appBarLayout;
            if (appBarLayout2.p) {
            }
        }

        public final d F(Parcelable parcelable, AppBarLayout appBarLayout) {
            int w = w();
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + w;
                if (childAt.getTop() + w <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = f.g;
                    }
                    d dVar = new d(parcelable);
                    boolean z = w == 0;
                    dVar.i = z;
                    dVar.h = !z && (-w) >= appBarLayout.getTotalScrollRange();
                    dVar.j = i;
                    dVar.l = bottom == appBarLayout.getTopInset() + childAt.getMinimumHeight();
                    dVar.k = bottom / childAt.getHeight();
                    return dVar;
                }
            }
            return null;
        }

        public final void G(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int paddingTop = appBarLayout.getPaddingTop() + appBarLayout.getTopInset();
            int y = y() - paddingTop;
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
                r3 r3Var = (r3) childAt.getLayoutParams();
                if ((r3Var.a & 32) == 32) {
                    top -= ((LinearLayout.LayoutParams) r3Var).topMargin;
                    bottom += ((LinearLayout.LayoutParams) r3Var).bottomMargin;
                }
                int i2 = -y;
                if (top <= i2 && bottom >= i2) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                View childAt2 = appBarLayout.getChildAt(i);
                r3 r3Var2 = (r3) childAt2.getLayoutParams();
                int i3 = r3Var2.a;
                if ((i3 & 17) == 17) {
                    int i4 = -childAt2.getTop();
                    int i5 = -childAt2.getBottom();
                    if (i == 0 && appBarLayout.getFitsSystemWindows() && childAt2.getFitsSystemWindows()) {
                        i4 -= appBarLayout.getTopInset();
                    }
                    if ((i3 & 2) == 2) {
                        i5 += childAt2.getMinimumHeight();
                    } else if ((i3 & 5) == 5) {
                        int minimumHeight = childAt2.getMinimumHeight() + i5;
                        if (y < minimumHeight) {
                            i4 = minimumHeight;
                        } else {
                            i5 = minimumHeight;
                        }
                    }
                    if ((i3 & 32) == 32) {
                        i4 += ((LinearLayout.LayoutParams) r3Var2).topMargin;
                        i5 -= ((LinearLayout.LayoutParams) r3Var2).bottomMargin;
                    }
                    if (y < (i5 + i4) / 2) {
                        i4 = i5;
                    }
                    C(coordinatorLayout, appBarLayout, gk0.g(i4 + paddingTop, -appBarLayout.getTotalScrollRange(), 0));
                }
            }
        }

        @Override // defpackage.um0, defpackage.hg
        public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.l(coordinatorLayout, appBarLayout, i);
            int pendingAction = appBarLayout.getPendingAction();
            d dVar = this.m;
            if (dVar == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i2 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z) {
                            C(coordinatorLayout, appBarLayout, i2);
                        } else {
                            A(coordinatorLayout, appBarLayout, i2);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z) {
                            C(coordinatorLayout, appBarLayout, 0);
                        } else {
                            A(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (dVar.h) {
                A(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else if (dVar.i) {
                A(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(dVar.j);
                int i3 = -childAt.getBottom();
                A(coordinatorLayout, appBarLayout, this.m.l ? appBarLayout.getTopInset() + childAt.getMinimumHeight() + i3 : Math.round(childAt.getHeight() * this.m.k) + i3);
            }
            appBarLayout.k = 0;
            this.m = null;
            int g = gk0.g(w(), -appBarLayout.getTotalScrollRange(), 0);
            ac acVar = this.a;
            if (acVar == null) {
                this.b = g;
            } else if (acVar.c != g) {
                acVar.c = g;
                acVar.c();
            }
            H(coordinatorLayout, appBarLayout, w(), 0, true);
            appBarLayout.f = w();
            if (!appBarLayout.willNotDraw()) {
                appBarLayout.postInvalidateOnAnimation();
            }
            if (hm0.d(coordinatorLayout) != null) {
                return true;
            }
            hm0.m(coordinatorLayout, new b(coordinatorLayout, this, appBarLayout));
            return true;
        }

        @Override // defpackage.hg
        public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((kg) appBarLayout.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.s(appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }

        @Override // defpackage.hg
        public final /* bridge */ /* synthetic */ void o(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
            E(coordinatorLayout, (AppBarLayout) view, view2, i2, iArr);
        }

        @Override // defpackage.hg
        public final void p(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
            BaseBehavior<T> baseBehavior;
            CoordinatorLayout coordinatorLayout2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i3 < 0) {
                baseBehavior = this;
                coordinatorLayout2 = coordinatorLayout;
                iArr[1] = baseBehavior.z(coordinatorLayout2, appBarLayout, y() - i3, -appBarLayout.getDownNestedScrollRange(), 0);
            } else {
                baseBehavior = this;
                coordinatorLayout2 = coordinatorLayout;
            }
            if (i3 == 0 && hm0.d(coordinatorLayout2) == null) {
                hm0.m(coordinatorLayout2, new b(coordinatorLayout2, baseBehavior, appBarLayout));
            }
        }

        @Override // defpackage.hg
        public final void r(View view, Parcelable parcelable) {
            if (parcelable instanceof d) {
                this.m = (d) parcelable;
            } else {
                this.m = null;
            }
        }

        @Override // defpackage.hg
        public final Parcelable s(View view) {
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            d F = F(absSavedState, (AppBarLayout) view);
            return F == null ? absSavedState : F;
        }

        @Override // defpackage.hg
        public final boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            boolean z = (i & 2) != 0 && (appBarLayout.p || appBarLayout.o || (appBarLayout.getTotalScrollRange() != 0 && coordinatorLayout.getHeight() - view2.getHeight() <= appBarLayout.getHeight()));
            if (z && (valueAnimator = this.l) != null) {
                valueAnimator.cancel();
            }
            this.n = null;
            this.k = i2;
            return z;
        }

        @Override // defpackage.hg
        public final void u(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.k == 0 || i == 1) {
                G(coordinatorLayout, appBarLayout);
                if (appBarLayout.p) {
                    appBarLayout.e(appBarLayout.f(view2));
                }
            }
            this.n = new WeakReference(view2);
        }

        @Override // defpackage.zs
        public final int y() {
            return w() + this.j;
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x015e  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0163  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0165  */
        @Override // defpackage.zs
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int z(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            int i4;
            boolean z;
            int i5;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int y = y();
            int i6 = 0;
            if (i2 == 0 || y < i2 || y > i3) {
                this.j = 0;
            } else {
                int g = gk0.g(i, i2, i3);
                if (y != g) {
                    if (appBarLayout.j) {
                        int abs = Math.abs(g);
                        int childCount = appBarLayout.getChildCount();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= childCount) {
                                break;
                            }
                            View childAt = appBarLayout.getChildAt(i7);
                            r3 r3Var = (r3) childAt.getLayoutParams();
                            Interpolator interpolator = r3Var.c;
                            if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                                i7++;
                            } else if (interpolator != null) {
                                int i8 = r3Var.a;
                                if ((i8 & 1) != 0) {
                                    i5 = childAt.getHeight() + ((LinearLayout.LayoutParams) r3Var).topMargin + ((LinearLayout.LayoutParams) r3Var).bottomMargin;
                                    if ((i8 & 2) != 0) {
                                        i5 -= childAt.getMinimumHeight();
                                    }
                                } else {
                                    i5 = 0;
                                }
                                if (childAt.getFitsSystemWindows()) {
                                    i5 -= appBarLayout.getTopInset();
                                }
                                if (i5 > 0) {
                                    float f = i5;
                                    i4 = (childAt.getTop() + Math.round(interpolator.getInterpolation((abs - childAt.getTop()) / f) * f)) * Integer.signum(g);
                                }
                            }
                        }
                    }
                    i4 = g;
                    ac acVar = this.a;
                    int i9 = 1;
                    if (acVar == null) {
                        this.b = i4;
                    } else if (acVar.c != i4) {
                        acVar.c = i4;
                        acVar.c();
                        z = true;
                        int i10 = y - g;
                        this.j = g - i4;
                        if (z) {
                            int i11 = 0;
                            while (i11 < appBarLayout.getChildCount()) {
                                r3 r3Var2 = (r3) appBarLayout.getChildAt(i11).getLayoutParams();
                                i5 i5Var = r3Var2.b;
                                if (i5Var != null && (r3Var2.a & i9) != 0) {
                                    View childAt2 = appBarLayout.getChildAt(i11);
                                    float w = w();
                                    Rect rect = (Rect) i5Var.h;
                                    Rect rect2 = (Rect) i5Var.g;
                                    childAt2.getDrawingRect(rect2);
                                    appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect2);
                                    rect2.offset(0, -appBarLayout.getTopInset());
                                    float abs2 = rect2.top - Math.abs(w);
                                    if (abs2 <= 0.0f) {
                                        float abs3 = Math.abs(abs2 / rect2.height());
                                        if (abs3 < 0.0f) {
                                            abs3 = 0.0f;
                                        } else if (abs3 > 1.0f) {
                                            abs3 = 1.0f;
                                        }
                                        float f2 = 1.0f - abs3;
                                        float height = (-abs2) - ((rect2.height() * 0.3f) * (1.0f - (f2 * f2)));
                                        childAt2.setTranslationY(height);
                                        childAt2.getDrawingRect(rect);
                                        rect.offset(0, (int) (-height));
                                        if (height >= rect.height()) {
                                            childAt2.setAlpha(0.0f);
                                        } else {
                                            childAt2.setAlpha(1.0f);
                                        }
                                        childAt2.setClipBounds(rect);
                                    } else {
                                        childAt2.setClipBounds(null);
                                        childAt2.setTranslationY(0.0f);
                                        childAt2.setAlpha(1.0f);
                                    }
                                }
                                i11++;
                                i9 = 1;
                            }
                        }
                        if (!z && appBarLayout.j) {
                            coordinatorLayout.i(appBarLayout);
                        }
                        appBarLayout.f = w();
                        if (!appBarLayout.willNotDraw()) {
                            appBarLayout.postInvalidateOnAnimation();
                        }
                        H(coordinatorLayout, appBarLayout, g, g >= y ? -1 : 1, false);
                        i6 = i10;
                    }
                    z = false;
                    int i102 = y - g;
                    this.j = g - i4;
                    if (z) {
                    }
                    if (!z) {
                        coordinatorLayout.i(appBarLayout);
                    }
                    appBarLayout.f = w();
                    if (!appBarLayout.willNotDraw()) {
                    }
                    H(coordinatorLayout, appBarLayout, g, g >= y ? -1 : 1, false);
                    i6 = i102;
                }
            }
            if (hm0.d(coordinatorLayout) != null) {
                return i6;
            }
            hm0.m(coordinatorLayout, new b(coordinatorLayout, this, appBarLayout));
            return i6;
        }

        public BaseBehavior() {
            this.f = -1;
            this.h = -1;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        r3 r3Var = new r3(-1, -2);
        r3Var.a = 1;
        return r3Var;
    }

    /* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
    public static class ScrollingViewBehavior extends at {
        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c70.F);
            this.f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }

        public static AppBarLayout z(ArrayList arrayList) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                View view = (View) arrayList.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // defpackage.hg
        public final boolean f(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // defpackage.hg
        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            hg hgVar = ((kg) view2.getLayoutParams()).a;
            if (hgVar instanceof BaseBehavior) {
                int bottom = (((view2.getBottom() - view.getTop()) + ((BaseBehavior) hgVar).j) + this.e) - y(view2);
                WeakHashMap weakHashMap = hm0.a;
                view.offsetTopAndBottom(bottom);
            }
            if (!(view2 instanceof AppBarLayout)) {
                return false;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            if (!appBarLayout.p) {
                return false;
            }
            appBarLayout.e(appBarLayout.f(view));
            return false;
        }

        @Override // defpackage.hg
        public final void i(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                hm0.m(coordinatorLayout, null);
            }
        }

        @Override // defpackage.hg
        public final boolean q(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout z2 = z(coordinatorLayout.k(view));
            if (z2 != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect3 = this.c;
                rect3.set(0, 0, width, height);
                if (!rect3.contains(rect2)) {
                    z2.d(false, !z, true);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior() {
        }
    }
}
