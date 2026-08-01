package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import defpackage.bi;
import defpackage.c70;
import defpackage.d50;
import defpackage.e10;
import defpackage.g10;
import defpackage.gd0;
import defpackage.gf0;
import defpackage.mv;
import defpackage.n9;
import defpackage.oa;
import defpackage.rd0;
import defpackage.t00;
import defpackage.ue0;
import defpackage.v00;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class MaterialCardView extends oa implements Checkable, rd0 {
    public static final int[] p = {R.attr.state_checkable};
    public static final int[] q = {R.attr.state_checked};
    public static final int[] r = {com.trembin.nirefon.betfury.R.attr.state_dragged};
    public static final int[] s = {R.attr.state_hovered};
    public final v00 l;
    public final boolean m;
    public boolean n;
    public boolean o;

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        super(mv.V(context, attributeSet, com.trembin.nirefon.betfury.R.attr.materialCardViewStyle, com.trembin.nirefon.betfury.R.style.Widget_MaterialComponents_CardView), attributeSet);
        gf0 h;
        this.n = false;
        this.o = false;
        this.m = true;
        TypedArray E = d50.E(getContext(), attributeSet, c70.v, com.trembin.nirefon.betfury.R.attr.materialCardViewStyle, com.trembin.nirefon.betfury.R.style.Widget_MaterialComponents_CardView, new int[0]);
        v00 v00Var = new v00(this, attributeSet);
        this.l = v00Var;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        g10 g10Var = v00Var.c;
        g10Var.r(cardBackgroundColor);
        v00Var.b.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        v00Var.l();
        MaterialCardView materialCardView = v00Var.a;
        ColorStateList r2 = mv.r(materialCardView.getContext(), E, 11);
        v00Var.o = r2;
        if (r2 == null) {
            v00Var.o = ColorStateList.valueOf(-1);
        }
        v00Var.i = E.getDimensionPixelSize(12, 0);
        boolean z = E.getBoolean(0, false);
        v00Var.t = z;
        materialCardView.setLongClickable(z);
        v00Var.m = mv.r(materialCardView.getContext(), E, 6);
        v00Var.g(mv.s(materialCardView.getContext(), E, 2));
        v00Var.g = E.getDimensionPixelSize(5, 0);
        v00Var.f = E.getDimensionPixelSize(4, 0);
        v00Var.h = E.getInteger(3, 8388661);
        ColorStateList r3 = mv.r(materialCardView.getContext(), E, 7);
        v00Var.l = r3;
        if (r3 == null) {
            v00Var.l = ColorStateList.valueOf(bi.W(materialCardView.getContext(), n9.M(materialCardView, com.trembin.nirefon.betfury.R.attr.colorControlHighlight)));
        }
        ColorStateList r4 = mv.r(materialCardView.getContext(), E, 1);
        r4 = r4 == null ? ColorStateList.valueOf(0) : r4;
        g10 g10Var2 = v00Var.d;
        g10Var2.r(r4);
        RippleDrawable rippleDrawable = v00Var.p;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(v00Var.l);
        }
        g10Var.q(materialCardView.getCardElevation());
        float f = v00Var.i;
        ColorStateList colorStateList = v00Var.o;
        g10Var2.g.j = f;
        g10Var2.invalidateSelf();
        e10 e10Var = g10Var2.g;
        if (e10Var.d != colorStateList) {
            e10Var.d = colorStateList;
            g10Var2.onStateChange(g10Var2.getState());
        }
        materialCardView.setBackgroundInternal(v00Var.d(g10Var));
        Drawable c = v00Var.j() ? v00Var.c() : g10Var2;
        v00Var.j = c;
        materialCardView.setForeground(v00Var.d(c));
        if (v00Var.e == -1.0f && (h = gf0.h(materialCardView.getContext(), E, 8)) != null) {
            ue0 T = d50.T(materialCardView.getContext());
            g10Var.p(T);
            g10Var2.p(T);
            g10 g10Var3 = v00Var.r;
            if (g10Var3 != null) {
                g10Var3.p(T);
            }
            v00Var.h(h);
        }
        E.recycle();
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.l.c.getBounds());
        return rectF;
    }

    public final void b() {
        v00 v00Var;
        RippleDrawable rippleDrawable;
        if (Build.VERSION.SDK_INT <= 26 || (rippleDrawable = (v00Var = this.l).p) == null) {
            return;
        }
        Rect bounds = rippleDrawable.getBounds();
        int i = bounds.bottom;
        v00Var.p.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
        v00Var.p.setBounds(bounds.left, bounds.top, bounds.right, i);
    }

    @Override // defpackage.oa
    public ColorStateList getCardBackgroundColor() {
        return this.l.c.g.c;
    }

    public ColorStateList getCardForegroundColor() {
        return this.l.d.g.c;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.l.k;
    }

    public int getCheckedIconGravity() {
        return this.l.h;
    }

    public int getCheckedIconMargin() {
        return this.l.f;
    }

    public int getCheckedIconSize() {
        return this.l.g;
    }

    public ColorStateList getCheckedIconTint() {
        return this.l.m;
    }

    @Override // defpackage.oa
    public int getContentPaddingBottom() {
        return this.l.b.bottom;
    }

    @Override // defpackage.oa
    public int getContentPaddingLeft() {
        return this.l.b.left;
    }

    @Override // defpackage.oa
    public int getContentPaddingRight() {
        return this.l.b.right;
    }

    @Override // defpackage.oa
    public int getContentPaddingTop() {
        return this.l.b.top;
    }

    public float getProgress() {
        return this.l.c.g.i;
    }

    @Override // defpackage.oa
    public float getRadius() {
        return this.l.c.k();
    }

    public ColorStateList getRippleColor() {
        return this.l.l;
    }

    public gd0 getShapeAppearanceModel() {
        return this.l.n.d();
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.l.o;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.l.o;
    }

    public int getStrokeWidth() {
        return this.l.i;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.n;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        v00 v00Var = this.l;
        v00Var.k();
        d50.Y(this, v00Var.c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 8);
        v00 v00Var = this.l;
        if (v00Var != null && v00Var.t) {
            View.mergeDrawableStates(onCreateDrawableState, p);
        }
        if (this.n) {
            View.mergeDrawableStates(onCreateDrawableState, q);
        }
        if (this.o) {
            View.mergeDrawableStates(onCreateDrawableState, r);
        }
        if (isDuplicateParentStateEnabled()) {
            if (isPressed()) {
                View.mergeDrawableStates(onCreateDrawableState, FrameLayout.PRESSED_STATE_SET);
            }
            if (isHovered()) {
                View.mergeDrawableStates(onCreateDrawableState, s);
            }
            if (isEnabled()) {
                View.mergeDrawableStates(onCreateDrawableState, FrameLayout.ENABLED_STATE_SET);
            }
            if (isFocused()) {
                View.mergeDrawableStates(onCreateDrawableState, FrameLayout.FOCUSED_STATE_SET);
            }
            if (isSelected()) {
                View.mergeDrawableStates(onCreateDrawableState, FrameLayout.SELECTED_STATE_SET);
            }
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.n);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        v00 v00Var = this.l;
        accessibilityNodeInfo.setCheckable(v00Var != null && v00Var.t);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.n);
    }

    @Override // defpackage.oa, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.l.e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.m) {
            v00 v00Var = this.l;
            if (!v00Var.s) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                v00Var.s = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // defpackage.oa
    public void setCardBackgroundColor(int i) {
        this.l.c.r(ColorStateList.valueOf(i));
    }

    @Override // defpackage.oa
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        v00 v00Var = this.l;
        v00Var.c.q(v00Var.a.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        g10 g10Var = this.l.d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        g10Var.r(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.l.t = z;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.n != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.l.g(drawable);
    }

    public void setCheckedIconGravity(int i) {
        v00 v00Var = this.l;
        if (v00Var.h != i) {
            v00Var.h = i;
            MaterialCardView materialCardView = v00Var.a;
            v00Var.e(materialCardView.getMeasuredWidth(), materialCardView.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(int i) {
        this.l.f = i;
    }

    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.l.f = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconResource(int i) {
        this.l.g(d50.v(getContext(), i));
    }

    public void setCheckedIconSize(int i) {
        this.l.g = i;
    }

    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.l.g = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        v00 v00Var = this.l;
        v00Var.m = colorStateList;
        Drawable drawable = v00Var.k;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        v00 v00Var = this.l;
        if (v00Var != null) {
            v00Var.k();
        }
    }

    public void setDragged(boolean z) {
        if (this.o != z) {
            this.o = z;
            refreshDrawableState();
            b();
            invalidate();
        }
    }

    @Override // defpackage.oa
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.l.m();
    }

    @Override // defpackage.oa
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        v00 v00Var = this.l;
        v00Var.m();
        v00Var.l();
    }

    public void setProgress(float f) {
        v00 v00Var = this.l;
        v00Var.c.s(f);
        g10 g10Var = v00Var.d;
        if (g10Var != null) {
            g10Var.s(f);
        }
        g10 g10Var2 = v00Var.r;
        if (g10Var2 != null) {
            g10Var2.s(f);
        }
    }

    @Override // defpackage.oa
    public void setRadius(float f) {
        super.setRadius(f);
        v00 v00Var = this.l;
        v00Var.e = f;
        v00Var.h(v00Var.n.d().a(f));
        v00Var.j.invalidateSelf();
        if (v00Var.i() || (v00Var.a.getPreventCornerOverlap() && !v00Var.c.o())) {
            v00Var.l();
        }
        if (v00Var.i()) {
            v00Var.m();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        v00 v00Var = this.l;
        v00Var.l = colorStateList;
        RippleDrawable rippleDrawable = v00Var.p;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        ColorStateList A = bi.A(getContext(), i);
        v00 v00Var = this.l;
        v00Var.l = A;
        RippleDrawable rippleDrawable = v00Var.p;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(A);
        }
    }

    @Override // defpackage.rd0
    public void setShapeAppearanceModel(gd0 gd0Var) {
        setClipToOutline(gd0Var.j(getBoundsAsRectF()));
        this.l.h(gd0Var);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        v00 v00Var = this.l;
        if (v00Var.o != colorStateList) {
            v00Var.o = colorStateList;
            g10 g10Var = v00Var.d;
            g10Var.g.j = v00Var.i;
            g10Var.invalidateSelf();
            e10 e10Var = g10Var.g;
            if (e10Var.d != colorStateList) {
                e10Var.d = colorStateList;
                g10Var.onStateChange(g10Var.getState());
            }
        }
        invalidate();
    }

    public void setStrokeWidth(int i) {
        v00 v00Var = this.l;
        if (i != v00Var.i) {
            v00Var.i = i;
            g10 g10Var = v00Var.d;
            ColorStateList colorStateList = v00Var.o;
            g10Var.g.j = i;
            g10Var.invalidateSelf();
            e10 e10Var = g10Var.g;
            if (e10Var.d != colorStateList) {
                e10Var.d = colorStateList;
                g10Var.onStateChange(g10Var.getState());
            }
        }
        invalidate();
    }

    @Override // defpackage.oa
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        v00 v00Var = this.l;
        v00Var.m();
        v00Var.l();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        v00 v00Var = this.l;
        if (v00Var != null && v00Var.t && isEnabled()) {
            this.n = !this.n;
            refreshDrawableState();
            b();
            v00Var.f(this.n, true);
        }
    }

    @Override // defpackage.oa
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.l.c.r(colorStateList);
    }

    public void setStrokeColor(int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public void setOnCheckedChangeListener(t00 t00Var) {
    }
}
