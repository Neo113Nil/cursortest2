package com.google.android.material.card;

import F0.m;
import L0.f;
import L0.g;
import L0.j;
import L0.k;
import L0.v;
import Q0.a;
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
import p.AbstractC0255a;
import q0.AbstractC0257a;
import x0.C0312c;
import x0.InterfaceC0310a;
import z1.d;
import z1.l;

/* loaded from: classes.dex */
public class MaterialCardView extends AbstractC0255a implements Checkable, v {

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f1817l = {R.attr.state_checkable};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f1818m = {R.attr.state_checked};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f1819n = {com.winfour.neondrop.R.attr.state_dragged};
    public final C0312c h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1820j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1821k;

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.winfour.neondrop.R.attr.materialCardViewStyle, com.winfour.neondrop.R.style.Widget_MaterialComponents_CardView), attributeSet);
        this.f1820j = false;
        this.f1821k = false;
        this.i = true;
        TypedArray f2 = m.f(getContext(), attributeSet, AbstractC0257a.f3391o, com.winfour.neondrop.R.attr.materialCardViewStyle, com.winfour.neondrop.R.style.Widget_MaterialComponents_CardView, new int[0]);
        C0312c c0312c = new C0312c(this, attributeSet);
        this.h = c0312c;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        g gVar = c0312c.f4153c;
        gVar.l(cardBackgroundColor);
        c0312c.f4152b.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        c0312c.l();
        MaterialCardView materialCardView = c0312c.f4151a;
        ColorStateList v2 = d.v(materialCardView.getContext(), f2, 11);
        c0312c.f4161n = v2;
        if (v2 == null) {
            c0312c.f4161n = ColorStateList.valueOf(-1);
        }
        c0312c.h = f2.getDimensionPixelSize(12, 0);
        boolean z2 = f2.getBoolean(0, false);
        c0312c.f4166s = z2;
        materialCardView.setLongClickable(z2);
        c0312c.f4159l = d.v(materialCardView.getContext(), f2, 6);
        c0312c.g(d.y(materialCardView.getContext(), f2, 2));
        c0312c.f4155f = f2.getDimensionPixelSize(5, 0);
        c0312c.f4154e = f2.getDimensionPixelSize(4, 0);
        c0312c.f4156g = f2.getInteger(3, 8388661);
        ColorStateList v3 = d.v(materialCardView.getContext(), f2, 7);
        c0312c.f4158k = v3;
        if (v3 == null) {
            c0312c.f4158k = ColorStateList.valueOf(d.t(materialCardView, com.winfour.neondrop.R.attr.colorControlHighlight));
        }
        ColorStateList v4 = d.v(materialCardView.getContext(), f2, 1);
        g gVar2 = c0312c.d;
        gVar2.l(v4 == null ? ColorStateList.valueOf(0) : v4);
        int[] iArr = J0.a.f383a;
        RippleDrawable rippleDrawable = c0312c.f4162o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(c0312c.f4158k);
        }
        gVar.k(materialCardView.getCardElevation());
        float f3 = c0312c.h;
        ColorStateList colorStateList = c0312c.f4161n;
        gVar2.f433a.f425j = f3;
        gVar2.invalidateSelf();
        f fVar = gVar2.f433a;
        if (fVar.d != colorStateList) {
            fVar.d = colorStateList;
            gVar2.onStateChange(gVar2.getState());
        }
        materialCardView.setBackgroundInternal(c0312c.d(gVar));
        Drawable c2 = c0312c.j() ? c0312c.c() : gVar2;
        c0312c.i = c2;
        materialCardView.setForeground(c0312c.d(c2));
        f2.recycle();
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.h.f4153c.getBounds());
        return rectF;
    }

    public final void b() {
        C0312c c0312c;
        RippleDrawable rippleDrawable;
        if (Build.VERSION.SDK_INT <= 26 || (rippleDrawable = (c0312c = this.h).f4162o) == null) {
            return;
        }
        Rect bounds = rippleDrawable.getBounds();
        int i = bounds.bottom;
        c0312c.f4162o.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
        c0312c.f4162o.setBounds(bounds.left, bounds.top, bounds.right, i);
    }

    @Override // p.AbstractC0255a
    public ColorStateList getCardBackgroundColor() {
        return this.h.f4153c.f433a.f421c;
    }

    public ColorStateList getCardForegroundColor() {
        return this.h.d.f433a.f421c;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.h.f4157j;
    }

    public int getCheckedIconGravity() {
        return this.h.f4156g;
    }

    public int getCheckedIconMargin() {
        return this.h.f4154e;
    }

    public int getCheckedIconSize() {
        return this.h.f4155f;
    }

    public ColorStateList getCheckedIconTint() {
        return this.h.f4159l;
    }

    @Override // p.AbstractC0255a
    public int getContentPaddingBottom() {
        return this.h.f4152b.bottom;
    }

    @Override // p.AbstractC0255a
    public int getContentPaddingLeft() {
        return this.h.f4152b.left;
    }

    @Override // p.AbstractC0255a
    public int getContentPaddingRight() {
        return this.h.f4152b.right;
    }

    @Override // p.AbstractC0255a
    public int getContentPaddingTop() {
        return this.h.f4152b.top;
    }

    public float getProgress() {
        return this.h.f4153c.f433a.i;
    }

    @Override // p.AbstractC0255a
    public float getRadius() {
        return this.h.f4153c.g();
    }

    public ColorStateList getRippleColor() {
        return this.h.f4158k;
    }

    public k getShapeAppearanceModel() {
        return this.h.f4160m;
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.h.f4161n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.h.f4161n;
    }

    public int getStrokeWidth() {
        return this.h.h;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f1820j;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0312c c0312c = this.h;
        c0312c.k();
        l.s0(this, c0312c.f4153c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 3);
        C0312c c0312c = this.h;
        if (c0312c != null && c0312c.f4166s) {
            View.mergeDrawableStates(onCreateDrawableState, f1817l);
        }
        if (this.f1820j) {
            View.mergeDrawableStates(onCreateDrawableState, f1818m);
        }
        if (this.f1821k) {
            View.mergeDrawableStates(onCreateDrawableState, f1819n);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.f1820j);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        C0312c c0312c = this.h;
        accessibilityNodeInfo.setCheckable(c0312c != null && c0312c.f4166s);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.f1820j);
    }

    @Override // p.AbstractC0255a, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.h.e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.i) {
            C0312c c0312c = this.h;
            if (!c0312c.f4165r) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                c0312c.f4165r = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // p.AbstractC0255a
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.h.f4153c.l(colorStateList);
    }

    @Override // p.AbstractC0255a
    public void setCardElevation(float f2) {
        super.setCardElevation(f2);
        C0312c c0312c = this.h;
        c0312c.f4153c.k(c0312c.f4151a.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        g gVar = this.h.d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        gVar.l(colorStateList);
    }

    public void setCheckable(boolean z2) {
        this.h.f4166s = z2;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        if (this.f1820j != z2) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.h.g(drawable);
    }

    public void setCheckedIconGravity(int i) {
        C0312c c0312c = this.h;
        if (c0312c.f4156g != i) {
            c0312c.f4156g = i;
            MaterialCardView materialCardView = c0312c.f4151a;
            c0312c.e(materialCardView.getMeasuredWidth(), materialCardView.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(int i) {
        this.h.f4154e = i;
    }

    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.h.f4154e = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconResource(int i) {
        this.h.g(l.F(getContext(), i));
    }

    public void setCheckedIconSize(int i) {
        this.h.f4155f = i;
    }

    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.h.f4155f = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C0312c c0312c = this.h;
        c0312c.f4159l = colorStateList;
        Drawable drawable = c0312c.f4157j;
        if (drawable != null) {
            F.a.h(drawable, colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z2) {
        super.setClickable(z2);
        C0312c c0312c = this.h;
        if (c0312c != null) {
            c0312c.k();
        }
    }

    public void setDragged(boolean z2) {
        if (this.f1821k != z2) {
            this.f1821k = z2;
            refreshDrawableState();
            b();
            invalidate();
        }
    }

    @Override // p.AbstractC0255a
    public void setMaxCardElevation(float f2) {
        super.setMaxCardElevation(f2);
        this.h.m();
    }

    public void setOnCheckedChangeListener(InterfaceC0310a interfaceC0310a) {
    }

    @Override // p.AbstractC0255a
    public void setPreventCornerOverlap(boolean z2) {
        super.setPreventCornerOverlap(z2);
        C0312c c0312c = this.h;
        c0312c.m();
        c0312c.l();
    }

    public void setProgress(float f2) {
        C0312c c0312c = this.h;
        c0312c.f4153c.m(f2);
        g gVar = c0312c.d;
        if (gVar != null) {
            gVar.m(f2);
        }
        g gVar2 = c0312c.f4164q;
        if (gVar2 != null) {
            gVar2.m(f2);
        }
    }

    @Override // p.AbstractC0255a
    public void setRadius(float f2) {
        super.setRadius(f2);
        C0312c c0312c = this.h;
        j e2 = c0312c.f4160m.e();
        e2.f456e = new L0.a(f2);
        e2.f457f = new L0.a(f2);
        e2.f458g = new L0.a(f2);
        e2.h = new L0.a(f2);
        c0312c.h(e2.a());
        c0312c.i.invalidateSelf();
        if (c0312c.i() || (c0312c.f4151a.getPreventCornerOverlap() && !c0312c.f4153c.j())) {
            c0312c.l();
        }
        if (c0312c.i()) {
            c0312c.m();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C0312c c0312c = this.h;
        c0312c.f4158k = colorStateList;
        int[] iArr = J0.a.f383a;
        RippleDrawable rippleDrawable = c0312c.f4162o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        ColorStateList D2 = l.D(getContext(), i);
        C0312c c0312c = this.h;
        c0312c.f4158k = D2;
        int[] iArr = J0.a.f383a;
        RippleDrawable rippleDrawable = c0312c.f4162o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(D2);
        }
    }

    @Override // L0.v
    public void setShapeAppearanceModel(k kVar) {
        setClipToOutline(kVar.d(getBoundsAsRectF()));
        this.h.h(kVar);
    }

    public void setStrokeColor(int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public void setStrokeWidth(int i) {
        C0312c c0312c = this.h;
        if (i != c0312c.h) {
            c0312c.h = i;
            g gVar = c0312c.d;
            ColorStateList colorStateList = c0312c.f4161n;
            gVar.f433a.f425j = i;
            gVar.invalidateSelf();
            f fVar = gVar.f433a;
            if (fVar.d != colorStateList) {
                fVar.d = colorStateList;
                gVar.onStateChange(gVar.getState());
            }
        }
        invalidate();
    }

    @Override // p.AbstractC0255a
    public void setUseCompatPadding(boolean z2) {
        super.setUseCompatPadding(z2);
        C0312c c0312c = this.h;
        c0312c.m();
        c0312c.l();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        C0312c c0312c = this.h;
        if (c0312c != null && c0312c.f4166s && isEnabled()) {
            this.f1820j = !this.f1820j;
            refreshDrawableState();
            b();
            c0312c.f(this.f1820j, true);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        C0312c c0312c = this.h;
        if (c0312c.f4161n != colorStateList) {
            c0312c.f4161n = colorStateList;
            g gVar = c0312c.d;
            gVar.f433a.f425j = c0312c.h;
            gVar.invalidateSelf();
            f fVar = gVar.f433a;
            if (fVar.d != colorStateList) {
                fVar.d = colorStateList;
                gVar.onStateChange(gVar.getState());
            }
        }
        invalidate();
    }

    @Override // p.AbstractC0255a
    public void setCardBackgroundColor(int i) {
        this.h.f4153c.l(ColorStateList.valueOf(i));
    }
}
