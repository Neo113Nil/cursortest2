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
import e2.o;
import l2.h;
import l2.j;
import l2.m;
import l2.n;
import l2.y;
import p.a;
import w1.c;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class MaterialCardView extends a implements Checkable, y {

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f872q = {R.attr.state_checkable};

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f873r = {R.attr.state_checked};

    /* renamed from: s, reason: collision with root package name */
    public static final int[] f874s = {com.oriondriftchasers.arordrft.R.attr.state_dragged};

    /* renamed from: m, reason: collision with root package name */
    public final c f875m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f876n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f877o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f878p;

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        super(q2.a.a(context, attributeSet, com.oriondriftchasers.arordrft.R.attr.materialCardViewStyle, com.oriondriftchasers.arordrft.R.style.Widget_MaterialComponents_CardView), attributeSet);
        this.f877o = false;
        this.f878p = false;
        this.f876n = true;
        TypedArray f2 = o.f(getContext(), attributeSet, n1.a.f2824q, com.oriondriftchasers.arordrft.R.attr.materialCardViewStyle, com.oriondriftchasers.arordrft.R.style.Widget_MaterialComponents_CardView, new int[0]);
        c cVar = new c(this, attributeSet);
        this.f875m = cVar;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        j jVar = cVar.f3581c;
        jVar.q(cardBackgroundColor);
        cVar.f3580b.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        cVar.l();
        MaterialCardView materialCardView = cVar.f3579a;
        ColorStateList t2 = h.a.t(materialCardView.getContext(), f2, 11);
        cVar.f3590n = t2;
        if (t2 == null) {
            cVar.f3590n = ColorStateList.valueOf(-1);
        }
        cVar.f3585h = f2.getDimensionPixelSize(12, 0);
        boolean z3 = f2.getBoolean(0, false);
        cVar.f3595s = z3;
        materialCardView.setLongClickable(z3);
        cVar.f3588l = h.a.t(materialCardView.getContext(), f2, 6);
        cVar.g(h.a.y(materialCardView.getContext(), f2, 2));
        cVar.f3583f = f2.getDimensionPixelSize(5, 0);
        cVar.f3582e = f2.getDimensionPixelSize(4, 0);
        cVar.f3584g = f2.getInteger(3, 8388661);
        ColorStateList t3 = h.a.t(materialCardView.getContext(), f2, 7);
        cVar.f3587k = t3;
        if (t3 == null) {
            cVar.f3587k = ColorStateList.valueOf(a.y.A(materialCardView, com.oriondriftchasers.arordrft.R.attr.colorControlHighlight));
        }
        ColorStateList t4 = h.a.t(materialCardView.getContext(), f2, 1);
        t4 = t4 == null ? ColorStateList.valueOf(0) : t4;
        j jVar2 = cVar.d;
        jVar2.q(t4);
        RippleDrawable rippleDrawable = cVar.f3591o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(cVar.f3587k);
        }
        jVar.p(materialCardView.getCardElevation());
        float f4 = cVar.f3585h;
        ColorStateList colorStateList = cVar.f3590n;
        jVar2.f2598g.f2589k = f4;
        jVar2.invalidateSelf();
        h hVar = jVar2.f2598g;
        if (hVar.f2584e != colorStateList) {
            hVar.f2584e = colorStateList;
            jVar2.onStateChange(jVar2.getState());
        }
        materialCardView.setBackgroundInternal(cVar.d(jVar));
        Drawable c4 = cVar.j() ? cVar.c() : jVar2;
        cVar.i = c4;
        materialCardView.setForeground(cVar.d(c4));
        f2.recycle();
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f875m.f3581c.getBounds());
        return rectF;
    }

    public final void b() {
        c cVar;
        RippleDrawable rippleDrawable;
        if (Build.VERSION.SDK_INT <= 26 || (rippleDrawable = (cVar = this.f875m).f3591o) == null) {
            return;
        }
        Rect bounds = rippleDrawable.getBounds();
        int i = bounds.bottom;
        cVar.f3591o.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
        cVar.f3591o.setBounds(bounds.left, bounds.top, bounds.right, i);
    }

    @Override // p.a
    public ColorStateList getCardBackgroundColor() {
        return this.f875m.f3581c.f2598g.d;
    }

    public ColorStateList getCardForegroundColor() {
        return this.f875m.d.f2598g.d;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f875m.f3586j;
    }

    public int getCheckedIconGravity() {
        return this.f875m.f3584g;
    }

    public int getCheckedIconMargin() {
        return this.f875m.f3582e;
    }

    public int getCheckedIconSize() {
        return this.f875m.f3583f;
    }

    public ColorStateList getCheckedIconTint() {
        return this.f875m.f3588l;
    }

    @Override // p.a
    public int getContentPaddingBottom() {
        return this.f875m.f3580b.bottom;
    }

    @Override // p.a
    public int getContentPaddingLeft() {
        return this.f875m.f3580b.left;
    }

    @Override // p.a
    public int getContentPaddingRight() {
        return this.f875m.f3580b.right;
    }

    @Override // p.a
    public int getContentPaddingTop() {
        return this.f875m.f3580b.top;
    }

    public float getProgress() {
        return this.f875m.f3581c.f2598g.f2588j;
    }

    @Override // p.a
    public float getRadius() {
        return this.f875m.f3581c.k();
    }

    public ColorStateList getRippleColor() {
        return this.f875m.f3587k;
    }

    public n getShapeAppearanceModel() {
        return this.f875m.f3589m;
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.f875m.f3590n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f875m.f3590n;
    }

    public int getStrokeWidth() {
        return this.f875m.f3585h;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f877o;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c cVar = this.f875m;
        cVar.k();
        h.a.k0(this, cVar.f3581c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 3);
        c cVar = this.f875m;
        if (cVar != null && cVar.f3595s) {
            View.mergeDrawableStates(onCreateDrawableState, f872q);
        }
        if (this.f877o) {
            View.mergeDrawableStates(onCreateDrawableState, f873r);
        }
        if (this.f878p) {
            View.mergeDrawableStates(onCreateDrawableState, f874s);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.f877o);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        c cVar = this.f875m;
        accessibilityNodeInfo.setCheckable(cVar != null && cVar.f3595s);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.f877o);
    }

    @Override // p.a, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
        this.f875m.e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f876n) {
            c cVar = this.f875m;
            if (!cVar.f3594r) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                cVar.f3594r = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // p.a
    public void setCardBackgroundColor(int i) {
        this.f875m.f3581c.q(ColorStateList.valueOf(i));
    }

    @Override // p.a
    public void setCardElevation(float f2) {
        super.setCardElevation(f2);
        c cVar = this.f875m;
        cVar.f3581c.p(cVar.f3579a.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        j jVar = this.f875m.d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        jVar.q(colorStateList);
    }

    public void setCheckable(boolean z3) {
        this.f875m.f3595s = z3;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z3) {
        if (this.f877o != z3) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f875m.g(drawable);
    }

    public void setCheckedIconGravity(int i) {
        c cVar = this.f875m;
        if (cVar.f3584g != i) {
            cVar.f3584g = i;
            MaterialCardView materialCardView = cVar.f3579a;
            cVar.e(materialCardView.getMeasuredWidth(), materialCardView.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(int i) {
        this.f875m.f3582e = i;
    }

    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.f875m.f3582e = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconResource(int i) {
        this.f875m.g(h.a.x(getContext(), i));
    }

    public void setCheckedIconSize(int i) {
        this.f875m.f3583f = i;
    }

    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.f875m.f3583f = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        c cVar = this.f875m;
        cVar.f3588l = colorStateList;
        Drawable drawable = cVar.f3586j;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z3) {
        super.setClickable(z3);
        c cVar = this.f875m;
        if (cVar != null) {
            cVar.k();
        }
    }

    public void setDragged(boolean z3) {
        if (this.f878p != z3) {
            this.f878p = z3;
            refreshDrawableState();
            b();
            invalidate();
        }
    }

    @Override // p.a
    public void setMaxCardElevation(float f2) {
        super.setMaxCardElevation(f2);
        this.f875m.m();
    }

    @Override // p.a
    public void setPreventCornerOverlap(boolean z3) {
        super.setPreventCornerOverlap(z3);
        c cVar = this.f875m;
        cVar.m();
        cVar.l();
    }

    public void setProgress(float f2) {
        c cVar = this.f875m;
        cVar.f3581c.r(f2);
        j jVar = cVar.d;
        if (jVar != null) {
            jVar.r(f2);
        }
        j jVar2 = cVar.f3593q;
        if (jVar2 != null) {
            jVar2.r(f2);
        }
    }

    @Override // p.a
    public void setRadius(float f2) {
        super.setRadius(f2);
        c cVar = this.f875m;
        m g4 = cVar.f3589m.g();
        g4.f2621e = new l2.a(f2);
        g4.f2622f = new l2.a(f2);
        g4.f2623g = new l2.a(f2);
        g4.f2624h = new l2.a(f2);
        cVar.h(g4.a());
        cVar.i.invalidateSelf();
        if (cVar.i() || (cVar.f3579a.getPreventCornerOverlap() && !cVar.f3581c.n())) {
            cVar.l();
        }
        if (cVar.i()) {
            cVar.m();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        c cVar = this.f875m;
        cVar.f3587k = colorStateList;
        RippleDrawable rippleDrawable = cVar.f3591o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        ColorStateList B = a.y.B(getContext(), i);
        c cVar = this.f875m;
        cVar.f3587k = B;
        RippleDrawable rippleDrawable = cVar.f3591o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(B);
        }
    }

    @Override // l2.y
    public void setShapeAppearanceModel(n nVar) {
        setClipToOutline(nVar.f(getBoundsAsRectF()));
        this.f875m.h(nVar);
    }

    public void setStrokeColor(int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public void setStrokeWidth(int i) {
        c cVar = this.f875m;
        if (i != cVar.f3585h) {
            cVar.f3585h = i;
            j jVar = cVar.d;
            ColorStateList colorStateList = cVar.f3590n;
            jVar.f2598g.f2589k = i;
            jVar.invalidateSelf();
            h hVar = jVar.f2598g;
            if (hVar.f2584e != colorStateList) {
                hVar.f2584e = colorStateList;
                jVar.onStateChange(jVar.getState());
            }
        }
        invalidate();
    }

    @Override // p.a
    public void setUseCompatPadding(boolean z3) {
        super.setUseCompatPadding(z3);
        c cVar = this.f875m;
        cVar.m();
        cVar.l();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        c cVar = this.f875m;
        if (cVar != null && cVar.f3595s && isEnabled()) {
            this.f877o = !this.f877o;
            refreshDrawableState();
            b();
            cVar.f(this.f877o, true);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        c cVar = this.f875m;
        if (cVar.f3590n != colorStateList) {
            cVar.f3590n = colorStateList;
            j jVar = cVar.d;
            jVar.f2598g.f2589k = cVar.f3585h;
            jVar.invalidateSelf();
            h hVar = jVar.f2598g;
            if (hVar.f2584e != colorStateList) {
                hVar.f2584e = colorStateList;
                jVar.onStateChange(jVar.getState());
            }
        }
        invalidate();
    }

    @Override // p.a
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f875m.f3581c.q(colorStateList);
    }

    public void setOnCheckedChangeListener(w1.a aVar) {
    }
}
