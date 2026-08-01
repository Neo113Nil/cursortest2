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
import defpackage.a70;
import defpackage.b9;
import defpackage.bw;
import defpackage.dw;
import defpackage.f50;
import defpackage.kr;
import defpackage.la0;
import defpackage.mz;
import defpackage.o60;
import defpackage.q50;
import defpackage.qv;
import defpackage.sv;
import defpackage.v9;
import defpackage.xf;
import defpackage.y00;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class MaterialCardView extends v9 implements Checkable, q50 {
    public static final int[] p = {R.attr.state_checkable};
    public static final int[] q = {R.attr.state_checked};
    public static final int[] r = {com.moontiko.really.admiralcasino.R.attr.state_dragged};
    public static final int[] s = {R.attr.state_hovered};
    public final sv l;
    public final boolean m;
    public boolean n;
    public boolean o;

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        super(la0.j0(context, attributeSet, com.moontiko.really.admiralcasino.R.attr.materialCardViewStyle, com.moontiko.really.admiralcasino.R.style.Widget_MaterialComponents_CardView), attributeSet);
        a70 h;
        this.n = false;
        this.o = false;
        this.m = true;
        TypedArray O = la0.O(getContext(), attributeSet, y00.w, com.moontiko.really.admiralcasino.R.attr.materialCardViewStyle, com.moontiko.really.admiralcasino.R.style.Widget_MaterialComponents_CardView, new int[0]);
        sv svVar = new sv(this, attributeSet);
        this.l = svVar;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        dw dwVar = svVar.c;
        dwVar.r(cardBackgroundColor);
        svVar.b.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        svVar.l();
        MaterialCardView materialCardView = svVar.a;
        ColorStateList w = kr.w(materialCardView.getContext(), O, 11);
        svVar.o = w;
        if (w == null) {
            svVar.o = ColorStateList.valueOf(-1);
        }
        svVar.i = O.getDimensionPixelSize(12, 0);
        boolean z = O.getBoolean(0, false);
        svVar.t = z;
        materialCardView.setLongClickable(z);
        svVar.m = kr.w(materialCardView.getContext(), O, 6);
        svVar.g(kr.y(materialCardView.getContext(), O, 2));
        svVar.g = O.getDimensionPixelSize(5, 0);
        svVar.f = O.getDimensionPixelSize(4, 0);
        svVar.h = O.getInteger(3, 8388661);
        ColorStateList w2 = kr.w(materialCardView.getContext(), O, 7);
        svVar.l = w2;
        if (w2 == null) {
            svVar.l = ColorStateList.valueOf(xf.G(materialCardView.getContext(), b9.N(materialCardView, com.moontiko.really.admiralcasino.R.attr.colorControlHighlight)));
        }
        ColorStateList w3 = kr.w(materialCardView.getContext(), O, 1);
        w3 = w3 == null ? ColorStateList.valueOf(0) : w3;
        dw dwVar2 = svVar.d;
        dwVar2.r(w3);
        RippleDrawable rippleDrawable = svVar.p;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(svVar.l);
        }
        dwVar.q(materialCardView.getCardElevation());
        float f = svVar.i;
        ColorStateList colorStateList = svVar.o;
        dwVar2.g.j = f;
        dwVar2.invalidateSelf();
        bw bwVar = dwVar2.g;
        if (bwVar.d != colorStateList) {
            bwVar.d = colorStateList;
            dwVar2.onStateChange(dwVar2.getState());
        }
        materialCardView.setBackgroundInternal(svVar.d(dwVar));
        Drawable c = svVar.j() ? svVar.c() : dwVar2;
        svVar.j = c;
        materialCardView.setForeground(svVar.d(c));
        if (svVar.e == -1.0f && (h = a70.h(materialCardView.getContext(), O, 8)) != null) {
            o60 Y = kr.Y(materialCardView.getContext());
            dwVar.p(Y);
            dwVar2.p(Y);
            dw dwVar3 = svVar.r;
            if (dwVar3 != null) {
                dwVar3.p(Y);
            }
            svVar.h(h);
        }
        O.recycle();
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.l.c.getBounds());
        return rectF;
    }

    public final void b() {
        sv svVar;
        RippleDrawable rippleDrawable;
        if (Build.VERSION.SDK_INT <= 26 || (rippleDrawable = (svVar = this.l).p) == null) {
            return;
        }
        Rect bounds = rippleDrawable.getBounds();
        int i = bounds.bottom;
        svVar.p.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
        svVar.p.setBounds(bounds.left, bounds.top, bounds.right, i);
    }

    @Override // defpackage.v9
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

    @Override // defpackage.v9
    public int getContentPaddingBottom() {
        return this.l.b.bottom;
    }

    @Override // defpackage.v9
    public int getContentPaddingLeft() {
        return this.l.b.left;
    }

    @Override // defpackage.v9
    public int getContentPaddingRight() {
        return this.l.b.right;
    }

    @Override // defpackage.v9
    public int getContentPaddingTop() {
        return this.l.b.top;
    }

    public float getProgress() {
        return this.l.c.g.i;
    }

    @Override // defpackage.v9
    public float getRadius() {
        return this.l.c.k();
    }

    public ColorStateList getRippleColor() {
        return this.l.l;
    }

    public f50 getShapeAppearanceModel() {
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
        sv svVar = this.l;
        svVar.k();
        mz.J(this, svVar.c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 8);
        sv svVar = this.l;
        if (svVar != null && svVar.t) {
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
        sv svVar = this.l;
        accessibilityNodeInfo.setCheckable(svVar != null && svVar.t);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.n);
    }

    @Override // defpackage.v9, android.widget.FrameLayout, android.view.View
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
            sv svVar = this.l;
            if (!svVar.s) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                svVar.s = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // defpackage.v9
    public void setCardBackgroundColor(int i) {
        this.l.c.r(ColorStateList.valueOf(i));
    }

    @Override // defpackage.v9
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        sv svVar = this.l;
        svVar.c.q(svVar.a.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        dw dwVar = this.l.d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        dwVar.r(colorStateList);
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
        sv svVar = this.l;
        if (svVar.h != i) {
            svVar.h = i;
            MaterialCardView materialCardView = svVar.a;
            svVar.e(materialCardView.getMeasuredWidth(), materialCardView.getMeasuredHeight());
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
        this.l.g(mz.m(getContext(), i));
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
        sv svVar = this.l;
        svVar.m = colorStateList;
        Drawable drawable = svVar.k;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        sv svVar = this.l;
        if (svVar != null) {
            svVar.k();
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

    @Override // defpackage.v9
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.l.m();
    }

    @Override // defpackage.v9
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        sv svVar = this.l;
        svVar.m();
        svVar.l();
    }

    public void setProgress(float f) {
        sv svVar = this.l;
        svVar.c.s(f);
        dw dwVar = svVar.d;
        if (dwVar != null) {
            dwVar.s(f);
        }
        dw dwVar2 = svVar.r;
        if (dwVar2 != null) {
            dwVar2.s(f);
        }
    }

    @Override // defpackage.v9
    public void setRadius(float f) {
        super.setRadius(f);
        sv svVar = this.l;
        svVar.e = f;
        svVar.h(svVar.n.d().a(f));
        svVar.j.invalidateSelf();
        if (svVar.i() || (svVar.a.getPreventCornerOverlap() && !svVar.c.o())) {
            svVar.l();
        }
        if (svVar.i()) {
            svVar.m();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        sv svVar = this.l;
        svVar.l = colorStateList;
        RippleDrawable rippleDrawable = svVar.p;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        ColorStateList w = la0.w(getContext(), i);
        sv svVar = this.l;
        svVar.l = w;
        RippleDrawable rippleDrawable = svVar.p;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(w);
        }
    }

    @Override // defpackage.q50
    public void setShapeAppearanceModel(f50 f50Var) {
        setClipToOutline(f50Var.j(getBoundsAsRectF()));
        this.l.h(f50Var);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        sv svVar = this.l;
        if (svVar.o != colorStateList) {
            svVar.o = colorStateList;
            dw dwVar = svVar.d;
            dwVar.g.j = svVar.i;
            dwVar.invalidateSelf();
            bw bwVar = dwVar.g;
            if (bwVar.d != colorStateList) {
                bwVar.d = colorStateList;
                dwVar.onStateChange(dwVar.getState());
            }
        }
        invalidate();
    }

    public void setStrokeWidth(int i) {
        sv svVar = this.l;
        if (i != svVar.i) {
            svVar.i = i;
            dw dwVar = svVar.d;
            ColorStateList colorStateList = svVar.o;
            dwVar.g.j = i;
            dwVar.invalidateSelf();
            bw bwVar = dwVar.g;
            if (bwVar.d != colorStateList) {
                bwVar.d = colorStateList;
                dwVar.onStateChange(dwVar.getState());
            }
        }
        invalidate();
    }

    @Override // defpackage.v9
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        sv svVar = this.l;
        svVar.m();
        svVar.l();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        sv svVar = this.l;
        if (svVar != null && svVar.t && isEnabled()) {
            this.n = !this.n;
            refreshDrawableState();
            b();
            svVar.f(this.n, true);
        }
    }

    @Override // defpackage.v9
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.l.c.r(colorStateList);
    }

    public void setStrokeColor(int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public void setOnCheckedChangeListener(qv qvVar) {
    }
}
