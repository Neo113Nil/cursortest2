package com.google.android.material.button;

import G0.m;
import K.S;
import M0.j;
import M0.k;
import M0.v;
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
import androidx.appcompat.widget.AppCompatButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import m1.g;
import s0.AbstractC0283a;
import u1.d;
import y0.a;
import y0.b;
import y0.c;

/* loaded from: classes.dex */
public class MaterialButton extends AppCompatButton implements Checkable, v {

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f1721r = {R.attr.state_checkable};

    /* renamed from: s, reason: collision with root package name */
    public static final int[] f1722s = {R.attr.state_checked};
    public final c d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f1723e;

    /* renamed from: f, reason: collision with root package name */
    public a f1724f;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f1725g;
    public ColorStateList h;
    public Drawable i;

    /* renamed from: j, reason: collision with root package name */
    public String f1726j;

    /* renamed from: k, reason: collision with root package name */
    public int f1727k;

    /* renamed from: l, reason: collision with root package name */
    public int f1728l;

    /* renamed from: m, reason: collision with root package name */
    public int f1729m;

    /* renamed from: n, reason: collision with root package name */
    public int f1730n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1731o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1732p;

    /* renamed from: q, reason: collision with root package name */
    public int f1733q;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(R0.a.a(context, attributeSet, com.glasspulse.glasspulse.R.attr.materialButtonStyle, com.glasspulse.glasspulse.R.style.Widget_MaterialComponents_Button), attributeSet, com.glasspulse.glasspulse.R.attr.materialButtonStyle);
        this.f1723e = new LinkedHashSet();
        this.f1731o = false;
        this.f1732p = false;
        Context context2 = getContext();
        TypedArray f2 = m.f(context2, attributeSet, AbstractC0283a.f3749j, com.glasspulse.glasspulse.R.attr.materialButtonStyle, com.glasspulse.glasspulse.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f1730n = f2.getDimensionPixelSize(12, 0);
        int i = f2.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f1725g = m.g(i, mode);
        this.h = d.C(getContext(), f2, 14);
        this.i = d.E(getContext(), f2, 10);
        this.f1733q = f2.getInteger(11, 1);
        this.f1727k = f2.getDimensionPixelSize(13, 0);
        c cVar = new c(this, k.b(context2, attributeSet, com.glasspulse.glasspulse.R.attr.materialButtonStyle, com.glasspulse.glasspulse.R.style.Widget_MaterialComponents_Button).a());
        this.d = cVar;
        cVar.f4211c = f2.getDimensionPixelOffset(1, 0);
        cVar.d = f2.getDimensionPixelOffset(2, 0);
        cVar.f4212e = f2.getDimensionPixelOffset(3, 0);
        cVar.f4213f = f2.getDimensionPixelOffset(4, 0);
        if (f2.hasValue(8)) {
            int dimensionPixelSize = f2.getDimensionPixelSize(8, -1);
            cVar.f4214g = dimensionPixelSize;
            float f3 = dimensionPixelSize;
            j e2 = cVar.f4210b.e();
            e2.f518e = new M0.a(f3);
            e2.f519f = new M0.a(f3);
            e2.f520g = new M0.a(f3);
            e2.h = new M0.a(f3);
            cVar.c(e2.a());
            cVar.f4221p = true;
        }
        cVar.h = f2.getDimensionPixelSize(20, 0);
        cVar.i = m.g(f2.getInt(7, -1), mode);
        cVar.f4215j = d.C(getContext(), f2, 6);
        cVar.f4216k = d.C(getContext(), f2, 19);
        cVar.f4217l = d.C(getContext(), f2, 16);
        cVar.f4222q = f2.getBoolean(5, false);
        cVar.f4225t = f2.getDimensionPixelSize(9, 0);
        cVar.f4223r = f2.getBoolean(21, true);
        WeakHashMap weakHashMap = S.f351a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (f2.hasValue(0)) {
            cVar.f4220o = true;
            setSupportBackgroundTintList(cVar.f4215j);
            setSupportBackgroundTintMode(cVar.i);
        } else {
            cVar.e();
        }
        setPaddingRelative(paddingStart + cVar.f4211c, paddingTop + cVar.f4212e, paddingEnd + cVar.d, paddingBottom + cVar.f4213f);
        f2.recycle();
        setCompoundDrawablePadding(this.f1730n);
        d(this.i != null);
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
        float f2 = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            f2 = Math.max(f2, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(f2);
    }

    public final boolean a() {
        c cVar = this.d;
        return cVar != null && cVar.f4222q;
    }

    public final boolean b() {
        c cVar = this.d;
        return (cVar == null || cVar.f4220o) ? false : true;
    }

    public final void c() {
        int i = this.f1733q;
        boolean z2 = true;
        if (i != 1 && i != 2) {
            z2 = false;
        }
        if (z2) {
            setCompoundDrawablesRelative(this.i, null, null, null);
            return;
        }
        if (i == 3 || i == 4) {
            setCompoundDrawablesRelative(null, null, this.i, null);
        } else if (i == 16 || i == 32) {
            setCompoundDrawablesRelative(null, this.i, null, null);
        }
    }

    public final void d(boolean z2) {
        Drawable drawable = this.i;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.i = mutate;
            D.a.h(mutate, this.h);
            PorterDuff.Mode mode = this.f1725g;
            if (mode != null) {
                D.a.i(this.i, mode);
            }
            int i = this.f1727k;
            if (i == 0) {
                i = this.i.getIntrinsicWidth();
            }
            int i2 = this.f1727k;
            if (i2 == 0) {
                i2 = this.i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.i;
            int i3 = this.f1728l;
            int i4 = this.f1729m;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.i.setVisible(true, z2);
        }
        if (z2) {
            c();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i5 = this.f1733q;
        if (((i5 == 1 || i5 == 2) && drawable3 != this.i) || (((i5 == 3 || i5 == 4) && drawable5 != this.i) || ((i5 == 16 || i5 == 32) && drawable4 != this.i))) {
            c();
        }
    }

    public final void e(int i, int i2) {
        if (this.i == null || getLayout() == null) {
            return;
        }
        int i3 = this.f1733q;
        if (!(i3 == 1 || i3 == 2) && i3 != 3 && i3 != 4) {
            if (i3 == 16 || i3 == 32) {
                this.f1728l = 0;
                if (i3 == 16) {
                    this.f1729m = 0;
                    d(false);
                    return;
                }
                int i4 = this.f1727k;
                if (i4 == 0) {
                    i4 = this.i.getIntrinsicHeight();
                }
                int max = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - i4) - this.f1730n) - getPaddingBottom()) / 2);
                if (this.f1729m != max) {
                    this.f1729m = max;
                    d(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f1729m = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i5 = this.f1733q;
        if (i5 == 1 || i5 == 3 || ((i5 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i5 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f1728l = 0;
            d(false);
            return;
        }
        int i6 = this.f1727k;
        if (i6 == 0) {
            i6 = this.i.getIntrinsicWidth();
        }
        int textLayoutWidth = i - getTextLayoutWidth();
        WeakHashMap weakHashMap = S.f351a;
        int paddingEnd = (((textLayoutWidth - getPaddingEnd()) - i6) - this.f1730n) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            paddingEnd /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.f1733q == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.f1728l != paddingEnd) {
            this.f1728l = paddingEnd;
            d(false);
        }
    }

    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.f1726j)) {
            return (a() ? CompoundButton.class : Button.class).getName();
        }
        return this.f1726j;
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
        if (b()) {
            return this.d.f4214g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.i;
    }

    public int getIconGravity() {
        return this.f1733q;
    }

    public int getIconPadding() {
        return this.f1730n;
    }

    public int getIconSize() {
        return this.f1727k;
    }

    public ColorStateList getIconTint() {
        return this.h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f1725g;
    }

    public int getInsetBottom() {
        return this.d.f4213f;
    }

    public int getInsetTop() {
        return this.d.f4212e;
    }

    public ColorStateList getRippleColor() {
        if (b()) {
            return this.d.f4217l;
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        if (b()) {
            return this.d.f4210b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (b()) {
            return this.d.f4216k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (b()) {
            return this.d.h;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public ColorStateList getSupportBackgroundTintList() {
        return b() ? this.d.f4215j : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return b() ? this.d.i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f1731o;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (b()) {
            d.e0(this, this.d.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (a()) {
            View.mergeDrawableStates(onCreateDrawableState, f1721r);
        }
        if (this.f1731o) {
            View.mergeDrawableStates(onCreateDrawableState, f1722s);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f1731o);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(this.f1731o);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.f732a);
        setChecked(bVar.f4208c);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f4208c = this.f1731o;
        return bVar;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.d.f4223r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.i != null) {
            if (this.i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f1726j = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!b()) {
            super.setBackgroundColor(i);
            return;
        }
        c cVar = this.d;
        if (cVar.b(false) != null) {
            cVar.b(false).setTint(i);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!b()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        c cVar = this.d;
        cVar.f4220o = true;
        ColorStateList colorStateList = cVar.f4215j;
        MaterialButton materialButton = cVar.f4209a;
        materialButton.setSupportBackgroundTintList(colorStateList);
        materialButton.setSupportBackgroundTintMode(cVar.i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? d.D(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z2) {
        if (b()) {
            this.d.f4222q = z2;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        if (a() && isEnabled() && this.f1731o != z2) {
            this.f1731o = z2;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z3 = this.f1731o;
                if (!materialButtonToggleGroup.f1739f) {
                    materialButtonToggleGroup.b(getId(), z3);
                }
            }
            if (this.f1732p) {
                return;
            }
            this.f1732p = true;
            Iterator it = this.f1723e.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            this.f1732p = false;
        }
    }

    public void setCornerRadius(int i) {
        if (b()) {
            c cVar = this.d;
            if (cVar.f4221p && cVar.f4214g == i) {
                return;
            }
            cVar.f4214g = i;
            cVar.f4221p = true;
            float f2 = i;
            j e2 = cVar.f4210b.e();
            e2.f518e = new M0.a(f2);
            e2.f519f = new M0.a(f2);
            e2.f520g = new M0.a(f2);
            e2.h = new M0.a(f2);
            cVar.c(e2.a());
        }
    }

    public void setCornerRadiusResource(int i) {
        if (b()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        if (b()) {
            this.d.b(false).i(f2);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.i != drawable) {
            this.i = drawable;
            d(true);
            e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.f1733q != i) {
            this.f1733q = i;
            e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.f1730n != i) {
            this.f1730n = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? d.D(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f1727k != i) {
            this.f1727k = i;
            d(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.h != colorStateList) {
            this.h = colorStateList;
            d(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f1725g != mode) {
            this.f1725g = mode;
            d(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(d.A(getContext(), i));
    }

    public void setInsetBottom(int i) {
        c cVar = this.d;
        cVar.d(cVar.f4212e, i);
    }

    public void setInsetTop(int i) {
        c cVar = this.d;
        cVar.d(i, cVar.f4213f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(a aVar) {
        this.f1724f = aVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z2) {
        a aVar = this.f1724f;
        if (aVar != null) {
            ((MaterialButtonToggleGroup) ((g) aVar).f3189a).invalidate();
        }
        super.setPressed(z2);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (b()) {
            c cVar = this.d;
            if (cVar.f4217l != colorStateList) {
                cVar.f4217l = colorStateList;
                MaterialButton materialButton = cVar.f4209a;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(K0.a.a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (b()) {
            setRippleColor(d.A(getContext(), i));
        }
    }

    @Override // M0.v
    public void setShapeAppearanceModel(k kVar) {
        if (!b()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.d.c(kVar);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z2) {
        if (b()) {
            c cVar = this.d;
            cVar.f4219n = z2;
            cVar.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (b()) {
            c cVar = this.d;
            if (cVar.f4216k != colorStateList) {
                cVar.f4216k = colorStateList;
                cVar.f();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (b()) {
            setStrokeColor(d.A(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (b()) {
            c cVar = this.d;
            if (cVar.h != i) {
                cVar.h = i;
                cVar.f();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (b()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!b()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        c cVar = this.d;
        if (cVar.f4215j != colorStateList) {
            cVar.f4215j = colorStateList;
            if (cVar.b(false) != null) {
                D.a.h(cVar.b(false), cVar.f4215j);
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!b()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        c cVar = this.d;
        if (cVar.i != mode) {
            cVar.i = mode;
            if (cVar.b(false) == null || cVar.i == null) {
                return;
            }
            D.a.i(cVar.b(false), cVar.i);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z2) {
        this.d.f4223r = z2;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f1731o);
    }
}
