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
import defpackage.at;
import defpackage.ct;
import defpackage.d20;
import defpackage.e70;
import defpackage.i9;
import defpackage.jw;
import defpackage.m30;
import defpackage.o20;
import defpackage.o8;
import defpackage.ps;
import defpackage.rs;
import defpackage.vx;
import defpackage.x30;
import defpackage.zo;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public class MaterialCardView extends i9 implements Checkable, o20 {
    public static final int[] p = {R.attr.state_checkable};
    public static final int[] q = {R.attr.state_checked};
    public static final int[] r = {com.derinko.gbini.n1casino.R.attr.state_dragged};
    public static final int[] s = {R.attr.state_hovered};
    public final rs l;
    public final boolean m;
    public boolean n;
    public boolean o;

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        super(e70.W(context, attributeSet, com.derinko.gbini.n1casino.R.attr.materialCardViewStyle, com.derinko.gbini.n1casino.R.style.Widget_MaterialComponents_CardView), attributeSet);
        x30 h;
        this.n = false;
        this.o = false;
        this.m = true;
        TypedArray W = o8.W(getContext(), attributeSet, vx.t, com.derinko.gbini.n1casino.R.attr.materialCardViewStyle, com.derinko.gbini.n1casino.R.style.Widget_MaterialComponents_CardView, new int[0]);
        rs rsVar = new rs(this, attributeSet);
        this.l = rsVar;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        ct ctVar = rsVar.c;
        ctVar.r(cardBackgroundColor);
        rsVar.b.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        rsVar.l();
        MaterialCardView materialCardView = rsVar.a;
        ColorStateList y = e70.y(materialCardView.getContext(), W, 11);
        rsVar.o = y;
        if (y == null) {
            rsVar.o = ColorStateList.valueOf(-1);
        }
        rsVar.i = W.getDimensionPixelSize(12, 0);
        boolean z = W.getBoolean(0, false);
        rsVar.t = z;
        materialCardView.setLongClickable(z);
        rsVar.m = e70.y(materialCardView.getContext(), W, 6);
        rsVar.g(e70.z(materialCardView.getContext(), W, 2));
        rsVar.g = W.getDimensionPixelSize(5, 0);
        rsVar.f = W.getDimensionPixelSize(4, 0);
        rsVar.h = W.getInteger(3, 8388661);
        ColorStateList y2 = e70.y(materialCardView.getContext(), W, 7);
        rsVar.l = y2;
        if (y2 == null) {
            rsVar.l = ColorStateList.valueOf(jw.X(materialCardView.getContext(), zo.L(materialCardView, com.derinko.gbini.n1casino.R.attr.colorControlHighlight)));
        }
        ColorStateList y3 = e70.y(materialCardView.getContext(), W, 1);
        y3 = y3 == null ? ColorStateList.valueOf(0) : y3;
        ct ctVar2 = rsVar.d;
        ctVar2.r(y3);
        RippleDrawable rippleDrawable = rsVar.p;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(rsVar.l);
        }
        ctVar.q(materialCardView.getCardElevation());
        float f = rsVar.i;
        ColorStateList colorStateList = rsVar.o;
        ctVar2.g.j = f;
        ctVar2.invalidateSelf();
        at atVar = ctVar2.g;
        if (atVar.d != colorStateList) {
            atVar.d = colorStateList;
            ctVar2.onStateChange(ctVar2.getState());
        }
        materialCardView.setBackgroundInternal(rsVar.d(ctVar));
        Drawable c = rsVar.j() ? rsVar.c() : ctVar2;
        rsVar.j = c;
        materialCardView.setForeground(rsVar.d(c));
        if (rsVar.e == -1.0f && (h = x30.h(materialCardView.getContext(), W, 8)) != null) {
            m30 k0 = o8.k0(materialCardView.getContext());
            ctVar.p(k0);
            ctVar2.p(k0);
            ct ctVar3 = rsVar.r;
            if (ctVar3 != null) {
                ctVar3.p(k0);
            }
            rsVar.h(h);
        }
        W.recycle();
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.l.c.getBounds());
        return rectF;
    }

    public final void b() {
        rs rsVar;
        RippleDrawable rippleDrawable;
        if (Build.VERSION.SDK_INT <= 26 || (rippleDrawable = (rsVar = this.l).p) == null) {
            return;
        }
        Rect bounds = rippleDrawable.getBounds();
        int i = bounds.bottom;
        rsVar.p.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
        rsVar.p.setBounds(bounds.left, bounds.top, bounds.right, i);
    }

    @Override // defpackage.i9
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

    @Override // defpackage.i9
    public int getContentPaddingBottom() {
        return this.l.b.bottom;
    }

    @Override // defpackage.i9
    public int getContentPaddingLeft() {
        return this.l.b.left;
    }

    @Override // defpackage.i9
    public int getContentPaddingRight() {
        return this.l.b.right;
    }

    @Override // defpackage.i9
    public int getContentPaddingTop() {
        return this.l.b.top;
    }

    public float getProgress() {
        return this.l.c.g.i;
    }

    @Override // defpackage.i9
    public float getRadius() {
        return this.l.c.k();
    }

    public ColorStateList getRippleColor() {
        return this.l.l;
    }

    public d20 getShapeAppearanceModel() {
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
        rs rsVar = this.l;
        rsVar.k();
        o8.m0(this, rsVar.c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 8);
        rs rsVar = this.l;
        if (rsVar != null && rsVar.t) {
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
        rs rsVar = this.l;
        accessibilityNodeInfo.setCheckable(rsVar != null && rsVar.t);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.n);
    }

    @Override // defpackage.i9, android.widget.FrameLayout, android.view.View
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
            rs rsVar = this.l;
            if (!rsVar.s) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                rsVar.s = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // defpackage.i9
    public void setCardBackgroundColor(int i) {
        this.l.c.r(ColorStateList.valueOf(i));
    }

    @Override // defpackage.i9
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        rs rsVar = this.l;
        rsVar.c.q(rsVar.a.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        ct ctVar = this.l.d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        ctVar.r(colorStateList);
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
        rs rsVar = this.l;
        if (rsVar.h != i) {
            rsVar.h = i;
            MaterialCardView materialCardView = rsVar.a;
            rsVar.e(materialCardView.getMeasuredWidth(), materialCardView.getMeasuredHeight());
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
        this.l.g(zo.s(getContext(), i));
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
        rs rsVar = this.l;
        rsVar.m = colorStateList;
        Drawable drawable = rsVar.k;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        rs rsVar = this.l;
        if (rsVar != null) {
            rsVar.k();
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

    @Override // defpackage.i9
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.l.m();
    }

    @Override // defpackage.i9
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        rs rsVar = this.l;
        rsVar.m();
        rsVar.l();
    }

    public void setProgress(float f) {
        rs rsVar = this.l;
        rsVar.c.s(f);
        ct ctVar = rsVar.d;
        if (ctVar != null) {
            ctVar.s(f);
        }
        ct ctVar2 = rsVar.r;
        if (ctVar2 != null) {
            ctVar2.s(f);
        }
    }

    @Override // defpackage.i9
    public void setRadius(float f) {
        super.setRadius(f);
        rs rsVar = this.l;
        rsVar.e = f;
        rsVar.h(rsVar.n.d().a(f));
        rsVar.j.invalidateSelf();
        if (rsVar.i() || (rsVar.a.getPreventCornerOverlap() && !rsVar.c.o())) {
            rsVar.l();
        }
        if (rsVar.i()) {
            rsVar.m();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        rs rsVar = this.l;
        rsVar.l = colorStateList;
        RippleDrawable rippleDrawable = rsVar.p;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        ColorStateList q2 = zo.q(getContext(), i);
        rs rsVar = this.l;
        rsVar.l = q2;
        RippleDrawable rippleDrawable = rsVar.p;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(q2);
        }
    }

    @Override // defpackage.o20
    public void setShapeAppearanceModel(d20 d20Var) {
        setClipToOutline(d20Var.j(getBoundsAsRectF()));
        this.l.h(d20Var);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        rs rsVar = this.l;
        if (rsVar.o != colorStateList) {
            rsVar.o = colorStateList;
            ct ctVar = rsVar.d;
            ctVar.g.j = rsVar.i;
            ctVar.invalidateSelf();
            at atVar = ctVar.g;
            if (atVar.d != colorStateList) {
                atVar.d = colorStateList;
                ctVar.onStateChange(ctVar.getState());
            }
        }
        invalidate();
    }

    public void setStrokeWidth(int i) {
        rs rsVar = this.l;
        if (i != rsVar.i) {
            rsVar.i = i;
            ct ctVar = rsVar.d;
            ColorStateList colorStateList = rsVar.o;
            ctVar.g.j = i;
            ctVar.invalidateSelf();
            at atVar = ctVar.g;
            if (atVar.d != colorStateList) {
                atVar.d = colorStateList;
                ctVar.onStateChange(ctVar.getState());
            }
        }
        invalidate();
    }

    @Override // defpackage.i9
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        rs rsVar = this.l;
        rsVar.m();
        rsVar.l();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        rs rsVar = this.l;
        if (rsVar != null && rsVar.t && isEnabled()) {
            this.n = !this.n;
            refreshDrawableState();
            b();
            rsVar.f(this.n, true);
        }
    }

    @Override // defpackage.i9
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.l.c.r(colorStateList);
    }

    public void setStrokeColor(int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public void setOnCheckedChangeListener(ps psVar) {
    }
}
