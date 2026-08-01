package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.focus.FocusRingDrawable;
import com.trembin.nirefon.betfury.R;
import defpackage.a5;
import defpackage.a9;
import defpackage.ao;
import defpackage.ba0;
import defpackage.c;
import defpackage.c70;
import defpackage.co;
import defpackage.d50;
import defpackage.gd0;
import defpackage.gg;
import defpackage.hg;
import defpackage.hm0;
import defpackage.kg;
import defpackage.mv;
import defpackage.nj;
import defpackage.nz;
import defpackage.o0;
import defpackage.pn0;
import defpackage.r20;
import defpackage.rd0;
import defpackage.ro;
import defpackage.s9;
import defpackage.so;
import defpackage.xc0;
import defpackage.yn;
import defpackage.z0;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class FloatingActionButton extends pn0 implements yn, rd0, gg {
    public ColorStateList g;
    public PorterDuff.Mode h;
    public ColorStateList i;
    public PorterDuff.Mode j;
    public ColorStateList k;
    public int l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public final Rect q;
    public final Rect r;
    public final nz s;
    public final c t;
    public so u;

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        super(mv.V(context, attributeSet, R.attr.floatingActionButtonStyle, R.style.Widget_Design_FloatingActionButton), attributeSet, R.attr.floatingActionButtonStyle);
        ColorStateList colorStateList;
        FloatingActionButton floatingActionButton;
        Drawable drawable;
        Drawable drawable2;
        this.f = getVisibility();
        this.q = new Rect();
        this.r = new Rect();
        Context context2 = getContext();
        TypedArray E = d50.E(context2, attributeSet, c70.j, R.attr.floatingActionButtonStyle, R.style.Widget_Design_FloatingActionButton, new int[0]);
        this.g = mv.r(context2, E, 1);
        this.h = xc0.b(E.getInt(2, -1), null);
        this.k = mv.r(context2, E, 12);
        this.l = E.getInt(7, -1);
        this.m = E.getDimensionPixelSize(6, 0);
        int dimensionPixelSize = E.getDimensionPixelSize(3, 0);
        float dimension = E.getDimension(4, 0.0f);
        float dimension2 = E.getDimension(9, 0.0f);
        float dimension3 = E.getDimension(11, 0.0f);
        this.p = E.getBoolean(16, false);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        setMaxImageSize(E.getDimensionPixelSize(10, 0));
        r20 a = r20.a(context2, E, 15);
        r20 a2 = r20.a(context2, E, 8);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, c70.z, R.attr.floatingActionButtonStyle, R.style.Widget_Design_FloatingActionButton);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context2, resourceId);
        if (resourceId2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
        }
        gd0 a3 = gd0.h(contextThemeWrapper.obtainStyledAttributes(c70.G), gd0.m).a();
        boolean z = E.getBoolean(5, false);
        setEnabled(E.getBoolean(0, true));
        E.recycle();
        nz nzVar = new nz(this);
        this.s = nzVar;
        nzVar.h(attributeSet, R.attr.floatingActionButtonStyle);
        this.t = new c(this);
        getImpl().g(a3);
        so impl = getImpl();
        ColorStateList colorStateList2 = this.g;
        PorterDuff.Mode mode = this.h;
        ColorStateList colorStateList3 = this.k;
        FloatingActionButton floatingActionButton2 = impl.s;
        gd0 gd0Var = impl.a;
        gd0Var.getClass();
        ro roVar = new ro(gd0Var);
        impl.b = roVar;
        roVar.setTintList(colorStateList2);
        if (mode != null) {
            impl.b.setTintMode(mode);
        }
        impl.b.n(floatingActionButton2.getContext());
        if (dimensionPixelSize > 0) {
            Context context3 = floatingActionButton2.getContext();
            gd0 gd0Var2 = impl.a;
            gd0Var2.getClass();
            a9 a9Var = new a9(gd0Var2);
            int color = context3.getColor(R.color.design_fab_stroke_top_outer_color);
            colorStateList = colorStateList3;
            int color2 = context3.getColor(R.color.design_fab_stroke_top_inner_color);
            floatingActionButton = floatingActionButton2;
            int color3 = context3.getColor(R.color.design_fab_stroke_end_inner_color);
            int color4 = context3.getColor(R.color.design_fab_stroke_end_outer_color);
            a9Var.i = color;
            a9Var.j = color2;
            a9Var.k = color3;
            a9Var.l = color4;
            float f = dimensionPixelSize;
            if (a9Var.h != f) {
                a9Var.h = f;
                a9Var.b.setStrokeWidth(f * 1.3333f);
                a9Var.n = true;
                a9Var.invalidateSelf();
            }
            if (colorStateList2 != null) {
                a9Var.m = colorStateList2.getColorForState(a9Var.getState(), a9Var.m);
            }
            a9Var.p = colorStateList2;
            a9Var.n = true;
            a9Var.invalidateSelf();
            impl.d = a9Var;
            a9 a9Var2 = impl.d;
            a9Var2.getClass();
            ro roVar2 = impl.b;
            roVar2.getClass();
            drawable2 = new LayerDrawable(new Drawable[]{a9Var2, roVar2});
            drawable = null;
        } else {
            colorStateList = colorStateList3;
            floatingActionButton = floatingActionButton2;
            drawable = null;
            impl.d = null;
            drawable2 = impl.b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(ba0.a(colorStateList), drawable2, drawable);
        impl.c = rippleDrawable;
        FocusRingDrawable.e(floatingActionButton.getContext(), rippleDrawable, impl.b);
        impl.e = rippleDrawable;
        getImpl().k = dimensionPixelSize2;
        so impl2 = getImpl();
        if (impl2.h != dimension) {
            impl2.h = dimension;
            impl2.e(dimension, impl2.i, impl2.j);
        }
        so impl3 = getImpl();
        if (impl3.i != dimension2) {
            impl3.i = dimension2;
            impl3.e(impl3.h, dimension2, impl3.j);
        }
        so impl4 = getImpl();
        if (impl4.j != dimension3) {
            impl4.j = dimension3;
            impl4.e(impl4.h, impl4.i, dimension3);
        }
        getImpl().n = a;
        getImpl().o = a2;
        getImpl().f = z;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private so getImpl() {
        if (this.u == null) {
            this.u = new so(this, new o0(23, this));
        }
        return this.u;
    }

    public final int c(int i) {
        int i2 = this.m;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        return i != -1 ? i != 1 ? resources.getDimensionPixelSize(R.dimen.design_fab_size_normal) : resources.getDimensionPixelSize(R.dimen.design_fab_size_mini) : Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? c(1) : c(0);
    }

    public final void d() {
        so impl = getImpl();
        FloatingActionButton floatingActionButton = impl.s;
        int visibility = floatingActionButton.getVisibility();
        int i = impl.r;
        if (visibility == 0) {
            if (i == 1) {
                return;
            }
        } else if (i != 2) {
            return;
        }
        Animator animator = impl.m;
        if (animator != null) {
            animator.cancel();
        }
        FloatingActionButton floatingActionButton2 = impl.s;
        if (!floatingActionButton2.isLaidOut() || floatingActionButton2.isInEditMode()) {
            floatingActionButton.a(4, false);
            return;
        }
        r20 r20Var = impl.o;
        AnimatorSet b = r20Var != null ? impl.b(r20Var, 0.0f, 0.0f, 0.0f) : impl.c(0.0f, 0.4f, 0.4f, so.B, so.C);
        b.addListener(new co(impl));
        b.start();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
    }

    public final void e() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.i;
        if (colorStateList == null) {
            drawable.clearColorFilter();
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.j;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(a5.c(colorForState, mode));
    }

    public final void f() {
        so impl = getImpl();
        FloatingActionButton floatingActionButton = impl.s;
        Matrix matrix = impl.x;
        FloatingActionButton floatingActionButton2 = impl.s;
        int visibility = floatingActionButton.getVisibility();
        int i = impl.r;
        if (visibility != 0) {
            if (i == 2) {
                return;
            }
        } else if (i != 1) {
            return;
        }
        Animator animator = impl.m;
        if (animator != null) {
            animator.cancel();
        }
        boolean z = impl.n == null;
        if (!floatingActionButton2.isLaidOut() || floatingActionButton2.isInEditMode()) {
            floatingActionButton.a(0, false);
            floatingActionButton.setAlpha(1.0f);
            floatingActionButton.setScaleY(1.0f);
            floatingActionButton.setScaleX(1.0f);
            impl.p = 1.0f;
            impl.a(1.0f, matrix);
            floatingActionButton2.setImageMatrix(matrix);
            return;
        }
        if (floatingActionButton.getVisibility() != 0) {
            floatingActionButton.setAlpha(0.0f);
            floatingActionButton.setScaleY(z ? 0.4f : 0.0f);
            floatingActionButton.setScaleX(z ? 0.4f : 0.0f);
            float f = z ? 0.4f : 0.0f;
            impl.p = f;
            impl.a(f, matrix);
            floatingActionButton2.setImageMatrix(matrix);
        }
        r20 r20Var = impl.n;
        AnimatorSet b = r20Var != null ? impl.b(r20Var, 1.0f, 1.0f, 1.0f) : impl.c(1.0f, 1.0f, 1.0f, so.z, so.A);
        b.addListener(new z0(5, impl));
        b.start();
    }

    @Override // android.widget.ImageButton, android.widget.ImageView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.g;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.h;
    }

    @Override // defpackage.gg
    public hg getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().s.getElevation();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().i;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().j;
    }

    public Drawable getContentBackground() {
        return getImpl().e;
    }

    public int getCustomSize() {
        return this.m;
    }

    public int getExpandedComponentIdHint() {
        return this.t.b;
    }

    public r20 getHideMotionSpec() {
        return getImpl().o;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.k;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.k;
    }

    public gd0 getShapeAppearanceModel() {
        gd0 gd0Var = getImpl().a;
        gd0Var.getClass();
        return gd0Var;
    }

    public r20 getShowMotionSpec() {
        return getImpl().n;
    }

    public int getSize() {
        return this.l;
    }

    public int getSizeDimension() {
        return c(this.l);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.i;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.j;
    }

    public boolean getUseCompatPadding() {
        return this.p;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        so impl = getImpl();
        ro roVar = impl.b;
        if (roVar != null) {
            d50.Y(impl.s, roVar);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().s.getViewTreeObserver();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.n = (sizeDimension - this.o) / 2;
        getImpl().h();
        int min = Math.min(View.resolveSize(sizeDimension, i), View.resolveSize(sizeDimension, i2));
        Rect rect = this.q;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ao)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ao aoVar = (ao) parcelable;
        super.onRestoreInstanceState(aoVar.f);
        Bundle bundle = (Bundle) aoVar.h.get("expandableWidgetHelper");
        bundle.getClass();
        c cVar = this.t;
        cVar.getClass();
        cVar.a = bundle.getBoolean("expanded", false);
        cVar.b = bundle.getInt("expandedComponentIdHint", 0);
        if (cVar.a) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) cVar.c;
            ViewParent parent = floatingActionButton.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).i(floatingActionButton);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        ao aoVar = new ao(onSaveInstanceState);
        c cVar = this.t;
        cVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", cVar.a);
        bundle.putInt("expandedComponentIdHint", cVar.b);
        aoVar.h.put("expandableWidgetHelper", bundle);
        return aoVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.r;
            rect.set(0, 0, measuredWidth, measuredHeight);
            int i = rect.left;
            Rect rect2 = this.q;
            rect.left = i + rect2.left;
            rect.top += rect2.top;
            rect.right -= rect2.right;
            rect.bottom -= rect2.bottom;
            so soVar = this.u;
            int i2 = -(soVar.f ? Math.max((soVar.k - soVar.s.getSizeDimension()) / 2, 0) : 0);
            rect.inset(i2, i2);
            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.g != colorStateList) {
            this.g = colorStateList;
            so impl = getImpl();
            ro roVar = impl.b;
            if (roVar != null) {
                roVar.setTintList(colorStateList);
            }
            a9 a9Var = impl.d;
            if (a9Var != null) {
                if (colorStateList != null) {
                    a9Var.m = colorStateList.getColorForState(a9Var.getState(), a9Var.m);
                }
                a9Var.p = colorStateList;
                a9Var.n = true;
                a9Var.invalidateSelf();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.h != mode) {
            this.h = mode;
            ro roVar = getImpl().b;
            if (roVar != null) {
                roVar.setTintMode(mode);
            }
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        setTooltipText(isClickable() ? getContentDescription() : null);
    }

    public void setCompatElevation(float f) {
        so impl = getImpl();
        if (impl.h != f) {
            impl.h = f;
            impl.e(f, impl.i, impl.j);
        }
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        so impl = getImpl();
        if (impl.i != f) {
            impl.i = f;
            impl.e(impl.h, f, impl.j);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        so impl = getImpl();
        if (impl.j != f) {
            impl.j = f;
            impl.e(impl.h, impl.i, f);
        }
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    @Override // android.view.View
    public void setContentDescription(CharSequence charSequence) {
        super.setContentDescription(charSequence);
        setTooltipText(isClickable() ? getContentDescription() : null);
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            s9.k("Custom size must be non-negative");
        } else if (i != this.m) {
            this.m = i;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        ro roVar = getImpl().b;
        if (roVar != null) {
            roVar.q(f);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().f) {
            getImpl().f = z;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        this.t.b = i;
    }

    public void setHideMotionSpec(r20 r20Var) {
        getImpl().o = r20Var;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(r20.b(getContext(), i));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            so impl = getImpl();
            float f = impl.p;
            impl.p = f;
            Matrix matrix = impl.x;
            impl.a(f, matrix);
            impl.s.setImageMatrix(matrix);
            if (this.i != null) {
                e();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.s.j(i);
        e();
    }

    public void setMaxImageSize(int i) {
        this.o = i;
        so impl = getImpl();
        if (impl.q != i) {
            impl.q = i;
            float f = impl.p;
            impl.p = f;
            Matrix matrix = impl.x;
            impl.a(f, matrix);
            impl.s.setImageMatrix(matrix);
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.k != colorStateList) {
            this.k = colorStateList;
            so impl = getImpl();
            ColorStateList colorStateList2 = this.k;
            RippleDrawable rippleDrawable = impl.c;
            if (rippleDrawable != null) {
                rippleDrawable.setColor(ba0.a(colorStateList2));
            } else if (rippleDrawable != null) {
                rippleDrawable.setTintList(ba0.a(colorStateList2));
            }
        }
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        super.setScaleX(f);
        getImpl().getClass();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        super.setScaleY(f);
        getImpl().getClass();
    }

    public void setShadowPaddingEnabled(boolean z) {
        so impl = getImpl();
        impl.g = z;
        impl.h();
    }

    @Override // defpackage.rd0
    public void setShapeAppearanceModel(gd0 gd0Var) {
        getImpl().g(gd0Var);
    }

    public void setShowMotionSpec(r20 r20Var) {
        getImpl().n = r20Var;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(r20.b(getContext(), i));
    }

    public void setSize(int i) {
        this.m = 0;
        if (i != this.l) {
            this.l = i;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.i != colorStateList) {
            this.i = colorStateList;
            e();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.j != mode) {
            this.j = mode;
            e();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().f();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().f();
    }

    @Override // android.view.View
    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().f();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.p != z) {
            this.p = z;
            getImpl().h();
        }
    }

    @Override // defpackage.pn0, android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    /* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
    public static class BaseBehavior<T extends FloatingActionButton> extends hg {
        public Rect a;
        public final boolean b;

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c70.k);
            this.b = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }

        @Override // defpackage.hg
        public final boolean e(Rect rect, View view) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.q;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // defpackage.hg
        public final void g(kg kgVar) {
            if (kgVar.h == 0) {
                kgVar.h = 80;
            }
        }

        @Override // defpackage.hg
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                w(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof kg ? ((kg) layoutParams).a instanceof BottomSheetBehavior : false) {
                    x(view2, floatingActionButton);
                }
            }
            return false;
        }

        @Override // defpackage.hg
        public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            ArrayList k = coordinatorLayout.k(floatingActionButton);
            int size = k.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                View view2 = (View) k.get(i3);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof kg ? ((kg) layoutParams).a instanceof BottomSheetBehavior : false) && x(view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (w(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.r(floatingActionButton, i);
            Rect rect = floatingActionButton.q;
            if (rect.centerX() > 0 && rect.centerY() > 0) {
                kg kgVar = (kg) floatingActionButton.getLayoutParams();
                int i4 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) kgVar).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) kgVar).leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) kgVar).bottomMargin) {
                    i2 = rect.bottom;
                } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) kgVar).topMargin) {
                    i2 = -rect.top;
                }
                if (i2 != 0) {
                    WeakHashMap weakHashMap = hm0.a;
                    floatingActionButton.offsetTopAndBottom(i2);
                }
                if (i4 != 0) {
                    WeakHashMap weakHashMap2 = hm0.a;
                    floatingActionButton.offsetLeftAndRight(i4);
                }
            }
            return true;
        }

        public final boolean w(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            kg kgVar = (kg) floatingActionButton.getLayoutParams();
            if (!this.b || kgVar.f != appBarLayout.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            if (this.a == null) {
                this.a = new Rect();
            }
            Rect rect = this.a;
            nj.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.d();
                return true;
            }
            floatingActionButton.f();
            return true;
        }

        public final boolean x(View view, FloatingActionButton floatingActionButton) {
            kg kgVar = (kg) floatingActionButton.getLayoutParams();
            if (!this.b || kgVar.f != view.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((kg) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.d();
                return true;
            }
            floatingActionButton.f();
            return true;
        }

        public BaseBehavior() {
            this.b = true;
        }
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }
}
