package com.google.android.material.button;

import C3.j;
import C3.v;
import D.y;
import H3.a;
import O.X;
import W2.e;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import com.bumptech.glide.d;
import com.bumptech.glide.f;
import com.icefishing.icefishingliveapp.C5284R;
import i3.AbstractC4576a;
import i8.m;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import m.C4753p;
import o3.C4833b;
import o3.C4834c;
import o3.InterfaceC4832a;
import w3.k;

/* loaded from: classes2.dex */
public class MaterialButton extends C4753p implements Checkable, v {

    /* renamed from: K, reason: collision with root package name */
    public static final int[] f36046K = {R.attr.state_checkable};

    /* renamed from: L, reason: collision with root package name */
    public static final int[] f36047L = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f36048A;

    /* renamed from: B, reason: collision with root package name */
    public Drawable f36049B;

    /* renamed from: C, reason: collision with root package name */
    public String f36050C;

    /* renamed from: D, reason: collision with root package name */
    public int f36051D;

    /* renamed from: E, reason: collision with root package name */
    public int f36052E;

    /* renamed from: F, reason: collision with root package name */
    public int f36053F;

    /* renamed from: G, reason: collision with root package name */
    public int f36054G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f36055H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f36056I;
    public int J;

    /* renamed from: w, reason: collision with root package name */
    public final C4834c f36057w;

    /* renamed from: x, reason: collision with root package name */
    public final LinkedHashSet f36058x;

    /* renamed from: y, reason: collision with root package name */
    public InterfaceC4832a f36059y;

