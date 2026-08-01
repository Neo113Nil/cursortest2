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
import b4.d;
import b4.l;
import i2.o;
import o2.c0;
import o2.h;
import o2.j;
import o2.z;
import p.a;
import v0.f;
import x1.c;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class MaterialCardView extends a implements Checkable, z {

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f989q = {R.attr.state_checkable};

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f990r = {R.attr.state_checked};

    /* renamed from: s, reason: collision with root package name */
    public static final int[] f991s = {com.gdmhkmf.belbet.R.attr.state_dragged};

    /* renamed from: t, reason: collision with root package name */
    public static final int[] f992t = {R.attr.state_hovered};

    /* renamed from: m, reason: collision with root package name */
    public final c f993m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f994n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f995o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f996p;

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        super(u2.a.b(context, attributeSet, com.gdmhkmf.belbet.R.attr.materialCardViewStyle, com.gdmhkmf.belbet.R.style.Widget_MaterialComponents_CardView), attributeSet);
        c0 h;
        this.f995o = false;
        this.f996p = false;
        this.f994n = true;
        TypedArray e4 = o.e(getContext(), attributeSet, q1.a.f3157u, com.gdmhkmf.belbet.R.attr.materialCardViewStyle, com.gdmhkmf.belbet.R.style.Widget_MaterialComponents_CardView, new int[0]);
        c cVar = new c(this, attributeSet);
        this.f993m = cVar;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        j jVar = cVar.f3859c;
        jVar.r(cardBackgroundColor);
        cVar.f3858b.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        cVar.l();
        MaterialCardView materialCardView = cVar.f3857a;
        ColorStateList r4 = l.r(materialCardView.getContext(), e4, 11);
        cVar.f3868o = r4;
        if (r4 == null) {
            cVar.f3868o = ColorStateList.valueOf(-1);
        }
        cVar.i = e4.getDimensionPixelSize(12, 0);
        boolean z4 = e4.getBoolean(0, false);
        cVar.f3873t = z4;
        materialCardView.setLongClickable(z4);
        cVar.f3866m = l.r(materialCardView.getContext(), e4, 6);
        cVar.g(l.u(materialCardView.getContext(), e4, 2));
        cVar.f3862g = e4.getDimensionPixelSize(5, 0);
        cVar.f3861f = e4.getDimensionPixelSize(4, 0);
        cVar.h = e4.getInteger(3, 8388661);
        ColorStateList r5 = l.r(materialCardView.getContext(), e4, 7);
        cVar.f3865l = r5;
        if (r5 == null) {
            cVar.f3865l = ColorStateList.valueOf(l.U(materialCardView.getContext(), d.R(materialCardView, com.gdmhkmf.belbet.R.attr.colorControlHighlight)));
        }
        ColorStateList r6 = l.r(materialCardView.getContext(), e4, 1);
        r6 = r6 == null ? ColorStateList.valueOf(0) : r6;
        j jVar2 = cVar.d;
        jVar2.r(r6);
        RippleDrawable rippleDrawable = cVar.f3869p;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(cVar.f3865l);
        }
        jVar.q(materialCardView.getCardElevation());
        float f5 = cVar.i;
        ColorStateList colorStateList = cVar.f3868o;
        jVar2.f2955g.f2946j = f5;
        jVar2.invalidateSelf();
        h hVar = jVar2.f2955g;
        if (hVar.d != colorStateList) {
            hVar.d = colorStateList;
            jVar2.onStateChange(jVar2.getState());
        }
        materialCardView.setBackgroundInternal(cVar.d(jVar));
        Drawable c5 = cVar.j() ? cVar.c() : jVar2;
        cVar.f3863j = c5;
        materialCardView.setForeground(cVar.d(c5));
        if (cVar.f3860e == -1.0f && (h = c0.h(materialCardView.getContext(), e4, 8)) != null) {
            f X = l.X(materialCardView.getContext());
            jVar.p(X);
            jVar2.p(X);
            j jVar3 = cVar.f3871r;
            if (jVar3 != null) {
                jVar3.p(X);
            }
            cVar.h(h);
        }
        e4.recycle();
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f993m.f3859c.getBounds());
        return rectF;
    }

    public final void b() {
        c cVar;
        RippleDrawable rippleDrawable;
        if (Build.VERSION.SDK_INT <= 26 || (rippleDrawable = (cVar = this.f993m).f3869p) == null) {
            return;
        }
        Rect bounds = rippleDrawable.getBounds();
        int i = bounds.bottom;
        cVar.f3869p.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
        cVar.f3869p.setBounds(bounds.left, bounds.top, bounds.right, i);
    }

    @Override // p.a
    public ColorStateList getCardBackgroundColor() {
        return this.f993m.f3859c.f2955g.f2942c;
    }

    public ColorStateList getCardForegroundColor() {
        return this.f993m.d.f2955g.f2942c;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f993m.f3864k;
    }

    public int getCheckedIconGravity() {
        return this.f993m.h;
    }

    public int getCheckedIconMargin() {
        return this.f993m.f3861f;
    }

    public int getCheckedIconSize() {
        return this.f993m.f3862g;
    }

    public ColorStateList getCheckedIconTint() {
        return this.f993m.f3866m;
    }

    @Override // p.a
    public int getContentPaddingBottom() {
        return this.f993m.f3858b.bottom;
    }

    @Override // p.a
    public int getContentPaddingLeft() {
        return this.f993m.f3858b.left;
    }

    @Override // p.a
    public int getContentPaddingRight() {
        return this.f993m.f3858b.right;
    }

    @Override // p.a
    public int getContentPaddingTop() {
        return this.f993m.f3858b.top;
    }

    public float getProgress() {
        return this.f993m.f3859c.f2955g.i;
    }

    @Override // p.a
    public float getRadius() {
        return this.f993m.f3859c.k();
    }

    public ColorStateList getRippleColor() {
        return this.f993m.f3865l;
    }

    public o2.o getShapeAppearanceModel() {
        return this.f993m.f3867n.d();
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.f993m.f3868o;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f993m.f3868o;
    }

    public int getStrokeWidth() {
        return this.f993m.i;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f995o;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c cVar = this.f993m;
        cVar.k();
        l.f0(this, cVar.f3859c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 8);
        c cVar = this.f993m;
        if (cVar != null && cVar.f3873t) {
            View.mergeDrawableStates(onCreateDrawableState, f989q);
        }
        if (this.f995o) {
            View.mergeDrawableStates(onCreateDrawableState, f990r);
        }
        if (this.f996p) {
            View.mergeDrawableStates(onCreateDrawableState, f991s);
        }
        if (isDuplicateParentStateEnabled()) {
            if (isPressed()) {
                View.mergeDrawableStates(onCreateDrawableState, FrameLayout.PRESSED_STATE_SET);
            }
            if (isHovered()) {
                View.mergeDrawableStates(onCreateDrawableState, f992t);
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
        accessibilityEvent.setChecked(this.f995o);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        c cVar = this.f993m;
        accessibilityNodeInfo.setCheckable(cVar != null && cVar.f3873t);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.f995o);
    }

    @Override // p.a, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
        this.f993m.e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f994n) {
            c cVar = this.f993m;
            if (!cVar.f3872s) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                cVar.f3872s = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // p.a
    public void setCardBackgroundColor(int i) {
        this.f993m.f3859c.r(ColorStateList.valueOf(i));
    }

    @Override // p.a
    public void setCardElevation(float f5) {
        super.setCardElevation(f5);
        c cVar = this.f993m;
        cVar.f3859c.q(cVar.f3857a.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        j jVar = this.f993m.d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        jVar.r(colorStateList);
    }

    public void setCheckable(boolean z4) {
        this.f993m.f3873t = z4;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z4) {
        if (this.f995o != z4) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f993m.g(drawable);
    }

    public void setCheckedIconGravity(int i) {
        c cVar = this.f993m;
        if (cVar.h != i) {
            cVar.h = i;
            MaterialCardView materialCardView = cVar.f3857a;
            cVar.e(materialCardView.getMeasuredWidth(), materialCardView.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(int i) {
        this.f993m.f3861f = i;
    }

    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.f993m.f3861f = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconResource(int i) {
        this.f993m.g(d.y(getContext(), i));
    }

    public void setCheckedIconSize(int i) {
        this.f993m.f3862g = i;
    }

    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.f993m.f3862g = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        c cVar = this.f993m;
        cVar.f3866m = colorStateList;
        Drawable drawable = cVar.f3864k;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z4) {
        super.setClickable(z4);
        c cVar = this.f993m;
        if (cVar != null) {
            cVar.k();
        }
    }

    public void setDragged(boolean z4) {
        if (this.f996p != z4) {
            this.f996p = z4;
            refreshDrawableState();
            b();
            invalidate();
        }
    }

    @Override // p.a
    public void setMaxCardElevation(float f5) {
        super.setMaxCardElevation(f5);
        this.f993m.m();
    }

    @Override // p.a
    public void setPreventCornerOverlap(boolean z4) {
        super.setPreventCornerOverlap(z4);
        c cVar = this.f993m;
        cVar.m();
        cVar.l();
    }

    public void setProgress(float f5) {
        c cVar = this.f993m;
        cVar.f3859c.s(f5);
        j jVar = cVar.d;
        if (jVar != null) {
            jVar.s(f5);
        }
        j jVar2 = cVar.f3871r;
        if (jVar2 != null) {
            jVar2.s(f5);
        }
    }

    @Override // p.a
    public void setRadius(float f5) {
        super.setRadius(f5);
        c cVar = this.f993m;
        cVar.f3860e = f5;
        cVar.h(cVar.f3867n.d().a(f5));
        cVar.f3863j.invalidateSelf();
        if (cVar.i() || (cVar.f3857a.getPreventCornerOverlap() && !cVar.f3859c.o())) {
            cVar.l();
        }
        if (cVar.i()) {
            cVar.m();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        c cVar = this.f993m;
        cVar.f3865l = colorStateList;
        RippleDrawable rippleDrawable = cVar.f3869p;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        ColorStateList a5 = c0.c.a(getContext(), i);
        c cVar = this.f993m;
        cVar.f3865l = a5;
        RippleDrawable rippleDrawable = cVar.f3869p;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(a5);
        }
    }

    @Override // o2.z
    public void setShapeAppearanceModel(o2.o oVar) {
        setClipToOutline(oVar.j(getBoundsAsRectF()));
        this.f993m.h(oVar);
    }

    public void setStrokeColor(int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public void setStrokeWidth(int i) {
        c cVar = this.f993m;
        if (i != cVar.i) {
            cVar.i = i;
            j jVar = cVar.d;
            ColorStateList colorStateList = cVar.f3868o;
            jVar.f2955g.f2946j = i;
            jVar.invalidateSelf();
            h hVar = jVar.f2955g;
            if (hVar.d != colorStateList) {
                hVar.d = colorStateList;
                jVar.onStateChange(jVar.getState());
            }
        }
        invalidate();
    }

    @Override // p.a
    public void setUseCompatPadding(boolean z4) {
        super.setUseCompatPadding(z4);
        c cVar = this.f993m;
        cVar.m();
        cVar.l();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        c cVar = this.f993m;
        if (cVar != null && cVar.f3873t && isEnabled()) {
            this.f995o = !this.f995o;
            refreshDrawableState();
            b();
            cVar.f(this.f995o, true);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        c cVar = this.f993m;
        if (cVar.f3868o != colorStateList) {
            cVar.f3868o = colorStateList;
            j jVar = cVar.d;
            jVar.f2955g.f2946j = cVar.i;
            jVar.invalidateSelf();
            h hVar = jVar.f2955g;
            if (hVar.d != colorStateList) {
                hVar.d = colorStateList;
                jVar.onStateChange(jVar.getState());
            }
        }
        invalidate();
    }

    @Override // p.a
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f993m.f3859c.r(colorStateList);
    }

    public void setOnCheckedChangeListener(x1.a aVar) {
    }
}
