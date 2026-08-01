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
import defpackage.d9;
import defpackage.dt;
import defpackage.ft;
import defpackage.g40;
import defpackage.j8;
import defpackage.l70;
import defpackage.ly;
import defpackage.n20;
import defpackage.op;
import defpackage.pt;
import defpackage.rt;
import defpackage.v30;
import defpackage.vw;
import defpackage.y20;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class MaterialCardView extends d9 implements Checkable, y20 {
    public static final int[] p = {R.attr.state_checkable};
    public static final int[] q = {R.attr.state_checked};
    public static final int[] r = {com.awerser.monnit.betplay.R.attr.state_dragged};
    public static final int[] s = {R.attr.state_hovered};
    public final ft l;
    public final boolean m;
    public boolean n;
    public boolean o;

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        super(op.Z(context, attributeSet, com.awerser.monnit.betplay.R.attr.materialCardViewStyle, com.awerser.monnit.betplay.R.style.Widget_MaterialComponents_CardView), attributeSet);
        g40 h;
        this.n = false;
        this.o = false;
        this.m = true;
        TypedArray Z = vw.Z(getContext(), attributeSet, ly.u, com.awerser.monnit.betplay.R.attr.materialCardViewStyle, com.awerser.monnit.betplay.R.style.Widget_MaterialComponents_CardView, new int[0]);
        ft ftVar = new ft(this, attributeSet);
        this.l = ftVar;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        rt rtVar = ftVar.c;
        rtVar.r(cardBackgroundColor);
        ftVar.b.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        ftVar.l();
        MaterialCardView materialCardView = ftVar.a;
        ColorStateList x = op.x(materialCardView.getContext(), Z, 11);
        ftVar.o = x;
        if (x == null) {
            ftVar.o = ColorStateList.valueOf(-1);
        }
        ftVar.i = Z.getDimensionPixelSize(12, 0);
        boolean z = Z.getBoolean(0, false);
        ftVar.t = z;
        materialCardView.setLongClickable(z);
        ftVar.m = op.x(materialCardView.getContext(), Z, 6);
        ftVar.g(op.A(materialCardView.getContext(), Z, 2));
        ftVar.g = Z.getDimensionPixelSize(5, 0);
        ftVar.f = Z.getDimensionPixelSize(4, 0);
        ftVar.h = Z.getInteger(3, 8388661);
        ColorStateList x2 = op.x(materialCardView.getContext(), Z, 7);
        ftVar.l = x2;
        if (x2 == null) {
            ftVar.l = ColorStateList.valueOf(j8.L(materialCardView.getContext(), l70.S(materialCardView, com.awerser.monnit.betplay.R.attr.colorControlHighlight)));
        }
        ColorStateList x3 = op.x(materialCardView.getContext(), Z, 1);
        x3 = x3 == null ? ColorStateList.valueOf(0) : x3;
        rt rtVar2 = ftVar.d;
        rtVar2.r(x3);
        RippleDrawable rippleDrawable = ftVar.p;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(ftVar.l);
        }
        rtVar.q(materialCardView.getCardElevation());
        float f = ftVar.i;
        ColorStateList colorStateList = ftVar.o;
        rtVar2.g.j = f;
        rtVar2.invalidateSelf();
        pt ptVar = rtVar2.g;
        if (ptVar.d != colorStateList) {
            ptVar.d = colorStateList;
            rtVar2.onStateChange(rtVar2.getState());
        }
        materialCardView.setBackgroundInternal(ftVar.d(rtVar));
        Drawable c = ftVar.j() ? ftVar.c() : rtVar2;
        ftVar.j = c;
        materialCardView.setForeground(ftVar.d(c));
        if (ftVar.e == -1.0f && (h = g40.h(materialCardView.getContext(), Z, 8)) != null) {
            v30 f0 = vw.f0(materialCardView.getContext());
            rtVar.p(f0);
            rtVar2.p(f0);
            rt rtVar3 = ftVar.r;
            if (rtVar3 != null) {
                rtVar3.p(f0);
            }
            ftVar.h(h);
        }
        Z.recycle();
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.l.c.getBounds());
        return rectF;
    }

    public final void b() {
        ft ftVar;
        RippleDrawable rippleDrawable;
        if (Build.VERSION.SDK_INT <= 26 || (rippleDrawable = (ftVar = this.l).p) == null) {
            return;
        }
        Rect bounds = rippleDrawable.getBounds();
        int i = bounds.bottom;
        ftVar.p.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
        ftVar.p.setBounds(bounds.left, bounds.top, bounds.right, i);
    }

    @Override // defpackage.d9
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

    @Override // defpackage.d9
    public int getContentPaddingBottom() {
        return this.l.b.bottom;
    }

    @Override // defpackage.d9
    public int getContentPaddingLeft() {
        return this.l.b.left;
    }

    @Override // defpackage.d9
    public int getContentPaddingRight() {
        return this.l.b.right;
    }

    @Override // defpackage.d9
    public int getContentPaddingTop() {
        return this.l.b.top;
    }

    public float getProgress() {
        return this.l.c.g.i;
    }

    @Override // defpackage.d9
    public float getRadius() {
        return this.l.c.k();
    }

    public ColorStateList getRippleColor() {
        return this.l.l;
    }

    public n20 getShapeAppearanceModel() {
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
        ft ftVar = this.l;
        ftVar.k();
        vw.j0(this, ftVar.c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 8);
        ft ftVar = this.l;
        if (ftVar != null && ftVar.t) {
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
        ft ftVar = this.l;
        accessibilityNodeInfo.setCheckable(ftVar != null && ftVar.t);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.n);
    }

    @Override // defpackage.d9, android.widget.FrameLayout, android.view.View
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
            ft ftVar = this.l;
            if (!ftVar.s) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                ftVar.s = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // defpackage.d9
    public void setCardBackgroundColor(int i) {
        this.l.c.r(ColorStateList.valueOf(i));
    }

    @Override // defpackage.d9
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        ft ftVar = this.l;
        ftVar.c.q(ftVar.a.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        rt rtVar = this.l.d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        rtVar.r(colorStateList);
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
        ft ftVar = this.l;
        if (ftVar.h != i) {
            ftVar.h = i;
            MaterialCardView materialCardView = ftVar.a;
            ftVar.e(materialCardView.getMeasuredWidth(), materialCardView.getMeasuredHeight());
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
        this.l.g(l70.p(getContext(), i));
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
        ft ftVar = this.l;
        ftVar.m = colorStateList;
        Drawable drawable = ftVar.k;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        ft ftVar = this.l;
        if (ftVar != null) {
            ftVar.k();
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

    @Override // defpackage.d9
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.l.m();
    }

    @Override // defpackage.d9
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        ft ftVar = this.l;
        ftVar.m();
        ftVar.l();
    }

    public void setProgress(float f) {
        ft ftVar = this.l;
        ftVar.c.s(f);
        rt rtVar = ftVar.d;
        if (rtVar != null) {
            rtVar.s(f);
        }
        rt rtVar2 = ftVar.r;
        if (rtVar2 != null) {
            rtVar2.s(f);
        }
    }

    @Override // defpackage.d9
    public void setRadius(float f) {
        super.setRadius(f);
        ft ftVar = this.l;
        ftVar.e = f;
        ftVar.h(ftVar.n.d().a(f));
        ftVar.j.invalidateSelf();
        if (ftVar.i() || (ftVar.a.getPreventCornerOverlap() && !ftVar.c.o())) {
            ftVar.l();
        }
        if (ftVar.i()) {
            ftVar.m();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        ft ftVar = this.l;
        ftVar.l = colorStateList;
        RippleDrawable rippleDrawable = ftVar.p;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        ColorStateList q2 = j8.q(getContext(), i);
        ft ftVar = this.l;
        ftVar.l = q2;
        RippleDrawable rippleDrawable = ftVar.p;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(q2);
        }
    }

    @Override // defpackage.y20
    public void setShapeAppearanceModel(n20 n20Var) {
        setClipToOutline(n20Var.j(getBoundsAsRectF()));
        this.l.h(n20Var);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        ft ftVar = this.l;
        if (ftVar.o != colorStateList) {
            ftVar.o = colorStateList;
            rt rtVar = ftVar.d;
            rtVar.g.j = ftVar.i;
            rtVar.invalidateSelf();
            pt ptVar = rtVar.g;
            if (ptVar.d != colorStateList) {
                ptVar.d = colorStateList;
                rtVar.onStateChange(rtVar.getState());
            }
        }
        invalidate();
    }

    public void setStrokeWidth(int i) {
        ft ftVar = this.l;
        if (i != ftVar.i) {
            ftVar.i = i;
            rt rtVar = ftVar.d;
            ColorStateList colorStateList = ftVar.o;
            rtVar.g.j = i;
            rtVar.invalidateSelf();
            pt ptVar = rtVar.g;
            if (ptVar.d != colorStateList) {
                ptVar.d = colorStateList;
                rtVar.onStateChange(rtVar.getState());
            }
        }
        invalidate();
    }

    @Override // defpackage.d9
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        ft ftVar = this.l;
        ftVar.m();
        ftVar.l();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        ft ftVar = this.l;
        if (ftVar != null && ftVar.t && isEnabled()) {
            this.n = !this.n;
            refreshDrawableState();
            b();
            ftVar.f(this.n, true);
        }
    }

    @Override // defpackage.d9
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.l.c.r(colorStateList);
    }

    public void setStrokeColor(int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public void setOnCheckedChangeListener(dt dtVar) {
    }
}
