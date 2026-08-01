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
import com.awerser.monnit.betplay.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.focus.FocusRingDrawable;
import defpackage.bv;
import defpackage.c;
import defpackage.c10;
import defpackage.cj;
import defpackage.d5;
import defpackage.dj;
import defpackage.e90;
import defpackage.f8;
import defpackage.h30;
import defpackage.j1;
import defpackage.ki;
import defpackage.l70;
import defpackage.ly;
import defpackage.mi;
import defpackage.n20;
import defpackage.o8;
import defpackage.oi;
import defpackage.op;
import defpackage.pa0;
import defpackage.qd;
import defpackage.rd;
import defpackage.ud;
import defpackage.vw;
import defpackage.x0;
import defpackage.y20;
import defpackage.y4;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class FloatingActionButton extends pa0 implements ki, y20, qd {
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
    public final d5 s;
    public final c t;
    public dj u;

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        super(op.Z(context, attributeSet, R.attr.floatingActionButtonStyle, R.style.Widget_Design_FloatingActionButton), attributeSet, R.attr.floatingActionButtonStyle);
        ColorStateList colorStateList;
        FloatingActionButton floatingActionButton;
        Drawable drawable;
        Drawable drawable2;
        this.f = getVisibility();
        this.q = new Rect();
        this.r = new Rect();
        Context context2 = getContext();
        TypedArray Z = vw.Z(context2, attributeSet, ly.h, R.attr.floatingActionButtonStyle, R.style.Widget_Design_FloatingActionButton, new int[0]);
        this.g = op.x(context2, Z, 1);
        this.h = l70.H(Z.getInt(2, -1), null);
        this.k = op.x(context2, Z, 12);
        this.l = Z.getInt(7, -1);
        this.m = Z.getDimensionPixelSize(6, 0);
        int dimensionPixelSize = Z.getDimensionPixelSize(3, 0);
        float dimension = Z.getDimension(4, 0.0f);
        float dimension2 = Z.getDimension(9, 0.0f);
        float dimension3 = Z.getDimension(11, 0.0f);
        this.p = Z.getBoolean(16, false);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        setMaxImageSize(Z.getDimensionPixelSize(10, 0));
        bv a = bv.a(context2, Z, 15);
        bv a2 = bv.a(context2, Z, 8);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, ly.y, R.attr.floatingActionButtonStyle, R.style.Widget_Design_FloatingActionButton);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context2, resourceId);
        if (resourceId2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
        }
        n20 a3 = n20.h(contextThemeWrapper.obtainStyledAttributes(ly.F), n20.m).a();
        boolean z = Z.getBoolean(5, false);
        setEnabled(Z.getBoolean(0, true));
        Z.recycle();
        d5 d5Var = new d5(this);
        this.s = d5Var;
        d5Var.b(attributeSet, R.attr.floatingActionButtonStyle);
        this.t = new c(this);
        getImpl().g(a3);
        dj impl = getImpl();
        ColorStateList colorStateList2 = this.g;
        PorterDuff.Mode mode = this.h;
        ColorStateList colorStateList3 = this.k;
        FloatingActionButton floatingActionButton2 = impl.s;
        n20 n20Var = impl.a;
        n20Var.getClass();
        cj cjVar = new cj(n20Var);
        impl.b = cjVar;
        cjVar.setTintList(colorStateList2);
        if (mode != null) {
            impl.b.setTintMode(mode);
        }
        impl.b.n(floatingActionButton2.getContext());
        if (dimensionPixelSize > 0) {
            Context context3 = floatingActionButton2.getContext();
            n20 n20Var2 = impl.a;
            n20Var2.getClass();
            f8 f8Var = new f8(n20Var2);
            int color = context3.getColor(R.color.design_fab_stroke_top_outer_color);
            colorStateList = colorStateList3;
            int color2 = context3.getColor(R.color.design_fab_stroke_top_inner_color);
            floatingActionButton = floatingActionButton2;
            int color3 = context3.getColor(R.color.design_fab_stroke_end_inner_color);
            int color4 = context3.getColor(R.color.design_fab_stroke_end_outer_color);
            f8Var.i = color;
            f8Var.j = color2;
            f8Var.k = color3;
            f8Var.l = color4;
            float f = dimensionPixelSize;
            if (f8Var.h != f) {
                f8Var.h = f;
                f8Var.b.setStrokeWidth(f * 1.3333f);
                f8Var.n = true;
                f8Var.invalidateSelf();
            }
            if (colorStateList2 != null) {
                f8Var.m = colorStateList2.getColorForState(f8Var.getState(), f8Var.m);
            }
            f8Var.p = colorStateList2;
            f8Var.n = true;
            f8Var.invalidateSelf();
            impl.d = f8Var;
            f8 f8Var2 = impl.d;
            f8Var2.getClass();
            cj cjVar2 = impl.b;
            cjVar2.getClass();
            drawable2 = new LayerDrawable(new Drawable[]{f8Var2, cjVar2});
            drawable = null;
        } else {
            colorStateList = colorStateList3;
            floatingActionButton = floatingActionButton2;
            drawable = null;
            impl.d = null;
            drawable2 = impl.b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(c10.a(colorStateList), drawable2, drawable);
        impl.c = rippleDrawable;
        FocusRingDrawable.e(floatingActionButton.getContext(), rippleDrawable, impl.b);
        impl.e = rippleDrawable;
        getImpl().k = dimensionPixelSize2;
        dj impl2 = getImpl();
        if (impl2.h != dimension) {
            impl2.h = dimension;
            impl2.e(dimension, impl2.i, impl2.j);
        }
        dj impl3 = getImpl();
        if (impl3.i != dimension2) {
            impl3.i = dimension2;
            impl3.e(impl3.h, dimension2, impl3.j);
        }
        dj impl4 = getImpl();
        if (impl4.j != dimension3) {
            impl4.j = dimension3;
            impl4.e(impl4.h, impl4.i, dimension3);
        }
        getImpl().n = a;
        getImpl().o = a2;
        getImpl().f = z;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private dj getImpl() {
        if (this.u == null) {
            this.u = new dj(this, new j1(17, this));
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
        dj impl = getImpl();
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
        bv bvVar = impl.o;
        AnimatorSet b = bvVar != null ? impl.b(bvVar, 0.0f, 0.0f, 0.0f) : impl.c(0.0f, 0.4f, 0.4f, dj.B, dj.C);
        b.addListener(new oi(impl));
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
        drawable.mutate().setColorFilter(y4.c(colorForState, mode));
    }

    public final void f() {
        dj impl = getImpl();
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
        bv bvVar = impl.n;
        AnimatorSet b = bvVar != null ? impl.b(bvVar, 1.0f, 1.0f, 1.0f) : impl.c(1.0f, 1.0f, 1.0f, dj.z, dj.A);
        b.addListener(new x0(4, impl));
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

    @Override // defpackage.qd
    public rd getBehavior() {
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

    public bv getHideMotionSpec() {
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

    public n20 getShapeAppearanceModel() {
        n20 n20Var = getImpl().a;
        n20Var.getClass();
        return n20Var;
    }

    public bv getShowMotionSpec() {
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
        dj impl = getImpl();
        cj cjVar = impl.b;
        if (cjVar != null) {
            vw.j0(impl.s, cjVar);
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
        if (!(parcelable instanceof mi)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        mi miVar = (mi) parcelable;
        super.onRestoreInstanceState(miVar.getSuperState());
        Bundle bundle = (Bundle) miVar.f.get("expandableWidgetHelper");
        bundle.getClass();
        c cVar = this.t;
        cVar.getClass();
        cVar.a = bundle.getBoolean("expanded", false);
        cVar.b = bundle.getInt("expandedComponentIdHint", 0);
        if (cVar.a) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) cVar.c;
            ViewParent parent = floatingActionButton.getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                List list = (List) ((h30) coordinatorLayout.g.g).get(floatingActionButton);
                if (list == null || list.isEmpty()) {
                    return;
                }
                for (int i = 0; i < list.size(); i++) {
                    View view = (View) list.get(i);
                    rd rdVar = ((ud) view.getLayoutParams()).a;
                    if (rdVar != null) {
                        rdVar.onDependentViewChanged(coordinatorLayout, view, floatingActionButton);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        mi miVar = new mi(onSaveInstanceState);
        c cVar = this.t;
        cVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", cVar.a);
        bundle.putInt("expandedComponentIdHint", cVar.b);
        miVar.f.put("expandableWidgetHelper", bundle);
        return miVar;
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
            dj djVar = this.u;
            int i2 = -(djVar.f ? Math.max((djVar.k - djVar.s.getSizeDimension()) / 2, 0) : 0);
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
            dj impl = getImpl();
            cj cjVar = impl.b;
            if (cjVar != null) {
                cjVar.setTintList(colorStateList);
            }
            f8 f8Var = impl.d;
            if (f8Var != null) {
                if (colorStateList != null) {
                    f8Var.m = colorStateList.getColorForState(f8Var.getState(), f8Var.m);
                }
                f8Var.p = colorStateList;
                f8Var.n = true;
                f8Var.invalidateSelf();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.h != mode) {
            this.h = mode;
            cj cjVar = getImpl().b;
            if (cjVar != null) {
                cjVar.setTintMode(mode);
            }
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        setTooltipText(isClickable() ? getContentDescription() : null);
    }

    public void setCompatElevation(float f) {
        dj impl = getImpl();
        if (impl.h != f) {
            impl.h = f;
            impl.e(f, impl.i, impl.j);
        }
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        dj impl = getImpl();
        if (impl.i != f) {
            impl.i = f;
            impl.e(impl.h, f, impl.j);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        dj impl = getImpl();
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
            o8.j("Custom size must be non-negative");
        } else if (i != this.m) {
            this.m = i;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        cj cjVar = getImpl().b;
        if (cjVar != null) {
            cjVar.q(f);
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

    public void setHideMotionSpec(bv bvVar) {
        getImpl().o = bvVar;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(bv.b(getContext(), i));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            dj impl = getImpl();
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
        this.s.c(i);
        e();
    }

    public void setMaxImageSize(int i) {
        this.o = i;
        dj impl = getImpl();
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
            dj impl = getImpl();
            ColorStateList colorStateList2 = this.k;
            RippleDrawable rippleDrawable = impl.c;
            if (rippleDrawable != null) {
                rippleDrawable.setColor(c10.a(colorStateList2));
            } else if (rippleDrawable != null) {
                rippleDrawable.setTintList(c10.a(colorStateList2));
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
        dj impl = getImpl();
        impl.g = z;
        impl.h();
    }

    @Override // defpackage.y20
    public void setShapeAppearanceModel(n20 n20Var) {
        getImpl().g(n20Var);
    }

    public void setShowMotionSpec(bv bvVar) {
        getImpl().n = bvVar;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(bv.b(getContext(), i));
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

    @Override // defpackage.pa0, android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    /* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
    public static class BaseBehavior<T extends FloatingActionButton> extends rd {
        public final boolean a;

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ly.i);
            this.a = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }

        public final boolean a(View view, FloatingActionButton floatingActionButton) {
            ud udVar = (ud) floatingActionButton.getLayoutParams();
            if (!this.a || udVar.f != view.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((ud) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.d();
                return true;
            }
            floatingActionButton.f();
            return true;
        }

        @Override // defpackage.rd
        public final boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.q;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // defpackage.rd
        public final void onAttachedToLayoutParams(ud udVar) {
            if (udVar.h == 0) {
                udVar.h = 80;
            }
        }

        @Override // defpackage.rd
        public final boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams instanceof ud ? ((ud) layoutParams).a instanceof BottomSheetBehavior : false) {
                a(view2, floatingActionButton);
            }
            return false;
        }

        @Override // defpackage.rd
        public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            ArrayList j = coordinatorLayout.j(floatingActionButton);
            int size = j.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                View view2 = (View) j.get(i3);
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if ((layoutParams instanceof ud ? ((ud) layoutParams).a instanceof BottomSheetBehavior : false) && a(view2, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.q(floatingActionButton, i);
            Rect rect = floatingActionButton.q;
            if (rect.centerX() > 0 && rect.centerY() > 0) {
                ud udVar = (ud) floatingActionButton.getLayoutParams();
                int i4 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) udVar).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) udVar).leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) udVar).bottomMargin) {
                    i2 = rect.bottom;
                } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) udVar).topMargin) {
                    i2 = -rect.top;
                }
                if (i2 != 0) {
                    WeakHashMap weakHashMap = e90.a;
                    floatingActionButton.offsetTopAndBottom(i2);
                }
                if (i4 != 0) {
                    WeakHashMap weakHashMap2 = e90.a;
                    floatingActionButton.offsetLeftAndRight(i4);
                }
            }
            return true;
        }

        public BaseBehavior() {
            this.a = true;
        }
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }
}