    /* renamed from: z, reason: collision with root package name */
    public PorterDuff.Mode f36060z;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, C5284R.attr.materialButtonStyle, C5284R.style.Widget_MaterialComponents_Button), attributeSet, C5284R.attr.materialButtonStyle);
        this.f36058x = new LinkedHashSet();
        this.f36055H = false;
        this.f36056I = false;
        Context context2 = getContext();
        TypedArray f6 = k.f(context2, attributeSet, AbstractC4576a.f38300j, C5284R.attr.materialButtonStyle, C5284R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f36054G = f6.getDimensionPixelSize(12, 0);
        int i = f6.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f36060z = k.g(i, mode);
        this.f36048A = d.o(getContext(), f6, 14);
        this.f36049B = d.r(getContext(), f6, 10);
        this.J = f6.getInteger(11, 1);
        this.f36051D = f6.getDimensionPixelSize(13, 0);
        C4834c c4834c = new C4834c(this, C3.k.b(context2, attributeSet, C5284R.attr.materialButtonStyle, C5284R.style.Widget_MaterialComponents_Button).a());
        this.f36057w = c4834c;
        c4834c.f39705c = f6.getDimensionPixelOffset(1, 0);
        c4834c.f39706d = f6.getDimensionPixelOffset(2, 0);
        c4834c.f39707e = f6.getDimensionPixelOffset(3, 0);
        c4834c.f39708f = f6.getDimensionPixelOffset(4, 0);
        if (f6.hasValue(8)) {
            int dimensionPixelSize = f6.getDimensionPixelSize(8, -1);
            c4834c.f39709g = dimensionPixelSize;
            float f9 = dimensionPixelSize;
            j e6 = c4834c.f39704b.e();
            e6.f425e = new C3.a(f9);
            e6.f426f = new C3.a(f9);
            e6.f427g = new C3.a(f9);
            e6.f428h = new C3.a(f9);
            c4834c.c(e6.a());
            c4834c.f39717p = true;
        }
        c4834c.f39710h = f6.getDimensionPixelSize(20, 0);
        c4834c.i = k.g(f6.getInt(7, -1), mode);
        c4834c.f39711j = d.o(getContext(), f6, 6);
        c4834c.f39712k = d.o(getContext(), f6, 19);
        c4834c.f39713l = d.o(getContext(), f6, 16);
        c4834c.f39718q = f6.getBoolean(5, false);
        c4834c.f39721t = f6.getDimensionPixelSize(9, 0);
        c4834c.f39719r = f6.getBoolean(21, true);
        WeakHashMap weakHashMap = X.f2240a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (f6.hasValue(0)) {
            c4834c.f39716o = true;
            setSupportBackgroundTintList(c4834c.f39711j);
            setSupportBackgroundTintMode(c4834c.i);
        } else {
            c4834c.e();
        }
        setPaddingRelative(paddingStart + c4834c.f39705c, paddingTop + c4834c.f39707e, paddingEnd + c4834c.f39706d, paddingBottom + c4834c.f39708f);
        f6.recycle();
        setCompoundDrawablePadding(this.f36054G);
        c(this.f36049B != null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f6 = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            f6 = Math.max(f6, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(f6);
    }

    public final boolean a() {
        C4834c c4834c = this.f36057w;
        return (c4834c == null || c4834c.f39716o) ? false : true;
    }

    public final void b() {
        int i = this.J;
        boolean z8 = true;
        if (i != 1 && i != 2) {
            z8 = false;
        }
        if (z8) {
            setCompoundDrawablesRelative(this.f36049B, null, null, null);
            return;
        }
        if (i == 3 || i == 4) {
            setCompoundDrawablesRelative(null, null, this.f36049B, null);
        } else if (i == 16 || i == 32) {
            setCompoundDrawablesRelative(null, this.f36049B, null, null);
        }
    }

    public final void c(boolean z8) {
        Drawable drawable = this.f36049B;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f36049B = mutate;
            H.a.h(mutate, this.f36048A);
            PorterDuff.Mode mode = this.f36060z;
            if (mode != null) {
                H.a.i(this.f36049B, mode);
            }
            int i = this.f36051D;
            if (i == 0) {
                i = this.f36049B.getIntrinsicWidth();
            }
            int i4 = this.f36051D;
            if (i4 == 0) {
                i4 = this.f36049B.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f36049B;
            int i9 = this.f36052E;
            int i10 = this.f36053F;
            drawable2.setBounds(i9, i10, i + i9, i4 + i10);
            this.f36049B.setVisible(true, z8);
        }
        if (z8) {
            b();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i11 = this.J;
        if (((i11 == 1 || i11 == 2) && drawable3 != this.f36049B) || (((i11 == 3 || i11 == 4) && drawable5 != this.f36049B) || ((i11 == 16 || i11 == 32) && drawable4 != this.f36049B))) {
            b();
        }
    }

    public final void d(int i, int i4) {
        if (this.f36049B == null || getLayout() == null) {
            return;
        }
        int i9 = this.J;
        if (!(i9 == 1 || i9 == 2) && i9 != 3 && i9 != 4) {
            if (i9 == 16 || i9 == 32) {
                this.f36052E = 0;
                if (i9 == 16) {
                    this.f36053F = 0;
                    c(false);
                    return;
                }
                int i10 = this.f36051D;
                if (i10 == 0) {
                    i10 = this.f36049B.getIntrinsicHeight();
                }
                int max = Math.max(0, (((((i4 - getTextHeight()) - getPaddingTop()) - i10) - this.f36054G) - getPaddingBottom()) / 2);
                if (this.f36053F != max) {
                    this.f36053F = max;
                    c(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f36053F = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i11 = this.J;
        if (i11 == 1 || i11 == 3 || ((i11 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i11 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f36052E = 0;
            c(false);
            return;
        }
        int i12 = this.f36051D;
        if (i12 == 0) {
            i12 = this.f36049B.getIntrinsicWidth();
        }
        int textLayoutWidth = i - getTextLayoutWidth();
        WeakHashMap weakHashMap = X.f2240a;
        int paddingEnd = (((textLayoutWidth - getPaddingEnd()) - i12) - this.f36054G) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            paddingEnd /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.J == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.f36052E != paddingEnd) {
            this.f36052E = paddingEnd;
            c(false);
        }
    }

    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.f36050C)) {
            return this.f36050C;
        }
        C4834c c4834c = this.f36057w;
        return ((c4834c == null || !c4834c.f39718q) ? Button.class : CompoundButton.class).getName();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (a()) {
            return this.f36057w.f39709g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f36049B;
    }

    public int getIconGravity() {
        return this.J;
    }

    public int getIconPadding() {
        return this.f36054G;
    }

    public int getIconSize() {
        return this.f36051D;
    }

    public ColorStateList getIconTint() {
        return this.f36048A;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f36060z;
    }

    public int getInsetBottom() {
        return this.f36057w.f39708f;
    }

    public int getInsetTop() {
        return this.f36057w.f39707e;
    }

    public ColorStateList getRippleColor() {
        if (a()) {
            return this.f36057w.f39713l;
        }
        return null;
    }

    public C3.k getShapeAppearanceModel() {
        if (a()) {
            return this.f36057w.f39704b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (a()) {
            return this.f36057w.f39712k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (a()) {
            return this.f36057w.f39710h;
        }
        return 0;
    }

    @Override // m.C4753p
    public ColorStateList getSupportBackgroundTintList() {
        return a() ? this.f36057w.f39711j : super.getSupportBackgroundTintList();
    }

    @Override // m.C4753p
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return a() ? this.f36057w.i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f36055H;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (a()) {
            e.p(this, this.f36057w.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        C4834c c4834c = this.f36057w;
        if (c4834c != null && c4834c.f39718q) {
            View.mergeDrawableStates(onCreateDrawableState, f36046K);
        }
        if (this.f36055H) {
            View.mergeDrawableStates(onCreateDrawableState, f36047L);
        }
        return onCreateDrawableState;
    }

    @Override // m.C4753p, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f36055H);
    }

    @Override // m.C4753p, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        C4834c c4834c = this.f36057w;
        accessibilityNodeInfo.setCheckable(c4834c != null && c4834c.f39718q);
        accessibilityNodeInfo.setChecked(this.f36055H);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // m.C4753p, android.widget.TextView, android.view.View
    public final void onLayout(boolean z8, int i, int i4, int i9, int i10) {
        super.onLayout(z8, i, i4, i9, i10);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C4833b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C4833b c4833b = (C4833b) parcelable;
        super.onRestoreInstanceState(c4833b.f3318n);
        setChecked(c4833b.f39702v);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        C4833b c4833b = new C4833b(super.onSaveInstanceState());
        c4833b.f39702v = this.f36055H;
        return c4833b;
    }

    @Override // m.C4753p, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i4, int i9) {
        super.onTextChanged(charSequence, i, i4, i9);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f36057w.f39719r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f36049B != null) {
            if (this.f36049B.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f36050C = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!a()) {
            super.setBackgroundColor(i);
            return;
        }
        C4834c c4834c = this.f36057w;
        if (c4834c.b(false) != null) {
            c4834c.b(false).setTint(i);
        }
    }

    @Override // m.C4753p, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!a()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        C4834c c4834c = this.f36057w;
        c4834c.f39716o = true;
        ColorStateList colorStateList = c4834c.f39711j;
        MaterialButton materialButton = c4834c.f39703a;
        materialButton.setSupportBackgroundTintList(colorStateList);
        materialButton.setSupportBackgroundTintMode(c4834c.i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // m.C4753p, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? f.h(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z8) {
        if (a()) {
            this.f36057w.f39718q = z8;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z8) {
        C4834c c4834c = this.f36057w;
        if (c4834c == null || !c4834c.f39718q || !isEnabled() || this.f36055H == z8) {
            return;
        }
        this.f36055H = z8;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z9 = this.f36055H;
            if (!materialButtonToggleGroup.f36070y) {
                materialButtonToggleGroup.b(getId(), z9);
            }
        }
        if (this.f36056I) {
            return;
        }
        this.f36056I = true;
        Iterator it = this.f36058x.iterator();
        if (it.hasNext()) {
            throw y.h(it);
        }
        this.f36056I = false;
    }

    public void setCornerRadius(int i) {
        if (a()) {
            C4834c c4834c = this.f36057w;
            if (c4834c.f39717p && c4834c.f39709g == i) {
                return;
            }
            c4834c.f39709g = i;
            c4834c.f39717p = true;
            float f6 = i;
            j e6 = c4834c.f39704b.e();
            e6.f425e = new C3.a(f6);
            e6.f426f = new C3.a(f6);
            e6.f427g = new C3.a(f6);
            e6.f428h = new C3.a(f6);
            c4834c.c(e6.a());
        }
    }

    public void setCornerRadiusResource(int i) {
        if (a()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f6) {
        super.setElevation(f6);
        if (a()) {
            this.f36057w.b(false).i(f6);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f36049B != drawable) {
            this.f36049B = drawable;
            c(true);
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.J != i) {
            this.J = i;
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.f36054G != i) {
            this.f36054G = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? f.h(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f36051D != i) {
            this.f36051D = i;
            c(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f36048A != colorStateList) {
            this.f36048A = colorStateList;
            c(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f36060z != mode) {
            this.f36060z = mode;
            c(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(E.e.c(getContext(), i));
    }

    public void setInsetBottom(int i) {
        C4834c c4834c = this.f36057w;
        c4834c.d(c4834c.f39707e, i);
    }

    public void setInsetTop(int i) {
        C4834c c4834c = this.f36057w;
        c4834c.d(i, c4834c.f39708f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(InterfaceC4832a interfaceC4832a) {
        this.f36059y = interfaceC4832a;
    }

    @Override // android.view.View
    public void setPressed(boolean z8) {
        InterfaceC4832a interfaceC4832a = this.f36059y;
        if (interfaceC4832a != null) {
            ((MaterialButtonToggleGroup) ((m) interfaceC4832a).f38384n).invalidate();
        }
        super.setPressed(z8);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (a()) {
            C4834c c4834c = this.f36057w;
            if (c4834c.f39713l != colorStateList) {
                c4834c.f39713l = colorStateList;
                MaterialButton materialButton = c4834c.f39703a;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(A3.a.a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (a()) {
            setRippleColor(E.e.c(getContext(), i));
        }
    }

    @Override // C3.v
    public void setShapeAppearanceModel(C3.k kVar) {
        if (!a()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f36057w.c(kVar);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z8) {
        if (a()) {
            C4834c c4834c = this.f36057w;
            c4834c.f39715n = z8;
            c4834c.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (a()) {
            C4834c c4834c = this.f36057w;
            if (c4834c.f39712k != colorStateList) {
                c4834c.f39712k = colorStateList;
                c4834c.f();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (a()) {
            setStrokeColor(E.e.c(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (a()) {
            C4834c c4834c = this.f36057w;
            if (c4834c.f39710h != i) {
                c4834c.f39710h = i;
                c4834c.f();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (a()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // m.C4753p
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!a()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        C4834c c4834c = this.f36057w;
        if (c4834c.f39711j != colorStateList) {
            c4834c.f39711j = colorStateList;
            if (c4834c.b(false) != null) {
                H.a.h(c4834c.b(false), c4834c.f39711j);
            }
        }
    }

    @Override // m.C4753p
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!a()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        C4834c c4834c = this.f36057w;
        if (c4834c.i != mode) {
            c4834c.i = mode;
            if (c4834c.b(false) == null || c4834c.i == null) {
                return;
            }
            H.a.i(c4834c.b(false), c4834c.i);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z8) {
        this.f36057w.f39719r = z8;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f36055H);
    }
}
